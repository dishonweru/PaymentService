
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMc2006VInGrpDefRealEstItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMc2006VInGrpDefRealEstItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mc2006VInGrpDefRealEstItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}Mc2006VInGrpDefRealEstItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMc2006VInGrpDefRealEstItem", propOrder = {
    "mc2006VInGrpDefRealEstItem"
})
public class ArrayOfMc2006VInGrpDefRealEstItem {

    @XmlElement(name = "Mc2006VInGrpDefRealEstItem")
    protected List<Mc2006VInGrpDefRealEstItem> mc2006VInGrpDefRealEstItem;

    /**
     * Gets the value of the mc2006VInGrpDefRealEstItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mc2006VInGrpDefRealEstItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMc2006VInGrpDefRealEstItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Mc2006VInGrpDefRealEstItem }
     * 
     * 
     */
    public List<Mc2006VInGrpDefRealEstItem> getMc2006VInGrpDefRealEstItem() {
        if (mc2006VInGrpDefRealEstItem == null) {
            mc2006VInGrpDefRealEstItem = new ArrayList<Mc2006VInGrpDefRealEstItem>();
        }
        return this.mc2006VInGrpDefRealEstItem;
    }

}
