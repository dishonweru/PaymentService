
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCIA0008VOutCustMessagesItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCIA0008VOutCustMessagesItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CIA0008VOutCustMessagesItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CIA0008VOutCustMessagesItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCIA0008VOutCustMessagesItem", propOrder = {
    "cia0008VOutCustMessagesItem"
})
public class ArrayOfCIA0008VOutCustMessagesItem {

    @XmlElement(name = "CIA0008VOutCustMessagesItem")
    protected List<CIA0008VOutCustMessagesItem> cia0008VOutCustMessagesItem;

    /**
     * Gets the value of the cia0008VOutCustMessagesItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cia0008VOutCustMessagesItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCIA0008VOutCustMessagesItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIA0008VOutCustMessagesItem }
     * 
     * 
     */
    public List<CIA0008VOutCustMessagesItem> getCIA0008VOutCustMessagesItem() {
        if (cia0008VOutCustMessagesItem == null) {
            cia0008VOutCustMessagesItem = new ArrayList<CIA0008VOutCustMessagesItem>();
        }
        return this.cia0008VOutCustMessagesItem;
    }

}
