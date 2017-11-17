
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Lna0405VSaveRepScenarioImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Lna0405VSaveRepScenarioImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCurrencyDisplayedDecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFirstLoanIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InFixInstallLoanInstallmentInfoInstallmentAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InFixedDateLoanAccountCurFxIntExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InFixedDurUnitLnsInterestIntDuration" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InFixedLnsInterestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFixedLnsInterestDurationUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFixedLnsInterestFixIntDtChgFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFixedLnsInterestFixIntExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InFixedLnsInterestFixedFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFixedLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InFixedLnsInterestIntDuration" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InFixedStDtLoanAccountCurFxIntStDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InFloatingLnsInterestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFloatingLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InFloatingLoanInstallmentInfoInstallDbIntPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InInstallDtIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InInstallFlexIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInstallFlexStabOmitIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInstallFlexVarOmitIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInstallmentInfoLoanInstallmentInfoInstallCollectionCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InInstallmentInfoLoanInstallmentInfoInstallDaysbase" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InInstallmentInfoLoanInstallmentInfoInstallDbIntPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InInstallmentInfoLoanInstallmentInfoInstallEftePerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InInstallmentInfoLoanInstallmentInfoInstallFrequency" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InInstallmentInfoLoanInstallmentInfoInstallN128Perc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InInstallmentInfoLoanInstallmentInfoInstallPeriodInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInstallmentInfoLoanInstallmentInfoInstallSpreadPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InInstallmentInfoLoanInstallmentInfoInstallSubsPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InInstallmentInfoLoanInstallmentInfoMoratoriumEndDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InInstallmentInfoLoanInstallmentInfoStartingCapitalAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InIntLnsInterestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIntLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
 *         &lt;element name="InLoanAccountCurFxIntScalDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountCurFxIntStDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountCusStmLstTrnDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountCusStmNxtTrnDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanAccountDepAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountDepAccSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
 *         &lt;element name="InLoanAccountNrUrlPubIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
 *         &lt;element name="InLoanAccountRecyclingFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountReqExpSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountReqInstallSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountReqIntSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountReqLoanSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
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
 *         &lt;element name="InLoanAccountTotExpInCcAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountTotExpenseAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountTotIntSprdAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountTotNrmIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountTotPnlIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountTotPubCommAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountTotSubsIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountTotThrdprtAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLoanAccountUnrealizedFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountInfoMoratIntPayFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountInfoMoratoriumIntFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InMaintainEqInstLoanAccountInfoMaintainEqInst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InN128InterestLnsInterestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InN128InterestLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InNewOpenDateLoanAccountAccOpenDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InRetCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InRetCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InShowLoanIntCapitalFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSubsidySubsidyOrderDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSubsidySubsidyOrderIdSubsidy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TonyInInstall13thPayIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TonyInInstallDoubleIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TonyInInstallNormalIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TonyInInstallOmitIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TonyInLoanIntCapitalFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TonyInLoanIntPayableFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TonyInLoanLoanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TonyInLoanMoratIntPayFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TonyInLoanNoIntMoratorFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TonyInLoanNonIntCapitFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TonyInProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TonyInProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TonyInSubsidyPercentageIefSuppliedPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TonyInTotalGraceInstallIefSuppliedTotalInteger" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TonyInTotalLoanIefSuppliedTotalInteger" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InSelectedAgrProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedAgrProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSelectedDepProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedDepProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCategoryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCategoryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTransactSmLoanAccountInfoTransactInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTransactSmLoanAccountInfoTransactSm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpDbSelectedInsProds" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfLna0405VInGrpDbSelectedInsProdsItem" minOccurs="0"/>
 *         &lt;element name="InCoinsuredGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfLna0405VInCoinsuredGrpItem" minOccurs="0"/>
 *         &lt;element name="InLoanScenarioDtLoanScenarioDataTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLoanScenarioDtLoanScenarioDataInstallSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InInitLoanScenarioDataTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InInitLoanScenarioDataInstallSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InCbpurpGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCbpurpGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBankSectorGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBankSectorGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPurposeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPurposeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InActivitySectionGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InActivitySectionGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InEconomicSectionGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InEconomicSectionGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InStatementLoanAccountStatementFreq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InApplicationDataLoanScenarioDataApplicationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InApplicationDataLoanScenarioDataApplicationSts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSalePersonGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSalePersonGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSaleUnitGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSaleUnitGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpMediators" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfLna0405VInGrpMediatorsItem" minOccurs="0"/>
 *         &lt;element name="InPenaltyIdLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "Lna0405VSaveRepScenarioImport", propOrder = {
    "command",
    "inCurrencyDisplayedDecimalPlaces",
    "inCurrencyIdCurrency",
    "inCurrencyShortDescr",
    "inFirstLoanIefSuppliedDate",
    "inFixInstallLoanInstallmentInfoInstallmentAmn",
    "inFixedDateLoanAccountCurFxIntExpDt",
    "inFixedDurUnitLnsInterestIntDuration",
    "inFixedLnsInterestDescription",
    "inFixedLnsInterestDurationUnit",
    "inFixedLnsInterestFixIntDtChgFlg",
    "inFixedLnsInterestFixIntExpDt",
    "inFixedLnsInterestFixedFlg",
    "inFixedLnsInterestIdInterest",
    "inFixedLnsInterestIntDuration",
    "inFixedStDtLoanAccountCurFxIntStDt",
    "inFloatingLnsInterestDescription",
    "inFloatingLnsInterestIdInterest",
    "inFloatingLoanInstallmentInfoInstallDbIntPerc",
    "inInstallDtIefSuppliedDate",
    "inInstallFlexIefSuppliedChar1",
    "inInstallFlexStabOmitIefSuppliedChar1",
    "inInstallFlexVarOmitIefSuppliedChar1",
    "inInstallmentInfoLoanInstallmentInfoInstallCollectionCnt",
    "inInstallmentInfoLoanInstallmentInfoInstallDaysbase",
    "inInstallmentInfoLoanInstallmentInfoInstallDbIntPerc",
    "inInstallmentInfoLoanInstallmentInfoInstallEftePerc",
    "inInstallmentInfoLoanInstallmentInfoInstallFrequency",
    "inInstallmentInfoLoanInstallmentInfoInstallN128Perc",
    "inInstallmentInfoLoanInstallmentInfoInstallPeriodInd",
    "inInstallmentInfoLoanInstallmentInfoInstallSpreadPerc",
    "inInstallmentInfoLoanInstallmentInfoInstallSubsPerc",
    "inInstallmentInfoLoanInstallmentInfoMoratoriumEndDt",
    "inInstallmentInfoLoanInstallmentInfoStartingCapitalAmn",
    "inIntLnsInterestDescription",
    "inIntLnsInterestIdInterest",
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
    "inLoanAccountCurFxIntScalDt",
    "inLoanAccountCurFxIntStDt",
    "inLoanAccountCusStmLstTrnDt",
    "inLoanAccountCusStmNxtTrnDt",
    "inLoanAccountDepAccCd",
    "inLoanAccountDepAccSn",
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
    "inLoanAccountNrUrlPubIntAmn",
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
    "inLoanAccountRecyclingFrq",
    "inLoanAccountReqExpSn",
    "inLoanAccountReqInstallSn",
    "inLoanAccountReqIntSn",
    "inLoanAccountReqLoanSn",
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
    "inLoanAccountTotExpInCcAmn",
    "inLoanAccountTotExpenseAmn",
    "inLoanAccountTotIntSprdAmn",
    "inLoanAccountTotNrmIntAmn",
    "inLoanAccountTotPnlIntAmn",
    "inLoanAccountTotPubCommAmn",
    "inLoanAccountTotSubsIntAmn",
    "inLoanAccountTotThrdprtAmn",
    "inLoanAccountUnit",
    "inLoanAccountUnrealizedFlg",
    "inLoanAccountUsr",
    "inLoanAccountInfoMoratIntPayFlg",
    "inLoanAccountInfoMoratoriumIntFrq",
    "inMaintainEqInstLoanAccountInfoMaintainEqInst",
    "inN128InterestLnsInterestDescription",
    "inN128InterestLnsInterestIdInterest",
    "inNewOpenDateLoanAccountAccOpenDt",
    "inRetCustomerCDigit",
    "inRetCustomerCustId",
    "inShowLoanIntCapitalFlg",
    "inSubsidySubsidyOrderDescription",
    "inSubsidySubsidyOrderIdSubsidy",
    "tonyInInstall13ThPayIefSuppliedChar1",
    "tonyInInstallDoubleIefSuppliedChar1",
    "tonyInInstallNormalIefSuppliedChar1",
    "tonyInInstallOmitIefSuppliedChar1",
    "tonyInLoanIntCapitalFlg",
    "tonyInLoanIntPayableFlg",
    "tonyInLoanLoanType",
    "tonyInLoanMoratIntPayFlg",
    "tonyInLoanNoIntMoratorFlg",
    "tonyInLoanNonIntCapitFlg",
    "tonyInProductDescription",
    "tonyInProductIdProduct",
    "tonyInSubsidyPercentageIefSuppliedPercentage",
    "tonyInTotalGraceInstallIefSuppliedTotalInteger",
    "tonyInTotalLoanIefSuppliedTotalInteger",
    "inSelectedAgrProfitsAccountAccountNumber",
    "inSelectedAgrProfitsAccountAccountCd",
    "inSelectedDepProfitsAccountAccountNumber",
    "inSelectedDepProfitsAccountAccountCd",
    "inCategoryGenericDetailSerialNum",
    "inCategoryGenericDetailDescription",
    "inTransactSmLoanAccountInfoTransactInd",
    "inTransactSmLoanAccountInfoTransactSm",
    "inTerminalTerminalNumber",
    "inGrpDbSelectedInsProds",
    "inCoinsuredGrp",
    "inLoanScenarioDtLoanScenarioDataTmstamp",
    "inLoanScenarioDtLoanScenarioDataInstallSn",
    "inInitLoanScenarioDataTmstamp",
    "inInitLoanScenarioDataInstallSn",
    "inCbpurpGenericDetailSerialNum",
    "inCbpurpGenericDetailDescription",
    "inBankSectorGenericDetailSerialNum",
    "inBankSectorGenericDetailDescription",
    "inPurposeGenericDetailSerialNum",
    "inPurposeGenericDetailDescription",
    "inActivitySectionGenericDetailSerialNum",
    "inActivitySectionGenericDetailDescription",
    "inEconomicSectionGenericDetailSerialNum",
    "inEconomicSectionGenericDetailDescription",
    "inStatementLoanAccountStatementFreq",
    "inApplicationDataLoanScenarioDataApplicationId",
    "inApplicationDataLoanScenarioDataApplicationSts",
    "inSalePersonGenericDetailSerialNum",
    "inSalePersonGenericDetailDescription",
    "inSaleUnitGenericDetailSerialNum",
    "inSaleUnitGenericDetailDescription",
    "inGrpMediators",
    "inPenaltyIdLnsInterestIdInterest",
    "inMrtAmortizeFlgIefSuppliedFlag"
})
public class Lna0405VSaveRepScenarioImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InCurrencyDisplayedDecimalPlaces")
    protected short inCurrencyDisplayedDecimalPlaces;
    @XmlElement(name = "InCurrencyIdCurrency")
    protected int inCurrencyIdCurrency;
    @XmlElement(name = "InCurrencyShortDescr")
    protected String inCurrencyShortDescr;
    @XmlElement(name = "InFirstLoanIefSuppliedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inFirstLoanIefSuppliedDate;
    @XmlElement(name = "InFixInstallLoanInstallmentInfoInstallmentAmn", required = true)
    protected BigDecimal inFixInstallLoanInstallmentInfoInstallmentAmn;
    @XmlElement(name = "InFixedDateLoanAccountCurFxIntExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inFixedDateLoanAccountCurFxIntExpDt;
    @XmlElement(name = "InFixedDurUnitLnsInterestIntDuration")
    protected short inFixedDurUnitLnsInterestIntDuration;
    @XmlElement(name = "InFixedLnsInterestDescription")
    protected String inFixedLnsInterestDescription;
    @XmlElement(name = "InFixedLnsInterestDurationUnit")
    protected String inFixedLnsInterestDurationUnit;
    @XmlElement(name = "InFixedLnsInterestFixIntDtChgFlg")
    protected String inFixedLnsInterestFixIntDtChgFlg;
    @XmlElement(name = "InFixedLnsInterestFixIntExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inFixedLnsInterestFixIntExpDt;
    @XmlElement(name = "InFixedLnsInterestFixedFlg")
    protected String inFixedLnsInterestFixedFlg;
    @XmlElement(name = "InFixedLnsInterestIdInterest")
    protected int inFixedLnsInterestIdInterest;
    @XmlElement(name = "InFixedLnsInterestIntDuration")
    protected short inFixedLnsInterestIntDuration;
    @XmlElement(name = "InFixedStDtLoanAccountCurFxIntStDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inFixedStDtLoanAccountCurFxIntStDt;
    @XmlElement(name = "InFloatingLnsInterestDescription")
    protected String inFloatingLnsInterestDescription;
    @XmlElement(name = "InFloatingLnsInterestIdInterest")
    protected int inFloatingLnsInterestIdInterest;
    @XmlElement(name = "InFloatingLoanInstallmentInfoInstallDbIntPerc", required = true)
    protected BigDecimal inFloatingLoanInstallmentInfoInstallDbIntPerc;
    @XmlElement(name = "InInstallDtIefSuppliedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inInstallDtIefSuppliedDate;
    @XmlElement(name = "InInstallFlexIefSuppliedChar1")
    protected String inInstallFlexIefSuppliedChar1;
    @XmlElement(name = "InInstallFlexStabOmitIefSuppliedChar1")
    protected String inInstallFlexStabOmitIefSuppliedChar1;
    @XmlElement(name = "InInstallFlexVarOmitIefSuppliedChar1")
    protected String inInstallFlexVarOmitIefSuppliedChar1;
    @XmlElement(name = "InInstallmentInfoLoanInstallmentInfoInstallCollectionCnt")
    protected short inInstallmentInfoLoanInstallmentInfoInstallCollectionCnt;
    @XmlElement(name = "InInstallmentInfoLoanInstallmentInfoInstallDaysbase")
    protected short inInstallmentInfoLoanInstallmentInfoInstallDaysbase;
    @XmlElement(name = "InInstallmentInfoLoanInstallmentInfoInstallDbIntPerc", required = true)
    protected BigDecimal inInstallmentInfoLoanInstallmentInfoInstallDbIntPerc;
    @XmlElement(name = "InInstallmentInfoLoanInstallmentInfoInstallEftePerc", required = true)
    protected BigDecimal inInstallmentInfoLoanInstallmentInfoInstallEftePerc;
    @XmlElement(name = "InInstallmentInfoLoanInstallmentInfoInstallFrequency")
    protected short inInstallmentInfoLoanInstallmentInfoInstallFrequency;
    @XmlElement(name = "InInstallmentInfoLoanInstallmentInfoInstallN128Perc", required = true)
    protected BigDecimal inInstallmentInfoLoanInstallmentInfoInstallN128Perc;
    @XmlElement(name = "InInstallmentInfoLoanInstallmentInfoInstallPeriodInd")
    protected String inInstallmentInfoLoanInstallmentInfoInstallPeriodInd;
    @XmlElement(name = "InInstallmentInfoLoanInstallmentInfoInstallSpreadPerc", required = true)
    protected BigDecimal inInstallmentInfoLoanInstallmentInfoInstallSpreadPerc;
    @XmlElement(name = "InInstallmentInfoLoanInstallmentInfoInstallSubsPerc", required = true)
    protected BigDecimal inInstallmentInfoLoanInstallmentInfoInstallSubsPerc;
    @XmlElement(name = "InInstallmentInfoLoanInstallmentInfoMoratoriumEndDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inInstallmentInfoLoanInstallmentInfoMoratoriumEndDt;
    @XmlElement(name = "InInstallmentInfoLoanInstallmentInfoStartingCapitalAmn", required = true)
    protected BigDecimal inInstallmentInfoLoanInstallmentInfoStartingCapitalAmn;
    @XmlElement(name = "InIntLnsInterestDescription")
    protected String inIntLnsInterestDescription;
    @XmlElement(name = "InIntLnsInterestIdInterest")
    protected int inIntLnsInterestIdInterest;
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
    @XmlElement(name = "InLoanAccountNrUrlPubIntAmn", required = true)
    protected BigDecimal inLoanAccountNrUrlPubIntAmn;
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
    @XmlElement(name = "InLoanAccountRecyclingFrq")
    protected short inLoanAccountRecyclingFrq;
    @XmlElement(name = "InLoanAccountReqExpSn")
    protected short inLoanAccountReqExpSn;
    @XmlElement(name = "InLoanAccountReqInstallSn")
    protected short inLoanAccountReqInstallSn;
    @XmlElement(name = "InLoanAccountReqIntSn")
    protected short inLoanAccountReqIntSn;
    @XmlElement(name = "InLoanAccountReqLoanSn")
    protected short inLoanAccountReqLoanSn;
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
    @XmlElement(name = "InLoanAccountTotExpInCcAmn", required = true)
    protected BigDecimal inLoanAccountTotExpInCcAmn;
    @XmlElement(name = "InLoanAccountTotExpenseAmn", required = true)
    protected BigDecimal inLoanAccountTotExpenseAmn;
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
    @XmlElement(name = "InLoanAccountUnrealizedFlg")
    protected String inLoanAccountUnrealizedFlg;
    @XmlElement(name = "InLoanAccountUsr")
    protected String inLoanAccountUsr;
    @XmlElement(name = "InLoanAccountInfoMoratIntPayFlg")
    protected String inLoanAccountInfoMoratIntPayFlg;
    @XmlElement(name = "InLoanAccountInfoMoratoriumIntFrq")
    protected short inLoanAccountInfoMoratoriumIntFrq;
    @XmlElement(name = "InMaintainEqInstLoanAccountInfoMaintainEqInst")
    protected String inMaintainEqInstLoanAccountInfoMaintainEqInst;
    @XmlElement(name = "InN128InterestLnsInterestDescription")
    protected String inN128InterestLnsInterestDescription;
    @XmlElement(name = "InN128InterestLnsInterestIdInterest")
    protected int inN128InterestLnsInterestIdInterest;
    @XmlElement(name = "InNewOpenDateLoanAccountAccOpenDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inNewOpenDateLoanAccountAccOpenDt;
    @XmlElement(name = "InRetCustomerCDigit")
    protected short inRetCustomerCDigit;
    @XmlElement(name = "InRetCustomerCustId")
    protected int inRetCustomerCustId;
    @XmlElement(name = "InShowLoanIntCapitalFlg")
    protected String inShowLoanIntCapitalFlg;
    @XmlElement(name = "InSubsidySubsidyOrderDescription")
    protected String inSubsidySubsidyOrderDescription;
    @XmlElement(name = "InSubsidySubsidyOrderIdSubsidy")
    protected int inSubsidySubsidyOrderIdSubsidy;
    @XmlElement(name = "TonyInInstall13thPayIefSuppliedChar1")
    protected String tonyInInstall13ThPayIefSuppliedChar1;
    @XmlElement(name = "TonyInInstallDoubleIefSuppliedChar1")
    protected String tonyInInstallDoubleIefSuppliedChar1;
    @XmlElement(name = "TonyInInstallNormalIefSuppliedChar1")
    protected String tonyInInstallNormalIefSuppliedChar1;
    @XmlElement(name = "TonyInInstallOmitIefSuppliedChar1")
    protected String tonyInInstallOmitIefSuppliedChar1;
    @XmlElement(name = "TonyInLoanIntCapitalFlg")
    protected String tonyInLoanIntCapitalFlg;
    @XmlElement(name = "TonyInLoanIntPayableFlg")
    protected String tonyInLoanIntPayableFlg;
    @XmlElement(name = "TonyInLoanLoanType")
    protected String tonyInLoanLoanType;
    @XmlElement(name = "TonyInLoanMoratIntPayFlg")
    protected String tonyInLoanMoratIntPayFlg;
    @XmlElement(name = "TonyInLoanNoIntMoratorFlg")
    protected String tonyInLoanNoIntMoratorFlg;
    @XmlElement(name = "TonyInLoanNonIntCapitFlg")
    protected String tonyInLoanNonIntCapitFlg;
    @XmlElement(name = "TonyInProductDescription")
    protected String tonyInProductDescription;
    @XmlElement(name = "TonyInProductIdProduct")
    protected int tonyInProductIdProduct;
    @XmlElement(name = "TonyInSubsidyPercentageIefSuppliedPercentage", required = true)
    protected BigDecimal tonyInSubsidyPercentageIefSuppliedPercentage;
    @XmlElement(name = "TonyInTotalGraceInstallIefSuppliedTotalInteger")
    protected double tonyInTotalGraceInstallIefSuppliedTotalInteger;
    @XmlElement(name = "TonyInTotalLoanIefSuppliedTotalInteger")
    protected double tonyInTotalLoanIefSuppliedTotalInteger;
    @XmlElement(name = "InSelectedAgrProfitsAccountAccountNumber")
    protected String inSelectedAgrProfitsAccountAccountNumber;
    @XmlElement(name = "InSelectedAgrProfitsAccountAccountCd")
    protected short inSelectedAgrProfitsAccountAccountCd;
    @XmlElement(name = "InSelectedDepProfitsAccountAccountNumber")
    protected String inSelectedDepProfitsAccountAccountNumber;
    @XmlElement(name = "InSelectedDepProfitsAccountAccountCd")
    protected short inSelectedDepProfitsAccountAccountCd;
    @XmlElement(name = "InCategoryGenericDetailSerialNum")
    protected int inCategoryGenericDetailSerialNum;
    @XmlElement(name = "InCategoryGenericDetailDescription")
    protected String inCategoryGenericDetailDescription;
    @XmlElement(name = "InTransactSmLoanAccountInfoTransactInd")
    protected String inTransactSmLoanAccountInfoTransactInd;
    @XmlElement(name = "InTransactSmLoanAccountInfoTransactSm")
    protected int inTransactSmLoanAccountInfoTransactSm;
    @XmlElement(name = "InTerminalTerminalNumber")
    protected String inTerminalTerminalNumber;
    @XmlElement(name = "InGrpDbSelectedInsProds")
    protected ArrayOfLna0405VInGrpDbSelectedInsProdsItem inGrpDbSelectedInsProds;
    @XmlElement(name = "InCoinsuredGrp")
    protected ArrayOfLna0405VInCoinsuredGrpItem inCoinsuredGrp;
    @XmlElement(name = "InLoanScenarioDtLoanScenarioDataTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanScenarioDtLoanScenarioDataTmstamp;
    @XmlElement(name = "InLoanScenarioDtLoanScenarioDataInstallSn")
    protected double inLoanScenarioDtLoanScenarioDataInstallSn;
    @XmlElement(name = "InInitLoanScenarioDataTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inInitLoanScenarioDataTmstamp;
    @XmlElement(name = "InInitLoanScenarioDataInstallSn")
    protected double inInitLoanScenarioDataInstallSn;
    @XmlElement(name = "InCbpurpGenericDetailSerialNum")
    protected int inCbpurpGenericDetailSerialNum;
    @XmlElement(name = "InCbpurpGenericDetailDescription")
    protected String inCbpurpGenericDetailDescription;
    @XmlElement(name = "InBankSectorGenericDetailSerialNum")
    protected int inBankSectorGenericDetailSerialNum;
    @XmlElement(name = "InBankSectorGenericDetailDescription")
    protected String inBankSectorGenericDetailDescription;
    @XmlElement(name = "InPurposeGenericDetailSerialNum")
    protected int inPurposeGenericDetailSerialNum;
    @XmlElement(name = "InPurposeGenericDetailDescription")
    protected String inPurposeGenericDetailDescription;
    @XmlElement(name = "InActivitySectionGenericDetailSerialNum")
    protected int inActivitySectionGenericDetailSerialNum;
    @XmlElement(name = "InActivitySectionGenericDetailDescription")
    protected String inActivitySectionGenericDetailDescription;
    @XmlElement(name = "InEconomicSectionGenericDetailSerialNum")
    protected int inEconomicSectionGenericDetailSerialNum;
    @XmlElement(name = "InEconomicSectionGenericDetailDescription")
    protected String inEconomicSectionGenericDetailDescription;
    @XmlElement(name = "InStatementLoanAccountStatementFreq")
    protected String inStatementLoanAccountStatementFreq;
    @XmlElement(name = "InApplicationDataLoanScenarioDataApplicationId")
    protected String inApplicationDataLoanScenarioDataApplicationId;
    @XmlElement(name = "InApplicationDataLoanScenarioDataApplicationSts")
    protected String inApplicationDataLoanScenarioDataApplicationSts;
    @XmlElement(name = "InSalePersonGenericDetailSerialNum")
    protected int inSalePersonGenericDetailSerialNum;
    @XmlElement(name = "InSalePersonGenericDetailDescription")
    protected String inSalePersonGenericDetailDescription;
    @XmlElement(name = "InSaleUnitGenericDetailSerialNum")
    protected int inSaleUnitGenericDetailSerialNum;
    @XmlElement(name = "InSaleUnitGenericDetailDescription")
    protected String inSaleUnitGenericDetailDescription;
    @XmlElement(name = "InGrpMediators")
    protected ArrayOfLna0405VInGrpMediatorsItem inGrpMediators;
    @XmlElement(name = "InPenaltyIdLnsInterestIdInterest")
    protected int inPenaltyIdLnsInterestIdInterest;
    @XmlElement(name = "InMrtAmortizeFlgIefSuppliedFlag")
    protected String inMrtAmortizeFlgIefSuppliedFlag;

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
     * Gets the value of the inCurrencyDisplayedDecimalPlaces property.
     * 
     */
    public short getInCurrencyDisplayedDecimalPlaces() {
        return inCurrencyDisplayedDecimalPlaces;
    }

    /**
     * Sets the value of the inCurrencyDisplayedDecimalPlaces property.
     * 
     */
    public void setInCurrencyDisplayedDecimalPlaces(short value) {
        this.inCurrencyDisplayedDecimalPlaces = value;
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
     * Gets the value of the inFixedDurUnitLnsInterestIntDuration property.
     * 
     */
    public short getInFixedDurUnitLnsInterestIntDuration() {
        return inFixedDurUnitLnsInterestIntDuration;
    }

    /**
     * Sets the value of the inFixedDurUnitLnsInterestIntDuration property.
     * 
     */
    public void setInFixedDurUnitLnsInterestIntDuration(short value) {
        this.inFixedDurUnitLnsInterestIntDuration = value;
    }

    /**
     * Gets the value of the inFixedLnsInterestDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFixedLnsInterestDescription() {
        return inFixedLnsInterestDescription;
    }

    /**
     * Sets the value of the inFixedLnsInterestDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFixedLnsInterestDescription(String value) {
        this.inFixedLnsInterestDescription = value;
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
     * Gets the value of the inFixedLnsInterestFixIntDtChgFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFixedLnsInterestFixIntDtChgFlg() {
        return inFixedLnsInterestFixIntDtChgFlg;
    }

    /**
     * Sets the value of the inFixedLnsInterestFixIntDtChgFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFixedLnsInterestFixIntDtChgFlg(String value) {
        this.inFixedLnsInterestFixIntDtChgFlg = value;
    }

    /**
     * Gets the value of the inFixedLnsInterestFixIntExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInFixedLnsInterestFixIntExpDt() {
        return inFixedLnsInterestFixIntExpDt;
    }

    /**
     * Sets the value of the inFixedLnsInterestFixIntExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInFixedLnsInterestFixIntExpDt(XMLGregorianCalendar value) {
        this.inFixedLnsInterestFixIntExpDt = value;
    }

    /**
     * Gets the value of the inFixedLnsInterestFixedFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFixedLnsInterestFixedFlg() {
        return inFixedLnsInterestFixedFlg;
    }

    /**
     * Sets the value of the inFixedLnsInterestFixedFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFixedLnsInterestFixedFlg(String value) {
        this.inFixedLnsInterestFixedFlg = value;
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
     * Gets the value of the inFixedStDtLoanAccountCurFxIntStDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInFixedStDtLoanAccountCurFxIntStDt() {
        return inFixedStDtLoanAccountCurFxIntStDt;
    }

    /**
     * Sets the value of the inFixedStDtLoanAccountCurFxIntStDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInFixedStDtLoanAccountCurFxIntStDt(XMLGregorianCalendar value) {
        this.inFixedStDtLoanAccountCurFxIntStDt = value;
    }

    /**
     * Gets the value of the inFloatingLnsInterestDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFloatingLnsInterestDescription() {
        return inFloatingLnsInterestDescription;
    }

    /**
     * Sets the value of the inFloatingLnsInterestDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFloatingLnsInterestDescription(String value) {
        this.inFloatingLnsInterestDescription = value;
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
     * Gets the value of the inInstallDtIefSuppliedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInInstallDtIefSuppliedDate() {
        return inInstallDtIefSuppliedDate;
    }

    /**
     * Sets the value of the inInstallDtIefSuppliedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInInstallDtIefSuppliedDate(XMLGregorianCalendar value) {
        this.inInstallDtIefSuppliedDate = value;
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
     * Gets the value of the inInstallmentInfoLoanInstallmentInfoInstallCollectionCnt property.
     * 
     */
    public short getInInstallmentInfoLoanInstallmentInfoInstallCollectionCnt() {
        return inInstallmentInfoLoanInstallmentInfoInstallCollectionCnt;
    }

    /**
     * Sets the value of the inInstallmentInfoLoanInstallmentInfoInstallCollectionCnt property.
     * 
     */
    public void setInInstallmentInfoLoanInstallmentInfoInstallCollectionCnt(short value) {
        this.inInstallmentInfoLoanInstallmentInfoInstallCollectionCnt = value;
    }

    /**
     * Gets the value of the inInstallmentInfoLoanInstallmentInfoInstallDaysbase property.
     * 
     */
    public short getInInstallmentInfoLoanInstallmentInfoInstallDaysbase() {
        return inInstallmentInfoLoanInstallmentInfoInstallDaysbase;
    }

    /**
     * Sets the value of the inInstallmentInfoLoanInstallmentInfoInstallDaysbase property.
     * 
     */
    public void setInInstallmentInfoLoanInstallmentInfoInstallDaysbase(short value) {
        this.inInstallmentInfoLoanInstallmentInfoInstallDaysbase = value;
    }

    /**
     * Gets the value of the inInstallmentInfoLoanInstallmentInfoInstallDbIntPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInInstallmentInfoLoanInstallmentInfoInstallDbIntPerc() {
        return inInstallmentInfoLoanInstallmentInfoInstallDbIntPerc;
    }

    /**
     * Sets the value of the inInstallmentInfoLoanInstallmentInfoInstallDbIntPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInInstallmentInfoLoanInstallmentInfoInstallDbIntPerc(BigDecimal value) {
        this.inInstallmentInfoLoanInstallmentInfoInstallDbIntPerc = value;
    }

    /**
     * Gets the value of the inInstallmentInfoLoanInstallmentInfoInstallEftePerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInInstallmentInfoLoanInstallmentInfoInstallEftePerc() {
        return inInstallmentInfoLoanInstallmentInfoInstallEftePerc;
    }

    /**
     * Sets the value of the inInstallmentInfoLoanInstallmentInfoInstallEftePerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInInstallmentInfoLoanInstallmentInfoInstallEftePerc(BigDecimal value) {
        this.inInstallmentInfoLoanInstallmentInfoInstallEftePerc = value;
    }

    /**
     * Gets the value of the inInstallmentInfoLoanInstallmentInfoInstallFrequency property.
     * 
     */
    public short getInInstallmentInfoLoanInstallmentInfoInstallFrequency() {
        return inInstallmentInfoLoanInstallmentInfoInstallFrequency;
    }

    /**
     * Sets the value of the inInstallmentInfoLoanInstallmentInfoInstallFrequency property.
     * 
     */
    public void setInInstallmentInfoLoanInstallmentInfoInstallFrequency(short value) {
        this.inInstallmentInfoLoanInstallmentInfoInstallFrequency = value;
    }

    /**
     * Gets the value of the inInstallmentInfoLoanInstallmentInfoInstallN128Perc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInInstallmentInfoLoanInstallmentInfoInstallN128Perc() {
        return inInstallmentInfoLoanInstallmentInfoInstallN128Perc;
    }

    /**
     * Sets the value of the inInstallmentInfoLoanInstallmentInfoInstallN128Perc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInInstallmentInfoLoanInstallmentInfoInstallN128Perc(BigDecimal value) {
        this.inInstallmentInfoLoanInstallmentInfoInstallN128Perc = value;
    }

    /**
     * Gets the value of the inInstallmentInfoLoanInstallmentInfoInstallPeriodInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInstallmentInfoLoanInstallmentInfoInstallPeriodInd() {
        return inInstallmentInfoLoanInstallmentInfoInstallPeriodInd;
    }

    /**
     * Sets the value of the inInstallmentInfoLoanInstallmentInfoInstallPeriodInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInstallmentInfoLoanInstallmentInfoInstallPeriodInd(String value) {
        this.inInstallmentInfoLoanInstallmentInfoInstallPeriodInd = value;
    }

    /**
     * Gets the value of the inInstallmentInfoLoanInstallmentInfoInstallSpreadPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInInstallmentInfoLoanInstallmentInfoInstallSpreadPerc() {
        return inInstallmentInfoLoanInstallmentInfoInstallSpreadPerc;
    }

    /**
     * Sets the value of the inInstallmentInfoLoanInstallmentInfoInstallSpreadPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInInstallmentInfoLoanInstallmentInfoInstallSpreadPerc(BigDecimal value) {
        this.inInstallmentInfoLoanInstallmentInfoInstallSpreadPerc = value;
    }

    /**
     * Gets the value of the inInstallmentInfoLoanInstallmentInfoInstallSubsPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInInstallmentInfoLoanInstallmentInfoInstallSubsPerc() {
        return inInstallmentInfoLoanInstallmentInfoInstallSubsPerc;
    }

    /**
     * Sets the value of the inInstallmentInfoLoanInstallmentInfoInstallSubsPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInInstallmentInfoLoanInstallmentInfoInstallSubsPerc(BigDecimal value) {
        this.inInstallmentInfoLoanInstallmentInfoInstallSubsPerc = value;
    }

    /**
     * Gets the value of the inInstallmentInfoLoanInstallmentInfoMoratoriumEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInInstallmentInfoLoanInstallmentInfoMoratoriumEndDt() {
        return inInstallmentInfoLoanInstallmentInfoMoratoriumEndDt;
    }

    /**
     * Sets the value of the inInstallmentInfoLoanInstallmentInfoMoratoriumEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInInstallmentInfoLoanInstallmentInfoMoratoriumEndDt(XMLGregorianCalendar value) {
        this.inInstallmentInfoLoanInstallmentInfoMoratoriumEndDt = value;
    }

    /**
     * Gets the value of the inInstallmentInfoLoanInstallmentInfoStartingCapitalAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInInstallmentInfoLoanInstallmentInfoStartingCapitalAmn() {
        return inInstallmentInfoLoanInstallmentInfoStartingCapitalAmn;
    }

    /**
     * Sets the value of the inInstallmentInfoLoanInstallmentInfoStartingCapitalAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInInstallmentInfoLoanInstallmentInfoStartingCapitalAmn(BigDecimal value) {
        this.inInstallmentInfoLoanInstallmentInfoStartingCapitalAmn = value;
    }

    /**
     * Gets the value of the inIntLnsInterestDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIntLnsInterestDescription() {
        return inIntLnsInterestDescription;
    }

    /**
     * Sets the value of the inIntLnsInterestDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIntLnsInterestDescription(String value) {
        this.inIntLnsInterestDescription = value;
    }

    /**
     * Gets the value of the inIntLnsInterestIdInterest property.
     * 
     */
    public int getInIntLnsInterestIdInterest() {
        return inIntLnsInterestIdInterest;
    }

    /**
     * Sets the value of the inIntLnsInterestIdInterest property.
     * 
     */
    public void setInIntLnsInterestIdInterest(int value) {
        this.inIntLnsInterestIdInterest = value;
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
     * Gets the value of the inN128InterestLnsInterestDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInN128InterestLnsInterestDescription() {
        return inN128InterestLnsInterestDescription;
    }

    /**
     * Sets the value of the inN128InterestLnsInterestDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInN128InterestLnsInterestDescription(String value) {
        this.inN128InterestLnsInterestDescription = value;
    }

    /**
     * Gets the value of the inN128InterestLnsInterestIdInterest property.
     * 
     */
    public int getInN128InterestLnsInterestIdInterest() {
        return inN128InterestLnsInterestIdInterest;
    }

    /**
     * Sets the value of the inN128InterestLnsInterestIdInterest property.
     * 
     */
    public void setInN128InterestLnsInterestIdInterest(int value) {
        this.inN128InterestLnsInterestIdInterest = value;
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
     * Gets the value of the inRetCustomerCDigit property.
     * 
     */
    public short getInRetCustomerCDigit() {
        return inRetCustomerCDigit;
    }

    /**
     * Sets the value of the inRetCustomerCDigit property.
     * 
     */
    public void setInRetCustomerCDigit(short value) {
        this.inRetCustomerCDigit = value;
    }

    /**
     * Gets the value of the inRetCustomerCustId property.
     * 
     */
    public int getInRetCustomerCustId() {
        return inRetCustomerCustId;
    }

    /**
     * Sets the value of the inRetCustomerCustId property.
     * 
     */
    public void setInRetCustomerCustId(int value) {
        this.inRetCustomerCustId = value;
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
     * Gets the value of the inSubsidySubsidyOrderDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSubsidySubsidyOrderDescription() {
        return inSubsidySubsidyOrderDescription;
    }

    /**
     * Sets the value of the inSubsidySubsidyOrderDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSubsidySubsidyOrderDescription(String value) {
        this.inSubsidySubsidyOrderDescription = value;
    }

    /**
     * Gets the value of the inSubsidySubsidyOrderIdSubsidy property.
     * 
     */
    public int getInSubsidySubsidyOrderIdSubsidy() {
        return inSubsidySubsidyOrderIdSubsidy;
    }

    /**
     * Sets the value of the inSubsidySubsidyOrderIdSubsidy property.
     * 
     */
    public void setInSubsidySubsidyOrderIdSubsidy(int value) {
        this.inSubsidySubsidyOrderIdSubsidy = value;
    }

    /**
     * Gets the value of the tonyInInstall13ThPayIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTonyInInstall13ThPayIefSuppliedChar1() {
        return tonyInInstall13ThPayIefSuppliedChar1;
    }

    /**
     * Sets the value of the tonyInInstall13ThPayIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTonyInInstall13ThPayIefSuppliedChar1(String value) {
        this.tonyInInstall13ThPayIefSuppliedChar1 = value;
    }

    /**
     * Gets the value of the tonyInInstallDoubleIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTonyInInstallDoubleIefSuppliedChar1() {
        return tonyInInstallDoubleIefSuppliedChar1;
    }

    /**
     * Sets the value of the tonyInInstallDoubleIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTonyInInstallDoubleIefSuppliedChar1(String value) {
        this.tonyInInstallDoubleIefSuppliedChar1 = value;
    }

    /**
     * Gets the value of the tonyInInstallNormalIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTonyInInstallNormalIefSuppliedChar1() {
        return tonyInInstallNormalIefSuppliedChar1;
    }

    /**
     * Sets the value of the tonyInInstallNormalIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTonyInInstallNormalIefSuppliedChar1(String value) {
        this.tonyInInstallNormalIefSuppliedChar1 = value;
    }

    /**
     * Gets the value of the tonyInInstallOmitIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTonyInInstallOmitIefSuppliedChar1() {
        return tonyInInstallOmitIefSuppliedChar1;
    }

    /**
     * Sets the value of the tonyInInstallOmitIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTonyInInstallOmitIefSuppliedChar1(String value) {
        this.tonyInInstallOmitIefSuppliedChar1 = value;
    }

    /**
     * Gets the value of the tonyInLoanIntCapitalFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTonyInLoanIntCapitalFlg() {
        return tonyInLoanIntCapitalFlg;
    }

    /**
     * Sets the value of the tonyInLoanIntCapitalFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTonyInLoanIntCapitalFlg(String value) {
        this.tonyInLoanIntCapitalFlg = value;
    }

    /**
     * Gets the value of the tonyInLoanIntPayableFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTonyInLoanIntPayableFlg() {
        return tonyInLoanIntPayableFlg;
    }

    /**
     * Sets the value of the tonyInLoanIntPayableFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTonyInLoanIntPayableFlg(String value) {
        this.tonyInLoanIntPayableFlg = value;
    }

    /**
     * Gets the value of the tonyInLoanLoanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTonyInLoanLoanType() {
        return tonyInLoanLoanType;
    }

    /**
     * Sets the value of the tonyInLoanLoanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTonyInLoanLoanType(String value) {
        this.tonyInLoanLoanType = value;
    }

    /**
     * Gets the value of the tonyInLoanMoratIntPayFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTonyInLoanMoratIntPayFlg() {
        return tonyInLoanMoratIntPayFlg;
    }

    /**
     * Sets the value of the tonyInLoanMoratIntPayFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTonyInLoanMoratIntPayFlg(String value) {
        this.tonyInLoanMoratIntPayFlg = value;
    }

    /**
     * Gets the value of the tonyInLoanNoIntMoratorFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTonyInLoanNoIntMoratorFlg() {
        return tonyInLoanNoIntMoratorFlg;
    }

    /**
     * Sets the value of the tonyInLoanNoIntMoratorFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTonyInLoanNoIntMoratorFlg(String value) {
        this.tonyInLoanNoIntMoratorFlg = value;
    }

    /**
     * Gets the value of the tonyInLoanNonIntCapitFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTonyInLoanNonIntCapitFlg() {
        return tonyInLoanNonIntCapitFlg;
    }

    /**
     * Sets the value of the tonyInLoanNonIntCapitFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTonyInLoanNonIntCapitFlg(String value) {
        this.tonyInLoanNonIntCapitFlg = value;
    }

    /**
     * Gets the value of the tonyInProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTonyInProductDescription() {
        return tonyInProductDescription;
    }

    /**
     * Sets the value of the tonyInProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTonyInProductDescription(String value) {
        this.tonyInProductDescription = value;
    }

    /**
     * Gets the value of the tonyInProductIdProduct property.
     * 
     */
    public int getTonyInProductIdProduct() {
        return tonyInProductIdProduct;
    }

    /**
     * Sets the value of the tonyInProductIdProduct property.
     * 
     */
    public void setTonyInProductIdProduct(int value) {
        this.tonyInProductIdProduct = value;
    }

    /**
     * Gets the value of the tonyInSubsidyPercentageIefSuppliedPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTonyInSubsidyPercentageIefSuppliedPercentage() {
        return tonyInSubsidyPercentageIefSuppliedPercentage;
    }

    /**
     * Sets the value of the tonyInSubsidyPercentageIefSuppliedPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTonyInSubsidyPercentageIefSuppliedPercentage(BigDecimal value) {
        this.tonyInSubsidyPercentageIefSuppliedPercentage = value;
    }

    /**
     * Gets the value of the tonyInTotalGraceInstallIefSuppliedTotalInteger property.
     * 
     */
    public double getTonyInTotalGraceInstallIefSuppliedTotalInteger() {
        return tonyInTotalGraceInstallIefSuppliedTotalInteger;
    }

    /**
     * Sets the value of the tonyInTotalGraceInstallIefSuppliedTotalInteger property.
     * 
     */
    public void setTonyInTotalGraceInstallIefSuppliedTotalInteger(double value) {
        this.tonyInTotalGraceInstallIefSuppliedTotalInteger = value;
    }

    /**
     * Gets the value of the tonyInTotalLoanIefSuppliedTotalInteger property.
     * 
     */
    public double getTonyInTotalLoanIefSuppliedTotalInteger() {
        return tonyInTotalLoanIefSuppliedTotalInteger;
    }

    /**
     * Sets the value of the tonyInTotalLoanIefSuppliedTotalInteger property.
     * 
     */
    public void setTonyInTotalLoanIefSuppliedTotalInteger(double value) {
        this.tonyInTotalLoanIefSuppliedTotalInteger = value;
    }

    /**
     * Gets the value of the inSelectedAgrProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedAgrProfitsAccountAccountNumber() {
        return inSelectedAgrProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inSelectedAgrProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedAgrProfitsAccountAccountNumber(String value) {
        this.inSelectedAgrProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inSelectedAgrProfitsAccountAccountCd property.
     * 
     */
    public short getInSelectedAgrProfitsAccountAccountCd() {
        return inSelectedAgrProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inSelectedAgrProfitsAccountAccountCd property.
     * 
     */
    public void setInSelectedAgrProfitsAccountAccountCd(short value) {
        this.inSelectedAgrProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inSelectedDepProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedDepProfitsAccountAccountNumber() {
        return inSelectedDepProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inSelectedDepProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedDepProfitsAccountAccountNumber(String value) {
        this.inSelectedDepProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inSelectedDepProfitsAccountAccountCd property.
     * 
     */
    public short getInSelectedDepProfitsAccountAccountCd() {
        return inSelectedDepProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inSelectedDepProfitsAccountAccountCd property.
     * 
     */
    public void setInSelectedDepProfitsAccountAccountCd(short value) {
        this.inSelectedDepProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inCategoryGenericDetailSerialNum property.
     * 
     */
    public int getInCategoryGenericDetailSerialNum() {
        return inCategoryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inCategoryGenericDetailSerialNum property.
     * 
     */
    public void setInCategoryGenericDetailSerialNum(int value) {
        this.inCategoryGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inCategoryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCategoryGenericDetailDescription() {
        return inCategoryGenericDetailDescription;
    }

    /**
     * Sets the value of the inCategoryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCategoryGenericDetailDescription(String value) {
        this.inCategoryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inTransactSmLoanAccountInfoTransactInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTransactSmLoanAccountInfoTransactInd() {
        return inTransactSmLoanAccountInfoTransactInd;
    }

    /**
     * Sets the value of the inTransactSmLoanAccountInfoTransactInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTransactSmLoanAccountInfoTransactInd(String value) {
        this.inTransactSmLoanAccountInfoTransactInd = value;
    }

    /**
     * Gets the value of the inTransactSmLoanAccountInfoTransactSm property.
     * 
     */
    public int getInTransactSmLoanAccountInfoTransactSm() {
        return inTransactSmLoanAccountInfoTransactSm;
    }

    /**
     * Sets the value of the inTransactSmLoanAccountInfoTransactSm property.
     * 
     */
    public void setInTransactSmLoanAccountInfoTransactSm(int value) {
        this.inTransactSmLoanAccountInfoTransactSm = value;
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
     * Gets the value of the inGrpDbSelectedInsProds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLna0405VInGrpDbSelectedInsProdsItem }
     *     
     */
    public ArrayOfLna0405VInGrpDbSelectedInsProdsItem getInGrpDbSelectedInsProds() {
        return inGrpDbSelectedInsProds;
    }

    /**
     * Sets the value of the inGrpDbSelectedInsProds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLna0405VInGrpDbSelectedInsProdsItem }
     *     
     */
    public void setInGrpDbSelectedInsProds(ArrayOfLna0405VInGrpDbSelectedInsProdsItem value) {
        this.inGrpDbSelectedInsProds = value;
    }

    /**
     * Gets the value of the inCoinsuredGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLna0405VInCoinsuredGrpItem }
     *     
     */
    public ArrayOfLna0405VInCoinsuredGrpItem getInCoinsuredGrp() {
        return inCoinsuredGrp;
    }

    /**
     * Sets the value of the inCoinsuredGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLna0405VInCoinsuredGrpItem }
     *     
     */
    public void setInCoinsuredGrp(ArrayOfLna0405VInCoinsuredGrpItem value) {
        this.inCoinsuredGrp = value;
    }

    /**
     * Gets the value of the inLoanScenarioDtLoanScenarioDataTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanScenarioDtLoanScenarioDataTmstamp() {
        return inLoanScenarioDtLoanScenarioDataTmstamp;
    }

    /**
     * Sets the value of the inLoanScenarioDtLoanScenarioDataTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanScenarioDtLoanScenarioDataTmstamp(XMLGregorianCalendar value) {
        this.inLoanScenarioDtLoanScenarioDataTmstamp = value;
    }

    /**
     * Gets the value of the inLoanScenarioDtLoanScenarioDataInstallSn property.
     * 
     */
    public double getInLoanScenarioDtLoanScenarioDataInstallSn() {
        return inLoanScenarioDtLoanScenarioDataInstallSn;
    }

    /**
     * Sets the value of the inLoanScenarioDtLoanScenarioDataInstallSn property.
     * 
     */
    public void setInLoanScenarioDtLoanScenarioDataInstallSn(double value) {
        this.inLoanScenarioDtLoanScenarioDataInstallSn = value;
    }

    /**
     * Gets the value of the inInitLoanScenarioDataTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInInitLoanScenarioDataTmstamp() {
        return inInitLoanScenarioDataTmstamp;
    }

    /**
     * Sets the value of the inInitLoanScenarioDataTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInInitLoanScenarioDataTmstamp(XMLGregorianCalendar value) {
        this.inInitLoanScenarioDataTmstamp = value;
    }

    /**
     * Gets the value of the inInitLoanScenarioDataInstallSn property.
     * 
     */
    public double getInInitLoanScenarioDataInstallSn() {
        return inInitLoanScenarioDataInstallSn;
    }

    /**
     * Sets the value of the inInitLoanScenarioDataInstallSn property.
     * 
     */
    public void setInInitLoanScenarioDataInstallSn(double value) {
        this.inInitLoanScenarioDataInstallSn = value;
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
     * Gets the value of the inCbpurpGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCbpurpGenericDetailDescription() {
        return inCbpurpGenericDetailDescription;
    }

    /**
     * Sets the value of the inCbpurpGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCbpurpGenericDetailDescription(String value) {
        this.inCbpurpGenericDetailDescription = value;
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
     * Gets the value of the inBankSectorGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBankSectorGenericDetailDescription() {
        return inBankSectorGenericDetailDescription;
    }

    /**
     * Sets the value of the inBankSectorGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBankSectorGenericDetailDescription(String value) {
        this.inBankSectorGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inPurposeGenericDetailSerialNum property.
     * 
     */
    public int getInPurposeGenericDetailSerialNum() {
        return inPurposeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inPurposeGenericDetailSerialNum property.
     * 
     */
    public void setInPurposeGenericDetailSerialNum(int value) {
        this.inPurposeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inPurposeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPurposeGenericDetailDescription() {
        return inPurposeGenericDetailDescription;
    }

    /**
     * Sets the value of the inPurposeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPurposeGenericDetailDescription(String value) {
        this.inPurposeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inActivitySectionGenericDetailSerialNum property.
     * 
     */
    public int getInActivitySectionGenericDetailSerialNum() {
        return inActivitySectionGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inActivitySectionGenericDetailSerialNum property.
     * 
     */
    public void setInActivitySectionGenericDetailSerialNum(int value) {
        this.inActivitySectionGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inActivitySectionGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInActivitySectionGenericDetailDescription() {
        return inActivitySectionGenericDetailDescription;
    }

    /**
     * Sets the value of the inActivitySectionGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInActivitySectionGenericDetailDescription(String value) {
        this.inActivitySectionGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inEconomicSectionGenericDetailSerialNum property.
     * 
     */
    public int getInEconomicSectionGenericDetailSerialNum() {
        return inEconomicSectionGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inEconomicSectionGenericDetailSerialNum property.
     * 
     */
    public void setInEconomicSectionGenericDetailSerialNum(int value) {
        this.inEconomicSectionGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inEconomicSectionGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEconomicSectionGenericDetailDescription() {
        return inEconomicSectionGenericDetailDescription;
    }

    /**
     * Sets the value of the inEconomicSectionGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEconomicSectionGenericDetailDescription(String value) {
        this.inEconomicSectionGenericDetailDescription = value;
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
     * Gets the value of the inApplicationDataLoanScenarioDataApplicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInApplicationDataLoanScenarioDataApplicationId() {
        return inApplicationDataLoanScenarioDataApplicationId;
    }

    /**
     * Sets the value of the inApplicationDataLoanScenarioDataApplicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInApplicationDataLoanScenarioDataApplicationId(String value) {
        this.inApplicationDataLoanScenarioDataApplicationId = value;
    }

    /**
     * Gets the value of the inApplicationDataLoanScenarioDataApplicationSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInApplicationDataLoanScenarioDataApplicationSts() {
        return inApplicationDataLoanScenarioDataApplicationSts;
    }

    /**
     * Sets the value of the inApplicationDataLoanScenarioDataApplicationSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInApplicationDataLoanScenarioDataApplicationSts(String value) {
        this.inApplicationDataLoanScenarioDataApplicationSts = value;
    }

    /**
     * Gets the value of the inSalePersonGenericDetailSerialNum property.
     * 
     */
    public int getInSalePersonGenericDetailSerialNum() {
        return inSalePersonGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inSalePersonGenericDetailSerialNum property.
     * 
     */
    public void setInSalePersonGenericDetailSerialNum(int value) {
        this.inSalePersonGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inSalePersonGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSalePersonGenericDetailDescription() {
        return inSalePersonGenericDetailDescription;
    }

    /**
     * Sets the value of the inSalePersonGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSalePersonGenericDetailDescription(String value) {
        this.inSalePersonGenericDetailDescription = value;
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
     * Gets the value of the inSaleUnitGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSaleUnitGenericDetailDescription() {
        return inSaleUnitGenericDetailDescription;
    }

    /**
     * Sets the value of the inSaleUnitGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSaleUnitGenericDetailDescription(String value) {
        this.inSaleUnitGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inGrpMediators property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLna0405VInGrpMediatorsItem }
     *     
     */
    public ArrayOfLna0405VInGrpMediatorsItem getInGrpMediators() {
        return inGrpMediators;
    }

    /**
     * Sets the value of the inGrpMediators property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLna0405VInGrpMediatorsItem }
     *     
     */
    public void setInGrpMediators(ArrayOfLna0405VInGrpMediatorsItem value) {
        this.inGrpMediators = value;
    }

    /**
     * Gets the value of the inPenaltyIdLnsInterestIdInterest property.
     * 
     */
    public int getInPenaltyIdLnsInterestIdInterest() {
        return inPenaltyIdLnsInterestIdInterest;
    }

    /**
     * Sets the value of the inPenaltyIdLnsInterestIdInterest property.
     * 
     */
    public void setInPenaltyIdLnsInterestIdInterest(int value) {
        this.inPenaltyIdLnsInterestIdInterest = value;
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
