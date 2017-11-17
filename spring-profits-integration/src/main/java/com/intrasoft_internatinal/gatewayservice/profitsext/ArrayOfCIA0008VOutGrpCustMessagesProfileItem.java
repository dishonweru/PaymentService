
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCIA0008VOutGrpCustMessagesProfileItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCIA0008VOutGrpCustMessagesProfileItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CIA0008VOutGrpCustMessagesProfileItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CIA0008VOutGrpCustMessagesProfileItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCIA0008VOutGrpCustMessagesProfileItem", propOrder = {
    "cia0008VOutGrpCustMessagesProfileItem"
})
public class ArrayOfCIA0008VOutGrpCustMessagesProfileItem {

    @XmlElement(name = "CIA0008VOutGrpCustMessagesProfileItem")
    protected List<CIA0008VOutGrpCustMessagesProfileItem> cia0008VOutGrpCustMessagesProfileItem;

    /**
     * Gets the value of the cia0008VOutGrpCustMessagesProfileItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cia0008VOutGrpCustMessagesProfileItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCIA0008VOutGrpCustMessagesProfileItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIA0008VOutGrpCustMessagesProfileItem }
     * 
     * 
     */
    public List<CIA0008VOutGrpCustMessagesProfileItem> getCIA0008VOutGrpCustMessagesProfileItem() {
        if (cia0008VOutGrpCustMessagesProfileItem == null) {
            cia0008VOutGrpCustMessagesProfileItem = new ArrayList<CIA0008VOutGrpCustMessagesProfileItem>();
        }
        return this.cia0008VOutGrpCustMessagesProfileItem;
    }

}
