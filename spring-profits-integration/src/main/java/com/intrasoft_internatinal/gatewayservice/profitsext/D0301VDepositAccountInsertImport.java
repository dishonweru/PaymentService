
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for D0301VDepositAccountInsertImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="D0301VDepositAccountInsertImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAccTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAchBnkCollaborationBanksAchBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAchBnkCollaborationBanksBankId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAddExcesLimitLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAgreementProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAgreementProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InAgreementAgrLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InAgreementAgrStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAgreementAgrUtilisedLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InAgreementTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InAuthorGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCapitalDisposalDepositAccountProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCapitalDisposalDepositAccountProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCcodeGenericDetailEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCcodeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCoben1CustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCoben1CustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCoben2CustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCoben2CustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCoben3CustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCoben3CustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCoben4CustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCoben4CustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCoben5CustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCoben5CustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCobenSnCustAddressSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCrDbInterestDepositProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCrDbInterestDepositProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCrLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCredGradGenericDetailEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCredGradGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustCategGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
 *         &lt;element name="InDepositAccountAccGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountAccountLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="InDepositAccountBoePercentance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountBoeSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountBookNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountCapIncreaseAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
 *         &lt;element name="InDepositAccountDbIntRtSprdInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountDbInterRateSpr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountDepositType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountDrawDownWxpDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountDurationUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountDurationValue" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDepositAccountEncroachTolerance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountExpCrIntSprd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountExpDbIntSprd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountExpiryDateTd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountExternalAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountExtraitPrintDay" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDepositAccountFinalWhldTaxFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountFixedInterFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountFixedInterRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountHomeBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountIncomeAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountIncomeFrequency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountInspectionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountInterPayOptions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountInterestPayInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountKadFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountMultiSalaryAmnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDepositAccountNostroAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountNotExpensesFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountNotifSpreadDayB" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDepositAccountNotifSpreadDays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDepositAccountOfficeAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountOverdraftComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountOverdraftFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountOverdraftSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountRenewalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountRenewalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountRestrictAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountSecretAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountServicePenalSpr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountSpecialAccFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountStartDateTd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountStatementIssFreq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="InDepositAccountUnclearWithdrFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountUnutilLimitPenD" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountValidChqDuration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountWebFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountWebModDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositAccountWithdrawAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountWthdrawSpread" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InFixedOneAccLnsInterestDurationUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFixedOneAccLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InFixedOneAccLnsInterestIntDuration" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGrpOwners" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfD0301VInGrpOwnersItem" minOccurs="0"/>
 *         &lt;element name="InHouseUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIssueOfficeUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIssueOfficeUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InKekGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLoanAccountRecyclingFrequency" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLpurpGenericDetailEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLpurpGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMainProfitsAccountAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMainProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InMainProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMainProfitsAccountAgreementProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMainProfitsAccountAgreementProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InMainProfitsAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InMainProfitsAccountCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMainProfitsAccountDepProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMainProfitsAccountDepProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InMainProfitsAccountDepOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMainProfitsAccountGenericAccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMainProfitsAccountLgProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMainProfitsAccountLgProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InMainProfitsAccountLgOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMainProfitsAccountLimitCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMainProfitsAccountLnsProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMainProfitsAccountLnsProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InMainProfitsAccountMonotoringUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMainProfitsAccountMovementCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMainProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InMainProfitsAccountProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMainProfitsAccountTrOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMainProfitsAccountTrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMainProfitsAccountTrType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InMainProfitsAccountWfeDetail" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InMainProfitsAccountWfeHeader" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InMainProfitsAccountWfsDetail" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InMainProfitsAccountWfsHeader" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InOldDepositAccountProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOldDepositAccountProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InOldDepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPackageIdPackage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InParametersInTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSalePersonGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSaleUnitGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSecondCredIntLnsInterestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSecondCredIntLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InServiceDepositAccountProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InServiceDepositAccountProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSupervisorsTeamInformationSuper1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSupervisorsTeamInformationSuper2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTaxCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTaxCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InUnutilPenLnsCommissionIdCommission" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InWithdrawDayFromIefSuppliedDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InWithdrawDayFromIefSuppliedMonth" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InWithdrawDayToIefSuppliedDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InWithdrawDayToIefSuppliedMonth" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDepositAccountMailStatment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountRefereeNameIefSuppliedChar100" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountRefereeAccnoIefSuppliedChar100" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountFreeText3IefSuppliedChar100" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountFreeText4IefSuppliedChar100" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountFreeText5IefSuppliedChar100" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCrmCodeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InParametersInUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "D0301VDepositAccountInsertImport", propOrder = {
    "command",
    "inAccTypeGenericDetailSerialNum",
    "inAchBnkCollaborationBanksAchBankCode",
    "inAchBnkCollaborationBanksBankId",
    "inAddExcesLimitLnsInterestIdInterest",
    "inAgreementProfitsAccountNumber",
    "inAgreementProfitsAccountCd",
    "inAgreementAgrLimit",
    "inAgreementAgrStatus",
    "inAgreementAgrUtilisedLimit",
    "inAgreementTmstamp",
    "inAuthorGrantedIefSuppliedFlag",
    "inBankemployeeId",
    "inCapitalDisposalDepositAccountProfitsAccountNumber",
    "inCapitalDisposalDepositAccountProfitsAccountCd",
    "inCcodeGenericDetailEntryStatus",
    "inCcodeGenericDetailSerialNum",
    "inCoben1CustomerCDigit",
    "inCoben1CustomerCustId",
    "inCoben2CustomerCDigit",
    "inCoben2CustomerCustId",
    "inCoben3CustomerCDigit",
    "inCoben3CustomerCustId",
    "inCoben4CustomerCDigit",
    "inCoben4CustomerCustId",
    "inCoben5CustomerCDigit",
    "inCoben5CustomerCustId",
    "inCobenSnCustAddressSerialNum",
    "inCrDbInterestDepositProfitsAccountNumber",
    "inCrDbInterestDepositProfitsAccountCd",
    "inCrLnsInterestIdInterest",
    "inCredGradGenericDetailEntryStatus",
    "inCredGradGenericDetailSerialNum",
    "inCurrencyIdCurrency",
    "inCurrencyShortDescr",
    "inCustCategGenericDetailSerialNum",
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
    "inDepositAccountAccGroup",
    "inDepositAccountAccountLimit",
    "inDepositAccountAccountType",
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
    "inDepositAccountBoePercentance",
    "inDepositAccountBoeSpread",
    "inDepositAccountBookNo",
    "inDepositAccountCapIncreaseAmn",
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
    "inDepositAccountDbIntRtSprdInd",
    "inDepositAccountDbInterRateSpr",
    "inDepositAccountDepositType",
    "inDepositAccountDesignation",
    "inDepositAccountDrawDownWxpDate",
    "inDepositAccountDurationUnit",
    "inDepositAccountDurationValue",
    "inDepositAccountEncroachTolerance",
    "inDepositAccountExpCrIntSprd",
    "inDepositAccountExpDbIntSprd",
    "inDepositAccountExpiryDate",
    "inDepositAccountExpiryDateTd",
    "inDepositAccountExternalAccFlag",
    "inDepositAccountExtraitPrintDay",
    "inDepositAccountFinalWhldTaxFlg",
    "inDepositAccountFixedInterFlag",
    "inDepositAccountFixedInterRate",
    "inDepositAccountHomeBranch",
    "inDepositAccountIncomeAmnt",
    "inDepositAccountIncomeFrequency",
    "inDepositAccountInspectionDate",
    "inDepositAccountInterPayOptions",
    "inDepositAccountInterestPayInd",
    "inDepositAccountKadFlg",
    "inDepositAccountMultiSalaryAmnt",
    "inDepositAccountNostroAccount",
    "inDepositAccountNotExpensesFlg",
    "inDepositAccountNotifSpreadDayB",
    "inDepositAccountNotifSpreadDays",
    "inDepositAccountOfficeAccFlag",
    "inDepositAccountOverdraftComment",
    "inDepositAccountOverdraftFlg",
    "inDepositAccountOverdraftSpread",
    "inDepositAccountRenewalDate",
    "inDepositAccountRenewalFlag",
    "inDepositAccountRestrictAccFlag",
    "inDepositAccountSecretAccFlag",
    "inDepositAccountServicePenalSpr",
    "inDepositAccountSpecialAccFlg",
    "inDepositAccountStartDateTd",
    "inDepositAccountStatementIssFreq",
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
    "inDepositAccountUnclearWithdrFlg",
    "inDepositAccountUnutilLimitPenD",
    "inDepositAccountValidChqDuration",
    "inDepositAccountWebFlg",
    "inDepositAccountWebModDate",
    "inDepositAccountWithdrawAmnt",
    "inDepositAccountWthdrawSpread",
    "inFixedOneAccLnsInterestDurationUnit",
    "inFixedOneAccLnsInterestIdInterest",
    "inFixedOneAccLnsInterestIntDuration",
    "inGrpOwners",
    "inHouseUnitCode",
    "inIssueOfficeUnitCode",
    "inIssueOfficeUnitUnitName",
    "inKekGenericDetailSerialNum",
    "inLoanAccountRecyclingFrequency",
    "inLpurpGenericDetailEntryStatus",
    "inLpurpGenericDetailSerialNum",
    "inMainProfitsAccountAccStatus",
    "inMainProfitsAccountAccountCd",
    "inMainProfitsAccountAccountNumber",
    "inMainProfitsAccountAgreementProfitsAccountNumber",
    "inMainProfitsAccountAgreementProfitsAccountCd",
    "inMainProfitsAccountCDigit",
    "inMainProfitsAccountCustId",
    "inMainProfitsAccountDepProfitsAccountNumber",
    "inMainProfitsAccountDepProfitsAccountCd",
    "inMainProfitsAccountDepOpenUnit",
    "inMainProfitsAccountGenericAccountNo",
    "inMainProfitsAccountLgProfitsAccountNumber",
    "inMainProfitsAccountLgProfitsAccountCd",
    "inMainProfitsAccountLgOpenUnit",
    "inMainProfitsAccountLimitCurrency",
    "inMainProfitsAccountLnsProfitsAccountNumber",
    "inMainProfitsAccountLnsProfitsAccountCd",
    "inMainProfitsAccountMonotoringUnit",
    "inMainProfitsAccountMovementCurrency",
    "inMainProfitsAccountPrftSystem",
    "inMainProfitsAccountProductId",
    "inMainProfitsAccountTrOpenUnit",
    "inMainProfitsAccountTrSn",
    "inMainProfitsAccountTrType",
    "inMainProfitsAccountWfeDetail",
    "inMainProfitsAccountWfeHeader",
    "inMainProfitsAccountWfsDetail",
    "inMainProfitsAccountWfsHeader",
    "inOldDepositAccountProfitsAccountNumber",
    "inOldDepositAccountProfitsAccountCd",
    "inOldDepositAccountDesignation",
    "inPackageIdPackage",
    "inParametersInTerminalTerminalNumber",
    "inPrftTransactionIdTransact",
    "inProductIdProduct",
    "inSalePersonGenericDetailShortDescription",
    "inSaleUnitGenericDetailSerialNum",
    "inSecondCredIntLnsInterestDescription",
    "inSecondCredIntLnsInterestIdInterest",
    "inServiceDepositAccountProfitsAccountNumber",
    "inServiceDepositAccountProfitsAccountCd",
    "inSupervisorsTeamInformationSuper1Code",
    "inSupervisorsTeamInformationSuper2Code",
    "inTaxCountryGenericDetailDescription",
    "inTaxCountryGenericDetailShortDescription",
    "inUnutilPenLnsCommissionIdCommission",
    "inWithdrawDayFromIefSuppliedDays",
    "inWithdrawDayFromIefSuppliedMonth",
    "inWithdrawDayToIefSuppliedDays",
    "inWithdrawDayToIefSuppliedMonth",
    "inDepositAccountMailStatment",
    "inDepositAccountRefereeNameIefSuppliedChar100",
    "inDepositAccountRefereeAccnoIefSuppliedChar100",
    "inDepositAccountFreeText3IefSuppliedChar100",
    "inDepositAccountFreeText4IefSuppliedChar100",
    "inDepositAccountFreeText5IefSuppliedChar100",
    "inCrmCodeGenericDetailSerialNum",
    "inParametersInUnitCode"
})
public class D0301VDepositAccountInsertImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InAccTypeGenericDetailSerialNum")
    protected int inAccTypeGenericDetailSerialNum;
    @XmlElement(name = "InAchBnkCollaborationBanksAchBankCode")
    protected String inAchBnkCollaborationBanksAchBankCode;
    @XmlElement(name = "InAchBnkCollaborationBanksBankId")
    protected int inAchBnkCollaborationBanksBankId;
    @XmlElement(name = "InAddExcesLimitLnsInterestIdInterest")
    protected int inAddExcesLimitLnsInterestIdInterest;
    @XmlElement(name = "InAgreementProfitsAccountNumber")
    protected String inAgreementProfitsAccountNumber;
    @XmlElement(name = "InAgreementProfitsAccountCd")
    protected short inAgreementProfitsAccountCd;
    @XmlElement(name = "InAgreementAgrLimit", required = true)
    protected BigDecimal inAgreementAgrLimit;
    @XmlElement(name = "InAgreementAgrStatus")
    protected String inAgreementAgrStatus;
    @XmlElement(name = "InAgreementAgrUtilisedLimit", required = true)
    protected BigDecimal inAgreementAgrUtilisedLimit;
    @XmlElement(name = "InAgreementTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inAgreementTmstamp;
    @XmlElement(name = "InAuthorGrantedIefSuppliedFlag")
    protected String inAuthorGrantedIefSuppliedFlag;
    @XmlElement(name = "InBankemployeeId")
    protected String inBankemployeeId;
    @XmlElement(name = "InCapitalDisposalDepositAccountProfitsAccountNumber")
    protected String inCapitalDisposalDepositAccountProfitsAccountNumber;
    @XmlElement(name = "InCapitalDisposalDepositAccountProfitsAccountCd")
    protected short inCapitalDisposalDepositAccountProfitsAccountCd;
    @XmlElement(name = "InCcodeGenericDetailEntryStatus")
    protected String inCcodeGenericDetailEntryStatus;
    @XmlElement(name = "InCcodeGenericDetailSerialNum")
    protected int inCcodeGenericDetailSerialNum;
    @XmlElement(name = "InCoben1CustomerCDigit")
    protected short inCoben1CustomerCDigit;
    @XmlElement(name = "InCoben1CustomerCustId")
    protected int inCoben1CustomerCustId;
    @XmlElement(name = "InCoben2CustomerCDigit")
    protected short inCoben2CustomerCDigit;
    @XmlElement(name = "InCoben2CustomerCustId")
    protected int inCoben2CustomerCustId;
    @XmlElement(name = "InCoben3CustomerCDigit")
    protected short inCoben3CustomerCDigit;
    @XmlElement(name = "InCoben3CustomerCustId")
    protected int inCoben3CustomerCustId;
    @XmlElement(name = "InCoben4CustomerCDigit")
    protected short inCoben4CustomerCDigit;
    @XmlElement(name = "InCoben4CustomerCustId")
    protected int inCoben4CustomerCustId;
    @XmlElement(name = "InCoben5CustomerCDigit")
    protected short inCoben5CustomerCDigit;
    @XmlElement(name = "InCoben5CustomerCustId")
    protected int inCoben5CustomerCustId;
    @XmlElement(name = "InCobenSnCustAddressSerialNum")
    protected short inCobenSnCustAddressSerialNum;
    @XmlElement(name = "InCrDbInterestDepositProfitsAccountNumber")
    protected String inCrDbInterestDepositProfitsAccountNumber;
    @XmlElement(name = "InCrDbInterestDepositProfitsAccountCd")
    protected short inCrDbInterestDepositProfitsAccountCd;
    @XmlElement(name = "InCrLnsInterestIdInterest")
    protected int inCrLnsInterestIdInterest;
    @XmlElement(name = "InCredGradGenericDetailEntryStatus")
    protected String inCredGradGenericDetailEntryStatus;
    @XmlElement(name = "InCredGradGenericDetailSerialNum")
    protected int inCredGradGenericDetailSerialNum;
    @XmlElement(name = "InCurrencyIdCurrency")
    protected int inCurrencyIdCurrency;
    @XmlElement(name = "InCurrencyShortDescr")
    protected String inCurrencyShortDescr;
    @XmlElement(name = "InCustCategGenericDetailSerialNum")
    protected int inCustCategGenericDetailSerialNum;
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
    @XmlElement(name = "InDepositAccountAccGroup")
    protected int inDepositAccountAccGroup;
    @XmlElement(name = "InDepositAccountAccountLimit", required = true)
    protected BigDecimal inDepositAccountAccountLimit;
    @XmlElement(name = "InDepositAccountAccountType")
    protected String inDepositAccountAccountType;
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
    @XmlElement(name = "InDepositAccountBoePercentance", required = true)
    protected BigDecimal inDepositAccountBoePercentance;
    @XmlElement(name = "InDepositAccountBoeSpread", required = true)
    protected BigDecimal inDepositAccountBoeSpread;
    @XmlElement(name = "InDepositAccountBookNo")
    protected int inDepositAccountBookNo;
    @XmlElement(name = "InDepositAccountCapIncreaseAmn", required = true)
    protected BigDecimal inDepositAccountCapIncreaseAmn;
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
    @XmlElement(name = "InDepositAccountDbIntRtSprdInd")
    protected String inDepositAccountDbIntRtSprdInd;
    @XmlElement(name = "InDepositAccountDbInterRateSpr", required = true)
    protected BigDecimal inDepositAccountDbInterRateSpr;
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
    @XmlElement(name = "InDepositAccountFinalWhldTaxFlg")
    protected String inDepositAccountFinalWhldTaxFlg;
    @XmlElement(name = "InDepositAccountFixedInterFlag")
    protected String inDepositAccountFixedInterFlag;
    @XmlElement(name = "InDepositAccountFixedInterRate", required = true)
    protected BigDecimal inDepositAccountFixedInterRate;
    @XmlElement(name = "InDepositAccountHomeBranch")
    protected String inDepositAccountHomeBranch;
    @XmlElement(name = "InDepositAccountIncomeAmnt", required = true)
    protected BigDecimal inDepositAccountIncomeAmnt;
    @XmlElement(name = "InDepositAccountIncomeFrequency")
    protected int inDepositAccountIncomeFrequency;
    @XmlElement(name = "InDepositAccountInspectionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountInspectionDate;
    @XmlElement(name = "InDepositAccountInterPayOptions")
    protected String inDepositAccountInterPayOptions;
    @XmlElement(name = "InDepositAccountInterestPayInd")
    protected String inDepositAccountInterestPayInd;
    @XmlElement(name = "InDepositAccountKadFlg")
    protected String inDepositAccountKadFlg;
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
    @XmlElement(name = "InDepositAccountOverdraftComment")
    protected String inDepositAccountOverdraftComment;
    @XmlElement(name = "InDepositAccountOverdraftFlg")
    protected String inDepositAccountOverdraftFlg;
    @XmlElement(name = "InDepositAccountOverdraftSpread", required = true)
    protected BigDecimal inDepositAccountOverdraftSpread;
    @XmlElement(name = "InDepositAccountRenewalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountRenewalDate;
    @XmlElement(name = "InDepositAccountRenewalFlag")
    protected String inDepositAccountRenewalFlag;
    @XmlElement(name = "InDepositAccountRestrictAccFlag")
    protected String inDepositAccountRestrictAccFlag;
    @XmlElement(name = "InDepositAccountSecretAccFlag")
    protected String inDepositAccountSecretAccFlag;
    @XmlElement(name = "InDepositAccountServicePenalSpr", required = true)
    protected BigDecimal inDepositAccountServicePenalSpr;
    @XmlElement(name = "InDepositAccountSpecialAccFlg")
    protected String inDepositAccountSpecialAccFlg;
    @XmlElement(name = "InDepositAccountStartDateTd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepositAccountStartDateTd;
    @XmlElement(name = "InDepositAccountStatementIssFreq")
    protected String inDepositAccountStatementIssFreq;
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
    @XmlElement(name = "InDepositAccountWthdrawSpread")
    protected short inDepositAccountWthdrawSpread;
    @XmlElement(name = "InFixedOneAccLnsInterestDurationUnit")
    protected String inFixedOneAccLnsInterestDurationUnit;
    @XmlElement(name = "InFixedOneAccLnsInterestIdInterest")
    protected int inFixedOneAccLnsInterestIdInterest;
    @XmlElement(name = "InFixedOneAccLnsInterestIntDuration")
    protected short inFixedOneAccLnsInterestIntDuration;
    @XmlElement(name = "InGrpOwners")
    protected ArrayOfD0301VInGrpOwnersItem inGrpOwners;
    @XmlElement(name = "InHouseUnitCode")
    protected int inHouseUnitCode;
    @XmlElement(name = "InIssueOfficeUnitCode")
    protected int inIssueOfficeUnitCode;
    @XmlElement(name = "InIssueOfficeUnitUnitName")
    protected String inIssueOfficeUnitUnitName;
    @XmlElement(name = "InKekGenericDetailSerialNum")
    protected int inKekGenericDetailSerialNum;
    @XmlElement(name = "InLoanAccountRecyclingFrequency")
    protected short inLoanAccountRecyclingFrequency;
    @XmlElement(name = "InLpurpGenericDetailEntryStatus")
    protected String inLpurpGenericDetailEntryStatus;
    @XmlElement(name = "InLpurpGenericDetailSerialNum")
    protected int inLpurpGenericDetailSerialNum;
    @XmlElement(name = "InMainProfitsAccountAccStatus")
    protected String inMainProfitsAccountAccStatus;
    @XmlElement(name = "InMainProfitsAccountAccountCd")
    protected short inMainProfitsAccountAccountCd;
    @XmlElement(name = "InMainProfitsAccountAccountNumber")
    protected String inMainProfitsAccountAccountNumber;
    @XmlElement(name = "InMainProfitsAccountAgreementProfitsAccountNumber")
    protected String inMainProfitsAccountAgreementProfitsAccountNumber;
    @XmlElement(name = "InMainProfitsAccountAgreementProfitsAccountCd")
    protected short inMainProfitsAccountAgreementProfitsAccountCd;
    @XmlElement(name = "InMainProfitsAccountCDigit")
    protected short inMainProfitsAccountCDigit;
    @XmlElement(name = "InMainProfitsAccountCustId")
    protected int inMainProfitsAccountCustId;
    @XmlElement(name = "InMainProfitsAccountDepProfitsAccountNumber")
    protected String inMainProfitsAccountDepProfitsAccountNumber;
    @XmlElement(name = "InMainProfitsAccountDepProfitsAccountCd")
    protected short inMainProfitsAccountDepProfitsAccountCd;
    @XmlElement(name = "InMainProfitsAccountDepOpenUnit")
    protected int inMainProfitsAccountDepOpenUnit;
    @XmlElement(name = "InMainProfitsAccountGenericAccountNo")
    protected String inMainProfitsAccountGenericAccountNo;
    @XmlElement(name = "InMainProfitsAccountLgProfitsAccountNumber")
    protected String inMainProfitsAccountLgProfitsAccountNumber;
    @XmlElement(name = "InMainProfitsAccountLgProfitsAccountCd")
    protected short inMainProfitsAccountLgProfitsAccountCd;
    @XmlElement(name = "InMainProfitsAccountLgOpenUnit")
    protected int inMainProfitsAccountLgOpenUnit;
    @XmlElement(name = "InMainProfitsAccountLimitCurrency")
    protected int inMainProfitsAccountLimitCurrency;
    @XmlElement(name = "InMainProfitsAccountLnsProfitsAccountNumber")
    protected String inMainProfitsAccountLnsProfitsAccountNumber;
    @XmlElement(name = "InMainProfitsAccountLnsProfitsAccountCd")
    protected short inMainProfitsAccountLnsProfitsAccountCd;
    @XmlElement(name = "InMainProfitsAccountMonotoringUnit")
    protected int inMainProfitsAccountMonotoringUnit;
    @XmlElement(name = "InMainProfitsAccountMovementCurrency")
    protected int inMainProfitsAccountMovementCurrency;
    @XmlElement(name = "InMainProfitsAccountPrftSystem")
    protected short inMainProfitsAccountPrftSystem;
    @XmlElement(name = "InMainProfitsAccountProductId")
    protected int inMainProfitsAccountProductId;
    @XmlElement(name = "InMainProfitsAccountTrOpenUnit")
    protected int inMainProfitsAccountTrOpenUnit;
    @XmlElement(name = "InMainProfitsAccountTrSn")
    protected int inMainProfitsAccountTrSn;
    @XmlElement(name = "InMainProfitsAccountTrType")
    protected short inMainProfitsAccountTrType;
    @XmlElement(name = "InMainProfitsAccountWfeDetail")
    protected double inMainProfitsAccountWfeDetail;
    @XmlElement(name = "InMainProfitsAccountWfeHeader")
    protected double inMainProfitsAccountWfeHeader;
    @XmlElement(name = "InMainProfitsAccountWfsDetail")
    protected double inMainProfitsAccountWfsDetail;
    @XmlElement(name = "InMainProfitsAccountWfsHeader")
    protected double inMainProfitsAccountWfsHeader;
    @XmlElement(name = "InOldDepositAccountProfitsAccountNumber")
    protected String inOldDepositAccountProfitsAccountNumber;
    @XmlElement(name = "InOldDepositAccountProfitsAccountCd")
    protected short inOldDepositAccountProfitsAccountCd;
    @XmlElement(name = "InOldDepositAccountDesignation")
    protected String inOldDepositAccountDesignation;
    @XmlElement(name = "InPackageIdPackage")
    protected int inPackageIdPackage;
    @XmlElement(name = "InParametersInTerminalTerminalNumber")
    protected String inParametersInTerminalTerminalNumber;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InProductIdProduct")
    protected int inProductIdProduct;
    @XmlElement(name = "InSalePersonGenericDetailShortDescription")
    protected String inSalePersonGenericDetailShortDescription;
    @XmlElement(name = "InSaleUnitGenericDetailSerialNum")
    protected int inSaleUnitGenericDetailSerialNum;
    @XmlElement(name = "InSecondCredIntLnsInterestDescription")
    protected String inSecondCredIntLnsInterestDescription;
    @XmlElement(name = "InSecondCredIntLnsInterestIdInterest")
    protected int inSecondCredIntLnsInterestIdInterest;
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
    @XmlElement(name = "InUnutilPenLnsCommissionIdCommission")
    protected int inUnutilPenLnsCommissionIdCommission;
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
    @XmlElement(name = "InDepositAccountRefereeNameIefSuppliedChar100")
    protected String inDepositAccountRefereeNameIefSuppliedChar100;
    @XmlElement(name = "InDepositAccountRefereeAccnoIefSuppliedChar100")
    protected String inDepositAccountRefereeAccnoIefSuppliedChar100;
    @XmlElement(name = "InDepositAccountFreeText3IefSuppliedChar100")
    protected String inDepositAccountFreeText3IefSuppliedChar100;
    @XmlElement(name = "InDepositAccountFreeText4IefSuppliedChar100")
    protected String inDepositAccountFreeText4IefSuppliedChar100;
    @XmlElement(name = "InDepositAccountFreeText5IefSuppliedChar100")
    protected String inDepositAccountFreeText5IefSuppliedChar100;
    @XmlElement(name = "InCrmCodeGenericDetailSerialNum")
    protected int inCrmCodeGenericDetailSerialNum;
    @XmlElement(name = "InParametersInUnitCode")
    protected int inParametersInUnitCode;

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
     * Gets the value of the inAccTypeGenericDetailSerialNum property.
     * 
     */
    public int getInAccTypeGenericDetailSerialNum() {
        return inAccTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inAccTypeGenericDetailSerialNum property.
     * 
     */
    public void setInAccTypeGenericDetailSerialNum(int value) {
        this.inAccTypeGenericDetailSerialNum = value;
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
     * Gets the value of the inAgreementAgrLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInAgreementAgrLimit() {
        return inAgreementAgrLimit;
    }

    /**
     * Sets the value of the inAgreementAgrLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInAgreementAgrLimit(BigDecimal value) {
        this.inAgreementAgrLimit = value;
    }

    /**
     * Gets the value of the inAgreementAgrStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAgreementAgrStatus() {
        return inAgreementAgrStatus;
    }

    /**
     * Sets the value of the inAgreementAgrStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAgreementAgrStatus(String value) {
        this.inAgreementAgrStatus = value;
    }

    /**
     * Gets the value of the inAgreementAgrUtilisedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInAgreementAgrUtilisedLimit() {
        return inAgreementAgrUtilisedLimit;
    }

    /**
     * Sets the value of the inAgreementAgrUtilisedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInAgreementAgrUtilisedLimit(BigDecimal value) {
        this.inAgreementAgrUtilisedLimit = value;
    }

    /**
     * Gets the value of the inAgreementTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInAgreementTmstamp() {
        return inAgreementTmstamp;
    }

    /**
     * Sets the value of the inAgreementTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInAgreementTmstamp(XMLGregorianCalendar value) {
        this.inAgreementTmstamp = value;
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
     * Gets the value of the inBankemployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBankemployeeId() {
        return inBankemployeeId;
    }

    /**
     * Sets the value of the inBankemployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBankemployeeId(String value) {
        this.inBankemployeeId = value;
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
     * Gets the value of the inCoben1CustomerCDigit property.
     * 
     */
    public short getInCoben1CustomerCDigit() {
        return inCoben1CustomerCDigit;
    }

    /**
     * Sets the value of the inCoben1CustomerCDigit property.
     * 
     */
    public void setInCoben1CustomerCDigit(short value) {
        this.inCoben1CustomerCDigit = value;
    }

    /**
     * Gets the value of the inCoben1CustomerCustId property.
     * 
     */
    public int getInCoben1CustomerCustId() {
        return inCoben1CustomerCustId;
    }

    /**
     * Sets the value of the inCoben1CustomerCustId property.
     * 
     */
    public void setInCoben1CustomerCustId(int value) {
        this.inCoben1CustomerCustId = value;
    }

    /**
     * Gets the value of the inCoben2CustomerCDigit property.
     * 
     */
    public short getInCoben2CustomerCDigit() {
        return inCoben2CustomerCDigit;
    }

    /**
     * Sets the value of the inCoben2CustomerCDigit property.
     * 
     */
    public void setInCoben2CustomerCDigit(short value) {
        this.inCoben2CustomerCDigit = value;
    }

    /**
     * Gets the value of the inCoben2CustomerCustId property.
     * 
     */
    public int getInCoben2CustomerCustId() {
        return inCoben2CustomerCustId;
    }

    /**
     * Sets the value of the inCoben2CustomerCustId property.
     * 
     */
    public void setInCoben2CustomerCustId(int value) {
        this.inCoben2CustomerCustId = value;
    }

    /**
     * Gets the value of the inCoben3CustomerCDigit property.
     * 
     */
    public short getInCoben3CustomerCDigit() {
        return inCoben3CustomerCDigit;
    }

    /**
     * Sets the value of the inCoben3CustomerCDigit property.
     * 
     */
    public void setInCoben3CustomerCDigit(short value) {
        this.inCoben3CustomerCDigit = value;
    }

    /**
     * Gets the value of the inCoben3CustomerCustId property.
     * 
     */
    public int getInCoben3CustomerCustId() {
        return inCoben3CustomerCustId;
    }

    /**
     * Sets the value of the inCoben3CustomerCustId property.
     * 
     */
    public void setInCoben3CustomerCustId(int value) {
        this.inCoben3CustomerCustId = value;
    }

    /**
     * Gets the value of the inCoben4CustomerCDigit property.
     * 
     */
    public short getInCoben4CustomerCDigit() {
        return inCoben4CustomerCDigit;
    }

    /**
     * Sets the value of the inCoben4CustomerCDigit property.
     * 
     */
    public void setInCoben4CustomerCDigit(short value) {
        this.inCoben4CustomerCDigit = value;
    }

    /**
     * Gets the value of the inCoben4CustomerCustId property.
     * 
     */
    public int getInCoben4CustomerCustId() {
        return inCoben4CustomerCustId;
    }

    /**
     * Sets the value of the inCoben4CustomerCustId property.
     * 
     */
    public void setInCoben4CustomerCustId(int value) {
        this.inCoben4CustomerCustId = value;
    }

    /**
     * Gets the value of the inCoben5CustomerCDigit property.
     * 
     */
    public short getInCoben5CustomerCDigit() {
        return inCoben5CustomerCDigit;
    }

    /**
     * Sets the value of the inCoben5CustomerCDigit property.
     * 
     */
    public void setInCoben5CustomerCDigit(short value) {
        this.inCoben5CustomerCDigit = value;
    }

    /**
     * Gets the value of the inCoben5CustomerCustId property.
     * 
     */
    public int getInCoben5CustomerCustId() {
        return inCoben5CustomerCustId;
    }

    /**
     * Sets the value of the inCoben5CustomerCustId property.
     * 
     */
    public void setInCoben5CustomerCustId(int value) {
        this.inCoben5CustomerCustId = value;
    }

    /**
     * Gets the value of the inCobenSnCustAddressSerialNum property.
     * 
     */
    public short getInCobenSnCustAddressSerialNum() {
        return inCobenSnCustAddressSerialNum;
    }

    /**
     * Sets the value of the inCobenSnCustAddressSerialNum property.
     * 
     */
    public void setInCobenSnCustAddressSerialNum(short value) {
        this.inCobenSnCustAddressSerialNum = value;
    }

    /**
     * Gets the value of the inCrDbInterestDepositProfitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCrDbInterestDepositProfitsAccountNumber() {
        return inCrDbInterestDepositProfitsAccountNumber;
    }

    /**
     * Sets the value of the inCrDbInterestDepositProfitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCrDbInterestDepositProfitsAccountNumber(String value) {
        this.inCrDbInterestDepositProfitsAccountNumber = value;
    }

    /**
     * Gets the value of the inCrDbInterestDepositProfitsAccountCd property.
     * 
     */
    public short getInCrDbInterestDepositProfitsAccountCd() {
        return inCrDbInterestDepositProfitsAccountCd;
    }

    /**
     * Sets the value of the inCrDbInterestDepositProfitsAccountCd property.
     * 
     */
    public void setInCrDbInterestDepositProfitsAccountCd(short value) {
        this.inCrDbInterestDepositProfitsAccountCd = value;
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
     * Gets the value of the inCredGradGenericDetailEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCredGradGenericDetailEntryStatus() {
        return inCredGradGenericDetailEntryStatus;
    }

    /**
     * Sets the value of the inCredGradGenericDetailEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCredGradGenericDetailEntryStatus(String value) {
        this.inCredGradGenericDetailEntryStatus = value;
    }

    /**
     * Gets the value of the inCredGradGenericDetailSerialNum property.
     * 
     */
    public int getInCredGradGenericDetailSerialNum() {
        return inCredGradGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inCredGradGenericDetailSerialNum property.
     * 
     */
    public void setInCredGradGenericDetailSerialNum(int value) {
        this.inCredGradGenericDetailSerialNum = value;
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
     * Gets the value of the inCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCurrencyShortDescr() {
        return inCurrencyShortDescr;
    }

    /**
     * Sets the value of the inCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCurrencyShortDescr(String value) {
        this.inCurrencyShortDescr = value;
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
     * Gets the value of the inDepositAccountOverdraftFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountOverdraftFlg() {
        return inDepositAccountOverdraftFlg;
    }

    /**
     * Sets the value of the inDepositAccountOverdraftFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountOverdraftFlg(String value) {
        this.inDepositAccountOverdraftFlg = value;
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
     * Gets the value of the inGrpOwners property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfD0301VInGrpOwnersItem }
     *     
     */
    public ArrayOfD0301VInGrpOwnersItem getInGrpOwners() {
        return inGrpOwners;
    }

    /**
     * Sets the value of the inGrpOwners property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfD0301VInGrpOwnersItem }
     *     
     */
    public void setInGrpOwners(ArrayOfD0301VInGrpOwnersItem value) {
        this.inGrpOwners = value;
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
     * Gets the value of the inMainProfitsAccountAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMainProfitsAccountAccStatus() {
        return inMainProfitsAccountAccStatus;
    }

    /**
     * Sets the value of the inMainProfitsAccountAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMainProfitsAccountAccStatus(String value) {
        this.inMainProfitsAccountAccStatus = value;
    }

    /**
     * Gets the value of the inMainProfitsAccountAccountCd property.
     * 
     */
    public short getInMainProfitsAccountAccountCd() {
        return inMainProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inMainProfitsAccountAccountCd property.
     * 
     */
    public void setInMainProfitsAccountAccountCd(short value) {
        this.inMainProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inMainProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMainProfitsAccountAccountNumber() {
        return inMainProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inMainProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMainProfitsAccountAccountNumber(String value) {
        this.inMainProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inMainProfitsAccountAgreementProfitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMainProfitsAccountAgreementProfitsAccountNumber() {
        return inMainProfitsAccountAgreementProfitsAccountNumber;
    }

    /**
     * Sets the value of the inMainProfitsAccountAgreementProfitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMainProfitsAccountAgreementProfitsAccountNumber(String value) {
        this.inMainProfitsAccountAgreementProfitsAccountNumber = value;
    }

    /**
     * Gets the value of the inMainProfitsAccountAgreementProfitsAccountCd property.
     * 
     */
    public short getInMainProfitsAccountAgreementProfitsAccountCd() {
        return inMainProfitsAccountAgreementProfitsAccountCd;
    }

    /**
     * Sets the value of the inMainProfitsAccountAgreementProfitsAccountCd property.
     * 
     */
    public void setInMainProfitsAccountAgreementProfitsAccountCd(short value) {
        this.inMainProfitsAccountAgreementProfitsAccountCd = value;
    }

    /**
     * Gets the value of the inMainProfitsAccountCDigit property.
     * 
     */
    public short getInMainProfitsAccountCDigit() {
        return inMainProfitsAccountCDigit;
    }

    /**
     * Sets the value of the inMainProfitsAccountCDigit property.
     * 
     */
    public void setInMainProfitsAccountCDigit(short value) {
        this.inMainProfitsAccountCDigit = value;
    }

    /**
     * Gets the value of the inMainProfitsAccountCustId property.
     * 
     */
    public int getInMainProfitsAccountCustId() {
        return inMainProfitsAccountCustId;
    }

    /**
     * Sets the value of the inMainProfitsAccountCustId property.
     * 
     */
    public void setInMainProfitsAccountCustId(int value) {
        this.inMainProfitsAccountCustId = value;
    }

    /**
     * Gets the value of the inMainProfitsAccountDepProfitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMainProfitsAccountDepProfitsAccountNumber() {
        return inMainProfitsAccountDepProfitsAccountNumber;
    }

    /**
     * Sets the value of the inMainProfitsAccountDepProfitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMainProfitsAccountDepProfitsAccountNumber(String value) {
        this.inMainProfitsAccountDepProfitsAccountNumber = value;
    }

    /**
     * Gets the value of the inMainProfitsAccountDepProfitsAccountCd property.
     * 
     */
    public short getInMainProfitsAccountDepProfitsAccountCd() {
        return inMainProfitsAccountDepProfitsAccountCd;
    }

    /**
     * Sets the value of the inMainProfitsAccountDepProfitsAccountCd property.
     * 
     */
    public void setInMainProfitsAccountDepProfitsAccountCd(short value) {
        this.inMainProfitsAccountDepProfitsAccountCd = value;
    }

    /**
     * Gets the value of the inMainProfitsAccountDepOpenUnit property.
     * 
     */
    public int getInMainProfitsAccountDepOpenUnit() {
        return inMainProfitsAccountDepOpenUnit;
    }

    /**
     * Sets the value of the inMainProfitsAccountDepOpenUnit property.
     * 
     */
    public void setInMainProfitsAccountDepOpenUnit(int value) {
        this.inMainProfitsAccountDepOpenUnit = value;
    }

    /**
     * Gets the value of the inMainProfitsAccountGenericAccountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMainProfitsAccountGenericAccountNo() {
        return inMainProfitsAccountGenericAccountNo;
    }

    /**
     * Sets the value of the inMainProfitsAccountGenericAccountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMainProfitsAccountGenericAccountNo(String value) {
        this.inMainProfitsAccountGenericAccountNo = value;
    }

    /**
     * Gets the value of the inMainProfitsAccountLgProfitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMainProfitsAccountLgProfitsAccountNumber() {
        return inMainProfitsAccountLgProfitsAccountNumber;
    }

    /**
     * Sets the value of the inMainProfitsAccountLgProfitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMainProfitsAccountLgProfitsAccountNumber(String value) {
        this.inMainProfitsAccountLgProfitsAccountNumber = value;
    }

    /**
     * Gets the value of the inMainProfitsAccountLgProfitsAccountCd property.
     * 
     */
    public short getInMainProfitsAccountLgProfitsAccountCd() {
        return inMainProfitsAccountLgProfitsAccountCd;
    }

    /**
     * Sets the value of the inMainProfitsAccountLgProfitsAccountCd property.
     * 
     */
    public void setInMainProfitsAccountLgProfitsAccountCd(short value) {
        this.inMainProfitsAccountLgProfitsAccountCd = value;
    }

    /**
     * Gets the value of the inMainProfitsAccountLgOpenUnit property.
     * 
     */
    public int getInMainProfitsAccountLgOpenUnit() {
        return inMainProfitsAccountLgOpenUnit;
    }

    /**
     * Sets the value of the inMainProfitsAccountLgOpenUnit property.
     * 
     */
    public void setInMainProfitsAccountLgOpenUnit(int value) {
        this.inMainProfitsAccountLgOpenUnit = value;
    }

    /**
     * Gets the value of the inMainProfitsAccountLimitCurrency property.
     * 
     */
    public int getInMainProfitsAccountLimitCurrency() {
        return inMainProfitsAccountLimitCurrency;
    }

    /**
     * Sets the value of the inMainProfitsAccountLimitCurrency property.
     * 
     */
    public void setInMainProfitsAccountLimitCurrency(int value) {
        this.inMainProfitsAccountLimitCurrency = value;
    }

    /**
     * Gets the value of the inMainProfitsAccountLnsProfitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMainProfitsAccountLnsProfitsAccountNumber() {
        return inMainProfitsAccountLnsProfitsAccountNumber;
    }

    /**
     * Sets the value of the inMainProfitsAccountLnsProfitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMainProfitsAccountLnsProfitsAccountNumber(String value) {
        this.inMainProfitsAccountLnsProfitsAccountNumber = value;
    }

    /**
     * Gets the value of the inMainProfitsAccountLnsProfitsAccountCd property.
     * 
     */
    public short getInMainProfitsAccountLnsProfitsAccountCd() {
        return inMainProfitsAccountLnsProfitsAccountCd;
    }

    /**
     * Sets the value of the inMainProfitsAccountLnsProfitsAccountCd property.
     * 
     */
    public void setInMainProfitsAccountLnsProfitsAccountCd(short value) {
        this.inMainProfitsAccountLnsProfitsAccountCd = value;
    }

    /**
     * Gets the value of the inMainProfitsAccountMonotoringUnit property.
     * 
     */
    public int getInMainProfitsAccountMonotoringUnit() {
        return inMainProfitsAccountMonotoringUnit;
    }

    /**
     * Sets the value of the inMainProfitsAccountMonotoringUnit property.
     * 
     */
    public void setInMainProfitsAccountMonotoringUnit(int value) {
        this.inMainProfitsAccountMonotoringUnit = value;
    }

    /**
     * Gets the value of the inMainProfitsAccountMovementCurrency property.
     * 
     */
    public int getInMainProfitsAccountMovementCurrency() {
        return inMainProfitsAccountMovementCurrency;
    }

    /**
     * Sets the value of the inMainProfitsAccountMovementCurrency property.
     * 
     */
    public void setInMainProfitsAccountMovementCurrency(int value) {
        this.inMainProfitsAccountMovementCurrency = value;
    }

    /**
     * Gets the value of the inMainProfitsAccountPrftSystem property.
     * 
     */
    public short getInMainProfitsAccountPrftSystem() {
        return inMainProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inMainProfitsAccountPrftSystem property.
     * 
     */
    public void setInMainProfitsAccountPrftSystem(short value) {
        this.inMainProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inMainProfitsAccountProductId property.
     * 
     */
    public int getInMainProfitsAccountProductId() {
        return inMainProfitsAccountProductId;
    }

    /**
     * Sets the value of the inMainProfitsAccountProductId property.
     * 
     */
    public void setInMainProfitsAccountProductId(int value) {
        this.inMainProfitsAccountProductId = value;
    }

    /**
     * Gets the value of the inMainProfitsAccountTrOpenUnit property.
     * 
     */
    public int getInMainProfitsAccountTrOpenUnit() {
        return inMainProfitsAccountTrOpenUnit;
    }

    /**
     * Sets the value of the inMainProfitsAccountTrOpenUnit property.
     * 
     */
    public void setInMainProfitsAccountTrOpenUnit(int value) {
        this.inMainProfitsAccountTrOpenUnit = value;
    }

    /**
     * Gets the value of the inMainProfitsAccountTrSn property.
     * 
     */
    public int getInMainProfitsAccountTrSn() {
        return inMainProfitsAccountTrSn;
    }

    /**
     * Sets the value of the inMainProfitsAccountTrSn property.
     * 
     */
    public void setInMainProfitsAccountTrSn(int value) {
        this.inMainProfitsAccountTrSn = value;
    }

    /**
     * Gets the value of the inMainProfitsAccountTrType property.
     * 
     */
    public short getInMainProfitsAccountTrType() {
        return inMainProfitsAccountTrType;
    }

    /**
     * Sets the value of the inMainProfitsAccountTrType property.
     * 
     */
    public void setInMainProfitsAccountTrType(short value) {
        this.inMainProfitsAccountTrType = value;
    }

    /**
     * Gets the value of the inMainProfitsAccountWfeDetail property.
     * 
     */
    public double getInMainProfitsAccountWfeDetail() {
        return inMainProfitsAccountWfeDetail;
    }

    /**
     * Sets the value of the inMainProfitsAccountWfeDetail property.
     * 
     */
    public void setInMainProfitsAccountWfeDetail(double value) {
        this.inMainProfitsAccountWfeDetail = value;
    }

    /**
     * Gets the value of the inMainProfitsAccountWfeHeader property.
     * 
     */
    public double getInMainProfitsAccountWfeHeader() {
        return inMainProfitsAccountWfeHeader;
    }

    /**
     * Sets the value of the inMainProfitsAccountWfeHeader property.
     * 
     */
    public void setInMainProfitsAccountWfeHeader(double value) {
        this.inMainProfitsAccountWfeHeader = value;
    }

    /**
     * Gets the value of the inMainProfitsAccountWfsDetail property.
     * 
     */
    public double getInMainProfitsAccountWfsDetail() {
        return inMainProfitsAccountWfsDetail;
    }

    /**
     * Sets the value of the inMainProfitsAccountWfsDetail property.
     * 
     */
    public void setInMainProfitsAccountWfsDetail(double value) {
        this.inMainProfitsAccountWfsDetail = value;
    }

    /**
     * Gets the value of the inMainProfitsAccountWfsHeader property.
     * 
     */
    public double getInMainProfitsAccountWfsHeader() {
        return inMainProfitsAccountWfsHeader;
    }

    /**
     * Sets the value of the inMainProfitsAccountWfsHeader property.
     * 
     */
    public void setInMainProfitsAccountWfsHeader(double value) {
        this.inMainProfitsAccountWfsHeader = value;
    }

    /**
     * Gets the value of the inOldDepositAccountProfitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOldDepositAccountProfitsAccountNumber() {
        return inOldDepositAccountProfitsAccountNumber;
    }

    /**
     * Sets the value of the inOldDepositAccountProfitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOldDepositAccountProfitsAccountNumber(String value) {
        this.inOldDepositAccountProfitsAccountNumber = value;
    }

    /**
     * Gets the value of the inOldDepositAccountProfitsAccountCd property.
     * 
     */
    public short getInOldDepositAccountProfitsAccountCd() {
        return inOldDepositAccountProfitsAccountCd;
    }

    /**
     * Sets the value of the inOldDepositAccountProfitsAccountCd property.
     * 
     */
    public void setInOldDepositAccountProfitsAccountCd(short value) {
        this.inOldDepositAccountProfitsAccountCd = value;
    }

    /**
     * Gets the value of the inOldDepositAccountDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOldDepositAccountDesignation() {
        return inOldDepositAccountDesignation;
    }

    /**
     * Sets the value of the inOldDepositAccountDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOldDepositAccountDesignation(String value) {
        this.inOldDepositAccountDesignation = value;
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
     * Gets the value of the inProductIdProduct property.
     * 
     */
    public int getInProductIdProduct() {
        return inProductIdProduct;
    }

    /**
     * Sets the value of the inProductIdProduct property.
     * 
     */
    public void setInProductIdProduct(int value) {
        this.inProductIdProduct = value;
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
     * Gets the value of the inSecondCredIntLnsInterestDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSecondCredIntLnsInterestDescription() {
        return inSecondCredIntLnsInterestDescription;
    }

    /**
     * Sets the value of the inSecondCredIntLnsInterestDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSecondCredIntLnsInterestDescription(String value) {
        this.inSecondCredIntLnsInterestDescription = value;
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
     * Gets the value of the inUnutilPenLnsCommissionIdCommission property.
     * 
     */
    public int getInUnutilPenLnsCommissionIdCommission() {
        return inUnutilPenLnsCommissionIdCommission;
    }

    /**
     * Sets the value of the inUnutilPenLnsCommissionIdCommission property.
     * 
     */
    public void setInUnutilPenLnsCommissionIdCommission(int value) {
        this.inUnutilPenLnsCommissionIdCommission = value;
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
     * Gets the value of the inDepositAccountRefereeNameIefSuppliedChar100 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountRefereeNameIefSuppliedChar100() {
        return inDepositAccountRefereeNameIefSuppliedChar100;
    }

    /**
     * Sets the value of the inDepositAccountRefereeNameIefSuppliedChar100 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountRefereeNameIefSuppliedChar100(String value) {
        this.inDepositAccountRefereeNameIefSuppliedChar100 = value;
    }

    /**
     * Gets the value of the inDepositAccountRefereeAccnoIefSuppliedChar100 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountRefereeAccnoIefSuppliedChar100() {
        return inDepositAccountRefereeAccnoIefSuppliedChar100;
    }

    /**
     * Sets the value of the inDepositAccountRefereeAccnoIefSuppliedChar100 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountRefereeAccnoIefSuppliedChar100(String value) {
        this.inDepositAccountRefereeAccnoIefSuppliedChar100 = value;
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
     * Gets the value of the inParametersInUnitCode property.
     * 
     */
    public int getInParametersInUnitCode() {
        return inParametersInUnitCode;
    }

    /**
     * Sets the value of the inParametersInUnitCode property.
     * 
     */
    public void setInParametersInUnitCode(int value) {
        this.inParametersInUnitCode = value;
    }

}
