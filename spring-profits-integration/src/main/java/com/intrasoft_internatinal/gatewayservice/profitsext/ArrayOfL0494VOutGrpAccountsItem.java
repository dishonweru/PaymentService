
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfL0494VOutGrpAccountsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfL0494VOutGrpAccountsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="L0494VOutGrpAccountsItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}L0494VOutGrpAccountsItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfL0494VOutGrpAccountsItem", propOrder = {
    "l0494VOutGrpAccountsItem"
})
public class ArrayOfL0494VOutGrpAccountsItem {

    @XmlElement(name = "L0494VOutGrpAccountsItem")
    protected List<L0494VOutGrpAccountsItem> l0494VOutGrpAccountsItem;

    /**
     * Gets the value of the l0494VOutGrpAccountsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the l0494VOutGrpAccountsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getL0494VOutGrpAccountsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link L0494VOutGrpAccountsItem }
     * 
     * 
     */
    public List<L0494VOutGrpAccountsItem> getL0494VOutGrpAccountsItem() {
        if (l0494VOutGrpAccountsItem == null) {
            l0494VOutGrpAccountsItem = new ArrayList<L0494VOutGrpAccountsItem>();
        }
        return this.l0494VOutGrpAccountsItem;
    }

}
