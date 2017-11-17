
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfL0449VOutGrpPropertyCollExtraItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfL0449VOutGrpPropertyCollExtraItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="L0449VOutGrpPropertyCollExtraItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}L0449VOutGrpPropertyCollExtraItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfL0449VOutGrpPropertyCollExtraItem", propOrder = {
    "l0449VOutGrpPropertyCollExtraItem"
})
public class ArrayOfL0449VOutGrpPropertyCollExtraItem {

    @XmlElement(name = "L0449VOutGrpPropertyCollExtraItem")
    protected List<L0449VOutGrpPropertyCollExtraItem> l0449VOutGrpPropertyCollExtraItem;

    /**
     * Gets the value of the l0449VOutGrpPropertyCollExtraItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the l0449VOutGrpPropertyCollExtraItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getL0449VOutGrpPropertyCollExtraItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link L0449VOutGrpPropertyCollExtraItem }
     * 
     * 
     */
    public List<L0449VOutGrpPropertyCollExtraItem> getL0449VOutGrpPropertyCollExtraItem() {
        if (l0449VOutGrpPropertyCollExtraItem == null) {
            l0449VOutGrpPropertyCollExtraItem = new ArrayList<L0449VOutGrpPropertyCollExtraItem>();
        }
        return this.l0449VOutGrpPropertyCollExtraItem;
    }

}
