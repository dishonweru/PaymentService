
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfL0705VOutGrpFxTrxItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfL0705VOutGrpFxTrxItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="L0705VOutGrpFxTrxItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}L0705VOutGrpFxTrxItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfL0705VOutGrpFxTrxItem", propOrder = {
    "l0705VOutGrpFxTrxItem"
})
public class ArrayOfL0705VOutGrpFxTrxItem {

    @XmlElement(name = "L0705VOutGrpFxTrxItem")
    protected List<L0705VOutGrpFxTrxItem> l0705VOutGrpFxTrxItem;

    /**
     * Gets the value of the l0705VOutGrpFxTrxItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the l0705VOutGrpFxTrxItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getL0705VOutGrpFxTrxItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link L0705VOutGrpFxTrxItem }
     * 
     * 
     */
    public List<L0705VOutGrpFxTrxItem> getL0705VOutGrpFxTrxItem() {
        if (l0705VOutGrpFxTrxItem == null) {
            l0705VOutGrpFxTrxItem = new ArrayList<L0705VOutGrpFxTrxItem>();
        }
        return this.l0705VOutGrpFxTrxItem;
    }

}
