
package pl.prxsoft.samples.eai.currency.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.prxsoft.samples.eai.currency.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CurrencyBrokerRequest_QNAME = new QName("http://prxsoftware.pl/samples/eai", "currencyBrokerRequest");
    private final static QName _CurrencyBrokerResponse_QNAME = new QName("http://prxsoftware.pl/samples/eai", "currencyBrokerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.prxsoft.samples.eai.currency.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CurrencyBrokerResponseType }
     * 
     */
    public CurrencyBrokerResponseType createCurrencyBrokerResponseType() {
        return new CurrencyBrokerResponseType();
    }

    /**
     * Create an instance of {@link CurrencyBrokerRequestType }
     * 
     */
    public CurrencyBrokerRequestType createCurrencyBrokerRequestType() {
        return new CurrencyBrokerRequestType();
    }

    /**
     * Create an instance of {@link CurrenciesType }
     * 
     */
    public CurrenciesType createCurrenciesType() {
        return new CurrenciesType();
    }

    /**
     * Create an instance of {@link CurrencyType }
     * 
     */
    public CurrencyType createCurrencyType() {
        return new CurrencyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyBrokerRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://prxsoftware.pl/samples/eai", name = "currencyBrokerRequest")
    public JAXBElement<CurrencyBrokerRequestType> createCurrencyBrokerRequest(CurrencyBrokerRequestType value) {
        return new JAXBElement<CurrencyBrokerRequestType>(_CurrencyBrokerRequest_QNAME, CurrencyBrokerRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyBrokerResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://prxsoftware.pl/samples/eai", name = "currencyBrokerResponse")
    public JAXBElement<CurrencyBrokerResponseType> createCurrencyBrokerResponse(CurrencyBrokerResponseType value) {
        return new JAXBElement<CurrencyBrokerResponseType>(_CurrencyBrokerResponse_QNAME, CurrencyBrokerResponseType.class, null, value);
    }

}
