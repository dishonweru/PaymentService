
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for T2102VInGrpDaysItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T2102VInGrpDaysItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpDaysInGrmYesnoIefSuppliedYesno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T2102VInGrpDaysItem", propOrder = {
    "inGrpDaysInGrmYesnoIefSuppliedYesno"
})
public class T2102VInGrpDaysItem {

    @XmlElement(name = "InGrpDaysInGrmYesnoIefSuppliedYesno")
    protected String inGrpDaysInGrmYesnoIefSuppliedYesno;

    /**
     * Gets the value of the inGrpDaysInGrmYesnoIefSuppliedYesno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpDaysInGrmYesnoIefSuppliedYesno() {
        return inGrpDaysInGrmYesnoIefSuppliedYesno;
    }

    /**
     * Sets the value of the inGrpDaysInGrmYesnoIefSuppliedYesno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpDaysInGrmYesnoIefSuppliedYesno(String value) {
        this.inGrpDaysInGrmYesnoIefSuppliedYesno = value;
    }

}
