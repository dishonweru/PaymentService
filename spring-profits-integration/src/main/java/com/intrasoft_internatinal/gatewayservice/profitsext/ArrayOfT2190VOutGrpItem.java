
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfT2190VOutGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfT2190VOutGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="T2190VOutGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}T2190VOutGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfT2190VOutGrpItem", propOrder = {
    "t2190VOutGrpItem"
})
public class ArrayOfT2190VOutGrpItem {

    @XmlElement(name = "T2190VOutGrpItem")
    protected List<T2190VOutGrpItem> t2190VOutGrpItem;

    /**
     * Gets the value of the t2190VOutGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the t2190VOutGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getT2190VOutGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link T2190VOutGrpItem }
     * 
     * 
     */
    public List<T2190VOutGrpItem> getT2190VOutGrpItem() {
        if (t2190VOutGrpItem == null) {
            t2190VOutGrpItem = new ArrayList<T2190VOutGrpItem>();
        }
        return this.t2190VOutGrpItem;
    }

}
