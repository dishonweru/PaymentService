
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Adds01InExportPostingItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Adds01InExportPostingItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InExportPostingInGroupJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InExportPostingInGrpChequeBookItemItemSerialNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InExportPostingInGrpCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InExportPostingInGrpCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InExportPostingInGrpDepUnclearTransAvailabilityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InExportPostingInGrpDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InExportPostingInGrpDpTrxSpecialAgrAvailDateSpread" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InExportPostingInGrpDpTrxSpecialAgrValueDateSpread" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InExportPostingInGrpFdValeurBalanceValueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InExportPostingInGrpFxFtRecordingComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InExportPostingInGrpFxFtRecordingGlAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InExportPostingInGrpFxFtRecordingIDomesticAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InExportPostingInGrpFxFtRecordingIDrCrFlag" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InExportPostingInGrpFxFtRecordingIRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InExportPostingInGrpFxFtRecordingISegmentType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InExportPostingInGrpFxFtRecordingITrxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InExportPostingInGrpFxftJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InExportPostingInGrpIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InExportPostingInGrpPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InExportPostingInGrpProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InExportPostingInGrpTeamInformationAuthorizationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InExportPostingInGrpTeamInformationSuper1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InExportPostingInGrpTeamInformationSuper2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InExportPostingInGrpThirdpartyPaymentTppField1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InExportPostingInGrpThirdpartyPaymentTppField2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InExportPostingInGrpThirdpartyPaymentTppField3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InExportPostingInGrpThirdpartyPaymentTppField4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InExportPostingInGrpUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InExportPostingInGrpUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Adds01InExportPostingItem", propOrder = {
    "inExportPostingInGroupJustificIdJustific",
    "inExportPostingInGrpChequeBookItemItemSerialNumber",
    "inExportPostingInGrpCurrencyIdCurrency",
    "inExportPostingInGrpCurrencyShortDescr",
    "inExportPostingInGrpDepUnclearTransAvailabilityDate",
    "inExportPostingInGrpDepositAccountCDigit",
    "inExportPostingInGrpDpTrxSpecialAgrAvailDateSpread",
    "inExportPostingInGrpDpTrxSpecialAgrValueDateSpread",
    "inExportPostingInGrpFdValeurBalanceValueDate",
    "inExportPostingInGrpFxFtRecordingComments",
    "inExportPostingInGrpFxFtRecordingGlAccount",
    "inExportPostingInGrpFxFtRecordingIDomesticAmount",
    "inExportPostingInGrpFxFtRecordingIDrCrFlag",
    "inExportPostingInGrpFxFtRecordingIRate",
    "inExportPostingInGrpFxFtRecordingISegmentType",
    "inExportPostingInGrpFxFtRecordingITrxAmount",
    "inExportPostingInGrpFxftJustificIdJustific",
    "inExportPostingInGrpIefSuppliedFlag",
    "inExportPostingInGrpPrftTransactionIdTransact",
    "inExportPostingInGrpProfitsAccountAccountNumber",
    "inExportPostingInGrpTeamInformationAuthorizationResult",
    "inExportPostingInGrpTeamInformationSuper1Code",
    "inExportPostingInGrpTeamInformationSuper2Code",
    "inExportPostingInGrpThirdpartyPaymentTppField1",
    "inExportPostingInGrpThirdpartyPaymentTppField2",
    "inExportPostingInGrpThirdpartyPaymentTppField3",
    "inExportPostingInGrpThirdpartyPaymentTppField4",
    "inExportPostingInGrpUnitCode",
    "inExportPostingInGrpUnitUnitName"
})
public class Adds01InExportPostingItem {

