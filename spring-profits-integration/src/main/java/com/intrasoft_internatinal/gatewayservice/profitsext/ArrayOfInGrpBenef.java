
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInGrpBenef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInGrpBenef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpBenef" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}InGrpBenef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInGrpBenef", propOrder = {
    "inGrpBenef"
})
public class ArrayOfInGrpBenef {

    @XmlElement(name = "InGrpBenef")
    protected List<InGrpBenef> inGrpBenef;

    /**
     * Gets the value of the inGrpBenef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inGrpBenef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInGrpBenef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InGrpBenef }
     * 
     * 
     */
    public List<InGrpBenef> getInGrpBenef() {
        if (inGrpBenef == null) {
            inGrpBenef = new ArrayList<InGrpBenef>();
        }
        return this.inGrpBenef;
    }

}
