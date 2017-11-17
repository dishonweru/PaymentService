
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfL0494VOutGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfL0494VOutGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="L0494VOutGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}L0494VOutGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfL0494VOutGrpItem", propOrder = {
    "l0494VOutGrpItem"
})
public class ArrayOfL0494VOutGrpItem {

    @XmlElement(name = "L0494VOutGrpItem")
    protected List<L0494VOutGrpItem> l0494VOutGrpItem;

    /**
     * Gets the value of the l0494VOutGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the l0494VOutGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getL0494VOutGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link L0494VOutGrpItem }
     * 
     * 
     */
    public List<L0494VOutGrpItem> getL0494VOutGrpItem() {
        if (l0494VOutGrpItem == null) {
            l0494VOutGrpItem = new ArrayList<L0494VOutGrpItem>();
        }
        return this.l0494VOutGrpItem;
    }

}
