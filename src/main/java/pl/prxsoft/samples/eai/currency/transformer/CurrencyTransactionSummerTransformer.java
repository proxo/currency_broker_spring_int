package pl.prxsoft.samples.eai.currency.transformer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.Message;
import org.springframework.integration.annotation.Transformer;
import org.springframework.stereotype.Component;
import pl.prxsoft.samples.eai.currency.model.CurrencyBrokerRequestType;
import pl.prxsoft.samples.eai.currency.model.CurrencyBrokerResponseType;
import pl.prxsoft.samples.eai.currency.model.CurrencyType;

import java.math.BigDecimal;
import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: Piotr Maśko
 * Date: 19.06.13
 * Time: 16:16
 */
@Component("transactionSummerTransformer")
public class CurrencyTransactionSummerTransformer {

  private static final Logger LOGGER = LoggerFactory.getLogger(CurrencyTransactionSummerTransformer.class);

  public CurrencyBrokerResponseType convertCurrenciesRatesToResponse(Message<?> msg) {
    CurrencyBrokerRequestType originalRequest = msg.getHeaders().get("originalRequest", CurrencyBrokerRequestType.class);
    BigDecimal accountAmount = msg.getHeaders().get("accountAmount", BigDecimal.class);
    Collection<CurrencyType> currencyTypes = (Collection<CurrencyType> )msg.getPayload();
    BigDecimal sumOfCurrencyCosts = BigDecimal.ZERO;

    StringBuilder sb = new StringBuilder("Details: ");
    for (CurrencyType ct: currencyTypes) {
      BigDecimal payment = ct.getAmount().multiply(ct.getExchangeRate());
      sb.append("currency: " + ct.getToCurrency() + " rate: " + ct.getExchangeRate() + " payment: " + payment + "\n");
      sumOfCurrencyCosts = sumOfCurrencyCosts.add(payment);
    }

    CurrencyBrokerResponseType responseType = new CurrencyBrokerResponseType();
    responseType.setStatus(sumOfCurrencyCosts.compareTo(accountAmount) <= 0);
    responseType.setAccount(originalRequest.getAccount());
    responseType.setTotalAmount(sumOfCurrencyCosts);
    responseType.setReason(responseType.isStatus() ? sb.toString().trim() : "No sufficient funds on your account!");

    return  responseType;
  }
}
