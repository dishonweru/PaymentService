
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMC2007VOutGrpStockItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMC2007VOutGrpStockItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MC2007VOutGrpStockItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}MC2007VOutGrpStockItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMC2007VOutGrpStockItem", propOrder = {
    "mc2007VOutGrpStockItem"
})
public class ArrayOfMC2007VOutGrpStockItem {

    @XmlElement(name = "MC2007VOutGrpStockItem")
    protected List<MC2007VOutGrpStockItem> mc2007VOutGrpStockItem;

    /**
     * Gets the value of the mc2007VOutGrpStockItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mc2007VOutGrpStockItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMC2007VOutGrpStockItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MC2007VOutGrpStockItem }
     * 
     * 
     */
    public List<MC2007VOutGrpStockItem> getMC2007VOutGrpStockItem() {
        if (mc2007VOutGrpStockItem == null) {
            mc2007VOutGrpStockItem = new ArrayList<MC2007VOutGrpStockItem>();
        }
        return this.mc2007VOutGrpStockItem;
    }

}
