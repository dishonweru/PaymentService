
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for D0303VDepositAccountUpdateExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="D0303VDepositAccountUpdateExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutAccRetUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAccRetUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAccWithdrProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAchBnkCollaborationBanksAchBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAchBnkCollaborationBanksBankId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAchBnkCollaborationBanksBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgrProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAuthJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAuthJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAuthPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAuthPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAvgBaDepAccountTotalTotalProducts01" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAvgBalCurrYearDepAccountTotalTotalProducts01" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAvgBalPrevYearDepAccountTotalTotalProducts01" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBenefCustomerExpireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBenefCustomerFatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBenefCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBenefCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBlockIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBlockIefSuppliedText40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBlockUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCapitalDisposalDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutCapitalDisposalDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCapitalDisposalProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCoben2RetCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCoben2RetCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCoben2RetLnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCoben3RetCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCoben3RetCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCoben3RetLnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCoben4RetCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCoben4RetCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCoben4RetLnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCoben5RetCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCoben5RetCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCoben5RetLnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCompany1stcustomerIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCompany1stcustomerIefSuppliedDateFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCrDbInterestRetDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutCrDbInterestRetDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCrHintScalePercentage00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCrRetLnsInterestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCrRetLnsInterestForDebit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCrRetLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCurrTimePrintLineDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCurrTimePrintLineTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustCategGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustCategGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustCategGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustomerRetLnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDbCrInterProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDbHintScalePercentage00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDbRetLnsInterestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDbRetLnsInterestForDebit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDbRetLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepAccTrAccTrAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepAccTrAccTrAccSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepAccTrAccTrAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepAccTrAccTrAccUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepPendingTrxTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
 *         &lt;element name="OutDepositAccountMaxBenef" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepositAtmCardFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositChangeSpreadFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositChequeBookFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositCrInterAccLast" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDepositCustomerMaxAcc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepositDepIntMech" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositDepositType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositEncroachTolerance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositForeignCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositMFCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositMaxCustDpPer" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositMaxPrmWithdDays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepositMaxUpdate" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepositMinCustMFPer" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositMinDayAvailBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositMinDayDistrAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositMinTrxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositOverdraftFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositOverdraftLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositOverdraftMaxsprd" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositPassbookFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositPenaltyMaxSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositPenaltyMinSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositStatementIssFreq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositTelebankingFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDpHistInterRateEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutEconomyGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEconomyGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutEvaluationTeamInformationAuthorizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvaluationTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvaluationTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFinalCrHintScalePercentage00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFinalDbHintScalePercentage00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFinalExcIntHintScalePercentage00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFinalN128HintScalePercentage00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFixedLnsInterestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFixedLnsInterestDurationUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFixedLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutFixedLnsInterestIntDuration" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpBalances" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfD0303VOutGrpBalancesItem" minOccurs="0"/>
 *         &lt;element name="OutInvestDepositAccountCustPerMFAllow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInvestDepositAccountMaxLastDpPer" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutInvestDepositAccountMinLastMFPer" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutInvestProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIssueOfficeUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIssueOfficeUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutKekRetGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutKekRetGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoanAccountAccMechanism" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountRecyclingFrequency" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLongErrorMessageIefSuppliedActionEntryMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMaxBalOdMinMaxBalMaxBalDate01" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutMaxBalOdMinMaxBalMaxBalance01" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutMinBalOdMinMaxBalMinBalDate01" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutMinBalOdMinMaxBalMinBalance01" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutMonitorEmployeeRetLnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMonitorRetBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutN128HintScalePercentage00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutN128LnsInterestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutN128LnsInterestForDebit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutN128LnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutNumberOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOdDbIntHintScalePercentage00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutOpenRetUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOpenUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOpenUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOpenUnitCommentsIefSuppliedText40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOpenedUserLnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPackageIdPackage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutPackagePackageDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProfGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProfGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetDepAccountInfoCurFxIntExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepAccountInfoCurFxIntStDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepAccountInfoOaCollFreqUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepAccountInfoOaCollectFreq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetDepAccountInfoOaDuration" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetDepAccountInfoOaDurationUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepFixingRateRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountAccGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetDepositAccountAccountLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutRetDepositAccountAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountAccrCrExpInt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountAccrCrInterest" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountAccrDbInterest" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountAccrExcessInter" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountAccrN128Inter" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountAdditionalInfoFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountAkflag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountAnnounceTolDays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetDepositAccountApprChqAdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepositAccountApprChqCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetDepositAccountApprChqEdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepositAccountApprChqNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountApprChqPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountAtmCardFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountAutomChequeOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountAvailableBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountBackValeurDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepositAccountBalanceInterFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountBenefAddressSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetDepositAccountBlncBefOverdrn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountBlockedBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountBlockedStsExpiry" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepositAccountBoePercentance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountBoeSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountBondNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutRetDepositAccountBookBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountBookNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetDepositAccountCapIncreaseAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountChequeBookFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountChequeBooksCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetDepositAccountChequeOrderedCnt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutRetDepositAccountChequesBadCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetDepositAccountChequesBadTotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountChequesCancCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetDepositAccountChequesItemCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetDepositAccountChequesLostCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetDepositAccountChequesPaidCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetDepositAccountChequesStampCoun" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetDepositAccountChequesSteaCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetDepositAccountChequesStopCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetDepositAccountChequesUsedCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetDepositAccountClosingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepositAccountClosingTotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountCobenefCount" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetDepositAccountCobenefCountIns" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetDepositAccountCobenefSnMail" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetDepositAccountColInsertionDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepositAccountCollateralFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountCorrChqDetail1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountCorrChqDetail2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountCorrespAccInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountCrIntRtSprdInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountCrInterRateSpr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountCustPerMFAllow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountDateSinceOverdrn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepositAccountDbIntRtSprdInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountDbInterAccNext" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepositAccountDbInterRateSpr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountDbProgressInter" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountDbTransitIntTax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountDbTransitionInte" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountDefiniteDelay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountDepositType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountDrawDownWxpDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepositAccountDurationUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountDurationValue" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetDepositAccountEncroachTolerance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountExpCrIntSprd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepositAccountExpDbIntSprd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepositAccountExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepositAccountExpiryDateTd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepositAccountExternalAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountExtraitPrintDay" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetDepositAccountExtraitTrxCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetDepositAccountFcInterLcPrim" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountFcInterestLcFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountFcInterestLcNet" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountFinalWhldTaxFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountFixedInterFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountFixedInterRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountForecastBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountGlAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountGlAccountLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountHomeBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountIncomeAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountIncomeFrequency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetDepositAccountInitCrBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountInitDbBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountInitValueBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountInspectionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepositAccountInterPayOptions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountInterestPayInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountInterestToWithdr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountInvestFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountKadFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountLastBadCheqDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepositAccountLastBatchDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepositAccountLastInactiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepositAccountLastIntAvgBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountLastIntAvgCr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountLastIntAvgDb" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountLastIntChangDat" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepositAccountLastMaxUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepositAccountLastModifyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepositAccountLastPsbPrint" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepositAccountLastTdTrxId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetDepositAccountLastTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepositAccountLastTrxId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetDepositAccountLstStatementNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetDepositAccountManualMigrateFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountMaxLastDpPer" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountMaxLastUpdate" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetDepositAccountMinLastMFPer" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountMultiSalaryAmnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetDepositAccountNostroAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountNotExpensesFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountNotifSpreadDayB" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetDepositAccountNotifSpreadDays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetDepositAccountOfficeAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountOldAccNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountOpeningBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountOpeningDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepositAccountOverdraftComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountOverdraftRenewalFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountOverdraftSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountPassbookFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountPendingExtrLines" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutRetDepositAccountPrevAccountLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountPrevAvailableBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountPrevBlockedBalan" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountPrevBookBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountPrevDateSinceOv" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepositAccountPrevForecastBala" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountPrevLastTrxId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetDepositAccountPrevLstStatement" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetDepositAccountPrevPsbLineSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetDepositAccountPrevTempExcEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepositAccountPrevTempExcStar" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepositAccountPrevTemporaryExc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountPrevUnclearBala" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountPsbLastBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountPsbLastPrintLn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetDepositAccountPsbLineSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetDepositAccountPsbLostInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountPsbPendingLines" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetDepositAccountPsbSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetDepositAccountRenewalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepositAccountRenewalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountRenewalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetDepositAccountRestrictAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountRetainingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepositAccountSecretAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountServicePenalSpr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountSpecAgrPenFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountSpecAgrTrxFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountSpecialAccFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountStampAmountTotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountStartDateTd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepositAccountStartWdrBalPrd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepositAccountStatementIssFreq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountSystemUsageCnt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutRetDepositAccountTargetFlg" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetDepositAccountTaxExcempFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountTdBatchExtrtFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountTdInterPercentChg" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountTdInterSprdChg" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountTelebankingFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountTempExcEndDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepositAccountTempExcStartDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepositAccountTemporaryExcess" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountThirdpartyInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountTimestmp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepositAccountTotalPartPenalty" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountTransitionIntTax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountTransitionInter" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountUnclearBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountUnclearWithdrFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountUnutilLimitPenD" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountValidChqDuration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetDepositAccountWebFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountWebModDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetDepositAccountWithdrawAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountWithdrawBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetDepositAccountWthdrawSpread" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetOverdraftCurrencyDisplayedDecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetOverdraftCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetOverdraftCurrencyNationalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetProductInterBearing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrAddExcesLnsInterestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrAddExcesLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrAgrUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrAgreementAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrAgreementAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrAgreementAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetrCcodeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrCcodeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrCredGradGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrCredGradGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrLnsCommissionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrLnsCommissionIdCommission" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrLpurpGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrLpurpGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSalePersonGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSaleUnitGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSaleUnitGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSecondCredLnsInterestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSecondCredLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSecretConfirmDepositAccountSecretAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSecretConfirmProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutServiceRetDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutServiceRetDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutServicesProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSpecificBeneficiaryLnsSuppliedAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSpecificBeneficiaryLnsSuppliedCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSpecificBeneficiaryLnsSuppliedIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSpecificBeneficiaryLnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSpecificBeneficiaryLnsSuppliedReturnedCheckDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTaxCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTaxCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTimeDeposRenewalCrInterTaxPcg" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTimeDeposRenewalDaysDuration" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTimeDeposRenewalDurationUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTimeDeposRenewalDurationValue" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTimeDeposRenewalExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTimeDeposRenewalRenewalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTimeDeposRenewalStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTotAccrDbInterestIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotDepAccountTotalTotalCredit01" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotDepAccountTotalTotalDebit01" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutUpdDepMntRecordingTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutUpdateDepositAccountEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUpdateDepositAccountLastModifyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutUpdateDepositAccountOpeningDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutUpdateDepositAccountPassbookFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUpdateDepositAccountRestrictAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUpdateUserLnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUpdateUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUsedInputCharSuppliedChar37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutWithdrawDayFromIefSuppliedDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutWithdrawDayFromIefSuppliedMonth" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutWithdrawDayToIefSuppliedDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutWithdrawDayToIefSuppliedMonth" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetDepositAccountMailStatment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRefereeAccNoIefSuppliedChar100" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRefereeNameIefSuppliedChar100" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountFreeText3IefSuppliedChar100" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountFreeText4IefSuppliedChar100" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountFreeText5IefSuppliedChar100" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCrmCodeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCrmCodeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountLastDormantDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDaysInDormantStatusIefSuppliedNum5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDaysSinceLastTrxDateIefSuppliedNum5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetDepositAccountSwiftMt942" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetDepositAccountSwiftMt940" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "D0303VDepositAccountUpdateExport", propOrder = {
    "outAccRetUnitCode",
    "outAccRetUnitUnitName",
    "outAccWithdrProfitsAccountAccountNumber",
    "outAchBnkCollaborationBanksAchBankCode",
    "outAchBnkCollaborationBanksBankId",
    "outAchBnkCollaborationBanksBankName",
    "outAgrProfitsAccountAccountNumber",
    "outAuthJustificDescription",
    "outAuthJustificIdJustific",
    "outAuthPrftTransactionDescription",
    "outAuthPrftTransactionIdTransact",
    "outAvgBaDepAccountTotalTotalProducts01",
    "outAvgBalCurrYearDepAccountTotalTotalProducts01",
    "outAvgBalPrevYearDepAccountTotalTotalProducts01",
    "outBenefCustomerExpireDate",
    "outBenefCustomerFatherName",
    "outBenefCustomerFirstName",
    "outBenefCustomerSurname",
    "outBlockIefSuppliedDate",
    "outBlockIefSuppliedText40",
    "outBlockUsrCode",
    "outCapitalDisposalDepositAccountAccountNumber",
    "outCapitalDisposalDepositAccountCDigit",
    "outCapitalDisposalProfitsAccountAccountNumber",
    "outCoben2RetCustomerCDigit",
    "outCoben2RetCustomerCustId",
    "outCoben2RetLnsSuppliedName",
    "outCoben3RetCustomerCDigit",
    "outCoben3RetCustomerCustId",
    "outCoben3RetLnsSuppliedName",
    "outCoben4RetCustomerCDigit",
    "outCoben4RetCustomerCustId",
    "outCoben4RetLnsSuppliedName",
    "outCoben5RetCustomerCDigit",
    "outCoben5RetCustomerCustId",
    "outCoben5RetLnsSuppliedName",
    "outCompany1StcustomerIefSuppliedDate",
    "outCompany1StcustomerIefSuppliedDateFormat",
    "outCountryGenericDetailDescription",
    "outCrDbInterestRetDepositAccountAccountNumber",
    "outCrDbInterestRetDepositAccountCDigit",
    "outCrHintScalePercentage00",
    "outCrRetLnsInterestDescription",
    "outCrRetLnsInterestForDebit",
    "outCrRetLnsInterestIdInterest",
    "outCurrTimePrintLineDate",
    "outCurrTimePrintLineTime",
    "outCustAddressAddress1",
    "outCustAddressAddress2",
    "outCustAddressCity",
    "outCustAddressSerialNum",
    "outCustAddressTelephone",
    "outCustAddressZipCode",
    "outCustCategGenericDetailDescription",
    "outCustCategGenericDetailParameterType",
    "outCustCategGenericDetailSerialNum",
    "outCustomerRetLnsSuppliedName",
    "outDbCrInterProfitsAccountAccountNumber",
    "outDbHintScalePercentage00",
    "outDbRetLnsInterestDescription",
    "outDbRetLnsInterestForDebit",
    "outDbRetLnsInterestIdInterest",
    "outDepAccTrAccTrAccCd",
    "outDepAccTrAccTrAccSn",
    "outDepAccTrAccTrAccType",
    "outDepAccTrAccTrAccUnit",
    "outDepPendingTrxTrxDate",
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
    "outDepositAccountMaxBenef",
    "outDepositAtmCardFlag",
    "outDepositChangeSpreadFlg",
    "outDepositChequeBookFlag",
    "outDepositCrInterAccLast",
    "outDepositCustomerMaxAcc",
    "outDepositDepIntMech",
    "outDepositDepositType",
    "outDepositEncroachTolerance",
    "outDepositForeignCurrency",
    "outDepositMFCode",
    "outDepositMaxCustDpPer",
    "outDepositMaxPrmWithdDays",
    "outDepositMaxUpdate",
    "outDepositMinCustMFPer",
    "outDepositMinDayAvailBalance",
    "outDepositMinDayDistrAmnt",
    "outDepositMinTrxAmount",
    "outDepositOverdraftFlg",
    "outDepositOverdraftLimit",
    "outDepositOverdraftMaxsprd",
    "outDepositPassbookFlag",
    "outDepositPenaltyMaxSpread",
    "outDepositPenaltyMinSpread",
    "outDepositStatementIssFreq",
    "outDepositTelebankingFlag",
    "outDpHistInterRateEffectiveDate",
    "outEconomyGenericDetailDescription",
    "outEconomyGenericDetailSerialNum",
    "outEvaluationTeamInformationAuthorizationType",
    "outEvaluationTeamInformationRequiredProfile1",
    "outEvaluationTeamInformationRequiredProfile2",
    "outFinalCrHintScalePercentage00",
    "outFinalDbHintScalePercentage00",
    "outFinalExcIntHintScalePercentage00",
    "outFinalN128HintScalePercentage00",
    "outFixedLnsInterestDescription",
    "outFixedLnsInterestDurationUnit",
    "outFixedLnsInterestIdInterest",
    "outFixedLnsInterestIntDuration",
    "outGrpBalances",
    "outInvestDepositAccountCustPerMFAllow",
    "outInvestDepositAccountMaxLastDpPer",
    "outInvestDepositAccountMinLastMFPer",
    "outInvestProfitsAccountAccountNumber",
    "outIssueOfficeUnitCode",
    "outIssueOfficeUnitUnitName",
    "outKekRetGenericDetailDescription",
    "outKekRetGenericDetailSerialNum",
    "outLoanAccountAccMechanism",
    "outLoanAccountRecyclingFrequency",
    "outLongErrorMessageIefSuppliedActionEntryMsg",
    "outMaxBalOdMinMaxBalMaxBalDate01",
    "outMaxBalOdMinMaxBalMaxBalance01",
    "outMinBalOdMinMaxBalMinBalDate01",
    "outMinBalOdMinMaxBalMinBalance01",
    "outMonitorEmployeeRetLnsSuppliedName",
    "outMonitorRetBankemployeeId",
    "outN128HintScalePercentage00",
    "outN128LnsInterestDescription",
    "outN128LnsInterestForDebit",
    "outN128LnsInterestIdInterest",
    "outNumberOtherIdIdNo",
    "outOdDbIntHintScalePercentage00",
    "outOpenRetUsrCode",
    "outOpenUnitCode",
    "outOpenUnitUnitName",
    "outOpenUnitCommentsIefSuppliedText40",
    "outOpenedUserLnsSuppliedName",
    "outPackageIdPackage",
    "outPackagePackageDescr",
    "outProfGenericDetailDescription",
    "outProfGenericDetailSerialNum",
    "outRetCurrencyIdCurrency",
    "outRetCurrencyShortDescr",
    "outRetCustomerCDigit",
    "outRetCustomerCustId",
    "outRetDepAccountInfoCurFxIntExpDt",
    "outRetDepAccountInfoCurFxIntStDt",
    "outRetDepAccountInfoOaCollFreqUnit",
    "outRetDepAccountInfoOaCollectFreq",
    "outRetDepAccountInfoOaDuration",
    "outRetDepAccountInfoOaDurationUnit",
    "outRetDepFixingRateRate",
    "outRetDepositAccountAccGroup",
    "outRetDepositAccountAccountLimit",
    "outRetDepositAccountAccountNumber",
    "outRetDepositAccountAccountType",
    "outRetDepositAccountAccrCrExpInt",
    "outRetDepositAccountAccrCrInterest",
    "outRetDepositAccountAccrDbInterest",
    "outRetDepositAccountAccrExcessInter",
    "outRetDepositAccountAccrN128Inter",
    "outRetDepositAccountAdditionalInfoFlag",
    "outRetDepositAccountAkflag",
    "outRetDepositAccountAnnounceTolDays",
    "outRetDepositAccountApprChqAdate",
    "outRetDepositAccountApprChqCnt",
    "outRetDepositAccountApprChqEdate",
    "outRetDepositAccountApprChqNo",
    "outRetDepositAccountApprChqPerc",
    "outRetDepositAccountAtmCardFlag",
    "outRetDepositAccountAutomChequeOrder",
    "outRetDepositAccountAvailableBalance",
    "outRetDepositAccountBackValeurDt",
    "outRetDepositAccountBalanceInterFlag",
    "outRetDepositAccountBenefAddressSn",
    "outRetDepositAccountBlncBefOverdrn",
    "outRetDepositAccountBlockedBalance",
    "outRetDepositAccountBlockedStsExpiry",
    "outRetDepositAccountBoePercentance",
    "outRetDepositAccountBoeSpread",
    "outRetDepositAccountBondNumber",
    "outRetDepositAccountBookBalance",
    "outRetDepositAccountBookNo",
    "outRetDepositAccountCDigit",
    "outRetDepositAccountCapIncreaseAmn",
    "outRetDepositAccountChequeBookFlag",
    "outRetDepositAccountChequeBooksCount",
    "outRetDepositAccountChequeOrderedCnt",
    "outRetDepositAccountChequesBadCount",
    "outRetDepositAccountChequesBadTotal",
    "outRetDepositAccountChequesCancCount",
    "outRetDepositAccountChequesItemCount",
    "outRetDepositAccountChequesLostCount",
    "outRetDepositAccountChequesPaidCount",
    "outRetDepositAccountChequesStampCoun",
    "outRetDepositAccountChequesSteaCount",
    "outRetDepositAccountChequesStopCount",
    "outRetDepositAccountChequesUsedCount",
    "outRetDepositAccountClosingDate",
    "outRetDepositAccountClosingTotal",
    "outRetDepositAccountCobenefCount",
    "outRetDepositAccountCobenefCountIns",
    "outRetDepositAccountCobenefSnMail",
    "outRetDepositAccountColInsertionDt",
    "outRetDepositAccountCollateralFlg",
    "outRetDepositAccountCorrChqDetail1",
    "outRetDepositAccountCorrChqDetail2",
    "outRetDepositAccountCorrespAccInd",
    "outRetDepositAccountCrIntRtSprdInd",
    "outRetDepositAccountCrInterRateSpr",
    "outRetDepositAccountCustPerMFAllow",
    "outRetDepositAccountDateSinceOverdrn",
    "outRetDepositAccountDbIntRtSprdInd",
    "outRetDepositAccountDbInterAccNext",
    "outRetDepositAccountDbInterRateSpr",
    "outRetDepositAccountDbProgressInter",
    "outRetDepositAccountDbTransitIntTax",
    "outRetDepositAccountDbTransitionInte",
    "outRetDepositAccountDefiniteDelay",
    "outRetDepositAccountDepositType",
    "outRetDepositAccountDesignation",
    "outRetDepositAccountDrawDownWxpDate",
    "outRetDepositAccountDurationUnit",
    "outRetDepositAccountDurationValue",
    "outRetDepositAccountEncroachTolerance",
    "outRetDepositAccountEntryStatus",
    "outRetDepositAccountExpCrIntSprd",
    "outRetDepositAccountExpDbIntSprd",
    "outRetDepositAccountExpiryDate",
    "outRetDepositAccountExpiryDateTd",
    "outRetDepositAccountExternalAccFlag",
    "outRetDepositAccountExtraitPrintDay",
    "outRetDepositAccountExtraitTrxCount",
    "outRetDepositAccountFcInterLcPrim",
    "outRetDepositAccountFcInterestLcFlg",
    "outRetDepositAccountFcInterestLcNet",
    "outRetDepositAccountFinalWhldTaxFlg",
    "outRetDepositAccountFixedInterFlag",
    "outRetDepositAccountFixedInterRate",
    "outRetDepositAccountForecastBalance",
    "outRetDepositAccountGlAccount",
    "outRetDepositAccountGlAccountLevel",
    "outRetDepositAccountHomeBranch",
    "outRetDepositAccountIncomeAmnt",
    "outRetDepositAccountIncomeFrequency",
    "outRetDepositAccountInitCrBalance",
    "outRetDepositAccountInitDbBalance",
    "outRetDepositAccountInitValueBalance",
    "outRetDepositAccountInspectionDate",
    "outRetDepositAccountInterPayOptions",
    "outRetDepositAccountInterestPayInd",
    "outRetDepositAccountInterestToWithdr",
    "outRetDepositAccountInvestFlag",
    "outRetDepositAccountKadFlg",
    "outRetDepositAccountLastBadCheqDate",
    "outRetDepositAccountLastBatchDate",
    "outRetDepositAccountLastInactiveDate",
    "outRetDepositAccountLastIntAvgBalance",
    "outRetDepositAccountLastIntAvgCr",
    "outRetDepositAccountLastIntAvgDb",
    "outRetDepositAccountLastIntChangDat",
    "outRetDepositAccountLastMaxUpdateDate",
    "outRetDepositAccountLastModifyDate",
    "outRetDepositAccountLastPsbPrint",
    "outRetDepositAccountLastTdTrxId",
    "outRetDepositAccountLastTrxDate",
    "outRetDepositAccountLastTrxId",
    "outRetDepositAccountLstStatementNum",
    "outRetDepositAccountManualMigrateFlg",
    "outRetDepositAccountMaxLastDpPer",
    "outRetDepositAccountMaxLastUpdate",
    "outRetDepositAccountMinLastMFPer",
    "outRetDepositAccountMultiSalaryAmnt",
    "outRetDepositAccountNostroAccount",
    "outRetDepositAccountNotExpensesFlg",
    "outRetDepositAccountNotifSpreadDayB",
    "outRetDepositAccountNotifSpreadDays",
    "outRetDepositAccountOfficeAccFlag",
    "outRetDepositAccountOldAccNumber",
    "outRetDepositAccountOpeningBalance",
    "outRetDepositAccountOpeningDate",
    "outRetDepositAccountOverdraftComment",
    "outRetDepositAccountOverdraftRenewalFlg",
    "outRetDepositAccountOverdraftSpread",
    "outRetDepositAccountPassbookFlag",
    "outRetDepositAccountPendingExtrLines",
    "outRetDepositAccountPrevAccountLimit",
    "outRetDepositAccountPrevAvailableBal",
    "outRetDepositAccountPrevBlockedBalan",
    "outRetDepositAccountPrevBookBalance",
    "outRetDepositAccountPrevDateSinceOv",
    "outRetDepositAccountPrevForecastBala",
    "outRetDepositAccountPrevLastTrxId",
    "outRetDepositAccountPrevLstStatement",
    "outRetDepositAccountPrevPsbLineSn",
    "outRetDepositAccountPrevTempExcEnd",
    "outRetDepositAccountPrevTempExcStar",
    "outRetDepositAccountPrevTemporaryExc",
    "outRetDepositAccountPrevUnclearBala",
    "outRetDepositAccountPsbLastBalance",
    "outRetDepositAccountPsbLastPrintLn",
    "outRetDepositAccountPsbLineSn",
    "outRetDepositAccountPsbLostInd",
    "outRetDepositAccountPsbPendingLines",
    "outRetDepositAccountPsbSn",
    "outRetDepositAccountRenewalDate",
    "outRetDepositAccountRenewalFlag",
    "outRetDepositAccountRenewalNumber",
    "outRetDepositAccountRestrictAccFlag",
    "outRetDepositAccountRetainingDate",
    "outRetDepositAccountSecretAccFlag",
    "outRetDepositAccountServicePenalSpr",
    "outRetDepositAccountSpecAgrPenFlg",
    "outRetDepositAccountSpecAgrTrxFlg",
    "outRetDepositAccountSpecialAccFlg",
    "outRetDepositAccountStampAmountTotal",
    "outRetDepositAccountStartDateTd",
    "outRetDepositAccountStartWdrBalPrd",
    "outRetDepositAccountStatementIssFreq",
    "outRetDepositAccountSystemUsageCnt",
    "outRetDepositAccountTargetFlg",
    "outRetDepositAccountTaxExcempFlg",
    "outRetDepositAccountTdBatchExtrtFlg",
    "outRetDepositAccountTdInterPercentChg",
    "outRetDepositAccountTdInterSprdChg",
    "outRetDepositAccountTelebankingFlag",
    "outRetDepositAccountTempExcEndDt",
    "outRetDepositAccountTempExcStartDt",
    "outRetDepositAccountTemporaryExcess",
    "outRetDepositAccountThirdpartyInd",
    "outRetDepositAccountTimestmp",
    "outRetDepositAccountTotalPartPenalty",
    "outRetDepositAccountTransitionIntTax",
    "outRetDepositAccountTransitionInter",
    "outRetDepositAccountUnclearBalance",
    "outRetDepositAccountUnclearWithdrFlg",
    "outRetDepositAccountUnutilLimitPenD",
    "outRetDepositAccountValidChqDuration",
    "outRetDepositAccountWebFlg",
    "outRetDepositAccountWebModDate",
    "outRetDepositAccountWithdrawAmnt",
    "outRetDepositAccountWithdrawBalance",
    "outRetDepositAccountWthdrawSpread",
    "outRetOverdraftCurrencyDisplayedDecimalPlaces",
    "outRetOverdraftCurrencyIdCurrency",
    "outRetOverdraftCurrencyNationalFlag",
    "outRetProductDescription",
    "outRetProductIdProduct",
    "outRetProductInterBearing",
    "outRetrAddExcesLnsInterestDescription",
    "outRetrAddExcesLnsInterestIdInterest",
    "outRetrAgrUnitCode",
    "outRetrAgreementAgrMembershipSn",
    "outRetrAgreementAgrSn",
    "outRetrAgreementAgrYear",
    "outRetrCcodeGenericDetailDescription",
    "outRetrCcodeGenericDetailSerialNum",
    "outRetrCredGradGenericDetailDescription",
    "outRetrCredGradGenericDetailSerialNum",
    "outRetrLnsCommissionDescription",
    "outRetrLnsCommissionIdCommission",
    "outRetrLpurpGenericDetailDescription",
    "outRetrLpurpGenericDetailSerialNum",
    "outRetrPrftTransactionDescription",
    "outRetrPrftTransactionIdTransact",
    "outSalePersonGenericDetailShortDescription",
    "outSaleUnitGenericDetailDescription",
    "outSaleUnitGenericDetailSerialNum",
    "outSecondCredLnsInterestDescription",
    "outSecondCredLnsInterestIdInterest",
    "outSecretConfirmDepositAccountSecretAccFlag",
    "outSecretConfirmProfitsAccountAccountNumber",
    "outServiceRetDepositAccountAccountNumber",
    "outServiceRetDepositAccountCDigit",
    "outServicesProfitsAccountAccountNumber",
    "outSpecificBeneficiaryLnsSuppliedAfmNo",
    "outSpecificBeneficiaryLnsSuppliedCustId",
    "outSpecificBeneficiaryLnsSuppliedIdNo",
    "outSpecificBeneficiaryLnsSuppliedName",
    "outSpecificBeneficiaryLnsSuppliedReturnedCheckDigit",
    "outTaxCountryGenericDetailDescription",
    "outTaxCountryGenericDetailShortDescription",
    "outTimeDeposRenewalCrInterTaxPcg",
    "outTimeDeposRenewalDaysDuration",
    "outTimeDeposRenewalDurationUnit",
    "outTimeDeposRenewalDurationValue",
    "outTimeDeposRenewalExpiryDate",
    "outTimeDeposRenewalRenewalDate",
    "outTimeDeposRenewalStartDate",
    "outTotAccrDbInterestIefSuppliedNumber152",
    "outTotDepAccountTotalTotalCredit01",
    "outTotDepAccountTotalTotalDebit01",
    "outUpdDepMntRecordingTrxUsrSn",
    "outUpdateDepositAccountEntryStatus",
    "outUpdateDepositAccountLastModifyDate",
    "outUpdateDepositAccountOpeningDate",
    "outUpdateDepositAccountPassbookFlag",
    "outUpdateDepositAccountRestrictAccFlag",
    "outUpdateUserLnsSuppliedName",
    "outUpdateUsrCode",
    "outUsedInputCharSuppliedChar37",
    "outWithdrawDayFromIefSuppliedDays",
    "outWithdrawDayFromIefSuppliedMonth",
    "outWithdrawDayToIefSuppliedDays",
    "outWithdrawDayToIefSuppliedMonth",
    "outRetDepositAccountMailStatment",
    "outRefereeAccNoIefSuppliedChar100",
    "outRefereeNameIefSuppliedChar100",
    "outDepositAccountFreeText3IefSuppliedChar100",
    "outDepositAccountFreeText4IefSuppliedChar100",
    "outDepositAccountFreeText5IefSuppliedChar100",
    "outCrmCodeGenericDetailSerialNum",
    "outCrmCodeGenericDetailDescription",
    "outRetDepositAccountLastDormantDate",
    "outDaysInDormantStatusIefSuppliedNum5",
    "outDaysSinceLastTrxDateIefSuppliedNum5",
    "outRetDepositAccountSwiftMt942",
    "outRetDepositAccountSwiftMt940"
})
public class D0303VDepositAccountUpdateExport
    extends BaseExport
{

    @XmlElement(name = "OutAccRetUnitCode")
    protected int outAccRetUnitCode;
    @XmlElement(name = "OutAccRetUnitUnitName")
    protected String outAccRetUnitUnitName;
    @XmlElement(name = "OutAccWithdrProfitsAccountAccountNumber")
    protected String outAccWithdrProfitsAccountAccountNumber;
    @XmlElement(name = "OutAchBnkCollaborationBanksAchBankCode")
    protected String outAchBnkCollaborationBanksAchBankCode;
    @XmlElement(name = "OutAchBnkCollaborationBanksBankId")
    protected int outAchBnkCollaborationBanksBankId;
    @XmlElement(name = "OutAchBnkCollaborationBanksBankName")
    protected String outAchBnkCollaborationBanksBankName;
    @XmlElement(name = "OutAgrProfitsAccountAccountNumber")
    protected String outAgrProfitsAccountAccountNumber;
    @XmlElement(name = "OutAuthJustificDescription")
    protected String outAuthJustificDescription;
    @XmlElement(name = "OutAuthJustificIdJustific")
    protected int outAuthJustificIdJustific;
    @XmlElement(name = "OutAuthPrftTransactionDescription")
    protected String outAuthPrftTransactionDescription;
    @XmlElement(name = "OutAuthPrftTransactionIdTransact")
    protected int outAuthPrftTransactionIdTransact;
    @XmlElement(name = "OutAvgBaDepAccountTotalTotalProducts01", required = true)
    protected BigDecimal outAvgBaDepAccountTotalTotalProducts01;
    @XmlElement(name = "OutAvgBalCurrYearDepAccountTotalTotalProducts01", required = true)
    protected BigDecimal outAvgBalCurrYearDepAccountTotalTotalProducts01;
    @XmlElement(name = "OutAvgBalPrevYearDepAccountTotalTotalProducts01", required = true)
    protected BigDecimal outAvgBalPrevYearDepAccountTotalTotalProducts01;
    @XmlElement(name = "OutBenefCustomerExpireDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBenefCustomerExpireDate;
    @XmlElement(name = "OutBenefCustomerFatherName")
    protected String outBenefCustomerFatherName;
    @XmlElement(name = "OutBenefCustomerFirstName")
    protected String outBenefCustomerFirstName;
    @XmlElement(name = "OutBenefCustomerSurname")
    protected String outBenefCustomerSurname;
    @XmlElement(name = "OutBlockIefSuppliedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBlockIefSuppliedDate;
    @XmlElement(name = "OutBlockIefSuppliedText40")
    protected String outBlockIefSuppliedText40;
    @XmlElement(name = "OutBlockUsrCode")
    protected String outBlockUsrCode;
    @XmlElement(name = "OutCapitalDisposalDepositAccountAccountNumber")
    protected double outCapitalDisposalDepositAccountAccountNumber;
    @XmlElement(name = "OutCapitalDisposalDepositAccountCDigit")
    protected short outCapitalDisposalDepositAccountCDigit;
    @XmlElement(name = "OutCapitalDisposalProfitsAccountAccountNumber")
    protected String outCapitalDisposalProfitsAccountAccountNumber;
    @XmlElement(name = "OutCoben2RetCustomerCDigit")
    protected short outCoben2RetCustomerCDigit;
    @XmlElement(name = "OutCoben2RetCustomerCustId")
    protected int outCoben2RetCustomerCustId;
    @XmlElement(name = "OutCoben2RetLnsSuppliedName")
    protected String outCoben2RetLnsSuppliedName;
    @XmlElement(name = "OutCoben3RetCustomerCDigit")
    protected short outCoben3RetCustomerCDigit;
    @XmlElement(name = "OutCoben3RetCustomerCustId")
    protected int outCoben3RetCustomerCustId;
    @XmlElement(name = "OutCoben3RetLnsSuppliedName")
    protected String outCoben3RetLnsSuppliedName;
    @XmlElement(name = "OutCoben4RetCustomerCDigit")
    protected short outCoben4RetCustomerCDigit;
    @XmlElement(name = "OutCoben4RetCustomerCustId")
    protected int outCoben4RetCustomerCustId;
    @XmlElement(name = "OutCoben4RetLnsSuppliedName")
    protected String outCoben4RetLnsSuppliedName;
    @XmlElement(name = "OutCoben5RetCustomerCDigit")
    protected short outCoben5RetCustomerCDigit;
    @XmlElement(name = "OutCoben5RetCustomerCustId")
    protected int outCoben5RetCustomerCustId;
    @XmlElement(name = "OutCoben5RetLnsSuppliedName")
    protected String outCoben5RetLnsSuppliedName;
    @XmlElement(name = "OutCompany1stcustomerIefSuppliedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCompany1StcustomerIefSuppliedDate;
    @XmlElement(name = "OutCompany1stcustomerIefSuppliedDateFormat")
    protected String outCompany1StcustomerIefSuppliedDateFormat;
    @XmlElement(name = "OutCountryGenericDetailDescription")
    protected String outCountryGenericDetailDescription;
    @XmlElement(name = "OutCrDbInterestRetDepositAccountAccountNumber")
    protected double outCrDbInterestRetDepositAccountAccountNumber;
    @XmlElement(name = "OutCrDbInterestRetDepositAccountCDigit")
    protected short outCrDbInterestRetDepositAccountCDigit;
    @XmlElement(name = "OutCrHintScalePercentage00", required = true)
    protected BigDecimal outCrHintScalePercentage00;
    @XmlElement(name = "OutCrRetLnsInterestDescription")
    protected String outCrRetLnsInterestDescription;
    @XmlElement(name = "OutCrRetLnsInterestForDebit")
    protected String outCrRetLnsInterestForDebit;
    @XmlElement(name = "OutCrRetLnsInterestIdInterest")
    protected int outCrRetLnsInterestIdInterest;
    @XmlElement(name = "OutCurrTimePrintLineDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCurrTimePrintLineDate;
    @XmlElement(name = "OutCurrTimePrintLineTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCurrTimePrintLineTime;
    @XmlElement(name = "OutCustAddressAddress1")
    protected String outCustAddressAddress1;
    @XmlElement(name = "OutCustAddressAddress2")
    protected String outCustAddressAddress2;
    @XmlElement(name = "OutCustAddressCity")
    protected String outCustAddressCity;
    @XmlElement(name = "OutCustAddressSerialNum")
    protected short outCustAddressSerialNum;
    @XmlElement(name = "OutCustAddressTelephone")
    protected String outCustAddressTelephone;
    @XmlElement(name = "OutCustAddressZipCode")
    protected String outCustAddressZipCode;
    @XmlElement(name = "OutCustCategGenericDetailDescription")
    protected String outCustCategGenericDetailDescription;
    @XmlElement(name = "OutCustCategGenericDetailParameterType")
    protected String outCustCategGenericDetailParameterType;
    @XmlElement(name = "OutCustCategGenericDetailSerialNum")
    protected int outCustCategGenericDetailSerialNum;
    @XmlElement(name = "OutCustomerRetLnsSuppliedName")
    protected String outCustomerRetLnsSuppliedName;
    @XmlElement(name = "OutDbCrInterProfitsAccountAccountNumber")
    protected String outDbCrInterProfitsAccountAccountNumber;
    @XmlElement(name = "OutDbHintScalePercentage00", required = true)
    protected BigDecimal outDbHintScalePercentage00;
    @XmlElement(name = "OutDbRetLnsInterestDescription")
    protected String outDbRetLnsInterestDescription;
    @XmlElement(name = "OutDbRetLnsInterestForDebit")
    protected String outDbRetLnsInterestForDebit;
    @XmlElement(name = "OutDbRetLnsInterestIdInterest")
    protected int outDbRetLnsInterestIdInterest;
    @XmlElement(name = "OutDepAccTrAccTrAccCd")
    protected short outDepAccTrAccTrAccCd;
    @XmlElement(name = "OutDepAccTrAccTrAccSn")
    protected int outDepAccTrAccTrAccSn;
    @XmlElement(name = "OutDepAccTrAccTrAccType")
    protected short outDepAccTrAccTrAccType;
    @XmlElement(name = "OutDepAccTrAccTrAccUnit")
    protected int outDepAccTrAccTrAccUnit;
    @XmlElement(name = "OutDepPendingTrxTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDepPendingTrxTrxDate;
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
    @XmlElement(name = "OutDepositAccountMaxBenef")
    protected short outDepositAccountMaxBenef;
    @XmlElement(name = "OutDepositAtmCardFlag")
    protected String outDepositAtmCardFlag;
    @XmlElement(name = "OutDepositChangeSpreadFlg")
    protected String outDepositChangeSpreadFlg;
    @XmlElement(name = "OutDepositChequeBookFlag")
    protected String outDepositChequeBookFlag;
    @XmlElement(name = "OutDepositCrInterAccLast", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDepositCrInterAccLast;
    @XmlElement(name = "OutDepositCustomerMaxAcc")
    protected int outDepositCustomerMaxAcc;
    @XmlElement(name = "OutDepositDepIntMech")
    protected String outDepositDepIntMech;
    @XmlElement(name = "OutDepositDepositType")
    protected String outDepositDepositType;
    @XmlElement(name = "OutDepositEncroachTolerance", required = true)
    protected BigDecimal outDepositEncroachTolerance;
    @XmlElement(name = "OutDepositForeignCurrency")
    protected String outDepositForeignCurrency;
    @XmlElement(name = "OutDepositMFCode")
    protected String outDepositMFCode;
    @XmlElement(name = "OutDepositMaxCustDpPer", required = true)
    protected BigDecimal outDepositMaxCustDpPer;
    @XmlElement(name = "OutDepositMaxPrmWithdDays")
    protected short outDepositMaxPrmWithdDays;
    @XmlElement(name = "OutDepositMaxUpdate")
    protected short outDepositMaxUpdate;
    @XmlElement(name = "OutDepositMinCustMFPer", required = true)
    protected BigDecimal outDepositMinCustMFPer;
    @XmlElement(name = "OutDepositMinDayAvailBalance", required = true)
    protected BigDecimal outDepositMinDayAvailBalance;
    @XmlElement(name = "OutDepositMinDayDistrAmnt", required = true)
    protected BigDecimal outDepositMinDayDistrAmnt;
    @XmlElement(name = "OutDepositMinTrxAmount", required = true)
    protected BigDecimal outDepositMinTrxAmount;
    @XmlElement(name = "OutDepositOverdraftFlg")
    protected String outDepositOverdraftFlg;
    @XmlElement(name = "OutDepositOverdraftLimit", required = true)
    protected BigDecimal outDepositOverdraftLimit;
    @XmlElement(name = "OutDepositOverdraftMaxsprd", required = true)
    protected BigDecimal outDepositOverdraftMaxsprd;
    @XmlElement(name = "OutDepositPassbookFlag")
    protected String outDepositPassbookFlag;
    @XmlElement(name = "OutDepositPenaltyMaxSpread", required = true)
    protected BigDecimal outDepositPenaltyMaxSpread;
    @XmlElement(name = "OutDepositPenaltyMinSpread", required = true)
    protected BigDecimal outDepositPenaltyMinSpread;
    @XmlElement(name = "OutDepositStatementIssFreq")
    protected String outDepositStatementIssFreq;
    @XmlElement(name = "OutDepositTelebankingFlag")
    protected String outDepositTelebankingFlag;
    @XmlElement(name = "OutDpHistInterRateEffectiveDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDpHistInterRateEffectiveDate;
    @XmlElement(name = "OutEconomyGenericDetailDescription")
    protected String outEconomyGenericDetailDescription;
    @XmlElement(name = "OutEconomyGenericDetailSerialNum")
    protected int outEconomyGenericDetailSerialNum;
    @XmlElement(name = "OutEvaluationTeamInformationAuthorizationType")
    protected String outEvaluationTeamInformationAuthorizationType;
    @XmlElement(name = "OutEvaluationTeamInformationRequiredProfile1")
    protected String outEvaluationTeamInformationRequiredProfile1;
    @XmlElement(name = "OutEvaluationTeamInformationRequiredProfile2")
    protected String outEvaluationTeamInformationRequiredProfile2;
    @XmlElement(name = "OutFinalCrHintScalePercentage00", required = true)
    protected BigDecimal outFinalCrHintScalePercentage00;
    @XmlElement(name = "OutFinalDbHintScalePercentage00", required = true)
    protected BigDecimal outFinalDbHintScalePercentage00;
    @XmlElement(name = "OutFinalExcIntHintScalePercentage00", required = true)
    protected BigDecimal outFinalExcIntHintScalePercentage00;
    @XmlElement(name = "OutFinalN128HintScalePercentage00", required = true)
    protected BigDecimal outFinalN128HintScalePercentage00;
    @XmlElement(name = "OutFixedLnsInterestDescription")
    protected String outFixedLnsInterestDescription;
    @XmlElement(name = "OutFixedLnsInterestDurationUnit")
    protected String outFixedLnsInterestDurationUnit;
    @XmlElement(name = "OutFixedLnsInterestIdInterest")
    protected int outFixedLnsInterestIdInterest;
    @XmlElement(name = "OutFixedLnsInterestIntDuration")
    protected short outFixedLnsInterestIntDuration;
    @XmlElement(name = "OutGrpBalances")
    protected ArrayOfD0303VOutGrpBalancesItem outGrpBalances;
    @XmlElement(name = "OutInvestDepositAccountCustPerMFAllow")
    protected String outInvestDepositAccountCustPerMFAllow;
    @XmlElement(name = "OutInvestDepositAccountMaxLastDpPer", required = true)
    protected BigDecimal outInvestDepositAccountMaxLastDpPer;
    @XmlElement(name = "OutInvestDepositAccountMinLastMFPer", required = true)
    protected BigDecimal outInvestDepositAccountMinLastMFPer;
    @XmlElement(name = "OutInvestProfitsAccountAccountNumber")
    protected String outInvestProfitsAccountAccountNumber;
    @XmlElement(name = "OutIssueOfficeUnitCode")
    protected int outIssueOfficeUnitCode;
    @XmlElement(name = "OutIssueOfficeUnitUnitName")
    protected String outIssueOfficeUnitUnitName;
    @XmlElement(name = "OutKekRetGenericDetailDescription")
    protected String outKekRetGenericDetailDescription;
    @XmlElement(name = "OutKekRetGenericDetailSerialNum")
    protected int outKekRetGenericDetailSerialNum;
    @XmlElement(name = "OutLoanAccountAccMechanism")
    protected String outLoanAccountAccMechanism;
    @XmlElement(name = "OutLoanAccountRecyclingFrequency")
    protected short outLoanAccountRecyclingFrequency;
    @XmlElement(name = "OutLongErrorMessageIefSuppliedActionEntryMsg")
    protected String outLongErrorMessageIefSuppliedActionEntryMsg;
    @XmlElement(name = "OutMaxBalOdMinMaxBalMaxBalDate01", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outMaxBalOdMinMaxBalMaxBalDate01;
    @XmlElement(name = "OutMaxBalOdMinMaxBalMaxBalance01", required = true)
    protected BigDecimal outMaxBalOdMinMaxBalMaxBalance01;
    @XmlElement(name = "OutMinBalOdMinMaxBalMinBalDate01", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outMinBalOdMinMaxBalMinBalDate01;
    @XmlElement(name = "OutMinBalOdMinMaxBalMinBalance01", required = true)
    protected BigDecimal outMinBalOdMinMaxBalMinBalance01;
    @XmlElement(name = "OutMonitorEmployeeRetLnsSuppliedName")
    protected String outMonitorEmployeeRetLnsSuppliedName;
    @XmlElement(name = "OutMonitorRetBankemployeeId")
    protected String outMonitorRetBankemployeeId;
    @XmlElement(name = "OutN128HintScalePercentage00", required = true)
    protected BigDecimal outN128HintScalePercentage00;
    @XmlElement(name = "OutN128LnsInterestDescription")
    protected String outN128LnsInterestDescription;
    @XmlElement(name = "OutN128LnsInterestForDebit")
    protected String outN128LnsInterestForDebit;
    @XmlElement(name = "OutN128LnsInterestIdInterest")
    protected int outN128LnsInterestIdInterest;
    @XmlElement(name = "OutNumberOtherIdIdNo")
    protected String outNumberOtherIdIdNo;
    @XmlElement(name = "OutOdDbIntHintScalePercentage00", required = true)
    protected BigDecimal outOdDbIntHintScalePercentage00;
    @XmlElement(name = "OutOpenRetUsrCode")
    protected String outOpenRetUsrCode;
    @XmlElement(name = "OutOpenUnitCode")
    protected int outOpenUnitCode;
    @XmlElement(name = "OutOpenUnitUnitName")
    protected String outOpenUnitUnitName;
    @XmlElement(name = "OutOpenUnitCommentsIefSuppliedText40")
    protected String outOpenUnitCommentsIefSuppliedText40;
    @XmlElement(name = "OutOpenedUserLnsSuppliedName")
    protected String outOpenedUserLnsSuppliedName;
    @XmlElement(name = "OutPackageIdPackage")
    protected int outPackageIdPackage;
    @XmlElement(name = "OutPackagePackageDescr")
    protected String outPackagePackageDescr;
    @XmlElement(name = "OutProfGenericDetailDescription")
    protected String outProfGenericDetailDescription;
    @XmlElement(name = "OutProfGenericDetailSerialNum")
    protected int outProfGenericDetailSerialNum;
    @XmlElement(name = "OutRetCurrencyIdCurrency")
    protected int outRetCurrencyIdCurrency;
    @XmlElement(name = "OutRetCurrencyShortDescr")
    protected String outRetCurrencyShortDescr;
    @XmlElement(name = "OutRetCustomerCDigit")
    protected short outRetCustomerCDigit;
    @XmlElement(name = "OutRetCustomerCustId")
    protected int outRetCustomerCustId;
    @XmlElement(name = "OutRetDepAccountInfoCurFxIntExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepAccountInfoCurFxIntExpDt;
    @XmlElement(name = "OutRetDepAccountInfoCurFxIntStDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepAccountInfoCurFxIntStDt;
    @XmlElement(name = "OutRetDepAccountInfoOaCollFreqUnit")
    protected String outRetDepAccountInfoOaCollFreqUnit;
    @XmlElement(name = "OutRetDepAccountInfoOaCollectFreq")
    protected short outRetDepAccountInfoOaCollectFreq;
    @XmlElement(name = "OutRetDepAccountInfoOaDuration")
    protected short outRetDepAccountInfoOaDuration;
    @XmlElement(name = "OutRetDepAccountInfoOaDurationUnit")
    protected String outRetDepAccountInfoOaDurationUnit;
    @XmlElement(name = "OutRetDepFixingRateRate", required = true)
    protected BigDecimal outRetDepFixingRateRate;
    @XmlElement(name = "OutRetDepositAccountAccGroup")
    protected int outRetDepositAccountAccGroup;
    @XmlElement(name = "OutRetDepositAccountAccountLimit", required = true)
    protected BigDecimal outRetDepositAccountAccountLimit;
    @XmlElement(name = "OutRetDepositAccountAccountNumber")
    protected double outRetDepositAccountAccountNumber;
    @XmlElement(name = "OutRetDepositAccountAccountType")
    protected String outRetDepositAccountAccountType;
    @XmlElement(name = "OutRetDepositAccountAccrCrExpInt", required = true)
    protected BigDecimal outRetDepositAccountAccrCrExpInt;
    @XmlElement(name = "OutRetDepositAccountAccrCrInterest", required = true)
    protected BigDecimal outRetDepositAccountAccrCrInterest;
    @XmlElement(name = "OutRetDepositAccountAccrDbInterest", required = true)
    protected BigDecimal outRetDepositAccountAccrDbInterest;
    @XmlElement(name = "OutRetDepositAccountAccrExcessInter", required = true)
    protected BigDecimal outRetDepositAccountAccrExcessInter;
    @XmlElement(name = "OutRetDepositAccountAccrN128Inter", required = true)
    protected BigDecimal outRetDepositAccountAccrN128Inter;
    @XmlElement(name = "OutRetDepositAccountAdditionalInfoFlag")
    protected String outRetDepositAccountAdditionalInfoFlag;
    @XmlElement(name = "OutRetDepositAccountAkflag")
    protected String outRetDepositAccountAkflag;
    @XmlElement(name = "OutRetDepositAccountAnnounceTolDays")
    protected short outRetDepositAccountAnnounceTolDays;
    @XmlElement(name = "OutRetDepositAccountApprChqAdate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountApprChqAdate;
    @XmlElement(name = "OutRetDepositAccountApprChqCnt")
    protected int outRetDepositAccountApprChqCnt;
    @XmlElement(name = "OutRetDepositAccountApprChqEdate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountApprChqEdate;
    @XmlElement(name = "OutRetDepositAccountApprChqNo")
    protected String outRetDepositAccountApprChqNo;
    @XmlElement(name = "OutRetDepositAccountApprChqPerc", required = true)
    protected BigDecimal outRetDepositAccountApprChqPerc;
    @XmlElement(name = "OutRetDepositAccountAtmCardFlag")
    protected String outRetDepositAccountAtmCardFlag;
    @XmlElement(name = "OutRetDepositAccountAutomChequeOrder")
    protected String outRetDepositAccountAutomChequeOrder;
    @XmlElement(name = "OutRetDepositAccountAvailableBalance", required = true)
    protected BigDecimal outRetDepositAccountAvailableBalance;
    @XmlElement(name = "OutRetDepositAccountBackValeurDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountBackValeurDt;
    @XmlElement(name = "OutRetDepositAccountBalanceInterFlag")
    protected String outRetDepositAccountBalanceInterFlag;
    @XmlElement(name = "OutRetDepositAccountBenefAddressSn")
    protected short outRetDepositAccountBenefAddressSn;
    @XmlElement(name = "OutRetDepositAccountBlncBefOverdrn", required = true)
    protected BigDecimal outRetDepositAccountBlncBefOverdrn;
    @XmlElement(name = "OutRetDepositAccountBlockedBalance", required = true)
    protected BigDecimal outRetDepositAccountBlockedBalance;
    @XmlElement(name = "OutRetDepositAccountBlockedStsExpiry", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountBlockedStsExpiry;
    @XmlElement(name = "OutRetDepositAccountBoePercentance", required = true)
    protected BigDecimal outRetDepositAccountBoePercentance;
    @XmlElement(name = "OutRetDepositAccountBoeSpread", required = true)
    protected BigDecimal outRetDepositAccountBoeSpread;
    @XmlElement(name = "OutRetDepositAccountBondNumber")
    protected double outRetDepositAccountBondNumber;
    @XmlElement(name = "OutRetDepositAccountBookBalance", required = true)
    protected BigDecimal outRetDepositAccountBookBalance;
    @XmlElement(name = "OutRetDepositAccountBookNo")
    protected int outRetDepositAccountBookNo;
    @XmlElement(name = "OutRetDepositAccountCDigit")
    protected short outRetDepositAccountCDigit;
    @XmlElement(name = "OutRetDepositAccountCapIncreaseAmn", required = true)
    protected BigDecimal outRetDepositAccountCapIncreaseAmn;
    @XmlElement(name = "OutRetDepositAccountChequeBookFlag")
    protected String outRetDepositAccountChequeBookFlag;
    @XmlElement(name = "OutRetDepositAccountChequeBooksCount")
    protected int outRetDepositAccountChequeBooksCount;
    @XmlElement(name = "OutRetDepositAccountChequeOrderedCnt")
    protected double outRetDepositAccountChequeOrderedCnt;
    @XmlElement(name = "OutRetDepositAccountChequesBadCount")
    protected int outRetDepositAccountChequesBadCount;
    @XmlElement(name = "OutRetDepositAccountChequesBadTotal", required = true)
    protected BigDecimal outRetDepositAccountChequesBadTotal;
    @XmlElement(name = "OutRetDepositAccountChequesCancCount")
    protected int outRetDepositAccountChequesCancCount;
    @XmlElement(name = "OutRetDepositAccountChequesItemCount")
    protected int outRetDepositAccountChequesItemCount;
    @XmlElement(name = "OutRetDepositAccountChequesLostCount")
    protected int outRetDepositAccountChequesLostCount;
    @XmlElement(name = "OutRetDepositAccountChequesPaidCount")
    protected int outRetDepositAccountChequesPaidCount;
    @XmlElement(name = "OutRetDepositAccountChequesStampCoun")
    protected int outRetDepositAccountChequesStampCoun;
    @XmlElement(name = "OutRetDepositAccountChequesSteaCount")
    protected int outRetDepositAccountChequesSteaCount;
    @XmlElement(name = "OutRetDepositAccountChequesStopCount")
    protected int outRetDepositAccountChequesStopCount;
    @XmlElement(name = "OutRetDepositAccountChequesUsedCount")
    protected int outRetDepositAccountChequesUsedCount;
    @XmlElement(name = "OutRetDepositAccountClosingDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountClosingDate;
    @XmlElement(name = "OutRetDepositAccountClosingTotal", required = true)
    protected BigDecimal outRetDepositAccountClosingTotal;
    @XmlElement(name = "OutRetDepositAccountCobenefCount")
    protected short outRetDepositAccountCobenefCount;
    @XmlElement(name = "OutRetDepositAccountCobenefCountIns")
    protected short outRetDepositAccountCobenefCountIns;
    @XmlElement(name = "OutRetDepositAccountCobenefSnMail")
    protected short outRetDepositAccountCobenefSnMail;
    @XmlElement(name = "OutRetDepositAccountColInsertionDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountColInsertionDt;
    @XmlElement(name = "OutRetDepositAccountCollateralFlg")
    protected String outRetDepositAccountCollateralFlg;
    @XmlElement(name = "OutRetDepositAccountCorrChqDetail1")
    protected String outRetDepositAccountCorrChqDetail1;
    @XmlElement(name = "OutRetDepositAccountCorrChqDetail2")
    protected String outRetDepositAccountCorrChqDetail2;
    @XmlElement(name = "OutRetDepositAccountCorrespAccInd")
    protected String outRetDepositAccountCorrespAccInd;
    @XmlElement(name = "OutRetDepositAccountCrIntRtSprdInd")
    protected String outRetDepositAccountCrIntRtSprdInd;
    @XmlElement(name = "OutRetDepositAccountCrInterRateSpr", required = true)
    protected BigDecimal outRetDepositAccountCrInterRateSpr;
    @XmlElement(name = "OutRetDepositAccountCustPerMFAllow")
    protected String outRetDepositAccountCustPerMFAllow;
    @XmlElement(name = "OutRetDepositAccountDateSinceOverdrn", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountDateSinceOverdrn;
    @XmlElement(name = "OutRetDepositAccountDbIntRtSprdInd")
    protected String outRetDepositAccountDbIntRtSprdInd;
    @XmlElement(name = "OutRetDepositAccountDbInterAccNext", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountDbInterAccNext;
    @XmlElement(name = "OutRetDepositAccountDbInterRateSpr", required = true)
    protected BigDecimal outRetDepositAccountDbInterRateSpr;
    @XmlElement(name = "OutRetDepositAccountDbProgressInter", required = true)
    protected BigDecimal outRetDepositAccountDbProgressInter;
    @XmlElement(name = "OutRetDepositAccountDbTransitIntTax", required = true)
    protected BigDecimal outRetDepositAccountDbTransitIntTax;
    @XmlElement(name = "OutRetDepositAccountDbTransitionInte", required = true)
    protected BigDecimal outRetDepositAccountDbTransitionInte;
    @XmlElement(name = "OutRetDepositAccountDefiniteDelay")
    protected String outRetDepositAccountDefiniteDelay;
    @XmlElement(name = "OutRetDepositAccountDepositType")
    protected String outRetDepositAccountDepositType;
    @XmlElement(name = "OutRetDepositAccountDesignation")
    protected String outRetDepositAccountDesignation;
    @XmlElement(name = "OutRetDepositAccountDrawDownWxpDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountDrawDownWxpDate;
    @XmlElement(name = "OutRetDepositAccountDurationUnit")
    protected String outRetDepositAccountDurationUnit;
    @XmlElement(name = "OutRetDepositAccountDurationValue")
    protected short outRetDepositAccountDurationValue;
    @XmlElement(name = "OutRetDepositAccountEncroachTolerance", required = true)
    protected BigDecimal outRetDepositAccountEncroachTolerance;
    @XmlElement(name = "OutRetDepositAccountEntryStatus")
    protected String outRetDepositAccountEntryStatus;
    @XmlElement(name = "OutRetDepositAccountExpCrIntSprd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountExpCrIntSprd;
    @XmlElement(name = "OutRetDepositAccountExpDbIntSprd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountExpDbIntSprd;
    @XmlElement(name = "OutRetDepositAccountExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountExpiryDate;
    @XmlElement(name = "OutRetDepositAccountExpiryDateTd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountExpiryDateTd;
    @XmlElement(name = "OutRetDepositAccountExternalAccFlag")
    protected String outRetDepositAccountExternalAccFlag;
    @XmlElement(name = "OutRetDepositAccountExtraitPrintDay")
    protected short outRetDepositAccountExtraitPrintDay;
    @XmlElement(name = "OutRetDepositAccountExtraitTrxCount")
    protected int outRetDepositAccountExtraitTrxCount;
    @XmlElement(name = "OutRetDepositAccountFcInterLcPrim", required = true)
    protected BigDecimal outRetDepositAccountFcInterLcPrim;
    @XmlElement(name = "OutRetDepositAccountFcInterestLcFlg")
    protected String outRetDepositAccountFcInterestLcFlg;
    @XmlElement(name = "OutRetDepositAccountFcInterestLcNet", required = true)
    protected BigDecimal outRetDepositAccountFcInterestLcNet;
    @XmlElement(name = "OutRetDepositAccountFinalWhldTaxFlg")
    protected String outRetDepositAccountFinalWhldTaxFlg;
    @XmlElement(name = "OutRetDepositAccountFixedInterFlag")
    protected String outRetDepositAccountFixedInterFlag;
    @XmlElement(name = "OutRetDepositAccountFixedInterRate", required = true)
    protected BigDecimal outRetDepositAccountFixedInterRate;
    @XmlElement(name = "OutRetDepositAccountForecastBalance", required = true)
    protected BigDecimal outRetDepositAccountForecastBalance;
    @XmlElement(name = "OutRetDepositAccountGlAccount")
    protected String outRetDepositAccountGlAccount;
    @XmlElement(name = "OutRetDepositAccountGlAccountLevel")
    protected String outRetDepositAccountGlAccountLevel;
    @XmlElement(name = "OutRetDepositAccountHomeBranch")
    protected String outRetDepositAccountHomeBranch;
    @XmlElement(name = "OutRetDepositAccountIncomeAmnt", required = true)
    protected BigDecimal outRetDepositAccountIncomeAmnt;
    @XmlElement(name = "OutRetDepositAccountIncomeFrequency")
    protected int outRetDepositAccountIncomeFrequency;
    @XmlElement(name = "OutRetDepositAccountInitCrBalance", required = true)
    protected BigDecimal outRetDepositAccountInitCrBalance;
    @XmlElement(name = "OutRetDepositAccountInitDbBalance", required = true)
    protected BigDecimal outRetDepositAccountInitDbBalance;
    @XmlElement(name = "OutRetDepositAccountInitValueBalance", required = true)
    protected BigDecimal outRetDepositAccountInitValueBalance;
    @XmlElement(name = "OutRetDepositAccountInspectionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountInspectionDate;
    @XmlElement(name = "OutRetDepositAccountInterPayOptions")
    protected String outRetDepositAccountInterPayOptions;
    @XmlElement(name = "OutRetDepositAccountInterestPayInd")
    protected String outRetDepositAccountInterestPayInd;
    @XmlElement(name = "OutRetDepositAccountInterestToWithdr", required = true)
    protected BigDecimal outRetDepositAccountInterestToWithdr;
    @XmlElement(name = "OutRetDepositAccountInvestFlag")
    protected String outRetDepositAccountInvestFlag;
    @XmlElement(name = "OutRetDepositAccountKadFlg")
    protected String outRetDepositAccountKadFlg;
    @XmlElement(name = "OutRetDepositAccountLastBadCheqDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountLastBadCheqDate;
    @XmlElement(name = "OutRetDepositAccountLastBatchDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountLastBatchDate;
    @XmlElement(name = "OutRetDepositAccountLastInactiveDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountLastInactiveDate;
    @XmlElement(name = "OutRetDepositAccountLastIntAvgBalance", required = true)
    protected BigDecimal outRetDepositAccountLastIntAvgBalance;
    @XmlElement(name = "OutRetDepositAccountLastIntAvgCr", required = true)
    protected BigDecimal outRetDepositAccountLastIntAvgCr;
    @XmlElement(name = "OutRetDepositAccountLastIntAvgDb", required = true)
    protected BigDecimal outRetDepositAccountLastIntAvgDb;
    @XmlElement(name = "OutRetDepositAccountLastIntChangDat", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountLastIntChangDat;
    @XmlElement(name = "OutRetDepositAccountLastMaxUpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountLastMaxUpdateDate;
    @XmlElement(name = "OutRetDepositAccountLastModifyDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountLastModifyDate;
    @XmlElement(name = "OutRetDepositAccountLastPsbPrint", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountLastPsbPrint;
    @XmlElement(name = "OutRetDepositAccountLastTdTrxId")
    protected int outRetDepositAccountLastTdTrxId;
    @XmlElement(name = "OutRetDepositAccountLastTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountLastTrxDate;
    @XmlElement(name = "OutRetDepositAccountLastTrxId")
    protected int outRetDepositAccountLastTrxId;
    @XmlElement(name = "OutRetDepositAccountLstStatementNum")
    protected int outRetDepositAccountLstStatementNum;
    @XmlElement(name = "OutRetDepositAccountManualMigrateFlg")
    protected String outRetDepositAccountManualMigrateFlg;
    @XmlElement(name = "OutRetDepositAccountMaxLastDpPer", required = true)
    protected BigDecimal outRetDepositAccountMaxLastDpPer;
    @XmlElement(name = "OutRetDepositAccountMaxLastUpdate")
    protected short outRetDepositAccountMaxLastUpdate;
    @XmlElement(name = "OutRetDepositAccountMinLastMFPer", required = true)
    protected BigDecimal outRetDepositAccountMinLastMFPer;
    @XmlElement(name = "OutRetDepositAccountMultiSalaryAmnt")
    protected short outRetDepositAccountMultiSalaryAmnt;
    @XmlElement(name = "OutRetDepositAccountNostroAccount")
    protected String outRetDepositAccountNostroAccount;
    @XmlElement(name = "OutRetDepositAccountNotExpensesFlg")
    protected String outRetDepositAccountNotExpensesFlg;
    @XmlElement(name = "OutRetDepositAccountNotifSpreadDayB")
    protected short outRetDepositAccountNotifSpreadDayB;
    @XmlElement(name = "OutRetDepositAccountNotifSpreadDays")
    protected short outRetDepositAccountNotifSpreadDays;
    @XmlElement(name = "OutRetDepositAccountOfficeAccFlag")
    protected String outRetDepositAccountOfficeAccFlag;
    @XmlElement(name = "OutRetDepositAccountOldAccNumber")
    protected String outRetDepositAccountOldAccNumber;
    @XmlElement(name = "OutRetDepositAccountOpeningBalance", required = true)
    protected BigDecimal outRetDepositAccountOpeningBalance;
    @XmlElement(name = "OutRetDepositAccountOpeningDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountOpeningDate;
    @XmlElement(name = "OutRetDepositAccountOverdraftComment")
    protected String outRetDepositAccountOverdraftComment;
    @XmlElement(name = "OutRetDepositAccountOverdraftRenewalFlg")
    protected String outRetDepositAccountOverdraftRenewalFlg;
    @XmlElement(name = "OutRetDepositAccountOverdraftSpread", required = true)
    protected BigDecimal outRetDepositAccountOverdraftSpread;
    @XmlElement(name = "OutRetDepositAccountPassbookFlag")
    protected String outRetDepositAccountPassbookFlag;
    @XmlElement(name = "OutRetDepositAccountPendingExtrLines")
    protected double outRetDepositAccountPendingExtrLines;
    @XmlElement(name = "OutRetDepositAccountPrevAccountLimit", required = true)
    protected BigDecimal outRetDepositAccountPrevAccountLimit;
    @XmlElement(name = "OutRetDepositAccountPrevAvailableBal", required = true)
    protected BigDecimal outRetDepositAccountPrevAvailableBal;
    @XmlElement(name = "OutRetDepositAccountPrevBlockedBalan", required = true)
    protected BigDecimal outRetDepositAccountPrevBlockedBalan;
    @XmlElement(name = "OutRetDepositAccountPrevBookBalance", required = true)
    protected BigDecimal outRetDepositAccountPrevBookBalance;
    @XmlElement(name = "OutRetDepositAccountPrevDateSinceOv", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountPrevDateSinceOv;
    @XmlElement(name = "OutRetDepositAccountPrevForecastBala", required = true)
    protected BigDecimal outRetDepositAccountPrevForecastBala;
    @XmlElement(name = "OutRetDepositAccountPrevLastTrxId")
    protected int outRetDepositAccountPrevLastTrxId;
    @XmlElement(name = "OutRetDepositAccountPrevLstStatement")
    protected int outRetDepositAccountPrevLstStatement;
    @XmlElement(name = "OutRetDepositAccountPrevPsbLineSn")
    protected int outRetDepositAccountPrevPsbLineSn;
    @XmlElement(name = "OutRetDepositAccountPrevTempExcEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountPrevTempExcEnd;
    @XmlElement(name = "OutRetDepositAccountPrevTempExcStar", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountPrevTempExcStar;
    @XmlElement(name = "OutRetDepositAccountPrevTemporaryExc", required = true)
    protected BigDecimal outRetDepositAccountPrevTemporaryExc;
    @XmlElement(name = "OutRetDepositAccountPrevUnclearBala", required = true)
    protected BigDecimal outRetDepositAccountPrevUnclearBala;
    @XmlElement(name = "OutRetDepositAccountPsbLastBalance", required = true)
    protected BigDecimal outRetDepositAccountPsbLastBalance;
    @XmlElement(name = "OutRetDepositAccountPsbLastPrintLn")
    protected short outRetDepositAccountPsbLastPrintLn;
    @XmlElement(name = "OutRetDepositAccountPsbLineSn")
    protected int outRetDepositAccountPsbLineSn;
    @XmlElement(name = "OutRetDepositAccountPsbLostInd")
    protected String outRetDepositAccountPsbLostInd;
    @XmlElement(name = "OutRetDepositAccountPsbPendingLines")
    protected short outRetDepositAccountPsbPendingLines;
    @XmlElement(name = "OutRetDepositAccountPsbSn")
    protected int outRetDepositAccountPsbSn;
    @XmlElement(name = "OutRetDepositAccountRenewalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountRenewalDate;
    @XmlElement(name = "OutRetDepositAccountRenewalFlag")
    protected String outRetDepositAccountRenewalFlag;
    @XmlElement(name = "OutRetDepositAccountRenewalNumber")
    protected int outRetDepositAccountRenewalNumber;
    @XmlElement(name = "OutRetDepositAccountRestrictAccFlag")
    protected String outRetDepositAccountRestrictAccFlag;
    @XmlElement(name = "OutRetDepositAccountRetainingDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountRetainingDate;
    @XmlElement(name = "OutRetDepositAccountSecretAccFlag")
    protected String outRetDepositAccountSecretAccFlag;
    @XmlElement(name = "OutRetDepositAccountServicePenalSpr", required = true)
    protected BigDecimal outRetDepositAccountServicePenalSpr;
    @XmlElement(name = "OutRetDepositAccountSpecAgrPenFlg")
    protected String outRetDepositAccountSpecAgrPenFlg;
    @XmlElement(name = "OutRetDepositAccountSpecAgrTrxFlg")
    protected String outRetDepositAccountSpecAgrTrxFlg;
    @XmlElement(name = "OutRetDepositAccountSpecialAccFlg")
    protected String outRetDepositAccountSpecialAccFlg;
    @XmlElement(name = "OutRetDepositAccountStampAmountTotal", required = true)
    protected BigDecimal outRetDepositAccountStampAmountTotal;
    @XmlElement(name = "OutRetDepositAccountStartDateTd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountStartDateTd;
    @XmlElement(name = "OutRetDepositAccountStartWdrBalPrd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountStartWdrBalPrd;
    @XmlElement(name = "OutRetDepositAccountStatementIssFreq")
    protected String outRetDepositAccountStatementIssFreq;
    @XmlElement(name = "OutRetDepositAccountSystemUsageCnt")
    protected double outRetDepositAccountSystemUsageCnt;
    @XmlElement(name = "OutRetDepositAccountTargetFlg")
    protected short outRetDepositAccountTargetFlg;
    @XmlElement(name = "OutRetDepositAccountTaxExcempFlg")
    protected String outRetDepositAccountTaxExcempFlg;
    @XmlElement(name = "OutRetDepositAccountTdBatchExtrtFlg")
    protected String outRetDepositAccountTdBatchExtrtFlg;
    @XmlElement(name = "OutRetDepositAccountTdInterPercentChg", required = true)
    protected BigDecimal outRetDepositAccountTdInterPercentChg;
    @XmlElement(name = "OutRetDepositAccountTdInterSprdChg", required = true)
    protected BigDecimal outRetDepositAccountTdInterSprdChg;
    @XmlElement(name = "OutRetDepositAccountTelebankingFlag")
    protected String outRetDepositAccountTelebankingFlag;
    @XmlElement(name = "OutRetDepositAccountTempExcEndDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountTempExcEndDt;
    @XmlElement(name = "OutRetDepositAccountTempExcStartDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountTempExcStartDt;
    @XmlElement(name = "OutRetDepositAccountTemporaryExcess", required = true)
    protected BigDecimal outRetDepositAccountTemporaryExcess;
    @XmlElement(name = "OutRetDepositAccountThirdpartyInd")
    protected String outRetDepositAccountThirdpartyInd;
    @XmlElement(name = "OutRetDepositAccountTimestmp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountTimestmp;
    @XmlElement(name = "OutRetDepositAccountTotalPartPenalty", required = true)
    protected BigDecimal outRetDepositAccountTotalPartPenalty;
    @XmlElement(name = "OutRetDepositAccountTransitionIntTax", required = true)
    protected BigDecimal outRetDepositAccountTransitionIntTax;
    @XmlElement(name = "OutRetDepositAccountTransitionInter", required = true)
    protected BigDecimal outRetDepositAccountTransitionInter;
    @XmlElement(name = "OutRetDepositAccountUnclearBalance", required = true)
    protected BigDecimal outRetDepositAccountUnclearBalance;
    @XmlElement(name = "OutRetDepositAccountUnclearWithdrFlg")
    protected String outRetDepositAccountUnclearWithdrFlg;
    @XmlElement(name = "OutRetDepositAccountUnutilLimitPenD", required = true)
    protected BigDecimal outRetDepositAccountUnutilLimitPenD;
    @XmlElement(name = "OutRetDepositAccountValidChqDuration")
    protected int outRetDepositAccountValidChqDuration;
    @XmlElement(name = "OutRetDepositAccountWebFlg")
    protected String outRetDepositAccountWebFlg;
    @XmlElement(name = "OutRetDepositAccountWebModDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountWebModDate;
    @XmlElement(name = "OutRetDepositAccountWithdrawAmnt", required = true)
    protected BigDecimal outRetDepositAccountWithdrawAmnt;
    @XmlElement(name = "OutRetDepositAccountWithdrawBalance", required = true)
    protected BigDecimal outRetDepositAccountWithdrawBalance;
    @XmlElement(name = "OutRetDepositAccountWthdrawSpread")
    protected short outRetDepositAccountWthdrawSpread;
    @XmlElement(name = "OutRetOverdraftCurrencyDisplayedDecimalPlaces")
    protected short outRetOverdraftCurrencyDisplayedDecimalPlaces;
    @XmlElement(name = "OutRetOverdraftCurrencyIdCurrency")
    protected int outRetOverdraftCurrencyIdCurrency;
    @XmlElement(name = "OutRetOverdraftCurrencyNationalFlag")
    protected String outRetOverdraftCurrencyNationalFlag;
    @XmlElement(name = "OutRetProductDescription")
    protected String outRetProductDescription;
    @XmlElement(name = "OutRetProductIdProduct")
    protected int outRetProductIdProduct;
    @XmlElement(name = "OutRetProductInterBearing")
    protected String outRetProductInterBearing;
    @XmlElement(name = "OutRetrAddExcesLnsInterestDescription")
    protected String outRetrAddExcesLnsInterestDescription;
    @XmlElement(name = "OutRetrAddExcesLnsInterestIdInterest")
    protected int outRetrAddExcesLnsInterestIdInterest;
    @XmlElement(name = "OutRetrAgrUnitCode")
    protected int outRetrAgrUnitCode;
    @XmlElement(name = "OutRetrAgreementAgrMembershipSn")
    protected int outRetrAgreementAgrMembershipSn;
    @XmlElement(name = "OutRetrAgreementAgrSn")
    protected int outRetrAgreementAgrSn;
    @XmlElement(name = "OutRetrAgreementAgrYear")
    protected short outRetrAgreementAgrYear;
    @XmlElement(name = "OutRetrCcodeGenericDetailDescription")
    protected String outRetrCcodeGenericDetailDescription;
    @XmlElement(name = "OutRetrCcodeGenericDetailSerialNum")
    protected int outRetrCcodeGenericDetailSerialNum;
    @XmlElement(name = "OutRetrCredGradGenericDetailDescription")
    protected String outRetrCredGradGenericDetailDescription;
    @XmlElement(name = "OutRetrCredGradGenericDetailSerialNum")
    protected int outRetrCredGradGenericDetailSerialNum;
    @XmlElement(name = "OutRetrLnsCommissionDescription")
    protected String outRetrLnsCommissionDescription;
    @XmlElement(name = "OutRetrLnsCommissionIdCommission")
    protected int outRetrLnsCommissionIdCommission;
    @XmlElement(name = "OutRetrLpurpGenericDetailDescription")
    protected String outRetrLpurpGenericDetailDescription;
    @XmlElement(name = "OutRetrLpurpGenericDetailSerialNum")
    protected int outRetrLpurpGenericDetailSerialNum;
    @XmlElement(name = "OutRetrPrftTransactionDescription")
    protected String outRetrPrftTransactionDescription;
    @XmlElement(name = "OutRetrPrftTransactionIdTransact")
    protected int outRetrPrftTransactionIdTransact;
    @XmlElement(name = "OutSalePersonGenericDetailShortDescription")
    protected String outSalePersonGenericDetailShortDescription;
    @XmlElement(name = "OutSaleUnitGenericDetailDescription")
    protected String outSaleUnitGenericDetailDescription;
    @XmlElement(name = "OutSaleUnitGenericDetailSerialNum")
    protected int outSaleUnitGenericDetailSerialNum;
    @XmlElement(name = "OutSecondCredLnsInterestDescription")
    protected String outSecondCredLnsInterestDescription;
    @XmlElement(name = "OutSecondCredLnsInterestIdInterest")
    protected int outSecondCredLnsInterestIdInterest;
    @XmlElement(name = "OutSecretConfirmDepositAccountSecretAccFlag")
    protected String outSecretConfirmDepositAccountSecretAccFlag;
    @XmlElement(name = "OutSecretConfirmProfitsAccountAccountNumber")
    protected String outSecretConfirmProfitsAccountAccountNumber;
    @XmlElement(name = "OutServiceRetDepositAccountAccountNumber")
    protected double outServiceRetDepositAccountAccountNumber;
    @XmlElement(name = "OutServiceRetDepositAccountCDigit")
    protected short outServiceRetDepositAccountCDigit;
    @XmlElement(name = "OutServicesProfitsAccountAccountNumber")
    protected String outServicesProfitsAccountAccountNumber;
    @XmlElement(name = "OutSpecificBeneficiaryLnsSuppliedAfmNo")
    protected String outSpecificBeneficiaryLnsSuppliedAfmNo;
    @XmlElement(name = "OutSpecificBeneficiaryLnsSuppliedCustId")
    protected int outSpecificBeneficiaryLnsSuppliedCustId;
    @XmlElement(name = "OutSpecificBeneficiaryLnsSuppliedIdNo")
    protected String outSpecificBeneficiaryLnsSuppliedIdNo;
    @XmlElement(name = "OutSpecificBeneficiaryLnsSuppliedName")
    protected String outSpecificBeneficiaryLnsSuppliedName;
    @XmlElement(name = "OutSpecificBeneficiaryLnsSuppliedReturnedCheckDigit")
    protected short outSpecificBeneficiaryLnsSuppliedReturnedCheckDigit;
    @XmlElement(name = "OutTaxCountryGenericDetailDescription")
    protected String outTaxCountryGenericDetailDescription;
    @XmlElement(name = "OutTaxCountryGenericDetailShortDescription")
    protected String outTaxCountryGenericDetailShortDescription;
    @XmlElement(name = "OutTimeDeposRenewalCrInterTaxPcg", required = true)
    protected BigDecimal outTimeDeposRenewalCrInterTaxPcg;
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
    @XmlElement(name = "OutUpdDepMntRecordingTrxUsrSn")
    protected int outUpdDepMntRecordingTrxUsrSn;
    @XmlElement(name = "OutUpdateDepositAccountEntryStatus")
    protected String outUpdateDepositAccountEntryStatus;
    @XmlElement(name = "OutUpdateDepositAccountLastModifyDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outUpdateDepositAccountLastModifyDate;
    @XmlElement(name = "OutUpdateDepositAccountOpeningDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outUpdateDepositAccountOpeningDate;
    @XmlElement(name = "OutUpdateDepositAccountPassbookFlag")
    protected String outUpdateDepositAccountPassbookFlag;
    @XmlElement(name = "OutUpdateDepositAccountRestrictAccFlag")
    protected String outUpdateDepositAccountRestrictAccFlag;
    @XmlElement(name = "OutUpdateUserLnsSuppliedName")
    protected String outUpdateUserLnsSuppliedName;
    @XmlElement(name = "OutUpdateUsrCode")
    protected String outUpdateUsrCode;
    @XmlElement(name = "OutUsedInputCharSuppliedChar37")
    protected String outUsedInputCharSuppliedChar37;
    @XmlElement(name = "OutWithdrawDayFromIefSuppliedDays")
    protected int outWithdrawDayFromIefSuppliedDays;
    @XmlElement(name = "OutWithdrawDayFromIefSuppliedMonth")
    protected short outWithdrawDayFromIefSuppliedMonth;
    @XmlElement(name = "OutWithdrawDayToIefSuppliedDays")
    protected int outWithdrawDayToIefSuppliedDays;
    @XmlElement(name = "OutWithdrawDayToIefSuppliedMonth")
    protected short outWithdrawDayToIefSuppliedMonth;
    @XmlElement(name = "OutRetDepositAccountMailStatment")
    protected String outRetDepositAccountMailStatment;
    @XmlElement(name = "OutRefereeAccNoIefSuppliedChar100")
    protected String outRefereeAccNoIefSuppliedChar100;
    @XmlElement(name = "OutRefereeNameIefSuppliedChar100")
    protected String outRefereeNameIefSuppliedChar100;
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
    @XmlElement(name = "OutRetDepositAccountLastDormantDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetDepositAccountLastDormantDate;
    @XmlElement(name = "OutDaysInDormantStatusIefSuppliedNum5")
    protected int outDaysInDormantStatusIefSuppliedNum5;
    @XmlElement(name = "OutDaysSinceLastTrxDateIefSuppliedNum5")
    protected int outDaysSinceLastTrxDateIefSuppliedNum5;
    @XmlElement(name = "OutRetDepositAccountSwiftMt942")
    protected String outRetDepositAccountSwiftMt942;
    @XmlElement(name = "OutRetDepositAccountSwiftMt940")
    protected String outRetDepositAccountSwiftMt940;

    /**
     * Gets the value of the outAccRetUnitCode property.
     * 
     */
    public int getOutAccRetUnitCode() {
        return outAccRetUnitCode;
    }

    /**
     * Sets the value of the outAccRetUnitCode property.
     * 
     */
    public void setOutAccRetUnitCode(int value) {
        this.outAccRetUnitCode = value;
    }

    /**
     * Gets the value of the outAccRetUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAccRetUnitUnitName() {
        return outAccRetUnitUnitName;
    }

    /**
     * Sets the value of the outAccRetUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAccRetUnitUnitName(String value) {
        this.outAccRetUnitUnitName = value;
    }

    /**
     * Gets the value of the outAccWithdrProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAccWithdrProfitsAccountAccountNumber() {
        return outAccWithdrProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outAccWithdrProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAccWithdrProfitsAccountAccountNumber(String value) {
        this.outAccWithdrProfitsAccountAccountNumber = value;
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
     * Gets the value of the outAuthJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAuthJustificDescription() {
        return outAuthJustificDescription;
    }

    /**
     * Sets the value of the outAuthJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAuthJustificDescription(String value) {
        this.outAuthJustificDescription = value;
    }

    /**
     * Gets the value of the outAuthJustificIdJustific property.
     * 
     */
    public int getOutAuthJustificIdJustific() {
        return outAuthJustificIdJustific;
    }

    /**
     * Sets the value of the outAuthJustificIdJustific property.
     * 
     */
    public void setOutAuthJustificIdJustific(int value) {
        this.outAuthJustificIdJustific = value;
    }

    /**
     * Gets the value of the outAuthPrftTransactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAuthPrftTransactionDescription() {
        return outAuthPrftTransactionDescription;
    }

    /**
     * Sets the value of the outAuthPrftTransactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAuthPrftTransactionDescription(String value) {
        this.outAuthPrftTransactionDescription = value;
    }

    /**
     * Gets the value of the outAuthPrftTransactionIdTransact property.
     * 
     */
    public int getOutAuthPrftTransactionIdTransact() {
        return outAuthPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the outAuthPrftTransactionIdTransact property.
     * 
     */
    public void setOutAuthPrftTransactionIdTransact(int value) {
        this.outAuthPrftTransactionIdTransact = value;
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
     * Gets the value of the outBenefCustomerExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBenefCustomerExpireDate() {
        return outBenefCustomerExpireDate;
    }

    /**
     * Sets the value of the outBenefCustomerExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBenefCustomerExpireDate(XMLGregorianCalendar value) {
        this.outBenefCustomerExpireDate = value;
    }

    /**
     * Gets the value of the outBenefCustomerFatherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBenefCustomerFatherName() {
        return outBenefCustomerFatherName;
    }

    /**
     * Sets the value of the outBenefCustomerFatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBenefCustomerFatherName(String value) {
        this.outBenefCustomerFatherName = value;
    }

    /**
     * Gets the value of the outBenefCustomerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBenefCustomerFirstName() {
        return outBenefCustomerFirstName;
    }

    /**
     * Sets the value of the outBenefCustomerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBenefCustomerFirstName(String value) {
        this.outBenefCustomerFirstName = value;
    }

    /**
     * Gets the value of the outBenefCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBenefCustomerSurname() {
        return outBenefCustomerSurname;
    }

    /**
     * Sets the value of the outBenefCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBenefCustomerSurname(String value) {
        this.outBenefCustomerSurname = value;
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
     * Gets the value of the outCapitalDisposalDepositAccountAccountNumber property.
     * 
     */
    public double getOutCapitalDisposalDepositAccountAccountNumber() {
        return outCapitalDisposalDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the outCapitalDisposalDepositAccountAccountNumber property.
     * 
     */
    public void setOutCapitalDisposalDepositAccountAccountNumber(double value) {
        this.outCapitalDisposalDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outCapitalDisposalDepositAccountCDigit property.
     * 
     */
    public short getOutCapitalDisposalDepositAccountCDigit() {
        return outCapitalDisposalDepositAccountCDigit;
    }

    /**
     * Sets the value of the outCapitalDisposalDepositAccountCDigit property.
     * 
     */
    public void setOutCapitalDisposalDepositAccountCDigit(short value) {
        this.outCapitalDisposalDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the outCapitalDisposalProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCapitalDisposalProfitsAccountAccountNumber() {
        return outCapitalDisposalProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outCapitalDisposalProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCapitalDisposalProfitsAccountAccountNumber(String value) {
        this.outCapitalDisposalProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outCoben2RetCustomerCDigit property.
     * 
     */
    public short getOutCoben2RetCustomerCDigit() {
        return outCoben2RetCustomerCDigit;
    }

    /**
     * Sets the value of the outCoben2RetCustomerCDigit property.
     * 
     */
    public void setOutCoben2RetCustomerCDigit(short value) {
        this.outCoben2RetCustomerCDigit = value;
    }

    /**
     * Gets the value of the outCoben2RetCustomerCustId property.
     * 
     */
    public int getOutCoben2RetCustomerCustId() {
        return outCoben2RetCustomerCustId;
    }

    /**
     * Sets the value of the outCoben2RetCustomerCustId property.
     * 
     */
    public void setOutCoben2RetCustomerCustId(int value) {
        this.outCoben2RetCustomerCustId = value;
    }

    /**
     * Gets the value of the outCoben2RetLnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCoben2RetLnsSuppliedName() {
        return outCoben2RetLnsSuppliedName;
    }

    /**
     * Sets the value of the outCoben2RetLnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCoben2RetLnsSuppliedName(String value) {
        this.outCoben2RetLnsSuppliedName = value;
    }

    /**
     * Gets the value of the outCoben3RetCustomerCDigit property.
     * 
     */
    public short getOutCoben3RetCustomerCDigit() {
        return outCoben3RetCustomerCDigit;
    }

    /**
     * Sets the value of the outCoben3RetCustomerCDigit property.
     * 
     */
    public void setOutCoben3RetCustomerCDigit(short value) {
        this.outCoben3RetCustomerCDigit = value;
    }

    /**
     * Gets the value of the outCoben3RetCustomerCustId property.
     * 
     */
    public int getOutCoben3RetCustomerCustId() {
        return outCoben3RetCustomerCustId;
    }

    /**
     * Sets the value of the outCoben3RetCustomerCustId property.
     * 
     */
    public void setOutCoben3RetCustomerCustId(int value) {
        this.outCoben3RetCustomerCustId = value;
    }

    /**
     * Gets the value of the outCoben3RetLnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCoben3RetLnsSuppliedName() {
        return outCoben3RetLnsSuppliedName;
    }

    /**
     * Sets the value of the outCoben3RetLnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCoben3RetLnsSuppliedName(String value) {
        this.outCoben3RetLnsSuppliedName = value;
    }

    /**
     * Gets the value of the outCoben4RetCustomerCDigit property.
     * 
     */
    public short getOutCoben4RetCustomerCDigit() {
        return outCoben4RetCustomerCDigit;
    }

    /**
     * Sets the value of the outCoben4RetCustomerCDigit property.
     * 
     */
    public void setOutCoben4RetCustomerCDigit(short value) {
        this.outCoben4RetCustomerCDigit = value;
    }

    /**
     * Gets the value of the outCoben4RetCustomerCustId property.
     * 
     */
    public int getOutCoben4RetCustomerCustId() {
        return outCoben4RetCustomerCustId;
    }

    /**
     * Sets the value of the outCoben4RetCustomerCustId property.
     * 
     */
    public void setOutCoben4RetCustomerCustId(int value) {
        this.outCoben4RetCustomerCustId = value;
    }

    /**
     * Gets the value of the outCoben4RetLnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCoben4RetLnsSuppliedName() {
        return outCoben4RetLnsSuppliedName;
    }

    /**
     * Sets the value of the outCoben4RetLnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCoben4RetLnsSuppliedName(String value) {
        this.outCoben4RetLnsSuppliedName = value;
    }

    /**
     * Gets the value of the outCoben5RetCustomerCDigit property.
     * 
     */
    public short getOutCoben5RetCustomerCDigit() {
        return outCoben5RetCustomerCDigit;
    }

    /**
     * Sets the value of the outCoben5RetCustomerCDigit property.
     * 
     */
    public void setOutCoben5RetCustomerCDigit(short value) {
        this.outCoben5RetCustomerCDigit = value;
    }

    /**
     * Gets the value of the outCoben5RetCustomerCustId property.
     * 
     */
    public int getOutCoben5RetCustomerCustId() {
        return outCoben5RetCustomerCustId;
    }

    /**
     * Sets the value of the outCoben5RetCustomerCustId property.
     * 
     */
    public void setOutCoben5RetCustomerCustId(int value) {
        this.outCoben5RetCustomerCustId = value;
    }

    /**
     * Gets the value of the outCoben5RetLnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCoben5RetLnsSuppliedName() {
        return outCoben5RetLnsSuppliedName;
    }

    /**
     * Sets the value of the outCoben5RetLnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCoben5RetLnsSuppliedName(String value) {
        this.outCoben5RetLnsSuppliedName = value;
    }

    /**
     * Gets the value of the outCompany1StcustomerIefSuppliedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCompany1StcustomerIefSuppliedDate() {
        return outCompany1StcustomerIefSuppliedDate;
    }

    /**
     * Sets the value of the outCompany1StcustomerIefSuppliedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCompany1StcustomerIefSuppliedDate(XMLGregorianCalendar value) {
        this.outCompany1StcustomerIefSuppliedDate = value;
    }

    /**
     * Gets the value of the outCompany1StcustomerIefSuppliedDateFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCompany1StcustomerIefSuppliedDateFormat() {
        return outCompany1StcustomerIefSuppliedDateFormat;
    }

    /**
     * Sets the value of the outCompany1StcustomerIefSuppliedDateFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCompany1StcustomerIefSuppliedDateFormat(String value) {
        this.outCompany1StcustomerIefSuppliedDateFormat = value;
    }

    /**
     * Gets the value of the outCountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCountryGenericDetailDescription() {
        return outCountryGenericDetailDescription;
    }

    /**
     * Sets the value of the outCountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCountryGenericDetailDescription(String value) {
        this.outCountryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outCrDbInterestRetDepositAccountAccountNumber property.
     * 
     */
    public double getOutCrDbInterestRetDepositAccountAccountNumber() {
        return outCrDbInterestRetDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the outCrDbInterestRetDepositAccountAccountNumber property.
     * 
     */
    public void setOutCrDbInterestRetDepositAccountAccountNumber(double value) {
        this.outCrDbInterestRetDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outCrDbInterestRetDepositAccountCDigit property.
     * 
     */
    public short getOutCrDbInterestRetDepositAccountCDigit() {
        return outCrDbInterestRetDepositAccountCDigit;
    }

    /**
     * Sets the value of the outCrDbInterestRetDepositAccountCDigit property.
     * 
     */
    public void setOutCrDbInterestRetDepositAccountCDigit(short value) {
        this.outCrDbInterestRetDepositAccountCDigit = value;
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
     * Gets the value of the outCrRetLnsInterestDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCrRetLnsInterestDescription() {
        return outCrRetLnsInterestDescription;
    }

    /**
     * Sets the value of the outCrRetLnsInterestDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCrRetLnsInterestDescription(String value) {
        this.outCrRetLnsInterestDescription = value;
    }

    /**
     * Gets the value of the outCrRetLnsInterestForDebit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCrRetLnsInterestForDebit() {
        return outCrRetLnsInterestForDebit;
    }

    /**
     * Sets the value of the outCrRetLnsInterestForDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCrRetLnsInterestForDebit(String value) {
        this.outCrRetLnsInterestForDebit = value;
    }

    /**
     * Gets the value of the outCrRetLnsInterestIdInterest property.
     * 
     */
    public int getOutCrRetLnsInterestIdInterest() {
        return outCrRetLnsInterestIdInterest;
    }

    /**
     * Sets the value of the outCrRetLnsInterestIdInterest property.
     * 
     */
    public void setOutCrRetLnsInterestIdInterest(int value) {
        this.outCrRetLnsInterestIdInterest = value;
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
     * Gets the value of the outCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressAddress1() {
        return outCustAddressAddress1;
    }

    /**
     * Sets the value of the outCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressAddress1(String value) {
        this.outCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the outCustAddressAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressAddress2() {
        return outCustAddressAddress2;
    }

    /**
     * Sets the value of the outCustAddressAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressAddress2(String value) {
        this.outCustAddressAddress2 = value;
    }

    /**
     * Gets the value of the outCustAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressCity() {
        return outCustAddressCity;
    }

    /**
     * Sets the value of the outCustAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressCity(String value) {
        this.outCustAddressCity = value;
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
     * Gets the value of the outCustAddressZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressZipCode() {
        return outCustAddressZipCode;
    }

    /**
     * Sets the value of the outCustAddressZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressZipCode(String value) {
        this.outCustAddressZipCode = value;
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
     * Gets the value of the outCustCategGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustCategGenericDetailParameterType() {
        return outCustCategGenericDetailParameterType;
    }

    /**
     * Sets the value of the outCustCategGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustCategGenericDetailParameterType(String value) {
        this.outCustCategGenericDetailParameterType = value;
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
     * Gets the value of the outCustomerRetLnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerRetLnsSuppliedName() {
        return outCustomerRetLnsSuppliedName;
    }

    /**
     * Sets the value of the outCustomerRetLnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerRetLnsSuppliedName(String value) {
        this.outCustomerRetLnsSuppliedName = value;
    }

    /**
     * Gets the value of the outDbCrInterProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDbCrInterProfitsAccountAccountNumber() {
        return outDbCrInterProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outDbCrInterProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDbCrInterProfitsAccountAccountNumber(String value) {
        this.outDbCrInterProfitsAccountAccountNumber = value;
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
     * Gets the value of the outDbRetLnsInterestDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDbRetLnsInterestDescription() {
        return outDbRetLnsInterestDescription;
    }

    /**
     * Sets the value of the outDbRetLnsInterestDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDbRetLnsInterestDescription(String value) {
        this.outDbRetLnsInterestDescription = value;
    }

    /**
     * Gets the value of the outDbRetLnsInterestForDebit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDbRetLnsInterestForDebit() {
        return outDbRetLnsInterestForDebit;
    }

    /**
     * Sets the value of the outDbRetLnsInterestForDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDbRetLnsInterestForDebit(String value) {
        this.outDbRetLnsInterestForDebit = value;
    }

    /**
     * Gets the value of the outDbRetLnsInterestIdInterest property.
     * 
     */
    public int getOutDbRetLnsInterestIdInterest() {
        return outDbRetLnsInterestIdInterest;
    }

    /**
     * Sets the value of the outDbRetLnsInterestIdInterest property.
     * 
     */
    public void setOutDbRetLnsInterestIdInterest(int value) {
        this.outDbRetLnsInterestIdInterest = value;
    }

    /**
     * Gets the value of the outDepAccTrAccTrAccCd property.
     * 
     */
    public short getOutDepAccTrAccTrAccCd() {
        return outDepAccTrAccTrAccCd;
    }

    /**
     * Sets the value of the outDepAccTrAccTrAccCd property.
     * 
     */
    public void setOutDepAccTrAccTrAccCd(short value) {
        this.outDepAccTrAccTrAccCd = value;
    }

    /**
     * Gets the value of the outDepAccTrAccTrAccSn property.
     * 
     */
    public int getOutDepAccTrAccTrAccSn() {
        return outDepAccTrAccTrAccSn;
    }

    /**
     * Sets the value of the outDepAccTrAccTrAccSn property.
     * 
     */
    public void setOutDepAccTrAccTrAccSn(int value) {
        this.outDepAccTrAccTrAccSn = value;
    }

    /**
     * Gets the value of the outDepAccTrAccTrAccType property.
     * 
     */
    public short getOutDepAccTrAccTrAccType() {
        return outDepAccTrAccTrAccType;
    }

    /**
     * Sets the value of the outDepAccTrAccTrAccType property.
     * 
     */
    public void setOutDepAccTrAccTrAccType(short value) {
        this.outDepAccTrAccTrAccType = value;
    }

    /**
     * Gets the value of the outDepAccTrAccTrAccUnit property.
     * 
     */
    public int getOutDepAccTrAccTrAccUnit() {
        return outDepAccTrAccTrAccUnit;
    }

    /**
     * Sets the value of the outDepAccTrAccTrAccUnit property.
     * 
     */
    public void setOutDepAccTrAccTrAccUnit(int value) {
        this.outDepAccTrAccTrAccUnit = value;
    }

    /**
     * Gets the value of the outDepPendingTrxTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDepPendingTrxTrxDate() {
        return outDepPendingTrxTrxDate;
    }

    /**
     * Sets the value of the outDepPendingTrxTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDepPendingTrxTrxDate(XMLGregorianCalendar value) {
        this.outDepPendingTrxTrxDate = value;
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
     * Gets the value of the outDepositAccountMaxBenef property.
     * 
     */
    public short getOutDepositAccountMaxBenef() {
        return outDepositAccountMaxBenef;
    }

    /**
     * Sets the value of the outDepositAccountMaxBenef property.
     * 
     */
    public void setOutDepositAccountMaxBenef(short value) {
        this.outDepositAccountMaxBenef = value;
    }

    /**
     * Gets the value of the outDepositAtmCardFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAtmCardFlag() {
        return outDepositAtmCardFlag;
    }

    /**
     * Sets the value of the outDepositAtmCardFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAtmCardFlag(String value) {
        this.outDepositAtmCardFlag = value;
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
     * Gets the value of the outDepositCrInterAccLast property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDepositCrInterAccLast() {
        return outDepositCrInterAccLast;
    }

    /**
     * Sets the value of the outDepositCrInterAccLast property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDepositCrInterAccLast(XMLGregorianCalendar value) {
        this.outDepositCrInterAccLast = value;
    }

    /**
     * Gets the value of the outDepositCustomerMaxAcc property.
     * 
     */
    public int getOutDepositCustomerMaxAcc() {
        return outDepositCustomerMaxAcc;
    }

    /**
     * Sets the value of the outDepositCustomerMaxAcc property.
     * 
     */
    public void setOutDepositCustomerMaxAcc(int value) {
        this.outDepositCustomerMaxAcc = value;
    }

    /**
     * Gets the value of the outDepositDepIntMech property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositDepIntMech() {
        return outDepositDepIntMech;
    }

    /**
     * Sets the value of the outDepositDepIntMech property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositDepIntMech(String value) {
        this.outDepositDepIntMech = value;
    }

    /**
     * Gets the value of the outDepositDepositType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositDepositType() {
        return outDepositDepositType;
    }

    /**
     * Sets the value of the outDepositDepositType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositDepositType(String value) {
        this.outDepositDepositType = value;
    }

    /**
     * Gets the value of the outDepositEncroachTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositEncroachTolerance() {
        return outDepositEncroachTolerance;
    }

    /**
     * Sets the value of the outDepositEncroachTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositEncroachTolerance(BigDecimal value) {
        this.outDepositEncroachTolerance = value;
    }

    /**
     * Gets the value of the outDepositForeignCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositForeignCurrency() {
        return outDepositForeignCurrency;
    }

    /**
     * Sets the value of the outDepositForeignCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositForeignCurrency(String value) {
        this.outDepositForeignCurrency = value;
    }

    /**
     * Gets the value of the outDepositMFCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositMFCode() {
        return outDepositMFCode;
    }

    /**
     * Sets the value of the outDepositMFCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositMFCode(String value) {
        this.outDepositMFCode = value;
    }

    /**
     * Gets the value of the outDepositMaxCustDpPer property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositMaxCustDpPer() {
        return outDepositMaxCustDpPer;
    }

    /**
     * Sets the value of the outDepositMaxCustDpPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositMaxCustDpPer(BigDecimal value) {
        this.outDepositMaxCustDpPer = value;
    }

    /**
     * Gets the value of the outDepositMaxPrmWithdDays property.
     * 
     */
    public short getOutDepositMaxPrmWithdDays() {
        return outDepositMaxPrmWithdDays;
    }

    /**
     * Sets the value of the outDepositMaxPrmWithdDays property.
     * 
     */
    public void setOutDepositMaxPrmWithdDays(short value) {
        this.outDepositMaxPrmWithdDays = value;
    }

    /**
     * Gets the value of the outDepositMaxUpdate property.
     * 
     */
    public short getOutDepositMaxUpdate() {
        return outDepositMaxUpdate;
    }

    /**
     * Sets the value of the outDepositMaxUpdate property.
     * 
     */
    public void setOutDepositMaxUpdate(short value) {
        this.outDepositMaxUpdate = value;
    }

    /**
     * Gets the value of the outDepositMinCustMFPer property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositMinCustMFPer() {
        return outDepositMinCustMFPer;
    }

    /**
     * Sets the value of the outDepositMinCustMFPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositMinCustMFPer(BigDecimal value) {
        this.outDepositMinCustMFPer = value;
    }

    /**
     * Gets the value of the outDepositMinDayAvailBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositMinDayAvailBalance() {
        return outDepositMinDayAvailBalance;
    }

    /**
     * Sets the value of the outDepositMinDayAvailBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositMinDayAvailBalance(BigDecimal value) {
        this.outDepositMinDayAvailBalance = value;
    }

    /**
     * Gets the value of the outDepositMinDayDistrAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositMinDayDistrAmnt() {
        return outDepositMinDayDistrAmnt;
    }

    /**
     * Sets the value of the outDepositMinDayDistrAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositMinDayDistrAmnt(BigDecimal value) {
        this.outDepositMinDayDistrAmnt = value;
    }

    /**
     * Gets the value of the outDepositMinTrxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositMinTrxAmount() {
        return outDepositMinTrxAmount;
    }

    /**
     * Sets the value of the outDepositMinTrxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositMinTrxAmount(BigDecimal value) {
        this.outDepositMinTrxAmount = value;
    }

    /**
     * Gets the value of the outDepositOverdraftFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositOverdraftFlg() {
        return outDepositOverdraftFlg;
    }

    /**
     * Sets the value of the outDepositOverdraftFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositOverdraftFlg(String value) {
        this.outDepositOverdraftFlg = value;
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
     * Gets the value of the outDepositOverdraftMaxsprd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositOverdraftMaxsprd() {
        return outDepositOverdraftMaxsprd;
    }

    /**
     * Sets the value of the outDepositOverdraftMaxsprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositOverdraftMaxsprd(BigDecimal value) {
        this.outDepositOverdraftMaxsprd = value;
    }

    /**
     * Gets the value of the outDepositPassbookFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositPassbookFlag() {
        return outDepositPassbookFlag;
    }

    /**
     * Sets the value of the outDepositPassbookFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositPassbookFlag(String value) {
        this.outDepositPassbookFlag = value;
    }

    /**
     * Gets the value of the outDepositPenaltyMaxSpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositPenaltyMaxSpread() {
        return outDepositPenaltyMaxSpread;
    }

    /**
     * Sets the value of the outDepositPenaltyMaxSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositPenaltyMaxSpread(BigDecimal value) {
        this.outDepositPenaltyMaxSpread = value;
    }

    /**
     * Gets the value of the outDepositPenaltyMinSpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositPenaltyMinSpread() {
        return outDepositPenaltyMinSpread;
    }

    /**
     * Sets the value of the outDepositPenaltyMinSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositPenaltyMinSpread(BigDecimal value) {
        this.outDepositPenaltyMinSpread = value;
    }

    /**
     * Gets the value of the outDepositStatementIssFreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositStatementIssFreq() {
        return outDepositStatementIssFreq;
    }

    /**
     * Sets the value of the outDepositStatementIssFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositStatementIssFreq(String value) {
        this.outDepositStatementIssFreq = value;
    }

    /**
     * Gets the value of the outDepositTelebankingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositTelebankingFlag() {
        return outDepositTelebankingFlag;
    }

    /**
     * Sets the value of the outDepositTelebankingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositTelebankingFlag(String value) {
        this.outDepositTelebankingFlag = value;
    }

    /**
     * Gets the value of the outDpHistInterRateEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDpHistInterRateEffectiveDate() {
        return outDpHistInterRateEffectiveDate;
    }

    /**
     * Sets the value of the outDpHistInterRateEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDpHistInterRateEffectiveDate(XMLGregorianCalendar value) {
        this.outDpHistInterRateEffectiveDate = value;
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
     * Gets the value of the outGrpBalances property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfD0303VOutGrpBalancesItem }
     *     
     */
    public ArrayOfD0303VOutGrpBalancesItem getOutGrpBalances() {
        return outGrpBalances;
    }

    /**
     * Sets the value of the outGrpBalances property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfD0303VOutGrpBalancesItem }
     *     
     */
    public void setOutGrpBalances(ArrayOfD0303VOutGrpBalancesItem value) {
        this.outGrpBalances = value;
    }

    /**
     * Gets the value of the outInvestDepositAccountCustPerMFAllow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInvestDepositAccountCustPerMFAllow() {
        return outInvestDepositAccountCustPerMFAllow;
    }

    /**
     * Sets the value of the outInvestDepositAccountCustPerMFAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInvestDepositAccountCustPerMFAllow(String value) {
        this.outInvestDepositAccountCustPerMFAllow = value;
    }

    /**
     * Gets the value of the outInvestDepositAccountMaxLastDpPer property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutInvestDepositAccountMaxLastDpPer() {
        return outInvestDepositAccountMaxLastDpPer;
    }

    /**
     * Sets the value of the outInvestDepositAccountMaxLastDpPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutInvestDepositAccountMaxLastDpPer(BigDecimal value) {
        this.outInvestDepositAccountMaxLastDpPer = value;
    }

    /**
     * Gets the value of the outInvestDepositAccountMinLastMFPer property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutInvestDepositAccountMinLastMFPer() {
        return outInvestDepositAccountMinLastMFPer;
    }

    /**
     * Sets the value of the outInvestDepositAccountMinLastMFPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutInvestDepositAccountMinLastMFPer(BigDecimal value) {
        this.outInvestDepositAccountMinLastMFPer = value;
    }

    /**
     * Gets the value of the outInvestProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInvestProfitsAccountAccountNumber() {
        return outInvestProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outInvestProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInvestProfitsAccountAccountNumber(String value) {
        this.outInvestProfitsAccountAccountNumber = value;
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
     * Gets the value of the outKekRetGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutKekRetGenericDetailDescription() {
        return outKekRetGenericDetailDescription;
    }

    /**
     * Sets the value of the outKekRetGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutKekRetGenericDetailDescription(String value) {
        this.outKekRetGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outKekRetGenericDetailSerialNum property.
     * 
     */
    public int getOutKekRetGenericDetailSerialNum() {
        return outKekRetGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outKekRetGenericDetailSerialNum property.
     * 
     */
    public void setOutKekRetGenericDetailSerialNum(int value) {
        this.outKekRetGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outLoanAccountAccMechanism property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountAccMechanism() {
        return outLoanAccountAccMechanism;
    }

    /**
     * Sets the value of the outLoanAccountAccMechanism property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountAccMechanism(String value) {
        this.outLoanAccountAccMechanism = value;
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
     * Gets the value of the outMonitorEmployeeRetLnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMonitorEmployeeRetLnsSuppliedName() {
        return outMonitorEmployeeRetLnsSuppliedName;
    }

    /**
     * Sets the value of the outMonitorEmployeeRetLnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMonitorEmployeeRetLnsSuppliedName(String value) {
        this.outMonitorEmployeeRetLnsSuppliedName = value;
    }

    /**
     * Gets the value of the outMonitorRetBankemployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMonitorRetBankemployeeId() {
        return outMonitorRetBankemployeeId;
    }

    /**
     * Sets the value of the outMonitorRetBankemployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMonitorRetBankemployeeId(String value) {
        this.outMonitorRetBankemployeeId = value;
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
     * Gets the value of the outNumberOtherIdIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutNumberOtherIdIdNo() {
        return outNumberOtherIdIdNo;
    }

    /**
     * Sets the value of the outNumberOtherIdIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutNumberOtherIdIdNo(String value) {
        this.outNumberOtherIdIdNo = value;
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
     * Gets the value of the outOpenRetUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOpenRetUsrCode() {
        return outOpenRetUsrCode;
    }

    /**
     * Sets the value of the outOpenRetUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOpenRetUsrCode(String value) {
        this.outOpenRetUsrCode = value;
    }

    /**
     * Gets the value of the outOpenUnitCode property.
     * 
     */
    public int getOutOpenUnitCode() {
        return outOpenUnitCode;
    }

    /**
     * Sets the value of the outOpenUnitCode property.
     * 
     */
    public void setOutOpenUnitCode(int value) {
        this.outOpenUnitCode = value;
    }

    /**
     * Gets the value of the outOpenUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOpenUnitUnitName() {
        return outOpenUnitUnitName;
    }

    /**
     * Sets the value of the outOpenUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOpenUnitUnitName(String value) {
        this.outOpenUnitUnitName = value;
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
     * Gets the value of the outPackageIdPackage property.
     * 
     */
    public int getOutPackageIdPackage() {
        return outPackageIdPackage;
    }

    /**
     * Sets the value of the outPackageIdPackage property.
     * 
     */
    public void setOutPackageIdPackage(int value) {
        this.outPackageIdPackage = value;
    }

    /**
     * Gets the value of the outPackagePackageDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPackagePackageDescr() {
        return outPackagePackageDescr;
    }

    /**
     * Sets the value of the outPackagePackageDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPackagePackageDescr(String value) {
        this.outPackagePackageDescr = value;
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
     * Gets the value of the outRetCurrencyIdCurrency property.
     * 
     */
    public int getOutRetCurrencyIdCurrency() {
        return outRetCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outRetCurrencyIdCurrency property.
     * 
     */
    public void setOutRetCurrencyIdCurrency(int value) {
        this.outRetCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outRetCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetCurrencyShortDescr() {
        return outRetCurrencyShortDescr;
    }

    /**
     * Sets the value of the outRetCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetCurrencyShortDescr(String value) {
        this.outRetCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outRetCustomerCDigit property.
     * 
     */
    public short getOutRetCustomerCDigit() {
        return outRetCustomerCDigit;
    }

    /**
     * Sets the value of the outRetCustomerCDigit property.
     * 
     */
    public void setOutRetCustomerCDigit(short value) {
        this.outRetCustomerCDigit = value;
    }

    /**
     * Gets the value of the outRetCustomerCustId property.
     * 
     */
    public int getOutRetCustomerCustId() {
        return outRetCustomerCustId;
    }

    /**
     * Sets the value of the outRetCustomerCustId property.
     * 
     */
    public void setOutRetCustomerCustId(int value) {
        this.outRetCustomerCustId = value;
    }

    /**
     * Gets the value of the outRetDepAccountInfoCurFxIntExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepAccountInfoCurFxIntExpDt() {
        return outRetDepAccountInfoCurFxIntExpDt;
    }

    /**
     * Sets the value of the outRetDepAccountInfoCurFxIntExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepAccountInfoCurFxIntExpDt(XMLGregorianCalendar value) {
        this.outRetDepAccountInfoCurFxIntExpDt = value;
    }

    /**
     * Gets the value of the outRetDepAccountInfoCurFxIntStDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepAccountInfoCurFxIntStDt() {
        return outRetDepAccountInfoCurFxIntStDt;
    }

    /**
     * Sets the value of the outRetDepAccountInfoCurFxIntStDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepAccountInfoCurFxIntStDt(XMLGregorianCalendar value) {
        this.outRetDepAccountInfoCurFxIntStDt = value;
    }

    /**
     * Gets the value of the outRetDepAccountInfoOaCollFreqUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepAccountInfoOaCollFreqUnit() {
        return outRetDepAccountInfoOaCollFreqUnit;
    }

    /**
     * Sets the value of the outRetDepAccountInfoOaCollFreqUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepAccountInfoOaCollFreqUnit(String value) {
        this.outRetDepAccountInfoOaCollFreqUnit = value;
    }

    /**
     * Gets the value of the outRetDepAccountInfoOaCollectFreq property.
     * 
     */
    public short getOutRetDepAccountInfoOaCollectFreq() {
        return outRetDepAccountInfoOaCollectFreq;
    }

    /**
     * Sets the value of the outRetDepAccountInfoOaCollectFreq property.
     * 
     */
    public void setOutRetDepAccountInfoOaCollectFreq(short value) {
        this.outRetDepAccountInfoOaCollectFreq = value;
    }

    /**
     * Gets the value of the outRetDepAccountInfoOaDuration property.
     * 
     */
    public short getOutRetDepAccountInfoOaDuration() {
        return outRetDepAccountInfoOaDuration;
    }

    /**
     * Sets the value of the outRetDepAccountInfoOaDuration property.
     * 
     */
    public void setOutRetDepAccountInfoOaDuration(short value) {
        this.outRetDepAccountInfoOaDuration = value;
    }

    /**
     * Gets the value of the outRetDepAccountInfoOaDurationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepAccountInfoOaDurationUnit() {
        return outRetDepAccountInfoOaDurationUnit;
    }

    /**
     * Sets the value of the outRetDepAccountInfoOaDurationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepAccountInfoOaDurationUnit(String value) {
        this.outRetDepAccountInfoOaDurationUnit = value;
    }

    /**
     * Gets the value of the outRetDepFixingRateRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepFixingRateRate() {
        return outRetDepFixingRateRate;
    }

    /**
     * Sets the value of the outRetDepFixingRateRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepFixingRateRate(BigDecimal value) {
        this.outRetDepFixingRateRate = value;
    }

    /**
     * Gets the value of the outRetDepositAccountAccGroup property.
     * 
     */
    public int getOutRetDepositAccountAccGroup() {
        return outRetDepositAccountAccGroup;
    }

    /**
     * Sets the value of the outRetDepositAccountAccGroup property.
     * 
     */
    public void setOutRetDepositAccountAccGroup(int value) {
        this.outRetDepositAccountAccGroup = value;
    }

    /**
     * Gets the value of the outRetDepositAccountAccountLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountAccountLimit() {
        return outRetDepositAccountAccountLimit;
    }

    /**
     * Sets the value of the outRetDepositAccountAccountLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountAccountLimit(BigDecimal value) {
        this.outRetDepositAccountAccountLimit = value;
    }

    /**
     * Gets the value of the outRetDepositAccountAccountNumber property.
     * 
     */
    public double getOutRetDepositAccountAccountNumber() {
        return outRetDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the outRetDepositAccountAccountNumber property.
     * 
     */
    public void setOutRetDepositAccountAccountNumber(double value) {
        this.outRetDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outRetDepositAccountAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountAccountType() {
        return outRetDepositAccountAccountType;
    }

    /**
     * Sets the value of the outRetDepositAccountAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountAccountType(String value) {
        this.outRetDepositAccountAccountType = value;
    }

    /**
     * Gets the value of the outRetDepositAccountAccrCrExpInt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountAccrCrExpInt() {
        return outRetDepositAccountAccrCrExpInt;
    }

    /**
     * Sets the value of the outRetDepositAccountAccrCrExpInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountAccrCrExpInt(BigDecimal value) {
        this.outRetDepositAccountAccrCrExpInt = value;
    }

    /**
     * Gets the value of the outRetDepositAccountAccrCrInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountAccrCrInterest() {
        return outRetDepositAccountAccrCrInterest;
    }

    /**
     * Sets the value of the outRetDepositAccountAccrCrInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountAccrCrInterest(BigDecimal value) {
        this.outRetDepositAccountAccrCrInterest = value;
    }

    /**
     * Gets the value of the outRetDepositAccountAccrDbInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountAccrDbInterest() {
        return outRetDepositAccountAccrDbInterest;
    }

    /**
     * Sets the value of the outRetDepositAccountAccrDbInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountAccrDbInterest(BigDecimal value) {
        this.outRetDepositAccountAccrDbInterest = value;
    }

    /**
     * Gets the value of the outRetDepositAccountAccrExcessInter property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountAccrExcessInter() {
        return outRetDepositAccountAccrExcessInter;
    }

    /**
     * Sets the value of the outRetDepositAccountAccrExcessInter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountAccrExcessInter(BigDecimal value) {
        this.outRetDepositAccountAccrExcessInter = value;
    }

    /**
     * Gets the value of the outRetDepositAccountAccrN128Inter property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountAccrN128Inter() {
        return outRetDepositAccountAccrN128Inter;
    }

    /**
     * Sets the value of the outRetDepositAccountAccrN128Inter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountAccrN128Inter(BigDecimal value) {
        this.outRetDepositAccountAccrN128Inter = value;
    }

    /**
     * Gets the value of the outRetDepositAccountAdditionalInfoFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountAdditionalInfoFlag() {
        return outRetDepositAccountAdditionalInfoFlag;
    }

    /**
     * Sets the value of the outRetDepositAccountAdditionalInfoFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountAdditionalInfoFlag(String value) {
        this.outRetDepositAccountAdditionalInfoFlag = value;
    }

    /**
     * Gets the value of the outRetDepositAccountAkflag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountAkflag() {
        return outRetDepositAccountAkflag;
    }

    /**
     * Sets the value of the outRetDepositAccountAkflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountAkflag(String value) {
        this.outRetDepositAccountAkflag = value;
    }

    /**
     * Gets the value of the outRetDepositAccountAnnounceTolDays property.
     * 
     */
    public short getOutRetDepositAccountAnnounceTolDays() {
        return outRetDepositAccountAnnounceTolDays;
    }

    /**
     * Sets the value of the outRetDepositAccountAnnounceTolDays property.
     * 
     */
    public void setOutRetDepositAccountAnnounceTolDays(short value) {
        this.outRetDepositAccountAnnounceTolDays = value;
    }

    /**
     * Gets the value of the outRetDepositAccountApprChqAdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountApprChqAdate() {
        return outRetDepositAccountApprChqAdate;
    }

    /**
     * Sets the value of the outRetDepositAccountApprChqAdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountApprChqAdate(XMLGregorianCalendar value) {
        this.outRetDepositAccountApprChqAdate = value;
    }

    /**
     * Gets the value of the outRetDepositAccountApprChqCnt property.
     * 
     */
    public int getOutRetDepositAccountApprChqCnt() {
        return outRetDepositAccountApprChqCnt;
    }

    /**
     * Sets the value of the outRetDepositAccountApprChqCnt property.
     * 
     */
    public void setOutRetDepositAccountApprChqCnt(int value) {
        this.outRetDepositAccountApprChqCnt = value;
    }

    /**
     * Gets the value of the outRetDepositAccountApprChqEdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountApprChqEdate() {
        return outRetDepositAccountApprChqEdate;
    }

    /**
     * Sets the value of the outRetDepositAccountApprChqEdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountApprChqEdate(XMLGregorianCalendar value) {
        this.outRetDepositAccountApprChqEdate = value;
    }

    /**
     * Gets the value of the outRetDepositAccountApprChqNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountApprChqNo() {
        return outRetDepositAccountApprChqNo;
    }

    /**
     * Sets the value of the outRetDepositAccountApprChqNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountApprChqNo(String value) {
        this.outRetDepositAccountApprChqNo = value;
    }

    /**
     * Gets the value of the outRetDepositAccountApprChqPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountApprChqPerc() {
        return outRetDepositAccountApprChqPerc;
    }

    /**
     * Sets the value of the outRetDepositAccountApprChqPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountApprChqPerc(BigDecimal value) {
        this.outRetDepositAccountApprChqPerc = value;
    }

    /**
     * Gets the value of the outRetDepositAccountAtmCardFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountAtmCardFlag() {
        return outRetDepositAccountAtmCardFlag;
    }

    /**
     * Sets the value of the outRetDepositAccountAtmCardFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountAtmCardFlag(String value) {
        this.outRetDepositAccountAtmCardFlag = value;
    }

    /**
     * Gets the value of the outRetDepositAccountAutomChequeOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountAutomChequeOrder() {
        return outRetDepositAccountAutomChequeOrder;
    }

    /**
     * Sets the value of the outRetDepositAccountAutomChequeOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountAutomChequeOrder(String value) {
        this.outRetDepositAccountAutomChequeOrder = value;
    }

    /**
     * Gets the value of the outRetDepositAccountAvailableBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountAvailableBalance() {
        return outRetDepositAccountAvailableBalance;
    }

    /**
     * Sets the value of the outRetDepositAccountAvailableBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountAvailableBalance(BigDecimal value) {
        this.outRetDepositAccountAvailableBalance = value;
    }

    /**
     * Gets the value of the outRetDepositAccountBackValeurDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountBackValeurDt() {
        return outRetDepositAccountBackValeurDt;
    }

    /**
     * Sets the value of the outRetDepositAccountBackValeurDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountBackValeurDt(XMLGregorianCalendar value) {
        this.outRetDepositAccountBackValeurDt = value;
    }

    /**
     * Gets the value of the outRetDepositAccountBalanceInterFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountBalanceInterFlag() {
        return outRetDepositAccountBalanceInterFlag;
    }

    /**
     * Sets the value of the outRetDepositAccountBalanceInterFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountBalanceInterFlag(String value) {
        this.outRetDepositAccountBalanceInterFlag = value;
    }

    /**
     * Gets the value of the outRetDepositAccountBenefAddressSn property.
     * 
     */
    public short getOutRetDepositAccountBenefAddressSn() {
        return outRetDepositAccountBenefAddressSn;
    }

    /**
     * Sets the value of the outRetDepositAccountBenefAddressSn property.
     * 
     */
    public void setOutRetDepositAccountBenefAddressSn(short value) {
        this.outRetDepositAccountBenefAddressSn = value;
    }

    /**
     * Gets the value of the outRetDepositAccountBlncBefOverdrn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountBlncBefOverdrn() {
        return outRetDepositAccountBlncBefOverdrn;
    }

    /**
     * Sets the value of the outRetDepositAccountBlncBefOverdrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountBlncBefOverdrn(BigDecimal value) {
        this.outRetDepositAccountBlncBefOverdrn = value;
    }

    /**
     * Gets the value of the outRetDepositAccountBlockedBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountBlockedBalance() {
        return outRetDepositAccountBlockedBalance;
    }

    /**
     * Sets the value of the outRetDepositAccountBlockedBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountBlockedBalance(BigDecimal value) {
        this.outRetDepositAccountBlockedBalance = value;
    }

    /**
     * Gets the value of the outRetDepositAccountBlockedStsExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountBlockedStsExpiry() {
        return outRetDepositAccountBlockedStsExpiry;
    }

    /**
     * Sets the value of the outRetDepositAccountBlockedStsExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountBlockedStsExpiry(XMLGregorianCalendar value) {
        this.outRetDepositAccountBlockedStsExpiry = value;
    }

    /**
     * Gets the value of the outRetDepositAccountBoePercentance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountBoePercentance() {
        return outRetDepositAccountBoePercentance;
    }

    /**
     * Sets the value of the outRetDepositAccountBoePercentance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountBoePercentance(BigDecimal value) {
        this.outRetDepositAccountBoePercentance = value;
    }

    /**
     * Gets the value of the outRetDepositAccountBoeSpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountBoeSpread() {
        return outRetDepositAccountBoeSpread;
    }

    /**
     * Sets the value of the outRetDepositAccountBoeSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountBoeSpread(BigDecimal value) {
        this.outRetDepositAccountBoeSpread = value;
    }

    /**
     * Gets the value of the outRetDepositAccountBondNumber property.
     * 
     */
    public double getOutRetDepositAccountBondNumber() {
        return outRetDepositAccountBondNumber;
    }

    /**
     * Sets the value of the outRetDepositAccountBondNumber property.
     * 
     */
    public void setOutRetDepositAccountBondNumber(double value) {
        this.outRetDepositAccountBondNumber = value;
    }

    /**
     * Gets the value of the outRetDepositAccountBookBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountBookBalance() {
        return outRetDepositAccountBookBalance;
    }

    /**
     * Sets the value of the outRetDepositAccountBookBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountBookBalance(BigDecimal value) {
        this.outRetDepositAccountBookBalance = value;
    }

    /**
     * Gets the value of the outRetDepositAccountBookNo property.
     * 
     */
    public int getOutRetDepositAccountBookNo() {
        return outRetDepositAccountBookNo;
    }

    /**
     * Sets the value of the outRetDepositAccountBookNo property.
     * 
     */
    public void setOutRetDepositAccountBookNo(int value) {
        this.outRetDepositAccountBookNo = value;
    }

    /**
     * Gets the value of the outRetDepositAccountCDigit property.
     * 
     */
    public short getOutRetDepositAccountCDigit() {
        return outRetDepositAccountCDigit;
    }

    /**
     * Sets the value of the outRetDepositAccountCDigit property.
     * 
     */
    public void setOutRetDepositAccountCDigit(short value) {
        this.outRetDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the outRetDepositAccountCapIncreaseAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountCapIncreaseAmn() {
        return outRetDepositAccountCapIncreaseAmn;
    }

    /**
     * Sets the value of the outRetDepositAccountCapIncreaseAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountCapIncreaseAmn(BigDecimal value) {
        this.outRetDepositAccountCapIncreaseAmn = value;
    }

    /**
     * Gets the value of the outRetDepositAccountChequeBookFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountChequeBookFlag() {
        return outRetDepositAccountChequeBookFlag;
    }

    /**
     * Sets the value of the outRetDepositAccountChequeBookFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountChequeBookFlag(String value) {
        this.outRetDepositAccountChequeBookFlag = value;
    }

    /**
     * Gets the value of the outRetDepositAccountChequeBooksCount property.
     * 
     */
    public int getOutRetDepositAccountChequeBooksCount() {
        return outRetDepositAccountChequeBooksCount;
    }

    /**
     * Sets the value of the outRetDepositAccountChequeBooksCount property.
     * 
     */
    public void setOutRetDepositAccountChequeBooksCount(int value) {
        this.outRetDepositAccountChequeBooksCount = value;
    }

    /**
     * Gets the value of the outRetDepositAccountChequeOrderedCnt property.
     * 
     */
    public double getOutRetDepositAccountChequeOrderedCnt() {
        return outRetDepositAccountChequeOrderedCnt;
    }

    /**
     * Sets the value of the outRetDepositAccountChequeOrderedCnt property.
     * 
     */
    public void setOutRetDepositAccountChequeOrderedCnt(double value) {
        this.outRetDepositAccountChequeOrderedCnt = value;
    }

    /**
     * Gets the value of the outRetDepositAccountChequesBadCount property.
     * 
     */
    public int getOutRetDepositAccountChequesBadCount() {
        return outRetDepositAccountChequesBadCount;
    }

    /**
     * Sets the value of the outRetDepositAccountChequesBadCount property.
     * 
     */
    public void setOutRetDepositAccountChequesBadCount(int value) {
        this.outRetDepositAccountChequesBadCount = value;
    }

    /**
     * Gets the value of the outRetDepositAccountChequesBadTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountChequesBadTotal() {
        return outRetDepositAccountChequesBadTotal;
    }

    /**
     * Sets the value of the outRetDepositAccountChequesBadTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountChequesBadTotal(BigDecimal value) {
        this.outRetDepositAccountChequesBadTotal = value;
    }

    /**
     * Gets the value of the outRetDepositAccountChequesCancCount property.
     * 
     */
    public int getOutRetDepositAccountChequesCancCount() {
        return outRetDepositAccountChequesCancCount;
    }

    /**
     * Sets the value of the outRetDepositAccountChequesCancCount property.
     * 
     */
    public void setOutRetDepositAccountChequesCancCount(int value) {
        this.outRetDepositAccountChequesCancCount = value;
    }

    /**
     * Gets the value of the outRetDepositAccountChequesItemCount property.
     * 
     */
    public int getOutRetDepositAccountChequesItemCount() {
        return outRetDepositAccountChequesItemCount;
    }

    /**
     * Sets the value of the outRetDepositAccountChequesItemCount property.
     * 
     */
    public void setOutRetDepositAccountChequesItemCount(int value) {
        this.outRetDepositAccountChequesItemCount = value;
    }

    /**
     * Gets the value of the outRetDepositAccountChequesLostCount property.
     * 
     */
    public int getOutRetDepositAccountChequesLostCount() {
        return outRetDepositAccountChequesLostCount;
    }

    /**
     * Sets the value of the outRetDepositAccountChequesLostCount property.
     * 
     */
    public void setOutRetDepositAccountChequesLostCount(int value) {
        this.outRetDepositAccountChequesLostCount = value;
    }

    /**
     * Gets the value of the outRetDepositAccountChequesPaidCount property.
     * 
     */
    public int getOutRetDepositAccountChequesPaidCount() {
        return outRetDepositAccountChequesPaidCount;
    }

    /**
     * Sets the value of the outRetDepositAccountChequesPaidCount property.
     * 
     */
    public void setOutRetDepositAccountChequesPaidCount(int value) {
        this.outRetDepositAccountChequesPaidCount = value;
    }

    /**
     * Gets the value of the outRetDepositAccountChequesStampCoun property.
     * 
     */
    public int getOutRetDepositAccountChequesStampCoun() {
        return outRetDepositAccountChequesStampCoun;
    }

    /**
     * Sets the value of the outRetDepositAccountChequesStampCoun property.
     * 
     */
    public void setOutRetDepositAccountChequesStampCoun(int value) {
        this.outRetDepositAccountChequesStampCoun = value;
    }

    /**
     * Gets the value of the outRetDepositAccountChequesSteaCount property.
     * 
     */
    public int getOutRetDepositAccountChequesSteaCount() {
        return outRetDepositAccountChequesSteaCount;
    }

    /**
     * Sets the value of the outRetDepositAccountChequesSteaCount property.
     * 
     */
    public void setOutRetDepositAccountChequesSteaCount(int value) {
        this.outRetDepositAccountChequesSteaCount = value;
    }

    /**
     * Gets the value of the outRetDepositAccountChequesStopCount property.
     * 
     */
    public int getOutRetDepositAccountChequesStopCount() {
        return outRetDepositAccountChequesStopCount;
    }

    /**
     * Sets the value of the outRetDepositAccountChequesStopCount property.
     * 
     */
    public void setOutRetDepositAccountChequesStopCount(int value) {
        this.outRetDepositAccountChequesStopCount = value;
    }

    /**
     * Gets the value of the outRetDepositAccountChequesUsedCount property.
     * 
     */
    public int getOutRetDepositAccountChequesUsedCount() {
        return outRetDepositAccountChequesUsedCount;
    }

    /**
     * Sets the value of the outRetDepositAccountChequesUsedCount property.
     * 
     */
    public void setOutRetDepositAccountChequesUsedCount(int value) {
        this.outRetDepositAccountChequesUsedCount = value;
    }

    /**
     * Gets the value of the outRetDepositAccountClosingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountClosingDate() {
        return outRetDepositAccountClosingDate;
    }

    /**
     * Sets the value of the outRetDepositAccountClosingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountClosingDate(XMLGregorianCalendar value) {
        this.outRetDepositAccountClosingDate = value;
    }

    /**
     * Gets the value of the outRetDepositAccountClosingTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountClosingTotal() {
        return outRetDepositAccountClosingTotal;
    }

    /**
     * Sets the value of the outRetDepositAccountClosingTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountClosingTotal(BigDecimal value) {
        this.outRetDepositAccountClosingTotal = value;
    }

    /**
     * Gets the value of the outRetDepositAccountCobenefCount property.
     * 
     */
    public short getOutRetDepositAccountCobenefCount() {
        return outRetDepositAccountCobenefCount;
    }

    /**
     * Sets the value of the outRetDepositAccountCobenefCount property.
     * 
     */
    public void setOutRetDepositAccountCobenefCount(short value) {
        this.outRetDepositAccountCobenefCount = value;
    }

    /**
     * Gets the value of the outRetDepositAccountCobenefCountIns property.
     * 
     */
    public short getOutRetDepositAccountCobenefCountIns() {
        return outRetDepositAccountCobenefCountIns;
    }

    /**
     * Sets the value of the outRetDepositAccountCobenefCountIns property.
     * 
     */
    public void setOutRetDepositAccountCobenefCountIns(short value) {
        this.outRetDepositAccountCobenefCountIns = value;
    }

    /**
     * Gets the value of the outRetDepositAccountCobenefSnMail property.
     * 
     */
    public short getOutRetDepositAccountCobenefSnMail() {
        return outRetDepositAccountCobenefSnMail;
    }

    /**
     * Sets the value of the outRetDepositAccountCobenefSnMail property.
     * 
     */
    public void setOutRetDepositAccountCobenefSnMail(short value) {
        this.outRetDepositAccountCobenefSnMail = value;
    }

    /**
     * Gets the value of the outRetDepositAccountColInsertionDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountColInsertionDt() {
        return outRetDepositAccountColInsertionDt;
    }

    /**
     * Sets the value of the outRetDepositAccountColInsertionDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountColInsertionDt(XMLGregorianCalendar value) {
        this.outRetDepositAccountColInsertionDt = value;
    }

    /**
     * Gets the value of the outRetDepositAccountCollateralFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountCollateralFlg() {
        return outRetDepositAccountCollateralFlg;
    }

    /**
     * Sets the value of the outRetDepositAccountCollateralFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountCollateralFlg(String value) {
        this.outRetDepositAccountCollateralFlg = value;
    }

    /**
     * Gets the value of the outRetDepositAccountCorrChqDetail1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountCorrChqDetail1() {
        return outRetDepositAccountCorrChqDetail1;
    }

    /**
     * Sets the value of the outRetDepositAccountCorrChqDetail1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountCorrChqDetail1(String value) {
        this.outRetDepositAccountCorrChqDetail1 = value;
    }

    /**
     * Gets the value of the outRetDepositAccountCorrChqDetail2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountCorrChqDetail2() {
        return outRetDepositAccountCorrChqDetail2;
    }

    /**
     * Sets the value of the outRetDepositAccountCorrChqDetail2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountCorrChqDetail2(String value) {
        this.outRetDepositAccountCorrChqDetail2 = value;
    }

    /**
     * Gets the value of the outRetDepositAccountCorrespAccInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountCorrespAccInd() {
        return outRetDepositAccountCorrespAccInd;
    }

    /**
     * Sets the value of the outRetDepositAccountCorrespAccInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountCorrespAccInd(String value) {
        this.outRetDepositAccountCorrespAccInd = value;
    }

    /**
     * Gets the value of the outRetDepositAccountCrIntRtSprdInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountCrIntRtSprdInd() {
        return outRetDepositAccountCrIntRtSprdInd;
    }

    /**
     * Sets the value of the outRetDepositAccountCrIntRtSprdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountCrIntRtSprdInd(String value) {
        this.outRetDepositAccountCrIntRtSprdInd = value;
    }

    /**
     * Gets the value of the outRetDepositAccountCrInterRateSpr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountCrInterRateSpr() {
        return outRetDepositAccountCrInterRateSpr;
    }

    /**
     * Sets the value of the outRetDepositAccountCrInterRateSpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountCrInterRateSpr(BigDecimal value) {
        this.outRetDepositAccountCrInterRateSpr = value;
    }

    /**
     * Gets the value of the outRetDepositAccountCustPerMFAllow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountCustPerMFAllow() {
        return outRetDepositAccountCustPerMFAllow;
    }

    /**
     * Sets the value of the outRetDepositAccountCustPerMFAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountCustPerMFAllow(String value) {
        this.outRetDepositAccountCustPerMFAllow = value;
    }

    /**
     * Gets the value of the outRetDepositAccountDateSinceOverdrn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountDateSinceOverdrn() {
        return outRetDepositAccountDateSinceOverdrn;
    }

    /**
     * Sets the value of the outRetDepositAccountDateSinceOverdrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountDateSinceOverdrn(XMLGregorianCalendar value) {
        this.outRetDepositAccountDateSinceOverdrn = value;
    }

    /**
     * Gets the value of the outRetDepositAccountDbIntRtSprdInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountDbIntRtSprdInd() {
        return outRetDepositAccountDbIntRtSprdInd;
    }

    /**
     * Sets the value of the outRetDepositAccountDbIntRtSprdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountDbIntRtSprdInd(String value) {
        this.outRetDepositAccountDbIntRtSprdInd = value;
    }

    /**
     * Gets the value of the outRetDepositAccountDbInterAccNext property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountDbInterAccNext() {
        return outRetDepositAccountDbInterAccNext;
    }

    /**
     * Sets the value of the outRetDepositAccountDbInterAccNext property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountDbInterAccNext(XMLGregorianCalendar value) {
        this.outRetDepositAccountDbInterAccNext = value;
    }

    /**
     * Gets the value of the outRetDepositAccountDbInterRateSpr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountDbInterRateSpr() {
        return outRetDepositAccountDbInterRateSpr;
    }

    /**
     * Sets the value of the outRetDepositAccountDbInterRateSpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountDbInterRateSpr(BigDecimal value) {
        this.outRetDepositAccountDbInterRateSpr = value;
    }

    /**
     * Gets the value of the outRetDepositAccountDbProgressInter property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountDbProgressInter() {
        return outRetDepositAccountDbProgressInter;
    }

    /**
     * Sets the value of the outRetDepositAccountDbProgressInter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountDbProgressInter(BigDecimal value) {
        this.outRetDepositAccountDbProgressInter = value;
    }

    /**
     * Gets the value of the outRetDepositAccountDbTransitIntTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountDbTransitIntTax() {
        return outRetDepositAccountDbTransitIntTax;
    }

    /**
     * Sets the value of the outRetDepositAccountDbTransitIntTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountDbTransitIntTax(BigDecimal value) {
        this.outRetDepositAccountDbTransitIntTax = value;
    }

    /**
     * Gets the value of the outRetDepositAccountDbTransitionInte property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountDbTransitionInte() {
        return outRetDepositAccountDbTransitionInte;
    }

    /**
     * Sets the value of the outRetDepositAccountDbTransitionInte property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountDbTransitionInte(BigDecimal value) {
        this.outRetDepositAccountDbTransitionInte = value;
    }

    /**
     * Gets the value of the outRetDepositAccountDefiniteDelay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountDefiniteDelay() {
        return outRetDepositAccountDefiniteDelay;
    }

    /**
     * Sets the value of the outRetDepositAccountDefiniteDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountDefiniteDelay(String value) {
        this.outRetDepositAccountDefiniteDelay = value;
    }

    /**
     * Gets the value of the outRetDepositAccountDepositType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountDepositType() {
        return outRetDepositAccountDepositType;
    }

    /**
     * Sets the value of the outRetDepositAccountDepositType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountDepositType(String value) {
        this.outRetDepositAccountDepositType = value;
    }

    /**
     * Gets the value of the outRetDepositAccountDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountDesignation() {
        return outRetDepositAccountDesignation;
    }

    /**
     * Sets the value of the outRetDepositAccountDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountDesignation(String value) {
        this.outRetDepositAccountDesignation = value;
    }

    /**
     * Gets the value of the outRetDepositAccountDrawDownWxpDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountDrawDownWxpDate() {
        return outRetDepositAccountDrawDownWxpDate;
    }

    /**
     * Sets the value of the outRetDepositAccountDrawDownWxpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountDrawDownWxpDate(XMLGregorianCalendar value) {
        this.outRetDepositAccountDrawDownWxpDate = value;
    }

    /**
     * Gets the value of the outRetDepositAccountDurationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountDurationUnit() {
        return outRetDepositAccountDurationUnit;
    }

    /**
     * Sets the value of the outRetDepositAccountDurationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountDurationUnit(String value) {
        this.outRetDepositAccountDurationUnit = value;
    }

    /**
     * Gets the value of the outRetDepositAccountDurationValue property.
     * 
     */
    public short getOutRetDepositAccountDurationValue() {
        return outRetDepositAccountDurationValue;
    }

    /**
     * Sets the value of the outRetDepositAccountDurationValue property.
     * 
     */
    public void setOutRetDepositAccountDurationValue(short value) {
        this.outRetDepositAccountDurationValue = value;
    }

    /**
     * Gets the value of the outRetDepositAccountEncroachTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountEncroachTolerance() {
        return outRetDepositAccountEncroachTolerance;
    }

    /**
     * Sets the value of the outRetDepositAccountEncroachTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountEncroachTolerance(BigDecimal value) {
        this.outRetDepositAccountEncroachTolerance = value;
    }

    /**
     * Gets the value of the outRetDepositAccountEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountEntryStatus() {
        return outRetDepositAccountEntryStatus;
    }

    /**
     * Sets the value of the outRetDepositAccountEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountEntryStatus(String value) {
        this.outRetDepositAccountEntryStatus = value;
    }

    /**
     * Gets the value of the outRetDepositAccountExpCrIntSprd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountExpCrIntSprd() {
        return outRetDepositAccountExpCrIntSprd;
    }

    /**
     * Sets the value of the outRetDepositAccountExpCrIntSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountExpCrIntSprd(XMLGregorianCalendar value) {
        this.outRetDepositAccountExpCrIntSprd = value;
    }

    /**
     * Gets the value of the outRetDepositAccountExpDbIntSprd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountExpDbIntSprd() {
        return outRetDepositAccountExpDbIntSprd;
    }

    /**
     * Sets the value of the outRetDepositAccountExpDbIntSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountExpDbIntSprd(XMLGregorianCalendar value) {
        this.outRetDepositAccountExpDbIntSprd = value;
    }

    /**
     * Gets the value of the outRetDepositAccountExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountExpiryDate() {
        return outRetDepositAccountExpiryDate;
    }

    /**
     * Sets the value of the outRetDepositAccountExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountExpiryDate(XMLGregorianCalendar value) {
        this.outRetDepositAccountExpiryDate = value;
    }

    /**
     * Gets the value of the outRetDepositAccountExpiryDateTd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountExpiryDateTd() {
        return outRetDepositAccountExpiryDateTd;
    }

    /**
     * Sets the value of the outRetDepositAccountExpiryDateTd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountExpiryDateTd(XMLGregorianCalendar value) {
        this.outRetDepositAccountExpiryDateTd = value;
    }

    /**
     * Gets the value of the outRetDepositAccountExternalAccFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountExternalAccFlag() {
        return outRetDepositAccountExternalAccFlag;
    }

    /**
     * Sets the value of the outRetDepositAccountExternalAccFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountExternalAccFlag(String value) {
        this.outRetDepositAccountExternalAccFlag = value;
    }

    /**
     * Gets the value of the outRetDepositAccountExtraitPrintDay property.
     * 
     */
    public short getOutRetDepositAccountExtraitPrintDay() {
        return outRetDepositAccountExtraitPrintDay;
    }

    /**
     * Sets the value of the outRetDepositAccountExtraitPrintDay property.
     * 
     */
    public void setOutRetDepositAccountExtraitPrintDay(short value) {
        this.outRetDepositAccountExtraitPrintDay = value;
    }

    /**
     * Gets the value of the outRetDepositAccountExtraitTrxCount property.
     * 
     */
    public int getOutRetDepositAccountExtraitTrxCount() {
        return outRetDepositAccountExtraitTrxCount;
    }

    /**
     * Sets the value of the outRetDepositAccountExtraitTrxCount property.
     * 
     */
    public void setOutRetDepositAccountExtraitTrxCount(int value) {
        this.outRetDepositAccountExtraitTrxCount = value;
    }

    /**
     * Gets the value of the outRetDepositAccountFcInterLcPrim property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountFcInterLcPrim() {
        return outRetDepositAccountFcInterLcPrim;
    }

    /**
     * Sets the value of the outRetDepositAccountFcInterLcPrim property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountFcInterLcPrim(BigDecimal value) {
        this.outRetDepositAccountFcInterLcPrim = value;
    }

    /**
     * Gets the value of the outRetDepositAccountFcInterestLcFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountFcInterestLcFlg() {
        return outRetDepositAccountFcInterestLcFlg;
    }

    /**
     * Sets the value of the outRetDepositAccountFcInterestLcFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountFcInterestLcFlg(String value) {
        this.outRetDepositAccountFcInterestLcFlg = value;
    }

    /**
     * Gets the value of the outRetDepositAccountFcInterestLcNet property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountFcInterestLcNet() {
        return outRetDepositAccountFcInterestLcNet;
    }

    /**
     * Sets the value of the outRetDepositAccountFcInterestLcNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountFcInterestLcNet(BigDecimal value) {
        this.outRetDepositAccountFcInterestLcNet = value;
    }

    /**
     * Gets the value of the outRetDepositAccountFinalWhldTaxFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountFinalWhldTaxFlg() {
        return outRetDepositAccountFinalWhldTaxFlg;
    }

    /**
     * Sets the value of the outRetDepositAccountFinalWhldTaxFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountFinalWhldTaxFlg(String value) {
        this.outRetDepositAccountFinalWhldTaxFlg = value;
    }

    /**
     * Gets the value of the outRetDepositAccountFixedInterFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountFixedInterFlag() {
        return outRetDepositAccountFixedInterFlag;
    }

    /**
     * Sets the value of the outRetDepositAccountFixedInterFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountFixedInterFlag(String value) {
        this.outRetDepositAccountFixedInterFlag = value;
    }

    /**
     * Gets the value of the outRetDepositAccountFixedInterRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountFixedInterRate() {
        return outRetDepositAccountFixedInterRate;
    }

    /**
     * Sets the value of the outRetDepositAccountFixedInterRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountFixedInterRate(BigDecimal value) {
        this.outRetDepositAccountFixedInterRate = value;
    }

    /**
     * Gets the value of the outRetDepositAccountForecastBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountForecastBalance() {
        return outRetDepositAccountForecastBalance;
    }

    /**
     * Sets the value of the outRetDepositAccountForecastBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountForecastBalance(BigDecimal value) {
        this.outRetDepositAccountForecastBalance = value;
    }

    /**
     * Gets the value of the outRetDepositAccountGlAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountGlAccount() {
        return outRetDepositAccountGlAccount;
    }

    /**
     * Sets the value of the outRetDepositAccountGlAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountGlAccount(String value) {
        this.outRetDepositAccountGlAccount = value;
    }

    /**
     * Gets the value of the outRetDepositAccountGlAccountLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountGlAccountLevel() {
        return outRetDepositAccountGlAccountLevel;
    }

    /**
     * Sets the value of the outRetDepositAccountGlAccountLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountGlAccountLevel(String value) {
        this.outRetDepositAccountGlAccountLevel = value;
    }

    /**
     * Gets the value of the outRetDepositAccountHomeBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountHomeBranch() {
        return outRetDepositAccountHomeBranch;
    }

    /**
     * Sets the value of the outRetDepositAccountHomeBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountHomeBranch(String value) {
        this.outRetDepositAccountHomeBranch = value;
    }

    /**
     * Gets the value of the outRetDepositAccountIncomeAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountIncomeAmnt() {
        return outRetDepositAccountIncomeAmnt;
    }

    /**
     * Sets the value of the outRetDepositAccountIncomeAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountIncomeAmnt(BigDecimal value) {
        this.outRetDepositAccountIncomeAmnt = value;
    }

    /**
     * Gets the value of the outRetDepositAccountIncomeFrequency property.
     * 
     */
    public int getOutRetDepositAccountIncomeFrequency() {
        return outRetDepositAccountIncomeFrequency;
    }

    /**
     * Sets the value of the outRetDepositAccountIncomeFrequency property.
     * 
     */
    public void setOutRetDepositAccountIncomeFrequency(int value) {
        this.outRetDepositAccountIncomeFrequency = value;
    }

    /**
     * Gets the value of the outRetDepositAccountInitCrBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountInitCrBalance() {
        return outRetDepositAccountInitCrBalance;
    }

    /**
     * Sets the value of the outRetDepositAccountInitCrBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountInitCrBalance(BigDecimal value) {
        this.outRetDepositAccountInitCrBalance = value;
    }

    /**
     * Gets the value of the outRetDepositAccountInitDbBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountInitDbBalance() {
        return outRetDepositAccountInitDbBalance;
    }

    /**
     * Sets the value of the outRetDepositAccountInitDbBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountInitDbBalance(BigDecimal value) {
        this.outRetDepositAccountInitDbBalance = value;
    }

    /**
     * Gets the value of the outRetDepositAccountInitValueBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountInitValueBalance() {
        return outRetDepositAccountInitValueBalance;
    }

    /**
     * Sets the value of the outRetDepositAccountInitValueBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountInitValueBalance(BigDecimal value) {
        this.outRetDepositAccountInitValueBalance = value;
    }

    /**
     * Gets the value of the outRetDepositAccountInspectionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountInspectionDate() {
        return outRetDepositAccountInspectionDate;
    }

    /**
     * Sets the value of the outRetDepositAccountInspectionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountInspectionDate(XMLGregorianCalendar value) {
        this.outRetDepositAccountInspectionDate = value;
    }

    /**
     * Gets the value of the outRetDepositAccountInterPayOptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountInterPayOptions() {
        return outRetDepositAccountInterPayOptions;
    }

    /**
     * Sets the value of the outRetDepositAccountInterPayOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountInterPayOptions(String value) {
        this.outRetDepositAccountInterPayOptions = value;
    }

    /**
     * Gets the value of the outRetDepositAccountInterestPayInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountInterestPayInd() {
        return outRetDepositAccountInterestPayInd;
    }

    /**
     * Sets the value of the outRetDepositAccountInterestPayInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountInterestPayInd(String value) {
        this.outRetDepositAccountInterestPayInd = value;
    }

    /**
     * Gets the value of the outRetDepositAccountInterestToWithdr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountInterestToWithdr() {
        return outRetDepositAccountInterestToWithdr;
    }

    /**
     * Sets the value of the outRetDepositAccountInterestToWithdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountInterestToWithdr(BigDecimal value) {
        this.outRetDepositAccountInterestToWithdr = value;
    }

    /**
     * Gets the value of the outRetDepositAccountInvestFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountInvestFlag() {
        return outRetDepositAccountInvestFlag;
    }

    /**
     * Sets the value of the outRetDepositAccountInvestFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountInvestFlag(String value) {
        this.outRetDepositAccountInvestFlag = value;
    }

    /**
     * Gets the value of the outRetDepositAccountKadFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountKadFlg() {
        return outRetDepositAccountKadFlg;
    }

    /**
     * Sets the value of the outRetDepositAccountKadFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountKadFlg(String value) {
        this.outRetDepositAccountKadFlg = value;
    }

    /**
     * Gets the value of the outRetDepositAccountLastBadCheqDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountLastBadCheqDate() {
        return outRetDepositAccountLastBadCheqDate;
    }

    /**
     * Sets the value of the outRetDepositAccountLastBadCheqDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountLastBadCheqDate(XMLGregorianCalendar value) {
        this.outRetDepositAccountLastBadCheqDate = value;
    }

    /**
     * Gets the value of the outRetDepositAccountLastBatchDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountLastBatchDate() {
        return outRetDepositAccountLastBatchDate;
    }

    /**
     * Sets the value of the outRetDepositAccountLastBatchDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountLastBatchDate(XMLGregorianCalendar value) {
        this.outRetDepositAccountLastBatchDate = value;
    }

    /**
     * Gets the value of the outRetDepositAccountLastInactiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountLastInactiveDate() {
        return outRetDepositAccountLastInactiveDate;
    }

    /**
     * Sets the value of the outRetDepositAccountLastInactiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountLastInactiveDate(XMLGregorianCalendar value) {
        this.outRetDepositAccountLastInactiveDate = value;
    }

    /**
     * Gets the value of the outRetDepositAccountLastIntAvgBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountLastIntAvgBalance() {
        return outRetDepositAccountLastIntAvgBalance;
    }

    /**
     * Sets the value of the outRetDepositAccountLastIntAvgBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountLastIntAvgBalance(BigDecimal value) {
        this.outRetDepositAccountLastIntAvgBalance = value;
    }

    /**
     * Gets the value of the outRetDepositAccountLastIntAvgCr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountLastIntAvgCr() {
        return outRetDepositAccountLastIntAvgCr;
    }

    /**
     * Sets the value of the outRetDepositAccountLastIntAvgCr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountLastIntAvgCr(BigDecimal value) {
        this.outRetDepositAccountLastIntAvgCr = value;
    }

    /**
     * Gets the value of the outRetDepositAccountLastIntAvgDb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountLastIntAvgDb() {
        return outRetDepositAccountLastIntAvgDb;
    }

    /**
     * Sets the value of the outRetDepositAccountLastIntAvgDb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountLastIntAvgDb(BigDecimal value) {
        this.outRetDepositAccountLastIntAvgDb = value;
    }

    /**
     * Gets the value of the outRetDepositAccountLastIntChangDat property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountLastIntChangDat() {
        return outRetDepositAccountLastIntChangDat;
    }

    /**
     * Sets the value of the outRetDepositAccountLastIntChangDat property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountLastIntChangDat(XMLGregorianCalendar value) {
        this.outRetDepositAccountLastIntChangDat = value;
    }

    /**
     * Gets the value of the outRetDepositAccountLastMaxUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountLastMaxUpdateDate() {
        return outRetDepositAccountLastMaxUpdateDate;
    }

    /**
     * Sets the value of the outRetDepositAccountLastMaxUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountLastMaxUpdateDate(XMLGregorianCalendar value) {
        this.outRetDepositAccountLastMaxUpdateDate = value;
    }

    /**
     * Gets the value of the outRetDepositAccountLastModifyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountLastModifyDate() {
        return outRetDepositAccountLastModifyDate;
    }

    /**
     * Sets the value of the outRetDepositAccountLastModifyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountLastModifyDate(XMLGregorianCalendar value) {
        this.outRetDepositAccountLastModifyDate = value;
    }

    /**
     * Gets the value of the outRetDepositAccountLastPsbPrint property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountLastPsbPrint() {
        return outRetDepositAccountLastPsbPrint;
    }

    /**
     * Sets the value of the outRetDepositAccountLastPsbPrint property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountLastPsbPrint(XMLGregorianCalendar value) {
        this.outRetDepositAccountLastPsbPrint = value;
    }

    /**
     * Gets the value of the outRetDepositAccountLastTdTrxId property.
     * 
     */
    public int getOutRetDepositAccountLastTdTrxId() {
        return outRetDepositAccountLastTdTrxId;
    }

    /**
     * Sets the value of the outRetDepositAccountLastTdTrxId property.
     * 
     */
    public void setOutRetDepositAccountLastTdTrxId(int value) {
        this.outRetDepositAccountLastTdTrxId = value;
    }

    /**
     * Gets the value of the outRetDepositAccountLastTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountLastTrxDate() {
        return outRetDepositAccountLastTrxDate;
    }

    /**
     * Sets the value of the outRetDepositAccountLastTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountLastTrxDate(XMLGregorianCalendar value) {
        this.outRetDepositAccountLastTrxDate = value;
    }

    /**
     * Gets the value of the outRetDepositAccountLastTrxId property.
     * 
     */
    public int getOutRetDepositAccountLastTrxId() {
        return outRetDepositAccountLastTrxId;
    }

    /**
     * Sets the value of the outRetDepositAccountLastTrxId property.
     * 
     */
    public void setOutRetDepositAccountLastTrxId(int value) {
        this.outRetDepositAccountLastTrxId = value;
    }

    /**
     * Gets the value of the outRetDepositAccountLstStatementNum property.
     * 
     */
    public int getOutRetDepositAccountLstStatementNum() {
        return outRetDepositAccountLstStatementNum;
    }

    /**
     * Sets the value of the outRetDepositAccountLstStatementNum property.
     * 
     */
    public void setOutRetDepositAccountLstStatementNum(int value) {
        this.outRetDepositAccountLstStatementNum = value;
    }

    /**
     * Gets the value of the outRetDepositAccountManualMigrateFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountManualMigrateFlg() {
        return outRetDepositAccountManualMigrateFlg;
    }

    /**
     * Sets the value of the outRetDepositAccountManualMigrateFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountManualMigrateFlg(String value) {
        this.outRetDepositAccountManualMigrateFlg = value;
    }

    /**
     * Gets the value of the outRetDepositAccountMaxLastDpPer property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountMaxLastDpPer() {
        return outRetDepositAccountMaxLastDpPer;
    }

    /**
     * Sets the value of the outRetDepositAccountMaxLastDpPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountMaxLastDpPer(BigDecimal value) {
        this.outRetDepositAccountMaxLastDpPer = value;
    }

    /**
     * Gets the value of the outRetDepositAccountMaxLastUpdate property.
     * 
     */
    public short getOutRetDepositAccountMaxLastUpdate() {
        return outRetDepositAccountMaxLastUpdate;
    }

    /**
     * Sets the value of the outRetDepositAccountMaxLastUpdate property.
     * 
     */
    public void setOutRetDepositAccountMaxLastUpdate(short value) {
        this.outRetDepositAccountMaxLastUpdate = value;
    }

    /**
     * Gets the value of the outRetDepositAccountMinLastMFPer property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountMinLastMFPer() {
        return outRetDepositAccountMinLastMFPer;
    }

    /**
     * Sets the value of the outRetDepositAccountMinLastMFPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountMinLastMFPer(BigDecimal value) {
        this.outRetDepositAccountMinLastMFPer = value;
    }

    /**
     * Gets the value of the outRetDepositAccountMultiSalaryAmnt property.
     * 
     */
    public short getOutRetDepositAccountMultiSalaryAmnt() {
        return outRetDepositAccountMultiSalaryAmnt;
    }

    /**
     * Sets the value of the outRetDepositAccountMultiSalaryAmnt property.
     * 
     */
    public void setOutRetDepositAccountMultiSalaryAmnt(short value) {
        this.outRetDepositAccountMultiSalaryAmnt = value;
    }

    /**
     * Gets the value of the outRetDepositAccountNostroAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountNostroAccount() {
        return outRetDepositAccountNostroAccount;
    }

    /**
     * Sets the value of the outRetDepositAccountNostroAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountNostroAccount(String value) {
        this.outRetDepositAccountNostroAccount = value;
    }

    /**
     * Gets the value of the outRetDepositAccountNotExpensesFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountNotExpensesFlg() {
        return outRetDepositAccountNotExpensesFlg;
    }

    /**
     * Sets the value of the outRetDepositAccountNotExpensesFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountNotExpensesFlg(String value) {
        this.outRetDepositAccountNotExpensesFlg = value;
    }

    /**
     * Gets the value of the outRetDepositAccountNotifSpreadDayB property.
     * 
     */
    public short getOutRetDepositAccountNotifSpreadDayB() {
        return outRetDepositAccountNotifSpreadDayB;
    }

    /**
     * Sets the value of the outRetDepositAccountNotifSpreadDayB property.
     * 
     */
    public void setOutRetDepositAccountNotifSpreadDayB(short value) {
        this.outRetDepositAccountNotifSpreadDayB = value;
    }

    /**
     * Gets the value of the outRetDepositAccountNotifSpreadDays property.
     * 
     */
    public short getOutRetDepositAccountNotifSpreadDays() {
        return outRetDepositAccountNotifSpreadDays;
    }

    /**
     * Sets the value of the outRetDepositAccountNotifSpreadDays property.
     * 
     */
    public void setOutRetDepositAccountNotifSpreadDays(short value) {
        this.outRetDepositAccountNotifSpreadDays = value;
    }

    /**
     * Gets the value of the outRetDepositAccountOfficeAccFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountOfficeAccFlag() {
        return outRetDepositAccountOfficeAccFlag;
    }

    /**
     * Sets the value of the outRetDepositAccountOfficeAccFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountOfficeAccFlag(String value) {
        this.outRetDepositAccountOfficeAccFlag = value;
    }

    /**
     * Gets the value of the outRetDepositAccountOldAccNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountOldAccNumber() {
        return outRetDepositAccountOldAccNumber;
    }

    /**
     * Sets the value of the outRetDepositAccountOldAccNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountOldAccNumber(String value) {
        this.outRetDepositAccountOldAccNumber = value;
    }

    /**
     * Gets the value of the outRetDepositAccountOpeningBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountOpeningBalance() {
        return outRetDepositAccountOpeningBalance;
    }

    /**
     * Sets the value of the outRetDepositAccountOpeningBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountOpeningBalance(BigDecimal value) {
        this.outRetDepositAccountOpeningBalance = value;
    }

    /**
     * Gets the value of the outRetDepositAccountOpeningDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountOpeningDate() {
        return outRetDepositAccountOpeningDate;
    }

    /**
     * Sets the value of the outRetDepositAccountOpeningDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountOpeningDate(XMLGregorianCalendar value) {
        this.outRetDepositAccountOpeningDate = value;
    }

    /**
     * Gets the value of the outRetDepositAccountOverdraftComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountOverdraftComment() {
        return outRetDepositAccountOverdraftComment;
    }

    /**
     * Sets the value of the outRetDepositAccountOverdraftComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountOverdraftComment(String value) {
        this.outRetDepositAccountOverdraftComment = value;
    }

    /**
     * Gets the value of the outRetDepositAccountOverdraftRenewalFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountOverdraftRenewalFlg() {
        return outRetDepositAccountOverdraftRenewalFlg;
    }

    /**
     * Sets the value of the outRetDepositAccountOverdraftRenewalFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountOverdraftRenewalFlg(String value) {
        this.outRetDepositAccountOverdraftRenewalFlg = value;
    }

    /**
     * Gets the value of the outRetDepositAccountOverdraftSpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountOverdraftSpread() {
        return outRetDepositAccountOverdraftSpread;
    }

    /**
     * Sets the value of the outRetDepositAccountOverdraftSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountOverdraftSpread(BigDecimal value) {
        this.outRetDepositAccountOverdraftSpread = value;
    }

    /**
     * Gets the value of the outRetDepositAccountPassbookFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountPassbookFlag() {
        return outRetDepositAccountPassbookFlag;
    }

    /**
     * Sets the value of the outRetDepositAccountPassbookFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountPassbookFlag(String value) {
        this.outRetDepositAccountPassbookFlag = value;
    }

    /**
     * Gets the value of the outRetDepositAccountPendingExtrLines property.
     * 
     */
    public double getOutRetDepositAccountPendingExtrLines() {
        return outRetDepositAccountPendingExtrLines;
    }

    /**
     * Sets the value of the outRetDepositAccountPendingExtrLines property.
     * 
     */
    public void setOutRetDepositAccountPendingExtrLines(double value) {
        this.outRetDepositAccountPendingExtrLines = value;
    }

    /**
     * Gets the value of the outRetDepositAccountPrevAccountLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountPrevAccountLimit() {
        return outRetDepositAccountPrevAccountLimit;
    }

    /**
     * Sets the value of the outRetDepositAccountPrevAccountLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountPrevAccountLimit(BigDecimal value) {
        this.outRetDepositAccountPrevAccountLimit = value;
    }

    /**
     * Gets the value of the outRetDepositAccountPrevAvailableBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountPrevAvailableBal() {
        return outRetDepositAccountPrevAvailableBal;
    }

    /**
     * Sets the value of the outRetDepositAccountPrevAvailableBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountPrevAvailableBal(BigDecimal value) {
        this.outRetDepositAccountPrevAvailableBal = value;
    }

    /**
     * Gets the value of the outRetDepositAccountPrevBlockedBalan property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountPrevBlockedBalan() {
        return outRetDepositAccountPrevBlockedBalan;
    }

    /**
     * Sets the value of the outRetDepositAccountPrevBlockedBalan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountPrevBlockedBalan(BigDecimal value) {
        this.outRetDepositAccountPrevBlockedBalan = value;
    }

    /**
     * Gets the value of the outRetDepositAccountPrevBookBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountPrevBookBalance() {
        return outRetDepositAccountPrevBookBalance;
    }

    /**
     * Sets the value of the outRetDepositAccountPrevBookBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountPrevBookBalance(BigDecimal value) {
        this.outRetDepositAccountPrevBookBalance = value;
    }

    /**
     * Gets the value of the outRetDepositAccountPrevDateSinceOv property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountPrevDateSinceOv() {
        return outRetDepositAccountPrevDateSinceOv;
    }

    /**
     * Sets the value of the outRetDepositAccountPrevDateSinceOv property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountPrevDateSinceOv(XMLGregorianCalendar value) {
        this.outRetDepositAccountPrevDateSinceOv = value;
    }

    /**
     * Gets the value of the outRetDepositAccountPrevForecastBala property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountPrevForecastBala() {
        return outRetDepositAccountPrevForecastBala;
    }

    /**
     * Sets the value of the outRetDepositAccountPrevForecastBala property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountPrevForecastBala(BigDecimal value) {
        this.outRetDepositAccountPrevForecastBala = value;
    }

    /**
     * Gets the value of the outRetDepositAccountPrevLastTrxId property.
     * 
     */
    public int getOutRetDepositAccountPrevLastTrxId() {
        return outRetDepositAccountPrevLastTrxId;
    }

    /**
     * Sets the value of the outRetDepositAccountPrevLastTrxId property.
     * 
     */
    public void setOutRetDepositAccountPrevLastTrxId(int value) {
        this.outRetDepositAccountPrevLastTrxId = value;
    }

    /**
     * Gets the value of the outRetDepositAccountPrevLstStatement property.
     * 
     */
    public int getOutRetDepositAccountPrevLstStatement() {
        return outRetDepositAccountPrevLstStatement;
    }

    /**
     * Sets the value of the outRetDepositAccountPrevLstStatement property.
     * 
     */
    public void setOutRetDepositAccountPrevLstStatement(int value) {
        this.outRetDepositAccountPrevLstStatement = value;
    }

    /**
     * Gets the value of the outRetDepositAccountPrevPsbLineSn property.
     * 
     */
    public int getOutRetDepositAccountPrevPsbLineSn() {
        return outRetDepositAccountPrevPsbLineSn;
    }

    /**
     * Sets the value of the outRetDepositAccountPrevPsbLineSn property.
     * 
     */
    public void setOutRetDepositAccountPrevPsbLineSn(int value) {
        this.outRetDepositAccountPrevPsbLineSn = value;
    }

    /**
     * Gets the value of the outRetDepositAccountPrevTempExcEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountPrevTempExcEnd() {
        return outRetDepositAccountPrevTempExcEnd;
    }

    /**
     * Sets the value of the outRetDepositAccountPrevTempExcEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountPrevTempExcEnd(XMLGregorianCalendar value) {
        this.outRetDepositAccountPrevTempExcEnd = value;
    }

    /**
     * Gets the value of the outRetDepositAccountPrevTempExcStar property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountPrevTempExcStar() {
        return outRetDepositAccountPrevTempExcStar;
    }

    /**
     * Sets the value of the outRetDepositAccountPrevTempExcStar property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountPrevTempExcStar(XMLGregorianCalendar value) {
        this.outRetDepositAccountPrevTempExcStar = value;
    }

    /**
     * Gets the value of the outRetDepositAccountPrevTemporaryExc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountPrevTemporaryExc() {
        return outRetDepositAccountPrevTemporaryExc;
    }

    /**
     * Sets the value of the outRetDepositAccountPrevTemporaryExc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountPrevTemporaryExc(BigDecimal value) {
        this.outRetDepositAccountPrevTemporaryExc = value;
    }

    /**
     * Gets the value of the outRetDepositAccountPrevUnclearBala property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountPrevUnclearBala() {
        return outRetDepositAccountPrevUnclearBala;
    }

    /**
     * Sets the value of the outRetDepositAccountPrevUnclearBala property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountPrevUnclearBala(BigDecimal value) {
        this.outRetDepositAccountPrevUnclearBala = value;
    }

    /**
     * Gets the value of the outRetDepositAccountPsbLastBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountPsbLastBalance() {
        return outRetDepositAccountPsbLastBalance;
    }

    /**
     * Sets the value of the outRetDepositAccountPsbLastBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountPsbLastBalance(BigDecimal value) {
        this.outRetDepositAccountPsbLastBalance = value;
    }

    /**
     * Gets the value of the outRetDepositAccountPsbLastPrintLn property.
     * 
     */
    public short getOutRetDepositAccountPsbLastPrintLn() {
        return outRetDepositAccountPsbLastPrintLn;
    }

    /**
     * Sets the value of the outRetDepositAccountPsbLastPrintLn property.
     * 
     */
    public void setOutRetDepositAccountPsbLastPrintLn(short value) {
        this.outRetDepositAccountPsbLastPrintLn = value;
    }

    /**
     * Gets the value of the outRetDepositAccountPsbLineSn property.
     * 
     */
    public int getOutRetDepositAccountPsbLineSn() {
        return outRetDepositAccountPsbLineSn;
    }

    /**
     * Sets the value of the outRetDepositAccountPsbLineSn property.
     * 
     */
    public void setOutRetDepositAccountPsbLineSn(int value) {
        this.outRetDepositAccountPsbLineSn = value;
    }

    /**
     * Gets the value of the outRetDepositAccountPsbLostInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountPsbLostInd() {
        return outRetDepositAccountPsbLostInd;
    }

    /**
     * Sets the value of the outRetDepositAccountPsbLostInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountPsbLostInd(String value) {
        this.outRetDepositAccountPsbLostInd = value;
    }

    /**
     * Gets the value of the outRetDepositAccountPsbPendingLines property.
     * 
     */
    public short getOutRetDepositAccountPsbPendingLines() {
        return outRetDepositAccountPsbPendingLines;
    }

    /**
     * Sets the value of the outRetDepositAccountPsbPendingLines property.
     * 
     */
    public void setOutRetDepositAccountPsbPendingLines(short value) {
        this.outRetDepositAccountPsbPendingLines = value;
    }

    /**
     * Gets the value of the outRetDepositAccountPsbSn property.
     * 
     */
    public int getOutRetDepositAccountPsbSn() {
        return outRetDepositAccountPsbSn;
    }

    /**
     * Sets the value of the outRetDepositAccountPsbSn property.
     * 
     */
    public void setOutRetDepositAccountPsbSn(int value) {
        this.outRetDepositAccountPsbSn = value;
    }

    /**
     * Gets the value of the outRetDepositAccountRenewalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountRenewalDate() {
        return outRetDepositAccountRenewalDate;
    }

    /**
     * Sets the value of the outRetDepositAccountRenewalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountRenewalDate(XMLGregorianCalendar value) {
        this.outRetDepositAccountRenewalDate = value;
    }

    /**
     * Gets the value of the outRetDepositAccountRenewalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountRenewalFlag() {
        return outRetDepositAccountRenewalFlag;
    }

    /**
     * Sets the value of the outRetDepositAccountRenewalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountRenewalFlag(String value) {
        this.outRetDepositAccountRenewalFlag = value;
    }

    /**
     * Gets the value of the outRetDepositAccountRenewalNumber property.
     * 
     */
    public int getOutRetDepositAccountRenewalNumber() {
        return outRetDepositAccountRenewalNumber;
    }

    /**
     * Sets the value of the outRetDepositAccountRenewalNumber property.
     * 
     */
    public void setOutRetDepositAccountRenewalNumber(int value) {
        this.outRetDepositAccountRenewalNumber = value;
    }

    /**
     * Gets the value of the outRetDepositAccountRestrictAccFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountRestrictAccFlag() {
        return outRetDepositAccountRestrictAccFlag;
    }

    /**
     * Sets the value of the outRetDepositAccountRestrictAccFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountRestrictAccFlag(String value) {
        this.outRetDepositAccountRestrictAccFlag = value;
    }

    /**
     * Gets the value of the outRetDepositAccountRetainingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountRetainingDate() {
        return outRetDepositAccountRetainingDate;
    }

    /**
     * Sets the value of the outRetDepositAccountRetainingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountRetainingDate(XMLGregorianCalendar value) {
        this.outRetDepositAccountRetainingDate = value;
    }

    /**
     * Gets the value of the outRetDepositAccountSecretAccFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountSecretAccFlag() {
        return outRetDepositAccountSecretAccFlag;
    }

    /**
     * Sets the value of the outRetDepositAccountSecretAccFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountSecretAccFlag(String value) {
        this.outRetDepositAccountSecretAccFlag = value;
    }

    /**
     * Gets the value of the outRetDepositAccountServicePenalSpr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountServicePenalSpr() {
        return outRetDepositAccountServicePenalSpr;
    }

    /**
     * Sets the value of the outRetDepositAccountServicePenalSpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountServicePenalSpr(BigDecimal value) {
        this.outRetDepositAccountServicePenalSpr = value;
    }

    /**
     * Gets the value of the outRetDepositAccountSpecAgrPenFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountSpecAgrPenFlg() {
        return outRetDepositAccountSpecAgrPenFlg;
    }

    /**
     * Sets the value of the outRetDepositAccountSpecAgrPenFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountSpecAgrPenFlg(String value) {
        this.outRetDepositAccountSpecAgrPenFlg = value;
    }

    /**
     * Gets the value of the outRetDepositAccountSpecAgrTrxFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountSpecAgrTrxFlg() {
        return outRetDepositAccountSpecAgrTrxFlg;
    }

    /**
     * Sets the value of the outRetDepositAccountSpecAgrTrxFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountSpecAgrTrxFlg(String value) {
        this.outRetDepositAccountSpecAgrTrxFlg = value;
    }

    /**
     * Gets the value of the outRetDepositAccountSpecialAccFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountSpecialAccFlg() {
        return outRetDepositAccountSpecialAccFlg;
    }

    /**
     * Sets the value of the outRetDepositAccountSpecialAccFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountSpecialAccFlg(String value) {
        this.outRetDepositAccountSpecialAccFlg = value;
    }

    /**
     * Gets the value of the outRetDepositAccountStampAmountTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountStampAmountTotal() {
        return outRetDepositAccountStampAmountTotal;
    }

    /**
     * Sets the value of the outRetDepositAccountStampAmountTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountStampAmountTotal(BigDecimal value) {
        this.outRetDepositAccountStampAmountTotal = value;
    }

    /**
     * Gets the value of the outRetDepositAccountStartDateTd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountStartDateTd() {
        return outRetDepositAccountStartDateTd;
    }

    /**
     * Sets the value of the outRetDepositAccountStartDateTd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountStartDateTd(XMLGregorianCalendar value) {
        this.outRetDepositAccountStartDateTd = value;
    }

    /**
     * Gets the value of the outRetDepositAccountStartWdrBalPrd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountStartWdrBalPrd() {
        return outRetDepositAccountStartWdrBalPrd;
    }

    /**
     * Sets the value of the outRetDepositAccountStartWdrBalPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountStartWdrBalPrd(XMLGregorianCalendar value) {
        this.outRetDepositAccountStartWdrBalPrd = value;
    }

    /**
     * Gets the value of the outRetDepositAccountStatementIssFreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountStatementIssFreq() {
        return outRetDepositAccountStatementIssFreq;
    }

    /**
     * Sets the value of the outRetDepositAccountStatementIssFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountStatementIssFreq(String value) {
        this.outRetDepositAccountStatementIssFreq = value;
    }

    /**
     * Gets the value of the outRetDepositAccountSystemUsageCnt property.
     * 
     */
    public double getOutRetDepositAccountSystemUsageCnt() {
        return outRetDepositAccountSystemUsageCnt;
    }

    /**
     * Sets the value of the outRetDepositAccountSystemUsageCnt property.
     * 
     */
    public void setOutRetDepositAccountSystemUsageCnt(double value) {
        this.outRetDepositAccountSystemUsageCnt = value;
    }

    /**
     * Gets the value of the outRetDepositAccountTargetFlg property.
     * 
     */
    public short getOutRetDepositAccountTargetFlg() {
        return outRetDepositAccountTargetFlg;
    }

    /**
     * Sets the value of the outRetDepositAccountTargetFlg property.
     * 
     */
    public void setOutRetDepositAccountTargetFlg(short value) {
        this.outRetDepositAccountTargetFlg = value;
    }

    /**
     * Gets the value of the outRetDepositAccountTaxExcempFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountTaxExcempFlg() {
        return outRetDepositAccountTaxExcempFlg;
    }

    /**
     * Sets the value of the outRetDepositAccountTaxExcempFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountTaxExcempFlg(String value) {
        this.outRetDepositAccountTaxExcempFlg = value;
    }

    /**
     * Gets the value of the outRetDepositAccountTdBatchExtrtFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountTdBatchExtrtFlg() {
        return outRetDepositAccountTdBatchExtrtFlg;
    }

    /**
     * Sets the value of the outRetDepositAccountTdBatchExtrtFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountTdBatchExtrtFlg(String value) {
        this.outRetDepositAccountTdBatchExtrtFlg = value;
    }

    /**
     * Gets the value of the outRetDepositAccountTdInterPercentChg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountTdInterPercentChg() {
        return outRetDepositAccountTdInterPercentChg;
    }

    /**
     * Sets the value of the outRetDepositAccountTdInterPercentChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountTdInterPercentChg(BigDecimal value) {
        this.outRetDepositAccountTdInterPercentChg = value;
    }

    /**
     * Gets the value of the outRetDepositAccountTdInterSprdChg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountTdInterSprdChg() {
        return outRetDepositAccountTdInterSprdChg;
    }

    /**
     * Sets the value of the outRetDepositAccountTdInterSprdChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountTdInterSprdChg(BigDecimal value) {
        this.outRetDepositAccountTdInterSprdChg = value;
    }

    /**
     * Gets the value of the outRetDepositAccountTelebankingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountTelebankingFlag() {
        return outRetDepositAccountTelebankingFlag;
    }

    /**
     * Sets the value of the outRetDepositAccountTelebankingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountTelebankingFlag(String value) {
        this.outRetDepositAccountTelebankingFlag = value;
    }

    /**
     * Gets the value of the outRetDepositAccountTempExcEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountTempExcEndDt() {
        return outRetDepositAccountTempExcEndDt;
    }

    /**
     * Sets the value of the outRetDepositAccountTempExcEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountTempExcEndDt(XMLGregorianCalendar value) {
        this.outRetDepositAccountTempExcEndDt = value;
    }

    /**
     * Gets the value of the outRetDepositAccountTempExcStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountTempExcStartDt() {
        return outRetDepositAccountTempExcStartDt;
    }

    /**
     * Sets the value of the outRetDepositAccountTempExcStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountTempExcStartDt(XMLGregorianCalendar value) {
        this.outRetDepositAccountTempExcStartDt = value;
    }

    /**
     * Gets the value of the outRetDepositAccountTemporaryExcess property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountTemporaryExcess() {
        return outRetDepositAccountTemporaryExcess;
    }

    /**
     * Sets the value of the outRetDepositAccountTemporaryExcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountTemporaryExcess(BigDecimal value) {
        this.outRetDepositAccountTemporaryExcess = value;
    }

    /**
     * Gets the value of the outRetDepositAccountThirdpartyInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountThirdpartyInd() {
        return outRetDepositAccountThirdpartyInd;
    }

    /**
     * Sets the value of the outRetDepositAccountThirdpartyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountThirdpartyInd(String value) {
        this.outRetDepositAccountThirdpartyInd = value;
    }

    /**
     * Gets the value of the outRetDepositAccountTimestmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountTimestmp() {
        return outRetDepositAccountTimestmp;
    }

    /**
     * Sets the value of the outRetDepositAccountTimestmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountTimestmp(XMLGregorianCalendar value) {
        this.outRetDepositAccountTimestmp = value;
    }

    /**
     * Gets the value of the outRetDepositAccountTotalPartPenalty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountTotalPartPenalty() {
        return outRetDepositAccountTotalPartPenalty;
    }

    /**
     * Sets the value of the outRetDepositAccountTotalPartPenalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountTotalPartPenalty(BigDecimal value) {
        this.outRetDepositAccountTotalPartPenalty = value;
    }

    /**
     * Gets the value of the outRetDepositAccountTransitionIntTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountTransitionIntTax() {
        return outRetDepositAccountTransitionIntTax;
    }

    /**
     * Sets the value of the outRetDepositAccountTransitionIntTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountTransitionIntTax(BigDecimal value) {
        this.outRetDepositAccountTransitionIntTax = value;
    }

    /**
     * Gets the value of the outRetDepositAccountTransitionInter property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountTransitionInter() {
        return outRetDepositAccountTransitionInter;
    }

    /**
     * Sets the value of the outRetDepositAccountTransitionInter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountTransitionInter(BigDecimal value) {
        this.outRetDepositAccountTransitionInter = value;
    }

    /**
     * Gets the value of the outRetDepositAccountUnclearBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountUnclearBalance() {
        return outRetDepositAccountUnclearBalance;
    }

    /**
     * Sets the value of the outRetDepositAccountUnclearBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountUnclearBalance(BigDecimal value) {
        this.outRetDepositAccountUnclearBalance = value;
    }

    /**
     * Gets the value of the outRetDepositAccountUnclearWithdrFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountUnclearWithdrFlg() {
        return outRetDepositAccountUnclearWithdrFlg;
    }

    /**
     * Sets the value of the outRetDepositAccountUnclearWithdrFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountUnclearWithdrFlg(String value) {
        this.outRetDepositAccountUnclearWithdrFlg = value;
    }

    /**
     * Gets the value of the outRetDepositAccountUnutilLimitPenD property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountUnutilLimitPenD() {
        return outRetDepositAccountUnutilLimitPenD;
    }

    /**
     * Sets the value of the outRetDepositAccountUnutilLimitPenD property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountUnutilLimitPenD(BigDecimal value) {
        this.outRetDepositAccountUnutilLimitPenD = value;
    }

    /**
     * Gets the value of the outRetDepositAccountValidChqDuration property.
     * 
     */
    public int getOutRetDepositAccountValidChqDuration() {
        return outRetDepositAccountValidChqDuration;
    }

    /**
     * Sets the value of the outRetDepositAccountValidChqDuration property.
     * 
     */
    public void setOutRetDepositAccountValidChqDuration(int value) {
        this.outRetDepositAccountValidChqDuration = value;
    }

    /**
     * Gets the value of the outRetDepositAccountWebFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountWebFlg() {
        return outRetDepositAccountWebFlg;
    }

    /**
     * Sets the value of the outRetDepositAccountWebFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountWebFlg(String value) {
        this.outRetDepositAccountWebFlg = value;
    }

    /**
     * Gets the value of the outRetDepositAccountWebModDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountWebModDate() {
        return outRetDepositAccountWebModDate;
    }

    /**
     * Sets the value of the outRetDepositAccountWebModDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountWebModDate(XMLGregorianCalendar value) {
        this.outRetDepositAccountWebModDate = value;
    }

    /**
     * Gets the value of the outRetDepositAccountWithdrawAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountWithdrawAmnt() {
        return outRetDepositAccountWithdrawAmnt;
    }

    /**
     * Sets the value of the outRetDepositAccountWithdrawAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountWithdrawAmnt(BigDecimal value) {
        this.outRetDepositAccountWithdrawAmnt = value;
    }

    /**
     * Gets the value of the outRetDepositAccountWithdrawBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetDepositAccountWithdrawBalance() {
        return outRetDepositAccountWithdrawBalance;
    }

    /**
     * Sets the value of the outRetDepositAccountWithdrawBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetDepositAccountWithdrawBalance(BigDecimal value) {
        this.outRetDepositAccountWithdrawBalance = value;
    }

    /**
     * Gets the value of the outRetDepositAccountWthdrawSpread property.
     * 
     */
    public short getOutRetDepositAccountWthdrawSpread() {
        return outRetDepositAccountWthdrawSpread;
    }

    /**
     * Sets the value of the outRetDepositAccountWthdrawSpread property.
     * 
     */
    public void setOutRetDepositAccountWthdrawSpread(short value) {
        this.outRetDepositAccountWthdrawSpread = value;
    }

    /**
     * Gets the value of the outRetOverdraftCurrencyDisplayedDecimalPlaces property.
     * 
     */
    public short getOutRetOverdraftCurrencyDisplayedDecimalPlaces() {
        return outRetOverdraftCurrencyDisplayedDecimalPlaces;
    }

    /**
     * Sets the value of the outRetOverdraftCurrencyDisplayedDecimalPlaces property.
     * 
     */
    public void setOutRetOverdraftCurrencyDisplayedDecimalPlaces(short value) {
        this.outRetOverdraftCurrencyDisplayedDecimalPlaces = value;
    }

    /**
     * Gets the value of the outRetOverdraftCurrencyIdCurrency property.
     * 
     */
    public int getOutRetOverdraftCurrencyIdCurrency() {
        return outRetOverdraftCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outRetOverdraftCurrencyIdCurrency property.
     * 
     */
    public void setOutRetOverdraftCurrencyIdCurrency(int value) {
        this.outRetOverdraftCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outRetOverdraftCurrencyNationalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetOverdraftCurrencyNationalFlag() {
        return outRetOverdraftCurrencyNationalFlag;
    }

    /**
     * Sets the value of the outRetOverdraftCurrencyNationalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetOverdraftCurrencyNationalFlag(String value) {
        this.outRetOverdraftCurrencyNationalFlag = value;
    }

    /**
     * Gets the value of the outRetProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetProductDescription() {
        return outRetProductDescription;
    }

    /**
     * Sets the value of the outRetProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetProductDescription(String value) {
        this.outRetProductDescription = value;
    }

    /**
     * Gets the value of the outRetProductIdProduct property.
     * 
     */
    public int getOutRetProductIdProduct() {
        return outRetProductIdProduct;
    }

    /**
     * Sets the value of the outRetProductIdProduct property.
     * 
     */
    public void setOutRetProductIdProduct(int value) {
        this.outRetProductIdProduct = value;
    }

    /**
     * Gets the value of the outRetProductInterBearing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetProductInterBearing() {
        return outRetProductInterBearing;
    }

    /**
     * Sets the value of the outRetProductInterBearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetProductInterBearing(String value) {
        this.outRetProductInterBearing = value;
    }

    /**
     * Gets the value of the outRetrAddExcesLnsInterestDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrAddExcesLnsInterestDescription() {
        return outRetrAddExcesLnsInterestDescription;
    }

    /**
     * Sets the value of the outRetrAddExcesLnsInterestDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrAddExcesLnsInterestDescription(String value) {
        this.outRetrAddExcesLnsInterestDescription = value;
    }

    /**
     * Gets the value of the outRetrAddExcesLnsInterestIdInterest property.
     * 
     */
    public int getOutRetrAddExcesLnsInterestIdInterest() {
        return outRetrAddExcesLnsInterestIdInterest;
    }

    /**
     * Sets the value of the outRetrAddExcesLnsInterestIdInterest property.
     * 
     */
    public void setOutRetrAddExcesLnsInterestIdInterest(int value) {
        this.outRetrAddExcesLnsInterestIdInterest = value;
    }

    /**
     * Gets the value of the outRetrAgrUnitCode property.
     * 
     */
    public int getOutRetrAgrUnitCode() {
        return outRetrAgrUnitCode;
    }

    /**
     * Sets the value of the outRetrAgrUnitCode property.
     * 
     */
    public void setOutRetrAgrUnitCode(int value) {
        this.outRetrAgrUnitCode = value;
    }

    /**
     * Gets the value of the outRetrAgreementAgrMembershipSn property.
     * 
     */
    public int getOutRetrAgreementAgrMembershipSn() {
        return outRetrAgreementAgrMembershipSn;
    }

    /**
     * Sets the value of the outRetrAgreementAgrMembershipSn property.
     * 
     */
    public void setOutRetrAgreementAgrMembershipSn(int value) {
        this.outRetrAgreementAgrMembershipSn = value;
    }

    /**
     * Gets the value of the outRetrAgreementAgrSn property.
     * 
     */
    public int getOutRetrAgreementAgrSn() {
        return outRetrAgreementAgrSn;
    }

    /**
     * Sets the value of the outRetrAgreementAgrSn property.
     * 
     */
    public void setOutRetrAgreementAgrSn(int value) {
        this.outRetrAgreementAgrSn = value;
    }

    /**
     * Gets the value of the outRetrAgreementAgrYear property.
     * 
     */
    public short getOutRetrAgreementAgrYear() {
        return outRetrAgreementAgrYear;
    }

    /**
     * Sets the value of the outRetrAgreementAgrYear property.
     * 
     */
    public void setOutRetrAgreementAgrYear(short value) {
        this.outRetrAgreementAgrYear = value;
    }

    /**
     * Gets the value of the outRetrCcodeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrCcodeGenericDetailDescription() {
        return outRetrCcodeGenericDetailDescription;
    }

    /**
     * Sets the value of the outRetrCcodeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrCcodeGenericDetailDescription(String value) {
        this.outRetrCcodeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outRetrCcodeGenericDetailSerialNum property.
     * 
     */
    public int getOutRetrCcodeGenericDetailSerialNum() {
        return outRetrCcodeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outRetrCcodeGenericDetailSerialNum property.
     * 
     */
    public void setOutRetrCcodeGenericDetailSerialNum(int value) {
        this.outRetrCcodeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outRetrCredGradGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrCredGradGenericDetailDescription() {
        return outRetrCredGradGenericDetailDescription;
    }

    /**
     * Sets the value of the outRetrCredGradGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrCredGradGenericDetailDescription(String value) {
        this.outRetrCredGradGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outRetrCredGradGenericDetailSerialNum property.
     * 
     */
    public int getOutRetrCredGradGenericDetailSerialNum() {
        return outRetrCredGradGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outRetrCredGradGenericDetailSerialNum property.
     * 
     */
    public void setOutRetrCredGradGenericDetailSerialNum(int value) {
        this.outRetrCredGradGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outRetrLnsCommissionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrLnsCommissionDescription() {
        return outRetrLnsCommissionDescription;
    }

    /**
     * Sets the value of the outRetrLnsCommissionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrLnsCommissionDescription(String value) {
        this.outRetrLnsCommissionDescription = value;
    }

    /**
     * Gets the value of the outRetrLnsCommissionIdCommission property.
     * 
     */
    public int getOutRetrLnsCommissionIdCommission() {
        return outRetrLnsCommissionIdCommission;
    }

    /**
     * Sets the value of the outRetrLnsCommissionIdCommission property.
     * 
     */
    public void setOutRetrLnsCommissionIdCommission(int value) {
        this.outRetrLnsCommissionIdCommission = value;
    }

    /**
     * Gets the value of the outRetrLpurpGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrLpurpGenericDetailDescription() {
        return outRetrLpurpGenericDetailDescription;
    }

    /**
     * Sets the value of the outRetrLpurpGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrLpurpGenericDetailDescription(String value) {
        this.outRetrLpurpGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outRetrLpurpGenericDetailSerialNum property.
     * 
     */
    public int getOutRetrLpurpGenericDetailSerialNum() {
        return outRetrLpurpGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outRetrLpurpGenericDetailSerialNum property.
     * 
     */
    public void setOutRetrLpurpGenericDetailSerialNum(int value) {
        this.outRetrLpurpGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outRetrPrftTransactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrPrftTransactionDescription() {
        return outRetrPrftTransactionDescription;
    }

    /**
     * Sets the value of the outRetrPrftTransactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrPrftTransactionDescription(String value) {
        this.outRetrPrftTransactionDescription = value;
    }

    /**
     * Gets the value of the outRetrPrftTransactionIdTransact property.
     * 
     */
    public int getOutRetrPrftTransactionIdTransact() {
        return outRetrPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the outRetrPrftTransactionIdTransact property.
     * 
     */
    public void setOutRetrPrftTransactionIdTransact(int value) {
        this.outRetrPrftTransactionIdTransact = value;
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
     * Gets the value of the outSecretConfirmProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSecretConfirmProfitsAccountAccountNumber() {
        return outSecretConfirmProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outSecretConfirmProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSecretConfirmProfitsAccountAccountNumber(String value) {
        this.outSecretConfirmProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outServiceRetDepositAccountAccountNumber property.
     * 
     */
    public double getOutServiceRetDepositAccountAccountNumber() {
        return outServiceRetDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the outServiceRetDepositAccountAccountNumber property.
     * 
     */
    public void setOutServiceRetDepositAccountAccountNumber(double value) {
        this.outServiceRetDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outServiceRetDepositAccountCDigit property.
     * 
     */
    public short getOutServiceRetDepositAccountCDigit() {
        return outServiceRetDepositAccountCDigit;
    }

    /**
     * Sets the value of the outServiceRetDepositAccountCDigit property.
     * 
     */
    public void setOutServiceRetDepositAccountCDigit(short value) {
        this.outServiceRetDepositAccountCDigit = value;
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
     * Gets the value of the outSpecificBeneficiaryLnsSuppliedAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSpecificBeneficiaryLnsSuppliedAfmNo() {
        return outSpecificBeneficiaryLnsSuppliedAfmNo;
    }

    /**
     * Sets the value of the outSpecificBeneficiaryLnsSuppliedAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSpecificBeneficiaryLnsSuppliedAfmNo(String value) {
        this.outSpecificBeneficiaryLnsSuppliedAfmNo = value;
    }

    /**
     * Gets the value of the outSpecificBeneficiaryLnsSuppliedCustId property.
     * 
     */
    public int getOutSpecificBeneficiaryLnsSuppliedCustId() {
        return outSpecificBeneficiaryLnsSuppliedCustId;
    }

    /**
     * Sets the value of the outSpecificBeneficiaryLnsSuppliedCustId property.
     * 
     */
    public void setOutSpecificBeneficiaryLnsSuppliedCustId(int value) {
        this.outSpecificBeneficiaryLnsSuppliedCustId = value;
    }

    /**
     * Gets the value of the outSpecificBeneficiaryLnsSuppliedIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSpecificBeneficiaryLnsSuppliedIdNo() {
        return outSpecificBeneficiaryLnsSuppliedIdNo;
    }

    /**
     * Sets the value of the outSpecificBeneficiaryLnsSuppliedIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSpecificBeneficiaryLnsSuppliedIdNo(String value) {
        this.outSpecificBeneficiaryLnsSuppliedIdNo = value;
    }

    /**
     * Gets the value of the outSpecificBeneficiaryLnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSpecificBeneficiaryLnsSuppliedName() {
        return outSpecificBeneficiaryLnsSuppliedName;
    }

    /**
     * Sets the value of the outSpecificBeneficiaryLnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSpecificBeneficiaryLnsSuppliedName(String value) {
        this.outSpecificBeneficiaryLnsSuppliedName = value;
    }

    /**
     * Gets the value of the outSpecificBeneficiaryLnsSuppliedReturnedCheckDigit property.
     * 
     */
    public short getOutSpecificBeneficiaryLnsSuppliedReturnedCheckDigit() {
        return outSpecificBeneficiaryLnsSuppliedReturnedCheckDigit;
    }

    /**
     * Sets the value of the outSpecificBeneficiaryLnsSuppliedReturnedCheckDigit property.
     * 
     */
    public void setOutSpecificBeneficiaryLnsSuppliedReturnedCheckDigit(short value) {
        this.outSpecificBeneficiaryLnsSuppliedReturnedCheckDigit = value;
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
     * Gets the value of the outTimeDeposRenewalCrInterTaxPcg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTimeDeposRenewalCrInterTaxPcg() {
        return outTimeDeposRenewalCrInterTaxPcg;
    }

    /**
     * Sets the value of the outTimeDeposRenewalCrInterTaxPcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTimeDeposRenewalCrInterTaxPcg(BigDecimal value) {
        this.outTimeDeposRenewalCrInterTaxPcg = value;
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
     * Gets the value of the outUpdDepMntRecordingTrxUsrSn property.
     * 
     */
    public int getOutUpdDepMntRecordingTrxUsrSn() {
        return outUpdDepMntRecordingTrxUsrSn;
    }

    /**
     * Sets the value of the outUpdDepMntRecordingTrxUsrSn property.
     * 
     */
    public void setOutUpdDepMntRecordingTrxUsrSn(int value) {
        this.outUpdDepMntRecordingTrxUsrSn = value;
    }

    /**
     * Gets the value of the outUpdateDepositAccountEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUpdateDepositAccountEntryStatus() {
        return outUpdateDepositAccountEntryStatus;
    }

    /**
     * Sets the value of the outUpdateDepositAccountEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUpdateDepositAccountEntryStatus(String value) {
        this.outUpdateDepositAccountEntryStatus = value;
    }

    /**
     * Gets the value of the outUpdateDepositAccountLastModifyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutUpdateDepositAccountLastModifyDate() {
        return outUpdateDepositAccountLastModifyDate;
    }

    /**
     * Sets the value of the outUpdateDepositAccountLastModifyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutUpdateDepositAccountLastModifyDate(XMLGregorianCalendar value) {
        this.outUpdateDepositAccountLastModifyDate = value;
    }

    /**
     * Gets the value of the outUpdateDepositAccountOpeningDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutUpdateDepositAccountOpeningDate() {
        return outUpdateDepositAccountOpeningDate;
    }

    /**
     * Sets the value of the outUpdateDepositAccountOpeningDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutUpdateDepositAccountOpeningDate(XMLGregorianCalendar value) {
        this.outUpdateDepositAccountOpeningDate = value;
    }

    /**
     * Gets the value of the outUpdateDepositAccountPassbookFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUpdateDepositAccountPassbookFlag() {
        return outUpdateDepositAccountPassbookFlag;
    }

    /**
     * Sets the value of the outUpdateDepositAccountPassbookFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUpdateDepositAccountPassbookFlag(String value) {
        this.outUpdateDepositAccountPassbookFlag = value;
    }

    /**
     * Gets the value of the outUpdateDepositAccountRestrictAccFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUpdateDepositAccountRestrictAccFlag() {
        return outUpdateDepositAccountRestrictAccFlag;
    }

    /**
     * Sets the value of the outUpdateDepositAccountRestrictAccFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUpdateDepositAccountRestrictAccFlag(String value) {
        this.outUpdateDepositAccountRestrictAccFlag = value;
    }

    /**
     * Gets the value of the outUpdateUserLnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUpdateUserLnsSuppliedName() {
        return outUpdateUserLnsSuppliedName;
    }

    /**
     * Sets the value of the outUpdateUserLnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUpdateUserLnsSuppliedName(String value) {
        this.outUpdateUserLnsSuppliedName = value;
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
     * Gets the value of the outUsedInputCharSuppliedChar37 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUsedInputCharSuppliedChar37() {
        return outUsedInputCharSuppliedChar37;
    }

    /**
     * Sets the value of the outUsedInputCharSuppliedChar37 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUsedInputCharSuppliedChar37(String value) {
        this.outUsedInputCharSuppliedChar37 = value;
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
     * Gets the value of the outRetDepositAccountMailStatment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountMailStatment() {
        return outRetDepositAccountMailStatment;
    }

    /**
     * Sets the value of the outRetDepositAccountMailStatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountMailStatment(String value) {
        this.outRetDepositAccountMailStatment = value;
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
     * Gets the value of the outRetDepositAccountLastDormantDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetDepositAccountLastDormantDate() {
        return outRetDepositAccountLastDormantDate;
    }

    /**
     * Sets the value of the outRetDepositAccountLastDormantDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetDepositAccountLastDormantDate(XMLGregorianCalendar value) {
        this.outRetDepositAccountLastDormantDate = value;
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

    /**
     * Gets the value of the outRetDepositAccountSwiftMt942 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountSwiftMt942() {
        return outRetDepositAccountSwiftMt942;
    }

    /**
     * Sets the value of the outRetDepositAccountSwiftMt942 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountSwiftMt942(String value) {
        this.outRetDepositAccountSwiftMt942 = value;
    }

    /**
     * Gets the value of the outRetDepositAccountSwiftMt940 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetDepositAccountSwiftMt940() {
        return outRetDepositAccountSwiftMt940;
    }

    /**
     * Sets the value of the outRetDepositAccountSwiftMt940 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetDepositAccountSwiftMt940(String value) {
        this.outRetDepositAccountSwiftMt940 = value;
    }

}
