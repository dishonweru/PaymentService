
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfL0705VOutGrpUwTrxItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfL0705VOutGrpUwTrxItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="L0705VOutGrpUwTrxItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}L0705VOutGrpUwTrxItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfL0705VOutGrpUwTrxItem", propOrder = {
    "l0705VOutGrpUwTrxItem"
})
public class ArrayOfL0705VOutGrpUwTrxItem {

    @XmlElement(name = "L0705VOutGrpUwTrxItem")
    protected List<L0705VOutGrpUwTrxItem> l0705VOutGrpUwTrxItem;

    /**
     * Gets the value of the l0705VOutGrpUwTrxItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the l0705VOutGrpUwTrxItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getL0705VOutGrpUwTrxItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link L0705VOutGrpUwTrxItem }
     * 
     * 
     */
    public List<L0705VOutGrpUwTrxItem> getL0705VOutGrpUwTrxItem() {
        if (l0705VOutGrpUwTrxItem == null) {
            l0705VOutGrpUwTrxItem = new ArrayList<L0705VOutGrpUwTrxItem>();
        }
        return this.l0705VOutGrpUwTrxItem;
    }

}
