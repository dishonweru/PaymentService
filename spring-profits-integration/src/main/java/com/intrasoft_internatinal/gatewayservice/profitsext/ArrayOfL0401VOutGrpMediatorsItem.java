
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfL0401VOutGrpMediatorsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfL0401VOutGrpMediatorsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="L0401VOutGrpMediatorsItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}L0401VOutGrpMediatorsItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfL0401VOutGrpMediatorsItem", propOrder = {
    "l0401VOutGrpMediatorsItem"
})
public class ArrayOfL0401VOutGrpMediatorsItem {

    @XmlElement(name = "L0401VOutGrpMediatorsItem")
    protected List<L0401VOutGrpMediatorsItem> l0401VOutGrpMediatorsItem;

    /**
     * Gets the value of the l0401VOutGrpMediatorsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the l0401VOutGrpMediatorsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getL0401VOutGrpMediatorsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link L0401VOutGrpMediatorsItem }
     * 
     * 
     */
    public List<L0401VOutGrpMediatorsItem> getL0401VOutGrpMediatorsItem() {
        if (l0401VOutGrpMediatorsItem == null) {
            l0401VOutGrpMediatorsItem = new ArrayList<L0401VOutGrpMediatorsItem>();
        }
        return this.l0401VOutGrpMediatorsItem;
    }

}
