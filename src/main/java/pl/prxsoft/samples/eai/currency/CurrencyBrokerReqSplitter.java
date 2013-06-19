package pl.prxsoft.samples.eai.currency;

import org.springframework.integration.annotation.Splitter;
import pl.prxsoft.samples.eai.currency.model.CurrencyBrokerRequestType;
import pl.prxsoft.samples.eai.currency.model.CurrencyType;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Piotr Maśko
 * Date: 18.06.13
 * Time: 11:03
 */

public class CurrencyBrokerReqSplitter {

  @Splitter
  public List<CurrencyType> splitToConvertedCurrencies(CurrencyBrokerRequestType requestType) {
    return requestType.getCurrencies().getCurrency();
  }
}
