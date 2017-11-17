
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMC2007VOutGrpSrvLogItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMC2007VOutGrpSrvLogItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MC2007VOutGrpSrvLogItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}MC2007VOutGrpSrvLogItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMC2007VOutGrpSrvLogItem", propOrder = {
    "mc2007VOutGrpSrvLogItem"
})
public class ArrayOfMC2007VOutGrpSrvLogItem {

    @XmlElement(name = "MC2007VOutGrpSrvLogItem")
    protected List<MC2007VOutGrpSrvLogItem> mc2007VOutGrpSrvLogItem;

    /**
     * Gets the value of the mc2007VOutGrpSrvLogItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mc2007VOutGrpSrvLogItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMC2007VOutGrpSrvLogItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MC2007VOutGrpSrvLogItem }
     * 
     * 
     */
    public List<MC2007VOutGrpSrvLogItem> getMC2007VOutGrpSrvLogItem() {
        if (mc2007VOutGrpSrvLogItem == null) {
            mc2007VOutGrpSrvLogItem = new ArrayList<MC2007VOutGrpSrvLogItem>();
        }
        return this.mc2007VOutGrpSrvLogItem;
    }

}
