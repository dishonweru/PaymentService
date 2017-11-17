
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfA1910VOutOldGrpCustCrLineItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfA1910VOutOldGrpCustCrLineItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="A1910VOutOldGrpCustCrLineItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}A1910VOutOldGrpCustCrLineItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfA1910VOutOldGrpCustCrLineItem", propOrder = {
    "a1910VOutOldGrpCustCrLineItem"
})
public class ArrayOfA1910VOutOldGrpCustCrLineItem {

    @XmlElement(name = "A1910VOutOldGrpCustCrLineItem")
    protected List<A1910VOutOldGrpCustCrLineItem> a1910VOutOldGrpCustCrLineItem;

    /**
     * Gets the value of the a1910VOutOldGrpCustCrLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the a1910VOutOldGrpCustCrLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getA1910VOutOldGrpCustCrLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link A1910VOutOldGrpCustCrLineItem }
     * 
     * 
     */
    public List<A1910VOutOldGrpCustCrLineItem> getA1910VOutOldGrpCustCrLineItem() {
        if (a1910VOutOldGrpCustCrLineItem == null) {
            a1910VOutOldGrpCustCrLineItem = new ArrayList<A1910VOutOldGrpCustCrLineItem>();
        }
        return this.a1910VOutOldGrpCustCrLineItem;
    }

}
