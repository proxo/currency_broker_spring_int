package pl.prxsoft.samples.eai.currency;

import org.springframework.stereotype.Component;
import pl.prxsoft.samples.eai.currency.model.CurrencyBrokerResponseType;

/**
 * Created by IntelliJ IDEA.
 * User: Piotr Maśko
 * Date: 20.06.13
 * Time: 17:29
 */
@Component("orderFulfillService")
public class OrderFulfillService {
  public CurrencyBrokerResponseType fullfillOrder(CurrencyBrokerResponseType responseType) {
    System.out.printf(">>Charging account: %s with amount: %f for transaction", responseType.getAccount(), responseType.getTotalAmount().doubleValue());
    return  responseType;
  }
}
