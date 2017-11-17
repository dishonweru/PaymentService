
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfI0117VOutGrpSameIdItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfI0117VOutGrpSameIdItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="I0117VOutGrpSameIdItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}I0117VOutGrpSameIdItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfI0117VOutGrpSameIdItem", propOrder = {
    "i0117VOutGrpSameIdItem"
})
public class ArrayOfI0117VOutGrpSameIdItem {

    @XmlElement(name = "I0117VOutGrpSameIdItem")
    protected List<I0117VOutGrpSameIdItem> i0117VOutGrpSameIdItem;

    /**
     * Gets the value of the i0117VOutGrpSameIdItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the i0117VOutGrpSameIdItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getI0117VOutGrpSameIdItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link I0117VOutGrpSameIdItem }
     * 
     * 
     */
    public List<I0117VOutGrpSameIdItem> getI0117VOutGrpSameIdItem() {
        if (i0117VOutGrpSameIdItem == null) {
            i0117VOutGrpSameIdItem = new ArrayList<I0117VOutGrpSameIdItem>();
        }
        return this.i0117VOutGrpSameIdItem;
    }

}
