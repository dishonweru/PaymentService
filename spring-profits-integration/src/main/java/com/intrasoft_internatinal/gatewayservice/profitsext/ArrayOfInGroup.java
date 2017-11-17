
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGroup" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}InGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInGroup", propOrder = {
    "inGroup"
})
public class ArrayOfInGroup {

    @XmlElement(name = "InGroup")
    protected List<InGroup> inGroup;

    /**
     * Gets the value of the inGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InGroup }
     * 
     * 
     */
    public List<InGroup> getInGroup() {
        if (inGroup == null) {
            inGroup = new ArrayList<InGroup>();
        }
        return this.inGroup;
    }

}
