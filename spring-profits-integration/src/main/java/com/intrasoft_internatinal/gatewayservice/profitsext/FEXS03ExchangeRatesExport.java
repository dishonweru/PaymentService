
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FEXS03_ExchangeRatesExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FEXS03_ExchangeRatesExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExUpdateRateTableActivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ExUpdateRateTableActivationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBankParametersEuroEchoDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankParametersEuroLockedRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCommIefSuppliedChar6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCurrPrintLineDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCurrPrintLineTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDataRateTableBuyRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDataRateTableSellRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDataRateTableTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutFilterListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedSrvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutImKeyRateTableRateTableNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutNumberRateTableRateTableNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutRateGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRateTableActivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRateTableActivationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRateTableBuyRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRateTableBuyRateMt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRateTableExchNotesFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRateTableRateTableNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutRateTableScaleMaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRateTableSellRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRateTableTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRatesetDetailsRateTableActivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRatesetDetailsRateTableActivationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRatesetDetailsRateTableRateTableNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutTeamInformationAccountCode" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutTeamInformationAuthorisationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationAuthorizationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationAuthorizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationAvailableDateSpread" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationChargeDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationCommissionDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationCreditInterestRateSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationCustomerCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationDebitInterestRateSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationEvaluationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationInterestRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationJustificationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationJustificationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationLoanStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationOverdraftAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationOverdraftSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationPenaltyDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationPenaltyRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationServicePenaltySpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationSuper1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationSuper1TerminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationSuper2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationSuper2TerminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationTeamComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationTransactionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationTrsAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationUnclearWithdrawalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationUserCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUserProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUserProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUserProfile3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUserSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUserTerminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationValueDateSpread" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRateTable1" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfFEXS03OutRateTable1Item" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FEXS03_ExchangeRatesExport", propOrder = {
    "command",
    "exUpdateRateTableActivationDate",
    "exUpdateRateTableActivationTime",
    "outBankParametersEuroEchoDesc",
    "outBankParametersEuroLockedRate",
    "outCommIefSuppliedChar6",
    "outCurrPrintLineDate",
    "outCurrPrintLineTime",
    "outCurrencyIdCurrency",
    "outCurrencyShortDescr",
    "outDataRateTableBuyRate",
    "outDataRateTableSellRate",
    "outDataRateTableTmstamp",
    "outFilterListSetDescription",
    "outIefSuppliedActionEntryDesc",
    "outIefSuppliedSrvStatus",
    "outImKeyRateTableRateTableNumber",
    "outNumberRateTableRateTableNumber",
    "outRateGenericDetailDescription",
    "outRateTableActivationDate",
    "outRateTableActivationTime",
    "outRateTableBuyRate",
    "outRateTableBuyRateMt",
    "outRateTableExchNotesFlag",
    "outRateTableRateTableNumber",
    "outRateTableScaleMaxAmount",
    "outRateTableSellRate",
    "outRateTableTmstamp",
    "outRatesetDetailsRateTableActivationDate",
    "outRatesetDetailsRateTableActivationTime",
    "outRatesetDetailsRateTableRateTableNumber",
    "outTeamInformationAccountCode",
    "outTeamInformationAuthorisationType",
    "outTeamInformationAuthorizationResult",
    "outTeamInformationAuthorizationType",
    "outTeamInformationAvailableDateSpread",
    "outTeamInformationChargeDiscount",
    "outTeamInformationCommissionDiscount",
    "outTeamInformationCreditInterestRateSpread",
    "outTeamInformationCustomerCode",
    "outTeamInformationCustomerSurname",
    "outTeamInformationDebitInterestRateSpread",
    "outTeamInformationEvaluationResult",
    "outTeamInformationInterestRate",
    "outTeamInformationJustificationDescription",
    "outTeamInformationJustificationId",
    "outTeamInformationLoanStatus",
    "outTeamInformationOverdraftAmount",
    "outTeamInformationOverdraftSpread",
    "outTeamInformationPenaltyDiscount",
    "outTeamInformationPenaltyRate",
    "outTeamInformationProductDescription",
    "outTeamInformationProductId",
    "outTeamInformationRequiredProfile1",
    "outTeamInformationRequiredProfile2",
    "outTeamInformationServicePenaltySpread",
    "outTeamInformationSuper1Code",
    "outTeamInformationSuper1TerminalId",
    "outTeamInformationSuper2Code",
    "outTeamInformationSuper2TerminalId",
    "outTeamInformationTeamComments",
    "outTeamInformationTransactionDescription",
    "outTeamInformationTransactionId",
    "outTeamInformationTrsAmount",
    "outTeamInformationUnclearWithdrawalFlag",
    "outTeamInformationUnitCode",
    "outTeamInformationUserCode",
    "outTeamInformationUserProfile1",
    "outTeamInformationUserProfile2",
    "outTeamInformationUserProfile3",
    "outTeamInformationUserSurname",
    "outTeamInformationUserTerminalId",
    "outTeamInformationValueDateSpread",
    "outTrxCountTrxCounter",
    "outRateTable1"
})
public class FEXS03ExchangeRatesExport
    extends BaseExport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "ExUpdateRateTableActivationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exUpdateRateTableActivationDate;
    @XmlElement(name = "ExUpdateRateTableActivationTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exUpdateRateTableActivationTime;
    @XmlElement(name = "OutBankParametersEuroEchoDesc")
    protected String outBankParametersEuroEchoDesc;
    @XmlElement(name = "OutBankParametersEuroLockedRate", required = true)
    protected BigDecimal outBankParametersEuroLockedRate;
    @XmlElement(name = "OutCommIefSuppliedChar6")
    protected String outCommIefSuppliedChar6;
    @XmlElement(name = "OutCurrPrintLineDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCurrPrintLineDate;
    @XmlElement(name = "OutCurrPrintLineTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCurrPrintLineTime;
    @XmlElement(name = "OutCurrencyIdCurrency")
    protected int outCurrencyIdCurrency;
    @XmlElement(name = "OutCurrencyShortDescr")
    protected String outCurrencyShortDescr;
    @XmlElement(name = "OutDataRateTableBuyRate", required = true)
    protected BigDecimal outDataRateTableBuyRate;
    @XmlElement(name = "OutDataRateTableSellRate", required = true)
    protected BigDecimal outDataRateTableSellRate;
    @XmlElement(name = "OutDataRateTableTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDataRateTableTmstamp;
    @XmlElement(name = "OutFilterListSetDescription")
    protected String outFilterListSetDescription;
    @XmlElement(name = "OutIefSuppliedActionEntryDesc")
    protected String outIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutIefSuppliedSrvStatus")
    protected String outIefSuppliedSrvStatus;
    @XmlElement(name = "OutImKeyRateTableRateTableNumber")
    protected double outImKeyRateTableRateTableNumber;
    @XmlElement(name = "OutNumberRateTableRateTableNumber")
    protected double outNumberRateTableRateTableNumber;
    @XmlElement(name = "OutRateGenericDetailDescription")
    protected String outRateGenericDetailDescription;
    @XmlElement(name = "OutRateTableActivationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRateTableActivationDate;
    @XmlElement(name = "OutRateTableActivationTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRateTableActivationTime;
    @XmlElement(name = "OutRateTableBuyRate", required = true)
    protected BigDecimal outRateTableBuyRate;
    @XmlElement(name = "OutRateTableBuyRateMt", required = true)
    protected BigDecimal outRateTableBuyRateMt;
    @XmlElement(name = "OutRateTableExchNotesFlag")
    protected String outRateTableExchNotesFlag;
    @XmlElement(name = "OutRateTableRateTableNumber")
    protected double outRateTableRateTableNumber;
    @XmlElement(name = "OutRateTableScaleMaxAmount", required = true)
    protected BigDecimal outRateTableScaleMaxAmount;
    @XmlElement(name = "OutRateTableSellRate", required = true)
    protected BigDecimal outRateTableSellRate;
    @XmlElement(name = "OutRateTableTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRateTableTmstamp;
    @XmlElement(name = "OutRatesetDetailsRateTableActivationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRatesetDetailsRateTableActivationDate;
    @XmlElement(name = "OutRatesetDetailsRateTableActivationTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRatesetDetailsRateTableActivationTime;
    @XmlElement(name = "OutRatesetDetailsRateTableRateTableNumber")
    protected double outRatesetDetailsRateTableRateTableNumber;
    @XmlElement(name = "OutTeamInformationAccountCode")
    protected double outTeamInformationAccountCode;
    @XmlElement(name = "OutTeamInformationAuthorisationType")
    protected String outTeamInformationAuthorisationType;
    @XmlElement(name = "OutTeamInformationAuthorizationResult")
    protected String outTeamInformationAuthorizationResult;
    @XmlElement(name = "OutTeamInformationAuthorizationType")
    protected String outTeamInformationAuthorizationType;
    @XmlElement(name = "OutTeamInformationAvailableDateSpread")
    protected short outTeamInformationAvailableDateSpread;
    @XmlElement(name = "OutTeamInformationChargeDiscount", required = true)
    protected BigDecimal outTeamInformationChargeDiscount;
    @XmlElement(name = "OutTeamInformationCommissionDiscount", required = true)
    protected BigDecimal outTeamInformationCommissionDiscount;
    @XmlElement(name = "OutTeamInformationCreditInterestRateSpread", required = true)
    protected BigDecimal outTeamInformationCreditInterestRateSpread;
    @XmlElement(name = "OutTeamInformationCustomerCode")
    protected int outTeamInformationCustomerCode;
    @XmlElement(name = "OutTeamInformationCustomerSurname")
    protected String outTeamInformationCustomerSurname;
    @XmlElement(name = "OutTeamInformationDebitInterestRateSpread", required = true)
    protected BigDecimal outTeamInformationDebitInterestRateSpread;
    @XmlElement(name = "OutTeamInformationEvaluationResult")
    protected String outTeamInformationEvaluationResult;
    @XmlElement(name = "OutTeamInformationInterestRate", required = true)
    protected BigDecimal outTeamInformationInterestRate;
    @XmlElement(name = "OutTeamInformationJustificationDescription")
    protected String outTeamInformationJustificationDescription;
    @XmlElement(name = "OutTeamInformationJustificationId")
    protected int outTeamInformationJustificationId;
    @XmlElement(name = "OutTeamInformationLoanStatus")
    protected String outTeamInformationLoanStatus;
    @XmlElement(name = "OutTeamInformationOverdraftAmount", required = true)
    protected BigDecimal outTeamInformationOverdraftAmount;
    @XmlElement(name = "OutTeamInformationOverdraftSpread", required = true)
    protected BigDecimal outTeamInformationOverdraftSpread;
    @XmlElement(name = "OutTeamInformationPenaltyDiscount", required = true)
    protected BigDecimal outTeamInformationPenaltyDiscount;
    @XmlElement(name = "OutTeamInformationPenaltyRate", required = true)
    protected BigDecimal outTeamInformationPenaltyRate;
    @XmlElement(name = "OutTeamInformationProductDescription")
    protected String outTeamInformationProductDescription;
    @XmlElement(name = "OutTeamInformationProductId")
    protected int outTeamInformationProductId;
    @XmlElement(name = "OutTeamInformationRequiredProfile1")
    protected String outTeamInformationRequiredProfile1;
    @XmlElement(name = "OutTeamInformationRequiredProfile2")
    protected String outTeamInformationRequiredProfile2;
    @XmlElement(name = "OutTeamInformationServicePenaltySpread", required = true)
    protected BigDecimal outTeamInformationServicePenaltySpread;
    @XmlElement(name = "OutTeamInformationSuper1Code")
    protected String outTeamInformationSuper1Code;
    @XmlElement(name = "OutTeamInformationSuper1TerminalId")
    protected String outTeamInformationSuper1TerminalId;
    @XmlElement(name = "OutTeamInformationSuper2Code")
    protected String outTeamInformationSuper2Code;
    @XmlElement(name = "OutTeamInformationSuper2TerminalId")
    protected String outTeamInformationSuper2TerminalId;
    @XmlElement(name = "OutTeamInformationTeamComments")
    protected String outTeamInformationTeamComments;
    @XmlElement(name = "OutTeamInformationTransactionDescription")
    protected String outTeamInformationTransactionDescription;
    @XmlElement(name = "OutTeamInformationTransactionId")
    protected int outTeamInformationTransactionId;
    @XmlElement(name = "OutTeamInformationTrsAmount", required = true)
    protected BigDecimal outTeamInformationTrsAmount;
    @XmlElement(name = "OutTeamInformationUnclearWithdrawalFlag")
    protected String outTeamInformationUnclearWithdrawalFlag;
    @XmlElement(name = "OutTeamInformationUnitCode")
    protected int outTeamInformationUnitCode;
    @XmlElement(name = "OutTeamInformationUserCode")
    protected String outTeamInformationUserCode;
    @XmlElement(name = "OutTeamInformationUserProfile1")
    protected String outTeamInformationUserProfile1;
    @XmlElement(name = "OutTeamInformationUserProfile2")
    protected String outTeamInformationUserProfile2;
    @XmlElement(name = "OutTeamInformationUserProfile3")
    protected String outTeamInformationUserProfile3;
    @XmlElement(name = "OutTeamInformationUserSurname")
    protected String outTeamInformationUserSurname;
    @XmlElement(name = "OutTeamInformationUserTerminalId")
    protected String outTeamInformationUserTerminalId;
    @XmlElement(name = "OutTeamInformationValueDateSpread")
    protected short outTeamInformationValueDateSpread;
    @XmlElement(name = "OutTrxCountTrxCounter")
    protected int outTrxCountTrxCounter;
    @XmlElement(name = "OutRateTable1")
    protected ArrayOfFEXS03OutRateTable1Item outRateTable1;

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommand(String value) {
        this.command = value;
    }

    /**
     * Gets the value of the exUpdateRateTableActivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExUpdateRateTableActivationDate() {
        return exUpdateRateTableActivationDate;
    }

    /**
     * Sets the value of the exUpdateRateTableActivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExUpdateRateTableActivationDate(XMLGregorianCalendar value) {
        this.exUpdateRateTableActivationDate = value;
    }

    /**
     * Gets the value of the exUpdateRateTableActivationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExUpdateRateTableActivationTime() {
        return exUpdateRateTableActivationTime;
    }

    /**
     * Sets the value of the exUpdateRateTableActivationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExUpdateRateTableActivationTime(XMLGregorianCalendar value) {
        this.exUpdateRateTableActivationTime = value;
    }

    /**
     * Gets the value of the outBankParametersEuroEchoDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankParametersEuroEchoDesc() {
        return outBankParametersEuroEchoDesc;
    }

    /**
     * Sets the value of the outBankParametersEuroEchoDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankParametersEuroEchoDesc(String value) {
        this.outBankParametersEuroEchoDesc = value;
    }

    /**
     * Gets the value of the outBankParametersEuroLockedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBankParametersEuroLockedRate() {
        return outBankParametersEuroLockedRate;
    }

    /**
     * Sets the value of the outBankParametersEuroLockedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBankParametersEuroLockedRate(BigDecimal value) {
        this.outBankParametersEuroLockedRate = value;
    }

    /**
     * Gets the value of the outCommIefSuppliedChar6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCommIefSuppliedChar6() {
        return outCommIefSuppliedChar6;
    }

    /**
     * Sets the value of the outCommIefSuppliedChar6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCommIefSuppliedChar6(String value) {
        this.outCommIefSuppliedChar6 = value;
    }

    /**
     * Gets the value of the outCurrPrintLineDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCurrPrintLineDate() {
        return outCurrPrintLineDate;
    }

    /**
     * Sets the value of the outCurrPrintLineDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCurrPrintLineDate(XMLGregorianCalendar value) {
        this.outCurrPrintLineDate = value;
    }

    /**
     * Gets the value of the outCurrPrintLineTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCurrPrintLineTime() {
        return outCurrPrintLineTime;
    }

    /**
     * Sets the value of the outCurrPrintLineTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCurrPrintLineTime(XMLGregorianCalendar value) {
        this.outCurrPrintLineTime = value;
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
     * Gets the value of the outDataRateTableBuyRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDataRateTableBuyRate() {
        return outDataRateTableBuyRate;
    }

    /**
     * Sets the value of the outDataRateTableBuyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDataRateTableBuyRate(BigDecimal value) {
        this.outDataRateTableBuyRate = value;
    }

    /**
     * Gets the value of the outDataRateTableSellRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDataRateTableSellRate() {
        return outDataRateTableSellRate;
    }

    /**
     * Sets the value of the outDataRateTableSellRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDataRateTableSellRate(BigDecimal value) {
        this.outDataRateTableSellRate = value;
    }

    /**
     * Gets the value of the outDataRateTableTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDataRateTableTmstamp() {
        return outDataRateTableTmstamp;
    }

    /**
     * Sets the value of the outDataRateTableTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDataRateTableTmstamp(XMLGregorianCalendar value) {
        this.outDataRateTableTmstamp = value;
    }

    /**
     * Gets the value of the outFilterListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFilterListSetDescription() {
        return outFilterListSetDescription;
    }

    /**
     * Sets the value of the outFilterListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFilterListSetDescription(String value) {
        this.outFilterListSetDescription = value;
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
     * Gets the value of the outImKeyRateTableRateTableNumber property.
     * 
     */
    public double getOutImKeyRateTableRateTableNumber() {
        return outImKeyRateTableRateTableNumber;
    }

    /**
     * Sets the value of the outImKeyRateTableRateTableNumber property.
     * 
     */
    public void setOutImKeyRateTableRateTableNumber(double value) {
        this.outImKeyRateTableRateTableNumber = value;
    }

    /**
     * Gets the value of the outNumberRateTableRateTableNumber property.
     * 
     */
    public double getOutNumberRateTableRateTableNumber() {
        return outNumberRateTableRateTableNumber;
    }

    /**
     * Sets the value of the outNumberRateTableRateTableNumber property.
     * 
     */
    public void setOutNumberRateTableRateTableNumber(double value) {
        this.outNumberRateTableRateTableNumber = value;
    }

    /**
     * Gets the value of the outRateGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRateGenericDetailDescription() {
        return outRateGenericDetailDescription;
    }

    /**
     * Sets the value of the outRateGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRateGenericDetailDescription(String value) {
        this.outRateGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outRateTableActivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRateTableActivationDate() {
        return outRateTableActivationDate;
    }

    /**
     * Sets the value of the outRateTableActivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRateTableActivationDate(XMLGregorianCalendar value) {
        this.outRateTableActivationDate = value;
    }

    /**
     * Gets the value of the outRateTableActivationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRateTableActivationTime() {
        return outRateTableActivationTime;
    }

    /**
     * Sets the value of the outRateTableActivationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRateTableActivationTime(XMLGregorianCalendar value) {
        this.outRateTableActivationTime = value;
    }

    /**
     * Gets the value of the outRateTableBuyRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRateTableBuyRate() {
        return outRateTableBuyRate;
    }

    /**
     * Sets the value of the outRateTableBuyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRateTableBuyRate(BigDecimal value) {
        this.outRateTableBuyRate = value;
    }

    /**
     * Gets the value of the outRateTableBuyRateMt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRateTableBuyRateMt() {
        return outRateTableBuyRateMt;
    }

    /**
     * Sets the value of the outRateTableBuyRateMt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRateTableBuyRateMt(BigDecimal value) {
        this.outRateTableBuyRateMt = value;
    }

    /**
     * Gets the value of the outRateTableExchNotesFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRateTableExchNotesFlag() {
        return outRateTableExchNotesFlag;
    }

    /**
     * Sets the value of the outRateTableExchNotesFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRateTableExchNotesFlag(String value) {
        this.outRateTableExchNotesFlag = value;
    }

    /**
     * Gets the value of the outRateTableRateTableNumber property.
     * 
     */
    public double getOutRateTableRateTableNumber() {
        return outRateTableRateTableNumber;
    }

    /**
     * Sets the value of the outRateTableRateTableNumber property.
     * 
     */
    public void setOutRateTableRateTableNumber(double value) {
        this.outRateTableRateTableNumber = value;
    }

    /**
     * Gets the value of the outRateTableScaleMaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRateTableScaleMaxAmount() {
        return outRateTableScaleMaxAmount;
    }

    /**
     * Sets the value of the outRateTableScaleMaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRateTableScaleMaxAmount(BigDecimal value) {
        this.outRateTableScaleMaxAmount = value;
    }

    /**
     * Gets the value of the outRateTableSellRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRateTableSellRate() {
        return outRateTableSellRate;
    }

    /**
     * Sets the value of the outRateTableSellRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRateTableSellRate(BigDecimal value) {
        this.outRateTableSellRate = value;
    }

    /**
     * Gets the value of the outRateTableTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRateTableTmstamp() {
        return outRateTableTmstamp;
    }

    /**
     * Sets the value of the outRateTableTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRateTableTmstamp(XMLGregorianCalendar value) {
        this.outRateTableTmstamp = value;
    }

    /**
     * Gets the value of the outRatesetDetailsRateTableActivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRatesetDetailsRateTableActivationDate() {
        return outRatesetDetailsRateTableActivationDate;
    }

    /**
     * Sets the value of the outRatesetDetailsRateTableActivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRatesetDetailsRateTableActivationDate(XMLGregorianCalendar value) {
        this.outRatesetDetailsRateTableActivationDate = value;
    }

    /**
     * Gets the value of the outRatesetDetailsRateTableActivationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRatesetDetailsRateTableActivationTime() {
        return outRatesetDetailsRateTableActivationTime;
    }

    /**
     * Sets the value of the outRatesetDetailsRateTableActivationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRatesetDetailsRateTableActivationTime(XMLGregorianCalendar value) {
        this.outRatesetDetailsRateTableActivationTime = value;
    }

    /**
     * Gets the value of the outRatesetDetailsRateTableRateTableNumber property.
     * 
     */
    public double getOutRatesetDetailsRateTableRateTableNumber() {
        return outRatesetDetailsRateTableRateTableNumber;
    }

    /**
     * Sets the value of the outRatesetDetailsRateTableRateTableNumber property.
     * 
     */
    public void setOutRatesetDetailsRateTableRateTableNumber(double value) {
        this.outRatesetDetailsRateTableRateTableNumber = value;
    }

    /**
     * Gets the value of the outTeamInformationAccountCode property.
     * 
     */
    public double getOutTeamInformationAccountCode() {
        return outTeamInformationAccountCode;
    }

    /**
     * Sets the value of the outTeamInformationAccountCode property.
     * 
     */
    public void setOutTeamInformationAccountCode(double value) {
        this.outTeamInformationAccountCode = value;
    }

    /**
     * Gets the value of the outTeamInformationAuthorisationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationAuthorisationType() {
        return outTeamInformationAuthorisationType;
    }

    /**
     * Sets the value of the outTeamInformationAuthorisationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationAuthorisationType(String value) {
        this.outTeamInformationAuthorisationType = value;
    }

    /**
     * Gets the value of the outTeamInformationAuthorizationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationAuthorizationResult() {
        return outTeamInformationAuthorizationResult;
    }

    /**
     * Sets the value of the outTeamInformationAuthorizationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationAuthorizationResult(String value) {
        this.outTeamInformationAuthorizationResult = value;
    }

    /**
     * Gets the value of the outTeamInformationAuthorizationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationAuthorizationType() {
        return outTeamInformationAuthorizationType;
    }

    /**
     * Sets the value of the outTeamInformationAuthorizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationAuthorizationType(String value) {
        this.outTeamInformationAuthorizationType = value;
    }

    /**
     * Gets the value of the outTeamInformationAvailableDateSpread property.
     * 
     */
    public short getOutTeamInformationAvailableDateSpread() {
        return outTeamInformationAvailableDateSpread;
    }

    /**
     * Sets the value of the outTeamInformationAvailableDateSpread property.
     * 
     */
    public void setOutTeamInformationAvailableDateSpread(short value) {
        this.outTeamInformationAvailableDateSpread = value;
    }

    /**
     * Gets the value of the outTeamInformationChargeDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationChargeDiscount() {
        return outTeamInformationChargeDiscount;
    }

    /**
     * Sets the value of the outTeamInformationChargeDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationChargeDiscount(BigDecimal value) {
        this.outTeamInformationChargeDiscount = value;
    }

    /**
     * Gets the value of the outTeamInformationCommissionDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationCommissionDiscount() {
        return outTeamInformationCommissionDiscount;
    }

    /**
     * Sets the value of the outTeamInformationCommissionDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationCommissionDiscount(BigDecimal value) {
        this.outTeamInformationCommissionDiscount = value;
    }

    /**
     * Gets the value of the outTeamInformationCreditInterestRateSpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationCreditInterestRateSpread() {
        return outTeamInformationCreditInterestRateSpread;
    }

    /**
     * Sets the value of the outTeamInformationCreditInterestRateSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationCreditInterestRateSpread(BigDecimal value) {
        this.outTeamInformationCreditInterestRateSpread = value;
    }

    /**
     * Gets the value of the outTeamInformationCustomerCode property.
     * 
     */
    public int getOutTeamInformationCustomerCode() {
        return outTeamInformationCustomerCode;
    }

    /**
     * Sets the value of the outTeamInformationCustomerCode property.
     * 
     */
    public void setOutTeamInformationCustomerCode(int value) {
        this.outTeamInformationCustomerCode = value;
    }

    /**
     * Gets the value of the outTeamInformationCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationCustomerSurname() {
        return outTeamInformationCustomerSurname;
    }

    /**
     * Sets the value of the outTeamInformationCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationCustomerSurname(String value) {
        this.outTeamInformationCustomerSurname = value;
    }

    /**
     * Gets the value of the outTeamInformationDebitInterestRateSpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationDebitInterestRateSpread() {
        return outTeamInformationDebitInterestRateSpread;
    }

    /**
     * Sets the value of the outTeamInformationDebitInterestRateSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationDebitInterestRateSpread(BigDecimal value) {
        this.outTeamInformationDebitInterestRateSpread = value;
    }

    /**
     * Gets the value of the outTeamInformationEvaluationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationEvaluationResult() {
        return outTeamInformationEvaluationResult;
    }

    /**
     * Sets the value of the outTeamInformationEvaluationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationEvaluationResult(String value) {
        this.outTeamInformationEvaluationResult = value;
    }

    /**
     * Gets the value of the outTeamInformationInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationInterestRate() {
        return outTeamInformationInterestRate;
    }

    /**
     * Sets the value of the outTeamInformationInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationInterestRate(BigDecimal value) {
        this.outTeamInformationInterestRate = value;
    }

    /**
     * Gets the value of the outTeamInformationJustificationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationJustificationDescription() {
        return outTeamInformationJustificationDescription;
    }

    /**
     * Sets the value of the outTeamInformationJustificationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationJustificationDescription(String value) {
        this.outTeamInformationJustificationDescription = value;
    }

    /**
     * Gets the value of the outTeamInformationJustificationId property.
     * 
     */
    public int getOutTeamInformationJustificationId() {
        return outTeamInformationJustificationId;
    }

    /**
     * Sets the value of the outTeamInformationJustificationId property.
     * 
     */
    public void setOutTeamInformationJustificationId(int value) {
        this.outTeamInformationJustificationId = value;
    }

    /**
     * Gets the value of the outTeamInformationLoanStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationLoanStatus() {
        return outTeamInformationLoanStatus;
    }

    /**
     * Sets the value of the outTeamInformationLoanStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationLoanStatus(String value) {
        this.outTeamInformationLoanStatus = value;
    }

    /**
     * Gets the value of the outTeamInformationOverdraftAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationOverdraftAmount() {
        return outTeamInformationOverdraftAmount;
    }

    /**
     * Sets the value of the outTeamInformationOverdraftAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationOverdraftAmount(BigDecimal value) {
        this.outTeamInformationOverdraftAmount = value;
    }

    /**
     * Gets the value of the outTeamInformationOverdraftSpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationOverdraftSpread() {
        return outTeamInformationOverdraftSpread;
    }

    /**
     * Sets the value of the outTeamInformationOverdraftSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationOverdraftSpread(BigDecimal value) {
        this.outTeamInformationOverdraftSpread = value;
    }

    /**
     * Gets the value of the outTeamInformationPenaltyDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationPenaltyDiscount() {
        return outTeamInformationPenaltyDiscount;
    }

    /**
     * Sets the value of the outTeamInformationPenaltyDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationPenaltyDiscount(BigDecimal value) {
        this.outTeamInformationPenaltyDiscount = value;
    }

    /**
     * Gets the value of the outTeamInformationPenaltyRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationPenaltyRate() {
        return outTeamInformationPenaltyRate;
    }

    /**
     * Sets the value of the outTeamInformationPenaltyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationPenaltyRate(BigDecimal value) {
        this.outTeamInformationPenaltyRate = value;
    }

    /**
     * Gets the value of the outTeamInformationProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationProductDescription() {
        return outTeamInformationProductDescription;
    }

    /**
     * Sets the value of the outTeamInformationProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationProductDescription(String value) {
        this.outTeamInformationProductDescription = value;
    }

    /**
     * Gets the value of the outTeamInformationProductId property.
     * 
     */
    public int getOutTeamInformationProductId() {
        return outTeamInformationProductId;
    }

    /**
     * Sets the value of the outTeamInformationProductId property.
     * 
     */
    public void setOutTeamInformationProductId(int value) {
        this.outTeamInformationProductId = value;
    }

    /**
     * Gets the value of the outTeamInformationRequiredProfile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationRequiredProfile1() {
        return outTeamInformationRequiredProfile1;
    }

    /**
     * Sets the value of the outTeamInformationRequiredProfile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationRequiredProfile1(String value) {
        this.outTeamInformationRequiredProfile1 = value;
    }

    /**
     * Gets the value of the outTeamInformationRequiredProfile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationRequiredProfile2() {
        return outTeamInformationRequiredProfile2;
    }

    /**
     * Sets the value of the outTeamInformationRequiredProfile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationRequiredProfile2(String value) {
        this.outTeamInformationRequiredProfile2 = value;
    }

    /**
     * Gets the value of the outTeamInformationServicePenaltySpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationServicePenaltySpread() {
        return outTeamInformationServicePenaltySpread;
    }

    /**
     * Sets the value of the outTeamInformationServicePenaltySpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationServicePenaltySpread(BigDecimal value) {
        this.outTeamInformationServicePenaltySpread = value;
    }

    /**
     * Gets the value of the outTeamInformationSuper1Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationSuper1Code() {
        return outTeamInformationSuper1Code;
    }

    /**
     * Sets the value of the outTeamInformationSuper1Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationSuper1Code(String value) {
        this.outTeamInformationSuper1Code = value;
    }

    /**
     * Gets the value of the outTeamInformationSuper1TerminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationSuper1TerminalId() {
        return outTeamInformationSuper1TerminalId;
    }

    /**
     * Sets the value of the outTeamInformationSuper1TerminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationSuper1TerminalId(String value) {
        this.outTeamInformationSuper1TerminalId = value;
    }

    /**
     * Gets the value of the outTeamInformationSuper2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationSuper2Code() {
        return outTeamInformationSuper2Code;
    }

    /**
     * Sets the value of the outTeamInformationSuper2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationSuper2Code(String value) {
        this.outTeamInformationSuper2Code = value;
    }

    /**
     * Gets the value of the outTeamInformationSuper2TerminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationSuper2TerminalId() {
        return outTeamInformationSuper2TerminalId;
    }

    /**
     * Sets the value of the outTeamInformationSuper2TerminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationSuper2TerminalId(String value) {
        this.outTeamInformationSuper2TerminalId = value;
    }

    /**
     * Gets the value of the outTeamInformationTeamComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationTeamComments() {
        return outTeamInformationTeamComments;
    }

    /**
     * Sets the value of the outTeamInformationTeamComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationTeamComments(String value) {
        this.outTeamInformationTeamComments = value;
    }

    /**
     * Gets the value of the outTeamInformationTransactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationTransactionDescription() {
        return outTeamInformationTransactionDescription;
    }

    /**
     * Sets the value of the outTeamInformationTransactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationTransactionDescription(String value) {
        this.outTeamInformationTransactionDescription = value;
    }

    /**
     * Gets the value of the outTeamInformationTransactionId property.
     * 
     */
    public int getOutTeamInformationTransactionId() {
        return outTeamInformationTransactionId;
    }

    /**
     * Sets the value of the outTeamInformationTransactionId property.
     * 
     */
    public void setOutTeamInformationTransactionId(int value) {
        this.outTeamInformationTransactionId = value;
    }

    /**
     * Gets the value of the outTeamInformationTrsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationTrsAmount() {
        return outTeamInformationTrsAmount;
    }

    /**
     * Sets the value of the outTeamInformationTrsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationTrsAmount(BigDecimal value) {
        this.outTeamInformationTrsAmount = value;
    }

    /**
     * Gets the value of the outTeamInformationUnclearWithdrawalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationUnclearWithdrawalFlag() {
        return outTeamInformationUnclearWithdrawalFlag;
    }

    /**
     * Sets the value of the outTeamInformationUnclearWithdrawalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationUnclearWithdrawalFlag(String value) {
        this.outTeamInformationUnclearWithdrawalFlag = value;
    }

    /**
     * Gets the value of the outTeamInformationUnitCode property.
     * 
     */
    public int getOutTeamInformationUnitCode() {
        return outTeamInformationUnitCode;
    }

    /**
     * Sets the value of the outTeamInformationUnitCode property.
     * 
     */
    public void setOutTeamInformationUnitCode(int value) {
        this.outTeamInformationUnitCode = value;
    }

    /**
     * Gets the value of the outTeamInformationUserCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationUserCode() {
        return outTeamInformationUserCode;
    }

    /**
     * Sets the value of the outTeamInformationUserCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationUserCode(String value) {
        this.outTeamInformationUserCode = value;
    }

    /**
     * Gets the value of the outTeamInformationUserProfile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationUserProfile1() {
        return outTeamInformationUserProfile1;
    }

    /**
     * Sets the value of the outTeamInformationUserProfile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationUserProfile1(String value) {
        this.outTeamInformationUserProfile1 = value;
    }

    /**
     * Gets the value of the outTeamInformationUserProfile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationUserProfile2() {
        return outTeamInformationUserProfile2;
    }

    /**
     * Sets the value of the outTeamInformationUserProfile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationUserProfile2(String value) {
        this.outTeamInformationUserProfile2 = value;
    }

    /**
     * Gets the value of the outTeamInformationUserProfile3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationUserProfile3() {
        return outTeamInformationUserProfile3;
    }

    /**
     * Sets the value of the outTeamInformationUserProfile3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationUserProfile3(String value) {
        this.outTeamInformationUserProfile3 = value;
    }

    /**
     * Gets the value of the outTeamInformationUserSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationUserSurname() {
        return outTeamInformationUserSurname;
    }

    /**
     * Sets the value of the outTeamInformationUserSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationUserSurname(String value) {
        this.outTeamInformationUserSurname = value;
    }

    /**
     * Gets the value of the outTeamInformationUserTerminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationUserTerminalId() {
        return outTeamInformationUserTerminalId;
    }

    /**
     * Sets the value of the outTeamInformationUserTerminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationUserTerminalId(String value) {
        this.outTeamInformationUserTerminalId = value;
    }

    /**
     * Gets the value of the outTeamInformationValueDateSpread property.
     * 
     */
    public short getOutTeamInformationValueDateSpread() {
        return outTeamInformationValueDateSpread;
    }

    /**
     * Sets the value of the outTeamInformationValueDateSpread property.
     * 
     */
    public void setOutTeamInformationValueDateSpread(short value) {
        this.outTeamInformationValueDateSpread = value;
    }

    /**
     * Gets the value of the outTrxCountTrxCounter property.
     * 
     */
    public int getOutTrxCountTrxCounter() {
        return outTrxCountTrxCounter;
    }

    /**
     * Sets the value of the outTrxCountTrxCounter property.
     * 
     */
    public void setOutTrxCountTrxCounter(int value) {
        this.outTrxCountTrxCounter = value;
    }

    /**
     * Gets the value of the outRateTable1 property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFEXS03OutRateTable1Item }
     *     
     */
    public ArrayOfFEXS03OutRateTable1Item getOutRateTable1() {
        return outRateTable1;
    }

    /**
     * Sets the value of the outRateTable1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFEXS03OutRateTable1Item }
     *     
     */
    public void setOutRateTable1(ArrayOfFEXS03OutRateTable1Item value) {
        this.outRateTable1 = value;
    }

}
