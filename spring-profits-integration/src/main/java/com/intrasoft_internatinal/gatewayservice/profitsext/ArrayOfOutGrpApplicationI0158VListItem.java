
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOutGrpApplicationI0158VListItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutGrpApplicationI0158VListItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpApplicationI0158VListItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}OutGrpApplicationI0158VListItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutGrpApplicationI0158VListItem", propOrder = {
    "outGrpApplicationI0158VListItem"
})
public class ArrayOfOutGrpApplicationI0158VListItem {

    @XmlElement(name = "OutGrpApplicationI0158VListItem")
    protected List<OutGrpApplicationI0158VListItem> outGrpApplicationI0158VListItem;

    /**
     * Gets the value of the outGrpApplicationI0158VListItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outGrpApplicationI0158VListItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutGrpApplicationI0158VListItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutGrpApplicationI0158VListItem }
     * 
     * 
     */
    public List<OutGrpApplicationI0158VListItem> getOutGrpApplicationI0158VListItem() {
        if (outGrpApplicationI0158VListItem == null) {
            outGrpApplicationI0158VListItem = new ArrayList<OutGrpApplicationI0158VListItem>();
        }
        return this.outGrpApplicationI0158VListItem;
    }

}
