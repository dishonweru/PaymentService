
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSwiftCodeListItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSwiftCodeListItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SwiftCodeListItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}SwiftCodeListItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSwiftCodeListItem", propOrder = {
    "swiftCodeListItem"
})
public class ArrayOfSwiftCodeListItem {

    @XmlElement(name = "SwiftCodeListItem")
    protected List<SwiftCodeListItem> swiftCodeListItem;

    /**
     * Gets the value of the swiftCodeListItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the swiftCodeListItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSwiftCodeListItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwiftCodeListItem }
     * 
     * 
     */
    public List<SwiftCodeListItem> getSwiftCodeListItem() {
        if (swiftCodeListItem == null) {
            swiftCodeListItem = new ArrayList<SwiftCodeListItem>();
        }
        return this.swiftCodeListItem;
    }

}
