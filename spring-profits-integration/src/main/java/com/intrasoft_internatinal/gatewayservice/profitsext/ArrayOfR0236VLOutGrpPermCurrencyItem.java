
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfR0236VLOutGrpPermCurrencyItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfR0236VLOutGrpPermCurrencyItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="R0236VLOutGrpPermCurrencyItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}R0236VLOutGrpPermCurrencyItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfR0236VLOutGrpPermCurrencyItem", propOrder = {
    "r0236VLOutGrpPermCurrencyItem"
})
public class ArrayOfR0236VLOutGrpPermCurrencyItem {

    @XmlElement(name = "R0236VLOutGrpPermCurrencyItem")
    protected List<R0236VLOutGrpPermCurrencyItem> r0236VLOutGrpPermCurrencyItem;

    /**
     * Gets the value of the r0236VLOutGrpPermCurrencyItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the r0236VLOutGrpPermCurrencyItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getR0236VLOutGrpPermCurrencyItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link R0236VLOutGrpPermCurrencyItem }
     * 
     * 
     */
    public List<R0236VLOutGrpPermCurrencyItem> getR0236VLOutGrpPermCurrencyItem() {
        if (r0236VLOutGrpPermCurrencyItem == null) {
            r0236VLOutGrpPermCurrencyItem = new ArrayList<R0236VLOutGrpPermCurrencyItem>();
        }
        return this.r0236VLOutGrpPermCurrencyItem;
    }

}
