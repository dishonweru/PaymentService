
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for L0437VLoanAccountStatementImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0437VLoanAccountStatementImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InAdjustGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAdjustGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAdjustInfoIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InAdjustInfoIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAgrUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAgreementAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAgreementAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAgreementAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InAsoCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAuthGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBankSectorGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBatchParametersDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBatchParametersDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBatchParametersOnRequestFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBenefIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCbpurpGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InClassCodeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCloanGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepSnLoansStandingAccSnDep" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InDepositAccountCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFinancialSectorGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InFixedLnsInterestDurationUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFixedLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InFixedLnsInterestIntDuration" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InFloatingLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLimitCurrencyDisplayedDecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLimitCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLoanAsoInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAtmCardFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanCostOfOptionMax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanCostOfOptionMin" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanCurFxIntInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanInstallMechFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanInstantCreditFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanIntCapitalFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanIntPayableFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanLoanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanNonIntCapitFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanRenewalInterFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanSelectIntFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanTolDays1" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanTolDays2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanTolDays3" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanTolDays5" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanToleranceDays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLoanAccountAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountCurFxIntExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountCurFxIntScalDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountInterRateSprd" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountLoanStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountSpreadEndDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountInfoAccTransitionFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountInfoAdjustmentDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountInfoAgentBank" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLoanAccountInfoAutFixIntRenew" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountInfoCrIntSprd" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountInfoCrSprdEndDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountInfoCrSprdStDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountInfoCreditIntId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLoanAccountInfoDealerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountInfoDiffIntAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountInfoFluctuationRange" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountInfoGuarActNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountInfoGuarComPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountInfoGuarExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountInfoInitialInterest" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountInfoInstallCalcPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLoanAccountInfoInstallFixedAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountInfoLastRemindLetterDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountInfoLastRemindLetterType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountInfoLoanAccPayroll" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountInfoMaintainEqInst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountInfoMoratIntPayFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountInfoMoratoriumIntDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountInfoMoratoriumIntFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountInfoNo30daysLetterFlg" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountInfoNrmAccrualAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountInfoNrmAccrualLstDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountInfoNrmRlUrlFlg" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountInfoOvAccrualAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountInfoOvAccrualLstDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountInfoOvRlUrlFlg" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountInfoPayrollAgrCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLoanAccountInfoPayrollConnFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountInfoPayrollDiasCode" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InLoanAccountInfoPayrollIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountInfoProvisionChgFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountInfoProvisionCurrPerc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLoanAccountInfoProvisionJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLoanAccountInfoProvisionMaxPerc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLoanAccountInfoRateApprovalNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountInfoRepaymentSchFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountInfoSelectedBankRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountInfoSelectedNormalRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountInfoSpreadStDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountInfoTransactInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountInfoTransactSm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLoanProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLoanProductValidityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanPurposeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLogMntRecordingAuthorizer1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingAuthorizer2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLogMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMinStandAmntIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InMoreIefSuppliedNum2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InMoreIefSuppliedTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InMovedCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMovedCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPageCountIefSuppliedCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPrintIndicatorIefSuppliedTableInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrintJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrintJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSalePointGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSellerGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSerialNumIefSuppliedNum10" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InStatementLoanAccountStatementFreq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSubs2LoanAccountSubsidyDuration" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSubs2LoanAccountSubsidyExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InSubs2LoanAccountSubsidyLimitAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InSubs2LoanAccountSubsidyStartDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InSubs2SubsidyOrderDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSubs2SubsidyOrderExpiryDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InSubs2SubsidyOrderIdSubsidy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSubs2SubsidyOrderLnsEffectiveDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InSubs2SubsidyOrderLnsExpiryDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InSubs2SubsidyOrderSubsDurationPrd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSubsidyOrderIdSubsidy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTransLoanAccountAccOpenDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTransLoanAccountCurFxIntExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTransLoanAccountDrawdownFstAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransLoanAccountDrawdownFstDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTransLoanAccountInstallNextDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTransLoanAccountInstallPrevDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTransLoanAccountLstAprIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransLoanAccountLstAprYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTransLoanAccountLstAugIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransLoanAccountLstAugYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTransLoanAccountLstDecIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransLoanAccountLstDecYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTransLoanAccountLstFebIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransLoanAccountLstFebYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTransLoanAccountLstJanIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransLoanAccountLstJanYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTransLoanAccountLstJulIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransLoanAccountLstJulYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTransLoanAccountLstJunIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransLoanAccountLstJunYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTransLoanAccountLstMarIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransLoanAccountLstMarYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTransLoanAccountLstMayIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransLoanAccountLstMayYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTransLoanAccountLstNovIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransLoanAccountLstNovYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTransLoanAccountLstOctIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransLoanAccountLstOctYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTransLoanAccountLstSepIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransLoanAccountLstSepYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTransLoanAccountMoratorN128Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransLoanAccountMoratorNrmRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransLoanAccountMoratorSprRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransLoanAccountMpStartCapAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransLoanAccountOldAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTransLoanAccountOldAccountNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTransLoanAccountReqInstallSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTransLoanAccountTotCapAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransLoanAccountTotComInCcAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransLoanAccountTotCommissionAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransLoanAccountTotConfirmAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransLoanAccountTotDrawdownAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransLoanAccountTotExpInCcAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransLoanAccountTotExpenseAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransLoanAccountTotNrmIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransLoanAccountTotPnlIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransLoanAccountTotPubCommAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransLoanAccountTotSubsIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransLoanAccountTotThrdprtAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransProdUnitOperationStatusFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxSsSecurityCmcbPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTrxTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InUnionCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InUpdateCauseGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0437VLoanAccountStatementImport", propOrder = {
    "command",
    "profitsAccountNumber",
    "profitsAccountCd",
    "inAdjustGenericDetailDescription",
    "inAdjustGenericDetailSerialNum",
    "inAdjustInfoIefSuppliedDate",
    "inAdjustInfoIefSuppliedFlag",
    "inAgrUnitCode",
    "inAgreementAgrMembershipSn",
    "inAgreementAgrSn",
    "inAgreementAgrYear",
    "inAsoCustomerCustId",
    "inAuthGrantedIefSuppliedFlag",
    "inAuthIefSuppliedFlag",
    "inBankSectorGenericDetailSerialNum",
    "inBatchParametersDateFrom",
    "inBatchParametersDateTo",
    "inBatchParametersOnRequestFlag",
    "inBenefIefSuppliedFlag",
    "inCbpurpGenericDetailSerialNum",
    "inClassCodeGenericDetailSerialNum",
    "inCloanGenericDetailSerialNum",
    "inCustomerCustId",
    "inDepSnLoansStandingAccSnDep",
    "inDepositAccountCurrencyIdCurrency",
    "inDepositAccountCurrencyShortDescr",
    "inFinancialSectorGenericDetailSerialNum",
    "inFixedLnsInterestDurationUnit",
    "inFixedLnsInterestIdInterest",
    "inFixedLnsInterestIntDuration",
    "inFloatingLnsInterestIdInterest",
    "inIefSuppliedCommand",
    "inLimitCurrencyDisplayedDecimalPlaces",
    "inLimitCurrencyIdCurrency",
    "inLoanAsoInd",
    "inLoanAtmCardFlag",
    "inLoanCostOfOptionMax",
    "inLoanCostOfOptionMin",
    "inLoanCurFxIntInd",
    "inLoanInstallMechFlg",
    "inLoanInstantCreditFlg",
    "inLoanIntCapitalFlg",
    "inLoanIntPayableFlg",
    "inLoanLoanType",
    "inLoanNonIntCapitFlg",
    "inLoanRenewalInterFlg",
    "inLoanSelectIntFlg",
    "inLoanTolDays1",
    "inLoanTolDays2",
    "inLoanTolDays3",
    "inLoanTolDays5",
    "inLoanToleranceDays",
    "inLoanAccUnitCode",
    "inLoanAccountAccStatus",
    "inLoanAccountCurFxIntExpDt",
    "inLoanAccountCurFxIntScalDt",
    "inLoanAccountInterRateSprd",
    "inLoanAccountLoanStatus",
    "inLoanAccountSpreadEndDt",
    "inLoanAccountInfoAccTransitionFlg",
    "inLoanAccountInfoAdjustmentDt",
    "inLoanAccountInfoAgentBank",
    "inLoanAccountInfoAutFixIntRenew",
    "inLoanAccountInfoCrIntSprd",
    "inLoanAccountInfoCrSprdEndDt",
    "inLoanAccountInfoCrSprdStDt",
    "inLoanAccountInfoCreditIntId",
    "inLoanAccountInfoDealerCode",
    "inLoanAccountInfoDiffIntAlgorithm",
    "inLoanAccountInfoFluctuationRange",
    "inLoanAccountInfoGuarActNum",
    "inLoanAccountInfoGuarComPerc",
    "inLoanAccountInfoGuarExpDt",
    "inLoanAccountInfoInitialInterest",
    "inLoanAccountInfoInstallCalcPeriod",
    "inLoanAccountInfoInstallFixedAmn",
    "inLoanAccountInfoLastRemindLetterDate",
    "inLoanAccountInfoLastRemindLetterType",
    "inLoanAccountInfoLoanAccPayroll",
    "inLoanAccountInfoMaintainEqInst",
    "inLoanAccountInfoMoratIntPayFlg",
    "inLoanAccountInfoMoratoriumIntDt",
    "inLoanAccountInfoMoratoriumIntFrq",
    "inLoanAccountInfoNo30DaysLetterFlg",
    "inLoanAccountInfoNrmAccrualAmn",
    "inLoanAccountInfoNrmAccrualLstDt",
    "inLoanAccountInfoNrmRlUrlFlg",
    "inLoanAccountInfoOvAccrualAmn",
    "inLoanAccountInfoOvAccrualLstDt",
    "inLoanAccountInfoOvRlUrlFlg",
    "inLoanAccountInfoPayrollAgrCode",
    "inLoanAccountInfoPayrollConnFlg",
    "inLoanAccountInfoPayrollDiasCode",
    "inLoanAccountInfoPayrollIdNo",
    "inLoanAccountInfoProvisionChgFlg",
    "inLoanAccountInfoProvisionCurrPerc",
    "inLoanAccountInfoProvisionJustific",
    "inLoanAccountInfoProvisionMaxPerc",
    "inLoanAccountInfoRateApprovalNum",
    "inLoanAccountInfoRepaymentSchFlg",
    "inLoanAccountInfoSelectedBankRate",
    "inLoanAccountInfoSelectedNormalRate",
    "inLoanAccountInfoSpreadStDt",
    "inLoanAccountInfoTransactInd",
    "inLoanAccountInfoTransactSm",
    "inLoanProductIdProduct",
    "inLoanProductValidityDate",
    "inLoanPurposeGenericDetailSerialNum",
    "inLogMntRecordingAuthorizer1",
    "inLogMntRecordingAuthorizer2",
    "inLogMntRecordingPrftSystem",
    "inLogMntRecordingReversalFlag",
    "inLogMntRecordingTerminalNumber",
    "inLogMntRecordingTrxCode",
    "inMinStandAmntIefSuppliedAmount",
    "inMoreIefSuppliedNum2",
    "inMoreIefSuppliedTmstamp",
    "inMovedCurrencyIdCurrency",
    "inMovedCurrencyShortDescr",
    "inPageCountIefSuppliedCount",
    "inPrintIndicatorIefSuppliedTableInd",
    "inPrintJustificDescription",
    "inPrintJustificIdJustific",
    "inSalePointGenericDetailSerialNum",
    "inSellerGenericDetailSerialNum",
    "inSerialNumIefSuppliedNum10",
    "inStatementLoanAccountStatementFreq",
    "inSubs2LoanAccountSubsidyDuration",
    "inSubs2LoanAccountSubsidyExpDt",
    "inSubs2LoanAccountSubsidyLimitAmn",
    "inSubs2LoanAccountSubsidyStartDt",
    "inSubs2SubsidyOrderDescription",
    "inSubs2SubsidyOrderExpiryDt",
    "inSubs2SubsidyOrderIdSubsidy",
    "inSubs2SubsidyOrderLnsEffectiveDt",
    "inSubs2SubsidyOrderLnsExpiryDt",
    "inSubs2SubsidyOrderSubsDurationPrd",
    "inSubsidyOrderIdSubsidy",
    "inTransLoanAccountAccOpenDt",
    "inTransLoanAccountCurFxIntExpDt",
    "inTransLoanAccountDrawdownFstAmn",
    "inTransLoanAccountDrawdownFstDt",
    "inTransLoanAccountInstallNextDt",
    "inTransLoanAccountInstallPrevDt",
    "inTransLoanAccountLstAprIntDbAmn",
    "inTransLoanAccountLstAprYear",
    "inTransLoanAccountLstAugIntDbAmn",
    "inTransLoanAccountLstAugYear",
    "inTransLoanAccountLstDecIntDbAmn",
    "inTransLoanAccountLstDecYear",
    "inTransLoanAccountLstFebIntDbAmn",
    "inTransLoanAccountLstFebYear",
    "inTransLoanAccountLstJanIntDbAmn",
    "inTransLoanAccountLstJanYear",
    "inTransLoanAccountLstJulIntDbAmn",
    "inTransLoanAccountLstJulYear",
    "inTransLoanAccountLstJunIntDbAmn",
    "inTransLoanAccountLstJunYear",
    "inTransLoanAccountLstMarIntDbAmn",
    "inTransLoanAccountLstMarYear",
    "inTransLoanAccountLstMayIntDbAmn",
    "inTransLoanAccountLstMayYear",
    "inTransLoanAccountLstNovIntDbAmn",
    "inTransLoanAccountLstNovYear",
    "inTransLoanAccountLstOctIntDbAmn",
    "inTransLoanAccountLstOctYear",
    "inTransLoanAccountLstSepIntDbAmn",
    "inTransLoanAccountLstSepYear",
    "inTransLoanAccountMoratorN128Rate",
    "inTransLoanAccountMoratorNrmRate",
    "inTransLoanAccountMoratorSprRate",
    "inTransLoanAccountMpStartCapAmn",
    "inTransLoanAccountOldAccountCd",
    "inTransLoanAccountOldAccountNum",
    "inTransLoanAccountReqInstallSn",
    "inTransLoanAccountTotCapAmn",
    "inTransLoanAccountTotComInCcAmn",
    "inTransLoanAccountTotCommissionAmn",
    "inTransLoanAccountTotConfirmAmn",
    "inTransLoanAccountTotDrawdownAmn",
    "inTransLoanAccountTotExpInCcAmn",
    "inTransLoanAccountTotExpenseAmn",
    "inTransLoanAccountTotNrmIntAmn",
    "inTransLoanAccountTotPnlIntAmn",
    "inTransLoanAccountTotPubCommAmn",
    "inTransLoanAccountTotSubsIntAmn",
    "inTransLoanAccountTotThrdprtAmn",
    "inTransProdUnitOperationStatusFlg",
    "inTrxCurrencyIdCurrency",
    "inTrxCurrencyShortDescr",
    "inTrxJustificIdJustific",
    "inTrxPrftTransactionIdTransact",
    "inTrxSsSecurityCmcbPrftSystem",
    "inTrxTerminalTerminalNumber",
    "inUnionCustomerCustId",
    "inUpdateCauseGenericDetailSerialNum"
})
public class L0437VLoanAccountStatementImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "ProfitsAccountNumber")
    protected String profitsAccountNumber;
    @XmlElement(name = "ProfitsAccountCd")
    protected short profitsAccountCd;
    @XmlElement(name = "InAdjustGenericDetailDescription")
    protected String inAdjustGenericDetailDescription;
    @XmlElement(name = "InAdjustGenericDetailSerialNum")
    protected int inAdjustGenericDetailSerialNum;
    @XmlElement(name = "InAdjustInfoIefSuppliedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inAdjustInfoIefSuppliedDate;
    @XmlElement(name = "InAdjustInfoIefSuppliedFlag")
    protected String inAdjustInfoIefSuppliedFlag;
    @XmlElement(name = "InAgrUnitCode")
    protected int inAgrUnitCode;
    @XmlElement(name = "InAgreementAgrMembershipSn")
    protected int inAgreementAgrMembershipSn;
    @XmlElement(name = "InAgreementAgrSn")
    protected int inAgreementAgrSn;
    @XmlElement(name = "InAgreementAgrYear")
    protected short inAgreementAgrYear;
    @XmlElement(name = "InAsoCustomerCustId")
    protected int inAsoCustomerCustId;
    @XmlElement(name = "InAuthGrantedIefSuppliedFlag")
    protected String inAuthGrantedIefSuppliedFlag;
    @XmlElement(name = "InAuthIefSuppliedFlag")
    protected String inAuthIefSuppliedFlag;
    @XmlElement(name = "InBankSectorGenericDetailSerialNum")
    protected int inBankSectorGenericDetailSerialNum;
    @XmlElement(name = "InBatchParametersDateFrom", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBatchParametersDateFrom;
    @XmlElement(name = "InBatchParametersDateTo", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBatchParametersDateTo;
    @XmlElement(name = "InBatchParametersOnRequestFlag")
    protected String inBatchParametersOnRequestFlag;
    @XmlElement(name = "InBenefIefSuppliedFlag")
    protected String inBenefIefSuppliedFlag;
    @XmlElement(name = "InCbpurpGenericDetailSerialNum")
    protected int inCbpurpGenericDetailSerialNum;
    @XmlElement(name = "InClassCodeGenericDetailSerialNum")
    protected int inClassCodeGenericDetailSerialNum;
    @XmlElement(name = "InCloanGenericDetailSerialNum")
    protected int inCloanGenericDetailSerialNum;
    @XmlElement(name = "InCustomerCustId")
    protected int inCustomerCustId;
    @XmlElement(name = "InDepSnLoansStandingAccSnDep")
    protected double inDepSnLoansStandingAccSnDep;
    @XmlElement(name = "InDepositAccountCurrencyIdCurrency")
    protected int inDepositAccountCurrencyIdCurrency;
    @XmlElement(name = "InDepositAccountCurrencyShortDescr")
    protected String inDepositAccountCurrencyShortDescr;
    @XmlElement(name = "InFinancialSectorGenericDetailSerialNum")
    protected int inFinancialSectorGenericDetailSerialNum;
    @XmlElement(name = "InFixedLnsInterestDurationUnit")
    protected String inFixedLnsInterestDurationUnit;
    @XmlElement(name = "InFixedLnsInterestIdInterest")
    protected int inFixedLnsInterestIdInterest;
    @XmlElement(name = "InFixedLnsInterestIntDuration")
    protected short inFixedLnsInterestIntDuration;
    @XmlElement(name = "InFloatingLnsInterestIdInterest")
    protected int inFloatingLnsInterestIdInterest;
    @XmlElement(name = "InIefSuppliedCommand")
    protected String inIefSuppliedCommand;
    @XmlElement(name = "InLimitCurrencyDisplayedDecimalPlaces")
    protected short inLimitCurrencyDisplayedDecimalPlaces;
    @XmlElement(name = "InLimitCurrencyIdCurrency")
    protected int inLimitCurrencyIdCurrency;
    @XmlElement(name = "InLoanAsoInd")
    protected String inLoanAsoInd;
    @XmlElement(name = "InLoanAtmCardFlag")
    protected String inLoanAtmCardFlag;
    @XmlElement(name = "InLoanCostOfOptionMax", required = true)
    protected BigDecimal inLoanCostOfOptionMax;
    @XmlElement(name = "InLoanCostOfOptionMin", required = true)
    protected BigDecimal inLoanCostOfOptionMin;
    @XmlElement(name = "InLoanCurFxIntInd")
    protected String inLoanCurFxIntInd;
    @XmlElement(name = "InLoanInstallMechFlg")
    protected String inLoanInstallMechFlg;
    @XmlElement(name = "InLoanInstantCreditFlg")
    protected String inLoanInstantCreditFlg;
    @XmlElement(name = "InLoanIntCapitalFlg")
    protected String inLoanIntCapitalFlg;
    @XmlElement(name = "InLoanIntPayableFlg")
    protected String inLoanIntPayableFlg;
    @XmlElement(name = "InLoanLoanType")
    protected String inLoanLoanType;
    @XmlElement(name = "InLoanNonIntCapitFlg")
    protected String inLoanNonIntCapitFlg;
    @XmlElement(name = "InLoanRenewalInterFlg")
    protected String inLoanRenewalInterFlg;
    @XmlElement(name = "InLoanSelectIntFlg")
    protected String inLoanSelectIntFlg;
    @XmlElement(name = "InLoanTolDays1")
    protected short inLoanTolDays1;
    @XmlElement(name = "InLoanTolDays2")
    protected short inLoanTolDays2;
    @XmlElement(name = "InLoanTolDays3")
    protected short inLoanTolDays3;
    @XmlElement(name = "InLoanTolDays5")
    protected short inLoanTolDays5;
    @XmlElement(name = "InLoanToleranceDays")
    protected short inLoanToleranceDays;
    @XmlElement(name = "InLoanAccUnitCode")
    protected int inLoanAccUnitCode;
    @XmlElement(name = "InLoanAccountAccStatus")
    protected String inLoanAccountAccStatus;
    @XmlElement(name = "InLoanAccountCurFxIntExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountCurFxIntExpDt;
    @XmlElement(name = "InLoanAccountCurFxIntScalDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountCurFxIntScalDt;
    @XmlElement(name = "InLoanAccountInterRateSprd", required = true)
    protected BigDecimal inLoanAccountInterRateSprd;
    @XmlElement(name = "InLoanAccountLoanStatus")
    protected String inLoanAccountLoanStatus;
    @XmlElement(name = "InLoanAccountSpreadEndDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountSpreadEndDt;
    @XmlElement(name = "InLoanAccountInfoAccTransitionFlg")
    protected String inLoanAccountInfoAccTransitionFlg;
    @XmlElement(name = "InLoanAccountInfoAdjustmentDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountInfoAdjustmentDt;
    @XmlElement(name = "InLoanAccountInfoAgentBank")
    protected int inLoanAccountInfoAgentBank;
    @XmlElement(name = "InLoanAccountInfoAutFixIntRenew")
    protected String inLoanAccountInfoAutFixIntRenew;
    @XmlElement(name = "InLoanAccountInfoCrIntSprd", required = true)
    protected BigDecimal inLoanAccountInfoCrIntSprd;
    @XmlElement(name = "InLoanAccountInfoCrSprdEndDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountInfoCrSprdEndDt;
    @XmlElement(name = "InLoanAccountInfoCrSprdStDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountInfoCrSprdStDt;
    @XmlElement(name = "InLoanAccountInfoCreditIntId")
    protected int inLoanAccountInfoCreditIntId;
    @XmlElement(name = "InLoanAccountInfoDealerCode")
    protected String inLoanAccountInfoDealerCode;
    @XmlElement(name = "InLoanAccountInfoDiffIntAlgorithm")
    protected String inLoanAccountInfoDiffIntAlgorithm;
    @XmlElement(name = "InLoanAccountInfoFluctuationRange", required = true)
    protected BigDecimal inLoanAccountInfoFluctuationRange;
    @XmlElement(name = "InLoanAccountInfoGuarActNum")
    protected String inLoanAccountInfoGuarActNum;
    @XmlElement(name = "InLoanAccountInfoGuarComPerc", required = true)
    protected BigDecimal inLoanAccountInfoGuarComPerc;
    @XmlElement(name = "InLoanAccountInfoGuarExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountInfoGuarExpDt;
    @XmlElement(name = "InLoanAccountInfoInitialInterest", required = true)
    protected BigDecimal inLoanAccountInfoInitialInterest;
    @XmlElement(name = "InLoanAccountInfoInstallCalcPeriod")
    protected int inLoanAccountInfoInstallCalcPeriod;
    @XmlElement(name = "InLoanAccountInfoInstallFixedAmn", required = true)
    protected BigDecimal inLoanAccountInfoInstallFixedAmn;
    @XmlElement(name = "InLoanAccountInfoLastRemindLetterDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountInfoLastRemindLetterDate;
    @XmlElement(name = "InLoanAccountInfoLastRemindLetterType")
    protected short inLoanAccountInfoLastRemindLetterType;
    @XmlElement(name = "InLoanAccountInfoLoanAccPayroll")
    protected String inLoanAccountInfoLoanAccPayroll;
    @XmlElement(name = "InLoanAccountInfoMaintainEqInst")
    protected String inLoanAccountInfoMaintainEqInst;
    @XmlElement(name = "InLoanAccountInfoMoratIntPayFlg")
    protected String inLoanAccountInfoMoratIntPayFlg;
    @XmlElement(name = "InLoanAccountInfoMoratoriumIntDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountInfoMoratoriumIntDt;
    @XmlElement(name = "InLoanAccountInfoMoratoriumIntFrq")
    protected short inLoanAccountInfoMoratoriumIntFrq;
    @XmlElement(name = "InLoanAccountInfoNo30daysLetterFlg")
    protected short inLoanAccountInfoNo30DaysLetterFlg;
    @XmlElement(name = "InLoanAccountInfoNrmAccrualAmn", required = true)
    protected BigDecimal inLoanAccountInfoNrmAccrualAmn;
    @XmlElement(name = "InLoanAccountInfoNrmAccrualLstDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountInfoNrmAccrualLstDt;
    @XmlElement(name = "InLoanAccountInfoNrmRlUrlFlg")
    protected short inLoanAccountInfoNrmRlUrlFlg;
    @XmlElement(name = "InLoanAccountInfoOvAccrualAmn", required = true)
    protected BigDecimal inLoanAccountInfoOvAccrualAmn;
    @XmlElement(name = "InLoanAccountInfoOvAccrualLstDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountInfoOvAccrualLstDt;
    @XmlElement(name = "InLoanAccountInfoOvRlUrlFlg")
    protected short inLoanAccountInfoOvRlUrlFlg;
    @XmlElement(name = "InLoanAccountInfoPayrollAgrCode")
    protected int inLoanAccountInfoPayrollAgrCode;
    @XmlElement(name = "InLoanAccountInfoPayrollConnFlg")
    protected String inLoanAccountInfoPayrollConnFlg;
    @XmlElement(name = "InLoanAccountInfoPayrollDiasCode")
    protected double inLoanAccountInfoPayrollDiasCode;
    @XmlElement(name = "InLoanAccountInfoPayrollIdNo")
    protected String inLoanAccountInfoPayrollIdNo;
    @XmlElement(name = "InLoanAccountInfoProvisionChgFlg")
    protected String inLoanAccountInfoProvisionChgFlg;
    @XmlElement(name = "InLoanAccountInfoProvisionCurrPerc")
    protected int inLoanAccountInfoProvisionCurrPerc;
    @XmlElement(name = "InLoanAccountInfoProvisionJustific")
    protected int inLoanAccountInfoProvisionJustific;
    @XmlElement(name = "InLoanAccountInfoProvisionMaxPerc")
    protected int inLoanAccountInfoProvisionMaxPerc;
    @XmlElement(name = "InLoanAccountInfoRateApprovalNum")
    protected String inLoanAccountInfoRateApprovalNum;
    @XmlElement(name = "InLoanAccountInfoRepaymentSchFlg")
    protected String inLoanAccountInfoRepaymentSchFlg;
    @XmlElement(name = "InLoanAccountInfoSelectedBankRate", required = true)
    protected BigDecimal inLoanAccountInfoSelectedBankRate;
    @XmlElement(name = "InLoanAccountInfoSelectedNormalRate", required = true)
    protected BigDecimal inLoanAccountInfoSelectedNormalRate;
    @XmlElement(name = "InLoanAccountInfoSpreadStDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountInfoSpreadStDt;
    @XmlElement(name = "InLoanAccountInfoTransactInd")
    protected String inLoanAccountInfoTransactInd;
    @XmlElement(name = "InLoanAccountInfoTransactSm")
    protected int inLoanAccountInfoTransactSm;
    @XmlElement(name = "InLoanProductIdProduct")
    protected int inLoanProductIdProduct;
    @XmlElement(name = "InLoanProductValidityDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanProductValidityDate;
    @XmlElement(name = "InLoanPurposeGenericDetailSerialNum")
    protected int inLoanPurposeGenericDetailSerialNum;
    @XmlElement(name = "InLogMntRecordingAuthorizer1")
    protected String inLogMntRecordingAuthorizer1;
    @XmlElement(name = "InLogMntRecordingAuthorizer2")
    protected String inLogMntRecordingAuthorizer2;
    @XmlElement(name = "InLogMntRecordingPrftSystem")
    protected short inLogMntRecordingPrftSystem;
    @XmlElement(name = "InLogMntRecordingReversalFlag")
    protected String inLogMntRecordingReversalFlag;
    @XmlElement(name = "InLogMntRecordingTerminalNumber")
    protected String inLogMntRecordingTerminalNumber;
    @XmlElement(name = "InLogMntRecordingTrxCode")
    protected int inLogMntRecordingTrxCode;
    @XmlElement(name = "InMinStandAmntIefSuppliedAmount", required = true)
    protected BigDecimal inMinStandAmntIefSuppliedAmount;
    @XmlElement(name = "InMoreIefSuppliedNum2")
    protected short inMoreIefSuppliedNum2;
    @XmlElement(name = "InMoreIefSuppliedTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inMoreIefSuppliedTmstamp;
    @XmlElement(name = "InMovedCurrencyIdCurrency")
    protected int inMovedCurrencyIdCurrency;
    @XmlElement(name = "InMovedCurrencyShortDescr")
    protected String inMovedCurrencyShortDescr;
    @XmlElement(name = "InPageCountIefSuppliedCount")
    protected int inPageCountIefSuppliedCount;
    @XmlElement(name = "InPrintIndicatorIefSuppliedTableInd")
    protected String inPrintIndicatorIefSuppliedTableInd;
    @XmlElement(name = "InPrintJustificDescription")
    protected String inPrintJustificDescription;
    @XmlElement(name = "InPrintJustificIdJustific")
    protected int inPrintJustificIdJustific;
    @XmlElement(name = "InSalePointGenericDetailSerialNum")
    protected int inSalePointGenericDetailSerialNum;
    @XmlElement(name = "InSellerGenericDetailSerialNum")
    protected int inSellerGenericDetailSerialNum;
    @XmlElement(name = "InSerialNumIefSuppliedNum10")
    protected double inSerialNumIefSuppliedNum10;
    @XmlElement(name = "InStatementLoanAccountStatementFreq")
    protected String inStatementLoanAccountStatementFreq;
    @XmlElement(name = "InSubs2LoanAccountSubsidyDuration")
    protected short inSubs2LoanAccountSubsidyDuration;
    @XmlElement(name = "InSubs2LoanAccountSubsidyExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inSubs2LoanAccountSubsidyExpDt;
    @XmlElement(name = "InSubs2LoanAccountSubsidyLimitAmn", required = true)
    protected BigDecimal inSubs2LoanAccountSubsidyLimitAmn;
    @XmlElement(name = "InSubs2LoanAccountSubsidyStartDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inSubs2LoanAccountSubsidyStartDt;
    @XmlElement(name = "InSubs2SubsidyOrderDescription")
    protected String inSubs2SubsidyOrderDescription;
    @XmlElement(name = "InSubs2SubsidyOrderExpiryDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inSubs2SubsidyOrderExpiryDt;
    @XmlElement(name = "InSubs2SubsidyOrderIdSubsidy")
    protected int inSubs2SubsidyOrderIdSubsidy;
    @XmlElement(name = "InSubs2SubsidyOrderLnsEffectiveDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inSubs2SubsidyOrderLnsEffectiveDt;
    @XmlElement(name = "InSubs2SubsidyOrderLnsExpiryDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inSubs2SubsidyOrderLnsExpiryDt;
    @XmlElement(name = "InSubs2SubsidyOrderSubsDurationPrd")
    protected short inSubs2SubsidyOrderSubsDurationPrd;
    @XmlElement(name = "InSubsidyOrderIdSubsidy")
    protected int inSubsidyOrderIdSubsidy;
    @XmlElement(name = "InTransLoanAccountAccOpenDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTransLoanAccountAccOpenDt;
    @XmlElement(name = "InTransLoanAccountCurFxIntExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTransLoanAccountCurFxIntExpDt;
    @XmlElement(name = "InTransLoanAccountDrawdownFstAmn", required = true)
    protected BigDecimal inTransLoanAccountDrawdownFstAmn;
    @XmlElement(name = "InTransLoanAccountDrawdownFstDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTransLoanAccountDrawdownFstDt;
    @XmlElement(name = "InTransLoanAccountInstallNextDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTransLoanAccountInstallNextDt;
    @XmlElement(name = "InTransLoanAccountInstallPrevDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTransLoanAccountInstallPrevDt;
    @XmlElement(name = "InTransLoanAccountLstAprIntDbAmn", required = true)
    protected BigDecimal inTransLoanAccountLstAprIntDbAmn;
    @XmlElement(name = "InTransLoanAccountLstAprYear")
    protected short inTransLoanAccountLstAprYear;
    @XmlElement(name = "InTransLoanAccountLstAugIntDbAmn", required = true)
    protected BigDecimal inTransLoanAccountLstAugIntDbAmn;
    @XmlElement(name = "InTransLoanAccountLstAugYear")
    protected short inTransLoanAccountLstAugYear;
    @XmlElement(name = "InTransLoanAccountLstDecIntDbAmn", required = true)
    protected BigDecimal inTransLoanAccountLstDecIntDbAmn;
    @XmlElement(name = "InTransLoanAccountLstDecYear")
    protected short inTransLoanAccountLstDecYear;
    @XmlElement(name = "InTransLoanAccountLstFebIntDbAmn", required = true)
    protected BigDecimal inTransLoanAccountLstFebIntDbAmn;
    @XmlElement(name = "InTransLoanAccountLstFebYear")
    protected short inTransLoanAccountLstFebYear;
    @XmlElement(name = "InTransLoanAccountLstJanIntDbAmn", required = true)
    protected BigDecimal inTransLoanAccountLstJanIntDbAmn;
    @XmlElement(name = "InTransLoanAccountLstJanYear")
    protected short inTransLoanAccountLstJanYear;
    @XmlElement(name = "InTransLoanAccountLstJulIntDbAmn", required = true)
    protected BigDecimal inTransLoanAccountLstJulIntDbAmn;
    @XmlElement(name = "InTransLoanAccountLstJulYear")
    protected short inTransLoanAccountLstJulYear;
    @XmlElement(name = "InTransLoanAccountLstJunIntDbAmn", required = true)
    protected BigDecimal inTransLoanAccountLstJunIntDbAmn;
    @XmlElement(name = "InTransLoanAccountLstJunYear")
    protected short inTransLoanAccountLstJunYear;
    @XmlElement(name = "InTransLoanAccountLstMarIntDbAmn", required = true)
    protected BigDecimal inTransLoanAccountLstMarIntDbAmn;
    @XmlElement(name = "InTransLoanAccountLstMarYear")
    protected short inTransLoanAccountLstMarYear;
    @XmlElement(name = "InTransLoanAccountLstMayIntDbAmn", required = true)
    protected BigDecimal inTransLoanAccountLstMayIntDbAmn;
    @XmlElement(name = "InTransLoanAccountLstMayYear")
    protected short inTransLoanAccountLstMayYear;
    @XmlElement(name = "InTransLoanAccountLstNovIntDbAmn", required = true)
    protected BigDecimal inTransLoanAccountLstNovIntDbAmn;
    @XmlElement(name = "InTransLoanAccountLstNovYear")
    protected short inTransLoanAccountLstNovYear;
    @XmlElement(name = "InTransLoanAccountLstOctIntDbAmn", required = true)
    protected BigDecimal inTransLoanAccountLstOctIntDbAmn;
    @XmlElement(name = "InTransLoanAccountLstOctYear")
    protected short inTransLoanAccountLstOctYear;
    @XmlElement(name = "InTransLoanAccountLstSepIntDbAmn", required = true)
    protected BigDecimal inTransLoanAccountLstSepIntDbAmn;
    @XmlElement(name = "InTransLoanAccountLstSepYear")
    protected short inTransLoanAccountLstSepYear;
    @XmlElement(name = "InTransLoanAccountMoratorN128Rate", required = true)
    protected BigDecimal inTransLoanAccountMoratorN128Rate;
    @XmlElement(name = "InTransLoanAccountMoratorNrmRate", required = true)
    protected BigDecimal inTransLoanAccountMoratorNrmRate;
    @XmlElement(name = "InTransLoanAccountMoratorSprRate", required = true)
    protected BigDecimal inTransLoanAccountMoratorSprRate;
    @XmlElement(name = "InTransLoanAccountMpStartCapAmn", required = true)
    protected BigDecimal inTransLoanAccountMpStartCapAmn;
    @XmlElement(name = "InTransLoanAccountOldAccountCd")
    protected short inTransLoanAccountOldAccountCd;
    @XmlElement(name = "InTransLoanAccountOldAccountNum")
    protected String inTransLoanAccountOldAccountNum;
    @XmlElement(name = "InTransLoanAccountReqInstallSn")
    protected short inTransLoanAccountReqInstallSn;
    @XmlElement(name = "InTransLoanAccountTotCapAmn", required = true)
    protected BigDecimal inTransLoanAccountTotCapAmn;
    @XmlElement(name = "InTransLoanAccountTotComInCcAmn", required = true)
    protected BigDecimal inTransLoanAccountTotComInCcAmn;
    @XmlElement(name = "InTransLoanAccountTotCommissionAmn", required = true)
    protected BigDecimal inTransLoanAccountTotCommissionAmn;
    @XmlElement(name = "InTransLoanAccountTotConfirmAmn", required = true)
    protected BigDecimal inTransLoanAccountTotConfirmAmn;
    @XmlElement(name = "InTransLoanAccountTotDrawdownAmn", required = true)
    protected BigDecimal inTransLoanAccountTotDrawdownAmn;
    @XmlElement(name = "InTransLoanAccountTotExpInCcAmn", required = true)
    protected BigDecimal inTransLoanAccountTotExpInCcAmn;
    @XmlElement(name = "InTransLoanAccountTotExpenseAmn", required = true)
    protected BigDecimal inTransLoanAccountTotExpenseAmn;
    @XmlElement(name = "InTransLoanAccountTotNrmIntAmn", required = true)
    protected BigDecimal inTransLoanAccountTotNrmIntAmn;
    @XmlElement(name = "InTransLoanAccountTotPnlIntAmn", required = true)
    protected BigDecimal inTransLoanAccountTotPnlIntAmn;
    @XmlElement(name = "InTransLoanAccountTotPubCommAmn", required = true)
    protected BigDecimal inTransLoanAccountTotPubCommAmn;
    @XmlElement(name = "InTransLoanAccountTotSubsIntAmn", required = true)
    protected BigDecimal inTransLoanAccountTotSubsIntAmn;
    @XmlElement(name = "InTransLoanAccountTotThrdprtAmn", required = true)
    protected BigDecimal inTransLoanAccountTotThrdprtAmn;
    @XmlElement(name = "InTransProdUnitOperationStatusFlg")
    protected String inTransProdUnitOperationStatusFlg;
    @XmlElement(name = "InTrxCurrencyIdCurrency")
    protected int inTrxCurrencyIdCurrency;
    @XmlElement(name = "InTrxCurrencyShortDescr")
    protected String inTrxCurrencyShortDescr;
    @XmlElement(name = "InTrxJustificIdJustific")
    protected int inTrxJustificIdJustific;
    @XmlElement(name = "InTrxPrftTransactionIdTransact")
    protected int inTrxPrftTransactionIdTransact;
    @XmlElement(name = "InTrxSsSecurityCmcbPrftSystem")
    protected short inTrxSsSecurityCmcbPrftSystem;
    @XmlElement(name = "InTrxTerminalTerminalNumber")
    protected String inTrxTerminalTerminalNumber;
    @XmlElement(name = "InUnionCustomerCustId")
    protected int inUnionCustomerCustId;
    @XmlElement(name = "InUpdateCauseGenericDetailSerialNum")
    protected int inUpdateCauseGenericDetailSerialNum;

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
     * Gets the value of the profitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfitsAccountNumber() {
        return profitsAccountNumber;
    }

    /**
     * Sets the value of the profitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfitsAccountNumber(String value) {
        this.profitsAccountNumber = value;
    }

    /**
     * Gets the value of the profitsAccountCd property.
     * 
     */
    public short getProfitsAccountCd() {
        return profitsAccountCd;
    }

    /**
     * Sets the value of the profitsAccountCd property.
     * 
     */
    public void setProfitsAccountCd(short value) {
        this.profitsAccountCd = value;
    }

    /**
     * Gets the value of the inAdjustGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAdjustGenericDetailDescription() {
        return inAdjustGenericDetailDescription;
    }

    /**
     * Sets the value of the inAdjustGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAdjustGenericDetailDescription(String value) {
        this.inAdjustGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inAdjustGenericDetailSerialNum property.
     * 
     */
    public int getInAdjustGenericDetailSerialNum() {
        return inAdjustGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inAdjustGenericDetailSerialNum property.
     * 
     */
    public void setInAdjustGenericDetailSerialNum(int value) {
        this.inAdjustGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inAdjustInfoIefSuppliedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInAdjustInfoIefSuppliedDate() {
        return inAdjustInfoIefSuppliedDate;
    }

    /**
     * Sets the value of the inAdjustInfoIefSuppliedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInAdjustInfoIefSuppliedDate(XMLGregorianCalendar value) {
        this.inAdjustInfoIefSuppliedDate = value;
    }

    /**
     * Gets the value of the inAdjustInfoIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAdjustInfoIefSuppliedFlag() {
        return inAdjustInfoIefSuppliedFlag;
    }

    /**
     * Sets the value of the inAdjustInfoIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAdjustInfoIefSuppliedFlag(String value) {
        this.inAdjustInfoIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inAgrUnitCode property.
     * 
     */
    public int getInAgrUnitCode() {
        return inAgrUnitCode;
    }

    /**
     * Sets the value of the inAgrUnitCode property.
     * 
     */
    public void setInAgrUnitCode(int value) {
        this.inAgrUnitCode = value;
    }

    /**
     * Gets the value of the inAgreementAgrMembershipSn property.
     * 
     */
    public int getInAgreementAgrMembershipSn() {
        return inAgreementAgrMembershipSn;
    }

    /**
     * Sets the value of the inAgreementAgrMembershipSn property.
     * 
     */
    public void setInAgreementAgrMembershipSn(int value) {
        this.inAgreementAgrMembershipSn = value;
    }

    /**
     * Gets the value of the inAgreementAgrSn property.
     * 
     */
    public int getInAgreementAgrSn() {
        return inAgreementAgrSn;
    }

    /**
     * Sets the value of the inAgreementAgrSn property.
     * 
     */
    public void setInAgreementAgrSn(int value) {
        this.inAgreementAgrSn = value;
    }

    /**
     * Gets the value of the inAgreementAgrYear property.
     * 
     */
    public short getInAgreementAgrYear() {
        return inAgreementAgrYear;
    }

    /**
     * Sets the value of the inAgreementAgrYear property.
     * 
     */
    public void setInAgreementAgrYear(short value) {
        this.inAgreementAgrYear = value;
    }

    /**
     * Gets the value of the inAsoCustomerCustId property.
     * 
     */
    public int getInAsoCustomerCustId() {
        return inAsoCustomerCustId;
    }

    /**
     * Sets the value of the inAsoCustomerCustId property.
     * 
     */
    public void setInAsoCustomerCustId(int value) {
        this.inAsoCustomerCustId = value;
    }

    /**
     * Gets the value of the inAuthGrantedIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthGrantedIefSuppliedFlag() {
        return inAuthGrantedIefSuppliedFlag;
    }

    /**
     * Sets the value of the inAuthGrantedIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthGrantedIefSuppliedFlag(String value) {
        this.inAuthGrantedIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inAuthIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthIefSuppliedFlag() {
        return inAuthIefSuppliedFlag;
    }

    /**
     * Sets the value of the inAuthIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthIefSuppliedFlag(String value) {
        this.inAuthIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inBankSectorGenericDetailSerialNum property.
     * 
     */
    public int getInBankSectorGenericDetailSerialNum() {
        return inBankSectorGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inBankSectorGenericDetailSerialNum property.
     * 
     */
    public void setInBankSectorGenericDetailSerialNum(int value) {
        this.inBankSectorGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inBatchParametersDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBatchParametersDateFrom() {
        return inBatchParametersDateFrom;
    }

    /**
     * Sets the value of the inBatchParametersDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBatchParametersDateFrom(XMLGregorianCalendar value) {
        this.inBatchParametersDateFrom = value;
    }

    /**
     * Gets the value of the inBatchParametersDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBatchParametersDateTo() {
        return inBatchParametersDateTo;
    }

    /**
     * Sets the value of the inBatchParametersDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBatchParametersDateTo(XMLGregorianCalendar value) {
        this.inBatchParametersDateTo = value;
    }

    /**
     * Gets the value of the inBatchParametersOnRequestFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBatchParametersOnRequestFlag() {
        return inBatchParametersOnRequestFlag;
    }

    /**
     * Sets the value of the inBatchParametersOnRequestFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBatchParametersOnRequestFlag(String value) {
        this.inBatchParametersOnRequestFlag = value;
    }

    /**
     * Gets the value of the inBenefIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBenefIefSuppliedFlag() {
        return inBenefIefSuppliedFlag;
    }

    /**
     * Sets the value of the inBenefIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBenefIefSuppliedFlag(String value) {
        this.inBenefIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inCbpurpGenericDetailSerialNum property.
     * 
     */
    public int getInCbpurpGenericDetailSerialNum() {
        return inCbpurpGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inCbpurpGenericDetailSerialNum property.
     * 
     */
    public void setInCbpurpGenericDetailSerialNum(int value) {
        this.inCbpurpGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inClassCodeGenericDetailSerialNum property.
     * 
     */
    public int getInClassCodeGenericDetailSerialNum() {
        return inClassCodeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inClassCodeGenericDetailSerialNum property.
     * 
     */
    public void setInClassCodeGenericDetailSerialNum(int value) {
        this.inClassCodeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inCloanGenericDetailSerialNum property.
     * 
     */
    public int getInCloanGenericDetailSerialNum() {
        return inCloanGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inCloanGenericDetailSerialNum property.
     * 
     */
    public void setInCloanGenericDetailSerialNum(int value) {
        this.inCloanGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inCustomerCustId property.
     * 
     */
    public int getInCustomerCustId() {
        return inCustomerCustId;
    }

    /**
     * Sets the value of the inCustomerCustId property.
     * 
     */
    public void setInCustomerCustId(int value) {
        this.inCustomerCustId = value;
    }

    /**
     * Gets the value of the inDepSnLoansStandingAccSnDep property.
     * 
     */
    public double getInDepSnLoansStandingAccSnDep() {
        return inDepSnLoansStandingAccSnDep;
    }

    /**
     * Sets the value of the inDepSnLoansStandingAccSnDep property.
     * 
     */
    public void setInDepSnLoansStandingAccSnDep(double value) {
        this.inDepSnLoansStandingAccSnDep = value;
    }

    /**
     * Gets the value of the inDepositAccountCurrencyIdCurrency property.
     * 
     */
    public int getInDepositAccountCurrencyIdCurrency() {
        return inDepositAccountCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inDepositAccountCurrencyIdCurrency property.
     * 
     */
    public void setInDepositAccountCurrencyIdCurrency(int value) {
        this.inDepositAccountCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inDepositAccountCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountCurrencyShortDescr() {
        return inDepositAccountCurrencyShortDescr;
    }

    /**
     * Sets the value of the inDepositAccountCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountCurrencyShortDescr(String value) {
        this.inDepositAccountCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inFinancialSectorGenericDetailSerialNum property.
     * 
     */
    public int getInFinancialSectorGenericDetailSerialNum() {
        return inFinancialSectorGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inFinancialSectorGenericDetailSerialNum property.
     * 
     */
    public void setInFinancialSectorGenericDetailSerialNum(int value) {
        this.inFinancialSectorGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inFixedLnsInterestDurationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFixedLnsInterestDurationUnit() {
        return inFixedLnsInterestDurationUnit;
    }

    /**
     * Sets the value of the inFixedLnsInterestDurationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFixedLnsInterestDurationUnit(String value) {
        this.inFixedLnsInterestDurationUnit = value;
    }

    /**
     * Gets the value of the inFixedLnsInterestIdInterest property.
     * 
     */
    public int getInFixedLnsInterestIdInterest() {
        return inFixedLnsInterestIdInterest;
    }

    /**
     * Sets the value of the inFixedLnsInterestIdInterest property.
     * 
     */
    public void setInFixedLnsInterestIdInterest(int value) {
        this.inFixedLnsInterestIdInterest = value;
    }

    /**
     * Gets the value of the inFixedLnsInterestIntDuration property.
     * 
     */
    public short getInFixedLnsInterestIntDuration() {
        return inFixedLnsInterestIntDuration;
    }

    /**
     * Sets the value of the inFixedLnsInterestIntDuration property.
     * 
     */
    public void setInFixedLnsInterestIntDuration(short value) {
        this.inFixedLnsInterestIntDuration = value;
    }

    /**
     * Gets the value of the inFloatingLnsInterestIdInterest property.
     * 
     */
    public int getInFloatingLnsInterestIdInterest() {
        return inFloatingLnsInterestIdInterest;
    }

    /**
     * Sets the value of the inFloatingLnsInterestIdInterest property.
     * 
     */
    public void setInFloatingLnsInterestIdInterest(int value) {
        this.inFloatingLnsInterestIdInterest = value;
    }

    /**
     * Gets the value of the inIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIefSuppliedCommand() {
        return inIefSuppliedCommand;
    }

    /**
     * Sets the value of the inIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIefSuppliedCommand(String value) {
        this.inIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the inLimitCurrencyDisplayedDecimalPlaces property.
     * 
     */
    public short getInLimitCurrencyDisplayedDecimalPlaces() {
        return inLimitCurrencyDisplayedDecimalPlaces;
    }

    /**
     * Sets the value of the inLimitCurrencyDisplayedDecimalPlaces property.
     * 
     */
    public void setInLimitCurrencyDisplayedDecimalPlaces(short value) {
        this.inLimitCurrencyDisplayedDecimalPlaces = value;
    }

    /**
     * Gets the value of the inLimitCurrencyIdCurrency property.
     * 
     */
    public int getInLimitCurrencyIdCurrency() {
        return inLimitCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inLimitCurrencyIdCurrency property.
     * 
     */
    public void setInLimitCurrencyIdCurrency(int value) {
        this.inLimitCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inLoanAsoInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAsoInd() {
        return inLoanAsoInd;
    }

    /**
     * Sets the value of the inLoanAsoInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAsoInd(String value) {
        this.inLoanAsoInd = value;
    }

    /**
     * Gets the value of the inLoanAtmCardFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAtmCardFlag() {
        return inLoanAtmCardFlag;
    }

    /**
     * Sets the value of the inLoanAtmCardFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAtmCardFlag(String value) {
        this.inLoanAtmCardFlag = value;
    }

    /**
     * Gets the value of the inLoanCostOfOptionMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanCostOfOptionMax() {
        return inLoanCostOfOptionMax;
    }

    /**
     * Sets the value of the inLoanCostOfOptionMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanCostOfOptionMax(BigDecimal value) {
        this.inLoanCostOfOptionMax = value;
    }

    /**
     * Gets the value of the inLoanCostOfOptionMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanCostOfOptionMin() {
        return inLoanCostOfOptionMin;
    }

    /**
     * Sets the value of the inLoanCostOfOptionMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanCostOfOptionMin(BigDecimal value) {
        this.inLoanCostOfOptionMin = value;
    }

    /**
     * Gets the value of the inLoanCurFxIntInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanCurFxIntInd() {
        return inLoanCurFxIntInd;
    }

    /**
     * Sets the value of the inLoanCurFxIntInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanCurFxIntInd(String value) {
        this.inLoanCurFxIntInd = value;
    }

    /**
     * Gets the value of the inLoanInstallMechFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanInstallMechFlg() {
        return inLoanInstallMechFlg;
    }

    /**
     * Sets the value of the inLoanInstallMechFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanInstallMechFlg(String value) {
        this.inLoanInstallMechFlg = value;
    }

    /**
     * Gets the value of the inLoanInstantCreditFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanInstantCreditFlg() {
        return inLoanInstantCreditFlg;
    }

    /**
     * Sets the value of the inLoanInstantCreditFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanInstantCreditFlg(String value) {
        this.inLoanInstantCreditFlg = value;
    }

    /**
     * Gets the value of the inLoanIntCapitalFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanIntCapitalFlg() {
        return inLoanIntCapitalFlg;
    }

    /**
     * Sets the value of the inLoanIntCapitalFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanIntCapitalFlg(String value) {
        this.inLoanIntCapitalFlg = value;
    }

    /**
     * Gets the value of the inLoanIntPayableFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanIntPayableFlg() {
        return inLoanIntPayableFlg;
    }

    /**
     * Sets the value of the inLoanIntPayableFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanIntPayableFlg(String value) {
        this.inLoanIntPayableFlg = value;
    }

    /**
     * Gets the value of the inLoanLoanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanLoanType() {
        return inLoanLoanType;
    }

    /**
     * Sets the value of the inLoanLoanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanLoanType(String value) {
        this.inLoanLoanType = value;
    }

    /**
     * Gets the value of the inLoanNonIntCapitFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanNonIntCapitFlg() {
        return inLoanNonIntCapitFlg;
    }

    /**
     * Sets the value of the inLoanNonIntCapitFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanNonIntCapitFlg(String value) {
        this.inLoanNonIntCapitFlg = value;
    }

    /**
     * Gets the value of the inLoanRenewalInterFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanRenewalInterFlg() {
        return inLoanRenewalInterFlg;
    }

    /**
     * Sets the value of the inLoanRenewalInterFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanRenewalInterFlg(String value) {
        this.inLoanRenewalInterFlg = value;
    }

    /**
     * Gets the value of the inLoanSelectIntFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanSelectIntFlg() {
        return inLoanSelectIntFlg;
    }

    /**
     * Sets the value of the inLoanSelectIntFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanSelectIntFlg(String value) {
        this.inLoanSelectIntFlg = value;
    }

    /**
     * Gets the value of the inLoanTolDays1 property.
     * 
     */
    public short getInLoanTolDays1() {
        return inLoanTolDays1;
    }

    /**
     * Sets the value of the inLoanTolDays1 property.
     * 
     */
    public void setInLoanTolDays1(short value) {
        this.inLoanTolDays1 = value;
    }

    /**
     * Gets the value of the inLoanTolDays2 property.
     * 
     */
    public short getInLoanTolDays2() {
        return inLoanTolDays2;
    }

    /**
     * Sets the value of the inLoanTolDays2 property.
     * 
     */
    public void setInLoanTolDays2(short value) {
        this.inLoanTolDays2 = value;
    }

    /**
     * Gets the value of the inLoanTolDays3 property.
     * 
     */
    public short getInLoanTolDays3() {
        return inLoanTolDays3;
    }

    /**
     * Sets the value of the inLoanTolDays3 property.
     * 
     */
    public void setInLoanTolDays3(short value) {
        this.inLoanTolDays3 = value;
    }

    /**
     * Gets the value of the inLoanTolDays5 property.
     * 
     */
    public short getInLoanTolDays5() {
        return inLoanTolDays5;
    }

    /**
     * Sets the value of the inLoanTolDays5 property.
     * 
     */
    public void setInLoanTolDays5(short value) {
        this.inLoanTolDays5 = value;
    }

    /**
     * Gets the value of the inLoanToleranceDays property.
     * 
     */
    public short getInLoanToleranceDays() {
        return inLoanToleranceDays;
    }

    /**
     * Sets the value of the inLoanToleranceDays property.
     * 
     */
    public void setInLoanToleranceDays(short value) {
        this.inLoanToleranceDays = value;
    }

    /**
     * Gets the value of the inLoanAccUnitCode property.
     * 
     */
    public int getInLoanAccUnitCode() {
        return inLoanAccUnitCode;
    }

    /**
     * Sets the value of the inLoanAccUnitCode property.
     * 
     */
    public void setInLoanAccUnitCode(int value) {
        this.inLoanAccUnitCode = value;
    }

    /**
     * Gets the value of the inLoanAccountAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountAccStatus() {
        return inLoanAccountAccStatus;
    }

    /**
     * Sets the value of the inLoanAccountAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountAccStatus(String value) {
        this.inLoanAccountAccStatus = value;
    }

    /**
     * Gets the value of the inLoanAccountCurFxIntExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanAccountCurFxIntExpDt() {
        return inLoanAccountCurFxIntExpDt;
    }

    /**
     * Sets the value of the inLoanAccountCurFxIntExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanAccountCurFxIntExpDt(XMLGregorianCalendar value) {
        this.inLoanAccountCurFxIntExpDt = value;
    }

    /**
     * Gets the value of the inLoanAccountCurFxIntScalDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanAccountCurFxIntScalDt() {
        return inLoanAccountCurFxIntScalDt;
    }

    /**
     * Sets the value of the inLoanAccountCurFxIntScalDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanAccountCurFxIntScalDt(XMLGregorianCalendar value) {
        this.inLoanAccountCurFxIntScalDt = value;
    }

    /**
     * Gets the value of the inLoanAccountInterRateSprd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountInterRateSprd() {
        return inLoanAccountInterRateSprd;
    }

    /**
     * Sets the value of the inLoanAccountInterRateSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountInterRateSprd(BigDecimal value) {
        this.inLoanAccountInterRateSprd = value;
    }

    /**
     * Gets the value of the inLoanAccountLoanStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountLoanStatus() {
        return inLoanAccountLoanStatus;
    }

    /**
     * Sets the value of the inLoanAccountLoanStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountLoanStatus(String value) {
        this.inLoanAccountLoanStatus = value;
    }

    /**
     * Gets the value of the inLoanAccountSpreadEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanAccountSpreadEndDt() {
        return inLoanAccountSpreadEndDt;
    }

    /**
     * Sets the value of the inLoanAccountSpreadEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanAccountSpreadEndDt(XMLGregorianCalendar value) {
        this.inLoanAccountSpreadEndDt = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoAccTransitionFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountInfoAccTransitionFlg() {
        return inLoanAccountInfoAccTransitionFlg;
    }

    /**
     * Sets the value of the inLoanAccountInfoAccTransitionFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountInfoAccTransitionFlg(String value) {
        this.inLoanAccountInfoAccTransitionFlg = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoAdjustmentDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanAccountInfoAdjustmentDt() {
        return inLoanAccountInfoAdjustmentDt;
    }

    /**
     * Sets the value of the inLoanAccountInfoAdjustmentDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanAccountInfoAdjustmentDt(XMLGregorianCalendar value) {
        this.inLoanAccountInfoAdjustmentDt = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoAgentBank property.
     * 
     */
    public int getInLoanAccountInfoAgentBank() {
        return inLoanAccountInfoAgentBank;
    }

    /**
     * Sets the value of the inLoanAccountInfoAgentBank property.
     * 
     */
    public void setInLoanAccountInfoAgentBank(int value) {
        this.inLoanAccountInfoAgentBank = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoAutFixIntRenew property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountInfoAutFixIntRenew() {
        return inLoanAccountInfoAutFixIntRenew;
    }

    /**
     * Sets the value of the inLoanAccountInfoAutFixIntRenew property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountInfoAutFixIntRenew(String value) {
        this.inLoanAccountInfoAutFixIntRenew = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoCrIntSprd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountInfoCrIntSprd() {
        return inLoanAccountInfoCrIntSprd;
    }

    /**
     * Sets the value of the inLoanAccountInfoCrIntSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountInfoCrIntSprd(BigDecimal value) {
        this.inLoanAccountInfoCrIntSprd = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoCrSprdEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanAccountInfoCrSprdEndDt() {
        return inLoanAccountInfoCrSprdEndDt;
    }

    /**
     * Sets the value of the inLoanAccountInfoCrSprdEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanAccountInfoCrSprdEndDt(XMLGregorianCalendar value) {
        this.inLoanAccountInfoCrSprdEndDt = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoCrSprdStDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanAccountInfoCrSprdStDt() {
        return inLoanAccountInfoCrSprdStDt;
    }

    /**
     * Sets the value of the inLoanAccountInfoCrSprdStDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanAccountInfoCrSprdStDt(XMLGregorianCalendar value) {
        this.inLoanAccountInfoCrSprdStDt = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoCreditIntId property.
     * 
     */
    public int getInLoanAccountInfoCreditIntId() {
        return inLoanAccountInfoCreditIntId;
    }

    /**
     * Sets the value of the inLoanAccountInfoCreditIntId property.
     * 
     */
    public void setInLoanAccountInfoCreditIntId(int value) {
        this.inLoanAccountInfoCreditIntId = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoDealerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountInfoDealerCode() {
        return inLoanAccountInfoDealerCode;
    }

    /**
     * Sets the value of the inLoanAccountInfoDealerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountInfoDealerCode(String value) {
        this.inLoanAccountInfoDealerCode = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoDiffIntAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountInfoDiffIntAlgorithm() {
        return inLoanAccountInfoDiffIntAlgorithm;
    }

    /**
     * Sets the value of the inLoanAccountInfoDiffIntAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountInfoDiffIntAlgorithm(String value) {
        this.inLoanAccountInfoDiffIntAlgorithm = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoFluctuationRange property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountInfoFluctuationRange() {
        return inLoanAccountInfoFluctuationRange;
    }

    /**
     * Sets the value of the inLoanAccountInfoFluctuationRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountInfoFluctuationRange(BigDecimal value) {
        this.inLoanAccountInfoFluctuationRange = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoGuarActNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountInfoGuarActNum() {
        return inLoanAccountInfoGuarActNum;
    }

    /**
     * Sets the value of the inLoanAccountInfoGuarActNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountInfoGuarActNum(String value) {
        this.inLoanAccountInfoGuarActNum = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoGuarComPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountInfoGuarComPerc() {
        return inLoanAccountInfoGuarComPerc;
    }

    /**
     * Sets the value of the inLoanAccountInfoGuarComPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountInfoGuarComPerc(BigDecimal value) {
        this.inLoanAccountInfoGuarComPerc = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoGuarExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanAccountInfoGuarExpDt() {
        return inLoanAccountInfoGuarExpDt;
    }

    /**
     * Sets the value of the inLoanAccountInfoGuarExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanAccountInfoGuarExpDt(XMLGregorianCalendar value) {
        this.inLoanAccountInfoGuarExpDt = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoInitialInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountInfoInitialInterest() {
        return inLoanAccountInfoInitialInterest;
    }

    /**
     * Sets the value of the inLoanAccountInfoInitialInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountInfoInitialInterest(BigDecimal value) {
        this.inLoanAccountInfoInitialInterest = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoInstallCalcPeriod property.
     * 
     */
    public int getInLoanAccountInfoInstallCalcPeriod() {
        return inLoanAccountInfoInstallCalcPeriod;
    }

    /**
     * Sets the value of the inLoanAccountInfoInstallCalcPeriod property.
     * 
     */
    public void setInLoanAccountInfoInstallCalcPeriod(int value) {
        this.inLoanAccountInfoInstallCalcPeriod = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoInstallFixedAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountInfoInstallFixedAmn() {
        return inLoanAccountInfoInstallFixedAmn;
    }

    /**
     * Sets the value of the inLoanAccountInfoInstallFixedAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountInfoInstallFixedAmn(BigDecimal value) {
        this.inLoanAccountInfoInstallFixedAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoLastRemindLetterDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanAccountInfoLastRemindLetterDate() {
        return inLoanAccountInfoLastRemindLetterDate;
    }

    /**
     * Sets the value of the inLoanAccountInfoLastRemindLetterDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanAccountInfoLastRemindLetterDate(XMLGregorianCalendar value) {
        this.inLoanAccountInfoLastRemindLetterDate = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoLastRemindLetterType property.
     * 
     */
    public short getInLoanAccountInfoLastRemindLetterType() {
        return inLoanAccountInfoLastRemindLetterType;
    }

    /**
     * Sets the value of the inLoanAccountInfoLastRemindLetterType property.
     * 
     */
    public void setInLoanAccountInfoLastRemindLetterType(short value) {
        this.inLoanAccountInfoLastRemindLetterType = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoLoanAccPayroll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountInfoLoanAccPayroll() {
        return inLoanAccountInfoLoanAccPayroll;
    }

    /**
     * Sets the value of the inLoanAccountInfoLoanAccPayroll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountInfoLoanAccPayroll(String value) {
        this.inLoanAccountInfoLoanAccPayroll = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoMaintainEqInst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountInfoMaintainEqInst() {
        return inLoanAccountInfoMaintainEqInst;
    }

    /**
     * Sets the value of the inLoanAccountInfoMaintainEqInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountInfoMaintainEqInst(String value) {
        this.inLoanAccountInfoMaintainEqInst = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoMoratIntPayFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountInfoMoratIntPayFlg() {
        return inLoanAccountInfoMoratIntPayFlg;
    }

    /**
     * Sets the value of the inLoanAccountInfoMoratIntPayFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountInfoMoratIntPayFlg(String value) {
        this.inLoanAccountInfoMoratIntPayFlg = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoMoratoriumIntDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanAccountInfoMoratoriumIntDt() {
        return inLoanAccountInfoMoratoriumIntDt;
    }

    /**
     * Sets the value of the inLoanAccountInfoMoratoriumIntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanAccountInfoMoratoriumIntDt(XMLGregorianCalendar value) {
        this.inLoanAccountInfoMoratoriumIntDt = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoMoratoriumIntFrq property.
     * 
     */
    public short getInLoanAccountInfoMoratoriumIntFrq() {
        return inLoanAccountInfoMoratoriumIntFrq;
    }

    /**
     * Sets the value of the inLoanAccountInfoMoratoriumIntFrq property.
     * 
     */
    public void setInLoanAccountInfoMoratoriumIntFrq(short value) {
        this.inLoanAccountInfoMoratoriumIntFrq = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoNo30DaysLetterFlg property.
     * 
     */
    public short getInLoanAccountInfoNo30DaysLetterFlg() {
        return inLoanAccountInfoNo30DaysLetterFlg;
    }

    /**
     * Sets the value of the inLoanAccountInfoNo30DaysLetterFlg property.
     * 
     */
    public void setInLoanAccountInfoNo30DaysLetterFlg(short value) {
        this.inLoanAccountInfoNo30DaysLetterFlg = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoNrmAccrualAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountInfoNrmAccrualAmn() {
        return inLoanAccountInfoNrmAccrualAmn;
    }

    /**
     * Sets the value of the inLoanAccountInfoNrmAccrualAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountInfoNrmAccrualAmn(BigDecimal value) {
        this.inLoanAccountInfoNrmAccrualAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoNrmAccrualLstDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanAccountInfoNrmAccrualLstDt() {
        return inLoanAccountInfoNrmAccrualLstDt;
    }

    /**
     * Sets the value of the inLoanAccountInfoNrmAccrualLstDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanAccountInfoNrmAccrualLstDt(XMLGregorianCalendar value) {
        this.inLoanAccountInfoNrmAccrualLstDt = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoNrmRlUrlFlg property.
     * 
     */
    public short getInLoanAccountInfoNrmRlUrlFlg() {
        return inLoanAccountInfoNrmRlUrlFlg;
    }

    /**
     * Sets the value of the inLoanAccountInfoNrmRlUrlFlg property.
     * 
     */
    public void setInLoanAccountInfoNrmRlUrlFlg(short value) {
        this.inLoanAccountInfoNrmRlUrlFlg = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoOvAccrualAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountInfoOvAccrualAmn() {
        return inLoanAccountInfoOvAccrualAmn;
    }

    /**
     * Sets the value of the inLoanAccountInfoOvAccrualAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountInfoOvAccrualAmn(BigDecimal value) {
        this.inLoanAccountInfoOvAccrualAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoOvAccrualLstDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanAccountInfoOvAccrualLstDt() {
        return inLoanAccountInfoOvAccrualLstDt;
    }

    /**
     * Sets the value of the inLoanAccountInfoOvAccrualLstDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanAccountInfoOvAccrualLstDt(XMLGregorianCalendar value) {
        this.inLoanAccountInfoOvAccrualLstDt = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoOvRlUrlFlg property.
     * 
     */
    public short getInLoanAccountInfoOvRlUrlFlg() {
        return inLoanAccountInfoOvRlUrlFlg;
    }

    /**
     * Sets the value of the inLoanAccountInfoOvRlUrlFlg property.
     * 
     */
    public void setInLoanAccountInfoOvRlUrlFlg(short value) {
        this.inLoanAccountInfoOvRlUrlFlg = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoPayrollAgrCode property.
     * 
     */
    public int getInLoanAccountInfoPayrollAgrCode() {
        return inLoanAccountInfoPayrollAgrCode;
    }

    /**
     * Sets the value of the inLoanAccountInfoPayrollAgrCode property.
     * 
     */
    public void setInLoanAccountInfoPayrollAgrCode(int value) {
        this.inLoanAccountInfoPayrollAgrCode = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoPayrollConnFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountInfoPayrollConnFlg() {
        return inLoanAccountInfoPayrollConnFlg;
    }

    /**
     * Sets the value of the inLoanAccountInfoPayrollConnFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountInfoPayrollConnFlg(String value) {
        this.inLoanAccountInfoPayrollConnFlg = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoPayrollDiasCode property.
     * 
     */
    public double getInLoanAccountInfoPayrollDiasCode() {
        return inLoanAccountInfoPayrollDiasCode;
    }

    /**
     * Sets the value of the inLoanAccountInfoPayrollDiasCode property.
     * 
     */
    public void setInLoanAccountInfoPayrollDiasCode(double value) {
        this.inLoanAccountInfoPayrollDiasCode = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoPayrollIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountInfoPayrollIdNo() {
        return inLoanAccountInfoPayrollIdNo;
    }

    /**
     * Sets the value of the inLoanAccountInfoPayrollIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountInfoPayrollIdNo(String value) {
        this.inLoanAccountInfoPayrollIdNo = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoProvisionChgFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountInfoProvisionChgFlg() {
        return inLoanAccountInfoProvisionChgFlg;
    }

    /**
     * Sets the value of the inLoanAccountInfoProvisionChgFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountInfoProvisionChgFlg(String value) {
        this.inLoanAccountInfoProvisionChgFlg = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoProvisionCurrPerc property.
     * 
     */
    public int getInLoanAccountInfoProvisionCurrPerc() {
        return inLoanAccountInfoProvisionCurrPerc;
    }

    /**
     * Sets the value of the inLoanAccountInfoProvisionCurrPerc property.
     * 
     */
    public void setInLoanAccountInfoProvisionCurrPerc(int value) {
        this.inLoanAccountInfoProvisionCurrPerc = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoProvisionJustific property.
     * 
     */
    public int getInLoanAccountInfoProvisionJustific() {
        return inLoanAccountInfoProvisionJustific;
    }

    /**
     * Sets the value of the inLoanAccountInfoProvisionJustific property.
     * 
     */
    public void setInLoanAccountInfoProvisionJustific(int value) {
        this.inLoanAccountInfoProvisionJustific = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoProvisionMaxPerc property.
     * 
     */
    public int getInLoanAccountInfoProvisionMaxPerc() {
        return inLoanAccountInfoProvisionMaxPerc;
    }

    /**
     * Sets the value of the inLoanAccountInfoProvisionMaxPerc property.
     * 
     */
    public void setInLoanAccountInfoProvisionMaxPerc(int value) {
        this.inLoanAccountInfoProvisionMaxPerc = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoRateApprovalNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountInfoRateApprovalNum() {
        return inLoanAccountInfoRateApprovalNum;
    }

    /**
     * Sets the value of the inLoanAccountInfoRateApprovalNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountInfoRateApprovalNum(String value) {
        this.inLoanAccountInfoRateApprovalNum = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoRepaymentSchFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountInfoRepaymentSchFlg() {
        return inLoanAccountInfoRepaymentSchFlg;
    }

    /**
     * Sets the value of the inLoanAccountInfoRepaymentSchFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountInfoRepaymentSchFlg(String value) {
        this.inLoanAccountInfoRepaymentSchFlg = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoSelectedBankRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountInfoSelectedBankRate() {
        return inLoanAccountInfoSelectedBankRate;
    }

    /**
     * Sets the value of the inLoanAccountInfoSelectedBankRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountInfoSelectedBankRate(BigDecimal value) {
        this.inLoanAccountInfoSelectedBankRate = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoSelectedNormalRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountInfoSelectedNormalRate() {
        return inLoanAccountInfoSelectedNormalRate;
    }

    /**
     * Sets the value of the inLoanAccountInfoSelectedNormalRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountInfoSelectedNormalRate(BigDecimal value) {
        this.inLoanAccountInfoSelectedNormalRate = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoSpreadStDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanAccountInfoSpreadStDt() {
        return inLoanAccountInfoSpreadStDt;
    }

    /**
     * Sets the value of the inLoanAccountInfoSpreadStDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanAccountInfoSpreadStDt(XMLGregorianCalendar value) {
        this.inLoanAccountInfoSpreadStDt = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoTransactInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountInfoTransactInd() {
        return inLoanAccountInfoTransactInd;
    }

    /**
     * Sets the value of the inLoanAccountInfoTransactInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountInfoTransactInd(String value) {
        this.inLoanAccountInfoTransactInd = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoTransactSm property.
     * 
     */
    public int getInLoanAccountInfoTransactSm() {
        return inLoanAccountInfoTransactSm;
    }

    /**
     * Sets the value of the inLoanAccountInfoTransactSm property.
     * 
     */
    public void setInLoanAccountInfoTransactSm(int value) {
        this.inLoanAccountInfoTransactSm = value;
    }

    /**
     * Gets the value of the inLoanProductIdProduct property.
     * 
     */
    public int getInLoanProductIdProduct() {
        return inLoanProductIdProduct;
    }

    /**
     * Sets the value of the inLoanProductIdProduct property.
     * 
     */
    public void setInLoanProductIdProduct(int value) {
        this.inLoanProductIdProduct = value;
    }

    /**
     * Gets the value of the inLoanProductValidityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanProductValidityDate() {
        return inLoanProductValidityDate;
    }

    /**
     * Sets the value of the inLoanProductValidityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanProductValidityDate(XMLGregorianCalendar value) {
        this.inLoanProductValidityDate = value;
    }

    /**
     * Gets the value of the inLoanPurposeGenericDetailSerialNum property.
     * 
     */
    public int getInLoanPurposeGenericDetailSerialNum() {
        return inLoanPurposeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inLoanPurposeGenericDetailSerialNum property.
     * 
     */
    public void setInLoanPurposeGenericDetailSerialNum(int value) {
        this.inLoanPurposeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inLogMntRecordingAuthorizer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogMntRecordingAuthorizer1() {
        return inLogMntRecordingAuthorizer1;
    }

    /**
     * Sets the value of the inLogMntRecordingAuthorizer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogMntRecordingAuthorizer1(String value) {
        this.inLogMntRecordingAuthorizer1 = value;
    }

    /**
     * Gets the value of the inLogMntRecordingAuthorizer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogMntRecordingAuthorizer2() {
        return inLogMntRecordingAuthorizer2;
    }

    /**
     * Sets the value of the inLogMntRecordingAuthorizer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogMntRecordingAuthorizer2(String value) {
        this.inLogMntRecordingAuthorizer2 = value;
    }

    /**
     * Gets the value of the inLogMntRecordingPrftSystem property.
     * 
     */
    public short getInLogMntRecordingPrftSystem() {
        return inLogMntRecordingPrftSystem;
    }

    /**
     * Sets the value of the inLogMntRecordingPrftSystem property.
     * 
     */
    public void setInLogMntRecordingPrftSystem(short value) {
        this.inLogMntRecordingPrftSystem = value;
    }

    /**
     * Gets the value of the inLogMntRecordingReversalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogMntRecordingReversalFlag() {
        return inLogMntRecordingReversalFlag;
    }

    /**
     * Sets the value of the inLogMntRecordingReversalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogMntRecordingReversalFlag(String value) {
        this.inLogMntRecordingReversalFlag = value;
    }

    /**
     * Gets the value of the inLogMntRecordingTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogMntRecordingTerminalNumber() {
        return inLogMntRecordingTerminalNumber;
    }

    /**
     * Sets the value of the inLogMntRecordingTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogMntRecordingTerminalNumber(String value) {
        this.inLogMntRecordingTerminalNumber = value;
    }

    /**
     * Gets the value of the inLogMntRecordingTrxCode property.
     * 
     */
    public int getInLogMntRecordingTrxCode() {
        return inLogMntRecordingTrxCode;
    }

    /**
     * Sets the value of the inLogMntRecordingTrxCode property.
     * 
     */
    public void setInLogMntRecordingTrxCode(int value) {
        this.inLogMntRecordingTrxCode = value;
    }

    /**
     * Gets the value of the inMinStandAmntIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInMinStandAmntIefSuppliedAmount() {
        return inMinStandAmntIefSuppliedAmount;
    }

    /**
     * Sets the value of the inMinStandAmntIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInMinStandAmntIefSuppliedAmount(BigDecimal value) {
        this.inMinStandAmntIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the inMoreIefSuppliedNum2 property.
     * 
     */
    public short getInMoreIefSuppliedNum2() {
        return inMoreIefSuppliedNum2;
    }

    /**
     * Sets the value of the inMoreIefSuppliedNum2 property.
     * 
     */
    public void setInMoreIefSuppliedNum2(short value) {
        this.inMoreIefSuppliedNum2 = value;
    }

    /**
     * Gets the value of the inMoreIefSuppliedTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInMoreIefSuppliedTmstamp() {
        return inMoreIefSuppliedTmstamp;
    }

    /**
     * Sets the value of the inMoreIefSuppliedTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInMoreIefSuppliedTmstamp(XMLGregorianCalendar value) {
        this.inMoreIefSuppliedTmstamp = value;
    }

    /**
     * Gets the value of the inMovedCurrencyIdCurrency property.
     * 
     */
    public int getInMovedCurrencyIdCurrency() {
        return inMovedCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inMovedCurrencyIdCurrency property.
     * 
     */
    public void setInMovedCurrencyIdCurrency(int value) {
        this.inMovedCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inMovedCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMovedCurrencyShortDescr() {
        return inMovedCurrencyShortDescr;
    }

    /**
     * Sets the value of the inMovedCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMovedCurrencyShortDescr(String value) {
        this.inMovedCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inPageCountIefSuppliedCount property.
     * 
     */
    public int getInPageCountIefSuppliedCount() {
        return inPageCountIefSuppliedCount;
    }

    /**
     * Sets the value of the inPageCountIefSuppliedCount property.
     * 
     */
    public void setInPageCountIefSuppliedCount(int value) {
        this.inPageCountIefSuppliedCount = value;
    }

    /**
     * Gets the value of the inPrintIndicatorIefSuppliedTableInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPrintIndicatorIefSuppliedTableInd() {
        return inPrintIndicatorIefSuppliedTableInd;
    }

    /**
     * Sets the value of the inPrintIndicatorIefSuppliedTableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPrintIndicatorIefSuppliedTableInd(String value) {
        this.inPrintIndicatorIefSuppliedTableInd = value;
    }

    /**
     * Gets the value of the inPrintJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPrintJustificDescription() {
        return inPrintJustificDescription;
    }

    /**
     * Sets the value of the inPrintJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPrintJustificDescription(String value) {
        this.inPrintJustificDescription = value;
    }

    /**
     * Gets the value of the inPrintJustificIdJustific property.
     * 
     */
    public int getInPrintJustificIdJustific() {
        return inPrintJustificIdJustific;
    }

    /**
     * Sets the value of the inPrintJustificIdJustific property.
     * 
     */
    public void setInPrintJustificIdJustific(int value) {
        this.inPrintJustificIdJustific = value;
    }

    /**
     * Gets the value of the inSalePointGenericDetailSerialNum property.
     * 
     */
    public int getInSalePointGenericDetailSerialNum() {
        return inSalePointGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inSalePointGenericDetailSerialNum property.
     * 
     */
    public void setInSalePointGenericDetailSerialNum(int value) {
        this.inSalePointGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inSellerGenericDetailSerialNum property.
     * 
     */
    public int getInSellerGenericDetailSerialNum() {
        return inSellerGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inSellerGenericDetailSerialNum property.
     * 
     */
    public void setInSellerGenericDetailSerialNum(int value) {
        this.inSellerGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inSerialNumIefSuppliedNum10 property.
     * 
     */
    public double getInSerialNumIefSuppliedNum10() {
        return inSerialNumIefSuppliedNum10;
    }

    /**
     * Sets the value of the inSerialNumIefSuppliedNum10 property.
     * 
     */
    public void setInSerialNumIefSuppliedNum10(double value) {
        this.inSerialNumIefSuppliedNum10 = value;
    }

    /**
     * Gets the value of the inStatementLoanAccountStatementFreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInStatementLoanAccountStatementFreq() {
        return inStatementLoanAccountStatementFreq;
    }

    /**
     * Sets the value of the inStatementLoanAccountStatementFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInStatementLoanAccountStatementFreq(String value) {
        this.inStatementLoanAccountStatementFreq = value;
    }

    /**
     * Gets the value of the inSubs2LoanAccountSubsidyDuration property.
     * 
     */
    public short getInSubs2LoanAccountSubsidyDuration() {
        return inSubs2LoanAccountSubsidyDuration;
    }

    /**
     * Sets the value of the inSubs2LoanAccountSubsidyDuration property.
     * 
     */
    public void setInSubs2LoanAccountSubsidyDuration(short value) {
        this.inSubs2LoanAccountSubsidyDuration = value;
    }

    /**
     * Gets the value of the inSubs2LoanAccountSubsidyExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInSubs2LoanAccountSubsidyExpDt() {
        return inSubs2LoanAccountSubsidyExpDt;
    }

    /**
     * Sets the value of the inSubs2LoanAccountSubsidyExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInSubs2LoanAccountSubsidyExpDt(XMLGregorianCalendar value) {
        this.inSubs2LoanAccountSubsidyExpDt = value;
    }

    /**
     * Gets the value of the inSubs2LoanAccountSubsidyLimitAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInSubs2LoanAccountSubsidyLimitAmn() {
        return inSubs2LoanAccountSubsidyLimitAmn;
    }

    /**
     * Sets the value of the inSubs2LoanAccountSubsidyLimitAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInSubs2LoanAccountSubsidyLimitAmn(BigDecimal value) {
        this.inSubs2LoanAccountSubsidyLimitAmn = value;
    }

    /**
     * Gets the value of the inSubs2LoanAccountSubsidyStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInSubs2LoanAccountSubsidyStartDt() {
        return inSubs2LoanAccountSubsidyStartDt;
    }

    /**
     * Sets the value of the inSubs2LoanAccountSubsidyStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInSubs2LoanAccountSubsidyStartDt(XMLGregorianCalendar value) {
        this.inSubs2LoanAccountSubsidyStartDt = value;
    }

    /**
     * Gets the value of the inSubs2SubsidyOrderDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSubs2SubsidyOrderDescription() {
        return inSubs2SubsidyOrderDescription;
    }

    /**
     * Sets the value of the inSubs2SubsidyOrderDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSubs2SubsidyOrderDescription(String value) {
        this.inSubs2SubsidyOrderDescription = value;
    }

    /**
     * Gets the value of the inSubs2SubsidyOrderExpiryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInSubs2SubsidyOrderExpiryDt() {
        return inSubs2SubsidyOrderExpiryDt;
    }

    /**
     * Sets the value of the inSubs2SubsidyOrderExpiryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInSubs2SubsidyOrderExpiryDt(XMLGregorianCalendar value) {
        this.inSubs2SubsidyOrderExpiryDt = value;
    }

    /**
     * Gets the value of the inSubs2SubsidyOrderIdSubsidy property.
     * 
     */
    public int getInSubs2SubsidyOrderIdSubsidy() {
        return inSubs2SubsidyOrderIdSubsidy;
    }

    /**
     * Sets the value of the inSubs2SubsidyOrderIdSubsidy property.
     * 
     */
    public void setInSubs2SubsidyOrderIdSubsidy(int value) {
        this.inSubs2SubsidyOrderIdSubsidy = value;
    }

    /**
     * Gets the value of the inSubs2SubsidyOrderLnsEffectiveDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInSubs2SubsidyOrderLnsEffectiveDt() {
        return inSubs2SubsidyOrderLnsEffectiveDt;
    }

    /**
     * Sets the value of the inSubs2SubsidyOrderLnsEffectiveDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInSubs2SubsidyOrderLnsEffectiveDt(XMLGregorianCalendar value) {
        this.inSubs2SubsidyOrderLnsEffectiveDt = value;
    }

    /**
     * Gets the value of the inSubs2SubsidyOrderLnsExpiryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInSubs2SubsidyOrderLnsExpiryDt() {
        return inSubs2SubsidyOrderLnsExpiryDt;
    }

    /**
     * Sets the value of the inSubs2SubsidyOrderLnsExpiryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInSubs2SubsidyOrderLnsExpiryDt(XMLGregorianCalendar value) {
        this.inSubs2SubsidyOrderLnsExpiryDt = value;
    }

    /**
     * Gets the value of the inSubs2SubsidyOrderSubsDurationPrd property.
     * 
     */
    public short getInSubs2SubsidyOrderSubsDurationPrd() {
        return inSubs2SubsidyOrderSubsDurationPrd;
    }

    /**
     * Sets the value of the inSubs2SubsidyOrderSubsDurationPrd property.
     * 
     */
    public void setInSubs2SubsidyOrderSubsDurationPrd(short value) {
        this.inSubs2SubsidyOrderSubsDurationPrd = value;
    }

    /**
     * Gets the value of the inSubsidyOrderIdSubsidy property.
     * 
     */
    public int getInSubsidyOrderIdSubsidy() {
        return inSubsidyOrderIdSubsidy;
    }

    /**
     * Sets the value of the inSubsidyOrderIdSubsidy property.
     * 
     */
    public void setInSubsidyOrderIdSubsidy(int value) {
        this.inSubsidyOrderIdSubsidy = value;
    }

    /**
     * Gets the value of the inTransLoanAccountAccOpenDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTransLoanAccountAccOpenDt() {
        return inTransLoanAccountAccOpenDt;
    }

    /**
     * Sets the value of the inTransLoanAccountAccOpenDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTransLoanAccountAccOpenDt(XMLGregorianCalendar value) {
        this.inTransLoanAccountAccOpenDt = value;
    }

    /**
     * Gets the value of the inTransLoanAccountCurFxIntExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTransLoanAccountCurFxIntExpDt() {
        return inTransLoanAccountCurFxIntExpDt;
    }

    /**
     * Sets the value of the inTransLoanAccountCurFxIntExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTransLoanAccountCurFxIntExpDt(XMLGregorianCalendar value) {
        this.inTransLoanAccountCurFxIntExpDt = value;
    }

    /**
     * Gets the value of the inTransLoanAccountDrawdownFstAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTransLoanAccountDrawdownFstAmn() {
        return inTransLoanAccountDrawdownFstAmn;
    }

    /**
     * Sets the value of the inTransLoanAccountDrawdownFstAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTransLoanAccountDrawdownFstAmn(BigDecimal value) {
        this.inTransLoanAccountDrawdownFstAmn = value;
    }

    /**
     * Gets the value of the inTransLoanAccountDrawdownFstDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTransLoanAccountDrawdownFstDt() {
        return inTransLoanAccountDrawdownFstDt;
    }

    /**
     * Sets the value of the inTransLoanAccountDrawdownFstDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTransLoanAccountDrawdownFstDt(XMLGregorianCalendar value) {
        this.inTransLoanAccountDrawdownFstDt = value;
    }

    /**
     * Gets the value of the inTransLoanAccountInstallNextDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTransLoanAccountInstallNextDt() {
        return inTransLoanAccountInstallNextDt;
    }

    /**
     * Sets the value of the inTransLoanAccountInstallNextDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTransLoanAccountInstallNextDt(XMLGregorianCalendar value) {
        this.inTransLoanAccountInstallNextDt = value;
    }

    /**
     * Gets the value of the inTransLoanAccountInstallPrevDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTransLoanAccountInstallPrevDt() {
        return inTransLoanAccountInstallPrevDt;
    }

    /**
     * Sets the value of the inTransLoanAccountInstallPrevDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTransLoanAccountInstallPrevDt(XMLGregorianCalendar value) {
        this.inTransLoanAccountInstallPrevDt = value;
    }

    /**
     * Gets the value of the inTransLoanAccountLstAprIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTransLoanAccountLstAprIntDbAmn() {
        return inTransLoanAccountLstAprIntDbAmn;
    }

    /**
     * Sets the value of the inTransLoanAccountLstAprIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTransLoanAccountLstAprIntDbAmn(BigDecimal value) {
        this.inTransLoanAccountLstAprIntDbAmn = value;
    }

    /**
     * Gets the value of the inTransLoanAccountLstAprYear property.
     * 
     */
    public short getInTransLoanAccountLstAprYear() {
        return inTransLoanAccountLstAprYear;
    }

    /**
     * Sets the value of the inTransLoanAccountLstAprYear property.
     * 
     */
    public void setInTransLoanAccountLstAprYear(short value) {
        this.inTransLoanAccountLstAprYear = value;
    }

    /**
     * Gets the value of the inTransLoanAccountLstAugIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTransLoanAccountLstAugIntDbAmn() {
        return inTransLoanAccountLstAugIntDbAmn;
    }

    /**
     * Sets the value of the inTransLoanAccountLstAugIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTransLoanAccountLstAugIntDbAmn(BigDecimal value) {
        this.inTransLoanAccountLstAugIntDbAmn = value;
    }

    /**
     * Gets the value of the inTransLoanAccountLstAugYear property.
     * 
     */
    public short getInTransLoanAccountLstAugYear() {
        return inTransLoanAccountLstAugYear;
    }

    /**
     * Sets the value of the inTransLoanAccountLstAugYear property.
     * 
     */
    public void setInTransLoanAccountLstAugYear(short value) {
        this.inTransLoanAccountLstAugYear = value;
    }

    /**
     * Gets the value of the inTransLoanAccountLstDecIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTransLoanAccountLstDecIntDbAmn() {
        return inTransLoanAccountLstDecIntDbAmn;
    }

    /**
     * Sets the value of the inTransLoanAccountLstDecIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTransLoanAccountLstDecIntDbAmn(BigDecimal value) {
        this.inTransLoanAccountLstDecIntDbAmn = value;
    }

    /**
     * Gets the value of the inTransLoanAccountLstDecYear property.
     * 
     */
    public short getInTransLoanAccountLstDecYear() {
        return inTransLoanAccountLstDecYear;
    }

    /**
     * Sets the value of the inTransLoanAccountLstDecYear property.
     * 
     */
    public void setInTransLoanAccountLstDecYear(short value) {
        this.inTransLoanAccountLstDecYear = value;
    }

    /**
     * Gets the value of the inTransLoanAccountLstFebIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTransLoanAccountLstFebIntDbAmn() {
        return inTransLoanAccountLstFebIntDbAmn;
    }

    /**
     * Sets the value of the inTransLoanAccountLstFebIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTransLoanAccountLstFebIntDbAmn(BigDecimal value) {
        this.inTransLoanAccountLstFebIntDbAmn = value;
    }

    /**
     * Gets the value of the inTransLoanAccountLstFebYear property.
     * 
     */
    public short getInTransLoanAccountLstFebYear() {
        return inTransLoanAccountLstFebYear;
    }

    /**
     * Sets the value of the inTransLoanAccountLstFebYear property.
     * 
     */
    public void setInTransLoanAccountLstFebYear(short value) {
        this.inTransLoanAccountLstFebYear = value;
    }

    /**
     * Gets the value of the inTransLoanAccountLstJanIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTransLoanAccountLstJanIntDbAmn() {
        return inTransLoanAccountLstJanIntDbAmn;
    }

    /**
     * Sets the value of the inTransLoanAccountLstJanIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTransLoanAccountLstJanIntDbAmn(BigDecimal value) {
        this.inTransLoanAccountLstJanIntDbAmn = value;
    }

    /**
     * Gets the value of the inTransLoanAccountLstJanYear property.
     * 
     */
    public short getInTransLoanAccountLstJanYear() {
        return inTransLoanAccountLstJanYear;
    }

    /**
     * Sets the value of the inTransLoanAccountLstJanYear property.
     * 
     */
    public void setInTransLoanAccountLstJanYear(short value) {
        this.inTransLoanAccountLstJanYear = value;
    }

    /**
     * Gets the value of the inTransLoanAccountLstJulIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTransLoanAccountLstJulIntDbAmn() {
        return inTransLoanAccountLstJulIntDbAmn;
    }

    /**
     * Sets the value of the inTransLoanAccountLstJulIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTransLoanAccountLstJulIntDbAmn(BigDecimal value) {
        this.inTransLoanAccountLstJulIntDbAmn = value;
    }

    /**
     * Gets the value of the inTransLoanAccountLstJulYear property.
     * 
     */
    public short getInTransLoanAccountLstJulYear() {
        return inTransLoanAccountLstJulYear;
    }

    /**
     * Sets the value of the inTransLoanAccountLstJulYear property.
     * 
     */
    public void setInTransLoanAccountLstJulYear(short value) {
        this.inTransLoanAccountLstJulYear = value;
    }

    /**
     * Gets the value of the inTransLoanAccountLstJunIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTransLoanAccountLstJunIntDbAmn() {
        return inTransLoanAccountLstJunIntDbAmn;
    }

    /**
     * Sets the value of the inTransLoanAccountLstJunIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTransLoanAccountLstJunIntDbAmn(BigDecimal value) {
        this.inTransLoanAccountLstJunIntDbAmn = value;
    }

    /**
     * Gets the value of the inTransLoanAccountLstJunYear property.
     * 
     */
    public short getInTransLoanAccountLstJunYear() {
        return inTransLoanAccountLstJunYear;
    }

    /**
     * Sets the value of the inTransLoanAccountLstJunYear property.
     * 
     */
    public void setInTransLoanAccountLstJunYear(short value) {
        this.inTransLoanAccountLstJunYear = value;
    }

    /**
     * Gets the value of the inTransLoanAccountLstMarIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTransLoanAccountLstMarIntDbAmn() {
        return inTransLoanAccountLstMarIntDbAmn;
    }

    /**
     * Sets the value of the inTransLoanAccountLstMarIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTransLoanAccountLstMarIntDbAmn(BigDecimal value) {
        this.inTransLoanAccountLstMarIntDbAmn = value;
    }

    /**
     * Gets the value of the inTransLoanAccountLstMarYear property.
     * 
     */
    public short getInTransLoanAccountLstMarYear() {
        return inTransLoanAccountLstMarYear;
    }

    /**
     * Sets the value of the inTransLoanAccountLstMarYear property.
     * 
     */
    public void setInTransLoanAccountLstMarYear(short value) {
        this.inTransLoanAccountLstMarYear = value;
    }

    /**
     * Gets the value of the inTransLoanAccountLstMayIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTransLoanAccountLstMayIntDbAmn() {
        return inTransLoanAccountLstMayIntDbAmn;
    }

    /**
     * Sets the value of the inTransLoanAccountLstMayIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTransLoanAccountLstMayIntDbAmn(BigDecimal value) {
        this.inTransLoanAccountLstMayIntDbAmn = value;
    }

    /**
     * Gets the value of the inTransLoanAccountLstMayYear property.
     * 
     */
    public short getInTransLoanAccountLstMayYear() {
        return inTransLoanAccountLstMayYear;
    }

    /**
     * Sets the value of the inTransLoanAccountLstMayYear property.
     * 
     */
    public void setInTransLoanAccountLstMayYear(short value) {
        this.inTransLoanAccountLstMayYear = value;
    }

    /**
     * Gets the value of the inTransLoanAccountLstNovIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTransLoanAccountLstNovIntDbAmn() {
        return inTransLoanAccountLstNovIntDbAmn;
    }

    /**
     * Sets the value of the inTransLoanAccountLstNovIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTransLoanAccountLstNovIntDbAmn(BigDecimal value) {
        this.inTransLoanAccountLstNovIntDbAmn = value;
    }

    /**
     * Gets the value of the inTransLoanAccountLstNovYear property.
     * 
     */
    public short getInTransLoanAccountLstNovYear() {
        return inTransLoanAccountLstNovYear;
    }

    /**
     * Sets the value of the inTransLoanAccountLstNovYear property.
     * 
     */
    public void setInTransLoanAccountLstNovYear(short value) {
        this.inTransLoanAccountLstNovYear = value;
    }

    /**
     * Gets the value of the inTransLoanAccountLstOctIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTransLoanAccountLstOctIntDbAmn() {
        return inTransLoanAccountLstOctIntDbAmn;
    }

    /**
     * Sets the value of the inTransLoanAccountLstOctIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTransLoanAccountLstOctIntDbAmn(BigDecimal value) {
        this.inTransLoanAccountLstOctIntDbAmn = value;
    }

    /**
     * Gets the value of the inTransLoanAccountLstOctYear property.
     * 
     */
    public short getInTransLoanAccountLstOctYear() {
        return inTransLoanAccountLstOctYear;
    }

    /**
     * Sets the value of the inTransLoanAccountLstOctYear property.
     * 
     */
    public void setInTransLoanAccountLstOctYear(short value) {
        this.inTransLoanAccountLstOctYear = value;
    }

    /**
     * Gets the value of the inTransLoanAccountLstSepIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTransLoanAccountLstSepIntDbAmn() {
        return inTransLoanAccountLstSepIntDbAmn;
    }

    /**
     * Sets the value of the inTransLoanAccountLstSepIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTransLoanAccountLstSepIntDbAmn(BigDecimal value) {
        this.inTransLoanAccountLstSepIntDbAmn = value;
    }

    /**
     * Gets the value of the inTransLoanAccountLstSepYear property.
     * 
     */
    public short getInTransLoanAccountLstSepYear() {
        return inTransLoanAccountLstSepYear;
    }

    /**
     * Sets the value of the inTransLoanAccountLstSepYear property.
     * 
     */
    public void setInTransLoanAccountLstSepYear(short value) {
        this.inTransLoanAccountLstSepYear = value;
    }

    /**
     * Gets the value of the inTransLoanAccountMoratorN128Rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTransLoanAccountMoratorN128Rate() {
        return inTransLoanAccountMoratorN128Rate;
    }

    /**
     * Sets the value of the inTransLoanAccountMoratorN128Rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTransLoanAccountMoratorN128Rate(BigDecimal value) {
        this.inTransLoanAccountMoratorN128Rate = value;
    }

    /**
     * Gets the value of the inTransLoanAccountMoratorNrmRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTransLoanAccountMoratorNrmRate() {
        return inTransLoanAccountMoratorNrmRate;
    }

    /**
     * Sets the value of the inTransLoanAccountMoratorNrmRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTransLoanAccountMoratorNrmRate(BigDecimal value) {
        this.inTransLoanAccountMoratorNrmRate = value;
    }

    /**
     * Gets the value of the inTransLoanAccountMoratorSprRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTransLoanAccountMoratorSprRate() {
        return inTransLoanAccountMoratorSprRate;
    }

    /**
     * Sets the value of the inTransLoanAccountMoratorSprRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTransLoanAccountMoratorSprRate(BigDecimal value) {
        this.inTransLoanAccountMoratorSprRate = value;
    }

    /**
     * Gets the value of the inTransLoanAccountMpStartCapAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTransLoanAccountMpStartCapAmn() {
        return inTransLoanAccountMpStartCapAmn;
    }

    /**
     * Sets the value of the inTransLoanAccountMpStartCapAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTransLoanAccountMpStartCapAmn(BigDecimal value) {
        this.inTransLoanAccountMpStartCapAmn = value;
    }

    /**
     * Gets the value of the inTransLoanAccountOldAccountCd property.
     * 
     */
    public short getInTransLoanAccountOldAccountCd() {
        return inTransLoanAccountOldAccountCd;
    }

    /**
     * Sets the value of the inTransLoanAccountOldAccountCd property.
     * 
     */
    public void setInTransLoanAccountOldAccountCd(short value) {
        this.inTransLoanAccountOldAccountCd = value;
    }

    /**
     * Gets the value of the inTransLoanAccountOldAccountNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTransLoanAccountOldAccountNum() {
        return inTransLoanAccountOldAccountNum;
    }

    /**
     * Sets the value of the inTransLoanAccountOldAccountNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTransLoanAccountOldAccountNum(String value) {
        this.inTransLoanAccountOldAccountNum = value;
    }

    /**
     * Gets the value of the inTransLoanAccountReqInstallSn property.
     * 
     */
    public short getInTransLoanAccountReqInstallSn() {
        return inTransLoanAccountReqInstallSn;
    }

    /**
     * Sets the value of the inTransLoanAccountReqInstallSn property.
     * 
     */
    public void setInTransLoanAccountReqInstallSn(short value) {
        this.inTransLoanAccountReqInstallSn = value;
    }

    /**
     * Gets the value of the inTransLoanAccountTotCapAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTransLoanAccountTotCapAmn() {
        return inTransLoanAccountTotCapAmn;
    }

    /**
     * Sets the value of the inTransLoanAccountTotCapAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTransLoanAccountTotCapAmn(BigDecimal value) {
        this.inTransLoanAccountTotCapAmn = value;
    }

    /**
     * Gets the value of the inTransLoanAccountTotComInCcAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTransLoanAccountTotComInCcAmn() {
        return inTransLoanAccountTotComInCcAmn;
    }

    /**
     * Sets the value of the inTransLoanAccountTotComInCcAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTransLoanAccountTotComInCcAmn(BigDecimal value) {
        this.inTransLoanAccountTotComInCcAmn = value;
    }

    /**
     * Gets the value of the inTransLoanAccountTotCommissionAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTransLoanAccountTotCommissionAmn() {
        return inTransLoanAccountTotCommissionAmn;
    }

    /**
     * Sets the value of the inTransLoanAccountTotCommissionAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTransLoanAccountTotCommissionAmn(BigDecimal value) {
        this.inTransLoanAccountTotCommissionAmn = value;
    }

    /**
     * Gets the value of the inTransLoanAccountTotConfirmAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTransLoanAccountTotConfirmAmn() {
        return inTransLoanAccountTotConfirmAmn;
    }

    /**
     * Sets the value of the inTransLoanAccountTotConfirmAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTransLoanAccountTotConfirmAmn(BigDecimal value) {
        this.inTransLoanAccountTotConfirmAmn = value;
    }

    /**
     * Gets the value of the inTransLoanAccountTotDrawdownAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTransLoanAccountTotDrawdownAmn() {
        return inTransLoanAccountTotDrawdownAmn;
    }

    /**
     * Sets the value of the inTransLoanAccountTotDrawdownAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTransLoanAccountTotDrawdownAmn(BigDecimal value) {
        this.inTransLoanAccountTotDrawdownAmn = value;
    }

    /**
     * Gets the value of the inTransLoanAccountTotExpInCcAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTransLoanAccountTotExpInCcAmn() {
        return inTransLoanAccountTotExpInCcAmn;
    }

    /**
     * Sets the value of the inTransLoanAccountTotExpInCcAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTransLoanAccountTotExpInCcAmn(BigDecimal value) {
        this.inTransLoanAccountTotExpInCcAmn = value;
    }

    /**
     * Gets the value of the inTransLoanAccountTotExpenseAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTransLoanAccountTotExpenseAmn() {
        return inTransLoanAccountTotExpenseAmn;
    }

    /**
     * Sets the value of the inTransLoanAccountTotExpenseAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTransLoanAccountTotExpenseAmn(BigDecimal value) {
        this.inTransLoanAccountTotExpenseAmn = value;
    }

    /**
     * Gets the value of the inTransLoanAccountTotNrmIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTransLoanAccountTotNrmIntAmn() {
        return inTransLoanAccountTotNrmIntAmn;
    }

    /**
     * Sets the value of the inTransLoanAccountTotNrmIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTransLoanAccountTotNrmIntAmn(BigDecimal value) {
        this.inTransLoanAccountTotNrmIntAmn = value;
    }

    /**
     * Gets the value of the inTransLoanAccountTotPnlIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTransLoanAccountTotPnlIntAmn() {
        return inTransLoanAccountTotPnlIntAmn;
    }

    /**
     * Sets the value of the inTransLoanAccountTotPnlIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTransLoanAccountTotPnlIntAmn(BigDecimal value) {
        this.inTransLoanAccountTotPnlIntAmn = value;
    }

    /**
     * Gets the value of the inTransLoanAccountTotPubCommAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTransLoanAccountTotPubCommAmn() {
        return inTransLoanAccountTotPubCommAmn;
    }

    /**
     * Sets the value of the inTransLoanAccountTotPubCommAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTransLoanAccountTotPubCommAmn(BigDecimal value) {
        this.inTransLoanAccountTotPubCommAmn = value;
    }

    /**
     * Gets the value of the inTransLoanAccountTotSubsIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTransLoanAccountTotSubsIntAmn() {
        return inTransLoanAccountTotSubsIntAmn;
    }

    /**
     * Sets the value of the inTransLoanAccountTotSubsIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTransLoanAccountTotSubsIntAmn(BigDecimal value) {
        this.inTransLoanAccountTotSubsIntAmn = value;
    }

    /**
     * Gets the value of the inTransLoanAccountTotThrdprtAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTransLoanAccountTotThrdprtAmn() {
        return inTransLoanAccountTotThrdprtAmn;
    }

    /**
     * Sets the value of the inTransLoanAccountTotThrdprtAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTransLoanAccountTotThrdprtAmn(BigDecimal value) {
        this.inTransLoanAccountTotThrdprtAmn = value;
    }

    /**
     * Gets the value of the inTransProdUnitOperationStatusFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTransProdUnitOperationStatusFlg() {
        return inTransProdUnitOperationStatusFlg;
    }

    /**
     * Sets the value of the inTransProdUnitOperationStatusFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTransProdUnitOperationStatusFlg(String value) {
        this.inTransProdUnitOperationStatusFlg = value;
    }

    /**
     * Gets the value of the inTrxCurrencyIdCurrency property.
     * 
     */
    public int getInTrxCurrencyIdCurrency() {
        return inTrxCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inTrxCurrencyIdCurrency property.
     * 
     */
    public void setInTrxCurrencyIdCurrency(int value) {
        this.inTrxCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inTrxCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxCurrencyShortDescr() {
        return inTrxCurrencyShortDescr;
    }

    /**
     * Sets the value of the inTrxCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxCurrencyShortDescr(String value) {
        this.inTrxCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inTrxJustificIdJustific property.
     * 
     */
    public int getInTrxJustificIdJustific() {
        return inTrxJustificIdJustific;
    }

    /**
     * Sets the value of the inTrxJustificIdJustific property.
     * 
     */
    public void setInTrxJustificIdJustific(int value) {
        this.inTrxJustificIdJustific = value;
    }

    /**
     * Gets the value of the inTrxPrftTransactionIdTransact property.
     * 
     */
    public int getInTrxPrftTransactionIdTransact() {
        return inTrxPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the inTrxPrftTransactionIdTransact property.
     * 
     */
    public void setInTrxPrftTransactionIdTransact(int value) {
        this.inTrxPrftTransactionIdTransact = value;
    }

    /**
     * Gets the value of the inTrxSsSecurityCmcbPrftSystem property.
     * 
     */
    public short getInTrxSsSecurityCmcbPrftSystem() {
        return inTrxSsSecurityCmcbPrftSystem;
    }

    /**
     * Sets the value of the inTrxSsSecurityCmcbPrftSystem property.
     * 
     */
    public void setInTrxSsSecurityCmcbPrftSystem(short value) {
        this.inTrxSsSecurityCmcbPrftSystem = value;
    }

    /**
     * Gets the value of the inTrxTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxTerminalTerminalNumber() {
        return inTrxTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inTrxTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxTerminalTerminalNumber(String value) {
        this.inTrxTerminalTerminalNumber = value;
    }

    /**
     * Gets the value of the inUnionCustomerCustId property.
     * 
     */
    public int getInUnionCustomerCustId() {
        return inUnionCustomerCustId;
    }

    /**
     * Sets the value of the inUnionCustomerCustId property.
     * 
     */
    public void setInUnionCustomerCustId(int value) {
        this.inUnionCustomerCustId = value;
    }

    /**
     * Gets the value of the inUpdateCauseGenericDetailSerialNum property.
     * 
     */
    public int getInUpdateCauseGenericDetailSerialNum() {
        return inUpdateCauseGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inUpdateCauseGenericDetailSerialNum property.
     * 
     */
    public void setInUpdateCauseGenericDetailSerialNum(int value) {
        this.inUpdateCauseGenericDetailSerialNum = value;
    }

}
