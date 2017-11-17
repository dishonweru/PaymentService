
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for D0357VDepositsTermDepositStatementExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="D0357VDepositsTermDepositStatementExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutAccountUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCapitalAccCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCapitalAccCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCapitalAccDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutCapitalAccDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCapitalAccDepositAccountEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCapitalAccProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCapitalAccProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCapitalAccUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCapitalProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCurrTimePrintLineDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCurrTimePrintLineTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustomerLnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountAccrCrExpInt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountSecretAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHeaderTimeDeposRenewalBondNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutHeaderTimeDeposRenewalCrInterestRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutHeaderTimeDeposRenewalDaysDuration" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutHeaderTimeDeposRenewalEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHeaderTimeDeposRenewalExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutHeaderTimeDeposRenewalInitBondAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutHeaderTimeDeposRenewalInterPayOptions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHeaderTimeDeposRenewalInterestPayInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHeaderTimeDeposRenewalInterestToWithdr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutHeaderTimeDeposRenewalPartWithdrCount" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutHeaderTimeDeposRenewalRenewalBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutHeaderTimeDeposRenewalRenewalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutHeaderTimeDeposRenewalStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutHeaderTimeDeposRenewalTotInterWithdr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutIbanAccountCharSuppliedChar37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedActionEntryMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIefSuppliedDescInterPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedDescStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedEnableControl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedSrvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInterestAccCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInterestAccCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInterestAccDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutInterestAccDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutInterestAccDepositAccountEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInterestAccProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInterestAccUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInterestProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLogDepMntRecordingTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMoreRecIndexIefSuppliedCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTimeDeposRenewalRenewalSerNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutExtraitGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfD0357VOutExtraitGrpItem" minOccurs="0"/>
 *         &lt;element name="OutGrpMntExtrait" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfD0357VOutGrpMntExtraitItem" minOccurs="0"/>
 *         &lt;element name="IsMore" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "D0357VDepositsTermDepositStatementExport", propOrder = {
    "outAccountUnitCode",
    "outCapitalAccCurrencyIdCurrency",
    "outCapitalAccCurrencyShortDescr",
    "outCapitalAccDepositAccountAccountNumber",
    "outCapitalAccDepositAccountCDigit",
    "outCapitalAccDepositAccountEntryStatus",
    "outCapitalAccProductDescription",
    "outCapitalAccProductIdProduct",
    "outCapitalAccUnitCode",
    "outCapitalProfitsAccountAccountNumber",
    "outCurrTimePrintLineDate",
    "outCurrTimePrintLineTime",
    "outCurrencyIdCurrency",
    "outCurrencyShortDescr",
    "outCustomerCDigit",
    "outCustomerCustId",
    "outCustomerLnsSuppliedName",
    "outDepositAccountAccrCrExpInt",
    "outDepositAccountDesignation",
    "outDepositAccountEntryStatus",
    "outDepositAccountSecretAccFlag",
    "outHeaderTimeDeposRenewalBondNumber",
    "outHeaderTimeDeposRenewalCrInterestRate",
    "outHeaderTimeDeposRenewalDaysDuration",
    "outHeaderTimeDeposRenewalEntryStatus",
    "outHeaderTimeDeposRenewalExpiryDate",
    "outHeaderTimeDeposRenewalInitBondAmount",
    "outHeaderTimeDeposRenewalInterPayOptions",
    "outHeaderTimeDeposRenewalInterestPayInd",
    "outHeaderTimeDeposRenewalInterestToWithdr",
    "outHeaderTimeDeposRenewalPartWithdrCount",
    "outHeaderTimeDeposRenewalRenewalBalance",
    "outHeaderTimeDeposRenewalRenewalDate",
    "outHeaderTimeDeposRenewalStartDate",
    "outHeaderTimeDeposRenewalTotInterWithdr",
    "outIbanAccountCharSuppliedChar37",
    "outIefSuppliedActionEntryDesc",
    "outIefSuppliedActionEntryMsg",
    "outIefSuppliedCount",
    "outIefSuppliedDescInterPayment",
    "outIefSuppliedDescStatus",
    "outIefSuppliedEnableControl",
    "outIefSuppliedSrvStatus",
    "outInterestAccCurrencyIdCurrency",
    "outInterestAccCurrencyShortDescr",
    "outInterestAccDepositAccountAccountNumber",
    "outInterestAccDepositAccountCDigit",
    "outInterestAccDepositAccountEntryStatus",
    "outInterestAccProductIdProduct",
    "outInterestAccUnitCode",
    "outInterestProfitsAccountAccountNumber",
    "outJustificIdJustific",
    "outLogDepMntRecordingTrxUsrSn",
    "outMoreRecIndexIefSuppliedCount",
    "outPrftTransactionDescription",
    "outPrftTransactionIdTransact",
    "outProductDescription",
    "outProductIdProduct",
    "outTimeDeposRenewalRenewalSerNum",
    "outExtraitGrp",
    "outGrpMntExtrait",
    "isMore"
})
public class D0357VDepositsTermDepositStatementExport
    extends BaseExport
{

    @XmlElement(name = "OutAccountUnitCode")
    protected int outAccountUnitCode;
    @XmlElement(name = "OutCapitalAccCurrencyIdCurrency")
    protected int outCapitalAccCurrencyIdCurrency;
    @XmlElement(name = "OutCapitalAccCurrencyShortDescr")
    protected String outCapitalAccCurrencyShortDescr;
    @XmlElement(name = "OutCapitalAccDepositAccountAccountNumber")
    protected double outCapitalAccDepositAccountAccountNumber;
    @XmlElement(name = "OutCapitalAccDepositAccountCDigit")
    protected short outCapitalAccDepositAccountCDigit;
    @XmlElement(name = "OutCapitalAccDepositAccountEntryStatus")
    protected String outCapitalAccDepositAccountEntryStatus;
    @XmlElement(name = "OutCapitalAccProductDescription")
    protected String outCapitalAccProductDescription;
    @XmlElement(name = "OutCapitalAccProductIdProduct")
    protected int outCapitalAccProductIdProduct;
    @XmlElement(name = "OutCapitalAccUnitCode")
    protected int outCapitalAccUnitCode;
    @XmlElement(name = "OutCapitalProfitsAccountAccountNumber")
    protected String outCapitalProfitsAccountAccountNumber;
    @XmlElement(name = "OutCurrTimePrintLineDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCurrTimePrintLineDate;
    @XmlElement(name = "OutCurrTimePrintLineTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCurrTimePrintLineTime;
    @XmlElement(name = "OutCurrencyIdCurrency")
    protected int outCurrencyIdCurrency;
    @XmlElement(name = "OutCurrencyShortDescr")
    protected String outCurrencyShortDescr;
    @XmlElement(name = "OutCustomerCDigit")
    protected short outCustomerCDigit;
    @XmlElement(name = "OutCustomerCustId")
    protected int outCustomerCustId;
    @XmlElement(name = "OutCustomerLnsSuppliedName")
    protected String outCustomerLnsSuppliedName;
    @XmlElement(name = "OutDepositAccountAccrCrExpInt", required = true)
    protected BigDecimal outDepositAccountAccrCrExpInt;
    @XmlElement(name = "OutDepositAccountDesignation")
    protected String outDepositAccountDesignation;
    @XmlElement(name = "OutDepositAccountEntryStatus")
    protected String outDepositAccountEntryStatus;
    @XmlElement(name = "OutDepositAccountSecretAccFlag")
    protected String outDepositAccountSecretAccFlag;
    @XmlElement(name = "OutHeaderTimeDeposRenewalBondNumber")
    protected double outHeaderTimeDeposRenewalBondNumber;
    @XmlElement(name = "OutHeaderTimeDeposRenewalCrInterestRate", required = true)
    protected BigDecimal outHeaderTimeDeposRenewalCrInterestRate;
    @XmlElement(name = "OutHeaderTimeDeposRenewalDaysDuration")
    protected short outHeaderTimeDeposRenewalDaysDuration;
    @XmlElement(name = "OutHeaderTimeDeposRenewalEntryStatus")
    protected String outHeaderTimeDeposRenewalEntryStatus;
    @XmlElement(name = "OutHeaderTimeDeposRenewalExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outHeaderTimeDeposRenewalExpiryDate;
    @XmlElement(name = "OutHeaderTimeDeposRenewalInitBondAmount", required = true)
    protected BigDecimal outHeaderTimeDeposRenewalInitBondAmount;
    @XmlElement(name = "OutHeaderTimeDeposRenewalInterPayOptions")
    protected String outHeaderTimeDeposRenewalInterPayOptions;
    @XmlElement(name = "OutHeaderTimeDeposRenewalInterestPayInd")
    protected String outHeaderTimeDeposRenewalInterestPayInd;
    @XmlElement(name = "OutHeaderTimeDeposRenewalInterestToWithdr", required = true)
    protected BigDecimal outHeaderTimeDeposRenewalInterestToWithdr;
    @XmlElement(name = "OutHeaderTimeDeposRenewalPartWithdrCount")
    protected short outHeaderTimeDeposRenewalPartWithdrCount;
    @XmlElement(name = "OutHeaderTimeDeposRenewalRenewalBalance", required = true)
    protected BigDecimal outHeaderTimeDeposRenewalRenewalBalance;
    @XmlElement(name = "OutHeaderTimeDeposRenewalRenewalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outHeaderTimeDeposRenewalRenewalDate;
    @XmlElement(name = "OutHeaderTimeDeposRenewalStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outHeaderTimeDeposRenewalStartDate;
    @XmlElement(name = "OutHeaderTimeDeposRenewalTotInterWithdr", required = true)
    protected BigDecimal outHeaderTimeDeposRenewalTotInterWithdr;
    @XmlElement(name = "OutIbanAccountCharSuppliedChar37")
    protected String outIbanAccountCharSuppliedChar37;
    @XmlElement(name = "OutIefSuppliedActionEntryDesc")
    protected String outIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutIefSuppliedActionEntryMsg")
    protected String outIefSuppliedActionEntryMsg;
    @XmlElement(name = "OutIefSuppliedCount")
    protected int outIefSuppliedCount;
    @XmlElement(name = "OutIefSuppliedDescInterPayment")
    protected String outIefSuppliedDescInterPayment;
    @XmlElement(name = "OutIefSuppliedDescStatus")
    protected String outIefSuppliedDescStatus;
    @XmlElement(name = "OutIefSuppliedEnableControl")
    protected String outIefSuppliedEnableControl;
    @XmlElement(name = "OutIefSuppliedSrvStatus")
    protected String outIefSuppliedSrvStatus;
    @XmlElement(name = "OutInterestAccCurrencyIdCurrency")
    protected int outInterestAccCurrencyIdCurrency;
    @XmlElement(name = "OutInterestAccCurrencyShortDescr")
    protected String outInterestAccCurrencyShortDescr;
    @XmlElement(name = "OutInterestAccDepositAccountAccountNumber")
    protected double outInterestAccDepositAccountAccountNumber;
    @XmlElement(name = "OutInterestAccDepositAccountCDigit")
    protected short outInterestAccDepositAccountCDigit;
    @XmlElement(name = "OutInterestAccDepositAccountEntryStatus")
    protected String outInterestAccDepositAccountEntryStatus;
    @XmlElement(name = "OutInterestAccProductIdProduct")
    protected int outInterestAccProductIdProduct;
    @XmlElement(name = "OutInterestAccUnitCode")
    protected int outInterestAccUnitCode;
    @XmlElement(name = "OutInterestProfitsAccountAccountNumber")
    protected String outInterestProfitsAccountAccountNumber;
    @XmlElement(name = "OutJustificIdJustific")
    protected int outJustificIdJustific;
    @XmlElement(name = "OutLogDepMntRecordingTrxUsrSn")
    protected int outLogDepMntRecordingTrxUsrSn;
    @XmlElement(name = "OutMoreRecIndexIefSuppliedCount")
    protected int outMoreRecIndexIefSuppliedCount;
    @XmlElement(name = "OutPrftTransactionDescription")
    protected String outPrftTransactionDescription;
    @XmlElement(name = "OutPrftTransactionIdTransact")
    protected int outPrftTransactionIdTransact;
    @XmlElement(name = "OutProductDescription")
    protected String outProductDescription;
    @XmlElement(name = "OutProductIdProduct")
    protected int outProductIdProduct;
    @XmlElement(name = "OutTimeDeposRenewalRenewalSerNum")
    protected int outTimeDeposRenewalRenewalSerNum;
    @XmlElement(name = "OutExtraitGrp")
    protected ArrayOfD0357VOutExtraitGrpItem outExtraitGrp;
    @XmlElement(name = "OutGrpMntExtrait")
    protected ArrayOfD0357VOutGrpMntExtraitItem outGrpMntExtrait;
    @XmlElement(name = "IsMore")
    protected boolean isMore;

    /**
     * Gets the value of the outAccountUnitCode property.
     * 
     */
    public int getOutAccountUnitCode() {
        return outAccountUnitCode;
    }

    /**
     * Sets the value of the outAccountUnitCode property.
     * 
     */
    public void setOutAccountUnitCode(int value) {
        this.outAccountUnitCode = value;
    }

    /**
     * Gets the value of the outCapitalAccCurrencyIdCurrency property.
     * 
     */
    public int getOutCapitalAccCurrencyIdCurrency() {
        return outCapitalAccCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outCapitalAccCurrencyIdCurrency property.
     * 
     */
    public void setOutCapitalAccCurrencyIdCurrency(int value) {
        this.outCapitalAccCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outCapitalAccCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCapitalAccCurrencyShortDescr() {
        return outCapitalAccCurrencyShortDescr;
    }

    /**
     * Sets the value of the outCapitalAccCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCapitalAccCurrencyShortDescr(String value) {
        this.outCapitalAccCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outCapitalAccDepositAccountAccountNumber property.
     * 
     */
    public double getOutCapitalAccDepositAccountAccountNumber() {
        return outCapitalAccDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the outCapitalAccDepositAccountAccountNumber property.
     * 
     */
    public void setOutCapitalAccDepositAccountAccountNumber(double value) {
        this.outCapitalAccDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outCapitalAccDepositAccountCDigit property.
     * 
     */
    public short getOutCapitalAccDepositAccountCDigit() {
        return outCapitalAccDepositAccountCDigit;
    }

    /**
     * Sets the value of the outCapitalAccDepositAccountCDigit property.
     * 
     */
    public void setOutCapitalAccDepositAccountCDigit(short value) {
        this.outCapitalAccDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the outCapitalAccDepositAccountEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCapitalAccDepositAccountEntryStatus() {
        return outCapitalAccDepositAccountEntryStatus;
    }

    /**
     * Sets the value of the outCapitalAccDepositAccountEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCapitalAccDepositAccountEntryStatus(String value) {
        this.outCapitalAccDepositAccountEntryStatus = value;
    }

    /**
     * Gets the value of the outCapitalAccProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCapitalAccProductDescription() {
        return outCapitalAccProductDescription;
    }

    /**
     * Sets the value of the outCapitalAccProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCapitalAccProductDescription(String value) {
        this.outCapitalAccProductDescription = value;
    }

    /**
     * Gets the value of the outCapitalAccProductIdProduct property.
     * 
     */
    public int getOutCapitalAccProductIdProduct() {
        return outCapitalAccProductIdProduct;
    }

    /**
     * Sets the value of the outCapitalAccProductIdProduct property.
     * 
     */
    public void setOutCapitalAccProductIdProduct(int value) {
        this.outCapitalAccProductIdProduct = value;
    }

    /**
     * Gets the value of the outCapitalAccUnitCode property.
     * 
     */
    public int getOutCapitalAccUnitCode() {
        return outCapitalAccUnitCode;
    }

    /**
     * Sets the value of the outCapitalAccUnitCode property.
     * 
     */
    public void setOutCapitalAccUnitCode(int value) {
        this.outCapitalAccUnitCode = value;
    }

    /**
     * Gets the value of the outCapitalProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCapitalProfitsAccountAccountNumber() {
        return outCapitalProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outCapitalProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCapitalProfitsAccountAccountNumber(String value) {
        this.outCapitalProfitsAccountAccountNumber = value;
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
     * Gets the value of the outDepositAccountAccrCrExpInt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountAccrCrExpInt() {
        return outDepositAccountAccrCrExpInt;
    }

    /**
     * Sets the value of the outDepositAccountAccrCrExpInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountAccrCrExpInt(BigDecimal value) {
        this.outDepositAccountAccrCrExpInt = value;
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
     * Gets the value of the outHeaderTimeDeposRenewalBondNumber property.
     * 
     */
    public double getOutHeaderTimeDeposRenewalBondNumber() {
        return outHeaderTimeDeposRenewalBondNumber;
    }

    /**
     * Sets the value of the outHeaderTimeDeposRenewalBondNumber property.
     * 
     */
    public void setOutHeaderTimeDeposRenewalBondNumber(double value) {
        this.outHeaderTimeDeposRenewalBondNumber = value;
    }

    /**
     * Gets the value of the outHeaderTimeDeposRenewalCrInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutHeaderTimeDeposRenewalCrInterestRate() {
        return outHeaderTimeDeposRenewalCrInterestRate;
    }

    /**
     * Sets the value of the outHeaderTimeDeposRenewalCrInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutHeaderTimeDeposRenewalCrInterestRate(BigDecimal value) {
        this.outHeaderTimeDeposRenewalCrInterestRate = value;
    }

    /**
     * Gets the value of the outHeaderTimeDeposRenewalDaysDuration property.
     * 
     */
    public short getOutHeaderTimeDeposRenewalDaysDuration() {
        return outHeaderTimeDeposRenewalDaysDuration;
    }

    /**
     * Sets the value of the outHeaderTimeDeposRenewalDaysDuration property.
     * 
     */
    public void setOutHeaderTimeDeposRenewalDaysDuration(short value) {
        this.outHeaderTimeDeposRenewalDaysDuration = value;
    }

    /**
     * Gets the value of the outHeaderTimeDeposRenewalEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHeaderTimeDeposRenewalEntryStatus() {
        return outHeaderTimeDeposRenewalEntryStatus;
    }

    /**
     * Sets the value of the outHeaderTimeDeposRenewalEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHeaderTimeDeposRenewalEntryStatus(String value) {
        this.outHeaderTimeDeposRenewalEntryStatus = value;
    }

    /**
     * Gets the value of the outHeaderTimeDeposRenewalExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutHeaderTimeDeposRenewalExpiryDate() {
        return outHeaderTimeDeposRenewalExpiryDate;
    }

    /**
     * Sets the value of the outHeaderTimeDeposRenewalExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutHeaderTimeDeposRenewalExpiryDate(XMLGregorianCalendar value) {
        this.outHeaderTimeDeposRenewalExpiryDate = value;
    }

    /**
     * Gets the value of the outHeaderTimeDeposRenewalInitBondAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutHeaderTimeDeposRenewalInitBondAmount() {
        return outHeaderTimeDeposRenewalInitBondAmount;
    }

    /**
     * Sets the value of the outHeaderTimeDeposRenewalInitBondAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutHeaderTimeDeposRenewalInitBondAmount(BigDecimal value) {
        this.outHeaderTimeDeposRenewalInitBondAmount = value;
    }

    /**
     * Gets the value of the outHeaderTimeDeposRenewalInterPayOptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHeaderTimeDeposRenewalInterPayOptions() {
        return outHeaderTimeDeposRenewalInterPayOptions;
    }

    /**
     * Sets the value of the outHeaderTimeDeposRenewalInterPayOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHeaderTimeDeposRenewalInterPayOptions(String value) {
        this.outHeaderTimeDeposRenewalInterPayOptions = value;
    }

    /**
     * Gets the value of the outHeaderTimeDeposRenewalInterestPayInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHeaderTimeDeposRenewalInterestPayInd() {
        return outHeaderTimeDeposRenewalInterestPayInd;
    }

    /**
     * Sets the value of the outHeaderTimeDeposRenewalInterestPayInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHeaderTimeDeposRenewalInterestPayInd(String value) {
        this.outHeaderTimeDeposRenewalInterestPayInd = value;
    }

    /**
     * Gets the value of the outHeaderTimeDeposRenewalInterestToWithdr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutHeaderTimeDeposRenewalInterestToWithdr() {
        return outHeaderTimeDeposRenewalInterestToWithdr;
    }

    /**
     * Sets the value of the outHeaderTimeDeposRenewalInterestToWithdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutHeaderTimeDeposRenewalInterestToWithdr(BigDecimal value) {
        this.outHeaderTimeDeposRenewalInterestToWithdr = value;
    }

    /**
     * Gets the value of the outHeaderTimeDeposRenewalPartWithdrCount property.
     * 
     */
    public short getOutHeaderTimeDeposRenewalPartWithdrCount() {
        return outHeaderTimeDeposRenewalPartWithdrCount;
    }

    /**
     * Sets the value of the outHeaderTimeDeposRenewalPartWithdrCount property.
     * 
     */
    public void setOutHeaderTimeDeposRenewalPartWithdrCount(short value) {
        this.outHeaderTimeDeposRenewalPartWithdrCount = value;
    }

    /**
     * Gets the value of the outHeaderTimeDeposRenewalRenewalBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutHeaderTimeDeposRenewalRenewalBalance() {
        return outHeaderTimeDeposRenewalRenewalBalance;
    }

    /**
     * Sets the value of the outHeaderTimeDeposRenewalRenewalBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutHeaderTimeDeposRenewalRenewalBalance(BigDecimal value) {
        this.outHeaderTimeDeposRenewalRenewalBalance = value;
    }

    /**
     * Gets the value of the outHeaderTimeDeposRenewalRenewalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutHeaderTimeDeposRenewalRenewalDate() {
        return outHeaderTimeDeposRenewalRenewalDate;
    }

    /**
     * Sets the value of the outHeaderTimeDeposRenewalRenewalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutHeaderTimeDeposRenewalRenewalDate(XMLGregorianCalendar value) {
        this.outHeaderTimeDeposRenewalRenewalDate = value;
    }

    /**
     * Gets the value of the outHeaderTimeDeposRenewalStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutHeaderTimeDeposRenewalStartDate() {
        return outHeaderTimeDeposRenewalStartDate;
    }

    /**
     * Sets the value of the outHeaderTimeDeposRenewalStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutHeaderTimeDeposRenewalStartDate(XMLGregorianCalendar value) {
        this.outHeaderTimeDeposRenewalStartDate = value;
    }

    /**
     * Gets the value of the outHeaderTimeDeposRenewalTotInterWithdr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutHeaderTimeDeposRenewalTotInterWithdr() {
        return outHeaderTimeDeposRenewalTotInterWithdr;
    }

    /**
     * Sets the value of the outHeaderTimeDeposRenewalTotInterWithdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutHeaderTimeDeposRenewalTotInterWithdr(BigDecimal value) {
        this.outHeaderTimeDeposRenewalTotInterWithdr = value;
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
     * Gets the value of the outIefSuppliedDescInterPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIefSuppliedDescInterPayment() {
        return outIefSuppliedDescInterPayment;
    }

    /**
     * Sets the value of the outIefSuppliedDescInterPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIefSuppliedDescInterPayment(String value) {
        this.outIefSuppliedDescInterPayment = value;
    }

    /**
     * Gets the value of the outIefSuppliedDescStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIefSuppliedDescStatus() {
        return outIefSuppliedDescStatus;
    }

    /**
     * Sets the value of the outIefSuppliedDescStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIefSuppliedDescStatus(String value) {
        this.outIefSuppliedDescStatus = value;
    }

    /**
     * Gets the value of the outIefSuppliedEnableControl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIefSuppliedEnableControl() {
        return outIefSuppliedEnableControl;
    }

    /**
     * Sets the value of the outIefSuppliedEnableControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIefSuppliedEnableControl(String value) {
        this.outIefSuppliedEnableControl = value;
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
     * Gets the value of the outInterestAccCurrencyIdCurrency property.
     * 
     */
    public int getOutInterestAccCurrencyIdCurrency() {
        return outInterestAccCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outInterestAccCurrencyIdCurrency property.
     * 
     */
    public void setOutInterestAccCurrencyIdCurrency(int value) {
        this.outInterestAccCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outInterestAccCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInterestAccCurrencyShortDescr() {
        return outInterestAccCurrencyShortDescr;
    }

    /**
     * Sets the value of the outInterestAccCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInterestAccCurrencyShortDescr(String value) {
        this.outInterestAccCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outInterestAccDepositAccountAccountNumber property.
     * 
     */
    public double getOutInterestAccDepositAccountAccountNumber() {
        return outInterestAccDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the outInterestAccDepositAccountAccountNumber property.
     * 
     */
    public void setOutInterestAccDepositAccountAccountNumber(double value) {
        this.outInterestAccDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outInterestAccDepositAccountCDigit property.
     * 
     */
    public short getOutInterestAccDepositAccountCDigit() {
        return outInterestAccDepositAccountCDigit;
    }

    /**
     * Sets the value of the outInterestAccDepositAccountCDigit property.
     * 
     */
    public void setOutInterestAccDepositAccountCDigit(short value) {
        this.outInterestAccDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the outInterestAccDepositAccountEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInterestAccDepositAccountEntryStatus() {
        return outInterestAccDepositAccountEntryStatus;
    }

    /**
     * Sets the value of the outInterestAccDepositAccountEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInterestAccDepositAccountEntryStatus(String value) {
        this.outInterestAccDepositAccountEntryStatus = value;
    }

    /**
     * Gets the value of the outInterestAccProductIdProduct property.
     * 
     */
    public int getOutInterestAccProductIdProduct() {
        return outInterestAccProductIdProduct;
    }

    /**
     * Sets the value of the outInterestAccProductIdProduct property.
     * 
     */
    public void setOutInterestAccProductIdProduct(int value) {
        this.outInterestAccProductIdProduct = value;
    }

    /**
     * Gets the value of the outInterestAccUnitCode property.
     * 
     */
    public int getOutInterestAccUnitCode() {
        return outInterestAccUnitCode;
    }

    /**
     * Sets the value of the outInterestAccUnitCode property.
     * 
     */
    public void setOutInterestAccUnitCode(int value) {
        this.outInterestAccUnitCode = value;
    }

    /**
     * Gets the value of the outInterestProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInterestProfitsAccountAccountNumber() {
        return outInterestProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outInterestProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInterestProfitsAccountAccountNumber(String value) {
        this.outInterestProfitsAccountAccountNumber = value;
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
     * Gets the value of the outMoreRecIndexIefSuppliedCount property.
     * 
     */
    public int getOutMoreRecIndexIefSuppliedCount() {
        return outMoreRecIndexIefSuppliedCount;
    }

    /**
     * Sets the value of the outMoreRecIndexIefSuppliedCount property.
     * 
     */
    public void setOutMoreRecIndexIefSuppliedCount(int value) {
        this.outMoreRecIndexIefSuppliedCount = value;
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
     * Gets the value of the outTimeDeposRenewalRenewalSerNum property.
     * 
     */
    public int getOutTimeDeposRenewalRenewalSerNum() {
        return outTimeDeposRenewalRenewalSerNum;
    }

    /**
     * Sets the value of the outTimeDeposRenewalRenewalSerNum property.
     * 
     */
    public void setOutTimeDeposRenewalRenewalSerNum(int value) {
        this.outTimeDeposRenewalRenewalSerNum = value;
    }

    /**
     * Gets the value of the outExtraitGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfD0357VOutExtraitGrpItem }
     *     
     */
    public ArrayOfD0357VOutExtraitGrpItem getOutExtraitGrp() {
        return outExtraitGrp;
    }

    /**
     * Sets the value of the outExtraitGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfD0357VOutExtraitGrpItem }
     *     
     */
    public void setOutExtraitGrp(ArrayOfD0357VOutExtraitGrpItem value) {
        this.outExtraitGrp = value;
    }

    /**
     * Gets the value of the outGrpMntExtrait property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfD0357VOutGrpMntExtraitItem }
     *     
     */
    public ArrayOfD0357VOutGrpMntExtraitItem getOutGrpMntExtrait() {
        return outGrpMntExtrait;
    }

    /**
     * Sets the value of the outGrpMntExtrait property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfD0357VOutGrpMntExtraitItem }
     *     
     */
    public void setOutGrpMntExtrait(ArrayOfD0357VOutGrpMntExtraitItem value) {
        this.outGrpMntExtrait = value;
    }

    /**
     * Gets the value of the isMore property.
     * 
     */
    public boolean isIsMore() {
        return isMore;
    }

    /**
     * Sets the value of the isMore property.
     * 
     */
    public void setIsMore(boolean value) {
        this.isMore = value;
    }

}
