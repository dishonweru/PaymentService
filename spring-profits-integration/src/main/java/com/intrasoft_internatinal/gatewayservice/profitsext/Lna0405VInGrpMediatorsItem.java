
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Lna0405VInGrpMediatorsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Lna0405VInGrpMediatorsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpMediatorsInGrmMedtpGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpMediatorsInGrmMedtpGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpMediatorsInGrmCustomerCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpMediatorsInGrmCustomerCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGrpMediatorsInGrmDepProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpMediatorsInGrmDepProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGrpMediatorsInGrmSelChrIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpMediatorsInGrmLnsMediatorAgreementNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpMediatorsInGrmLnsMediatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lna0405VInGrpMediatorsItem", propOrder = {
    "inGrpMediatorsInGrmMedtpGenericDetailSerialNum",
    "inGrpMediatorsInGrmMedtpGenericDetailDescription",
    "inGrpMediatorsInGrmCustomerCustomerCustId",
    "inGrpMediatorsInGrmCustomerCustomerCDigit",
    "inGrpMediatorsInGrmDepProfitsAccountAccountNumber",
    "inGrpMediatorsInGrmDepProfitsAccountAccountCd",
    "inGrpMediatorsInGrmSelChrIefSuppliedSelectChar",
    "inGrpMediatorsInGrmLnsMediatorAgreementNo",
    "inGrpMediatorsInGrmLnsMediatorName"
})
public class Lna0405VInGrpMediatorsItem {

    @XmlElement(name = "InGrpMediatorsInGrmMedtpGenericDetailSerialNum")
    protected int inGrpMediatorsInGrmMedtpGenericDetailSerialNum;
    @XmlElement(name = "InGrpMediatorsInGrmMedtpGenericDetailDescription")
    protected String inGrpMediatorsInGrmMedtpGenericDetailDescription;
    @XmlElement(name = "InGrpMediatorsInGrmCustomerCustomerCustId")
    protected int inGrpMediatorsInGrmCustomerCustomerCustId;
    @XmlElement(name = "InGrpMediatorsInGrmCustomerCustomerCDigit")
    protected short inGrpMediatorsInGrmCustomerCustomerCDigit;
    @XmlElement(name = "InGrpMediatorsInGrmDepProfitsAccountAccountNumber")
    protected String inGrpMediatorsInGrmDepProfitsAccountAccountNumber;
    @XmlElement(name = "InGrpMediatorsInGrmDepProfitsAccountAccountCd")
    protected short inGrpMediatorsInGrmDepProfitsAccountAccountCd;
    @XmlElement(name = "InGrpMediatorsInGrmSelChrIefSuppliedSelectChar")
    protected String inGrpMediatorsInGrmSelChrIefSuppliedSelectChar;
    @XmlElement(name = "InGrpMediatorsInGrmLnsMediatorAgreementNo")
    protected int inGrpMediatorsInGrmLnsMediatorAgreementNo;
    @XmlElement(name = "InGrpMediatorsInGrmLnsMediatorName")
    protected String inGrpMediatorsInGrmLnsMediatorName;

    /**
     * Gets the value of the inGrpMediatorsInGrmMedtpGenericDetailSerialNum property.
     * 
     */
    public int getInGrpMediatorsInGrmMedtpGenericDetailSerialNum() {
        return inGrpMediatorsInGrmMedtpGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inGrpMediatorsInGrmMedtpGenericDetailSerialNum property.
     * 
     */
    public void setInGrpMediatorsInGrmMedtpGenericDetailSerialNum(int value) {
        this.inGrpMediatorsInGrmMedtpGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inGrpMediatorsInGrmMedtpGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpMediatorsInGrmMedtpGenericDetailDescription() {
        return inGrpMediatorsInGrmMedtpGenericDetailDescription;
    }

    /**
     * Sets the value of the inGrpMediatorsInGrmMedtpGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpMediatorsInGrmMedtpGenericDetailDescription(String value) {
        this.inGrpMediatorsInGrmMedtpGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inGrpMediatorsInGrmCustomerCustomerCustId property.
     * 
     */
    public int getInGrpMediatorsInGrmCustomerCustomerCustId() {
        return inGrpMediatorsInGrmCustomerCustomerCustId;
    }

    /**
     * Sets the value of the inGrpMediatorsInGrmCustomerCustomerCustId property.
     * 
     */
    public void setInGrpMediatorsInGrmCustomerCustomerCustId(int value) {
        this.inGrpMediatorsInGrmCustomerCustomerCustId = value;
    }

    /**
     * Gets the value of the inGrpMediatorsInGrmCustomerCustomerCDigit property.
     * 
     */
    public short getInGrpMediatorsInGrmCustomerCustomerCDigit() {
        return inGrpMediatorsInGrmCustomerCustomerCDigit;
    }

    /**
     * Sets the value of the inGrpMediatorsInGrmCustomerCustomerCDigit property.
     * 
     */
    public void setInGrpMediatorsInGrmCustomerCustomerCDigit(short value) {
        this.inGrpMediatorsInGrmCustomerCustomerCDigit = value;
    }

    /**
     * Gets the value of the inGrpMediatorsInGrmDepProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpMediatorsInGrmDepProfitsAccountAccountNumber() {
        return inGrpMediatorsInGrmDepProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inGrpMediatorsInGrmDepProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpMediatorsInGrmDepProfitsAccountAccountNumber(String value) {
        this.inGrpMediatorsInGrmDepProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inGrpMediatorsInGrmDepProfitsAccountAccountCd property.
     * 
     */
    public short getInGrpMediatorsInGrmDepProfitsAccountAccountCd() {
        return inGrpMediatorsInGrmDepProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inGrpMediatorsInGrmDepProfitsAccountAccountCd property.
     * 
     */
    public void setInGrpMediatorsInGrmDepProfitsAccountAccountCd(short value) {
        this.inGrpMediatorsInGrmDepProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inGrpMediatorsInGrmSelChrIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpMediatorsInGrmSelChrIefSuppliedSelectChar() {
        return inGrpMediatorsInGrmSelChrIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the inGrpMediatorsInGrmSelChrIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpMediatorsInGrmSelChrIefSuppliedSelectChar(String value) {
        this.inGrpMediatorsInGrmSelChrIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the inGrpMediatorsInGrmLnsMediatorAgreementNo property.
     * 
     */
    public int getInGrpMediatorsInGrmLnsMediatorAgreementNo() {
        return inGrpMediatorsInGrmLnsMediatorAgreementNo;
    }

    /**
     * Sets the value of the inGrpMediatorsInGrmLnsMediatorAgreementNo property.
     * 
     */
    public void setInGrpMediatorsInGrmLnsMediatorAgreementNo(int value) {
        this.inGrpMediatorsInGrmLnsMediatorAgreementNo = value;
    }

    /**
     * Gets the value of the inGrpMediatorsInGrmLnsMediatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpMediatorsInGrmLnsMediatorName() {
        return inGrpMediatorsInGrmLnsMediatorName;
    }

    /**
     * Sets the value of the inGrpMediatorsInGrmLnsMediatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpMediatorsInGrmLnsMediatorName(String value) {
        this.inGrpMediatorsInGrmLnsMediatorName = value;
    }

}
