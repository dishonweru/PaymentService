
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfT2104VOutGrpUnpaidStandingOrdersItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfT2104VOutGrpUnpaidStandingOrdersItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="T2104VOutGrpUnpaidStandingOrdersItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}T2104VOutGrpUnpaidStandingOrdersItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfT2104VOutGrpUnpaidStandingOrdersItem", propOrder = {
    "t2104VOutGrpUnpaidStandingOrdersItem"
})
public class ArrayOfT2104VOutGrpUnpaidStandingOrdersItem {

    @XmlElement(name = "T2104VOutGrpUnpaidStandingOrdersItem")
    protected List<T2104VOutGrpUnpaidStandingOrdersItem> t2104VOutGrpUnpaidStandingOrdersItem;

    /**
     * Gets the value of the t2104VOutGrpUnpaidStandingOrdersItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the t2104VOutGrpUnpaidStandingOrdersItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getT2104VOutGrpUnpaidStandingOrdersItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link T2104VOutGrpUnpaidStandingOrdersItem }
     * 
     * 
     */
    public List<T2104VOutGrpUnpaidStandingOrdersItem> getT2104VOutGrpUnpaidStandingOrdersItem() {
        if (t2104VOutGrpUnpaidStandingOrdersItem == null) {
            t2104VOutGrpUnpaidStandingOrdersItem = new ArrayList<T2104VOutGrpUnpaidStandingOrdersItem>();
        }
        return this.t2104VOutGrpUnpaidStandingOrdersItem;
    }

}
