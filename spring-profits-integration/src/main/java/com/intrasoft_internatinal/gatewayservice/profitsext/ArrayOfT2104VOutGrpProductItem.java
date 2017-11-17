
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfT2104VOutGrpProductItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfT2104VOutGrpProductItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="T2104VOutGrpProductItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}T2104VOutGrpProductItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfT2104VOutGrpProductItem", propOrder = {
    "t2104VOutGrpProductItem"
})
public class ArrayOfT2104VOutGrpProductItem {

    @XmlElement(name = "T2104VOutGrpProductItem")
    protected List<T2104VOutGrpProductItem> t2104VOutGrpProductItem;

    /**
     * Gets the value of the t2104VOutGrpProductItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the t2104VOutGrpProductItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getT2104VOutGrpProductItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link T2104VOutGrpProductItem }
     * 
     * 
     */
    public List<T2104VOutGrpProductItem> getT2104VOutGrpProductItem() {
        if (t2104VOutGrpProductItem == null) {
            t2104VOutGrpProductItem = new ArrayList<T2104VOutGrpProductItem>();
        }
        return this.t2104VOutGrpProductItem;
    }

}
