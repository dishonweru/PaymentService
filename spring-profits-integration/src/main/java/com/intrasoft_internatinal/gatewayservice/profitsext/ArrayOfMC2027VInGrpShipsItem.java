
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMC2027VInGrpShipsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMC2027VInGrpShipsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MC2027VInGrpShipsItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}MC2027VInGrpShipsItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMC2027VInGrpShipsItem", propOrder = {
    "mc2027VInGrpShipsItem"
})
public class ArrayOfMC2027VInGrpShipsItem {

    @XmlElement(name = "MC2027VInGrpShipsItem")
    protected List<MC2027VInGrpShipsItem> mc2027VInGrpShipsItem;

    /**
     * Gets the value of the mc2027VInGrpShipsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mc2027VInGrpShipsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMC2027VInGrpShipsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MC2027VInGrpShipsItem }
     * 
     * 
     */
    public List<MC2027VInGrpShipsItem> getMC2027VInGrpShipsItem() {
        if (mc2027VInGrpShipsItem == null) {
            mc2027VInGrpShipsItem = new ArrayList<MC2027VInGrpShipsItem>();
        }
        return this.mc2027VInGrpShipsItem;
    }

}
