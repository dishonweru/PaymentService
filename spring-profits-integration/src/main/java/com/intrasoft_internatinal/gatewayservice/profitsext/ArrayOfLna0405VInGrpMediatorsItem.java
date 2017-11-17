
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLna0405VInGrpMediatorsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLna0405VInGrpMediatorsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Lna0405VInGrpMediatorsItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}Lna0405VInGrpMediatorsItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLna0405VInGrpMediatorsItem", propOrder = {
    "lna0405VInGrpMediatorsItem"
})
public class ArrayOfLna0405VInGrpMediatorsItem {

    @XmlElement(name = "Lna0405VInGrpMediatorsItem")
    protected List<Lna0405VInGrpMediatorsItem> lna0405VInGrpMediatorsItem;

    /**
     * Gets the value of the lna0405VInGrpMediatorsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lna0405VInGrpMediatorsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLna0405VInGrpMediatorsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lna0405VInGrpMediatorsItem }
     * 
     * 
     */
    public List<Lna0405VInGrpMediatorsItem> getLna0405VInGrpMediatorsItem() {
        if (lna0405VInGrpMediatorsItem == null) {
            lna0405VInGrpMediatorsItem = new ArrayList<Lna0405VInGrpMediatorsItem>();
        }
        return this.lna0405VInGrpMediatorsItem;
    }

}
