
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOutOwnbankUnpaid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutOwnbankUnpaid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutOwnbankUnpaid" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}OutOwnbankUnpaid" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutOwnbankUnpaid", propOrder = {
    "outOwnbankUnpaid"
})
public class ArrayOfOutOwnbankUnpaid {

    @XmlElement(name = "OutOwnbankUnpaid")
    protected List<OutOwnbankUnpaid> outOwnbankUnpaid;

    /**
     * Gets the value of the outOwnbankUnpaid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outOwnbankUnpaid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutOwnbankUnpaid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutOwnbankUnpaid }
     * 
     * 
     */
    public List<OutOwnbankUnpaid> getOutOwnbankUnpaid() {
        if (outOwnbankUnpaid == null) {
            outOwnbankUnpaid = new ArrayList<OutOwnbankUnpaid>();
        }
        return this.outOwnbankUnpaid;
    }

}
