
package pl.prxsoft.samples.eai.currency.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for currencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="currencyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="toCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "currencyType", namespace = "http://prxsoftware.pl/samples/eai", propOrder = {
    "toCurrency",
    "amount"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-06-17T11:18:03+02:00", comments = "JAXB RI v2.2.4-2")
public class CurrencyType {

    @XmlElement(namespace = "http://prxsoftware.pl/samples/eai", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-06-17T11:18:03+02:00", comments = "JAXB RI v2.2.4-2")
    protected String toCurrency;
    @XmlElement(namespace = "http://prxsoftware.pl/samples/eai", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-06-17T11:18:03+02:00", comments = "JAXB RI v2.2.4-2")
    protected BigDecimal amount;

    /**
     * Gets the value of the toCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-06-17T11:18:03+02:00", comments = "JAXB RI v2.2.4-2")
    public String getToCurrency() {
        return toCurrency;
    }

    /**
     * Sets the value of the toCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-06-17T11:18:03+02:00", comments = "JAXB RI v2.2.4-2")
    public void setToCurrency(String value) {
        this.toCurrency = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-06-17T11:18:03+02:00", comments = "JAXB RI v2.2.4-2")
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-06-17T11:18:03+02:00", comments = "JAXB RI v2.2.4-2")
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

  @XmlTransient
  private BigDecimal exchangeRate;

  public BigDecimal getExchangeRate() {
    return exchangeRate;
  }

  public void setExchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  @Override
  public String toString() {
    return "toCurrency=" + toCurrency + " amount=" + getAmount() +
      (exchangeRate == null ? "" : " exchangeRate=" + this.exchangeRate);
  }
}
