
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLna0405VOutGrpMediatorsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLna0405VOutGrpMediatorsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Lna0405VOutGrpMediatorsItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}Lna0405VOutGrpMediatorsItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLna0405VOutGrpMediatorsItem", propOrder = {
    "lna0405VOutGrpMediatorsItem"
})
public class ArrayOfLna0405VOutGrpMediatorsItem {

    @XmlElement(name = "Lna0405VOutGrpMediatorsItem")
    protected List<Lna0405VOutGrpMediatorsItem> lna0405VOutGrpMediatorsItem;

    /**
     * Gets the value of the lna0405VOutGrpMediatorsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lna0405VOutGrpMediatorsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLna0405VOutGrpMediatorsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lna0405VOutGrpMediatorsItem }
     * 
     * 
     */
    public List<Lna0405VOutGrpMediatorsItem> getLna0405VOutGrpMediatorsItem() {
        if (lna0405VOutGrpMediatorsItem == null) {
            lna0405VOutGrpMediatorsItem = new ArrayList<Lna0405VOutGrpMediatorsItem>();
        }
        return this.lna0405VOutGrpMediatorsItem;
    }

}
