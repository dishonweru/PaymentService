
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSWT3501VOutGrmBankSwiftAllnceBicsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSWT3501VOutGrmBankSwiftAllnceBicsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SWT3501VOutGrmBankSwiftAllnceBicsItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}SWT3501VOutGrmBankSwiftAllnceBicsItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSWT3501VOutGrmBankSwiftAllnceBicsItem", propOrder = {
    "swt3501VOutGrmBankSwiftAllnceBicsItem"
})
public class ArrayOfSWT3501VOutGrmBankSwiftAllnceBicsItem {

    @XmlElement(name = "SWT3501VOutGrmBankSwiftAllnceBicsItem")
    protected List<SWT3501VOutGrmBankSwiftAllnceBicsItem> swt3501VOutGrmBankSwiftAllnceBicsItem;

    /**
     * Gets the value of the swt3501VOutGrmBankSwiftAllnceBicsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the swt3501VOutGrmBankSwiftAllnceBicsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSWT3501VOutGrmBankSwiftAllnceBicsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SWT3501VOutGrmBankSwiftAllnceBicsItem }
     * 
     * 
     */
    public List<SWT3501VOutGrmBankSwiftAllnceBicsItem> getSWT3501VOutGrmBankSwiftAllnceBicsItem() {
        if (swt3501VOutGrmBankSwiftAllnceBicsItem == null) {
            swt3501VOutGrmBankSwiftAllnceBicsItem = new ArrayList<SWT3501VOutGrmBankSwiftAllnceBicsItem>();
        }
        return this.swt3501VOutGrmBankSwiftAllnceBicsItem;
    }

}
