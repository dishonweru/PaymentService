
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for L0497VLoanForecastRedemptionExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0497VLoanForecastRedemptionExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutAccountBalancesLoanAccountAccMechanism" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAccountBalancesLoanAccountDrawdownExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutAccountBalancesLoanAccountInterCapitalizeFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAccountBalancesLoanAccountNrAcrPubIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAccountBalancesLoanAccountNrUrlPubIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAccountBalancesLoanAccountNrmAcrIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAccountBalancesLoanAccountNrmCapBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAccountBalancesLoanAccountNrmComBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAccountBalancesLoanAccountNrmExpBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAccountBalancesLoanAccountNrmRlIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAccountBalancesLoanAccountNrmSubsidyBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAccountBalancesLoanAccountNrmUrlIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAccountBalancesLoanAccountOvAcrNrmIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAccountBalancesLoanAccountOvAcrPnlIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAccountBalancesLoanAccountOvAcrPubIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAccountBalancesLoanAccountOvCapBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAccountBalancesLoanAccountOvComBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAccountBalancesLoanAccountOvExpBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAccountBalancesLoanAccountOvRlNrmIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAccountBalancesLoanAccountOvRlPnlIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAccountBalancesLoanAccountOvSubsidyBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAccountBalancesLoanAccountOvUrlNrmIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAccountBalancesLoanAccountOvUrlPnlIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAccountBalancesLoanAccountOvUrlPubIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAccountBalancesLoanAccountRecyclingLmtFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgrAccKindAgreementAccKind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAlertMsgCustomerAlertMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAuthCriteriaTeamInformationTrsAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAuthCriteriaTeamInformationValueDateSpread" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBeneficiaryCustomerAlertMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBeneficiaryCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBeneficiaryCustomerCustStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBeneficiaryCustomerCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBeneficiaryCustomerShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBeneficiaryNameListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationAuthorizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationEvaluationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAdviceTotal" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfL0497VOutGrpAdviceTotalItem" minOccurs="0"/>
 *         &lt;element name="OutGrpUserTotal" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfL0497VOutGrpUserTotalItem" minOccurs="0"/>
 *         &lt;element name="OutIdTypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLnsLoanTrxRecordingITrxComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLnsLoanTrxRecordingTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLnsLoanTrxRecordingTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLnsLoanTrxRecordingTrxSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLnsLoanTrxRecordingTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLnsLoanTrxRecordingTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountAccTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountLoanStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMntMntRecordingTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutMntMntRecordingTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutNewDateToSpecialAgrWorkValueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutNewNormalAccrualsIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutNewOverdueAccrualsIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPositiveBalancesLoanAccountInfoBlockedAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutPositiveBalancesLoanAccountInfoDormantAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutPositiveBalancesLoanAccountInfoPositiveAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutPositiveBalancesLoanAccountInfoUnclearAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutResultCurrentLoanRequestConfirmExpireDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutResultCurrentLoanRequestLstAcrCalcDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutResultCurrentLoanRequestNxtOvIntCalcDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutResultCurrentLoanRequestRequestLoanSts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultCurrentLoanRequestRequestSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutResultCurrentLoanRequestRequestSts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultCurrentLoanRequestRequestType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultCurrentLoanRequestRqAcrNrmIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutResultCurrentLoanRequestRqAcrPnlIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutResultCurrentLoanRequestRqAcrPubIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutResultCurrentLoanRequestRqCapitalBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutResultCurrentLoanRequestRqComBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutResultCurrentLoanRequestRqCreationDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutResultCurrentLoanRequestRqExpBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutResultCurrentLoanRequestRqExpireDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutResultCurrentLoanRequestRqRlNrmIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutResultCurrentLoanRequestRqRlPnlIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutResultCurrentLoanRequestRqSubsidyBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutResultCurrentLoanRequestRqUrlNrmIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutResultCurrentLoanRequestRqUrlPnlIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutResultCurrentLoanRequestRqUrlPubIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutResultCurrentLoanRequestTmpstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutResultCurrentLoanRequestUnpaidCollCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSuccessTransSuccessfulTransactionWorkAccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuccessTransSuccessfulTransactionWorkAgreementNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuccessTransSuccessfulTransactionWorkCustomer1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuccessTransSuccessfulTransactionWorkCustomer2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuccessTransSuccessfulTransactionWorkIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSuccessTransSuccessfulTransactionWorkOldAccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuccessTransSuccessfulTransactionWorkProdDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuccessTransSuccessfulTransactionWorkRepresentativeTermsLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuccessTransSuccessfulTransactionWorkRepresentativeTermsLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuccessTransSuccessfulTransactionWorkRqExpireDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSuccessTransSuccessfulTransactionWorkRqExpireDtDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuccessTransSuccessfulTransactionWorkValeurDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTotalOwedIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTrxCountersTrxCountAdvCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTrxCountersTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutVoucherLineParVoucherRunVoucherLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInsuranceBalanceIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0497VLoanForecastRedemptionExport", propOrder = {
    "outAccountBalancesLoanAccountAccMechanism",
    "outAccountBalancesLoanAccountDrawdownExpDt",
    "outAccountBalancesLoanAccountInterCapitalizeFlg",
    "outAccountBalancesLoanAccountNrAcrPubIntAmn",
    "outAccountBalancesLoanAccountNrUrlPubIntAmn",
    "outAccountBalancesLoanAccountNrmAcrIntBal",
    "outAccountBalancesLoanAccountNrmCapBal",
    "outAccountBalancesLoanAccountNrmComBal",
    "outAccountBalancesLoanAccountNrmExpBal",
    "outAccountBalancesLoanAccountNrmRlIntBal",
    "outAccountBalancesLoanAccountNrmSubsidyBal",
    "outAccountBalancesLoanAccountNrmUrlIntBal",
    "outAccountBalancesLoanAccountOvAcrNrmIntBal",
    "outAccountBalancesLoanAccountOvAcrPnlIntBal",
    "outAccountBalancesLoanAccountOvAcrPubIntAmn",
    "outAccountBalancesLoanAccountOvCapBal",
    "outAccountBalancesLoanAccountOvComBal",
    "outAccountBalancesLoanAccountOvExpBal",
    "outAccountBalancesLoanAccountOvRlNrmIntBal",
    "outAccountBalancesLoanAccountOvRlPnlIntBal",
    "outAccountBalancesLoanAccountOvSubsidyBal",
    "outAccountBalancesLoanAccountOvUrlNrmIntBal",
    "outAccountBalancesLoanAccountOvUrlPnlIntBal",
    "outAccountBalancesLoanAccountOvUrlPubIntAmn",
    "outAccountBalancesLoanAccountRecyclingLmtFlg",
    "outAgrAccKindAgreementAccKind",
    "outAlertMsgCustomerAlertMsg",
    "outAuthCriteriaTeamInformationTrsAmount",
    "outAuthCriteriaTeamInformationValueDateSpread",
    "outBeneficiaryCustomerAlertMsg",
    "outBeneficiaryCustomerCustId",
    "outBeneficiaryCustomerCustStatus",
    "outBeneficiaryCustomerCustType",
    "outBeneficiaryCustomerShortName",
    "outBeneficiaryNameListSetDescription",
    "outEvalResultTeamInformationAuthorizationType",
    "outEvalResultTeamInformationEvaluationResult",
    "outEvalResultTeamInformationRequiredProfile1",
    "outEvalResultTeamInformationRequiredProfile2",
    "outGrpAdviceTotal",
    "outGrpUserTotal",
    "outIdTypeGenericDetailDescription",
    "outJustificDescription",
    "outJustificIdJustific",
    "outLnsLoanTrxRecordingITrxComments",
    "outLnsLoanTrxRecordingTmstamp",
    "outLnsLoanTrxRecordingTrxDate",
    "outLnsLoanTrxRecordingTrxSn",
    "outLnsLoanTrxRecordingTrxUnit",
    "outLnsLoanTrxRecordingTrxUsr",
    "outLoanAccountAccTerms",
    "outLoanAccountLoanStatus",
    "outLoanProductDescription",
    "outLoanProductIdProduct",
    "outMntMntRecordingTmstamp",
    "outMntMntRecordingTrxUsrSn",
    "outNewDateToSpecialAgrWorkValueDate",
    "outNewNormalAccrualsIefSuppliedNumber152",
    "outNewOverdueAccrualsIefSuppliedNumber152",
    "outOtherIdIdNo",
    "outPositiveBalancesLoanAccountInfoBlockedAmn",
    "outPositiveBalancesLoanAccountInfoDormantAmn",
    "outPositiveBalancesLoanAccountInfoPositiveAmn",
    "outPositiveBalancesLoanAccountInfoUnclearAmn",
    "outPrftTransactionDescription",
    "outPrftTransactionIdTransact",
    "outResultCurrentLoanRequestConfirmExpireDt",
    "outResultCurrentLoanRequestLstAcrCalcDt",
    "outResultCurrentLoanRequestNxtOvIntCalcDt",
    "outResultCurrentLoanRequestRequestLoanSts",
    "outResultCurrentLoanRequestRequestSn",
    "outResultCurrentLoanRequestRequestSts",
    "outResultCurrentLoanRequestRequestType",
    "outResultCurrentLoanRequestRqAcrNrmIntBal",
    "outResultCurrentLoanRequestRqAcrPnlIntBal",
    "outResultCurrentLoanRequestRqAcrPubIntAmn",
    "outResultCurrentLoanRequestRqCapitalBal",
    "outResultCurrentLoanRequestRqComBal",
    "outResultCurrentLoanRequestRqCreationDt",
    "outResultCurrentLoanRequestRqExpBal",
    "outResultCurrentLoanRequestRqExpireDt",
    "outResultCurrentLoanRequestRqRlNrmIntBal",
    "outResultCurrentLoanRequestRqRlPnlIntBal",
    "outResultCurrentLoanRequestRqSubsidyBal",
    "outResultCurrentLoanRequestRqUrlNrmIntBal",
    "outResultCurrentLoanRequestRqUrlPnlIntBal",
    "outResultCurrentLoanRequestRqUrlPubIntAmn",
    "outResultCurrentLoanRequestTmpstamp",
    "outResultCurrentLoanRequestUnpaidCollCnt",
    "outSuccessTransSuccessfulTransactionWorkAccountNo",
    "outSuccessTransSuccessfulTransactionWorkAgreementNo",
    "outSuccessTransSuccessfulTransactionWorkCustomer1",
    "outSuccessTransSuccessfulTransactionWorkCustomer2",
    "outSuccessTransSuccessfulTransactionWorkIdProduct",
    "outSuccessTransSuccessfulTransactionWorkOldAccountNo",
    "outSuccessTransSuccessfulTransactionWorkProdDescription",
    "outSuccessTransSuccessfulTransactionWorkRepresentativeTermsLine1",
    "outSuccessTransSuccessfulTransactionWorkRepresentativeTermsLine2",
    "outSuccessTransSuccessfulTransactionWorkRqExpireDt",
    "outSuccessTransSuccessfulTransactionWorkRqExpireDtDesc",
    "outSuccessTransSuccessfulTransactionWorkValeurDt",
    "outTotalOwedIefSuppliedAmount",
    "outTrxCountersTrxCountAdvCounter",
    "outTrxCountersTrxCountTrxCounter",
    "outVoucherLineParVoucherRunVoucherLine",
    "outInsuranceBalanceIefSuppliedAmount"
})
public class L0497VLoanForecastRedemptionExport
    extends BaseExport
{

    @XmlElement(name = "OutAccountBalancesLoanAccountAccMechanism")
    protected String outAccountBalancesLoanAccountAccMechanism;
    @XmlElement(name = "OutAccountBalancesLoanAccountDrawdownExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outAccountBalancesLoanAccountDrawdownExpDt;
    @XmlElement(name = "OutAccountBalancesLoanAccountInterCapitalizeFlg")
    protected String outAccountBalancesLoanAccountInterCapitalizeFlg;
    @XmlElement(name = "OutAccountBalancesLoanAccountNrAcrPubIntAmn", required = true)
    protected BigDecimal outAccountBalancesLoanAccountNrAcrPubIntAmn;
    @XmlElement(name = "OutAccountBalancesLoanAccountNrUrlPubIntAmn", required = true)
    protected BigDecimal outAccountBalancesLoanAccountNrUrlPubIntAmn;
    @XmlElement(name = "OutAccountBalancesLoanAccountNrmAcrIntBal", required = true)
    protected BigDecimal outAccountBalancesLoanAccountNrmAcrIntBal;
    @XmlElement(name = "OutAccountBalancesLoanAccountNrmCapBal", required = true)
    protected BigDecimal outAccountBalancesLoanAccountNrmCapBal;
    @XmlElement(name = "OutAccountBalancesLoanAccountNrmComBal", required = true)
    protected BigDecimal outAccountBalancesLoanAccountNrmComBal;
    @XmlElement(name = "OutAccountBalancesLoanAccountNrmExpBal", required = true)
    protected BigDecimal outAccountBalancesLoanAccountNrmExpBal;
    @XmlElement(name = "OutAccountBalancesLoanAccountNrmRlIntBal", required = true)
    protected BigDecimal outAccountBalancesLoanAccountNrmRlIntBal;
    @XmlElement(name = "OutAccountBalancesLoanAccountNrmSubsidyBal", required = true)
    protected BigDecimal outAccountBalancesLoanAccountNrmSubsidyBal;
    @XmlElement(name = "OutAccountBalancesLoanAccountNrmUrlIntBal", required = true)
    protected BigDecimal outAccountBalancesLoanAccountNrmUrlIntBal;
    @XmlElement(name = "OutAccountBalancesLoanAccountOvAcrNrmIntBal", required = true)
    protected BigDecimal outAccountBalancesLoanAccountOvAcrNrmIntBal;
    @XmlElement(name = "OutAccountBalancesLoanAccountOvAcrPnlIntBal", required = true)
    protected BigDecimal outAccountBalancesLoanAccountOvAcrPnlIntBal;
    @XmlElement(name = "OutAccountBalancesLoanAccountOvAcrPubIntAmn", required = true)
    protected BigDecimal outAccountBalancesLoanAccountOvAcrPubIntAmn;
    @XmlElement(name = "OutAccountBalancesLoanAccountOvCapBal", required = true)
    protected BigDecimal outAccountBalancesLoanAccountOvCapBal;
    @XmlElement(name = "OutAccountBalancesLoanAccountOvComBal", required = true)
    protected BigDecimal outAccountBalancesLoanAccountOvComBal;
    @XmlElement(name = "OutAccountBalancesLoanAccountOvExpBal", required = true)
    protected BigDecimal outAccountBalancesLoanAccountOvExpBal;
    @XmlElement(name = "OutAccountBalancesLoanAccountOvRlNrmIntBal", required = true)
    protected BigDecimal outAccountBalancesLoanAccountOvRlNrmIntBal;
    @XmlElement(name = "OutAccountBalancesLoanAccountOvRlPnlIntBal", required = true)
    protected BigDecimal outAccountBalancesLoanAccountOvRlPnlIntBal;
    @XmlElement(name = "OutAccountBalancesLoanAccountOvSubsidyBal", required = true)
    protected BigDecimal outAccountBalancesLoanAccountOvSubsidyBal;
    @XmlElement(name = "OutAccountBalancesLoanAccountOvUrlNrmIntBal", required = true)
    protected BigDecimal outAccountBalancesLoanAccountOvUrlNrmIntBal;
    @XmlElement(name = "OutAccountBalancesLoanAccountOvUrlPnlIntBal", required = true)
    protected BigDecimal outAccountBalancesLoanAccountOvUrlPnlIntBal;
    @XmlElement(name = "OutAccountBalancesLoanAccountOvUrlPubIntAmn", required = true)
    protected BigDecimal outAccountBalancesLoanAccountOvUrlPubIntAmn;
    @XmlElement(name = "OutAccountBalancesLoanAccountRecyclingLmtFlg")
    protected String outAccountBalancesLoanAccountRecyclingLmtFlg;
    @XmlElement(name = "OutAgrAccKindAgreementAccKind")
    protected String outAgrAccKindAgreementAccKind;
    @XmlElement(name = "OutAlertMsgCustomerAlertMsg")
    protected String outAlertMsgCustomerAlertMsg;
    @XmlElement(name = "OutAuthCriteriaTeamInformationTrsAmount", required = true)
    protected BigDecimal outAuthCriteriaTeamInformationTrsAmount;
    @XmlElement(name = "OutAuthCriteriaTeamInformationValueDateSpread")
    protected short outAuthCriteriaTeamInformationValueDateSpread;
    @XmlElement(name = "OutBeneficiaryCustomerAlertMsg")
    protected String outBeneficiaryCustomerAlertMsg;
    @XmlElement(name = "OutBeneficiaryCustomerCustId")
    protected int outBeneficiaryCustomerCustId;
    @XmlElement(name = "OutBeneficiaryCustomerCustStatus")
    protected String outBeneficiaryCustomerCustStatus;
    @XmlElement(name = "OutBeneficiaryCustomerCustType")
    protected String outBeneficiaryCustomerCustType;
    @XmlElement(name = "OutBeneficiaryCustomerShortName")
    protected String outBeneficiaryCustomerShortName;
    @XmlElement(name = "OutBeneficiaryNameListSetDescription")
    protected String outBeneficiaryNameListSetDescription;
    @XmlElement(name = "OutEvalResultTeamInformationAuthorizationType")
    protected String outEvalResultTeamInformationAuthorizationType;
    @XmlElement(name = "OutEvalResultTeamInformationEvaluationResult")
    protected String outEvalResultTeamInformationEvaluationResult;
    @XmlElement(name = "OutEvalResultTeamInformationRequiredProfile1")
    protected String outEvalResultTeamInformationRequiredProfile1;
    @XmlElement(name = "OutEvalResultTeamInformationRequiredProfile2")
    protected String outEvalResultTeamInformationRequiredProfile2;
    @XmlElement(name = "OutGrpAdviceTotal")
    protected ArrayOfL0497VOutGrpAdviceTotalItem outGrpAdviceTotal;
    @XmlElement(name = "OutGrpUserTotal")
    protected ArrayOfL0497VOutGrpUserTotalItem outGrpUserTotal;
    @XmlElement(name = "OutIdTypeGenericDetailDescription")
    protected String outIdTypeGenericDetailDescription;
    @XmlElement(name = "OutJustificDescription")
    protected String outJustificDescription;
    @XmlElement(name = "OutJustificIdJustific")
    protected int outJustificIdJustific;
    @XmlElement(name = "OutLnsLoanTrxRecordingITrxComments")
    protected String outLnsLoanTrxRecordingITrxComments;
    @XmlElement(name = "OutLnsLoanTrxRecordingTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLnsLoanTrxRecordingTmstamp;
    @XmlElement(name = "OutLnsLoanTrxRecordingTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLnsLoanTrxRecordingTrxDate;
    @XmlElement(name = "OutLnsLoanTrxRecordingTrxSn")
    protected int outLnsLoanTrxRecordingTrxSn;
    @XmlElement(name = "OutLnsLoanTrxRecordingTrxUnit")
    protected int outLnsLoanTrxRecordingTrxUnit;
    @XmlElement(name = "OutLnsLoanTrxRecordingTrxUsr")
    protected String outLnsLoanTrxRecordingTrxUsr;
    @XmlElement(name = "OutLoanAccountAccTerms")
    protected String outLoanAccountAccTerms;
    @XmlElement(name = "OutLoanAccountLoanStatus")
    protected String outLoanAccountLoanStatus;
    @XmlElement(name = "OutLoanProductDescription")
    protected String outLoanProductDescription;
    @XmlElement(name = "OutLoanProductIdProduct")
    protected int outLoanProductIdProduct;
    @XmlElement(name = "OutMntMntRecordingTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outMntMntRecordingTmstamp;
    @XmlElement(name = "OutMntMntRecordingTrxUsrSn")
    protected int outMntMntRecordingTrxUsrSn;
    @XmlElement(name = "OutNewDateToSpecialAgrWorkValueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outNewDateToSpecialAgrWorkValueDate;
    @XmlElement(name = "OutNewNormalAccrualsIefSuppliedNumber152", required = true)
    protected BigDecimal outNewNormalAccrualsIefSuppliedNumber152;
    @XmlElement(name = "OutNewOverdueAccrualsIefSuppliedNumber152", required = true)
    protected BigDecimal outNewOverdueAccrualsIefSuppliedNumber152;
    @XmlElement(name = "OutOtherIdIdNo")
    protected String outOtherIdIdNo;
    @XmlElement(name = "OutPositiveBalancesLoanAccountInfoBlockedAmn", required = true)
    protected BigDecimal outPositiveBalancesLoanAccountInfoBlockedAmn;
    @XmlElement(name = "OutPositiveBalancesLoanAccountInfoDormantAmn", required = true)
    protected BigDecimal outPositiveBalancesLoanAccountInfoDormantAmn;
    @XmlElement(name = "OutPositiveBalancesLoanAccountInfoPositiveAmn", required = true)
    protected BigDecimal outPositiveBalancesLoanAccountInfoPositiveAmn;
    @XmlElement(name = "OutPositiveBalancesLoanAccountInfoUnclearAmn", required = true)
    protected BigDecimal outPositiveBalancesLoanAccountInfoUnclearAmn;
    @XmlElement(name = "OutPrftTransactionDescription")
    protected String outPrftTransactionDescription;
    @XmlElement(name = "OutPrftTransactionIdTransact")
    protected int outPrftTransactionIdTransact;
    @XmlElement(name = "OutResultCurrentLoanRequestConfirmExpireDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outResultCurrentLoanRequestConfirmExpireDt;
    @XmlElement(name = "OutResultCurrentLoanRequestLstAcrCalcDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outResultCurrentLoanRequestLstAcrCalcDt;
    @XmlElement(name = "OutResultCurrentLoanRequestNxtOvIntCalcDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outResultCurrentLoanRequestNxtOvIntCalcDt;
    @XmlElement(name = "OutResultCurrentLoanRequestRequestLoanSts")
    protected String outResultCurrentLoanRequestRequestLoanSts;
    @XmlElement(name = "OutResultCurrentLoanRequestRequestSn")
    protected short outResultCurrentLoanRequestRequestSn;
    @XmlElement(name = "OutResultCurrentLoanRequestRequestSts")
    protected String outResultCurrentLoanRequestRequestSts;
    @XmlElement(name = "OutResultCurrentLoanRequestRequestType")
    protected String outResultCurrentLoanRequestRequestType;
    @XmlElement(name = "OutResultCurrentLoanRequestRqAcrNrmIntBal", required = true)
    protected BigDecimal outResultCurrentLoanRequestRqAcrNrmIntBal;
    @XmlElement(name = "OutResultCurrentLoanRequestRqAcrPnlIntBal", required = true)
    protected BigDecimal outResultCurrentLoanRequestRqAcrPnlIntBal;
    @XmlElement(name = "OutResultCurrentLoanRequestRqAcrPubIntAmn", required = true)
    protected BigDecimal outResultCurrentLoanRequestRqAcrPubIntAmn;
    @XmlElement(name = "OutResultCurrentLoanRequestRqCapitalBal", required = true)
    protected BigDecimal outResultCurrentLoanRequestRqCapitalBal;
    @XmlElement(name = "OutResultCurrentLoanRequestRqComBal", required = true)
    protected BigDecimal outResultCurrentLoanRequestRqComBal;
    @XmlElement(name = "OutResultCurrentLoanRequestRqCreationDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outResultCurrentLoanRequestRqCreationDt;
    @XmlElement(name = "OutResultCurrentLoanRequestRqExpBal", required = true)
    protected BigDecimal outResultCurrentLoanRequestRqExpBal;
    @XmlElement(name = "OutResultCurrentLoanRequestRqExpireDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outResultCurrentLoanRequestRqExpireDt;
    @XmlElement(name = "OutResultCurrentLoanRequestRqRlNrmIntBal", required = true)
    protected BigDecimal outResultCurrentLoanRequestRqRlNrmIntBal;
    @XmlElement(name = "OutResultCurrentLoanRequestRqRlPnlIntBal", required = true)
    protected BigDecimal outResultCurrentLoanRequestRqRlPnlIntBal;
    @XmlElement(name = "OutResultCurrentLoanRequestRqSubsidyBal", required = true)
    protected BigDecimal outResultCurrentLoanRequestRqSubsidyBal;
    @XmlElement(name = "OutResultCurrentLoanRequestRqUrlNrmIntBal", required = true)
    protected BigDecimal outResultCurrentLoanRequestRqUrlNrmIntBal;
    @XmlElement(name = "OutResultCurrentLoanRequestRqUrlPnlIntBal", required = true)
    protected BigDecimal outResultCurrentLoanRequestRqUrlPnlIntBal;
    @XmlElement(name = "OutResultCurrentLoanRequestRqUrlPubIntAmn", required = true)
    protected BigDecimal outResultCurrentLoanRequestRqUrlPubIntAmn;
    @XmlElement(name = "OutResultCurrentLoanRequestTmpstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outResultCurrentLoanRequestTmpstamp;
    @XmlElement(name = "OutResultCurrentLoanRequestUnpaidCollCnt")
    protected short outResultCurrentLoanRequestUnpaidCollCnt;
    @XmlElement(name = "OutSuccessTransSuccessfulTransactionWorkAccountNo")
    protected String outSuccessTransSuccessfulTransactionWorkAccountNo;
    @XmlElement(name = "OutSuccessTransSuccessfulTransactionWorkAgreementNo")
    protected String outSuccessTransSuccessfulTransactionWorkAgreementNo;
    @XmlElement(name = "OutSuccessTransSuccessfulTransactionWorkCustomer1")
    protected String outSuccessTransSuccessfulTransactionWorkCustomer1;
    @XmlElement(name = "OutSuccessTransSuccessfulTransactionWorkCustomer2")
    protected String outSuccessTransSuccessfulTransactionWorkCustomer2;
    @XmlElement(name = "OutSuccessTransSuccessfulTransactionWorkIdProduct")
    protected int outSuccessTransSuccessfulTransactionWorkIdProduct;
    @XmlElement(name = "OutSuccessTransSuccessfulTransactionWorkOldAccountNo")
    protected String outSuccessTransSuccessfulTransactionWorkOldAccountNo;
    @XmlElement(name = "OutSuccessTransSuccessfulTransactionWorkProdDescription")
    protected String outSuccessTransSuccessfulTransactionWorkProdDescription;
    @XmlElement(name = "OutSuccessTransSuccessfulTransactionWorkRepresentativeTermsLine1")
    protected String outSuccessTransSuccessfulTransactionWorkRepresentativeTermsLine1;
    @XmlElement(name = "OutSuccessTransSuccessfulTransactionWorkRepresentativeTermsLine2")
    protected String outSuccessTransSuccessfulTransactionWorkRepresentativeTermsLine2;
    @XmlElement(name = "OutSuccessTransSuccessfulTransactionWorkRqExpireDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSuccessTransSuccessfulTransactionWorkRqExpireDt;
    @XmlElement(name = "OutSuccessTransSuccessfulTransactionWorkRqExpireDtDesc")
    protected String outSuccessTransSuccessfulTransactionWorkRqExpireDtDesc;
    @XmlElement(name = "OutSuccessTransSuccessfulTransactionWorkValeurDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSuccessTransSuccessfulTransactionWorkValeurDt;
    @XmlElement(name = "OutTotalOwedIefSuppliedAmount", required = true)
    protected BigDecimal outTotalOwedIefSuppliedAmount;
    @XmlElement(name = "OutTrxCountersTrxCountAdvCounter")
    protected int outTrxCountersTrxCountAdvCounter;
    @XmlElement(name = "OutTrxCountersTrxCountTrxCounter")
    protected int outTrxCountersTrxCountTrxCounter;
    @XmlElement(name = "OutVoucherLineParVoucherRunVoucherLine")
    protected String outVoucherLineParVoucherRunVoucherLine;
    @XmlElement(name = "OutInsuranceBalanceIefSuppliedAmount", required = true)
    protected BigDecimal outInsuranceBalanceIefSuppliedAmount;

    /**
     * Gets the value of the outAccountBalancesLoanAccountAccMechanism property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAccountBalancesLoanAccountAccMechanism() {
        return outAccountBalancesLoanAccountAccMechanism;
    }

    /**
     * Sets the value of the outAccountBalancesLoanAccountAccMechanism property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAccountBalancesLoanAccountAccMechanism(String value) {
        this.outAccountBalancesLoanAccountAccMechanism = value;
    }

    /**
     * Gets the value of the outAccountBalancesLoanAccountDrawdownExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutAccountBalancesLoanAccountDrawdownExpDt() {
        return outAccountBalancesLoanAccountDrawdownExpDt;
    }

    /**
     * Sets the value of the outAccountBalancesLoanAccountDrawdownExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutAccountBalancesLoanAccountDrawdownExpDt(XMLGregorianCalendar value) {
        this.outAccountBalancesLoanAccountDrawdownExpDt = value;
    }

    /**
     * Gets the value of the outAccountBalancesLoanAccountInterCapitalizeFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAccountBalancesLoanAccountInterCapitalizeFlg() {
        return outAccountBalancesLoanAccountInterCapitalizeFlg;
    }

    /**
     * Sets the value of the outAccountBalancesLoanAccountInterCapitalizeFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAccountBalancesLoanAccountInterCapitalizeFlg(String value) {
        this.outAccountBalancesLoanAccountInterCapitalizeFlg = value;
    }

    /**
     * Gets the value of the outAccountBalancesLoanAccountNrAcrPubIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAccountBalancesLoanAccountNrAcrPubIntAmn() {
        return outAccountBalancesLoanAccountNrAcrPubIntAmn;
    }

    /**
     * Sets the value of the outAccountBalancesLoanAccountNrAcrPubIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAccountBalancesLoanAccountNrAcrPubIntAmn(BigDecimal value) {
        this.outAccountBalancesLoanAccountNrAcrPubIntAmn = value;
    }

    /**
     * Gets the value of the outAccountBalancesLoanAccountNrUrlPubIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAccountBalancesLoanAccountNrUrlPubIntAmn() {
        return outAccountBalancesLoanAccountNrUrlPubIntAmn;
    }

    /**
     * Sets the value of the outAccountBalancesLoanAccountNrUrlPubIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAccountBalancesLoanAccountNrUrlPubIntAmn(BigDecimal value) {
        this.outAccountBalancesLoanAccountNrUrlPubIntAmn = value;
    }

    /**
     * Gets the value of the outAccountBalancesLoanAccountNrmAcrIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAccountBalancesLoanAccountNrmAcrIntBal() {
        return outAccountBalancesLoanAccountNrmAcrIntBal;
    }

    /**
     * Sets the value of the outAccountBalancesLoanAccountNrmAcrIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAccountBalancesLoanAccountNrmAcrIntBal(BigDecimal value) {
        this.outAccountBalancesLoanAccountNrmAcrIntBal = value;
    }

    /**
     * Gets the value of the outAccountBalancesLoanAccountNrmCapBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAccountBalancesLoanAccountNrmCapBal() {
        return outAccountBalancesLoanAccountNrmCapBal;
    }

    /**
     * Sets the value of the outAccountBalancesLoanAccountNrmCapBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAccountBalancesLoanAccountNrmCapBal(BigDecimal value) {
        this.outAccountBalancesLoanAccountNrmCapBal = value;
    }

    /**
     * Gets the value of the outAccountBalancesLoanAccountNrmComBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAccountBalancesLoanAccountNrmComBal() {
        return outAccountBalancesLoanAccountNrmComBal;
    }

    /**
     * Sets the value of the outAccountBalancesLoanAccountNrmComBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAccountBalancesLoanAccountNrmComBal(BigDecimal value) {
        this.outAccountBalancesLoanAccountNrmComBal = value;
    }

    /**
     * Gets the value of the outAccountBalancesLoanAccountNrmExpBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAccountBalancesLoanAccountNrmExpBal() {
        return outAccountBalancesLoanAccountNrmExpBal;
    }

    /**
     * Sets the value of the outAccountBalancesLoanAccountNrmExpBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAccountBalancesLoanAccountNrmExpBal(BigDecimal value) {
        this.outAccountBalancesLoanAccountNrmExpBal = value;
    }

    /**
     * Gets the value of the outAccountBalancesLoanAccountNrmRlIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAccountBalancesLoanAccountNrmRlIntBal() {
        return outAccountBalancesLoanAccountNrmRlIntBal;
    }

    /**
     * Sets the value of the outAccountBalancesLoanAccountNrmRlIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAccountBalancesLoanAccountNrmRlIntBal(BigDecimal value) {
        this.outAccountBalancesLoanAccountNrmRlIntBal = value;
    }

    /**
     * Gets the value of the outAccountBalancesLoanAccountNrmSubsidyBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAccountBalancesLoanAccountNrmSubsidyBal() {
        return outAccountBalancesLoanAccountNrmSubsidyBal;
    }

    /**
     * Sets the value of the outAccountBalancesLoanAccountNrmSubsidyBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAccountBalancesLoanAccountNrmSubsidyBal(BigDecimal value) {
        this.outAccountBalancesLoanAccountNrmSubsidyBal = value;
    }

    /**
     * Gets the value of the outAccountBalancesLoanAccountNrmUrlIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAccountBalancesLoanAccountNrmUrlIntBal() {
        return outAccountBalancesLoanAccountNrmUrlIntBal;
    }

    /**
     * Sets the value of the outAccountBalancesLoanAccountNrmUrlIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAccountBalancesLoanAccountNrmUrlIntBal(BigDecimal value) {
        this.outAccountBalancesLoanAccountNrmUrlIntBal = value;
    }

    /**
     * Gets the value of the outAccountBalancesLoanAccountOvAcrNrmIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAccountBalancesLoanAccountOvAcrNrmIntBal() {
        return outAccountBalancesLoanAccountOvAcrNrmIntBal;
    }

    /**
     * Sets the value of the outAccountBalancesLoanAccountOvAcrNrmIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAccountBalancesLoanAccountOvAcrNrmIntBal(BigDecimal value) {
        this.outAccountBalancesLoanAccountOvAcrNrmIntBal = value;
    }

    /**
     * Gets the value of the outAccountBalancesLoanAccountOvAcrPnlIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAccountBalancesLoanAccountOvAcrPnlIntBal() {
        return outAccountBalancesLoanAccountOvAcrPnlIntBal;
    }

    /**
     * Sets the value of the outAccountBalancesLoanAccountOvAcrPnlIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAccountBalancesLoanAccountOvAcrPnlIntBal(BigDecimal value) {
        this.outAccountBalancesLoanAccountOvAcrPnlIntBal = value;
    }

    /**
     * Gets the value of the outAccountBalancesLoanAccountOvAcrPubIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAccountBalancesLoanAccountOvAcrPubIntAmn() {
        return outAccountBalancesLoanAccountOvAcrPubIntAmn;
    }

    /**
     * Sets the value of the outAccountBalancesLoanAccountOvAcrPubIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAccountBalancesLoanAccountOvAcrPubIntAmn(BigDecimal value) {
        this.outAccountBalancesLoanAccountOvAcrPubIntAmn = value;
    }

    /**
     * Gets the value of the outAccountBalancesLoanAccountOvCapBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAccountBalancesLoanAccountOvCapBal() {
        return outAccountBalancesLoanAccountOvCapBal;
    }

    /**
     * Sets the value of the outAccountBalancesLoanAccountOvCapBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAccountBalancesLoanAccountOvCapBal(BigDecimal value) {
        this.outAccountBalancesLoanAccountOvCapBal = value;
    }

    /**
     * Gets the value of the outAccountBalancesLoanAccountOvComBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAccountBalancesLoanAccountOvComBal() {
        return outAccountBalancesLoanAccountOvComBal;
    }

    /**
     * Sets the value of the outAccountBalancesLoanAccountOvComBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAccountBalancesLoanAccountOvComBal(BigDecimal value) {
        this.outAccountBalancesLoanAccountOvComBal = value;
    }

    /**
     * Gets the value of the outAccountBalancesLoanAccountOvExpBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAccountBalancesLoanAccountOvExpBal() {
        return outAccountBalancesLoanAccountOvExpBal;
    }

    /**
     * Sets the value of the outAccountBalancesLoanAccountOvExpBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAccountBalancesLoanAccountOvExpBal(BigDecimal value) {
        this.outAccountBalancesLoanAccountOvExpBal = value;
    }

    /**
     * Gets the value of the outAccountBalancesLoanAccountOvRlNrmIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAccountBalancesLoanAccountOvRlNrmIntBal() {
        return outAccountBalancesLoanAccountOvRlNrmIntBal;
    }

    /**
     * Sets the value of the outAccountBalancesLoanAccountOvRlNrmIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAccountBalancesLoanAccountOvRlNrmIntBal(BigDecimal value) {
        this.outAccountBalancesLoanAccountOvRlNrmIntBal = value;
    }

    /**
     * Gets the value of the outAccountBalancesLoanAccountOvRlPnlIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAccountBalancesLoanAccountOvRlPnlIntBal() {
        return outAccountBalancesLoanAccountOvRlPnlIntBal;
    }

    /**
     * Sets the value of the outAccountBalancesLoanAccountOvRlPnlIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAccountBalancesLoanAccountOvRlPnlIntBal(BigDecimal value) {
        this.outAccountBalancesLoanAccountOvRlPnlIntBal = value;
    }

    /**
     * Gets the value of the outAccountBalancesLoanAccountOvSubsidyBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAccountBalancesLoanAccountOvSubsidyBal() {
        return outAccountBalancesLoanAccountOvSubsidyBal;
    }

    /**
     * Sets the value of the outAccountBalancesLoanAccountOvSubsidyBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAccountBalancesLoanAccountOvSubsidyBal(BigDecimal value) {
        this.outAccountBalancesLoanAccountOvSubsidyBal = value;
    }

    /**
     * Gets the value of the outAccountBalancesLoanAccountOvUrlNrmIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAccountBalancesLoanAccountOvUrlNrmIntBal() {
        return outAccountBalancesLoanAccountOvUrlNrmIntBal;
    }

    /**
     * Sets the value of the outAccountBalancesLoanAccountOvUrlNrmIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAccountBalancesLoanAccountOvUrlNrmIntBal(BigDecimal value) {
        this.outAccountBalancesLoanAccountOvUrlNrmIntBal = value;
    }

    /**
     * Gets the value of the outAccountBalancesLoanAccountOvUrlPnlIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAccountBalancesLoanAccountOvUrlPnlIntBal() {
        return outAccountBalancesLoanAccountOvUrlPnlIntBal;
    }

    /**
     * Sets the value of the outAccountBalancesLoanAccountOvUrlPnlIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAccountBalancesLoanAccountOvUrlPnlIntBal(BigDecimal value) {
        this.outAccountBalancesLoanAccountOvUrlPnlIntBal = value;
    }

    /**
     * Gets the value of the outAccountBalancesLoanAccountOvUrlPubIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAccountBalancesLoanAccountOvUrlPubIntAmn() {
        return outAccountBalancesLoanAccountOvUrlPubIntAmn;
    }

    /**
     * Sets the value of the outAccountBalancesLoanAccountOvUrlPubIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAccountBalancesLoanAccountOvUrlPubIntAmn(BigDecimal value) {
        this.outAccountBalancesLoanAccountOvUrlPubIntAmn = value;
    }

    /**
     * Gets the value of the outAccountBalancesLoanAccountRecyclingLmtFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAccountBalancesLoanAccountRecyclingLmtFlg() {
        return outAccountBalancesLoanAccountRecyclingLmtFlg;
    }

    /**
     * Sets the value of the outAccountBalancesLoanAccountRecyclingLmtFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAccountBalancesLoanAccountRecyclingLmtFlg(String value) {
        this.outAccountBalancesLoanAccountRecyclingLmtFlg = value;
    }

    /**
     * Gets the value of the outAgrAccKindAgreementAccKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgrAccKindAgreementAccKind() {
        return outAgrAccKindAgreementAccKind;
    }

    /**
     * Sets the value of the outAgrAccKindAgreementAccKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgrAccKindAgreementAccKind(String value) {
        this.outAgrAccKindAgreementAccKind = value;
    }

    /**
     * Gets the value of the outAlertMsgCustomerAlertMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAlertMsgCustomerAlertMsg() {
        return outAlertMsgCustomerAlertMsg;
    }

    /**
     * Sets the value of the outAlertMsgCustomerAlertMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAlertMsgCustomerAlertMsg(String value) {
        this.outAlertMsgCustomerAlertMsg = value;
    }

    /**
     * Gets the value of the outAuthCriteriaTeamInformationTrsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAuthCriteriaTeamInformationTrsAmount() {
        return outAuthCriteriaTeamInformationTrsAmount;
    }

    /**
     * Sets the value of the outAuthCriteriaTeamInformationTrsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAuthCriteriaTeamInformationTrsAmount(BigDecimal value) {
        this.outAuthCriteriaTeamInformationTrsAmount = value;
    }

    /**
     * Gets the value of the outAuthCriteriaTeamInformationValueDateSpread property.
     * 
     */
    public short getOutAuthCriteriaTeamInformationValueDateSpread() {
        return outAuthCriteriaTeamInformationValueDateSpread;
    }

    /**
     * Sets the value of the outAuthCriteriaTeamInformationValueDateSpread property.
     * 
     */
    public void setOutAuthCriteriaTeamInformationValueDateSpread(short value) {
        this.outAuthCriteriaTeamInformationValueDateSpread = value;
    }

    /**
     * Gets the value of the outBeneficiaryCustomerAlertMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBeneficiaryCustomerAlertMsg() {
        return outBeneficiaryCustomerAlertMsg;
    }

    /**
     * Sets the value of the outBeneficiaryCustomerAlertMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBeneficiaryCustomerAlertMsg(String value) {
        this.outBeneficiaryCustomerAlertMsg = value;
    }

    /**
     * Gets the value of the outBeneficiaryCustomerCustId property.
     * 
     */
    public int getOutBeneficiaryCustomerCustId() {
        return outBeneficiaryCustomerCustId;
    }

    /**
     * Sets the value of the outBeneficiaryCustomerCustId property.
     * 
     */
    public void setOutBeneficiaryCustomerCustId(int value) {
        this.outBeneficiaryCustomerCustId = value;
    }

    /**
     * Gets the value of the outBeneficiaryCustomerCustStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBeneficiaryCustomerCustStatus() {
        return outBeneficiaryCustomerCustStatus;
    }

    /**
     * Sets the value of the outBeneficiaryCustomerCustStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBeneficiaryCustomerCustStatus(String value) {
        this.outBeneficiaryCustomerCustStatus = value;
    }

    /**
     * Gets the value of the outBeneficiaryCustomerCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBeneficiaryCustomerCustType() {
        return outBeneficiaryCustomerCustType;
    }

    /**
     * Sets the value of the outBeneficiaryCustomerCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBeneficiaryCustomerCustType(String value) {
        this.outBeneficiaryCustomerCustType = value;
    }

    /**
     * Gets the value of the outBeneficiaryCustomerShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBeneficiaryCustomerShortName() {
        return outBeneficiaryCustomerShortName;
    }

    /**
     * Sets the value of the outBeneficiaryCustomerShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBeneficiaryCustomerShortName(String value) {
        this.outBeneficiaryCustomerShortName = value;
    }

    /**
     * Gets the value of the outBeneficiaryNameListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBeneficiaryNameListSetDescription() {
        return outBeneficiaryNameListSetDescription;
    }

    /**
     * Sets the value of the outBeneficiaryNameListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBeneficiaryNameListSetDescription(String value) {
        this.outBeneficiaryNameListSetDescription = value;
    }

    /**
     * Gets the value of the outEvalResultTeamInformationAuthorizationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvalResultTeamInformationAuthorizationType() {
        return outEvalResultTeamInformationAuthorizationType;
    }

    /**
     * Sets the value of the outEvalResultTeamInformationAuthorizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvalResultTeamInformationAuthorizationType(String value) {
        this.outEvalResultTeamInformationAuthorizationType = value;
    }

    /**
     * Gets the value of the outEvalResultTeamInformationEvaluationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvalResultTeamInformationEvaluationResult() {
        return outEvalResultTeamInformationEvaluationResult;
    }

    /**
     * Sets the value of the outEvalResultTeamInformationEvaluationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvalResultTeamInformationEvaluationResult(String value) {
        this.outEvalResultTeamInformationEvaluationResult = value;
    }

    /**
     * Gets the value of the outEvalResultTeamInformationRequiredProfile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvalResultTeamInformationRequiredProfile1() {
        return outEvalResultTeamInformationRequiredProfile1;
    }

    /**
     * Sets the value of the outEvalResultTeamInformationRequiredProfile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvalResultTeamInformationRequiredProfile1(String value) {
        this.outEvalResultTeamInformationRequiredProfile1 = value;
    }

    /**
     * Gets the value of the outEvalResultTeamInformationRequiredProfile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvalResultTeamInformationRequiredProfile2() {
        return outEvalResultTeamInformationRequiredProfile2;
    }

    /**
     * Sets the value of the outEvalResultTeamInformationRequiredProfile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvalResultTeamInformationRequiredProfile2(String value) {
        this.outEvalResultTeamInformationRequiredProfile2 = value;
    }

    /**
     * Gets the value of the outGrpAdviceTotal property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfL0497VOutGrpAdviceTotalItem }
     *     
     */
    public ArrayOfL0497VOutGrpAdviceTotalItem getOutGrpAdviceTotal() {
        return outGrpAdviceTotal;
    }

    /**
     * Sets the value of the outGrpAdviceTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfL0497VOutGrpAdviceTotalItem }
     *     
     */
    public void setOutGrpAdviceTotal(ArrayOfL0497VOutGrpAdviceTotalItem value) {
        this.outGrpAdviceTotal = value;
    }

    /**
     * Gets the value of the outGrpUserTotal property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfL0497VOutGrpUserTotalItem }
     *     
     */
    public ArrayOfL0497VOutGrpUserTotalItem getOutGrpUserTotal() {
        return outGrpUserTotal;
    }

    /**
     * Sets the value of the outGrpUserTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfL0497VOutGrpUserTotalItem }
     *     
     */
    public void setOutGrpUserTotal(ArrayOfL0497VOutGrpUserTotalItem value) {
        this.outGrpUserTotal = value;
    }

    /**
     * Gets the value of the outIdTypeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIdTypeGenericDetailDescription() {
        return outIdTypeGenericDetailDescription;
    }

    /**
     * Sets the value of the outIdTypeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIdTypeGenericDetailDescription(String value) {
        this.outIdTypeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutJustificDescription() {
        return outJustificDescription;
    }

    /**
     * Sets the value of the outJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutJustificDescription(String value) {
        this.outJustificDescription = value;
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
     * Gets the value of the outLnsLoanTrxRecordingITrxComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLnsLoanTrxRecordingITrxComments() {
        return outLnsLoanTrxRecordingITrxComments;
    }

    /**
     * Sets the value of the outLnsLoanTrxRecordingITrxComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLnsLoanTrxRecordingITrxComments(String value) {
        this.outLnsLoanTrxRecordingITrxComments = value;
    }

    /**
     * Gets the value of the outLnsLoanTrxRecordingTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLnsLoanTrxRecordingTmstamp() {
        return outLnsLoanTrxRecordingTmstamp;
    }

    /**
     * Sets the value of the outLnsLoanTrxRecordingTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLnsLoanTrxRecordingTmstamp(XMLGregorianCalendar value) {
        this.outLnsLoanTrxRecordingTmstamp = value;
    }

    /**
     * Gets the value of the outLnsLoanTrxRecordingTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLnsLoanTrxRecordingTrxDate() {
        return outLnsLoanTrxRecordingTrxDate;
    }

    /**
     * Sets the value of the outLnsLoanTrxRecordingTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLnsLoanTrxRecordingTrxDate(XMLGregorianCalendar value) {
        this.outLnsLoanTrxRecordingTrxDate = value;
    }

    /**
     * Gets the value of the outLnsLoanTrxRecordingTrxSn property.
     * 
     */
    public int getOutLnsLoanTrxRecordingTrxSn() {
        return outLnsLoanTrxRecordingTrxSn;
    }

    /**
     * Sets the value of the outLnsLoanTrxRecordingTrxSn property.
     * 
     */
    public void setOutLnsLoanTrxRecordingTrxSn(int value) {
        this.outLnsLoanTrxRecordingTrxSn = value;
    }

    /**
     * Gets the value of the outLnsLoanTrxRecordingTrxUnit property.
     * 
     */
    public int getOutLnsLoanTrxRecordingTrxUnit() {
        return outLnsLoanTrxRecordingTrxUnit;
    }

    /**
     * Sets the value of the outLnsLoanTrxRecordingTrxUnit property.
     * 
     */
    public void setOutLnsLoanTrxRecordingTrxUnit(int value) {
        this.outLnsLoanTrxRecordingTrxUnit = value;
    }

    /**
     * Gets the value of the outLnsLoanTrxRecordingTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLnsLoanTrxRecordingTrxUsr() {
        return outLnsLoanTrxRecordingTrxUsr;
    }

    /**
     * Sets the value of the outLnsLoanTrxRecordingTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLnsLoanTrxRecordingTrxUsr(String value) {
        this.outLnsLoanTrxRecordingTrxUsr = value;
    }

    /**
     * Gets the value of the outLoanAccountAccTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountAccTerms() {
        return outLoanAccountAccTerms;
    }

    /**
     * Sets the value of the outLoanAccountAccTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountAccTerms(String value) {
        this.outLoanAccountAccTerms = value;
    }

    /**
     * Gets the value of the outLoanAccountLoanStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountLoanStatus() {
        return outLoanAccountLoanStatus;
    }

    /**
     * Sets the value of the outLoanAccountLoanStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountLoanStatus(String value) {
        this.outLoanAccountLoanStatus = value;
    }

    /**
     * Gets the value of the outLoanProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanProductDescription() {
        return outLoanProductDescription;
    }

    /**
     * Sets the value of the outLoanProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanProductDescription(String value) {
        this.outLoanProductDescription = value;
    }

    /**
     * Gets the value of the outLoanProductIdProduct property.
     * 
     */
    public int getOutLoanProductIdProduct() {
        return outLoanProductIdProduct;
    }

    /**
     * Sets the value of the outLoanProductIdProduct property.
     * 
     */
    public void setOutLoanProductIdProduct(int value) {
        this.outLoanProductIdProduct = value;
    }

    /**
     * Gets the value of the outMntMntRecordingTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutMntMntRecordingTmstamp() {
        return outMntMntRecordingTmstamp;
    }

    /**
     * Sets the value of the outMntMntRecordingTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutMntMntRecordingTmstamp(XMLGregorianCalendar value) {
        this.outMntMntRecordingTmstamp = value;
    }

    /**
     * Gets the value of the outMntMntRecordingTrxUsrSn property.
     * 
     */
    public int getOutMntMntRecordingTrxUsrSn() {
        return outMntMntRecordingTrxUsrSn;
    }

    /**
     * Sets the value of the outMntMntRecordingTrxUsrSn property.
     * 
     */
    public void setOutMntMntRecordingTrxUsrSn(int value) {
        this.outMntMntRecordingTrxUsrSn = value;
    }

    /**
     * Gets the value of the outNewDateToSpecialAgrWorkValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutNewDateToSpecialAgrWorkValueDate() {
        return outNewDateToSpecialAgrWorkValueDate;
    }

    /**
     * Sets the value of the outNewDateToSpecialAgrWorkValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutNewDateToSpecialAgrWorkValueDate(XMLGregorianCalendar value) {
        this.outNewDateToSpecialAgrWorkValueDate = value;
    }

    /**
     * Gets the value of the outNewNormalAccrualsIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutNewNormalAccrualsIefSuppliedNumber152() {
        return outNewNormalAccrualsIefSuppliedNumber152;
    }

    /**
     * Sets the value of the outNewNormalAccrualsIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutNewNormalAccrualsIefSuppliedNumber152(BigDecimal value) {
        this.outNewNormalAccrualsIefSuppliedNumber152 = value;
    }

    /**
     * Gets the value of the outNewOverdueAccrualsIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutNewOverdueAccrualsIefSuppliedNumber152() {
        return outNewOverdueAccrualsIefSuppliedNumber152;
    }

    /**
     * Sets the value of the outNewOverdueAccrualsIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutNewOverdueAccrualsIefSuppliedNumber152(BigDecimal value) {
        this.outNewOverdueAccrualsIefSuppliedNumber152 = value;
    }

    /**
     * Gets the value of the outOtherIdIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOtherIdIdNo() {
        return outOtherIdIdNo;
    }

    /**
     * Sets the value of the outOtherIdIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOtherIdIdNo(String value) {
        this.outOtherIdIdNo = value;
    }

    /**
     * Gets the value of the outPositiveBalancesLoanAccountInfoBlockedAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutPositiveBalancesLoanAccountInfoBlockedAmn() {
        return outPositiveBalancesLoanAccountInfoBlockedAmn;
    }

    /**
     * Sets the value of the outPositiveBalancesLoanAccountInfoBlockedAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutPositiveBalancesLoanAccountInfoBlockedAmn(BigDecimal value) {
        this.outPositiveBalancesLoanAccountInfoBlockedAmn = value;
    }

    /**
     * Gets the value of the outPositiveBalancesLoanAccountInfoDormantAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutPositiveBalancesLoanAccountInfoDormantAmn() {
        return outPositiveBalancesLoanAccountInfoDormantAmn;
    }

    /**
     * Sets the value of the outPositiveBalancesLoanAccountInfoDormantAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutPositiveBalancesLoanAccountInfoDormantAmn(BigDecimal value) {
        this.outPositiveBalancesLoanAccountInfoDormantAmn = value;
    }

    /**
     * Gets the value of the outPositiveBalancesLoanAccountInfoPositiveAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutPositiveBalancesLoanAccountInfoPositiveAmn() {
        return outPositiveBalancesLoanAccountInfoPositiveAmn;
    }

    /**
     * Sets the value of the outPositiveBalancesLoanAccountInfoPositiveAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutPositiveBalancesLoanAccountInfoPositiveAmn(BigDecimal value) {
        this.outPositiveBalancesLoanAccountInfoPositiveAmn = value;
    }

    /**
     * Gets the value of the outPositiveBalancesLoanAccountInfoUnclearAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutPositiveBalancesLoanAccountInfoUnclearAmn() {
        return outPositiveBalancesLoanAccountInfoUnclearAmn;
    }

    /**
     * Sets the value of the outPositiveBalancesLoanAccountInfoUnclearAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutPositiveBalancesLoanAccountInfoUnclearAmn(BigDecimal value) {
        this.outPositiveBalancesLoanAccountInfoUnclearAmn = value;
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
     * Gets the value of the outResultCurrentLoanRequestConfirmExpireDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutResultCurrentLoanRequestConfirmExpireDt() {
        return outResultCurrentLoanRequestConfirmExpireDt;
    }

    /**
     * Sets the value of the outResultCurrentLoanRequestConfirmExpireDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutResultCurrentLoanRequestConfirmExpireDt(XMLGregorianCalendar value) {
        this.outResultCurrentLoanRequestConfirmExpireDt = value;
    }

    /**
     * Gets the value of the outResultCurrentLoanRequestLstAcrCalcDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutResultCurrentLoanRequestLstAcrCalcDt() {
        return outResultCurrentLoanRequestLstAcrCalcDt;
    }

    /**
     * Sets the value of the outResultCurrentLoanRequestLstAcrCalcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutResultCurrentLoanRequestLstAcrCalcDt(XMLGregorianCalendar value) {
        this.outResultCurrentLoanRequestLstAcrCalcDt = value;
    }

    /**
     * Gets the value of the outResultCurrentLoanRequestNxtOvIntCalcDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutResultCurrentLoanRequestNxtOvIntCalcDt() {
        return outResultCurrentLoanRequestNxtOvIntCalcDt;
    }

    /**
     * Sets the value of the outResultCurrentLoanRequestNxtOvIntCalcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutResultCurrentLoanRequestNxtOvIntCalcDt(XMLGregorianCalendar value) {
        this.outResultCurrentLoanRequestNxtOvIntCalcDt = value;
    }

    /**
     * Gets the value of the outResultCurrentLoanRequestRequestLoanSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultCurrentLoanRequestRequestLoanSts() {
        return outResultCurrentLoanRequestRequestLoanSts;
    }

    /**
     * Sets the value of the outResultCurrentLoanRequestRequestLoanSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultCurrentLoanRequestRequestLoanSts(String value) {
        this.outResultCurrentLoanRequestRequestLoanSts = value;
    }

    /**
     * Gets the value of the outResultCurrentLoanRequestRequestSn property.
     * 
     */
    public short getOutResultCurrentLoanRequestRequestSn() {
        return outResultCurrentLoanRequestRequestSn;
    }

    /**
     * Sets the value of the outResultCurrentLoanRequestRequestSn property.
     * 
     */
    public void setOutResultCurrentLoanRequestRequestSn(short value) {
        this.outResultCurrentLoanRequestRequestSn = value;
    }

    /**
     * Gets the value of the outResultCurrentLoanRequestRequestSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultCurrentLoanRequestRequestSts() {
        return outResultCurrentLoanRequestRequestSts;
    }

    /**
     * Sets the value of the outResultCurrentLoanRequestRequestSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultCurrentLoanRequestRequestSts(String value) {
        this.outResultCurrentLoanRequestRequestSts = value;
    }

    /**
     * Gets the value of the outResultCurrentLoanRequestRequestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultCurrentLoanRequestRequestType() {
        return outResultCurrentLoanRequestRequestType;
    }

    /**
     * Sets the value of the outResultCurrentLoanRequestRequestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultCurrentLoanRequestRequestType(String value) {
        this.outResultCurrentLoanRequestRequestType = value;
    }

    /**
     * Gets the value of the outResultCurrentLoanRequestRqAcrNrmIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutResultCurrentLoanRequestRqAcrNrmIntBal() {
        return outResultCurrentLoanRequestRqAcrNrmIntBal;
    }

    /**
     * Sets the value of the outResultCurrentLoanRequestRqAcrNrmIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutResultCurrentLoanRequestRqAcrNrmIntBal(BigDecimal value) {
        this.outResultCurrentLoanRequestRqAcrNrmIntBal = value;
    }

    /**
     * Gets the value of the outResultCurrentLoanRequestRqAcrPnlIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutResultCurrentLoanRequestRqAcrPnlIntBal() {
        return outResultCurrentLoanRequestRqAcrPnlIntBal;
    }

    /**
     * Sets the value of the outResultCurrentLoanRequestRqAcrPnlIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutResultCurrentLoanRequestRqAcrPnlIntBal(BigDecimal value) {
        this.outResultCurrentLoanRequestRqAcrPnlIntBal = value;
    }

    /**
     * Gets the value of the outResultCurrentLoanRequestRqAcrPubIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutResultCurrentLoanRequestRqAcrPubIntAmn() {
        return outResultCurrentLoanRequestRqAcrPubIntAmn;
    }

    /**
     * Sets the value of the outResultCurrentLoanRequestRqAcrPubIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutResultCurrentLoanRequestRqAcrPubIntAmn(BigDecimal value) {
        this.outResultCurrentLoanRequestRqAcrPubIntAmn = value;
    }

    /**
     * Gets the value of the outResultCurrentLoanRequestRqCapitalBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutResultCurrentLoanRequestRqCapitalBal() {
        return outResultCurrentLoanRequestRqCapitalBal;
    }

    /**
     * Sets the value of the outResultCurrentLoanRequestRqCapitalBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutResultCurrentLoanRequestRqCapitalBal(BigDecimal value) {
        this.outResultCurrentLoanRequestRqCapitalBal = value;
    }

    /**
     * Gets the value of the outResultCurrentLoanRequestRqComBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutResultCurrentLoanRequestRqComBal() {
        return outResultCurrentLoanRequestRqComBal;
    }

    /**
     * Sets the value of the outResultCurrentLoanRequestRqComBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutResultCurrentLoanRequestRqComBal(BigDecimal value) {
        this.outResultCurrentLoanRequestRqComBal = value;
    }

    /**
     * Gets the value of the outResultCurrentLoanRequestRqCreationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutResultCurrentLoanRequestRqCreationDt() {
        return outResultCurrentLoanRequestRqCreationDt;
    }

    /**
     * Sets the value of the outResultCurrentLoanRequestRqCreationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutResultCurrentLoanRequestRqCreationDt(XMLGregorianCalendar value) {
        this.outResultCurrentLoanRequestRqCreationDt = value;
    }

    /**
     * Gets the value of the outResultCurrentLoanRequestRqExpBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutResultCurrentLoanRequestRqExpBal() {
        return outResultCurrentLoanRequestRqExpBal;
    }

    /**
     * Sets the value of the outResultCurrentLoanRequestRqExpBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutResultCurrentLoanRequestRqExpBal(BigDecimal value) {
        this.outResultCurrentLoanRequestRqExpBal = value;
    }

    /**
     * Gets the value of the outResultCurrentLoanRequestRqExpireDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutResultCurrentLoanRequestRqExpireDt() {
        return outResultCurrentLoanRequestRqExpireDt;
    }

    /**
     * Sets the value of the outResultCurrentLoanRequestRqExpireDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutResultCurrentLoanRequestRqExpireDt(XMLGregorianCalendar value) {
        this.outResultCurrentLoanRequestRqExpireDt = value;
    }

    /**
     * Gets the value of the outResultCurrentLoanRequestRqRlNrmIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutResultCurrentLoanRequestRqRlNrmIntBal() {
        return outResultCurrentLoanRequestRqRlNrmIntBal;
    }

    /**
     * Sets the value of the outResultCurrentLoanRequestRqRlNrmIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutResultCurrentLoanRequestRqRlNrmIntBal(BigDecimal value) {
        this.outResultCurrentLoanRequestRqRlNrmIntBal = value;
    }

    /**
     * Gets the value of the outResultCurrentLoanRequestRqRlPnlIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutResultCurrentLoanRequestRqRlPnlIntBal() {
        return outResultCurrentLoanRequestRqRlPnlIntBal;
    }

    /**
     * Sets the value of the outResultCurrentLoanRequestRqRlPnlIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutResultCurrentLoanRequestRqRlPnlIntBal(BigDecimal value) {
        this.outResultCurrentLoanRequestRqRlPnlIntBal = value;
    }

    /**
     * Gets the value of the outResultCurrentLoanRequestRqSubsidyBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutResultCurrentLoanRequestRqSubsidyBal() {
        return outResultCurrentLoanRequestRqSubsidyBal;
    }

    /**
     * Sets the value of the outResultCurrentLoanRequestRqSubsidyBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutResultCurrentLoanRequestRqSubsidyBal(BigDecimal value) {
        this.outResultCurrentLoanRequestRqSubsidyBal = value;
    }

    /**
     * Gets the value of the outResultCurrentLoanRequestRqUrlNrmIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutResultCurrentLoanRequestRqUrlNrmIntBal() {
        return outResultCurrentLoanRequestRqUrlNrmIntBal;
    }

    /**
     * Sets the value of the outResultCurrentLoanRequestRqUrlNrmIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutResultCurrentLoanRequestRqUrlNrmIntBal(BigDecimal value) {
        this.outResultCurrentLoanRequestRqUrlNrmIntBal = value;
    }

    /**
     * Gets the value of the outResultCurrentLoanRequestRqUrlPnlIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutResultCurrentLoanRequestRqUrlPnlIntBal() {
        return outResultCurrentLoanRequestRqUrlPnlIntBal;
    }

    /**
     * Sets the value of the outResultCurrentLoanRequestRqUrlPnlIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutResultCurrentLoanRequestRqUrlPnlIntBal(BigDecimal value) {
        this.outResultCurrentLoanRequestRqUrlPnlIntBal = value;
    }

    /**
     * Gets the value of the outResultCurrentLoanRequestRqUrlPubIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutResultCurrentLoanRequestRqUrlPubIntAmn() {
        return outResultCurrentLoanRequestRqUrlPubIntAmn;
    }

    /**
     * Sets the value of the outResultCurrentLoanRequestRqUrlPubIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutResultCurrentLoanRequestRqUrlPubIntAmn(BigDecimal value) {
        this.outResultCurrentLoanRequestRqUrlPubIntAmn = value;
    }

    /**
     * Gets the value of the outResultCurrentLoanRequestTmpstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutResultCurrentLoanRequestTmpstamp() {
        return outResultCurrentLoanRequestTmpstamp;
    }

    /**
     * Sets the value of the outResultCurrentLoanRequestTmpstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutResultCurrentLoanRequestTmpstamp(XMLGregorianCalendar value) {
        this.outResultCurrentLoanRequestTmpstamp = value;
    }

    /**
     * Gets the value of the outResultCurrentLoanRequestUnpaidCollCnt property.
     * 
     */
    public short getOutResultCurrentLoanRequestUnpaidCollCnt() {
        return outResultCurrentLoanRequestUnpaidCollCnt;
    }

    /**
     * Sets the value of the outResultCurrentLoanRequestUnpaidCollCnt property.
     * 
     */
    public void setOutResultCurrentLoanRequestUnpaidCollCnt(short value) {
        this.outResultCurrentLoanRequestUnpaidCollCnt = value;
    }

    /**
     * Gets the value of the outSuccessTransSuccessfulTransactionWorkAccountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuccessTransSuccessfulTransactionWorkAccountNo() {
        return outSuccessTransSuccessfulTransactionWorkAccountNo;
    }

    /**
     * Sets the value of the outSuccessTransSuccessfulTransactionWorkAccountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuccessTransSuccessfulTransactionWorkAccountNo(String value) {
        this.outSuccessTransSuccessfulTransactionWorkAccountNo = value;
    }

    /**
     * Gets the value of the outSuccessTransSuccessfulTransactionWorkAgreementNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuccessTransSuccessfulTransactionWorkAgreementNo() {
        return outSuccessTransSuccessfulTransactionWorkAgreementNo;
    }

    /**
     * Sets the value of the outSuccessTransSuccessfulTransactionWorkAgreementNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuccessTransSuccessfulTransactionWorkAgreementNo(String value) {
        this.outSuccessTransSuccessfulTransactionWorkAgreementNo = value;
    }

    /**
     * Gets the value of the outSuccessTransSuccessfulTransactionWorkCustomer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuccessTransSuccessfulTransactionWorkCustomer1() {
        return outSuccessTransSuccessfulTransactionWorkCustomer1;
    }

    /**
     * Sets the value of the outSuccessTransSuccessfulTransactionWorkCustomer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuccessTransSuccessfulTransactionWorkCustomer1(String value) {
        this.outSuccessTransSuccessfulTransactionWorkCustomer1 = value;
    }

    /**
     * Gets the value of the outSuccessTransSuccessfulTransactionWorkCustomer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuccessTransSuccessfulTransactionWorkCustomer2() {
        return outSuccessTransSuccessfulTransactionWorkCustomer2;
    }

    /**
     * Sets the value of the outSuccessTransSuccessfulTransactionWorkCustomer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuccessTransSuccessfulTransactionWorkCustomer2(String value) {
        this.outSuccessTransSuccessfulTransactionWorkCustomer2 = value;
    }

    /**
     * Gets the value of the outSuccessTransSuccessfulTransactionWorkIdProduct property.
     * 
     */
    public int getOutSuccessTransSuccessfulTransactionWorkIdProduct() {
        return outSuccessTransSuccessfulTransactionWorkIdProduct;
    }

    /**
     * Sets the value of the outSuccessTransSuccessfulTransactionWorkIdProduct property.
     * 
     */
    public void setOutSuccessTransSuccessfulTransactionWorkIdProduct(int value) {
        this.outSuccessTransSuccessfulTransactionWorkIdProduct = value;
    }

    /**
     * Gets the value of the outSuccessTransSuccessfulTransactionWorkOldAccountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuccessTransSuccessfulTransactionWorkOldAccountNo() {
        return outSuccessTransSuccessfulTransactionWorkOldAccountNo;
    }

    /**
     * Sets the value of the outSuccessTransSuccessfulTransactionWorkOldAccountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuccessTransSuccessfulTransactionWorkOldAccountNo(String value) {
        this.outSuccessTransSuccessfulTransactionWorkOldAccountNo = value;
    }

    /**
     * Gets the value of the outSuccessTransSuccessfulTransactionWorkProdDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuccessTransSuccessfulTransactionWorkProdDescription() {
        return outSuccessTransSuccessfulTransactionWorkProdDescription;
    }

    /**
     * Sets the value of the outSuccessTransSuccessfulTransactionWorkProdDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuccessTransSuccessfulTransactionWorkProdDescription(String value) {
        this.outSuccessTransSuccessfulTransactionWorkProdDescription = value;
    }

    /**
     * Gets the value of the outSuccessTransSuccessfulTransactionWorkRepresentativeTermsLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuccessTransSuccessfulTransactionWorkRepresentativeTermsLine1() {
        return outSuccessTransSuccessfulTransactionWorkRepresentativeTermsLine1;
    }

    /**
     * Sets the value of the outSuccessTransSuccessfulTransactionWorkRepresentativeTermsLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuccessTransSuccessfulTransactionWorkRepresentativeTermsLine1(String value) {
        this.outSuccessTransSuccessfulTransactionWorkRepresentativeTermsLine1 = value;
    }

    /**
     * Gets the value of the outSuccessTransSuccessfulTransactionWorkRepresentativeTermsLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuccessTransSuccessfulTransactionWorkRepresentativeTermsLine2() {
        return outSuccessTransSuccessfulTransactionWorkRepresentativeTermsLine2;
    }

    /**
     * Sets the value of the outSuccessTransSuccessfulTransactionWorkRepresentativeTermsLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuccessTransSuccessfulTransactionWorkRepresentativeTermsLine2(String value) {
        this.outSuccessTransSuccessfulTransactionWorkRepresentativeTermsLine2 = value;
    }

    /**
     * Gets the value of the outSuccessTransSuccessfulTransactionWorkRqExpireDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSuccessTransSuccessfulTransactionWorkRqExpireDt() {
        return outSuccessTransSuccessfulTransactionWorkRqExpireDt;
    }

    /**
     * Sets the value of the outSuccessTransSuccessfulTransactionWorkRqExpireDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSuccessTransSuccessfulTransactionWorkRqExpireDt(XMLGregorianCalendar value) {
        this.outSuccessTransSuccessfulTransactionWorkRqExpireDt = value;
    }

    /**
     * Gets the value of the outSuccessTransSuccessfulTransactionWorkRqExpireDtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuccessTransSuccessfulTransactionWorkRqExpireDtDesc() {
        return outSuccessTransSuccessfulTransactionWorkRqExpireDtDesc;
    }

    /**
     * Sets the value of the outSuccessTransSuccessfulTransactionWorkRqExpireDtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuccessTransSuccessfulTransactionWorkRqExpireDtDesc(String value) {
        this.outSuccessTransSuccessfulTransactionWorkRqExpireDtDesc = value;
    }

    /**
     * Gets the value of the outSuccessTransSuccessfulTransactionWorkValeurDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSuccessTransSuccessfulTransactionWorkValeurDt() {
        return outSuccessTransSuccessfulTransactionWorkValeurDt;
    }

    /**
     * Sets the value of the outSuccessTransSuccessfulTransactionWorkValeurDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSuccessTransSuccessfulTransactionWorkValeurDt(XMLGregorianCalendar value) {
        this.outSuccessTransSuccessfulTransactionWorkValeurDt = value;
    }

    /**
     * Gets the value of the outTotalOwedIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalOwedIefSuppliedAmount() {
        return outTotalOwedIefSuppliedAmount;
    }

    /**
     * Sets the value of the outTotalOwedIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalOwedIefSuppliedAmount(BigDecimal value) {
        this.outTotalOwedIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the outTrxCountersTrxCountAdvCounter property.
     * 
     */
    public int getOutTrxCountersTrxCountAdvCounter() {
        return outTrxCountersTrxCountAdvCounter;
    }

    /**
     * Sets the value of the outTrxCountersTrxCountAdvCounter property.
     * 
     */
    public void setOutTrxCountersTrxCountAdvCounter(int value) {
        this.outTrxCountersTrxCountAdvCounter = value;
    }

    /**
     * Gets the value of the outTrxCountersTrxCountTrxCounter property.
     * 
     */
    public int getOutTrxCountersTrxCountTrxCounter() {
        return outTrxCountersTrxCountTrxCounter;
    }

    /**
     * Sets the value of the outTrxCountersTrxCountTrxCounter property.
     * 
     */
    public void setOutTrxCountersTrxCountTrxCounter(int value) {
        this.outTrxCountersTrxCountTrxCounter = value;
    }

    /**
     * Gets the value of the outVoucherLineParVoucherRunVoucherLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutVoucherLineParVoucherRunVoucherLine() {
        return outVoucherLineParVoucherRunVoucherLine;
    }

    /**
     * Sets the value of the outVoucherLineParVoucherRunVoucherLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutVoucherLineParVoucherRunVoucherLine(String value) {
        this.outVoucherLineParVoucherRunVoucherLine = value;
    }

    /**
     * Gets the value of the outInsuranceBalanceIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutInsuranceBalanceIefSuppliedAmount() {
        return outInsuranceBalanceIefSuppliedAmount;
    }

    /**
     * Sets the value of the outInsuranceBalanceIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutInsuranceBalanceIefSuppliedAmount(BigDecimal value) {
        this.outInsuranceBalanceIefSuppliedAmount = value;
    }

}
