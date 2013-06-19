package pl.prxsoft.samples.eai.currency;

import com.google.common.base.Function;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import org.springframework.integration.annotation.Transformer;
import pl.prxsoft.samples.eai.currency.model.CurrenciesType;
import pl.prxsoft.samples.eai.currency.model.CurrencyBrokerRequestType;
import pl.prxsoft.samples.eai.currency.model.CurrencyType;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: pmasko
 * Date: 17.06.2013
 * Time: 23:38
 */
public class CurrencyToRequestSummer {

  @Transformer
  public CurrencyBrokerRequestType sumUpCurrencies(CurrencyBrokerRequestType brokerRequestType) {
    Multimap<String, CurrencyType> multimap = Multimaps.index(brokerRequestType.getCurrencies().getCurrency(), new Function<CurrencyType, String>() {
      @Override
      public String apply( pl.prxsoft.samples.eai.currency.model.CurrencyType input) {
        return input.getToCurrency().toUpperCase().trim();
      }
    });
    Multimap<String, BigDecimal> decimalMultimap = Multimaps.transformEntries(multimap, new Maps.EntryTransformer<String, CurrencyType, BigDecimal>() {
      @Override
      public BigDecimal transformEntry( java.lang.String key,  pl.prxsoft.samples.eai.currency.model.CurrencyType value) {
        return value.getAmount();
      }
    });


    CurrenciesType currenciesType = new CurrenciesType();

    List<CurrencyType> currencyTypeList = currenciesType.getCurrency();
    for (String key : decimalMultimap.keySet()) {
      BigDecimal value = BigDecimal.ZERO;
      for (BigDecimal v : decimalMultimap.get(key)) {
        value = value.add(v);
      }

      CurrencyType currencyType = new CurrencyType();
      currencyType.setAmount(value);
      currencyType.setToCurrency(key);
      currencyTypeList.add(currencyType);
    }

    brokerRequestType.setCurrencies(currenciesType);
    return brokerRequestType;
  }

}
