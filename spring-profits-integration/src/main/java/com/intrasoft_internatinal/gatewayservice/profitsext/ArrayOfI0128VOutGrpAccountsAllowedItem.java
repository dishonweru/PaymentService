
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfI0128VOutGrpAccountsAllowedItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfI0128VOutGrpAccountsAllowedItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="I0128VOutGrpAccountsAllowedItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}I0128VOutGrpAccountsAllowedItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfI0128VOutGrpAccountsAllowedItem", propOrder = {
    "i0128VOutGrpAccountsAllowedItem"
})
public class ArrayOfI0128VOutGrpAccountsAllowedItem {

    @XmlElement(name = "I0128VOutGrpAccountsAllowedItem")
    protected List<I0128VOutGrpAccountsAllowedItem> i0128VOutGrpAccountsAllowedItem;

    /**
     * Gets the value of the i0128VOutGrpAccountsAllowedItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the i0128VOutGrpAccountsAllowedItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getI0128VOutGrpAccountsAllowedItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link I0128VOutGrpAccountsAllowedItem }
     * 
     * 
     */
    public List<I0128VOutGrpAccountsAllowedItem> getI0128VOutGrpAccountsAllowedItem() {
        if (i0128VOutGrpAccountsAllowedItem == null) {
            i0128VOutGrpAccountsAllowedItem = new ArrayList<I0128VOutGrpAccountsAllowedItem>();
        }
        return this.i0128VOutGrpAccountsAllowedItem;
    }

}
