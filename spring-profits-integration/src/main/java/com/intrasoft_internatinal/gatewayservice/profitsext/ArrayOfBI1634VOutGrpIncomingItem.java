
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBI1634VOutGrpIncomingItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBI1634VOutGrpIncomingItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BI1634VOutGrpIncomingItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BI1634VOutGrpIncomingItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBI1634VOutGrpIncomingItem", propOrder = {
    "bi1634VOutGrpIncomingItem"
})
public class ArrayOfBI1634VOutGrpIncomingItem {

    @XmlElement(name = "BI1634VOutGrpIncomingItem")
    protected List<BI1634VOutGrpIncomingItem> bi1634VOutGrpIncomingItem;

    /**
     * Gets the value of the bi1634VOutGrpIncomingItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bi1634VOutGrpIncomingItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBI1634VOutGrpIncomingItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BI1634VOutGrpIncomingItem }
     * 
     * 
     */
    public List<BI1634VOutGrpIncomingItem> getBI1634VOutGrpIncomingItem() {
        if (bi1634VOutGrpIncomingItem == null) {
            bi1634VOutGrpIncomingItem = new ArrayList<BI1634VOutGrpIncomingItem>();
        }
        return this.bi1634VOutGrpIncomingItem;
    }

}
