
package pl.prxsoft.samples.eai.currency.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for currencyBrokerResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="currencyBrokerResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="account" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "currencyBrokerResponseType", namespace = "http://prxsoftware.pl/samples/eai", propOrder = {
    "account",
    "status",
    "totalAmount",
    "reason"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-06-17T11:18:03+02:00", comments = "JAXB RI v2.2.4-2")
@XmlRootElement(name="currencyBrokerResponse",namespace = "http://prxsoftware.pl/samples/eai")
public class CurrencyBrokerResponseType {

    @XmlElement(namespace = "http://prxsoftware.pl/samples/eai", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-06-17T11:18:03+02:00", comments = "JAXB RI v2.2.4-2")
    protected String account;
    @XmlElement(namespace = "http://prxsoftware.pl/samples/eai")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-06-17T11:18:03+02:00", comments = "JAXB RI v2.2.4-2")
    protected boolean status;
    @XmlElement(namespace = "http://prxsoftware.pl/samples/eai", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-06-17T11:18:03+02:00", comments = "JAXB RI v2.2.4-2")
    protected BigDecimal totalAmount;
    @XmlElement(namespace = "http://prxsoftware.pl/samples/eai", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-06-17T11:18:03+02:00", comments = "JAXB RI v2.2.4-2")
    protected String reason;

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
     * Gets the value of the status property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-06-17T11:18:03+02:00", comments = "JAXB RI v2.2.4-2")
    public boolean isStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-06-17T11:18:03+02:00", comments = "JAXB RI v2.2.4-2")
    public void setStatus(boolean value) {
        this.status = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-06-17T11:18:03+02:00", comments = "JAXB RI v2.2.4-2")
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-06-17T11:18:03+02:00", comments = "JAXB RI v2.2.4-2")
    public void setTotalAmount(BigDecimal value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-06-17T11:18:03+02:00", comments = "JAXB RI v2.2.4-2")
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-06-17T11:18:03+02:00", comments = "JAXB RI v2.2.4-2")
    public void setReason(String value) {
        this.reason = value;
    }


  public CurrencyBrokerResponseType(boolean status, String reason) {
    this.status = status;
    this.reason = reason;
  }

  public CurrencyBrokerResponseType() {
  }
}
