
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCIA0009VOutGrpCustAccMessagesItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCIA0009VOutGrpCustAccMessagesItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CIA0009VOutGrpCustAccMessagesItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CIA0009VOutGrpCustAccMessagesItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCIA0009VOutGrpCustAccMessagesItem", propOrder = {
    "cia0009VOutGrpCustAccMessagesItem"
})
public class ArrayOfCIA0009VOutGrpCustAccMessagesItem {

    @XmlElement(name = "CIA0009VOutGrpCustAccMessagesItem")
    protected List<CIA0009VOutGrpCustAccMessagesItem> cia0009VOutGrpCustAccMessagesItem;

    /**
     * Gets the value of the cia0009VOutGrpCustAccMessagesItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cia0009VOutGrpCustAccMessagesItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCIA0009VOutGrpCustAccMessagesItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIA0009VOutGrpCustAccMessagesItem }
     * 
     * 
     */
    public List<CIA0009VOutGrpCustAccMessagesItem> getCIA0009VOutGrpCustAccMessagesItem() {
        if (cia0009VOutGrpCustAccMessagesItem == null) {
            cia0009VOutGrpCustAccMessagesItem = new ArrayList<CIA0009VOutGrpCustAccMessagesItem>();
        }
        return this.cia0009VOutGrpCustAccMessagesItem;
    }

}
