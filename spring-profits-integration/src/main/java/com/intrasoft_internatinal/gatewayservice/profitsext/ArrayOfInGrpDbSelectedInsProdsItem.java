
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInGrpDbSelectedInsProdsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInGrpDbSelectedInsProdsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpDbSelectedInsProdsItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}InGrpDbSelectedInsProdsItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInGrpDbSelectedInsProdsItem", propOrder = {
    "inGrpDbSelectedInsProdsItem"
})
public class ArrayOfInGrpDbSelectedInsProdsItem {

    @XmlElement(name = "InGrpDbSelectedInsProdsItem")
    protected List<InGrpDbSelectedInsProdsItem> inGrpDbSelectedInsProdsItem;

    /**
     * Gets the value of the inGrpDbSelectedInsProdsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inGrpDbSelectedInsProdsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInGrpDbSelectedInsProdsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InGrpDbSelectedInsProdsItem }
     * 
     * 
     */
    public List<InGrpDbSelectedInsProdsItem> getInGrpDbSelectedInsProdsItem() {
        if (inGrpDbSelectedInsProdsItem == null) {
            inGrpDbSelectedInsProdsItem = new ArrayList<InGrpDbSelectedInsProdsItem>();
        }
        return this.inGrpDbSelectedInsProdsItem;
    }

}
