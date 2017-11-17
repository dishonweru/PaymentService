
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMC2007VOutGrpValuersItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMC2007VOutGrpValuersItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MC2007VOutGrpValuersItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}MC2007VOutGrpValuersItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMC2007VOutGrpValuersItem", propOrder = {
    "mc2007VOutGrpValuersItem"
})
public class ArrayOfMC2007VOutGrpValuersItem {

    @XmlElement(name = "MC2007VOutGrpValuersItem")
    protected List<MC2007VOutGrpValuersItem> mc2007VOutGrpValuersItem;

    /**
     * Gets the value of the mc2007VOutGrpValuersItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mc2007VOutGrpValuersItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMC2007VOutGrpValuersItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MC2007VOutGrpValuersItem }
     * 
     * 
     */
    public List<MC2007VOutGrpValuersItem> getMC2007VOutGrpValuersItem() {
        if (mc2007VOutGrpValuersItem == null) {
            mc2007VOutGrpValuersItem = new ArrayList<MC2007VOutGrpValuersItem>();
        }
        return this.mc2007VOutGrpValuersItem;
    }

}
