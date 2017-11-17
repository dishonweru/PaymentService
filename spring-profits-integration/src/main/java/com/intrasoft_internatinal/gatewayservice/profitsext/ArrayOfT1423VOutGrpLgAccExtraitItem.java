
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfT1423VOutGrpLgAccExtraitItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfT1423VOutGrpLgAccExtraitItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="T1423VOutGrpLgAccExtraitItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}T1423VOutGrpLgAccExtraitItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfT1423VOutGrpLgAccExtraitItem", propOrder = {
    "t1423VOutGrpLgAccExtraitItem"
})
public class ArrayOfT1423VOutGrpLgAccExtraitItem {

    @XmlElement(name = "T1423VOutGrpLgAccExtraitItem")
    protected List<T1423VOutGrpLgAccExtraitItem> t1423VOutGrpLgAccExtraitItem;

    /**
     * Gets the value of the t1423VOutGrpLgAccExtraitItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the t1423VOutGrpLgAccExtraitItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getT1423VOutGrpLgAccExtraitItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link T1423VOutGrpLgAccExtraitItem }
     * 
     * 
     */
    public List<T1423VOutGrpLgAccExtraitItem> getT1423VOutGrpLgAccExtraitItem() {
        if (t1423VOutGrpLgAccExtraitItem == null) {
            t1423VOutGrpLgAccExtraitItem = new ArrayList<T1423VOutGrpLgAccExtraitItem>();
        }
        return this.t1423VOutGrpLgAccExtraitItem;
    }

}
