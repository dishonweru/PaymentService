
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ChequeBookRequestExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChequeBookRequestExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutCalculatedChqDepBookOrderChequeCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCalculatedChqDepBookOrderChequeFstNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutForAtmsTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLogDepMntRecordingTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOrderCustRecLnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOrderRecChqDepBookOrderBookDispatchBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOrderRecChqDepBookOrderBookLeftHanded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOrderRecChqDepBookOrderBookPages" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutOrderRecChqDepBookOrderBooksNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOrderRecChqDepBookOrderChequeCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutOrderRecChqDepBookOrderChequeFstNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutOrderRecChqDepBookOrderOrderCreationDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutOrderRecChqDepBookOrderOrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOrderRecCurrencyDaysbase" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutOrderRecCurrencyDisplayedDecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutOrderRecCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOrderRecCurrencyNationalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOrderRecCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOrderRecCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutOrderRecCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOrderRecCustomerMarketingReminder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOrderRecCustomerTelephone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOrderRecDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutOrderRecDepositAccountAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOrderRecDepositAccountAvailableBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutOrderRecDepositAccountBlockedBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutOrderRecDepositAccountBookBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutOrderRecDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutOrderRecDepositAccountCobenefCount" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutOrderRecDepositAccountCobenefCountIns" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutOrderRecDepositAccountDepositType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOrderRecDepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOrderRecDepositAccountEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOrderRecDepositAccountForecastBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutOrderRecDepositAccountHomeBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOrderRecDepositAccountLastTdTrxId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOrderRecDepositAccountLastTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutOrderRecDepositAccountOverdraftSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutOrderRecDepositAccountPassbookFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOrderRecDepositAccountRenewalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOrderRecDepositAccountRenewalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOrderRecDepositAccountSecretAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOrderRecDepositAccountSpecAgrPenFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOrderRecDepositAccountSpecAgrTrxFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOrderRecDepositAccountTimestmp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutOrderRecDepositAccountUnclearBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutOrderRecDepositAccountUnclearWithdrFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOrderRecProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOrderRecProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOrderRecUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutPrintLineDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutPrintLineTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutStatusIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutStatusIefSuppliedSrvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTypeGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChequeBookRequestExport", propOrder = {
    "outCalculatedChqDepBookOrderChequeCd",
    "outCalculatedChqDepBookOrderChequeFstNumber",
    "outForAtmsTrxCountTrxCounter",
    "outJustificIdJustific",
    "outLogDepMntRecordingTrxUsrSn",
    "outOrderCustRecLnsSuppliedName",
    "outOrderRecChqDepBookOrderBookDispatchBy",
    "outOrderRecChqDepBookOrderBookLeftHanded",
    "outOrderRecChqDepBookOrderBookPages",
    "outOrderRecChqDepBookOrderBooksNumber",
    "outOrderRecChqDepBookOrderChequeCd",
    "outOrderRecChqDepBookOrderChequeFstNumber",
    "outOrderRecChqDepBookOrderOrderCreationDt",
    "outOrderRecChqDepBookOrderOrderType",
    "outOrderRecCurrencyDaysbase",
    "outOrderRecCurrencyDisplayedDecimalPlaces",
    "outOrderRecCurrencyIdCurrency",
    "outOrderRecCurrencyNationalFlag",
    "outOrderRecCurrencyShortDescr",
    "outOrderRecCustomerCDigit",
    "outOrderRecCustomerCustId",
    "outOrderRecCustomerMarketingReminder",
    "outOrderRecCustomerTelephone1",
    "outOrderRecDepositAccountAccountNumber",
    "outOrderRecDepositAccountAccountType",
    "outOrderRecDepositAccountAvailableBalance",
    "outOrderRecDepositAccountBlockedBalance",
    "outOrderRecDepositAccountBookBalance",
    "outOrderRecDepositAccountCDigit",
    "outOrderRecDepositAccountCobenefCount",
    "outOrderRecDepositAccountCobenefCountIns",
    "outOrderRecDepositAccountDepositType",
    "outOrderRecDepositAccountDesignation",
    "outOrderRecDepositAccountEntryStatus",
    "outOrderRecDepositAccountForecastBalance",
    "outOrderRecDepositAccountHomeBranch",
    "outOrderRecDepositAccountLastTdTrxId",
    "outOrderRecDepositAccountLastTrxDate",
    "outOrderRecDepositAccountOverdraftSpread",
    "outOrderRecDepositAccountPassbookFlag",
    "outOrderRecDepositAccountRenewalFlag",
    "outOrderRecDepositAccountRenewalNumber",
    "outOrderRecDepositAccountSecretAccFlag",
    "outOrderRecDepositAccountSpecAgrPenFlg",
    "outOrderRecDepositAccountSpecAgrTrxFlg",
    "outOrderRecDepositAccountTimestmp",
    "outOrderRecDepositAccountUnclearBalance",
    "outOrderRecDepositAccountUnclearWithdrFlg",
    "outOrderRecProductDescription",
    "outOrderRecProductIdProduct",
    "outOrderRecUnitCode",
    "outPrftTransactionIdTransact",
    "outPrintLineDate",
    "outPrintLineTime",
    "outStatusIefSuppliedActionEntryDesc",
    "outStatusIefSuppliedSrvStatus",
    "outTypeGenericDetailDescription",
    "outTypeGenericDetailParameterType",
    "outTypeGenericDetailSerialNum"
})
public class ChequeBookRequestExport
    extends BaseExport
{

    @XmlElement(name = "OutCalculatedChqDepBookOrderChequeCd")
    protected short outCalculatedChqDepBookOrderChequeCd;
    @XmlElement(name = "OutCalculatedChqDepBookOrderChequeFstNumber")
    protected double outCalculatedChqDepBookOrderChequeFstNumber;
    @XmlElement(name = "OutForAtmsTrxCountTrxCounter")
    protected int outForAtmsTrxCountTrxCounter;
    @XmlElement(name = "OutJustificIdJustific")
    protected int outJustificIdJustific;
    @XmlElement(name = "OutLogDepMntRecordingTrxUsrSn")
    protected int outLogDepMntRecordingTrxUsrSn;
    @XmlElement(name = "OutOrderCustRecLnsSuppliedName")
    protected String outOrderCustRecLnsSuppliedName;
    @XmlElement(name = "OutOrderRecChqDepBookOrderBookDispatchBy")
    protected String outOrderRecChqDepBookOrderBookDispatchBy;
    @XmlElement(name = "OutOrderRecChqDepBookOrderBookLeftHanded")
    protected String outOrderRecChqDepBookOrderBookLeftHanded;
    @XmlElement(name = "OutOrderRecChqDepBookOrderBookPages")
    protected short outOrderRecChqDepBookOrderBookPages;
    @XmlElement(name = "OutOrderRecChqDepBookOrderBooksNumber")
    protected int outOrderRecChqDepBookOrderBooksNumber;
    @XmlElement(name = "OutOrderRecChqDepBookOrderChequeCd")
    protected short outOrderRecChqDepBookOrderChequeCd;
    @XmlElement(name = "OutOrderRecChqDepBookOrderChequeFstNumber")
    protected double outOrderRecChqDepBookOrderChequeFstNumber;
    @XmlElement(name = "OutOrderRecChqDepBookOrderOrderCreationDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outOrderRecChqDepBookOrderOrderCreationDt;
    @XmlElement(name = "OutOrderRecChqDepBookOrderOrderType")
    protected String outOrderRecChqDepBookOrderOrderType;
    @XmlElement(name = "OutOrderRecCurrencyDaysbase")
    protected short outOrderRecCurrencyDaysbase;
    @XmlElement(name = "OutOrderRecCurrencyDisplayedDecimalPlaces")
    protected short outOrderRecCurrencyDisplayedDecimalPlaces;
    @XmlElement(name = "OutOrderRecCurrencyIdCurrency")
    protected int outOrderRecCurrencyIdCurrency;
    @XmlElement(name = "OutOrderRecCurrencyNationalFlag")
    protected String outOrderRecCurrencyNationalFlag;
    @XmlElement(name = "OutOrderRecCurrencyShortDescr")
    protected String outOrderRecCurrencyShortDescr;
    @XmlElement(name = "OutOrderRecCustomerCDigit")
    protected short outOrderRecCustomerCDigit;
    @XmlElement(name = "OutOrderRecCustomerCustId")
    protected int outOrderRecCustomerCustId;
    @XmlElement(name = "OutOrderRecCustomerMarketingReminder")
    protected String outOrderRecCustomerMarketingReminder;
    @XmlElement(name = "OutOrderRecCustomerTelephone1")
    protected String outOrderRecCustomerTelephone1;
    @XmlElement(name = "OutOrderRecDepositAccountAccountNumber")
    protected double outOrderRecDepositAccountAccountNumber;
    @XmlElement(name = "OutOrderRecDepositAccountAccountType")
    protected String outOrderRecDepositAccountAccountType;
    @XmlElement(name = "OutOrderRecDepositAccountAvailableBalance", required = true)
    protected BigDecimal outOrderRecDepositAccountAvailableBalance;
    @XmlElement(name = "OutOrderRecDepositAccountBlockedBalance", required = true)
    protected BigDecimal outOrderRecDepositAccountBlockedBalance;
    @XmlElement(name = "OutOrderRecDepositAccountBookBalance", required = true)
    protected BigDecimal outOrderRecDepositAccountBookBalance;
    @XmlElement(name = "OutOrderRecDepositAccountCDigit")
    protected short outOrderRecDepositAccountCDigit;
    @XmlElement(name = "OutOrderRecDepositAccountCobenefCount")
    protected short outOrderRecDepositAccountCobenefCount;
    @XmlElement(name = "OutOrderRecDepositAccountCobenefCountIns")
    protected short outOrderRecDepositAccountCobenefCountIns;
    @XmlElement(name = "OutOrderRecDepositAccountDepositType")
    protected String outOrderRecDepositAccountDepositType;
    @XmlElement(name = "OutOrderRecDepositAccountDesignation")
    protected String outOrderRecDepositAccountDesignation;
    @XmlElement(name = "OutOrderRecDepositAccountEntryStatus")
    protected String outOrderRecDepositAccountEntryStatus;
    @XmlElement(name = "OutOrderRecDepositAccountForecastBalance", required = true)
    protected BigDecimal outOrderRecDepositAccountForecastBalance;
    @XmlElement(name = "OutOrderRecDepositAccountHomeBranch")
    protected String outOrderRecDepositAccountHomeBranch;
    @XmlElement(name = "OutOrderRecDepositAccountLastTdTrxId")
    protected int outOrderRecDepositAccountLastTdTrxId;
    @XmlElement(name = "OutOrderRecDepositAccountLastTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outOrderRecDepositAccountLastTrxDate;
    @XmlElement(name = "OutOrderRecDepositAccountOverdraftSpread", required = true)
    protected BigDecimal outOrderRecDepositAccountOverdraftSpread;
    @XmlElement(name = "OutOrderRecDepositAccountPassbookFlag")
    protected String outOrderRecDepositAccountPassbookFlag;
    @XmlElement(name = "OutOrderRecDepositAccountRenewalFlag")
    protected String outOrderRecDepositAccountRenewalFlag;
    @XmlElement(name = "OutOrderRecDepositAccountRenewalNumber")
    protected int outOrderRecDepositAccountRenewalNumber;
    @XmlElement(name = "OutOrderRecDepositAccountSecretAccFlag")
    protected String outOrderRecDepositAccountSecretAccFlag;
    @XmlElement(name = "OutOrderRecDepositAccountSpecAgrPenFlg")
    protected String outOrderRecDepositAccountSpecAgrPenFlg;
    @XmlElement(name = "OutOrderRecDepositAccountSpecAgrTrxFlg")
    protected String outOrderRecDepositAccountSpecAgrTrxFlg;
    @XmlElement(name = "OutOrderRecDepositAccountTimestmp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outOrderRecDepositAccountTimestmp;
    @XmlElement(name = "OutOrderRecDepositAccountUnclearBalance", required = true)
    protected BigDecimal outOrderRecDepositAccountUnclearBalance;
    @XmlElement(name = "OutOrderRecDepositAccountUnclearWithdrFlg")
    protected String outOrderRecDepositAccountUnclearWithdrFlg;
    @XmlElement(name = "OutOrderRecProductDescription")
    protected String outOrderRecProductDescription;
    @XmlElement(name = "OutOrderRecProductIdProduct")
    protected int outOrderRecProductIdProduct;
    @XmlElement(name = "OutOrderRecUnitCode")
    protected int outOrderRecUnitCode;
    @XmlElement(name = "OutPrftTransactionIdTransact")
    protected int outPrftTransactionIdTransact;
    @XmlElement(name = "OutPrintLineDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outPrintLineDate;
    @XmlElement(name = "OutPrintLineTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outPrintLineTime;
    @XmlElement(name = "OutStatusIefSuppliedActionEntryDesc")
    protected String outStatusIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutStatusIefSuppliedSrvStatus")
    protected String outStatusIefSuppliedSrvStatus;
    @XmlElement(name = "OutTypeGenericDetailDescription")
    protected String outTypeGenericDetailDescription;
    @XmlElement(name = "OutTypeGenericDetailParameterType")
    protected String outTypeGenericDetailParameterType;
    @XmlElement(name = "OutTypeGenericDetailSerialNum")
    protected int outTypeGenericDetailSerialNum;

    /**
     * Gets the value of the outCalculatedChqDepBookOrderChequeCd property.
     * 
     */
    public short getOutCalculatedChqDepBookOrderChequeCd() {
        return outCalculatedChqDepBookOrderChequeCd;
    }

    /**
     * Sets the value of the outCalculatedChqDepBookOrderChequeCd property.
     * 
     */
    public void setOutCalculatedChqDepBookOrderChequeCd(short value) {
        this.outCalculatedChqDepBookOrderChequeCd = value;
    }

    /**
     * Gets the value of the outCalculatedChqDepBookOrderChequeFstNumber property.
     * 
     */
    public double getOutCalculatedChqDepBookOrderChequeFstNumber() {
        return outCalculatedChqDepBookOrderChequeFstNumber;
    }

    /**
     * Sets the value of the outCalculatedChqDepBookOrderChequeFstNumber property.
     * 
     */
    public void setOutCalculatedChqDepBookOrderChequeFstNumber(double value) {
        this.outCalculatedChqDepBookOrderChequeFstNumber = value;
    }

    /**
     * Gets the value of the outForAtmsTrxCountTrxCounter property.
     * 
     */
    public int getOutForAtmsTrxCountTrxCounter() {
        return outForAtmsTrxCountTrxCounter;
    }

    /**
     * Sets the value of the outForAtmsTrxCountTrxCounter property.
     * 
     */
    public void setOutForAtmsTrxCountTrxCounter(int value) {
        this.outForAtmsTrxCountTrxCounter = value;
    }

    /**
     * Gets the value of the outJustificIdJustific property.
     * 
     */
    public int getOutJustificIdJustific() {
        return outJustificIdJustific;
    }

    /**
     * Sets the value of the outJustificIdJustific property.
     * 
     */
    public void setOutJustificIdJustific(int value) {
        this.outJustificIdJustific = value;
    }

    /**
     * Gets the value of the outLogDepMntRecordingTrxUsrSn property.
     * 
     */
    public int getOutLogDepMntRecordingTrxUsrSn() {
        return outLogDepMntRecordingTrxUsrSn;
    }

    /**
     * Sets the value of the outLogDepMntRecordingTrxUsrSn property.
     * 
     */
    public void setOutLogDepMntRecordingTrxUsrSn(int value) {
        this.outLogDepMntRecordingTrxUsrSn = value;
    }

    /**
     * Gets the value of the outOrderCustRecLnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOrderCustRecLnsSuppliedName() {
        return outOrderCustRecLnsSuppliedName;
    }

    /**
     * Sets the value of the outOrderCustRecLnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOrderCustRecLnsSuppliedName(String value) {
        this.outOrderCustRecLnsSuppliedName = value;
    }

    /**
     * Gets the value of the outOrderRecChqDepBookOrderBookDispatchBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOrderRecChqDepBookOrderBookDispatchBy() {
        return outOrderRecChqDepBookOrderBookDispatchBy;
    }

    /**
     * Sets the value of the outOrderRecChqDepBookOrderBookDispatchBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOrderRecChqDepBookOrderBookDispatchBy(String value) {
        this.outOrderRecChqDepBookOrderBookDispatchBy = value;
    }

    /**
     * Gets the value of the outOrderRecChqDepBookOrderBookLeftHanded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOrderRecChqDepBookOrderBookLeftHanded() {
        return outOrderRecChqDepBookOrderBookLeftHanded;
    }

    /**
     * Sets the value of the outOrderRecChqDepBookOrderBookLeftHanded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOrderRecChqDepBookOrderBookLeftHanded(String value) {
        this.outOrderRecChqDepBookOrderBookLeftHanded = value;
    }

    /**
     * Gets the value of the outOrderRecChqDepBookOrderBookPages property.
     * 
     */
    public short getOutOrderRecChqDepBookOrderBookPages() {
        return outOrderRecChqDepBookOrderBookPages;
    }

    /**
     * Sets the value of the outOrderRecChqDepBookOrderBookPages property.
     * 
     */
    public void setOutOrderRecChqDepBookOrderBookPages(short value) {
        this.outOrderRecChqDepBookOrderBookPages = value;
    }

    /**
     * Gets the value of the outOrderRecChqDepBookOrderBooksNumber property.
     * 
     */
    public int getOutOrderRecChqDepBookOrderBooksNumber() {
        return outOrderRecChqDepBookOrderBooksNumber;
    }

    /**
     * Sets the value of the outOrderRecChqDepBookOrderBooksNumber property.
     * 
     */
    public void setOutOrderRecChqDepBookOrderBooksNumber(int value) {
        this.outOrderRecChqDepBookOrderBooksNumber = value;
    }

    /**
     * Gets the value of the outOrderRecChqDepBookOrderChequeCd property.
     * 
     */
    public short getOutOrderRecChqDepBookOrderChequeCd() {
        return outOrderRecChqDepBookOrderChequeCd;
    }

    /**
     * Sets the value of the outOrderRecChqDepBookOrderChequeCd property.
     * 
     */
    public void setOutOrderRecChqDepBookOrderChequeCd(short value) {
        this.outOrderRecChqDepBookOrderChequeCd = value;
    }

    /**
     * Gets the value of the outOrderRecChqDepBookOrderChequeFstNumber property.
     * 
     */
    public double getOutOrderRecChqDepBookOrderChequeFstNumber() {
        return outOrderRecChqDepBookOrderChequeFstNumber;
    }

    /**
     * Sets the value of the outOrderRecChqDepBookOrderChequeFstNumber property.
     * 
     */
    public void setOutOrderRecChqDepBookOrderChequeFstNumber(double value) {
        this.outOrderRecChqDepBookOrderChequeFstNumber = value;
    }

    /**
     * Gets the value of the outOrderRecChqDepBookOrderOrderCreationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutOrderRecChqDepBookOrderOrderCreationDt() {
        return outOrderRecChqDepBookOrderOrderCreationDt;
    }

    /**
     * Sets the value of the outOrderRecChqDepBookOrderOrderCreationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutOrderRecChqDepBookOrderOrderCreationDt(XMLGregorianCalendar value) {
        this.outOrderRecChqDepBookOrderOrderCreationDt = value;
    }

    /**
     * Gets the value of the outOrderRecChqDepBookOrderOrderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOrderRecChqDepBookOrderOrderType() {
        return outOrderRecChqDepBookOrderOrderType;
    }

    /**
     * Sets the value of the outOrderRecChqDepBookOrderOrderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOrderRecChqDepBookOrderOrderType(String value) {
        this.outOrderRecChqDepBookOrderOrderType = value;
    }

    /**
     * Gets the value of the outOrderRecCurrencyDaysbase property.
     * 
     */
    public short getOutOrderRecCurrencyDaysbase() {
        return outOrderRecCurrencyDaysbase;
    }

    /**
     * Sets the value of the outOrderRecCurrencyDaysbase property.
     * 
     */
    public void setOutOrderRecCurrencyDaysbase(short value) {
        this.outOrderRecCurrencyDaysbase = value;
    }

    /**
     * Gets the value of the outOrderRecCurrencyDisplayedDecimalPlaces property.
     * 
     */
    public short getOutOrderRecCurrencyDisplayedDecimalPlaces() {
        return outOrderRecCurrencyDisplayedDecimalPlaces;
    }

    /**
     * Sets the value of the outOrderRecCurrencyDisplayedDecimalPlaces property.
     * 
     */
    public void setOutOrderRecCurrencyDisplayedDecimalPlaces(short value) {
        this.outOrderRecCurrencyDisplayedDecimalPlaces = value;
    }

    /**
     * Gets the value of the outOrderRecCurrencyIdCurrency property.
     * 
     */
    public int getOutOrderRecCurrencyIdCurrency() {
        return outOrderRecCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outOrderRecCurrencyIdCurrency property.
     * 
     */
    public void setOutOrderRecCurrencyIdCurrency(int value) {
        this.outOrderRecCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outOrderRecCurrencyNationalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOrderRecCurrencyNationalFlag() {
        return outOrderRecCurrencyNationalFlag;
    }

    /**
     * Sets the value of the outOrderRecCurrencyNationalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOrderRecCurrencyNationalFlag(String value) {
        this.outOrderRecCurrencyNationalFlag = value;
    }

    /**
     * Gets the value of the outOrderRecCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOrderRecCurrencyShortDescr() {
        return outOrderRecCurrencyShortDescr;
    }

    /**
     * Sets the value of the outOrderRecCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOrderRecCurrencyShortDescr(String value) {
        this.outOrderRecCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outOrderRecCustomerCDigit property.
     * 
     */
    public short getOutOrderRecCustomerCDigit() {
        return outOrderRecCustomerCDigit;
    }

    /**
     * Sets the value of the outOrderRecCustomerCDigit property.
     * 
     */
    public void setOutOrderRecCustomerCDigit(short value) {
        this.outOrderRecCustomerCDigit = value;
    }

    /**
     * Gets the value of the outOrderRecCustomerCustId property.
     * 
     */
    public int getOutOrderRecCustomerCustId() {
        return outOrderRecCustomerCustId;
    }

    /**
     * Sets the value of the outOrderRecCustomerCustId property.
     * 
     */
    public void setOutOrderRecCustomerCustId(int value) {
        this.outOrderRecCustomerCustId = value;
    }

    /**
     * Gets the value of the outOrderRecCustomerMarketingReminder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOrderRecCustomerMarketingReminder() {
        return outOrderRecCustomerMarketingReminder;
    }

    /**
     * Sets the value of the outOrderRecCustomerMarketingReminder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOrderRecCustomerMarketingReminder(String value) {
        this.outOrderRecCustomerMarketingReminder = value;
    }

    /**
     * Gets the value of the outOrderRecCustomerTelephone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOrderRecCustomerTelephone1() {
        return outOrderRecCustomerTelephone1;
    }

    /**
     * Sets the value of the outOrderRecCustomerTelephone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOrderRecCustomerTelephone1(String value) {
        this.outOrderRecCustomerTelephone1 = value;
    }

    /**
     * Gets the value of the outOrderRecDepositAccountAccountNumber property.
     * 
     */
    public double getOutOrderRecDepositAccountAccountNumber() {
        return outOrderRecDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the outOrderRecDepositAccountAccountNumber property.
     * 
     */
    public void setOutOrderRecDepositAccountAccountNumber(double value) {
        this.outOrderRecDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outOrderRecDepositAccountAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOrderRecDepositAccountAccountType() {
        return outOrderRecDepositAccountAccountType;
    }

    /**
     * Sets the value of the outOrderRecDepositAccountAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOrderRecDepositAccountAccountType(String value) {
        this.outOrderRecDepositAccountAccountType = value;
    }

    /**
     * Gets the value of the outOrderRecDepositAccountAvailableBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutOrderRecDepositAccountAvailableBalance() {
        return outOrderRecDepositAccountAvailableBalance;
    }

    /**
     * Sets the value of the outOrderRecDepositAccountAvailableBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutOrderRecDepositAccountAvailableBalance(BigDecimal value) {
        this.outOrderRecDepositAccountAvailableBalance = value;
    }

    /**
     * Gets the value of the outOrderRecDepositAccountBlockedBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutOrderRecDepositAccountBlockedBalance() {
        return outOrderRecDepositAccountBlockedBalance;
    }

    /**
     * Sets the value of the outOrderRecDepositAccountBlockedBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutOrderRecDepositAccountBlockedBalance(BigDecimal value) {
        this.outOrderRecDepositAccountBlockedBalance = value;
    }

    /**
     * Gets the value of the outOrderRecDepositAccountBookBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutOrderRecDepositAccountBookBalance() {
        return outOrderRecDepositAccountBookBalance;
    }

    /**
     * Sets the value of the outOrderRecDepositAccountBookBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutOrderRecDepositAccountBookBalance(BigDecimal value) {
        this.outOrderRecDepositAccountBookBalance = value;
    }

    /**
     * Gets the value of the outOrderRecDepositAccountCDigit property.
     * 
     */
    public short getOutOrderRecDepositAccountCDigit() {
        return outOrderRecDepositAccountCDigit;
    }

    /**
     * Sets the value of the outOrderRecDepositAccountCDigit property.
     * 
     */
    public void setOutOrderRecDepositAccountCDigit(short value) {
        this.outOrderRecDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the outOrderRecDepositAccountCobenefCount property.
     * 
     */
    public short getOutOrderRecDepositAccountCobenefCount() {
        return outOrderRecDepositAccountCobenefCount;
    }

    /**
     * Sets the value of the outOrderRecDepositAccountCobenefCount property.
     * 
     */
    public void setOutOrderRecDepositAccountCobenefCount(short value) {
        this.outOrderRecDepositAccountCobenefCount = value;
    }

    /**
     * Gets the value of the outOrderRecDepositAccountCobenefCountIns property.
     * 
     */
    public short getOutOrderRecDepositAccountCobenefCountIns() {
        return outOrderRecDepositAccountCobenefCountIns;
    }

    /**
     * Sets the value of the outOrderRecDepositAccountCobenefCountIns property.
     * 
     */
    public void setOutOrderRecDepositAccountCobenefCountIns(short value) {
        this.outOrderRecDepositAccountCobenefCountIns = value;
    }

    /**
     * Gets the value of the outOrderRecDepositAccountDepositType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOrderRecDepositAccountDepositType() {
        return outOrderRecDepositAccountDepositType;
    }

    /**
     * Sets the value of the outOrderRecDepositAccountDepositType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOrderRecDepositAccountDepositType(String value) {
        this.outOrderRecDepositAccountDepositType = value;
    }

    /**
     * Gets the value of the outOrderRecDepositAccountDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOrderRecDepositAccountDesignation() {
        return outOrderRecDepositAccountDesignation;
    }

    /**
     * Sets the value of the outOrderRecDepositAccountDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOrderRecDepositAccountDesignation(String value) {
        this.outOrderRecDepositAccountDesignation = value;
    }

    /**
     * Gets the value of the outOrderRecDepositAccountEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOrderRecDepositAccountEntryStatus() {
        return outOrderRecDepositAccountEntryStatus;
    }

    /**
     * Sets the value of the outOrderRecDepositAccountEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOrderRecDepositAccountEntryStatus(String value) {
        this.outOrderRecDepositAccountEntryStatus = value;
    }

    /**
     * Gets the value of the outOrderRecDepositAccountForecastBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutOrderRecDepositAccountForecastBalance() {
        return outOrderRecDepositAccountForecastBalance;
    }

    /**
     * Sets the value of the outOrderRecDepositAccountForecastBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutOrderRecDepositAccountForecastBalance(BigDecimal value) {
        this.outOrderRecDepositAccountForecastBalance = value;
    }

    /**
     * Gets the value of the outOrderRecDepositAccountHomeBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOrderRecDepositAccountHomeBranch() {
        return outOrderRecDepositAccountHomeBranch;
    }

    /**
     * Sets the value of the outOrderRecDepositAccountHomeBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOrderRecDepositAccountHomeBranch(String value) {
        this.outOrderRecDepositAccountHomeBranch = value;
    }

    /**
     * Gets the value of the outOrderRecDepositAccountLastTdTrxId property.
     * 
     */
    public int getOutOrderRecDepositAccountLastTdTrxId() {
        return outOrderRecDepositAccountLastTdTrxId;
    }

    /**
     * Sets the value of the outOrderRecDepositAccountLastTdTrxId property.
     * 
     */
    public void setOutOrderRecDepositAccountLastTdTrxId(int value) {
        this.outOrderRecDepositAccountLastTdTrxId = value;
    }

    /**
     * Gets the value of the outOrderRecDepositAccountLastTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutOrderRecDepositAccountLastTrxDate() {
        return outOrderRecDepositAccountLastTrxDate;
    }

    /**
     * Sets the value of the outOrderRecDepositAccountLastTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutOrderRecDepositAccountLastTrxDate(XMLGregorianCalendar value) {
        this.outOrderRecDepositAccountLastTrxDate = value;
    }

    /**
     * Gets the value of the outOrderRecDepositAccountOverdraftSpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutOrderRecDepositAccountOverdraftSpread() {
        return outOrderRecDepositAccountOverdraftSpread;
    }

    /**
     * Sets the value of the outOrderRecDepositAccountOverdraftSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutOrderRecDepositAccountOverdraftSpread(BigDecimal value) {
        this.outOrderRecDepositAccountOverdraftSpread = value;
    }

    /**
     * Gets the value of the outOrderRecDepositAccountPassbookFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOrderRecDepositAccountPassbookFlag() {
        return outOrderRecDepositAccountPassbookFlag;
    }

    /**
     * Sets the value of the outOrderRecDepositAccountPassbookFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOrderRecDepositAccountPassbookFlag(String value) {
        this.outOrderRecDepositAccountPassbookFlag = value;
    }

    /**
     * Gets the value of the outOrderRecDepositAccountRenewalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOrderRecDepositAccountRenewalFlag() {
        return outOrderRecDepositAccountRenewalFlag;
    }

    /**
     * Sets the value of the outOrderRecDepositAccountRenewalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOrderRecDepositAccountRenewalFlag(String value) {
        this.outOrderRecDepositAccountRenewalFlag = value;
    }

    /**
     * Gets the value of the outOrderRecDepositAccountRenewalNumber property.
     * 
     */
    public int getOutOrderRecDepositAccountRenewalNumber() {
        return outOrderRecDepositAccountRenewalNumber;
    }

    /**
     * Sets the value of the outOrderRecDepositAccountRenewalNumber property.
     * 
     */
    public void setOutOrderRecDepositAccountRenewalNumber(int value) {
        this.outOrderRecDepositAccountRenewalNumber = value;
    }

    /**
     * Gets the value of the outOrderRecDepositAccountSecretAccFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOrderRecDepositAccountSecretAccFlag() {
        return outOrderRecDepositAccountSecretAccFlag;
    }

    /**
     * Sets the value of the outOrderRecDepositAccountSecretAccFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOrderRecDepositAccountSecretAccFlag(String value) {
        this.outOrderRecDepositAccountSecretAccFlag = value;
    }

    /**
     * Gets the value of the outOrderRecDepositAccountSpecAgrPenFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOrderRecDepositAccountSpecAgrPenFlg() {
        return outOrderRecDepositAccountSpecAgrPenFlg;
    }

    /**
     * Sets the value of the outOrderRecDepositAccountSpecAgrPenFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOrderRecDepositAccountSpecAgrPenFlg(String value) {
        this.outOrderRecDepositAccountSpecAgrPenFlg = value;
    }

    /**
     * Gets the value of the outOrderRecDepositAccountSpecAgrTrxFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOrderRecDepositAccountSpecAgrTrxFlg() {
        return outOrderRecDepositAccountSpecAgrTrxFlg;
    }

    /**
     * Sets the value of the outOrderRecDepositAccountSpecAgrTrxFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOrderRecDepositAccountSpecAgrTrxFlg(String value) {
        this.outOrderRecDepositAccountSpecAgrTrxFlg = value;
    }

    /**
     * Gets the value of the outOrderRecDepositAccountTimestmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutOrderRecDepositAccountTimestmp() {
        return outOrderRecDepositAccountTimestmp;
    }

    /**
     * Sets the value of the outOrderRecDepositAccountTimestmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutOrderRecDepositAccountTimestmp(XMLGregorianCalendar value) {
        this.outOrderRecDepositAccountTimestmp = value;
    }

    /**
     * Gets the value of the outOrderRecDepositAccountUnclearBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutOrderRecDepositAccountUnclearBalance() {
        return outOrderRecDepositAccountUnclearBalance;
    }

    /**
     * Sets the value of the outOrderRecDepositAccountUnclearBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutOrderRecDepositAccountUnclearBalance(BigDecimal value) {
        this.outOrderRecDepositAccountUnclearBalance = value;
    }

    /**
     * Gets the value of the outOrderRecDepositAccountUnclearWithdrFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOrderRecDepositAccountUnclearWithdrFlg() {
        return outOrderRecDepositAccountUnclearWithdrFlg;
    }

    /**
     * Sets the value of the outOrderRecDepositAccountUnclearWithdrFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOrderRecDepositAccountUnclearWithdrFlg(String value) {
        this.outOrderRecDepositAccountUnclearWithdrFlg = value;
    }

    /**
     * Gets the value of the outOrderRecProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOrderRecProductDescription() {
        return outOrderRecProductDescription;
    }

    /**
     * Sets the value of the outOrderRecProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOrderRecProductDescription(String value) {
        this.outOrderRecProductDescription = value;
    }

    /**
     * Gets the value of the outOrderRecProductIdProduct property.
     * 
     */
    public int getOutOrderRecProductIdProduct() {
        return outOrderRecProductIdProduct;
    }

    /**
     * Sets the value of the outOrderRecProductIdProduct property.
     * 
     */
    public void setOutOrderRecProductIdProduct(int value) {
        this.outOrderRecProductIdProduct = value;
    }

    /**
     * Gets the value of the outOrderRecUnitCode property.
     * 
     */
    public int getOutOrderRecUnitCode() {
        return outOrderRecUnitCode;
    }

    /**
     * Sets the value of the outOrderRecUnitCode property.
     * 
     */
    public void setOutOrderRecUnitCode(int value) {
        this.outOrderRecUnitCode = value;
    }

    /**
     * Gets the value of the outPrftTransactionIdTransact property.
     * 
     */
    public int getOutPrftTransactionIdTransact() {
        return outPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the outPrftTransactionIdTransact property.
     * 
     */
    public void setOutPrftTransactionIdTransact(int value) {
        this.outPrftTransactionIdTransact = value;
    }

    /**
     * Gets the value of the outPrintLineDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutPrintLineDate() {
        return outPrintLineDate;
    }

    /**
     * Sets the value of the outPrintLineDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutPrintLineDate(XMLGregorianCalendar value) {
        this.outPrintLineDate = value;
    }

    /**
     * Gets the value of the outPrintLineTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutPrintLineTime() {
        return outPrintLineTime;
    }

    /**
     * Sets the value of the outPrintLineTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutPrintLineTime(XMLGregorianCalendar value) {
        this.outPrintLineTime = value;
    }

    /**
     * Gets the value of the outStatusIefSuppliedActionEntryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutStatusIefSuppliedActionEntryDesc() {
        return outStatusIefSuppliedActionEntryDesc;
    }

    /**
     * Sets the value of the outStatusIefSuppliedActionEntryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutStatusIefSuppliedActionEntryDesc(String value) {
        this.outStatusIefSuppliedActionEntryDesc = value;
    }

    /**
     * Gets the value of the outStatusIefSuppliedSrvStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutStatusIefSuppliedSrvStatus() {
        return outStatusIefSuppliedSrvStatus;
    }

    /**
     * Sets the value of the outStatusIefSuppliedSrvStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutStatusIefSuppliedSrvStatus(String value) {
        this.outStatusIefSuppliedSrvStatus = value;
    }

    /**
     * Gets the value of the outTypeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTypeGenericDetailDescription() {
        return outTypeGenericDetailDescription;
    }

    /**
     * Sets the value of the outTypeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTypeGenericDetailDescription(String value) {
        this.outTypeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outTypeGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTypeGenericDetailParameterType() {
        return outTypeGenericDetailParameterType;
    }

    /**
     * Sets the value of the outTypeGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTypeGenericDetailParameterType(String value) {
        this.outTypeGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outTypeGenericDetailSerialNum property.
     * 
     */
    public int getOutTypeGenericDetailSerialNum() {
        return outTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outTypeGenericDetailSerialNum property.
     * 
     */
    public void setOutTypeGenericDetailSerialNum(int value) {
        this.outTypeGenericDetailSerialNum = value;
    }

}
