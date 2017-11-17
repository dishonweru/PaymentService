
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RepaymentScheduleScenarioImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RepaymentScheduleScenarioImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InAccMovementCurrencyDisplayedDecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InAccMovementCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAccMovementCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCurValIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDaysbaseLnsInterestDaysbase" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDiffIntAlgLoanAccountInfoDiffIntAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InEnoikiagoraExpensesIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InEnoikiagoraLnsSuppliedEnoikiagora0No1Yes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFirstLoanIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InFixedDateLoanAccountCurFxIntExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InFixedLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InFixInstallLoanInstallmentInfoInstallmentAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InFloatingLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InFloatingLoanInstallmentInfoInstallDbIntPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpCapitalLr" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfInGrpCapitalLr" minOccurs="0"/>
 *         &lt;element name="InGrpFlexOmitInstl" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfInGrpFlexOmitInstl" minOccurs="0"/>
 *         &lt;element name="InGrpDbSelectedInsProds" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfInGrpDbSelectedInsProdsItem" minOccurs="0"/>
 *         &lt;element name="InInstallFlexIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInstallFlexStabOmitIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInstallFlexVarOmitIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInstallInfoLoanInstallmentInfoInstallCollectionCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InInstallInfoLoanInstallmentInfoInstallDaysbase" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InInstallInfoLoanInstallmentInfoInstallDbIntPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InInstallInfoLoanInstallmentInfoInstallEftePerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InInstallInfoLoanInstallmentInfoInstallFrequency" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InInstallInfoLoanInstallmentInfoInstallN128Perc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InInstallInfoLoanInstallmentInfoInstallPeriodInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInstallInfoLoanInstallmentInfoInstallSpreadPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InInstallInfoLoanInstallmentInfoInstallSubs2Perc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InInstallInfoLoanInstallmentInfoInstallSubsPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InInstallInfoLoanInstallmentInfoMoratoriumEndDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InInstallInfoLoanInstallmentInfoStartingCapitalAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLnsInterestIntDuration" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLnsSuppliedProduct360365" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanGeneralFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanInterDaysInst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanLoanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanMaxInstallCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanMaxInstallFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanMinInstallCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanMinInstallFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountAccDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountAccExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountAccLimitAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountAccMechanism" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountAccOpenDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountAccSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLoanAccountAccSpcAgrFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountAccTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountAtmCardFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountCurFxIntExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountCurFxIntInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountCurFxIntScalDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountCurFxIntStDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountCusStmLstTrnDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountCusStmNxtTrnDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLoanAccountDepAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountDepAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountDepAccUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLoanAccountDrawdownExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountDrawdownFstAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountDrawdownFstDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountExcmptPnlPrdCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountExcmptPnlPrdNo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountFixedIntRenewDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
 *         &lt;element name="InLoanAccountLoanStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountLstAccrCalcDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountLstAprIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountLstAprYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountLstAugIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountLstAugYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountLstDecIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountLstDecYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountLstFebIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountLstFebYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountLstIntCalcDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountLstJanIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountLstJanYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountLstJulIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountLstJulYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountLstJunIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountLstJunYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountLstMarIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountLstMarYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountLstMayIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountLstMayYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountLstNovIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountLstNovYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountLstOctIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountLstOctYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountLstSepIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountLstSepYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountLstTrxDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountLumpDrawdownFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountMainBenefCategor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLoanAccountMoratorN128Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountMoratorNrmRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountMoratorSprRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountMoratorSubsRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountMpStartCapAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountNrAcrPubIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountNrmAcrIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountNrmCapBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountNrmChrgCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountNrmComBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountNrmExpBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountNrmInstCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountNrmIntCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountNrmLoanCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountNrmRlIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountNrmSubsidyBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountNrmUrlIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountNrUrlPubIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountOldAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountOldAccountNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountOvAcrNrmIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountOvAcrPnlIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountOvAcrPubIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountOvCapBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountOvChrgCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountOvComBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountOvExpBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountOvExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountOvExpExtFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountOvInstCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountOvIntCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountOvLoanCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountOvRlNrmIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountOvRlPnlIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountOvSubsidyBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountOvUrlNrmIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountOvUrlPnlIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountOvUrlPubIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountPrvFxIntExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountPrvFxIntScalDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountPrvFxIntStDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountRecyclingFrequency" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountRecyclingFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountRecyclingLmtFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountReqExpSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountReqInstallSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountReqIntSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountReqLoanSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountSpreadEndDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountSpreadFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountStatementFreq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountSubsidyDuration" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountSubsidyEndFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountSubsidyExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountSubsidyLimitAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountSubsidyStartDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountToleranceDays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountTotCapAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountTotComInCcAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountTotCommissionAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountTotConfirmAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountTotDrawdownAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountTotExpenseAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountTotExpInCcAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountTotIntSprdAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountTotNrmIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountTotPnlIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountTotPubCommAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountTotSubsIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountTotThrdprtAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLoanAccountUnpaidCollCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountUnrealizedFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountVillageSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLoanAccountInfoMoratIntPayFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountInfoMoratoriumIntFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanLoanRequestRqCapitalBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanWorkFlgsEqInterestFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanWorkFlgsInsuranceChargesFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanWorkFlgsIntCalcOnInstalmentFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanWorkFlgsPositiveBalFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanWorkFlgsVariableInstalmentFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMaintainEqInstLoanAccountInfoMaintainEqInst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InNewOpenDateLoanAccountAccOpenDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InPosostoInsurProdCodePercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InPosostoInsurProdCodeProdId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProdProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InShowLoanIntCapitalFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInstall13thPayIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInstallDoubleIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInstallNormalIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInstallOmitIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGpLoanIntCapitalFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGpLoanIntPayableFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGpLoanLoanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGpLoanMoratIntPayFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGpLoanNoIntMoratorFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGpLoanNonIntCapitFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSubsidyPercentageIefSuppliedPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTotalLoanIefSuppliedTotalInteger" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InExpensesLnsSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InCoinsuredGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfL0436VInCoinsuredGrpItem" minOccurs="0"/>
 *         &lt;element name="InMrtAmortizeFlgIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepaymentScheduleScenarioImport", propOrder = {
    "inAccMovementCurrencyDisplayedDecimalPlaces",
    "inAccMovementCurrencyIdCurrency",
    "inAccMovementCurrencyShortDescr",
    "inCurValIefSuppliedFlag",
    "inDaysbaseLnsInterestDaysbase",
    "inDiffIntAlgLoanAccountInfoDiffIntAlgorithm",
    "inEnoikiagoraExpensesIefSuppliedNumber152",
    "inEnoikiagoraLnsSuppliedEnoikiagora0No1Yes",
    "inFirstLoanIefSuppliedDate",
    "inFixedDateLoanAccountCurFxIntExpDt",
    "inFixedLnsInterestIdInterest",
    "inFixInstallLoanInstallmentInfoInstallmentAmn",
    "inFloatingLnsInterestIdInterest",
    "inFloatingLoanInstallmentInfoInstallDbIntPerc",
    "inGrpCapitalLr",
    "inGrpFlexOmitInstl",
    "inGrpDbSelectedInsProds",
    "inInstallFlexIefSuppliedChar1",
    "inInstallFlexStabOmitIefSuppliedChar1",
    "inInstallFlexVarOmitIefSuppliedChar1",
    "inInstallInfoLoanInstallmentInfoInstallCollectionCnt",
    "inInstallInfoLoanInstallmentInfoInstallDaysbase",
    "inInstallInfoLoanInstallmentInfoInstallDbIntPerc",
    "inInstallInfoLoanInstallmentInfoInstallEftePerc",
    "inInstallInfoLoanInstallmentInfoInstallFrequency",
    "inInstallInfoLoanInstallmentInfoInstallN128Perc",
    "inInstallInfoLoanInstallmentInfoInstallPeriodInd",
    "inInstallInfoLoanInstallmentInfoInstallSpreadPerc",
    "inInstallInfoLoanInstallmentInfoInstallSubs2Perc",
    "inInstallInfoLoanInstallmentInfoInstallSubsPerc",
    "inInstallInfoLoanInstallmentInfoMoratoriumEndDt",
    "inInstallInfoLoanInstallmentInfoStartingCapitalAmn",
    "inLnsInterestIntDuration",
    "inLnsSuppliedProduct360365",
    "inLoanGeneralFlags",
    "inLoanInterDaysInst",
    "inLoanLoanType",
    "inLoanMaxInstallCnt",
    "inLoanMaxInstallFrq",
    "inLoanMinInstallCnt",
    "inLoanMinInstallFrq",
    "inLoanAccountAccCd",
    "inLoanAccountAccDescription",
    "inLoanAccountAccExpDt",
    "inLoanAccountAccLimitAmn",
    "inLoanAccountAccMechanism",
    "inLoanAccountAccOpenDt",
    "inLoanAccountAccSn",
    "inLoanAccountAccSpcAgrFlg",
    "inLoanAccountAccStatus",
    "inLoanAccountAccTerms",
    "inLoanAccountAccType",
    "inLoanAccountAtmCardFlag",
    "inLoanAccountCurFxIntExpDt",
    "inLoanAccountCurFxIntInd",
    "inLoanAccountCurFxIntScalDt",
    "inLoanAccountCurFxIntStDt",
    "inLoanAccountCusStmLstTrnDt",
    "inLoanAccountCusStmNxtTrnDt",
    "inLoanAccountCustId",
    "inLoanAccountDepAccCd",
    "inLoanAccountDepAccType",
    "inLoanAccountDepAccUnit",
    "inLoanAccountDrawdownExpDt",
    "inLoanAccountDrawdownFstAmn",
    "inLoanAccountDrawdownFstDt",
    "inLoanAccountExcmptPnlPrdCnt",
    "inLoanAccountExcmptPnlPrdNo",
    "inLoanAccountFixedIntRenewDt",
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
    "inLoanAccountLoanStatus",
    "inLoanAccountLstAccrCalcDt",
    "inLoanAccountLstAprIntDbAmn",
    "inLoanAccountLstAprYear",
    "inLoanAccountLstAugIntDbAmn",
    "inLoanAccountLstAugYear",
    "inLoanAccountLstDecIntDbAmn",
    "inLoanAccountLstDecYear",
    "inLoanAccountLstFebIntDbAmn",
    "inLoanAccountLstFebYear",
    "inLoanAccountLstIntCalcDt",
    "inLoanAccountLstJanIntDbAmn",
    "inLoanAccountLstJanYear",
    "inLoanAccountLstJulIntDbAmn",
    "inLoanAccountLstJulYear",
    "inLoanAccountLstJunIntDbAmn",
    "inLoanAccountLstJunYear",
    "inLoanAccountLstMarIntDbAmn",
    "inLoanAccountLstMarYear",
    "inLoanAccountLstMayIntDbAmn",
    "inLoanAccountLstMayYear",
    "inLoanAccountLstNovIntDbAmn",
    "inLoanAccountLstNovYear",
    "inLoanAccountLstOctIntDbAmn",
    "inLoanAccountLstOctYear",
    "inLoanAccountLstSepIntDbAmn",
    "inLoanAccountLstSepYear",
    "inLoanAccountLstTrxDt",
    "inLoanAccountLumpDrawdownFlg",
    "inLoanAccountMainBenefCategor",
    "inLoanAccountMoratorN128Rate",
    "inLoanAccountMoratorNrmRate",
    "inLoanAccountMoratorSprRate",
    "inLoanAccountMoratorSubsRate",
    "inLoanAccountMpStartCapAmn",
    "inLoanAccountNrAcrPubIntAmn",
    "inLoanAccountNrmAcrIntBal",
    "inLoanAccountNrmCapBal",
    "inLoanAccountNrmChrgCnt",
    "inLoanAccountNrmComBal",
    "inLoanAccountNrmExpBal",
    "inLoanAccountNrmInstCnt",
    "inLoanAccountNrmIntCnt",
    "inLoanAccountNrmLoanCnt",
    "inLoanAccountNrmRlIntBal",
    "inLoanAccountNrmSubsidyBal",
    "inLoanAccountNrmUrlIntBal",
    "inLoanAccountNrUrlPubIntAmn",
    "inLoanAccountOldAccountCd",
    "inLoanAccountOldAccountNum",
    "inLoanAccountOvAcrNrmIntBal",
    "inLoanAccountOvAcrPnlIntBal",
    "inLoanAccountOvAcrPubIntAmn",
    "inLoanAccountOvCapBal",
    "inLoanAccountOvChrgCnt",
    "inLoanAccountOvComBal",
    "inLoanAccountOvExpBal",
    "inLoanAccountOvExpDt",
    "inLoanAccountOvExpExtFlg",
    "inLoanAccountOvInstCnt",
    "inLoanAccountOvIntCnt",
    "inLoanAccountOvLoanCnt",
    "inLoanAccountOvRlNrmIntBal",
    "inLoanAccountOvRlPnlIntBal",
    "inLoanAccountOvSubsidyBal",
    "inLoanAccountOvUrlNrmIntBal",
    "inLoanAccountOvUrlPnlIntBal",
    "inLoanAccountOvUrlPubIntAmn",
    "inLoanAccountPrvFxIntExpDt",
    "inLoanAccountPrvFxIntScalDt",
    "inLoanAccountPrvFxIntStDt",
    "inLoanAccountRecyclingFrequency",
    "inLoanAccountRecyclingFrq",
    "inLoanAccountRecyclingLmtFlg",
    "inLoanAccountReqExpSn",
    "inLoanAccountReqInstallSn",
    "inLoanAccountReqIntSn",
    "inLoanAccountReqLoanSn",
    "inLoanAccountShortName",
    "inLoanAccountSpreadEndDt",
    "inLoanAccountSpreadFlg",
    "inLoanAccountStatementFreq",
    "inLoanAccountSubsidyDuration",
    "inLoanAccountSubsidyEndFlg",
    "inLoanAccountSubsidyExpDt",
    "inLoanAccountSubsidyLimitAmn",
    "inLoanAccountSubsidyStartDt",
    "inLoanAccountTmstamp",
    "inLoanAccountToleranceDays",
    "inLoanAccountTotCapAmn",
    "inLoanAccountTotComInCcAmn",
    "inLoanAccountTotCommissionAmn",
    "inLoanAccountTotConfirmAmn",
    "inLoanAccountTotDrawdownAmn",
    "inLoanAccountTotExpenseAmn",
    "inLoanAccountTotExpInCcAmn",
    "inLoanAccountTotIntSprdAmn",
    "inLoanAccountTotNrmIntAmn",
    "inLoanAccountTotPnlIntAmn",
    "inLoanAccountTotPubCommAmn",
    "inLoanAccountTotSubsIntAmn",
    "inLoanAccountTotThrdprtAmn",
    "inLoanAccountUnit",
    "inLoanAccountUnpaidCollCnt",
    "inLoanAccountUnrealizedFlg",
    "inLoanAccountUsr",
    "inLoanAccountVillageSn",
    "inLoanAccountInfoMoratIntPayFlg",
    "inLoanAccountInfoMoratoriumIntFrq",
    "inLoanLoanRequestRqCapitalBal",
    "inLoanWorkFlgsEqInterestFlg",
    "inLoanWorkFlgsInsuranceChargesFlg",
    "inLoanWorkFlgsIntCalcOnInstalmentFlg",
    "inLoanWorkFlgsPositiveBalFlg",
    "inLoanWorkFlgsVariableInstalmentFlg",
    "inMaintainEqInstLoanAccountInfoMaintainEqInst",
    "inNewOpenDateLoanAccountAccOpenDt",
    "inPosostoInsurProdCodePercentage",
    "inPosostoInsurProdCodeProdId",
    "inProdProductIdProduct",
    "inShowLoanIntCapitalFlg",
    "inTerminalTerminalNumber",
    "inInstall13ThPayIefSuppliedChar1",
    "inInstallDoubleIefSuppliedChar1",
    "inInstallNormalIefSuppliedChar1",
    "inInstallOmitIefSuppliedChar1",
    "inGpLoanIntCapitalFlg",
    "inGpLoanIntPayableFlg",
    "inGpLoanLoanType",
    "inGpLoanMoratIntPayFlg",
    "inGpLoanNoIntMoratorFlg",
    "inGpLoanNonIntCapitFlg",
    "inSubsidyPercentageIefSuppliedPercentage",
    "inTotalLoanIefSuppliedTotalInteger",
    "inExpensesLnsSuppliedAmount",
    "inCoinsuredGrp",
    "inMrtAmortizeFlgIefSuppliedFlag"
})
public class RepaymentScheduleScenarioImport
    extends BaseImport
{

    @XmlElement(name = "InAccMovementCurrencyDisplayedDecimalPlaces")
    protected short inAccMovementCurrencyDisplayedDecimalPlaces;
    @XmlElement(name = "InAccMovementCurrencyIdCurrency")
    protected int inAccMovementCurrencyIdCurrency;
    @XmlElement(name = "InAccMovementCurrencyShortDescr")
    protected String inAccMovementCurrencyShortDescr;
    @XmlElement(name = "InCurValIefSuppliedFlag")
    protected String inCurValIefSuppliedFlag;
    @XmlElement(name = "InDaysbaseLnsInterestDaysbase")
    protected short inDaysbaseLnsInterestDaysbase;
    @XmlElement(name = "InDiffIntAlgLoanAccountInfoDiffIntAlgorithm")
    protected String inDiffIntAlgLoanAccountInfoDiffIntAlgorithm;
    @XmlElement(name = "InEnoikiagoraExpensesIefSuppliedNumber152", required = true)
    protected BigDecimal inEnoikiagoraExpensesIefSuppliedNumber152;
    @XmlElement(name = "InEnoikiagoraLnsSuppliedEnoikiagora0No1Yes")
    protected String inEnoikiagoraLnsSuppliedEnoikiagora0No1Yes;
    @XmlElement(name = "InFirstLoanIefSuppliedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inFirstLoanIefSuppliedDate;
    @XmlElement(name = "InFixedDateLoanAccountCurFxIntExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inFixedDateLoanAccountCurFxIntExpDt;
    @XmlElement(name = "InFixedLnsInterestIdInterest")
    protected int inFixedLnsInterestIdInterest;
    @XmlElement(name = "InFixInstallLoanInstallmentInfoInstallmentAmn", required = true)
    protected BigDecimal inFixInstallLoanInstallmentInfoInstallmentAmn;
    @XmlElement(name = "InFloatingLnsInterestIdInterest")
    protected int inFloatingLnsInterestIdInterest;
    @XmlElement(name = "InFloatingLoanInstallmentInfoInstallDbIntPerc", required = true)
    protected BigDecimal inFloatingLoanInstallmentInfoInstallDbIntPerc;
    @XmlElement(name = "InGrpCapitalLr")
    protected ArrayOfInGrpCapitalLr inGrpCapitalLr;
    @XmlElement(name = "InGrpFlexOmitInstl")
    protected ArrayOfInGrpFlexOmitInstl inGrpFlexOmitInstl;
    @XmlElement(name = "InGrpDbSelectedInsProds")
    protected ArrayOfInGrpDbSelectedInsProdsItem inGrpDbSelectedInsProds;
    @XmlElement(name = "InInstallFlexIefSuppliedChar1")
    protected String inInstallFlexIefSuppliedChar1;
    @XmlElement(name = "InInstallFlexStabOmitIefSuppliedChar1")
    protected String inInstallFlexStabOmitIefSuppliedChar1;
    @XmlElement(name = "InInstallFlexVarOmitIefSuppliedChar1")
    protected String inInstallFlexVarOmitIefSuppliedChar1;
    @XmlElement(name = "InInstallInfoLoanInstallmentInfoInstallCollectionCnt")
    protected short inInstallInfoLoanInstallmentInfoInstallCollectionCnt;
    @XmlElement(name = "InInstallInfoLoanInstallmentInfoInstallDaysbase")
    protected short inInstallInfoLoanInstallmentInfoInstallDaysbase;
    @XmlElement(name = "InInstallInfoLoanInstallmentInfoInstallDbIntPerc", required = true)
    protected BigDecimal inInstallInfoLoanInstallmentInfoInstallDbIntPerc;
    @XmlElement(name = "InInstallInfoLoanInstallmentInfoInstallEftePerc", required = true)
    protected BigDecimal inInstallInfoLoanInstallmentInfoInstallEftePerc;
    @XmlElement(name = "InInstallInfoLoanInstallmentInfoInstallFrequency")
    protected short inInstallInfoLoanInstallmentInfoInstallFrequency;
    @XmlElement(name = "InInstallInfoLoanInstallmentInfoInstallN128Perc", required = true)
    protected BigDecimal inInstallInfoLoanInstallmentInfoInstallN128Perc;
    @XmlElement(name = "InInstallInfoLoanInstallmentInfoInstallPeriodInd")
    protected String inInstallInfoLoanInstallmentInfoInstallPeriodInd;
    @XmlElement(name = "InInstallInfoLoanInstallmentInfoInstallSpreadPerc", required = true)
    protected BigDecimal inInstallInfoLoanInstallmentInfoInstallSpreadPerc;
    @XmlElement(name = "InInstallInfoLoanInstallmentInfoInstallSubs2Perc", required = true)
    protected BigDecimal inInstallInfoLoanInstallmentInfoInstallSubs2Perc;
    @XmlElement(name = "InInstallInfoLoanInstallmentInfoInstallSubsPerc", required = true)
    protected BigDecimal inInstallInfoLoanInstallmentInfoInstallSubsPerc;
    @XmlElement(name = "InInstallInfoLoanInstallmentInfoMoratoriumEndDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inInstallInfoLoanInstallmentInfoMoratoriumEndDt;
    @XmlElement(name = "InInstallInfoLoanInstallmentInfoStartingCapitalAmn", required = true)
    protected BigDecimal inInstallInfoLoanInstallmentInfoStartingCapitalAmn;
    @XmlElement(name = "InLnsInterestIntDuration")
    protected short inLnsInterestIntDuration;
    @XmlElement(name = "InLnsSuppliedProduct360365")
    protected String inLnsSuppliedProduct360365;
    @XmlElement(name = "InLoanGeneralFlags")
    protected String inLoanGeneralFlags;
    @XmlElement(name = "InLoanInterDaysInst")
    protected String inLoanInterDaysInst;
    @XmlElement(name = "InLoanLoanType")
    protected String inLoanLoanType;
    @XmlElement(name = "InLoanMaxInstallCnt")
    protected short inLoanMaxInstallCnt;
    @XmlElement(name = "InLoanMaxInstallFrq")
    protected short inLoanMaxInstallFrq;
    @XmlElement(name = "InLoanMinInstallCnt")
    protected short inLoanMinInstallCnt;
    @XmlElement(name = "InLoanMinInstallFrq")
    protected short inLoanMinInstallFrq;
    @XmlElement(name = "InLoanAccountAccCd")
    protected short inLoanAccountAccCd;
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
    @XmlElement(name = "InLoanAccountAccSn")
    protected int inLoanAccountAccSn;
    @XmlElement(name = "InLoanAccountAccSpcAgrFlg")
    protected String inLoanAccountAccSpcAgrFlg;
    @XmlElement(name = "InLoanAccountAccStatus")
    protected String inLoanAccountAccStatus;
    @XmlElement(name = "InLoanAccountAccTerms")
    protected String inLoanAccountAccTerms;
    @XmlElement(name = "InLoanAccountAccType")
    protected short inLoanAccountAccType;
    @XmlElement(name = "InLoanAccountAtmCardFlag")
    protected String inLoanAccountAtmCardFlag;
    @XmlElement(name = "InLoanAccountCurFxIntExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountCurFxIntExpDt;
    @XmlElement(name = "InLoanAccountCurFxIntInd")
    protected String inLoanAccountCurFxIntInd;
    @XmlElement(name = "InLoanAccountCurFxIntScalDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountCurFxIntScalDt;
    @XmlElement(name = "InLoanAccountCurFxIntStDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountCurFxIntStDt;
    @XmlElement(name = "InLoanAccountCusStmLstTrnDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountCusStmLstTrnDt;
    @XmlElement(name = "InLoanAccountCusStmNxtTrnDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountCusStmNxtTrnDt;
    @XmlElement(name = "InLoanAccountCustId")
    protected int inLoanAccountCustId;
    @XmlElement(name = "InLoanAccountDepAccCd")
    protected short inLoanAccountDepAccCd;
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
    @XmlElement(name = "InLoanAccountExcmptPnlPrdCnt")
    protected short inLoanAccountExcmptPnlPrdCnt;
    @XmlElement(name = "InLoanAccountExcmptPnlPrdNo")
    protected short inLoanAccountExcmptPnlPrdNo;
    @XmlElement(name = "InLoanAccountFixedIntRenewDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountFixedIntRenewDt;
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
    @XmlElement(name = "InLoanAccountLoanStatus")
    protected String inLoanAccountLoanStatus;
    @XmlElement(name = "InLoanAccountLstAccrCalcDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountLstAccrCalcDt;
    @XmlElement(name = "InLoanAccountLstAprIntDbAmn", required = true)
    protected BigDecimal inLoanAccountLstAprIntDbAmn;
    @XmlElement(name = "InLoanAccountLstAprYear")
    protected short inLoanAccountLstAprYear;
    @XmlElement(name = "InLoanAccountLstAugIntDbAmn", required = true)
    protected BigDecimal inLoanAccountLstAugIntDbAmn;
    @XmlElement(name = "InLoanAccountLstAugYear")
    protected short inLoanAccountLstAugYear;
    @XmlElement(name = "InLoanAccountLstDecIntDbAmn", required = true)
    protected BigDecimal inLoanAccountLstDecIntDbAmn;
    @XmlElement(name = "InLoanAccountLstDecYear")
    protected short inLoanAccountLstDecYear;
    @XmlElement(name = "InLoanAccountLstFebIntDbAmn", required = true)
    protected BigDecimal inLoanAccountLstFebIntDbAmn;
    @XmlElement(name = "InLoanAccountLstFebYear")
    protected short inLoanAccountLstFebYear;
    @XmlElement(name = "InLoanAccountLstIntCalcDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountLstIntCalcDt;
    @XmlElement(name = "InLoanAccountLstJanIntDbAmn", required = true)
    protected BigDecimal inLoanAccountLstJanIntDbAmn;
    @XmlElement(name = "InLoanAccountLstJanYear")
    protected short inLoanAccountLstJanYear;
    @XmlElement(name = "InLoanAccountLstJulIntDbAmn", required = true)
    protected BigDecimal inLoanAccountLstJulIntDbAmn;
    @XmlElement(name = "InLoanAccountLstJulYear")
    protected short inLoanAccountLstJulYear;
    @XmlElement(name = "InLoanAccountLstJunIntDbAmn", required = true)
    protected BigDecimal inLoanAccountLstJunIntDbAmn;
    @XmlElement(name = "InLoanAccountLstJunYear")
    protected short inLoanAccountLstJunYear;
    @XmlElement(name = "InLoanAccountLstMarIntDbAmn", required = true)
    protected BigDecimal inLoanAccountLstMarIntDbAmn;
    @XmlElement(name = "InLoanAccountLstMarYear")
    protected short inLoanAccountLstMarYear;
    @XmlElement(name = "InLoanAccountLstMayIntDbAmn", required = true)
    protected BigDecimal inLoanAccountLstMayIntDbAmn;
    @XmlElement(name = "InLoanAccountLstMayYear")
    protected short inLoanAccountLstMayYear;
    @XmlElement(name = "InLoanAccountLstNovIntDbAmn", required = true)
    protected BigDecimal inLoanAccountLstNovIntDbAmn;
    @XmlElement(name = "InLoanAccountLstNovYear")
    protected short inLoanAccountLstNovYear;
    @XmlElement(name = "InLoanAccountLstOctIntDbAmn", required = true)
    protected BigDecimal inLoanAccountLstOctIntDbAmn;
    @XmlElement(name = "InLoanAccountLstOctYear")
    protected short inLoanAccountLstOctYear;
    @XmlElement(name = "InLoanAccountLstSepIntDbAmn", required = true)
    protected BigDecimal inLoanAccountLstSepIntDbAmn;
    @XmlElement(name = "InLoanAccountLstSepYear")
    protected short inLoanAccountLstSepYear;
    @XmlElement(name = "InLoanAccountLstTrxDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountLstTrxDt;
    @XmlElement(name = "InLoanAccountLumpDrawdownFlg")
    protected String inLoanAccountLumpDrawdownFlg;
    @XmlElement(name = "InLoanAccountMainBenefCategor")
    protected int inLoanAccountMainBenefCategor;
    @XmlElement(name = "InLoanAccountMoratorN128Rate", required = true)
    protected BigDecimal inLoanAccountMoratorN128Rate;
    @XmlElement(name = "InLoanAccountMoratorNrmRate", required = true)
    protected BigDecimal inLoanAccountMoratorNrmRate;
    @XmlElement(name = "InLoanAccountMoratorSprRate", required = true)
    protected BigDecimal inLoanAccountMoratorSprRate;
    @XmlElement(name = "InLoanAccountMoratorSubsRate", required = true)
    protected BigDecimal inLoanAccountMoratorSubsRate;
    @XmlElement(name = "InLoanAccountMpStartCapAmn", required = true)
    protected BigDecimal inLoanAccountMpStartCapAmn;
    @XmlElement(name = "InLoanAccountNrAcrPubIntAmn", required = true)
    protected BigDecimal inLoanAccountNrAcrPubIntAmn;
    @XmlElement(name = "InLoanAccountNrmAcrIntBal", required = true)
    protected BigDecimal inLoanAccountNrmAcrIntBal;
    @XmlElement(name = "InLoanAccountNrmCapBal", required = true)
    protected BigDecimal inLoanAccountNrmCapBal;
    @XmlElement(name = "InLoanAccountNrmChrgCnt")
    protected short inLoanAccountNrmChrgCnt;
    @XmlElement(name = "InLoanAccountNrmComBal", required = true)
    protected BigDecimal inLoanAccountNrmComBal;
    @XmlElement(name = "InLoanAccountNrmExpBal", required = true)
    protected BigDecimal inLoanAccountNrmExpBal;
    @XmlElement(name = "InLoanAccountNrmInstCnt")
    protected short inLoanAccountNrmInstCnt;
    @XmlElement(name = "InLoanAccountNrmIntCnt")
    protected short inLoanAccountNrmIntCnt;
    @XmlElement(name = "InLoanAccountNrmLoanCnt")
    protected short inLoanAccountNrmLoanCnt;
    @XmlElement(name = "InLoanAccountNrmRlIntBal", required = true)
    protected BigDecimal inLoanAccountNrmRlIntBal;
    @XmlElement(name = "InLoanAccountNrmSubsidyBal", required = true)
    protected BigDecimal inLoanAccountNrmSubsidyBal;
    @XmlElement(name = "InLoanAccountNrmUrlIntBal", required = true)
    protected BigDecimal inLoanAccountNrmUrlIntBal;
    @XmlElement(name = "InLoanAccountNrUrlPubIntAmn", required = true)
    protected BigDecimal inLoanAccountNrUrlPubIntAmn;
    @XmlElement(name = "InLoanAccountOldAccountCd")
    protected short inLoanAccountOldAccountCd;
    @XmlElement(name = "InLoanAccountOldAccountNum")
    protected String inLoanAccountOldAccountNum;
    @XmlElement(name = "InLoanAccountOvAcrNrmIntBal", required = true)
    protected BigDecimal inLoanAccountOvAcrNrmIntBal;
    @XmlElement(name = "InLoanAccountOvAcrPnlIntBal", required = true)
    protected BigDecimal inLoanAccountOvAcrPnlIntBal;
    @XmlElement(name = "InLoanAccountOvAcrPubIntAmn", required = true)
    protected BigDecimal inLoanAccountOvAcrPubIntAmn;
    @XmlElement(name = "InLoanAccountOvCapBal", required = true)
    protected BigDecimal inLoanAccountOvCapBal;
    @XmlElement(name = "InLoanAccountOvChrgCnt")
    protected short inLoanAccountOvChrgCnt;
    @XmlElement(name = "InLoanAccountOvComBal", required = true)
    protected BigDecimal inLoanAccountOvComBal;
    @XmlElement(name = "InLoanAccountOvExpBal", required = true)
    protected BigDecimal inLoanAccountOvExpBal;
    @XmlElement(name = "InLoanAccountOvExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountOvExpDt;
    @XmlElement(name = "InLoanAccountOvExpExtFlg")
    protected String inLoanAccountOvExpExtFlg;
    @XmlElement(name = "InLoanAccountOvInstCnt")
    protected short inLoanAccountOvInstCnt;
    @XmlElement(name = "InLoanAccountOvIntCnt")
    protected short inLoanAccountOvIntCnt;
    @XmlElement(name = "InLoanAccountOvLoanCnt")
    protected short inLoanAccountOvLoanCnt;
    @XmlElement(name = "InLoanAccountOvRlNrmIntBal", required = true)
    protected BigDecimal inLoanAccountOvRlNrmIntBal;
    @XmlElement(name = "InLoanAccountOvRlPnlIntBal", required = true)
    protected BigDecimal inLoanAccountOvRlPnlIntBal;
    @XmlElement(name = "InLoanAccountOvSubsidyBal", required = true)
    protected BigDecimal inLoanAccountOvSubsidyBal;
    @XmlElement(name = "InLoanAccountOvUrlNrmIntBal", required = true)
    protected BigDecimal inLoanAccountOvUrlNrmIntBal;
    @XmlElement(name = "InLoanAccountOvUrlPnlIntBal", required = true)
    protected BigDecimal inLoanAccountOvUrlPnlIntBal;
    @XmlElement(name = "InLoanAccountOvUrlPubIntAmn", required = true)
    protected BigDecimal inLoanAccountOvUrlPubIntAmn;
    @XmlElement(name = "InLoanAccountPrvFxIntExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountPrvFxIntExpDt;
    @XmlElement(name = "InLoanAccountPrvFxIntScalDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountPrvFxIntScalDt;
    @XmlElement(name = "InLoanAccountPrvFxIntStDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountPrvFxIntStDt;
    @XmlElement(name = "InLoanAccountRecyclingFrequency")
    protected short inLoanAccountRecyclingFrequency;
    @XmlElement(name = "InLoanAccountRecyclingFrq")
    protected short inLoanAccountRecyclingFrq;
    @XmlElement(name = "InLoanAccountRecyclingLmtFlg")
    protected String inLoanAccountRecyclingLmtFlg;
    @XmlElement(name = "InLoanAccountReqExpSn")
    protected short inLoanAccountReqExpSn;
    @XmlElement(name = "InLoanAccountReqInstallSn")
    protected short inLoanAccountReqInstallSn;
    @XmlElement(name = "InLoanAccountReqIntSn")
    protected short inLoanAccountReqIntSn;
    @XmlElement(name = "InLoanAccountReqLoanSn")
    protected short inLoanAccountReqLoanSn;
    @XmlElement(name = "InLoanAccountShortName")
    protected String inLoanAccountShortName;
    @XmlElement(name = "InLoanAccountSpreadEndDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountSpreadEndDt;
    @XmlElement(name = "InLoanAccountSpreadFlg")
    protected String inLoanAccountSpreadFlg;
    @XmlElement(name = "InLoanAccountStatementFreq")
    protected String inLoanAccountStatementFreq;
    @XmlElement(name = "InLoanAccountSubsidyDuration")
    protected short inLoanAccountSubsidyDuration;
    @XmlElement(name = "InLoanAccountSubsidyEndFlg")
    protected String inLoanAccountSubsidyEndFlg;
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
    @XmlElement(name = "InLoanAccountToleranceDays")
    protected short inLoanAccountToleranceDays;
    @XmlElement(name = "InLoanAccountTotCapAmn", required = true)
    protected BigDecimal inLoanAccountTotCapAmn;
    @XmlElement(name = "InLoanAccountTotComInCcAmn", required = true)
    protected BigDecimal inLoanAccountTotComInCcAmn;
    @XmlElement(name = "InLoanAccountTotCommissionAmn", required = true)
    protected BigDecimal inLoanAccountTotCommissionAmn;
    @XmlElement(name = "InLoanAccountTotConfirmAmn", required = true)
    protected BigDecimal inLoanAccountTotConfirmAmn;
    @XmlElement(name = "InLoanAccountTotDrawdownAmn", required = true)
    protected BigDecimal inLoanAccountTotDrawdownAmn;
    @XmlElement(name = "InLoanAccountTotExpenseAmn", required = true)
    protected BigDecimal inLoanAccountTotExpenseAmn;
    @XmlElement(name = "InLoanAccountTotExpInCcAmn", required = true)
    protected BigDecimal inLoanAccountTotExpInCcAmn;
    @XmlElement(name = "InLoanAccountTotIntSprdAmn", required = true)
    protected BigDecimal inLoanAccountTotIntSprdAmn;
    @XmlElement(name = "InLoanAccountTotNrmIntAmn", required = true)
    protected BigDecimal inLoanAccountTotNrmIntAmn;
    @XmlElement(name = "InLoanAccountTotPnlIntAmn", required = true)
    protected BigDecimal inLoanAccountTotPnlIntAmn;
    @XmlElement(name = "InLoanAccountTotPubCommAmn", required = true)
    protected BigDecimal inLoanAccountTotPubCommAmn;
    @XmlElement(name = "InLoanAccountTotSubsIntAmn", required = true)
    protected BigDecimal inLoanAccountTotSubsIntAmn;
    @XmlElement(name = "InLoanAccountTotThrdprtAmn", required = true)
    protected BigDecimal inLoanAccountTotThrdprtAmn;
    @XmlElement(name = "InLoanAccountUnit")
    protected int inLoanAccountUnit;
    @XmlElement(name = "InLoanAccountUnpaidCollCnt")
    protected short inLoanAccountUnpaidCollCnt;
    @XmlElement(name = "InLoanAccountUnrealizedFlg")
    protected String inLoanAccountUnrealizedFlg;
    @XmlElement(name = "InLoanAccountUsr")
    protected String inLoanAccountUsr;
    @XmlElement(name = "InLoanAccountVillageSn")
    protected int inLoanAccountVillageSn;
    @XmlElement(name = "InLoanAccountInfoMoratIntPayFlg")
    protected String inLoanAccountInfoMoratIntPayFlg;
    @XmlElement(name = "InLoanAccountInfoMoratoriumIntFrq")
    protected short inLoanAccountInfoMoratoriumIntFrq;
    @XmlElement(name = "InLoanLoanRequestRqCapitalBal", required = true)
    protected BigDecimal inLoanLoanRequestRqCapitalBal;
    @XmlElement(name = "InLoanWorkFlgsEqInterestFlg")
    protected String inLoanWorkFlgsEqInterestFlg;
    @XmlElement(name = "InLoanWorkFlgsInsuranceChargesFlg")
    protected String inLoanWorkFlgsInsuranceChargesFlg;
    @XmlElement(name = "InLoanWorkFlgsIntCalcOnInstalmentFlg")
    protected String inLoanWorkFlgsIntCalcOnInstalmentFlg;
    @XmlElement(name = "InLoanWorkFlgsPositiveBalFlg")
    protected String inLoanWorkFlgsPositiveBalFlg;
    @XmlElement(name = "InLoanWorkFlgsVariableInstalmentFlg")
    protected String inLoanWorkFlgsVariableInstalmentFlg;
    @XmlElement(name = "InMaintainEqInstLoanAccountInfoMaintainEqInst")
    protected String inMaintainEqInstLoanAccountInfoMaintainEqInst;
    @XmlElement(name = "InNewOpenDateLoanAccountAccOpenDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inNewOpenDateLoanAccountAccOpenDt;
    @XmlElement(name = "InPosostoInsurProdCodePercentage", required = true)
    protected BigDecimal inPosostoInsurProdCodePercentage;
    @XmlElement(name = "InPosostoInsurProdCodeProdId")
    protected int inPosostoInsurProdCodeProdId;
    @XmlElement(name = "InProdProductIdProduct")
    protected int inProdProductIdProduct;
    @XmlElement(name = "InShowLoanIntCapitalFlg")
    protected String inShowLoanIntCapitalFlg;
    @XmlElement(name = "InTerminalTerminalNumber")
    protected String inTerminalTerminalNumber;
    @XmlElement(name = "InInstall13thPayIefSuppliedChar1")
    protected String inInstall13ThPayIefSuppliedChar1;
    @XmlElement(name = "InInstallDoubleIefSuppliedChar1")
    protected String inInstallDoubleIefSuppliedChar1;
    @XmlElement(name = "InInstallNormalIefSuppliedChar1")
    protected String inInstallNormalIefSuppliedChar1;
    @XmlElement(name = "InInstallOmitIefSuppliedChar1")
    protected String inInstallOmitIefSuppliedChar1;
    @XmlElement(name = "InGpLoanIntCapitalFlg")
    protected String inGpLoanIntCapitalFlg;
    @XmlElement(name = "InGpLoanIntPayableFlg")
    protected String inGpLoanIntPayableFlg;
    @XmlElement(name = "InGpLoanLoanType")
    protected String inGpLoanLoanType;
    @XmlElement(name = "InGpLoanMoratIntPayFlg")
    protected String inGpLoanMoratIntPayFlg;
    @XmlElement(name = "InGpLoanNoIntMoratorFlg")
    protected String inGpLoanNoIntMoratorFlg;
    @XmlElement(name = "InGpLoanNonIntCapitFlg")
    protected String inGpLoanNonIntCapitFlg;
    @XmlElement(name = "InSubsidyPercentageIefSuppliedPercentage", required = true)
    protected BigDecimal inSubsidyPercentageIefSuppliedPercentage;
    @XmlElement(name = "InTotalLoanIefSuppliedTotalInteger")
    protected double inTotalLoanIefSuppliedTotalInteger;
    @XmlElement(name = "InExpensesLnsSuppliedAmount", required = true)
    protected BigDecimal inExpensesLnsSuppliedAmount;
    @XmlElement(name = "InCoinsuredGrp")
    protected ArrayOfL0436VInCoinsuredGrpItem inCoinsuredGrp;
    @XmlElement(name = "InMrtAmortizeFlgIefSuppliedFlag")
    protected String inMrtAmortizeFlgIefSuppliedFlag;

    /**
     * Gets the value of the inAccMovementCurrencyDisplayedDecimalPlaces property.
     * 
     */
    public short getInAccMovementCurrencyDisplayedDecimalPlaces() {
        return inAccMovementCurrencyDisplayedDecimalPlaces;
    }

    /**
     * Sets the value of the inAccMovementCurrencyDisplayedDecimalPlaces property.
     * 
     */
    public void setInAccMovementCurrencyDisplayedDecimalPlaces(short value) {
        this.inAccMovementCurrencyDisplayedDecimalPlaces = value;
    }

    /**
     * Gets the value of the inAccMovementCurrencyIdCurrency property.
     * 
     */
    public int getInAccMovementCurrencyIdCurrency() {
        return inAccMovementCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inAccMovementCurrencyIdCurrency property.
     * 
     */
    public void setInAccMovementCurrencyIdCurrency(int value) {
        this.inAccMovementCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inAccMovementCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAccMovementCurrencyShortDescr() {
        return inAccMovementCurrencyShortDescr;
    }

    /**
     * Sets the value of the inAccMovementCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAccMovementCurrencyShortDescr(String value) {
        this.inAccMovementCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inCurValIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCurValIefSuppliedFlag() {
        return inCurValIefSuppliedFlag;
    }

    /**
     * Sets the value of the inCurValIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCurValIefSuppliedFlag(String value) {
        this.inCurValIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inDaysbaseLnsInterestDaysbase property.
     * 
     */
    public short getInDaysbaseLnsInterestDaysbase() {
        return inDaysbaseLnsInterestDaysbase;
    }

    /**
     * Sets the value of the inDaysbaseLnsInterestDaysbase property.
     * 
     */
    public void setInDaysbaseLnsInterestDaysbase(short value) {
        this.inDaysbaseLnsInterestDaysbase = value;
    }

    /**
     * Gets the value of the inDiffIntAlgLoanAccountInfoDiffIntAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDiffIntAlgLoanAccountInfoDiffIntAlgorithm() {
        return inDiffIntAlgLoanAccountInfoDiffIntAlgorithm;
    }

    /**
     * Sets the value of the inDiffIntAlgLoanAccountInfoDiffIntAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDiffIntAlgLoanAccountInfoDiffIntAlgorithm(String value) {
        this.inDiffIntAlgLoanAccountInfoDiffIntAlgorithm = value;
    }

    /**
     * Gets the value of the inEnoikiagoraExpensesIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInEnoikiagoraExpensesIefSuppliedNumber152() {
        return inEnoikiagoraExpensesIefSuppliedNumber152;
    }

    /**
     * Sets the value of the inEnoikiagoraExpensesIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInEnoikiagoraExpensesIefSuppliedNumber152(BigDecimal value) {
        this.inEnoikiagoraExpensesIefSuppliedNumber152 = value;
    }

    /**
     * Gets the value of the inEnoikiagoraLnsSuppliedEnoikiagora0No1Yes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEnoikiagoraLnsSuppliedEnoikiagora0No1Yes() {
        return inEnoikiagoraLnsSuppliedEnoikiagora0No1Yes;
    }

    /**
     * Sets the value of the inEnoikiagoraLnsSuppliedEnoikiagora0No1Yes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEnoikiagoraLnsSuppliedEnoikiagora0No1Yes(String value) {
        this.inEnoikiagoraLnsSuppliedEnoikiagora0No1Yes = value;
    }

    /**
     * Gets the value of the inFirstLoanIefSuppliedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInFirstLoanIefSuppliedDate() {
        return inFirstLoanIefSuppliedDate;
    }

    /**
     * Sets the value of the inFirstLoanIefSuppliedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInFirstLoanIefSuppliedDate(XMLGregorianCalendar value) {
        this.inFirstLoanIefSuppliedDate = value;
    }

    /**
     * Gets the value of the inFixedDateLoanAccountCurFxIntExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInFixedDateLoanAccountCurFxIntExpDt() {
        return inFixedDateLoanAccountCurFxIntExpDt;
    }

    /**
     * Sets the value of the inFixedDateLoanAccountCurFxIntExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInFixedDateLoanAccountCurFxIntExpDt(XMLGregorianCalendar value) {
        this.inFixedDateLoanAccountCurFxIntExpDt = value;
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
     * Gets the value of the inFixInstallLoanInstallmentInfoInstallmentAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInFixInstallLoanInstallmentInfoInstallmentAmn() {
        return inFixInstallLoanInstallmentInfoInstallmentAmn;
    }

    /**
     * Sets the value of the inFixInstallLoanInstallmentInfoInstallmentAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInFixInstallLoanInstallmentInfoInstallmentAmn(BigDecimal value) {
        this.inFixInstallLoanInstallmentInfoInstallmentAmn = value;
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
     * Gets the value of the inFloatingLoanInstallmentInfoInstallDbIntPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInFloatingLoanInstallmentInfoInstallDbIntPerc() {
        return inFloatingLoanInstallmentInfoInstallDbIntPerc;
    }

    /**
     * Sets the value of the inFloatingLoanInstallmentInfoInstallDbIntPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInFloatingLoanInstallmentInfoInstallDbIntPerc(BigDecimal value) {
        this.inFloatingLoanInstallmentInfoInstallDbIntPerc = value;
    }

    /**
     * Gets the value of the inGrpCapitalLr property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInGrpCapitalLr }
     *     
     */
    public ArrayOfInGrpCapitalLr getInGrpCapitalLr() {
        return inGrpCapitalLr;
    }

    /**
     * Sets the value of the inGrpCapitalLr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInGrpCapitalLr }
     *     
     */
    public void setInGrpCapitalLr(ArrayOfInGrpCapitalLr value) {
        this.inGrpCapitalLr = value;
    }

    /**
     * Gets the value of the inGrpFlexOmitInstl property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInGrpFlexOmitInstl }
     *     
     */
    public ArrayOfInGrpFlexOmitInstl getInGrpFlexOmitInstl() {
        return inGrpFlexOmitInstl;
    }

    /**
     * Sets the value of the inGrpFlexOmitInstl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInGrpFlexOmitInstl }
     *     
     */
    public void setInGrpFlexOmitInstl(ArrayOfInGrpFlexOmitInstl value) {
        this.inGrpFlexOmitInstl = value;
    }

    /**
     * Gets the value of the inGrpDbSelectedInsProds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInGrpDbSelectedInsProdsItem }
     *     
     */
    public ArrayOfInGrpDbSelectedInsProdsItem getInGrpDbSelectedInsProds() {
        return inGrpDbSelectedInsProds;
    }

    /**
     * Sets the value of the inGrpDbSelectedInsProds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInGrpDbSelectedInsProdsItem }
     *     
     */
    public void setInGrpDbSelectedInsProds(ArrayOfInGrpDbSelectedInsProdsItem value) {
        this.inGrpDbSelectedInsProds = value;
    }

    /**
     * Gets the value of the inInstallFlexIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInstallFlexIefSuppliedChar1() {
        return inInstallFlexIefSuppliedChar1;
    }

    /**
     * Sets the value of the inInstallFlexIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInstallFlexIefSuppliedChar1(String value) {
        this.inInstallFlexIefSuppliedChar1 = value;
    }

    /**
     * Gets the value of the inInstallFlexStabOmitIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInstallFlexStabOmitIefSuppliedChar1() {
        return inInstallFlexStabOmitIefSuppliedChar1;
    }

    /**
     * Sets the value of the inInstallFlexStabOmitIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInstallFlexStabOmitIefSuppliedChar1(String value) {
        this.inInstallFlexStabOmitIefSuppliedChar1 = value;
    }

    /**
     * Gets the value of the inInstallFlexVarOmitIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInstallFlexVarOmitIefSuppliedChar1() {
        return inInstallFlexVarOmitIefSuppliedChar1;
    }

    /**
     * Sets the value of the inInstallFlexVarOmitIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInstallFlexVarOmitIefSuppliedChar1(String value) {
        this.inInstallFlexVarOmitIefSuppliedChar1 = value;
    }

    /**
     * Gets the value of the inInstallInfoLoanInstallmentInfoInstallCollectionCnt property.
     * 
     */
    public short getInInstallInfoLoanInstallmentInfoInstallCollectionCnt() {
        return inInstallInfoLoanInstallmentInfoInstallCollectionCnt;
    }

    /**
     * Sets the value of the inInstallInfoLoanInstallmentInfoInstallCollectionCnt property.
     * 
     */
    public void setInInstallInfoLoanInstallmentInfoInstallCollectionCnt(short value) {
        this.inInstallInfoLoanInstallmentInfoInstallCollectionCnt = value;
    }

    /**
     * Gets the value of the inInstallInfoLoanInstallmentInfoInstallDaysbase property.
     * 
     */
    public short getInInstallInfoLoanInstallmentInfoInstallDaysbase() {
        return inInstallInfoLoanInstallmentInfoInstallDaysbase;
    }

    /**
     * Sets the value of the inInstallInfoLoanInstallmentInfoInstallDaysbase property.
     * 
     */
    public void setInInstallInfoLoanInstallmentInfoInstallDaysbase(short value) {
        this.inInstallInfoLoanInstallmentInfoInstallDaysbase = value;
    }

    /**
     * Gets the value of the inInstallInfoLoanInstallmentInfoInstallDbIntPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInInstallInfoLoanInstallmentInfoInstallDbIntPerc() {
        return inInstallInfoLoanInstallmentInfoInstallDbIntPerc;
    }

    /**
     * Sets the value of the inInstallInfoLoanInstallmentInfoInstallDbIntPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInInstallInfoLoanInstallmentInfoInstallDbIntPerc(BigDecimal value) {
        this.inInstallInfoLoanInstallmentInfoInstallDbIntPerc = value;
    }

    /**
     * Gets the value of the inInstallInfoLoanInstallmentInfoInstallEftePerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInInstallInfoLoanInstallmentInfoInstallEftePerc() {
        return inInstallInfoLoanInstallmentInfoInstallEftePerc;
    }

    /**
     * Sets the value of the inInstallInfoLoanInstallmentInfoInstallEftePerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInInstallInfoLoanInstallmentInfoInstallEftePerc(BigDecimal value) {
        this.inInstallInfoLoanInstallmentInfoInstallEftePerc = value;
    }

    /**
     * Gets the value of the inInstallInfoLoanInstallmentInfoInstallFrequency property.
     * 
     */
    public short getInInstallInfoLoanInstallmentInfoInstallFrequency() {
        return inInstallInfoLoanInstallmentInfoInstallFrequency;
    }

    /**
     * Sets the value of the inInstallInfoLoanInstallmentInfoInstallFrequency property.
     * 
     */
    public void setInInstallInfoLoanInstallmentInfoInstallFrequency(short value) {
        this.inInstallInfoLoanInstallmentInfoInstallFrequency = value;
    }

    /**
     * Gets the value of the inInstallInfoLoanInstallmentInfoInstallN128Perc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInInstallInfoLoanInstallmentInfoInstallN128Perc() {
        return inInstallInfoLoanInstallmentInfoInstallN128Perc;
    }

    /**
     * Sets the value of the inInstallInfoLoanInstallmentInfoInstallN128Perc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInInstallInfoLoanInstallmentInfoInstallN128Perc(BigDecimal value) {
        this.inInstallInfoLoanInstallmentInfoInstallN128Perc = value;
    }

    /**
     * Gets the value of the inInstallInfoLoanInstallmentInfoInstallPeriodInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInstallInfoLoanInstallmentInfoInstallPeriodInd() {
        return inInstallInfoLoanInstallmentInfoInstallPeriodInd;
    }

    /**
     * Sets the value of the inInstallInfoLoanInstallmentInfoInstallPeriodInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInstallInfoLoanInstallmentInfoInstallPeriodInd(String value) {
        this.inInstallInfoLoanInstallmentInfoInstallPeriodInd = value;
    }

    /**
     * Gets the value of the inInstallInfoLoanInstallmentInfoInstallSpreadPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInInstallInfoLoanInstallmentInfoInstallSpreadPerc() {
        return inInstallInfoLoanInstallmentInfoInstallSpreadPerc;
    }

    /**
     * Sets the value of the inInstallInfoLoanInstallmentInfoInstallSpreadPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInInstallInfoLoanInstallmentInfoInstallSpreadPerc(BigDecimal value) {
        this.inInstallInfoLoanInstallmentInfoInstallSpreadPerc = value;
    }

    /**
     * Gets the value of the inInstallInfoLoanInstallmentInfoInstallSubs2Perc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInInstallInfoLoanInstallmentInfoInstallSubs2Perc() {
        return inInstallInfoLoanInstallmentInfoInstallSubs2Perc;
    }

    /**
     * Sets the value of the inInstallInfoLoanInstallmentInfoInstallSubs2Perc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInInstallInfoLoanInstallmentInfoInstallSubs2Perc(BigDecimal value) {
        this.inInstallInfoLoanInstallmentInfoInstallSubs2Perc = value;
    }

    /**
     * Gets the value of the inInstallInfoLoanInstallmentInfoInstallSubsPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInInstallInfoLoanInstallmentInfoInstallSubsPerc() {
        return inInstallInfoLoanInstallmentInfoInstallSubsPerc;
    }

    /**
     * Sets the value of the inInstallInfoLoanInstallmentInfoInstallSubsPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInInstallInfoLoanInstallmentInfoInstallSubsPerc(BigDecimal value) {
        this.inInstallInfoLoanInstallmentInfoInstallSubsPerc = value;
    }

    /**
     * Gets the value of the inInstallInfoLoanInstallmentInfoMoratoriumEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInInstallInfoLoanInstallmentInfoMoratoriumEndDt() {
        return inInstallInfoLoanInstallmentInfoMoratoriumEndDt;
    }

    /**
     * Sets the value of the inInstallInfoLoanInstallmentInfoMoratoriumEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInInstallInfoLoanInstallmentInfoMoratoriumEndDt(XMLGregorianCalendar value) {
        this.inInstallInfoLoanInstallmentInfoMoratoriumEndDt = value;
    }

    /**
     * Gets the value of the inInstallInfoLoanInstallmentInfoStartingCapitalAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInInstallInfoLoanInstallmentInfoStartingCapitalAmn() {
        return inInstallInfoLoanInstallmentInfoStartingCapitalAmn;
    }

    /**
     * Sets the value of the inInstallInfoLoanInstallmentInfoStartingCapitalAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInInstallInfoLoanInstallmentInfoStartingCapitalAmn(BigDecimal value) {
        this.inInstallInfoLoanInstallmentInfoStartingCapitalAmn = value;
    }

    /**
     * Gets the value of the inLnsInterestIntDuration property.
     * 
     */
    public short getInLnsInterestIntDuration() {
        return inLnsInterestIntDuration;
    }

    /**
     * Sets the value of the inLnsInterestIntDuration property.
     * 
     */
    public void setInLnsInterestIntDuration(short value) {
        this.inLnsInterestIntDuration = value;
    }

    /**
     * Gets the value of the inLnsSuppliedProduct360365 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLnsSuppliedProduct360365() {
        return inLnsSuppliedProduct360365;
    }

    /**
     * Sets the value of the inLnsSuppliedProduct360365 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLnsSuppliedProduct360365(String value) {
        this.inLnsSuppliedProduct360365 = value;
    }

    /**
     * Gets the value of the inLoanGeneralFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanGeneralFlags() {
        return inLoanGeneralFlags;
    }

    /**
     * Sets the value of the inLoanGeneralFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanGeneralFlags(String value) {
        this.inLoanGeneralFlags = value;
    }

    /**
     * Gets the value of the inLoanInterDaysInst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanInterDaysInst() {
        return inLoanInterDaysInst;
    }

    /**
     * Sets the value of the inLoanInterDaysInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanInterDaysInst(String value) {
        this.inLoanInterDaysInst = value;
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
     * Gets the value of the inLoanMaxInstallCnt property.
     * 
     */
    public short getInLoanMaxInstallCnt() {
        return inLoanMaxInstallCnt;
    }

    /**
     * Sets the value of the inLoanMaxInstallCnt property.
     * 
     */
    public void setInLoanMaxInstallCnt(short value) {
        this.inLoanMaxInstallCnt = value;
    }

    /**
     * Gets the value of the inLoanMaxInstallFrq property.
     * 
     */
    public short getInLoanMaxInstallFrq() {
        return inLoanMaxInstallFrq;
    }

    /**
     * Sets the value of the inLoanMaxInstallFrq property.
     * 
     */
    public void setInLoanMaxInstallFrq(short value) {
        this.inLoanMaxInstallFrq = value;
    }

    /**
     * Gets the value of the inLoanMinInstallCnt property.
     * 
     */
    public short getInLoanMinInstallCnt() {
        return inLoanMinInstallCnt;
    }

    /**
     * Sets the value of the inLoanMinInstallCnt property.
     * 
     */
    public void setInLoanMinInstallCnt(short value) {
        this.inLoanMinInstallCnt = value;
    }

    /**
     * Gets the value of the inLoanMinInstallFrq property.
     * 
     */
    public short getInLoanMinInstallFrq() {
        return inLoanMinInstallFrq;
    }

    /**
     * Sets the value of the inLoanMinInstallFrq property.
     * 
     */
    public void setInLoanMinInstallFrq(short value) {
        this.inLoanMinInstallFrq = value;
    }

    /**
     * Gets the value of the inLoanAccountAccCd property.
     * 
     */
    public short getInLoanAccountAccCd() {
        return inLoanAccountAccCd;
    }

    /**
     * Sets the value of the inLoanAccountAccCd property.
     * 
     */
    public void setInLoanAccountAccCd(short value) {
        this.inLoanAccountAccCd = value;
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
     * Gets the value of the inLoanAccountAccSn property.
     * 
     */
    public int getInLoanAccountAccSn() {
        return inLoanAccountAccSn;
    }

    /**
     * Sets the value of the inLoanAccountAccSn property.
     * 
     */
    public void setInLoanAccountAccSn(int value) {
        this.inLoanAccountAccSn = value;
    }

    /**
     * Gets the value of the inLoanAccountAccSpcAgrFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountAccSpcAgrFlg() {
        return inLoanAccountAccSpcAgrFlg;
    }

    /**
     * Sets the value of the inLoanAccountAccSpcAgrFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountAccSpcAgrFlg(String value) {
        this.inLoanAccountAccSpcAgrFlg = value;
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
     * Gets the value of the inLoanAccountAccType property.
     * 
     */
    public short getInLoanAccountAccType() {
        return inLoanAccountAccType;
    }

    /**
     * Sets the value of the inLoanAccountAccType property.
     * 
     */
    public void setInLoanAccountAccType(short value) {
        this.inLoanAccountAccType = value;
    }

    /**
     * Gets the value of the inLoanAccountAtmCardFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountAtmCardFlag() {
        return inLoanAccountAtmCardFlag;
    }

    /**
     * Sets the value of the inLoanAccountAtmCardFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountAtmCardFlag(String value) {
        this.inLoanAccountAtmCardFlag = value;
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
     * Gets the value of the inLoanAccountCurFxIntInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountCurFxIntInd() {
        return inLoanAccountCurFxIntInd;
    }

    /**
     * Sets the value of the inLoanAccountCurFxIntInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountCurFxIntInd(String value) {
        this.inLoanAccountCurFxIntInd = value;
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
     * Gets the value of the inLoanAccountCusStmLstTrnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanAccountCusStmLstTrnDt() {
        return inLoanAccountCusStmLstTrnDt;
    }

    /**
     * Sets the value of the inLoanAccountCusStmLstTrnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanAccountCusStmLstTrnDt(XMLGregorianCalendar value) {
        this.inLoanAccountCusStmLstTrnDt = value;
    }

    /**
     * Gets the value of the inLoanAccountCusStmNxtTrnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanAccountCusStmNxtTrnDt() {
        return inLoanAccountCusStmNxtTrnDt;
    }

    /**
     * Sets the value of the inLoanAccountCusStmNxtTrnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanAccountCusStmNxtTrnDt(XMLGregorianCalendar value) {
        this.inLoanAccountCusStmNxtTrnDt = value;
    }

    /**
     * Gets the value of the inLoanAccountCustId property.
     * 
     */
    public int getInLoanAccountCustId() {
        return inLoanAccountCustId;
    }

    /**
     * Sets the value of the inLoanAccountCustId property.
     * 
     */
    public void setInLoanAccountCustId(int value) {
        this.inLoanAccountCustId = value;
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
     * Gets the value of the inLoanAccountExcmptPnlPrdCnt property.
     * 
     */
    public short getInLoanAccountExcmptPnlPrdCnt() {
        return inLoanAccountExcmptPnlPrdCnt;
    }

    /**
     * Sets the value of the inLoanAccountExcmptPnlPrdCnt property.
     * 
     */
    public void setInLoanAccountExcmptPnlPrdCnt(short value) {
        this.inLoanAccountExcmptPnlPrdCnt = value;
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
     * Gets the value of the inLoanAccountFixedIntRenewDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanAccountFixedIntRenewDt() {
        return inLoanAccountFixedIntRenewDt;
    }

    /**
     * Sets the value of the inLoanAccountFixedIntRenewDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanAccountFixedIntRenewDt(XMLGregorianCalendar value) {
        this.inLoanAccountFixedIntRenewDt = value;
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
     * Gets the value of the inLoanAccountLstAprIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountLstAprIntDbAmn() {
        return inLoanAccountLstAprIntDbAmn;
    }

    /**
     * Sets the value of the inLoanAccountLstAprIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountLstAprIntDbAmn(BigDecimal value) {
        this.inLoanAccountLstAprIntDbAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountLstAprYear property.
     * 
     */
    public short getInLoanAccountLstAprYear() {
        return inLoanAccountLstAprYear;
    }

    /**
     * Sets the value of the inLoanAccountLstAprYear property.
     * 
     */
    public void setInLoanAccountLstAprYear(short value) {
        this.inLoanAccountLstAprYear = value;
    }

    /**
     * Gets the value of the inLoanAccountLstAugIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountLstAugIntDbAmn() {
        return inLoanAccountLstAugIntDbAmn;
    }

    /**
     * Sets the value of the inLoanAccountLstAugIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountLstAugIntDbAmn(BigDecimal value) {
        this.inLoanAccountLstAugIntDbAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountLstAugYear property.
     * 
     */
    public short getInLoanAccountLstAugYear() {
        return inLoanAccountLstAugYear;
    }

    /**
     * Sets the value of the inLoanAccountLstAugYear property.
     * 
     */
    public void setInLoanAccountLstAugYear(short value) {
        this.inLoanAccountLstAugYear = value;
    }

    /**
     * Gets the value of the inLoanAccountLstDecIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountLstDecIntDbAmn() {
        return inLoanAccountLstDecIntDbAmn;
    }

    /**
     * Sets the value of the inLoanAccountLstDecIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountLstDecIntDbAmn(BigDecimal value) {
        this.inLoanAccountLstDecIntDbAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountLstDecYear property.
     * 
     */
    public short getInLoanAccountLstDecYear() {
        return inLoanAccountLstDecYear;
    }

    /**
     * Sets the value of the inLoanAccountLstDecYear property.
     * 
     */
    public void setInLoanAccountLstDecYear(short value) {
        this.inLoanAccountLstDecYear = value;
    }

    /**
     * Gets the value of the inLoanAccountLstFebIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountLstFebIntDbAmn() {
        return inLoanAccountLstFebIntDbAmn;
    }

    /**
     * Sets the value of the inLoanAccountLstFebIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountLstFebIntDbAmn(BigDecimal value) {
        this.inLoanAccountLstFebIntDbAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountLstFebYear property.
     * 
     */
    public short getInLoanAccountLstFebYear() {
        return inLoanAccountLstFebYear;
    }

    /**
     * Sets the value of the inLoanAccountLstFebYear property.
     * 
     */
    public void setInLoanAccountLstFebYear(short value) {
        this.inLoanAccountLstFebYear = value;
    }

    /**
     * Gets the value of the inLoanAccountLstIntCalcDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanAccountLstIntCalcDt() {
        return inLoanAccountLstIntCalcDt;
    }

    /**
     * Sets the value of the inLoanAccountLstIntCalcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanAccountLstIntCalcDt(XMLGregorianCalendar value) {
        this.inLoanAccountLstIntCalcDt = value;
    }

    /**
     * Gets the value of the inLoanAccountLstJanIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountLstJanIntDbAmn() {
        return inLoanAccountLstJanIntDbAmn;
    }

    /**
     * Sets the value of the inLoanAccountLstJanIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountLstJanIntDbAmn(BigDecimal value) {
        this.inLoanAccountLstJanIntDbAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountLstJanYear property.
     * 
     */
    public short getInLoanAccountLstJanYear() {
        return inLoanAccountLstJanYear;
    }

    /**
     * Sets the value of the inLoanAccountLstJanYear property.
     * 
     */
    public void setInLoanAccountLstJanYear(short value) {
        this.inLoanAccountLstJanYear = value;
    }

    /**
     * Gets the value of the inLoanAccountLstJulIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountLstJulIntDbAmn() {
        return inLoanAccountLstJulIntDbAmn;
    }

    /**
     * Sets the value of the inLoanAccountLstJulIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountLstJulIntDbAmn(BigDecimal value) {
        this.inLoanAccountLstJulIntDbAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountLstJulYear property.
     * 
     */
    public short getInLoanAccountLstJulYear() {
        return inLoanAccountLstJulYear;
    }

    /**
     * Sets the value of the inLoanAccountLstJulYear property.
     * 
     */
    public void setInLoanAccountLstJulYear(short value) {
        this.inLoanAccountLstJulYear = value;
    }

    /**
     * Gets the value of the inLoanAccountLstJunIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountLstJunIntDbAmn() {
        return inLoanAccountLstJunIntDbAmn;
    }

    /**
     * Sets the value of the inLoanAccountLstJunIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountLstJunIntDbAmn(BigDecimal value) {
        this.inLoanAccountLstJunIntDbAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountLstJunYear property.
     * 
     */
    public short getInLoanAccountLstJunYear() {
        return inLoanAccountLstJunYear;
    }

    /**
     * Sets the value of the inLoanAccountLstJunYear property.
     * 
     */
    public void setInLoanAccountLstJunYear(short value) {
        this.inLoanAccountLstJunYear = value;
    }

    /**
     * Gets the value of the inLoanAccountLstMarIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountLstMarIntDbAmn() {
        return inLoanAccountLstMarIntDbAmn;
    }

    /**
     * Sets the value of the inLoanAccountLstMarIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountLstMarIntDbAmn(BigDecimal value) {
        this.inLoanAccountLstMarIntDbAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountLstMarYear property.
     * 
     */
    public short getInLoanAccountLstMarYear() {
        return inLoanAccountLstMarYear;
    }

    /**
     * Sets the value of the inLoanAccountLstMarYear property.
     * 
     */
    public void setInLoanAccountLstMarYear(short value) {
        this.inLoanAccountLstMarYear = value;
    }

    /**
     * Gets the value of the inLoanAccountLstMayIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountLstMayIntDbAmn() {
        return inLoanAccountLstMayIntDbAmn;
    }

    /**
     * Sets the value of the inLoanAccountLstMayIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountLstMayIntDbAmn(BigDecimal value) {
        this.inLoanAccountLstMayIntDbAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountLstMayYear property.
     * 
     */
    public short getInLoanAccountLstMayYear() {
        return inLoanAccountLstMayYear;
    }

    /**
     * Sets the value of the inLoanAccountLstMayYear property.
     * 
     */
    public void setInLoanAccountLstMayYear(short value) {
        this.inLoanAccountLstMayYear = value;
    }

    /**
     * Gets the value of the inLoanAccountLstNovIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountLstNovIntDbAmn() {
        return inLoanAccountLstNovIntDbAmn;
    }

    /**
     * Sets the value of the inLoanAccountLstNovIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountLstNovIntDbAmn(BigDecimal value) {
        this.inLoanAccountLstNovIntDbAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountLstNovYear property.
     * 
     */
    public short getInLoanAccountLstNovYear() {
        return inLoanAccountLstNovYear;
    }

    /**
     * Sets the value of the inLoanAccountLstNovYear property.
     * 
     */
    public void setInLoanAccountLstNovYear(short value) {
        this.inLoanAccountLstNovYear = value;
    }

    /**
     * Gets the value of the inLoanAccountLstOctIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountLstOctIntDbAmn() {
        return inLoanAccountLstOctIntDbAmn;
    }

    /**
     * Sets the value of the inLoanAccountLstOctIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountLstOctIntDbAmn(BigDecimal value) {
        this.inLoanAccountLstOctIntDbAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountLstOctYear property.
     * 
     */
    public short getInLoanAccountLstOctYear() {
        return inLoanAccountLstOctYear;
    }

    /**
     * Sets the value of the inLoanAccountLstOctYear property.
     * 
     */
    public void setInLoanAccountLstOctYear(short value) {
        this.inLoanAccountLstOctYear = value;
    }

    /**
     * Gets the value of the inLoanAccountLstSepIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountLstSepIntDbAmn() {
        return inLoanAccountLstSepIntDbAmn;
    }

    /**
     * Sets the value of the inLoanAccountLstSepIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountLstSepIntDbAmn(BigDecimal value) {
        this.inLoanAccountLstSepIntDbAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountLstSepYear property.
     * 
     */
    public short getInLoanAccountLstSepYear() {
        return inLoanAccountLstSepYear;
    }

    /**
     * Sets the value of the inLoanAccountLstSepYear property.
     * 
     */
    public void setInLoanAccountLstSepYear(short value) {
        this.inLoanAccountLstSepYear = value;
    }

    /**
     * Gets the value of the inLoanAccountLstTrxDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanAccountLstTrxDt() {
        return inLoanAccountLstTrxDt;
    }

    /**
     * Sets the value of the inLoanAccountLstTrxDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanAccountLstTrxDt(XMLGregorianCalendar value) {
        this.inLoanAccountLstTrxDt = value;
    }

    /**
     * Gets the value of the inLoanAccountLumpDrawdownFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountLumpDrawdownFlg() {
        return inLoanAccountLumpDrawdownFlg;
    }

    /**
     * Sets the value of the inLoanAccountLumpDrawdownFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountLumpDrawdownFlg(String value) {
        this.inLoanAccountLumpDrawdownFlg = value;
    }

    /**
     * Gets the value of the inLoanAccountMainBenefCategor property.
     * 
     */
    public int getInLoanAccountMainBenefCategor() {
        return inLoanAccountMainBenefCategor;
    }

    /**
     * Sets the value of the inLoanAccountMainBenefCategor property.
     * 
     */
    public void setInLoanAccountMainBenefCategor(int value) {
        this.inLoanAccountMainBenefCategor = value;
    }

    /**
     * Gets the value of the inLoanAccountMoratorN128Rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountMoratorN128Rate() {
        return inLoanAccountMoratorN128Rate;
    }

    /**
     * Sets the value of the inLoanAccountMoratorN128Rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountMoratorN128Rate(BigDecimal value) {
        this.inLoanAccountMoratorN128Rate = value;
    }

    /**
     * Gets the value of the inLoanAccountMoratorNrmRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountMoratorNrmRate() {
        return inLoanAccountMoratorNrmRate;
    }

    /**
     * Sets the value of the inLoanAccountMoratorNrmRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountMoratorNrmRate(BigDecimal value) {
        this.inLoanAccountMoratorNrmRate = value;
    }

    /**
     * Gets the value of the inLoanAccountMoratorSprRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountMoratorSprRate() {
        return inLoanAccountMoratorSprRate;
    }

    /**
     * Sets the value of the inLoanAccountMoratorSprRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountMoratorSprRate(BigDecimal value) {
        this.inLoanAccountMoratorSprRate = value;
    }

    /**
     * Gets the value of the inLoanAccountMoratorSubsRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountMoratorSubsRate() {
        return inLoanAccountMoratorSubsRate;
    }

    /**
     * Sets the value of the inLoanAccountMoratorSubsRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountMoratorSubsRate(BigDecimal value) {
        this.inLoanAccountMoratorSubsRate = value;
    }

    /**
     * Gets the value of the inLoanAccountMpStartCapAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountMpStartCapAmn() {
        return inLoanAccountMpStartCapAmn;
    }

    /**
     * Sets the value of the inLoanAccountMpStartCapAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountMpStartCapAmn(BigDecimal value) {
        this.inLoanAccountMpStartCapAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountNrAcrPubIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountNrAcrPubIntAmn() {
        return inLoanAccountNrAcrPubIntAmn;
    }

    /**
     * Sets the value of the inLoanAccountNrAcrPubIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountNrAcrPubIntAmn(BigDecimal value) {
        this.inLoanAccountNrAcrPubIntAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountNrmAcrIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountNrmAcrIntBal() {
        return inLoanAccountNrmAcrIntBal;
    }

    /**
     * Sets the value of the inLoanAccountNrmAcrIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountNrmAcrIntBal(BigDecimal value) {
        this.inLoanAccountNrmAcrIntBal = value;
    }

    /**
     * Gets the value of the inLoanAccountNrmCapBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountNrmCapBal() {
        return inLoanAccountNrmCapBal;
    }

    /**
     * Sets the value of the inLoanAccountNrmCapBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountNrmCapBal(BigDecimal value) {
        this.inLoanAccountNrmCapBal = value;
    }

    /**
     * Gets the value of the inLoanAccountNrmChrgCnt property.
     * 
     */
    public short getInLoanAccountNrmChrgCnt() {
        return inLoanAccountNrmChrgCnt;
    }

    /**
     * Sets the value of the inLoanAccountNrmChrgCnt property.
     * 
     */
    public void setInLoanAccountNrmChrgCnt(short value) {
        this.inLoanAccountNrmChrgCnt = value;
    }

    /**
     * Gets the value of the inLoanAccountNrmComBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountNrmComBal() {
        return inLoanAccountNrmComBal;
    }

    /**
     * Sets the value of the inLoanAccountNrmComBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountNrmComBal(BigDecimal value) {
        this.inLoanAccountNrmComBal = value;
    }

    /**
     * Gets the value of the inLoanAccountNrmExpBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountNrmExpBal() {
        return inLoanAccountNrmExpBal;
    }

    /**
     * Sets the value of the inLoanAccountNrmExpBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountNrmExpBal(BigDecimal value) {
        this.inLoanAccountNrmExpBal = value;
    }

    /**
     * Gets the value of the inLoanAccountNrmInstCnt property.
     * 
     */
    public short getInLoanAccountNrmInstCnt() {
        return inLoanAccountNrmInstCnt;
    }

    /**
     * Sets the value of the inLoanAccountNrmInstCnt property.
     * 
     */
    public void setInLoanAccountNrmInstCnt(short value) {
        this.inLoanAccountNrmInstCnt = value;
    }

    /**
     * Gets the value of the inLoanAccountNrmIntCnt property.
     * 
     */
    public short getInLoanAccountNrmIntCnt() {
        return inLoanAccountNrmIntCnt;
    }

    /**
     * Sets the value of the inLoanAccountNrmIntCnt property.
     * 
     */
    public void setInLoanAccountNrmIntCnt(short value) {
        this.inLoanAccountNrmIntCnt = value;
    }

    /**
     * Gets the value of the inLoanAccountNrmLoanCnt property.
     * 
     */
    public short getInLoanAccountNrmLoanCnt() {
        return inLoanAccountNrmLoanCnt;
    }

    /**
     * Sets the value of the inLoanAccountNrmLoanCnt property.
     * 
     */
    public void setInLoanAccountNrmLoanCnt(short value) {
        this.inLoanAccountNrmLoanCnt = value;
    }

    /**
     * Gets the value of the inLoanAccountNrmRlIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountNrmRlIntBal() {
        return inLoanAccountNrmRlIntBal;
    }

    /**
     * Sets the value of the inLoanAccountNrmRlIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountNrmRlIntBal(BigDecimal value) {
        this.inLoanAccountNrmRlIntBal = value;
    }

    /**
     * Gets the value of the inLoanAccountNrmSubsidyBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountNrmSubsidyBal() {
        return inLoanAccountNrmSubsidyBal;
    }

    /**
     * Sets the value of the inLoanAccountNrmSubsidyBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountNrmSubsidyBal(BigDecimal value) {
        this.inLoanAccountNrmSubsidyBal = value;
    }

    /**
     * Gets the value of the inLoanAccountNrmUrlIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountNrmUrlIntBal() {
        return inLoanAccountNrmUrlIntBal;
    }

    /**
     * Sets the value of the inLoanAccountNrmUrlIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountNrmUrlIntBal(BigDecimal value) {
        this.inLoanAccountNrmUrlIntBal = value;
    }

    /**
     * Gets the value of the inLoanAccountNrUrlPubIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountNrUrlPubIntAmn() {
        return inLoanAccountNrUrlPubIntAmn;
    }

    /**
     * Sets the value of the inLoanAccountNrUrlPubIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountNrUrlPubIntAmn(BigDecimal value) {
        this.inLoanAccountNrUrlPubIntAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountOldAccountCd property.
     * 
     */
    public short getInLoanAccountOldAccountCd() {
        return inLoanAccountOldAccountCd;
    }

    /**
     * Sets the value of the inLoanAccountOldAccountCd property.
     * 
     */
    public void setInLoanAccountOldAccountCd(short value) {
        this.inLoanAccountOldAccountCd = value;
    }

    /**
     * Gets the value of the inLoanAccountOldAccountNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountOldAccountNum() {
        return inLoanAccountOldAccountNum;
    }

    /**
     * Sets the value of the inLoanAccountOldAccountNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountOldAccountNum(String value) {
        this.inLoanAccountOldAccountNum = value;
    }

    /**
     * Gets the value of the inLoanAccountOvAcrNrmIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountOvAcrNrmIntBal() {
        return inLoanAccountOvAcrNrmIntBal;
    }

    /**
     * Sets the value of the inLoanAccountOvAcrNrmIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountOvAcrNrmIntBal(BigDecimal value) {
        this.inLoanAccountOvAcrNrmIntBal = value;
    }

    /**
     * Gets the value of the inLoanAccountOvAcrPnlIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountOvAcrPnlIntBal() {
        return inLoanAccountOvAcrPnlIntBal;
    }

    /**
     * Sets the value of the inLoanAccountOvAcrPnlIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountOvAcrPnlIntBal(BigDecimal value) {
        this.inLoanAccountOvAcrPnlIntBal = value;
    }

    /**
     * Gets the value of the inLoanAccountOvAcrPubIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountOvAcrPubIntAmn() {
        return inLoanAccountOvAcrPubIntAmn;
    }

    /**
     * Sets the value of the inLoanAccountOvAcrPubIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountOvAcrPubIntAmn(BigDecimal value) {
        this.inLoanAccountOvAcrPubIntAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountOvCapBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountOvCapBal() {
        return inLoanAccountOvCapBal;
    }

    /**
     * Sets the value of the inLoanAccountOvCapBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountOvCapBal(BigDecimal value) {
        this.inLoanAccountOvCapBal = value;
    }

    /**
     * Gets the value of the inLoanAccountOvChrgCnt property.
     * 
     */
    public short getInLoanAccountOvChrgCnt() {
        return inLoanAccountOvChrgCnt;
    }

    /**
     * Sets the value of the inLoanAccountOvChrgCnt property.
     * 
     */
    public void setInLoanAccountOvChrgCnt(short value) {
        this.inLoanAccountOvChrgCnt = value;
    }

    /**
     * Gets the value of the inLoanAccountOvComBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountOvComBal() {
        return inLoanAccountOvComBal;
    }

    /**
     * Sets the value of the inLoanAccountOvComBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountOvComBal(BigDecimal value) {
        this.inLoanAccountOvComBal = value;
    }

    /**
     * Gets the value of the inLoanAccountOvExpBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountOvExpBal() {
        return inLoanAccountOvExpBal;
    }

    /**
     * Sets the value of the inLoanAccountOvExpBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountOvExpBal(BigDecimal value) {
        this.inLoanAccountOvExpBal = value;
    }

    /**
     * Gets the value of the inLoanAccountOvExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanAccountOvExpDt() {
        return inLoanAccountOvExpDt;
    }

    /**
     * Sets the value of the inLoanAccountOvExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanAccountOvExpDt(XMLGregorianCalendar value) {
        this.inLoanAccountOvExpDt = value;
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
     * Gets the value of the inLoanAccountOvInstCnt property.
     * 
     */
    public short getInLoanAccountOvInstCnt() {
        return inLoanAccountOvInstCnt;
    }

    /**
     * Sets the value of the inLoanAccountOvInstCnt property.
     * 
     */
    public void setInLoanAccountOvInstCnt(short value) {
        this.inLoanAccountOvInstCnt = value;
    }

    /**
     * Gets the value of the inLoanAccountOvIntCnt property.
     * 
     */
    public short getInLoanAccountOvIntCnt() {
        return inLoanAccountOvIntCnt;
    }

    /**
     * Sets the value of the inLoanAccountOvIntCnt property.
     * 
     */
    public void setInLoanAccountOvIntCnt(short value) {
        this.inLoanAccountOvIntCnt = value;
    }

    /**
     * Gets the value of the inLoanAccountOvLoanCnt property.
     * 
     */
    public short getInLoanAccountOvLoanCnt() {
        return inLoanAccountOvLoanCnt;
    }

    /**
     * Sets the value of the inLoanAccountOvLoanCnt property.
     * 
     */
    public void setInLoanAccountOvLoanCnt(short value) {
        this.inLoanAccountOvLoanCnt = value;
    }

    /**
     * Gets the value of the inLoanAccountOvRlNrmIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountOvRlNrmIntBal() {
        return inLoanAccountOvRlNrmIntBal;
    }

    /**
     * Sets the value of the inLoanAccountOvRlNrmIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountOvRlNrmIntBal(BigDecimal value) {
        this.inLoanAccountOvRlNrmIntBal = value;
    }

    /**
     * Gets the value of the inLoanAccountOvRlPnlIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountOvRlPnlIntBal() {
        return inLoanAccountOvRlPnlIntBal;
    }

    /**
     * Sets the value of the inLoanAccountOvRlPnlIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountOvRlPnlIntBal(BigDecimal value) {
        this.inLoanAccountOvRlPnlIntBal = value;
    }

    /**
     * Gets the value of the inLoanAccountOvSubsidyBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountOvSubsidyBal() {
        return inLoanAccountOvSubsidyBal;
    }

    /**
     * Sets the value of the inLoanAccountOvSubsidyBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountOvSubsidyBal(BigDecimal value) {
        this.inLoanAccountOvSubsidyBal = value;
    }

    /**
     * Gets the value of the inLoanAccountOvUrlNrmIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountOvUrlNrmIntBal() {
        return inLoanAccountOvUrlNrmIntBal;
    }

    /**
     * Sets the value of the inLoanAccountOvUrlNrmIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountOvUrlNrmIntBal(BigDecimal value) {
        this.inLoanAccountOvUrlNrmIntBal = value;
    }

    /**
     * Gets the value of the inLoanAccountOvUrlPnlIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountOvUrlPnlIntBal() {
        return inLoanAccountOvUrlPnlIntBal;
    }

    /**
     * Sets the value of the inLoanAccountOvUrlPnlIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountOvUrlPnlIntBal(BigDecimal value) {
        this.inLoanAccountOvUrlPnlIntBal = value;
    }

    /**
     * Gets the value of the inLoanAccountOvUrlPubIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountOvUrlPubIntAmn() {
        return inLoanAccountOvUrlPubIntAmn;
    }

    /**
     * Sets the value of the inLoanAccountOvUrlPubIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountOvUrlPubIntAmn(BigDecimal value) {
        this.inLoanAccountOvUrlPubIntAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountPrvFxIntExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanAccountPrvFxIntExpDt() {
        return inLoanAccountPrvFxIntExpDt;
    }

    /**
     * Sets the value of the inLoanAccountPrvFxIntExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanAccountPrvFxIntExpDt(XMLGregorianCalendar value) {
        this.inLoanAccountPrvFxIntExpDt = value;
    }

    /**
     * Gets the value of the inLoanAccountPrvFxIntScalDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanAccountPrvFxIntScalDt() {
        return inLoanAccountPrvFxIntScalDt;
    }

    /**
     * Sets the value of the inLoanAccountPrvFxIntScalDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanAccountPrvFxIntScalDt(XMLGregorianCalendar value) {
        this.inLoanAccountPrvFxIntScalDt = value;
    }

    /**
     * Gets the value of the inLoanAccountPrvFxIntStDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanAccountPrvFxIntStDt() {
        return inLoanAccountPrvFxIntStDt;
    }

    /**
     * Sets the value of the inLoanAccountPrvFxIntStDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanAccountPrvFxIntStDt(XMLGregorianCalendar value) {
        this.inLoanAccountPrvFxIntStDt = value;
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
     * Gets the value of the inLoanAccountRecyclingLmtFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountRecyclingLmtFlg() {
        return inLoanAccountRecyclingLmtFlg;
    }

    /**
     * Sets the value of the inLoanAccountRecyclingLmtFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountRecyclingLmtFlg(String value) {
        this.inLoanAccountRecyclingLmtFlg = value;
    }

    /**
     * Gets the value of the inLoanAccountReqExpSn property.
     * 
     */
    public short getInLoanAccountReqExpSn() {
        return inLoanAccountReqExpSn;
    }

    /**
     * Sets the value of the inLoanAccountReqExpSn property.
     * 
     */
    public void setInLoanAccountReqExpSn(short value) {
        this.inLoanAccountReqExpSn = value;
    }

    /**
     * Gets the value of the inLoanAccountReqInstallSn property.
     * 
     */
    public short getInLoanAccountReqInstallSn() {
        return inLoanAccountReqInstallSn;
    }

    /**
     * Sets the value of the inLoanAccountReqInstallSn property.
     * 
     */
    public void setInLoanAccountReqInstallSn(short value) {
        this.inLoanAccountReqInstallSn = value;
    }

    /**
     * Gets the value of the inLoanAccountReqIntSn property.
     * 
     */
    public short getInLoanAccountReqIntSn() {
        return inLoanAccountReqIntSn;
    }

    /**
     * Sets the value of the inLoanAccountReqIntSn property.
     * 
     */
    public void setInLoanAccountReqIntSn(short value) {
        this.inLoanAccountReqIntSn = value;
    }

    /**
     * Gets the value of the inLoanAccountReqLoanSn property.
     * 
     */
    public short getInLoanAccountReqLoanSn() {
        return inLoanAccountReqLoanSn;
    }

    /**
     * Sets the value of the inLoanAccountReqLoanSn property.
     * 
     */
    public void setInLoanAccountReqLoanSn(short value) {
        this.inLoanAccountReqLoanSn = value;
    }

    /**
     * Gets the value of the inLoanAccountShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountShortName() {
        return inLoanAccountShortName;
    }

    /**
     * Sets the value of the inLoanAccountShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountShortName(String value) {
        this.inLoanAccountShortName = value;
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
     * Gets the value of the inLoanAccountStatementFreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountStatementFreq() {
        return inLoanAccountStatementFreq;
    }

    /**
     * Sets the value of the inLoanAccountStatementFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountStatementFreq(String value) {
        this.inLoanAccountStatementFreq = value;
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
     * Gets the value of the inLoanAccountSubsidyEndFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountSubsidyEndFlg() {
        return inLoanAccountSubsidyEndFlg;
    }

    /**
     * Sets the value of the inLoanAccountSubsidyEndFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountSubsidyEndFlg(String value) {
        this.inLoanAccountSubsidyEndFlg = value;
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
     * Gets the value of the inLoanAccountToleranceDays property.
     * 
     */
    public short getInLoanAccountToleranceDays() {
        return inLoanAccountToleranceDays;
    }

    /**
     * Sets the value of the inLoanAccountToleranceDays property.
     * 
     */
    public void setInLoanAccountToleranceDays(short value) {
        this.inLoanAccountToleranceDays = value;
    }

    /**
     * Gets the value of the inLoanAccountTotCapAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountTotCapAmn() {
        return inLoanAccountTotCapAmn;
    }

    /**
     * Sets the value of the inLoanAccountTotCapAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountTotCapAmn(BigDecimal value) {
        this.inLoanAccountTotCapAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountTotComInCcAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountTotComInCcAmn() {
        return inLoanAccountTotComInCcAmn;
    }

    /**
     * Sets the value of the inLoanAccountTotComInCcAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountTotComInCcAmn(BigDecimal value) {
        this.inLoanAccountTotComInCcAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountTotCommissionAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountTotCommissionAmn() {
        return inLoanAccountTotCommissionAmn;
    }

    /**
     * Sets the value of the inLoanAccountTotCommissionAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountTotCommissionAmn(BigDecimal value) {
        this.inLoanAccountTotCommissionAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountTotConfirmAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountTotConfirmAmn() {
        return inLoanAccountTotConfirmAmn;
    }

    /**
     * Sets the value of the inLoanAccountTotConfirmAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountTotConfirmAmn(BigDecimal value) {
        this.inLoanAccountTotConfirmAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountTotDrawdownAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountTotDrawdownAmn() {
        return inLoanAccountTotDrawdownAmn;
    }

    /**
     * Sets the value of the inLoanAccountTotDrawdownAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountTotDrawdownAmn(BigDecimal value) {
        this.inLoanAccountTotDrawdownAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountTotExpenseAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountTotExpenseAmn() {
        return inLoanAccountTotExpenseAmn;
    }

    /**
     * Sets the value of the inLoanAccountTotExpenseAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountTotExpenseAmn(BigDecimal value) {
        this.inLoanAccountTotExpenseAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountTotExpInCcAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountTotExpInCcAmn() {
        return inLoanAccountTotExpInCcAmn;
    }

    /**
     * Sets the value of the inLoanAccountTotExpInCcAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountTotExpInCcAmn(BigDecimal value) {
        this.inLoanAccountTotExpInCcAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountTotIntSprdAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountTotIntSprdAmn() {
        return inLoanAccountTotIntSprdAmn;
    }

    /**
     * Sets the value of the inLoanAccountTotIntSprdAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountTotIntSprdAmn(BigDecimal value) {
        this.inLoanAccountTotIntSprdAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountTotNrmIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountTotNrmIntAmn() {
        return inLoanAccountTotNrmIntAmn;
    }

    /**
     * Sets the value of the inLoanAccountTotNrmIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountTotNrmIntAmn(BigDecimal value) {
        this.inLoanAccountTotNrmIntAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountTotPnlIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountTotPnlIntAmn() {
        return inLoanAccountTotPnlIntAmn;
    }

    /**
     * Sets the value of the inLoanAccountTotPnlIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountTotPnlIntAmn(BigDecimal value) {
        this.inLoanAccountTotPnlIntAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountTotPubCommAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountTotPubCommAmn() {
        return inLoanAccountTotPubCommAmn;
    }

    /**
     * Sets the value of the inLoanAccountTotPubCommAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountTotPubCommAmn(BigDecimal value) {
        this.inLoanAccountTotPubCommAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountTotSubsIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountTotSubsIntAmn() {
        return inLoanAccountTotSubsIntAmn;
    }

    /**
     * Sets the value of the inLoanAccountTotSubsIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountTotSubsIntAmn(BigDecimal value) {
        this.inLoanAccountTotSubsIntAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountTotThrdprtAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountTotThrdprtAmn() {
        return inLoanAccountTotThrdprtAmn;
    }

    /**
     * Sets the value of the inLoanAccountTotThrdprtAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountTotThrdprtAmn(BigDecimal value) {
        this.inLoanAccountTotThrdprtAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountUnit property.
     * 
     */
    public int getInLoanAccountUnit() {
        return inLoanAccountUnit;
    }

    /**
     * Sets the value of the inLoanAccountUnit property.
     * 
     */
    public void setInLoanAccountUnit(int value) {
        this.inLoanAccountUnit = value;
    }

    /**
     * Gets the value of the inLoanAccountUnpaidCollCnt property.
     * 
     */
    public short getInLoanAccountUnpaidCollCnt() {
        return inLoanAccountUnpaidCollCnt;
    }

    /**
     * Sets the value of the inLoanAccountUnpaidCollCnt property.
     * 
     */
    public void setInLoanAccountUnpaidCollCnt(short value) {
        this.inLoanAccountUnpaidCollCnt = value;
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
     * Gets the value of the inLoanAccountUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountUsr() {
        return inLoanAccountUsr;
    }

    /**
     * Sets the value of the inLoanAccountUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountUsr(String value) {
        this.inLoanAccountUsr = value;
    }

    /**
     * Gets the value of the inLoanAccountVillageSn property.
     * 
     */
    public int getInLoanAccountVillageSn() {
        return inLoanAccountVillageSn;
    }

    /**
     * Sets the value of the inLoanAccountVillageSn property.
     * 
     */
    public void setInLoanAccountVillageSn(int value) {
        this.inLoanAccountVillageSn = value;
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
     * Gets the value of the inLoanLoanRequestRqCapitalBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanLoanRequestRqCapitalBal() {
        return inLoanLoanRequestRqCapitalBal;
    }

    /**
     * Sets the value of the inLoanLoanRequestRqCapitalBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanLoanRequestRqCapitalBal(BigDecimal value) {
        this.inLoanLoanRequestRqCapitalBal = value;
    }

    /**
     * Gets the value of the inLoanWorkFlgsEqInterestFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanWorkFlgsEqInterestFlg() {
        return inLoanWorkFlgsEqInterestFlg;
    }

    /**
     * Sets the value of the inLoanWorkFlgsEqInterestFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanWorkFlgsEqInterestFlg(String value) {
        this.inLoanWorkFlgsEqInterestFlg = value;
    }

    /**
     * Gets the value of the inLoanWorkFlgsInsuranceChargesFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanWorkFlgsInsuranceChargesFlg() {
        return inLoanWorkFlgsInsuranceChargesFlg;
    }

    /**
     * Sets the value of the inLoanWorkFlgsInsuranceChargesFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanWorkFlgsInsuranceChargesFlg(String value) {
        this.inLoanWorkFlgsInsuranceChargesFlg = value;
    }

    /**
     * Gets the value of the inLoanWorkFlgsIntCalcOnInstalmentFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanWorkFlgsIntCalcOnInstalmentFlg() {
        return inLoanWorkFlgsIntCalcOnInstalmentFlg;
    }

    /**
     * Sets the value of the inLoanWorkFlgsIntCalcOnInstalmentFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanWorkFlgsIntCalcOnInstalmentFlg(String value) {
        this.inLoanWorkFlgsIntCalcOnInstalmentFlg = value;
    }

    /**
     * Gets the value of the inLoanWorkFlgsPositiveBalFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanWorkFlgsPositiveBalFlg() {
        return inLoanWorkFlgsPositiveBalFlg;
    }

    /**
     * Sets the value of the inLoanWorkFlgsPositiveBalFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanWorkFlgsPositiveBalFlg(String value) {
        this.inLoanWorkFlgsPositiveBalFlg = value;
    }

    /**
     * Gets the value of the inLoanWorkFlgsVariableInstalmentFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanWorkFlgsVariableInstalmentFlg() {
        return inLoanWorkFlgsVariableInstalmentFlg;
    }

    /**
     * Sets the value of the inLoanWorkFlgsVariableInstalmentFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanWorkFlgsVariableInstalmentFlg(String value) {
        this.inLoanWorkFlgsVariableInstalmentFlg = value;
    }

    /**
     * Gets the value of the inMaintainEqInstLoanAccountInfoMaintainEqInst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMaintainEqInstLoanAccountInfoMaintainEqInst() {
        return inMaintainEqInstLoanAccountInfoMaintainEqInst;
    }

    /**
     * Sets the value of the inMaintainEqInstLoanAccountInfoMaintainEqInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMaintainEqInstLoanAccountInfoMaintainEqInst(String value) {
        this.inMaintainEqInstLoanAccountInfoMaintainEqInst = value;
    }

    /**
     * Gets the value of the inNewOpenDateLoanAccountAccOpenDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInNewOpenDateLoanAccountAccOpenDt() {
        return inNewOpenDateLoanAccountAccOpenDt;
    }

    /**
     * Sets the value of the inNewOpenDateLoanAccountAccOpenDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInNewOpenDateLoanAccountAccOpenDt(XMLGregorianCalendar value) {
        this.inNewOpenDateLoanAccountAccOpenDt = value;
    }

    /**
     * Gets the value of the inPosostoInsurProdCodePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInPosostoInsurProdCodePercentage() {
        return inPosostoInsurProdCodePercentage;
    }

    /**
     * Sets the value of the inPosostoInsurProdCodePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInPosostoInsurProdCodePercentage(BigDecimal value) {
        this.inPosostoInsurProdCodePercentage = value;
    }

    /**
     * Gets the value of the inPosostoInsurProdCodeProdId property.
     * 
     */
    public int getInPosostoInsurProdCodeProdId() {
        return inPosostoInsurProdCodeProdId;
    }

    /**
     * Sets the value of the inPosostoInsurProdCodeProdId property.
     * 
     */
    public void setInPosostoInsurProdCodeProdId(int value) {
        this.inPosostoInsurProdCodeProdId = value;
    }

    /**
     * Gets the value of the inProdProductIdProduct property.
     * 
     */
    public int getInProdProductIdProduct() {
        return inProdProductIdProduct;
    }

    /**
     * Sets the value of the inProdProductIdProduct property.
     * 
     */
    public void setInProdProductIdProduct(int value) {
        this.inProdProductIdProduct = value;
    }

    /**
     * Gets the value of the inShowLoanIntCapitalFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInShowLoanIntCapitalFlg() {
        return inShowLoanIntCapitalFlg;
    }

    /**
     * Sets the value of the inShowLoanIntCapitalFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInShowLoanIntCapitalFlg(String value) {
        this.inShowLoanIntCapitalFlg = value;
    }

    /**
     * Gets the value of the inTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTerminalTerminalNumber() {
        return inTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTerminalTerminalNumber(String value) {
        this.inTerminalTerminalNumber = value;
    }

    /**
     * Gets the value of the inInstall13ThPayIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInstall13ThPayIefSuppliedChar1() {
        return inInstall13ThPayIefSuppliedChar1;
    }

    /**
     * Sets the value of the inInstall13ThPayIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInstall13ThPayIefSuppliedChar1(String value) {
        this.inInstall13ThPayIefSuppliedChar1 = value;
    }

    /**
     * Gets the value of the inInstallDoubleIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInstallDoubleIefSuppliedChar1() {
        return inInstallDoubleIefSuppliedChar1;
    }

    /**
     * Sets the value of the inInstallDoubleIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInstallDoubleIefSuppliedChar1(String value) {
        this.inInstallDoubleIefSuppliedChar1 = value;
    }

    /**
     * Gets the value of the inInstallNormalIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInstallNormalIefSuppliedChar1() {
        return inInstallNormalIefSuppliedChar1;
    }

    /**
     * Sets the value of the inInstallNormalIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInstallNormalIefSuppliedChar1(String value) {
        this.inInstallNormalIefSuppliedChar1 = value;
    }

    /**
     * Gets the value of the inInstallOmitIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInstallOmitIefSuppliedChar1() {
        return inInstallOmitIefSuppliedChar1;
    }

    /**
     * Sets the value of the inInstallOmitIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInstallOmitIefSuppliedChar1(String value) {
        this.inInstallOmitIefSuppliedChar1 = value;
    }

    /**
     * Gets the value of the inGpLoanIntCapitalFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGpLoanIntCapitalFlg() {
        return inGpLoanIntCapitalFlg;
    }

    /**
     * Sets the value of the inGpLoanIntCapitalFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGpLoanIntCapitalFlg(String value) {
        this.inGpLoanIntCapitalFlg = value;
    }

    /**
     * Gets the value of the inGpLoanIntPayableFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGpLoanIntPayableFlg() {
        return inGpLoanIntPayableFlg;
    }

    /**
     * Sets the value of the inGpLoanIntPayableFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGpLoanIntPayableFlg(String value) {
        this.inGpLoanIntPayableFlg = value;
    }

    /**
     * Gets the value of the inGpLoanLoanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGpLoanLoanType() {
        return inGpLoanLoanType;
    }

    /**
     * Sets the value of the inGpLoanLoanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGpLoanLoanType(String value) {
        this.inGpLoanLoanType = value;
    }

    /**
     * Gets the value of the inGpLoanMoratIntPayFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGpLoanMoratIntPayFlg() {
        return inGpLoanMoratIntPayFlg;
    }

    /**
     * Sets the value of the inGpLoanMoratIntPayFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGpLoanMoratIntPayFlg(String value) {
        this.inGpLoanMoratIntPayFlg = value;
    }

    /**
     * Gets the value of the inGpLoanNoIntMoratorFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGpLoanNoIntMoratorFlg() {
        return inGpLoanNoIntMoratorFlg;
    }

    /**
     * Sets the value of the inGpLoanNoIntMoratorFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGpLoanNoIntMoratorFlg(String value) {
        this.inGpLoanNoIntMoratorFlg = value;
    }

    /**
     * Gets the value of the inGpLoanNonIntCapitFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGpLoanNonIntCapitFlg() {
        return inGpLoanNonIntCapitFlg;
    }

    /**
     * Sets the value of the inGpLoanNonIntCapitFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGpLoanNonIntCapitFlg(String value) {
        this.inGpLoanNonIntCapitFlg = value;
    }

    /**
     * Gets the value of the inSubsidyPercentageIefSuppliedPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInSubsidyPercentageIefSuppliedPercentage() {
        return inSubsidyPercentageIefSuppliedPercentage;
    }

    /**
     * Sets the value of the inSubsidyPercentageIefSuppliedPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInSubsidyPercentageIefSuppliedPercentage(BigDecimal value) {
        this.inSubsidyPercentageIefSuppliedPercentage = value;
    }

    /**
     * Gets the value of the inTotalLoanIefSuppliedTotalInteger property.
     * 
     */
    public double getInTotalLoanIefSuppliedTotalInteger() {
        return inTotalLoanIefSuppliedTotalInteger;
    }

    /**
     * Sets the value of the inTotalLoanIefSuppliedTotalInteger property.
     * 
     */
    public void setInTotalLoanIefSuppliedTotalInteger(double value) {
        this.inTotalLoanIefSuppliedTotalInteger = value;
    }

    /**
     * Gets the value of the inExpensesLnsSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInExpensesLnsSuppliedAmount() {
        return inExpensesLnsSuppliedAmount;
    }

    /**
     * Sets the value of the inExpensesLnsSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInExpensesLnsSuppliedAmount(BigDecimal value) {
        this.inExpensesLnsSuppliedAmount = value;
    }

    /**
     * Gets the value of the inCoinsuredGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfL0436VInCoinsuredGrpItem }
     *     
     */
    public ArrayOfL0436VInCoinsuredGrpItem getInCoinsuredGrp() {
        return inCoinsuredGrp;
    }

    /**
     * Sets the value of the inCoinsuredGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfL0436VInCoinsuredGrpItem }
     *     
     */
    public void setInCoinsuredGrp(ArrayOfL0436VInCoinsuredGrpItem value) {
        this.inCoinsuredGrp = value;
    }

    /**
     * Gets the value of the inMrtAmortizeFlgIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMrtAmortizeFlgIefSuppliedFlag() {
        return inMrtAmortizeFlgIefSuppliedFlag;
    }

    /**
     * Sets the value of the inMrtAmortizeFlgIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMrtAmortizeFlgIefSuppliedFlag(String value) {
        this.inMrtAmortizeFlgIefSuppliedFlag = value;
    }

}
