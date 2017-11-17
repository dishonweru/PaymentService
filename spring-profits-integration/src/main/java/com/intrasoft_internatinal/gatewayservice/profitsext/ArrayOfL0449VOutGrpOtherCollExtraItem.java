
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfL0449VOutGrpOtherCollExtraItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfL0449VOutGrpOtherCollExtraItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="L0449VOutGrpOtherCollExtraItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}L0449VOutGrpOtherCollExtraItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfL0449VOutGrpOtherCollExtraItem", propOrder = {
    "l0449VOutGrpOtherCollExtraItem"
})
public class ArrayOfL0449VOutGrpOtherCollExtraItem {

    @XmlElement(name = "L0449VOutGrpOtherCollExtraItem")
    protected List<L0449VOutGrpOtherCollExtraItem> l0449VOutGrpOtherCollExtraItem;

    /**
     * Gets the value of the l0449VOutGrpOtherCollExtraItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the l0449VOutGrpOtherCollExtraItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getL0449VOutGrpOtherCollExtraItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link L0449VOutGrpOtherCollExtraItem }
     * 
     * 
     */
    public List<L0449VOutGrpOtherCollExtraItem> getL0449VOutGrpOtherCollExtraItem() {
        if (l0449VOutGrpOtherCollExtraItem == null) {
            l0449VOutGrpOtherCollExtraItem = new ArrayList<L0449VOutGrpOtherCollExtraItem>();
        }
        return this.l0449VOutGrpOtherCollExtraItem;
    }

}
