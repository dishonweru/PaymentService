
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfA1904VOutGrpAdviceTotalItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfA1904VOutGrpAdviceTotalItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="A1904VOutGrpAdviceTotalItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}A1904VOutGrpAdviceTotalItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfA1904VOutGrpAdviceTotalItem", propOrder = {
    "a1904VOutGrpAdviceTotalItem"
})
public class ArrayOfA1904VOutGrpAdviceTotalItem {

    @XmlElement(name = "A1904VOutGrpAdviceTotalItem")
    protected List<A1904VOutGrpAdviceTotalItem> a1904VOutGrpAdviceTotalItem;

    /**
     * Gets the value of the a1904VOutGrpAdviceTotalItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the a1904VOutGrpAdviceTotalItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getA1904VOutGrpAdviceTotalItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link A1904VOutGrpAdviceTotalItem }
     * 
     * 
     */
    public List<A1904VOutGrpAdviceTotalItem> getA1904VOutGrpAdviceTotalItem() {
        if (a1904VOutGrpAdviceTotalItem == null) {
            a1904VOutGrpAdviceTotalItem = new ArrayList<A1904VOutGrpAdviceTotalItem>();
        }
        return this.a1904VOutGrpAdviceTotalItem;
    }

}
