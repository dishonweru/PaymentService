
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCIA0008VOutCustAccountMessagesItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCIA0008VOutCustAccountMessagesItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CIA0008VOutCustAccountMessagesItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CIA0008VOutCustAccountMessagesItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCIA0008VOutCustAccountMessagesItem", propOrder = {
    "cia0008VOutCustAccountMessagesItem"
})
public class ArrayOfCIA0008VOutCustAccountMessagesItem {

    @XmlElement(name = "CIA0008VOutCustAccountMessagesItem")
    protected List<CIA0008VOutCustAccountMessagesItem> cia0008VOutCustAccountMessagesItem;

    /**
     * Gets the value of the cia0008VOutCustAccountMessagesItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cia0008VOutCustAccountMessagesItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCIA0008VOutCustAccountMessagesItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIA0008VOutCustAccountMessagesItem }
     * 
     * 
     */
    public List<CIA0008VOutCustAccountMessagesItem> getCIA0008VOutCustAccountMessagesItem() {
        if (cia0008VOutCustAccountMessagesItem == null) {
            cia0008VOutCustAccountMessagesItem = new ArrayList<CIA0008VOutCustAccountMessagesItem>();
        }
        return this.cia0008VOutCustAccountMessagesItem;
    }

}
