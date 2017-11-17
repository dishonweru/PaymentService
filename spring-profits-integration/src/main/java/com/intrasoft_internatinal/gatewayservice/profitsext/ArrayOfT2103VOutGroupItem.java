
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfT2103VOutGroupItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfT2103VOutGroupItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="T2103VOutGroupItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}T2103VOutGroupItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfT2103VOutGroupItem", propOrder = {
    "t2103VOutGroupItem"
})
public class ArrayOfT2103VOutGroupItem {

    @XmlElement(name = "T2103VOutGroupItem")
    protected List<T2103VOutGroupItem> t2103VOutGroupItem;

    /**
     * Gets the value of the t2103VOutGroupItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the t2103VOutGroupItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getT2103VOutGroupItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link T2103VOutGroupItem }
     * 
     * 
     */
    public List<T2103VOutGroupItem> getT2103VOutGroupItem() {
        if (t2103VOutGroupItem == null) {
            t2103VOutGroupItem = new ArrayList<T2103VOutGroupItem>();
        }
        return this.t2103VOutGroupItem;
    }

}
