
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMc2019VOutGrpRealEstateItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMc2019VOutGrpRealEstateItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mc2019VOutGrpRealEstateItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}Mc2019VOutGrpRealEstateItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMc2019VOutGrpRealEstateItem", propOrder = {
    "mc2019VOutGrpRealEstateItem"
})
public class ArrayOfMc2019VOutGrpRealEstateItem {

    @XmlElement(name = "Mc2019VOutGrpRealEstateItem")
    protected List<Mc2019VOutGrpRealEstateItem> mc2019VOutGrpRealEstateItem;

    /**
     * Gets the value of the mc2019VOutGrpRealEstateItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mc2019VOutGrpRealEstateItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMc2019VOutGrpRealEstateItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Mc2019VOutGrpRealEstateItem }
     * 
     * 
     */
    public List<Mc2019VOutGrpRealEstateItem> getMc2019VOutGrpRealEstateItem() {
        if (mc2019VOutGrpRealEstateItem == null) {
            mc2019VOutGrpRealEstateItem = new ArrayList<Mc2019VOutGrpRealEstateItem>();
        }
        return this.mc2019VOutGrpRealEstateItem;
    }

}
