
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfG0501VOutGrpSrvLogItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfG0501VOutGrpSrvLogItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="G0501VOutGrpSrvLogItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}G0501VOutGrpSrvLogItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfG0501VOutGrpSrvLogItem", propOrder = {
    "g0501VOutGrpSrvLogItem"
})
public class ArrayOfG0501VOutGrpSrvLogItem {

    @XmlElement(name = "G0501VOutGrpSrvLogItem")
    protected List<G0501VOutGrpSrvLogItem> g0501VOutGrpSrvLogItem;

    /**
     * Gets the value of the g0501VOutGrpSrvLogItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the g0501VOutGrpSrvLogItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getG0501VOutGrpSrvLogItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link G0501VOutGrpSrvLogItem }
     * 
     * 
     */
    public List<G0501VOutGrpSrvLogItem> getG0501VOutGrpSrvLogItem() {
        if (g0501VOutGrpSrvLogItem == null) {
            g0501VOutGrpSrvLogItem = new ArrayList<G0501VOutGrpSrvLogItem>();
        }
        return this.g0501VOutGrpSrvLogItem;
    }

}
