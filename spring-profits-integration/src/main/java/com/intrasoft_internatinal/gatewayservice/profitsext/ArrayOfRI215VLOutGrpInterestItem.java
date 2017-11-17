
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRI215VLOutGrpInterestItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRI215VLOutGrpInterestItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RI215VLOutGrpInterestItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}RI215VLOutGrpInterestItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRI215VLOutGrpInterestItem", propOrder = {
    "ri215VLOutGrpInterestItem"
})
public class ArrayOfRI215VLOutGrpInterestItem {

    @XmlElement(name = "RI215VLOutGrpInterestItem")
    protected List<RI215VLOutGrpInterestItem> ri215VLOutGrpInterestItem;

    /**
     * Gets the value of the ri215VLOutGrpInterestItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ri215VLOutGrpInterestItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRI215VLOutGrpInterestItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RI215VLOutGrpInterestItem }
     * 
     * 
     */
    public List<RI215VLOutGrpInterestItem> getRI215VLOutGrpInterestItem() {
        if (ri215VLOutGrpInterestItem == null) {
            ri215VLOutGrpInterestItem = new ArrayList<RI215VLOutGrpInterestItem>();
        }
        return this.ri215VLOutGrpInterestItem;
    }

}
