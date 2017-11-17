
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSWT3501VOutGrmCitySwiftAllnceBicsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSWT3501VOutGrmCitySwiftAllnceBicsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SWT3501VOutGrmCitySwiftAllnceBicsItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}SWT3501VOutGrmCitySwiftAllnceBicsItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSWT3501VOutGrmCitySwiftAllnceBicsItem", propOrder = {
    "swt3501VOutGrmCitySwiftAllnceBicsItem"
})
public class ArrayOfSWT3501VOutGrmCitySwiftAllnceBicsItem {

    @XmlElement(name = "SWT3501VOutGrmCitySwiftAllnceBicsItem")
    protected List<SWT3501VOutGrmCitySwiftAllnceBicsItem> swt3501VOutGrmCitySwiftAllnceBicsItem;

    /**
     * Gets the value of the swt3501VOutGrmCitySwiftAllnceBicsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the swt3501VOutGrmCitySwiftAllnceBicsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSWT3501VOutGrmCitySwiftAllnceBicsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SWT3501VOutGrmCitySwiftAllnceBicsItem }
     * 
     * 
     */
    public List<SWT3501VOutGrmCitySwiftAllnceBicsItem> getSWT3501VOutGrmCitySwiftAllnceBicsItem() {
        if (swt3501VOutGrmCitySwiftAllnceBicsItem == null) {
            swt3501VOutGrmCitySwiftAllnceBicsItem = new ArrayList<SWT3501VOutGrmCitySwiftAllnceBicsItem>();
        }
        return this.swt3501VOutGrmCitySwiftAllnceBicsItem;
    }

}
