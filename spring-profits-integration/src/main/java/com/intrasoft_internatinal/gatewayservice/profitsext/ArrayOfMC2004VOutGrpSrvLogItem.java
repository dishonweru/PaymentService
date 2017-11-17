
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMC2004VOutGrpSrvLogItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMC2004VOutGrpSrvLogItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MC2004VOutGrpSrvLogItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}MC2004VOutGrpSrvLogItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMC2004VOutGrpSrvLogItem", propOrder = {
    "mc2004VOutGrpSrvLogItem"
})
public class ArrayOfMC2004VOutGrpSrvLogItem {

    @XmlElement(name = "MC2004VOutGrpSrvLogItem")
    protected List<MC2004VOutGrpSrvLogItem> mc2004VOutGrpSrvLogItem;

    /**
     * Gets the value of the mc2004VOutGrpSrvLogItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mc2004VOutGrpSrvLogItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMC2004VOutGrpSrvLogItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MC2004VOutGrpSrvLogItem }
     * 
     * 
     */
    public List<MC2004VOutGrpSrvLogItem> getMC2004VOutGrpSrvLogItem() {
        if (mc2004VOutGrpSrvLogItem == null) {
            mc2004VOutGrpSrvLogItem = new ArrayList<MC2004VOutGrpSrvLogItem>();
        }
        return this.mc2004VOutGrpSrvLogItem;
    }

}
