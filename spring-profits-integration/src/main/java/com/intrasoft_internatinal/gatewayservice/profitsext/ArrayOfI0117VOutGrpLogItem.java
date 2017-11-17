
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfI0117VOutGrpLogItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfI0117VOutGrpLogItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="I0117VOutGrpLogItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}I0117VOutGrpLogItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfI0117VOutGrpLogItem", propOrder = {
    "i0117VOutGrpLogItem"
})
public class ArrayOfI0117VOutGrpLogItem {

    @XmlElement(name = "I0117VOutGrpLogItem")
    protected List<I0117VOutGrpLogItem> i0117VOutGrpLogItem;

    /**
     * Gets the value of the i0117VOutGrpLogItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the i0117VOutGrpLogItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getI0117VOutGrpLogItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link I0117VOutGrpLogItem }
     * 
     * 
     */
    public List<I0117VOutGrpLogItem> getI0117VOutGrpLogItem() {
        if (i0117VOutGrpLogItem == null) {
            i0117VOutGrpLogItem = new ArrayList<I0117VOutGrpLogItem>();
        }
        return this.i0117VOutGrpLogItem;
    }

}
