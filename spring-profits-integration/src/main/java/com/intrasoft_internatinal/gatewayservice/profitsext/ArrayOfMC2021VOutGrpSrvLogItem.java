
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMC2021VOutGrpSrvLogItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMC2021VOutGrpSrvLogItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MC2021VOutGrpSrvLogItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}MC2021VOutGrpSrvLogItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMC2021VOutGrpSrvLogItem", propOrder = {
    "mc2021VOutGrpSrvLogItem"
})
public class ArrayOfMC2021VOutGrpSrvLogItem {

    @XmlElement(name = "MC2021VOutGrpSrvLogItem")
    protected List<MC2021VOutGrpSrvLogItem> mc2021VOutGrpSrvLogItem;

    /**
     * Gets the value of the mc2021VOutGrpSrvLogItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mc2021VOutGrpSrvLogItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMC2021VOutGrpSrvLogItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MC2021VOutGrpSrvLogItem }
     * 
     * 
     */
    public List<MC2021VOutGrpSrvLogItem> getMC2021VOutGrpSrvLogItem() {
        if (mc2021VOutGrpSrvLogItem == null) {
            mc2021VOutGrpSrvLogItem = new ArrayList<MC2021VOutGrpSrvLogItem>();
        }
        return this.mc2021VOutGrpSrvLogItem;
    }

}
