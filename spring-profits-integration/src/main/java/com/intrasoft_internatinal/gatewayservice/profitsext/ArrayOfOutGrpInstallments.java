
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOutGrpInstallments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutGrpInstallments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpInstallments" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}OutGrpInstallments" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutGrpInstallments", propOrder = {
    "outGrpInstallments"
})
public class ArrayOfOutGrpInstallments {

    @XmlElement(name = "OutGrpInstallments")
    protected List<OutGrpInstallments> outGrpInstallments;

    /**
     * Gets the value of the outGrpInstallments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outGrpInstallments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutGrpInstallments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutGrpInstallments }
     * 
     * 
     */
    public List<OutGrpInstallments> getOutGrpInstallments() {
        if (outGrpInstallments == null) {
            outGrpInstallments = new ArrayList<OutGrpInstallments>();
        }
        return this.outGrpInstallments;
    }

}
