
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BI1634VDhsseclearingExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BI1634VDhsseclearingExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutAccCurrencyCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAccCurrencyCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAcccodeDescCharSuppliedChar100" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAccodeDhsseIncomingAccCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAccountUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBillParametersClearingSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutChequeBookItemItemSerialNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutCollaborationBankBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCommissionFoundIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerTelephone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepTrxRecordingAccAmount2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepTrxRecordingAccAmount3" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepTrxRecordingAccAmount4" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepTrxRecordingAccAmount5" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepTrxRecordingAccAmount6" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepTrxRecordingGlAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepTrxRecordingOEnchroachToller" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepTrxRecordingOFinalAccAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepTrxRecordingTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepTrxRecordingTunInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepTrxRecordingUUserTotalsAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDhsseInterfaceAccCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIdentifierDhsseIncomingIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedSrvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastDhsseIncomingChqNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMoreRecordsIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutParVoucherRunVoucherLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProfitsExitStateWorkActualMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProfitsExitStateWorkId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutProfitsExitStateWorkLanguage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProfitsExitStateWorkMessageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProfitsExitStateWorkPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProfitsExitStateWorkRoutineSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutProfitsExitStateWorkTerminationAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProfitsExitStateWorkTraceChar80" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProfitsExitStateWorkValruleId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutProfitsExitStateWorkValruleSnum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutReadOnlyFlgIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuccessfulTransactionWorkAdviceCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationAccSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationAccUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationAccountBenefAddressSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationAccountCobenefSnMail" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationAccountCode" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutTeamInformationAccountHomeBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationAccountPsbSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationAuthorisationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationAuthorisationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationAuthorizationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationAuthorizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationAvailableDateSpread" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationBankDraftNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationBeneficiarySn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationBlockTransactExpDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTeamInformationChargeDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationCheqAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationCheqIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTeamInformationCheqStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationCommissionDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationCrInterestId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationCrInterestPer" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationCreditInterestRateSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationCustomerCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationDbInterestId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationDbInterestPer" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationDebitInterestRateSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationDepAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationEncroachTolerance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationEvaluationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationFromCheqCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationFromCheqItemSerialNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutTeamInformationInterestRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationJustificationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationJustificationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationLoanStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationNotifSpreadDayB" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationNotifSpreadDays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationOverdraftAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationOverdraftSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationPenaltyDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationPenaltyRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationRepresentativeSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationRestrictAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationServicePenaltySpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationStatementIssFreq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationSuper1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationSuper1TerminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationSuper2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationSuper2TerminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationTeamComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationToCheqCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationToCheqItemSerialNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
 *         &lt;element name="OutTeamInformationWithdrawAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationWthdrawSpread" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTmstampDhsseIncomingOnlTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTrxCountAdvCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTrxCountTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTrxCountUsrStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIncoming" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfBI1634VOutGrpIncomingItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BI1634VDhsseclearingExport", propOrder = {
    "outAccCurrencyCurrencyIdCurrency",
    "outAccCurrencyCurrencyShortDescr",
    "outAcccodeDescCharSuppliedChar100",
    "outAccodeDhsseIncomingAccCode",
    "outAccountUnitCode",
    "outBillParametersClearingSystem",
    "outChequeBookItemItemSerialNumber",
    "outCollaborationBankBankName",
    "outCommissionFoundIefSuppliedFlag",
    "outCustAddressTelephone",
    "outCustomerFirstName",
    "outCustomerSurname",
    "outCustomerTelephone1",
    "outDepTrxRecordingAccAmount2",
    "outDepTrxRecordingAccAmount3",
    "outDepTrxRecordingAccAmount4",
    "outDepTrxRecordingAccAmount5",
    "outDepTrxRecordingAccAmount6",
    "outDepTrxRecordingGlAcc",
    "outDepTrxRecordingOEnchroachToller",
    "outDepTrxRecordingOFinalAccAmount",
    "outDepTrxRecordingTrxUsrSn",
    "outDepTrxRecordingTunInternalSn",
    "outDepTrxRecordingUUserTotalsAmn",
    "outDhsseInterfaceAccCode",
    "outGenericDetailDescription",
    "outGenericDetailSerialNum",
    "outIdentifierDhsseIncomingIdentifier",
    "outIefSuppliedActionEntryDesc",
    "outIefSuppliedSrvStatus",
    "outLastDhsseIncomingChqNo",
    "outMoreRecordsIefSuppliedFlag",
    "outParVoucherRunVoucherLine",
    "outProfitsExitStateWorkActualMessage",
    "outProfitsExitStateWorkId",
    "outProfitsExitStateWorkLanguage",
    "outProfitsExitStateWorkMessageType",
    "outProfitsExitStateWorkPrftSystem",
    "outProfitsExitStateWorkRoutineSn",
    "outProfitsExitStateWorkTerminationAction",
    "outProfitsExitStateWorkTraceChar80",
    "outProfitsExitStateWorkValruleId",
    "outProfitsExitStateWorkValruleSnum",
    "outReadOnlyFlgIefSuppliedFlag",
    "outSuccessfulTransactionWorkAdviceCounter",
    "outTeamInformationAccCd",
    "outTeamInformationAccSn",
    "outTeamInformationAccType",
    "outTeamInformationAccUnitCode",
    "outTeamInformationAccountBenefAddressSn",
    "outTeamInformationAccountCobenefSnMail",
    "outTeamInformationAccountCode",
    "outTeamInformationAccountHomeBranch",
    "outTeamInformationAccountPsbSn",
    "outTeamInformationAuthorisationResult",
    "outTeamInformationAuthorisationType",
    "outTeamInformationAuthorizationResult",
    "outTeamInformationAuthorizationType",
    "outTeamInformationAvailableDateSpread",
    "outTeamInformationBankDraftNo",
    "outTeamInformationBeneficiarySn",
    "outTeamInformationBlockTransactExpDate",
    "outTeamInformationChargeDiscount",
    "outTeamInformationCheqAmount",
    "outTeamInformationCheqIssueDate",
    "outTeamInformationCheqStatus",
    "outTeamInformationCommissionDiscount",
    "outTeamInformationCrInterestId",
    "outTeamInformationCrInterestPer",
    "outTeamInformationCreditInterestRateSpread",
    "outTeamInformationCustomerCode",
    "outTeamInformationCustomerSurname",
    "outTeamInformationDbInterestId",
    "outTeamInformationDbInterestPer",
    "outTeamInformationDebitInterestRateSpread",
    "outTeamInformationDepAccStatus",
    "outTeamInformationEncroachTolerance",
    "outTeamInformationEvaluationResult",
    "outTeamInformationFromCheqCd",
    "outTeamInformationFromCheqItemSerialNum",
    "outTeamInformationInterestRate",
    "outTeamInformationJustificationDescription",
    "outTeamInformationJustificationId",
    "outTeamInformationLoanStatus",
    "outTeamInformationNotifSpreadDayB",
    "outTeamInformationNotifSpreadDays",
    "outTeamInformationOverdraftAmount",
    "outTeamInformationOverdraftSpread",
    "outTeamInformationPenaltyDiscount",
    "outTeamInformationPenaltyRate",
    "outTeamInformationProductDescription",
    "outTeamInformationProductId",
    "outTeamInformationRepresentativeSn",
    "outTeamInformationRequiredProfile1",
    "outTeamInformationRequiredProfile2",
    "outTeamInformationRestrictAccFlag",
    "outTeamInformationServicePenaltySpread",
    "outTeamInformationStatementIssFreq",
    "outTeamInformationSuper1Code",
    "outTeamInformationSuper1TerminalId",
    "outTeamInformationSuper2Code",
    "outTeamInformationSuper2TerminalId",
    "outTeamInformationTeamComments",
    "outTeamInformationToCheqCd",
    "outTeamInformationToCheqItemSerialNum",
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
    "outTeamInformationWithdrawAmnt",
    "outTeamInformationWthdrawSpread",
    "outTmstampDhsseIncomingOnlTmstamp",
    "outTrxCountAdvCounter",
    "outTrxCountTrxCounter",
    "outTrxCountTrxDate",
    "outTrxCountUsrStatus",
    "outUnitCode",
    "outUnitUnitName",
    "outGrpIncoming"
})
public class BI1634VDhsseclearingExport
    extends BaseExport
{

    @XmlElement(name = "OutAccCurrencyCurrencyIdCurrency")
    protected int outAccCurrencyCurrencyIdCurrency;
    @XmlElement(name = "OutAccCurrencyCurrencyShortDescr")
    protected String outAccCurrencyCurrencyShortDescr;
    @XmlElement(name = "OutAcccodeDescCharSuppliedChar100")
    protected String outAcccodeDescCharSuppliedChar100;
    @XmlElement(name = "OutAccodeDhsseIncomingAccCode")
    protected String outAccodeDhsseIncomingAccCode;
    @XmlElement(name = "OutAccountUnitCode")
    protected int outAccountUnitCode;
    @XmlElement(name = "OutBillParametersClearingSystem")
    protected String outBillParametersClearingSystem;
    @XmlElement(name = "OutChequeBookItemItemSerialNumber")
    protected double outChequeBookItemItemSerialNumber;
    @XmlElement(name = "OutCollaborationBankBankName")
    protected String outCollaborationBankBankName;
    @XmlElement(name = "OutCommissionFoundIefSuppliedFlag")
    protected String outCommissionFoundIefSuppliedFlag;
    @XmlElement(name = "OutCustAddressTelephone")
    protected String outCustAddressTelephone;
    @XmlElement(name = "OutCustomerFirstName")
    protected String outCustomerFirstName;
    @XmlElement(name = "OutCustomerSurname")
    protected String outCustomerSurname;
    @XmlElement(name = "OutCustomerTelephone1")
    protected String outCustomerTelephone1;
    @XmlElement(name = "OutDepTrxRecordingAccAmount2", required = true)
    protected BigDecimal outDepTrxRecordingAccAmount2;
    @XmlElement(name = "OutDepTrxRecordingAccAmount3", required = true)
    protected BigDecimal outDepTrxRecordingAccAmount3;
    @XmlElement(name = "OutDepTrxRecordingAccAmount4", required = true)
    protected BigDecimal outDepTrxRecordingAccAmount4;
    @XmlElement(name = "OutDepTrxRecordingAccAmount5", required = true)
    protected BigDecimal outDepTrxRecordingAccAmount5;
    @XmlElement(name = "OutDepTrxRecordingAccAmount6", required = true)
    protected BigDecimal outDepTrxRecordingAccAmount6;
    @XmlElement(name = "OutDepTrxRecordingGlAcc")
    protected String outDepTrxRecordingGlAcc;
    @XmlElement(name = "OutDepTrxRecordingOEnchroachToller", required = true)
    protected BigDecimal outDepTrxRecordingOEnchroachToller;
    @XmlElement(name = "OutDepTrxRecordingOFinalAccAmount", required = true)
    protected BigDecimal outDepTrxRecordingOFinalAccAmount;
    @XmlElement(name = "OutDepTrxRecordingTrxUsrSn")
    protected int outDepTrxRecordingTrxUsrSn;
    @XmlElement(name = "OutDepTrxRecordingTunInternalSn")
    protected short outDepTrxRecordingTunInternalSn;
    @XmlElement(name = "OutDepTrxRecordingUUserTotalsAmn", required = true)
    protected BigDecimal outDepTrxRecordingUUserTotalsAmn;
    @XmlElement(name = "OutDhsseInterfaceAccCode")
    protected String outDhsseInterfaceAccCode;
    @XmlElement(name = "OutGenericDetailDescription")
    protected String outGenericDetailDescription;
    @XmlElement(name = "OutGenericDetailSerialNum")
    protected int outGenericDetailSerialNum;
    @XmlElement(name = "OutIdentifierDhsseIncomingIdentifier")
    protected int outIdentifierDhsseIncomingIdentifier;
    @XmlElement(name = "OutIefSuppliedActionEntryDesc")
    protected String outIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutIefSuppliedSrvStatus")
    protected String outIefSuppliedSrvStatus;
    @XmlElement(name = "OutLastDhsseIncomingChqNo")
    protected String outLastDhsseIncomingChqNo;
    @XmlElement(name = "OutMoreRecordsIefSuppliedFlag")
    protected String outMoreRecordsIefSuppliedFlag;
    @XmlElement(name = "OutParVoucherRunVoucherLine")
    protected String outParVoucherRunVoucherLine;
    @XmlElement(name = "OutProfitsExitStateWorkActualMessage")
    protected String outProfitsExitStateWorkActualMessage;
    @XmlElement(name = "OutProfitsExitStateWorkId")
    protected double outProfitsExitStateWorkId;
    @XmlElement(name = "OutProfitsExitStateWorkLanguage")
    protected int outProfitsExitStateWorkLanguage;
    @XmlElement(name = "OutProfitsExitStateWorkMessageType")
    protected String outProfitsExitStateWorkMessageType;
    @XmlElement(name = "OutProfitsExitStateWorkPrftSystem")
    protected short outProfitsExitStateWorkPrftSystem;
    @XmlElement(name = "OutProfitsExitStateWorkRoutineSn")
    protected double outProfitsExitStateWorkRoutineSn;
    @XmlElement(name = "OutProfitsExitStateWorkTerminationAction")
    protected String outProfitsExitStateWorkTerminationAction;
    @XmlElement(name = "OutProfitsExitStateWorkTraceChar80")
    protected String outProfitsExitStateWorkTraceChar80;
    @XmlElement(name = "OutProfitsExitStateWorkValruleId")
    protected double outProfitsExitStateWorkValruleId;
    @XmlElement(name = "OutProfitsExitStateWorkValruleSnum")
    protected int outProfitsExitStateWorkValruleSnum;
    @XmlElement(name = "OutReadOnlyFlgIefSuppliedFlag")
    protected String outReadOnlyFlgIefSuppliedFlag;
    @XmlElement(name = "OutSuccessfulTransactionWorkAdviceCounter")
    protected int outSuccessfulTransactionWorkAdviceCounter;
    @XmlElement(name = "OutTeamInformationAccCd")
    protected short outTeamInformationAccCd;
    @XmlElement(name = "OutTeamInformationAccSn")
    protected int outTeamInformationAccSn;
    @XmlElement(name = "OutTeamInformationAccType")
    protected short outTeamInformationAccType;
    @XmlElement(name = "OutTeamInformationAccUnitCode")
    protected int outTeamInformationAccUnitCode;
    @XmlElement(name = "OutTeamInformationAccountBenefAddressSn")
    protected short outTeamInformationAccountBenefAddressSn;
    @XmlElement(name = "OutTeamInformationAccountCobenefSnMail")
    protected short outTeamInformationAccountCobenefSnMail;
    @XmlElement(name = "OutTeamInformationAccountCode")
    protected double outTeamInformationAccountCode;
    @XmlElement(name = "OutTeamInformationAccountHomeBranch")
    protected String outTeamInformationAccountHomeBranch;
    @XmlElement(name = "OutTeamInformationAccountPsbSn")
    protected int outTeamInformationAccountPsbSn;
    @XmlElement(name = "OutTeamInformationAuthorisationResult")
    protected String outTeamInformationAuthorisationResult;
    @XmlElement(name = "OutTeamInformationAuthorisationType")
    protected String outTeamInformationAuthorisationType;
    @XmlElement(name = "OutTeamInformationAuthorizationResult")
    protected String outTeamInformationAuthorizationResult;
    @XmlElement(name = "OutTeamInformationAuthorizationType")
    protected String outTeamInformationAuthorizationType;
    @XmlElement(name = "OutTeamInformationAvailableDateSpread")
    protected short outTeamInformationAvailableDateSpread;
    @XmlElement(name = "OutTeamInformationBankDraftNo")
    protected String outTeamInformationBankDraftNo;
    @XmlElement(name = "OutTeamInformationBeneficiarySn")
    protected short outTeamInformationBeneficiarySn;
    @XmlElement(name = "OutTeamInformationBlockTransactExpDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTeamInformationBlockTransactExpDate;
    @XmlElement(name = "OutTeamInformationChargeDiscount", required = true)
    protected BigDecimal outTeamInformationChargeDiscount;
    @XmlElement(name = "OutTeamInformationCheqAmount", required = true)
    protected BigDecimal outTeamInformationCheqAmount;
    @XmlElement(name = "OutTeamInformationCheqIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTeamInformationCheqIssueDate;
    @XmlElement(name = "OutTeamInformationCheqStatus")
    protected String outTeamInformationCheqStatus;
    @XmlElement(name = "OutTeamInformationCommissionDiscount", required = true)
    protected BigDecimal outTeamInformationCommissionDiscount;
    @XmlElement(name = "OutTeamInformationCrInterestId")
    protected int outTeamInformationCrInterestId;
    @XmlElement(name = "OutTeamInformationCrInterestPer", required = true)
    protected BigDecimal outTeamInformationCrInterestPer;
    @XmlElement(name = "OutTeamInformationCreditInterestRateSpread", required = true)
    protected BigDecimal outTeamInformationCreditInterestRateSpread;
    @XmlElement(name = "OutTeamInformationCustomerCode")
    protected int outTeamInformationCustomerCode;
    @XmlElement(name = "OutTeamInformationCustomerSurname")
    protected String outTeamInformationCustomerSurname;
    @XmlElement(name = "OutTeamInformationDbInterestId")
    protected int outTeamInformationDbInterestId;
    @XmlElement(name = "OutTeamInformationDbInterestPer", required = true)
    protected BigDecimal outTeamInformationDbInterestPer;
    @XmlElement(name = "OutTeamInformationDebitInterestRateSpread", required = true)
    protected BigDecimal outTeamInformationDebitInterestRateSpread;
    @XmlElement(name = "OutTeamInformationDepAccStatus")
    protected String outTeamInformationDepAccStatus;
    @XmlElement(name = "OutTeamInformationEncroachTolerance", required = true)
    protected BigDecimal outTeamInformationEncroachTolerance;
    @XmlElement(name = "OutTeamInformationEvaluationResult")
    protected String outTeamInformationEvaluationResult;
    @XmlElement(name = "OutTeamInformationFromCheqCd")
    protected short outTeamInformationFromCheqCd;
    @XmlElement(name = "OutTeamInformationFromCheqItemSerialNum")
    protected double outTeamInformationFromCheqItemSerialNum;
    @XmlElement(name = "OutTeamInformationInterestRate", required = true)
    protected BigDecimal outTeamInformationInterestRate;
    @XmlElement(name = "OutTeamInformationJustificationDescription")
    protected String outTeamInformationJustificationDescription;
    @XmlElement(name = "OutTeamInformationJustificationId")
    protected int outTeamInformationJustificationId;
    @XmlElement(name = "OutTeamInformationLoanStatus")
    protected String outTeamInformationLoanStatus;
    @XmlElement(name = "OutTeamInformationNotifSpreadDayB")
    protected short outTeamInformationNotifSpreadDayB;
    @XmlElement(name = "OutTeamInformationNotifSpreadDays")
    protected short outTeamInformationNotifSpreadDays;
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
    @XmlElement(name = "OutTeamInformationRepresentativeSn")
    protected short outTeamInformationRepresentativeSn;
    @XmlElement(name = "OutTeamInformationRequiredProfile1")
    protected String outTeamInformationRequiredProfile1;
    @XmlElement(name = "OutTeamInformationRequiredProfile2")
    protected String outTeamInformationRequiredProfile2;
    @XmlElement(name = "OutTeamInformationRestrictAccFlag")
    protected String outTeamInformationRestrictAccFlag;
    @XmlElement(name = "OutTeamInformationServicePenaltySpread", required = true)
    protected BigDecimal outTeamInformationServicePenaltySpread;
    @XmlElement(name = "OutTeamInformationStatementIssFreq")
    protected String outTeamInformationStatementIssFreq;
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
    @XmlElement(name = "OutTeamInformationToCheqCd")
    protected short outTeamInformationToCheqCd;
    @XmlElement(name = "OutTeamInformationToCheqItemSerialNum")
    protected double outTeamInformationToCheqItemSerialNum;
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
    @XmlElement(name = "OutTeamInformationWithdrawAmnt", required = true)
    protected BigDecimal outTeamInformationWithdrawAmnt;
    @XmlElement(name = "OutTeamInformationWthdrawSpread")
    protected short outTeamInformationWthdrawSpread;
    @XmlElement(name = "OutTmstampDhsseIncomingOnlTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTmstampDhsseIncomingOnlTmstamp;
    @XmlElement(name = "OutTrxCountAdvCounter")
    protected int outTrxCountAdvCounter;
    @XmlElement(name = "OutTrxCountTrxCounter")
    protected int outTrxCountTrxCounter;
    @XmlElement(name = "OutTrxCountTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTrxCountTrxDate;
    @XmlElement(name = "OutTrxCountUsrStatus")
    protected String outTrxCountUsrStatus;
    @XmlElement(name = "OutUnitCode")
    protected int outUnitCode;
    @XmlElement(name = "OutUnitUnitName")
    protected String outUnitUnitName;
    @XmlElement(name = "OutGrpIncoming")
    protected ArrayOfBI1634VOutGrpIncomingItem outGrpIncoming;

    /**
     * Gets the value of the outAccCurrencyCurrencyIdCurrency property.
     * 
     */
    public int getOutAccCurrencyCurrencyIdCurrency() {
        return outAccCurrencyCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outAccCurrencyCurrencyIdCurrency property.
     * 
     */
    public void setOutAccCurrencyCurrencyIdCurrency(int value) {
        this.outAccCurrencyCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outAccCurrencyCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAccCurrencyCurrencyShortDescr() {
        return outAccCurrencyCurrencyShortDescr;
    }

    /**
     * Sets the value of the outAccCurrencyCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAccCurrencyCurrencyShortDescr(String value) {
        this.outAccCurrencyCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outAcccodeDescCharSuppliedChar100 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAcccodeDescCharSuppliedChar100() {
        return outAcccodeDescCharSuppliedChar100;
    }

    /**
     * Sets the value of the outAcccodeDescCharSuppliedChar100 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAcccodeDescCharSuppliedChar100(String value) {
        this.outAcccodeDescCharSuppliedChar100 = value;
    }

    /**
     * Gets the value of the outAccodeDhsseIncomingAccCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAccodeDhsseIncomingAccCode() {
        return outAccodeDhsseIncomingAccCode;
    }

    /**
     * Sets the value of the outAccodeDhsseIncomingAccCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAccodeDhsseIncomingAccCode(String value) {
        this.outAccodeDhsseIncomingAccCode = value;
    }

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
     * Gets the value of the outBillParametersClearingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillParametersClearingSystem() {
        return outBillParametersClearingSystem;
    }

    /**
     * Sets the value of the outBillParametersClearingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillParametersClearingSystem(String value) {
        this.outBillParametersClearingSystem = value;
    }

    /**
     * Gets the value of the outChequeBookItemItemSerialNumber property.
     * 
     */
    public double getOutChequeBookItemItemSerialNumber() {
        return outChequeBookItemItemSerialNumber;
    }

    /**
     * Sets the value of the outChequeBookItemItemSerialNumber property.
     * 
     */
    public void setOutChequeBookItemItemSerialNumber(double value) {
        this.outChequeBookItemItemSerialNumber = value;
    }

    /**
     * Gets the value of the outCollaborationBankBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBankBankName() {
        return outCollaborationBankBankName;
    }

    /**
     * Sets the value of the outCollaborationBankBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBankBankName(String value) {
        this.outCollaborationBankBankName = value;
    }

    /**
     * Gets the value of the outCommissionFoundIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCommissionFoundIefSuppliedFlag() {
        return outCommissionFoundIefSuppliedFlag;
    }

    /**
     * Sets the value of the outCommissionFoundIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCommissionFoundIefSuppliedFlag(String value) {
        this.outCommissionFoundIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outCustAddressTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressTelephone() {
        return outCustAddressTelephone;
    }

    /**
     * Sets the value of the outCustAddressTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressTelephone(String value) {
        this.outCustAddressTelephone = value;
    }

    /**
     * Gets the value of the outCustomerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerFirstName() {
        return outCustomerFirstName;
    }

    /**
     * Sets the value of the outCustomerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerFirstName(String value) {
        this.outCustomerFirstName = value;
    }

    /**
     * Gets the value of the outCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerSurname() {
        return outCustomerSurname;
    }

    /**
     * Sets the value of the outCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerSurname(String value) {
        this.outCustomerSurname = value;
    }

    /**
     * Gets the value of the outCustomerTelephone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerTelephone1() {
        return outCustomerTelephone1;
    }

    /**
     * Sets the value of the outCustomerTelephone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerTelephone1(String value) {
        this.outCustomerTelephone1 = value;
    }

    /**
     * Gets the value of the outDepTrxRecordingAccAmount2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepTrxRecordingAccAmount2() {
        return outDepTrxRecordingAccAmount2;
    }

    /**
     * Sets the value of the outDepTrxRecordingAccAmount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepTrxRecordingAccAmount2(BigDecimal value) {
        this.outDepTrxRecordingAccAmount2 = value;
    }

    /**
     * Gets the value of the outDepTrxRecordingAccAmount3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepTrxRecordingAccAmount3() {
        return outDepTrxRecordingAccAmount3;
    }

    /**
     * Sets the value of the outDepTrxRecordingAccAmount3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepTrxRecordingAccAmount3(BigDecimal value) {
        this.outDepTrxRecordingAccAmount3 = value;
    }

    /**
     * Gets the value of the outDepTrxRecordingAccAmount4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepTrxRecordingAccAmount4() {
        return outDepTrxRecordingAccAmount4;
    }

    /**
     * Sets the value of the outDepTrxRecordingAccAmount4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepTrxRecordingAccAmount4(BigDecimal value) {
        this.outDepTrxRecordingAccAmount4 = value;
    }

    /**
     * Gets the value of the outDepTrxRecordingAccAmount5 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepTrxRecordingAccAmount5() {
        return outDepTrxRecordingAccAmount5;
    }

    /**
     * Sets the value of the outDepTrxRecordingAccAmount5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepTrxRecordingAccAmount5(BigDecimal value) {
        this.outDepTrxRecordingAccAmount5 = value;
    }

    /**
     * Gets the value of the outDepTrxRecordingAccAmount6 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepTrxRecordingAccAmount6() {
        return outDepTrxRecordingAccAmount6;
    }

    /**
     * Sets the value of the outDepTrxRecordingAccAmount6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepTrxRecordingAccAmount6(BigDecimal value) {
        this.outDepTrxRecordingAccAmount6 = value;
    }

    /**
     * Gets the value of the outDepTrxRecordingGlAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepTrxRecordingGlAcc() {
        return outDepTrxRecordingGlAcc;
    }

    /**
     * Sets the value of the outDepTrxRecordingGlAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepTrxRecordingGlAcc(String value) {
        this.outDepTrxRecordingGlAcc = value;
    }

    /**
     * Gets the value of the outDepTrxRecordingOEnchroachToller property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepTrxRecordingOEnchroachToller() {
        return outDepTrxRecordingOEnchroachToller;
    }

    /**
     * Sets the value of the outDepTrxRecordingOEnchroachToller property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepTrxRecordingOEnchroachToller(BigDecimal value) {
        this.outDepTrxRecordingOEnchroachToller = value;
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
     * Gets the value of the outDhsseInterfaceAccCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDhsseInterfaceAccCode() {
        return outDhsseInterfaceAccCode;
    }

    /**
     * Sets the value of the outDhsseInterfaceAccCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDhsseInterfaceAccCode(String value) {
        this.outDhsseInterfaceAccCode = value;
    }

    /**
     * Gets the value of the outGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGenericDetailDescription() {
        return outGenericDetailDescription;
    }

    /**
     * Sets the value of the outGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGenericDetailDescription(String value) {
        this.outGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGenericDetailSerialNum property.
     * 
     */
    public int getOutGenericDetailSerialNum() {
        return outGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outGenericDetailSerialNum property.
     * 
     */
    public void setOutGenericDetailSerialNum(int value) {
        this.outGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outIdentifierDhsseIncomingIdentifier property.
     * 
     */
    public int getOutIdentifierDhsseIncomingIdentifier() {
        return outIdentifierDhsseIncomingIdentifier;
    }

    /**
     * Sets the value of the outIdentifierDhsseIncomingIdentifier property.
     * 
     */
    public void setOutIdentifierDhsseIncomingIdentifier(int value) {
        this.outIdentifierDhsseIncomingIdentifier = value;
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
     * Gets the value of the outLastDhsseIncomingChqNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastDhsseIncomingChqNo() {
        return outLastDhsseIncomingChqNo;
    }

    /**
     * Sets the value of the outLastDhsseIncomingChqNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastDhsseIncomingChqNo(String value) {
        this.outLastDhsseIncomingChqNo = value;
    }

    /**
     * Gets the value of the outMoreRecordsIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMoreRecordsIefSuppliedFlag() {
        return outMoreRecordsIefSuppliedFlag;
    }

    /**
     * Sets the value of the outMoreRecordsIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMoreRecordsIefSuppliedFlag(String value) {
        this.outMoreRecordsIefSuppliedFlag = value;
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
     * Gets the value of the outProfitsExitStateWorkActualMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProfitsExitStateWorkActualMessage() {
        return outProfitsExitStateWorkActualMessage;
    }

    /**
     * Sets the value of the outProfitsExitStateWorkActualMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProfitsExitStateWorkActualMessage(String value) {
        this.outProfitsExitStateWorkActualMessage = value;
    }

    /**
     * Gets the value of the outProfitsExitStateWorkId property.
     * 
     */
    public double getOutProfitsExitStateWorkId() {
        return outProfitsExitStateWorkId;
    }

    /**
     * Sets the value of the outProfitsExitStateWorkId property.
     * 
     */
    public void setOutProfitsExitStateWorkId(double value) {
        this.outProfitsExitStateWorkId = value;
    }

    /**
     * Gets the value of the outProfitsExitStateWorkLanguage property.
     * 
     */
    public int getOutProfitsExitStateWorkLanguage() {
        return outProfitsExitStateWorkLanguage;
    }

    /**
     * Sets the value of the outProfitsExitStateWorkLanguage property.
     * 
     */
    public void setOutProfitsExitStateWorkLanguage(int value) {
        this.outProfitsExitStateWorkLanguage = value;
    }

    /**
     * Gets the value of the outProfitsExitStateWorkMessageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProfitsExitStateWorkMessageType() {
        return outProfitsExitStateWorkMessageType;
    }

    /**
     * Sets the value of the outProfitsExitStateWorkMessageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProfitsExitStateWorkMessageType(String value) {
        this.outProfitsExitStateWorkMessageType = value;
    }

    /**
     * Gets the value of the outProfitsExitStateWorkPrftSystem property.
     * 
     */
    public short getOutProfitsExitStateWorkPrftSystem() {
        return outProfitsExitStateWorkPrftSystem;
    }

    /**
     * Sets the value of the outProfitsExitStateWorkPrftSystem property.
     * 
     */
    public void setOutProfitsExitStateWorkPrftSystem(short value) {
        this.outProfitsExitStateWorkPrftSystem = value;
    }

    /**
     * Gets the value of the outProfitsExitStateWorkRoutineSn property.
     * 
     */
    public double getOutProfitsExitStateWorkRoutineSn() {
        return outProfitsExitStateWorkRoutineSn;
    }

    /**
     * Sets the value of the outProfitsExitStateWorkRoutineSn property.
     * 
     */
    public void setOutProfitsExitStateWorkRoutineSn(double value) {
        this.outProfitsExitStateWorkRoutineSn = value;
    }

    /**
     * Gets the value of the outProfitsExitStateWorkTerminationAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProfitsExitStateWorkTerminationAction() {
        return outProfitsExitStateWorkTerminationAction;
    }

    /**
     * Sets the value of the outProfitsExitStateWorkTerminationAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProfitsExitStateWorkTerminationAction(String value) {
        this.outProfitsExitStateWorkTerminationAction = value;
    }

    /**
     * Gets the value of the outProfitsExitStateWorkTraceChar80 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProfitsExitStateWorkTraceChar80() {
        return outProfitsExitStateWorkTraceChar80;
    }

    /**
     * Sets the value of the outProfitsExitStateWorkTraceChar80 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProfitsExitStateWorkTraceChar80(String value) {
        this.outProfitsExitStateWorkTraceChar80 = value;
    }

    /**
     * Gets the value of the outProfitsExitStateWorkValruleId property.
     * 
     */
    public double getOutProfitsExitStateWorkValruleId() {
        return outProfitsExitStateWorkValruleId;
    }

    /**
     * Sets the value of the outProfitsExitStateWorkValruleId property.
     * 
     */
    public void setOutProfitsExitStateWorkValruleId(double value) {
        this.outProfitsExitStateWorkValruleId = value;
    }

    /**
     * Gets the value of the outProfitsExitStateWorkValruleSnum property.
     * 
     */
    public int getOutProfitsExitStateWorkValruleSnum() {
        return outProfitsExitStateWorkValruleSnum;
    }

    /**
     * Sets the value of the outProfitsExitStateWorkValruleSnum property.
     * 
     */
    public void setOutProfitsExitStateWorkValruleSnum(int value) {
        this.outProfitsExitStateWorkValruleSnum = value;
    }

    /**
     * Gets the value of the outReadOnlyFlgIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutReadOnlyFlgIefSuppliedFlag() {
        return outReadOnlyFlgIefSuppliedFlag;
    }

    /**
     * Sets the value of the outReadOnlyFlgIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutReadOnlyFlgIefSuppliedFlag(String value) {
        this.outReadOnlyFlgIefSuppliedFlag = value;
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
     * Gets the value of the outTeamInformationAccCd property.
     * 
     */
    public short getOutTeamInformationAccCd() {
        return outTeamInformationAccCd;
    }

    /**
     * Sets the value of the outTeamInformationAccCd property.
     * 
     */
    public void setOutTeamInformationAccCd(short value) {
        this.outTeamInformationAccCd = value;
    }

    /**
     * Gets the value of the outTeamInformationAccSn property.
     * 
     */
    public int getOutTeamInformationAccSn() {
        return outTeamInformationAccSn;
    }

    /**
     * Sets the value of the outTeamInformationAccSn property.
     * 
     */
    public void setOutTeamInformationAccSn(int value) {
        this.outTeamInformationAccSn = value;
    }

    /**
     * Gets the value of the outTeamInformationAccType property.
     * 
     */
    public short getOutTeamInformationAccType() {
        return outTeamInformationAccType;
    }

    /**
     * Sets the value of the outTeamInformationAccType property.
     * 
     */
    public void setOutTeamInformationAccType(short value) {
        this.outTeamInformationAccType = value;
    }

    /**
     * Gets the value of the outTeamInformationAccUnitCode property.
     * 
     */
    public int getOutTeamInformationAccUnitCode() {
        return outTeamInformationAccUnitCode;
    }

    /**
     * Sets the value of the outTeamInformationAccUnitCode property.
     * 
     */
    public void setOutTeamInformationAccUnitCode(int value) {
        this.outTeamInformationAccUnitCode = value;
    }

    /**
     * Gets the value of the outTeamInformationAccountBenefAddressSn property.
     * 
     */
    public short getOutTeamInformationAccountBenefAddressSn() {
        return outTeamInformationAccountBenefAddressSn;
    }

    /**
     * Sets the value of the outTeamInformationAccountBenefAddressSn property.
     * 
     */
    public void setOutTeamInformationAccountBenefAddressSn(short value) {
        this.outTeamInformationAccountBenefAddressSn = value;
    }

    /**
     * Gets the value of the outTeamInformationAccountCobenefSnMail property.
     * 
     */
    public short getOutTeamInformationAccountCobenefSnMail() {
        return outTeamInformationAccountCobenefSnMail;
    }

    /**
     * Sets the value of the outTeamInformationAccountCobenefSnMail property.
     * 
     */
    public void setOutTeamInformationAccountCobenefSnMail(short value) {
        this.outTeamInformationAccountCobenefSnMail = value;
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
     * Gets the value of the outTeamInformationAccountHomeBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationAccountHomeBranch() {
        return outTeamInformationAccountHomeBranch;
    }

    /**
     * Sets the value of the outTeamInformationAccountHomeBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationAccountHomeBranch(String value) {
        this.outTeamInformationAccountHomeBranch = value;
    }

    /**
     * Gets the value of the outTeamInformationAccountPsbSn property.
     * 
     */
    public int getOutTeamInformationAccountPsbSn() {
        return outTeamInformationAccountPsbSn;
    }

    /**
     * Sets the value of the outTeamInformationAccountPsbSn property.
     * 
     */
    public void setOutTeamInformationAccountPsbSn(int value) {
        this.outTeamInformationAccountPsbSn = value;
    }

    /**
     * Gets the value of the outTeamInformationAuthorisationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationAuthorisationResult() {
        return outTeamInformationAuthorisationResult;
    }

    /**
     * Sets the value of the outTeamInformationAuthorisationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationAuthorisationResult(String value) {
        this.outTeamInformationAuthorisationResult = value;
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
     * Gets the value of the outTeamInformationBankDraftNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationBankDraftNo() {
        return outTeamInformationBankDraftNo;
    }

    /**
     * Sets the value of the outTeamInformationBankDraftNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationBankDraftNo(String value) {
        this.outTeamInformationBankDraftNo = value;
    }

    /**
     * Gets the value of the outTeamInformationBeneficiarySn property.
     * 
     */
    public short getOutTeamInformationBeneficiarySn() {
        return outTeamInformationBeneficiarySn;
    }

    /**
     * Sets the value of the outTeamInformationBeneficiarySn property.
     * 
     */
    public void setOutTeamInformationBeneficiarySn(short value) {
        this.outTeamInformationBeneficiarySn = value;
    }

    /**
     * Gets the value of the outTeamInformationBlockTransactExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTeamInformationBlockTransactExpDate() {
        return outTeamInformationBlockTransactExpDate;
    }

    /**
     * Sets the value of the outTeamInformationBlockTransactExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTeamInformationBlockTransactExpDate(XMLGregorianCalendar value) {
        this.outTeamInformationBlockTransactExpDate = value;
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
     * Gets the value of the outTeamInformationCheqAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationCheqAmount() {
        return outTeamInformationCheqAmount;
    }

    /**
     * Sets the value of the outTeamInformationCheqAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationCheqAmount(BigDecimal value) {
        this.outTeamInformationCheqAmount = value;
    }

    /**
     * Gets the value of the outTeamInformationCheqIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTeamInformationCheqIssueDate() {
        return outTeamInformationCheqIssueDate;
    }

    /**
     * Sets the value of the outTeamInformationCheqIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTeamInformationCheqIssueDate(XMLGregorianCalendar value) {
        this.outTeamInformationCheqIssueDate = value;
    }

    /**
     * Gets the value of the outTeamInformationCheqStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationCheqStatus() {
        return outTeamInformationCheqStatus;
    }

    /**
     * Sets the value of the outTeamInformationCheqStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationCheqStatus(String value) {
        this.outTeamInformationCheqStatus = value;
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
     * Gets the value of the outTeamInformationCrInterestId property.
     * 
     */
    public int getOutTeamInformationCrInterestId() {
        return outTeamInformationCrInterestId;
    }

    /**
     * Sets the value of the outTeamInformationCrInterestId property.
     * 
     */
    public void setOutTeamInformationCrInterestId(int value) {
        this.outTeamInformationCrInterestId = value;
    }

    /**
     * Gets the value of the outTeamInformationCrInterestPer property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationCrInterestPer() {
        return outTeamInformationCrInterestPer;
    }

    /**
     * Sets the value of the outTeamInformationCrInterestPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationCrInterestPer(BigDecimal value) {
        this.outTeamInformationCrInterestPer = value;
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
     * Gets the value of the outTeamInformationDbInterestId property.
     * 
     */
    public int getOutTeamInformationDbInterestId() {
        return outTeamInformationDbInterestId;
    }

    /**
     * Sets the value of the outTeamInformationDbInterestId property.
     * 
     */
    public void setOutTeamInformationDbInterestId(int value) {
        this.outTeamInformationDbInterestId = value;
    }

    /**
     * Gets the value of the outTeamInformationDbInterestPer property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationDbInterestPer() {
        return outTeamInformationDbInterestPer;
    }

    /**
     * Sets the value of the outTeamInformationDbInterestPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationDbInterestPer(BigDecimal value) {
        this.outTeamInformationDbInterestPer = value;
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
     * Gets the value of the outTeamInformationDepAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationDepAccStatus() {
        return outTeamInformationDepAccStatus;
    }

    /**
     * Sets the value of the outTeamInformationDepAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationDepAccStatus(String value) {
        this.outTeamInformationDepAccStatus = value;
    }

    /**
     * Gets the value of the outTeamInformationEncroachTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationEncroachTolerance() {
        return outTeamInformationEncroachTolerance;
    }

    /**
     * Sets the value of the outTeamInformationEncroachTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationEncroachTolerance(BigDecimal value) {
        this.outTeamInformationEncroachTolerance = value;
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
     * Gets the value of the outTeamInformationFromCheqCd property.
     * 
     */
    public short getOutTeamInformationFromCheqCd() {
        return outTeamInformationFromCheqCd;
    }

    /**
     * Sets the value of the outTeamInformationFromCheqCd property.
     * 
     */
    public void setOutTeamInformationFromCheqCd(short value) {
        this.outTeamInformationFromCheqCd = value;
    }

    /**
     * Gets the value of the outTeamInformationFromCheqItemSerialNum property.
     * 
     */
    public double getOutTeamInformationFromCheqItemSerialNum() {
        return outTeamInformationFromCheqItemSerialNum;
    }

    /**
     * Sets the value of the outTeamInformationFromCheqItemSerialNum property.
     * 
     */
    public void setOutTeamInformationFromCheqItemSerialNum(double value) {
        this.outTeamInformationFromCheqItemSerialNum = value;
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
     * Gets the value of the outTeamInformationNotifSpreadDayB property.
     * 
     */
    public short getOutTeamInformationNotifSpreadDayB() {
        return outTeamInformationNotifSpreadDayB;
    }

    /**
     * Sets the value of the outTeamInformationNotifSpreadDayB property.
     * 
     */
    public void setOutTeamInformationNotifSpreadDayB(short value) {
        this.outTeamInformationNotifSpreadDayB = value;
    }

    /**
     * Gets the value of the outTeamInformationNotifSpreadDays property.
     * 
     */
    public short getOutTeamInformationNotifSpreadDays() {
        return outTeamInformationNotifSpreadDays;
    }

    /**
     * Sets the value of the outTeamInformationNotifSpreadDays property.
     * 
     */
    public void setOutTeamInformationNotifSpreadDays(short value) {
        this.outTeamInformationNotifSpreadDays = value;
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
     * Gets the value of the outTeamInformationRepresentativeSn property.
     * 
     */
    public short getOutTeamInformationRepresentativeSn() {
        return outTeamInformationRepresentativeSn;
    }

    /**
     * Sets the value of the outTeamInformationRepresentativeSn property.
     * 
     */
    public void setOutTeamInformationRepresentativeSn(short value) {
        this.outTeamInformationRepresentativeSn = value;
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
     * Gets the value of the outTeamInformationRestrictAccFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationRestrictAccFlag() {
        return outTeamInformationRestrictAccFlag;
    }

    /**
     * Sets the value of the outTeamInformationRestrictAccFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationRestrictAccFlag(String value) {
        this.outTeamInformationRestrictAccFlag = value;
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
     * Gets the value of the outTeamInformationStatementIssFreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationStatementIssFreq() {
        return outTeamInformationStatementIssFreq;
    }

    /**
     * Sets the value of the outTeamInformationStatementIssFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationStatementIssFreq(String value) {
        this.outTeamInformationStatementIssFreq = value;
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
     * Gets the value of the outTeamInformationToCheqCd property.
     * 
     */
    public short getOutTeamInformationToCheqCd() {
        return outTeamInformationToCheqCd;
    }

    /**
     * Sets the value of the outTeamInformationToCheqCd property.
     * 
     */
    public void setOutTeamInformationToCheqCd(short value) {
        this.outTeamInformationToCheqCd = value;
    }

    /**
     * Gets the value of the outTeamInformationToCheqItemSerialNum property.
     * 
     */
    public double getOutTeamInformationToCheqItemSerialNum() {
        return outTeamInformationToCheqItemSerialNum;
    }

    /**
     * Sets the value of the outTeamInformationToCheqItemSerialNum property.
     * 
     */
    public void setOutTeamInformationToCheqItemSerialNum(double value) {
        this.outTeamInformationToCheqItemSerialNum = value;
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
     * Gets the value of the outTeamInformationWithdrawAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationWithdrawAmnt() {
        return outTeamInformationWithdrawAmnt;
    }

    /**
     * Sets the value of the outTeamInformationWithdrawAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationWithdrawAmnt(BigDecimal value) {
        this.outTeamInformationWithdrawAmnt = value;
    }

    /**
     * Gets the value of the outTeamInformationWthdrawSpread property.
     * 
     */
    public short getOutTeamInformationWthdrawSpread() {
        return outTeamInformationWthdrawSpread;
    }

    /**
     * Sets the value of the outTeamInformationWthdrawSpread property.
     * 
     */
    public void setOutTeamInformationWthdrawSpread(short value) {
        this.outTeamInformationWthdrawSpread = value;
    }

    /**
     * Gets the value of the outTmstampDhsseIncomingOnlTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTmstampDhsseIncomingOnlTmstamp() {
        return outTmstampDhsseIncomingOnlTmstamp;
    }

    /**
     * Sets the value of the outTmstampDhsseIncomingOnlTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTmstampDhsseIncomingOnlTmstamp(XMLGregorianCalendar value) {
        this.outTmstampDhsseIncomingOnlTmstamp = value;
    }

    /**
     * Gets the value of the outTrxCountAdvCounter property.
     * 
     */
    public int getOutTrxCountAdvCounter() {
        return outTrxCountAdvCounter;
    }

    /**
     * Sets the value of the outTrxCountAdvCounter property.
     * 
     */
    public void setOutTrxCountAdvCounter(int value) {
        this.outTrxCountAdvCounter = value;
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
     * Gets the value of the outTrxCountTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTrxCountTrxDate() {
        return outTrxCountTrxDate;
    }

    /**
     * Sets the value of the outTrxCountTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTrxCountTrxDate(XMLGregorianCalendar value) {
        this.outTrxCountTrxDate = value;
    }

    /**
     * Gets the value of the outTrxCountUsrStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrxCountUsrStatus() {
        return outTrxCountUsrStatus;
    }

    /**
     * Sets the value of the outTrxCountUsrStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrxCountUsrStatus(String value) {
        this.outTrxCountUsrStatus = value;
    }

    /**
     * Gets the value of the outUnitCode property.
     * 
     */
    public int getOutUnitCode() {
        return outUnitCode;
    }

    /**
     * Sets the value of the outUnitCode property.
     * 
     */
    public void setOutUnitCode(int value) {
        this.outUnitCode = value;
    }

    /**
     * Gets the value of the outUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUnitUnitName() {
        return outUnitUnitName;
    }

    /**
     * Sets the value of the outUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUnitUnitName(String value) {
        this.outUnitUnitName = value;
    }

    /**
     * Gets the value of the outGrpIncoming property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBI1634VOutGrpIncomingItem }
     *     
     */
    public ArrayOfBI1634VOutGrpIncomingItem getOutGrpIncoming() {
        return outGrpIncoming;
    }

    /**
     * Sets the value of the outGrpIncoming property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBI1634VOutGrpIncomingItem }
     *     
     */
    public void setOutGrpIncoming(ArrayOfBI1634VOutGrpIncomingItem value) {
        this.outGrpIncoming = value;
    }

}
