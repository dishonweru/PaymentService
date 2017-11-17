
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfT2102VInGrpDaysItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfT2102VInGrpDaysItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="T2102VInGrpDaysItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}T2102VInGrpDaysItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfT2102VInGrpDaysItem", propOrder = {
    "t2102VInGrpDaysItem"
})
public class ArrayOfT2102VInGrpDaysItem {

    @XmlElement(name = "T2102VInGrpDaysItem")
    protected List<T2102VInGrpDaysItem> t2102VInGrpDaysItem;

    /**
     * Gets the value of the t2102VInGrpDaysItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the t2102VInGrpDaysItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getT2102VInGrpDaysItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link T2102VInGrpDaysItem }
     * 
     * 
     */
    public List<T2102VInGrpDaysItem> getT2102VInGrpDaysItem() {
        if (t2102VInGrpDaysItem == null) {
            t2102VInGrpDaysItem = new ArrayList<T2102VInGrpDaysItem>();
        }
        return this.t2102VInGrpDaysItem;
    }

}
