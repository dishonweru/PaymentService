
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StopChequeExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopChequeExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutAccUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutChequeBookCommissionFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksBankId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCollaborationBanksBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCurrTimePrintLineDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCurrTimePrintLineTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustomerLnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepMntRecordingPChequeStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepMntRecordingTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepTrxjustTrnType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepTrxRecordingOFinalAccAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepTrxRecordingTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepTrxRecordingTunInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepTrxRecordingUUserTotalsAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutEvaluationTeamInformationAuthorizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvaluationTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvaluationTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFromDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutFromDepositAccountAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFromDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutFromDepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFromDepositAccountEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFromDepositAccountSecretAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIbanAccountCharSuppliedChar37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLongErrorMessageIefSuppliedActionEntryMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutParVoucherRunVoucherLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutPrnChqGrpLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutStatusIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutStatusIefSuppliedSrvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuccessfulTransactionWorkAdviceCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutPrnChqGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutPrnChqGrp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopChequeExport", propOrder = {
    "outAccUnitCode",
    "outChequeBookCommissionFlag",
    "outCollaborationBanksBankId",
    "outCollaborationBanksBankName",
    "outCurrencyIdCurrency",
    "outCurrencyShortDescr",
    "outCurrTimePrintLineDate",
    "outCurrTimePrintLineTime",
    "outCustomerCDigit",
    "outCustomerCustId",
    "outCustomerLnsSuppliedName",
    "outDepMntRecordingPChequeStatus",
    "outDepMntRecordingTrxUsrSn",
    "outDepTrxjustTrnType",
    "outDepTrxRecordingOFinalAccAmount",
    "outDepTrxRecordingTrxUsrSn",
    "outDepTrxRecordingTunInternalSn",
    "outDepTrxRecordingUUserTotalsAmn",
    "outEvaluationTeamInformationAuthorizationType",
    "outEvaluationTeamInformationRequiredProfile1",
    "outEvaluationTeamInformationRequiredProfile2",
    "outFromDepositAccountAccountNumber",
    "outFromDepositAccountAccountType",
    "outFromDepositAccountCDigit",
    "outFromDepositAccountDesignation",
    "outFromDepositAccountEntryStatus",
    "outFromDepositAccountSecretAccFlag",
    "outIbanAccountCharSuppliedChar37",
    "outJustificIdJustific",
    "outLongErrorMessageIefSuppliedActionEntryMsg",
    "outParVoucherRunVoucherLine",
    "outPrftTransactionDescription",
    "outPrftTransactionIdTransact",
    "outPrnChqGrpLength",
    "outProductDescription",
    "outProductIdProduct",
    "outStatusIefSuppliedActionEntryDesc",
    "outStatusIefSuppliedSrvStatus",
    "outSuccessfulTransactionWorkAdviceCounter",
    "outPrnChqGrp"
})
public class StopChequeExport
    extends BaseExport
{

    @XmlElement(name = "OutAccUnitCode")
    protected int outAccUnitCode;
    @XmlElement(name = "OutChequeBookCommissionFlag")
    protected String outChequeBookCommissionFlag;
    @XmlElement(name = "OutCollaborationBanksBankId")
    protected int outCollaborationBanksBankId;
    @XmlElement(name = "OutCollaborationBanksBankName")
    protected String outCollaborationBanksBankName;
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
    @XmlElement(name = "OutDepMntRecordingPChequeStatus")
    protected String outDepMntRecordingPChequeStatus;
    @XmlElement(name = "OutDepMntRecordingTrxUsrSn")
    protected int outDepMntRecordingTrxUsrSn;
    @XmlElement(name = "OutDepTrxjustTrnType")
    protected String outDepTrxjustTrnType;
    @XmlElement(name = "OutDepTrxRecordingOFinalAccAmount", required = true)
    protected BigDecimal outDepTrxRecordingOFinalAccAmount;
    @XmlElement(name = "OutDepTrxRecordingTrxUsrSn")
    protected int outDepTrxRecordingTrxUsrSn;
    @XmlElement(name = "OutDepTrxRecordingTunInternalSn")
    protected short outDepTrxRecordingTunInternalSn;
    @XmlElement(name = "OutDepTrxRecordingUUserTotalsAmn", required = true)
    protected BigDecimal outDepTrxRecordingUUserTotalsAmn;
    @XmlElement(name = "OutEvaluationTeamInformationAuthorizationType")
    protected String outEvaluationTeamInformationAuthorizationType;
    @XmlElement(name = "OutEvaluationTeamInformationRequiredProfile1")
    protected String outEvaluationTeamInformationRequiredProfile1;
    @XmlElement(name = "OutEvaluationTeamInformationRequiredProfile2")
    protected String outEvaluationTeamInformationRequiredProfile2;
    @XmlElement(name = "OutFromDepositAccountAccountNumber")
    protected double outFromDepositAccountAccountNumber;
    @XmlElement(name = "OutFromDepositAccountAccountType")
    protected String outFromDepositAccountAccountType;
    @XmlElement(name = "OutFromDepositAccountCDigit")
    protected short outFromDepositAccountCDigit;
    @XmlElement(name = "OutFromDepositAccountDesignation")
    protected String outFromDepositAccountDesignation;
    @XmlElement(name = "OutFromDepositAccountEntryStatus")
    protected String outFromDepositAccountEntryStatus;
    @XmlElement(name = "OutFromDepositAccountSecretAccFlag")
    protected String outFromDepositAccountSecretAccFlag;
    @XmlElement(name = "OutIbanAccountCharSuppliedChar37")
    protected String outIbanAccountCharSuppliedChar37;
    @XmlElement(name = "OutJustificIdJustific")
    protected int outJustificIdJustific;
    @XmlElement(name = "OutLongErrorMessageIefSuppliedActionEntryMsg")
    protected String outLongErrorMessageIefSuppliedActionEntryMsg;
    @XmlElement(name = "OutParVoucherRunVoucherLine")
    protected String outParVoucherRunVoucherLine;
    @XmlElement(name = "OutPrftTransactionDescription")
    protected String outPrftTransactionDescription;
    @XmlElement(name = "OutPrftTransactionIdTransact")
    protected int outPrftTransactionIdTransact;
    @XmlElement(name = "OutPrnChqGrpLength")
    protected int outPrnChqGrpLength;
    @XmlElement(name = "OutProductDescription")
    protected String outProductDescription;
    @XmlElement(name = "OutProductIdProduct")
    protected int outProductIdProduct;
    @XmlElement(name = "OutStatusIefSuppliedActionEntryDesc")
    protected String outStatusIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutStatusIefSuppliedSrvStatus")
    protected String outStatusIefSuppliedSrvStatus;
    @XmlElement(name = "OutSuccessfulTransactionWorkAdviceCounter")
    protected int outSuccessfulTransactionWorkAdviceCounter;
    @XmlElement(name = "OutPrnChqGrp")
    protected ArrayOfOutPrnChqGrp outPrnChqGrp;

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
     * Gets the value of the outChequeBookCommissionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutChequeBookCommissionFlag() {
        return outChequeBookCommissionFlag;
    }

    /**
     * Sets the value of the outChequeBookCommissionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutChequeBookCommissionFlag(String value) {
        this.outChequeBookCommissionFlag = value;
    }

    /**
     * Gets the value of the outCollaborationBanksBankId property.
     * 
     */
    public int getOutCollaborationBanksBankId() {
        return outCollaborationBanksBankId;
    }

    /**
     * Sets the value of the outCollaborationBanksBankId property.
     * 
     */
    public void setOutCollaborationBanksBankId(int value) {
        this.outCollaborationBanksBankId = value;
    }

    /**
     * Gets the value of the outCollaborationBanksBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksBankName() {
        return outCollaborationBanksBankName;
    }

    /**
     * Sets the value of the outCollaborationBanksBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksBankName(String value) {
        this.outCollaborationBanksBankName = value;
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
     * Gets the value of the outDepMntRecordingPChequeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepMntRecordingPChequeStatus() {
        return outDepMntRecordingPChequeStatus;
    }

    /**
     * Sets the value of the outDepMntRecordingPChequeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepMntRecordingPChequeStatus(String value) {
        this.outDepMntRecordingPChequeStatus = value;
    }

    /**
     * Gets the value of the outDepMntRecordingTrxUsrSn property.
     * 
     */
    public int getOutDepMntRecordingTrxUsrSn() {
        return outDepMntRecordingTrxUsrSn;
    }

    /**
     * Sets the value of the outDepMntRecordingTrxUsrSn property.
     * 
     */
    public void setOutDepMntRecordingTrxUsrSn(int value) {
        this.outDepMntRecordingTrxUsrSn = value;
    }

    /**
     * Gets the value of the outDepTrxjustTrnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepTrxjustTrnType() {
        return outDepTrxjustTrnType;
    }

    /**
     * Sets the value of the outDepTrxjustTrnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepTrxjustTrnType(String value) {
        this.outDepTrxjustTrnType = value;
    }

    /**
     * Gets the value of the outDepTrxRecordingOFinalAccAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepTrxRecordingOFinalAccAmount() {
        return outDepTrxRecordingOFinalAccAmount;
    }

    /**
     * Sets the value of the outDepTrxRecordingOFinalAccAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepTrxRecordingOFinalAccAmount(BigDecimal value) {
        this.outDepTrxRecordingOFinalAccAmount = value;
    }

    /**
     * Gets the value of the outDepTrxRecordingTrxUsrSn property.
     * 
     */
    public int getOutDepTrxRecordingTrxUsrSn() {
        return outDepTrxRecordingTrxUsrSn;
    }

    /**
     * Sets the value of the outDepTrxRecordingTrxUsrSn property.
     * 
     */
    public void setOutDepTrxRecordingTrxUsrSn(int value) {
        this.outDepTrxRecordingTrxUsrSn = value;
    }

    /**
     * Gets the value of the outDepTrxRecordingTunInternalSn property.
     * 
     */
    public short getOutDepTrxRecordingTunInternalSn() {
        return outDepTrxRecordingTunInternalSn;
    }

    /**
     * Sets the value of the outDepTrxRecordingTunInternalSn property.
     * 
     */
    public void setOutDepTrxRecordingTunInternalSn(short value) {
        this.outDepTrxRecordingTunInternalSn = value;
    }

    /**
     * Gets the value of the outDepTrxRecordingUUserTotalsAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepTrxRecordingUUserTotalsAmn() {
        return outDepTrxRecordingUUserTotalsAmn;
    }

    /**
     * Sets the value of the outDepTrxRecordingUUserTotalsAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepTrxRecordingUUserTotalsAmn(BigDecimal value) {
        this.outDepTrxRecordingUUserTotalsAmn = value;
    }

    /**
     * Gets the value of the outEvaluationTeamInformationAuthorizationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvaluationTeamInformationAuthorizationType() {
        return outEvaluationTeamInformationAuthorizationType;
    }

    /**
     * Sets the value of the outEvaluationTeamInformationAuthorizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvaluationTeamInformationAuthorizationType(String value) {
        this.outEvaluationTeamInformationAuthorizationType = value;
    }

    /**
     * Gets the value of the outEvaluationTeamInformationRequiredProfile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvaluationTeamInformationRequiredProfile1() {
        return outEvaluationTeamInformationRequiredProfile1;
    }

    /**
     * Sets the value of the outEvaluationTeamInformationRequiredProfile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvaluationTeamInformationRequiredProfile1(String value) {
        this.outEvaluationTeamInformationRequiredProfile1 = value;
    }

    /**
     * Gets the value of the outEvaluationTeamInformationRequiredProfile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvaluationTeamInformationRequiredProfile2() {
        return outEvaluationTeamInformationRequiredProfile2;
    }

    /**
     * Sets the value of the outEvaluationTeamInformationRequiredProfile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvaluationTeamInformationRequiredProfile2(String value) {
        this.outEvaluationTeamInformationRequiredProfile2 = value;
    }

    /**
     * Gets the value of the outFromDepositAccountAccountNumber property.
     * 
     */
    public double getOutFromDepositAccountAccountNumber() {
        return outFromDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the outFromDepositAccountAccountNumber property.
     * 
     */
    public void setOutFromDepositAccountAccountNumber(double value) {
        this.outFromDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outFromDepositAccountAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFromDepositAccountAccountType() {
        return outFromDepositAccountAccountType;
    }

    /**
     * Sets the value of the outFromDepositAccountAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFromDepositAccountAccountType(String value) {
        this.outFromDepositAccountAccountType = value;
    }

    /**
     * Gets the value of the outFromDepositAccountCDigit property.
     * 
     */
    public short getOutFromDepositAccountCDigit() {
        return outFromDepositAccountCDigit;
    }

    /**
     * Sets the value of the outFromDepositAccountCDigit property.
     * 
     */
    public void setOutFromDepositAccountCDigit(short value) {
        this.outFromDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the outFromDepositAccountDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFromDepositAccountDesignation() {
        return outFromDepositAccountDesignation;
    }

    /**
     * Sets the value of the outFromDepositAccountDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFromDepositAccountDesignation(String value) {
        this.outFromDepositAccountDesignation = value;
    }

    /**
     * Gets the value of the outFromDepositAccountEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFromDepositAccountEntryStatus() {
        return outFromDepositAccountEntryStatus;
    }

    /**
     * Sets the value of the outFromDepositAccountEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFromDepositAccountEntryStatus(String value) {
        this.outFromDepositAccountEntryStatus = value;
    }

    /**
     * Gets the value of the outFromDepositAccountSecretAccFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFromDepositAccountSecretAccFlag() {
        return outFromDepositAccountSecretAccFlag;
    }

    /**
     * Sets the value of the outFromDepositAccountSecretAccFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFromDepositAccountSecretAccFlag(String value) {
        this.outFromDepositAccountSecretAccFlag = value;
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
     * Gets the value of the outLongErrorMessageIefSuppliedActionEntryMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLongErrorMessageIefSuppliedActionEntryMsg() {
        return outLongErrorMessageIefSuppliedActionEntryMsg;
    }

    /**
     * Sets the value of the outLongErrorMessageIefSuppliedActionEntryMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLongErrorMessageIefSuppliedActionEntryMsg(String value) {
        this.outLongErrorMessageIefSuppliedActionEntryMsg = value;
    }

    /**
     * Gets the value of the outParVoucherRunVoucherLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutParVoucherRunVoucherLine() {
        return outParVoucherRunVoucherLine;
    }

    /**
     * Sets the value of the outParVoucherRunVoucherLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutParVoucherRunVoucherLine(String value) {
        this.outParVoucherRunVoucherLine = value;
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
     * Gets the value of the outPrnChqGrpLength property.
     * 
     */
    public int getOutPrnChqGrpLength() {
        return outPrnChqGrpLength;
    }

    /**
     * Sets the value of the outPrnChqGrpLength property.
     * 
     */
    public void setOutPrnChqGrpLength(int value) {
        this.outPrnChqGrpLength = value;
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
     * Gets the value of the outSuccessfulTransactionWorkAdviceCounter property.
     * 
     */
    public int getOutSuccessfulTransactionWorkAdviceCounter() {
        return outSuccessfulTransactionWorkAdviceCounter;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkAdviceCounter property.
     * 
     */
    public void setOutSuccessfulTransactionWorkAdviceCounter(int value) {
        this.outSuccessfulTransactionWorkAdviceCounter = value;
    }

    /**
     * Gets the value of the outPrnChqGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutPrnChqGrp }
     *     
     */
    public ArrayOfOutPrnChqGrp getOutPrnChqGrp() {
        return outPrnChqGrp;
    }

    /**
     * Sets the value of the outPrnChqGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutPrnChqGrp }
     *     
     */
    public void setOutPrnChqGrp(ArrayOfOutPrnChqGrp value) {
        this.outPrnChqGrp = value;
    }

}
