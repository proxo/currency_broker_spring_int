package pl.prxsoft.samples.eai.currency;

import org.springframework.integration.xml.source.DomSourceFactory;

import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;

/**
 * Created with IntelliJ IDEA.
 * User: pmasko
 * Date: 17.06.2013
 * Time: 22:14
 */
public class SimpleEchoService {

  public Source issueResponseFor(DOMSource request) {
  		return new DomSourceFactory().createSource(
  				"<echoResponse xmlns=\"http://www.springframework.org/spring-ws/samples/echo\">" +
  				request.getNode().getTextContent() + "</echoResponse>");
  	}
}


