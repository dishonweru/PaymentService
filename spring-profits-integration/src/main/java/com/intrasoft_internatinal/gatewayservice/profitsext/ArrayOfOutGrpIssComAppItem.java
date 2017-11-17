
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOutGrpIssComAppItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutGrpIssComAppItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpIssComAppItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}OutGrpIssComAppItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutGrpIssComAppItem", propOrder = {
    "outGrpIssComAppItem"
})
public class ArrayOfOutGrpIssComAppItem {

    @XmlElement(name = "OutGrpIssComAppItem")
    protected List<OutGrpIssComAppItem> outGrpIssComAppItem;

    /**
     * Gets the value of the outGrpIssComAppItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outGrpIssComAppItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutGrpIssComAppItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutGrpIssComAppItem }
     * 
     * 
     */
    public List<OutGrpIssComAppItem> getOutGrpIssComAppItem() {
        if (outGrpIssComAppItem == null) {
            outGrpIssComAppItem = new ArrayList<OutGrpIssComAppItem>();
        }
        return this.outGrpIssComAppItem;
    }

}
