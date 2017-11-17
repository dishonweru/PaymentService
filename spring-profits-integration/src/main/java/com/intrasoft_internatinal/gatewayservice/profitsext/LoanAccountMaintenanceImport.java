
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LoanAccountMaintenanceImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanAccountMaintenanceImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="ProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGrpLoanAddInfo" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfInGrpLoanAddInfo" minOccurs="0"/>
 *         &lt;element name="InTrxJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAdjustGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAdjustGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAgreementAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAgreementAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAgreementAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InAgrUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAsoCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAuthGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBankSectorGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBenefIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCbpurpGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InChargingCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InClassCodeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCloanGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepSnLoansStandingAccSnDep" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InDialogSalePersonGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDialogSalePersonGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDialogSaleUnitGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDialogSaleUnitGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InFinancialSectorGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InFixedLnsInterestDurationUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFixedLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InFixedLnsInterestIntDuration" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InFlexFixInstallAmnLoanInstallmentInfoInstallmentAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InFloatingLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpLoanAddInfoLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGuaranteeOrderIdGuarantee" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLimitCurrencyDisplayedDecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLimitCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLnsMediatorAgreementNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLnsMediatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="InLoanAccountAccDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountAccExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountAccLimitAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountAccMechanism" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountAccOpenDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountAccTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountCurFxIntExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountCurFxIntScalDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountCurFxIntStDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountDepAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountDepAccSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InLoanAccountDepAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountDepAccUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLoanAccountDrawdownExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountDrawdownFstAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountDrawdownFstDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountExcmptPnlPrdNo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountGuaranteePerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountInstallChgNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountInstallCount" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountInstallFirstDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountInstallFreq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountInstallMechFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountInstallNextDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountInstallPrevDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountInstallSkipCap" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountInstallSkipInt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountIntCalcStopFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountInterCapitalizeFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountInterRateSprd" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountLastNrmTrxCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountLstAccrCalcDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountOvExpExtFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountRecyclingFrequency" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountRecyclingFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountSpreadEndDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountSpreadFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountSubsidyDuration" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountSubsidyExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountSubsidyLimitAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountSubsidyStartDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountUnrealizedFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountInfoAccTransitionFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountInfoAdjustmentDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountInfoAgentBank" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLoanAccountInfoAutFixIntRenew" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountInfoCreditIntId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLoanAccountInfoCrIntSprd" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountInfoCrSprdEndDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountInfoCrSprdStDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
 *         &lt;element name="InLogReversalIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogTeamInformationSuper1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogTeamInformationSuper2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMonUnitUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMovedCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMovedCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InNewPackageIdPackage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InOldPackageIdPackage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPreviousLoanAccountInfoAccTransitionFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPreviousLoanAccountInfoTransactSm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSalePointGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSellerGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
 *         &lt;element name="InTransLoanAccountTotExpenseAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransLoanAccountTotExpInCcAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransLoanAccountTotNrmIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransLoanAccountTotPnlIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransLoanAccountTotPubCommAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransLoanAccountTotSubsIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransLoanAccountTotThrdprtAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTransProdUnitOperationStatusFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxSsSecurityCmcbPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InUnionCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InUpdateCauseGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpMediators" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfL0401VInGrpMediatorsItem" minOccurs="0"/>
 *         &lt;element name="InPenaltyLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPenaltyLnsInterestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InN128LnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InN128LnsInterestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanAccountMaintenanceImport", propOrder = {
    "profitsAccountNumber",
    "profitsAccountCd",
    "inGrpLoanAddInfo",
    "inTrxJustificIdJustific",
    "inTrxTerminalTerminalNumber",
    "inAdjustGenericDetailDescription",
    "inAdjustGenericDetailSerialNum",
    "inAgreementAgrMembershipSn",
    "inAgreementAgrSn",
    "inAgreementAgrYear",
    "inAgrUnitCode",
    "inAsoCustomerCustId",
    "inAuthGrantedIefSuppliedFlag",
    "inBankSectorGenericDetailSerialNum",
    "inBenefIefSuppliedFlag",
    "inCbpurpGenericDetailSerialNum",
    "inChargingCurrencyIdCurrency",
    "inClassCodeGenericDetailSerialNum",
    "inCloanGenericDetailSerialNum",
    "inDepositAccountCurrencyIdCurrency",
    "inDepositAccountCurrencyShortDescr",
    "inDepSnLoansStandingAccSnDep",
    "inDialogSalePersonGenericDetailDescription",
    "inDialogSalePersonGenericDetailShortDescription",
    "inDialogSaleUnitGenericDetailDescription",
    "inDialogSaleUnitGenericDetailSerialNum",
    "inFinancialSectorGenericDetailSerialNum",
    "inFixedLnsInterestDurationUnit",
    "inFixedLnsInterestIdInterest",
    "inFixedLnsInterestIntDuration",
    "inFlexFixInstallAmnLoanInstallmentInfoInstallmentAmn",
    "inFloatingLnsInterestIdInterest",
    "inGrpLoanAddInfoLength",
    "inGuaranteeOrderIdGuarantee",
    "inIefSuppliedCommand",
    "inLimitCurrencyDisplayedDecimalPlaces",
    "inLimitCurrencyIdCurrency",
    "inLnsMediatorAgreementNo",
    "inLnsMediatorName",
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
    "inLoanAccountAccDescription",
    "inLoanAccountAccExpDt",
    "inLoanAccountAccLimitAmn",
    "inLoanAccountAccMechanism",
    "inLoanAccountAccOpenDt",
    "inLoanAccountAccStatus",
    "inLoanAccountAccTerms",
    "inLoanAccountCurFxIntExpDt",
    "inLoanAccountCurFxIntScalDt",
    "inLoanAccountCurFxIntStDt",
    "inLoanAccountDepAccCd",
    "inLoanAccountDepAccSn",
    "inLoanAccountDepAccType",
    "inLoanAccountDepAccUnit",
    "inLoanAccountDrawdownExpDt",
    "inLoanAccountDrawdownFstAmn",
    "inLoanAccountDrawdownFstDt",
    "inLoanAccountExcmptPnlPrdNo",
    "inLoanAccountGuaranteePerc",
    "inLoanAccountInstallChgNum",
    "inLoanAccountInstallCount",
    "inLoanAccountInstallFirstDt",
    "inLoanAccountInstallFreq",
    "inLoanAccountInstallMechFlg",
    "inLoanAccountInstallNextDt",
    "inLoanAccountInstallPrevDt",
    "inLoanAccountInstallSkipCap",
    "inLoanAccountInstallSkipInt",
    "inLoanAccountIntCalcStopFlg",
    "inLoanAccountInterCapitalizeFlg",
    "inLoanAccountInterRateSprd",
    "inLoanAccountLastNrmTrxCnt",
    "inLoanAccountLstAccrCalcDt",
    "inLoanAccountOvExpExtFlg",
    "inLoanAccountRecyclingFrequency",
    "inLoanAccountRecyclingFrq",
    "inLoanAccountSpreadEndDt",
    "inLoanAccountSpreadFlg",
    "inLoanAccountSubsidyDuration",
    "inLoanAccountSubsidyExpDt",
    "inLoanAccountSubsidyLimitAmn",
    "inLoanAccountSubsidyStartDt",
    "inLoanAccountTmstamp",
    "inLoanAccountUnrealizedFlg",
    "inLoanAccountInfoAccTransitionFlg",
    "inLoanAccountInfoAdjustmentDt",
    "inLoanAccountInfoAgentBank",
    "inLoanAccountInfoAutFixIntRenew",
    "inLoanAccountInfoCreditIntId",
    "inLoanAccountInfoCrIntSprd",
    "inLoanAccountInfoCrSprdEndDt",
    "inLoanAccountInfoCrSprdStDt",
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
    "inLogReversalIefSuppliedFlag",
    "inLogTeamInformationSuper1Code",
    "inLogTeamInformationSuper2Code",
    "inMonUnitUnitCode",
    "inMovedCurrencyIdCurrency",
    "inMovedCurrencyShortDescr",
    "inNewPackageIdPackage",
    "inOldPackageIdPackage",
    "inPreviousLoanAccountInfoAccTransitionFlg",
    "inPreviousLoanAccountInfoTransactSm",
    "inSalePointGenericDetailSerialNum",
    "inSellerGenericDetailSerialNum",
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
    "inTransLoanAccountTotExpenseAmn",
    "inTransLoanAccountTotExpInCcAmn",
    "inTransLoanAccountTotNrmIntAmn",
    "inTransLoanAccountTotPnlIntAmn",
    "inTransLoanAccountTotPubCommAmn",
    "inTransLoanAccountTotSubsIntAmn",
    "inTransLoanAccountTotThrdprtAmn",
    "inTransProdUnitOperationStatusFlg",
    "inTrxPrftTransactionIdTransact",
    "inTrxSsSecurityCmcbPrftSystem",
    "inUnionCustomerCustId",
    "inUpdateCauseGenericDetailSerialNum",
    "inGrpMediators",
    "inPenaltyLnsInterestIdInterest",
    "inPenaltyLnsInterestDescription",
    "inN128LnsInterestIdInterest",
    "inN128LnsInterestDescription"
})
public class LoanAccountMaintenanceImport
    extends BaseImport
{

    @XmlElement(name = "ProfitsAccountNumber")
    protected String profitsAccountNumber;
    @XmlElement(name = "ProfitsAccountCd")
    protected short profitsAccountCd;
    @XmlElement(name = "InGrpLoanAddInfo")
    protected ArrayOfInGrpLoanAddInfo inGrpLoanAddInfo;
    @XmlElement(name = "InTrxJustificIdJustific")
    protected int inTrxJustificIdJustific;
    @XmlElement(name = "InTrxTerminalTerminalNumber")
    protected String inTrxTerminalTerminalNumber;
    @XmlElement(name = "InAdjustGenericDetailDescription")
    protected String inAdjustGenericDetailDescription;
    @XmlElement(name = "InAdjustGenericDetailSerialNum")
    protected int inAdjustGenericDetailSerialNum;
    @XmlElement(name = "InAgreementAgrMembershipSn")
    protected int inAgreementAgrMembershipSn;
    @XmlElement(name = "InAgreementAgrSn")
    protected int inAgreementAgrSn;
    @XmlElement(name = "InAgreementAgrYear")
    protected short inAgreementAgrYear;
    @XmlElement(name = "InAgrUnitCode")
    protected int inAgrUnitCode;
    @XmlElement(name = "InAsoCustomerCustId")
    protected int inAsoCustomerCustId;
    @XmlElement(name = "InAuthGrantedIefSuppliedFlag")
    protected String inAuthGrantedIefSuppliedFlag;
    @XmlElement(name = "InBankSectorGenericDetailSerialNum")
    protected int inBankSectorGenericDetailSerialNum;
    @XmlElement(name = "InBenefIefSuppliedFlag")
    protected String inBenefIefSuppliedFlag;
    @XmlElement(name = "InCbpurpGenericDetailSerialNum")
    protected int inCbpurpGenericDetailSerialNum;
    @XmlElement(name = "InChargingCurrencyIdCurrency")
    protected int inChargingCurrencyIdCurrency;
    @XmlElement(name = "InClassCodeGenericDetailSerialNum")
    protected int inClassCodeGenericDetailSerialNum;
    @XmlElement(name = "InCloanGenericDetailSerialNum")
    protected int inCloanGenericDetailSerialNum;
    @XmlElement(name = "InDepositAccountCurrencyIdCurrency")
    protected int inDepositAccountCurrencyIdCurrency;
    @XmlElement(name = "InDepositAccountCurrencyShortDescr")
    protected String inDepositAccountCurrencyShortDescr;
    @XmlElement(name = "InDepSnLoansStandingAccSnDep")
    protected double inDepSnLoansStandingAccSnDep;
    @XmlElement(name = "InDialogSalePersonGenericDetailDescription")
    protected String inDialogSalePersonGenericDetailDescription;
    @XmlElement(name = "InDialogSalePersonGenericDetailShortDescription")
    protected String inDialogSalePersonGenericDetailShortDescription;
    @XmlElement(name = "InDialogSaleUnitGenericDetailDescription")
    protected String inDialogSaleUnitGenericDetailDescription;
    @XmlElement(name = "InDialogSaleUnitGenericDetailSerialNum")
    protected int inDialogSaleUnitGenericDetailSerialNum;
    @XmlElement(name = "InFinancialSectorGenericDetailSerialNum")
    protected int inFinancialSectorGenericDetailSerialNum;
    @XmlElement(name = "InFixedLnsInterestDurationUnit")
    protected String inFixedLnsInterestDurationUnit;
    @XmlElement(name = "InFixedLnsInterestIdInterest")
    protected int inFixedLnsInterestIdInterest;
    @XmlElement(name = "InFixedLnsInterestIntDuration")
    protected short inFixedLnsInterestIntDuration;
    @XmlElement(name = "InFlexFixInstallAmnLoanInstallmentInfoInstallmentAmn", required = true)
    protected BigDecimal inFlexFixInstallAmnLoanInstallmentInfoInstallmentAmn;
    @XmlElement(name = "InFloatingLnsInterestIdInterest")
    protected int inFloatingLnsInterestIdInterest;
    @XmlElement(name = "InGrpLoanAddInfoLength")
    protected int inGrpLoanAddInfoLength;
    @XmlElement(name = "InGuaranteeOrderIdGuarantee")
    protected int inGuaranteeOrderIdGuarantee;
    @XmlElement(name = "InIefSuppliedCommand")
    protected String inIefSuppliedCommand;
    @XmlElement(name = "InLimitCurrencyDisplayedDecimalPlaces")
    protected short inLimitCurrencyDisplayedDecimalPlaces;
    @XmlElement(name = "InLimitCurrencyIdCurrency")
    protected int inLimitCurrencyIdCurrency;
    @XmlElement(name = "InLnsMediatorAgreementNo")
    protected int inLnsMediatorAgreementNo;
    @XmlElement(name = "InLnsMediatorName")
    protected String inLnsMediatorName;
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
    @XmlElement(name = "InLoanAccountAccDescription")
    protected String inLoanAccountAccDescription;
    @XmlElement(name = "InLoanAccountAccExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountAccExpDt;
    @XmlElement(name = "InLoanAccountAccLimitAmn", required = true)
    protected BigDecimal inLoanAccountAccLimitAmn;
    @XmlElement(name = "InLoanAccountAccMechanism")
    protected String inLoanAccountAccMechanism;
    @XmlElement(name = "InLoanAccountAccOpenDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountAccOpenDt;
    @XmlElement(name = "InLoanAccountAccStatus")
    protected String inLoanAccountAccStatus;
    @XmlElement(name = "InLoanAccountAccTerms")
    protected String inLoanAccountAccTerms;
    @XmlElement(name = "InLoanAccountCurFxIntExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountCurFxIntExpDt;
    @XmlElement(name = "InLoanAccountCurFxIntScalDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountCurFxIntScalDt;
    @XmlElement(name = "InLoanAccountCurFxIntStDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountCurFxIntStDt;
    @XmlElement(name = "InLoanAccountDepAccCd")
    protected short inLoanAccountDepAccCd;
    @XmlElement(name = "InLoanAccountDepAccSn")
    protected double inLoanAccountDepAccSn;
    @XmlElement(name = "InLoanAccountDepAccType")
    protected short inLoanAccountDepAccType;
    @XmlElement(name = "InLoanAccountDepAccUnit")
    protected int inLoanAccountDepAccUnit;
    @XmlElement(name = "InLoanAccountDrawdownExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountDrawdownExpDt;
    @XmlElement(name = "InLoanAccountDrawdownFstAmn", required = true)
    protected BigDecimal inLoanAccountDrawdownFstAmn;
    @XmlElement(name = "InLoanAccountDrawdownFstDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountDrawdownFstDt;
    @XmlElement(name = "InLoanAccountExcmptPnlPrdNo")
    protected short inLoanAccountExcmptPnlPrdNo;
    @XmlElement(name = "InLoanAccountGuaranteePerc", required = true)
    protected BigDecimal inLoanAccountGuaranteePerc;
    @XmlElement(name = "InLoanAccountInstallChgNum")
    protected short inLoanAccountInstallChgNum;
    @XmlElement(name = "InLoanAccountInstallCount")
    protected short inLoanAccountInstallCount;
    @XmlElement(name = "InLoanAccountInstallFirstDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountInstallFirstDt;
    @XmlElement(name = "InLoanAccountInstallFreq")
    protected short inLoanAccountInstallFreq;
    @XmlElement(name = "InLoanAccountInstallMechFlg")
    protected String inLoanAccountInstallMechFlg;
    @XmlElement(name = "InLoanAccountInstallNextDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountInstallNextDt;
    @XmlElement(name = "InLoanAccountInstallPrevDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountInstallPrevDt;
    @XmlElement(name = "InLoanAccountInstallSkipCap", required = true)
    protected BigDecimal inLoanAccountInstallSkipCap;
    @XmlElement(name = "InLoanAccountInstallSkipInt", required = true)
    protected BigDecimal inLoanAccountInstallSkipInt;
    @XmlElement(name = "InLoanAccountIntCalcStopFlg")
    protected String inLoanAccountIntCalcStopFlg;
    @XmlElement(name = "InLoanAccountInterCapitalizeFlg")
    protected String inLoanAccountInterCapitalizeFlg;
    @XmlElement(name = "InLoanAccountInterRateSprd", required = true)
    protected BigDecimal inLoanAccountInterRateSprd;
    @XmlElement(name = "InLoanAccountLastNrmTrxCnt")
    protected short inLoanAccountLastNrmTrxCnt;
    @XmlElement(name = "InLoanAccountLstAccrCalcDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountLstAccrCalcDt;
    @XmlElement(name = "InLoanAccountOvExpExtFlg")
    protected String inLoanAccountOvExpExtFlg;
    @XmlElement(name = "InLoanAccountRecyclingFrequency")
    protected short inLoanAccountRecyclingFrequency;
    @XmlElement(name = "InLoanAccountRecyclingFrq")
    protected short inLoanAccountRecyclingFrq;
    @XmlElement(name = "InLoanAccountSpreadEndDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountSpreadEndDt;
    @XmlElement(name = "InLoanAccountSpreadFlg")
    protected String inLoanAccountSpreadFlg;
    @XmlElement(name = "InLoanAccountSubsidyDuration")
    protected short inLoanAccountSubsidyDuration;
    @XmlElement(name = "InLoanAccountSubsidyExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountSubsidyExpDt;
    @XmlElement(name = "InLoanAccountSubsidyLimitAmn", required = true)
    protected BigDecimal inLoanAccountSubsidyLimitAmn;
    @XmlElement(name = "InLoanAccountSubsidyStartDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountSubsidyStartDt;
    @XmlElement(name = "InLoanAccountTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountTmstamp;
    @XmlElement(name = "InLoanAccountUnrealizedFlg")
    protected String inLoanAccountUnrealizedFlg;
    @XmlElement(name = "InLoanAccountInfoAccTransitionFlg")
    protected String inLoanAccountInfoAccTransitionFlg;
    @XmlElement(name = "InLoanAccountInfoAdjustmentDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountInfoAdjustmentDt;
    @XmlElement(name = "InLoanAccountInfoAgentBank")
    protected int inLoanAccountInfoAgentBank;
    @XmlElement(name = "InLoanAccountInfoAutFixIntRenew")
    protected String inLoanAccountInfoAutFixIntRenew;
    @XmlElement(name = "InLoanAccountInfoCreditIntId")
    protected int inLoanAccountInfoCreditIntId;
    @XmlElement(name = "InLoanAccountInfoCrIntSprd", required = true)
    protected BigDecimal inLoanAccountInfoCrIntSprd;
    @XmlElement(name = "InLoanAccountInfoCrSprdEndDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountInfoCrSprdEndDt;
    @XmlElement(name = "InLoanAccountInfoCrSprdStDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountInfoCrSprdStDt;
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
    @XmlElement(name = "InLogReversalIefSuppliedFlag")
    protected String inLogReversalIefSuppliedFlag;
    @XmlElement(name = "InLogTeamInformationSuper1Code")
    protected String inLogTeamInformationSuper1Code;
    @XmlElement(name = "InLogTeamInformationSuper2Code")
    protected String inLogTeamInformationSuper2Code;
    @XmlElement(name = "InMonUnitUnitCode")
    protected int inMonUnitUnitCode;
    @XmlElement(name = "InMovedCurrencyIdCurrency")
    protected int inMovedCurrencyIdCurrency;
    @XmlElement(name = "InMovedCurrencyShortDescr")
    protected String inMovedCurrencyShortDescr;
    @XmlElement(name = "InNewPackageIdPackage")
    protected int inNewPackageIdPackage;
    @XmlElement(name = "InOldPackageIdPackage")
    protected int inOldPackageIdPackage;
    @XmlElement(name = "InPreviousLoanAccountInfoAccTransitionFlg")
    protected String inPreviousLoanAccountInfoAccTransitionFlg;
    @XmlElement(name = "InPreviousLoanAccountInfoTransactSm")
    protected int inPreviousLoanAccountInfoTransactSm;
    @XmlElement(name = "InSalePointGenericDetailSerialNum")
    protected int inSalePointGenericDetailSerialNum;
    @XmlElement(name = "InSellerGenericDetailSerialNum")
    protected int inSellerGenericDetailSerialNum;
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
    @XmlElement(name = "InTransLoanAccountTotExpenseAmn", required = true)
    protected BigDecimal inTransLoanAccountTotExpenseAmn;
    @XmlElement(name = "InTransLoanAccountTotExpInCcAmn", required = true)
    protected BigDecimal inTransLoanAccountTotExpInCcAmn;
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
    @XmlElement(name = "InTrxPrftTransactionIdTransact")
    protected int inTrxPrftTransactionIdTransact;
    @XmlElement(name = "InTrxSsSecurityCmcbPrftSystem")
    protected short inTrxSsSecurityCmcbPrftSystem;
    @XmlElement(name = "InUnionCustomerCustId")
    protected int inUnionCustomerCustId;
    @XmlElement(name = "InUpdateCauseGenericDetailSerialNum")
    protected int inUpdateCauseGenericDetailSerialNum;
    @XmlElement(name = "InGrpMediators")
    protected ArrayOfL0401VInGrpMediatorsItem inGrpMediators;
    @XmlElement(name = "InPenaltyLnsInterestIdInterest")
    protected int inPenaltyLnsInterestIdInterest;
    @XmlElement(name = "InPenaltyLnsInterestDescription")
    protected String inPenaltyLnsInterestDescription;
    @XmlElement(name = "InN128LnsInterestIdInterest")
    protected int inN128LnsInterestIdInterest;
    @XmlElement(name = "InN128LnsInterestDescription")
    protected String inN128LnsInterestDescription;

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
     * Gets the value of the inGrpLoanAddInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInGrpLoanAddInfo }
     *     
     */
    public ArrayOfInGrpLoanAddInfo getInGrpLoanAddInfo() {
        return inGrpLoanAddInfo;
    }

    /**
     * Sets the value of the inGrpLoanAddInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInGrpLoanAddInfo }
     *     
     */
    public void setInGrpLoanAddInfo(ArrayOfInGrpLoanAddInfo value) {
        this.inGrpLoanAddInfo = value;
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
     * Gets the value of the inChargingCurrencyIdCurrency property.
     * 
     */
    public int getInChargingCurrencyIdCurrency() {
        return inChargingCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inChargingCurrencyIdCurrency property.
     * 
     */
    public void setInChargingCurrencyIdCurrency(int value) {
        this.inChargingCurrencyIdCurrency = value;
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
     * Gets the value of the inDialogSalePersonGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDialogSalePersonGenericDetailDescription() {
        return inDialogSalePersonGenericDetailDescription;
    }

    /**
     * Sets the value of the inDialogSalePersonGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDialogSalePersonGenericDetailDescription(String value) {
        this.inDialogSalePersonGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inDialogSalePersonGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDialogSalePersonGenericDetailShortDescription() {
        return inDialogSalePersonGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inDialogSalePersonGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDialogSalePersonGenericDetailShortDescription(String value) {
        this.inDialogSalePersonGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inDialogSaleUnitGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDialogSaleUnitGenericDetailDescription() {
        return inDialogSaleUnitGenericDetailDescription;
    }

    /**
     * Sets the value of the inDialogSaleUnitGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDialogSaleUnitGenericDetailDescription(String value) {
        this.inDialogSaleUnitGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inDialogSaleUnitGenericDetailSerialNum property.
     * 
     */
    public int getInDialogSaleUnitGenericDetailSerialNum() {
        return inDialogSaleUnitGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inDialogSaleUnitGenericDetailSerialNum property.
     * 
     */
    public void setInDialogSaleUnitGenericDetailSerialNum(int value) {
        this.inDialogSaleUnitGenericDetailSerialNum = value;
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
     * Gets the value of the inFlexFixInstallAmnLoanInstallmentInfoInstallmentAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInFlexFixInstallAmnLoanInstallmentInfoInstallmentAmn() {
        return inFlexFixInstallAmnLoanInstallmentInfoInstallmentAmn;
    }

    /**
     * Sets the value of the inFlexFixInstallAmnLoanInstallmentInfoInstallmentAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInFlexFixInstallAmnLoanInstallmentInfoInstallmentAmn(BigDecimal value) {
        this.inFlexFixInstallAmnLoanInstallmentInfoInstallmentAmn = value;
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
     * Gets the value of the inGrpLoanAddInfoLength property.
     * 
     */
    public int getInGrpLoanAddInfoLength() {
        return inGrpLoanAddInfoLength;
    }

    /**
     * Sets the value of the inGrpLoanAddInfoLength property.
     * 
     */
    public void setInGrpLoanAddInfoLength(int value) {
        this.inGrpLoanAddInfoLength = value;
    }

    /**
     * Gets the value of the inGuaranteeOrderIdGuarantee property.
     * 
     */
    public int getInGuaranteeOrderIdGuarantee() {
        return inGuaranteeOrderIdGuarantee;
    }

    /**
     * Sets the value of the inGuaranteeOrderIdGuarantee property.
     * 
     */
    public void setInGuaranteeOrderIdGuarantee(int value) {
        this.inGuaranteeOrderIdGuarantee = value;
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
     * Gets the value of the inLnsMediatorAgreementNo property.
     * 
     */
    public int getInLnsMediatorAgreementNo() {
        return inLnsMediatorAgreementNo;
    }

    /**
     * Sets the value of the inLnsMediatorAgreementNo property.
     * 
     */
    public void setInLnsMediatorAgreementNo(int value) {
        this.inLnsMediatorAgreementNo = value;
    }

    /**
     * Gets the value of the inLnsMediatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLnsMediatorName() {
        return inLnsMediatorName;
    }

    /**
     * Sets the value of the inLnsMediatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLnsMediatorName(String value) {
        this.inLnsMediatorName = value;
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
     * Gets the value of the inLoanAccountAccDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountAccDescription() {
        return inLoanAccountAccDescription;
    }

    /**
     * Sets the value of the inLoanAccountAccDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountAccDescription(String value) {
        this.inLoanAccountAccDescription = value;
    }

    /**
     * Gets the value of the inLoanAccountAccExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanAccountAccExpDt() {
        return inLoanAccountAccExpDt;
    }

    /**
     * Sets the value of the inLoanAccountAccExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanAccountAccExpDt(XMLGregorianCalendar value) {
        this.inLoanAccountAccExpDt = value;
    }

    /**
     * Gets the value of the inLoanAccountAccLimitAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountAccLimitAmn() {
        return inLoanAccountAccLimitAmn;
    }

    /**
     * Sets the value of the inLoanAccountAccLimitAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountAccLimitAmn(BigDecimal value) {
        this.inLoanAccountAccLimitAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountAccMechanism property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountAccMechanism() {
        return inLoanAccountAccMechanism;
    }

    /**
     * Sets the value of the inLoanAccountAccMechanism property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountAccMechanism(String value) {
        this.inLoanAccountAccMechanism = value;
    }

    /**
     * Gets the value of the inLoanAccountAccOpenDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanAccountAccOpenDt() {
        return inLoanAccountAccOpenDt;
    }

    /**
     * Sets the value of the inLoanAccountAccOpenDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanAccountAccOpenDt(XMLGregorianCalendar value) {
        this.inLoanAccountAccOpenDt = value;
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
     * Gets the value of the inLoanAccountAccTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountAccTerms() {
        return inLoanAccountAccTerms;
    }

    /**
     * Sets the value of the inLoanAccountAccTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountAccTerms(String value) {
        this.inLoanAccountAccTerms = value;
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
     * Gets the value of the inLoanAccountCurFxIntStDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanAccountCurFxIntStDt() {
        return inLoanAccountCurFxIntStDt;
    }

    /**
     * Sets the value of the inLoanAccountCurFxIntStDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanAccountCurFxIntStDt(XMLGregorianCalendar value) {
        this.inLoanAccountCurFxIntStDt = value;
    }

    /**
     * Gets the value of the inLoanAccountDepAccCd property.
     * 
     */
    public short getInLoanAccountDepAccCd() {
        return inLoanAccountDepAccCd;
    }

    /**
     * Sets the value of the inLoanAccountDepAccCd property.
     * 
     */
    public void setInLoanAccountDepAccCd(short value) {
        this.inLoanAccountDepAccCd = value;
    }

    /**
     * Gets the value of the inLoanAccountDepAccSn property.
     * 
     */
    public double getInLoanAccountDepAccSn() {
        return inLoanAccountDepAccSn;
    }

    /**
     * Sets the value of the inLoanAccountDepAccSn property.
     * 
     */
    public void setInLoanAccountDepAccSn(double value) {
        this.inLoanAccountDepAccSn = value;
    }

    /**
     * Gets the value of the inLoanAccountDepAccType property.
     * 
     */
    public short getInLoanAccountDepAccType() {
        return inLoanAccountDepAccType;
    }

    /**
     * Sets the value of the inLoanAccountDepAccType property.
     * 
     */
    public void setInLoanAccountDepAccType(short value) {
        this.inLoanAccountDepAccType = value;
    }

    /**
     * Gets the value of the inLoanAccountDepAccUnit property.
     * 
     */
    public int getInLoanAccountDepAccUnit() {
        return inLoanAccountDepAccUnit;
    }

    /**
     * Sets the value of the inLoanAccountDepAccUnit property.
     * 
     */
    public void setInLoanAccountDepAccUnit(int value) {
        this.inLoanAccountDepAccUnit = value;
    }

    /**
     * Gets the value of the inLoanAccountDrawdownExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanAccountDrawdownExpDt() {
        return inLoanAccountDrawdownExpDt;
    }

    /**
     * Sets the value of the inLoanAccountDrawdownExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanAccountDrawdownExpDt(XMLGregorianCalendar value) {
        this.inLoanAccountDrawdownExpDt = value;
    }

    /**
     * Gets the value of the inLoanAccountDrawdownFstAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountDrawdownFstAmn() {
        return inLoanAccountDrawdownFstAmn;
    }

    /**
     * Sets the value of the inLoanAccountDrawdownFstAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountDrawdownFstAmn(BigDecimal value) {
        this.inLoanAccountDrawdownFstAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountDrawdownFstDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanAccountDrawdownFstDt() {
        return inLoanAccountDrawdownFstDt;
    }

    /**
     * Sets the value of the inLoanAccountDrawdownFstDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanAccountDrawdownFstDt(XMLGregorianCalendar value) {
        this.inLoanAccountDrawdownFstDt = value;
    }

    /**
     * Gets the value of the inLoanAccountExcmptPnlPrdNo property.
     * 
     */
    public short getInLoanAccountExcmptPnlPrdNo() {
        return inLoanAccountExcmptPnlPrdNo;
    }

    /**
     * Sets the value of the inLoanAccountExcmptPnlPrdNo property.
     * 
     */
    public void setInLoanAccountExcmptPnlPrdNo(short value) {
        this.inLoanAccountExcmptPnlPrdNo = value;
    }

    /**
     * Gets the value of the inLoanAccountGuaranteePerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountGuaranteePerc() {
        return inLoanAccountGuaranteePerc;
    }

    /**
     * Sets the value of the inLoanAccountGuaranteePerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountGuaranteePerc(BigDecimal value) {
        this.inLoanAccountGuaranteePerc = value;
    }

    /**
     * Gets the value of the inLoanAccountInstallChgNum property.
     * 
     */
    public short getInLoanAccountInstallChgNum() {
        return inLoanAccountInstallChgNum;
    }

    /**
     * Sets the value of the inLoanAccountInstallChgNum property.
     * 
     */
    public void setInLoanAccountInstallChgNum(short value) {
        this.inLoanAccountInstallChgNum = value;
    }

    /**
     * Gets the value of the inLoanAccountInstallCount property.
     * 
     */
    public short getInLoanAccountInstallCount() {
        return inLoanAccountInstallCount;
    }

    /**
     * Sets the value of the inLoanAccountInstallCount property.
     * 
     */
    public void setInLoanAccountInstallCount(short value) {
        this.inLoanAccountInstallCount = value;
    }

    /**
     * Gets the value of the inLoanAccountInstallFirstDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanAccountInstallFirstDt() {
        return inLoanAccountInstallFirstDt;
    }

    /**
     * Sets the value of the inLoanAccountInstallFirstDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanAccountInstallFirstDt(XMLGregorianCalendar value) {
        this.inLoanAccountInstallFirstDt = value;
    }

    /**
     * Gets the value of the inLoanAccountInstallFreq property.
     * 
     */
    public short getInLoanAccountInstallFreq() {
        return inLoanAccountInstallFreq;
    }

    /**
     * Sets the value of the inLoanAccountInstallFreq property.
     * 
     */
    public void setInLoanAccountInstallFreq(short value) {
        this.inLoanAccountInstallFreq = value;
    }

    /**
     * Gets the value of the inLoanAccountInstallMechFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountInstallMechFlg() {
        return inLoanAccountInstallMechFlg;
    }

    /**
     * Sets the value of the inLoanAccountInstallMechFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountInstallMechFlg(String value) {
        this.inLoanAccountInstallMechFlg = value;
    }

    /**
     * Gets the value of the inLoanAccountInstallNextDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanAccountInstallNextDt() {
        return inLoanAccountInstallNextDt;
    }

    /**
     * Sets the value of the inLoanAccountInstallNextDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanAccountInstallNextDt(XMLGregorianCalendar value) {
        this.inLoanAccountInstallNextDt = value;
    }

    /**
     * Gets the value of the inLoanAccountInstallPrevDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanAccountInstallPrevDt() {
        return inLoanAccountInstallPrevDt;
    }

    /**
     * Sets the value of the inLoanAccountInstallPrevDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanAccountInstallPrevDt(XMLGregorianCalendar value) {
        this.inLoanAccountInstallPrevDt = value;
    }

    /**
     * Gets the value of the inLoanAccountInstallSkipCap property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountInstallSkipCap() {
        return inLoanAccountInstallSkipCap;
    }

    /**
     * Sets the value of the inLoanAccountInstallSkipCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountInstallSkipCap(BigDecimal value) {
        this.inLoanAccountInstallSkipCap = value;
    }

    /**
     * Gets the value of the inLoanAccountInstallSkipInt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountInstallSkipInt() {
        return inLoanAccountInstallSkipInt;
    }

    /**
     * Sets the value of the inLoanAccountInstallSkipInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountInstallSkipInt(BigDecimal value) {
        this.inLoanAccountInstallSkipInt = value;
    }

    /**
     * Gets the value of the inLoanAccountIntCalcStopFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountIntCalcStopFlg() {
        return inLoanAccountIntCalcStopFlg;
    }

    /**
     * Sets the value of the inLoanAccountIntCalcStopFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountIntCalcStopFlg(String value) {
        this.inLoanAccountIntCalcStopFlg = value;
    }

    /**
     * Gets the value of the inLoanAccountInterCapitalizeFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountInterCapitalizeFlg() {
        return inLoanAccountInterCapitalizeFlg;
    }

    /**
     * Sets the value of the inLoanAccountInterCapitalizeFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountInterCapitalizeFlg(String value) {
        this.inLoanAccountInterCapitalizeFlg = value;
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
     * Gets the value of the inLoanAccountLastNrmTrxCnt property.
     * 
     */
    public short getInLoanAccountLastNrmTrxCnt() {
        return inLoanAccountLastNrmTrxCnt;
    }

    /**
     * Sets the value of the inLoanAccountLastNrmTrxCnt property.
     * 
     */
    public void setInLoanAccountLastNrmTrxCnt(short value) {
        this.inLoanAccountLastNrmTrxCnt = value;
    }

    /**
     * Gets the value of the inLoanAccountLstAccrCalcDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanAccountLstAccrCalcDt() {
        return inLoanAccountLstAccrCalcDt;
    }

    /**
     * Sets the value of the inLoanAccountLstAccrCalcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanAccountLstAccrCalcDt(XMLGregorianCalendar value) {
        this.inLoanAccountLstAccrCalcDt = value;
    }

    /**
     * Gets the value of the inLoanAccountOvExpExtFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountOvExpExtFlg() {
        return inLoanAccountOvExpExtFlg;
    }

    /**
     * Sets the value of the inLoanAccountOvExpExtFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountOvExpExtFlg(String value) {
        this.inLoanAccountOvExpExtFlg = value;
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
     * Gets the value of the inLoanAccountRecyclingFrq property.
     * 
     */
    public short getInLoanAccountRecyclingFrq() {
        return inLoanAccountRecyclingFrq;
    }

    /**
     * Sets the value of the inLoanAccountRecyclingFrq property.
     * 
     */
    public void setInLoanAccountRecyclingFrq(short value) {
        this.inLoanAccountRecyclingFrq = value;
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
     * Gets the value of the inLoanAccountSpreadFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountSpreadFlg() {
        return inLoanAccountSpreadFlg;
    }

    /**
     * Sets the value of the inLoanAccountSpreadFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountSpreadFlg(String value) {
        this.inLoanAccountSpreadFlg = value;
    }

    /**
     * Gets the value of the inLoanAccountSubsidyDuration property.
     * 
     */
    public short getInLoanAccountSubsidyDuration() {
        return inLoanAccountSubsidyDuration;
    }

    /**
     * Sets the value of the inLoanAccountSubsidyDuration property.
     * 
     */
    public void setInLoanAccountSubsidyDuration(short value) {
        this.inLoanAccountSubsidyDuration = value;
    }

    /**
     * Gets the value of the inLoanAccountSubsidyExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanAccountSubsidyExpDt() {
        return inLoanAccountSubsidyExpDt;
    }

    /**
     * Sets the value of the inLoanAccountSubsidyExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanAccountSubsidyExpDt(XMLGregorianCalendar value) {
        this.inLoanAccountSubsidyExpDt = value;
    }

    /**
     * Gets the value of the inLoanAccountSubsidyLimitAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountSubsidyLimitAmn() {
        return inLoanAccountSubsidyLimitAmn;
    }

    /**
     * Sets the value of the inLoanAccountSubsidyLimitAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountSubsidyLimitAmn(BigDecimal value) {
        this.inLoanAccountSubsidyLimitAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountSubsidyStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanAccountSubsidyStartDt() {
        return inLoanAccountSubsidyStartDt;
    }

    /**
     * Sets the value of the inLoanAccountSubsidyStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanAccountSubsidyStartDt(XMLGregorianCalendar value) {
        this.inLoanAccountSubsidyStartDt = value;
    }

    /**
     * Gets the value of the inLoanAccountTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanAccountTmstamp() {
        return inLoanAccountTmstamp;
    }

    /**
     * Sets the value of the inLoanAccountTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanAccountTmstamp(XMLGregorianCalendar value) {
        this.inLoanAccountTmstamp = value;
    }

    /**
     * Gets the value of the inLoanAccountUnrealizedFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountUnrealizedFlg() {
        return inLoanAccountUnrealizedFlg;
    }

    /**
     * Sets the value of the inLoanAccountUnrealizedFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountUnrealizedFlg(String value) {
        this.inLoanAccountUnrealizedFlg = value;
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
     * Gets the value of the inLogReversalIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogReversalIefSuppliedFlag() {
        return inLogReversalIefSuppliedFlag;
    }

    /**
     * Sets the value of the inLogReversalIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogReversalIefSuppliedFlag(String value) {
        this.inLogReversalIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inLogTeamInformationSuper1Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogTeamInformationSuper1Code() {
        return inLogTeamInformationSuper1Code;
    }

    /**
     * Sets the value of the inLogTeamInformationSuper1Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogTeamInformationSuper1Code(String value) {
        this.inLogTeamInformationSuper1Code = value;
    }

    /**
     * Gets the value of the inLogTeamInformationSuper2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogTeamInformationSuper2Code() {
        return inLogTeamInformationSuper2Code;
    }

    /**
     * Sets the value of the inLogTeamInformationSuper2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogTeamInformationSuper2Code(String value) {
        this.inLogTeamInformationSuper2Code = value;
    }

    /**
     * Gets the value of the inMonUnitUnitCode property.
     * 
     */
    public int getInMonUnitUnitCode() {
        return inMonUnitUnitCode;
    }

    /**
     * Sets the value of the inMonUnitUnitCode property.
     * 
     */
    public void setInMonUnitUnitCode(int value) {
        this.inMonUnitUnitCode = value;
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
     * Gets the value of the inNewPackageIdPackage property.
     * 
     */
    public int getInNewPackageIdPackage() {
        return inNewPackageIdPackage;
    }

    /**
     * Sets the value of the inNewPackageIdPackage property.
     * 
     */
    public void setInNewPackageIdPackage(int value) {
        this.inNewPackageIdPackage = value;
    }

    /**
     * Gets the value of the inOldPackageIdPackage property.
     * 
     */
    public int getInOldPackageIdPackage() {
        return inOldPackageIdPackage;
    }

    /**
     * Sets the value of the inOldPackageIdPackage property.
     * 
     */
    public void setInOldPackageIdPackage(int value) {
        this.inOldPackageIdPackage = value;
    }

    /**
     * Gets the value of the inPreviousLoanAccountInfoAccTransitionFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPreviousLoanAccountInfoAccTransitionFlg() {
        return inPreviousLoanAccountInfoAccTransitionFlg;
    }

    /**
     * Sets the value of the inPreviousLoanAccountInfoAccTransitionFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPreviousLoanAccountInfoAccTransitionFlg(String value) {
        this.inPreviousLoanAccountInfoAccTransitionFlg = value;
    }

    /**
     * Gets the value of the inPreviousLoanAccountInfoTransactSm property.
     * 
     */
    public int getInPreviousLoanAccountInfoTransactSm() {
        return inPreviousLoanAccountInfoTransactSm;
    }

    /**
     * Sets the value of the inPreviousLoanAccountInfoTransactSm property.
     * 
     */
    public void setInPreviousLoanAccountInfoTransactSm(int value) {
        this.inPreviousLoanAccountInfoTransactSm = value;
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

    /**
     * Gets the value of the inGrpMediators property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfL0401VInGrpMediatorsItem }
     *     
     */
    public ArrayOfL0401VInGrpMediatorsItem getInGrpMediators() {
        return inGrpMediators;
    }

    /**
     * Sets the value of the inGrpMediators property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfL0401VInGrpMediatorsItem }
     *     
     */
    public void setInGrpMediators(ArrayOfL0401VInGrpMediatorsItem value) {
        this.inGrpMediators = value;
    }

    /**
     * Gets the value of the inPenaltyLnsInterestIdInterest property.
     * 
     */
    public int getInPenaltyLnsInterestIdInterest() {
        return inPenaltyLnsInterestIdInterest;
    }

    /**
     * Sets the value of the inPenaltyLnsInterestIdInterest property.
     * 
     */
    public void setInPenaltyLnsInterestIdInterest(int value) {
        this.inPenaltyLnsInterestIdInterest = value;
    }

    /**
     * Gets the value of the inPenaltyLnsInterestDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPenaltyLnsInterestDescription() {
        return inPenaltyLnsInterestDescription;
    }

    /**
     * Sets the value of the inPenaltyLnsInterestDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPenaltyLnsInterestDescription(String value) {
        this.inPenaltyLnsInterestDescription = value;
    }

    /**
     * Gets the value of the inN128LnsInterestIdInterest property.
     * 
     */
    public int getInN128LnsInterestIdInterest() {
        return inN128LnsInterestIdInterest;
    }

    /**
     * Sets the value of the inN128LnsInterestIdInterest property.
     * 
     */
    public void setInN128LnsInterestIdInterest(int value) {
        this.inN128LnsInterestIdInterest = value;
    }

    /**
     * Gets the value of the inN128LnsInterestDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInN128LnsInterestDescription() {
        return inN128LnsInterestDescription;
    }

    /**
     * Sets the value of the inN128LnsInterestDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInN128LnsInterestDescription(String value) {
        this.inN128LnsInterestDescription = value;
    }

}
