
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StandbyCollectionPaymentImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StandbyCollectionPaymentImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InClientMntRecordingAuthorizer1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InClientMntRecordingAuthorizer2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InClientMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InClientMntRecordingPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InClientMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InClientMntRecordingTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCpStandbyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InCpStandbyCpAgreementNo" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InCpStandbyDataField1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpStandbyDataField2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpStandbyDataField3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpStandbyDataField4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpStandbyExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCpStandbyRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpStandbyStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpStandbyCurrencyAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandbyCollectionPaymentImport", propOrder = {
    "inClientMntRecordingAuthorizer1",
    "inClientMntRecordingAuthorizer2",
    "inClientMntRecordingTerminalNumber",
    "inClientMntRecordingPrftSystem",
    "inClientMntRecordingReversalFlag",
    "inClientMntRecordingTrxCode",
    "inCpStandbyAmount",
    "inCpStandbyCpAgreementNo",
    "inCpStandbyDataField1",
    "inCpStandbyDataField2",
    "inCpStandbyDataField3",
    "inCpStandbyDataField4",
    "inCpStandbyExpiryDate",
    "inCpStandbyRecordType",
    "inCpStandbyStartDate",
    "inCustomerCDigit",
    "inCustomerCustId",
    "inProfitsAccountAccountCd",
    "inProfitsAccountAccountNumber",
    "inCpStandbyCurrencyAmount"
})
public class StandbyCollectionPaymentImport
    extends BaseImport
{

    @XmlElement(name = "InClientMntRecordingAuthorizer1")
    protected String inClientMntRecordingAuthorizer1;
    @XmlElement(name = "InClientMntRecordingAuthorizer2")
    protected String inClientMntRecordingAuthorizer2;
    @XmlElement(name = "InClientMntRecordingTerminalNumber")
    protected String inClientMntRecordingTerminalNumber;
    @XmlElement(name = "InClientMntRecordingPrftSystem")
    protected short inClientMntRecordingPrftSystem;
    @XmlElement(name = "InClientMntRecordingReversalFlag")
    protected String inClientMntRecordingReversalFlag;
    @XmlElement(name = "InClientMntRecordingTrxCode")
    protected int inClientMntRecordingTrxCode;
    @XmlElement(name = "InCpStandbyAmount", required = true)
    protected BigDecimal inCpStandbyAmount;
    @XmlElement(name = "InCpStandbyCpAgreementNo", required = true)
    protected BigDecimal inCpStandbyCpAgreementNo;
    @XmlElement(name = "InCpStandbyDataField1")
    protected String inCpStandbyDataField1;
    @XmlElement(name = "InCpStandbyDataField2")
    protected String inCpStandbyDataField2;
    @XmlElement(name = "InCpStandbyDataField3")
    protected String inCpStandbyDataField3;
    @XmlElement(name = "InCpStandbyDataField4")
    protected String inCpStandbyDataField4;
    @XmlElement(name = "InCpStandbyExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCpStandbyExpiryDate;
    @XmlElement(name = "InCpStandbyRecordType")
    protected String inCpStandbyRecordType;
    @XmlElement(name = "InCpStandbyStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCpStandbyStartDate;
    @XmlElement(name = "InCustomerCDigit")
    protected short inCustomerCDigit;
    @XmlElement(name = "InCustomerCustId")
    protected int inCustomerCustId;
    @XmlElement(name = "InProfitsAccountAccountCd")
    protected short inProfitsAccountAccountCd;
    @XmlElement(name = "InProfitsAccountAccountNumber")
    protected String inProfitsAccountAccountNumber;
    @XmlElement(name = "InCpStandbyCurrencyAmount")
    protected String inCpStandbyCurrencyAmount;

    /**
     * Gets the value of the inClientMntRecordingAuthorizer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInClientMntRecordingAuthorizer1() {
        return inClientMntRecordingAuthorizer1;
    }

    /**
     * Sets the value of the inClientMntRecordingAuthorizer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInClientMntRecordingAuthorizer1(String value) {
        this.inClientMntRecordingAuthorizer1 = value;
    }

    /**
     * Gets the value of the inClientMntRecordingAuthorizer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInClientMntRecordingAuthorizer2() {
        return inClientMntRecordingAuthorizer2;
    }

    /**
     * Sets the value of the inClientMntRecordingAuthorizer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInClientMntRecordingAuthorizer2(String value) {
        this.inClientMntRecordingAuthorizer2 = value;
    }

    /**
     * Gets the value of the inClientMntRecordingTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInClientMntRecordingTerminalNumber() {
        return inClientMntRecordingTerminalNumber;
    }

    /**
     * Sets the value of the inClientMntRecordingTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInClientMntRecordingTerminalNumber(String value) {
        this.inClientMntRecordingTerminalNumber = value;
    }

    /**
     * Gets the value of the inClientMntRecordingPrftSystem property.
     * 
     */
    public short getInClientMntRecordingPrftSystem() {
        return inClientMntRecordingPrftSystem;
    }

    /**
     * Sets the value of the inClientMntRecordingPrftSystem property.
     * 
     */
    public void setInClientMntRecordingPrftSystem(short value) {
        this.inClientMntRecordingPrftSystem = value;
    }

    /**
     * Gets the value of the inClientMntRecordingReversalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInClientMntRecordingReversalFlag() {
        return inClientMntRecordingReversalFlag;
    }

    /**
     * Sets the value of the inClientMntRecordingReversalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInClientMntRecordingReversalFlag(String value) {
        this.inClientMntRecordingReversalFlag = value;
    }

    /**
     * Gets the value of the inClientMntRecordingTrxCode property.
     * 
     */
    public int getInClientMntRecordingTrxCode() {
        return inClientMntRecordingTrxCode;
    }

    /**
     * Sets the value of the inClientMntRecordingTrxCode property.
     * 
     */
    public void setInClientMntRecordingTrxCode(int value) {
        this.inClientMntRecordingTrxCode = value;
    }

    /**
     * Gets the value of the inCpStandbyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInCpStandbyAmount() {
        return inCpStandbyAmount;
    }

    /**
     * Sets the value of the inCpStandbyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInCpStandbyAmount(BigDecimal value) {
        this.inCpStandbyAmount = value;
    }

    /**
     * Gets the value of the inCpStandbyCpAgreementNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInCpStandbyCpAgreementNo() {
        return inCpStandbyCpAgreementNo;
    }

    /**
     * Sets the value of the inCpStandbyCpAgreementNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInCpStandbyCpAgreementNo(BigDecimal value) {
        this.inCpStandbyCpAgreementNo = value;
    }

    /**
     * Gets the value of the inCpStandbyDataField1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpStandbyDataField1() {
        return inCpStandbyDataField1;
    }

    /**
     * Sets the value of the inCpStandbyDataField1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpStandbyDataField1(String value) {
        this.inCpStandbyDataField1 = value;
    }

    /**
     * Gets the value of the inCpStandbyDataField2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpStandbyDataField2() {
        return inCpStandbyDataField2;
    }

    /**
     * Sets the value of the inCpStandbyDataField2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpStandbyDataField2(String value) {
        this.inCpStandbyDataField2 = value;
    }

    /**
     * Gets the value of the inCpStandbyDataField3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpStandbyDataField3() {
        return inCpStandbyDataField3;
    }

    /**
     * Sets the value of the inCpStandbyDataField3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpStandbyDataField3(String value) {
        this.inCpStandbyDataField3 = value;
    }

    /**
     * Gets the value of the inCpStandbyDataField4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpStandbyDataField4() {
        return inCpStandbyDataField4;
    }

    /**
     * Sets the value of the inCpStandbyDataField4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpStandbyDataField4(String value) {
        this.inCpStandbyDataField4 = value;
    }

    /**
     * Gets the value of the inCpStandbyExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCpStandbyExpiryDate() {
        return inCpStandbyExpiryDate;
    }

    /**
     * Sets the value of the inCpStandbyExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCpStandbyExpiryDate(XMLGregorianCalendar value) {
        this.inCpStandbyExpiryDate = value;
    }

    /**
     * Gets the value of the inCpStandbyRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpStandbyRecordType() {
        return inCpStandbyRecordType;
    }

    /**
     * Sets the value of the inCpStandbyRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpStandbyRecordType(String value) {
        this.inCpStandbyRecordType = value;
    }

    /**
     * Gets the value of the inCpStandbyStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCpStandbyStartDate() {
        return inCpStandbyStartDate;
    }

    /**
     * Sets the value of the inCpStandbyStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCpStandbyStartDate(XMLGregorianCalendar value) {
        this.inCpStandbyStartDate = value;
    }

    /**
     * Gets the value of the inCustomerCDigit property.
     * 
     */
    public short getInCustomerCDigit() {
        return inCustomerCDigit;
    }

    /**
     * Sets the value of the inCustomerCDigit property.
     * 
     */
    public void setInCustomerCDigit(short value) {
        this.inCustomerCDigit = value;
    }

    /**
     * Gets the value of the inCustomerCustId property.
     * 
     */
    public int getInCustomerCustId() {
        return inCustomerCustId;
    }

    /**
     * Sets the value of the inCustomerCustId property.
     * 
     */
    public void setInCustomerCustId(int value) {
        this.inCustomerCustId = value;
    }

    /**
     * Gets the value of the inProfitsAccountAccountCd property.
     * 
     */
    public short getInProfitsAccountAccountCd() {
        return inProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inProfitsAccountAccountCd property.
     * 
     */
    public void setInProfitsAccountAccountCd(short value) {
        this.inProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProfitsAccountAccountNumber() {
        return inProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProfitsAccountAccountNumber(String value) {
        this.inProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inCpStandbyCurrencyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpStandbyCurrencyAmount() {
        return inCpStandbyCurrencyAmount;
    }

    /**
     * Sets the value of the inCpStandbyCurrencyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpStandbyCurrencyAmount(String value) {
        this.inCpStandbyCurrencyAmount = value;
    }

}
