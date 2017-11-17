
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for L0401VOutGrpMediatorsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0401VOutGrpMediatorsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpMediatorsOutGrmMedtpGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpMediatorsOutGrmMedtpGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpMediatorsOutGrmCustomerCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpMediatorsOutGrmCustomerCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpMediatorsOutGrmDepProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpMediatorsOutGrmDepProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpMediatorsOutGrmSelChrIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpMediatorsOutGrmLnsMediatorAgreementNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpMediatorsOutGrmLnsMediatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0401VOutGrpMediatorsItem", propOrder = {
    "outGrpMediatorsOutGrmMedtpGenericDetailSerialNum",
    "outGrpMediatorsOutGrmMedtpGenericDetailDescription",
    "outGrpMediatorsOutGrmCustomerCustomerCustId",
    "outGrpMediatorsOutGrmCustomerCustomerCDigit",
    "outGrpMediatorsOutGrmDepProfitsAccountAccountNumber",
    "outGrpMediatorsOutGrmDepProfitsAccountAccountCd",
    "outGrpMediatorsOutGrmSelChrIefSuppliedSelectChar",
    "outGrpMediatorsOutGrmLnsMediatorAgreementNo",
    "outGrpMediatorsOutGrmLnsMediatorName"
})
public class L0401VOutGrpMediatorsItem {

    @XmlElement(name = "OutGrpMediatorsOutGrmMedtpGenericDetailSerialNum")
    protected int outGrpMediatorsOutGrmMedtpGenericDetailSerialNum;
    @XmlElement(name = "OutGrpMediatorsOutGrmMedtpGenericDetailDescription")
    protected String outGrpMediatorsOutGrmMedtpGenericDetailDescription;
    @XmlElement(name = "OutGrpMediatorsOutGrmCustomerCustomerCustId")
    protected int outGrpMediatorsOutGrmCustomerCustomerCustId;
    @XmlElement(name = "OutGrpMediatorsOutGrmCustomerCustomerCDigit")
    protected short outGrpMediatorsOutGrmCustomerCustomerCDigit;
    @XmlElement(name = "OutGrpMediatorsOutGrmDepProfitsAccountAccountNumber")
    protected String outGrpMediatorsOutGrmDepProfitsAccountAccountNumber;
    @XmlElement(name = "OutGrpMediatorsOutGrmDepProfitsAccountAccountCd")
    protected short outGrpMediatorsOutGrmDepProfitsAccountAccountCd;
    @XmlElement(name = "OutGrpMediatorsOutGrmSelChrIefSuppliedSelectChar")
    protected String outGrpMediatorsOutGrmSelChrIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpMediatorsOutGrmLnsMediatorAgreementNo")
    protected int outGrpMediatorsOutGrmLnsMediatorAgreementNo;
    @XmlElement(name = "OutGrpMediatorsOutGrmLnsMediatorName")
    protected String outGrpMediatorsOutGrmLnsMediatorName;

    /**
     * Gets the value of the outGrpMediatorsOutGrmMedtpGenericDetailSerialNum property.
     * 
     */
    public int getOutGrpMediatorsOutGrmMedtpGenericDetailSerialNum() {
        return outGrpMediatorsOutGrmMedtpGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outGrpMediatorsOutGrmMedtpGenericDetailSerialNum property.
     * 
     */
    public void setOutGrpMediatorsOutGrmMedtpGenericDetailSerialNum(int value) {
        this.outGrpMediatorsOutGrmMedtpGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outGrpMediatorsOutGrmMedtpGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpMediatorsOutGrmMedtpGenericDetailDescription() {
        return outGrpMediatorsOutGrmMedtpGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpMediatorsOutGrmMedtpGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpMediatorsOutGrmMedtpGenericDetailDescription(String value) {
        this.outGrpMediatorsOutGrmMedtpGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpMediatorsOutGrmCustomerCustomerCustId property.
     * 
     */
    public int getOutGrpMediatorsOutGrmCustomerCustomerCustId() {
        return outGrpMediatorsOutGrmCustomerCustomerCustId;
    }

    /**
     * Sets the value of the outGrpMediatorsOutGrmCustomerCustomerCustId property.
     * 
     */
    public void setOutGrpMediatorsOutGrmCustomerCustomerCustId(int value) {
        this.outGrpMediatorsOutGrmCustomerCustomerCustId = value;
    }

    /**
     * Gets the value of the outGrpMediatorsOutGrmCustomerCustomerCDigit property.
     * 
     */
    public short getOutGrpMediatorsOutGrmCustomerCustomerCDigit() {
        return outGrpMediatorsOutGrmCustomerCustomerCDigit;
    }

    /**
     * Sets the value of the outGrpMediatorsOutGrmCustomerCustomerCDigit property.
     * 
     */
    public void setOutGrpMediatorsOutGrmCustomerCustomerCDigit(short value) {
        this.outGrpMediatorsOutGrmCustomerCustomerCDigit = value;
    }

    /**
     * Gets the value of the outGrpMediatorsOutGrmDepProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpMediatorsOutGrmDepProfitsAccountAccountNumber() {
        return outGrpMediatorsOutGrmDepProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outGrpMediatorsOutGrmDepProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpMediatorsOutGrmDepProfitsAccountAccountNumber(String value) {
        this.outGrpMediatorsOutGrmDepProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outGrpMediatorsOutGrmDepProfitsAccountAccountCd property.
     * 
     */
    public short getOutGrpMediatorsOutGrmDepProfitsAccountAccountCd() {
        return outGrpMediatorsOutGrmDepProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outGrpMediatorsOutGrmDepProfitsAccountAccountCd property.
     * 
     */
    public void setOutGrpMediatorsOutGrmDepProfitsAccountAccountCd(short value) {
        this.outGrpMediatorsOutGrmDepProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outGrpMediatorsOutGrmSelChrIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpMediatorsOutGrmSelChrIefSuppliedSelectChar() {
        return outGrpMediatorsOutGrmSelChrIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpMediatorsOutGrmSelChrIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpMediatorsOutGrmSelChrIefSuppliedSelectChar(String value) {
        this.outGrpMediatorsOutGrmSelChrIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpMediatorsOutGrmLnsMediatorAgreementNo property.
     * 
     */
    public int getOutGrpMediatorsOutGrmLnsMediatorAgreementNo() {
        return outGrpMediatorsOutGrmLnsMediatorAgreementNo;
    }

    /**
     * Sets the value of the outGrpMediatorsOutGrmLnsMediatorAgreementNo property.
     * 
     */
    public void setOutGrpMediatorsOutGrmLnsMediatorAgreementNo(int value) {
        this.outGrpMediatorsOutGrmLnsMediatorAgreementNo = value;
    }

    /**
     * Gets the value of the outGrpMediatorsOutGrmLnsMediatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpMediatorsOutGrmLnsMediatorName() {
        return outGrpMediatorsOutGrmLnsMediatorName;
    }

    /**
     * Sets the value of the outGrpMediatorsOutGrmLnsMediatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpMediatorsOutGrmLnsMediatorName(String value) {
        this.outGrpMediatorsOutGrmLnsMediatorName = value;
    }

}
