
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfR0236VLOutGrpPermUnitItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfR0236VLOutGrpPermUnitItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="R0236VLOutGrpPermUnitItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}R0236VLOutGrpPermUnitItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfR0236VLOutGrpPermUnitItem", propOrder = {
    "r0236VLOutGrpPermUnitItem"
})
public class ArrayOfR0236VLOutGrpPermUnitItem {

    @XmlElement(name = "R0236VLOutGrpPermUnitItem")
    protected List<R0236VLOutGrpPermUnitItem> r0236VLOutGrpPermUnitItem;

    /**
     * Gets the value of the r0236VLOutGrpPermUnitItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the r0236VLOutGrpPermUnitItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getR0236VLOutGrpPermUnitItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link R0236VLOutGrpPermUnitItem }
     * 
     * 
     */
    public List<R0236VLOutGrpPermUnitItem> getR0236VLOutGrpPermUnitItem() {
        if (r0236VLOutGrpPermUnitItem == null) {
            r0236VLOutGrpPermUnitItem = new ArrayList<R0236VLOutGrpPermUnitItem>();
        }
        return this.r0236VLOutGrpPermUnitItem;
    }

}
