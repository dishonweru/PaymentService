
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSWT3501VInGrpRmaItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSWT3501VInGrpRmaItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SWT3501VInGrpRmaItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}SWT3501VInGrpRmaItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSWT3501VInGrpRmaItem", propOrder = {
    "swt3501VInGrpRmaItem"
})
public class ArrayOfSWT3501VInGrpRmaItem {

    @XmlElement(name = "SWT3501VInGrpRmaItem")
    protected List<SWT3501VInGrpRmaItem> swt3501VInGrpRmaItem;

    /**
     * Gets the value of the swt3501VInGrpRmaItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the swt3501VInGrpRmaItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSWT3501VInGrpRmaItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SWT3501VInGrpRmaItem }
     * 
     * 
     */
    public List<SWT3501VInGrpRmaItem> getSWT3501VInGrpRmaItem() {
        if (swt3501VInGrpRmaItem == null) {
            swt3501VInGrpRmaItem = new ArrayList<SWT3501VInGrpRmaItem>();
        }
        return this.swt3501VInGrpRmaItem;
    }

}
