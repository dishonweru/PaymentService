
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSWT3501VOutGrpRmaItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSWT3501VOutGrpRmaItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SWT3501VOutGrpRmaItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}SWT3501VOutGrpRmaItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSWT3501VOutGrpRmaItem", propOrder = {
    "swt3501VOutGrpRmaItem"
})
public class ArrayOfSWT3501VOutGrpRmaItem {

    @XmlElement(name = "SWT3501VOutGrpRmaItem")
    protected List<SWT3501VOutGrpRmaItem> swt3501VOutGrpRmaItem;

    /**
     * Gets the value of the swt3501VOutGrpRmaItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the swt3501VOutGrpRmaItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSWT3501VOutGrpRmaItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SWT3501VOutGrpRmaItem }
     * 
     * 
     */
    public List<SWT3501VOutGrpRmaItem> getSWT3501VOutGrpRmaItem() {
        if (swt3501VOutGrpRmaItem == null) {
            swt3501VOutGrpRmaItem = new ArrayList<SWT3501VOutGrpRmaItem>();
        }
        return this.swt3501VOutGrpRmaItem;
    }

}
