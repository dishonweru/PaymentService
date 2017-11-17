
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for D0303VDepositAccountUpdateImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="D0303VDepositAccountUpdateImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAchBnkCollaborationBanksAchBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAchBnkCollaborationBanksBankId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAchBnkCollaborationBanksBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAchBnkCollaborationBanksEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAddExcesLimitLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAgreementProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAgreementProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InAuthorGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeAchBnkCollaborationBanksAchBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeAchBnkCollaborationBanksBankId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBeforeAchBnkCollaborationBanksBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeAchBnkCollaborationBanksEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeAddExcesLimitLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBeforeAgrUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBeforeAgreementAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBeforeAgreementAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBeforeAgreementAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBeforeCapitalDepositAccountProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeCapitalDepositAccountProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBeforeCcodeGenericDetailEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeCcodeGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeCcodeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBeforeCrDbInterestDepositAccountProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeCrDbInterestDepositAccountProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBeforeCrLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBeforeCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBeforeDbLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBeforeDepAccountInfoCurFxIntExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBeforeDepAccountInfoCurFxIntStDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBeforeDepAccountInfoOaCollFreqUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeDepAccountInfoOaCollectFreq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBeforeDepAccountInfoOaDuration" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBeforeDepAccountInfoOaDurationUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeDepositAccountAccountLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InBeforeDepositAccountAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeDepositAccountAnnounceTolDays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBeforeDepositAccountApprChqAdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBeforeDepositAccountApprChqCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBeforeDepositAccountApprChqEdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBeforeDepositAccountApprChqNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeDepositAccountApprChqPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InBeforeDepositAccountAtmCardFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeDepositAccountAutomChequeOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeDepositAccountBlockedStsExpiry" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBeforeDepositAccountBoePercentance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InBeforeDepositAccountBoeSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InBeforeDepositAccountBookNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBeforeDepositAccountCobenefCount" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBeforeDepositAccountCobenefSnMail" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBeforeDepositAccountColInsertionDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBeforeDepositAccountCollateralFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeDepositAccountCorrespAccInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeDepositAccountCrIntRtSprdInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeDepositAccountCrInterRateSpr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InBeforeDepositAccountDbIntRtSprdInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeDepositAccountDbInterRateSpr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InBeforeDepositAccountDefiniteDelay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeDepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeDepositAccountDrawDownWxpDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBeforeDepositAccountEncroachTolerance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InBeforeDepositAccountEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeDepositAccountExpCrIntSprd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBeforeDepositAccountExpDbIntSprd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBeforeDepositAccountExternalAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeDepositAccountExtraitPrintDay" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBeforeDepositAccountFinalWhldTaxFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeDepositAccountFixedInterFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeDepositAccountFixedInterRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InBeforeDepositAccountHomeBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeDepositAccountIncomeAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InBeforeDepositAccountIncomeFrequency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBeforeDepositAccountInspectionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBeforeDepositAccountKadFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeDepositAccountLastInactiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBeforeDepositAccountLastIntChangDat" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBeforeDepositAccountLastMaxUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBeforeDepositAccountMaxLastDpPer" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InBeforeDepositAccountMaxLastUpdate" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBeforeDepositAccountMinLastMFPer" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InBeforeDepositAccountMultiSalaryAmnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBeforeDepositAccountNotExpensesFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeDepositAccountNotifSpreadDayB" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBeforeDepositAccountNotifSpreadDays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBeforeDepositAccountOfficeAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeDepositAccountOverdraftComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeDepositAccountOverdraftSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InBeforeDepositAccountRenewalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBeforeDepositAccountRenewalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeDepositAccountRestrictAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeDepositAccountRetainingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBeforeDepositAccountSecretAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeDepositAccountServicePenalSpr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InBeforeDepositAccountSpecialAccFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeDepositAccountStatementIssFreq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeDepositAccountTargetFlg" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBeforeDepositAccountTaxExcempFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeDepositAccountTdBatchExtrtFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeDepositAccountTdInterPercentChg" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InBeforeDepositAccountTdInterSprdChg" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InBeforeDepositAccountTelebankingFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeDepositAccountTempExcEndDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBeforeDepositAccountTempExcStartDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBeforeDepositAccountTemporaryExcess" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InBeforeDepositAccountThirdpartyInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeDepositAccountUnclearWithdrFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeDepositAccountUnutilLimitPenD" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InBeforeDepositAccountValidChqDuration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBeforeDepositAccountWebFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeDepositAccountWebModDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBeforeDepositAccountWithdrawAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InBeforeDepositAccountWthdrawSpread" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBeforeHouseUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBeforeKekGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBeforeLkepGenericDetailEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeLkepGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeLkepGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBeforeLpurpGenericDetailEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeLpurpGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBeforeMailCustAddressSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBeforeMonitoringBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeServiceDepositAccountProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeforeServiceDepositAccountProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBeforeUnutillPenLnsCommissionIdCommission" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBeforeWithdrawDayFromIefSuppliedDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBeforeWithdrawDayFromIefSuppliedMonth" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBeforeWithdrawDayToIefSuppliedDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBeforeWithdrawDayToIefSuppliedMonth" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBeneficiaryBeneficiarySn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBlockIefSuppliedText40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCapitalDisposalDepositAccountProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCapitalDisposalDepositAccountProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCcodeGenericDetailEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCcodeGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCcodeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCrDbInterestDepositAccountProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCrDbInterestDepositAccountProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCrLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustCategGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustCategGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustCategGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustidCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDbLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepAccTrAccTrAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDepAccTrAccTrAccSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepAccTrAccTrAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDepAccTrAccTrAccUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepAccountInfoCurFxIntExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepAccountInfoCurFxIntStDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepAccountInfoOaCollFreqUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepAccountInfoOaCollectFreq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDepAccountInfoOaDuration" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDepAccountInfoOaDurationUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepPendingTrxTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepSwiftParticipCounterYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDepSwiftParticipCtiMt940" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepSwiftParticipCtiMt9401" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepSwiftParticipCtiMt9402" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepSwiftParticipCtiMt9403" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepSwiftParticipCtiMt9404" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepSwiftParticipLast940SgCntr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepSwiftParticipLast940SwCntr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepSwiftParticipLast942SgCntr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepSwiftParticipLast950SwCntr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepSwiftParticipLastBalanceMt942" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepSwiftParticipLastCtiMt940" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InDepSwiftParticipLastEntrySerNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepSwiftParticipLastTmstampMt942" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepSwiftParticipLastTransSerNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepSwiftParticipReceiverSwiftId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepSwiftParticipReceiverSwiftId1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepSwiftParticipReceiverSwiftId2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepSwiftParticipReceiverSwiftId3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepSwiftParticipReceiverSwiftId4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepSwiftParticipSenderSwiftId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepSwiftParticipSogecashMt940" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepSwiftParticipSogecashMt9401" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepSwiftParticipSogecashMt9402" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepSwiftParticipSogecashMt9403" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepSwiftParticipSogecashMt9404" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepSwiftParticipSogecashMt942" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepSwiftParticipSogecashMt9421" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepSwiftParticipSogecashMt9422" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepSwiftParticipSogecashMt9423" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepSwiftParticipSogecashMt9424" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepSwiftParticipSwiftMt940" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepSwiftParticipSwiftMt9401" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepSwiftParticipSwiftMt9402" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepSwiftParticipSwiftMt9403" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepSwiftParticipSwiftMt9404" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepSwiftParticipSwiftMt950" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepSwiftParticipSwiftMt9501" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepSwiftParticipSwiftMt9502" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepSwiftParticipSwiftMt9503" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepSwiftParticipSwiftMt9504" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepSwiftParticipSwiftStBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepSwiftParticipSwiftStDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepSwiftParticipTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAtmCardFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositChequeBookFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositCrInterAccLast" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositDepositType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositEncroachTolerance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositMaxCustDpPer" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositMaxUpdate" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDepositMinCustMFPer" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositOverdraftLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositOverdraftMaxsprd" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositPassbookFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositTelebankingFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountAccGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountAccountLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountAccrCrExpInt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountAccrCrInterest" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountAccrDbInterest" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountAccrExcessInter" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountAdditionalInfoFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountAkflag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountAnnounceTolDays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDepositAccountApprChqAdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountApprChqCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountApprChqEdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountApprChqNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountApprChqPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountAtmCardFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountAutomChequeOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountAvailableBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountBackValeurDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountBalanceInterFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountBenefAddressSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDepositAccountBlncBefOverdrn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountBlockedBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountBlockedStsExpiry" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountBoePercentance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountBoeSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountBondNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InDepositAccountBookBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountBookNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDepositAccountCapIncreaseAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountChequeBookFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountChequeBooksCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountChequeOrderedCnt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InDepositAccountChequesBadCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountChequesBadTotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountChequesCancCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountChequesItemCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountChequesLostCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountChequesPaidCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountChequesStampCoun" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountChequesSteaCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountChequesStopCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountChequesUsedCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountClosingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountClosingTotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountCobenefCount" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDepositAccountCobenefCountIns" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDepositAccountCobenefSnMail" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDepositAccountColInsertionDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountCollateralFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountCorrChqDetail1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountCorrChqDetail2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountCorrespAccInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountCrIntRtSprdInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountCrInterRateSpr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountCustPerMFAllow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountDateSinceOverdrn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountDbIntRtSprdInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountDbInterAccNext" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountDbInterRateSpr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountDbProgressInter" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountDbTransitIntTax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountDbTransitionInte" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountDefiniteDelay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountDepositType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountDrawDownWxpDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountDurationUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountDurationValue" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDepositAccountEncroachTolerance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountExpCrIntSprd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountExpDbIntSprd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountExpiryDateTd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountExternalAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountExtraitPrintDay" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDepositAccountExtraitTrxCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountFcInterLcPrim" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountFcInterestLcFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountFcInterestLcNet" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountFinalWhldTaxFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountFixedInterFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountFixedInterRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountForecastBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountGlAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountGlAccountLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountHomeBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountIncomeAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountIncomeFrequency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountInitCrBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountInitDbBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountInitValueBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountInspectionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountInterPayOptions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountInterestPayInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountInterestToWithdr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountInvestFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountIssueOffice" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountKadFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountLastBadCheqDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountLastBatchDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountLastInactiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountLastIntAvgBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountLastIntAvgCr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountLastIntAvgDb" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountLastIntChangDat" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountLastMaxUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountLastModifyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountLastPsbPrint" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountLastTdTrxId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountLastTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountLastTrxId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountLstStatementNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountManualMigrateFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountMaxLastDpPer" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountMaxLastUpdate" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDepositAccountMinLastMFPer" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountMultiSalaryAmnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDepositAccountNostroAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountNotExpensesFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountNotifSpreadDayB" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDepositAccountNotifSpreadDays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDepositAccountOfficeAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountOldAccNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountOpeningBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountOpeningDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountOverdraftComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountOverdraftRenewalFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountOverdraftSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountPassbookFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountPendingExtrLines" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InDepositAccountPrevAccountLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountPrevAvailableBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountPrevBlockedBalan" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountPrevBookBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountPrevDateSinceOv" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountPrevForecastBala" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountPrevLastTrxId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountPrevLstStatement" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountPrevPsbLineSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountPrevTempExcEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountPrevTempExcStar" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountPrevTemporaryExc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountPrevUnclearBala" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountPsbLastBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountPsbLastPrintLn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDepositAccountPsbLineSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountPsbLostInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountPsbPendingLines" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDepositAccountPsbSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountRenewalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountRenewalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountRenewalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountRestrictAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountRetainingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountSecretAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountServicePenalSpr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountSpecAgrPenFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountSpecAgrTrxFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountSpecialAccFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountStampAmountTotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountStartDateTd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountStartWdrBalPrd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountStatementIssFreq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountSystemUsageCnt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InDepositAccountTargetFlg" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDepositAccountTaxExcempFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountTdBatchExtrtFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountTdInterPercentChg" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountTdInterSprdChg" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountTelebankingFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountTempExcEndDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountTempExcStartDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountTemporaryExcess" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountThirdpartyInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountTimestmp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountTotalPartPenalty" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountTransitionIntTax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountTransitionInter" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountUnclearBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountUnclearWithdrFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountUnutilLimitPenD" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountValidChqDuration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountWebFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountWebModDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountWithdrawAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountWithdrawBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountWthdrawSpread" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDpHistInterRateEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InEconomyGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InExtensionAccIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFixedOneAccLnsInterestDurationUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFixedOneAccLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InFixedOneAccLnsInterestIntDuration" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InHouseUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIssueOfficeUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIssueOfficeUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InKekGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLkepGenericDetailEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLkepGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLkepGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLoanAccountRecyclingFrequency" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLpurpGenericDetailEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLpurpGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMailCustAddressSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InMonitoringBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOpenUnitCommentsIefSuppliedText40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPackageIdPackage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InParametersInTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProdidProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProfGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InRetDepFixingRateRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InRetOverdraftCurrencyDisplayedDecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InRetOverdraftCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InRetOverdraftCurrencyNationalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSalePersonGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSaleUnitGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSecondCredIntLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSecretConfirmDepositAccountSecretAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InServiceDepositAccountProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InServiceDepositAccountProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSupervisorsTeamInformationSuper1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSupervisorsTeamInformationSuper2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTaxCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTaxCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTimeDeposRenewalCrInterTaxPcg" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTimeDeposRenewalDaysDuration" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTimeDeposRenewalDurationUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTimeDeposRenewalDurationValue" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTimeDeposRenewalExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTimeDeposRenewalStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InUnutillPenLnsCommissionIdCommission" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InUsedInputCharSuppliedChar37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InWithdrawDayFromIefSuppliedDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InWithdrawDayFromIefSuppliedMonth" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InWithdrawDayToIefSuppliedDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InWithdrawDayToIefSuppliedMonth" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDepositAccountMailStatment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRefereeAccNoIefSuppliedChar100" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRefereeNameIefSuppliedChar100" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountFreeText3IefSuppliedChar100" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountFreeText4IefSuppliedChar100" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountFreeText5IefSuppliedChar100" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCrmCodeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountSwiftMt942" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountSwiftMt940" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "D0303VDepositAccountUpdateImport", propOrder = {
    "command",
    "inAchBnkCollaborationBanksAchBankCode",
    "inAchBnkCollaborationBanksBankId",
    "inAchBnkCollaborationBanksBankName",
    "inAchBnkCollaborationBanksEntryStatus",
    "inAddExcesLimitLnsInterestIdInterest",
    "inAgreementProfitsAccountNumber",
    "inAgreementProfitsAccountCd",
    "inAuthorGrantedIefSuppliedFlag",
    "inBeforeAchBnkCollaborationBanksAchBankCode",
    "inBeforeAchBnkCollaborationBanksBankId",
    "inBeforeAchBnkCollaborationBanksBankName",
    "inBeforeAchBnkCollaborationBanksEntryStatus",
    "inBeforeAddExcesLimitLnsInterestIdInterest",
    "inBeforeAgrUnitCode",
    "inBeforeAgreementAgrMembershipSn",
    "inBeforeAgreementAgrSn",
    "inBeforeAgreementAgrYear",
    "inBeforeCapitalDepositAccountProfitsAccountNumber",
    "inBeforeCapitalDepositAccountProfitsAccountCd",
    "inBeforeCcodeGenericDetailEntryStatus",
    "inBeforeCcodeGenericDetailParameterType",
    "inBeforeCcodeGenericDetailSerialNum",
    "inBeforeCrDbInterestDepositAccountProfitsAccountNumber",
    "inBeforeCrDbInterestDepositAccountProfitsAccountCd",
    "inBeforeCrLnsInterestIdInterest",
    "inBeforeCurrencyIdCurrency",
    "inBeforeDbLnsInterestIdInterest",
    "inBeforeDepAccountInfoCurFxIntExpDt",
    "inBeforeDepAccountInfoCurFxIntStDt",
    "inBeforeDepAccountInfoOaCollFreqUnit",
    "inBeforeDepAccountInfoOaCollectFreq",
    "inBeforeDepAccountInfoOaDuration",
    "inBeforeDepAccountInfoOaDurationUnit",
    "inBeforeDepositAccountAccountLimit",
    "inBeforeDepositAccountAccountType",
    "inBeforeDepositAccountAnnounceTolDays",
    "inBeforeDepositAccountApprChqAdate",
    "inBeforeDepositAccountApprChqCnt",
    "inBeforeDepositAccountApprChqEdate",
    "inBeforeDepositAccountApprChqNo",
    "inBeforeDepositAccountApprChqPerc",
    "inBeforeDepositAccountAtmCardFlag",
    "inBeforeDepositAccountAutomChequeOrder",
    "inBeforeDepositAccountBlockedStsExpiry",
    "inBeforeDepositAccountBoePercentance",
    "inBeforeDepositAccountBoeSpread",
    "inBeforeDepositAccountBookNo",
    "inBeforeDepositAccountCobenefCount",
    "inBeforeDepositAccountCobenefSnMail",
    "inBeforeDepositAccountColInsertionDt",
    "inBeforeDepositAccountCollateralFlg",
    "inBeforeDepositAccountCorrespAccInd",
    "inBeforeDepositAccountCrIntRtSprdInd",
    "inBeforeDepositAccountCrInterRateSpr",
    "inBeforeDepositAccountDbIntRtSprdInd",
    "inBeforeDepositAccountDbInterRateSpr",
    "inBeforeDepositAccountDefiniteDelay",
    "inBeforeDepositAccountDesignation",
    "inBeforeDepositAccountDrawDownWxpDate",
    "inBeforeDepositAccountEncroachTolerance",
    "inBeforeDepositAccountEntryStatus",
    "inBeforeDepositAccountExpCrIntSprd",
    "inBeforeDepositAccountExpDbIntSprd",
    "inBeforeDepositAccountExternalAccFlag",
    "inBeforeDepositAccountExtraitPrintDay",
    "inBeforeDepositAccountFinalWhldTaxFlg",
    "inBeforeDepositAccountFixedInterFlag",
    "inBeforeDepositAccountFixedInterRate",
    "inBeforeDepositAccountHomeBranch",
    "inBeforeDepositAccountIncomeAmnt",
    "inBeforeDepositAccountIncomeFrequency",
    "inBeforeDepositAccountInspectionDate",
    "inBeforeDepositAccountKadFlg",
    "inBeforeDepositAccountLastInactiveDate",
    "inBeforeDepositAccountLastIntChangDat",
    "inBeforeDepositAccountLastMaxUpdateDate",
    "inBeforeDepositAccountMaxLastDpPer",
    "inBeforeDepositAccountMaxLastUpdate",
    "inBeforeDepositAccountMinLastMFPer",
    "inBeforeDepositAccountMultiSalaryAmnt",
    "inBeforeDepositAccountNotExpensesFlg",
    "inBeforeDepositAccountNotifSpreadDayB",
    "inBeforeDepositAccountNotifSpreadDays",
    "inBeforeDepositAccountOfficeAccFlag",
    "inBeforeDepositAccountOverdraftComment",
    "inBeforeDepositAccountOverdraftSpread",
    "inBeforeDepositAccountRenewalDate",
    "inBeforeDepositAccountRenewalFlag",
    "inBeforeDepositAccountRestrictAccFlag",
    "inBeforeDepositAccountRetainingDate",
    "inBeforeDepositAccountSecretAccFlag",
    "inBeforeDepositAccountServicePenalSpr",
    "inBeforeDepositAccountSpecialAccFlg",
    "inBeforeDepositAccountStatementIssFreq",
    "inBeforeDepositAccountTargetFlg",
    "inBeforeDepositAccountTaxExcempFlg",
    "inBeforeDepositAccountTdBatchExtrtFlg",
    "inBeforeDepositAccountTdInterPercentChg",
    "inBeforeDepositAccountTdInterSprdChg",
    "inBeforeDepositAccountTelebankingFlag",
    "inBeforeDepositAccountTempExcEndDt",
    "inBeforeDepositAccountTempExcStartDt",
    "inBeforeDepositAccountTemporaryExcess",
    "inBeforeDepositAccountThirdpartyInd",
    "inBeforeDepositAccountUnclearWithdrFlg",
    "inBeforeDepositAccountUnutilLimitPenD",
    "inBeforeDepositAccountValidChqDuration",
    "inBeforeDepositAccountWebFlg",
    "inBeforeDepositAccountWebModDate",
    "inBeforeDepositAccountWithdrawAmnt",
    "inBeforeDepositAccountWthdrawSpread",
    "inBeforeHouseUnitCode",
    "inBeforeKekGenericDetailSerialNum",
    "inBeforeLkepGenericDetailEntryStatus",
    "inBeforeLkepGenericDetailParameterType",
    "inBeforeLkepGenericDetailSerialNum",
    "inBeforeLpurpGenericDetailEntryStatus",
    "inBeforeLpurpGenericDetailSerialNum",
    "inBeforeMailCustAddressSerialNum",
    "inBeforeMonitoringBankemployeeId",
    "inBeforeServiceDepositAccountProfitsAccountNumber",
    "inBeforeServiceDepositAccountProfitsAccountCd",
    "inBeforeUnutillPenLnsCommissionIdCommission",
    "inBeforeWithdrawDayFromIefSuppliedDays",
    "inBeforeWithdrawDayFromIefSuppliedMonth",
    "inBeforeWithdrawDayToIefSuppliedDays",
    "inBeforeWithdrawDayToIefSuppliedMonth",
    "inBeneficiaryBeneficiarySn",
    "inBlockIefSuppliedText40",
    "inCapitalDisposalDepositAccountProfitsAccountNumber",
    "inCapitalDisposalDepositAccountProfitsAccountCd",
    "inCcodeGenericDetailEntryStatus",
    "inCcodeGenericDetailParameterType",
    "inCcodeGenericDetailSerialNum",
    "inCountryGenericDetailDescription",
    "inCrDbInterestDepositAccountProfitsAccountNumber",
    "inCrDbInterestDepositAccountProfitsAccountCd",
    "inCrLnsInterestIdInterest",
    "inCurrencyIdCurrency",
    "inCustCategGenericDetailDescription",
    "inCustCategGenericDetailParameterType",
    "inCustCategGenericDetailSerialNum",
    "inCustidCustomerCustId",
    "inDbLnsInterestIdInterest",
    "inDepAccTrAccTrAccCd",
    "inDepAccTrAccTrAccSn",
    "inDepAccTrAccTrAccType",
    "inDepAccTrAccTrAccUnit",
    "inDepAccountInfoCurFxIntExpDt",
    "inDepAccountInfoCurFxIntStDt",
    "inDepAccountInfoOaCollFreqUnit",
    "inDepAccountInfoOaCollectFreq",
    "inDepAccountInfoOaDuration",
    "inDepAccountInfoOaDurationUnit",
    "inDepPendingTrxTrxDate",
    "inDepSwiftParticipCounterYear",
    "inDepSwiftParticipCtiMt940",
    "inDepSwiftParticipCtiMt9401",
    "inDepSwiftParticipCtiMt9402",
    "inDepSwiftParticipCtiMt9403",
    "inDepSwiftParticipCtiMt9404",
    "inDepSwiftParticipLast940SgCntr",
    "inDepSwiftParticipLast940SwCntr",
    "inDepSwiftParticipLast942SgCntr",
    "inDepSwiftParticipLast950SwCntr",
    "inDepSwiftParticipLastBalanceMt942",
    "inDepSwiftParticipLastCtiMt940",
    "inDepSwiftParticipLastEntrySerNum",
    "inDepSwiftParticipLastTmstampMt942",
    "inDepSwiftParticipLastTransSerNum",
    "inDepSwiftParticipReceiverSwiftId",
    "inDepSwiftParticipReceiverSwiftId1",
    "inDepSwiftParticipReceiverSwiftId2",
    "inDepSwiftParticipReceiverSwiftId3",
    "inDepSwiftParticipReceiverSwiftId4",
    "inDepSwiftParticipSenderSwiftId",
    "inDepSwiftParticipSogecashMt940",
    "inDepSwiftParticipSogecashMt9401",
    "inDepSwiftParticipSogecashMt9402",
    "inDepSwiftParticipSogecashMt9403",
    "inDepSwiftParticipSogecashMt9404",
    "inDepSwiftParticipSogecashMt942",
    "inDepSwiftParticipSogecashMt9421",
    "inDepSwiftParticipSogecashMt9422",
    "inDepSwiftParticipSogecashMt9423",
    "inDepSwiftParticipSogecashMt9424",
    "inDepSwiftParticipSwiftMt940",
    "inDepSwiftParticipSwiftMt9401",
    "inDepSwiftParticipSwiftMt9402",
    "inDepSwiftParticipSwiftMt9403",
    "inDepSwiftParticipSwiftMt9404",
    "inDepSwiftParticipSwiftMt950",
    "inDepSwiftParticipSwiftMt9501",
    "inDepSwiftParticipSwiftMt9502",
    "inDepSwiftParticipSwiftMt9503",
    "inDepSwiftParticipSwiftMt9504",
    "inDepSwiftParticipSwiftStBal",
    "inDepSwiftParticipSwiftStDate",
    "inDepSwiftParticipTmstamp",
    "inDepositAtmCardFlag",
    "inDepositChequeBookFlag",
    "inDepositCrInterAccLast",
    "inDepositDepositType",
    "inDepositEncroachTolerance",
    "inDepositMaxCustDpPer",
    "inDepositMaxUpdate",
    "inDepositMinCustMFPer",
    "inDepositOverdraftLimit",
    "inDepositOverdraftMaxsprd",
    "inDepositPassbookFlag",
    "inDepositTelebankingFlag",
    "inDepositAccountAccGroup",
    "inDepositAccountAccountLimit",
    "inDepositAccountAccountType",
    "inDepositAccountAccrCrExpInt",
    "inDepositAccountAccrCrInterest",
    "inDepositAccountAccrDbInterest",
    "inDepositAccountAccrExcessInter",
    "inDepositAccountAdditionalInfoFlag",
    "inDepositAccountAkflag",
    "inDepositAccountAnnounceTolDays",
    "inDepositAccountApprChqAdate",
    "inDepositAccountApprChqCnt",
    "inDepositAccountApprChqEdate",
    "inDepositAccountApprChqNo",
    "inDepositAccountApprChqPerc",
    "inDepositAccountAtmCardFlag",
    "inDepositAccountAutomChequeOrder",
    "inDepositAccountAvailableBalance",
    "inDepositAccountBackValeurDt",
    "inDepositAccountBalanceInterFlag",
    "inDepositAccountBenefAddressSn",
    "inDepositAccountBlncBefOverdrn",
    "inDepositAccountBlockedBalance",
    "inDepositAccountBlockedStsExpiry",
    "inDepositAccountBoePercentance",
    "inDepositAccountBoeSpread",
    "inDepositAccountBondNumber",
    "inDepositAccountBookBalance",
    "inDepositAccountBookNo",
    "inDepositAccountProfitsAccountNumber",
    "inDepositAccountProfitsAccountCd",
    "inDepositAccountCapIncreaseAmn",
    "inDepositAccountChequeBookFlag",
    "inDepositAccountChequeBooksCount",
    "inDepositAccountChequeOrderedCnt",
    "inDepositAccountChequesBadCount",
    "inDepositAccountChequesBadTotal",
    "inDepositAccountChequesCancCount",
    "inDepositAccountChequesItemCount",
    "inDepositAccountChequesLostCount",
    "inDepositAccountChequesPaidCount",
    "inDepositAccountChequesStampCoun",
    "inDepositAccountChequesSteaCount",
    "inDepositAccountChequesStopCount",
    "inDepositAccountChequesUsedCount",
    "inDepositAccountClosingDate",
    "inDepositAccountClosingTotal",
    "inDepositAccountCobenefCount",
    "inDepositAccountCobenefCountIns",
    "inDepositAccountCobenefSnMail",
    "inDepositAccountColInsertionDt",
    "inDepositAccountCollateralFlg",
    "inDepositAccountCorrChqDetail1",
    "inDepositAccountCorrChqDetail2",
    "inDepositAccountCorrespAccInd",
    "inDepositAccountCrIntRtSprdInd",
    "inDepositAccountCrInterRateSpr",
    "inDepositAccountCustPerMFAllow",
    "inDepositAccountDateSinceOverdrn",
    "inDepositAccountDbIntRtSprdInd",
    "inDepositAccountDbInterAccNext",
    "inDepositAccountDbInterRateSpr",
    "inDepositAccountDbProgressInter",
    "inDepositAccountDbTransitIntTax",
    "inDepositAccountDbTransitionInte",
    "inDepositAccountDefiniteDelay",
    "inDepositAccountDepositType",
    "inDepositAccountDesignation",
    "inDepositAccountDrawDownWxpDate",
    "inDepositAccountDurationUnit",
    "inDepositAccountDurationValue",
    "inDepositAccountEncroachTolerance",
    "inDepositAccountEntryStatus",
    "inDepositAccountExpCrIntSprd",
    "inDepositAccountExpDbIntSprd",
    "inDepositAccountExpiryDate",
    "inDepositAccountExpiryDateTd",
    "inDepositAccountExternalAccFlag",
    "inDepositAccountExtraitPrintDay",
    "inDepositAccountExtraitTrxCount",
    "inDepositAccountFcInterLcPrim",
    "inDepositAccountFcInterestLcFlg",
    "inDepositAccountFcInterestLcNet",
    "inDepositAccountFinalWhldTaxFlg",
    "inDepositAccountFixedInterFlag",
    "inDepositAccountFixedInterRate",
    "inDepositAccountForecastBalance",
    "inDepositAccountGlAccount",
    "inDepositAccountGlAccountLevel",
    "inDepositAccountHomeBranch",
    "inDepositAccountIncomeAmnt",
    "inDepositAccountIncomeFrequency",
    "inDepositAccountInitCrBalance",
    "inDepositAccountInitDbBalance",
    "inDepositAccountInitValueBalance",
    "inDepositAccountInspectionDate",
    "inDepositAccountInterPayOptions",
    "inDepositAccountInterestPayInd",
    "inDepositAccountInterestToWithdr",
    "inDepositAccountInvestFlag",
    "inDepositAccountIssueOffice",
    "inDepositAccountKadFlg",
    "inDepositAccountLastBadCheqDate",
    "inDepositAccountLastBatchDate",
    "inDepositAccountLastInactiveDate",
    "inDepositAccountLastIntAvgBalance",
    "inDepositAccountLastIntAvgCr",
    "inDepositAccountLastIntAvgDb",
    "inDepositAccountLastIntChangDat",
    "inDepositAccountLastMaxUpdateDate",
    "inDepositAccountLastModifyDate",
    "inDepositAccountLastPsbPrint",
    "inDepositAccountLastTdTrxId",
    "inDepositAccountLastTrxDate",
    "inDepositAccountLastTrxId",
    "inDepositAccountLstStatementNum",
    "inDepositAccountManualMigrateFlg",
    "inDepositAccountMaxLastDpPer",
    "inDepositAccountMaxLastUpdate",
    "inDepositAccountMinLastMFPer",
    "inDepositAccountMultiSalaryAmnt",
    "inDepositAccountNostroAccount",
    "inDepositAccountNotExpensesFlg",
    "inDepositAccountNotifSpreadDayB",
    "inDepositAccountNotifSpreadDays",
    "inDepositAccountOfficeAccFlag",
    "inDepositAccountOldAccNumber",
    "inDepositAccountOpeningBalance",
    "inDepositAccountOpeningDate",
    "inDepositAccountOverdraftComment",
    "inDepositAccountOverdraftRenewalFlg",
    "inDepositAccountOverdraftSpread",
    "inDepositAccountPassbookFlag",
    "inDepositAccountPendingExtrLines",
    "inDepositAccountPrevAccountLimit",
    "inDepositAccountPrevAvailableBal",
    "inDepositAccountPrevBlockedBalan",
    "inDepositAccountPrevBookBalance",
    "inDepositAccountPrevDateSinceOv",
    "inDepositAccountPrevForecastBala",
    "inDepositAccountPrevLastTrxId",
    "inDepositAccountPrevLstStatement",
    "inDepositAccountPrevPsbLineSn",
    "inDepositAccountPrevTempExcEnd",
    "inDepositAccountPrevTempExcStar",
    "inDepositAccountPrevTemporaryExc",
    "inDepositAccountPrevUnclearBala",
    "inDepositAccountPsbLastBalance",
    "inDepositAccountPsbLastPrintLn",
    "inDepositAccountPsbLineSn",
    "inDepositAccountPsbLostInd",
    "inDepositAccountPsbPendingLines",
    "inDepositAccountPsbSn",
    "inDepositAccountRenewalDate",
    "inDepositAccountRenewalFlag",
    "inDepositAccountRenewalNumber",
    "inDepositAccountRestrictAccFlag",
    "inDepositAccountRetainingDate",
    "inDepositAccountSecretAccFlag",
    "inDepositAccountServicePenalSpr",
    "inDepositAccountSpecAgrPenFlg",
    "inDepositAccountSpecAgrTrxFlg",
    "inDepositAccountSpecialAccFlg",
    "inDepositAccountStampAmountTotal",
    "inDepositAccountStartDateTd",
    "inDepositAccountStartWdrBalPrd",
    "inDepositAccountStatementIssFreq",
    "inDepositAccountSystemUsageCnt",
    "inDepositAccountTargetFlg",
    "inDepositAccountTaxExcempFlg",
    "inDepositAccountTdBatchExtrtFlg",
    "inDepositAccountTdInterPercentChg",
    "inDepositAccountTdInterSprdChg",
    "inDepositAccountTelebankingFlag",
    "inDepositAccountTempExcEndDt",
    "inDepositAccountTempExcStartDt",
    "inDepositAccountTemporaryExcess",
    "inDepositAccountThirdpartyInd",
    "inDepositAccountTimestmp",
    "inDepositAccountTotalPartPenalty",
    "inDepositAccountTransitionIntTax",
    "inDepositAccountTransitionInter",
    "inDepositAccountUnclearBalance",
    "inDepositAccountUnclearWithdrFlg",
    "inDepositAccountUnutilLimitPenD",
    "inDepositAccountValidChqDuration",
    "inDepositAccountWebFlg",
    "inDepositAccountWebModDate",
    "inDepositAccountWithdrawAmnt",
    "inDepositAccountWithdrawBalance",
    "inDepositAccountWthdrawSpread",
    "inDpHistInterRateEffectiveDate",
    "inEconomyGenericDetailSerialNum",
    "inExtensionAccIefSuppliedFlag",
    "inFixedOneAccLnsInterestDurationUnit",
    "inFixedOneAccLnsInterestIdInterest",
    "inFixedOneAccLnsInterestIntDuration",
    "inHouseUnitCode",
    "inIssueOfficeUnitCode",
    "inIssueOfficeUnitUnitName",
    "inJustificIdJustific",
    "inKekGenericDetailSerialNum",
    "inLkepGenericDetailEntryStatus",
    "inLkepGenericDetailParameterType",
    "inLkepGenericDetailSerialNum",
    "inLoanAccountRecyclingFrequency",
    "inLpurpGenericDetailEntryStatus",
    "inLpurpGenericDetailSerialNum",
    "inMailCustAddressSerialNum",
    "inMonitoringBankemployeeId",
    "inOpenUnitCommentsIefSuppliedText40",
    "inPackageIdPackage",
    "inParametersInTerminalTerminalNumber",
    "inPrftTransactionIdTransact",
    "inProdidProductIdProduct",
    "inProfGenericDetailSerialNum",
    "inRetDepFixingRateRate",
    "inRetOverdraftCurrencyDisplayedDecimalPlaces",
    "inRetOverdraftCurrencyIdCurrency",
    "inRetOverdraftCurrencyNationalFlag",
    "inSalePersonGenericDetailShortDescription",
    "inSaleUnitGenericDetailSerialNum",
    "inSecondCredIntLnsInterestIdInterest",
    "inSecretConfirmDepositAccountSecretAccFlag",
    "inServiceDepositAccountProfitsAccountNumber",
    "inServiceDepositAccountProfitsAccountCd",
    "inSupervisorsTeamInformationSuper1Code",
    "inSupervisorsTeamInformationSuper2Code",
    "inTaxCountryGenericDetailDescription",
    "inTaxCountryGenericDetailShortDescription",
    "inTimeDeposRenewalCrInterTaxPcg",
    "inTimeDeposRenewalDaysDuration",
    "inTimeDeposRenewalDurationUnit",
    "inTimeDeposRenewalDurationValue",
    "inTimeDeposRenewalExpiryDate",
    "inTimeDeposRenewalStartDate",
    "inUnutillPenLnsCommissionIdCommission",
    "inUsedInputCharSuppliedChar37",
    "inWithdrawDayFromIefSuppliedDays",
    "inWithdrawDayFromIefSuppliedMonth",
    "inWithdrawDayToIefSuppliedDays",
    "inWithdrawDayToIefSuppliedMonth",
    "inDepositAccountMailStatment",
    "inRefereeAccNoIefSuppliedChar100",
    "inRefereeNameIefSuppliedChar100",
    "inDepositAccountFreeText3IefSuppliedChar100",
    "inDepositAccountFreeText4IefSuppliedChar100",
    "inDepositAccountFreeText5IefSuppliedChar100",
    "inCrmCodeGenericDetailSerialNum",
    "inDepositAccountSwiftMt942",
    "inDepositAccountSwiftMt940"
})
public class D0303VDepositAccountUpdateImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InAchBnkCollaborationBanksAchBankCode")
    protected String inAchBnkCollaborationBanksAchBankCode;
    @XmlElement(name = "InAchBnkCollaborationBanksBankId")
    protected int inAchBnkCollaborationBanksBankId;
    @XmlElement(name = "InAchBnkCollaborationBanksBankName")
    protected String inAchBnkCollaborationBanksBankName;
    @XmlElement(name = "InAchBnkCollaborationBanksEntryStatus")
    protected String inAchBnkCollaborationBanksEntryStatus;
    @XmlElement(name = "InAddExcesLimitLnsInterestIdInterest")
    protected int inAddExcesLimitLnsInterestIdInterest;
    @XmlElement(name = "InAgreementProfitsAccountNumber")
    protected String inAgreementProfitsAccountNumber;
    @XmlElement(name = "InAgreementProfitsAccountCd")
    protected short inAgreementProfitsAccountCd;
    @XmlElement(name = "InAuthorGrantedIefSuppliedFlag")
    protected String inAuthorGrantedIefSuppliedFlag;
    @XmlElement(name = "InBeforeAchBnkCollaborationBanksAchBankCode")
    protected String inBeforeAchBnkCollaborationBanksAchBankCode;
    @XmlElement(name = "InBeforeAchBnkCollaborationBanksBankId")
    protected int inBeforeAchBnkCollaborationBanksBankId;
    @XmlElement(name = "InBeforeAchBnkCollaborationBanksBankName")
    protected String inBeforeAchBnkCollaborationBanksBankName;
    @XmlElement(name = "InBeforeAchBnkCollaborationBanksEntryStatus")
    protected String inBeforeAchBnkCollaborationBanksEntryStatus;
    @XmlElement(name = "InBeforeAddExcesLimitLnsInterestIdInterest")
    protected int inBeforeAddExcesLimitLnsInterestIdInterest;
    @XmlElement(name = "InBeforeAgrUnitCode")
    protected int inBeforeAgrUnitCode;
    @XmlElement(name = "InBeforeAgreementAgrMembershipSn")
    protected int inBeforeAgreementAgrMembershipSn;
    @XmlElement(name = "InBeforeAgreementAgrSn")
    protected int inBeforeAgreementAgrSn;
    @XmlElement(name = "InBeforeAgreementAgrYear")
    protected short inBeforeAgreementAgrYear;
    @XmlElement(name = "InBeforeCapitalDepositAccountProfitsAccountNumber")
    protected String inBeforeCapitalDepositAccountProfitsAccountNumber;
    @XmlElement(name = "InBeforeCapitalDepositAccountProfitsAccountCd")
    protected short inBeforeCapitalDepositAccountProfitsAccountCd;
    @XmlElement(name = "InBeforeCcodeGenericDetailEntryStatus")
    protected String inBeforeCcodeGenericDetailEntryStatus;
    @XmlElement(name = "InBeforeCcodeGenericDetailParameterType")
    protected String inBeforeCcodeGenericDetailParameterType;
    @XmlElement(name = "InBeforeCcodeGenericDetailSerialNum")
    protected int inBeforeCcodeGenericDetailSerialNum;
    @XmlElement(name = "InBeforeCrDbInterestDepositAccountProfitsAccountNumber")
    protected String inBeforeCrDbInterestDepositAccountProfitsAccountNumber;
    @XmlElement(name = "InBeforeCrDbInterestDepositAccountProfitsAccountCd")
    protected short inBeforeCrDbInterestDepositAccountProfitsAccountCd;
    @XmlElement(name = "InBeforeCrLnsInterestIdInterest")
    protected int inBeforeCrLnsInterestIdInterest;
    @XmlElement(name = "InBeforeCurrencyIdCurrency")
    protected int inBeforeCurrencyIdCurrency;
    @XmlElement(name = "InBeforeDbLnsInterestIdInterest")
    protected int inBeforeDbLnsInterestIdInterest;
    @XmlElement(name = "InBeforeDepAccountInfoCurFxIntExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBeforeDepAccountInfoCurFxIntExpDt;
    @XmlElement(name = "InBeforeDepAccountInfoCurFxIntStDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBeforeDepAccountInfoCurFxIntStDt;
    @XmlElement(name = "InBeforeDepAccountInfoOaCollFreqUnit")
    protected String inBeforeDepAccountInfoOaCollFreqUnit;
    @XmlElement(name = "InBeforeDepAccountInfoOaCollectFreq")
    protected short inBeforeDepAccountInfoOaCollectFreq;
    @XmlElement(name = "InBeforeDepAccountInfoOaDuration")
    protected short inBeforeDepAccountInfoOaDuration;
    @XmlElement(name = "InBeforeDepAccountInfoOaDurationUnit")
    protected String inBeforeDepAccountInfoOaDurationUnit;
    @XmlElement(name = "InBeforeDepositAccountAccountLimit", required = true)
    protected BigDecimal inBeforeDepositAccountAccountLimit;
    @XmlElement(name = "InBeforeDepositAccountAccountType")
    protected String inBeforeDepositAccountAccountType;
    @XmlElement(name = "InBeforeDepositAccountAnnounceTolDays")
    protected short inBeforeDepositAccountAnnounceTolDays;
    @XmlElement(name = "InBeforeDepositAccountApprChqAdate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBeforeDepositAccountApprChqAdate;
    @XmlElement(name = "InBeforeDepositAccountApprChqCnt")
    protected int inBeforeDepositAccountApprChqCnt;
    @XmlElement(name = "InBeforeDepositAccountApprChqEdate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBeforeDepositAccountApprChqEdate;
    @XmlElement(name = "InBeforeDepositAccountApprChqNo")
    protected String inBeforeDepositAccountApprChqNo;
    @XmlElement(name = "InBeforeDepositAccountApprChqPerc", required = true)
    protected BigDecimal inBeforeDepositAccountApprChqPerc;
    @XmlElement(name = "InBeforeDepositAccountAtmCardFlag")
    protected String inBeforeDepositAccountAtmCardFlag;
    @XmlElement(name = "InBeforeDepositAccountAutomChequeOrder")
    protected String inBeforeDepositAccountAutomChequeOrder;
    @XmlElement(name = "InBeforeDepositAccountBlockedStsExpiry", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBeforeDepositAccountBlockedStsExpiry;
    @XmlElement(name = "InBeforeDepositAccountBoePercentance", required = true)
    protected BigDecimal inBeforeDepositAccountBoePercentance;
    @XmlElement(name = "InBeforeDepositAccountBoeSpread", required = true)
    protected BigDecimal inBeforeDepositAccountBoeSpread;
    @XmlElement(name = "InBeforeDepositAccountBookNo")
    protected int inBeforeDepositAccountBookNo;
    @XmlElement(name = "InBeforeDepositAccountCobenefCount")
    protected short inBeforeDepositAccountCobenefCount;
    @XmlElement(name = "InBeforeDepositAccountCobenefSnMail")
    protected short inBeforeDepositAccountCobenefSnMail;
    @XmlElement(name = "InBeforeDepositAccountColInsertionDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBeforeDepositAccountColInsertionDt;
    @XmlElement(name = "InBeforeDepositAccountCollateralFlg")
    protected String inBeforeDepositAccountCollateralFlg;
    @XmlElement(name = "InBeforeDepositAccountCorrespAccInd")
    protected String inBeforeDepositAccountCorrespAccInd;
    @XmlElement(name = "InBeforeDepositAccountCrIntRtSprdInd")
    protected String inBeforeDepositAccountCrIntRtSprdInd;
    @XmlElement(name = "InBeforeDepositAccountCrInterRateSpr", required = true)
    protected BigDecimal inBeforeDepositAccountCrInterRateSpr;
    @XmlElement(name = "InBeforeDepositAccountDbIntRtSprdInd")
    protected String inBeforeDepositAccountDbIntRtSprdInd;
    @XmlElement(name = "InBeforeDepositAccountDbInterRateSpr", required = true)
    protected BigDecimal inBeforeDepositAccountDbInterRateSpr;
    @XmlElement(name = "InBeforeDepositAccountDefiniteDelay")
    protected String inBeforeDepositAccountDefiniteDelay;
    @XmlElement(name = "InBeforeDepositAccountDesignation")
    protected String inBeforeDepositAccountDesignation;
    @XmlElement(name = "InBeforeDepositAccountDrawDownWxpDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBeforeDepositAccountDrawDownWxpDate;
    @XmlElement(name = "InBeforeDepositAccountEncroachTolerance", required = true)
    protected BigDecimal inBeforeDepositAccountEncroachTolerance;
    @XmlElement(name = "InBeforeDepositAccountEntryStatus")
    protected String inBeforeDepositAccountEntryStatus;
    @XmlElement(name = "InBeforeDepositAccountExpCrIntSprd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBeforeDepositAccountExpCrIntSprd;
    @XmlElement(name = "InBeforeDepositAccountExpDbIntSprd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBeforeDepositAccountExpDbIntSprd;
    @XmlElement(name = "InBeforeDepositAccountExternalAccFlag")
    protected String inBeforeDepositAccountExternalAccFlag;
    @XmlElement(name = "InBeforeDepositAccountExtraitPrintDay")
    protected short inBeforeDepositAccountExtraitPrintDay;
    @XmlElement(name = "InBeforeDepositAccountFinalWhldTaxFlg")
    protected String inBeforeDepositAccountFinalWhldTaxFlg;
    @XmlElement(name = "InBeforeDepositAccountFixedInterFlag")
    protected String inBeforeDepositAccountFixedInterFlag;
    @XmlElement(name = "InBeforeDepositAccountFixedInterRate", required = true)
    protected BigDecimal inBeforeDepositAccountFixedInterRate;
    @XmlElement(name = "InBeforeDepositAccountHomeBranch")
    protected String inBeforeDepositAccountHomeBranch;
    @XmlElement(name = "InBeforeDepositAccountIncomeAmnt", required = true)
    protected BigDecimal inBeforeDepositAccountIncomeAmnt;
    @XmlElement(name = "InBeforeDepositAccountIncomeFrequency")
    protected int inBeforeDepositAccountIncomeFrequency;
    @XmlElement(name = "InBeforeDepositAccountInspectionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBeforeDepositAccountInspectionDate;
    @XmlElement(name = "InBeforeDepositAccountKadFlg")
    protected String inBeforeDepositAccountKadFlg;
    @XmlElement(name = "InBeforeDepositAccountLastInactiveDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBeforeDepositAccountLastInactiveDate;
    @XmlElement(name = "InBeforeDepositAccountLastIntChangDat", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBeforeDepositAccountLastIntChangDat;
    @XmlElement(name = "InBeforeDepositAccountLastMaxUpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBeforeDepositAccountLastMaxUpdateDate;
    @XmlElement(name = "InBeforeDepositAccountMaxLastDpPer", required = true)
    protected BigDecimal inBeforeDepositAccountMaxLastDpPer;
    @XmlElement(name = "InBeforeDepositAccountMaxLastUpdate")
    protected short inBeforeDepositAccountMaxLastUpdate;
    @XmlElement(name = "InBeforeDepositAccountMinLastMFPer", required = true)
    protected BigDecimal inBeforeDepositAccountMinLastMFPer;
    @XmlElement(name = "InBeforeDepositAccountMultiSalaryAmnt")
    protected short inBeforeDepositAccountMultiSalaryAmnt;
    @XmlElement(name = "InBeforeDepositAccountNotExpensesFlg")
    protected String inBeforeDepositAccountNotExpensesFlg;
    @XmlElement(name = "InBeforeDepositAccountNotifSpreadDayB")
    protected short inBeforeDepositAccountNotifSpreadDayB;
    @XmlElement(name = "InBeforeDepositAccountNotifSpreadDays")
    protected short inBeforeDepositAccountNotifSpreadDays;
    @XmlElement(name = "InBeforeDepositAccountOfficeAccFlag")
    protected String inBeforeDepositAccountOfficeAccFlag;
    @XmlElement(name = "InBeforeDepositAccountOverdraftComment")
    protected String inBeforeDepositAccountOverdraftComment;
    @XmlElement(name = "InBeforeDepositAccountOverdraftSpread", required = true)
    protected BigDecimal inBeforeDepositAccountOverdraftSpread;
    @XmlElement(name = "InBeforeDepositAccountRenewalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBeforeDepositAccountRenewalDate;
    @XmlElement(name = "InBeforeDepositAccountRenewalFlag")
    protected String inBeforeDepositAccountRenewalFlag;
    @XmlElement(name = "InBeforeDepositAccountRestrictAccFlag")
    protected String inBeforeDepositAccountRestrictAccFlag;
    @XmlElement(name = "InBeforeDepositAccountRetainingDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBeforeDepositAccountRetainingDate;
    @XmlElement(name = "InBeforeDepositAccountSecretAccFlag")
    protected String inBeforeDepositAccountSecretAccFlag;
    @XmlElement(name = "InBeforeDepositAccountServicePenalSpr", required = true)
    protected BigDecimal inBeforeDepositAccountServicePenalSpr;
    @XmlElement(name = "InBeforeDepositAccountSpecialAccFlg")
    protected String inBeforeDepositAccountSpecialAccFlg;
    @XmlElement(name = "InBeforeDepositAccountStatementIssFreq")
    protected String inBeforeDepositAccountStatementIssFreq;
    @XmlElement(name = "InBeforeDepositAccountTargetFlg")
    protected short inBeforeDepositAccountTargetFlg;
    @XmlElement(name = "InBeforeDepositAccountTaxExcempFlg")
    protected String inBeforeDepositAccountTaxExcempFlg;
    @XmlElement(name = "InBeforeDepositAccountTdBatchExtrtFlg")
    protected String inBeforeDepositAccountTdBatchExtrtFlg;
    @XmlElement(name = "InBeforeDepositAccountTdInterPercentChg", required = true)
    protected BigDecimal inBeforeDepositAccountTdInterPercentChg;
    @XmlElement(name = "InBeforeDepositAccountTdInterSprdChg", required = true)
    protected BigDecimal inBeforeDepositAccountTdInterSprdChg;
    @XmlElement(name = "InBeforeDepositAccountTelebankingFlag")
    protected String inBeforeDepositAccountTelebankingFlag;
    @XmlElement(name = "InBeforeDepositAccountTempExcEndDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBeforeDepositAccountTempExcEndDt;
    @XmlElement(name = "InBeforeDepositAccountTempExcStartDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBeforeDepositAccountTempExcStartDt;
    @XmlElement(name = "InBeforeDepositAccountTemporaryExcess", required = true)
    protected BigDecimal inBeforeDepositAccountTemporaryExcess;
    @XmlElement(name = "InBeforeDepositAccountThirdpartyInd")
    protected String inBeforeDepositAccountThirdpartyInd;
    @XmlElement(name = "InBeforeDepositAccountUnclearWithdrFlg")
    protected String inBeforeDepositAccountUnclearWithdrFlg;
    @XmlElement(name = "InBeforeDepositAccountUnutilLimitPenD", required = true)
    protected BigDecimal inBeforeDepositAccountUnutilLimitPenD;
    @XmlElement(name = "InBeforeDepositAccountValidChqDuration")
    protected int inBeforeDepositAccountValidChqDuration;
    @XmlElement(name = "InBeforeDepositAccountWebFlg")
    protected String inBeforeDepositAccountWebFlg;
    @XmlElement(name = "InBeforeDepositAccountWebModDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBeforeDepositAccountWebModDate;
    @XmlElement(name = "InBeforeDepositAccountWithdrawAmnt", required = true)
    protected BigDecimal inBeforeDepositAccountWithdrawAmnt;
    @XmlElement(name = "InBeforeDepositAccountWthdrawSpread")
    protected short inBeforeDepositAccountWthdrawSpread;
    @XmlElement(name = "InBeforeHouseUnitCode")
    protected int inBeforeHouseUnitCode;
    @XmlElement(name = "InBeforeKekGenericDetailSerialNum")
    protected int inBeforeKekGenericDetailSerialNum;
    @XmlElement(name = "InBeforeLkepGenericDetailEntryStatus")
    protected String inBeforeLkepGenericDetailEntryStatus;
    @XmlElement(name = "InBeforeLkepGenericDetailParameterType")
    protected String inBeforeLkepGenericDetailParameterType;
    @XmlElement(name = "InBeforeLkepGenericDetailSerialNum")
    protected int inBeforeLkepGenericDetailSerialNum;
    @XmlElement(name = "InBeforeLpurpGenericDetailEntryStatus")
    protected String inBeforeLpurpGenericDetailEntryStatus;
    @XmlElement(name = "InBeforeLpurpGenericDetailSerialNum")
    protected int inBeforeLpurpGenericDetailSerialNum;
    @XmlElement(name = "InBeforeMailCustAddressSerialNum")
    protected short inBeforeMailCustAddressSerialNum;
    @XmlElement(name = "InBeforeMonitoringBankemployeeId")
    protected String inBeforeMonitoringBankemployeeId;
    @XmlElement(name = "InBeforeServiceDepositAccountProfitsAccountNumber")
    protected String inBeforeServiceDepositAccountProfitsAccountNumber;
    @XmlElement(name = "InBeforeServiceDepositAccountProfitsAccountCd")
    protected short inBeforeServiceDepositAccountProfitsAccountCd;
    @XmlElement(name = "InBeforeUnutillPenLnsCommissionIdCommission")
    protected int inBeforeUnutillPenLnsCommissionIdCommission;
    @XmlElement(name = "InBeforeWithdrawDayFromIefSuppliedDays")
    protected int inBeforeWithdrawDayFromIefSuppliedDays;
    @XmlElement(name = "InBeforeWithdrawDayFromIefSuppliedMonth")
    protected short inBeforeWithdrawDayFromIefSuppliedMonth;
    @XmlElement(name = "InBeforeWithdrawDayToIefSuppliedDays")
    protected int inBeforeWithdrawDayToIefSuppliedDays;
    @XmlElement(name = "InBeforeWithdrawDayToIefSuppliedMonth")
    protected short inBeforeWithdrawDayToIefSuppliedMonth;
    @XmlElement(name = "InBeneficiaryBeneficiarySn")
    protected short inBeneficiaryBeneficiarySn;
    @XmlElement(name = "InBlockIefSuppliedText40")
    protected String inBlockIefSuppliedText40;
    @XmlElement(name = "InCapitalDisposalDepositAccountProfitsAccountNumber")
    protected String inCapitalDisposalDepositAccountProfitsAccountNumber;
    @XmlElement(name = "InCapitalDisposalDepositAccountProfitsAccountCd")
    protected short inCapitalDisposalDepositAccountProfitsAccountCd;
    @XmlElement(name = "InCcodeGenericDetailEntryStatus")
    protected String inCcodeGenericDetailEntryStatus;
    @XmlElement(name = "InCcodeGenericDetailParameterType")
    protected String inCcodeGenericDetailParameterType;
    @XmlElement(name = "InCcodeGenericDetailSerialNum")
    protected int inCcodeGenericDetailSerialNum;
    @XmlElement(name = "InCountryGenericDetailDescription")
    protected String inCountryGenericDetailDescription;
    @XmlElement(name = "InCrDbInterestDepositAccountProfitsAccountNumber")
    protected String inCrDbInterestDepositAccountProfitsAccountNumber;
    @XmlElement(name = "InCrDbInterestDepositAccountProfitsAccountCd")
    protected short inCrDbInterestDepositAccountProfitsAccountCd;
    @XmlElement(name = "InCrLnsInterestIdInterest")
    protected int inCrLnsInterestIdInterest;
    @XmlElement(name = "InCurrencyIdCurrency")
    protected int inCurrencyIdCurrency;
    @XmlElement(name = "InCustCategGenericDetailDescription")
    protected String inCustCategGenericDetailDescription;
    @XmlElement(name = "InCustCategGenericDetailParameterType")
    protected String inCustCategGenericDetailParameterType;
    @XmlElement(name = "InCustCategGenericDetailSerialNum")
    protected int inCustCategGenericDetailSerialNum;
    @XmlElement(name = "InCustidCustomerCustId")
    protected int inCustidCustomerCustId;
    @XmlElement(name = "InDbLnsInterestIdInterest")
    protected int inDbLnsInterestIdInterest;
    @XmlElement(name = "InDepAccTrAccTrAccCd")
    protected short inDepAccTrAccTrAccCd;
    @XmlElement(name = "InDepAccTrAccTrAccSn")
    protected int inDepAccTrAccTrAccSn;
    @XmlElement(name = "InDepAccTrAccTrAccType")
    protected short inDepAccTrAccTrAccType;
    @XmlElement(name = "InDepAccTrAccTrAccUnit")
    protected int inDepAccTrAccTrAccUnit;
    @XmlElement(name = "InDepAccountInfoCurFxIntExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepAccountInfoCurFxIntExpDt;
    @XmlElement(name = "InDepAccountInfoCurFxIntStDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepAccountInfoCurFxIntStDt;
    @XmlElement(name = "InDepAccountInfoOaCollFreqUnit")
    protected String inDepAccountInfoOaCollFreqUnit;
    @XmlElement(name = "InDepAccountInfoOaCollectFreq")
    protected short inDepAccountInfoOaCollectFreq;
    @XmlElement(name = "InDepAccountInfoOaDuration")
    protected short inDepAccountInfoOaDuration;
    @XmlElement(name = "InDepAccountInfoOaDurationUnit")
    protected String inDepAccountInfoOaDurationUnit;
    @XmlElement(name = "InDepPendingTrxTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepPendingTrxTrxDate;
    @XmlElement(name = "InDepSwiftParticipCounterYear")
    protected short inDepSwiftParticipCounterYear;
    @XmlElement(name = "InDepSwiftParticipCtiMt940")
    protected String inDepSwiftParticipCtiMt940;
    @XmlElement(name = "InDepSwiftParticipCtiMt9401")
    protected String inDepSwiftParticipCtiMt9401;
    @XmlElement(name = "InDepSwiftParticipCtiMt9402")
    protected String inDepSwiftParticipCtiMt9402;
    @XmlElement(name = "InDepSwiftParticipCtiMt9403")
    protected String inDepSwiftParticipCtiMt9403;
    @XmlElement(name = "InDepSwiftParticipCtiMt9404")
    protected String inDepSwiftParticipCtiMt9404;
    @XmlElement(name = "InDepSwiftParticipLast940SgCntr")
    protected int inDepSwiftParticipLast940SgCntr;
    @XmlElement(name = "InDepSwiftParticipLast940SwCntr")
    protected int inDepSwiftParticipLast940SwCntr;
    @XmlElement(name = "InDepSwiftParticipLast942SgCntr")
    protected int inDepSwiftParticipLast942SgCntr;
    @XmlElement(name = "InDepSwiftParticipLast950SwCntr")
    protected int inDepSwiftParticipLast950SwCntr;
    @XmlElement(name = "InDepSwiftParticipLastBalanceMt942", required = true)
    protected BigDecimal inDepSwiftParticipLastBalanceMt942;
    @XmlElement(name = "InDepSwiftParticipLastCtiMt940")
    protected double inDepSwiftParticipLastCtiMt940;
    @XmlElement(name = "InDepSwiftParticipLastEntrySerNum")
    protected int inDepSwiftParticipLastEntrySerNum;
    @XmlElement(name = "InDepSwiftParticipLastTmstampMt942", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepSwiftParticipLastTmstampMt942;
    @XmlElement(name = "InDepSwiftParticipLastTransSerNum")
    protected int inDepSwiftParticipLastTransSerNum;
    @XmlElement(name = "InDepSwiftParticipReceiverSwiftId")
    protected String inDepSwiftParticipReceiverSwiftId;
    @XmlElement(name = "InDepSwiftParticipReceiverSwiftId1")
    protected String inDepSwiftParticipReceiverSwiftId1;
    @XmlElement(name = "InDepSwiftParticipReceiverSwiftId2")
    protected String inDepSwiftParticipReceiverSwiftId2;
    @XmlElement(name = "InDepSwiftParticipReceiverSwiftId3")
    protected String inDepSwiftParticipReceiverSwiftId3;
    @XmlElement(name = "InDepSwiftParticipReceiverSwiftId4")
    protected String inDepSwiftParticipReceiverSwiftId4;
    @XmlElement(name = "InDepSwiftParticipSenderSwiftId")
    protected String inDepSwiftParticipSenderSwiftId;
    @XmlElement(name = "InDepSwiftParticipSogecashMt940")
    protected String inDepSwiftParticipSogecashMt940;
    @XmlElement(name = "InDepSwiftParticipSogecashMt9401")
    protected String inDepSwiftParticipSogecashMt9401;
    @XmlElement(name = "InDepSwiftParticipSogecashMt9402")
    protected String inDepSwiftParticipSogecashMt9402;
    @XmlElement(name = "InDepSwiftParticipSogecashMt9403")
    protected String inDepSwiftParticipSogecashMt9403;
    @XmlElement(name = "InDepSwiftParticipSogecashMt9404")
    protected String inDepSwiftParticipSogecashMt9404;
    @XmlElement(name = "InDepSwiftParticipSogecashMt942")
    protected String inDepSwiftParticipSogecashMt942;
    @XmlElement(name = "InDepSwiftParticipSogecashMt9421")
    protected String inDepSwiftParticipSogecashMt9421;
    @XmlElement(name = "InDepSwiftParticipSogecashMt9422")
    protected String inDepSwiftParticipSogecashMt9422;
    @XmlElement(name = "InDepSwiftParticipSogecashMt9423")
    protected String inDepSwiftParticipSogecashMt9423;
    @XmlElement(name = "InDepSwiftParticipSogecashMt9424")
    protected String inDepSwiftParticipSogecashMt9424;
    @XmlElement(name = "InDepSwiftParticipSwiftMt940")
    protected String inDepSwiftParticipSwiftMt940;
    @XmlElement(name = "InDepSwiftParticipSwiftMt9401")
    protected String inDepSwiftParticipSwiftMt9401;
    @XmlElement(name = "InDepSwiftParticipSwiftMt9402")
    protected String inDepSwiftParticipSwiftMt9402;
    @XmlElement(name = "InDepSwiftParticipSwiftMt9403")
    protected String inDepSwiftParticipSwiftMt9403;
    @XmlElement(name = "InDepSwiftParticipSwiftMt9404")
    protected String inDepSwiftParticipSwiftMt9404;
    @XmlElement(name = "InDepSwiftParticipSwiftMt950")
    protected String inDepSwiftParticipSwiftMt950;
    @XmlElement(name = "InDepSwiftParticipSwiftMt9501")
    protected String inDepSwiftParticipSwiftMt9501;
    @XmlElement(name = "InDepSwiftParticipSwiftMt9502")
    protected String inDepSwiftParticipSwiftMt9502;
    @XmlElement(name = "InDepSwiftParticipSwiftMt9503")
    protected String inDepSwiftParticipSwiftMt9503;
    @XmlElement(name = "InDepSwiftParticipSwiftMt9504")
    protected String inDepSwiftParticipSwiftMt9504;
    @XmlElement(name = "InDepSwiftParticipSwiftStBal", required = true)
    protected BigDecimal inDepSwiftParticipSwiftStBal;
    @XmlElement(name = "InDepSwiftParticipSwiftStDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepSwiftParticipSwiftStDate;
    @XmlElement(name = "InDepSwiftParticipTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepSwiftParticipTmstamp;
    @XmlElement(name = "InDepositAtmCardFlag")
    protected String inDepositAtmCardFlag;
    @XmlElement(name = "InDepositChequeBookFlag")
    protected String inDepositChequeBookFlag;
    @XmlElement(name = "InDepositCrInterAccLast", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositCrInterAccLast;
    @XmlElement(name = "InDepositDepositType")
    protected String inDepositDepositType;
    @XmlElement(name = "InDepositEncroachTolerance", required = true)
    protected BigDecimal inDepositEncroachTolerance;
    @XmlElement(name = "InDepositMaxCustDpPer", required = true)
    protected BigDecimal inDepositMaxCustDpPer;
    @XmlElement(name = "InDepositMaxUpdate")
    protected short inDepositMaxUpdate;
    @XmlElement(name = "InDepositMinCustMFPer", required = true)
    protected BigDecimal inDepositMinCustMFPer;
    @XmlElement(name = "InDepositOverdraftLimit", required = true)
    protected BigDecimal inDepositOverdraftLimit;
    @XmlElement(name = "InDepositOverdraftMaxsprd", required = true)
    protected BigDecimal inDepositOverdraftMaxsprd;
    @XmlElement(name = "InDepositPassbookFlag")
    protected String inDepositPassbookFlag;
    @XmlElement(name = "InDepositTelebankingFlag")
    protected String inDepositTelebankingFlag;
    @XmlElement(name = "InDepositAccountAccGroup")
    protected int inDepositAccountAccGroup;
    @XmlElement(name = "InDepositAccountAccountLimit", required = true)
    protected BigDecimal inDepositAccountAccountLimit;
    @XmlElement(name = "InDepositAccountAccountType")
    protected String inDepositAccountAccountType;
    @XmlElement(name = "InDepositAccountAccrCrExpInt", required = true)
    protected BigDecimal inDepositAccountAccrCrExpInt;
    @XmlElement(name = "InDepositAccountAccrCrInterest", required = true)
    protected BigDecimal inDepositAccountAccrCrInterest;
    @XmlElement(name = "InDepositAccountAccrDbInterest", required = true)
    protected BigDecimal inDepositAccountAccrDbInterest;
    @XmlElement(name = "InDepositAccountAccrExcessInter", required = true)
    protected BigDecimal inDepositAccountAccrExcessInter;
    @XmlElement(name = "InDepositAccountAdditionalInfoFlag")
    protected String inDepositAccountAdditionalInfoFlag;
    @XmlElement(name = "InDepositAccountAkflag")
    protected String inDepositAccountAkflag;
    @XmlElement(name = "InDepositAccountAnnounceTolDays")
    protected short inDepositAccountAnnounceTolDays;
    @XmlElement(name = "InDepositAccountApprChqAdate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountApprChqAdate;
    @XmlElement(name = "InDepositAccountApprChqCnt")
    protected int inDepositAccountApprChqCnt;
    @XmlElement(name = "InDepositAccountApprChqEdate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountApprChqEdate;
    @XmlElement(name = "InDepositAccountApprChqNo")
    protected String inDepositAccountApprChqNo;
    @XmlElement(name = "InDepositAccountApprChqPerc", required = true)
    protected BigDecimal inDepositAccountApprChqPerc;
    @XmlElement(name = "InDepositAccountAtmCardFlag")
    protected String inDepositAccountAtmCardFlag;
    @XmlElement(name = "InDepositAccountAutomChequeOrder")
    protected String inDepositAccountAutomChequeOrder;
    @XmlElement(name = "InDepositAccountAvailableBalance", required = true)
    protected BigDecimal inDepositAccountAvailableBalance;
    @XmlElement(name = "InDepositAccountBackValeurDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountBackValeurDt;
    @XmlElement(name = "InDepositAccountBalanceInterFlag")
    protected String inDepositAccountBalanceInterFlag;
    @XmlElement(name = "InDepositAccountBenefAddressSn")
    protected short inDepositAccountBenefAddressSn;
    @XmlElement(name = "InDepositAccountBlncBefOverdrn", required = true)
    protected BigDecimal inDepositAccountBlncBefOverdrn;
    @XmlElement(name = "InDepositAccountBlockedBalance", required = true)
    protected BigDecimal inDepositAccountBlockedBalance;
    @XmlElement(name = "InDepositAccountBlockedStsExpiry", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountBlockedStsExpiry;
    @XmlElement(name = "InDepositAccountBoePercentance", required = true)
    protected BigDecimal inDepositAccountBoePercentance;
    @XmlElement(name = "InDepositAccountBoeSpread", required = true)
    protected BigDecimal inDepositAccountBoeSpread;
    @XmlElement(name = "InDepositAccountBondNumber")
    protected double inDepositAccountBondNumber;
    @XmlElement(name = "InDepositAccountBookBalance", required = true)
    protected BigDecimal inDepositAccountBookBalance;
    @XmlElement(name = "InDepositAccountBookNo")
    protected int inDepositAccountBookNo;
    @XmlElement(name = "InDepositAccountProfitsAccountNumber")
    protected String inDepositAccountProfitsAccountNumber;
    @XmlElement(name = "InDepositAccountProfitsAccountCd")
    protected short inDepositAccountProfitsAccountCd;
    @XmlElement(name = "InDepositAccountCapIncreaseAmn", required = true)
    protected BigDecimal inDepositAccountCapIncreaseAmn;
    @XmlElement(name = "InDepositAccountChequeBookFlag")
    protected String inDepositAccountChequeBookFlag;
    @XmlElement(name = "InDepositAccountChequeBooksCount")
    protected int inDepositAccountChequeBooksCount;
    @XmlElement(name = "InDepositAccountChequeOrderedCnt")
    protected double inDepositAccountChequeOrderedCnt;
    @XmlElement(name = "InDepositAccountChequesBadCount")
    protected int inDepositAccountChequesBadCount;
    @XmlElement(name = "InDepositAccountChequesBadTotal", required = true)
    protected BigDecimal inDepositAccountChequesBadTotal;
    @XmlElement(name = "InDepositAccountChequesCancCount")
    protected int inDepositAccountChequesCancCount;
    @XmlElement(name = "InDepositAccountChequesItemCount")
    protected int inDepositAccountChequesItemCount;
    @XmlElement(name = "InDepositAccountChequesLostCount")
    protected int inDepositAccountChequesLostCount;
    @XmlElement(name = "InDepositAccountChequesPaidCount")
    protected int inDepositAccountChequesPaidCount;
    @XmlElement(name = "InDepositAccountChequesStampCoun")
    protected int inDepositAccountChequesStampCoun;
    @XmlElement(name = "InDepositAccountChequesSteaCount")
    protected int inDepositAccountChequesSteaCount;
    @XmlElement(name = "InDepositAccountChequesStopCount")
    protected int inDepositAccountChequesStopCount;
    @XmlElement(name = "InDepositAccountChequesUsedCount")
    protected int inDepositAccountChequesUsedCount;
    @XmlElement(name = "InDepositAccountClosingDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountClosingDate;
    @XmlElement(name = "InDepositAccountClosingTotal", required = true)
    protected BigDecimal inDepositAccountClosingTotal;
    @XmlElement(name = "InDepositAccountCobenefCount")
    protected short inDepositAccountCobenefCount;
    @XmlElement(name = "InDepositAccountCobenefCountIns")
    protected short inDepositAccountCobenefCountIns;
    @XmlElement(name = "InDepositAccountCobenefSnMail")
    protected short inDepositAccountCobenefSnMail;
    @XmlElement(name = "InDepositAccountColInsertionDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountColInsertionDt;
    @XmlElement(name = "InDepositAccountCollateralFlg")
    protected String inDepositAccountCollateralFlg;
    @XmlElement(name = "InDepositAccountCorrChqDetail1")
    protected String inDepositAccountCorrChqDetail1;
    @XmlElement(name = "InDepositAccountCorrChqDetail2")
    protected String inDepositAccountCorrChqDetail2;
    @XmlElement(name = "InDepositAccountCorrespAccInd")
    protected String inDepositAccountCorrespAccInd;
    @XmlElement(name = "InDepositAccountCrIntRtSprdInd")
    protected String inDepositAccountCrIntRtSprdInd;
    @XmlElement(name = "InDepositAccountCrInterRateSpr", required = true)
    protected BigDecimal inDepositAccountCrInterRateSpr;
    @XmlElement(name = "InDepositAccountCustPerMFAllow")
    protected String inDepositAccountCustPerMFAllow;
    @XmlElement(name = "InDepositAccountDateSinceOverdrn", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountDateSinceOverdrn;
    @XmlElement(name = "InDepositAccountDbIntRtSprdInd")
    protected String inDepositAccountDbIntRtSprdInd;
    @XmlElement(name = "InDepositAccountDbInterAccNext", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountDbInterAccNext;
    @XmlElement(name = "InDepositAccountDbInterRateSpr", required = true)
    protected BigDecimal inDepositAccountDbInterRateSpr;
    @XmlElement(name = "InDepositAccountDbProgressInter", required = true)
    protected BigDecimal inDepositAccountDbProgressInter;
    @XmlElement(name = "InDepositAccountDbTransitIntTax", required = true)
    protected BigDecimal inDepositAccountDbTransitIntTax;
    @XmlElement(name = "InDepositAccountDbTransitionInte", required = true)
    protected BigDecimal inDepositAccountDbTransitionInte;
    @XmlElement(name = "InDepositAccountDefiniteDelay")
    protected String inDepositAccountDefiniteDelay;
    @XmlElement(name = "InDepositAccountDepositType")
    protected String inDepositAccountDepositType;
    @XmlElement(name = "InDepositAccountDesignation")
    protected String inDepositAccountDesignation;
    @XmlElement(name = "InDepositAccountDrawDownWxpDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountDrawDownWxpDate;
    @XmlElement(name = "InDepositAccountDurationUnit")
    protected String inDepositAccountDurationUnit;
    @XmlElement(name = "InDepositAccountDurationValue")
    protected short inDepositAccountDurationValue;
    @XmlElement(name = "InDepositAccountEncroachTolerance", required = true)
    protected BigDecimal inDepositAccountEncroachTolerance;
    @XmlElement(name = "InDepositAccountEntryStatus")
    protected String inDepositAccountEntryStatus;
    @XmlElement(name = "InDepositAccountExpCrIntSprd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountExpCrIntSprd;
    @XmlElement(name = "InDepositAccountExpDbIntSprd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountExpDbIntSprd;
    @XmlElement(name = "InDepositAccountExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountExpiryDate;
    @XmlElement(name = "InDepositAccountExpiryDateTd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountExpiryDateTd;
    @XmlElement(name = "InDepositAccountExternalAccFlag")
    protected String inDepositAccountExternalAccFlag;
    @XmlElement(name = "InDepositAccountExtraitPrintDay")
    protected short inDepositAccountExtraitPrintDay;
    @XmlElement(name = "InDepositAccountExtraitTrxCount")
    protected int inDepositAccountExtraitTrxCount;
    @XmlElement(name = "InDepositAccountFcInterLcPrim", required = true)
    protected BigDecimal inDepositAccountFcInterLcPrim;
    @XmlElement(name = "InDepositAccountFcInterestLcFlg")
    protected String inDepositAccountFcInterestLcFlg;
    @XmlElement(name = "InDepositAccountFcInterestLcNet", required = true)
    protected BigDecimal inDepositAccountFcInterestLcNet;
    @XmlElement(name = "InDepositAccountFinalWhldTaxFlg")
    protected String inDepositAccountFinalWhldTaxFlg;
    @XmlElement(name = "InDepositAccountFixedInterFlag")
    protected String inDepositAccountFixedInterFlag;
    @XmlElement(name = "InDepositAccountFixedInterRate", required = true)
    protected BigDecimal inDepositAccountFixedInterRate;
    @XmlElement(name = "InDepositAccountForecastBalance", required = true)
    protected BigDecimal inDepositAccountForecastBalance;
    @XmlElement(name = "InDepositAccountGlAccount")
    protected String inDepositAccountGlAccount;
    @XmlElement(name = "InDepositAccountGlAccountLevel")
    protected String inDepositAccountGlAccountLevel;
    @XmlElement(name = "InDepositAccountHomeBranch")
    protected String inDepositAccountHomeBranch;
    @XmlElement(name = "InDepositAccountIncomeAmnt", required = true)
    protected BigDecimal inDepositAccountIncomeAmnt;
    @XmlElement(name = "InDepositAccountIncomeFrequency")
    protected int inDepositAccountIncomeFrequency;
    @XmlElement(name = "InDepositAccountInitCrBalance", required = true)
    protected BigDecimal inDepositAccountInitCrBalance;
    @XmlElement(name = "InDepositAccountInitDbBalance", required = true)
    protected BigDecimal inDepositAccountInitDbBalance;
    @XmlElement(name = "InDepositAccountInitValueBalance", required = true)
    protected BigDecimal inDepositAccountInitValueBalance;
    @XmlElement(name = "InDepositAccountInspectionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountInspectionDate;
    @XmlElement(name = "InDepositAccountInterPayOptions")
    protected String inDepositAccountInterPayOptions;
    @XmlElement(name = "InDepositAccountInterestPayInd")
    protected String inDepositAccountInterestPayInd;
    @XmlElement(name = "InDepositAccountInterestToWithdr", required = true)
    protected BigDecimal inDepositAccountInterestToWithdr;
    @XmlElement(name = "InDepositAccountInvestFlag")
    protected String inDepositAccountInvestFlag;
    @XmlElement(name = "InDepositAccountIssueOffice")
    protected int inDepositAccountIssueOffice;
    @XmlElement(name = "InDepositAccountKadFlg")
    protected String inDepositAccountKadFlg;
    @XmlElement(name = "InDepositAccountLastBadCheqDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountLastBadCheqDate;
    @XmlElement(name = "InDepositAccountLastBatchDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountLastBatchDate;
    @XmlElement(name = "InDepositAccountLastInactiveDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountLastInactiveDate;
    @XmlElement(name = "InDepositAccountLastIntAvgBalance", required = true)
    protected BigDecimal inDepositAccountLastIntAvgBalance;
    @XmlElement(name = "InDepositAccountLastIntAvgCr", required = true)
    protected BigDecimal inDepositAccountLastIntAvgCr;
    @XmlElement(name = "InDepositAccountLastIntAvgDb", required = true)
    protected BigDecimal inDepositAccountLastIntAvgDb;
    @XmlElement(name = "InDepositAccountLastIntChangDat", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountLastIntChangDat;
    @XmlElement(name = "InDepositAccountLastMaxUpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountLastMaxUpdateDate;
    @XmlElement(name = "InDepositAccountLastModifyDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountLastModifyDate;
    @XmlElement(name = "InDepositAccountLastPsbPrint", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountLastPsbPrint;
    @XmlElement(name = "InDepositAccountLastTdTrxId")
    protected int inDepositAccountLastTdTrxId;
    @XmlElement(name = "InDepositAccountLastTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountLastTrxDate;
    @XmlElement(name = "InDepositAccountLastTrxId")
    protected int inDepositAccountLastTrxId;
    @XmlElement(name = "InDepositAccountLstStatementNum")
    protected int inDepositAccountLstStatementNum;
    @XmlElement(name = "InDepositAccountManualMigrateFlg")
    protected String inDepositAccountManualMigrateFlg;
    @XmlElement(name = "InDepositAccountMaxLastDpPer", required = true)
    protected BigDecimal inDepositAccountMaxLastDpPer;
    @XmlElement(name = "InDepositAccountMaxLastUpdate")
    protected short inDepositAccountMaxLastUpdate;
    @XmlElement(name = "InDepositAccountMinLastMFPer", required = true)
    protected BigDecimal inDepositAccountMinLastMFPer;
    @XmlElement(name = "InDepositAccountMultiSalaryAmnt")
    protected short inDepositAccountMultiSalaryAmnt;
    @XmlElement(name = "InDepositAccountNostroAccount")
    protected String inDepositAccountNostroAccount;
    @XmlElement(name = "InDepositAccountNotExpensesFlg")
    protected String inDepositAccountNotExpensesFlg;
    @XmlElement(name = "InDepositAccountNotifSpreadDayB")
    protected short inDepositAccountNotifSpreadDayB;
    @XmlElement(name = "InDepositAccountNotifSpreadDays")
    protected short inDepositAccountNotifSpreadDays;
    @XmlElement(name = "InDepositAccountOfficeAccFlag")
    protected String inDepositAccountOfficeAccFlag;
    @XmlElement(name = "InDepositAccountOldAccNumber")
    protected String inDepositAccountOldAccNumber;
    @XmlElement(name = "InDepositAccountOpeningBalance", required = true)
    protected BigDecimal inDepositAccountOpeningBalance;
    @XmlElement(name = "InDepositAccountOpeningDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountOpeningDate;
    @XmlElement(name = "InDepositAccountOverdraftComment")
    protected String inDepositAccountOverdraftComment;
    @XmlElement(name = "InDepositAccountOverdraftRenewalFlg")
    protected String inDepositAccountOverdraftRenewalFlg;
    @XmlElement(name = "InDepositAccountOverdraftSpread", required = true)
    protected BigDecimal inDepositAccountOverdraftSpread;
    @XmlElement(name = "InDepositAccountPassbookFlag")
    protected String inDepositAccountPassbookFlag;
    @XmlElement(name = "InDepositAccountPendingExtrLines")
    protected double inDepositAccountPendingExtrLines;
    @XmlElement(name = "InDepositAccountPrevAccountLimit", required = true)
    protected BigDecimal inDepositAccountPrevAccountLimit;
    @XmlElement(name = "InDepositAccountPrevAvailableBal", required = true)
    protected BigDecimal inDepositAccountPrevAvailableBal;
    @XmlElement(name = "InDepositAccountPrevBlockedBalan", required = true)
    protected BigDecimal inDepositAccountPrevBlockedBalan;
    @XmlElement(name = "InDepositAccountPrevBookBalance", required = true)
    protected BigDecimal inDepositAccountPrevBookBalance;
    @XmlElement(name = "InDepositAccountPrevDateSinceOv", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountPrevDateSinceOv;
    @XmlElement(name = "InDepositAccountPrevForecastBala", required = true)
    protected BigDecimal inDepositAccountPrevForecastBala;
    @XmlElement(name = "InDepositAccountPrevLastTrxId")
    protected int inDepositAccountPrevLastTrxId;
    @XmlElement(name = "InDepositAccountPrevLstStatement")
    protected int inDepositAccountPrevLstStatement;
    @XmlElement(name = "InDepositAccountPrevPsbLineSn")
    protected int inDepositAccountPrevPsbLineSn;
    @XmlElement(name = "InDepositAccountPrevTempExcEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountPrevTempExcEnd;
    @XmlElement(name = "InDepositAccountPrevTempExcStar", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountPrevTempExcStar;
    @XmlElement(name = "InDepositAccountPrevTemporaryExc", required = true)
    protected BigDecimal inDepositAccountPrevTemporaryExc;
    @XmlElement(name = "InDepositAccountPrevUnclearBala", required = true)
    protected BigDecimal inDepositAccountPrevUnclearBala;
    @XmlElement(name = "InDepositAccountPsbLastBalance", required = true)
    protected BigDecimal inDepositAccountPsbLastBalance;
    @XmlElement(name = "InDepositAccountPsbLastPrintLn")
    protected short inDepositAccountPsbLastPrintLn;
    @XmlElement(name = "InDepositAccountPsbLineSn")
    protected int inDepositAccountPsbLineSn;
    @XmlElement(name = "InDepositAccountPsbLostInd")
    protected String inDepositAccountPsbLostInd;
    @XmlElement(name = "InDepositAccountPsbPendingLines")
    protected short inDepositAccountPsbPendingLines;
    @XmlElement(name = "InDepositAccountPsbSn")
    protected int inDepositAccountPsbSn;
    @XmlElement(name = "InDepositAccountRenewalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountRenewalDate;
    @XmlElement(name = "InDepositAccountRenewalFlag")
    protected String inDepositAccountRenewalFlag;
    @XmlElement(name = "InDepositAccountRenewalNumber")
    protected int inDepositAccountRenewalNumber;
    @XmlElement(name = "InDepositAccountRestrictAccFlag")
    protected String inDepositAccountRestrictAccFlag;
    @XmlElement(name = "InDepositAccountRetainingDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountRetainingDate;
    @XmlElement(name = "InDepositAccountSecretAccFlag")
    protected String inDepositAccountSecretAccFlag;
    @XmlElement(name = "InDepositAccountServicePenalSpr", required = true)
    protected BigDecimal inDepositAccountServicePenalSpr;
    @XmlElement(name = "InDepositAccountSpecAgrPenFlg")
    protected String inDepositAccountSpecAgrPenFlg;
    @XmlElement(name = "InDepositAccountSpecAgrTrxFlg")
    protected String inDepositAccountSpecAgrTrxFlg;
    @XmlElement(name = "InDepositAccountSpecialAccFlg")
    protected String inDepositAccountSpecialAccFlg;
    @XmlElement(name = "InDepositAccountStampAmountTotal", required = true)
    protected BigDecimal inDepositAccountStampAmountTotal;
    @XmlElement(name = "InDepositAccountStartDateTd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountStartDateTd;
    @XmlElement(name = "InDepositAccountStartWdrBalPrd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountStartWdrBalPrd;
    @XmlElement(name = "InDepositAccountStatementIssFreq")
    protected String inDepositAccountStatementIssFreq;
    @XmlElement(name = "InDepositAccountSystemUsageCnt")
    protected double inDepositAccountSystemUsageCnt;
    @XmlElement(name = "InDepositAccountTargetFlg")
    protected short inDepositAccountTargetFlg;
    @XmlElement(name = "InDepositAccountTaxExcempFlg")
    protected String inDepositAccountTaxExcempFlg;
    @XmlElement(name = "InDepositAccountTdBatchExtrtFlg")
    protected String inDepositAccountTdBatchExtrtFlg;
    @XmlElement(name = "InDepositAccountTdInterPercentChg", required = true)
    protected BigDecimal inDepositAccountTdInterPercentChg;
    @XmlElement(name = "InDepositAccountTdInterSprdChg", required = true)
    protected BigDecimal inDepositAccountTdInterSprdChg;
    @XmlElement(name = "InDepositAccountTelebankingFlag")
    protected String inDepositAccountTelebankingFlag;
    @XmlElement(name = "InDepositAccountTempExcEndDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountTempExcEndDt;
    @XmlElement(name = "InDepositAccountTempExcStartDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountTempExcStartDt;
    @XmlElement(name = "InDepositAccountTemporaryExcess", required = true)
    protected BigDecimal inDepositAccountTemporaryExcess;
    @XmlElement(name = "InDepositAccountThirdpartyInd")
    protected String inDepositAccountThirdpartyInd;
    @XmlElement(name = "InDepositAccountTimestmp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountTimestmp;
    @XmlElement(name = "InDepositAccountTotalPartPenalty", required = true)
    protected BigDecimal inDepositAccountTotalPartPenalty;
    @XmlElement(name = "InDepositAccountTransitionIntTax", required = true)
    protected BigDecimal inDepositAccountTransitionIntTax;
    @XmlElement(name = "InDepositAccountTransitionInter", required = true)
    protected BigDecimal inDepositAccountTransitionInter;
    @XmlElement(name = "InDepositAccountUnclearBalance", required = true)
    protected BigDecimal inDepositAccountUnclearBalance;
    @XmlElement(name = "InDepositAccountUnclearWithdrFlg")
    protected String inDepositAccountUnclearWithdrFlg;
    @XmlElement(name = "InDepositAccountUnutilLimitPenD", required = true)
    protected BigDecimal inDepositAccountUnutilLimitPenD;
    @XmlElement(name = "InDepositAccountValidChqDuration")
    protected int inDepositAccountValidChqDuration;
    @XmlElement(name = "InDepositAccountWebFlg")
    protected String inDepositAccountWebFlg;
    @XmlElement(name = "InDepositAccountWebModDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountWebModDate;
    @XmlElement(name = "InDepositAccountWithdrawAmnt", required = true)
    protected BigDecimal inDepositAccountWithdrawAmnt;
    @XmlElement(name = "InDepositAccountWithdrawBalance", required = true)
    protected BigDecimal inDepositAccountWithdrawBalance;
    @XmlElement(name = "InDepositAccountWthdrawSpread")
    protected short inDepositAccountWthdrawSpread;
    @XmlElement(name = "InDpHistInterRateEffectiveDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDpHistInterRateEffectiveDate;
    @XmlElement(name = "InEconomyGenericDetailSerialNum")
    protected int inEconomyGenericDetailSerialNum;
    @XmlElement(name = "InExtensionAccIefSuppliedFlag")
    protected String inExtensionAccIefSuppliedFlag;
    @XmlElement(name = "InFixedOneAccLnsInterestDurationUnit")
    protected String inFixedOneAccLnsInterestDurationUnit;
    @XmlElement(name = "InFixedOneAccLnsInterestIdInterest")
    protected int inFixedOneAccLnsInterestIdInterest;
    @XmlElement(name = "InFixedOneAccLnsInterestIntDuration")
    protected short inFixedOneAccLnsInterestIntDuration;
    @XmlElement(name = "InHouseUnitCode")
    protected int inHouseUnitCode;
    @XmlElement(name = "InIssueOfficeUnitCode")
    protected int inIssueOfficeUnitCode;
    @XmlElement(name = "InIssueOfficeUnitUnitName")
    protected String inIssueOfficeUnitUnitName;
    @XmlElement(name = "InJustificIdJustific")
    protected int inJustificIdJustific;
    @XmlElement(name = "InKekGenericDetailSerialNum")
    protected int inKekGenericDetailSerialNum;
    @XmlElement(name = "InLkepGenericDetailEntryStatus")
    protected String inLkepGenericDetailEntryStatus;
    @XmlElement(name = "InLkepGenericDetailParameterType")
    protected String inLkepGenericDetailParameterType;
    @XmlElement(name = "InLkepGenericDetailSerialNum")
    protected int inLkepGenericDetailSerialNum;
    @XmlElement(name = "InLoanAccountRecyclingFrequency")
    protected short inLoanAccountRecyclingFrequency;
    @XmlElement(name = "InLpurpGenericDetailEntryStatus")
    protected String inLpurpGenericDetailEntryStatus;
    @XmlElement(name = "InLpurpGenericDetailSerialNum")
    protected int inLpurpGenericDetailSerialNum;
    @XmlElement(name = "InMailCustAddressSerialNum")
    protected short inMailCustAddressSerialNum;
    @XmlElement(name = "InMonitoringBankemployeeId")
    protected String inMonitoringBankemployeeId;
    @XmlElement(name = "InOpenUnitCommentsIefSuppliedText40")
    protected String inOpenUnitCommentsIefSuppliedText40;
    @XmlElement(name = "InPackageIdPackage")
    protected int inPackageIdPackage;
    @XmlElement(name = "InParametersInTerminalTerminalNumber")
    protected String inParametersInTerminalTerminalNumber;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InProdidProductIdProduct")
    protected int inProdidProductIdProduct;
    @XmlElement(name = "InProfGenericDetailSerialNum")
    protected int inProfGenericDetailSerialNum;
    @XmlElement(name = "InRetDepFixingRateRate", required = true)
    protected BigDecimal inRetDepFixingRateRate;
    @XmlElement(name = "InRetOverdraftCurrencyDisplayedDecimalPlaces")
    protected short inRetOverdraftCurrencyDisplayedDecimalPlaces;
    @XmlElement(name = "InRetOverdraftCurrencyIdCurrency")
    protected int inRetOverdraftCurrencyIdCurrency;
    @XmlElement(name = "InRetOverdraftCurrencyNationalFlag")
    protected String inRetOverdraftCurrencyNationalFlag;
    @XmlElement(name = "InSalePersonGenericDetailShortDescription")
    protected String inSalePersonGenericDetailShortDescription;
    @XmlElement(name = "InSaleUnitGenericDetailSerialNum")
    protected int inSaleUnitGenericDetailSerialNum;
    @XmlElement(name = "InSecondCredIntLnsInterestIdInterest")
    protected int inSecondCredIntLnsInterestIdInterest;
    @XmlElement(name = "InSecretConfirmDepositAccountSecretAccFlag")
    protected String inSecretConfirmDepositAccountSecretAccFlag;
    @XmlElement(name = "InServiceDepositAccountProfitsAccountNumber")
    protected String inServiceDepositAccountProfitsAccountNumber;
    @XmlElement(name = "InServiceDepositAccountProfitsAccountCd")
    protected short inServiceDepositAccountProfitsAccountCd;
    @XmlElement(name = "InSupervisorsTeamInformationSuper1Code")
    protected String inSupervisorsTeamInformationSuper1Code;
    @XmlElement(name = "InSupervisorsTeamInformationSuper2Code")
    protected String inSupervisorsTeamInformationSuper2Code;
    @XmlElement(name = "InTaxCountryGenericDetailDescription")
    protected String inTaxCountryGenericDetailDescription;
    @XmlElement(name = "InTaxCountryGenericDetailShortDescription")
    protected String inTaxCountryGenericDetailShortDescription;
    @XmlElement(name = "InTimeDeposRenewalCrInterTaxPcg", required = true)
    protected BigDecimal inTimeDeposRenewalCrInterTaxPcg;
    @XmlElement(name = "InTimeDeposRenewalDaysDuration")
    protected short inTimeDeposRenewalDaysDuration;
    @XmlElement(name = "InTimeDeposRenewalDurationUnit")
    protected String inTimeDeposRenewalDurationUnit;
    @XmlElement(name = "InTimeDeposRenewalDurationValue")
    protected short inTimeDeposRenewalDurationValue;
    @XmlElement(name = "InTimeDeposRenewalExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTimeDeposRenewalExpiryDate;
    @XmlElement(name = "InTimeDeposRenewalStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTimeDeposRenewalStartDate;
    @XmlElement(name = "InUnutillPenLnsCommissionIdCommission")
    protected int inUnutillPenLnsCommissionIdCommission;
    @XmlElement(name = "InUsedInputCharSuppliedChar37")
    protected String inUsedInputCharSuppliedChar37;
    @XmlElement(name = "InWithdrawDayFromIefSuppliedDays")
    protected int inWithdrawDayFromIefSuppliedDays;
    @XmlElement(name = "InWithdrawDayFromIefSuppliedMonth")
    protected short inWithdrawDayFromIefSuppliedMonth;
    @XmlElement(name = "InWithdrawDayToIefSuppliedDays")
    protected int inWithdrawDayToIefSuppliedDays;
    @XmlElement(name = "InWithdrawDayToIefSuppliedMonth")
    protected short inWithdrawDayToIefSuppliedMonth;
    @XmlElement(name = "InDepositAccountMailStatment")
    protected String inDepositAccountMailStatment;
    @XmlElement(name = "InRefereeAccNoIefSuppliedChar100")
    protected String inRefereeAccNoIefSuppliedChar100;
    @XmlElement(name = "InRefereeNameIefSuppliedChar100")
    protected String inRefereeNameIefSuppliedChar100;
    @XmlElement(name = "InDepositAccountFreeText3IefSuppliedChar100")
    protected String inDepositAccountFreeText3IefSuppliedChar100;
    @XmlElement(name = "InDepositAccountFreeText4IefSuppliedChar100")
    protected String inDepositAccountFreeText4IefSuppliedChar100;
    @XmlElement(name = "InDepositAccountFreeText5IefSuppliedChar100")
    protected String inDepositAccountFreeText5IefSuppliedChar100;
    @XmlElement(name = "InCrmCodeGenericDetailSerialNum")
    protected int inCrmCodeGenericDetailSerialNum;
    @XmlElement(name = "InDepositAccountSwiftMt942")
    protected String inDepositAccountSwiftMt942;
    @XmlElement(name = "InDepositAccountSwiftMt940")
    protected String inDepositAccountSwiftMt940;

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
     * Gets the value of the inAchBnkCollaborationBanksAchBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAchBnkCollaborationBanksAchBankCode() {
        return inAchBnkCollaborationBanksAchBankCode;
    }

    /**
     * Sets the value of the inAchBnkCollaborationBanksAchBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAchBnkCollaborationBanksAchBankCode(String value) {
        this.inAchBnkCollaborationBanksAchBankCode = value;
    }

    /**
     * Gets the value of the inAchBnkCollaborationBanksBankId property.
     * 
     */
    public int getInAchBnkCollaborationBanksBankId() {
        return inAchBnkCollaborationBanksBankId;
    }

    /**
     * Sets the value of the inAchBnkCollaborationBanksBankId property.
     * 
     */
    public void setInAchBnkCollaborationBanksBankId(int value) {
        this.inAchBnkCollaborationBanksBankId = value;
    }

    /**
     * Gets the value of the inAchBnkCollaborationBanksBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAchBnkCollaborationBanksBankName() {
        return inAchBnkCollaborationBanksBankName;
    }

    /**
     * Sets the value of the inAchBnkCollaborationBanksBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAchBnkCollaborationBanksBankName(String value) {
        this.inAchBnkCollaborationBanksBankName = value;
    }

    /**
     * Gets the value of the inAchBnkCollaborationBanksEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAchBnkCollaborationBanksEntryStatus() {
        return inAchBnkCollaborationBanksEntryStatus;
    }

    /**
     * Sets the value of the inAchBnkCollaborationBanksEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAchBnkCollaborationBanksEntryStatus(String value) {
        this.inAchBnkCollaborationBanksEntryStatus = value;
    }

    /**
     * Gets the value of the inAddExcesLimitLnsInterestIdInterest property.
     * 
     */
    public int getInAddExcesLimitLnsInterestIdInterest() {
        return inAddExcesLimitLnsInterestIdInterest;
    }

    /**
     * Sets the value of the inAddExcesLimitLnsInterestIdInterest property.
     * 
     */
    public void setInAddExcesLimitLnsInterestIdInterest(int value) {
        this.inAddExcesLimitLnsInterestIdInterest = value;
    }

    /**
     * Gets the value of the inAgreementProfitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAgreementProfitsAccountNumber() {
        return inAgreementProfitsAccountNumber;
    }

    /**
     * Sets the value of the inAgreementProfitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAgreementProfitsAccountNumber(String value) {
        this.inAgreementProfitsAccountNumber = value;
    }

    /**
     * Gets the value of the inAgreementProfitsAccountCd property.
     * 
     */
    public short getInAgreementProfitsAccountCd() {
        return inAgreementProfitsAccountCd;
    }

    /**
     * Sets the value of the inAgreementProfitsAccountCd property.
     * 
     */
    public void setInAgreementProfitsAccountCd(short value) {
        this.inAgreementProfitsAccountCd = value;
    }

    /**
     * Gets the value of the inAuthorGrantedIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthorGrantedIefSuppliedFlag() {
        return inAuthorGrantedIefSuppliedFlag;
    }

    /**
     * Sets the value of the inAuthorGrantedIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthorGrantedIefSuppliedFlag(String value) {
        this.inAuthorGrantedIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inBeforeAchBnkCollaborationBanksAchBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeAchBnkCollaborationBanksAchBankCode() {
        return inBeforeAchBnkCollaborationBanksAchBankCode;
    }

    /**
     * Sets the value of the inBeforeAchBnkCollaborationBanksAchBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeAchBnkCollaborationBanksAchBankCode(String value) {
        this.inBeforeAchBnkCollaborationBanksAchBankCode = value;
    }

    /**
     * Gets the value of the inBeforeAchBnkCollaborationBanksBankId property.
     * 
     */
    public int getInBeforeAchBnkCollaborationBanksBankId() {
        return inBeforeAchBnkCollaborationBanksBankId;
    }

    /**
     * Sets the value of the inBeforeAchBnkCollaborationBanksBankId property.
     * 
     */
    public void setInBeforeAchBnkCollaborationBanksBankId(int value) {
        this.inBeforeAchBnkCollaborationBanksBankId = value;
    }

    /**
     * Gets the value of the inBeforeAchBnkCollaborationBanksBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeAchBnkCollaborationBanksBankName() {
        return inBeforeAchBnkCollaborationBanksBankName;
    }

    /**
     * Sets the value of the inBeforeAchBnkCollaborationBanksBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeAchBnkCollaborationBanksBankName(String value) {
        this.inBeforeAchBnkCollaborationBanksBankName = value;
    }

    /**
     * Gets the value of the inBeforeAchBnkCollaborationBanksEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeAchBnkCollaborationBanksEntryStatus() {
        return inBeforeAchBnkCollaborationBanksEntryStatus;
    }

    /**
     * Sets the value of the inBeforeAchBnkCollaborationBanksEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeAchBnkCollaborationBanksEntryStatus(String value) {
        this.inBeforeAchBnkCollaborationBanksEntryStatus = value;
    }

    /**
     * Gets the value of the inBeforeAddExcesLimitLnsInterestIdInterest property.
     * 
     */
    public int getInBeforeAddExcesLimitLnsInterestIdInterest() {
        return inBeforeAddExcesLimitLnsInterestIdInterest;
    }

    /**
     * Sets the value of the inBeforeAddExcesLimitLnsInterestIdInterest property.
     * 
     */
    public void setInBeforeAddExcesLimitLnsInterestIdInterest(int value) {
        this.inBeforeAddExcesLimitLnsInterestIdInterest = value;
    }

    /**
     * Gets the value of the inBeforeAgrUnitCode property.
     * 
     */
    public int getInBeforeAgrUnitCode() {
        return inBeforeAgrUnitCode;
    }

    /**
     * Sets the value of the inBeforeAgrUnitCode property.
     * 
     */
    public void setInBeforeAgrUnitCode(int value) {
        this.inBeforeAgrUnitCode = value;
    }

    /**
     * Gets the value of the inBeforeAgreementAgrMembershipSn property.
     * 
     */
    public int getInBeforeAgreementAgrMembershipSn() {
        return inBeforeAgreementAgrMembershipSn;
    }

    /**
     * Sets the value of the inBeforeAgreementAgrMembershipSn property.
     * 
     */
    public void setInBeforeAgreementAgrMembershipSn(int value) {
        this.inBeforeAgreementAgrMembershipSn = value;
    }

    /**
     * Gets the value of the inBeforeAgreementAgrSn property.
     * 
     */
    public int getInBeforeAgreementAgrSn() {
        return inBeforeAgreementAgrSn;
    }

    /**
     * Sets the value of the inBeforeAgreementAgrSn property.
     * 
     */
    public void setInBeforeAgreementAgrSn(int value) {
        this.inBeforeAgreementAgrSn = value;
    }

    /**
     * Gets the value of the inBeforeAgreementAgrYear property.
     * 
     */
    public short getInBeforeAgreementAgrYear() {
        return inBeforeAgreementAgrYear;
    }

    /**
     * Sets the value of the inBeforeAgreementAgrYear property.
     * 
     */
    public void setInBeforeAgreementAgrYear(short value) {
        this.inBeforeAgreementAgrYear = value;
    }

    /**
     * Gets the value of the inBeforeCapitalDepositAccountProfitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeCapitalDepositAccountProfitsAccountNumber() {
        return inBeforeCapitalDepositAccountProfitsAccountNumber;
    }

    /**
     * Sets the value of the inBeforeCapitalDepositAccountProfitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeCapitalDepositAccountProfitsAccountNumber(String value) {
        this.inBeforeCapitalDepositAccountProfitsAccountNumber = value;
    }

    /**
     * Gets the value of the inBeforeCapitalDepositAccountProfitsAccountCd property.
     * 
     */
    public short getInBeforeCapitalDepositAccountProfitsAccountCd() {
        return inBeforeCapitalDepositAccountProfitsAccountCd;
    }

    /**
     * Sets the value of the inBeforeCapitalDepositAccountProfitsAccountCd property.
     * 
     */
    public void setInBeforeCapitalDepositAccountProfitsAccountCd(short value) {
        this.inBeforeCapitalDepositAccountProfitsAccountCd = value;
    }

    /**
     * Gets the value of the inBeforeCcodeGenericDetailEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeCcodeGenericDetailEntryStatus() {
        return inBeforeCcodeGenericDetailEntryStatus;
    }

    /**
     * Sets the value of the inBeforeCcodeGenericDetailEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeCcodeGenericDetailEntryStatus(String value) {
        this.inBeforeCcodeGenericDetailEntryStatus = value;
    }

    /**
     * Gets the value of the inBeforeCcodeGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeCcodeGenericDetailParameterType() {
        return inBeforeCcodeGenericDetailParameterType;
    }

    /**
     * Sets the value of the inBeforeCcodeGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeCcodeGenericDetailParameterType(String value) {
        this.inBeforeCcodeGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inBeforeCcodeGenericDetailSerialNum property.
     * 
     */
    public int getInBeforeCcodeGenericDetailSerialNum() {
        return inBeforeCcodeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inBeforeCcodeGenericDetailSerialNum property.
     * 
     */
    public void setInBeforeCcodeGenericDetailSerialNum(int value) {
        this.inBeforeCcodeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inBeforeCrDbInterestDepositAccountProfitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeCrDbInterestDepositAccountProfitsAccountNumber() {
        return inBeforeCrDbInterestDepositAccountProfitsAccountNumber;
    }

    /**
     * Sets the value of the inBeforeCrDbInterestDepositAccountProfitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeCrDbInterestDepositAccountProfitsAccountNumber(String value) {
        this.inBeforeCrDbInterestDepositAccountProfitsAccountNumber = value;
    }

    /**
     * Gets the value of the inBeforeCrDbInterestDepositAccountProfitsAccountCd property.
     * 
     */
    public short getInBeforeCrDbInterestDepositAccountProfitsAccountCd() {
        return inBeforeCrDbInterestDepositAccountProfitsAccountCd;
    }

    /**
     * Sets the value of the inBeforeCrDbInterestDepositAccountProfitsAccountCd property.
     * 
     */
    public void setInBeforeCrDbInterestDepositAccountProfitsAccountCd(short value) {
        this.inBeforeCrDbInterestDepositAccountProfitsAccountCd = value;
    }

    /**
     * Gets the value of the inBeforeCrLnsInterestIdInterest property.
     * 
     */
    public int getInBeforeCrLnsInterestIdInterest() {
        return inBeforeCrLnsInterestIdInterest;
    }

    /**
     * Sets the value of the inBeforeCrLnsInterestIdInterest property.
     * 
     */
    public void setInBeforeCrLnsInterestIdInterest(int value) {
        this.inBeforeCrLnsInterestIdInterest = value;
    }

    /**
     * Gets the value of the inBeforeCurrencyIdCurrency property.
     * 
     */
    public int getInBeforeCurrencyIdCurrency() {
        return inBeforeCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inBeforeCurrencyIdCurrency property.
     * 
     */
    public void setInBeforeCurrencyIdCurrency(int value) {
        this.inBeforeCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inBeforeDbLnsInterestIdInterest property.
     * 
     */
    public int getInBeforeDbLnsInterestIdInterest() {
        return inBeforeDbLnsInterestIdInterest;
    }

    /**
     * Sets the value of the inBeforeDbLnsInterestIdInterest property.
     * 
     */
    public void setInBeforeDbLnsInterestIdInterest(int value) {
        this.inBeforeDbLnsInterestIdInterest = value;
    }

    /**
     * Gets the value of the inBeforeDepAccountInfoCurFxIntExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBeforeDepAccountInfoCurFxIntExpDt() {
        return inBeforeDepAccountInfoCurFxIntExpDt;
    }

    /**
     * Sets the value of the inBeforeDepAccountInfoCurFxIntExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBeforeDepAccountInfoCurFxIntExpDt(XMLGregorianCalendar value) {
        this.inBeforeDepAccountInfoCurFxIntExpDt = value;
    }

    /**
     * Gets the value of the inBeforeDepAccountInfoCurFxIntStDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBeforeDepAccountInfoCurFxIntStDt() {
        return inBeforeDepAccountInfoCurFxIntStDt;
    }

    /**
     * Sets the value of the inBeforeDepAccountInfoCurFxIntStDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBeforeDepAccountInfoCurFxIntStDt(XMLGregorianCalendar value) {
        this.inBeforeDepAccountInfoCurFxIntStDt = value;
    }

    /**
     * Gets the value of the inBeforeDepAccountInfoOaCollFreqUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeDepAccountInfoOaCollFreqUnit() {
        return inBeforeDepAccountInfoOaCollFreqUnit;
    }

    /**
     * Sets the value of the inBeforeDepAccountInfoOaCollFreqUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeDepAccountInfoOaCollFreqUnit(String value) {
        this.inBeforeDepAccountInfoOaCollFreqUnit = value;
    }

    /**
     * Gets the value of the inBeforeDepAccountInfoOaCollectFreq property.
     * 
     */
    public short getInBeforeDepAccountInfoOaCollectFreq() {
        return inBeforeDepAccountInfoOaCollectFreq;
    }

    /**
     * Sets the value of the inBeforeDepAccountInfoOaCollectFreq property.
     * 
     */
    public void setInBeforeDepAccountInfoOaCollectFreq(short value) {
        this.inBeforeDepAccountInfoOaCollectFreq = value;
    }

    /**
     * Gets the value of the inBeforeDepAccountInfoOaDuration property.
     * 
     */
    public short getInBeforeDepAccountInfoOaDuration() {
        return inBeforeDepAccountInfoOaDuration;
    }

    /**
     * Sets the value of the inBeforeDepAccountInfoOaDuration property.
     * 
     */
    public void setInBeforeDepAccountInfoOaDuration(short value) {
        this.inBeforeDepAccountInfoOaDuration = value;
    }

    /**
     * Gets the value of the inBeforeDepAccountInfoOaDurationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeDepAccountInfoOaDurationUnit() {
        return inBeforeDepAccountInfoOaDurationUnit;
    }

    /**
     * Sets the value of the inBeforeDepAccountInfoOaDurationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeDepAccountInfoOaDurationUnit(String value) {
        this.inBeforeDepAccountInfoOaDurationUnit = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountAccountLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInBeforeDepositAccountAccountLimit() {
        return inBeforeDepositAccountAccountLimit;
    }

    /**
     * Sets the value of the inBeforeDepositAccountAccountLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInBeforeDepositAccountAccountLimit(BigDecimal value) {
        this.inBeforeDepositAccountAccountLimit = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeDepositAccountAccountType() {
        return inBeforeDepositAccountAccountType;
    }

    /**
     * Sets the value of the inBeforeDepositAccountAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeDepositAccountAccountType(String value) {
        this.inBeforeDepositAccountAccountType = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountAnnounceTolDays property.
     * 
     */
    public short getInBeforeDepositAccountAnnounceTolDays() {
        return inBeforeDepositAccountAnnounceTolDays;
    }

    /**
     * Sets the value of the inBeforeDepositAccountAnnounceTolDays property.
     * 
     */
    public void setInBeforeDepositAccountAnnounceTolDays(short value) {
        this.inBeforeDepositAccountAnnounceTolDays = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountApprChqAdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBeforeDepositAccountApprChqAdate() {
        return inBeforeDepositAccountApprChqAdate;
    }

    /**
     * Sets the value of the inBeforeDepositAccountApprChqAdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBeforeDepositAccountApprChqAdate(XMLGregorianCalendar value) {
        this.inBeforeDepositAccountApprChqAdate = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountApprChqCnt property.
     * 
     */
    public int getInBeforeDepositAccountApprChqCnt() {
        return inBeforeDepositAccountApprChqCnt;
    }

    /**
     * Sets the value of the inBeforeDepositAccountApprChqCnt property.
     * 
     */
    public void setInBeforeDepositAccountApprChqCnt(int value) {
        this.inBeforeDepositAccountApprChqCnt = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountApprChqEdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBeforeDepositAccountApprChqEdate() {
        return inBeforeDepositAccountApprChqEdate;
    }

    /**
     * Sets the value of the inBeforeDepositAccountApprChqEdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBeforeDepositAccountApprChqEdate(XMLGregorianCalendar value) {
        this.inBeforeDepositAccountApprChqEdate = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountApprChqNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeDepositAccountApprChqNo() {
        return inBeforeDepositAccountApprChqNo;
    }

    /**
     * Sets the value of the inBeforeDepositAccountApprChqNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeDepositAccountApprChqNo(String value) {
        this.inBeforeDepositAccountApprChqNo = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountApprChqPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInBeforeDepositAccountApprChqPerc() {
        return inBeforeDepositAccountApprChqPerc;
    }

    /**
     * Sets the value of the inBeforeDepositAccountApprChqPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInBeforeDepositAccountApprChqPerc(BigDecimal value) {
        this.inBeforeDepositAccountApprChqPerc = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountAtmCardFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeDepositAccountAtmCardFlag() {
        return inBeforeDepositAccountAtmCardFlag;
    }

    /**
     * Sets the value of the inBeforeDepositAccountAtmCardFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeDepositAccountAtmCardFlag(String value) {
        this.inBeforeDepositAccountAtmCardFlag = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountAutomChequeOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeDepositAccountAutomChequeOrder() {
        return inBeforeDepositAccountAutomChequeOrder;
    }

    /**
     * Sets the value of the inBeforeDepositAccountAutomChequeOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeDepositAccountAutomChequeOrder(String value) {
        this.inBeforeDepositAccountAutomChequeOrder = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountBlockedStsExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBeforeDepositAccountBlockedStsExpiry() {
        return inBeforeDepositAccountBlockedStsExpiry;
    }

    /**
     * Sets the value of the inBeforeDepositAccountBlockedStsExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBeforeDepositAccountBlockedStsExpiry(XMLGregorianCalendar value) {
        this.inBeforeDepositAccountBlockedStsExpiry = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountBoePercentance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInBeforeDepositAccountBoePercentance() {
        return inBeforeDepositAccountBoePercentance;
    }

    /**
     * Sets the value of the inBeforeDepositAccountBoePercentance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInBeforeDepositAccountBoePercentance(BigDecimal value) {
        this.inBeforeDepositAccountBoePercentance = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountBoeSpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInBeforeDepositAccountBoeSpread() {
        return inBeforeDepositAccountBoeSpread;
    }

    /**
     * Sets the value of the inBeforeDepositAccountBoeSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInBeforeDepositAccountBoeSpread(BigDecimal value) {
        this.inBeforeDepositAccountBoeSpread = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountBookNo property.
     * 
     */
    public int getInBeforeDepositAccountBookNo() {
        return inBeforeDepositAccountBookNo;
    }

    /**
     * Sets the value of the inBeforeDepositAccountBookNo property.
     * 
     */
    public void setInBeforeDepositAccountBookNo(int value) {
        this.inBeforeDepositAccountBookNo = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountCobenefCount property.
     * 
     */
    public short getInBeforeDepositAccountCobenefCount() {
        return inBeforeDepositAccountCobenefCount;
    }

    /**
     * Sets the value of the inBeforeDepositAccountCobenefCount property.
     * 
     */
    public void setInBeforeDepositAccountCobenefCount(short value) {
        this.inBeforeDepositAccountCobenefCount = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountCobenefSnMail property.
     * 
     */
    public short getInBeforeDepositAccountCobenefSnMail() {
        return inBeforeDepositAccountCobenefSnMail;
    }

    /**
     * Sets the value of the inBeforeDepositAccountCobenefSnMail property.
     * 
     */
    public void setInBeforeDepositAccountCobenefSnMail(short value) {
        this.inBeforeDepositAccountCobenefSnMail = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountColInsertionDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBeforeDepositAccountColInsertionDt() {
        return inBeforeDepositAccountColInsertionDt;
    }

    /**
     * Sets the value of the inBeforeDepositAccountColInsertionDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBeforeDepositAccountColInsertionDt(XMLGregorianCalendar value) {
        this.inBeforeDepositAccountColInsertionDt = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountCollateralFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeDepositAccountCollateralFlg() {
        return inBeforeDepositAccountCollateralFlg;
    }

    /**
     * Sets the value of the inBeforeDepositAccountCollateralFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeDepositAccountCollateralFlg(String value) {
        this.inBeforeDepositAccountCollateralFlg = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountCorrespAccInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeDepositAccountCorrespAccInd() {
        return inBeforeDepositAccountCorrespAccInd;
    }

    /**
     * Sets the value of the inBeforeDepositAccountCorrespAccInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeDepositAccountCorrespAccInd(String value) {
        this.inBeforeDepositAccountCorrespAccInd = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountCrIntRtSprdInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeDepositAccountCrIntRtSprdInd() {
        return inBeforeDepositAccountCrIntRtSprdInd;
    }

    /**
     * Sets the value of the inBeforeDepositAccountCrIntRtSprdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeDepositAccountCrIntRtSprdInd(String value) {
        this.inBeforeDepositAccountCrIntRtSprdInd = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountCrInterRateSpr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInBeforeDepositAccountCrInterRateSpr() {
        return inBeforeDepositAccountCrInterRateSpr;
    }

    /**
     * Sets the value of the inBeforeDepositAccountCrInterRateSpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInBeforeDepositAccountCrInterRateSpr(BigDecimal value) {
        this.inBeforeDepositAccountCrInterRateSpr = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountDbIntRtSprdInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeDepositAccountDbIntRtSprdInd() {
        return inBeforeDepositAccountDbIntRtSprdInd;
    }

    /**
     * Sets the value of the inBeforeDepositAccountDbIntRtSprdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeDepositAccountDbIntRtSprdInd(String value) {
        this.inBeforeDepositAccountDbIntRtSprdInd = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountDbInterRateSpr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInBeforeDepositAccountDbInterRateSpr() {
        return inBeforeDepositAccountDbInterRateSpr;
    }

    /**
     * Sets the value of the inBeforeDepositAccountDbInterRateSpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInBeforeDepositAccountDbInterRateSpr(BigDecimal value) {
        this.inBeforeDepositAccountDbInterRateSpr = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountDefiniteDelay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeDepositAccountDefiniteDelay() {
        return inBeforeDepositAccountDefiniteDelay;
    }

    /**
     * Sets the value of the inBeforeDepositAccountDefiniteDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeDepositAccountDefiniteDelay(String value) {
        this.inBeforeDepositAccountDefiniteDelay = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeDepositAccountDesignation() {
        return inBeforeDepositAccountDesignation;
    }

    /**
     * Sets the value of the inBeforeDepositAccountDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeDepositAccountDesignation(String value) {
        this.inBeforeDepositAccountDesignation = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountDrawDownWxpDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBeforeDepositAccountDrawDownWxpDate() {
        return inBeforeDepositAccountDrawDownWxpDate;
    }

    /**
     * Sets the value of the inBeforeDepositAccountDrawDownWxpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBeforeDepositAccountDrawDownWxpDate(XMLGregorianCalendar value) {
        this.inBeforeDepositAccountDrawDownWxpDate = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountEncroachTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInBeforeDepositAccountEncroachTolerance() {
        return inBeforeDepositAccountEncroachTolerance;
    }

    /**
     * Sets the value of the inBeforeDepositAccountEncroachTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInBeforeDepositAccountEncroachTolerance(BigDecimal value) {
        this.inBeforeDepositAccountEncroachTolerance = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeDepositAccountEntryStatus() {
        return inBeforeDepositAccountEntryStatus;
    }

    /**
     * Sets the value of the inBeforeDepositAccountEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeDepositAccountEntryStatus(String value) {
        this.inBeforeDepositAccountEntryStatus = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountExpCrIntSprd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBeforeDepositAccountExpCrIntSprd() {
        return inBeforeDepositAccountExpCrIntSprd;
    }

    /**
     * Sets the value of the inBeforeDepositAccountExpCrIntSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBeforeDepositAccountExpCrIntSprd(XMLGregorianCalendar value) {
        this.inBeforeDepositAccountExpCrIntSprd = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountExpDbIntSprd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBeforeDepositAccountExpDbIntSprd() {
        return inBeforeDepositAccountExpDbIntSprd;
    }

    /**
     * Sets the value of the inBeforeDepositAccountExpDbIntSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBeforeDepositAccountExpDbIntSprd(XMLGregorianCalendar value) {
        this.inBeforeDepositAccountExpDbIntSprd = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountExternalAccFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeDepositAccountExternalAccFlag() {
        return inBeforeDepositAccountExternalAccFlag;
    }

    /**
     * Sets the value of the inBeforeDepositAccountExternalAccFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeDepositAccountExternalAccFlag(String value) {
        this.inBeforeDepositAccountExternalAccFlag = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountExtraitPrintDay property.
     * 
     */
    public short getInBeforeDepositAccountExtraitPrintDay() {
        return inBeforeDepositAccountExtraitPrintDay;
    }

    /**
     * Sets the value of the inBeforeDepositAccountExtraitPrintDay property.
     * 
     */
    public void setInBeforeDepositAccountExtraitPrintDay(short value) {
        this.inBeforeDepositAccountExtraitPrintDay = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountFinalWhldTaxFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeDepositAccountFinalWhldTaxFlg() {
        return inBeforeDepositAccountFinalWhldTaxFlg;
    }

    /**
     * Sets the value of the inBeforeDepositAccountFinalWhldTaxFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeDepositAccountFinalWhldTaxFlg(String value) {
        this.inBeforeDepositAccountFinalWhldTaxFlg = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountFixedInterFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeDepositAccountFixedInterFlag() {
        return inBeforeDepositAccountFixedInterFlag;
    }

    /**
     * Sets the value of the inBeforeDepositAccountFixedInterFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeDepositAccountFixedInterFlag(String value) {
        this.inBeforeDepositAccountFixedInterFlag = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountFixedInterRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInBeforeDepositAccountFixedInterRate() {
        return inBeforeDepositAccountFixedInterRate;
    }

    /**
     * Sets the value of the inBeforeDepositAccountFixedInterRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInBeforeDepositAccountFixedInterRate(BigDecimal value) {
        this.inBeforeDepositAccountFixedInterRate = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountHomeBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeDepositAccountHomeBranch() {
        return inBeforeDepositAccountHomeBranch;
    }

    /**
     * Sets the value of the inBeforeDepositAccountHomeBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeDepositAccountHomeBranch(String value) {
        this.inBeforeDepositAccountHomeBranch = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountIncomeAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInBeforeDepositAccountIncomeAmnt() {
        return inBeforeDepositAccountIncomeAmnt;
    }

    /**
     * Sets the value of the inBeforeDepositAccountIncomeAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInBeforeDepositAccountIncomeAmnt(BigDecimal value) {
        this.inBeforeDepositAccountIncomeAmnt = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountIncomeFrequency property.
     * 
     */
    public int getInBeforeDepositAccountIncomeFrequency() {
        return inBeforeDepositAccountIncomeFrequency;
    }

    /**
     * Sets the value of the inBeforeDepositAccountIncomeFrequency property.
     * 
     */
    public void setInBeforeDepositAccountIncomeFrequency(int value) {
        this.inBeforeDepositAccountIncomeFrequency = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountInspectionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBeforeDepositAccountInspectionDate() {
        return inBeforeDepositAccountInspectionDate;
    }

    /**
     * Sets the value of the inBeforeDepositAccountInspectionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBeforeDepositAccountInspectionDate(XMLGregorianCalendar value) {
        this.inBeforeDepositAccountInspectionDate = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountKadFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeDepositAccountKadFlg() {
        return inBeforeDepositAccountKadFlg;
    }

    /**
     * Sets the value of the inBeforeDepositAccountKadFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeDepositAccountKadFlg(String value) {
        this.inBeforeDepositAccountKadFlg = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountLastInactiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBeforeDepositAccountLastInactiveDate() {
        return inBeforeDepositAccountLastInactiveDate;
    }

    /**
     * Sets the value of the inBeforeDepositAccountLastInactiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBeforeDepositAccountLastInactiveDate(XMLGregorianCalendar value) {
        this.inBeforeDepositAccountLastInactiveDate = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountLastIntChangDat property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBeforeDepositAccountLastIntChangDat() {
        return inBeforeDepositAccountLastIntChangDat;
    }

    /**
     * Sets the value of the inBeforeDepositAccountLastIntChangDat property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBeforeDepositAccountLastIntChangDat(XMLGregorianCalendar value) {
        this.inBeforeDepositAccountLastIntChangDat = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountLastMaxUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBeforeDepositAccountLastMaxUpdateDate() {
        return inBeforeDepositAccountLastMaxUpdateDate;
    }

    /**
     * Sets the value of the inBeforeDepositAccountLastMaxUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBeforeDepositAccountLastMaxUpdateDate(XMLGregorianCalendar value) {
        this.inBeforeDepositAccountLastMaxUpdateDate = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountMaxLastDpPer property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInBeforeDepositAccountMaxLastDpPer() {
        return inBeforeDepositAccountMaxLastDpPer;
    }

    /**
     * Sets the value of the inBeforeDepositAccountMaxLastDpPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInBeforeDepositAccountMaxLastDpPer(BigDecimal value) {
        this.inBeforeDepositAccountMaxLastDpPer = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountMaxLastUpdate property.
     * 
     */
    public short getInBeforeDepositAccountMaxLastUpdate() {
        return inBeforeDepositAccountMaxLastUpdate;
    }

    /**
     * Sets the value of the inBeforeDepositAccountMaxLastUpdate property.
     * 
     */
    public void setInBeforeDepositAccountMaxLastUpdate(short value) {
        this.inBeforeDepositAccountMaxLastUpdate = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountMinLastMFPer property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInBeforeDepositAccountMinLastMFPer() {
        return inBeforeDepositAccountMinLastMFPer;
    }

    /**
     * Sets the value of the inBeforeDepositAccountMinLastMFPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInBeforeDepositAccountMinLastMFPer(BigDecimal value) {
        this.inBeforeDepositAccountMinLastMFPer = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountMultiSalaryAmnt property.
     * 
     */
    public short getInBeforeDepositAccountMultiSalaryAmnt() {
        return inBeforeDepositAccountMultiSalaryAmnt;
    }

    /**
     * Sets the value of the inBeforeDepositAccountMultiSalaryAmnt property.
     * 
     */
    public void setInBeforeDepositAccountMultiSalaryAmnt(short value) {
        this.inBeforeDepositAccountMultiSalaryAmnt = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountNotExpensesFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeDepositAccountNotExpensesFlg() {
        return inBeforeDepositAccountNotExpensesFlg;
    }

    /**
     * Sets the value of the inBeforeDepositAccountNotExpensesFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeDepositAccountNotExpensesFlg(String value) {
        this.inBeforeDepositAccountNotExpensesFlg = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountNotifSpreadDayB property.
     * 
     */
    public short getInBeforeDepositAccountNotifSpreadDayB() {
        return inBeforeDepositAccountNotifSpreadDayB;
    }

    /**
     * Sets the value of the inBeforeDepositAccountNotifSpreadDayB property.
     * 
     */
    public void setInBeforeDepositAccountNotifSpreadDayB(short value) {
        this.inBeforeDepositAccountNotifSpreadDayB = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountNotifSpreadDays property.
     * 
     */
    public short getInBeforeDepositAccountNotifSpreadDays() {
        return inBeforeDepositAccountNotifSpreadDays;
    }

    /**
     * Sets the value of the inBeforeDepositAccountNotifSpreadDays property.
     * 
     */
    public void setInBeforeDepositAccountNotifSpreadDays(short value) {
        this.inBeforeDepositAccountNotifSpreadDays = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountOfficeAccFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeDepositAccountOfficeAccFlag() {
        return inBeforeDepositAccountOfficeAccFlag;
    }

    /**
     * Sets the value of the inBeforeDepositAccountOfficeAccFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeDepositAccountOfficeAccFlag(String value) {
        this.inBeforeDepositAccountOfficeAccFlag = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountOverdraftComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeDepositAccountOverdraftComment() {
        return inBeforeDepositAccountOverdraftComment;
    }

    /**
     * Sets the value of the inBeforeDepositAccountOverdraftComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeDepositAccountOverdraftComment(String value) {
        this.inBeforeDepositAccountOverdraftComment = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountOverdraftSpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInBeforeDepositAccountOverdraftSpread() {
        return inBeforeDepositAccountOverdraftSpread;
    }

    /**
     * Sets the value of the inBeforeDepositAccountOverdraftSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInBeforeDepositAccountOverdraftSpread(BigDecimal value) {
        this.inBeforeDepositAccountOverdraftSpread = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountRenewalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBeforeDepositAccountRenewalDate() {
        return inBeforeDepositAccountRenewalDate;
    }

    /**
     * Sets the value of the inBeforeDepositAccountRenewalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBeforeDepositAccountRenewalDate(XMLGregorianCalendar value) {
        this.inBeforeDepositAccountRenewalDate = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountRenewalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeDepositAccountRenewalFlag() {
        return inBeforeDepositAccountRenewalFlag;
    }

    /**
     * Sets the value of the inBeforeDepositAccountRenewalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeDepositAccountRenewalFlag(String value) {
        this.inBeforeDepositAccountRenewalFlag = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountRestrictAccFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeDepositAccountRestrictAccFlag() {
        return inBeforeDepositAccountRestrictAccFlag;
    }

    /**
     * Sets the value of the inBeforeDepositAccountRestrictAccFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeDepositAccountRestrictAccFlag(String value) {
        this.inBeforeDepositAccountRestrictAccFlag = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountRetainingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBeforeDepositAccountRetainingDate() {
        return inBeforeDepositAccountRetainingDate;
    }

    /**
     * Sets the value of the inBeforeDepositAccountRetainingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBeforeDepositAccountRetainingDate(XMLGregorianCalendar value) {
        this.inBeforeDepositAccountRetainingDate = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountSecretAccFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeDepositAccountSecretAccFlag() {
        return inBeforeDepositAccountSecretAccFlag;
    }

    /**
     * Sets the value of the inBeforeDepositAccountSecretAccFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeDepositAccountSecretAccFlag(String value) {
        this.inBeforeDepositAccountSecretAccFlag = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountServicePenalSpr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInBeforeDepositAccountServicePenalSpr() {
        return inBeforeDepositAccountServicePenalSpr;
    }

    /**
     * Sets the value of the inBeforeDepositAccountServicePenalSpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInBeforeDepositAccountServicePenalSpr(BigDecimal value) {
        this.inBeforeDepositAccountServicePenalSpr = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountSpecialAccFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeDepositAccountSpecialAccFlg() {
        return inBeforeDepositAccountSpecialAccFlg;
    }

    /**
     * Sets the value of the inBeforeDepositAccountSpecialAccFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeDepositAccountSpecialAccFlg(String value) {
        this.inBeforeDepositAccountSpecialAccFlg = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountStatementIssFreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeDepositAccountStatementIssFreq() {
        return inBeforeDepositAccountStatementIssFreq;
    }

    /**
     * Sets the value of the inBeforeDepositAccountStatementIssFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeDepositAccountStatementIssFreq(String value) {
        this.inBeforeDepositAccountStatementIssFreq = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountTargetFlg property.
     * 
     */
    public short getInBeforeDepositAccountTargetFlg() {
        return inBeforeDepositAccountTargetFlg;
    }

    /**
     * Sets the value of the inBeforeDepositAccountTargetFlg property.
     * 
     */
    public void setInBeforeDepositAccountTargetFlg(short value) {
        this.inBeforeDepositAccountTargetFlg = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountTaxExcempFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeDepositAccountTaxExcempFlg() {
        return inBeforeDepositAccountTaxExcempFlg;
    }

    /**
     * Sets the value of the inBeforeDepositAccountTaxExcempFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeDepositAccountTaxExcempFlg(String value) {
        this.inBeforeDepositAccountTaxExcempFlg = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountTdBatchExtrtFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeDepositAccountTdBatchExtrtFlg() {
        return inBeforeDepositAccountTdBatchExtrtFlg;
    }

    /**
     * Sets the value of the inBeforeDepositAccountTdBatchExtrtFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeDepositAccountTdBatchExtrtFlg(String value) {
        this.inBeforeDepositAccountTdBatchExtrtFlg = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountTdInterPercentChg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInBeforeDepositAccountTdInterPercentChg() {
        return inBeforeDepositAccountTdInterPercentChg;
    }

    /**
     * Sets the value of the inBeforeDepositAccountTdInterPercentChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInBeforeDepositAccountTdInterPercentChg(BigDecimal value) {
        this.inBeforeDepositAccountTdInterPercentChg = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountTdInterSprdChg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInBeforeDepositAccountTdInterSprdChg() {
        return inBeforeDepositAccountTdInterSprdChg;
    }

    /**
     * Sets the value of the inBeforeDepositAccountTdInterSprdChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInBeforeDepositAccountTdInterSprdChg(BigDecimal value) {
        this.inBeforeDepositAccountTdInterSprdChg = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountTelebankingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeDepositAccountTelebankingFlag() {
        return inBeforeDepositAccountTelebankingFlag;
    }

    /**
     * Sets the value of the inBeforeDepositAccountTelebankingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeDepositAccountTelebankingFlag(String value) {
        this.inBeforeDepositAccountTelebankingFlag = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountTempExcEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBeforeDepositAccountTempExcEndDt() {
        return inBeforeDepositAccountTempExcEndDt;
    }

    /**
     * Sets the value of the inBeforeDepositAccountTempExcEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBeforeDepositAccountTempExcEndDt(XMLGregorianCalendar value) {
        this.inBeforeDepositAccountTempExcEndDt = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountTempExcStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBeforeDepositAccountTempExcStartDt() {
        return inBeforeDepositAccountTempExcStartDt;
    }

    /**
     * Sets the value of the inBeforeDepositAccountTempExcStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBeforeDepositAccountTempExcStartDt(XMLGregorianCalendar value) {
        this.inBeforeDepositAccountTempExcStartDt = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountTemporaryExcess property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInBeforeDepositAccountTemporaryExcess() {
        return inBeforeDepositAccountTemporaryExcess;
    }

    /**
     * Sets the value of the inBeforeDepositAccountTemporaryExcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInBeforeDepositAccountTemporaryExcess(BigDecimal value) {
        this.inBeforeDepositAccountTemporaryExcess = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountThirdpartyInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeDepositAccountThirdpartyInd() {
        return inBeforeDepositAccountThirdpartyInd;
    }

    /**
     * Sets the value of the inBeforeDepositAccountThirdpartyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeDepositAccountThirdpartyInd(String value) {
        this.inBeforeDepositAccountThirdpartyInd = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountUnclearWithdrFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeDepositAccountUnclearWithdrFlg() {
        return inBeforeDepositAccountUnclearWithdrFlg;
    }

    /**
     * Sets the value of the inBeforeDepositAccountUnclearWithdrFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeDepositAccountUnclearWithdrFlg(String value) {
        this.inBeforeDepositAccountUnclearWithdrFlg = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountUnutilLimitPenD property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInBeforeDepositAccountUnutilLimitPenD() {
        return inBeforeDepositAccountUnutilLimitPenD;
    }

    /**
     * Sets the value of the inBeforeDepositAccountUnutilLimitPenD property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInBeforeDepositAccountUnutilLimitPenD(BigDecimal value) {
        this.inBeforeDepositAccountUnutilLimitPenD = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountValidChqDuration property.
     * 
     */
    public int getInBeforeDepositAccountValidChqDuration() {
        return inBeforeDepositAccountValidChqDuration;
    }

    /**
     * Sets the value of the inBeforeDepositAccountValidChqDuration property.
     * 
     */
    public void setInBeforeDepositAccountValidChqDuration(int value) {
        this.inBeforeDepositAccountValidChqDuration = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountWebFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeDepositAccountWebFlg() {
        return inBeforeDepositAccountWebFlg;
    }

    /**
     * Sets the value of the inBeforeDepositAccountWebFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeDepositAccountWebFlg(String value) {
        this.inBeforeDepositAccountWebFlg = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountWebModDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBeforeDepositAccountWebModDate() {
        return inBeforeDepositAccountWebModDate;
    }

    /**
     * Sets the value of the inBeforeDepositAccountWebModDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBeforeDepositAccountWebModDate(XMLGregorianCalendar value) {
        this.inBeforeDepositAccountWebModDate = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountWithdrawAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInBeforeDepositAccountWithdrawAmnt() {
        return inBeforeDepositAccountWithdrawAmnt;
    }

    /**
     * Sets the value of the inBeforeDepositAccountWithdrawAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInBeforeDepositAccountWithdrawAmnt(BigDecimal value) {
        this.inBeforeDepositAccountWithdrawAmnt = value;
    }

    /**
     * Gets the value of the inBeforeDepositAccountWthdrawSpread property.
     * 
     */
    public short getInBeforeDepositAccountWthdrawSpread() {
        return inBeforeDepositAccountWthdrawSpread;
    }

    /**
     * Sets the value of the inBeforeDepositAccountWthdrawSpread property.
     * 
     */
    public void setInBeforeDepositAccountWthdrawSpread(short value) {
        this.inBeforeDepositAccountWthdrawSpread = value;
    }

    /**
     * Gets the value of the inBeforeHouseUnitCode property.
     * 
     */
    public int getInBeforeHouseUnitCode() {
        return inBeforeHouseUnitCode;
    }

    /**
     * Sets the value of the inBeforeHouseUnitCode property.
     * 
     */
    public void setInBeforeHouseUnitCode(int value) {
        this.inBeforeHouseUnitCode = value;
    }

    /**
     * Gets the value of the inBeforeKekGenericDetailSerialNum property.
     * 
     */
    public int getInBeforeKekGenericDetailSerialNum() {
        return inBeforeKekGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inBeforeKekGenericDetailSerialNum property.
     * 
     */
    public void setInBeforeKekGenericDetailSerialNum(int value) {
        this.inBeforeKekGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inBeforeLkepGenericDetailEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeLkepGenericDetailEntryStatus() {
        return inBeforeLkepGenericDetailEntryStatus;
    }

    /**
     * Sets the value of the inBeforeLkepGenericDetailEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeLkepGenericDetailEntryStatus(String value) {
        this.inBeforeLkepGenericDetailEntryStatus = value;
    }

    /**
     * Gets the value of the inBeforeLkepGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeLkepGenericDetailParameterType() {
        return inBeforeLkepGenericDetailParameterType;
    }

    /**
     * Sets the value of the inBeforeLkepGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeLkepGenericDetailParameterType(String value) {
        this.inBeforeLkepGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inBeforeLkepGenericDetailSerialNum property.
     * 
     */
    public int getInBeforeLkepGenericDetailSerialNum() {
        return inBeforeLkepGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inBeforeLkepGenericDetailSerialNum property.
     * 
     */
    public void setInBeforeLkepGenericDetailSerialNum(int value) {
        this.inBeforeLkepGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inBeforeLpurpGenericDetailEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeLpurpGenericDetailEntryStatus() {
        return inBeforeLpurpGenericDetailEntryStatus;
    }

    /**
     * Sets the value of the inBeforeLpurpGenericDetailEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeLpurpGenericDetailEntryStatus(String value) {
        this.inBeforeLpurpGenericDetailEntryStatus = value;
    }

    /**
     * Gets the value of the inBeforeLpurpGenericDetailSerialNum property.
     * 
     */
    public int getInBeforeLpurpGenericDetailSerialNum() {
        return inBeforeLpurpGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inBeforeLpurpGenericDetailSerialNum property.
     * 
     */
    public void setInBeforeLpurpGenericDetailSerialNum(int value) {
        this.inBeforeLpurpGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inBeforeMailCustAddressSerialNum property.
     * 
     */
    public short getInBeforeMailCustAddressSerialNum() {
        return inBeforeMailCustAddressSerialNum;
    }

    /**
     * Sets the value of the inBeforeMailCustAddressSerialNum property.
     * 
     */
    public void setInBeforeMailCustAddressSerialNum(short value) {
        this.inBeforeMailCustAddressSerialNum = value;
    }

    /**
     * Gets the value of the inBeforeMonitoringBankemployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeMonitoringBankemployeeId() {
        return inBeforeMonitoringBankemployeeId;
    }

    /**
     * Sets the value of the inBeforeMonitoringBankemployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeMonitoringBankemployeeId(String value) {
        this.inBeforeMonitoringBankemployeeId = value;
    }

    /**
     * Gets the value of the inBeforeServiceDepositAccountProfitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeforeServiceDepositAccountProfitsAccountNumber() {
        return inBeforeServiceDepositAccountProfitsAccountNumber;
    }

    /**
     * Sets the value of the inBeforeServiceDepositAccountProfitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeforeServiceDepositAccountProfitsAccountNumber(String value) {
        this.inBeforeServiceDepositAccountProfitsAccountNumber = value;
    }

    /**
     * Gets the value of the inBeforeServiceDepositAccountProfitsAccountCd property.
     * 
     */
    public short getInBeforeServiceDepositAccountProfitsAccountCd() {
        return inBeforeServiceDepositAccountProfitsAccountCd;
    }

    /**
     * Sets the value of the inBeforeServiceDepositAccountProfitsAccountCd property.
     * 
     */
    public void setInBeforeServiceDepositAccountProfitsAccountCd(short value) {
        this.inBeforeServiceDepositAccountProfitsAccountCd = value;
    }

    /**
     * Gets the value of the inBeforeUnutillPenLnsCommissionIdCommission property.
     * 
     */
    public int getInBeforeUnutillPenLnsCommissionIdCommission() {
        return inBeforeUnutillPenLnsCommissionIdCommission;
    }

    /**
     * Sets the value of the inBeforeUnutillPenLnsCommissionIdCommission property.
     * 
     */
    public void setInBeforeUnutillPenLnsCommissionIdCommission(int value) {
        this.inBeforeUnutillPenLnsCommissionIdCommission = value;
    }

    /**
     * Gets the value of the inBeforeWithdrawDayFromIefSuppliedDays property.
     * 
     */
    public int getInBeforeWithdrawDayFromIefSuppliedDays() {
        return inBeforeWithdrawDayFromIefSuppliedDays;
    }

    /**
     * Sets the value of the inBeforeWithdrawDayFromIefSuppliedDays property.
     * 
     */
    public void setInBeforeWithdrawDayFromIefSuppliedDays(int value) {
        this.inBeforeWithdrawDayFromIefSuppliedDays = value;
    }

    /**
     * Gets the value of the inBeforeWithdrawDayFromIefSuppliedMonth property.
     * 
     */
    public short getInBeforeWithdrawDayFromIefSuppliedMonth() {
        return inBeforeWithdrawDayFromIefSuppliedMonth;
    }

    /**
     * Sets the value of the inBeforeWithdrawDayFromIefSuppliedMonth property.
     * 
     */
    public void setInBeforeWithdrawDayFromIefSuppliedMonth(short value) {
        this.inBeforeWithdrawDayFromIefSuppliedMonth = value;
    }

    /**
     * Gets the value of the inBeforeWithdrawDayToIefSuppliedDays property.
     * 
     */
    public int getInBeforeWithdrawDayToIefSuppliedDays() {
        return inBeforeWithdrawDayToIefSuppliedDays;
    }

    /**
     * Sets the value of the inBeforeWithdrawDayToIefSuppliedDays property.
     * 
     */
    public void setInBeforeWithdrawDayToIefSuppliedDays(int value) {
        this.inBeforeWithdrawDayToIefSuppliedDays = value;
    }

    /**
     * Gets the value of the inBeforeWithdrawDayToIefSuppliedMonth property.
     * 
     */
    public short getInBeforeWithdrawDayToIefSuppliedMonth() {
        return inBeforeWithdrawDayToIefSuppliedMonth;
    }

    /**
     * Sets the value of the inBeforeWithdrawDayToIefSuppliedMonth property.
     * 
     */
    public void setInBeforeWithdrawDayToIefSuppliedMonth(short value) {
        this.inBeforeWithdrawDayToIefSuppliedMonth = value;
    }

    /**
     * Gets the value of the inBeneficiaryBeneficiarySn property.
     * 
     */
    public short getInBeneficiaryBeneficiarySn() {
        return inBeneficiaryBeneficiarySn;
    }

    /**
     * Sets the value of the inBeneficiaryBeneficiarySn property.
     * 
     */
    public void setInBeneficiaryBeneficiarySn(short value) {
        this.inBeneficiaryBeneficiarySn = value;
    }

    /**
     * Gets the value of the inBlockIefSuppliedText40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBlockIefSuppliedText40() {
        return inBlockIefSuppliedText40;
    }

    /**
     * Sets the value of the inBlockIefSuppliedText40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBlockIefSuppliedText40(String value) {
        this.inBlockIefSuppliedText40 = value;
    }

    /**
     * Gets the value of the inCapitalDisposalDepositAccountProfitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCapitalDisposalDepositAccountProfitsAccountNumber() {
        return inCapitalDisposalDepositAccountProfitsAccountNumber;
    }

    /**
     * Sets the value of the inCapitalDisposalDepositAccountProfitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCapitalDisposalDepositAccountProfitsAccountNumber(String value) {
        this.inCapitalDisposalDepositAccountProfitsAccountNumber = value;
    }

    /**
     * Gets the value of the inCapitalDisposalDepositAccountProfitsAccountCd property.
     * 
     */
    public short getInCapitalDisposalDepositAccountProfitsAccountCd() {
        return inCapitalDisposalDepositAccountProfitsAccountCd;
    }

    /**
     * Sets the value of the inCapitalDisposalDepositAccountProfitsAccountCd property.
     * 
     */
    public void setInCapitalDisposalDepositAccountProfitsAccountCd(short value) {
        this.inCapitalDisposalDepositAccountProfitsAccountCd = value;
    }

    /**
     * Gets the value of the inCcodeGenericDetailEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCcodeGenericDetailEntryStatus() {
        return inCcodeGenericDetailEntryStatus;
    }

    /**
     * Sets the value of the inCcodeGenericDetailEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCcodeGenericDetailEntryStatus(String value) {
        this.inCcodeGenericDetailEntryStatus = value;
    }

    /**
     * Gets the value of the inCcodeGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCcodeGenericDetailParameterType() {
        return inCcodeGenericDetailParameterType;
    }

    /**
     * Sets the value of the inCcodeGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCcodeGenericDetailParameterType(String value) {
        this.inCcodeGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inCcodeGenericDetailSerialNum property.
     * 
     */
    public int getInCcodeGenericDetailSerialNum() {
        return inCcodeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inCcodeGenericDetailSerialNum property.
     * 
     */
    public void setInCcodeGenericDetailSerialNum(int value) {
        this.inCcodeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inCountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCountryGenericDetailDescription() {
        return inCountryGenericDetailDescription;
    }

    /**
     * Sets the value of the inCountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCountryGenericDetailDescription(String value) {
        this.inCountryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inCrDbInterestDepositAccountProfitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCrDbInterestDepositAccountProfitsAccountNumber() {
        return inCrDbInterestDepositAccountProfitsAccountNumber;
    }

    /**
     * Sets the value of the inCrDbInterestDepositAccountProfitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCrDbInterestDepositAccountProfitsAccountNumber(String value) {
        this.inCrDbInterestDepositAccountProfitsAccountNumber = value;
    }

    /**
     * Gets the value of the inCrDbInterestDepositAccountProfitsAccountCd property.
     * 
     */
    public short getInCrDbInterestDepositAccountProfitsAccountCd() {
        return inCrDbInterestDepositAccountProfitsAccountCd;
    }

    /**
     * Sets the value of the inCrDbInterestDepositAccountProfitsAccountCd property.
     * 
     */
    public void setInCrDbInterestDepositAccountProfitsAccountCd(short value) {
        this.inCrDbInterestDepositAccountProfitsAccountCd = value;
    }

    /**
     * Gets the value of the inCrLnsInterestIdInterest property.
     * 
     */
    public int getInCrLnsInterestIdInterest() {
        return inCrLnsInterestIdInterest;
    }

    /**
     * Sets the value of the inCrLnsInterestIdInterest property.
     * 
     */
    public void setInCrLnsInterestIdInterest(int value) {
        this.inCrLnsInterestIdInterest = value;
    }

    /**
     * Gets the value of the inCurrencyIdCurrency property.
     * 
     */
    public int getInCurrencyIdCurrency() {
        return inCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inCurrencyIdCurrency property.
     * 
     */
    public void setInCurrencyIdCurrency(int value) {
        this.inCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inCustCategGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustCategGenericDetailDescription() {
        return inCustCategGenericDetailDescription;
    }

    /**
     * Sets the value of the inCustCategGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustCategGenericDetailDescription(String value) {
        this.inCustCategGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inCustCategGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustCategGenericDetailParameterType() {
        return inCustCategGenericDetailParameterType;
    }

    /**
     * Sets the value of the inCustCategGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustCategGenericDetailParameterType(String value) {
        this.inCustCategGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inCustCategGenericDetailSerialNum property.
     * 
     */
    public int getInCustCategGenericDetailSerialNum() {
        return inCustCategGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inCustCategGenericDetailSerialNum property.
     * 
     */
    public void setInCustCategGenericDetailSerialNum(int value) {
        this.inCustCategGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inCustidCustomerCustId property.
     * 
     */
    public int getInCustidCustomerCustId() {
        return inCustidCustomerCustId;
    }

    /**
     * Sets the value of the inCustidCustomerCustId property.
     * 
     */
    public void setInCustidCustomerCustId(int value) {
        this.inCustidCustomerCustId = value;
    }

    /**
     * Gets the value of the inDbLnsInterestIdInterest property.
     * 
     */
    public int getInDbLnsInterestIdInterest() {
        return inDbLnsInterestIdInterest;
    }

    /**
     * Sets the value of the inDbLnsInterestIdInterest property.
     * 
     */
    public void setInDbLnsInterestIdInterest(int value) {
        this.inDbLnsInterestIdInterest = value;
    }

    /**
     * Gets the value of the inDepAccTrAccTrAccCd property.
     * 
     */
    public short getInDepAccTrAccTrAccCd() {
        return inDepAccTrAccTrAccCd;
    }

    /**
     * Sets the value of the inDepAccTrAccTrAccCd property.
     * 
     */
    public void setInDepAccTrAccTrAccCd(short value) {
        this.inDepAccTrAccTrAccCd = value;
    }

    /**
     * Gets the value of the inDepAccTrAccTrAccSn property.
     * 
     */
    public int getInDepAccTrAccTrAccSn() {
        return inDepAccTrAccTrAccSn;
    }

    /**
     * Sets the value of the inDepAccTrAccTrAccSn property.
     * 
     */
    public void setInDepAccTrAccTrAccSn(int value) {
        this.inDepAccTrAccTrAccSn = value;
    }

    /**
     * Gets the value of the inDepAccTrAccTrAccType property.
     * 
     */
    public short getInDepAccTrAccTrAccType() {
        return inDepAccTrAccTrAccType;
    }

    /**
     * Sets the value of the inDepAccTrAccTrAccType property.
     * 
     */
    public void setInDepAccTrAccTrAccType(short value) {
        this.inDepAccTrAccTrAccType = value;
    }

    /**
     * Gets the value of the inDepAccTrAccTrAccUnit property.
     * 
     */
    public int getInDepAccTrAccTrAccUnit() {
        return inDepAccTrAccTrAccUnit;
    }

    /**
     * Sets the value of the inDepAccTrAccTrAccUnit property.
     * 
     */
    public void setInDepAccTrAccTrAccUnit(int value) {
        this.inDepAccTrAccTrAccUnit = value;
    }

    /**
     * Gets the value of the inDepAccountInfoCurFxIntExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepAccountInfoCurFxIntExpDt() {
        return inDepAccountInfoCurFxIntExpDt;
    }

    /**
     * Sets the value of the inDepAccountInfoCurFxIntExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepAccountInfoCurFxIntExpDt(XMLGregorianCalendar value) {
        this.inDepAccountInfoCurFxIntExpDt = value;
    }

    /**
     * Gets the value of the inDepAccountInfoCurFxIntStDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepAccountInfoCurFxIntStDt() {
        return inDepAccountInfoCurFxIntStDt;
    }

    /**
     * Sets the value of the inDepAccountInfoCurFxIntStDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepAccountInfoCurFxIntStDt(XMLGregorianCalendar value) {
        this.inDepAccountInfoCurFxIntStDt = value;
    }

    /**
     * Gets the value of the inDepAccountInfoOaCollFreqUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepAccountInfoOaCollFreqUnit() {
        return inDepAccountInfoOaCollFreqUnit;
    }

    /**
     * Sets the value of the inDepAccountInfoOaCollFreqUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepAccountInfoOaCollFreqUnit(String value) {
        this.inDepAccountInfoOaCollFreqUnit = value;
    }

    /**
     * Gets the value of the inDepAccountInfoOaCollectFreq property.
     * 
     */
    public short getInDepAccountInfoOaCollectFreq() {
        return inDepAccountInfoOaCollectFreq;
    }

    /**
     * Sets the value of the inDepAccountInfoOaCollectFreq property.
     * 
     */
    public void setInDepAccountInfoOaCollectFreq(short value) {
        this.inDepAccountInfoOaCollectFreq = value;
    }

    /**
     * Gets the value of the inDepAccountInfoOaDuration property.
     * 
     */
    public short getInDepAccountInfoOaDuration() {
        return inDepAccountInfoOaDuration;
    }

    /**
     * Sets the value of the inDepAccountInfoOaDuration property.
     * 
     */
    public void setInDepAccountInfoOaDuration(short value) {
        this.inDepAccountInfoOaDuration = value;
    }

    /**
     * Gets the value of the inDepAccountInfoOaDurationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepAccountInfoOaDurationUnit() {
        return inDepAccountInfoOaDurationUnit;
    }

    /**
     * Sets the value of the inDepAccountInfoOaDurationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepAccountInfoOaDurationUnit(String value) {
        this.inDepAccountInfoOaDurationUnit = value;
    }

    /**
     * Gets the value of the inDepPendingTrxTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepPendingTrxTrxDate() {
        return inDepPendingTrxTrxDate;
    }

    /**
     * Sets the value of the inDepPendingTrxTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepPendingTrxTrxDate(XMLGregorianCalendar value) {
        this.inDepPendingTrxTrxDate = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipCounterYear property.
     * 
     */
    public short getInDepSwiftParticipCounterYear() {
        return inDepSwiftParticipCounterYear;
    }

    /**
     * Sets the value of the inDepSwiftParticipCounterYear property.
     * 
     */
    public void setInDepSwiftParticipCounterYear(short value) {
        this.inDepSwiftParticipCounterYear = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipCtiMt940 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepSwiftParticipCtiMt940() {
        return inDepSwiftParticipCtiMt940;
    }

    /**
     * Sets the value of the inDepSwiftParticipCtiMt940 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepSwiftParticipCtiMt940(String value) {
        this.inDepSwiftParticipCtiMt940 = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipCtiMt9401 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepSwiftParticipCtiMt9401() {
        return inDepSwiftParticipCtiMt9401;
    }

    /**
     * Sets the value of the inDepSwiftParticipCtiMt9401 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepSwiftParticipCtiMt9401(String value) {
        this.inDepSwiftParticipCtiMt9401 = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipCtiMt9402 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepSwiftParticipCtiMt9402() {
        return inDepSwiftParticipCtiMt9402;
    }

    /**
     * Sets the value of the inDepSwiftParticipCtiMt9402 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepSwiftParticipCtiMt9402(String value) {
        this.inDepSwiftParticipCtiMt9402 = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipCtiMt9403 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepSwiftParticipCtiMt9403() {
        return inDepSwiftParticipCtiMt9403;
    }

    /**
     * Sets the value of the inDepSwiftParticipCtiMt9403 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepSwiftParticipCtiMt9403(String value) {
        this.inDepSwiftParticipCtiMt9403 = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipCtiMt9404 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepSwiftParticipCtiMt9404() {
        return inDepSwiftParticipCtiMt9404;
    }

    /**
     * Sets the value of the inDepSwiftParticipCtiMt9404 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepSwiftParticipCtiMt9404(String value) {
        this.inDepSwiftParticipCtiMt9404 = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipLast940SgCntr property.
     * 
     */
    public int getInDepSwiftParticipLast940SgCntr() {
        return inDepSwiftParticipLast940SgCntr;
    }

    /**
     * Sets the value of the inDepSwiftParticipLast940SgCntr property.
     * 
     */
    public void setInDepSwiftParticipLast940SgCntr(int value) {
        this.inDepSwiftParticipLast940SgCntr = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipLast940SwCntr property.
     * 
     */
    public int getInDepSwiftParticipLast940SwCntr() {
        return inDepSwiftParticipLast940SwCntr;
    }

    /**
     * Sets the value of the inDepSwiftParticipLast940SwCntr property.
     * 
     */
    public void setInDepSwiftParticipLast940SwCntr(int value) {
        this.inDepSwiftParticipLast940SwCntr = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipLast942SgCntr property.
     * 
     */
    public int getInDepSwiftParticipLast942SgCntr() {
        return inDepSwiftParticipLast942SgCntr;
    }

    /**
     * Sets the value of the inDepSwiftParticipLast942SgCntr property.
     * 
     */
    public void setInDepSwiftParticipLast942SgCntr(int value) {
        this.inDepSwiftParticipLast942SgCntr = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipLast950SwCntr property.
     * 
     */
    public int getInDepSwiftParticipLast950SwCntr() {
        return inDepSwiftParticipLast950SwCntr;
    }

    /**
     * Sets the value of the inDepSwiftParticipLast950SwCntr property.
     * 
     */
    public void setInDepSwiftParticipLast950SwCntr(int value) {
        this.inDepSwiftParticipLast950SwCntr = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipLastBalanceMt942 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepSwiftParticipLastBalanceMt942() {
        return inDepSwiftParticipLastBalanceMt942;
    }

    /**
     * Sets the value of the inDepSwiftParticipLastBalanceMt942 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepSwiftParticipLastBalanceMt942(BigDecimal value) {
        this.inDepSwiftParticipLastBalanceMt942 = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipLastCtiMt940 property.
     * 
     */
    public double getInDepSwiftParticipLastCtiMt940() {
        return inDepSwiftParticipLastCtiMt940;
    }

    /**
     * Sets the value of the inDepSwiftParticipLastCtiMt940 property.
     * 
     */
    public void setInDepSwiftParticipLastCtiMt940(double value) {
        this.inDepSwiftParticipLastCtiMt940 = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipLastEntrySerNum property.
     * 
     */
    public int getInDepSwiftParticipLastEntrySerNum() {
        return inDepSwiftParticipLastEntrySerNum;
    }

    /**
     * Sets the value of the inDepSwiftParticipLastEntrySerNum property.
     * 
     */
    public void setInDepSwiftParticipLastEntrySerNum(int value) {
        this.inDepSwiftParticipLastEntrySerNum = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipLastTmstampMt942 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepSwiftParticipLastTmstampMt942() {
        return inDepSwiftParticipLastTmstampMt942;
    }

    /**
     * Sets the value of the inDepSwiftParticipLastTmstampMt942 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepSwiftParticipLastTmstampMt942(XMLGregorianCalendar value) {
        this.inDepSwiftParticipLastTmstampMt942 = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipLastTransSerNum property.
     * 
     */
    public int getInDepSwiftParticipLastTransSerNum() {
        return inDepSwiftParticipLastTransSerNum;
    }

    /**
     * Sets the value of the inDepSwiftParticipLastTransSerNum property.
     * 
     */
    public void setInDepSwiftParticipLastTransSerNum(int value) {
        this.inDepSwiftParticipLastTransSerNum = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipReceiverSwiftId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepSwiftParticipReceiverSwiftId() {
        return inDepSwiftParticipReceiverSwiftId;
    }

    /**
     * Sets the value of the inDepSwiftParticipReceiverSwiftId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepSwiftParticipReceiverSwiftId(String value) {
        this.inDepSwiftParticipReceiverSwiftId = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipReceiverSwiftId1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepSwiftParticipReceiverSwiftId1() {
        return inDepSwiftParticipReceiverSwiftId1;
    }

    /**
     * Sets the value of the inDepSwiftParticipReceiverSwiftId1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepSwiftParticipReceiverSwiftId1(String value) {
        this.inDepSwiftParticipReceiverSwiftId1 = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipReceiverSwiftId2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepSwiftParticipReceiverSwiftId2() {
        return inDepSwiftParticipReceiverSwiftId2;
    }

    /**
     * Sets the value of the inDepSwiftParticipReceiverSwiftId2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepSwiftParticipReceiverSwiftId2(String value) {
        this.inDepSwiftParticipReceiverSwiftId2 = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipReceiverSwiftId3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepSwiftParticipReceiverSwiftId3() {
        return inDepSwiftParticipReceiverSwiftId3;
    }

    /**
     * Sets the value of the inDepSwiftParticipReceiverSwiftId3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepSwiftParticipReceiverSwiftId3(String value) {
        this.inDepSwiftParticipReceiverSwiftId3 = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipReceiverSwiftId4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepSwiftParticipReceiverSwiftId4() {
        return inDepSwiftParticipReceiverSwiftId4;
    }

    /**
     * Sets the value of the inDepSwiftParticipReceiverSwiftId4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepSwiftParticipReceiverSwiftId4(String value) {
        this.inDepSwiftParticipReceiverSwiftId4 = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipSenderSwiftId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepSwiftParticipSenderSwiftId() {
        return inDepSwiftParticipSenderSwiftId;
    }

    /**
     * Sets the value of the inDepSwiftParticipSenderSwiftId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepSwiftParticipSenderSwiftId(String value) {
        this.inDepSwiftParticipSenderSwiftId = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipSogecashMt940 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepSwiftParticipSogecashMt940() {
        return inDepSwiftParticipSogecashMt940;
    }

    /**
     * Sets the value of the inDepSwiftParticipSogecashMt940 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepSwiftParticipSogecashMt940(String value) {
        this.inDepSwiftParticipSogecashMt940 = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipSogecashMt9401 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepSwiftParticipSogecashMt9401() {
        return inDepSwiftParticipSogecashMt9401;
    }

    /**
     * Sets the value of the inDepSwiftParticipSogecashMt9401 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepSwiftParticipSogecashMt9401(String value) {
        this.inDepSwiftParticipSogecashMt9401 = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipSogecashMt9402 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepSwiftParticipSogecashMt9402() {
        return inDepSwiftParticipSogecashMt9402;
    }

    /**
     * Sets the value of the inDepSwiftParticipSogecashMt9402 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepSwiftParticipSogecashMt9402(String value) {
        this.inDepSwiftParticipSogecashMt9402 = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipSogecashMt9403 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepSwiftParticipSogecashMt9403() {
        return inDepSwiftParticipSogecashMt9403;
    }

    /**
     * Sets the value of the inDepSwiftParticipSogecashMt9403 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepSwiftParticipSogecashMt9403(String value) {
        this.inDepSwiftParticipSogecashMt9403 = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipSogecashMt9404 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepSwiftParticipSogecashMt9404() {
        return inDepSwiftParticipSogecashMt9404;
    }

    /**
     * Sets the value of the inDepSwiftParticipSogecashMt9404 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepSwiftParticipSogecashMt9404(String value) {
        this.inDepSwiftParticipSogecashMt9404 = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipSogecashMt942 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepSwiftParticipSogecashMt942() {
        return inDepSwiftParticipSogecashMt942;
    }

    /**
     * Sets the value of the inDepSwiftParticipSogecashMt942 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepSwiftParticipSogecashMt942(String value) {
        this.inDepSwiftParticipSogecashMt942 = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipSogecashMt9421 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepSwiftParticipSogecashMt9421() {
        return inDepSwiftParticipSogecashMt9421;
    }

    /**
     * Sets the value of the inDepSwiftParticipSogecashMt9421 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepSwiftParticipSogecashMt9421(String value) {
        this.inDepSwiftParticipSogecashMt9421 = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipSogecashMt9422 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepSwiftParticipSogecashMt9422() {
        return inDepSwiftParticipSogecashMt9422;
    }

    /**
     * Sets the value of the inDepSwiftParticipSogecashMt9422 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepSwiftParticipSogecashMt9422(String value) {
        this.inDepSwiftParticipSogecashMt9422 = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipSogecashMt9423 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepSwiftParticipSogecashMt9423() {
        return inDepSwiftParticipSogecashMt9423;
    }

    /**
     * Sets the value of the inDepSwiftParticipSogecashMt9423 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepSwiftParticipSogecashMt9423(String value) {
        this.inDepSwiftParticipSogecashMt9423 = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipSogecashMt9424 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepSwiftParticipSogecashMt9424() {
        return inDepSwiftParticipSogecashMt9424;
    }

    /**
     * Sets the value of the inDepSwiftParticipSogecashMt9424 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepSwiftParticipSogecashMt9424(String value) {
        this.inDepSwiftParticipSogecashMt9424 = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipSwiftMt940 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepSwiftParticipSwiftMt940() {
        return inDepSwiftParticipSwiftMt940;
    }

    /**
     * Sets the value of the inDepSwiftParticipSwiftMt940 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepSwiftParticipSwiftMt940(String value) {
        this.inDepSwiftParticipSwiftMt940 = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipSwiftMt9401 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepSwiftParticipSwiftMt9401() {
        return inDepSwiftParticipSwiftMt9401;
    }

    /**
     * Sets the value of the inDepSwiftParticipSwiftMt9401 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepSwiftParticipSwiftMt9401(String value) {
        this.inDepSwiftParticipSwiftMt9401 = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipSwiftMt9402 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepSwiftParticipSwiftMt9402() {
        return inDepSwiftParticipSwiftMt9402;
    }

    /**
     * Sets the value of the inDepSwiftParticipSwiftMt9402 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepSwiftParticipSwiftMt9402(String value) {
        this.inDepSwiftParticipSwiftMt9402 = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipSwiftMt9403 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepSwiftParticipSwiftMt9403() {
        return inDepSwiftParticipSwiftMt9403;
    }

    /**
     * Sets the value of the inDepSwiftParticipSwiftMt9403 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepSwiftParticipSwiftMt9403(String value) {
        this.inDepSwiftParticipSwiftMt9403 = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipSwiftMt9404 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepSwiftParticipSwiftMt9404() {
        return inDepSwiftParticipSwiftMt9404;
    }

    /**
     * Sets the value of the inDepSwiftParticipSwiftMt9404 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepSwiftParticipSwiftMt9404(String value) {
        this.inDepSwiftParticipSwiftMt9404 = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipSwiftMt950 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepSwiftParticipSwiftMt950() {
        return inDepSwiftParticipSwiftMt950;
    }

    /**
     * Sets the value of the inDepSwiftParticipSwiftMt950 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepSwiftParticipSwiftMt950(String value) {
        this.inDepSwiftParticipSwiftMt950 = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipSwiftMt9501 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepSwiftParticipSwiftMt9501() {
        return inDepSwiftParticipSwiftMt9501;
    }

    /**
     * Sets the value of the inDepSwiftParticipSwiftMt9501 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepSwiftParticipSwiftMt9501(String value) {
        this.inDepSwiftParticipSwiftMt9501 = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipSwiftMt9502 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepSwiftParticipSwiftMt9502() {
        return inDepSwiftParticipSwiftMt9502;
    }

    /**
     * Sets the value of the inDepSwiftParticipSwiftMt9502 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepSwiftParticipSwiftMt9502(String value) {
        this.inDepSwiftParticipSwiftMt9502 = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipSwiftMt9503 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepSwiftParticipSwiftMt9503() {
        return inDepSwiftParticipSwiftMt9503;
    }

    /**
     * Sets the value of the inDepSwiftParticipSwiftMt9503 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepSwiftParticipSwiftMt9503(String value) {
        this.inDepSwiftParticipSwiftMt9503 = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipSwiftMt9504 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepSwiftParticipSwiftMt9504() {
        return inDepSwiftParticipSwiftMt9504;
    }

    /**
     * Sets the value of the inDepSwiftParticipSwiftMt9504 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepSwiftParticipSwiftMt9504(String value) {
        this.inDepSwiftParticipSwiftMt9504 = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipSwiftStBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepSwiftParticipSwiftStBal() {
        return inDepSwiftParticipSwiftStBal;
    }

    /**
     * Sets the value of the inDepSwiftParticipSwiftStBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepSwiftParticipSwiftStBal(BigDecimal value) {
        this.inDepSwiftParticipSwiftStBal = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipSwiftStDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepSwiftParticipSwiftStDate() {
        return inDepSwiftParticipSwiftStDate;
    }

    /**
     * Sets the value of the inDepSwiftParticipSwiftStDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepSwiftParticipSwiftStDate(XMLGregorianCalendar value) {
        this.inDepSwiftParticipSwiftStDate = value;
    }

    /**
     * Gets the value of the inDepSwiftParticipTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepSwiftParticipTmstamp() {
        return inDepSwiftParticipTmstamp;
    }

    /**
     * Sets the value of the inDepSwiftParticipTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepSwiftParticipTmstamp(XMLGregorianCalendar value) {
        this.inDepSwiftParticipTmstamp = value;
    }

    /**
     * Gets the value of the inDepositAtmCardFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAtmCardFlag() {
        return inDepositAtmCardFlag;
    }

    /**
     * Sets the value of the inDepositAtmCardFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAtmCardFlag(String value) {
        this.inDepositAtmCardFlag = value;
    }

    /**
     * Gets the value of the inDepositChequeBookFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositChequeBookFlag() {
        return inDepositChequeBookFlag;
    }

    /**
     * Sets the value of the inDepositChequeBookFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositChequeBookFlag(String value) {
        this.inDepositChequeBookFlag = value;
    }

    /**
     * Gets the value of the inDepositCrInterAccLast property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositCrInterAccLast() {
        return inDepositCrInterAccLast;
    }

    /**
     * Sets the value of the inDepositCrInterAccLast property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositCrInterAccLast(XMLGregorianCalendar value) {
        this.inDepositCrInterAccLast = value;
    }

    /**
     * Gets the value of the inDepositDepositType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositDepositType() {
        return inDepositDepositType;
    }

    /**
     * Sets the value of the inDepositDepositType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositDepositType(String value) {
        this.inDepositDepositType = value;
    }

    /**
     * Gets the value of the inDepositEncroachTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositEncroachTolerance() {
        return inDepositEncroachTolerance;
    }

    /**
     * Sets the value of the inDepositEncroachTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositEncroachTolerance(BigDecimal value) {
        this.inDepositEncroachTolerance = value;
    }

    /**
     * Gets the value of the inDepositMaxCustDpPer property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositMaxCustDpPer() {
        return inDepositMaxCustDpPer;
    }

    /**
     * Sets the value of the inDepositMaxCustDpPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositMaxCustDpPer(BigDecimal value) {
        this.inDepositMaxCustDpPer = value;
    }

    /**
     * Gets the value of the inDepositMaxUpdate property.
     * 
     */
    public short getInDepositMaxUpdate() {
        return inDepositMaxUpdate;
    }

    /**
     * Sets the value of the inDepositMaxUpdate property.
     * 
     */
    public void setInDepositMaxUpdate(short value) {
        this.inDepositMaxUpdate = value;
    }

    /**
     * Gets the value of the inDepositMinCustMFPer property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositMinCustMFPer() {
        return inDepositMinCustMFPer;
    }

    /**
     * Sets the value of the inDepositMinCustMFPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositMinCustMFPer(BigDecimal value) {
        this.inDepositMinCustMFPer = value;
    }

    /**
     * Gets the value of the inDepositOverdraftLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositOverdraftLimit() {
        return inDepositOverdraftLimit;
    }

    /**
     * Sets the value of the inDepositOverdraftLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositOverdraftLimit(BigDecimal value) {
        this.inDepositOverdraftLimit = value;
    }

    /**
     * Gets the value of the inDepositOverdraftMaxsprd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositOverdraftMaxsprd() {
        return inDepositOverdraftMaxsprd;
    }

    /**
     * Sets the value of the inDepositOverdraftMaxsprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositOverdraftMaxsprd(BigDecimal value) {
        this.inDepositOverdraftMaxsprd = value;
    }

    /**
     * Gets the value of the inDepositPassbookFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositPassbookFlag() {
        return inDepositPassbookFlag;
    }

    /**
     * Sets the value of the inDepositPassbookFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositPassbookFlag(String value) {
        this.inDepositPassbookFlag = value;
    }

    /**
     * Gets the value of the inDepositTelebankingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositTelebankingFlag() {
        return inDepositTelebankingFlag;
    }

    /**
     * Sets the value of the inDepositTelebankingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositTelebankingFlag(String value) {
        this.inDepositTelebankingFlag = value;
    }

    /**
     * Gets the value of the inDepositAccountAccGroup property.
     * 
     */
    public int getInDepositAccountAccGroup() {
        return inDepositAccountAccGroup;
    }

    /**
     * Sets the value of the inDepositAccountAccGroup property.
     * 
     */
    public void setInDepositAccountAccGroup(int value) {
        this.inDepositAccountAccGroup = value;
    }

    /**
     * Gets the value of the inDepositAccountAccountLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountAccountLimit() {
        return inDepositAccountAccountLimit;
    }

    /**
     * Sets the value of the inDepositAccountAccountLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountAccountLimit(BigDecimal value) {
        this.inDepositAccountAccountLimit = value;
    }

    /**
     * Gets the value of the inDepositAccountAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountAccountType() {
        return inDepositAccountAccountType;
    }

    /**
     * Sets the value of the inDepositAccountAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountAccountType(String value) {
        this.inDepositAccountAccountType = value;
    }

    /**
     * Gets the value of the inDepositAccountAccrCrExpInt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountAccrCrExpInt() {
        return inDepositAccountAccrCrExpInt;
    }

    /**
     * Sets the value of the inDepositAccountAccrCrExpInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountAccrCrExpInt(BigDecimal value) {
        this.inDepositAccountAccrCrExpInt = value;
    }

    /**
     * Gets the value of the inDepositAccountAccrCrInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountAccrCrInterest() {
        return inDepositAccountAccrCrInterest;
    }

    /**
     * Sets the value of the inDepositAccountAccrCrInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountAccrCrInterest(BigDecimal value) {
        this.inDepositAccountAccrCrInterest = value;
    }

    /**
     * Gets the value of the inDepositAccountAccrDbInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountAccrDbInterest() {
        return inDepositAccountAccrDbInterest;
    }

    /**
     * Sets the value of the inDepositAccountAccrDbInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountAccrDbInterest(BigDecimal value) {
        this.inDepositAccountAccrDbInterest = value;
    }

    /**
     * Gets the value of the inDepositAccountAccrExcessInter property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountAccrExcessInter() {
        return inDepositAccountAccrExcessInter;
    }

    /**
     * Sets the value of the inDepositAccountAccrExcessInter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountAccrExcessInter(BigDecimal value) {
        this.inDepositAccountAccrExcessInter = value;
    }

    /**
     * Gets the value of the inDepositAccountAdditionalInfoFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountAdditionalInfoFlag() {
        return inDepositAccountAdditionalInfoFlag;
    }

    /**
     * Sets the value of the inDepositAccountAdditionalInfoFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountAdditionalInfoFlag(String value) {
        this.inDepositAccountAdditionalInfoFlag = value;
    }

    /**
     * Gets the value of the inDepositAccountAkflag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountAkflag() {
        return inDepositAccountAkflag;
    }

    /**
     * Sets the value of the inDepositAccountAkflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountAkflag(String value) {
        this.inDepositAccountAkflag = value;
    }

    /**
     * Gets the value of the inDepositAccountAnnounceTolDays property.
     * 
     */
    public short getInDepositAccountAnnounceTolDays() {
        return inDepositAccountAnnounceTolDays;
    }

    /**
     * Sets the value of the inDepositAccountAnnounceTolDays property.
     * 
     */
    public void setInDepositAccountAnnounceTolDays(short value) {
        this.inDepositAccountAnnounceTolDays = value;
    }

    /**
     * Gets the value of the inDepositAccountApprChqAdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountApprChqAdate() {
        return inDepositAccountApprChqAdate;
    }

    /**
     * Sets the value of the inDepositAccountApprChqAdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountApprChqAdate(XMLGregorianCalendar value) {
        this.inDepositAccountApprChqAdate = value;
    }

    /**
     * Gets the value of the inDepositAccountApprChqCnt property.
     * 
     */
    public int getInDepositAccountApprChqCnt() {
        return inDepositAccountApprChqCnt;
    }

    /**
     * Sets the value of the inDepositAccountApprChqCnt property.
     * 
     */
    public void setInDepositAccountApprChqCnt(int value) {
        this.inDepositAccountApprChqCnt = value;
    }

    /**
     * Gets the value of the inDepositAccountApprChqEdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountApprChqEdate() {
        return inDepositAccountApprChqEdate;
    }

    /**
     * Sets the value of the inDepositAccountApprChqEdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountApprChqEdate(XMLGregorianCalendar value) {
        this.inDepositAccountApprChqEdate = value;
    }

    /**
     * Gets the value of the inDepositAccountApprChqNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountApprChqNo() {
        return inDepositAccountApprChqNo;
    }

    /**
     * Sets the value of the inDepositAccountApprChqNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountApprChqNo(String value) {
        this.inDepositAccountApprChqNo = value;
    }

    /**
     * Gets the value of the inDepositAccountApprChqPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountApprChqPerc() {
        return inDepositAccountApprChqPerc;
    }

    /**
     * Sets the value of the inDepositAccountApprChqPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountApprChqPerc(BigDecimal value) {
        this.inDepositAccountApprChqPerc = value;
    }

    /**
     * Gets the value of the inDepositAccountAtmCardFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountAtmCardFlag() {
        return inDepositAccountAtmCardFlag;
    }

    /**
     * Sets the value of the inDepositAccountAtmCardFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountAtmCardFlag(String value) {
        this.inDepositAccountAtmCardFlag = value;
    }

    /**
     * Gets the value of the inDepositAccountAutomChequeOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountAutomChequeOrder() {
        return inDepositAccountAutomChequeOrder;
    }

    /**
     * Sets the value of the inDepositAccountAutomChequeOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountAutomChequeOrder(String value) {
        this.inDepositAccountAutomChequeOrder = value;
    }

    /**
     * Gets the value of the inDepositAccountAvailableBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountAvailableBalance() {
        return inDepositAccountAvailableBalance;
    }

    /**
     * Sets the value of the inDepositAccountAvailableBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountAvailableBalance(BigDecimal value) {
        this.inDepositAccountAvailableBalance = value;
    }

    /**
     * Gets the value of the inDepositAccountBackValeurDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountBackValeurDt() {
        return inDepositAccountBackValeurDt;
    }

    /**
     * Sets the value of the inDepositAccountBackValeurDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountBackValeurDt(XMLGregorianCalendar value) {
        this.inDepositAccountBackValeurDt = value;
    }

    /**
     * Gets the value of the inDepositAccountBalanceInterFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountBalanceInterFlag() {
        return inDepositAccountBalanceInterFlag;
    }

    /**
     * Sets the value of the inDepositAccountBalanceInterFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountBalanceInterFlag(String value) {
        this.inDepositAccountBalanceInterFlag = value;
    }

    /**
     * Gets the value of the inDepositAccountBenefAddressSn property.
     * 
     */
    public short getInDepositAccountBenefAddressSn() {
        return inDepositAccountBenefAddressSn;
    }

    /**
     * Sets the value of the inDepositAccountBenefAddressSn property.
     * 
     */
    public void setInDepositAccountBenefAddressSn(short value) {
        this.inDepositAccountBenefAddressSn = value;
    }

    /**
     * Gets the value of the inDepositAccountBlncBefOverdrn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountBlncBefOverdrn() {
        return inDepositAccountBlncBefOverdrn;
    }

    /**
     * Sets the value of the inDepositAccountBlncBefOverdrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountBlncBefOverdrn(BigDecimal value) {
        this.inDepositAccountBlncBefOverdrn = value;
    }

    /**
     * Gets the value of the inDepositAccountBlockedBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountBlockedBalance() {
        return inDepositAccountBlockedBalance;
    }

    /**
     * Sets the value of the inDepositAccountBlockedBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountBlockedBalance(BigDecimal value) {
        this.inDepositAccountBlockedBalance = value;
    }

    /**
     * Gets the value of the inDepositAccountBlockedStsExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountBlockedStsExpiry() {
        return inDepositAccountBlockedStsExpiry;
    }

    /**
     * Sets the value of the inDepositAccountBlockedStsExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountBlockedStsExpiry(XMLGregorianCalendar value) {
        this.inDepositAccountBlockedStsExpiry = value;
    }

    /**
     * Gets the value of the inDepositAccountBoePercentance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountBoePercentance() {
        return inDepositAccountBoePercentance;
    }

    /**
     * Sets the value of the inDepositAccountBoePercentance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountBoePercentance(BigDecimal value) {
        this.inDepositAccountBoePercentance = value;
    }

    /**
     * Gets the value of the inDepositAccountBoeSpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountBoeSpread() {
        return inDepositAccountBoeSpread;
    }

    /**
     * Sets the value of the inDepositAccountBoeSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountBoeSpread(BigDecimal value) {
        this.inDepositAccountBoeSpread = value;
    }

    /**
     * Gets the value of the inDepositAccountBondNumber property.
     * 
     */
    public double getInDepositAccountBondNumber() {
        return inDepositAccountBondNumber;
    }

    /**
     * Sets the value of the inDepositAccountBondNumber property.
     * 
     */
    public void setInDepositAccountBondNumber(double value) {
        this.inDepositAccountBondNumber = value;
    }

    /**
     * Gets the value of the inDepositAccountBookBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountBookBalance() {
        return inDepositAccountBookBalance;
    }

    /**
     * Sets the value of the inDepositAccountBookBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountBookBalance(BigDecimal value) {
        this.inDepositAccountBookBalance = value;
    }

    /**
     * Gets the value of the inDepositAccountBookNo property.
     * 
     */
    public int getInDepositAccountBookNo() {
        return inDepositAccountBookNo;
    }

    /**
     * Sets the value of the inDepositAccountBookNo property.
     * 
     */
    public void setInDepositAccountBookNo(int value) {
        this.inDepositAccountBookNo = value;
    }

    /**
     * Gets the value of the inDepositAccountProfitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountProfitsAccountNumber() {
        return inDepositAccountProfitsAccountNumber;
    }

    /**
     * Sets the value of the inDepositAccountProfitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountProfitsAccountNumber(String value) {
        this.inDepositAccountProfitsAccountNumber = value;
    }

    /**
     * Gets the value of the inDepositAccountProfitsAccountCd property.
     * 
     */
    public short getInDepositAccountProfitsAccountCd() {
        return inDepositAccountProfitsAccountCd;
    }

    /**
     * Sets the value of the inDepositAccountProfitsAccountCd property.
     * 
     */
    public void setInDepositAccountProfitsAccountCd(short value) {
        this.inDepositAccountProfitsAccountCd = value;
    }

    /**
     * Gets the value of the inDepositAccountCapIncreaseAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountCapIncreaseAmn() {
        return inDepositAccountCapIncreaseAmn;
    }

    /**
     * Sets the value of the inDepositAccountCapIncreaseAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountCapIncreaseAmn(BigDecimal value) {
        this.inDepositAccountCapIncreaseAmn = value;
    }

    /**
     * Gets the value of the inDepositAccountChequeBookFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountChequeBookFlag() {
        return inDepositAccountChequeBookFlag;
    }

    /**
     * Sets the value of the inDepositAccountChequeBookFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountChequeBookFlag(String value) {
        this.inDepositAccountChequeBookFlag = value;
    }

    /**
     * Gets the value of the inDepositAccountChequeBooksCount property.
     * 
     */
    public int getInDepositAccountChequeBooksCount() {
        return inDepositAccountChequeBooksCount;
    }

    /**
     * Sets the value of the inDepositAccountChequeBooksCount property.
     * 
     */
    public void setInDepositAccountChequeBooksCount(int value) {
        this.inDepositAccountChequeBooksCount = value;
    }

    /**
     * Gets the value of the inDepositAccountChequeOrderedCnt property.
     * 
     */
    public double getInDepositAccountChequeOrderedCnt() {
        return inDepositAccountChequeOrderedCnt;
    }

    /**
     * Sets the value of the inDepositAccountChequeOrderedCnt property.
     * 
     */
    public void setInDepositAccountChequeOrderedCnt(double value) {
        this.inDepositAccountChequeOrderedCnt = value;
    }

    /**
     * Gets the value of the inDepositAccountChequesBadCount property.
     * 
     */
    public int getInDepositAccountChequesBadCount() {
        return inDepositAccountChequesBadCount;
    }

    /**
     * Sets the value of the inDepositAccountChequesBadCount property.
     * 
     */
    public void setInDepositAccountChequesBadCount(int value) {
        this.inDepositAccountChequesBadCount = value;
    }

    /**
     * Gets the value of the inDepositAccountChequesBadTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountChequesBadTotal() {
        return inDepositAccountChequesBadTotal;
    }

    /**
     * Sets the value of the inDepositAccountChequesBadTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountChequesBadTotal(BigDecimal value) {
        this.inDepositAccountChequesBadTotal = value;
    }

    /**
     * Gets the value of the inDepositAccountChequesCancCount property.
     * 
     */
    public int getInDepositAccountChequesCancCount() {
        return inDepositAccountChequesCancCount;
    }

    /**
     * Sets the value of the inDepositAccountChequesCancCount property.
     * 
     */
    public void setInDepositAccountChequesCancCount(int value) {
        this.inDepositAccountChequesCancCount = value;
    }

    /**
     * Gets the value of the inDepositAccountChequesItemCount property.
     * 
     */
    public int getInDepositAccountChequesItemCount() {
        return inDepositAccountChequesItemCount;
    }

    /**
     * Sets the value of the inDepositAccountChequesItemCount property.
     * 
     */
    public void setInDepositAccountChequesItemCount(int value) {
        this.inDepositAccountChequesItemCount = value;
    }

    /**
     * Gets the value of the inDepositAccountChequesLostCount property.
     * 
     */
    public int getInDepositAccountChequesLostCount() {
        return inDepositAccountChequesLostCount;
    }

    /**
     * Sets the value of the inDepositAccountChequesLostCount property.
     * 
     */
    public void setInDepositAccountChequesLostCount(int value) {
        this.inDepositAccountChequesLostCount = value;
    }

    /**
     * Gets the value of the inDepositAccountChequesPaidCount property.
     * 
     */
    public int getInDepositAccountChequesPaidCount() {
        return inDepositAccountChequesPaidCount;
    }

    /**
     * Sets the value of the inDepositAccountChequesPaidCount property.
     * 
     */
    public void setInDepositAccountChequesPaidCount(int value) {
        this.inDepositAccountChequesPaidCount = value;
    }

    /**
     * Gets the value of the inDepositAccountChequesStampCoun property.
     * 
     */
    public int getInDepositAccountChequesStampCoun() {
        return inDepositAccountChequesStampCoun;
    }

    /**
     * Sets the value of the inDepositAccountChequesStampCoun property.
     * 
     */
    public void setInDepositAccountChequesStampCoun(int value) {
        this.inDepositAccountChequesStampCoun = value;
    }

    /**
     * Gets the value of the inDepositAccountChequesSteaCount property.
     * 
     */
    public int getInDepositAccountChequesSteaCount() {
        return inDepositAccountChequesSteaCount;
    }

    /**
     * Sets the value of the inDepositAccountChequesSteaCount property.
     * 
     */
    public void setInDepositAccountChequesSteaCount(int value) {
        this.inDepositAccountChequesSteaCount = value;
    }

    /**
     * Gets the value of the inDepositAccountChequesStopCount property.
     * 
     */
    public int getInDepositAccountChequesStopCount() {
        return inDepositAccountChequesStopCount;
    }

    /**
     * Sets the value of the inDepositAccountChequesStopCount property.
     * 
     */
    public void setInDepositAccountChequesStopCount(int value) {
        this.inDepositAccountChequesStopCount = value;
    }

    /**
     * Gets the value of the inDepositAccountChequesUsedCount property.
     * 
     */
    public int getInDepositAccountChequesUsedCount() {
        return inDepositAccountChequesUsedCount;
    }

    /**
     * Sets the value of the inDepositAccountChequesUsedCount property.
     * 
     */
    public void setInDepositAccountChequesUsedCount(int value) {
        this.inDepositAccountChequesUsedCount = value;
    }

    /**
     * Gets the value of the inDepositAccountClosingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountClosingDate() {
        return inDepositAccountClosingDate;
    }

    /**
     * Sets the value of the inDepositAccountClosingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountClosingDate(XMLGregorianCalendar value) {
        this.inDepositAccountClosingDate = value;
    }

    /**
     * Gets the value of the inDepositAccountClosingTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountClosingTotal() {
        return inDepositAccountClosingTotal;
    }

    /**
     * Sets the value of the inDepositAccountClosingTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountClosingTotal(BigDecimal value) {
        this.inDepositAccountClosingTotal = value;
    }

    /**
     * Gets the value of the inDepositAccountCobenefCount property.
     * 
     */
    public short getInDepositAccountCobenefCount() {
        return inDepositAccountCobenefCount;
    }

    /**
     * Sets the value of the inDepositAccountCobenefCount property.
     * 
     */
    public void setInDepositAccountCobenefCount(short value) {
        this.inDepositAccountCobenefCount = value;
    }

    /**
     * Gets the value of the inDepositAccountCobenefCountIns property.
     * 
     */
    public short getInDepositAccountCobenefCountIns() {
        return inDepositAccountCobenefCountIns;
    }

    /**
     * Sets the value of the inDepositAccountCobenefCountIns property.
     * 
     */
    public void setInDepositAccountCobenefCountIns(short value) {
        this.inDepositAccountCobenefCountIns = value;
    }

    /**
     * Gets the value of the inDepositAccountCobenefSnMail property.
     * 
     */
    public short getInDepositAccountCobenefSnMail() {
        return inDepositAccountCobenefSnMail;
    }

    /**
     * Sets the value of the inDepositAccountCobenefSnMail property.
     * 
     */
    public void setInDepositAccountCobenefSnMail(short value) {
        this.inDepositAccountCobenefSnMail = value;
    }

    /**
     * Gets the value of the inDepositAccountColInsertionDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountColInsertionDt() {
        return inDepositAccountColInsertionDt;
    }

    /**
     * Sets the value of the inDepositAccountColInsertionDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountColInsertionDt(XMLGregorianCalendar value) {
        this.inDepositAccountColInsertionDt = value;
    }

    /**
     * Gets the value of the inDepositAccountCollateralFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountCollateralFlg() {
        return inDepositAccountCollateralFlg;
    }

    /**
     * Sets the value of the inDepositAccountCollateralFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountCollateralFlg(String value) {
        this.inDepositAccountCollateralFlg = value;
    }

    /**
     * Gets the value of the inDepositAccountCorrChqDetail1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountCorrChqDetail1() {
        return inDepositAccountCorrChqDetail1;
    }

    /**
     * Sets the value of the inDepositAccountCorrChqDetail1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountCorrChqDetail1(String value) {
        this.inDepositAccountCorrChqDetail1 = value;
    }

    /**
     * Gets the value of the inDepositAccountCorrChqDetail2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountCorrChqDetail2() {
        return inDepositAccountCorrChqDetail2;
    }

    /**
     * Sets the value of the inDepositAccountCorrChqDetail2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountCorrChqDetail2(String value) {
        this.inDepositAccountCorrChqDetail2 = value;
    }

    /**
     * Gets the value of the inDepositAccountCorrespAccInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountCorrespAccInd() {
        return inDepositAccountCorrespAccInd;
    }

    /**
     * Sets the value of the inDepositAccountCorrespAccInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountCorrespAccInd(String value) {
        this.inDepositAccountCorrespAccInd = value;
    }

    /**
     * Gets the value of the inDepositAccountCrIntRtSprdInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountCrIntRtSprdInd() {
        return inDepositAccountCrIntRtSprdInd;
    }

    /**
     * Sets the value of the inDepositAccountCrIntRtSprdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountCrIntRtSprdInd(String value) {
        this.inDepositAccountCrIntRtSprdInd = value;
    }

    /**
     * Gets the value of the inDepositAccountCrInterRateSpr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountCrInterRateSpr() {
        return inDepositAccountCrInterRateSpr;
    }

    /**
     * Sets the value of the inDepositAccountCrInterRateSpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountCrInterRateSpr(BigDecimal value) {
        this.inDepositAccountCrInterRateSpr = value;
    }

    /**
     * Gets the value of the inDepositAccountCustPerMFAllow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountCustPerMFAllow() {
        return inDepositAccountCustPerMFAllow;
    }

    /**
     * Sets the value of the inDepositAccountCustPerMFAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountCustPerMFAllow(String value) {
        this.inDepositAccountCustPerMFAllow = value;
    }

    /**
     * Gets the value of the inDepositAccountDateSinceOverdrn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountDateSinceOverdrn() {
        return inDepositAccountDateSinceOverdrn;
    }

    /**
     * Sets the value of the inDepositAccountDateSinceOverdrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountDateSinceOverdrn(XMLGregorianCalendar value) {
        this.inDepositAccountDateSinceOverdrn = value;
    }

    /**
     * Gets the value of the inDepositAccountDbIntRtSprdInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountDbIntRtSprdInd() {
        return inDepositAccountDbIntRtSprdInd;
    }

    /**
     * Sets the value of the inDepositAccountDbIntRtSprdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountDbIntRtSprdInd(String value) {
        this.inDepositAccountDbIntRtSprdInd = value;
    }

    /**
     * Gets the value of the inDepositAccountDbInterAccNext property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountDbInterAccNext() {
        return inDepositAccountDbInterAccNext;
    }

    /**
     * Sets the value of the inDepositAccountDbInterAccNext property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountDbInterAccNext(XMLGregorianCalendar value) {
        this.inDepositAccountDbInterAccNext = value;
    }

    /**
     * Gets the value of the inDepositAccountDbInterRateSpr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountDbInterRateSpr() {
        return inDepositAccountDbInterRateSpr;
    }

    /**
     * Sets the value of the inDepositAccountDbInterRateSpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountDbInterRateSpr(BigDecimal value) {
        this.inDepositAccountDbInterRateSpr = value;
    }

    /**
     * Gets the value of the inDepositAccountDbProgressInter property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountDbProgressInter() {
        return inDepositAccountDbProgressInter;
    }

    /**
     * Sets the value of the inDepositAccountDbProgressInter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountDbProgressInter(BigDecimal value) {
        this.inDepositAccountDbProgressInter = value;
    }

    /**
     * Gets the value of the inDepositAccountDbTransitIntTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountDbTransitIntTax() {
        return inDepositAccountDbTransitIntTax;
    }

    /**
     * Sets the value of the inDepositAccountDbTransitIntTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountDbTransitIntTax(BigDecimal value) {
        this.inDepositAccountDbTransitIntTax = value;
    }

    /**
     * Gets the value of the inDepositAccountDbTransitionInte property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountDbTransitionInte() {
        return inDepositAccountDbTransitionInte;
    }

    /**
     * Sets the value of the inDepositAccountDbTransitionInte property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountDbTransitionInte(BigDecimal value) {
        this.inDepositAccountDbTransitionInte = value;
    }

    /**
     * Gets the value of the inDepositAccountDefiniteDelay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountDefiniteDelay() {
        return inDepositAccountDefiniteDelay;
    }

    /**
     * Sets the value of the inDepositAccountDefiniteDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountDefiniteDelay(String value) {
        this.inDepositAccountDefiniteDelay = value;
    }

    /**
     * Gets the value of the inDepositAccountDepositType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountDepositType() {
        return inDepositAccountDepositType;
    }

    /**
     * Sets the value of the inDepositAccountDepositType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountDepositType(String value) {
        this.inDepositAccountDepositType = value;
    }

    /**
     * Gets the value of the inDepositAccountDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountDesignation() {
        return inDepositAccountDesignation;
    }

    /**
     * Sets the value of the inDepositAccountDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountDesignation(String value) {
        this.inDepositAccountDesignation = value;
    }

    /**
     * Gets the value of the inDepositAccountDrawDownWxpDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountDrawDownWxpDate() {
        return inDepositAccountDrawDownWxpDate;
    }

    /**
     * Sets the value of the inDepositAccountDrawDownWxpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountDrawDownWxpDate(XMLGregorianCalendar value) {
        this.inDepositAccountDrawDownWxpDate = value;
    }

    /**
     * Gets the value of the inDepositAccountDurationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountDurationUnit() {
        return inDepositAccountDurationUnit;
    }

    /**
     * Sets the value of the inDepositAccountDurationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountDurationUnit(String value) {
        this.inDepositAccountDurationUnit = value;
    }

    /**
     * Gets the value of the inDepositAccountDurationValue property.
     * 
     */
    public short getInDepositAccountDurationValue() {
        return inDepositAccountDurationValue;
    }

    /**
     * Sets the value of the inDepositAccountDurationValue property.
     * 
     */
    public void setInDepositAccountDurationValue(short value) {
        this.inDepositAccountDurationValue = value;
    }

    /**
     * Gets the value of the inDepositAccountEncroachTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountEncroachTolerance() {
        return inDepositAccountEncroachTolerance;
    }

    /**
     * Sets the value of the inDepositAccountEncroachTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountEncroachTolerance(BigDecimal value) {
        this.inDepositAccountEncroachTolerance = value;
    }

    /**
     * Gets the value of the inDepositAccountEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountEntryStatus() {
        return inDepositAccountEntryStatus;
    }

    /**
     * Sets the value of the inDepositAccountEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountEntryStatus(String value) {
        this.inDepositAccountEntryStatus = value;
    }

    /**
     * Gets the value of the inDepositAccountExpCrIntSprd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountExpCrIntSprd() {
        return inDepositAccountExpCrIntSprd;
    }

    /**
     * Sets the value of the inDepositAccountExpCrIntSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountExpCrIntSprd(XMLGregorianCalendar value) {
        this.inDepositAccountExpCrIntSprd = value;
    }

    /**
     * Gets the value of the inDepositAccountExpDbIntSprd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountExpDbIntSprd() {
        return inDepositAccountExpDbIntSprd;
    }

    /**
     * Sets the value of the inDepositAccountExpDbIntSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountExpDbIntSprd(XMLGregorianCalendar value) {
        this.inDepositAccountExpDbIntSprd = value;
    }

    /**
     * Gets the value of the inDepositAccountExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountExpiryDate() {
        return inDepositAccountExpiryDate;
    }

    /**
     * Sets the value of the inDepositAccountExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountExpiryDate(XMLGregorianCalendar value) {
        this.inDepositAccountExpiryDate = value;
    }

    /**
     * Gets the value of the inDepositAccountExpiryDateTd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountExpiryDateTd() {
        return inDepositAccountExpiryDateTd;
    }

    /**
     * Sets the value of the inDepositAccountExpiryDateTd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountExpiryDateTd(XMLGregorianCalendar value) {
        this.inDepositAccountExpiryDateTd = value;
    }

    /**
     * Gets the value of the inDepositAccountExternalAccFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountExternalAccFlag() {
        return inDepositAccountExternalAccFlag;
    }

    /**
     * Sets the value of the inDepositAccountExternalAccFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountExternalAccFlag(String value) {
        this.inDepositAccountExternalAccFlag = value;
    }

    /**
     * Gets the value of the inDepositAccountExtraitPrintDay property.
     * 
     */
    public short getInDepositAccountExtraitPrintDay() {
        return inDepositAccountExtraitPrintDay;
    }

    /**
     * Sets the value of the inDepositAccountExtraitPrintDay property.
     * 
     */
    public void setInDepositAccountExtraitPrintDay(short value) {
        this.inDepositAccountExtraitPrintDay = value;
    }

    /**
     * Gets the value of the inDepositAccountExtraitTrxCount property.
     * 
     */
    public int getInDepositAccountExtraitTrxCount() {
        return inDepositAccountExtraitTrxCount;
    }

    /**
     * Sets the value of the inDepositAccountExtraitTrxCount property.
     * 
     */
    public void setInDepositAccountExtraitTrxCount(int value) {
        this.inDepositAccountExtraitTrxCount = value;
    }

    /**
     * Gets the value of the inDepositAccountFcInterLcPrim property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountFcInterLcPrim() {
        return inDepositAccountFcInterLcPrim;
    }

    /**
     * Sets the value of the inDepositAccountFcInterLcPrim property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountFcInterLcPrim(BigDecimal value) {
        this.inDepositAccountFcInterLcPrim = value;
    }

    /**
     * Gets the value of the inDepositAccountFcInterestLcFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountFcInterestLcFlg() {
        return inDepositAccountFcInterestLcFlg;
    }

    /**
     * Sets the value of the inDepositAccountFcInterestLcFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountFcInterestLcFlg(String value) {
        this.inDepositAccountFcInterestLcFlg = value;
    }

    /**
     * Gets the value of the inDepositAccountFcInterestLcNet property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountFcInterestLcNet() {
        return inDepositAccountFcInterestLcNet;
    }

    /**
     * Sets the value of the inDepositAccountFcInterestLcNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountFcInterestLcNet(BigDecimal value) {
        this.inDepositAccountFcInterestLcNet = value;
    }

    /**
     * Gets the value of the inDepositAccountFinalWhldTaxFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountFinalWhldTaxFlg() {
        return inDepositAccountFinalWhldTaxFlg;
    }

    /**
     * Sets the value of the inDepositAccountFinalWhldTaxFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountFinalWhldTaxFlg(String value) {
        this.inDepositAccountFinalWhldTaxFlg = value;
    }

    /**
     * Gets the value of the inDepositAccountFixedInterFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountFixedInterFlag() {
        return inDepositAccountFixedInterFlag;
    }

    /**
     * Sets the value of the inDepositAccountFixedInterFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountFixedInterFlag(String value) {
        this.inDepositAccountFixedInterFlag = value;
    }

    /**
     * Gets the value of the inDepositAccountFixedInterRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountFixedInterRate() {
        return inDepositAccountFixedInterRate;
    }

    /**
     * Sets the value of the inDepositAccountFixedInterRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountFixedInterRate(BigDecimal value) {
        this.inDepositAccountFixedInterRate = value;
    }

    /**
     * Gets the value of the inDepositAccountForecastBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountForecastBalance() {
        return inDepositAccountForecastBalance;
    }

    /**
     * Sets the value of the inDepositAccountForecastBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountForecastBalance(BigDecimal value) {
        this.inDepositAccountForecastBalance = value;
    }

    /**
     * Gets the value of the inDepositAccountGlAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountGlAccount() {
        return inDepositAccountGlAccount;
    }

    /**
     * Sets the value of the inDepositAccountGlAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountGlAccount(String value) {
        this.inDepositAccountGlAccount = value;
    }

    /**
     * Gets the value of the inDepositAccountGlAccountLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountGlAccountLevel() {
        return inDepositAccountGlAccountLevel;
    }

    /**
     * Sets the value of the inDepositAccountGlAccountLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountGlAccountLevel(String value) {
        this.inDepositAccountGlAccountLevel = value;
    }

    /**
     * Gets the value of the inDepositAccountHomeBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountHomeBranch() {
        return inDepositAccountHomeBranch;
    }

    /**
     * Sets the value of the inDepositAccountHomeBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountHomeBranch(String value) {
        this.inDepositAccountHomeBranch = value;
    }

    /**
     * Gets the value of the inDepositAccountIncomeAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountIncomeAmnt() {
        return inDepositAccountIncomeAmnt;
    }

    /**
     * Sets the value of the inDepositAccountIncomeAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountIncomeAmnt(BigDecimal value) {
        this.inDepositAccountIncomeAmnt = value;
    }

    /**
     * Gets the value of the inDepositAccountIncomeFrequency property.
     * 
     */
    public int getInDepositAccountIncomeFrequency() {
        return inDepositAccountIncomeFrequency;
    }

    /**
     * Sets the value of the inDepositAccountIncomeFrequency property.
     * 
     */
    public void setInDepositAccountIncomeFrequency(int value) {
        this.inDepositAccountIncomeFrequency = value;
    }

    /**
     * Gets the value of the inDepositAccountInitCrBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountInitCrBalance() {
        return inDepositAccountInitCrBalance;
    }

    /**
     * Sets the value of the inDepositAccountInitCrBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountInitCrBalance(BigDecimal value) {
        this.inDepositAccountInitCrBalance = value;
    }

    /**
     * Gets the value of the inDepositAccountInitDbBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountInitDbBalance() {
        return inDepositAccountInitDbBalance;
    }

    /**
     * Sets the value of the inDepositAccountInitDbBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountInitDbBalance(BigDecimal value) {
        this.inDepositAccountInitDbBalance = value;
    }

    /**
     * Gets the value of the inDepositAccountInitValueBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountInitValueBalance() {
        return inDepositAccountInitValueBalance;
    }

    /**
     * Sets the value of the inDepositAccountInitValueBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountInitValueBalance(BigDecimal value) {
        this.inDepositAccountInitValueBalance = value;
    }

    /**
     * Gets the value of the inDepositAccountInspectionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountInspectionDate() {
        return inDepositAccountInspectionDate;
    }

    /**
     * Sets the value of the inDepositAccountInspectionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountInspectionDate(XMLGregorianCalendar value) {
        this.inDepositAccountInspectionDate = value;
    }

    /**
     * Gets the value of the inDepositAccountInterPayOptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountInterPayOptions() {
        return inDepositAccountInterPayOptions;
    }

    /**
     * Sets the value of the inDepositAccountInterPayOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountInterPayOptions(String value) {
        this.inDepositAccountInterPayOptions = value;
    }

    /**
     * Gets the value of the inDepositAccountInterestPayInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountInterestPayInd() {
        return inDepositAccountInterestPayInd;
    }

    /**
     * Sets the value of the inDepositAccountInterestPayInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountInterestPayInd(String value) {
        this.inDepositAccountInterestPayInd = value;
    }

    /**
     * Gets the value of the inDepositAccountInterestToWithdr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountInterestToWithdr() {
        return inDepositAccountInterestToWithdr;
    }

    /**
     * Sets the value of the inDepositAccountInterestToWithdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountInterestToWithdr(BigDecimal value) {
        this.inDepositAccountInterestToWithdr = value;
    }

    /**
     * Gets the value of the inDepositAccountInvestFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountInvestFlag() {
        return inDepositAccountInvestFlag;
    }

    /**
     * Sets the value of the inDepositAccountInvestFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountInvestFlag(String value) {
        this.inDepositAccountInvestFlag = value;
    }

    /**
     * Gets the value of the inDepositAccountIssueOffice property.
     * 
     */
    public int getInDepositAccountIssueOffice() {
        return inDepositAccountIssueOffice;
    }

    /**
     * Sets the value of the inDepositAccountIssueOffice property.
     * 
     */
    public void setInDepositAccountIssueOffice(int value) {
        this.inDepositAccountIssueOffice = value;
    }

    /**
     * Gets the value of the inDepositAccountKadFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountKadFlg() {
        return inDepositAccountKadFlg;
    }

    /**
     * Sets the value of the inDepositAccountKadFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountKadFlg(String value) {
        this.inDepositAccountKadFlg = value;
    }

    /**
     * Gets the value of the inDepositAccountLastBadCheqDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountLastBadCheqDate() {
        return inDepositAccountLastBadCheqDate;
    }

    /**
     * Sets the value of the inDepositAccountLastBadCheqDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountLastBadCheqDate(XMLGregorianCalendar value) {
        this.inDepositAccountLastBadCheqDate = value;
    }

    /**
     * Gets the value of the inDepositAccountLastBatchDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountLastBatchDate() {
        return inDepositAccountLastBatchDate;
    }

    /**
     * Sets the value of the inDepositAccountLastBatchDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountLastBatchDate(XMLGregorianCalendar value) {
        this.inDepositAccountLastBatchDate = value;
    }

    /**
     * Gets the value of the inDepositAccountLastInactiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountLastInactiveDate() {
        return inDepositAccountLastInactiveDate;
    }

    /**
     * Sets the value of the inDepositAccountLastInactiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountLastInactiveDate(XMLGregorianCalendar value) {
        this.inDepositAccountLastInactiveDate = value;
    }

    /**
     * Gets the value of the inDepositAccountLastIntAvgBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountLastIntAvgBalance() {
        return inDepositAccountLastIntAvgBalance;
    }

    /**
     * Sets the value of the inDepositAccountLastIntAvgBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountLastIntAvgBalance(BigDecimal value) {
        this.inDepositAccountLastIntAvgBalance = value;
    }

    /**
     * Gets the value of the inDepositAccountLastIntAvgCr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountLastIntAvgCr() {
        return inDepositAccountLastIntAvgCr;
    }

    /**
     * Sets the value of the inDepositAccountLastIntAvgCr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountLastIntAvgCr(BigDecimal value) {
        this.inDepositAccountLastIntAvgCr = value;
    }

    /**
     * Gets the value of the inDepositAccountLastIntAvgDb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountLastIntAvgDb() {
        return inDepositAccountLastIntAvgDb;
    }

    /**
     * Sets the value of the inDepositAccountLastIntAvgDb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountLastIntAvgDb(BigDecimal value) {
        this.inDepositAccountLastIntAvgDb = value;
    }

    /**
     * Gets the value of the inDepositAccountLastIntChangDat property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountLastIntChangDat() {
        return inDepositAccountLastIntChangDat;
    }

    /**
     * Sets the value of the inDepositAccountLastIntChangDat property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountLastIntChangDat(XMLGregorianCalendar value) {
        this.inDepositAccountLastIntChangDat = value;
    }

    /**
     * Gets the value of the inDepositAccountLastMaxUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountLastMaxUpdateDate() {
        return inDepositAccountLastMaxUpdateDate;
    }

    /**
     * Sets the value of the inDepositAccountLastMaxUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountLastMaxUpdateDate(XMLGregorianCalendar value) {
        this.inDepositAccountLastMaxUpdateDate = value;
    }

    /**
     * Gets the value of the inDepositAccountLastModifyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountLastModifyDate() {
        return inDepositAccountLastModifyDate;
    }

    /**
     * Sets the value of the inDepositAccountLastModifyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountLastModifyDate(XMLGregorianCalendar value) {
        this.inDepositAccountLastModifyDate = value;
    }

    /**
     * Gets the value of the inDepositAccountLastPsbPrint property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountLastPsbPrint() {
        return inDepositAccountLastPsbPrint;
    }

    /**
     * Sets the value of the inDepositAccountLastPsbPrint property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountLastPsbPrint(XMLGregorianCalendar value) {
        this.inDepositAccountLastPsbPrint = value;
    }

    /**
     * Gets the value of the inDepositAccountLastTdTrxId property.
     * 
     */
    public int getInDepositAccountLastTdTrxId() {
        return inDepositAccountLastTdTrxId;
    }

    /**
     * Sets the value of the inDepositAccountLastTdTrxId property.
     * 
     */
    public void setInDepositAccountLastTdTrxId(int value) {
        this.inDepositAccountLastTdTrxId = value;
    }

    /**
     * Gets the value of the inDepositAccountLastTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountLastTrxDate() {
        return inDepositAccountLastTrxDate;
    }

    /**
     * Sets the value of the inDepositAccountLastTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountLastTrxDate(XMLGregorianCalendar value) {
        this.inDepositAccountLastTrxDate = value;
    }

    /**
     * Gets the value of the inDepositAccountLastTrxId property.
     * 
     */
    public int getInDepositAccountLastTrxId() {
        return inDepositAccountLastTrxId;
    }

    /**
     * Sets the value of the inDepositAccountLastTrxId property.
     * 
     */
    public void setInDepositAccountLastTrxId(int value) {
        this.inDepositAccountLastTrxId = value;
    }

    /**
     * Gets the value of the inDepositAccountLstStatementNum property.
     * 
     */
    public int getInDepositAccountLstStatementNum() {
        return inDepositAccountLstStatementNum;
    }

    /**
     * Sets the value of the inDepositAccountLstStatementNum property.
     * 
     */
    public void setInDepositAccountLstStatementNum(int value) {
        this.inDepositAccountLstStatementNum = value;
    }

    /**
     * Gets the value of the inDepositAccountManualMigrateFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountManualMigrateFlg() {
        return inDepositAccountManualMigrateFlg;
    }

    /**
     * Sets the value of the inDepositAccountManualMigrateFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountManualMigrateFlg(String value) {
        this.inDepositAccountManualMigrateFlg = value;
    }

    /**
     * Gets the value of the inDepositAccountMaxLastDpPer property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountMaxLastDpPer() {
        return inDepositAccountMaxLastDpPer;
    }

    /**
     * Sets the value of the inDepositAccountMaxLastDpPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountMaxLastDpPer(BigDecimal value) {
        this.inDepositAccountMaxLastDpPer = value;
    }

    /**
     * Gets the value of the inDepositAccountMaxLastUpdate property.
     * 
     */
    public short getInDepositAccountMaxLastUpdate() {
        return inDepositAccountMaxLastUpdate;
    }

    /**
     * Sets the value of the inDepositAccountMaxLastUpdate property.
     * 
     */
    public void setInDepositAccountMaxLastUpdate(short value) {
        this.inDepositAccountMaxLastUpdate = value;
    }

    /**
     * Gets the value of the inDepositAccountMinLastMFPer property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountMinLastMFPer() {
        return inDepositAccountMinLastMFPer;
    }

    /**
     * Sets the value of the inDepositAccountMinLastMFPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountMinLastMFPer(BigDecimal value) {
        this.inDepositAccountMinLastMFPer = value;
    }

    /**
     * Gets the value of the inDepositAccountMultiSalaryAmnt property.
     * 
     */
    public short getInDepositAccountMultiSalaryAmnt() {
        return inDepositAccountMultiSalaryAmnt;
    }

    /**
     * Sets the value of the inDepositAccountMultiSalaryAmnt property.
     * 
     */
    public void setInDepositAccountMultiSalaryAmnt(short value) {
        this.inDepositAccountMultiSalaryAmnt = value;
    }

    /**
     * Gets the value of the inDepositAccountNostroAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountNostroAccount() {
        return inDepositAccountNostroAccount;
    }

    /**
     * Sets the value of the inDepositAccountNostroAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountNostroAccount(String value) {
        this.inDepositAccountNostroAccount = value;
    }

    /**
     * Gets the value of the inDepositAccountNotExpensesFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountNotExpensesFlg() {
        return inDepositAccountNotExpensesFlg;
    }

    /**
     * Sets the value of the inDepositAccountNotExpensesFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountNotExpensesFlg(String value) {
        this.inDepositAccountNotExpensesFlg = value;
    }

    /**
     * Gets the value of the inDepositAccountNotifSpreadDayB property.
     * 
     */
    public short getInDepositAccountNotifSpreadDayB() {
        return inDepositAccountNotifSpreadDayB;
    }

    /**
     * Sets the value of the inDepositAccountNotifSpreadDayB property.
     * 
     */
    public void setInDepositAccountNotifSpreadDayB(short value) {
        this.inDepositAccountNotifSpreadDayB = value;
    }

    /**
     * Gets the value of the inDepositAccountNotifSpreadDays property.
     * 
     */
    public short getInDepositAccountNotifSpreadDays() {
        return inDepositAccountNotifSpreadDays;
    }

    /**
     * Sets the value of the inDepositAccountNotifSpreadDays property.
     * 
     */
    public void setInDepositAccountNotifSpreadDays(short value) {
        this.inDepositAccountNotifSpreadDays = value;
    }

    /**
     * Gets the value of the inDepositAccountOfficeAccFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountOfficeAccFlag() {
        return inDepositAccountOfficeAccFlag;
    }

    /**
     * Sets the value of the inDepositAccountOfficeAccFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountOfficeAccFlag(String value) {
        this.inDepositAccountOfficeAccFlag = value;
    }

    /**
     * Gets the value of the inDepositAccountOldAccNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountOldAccNumber() {
        return inDepositAccountOldAccNumber;
    }

    /**
     * Sets the value of the inDepositAccountOldAccNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountOldAccNumber(String value) {
        this.inDepositAccountOldAccNumber = value;
    }

    /**
     * Gets the value of the inDepositAccountOpeningBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountOpeningBalance() {
        return inDepositAccountOpeningBalance;
    }

    /**
     * Sets the value of the inDepositAccountOpeningBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountOpeningBalance(BigDecimal value) {
        this.inDepositAccountOpeningBalance = value;
    }

    /**
     * Gets the value of the inDepositAccountOpeningDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountOpeningDate() {
        return inDepositAccountOpeningDate;
    }

    /**
     * Sets the value of the inDepositAccountOpeningDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountOpeningDate(XMLGregorianCalendar value) {
        this.inDepositAccountOpeningDate = value;
    }

    /**
     * Gets the value of the inDepositAccountOverdraftComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountOverdraftComment() {
        return inDepositAccountOverdraftComment;
    }

    /**
     * Sets the value of the inDepositAccountOverdraftComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountOverdraftComment(String value) {
        this.inDepositAccountOverdraftComment = value;
    }

    /**
     * Gets the value of the inDepositAccountOverdraftRenewalFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountOverdraftRenewalFlg() {
        return inDepositAccountOverdraftRenewalFlg;
    }

    /**
     * Sets the value of the inDepositAccountOverdraftRenewalFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountOverdraftRenewalFlg(String value) {
        this.inDepositAccountOverdraftRenewalFlg = value;
    }

    /**
     * Gets the value of the inDepositAccountOverdraftSpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountOverdraftSpread() {
        return inDepositAccountOverdraftSpread;
    }

    /**
     * Sets the value of the inDepositAccountOverdraftSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountOverdraftSpread(BigDecimal value) {
        this.inDepositAccountOverdraftSpread = value;
    }

    /**
     * Gets the value of the inDepositAccountPassbookFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountPassbookFlag() {
        return inDepositAccountPassbookFlag;
    }

    /**
     * Sets the value of the inDepositAccountPassbookFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountPassbookFlag(String value) {
        this.inDepositAccountPassbookFlag = value;
    }

    /**
     * Gets the value of the inDepositAccountPendingExtrLines property.
     * 
     */
    public double getInDepositAccountPendingExtrLines() {
        return inDepositAccountPendingExtrLines;
    }

    /**
     * Sets the value of the inDepositAccountPendingExtrLines property.
     * 
     */
    public void setInDepositAccountPendingExtrLines(double value) {
        this.inDepositAccountPendingExtrLines = value;
    }

    /**
     * Gets the value of the inDepositAccountPrevAccountLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountPrevAccountLimit() {
        return inDepositAccountPrevAccountLimit;
    }

    /**
     * Sets the value of the inDepositAccountPrevAccountLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountPrevAccountLimit(BigDecimal value) {
        this.inDepositAccountPrevAccountLimit = value;
    }

    /**
     * Gets the value of the inDepositAccountPrevAvailableBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountPrevAvailableBal() {
        return inDepositAccountPrevAvailableBal;
    }

    /**
     * Sets the value of the inDepositAccountPrevAvailableBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountPrevAvailableBal(BigDecimal value) {
        this.inDepositAccountPrevAvailableBal = value;
    }

    /**
     * Gets the value of the inDepositAccountPrevBlockedBalan property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountPrevBlockedBalan() {
        return inDepositAccountPrevBlockedBalan;
    }

    /**
     * Sets the value of the inDepositAccountPrevBlockedBalan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountPrevBlockedBalan(BigDecimal value) {
        this.inDepositAccountPrevBlockedBalan = value;
    }

    /**
     * Gets the value of the inDepositAccountPrevBookBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountPrevBookBalance() {
        return inDepositAccountPrevBookBalance;
    }

    /**
     * Sets the value of the inDepositAccountPrevBookBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountPrevBookBalance(BigDecimal value) {
        this.inDepositAccountPrevBookBalance = value;
    }

    /**
     * Gets the value of the inDepositAccountPrevDateSinceOv property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountPrevDateSinceOv() {
        return inDepositAccountPrevDateSinceOv;
    }

    /**
     * Sets the value of the inDepositAccountPrevDateSinceOv property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountPrevDateSinceOv(XMLGregorianCalendar value) {
        this.inDepositAccountPrevDateSinceOv = value;
    }

    /**
     * Gets the value of the inDepositAccountPrevForecastBala property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountPrevForecastBala() {
        return inDepositAccountPrevForecastBala;
    }

    /**
     * Sets the value of the inDepositAccountPrevForecastBala property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountPrevForecastBala(BigDecimal value) {
        this.inDepositAccountPrevForecastBala = value;
    }

    /**
     * Gets the value of the inDepositAccountPrevLastTrxId property.
     * 
     */
    public int getInDepositAccountPrevLastTrxId() {
        return inDepositAccountPrevLastTrxId;
    }

    /**
     * Sets the value of the inDepositAccountPrevLastTrxId property.
     * 
     */
    public void setInDepositAccountPrevLastTrxId(int value) {
        this.inDepositAccountPrevLastTrxId = value;
    }

    /**
     * Gets the value of the inDepositAccountPrevLstStatement property.
     * 
     */
    public int getInDepositAccountPrevLstStatement() {
        return inDepositAccountPrevLstStatement;
    }

    /**
     * Sets the value of the inDepositAccountPrevLstStatement property.
     * 
     */
    public void setInDepositAccountPrevLstStatement(int value) {
        this.inDepositAccountPrevLstStatement = value;
    }

    /**
     * Gets the value of the inDepositAccountPrevPsbLineSn property.
     * 
     */
    public int getInDepositAccountPrevPsbLineSn() {
        return inDepositAccountPrevPsbLineSn;
    }

    /**
     * Sets the value of the inDepositAccountPrevPsbLineSn property.
     * 
     */
    public void setInDepositAccountPrevPsbLineSn(int value) {
        this.inDepositAccountPrevPsbLineSn = value;
    }

    /**
     * Gets the value of the inDepositAccountPrevTempExcEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountPrevTempExcEnd() {
        return inDepositAccountPrevTempExcEnd;
    }

    /**
     * Sets the value of the inDepositAccountPrevTempExcEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountPrevTempExcEnd(XMLGregorianCalendar value) {
        this.inDepositAccountPrevTempExcEnd = value;
    }

    /**
     * Gets the value of the inDepositAccountPrevTempExcStar property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountPrevTempExcStar() {
        return inDepositAccountPrevTempExcStar;
    }

    /**
     * Sets the value of the inDepositAccountPrevTempExcStar property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountPrevTempExcStar(XMLGregorianCalendar value) {
        this.inDepositAccountPrevTempExcStar = value;
    }

    /**
     * Gets the value of the inDepositAccountPrevTemporaryExc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountPrevTemporaryExc() {
        return inDepositAccountPrevTemporaryExc;
    }

    /**
     * Sets the value of the inDepositAccountPrevTemporaryExc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountPrevTemporaryExc(BigDecimal value) {
        this.inDepositAccountPrevTemporaryExc = value;
    }

    /**
     * Gets the value of the inDepositAccountPrevUnclearBala property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountPrevUnclearBala() {
        return inDepositAccountPrevUnclearBala;
    }

    /**
     * Sets the value of the inDepositAccountPrevUnclearBala property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountPrevUnclearBala(BigDecimal value) {
        this.inDepositAccountPrevUnclearBala = value;
    }

    /**
     * Gets the value of the inDepositAccountPsbLastBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountPsbLastBalance() {
        return inDepositAccountPsbLastBalance;
    }

    /**
     * Sets the value of the inDepositAccountPsbLastBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountPsbLastBalance(BigDecimal value) {
        this.inDepositAccountPsbLastBalance = value;
    }

    /**
     * Gets the value of the inDepositAccountPsbLastPrintLn property.
     * 
     */
    public short getInDepositAccountPsbLastPrintLn() {
        return inDepositAccountPsbLastPrintLn;
    }

    /**
     * Sets the value of the inDepositAccountPsbLastPrintLn property.
     * 
     */
    public void setInDepositAccountPsbLastPrintLn(short value) {
        this.inDepositAccountPsbLastPrintLn = value;
    }

    /**
     * Gets the value of the inDepositAccountPsbLineSn property.
     * 
     */
    public int getInDepositAccountPsbLineSn() {
        return inDepositAccountPsbLineSn;
    }

    /**
     * Sets the value of the inDepositAccountPsbLineSn property.
     * 
     */
    public void setInDepositAccountPsbLineSn(int value) {
        this.inDepositAccountPsbLineSn = value;
    }

    /**
     * Gets the value of the inDepositAccountPsbLostInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountPsbLostInd() {
        return inDepositAccountPsbLostInd;
    }

    /**
     * Sets the value of the inDepositAccountPsbLostInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountPsbLostInd(String value) {
        this.inDepositAccountPsbLostInd = value;
    }

    /**
     * Gets the value of the inDepositAccountPsbPendingLines property.
     * 
     */
    public short getInDepositAccountPsbPendingLines() {
        return inDepositAccountPsbPendingLines;
    }

    /**
     * Sets the value of the inDepositAccountPsbPendingLines property.
     * 
     */
    public void setInDepositAccountPsbPendingLines(short value) {
        this.inDepositAccountPsbPendingLines = value;
    }

    /**
     * Gets the value of the inDepositAccountPsbSn property.
     * 
     */
    public int getInDepositAccountPsbSn() {
        return inDepositAccountPsbSn;
    }

    /**
     * Sets the value of the inDepositAccountPsbSn property.
     * 
     */
    public void setInDepositAccountPsbSn(int value) {
        this.inDepositAccountPsbSn = value;
    }

    /**
     * Gets the value of the inDepositAccountRenewalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountRenewalDate() {
        return inDepositAccountRenewalDate;
    }

    /**
     * Sets the value of the inDepositAccountRenewalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountRenewalDate(XMLGregorianCalendar value) {
        this.inDepositAccountRenewalDate = value;
    }

    /**
     * Gets the value of the inDepositAccountRenewalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountRenewalFlag() {
        return inDepositAccountRenewalFlag;
    }

    /**
     * Sets the value of the inDepositAccountRenewalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountRenewalFlag(String value) {
        this.inDepositAccountRenewalFlag = value;
    }

    /**
     * Gets the value of the inDepositAccountRenewalNumber property.
     * 
     */
    public int getInDepositAccountRenewalNumber() {
        return inDepositAccountRenewalNumber;
    }

    /**
     * Sets the value of the inDepositAccountRenewalNumber property.
     * 
     */
    public void setInDepositAccountRenewalNumber(int value) {
        this.inDepositAccountRenewalNumber = value;
    }

    /**
     * Gets the value of the inDepositAccountRestrictAccFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountRestrictAccFlag() {
        return inDepositAccountRestrictAccFlag;
    }

    /**
     * Sets the value of the inDepositAccountRestrictAccFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountRestrictAccFlag(String value) {
        this.inDepositAccountRestrictAccFlag = value;
    }

    /**
     * Gets the value of the inDepositAccountRetainingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountRetainingDate() {
        return inDepositAccountRetainingDate;
    }

    /**
     * Sets the value of the inDepositAccountRetainingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountRetainingDate(XMLGregorianCalendar value) {
        this.inDepositAccountRetainingDate = value;
    }

    /**
     * Gets the value of the inDepositAccountSecretAccFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountSecretAccFlag() {
        return inDepositAccountSecretAccFlag;
    }

    /**
     * Sets the value of the inDepositAccountSecretAccFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountSecretAccFlag(String value) {
        this.inDepositAccountSecretAccFlag = value;
    }

    /**
     * Gets the value of the inDepositAccountServicePenalSpr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountServicePenalSpr() {
        return inDepositAccountServicePenalSpr;
    }

    /**
     * Sets the value of the inDepositAccountServicePenalSpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountServicePenalSpr(BigDecimal value) {
        this.inDepositAccountServicePenalSpr = value;
    }

    /**
     * Gets the value of the inDepositAccountSpecAgrPenFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountSpecAgrPenFlg() {
        return inDepositAccountSpecAgrPenFlg;
    }

    /**
     * Sets the value of the inDepositAccountSpecAgrPenFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountSpecAgrPenFlg(String value) {
        this.inDepositAccountSpecAgrPenFlg = value;
    }

    /**
     * Gets the value of the inDepositAccountSpecAgrTrxFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountSpecAgrTrxFlg() {
        return inDepositAccountSpecAgrTrxFlg;
    }

    /**
     * Sets the value of the inDepositAccountSpecAgrTrxFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountSpecAgrTrxFlg(String value) {
        this.inDepositAccountSpecAgrTrxFlg = value;
    }

    /**
     * Gets the value of the inDepositAccountSpecialAccFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountSpecialAccFlg() {
        return inDepositAccountSpecialAccFlg;
    }

    /**
     * Sets the value of the inDepositAccountSpecialAccFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountSpecialAccFlg(String value) {
        this.inDepositAccountSpecialAccFlg = value;
    }

    /**
     * Gets the value of the inDepositAccountStampAmountTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountStampAmountTotal() {
        return inDepositAccountStampAmountTotal;
    }

    /**
     * Sets the value of the inDepositAccountStampAmountTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountStampAmountTotal(BigDecimal value) {
        this.inDepositAccountStampAmountTotal = value;
    }

    /**
     * Gets the value of the inDepositAccountStartDateTd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountStartDateTd() {
        return inDepositAccountStartDateTd;
    }

    /**
     * Sets the value of the inDepositAccountStartDateTd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountStartDateTd(XMLGregorianCalendar value) {
        this.inDepositAccountStartDateTd = value;
    }

    /**
     * Gets the value of the inDepositAccountStartWdrBalPrd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountStartWdrBalPrd() {
        return inDepositAccountStartWdrBalPrd;
    }

    /**
     * Sets the value of the inDepositAccountStartWdrBalPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountStartWdrBalPrd(XMLGregorianCalendar value) {
        this.inDepositAccountStartWdrBalPrd = value;
    }

    /**
     * Gets the value of the inDepositAccountStatementIssFreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountStatementIssFreq() {
        return inDepositAccountStatementIssFreq;
    }

    /**
     * Sets the value of the inDepositAccountStatementIssFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountStatementIssFreq(String value) {
        this.inDepositAccountStatementIssFreq = value;
    }

    /**
     * Gets the value of the inDepositAccountSystemUsageCnt property.
     * 
     */
    public double getInDepositAccountSystemUsageCnt() {
        return inDepositAccountSystemUsageCnt;
    }

    /**
     * Sets the value of the inDepositAccountSystemUsageCnt property.
     * 
     */
    public void setInDepositAccountSystemUsageCnt(double value) {
        this.inDepositAccountSystemUsageCnt = value;
    }

    /**
     * Gets the value of the inDepositAccountTargetFlg property.
     * 
     */
    public short getInDepositAccountTargetFlg() {
        return inDepositAccountTargetFlg;
    }

    /**
     * Sets the value of the inDepositAccountTargetFlg property.
     * 
     */
    public void setInDepositAccountTargetFlg(short value) {
        this.inDepositAccountTargetFlg = value;
    }

    /**
     * Gets the value of the inDepositAccountTaxExcempFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountTaxExcempFlg() {
        return inDepositAccountTaxExcempFlg;
    }

    /**
     * Sets the value of the inDepositAccountTaxExcempFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountTaxExcempFlg(String value) {
        this.inDepositAccountTaxExcempFlg = value;
    }

    /**
     * Gets the value of the inDepositAccountTdBatchExtrtFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountTdBatchExtrtFlg() {
        return inDepositAccountTdBatchExtrtFlg;
    }

    /**
     * Sets the value of the inDepositAccountTdBatchExtrtFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountTdBatchExtrtFlg(String value) {
        this.inDepositAccountTdBatchExtrtFlg = value;
    }

    /**
     * Gets the value of the inDepositAccountTdInterPercentChg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountTdInterPercentChg() {
        return inDepositAccountTdInterPercentChg;
    }

    /**
     * Sets the value of the inDepositAccountTdInterPercentChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountTdInterPercentChg(BigDecimal value) {
        this.inDepositAccountTdInterPercentChg = value;
    }

    /**
     * Gets the value of the inDepositAccountTdInterSprdChg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountTdInterSprdChg() {
        return inDepositAccountTdInterSprdChg;
    }

    /**
     * Sets the value of the inDepositAccountTdInterSprdChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountTdInterSprdChg(BigDecimal value) {
        this.inDepositAccountTdInterSprdChg = value;
    }

    /**
     * Gets the value of the inDepositAccountTelebankingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountTelebankingFlag() {
        return inDepositAccountTelebankingFlag;
    }

    /**
     * Sets the value of the inDepositAccountTelebankingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountTelebankingFlag(String value) {
        this.inDepositAccountTelebankingFlag = value;
    }

    /**
     * Gets the value of the inDepositAccountTempExcEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountTempExcEndDt() {
        return inDepositAccountTempExcEndDt;
    }

    /**
     * Sets the value of the inDepositAccountTempExcEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountTempExcEndDt(XMLGregorianCalendar value) {
        this.inDepositAccountTempExcEndDt = value;
    }

    /**
     * Gets the value of the inDepositAccountTempExcStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountTempExcStartDt() {
        return inDepositAccountTempExcStartDt;
    }

    /**
     * Sets the value of the inDepositAccountTempExcStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountTempExcStartDt(XMLGregorianCalendar value) {
        this.inDepositAccountTempExcStartDt = value;
    }

    /**
     * Gets the value of the inDepositAccountTemporaryExcess property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountTemporaryExcess() {
        return inDepositAccountTemporaryExcess;
    }

    /**
     * Sets the value of the inDepositAccountTemporaryExcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountTemporaryExcess(BigDecimal value) {
        this.inDepositAccountTemporaryExcess = value;
    }

    /**
     * Gets the value of the inDepositAccountThirdpartyInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountThirdpartyInd() {
        return inDepositAccountThirdpartyInd;
    }

    /**
     * Sets the value of the inDepositAccountThirdpartyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountThirdpartyInd(String value) {
        this.inDepositAccountThirdpartyInd = value;
    }

    /**
     * Gets the value of the inDepositAccountTimestmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountTimestmp() {
        return inDepositAccountTimestmp;
    }

    /**
     * Sets the value of the inDepositAccountTimestmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountTimestmp(XMLGregorianCalendar value) {
        this.inDepositAccountTimestmp = value;
    }

    /**
     * Gets the value of the inDepositAccountTotalPartPenalty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountTotalPartPenalty() {
        return inDepositAccountTotalPartPenalty;
    }

    /**
     * Sets the value of the inDepositAccountTotalPartPenalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountTotalPartPenalty(BigDecimal value) {
        this.inDepositAccountTotalPartPenalty = value;
    }

    /**
     * Gets the value of the inDepositAccountTransitionIntTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountTransitionIntTax() {
        return inDepositAccountTransitionIntTax;
    }

    /**
     * Sets the value of the inDepositAccountTransitionIntTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountTransitionIntTax(BigDecimal value) {
        this.inDepositAccountTransitionIntTax = value;
    }

    /**
     * Gets the value of the inDepositAccountTransitionInter property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountTransitionInter() {
        return inDepositAccountTransitionInter;
    }

    /**
     * Sets the value of the inDepositAccountTransitionInter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountTransitionInter(BigDecimal value) {
        this.inDepositAccountTransitionInter = value;
    }

    /**
     * Gets the value of the inDepositAccountUnclearBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountUnclearBalance() {
        return inDepositAccountUnclearBalance;
    }

    /**
     * Sets the value of the inDepositAccountUnclearBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountUnclearBalance(BigDecimal value) {
        this.inDepositAccountUnclearBalance = value;
    }

    /**
     * Gets the value of the inDepositAccountUnclearWithdrFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountUnclearWithdrFlg() {
        return inDepositAccountUnclearWithdrFlg;
    }

    /**
     * Sets the value of the inDepositAccountUnclearWithdrFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountUnclearWithdrFlg(String value) {
        this.inDepositAccountUnclearWithdrFlg = value;
    }

    /**
     * Gets the value of the inDepositAccountUnutilLimitPenD property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountUnutilLimitPenD() {
        return inDepositAccountUnutilLimitPenD;
    }

    /**
     * Sets the value of the inDepositAccountUnutilLimitPenD property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountUnutilLimitPenD(BigDecimal value) {
        this.inDepositAccountUnutilLimitPenD = value;
    }

    /**
     * Gets the value of the inDepositAccountValidChqDuration property.
     * 
     */
    public int getInDepositAccountValidChqDuration() {
        return inDepositAccountValidChqDuration;
    }

    /**
     * Sets the value of the inDepositAccountValidChqDuration property.
     * 
     */
    public void setInDepositAccountValidChqDuration(int value) {
        this.inDepositAccountValidChqDuration = value;
    }

    /**
     * Gets the value of the inDepositAccountWebFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountWebFlg() {
        return inDepositAccountWebFlg;
    }

    /**
     * Sets the value of the inDepositAccountWebFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountWebFlg(String value) {
        this.inDepositAccountWebFlg = value;
    }

    /**
     * Gets the value of the inDepositAccountWebModDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepositAccountWebModDate() {
        return inDepositAccountWebModDate;
    }

    /**
     * Sets the value of the inDepositAccountWebModDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepositAccountWebModDate(XMLGregorianCalendar value) {
        this.inDepositAccountWebModDate = value;
    }

    /**
     * Gets the value of the inDepositAccountWithdrawAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountWithdrawAmnt() {
        return inDepositAccountWithdrawAmnt;
    }

    /**
     * Sets the value of the inDepositAccountWithdrawAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountWithdrawAmnt(BigDecimal value) {
        this.inDepositAccountWithdrawAmnt = value;
    }

    /**
     * Gets the value of the inDepositAccountWithdrawBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountWithdrawBalance() {
        return inDepositAccountWithdrawBalance;
    }

    /**
     * Sets the value of the inDepositAccountWithdrawBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountWithdrawBalance(BigDecimal value) {
        this.inDepositAccountWithdrawBalance = value;
    }

    /**
     * Gets the value of the inDepositAccountWthdrawSpread property.
     * 
     */
    public short getInDepositAccountWthdrawSpread() {
        return inDepositAccountWthdrawSpread;
    }

    /**
     * Sets the value of the inDepositAccountWthdrawSpread property.
     * 
     */
    public void setInDepositAccountWthdrawSpread(short value) {
        this.inDepositAccountWthdrawSpread = value;
    }

    /**
     * Gets the value of the inDpHistInterRateEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDpHistInterRateEffectiveDate() {
        return inDpHistInterRateEffectiveDate;
    }

    /**
     * Sets the value of the inDpHistInterRateEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDpHistInterRateEffectiveDate(XMLGregorianCalendar value) {
        this.inDpHistInterRateEffectiveDate = value;
    }

    /**
     * Gets the value of the inEconomyGenericDetailSerialNum property.
     * 
     */
    public int getInEconomyGenericDetailSerialNum() {
        return inEconomyGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inEconomyGenericDetailSerialNum property.
     * 
     */
    public void setInEconomyGenericDetailSerialNum(int value) {
        this.inEconomyGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inExtensionAccIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInExtensionAccIefSuppliedFlag() {
        return inExtensionAccIefSuppliedFlag;
    }

    /**
     * Sets the value of the inExtensionAccIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInExtensionAccIefSuppliedFlag(String value) {
        this.inExtensionAccIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inFixedOneAccLnsInterestDurationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFixedOneAccLnsInterestDurationUnit() {
        return inFixedOneAccLnsInterestDurationUnit;
    }

    /**
     * Sets the value of the inFixedOneAccLnsInterestDurationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFixedOneAccLnsInterestDurationUnit(String value) {
        this.inFixedOneAccLnsInterestDurationUnit = value;
    }

    /**
     * Gets the value of the inFixedOneAccLnsInterestIdInterest property.
     * 
     */
    public int getInFixedOneAccLnsInterestIdInterest() {
        return inFixedOneAccLnsInterestIdInterest;
    }

    /**
     * Sets the value of the inFixedOneAccLnsInterestIdInterest property.
     * 
     */
    public void setInFixedOneAccLnsInterestIdInterest(int value) {
        this.inFixedOneAccLnsInterestIdInterest = value;
    }

    /**
     * Gets the value of the inFixedOneAccLnsInterestIntDuration property.
     * 
     */
    public short getInFixedOneAccLnsInterestIntDuration() {
        return inFixedOneAccLnsInterestIntDuration;
    }

    /**
     * Sets the value of the inFixedOneAccLnsInterestIntDuration property.
     * 
     */
    public void setInFixedOneAccLnsInterestIntDuration(short value) {
        this.inFixedOneAccLnsInterestIntDuration = value;
    }

    /**
     * Gets the value of the inHouseUnitCode property.
     * 
     */
    public int getInHouseUnitCode() {
        return inHouseUnitCode;
    }

    /**
     * Sets the value of the inHouseUnitCode property.
     * 
     */
    public void setInHouseUnitCode(int value) {
        this.inHouseUnitCode = value;
    }

    /**
     * Gets the value of the inIssueOfficeUnitCode property.
     * 
     */
    public int getInIssueOfficeUnitCode() {
        return inIssueOfficeUnitCode;
    }

    /**
     * Sets the value of the inIssueOfficeUnitCode property.
     * 
     */
    public void setInIssueOfficeUnitCode(int value) {
        this.inIssueOfficeUnitCode = value;
    }

    /**
     * Gets the value of the inIssueOfficeUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIssueOfficeUnitUnitName() {
        return inIssueOfficeUnitUnitName;
    }

    /**
     * Sets the value of the inIssueOfficeUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIssueOfficeUnitUnitName(String value) {
        this.inIssueOfficeUnitUnitName = value;
    }

    /**
     * Gets the value of the inJustificIdJustific property.
     * 
     */
    public int getInJustificIdJustific() {
        return inJustificIdJustific;
    }

    /**
     * Sets the value of the inJustificIdJustific property.
     * 
     */
    public void setInJustificIdJustific(int value) {
        this.inJustificIdJustific = value;
    }

    /**
     * Gets the value of the inKekGenericDetailSerialNum property.
     * 
     */
    public int getInKekGenericDetailSerialNum() {
        return inKekGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inKekGenericDetailSerialNum property.
     * 
     */
    public void setInKekGenericDetailSerialNum(int value) {
        this.inKekGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inLkepGenericDetailEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLkepGenericDetailEntryStatus() {
        return inLkepGenericDetailEntryStatus;
    }

    /**
     * Sets the value of the inLkepGenericDetailEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLkepGenericDetailEntryStatus(String value) {
        this.inLkepGenericDetailEntryStatus = value;
    }

    /**
     * Gets the value of the inLkepGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLkepGenericDetailParameterType() {
        return inLkepGenericDetailParameterType;
    }

    /**
     * Sets the value of the inLkepGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLkepGenericDetailParameterType(String value) {
        this.inLkepGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inLkepGenericDetailSerialNum property.
     * 
     */
    public int getInLkepGenericDetailSerialNum() {
        return inLkepGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inLkepGenericDetailSerialNum property.
     * 
     */
    public void setInLkepGenericDetailSerialNum(int value) {
        this.inLkepGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inLoanAccountRecyclingFrequency property.
     * 
     */
    public short getInLoanAccountRecyclingFrequency() {
        return inLoanAccountRecyclingFrequency;
    }

    /**
     * Sets the value of the inLoanAccountRecyclingFrequency property.
     * 
     */
    public void setInLoanAccountRecyclingFrequency(short value) {
        this.inLoanAccountRecyclingFrequency = value;
    }

    /**
     * Gets the value of the inLpurpGenericDetailEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLpurpGenericDetailEntryStatus() {
        return inLpurpGenericDetailEntryStatus;
    }

    /**
     * Sets the value of the inLpurpGenericDetailEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLpurpGenericDetailEntryStatus(String value) {
        this.inLpurpGenericDetailEntryStatus = value;
    }

    /**
     * Gets the value of the inLpurpGenericDetailSerialNum property.
     * 
     */
    public int getInLpurpGenericDetailSerialNum() {
        return inLpurpGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inLpurpGenericDetailSerialNum property.
     * 
     */
    public void setInLpurpGenericDetailSerialNum(int value) {
        this.inLpurpGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inMailCustAddressSerialNum property.
     * 
     */
    public short getInMailCustAddressSerialNum() {
        return inMailCustAddressSerialNum;
    }

    /**
     * Sets the value of the inMailCustAddressSerialNum property.
     * 
     */
    public void setInMailCustAddressSerialNum(short value) {
        this.inMailCustAddressSerialNum = value;
    }

    /**
     * Gets the value of the inMonitoringBankemployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMonitoringBankemployeeId() {
        return inMonitoringBankemployeeId;
    }

    /**
     * Sets the value of the inMonitoringBankemployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMonitoringBankemployeeId(String value) {
        this.inMonitoringBankemployeeId = value;
    }

    /**
     * Gets the value of the inOpenUnitCommentsIefSuppliedText40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOpenUnitCommentsIefSuppliedText40() {
        return inOpenUnitCommentsIefSuppliedText40;
    }

    /**
     * Sets the value of the inOpenUnitCommentsIefSuppliedText40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOpenUnitCommentsIefSuppliedText40(String value) {
        this.inOpenUnitCommentsIefSuppliedText40 = value;
    }

    /**
     * Gets the value of the inPackageIdPackage property.
     * 
     */
    public int getInPackageIdPackage() {
        return inPackageIdPackage;
    }

    /**
     * Sets the value of the inPackageIdPackage property.
     * 
     */
    public void setInPackageIdPackage(int value) {
        this.inPackageIdPackage = value;
    }

    /**
     * Gets the value of the inParametersInTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInTerminalTerminalNumber() {
        return inParametersInTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inParametersInTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInTerminalTerminalNumber(String value) {
        this.inParametersInTerminalTerminalNumber = value;
    }

    /**
     * Gets the value of the inPrftTransactionIdTransact property.
     * 
     */
    public int getInPrftTransactionIdTransact() {
        return inPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the inPrftTransactionIdTransact property.
     * 
     */
    public void setInPrftTransactionIdTransact(int value) {
        this.inPrftTransactionIdTransact = value;
    }

    /**
     * Gets the value of the inProdidProductIdProduct property.
     * 
     */
    public int getInProdidProductIdProduct() {
        return inProdidProductIdProduct;
    }

    /**
     * Sets the value of the inProdidProductIdProduct property.
     * 
     */
    public void setInProdidProductIdProduct(int value) {
        this.inProdidProductIdProduct = value;
    }

    /**
     * Gets the value of the inProfGenericDetailSerialNum property.
     * 
     */
    public int getInProfGenericDetailSerialNum() {
        return inProfGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inProfGenericDetailSerialNum property.
     * 
     */
    public void setInProfGenericDetailSerialNum(int value) {
        this.inProfGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inRetDepFixingRateRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInRetDepFixingRateRate() {
        return inRetDepFixingRateRate;
    }

    /**
     * Sets the value of the inRetDepFixingRateRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInRetDepFixingRateRate(BigDecimal value) {
        this.inRetDepFixingRateRate = value;
    }

    /**
     * Gets the value of the inRetOverdraftCurrencyDisplayedDecimalPlaces property.
     * 
     */
    public short getInRetOverdraftCurrencyDisplayedDecimalPlaces() {
        return inRetOverdraftCurrencyDisplayedDecimalPlaces;
    }

    /**
     * Sets the value of the inRetOverdraftCurrencyDisplayedDecimalPlaces property.
     * 
     */
    public void setInRetOverdraftCurrencyDisplayedDecimalPlaces(short value) {
        this.inRetOverdraftCurrencyDisplayedDecimalPlaces = value;
    }

    /**
     * Gets the value of the inRetOverdraftCurrencyIdCurrency property.
     * 
     */
    public int getInRetOverdraftCurrencyIdCurrency() {
        return inRetOverdraftCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inRetOverdraftCurrencyIdCurrency property.
     * 
     */
    public void setInRetOverdraftCurrencyIdCurrency(int value) {
        this.inRetOverdraftCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inRetOverdraftCurrencyNationalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRetOverdraftCurrencyNationalFlag() {
        return inRetOverdraftCurrencyNationalFlag;
    }

    /**
     * Sets the value of the inRetOverdraftCurrencyNationalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRetOverdraftCurrencyNationalFlag(String value) {
        this.inRetOverdraftCurrencyNationalFlag = value;
    }

    /**
     * Gets the value of the inSalePersonGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSalePersonGenericDetailShortDescription() {
        return inSalePersonGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inSalePersonGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSalePersonGenericDetailShortDescription(String value) {
        this.inSalePersonGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inSaleUnitGenericDetailSerialNum property.
     * 
     */
    public int getInSaleUnitGenericDetailSerialNum() {
        return inSaleUnitGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inSaleUnitGenericDetailSerialNum property.
     * 
     */
    public void setInSaleUnitGenericDetailSerialNum(int value) {
        this.inSaleUnitGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inSecondCredIntLnsInterestIdInterest property.
     * 
     */
    public int getInSecondCredIntLnsInterestIdInterest() {
        return inSecondCredIntLnsInterestIdInterest;
    }

    /**
     * Sets the value of the inSecondCredIntLnsInterestIdInterest property.
     * 
     */
    public void setInSecondCredIntLnsInterestIdInterest(int value) {
        this.inSecondCredIntLnsInterestIdInterest = value;
    }

    /**
     * Gets the value of the inSecretConfirmDepositAccountSecretAccFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSecretConfirmDepositAccountSecretAccFlag() {
        return inSecretConfirmDepositAccountSecretAccFlag;
    }

    /**
     * Sets the value of the inSecretConfirmDepositAccountSecretAccFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSecretConfirmDepositAccountSecretAccFlag(String value) {
        this.inSecretConfirmDepositAccountSecretAccFlag = value;
    }

    /**
     * Gets the value of the inServiceDepositAccountProfitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInServiceDepositAccountProfitsAccountNumber() {
        return inServiceDepositAccountProfitsAccountNumber;
    }

    /**
     * Sets the value of the inServiceDepositAccountProfitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInServiceDepositAccountProfitsAccountNumber(String value) {
        this.inServiceDepositAccountProfitsAccountNumber = value;
    }

    /**
     * Gets the value of the inServiceDepositAccountProfitsAccountCd property.
     * 
     */
    public short getInServiceDepositAccountProfitsAccountCd() {
        return inServiceDepositAccountProfitsAccountCd;
    }

    /**
     * Sets the value of the inServiceDepositAccountProfitsAccountCd property.
     * 
     */
    public void setInServiceDepositAccountProfitsAccountCd(short value) {
        this.inServiceDepositAccountProfitsAccountCd = value;
    }

    /**
     * Gets the value of the inSupervisorsTeamInformationSuper1Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSupervisorsTeamInformationSuper1Code() {
        return inSupervisorsTeamInformationSuper1Code;
    }

    /**
     * Sets the value of the inSupervisorsTeamInformationSuper1Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSupervisorsTeamInformationSuper1Code(String value) {
        this.inSupervisorsTeamInformationSuper1Code = value;
    }

    /**
     * Gets the value of the inSupervisorsTeamInformationSuper2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSupervisorsTeamInformationSuper2Code() {
        return inSupervisorsTeamInformationSuper2Code;
    }

    /**
     * Sets the value of the inSupervisorsTeamInformationSuper2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSupervisorsTeamInformationSuper2Code(String value) {
        this.inSupervisorsTeamInformationSuper2Code = value;
    }

    /**
     * Gets the value of the inTaxCountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTaxCountryGenericDetailDescription() {
        return inTaxCountryGenericDetailDescription;
    }

    /**
     * Sets the value of the inTaxCountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTaxCountryGenericDetailDescription(String value) {
        this.inTaxCountryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inTaxCountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTaxCountryGenericDetailShortDescription() {
        return inTaxCountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inTaxCountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTaxCountryGenericDetailShortDescription(String value) {
        this.inTaxCountryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inTimeDeposRenewalCrInterTaxPcg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTimeDeposRenewalCrInterTaxPcg() {
        return inTimeDeposRenewalCrInterTaxPcg;
    }

    /**
     * Sets the value of the inTimeDeposRenewalCrInterTaxPcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTimeDeposRenewalCrInterTaxPcg(BigDecimal value) {
        this.inTimeDeposRenewalCrInterTaxPcg = value;
    }

    /**
     * Gets the value of the inTimeDeposRenewalDaysDuration property.
     * 
     */
    public short getInTimeDeposRenewalDaysDuration() {
        return inTimeDeposRenewalDaysDuration;
    }

    /**
     * Sets the value of the inTimeDeposRenewalDaysDuration property.
     * 
     */
    public void setInTimeDeposRenewalDaysDuration(short value) {
        this.inTimeDeposRenewalDaysDuration = value;
    }

    /**
     * Gets the value of the inTimeDeposRenewalDurationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTimeDeposRenewalDurationUnit() {
        return inTimeDeposRenewalDurationUnit;
    }

    /**
     * Sets the value of the inTimeDeposRenewalDurationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTimeDeposRenewalDurationUnit(String value) {
        this.inTimeDeposRenewalDurationUnit = value;
    }

    /**
     * Gets the value of the inTimeDeposRenewalDurationValue property.
     * 
     */
    public short getInTimeDeposRenewalDurationValue() {
        return inTimeDeposRenewalDurationValue;
    }

    /**
     * Sets the value of the inTimeDeposRenewalDurationValue property.
     * 
     */
    public void setInTimeDeposRenewalDurationValue(short value) {
        this.inTimeDeposRenewalDurationValue = value;
    }

    /**
     * Gets the value of the inTimeDeposRenewalExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTimeDeposRenewalExpiryDate() {
        return inTimeDeposRenewalExpiryDate;
    }

    /**
     * Sets the value of the inTimeDeposRenewalExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTimeDeposRenewalExpiryDate(XMLGregorianCalendar value) {
        this.inTimeDeposRenewalExpiryDate = value;
    }

    /**
     * Gets the value of the inTimeDeposRenewalStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTimeDeposRenewalStartDate() {
        return inTimeDeposRenewalStartDate;
    }

    /**
     * Sets the value of the inTimeDeposRenewalStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTimeDeposRenewalStartDate(XMLGregorianCalendar value) {
        this.inTimeDeposRenewalStartDate = value;
    }

    /**
     * Gets the value of the inUnutillPenLnsCommissionIdCommission property.
     * 
     */
    public int getInUnutillPenLnsCommissionIdCommission() {
        return inUnutillPenLnsCommissionIdCommission;
    }

    /**
     * Sets the value of the inUnutillPenLnsCommissionIdCommission property.
     * 
     */
    public void setInUnutillPenLnsCommissionIdCommission(int value) {
        this.inUnutillPenLnsCommissionIdCommission = value;
    }

    /**
     * Gets the value of the inUsedInputCharSuppliedChar37 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUsedInputCharSuppliedChar37() {
        return inUsedInputCharSuppliedChar37;
    }

    /**
     * Sets the value of the inUsedInputCharSuppliedChar37 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUsedInputCharSuppliedChar37(String value) {
        this.inUsedInputCharSuppliedChar37 = value;
    }

    /**
     * Gets the value of the inWithdrawDayFromIefSuppliedDays property.
     * 
     */
    public int getInWithdrawDayFromIefSuppliedDays() {
        return inWithdrawDayFromIefSuppliedDays;
    }

    /**
     * Sets the value of the inWithdrawDayFromIefSuppliedDays property.
     * 
     */
    public void setInWithdrawDayFromIefSuppliedDays(int value) {
        this.inWithdrawDayFromIefSuppliedDays = value;
    }

    /**
     * Gets the value of the inWithdrawDayFromIefSuppliedMonth property.
     * 
     */
    public short getInWithdrawDayFromIefSuppliedMonth() {
        return inWithdrawDayFromIefSuppliedMonth;
    }

    /**
     * Sets the value of the inWithdrawDayFromIefSuppliedMonth property.
     * 
     */
    public void setInWithdrawDayFromIefSuppliedMonth(short value) {
        this.inWithdrawDayFromIefSuppliedMonth = value;
    }

    /**
     * Gets the value of the inWithdrawDayToIefSuppliedDays property.
     * 
     */
    public int getInWithdrawDayToIefSuppliedDays() {
        return inWithdrawDayToIefSuppliedDays;
    }

    /**
     * Sets the value of the inWithdrawDayToIefSuppliedDays property.
     * 
     */
    public void setInWithdrawDayToIefSuppliedDays(int value) {
        this.inWithdrawDayToIefSuppliedDays = value;
    }

    /**
     * Gets the value of the inWithdrawDayToIefSuppliedMonth property.
     * 
     */
    public short getInWithdrawDayToIefSuppliedMonth() {
        return inWithdrawDayToIefSuppliedMonth;
    }

    /**
     * Sets the value of the inWithdrawDayToIefSuppliedMonth property.
     * 
     */
    public void setInWithdrawDayToIefSuppliedMonth(short value) {
        this.inWithdrawDayToIefSuppliedMonth = value;
    }

    /**
     * Gets the value of the inDepositAccountMailStatment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountMailStatment() {
        return inDepositAccountMailStatment;
    }

    /**
     * Sets the value of the inDepositAccountMailStatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountMailStatment(String value) {
        this.inDepositAccountMailStatment = value;
    }

    /**
     * Gets the value of the inRefereeAccNoIefSuppliedChar100 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRefereeAccNoIefSuppliedChar100() {
        return inRefereeAccNoIefSuppliedChar100;
    }

    /**
     * Sets the value of the inRefereeAccNoIefSuppliedChar100 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRefereeAccNoIefSuppliedChar100(String value) {
        this.inRefereeAccNoIefSuppliedChar100 = value;
    }

    /**
     * Gets the value of the inRefereeNameIefSuppliedChar100 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRefereeNameIefSuppliedChar100() {
        return inRefereeNameIefSuppliedChar100;
    }

    /**
     * Sets the value of the inRefereeNameIefSuppliedChar100 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRefereeNameIefSuppliedChar100(String value) {
        this.inRefereeNameIefSuppliedChar100 = value;
    }

    /**
     * Gets the value of the inDepositAccountFreeText3IefSuppliedChar100 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountFreeText3IefSuppliedChar100() {
        return inDepositAccountFreeText3IefSuppliedChar100;
    }

    /**
     * Sets the value of the inDepositAccountFreeText3IefSuppliedChar100 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountFreeText3IefSuppliedChar100(String value) {
        this.inDepositAccountFreeText3IefSuppliedChar100 = value;
    }

    /**
     * Gets the value of the inDepositAccountFreeText4IefSuppliedChar100 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountFreeText4IefSuppliedChar100() {
        return inDepositAccountFreeText4IefSuppliedChar100;
    }

    /**
     * Sets the value of the inDepositAccountFreeText4IefSuppliedChar100 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountFreeText4IefSuppliedChar100(String value) {
        this.inDepositAccountFreeText4IefSuppliedChar100 = value;
    }

    /**
     * Gets the value of the inDepositAccountFreeText5IefSuppliedChar100 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountFreeText5IefSuppliedChar100() {
        return inDepositAccountFreeText5IefSuppliedChar100;
    }

    /**
     * Sets the value of the inDepositAccountFreeText5IefSuppliedChar100 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountFreeText5IefSuppliedChar100(String value) {
        this.inDepositAccountFreeText5IefSuppliedChar100 = value;
    }

    /**
     * Gets the value of the inCrmCodeGenericDetailSerialNum property.
     * 
     */
    public int getInCrmCodeGenericDetailSerialNum() {
        return inCrmCodeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inCrmCodeGenericDetailSerialNum property.
     * 
     */
    public void setInCrmCodeGenericDetailSerialNum(int value) {
        this.inCrmCodeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inDepositAccountSwiftMt942 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountSwiftMt942() {
        return inDepositAccountSwiftMt942;
    }

    /**
     * Sets the value of the inDepositAccountSwiftMt942 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountSwiftMt942(String value) {
        this.inDepositAccountSwiftMt942 = value;
    }

    /**
     * Gets the value of the inDepositAccountSwiftMt940 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountSwiftMt940() {
        return inDepositAccountSwiftMt940;
    }

    /**
     * Sets the value of the inDepositAccountSwiftMt940 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountSwiftMt940(String value) {
        this.inDepositAccountSwiftMt940 = value;
    }

}