    @XmlElement(name = "InExportPostingInGroupJustificIdJustific")
    protected int inExportPostingInGroupJustificIdJustific;
    @XmlElement(name = "InExportPostingInGrpChequeBookItemItemSerialNumber")
    protected double inExportPostingInGrpChequeBookItemItemSerialNumber;
    @XmlElement(name = "InExportPostingInGrpCurrencyIdCurrency")
    protected int inExportPostingInGrpCurrencyIdCurrency;
    @XmlElement(name = "InExportPostingInGrpCurrencyShortDescr")
    protected String inExportPostingInGrpCurrencyShortDescr;
    @XmlElement(name = "InExportPostingInGrpDepUnclearTransAvailabilityDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inExportPostingInGrpDepUnclearTransAvailabilityDate;
    @XmlElement(name = "InExportPostingInGrpDepositAccountCDigit")
    protected short inExportPostingInGrpDepositAccountCDigit;
    @XmlElement(name = "InExportPostingInGrpDpTrxSpecialAgrAvailDateSpread")
    protected short inExportPostingInGrpDpTrxSpecialAgrAvailDateSpread;
    @XmlElement(name = "InExportPostingInGrpDpTrxSpecialAgrValueDateSpread")
    protected short inExportPostingInGrpDpTrxSpecialAgrValueDateSpread;
    @XmlElement(name = "InExportPostingInGrpFdValeurBalanceValueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inExportPostingInGrpFdValeurBalanceValueDate;
    @XmlElement(name = "InExportPostingInGrpFxFtRecordingComments")
    protected String inExportPostingInGrpFxFtRecordingComments;
    @XmlElement(name = "InExportPostingInGrpFxFtRecordingGlAccount")
    protected String inExportPostingInGrpFxFtRecordingGlAccount;
    @XmlElement(name = "InExportPostingInGrpFxFtRecordingIDomesticAmount", required = true)
    protected BigDecimal inExportPostingInGrpFxFtRecordingIDomesticAmount;
    @XmlElement(name = "InExportPostingInGrpFxFtRecordingIDrCrFlag")
    protected short inExportPostingInGrpFxFtRecordingIDrCrFlag;
    @XmlElement(name = "InExportPostingInGrpFxFtRecordingIRate", required = true)
    protected BigDecimal inExportPostingInGrpFxFtRecordingIRate;
    @XmlElement(name = "InExportPostingInGrpFxFtRecordingISegmentType")
    protected short inExportPostingInGrpFxFtRecordingISegmentType;
    @XmlElement(name = "InExportPostingInGrpFxFtRecordingITrxAmount", required = true)
    protected BigDecimal inExportPostingInGrpFxFtRecordingITrxAmount;
    @XmlElement(name = "InExportPostingInGrpFxftJustificIdJustific")
    protected int inExportPostingInGrpFxftJustificIdJustific;
    @XmlElement(name = "InExportPostingInGrpIefSuppliedFlag")
    protected String inExportPostingInGrpIefSuppliedFlag;
    @XmlElement(name = "InExportPostingInGrpPrftTransactionIdTransact")
    protected int inExportPostingInGrpPrftTransactionIdTransact;
    @XmlElement(name = "InExportPostingInGrpProfitsAccountAccountNumber")
    protected String inExportPostingInGrpProfitsAccountAccountNumber;
    @XmlElement(name = "InExportPostingInGrpTeamInformationAuthorizationResult")
    protected String inExportPostingInGrpTeamInformationAuthorizationResult;
    @XmlElement(name = "InExportPostingInGrpTeamInformationSuper1Code")
    protected String inExportPostingInGrpTeamInformationSuper1Code;
    @XmlElement(name = "InExportPostingInGrpTeamInformationSuper2Code")
    protected String inExportPostingInGrpTeamInformationSuper2Code;
    @XmlElement(name = "InExportPostingInGrpThirdpartyPaymentTppField1")
    protected String inExportPostingInGrpThirdpartyPaymentTppField1;
    @XmlElement(name = "InExportPostingInGrpThirdpartyPaymentTppField2")
    protected String inExportPostingInGrpThirdpartyPaymentTppField2;
    @XmlElement(name = "InExportPostingInGrpThirdpartyPaymentTppField3")
    protected String inExportPostingInGrpThirdpartyPaymentTppField3;
    @XmlElement(name = "InExportPostingInGrpThirdpartyPaymentTppField4")
    protected String inExportPostingInGrpThirdpartyPaymentTppField4;
    @XmlElement(name = "InExportPostingInGrpUnitCode")
    protected int inExportPostingInGrpUnitCode;
    @XmlElement(name = "InExportPostingInGrpUnitUnitName")
    protected String inExportPostingInGrpUnitUnitName;

    /**
     * Gets the value of the inExportPostingInGroupJustificIdJustific property.
     * 
     */
    public int getInExportPostingInGroupJustificIdJustific() {
        return inExportPostingInGroupJustificIdJustific;
    }

    /**
     * Sets the value of the inExportPostingInGroupJustificIdJustific property.
     * 
     */
    public void setInExportPostingInGroupJustificIdJustific(int value) {
        this.inExportPostingInGroupJustificIdJustific = value;
    }

    /**
     * Gets the value of the inExportPostingInGrpChequeBookItemItemSerialNumber property.
     * 
     */
    public double getInExportPostingInGrpChequeBookItemItemSerialNumber() {
        return inExportPostingInGrpChequeBookItemItemSerialNumber;
    }

    /**
     * Sets the value of the inExportPostingInGrpChequeBookItemItemSerialNumber property.
     * 
     */
    public void setInExportPostingInGrpChequeBookItemItemSerialNumber(double value) {
        this.inExportPostingInGrpChequeBookItemItemSerialNumber = value;
    }

    /**
     * Gets the value of the inExportPostingInGrpCurrencyIdCurrency property.
     * 
     */
    public int getInExportPostingInGrpCurrencyIdCurrency() {
        return inExportPostingInGrpCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inExportPostingInGrpCurrencyIdCurrency property.
     * 
     */
    public void setInExportPostingInGrpCurrencyIdCurrency(int value) {
        this.inExportPostingInGrpCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inExportPostingInGrpCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInExportPostingInGrpCurrencyShortDescr() {
        return inExportPostingInGrpCurrencyShortDescr;
    }

    /**
     * Sets the value of the inExportPostingInGrpCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInExportPostingInGrpCurrencyShortDescr(String value) {
        this.inExportPostingInGrpCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inExportPostingInGrpDepUnclearTransAvailabilityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInExportPostingInGrpDepUnclearTransAvailabilityDate() {
        return inExportPostingInGrpDepUnclearTransAvailabilityDate;
    }

    /**
     * Sets the value of the inExportPostingInGrpDepUnclearTransAvailabilityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInExportPostingInGrpDepUnclearTransAvailabilityDate(XMLGregorianCalendar value) {
        this.inExportPostingInGrpDepUnclearTransAvailabilityDate = value;
    }

    /**
     * Gets the value of the inExportPostingInGrpDepositAccountCDigit property.
     * 
     */
    public short getInExportPostingInGrpDepositAccountCDigit() {
        return inExportPostingInGrpDepositAccountCDigit;
    }

    /**
     * Sets the value of the inExportPostingInGrpDepositAccountCDigit property.
     * 
     */
    public void setInExportPostingInGrpDepositAccountCDigit(short value) {
        this.inExportPostingInGrpDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the inExportPostingInGrpDpTrxSpecialAgrAvailDateSpread property.
     * 
     */
    public short getInExportPostingInGrpDpTrxSpecialAgrAvailDateSpread() {
        return inExportPostingInGrpDpTrxSpecialAgrAvailDateSpread;
    }

    /**
     * Sets the value of the inExportPostingInGrpDpTrxSpecialAgrAvailDateSpread property.
     * 
     */
    public void setInExportPostingInGrpDpTrxSpecialAgrAvailDateSpread(short value) {
        this.inExportPostingInGrpDpTrxSpecialAgrAvailDateSpread = value;
    }

    /**
     * Gets the value of the inExportPostingInGrpDpTrxSpecialAgrValueDateSpread property.
     * 
     */
    public short getInExportPostingInGrpDpTrxSpecialAgrValueDateSpread() {
        return inExportPostingInGrpDpTrxSpecialAgrValueDateSpread;
    }

    /**
     * Sets the value of the inExportPostingInGrpDpTrxSpecialAgrValueDateSpread property.
     * 
     */
    public void setInExportPostingInGrpDpTrxSpecialAgrValueDateSpread(short value) {
        this.inExportPostingInGrpDpTrxSpecialAgrValueDateSpread = value;
    }

    /**
     * Gets the value of the inExportPostingInGrpFdValeurBalanceValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInExportPostingInGrpFdValeurBalanceValueDate() {
        return inExportPostingInGrpFdValeurBalanceValueDate;
    }

    /**
     * Sets the value of the inExportPostingInGrpFdValeurBalanceValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInExportPostingInGrpFdValeurBalanceValueDate(XMLGregorianCalendar value) {
        this.inExportPostingInGrpFdValeurBalanceValueDate = value;
    }

    /**
     * Gets the value of the inExportPostingInGrpFxFtRecordingComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInExportPostingInGrpFxFtRecordingComments() {
        return inExportPostingInGrpFxFtRecordingComments;
    }

    /**
     * Sets the value of the inExportPostingInGrpFxFtRecordingComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInExportPostingInGrpFxFtRecordingComments(String value) {
        this.inExportPostingInGrpFxFtRecordingComments = value;
    }

    /**
     * Gets the value of the inExportPostingInGrpFxFtRecordingGlAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInExportPostingInGrpFxFtRecordingGlAccount() {
        return inExportPostingInGrpFxFtRecordingGlAccount;
    }

    /**
     * Sets the value of the inExportPostingInGrpFxFtRecordingGlAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInExportPostingInGrpFxFtRecordingGlAccount(String value) {
        this.inExportPostingInGrpFxFtRecordingGlAccount = value;
    }

    /**
     * Gets the value of the inExportPostingInGrpFxFtRecordingIDomesticAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInExportPostingInGrpFxFtRecordingIDomesticAmount() {
        return inExportPostingInGrpFxFtRecordingIDomesticAmount;
    }

    /**
     * Sets the value of the inExportPostingInGrpFxFtRecordingIDomesticAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInExportPostingInGrpFxFtRecordingIDomesticAmount(BigDecimal value) {
        this.inExportPostingInGrpFxFtRecordingIDomesticAmount = value;
    }

    /**
     * Gets the value of the inExportPostingInGrpFxFtRecordingIDrCrFlag property.
     * 
     */
    public short getInExportPostingInGrpFxFtRecordingIDrCrFlag() {
        return inExportPostingInGrpFxFtRecordingIDrCrFlag;
    }

    /**
     * Sets the value of the inExportPostingInGrpFxFtRecordingIDrCrFlag property.
     * 
     */
    public void setInExportPostingInGrpFxFtRecordingIDrCrFlag(short value) {
        this.inExportPostingInGrpFxFtRecordingIDrCrFlag = value;
    }

    /**
     * Gets the value of the inExportPostingInGrpFxFtRecordingIRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInExportPostingInGrpFxFtRecordingIRate() {
        return inExportPostingInGrpFxFtRecordingIRate;
    }

    /**
     * Sets the value of the inExportPostingInGrpFxFtRecordingIRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInExportPostingInGrpFxFtRecordingIRate(BigDecimal value) {
        this.inExportPostingInGrpFxFtRecordingIRate = value;
    }

    /**
     * Gets the value of the inExportPostingInGrpFxFtRecordingISegmentType property.
     * 
     */
    public short getInExportPostingInGrpFxFtRecordingISegmentType() {
        return inExportPostingInGrpFxFtRecordingISegmentType;
    }

    /**
     * Sets the value of the inExportPostingInGrpFxFtRecordingISegmentType property.
     * 
     */
    public void setInExportPostingInGrpFxFtRecordingISegmentType(short value) {
        this.inExportPostingInGrpFxFtRecordingISegmentType = value;
    }

    /**
     * Gets the value of the inExportPostingInGrpFxFtRecordingITrxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInExportPostingInGrpFxFtRecordingITrxAmount() {
        return inExportPostingInGrpFxFtRecordingITrxAmount;
    }

    /**
     * Sets the value of the inExportPostingInGrpFxFtRecordingITrxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInExportPostingInGrpFxFtRecordingITrxAmount(BigDecimal value) {
        this.inExportPostingInGrpFxFtRecordingITrxAmount = value;
    }

    /**
     * Gets the value of the inExportPostingInGrpFxftJustificIdJustific property.
     * 
     */
    public int getInExportPostingInGrpFxftJustificIdJustific() {
        return inExportPostingInGrpFxftJustificIdJustific;
    }

    /**
     * Sets the value of the inExportPostingInGrpFxftJustificIdJustific property.
     * 
     */
    public void setInExportPostingInGrpFxftJustificIdJustific(int value) {
        this.inExportPostingInGrpFxftJustificIdJustific = value;
    }

    /**
     * Gets the value of the inExportPostingInGrpIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInExportPostingInGrpIefSuppliedFlag() {
        return inExportPostingInGrpIefSuppliedFlag;
    }

    /**
     * Sets the value of the inExportPostingInGrpIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInExportPostingInGrpIefSuppliedFlag(String value) {
        this.inExportPostingInGrpIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inExportPostingInGrpPrftTransactionIdTransact property.
     * 
     */
    public int getInExportPostingInGrpPrftTransactionIdTransact() {
        return inExportPostingInGrpPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the inExportPostingInGrpPrftTransactionIdTransact property.
     * 
     */
    public void setInExportPostingInGrpPrftTransactionIdTransact(int value) {
        this.inExportPostingInGrpPrftTransactionIdTransact = value;
    }

    /**
     * Gets the value of the inExportPostingInGrpProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInExportPostingInGrpProfitsAccountAccountNumber() {
        return inExportPostingInGrpProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inExportPostingInGrpProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInExportPostingInGrpProfitsAccountAccountNumber(String value) {
        this.inExportPostingInGrpProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inExportPostingInGrpTeamInformationAuthorizationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInExportPostingInGrpTeamInformationAuthorizationResult() {
        return inExportPostingInGrpTeamInformationAuthorizationResult;
    }

    /**
     * Sets the value of the inExportPostingInGrpTeamInformationAuthorizationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInExportPostingInGrpTeamInformationAuthorizationResult(String value) {
        this.inExportPostingInGrpTeamInformationAuthorizationResult = value;
    }

    /**
     * Gets the value of the inExportPostingInGrpTeamInformationSuper1Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInExportPostingInGrpTeamInformationSuper1Code() {
        return inExportPostingInGrpTeamInformationSuper1Code;
    }

    /**
     * Sets the value of the inExportPostingInGrpTeamInformationSuper1Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInExportPostingInGrpTeamInformationSuper1Code(String value) {
        this.inExportPostingInGrpTeamInformationSuper1Code = value;
    }

    /**
     * Gets the value of the inExportPostingInGrpTeamInformationSuper2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInExportPostingInGrpTeamInformationSuper2Code() {
        return inExportPostingInGrpTeamInformationSuper2Code;
    }

    /**
     * Sets the value of the inExportPostingInGrpTeamInformationSuper2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInExportPostingInGrpTeamInformationSuper2Code(String value) {
        this.inExportPostingInGrpTeamInformationSuper2Code = value;
    }

    /**
     * Gets the value of the inExportPostingInGrpThirdpartyPaymentTppField1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInExportPostingInGrpThirdpartyPaymentTppField1() {
        return inExportPostingInGrpThirdpartyPaymentTppField1;
    }

    /**
     * Sets the value of the inExportPostingInGrpThirdpartyPaymentTppField1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInExportPostingInGrpThirdpartyPaymentTppField1(String value) {
        this.inExportPostingInGrpThirdpartyPaymentTppField1 = value;
    }

    /**
     * Gets the value of the inExportPostingInGrpThirdpartyPaymentTppField2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInExportPostingInGrpThirdpartyPaymentTppField2() {
        return inExportPostingInGrpThirdpartyPaymentTppField2;
    }

    /**
     * Sets the value of the inExportPostingInGrpThirdpartyPaymentTppField2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInExportPostingInGrpThirdpartyPaymentTppField2(String value) {
        this.inExportPostingInGrpThirdpartyPaymentTppField2 = value;
    }

    /**
     * Gets the value of the inExportPostingInGrpThirdpartyPaymentTppField3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInExportPostingInGrpThirdpartyPaymentTppField3() {
        return inExportPostingInGrpThirdpartyPaymentTppField3;
    }

    /**
     * Sets the value of the inExportPostingInGrpThirdpartyPaymentTppField3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInExportPostingInGrpThirdpartyPaymentTppField3(String value) {
        this.inExportPostingInGrpThirdpartyPaymentTppField3 = value;
    }

    /**
     * Gets the value of the inExportPostingInGrpThirdpartyPaymentTppField4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInExportPostingInGrpThirdpartyPaymentTppField4() {
        return inExportPostingInGrpThirdpartyPaymentTppField4;
    }

    /**
     * Sets the value of the inExportPostingInGrpThirdpartyPaymentTppField4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInExportPostingInGrpThirdpartyPaymentTppField4(String value) {
        this.inExportPostingInGrpThirdpartyPaymentTppField4 = value;
    }

    /**
     * Gets the value of the inExportPostingInGrpUnitCode property.
     * 
     */
    public int getInExportPostingInGrpUnitCode() {
        return inExportPostingInGrpUnitCode;
    }

    /**
     * Sets the value of the inExportPostingInGrpUnitCode property.
     * 
     */
    public void setInExportPostingInGrpUnitCode(int value) {
        this.inExportPostingInGrpUnitCode = value;
    }

    /**
     * Gets the value of the inExportPostingInGrpUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInExportPostingInGrpUnitUnitName() {
        return inExportPostingInGrpUnitUnitName;
    }

    /**
     * Sets the value of the inExportPostingInGrpUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInExportPostingInGrpUnitUnitName(String value) {
        this.inExportPostingInGrpUnitUnitName = value;
    }

}
