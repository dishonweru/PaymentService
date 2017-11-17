
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRI201VIOutGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRI201VIOutGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RI201VIOutGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}RI201VIOutGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRI201VIOutGrpItem", propOrder = {
    "ri201VIOutGrpItem"
})
public class ArrayOfRI201VIOutGrpItem {

    @XmlElement(name = "RI201VIOutGrpItem")
    protected List<RI201VIOutGrpItem> ri201VIOutGrpItem;

    /**
     * Gets the value of the ri201VIOutGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ri201VIOutGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRI201VIOutGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RI201VIOutGrpItem }
     * 
     * 
     */
    public List<RI201VIOutGrpItem> getRI201VIOutGrpItem() {
        if (ri201VIOutGrpItem == null) {
            ri201VIOutGrpItem = new ArrayList<RI201VIOutGrpItem>();
        }
        return this.ri201VIOutGrpItem;
    }

}
