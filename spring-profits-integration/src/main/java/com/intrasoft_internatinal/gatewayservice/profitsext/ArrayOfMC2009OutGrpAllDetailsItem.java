
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMC2009OutGrpAllDetailsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMC2009OutGrpAllDetailsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MC2009OutGrpAllDetailsItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}MC2009OutGrpAllDetailsItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMC2009OutGrpAllDetailsItem", propOrder = {
    "mc2009OutGrpAllDetailsItem"
})
public class ArrayOfMC2009OutGrpAllDetailsItem {

    @XmlElement(name = "MC2009OutGrpAllDetailsItem")
    protected List<MC2009OutGrpAllDetailsItem> mc2009OutGrpAllDetailsItem;

    /**
     * Gets the value of the mc2009OutGrpAllDetailsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mc2009OutGrpAllDetailsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMC2009OutGrpAllDetailsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MC2009OutGrpAllDetailsItem }
     * 
     * 
     */
    public List<MC2009OutGrpAllDetailsItem> getMC2009OutGrpAllDetailsItem() {
        if (mc2009OutGrpAllDetailsItem == null) {
            mc2009OutGrpAllDetailsItem = new ArrayList<MC2009OutGrpAllDetailsItem>();
        }
        return this.mc2009OutGrpAllDetailsItem;
    }

}
