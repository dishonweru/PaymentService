
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfT2102VOutGrpDaysItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfT2102VOutGrpDaysItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="T2102VOutGrpDaysItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}T2102VOutGrpDaysItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfT2102VOutGrpDaysItem", propOrder = {
    "t2102VOutGrpDaysItem"
})
public class ArrayOfT2102VOutGrpDaysItem {

    @XmlElement(name = "T2102VOutGrpDaysItem")
    protected List<T2102VOutGrpDaysItem> t2102VOutGrpDaysItem;

    /**
     * Gets the value of the t2102VOutGrpDaysItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the t2102VOutGrpDaysItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getT2102VOutGrpDaysItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link T2102VOutGrpDaysItem }
     * 
     * 
     */
    public List<T2102VOutGrpDaysItem> getT2102VOutGrpDaysItem() {
        if (t2102VOutGrpDaysItem == null) {
            t2102VOutGrpDaysItem = new ArrayList<T2102VOutGrpDaysItem>();
        }
        return this.t2102VOutGrpDaysItem;
    }

}
