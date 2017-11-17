
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for T2102VOutGrpDaysItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T2102VOutGrpDaysItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpDaysOutGrmYesnoIefSuppliedYesno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T2102VOutGrpDaysItem", propOrder = {
    "outGrpDaysOutGrmYesnoIefSuppliedYesno"
})
public class T2102VOutGrpDaysItem {

    @XmlElement(name = "OutGrpDaysOutGrmYesnoIefSuppliedYesno")
    protected String outGrpDaysOutGrmYesnoIefSuppliedYesno;

    /**
     * Gets the value of the outGrpDaysOutGrmYesnoIefSuppliedYesno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDaysOutGrmYesnoIefSuppliedYesno() {
        return outGrpDaysOutGrmYesnoIefSuppliedYesno;
    }

    /**
     * Sets the value of the outGrpDaysOutGrmYesnoIefSuppliedYesno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDaysOutGrmYesnoIefSuppliedYesno(String value) {
        this.outGrpDaysOutGrmYesnoIefSuppliedYesno = value;
    }

}
