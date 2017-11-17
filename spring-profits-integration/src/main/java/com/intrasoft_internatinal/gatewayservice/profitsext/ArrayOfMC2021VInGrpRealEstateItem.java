
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMC2021VInGrpRealEstateItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMC2021VInGrpRealEstateItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MC2021VInGrpRealEstateItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}MC2021VInGrpRealEstateItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMC2021VInGrpRealEstateItem", propOrder = {
    "mc2021VInGrpRealEstateItem"
})
public class ArrayOfMC2021VInGrpRealEstateItem {

    @XmlElement(name = "MC2021VInGrpRealEstateItem")
    protected List<MC2021VInGrpRealEstateItem> mc2021VInGrpRealEstateItem;

    /**
     * Gets the value of the mc2021VInGrpRealEstateItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mc2021VInGrpRealEstateItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMC2021VInGrpRealEstateItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MC2021VInGrpRealEstateItem }
     * 
     * 
     */
    public List<MC2021VInGrpRealEstateItem> getMC2021VInGrpRealEstateItem() {
        if (mc2021VInGrpRealEstateItem == null) {
            mc2021VInGrpRealEstateItem = new ArrayList<MC2021VInGrpRealEstateItem>();
        }
        return this.mc2021VInGrpRealEstateItem;
    }

}
