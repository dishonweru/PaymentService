
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMc2006VOutGrpDefRealEstItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMc2006VOutGrpDefRealEstItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mc2006VOutGrpDefRealEstItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}Mc2006VOutGrpDefRealEstItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMc2006VOutGrpDefRealEstItem", propOrder = {
    "mc2006VOutGrpDefRealEstItem"
})
public class ArrayOfMc2006VOutGrpDefRealEstItem {

    @XmlElement(name = "Mc2006VOutGrpDefRealEstItem")
    protected List<Mc2006VOutGrpDefRealEstItem> mc2006VOutGrpDefRealEstItem;

    /**
     * Gets the value of the mc2006VOutGrpDefRealEstItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mc2006VOutGrpDefRealEstItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMc2006VOutGrpDefRealEstItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Mc2006VOutGrpDefRealEstItem }
     * 
     * 
     */
    public List<Mc2006VOutGrpDefRealEstItem> getMc2006VOutGrpDefRealEstItem() {
        if (mc2006VOutGrpDefRealEstItem == null) {
            mc2006VOutGrpDefRealEstItem = new ArrayList<Mc2006VOutGrpDefRealEstItem>();
        }
        return this.mc2006VOutGrpDefRealEstItem;
    }

}
