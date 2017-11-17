
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CMS3601VInGrpAccountsItem_V2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CMS3601VInGrpAccountsItem_V2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpAccountsInGrmChksavDescCharSuppliedChar20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpAccountsInGrmCreditFlgIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpAccountsInGrmPrftAccProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGrpAccountsInGrmPrftAccProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpAccountsInGrmPrftAccProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGrpAccountsInGrmPrimaryFlgIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpAccountsInGrmSelectionIndIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CMS3601VInGrpAccountsItem_V2", propOrder = {
    "inGrpAccountsInGrmChksavDescCharSuppliedChar20",
    "inGrpAccountsInGrmCreditFlgIefSuppliedFlag",
    "inGrpAccountsInGrmPrftAccProfitsAccountAccountCd",
    "inGrpAccountsInGrmPrftAccProfitsAccountAccountNumber",
    "inGrpAccountsInGrmPrftAccProfitsAccountPrftSystem",
    "inGrpAccountsInGrmPrimaryFlgIefSuppliedFlag",
    "inGrpAccountsInGrmSelectionIndIefSuppliedSelectChar"
})
public class CMS3601VInGrpAccountsItemV2 {

    @XmlElement(name = "InGrpAccountsInGrmChksavDescCharSuppliedChar20")
    protected String inGrpAccountsInGrmChksavDescCharSuppliedChar20;
    @XmlElement(name = "InGrpAccountsInGrmCreditFlgIefSuppliedFlag")
    protected String inGrpAccountsInGrmCreditFlgIefSuppliedFlag;
    @XmlElement(name = "InGrpAccountsInGrmPrftAccProfitsAccountAccountCd")
    protected short inGrpAccountsInGrmPrftAccProfitsAccountAccountCd;
    @XmlElement(name = "InGrpAccountsInGrmPrftAccProfitsAccountAccountNumber")
    protected String inGrpAccountsInGrmPrftAccProfitsAccountAccountNumber;
    @XmlElement(name = "InGrpAccountsInGrmPrftAccProfitsAccountPrftSystem")
    protected short inGrpAccountsInGrmPrftAccProfitsAccountPrftSystem;
    @XmlElement(name = "InGrpAccountsInGrmPrimaryFlgIefSuppliedFlag")
    protected String inGrpAccountsInGrmPrimaryFlgIefSuppliedFlag;
    @XmlElement(name = "InGrpAccountsInGrmSelectionIndIefSuppliedSelectChar")
    protected String inGrpAccountsInGrmSelectionIndIefSuppliedSelectChar;

    /**
     * Gets the value of the inGrpAccountsInGrmChksavDescCharSuppliedChar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpAccountsInGrmChksavDescCharSuppliedChar20() {
        return inGrpAccountsInGrmChksavDescCharSuppliedChar20;
    }

    /**
     * Sets the value of the inGrpAccountsInGrmChksavDescCharSuppliedChar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpAccountsInGrmChksavDescCharSuppliedChar20(String value) {
        this.inGrpAccountsInGrmChksavDescCharSuppliedChar20 = value;
    }

    /**
     * Gets the value of the inGrpAccountsInGrmCreditFlgIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpAccountsInGrmCreditFlgIefSuppliedFlag() {
        return inGrpAccountsInGrmCreditFlgIefSuppliedFlag;
    }

    /**
     * Sets the value of the inGrpAccountsInGrmCreditFlgIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpAccountsInGrmCreditFlgIefSuppliedFlag(String value) {
        this.inGrpAccountsInGrmCreditFlgIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inGrpAccountsInGrmPrftAccProfitsAccountAccountCd property.
     * 
     */
    public short getInGrpAccountsInGrmPrftAccProfitsAccountAccountCd() {
        return inGrpAccountsInGrmPrftAccProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inGrpAccountsInGrmPrftAccProfitsAccountAccountCd property.
     * 
     */
    public void setInGrpAccountsInGrmPrftAccProfitsAccountAccountCd(short value) {
        this.inGrpAccountsInGrmPrftAccProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inGrpAccountsInGrmPrftAccProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpAccountsInGrmPrftAccProfitsAccountAccountNumber() {
        return inGrpAccountsInGrmPrftAccProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inGrpAccountsInGrmPrftAccProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpAccountsInGrmPrftAccProfitsAccountAccountNumber(String value) {
        this.inGrpAccountsInGrmPrftAccProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inGrpAccountsInGrmPrftAccProfitsAccountPrftSystem property.
     * 
     */
    public short getInGrpAccountsInGrmPrftAccProfitsAccountPrftSystem() {
        return inGrpAccountsInGrmPrftAccProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inGrpAccountsInGrmPrftAccProfitsAccountPrftSystem property.
     * 
     */
    public void setInGrpAccountsInGrmPrftAccProfitsAccountPrftSystem(short value) {
        this.inGrpAccountsInGrmPrftAccProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inGrpAccountsInGrmPrimaryFlgIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpAccountsInGrmPrimaryFlgIefSuppliedFlag() {
        return inGrpAccountsInGrmPrimaryFlgIefSuppliedFlag;
    }

    /**
     * Sets the value of the inGrpAccountsInGrmPrimaryFlgIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpAccountsInGrmPrimaryFlgIefSuppliedFlag(String value) {
        this.inGrpAccountsInGrmPrimaryFlgIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inGrpAccountsInGrmSelectionIndIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpAccountsInGrmSelectionIndIefSuppliedSelectChar() {
        return inGrpAccountsInGrmSelectionIndIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the inGrpAccountsInGrmSelectionIndIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpAccountsInGrmSelectionIndIefSuppliedSelectChar(String value) {
        this.inGrpAccountsInGrmSelectionIndIefSuppliedSelectChar = value;
    }

}
