
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDTF078VOutGrpClearingSystemItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDTF078VOutGrpClearingSystemItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DTF078VOutGrpClearingSystemItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}DTF078VOutGrpClearingSystemItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDTF078VOutGrpClearingSystemItem", propOrder = {
    "dtf078VOutGrpClearingSystemItem"
})
public class ArrayOfDTF078VOutGrpClearingSystemItem {

    @XmlElement(name = "DTF078VOutGrpClearingSystemItem")
    protected List<DTF078VOutGrpClearingSystemItem> dtf078VOutGrpClearingSystemItem;

    /**
     * Gets the value of the dtf078VOutGrpClearingSystemItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dtf078VOutGrpClearingSystemItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDTF078VOutGrpClearingSystemItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTF078VOutGrpClearingSystemItem }
     * 
     * 
     */
    public List<DTF078VOutGrpClearingSystemItem> getDTF078VOutGrpClearingSystemItem() {
        if (dtf078VOutGrpClearingSystemItem == null) {
            dtf078VOutGrpClearingSystemItem = new ArrayList<DTF078VOutGrpClearingSystemItem>();
        }
        return this.dtf078VOutGrpClearingSystemItem;
    }

}
