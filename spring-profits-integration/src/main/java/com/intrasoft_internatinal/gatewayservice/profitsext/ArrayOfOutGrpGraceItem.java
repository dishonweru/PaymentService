
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOutGrpGraceItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutGrpGraceItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpGraceItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}OutGrpGraceItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutGrpGraceItem", propOrder = {
    "outGrpGraceItem"
})
public class ArrayOfOutGrpGraceItem {

    @XmlElement(name = "OutGrpGraceItem")
    protected List<OutGrpGraceItem> outGrpGraceItem;

    /**
     * Gets the value of the outGrpGraceItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outGrpGraceItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutGrpGraceItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutGrpGraceItem }
     * 
     * 
     */
    public List<OutGrpGraceItem> getOutGrpGraceItem() {
        if (outGrpGraceItem == null) {
            outGrpGraceItem = new ArrayList<OutGrpGraceItem>();
        }
        return this.outGrpGraceItem;
    }

}
