
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLna0405VInGrpDbSelectedInsProdsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLna0405VInGrpDbSelectedInsProdsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Lna0405VInGrpDbSelectedInsProdsItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}Lna0405VInGrpDbSelectedInsProdsItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLna0405VInGrpDbSelectedInsProdsItem", propOrder = {
    "lna0405VInGrpDbSelectedInsProdsItem"
})
public class ArrayOfLna0405VInGrpDbSelectedInsProdsItem {

    @XmlElement(name = "Lna0405VInGrpDbSelectedInsProdsItem")
    protected List<Lna0405VInGrpDbSelectedInsProdsItem> lna0405VInGrpDbSelectedInsProdsItem;

    /**
     * Gets the value of the lna0405VInGrpDbSelectedInsProdsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lna0405VInGrpDbSelectedInsProdsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLna0405VInGrpDbSelectedInsProdsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lna0405VInGrpDbSelectedInsProdsItem }
     * 
     * 
     */
    public List<Lna0405VInGrpDbSelectedInsProdsItem> getLna0405VInGrpDbSelectedInsProdsItem() {
        if (lna0405VInGrpDbSelectedInsProdsItem == null) {
            lna0405VInGrpDbSelectedInsProdsItem = new ArrayList<Lna0405VInGrpDbSelectedInsProdsItem>();
        }
        return this.lna0405VInGrpDbSelectedInsProdsItem;
    }

}
