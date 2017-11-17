
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PRT098VInGrpAccsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PRT098VInGrpAccsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpAccsInGrmAccsProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGrpAccsInGrmAccsProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpAccsInGrmAccsProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRT098VInGrpAccsItem", propOrder = {
    "inGrpAccsInGrmAccsProfitsAccountAccountCd",
    "inGrpAccsInGrmAccsProfitsAccountAccountNumber",
    "inGrpAccsInGrmAccsProfitsAccountPrftSystem"
})
public class PRT098VInGrpAccsItem {

    @XmlElement(name = "InGrpAccsInGrmAccsProfitsAccountAccountCd")
    protected short inGrpAccsInGrmAccsProfitsAccountAccountCd;
    @XmlElement(name = "InGrpAccsInGrmAccsProfitsAccountAccountNumber")
    protected String inGrpAccsInGrmAccsProfitsAccountAccountNumber;
    @XmlElement(name = "InGrpAccsInGrmAccsProfitsAccountPrftSystem")
    protected short inGrpAccsInGrmAccsProfitsAccountPrftSystem;

    /**
     * Gets the value of the inGrpAccsInGrmAccsProfitsAccountAccountCd property.
     * 
     */
    public short getInGrpAccsInGrmAccsProfitsAccountAccountCd() {
        return inGrpAccsInGrmAccsProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inGrpAccsInGrmAccsProfitsAccountAccountCd property.
     * 
     */
    public void setInGrpAccsInGrmAccsProfitsAccountAccountCd(short value) {
        this.inGrpAccsInGrmAccsProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inGrpAccsInGrmAccsProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpAccsInGrmAccsProfitsAccountAccountNumber() {
        return inGrpAccsInGrmAccsProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inGrpAccsInGrmAccsProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpAccsInGrmAccsProfitsAccountAccountNumber(String value) {
        this.inGrpAccsInGrmAccsProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inGrpAccsInGrmAccsProfitsAccountPrftSystem property.
     * 
     */
    public short getInGrpAccsInGrmAccsProfitsAccountPrftSystem() {
        return inGrpAccsInGrmAccsProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inGrpAccsInGrmAccsProfitsAccountPrftSystem property.
     * 
     */
    public void setInGrpAccsInGrmAccsProfitsAccountPrftSystem(short value) {
        this.inGrpAccsInGrmAccsProfitsAccountPrftSystem = value;
    }

}
