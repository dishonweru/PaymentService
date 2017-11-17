
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfR0236VLOutGrpPermHissuItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfR0236VLOutGrpPermHissuItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="R0236VLOutGrpPermHissuItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}R0236VLOutGrpPermHissuItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfR0236VLOutGrpPermHissuItem", propOrder = {
    "r0236VLOutGrpPermHissuItem"
})
public class ArrayOfR0236VLOutGrpPermHissuItem {

    @XmlElement(name = "R0236VLOutGrpPermHissuItem")
    protected List<R0236VLOutGrpPermHissuItem> r0236VLOutGrpPermHissuItem;

    /**
     * Gets the value of the r0236VLOutGrpPermHissuItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the r0236VLOutGrpPermHissuItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getR0236VLOutGrpPermHissuItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link R0236VLOutGrpPermHissuItem }
     * 
     * 
     */
    public List<R0236VLOutGrpPermHissuItem> getR0236VLOutGrpPermHissuItem() {
        if (r0236VLOutGrpPermHissuItem == null) {
            r0236VLOutGrpPermHissuItem = new ArrayList<R0236VLOutGrpPermHissuItem>();
        }
        return this.r0236VLOutGrpPermHissuItem;
    }

}
