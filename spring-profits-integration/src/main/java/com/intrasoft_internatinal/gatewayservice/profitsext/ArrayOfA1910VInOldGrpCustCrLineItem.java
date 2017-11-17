
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfA1910VInOldGrpCustCrLineItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfA1910VInOldGrpCustCrLineItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="A1910VInOldGrpCustCrLineItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}A1910VInOldGrpCustCrLineItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfA1910VInOldGrpCustCrLineItem", propOrder = {
    "a1910VInOldGrpCustCrLineItem"
})
public class ArrayOfA1910VInOldGrpCustCrLineItem {

    @XmlElement(name = "A1910VInOldGrpCustCrLineItem")
    protected List<A1910VInOldGrpCustCrLineItem> a1910VInOldGrpCustCrLineItem;

    /**
     * Gets the value of the a1910VInOldGrpCustCrLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the a1910VInOldGrpCustCrLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getA1910VInOldGrpCustCrLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link A1910VInOldGrpCustCrLineItem }
     * 
     * 
     */
    public List<A1910VInOldGrpCustCrLineItem> getA1910VInOldGrpCustCrLineItem() {
        if (a1910VInOldGrpCustCrLineItem == null) {
            a1910VInOldGrpCustCrLineItem = new ArrayList<A1910VInOldGrpCustCrLineItem>();
        }
        return this.a1910VInOldGrpCustCrLineItem;
    }

}
