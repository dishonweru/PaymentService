
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfL0705VOutGrpDepTrxItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfL0705VOutGrpDepTrxItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="L0705VOutGrpDepTrxItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}L0705VOutGrpDepTrxItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfL0705VOutGrpDepTrxItem", propOrder = {
    "l0705VOutGrpDepTrxItem"
})
public class ArrayOfL0705VOutGrpDepTrxItem {

    @XmlElement(name = "L0705VOutGrpDepTrxItem")
    protected List<L0705VOutGrpDepTrxItem> l0705VOutGrpDepTrxItem;

    /**
     * Gets the value of the l0705VOutGrpDepTrxItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the l0705VOutGrpDepTrxItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getL0705VOutGrpDepTrxItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link L0705VOutGrpDepTrxItem }
     * 
     * 
     */
    public List<L0705VOutGrpDepTrxItem> getL0705VOutGrpDepTrxItem() {
        if (l0705VOutGrpDepTrxItem == null) {
            l0705VOutGrpDepTrxItem = new ArrayList<L0705VOutGrpDepTrxItem>();
        }
        return this.l0705VOutGrpDepTrxItem;
    }

}
