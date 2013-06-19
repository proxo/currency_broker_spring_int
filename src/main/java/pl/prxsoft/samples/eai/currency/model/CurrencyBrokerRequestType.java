
package pl.prxsoft.samples.eai.currency.model;

import javax.annotation.Generated;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for currencyBrokerRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="currencyBrokerRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="account" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="currencies" type="{http://prxsoftware.pl/samples/eai}currenciesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "currencyBrokerRequestType", namespace = "http://prxsoftware.pl/samples/eai", propOrder = {
    "account",
    "currencies"
})
@XmlRootElement(name="currencyBrokerRequest",namespace = "http://prxsoftware.pl/samples/eai")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-06-17T11:18:03+02:00", comments = "JAXB RI v2.2.4-2")
public class CurrencyBrokerRequestType {

    @XmlElement(namespace = "http://prxsoftware.pl/samples/eai", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-06-17T11:18:03+02:00", comments = "JAXB RI v2.2.4-2")
    protected String account;
    @XmlElement(namespace = "http://prxsoftware.pl/samples/eai", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-06-17T11:18:03+02:00", comments = "JAXB RI v2.2.4-2")
    protected CurrenciesType currencies;

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-06-17T11:18:03+02:00", comments = "JAXB RI v2.2.4-2")
    public String getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-06-17T11:18:03+02:00", comments = "JAXB RI v2.2.4-2")
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Gets the value of the currencies property.
     * 
     * @return
     *     possible object is
     *     {@link CurrenciesType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-06-17T11:18:03+02:00", comments = "JAXB RI v2.2.4-2")
    public CurrenciesType getCurrencies() {
        return currencies;
    }

    /**
     * Sets the value of the currencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrenciesType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-06-17T11:18:03+02:00", comments = "JAXB RI v2.2.4-2")
    public void setCurrencies(CurrenciesType value) {
        this.currencies = value;
    }

  @Override
  public String toString() {
    return "Account: " + getAccount()+ " currencies: " + getCurrencies().getCurrency();
  }
}
