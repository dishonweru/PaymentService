
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMC2021VOutGrpRealEstateItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMC2021VOutGrpRealEstateItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MC2021VOutGrpRealEstateItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}MC2021VOutGrpRealEstateItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMC2021VOutGrpRealEstateItem", propOrder = {
    "mc2021VOutGrpRealEstateItem"
})
public class ArrayOfMC2021VOutGrpRealEstateItem {

    @XmlElement(name = "MC2021VOutGrpRealEstateItem")
    protected List<MC2021VOutGrpRealEstateItem> mc2021VOutGrpRealEstateItem;

    /**
     * Gets the value of the mc2021VOutGrpRealEstateItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mc2021VOutGrpRealEstateItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMC2021VOutGrpRealEstateItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MC2021VOutGrpRealEstateItem }
     * 
     * 
     */
    public List<MC2021VOutGrpRealEstateItem> getMC2021VOutGrpRealEstateItem() {
        if (mc2021VOutGrpRealEstateItem == null) {
            mc2021VOutGrpRealEstateItem = new ArrayList<MC2021VOutGrpRealEstateItem>();
        }
        return this.mc2021VOutGrpRealEstateItem;
    }

}
