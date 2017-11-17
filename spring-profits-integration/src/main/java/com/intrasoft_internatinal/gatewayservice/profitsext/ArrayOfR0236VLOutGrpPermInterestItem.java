
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfR0236VLOutGrpPermInterestItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfR0236VLOutGrpPermInterestItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="R0236VLOutGrpPermInterestItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}R0236VLOutGrpPermInterestItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfR0236VLOutGrpPermInterestItem", propOrder = {
    "r0236VLOutGrpPermInterestItem"
})
public class ArrayOfR0236VLOutGrpPermInterestItem {

    @XmlElement(name = "R0236VLOutGrpPermInterestItem")
    protected List<R0236VLOutGrpPermInterestItem> r0236VLOutGrpPermInterestItem;

    /**
     * Gets the value of the r0236VLOutGrpPermInterestItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the r0236VLOutGrpPermInterestItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getR0236VLOutGrpPermInterestItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link R0236VLOutGrpPermInterestItem }
     * 
     * 
     */
    public List<R0236VLOutGrpPermInterestItem> getR0236VLOutGrpPermInterestItem() {
        if (r0236VLOutGrpPermInterestItem == null) {
            r0236VLOutGrpPermInterestItem = new ArrayList<R0236VLOutGrpPermInterestItem>();
        }
        return this.r0236VLOutGrpPermInterestItem;
    }

}
