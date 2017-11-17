
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfL0705VOutGrpSystemItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfL0705VOutGrpSystemItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="L0705VOutGrpSystemItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}L0705VOutGrpSystemItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfL0705VOutGrpSystemItem", propOrder = {
    "l0705VOutGrpSystemItem"
})
public class ArrayOfL0705VOutGrpSystemItem {

    @XmlElement(name = "L0705VOutGrpSystemItem")
    protected List<L0705VOutGrpSystemItem> l0705VOutGrpSystemItem;

    /**
     * Gets the value of the l0705VOutGrpSystemItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the l0705VOutGrpSystemItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getL0705VOutGrpSystemItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link L0705VOutGrpSystemItem }
     * 
     * 
     */
    public List<L0705VOutGrpSystemItem> getL0705VOutGrpSystemItem() {
        if (l0705VOutGrpSystemItem == null) {
            l0705VOutGrpSystemItem = new ArrayList<L0705VOutGrpSystemItem>();
        }
        return this.l0705VOutGrpSystemItem;
    }

}
