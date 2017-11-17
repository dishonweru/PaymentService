
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfT1423VOutGrpLogItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfT1423VOutGrpLogItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="T1423VOutGrpLogItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}T1423VOutGrpLogItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfT1423VOutGrpLogItem", propOrder = {
    "t1423VOutGrpLogItem"
})
public class ArrayOfT1423VOutGrpLogItem {

    @XmlElement(name = "T1423VOutGrpLogItem")
    protected List<T1423VOutGrpLogItem> t1423VOutGrpLogItem;

    /**
     * Gets the value of the t1423VOutGrpLogItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the t1423VOutGrpLogItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getT1423VOutGrpLogItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link T1423VOutGrpLogItem }
     * 
     * 
     */
    public List<T1423VOutGrpLogItem> getT1423VOutGrpLogItem() {
        if (t1423VOutGrpLogItem == null) {
            t1423VOutGrpLogItem = new ArrayList<T1423VOutGrpLogItem>();
        }
        return this.t1423VOutGrpLogItem;
    }

}
