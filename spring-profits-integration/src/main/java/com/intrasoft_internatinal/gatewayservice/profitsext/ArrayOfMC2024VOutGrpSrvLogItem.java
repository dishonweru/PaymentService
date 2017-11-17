
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMC2024VOutGrpSrvLogItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMC2024VOutGrpSrvLogItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MC2024VOutGrpSrvLogItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}MC2024VOutGrpSrvLogItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMC2024VOutGrpSrvLogItem", propOrder = {
    "mc2024VOutGrpSrvLogItem"
})
public class ArrayOfMC2024VOutGrpSrvLogItem {

    @XmlElement(name = "MC2024VOutGrpSrvLogItem")
    protected List<MC2024VOutGrpSrvLogItem> mc2024VOutGrpSrvLogItem;

    /**
     * Gets the value of the mc2024VOutGrpSrvLogItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mc2024VOutGrpSrvLogItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMC2024VOutGrpSrvLogItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MC2024VOutGrpSrvLogItem }
     * 
     * 
     */
    public List<MC2024VOutGrpSrvLogItem> getMC2024VOutGrpSrvLogItem() {
        if (mc2024VOutGrpSrvLogItem == null) {
            mc2024VOutGrpSrvLogItem = new ArrayList<MC2024VOutGrpSrvLogItem>();
        }
        return this.mc2024VOutGrpSrvLogItem;
    }

}
