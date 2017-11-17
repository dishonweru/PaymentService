
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfI0133VOutGrpSameAfmItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfI0133VOutGrpSameAfmItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="I0133VOutGrpSameAfmItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}I0133VOutGrpSameAfmItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfI0133VOutGrpSameAfmItem", propOrder = {
    "i0133VOutGrpSameAfmItem"
})
public class ArrayOfI0133VOutGrpSameAfmItem {

    @XmlElement(name = "I0133VOutGrpSameAfmItem")
    protected List<I0133VOutGrpSameAfmItem> i0133VOutGrpSameAfmItem;

    /**
     * Gets the value of the i0133VOutGrpSameAfmItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the i0133VOutGrpSameAfmItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getI0133VOutGrpSameAfmItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link I0133VOutGrpSameAfmItem }
     * 
     * 
     */
    public List<I0133VOutGrpSameAfmItem> getI0133VOutGrpSameAfmItem() {
        if (i0133VOutGrpSameAfmItem == null) {
            i0133VOutGrpSameAfmItem = new ArrayList<I0133VOutGrpSameAfmItem>();
        }
        return this.i0133VOutGrpSameAfmItem;
    }

}
