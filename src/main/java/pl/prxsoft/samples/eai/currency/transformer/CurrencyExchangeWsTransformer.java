package pl.prxsoft.samples.eai.currency.transformer;

import org.springframework.integration.Message;
import org.springframework.util.StringUtils;
import org.springframework.xml.transform.StringSource;
import org.springframework.xml.xpath.Jaxp13XPathTemplate;
import org.springframework.xml.xpath.XPathOperations;
import pl.prxsoft.samples.eai.currency.model.CurrencyType;

import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: Piotr Maśko
 * Date: 18.06.13
 * Time: 18:29
 */
public class CurrencyExchangeWsTransformer {

  private Jaxp13XPathTemplate xPathOperations = new Jaxp13XPathTemplate();

  private String dom2String(DOMSource domSource) {
    try {
      // Set up the output transformer
      TransformerFactory transfac = TransformerFactory.newInstance();
      Transformer trans = transfac.newTransformer();
      trans.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
      trans.setOutputProperty(OutputKeys.INDENT, "yes");

      // Print the DOM node

      StringWriter sw = new StringWriter();
      StreamResult result = new StreamResult(sw);

      trans.transform(domSource, result);
      String xmlString = sw.toString();

      return xmlString;
    } catch (TransformerException e) {
      e.printStackTrace();
      return "";
    }
  }

  public Source convertToCurrencyRequest(CurrencyType currencyType) {
    Source requestPayload = new StringSource(
      "      <web:ConversionRate xmlns:web=\"http://www.webserviceX.NET/\">\n" +
      "         <web:FromCurrency>" +currencyType.getToCurrency() + "</web:FromCurrency>\n" +
      "         <web:ToCurrency>PLN</web:ToCurrency>\n" +
      "      </web:ConversionRate>");
    return  requestPayload;
  }

  public BigDecimal convertWSResponseToOut(Message<?> msg) {
    DOMSource domSource = (DOMSource) msg.getPayload();
//    final String resultXML = dom2String(domSource);

    xPathOperations.setNamespaces(new HashMap<String, String>() {{
      put("soap","http://schemas.xmlsoap.org/soap/envelope/");
      put("c", "http://www.webserviceX.NET/");
    }
    });

    String value = xPathOperations.evaluateAsString(
      "/soap:Envelope/soap:Body/*[local-name()='ConversionRateResponse']/*[local-name()='ConversionRateResult']/text()",
      domSource);

    if (StringUtils.hasText(value)) {
      return new BigDecimal(value.trim());
    }

    throw new IllegalStateException("WebService responded with illegal value: " + value);
  }


}
