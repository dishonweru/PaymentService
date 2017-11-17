
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BalanceInquiryMiniStatementExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceInquiryMiniStatementExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutAccUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCurrTimePrintLineDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCurrTimePrintLineTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustomerLnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountAvailableBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountBlockedBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountBookBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountForecastBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountSecretAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountUnclearBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutIbanAccountCharSuppliedChar37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedActionEntry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedActionEntryMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIefSuppliedSrvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLogDepMntRecordingTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOtherIdCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOtherIdCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOtherIdTypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrevCurrencyEuroLockedRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutThirdPartyCustListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutThirdPartyCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutThirdPartyCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutThirdPartyIefSuppliedChar90" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutThirdPartyOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtrait" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutExtrait" minOccurs="0"/>
 *         &lt;element name="OutExtraitJust" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutExtraitJust" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceInquiryMiniStatementExport", propOrder = {
    "outAccUnitCode",
    "outCurrencyIdCurrency",
    "outCurrencyShortDescr",
    "outCurrTimePrintLineDate",
    "outCurrTimePrintLineTime",
    "outCustomerCDigit",
    "outCustomerCustId",
    "outCustomerLnsSuppliedName",
    "outDepositAccountAvailableBalance",
    "outDepositAccountBlockedBalance",
    "outDepositAccountBookBalance",
    "outDepositAccountDesignation",
    "outDepositAccountEntryStatus",
    "outDepositAccountForecastBalance",
    "outDepositAccountSecretAccFlag",
    "outDepositAccountUnclearBalance",
    "outIbanAccountCharSuppliedChar37",
    "outIefSuppliedActionEntry",
    "outIefSuppliedActionEntryDesc",
    "outIefSuppliedActionEntryMsg",
    "outIefSuppliedCount",
    "outIefSuppliedSrvStatus",
    "outLogDepMntRecordingTrxUsrSn",
    "outOtherIdCountryGenericDetailDescription",
    "outOtherIdCountryGenericDetailShortDescription",
    "outOtherIdTypeGenericDetailDescription",
    "outPrevCurrencyEuroLockedRate",
    "outPrftTransactionDescription",
    "outPrftTransactionIdTransact",
    "outProductDescription",
    "outProductIdProduct",
    "outThirdPartyCustListSetDescription",
    "outThirdPartyCustomerCDigit",
    "outThirdPartyCustomerCustId",
    "outThirdPartyIefSuppliedChar90",
    "outThirdPartyOtherIdIdNo",
    "outExtrait",
    "outExtraitJust"
})
public class BalanceInquiryMiniStatementExport
    extends BaseExport
{

    @XmlElement(name = "OutAccUnitCode")
    protected int outAccUnitCode;
    @XmlElement(name = "OutCurrencyIdCurrency")
    protected int outCurrencyIdCurrency;
    @XmlElement(name = "OutCurrencyShortDescr")
    protected String outCurrencyShortDescr;
    @XmlElement(name = "OutCurrTimePrintLineDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCurrTimePrintLineDate;
    @XmlElement(name = "OutCurrTimePrintLineTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCurrTimePrintLineTime;
    @XmlElement(name = "OutCustomerCDigit")
    protected short outCustomerCDigit;
    @XmlElement(name = "OutCustomerCustId")
    protected int outCustomerCustId;
    @XmlElement(name = "OutCustomerLnsSuppliedName")
    protected String outCustomerLnsSuppliedName;
    @XmlElement(name = "OutDepositAccountAvailableBalance", required = true)
    protected BigDecimal outDepositAccountAvailableBalance;
    @XmlElement(name = "OutDepositAccountBlockedBalance", required = true)
    protected BigDecimal outDepositAccountBlockedBalance;
    @XmlElement(name = "OutDepositAccountBookBalance", required = true)
    protected BigDecimal outDepositAccountBookBalance;
    @XmlElement(name = "OutDepositAccountDesignation")
    protected String outDepositAccountDesignation;
    @XmlElement(name = "OutDepositAccountEntryStatus")
    protected String outDepositAccountEntryStatus;
    @XmlElement(name = "OutDepositAccountForecastBalance", required = true)
    protected BigDecimal outDepositAccountForecastBalance;
    @XmlElement(name = "OutDepositAccountSecretAccFlag")
    protected String outDepositAccountSecretAccFlag;
    @XmlElement(name = "OutDepositAccountUnclearBalance", required = true)
    protected BigDecimal outDepositAccountUnclearBalance;
    @XmlElement(name = "OutIbanAccountCharSuppliedChar37")
    protected String outIbanAccountCharSuppliedChar37;
    @XmlElement(name = "OutIefSuppliedActionEntry")
    protected String outIefSuppliedActionEntry;
    @XmlElement(name = "OutIefSuppliedActionEntryDesc")
    protected String outIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutIefSuppliedActionEntryMsg")
    protected String outIefSuppliedActionEntryMsg;
    @XmlElement(name = "OutIefSuppliedCount")
    protected int outIefSuppliedCount;
    @XmlElement(name = "OutIefSuppliedSrvStatus")
    protected String outIefSuppliedSrvStatus;
    @XmlElement(name = "OutLogDepMntRecordingTrxUsrSn")
    protected int outLogDepMntRecordingTrxUsrSn;
    @XmlElement(name = "OutOtherIdCountryGenericDetailDescription")
    protected String outOtherIdCountryGenericDetailDescription;
    @XmlElement(name = "OutOtherIdCountryGenericDetailShortDescription")
    protected String outOtherIdCountryGenericDetailShortDescription;
    @XmlElement(name = "OutOtherIdTypeGenericDetailDescription")
    protected String outOtherIdTypeGenericDetailDescription;
    @XmlElement(name = "OutPrevCurrencyEuroLockedRate", required = true)
    protected BigDecimal outPrevCurrencyEuroLockedRate;
    @XmlElement(name = "OutPrftTransactionDescription")
    protected String outPrftTransactionDescription;
    @XmlElement(name = "OutPrftTransactionIdTransact")
    protected int outPrftTransactionIdTransact;
    @XmlElement(name = "OutProductDescription")
    protected String outProductDescription;
    @XmlElement(name = "OutProductIdProduct")
    protected int outProductIdProduct;
    @XmlElement(name = "OutThirdPartyCustListSetDescription")
    protected String outThirdPartyCustListSetDescription;
    @XmlElement(name = "OutThirdPartyCustomerCDigit")
    protected short outThirdPartyCustomerCDigit;
    @XmlElement(name = "OutThirdPartyCustomerCustId")
    protected int outThirdPartyCustomerCustId;
    @XmlElement(name = "OutThirdPartyIefSuppliedChar90")
    protected String outThirdPartyIefSuppliedChar90;
    @XmlElement(name = "OutThirdPartyOtherIdIdNo")
    protected String outThirdPartyOtherIdIdNo;
    @XmlElement(name = "OutExtrait")
    protected ArrayOfOutExtrait outExtrait;
    @XmlElement(name = "OutExtraitJust")
    protected ArrayOfOutExtraitJust outExtraitJust;

    /**
     * Gets the value of the outAccUnitCode property.
     * 
     */
    public int getOutAccUnitCode() {
        return outAccUnitCode;
    }

    /**
     * Sets the value of the outAccUnitCode property.
     * 
     */
    public void setOutAccUnitCode(int value) {
        this.outAccUnitCode = value;
    }

    /**
     * Gets the value of the outCurrencyIdCurrency property.
     * 
     */
    public int getOutCurrencyIdCurrency() {
        return outCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outCurrencyIdCurrency property.
     * 
     */
    public void setOutCurrencyIdCurrency(int value) {
        this.outCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCurrencyShortDescr() {
        return outCurrencyShortDescr;
    }

    /**
     * Sets the value of the outCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCurrencyShortDescr(String value) {
        this.outCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outCurrTimePrintLineDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCurrTimePrintLineDate() {
        return outCurrTimePrintLineDate;
    }

    /**
     * Sets the value of the outCurrTimePrintLineDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCurrTimePrintLineDate(XMLGregorianCalendar value) {
        this.outCurrTimePrintLineDate = value;
    }

    /**
     * Gets the value of the outCurrTimePrintLineTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCurrTimePrintLineTime() {
        return outCurrTimePrintLineTime;
    }

    /**
     * Sets the value of the outCurrTimePrintLineTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCurrTimePrintLineTime(XMLGregorianCalendar value) {
        this.outCurrTimePrintLineTime = value;
    }

    /**
     * Gets the value of the outCustomerCDigit property.
     * 
     */
    public short getOutCustomerCDigit() {
        return outCustomerCDigit;
    }

    /**
     * Sets the value of the outCustomerCDigit property.
     * 
     */
    public void setOutCustomerCDigit(short value) {
        this.outCustomerCDigit = value;
    }

    /**
     * Gets the value of the outCustomerCustId property.
     * 
     */
    public int getOutCustomerCustId() {
        return outCustomerCustId;
    }

    /**
     * Sets the value of the outCustomerCustId property.
     * 
     */
    public void setOutCustomerCustId(int value) {
        this.outCustomerCustId = value;
    }

    /**
     * Gets the value of the outCustomerLnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerLnsSuppliedName() {
        return outCustomerLnsSuppliedName;
    }

    /**
     * Sets the value of the outCustomerLnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerLnsSuppliedName(String value) {
        this.outCustomerLnsSuppliedName = value;
    }

    /**
     * Gets the value of the outDepositAccountAvailableBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountAvailableBalance() {
        return outDepositAccountAvailableBalance;
    }

    /**
     * Sets the value of the outDepositAccountAvailableBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountAvailableBalance(BigDecimal value) {
        this.outDepositAccountAvailableBalance = value;
    }

    /**
     * Gets the value of the outDepositAccountBlockedBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountBlockedBalance() {
        return outDepositAccountBlockedBalance;
    }

    /**
     * Sets the value of the outDepositAccountBlockedBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountBlockedBalance(BigDecimal value) {
        this.outDepositAccountBlockedBalance = value;
    }

    /**
     * Gets the value of the outDepositAccountBookBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountBookBalance() {
        return outDepositAccountBookBalance;
    }

    /**
     * Sets the value of the outDepositAccountBookBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountBookBalance(BigDecimal value) {
        this.outDepositAccountBookBalance = value;
    }

    /**
     * Gets the value of the outDepositAccountDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountDesignation() {
        return outDepositAccountDesignation;
    }

    /**
     * Sets the value of the outDepositAccountDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountDesignation(String value) {
        this.outDepositAccountDesignation = value;
    }

    /**
     * Gets the value of the outDepositAccountEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountEntryStatus() {
        return outDepositAccountEntryStatus;
    }

    /**
     * Sets the value of the outDepositAccountEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountEntryStatus(String value) {
        this.outDepositAccountEntryStatus = value;
    }

    /**
     * Gets the value of the outDepositAccountForecastBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountForecastBalance() {
        return outDepositAccountForecastBalance;
    }

    /**
     * Sets the value of the outDepositAccountForecastBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountForecastBalance(BigDecimal value) {
        this.outDepositAccountForecastBalance = value;
    }

    /**
     * Gets the value of the outDepositAccountSecretAccFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountSecretAccFlag() {
        return outDepositAccountSecretAccFlag;
    }

    /**
     * Sets the value of the outDepositAccountSecretAccFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountSecretAccFlag(String value) {
        this.outDepositAccountSecretAccFlag = value;
    }

    /**
     * Gets the value of the outDepositAccountUnclearBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountUnclearBalance() {
        return outDepositAccountUnclearBalance;
    }

    /**
     * Sets the value of the outDepositAccountUnclearBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountUnclearBalance(BigDecimal value) {
        this.outDepositAccountUnclearBalance = value;
    }

    /**
     * Gets the value of the outIbanAccountCharSuppliedChar37 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIbanAccountCharSuppliedChar37() {
        return outIbanAccountCharSuppliedChar37;
    }

    /**
     * Sets the value of the outIbanAccountCharSuppliedChar37 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIbanAccountCharSuppliedChar37(String value) {
        this.outIbanAccountCharSuppliedChar37 = value;
    }

    /**
     * Gets the value of the outIefSuppliedActionEntry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIefSuppliedActionEntry() {
        return outIefSuppliedActionEntry;
    }

    /**
     * Sets the value of the outIefSuppliedActionEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIefSuppliedActionEntry(String value) {
        this.outIefSuppliedActionEntry = value;
    }

    /**
     * Gets the value of the outIefSuppliedActionEntryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIefSuppliedActionEntryDesc() {
        return outIefSuppliedActionEntryDesc;
    }

    /**
     * Sets the value of the outIefSuppliedActionEntryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIefSuppliedActionEntryDesc(String value) {
        this.outIefSuppliedActionEntryDesc = value;
    }

    /**
     * Gets the value of the outIefSuppliedActionEntryMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIefSuppliedActionEntryMsg() {
        return outIefSuppliedActionEntryMsg;
    }

    /**
     * Sets the value of the outIefSuppliedActionEntryMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIefSuppliedActionEntryMsg(String value) {
        this.outIefSuppliedActionEntryMsg = value;
    }

    /**
     * Gets the value of the outIefSuppliedCount property.
     * 
     */
    public int getOutIefSuppliedCount() {
        return outIefSuppliedCount;
    }

    /**
     * Sets the value of the outIefSuppliedCount property.
     * 
     */
    public void setOutIefSuppliedCount(int value) {
        this.outIefSuppliedCount = value;
    }

    /**
     * Gets the value of the outIefSuppliedSrvStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIefSuppliedSrvStatus() {
        return outIefSuppliedSrvStatus;
    }

    /**
     * Sets the value of the outIefSuppliedSrvStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIefSuppliedSrvStatus(String value) {
        this.outIefSuppliedSrvStatus = value;
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
     * Gets the value of the outOtherIdCountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOtherIdCountryGenericDetailDescription() {
        return outOtherIdCountryGenericDetailDescription;
    }

    /**
     * Sets the value of the outOtherIdCountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOtherIdCountryGenericDetailDescription(String value) {
        this.outOtherIdCountryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outOtherIdCountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOtherIdCountryGenericDetailShortDescription() {
        return outOtherIdCountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outOtherIdCountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOtherIdCountryGenericDetailShortDescription(String value) {
        this.outOtherIdCountryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outOtherIdTypeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOtherIdTypeGenericDetailDescription() {
        return outOtherIdTypeGenericDetailDescription;
    }

    /**
     * Sets the value of the outOtherIdTypeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOtherIdTypeGenericDetailDescription(String value) {
        this.outOtherIdTypeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outPrevCurrencyEuroLockedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutPrevCurrencyEuroLockedRate() {
        return outPrevCurrencyEuroLockedRate;
    }

    /**
     * Sets the value of the outPrevCurrencyEuroLockedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutPrevCurrencyEuroLockedRate(BigDecimal value) {
        this.outPrevCurrencyEuroLockedRate = value;
    }

    /**
     * Gets the value of the outPrftTransactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrftTransactionDescription() {
        return outPrftTransactionDescription;
    }

    /**
     * Sets the value of the outPrftTransactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrftTransactionDescription(String value) {
        this.outPrftTransactionDescription = value;
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
     * Gets the value of the outProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductDescription() {
        return outProductDescription;
    }

    /**
     * Sets the value of the outProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductDescription(String value) {
        this.outProductDescription = value;
    }

    /**
     * Gets the value of the outProductIdProduct property.
     * 
     */
    public int getOutProductIdProduct() {
        return outProductIdProduct;
    }

    /**
     * Sets the value of the outProductIdProduct property.
     * 
     */
    public void setOutProductIdProduct(int value) {
        this.outProductIdProduct = value;
    }

    /**
     * Gets the value of the outThirdPartyCustListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutThirdPartyCustListSetDescription() {
        return outThirdPartyCustListSetDescription;
    }

    /**
     * Sets the value of the outThirdPartyCustListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutThirdPartyCustListSetDescription(String value) {
        this.outThirdPartyCustListSetDescription = value;
    }

    /**
     * Gets the value of the outThirdPartyCustomerCDigit property.
     * 
     */
    public short getOutThirdPartyCustomerCDigit() {
        return outThirdPartyCustomerCDigit;
    }

    /**
     * Sets the value of the outThirdPartyCustomerCDigit property.
     * 
     */
    public void setOutThirdPartyCustomerCDigit(short value) {
        this.outThirdPartyCustomerCDigit = value;
    }

    /**
     * Gets the value of the outThirdPartyCustomerCustId property.
     * 
     */
    public int getOutThirdPartyCustomerCustId() {
        return outThirdPartyCustomerCustId;
    }

    /**
     * Sets the value of the outThirdPartyCustomerCustId property.
     * 
     */
    public void setOutThirdPartyCustomerCustId(int value) {
        this.outThirdPartyCustomerCustId = value;
    }

    /**
     * Gets the value of the outThirdPartyIefSuppliedChar90 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutThirdPartyIefSuppliedChar90() {
        return outThirdPartyIefSuppliedChar90;
    }

    /**
     * Sets the value of the outThirdPartyIefSuppliedChar90 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutThirdPartyIefSuppliedChar90(String value) {
        this.outThirdPartyIefSuppliedChar90 = value;
    }

    /**
     * Gets the value of the outThirdPartyOtherIdIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutThirdPartyOtherIdIdNo() {
        return outThirdPartyOtherIdIdNo;
    }

    /**
     * Sets the value of the outThirdPartyOtherIdIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutThirdPartyOtherIdIdNo(String value) {
        this.outThirdPartyOtherIdIdNo = value;
    }

    /**
     * Gets the value of the outExtrait property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutExtrait }
     *     
     */
    public ArrayOfOutExtrait getOutExtrait() {
        return outExtrait;
    }

    /**
     * Sets the value of the outExtrait property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutExtrait }
     *     
     */
    public void setOutExtrait(ArrayOfOutExtrait value) {
        this.outExtrait = value;
    }

    /**
     * Gets the value of the outExtraitJust property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutExtraitJust }
     *     
     */
    public ArrayOfOutExtraitJust getOutExtraitJust() {
        return outExtraitJust;
    }

    /**
     * Sets the value of the outExtraitJust property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutExtraitJust }
     *     
     */
    public void setOutExtraitJust(ArrayOfOutExtraitJust value) {
        this.outExtraitJust = value;
    }

}
