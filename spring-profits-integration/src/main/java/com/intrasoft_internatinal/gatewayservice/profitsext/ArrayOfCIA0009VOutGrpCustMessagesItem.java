
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCIA0009VOutGrpCustMessagesItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCIA0009VOutGrpCustMessagesItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CIA0009VOutGrpCustMessagesItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CIA0009VOutGrpCustMessagesItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCIA0009VOutGrpCustMessagesItem", propOrder = {
    "cia0009VOutGrpCustMessagesItem"
})
public class ArrayOfCIA0009VOutGrpCustMessagesItem {

    @XmlElement(name = "CIA0009VOutGrpCustMessagesItem")
    protected List<CIA0009VOutGrpCustMessagesItem> cia0009VOutGrpCustMessagesItem;

    /**
     * Gets the value of the cia0009VOutGrpCustMessagesItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cia0009VOutGrpCustMessagesItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCIA0009VOutGrpCustMessagesItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIA0009VOutGrpCustMessagesItem }
     * 
     * 
     */
    public List<CIA0009VOutGrpCustMessagesItem> getCIA0009VOutGrpCustMessagesItem() {
        if (cia0009VOutGrpCustMessagesItem == null) {
            cia0009VOutGrpCustMessagesItem = new ArrayList<CIA0009VOutGrpCustMessagesItem>();
        }
        return this.cia0009VOutGrpCustMessagesItem;
    }

}
