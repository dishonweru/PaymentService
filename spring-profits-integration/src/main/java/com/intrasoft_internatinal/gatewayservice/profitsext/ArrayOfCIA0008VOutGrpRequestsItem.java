
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCIA0008VOutGrpRequestsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCIA0008VOutGrpRequestsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CIA0008VOutGrpRequestsItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CIA0008VOutGrpRequestsItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCIA0008VOutGrpRequestsItem", propOrder = {
    "cia0008VOutGrpRequestsItem"
})
public class ArrayOfCIA0008VOutGrpRequestsItem {

    @XmlElement(name = "CIA0008VOutGrpRequestsItem")
    protected List<CIA0008VOutGrpRequestsItem> cia0008VOutGrpRequestsItem;

    /**
     * Gets the value of the cia0008VOutGrpRequestsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cia0008VOutGrpRequestsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCIA0008VOutGrpRequestsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIA0008VOutGrpRequestsItem }
     * 
     * 
     */
    public List<CIA0008VOutGrpRequestsItem> getCIA0008VOutGrpRequestsItem() {
        if (cia0008VOutGrpRequestsItem == null) {
            cia0008VOutGrpRequestsItem = new ArrayList<CIA0008VOutGrpRequestsItem>();
        }
        return this.cia0008VOutGrpRequestsItem;
    }

}
