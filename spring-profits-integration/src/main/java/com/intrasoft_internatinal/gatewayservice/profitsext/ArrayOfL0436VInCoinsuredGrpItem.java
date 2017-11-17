
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfL0436VInCoinsuredGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfL0436VInCoinsuredGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="L0436VInCoinsuredGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}L0436VInCoinsuredGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfL0436VInCoinsuredGrpItem", propOrder = {
    "l0436VInCoinsuredGrpItem"
})
public class ArrayOfL0436VInCoinsuredGrpItem {

    @XmlElement(name = "L0436VInCoinsuredGrpItem")
    protected List<L0436VInCoinsuredGrpItem> l0436VInCoinsuredGrpItem;

    /**
     * Gets the value of the l0436VInCoinsuredGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the l0436VInCoinsuredGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getL0436VInCoinsuredGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link L0436VInCoinsuredGrpItem }
     * 
     * 
     */
    public List<L0436VInCoinsuredGrpItem> getL0436VInCoinsuredGrpItem() {
        if (l0436VInCoinsuredGrpItem == null) {
            l0436VInCoinsuredGrpItem = new ArrayList<L0436VInCoinsuredGrpItem>();
        }
        return this.l0436VInCoinsuredGrpItem;
    }

}
