
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfT1477VOutGrpVoucherItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfT1477VOutGrpVoucherItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="T1477VOutGrpVoucherItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}T1477VOutGrpVoucherItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfT1477VOutGrpVoucherItem", propOrder = {
    "t1477VOutGrpVoucherItem"
})
public class ArrayOfT1477VOutGrpVoucherItem {

    @XmlElement(name = "T1477VOutGrpVoucherItem")
    protected List<T1477VOutGrpVoucherItem> t1477VOutGrpVoucherItem;

    /**
     * Gets the value of the t1477VOutGrpVoucherItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the t1477VOutGrpVoucherItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getT1477VOutGrpVoucherItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link T1477VOutGrpVoucherItem }
     * 
     * 
     */
    public List<T1477VOutGrpVoucherItem> getT1477VOutGrpVoucherItem() {
        if (t1477VOutGrpVoucherItem == null) {
            t1477VOutGrpVoucherItem = new ArrayList<T1477VOutGrpVoucherItem>();
        }
        return this.t1477VOutGrpVoucherItem;
    }

}
