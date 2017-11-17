
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DepositAccountRetrieveExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepositAccountRetrieveExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="CustomerLnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAccTypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAccTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAccUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAccUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAccWithdrDepositAccountAvailableBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAchBnkCollaborationBanksAchBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAchBnkCollaborationBanksBankId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAchBnkCollaborationBanksBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAchBnkCollaborationBanksEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAddExcesLnsInterestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAddExcesLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgrProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgrUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutAvgBaDepAccountTotalTotalProducts01" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAvgBal12mthFdTdDepAccountTotalTotalProducts01" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAvgBalCurrYearDepAccountTotalTotalProducts01" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAvgBalPrevYearDepAccountTotalTotalProducts01" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAvgBalPrevYearFdTdDepAccountTotalTotalProducts01" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBlockIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBlockIefSuppliedText40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBlockUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCancelIefSuppliedCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCapitalDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutCapitalDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCcodeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCcodeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCoben2CustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCoben2CustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCoben2CustomerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCoben2LnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCoben3CustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCoben3CustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCoben3CustomerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCoben3LnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCoben4CustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCoben4CustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCoben4CustomerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCoben4LnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCoben5CustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCoben5CustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCoben5CustomerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCoben5LnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCoben6CustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCoben6CustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCoben6LnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCoben7CustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCoben7CustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCoben7LnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCoben8CustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCoben8CustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCoben8LnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCoben9CustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCoben9CustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCoben9LnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCrDbCapitalProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCrDbInterestProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCrHintScalePercentage00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCrLnsInterestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCrLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCredGradGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCredGradGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCurrTimePrintLineDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCurrTimePrintLineTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddInfoInsuranceEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustAddressSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustCategGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustCategGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustomerCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDbCrInterDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutDbCrInterDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDbHintScalePercentage00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDbIntHintScalePercentage00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDbLnsInterestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDbLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepAccountInfoCurFxIntExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDepAccountInfoCurFxIntStDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDepAccountInfoOaCollectFreq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepAccountInfoOaCollFreqUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepAccountInfoOaDuration" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepAccountInfoOaDurationUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepMntRecordingTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepositChangeSpreadFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositChequeBookFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositOverdraftLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountAccGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepositAccountAccountLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutDepositAccountAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountAccrCrInterest" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountAccrDbInterest" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountAccrN128Inter" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountAkflag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountAnnounceTolDays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepositAccountApprChqAdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDepositAccountApprChqCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepositAccountApprChqEdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDepositAccountApprChqNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountApprChqPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountAtmCardFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountAutomChequeOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountAvailableBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountBalanceInterFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountBenefAddressSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepositAccountBlockedBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountBlockedStsExpiry" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDepositAccountBoePercentance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountBoeSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountBondNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutDepositAccountBookBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountBookNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepositAccountCapIncreaseAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepositAccountChequeBooksCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepositAccountChequesAnncCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepositAccountChequesBadCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepositAccountChequesBadTotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountChequesItemCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepositAccountChequesPaidCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepositAccountChequesPanncCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepositAccountChequesPstampCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepositAccountChequesRstampCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepositAccountChequesSanncCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepositAccountChequesSstampCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepositAccountChequesStampCoun" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepositAccountChequesUsedCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepositAccountClosingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDepositAccountCobenefCount" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepositAccountCobenefCountIns" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepositAccountCobenefSnMail" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepositAccountColInsertionDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDepositAccountCollateralFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountCorrespAccInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountCrInterRateSpr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountCrIntRtSprdInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountDbInterRateSpr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountDbIntRtSprdInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountDefiniteDelay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountDepositType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountDrawDownWxpDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDepositAccountDurationUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountDurationValue" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepositAccountEncroachTolerance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountExpCrIntSprd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDepositAccountExpDbIntSprd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDepositAccountExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDepositAccountExpiryDateTd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDepositAccountExternalAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountExtraitPrintDay" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepositAccountFinalWhldTaxFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountFixedInterFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountFixedInterRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountForecastBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountHomeBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountIncomeAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountIncomeFrequency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepositAccountInitCrBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountInitDbBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountInitValueBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountInspectionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDepositAccountInterestPayInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountInterestToWithdr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountInterPayOptions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountLastBatchDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDepositAccountLastIntAvgBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountLastIntAvgCr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountLastIntAvgDb" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountLastModifyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDepositAccountLastTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDepositAccountLastTrxId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepositAccountManualMigrateFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountMultiSalaryAmnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepositAccountNostroAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountNotifSpreadDayB" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepositAccountNotifSpreadDays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepositAccountOfficeAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountOldAccNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountOpeningDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDepositAccountOverdraftComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountOverdraftExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDepositAccountOverdraftRenewalCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepositAccountOverdraftRenewalDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDepositAccountOverdraftRenewalFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountOverdraftRenewalUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountOverdraftSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountPassbookFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountPsbLastBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountPsbLastPrintLn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepositAccountPsbLostInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountPsbSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepositAccountRenewalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDepositAccountRenewalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountRenewalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepositAccountRestrictAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountRetainingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDepositAccountSecretAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountServicePenalSpr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountSpecAgrPenFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountSpecAgrTrxFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountSpecialAccFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountStartDateTd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDepositAccountStatementIssFreq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountTargetFlg" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepositAccountTdBatchExtrtFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountTdInterPercentChg" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountTdInterSprdChg" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountTelebankingFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountTempExcEndDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDepositAccountTempExcStartDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDepositAccountTemporaryExcess" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountThirdpartyInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountTimestmp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDepositAccountUnclearBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountUnclearWithdrFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountUnutilLimitPenD" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountValidChqDuration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepositAccountWithdrawAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountWthdrawSpread" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepSwiftParticipCounterYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepSwiftParticipCtiMt940" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepSwiftParticipCtiMt9401" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepSwiftParticipCtiMt9402" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepSwiftParticipCtiMt9403" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepSwiftParticipCtiMt9404" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepSwiftParticipLast940SgCntr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepSwiftParticipLast940SwCntr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepSwiftParticipLast942SgCntr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepSwiftParticipLast950SwCntr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepSwiftParticipLastBalanceMt942" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepSwiftParticipLastCtiMt940" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutDepSwiftParticipLastEntrySerNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepSwiftParticipLastTmstampMt942" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDepSwiftParticipLastTransSerNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepSwiftParticipReceiverSwiftId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepSwiftParticipReceiverSwiftId1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepSwiftParticipReceiverSwiftId2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepSwiftParticipReceiverSwiftId3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepSwiftParticipReceiverSwiftId4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepSwiftParticipSenderSwiftId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepSwiftParticipSogecashMt940" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepSwiftParticipSogecashMt9401" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepSwiftParticipSogecashMt9402" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepSwiftParticipSogecashMt9403" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepSwiftParticipSogecashMt9404" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepSwiftParticipSogecashMt942" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepSwiftParticipSogecashMt9421" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepSwiftParticipSogecashMt9422" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepSwiftParticipSogecashMt9423" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepSwiftParticipSogecashMt9424" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepSwiftParticipSwiftMt940" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepSwiftParticipSwiftMt9401" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepSwiftParticipSwiftMt9402" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepSwiftParticipSwiftMt9403" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepSwiftParticipSwiftMt9404" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepSwiftParticipSwiftMt950" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepSwiftParticipSwiftMt9501" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepSwiftParticipSwiftMt9502" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepSwiftParticipSwiftMt9503" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepSwiftParticipSwiftMt9504" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepSwiftParticipSwiftStBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepSwiftParticipSwiftStDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDepSwiftParticipTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDpPsbLostHistBookBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDpPsbLostHistPsbLastPrintLn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDpPsbLostHistPsbLostComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDpPsbLostHistPsbLostSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDpPsbLostHistTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutEconomForFifthCustGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutEconomForFourthCustGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutEconomForSecCustGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutEconomForThirdCustGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutEconomyGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEconomyGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutFifthCustCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFifthCustCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFifthCustCustAddressEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFifthCustCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFifthCustOtherAfmAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFifthCustOtherAfmMainFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFifthOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFifthOtherIdMainFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFinalCrHintScalePercentage00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFinalDbHintScalePercentage00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFinalExcIntHintScalePercentage00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFinalN128HintScalePercentage00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFirstCustCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFirstCustCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFirstCustCustAddressEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFirstCustCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFirstCustOtherAfmAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFirstCustOtherAfmMainFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFirstOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFirstOtherIdMainFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFixedLnsInterestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFixedLnsInterestDurationUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFixedLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutFixedLnsInterestIntDuration" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutFourthCustCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFourthCustCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFourthCustCustAddressEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFourthCustCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFourthCustOtherAfmAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFourthCustOtherAfmMainFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFourthOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFourthOtherIdMainFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpBalancesLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpBalancesFdTdLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIbanCodeCharSuppliedChar37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedSrvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIssueOfficeUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIssueOfficeUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutKekGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutKekGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLnsCommissionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLnsCommissionIdCommission" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoanAccountRecyclingFrequency" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLpurpGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLpurpGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMaxBalOdMinMaxBalMaxBalance01" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutMaxBalOdMinMaxBalMaxBalDate01" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutMinBalOdMinMaxBalMinBalance01" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutMinBalOdMinMaxBalMinBalDate01" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutMonitorBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMonitorEmployeeLnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutN128HintScalePercentage00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutN128LnsInterestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutN128LnsInterestForDebit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutN128LnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOdDbIntHintScaleLowLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutOdDbIntHintScalePercentage00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutOdDbIntHintScaleUpLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutOneAccountIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOneAccountProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutOneAccountProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOneAccountProfitsAccountAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOneAccountProfitsAccountAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOneAccountProfitsAccountAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOneAccountProfitsAccountAgrUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOneAccountProfitsAccountAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutOneAccountProfitsAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutOneAccountProfitsAccountCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOneAccountProfitsAccountDepAccNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutOneAccountProfitsAccountDepOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOneAccountProfitsAccountLgAccSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutOneAccountProfitsAccountLgOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOneAccountProfitsAccountLimitCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOneAccountProfitsAccountLnsOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOneAccountProfitsAccountLnsSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOneAccountProfitsAccountLnsType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutOneAccountProfitsAccountMonotoringUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOneAccountProfitsAccountMovementCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOneAccountProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutOneAccountProfitsAccountProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOneAccountProfitsAccountTrOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOneAccountProfitsAccountTrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOneAccountProfitsAccountTrType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutOpenedUserLnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOpenUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOverdrCurrentPeriodIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutOverdrCurrentPeriodIefSuppliedText15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProffForFifthCustGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProffForFourthCustGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProffForSecCustGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProffForThirdCustGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProfGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProfGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSalePersonGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSalePersonGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSaleUnitGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSaleUnitGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSecCustCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSecCustCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSecCustCustAddressEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSecCustCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSecCustOtherAfmAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSecCustOtherAfmMainFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSecondCredLnsInterestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSecondCredLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSecondOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSecondOtherIdMainFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSecretConfirmDepositAccountSecretAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutServiceDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutServiceDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutServicesProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSumRetainInterResCrIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTaxCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTaxCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutThirdCustCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutThirdCustCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutThirdCustCustAddressEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutThirdCustCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutThirdCustOtherAfmAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutThirdCustOtherAfmMainFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutThirdOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutThirdOtherIdMainFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTimeDeposRenewalDaysDuration" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTimeDeposRenewalDurationUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTimeDeposRenewalDurationValue" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTimeDeposRenewalExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTimeDeposRenewalRenewalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTimeDeposRenewalStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTotAccrDbInterestIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotDepAccountTotalTotalCredit01" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotDepAccountTotalTotalDebit01" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotFdTdDepAccountTotalTotalCredit01" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotFdTdDepAccountTotalTotalDebit01" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutUpdateUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUpdateUsrLnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutWithdrawDayFromIefSuppliedDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutWithdrawDayFromIefSuppliedMonth" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutWithdrawDayToIefSuppliedDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutWithdrawDayToIefSuppliedMonth" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutOpenUnitCommentsIefSuppliedText40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroup" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGroupD" minOccurs="0"/>
 *         &lt;element name="OutGrpBalances" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpBalances" minOccurs="0"/>
 *         &lt;element name="OutGrpBalancesFdTd" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpBalancesFdTd" minOccurs="0"/>
 *         &lt;element name="OutAgrProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDaysInExcessIefSuppliedNum5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAccStatusIefSuppliedOverdraftAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountLastDormantDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRefereeNameIefSuppliedChar100" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRefereeAccNoIefSuppliedChar100" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountFreeText3IefSuppliedChar100" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountFreeText4IefSuppliedChar100" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountFreeText5IefSuppliedChar100" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCrmCodeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCrmCodeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDaysInDormantStatusIefSuppliedNum5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDaysSinceLastTrxDateIefSuppliedNum5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepositAccountRetrieveExport", propOrder = {
    "customerLnsSuppliedName",
    "outAccTypeGenericDetailDescription",
    "outAccTypeGenericDetailSerialNum",
    "outAccUnitCode",
    "outAccUnitUnitName",
    "outAccWithdrDepositAccountAvailableBalance",
    "outAchBnkCollaborationBanksAchBankCode",
    "outAchBnkCollaborationBanksBankId",
    "outAchBnkCollaborationBanksBankName",
    "outAchBnkCollaborationBanksEntryStatus",
    "outAddExcesLnsInterestDescription",
    "outAddExcesLnsInterestIdInterest",
    "outAgrProfitsAccountAccountNumber",
    "outAgrUnitCode",
    "outAgreementAgrMembershipSn",
    "outAgreementAgrSn",
    "outAgreementAgrYear",
    "outAvgBaDepAccountTotalTotalProducts01",
    "outAvgBal12MthFdTdDepAccountTotalTotalProducts01",
    "outAvgBalCurrYearDepAccountTotalTotalProducts01",
    "outAvgBalPrevYearDepAccountTotalTotalProducts01",
    "outAvgBalPrevYearFdTdDepAccountTotalTotalProducts01",
    "outBlockIefSuppliedDate",
    "outBlockIefSuppliedText40",
    "outBlockUsrCode",
    "outCancelIefSuppliedCount",
    "outCapitalDepositAccountAccountNumber",
    "outCapitalDepositAccountCDigit",
    "outCcodeGenericDetailDescription",
    "outCcodeGenericDetailSerialNum",
    "outCoben2CustomerCDigit",
    "outCoben2CustomerCustId",
    "outCoben2CustomerDateOfBirth",
    "outCoben2LnsSuppliedName",
    "outCoben3CustomerCDigit",
    "outCoben3CustomerCustId",
    "outCoben3CustomerDateOfBirth",
    "outCoben3LnsSuppliedName",
    "outCoben4CustomerCDigit",
    "outCoben4CustomerCustId",
    "outCoben4CustomerDateOfBirth",
    "outCoben4LnsSuppliedName",
    "outCoben5CustomerCDigit",
    "outCoben5CustomerCustId",
    "outCoben5CustomerDateOfBirth",
    "outCoben5LnsSuppliedName",
    "outCoben6CustomerCDigit",
    "outCoben6CustomerCustId",
    "outCoben6LnsSuppliedName",
    "outCoben7CustomerCDigit",
    "outCoben7CustomerCustId",
    "outCoben7LnsSuppliedName",
    "outCoben8CustomerCDigit",
    "outCoben8CustomerCustId",
    "outCoben8LnsSuppliedName",
    "outCoben9CustomerCDigit",
    "outCoben9CustomerCustId",
    "outCoben9LnsSuppliedName",
    "outCrDbCapitalProfitsAccountAccountNumber",
    "outCrDbInterestProfitsAccountAccountNumber",
    "outCrHintScalePercentage00",
    "outCrLnsInterestDescription",
    "outCrLnsInterestIdInterest",
    "outCredGradGenericDetailDescription",
    "outCredGradGenericDetailSerialNum",
    "outCurrTimePrintLineDate",
    "outCurrTimePrintLineTime",
    "outCurrencyIdCurrency",
    "outCurrencyShortDescr",
    "outCustAddInfoInsuranceEndDate",
    "outCustAddressSerialNum",
    "outCustCategGenericDetailDescription",
    "outCustCategGenericDetailSerialNum",
    "outCustomerCDigit",
    "outCustomerCustId",
    "outCustomerCustType",
    "outCustomerDateOfBirth",
    "outDbCrInterDepositAccountAccountNumber",
    "outDbCrInterDepositAccountCDigit",
    "outDbHintScalePercentage00",
    "outDbIntHintScalePercentage00",
    "outDbLnsInterestDescription",
    "outDbLnsInterestIdInterest",
    "outDepAccountInfoCurFxIntExpDt",
    "outDepAccountInfoCurFxIntStDt",
    "outDepAccountInfoOaCollectFreq",
    "outDepAccountInfoOaCollFreqUnit",
    "outDepAccountInfoOaDuration",
    "outDepAccountInfoOaDurationUnit",
    "outDepMntRecordingTrxUsrSn",
    "outDepositChangeSpreadFlg",
    "outDepositChequeBookFlag",
    "outDepositOverdraftLimit",
    "outDepositAccountAccGroup",
    "outDepositAccountAccountLimit",
    "outDepositAccountAccountNumber",
    "outDepositAccountAccountType",
    "outDepositAccountAccrCrInterest",
    "outDepositAccountAccrDbInterest",
    "outDepositAccountAccrN128Inter",
    "outDepositAccountAkflag",
    "outDepositAccountAnnounceTolDays",
    "outDepositAccountApprChqAdate",
    "outDepositAccountApprChqCnt",
    "outDepositAccountApprChqEdate",
    "outDepositAccountApprChqNo",
    "outDepositAccountApprChqPerc",
    "outDepositAccountAtmCardFlag",
    "outDepositAccountAutomChequeOrder",
    "outDepositAccountAvailableBalance",
    "outDepositAccountBalanceInterFlag",
    "outDepositAccountBenefAddressSn",
    "outDepositAccountBlockedBalance",
    "outDepositAccountBlockedStsExpiry",
    "outDepositAccountBoePercentance",
    "outDepositAccountBoeSpread",
    "outDepositAccountBondNumber",
    "outDepositAccountBookBalance",
    "outDepositAccountBookNo",
    "outDepositAccountCapIncreaseAmn",
    "outDepositAccountCDigit",
    "outDepositAccountChequeBooksCount",
    "outDepositAccountChequesAnncCnt",
    "outDepositAccountChequesBadCount",
    "outDepositAccountChequesBadTotal",
    "outDepositAccountChequesItemCount",
    "outDepositAccountChequesPaidCount",
    "outDepositAccountChequesPanncCnt",
    "outDepositAccountChequesPstampCnt",
    "outDepositAccountChequesRstampCnt",
    "outDepositAccountChequesSanncCnt",
    "outDepositAccountChequesSstampCnt",
    "outDepositAccountChequesStampCoun",
    "outDepositAccountChequesUsedCount",
    "outDepositAccountClosingDate",
    "outDepositAccountCobenefCount",
    "outDepositAccountCobenefCountIns",
    "outDepositAccountCobenefSnMail",
    "outDepositAccountColInsertionDt",
    "outDepositAccountCollateralFlg",
    "outDepositAccountCorrespAccInd",
    "outDepositAccountCrInterRateSpr",
    "outDepositAccountCrIntRtSprdInd",
    "outDepositAccountDbInterRateSpr",
    "outDepositAccountDbIntRtSprdInd",
    "outDepositAccountDefiniteDelay",
    "outDepositAccountDepositType",
    "outDepositAccountDesignation",
    "outDepositAccountDrawDownWxpDate",
    "outDepositAccountDurationUnit",
    "outDepositAccountDurationValue",
    "outDepositAccountEncroachTolerance",
    "outDepositAccountEntryStatus",
    "outDepositAccountExpCrIntSprd",
    "outDepositAccountExpDbIntSprd",
    "outDepositAccountExpiryDate",
    "outDepositAccountExpiryDateTd",
    "outDepositAccountExternalAccFlag",
    "outDepositAccountExtraitPrintDay",
    "outDepositAccountFinalWhldTaxFlg",
    "outDepositAccountFixedInterFlag",
    "outDepositAccountFixedInterRate",
    "outDepositAccountForecastBalance",
    "outDepositAccountHomeBranch",
    "outDepositAccountIncomeAmnt",
    "outDepositAccountIncomeFrequency",
    "outDepositAccountInitCrBalance",
    "outDepositAccountInitDbBalance",
    "outDepositAccountInitValueBalance",
    "outDepositAccountInspectionDate",
    "outDepositAccountInterestPayInd",
    "outDepositAccountInterestToWithdr",
    "outDepositAccountInterPayOptions",
    "outDepositAccountLastBatchDate",
    "outDepositAccountLastIntAvgBalance",
    "outDepositAccountLastIntAvgCr",
    "outDepositAccountLastIntAvgDb",
    "outDepositAccountLastModifyDate",
    "outDepositAccountLastTrxDate",
    "outDepositAccountLastTrxId",
    "outDepositAccountManualMigrateFlg",
    "outDepositAccountMultiSalaryAmnt",
    "outDepositAccountNostroAccount",
    "outDepositAccountNotifSpreadDayB",
    "outDepositAccountNotifSpreadDays",
    "outDepositAccountOfficeAccFlag",
    "outDepositAccountOldAccNumber",
    "outDepositAccountOpeningDate",
    "outDepositAccountOverdraftComment",
    "outDepositAccountOverdraftExpDt",
    "outDepositAccountOverdraftRenewalCnt",
    "outDepositAccountOverdraftRenewalDt",
    "outDepositAccountOverdraftRenewalFlg",
    "outDepositAccountOverdraftRenewalUsr",
    "outDepositAccountOverdraftSpread",
    "outDepositAccountPassbookFlag",
    "outDepositAccountPsbLastBalance",
    "outDepositAccountPsbLastPrintLn",
    "outDepositAccountPsbLostInd",
    "outDepositAccountPsbSn",
    "outDepositAccountRenewalDate",
    "outDepositAccountRenewalFlag",
    "outDepositAccountRenewalNumber",
    "outDepositAccountRestrictAccFlag",
    "outDepositAccountRetainingDate",
    "outDepositAccountSecretAccFlag",
    "outDepositAccountServicePenalSpr",
    "outDepositAccountSpecAgrPenFlg",
    "outDepositAccountSpecAgrTrxFlg",
    "outDepositAccountSpecialAccFlg",
    "outDepositAccountStartDateTd",
    "outDepositAccountStatementIssFreq",
    "outDepositAccountTargetFlg",
    "outDepositAccountTdBatchExtrtFlg",
    "outDepositAccountTdInterPercentChg",
    "outDepositAccountTdInterSprdChg",
    "outDepositAccountTelebankingFlag",
    "outDepositAccountTempExcEndDt",
    "outDepositAccountTempExcStartDt",
    "outDepositAccountTemporaryExcess",
    "outDepositAccountThirdpartyInd",
    "outDepositAccountTimestmp",
    "outDepositAccountUnclearBalance",
    "outDepositAccountUnclearWithdrFlg",
    "outDepositAccountUnutilLimitPenD",
    "outDepositAccountValidChqDuration",
    "outDepositAccountWithdrawAmnt",
    "outDepositAccountWthdrawSpread",
    "outDepSwiftParticipCounterYear",
    "outDepSwiftParticipCtiMt940",
    "outDepSwiftParticipCtiMt9401",
    "outDepSwiftParticipCtiMt9402",
    "outDepSwiftParticipCtiMt9403",
    "outDepSwiftParticipCtiMt9404",
    "outDepSwiftParticipLast940SgCntr",
    "outDepSwiftParticipLast940SwCntr",
    "outDepSwiftParticipLast942SgCntr",
    "outDepSwiftParticipLast950SwCntr",
    "outDepSwiftParticipLastBalanceMt942",
    "outDepSwiftParticipLastCtiMt940",
    "outDepSwiftParticipLastEntrySerNum",
    "outDepSwiftParticipLastTmstampMt942",
    "outDepSwiftParticipLastTransSerNum",
    "outDepSwiftParticipReceiverSwiftId",
    "outDepSwiftParticipReceiverSwiftId1",
    "outDepSwiftParticipReceiverSwiftId2",
    "outDepSwiftParticipReceiverSwiftId3",
    "outDepSwiftParticipReceiverSwiftId4",
    "outDepSwiftParticipSenderSwiftId",
    "outDepSwiftParticipSogecashMt940",
    "outDepSwiftParticipSogecashMt9401",
    "outDepSwiftParticipSogecashMt9402",
    "outDepSwiftParticipSogecashMt9403",
    "outDepSwiftParticipSogecashMt9404",
    "outDepSwiftParticipSogecashMt942",
    "outDepSwiftParticipSogecashMt9421",
    "outDepSwiftParticipSogecashMt9422",
    "outDepSwiftParticipSogecashMt9423",
    "outDepSwiftParticipSogecashMt9424",
    "outDepSwiftParticipSwiftMt940",
    "outDepSwiftParticipSwiftMt9401",
    "outDepSwiftParticipSwiftMt9402",
    "outDepSwiftParticipSwiftMt9403",
    "outDepSwiftParticipSwiftMt9404",
    "outDepSwiftParticipSwiftMt950",
    "outDepSwiftParticipSwiftMt9501",
    "outDepSwiftParticipSwiftMt9502",
    "outDepSwiftParticipSwiftMt9503",
    "outDepSwiftParticipSwiftMt9504",
    "outDepSwiftParticipSwiftStBal",
    "outDepSwiftParticipSwiftStDate",
    "outDepSwiftParticipTmstamp",
    "outDpPsbLostHistBookBalance",
    "outDpPsbLostHistPsbLastPrintLn",
    "outDpPsbLostHistPsbLostComment",
    "outDpPsbLostHistPsbLostSn",
    "outDpPsbLostHistTrxDate",
    "outEconomForFifthCustGenericDetailSerialNum",
    "outEconomForFourthCustGenericDetailSerialNum",
    "outEconomForSecCustGenericDetailSerialNum",
    "outEconomForThirdCustGenericDetailSerialNum",
    "outEconomyGenericDetailDescription",
    "outEconomyGenericDetailSerialNum",
    "outFifthCustCustAddressAddress1",
    "outFifthCustCustAddressCity",
    "outFifthCustCustAddressEntryStatus",
    "outFifthCustCustAddressTelephone",
    "outFifthCustOtherAfmAfmNo",
    "outFifthCustOtherAfmMainFlag",
    "outFifthOtherIdIdNo",
    "outFifthOtherIdMainFlag",
    "outFinalCrHintScalePercentage00",
    "outFinalDbHintScalePercentage00",
    "outFinalExcIntHintScalePercentage00",
    "outFinalN128HintScalePercentage00",
    "outFirstCustCustAddressAddress1",
    "outFirstCustCustAddressCity",
    "outFirstCustCustAddressEntryStatus",
    "outFirstCustCustAddressTelephone",
    "outFirstCustOtherAfmAfmNo",
    "outFirstCustOtherAfmMainFlag",
    "outFirstOtherIdIdNo",
    "outFirstOtherIdMainFlag",
    "outFixedLnsInterestDescription",
    "outFixedLnsInterestDurationUnit",
    "outFixedLnsInterestIdInterest",
    "outFixedLnsInterestIntDuration",
    "outFourthCustCustAddressAddress1",
    "outFourthCustCustAddressCity",
    "outFourthCustCustAddressEntryStatus",
    "outFourthCustCustAddressTelephone",
    "outFourthCustOtherAfmAfmNo",
    "outFourthCustOtherAfmMainFlag",
    "outFourthOtherIdIdNo",
    "outFourthOtherIdMainFlag",
    "outGroupLength",
    "outGrpBalancesLength",
    "outGrpBalancesFdTdLength",
    "outIbanCodeCharSuppliedChar37",
    "outIefSuppliedActionEntryDesc",
    "outIefSuppliedSrvStatus",
    "outIssueOfficeUnitCode",
    "outIssueOfficeUnitUnitName",
    "outKekGenericDetailDescription",
    "outKekGenericDetailSerialNum",
    "outLnsCommissionDescription",
    "outLnsCommissionIdCommission",
    "outLoanAccountRecyclingFrequency",
    "outLpurpGenericDetailDescription",
    "outLpurpGenericDetailSerialNum",
    "outMaxBalOdMinMaxBalMaxBalance01",
    "outMaxBalOdMinMaxBalMaxBalDate01",
    "outMinBalOdMinMaxBalMinBalance01",
    "outMinBalOdMinMaxBalMinBalDate01",
    "outMonitorBankemployeeId",
    "outMonitorEmployeeLnsSuppliedName",
    "outN128HintScalePercentage00",
    "outN128LnsInterestDescription",
    "outN128LnsInterestForDebit",
    "outN128LnsInterestIdInterest",
    "outOdDbIntHintScaleLowLimit",
    "outOdDbIntHintScalePercentage00",
    "outOdDbIntHintScaleUpLimit",
    "outOneAccountIefSuppliedFlag",
    "outOneAccountProfitsAccountAccountCd",
    "outOneAccountProfitsAccountAccountNumber",
    "outOneAccountProfitsAccountAccStatus",
    "outOneAccountProfitsAccountAgrMembershipSn",
    "outOneAccountProfitsAccountAgrSn",
    "outOneAccountProfitsAccountAgrUnit",
    "outOneAccountProfitsAccountAgrYear",
    "outOneAccountProfitsAccountCDigit",
    "outOneAccountProfitsAccountCustId",
    "outOneAccountProfitsAccountDepAccNumber",
    "outOneAccountProfitsAccountDepOpenUnit",
    "outOneAccountProfitsAccountLgAccSn",
    "outOneAccountProfitsAccountLgOpenUnit",
    "outOneAccountProfitsAccountLimitCurrency",
    "outOneAccountProfitsAccountLnsOpenUnit",
    "outOneAccountProfitsAccountLnsSn",
    "outOneAccountProfitsAccountLnsType",
    "outOneAccountProfitsAccountMonotoringUnit",
    "outOneAccountProfitsAccountMovementCurrency",
    "outOneAccountProfitsAccountPrftSystem",
    "outOneAccountProfitsAccountProductId",
    "outOneAccountProfitsAccountTrOpenUnit",
    "outOneAccountProfitsAccountTrSn",
    "outOneAccountProfitsAccountTrType",
    "outOpenedUserLnsSuppliedName",
    "outOpenUsrCode",
    "outOverdrCurrentPeriodIefSuppliedDate",
    "outOverdrCurrentPeriodIefSuppliedText15",
    "outPrftTransactionDescription",
    "outPrftTransactionIdTransact",
    "outProductDescription",
    "outProductIdProduct",
    "outProffForFifthCustGenericDetailSerialNum",
    "outProffForFourthCustGenericDetailSerialNum",
    "outProffForSecCustGenericDetailSerialNum",
    "outProffForThirdCustGenericDetailSerialNum",
    "outProfGenericDetailDescription",
    "outProfGenericDetailSerialNum",
    "outSalePersonGenericDetailDescription",
    "outSalePersonGenericDetailShortDescription",
    "outSaleUnitGenericDetailDescription",
    "outSaleUnitGenericDetailSerialNum",
    "outSecCustCustAddressAddress1",
    "outSecCustCustAddressCity",
    "outSecCustCustAddressEntryStatus",
    "outSecCustCustAddressTelephone",
    "outSecCustOtherAfmAfmNo",
    "outSecCustOtherAfmMainFlag",
    "outSecondCredLnsInterestDescription",
    "outSecondCredLnsInterestIdInterest",
    "outSecondOtherIdIdNo",
    "outSecondOtherIdMainFlag",
    "outSecretConfirmDepositAccountSecretAccFlag",
    "outServiceDepositAccountAccountNumber",
    "outServiceDepositAccountCDigit",
    "outServicesProfitsAccountAccountNumber",
    "outSumRetainInterResCrIntAmn",
    "outTaxCountryGenericDetailDescription",
    "outTaxCountryGenericDetailShortDescription",
    "outThirdCustCustAddressAddress1",
    "outThirdCustCustAddressCity",
    "outThirdCustCustAddressEntryStatus",
    "outThirdCustCustAddressTelephone",
    "outThirdCustOtherAfmAfmNo",
    "outThirdCustOtherAfmMainFlag",
    "outThirdOtherIdIdNo",
    "outThirdOtherIdMainFlag",
    "outTimeDeposRenewalDaysDuration",
    "outTimeDeposRenewalDurationUnit",
    "outTimeDeposRenewalDurationValue",
    "outTimeDeposRenewalExpiryDate",
    "outTimeDeposRenewalRenewalDate",
    "outTimeDeposRenewalStartDate",
    "outTotAccrDbInterestIefSuppliedNumber152",
    "outTotDepAccountTotalTotalCredit01",
    "outTotDepAccountTotalTotalDebit01",
    "outTotFdTdDepAccountTotalTotalCredit01",
    "outTotFdTdDepAccountTotalTotalDebit01",
    "outUpdateUsrCode",
    "outUpdateUsrLnsSuppliedName",
    "outWithdrawDayFromIefSuppliedDays",
    "outWithdrawDayFromIefSuppliedMonth",
    "outWithdrawDayToIefSuppliedDays",
    "outWithdrawDayToIefSuppliedMonth",
    "outOpenUnitCommentsIefSuppliedText40",
    "outGroup",
    "outGrpBalances",
    "outGrpBalancesFdTd",
    "outAgrProfitsAccountAccountCd",
    "outDaysInExcessIefSuppliedNum5",
    "outAccStatusIefSuppliedOverdraftAccStatus",
    "outDepositAccountLastDormantDate",
    "outRefereeNameIefSuppliedChar100",
    "outRefereeAccNoIefSuppliedChar100",
    "outDepositAccountFreeText3IefSuppliedChar100",
    "outDepositAccountFreeText4IefSuppliedChar100",
    "outDepositAccountFreeText5IefSuppliedChar100",
    "outCrmCodeGenericDetailSerialNum",
    "outCrmCodeGenericDetailDescription",
    "outDaysInDormantStatusIefSuppliedNum5",
    "outDaysSinceLastTrxDateIefSuppliedNum5"
})
public class DepositAccountRetrieveExport
    extends BaseExport
{

    @XmlElement(name = "CustomerLnsSuppliedName")
    protected String customerLnsSuppliedName;
    @XmlElement(name = "OutAccTypeGenericDetailDescription")
    protected String outAccTypeGenericDetailDescription;
    @XmlElement(name = "OutAccTypeGenericDetailSerialNum")
    protected int outAccTypeGenericDetailSerialNum;
    @XmlElement(name = "OutAccUnitCode")
    protected int outAccUnitCode;
    @XmlElement(name = "OutAccUnitUnitName")
    protected String outAccUnitUnitName;
    @XmlElement(name = "OutAccWithdrDepositAccountAvailableBalance", required = true)
    protected BigDecimal outAccWithdrDepositAccountAvailableBalance;
    @XmlElement(name = "OutAchBnkCollaborationBanksAchBankCode")
    protected String outAchBnkCollaborationBanksAchBankCode;
    @XmlElement(name = "OutAchBnkCollaborationBanksBankId")
    protected int outAchBnkCollaborationBanksBankId;
    @XmlElement(name = "OutAchBnkCollaborationBanksBankName")
    protected String outAchBnkCollaborationBanksBankName;
    @XmlElement(name = "OutAchBnkCollaborationBanksEntryStatus")
    protected String outAchBnkCollaborationBanksEntryStatus;
    @XmlElement(name = "OutAddExcesLnsInterestDescription")
    protected String outAddExcesLnsInterestDescription;
    @XmlElement(name = "OutAddExcesLnsInterestIdInterest")
    protected int outAddExcesLnsInterestIdInterest;
    @XmlElement(name = "OutAgrProfitsAccountAccountNumber")
    protected String outAgrProfitsAccountAccountNumber;
    @XmlElement(name = "OutAgrUnitCode")
    protected int outAgrUnitCode;
    @XmlElement(name = "OutAgreementAgrMembershipSn")
    protected int outAgreementAgrMembershipSn;
    @XmlElement(name = "OutAgreementAgrSn")
    protected int outAgreementAgrSn;
    @XmlElement(name = "OutAgreementAgrYear")
    protected short outAgreementAgrYear;
    @XmlElement(name = "OutAvgBaDepAccountTotalTotalProducts01", required = true)
    protected BigDecimal outAvgBaDepAccountTotalTotalProducts01;
    @XmlElement(name = "OutAvgBal12mthFdTdDepAccountTotalTotalProducts01", required = true)
    protected BigDecimal outAvgBal12MthFdTdDepAccountTotalTotalProducts01;
    @XmlElement(name = "OutAvgBalCurrYearDepAccountTotalTotalProducts01", required = true)
    protected BigDecimal outAvgBalCurrYearDepAccountTotalTotalProducts01;
    @XmlElement(name = "OutAvgBalPrevYearDepAccountTotalTotalProducts01", required = true)
    protected BigDecimal outAvgBalPrevYearDepAccountTotalTotalProducts01;
    @XmlElement(name = "OutAvgBalPrevYearFdTdDepAccountTotalTotalProducts01", required = true)
    protected BigDecimal outAvgBalPrevYearFdTdDepAccountTotalTotalProducts01;
    @XmlElement(name = "OutBlockIefSuppliedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBlockIefSuppliedDate;
    @XmlElement(name = "OutBlockIefSuppliedText40")
    protected String outBlockIefSuppliedText40;
    @XmlElement(name = "OutBlockUsrCode")
    protected String outBlockUsrCode;
    @XmlElement(name = "OutCancelIefSuppliedCount")
    protected int outCancelIefSuppliedCount;
    @XmlElement(name = "OutCapitalDepositAccountAccountNumber")
    protected double outCapitalDepositAccountAccountNumber;
    @XmlElement(name = "OutCapitalDepositAccountCDigit")
    protected short outCapitalDepositAccountCDigit;
    @XmlElement(name = "OutCcodeGenericDetailDescription")
    protected String outCcodeGenericDetailDescription;
    @XmlElement(name = "OutCcodeGenericDetailSerialNum")
    protected int outCcodeGenericDetailSerialNum;
    @XmlElement(name = "OutCoben2CustomerCDigit")
    protected short outCoben2CustomerCDigit;
    @XmlElement(name = "OutCoben2CustomerCustId")
    protected int outCoben2CustomerCustId;
    @XmlElement(name = "OutCoben2CustomerDateOfBirth", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCoben2CustomerDateOfBirth;
    @XmlElement(name = "OutCoben2LnsSuppliedName")
    protected String outCoben2LnsSuppliedName;
    @XmlElement(name = "OutCoben3CustomerCDigit")
    protected short outCoben3CustomerCDigit;
    @XmlElement(name = "OutCoben3CustomerCustId")
    protected int outCoben3CustomerCustId;
    @XmlElement(name = "OutCoben3CustomerDateOfBirth", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCoben3CustomerDateOfBirth;
    @XmlElement(name = "OutCoben3LnsSuppliedName")
    protected String outCoben3LnsSuppliedName;
    @XmlElement(name = "OutCoben4CustomerCDigit")
    protected short outCoben4CustomerCDigit;
    @XmlElement(name = "OutCoben4CustomerCustId")
    protected int outCoben4CustomerCustId;
    @XmlElement(name = "OutCoben4CustomerDateOfBirth", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCoben4CustomerDateOfBirth;
    @XmlElement(name = "OutCoben4LnsSuppliedName")
    protected String outCoben4LnsSuppliedName;
    @XmlElement(name = "OutCoben5CustomerCDigit")
    protected short outCoben5CustomerCDigit;
    @XmlElement(name = "OutCoben5CustomerCustId")
    protected int outCoben5CustomerCustId;
    @XmlElement(name = "OutCoben5CustomerDateOfBirth", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCoben5CustomerDateOfBirth;
    @XmlElement(name = "OutCoben5LnsSuppliedName")
    protected String outCoben5LnsSuppliedName;
    @XmlElement(name = "OutCoben6CustomerCDigit")
    protected short outCoben6CustomerCDigit;
    @XmlElement(name = "OutCoben6CustomerCustId")
    protected int outCoben6CustomerCustId;
    @XmlElement(name = "OutCoben6LnsSuppliedName")
    protected String outCoben6LnsSuppliedName;
    @XmlElement(name = "OutCoben7CustomerCDigit")
    protected short outCoben7CustomerCDigit;
    @XmlElement(name = "OutCoben7CustomerCustId")
    protected int outCoben7CustomerCustId;
    @XmlElement(name = "OutCoben7LnsSuppliedName")
    protected String outCoben7LnsSuppliedName;
    @XmlElement(name = "OutCoben8CustomerCDigit")
    protected short outCoben8CustomerCDigit;
    @XmlElement(name = "OutCoben8CustomerCustId")
    protected int outCoben8CustomerCustId;
    @XmlElement(name = "OutCoben8LnsSuppliedName")
    protected String outCoben8LnsSuppliedName;
    @XmlElement(name = "OutCoben9CustomerCDigit")
    protected short outCoben9CustomerCDigit;
    @XmlElement(name = "OutCoben9CustomerCustId")
    protected int outCoben9CustomerCustId;
    @XmlElement(name = "OutCoben9LnsSuppliedName")
    protected String outCoben9LnsSuppliedName;
    @XmlElement(name = "OutCrDbCapitalProfitsAccountAccountNumber")
    protected String outCrDbCapitalProfitsAccountAccountNumber;
    @XmlElement(name = "OutCrDbInterestProfitsAccountAccountNumber")
    protected String outCrDbInterestProfitsAccountAccountNumber;
    @XmlElement(name = "OutCrHintScalePercentage00", required = true)
    protected BigDecimal outCrHintScalePercentage00;
    @XmlElement(name = "OutCrLnsInterestDescription")
    protected String outCrLnsInterestDescription;
    @XmlElement(name = "OutCrLnsInterestIdInterest")
    protected int outCrLnsInterestIdInterest;
    @XmlElement(name = "OutCredGradGenericDetailDescription")
    protected String outCredGradGenericDetailDescription;
    @XmlElement(name = "OutCredGradGenericDetailSerialNum")
    protected int outCredGradGenericDetailSerialNum;
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
    @XmlElement(name = "OutCustAddInfoInsuranceEndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustAddInfoInsuranceEndDate;
    @XmlElement(name = "OutCustAddressSerialNum")
    protected short outCustAddressSerialNum;
    @XmlElement(name = "OutCustCategGenericDetailDescription")
    protected String outCustCategGenericDetailDescription;
    @XmlElement(name = "OutCustCategGenericDetailSerialNum")
    protected int outCustCategGenericDetailSerialNum;
    @XmlElement(name = "OutCustomerCDigit")
    protected short outCustomerCDigit;
    @XmlElement(name = "OutCustomerCustId")
    protected int outCustomerCustId;
    @XmlElement(name = "OutCustomerCustType")
    protected String outCustomerCustType;
    @XmlElement(name = "OutCustomerDateOfBirth", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustomerDateOfBirth;
    @XmlElement(name = "OutDbCrInterDepositAccountAccountNumber")
    protected double outDbCrInterDepositAccountAccountNumber;
    @XmlElement(name = "OutDbCrInterDepositAccountCDigit")
    protected short outDbCrInterDepositAccountCDigit;
    @XmlElement(name = "OutDbHintScalePercentage00", required = true)
    protected BigDecimal outDbHintScalePercentage00;
    @XmlElement(name = "OutDbIntHintScalePercentage00", required = true)
    protected BigDecimal outDbIntHintScalePercentage00;
    @XmlElement(name = "OutDbLnsInterestDescription")
    protected String outDbLnsInterestDescription;
    @XmlElement(name = "OutDbLnsInterestIdInterest")
    protected int outDbLnsInterestIdInterest;
    @XmlElement(name = "OutDepAccountInfoCurFxIntExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDepAccountInfoCurFxIntExpDt;
    @XmlElement(name = "OutDepAccountInfoCurFxIntStDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDepAccountInfoCurFxIntStDt;
    @XmlElement(name = "OutDepAccountInfoOaCollectFreq")
    protected short outDepAccountInfoOaCollectFreq;
    @XmlElement(name = "OutDepAccountInfoOaCollFreqUnit")
    protected String outDepAccountInfoOaCollFreqUnit;
    @XmlElement(name = "OutDepAccountInfoOaDuration")
    protected short outDepAccountInfoOaDuration;
    @XmlElement(name = "OutDepAccountInfoOaDurationUnit")
    protected String outDepAccountInfoOaDurationUnit;
    @XmlElement(name = "OutDepMntRecordingTrxUsrSn")
    protected int outDepMntRecordingTrxUsrSn;
    @XmlElement(name = "OutDepositChangeSpreadFlg")
    protected String outDepositChangeSpreadFlg;
    @XmlElement(name = "OutDepositChequeBookFlag")
    protected String outDepositChequeBookFlag;
    @XmlElement(name = "OutDepositOverdraftLimit", required = true)
    protected BigDecimal outDepositOverdraftLimit;
    @XmlElement(name = "OutDepositAccountAccGroup")
    protected int outDepositAccountAccGroup;
    @XmlElement(name = "OutDepositAccountAccountLimit", required = true)
    protected BigDecimal outDepositAccountAccountLimit;
    @XmlElement(name = "OutDepositAccountAccountNumber")
    protected double outDepositAccountAccountNumber;
    @XmlElement(name = "OutDepositAccountAccountType")
    protected String outDepositAccountAccountType;
    @XmlElement(name = "OutDepositAccountAccrCrInterest", required = true)
    protected BigDecimal outDepositAccountAccrCrInterest;
    @XmlElement(name = "OutDepositAccountAccrDbInterest", required = true)
    protected BigDecimal outDepositAccountAccrDbInterest;
    @XmlElement(name = "OutDepositAccountAccrN128Inter", required = true)
    protected BigDecimal outDepositAccountAccrN128Inter;
    @XmlElement(name = "OutDepositAccountAkflag")
    protected String outDepositAccountAkflag;
    @XmlElement(name = "OutDepositAccountAnnounceTolDays")
    protected short outDepositAccountAnnounceTolDays;
    @XmlElement(name = "OutDepositAccountApprChqAdate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDepositAccountApprChqAdate;
    @XmlElement(name = "OutDepositAccountApprChqCnt")
    protected int outDepositAccountApprChqCnt;
    @XmlElement(name = "OutDepositAccountApprChqEdate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDepositAccountApprChqEdate;
    @XmlElement(name = "OutDepositAccountApprChqNo")
    protected String outDepositAccountApprChqNo;
    @XmlElement(name = "OutDepositAccountApprChqPerc", required = true)
    protected BigDecimal outDepositAccountApprChqPerc;
    @XmlElement(name = "OutDepositAccountAtmCardFlag")
    protected String outDepositAccountAtmCardFlag;
    @XmlElement(name = "OutDepositAccountAutomChequeOrder")
    protected String outDepositAccountAutomChequeOrder;
    @XmlElement(name = "OutDepositAccountAvailableBalance", required = true)
    protected BigDecimal outDepositAccountAvailableBalance;
    @XmlElement(name = "OutDepositAccountBalanceInterFlag")
    protected String outDepositAccountBalanceInterFlag;
    @XmlElement(name = "OutDepositAccountBenefAddressSn")
    protected short outDepositAccountBenefAddressSn;
    @XmlElement(name = "OutDepositAccountBlockedBalance", required = true)
    protected BigDecimal outDepositAccountBlockedBalance;
    @XmlElement(name = "OutDepositAccountBlockedStsExpiry", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDepositAccountBlockedStsExpiry;
    @XmlElement(name = "OutDepositAccountBoePercentance", required = true)
    protected BigDecimal outDepositAccountBoePercentance;
    @XmlElement(name = "OutDepositAccountBoeSpread", required = true)
    protected BigDecimal outDepositAccountBoeSpread;
    @XmlElement(name = "OutDepositAccountBondNumber")
    protected double outDepositAccountBondNumber;
    @XmlElement(name = "OutDepositAccountBookBalance", required = true)
    protected BigDecimal outDepositAccountBookBalance;
    @XmlElement(name = "OutDepositAccountBookNo")
    protected int outDepositAccountBookNo;
    @XmlElement(name = "OutDepositAccountCapIncreaseAmn", required = true)
    protected BigDecimal outDepositAccountCapIncreaseAmn;
    @XmlElement(name = "OutDepositAccountCDigit")
    protected short outDepositAccountCDigit;
    @XmlElement(name = "OutDepositAccountChequeBooksCount")
    protected int outDepositAccountChequeBooksCount;
    @XmlElement(name = "OutDepositAccountChequesAnncCnt")
    protected int outDepositAccountChequesAnncCnt;
    @XmlElement(name = "OutDepositAccountChequesBadCount")
    protected int outDepositAccountChequesBadCount;
    @XmlElement(name = "OutDepositAccountChequesBadTotal", required = true)
    protected BigDecimal outDepositAccountChequesBadTotal;
    @XmlElement(name = "OutDepositAccountChequesItemCount")
    protected int outDepositAccountChequesItemCount;
    @XmlElement(name = "OutDepositAccountChequesPaidCount")
    protected int outDepositAccountChequesPaidCount;
    @XmlElement(name = "OutDepositAccountChequesPanncCnt")
    protected int outDepositAccountChequesPanncCnt;
    @XmlElement(name = "OutDepositAccountChequesPstampCnt")
    protected int outDepositAccountChequesPstampCnt;
    @XmlElement(name = "OutDepositAccountChequesRstampCnt")
    protected int outDepositAccountChequesRstampCnt;
    @XmlElement(name = "OutDepositAccountChequesSanncCnt")
    protected int outDepositAccountChequesSanncCnt;
    @XmlElement(name = "OutDepositAccountChequesSstampCnt")
    protected int outDepositAccountChequesSstampCnt;
    @XmlElement(name = "OutDepositAccountChequesStampCoun")
    protected int outDepositAccountChequesStampCoun;
    @XmlElement(name = "OutDepositAccountChequesUsedCount")
    protected int outDepositAccountChequesUsedCount;
    @XmlElement(name = "OutDepositAccountClosingDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDepositAccountClosingDate;
    @XmlElement(name = "OutDepositAccountCobenefCount")
    protected short outDepositAccountCobenefCount;
    @XmlElement(name = "OutDepositAccountCobenefCountIns")
    protected short outDepositAccountCobenefCountIns;
    @XmlElement(name = "OutDepositAccountCobenefSnMail")
    protected short outDepositAccountCobenefSnMail;
    @XmlElement(name = "OutDepositAccountColInsertionDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDepositAccountColInsertionDt;
    @XmlElement(name = "OutDepositAccountCollateralFlg")
    protected String outDepositAccountCollateralFlg;
    @XmlElement(name = "OutDepositAccountCorrespAccInd")
    protected String outDepositAccountCorrespAccInd;
    @XmlElement(name = "OutDepositAccountCrInterRateSpr", required = true)
    protected BigDecimal outDepositAccountCrInterRateSpr;
    @XmlElement(name = "OutDepositAccountCrIntRtSprdInd")
    protected String outDepositAccountCrIntRtSprdInd;
    @XmlElement(name = "OutDepositAccountDbInterRateSpr", required = true)
    protected BigDecimal outDepositAccountDbInterRateSpr;
    @XmlElement(name = "OutDepositAccountDbIntRtSprdInd")
    protected String outDepositAccountDbIntRtSprdInd;
    @XmlElement(name = "OutDepositAccountDefiniteDelay")
    protected String outDepositAccountDefiniteDelay;
    @XmlElement(name = "OutDepositAccountDepositType")
    protected String outDepositAccountDepositType;
    @XmlElement(name = "OutDepositAccountDesignation")
    protected String outDepositAccountDesignation;
    @XmlElement(name = "OutDepositAccountDrawDownWxpDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDepositAccountDrawDownWxpDate;
    @XmlElement(name = "OutDepositAccountDurationUnit")
    protected String outDepositAccountDurationUnit;
    @XmlElement(name = "OutDepositAccountDurationValue")
    protected short outDepositAccountDurationValue;
    @XmlElement(name = "OutDepositAccountEncroachTolerance", required = true)
    protected BigDecimal outDepositAccountEncroachTolerance;
    @XmlElement(name = "OutDepositAccountEntryStatus")
    protected String outDepositAccountEntryStatus;
    @XmlElement(name = "OutDepositAccountExpCrIntSprd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDepositAccountExpCrIntSprd;
    @XmlElement(name = "OutDepositAccountExpDbIntSprd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDepositAccountExpDbIntSprd;
    @XmlElement(name = "OutDepositAccountExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDepositAccountExpiryDate;
    @XmlElement(name = "OutDepositAccountExpiryDateTd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDepositAccountExpiryDateTd;
    @XmlElement(name = "OutDepositAccountExternalAccFlag")
    protected String outDepositAccountExternalAccFlag;
    @XmlElement(name = "OutDepositAccountExtraitPrintDay")
    protected short outDepositAccountExtraitPrintDay;
    @XmlElement(name = "OutDepositAccountFinalWhldTaxFlg")
    protected String outDepositAccountFinalWhldTaxFlg;
    @XmlElement(name = "OutDepositAccountFixedInterFlag")
    protected String outDepositAccountFixedInterFlag;
    @XmlElement(name = "OutDepositAccountFixedInterRate", required = true)
    protected BigDecimal outDepositAccountFixedInterRate;
    @XmlElement(name = "OutDepositAccountForecastBalance", required = true)
    protected BigDecimal outDepositAccountForecastBalance;
    @XmlElement(name = "OutDepositAccountHomeBranch")
    protected String outDepositAccountHomeBranch;
    @XmlElement(name = "OutDepositAccountIncomeAmnt", required = true)
    protected BigDecimal outDepositAccountIncomeAmnt;
    @XmlElement(name = "OutDepositAccountIncomeFrequency")
    protected int outDepositAccountIncomeFrequency;
    @XmlElement(name = "OutDepositAccountInitCrBalance", required = true)
    protected BigDecimal outDepositAccountInitCrBalance;
    @XmlElement(name = "OutDepositAccountInitDbBalance", required = true)
    protected BigDecimal outDepositAccountInitDbBalance;
    @XmlElement(name = "OutDepositAccountInitValueBalance", required = true)
    protected BigDecimal outDepositAccountInitValueBalance;
    @XmlElement(name = "OutDepositAccountInspectionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDepositAccountInspectionDate;
    @XmlElement(name = "OutDepositAccountInterestPayInd")
    protected String outDepositAccountInterestPayInd;
    @XmlElement(name = "OutDepositAccountInterestToWithdr", required = true)
    protected BigDecimal outDepositAccountInterestToWithdr;
    @XmlElement(name = "OutDepositAccountInterPayOptions")
    protected String outDepositAccountInterPayOptions;
    @XmlElement(name = "OutDepositAccountLastBatchDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDepositAccountLastBatchDate;
    @XmlElement(name = "OutDepositAccountLastIntAvgBalance", required = true)
    protected BigDecimal outDepositAccountLastIntAvgBalance;
    @XmlElement(name = "OutDepositAccountLastIntAvgCr", required = true)
    protected BigDecimal outDepositAccountLastIntAvgCr;
    @XmlElement(name = "OutDepositAccountLastIntAvgDb", required = true)
    protected BigDecimal outDepositAccountLastIntAvgDb;
    @XmlElement(name = "OutDepositAccountLastModifyDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDepositAccountLastModifyDate;
    @XmlElement(name = "OutDepositAccountLastTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDepositAccountLastTrxDate;
    @XmlElement(name = "OutDepositAccountLastTrxId")
    protected int outDepositAccountLastTrxId;
    @XmlElement(name = "OutDepositAccountManualMigrateFlg")
    protected String outDepositAccountManualMigrateFlg;
    @XmlElement(name = "OutDepositAccountMultiSalaryAmnt")
    protected short outDepositAccountMultiSalaryAmnt;
    @XmlElement(name = "OutDepositAccountNostroAccount")
    protected String outDepositAccountNostroAccount;
    @XmlElement(name = "OutDepositAccountNotifSpreadDayB")
    protected short outDepositAccountNotifSpreadDayB;
    @XmlElement(name = "OutDepositAccountNotifSpreadDays")
    protected short outDepositAccountNotifSpreadDays;
    @XmlElement(name = "OutDepositAccountOfficeAccFlag")
    protected String outDepositAccountOfficeAccFlag;
    @XmlElement(name = "OutDepositAccountOldAccNumber")
    protected String outDepositAccountOldAccNumber;
    @XmlElement(name = "OutDepositAccountOpeningDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDepositAccountOpeningDate;
    @XmlElement(name = "OutDepositAccountOverdraftComment")
    protected String outDepositAccountOverdraftComment;
    @XmlElement(name = "OutDepositAccountOverdraftExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDepositAccountOverdraftExpDt;
    @XmlElement(name = "OutDepositAccountOverdraftRenewalCnt")
    protected int outDepositAccountOverdraftRenewalCnt;
    @XmlElement(name = "OutDepositAccountOverdraftRenewalDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDepositAccountOverdraftRenewalDt;
    @XmlElement(name = "OutDepositAccountOverdraftRenewalFlg")
    protected String outDepositAccountOverdraftRenewalFlg;
    @XmlElement(name = "OutDepositAccountOverdraftRenewalUsr")
    protected String outDepositAccountOverdraftRenewalUsr;
    @XmlElement(name = "OutDepositAccountOverdraftSpread", required = true)
    protected BigDecimal outDepositAccountOverdraftSpread;
    @XmlElement(name = "OutDepositAccountPassbookFlag")
    protected String outDepositAccountPassbookFlag;
    @XmlElement(name = "OutDepositAccountPsbLastBalance", required = true)
    protected BigDecimal outDepositAccountPsbLastBalance;
    @XmlElement(name = "OutDepositAccountPsbLastPrintLn")
    protected short outDepositAccountPsbLastPrintLn;
    @XmlElement(name = "OutDepositAccountPsbLostInd")
    protected String outDepositAccountPsbLostInd;
    @XmlElement(name = "OutDepositAccountPsbSn")
    protected int outDepositAccountPsbSn;
    @XmlElement(name = "OutDepositAccountRenewalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDepositAccountRenewalDate;
    @XmlElement(name = "OutDepositAccountRenewalFlag")
    protected String outDepositAccountRenewalFlag;
    @XmlElement(name = "OutDepositAccountRenewalNumber")
    protected int outDepositAccountRenewalNumber;
    @XmlElement(name = "OutDepositAccountRestrictAccFlag")
    protected String outDepositAccountRestrictAccFlag;
    @XmlElement(name = "OutDepositAccountRetainingDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDepositAccountRetainingDate;
    @XmlElement(name = "OutDepositAccountSecretAccFlag")
    protected String outDepositAccountSecretAccFlag;
    @XmlElement(name = "OutDepositAccountServicePenalSpr", required = true)
    protected BigDecimal outDepositAccountServicePenalSpr;
    @XmlElement(name = "OutDepositAccountSpecAgrPenFlg")
    protected String outDepositAccountSpecAgrPenFlg;
    @XmlElement(name = "OutDepositAccountSpecAgrTrxFlg")
    protected String outDepositAccountSpecAgrTrxFlg;
    @XmlElement(name = "OutDepositAccountSpecialAccFlg")
    protected String outDepositAccountSpecialAccFlg;
    @XmlElement(name = "OutDepositAccountStartDateTd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDepositAccountStartDateTd;
    @XmlElement(name = "OutDepositAccountStatementIssFreq")
    protected String outDepositAccountStatementIssFreq;
    @XmlElement(name = "OutDepositAccountTargetFlg")
    protected short outDepositAccountTargetFlg;
    @XmlElement(name = "OutDepositAccountTdBatchExtrtFlg")
    protected String outDepositAccountTdBatchExtrtFlg;
    @XmlElement(name = "OutDepositAccountTdInterPercentChg", required = true)
    protected BigDecimal outDepositAccountTdInterPercentChg;
    @XmlElement(name = "OutDepositAccountTdInterSprdChg", required = true)
    protected BigDecimal outDepositAccountTdInterSprdChg;
    @XmlElement(name = "OutDepositAccountTelebankingFlag")
    protected String outDepositAccountTelebankingFlag;
    @XmlElement(name = "OutDepositAccountTempExcEndDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDepositAccountTempExcEndDt;
    @XmlElement(name = "OutDepositAccountTempExcStartDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDepositAccountTempExcStartDt;
    @XmlElement(name = "OutDepositAccountTemporaryExcess", required = true)
    protected BigDecimal outDepositAccountTemporaryExcess;
    @XmlElement(name = "OutDepositAccountThirdpartyInd")
    protected String outDepositAccountThirdpartyInd;
    @XmlElement(name = "OutDepositAccountTimestmp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDepositAccountTimestmp;
    @XmlElement(name = "OutDepositAccountUnclearBalance", required = true)
    protected BigDecimal outDepositAccountUnclearBalance;
    @XmlElement(name = "OutDepositAccountUnclearWithdrFlg")
    protected String outDepositAccountUnclearWithdrFlg;
    @XmlElement(name = "OutDepositAccountUnutilLimitPenD", required = true)
    protected BigDecimal outDepositAccountUnutilLimitPenD;
    @XmlElement(name = "OutDepositAccountValidChqDuration")
    protected int outDepositAccountValidChqDuration;
    @XmlElement(name = "OutDepositAccountWithdrawAmnt", required = true)
    protected BigDecimal outDepositAccountWithdrawAmnt;
    @XmlElement(name = "OutDepositAccountWthdrawSpread")
    protected short outDepositAccountWthdrawSpread;
    @XmlElement(name = "OutDepSwiftParticipCounterYear")
    protected short outDepSwiftParticipCounterYear;
    @XmlElement(name = "OutDepSwiftParticipCtiMt940")
    protected String outDepSwiftParticipCtiMt940;
    @XmlElement(name = "OutDepSwiftParticipCtiMt9401")
    protected String outDepSwiftParticipCtiMt9401;
    @XmlElement(name = "OutDepSwiftParticipCtiMt9402")
    protected String outDepSwiftParticipCtiMt9402;
    @XmlElement(name = "OutDepSwiftParticipCtiMt9403")
    protected String outDepSwiftParticipCtiMt9403;
    @XmlElement(name = "OutDepSwiftParticipCtiMt9404")
    protected String outDepSwiftParticipCtiMt9404;
    @XmlElement(name = "OutDepSwiftParticipLast940SgCntr")
    protected int outDepSwiftParticipLast940SgCntr;
    @XmlElement(name = "OutDepSwiftParticipLast940SwCntr")
    protected int outDepSwiftParticipLast940SwCntr;
    @XmlElement(name = "OutDepSwiftParticipLast942SgCntr")
    protected int outDepSwiftParticipLast942SgCntr;
    @XmlElement(name = "OutDepSwiftParticipLast950SwCntr")
    protected int outDepSwiftParticipLast950SwCntr;
    @XmlElement(name = "OutDepSwiftParticipLastBalanceMt942", required = true)
    protected BigDecimal outDepSwiftParticipLastBalanceMt942;
    @XmlElement(name = "OutDepSwiftParticipLastCtiMt940")
    protected double outDepSwiftParticipLastCtiMt940;
    @XmlElement(name = "OutDepSwiftParticipLastEntrySerNum")
    protected int outDepSwiftParticipLastEntrySerNum;
    @XmlElement(name = "OutDepSwiftParticipLastTmstampMt942", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDepSwiftParticipLastTmstampMt942;
    @XmlElement(name = "OutDepSwiftParticipLastTransSerNum")
    protected int outDepSwiftParticipLastTransSerNum;
    @XmlElement(name = "OutDepSwiftParticipReceiverSwiftId")
    protected String outDepSwiftParticipReceiverSwiftId;
    @XmlElement(name = "OutDepSwiftParticipReceiverSwiftId1")
    protected String outDepSwiftParticipReceiverSwiftId1;
    @XmlElement(name = "OutDepSwiftParticipReceiverSwiftId2")
    protected String outDepSwiftParticipReceiverSwiftId2;
    @XmlElement(name = "OutDepSwiftParticipReceiverSwiftId3")
    protected String outDepSwiftParticipReceiverSwiftId3;
    @XmlElement(name = "OutDepSwiftParticipReceiverSwiftId4")
    protected String outDepSwiftParticipReceiverSwiftId4;
    @XmlElement(name = "OutDepSwiftParticipSenderSwiftId")
    protected String outDepSwiftParticipSenderSwiftId;
    @XmlElement(name = "OutDepSwiftParticipSogecashMt940")
    protected String outDepSwiftParticipSogecashMt940;
    @XmlElement(name = "OutDepSwiftParticipSogecashMt9401")
    protected String outDepSwiftParticipSogecashMt9401;
    @XmlElement(name = "OutDepSwiftParticipSogecashMt9402")
    protected String outDepSwiftParticipSogecashMt9402;
    @XmlElement(name = "OutDepSwiftParticipSogecashMt9403")
    protected String outDepSwiftParticipSogecashMt9403;
    @XmlElement(name = "OutDepSwiftParticipSogecashMt9404")
    protected String outDepSwiftParticipSogecashMt9404;
    @XmlElement(name = "OutDepSwiftParticipSogecashMt942")
    protected String outDepSwiftParticipSogecashMt942;
    @XmlElement(name = "OutDepSwiftParticipSogecashMt9421")
    protected String outDepSwiftParticipSogecashMt9421;
    @XmlElement(name = "OutDepSwiftParticipSogecashMt9422")
    protected String outDepSwiftParticipSogecashMt9422;
    @XmlElement(name = "OutDepSwiftParticipSogecashMt9423")
    protected String outDepSwiftParticipSogecashMt9423;
    @XmlElement(name = "OutDepSwiftParticipSogecashMt9424")
    protected String outDepSwiftParticipSogecashMt9424;
    @XmlElement(name = "OutDepSwiftParticipSwiftMt940")
    protected String outDepSwiftParticipSwiftMt940;
    @XmlElement(name = "OutDepSwiftParticipSwiftMt9401")
    protected String outDepSwiftParticipSwiftMt9401;
    @XmlElement(name = "OutDepSwiftParticipSwiftMt9402")
    protected String outDepSwiftParticipSwiftMt9402;
    @XmlElement(name = "OutDepSwiftParticipSwiftMt9403")
    protected String outDepSwiftParticipSwiftMt9403;
    @XmlElement(name = "OutDepSwiftParticipSwiftMt9404")
    protected String outDepSwiftParticipSwiftMt9404;
    @XmlElement(name = "OutDepSwiftParticipSwiftMt950")
    protected String outDepSwiftParticipSwiftMt950;
    @XmlElement(name = "OutDepSwiftParticipSwiftMt9501")
    protected String outDepSwiftParticipSwiftMt9501;
    @XmlElement(name = "OutDepSwiftParticipSwiftMt9502")
    protected String outDepSwiftParticipSwiftMt9502;
    @XmlElement(name = "OutDepSwiftParticipSwiftMt9503")
    protected String outDepSwiftParticipSwiftMt9503;
    @XmlElement(name = "OutDepSwiftParticipSwiftMt9504")
    protected String outDepSwiftParticipSwiftMt9504;
    @XmlElement(name = "OutDepSwiftParticipSwiftStBal", required = true)
    protected BigDecimal outDepSwiftParticipSwiftStBal;
    @XmlElement(name = "OutDepSwiftParticipSwiftStDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDepSwiftParticipSwiftStDate;
    @XmlElement(name = "OutDepSwiftParticipTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDepSwiftParticipTmstamp;
    @XmlElement(name = "OutDpPsbLostHistBookBalance", required = true)
    protected BigDecimal outDpPsbLostHistBookBalance;
    @XmlElement(name = "OutDpPsbLostHistPsbLastPrintLn")
    protected short outDpPsbLostHistPsbLastPrintLn;
    @XmlElement(name = "OutDpPsbLostHistPsbLostComment")
    protected String outDpPsbLostHistPsbLostComment;
    @XmlElement(name = "OutDpPsbLostHistPsbLostSn")
    protected int outDpPsbLostHistPsbLostSn;
    @XmlElement(name = "OutDpPsbLostHistTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDpPsbLostHistTrxDate;
    @XmlElement(name = "OutEconomForFifthCustGenericDetailSerialNum")
    protected int outEconomForFifthCustGenericDetailSerialNum;
    @XmlElement(name = "OutEconomForFourthCustGenericDetailSerialNum")
    protected int outEconomForFourthCustGenericDetailSerialNum;
    @XmlElement(name = "OutEconomForSecCustGenericDetailSerialNum")
    protected int outEconomForSecCustGenericDetailSerialNum;
    @XmlElement(name = "OutEconomForThirdCustGenericDetailSerialNum")
    protected int outEconomForThirdCustGenericDetailSerialNum;
    @XmlElement(name = "OutEconomyGenericDetailDescription")
    protected String outEconomyGenericDetailDescription;
    @XmlElement(name = "OutEconomyGenericDetailSerialNum")
    protected int outEconomyGenericDetailSerialNum;
    @XmlElement(name = "OutFifthCustCustAddressAddress1")
    protected String outFifthCustCustAddressAddress1;
    @XmlElement(name = "OutFifthCustCustAddressCity")
    protected String outFifthCustCustAddressCity;
    @XmlElement(name = "OutFifthCustCustAddressEntryStatus")
    protected String outFifthCustCustAddressEntryStatus;
    @XmlElement(name = "OutFifthCustCustAddressTelephone")
    protected String outFifthCustCustAddressTelephone;
    @XmlElement(name = "OutFifthCustOtherAfmAfmNo")
    protected String outFifthCustOtherAfmAfmNo;
    @XmlElement(name = "OutFifthCustOtherAfmMainFlag")
    protected String outFifthCustOtherAfmMainFlag;
    @XmlElement(name = "OutFifthOtherIdIdNo")
    protected String outFifthOtherIdIdNo;
    @XmlElement(name = "OutFifthOtherIdMainFlag")
    protected String outFifthOtherIdMainFlag;
    @XmlElement(name = "OutFinalCrHintScalePercentage00", required = true)
    protected BigDecimal outFinalCrHintScalePercentage00;
    @XmlElement(name = "OutFinalDbHintScalePercentage00", required = true)
    protected BigDecimal outFinalDbHintScalePercentage00;
    @XmlElement(name = "OutFinalExcIntHintScalePercentage00", required = true)
    protected BigDecimal outFinalExcIntHintScalePercentage00;
    @XmlElement(name = "OutFinalN128HintScalePercentage00", required = true)
    protected BigDecimal outFinalN128HintScalePercentage00;
    @XmlElement(name = "OutFirstCustCustAddressAddress1")
    protected String outFirstCustCustAddressAddress1;
    @XmlElement(name = "OutFirstCustCustAddressCity")
    protected String outFirstCustCustAddressCity;
    @XmlElement(name = "OutFirstCustCustAddressEntryStatus")
    protected String outFirstCustCustAddressEntryStatus;
    @XmlElement(name = "OutFirstCustCustAddressTelephone")
    protected String outFirstCustCustAddressTelephone;
    @XmlElement(name = "OutFirstCustOtherAfmAfmNo")
    protected String outFirstCustOtherAfmAfmNo;
    @XmlElement(name = "OutFirstCustOtherAfmMainFlag")
    protected String outFirstCustOtherAfmMainFlag;
    @XmlElement(name = "OutFirstOtherIdIdNo")
    protected String outFirstOtherIdIdNo;
    @XmlElement(name = "OutFirstOtherIdMainFlag")
    protected String outFirstOtherIdMainFlag;
    @XmlElement(name = "OutFixedLnsInterestDescription")
    protected String outFixedLnsInterestDescription;
    @XmlElement(name = "OutFixedLnsInterestDurationUnit")
    protected String outFixedLnsInterestDurationUnit;
    @XmlElement(name = "OutFixedLnsInterestIdInterest")
    protected int outFixedLnsInterestIdInterest;
    @XmlElement(name = "OutFixedLnsInterestIntDuration")
    protected short outFixedLnsInterestIntDuration;
    @XmlElement(name = "OutFourthCustCustAddressAddress1")
    protected String outFourthCustCustAddressAddress1;
    @XmlElement(name = "OutFourthCustCustAddressCity")
    protected String outFourthCustCustAddressCity;
    @XmlElement(name = "OutFourthCustCustAddressEntryStatus")
    protected String outFourthCustCustAddressEntryStatus;
    @XmlElement(name = "OutFourthCustCustAddressTelephone")
    protected String outFourthCustCustAddressTelephone;
    @XmlElement(name = "OutFourthCustOtherAfmAfmNo")
    protected String outFourthCustOtherAfmAfmNo;
    @XmlElement(name = "OutFourthCustOtherAfmMainFlag")
    protected String outFourthCustOtherAfmMainFlag;
    @XmlElement(name = "OutFourthOtherIdIdNo")
    protected String outFourthOtherIdIdNo;
    @XmlElement(name = "OutFourthOtherIdMainFlag")
    protected String outFourthOtherIdMainFlag;
    @XmlElement(name = "OutGroupLength")
    protected int outGroupLength;
    @XmlElement(name = "OutGrpBalancesLength")
    protected int outGrpBalancesLength;
    @XmlElement(name = "OutGrpBalancesFdTdLength")
    protected int outGrpBalancesFdTdLength;
    @XmlElement(name = "OutIbanCodeCharSuppliedChar37")
    protected String outIbanCodeCharSuppliedChar37;
    @XmlElement(name = "OutIefSuppliedActionEntryDesc")
    protected String outIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutIefSuppliedSrvStatus")
    protected String outIefSuppliedSrvStatus;
    @XmlElement(name = "OutIssueOfficeUnitCode")
    protected int outIssueOfficeUnitCode;
    @XmlElement(name = "OutIssueOfficeUnitUnitName")
    protected String outIssueOfficeUnitUnitName;
    @XmlElement(name = "OutKekGenericDetailDescription")
    protected String outKekGenericDetailDescription;
    @XmlElement(name = "OutKekGenericDetailSerialNum")
    protected int outKekGenericDetailSerialNum;
    @XmlElement(name = "OutLnsCommissionDescription")
    protected String outLnsCommissionDescription;
    @XmlElement(name = "OutLnsCommissionIdCommission")
    protected int outLnsCommissionIdCommission;
    @XmlElement(name = "OutLoanAccountRecyclingFrequency")
    protected short outLoanAccountRecyclingFrequency;
    @XmlElement(name = "OutLpurpGenericDetailDescription")
    protected String outLpurpGenericDetailDescription;
    @XmlElement(name = "OutLpurpGenericDetailSerialNum")
    protected int outLpurpGenericDetailSerialNum;
    @XmlElement(name = "OutMaxBalOdMinMaxBalMaxBalance01", required = true)
    protected BigDecimal outMaxBalOdMinMaxBalMaxBalance01;
    @XmlElement(name = "OutMaxBalOdMinMaxBalMaxBalDate01", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outMaxBalOdMinMaxBalMaxBalDate01;
    @XmlElement(name = "OutMinBalOdMinMaxBalMinBalance01", required = true)
    protected BigDecimal outMinBalOdMinMaxBalMinBalance01;
    @XmlElement(name = "OutMinBalOdMinMaxBalMinBalDate01", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outMinBalOdMinMaxBalMinBalDate01;
    @XmlElement(name = "OutMonitorBankemployeeId")
    protected String outMonitorBankemployeeId;
    @XmlElement(name = "OutMonitorEmployeeLnsSuppliedName")
    protected String outMonitorEmployeeLnsSuppliedName;
    @XmlElement(name = "OutN128HintScalePercentage00", required = true)
    protected BigDecimal outN128HintScalePercentage00;
    @XmlElement(name = "OutN128LnsInterestDescription")
    protected String outN128LnsInterestDescription;
    @XmlElement(name = "OutN128LnsInterestForDebit")
    protected String outN128LnsInterestForDebit;
    @XmlElement(name = "OutN128LnsInterestIdInterest")
    protected int outN128LnsInterestIdInterest;
    @XmlElement(name = "OutOdDbIntHintScaleLowLimit", required = true)
    protected BigDecimal outOdDbIntHintScaleLowLimit;
    @XmlElement(name = "OutOdDbIntHintScalePercentage00", required = true)
    protected BigDecimal outOdDbIntHintScalePercentage00;
    @XmlElement(name = "OutOdDbIntHintScaleUpLimit", required = true)
    protected BigDecimal outOdDbIntHintScaleUpLimit;
    @XmlElement(name = "OutOneAccountIefSuppliedFlag")
    protected String outOneAccountIefSuppliedFlag;
    @XmlElement(name = "OutOneAccountProfitsAccountAccountCd")
    protected short outOneAccountProfitsAccountAccountCd;
    @XmlElement(name = "OutOneAccountProfitsAccountAccountNumber")
    protected String outOneAccountProfitsAccountAccountNumber;
    @XmlElement(name = "OutOneAccountProfitsAccountAccStatus")
    protected String outOneAccountProfitsAccountAccStatus;
    @XmlElement(name = "OutOneAccountProfitsAccountAgrMembershipSn")
    protected int outOneAccountProfitsAccountAgrMembershipSn;
    @XmlElement(name = "OutOneAccountProfitsAccountAgrSn")
    protected int outOneAccountProfitsAccountAgrSn;
    @XmlElement(name = "OutOneAccountProfitsAccountAgrUnit")
    protected int outOneAccountProfitsAccountAgrUnit;
    @XmlElement(name = "OutOneAccountProfitsAccountAgrYear")
    protected short outOneAccountProfitsAccountAgrYear;
    @XmlElement(name = "OutOneAccountProfitsAccountCDigit")
    protected short outOneAccountProfitsAccountCDigit;
    @XmlElement(name = "OutOneAccountProfitsAccountCustId")
    protected int outOneAccountProfitsAccountCustId;
    @XmlElement(name = "OutOneAccountProfitsAccountDepAccNumber")
    protected double outOneAccountProfitsAccountDepAccNumber;
    @XmlElement(name = "OutOneAccountProfitsAccountDepOpenUnit")
    protected int outOneAccountProfitsAccountDepOpenUnit;
    @XmlElement(name = "OutOneAccountProfitsAccountLgAccSn")
    protected double outOneAccountProfitsAccountLgAccSn;
    @XmlElement(name = "OutOneAccountProfitsAccountLgOpenUnit")
    protected int outOneAccountProfitsAccountLgOpenUnit;
    @XmlElement(name = "OutOneAccountProfitsAccountLimitCurrency")
    protected int outOneAccountProfitsAccountLimitCurrency;
    @XmlElement(name = "OutOneAccountProfitsAccountLnsOpenUnit")
    protected int outOneAccountProfitsAccountLnsOpenUnit;
    @XmlElement(name = "OutOneAccountProfitsAccountLnsSn")
    protected int outOneAccountProfitsAccountLnsSn;
    @XmlElement(name = "OutOneAccountProfitsAccountLnsType")
    protected short outOneAccountProfitsAccountLnsType;
    @XmlElement(name = "OutOneAccountProfitsAccountMonotoringUnit")
    protected int outOneAccountProfitsAccountMonotoringUnit;
    @XmlElement(name = "OutOneAccountProfitsAccountMovementCurrency")
    protected int outOneAccountProfitsAccountMovementCurrency;
    @XmlElement(name = "OutOneAccountProfitsAccountPrftSystem")
    protected short outOneAccountProfitsAccountPrftSystem;
    @XmlElement(name = "OutOneAccountProfitsAccountProductId")
    protected int outOneAccountProfitsAccountProductId;
    @XmlElement(name = "OutOneAccountProfitsAccountTrOpenUnit")
    protected int outOneAccountProfitsAccountTrOpenUnit;
    @XmlElement(name = "OutOneAccountProfitsAccountTrSn")
    protected int outOneAccountProfitsAccountTrSn;
    @XmlElement(name = "OutOneAccountProfitsAccountTrType")
    protected short outOneAccountProfitsAccountTrType;
    @XmlElement(name = "OutOpenedUserLnsSuppliedName")
    protected String outOpenedUserLnsSuppliedName;
    @XmlElement(name = "OutOpenUsrCode")
    protected String outOpenUsrCode;
    @XmlElement(name = "OutOverdrCurrentPeriodIefSuppliedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outOverdrCurrentPeriodIefSuppliedDate;
    @XmlElement(name = "OutOverdrCurrentPeriodIefSuppliedText15")
    protected String outOverdrCurrentPeriodIefSuppliedText15;
    @XmlElement(name = "OutPrftTransactionDescription")
    protected String outPrftTransactionDescription;
    @XmlElement(name = "OutPrftTransactionIdTransact")
    protected int outPrftTransactionIdTransact;
    @XmlElement(name = "OutProductDescription")
    protected String outProductDescription;
    @XmlElement(name = "OutProductIdProduct")
    protected int outProductIdProduct;
    @XmlElement(name = "OutProffForFifthCustGenericDetailSerialNum")
    protected int outProffForFifthCustGenericDetailSerialNum;
    @XmlElement(name = "OutProffForFourthCustGenericDetailSerialNum")
    protected int outProffForFourthCustGenericDetailSerialNum;
    @XmlElement(name = "OutProffForSecCustGenericDetailSerialNum")
    protected int outProffForSecCustGenericDetailSerialNum;
    @XmlElement(name = "OutProffForThirdCustGenericDetailSerialNum")
    protected int outProffForThirdCustGenericDetailSerialNum;
    @XmlElement(name = "OutProfGenericDetailDescription")
    protected String outProfGenericDetailDescription;
    @XmlElement(name = "OutProfGenericDetailSerialNum")
    protected int outProfGenericDetailSerialNum;
    @XmlElement(name = "OutSalePersonGenericDetailDescription")
    protected String outSalePersonGenericDetailDescription;
    @XmlElement(name = "OutSalePersonGenericDetailShortDescription")
    protected String outSalePersonGenericDetailShortDescription;
    @XmlElement(name = "OutSaleUnitGenericDetailDescription")
    protected String outSaleUnitGenericDetailDescription;
    @XmlElement(name = "OutSaleUnitGenericDetailSerialNum")
    protected int outSaleUnitGenericDetailSerialNum;
    @XmlElement(name = "OutSecCustCustAddressAddress1")
    protected String outSecCustCustAddressAddress1;
    @XmlElement(name = "OutSecCustCustAddressCity")
    protected String outSecCustCustAddressCity;
    @XmlElement(name = "OutSecCustCustAddressEntryStatus")
    protected String outSecCustCustAddressEntryStatus;
    @XmlElement(name = "OutSecCustCustAddressTelephone")
    protected String outSecCustCustAddressTelephone;
    @XmlElement(name = "OutSecCustOtherAfmAfmNo")
    protected String outSecCustOtherAfmAfmNo;
    @XmlElement(name = "OutSecCustOtherAfmMainFlag")
    protected String outSecCustOtherAfmMainFlag;
    @XmlElement(name = "OutSecondCredLnsInterestDescription")
    protected String outSecondCredLnsInterestDescription;
    @XmlElement(name = "OutSecondCredLnsInterestIdInterest")
    protected int outSecondCredLnsInterestIdInterest;
    @XmlElement(name = "OutSecondOtherIdIdNo")
    protected String outSecondOtherIdIdNo;
    @XmlElement(name = "OutSecondOtherIdMainFlag")
    protected String outSecondOtherIdMainFlag;
    @XmlElement(name = "OutSecretConfirmDepositAccountSecretAccFlag")
    protected String outSecretConfirmDepositAccountSecretAccFlag;
    @XmlElement(name = "OutServiceDepositAccountAccountNumber")
    protected double outServiceDepositAccountAccountNumber;
    @XmlElement(name = "OutServiceDepositAccountCDigit")
    protected short outServiceDepositAccountCDigit;
    @XmlElement(name = "OutServicesProfitsAccountAccountNumber")
    protected String outServicesProfitsAccountAccountNumber;
    @XmlElement(name = "OutSumRetainInterResCrIntAmn", required = true)
    protected BigDecimal outSumRetainInterResCrIntAmn;
    @XmlElement(name = "OutTaxCountryGenericDetailDescription")
    protected String outTaxCountryGenericDetailDescription;
    @XmlElement(name = "OutTaxCountryGenericDetailShortDescription")
    protected String outTaxCountryGenericDetailShortDescription;
    @XmlElement(name = "OutThirdCustCustAddressAddress1")
    protected String outThirdCustCustAddressAddress1;
    @XmlElement(name = "OutThirdCustCustAddressCity")
    protected String outThirdCustCustAddressCity;
    @XmlElement(name = "OutThirdCustCustAddressEntryStatus")
    protected String outThirdCustCustAddressEntryStatus;
    @XmlElement(name = "OutThirdCustCustAddressTelephone")
    protected String outThirdCustCustAddressTelephone;
    @XmlElement(name = "OutThirdCustOtherAfmAfmNo")
    protected String outThirdCustOtherAfmAfmNo;
    @XmlElement(name = "OutThirdCustOtherAfmMainFlag")
    protected String outThirdCustOtherAfmMainFlag;
    @XmlElement(name = "OutThirdOtherIdIdNo")
    protected String outThirdOtherIdIdNo;
    @XmlElement(name = "OutThirdOtherIdMainFlag")
    protected String outThirdOtherIdMainFlag;
    @XmlElement(name = "OutTimeDeposRenewalDaysDuration")
    protected short outTimeDeposRenewalDaysDuration;
    @XmlElement(name = "OutTimeDeposRenewalDurationUnit")
    protected String outTimeDeposRenewalDurationUnit;
    @XmlElement(name = "OutTimeDeposRenewalDurationValue")
    protected short outTimeDeposRenewalDurationValue;
    @XmlElement(name = "OutTimeDeposRenewalExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTimeDeposRenewalExpiryDate;
    @XmlElement(name = "OutTimeDeposRenewalRenewalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTimeDeposRenewalRenewalDate;
    @XmlElement(name = "OutTimeDeposRenewalStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTimeDeposRenewalStartDate;
    @XmlElement(name = "OutTotAccrDbInterestIefSuppliedNumber152", required = true)
    protected BigDecimal outTotAccrDbInterestIefSuppliedNumber152;
    @XmlElement(name = "OutTotDepAccountTotalTotalCredit01", required = true)
    protected BigDecimal outTotDepAccountTotalTotalCredit01;
    @XmlElement(name = "OutTotDepAccountTotalTotalDebit01", required = true)
    protected BigDecimal outTotDepAccountTotalTotalDebit01;
    @XmlElement(name = "OutTotFdTdDepAccountTotalTotalCredit01", required = true)
    protected BigDecimal outTotFdTdDepAccountTotalTotalCredit01;
    @XmlElement(name = "OutTotFdTdDepAccountTotalTotalDebit01", required = true)
    protected BigDecimal outTotFdTdDepAccountTotalTotalDebit01;
    @XmlElement(name = "OutUpdateUsrCode")
    protected String outUpdateUsrCode;
    @XmlElement(name = "OutUpdateUsrLnsSuppliedName")
    protected String outUpdateUsrLnsSuppliedName;
    @XmlElement(name = "OutWithdrawDayFromIefSuppliedDays")
    protected int outWithdrawDayFromIefSuppliedDays;
    @XmlElement(name = "OutWithdrawDayFromIefSuppliedMonth")
    protected short outWithdrawDayFromIefSuppliedMonth;
    @XmlElement(name = "OutWithdrawDayToIefSuppliedDays")
    protected int outWithdrawDayToIefSuppliedDays;
    @XmlElement(name = "OutWithdrawDayToIefSuppliedMonth")
    protected short outWithdrawDayToIefSuppliedMonth;
    @XmlElement(name = "OutOpenUnitCommentsIefSuppliedText40")
    protected String outOpenUnitCommentsIefSuppliedText40;
    @XmlElement(name = "OutGroup")
    protected ArrayOfOutGroupD outGroup;
    @XmlElement(name = "OutGrpBalances")
    protected ArrayOfOutGrpBalances outGrpBalances;
    @XmlElement(name = "OutGrpBalancesFdTd")
    protected ArrayOfOutGrpBalancesFdTd outGrpBalancesFdTd;
    @XmlElement(name = "OutAgrProfitsAccountAccountCd")
    protected short outAgrProfitsAccountAccountCd;
    @XmlElement(name = "OutDaysInExcessIefSuppliedNum5")
    protected int outDaysInExcessIefSuppliedNum5;
    @XmlElement(name = "OutAccStatusIefSuppliedOverdraftAccStatus")
    protected String outAccStatusIefSuppliedOverdraftAccStatus;
    @XmlElement(name = "OutDepositAccountLastDormantDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDepositAccountLastDormantDate;
    @XmlElement(name = "OutRefereeNameIefSuppliedChar100")
    protected String outRefereeNameIefSuppliedChar100;
    @XmlElement(name = "OutRefereeAccNoIefSuppliedChar100")
    protected String outRefereeAccNoIefSuppliedChar100;
    @XmlElement(name = "OutDepositAccountFreeText3IefSuppliedChar100")
    protected String outDepositAccountFreeText3IefSuppliedChar100;
    @XmlElement(name = "OutDepositAccountFreeText4IefSuppliedChar100")
    protected String outDepositAccountFreeText4IefSuppliedChar100;
    @XmlElement(name = "OutDepositAccountFreeText5IefSuppliedChar100")
    protected String outDepositAccountFreeText5IefSuppliedChar100;
    @XmlElement(name = "OutCrmCodeGenericDetailSerialNum")
    protected int outCrmCodeGenericDetailSerialNum;
    @XmlElement(name = "OutCrmCodeGenericDetailDescription")
    protected String outCrmCodeGenericDetailDescription;
    @XmlElement(name = "OutDaysInDormantStatusIefSuppliedNum5")
    protected int outDaysInDormantStatusIefSuppliedNum5;
    @XmlElement(name = "OutDaysSinceLastTrxDateIefSuppliedNum5")
    protected int outDaysSinceLastTrxDateIefSuppliedNum5;

    /**
     * Gets the value of the customerLnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerLnsSuppliedName() {
        return customerLnsSuppliedName;
    }

    /**
     * Sets the value of the customerLnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerLnsSuppliedName(String value) {
        this.customerLnsSuppliedName = value;
    }

    /**
     * Gets the value of the outAccTypeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAccTypeGenericDetailDescription() {
        return outAccTypeGenericDetailDescription;
    }

    /**
     * Sets the value of the outAccTypeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAccTypeGenericDetailDescription(String value) {
        this.outAccTypeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outAccTypeGenericDetailSerialNum property.
     * 
     */
    public int getOutAccTypeGenericDetailSerialNum() {
        return outAccTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outAccTypeGenericDetailSerialNum property.
     * 
     */
    public void setOutAccTypeGenericDetailSerialNum(int value) {
        this.outAccTypeGenericDetailSerialNum = value;
    }

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
     * Gets the value of the outAccUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAccUnitUnitName() {
        return outAccUnitUnitName;
    }

    /**
     * Sets the value of the outAccUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAccUnitUnitName(String value) {
        this.outAccUnitUnitName = value;
    }

    /**
     * Gets the value of the outAccWithdrDepositAccountAvailableBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAccWithdrDepositAccountAvailableBalance() {
        return outAccWithdrDepositAccountAvailableBalance;
    }

    /**
     * Sets the value of the outAccWithdrDepositAccountAvailableBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAccWithdrDepositAccountAvailableBalance(BigDecimal value) {
        this.outAccWithdrDepositAccountAvailableBalance = value;
    }

    /**
     * Gets the value of the outAchBnkCollaborationBanksAchBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAchBnkCollaborationBanksAchBankCode() {
        return outAchBnkCollaborationBanksAchBankCode;
    }

    /**
     * Sets the value of the outAchBnkCollaborationBanksAchBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAchBnkCollaborationBanksAchBankCode(String value) {
        this.outAchBnkCollaborationBanksAchBankCode = value;
    }

    /**
     * Gets the value of the outAchBnkCollaborationBanksBankId property.
     * 
     */
    public int getOutAchBnkCollaborationBanksBankId() {
        return outAchBnkCollaborationBanksBankId;
    }

    /**
     * Sets the value of the outAchBnkCollaborationBanksBankId property.
     * 
     */
    public void setOutAchBnkCollaborationBanksBankId(int value) {
        this.outAchBnkCollaborationBanksBankId = value;
    }

    /**
     * Gets the value of the outAchBnkCollaborationBanksBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAchBnkCollaborationBanksBankName() {
        return outAchBnkCollaborationBanksBankName;
    }

    /**
     * Sets the value of the outAchBnkCollaborationBanksBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAchBnkCollaborationBanksBankName(String value) {
        this.outAchBnkCollaborationBanksBankName = value;
    }

    /**
     * Gets the value of the outAchBnkCollaborationBanksEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAchBnkCollaborationBanksEntryStatus() {
        return outAchBnkCollaborationBanksEntryStatus;
    }

    /**
     * Sets the value of the outAchBnkCollaborationBanksEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAchBnkCollaborationBanksEntryStatus(String value) {
        this.outAchBnkCollaborationBanksEntryStatus = value;
    }

    /**
     * Gets the value of the outAddExcesLnsInterestDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAddExcesLnsInterestDescription() {
        return outAddExcesLnsInterestDescription;
    }

    /**
     * Sets the value of the outAddExcesLnsInterestDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAddExcesLnsInterestDescription(String value) {
        this.outAddExcesLnsInterestDescription = value;
    }

    /**
     * Gets the value of the outAddExcesLnsInterestIdInterest property.
     * 
     */
    public int getOutAddExcesLnsInterestIdInterest() {
        return outAddExcesLnsInterestIdInterest;
    }

    /**
     * Sets the value of the outAddExcesLnsInterestIdInterest property.
     * 
     */
    public void setOutAddExcesLnsInterestIdInterest(int value) {
        this.outAddExcesLnsInterestIdInterest = value;
    }

    /**
     * Gets the value of the outAgrProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgrProfitsAccountAccountNumber() {
        return outAgrProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outAgrProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgrProfitsAccountAccountNumber(String value) {
        this.outAgrProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outAgrUnitCode property.
     * 
     */
    public int getOutAgrUnitCode() {
        return outAgrUnitCode;
    }

    /**
     * Sets the value of the outAgrUnitCode property.
     * 
     */
    public void setOutAgrUnitCode(int value) {
        this.outAgrUnitCode = value;
    }

    /**
     * Gets the value of the outAgreementAgrMembershipSn property.
     * 
     */
    public int getOutAgreementAgrMembershipSn() {
        return outAgreementAgrMembershipSn;
    }

    /**
     * Sets the value of the outAgreementAgrMembershipSn property.
     * 
     */
    public void setOutAgreementAgrMembershipSn(int value) {
        this.outAgreementAgrMembershipSn = value;
    }

    /**
     * Gets the value of the outAgreementAgrSn property.
     * 
     */
    public int getOutAgreementAgrSn() {
        return outAgreementAgrSn;
    }

    /**
     * Sets the value of the outAgreementAgrSn property.
     * 
     */
    public void setOutAgreementAgrSn(int value) {
        this.outAgreementAgrSn = value;
    }

    /**
     * Gets the value of the outAgreementAgrYear property.
     * 
     */
    public short getOutAgreementAgrYear() {
        return outAgreementAgrYear;
    }

    /**
     * Sets the value of the outAgreementAgrYear property.
     * 
     */
    public void setOutAgreementAgrYear(short value) {
        this.outAgreementAgrYear = value;
    }

    /**
     * Gets the value of the outAvgBaDepAccountTotalTotalProducts01 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAvgBaDepAccountTotalTotalProducts01() {
        return outAvgBaDepAccountTotalTotalProducts01;
    }

    /**
     * Sets the value of the outAvgBaDepAccountTotalTotalProducts01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAvgBaDepAccountTotalTotalProducts01(BigDecimal value) {
        this.outAvgBaDepAccountTotalTotalProducts01 = value;
    }

    /**
     * Gets the value of the outAvgBal12MthFdTdDepAccountTotalTotalProducts01 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAvgBal12MthFdTdDepAccountTotalTotalProducts01() {
        return outAvgBal12MthFdTdDepAccountTotalTotalProducts01;
    }

    /**
     * Sets the value of the outAvgBal12MthFdTdDepAccountTotalTotalProducts01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAvgBal12MthFdTdDepAccountTotalTotalProducts01(BigDecimal value) {
        this.outAvgBal12MthFdTdDepAccountTotalTotalProducts01 = value;
    }

    /**
     * Gets the value of the outAvgBalCurrYearDepAccountTotalTotalProducts01 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAvgBalCurrYearDepAccountTotalTotalProducts01() {
        return outAvgBalCurrYearDepAccountTotalTotalProducts01;
    }

    /**
     * Sets the value of the outAvgBalCurrYearDepAccountTotalTotalProducts01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAvgBalCurrYearDepAccountTotalTotalProducts01(BigDecimal value) {
        this.outAvgBalCurrYearDepAccountTotalTotalProducts01 = value;
    }

    /**
     * Gets the value of the outAvgBalPrevYearDepAccountTotalTotalProducts01 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAvgBalPrevYearDepAccountTotalTotalProducts01() {
        return outAvgBalPrevYearDepAccountTotalTotalProducts01;
    }

    /**
     * Sets the value of the outAvgBalPrevYearDepAccountTotalTotalProducts01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAvgBalPrevYearDepAccountTotalTotalProducts01(BigDecimal value) {
        this.outAvgBalPrevYearDepAccountTotalTotalProducts01 = value;
    }

    /**
     * Gets the value of the outAvgBalPrevYearFdTdDepAccountTotalTotalProducts01 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAvgBalPrevYearFdTdDepAccountTotalTotalProducts01() {
        return outAvgBalPrevYearFdTdDepAccountTotalTotalProducts01;
    }

    /**
     * Sets the value of the outAvgBalPrevYearFdTdDepAccountTotalTotalProducts01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAvgBalPrevYearFdTdDepAccountTotalTotalProducts01(BigDecimal value) {
        this.outAvgBalPrevYearFdTdDepAccountTotalTotalProducts01 = value;
    }

    /**
     * Gets the value of the outBlockIefSuppliedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBlockIefSuppliedDate() {
        return outBlockIefSuppliedDate;
    }

    /**
     * Sets the value of the outBlockIefSuppliedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBlockIefSuppliedDate(XMLGregorianCalendar value) {
        this.outBlockIefSuppliedDate = value;
    }

    /**
     * Gets the value of the outBlockIefSuppliedText40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBlockIefSuppliedText40() {
        return outBlockIefSuppliedText40;
    }

    /**
     * Sets the value of the outBlockIefSuppliedText40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBlockIefSuppliedText40(String value) {
        this.outBlockIefSuppliedText40 = value;
    }

    /**
     * Gets the value of the outBlockUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBlockUsrCode() {
        return outBlockUsrCode;
    }

    /**
     * Sets the value of the outBlockUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBlockUsrCode(String value) {
        this.outBlockUsrCode = value;
    }

    /**
     * Gets the value of the outCancelIefSuppliedCount property.
     * 
     */
    public int getOutCancelIefSuppliedCount() {
        return outCancelIefSuppliedCount;
    }

    /**
     * Sets the value of the outCancelIefSuppliedCount property.
     * 
     */
    public void setOutCancelIefSuppliedCount(int value) {
        this.outCancelIefSuppliedCount = value;
    }

    /**
     * Gets the value of the outCapitalDepositAccountAccountNumber property.
     * 
     */
    public double getOutCapitalDepositAccountAccountNumber() {
        return outCapitalDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the outCapitalDepositAccountAccountNumber property.
     * 
     */
    public void setOutCapitalDepositAccountAccountNumber(double value) {
        this.outCapitalDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outCapitalDepositAccountCDigit property.
     * 
     */
    public short getOutCapitalDepositAccountCDigit() {
        return outCapitalDepositAccountCDigit;
    }

    /**
     * Sets the value of the outCapitalDepositAccountCDigit property.
     * 
     */
    public void setOutCapitalDepositAccountCDigit(short value) {
        this.outCapitalDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the outCcodeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCcodeGenericDetailDescription() {
        return outCcodeGenericDetailDescription;
    }

    /**
     * Sets the value of the outCcodeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCcodeGenericDetailDescription(String value) {
        this.outCcodeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outCcodeGenericDetailSerialNum property.
     * 
     */
    public int getOutCcodeGenericDetailSerialNum() {
        return outCcodeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outCcodeGenericDetailSerialNum property.
     * 
     */
    public void setOutCcodeGenericDetailSerialNum(int value) {
        this.outCcodeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outCoben2CustomerCDigit property.
     * 
     */
    public short getOutCoben2CustomerCDigit() {
        return outCoben2CustomerCDigit;
    }

    /**
     * Sets the value of the outCoben2CustomerCDigit property.
     * 
     */
    public void setOutCoben2CustomerCDigit(short value) {
        this.outCoben2CustomerCDigit = value;
    }

    /**
     * Gets the value of the outCoben2CustomerCustId property.
     * 
     */
    public int getOutCoben2CustomerCustId() {
        return outCoben2CustomerCustId;
    }

    /**
     * Sets the value of the outCoben2CustomerCustId property.
     * 
     */
    public void setOutCoben2CustomerCustId(int value) {
        this.outCoben2CustomerCustId = value;
    }

    /**
     * Gets the value of the outCoben2CustomerDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCoben2CustomerDateOfBirth() {
        return outCoben2CustomerDateOfBirth;
    }

    /**
     * Sets the value of the outCoben2CustomerDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCoben2CustomerDateOfBirth(XMLGregorianCalendar value) {
        this.outCoben2CustomerDateOfBirth = value;
    }

    /**
     * Gets the value of the outCoben2LnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCoben2LnsSuppliedName() {
        return outCoben2LnsSuppliedName;
    }

    /**
     * Sets the value of the outCoben2LnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCoben2LnsSuppliedName(String value) {
        this.outCoben2LnsSuppliedName = value;
    }

    /**
     * Gets the value of the outCoben3CustomerCDigit property.
     * 
     */
    public short getOutCoben3CustomerCDigit() {
        return outCoben3CustomerCDigit;
    }

    /**
     * Sets the value of the outCoben3CustomerCDigit property.
     * 
     */
    public void setOutCoben3CustomerCDigit(short value) {
        this.outCoben3CustomerCDigit = value;
    }

    /**
     * Gets the value of the outCoben3CustomerCustId property.
     * 
     */
    public int getOutCoben3CustomerCustId() {
        return outCoben3CustomerCustId;
    }

    /**
     * Sets the value of the outCoben3CustomerCustId property.
     * 
     */
    public void setOutCoben3CustomerCustId(int value) {
        this.outCoben3CustomerCustId = value;
    }

    /**
     * Gets the value of the outCoben3CustomerDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCoben3CustomerDateOfBirth() {
        return outCoben3CustomerDateOfBirth;
    }

    /**
     * Sets the value of the outCoben3CustomerDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCoben3CustomerDateOfBirth(XMLGregorianCalendar value) {
        this.outCoben3CustomerDateOfBirth = value;
    }

    /**
     * Gets the value of the outCoben3LnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCoben3LnsSuppliedName() {
        return outCoben3LnsSuppliedName;
    }

    /**
     * Sets the value of the outCoben3LnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCoben3LnsSuppliedName(String value) {
        this.outCoben3LnsSuppliedName = value;
    }

    /**
     * Gets the value of the outCoben4CustomerCDigit property.
     * 
     */
    public short getOutCoben4CustomerCDigit() {
        return outCoben4CustomerCDigit;
    }

    /**
     * Sets the value of the outCoben4CustomerCDigit property.
     * 
     */
    public void setOutCoben4CustomerCDigit(short value) {
        this.outCoben4CustomerCDigit = value;
    }

    /**
     * Gets the value of the outCoben4CustomerCustId property.
     * 
     */
    public int getOutCoben4CustomerCustId() {
        return outCoben4CustomerCustId;
    }

    /**
     * Sets the value of the outCoben4CustomerCustId property.
     * 
     */
    public void setOutCoben4CustomerCustId(int value) {
        this.outCoben4CustomerCustId = value;
    }

    /**
     * Gets the value of the outCoben4CustomerDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCoben4CustomerDateOfBirth() {
        return outCoben4CustomerDateOfBirth;
    }

    /**
     * Sets the value of the outCoben4CustomerDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCoben4CustomerDateOfBirth(XMLGregorianCalendar value) {
        this.outCoben4CustomerDateOfBirth = value;
    }

    /**
     * Gets the value of the outCoben4LnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCoben4LnsSuppliedName() {
        return outCoben4LnsSuppliedName;
    }

    /**
     * Sets the value of the outCoben4LnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCoben4LnsSuppliedName(String value) {
        this.outCoben4LnsSuppliedName = value;
    }

    /**
     * Gets the value of the outCoben5CustomerCDigit property.
     * 
     */
    public short getOutCoben5CustomerCDigit() {
        return outCoben5CustomerCDigit;
    }

    /**
     * Sets the value of the outCoben5CustomerCDigit property.
     * 
     */
    public void setOutCoben5CustomerCDigit(short value) {
        this.outCoben5CustomerCDigit = value;
    }

    /**
     * Gets the value of the outCoben5CustomerCustId property.
     * 
     */
    public int getOutCoben5CustomerCustId() {
        return outCoben5CustomerCustId;
    }

    /**
     * Sets the value of the outCoben5CustomerCustId property.
     * 
     */
    public void setOutCoben5CustomerCustId(int value) {
        this.outCoben5CustomerCustId = value;
    }

    /**
     * Gets the value of the outCoben5CustomerDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCoben5CustomerDateOfBirth() {
        return outCoben5CustomerDateOfBirth;
    }

    /**
     * Sets the value of the outCoben5CustomerDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCoben5CustomerDateOfBirth(XMLGregorianCalendar value) {
        this.outCoben5CustomerDateOfBirth = value;
    }

    /**
     * Gets the value of the outCoben5LnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCoben5LnsSuppliedName() {
        return outCoben5LnsSuppliedName;
    }

    /**
     * Sets the value of the outCoben5LnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCoben5LnsSuppliedName(String value) {
        this.outCoben5LnsSuppliedName = value;
    }

    /**
     * Gets the value of the outCoben6CustomerCDigit property.
     * 
     */
    public short getOutCoben6CustomerCDigit() {
        return outCoben6CustomerCDigit;
    }

    /**
     * Sets the value of the outCoben6CustomerCDigit property.
     * 
     */
    public void setOutCoben6CustomerCDigit(short value) {
        this.outCoben6CustomerCDigit = value;
    }

    /**
     * Gets the value of the outCoben6CustomerCustId property.
     * 
     */
    public int getOutCoben6CustomerCustId() {
        return outCoben6CustomerCustId;
    }

    /**
     * Sets the value of the outCoben6CustomerCustId property.
     * 
     */
    public void setOutCoben6CustomerCustId(int value) {
        this.outCoben6CustomerCustId = value;
    }

    /**
     * Gets the value of the outCoben6LnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCoben6LnsSuppliedName() {
        return outCoben6LnsSuppliedName;
    }

    /**
     * Sets the value of the outCoben6LnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCoben6LnsSuppliedName(String value) {
        this.outCoben6LnsSuppliedName = value;
    }

    /**
     * Gets the value of the outCoben7CustomerCDigit property.
     * 
     */
    public short getOutCoben7CustomerCDigit() {
        return outCoben7CustomerCDigit;
    }

    /**
     * Sets the value of the outCoben7CustomerCDigit property.
     * 
     */
    public void setOutCoben7CustomerCDigit(short value) {
        this.outCoben7CustomerCDigit = value;
    }

    /**
     * Gets the value of the outCoben7CustomerCustId property.
     * 
     */
    public int getOutCoben7CustomerCustId() {
        return outCoben7CustomerCustId;
    }

    /**
     * Sets the value of the outCoben7CustomerCustId property.
     * 
     */
    public void setOutCoben7CustomerCustId(int value) {
        this.outCoben7CustomerCustId = value;
    }

    /**
     * Gets the value of the outCoben7LnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCoben7LnsSuppliedName() {
        return outCoben7LnsSuppliedName;
    }

    /**
     * Sets the value of the outCoben7LnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCoben7LnsSuppliedName(String value) {
        this.outCoben7LnsSuppliedName = value;
    }

    /**
     * Gets the value of the outCoben8CustomerCDigit property.
     * 
     */
    public short getOutCoben8CustomerCDigit() {
        return outCoben8CustomerCDigit;
    }

    /**
     * Sets the value of the outCoben8CustomerCDigit property.
     * 
     */
    public void setOutCoben8CustomerCDigit(short value) {
        this.outCoben8CustomerCDigit = value;
    }

    /**
     * Gets the value of the outCoben8CustomerCustId property.
     * 
     */
    public int getOutCoben8CustomerCustId() {
        return outCoben8CustomerCustId;
    }

    /**
     * Sets the value of the outCoben8CustomerCustId property.
     * 
     */
    public void setOutCoben8CustomerCustId(int value) {
        this.outCoben8CustomerCustId = value;
    }

    /**
     * Gets the value of the outCoben8LnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCoben8LnsSuppliedName() {
        return outCoben8LnsSuppliedName;
    }

    /**
     * Sets the value of the outCoben8LnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCoben8LnsSuppliedName(String value) {
        this.outCoben8LnsSuppliedName = value;
    }

    /**
     * Gets the value of the outCoben9CustomerCDigit property.
     * 
     */
    public short getOutCoben9CustomerCDigit() {
        return outCoben9CustomerCDigit;
    }

    /**
     * Sets the value of the outCoben9CustomerCDigit property.
     * 
     */
    public void setOutCoben9CustomerCDigit(short value) {
        this.outCoben9CustomerCDigit = value;
    }

    /**
     * Gets the value of the outCoben9CustomerCustId property.
     * 
     */
    public int getOutCoben9CustomerCustId() {
        return outCoben9CustomerCustId;
    }

    /**
     * Sets the value of the outCoben9CustomerCustId property.
     * 
     */
    public void setOutCoben9CustomerCustId(int value) {
        this.outCoben9CustomerCustId = value;
    }

    /**
     * Gets the value of the outCoben9LnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCoben9LnsSuppliedName() {
        return outCoben9LnsSuppliedName;
    }

    /**
     * Sets the value of the outCoben9LnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCoben9LnsSuppliedName(String value) {
        this.outCoben9LnsSuppliedName = value;
    }

    /**
     * Gets the value of the outCrDbCapitalProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCrDbCapitalProfitsAccountAccountNumber() {
        return outCrDbCapitalProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outCrDbCapitalProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCrDbCapitalProfitsAccountAccountNumber(String value) {
        this.outCrDbCapitalProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outCrDbInterestProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCrDbInterestProfitsAccountAccountNumber() {
        return outCrDbInterestProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outCrDbInterestProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCrDbInterestProfitsAccountAccountNumber(String value) {
        this.outCrDbInterestProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outCrHintScalePercentage00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCrHintScalePercentage00() {
        return outCrHintScalePercentage00;
    }

    /**
     * Sets the value of the outCrHintScalePercentage00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCrHintScalePercentage00(BigDecimal value) {
        this.outCrHintScalePercentage00 = value;
    }

    /**
     * Gets the value of the outCrLnsInterestDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCrLnsInterestDescription() {
        return outCrLnsInterestDescription;
    }

    /**
     * Sets the value of the outCrLnsInterestDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCrLnsInterestDescription(String value) {
        this.outCrLnsInterestDescription = value;
    }

    /**
     * Gets the value of the outCrLnsInterestIdInterest property.
     * 
     */
    public int getOutCrLnsInterestIdInterest() {
        return outCrLnsInterestIdInterest;
    }

    /**
     * Sets the value of the outCrLnsInterestIdInterest property.
     * 
     */
    public void setOutCrLnsInterestIdInterest(int value) {
        this.outCrLnsInterestIdInterest = value;
    }

    /**
     * Gets the value of the outCredGradGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCredGradGenericDetailDescription() {
        return outCredGradGenericDetailDescription;
    }

    /**
     * Sets the value of the outCredGradGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCredGradGenericDetailDescription(String value) {
        this.outCredGradGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outCredGradGenericDetailSerialNum property.
     * 
     */
    public int getOutCredGradGenericDetailSerialNum() {
        return outCredGradGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outCredGradGenericDetailSerialNum property.
     * 
     */
    public void setOutCredGradGenericDetailSerialNum(int value) {
        this.outCredGradGenericDetailSerialNum = value;
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
     * Gets the value of the outCustAddInfoInsuranceEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustAddInfoInsuranceEndDate() {
        return outCustAddInfoInsuranceEndDate;
    }

    /**
     * Sets the value of the outCustAddInfoInsuranceEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustAddInfoInsuranceEndDate(XMLGregorianCalendar value) {
        this.outCustAddInfoInsuranceEndDate = value;
    }

    /**
     * Gets the value of the outCustAddressSerialNum property.
     * 
     */
    public short getOutCustAddressSerialNum() {
        return outCustAddressSerialNum;
    }

    /**
     * Sets the value of the outCustAddressSerialNum property.
     * 
     */
    public void setOutCustAddressSerialNum(short value) {
        this.outCustAddressSerialNum = value;
    }

    /**
     * Gets the value of the outCustCategGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustCategGenericDetailDescription() {
        return outCustCategGenericDetailDescription;
    }

    /**
     * Sets the value of the outCustCategGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustCategGenericDetailDescription(String value) {
        this.outCustCategGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outCustCategGenericDetailSerialNum property.
     * 
     */
    public int getOutCustCategGenericDetailSerialNum() {
        return outCustCategGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outCustCategGenericDetailSerialNum property.
     * 
     */
    public void setOutCustCategGenericDetailSerialNum(int value) {
        this.outCustCategGenericDetailSerialNum = value;
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
     * Gets the value of the outCustomerCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerCustType() {
        return outCustomerCustType;
    }

    /**
     * Sets the value of the outCustomerCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerCustType(String value) {
        this.outCustomerCustType = value;
    }

    /**
     * Gets the value of the outCustomerDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustomerDateOfBirth() {
        return outCustomerDateOfBirth;
    }

    /**
     * Sets the value of the outCustomerDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustomerDateOfBirth(XMLGregorianCalendar value) {
        this.outCustomerDateOfBirth = value;
    }

    /**
     * Gets the value of the outDbCrInterDepositAccountAccountNumber property.
     * 
     */
    public double getOutDbCrInterDepositAccountAccountNumber() {
        return outDbCrInterDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the outDbCrInterDepositAccountAccountNumber property.
     * 
     */
    public void setOutDbCrInterDepositAccountAccountNumber(double value) {
        this.outDbCrInterDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outDbCrInterDepositAccountCDigit property.
     * 
     */
    public short getOutDbCrInterDepositAccountCDigit() {
        return outDbCrInterDepositAccountCDigit;
    }

    /**
     * Sets the value of the outDbCrInterDepositAccountCDigit property.
     * 
     */
    public void setOutDbCrInterDepositAccountCDigit(short value) {
        this.outDbCrInterDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the outDbHintScalePercentage00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDbHintScalePercentage00() {
        return outDbHintScalePercentage00;
    }

    /**
     * Sets the value of the outDbHintScalePercentage00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDbHintScalePercentage00(BigDecimal value) {
        this.outDbHintScalePercentage00 = value;
    }

    /**
     * Gets the value of the outDbIntHintScalePercentage00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDbIntHintScalePercentage00() {
        return outDbIntHintScalePercentage00;
    }

    /**
     * Sets the value of the outDbIntHintScalePercentage00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDbIntHintScalePercentage00(BigDecimal value) {
        this.outDbIntHintScalePercentage00 = value;
    }

    /**
     * Gets the value of the outDbLnsInterestDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDbLnsInterestDescription() {
        return outDbLnsInterestDescription;
    }

    /**
     * Sets the value of the outDbLnsInterestDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDbLnsInterestDescription(String value) {
        this.outDbLnsInterestDescription = value;
    }

    /**
     * Gets the value of the outDbLnsInterestIdInterest property.
     * 
     */
    public int getOutDbLnsInterestIdInterest() {
        return outDbLnsInterestIdInterest;
    }

    /**
     * Sets the value of the outDbLnsInterestIdInterest property.
     * 
     */
    public void setOutDbLnsInterestIdInterest(int value) {
        this.outDbLnsInterestIdInterest = value;
    }

    /**
     * Gets the value of the outDepAccountInfoCurFxIntExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDepAccountInfoCurFxIntExpDt() {
        return outDepAccountInfoCurFxIntExpDt;
    }

    /**
     * Sets the value of the outDepAccountInfoCurFxIntExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDepAccountInfoCurFxIntExpDt(XMLGregorianCalendar value) {
        this.outDepAccountInfoCurFxIntExpDt = value;
    }

    /**
     * Gets the value of the outDepAccountInfoCurFxIntStDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDepAccountInfoCurFxIntStDt() {
        return outDepAccountInfoCurFxIntStDt;
    }

    /**
     * Sets the value of the outDepAccountInfoCurFxIntStDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDepAccountInfoCurFxIntStDt(XMLGregorianCalendar value) {
        this.outDepAccountInfoCurFxIntStDt = value;
    }

    /**
     * Gets the value of the outDepAccountInfoOaCollectFreq property.
     * 
     */
    public short getOutDepAccountInfoOaCollectFreq() {
        return outDepAccountInfoOaCollectFreq;
    }

    /**
     * Sets the value of the outDepAccountInfoOaCollectFreq property.
     * 
     */
    public void setOutDepAccountInfoOaCollectFreq(short value) {
        this.outDepAccountInfoOaCollectFreq = value;
    }

    /**
     * Gets the value of the outDepAccountInfoOaCollFreqUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepAccountInfoOaCollFreqUnit() {
        return outDepAccountInfoOaCollFreqUnit;
    }

    /**
     * Sets the value of the outDepAccountInfoOaCollFreqUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepAccountInfoOaCollFreqUnit(String value) {
        this.outDepAccountInfoOaCollFreqUnit = value;
    }

    /**
     * Gets the value of the outDepAccountInfoOaDuration property.
     * 
     */
    public short getOutDepAccountInfoOaDuration() {
        return outDepAccountInfoOaDuration;
    }

    /**
     * Sets the value of the outDepAccountInfoOaDuration property.
     * 
     */
    public void setOutDepAccountInfoOaDuration(short value) {
        this.outDepAccountInfoOaDuration = value;
    }

    /**
     * Gets the value of the outDepAccountInfoOaDurationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepAccountInfoOaDurationUnit() {
        return outDepAccountInfoOaDurationUnit;
    }

    /**
     * Sets the value of the outDepAccountInfoOaDurationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepAccountInfoOaDurationUnit(String value) {
        this.outDepAccountInfoOaDurationUnit = value;
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
     * Gets the value of the outDepositChangeSpreadFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositChangeSpreadFlg() {
        return outDepositChangeSpreadFlg;
    }

    /**
     * Sets the value of the outDepositChangeSpreadFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositChangeSpreadFlg(String value) {
        this.outDepositChangeSpreadFlg = value;
    }

    /**
     * Gets the value of the outDepositChequeBookFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositChequeBookFlag() {
        return outDepositChequeBookFlag;
    }

    /**
     * Sets the value of the outDepositChequeBookFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositChequeBookFlag(String value) {
        this.outDepositChequeBookFlag = value;
    }

    /**
     * Gets the value of the outDepositOverdraftLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositOverdraftLimit() {
        return outDepositOverdraftLimit;
    }

    /**
     * Sets the value of the outDepositOverdraftLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositOverdraftLimit(BigDecimal value) {
        this.outDepositOverdraftLimit = value;
    }

    /**
     * Gets the value of the outDepositAccountAccGroup property.
     * 
     */
    public int getOutDepositAccountAccGroup() {
        return outDepositAccountAccGroup;
    }

    /**
     * Sets the value of the outDepositAccountAccGroup property.
     * 
     */
    public void setOutDepositAccountAccGroup(int value) {
        this.outDepositAccountAccGroup = value;
    }

    /**
     * Gets the value of the outDepositAccountAccountLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountAccountLimit() {
        return outDepositAccountAccountLimit;
    }

    /**
     * Sets the value of the outDepositAccountAccountLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountAccountLimit(BigDecimal value) {
        this.outDepositAccountAccountLimit = value;
    }

    /**
     * Gets the value of the outDepositAccountAccountNumber property.
     * 
     */
    public double getOutDepositAccountAccountNumber() {
        return outDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the outDepositAccountAccountNumber property.
     * 
     */
    public void setOutDepositAccountAccountNumber(double value) {
        this.outDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outDepositAccountAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountAccountType() {
        return outDepositAccountAccountType;
    }

    /**
     * Sets the value of the outDepositAccountAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountAccountType(String value) {
        this.outDepositAccountAccountType = value;
    }

    /**
     * Gets the value of the outDepositAccountAccrCrInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountAccrCrInterest() {
        return outDepositAccountAccrCrInterest;
    }

    /**
     * Sets the value of the outDepositAccountAccrCrInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountAccrCrInterest(BigDecimal value) {
        this.outDepositAccountAccrCrInterest = value;
    }

    /**
     * Gets the value of the outDepositAccountAccrDbInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountAccrDbInterest() {
        return outDepositAccountAccrDbInterest;
    }

    /**
     * Sets the value of the outDepositAccountAccrDbInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountAccrDbInterest(BigDecimal value) {
        this.outDepositAccountAccrDbInterest = value;
    }

    /**
     * Gets the value of the outDepositAccountAccrN128Inter property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountAccrN128Inter() {
        return outDepositAccountAccrN128Inter;
    }

    /**
     * Sets the value of the outDepositAccountAccrN128Inter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountAccrN128Inter(BigDecimal value) {
        this.outDepositAccountAccrN128Inter = value;
    }

    /**
     * Gets the value of the outDepositAccountAkflag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountAkflag() {
        return outDepositAccountAkflag;
    }

    /**
     * Sets the value of the outDepositAccountAkflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountAkflag(String value) {
        this.outDepositAccountAkflag = value;
    }

    /**
     * Gets the value of the outDepositAccountAnnounceTolDays property.
     * 
     */
    public short getOutDepositAccountAnnounceTolDays() {
        return outDepositAccountAnnounceTolDays;
    }

    /**
     * Sets the value of the outDepositAccountAnnounceTolDays property.
     * 
     */
    public void setOutDepositAccountAnnounceTolDays(short value) {
        this.outDepositAccountAnnounceTolDays = value;
    }

    /**
     * Gets the value of the outDepositAccountApprChqAdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDepositAccountApprChqAdate() {
        return outDepositAccountApprChqAdate;
    }

    /**
     * Sets the value of the outDepositAccountApprChqAdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDepositAccountApprChqAdate(XMLGregorianCalendar value) {
        this.outDepositAccountApprChqAdate = value;
    }

    /**
     * Gets the value of the outDepositAccountApprChqCnt property.
     * 
     */
    public int getOutDepositAccountApprChqCnt() {
        return outDepositAccountApprChqCnt;
    }

    /**
     * Sets the value of the outDepositAccountApprChqCnt property.
     * 
     */
    public void setOutDepositAccountApprChqCnt(int value) {
        this.outDepositAccountApprChqCnt = value;
    }

    /**
     * Gets the value of the outDepositAccountApprChqEdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDepositAccountApprChqEdate() {
        return outDepositAccountApprChqEdate;
    }

    /**
     * Sets the value of the outDepositAccountApprChqEdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDepositAccountApprChqEdate(XMLGregorianCalendar value) {
        this.outDepositAccountApprChqEdate = value;
    }

    /**
     * Gets the value of the outDepositAccountApprChqNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountApprChqNo() {
        return outDepositAccountApprChqNo;
    }

    /**
     * Sets the value of the outDepositAccountApprChqNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountApprChqNo(String value) {
        this.outDepositAccountApprChqNo = value;
    }

    /**
     * Gets the value of the outDepositAccountApprChqPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountApprChqPerc() {
        return outDepositAccountApprChqPerc;
    }

    /**
     * Sets the value of the outDepositAccountApprChqPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountApprChqPerc(BigDecimal value) {
        this.outDepositAccountApprChqPerc = value;
    }

    /**
     * Gets the value of the outDepositAccountAtmCardFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountAtmCardFlag() {
        return outDepositAccountAtmCardFlag;
    }

    /**
     * Sets the value of the outDepositAccountAtmCardFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountAtmCardFlag(String value) {
        this.outDepositAccountAtmCardFlag = value;
    }

    /**
     * Gets the value of the outDepositAccountAutomChequeOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountAutomChequeOrder() {
        return outDepositAccountAutomChequeOrder;
    }

    /**
     * Sets the value of the outDepositAccountAutomChequeOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountAutomChequeOrder(String value) {
        this.outDepositAccountAutomChequeOrder = value;
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
     * Gets the value of the outDepositAccountBalanceInterFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountBalanceInterFlag() {
        return outDepositAccountBalanceInterFlag;
    }

    /**
     * Sets the value of the outDepositAccountBalanceInterFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountBalanceInterFlag(String value) {
        this.outDepositAccountBalanceInterFlag = value;
    }

    /**
     * Gets the value of the outDepositAccountBenefAddressSn property.
     * 
     */
    public short getOutDepositAccountBenefAddressSn() {
        return outDepositAccountBenefAddressSn;
    }

    /**
     * Sets the value of the outDepositAccountBenefAddressSn property.
     * 
     */
    public void setOutDepositAccountBenefAddressSn(short value) {
        this.outDepositAccountBenefAddressSn = value;
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
     * Gets the value of the outDepositAccountBlockedStsExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDepositAccountBlockedStsExpiry() {
        return outDepositAccountBlockedStsExpiry;
    }

    /**
     * Sets the value of the outDepositAccountBlockedStsExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDepositAccountBlockedStsExpiry(XMLGregorianCalendar value) {
        this.outDepositAccountBlockedStsExpiry = value;
    }

    /**
     * Gets the value of the outDepositAccountBoePercentance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountBoePercentance() {
        return outDepositAccountBoePercentance;
    }

    /**
     * Sets the value of the outDepositAccountBoePercentance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountBoePercentance(BigDecimal value) {
        this.outDepositAccountBoePercentance = value;
    }

    /**
     * Gets the value of the outDepositAccountBoeSpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountBoeSpread() {
        return outDepositAccountBoeSpread;
    }

    /**
     * Sets the value of the outDepositAccountBoeSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountBoeSpread(BigDecimal value) {
        this.outDepositAccountBoeSpread = value;
    }

    /**
     * Gets the value of the outDepositAccountBondNumber property.
     * 
     */
    public double getOutDepositAccountBondNumber() {
        return outDepositAccountBondNumber;
    }

    /**
     * Sets the value of the outDepositAccountBondNumber property.
     * 
     */
    public void setOutDepositAccountBondNumber(double value) {
        this.outDepositAccountBondNumber = value;
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
     * Gets the value of the outDepositAccountBookNo property.
     * 
     */
    public int getOutDepositAccountBookNo() {
        return outDepositAccountBookNo;
    }

    /**
     * Sets the value of the outDepositAccountBookNo property.
     * 
     */
    public void setOutDepositAccountBookNo(int value) {
        this.outDepositAccountBookNo = value;
    }

    /**
     * Gets the value of the outDepositAccountCapIncreaseAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountCapIncreaseAmn() {
        return outDepositAccountCapIncreaseAmn;
    }

    /**
     * Sets the value of the outDepositAccountCapIncreaseAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountCapIncreaseAmn(BigDecimal value) {
        this.outDepositAccountCapIncreaseAmn = value;
    }

    /**
     * Gets the value of the outDepositAccountCDigit property.
     * 
     */
    public short getOutDepositAccountCDigit() {
        return outDepositAccountCDigit;
    }

    /**
     * Sets the value of the outDepositAccountCDigit property.
     * 
     */
    public void setOutDepositAccountCDigit(short value) {
        this.outDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the outDepositAccountChequeBooksCount property.
     * 
     */
    public int getOutDepositAccountChequeBooksCount() {
        return outDepositAccountChequeBooksCount;
    }

    /**
     * Sets the value of the outDepositAccountChequeBooksCount property.
     * 
     */
    public void setOutDepositAccountChequeBooksCount(int value) {
        this.outDepositAccountChequeBooksCount = value;
    }

    /**
     * Gets the value of the outDepositAccountChequesAnncCnt property.
     * 
     */
    public int getOutDepositAccountChequesAnncCnt() {
        return outDepositAccountChequesAnncCnt;
    }

    /**
     * Sets the value of the outDepositAccountChequesAnncCnt property.
     * 
     */
    public void setOutDepositAccountChequesAnncCnt(int value) {
        this.outDepositAccountChequesAnncCnt = value;
    }

    /**
     * Gets the value of the outDepositAccountChequesBadCount property.
     * 
     */
    public int getOutDepositAccountChequesBadCount() {
        return outDepositAccountChequesBadCount;
    }

    /**
     * Sets the value of the outDepositAccountChequesBadCount property.
     * 
     */
    public void setOutDepositAccountChequesBadCount(int value) {
        this.outDepositAccountChequesBadCount = value;
    }

    /**
     * Gets the value of the outDepositAccountChequesBadTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountChequesBadTotal() {
        return outDepositAccountChequesBadTotal;
    }

    /**
     * Sets the value of the outDepositAccountChequesBadTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountChequesBadTotal(BigDecimal value) {
        this.outDepositAccountChequesBadTotal = value;
    }

    /**
     * Gets the value of the outDepositAccountChequesItemCount property.
     * 
     */
    public int getOutDepositAccountChequesItemCount() {
        return outDepositAccountChequesItemCount;
    }

    /**
     * Sets the value of the outDepositAccountChequesItemCount property.
     * 
     */
    public void setOutDepositAccountChequesItemCount(int value) {
        this.outDepositAccountChequesItemCount = value;
    }

    /**
     * Gets the value of the outDepositAccountChequesPaidCount property.
     * 
     */
    public int getOutDepositAccountChequesPaidCount() {
        return outDepositAccountChequesPaidCount;
    }

    /**
     * Sets the value of the outDepositAccountChequesPaidCount property.
     * 
     */
    public void setOutDepositAccountChequesPaidCount(int value) {
        this.outDepositAccountChequesPaidCount = value;
    }

    /**
     * Gets the value of the outDepositAccountChequesPanncCnt property.
     * 
     */
    public int getOutDepositAccountChequesPanncCnt() {
        return outDepositAccountChequesPanncCnt;
    }

    /**
     * Sets the value of the outDepositAccountChequesPanncCnt property.
     * 
     */
    public void setOutDepositAccountChequesPanncCnt(int value) {
        this.outDepositAccountChequesPanncCnt = value;
    }

    /**
     * Gets the value of the outDepositAccountChequesPstampCnt property.
     * 
     */
    public int getOutDepositAccountChequesPstampCnt() {
        return outDepositAccountChequesPstampCnt;
    }

    /**
     * Sets the value of the outDepositAccountChequesPstampCnt property.
     * 
     */
    public void setOutDepositAccountChequesPstampCnt(int value) {
        this.outDepositAccountChequesPstampCnt = value;
    }

    /**
     * Gets the value of the outDepositAccountChequesRstampCnt property.
     * 
     */
    public int getOutDepositAccountChequesRstampCnt() {
        return outDepositAccountChequesRstampCnt;
    }

    /**
     * Sets the value of the outDepositAccountChequesRstampCnt property.
     * 
     */
    public void setOutDepositAccountChequesRstampCnt(int value) {
        this.outDepositAccountChequesRstampCnt = value;
    }

    /**
     * Gets the value of the outDepositAccountChequesSanncCnt property.
     * 
     */
    public int getOutDepositAccountChequesSanncCnt() {
        return outDepositAccountChequesSanncCnt;
    }

    /**
     * Sets the value of the outDepositAccountChequesSanncCnt property.
     * 
     */
    public void setOutDepositAccountChequesSanncCnt(int value) {
        this.outDepositAccountChequesSanncCnt = value;
    }

    /**
     * Gets the value of the outDepositAccountChequesSstampCnt property.
     * 
     */
    public int getOutDepositAccountChequesSstampCnt() {
        return outDepositAccountChequesSstampCnt;
    }

    /**
     * Sets the value of the outDepositAccountChequesSstampCnt property.
     * 
     */
    public void setOutDepositAccountChequesSstampCnt(int value) {
        this.outDepositAccountChequesSstampCnt = value;
    }

    /**
     * Gets the value of the outDepositAccountChequesStampCoun property.
     * 
     */
    public int getOutDepositAccountChequesStampCoun() {
        return outDepositAccountChequesStampCoun;
    }

    /**
     * Sets the value of the outDepositAccountChequesStampCoun property.
     * 
     */
    public void setOutDepositAccountChequesStampCoun(int value) {
        this.outDepositAccountChequesStampCoun = value;
    }

    /**
     * Gets the value of the outDepositAccountChequesUsedCount property.
     * 
     */
    public int getOutDepositAccountChequesUsedCount() {
        return outDepositAccountChequesUsedCount;
    }

    /**
     * Sets the value of the outDepositAccountChequesUsedCount property.
     * 
     */
    public void setOutDepositAccountChequesUsedCount(int value) {
        this.outDepositAccountChequesUsedCount = value;
    }

    /**
     * Gets the value of the outDepositAccountClosingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDepositAccountClosingDate() {
        return outDepositAccountClosingDate;
    }

    /**
     * Sets the value of the outDepositAccountClosingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDepositAccountClosingDate(XMLGregorianCalendar value) {
        this.outDepositAccountClosingDate = value;
    }

    /**
     * Gets the value of the outDepositAccountCobenefCount property.
     * 
     */
    public short getOutDepositAccountCobenefCount() {
        return outDepositAccountCobenefCount;
    }

    /**
     * Sets the value of the outDepositAccountCobenefCount property.
     * 
     */
    public void setOutDepositAccountCobenefCount(short value) {
        this.outDepositAccountCobenefCount = value;
    }

    /**
     * Gets the value of the outDepositAccountCobenefCountIns property.
     * 
     */
    public short getOutDepositAccountCobenefCountIns() {
        return outDepositAccountCobenefCountIns;
    }

    /**
     * Sets the value of the outDepositAccountCobenefCountIns property.
     * 
     */
    public void setOutDepositAccountCobenefCountIns(short value) {
        this.outDepositAccountCobenefCountIns = value;
    }

    /**
     * Gets the value of the outDepositAccountCobenefSnMail property.
     * 
     */
    public short getOutDepositAccountCobenefSnMail() {
        return outDepositAccountCobenefSnMail;
    }

    /**
     * Sets the value of the outDepositAccountCobenefSnMail property.
     * 
     */
    public void setOutDepositAccountCobenefSnMail(short value) {
        this.outDepositAccountCobenefSnMail = value;
    }

    /**
     * Gets the value of the outDepositAccountColInsertionDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDepositAccountColInsertionDt() {
        return outDepositAccountColInsertionDt;
    }

    /**
     * Sets the value of the outDepositAccountColInsertionDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDepositAccountColInsertionDt(XMLGregorianCalendar value) {
        this.outDepositAccountColInsertionDt = value;
    }

    /**
     * Gets the value of the outDepositAccountCollateralFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountCollateralFlg() {
        return outDepositAccountCollateralFlg;
    }

    /**
     * Sets the value of the outDepositAccountCollateralFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountCollateralFlg(String value) {
        this.outDepositAccountCollateralFlg = value;
    }

    /**
     * Gets the value of the outDepositAccountCorrespAccInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountCorrespAccInd() {
        return outDepositAccountCorrespAccInd;
    }

    /**
     * Sets the value of the outDepositAccountCorrespAccInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountCorrespAccInd(String value) {
        this.outDepositAccountCorrespAccInd = value;
    }

    /**
     * Gets the value of the outDepositAccountCrInterRateSpr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountCrInterRateSpr() {
        return outDepositAccountCrInterRateSpr;
    }

    /**
     * Sets the value of the outDepositAccountCrInterRateSpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountCrInterRateSpr(BigDecimal value) {
        this.outDepositAccountCrInterRateSpr = value;
    }

    /**
     * Gets the value of the outDepositAccountCrIntRtSprdInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountCrIntRtSprdInd() {
        return outDepositAccountCrIntRtSprdInd;
    }

    /**
     * Sets the value of the outDepositAccountCrIntRtSprdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountCrIntRtSprdInd(String value) {
        this.outDepositAccountCrIntRtSprdInd = value;
    }

    /**
     * Gets the value of the outDepositAccountDbInterRateSpr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountDbInterRateSpr() {
        return outDepositAccountDbInterRateSpr;
    }

    /**
     * Sets the value of the outDepositAccountDbInterRateSpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountDbInterRateSpr(BigDecimal value) {
        this.outDepositAccountDbInterRateSpr = value;
    }

    /**
     * Gets the value of the outDepositAccountDbIntRtSprdInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountDbIntRtSprdInd() {
        return outDepositAccountDbIntRtSprdInd;
    }

    /**
     * Sets the value of the outDepositAccountDbIntRtSprdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountDbIntRtSprdInd(String value) {
        this.outDepositAccountDbIntRtSprdInd = value;
    }

    /**
     * Gets the value of the outDepositAccountDefiniteDelay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountDefiniteDelay() {
        return outDepositAccountDefiniteDelay;
    }

    /**
     * Sets the value of the outDepositAccountDefiniteDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountDefiniteDelay(String value) {
        this.outDepositAccountDefiniteDelay = value;
    }

    /**
     * Gets the value of the outDepositAccountDepositType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountDepositType() {
        return outDepositAccountDepositType;
    }

    /**
     * Sets the value of the outDepositAccountDepositType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountDepositType(String value) {
        this.outDepositAccountDepositType = value;
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
     * Gets the value of the outDepositAccountDrawDownWxpDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDepositAccountDrawDownWxpDate() {
        return outDepositAccountDrawDownWxpDate;
    }

    /**
     * Sets the value of the outDepositAccountDrawDownWxpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDepositAccountDrawDownWxpDate(XMLGregorianCalendar value) {
        this.outDepositAccountDrawDownWxpDate = value;
    }

    /**
     * Gets the value of the outDepositAccountDurationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountDurationUnit() {
        return outDepositAccountDurationUnit;
    }

    /**
     * Sets the value of the outDepositAccountDurationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountDurationUnit(String value) {
        this.outDepositAccountDurationUnit = value;
    }

    /**
     * Gets the value of the outDepositAccountDurationValue property.
     * 
     */
    public short getOutDepositAccountDurationValue() {
        return outDepositAccountDurationValue;
    }

    /**
     * Sets the value of the outDepositAccountDurationValue property.
     * 
     */
    public void setOutDepositAccountDurationValue(short value) {
        this.outDepositAccountDurationValue = value;
    }

    /**
     * Gets the value of the outDepositAccountEncroachTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountEncroachTolerance() {
        return outDepositAccountEncroachTolerance;
    }

    /**
     * Sets the value of the outDepositAccountEncroachTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountEncroachTolerance(BigDecimal value) {
        this.outDepositAccountEncroachTolerance = value;
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
     * Gets the value of the outDepositAccountExpCrIntSprd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDepositAccountExpCrIntSprd() {
        return outDepositAccountExpCrIntSprd;
    }

    /**
     * Sets the value of the outDepositAccountExpCrIntSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDepositAccountExpCrIntSprd(XMLGregorianCalendar value) {
        this.outDepositAccountExpCrIntSprd = value;
    }

    /**
     * Gets the value of the outDepositAccountExpDbIntSprd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDepositAccountExpDbIntSprd() {
        return outDepositAccountExpDbIntSprd;
    }

    /**
     * Sets the value of the outDepositAccountExpDbIntSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDepositAccountExpDbIntSprd(XMLGregorianCalendar value) {
        this.outDepositAccountExpDbIntSprd = value;
    }

    /**
     * Gets the value of the outDepositAccountExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDepositAccountExpiryDate() {
        return outDepositAccountExpiryDate;
    }

    /**
     * Sets the value of the outDepositAccountExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDepositAccountExpiryDate(XMLGregorianCalendar value) {
        this.outDepositAccountExpiryDate = value;
    }

    /**
     * Gets the value of the outDepositAccountExpiryDateTd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDepositAccountExpiryDateTd() {
        return outDepositAccountExpiryDateTd;
    }

    /**
     * Sets the value of the outDepositAccountExpiryDateTd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDepositAccountExpiryDateTd(XMLGregorianCalendar value) {
        this.outDepositAccountExpiryDateTd = value;
    }

    /**
     * Gets the value of the outDepositAccountExternalAccFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountExternalAccFlag() {
        return outDepositAccountExternalAccFlag;
    }

    /**
     * Sets the value of the outDepositAccountExternalAccFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountExternalAccFlag(String value) {
        this.outDepositAccountExternalAccFlag = value;
    }

    /**
     * Gets the value of the outDepositAccountExtraitPrintDay property.
     * 
     */
    public short getOutDepositAccountExtraitPrintDay() {
        return outDepositAccountExtraitPrintDay;
    }

    /**
     * Sets the value of the outDepositAccountExtraitPrintDay property.
     * 
     */
    public void setOutDepositAccountExtraitPrintDay(short value) {
        this.outDepositAccountExtraitPrintDay = value;
    }

    /**
     * Gets the value of the outDepositAccountFinalWhldTaxFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountFinalWhldTaxFlg() {
        return outDepositAccountFinalWhldTaxFlg;
    }

    /**
     * Sets the value of the outDepositAccountFinalWhldTaxFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountFinalWhldTaxFlg(String value) {
        this.outDepositAccountFinalWhldTaxFlg = value;
    }

    /**
     * Gets the value of the outDepositAccountFixedInterFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountFixedInterFlag() {
        return outDepositAccountFixedInterFlag;
    }

    /**
     * Sets the value of the outDepositAccountFixedInterFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountFixedInterFlag(String value) {
        this.outDepositAccountFixedInterFlag = value;
    }

    /**
     * Gets the value of the outDepositAccountFixedInterRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountFixedInterRate() {
        return outDepositAccountFixedInterRate;
    }

    /**
     * Sets the value of the outDepositAccountFixedInterRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountFixedInterRate(BigDecimal value) {
        this.outDepositAccountFixedInterRate = value;
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
     * Gets the value of the outDepositAccountHomeBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountHomeBranch() {
        return outDepositAccountHomeBranch;
    }

    /**
     * Sets the value of the outDepositAccountHomeBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountHomeBranch(String value) {
        this.outDepositAccountHomeBranch = value;
    }

    /**
     * Gets the value of the outDepositAccountIncomeAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountIncomeAmnt() {
        return outDepositAccountIncomeAmnt;
    }

    /**
     * Sets the value of the outDepositAccountIncomeAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountIncomeAmnt(BigDecimal value) {
        this.outDepositAccountIncomeAmnt = value;
    }

    /**
     * Gets the value of the outDepositAccountIncomeFrequency property.
     * 
     */
    public int getOutDepositAccountIncomeFrequency() {
        return outDepositAccountIncomeFrequency;
    }

    /**
     * Sets the value of the outDepositAccountIncomeFrequency property.
     * 
     */
    public void setOutDepositAccountIncomeFrequency(int value) {
        this.outDepositAccountIncomeFrequency = value;
    }

    /**
     * Gets the value of the outDepositAccountInitCrBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountInitCrBalance() {
        return outDepositAccountInitCrBalance;
    }

    /**
     * Sets the value of the outDepositAccountInitCrBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountInitCrBalance(BigDecimal value) {
        this.outDepositAccountInitCrBalance = value;
    }

    /**
     * Gets the value of the outDepositAccountInitDbBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountInitDbBalance() {
        return outDepositAccountInitDbBalance;
    }

    /**
     * Sets the value of the outDepositAccountInitDbBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountInitDbBalance(BigDecimal value) {
        this.outDepositAccountInitDbBalance = value;
    }

    /**
     * Gets the value of the outDepositAccountInitValueBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountInitValueBalance() {
        return outDepositAccountInitValueBalance;
    }

    /**
     * Sets the value of the outDepositAccountInitValueBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountInitValueBalance(BigDecimal value) {
        this.outDepositAccountInitValueBalance = value;
    }

    /**
     * Gets the value of the outDepositAccountInspectionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDepositAccountInspectionDate() {
        return outDepositAccountInspectionDate;
    }

    /**
     * Sets the value of the outDepositAccountInspectionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDepositAccountInspectionDate(XMLGregorianCalendar value) {
        this.outDepositAccountInspectionDate = value;
    }

    /**
     * Gets the value of the outDepositAccountInterestPayInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountInterestPayInd() {
        return outDepositAccountInterestPayInd;
    }

    /**
     * Sets the value of the outDepositAccountInterestPayInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountInterestPayInd(String value) {
        this.outDepositAccountInterestPayInd = value;
    }

    /**
     * Gets the value of the outDepositAccountInterestToWithdr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountInterestToWithdr() {
        return outDepositAccountInterestToWithdr;
    }

    /**
     * Sets the value of the outDepositAccountInterestToWithdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountInterestToWithdr(BigDecimal value) {
        this.outDepositAccountInterestToWithdr = value;
    }

    /**
     * Gets the value of the outDepositAccountInterPayOptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountInterPayOptions() {
        return outDepositAccountInterPayOptions;
    }

    /**
     * Sets the value of the outDepositAccountInterPayOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountInterPayOptions(String value) {
        this.outDepositAccountInterPayOptions = value;
    }

    /**
     * Gets the value of the outDepositAccountLastBatchDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDepositAccountLastBatchDate() {
        return outDepositAccountLastBatchDate;
    }

    /**
     * Sets the value of the outDepositAccountLastBatchDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDepositAccountLastBatchDate(XMLGregorianCalendar value) {
        this.outDepositAccountLastBatchDate = value;
    }

    /**
     * Gets the value of the outDepositAccountLastIntAvgBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountLastIntAvgBalance() {
        return outDepositAccountLastIntAvgBalance;
    }

    /**
     * Sets the value of the outDepositAccountLastIntAvgBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountLastIntAvgBalance(BigDecimal value) {
        this.outDepositAccountLastIntAvgBalance = value;
    }

    /**
     * Gets the value of the outDepositAccountLastIntAvgCr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountLastIntAvgCr() {
        return outDepositAccountLastIntAvgCr;
    }

    /**
     * Sets the value of the outDepositAccountLastIntAvgCr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountLastIntAvgCr(BigDecimal value) {
        this.outDepositAccountLastIntAvgCr = value;
    }

    /**
     * Gets the value of the outDepositAccountLastIntAvgDb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountLastIntAvgDb() {
        return outDepositAccountLastIntAvgDb;
    }

    /**
     * Sets the value of the outDepositAccountLastIntAvgDb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountLastIntAvgDb(BigDecimal value) {
        this.outDepositAccountLastIntAvgDb = value;
    }

    /**
     * Gets the value of the outDepositAccountLastModifyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDepositAccountLastModifyDate() {
        return outDepositAccountLastModifyDate;
    }

    /**
     * Sets the value of the outDepositAccountLastModifyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDepositAccountLastModifyDate(XMLGregorianCalendar value) {
        this.outDepositAccountLastModifyDate = value;
    }

    /**
     * Gets the value of the outDepositAccountLastTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDepositAccountLastTrxDate() {
        return outDepositAccountLastTrxDate;
    }

    /**
     * Sets the value of the outDepositAccountLastTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDepositAccountLastTrxDate(XMLGregorianCalendar value) {
        this.outDepositAccountLastTrxDate = value;
    }

    /**
     * Gets the value of the outDepositAccountLastTrxId property.
     * 
     */
    public int getOutDepositAccountLastTrxId() {
        return outDepositAccountLastTrxId;
    }

    /**
     * Sets the value of the outDepositAccountLastTrxId property.
     * 
     */
    public void setOutDepositAccountLastTrxId(int value) {
        this.outDepositAccountLastTrxId = value;
    }

    /**
     * Gets the value of the outDepositAccountManualMigrateFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountManualMigrateFlg() {
        return outDepositAccountManualMigrateFlg;
    }

    /**
     * Sets the value of the outDepositAccountManualMigrateFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountManualMigrateFlg(String value) {
        this.outDepositAccountManualMigrateFlg = value;
    }

    /**
     * Gets the value of the outDepositAccountMultiSalaryAmnt property.
     * 
     */
    public short getOutDepositAccountMultiSalaryAmnt() {
        return outDepositAccountMultiSalaryAmnt;
    }

    /**
     * Sets the value of the outDepositAccountMultiSalaryAmnt property.
     * 
     */
    public void setOutDepositAccountMultiSalaryAmnt(short value) {
        this.outDepositAccountMultiSalaryAmnt = value;
    }

    /**
     * Gets the value of the outDepositAccountNostroAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountNostroAccount() {
        return outDepositAccountNostroAccount;
    }

    /**
     * Sets the value of the outDepositAccountNostroAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountNostroAccount(String value) {
        this.outDepositAccountNostroAccount = value;
    }

    /**
     * Gets the value of the outDepositAccountNotifSpreadDayB property.
     * 
     */
    public short getOutDepositAccountNotifSpreadDayB() {
        return outDepositAccountNotifSpreadDayB;
    }

    /**
     * Sets the value of the outDepositAccountNotifSpreadDayB property.
     * 
     */
    public void setOutDepositAccountNotifSpreadDayB(short value) {
        this.outDepositAccountNotifSpreadDayB = value;
    }

    /**
     * Gets the value of the outDepositAccountNotifSpreadDays property.
     * 
     */
    public short getOutDepositAccountNotifSpreadDays() {
        return outDepositAccountNotifSpreadDays;
    }

    /**
     * Sets the value of the outDepositAccountNotifSpreadDays property.
     * 
     */
    public void setOutDepositAccountNotifSpreadDays(short value) {
        this.outDepositAccountNotifSpreadDays = value;
    }

    /**
     * Gets the value of the outDepositAccountOfficeAccFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountOfficeAccFlag() {
        return outDepositAccountOfficeAccFlag;
    }

    /**
     * Sets the value of the outDepositAccountOfficeAccFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountOfficeAccFlag(String value) {
        this.outDepositAccountOfficeAccFlag = value;
    }

    /**
     * Gets the value of the outDepositAccountOldAccNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountOldAccNumber() {
        return outDepositAccountOldAccNumber;
    }

    /**
     * Sets the value of the outDepositAccountOldAccNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountOldAccNumber(String value) {
        this.outDepositAccountOldAccNumber = value;
    }

    /**
     * Gets the value of the outDepositAccountOpeningDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDepositAccountOpeningDate() {
        return outDepositAccountOpeningDate;
    }

    /**
     * Sets the value of the outDepositAccountOpeningDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDepositAccountOpeningDate(XMLGregorianCalendar value) {
        this.outDepositAccountOpeningDate = value;
    }

    /**
     * Gets the value of the outDepositAccountOverdraftComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountOverdraftComment() {
        return outDepositAccountOverdraftComment;
    }

    /**
     * Sets the value of the outDepositAccountOverdraftComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountOverdraftComment(String value) {
        this.outDepositAccountOverdraftComment = value;
    }

    /**
     * Gets the value of the outDepositAccountOverdraftExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDepositAccountOverdraftExpDt() {
        return outDepositAccountOverdraftExpDt;
    }

    /**
     * Sets the value of the outDepositAccountOverdraftExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDepositAccountOverdraftExpDt(XMLGregorianCalendar value) {
        this.outDepositAccountOverdraftExpDt = value;
    }

    /**
     * Gets the value of the outDepositAccountOverdraftRenewalCnt property.
     * 
     */
    public int getOutDepositAccountOverdraftRenewalCnt() {
        return outDepositAccountOverdraftRenewalCnt;
    }

    /**
     * Sets the value of the outDepositAccountOverdraftRenewalCnt property.
     * 
     */
    public void setOutDepositAccountOverdraftRenewalCnt(int value) {
        this.outDepositAccountOverdraftRenewalCnt = value;
    }

    /**
     * Gets the value of the outDepositAccountOverdraftRenewalDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDepositAccountOverdraftRenewalDt() {
        return outDepositAccountOverdraftRenewalDt;
    }

    /**
     * Sets the value of the outDepositAccountOverdraftRenewalDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDepositAccountOverdraftRenewalDt(XMLGregorianCalendar value) {
        this.outDepositAccountOverdraftRenewalDt = value;
    }

    /**
     * Gets the value of the outDepositAccountOverdraftRenewalFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountOverdraftRenewalFlg() {
        return outDepositAccountOverdraftRenewalFlg;
    }

    /**
     * Sets the value of the outDepositAccountOverdraftRenewalFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountOverdraftRenewalFlg(String value) {
        this.outDepositAccountOverdraftRenewalFlg = value;
    }

    /**
     * Gets the value of the outDepositAccountOverdraftRenewalUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountOverdraftRenewalUsr() {
        return outDepositAccountOverdraftRenewalUsr;
    }

    /**
     * Sets the value of the outDepositAccountOverdraftRenewalUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountOverdraftRenewalUsr(String value) {
        this.outDepositAccountOverdraftRenewalUsr = value;
    }

    /**
     * Gets the value of the outDepositAccountOverdraftSpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountOverdraftSpread() {
        return outDepositAccountOverdraftSpread;
    }

    /**
     * Sets the value of the outDepositAccountOverdraftSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountOverdraftSpread(BigDecimal value) {
        this.outDepositAccountOverdraftSpread = value;
    }

    /**
     * Gets the value of the outDepositAccountPassbookFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountPassbookFlag() {
        return outDepositAccountPassbookFlag;
    }

    /**
     * Sets the value of the outDepositAccountPassbookFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountPassbookFlag(String value) {
        this.outDepositAccountPassbookFlag = value;
    }

    /**
     * Gets the value of the outDepositAccountPsbLastBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountPsbLastBalance() {
        return outDepositAccountPsbLastBalance;
    }

    /**
     * Sets the value of the outDepositAccountPsbLastBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountPsbLastBalance(BigDecimal value) {
        this.outDepositAccountPsbLastBalance = value;
    }

    /**
     * Gets the value of the outDepositAccountPsbLastPrintLn property.
     * 
     */
    public short getOutDepositAccountPsbLastPrintLn() {
        return outDepositAccountPsbLastPrintLn;
    }

    /**
     * Sets the value of the outDepositAccountPsbLastPrintLn property.
     * 
     */
    public void setOutDepositAccountPsbLastPrintLn(short value) {
        this.outDepositAccountPsbLastPrintLn = value;
    }

    /**
     * Gets the value of the outDepositAccountPsbLostInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountPsbLostInd() {
        return outDepositAccountPsbLostInd;
    }

    /**
     * Sets the value of the outDepositAccountPsbLostInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountPsbLostInd(String value) {
        this.outDepositAccountPsbLostInd = value;
    }

    /**
     * Gets the value of the outDepositAccountPsbSn property.
     * 
     */
    public int getOutDepositAccountPsbSn() {
        return outDepositAccountPsbSn;
    }

    /**
     * Sets the value of the outDepositAccountPsbSn property.
     * 
     */
    public void setOutDepositAccountPsbSn(int value) {
        this.outDepositAccountPsbSn = value;
    }

    /**
     * Gets the value of the outDepositAccountRenewalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDepositAccountRenewalDate() {
        return outDepositAccountRenewalDate;
    }

    /**
     * Sets the value of the outDepositAccountRenewalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDepositAccountRenewalDate(XMLGregorianCalendar value) {
        this.outDepositAccountRenewalDate = value;
    }

    /**
     * Gets the value of the outDepositAccountRenewalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountRenewalFlag() {
        return outDepositAccountRenewalFlag;
    }

    /**
     * Sets the value of the outDepositAccountRenewalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountRenewalFlag(String value) {
        this.outDepositAccountRenewalFlag = value;
    }

    /**
     * Gets the value of the outDepositAccountRenewalNumber property.
     * 
     */
    public int getOutDepositAccountRenewalNumber() {
        return outDepositAccountRenewalNumber;
    }

    /**
     * Sets the value of the outDepositAccountRenewalNumber property.
     * 
     */
    public void setOutDepositAccountRenewalNumber(int value) {
        this.outDepositAccountRenewalNumber = value;
    }

    /**
     * Gets the value of the outDepositAccountRestrictAccFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountRestrictAccFlag() {
        return outDepositAccountRestrictAccFlag;
    }

    /**
     * Sets the value of the outDepositAccountRestrictAccFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountRestrictAccFlag(String value) {
        this.outDepositAccountRestrictAccFlag = value;
    }

    /**
     * Gets the value of the outDepositAccountRetainingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDepositAccountRetainingDate() {
        return outDepositAccountRetainingDate;
    }

    /**
     * Sets the value of the outDepositAccountRetainingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDepositAccountRetainingDate(XMLGregorianCalendar value) {
        this.outDepositAccountRetainingDate = value;
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
     * Gets the value of the outDepositAccountServicePenalSpr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountServicePenalSpr() {
        return outDepositAccountServicePenalSpr;
    }

    /**
     * Sets the value of the outDepositAccountServicePenalSpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountServicePenalSpr(BigDecimal value) {
        this.outDepositAccountServicePenalSpr = value;
    }

    /**
     * Gets the value of the outDepositAccountSpecAgrPenFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountSpecAgrPenFlg() {
        return outDepositAccountSpecAgrPenFlg;
    }

    /**
     * Sets the value of the outDepositAccountSpecAgrPenFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountSpecAgrPenFlg(String value) {
        this.outDepositAccountSpecAgrPenFlg = value;
    }

    /**
     * Gets the value of the outDepositAccountSpecAgrTrxFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountSpecAgrTrxFlg() {
        return outDepositAccountSpecAgrTrxFlg;
    }

    /**
     * Sets the value of the outDepositAccountSpecAgrTrxFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountSpecAgrTrxFlg(String value) {
        this.outDepositAccountSpecAgrTrxFlg = value;
    }

    /**
     * Gets the value of the outDepositAccountSpecialAccFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountSpecialAccFlg() {
        return outDepositAccountSpecialAccFlg;
    }

    /**
     * Sets the value of the outDepositAccountSpecialAccFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountSpecialAccFlg(String value) {
        this.outDepositAccountSpecialAccFlg = value;
    }

    /**
     * Gets the value of the outDepositAccountStartDateTd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDepositAccountStartDateTd() {
        return outDepositAccountStartDateTd;
    }

    /**
     * Sets the value of the outDepositAccountStartDateTd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDepositAccountStartDateTd(XMLGregorianCalendar value) {
        this.outDepositAccountStartDateTd = value;
    }

    /**
     * Gets the value of the outDepositAccountStatementIssFreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountStatementIssFreq() {
        return outDepositAccountStatementIssFreq;
    }

    /**
     * Sets the value of the outDepositAccountStatementIssFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountStatementIssFreq(String value) {
        this.outDepositAccountStatementIssFreq = value;
    }

    /**
     * Gets the value of the outDepositAccountTargetFlg property.
     * 
     */
    public short getOutDepositAccountTargetFlg() {
        return outDepositAccountTargetFlg;
    }

    /**
     * Sets the value of the outDepositAccountTargetFlg property.
     * 
     */
    public void setOutDepositAccountTargetFlg(short value) {
        this.outDepositAccountTargetFlg = value;
    }

    /**
     * Gets the value of the outDepositAccountTdBatchExtrtFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountTdBatchExtrtFlg() {
        return outDepositAccountTdBatchExtrtFlg;
    }

    /**
     * Sets the value of the outDepositAccountTdBatchExtrtFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountTdBatchExtrtFlg(String value) {
        this.outDepositAccountTdBatchExtrtFlg = value;
    }

    /**
     * Gets the value of the outDepositAccountTdInterPercentChg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountTdInterPercentChg() {
        return outDepositAccountTdInterPercentChg;
    }

    /**
     * Sets the value of the outDepositAccountTdInterPercentChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountTdInterPercentChg(BigDecimal value) {
        this.outDepositAccountTdInterPercentChg = value;
    }

    /**
     * Gets the value of the outDepositAccountTdInterSprdChg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountTdInterSprdChg() {
        return outDepositAccountTdInterSprdChg;
    }

    /**
     * Sets the value of the outDepositAccountTdInterSprdChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountTdInterSprdChg(BigDecimal value) {
        this.outDepositAccountTdInterSprdChg = value;
    }

    /**
     * Gets the value of the outDepositAccountTelebankingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountTelebankingFlag() {
        return outDepositAccountTelebankingFlag;
    }

    /**
     * Sets the value of the outDepositAccountTelebankingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountTelebankingFlag(String value) {
        this.outDepositAccountTelebankingFlag = value;
    }

    /**
     * Gets the value of the outDepositAccountTempExcEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDepositAccountTempExcEndDt() {
        return outDepositAccountTempExcEndDt;
    }

    /**
     * Sets the value of the outDepositAccountTempExcEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDepositAccountTempExcEndDt(XMLGregorianCalendar value) {
        this.outDepositAccountTempExcEndDt = value;
    }

    /**
     * Gets the value of the outDepositAccountTempExcStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDepositAccountTempExcStartDt() {
        return outDepositAccountTempExcStartDt;
    }

    /**
     * Sets the value of the outDepositAccountTempExcStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDepositAccountTempExcStartDt(XMLGregorianCalendar value) {
        this.outDepositAccountTempExcStartDt = value;
    }

    /**
     * Gets the value of the outDepositAccountTemporaryExcess property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountTemporaryExcess() {
        return outDepositAccountTemporaryExcess;
    }

    /**
     * Sets the value of the outDepositAccountTemporaryExcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountTemporaryExcess(BigDecimal value) {
        this.outDepositAccountTemporaryExcess = value;
    }

    /**
     * Gets the value of the outDepositAccountThirdpartyInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountThirdpartyInd() {
        return outDepositAccountThirdpartyInd;
    }

    /**
     * Sets the value of the outDepositAccountThirdpartyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountThirdpartyInd(String value) {
        this.outDepositAccountThirdpartyInd = value;
    }

    /**
     * Gets the value of the outDepositAccountTimestmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDepositAccountTimestmp() {
        return outDepositAccountTimestmp;
    }

    /**
     * Sets the value of the outDepositAccountTimestmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDepositAccountTimestmp(XMLGregorianCalendar value) {
        this.outDepositAccountTimestmp = value;
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
     * Gets the value of the outDepositAccountUnclearWithdrFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountUnclearWithdrFlg() {
        return outDepositAccountUnclearWithdrFlg;
    }

    /**
     * Sets the value of the outDepositAccountUnclearWithdrFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountUnclearWithdrFlg(String value) {
        this.outDepositAccountUnclearWithdrFlg = value;
    }

    /**
     * Gets the value of the outDepositAccountUnutilLimitPenD property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountUnutilLimitPenD() {
        return outDepositAccountUnutilLimitPenD;
    }

    /**
     * Sets the value of the outDepositAccountUnutilLimitPenD property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountUnutilLimitPenD(BigDecimal value) {
        this.outDepositAccountUnutilLimitPenD = value;
    }

    /**
     * Gets the value of the outDepositAccountValidChqDuration property.
     * 
     */
    public int getOutDepositAccountValidChqDuration() {
        return outDepositAccountValidChqDuration;
    }

    /**
     * Sets the value of the outDepositAccountValidChqDuration property.
     * 
     */
    public void setOutDepositAccountValidChqDuration(int value) {
        this.outDepositAccountValidChqDuration = value;
    }

    /**
     * Gets the value of the outDepositAccountWithdrawAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountWithdrawAmnt() {
        return outDepositAccountWithdrawAmnt;
    }

    /**
     * Sets the value of the outDepositAccountWithdrawAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountWithdrawAmnt(BigDecimal value) {
        this.outDepositAccountWithdrawAmnt = value;
    }

    /**
     * Gets the value of the outDepositAccountWthdrawSpread property.
     * 
     */
    public short getOutDepositAccountWthdrawSpread() {
        return outDepositAccountWthdrawSpread;
    }

    /**
     * Sets the value of the outDepositAccountWthdrawSpread property.
     * 
     */
    public void setOutDepositAccountWthdrawSpread(short value) {
        this.outDepositAccountWthdrawSpread = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipCounterYear property.
     * 
     */
    public short getOutDepSwiftParticipCounterYear() {
        return outDepSwiftParticipCounterYear;
    }

    /**
     * Sets the value of the outDepSwiftParticipCounterYear property.
     * 
     */
    public void setOutDepSwiftParticipCounterYear(short value) {
        this.outDepSwiftParticipCounterYear = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipCtiMt940 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepSwiftParticipCtiMt940() {
        return outDepSwiftParticipCtiMt940;
    }

    /**
     * Sets the value of the outDepSwiftParticipCtiMt940 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepSwiftParticipCtiMt940(String value) {
        this.outDepSwiftParticipCtiMt940 = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipCtiMt9401 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepSwiftParticipCtiMt9401() {
        return outDepSwiftParticipCtiMt9401;
    }

    /**
     * Sets the value of the outDepSwiftParticipCtiMt9401 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepSwiftParticipCtiMt9401(String value) {
        this.outDepSwiftParticipCtiMt9401 = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipCtiMt9402 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepSwiftParticipCtiMt9402() {
        return outDepSwiftParticipCtiMt9402;
    }

    /**
     * Sets the value of the outDepSwiftParticipCtiMt9402 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepSwiftParticipCtiMt9402(String value) {
        this.outDepSwiftParticipCtiMt9402 = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipCtiMt9403 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepSwiftParticipCtiMt9403() {
        return outDepSwiftParticipCtiMt9403;
    }

    /**
     * Sets the value of the outDepSwiftParticipCtiMt9403 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepSwiftParticipCtiMt9403(String value) {
        this.outDepSwiftParticipCtiMt9403 = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipCtiMt9404 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepSwiftParticipCtiMt9404() {
        return outDepSwiftParticipCtiMt9404;
    }

    /**
     * Sets the value of the outDepSwiftParticipCtiMt9404 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepSwiftParticipCtiMt9404(String value) {
        this.outDepSwiftParticipCtiMt9404 = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipLast940SgCntr property.
     * 
     */
    public int getOutDepSwiftParticipLast940SgCntr() {
        return outDepSwiftParticipLast940SgCntr;
    }

    /**
     * Sets the value of the outDepSwiftParticipLast940SgCntr property.
     * 
     */
    public void setOutDepSwiftParticipLast940SgCntr(int value) {
        this.outDepSwiftParticipLast940SgCntr = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipLast940SwCntr property.
     * 
     */
    public int getOutDepSwiftParticipLast940SwCntr() {
        return outDepSwiftParticipLast940SwCntr;
    }

    /**
     * Sets the value of the outDepSwiftParticipLast940SwCntr property.
     * 
     */
    public void setOutDepSwiftParticipLast940SwCntr(int value) {
        this.outDepSwiftParticipLast940SwCntr = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipLast942SgCntr property.
     * 
     */
    public int getOutDepSwiftParticipLast942SgCntr() {
        return outDepSwiftParticipLast942SgCntr;
    }

    /**
     * Sets the value of the outDepSwiftParticipLast942SgCntr property.
     * 
     */
    public void setOutDepSwiftParticipLast942SgCntr(int value) {
        this.outDepSwiftParticipLast942SgCntr = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipLast950SwCntr property.
     * 
     */
    public int getOutDepSwiftParticipLast950SwCntr() {
        return outDepSwiftParticipLast950SwCntr;
    }

    /**
     * Sets the value of the outDepSwiftParticipLast950SwCntr property.
     * 
     */
    public void setOutDepSwiftParticipLast950SwCntr(int value) {
        this.outDepSwiftParticipLast950SwCntr = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipLastBalanceMt942 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepSwiftParticipLastBalanceMt942() {
        return outDepSwiftParticipLastBalanceMt942;
    }

    /**
     * Sets the value of the outDepSwiftParticipLastBalanceMt942 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepSwiftParticipLastBalanceMt942(BigDecimal value) {
        this.outDepSwiftParticipLastBalanceMt942 = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipLastCtiMt940 property.
     * 
     */
    public double getOutDepSwiftParticipLastCtiMt940() {
        return outDepSwiftParticipLastCtiMt940;
    }

    /**
     * Sets the value of the outDepSwiftParticipLastCtiMt940 property.
     * 
     */
    public void setOutDepSwiftParticipLastCtiMt940(double value) {
        this.outDepSwiftParticipLastCtiMt940 = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipLastEntrySerNum property.
     * 
     */
    public int getOutDepSwiftParticipLastEntrySerNum() {
        return outDepSwiftParticipLastEntrySerNum;
    }

    /**
     * Sets the value of the outDepSwiftParticipLastEntrySerNum property.
     * 
     */
    public void setOutDepSwiftParticipLastEntrySerNum(int value) {
        this.outDepSwiftParticipLastEntrySerNum = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipLastTmstampMt942 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDepSwiftParticipLastTmstampMt942() {
        return outDepSwiftParticipLastTmstampMt942;
    }

    /**
     * Sets the value of the outDepSwiftParticipLastTmstampMt942 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDepSwiftParticipLastTmstampMt942(XMLGregorianCalendar value) {
        this.outDepSwiftParticipLastTmstampMt942 = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipLastTransSerNum property.
     * 
     */
    public int getOutDepSwiftParticipLastTransSerNum() {
        return outDepSwiftParticipLastTransSerNum;
    }

    /**
     * Sets the value of the outDepSwiftParticipLastTransSerNum property.
     * 
     */
    public void setOutDepSwiftParticipLastTransSerNum(int value) {
        this.outDepSwiftParticipLastTransSerNum = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipReceiverSwiftId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepSwiftParticipReceiverSwiftId() {
        return outDepSwiftParticipReceiverSwiftId;
    }

    /**
     * Sets the value of the outDepSwiftParticipReceiverSwiftId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepSwiftParticipReceiverSwiftId(String value) {
        this.outDepSwiftParticipReceiverSwiftId = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipReceiverSwiftId1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepSwiftParticipReceiverSwiftId1() {
        return outDepSwiftParticipReceiverSwiftId1;
    }

    /**
     * Sets the value of the outDepSwiftParticipReceiverSwiftId1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepSwiftParticipReceiverSwiftId1(String value) {
        this.outDepSwiftParticipReceiverSwiftId1 = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipReceiverSwiftId2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepSwiftParticipReceiverSwiftId2() {
        return outDepSwiftParticipReceiverSwiftId2;
    }

    /**
     * Sets the value of the outDepSwiftParticipReceiverSwiftId2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepSwiftParticipReceiverSwiftId2(String value) {
        this.outDepSwiftParticipReceiverSwiftId2 = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipReceiverSwiftId3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepSwiftParticipReceiverSwiftId3() {
        return outDepSwiftParticipReceiverSwiftId3;
    }

    /**
     * Sets the value of the outDepSwiftParticipReceiverSwiftId3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepSwiftParticipReceiverSwiftId3(String value) {
        this.outDepSwiftParticipReceiverSwiftId3 = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipReceiverSwiftId4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepSwiftParticipReceiverSwiftId4() {
        return outDepSwiftParticipReceiverSwiftId4;
    }

    /**
     * Sets the value of the outDepSwiftParticipReceiverSwiftId4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepSwiftParticipReceiverSwiftId4(String value) {
        this.outDepSwiftParticipReceiverSwiftId4 = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipSenderSwiftId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepSwiftParticipSenderSwiftId() {
        return outDepSwiftParticipSenderSwiftId;
    }

    /**
     * Sets the value of the outDepSwiftParticipSenderSwiftId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepSwiftParticipSenderSwiftId(String value) {
        this.outDepSwiftParticipSenderSwiftId = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipSogecashMt940 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepSwiftParticipSogecashMt940() {
        return outDepSwiftParticipSogecashMt940;
    }

    /**
     * Sets the value of the outDepSwiftParticipSogecashMt940 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepSwiftParticipSogecashMt940(String value) {
        this.outDepSwiftParticipSogecashMt940 = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipSogecashMt9401 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepSwiftParticipSogecashMt9401() {
        return outDepSwiftParticipSogecashMt9401;
    }

    /**
     * Sets the value of the outDepSwiftParticipSogecashMt9401 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepSwiftParticipSogecashMt9401(String value) {
        this.outDepSwiftParticipSogecashMt9401 = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipSogecashMt9402 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepSwiftParticipSogecashMt9402() {
        return outDepSwiftParticipSogecashMt9402;
    }

    /**
     * Sets the value of the outDepSwiftParticipSogecashMt9402 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepSwiftParticipSogecashMt9402(String value) {
        this.outDepSwiftParticipSogecashMt9402 = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipSogecashMt9403 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepSwiftParticipSogecashMt9403() {
        return outDepSwiftParticipSogecashMt9403;
    }

    /**
     * Sets the value of the outDepSwiftParticipSogecashMt9403 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepSwiftParticipSogecashMt9403(String value) {
        this.outDepSwiftParticipSogecashMt9403 = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipSogecashMt9404 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepSwiftParticipSogecashMt9404() {
        return outDepSwiftParticipSogecashMt9404;
    }

    /**
     * Sets the value of the outDepSwiftParticipSogecashMt9404 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepSwiftParticipSogecashMt9404(String value) {
        this.outDepSwiftParticipSogecashMt9404 = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipSogecashMt942 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepSwiftParticipSogecashMt942() {
        return outDepSwiftParticipSogecashMt942;
    }

    /**
     * Sets the value of the outDepSwiftParticipSogecashMt942 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepSwiftParticipSogecashMt942(String value) {
        this.outDepSwiftParticipSogecashMt942 = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipSogecashMt9421 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepSwiftParticipSogecashMt9421() {
        return outDepSwiftParticipSogecashMt9421;
    }

    /**
     * Sets the value of the outDepSwiftParticipSogecashMt9421 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepSwiftParticipSogecashMt9421(String value) {
        this.outDepSwiftParticipSogecashMt9421 = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipSogecashMt9422 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepSwiftParticipSogecashMt9422() {
        return outDepSwiftParticipSogecashMt9422;
    }

    /**
     * Sets the value of the outDepSwiftParticipSogecashMt9422 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepSwiftParticipSogecashMt9422(String value) {
        this.outDepSwiftParticipSogecashMt9422 = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipSogecashMt9423 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepSwiftParticipSogecashMt9423() {
        return outDepSwiftParticipSogecashMt9423;
    }

    /**
     * Sets the value of the outDepSwiftParticipSogecashMt9423 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepSwiftParticipSogecashMt9423(String value) {
        this.outDepSwiftParticipSogecashMt9423 = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipSogecashMt9424 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepSwiftParticipSogecashMt9424() {
        return outDepSwiftParticipSogecashMt9424;
    }

    /**
     * Sets the value of the outDepSwiftParticipSogecashMt9424 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepSwiftParticipSogecashMt9424(String value) {
        this.outDepSwiftParticipSogecashMt9424 = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipSwiftMt940 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepSwiftParticipSwiftMt940() {
        return outDepSwiftParticipSwiftMt940;
    }

    /**
     * Sets the value of the outDepSwiftParticipSwiftMt940 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepSwiftParticipSwiftMt940(String value) {
        this.outDepSwiftParticipSwiftMt940 = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipSwiftMt9401 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepSwiftParticipSwiftMt9401() {
        return outDepSwiftParticipSwiftMt9401;
    }

    /**
     * Sets the value of the outDepSwiftParticipSwiftMt9401 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepSwiftParticipSwiftMt9401(String value) {
        this.outDepSwiftParticipSwiftMt9401 = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipSwiftMt9402 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepSwiftParticipSwiftMt9402() {
        return outDepSwiftParticipSwiftMt9402;
    }

    /**
     * Sets the value of the outDepSwiftParticipSwiftMt9402 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepSwiftParticipSwiftMt9402(String value) {
        this.outDepSwiftParticipSwiftMt9402 = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipSwiftMt9403 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepSwiftParticipSwiftMt9403() {
        return outDepSwiftParticipSwiftMt9403;
    }

    /**
     * Sets the value of the outDepSwiftParticipSwiftMt9403 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepSwiftParticipSwiftMt9403(String value) {
        this.outDepSwiftParticipSwiftMt9403 = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipSwiftMt9404 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepSwiftParticipSwiftMt9404() {
        return outDepSwiftParticipSwiftMt9404;
    }

    /**
     * Sets the value of the outDepSwiftParticipSwiftMt9404 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepSwiftParticipSwiftMt9404(String value) {
        this.outDepSwiftParticipSwiftMt9404 = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipSwiftMt950 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepSwiftParticipSwiftMt950() {
        return outDepSwiftParticipSwiftMt950;
    }

    /**
     * Sets the value of the outDepSwiftParticipSwiftMt950 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepSwiftParticipSwiftMt950(String value) {
        this.outDepSwiftParticipSwiftMt950 = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipSwiftMt9501 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepSwiftParticipSwiftMt9501() {
        return outDepSwiftParticipSwiftMt9501;
    }

    /**
     * Sets the value of the outDepSwiftParticipSwiftMt9501 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepSwiftParticipSwiftMt9501(String value) {
        this.outDepSwiftParticipSwiftMt9501 = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipSwiftMt9502 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepSwiftParticipSwiftMt9502() {
        return outDepSwiftParticipSwiftMt9502;
    }

    /**
     * Sets the value of the outDepSwiftParticipSwiftMt9502 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepSwiftParticipSwiftMt9502(String value) {
        this.outDepSwiftParticipSwiftMt9502 = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipSwiftMt9503 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepSwiftParticipSwiftMt9503() {
        return outDepSwiftParticipSwiftMt9503;
    }

    /**
     * Sets the value of the outDepSwiftParticipSwiftMt9503 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepSwiftParticipSwiftMt9503(String value) {
        this.outDepSwiftParticipSwiftMt9503 = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipSwiftMt9504 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepSwiftParticipSwiftMt9504() {
        return outDepSwiftParticipSwiftMt9504;
    }

    /**
     * Sets the value of the outDepSwiftParticipSwiftMt9504 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepSwiftParticipSwiftMt9504(String value) {
        this.outDepSwiftParticipSwiftMt9504 = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipSwiftStBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepSwiftParticipSwiftStBal() {
        return outDepSwiftParticipSwiftStBal;
    }

    /**
     * Sets the value of the outDepSwiftParticipSwiftStBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepSwiftParticipSwiftStBal(BigDecimal value) {
        this.outDepSwiftParticipSwiftStBal = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipSwiftStDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDepSwiftParticipSwiftStDate() {
        return outDepSwiftParticipSwiftStDate;
    }

    /**
     * Sets the value of the outDepSwiftParticipSwiftStDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDepSwiftParticipSwiftStDate(XMLGregorianCalendar value) {
        this.outDepSwiftParticipSwiftStDate = value;
    }

    /**
     * Gets the value of the outDepSwiftParticipTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDepSwiftParticipTmstamp() {
        return outDepSwiftParticipTmstamp;
    }

    /**
     * Sets the value of the outDepSwiftParticipTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDepSwiftParticipTmstamp(XMLGregorianCalendar value) {
        this.outDepSwiftParticipTmstamp = value;
    }

    /**
     * Gets the value of the outDpPsbLostHistBookBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDpPsbLostHistBookBalance() {
        return outDpPsbLostHistBookBalance;
    }

    /**
     * Sets the value of the outDpPsbLostHistBookBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDpPsbLostHistBookBalance(BigDecimal value) {
        this.outDpPsbLostHistBookBalance = value;
    }

    /**
     * Gets the value of the outDpPsbLostHistPsbLastPrintLn property.
     * 
     */
    public short getOutDpPsbLostHistPsbLastPrintLn() {
        return outDpPsbLostHistPsbLastPrintLn;
    }

    /**
     * Sets the value of the outDpPsbLostHistPsbLastPrintLn property.
     * 
     */
    public void setOutDpPsbLostHistPsbLastPrintLn(short value) {
        this.outDpPsbLostHistPsbLastPrintLn = value;
    }

    /**
     * Gets the value of the outDpPsbLostHistPsbLostComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDpPsbLostHistPsbLostComment() {
        return outDpPsbLostHistPsbLostComment;
    }

    /**
     * Sets the value of the outDpPsbLostHistPsbLostComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDpPsbLostHistPsbLostComment(String value) {
        this.outDpPsbLostHistPsbLostComment = value;
    }

    /**
     * Gets the value of the outDpPsbLostHistPsbLostSn property.
     * 
     */
    public int getOutDpPsbLostHistPsbLostSn() {
        return outDpPsbLostHistPsbLostSn;
    }

    /**
     * Sets the value of the outDpPsbLostHistPsbLostSn property.
     * 
     */
    public void setOutDpPsbLostHistPsbLostSn(int value) {
        this.outDpPsbLostHistPsbLostSn = value;
    }

    /**
     * Gets the value of the outDpPsbLostHistTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDpPsbLostHistTrxDate() {
        return outDpPsbLostHistTrxDate;
    }

    /**
     * Sets the value of the outDpPsbLostHistTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDpPsbLostHistTrxDate(XMLGregorianCalendar value) {
        this.outDpPsbLostHistTrxDate = value;
    }

    /**
     * Gets the value of the outEconomForFifthCustGenericDetailSerialNum property.
     * 
     */
    public int getOutEconomForFifthCustGenericDetailSerialNum() {
        return outEconomForFifthCustGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outEconomForFifthCustGenericDetailSerialNum property.
     * 
     */
    public void setOutEconomForFifthCustGenericDetailSerialNum(int value) {
        this.outEconomForFifthCustGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outEconomForFourthCustGenericDetailSerialNum property.
     * 
     */
    public int getOutEconomForFourthCustGenericDetailSerialNum() {
        return outEconomForFourthCustGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outEconomForFourthCustGenericDetailSerialNum property.
     * 
     */
    public void setOutEconomForFourthCustGenericDetailSerialNum(int value) {
        this.outEconomForFourthCustGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outEconomForSecCustGenericDetailSerialNum property.
     * 
     */
    public int getOutEconomForSecCustGenericDetailSerialNum() {
        return outEconomForSecCustGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outEconomForSecCustGenericDetailSerialNum property.
     * 
     */
    public void setOutEconomForSecCustGenericDetailSerialNum(int value) {
        this.outEconomForSecCustGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outEconomForThirdCustGenericDetailSerialNum property.
     * 
     */
    public int getOutEconomForThirdCustGenericDetailSerialNum() {
        return outEconomForThirdCustGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outEconomForThirdCustGenericDetailSerialNum property.
     * 
     */
    public void setOutEconomForThirdCustGenericDetailSerialNum(int value) {
        this.outEconomForThirdCustGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outEconomyGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEconomyGenericDetailDescription() {
        return outEconomyGenericDetailDescription;
    }

    /**
     * Sets the value of the outEconomyGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEconomyGenericDetailDescription(String value) {
        this.outEconomyGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outEconomyGenericDetailSerialNum property.
     * 
     */
    public int getOutEconomyGenericDetailSerialNum() {
        return outEconomyGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outEconomyGenericDetailSerialNum property.
     * 
     */
    public void setOutEconomyGenericDetailSerialNum(int value) {
        this.outEconomyGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outFifthCustCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFifthCustCustAddressAddress1() {
        return outFifthCustCustAddressAddress1;
    }

    /**
     * Sets the value of the outFifthCustCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFifthCustCustAddressAddress1(String value) {
        this.outFifthCustCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the outFifthCustCustAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFifthCustCustAddressCity() {
        return outFifthCustCustAddressCity;
    }

    /**
     * Sets the value of the outFifthCustCustAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFifthCustCustAddressCity(String value) {
        this.outFifthCustCustAddressCity = value;
    }

    /**
     * Gets the value of the outFifthCustCustAddressEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFifthCustCustAddressEntryStatus() {
        return outFifthCustCustAddressEntryStatus;
    }

    /**
     * Sets the value of the outFifthCustCustAddressEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFifthCustCustAddressEntryStatus(String value) {
        this.outFifthCustCustAddressEntryStatus = value;
    }

    /**
     * Gets the value of the outFifthCustCustAddressTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFifthCustCustAddressTelephone() {
        return outFifthCustCustAddressTelephone;
    }

    /**
     * Sets the value of the outFifthCustCustAddressTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFifthCustCustAddressTelephone(String value) {
        this.outFifthCustCustAddressTelephone = value;
    }

    /**
     * Gets the value of the outFifthCustOtherAfmAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFifthCustOtherAfmAfmNo() {
        return outFifthCustOtherAfmAfmNo;
    }

    /**
     * Sets the value of the outFifthCustOtherAfmAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFifthCustOtherAfmAfmNo(String value) {
        this.outFifthCustOtherAfmAfmNo = value;
    }

    /**
     * Gets the value of the outFifthCustOtherAfmMainFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFifthCustOtherAfmMainFlag() {
        return outFifthCustOtherAfmMainFlag;
    }

    /**
     * Sets the value of the outFifthCustOtherAfmMainFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFifthCustOtherAfmMainFlag(String value) {
        this.outFifthCustOtherAfmMainFlag = value;
    }

    /**
     * Gets the value of the outFifthOtherIdIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFifthOtherIdIdNo() {
        return outFifthOtherIdIdNo;
    }

    /**
     * Sets the value of the outFifthOtherIdIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFifthOtherIdIdNo(String value) {
        this.outFifthOtherIdIdNo = value;
    }

    /**
     * Gets the value of the outFifthOtherIdMainFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFifthOtherIdMainFlag() {
        return outFifthOtherIdMainFlag;
    }

    /**
     * Sets the value of the outFifthOtherIdMainFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFifthOtherIdMainFlag(String value) {
        this.outFifthOtherIdMainFlag = value;
    }

    /**
     * Gets the value of the outFinalCrHintScalePercentage00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutFinalCrHintScalePercentage00() {
        return outFinalCrHintScalePercentage00;
    }

    /**
     * Sets the value of the outFinalCrHintScalePercentage00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutFinalCrHintScalePercentage00(BigDecimal value) {
        this.outFinalCrHintScalePercentage00 = value;
    }

    /**
     * Gets the value of the outFinalDbHintScalePercentage00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutFinalDbHintScalePercentage00() {
        return outFinalDbHintScalePercentage00;
    }

    /**
     * Sets the value of the outFinalDbHintScalePercentage00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutFinalDbHintScalePercentage00(BigDecimal value) {
        this.outFinalDbHintScalePercentage00 = value;
    }

    /**
     * Gets the value of the outFinalExcIntHintScalePercentage00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutFinalExcIntHintScalePercentage00() {
        return outFinalExcIntHintScalePercentage00;
    }

    /**
     * Sets the value of the outFinalExcIntHintScalePercentage00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutFinalExcIntHintScalePercentage00(BigDecimal value) {
        this.outFinalExcIntHintScalePercentage00 = value;
    }

    /**
     * Gets the value of the outFinalN128HintScalePercentage00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutFinalN128HintScalePercentage00() {
        return outFinalN128HintScalePercentage00;
    }

    /**
     * Sets the value of the outFinalN128HintScalePercentage00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutFinalN128HintScalePercentage00(BigDecimal value) {
        this.outFinalN128HintScalePercentage00 = value;
    }

    /**
     * Gets the value of the outFirstCustCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFirstCustCustAddressAddress1() {
        return outFirstCustCustAddressAddress1;
    }

    /**
     * Sets the value of the outFirstCustCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFirstCustCustAddressAddress1(String value) {
        this.outFirstCustCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the outFirstCustCustAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFirstCustCustAddressCity() {
        return outFirstCustCustAddressCity;
    }

    /**
     * Sets the value of the outFirstCustCustAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFirstCustCustAddressCity(String value) {
        this.outFirstCustCustAddressCity = value;
    }

    /**
     * Gets the value of the outFirstCustCustAddressEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFirstCustCustAddressEntryStatus() {
        return outFirstCustCustAddressEntryStatus;
    }

    /**
     * Sets the value of the outFirstCustCustAddressEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFirstCustCustAddressEntryStatus(String value) {
        this.outFirstCustCustAddressEntryStatus = value;
    }

    /**
     * Gets the value of the outFirstCustCustAddressTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFirstCustCustAddressTelephone() {
        return outFirstCustCustAddressTelephone;
    }

    /**
     * Sets the value of the outFirstCustCustAddressTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFirstCustCustAddressTelephone(String value) {
        this.outFirstCustCustAddressTelephone = value;
    }

    /**
     * Gets the value of the outFirstCustOtherAfmAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFirstCustOtherAfmAfmNo() {
        return outFirstCustOtherAfmAfmNo;
    }

    /**
     * Sets the value of the outFirstCustOtherAfmAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFirstCustOtherAfmAfmNo(String value) {
        this.outFirstCustOtherAfmAfmNo = value;
    }

    /**
     * Gets the value of the outFirstCustOtherAfmMainFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFirstCustOtherAfmMainFlag() {
        return outFirstCustOtherAfmMainFlag;
    }

    /**
     * Sets the value of the outFirstCustOtherAfmMainFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFirstCustOtherAfmMainFlag(String value) {
        this.outFirstCustOtherAfmMainFlag = value;
    }

    /**
     * Gets the value of the outFirstOtherIdIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFirstOtherIdIdNo() {
        return outFirstOtherIdIdNo;
    }

    /**
     * Sets the value of the outFirstOtherIdIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFirstOtherIdIdNo(String value) {
        this.outFirstOtherIdIdNo = value;
    }

    /**
     * Gets the value of the outFirstOtherIdMainFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFirstOtherIdMainFlag() {
        return outFirstOtherIdMainFlag;
    }

    /**
     * Sets the value of the outFirstOtherIdMainFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFirstOtherIdMainFlag(String value) {
        this.outFirstOtherIdMainFlag = value;
    }

    /**
     * Gets the value of the outFixedLnsInterestDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFixedLnsInterestDescription() {
        return outFixedLnsInterestDescription;
    }

    /**
     * Sets the value of the outFixedLnsInterestDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFixedLnsInterestDescription(String value) {
        this.outFixedLnsInterestDescription = value;
    }

    /**
     * Gets the value of the outFixedLnsInterestDurationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFixedLnsInterestDurationUnit() {
        return outFixedLnsInterestDurationUnit;
    }

    /**
     * Sets the value of the outFixedLnsInterestDurationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFixedLnsInterestDurationUnit(String value) {
        this.outFixedLnsInterestDurationUnit = value;
    }

    /**
     * Gets the value of the outFixedLnsInterestIdInterest property.
     * 
     */
    public int getOutFixedLnsInterestIdInterest() {
        return outFixedLnsInterestIdInterest;
    }

    /**
     * Sets the value of the outFixedLnsInterestIdInterest property.
     * 
     */
    public void setOutFixedLnsInterestIdInterest(int value) {
        this.outFixedLnsInterestIdInterest = value;
    }

    /**
     * Gets the value of the outFixedLnsInterestIntDuration property.
     * 
     */
    public short getOutFixedLnsInterestIntDuration() {
        return outFixedLnsInterestIntDuration;
    }

    /**
     * Sets the value of the outFixedLnsInterestIntDuration property.
     * 
     */
    public void setOutFixedLnsInterestIntDuration(short value) {
        this.outFixedLnsInterestIntDuration = value;
    }

    /**
     * Gets the value of the outFourthCustCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFourthCustCustAddressAddress1() {
        return outFourthCustCustAddressAddress1;
    }

    /**
     * Sets the value of the outFourthCustCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFourthCustCustAddressAddress1(String value) {
        this.outFourthCustCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the outFourthCustCustAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFourthCustCustAddressCity() {
        return outFourthCustCustAddressCity;
    }

    /**
     * Sets the value of the outFourthCustCustAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFourthCustCustAddressCity(String value) {
        this.outFourthCustCustAddressCity = value;
    }

    /**
     * Gets the value of the outFourthCustCustAddressEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFourthCustCustAddressEntryStatus() {
        return outFourthCustCustAddressEntryStatus;
    }

    /**
     * Sets the value of the outFourthCustCustAddressEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFourthCustCustAddressEntryStatus(String value) {
        this.outFourthCustCustAddressEntryStatus = value;
    }

    /**
     * Gets the value of the outFourthCustCustAddressTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFourthCustCustAddressTelephone() {
        return outFourthCustCustAddressTelephone;
    }

    /**
     * Sets the value of the outFourthCustCustAddressTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFourthCustCustAddressTelephone(String value) {
        this.outFourthCustCustAddressTelephone = value;
    }

    /**
     * Gets the value of the outFourthCustOtherAfmAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFourthCustOtherAfmAfmNo() {
        return outFourthCustOtherAfmAfmNo;
    }

    /**
     * Sets the value of the outFourthCustOtherAfmAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFourthCustOtherAfmAfmNo(String value) {
        this.outFourthCustOtherAfmAfmNo = value;
    }

    /**
     * Gets the value of the outFourthCustOtherAfmMainFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFourthCustOtherAfmMainFlag() {
        return outFourthCustOtherAfmMainFlag;
    }

    /**
     * Sets the value of the outFourthCustOtherAfmMainFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFourthCustOtherAfmMainFlag(String value) {
        this.outFourthCustOtherAfmMainFlag = value;
    }

    /**
     * Gets the value of the outFourthOtherIdIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFourthOtherIdIdNo() {
        return outFourthOtherIdIdNo;
    }

    /**
     * Sets the value of the outFourthOtherIdIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFourthOtherIdIdNo(String value) {
        this.outFourthOtherIdIdNo = value;
    }

    /**
     * Gets the value of the outFourthOtherIdMainFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFourthOtherIdMainFlag() {
        return outFourthOtherIdMainFlag;
    }

    /**
     * Sets the value of the outFourthOtherIdMainFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFourthOtherIdMainFlag(String value) {
        this.outFourthOtherIdMainFlag = value;
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
     * Gets the value of the outGrpBalancesLength property.
     * 
     */
    public int getOutGrpBalancesLength() {
        return outGrpBalancesLength;
    }

    /**
     * Sets the value of the outGrpBalancesLength property.
     * 
     */
    public void setOutGrpBalancesLength(int value) {
        this.outGrpBalancesLength = value;
    }

    /**
     * Gets the value of the outGrpBalancesFdTdLength property.
     * 
     */
    public int getOutGrpBalancesFdTdLength() {
        return outGrpBalancesFdTdLength;
    }

    /**
     * Sets the value of the outGrpBalancesFdTdLength property.
     * 
     */
    public void setOutGrpBalancesFdTdLength(int value) {
        this.outGrpBalancesFdTdLength = value;
    }

    /**
     * Gets the value of the outIbanCodeCharSuppliedChar37 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIbanCodeCharSuppliedChar37() {
        return outIbanCodeCharSuppliedChar37;
    }

    /**
     * Sets the value of the outIbanCodeCharSuppliedChar37 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIbanCodeCharSuppliedChar37(String value) {
        this.outIbanCodeCharSuppliedChar37 = value;
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
     * Gets the value of the outIssueOfficeUnitCode property.
     * 
     */
    public int getOutIssueOfficeUnitCode() {
        return outIssueOfficeUnitCode;
    }

    /**
     * Sets the value of the outIssueOfficeUnitCode property.
     * 
     */
    public void setOutIssueOfficeUnitCode(int value) {
        this.outIssueOfficeUnitCode = value;
    }

    /**
     * Gets the value of the outIssueOfficeUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIssueOfficeUnitUnitName() {
        return outIssueOfficeUnitUnitName;
    }

    /**
     * Sets the value of the outIssueOfficeUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIssueOfficeUnitUnitName(String value) {
        this.outIssueOfficeUnitUnitName = value;
    }

    /**
     * Gets the value of the outKekGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutKekGenericDetailDescription() {
        return outKekGenericDetailDescription;
    }

    /**
     * Sets the value of the outKekGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutKekGenericDetailDescription(String value) {
        this.outKekGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outKekGenericDetailSerialNum property.
     * 
     */
    public int getOutKekGenericDetailSerialNum() {
        return outKekGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outKekGenericDetailSerialNum property.
     * 
     */
    public void setOutKekGenericDetailSerialNum(int value) {
        this.outKekGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outLnsCommissionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLnsCommissionDescription() {
        return outLnsCommissionDescription;
    }

    /**
     * Sets the value of the outLnsCommissionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLnsCommissionDescription(String value) {
        this.outLnsCommissionDescription = value;
    }

    /**
     * Gets the value of the outLnsCommissionIdCommission property.
     * 
     */
    public int getOutLnsCommissionIdCommission() {
        return outLnsCommissionIdCommission;
    }

    /**
     * Sets the value of the outLnsCommissionIdCommission property.
     * 
     */
    public void setOutLnsCommissionIdCommission(int value) {
        this.outLnsCommissionIdCommission = value;
    }

    /**
     * Gets the value of the outLoanAccountRecyclingFrequency property.
     * 
     */
    public short getOutLoanAccountRecyclingFrequency() {
        return outLoanAccountRecyclingFrequency;
    }

    /**
     * Sets the value of the outLoanAccountRecyclingFrequency property.
     * 
     */
    public void setOutLoanAccountRecyclingFrequency(short value) {
        this.outLoanAccountRecyclingFrequency = value;
    }

    /**
     * Gets the value of the outLpurpGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLpurpGenericDetailDescription() {
        return outLpurpGenericDetailDescription;
    }

    /**
     * Sets the value of the outLpurpGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLpurpGenericDetailDescription(String value) {
        this.outLpurpGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outLpurpGenericDetailSerialNum property.
     * 
     */
    public int getOutLpurpGenericDetailSerialNum() {
        return outLpurpGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outLpurpGenericDetailSerialNum property.
     * 
     */
    public void setOutLpurpGenericDetailSerialNum(int value) {
        this.outLpurpGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outMaxBalOdMinMaxBalMaxBalance01 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutMaxBalOdMinMaxBalMaxBalance01() {
        return outMaxBalOdMinMaxBalMaxBalance01;
    }

    /**
     * Sets the value of the outMaxBalOdMinMaxBalMaxBalance01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutMaxBalOdMinMaxBalMaxBalance01(BigDecimal value) {
        this.outMaxBalOdMinMaxBalMaxBalance01 = value;
    }

    /**
     * Gets the value of the outMaxBalOdMinMaxBalMaxBalDate01 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutMaxBalOdMinMaxBalMaxBalDate01() {
        return outMaxBalOdMinMaxBalMaxBalDate01;
    }

    /**
     * Sets the value of the outMaxBalOdMinMaxBalMaxBalDate01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutMaxBalOdMinMaxBalMaxBalDate01(XMLGregorianCalendar value) {
        this.outMaxBalOdMinMaxBalMaxBalDate01 = value;
    }

    /**
     * Gets the value of the outMinBalOdMinMaxBalMinBalance01 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutMinBalOdMinMaxBalMinBalance01() {
        return outMinBalOdMinMaxBalMinBalance01;
    }

    /**
     * Sets the value of the outMinBalOdMinMaxBalMinBalance01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutMinBalOdMinMaxBalMinBalance01(BigDecimal value) {
        this.outMinBalOdMinMaxBalMinBalance01 = value;
    }

    /**
     * Gets the value of the outMinBalOdMinMaxBalMinBalDate01 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutMinBalOdMinMaxBalMinBalDate01() {
        return outMinBalOdMinMaxBalMinBalDate01;
    }

    /**
     * Sets the value of the outMinBalOdMinMaxBalMinBalDate01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutMinBalOdMinMaxBalMinBalDate01(XMLGregorianCalendar value) {
        this.outMinBalOdMinMaxBalMinBalDate01 = value;
    }

    /**
     * Gets the value of the outMonitorBankemployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMonitorBankemployeeId() {
        return outMonitorBankemployeeId;
    }

    /**
     * Sets the value of the outMonitorBankemployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMonitorBankemployeeId(String value) {
        this.outMonitorBankemployeeId = value;
    }

    /**
     * Gets the value of the outMonitorEmployeeLnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMonitorEmployeeLnsSuppliedName() {
        return outMonitorEmployeeLnsSuppliedName;
    }

    /**
     * Sets the value of the outMonitorEmployeeLnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMonitorEmployeeLnsSuppliedName(String value) {
        this.outMonitorEmployeeLnsSuppliedName = value;
    }

    /**
     * Gets the value of the outN128HintScalePercentage00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutN128HintScalePercentage00() {
        return outN128HintScalePercentage00;
    }

    /**
     * Sets the value of the outN128HintScalePercentage00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutN128HintScalePercentage00(BigDecimal value) {
        this.outN128HintScalePercentage00 = value;
    }

    /**
     * Gets the value of the outN128LnsInterestDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutN128LnsInterestDescription() {
        return outN128LnsInterestDescription;
    }

    /**
     * Sets the value of the outN128LnsInterestDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutN128LnsInterestDescription(String value) {
        this.outN128LnsInterestDescription = value;
    }

    /**
     * Gets the value of the outN128LnsInterestForDebit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutN128LnsInterestForDebit() {
        return outN128LnsInterestForDebit;
    }

    /**
     * Sets the value of the outN128LnsInterestForDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutN128LnsInterestForDebit(String value) {
        this.outN128LnsInterestForDebit = value;
    }

    /**
     * Gets the value of the outN128LnsInterestIdInterest property.
     * 
     */
    public int getOutN128LnsInterestIdInterest() {
        return outN128LnsInterestIdInterest;
    }

    /**
     * Sets the value of the outN128LnsInterestIdInterest property.
     * 
     */
    public void setOutN128LnsInterestIdInterest(int value) {
        this.outN128LnsInterestIdInterest = value;
    }

    /**
     * Gets the value of the outOdDbIntHintScaleLowLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutOdDbIntHintScaleLowLimit() {
        return outOdDbIntHintScaleLowLimit;
    }

    /**
     * Sets the value of the outOdDbIntHintScaleLowLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutOdDbIntHintScaleLowLimit(BigDecimal value) {
        this.outOdDbIntHintScaleLowLimit = value;
    }

    /**
     * Gets the value of the outOdDbIntHintScalePercentage00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutOdDbIntHintScalePercentage00() {
        return outOdDbIntHintScalePercentage00;
    }

    /**
     * Sets the value of the outOdDbIntHintScalePercentage00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutOdDbIntHintScalePercentage00(BigDecimal value) {
        this.outOdDbIntHintScalePercentage00 = value;
    }

    /**
     * Gets the value of the outOdDbIntHintScaleUpLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutOdDbIntHintScaleUpLimit() {
        return outOdDbIntHintScaleUpLimit;
    }

    /**
     * Sets the value of the outOdDbIntHintScaleUpLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutOdDbIntHintScaleUpLimit(BigDecimal value) {
        this.outOdDbIntHintScaleUpLimit = value;
    }

    /**
     * Gets the value of the outOneAccountIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOneAccountIefSuppliedFlag() {
        return outOneAccountIefSuppliedFlag;
    }

    /**
     * Sets the value of the outOneAccountIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOneAccountIefSuppliedFlag(String value) {
        this.outOneAccountIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outOneAccountProfitsAccountAccountCd property.
     * 
     */
    public short getOutOneAccountProfitsAccountAccountCd() {
        return outOneAccountProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outOneAccountProfitsAccountAccountCd property.
     * 
     */
    public void setOutOneAccountProfitsAccountAccountCd(short value) {
        this.outOneAccountProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outOneAccountProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOneAccountProfitsAccountAccountNumber() {
        return outOneAccountProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outOneAccountProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOneAccountProfitsAccountAccountNumber(String value) {
        this.outOneAccountProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outOneAccountProfitsAccountAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOneAccountProfitsAccountAccStatus() {
        return outOneAccountProfitsAccountAccStatus;
    }

    /**
     * Sets the value of the outOneAccountProfitsAccountAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOneAccountProfitsAccountAccStatus(String value) {
        this.outOneAccountProfitsAccountAccStatus = value;
    }

    /**
     * Gets the value of the outOneAccountProfitsAccountAgrMembershipSn property.
     * 
     */
    public int getOutOneAccountProfitsAccountAgrMembershipSn() {
        return outOneAccountProfitsAccountAgrMembershipSn;
    }

    /**
     * Sets the value of the outOneAccountProfitsAccountAgrMembershipSn property.
     * 
     */
    public void setOutOneAccountProfitsAccountAgrMembershipSn(int value) {
        this.outOneAccountProfitsAccountAgrMembershipSn = value;
    }

    /**
     * Gets the value of the outOneAccountProfitsAccountAgrSn property.
     * 
     */
    public int getOutOneAccountProfitsAccountAgrSn() {
        return outOneAccountProfitsAccountAgrSn;
    }

    /**
     * Sets the value of the outOneAccountProfitsAccountAgrSn property.
     * 
     */
    public void setOutOneAccountProfitsAccountAgrSn(int value) {
        this.outOneAccountProfitsAccountAgrSn = value;
    }

    /**
     * Gets the value of the outOneAccountProfitsAccountAgrUnit property.
     * 
     */
    public int getOutOneAccountProfitsAccountAgrUnit() {
        return outOneAccountProfitsAccountAgrUnit;
    }

    /**
     * Sets the value of the outOneAccountProfitsAccountAgrUnit property.
     * 
     */
    public void setOutOneAccountProfitsAccountAgrUnit(int value) {
        this.outOneAccountProfitsAccountAgrUnit = value;
    }

    /**
     * Gets the value of the outOneAccountProfitsAccountAgrYear property.
     * 
     */
    public short getOutOneAccountProfitsAccountAgrYear() {
        return outOneAccountProfitsAccountAgrYear;
    }

    /**
     * Sets the value of the outOneAccountProfitsAccountAgrYear property.
     * 
     */
    public void setOutOneAccountProfitsAccountAgrYear(short value) {
        this.outOneAccountProfitsAccountAgrYear = value;
    }

    /**
     * Gets the value of the outOneAccountProfitsAccountCDigit property.
     * 
     */
    public short getOutOneAccountProfitsAccountCDigit() {
        return outOneAccountProfitsAccountCDigit;
    }

    /**
     * Sets the value of the outOneAccountProfitsAccountCDigit property.
     * 
     */
    public void setOutOneAccountProfitsAccountCDigit(short value) {
        this.outOneAccountProfitsAccountCDigit = value;
    }

    /**
     * Gets the value of the outOneAccountProfitsAccountCustId property.
     * 
     */
    public int getOutOneAccountProfitsAccountCustId() {
        return outOneAccountProfitsAccountCustId;
    }

    /**
     * Sets the value of the outOneAccountProfitsAccountCustId property.
     * 
     */
    public void setOutOneAccountProfitsAccountCustId(int value) {
        this.outOneAccountProfitsAccountCustId = value;
    }

    /**
     * Gets the value of the outOneAccountProfitsAccountDepAccNumber property.
     * 
     */
    public double getOutOneAccountProfitsAccountDepAccNumber() {
        return outOneAccountProfitsAccountDepAccNumber;
    }

    /**
     * Sets the value of the outOneAccountProfitsAccountDepAccNumber property.
     * 
     */
    public void setOutOneAccountProfitsAccountDepAccNumber(double value) {
        this.outOneAccountProfitsAccountDepAccNumber = value;
    }

    /**
     * Gets the value of the outOneAccountProfitsAccountDepOpenUnit property.
     * 
     */
    public int getOutOneAccountProfitsAccountDepOpenUnit() {
        return outOneAccountProfitsAccountDepOpenUnit;
    }

    /**
     * Sets the value of the outOneAccountProfitsAccountDepOpenUnit property.
     * 
     */
    public void setOutOneAccountProfitsAccountDepOpenUnit(int value) {
        this.outOneAccountProfitsAccountDepOpenUnit = value;
    }

    /**
     * Gets the value of the outOneAccountProfitsAccountLgAccSn property.
     * 
     */
    public double getOutOneAccountProfitsAccountLgAccSn() {
        return outOneAccountProfitsAccountLgAccSn;
    }

    /**
     * Sets the value of the outOneAccountProfitsAccountLgAccSn property.
     * 
     */
    public void setOutOneAccountProfitsAccountLgAccSn(double value) {
        this.outOneAccountProfitsAccountLgAccSn = value;
    }

    /**
     * Gets the value of the outOneAccountProfitsAccountLgOpenUnit property.
     * 
     */
    public int getOutOneAccountProfitsAccountLgOpenUnit() {
        return outOneAccountProfitsAccountLgOpenUnit;
    }

    /**
     * Sets the value of the outOneAccountProfitsAccountLgOpenUnit property.
     * 
     */
    public void setOutOneAccountProfitsAccountLgOpenUnit(int value) {
        this.outOneAccountProfitsAccountLgOpenUnit = value;
    }

    /**
     * Gets the value of the outOneAccountProfitsAccountLimitCurrency property.
     * 
     */
    public int getOutOneAccountProfitsAccountLimitCurrency() {
        return outOneAccountProfitsAccountLimitCurrency;
    }

    /**
     * Sets the value of the outOneAccountProfitsAccountLimitCurrency property.
     * 
     */
    public void setOutOneAccountProfitsAccountLimitCurrency(int value) {
        this.outOneAccountProfitsAccountLimitCurrency = value;
    }

    /**
     * Gets the value of the outOneAccountProfitsAccountLnsOpenUnit property.
     * 
     */
    public int getOutOneAccountProfitsAccountLnsOpenUnit() {
        return outOneAccountProfitsAccountLnsOpenUnit;
    }

    /**
     * Sets the value of the outOneAccountProfitsAccountLnsOpenUnit property.
     * 
     */
    public void setOutOneAccountProfitsAccountLnsOpenUnit(int value) {
        this.outOneAccountProfitsAccountLnsOpenUnit = value;
    }

    /**
     * Gets the value of the outOneAccountProfitsAccountLnsSn property.
     * 
     */
    public int getOutOneAccountProfitsAccountLnsSn() {
        return outOneAccountProfitsAccountLnsSn;
    }

    /**
     * Sets the value of the outOneAccountProfitsAccountLnsSn property.
     * 
     */
    public void setOutOneAccountProfitsAccountLnsSn(int value) {
        this.outOneAccountProfitsAccountLnsSn = value;
    }

    /**
     * Gets the value of the outOneAccountProfitsAccountLnsType property.
     * 
     */
    public short getOutOneAccountProfitsAccountLnsType() {
        return outOneAccountProfitsAccountLnsType;
    }

    /**
     * Sets the value of the outOneAccountProfitsAccountLnsType property.
     * 
     */
    public void setOutOneAccountProfitsAccountLnsType(short value) {
        this.outOneAccountProfitsAccountLnsType = value;
    }

    /**
     * Gets the value of the outOneAccountProfitsAccountMonotoringUnit property.
     * 
     */
    public int getOutOneAccountProfitsAccountMonotoringUnit() {
        return outOneAccountProfitsAccountMonotoringUnit;
    }

    /**
     * Sets the value of the outOneAccountProfitsAccountMonotoringUnit property.
     * 
     */
    public void setOutOneAccountProfitsAccountMonotoringUnit(int value) {
        this.outOneAccountProfitsAccountMonotoringUnit = value;
    }

    /**
     * Gets the value of the outOneAccountProfitsAccountMovementCurrency property.
     * 
     */
    public int getOutOneAccountProfitsAccountMovementCurrency() {
        return outOneAccountProfitsAccountMovementCurrency;
    }

    /**
     * Sets the value of the outOneAccountProfitsAccountMovementCurrency property.
     * 
     */
    public void setOutOneAccountProfitsAccountMovementCurrency(int value) {
        this.outOneAccountProfitsAccountMovementCurrency = value;
    }

    /**
     * Gets the value of the outOneAccountProfitsAccountPrftSystem property.
     * 
     */
    public short getOutOneAccountProfitsAccountPrftSystem() {
        return outOneAccountProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the outOneAccountProfitsAccountPrftSystem property.
     * 
     */
    public void setOutOneAccountProfitsAccountPrftSystem(short value) {
        this.outOneAccountProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the outOneAccountProfitsAccountProductId property.
     * 
     */
    public int getOutOneAccountProfitsAccountProductId() {
        return outOneAccountProfitsAccountProductId;
    }

    /**
     * Sets the value of the outOneAccountProfitsAccountProductId property.
     * 
     */
    public void setOutOneAccountProfitsAccountProductId(int value) {
        this.outOneAccountProfitsAccountProductId = value;
    }

    /**
     * Gets the value of the outOneAccountProfitsAccountTrOpenUnit property.
     * 
     */
    public int getOutOneAccountProfitsAccountTrOpenUnit() {
        return outOneAccountProfitsAccountTrOpenUnit;
    }

    /**
     * Sets the value of the outOneAccountProfitsAccountTrOpenUnit property.
     * 
     */
    public void setOutOneAccountProfitsAccountTrOpenUnit(int value) {
        this.outOneAccountProfitsAccountTrOpenUnit = value;
    }

    /**
     * Gets the value of the outOneAccountProfitsAccountTrSn property.
     * 
     */
    public int getOutOneAccountProfitsAccountTrSn() {
        return outOneAccountProfitsAccountTrSn;
    }

    /**
     * Sets the value of the outOneAccountProfitsAccountTrSn property.
     * 
     */
    public void setOutOneAccountProfitsAccountTrSn(int value) {
        this.outOneAccountProfitsAccountTrSn = value;
    }

    /**
     * Gets the value of the outOneAccountProfitsAccountTrType property.
     * 
     */
    public short getOutOneAccountProfitsAccountTrType() {
        return outOneAccountProfitsAccountTrType;
    }

    /**
     * Sets the value of the outOneAccountProfitsAccountTrType property.
     * 
     */
    public void setOutOneAccountProfitsAccountTrType(short value) {
        this.outOneAccountProfitsAccountTrType = value;
    }

    /**
     * Gets the value of the outOpenedUserLnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOpenedUserLnsSuppliedName() {
        return outOpenedUserLnsSuppliedName;
    }

    /**
     * Sets the value of the outOpenedUserLnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOpenedUserLnsSuppliedName(String value) {
        this.outOpenedUserLnsSuppliedName = value;
    }

    /**
     * Gets the value of the outOpenUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOpenUsrCode() {
        return outOpenUsrCode;
    }

    /**
     * Sets the value of the outOpenUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOpenUsrCode(String value) {
        this.outOpenUsrCode = value;
    }

    /**
     * Gets the value of the outOverdrCurrentPeriodIefSuppliedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutOverdrCurrentPeriodIefSuppliedDate() {
        return outOverdrCurrentPeriodIefSuppliedDate;
    }

    /**
     * Sets the value of the outOverdrCurrentPeriodIefSuppliedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutOverdrCurrentPeriodIefSuppliedDate(XMLGregorianCalendar value) {
        this.outOverdrCurrentPeriodIefSuppliedDate = value;
    }

    /**
     * Gets the value of the outOverdrCurrentPeriodIefSuppliedText15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOverdrCurrentPeriodIefSuppliedText15() {
        return outOverdrCurrentPeriodIefSuppliedText15;
    }

    /**
     * Sets the value of the outOverdrCurrentPeriodIefSuppliedText15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOverdrCurrentPeriodIefSuppliedText15(String value) {
        this.outOverdrCurrentPeriodIefSuppliedText15 = value;
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
     * Gets the value of the outProffForFifthCustGenericDetailSerialNum property.
     * 
     */
    public int getOutProffForFifthCustGenericDetailSerialNum() {
        return outProffForFifthCustGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outProffForFifthCustGenericDetailSerialNum property.
     * 
     */
    public void setOutProffForFifthCustGenericDetailSerialNum(int value) {
        this.outProffForFifthCustGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outProffForFourthCustGenericDetailSerialNum property.
     * 
     */
    public int getOutProffForFourthCustGenericDetailSerialNum() {
        return outProffForFourthCustGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outProffForFourthCustGenericDetailSerialNum property.
     * 
     */
    public void setOutProffForFourthCustGenericDetailSerialNum(int value) {
        this.outProffForFourthCustGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outProffForSecCustGenericDetailSerialNum property.
     * 
     */
    public int getOutProffForSecCustGenericDetailSerialNum() {
        return outProffForSecCustGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outProffForSecCustGenericDetailSerialNum property.
     * 
     */
    public void setOutProffForSecCustGenericDetailSerialNum(int value) {
        this.outProffForSecCustGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outProffForThirdCustGenericDetailSerialNum property.
     * 
     */
    public int getOutProffForThirdCustGenericDetailSerialNum() {
        return outProffForThirdCustGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outProffForThirdCustGenericDetailSerialNum property.
     * 
     */
    public void setOutProffForThirdCustGenericDetailSerialNum(int value) {
        this.outProffForThirdCustGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outProfGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProfGenericDetailDescription() {
        return outProfGenericDetailDescription;
    }

    /**
     * Sets the value of the outProfGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProfGenericDetailDescription(String value) {
        this.outProfGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outProfGenericDetailSerialNum property.
     * 
     */
    public int getOutProfGenericDetailSerialNum() {
        return outProfGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outProfGenericDetailSerialNum property.
     * 
     */
    public void setOutProfGenericDetailSerialNum(int value) {
        this.outProfGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outSalePersonGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSalePersonGenericDetailDescription() {
        return outSalePersonGenericDetailDescription;
    }

    /**
     * Sets the value of the outSalePersonGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSalePersonGenericDetailDescription(String value) {
        this.outSalePersonGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outSalePersonGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSalePersonGenericDetailShortDescription() {
        return outSalePersonGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outSalePersonGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSalePersonGenericDetailShortDescription(String value) {
        this.outSalePersonGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outSaleUnitGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSaleUnitGenericDetailDescription() {
        return outSaleUnitGenericDetailDescription;
    }

    /**
     * Sets the value of the outSaleUnitGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSaleUnitGenericDetailDescription(String value) {
        this.outSaleUnitGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outSaleUnitGenericDetailSerialNum property.
     * 
     */
    public int getOutSaleUnitGenericDetailSerialNum() {
        return outSaleUnitGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outSaleUnitGenericDetailSerialNum property.
     * 
     */
    public void setOutSaleUnitGenericDetailSerialNum(int value) {
        this.outSaleUnitGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outSecCustCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSecCustCustAddressAddress1() {
        return outSecCustCustAddressAddress1;
    }

    /**
     * Sets the value of the outSecCustCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSecCustCustAddressAddress1(String value) {
        this.outSecCustCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the outSecCustCustAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSecCustCustAddressCity() {
        return outSecCustCustAddressCity;
    }

    /**
     * Sets the value of the outSecCustCustAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSecCustCustAddressCity(String value) {
        this.outSecCustCustAddressCity = value;
    }

    /**
     * Gets the value of the outSecCustCustAddressEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSecCustCustAddressEntryStatus() {
        return outSecCustCustAddressEntryStatus;
    }

    /**
     * Sets the value of the outSecCustCustAddressEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSecCustCustAddressEntryStatus(String value) {
        this.outSecCustCustAddressEntryStatus = value;
    }

    /**
     * Gets the value of the outSecCustCustAddressTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSecCustCustAddressTelephone() {
        return outSecCustCustAddressTelephone;
    }

    /**
     * Sets the value of the outSecCustCustAddressTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSecCustCustAddressTelephone(String value) {
        this.outSecCustCustAddressTelephone = value;
    }

    /**
     * Gets the value of the outSecCustOtherAfmAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSecCustOtherAfmAfmNo() {
        return outSecCustOtherAfmAfmNo;
    }

    /**
     * Sets the value of the outSecCustOtherAfmAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSecCustOtherAfmAfmNo(String value) {
        this.outSecCustOtherAfmAfmNo = value;
    }

    /**
     * Gets the value of the outSecCustOtherAfmMainFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSecCustOtherAfmMainFlag() {
        return outSecCustOtherAfmMainFlag;
    }

    /**
     * Sets the value of the outSecCustOtherAfmMainFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSecCustOtherAfmMainFlag(String value) {
        this.outSecCustOtherAfmMainFlag = value;
    }

    /**
     * Gets the value of the outSecondCredLnsInterestDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSecondCredLnsInterestDescription() {
        return outSecondCredLnsInterestDescription;
    }

    /**
     * Sets the value of the outSecondCredLnsInterestDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSecondCredLnsInterestDescription(String value) {
        this.outSecondCredLnsInterestDescription = value;
    }

    /**
     * Gets the value of the outSecondCredLnsInterestIdInterest property.
     * 
     */
    public int getOutSecondCredLnsInterestIdInterest() {
        return outSecondCredLnsInterestIdInterest;
    }

    /**
     * Sets the value of the outSecondCredLnsInterestIdInterest property.
     * 
     */
    public void setOutSecondCredLnsInterestIdInterest(int value) {
        this.outSecondCredLnsInterestIdInterest = value;
    }

    /**
     * Gets the value of the outSecondOtherIdIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSecondOtherIdIdNo() {
        return outSecondOtherIdIdNo;
    }

    /**
     * Sets the value of the outSecondOtherIdIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSecondOtherIdIdNo(String value) {
        this.outSecondOtherIdIdNo = value;
    }

    /**
     * Gets the value of the outSecondOtherIdMainFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSecondOtherIdMainFlag() {
        return outSecondOtherIdMainFlag;
    }

    /**
     * Sets the value of the outSecondOtherIdMainFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSecondOtherIdMainFlag(String value) {
        this.outSecondOtherIdMainFlag = value;
    }

    /**
     * Gets the value of the outSecretConfirmDepositAccountSecretAccFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSecretConfirmDepositAccountSecretAccFlag() {
        return outSecretConfirmDepositAccountSecretAccFlag;
    }

    /**
     * Sets the value of the outSecretConfirmDepositAccountSecretAccFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSecretConfirmDepositAccountSecretAccFlag(String value) {
        this.outSecretConfirmDepositAccountSecretAccFlag = value;
    }

    /**
     * Gets the value of the outServiceDepositAccountAccountNumber property.
     * 
     */
    public double getOutServiceDepositAccountAccountNumber() {
        return outServiceDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the outServiceDepositAccountAccountNumber property.
     * 
     */
    public void setOutServiceDepositAccountAccountNumber(double value) {
        this.outServiceDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outServiceDepositAccountCDigit property.
     * 
     */
    public short getOutServiceDepositAccountCDigit() {
        return outServiceDepositAccountCDigit;
    }

    /**
     * Sets the value of the outServiceDepositAccountCDigit property.
     * 
     */
    public void setOutServiceDepositAccountCDigit(short value) {
        this.outServiceDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the outServicesProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutServicesProfitsAccountAccountNumber() {
        return outServicesProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outServicesProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutServicesProfitsAccountAccountNumber(String value) {
        this.outServicesProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outSumRetainInterResCrIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSumRetainInterResCrIntAmn() {
        return outSumRetainInterResCrIntAmn;
    }

    /**
     * Sets the value of the outSumRetainInterResCrIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSumRetainInterResCrIntAmn(BigDecimal value) {
        this.outSumRetainInterResCrIntAmn = value;
    }

    /**
     * Gets the value of the outTaxCountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTaxCountryGenericDetailDescription() {
        return outTaxCountryGenericDetailDescription;
    }

    /**
     * Sets the value of the outTaxCountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTaxCountryGenericDetailDescription(String value) {
        this.outTaxCountryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outTaxCountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTaxCountryGenericDetailShortDescription() {
        return outTaxCountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outTaxCountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTaxCountryGenericDetailShortDescription(String value) {
        this.outTaxCountryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outThirdCustCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutThirdCustCustAddressAddress1() {
        return outThirdCustCustAddressAddress1;
    }

    /**
     * Sets the value of the outThirdCustCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutThirdCustCustAddressAddress1(String value) {
        this.outThirdCustCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the outThirdCustCustAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutThirdCustCustAddressCity() {
        return outThirdCustCustAddressCity;
    }

    /**
     * Sets the value of the outThirdCustCustAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutThirdCustCustAddressCity(String value) {
        this.outThirdCustCustAddressCity = value;
    }

    /**
     * Gets the value of the outThirdCustCustAddressEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutThirdCustCustAddressEntryStatus() {
        return outThirdCustCustAddressEntryStatus;
    }

    /**
     * Sets the value of the outThirdCustCustAddressEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutThirdCustCustAddressEntryStatus(String value) {
        this.outThirdCustCustAddressEntryStatus = value;
    }

    /**
     * Gets the value of the outThirdCustCustAddressTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutThirdCustCustAddressTelephone() {
        return outThirdCustCustAddressTelephone;
    }

    /**
     * Sets the value of the outThirdCustCustAddressTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutThirdCustCustAddressTelephone(String value) {
        this.outThirdCustCustAddressTelephone = value;
    }

    /**
     * Gets the value of the outThirdCustOtherAfmAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutThirdCustOtherAfmAfmNo() {
        return outThirdCustOtherAfmAfmNo;
    }

    /**
     * Sets the value of the outThirdCustOtherAfmAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutThirdCustOtherAfmAfmNo(String value) {
        this.outThirdCustOtherAfmAfmNo = value;
    }

    /**
     * Gets the value of the outThirdCustOtherAfmMainFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutThirdCustOtherAfmMainFlag() {
        return outThirdCustOtherAfmMainFlag;
    }

    /**
     * Sets the value of the outThirdCustOtherAfmMainFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutThirdCustOtherAfmMainFlag(String value) {
        this.outThirdCustOtherAfmMainFlag = value;
    }

    /**
     * Gets the value of the outThirdOtherIdIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutThirdOtherIdIdNo() {
        return outThirdOtherIdIdNo;
    }

    /**
     * Sets the value of the outThirdOtherIdIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutThirdOtherIdIdNo(String value) {
        this.outThirdOtherIdIdNo = value;
    }

    /**
     * Gets the value of the outThirdOtherIdMainFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutThirdOtherIdMainFlag() {
        return outThirdOtherIdMainFlag;
    }

    /**
     * Sets the value of the outThirdOtherIdMainFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutThirdOtherIdMainFlag(String value) {
        this.outThirdOtherIdMainFlag = value;
    }

    /**
     * Gets the value of the outTimeDeposRenewalDaysDuration property.
     * 
     */
    public short getOutTimeDeposRenewalDaysDuration() {
        return outTimeDeposRenewalDaysDuration;
    }

    /**
     * Sets the value of the outTimeDeposRenewalDaysDuration property.
     * 
     */
    public void setOutTimeDeposRenewalDaysDuration(short value) {
        this.outTimeDeposRenewalDaysDuration = value;
    }

    /**
     * Gets the value of the outTimeDeposRenewalDurationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTimeDeposRenewalDurationUnit() {
        return outTimeDeposRenewalDurationUnit;
    }

    /**
     * Sets the value of the outTimeDeposRenewalDurationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTimeDeposRenewalDurationUnit(String value) {
        this.outTimeDeposRenewalDurationUnit = value;
    }

    /**
     * Gets the value of the outTimeDeposRenewalDurationValue property.
     * 
     */
    public short getOutTimeDeposRenewalDurationValue() {
        return outTimeDeposRenewalDurationValue;
    }

    /**
     * Sets the value of the outTimeDeposRenewalDurationValue property.
     * 
     */
    public void setOutTimeDeposRenewalDurationValue(short value) {
        this.outTimeDeposRenewalDurationValue = value;
    }

    /**
     * Gets the value of the outTimeDeposRenewalExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTimeDeposRenewalExpiryDate() {
        return outTimeDeposRenewalExpiryDate;
    }

    /**
     * Sets the value of the outTimeDeposRenewalExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTimeDeposRenewalExpiryDate(XMLGregorianCalendar value) {
        this.outTimeDeposRenewalExpiryDate = value;
    }

    /**
     * Gets the value of the outTimeDeposRenewalRenewalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTimeDeposRenewalRenewalDate() {
        return outTimeDeposRenewalRenewalDate;
    }

    /**
     * Sets the value of the outTimeDeposRenewalRenewalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTimeDeposRenewalRenewalDate(XMLGregorianCalendar value) {
        this.outTimeDeposRenewalRenewalDate = value;
    }

    /**
     * Gets the value of the outTimeDeposRenewalStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTimeDeposRenewalStartDate() {
        return outTimeDeposRenewalStartDate;
    }

    /**
     * Sets the value of the outTimeDeposRenewalStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTimeDeposRenewalStartDate(XMLGregorianCalendar value) {
        this.outTimeDeposRenewalStartDate = value;
    }

    /**
     * Gets the value of the outTotAccrDbInterestIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotAccrDbInterestIefSuppliedNumber152() {
        return outTotAccrDbInterestIefSuppliedNumber152;
    }

    /**
     * Sets the value of the outTotAccrDbInterestIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotAccrDbInterestIefSuppliedNumber152(BigDecimal value) {
        this.outTotAccrDbInterestIefSuppliedNumber152 = value;
    }

    /**
     * Gets the value of the outTotDepAccountTotalTotalCredit01 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotDepAccountTotalTotalCredit01() {
        return outTotDepAccountTotalTotalCredit01;
    }

    /**
     * Sets the value of the outTotDepAccountTotalTotalCredit01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotDepAccountTotalTotalCredit01(BigDecimal value) {
        this.outTotDepAccountTotalTotalCredit01 = value;
    }

    /**
     * Gets the value of the outTotDepAccountTotalTotalDebit01 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotDepAccountTotalTotalDebit01() {
        return outTotDepAccountTotalTotalDebit01;
    }

    /**
     * Sets the value of the outTotDepAccountTotalTotalDebit01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotDepAccountTotalTotalDebit01(BigDecimal value) {
        this.outTotDepAccountTotalTotalDebit01 = value;
    }

    /**
     * Gets the value of the outTotFdTdDepAccountTotalTotalCredit01 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotFdTdDepAccountTotalTotalCredit01() {
        return outTotFdTdDepAccountTotalTotalCredit01;
    }

    /**
     * Sets the value of the outTotFdTdDepAccountTotalTotalCredit01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotFdTdDepAccountTotalTotalCredit01(BigDecimal value) {
        this.outTotFdTdDepAccountTotalTotalCredit01 = value;
    }

    /**
     * Gets the value of the outTotFdTdDepAccountTotalTotalDebit01 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotFdTdDepAccountTotalTotalDebit01() {
        return outTotFdTdDepAccountTotalTotalDebit01;
    }

    /**
     * Sets the value of the outTotFdTdDepAccountTotalTotalDebit01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotFdTdDepAccountTotalTotalDebit01(BigDecimal value) {
        this.outTotFdTdDepAccountTotalTotalDebit01 = value;
    }

    /**
     * Gets the value of the outUpdateUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUpdateUsrCode() {
        return outUpdateUsrCode;
    }

    /**
     * Sets the value of the outUpdateUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUpdateUsrCode(String value) {
        this.outUpdateUsrCode = value;
    }

    /**
     * Gets the value of the outUpdateUsrLnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUpdateUsrLnsSuppliedName() {
        return outUpdateUsrLnsSuppliedName;
    }

    /**
     * Sets the value of the outUpdateUsrLnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUpdateUsrLnsSuppliedName(String value) {
        this.outUpdateUsrLnsSuppliedName = value;
    }

    /**
     * Gets the value of the outWithdrawDayFromIefSuppliedDays property.
     * 
     */
    public int getOutWithdrawDayFromIefSuppliedDays() {
        return outWithdrawDayFromIefSuppliedDays;
    }

    /**
     * Sets the value of the outWithdrawDayFromIefSuppliedDays property.
     * 
     */
    public void setOutWithdrawDayFromIefSuppliedDays(int value) {
        this.outWithdrawDayFromIefSuppliedDays = value;
    }

    /**
     * Gets the value of the outWithdrawDayFromIefSuppliedMonth property.
     * 
     */
    public short getOutWithdrawDayFromIefSuppliedMonth() {
        return outWithdrawDayFromIefSuppliedMonth;
    }

    /**
     * Sets the value of the outWithdrawDayFromIefSuppliedMonth property.
     * 
     */
    public void setOutWithdrawDayFromIefSuppliedMonth(short value) {
        this.outWithdrawDayFromIefSuppliedMonth = value;
    }

    /**
     * Gets the value of the outWithdrawDayToIefSuppliedDays property.
     * 
     */
    public int getOutWithdrawDayToIefSuppliedDays() {
        return outWithdrawDayToIefSuppliedDays;
    }

    /**
     * Sets the value of the outWithdrawDayToIefSuppliedDays property.
     * 
     */
    public void setOutWithdrawDayToIefSuppliedDays(int value) {
        this.outWithdrawDayToIefSuppliedDays = value;
    }

    /**
     * Gets the value of the outWithdrawDayToIefSuppliedMonth property.
     * 
     */
    public short getOutWithdrawDayToIefSuppliedMonth() {
        return outWithdrawDayToIefSuppliedMonth;
    }

    /**
     * Sets the value of the outWithdrawDayToIefSuppliedMonth property.
     * 
     */
    public void setOutWithdrawDayToIefSuppliedMonth(short value) {
        this.outWithdrawDayToIefSuppliedMonth = value;
    }

    /**
     * Gets the value of the outOpenUnitCommentsIefSuppliedText40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOpenUnitCommentsIefSuppliedText40() {
        return outOpenUnitCommentsIefSuppliedText40;
    }

    /**
     * Sets the value of the outOpenUnitCommentsIefSuppliedText40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOpenUnitCommentsIefSuppliedText40(String value) {
        this.outOpenUnitCommentsIefSuppliedText40 = value;
    }

    /**
     * Gets the value of the outGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGroupD }
     *     
     */
    public ArrayOfOutGroupD getOutGroup() {
        return outGroup;
    }

    /**
     * Sets the value of the outGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGroupD }
     *     
     */
    public void setOutGroup(ArrayOfOutGroupD value) {
        this.outGroup = value;
    }

    /**
     * Gets the value of the outGrpBalances property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpBalances }
     *     
     */
    public ArrayOfOutGrpBalances getOutGrpBalances() {
        return outGrpBalances;
    }

    /**
     * Sets the value of the outGrpBalances property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpBalances }
     *     
     */
    public void setOutGrpBalances(ArrayOfOutGrpBalances value) {
        this.outGrpBalances = value;
    }

    /**
     * Gets the value of the outGrpBalancesFdTd property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpBalancesFdTd }
     *     
     */
    public ArrayOfOutGrpBalancesFdTd getOutGrpBalancesFdTd() {
        return outGrpBalancesFdTd;
    }

    /**
     * Sets the value of the outGrpBalancesFdTd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpBalancesFdTd }
     *     
     */
    public void setOutGrpBalancesFdTd(ArrayOfOutGrpBalancesFdTd value) {
        this.outGrpBalancesFdTd = value;
    }

    /**
     * Gets the value of the outAgrProfitsAccountAccountCd property.
     * 
     */
    public short getOutAgrProfitsAccountAccountCd() {
        return outAgrProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outAgrProfitsAccountAccountCd property.
     * 
     */
    public void setOutAgrProfitsAccountAccountCd(short value) {
        this.outAgrProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outDaysInExcessIefSuppliedNum5 property.
     * 
     */
    public int getOutDaysInExcessIefSuppliedNum5() {
        return outDaysInExcessIefSuppliedNum5;
    }

    /**
     * Sets the value of the outDaysInExcessIefSuppliedNum5 property.
     * 
     */
    public void setOutDaysInExcessIefSuppliedNum5(int value) {
        this.outDaysInExcessIefSuppliedNum5 = value;
    }

    /**
     * Gets the value of the outAccStatusIefSuppliedOverdraftAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAccStatusIefSuppliedOverdraftAccStatus() {
        return outAccStatusIefSuppliedOverdraftAccStatus;
    }

    /**
     * Sets the value of the outAccStatusIefSuppliedOverdraftAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAccStatusIefSuppliedOverdraftAccStatus(String value) {
        this.outAccStatusIefSuppliedOverdraftAccStatus = value;
    }

    /**
     * Gets the value of the outDepositAccountLastDormantDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDepositAccountLastDormantDate() {
        return outDepositAccountLastDormantDate;
    }

    /**
     * Sets the value of the outDepositAccountLastDormantDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDepositAccountLastDormantDate(XMLGregorianCalendar value) {
        this.outDepositAccountLastDormantDate = value;
    }

    /**
     * Gets the value of the outRefereeNameIefSuppliedChar100 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRefereeNameIefSuppliedChar100() {
        return outRefereeNameIefSuppliedChar100;
    }

    /**
     * Sets the value of the outRefereeNameIefSuppliedChar100 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRefereeNameIefSuppliedChar100(String value) {
        this.outRefereeNameIefSuppliedChar100 = value;
    }

    /**
     * Gets the value of the outRefereeAccNoIefSuppliedChar100 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRefereeAccNoIefSuppliedChar100() {
        return outRefereeAccNoIefSuppliedChar100;
    }

    /**
     * Sets the value of the outRefereeAccNoIefSuppliedChar100 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRefereeAccNoIefSuppliedChar100(String value) {
        this.outRefereeAccNoIefSuppliedChar100 = value;
    }

    /**
     * Gets the value of the outDepositAccountFreeText3IefSuppliedChar100 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountFreeText3IefSuppliedChar100() {
        return outDepositAccountFreeText3IefSuppliedChar100;
    }

    /**
     * Sets the value of the outDepositAccountFreeText3IefSuppliedChar100 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountFreeText3IefSuppliedChar100(String value) {
        this.outDepositAccountFreeText3IefSuppliedChar100 = value;
    }

    /**
     * Gets the value of the outDepositAccountFreeText4IefSuppliedChar100 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountFreeText4IefSuppliedChar100() {
        return outDepositAccountFreeText4IefSuppliedChar100;
    }

    /**
     * Sets the value of the outDepositAccountFreeText4IefSuppliedChar100 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountFreeText4IefSuppliedChar100(String value) {
        this.outDepositAccountFreeText4IefSuppliedChar100 = value;
    }

    /**
     * Gets the value of the outDepositAccountFreeText5IefSuppliedChar100 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountFreeText5IefSuppliedChar100() {
        return outDepositAccountFreeText5IefSuppliedChar100;
    }

    /**
     * Sets the value of the outDepositAccountFreeText5IefSuppliedChar100 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountFreeText5IefSuppliedChar100(String value) {
        this.outDepositAccountFreeText5IefSuppliedChar100 = value;
    }

    /**
     * Gets the value of the outCrmCodeGenericDetailSerialNum property.
     * 
     */
    public int getOutCrmCodeGenericDetailSerialNum() {
        return outCrmCodeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outCrmCodeGenericDetailSerialNum property.
     * 
     */
    public void setOutCrmCodeGenericDetailSerialNum(int value) {
        this.outCrmCodeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outCrmCodeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCrmCodeGenericDetailDescription() {
        return outCrmCodeGenericDetailDescription;
    }

    /**
     * Sets the value of the outCrmCodeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCrmCodeGenericDetailDescription(String value) {
        this.outCrmCodeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outDaysInDormantStatusIefSuppliedNum5 property.
     * 
     */
    public int getOutDaysInDormantStatusIefSuppliedNum5() {
        return outDaysInDormantStatusIefSuppliedNum5;
    }

    /**
     * Sets the value of the outDaysInDormantStatusIefSuppliedNum5 property.
     * 
     */
    public void setOutDaysInDormantStatusIefSuppliedNum5(int value) {
        this.outDaysInDormantStatusIefSuppliedNum5 = value;
    }

    /**
     * Gets the value of the outDaysSinceLastTrxDateIefSuppliedNum5 property.
     * 
     */
    public int getOutDaysSinceLastTrxDateIefSuppliedNum5() {
        return outDaysSinceLastTrxDateIefSuppliedNum5;
    }

    /**
     * Sets the value of the outDaysSinceLastTrxDateIefSuppliedNum5 property.
     * 
     */
    public void setOutDaysSinceLastTrxDateIefSuppliedNum5(int value) {
        this.outDaysSinceLastTrxDateIefSuppliedNum5 = value;
    }

}
