
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOutGrpApplicDetailsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutGrpApplicDetailsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpApplicDetailsItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}OutGrpApplicDetailsItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutGrpApplicDetailsItem", propOrder = {
    "outGrpApplicDetailsItem"
})
public class ArrayOfOutGrpApplicDetailsItem {

    @XmlElement(name = "OutGrpApplicDetailsItem")
    protected List<OutGrpApplicDetailsItem> outGrpApplicDetailsItem;

    /**
     * Gets the value of the outGrpApplicDetailsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outGrpApplicDetailsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutGrpApplicDetailsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutGrpApplicDetailsItem }
     * 
     * 
     */
    public List<OutGrpApplicDetailsItem> getOutGrpApplicDetailsItem() {
        if (outGrpApplicDetailsItem == null) {
            outGrpApplicDetailsItem = new ArrayList<OutGrpApplicDetailsItem>();
        }
        return this.outGrpApplicDetailsItem;
    }

}
