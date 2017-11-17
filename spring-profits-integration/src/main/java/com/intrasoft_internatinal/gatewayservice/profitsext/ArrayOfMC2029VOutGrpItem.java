
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMC2029VOutGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMC2029VOutGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MC2029VOutGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}MC2029VOutGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMC2029VOutGrpItem", propOrder = {
    "mc2029VOutGrpItem"
})
public class ArrayOfMC2029VOutGrpItem {

    @XmlElement(name = "MC2029VOutGrpItem")
    protected List<MC2029VOutGrpItem> mc2029VOutGrpItem;

    /**
     * Gets the value of the mc2029VOutGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mc2029VOutGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMC2029VOutGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MC2029VOutGrpItem }
     * 
     * 
     */
    public List<MC2029VOutGrpItem> getMC2029VOutGrpItem() {
        if (mc2029VOutGrpItem == null) {
            mc2029VOutGrpItem = new ArrayList<MC2029VOutGrpItem>();
        }
        return this.mc2029VOutGrpItem;
    }

}
