
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfL0407VOutGrpLogItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfL0407VOutGrpLogItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="L0407VOutGrpLogItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}L0407VOutGrpLogItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfL0407VOutGrpLogItem", propOrder = {
    "l0407VOutGrpLogItem"
})
public class ArrayOfL0407VOutGrpLogItem {

    @XmlElement(name = "L0407VOutGrpLogItem")
    protected List<L0407VOutGrpLogItem> l0407VOutGrpLogItem;

    /**
     * Gets the value of the l0407VOutGrpLogItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the l0407VOutGrpLogItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getL0407VOutGrpLogItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link L0407VOutGrpLogItem }
     * 
     * 
     */
    public List<L0407VOutGrpLogItem> getL0407VOutGrpLogItem() {
        if (l0407VOutGrpLogItem == null) {
            l0407VOutGrpLogItem = new ArrayList<L0407VOutGrpLogItem>();
        }
        return this.l0407VOutGrpLogItem;
    }

}
