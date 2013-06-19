package pl.prxsoft.samples.eai.currency;

import org.springframework.integration.Message;
import org.springframework.integration.transformer.ContentEnricher;
import pl.prxsoft.samples.eai.currency.model.CurrencyBrokerRequestType;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: pmasko
 * Date: 17.06.2013
 * Time: 23:34
 * To change this template use File | Settings | File Templates.
 */

public class AccountStatusEnricher {

  public BigDecimal checkAccountStatus(Message<CurrencyBrokerRequestType> msg) {
    return msg.getPayload().getAccount().startsWith("1") ? BigDecimal.ONE : BigDecimal.ONE.negate();
  }
}
