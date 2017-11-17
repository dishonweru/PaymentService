
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for J2115V_ThirdPartyPaymentsExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="J2115V_ThirdPartyPaymentsExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutCollectionCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCollectionCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCommDiscountIefSuppliedGenPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCpOlCollectionBenefAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCpOlCollectionBenefAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCpOlCollectionBenefCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCpOlCollectionBenefCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCpOlCollectionBenefName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCpOlCollectionBenefZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCpOlCollectionCrCardApproval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCpOlCollectionCreditCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCpOlCollectionCurrencyShortdesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCpOlCollectionDataField1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCpOlCollectionDataField2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCpOlCollectionDataField3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCpOlCollectionDataField4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCpOlCollectionOrgAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCpParVoucherRunVoucherLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCurrPrintLineDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCurrPrintLineTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDepParVoucherRunVoucherLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepTrxRecordingOFinalAccAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepTrxRecordingTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepTrxRecordingUUserTotalsAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDrAccCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDrAccCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrAccDepTrxjustTrnType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrAccDepUnclearTransAvailabilityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDrAccDepositAccountAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrAccDepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrAccFdValeurBalanceValueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDrAccJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrAccJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDrAccPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrAccPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDrAccProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrAccProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDrAccUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDrCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDrCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDrTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutExpensDiscountIefSuppliedGenPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutForecastIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedSrvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIpsOrganizationOrganizationCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOffsetCpTrxRecordingCustCommision" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutOffsetCpTrxRecordingCustExpenses" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutOffsetCpTrxRecordingOrgCommission" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutOffsetCpTrxRecordingOrgExpenses" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutOffsetCpTrxRecordingSourceTrnType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOffsetCpTrxRecordingSourceUUserTota" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutOffsetCpTrxRecordingTargetTrnType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOffsetCpTrxRecordingTargetUUserTota" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProfitsAccountDepAccNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutReplyTrxRecordingAccAmount1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutReplyTrxRecordingAccAmount15" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutReplyTrxRecordingAccAmount17" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutReplyTrxRecordingAccAmount18" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutReplyTrxRecordingAccAmount31" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutReplyTrxRecordingOValueDate1" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutReplyTrxRecordingUserTotalAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutServiceJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutServiceJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutServiceProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutServiceProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutServiceTrxjustSourceTrnType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSpecificBenefLnsSuppliedAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSpecificBenefLnsSuppliedIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSpecificBenefLnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VlOutClientProfitsExitStateWorkActualMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VlOutClientProfitsExitStateWorkId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="VlOutClientProfitsExitStateWorkLanguage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VlOutClientProfitsExitStateWorkMessageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VlOutClientProfitsExitStateWorkPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="VlOutClientProfitsExitStateWorkRoutineSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="VlOutClientProfitsExitStateWorkTerminationAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VlOutClientProfitsExitStateWorkValruleId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="VlOutClientProfitsExitStateWorkValruleSnum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationEvaluationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationAuthorizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfJ2115VOutDrGrpItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "J2115V_ThirdPartyPaymentsExport", propOrder = {
    "outCollectionCurrencyIdCurrency",
    "outCollectionCurrencyShortDescr",
    "outCommDiscountIefSuppliedGenPercentage",
    "outCpOlCollectionBenefAddress1",
    "outCpOlCollectionBenefAddress2",
    "outCpOlCollectionBenefCity",
    "outCpOlCollectionBenefCountry",
    "outCpOlCollectionBenefName",
    "outCpOlCollectionBenefZipCode",
    "outCpOlCollectionCrCardApproval",
    "outCpOlCollectionCreditCardNo",
    "outCpOlCollectionCurrencyShortdesc",
    "outCpOlCollectionDataField1",
    "outCpOlCollectionDataField2",
    "outCpOlCollectionDataField3",
    "outCpOlCollectionDataField4",
    "outCpOlCollectionOrgAmnt",
    "outCpParVoucherRunVoucherLine",
    "outCurrPrintLineDate",
    "outCurrPrintLineTime",
    "outDepParVoucherRunVoucherLine",
    "outDepTrxRecordingOFinalAccAmount",
    "outDepTrxRecordingTrxUsrSn",
    "outDepTrxRecordingUUserTotalsAmn",
    "outDrAccCurrencyIdCurrency",
    "outDrAccCurrencyShortDescr",
    "outDrAccDepTrxjustTrnType",
    "outDrAccDepUnclearTransAvailabilityDate",
    "outDrAccDepositAccountAccountType",
    "outDrAccDepositAccountDesignation",
    "outDrAccFdValeurBalanceValueDate",
    "outDrAccJustificDescription",
    "outDrAccJustificIdJustific",
    "outDrAccPrftTransactionDescription",
    "outDrAccPrftTransactionIdTransact",
    "outDrAccProductDescription",
    "outDrAccProductIdProduct",
    "outDrAccUnitCode",
    "outDrCustomerCDigit",
    "outDrCustomerCustId",
    "outDrTrxCountTrxCounter",
    "outExpensDiscountIefSuppliedGenPercentage",
    "outForecastIefSuppliedFlag",
    "outIefSuppliedActionEntryDesc",
    "outIefSuppliedSrvStatus",
    "outIpsOrganizationOrganizationCode",
    "outOffsetCpTrxRecordingCustCommision",
    "outOffsetCpTrxRecordingCustExpenses",
    "outOffsetCpTrxRecordingOrgCommission",
    "outOffsetCpTrxRecordingOrgExpenses",
    "outOffsetCpTrxRecordingSourceTrnType",
    "outOffsetCpTrxRecordingSourceUUserTota",
    "outOffsetCpTrxRecordingTargetTrnType",
    "outOffsetCpTrxRecordingTargetUUserTota",
    "outPrftTransactionDescription",
    "outPrftTransactionIdTransact",
    "outProfitsAccountAccountCd",
    "outProfitsAccountAccountNumber",
    "outProfitsAccountDepAccNumber",
    "outReplyTrxRecordingAccAmount1",
    "outReplyTrxRecordingAccAmount15",
    "outReplyTrxRecordingAccAmount17",
    "outReplyTrxRecordingAccAmount18",
    "outReplyTrxRecordingAccAmount31",
    "outReplyTrxRecordingOValueDate1",
    "outReplyTrxRecordingUserTotalAmn",
    "outServiceJustificDescription",
    "outServiceJustificIdJustific",
    "outServiceProductDescription",
    "outServiceProductIdProduct",
    "outServiceTrxjustSourceTrnType",
    "outSpecificBenefLnsSuppliedAfmNo",
    "outSpecificBenefLnsSuppliedIdNo",
    "outSpecificBenefLnsSuppliedName",
    "outTrxCountTrxCounter",
    "vlOutClientProfitsExitStateWorkActualMessage",
    "vlOutClientProfitsExitStateWorkId",
    "vlOutClientProfitsExitStateWorkLanguage",
    "vlOutClientProfitsExitStateWorkMessageType",
    "vlOutClientProfitsExitStateWorkPrftSystem",
    "vlOutClientProfitsExitStateWorkRoutineSn",
    "vlOutClientProfitsExitStateWorkTerminationAction",
    "vlOutClientProfitsExitStateWorkValruleId",
    "vlOutClientProfitsExitStateWorkValruleSnum",
    "outTeamInformationEvaluationResult",
    "outTeamInformationRequiredProfile1",
    "outTeamInformationRequiredProfile2",
    "outTeamInformationAuthorizationType",
    "outDrGrp"
})
public class J2115VThirdPartyPaymentsExport
    extends BaseExport
{

    @XmlElement(name = "OutCollectionCurrencyIdCurrency")
    protected int outCollectionCurrencyIdCurrency;
    @XmlElement(name = "OutCollectionCurrencyShortDescr")
    protected String outCollectionCurrencyShortDescr;
    @XmlElement(name = "OutCommDiscountIefSuppliedGenPercentage", required = true)
    protected BigDecimal outCommDiscountIefSuppliedGenPercentage;
    @XmlElement(name = "OutCpOlCollectionBenefAddress1")
    protected String outCpOlCollectionBenefAddress1;
    @XmlElement(name = "OutCpOlCollectionBenefAddress2")
    protected String outCpOlCollectionBenefAddress2;
    @XmlElement(name = "OutCpOlCollectionBenefCity")
    protected String outCpOlCollectionBenefCity;
    @XmlElement(name = "OutCpOlCollectionBenefCountry")
    protected String outCpOlCollectionBenefCountry;
    @XmlElement(name = "OutCpOlCollectionBenefName")
    protected String outCpOlCollectionBenefName;
    @XmlElement(name = "OutCpOlCollectionBenefZipCode")
    protected String outCpOlCollectionBenefZipCode;
    @XmlElement(name = "OutCpOlCollectionCrCardApproval")
    protected String outCpOlCollectionCrCardApproval;
    @XmlElement(name = "OutCpOlCollectionCreditCardNo")
    protected String outCpOlCollectionCreditCardNo;
    @XmlElement(name = "OutCpOlCollectionCurrencyShortdesc")
    protected String outCpOlCollectionCurrencyShortdesc;
    @XmlElement(name = "OutCpOlCollectionDataField1")
    protected String outCpOlCollectionDataField1;
    @XmlElement(name = "OutCpOlCollectionDataField2")
    protected String outCpOlCollectionDataField2;
    @XmlElement(name = "OutCpOlCollectionDataField3")
    protected String outCpOlCollectionDataField3;
    @XmlElement(name = "OutCpOlCollectionDataField4")
    protected String outCpOlCollectionDataField4;
    @XmlElement(name = "OutCpOlCollectionOrgAmnt", required = true)
    protected BigDecimal outCpOlCollectionOrgAmnt;
    @XmlElement(name = "OutCpParVoucherRunVoucherLine")
    protected String outCpParVoucherRunVoucherLine;
    @XmlElement(name = "OutCurrPrintLineDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCurrPrintLineDate;
    @XmlElement(name = "OutCurrPrintLineTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCurrPrintLineTime;
    @XmlElement(name = "OutDepParVoucherRunVoucherLine")
    protected String outDepParVoucherRunVoucherLine;
    @XmlElement(name = "OutDepTrxRecordingOFinalAccAmount", required = true)
    protected BigDecimal outDepTrxRecordingOFinalAccAmount;
    @XmlElement(name = "OutDepTrxRecordingTrxUsrSn")
    protected int outDepTrxRecordingTrxUsrSn;
    @XmlElement(name = "OutDepTrxRecordingUUserTotalsAmn", required = true)
    protected BigDecimal outDepTrxRecordingUUserTotalsAmn;
    @XmlElement(name = "OutDrAccCurrencyIdCurrency")
    protected int outDrAccCurrencyIdCurrency;
    @XmlElement(name = "OutDrAccCurrencyShortDescr")
    protected String outDrAccCurrencyShortDescr;
    @XmlElement(name = "OutDrAccDepTrxjustTrnType")
    protected String outDrAccDepTrxjustTrnType;
    @XmlElement(name = "OutDrAccDepUnclearTransAvailabilityDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDrAccDepUnclearTransAvailabilityDate;
    @XmlElement(name = "OutDrAccDepositAccountAccountType")
    protected String outDrAccDepositAccountAccountType;
    @XmlElement(name = "OutDrAccDepositAccountDesignation")
    protected String outDrAccDepositAccountDesignation;
    @XmlElement(name = "OutDrAccFdValeurBalanceValueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDrAccFdValeurBalanceValueDate;
    @XmlElement(name = "OutDrAccJustificDescription")
    protected String outDrAccJustificDescription;
    @XmlElement(name = "OutDrAccJustificIdJustific")
    protected int outDrAccJustificIdJustific;
    @XmlElement(name = "OutDrAccPrftTransactionDescription")
    protected String outDrAccPrftTransactionDescription;
    @XmlElement(name = "OutDrAccPrftTransactionIdTransact")
    protected int outDrAccPrftTransactionIdTransact;
    @XmlElement(name = "OutDrAccProductDescription")
    protected String outDrAccProductDescription;
    @XmlElement(name = "OutDrAccProductIdProduct")
    protected int outDrAccProductIdProduct;
    @XmlElement(name = "OutDrAccUnitCode")
    protected int outDrAccUnitCode;
    @XmlElement(name = "OutDrCustomerCDigit")
    protected short outDrCustomerCDigit;
    @XmlElement(name = "OutDrCustomerCustId")
    protected int outDrCustomerCustId;
    @XmlElement(name = "OutDrTrxCountTrxCounter")
    protected int outDrTrxCountTrxCounter;
    @XmlElement(name = "OutExpensDiscountIefSuppliedGenPercentage", required = true)
    protected BigDecimal outExpensDiscountIefSuppliedGenPercentage;
    @XmlElement(name = "OutForecastIefSuppliedFlag")
    protected String outForecastIefSuppliedFlag;
    @XmlElement(name = "OutIefSuppliedActionEntryDesc")
    protected String outIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutIefSuppliedSrvStatus")
    protected String outIefSuppliedSrvStatus;
    @XmlElement(name = "OutIpsOrganizationOrganizationCode")
    protected int outIpsOrganizationOrganizationCode;
    @XmlElement(name = "OutOffsetCpTrxRecordingCustCommision", required = true)
    protected BigDecimal outOffsetCpTrxRecordingCustCommision;
    @XmlElement(name = "OutOffsetCpTrxRecordingCustExpenses", required = true)
    protected BigDecimal outOffsetCpTrxRecordingCustExpenses;
    @XmlElement(name = "OutOffsetCpTrxRecordingOrgCommission", required = true)
    protected BigDecimal outOffsetCpTrxRecordingOrgCommission;
    @XmlElement(name = "OutOffsetCpTrxRecordingOrgExpenses", required = true)
    protected BigDecimal outOffsetCpTrxRecordingOrgExpenses;
    @XmlElement(name = "OutOffsetCpTrxRecordingSourceTrnType")
    protected String outOffsetCpTrxRecordingSourceTrnType;
    @XmlElement(name = "OutOffsetCpTrxRecordingSourceUUserTota", required = true)
    protected BigDecimal outOffsetCpTrxRecordingSourceUUserTota;
    @XmlElement(name = "OutOffsetCpTrxRecordingTargetTrnType")
    protected String outOffsetCpTrxRecordingTargetTrnType;
    @XmlElement(name = "OutOffsetCpTrxRecordingTargetUUserTota", required = true)
    protected BigDecimal outOffsetCpTrxRecordingTargetUUserTota;
    @XmlElement(name = "OutPrftTransactionDescription")
    protected String outPrftTransactionDescription;
    @XmlElement(name = "OutPrftTransactionIdTransact")
    protected int outPrftTransactionIdTransact;
    @XmlElement(name = "OutProfitsAccountAccountCd")
    protected short outProfitsAccountAccountCd;
    @XmlElement(name = "OutProfitsAccountAccountNumber")
    protected String outProfitsAccountAccountNumber;
    @XmlElement(name = "OutProfitsAccountDepAccNumber")
    protected double outProfitsAccountDepAccNumber;
    @XmlElement(name = "OutReplyTrxRecordingAccAmount1", required = true)
    protected BigDecimal outReplyTrxRecordingAccAmount1;
    @XmlElement(name = "OutReplyTrxRecordingAccAmount15", required = true)
    protected BigDecimal outReplyTrxRecordingAccAmount15;
    @XmlElement(name = "OutReplyTrxRecordingAccAmount17", required = true)
    protected BigDecimal outReplyTrxRecordingAccAmount17;
    @XmlElement(name = "OutReplyTrxRecordingAccAmount18", required = true)
    protected BigDecimal outReplyTrxRecordingAccAmount18;
    @XmlElement(name = "OutReplyTrxRecordingAccAmount31", required = true)
    protected BigDecimal outReplyTrxRecordingAccAmount31;
    @XmlElement(name = "OutReplyTrxRecordingOValueDate1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outReplyTrxRecordingOValueDate1;
    @XmlElement(name = "OutReplyTrxRecordingUserTotalAmn", required = true)
    protected BigDecimal outReplyTrxRecordingUserTotalAmn;
    @XmlElement(name = "OutServiceJustificDescription")
    protected String outServiceJustificDescription;
    @XmlElement(name = "OutServiceJustificIdJustific")
    protected int outServiceJustificIdJustific;
    @XmlElement(name = "OutServiceProductDescription")
    protected String outServiceProductDescription;
    @XmlElement(name = "OutServiceProductIdProduct")
    protected int outServiceProductIdProduct;
    @XmlElement(name = "OutServiceTrxjustSourceTrnType")
    protected String outServiceTrxjustSourceTrnType;
    @XmlElement(name = "OutSpecificBenefLnsSuppliedAfmNo")
    protected String outSpecificBenefLnsSuppliedAfmNo;
    @XmlElement(name = "OutSpecificBenefLnsSuppliedIdNo")
    protected String outSpecificBenefLnsSuppliedIdNo;
    @XmlElement(name = "OutSpecificBenefLnsSuppliedName")
    protected String outSpecificBenefLnsSuppliedName;
    @XmlElement(name = "OutTrxCountTrxCounter")
    protected int outTrxCountTrxCounter;
    @XmlElement(name = "VlOutClientProfitsExitStateWorkActualMessage")
    protected String vlOutClientProfitsExitStateWorkActualMessage;
    @XmlElement(name = "VlOutClientProfitsExitStateWorkId")
    protected double vlOutClientProfitsExitStateWorkId;
    @XmlElement(name = "VlOutClientProfitsExitStateWorkLanguage")
    protected int vlOutClientProfitsExitStateWorkLanguage;
    @XmlElement(name = "VlOutClientProfitsExitStateWorkMessageType")
    protected String vlOutClientProfitsExitStateWorkMessageType;
    @XmlElement(name = "VlOutClientProfitsExitStateWorkPrftSystem")
    protected short vlOutClientProfitsExitStateWorkPrftSystem;
    @XmlElement(name = "VlOutClientProfitsExitStateWorkRoutineSn")
    protected double vlOutClientProfitsExitStateWorkRoutineSn;
    @XmlElement(name = "VlOutClientProfitsExitStateWorkTerminationAction")
    protected String vlOutClientProfitsExitStateWorkTerminationAction;
    @XmlElement(name = "VlOutClientProfitsExitStateWorkValruleId")
    protected double vlOutClientProfitsExitStateWorkValruleId;
    @XmlElement(name = "VlOutClientProfitsExitStateWorkValruleSnum")
    protected int vlOutClientProfitsExitStateWorkValruleSnum;
    @XmlElement(name = "OutTeamInformationEvaluationResult")
    protected String outTeamInformationEvaluationResult;
    @XmlElement(name = "OutTeamInformationRequiredProfile1")
    protected String outTeamInformationRequiredProfile1;
    @XmlElement(name = "OutTeamInformationRequiredProfile2")
    protected String outTeamInformationRequiredProfile2;
    @XmlElement(name = "OutTeamInformationAuthorizationType")
    protected String outTeamInformationAuthorizationType;
    @XmlElement(name = "OutDrGrp")
    protected ArrayOfJ2115VOutDrGrpItem outDrGrp;

    /**
     * Gets the value of the outCollectionCurrencyIdCurrency property.
     * 
     */
    public int getOutCollectionCurrencyIdCurrency() {
        return outCollectionCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outCollectionCurrencyIdCurrency property.
     * 
     */
    public void setOutCollectionCurrencyIdCurrency(int value) {
        this.outCollectionCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outCollectionCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollectionCurrencyShortDescr() {
        return outCollectionCurrencyShortDescr;
    }

    /**
     * Sets the value of the outCollectionCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollectionCurrencyShortDescr(String value) {
        this.outCollectionCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outCommDiscountIefSuppliedGenPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCommDiscountIefSuppliedGenPercentage() {
        return outCommDiscountIefSuppliedGenPercentage;
    }

    /**
     * Sets the value of the outCommDiscountIefSuppliedGenPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCommDiscountIefSuppliedGenPercentage(BigDecimal value) {
        this.outCommDiscountIefSuppliedGenPercentage = value;
    }

    /**
     * Gets the value of the outCpOlCollectionBenefAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCpOlCollectionBenefAddress1() {
        return outCpOlCollectionBenefAddress1;
    }

    /**
     * Sets the value of the outCpOlCollectionBenefAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCpOlCollectionBenefAddress1(String value) {
        this.outCpOlCollectionBenefAddress1 = value;
    }

    /**
     * Gets the value of the outCpOlCollectionBenefAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCpOlCollectionBenefAddress2() {
        return outCpOlCollectionBenefAddress2;
    }

    /**
     * Sets the value of the outCpOlCollectionBenefAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCpOlCollectionBenefAddress2(String value) {
        this.outCpOlCollectionBenefAddress2 = value;
    }

    /**
     * Gets the value of the outCpOlCollectionBenefCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCpOlCollectionBenefCity() {
        return outCpOlCollectionBenefCity;
    }

    /**
     * Sets the value of the outCpOlCollectionBenefCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCpOlCollectionBenefCity(String value) {
        this.outCpOlCollectionBenefCity = value;
    }

    /**
     * Gets the value of the outCpOlCollectionBenefCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCpOlCollectionBenefCountry() {
        return outCpOlCollectionBenefCountry;
    }

    /**
     * Sets the value of the outCpOlCollectionBenefCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCpOlCollectionBenefCountry(String value) {
        this.outCpOlCollectionBenefCountry = value;
    }

    /**
     * Gets the value of the outCpOlCollectionBenefName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCpOlCollectionBenefName() {
        return outCpOlCollectionBenefName;
    }

    /**
     * Sets the value of the outCpOlCollectionBenefName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCpOlCollectionBenefName(String value) {
        this.outCpOlCollectionBenefName = value;
    }

    /**
     * Gets the value of the outCpOlCollectionBenefZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCpOlCollectionBenefZipCode() {
        return outCpOlCollectionBenefZipCode;
    }

    /**
     * Sets the value of the outCpOlCollectionBenefZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCpOlCollectionBenefZipCode(String value) {
        this.outCpOlCollectionBenefZipCode = value;
    }

    /**
     * Gets the value of the outCpOlCollectionCrCardApproval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCpOlCollectionCrCardApproval() {
        return outCpOlCollectionCrCardApproval;
    }

    /**
     * Sets the value of the outCpOlCollectionCrCardApproval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCpOlCollectionCrCardApproval(String value) {
        this.outCpOlCollectionCrCardApproval = value;
    }

    /**
     * Gets the value of the outCpOlCollectionCreditCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCpOlCollectionCreditCardNo() {
        return outCpOlCollectionCreditCardNo;
    }

    /**
     * Sets the value of the outCpOlCollectionCreditCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCpOlCollectionCreditCardNo(String value) {
        this.outCpOlCollectionCreditCardNo = value;
    }

    /**
     * Gets the value of the outCpOlCollectionCurrencyShortdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCpOlCollectionCurrencyShortdesc() {
        return outCpOlCollectionCurrencyShortdesc;
    }

    /**
     * Sets the value of the outCpOlCollectionCurrencyShortdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCpOlCollectionCurrencyShortdesc(String value) {
        this.outCpOlCollectionCurrencyShortdesc = value;
    }

    /**
     * Gets the value of the outCpOlCollectionDataField1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCpOlCollectionDataField1() {
        return outCpOlCollectionDataField1;
    }

    /**
     * Sets the value of the outCpOlCollectionDataField1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCpOlCollectionDataField1(String value) {
        this.outCpOlCollectionDataField1 = value;
    }

    /**
     * Gets the value of the outCpOlCollectionDataField2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCpOlCollectionDataField2() {
        return outCpOlCollectionDataField2;
    }

    /**
     * Sets the value of the outCpOlCollectionDataField2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCpOlCollectionDataField2(String value) {
        this.outCpOlCollectionDataField2 = value;
    }

    /**
     * Gets the value of the outCpOlCollectionDataField3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCpOlCollectionDataField3() {
        return outCpOlCollectionDataField3;
    }

    /**
     * Sets the value of the outCpOlCollectionDataField3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCpOlCollectionDataField3(String value) {
        this.outCpOlCollectionDataField3 = value;
    }

    /**
     * Gets the value of the outCpOlCollectionDataField4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCpOlCollectionDataField4() {
        return outCpOlCollectionDataField4;
    }

    /**
     * Sets the value of the outCpOlCollectionDataField4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCpOlCollectionDataField4(String value) {
        this.outCpOlCollectionDataField4 = value;
    }

    /**
     * Gets the value of the outCpOlCollectionOrgAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCpOlCollectionOrgAmnt() {
        return outCpOlCollectionOrgAmnt;
    }

    /**
     * Sets the value of the outCpOlCollectionOrgAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCpOlCollectionOrgAmnt(BigDecimal value) {
        this.outCpOlCollectionOrgAmnt = value;
    }

    /**
     * Gets the value of the outCpParVoucherRunVoucherLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCpParVoucherRunVoucherLine() {
        return outCpParVoucherRunVoucherLine;
    }

    /**
     * Sets the value of the outCpParVoucherRunVoucherLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCpParVoucherRunVoucherLine(String value) {
        this.outCpParVoucherRunVoucherLine = value;
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
     * Gets the value of the outDepParVoucherRunVoucherLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepParVoucherRunVoucherLine() {
        return outDepParVoucherRunVoucherLine;
    }

    /**
     * Sets the value of the outDepParVoucherRunVoucherLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepParVoucherRunVoucherLine(String value) {
        this.outDepParVoucherRunVoucherLine = value;
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
     * Gets the value of the outDrAccCurrencyIdCurrency property.
     * 
     */
    public int getOutDrAccCurrencyIdCurrency() {
        return outDrAccCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outDrAccCurrencyIdCurrency property.
     * 
     */
    public void setOutDrAccCurrencyIdCurrency(int value) {
        this.outDrAccCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outDrAccCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrAccCurrencyShortDescr() {
        return outDrAccCurrencyShortDescr;
    }

    /**
     * Sets the value of the outDrAccCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrAccCurrencyShortDescr(String value) {
        this.outDrAccCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outDrAccDepTrxjustTrnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrAccDepTrxjustTrnType() {
        return outDrAccDepTrxjustTrnType;
    }

    /**
     * Sets the value of the outDrAccDepTrxjustTrnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrAccDepTrxjustTrnType(String value) {
        this.outDrAccDepTrxjustTrnType = value;
    }

    /**
     * Gets the value of the outDrAccDepUnclearTransAvailabilityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDrAccDepUnclearTransAvailabilityDate() {
        return outDrAccDepUnclearTransAvailabilityDate;
    }

    /**
     * Sets the value of the outDrAccDepUnclearTransAvailabilityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDrAccDepUnclearTransAvailabilityDate(XMLGregorianCalendar value) {
        this.outDrAccDepUnclearTransAvailabilityDate = value;
    }

    /**
     * Gets the value of the outDrAccDepositAccountAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrAccDepositAccountAccountType() {
        return outDrAccDepositAccountAccountType;
    }

    /**
     * Sets the value of the outDrAccDepositAccountAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrAccDepositAccountAccountType(String value) {
        this.outDrAccDepositAccountAccountType = value;
    }

    /**
     * Gets the value of the outDrAccDepositAccountDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrAccDepositAccountDesignation() {
        return outDrAccDepositAccountDesignation;
    }

    /**
     * Sets the value of the outDrAccDepositAccountDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrAccDepositAccountDesignation(String value) {
        this.outDrAccDepositAccountDesignation = value;
    }

    /**
     * Gets the value of the outDrAccFdValeurBalanceValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDrAccFdValeurBalanceValueDate() {
        return outDrAccFdValeurBalanceValueDate;
    }

    /**
     * Sets the value of the outDrAccFdValeurBalanceValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDrAccFdValeurBalanceValueDate(XMLGregorianCalendar value) {
        this.outDrAccFdValeurBalanceValueDate = value;
    }

    /**
     * Gets the value of the outDrAccJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrAccJustificDescription() {
        return outDrAccJustificDescription;
    }

    /**
     * Sets the value of the outDrAccJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrAccJustificDescription(String value) {
        this.outDrAccJustificDescription = value;
    }

    /**
     * Gets the value of the outDrAccJustificIdJustific property.
     * 
     */
    public int getOutDrAccJustificIdJustific() {
        return outDrAccJustificIdJustific;
    }

    /**
     * Sets the value of the outDrAccJustificIdJustific property.
     * 
     */
    public void setOutDrAccJustificIdJustific(int value) {
        this.outDrAccJustificIdJustific = value;
    }

    /**
     * Gets the value of the outDrAccPrftTransactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrAccPrftTransactionDescription() {
        return outDrAccPrftTransactionDescription;
    }

    /**
     * Sets the value of the outDrAccPrftTransactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrAccPrftTransactionDescription(String value) {
        this.outDrAccPrftTransactionDescription = value;
    }

    /**
     * Gets the value of the outDrAccPrftTransactionIdTransact property.
     * 
     */
    public int getOutDrAccPrftTransactionIdTransact() {
        return outDrAccPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the outDrAccPrftTransactionIdTransact property.
     * 
     */
    public void setOutDrAccPrftTransactionIdTransact(int value) {
        this.outDrAccPrftTransactionIdTransact = value;
    }

    /**
     * Gets the value of the outDrAccProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrAccProductDescription() {
        return outDrAccProductDescription;
    }

    /**
     * Sets the value of the outDrAccProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrAccProductDescription(String value) {
        this.outDrAccProductDescription = value;
    }

    /**
     * Gets the value of the outDrAccProductIdProduct property.
     * 
     */
    public int getOutDrAccProductIdProduct() {
        return outDrAccProductIdProduct;
    }

    /**
     * Sets the value of the outDrAccProductIdProduct property.
     * 
     */
    public void setOutDrAccProductIdProduct(int value) {
        this.outDrAccProductIdProduct = value;
    }

    /**
     * Gets the value of the outDrAccUnitCode property.
     * 
     */
    public int getOutDrAccUnitCode() {
        return outDrAccUnitCode;
    }

    /**
     * Sets the value of the outDrAccUnitCode property.
     * 
     */
    public void setOutDrAccUnitCode(int value) {
        this.outDrAccUnitCode = value;
    }

    /**
     * Gets the value of the outDrCustomerCDigit property.
     * 
     */
    public short getOutDrCustomerCDigit() {
        return outDrCustomerCDigit;
    }

    /**
     * Sets the value of the outDrCustomerCDigit property.
     * 
     */
    public void setOutDrCustomerCDigit(short value) {
        this.outDrCustomerCDigit = value;
    }

    /**
     * Gets the value of the outDrCustomerCustId property.
     * 
     */
    public int getOutDrCustomerCustId() {
        return outDrCustomerCustId;
    }

    /**
     * Sets the value of the outDrCustomerCustId property.
     * 
     */
    public void setOutDrCustomerCustId(int value) {
        this.outDrCustomerCustId = value;
    }

    /**
     * Gets the value of the outDrTrxCountTrxCounter property.
     * 
     */
    public int getOutDrTrxCountTrxCounter() {
        return outDrTrxCountTrxCounter;
    }

    /**
     * Sets the value of the outDrTrxCountTrxCounter property.
     * 
     */
    public void setOutDrTrxCountTrxCounter(int value) {
        this.outDrTrxCountTrxCounter = value;
    }

    /**
     * Gets the value of the outExpensDiscountIefSuppliedGenPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutExpensDiscountIefSuppliedGenPercentage() {
        return outExpensDiscountIefSuppliedGenPercentage;
    }

    /**
     * Sets the value of the outExpensDiscountIefSuppliedGenPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutExpensDiscountIefSuppliedGenPercentage(BigDecimal value) {
        this.outExpensDiscountIefSuppliedGenPercentage = value;
    }

    /**
     * Gets the value of the outForecastIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutForecastIefSuppliedFlag() {
        return outForecastIefSuppliedFlag;
    }

    /**
     * Sets the value of the outForecastIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutForecastIefSuppliedFlag(String value) {
        this.outForecastIefSuppliedFlag = value;
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
     * Gets the value of the outIpsOrganizationOrganizationCode property.
     * 
     */
    public int getOutIpsOrganizationOrganizationCode() {
        return outIpsOrganizationOrganizationCode;
    }

    /**
     * Sets the value of the outIpsOrganizationOrganizationCode property.
     * 
     */
    public void setOutIpsOrganizationOrganizationCode(int value) {
        this.outIpsOrganizationOrganizationCode = value;
    }

    /**
     * Gets the value of the outOffsetCpTrxRecordingCustCommision property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutOffsetCpTrxRecordingCustCommision() {
        return outOffsetCpTrxRecordingCustCommision;
    }

    /**
     * Sets the value of the outOffsetCpTrxRecordingCustCommision property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutOffsetCpTrxRecordingCustCommision(BigDecimal value) {
        this.outOffsetCpTrxRecordingCustCommision = value;
    }

    /**
     * Gets the value of the outOffsetCpTrxRecordingCustExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutOffsetCpTrxRecordingCustExpenses() {
        return outOffsetCpTrxRecordingCustExpenses;
    }

    /**
     * Sets the value of the outOffsetCpTrxRecordingCustExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutOffsetCpTrxRecordingCustExpenses(BigDecimal value) {
        this.outOffsetCpTrxRecordingCustExpenses = value;
    }

    /**
     * Gets the value of the outOffsetCpTrxRecordingOrgCommission property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutOffsetCpTrxRecordingOrgCommission() {
        return outOffsetCpTrxRecordingOrgCommission;
    }

    /**
     * Sets the value of the outOffsetCpTrxRecordingOrgCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutOffsetCpTrxRecordingOrgCommission(BigDecimal value) {
        this.outOffsetCpTrxRecordingOrgCommission = value;
    }

    /**
     * Gets the value of the outOffsetCpTrxRecordingOrgExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutOffsetCpTrxRecordingOrgExpenses() {
        return outOffsetCpTrxRecordingOrgExpenses;
    }

    /**
     * Sets the value of the outOffsetCpTrxRecordingOrgExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutOffsetCpTrxRecordingOrgExpenses(BigDecimal value) {
        this.outOffsetCpTrxRecordingOrgExpenses = value;
    }

    /**
     * Gets the value of the outOffsetCpTrxRecordingSourceTrnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOffsetCpTrxRecordingSourceTrnType() {
        return outOffsetCpTrxRecordingSourceTrnType;
    }

    /**
     * Sets the value of the outOffsetCpTrxRecordingSourceTrnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOffsetCpTrxRecordingSourceTrnType(String value) {
        this.outOffsetCpTrxRecordingSourceTrnType = value;
    }

    /**
     * Gets the value of the outOffsetCpTrxRecordingSourceUUserTota property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutOffsetCpTrxRecordingSourceUUserTota() {
        return outOffsetCpTrxRecordingSourceUUserTota;
    }

    /**
     * Sets the value of the outOffsetCpTrxRecordingSourceUUserTota property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutOffsetCpTrxRecordingSourceUUserTota(BigDecimal value) {
        this.outOffsetCpTrxRecordingSourceUUserTota = value;
    }

    /**
     * Gets the value of the outOffsetCpTrxRecordingTargetTrnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOffsetCpTrxRecordingTargetTrnType() {
        return outOffsetCpTrxRecordingTargetTrnType;
    }

    /**
     * Sets the value of the outOffsetCpTrxRecordingTargetTrnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOffsetCpTrxRecordingTargetTrnType(String value) {
        this.outOffsetCpTrxRecordingTargetTrnType = value;
    }

    /**
     * Gets the value of the outOffsetCpTrxRecordingTargetUUserTota property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutOffsetCpTrxRecordingTargetUUserTota() {
        return outOffsetCpTrxRecordingTargetUUserTota;
    }

    /**
     * Sets the value of the outOffsetCpTrxRecordingTargetUUserTota property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutOffsetCpTrxRecordingTargetUUserTota(BigDecimal value) {
        this.outOffsetCpTrxRecordingTargetUUserTota = value;
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
     * Gets the value of the outProfitsAccountAccountCd property.
     * 
     */
    public short getOutProfitsAccountAccountCd() {
        return outProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outProfitsAccountAccountCd property.
     * 
     */
    public void setOutProfitsAccountAccountCd(short value) {
        this.outProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProfitsAccountAccountNumber() {
        return outProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProfitsAccountAccountNumber(String value) {
        this.outProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outProfitsAccountDepAccNumber property.
     * 
     */
    public double getOutProfitsAccountDepAccNumber() {
        return outProfitsAccountDepAccNumber;
    }

    /**
     * Sets the value of the outProfitsAccountDepAccNumber property.
     * 
     */
    public void setOutProfitsAccountDepAccNumber(double value) {
        this.outProfitsAccountDepAccNumber = value;
    }

    /**
     * Gets the value of the outReplyTrxRecordingAccAmount1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutReplyTrxRecordingAccAmount1() {
        return outReplyTrxRecordingAccAmount1;
    }

    /**
     * Sets the value of the outReplyTrxRecordingAccAmount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutReplyTrxRecordingAccAmount1(BigDecimal value) {
        this.outReplyTrxRecordingAccAmount1 = value;
    }

    /**
     * Gets the value of the outReplyTrxRecordingAccAmount15 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutReplyTrxRecordingAccAmount15() {
        return outReplyTrxRecordingAccAmount15;
    }

    /**
     * Sets the value of the outReplyTrxRecordingAccAmount15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutReplyTrxRecordingAccAmount15(BigDecimal value) {
        this.outReplyTrxRecordingAccAmount15 = value;
    }

    /**
     * Gets the value of the outReplyTrxRecordingAccAmount17 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutReplyTrxRecordingAccAmount17() {
        return outReplyTrxRecordingAccAmount17;
    }

    /**
     * Sets the value of the outReplyTrxRecordingAccAmount17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutReplyTrxRecordingAccAmount17(BigDecimal value) {
        this.outReplyTrxRecordingAccAmount17 = value;
    }

    /**
     * Gets the value of the outReplyTrxRecordingAccAmount18 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutReplyTrxRecordingAccAmount18() {
        return outReplyTrxRecordingAccAmount18;
    }

    /**
     * Sets the value of the outReplyTrxRecordingAccAmount18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutReplyTrxRecordingAccAmount18(BigDecimal value) {
        this.outReplyTrxRecordingAccAmount18 = value;
    }

    /**
     * Gets the value of the outReplyTrxRecordingAccAmount31 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutReplyTrxRecordingAccAmount31() {
        return outReplyTrxRecordingAccAmount31;
    }

    /**
     * Sets the value of the outReplyTrxRecordingAccAmount31 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutReplyTrxRecordingAccAmount31(BigDecimal value) {
        this.outReplyTrxRecordingAccAmount31 = value;
    }

    /**
     * Gets the value of the outReplyTrxRecordingOValueDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutReplyTrxRecordingOValueDate1() {
        return outReplyTrxRecordingOValueDate1;
    }

    /**
     * Sets the value of the outReplyTrxRecordingOValueDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutReplyTrxRecordingOValueDate1(XMLGregorianCalendar value) {
        this.outReplyTrxRecordingOValueDate1 = value;
    }

    /**
     * Gets the value of the outReplyTrxRecordingUserTotalAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutReplyTrxRecordingUserTotalAmn() {
        return outReplyTrxRecordingUserTotalAmn;
    }

    /**
     * Sets the value of the outReplyTrxRecordingUserTotalAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutReplyTrxRecordingUserTotalAmn(BigDecimal value) {
        this.outReplyTrxRecordingUserTotalAmn = value;
    }

    /**
     * Gets the value of the outServiceJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutServiceJustificDescription() {
        return outServiceJustificDescription;
    }

    /**
     * Sets the value of the outServiceJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutServiceJustificDescription(String value) {
        this.outServiceJustificDescription = value;
    }

    /**
     * Gets the value of the outServiceJustificIdJustific property.
     * 
     */
    public int getOutServiceJustificIdJustific() {
        return outServiceJustificIdJustific;
    }

    /**
     * Sets the value of the outServiceJustificIdJustific property.
     * 
     */
    public void setOutServiceJustificIdJustific(int value) {
        this.outServiceJustificIdJustific = value;
    }

    /**
     * Gets the value of the outServiceProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutServiceProductDescription() {
        return outServiceProductDescription;
    }

    /**
     * Sets the value of the outServiceProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutServiceProductDescription(String value) {
        this.outServiceProductDescription = value;
    }

    /**
     * Gets the value of the outServiceProductIdProduct property.
     * 
     */
    public int getOutServiceProductIdProduct() {
        return outServiceProductIdProduct;
    }

    /**
     * Sets the value of the outServiceProductIdProduct property.
     * 
     */
    public void setOutServiceProductIdProduct(int value) {
        this.outServiceProductIdProduct = value;
    }

    /**
     * Gets the value of the outServiceTrxjustSourceTrnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutServiceTrxjustSourceTrnType() {
        return outServiceTrxjustSourceTrnType;
    }

    /**
     * Sets the value of the outServiceTrxjustSourceTrnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutServiceTrxjustSourceTrnType(String value) {
        this.outServiceTrxjustSourceTrnType = value;
    }

    /**
     * Gets the value of the outSpecificBenefLnsSuppliedAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSpecificBenefLnsSuppliedAfmNo() {
        return outSpecificBenefLnsSuppliedAfmNo;
    }

    /**
     * Sets the value of the outSpecificBenefLnsSuppliedAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSpecificBenefLnsSuppliedAfmNo(String value) {
        this.outSpecificBenefLnsSuppliedAfmNo = value;
    }

    /**
     * Gets the value of the outSpecificBenefLnsSuppliedIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSpecificBenefLnsSuppliedIdNo() {
        return outSpecificBenefLnsSuppliedIdNo;
    }

    /**
     * Sets the value of the outSpecificBenefLnsSuppliedIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSpecificBenefLnsSuppliedIdNo(String value) {
        this.outSpecificBenefLnsSuppliedIdNo = value;
    }

    /**
     * Gets the value of the outSpecificBenefLnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSpecificBenefLnsSuppliedName() {
        return outSpecificBenefLnsSuppliedName;
    }

    /**
     * Sets the value of the outSpecificBenefLnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSpecificBenefLnsSuppliedName(String value) {
        this.outSpecificBenefLnsSuppliedName = value;
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
     * Gets the value of the vlOutClientProfitsExitStateWorkActualMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVlOutClientProfitsExitStateWorkActualMessage() {
        return vlOutClientProfitsExitStateWorkActualMessage;
    }

    /**
     * Sets the value of the vlOutClientProfitsExitStateWorkActualMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVlOutClientProfitsExitStateWorkActualMessage(String value) {
        this.vlOutClientProfitsExitStateWorkActualMessage = value;
    }

    /**
     * Gets the value of the vlOutClientProfitsExitStateWorkId property.
     * 
     */
    public double getVlOutClientProfitsExitStateWorkId() {
        return vlOutClientProfitsExitStateWorkId;
    }

    /**
     * Sets the value of the vlOutClientProfitsExitStateWorkId property.
     * 
     */
    public void setVlOutClientProfitsExitStateWorkId(double value) {
        this.vlOutClientProfitsExitStateWorkId = value;
    }

    /**
     * Gets the value of the vlOutClientProfitsExitStateWorkLanguage property.
     * 
     */
    public int getVlOutClientProfitsExitStateWorkLanguage() {
        return vlOutClientProfitsExitStateWorkLanguage;
    }

    /**
     * Sets the value of the vlOutClientProfitsExitStateWorkLanguage property.
     * 
     */
    public void setVlOutClientProfitsExitStateWorkLanguage(int value) {
        this.vlOutClientProfitsExitStateWorkLanguage = value;
    }

    /**
     * Gets the value of the vlOutClientProfitsExitStateWorkMessageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVlOutClientProfitsExitStateWorkMessageType() {
        return vlOutClientProfitsExitStateWorkMessageType;
    }

    /**
     * Sets the value of the vlOutClientProfitsExitStateWorkMessageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVlOutClientProfitsExitStateWorkMessageType(String value) {
        this.vlOutClientProfitsExitStateWorkMessageType = value;
    }

    /**
     * Gets the value of the vlOutClientProfitsExitStateWorkPrftSystem property.
     * 
     */
    public short getVlOutClientProfitsExitStateWorkPrftSystem() {
        return vlOutClientProfitsExitStateWorkPrftSystem;
    }

    /**
     * Sets the value of the vlOutClientProfitsExitStateWorkPrftSystem property.
     * 
     */
    public void setVlOutClientProfitsExitStateWorkPrftSystem(short value) {
        this.vlOutClientProfitsExitStateWorkPrftSystem = value;
    }

    /**
     * Gets the value of the vlOutClientProfitsExitStateWorkRoutineSn property.
     * 
     */
    public double getVlOutClientProfitsExitStateWorkRoutineSn() {
        return vlOutClientProfitsExitStateWorkRoutineSn;
    }

    /**
     * Sets the value of the vlOutClientProfitsExitStateWorkRoutineSn property.
     * 
     */
    public void setVlOutClientProfitsExitStateWorkRoutineSn(double value) {
        this.vlOutClientProfitsExitStateWorkRoutineSn = value;
    }

    /**
     * Gets the value of the vlOutClientProfitsExitStateWorkTerminationAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVlOutClientProfitsExitStateWorkTerminationAction() {
        return vlOutClientProfitsExitStateWorkTerminationAction;
    }

    /**
     * Sets the value of the vlOutClientProfitsExitStateWorkTerminationAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVlOutClientProfitsExitStateWorkTerminationAction(String value) {
        this.vlOutClientProfitsExitStateWorkTerminationAction = value;
    }

    /**
     * Gets the value of the vlOutClientProfitsExitStateWorkValruleId property.
     * 
     */
    public double getVlOutClientProfitsExitStateWorkValruleId() {
        return vlOutClientProfitsExitStateWorkValruleId;
    }

    /**
     * Sets the value of the vlOutClientProfitsExitStateWorkValruleId property.
     * 
     */
    public void setVlOutClientProfitsExitStateWorkValruleId(double value) {
        this.vlOutClientProfitsExitStateWorkValruleId = value;
    }

    /**
     * Gets the value of the vlOutClientProfitsExitStateWorkValruleSnum property.
     * 
     */
    public int getVlOutClientProfitsExitStateWorkValruleSnum() {
        return vlOutClientProfitsExitStateWorkValruleSnum;
    }

    /**
     * Sets the value of the vlOutClientProfitsExitStateWorkValruleSnum property.
     * 
     */
    public void setVlOutClientProfitsExitStateWorkValruleSnum(int value) {
        this.vlOutClientProfitsExitStateWorkValruleSnum = value;
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
     * Gets the value of the outDrGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfJ2115VOutDrGrpItem }
     *     
     */
    public ArrayOfJ2115VOutDrGrpItem getOutDrGrp() {
        return outDrGrp;
    }

    /**
     * Sets the value of the outDrGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfJ2115VOutDrGrpItem }
     *     
     */
    public void setOutDrGrp(ArrayOfJ2115VOutDrGrpItem value) {
        this.outDrGrp = value;
    }

}
