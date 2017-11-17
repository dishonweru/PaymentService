
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfL0497VOutGrpUserTotalItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfL0497VOutGrpUserTotalItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="L0497VOutGrpUserTotalItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}L0497VOutGrpUserTotalItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfL0497VOutGrpUserTotalItem", propOrder = {
    "l0497VOutGrpUserTotalItem"
})
public class ArrayOfL0497VOutGrpUserTotalItem {

    @XmlElement(name = "L0497VOutGrpUserTotalItem")
    protected List<L0497VOutGrpUserTotalItem> l0497VOutGrpUserTotalItem;

    /**
     * Gets the value of the l0497VOutGrpUserTotalItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the l0497VOutGrpUserTotalItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getL0497VOutGrpUserTotalItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link L0497VOutGrpUserTotalItem }
     * 
     * 
     */
    public List<L0497VOutGrpUserTotalItem> getL0497VOutGrpUserTotalItem() {
        if (l0497VOutGrpUserTotalItem == null) {
            l0497VOutGrpUserTotalItem = new ArrayList<L0497VOutGrpUserTotalItem>();
        }
        return this.l0497VOutGrpUserTotalItem;
    }

}
