
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOutGrpAgrBenef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutGrpAgrBenef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpAgrBenef" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}OutGrpAgrBenef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutGrpAgrBenef", propOrder = {
    "outGrpAgrBenef"
})
public class ArrayOfOutGrpAgrBenef {

    @XmlElement(name = "OutGrpAgrBenef")
    protected List<OutGrpAgrBenef> outGrpAgrBenef;

    /**
     * Gets the value of the outGrpAgrBenef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outGrpAgrBenef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutGrpAgrBenef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutGrpAgrBenef }
     * 
     * 
     */
    public List<OutGrpAgrBenef> getOutGrpAgrBenef() {
        if (outGrpAgrBenef == null) {
            outGrpAgrBenef = new ArrayList<OutGrpAgrBenef>();
        }
        return this.outGrpAgrBenef;
    }

}
