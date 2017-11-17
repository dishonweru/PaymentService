
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXT8103VInGrpAccountsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXT8103VInGrpAccountsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpAccountsInGrmProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGrpAccountsInGrmProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpAccountsInGrmProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXT8103VInGrpAccountsItem", propOrder = {
    "inGrpAccountsInGrmProfitsAccountAccountCd",
    "inGrpAccountsInGrmProfitsAccountAccountNumber",
    "inGrpAccountsInGrmProfitsAccountPrftSystem"
})
public class EXT8103VInGrpAccountsItem {

    @XmlElement(name = "InGrpAccountsInGrmProfitsAccountAccountCd")
    protected short inGrpAccountsInGrmProfitsAccountAccountCd;
    @XmlElement(name = "InGrpAccountsInGrmProfitsAccountAccountNumber")
    protected String inGrpAccountsInGrmProfitsAccountAccountNumber;
    @XmlElement(name = "InGrpAccountsInGrmProfitsAccountPrftSystem")
    protected short inGrpAccountsInGrmProfitsAccountPrftSystem;

    /**
     * Gets the value of the inGrpAccountsInGrmProfitsAccountAccountCd property.
     * 
     */
    public short getInGrpAccountsInGrmProfitsAccountAccountCd() {
        return inGrpAccountsInGrmProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inGrpAccountsInGrmProfitsAccountAccountCd property.
     * 
     */
    public void setInGrpAccountsInGrmProfitsAccountAccountCd(short value) {
        this.inGrpAccountsInGrmProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inGrpAccountsInGrmProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpAccountsInGrmProfitsAccountAccountNumber() {
        return inGrpAccountsInGrmProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inGrpAccountsInGrmProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpAccountsInGrmProfitsAccountAccountNumber(String value) {
        this.inGrpAccountsInGrmProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inGrpAccountsInGrmProfitsAccountPrftSystem property.
     * 
     */
    public short getInGrpAccountsInGrmProfitsAccountPrftSystem() {
        return inGrpAccountsInGrmProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inGrpAccountsInGrmProfitsAccountPrftSystem property.
     * 
     */
    public void setInGrpAccountsInGrmProfitsAccountPrftSystem(short value) {
        this.inGrpAccountsInGrmProfitsAccountPrftSystem = value;
    }

}
