
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BillsReverseChequePurchaseExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillsReverseChequePurchaseExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutTeamInformationJustificationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAdviceTrxCountAdvCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAdviceTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBillCancelBillBillAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBillCancelBillBillNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillCancelBillBillSerialNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutBillCancelBillBillStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillCancelCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillGroupBgrpSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBillRegisterBregSerialNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerColPercCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustomerColPercEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerColPercIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustomerColPercPercentage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrmLogMntRecordingGrpSubscript" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrmLogMntRecordingIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrmLogMntRecordingIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrmLogMntRecordingTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrmLogMntRecordingTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGroupLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedSrvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoBillBillAccountNumb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoBillBillAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutInfoBillBillBarcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoBillBillBranchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoBillBillCarrierId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoBillBillCarrierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoBillBillCarrierNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoBillBillCarrierTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoBillBillChargesOnacc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoBillBillCheckDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutInfoBillBillClrtypeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoBillBillCollAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutInfoBillBillCollAccNumb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoBillBillCollCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoBillBillCollJustif" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInfoBillBillCollPrfsys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutInfoBillBillCollSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutInfoBillBillCollTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutInfoBillBillCollYieldPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutInfoBillBillCraccAvldays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutInfoBillBillCrAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutInfoBillBillCraccIntdays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutInfoBillBillCraccJustif" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInfoBillBillCrAccNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoBillBillCraccPrfsys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutInfoBillBillDebaccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutInfoBillBillDebaccJust" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInfoBillBillDebaccNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoBillBillDebaccPrfsys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutInfoBillBillEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoBillBillExpaccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutInfoBillBillExpaccNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoBillBillExpaccPrfsys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutInfoBillBillExpDbJust" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInfoBillBillExpInterdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutInfoBillBillExpInterdays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutInfoBillBillFinalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutInfoBillBillIbanCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoBillBillInsDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutInfoBillBillIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutInfoBillBillJustificId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInfoBillBillNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoBillBillOwnbankFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoBillBillPrftTransId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInfoBillBillProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInfoBillBillRejectedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoBillBillRejectNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoBillBillSendtoclrCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutInfoBillBillSerialNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutInfoBillBillSpecialChars" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoBillBillStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoBillBillTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutInfoBillBillTraceflowFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoBillBillTypeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoBillBillUpdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutInfoBillBillUpdUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoBillBillValidateFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoBillCollTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutInfoBillCollTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInfoBillCollTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoBillCollTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInfoBillCollTunIntSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutInfoBillCrDepTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutInfoBillCrDepTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInfoBillCrDepTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoBillCrDepTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInfoBillCrDepTunIntSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutInfoBillCrLnsTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutInfoBillCrLnsTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutInfoBillCrLnsTrxIntSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutInfoBillCrLnsTrxSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInfoBillCrLnsTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInfoBillCrLnsTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoBillDebDepTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutInfoBillDebDepTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInfoBillDebDepTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoBillDebDepTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInfoBillDebDepTunIntSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutInfoBillDebLnsTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutInfoBillDebLnsTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutInfoBillDebLnsTrxIntSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutInfoBillDebLnsTrxSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInfoBillDebLnsTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInfoBillDebLnsTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoBillExpDepTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutInfoBillExpDepTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInfoBillExpDepTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoBillExpDepTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInfoBillExpDepTunIntSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutInfoBillExpLnsTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutInfoBillExpLnsTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutInfoBillExpLnsTrxIntSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutInfoBillExpLnsTrxSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInfoBillExpLnsTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInfoBillExpLnsTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationAccountBenefAddressSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationAccountCobenefSnMail" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationAccountCode" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutTeamInformationAccountHomeBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationAccountPsbSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationAccSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationAccUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
 *         &lt;element name="OutTeamInformationCreditInterestRateSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationCrInterestId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationCrInterestPer" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
 *         &lt;element name="OutTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTrxCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTrxCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VlOutClientProfitsExitStateWorkActualMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VlOutClientProfitsExitStateWorkId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="VlOutClientProfitsExitStateWorkLanguage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VlOutClientProfitsExitStateWorkMessageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VlOutClientProfitsExitStateWorkPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="VlOutClientProfitsExitStateWorkRoutineSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="VlOutClientProfitsExitStateWorkTerminationAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VlOutClientProfitsExitStateWorkValruleId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="VlOutClientProfitsExitStateWorkValruleSnum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VlOutPrintoutValidationInputVoucherLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroup" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillsReverseChequePurchaseExport", propOrder = {
    "outTeamInformationJustificationId",
    "outAdviceTrxCountAdvCounter",
    "outAdviceTrxCountTrxCounter",
    "outBillCancelBillBillAmount",
    "outBillCancelBillBillNumber",
    "outBillCancelBillBillSerialNum",
    "outBillCancelBillBillStatusFlag",
    "outBillCancelCurrencyShortDescr",
    "outBillGroupBgrpSerialNum",
    "outBillRegisterBregSerialNum",
    "outCustomerCDigit",
    "outCustomerCustId",
    "outCustomerFirstName",
    "outCustomerSurname",
    "outCustomerColPercCustId",
    "outCustomerColPercEntryStatus",
    "outCustomerColPercIdProduct",
    "outCustomerColPercPercentage",
    "outGrmLogMntRecordingGrpSubscript",
    "outGrmLogMntRecordingIdJustific",
    "outGrmLogMntRecordingIdProduct",
    "outGrmLogMntRecordingTmstamp",
    "outGrmLogMntRecordingTrxUsrSn",
    "outGroupLength",
    "outIefSuppliedActionEntryDesc",
    "outIefSuppliedSrvStatus",
    "outInfoBillBillAccountNumb",
    "outInfoBillBillAmount",
    "outInfoBillBillBarcode",
    "outInfoBillBillBranchCode",
    "outInfoBillBillCarrierId",
    "outInfoBillBillCarrierName",
    "outInfoBillBillCarrierNotes",
    "outInfoBillBillCarrierTitle",
    "outInfoBillBillChargesOnacc",
    "outInfoBillBillCheckDigit",
    "outInfoBillBillClrtypeFlag",
    "outInfoBillBillCollAccCd",
    "outInfoBillBillCollAccNumb",
    "outInfoBillBillCollCode",
    "outInfoBillBillCollJustif",
    "outInfoBillBillCollPrfsys",
    "outInfoBillBillCollSn",
    "outInfoBillBillCollTmstamp",
    "outInfoBillBillCollYieldPerc",
    "outInfoBillBillCraccAvldays",
    "outInfoBillBillCrAccCd",
    "outInfoBillBillCraccIntdays",
    "outInfoBillBillCraccJustif",
    "outInfoBillBillCrAccNumber",
    "outInfoBillBillCraccPrfsys",
    "outInfoBillBillDebaccCd",
    "outInfoBillBillDebaccJust",
    "outInfoBillBillDebaccNumber",
    "outInfoBillBillDebaccPrfsys",
    "outInfoBillBillEntryStatus",
    "outInfoBillBillExpaccCd",
    "outInfoBillBillExpaccNumber",
    "outInfoBillBillExpaccPrfsys",
    "outInfoBillBillExpDbJust",
    "outInfoBillBillExpInterdate",
    "outInfoBillBillExpInterdays",
    "outInfoBillBillFinalDate",
    "outInfoBillBillIbanCode",
    "outInfoBillBillInsDate",
    "outInfoBillBillIssueDate",
    "outInfoBillBillJustificId",
    "outInfoBillBillNumber",
    "outInfoBillBillOwnbankFlag",
    "outInfoBillBillPrftTransId",
    "outInfoBillBillProductId",
    "outInfoBillBillRejectedFlag",
    "outInfoBillBillRejectNotes",
    "outInfoBillBillSendtoclrCnt",
    "outInfoBillBillSerialNum",
    "outInfoBillBillSpecialChars",
    "outInfoBillBillStatusFlag",
    "outInfoBillBillTmstamp",
    "outInfoBillBillTraceflowFlg",
    "outInfoBillBillTypeFlag",
    "outInfoBillBillUpdDate",
    "outInfoBillBillUpdUser",
    "outInfoBillBillValidateFlg",
    "outInfoBillCollTrxDate",
    "outInfoBillCollTrxUnit",
    "outInfoBillCollTrxUsr",
    "outInfoBillCollTrxUsrSn",
    "outInfoBillCollTunIntSn",
    "outInfoBillCrDepTrxDate",
    "outInfoBillCrDepTrxUnit",
    "outInfoBillCrDepTrxUsr",
    "outInfoBillCrDepTrxUsrSn",
    "outInfoBillCrDepTunIntSn",
    "outInfoBillCrLnsTmstamp",
    "outInfoBillCrLnsTrxDate",
    "outInfoBillCrLnsTrxIntSn",
    "outInfoBillCrLnsTrxSn",
    "outInfoBillCrLnsTrxUnit",
    "outInfoBillCrLnsTrxUsr",
    "outInfoBillDebDepTrxDate",
    "outInfoBillDebDepTrxUnit",
    "outInfoBillDebDepTrxUsr",
    "outInfoBillDebDepTrxUsrSn",
    "outInfoBillDebDepTunIntSn",
    "outInfoBillDebLnsTmstamp",
    "outInfoBillDebLnsTrxDate",
    "outInfoBillDebLnsTrxIntSn",
    "outInfoBillDebLnsTrxSn",
    "outInfoBillDebLnsTrxUnit",
    "outInfoBillDebLnsTrxUsr",
    "outInfoBillExpDepTrxDate",
    "outInfoBillExpDepTrxUnit",
    "outInfoBillExpDepTrxUsr",
    "outInfoBillExpDepTrxUsrSn",
    "outInfoBillExpDepTunIntSn",
    "outInfoBillExpLnsTmstamp",
    "outInfoBillExpLnsTrxDate",
    "outInfoBillExpLnsTrxIntSn",
    "outInfoBillExpLnsTrxSn",
    "outInfoBillExpLnsTrxUnit",
    "outInfoBillExpLnsTrxUsr",
    "outPrftTransactionDescription",
    "outPrftTransactionIdTransact",
    "outTeamInformationAccCd",
    "outTeamInformationAccountBenefAddressSn",
    "outTeamInformationAccountCobenefSnMail",
    "outTeamInformationAccountCode",
    "outTeamInformationAccountHomeBranch",
    "outTeamInformationAccountPsbSn",
    "outTeamInformationAccSn",
    "outTeamInformationAccType",
    "outTeamInformationAccUnitCode",
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
    "outTeamInformationCreditInterestRateSpread",
    "outTeamInformationCrInterestId",
    "outTeamInformationCrInterestPer",
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
    "outTrxCountTrxCounter",
    "outTrxCurrencyIdCurrency",
    "outTrxCurrencyShortDescr",
    "vlOutClientProfitsExitStateWorkActualMessage",
    "vlOutClientProfitsExitStateWorkId",
    "vlOutClientProfitsExitStateWorkLanguage",
    "vlOutClientProfitsExitStateWorkMessageType",
    "vlOutClientProfitsExitStateWorkPrftSystem",
    "vlOutClientProfitsExitStateWorkRoutineSn",
    "vlOutClientProfitsExitStateWorkTerminationAction",
    "vlOutClientProfitsExitStateWorkValruleId",
    "vlOutClientProfitsExitStateWorkValruleSnum",
    "vlOutPrintoutValidationInputVoucherLine",
    "outGroup"
})
public class BillsReverseChequePurchaseExport
    extends BaseExport
{

    @XmlElement(name = "OutTeamInformationJustificationId")
    protected int outTeamInformationJustificationId;
    @XmlElement(name = "OutAdviceTrxCountAdvCounter")
    protected int outAdviceTrxCountAdvCounter;
    @XmlElement(name = "OutAdviceTrxCountTrxCounter")
    protected int outAdviceTrxCountTrxCounter;
    @XmlElement(name = "OutBillCancelBillBillAmount", required = true)
    protected BigDecimal outBillCancelBillBillAmount;
    @XmlElement(name = "OutBillCancelBillBillNumber")
    protected String outBillCancelBillBillNumber;
    @XmlElement(name = "OutBillCancelBillBillSerialNum")
    protected double outBillCancelBillBillSerialNum;
    @XmlElement(name = "OutBillCancelBillBillStatusFlag")
    protected String outBillCancelBillBillStatusFlag;
    @XmlElement(name = "OutBillCancelCurrencyShortDescr")
    protected String outBillCancelCurrencyShortDescr;
    @XmlElement(name = "OutBillGroupBgrpSerialNum")
    protected short outBillGroupBgrpSerialNum;
    @XmlElement(name = "OutBillRegisterBregSerialNum")
    protected double outBillRegisterBregSerialNum;
    @XmlElement(name = "OutCustomerCDigit")
    protected short outCustomerCDigit;
    @XmlElement(name = "OutCustomerCustId")
    protected int outCustomerCustId;
    @XmlElement(name = "OutCustomerFirstName")
    protected String outCustomerFirstName;
    @XmlElement(name = "OutCustomerSurname")
    protected String outCustomerSurname;
    @XmlElement(name = "OutCustomerColPercCustId")
    protected int outCustomerColPercCustId;
    @XmlElement(name = "OutCustomerColPercEntryStatus")
    protected String outCustomerColPercEntryStatus;
    @XmlElement(name = "OutCustomerColPercIdProduct")
    protected int outCustomerColPercIdProduct;
    @XmlElement(name = "OutCustomerColPercPercentage")
    protected int outCustomerColPercPercentage;
    @XmlElement(name = "OutGrmLogMntRecordingGrpSubscript")
    protected short outGrmLogMntRecordingGrpSubscript;
    @XmlElement(name = "OutGrmLogMntRecordingIdJustific")
    protected int outGrmLogMntRecordingIdJustific;
    @XmlElement(name = "OutGrmLogMntRecordingIdProduct")
    protected int outGrmLogMntRecordingIdProduct;
    @XmlElement(name = "OutGrmLogMntRecordingTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrmLogMntRecordingTmstamp;
    @XmlElement(name = "OutGrmLogMntRecordingTrxUsrSn")
    protected int outGrmLogMntRecordingTrxUsrSn;
    @XmlElement(name = "OutGroupLength")
    protected int outGroupLength;
    @XmlElement(name = "OutIefSuppliedActionEntryDesc")
    protected String outIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutIefSuppliedSrvStatus")
    protected String outIefSuppliedSrvStatus;
    @XmlElement(name = "OutInfoBillBillAccountNumb")
    protected String outInfoBillBillAccountNumb;
    @XmlElement(name = "OutInfoBillBillAmount", required = true)
    protected BigDecimal outInfoBillBillAmount;
    @XmlElement(name = "OutInfoBillBillBarcode")
    protected String outInfoBillBillBarcode;
    @XmlElement(name = "OutInfoBillBillBranchCode")
    protected String outInfoBillBillBranchCode;
    @XmlElement(name = "OutInfoBillBillCarrierId")
    protected String outInfoBillBillCarrierId;
    @XmlElement(name = "OutInfoBillBillCarrierName")
    protected String outInfoBillBillCarrierName;
    @XmlElement(name = "OutInfoBillBillCarrierNotes")
    protected String outInfoBillBillCarrierNotes;
    @XmlElement(name = "OutInfoBillBillCarrierTitle")
    protected String outInfoBillBillCarrierTitle;
    @XmlElement(name = "OutInfoBillBillChargesOnacc")
    protected String outInfoBillBillChargesOnacc;
    @XmlElement(name = "OutInfoBillBillCheckDigit")
    protected short outInfoBillBillCheckDigit;
    @XmlElement(name = "OutInfoBillBillClrtypeFlag")
    protected String outInfoBillBillClrtypeFlag;
    @XmlElement(name = "OutInfoBillBillCollAccCd")
    protected short outInfoBillBillCollAccCd;
    @XmlElement(name = "OutInfoBillBillCollAccNumb")
    protected String outInfoBillBillCollAccNumb;
    @XmlElement(name = "OutInfoBillBillCollCode")
    protected String outInfoBillBillCollCode;
    @XmlElement(name = "OutInfoBillBillCollJustif")
    protected int outInfoBillBillCollJustif;
    @XmlElement(name = "OutInfoBillBillCollPrfsys")
    protected short outInfoBillBillCollPrfsys;
    @XmlElement(name = "OutInfoBillBillCollSn")
    protected double outInfoBillBillCollSn;
    @XmlElement(name = "OutInfoBillBillCollTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outInfoBillBillCollTmstamp;
    @XmlElement(name = "OutInfoBillBillCollYieldPerc", required = true)
    protected BigDecimal outInfoBillBillCollYieldPerc;
    @XmlElement(name = "OutInfoBillBillCraccAvldays")
    protected short outInfoBillBillCraccAvldays;
    @XmlElement(name = "OutInfoBillBillCrAccCd")
    protected short outInfoBillBillCrAccCd;
    @XmlElement(name = "OutInfoBillBillCraccIntdays")
    protected short outInfoBillBillCraccIntdays;
    @XmlElement(name = "OutInfoBillBillCraccJustif")
    protected int outInfoBillBillCraccJustif;
    @XmlElement(name = "OutInfoBillBillCrAccNumber")
    protected String outInfoBillBillCrAccNumber;
    @XmlElement(name = "OutInfoBillBillCraccPrfsys")
    protected short outInfoBillBillCraccPrfsys;
    @XmlElement(name = "OutInfoBillBillDebaccCd")
    protected short outInfoBillBillDebaccCd;
    @XmlElement(name = "OutInfoBillBillDebaccJust")
    protected int outInfoBillBillDebaccJust;
    @XmlElement(name = "OutInfoBillBillDebaccNumber")
    protected String outInfoBillBillDebaccNumber;
    @XmlElement(name = "OutInfoBillBillDebaccPrfsys")
    protected short outInfoBillBillDebaccPrfsys;
    @XmlElement(name = "OutInfoBillBillEntryStatus")
    protected String outInfoBillBillEntryStatus;
    @XmlElement(name = "OutInfoBillBillExpaccCd")
    protected short outInfoBillBillExpaccCd;
    @XmlElement(name = "OutInfoBillBillExpaccNumber")
    protected String outInfoBillBillExpaccNumber;
    @XmlElement(name = "OutInfoBillBillExpaccPrfsys")
    protected short outInfoBillBillExpaccPrfsys;
    @XmlElement(name = "OutInfoBillBillExpDbJust")
    protected int outInfoBillBillExpDbJust;
    @XmlElement(name = "OutInfoBillBillExpInterdate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outInfoBillBillExpInterdate;
    @XmlElement(name = "OutInfoBillBillExpInterdays")
    protected short outInfoBillBillExpInterdays;
    @XmlElement(name = "OutInfoBillBillFinalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outInfoBillBillFinalDate;
    @XmlElement(name = "OutInfoBillBillIbanCode")
    protected String outInfoBillBillIbanCode;
    @XmlElement(name = "OutInfoBillBillInsDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outInfoBillBillInsDate;
    @XmlElement(name = "OutInfoBillBillIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outInfoBillBillIssueDate;
    @XmlElement(name = "OutInfoBillBillJustificId")
    protected int outInfoBillBillJustificId;
    @XmlElement(name = "OutInfoBillBillNumber")
    protected String outInfoBillBillNumber;
    @XmlElement(name = "OutInfoBillBillOwnbankFlag")
    protected String outInfoBillBillOwnbankFlag;
    @XmlElement(name = "OutInfoBillBillPrftTransId")
    protected int outInfoBillBillPrftTransId;
    @XmlElement(name = "OutInfoBillBillProductId")
    protected int outInfoBillBillProductId;
    @XmlElement(name = "OutInfoBillBillRejectedFlag")
    protected String outInfoBillBillRejectedFlag;
    @XmlElement(name = "OutInfoBillBillRejectNotes")
    protected String outInfoBillBillRejectNotes;
    @XmlElement(name = "OutInfoBillBillSendtoclrCnt")
    protected short outInfoBillBillSendtoclrCnt;
    @XmlElement(name = "OutInfoBillBillSerialNum")
    protected double outInfoBillBillSerialNum;
    @XmlElement(name = "OutInfoBillBillSpecialChars")
    protected String outInfoBillBillSpecialChars;
    @XmlElement(name = "OutInfoBillBillStatusFlag")
    protected String outInfoBillBillStatusFlag;
    @XmlElement(name = "OutInfoBillBillTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outInfoBillBillTmstamp;
    @XmlElement(name = "OutInfoBillBillTraceflowFlg")
    protected String outInfoBillBillTraceflowFlg;
    @XmlElement(name = "OutInfoBillBillTypeFlag")
    protected String outInfoBillBillTypeFlag;
    @XmlElement(name = "OutInfoBillBillUpdDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outInfoBillBillUpdDate;
    @XmlElement(name = "OutInfoBillBillUpdUser")
    protected String outInfoBillBillUpdUser;
    @XmlElement(name = "OutInfoBillBillValidateFlg")
    protected String outInfoBillBillValidateFlg;
    @XmlElement(name = "OutInfoBillCollTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outInfoBillCollTrxDate;
    @XmlElement(name = "OutInfoBillCollTrxUnit")
    protected int outInfoBillCollTrxUnit;
    @XmlElement(name = "OutInfoBillCollTrxUsr")
    protected String outInfoBillCollTrxUsr;
    @XmlElement(name = "OutInfoBillCollTrxUsrSn")
    protected int outInfoBillCollTrxUsrSn;
    @XmlElement(name = "OutInfoBillCollTunIntSn")
    protected short outInfoBillCollTunIntSn;
    @XmlElement(name = "OutInfoBillCrDepTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outInfoBillCrDepTrxDate;
    @XmlElement(name = "OutInfoBillCrDepTrxUnit")
    protected int outInfoBillCrDepTrxUnit;
    @XmlElement(name = "OutInfoBillCrDepTrxUsr")
    protected String outInfoBillCrDepTrxUsr;
    @XmlElement(name = "OutInfoBillCrDepTrxUsrSn")
    protected int outInfoBillCrDepTrxUsrSn;
    @XmlElement(name = "OutInfoBillCrDepTunIntSn")
    protected short outInfoBillCrDepTunIntSn;
    @XmlElement(name = "OutInfoBillCrLnsTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outInfoBillCrLnsTmstamp;
    @XmlElement(name = "OutInfoBillCrLnsTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outInfoBillCrLnsTrxDate;
    @XmlElement(name = "OutInfoBillCrLnsTrxIntSn")
    protected short outInfoBillCrLnsTrxIntSn;
    @XmlElement(name = "OutInfoBillCrLnsTrxSn")
    protected int outInfoBillCrLnsTrxSn;
    @XmlElement(name = "OutInfoBillCrLnsTrxUnit")
    protected int outInfoBillCrLnsTrxUnit;
    @XmlElement(name = "OutInfoBillCrLnsTrxUsr")
    protected String outInfoBillCrLnsTrxUsr;
    @XmlElement(name = "OutInfoBillDebDepTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outInfoBillDebDepTrxDate;
    @XmlElement(name = "OutInfoBillDebDepTrxUnit")
    protected int outInfoBillDebDepTrxUnit;
    @XmlElement(name = "OutInfoBillDebDepTrxUsr")
    protected String outInfoBillDebDepTrxUsr;
    @XmlElement(name = "OutInfoBillDebDepTrxUsrSn")
    protected int outInfoBillDebDepTrxUsrSn;
    @XmlElement(name = "OutInfoBillDebDepTunIntSn")
    protected short outInfoBillDebDepTunIntSn;
    @XmlElement(name = "OutInfoBillDebLnsTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outInfoBillDebLnsTmstamp;
    @XmlElement(name = "OutInfoBillDebLnsTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outInfoBillDebLnsTrxDate;
    @XmlElement(name = "OutInfoBillDebLnsTrxIntSn")
    protected short outInfoBillDebLnsTrxIntSn;
    @XmlElement(name = "OutInfoBillDebLnsTrxSn")
    protected int outInfoBillDebLnsTrxSn;
    @XmlElement(name = "OutInfoBillDebLnsTrxUnit")
    protected int outInfoBillDebLnsTrxUnit;
    @XmlElement(name = "OutInfoBillDebLnsTrxUsr")
    protected String outInfoBillDebLnsTrxUsr;
    @XmlElement(name = "OutInfoBillExpDepTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outInfoBillExpDepTrxDate;
    @XmlElement(name = "OutInfoBillExpDepTrxUnit")
    protected int outInfoBillExpDepTrxUnit;
    @XmlElement(name = "OutInfoBillExpDepTrxUsr")
    protected String outInfoBillExpDepTrxUsr;
    @XmlElement(name = "OutInfoBillExpDepTrxUsrSn")
    protected int outInfoBillExpDepTrxUsrSn;
    @XmlElement(name = "OutInfoBillExpDepTunIntSn")
    protected short outInfoBillExpDepTunIntSn;
    @XmlElement(name = "OutInfoBillExpLnsTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outInfoBillExpLnsTmstamp;
    @XmlElement(name = "OutInfoBillExpLnsTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outInfoBillExpLnsTrxDate;
    @XmlElement(name = "OutInfoBillExpLnsTrxIntSn")
    protected short outInfoBillExpLnsTrxIntSn;
    @XmlElement(name = "OutInfoBillExpLnsTrxSn")
    protected int outInfoBillExpLnsTrxSn;
    @XmlElement(name = "OutInfoBillExpLnsTrxUnit")
    protected int outInfoBillExpLnsTrxUnit;
    @XmlElement(name = "OutInfoBillExpLnsTrxUsr")
    protected String outInfoBillExpLnsTrxUsr;
    @XmlElement(name = "OutPrftTransactionDescription")
    protected String outPrftTransactionDescription;
    @XmlElement(name = "OutPrftTransactionIdTransact")
    protected int outPrftTransactionIdTransact;
    @XmlElement(name = "OutTeamInformationAccCd")
    protected short outTeamInformationAccCd;
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
    @XmlElement(name = "OutTeamInformationAccSn")
    protected int outTeamInformationAccSn;
    @XmlElement(name = "OutTeamInformationAccType")
    protected short outTeamInformationAccType;
    @XmlElement(name = "OutTeamInformationAccUnitCode")
    protected int outTeamInformationAccUnitCode;
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
    @XmlElement(name = "OutTeamInformationCreditInterestRateSpread", required = true)
    protected BigDecimal outTeamInformationCreditInterestRateSpread;
    @XmlElement(name = "OutTeamInformationCrInterestId")
    protected int outTeamInformationCrInterestId;
    @XmlElement(name = "OutTeamInformationCrInterestPer", required = true)
    protected BigDecimal outTeamInformationCrInterestPer;
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
    @XmlElement(name = "OutTrxCountTrxCounter")
    protected int outTrxCountTrxCounter;
    @XmlElement(name = "OutTrxCurrencyIdCurrency")
    protected int outTrxCurrencyIdCurrency;
    @XmlElement(name = "OutTrxCurrencyShortDescr")
    protected String outTrxCurrencyShortDescr;
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
    @XmlElement(name = "VlOutPrintoutValidationInputVoucherLine")
    protected String vlOutPrintoutValidationInputVoucherLine;
    @XmlElement(name = "OutGroup")
    protected ArrayOfOutGroup outGroup;

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
     * Gets the value of the outAdviceTrxCountAdvCounter property.
     * 
     */
    public int getOutAdviceTrxCountAdvCounter() {
        return outAdviceTrxCountAdvCounter;
    }

    /**
     * Sets the value of the outAdviceTrxCountAdvCounter property.
     * 
     */
    public void setOutAdviceTrxCountAdvCounter(int value) {
        this.outAdviceTrxCountAdvCounter = value;
    }

    /**
     * Gets the value of the outAdviceTrxCountTrxCounter property.
     * 
     */
    public int getOutAdviceTrxCountTrxCounter() {
        return outAdviceTrxCountTrxCounter;
    }

    /**
     * Sets the value of the outAdviceTrxCountTrxCounter property.
     * 
     */
    public void setOutAdviceTrxCountTrxCounter(int value) {
        this.outAdviceTrxCountTrxCounter = value;
    }

    /**
     * Gets the value of the outBillCancelBillBillAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBillCancelBillBillAmount() {
        return outBillCancelBillBillAmount;
    }

    /**
     * Sets the value of the outBillCancelBillBillAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBillCancelBillBillAmount(BigDecimal value) {
        this.outBillCancelBillBillAmount = value;
    }

    /**
     * Gets the value of the outBillCancelBillBillNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillCancelBillBillNumber() {
        return outBillCancelBillBillNumber;
    }

    /**
     * Sets the value of the outBillCancelBillBillNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillCancelBillBillNumber(String value) {
        this.outBillCancelBillBillNumber = value;
    }

    /**
     * Gets the value of the outBillCancelBillBillSerialNum property.
     * 
     */
    public double getOutBillCancelBillBillSerialNum() {
        return outBillCancelBillBillSerialNum;
    }

    /**
     * Sets the value of the outBillCancelBillBillSerialNum property.
     * 
     */
    public void setOutBillCancelBillBillSerialNum(double value) {
        this.outBillCancelBillBillSerialNum = value;
    }

    /**
     * Gets the value of the outBillCancelBillBillStatusFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillCancelBillBillStatusFlag() {
        return outBillCancelBillBillStatusFlag;
    }

    /**
     * Sets the value of the outBillCancelBillBillStatusFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillCancelBillBillStatusFlag(String value) {
        this.outBillCancelBillBillStatusFlag = value;
    }

    /**
     * Gets the value of the outBillCancelCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillCancelCurrencyShortDescr() {
        return outBillCancelCurrencyShortDescr;
    }

    /**
     * Sets the value of the outBillCancelCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillCancelCurrencyShortDescr(String value) {
        this.outBillCancelCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outBillGroupBgrpSerialNum property.
     * 
     */
    public short getOutBillGroupBgrpSerialNum() {
        return outBillGroupBgrpSerialNum;
    }

    /**
     * Sets the value of the outBillGroupBgrpSerialNum property.
     * 
     */
    public void setOutBillGroupBgrpSerialNum(short value) {
        this.outBillGroupBgrpSerialNum = value;
    }

    /**
     * Gets the value of the outBillRegisterBregSerialNum property.
     * 
     */
    public double getOutBillRegisterBregSerialNum() {
        return outBillRegisterBregSerialNum;
    }

    /**
     * Sets the value of the outBillRegisterBregSerialNum property.
     * 
     */
    public void setOutBillRegisterBregSerialNum(double value) {
        this.outBillRegisterBregSerialNum = value;
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
     * Gets the value of the outCustomerColPercCustId property.
     * 
     */
    public int getOutCustomerColPercCustId() {
        return outCustomerColPercCustId;
    }

    /**
     * Sets the value of the outCustomerColPercCustId property.
     * 
     */
    public void setOutCustomerColPercCustId(int value) {
        this.outCustomerColPercCustId = value;
    }

    /**
     * Gets the value of the outCustomerColPercEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerColPercEntryStatus() {
        return outCustomerColPercEntryStatus;
    }

    /**
     * Sets the value of the outCustomerColPercEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerColPercEntryStatus(String value) {
        this.outCustomerColPercEntryStatus = value;
    }

    /**
     * Gets the value of the outCustomerColPercIdProduct property.
     * 
     */
    public int getOutCustomerColPercIdProduct() {
        return outCustomerColPercIdProduct;
    }

    /**
     * Sets the value of the outCustomerColPercIdProduct property.
     * 
     */
    public void setOutCustomerColPercIdProduct(int value) {
        this.outCustomerColPercIdProduct = value;
    }

    /**
     * Gets the value of the outCustomerColPercPercentage property.
     * 
     */
    public int getOutCustomerColPercPercentage() {
        return outCustomerColPercPercentage;
    }

    /**
     * Sets the value of the outCustomerColPercPercentage property.
     * 
     */
    public void setOutCustomerColPercPercentage(int value) {
        this.outCustomerColPercPercentage = value;
    }

    /**
     * Gets the value of the outGrmLogMntRecordingGrpSubscript property.
     * 
     */
    public short getOutGrmLogMntRecordingGrpSubscript() {
        return outGrmLogMntRecordingGrpSubscript;
    }

    /**
     * Sets the value of the outGrmLogMntRecordingGrpSubscript property.
     * 
     */
    public void setOutGrmLogMntRecordingGrpSubscript(short value) {
        this.outGrmLogMntRecordingGrpSubscript = value;
    }

    /**
     * Gets the value of the outGrmLogMntRecordingIdJustific property.
     * 
     */
    public int getOutGrmLogMntRecordingIdJustific() {
        return outGrmLogMntRecordingIdJustific;
    }

    /**
     * Sets the value of the outGrmLogMntRecordingIdJustific property.
     * 
     */
    public void setOutGrmLogMntRecordingIdJustific(int value) {
        this.outGrmLogMntRecordingIdJustific = value;
    }

    /**
     * Gets the value of the outGrmLogMntRecordingIdProduct property.
     * 
     */
    public int getOutGrmLogMntRecordingIdProduct() {
        return outGrmLogMntRecordingIdProduct;
    }

    /**
     * Sets the value of the outGrmLogMntRecordingIdProduct property.
     * 
     */
    public void setOutGrmLogMntRecordingIdProduct(int value) {
        this.outGrmLogMntRecordingIdProduct = value;
    }

    /**
     * Gets the value of the outGrmLogMntRecordingTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrmLogMntRecordingTmstamp() {
        return outGrmLogMntRecordingTmstamp;
    }

    /**
     * Sets the value of the outGrmLogMntRecordingTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrmLogMntRecordingTmstamp(XMLGregorianCalendar value) {
        this.outGrmLogMntRecordingTmstamp = value;
    }

    /**
     * Gets the value of the outGrmLogMntRecordingTrxUsrSn property.
     * 
     */
    public int getOutGrmLogMntRecordingTrxUsrSn() {
        return outGrmLogMntRecordingTrxUsrSn;
    }

    /**
     * Sets the value of the outGrmLogMntRecordingTrxUsrSn property.
     * 
     */
    public void setOutGrmLogMntRecordingTrxUsrSn(int value) {
        this.outGrmLogMntRecordingTrxUsrSn = value;
    }

    /**
     * Gets the value of the outGroupLength property.
     * 
     */
    public int getOutGroupLength() {
        return outGroupLength;
    }

    /**
     * Sets the value of the outGroupLength property.
     * 
     */
    public void setOutGroupLength(int value) {
        this.outGroupLength = value;
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
     * Gets the value of the outInfoBillBillAccountNumb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoBillBillAccountNumb() {
        return outInfoBillBillAccountNumb;
    }

    /**
     * Sets the value of the outInfoBillBillAccountNumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoBillBillAccountNumb(String value) {
        this.outInfoBillBillAccountNumb = value;
    }

    /**
     * Gets the value of the outInfoBillBillAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutInfoBillBillAmount() {
        return outInfoBillBillAmount;
    }

    /**
     * Sets the value of the outInfoBillBillAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutInfoBillBillAmount(BigDecimal value) {
        this.outInfoBillBillAmount = value;
    }

    /**
     * Gets the value of the outInfoBillBillBarcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoBillBillBarcode() {
        return outInfoBillBillBarcode;
    }

    /**
     * Sets the value of the outInfoBillBillBarcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoBillBillBarcode(String value) {
        this.outInfoBillBillBarcode = value;
    }

    /**
     * Gets the value of the outInfoBillBillBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoBillBillBranchCode() {
        return outInfoBillBillBranchCode;
    }

    /**
     * Sets the value of the outInfoBillBillBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoBillBillBranchCode(String value) {
        this.outInfoBillBillBranchCode = value;
    }

    /**
     * Gets the value of the outInfoBillBillCarrierId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoBillBillCarrierId() {
        return outInfoBillBillCarrierId;
    }

    /**
     * Sets the value of the outInfoBillBillCarrierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoBillBillCarrierId(String value) {
        this.outInfoBillBillCarrierId = value;
    }

    /**
     * Gets the value of the outInfoBillBillCarrierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoBillBillCarrierName() {
        return outInfoBillBillCarrierName;
    }

    /**
     * Sets the value of the outInfoBillBillCarrierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoBillBillCarrierName(String value) {
        this.outInfoBillBillCarrierName = value;
    }

    /**
     * Gets the value of the outInfoBillBillCarrierNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoBillBillCarrierNotes() {
        return outInfoBillBillCarrierNotes;
    }

    /**
     * Sets the value of the outInfoBillBillCarrierNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoBillBillCarrierNotes(String value) {
        this.outInfoBillBillCarrierNotes = value;
    }

    /**
     * Gets the value of the outInfoBillBillCarrierTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoBillBillCarrierTitle() {
        return outInfoBillBillCarrierTitle;
    }

    /**
     * Sets the value of the outInfoBillBillCarrierTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoBillBillCarrierTitle(String value) {
        this.outInfoBillBillCarrierTitle = value;
    }

    /**
     * Gets the value of the outInfoBillBillChargesOnacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoBillBillChargesOnacc() {
        return outInfoBillBillChargesOnacc;
    }

    /**
     * Sets the value of the outInfoBillBillChargesOnacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoBillBillChargesOnacc(String value) {
        this.outInfoBillBillChargesOnacc = value;
    }

    /**
     * Gets the value of the outInfoBillBillCheckDigit property.
     * 
     */
    public short getOutInfoBillBillCheckDigit() {
        return outInfoBillBillCheckDigit;
    }

    /**
     * Sets the value of the outInfoBillBillCheckDigit property.
     * 
     */
    public void setOutInfoBillBillCheckDigit(short value) {
        this.outInfoBillBillCheckDigit = value;
    }

    /**
     * Gets the value of the outInfoBillBillClrtypeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoBillBillClrtypeFlag() {
        return outInfoBillBillClrtypeFlag;
    }

    /**
     * Sets the value of the outInfoBillBillClrtypeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoBillBillClrtypeFlag(String value) {
        this.outInfoBillBillClrtypeFlag = value;
    }

    /**
     * Gets the value of the outInfoBillBillCollAccCd property.
     * 
     */
    public short getOutInfoBillBillCollAccCd() {
        return outInfoBillBillCollAccCd;
    }

    /**
     * Sets the value of the outInfoBillBillCollAccCd property.
     * 
     */
    public void setOutInfoBillBillCollAccCd(short value) {
        this.outInfoBillBillCollAccCd = value;
    }

    /**
     * Gets the value of the outInfoBillBillCollAccNumb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoBillBillCollAccNumb() {
        return outInfoBillBillCollAccNumb;
    }

    /**
     * Sets the value of the outInfoBillBillCollAccNumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoBillBillCollAccNumb(String value) {
        this.outInfoBillBillCollAccNumb = value;
    }

    /**
     * Gets the value of the outInfoBillBillCollCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoBillBillCollCode() {
        return outInfoBillBillCollCode;
    }

    /**
     * Sets the value of the outInfoBillBillCollCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoBillBillCollCode(String value) {
        this.outInfoBillBillCollCode = value;
    }

    /**
     * Gets the value of the outInfoBillBillCollJustif property.
     * 
     */
    public int getOutInfoBillBillCollJustif() {
        return outInfoBillBillCollJustif;
    }

    /**
     * Sets the value of the outInfoBillBillCollJustif property.
     * 
     */
    public void setOutInfoBillBillCollJustif(int value) {
        this.outInfoBillBillCollJustif = value;
    }

    /**
     * Gets the value of the outInfoBillBillCollPrfsys property.
     * 
     */
    public short getOutInfoBillBillCollPrfsys() {
        return outInfoBillBillCollPrfsys;
    }

    /**
     * Sets the value of the outInfoBillBillCollPrfsys property.
     * 
     */
    public void setOutInfoBillBillCollPrfsys(short value) {
        this.outInfoBillBillCollPrfsys = value;
    }

    /**
     * Gets the value of the outInfoBillBillCollSn property.
     * 
     */
    public double getOutInfoBillBillCollSn() {
        return outInfoBillBillCollSn;
    }

    /**
     * Sets the value of the outInfoBillBillCollSn property.
     * 
     */
    public void setOutInfoBillBillCollSn(double value) {
        this.outInfoBillBillCollSn = value;
    }

    /**
     * Gets the value of the outInfoBillBillCollTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutInfoBillBillCollTmstamp() {
        return outInfoBillBillCollTmstamp;
    }

    /**
     * Sets the value of the outInfoBillBillCollTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutInfoBillBillCollTmstamp(XMLGregorianCalendar value) {
        this.outInfoBillBillCollTmstamp = value;
    }

    /**
     * Gets the value of the outInfoBillBillCollYieldPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutInfoBillBillCollYieldPerc() {
        return outInfoBillBillCollYieldPerc;
    }

    /**
     * Sets the value of the outInfoBillBillCollYieldPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutInfoBillBillCollYieldPerc(BigDecimal value) {
        this.outInfoBillBillCollYieldPerc = value;
    }

    /**
     * Gets the value of the outInfoBillBillCraccAvldays property.
     * 
     */
    public short getOutInfoBillBillCraccAvldays() {
        return outInfoBillBillCraccAvldays;
    }

    /**
     * Sets the value of the outInfoBillBillCraccAvldays property.
     * 
     */
    public void setOutInfoBillBillCraccAvldays(short value) {
        this.outInfoBillBillCraccAvldays = value;
    }

    /**
     * Gets the value of the outInfoBillBillCrAccCd property.
     * 
     */
    public short getOutInfoBillBillCrAccCd() {
        return outInfoBillBillCrAccCd;
    }

    /**
     * Sets the value of the outInfoBillBillCrAccCd property.
     * 
     */
    public void setOutInfoBillBillCrAccCd(short value) {
        this.outInfoBillBillCrAccCd = value;
    }

    /**
     * Gets the value of the outInfoBillBillCraccIntdays property.
     * 
     */
    public short getOutInfoBillBillCraccIntdays() {
        return outInfoBillBillCraccIntdays;
    }

    /**
     * Sets the value of the outInfoBillBillCraccIntdays property.
     * 
     */
    public void setOutInfoBillBillCraccIntdays(short value) {
        this.outInfoBillBillCraccIntdays = value;
    }

    /**
     * Gets the value of the outInfoBillBillCraccJustif property.
     * 
     */
    public int getOutInfoBillBillCraccJustif() {
        return outInfoBillBillCraccJustif;
    }

    /**
     * Sets the value of the outInfoBillBillCraccJustif property.
     * 
     */
    public void setOutInfoBillBillCraccJustif(int value) {
        this.outInfoBillBillCraccJustif = value;
    }

    /**
     * Gets the value of the outInfoBillBillCrAccNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoBillBillCrAccNumber() {
        return outInfoBillBillCrAccNumber;
    }

    /**
     * Sets the value of the outInfoBillBillCrAccNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoBillBillCrAccNumber(String value) {
        this.outInfoBillBillCrAccNumber = value;
    }

    /**
     * Gets the value of the outInfoBillBillCraccPrfsys property.
     * 
     */
    public short getOutInfoBillBillCraccPrfsys() {
        return outInfoBillBillCraccPrfsys;
    }

    /**
     * Sets the value of the outInfoBillBillCraccPrfsys property.
     * 
     */
    public void setOutInfoBillBillCraccPrfsys(short value) {
        this.outInfoBillBillCraccPrfsys = value;
    }

    /**
     * Gets the value of the outInfoBillBillDebaccCd property.
     * 
     */
    public short getOutInfoBillBillDebaccCd() {
        return outInfoBillBillDebaccCd;
    }

    /**
     * Sets the value of the outInfoBillBillDebaccCd property.
     * 
     */
    public void setOutInfoBillBillDebaccCd(short value) {
        this.outInfoBillBillDebaccCd = value;
    }

    /**
     * Gets the value of the outInfoBillBillDebaccJust property.
     * 
     */
    public int getOutInfoBillBillDebaccJust() {
        return outInfoBillBillDebaccJust;
    }

    /**
     * Sets the value of the outInfoBillBillDebaccJust property.
     * 
     */
    public void setOutInfoBillBillDebaccJust(int value) {
        this.outInfoBillBillDebaccJust = value;
    }

    /**
     * Gets the value of the outInfoBillBillDebaccNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoBillBillDebaccNumber() {
        return outInfoBillBillDebaccNumber;
    }

    /**
     * Sets the value of the outInfoBillBillDebaccNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoBillBillDebaccNumber(String value) {
        this.outInfoBillBillDebaccNumber = value;
    }

    /**
     * Gets the value of the outInfoBillBillDebaccPrfsys property.
     * 
     */
    public short getOutInfoBillBillDebaccPrfsys() {
        return outInfoBillBillDebaccPrfsys;
    }

    /**
     * Sets the value of the outInfoBillBillDebaccPrfsys property.
     * 
     */
    public void setOutInfoBillBillDebaccPrfsys(short value) {
        this.outInfoBillBillDebaccPrfsys = value;
    }

    /**
     * Gets the value of the outInfoBillBillEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoBillBillEntryStatus() {
        return outInfoBillBillEntryStatus;
    }

    /**
     * Sets the value of the outInfoBillBillEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoBillBillEntryStatus(String value) {
        this.outInfoBillBillEntryStatus = value;
    }

    /**
     * Gets the value of the outInfoBillBillExpaccCd property.
     * 
     */
    public short getOutInfoBillBillExpaccCd() {
        return outInfoBillBillExpaccCd;
    }

    /**
     * Sets the value of the outInfoBillBillExpaccCd property.
     * 
     */
    public void setOutInfoBillBillExpaccCd(short value) {
        this.outInfoBillBillExpaccCd = value;
    }

    /**
     * Gets the value of the outInfoBillBillExpaccNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoBillBillExpaccNumber() {
        return outInfoBillBillExpaccNumber;
    }

    /**
     * Sets the value of the outInfoBillBillExpaccNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoBillBillExpaccNumber(String value) {
        this.outInfoBillBillExpaccNumber = value;
    }

    /**
     * Gets the value of the outInfoBillBillExpaccPrfsys property.
     * 
     */
    public short getOutInfoBillBillExpaccPrfsys() {
        return outInfoBillBillExpaccPrfsys;
    }

    /**
     * Sets the value of the outInfoBillBillExpaccPrfsys property.
     * 
     */
    public void setOutInfoBillBillExpaccPrfsys(short value) {
        this.outInfoBillBillExpaccPrfsys = value;
    }

    /**
     * Gets the value of the outInfoBillBillExpDbJust property.
     * 
     */
    public int getOutInfoBillBillExpDbJust() {
        return outInfoBillBillExpDbJust;
    }

    /**
     * Sets the value of the outInfoBillBillExpDbJust property.
     * 
     */
    public void setOutInfoBillBillExpDbJust(int value) {
        this.outInfoBillBillExpDbJust = value;
    }

    /**
     * Gets the value of the outInfoBillBillExpInterdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutInfoBillBillExpInterdate() {
        return outInfoBillBillExpInterdate;
    }

    /**
     * Sets the value of the outInfoBillBillExpInterdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutInfoBillBillExpInterdate(XMLGregorianCalendar value) {
        this.outInfoBillBillExpInterdate = value;
    }

    /**
     * Gets the value of the outInfoBillBillExpInterdays property.
     * 
     */
    public short getOutInfoBillBillExpInterdays() {
        return outInfoBillBillExpInterdays;
    }

    /**
     * Sets the value of the outInfoBillBillExpInterdays property.
     * 
     */
    public void setOutInfoBillBillExpInterdays(short value) {
        this.outInfoBillBillExpInterdays = value;
    }

    /**
     * Gets the value of the outInfoBillBillFinalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutInfoBillBillFinalDate() {
        return outInfoBillBillFinalDate;
    }

    /**
     * Sets the value of the outInfoBillBillFinalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutInfoBillBillFinalDate(XMLGregorianCalendar value) {
        this.outInfoBillBillFinalDate = value;
    }

    /**
     * Gets the value of the outInfoBillBillIbanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoBillBillIbanCode() {
        return outInfoBillBillIbanCode;
    }

    /**
     * Sets the value of the outInfoBillBillIbanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoBillBillIbanCode(String value) {
        this.outInfoBillBillIbanCode = value;
    }

    /**
     * Gets the value of the outInfoBillBillInsDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutInfoBillBillInsDate() {
        return outInfoBillBillInsDate;
    }

    /**
     * Sets the value of the outInfoBillBillInsDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutInfoBillBillInsDate(XMLGregorianCalendar value) {
        this.outInfoBillBillInsDate = value;
    }

    /**
     * Gets the value of the outInfoBillBillIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutInfoBillBillIssueDate() {
        return outInfoBillBillIssueDate;
    }

    /**
     * Sets the value of the outInfoBillBillIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutInfoBillBillIssueDate(XMLGregorianCalendar value) {
        this.outInfoBillBillIssueDate = value;
    }

    /**
     * Gets the value of the outInfoBillBillJustificId property.
     * 
     */
    public int getOutInfoBillBillJustificId() {
        return outInfoBillBillJustificId;
    }

    /**
     * Sets the value of the outInfoBillBillJustificId property.
     * 
     */
    public void setOutInfoBillBillJustificId(int value) {
        this.outInfoBillBillJustificId = value;
    }

    /**
     * Gets the value of the outInfoBillBillNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoBillBillNumber() {
        return outInfoBillBillNumber;
    }

    /**
     * Sets the value of the outInfoBillBillNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoBillBillNumber(String value) {
        this.outInfoBillBillNumber = value;
    }

    /**
     * Gets the value of the outInfoBillBillOwnbankFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoBillBillOwnbankFlag() {
        return outInfoBillBillOwnbankFlag;
    }

    /**
     * Sets the value of the outInfoBillBillOwnbankFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoBillBillOwnbankFlag(String value) {
        this.outInfoBillBillOwnbankFlag = value;
    }

    /**
     * Gets the value of the outInfoBillBillPrftTransId property.
     * 
     */
    public int getOutInfoBillBillPrftTransId() {
        return outInfoBillBillPrftTransId;
    }

    /**
     * Sets the value of the outInfoBillBillPrftTransId property.
     * 
     */
    public void setOutInfoBillBillPrftTransId(int value) {
        this.outInfoBillBillPrftTransId = value;
    }

    /**
     * Gets the value of the outInfoBillBillProductId property.
     * 
     */
    public int getOutInfoBillBillProductId() {
        return outInfoBillBillProductId;
    }

    /**
     * Sets the value of the outInfoBillBillProductId property.
     * 
     */
    public void setOutInfoBillBillProductId(int value) {
        this.outInfoBillBillProductId = value;
    }

    /**
     * Gets the value of the outInfoBillBillRejectedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoBillBillRejectedFlag() {
        return outInfoBillBillRejectedFlag;
    }

    /**
     * Sets the value of the outInfoBillBillRejectedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoBillBillRejectedFlag(String value) {
        this.outInfoBillBillRejectedFlag = value;
    }

    /**
     * Gets the value of the outInfoBillBillRejectNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoBillBillRejectNotes() {
        return outInfoBillBillRejectNotes;
    }

    /**
     * Sets the value of the outInfoBillBillRejectNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoBillBillRejectNotes(String value) {
        this.outInfoBillBillRejectNotes = value;
    }

    /**
     * Gets the value of the outInfoBillBillSendtoclrCnt property.
     * 
     */
    public short getOutInfoBillBillSendtoclrCnt() {
        return outInfoBillBillSendtoclrCnt;
    }

    /**
     * Sets the value of the outInfoBillBillSendtoclrCnt property.
     * 
     */
    public void setOutInfoBillBillSendtoclrCnt(short value) {
        this.outInfoBillBillSendtoclrCnt = value;
    }

    /**
     * Gets the value of the outInfoBillBillSerialNum property.
     * 
     */
    public double getOutInfoBillBillSerialNum() {
        return outInfoBillBillSerialNum;
    }

    /**
     * Sets the value of the outInfoBillBillSerialNum property.
     * 
     */
    public void setOutInfoBillBillSerialNum(double value) {
        this.outInfoBillBillSerialNum = value;
    }

    /**
     * Gets the value of the outInfoBillBillSpecialChars property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoBillBillSpecialChars() {
        return outInfoBillBillSpecialChars;
    }

    /**
     * Sets the value of the outInfoBillBillSpecialChars property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoBillBillSpecialChars(String value) {
        this.outInfoBillBillSpecialChars = value;
    }

    /**
     * Gets the value of the outInfoBillBillStatusFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoBillBillStatusFlag() {
        return outInfoBillBillStatusFlag;
    }

    /**
     * Sets the value of the outInfoBillBillStatusFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoBillBillStatusFlag(String value) {
        this.outInfoBillBillStatusFlag = value;
    }

    /**
     * Gets the value of the outInfoBillBillTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutInfoBillBillTmstamp() {
        return outInfoBillBillTmstamp;
    }

    /**
     * Sets the value of the outInfoBillBillTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutInfoBillBillTmstamp(XMLGregorianCalendar value) {
        this.outInfoBillBillTmstamp = value;
    }

    /**
     * Gets the value of the outInfoBillBillTraceflowFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoBillBillTraceflowFlg() {
        return outInfoBillBillTraceflowFlg;
    }

    /**
     * Sets the value of the outInfoBillBillTraceflowFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoBillBillTraceflowFlg(String value) {
        this.outInfoBillBillTraceflowFlg = value;
    }

    /**
     * Gets the value of the outInfoBillBillTypeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoBillBillTypeFlag() {
        return outInfoBillBillTypeFlag;
    }

    /**
     * Sets the value of the outInfoBillBillTypeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoBillBillTypeFlag(String value) {
        this.outInfoBillBillTypeFlag = value;
    }

    /**
     * Gets the value of the outInfoBillBillUpdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutInfoBillBillUpdDate() {
        return outInfoBillBillUpdDate;
    }

    /**
     * Sets the value of the outInfoBillBillUpdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutInfoBillBillUpdDate(XMLGregorianCalendar value) {
        this.outInfoBillBillUpdDate = value;
    }

    /**
     * Gets the value of the outInfoBillBillUpdUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoBillBillUpdUser() {
        return outInfoBillBillUpdUser;
    }

    /**
     * Sets the value of the outInfoBillBillUpdUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoBillBillUpdUser(String value) {
        this.outInfoBillBillUpdUser = value;
    }

    /**
     * Gets the value of the outInfoBillBillValidateFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoBillBillValidateFlg() {
        return outInfoBillBillValidateFlg;
    }

    /**
     * Sets the value of the outInfoBillBillValidateFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoBillBillValidateFlg(String value) {
        this.outInfoBillBillValidateFlg = value;
    }

    /**
     * Gets the value of the outInfoBillCollTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutInfoBillCollTrxDate() {
        return outInfoBillCollTrxDate;
    }

    /**
     * Sets the value of the outInfoBillCollTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutInfoBillCollTrxDate(XMLGregorianCalendar value) {
        this.outInfoBillCollTrxDate = value;
    }

    /**
     * Gets the value of the outInfoBillCollTrxUnit property.
     * 
     */
    public int getOutInfoBillCollTrxUnit() {
        return outInfoBillCollTrxUnit;
    }

    /**
     * Sets the value of the outInfoBillCollTrxUnit property.
     * 
     */
    public void setOutInfoBillCollTrxUnit(int value) {
        this.outInfoBillCollTrxUnit = value;
    }

    /**
     * Gets the value of the outInfoBillCollTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoBillCollTrxUsr() {
        return outInfoBillCollTrxUsr;
    }

    /**
     * Sets the value of the outInfoBillCollTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoBillCollTrxUsr(String value) {
        this.outInfoBillCollTrxUsr = value;
    }

    /**
     * Gets the value of the outInfoBillCollTrxUsrSn property.
     * 
     */
    public int getOutInfoBillCollTrxUsrSn() {
        return outInfoBillCollTrxUsrSn;
    }

    /**
     * Sets the value of the outInfoBillCollTrxUsrSn property.
     * 
     */
    public void setOutInfoBillCollTrxUsrSn(int value) {
        this.outInfoBillCollTrxUsrSn = value;
    }

    /**
     * Gets the value of the outInfoBillCollTunIntSn property.
     * 
     */
    public short getOutInfoBillCollTunIntSn() {
        return outInfoBillCollTunIntSn;
    }

    /**
     * Sets the value of the outInfoBillCollTunIntSn property.
     * 
     */
    public void setOutInfoBillCollTunIntSn(short value) {
        this.outInfoBillCollTunIntSn = value;
    }

    /**
     * Gets the value of the outInfoBillCrDepTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutInfoBillCrDepTrxDate() {
        return outInfoBillCrDepTrxDate;
    }

    /**
     * Sets the value of the outInfoBillCrDepTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutInfoBillCrDepTrxDate(XMLGregorianCalendar value) {
        this.outInfoBillCrDepTrxDate = value;
    }

    /**
     * Gets the value of the outInfoBillCrDepTrxUnit property.
     * 
     */
    public int getOutInfoBillCrDepTrxUnit() {
        return outInfoBillCrDepTrxUnit;
    }

    /**
     * Sets the value of the outInfoBillCrDepTrxUnit property.
     * 
     */
    public void setOutInfoBillCrDepTrxUnit(int value) {
        this.outInfoBillCrDepTrxUnit = value;
    }

    /**
     * Gets the value of the outInfoBillCrDepTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoBillCrDepTrxUsr() {
        return outInfoBillCrDepTrxUsr;
    }

    /**
     * Sets the value of the outInfoBillCrDepTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoBillCrDepTrxUsr(String value) {
        this.outInfoBillCrDepTrxUsr = value;
    }

    /**
     * Gets the value of the outInfoBillCrDepTrxUsrSn property.
     * 
     */
    public int getOutInfoBillCrDepTrxUsrSn() {
        return outInfoBillCrDepTrxUsrSn;
    }

    /**
     * Sets the value of the outInfoBillCrDepTrxUsrSn property.
     * 
     */
    public void setOutInfoBillCrDepTrxUsrSn(int value) {
        this.outInfoBillCrDepTrxUsrSn = value;
    }

    /**
     * Gets the value of the outInfoBillCrDepTunIntSn property.
     * 
     */
    public short getOutInfoBillCrDepTunIntSn() {
        return outInfoBillCrDepTunIntSn;
    }

    /**
     * Sets the value of the outInfoBillCrDepTunIntSn property.
     * 
     */
    public void setOutInfoBillCrDepTunIntSn(short value) {
        this.outInfoBillCrDepTunIntSn = value;
    }

    /**
     * Gets the value of the outInfoBillCrLnsTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutInfoBillCrLnsTmstamp() {
        return outInfoBillCrLnsTmstamp;
    }

    /**
     * Sets the value of the outInfoBillCrLnsTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutInfoBillCrLnsTmstamp(XMLGregorianCalendar value) {
        this.outInfoBillCrLnsTmstamp = value;
    }

    /**
     * Gets the value of the outInfoBillCrLnsTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutInfoBillCrLnsTrxDate() {
        return outInfoBillCrLnsTrxDate;
    }

    /**
     * Sets the value of the outInfoBillCrLnsTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutInfoBillCrLnsTrxDate(XMLGregorianCalendar value) {
        this.outInfoBillCrLnsTrxDate = value;
    }

    /**
     * Gets the value of the outInfoBillCrLnsTrxIntSn property.
     * 
     */
    public short getOutInfoBillCrLnsTrxIntSn() {
        return outInfoBillCrLnsTrxIntSn;
    }

    /**
     * Sets the value of the outInfoBillCrLnsTrxIntSn property.
     * 
     */
    public void setOutInfoBillCrLnsTrxIntSn(short value) {
        this.outInfoBillCrLnsTrxIntSn = value;
    }

    /**
     * Gets the value of the outInfoBillCrLnsTrxSn property.
     * 
     */
    public int getOutInfoBillCrLnsTrxSn() {
        return outInfoBillCrLnsTrxSn;
    }

    /**
     * Sets the value of the outInfoBillCrLnsTrxSn property.
     * 
     */
    public void setOutInfoBillCrLnsTrxSn(int value) {
        this.outInfoBillCrLnsTrxSn = value;
    }

    /**
     * Gets the value of the outInfoBillCrLnsTrxUnit property.
     * 
     */
    public int getOutInfoBillCrLnsTrxUnit() {
        return outInfoBillCrLnsTrxUnit;
    }

    /**
     * Sets the value of the outInfoBillCrLnsTrxUnit property.
     * 
     */
    public void setOutInfoBillCrLnsTrxUnit(int value) {
        this.outInfoBillCrLnsTrxUnit = value;
    }

    /**
     * Gets the value of the outInfoBillCrLnsTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoBillCrLnsTrxUsr() {
        return outInfoBillCrLnsTrxUsr;
    }

    /**
     * Sets the value of the outInfoBillCrLnsTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoBillCrLnsTrxUsr(String value) {
        this.outInfoBillCrLnsTrxUsr = value;
    }

    /**
     * Gets the value of the outInfoBillDebDepTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutInfoBillDebDepTrxDate() {
        return outInfoBillDebDepTrxDate;
    }

    /**
     * Sets the value of the outInfoBillDebDepTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutInfoBillDebDepTrxDate(XMLGregorianCalendar value) {
        this.outInfoBillDebDepTrxDate = value;
    }

    /**
     * Gets the value of the outInfoBillDebDepTrxUnit property.
     * 
     */
    public int getOutInfoBillDebDepTrxUnit() {
        return outInfoBillDebDepTrxUnit;
    }

    /**
     * Sets the value of the outInfoBillDebDepTrxUnit property.
     * 
     */
    public void setOutInfoBillDebDepTrxUnit(int value) {
        this.outInfoBillDebDepTrxUnit = value;
    }

    /**
     * Gets the value of the outInfoBillDebDepTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoBillDebDepTrxUsr() {
        return outInfoBillDebDepTrxUsr;
    }

    /**
     * Sets the value of the outInfoBillDebDepTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoBillDebDepTrxUsr(String value) {
        this.outInfoBillDebDepTrxUsr = value;
    }

    /**
     * Gets the value of the outInfoBillDebDepTrxUsrSn property.
     * 
     */
    public int getOutInfoBillDebDepTrxUsrSn() {
        return outInfoBillDebDepTrxUsrSn;
    }

    /**
     * Sets the value of the outInfoBillDebDepTrxUsrSn property.
     * 
     */
    public void setOutInfoBillDebDepTrxUsrSn(int value) {
        this.outInfoBillDebDepTrxUsrSn = value;
    }

    /**
     * Gets the value of the outInfoBillDebDepTunIntSn property.
     * 
     */
    public short getOutInfoBillDebDepTunIntSn() {
        return outInfoBillDebDepTunIntSn;
    }

    /**
     * Sets the value of the outInfoBillDebDepTunIntSn property.
     * 
     */
    public void setOutInfoBillDebDepTunIntSn(short value) {
        this.outInfoBillDebDepTunIntSn = value;
    }

    /**
     * Gets the value of the outInfoBillDebLnsTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutInfoBillDebLnsTmstamp() {
        return outInfoBillDebLnsTmstamp;
    }

    /**
     * Sets the value of the outInfoBillDebLnsTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutInfoBillDebLnsTmstamp(XMLGregorianCalendar value) {
        this.outInfoBillDebLnsTmstamp = value;
    }

    /**
     * Gets the value of the outInfoBillDebLnsTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutInfoBillDebLnsTrxDate() {
        return outInfoBillDebLnsTrxDate;
    }

    /**
     * Sets the value of the outInfoBillDebLnsTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutInfoBillDebLnsTrxDate(XMLGregorianCalendar value) {
        this.outInfoBillDebLnsTrxDate = value;
    }

    /**
     * Gets the value of the outInfoBillDebLnsTrxIntSn property.
     * 
     */
    public short getOutInfoBillDebLnsTrxIntSn() {
        return outInfoBillDebLnsTrxIntSn;
    }

    /**
     * Sets the value of the outInfoBillDebLnsTrxIntSn property.
     * 
     */
    public void setOutInfoBillDebLnsTrxIntSn(short value) {
        this.outInfoBillDebLnsTrxIntSn = value;
    }

    /**
     * Gets the value of the outInfoBillDebLnsTrxSn property.
     * 
     */
    public int getOutInfoBillDebLnsTrxSn() {
        return outInfoBillDebLnsTrxSn;
    }

    /**
     * Sets the value of the outInfoBillDebLnsTrxSn property.
     * 
     */
    public void setOutInfoBillDebLnsTrxSn(int value) {
        this.outInfoBillDebLnsTrxSn = value;
    }

    /**
     * Gets the value of the outInfoBillDebLnsTrxUnit property.
     * 
     */
    public int getOutInfoBillDebLnsTrxUnit() {
        return outInfoBillDebLnsTrxUnit;
    }

    /**
     * Sets the value of the outInfoBillDebLnsTrxUnit property.
     * 
     */
    public void setOutInfoBillDebLnsTrxUnit(int value) {
        this.outInfoBillDebLnsTrxUnit = value;
    }

    /**
     * Gets the value of the outInfoBillDebLnsTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoBillDebLnsTrxUsr() {
        return outInfoBillDebLnsTrxUsr;
    }

    /**
     * Sets the value of the outInfoBillDebLnsTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoBillDebLnsTrxUsr(String value) {
        this.outInfoBillDebLnsTrxUsr = value;
    }

    /**
     * Gets the value of the outInfoBillExpDepTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutInfoBillExpDepTrxDate() {
        return outInfoBillExpDepTrxDate;
    }

    /**
     * Sets the value of the outInfoBillExpDepTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutInfoBillExpDepTrxDate(XMLGregorianCalendar value) {
        this.outInfoBillExpDepTrxDate = value;
    }

    /**
     * Gets the value of the outInfoBillExpDepTrxUnit property.
     * 
     */
    public int getOutInfoBillExpDepTrxUnit() {
        return outInfoBillExpDepTrxUnit;
    }

    /**
     * Sets the value of the outInfoBillExpDepTrxUnit property.
     * 
     */
    public void setOutInfoBillExpDepTrxUnit(int value) {
        this.outInfoBillExpDepTrxUnit = value;
    }

    /**
     * Gets the value of the outInfoBillExpDepTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoBillExpDepTrxUsr() {
        return outInfoBillExpDepTrxUsr;
    }

    /**
     * Sets the value of the outInfoBillExpDepTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoBillExpDepTrxUsr(String value) {
        this.outInfoBillExpDepTrxUsr = value;
    }

    /**
     * Gets the value of the outInfoBillExpDepTrxUsrSn property.
     * 
     */
    public int getOutInfoBillExpDepTrxUsrSn() {
        return outInfoBillExpDepTrxUsrSn;
    }

    /**
     * Sets the value of the outInfoBillExpDepTrxUsrSn property.
     * 
     */
    public void setOutInfoBillExpDepTrxUsrSn(int value) {
        this.outInfoBillExpDepTrxUsrSn = value;
    }

    /**
     * Gets the value of the outInfoBillExpDepTunIntSn property.
     * 
     */
    public short getOutInfoBillExpDepTunIntSn() {
        return outInfoBillExpDepTunIntSn;
    }

    /**
     * Sets the value of the outInfoBillExpDepTunIntSn property.
     * 
     */
    public void setOutInfoBillExpDepTunIntSn(short value) {
        this.outInfoBillExpDepTunIntSn = value;
    }

    /**
     * Gets the value of the outInfoBillExpLnsTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutInfoBillExpLnsTmstamp() {
        return outInfoBillExpLnsTmstamp;
    }

    /**
     * Sets the value of the outInfoBillExpLnsTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutInfoBillExpLnsTmstamp(XMLGregorianCalendar value) {
        this.outInfoBillExpLnsTmstamp = value;
    }

    /**
     * Gets the value of the outInfoBillExpLnsTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutInfoBillExpLnsTrxDate() {
        return outInfoBillExpLnsTrxDate;
    }

    /**
     * Sets the value of the outInfoBillExpLnsTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutInfoBillExpLnsTrxDate(XMLGregorianCalendar value) {
        this.outInfoBillExpLnsTrxDate = value;
    }

    /**
     * Gets the value of the outInfoBillExpLnsTrxIntSn property.
     * 
     */
    public short getOutInfoBillExpLnsTrxIntSn() {
        return outInfoBillExpLnsTrxIntSn;
    }

    /**
     * Sets the value of the outInfoBillExpLnsTrxIntSn property.
     * 
     */
    public void setOutInfoBillExpLnsTrxIntSn(short value) {
        this.outInfoBillExpLnsTrxIntSn = value;
    }

    /**
     * Gets the value of the outInfoBillExpLnsTrxSn property.
     * 
     */
    public int getOutInfoBillExpLnsTrxSn() {
        return outInfoBillExpLnsTrxSn;
    }

    /**
     * Sets the value of the outInfoBillExpLnsTrxSn property.
     * 
     */
    public void setOutInfoBillExpLnsTrxSn(int value) {
        this.outInfoBillExpLnsTrxSn = value;
    }

    /**
     * Gets the value of the outInfoBillExpLnsTrxUnit property.
     * 
     */
    public int getOutInfoBillExpLnsTrxUnit() {
        return outInfoBillExpLnsTrxUnit;
    }

    /**
     * Sets the value of the outInfoBillExpLnsTrxUnit property.
     * 
     */
    public void setOutInfoBillExpLnsTrxUnit(int value) {
        this.outInfoBillExpLnsTrxUnit = value;
    }

    /**
     * Gets the value of the outInfoBillExpLnsTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoBillExpLnsTrxUsr() {
        return outInfoBillExpLnsTrxUsr;
    }

    /**
     * Sets the value of the outInfoBillExpLnsTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoBillExpLnsTrxUsr(String value) {
        this.outInfoBillExpLnsTrxUsr = value;
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
     * Gets the value of the outTrxCurrencyIdCurrency property.
     * 
     */
    public int getOutTrxCurrencyIdCurrency() {
        return outTrxCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outTrxCurrencyIdCurrency property.
     * 
     */
    public void setOutTrxCurrencyIdCurrency(int value) {
        this.outTrxCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outTrxCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrxCurrencyShortDescr() {
        return outTrxCurrencyShortDescr;
    }

    /**
     * Sets the value of the outTrxCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrxCurrencyShortDescr(String value) {
        this.outTrxCurrencyShortDescr = value;
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
     * Gets the value of the vlOutPrintoutValidationInputVoucherLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVlOutPrintoutValidationInputVoucherLine() {
        return vlOutPrintoutValidationInputVoucherLine;
    }

    /**
     * Sets the value of the vlOutPrintoutValidationInputVoucherLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVlOutPrintoutValidationInputVoucherLine(String value) {
        this.vlOutPrintoutValidationInputVoucherLine = value;
    }

    /**
     * Gets the value of the outGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGroup }
     *     
     */
    public ArrayOfOutGroup getOutGroup() {
        return outGroup;
    }

    /**
     * Sets the value of the outGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGroup }
     *     
     */
    public void setOutGroup(ArrayOfOutGroup value) {
        this.outGroup = value;
    }

}
