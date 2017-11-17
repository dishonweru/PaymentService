
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfR0236VLOutGrpPermSubsidyItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfR0236VLOutGrpPermSubsidyItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="R0236VLOutGrpPermSubsidyItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}R0236VLOutGrpPermSubsidyItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfR0236VLOutGrpPermSubsidyItem", propOrder = {
    "r0236VLOutGrpPermSubsidyItem"
})
public class ArrayOfR0236VLOutGrpPermSubsidyItem {

    @XmlElement(name = "R0236VLOutGrpPermSubsidyItem")
    protected List<R0236VLOutGrpPermSubsidyItem> r0236VLOutGrpPermSubsidyItem;

    /**
     * Gets the value of the r0236VLOutGrpPermSubsidyItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the r0236VLOutGrpPermSubsidyItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getR0236VLOutGrpPermSubsidyItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link R0236VLOutGrpPermSubsidyItem }
     * 
     * 
     */
    public List<R0236VLOutGrpPermSubsidyItem> getR0236VLOutGrpPermSubsidyItem() {
        if (r0236VLOutGrpPermSubsidyItem == null) {
            r0236VLOutGrpPermSubsidyItem = new ArrayList<R0236VLOutGrpPermSubsidyItem>();
        }
        return this.r0236VLOutGrpPermSubsidyItem;
    }

}
