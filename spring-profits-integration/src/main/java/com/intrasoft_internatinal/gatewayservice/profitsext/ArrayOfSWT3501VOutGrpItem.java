
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSWT3501VOutGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSWT3501VOutGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SWT3501VOutGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}SWT3501VOutGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSWT3501VOutGrpItem", propOrder = {
    "swt3501VOutGrpItem"
})
public class ArrayOfSWT3501VOutGrpItem {

    @XmlElement(name = "SWT3501VOutGrpItem")
    protected List<SWT3501VOutGrpItem> swt3501VOutGrpItem;

    /**
     * Gets the value of the swt3501VOutGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the swt3501VOutGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSWT3501VOutGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SWT3501VOutGrpItem }
     * 
     * 
     */
    public List<SWT3501VOutGrpItem> getSWT3501VOutGrpItem() {
        if (swt3501VOutGrpItem == null) {
            swt3501VOutGrpItem = new ArrayList<SWT3501VOutGrpItem>();
        }
        return this.swt3501VOutGrpItem;
    }

}
