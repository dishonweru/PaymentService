
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for I0128VOutGrpAccountsAllowedItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="I0128VOutGrpAccountsAllowedItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpAccountsAllowedOutGrmAccountsIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAccountsAllowedOutGrmAccountsProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpAccountsAllowedOutGrmAccountsProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAccountsAllowedOutGrmAccountsProfitsAccountMonotoringUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpAccountsAllowedOutGrmAccountsProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "I0128VOutGrpAccountsAllowedItem", propOrder = {
    "outGrpAccountsAllowedOutGrmAccountsIefSuppliedSelectChar",
    "outGrpAccountsAllowedOutGrmAccountsProfitsAccountAccountCd",
    "outGrpAccountsAllowedOutGrmAccountsProfitsAccountAccountNumber",
    "outGrpAccountsAllowedOutGrmAccountsProfitsAccountMonotoringUnit",
    "outGrpAccountsAllowedOutGrmAccountsProfitsAccountPrftSystem"
})
public class I0128VOutGrpAccountsAllowedItem {

    @XmlElement(name = "OutGrpAccountsAllowedOutGrmAccountsIefSuppliedSelectChar")
    protected String outGrpAccountsAllowedOutGrmAccountsIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpAccountsAllowedOutGrmAccountsProfitsAccountAccountCd")
    protected short outGrpAccountsAllowedOutGrmAccountsProfitsAccountAccountCd;
    @XmlElement(name = "OutGrpAccountsAllowedOutGrmAccountsProfitsAccountAccountNumber")
    protected String outGrpAccountsAllowedOutGrmAccountsProfitsAccountAccountNumber;
    @XmlElement(name = "OutGrpAccountsAllowedOutGrmAccountsProfitsAccountMonotoringUnit")
    protected int outGrpAccountsAllowedOutGrmAccountsProfitsAccountMonotoringUnit;
    @XmlElement(name = "OutGrpAccountsAllowedOutGrmAccountsProfitsAccountPrftSystem")
    protected short outGrpAccountsAllowedOutGrmAccountsProfitsAccountPrftSystem;

    /**
     * Gets the value of the outGrpAccountsAllowedOutGrmAccountsIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAccountsAllowedOutGrmAccountsIefSuppliedSelectChar() {
        return outGrpAccountsAllowedOutGrmAccountsIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpAccountsAllowedOutGrmAccountsIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAccountsAllowedOutGrmAccountsIefSuppliedSelectChar(String value) {
        this.outGrpAccountsAllowedOutGrmAccountsIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpAccountsAllowedOutGrmAccountsProfitsAccountAccountCd property.
     * 
     */
    public short getOutGrpAccountsAllowedOutGrmAccountsProfitsAccountAccountCd() {
        return outGrpAccountsAllowedOutGrmAccountsProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outGrpAccountsAllowedOutGrmAccountsProfitsAccountAccountCd property.
     * 
     */
    public void setOutGrpAccountsAllowedOutGrmAccountsProfitsAccountAccountCd(short value) {
        this.outGrpAccountsAllowedOutGrmAccountsProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outGrpAccountsAllowedOutGrmAccountsProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAccountsAllowedOutGrmAccountsProfitsAccountAccountNumber() {
        return outGrpAccountsAllowedOutGrmAccountsProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outGrpAccountsAllowedOutGrmAccountsProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAccountsAllowedOutGrmAccountsProfitsAccountAccountNumber(String value) {
        this.outGrpAccountsAllowedOutGrmAccountsProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outGrpAccountsAllowedOutGrmAccountsProfitsAccountMonotoringUnit property.
     * 
     */
    public int getOutGrpAccountsAllowedOutGrmAccountsProfitsAccountMonotoringUnit() {
        return outGrpAccountsAllowedOutGrmAccountsProfitsAccountMonotoringUnit;
    }

    /**
     * Sets the value of the outGrpAccountsAllowedOutGrmAccountsProfitsAccountMonotoringUnit property.
     * 
     */
    public void setOutGrpAccountsAllowedOutGrmAccountsProfitsAccountMonotoringUnit(int value) {
        this.outGrpAccountsAllowedOutGrmAccountsProfitsAccountMonotoringUnit = value;
    }

    /**
     * Gets the value of the outGrpAccountsAllowedOutGrmAccountsProfitsAccountPrftSystem property.
     * 
     */
    public short getOutGrpAccountsAllowedOutGrmAccountsProfitsAccountPrftSystem() {
        return outGrpAccountsAllowedOutGrmAccountsProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the outGrpAccountsAllowedOutGrmAccountsProfitsAccountPrftSystem property.
     * 
     */
    public void setOutGrpAccountsAllowedOutGrmAccountsProfitsAccountPrftSystem(short value) {
        this.outGrpAccountsAllowedOutGrmAccountsProfitsAccountPrftSystem = value;
    }

}
