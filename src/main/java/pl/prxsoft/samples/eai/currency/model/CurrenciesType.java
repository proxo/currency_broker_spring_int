
package pl.prxsoft.samples.eai.currency.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for currenciesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="currenciesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currency" type="{http://prxsoftware.pl/samples/eai}currencyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "currenciesType", namespace = "http://prxsoftware.pl/samples/eai", propOrder = {
    "currency"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-06-17T11:18:03+02:00", comments = "JAXB RI v2.2.4-2")
public class CurrenciesType {

    @XmlElement(namespace = "http://prxsoftware.pl/samples/eai")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-06-17T11:18:03+02:00", comments = "JAXB RI v2.2.4-2")
    protected List<CurrencyType> currency;

    /**
     * Gets the value of the currency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-06-17T11:18:03+02:00", comments = "JAXB RI v2.2.4-2")
    public List<CurrencyType> getCurrency() {
        if (currency == null) {
            currency = new ArrayList<CurrencyType>();
        }
        return this.currency;
    }

}
