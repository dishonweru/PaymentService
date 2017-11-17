
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RepaymentScheduleScenarioExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RepaymentScheduleScenarioExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutEnoikiagoraTokoiIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpGrace" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpGraceItem" minOccurs="0"/>
 *         &lt;element name="OutGrpInstallmentSchedule" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpInstallmentScheduleItem" minOccurs="0"/>
 *         &lt;element name="OutLoanInterDaysInst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanM6PeriodNrmint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanMaxGracePrdFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanMinGracePrdFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountAccDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountAccExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountAccLimitAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountAccMechanism" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountAccOpenDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountAccSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoanAccountAccSpcAgrFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountAccTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountAtmCardFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountCurFxIntExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountCurFxIntInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountCurFxIntScalDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountCurFxIntStDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountCusStmLstTrnDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountCusStmNxtTrnDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoanAccountDepAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountDepAccSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutLoanAccountDepAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountDepAccUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoanAccountDrawdownExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountDrawdownFstAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountDrawdownFstDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountExcmptPnlPrdCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountExcmptPnlPrdNo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountFixedIntRenewDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountGuaranteePerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountInstallChgNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountInstallCount" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountInstallFirstDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountInstallFreq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountInstallMechFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountInstallNextDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountInstallPrevDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountInstallSkipCap" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountInstallSkipInt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountIntCalcStopFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountInterCapitalizeFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountInterRateSprd" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountLastNrmTrxCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountLoanStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountLstAccrCalcDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountLstAprIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountLstAprYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountLstAugIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountLstAugYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountLstDecIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountLstDecYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountLstFebIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountLstFebYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountLstIntCalcDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountLstJanIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountLstJanYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountLstJulIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountLstJulYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountLstJunIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountLstJunYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountLstMarIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountLstMarYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountLstMayIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountLstMayYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountLstNovIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountLstNovYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountLstOctIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountLstOctYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountLstSepIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountLstSepYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountLstTrxDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountLumpDrawdownFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountMainBenefCategor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoanAccountMoratorN128Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountMoratorNrmRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountMoratorSprRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountMoratorSubsRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountMpStartCapAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountNrAcrPubIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountNrUrlPubIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountNrmAcrIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountNrmCapBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountNrmChrgCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountNrmComBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountNrmExpBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountNrmInstCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountNrmIntCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountNrmLoanCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountNrmRlIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountNrmSubsidyBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountNrmUrlIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountOldAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountOldAccountNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountOvAcrNrmIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountOvAcrPnlIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountOvAcrPubIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountOvCapBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountOvChrgCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountOvComBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountOvExpBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountOvExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountOvExpExtFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountOvInstCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountOvIntCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountOvLoanCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountOvRlNrmIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountOvRlPnlIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountOvSubsidyBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountOvUrlNrmIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountOvUrlPnlIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountOvUrlPubIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountPrvFxIntExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountPrvFxIntScalDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountPrvFxIntStDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountRecyclingFrequency" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountRecyclingFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountRecyclingLmtFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountReqExpSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountReqInstallSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountReqIntSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountReqLoanSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountSpreadEndDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountSpreadFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountStatementFreq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountSubsidyDuration" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountSubsidyEndFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountSubsidyExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountSubsidyLimitAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountSubsidyStartDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountToleranceDays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountTotCapAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountTotComInCcAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountTotCommissionAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountTotConfirmAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountTotDrawdownAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountTotExpInCcAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountTotExpenseAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountTotIntSprdAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountTotNrmIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountTotPnlIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountTotPubCommAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountTotSubsIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountTotThrdprtAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoanAccountUnpaidCollCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountUnrealizedFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountVillageSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoanParametersGetLoanInterest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanParametersM4ApproachMeth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanParametersServerRepAppr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanStepIntInstallmentWorkFirstInstallmentIntAnm" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanStepIntInstallmentWorkStep" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutMech4InstChgFlgLoanInstallmentMechanismInstallChgFlg" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutMech4InstChgFlgLoanInstallmentMechanismInstallChgNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutMech4InstChgFlgLoanInstallmentMechanismInstallMechFlg" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutMech4InstChgFlgLoanInstallmentMechanismInstallNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutMech4InstChgFlgLoanInstallmentMechanismInstallSkipCap" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutMech4InstChgFlgLoanInstallmentMechanismInstallSkipInt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutMech4InstChgFlgLoanInstallmentMechanismInstallTot" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutMonthCharSuppliedChar20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutN128InterestLnsInterestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutN128InterestLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutN128InterestSupplyWorkFixedInterestPrc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSepeLoanInstallmentInfoInstallDbIntPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotalsLoanInstallmentInfoInstallCapAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotalsLoanInstallmentInfoInstallEfteAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotalsLoanInstallmentInfoInstallInsurance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotalsLoanInstallmentInfoInstallIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotalsLoanInstallmentInfoInstallN128Amn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotalsLoanInstallmentInfoInstallSpreadAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotalsLoanInstallmentInfoInstallSubsidyAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotalsLoanInstallmentInfoInstallmentAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotalsLoanInstallmentInfoRemainingCapitalAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotalsLoanInstallmentInfoTotalChargeAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotalsLoanInstallmentInfoTotalInsuranceAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotalsLoanInstallmentInfoTotalIntPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotalsLoanInstallmentInfoTotalRoundingAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TonyOutGracePeriodTotalLoanInstallmentInfoStartingCapitalAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotalLoanIefSuppliedTotalInteger" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutTotalsLoanInstallmentInfoInstallComAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepaymentScheduleScenarioExport", propOrder = {
    "outEnoikiagoraTokoiIefSuppliedNumber152",
    "outGrpGrace",
    "outGrpInstallmentSchedule",
    "outLoanInterDaysInst",
    "outLoanM6PeriodNrmint",
    "outLoanMaxGracePrdFrq",
    "outLoanMinGracePrdFrq",
    "outLoanAccountAccCd",
    "outLoanAccountAccDescription",
    "outLoanAccountAccExpDt",
    "outLoanAccountAccLimitAmn",
    "outLoanAccountAccMechanism",
    "outLoanAccountAccOpenDt",
    "outLoanAccountAccSn",
    "outLoanAccountAccSpcAgrFlg",
    "outLoanAccountAccStatus",
    "outLoanAccountAccTerms",
    "outLoanAccountAccType",
    "outLoanAccountAtmCardFlag",
    "outLoanAccountCurFxIntExpDt",
    "outLoanAccountCurFxIntInd",
    "outLoanAccountCurFxIntScalDt",
    "outLoanAccountCurFxIntStDt",
    "outLoanAccountCusStmLstTrnDt",
    "outLoanAccountCusStmNxtTrnDt",
    "outLoanAccountCustId",
    "outLoanAccountDepAccCd",
    "outLoanAccountDepAccSn",
    "outLoanAccountDepAccType",
    "outLoanAccountDepAccUnit",
    "outLoanAccountDrawdownExpDt",
    "outLoanAccountDrawdownFstAmn",
    "outLoanAccountDrawdownFstDt",
    "outLoanAccountExcmptPnlPrdCnt",
    "outLoanAccountExcmptPnlPrdNo",
    "outLoanAccountFixedIntRenewDt",
    "outLoanAccountGuaranteePerc",
    "outLoanAccountInstallChgNum",
    "outLoanAccountInstallCount",
    "outLoanAccountInstallFirstDt",
    "outLoanAccountInstallFreq",
    "outLoanAccountInstallMechFlg",
    "outLoanAccountInstallNextDt",
    "outLoanAccountInstallPrevDt",
    "outLoanAccountInstallSkipCap",
    "outLoanAccountInstallSkipInt",
    "outLoanAccountIntCalcStopFlg",
    "outLoanAccountInterCapitalizeFlg",
    "outLoanAccountInterRateSprd",
    "outLoanAccountLastNrmTrxCnt",
    "outLoanAccountLoanStatus",
    "outLoanAccountLstAccrCalcDt",
    "outLoanAccountLstAprIntDbAmn",
    "outLoanAccountLstAprYear",
    "outLoanAccountLstAugIntDbAmn",
    "outLoanAccountLstAugYear",
    "outLoanAccountLstDecIntDbAmn",
    "outLoanAccountLstDecYear",
    "outLoanAccountLstFebIntDbAmn",
    "outLoanAccountLstFebYear",
    "outLoanAccountLstIntCalcDt",
    "outLoanAccountLstJanIntDbAmn",
    "outLoanAccountLstJanYear",
    "outLoanAccountLstJulIntDbAmn",
    "outLoanAccountLstJulYear",
    "outLoanAccountLstJunIntDbAmn",
    "outLoanAccountLstJunYear",
    "outLoanAccountLstMarIntDbAmn",
    "outLoanAccountLstMarYear",
    "outLoanAccountLstMayIntDbAmn",
    "outLoanAccountLstMayYear",
    "outLoanAccountLstNovIntDbAmn",
    "outLoanAccountLstNovYear",
    "outLoanAccountLstOctIntDbAmn",
    "outLoanAccountLstOctYear",
    "outLoanAccountLstSepIntDbAmn",
    "outLoanAccountLstSepYear",
    "outLoanAccountLstTrxDt",
    "outLoanAccountLumpDrawdownFlg",
    "outLoanAccountMainBenefCategor",
    "outLoanAccountMoratorN128Rate",
    "outLoanAccountMoratorNrmRate",
    "outLoanAccountMoratorSprRate",
    "outLoanAccountMoratorSubsRate",
    "outLoanAccountMpStartCapAmn",
    "outLoanAccountNrAcrPubIntAmn",
    "outLoanAccountNrUrlPubIntAmn",
    "outLoanAccountNrmAcrIntBal",
    "outLoanAccountNrmCapBal",
    "outLoanAccountNrmChrgCnt",
    "outLoanAccountNrmComBal",
    "outLoanAccountNrmExpBal",
    "outLoanAccountNrmInstCnt",
    "outLoanAccountNrmIntCnt",
    "outLoanAccountNrmLoanCnt",
    "outLoanAccountNrmRlIntBal",
    "outLoanAccountNrmSubsidyBal",
    "outLoanAccountNrmUrlIntBal",
    "outLoanAccountOldAccountCd",
    "outLoanAccountOldAccountNum",
    "outLoanAccountOvAcrNrmIntBal",
    "outLoanAccountOvAcrPnlIntBal",
    "outLoanAccountOvAcrPubIntAmn",
    "outLoanAccountOvCapBal",
    "outLoanAccountOvChrgCnt",
    "outLoanAccountOvComBal",
    "outLoanAccountOvExpBal",
    "outLoanAccountOvExpDt",
    "outLoanAccountOvExpExtFlg",
    "outLoanAccountOvInstCnt",
    "outLoanAccountOvIntCnt",
    "outLoanAccountOvLoanCnt",
    "outLoanAccountOvRlNrmIntBal",
    "outLoanAccountOvRlPnlIntBal",
    "outLoanAccountOvSubsidyBal",
    "outLoanAccountOvUrlNrmIntBal",
    "outLoanAccountOvUrlPnlIntBal",
    "outLoanAccountOvUrlPubIntAmn",
    "outLoanAccountPrvFxIntExpDt",
    "outLoanAccountPrvFxIntScalDt",
    "outLoanAccountPrvFxIntStDt",
    "outLoanAccountRecyclingFrequency",
    "outLoanAccountRecyclingFrq",
    "outLoanAccountRecyclingLmtFlg",
    "outLoanAccountReqExpSn",
    "outLoanAccountReqInstallSn",
    "outLoanAccountReqIntSn",
    "outLoanAccountReqLoanSn",
    "outLoanAccountShortName",
    "outLoanAccountSpreadEndDt",
    "outLoanAccountSpreadFlg",
    "outLoanAccountStatementFreq",
    "outLoanAccountSubsidyDuration",
    "outLoanAccountSubsidyEndFlg",
    "outLoanAccountSubsidyExpDt",
    "outLoanAccountSubsidyLimitAmn",
    "outLoanAccountSubsidyStartDt",
    "outLoanAccountTmstamp",
    "outLoanAccountToleranceDays",
    "outLoanAccountTotCapAmn",
    "outLoanAccountTotComInCcAmn",
    "outLoanAccountTotCommissionAmn",
    "outLoanAccountTotConfirmAmn",
    "outLoanAccountTotDrawdownAmn",
    "outLoanAccountTotExpInCcAmn",
    "outLoanAccountTotExpenseAmn",
    "outLoanAccountTotIntSprdAmn",
    "outLoanAccountTotNrmIntAmn",
    "outLoanAccountTotPnlIntAmn",
    "outLoanAccountTotPubCommAmn",
    "outLoanAccountTotSubsIntAmn",
    "outLoanAccountTotThrdprtAmn",
    "outLoanAccountUnit",
    "outLoanAccountUnpaidCollCnt",
    "outLoanAccountUnrealizedFlg",
    "outLoanAccountUsr",
    "outLoanAccountVillageSn",
    "outLoanParametersGetLoanInterest",
    "outLoanParametersM4ApproachMeth",
    "outLoanParametersServerRepAppr",
    "outLoanStepIntInstallmentWorkFirstInstallmentIntAnm",
    "outLoanStepIntInstallmentWorkStep",
    "outMech4InstChgFlgLoanInstallmentMechanismInstallChgFlg",
    "outMech4InstChgFlgLoanInstallmentMechanismInstallChgNum",
    "outMech4InstChgFlgLoanInstallmentMechanismInstallMechFlg",
    "outMech4InstChgFlgLoanInstallmentMechanismInstallNum",
    "outMech4InstChgFlgLoanInstallmentMechanismInstallSkipCap",
    "outMech4InstChgFlgLoanInstallmentMechanismInstallSkipInt",
    "outMech4InstChgFlgLoanInstallmentMechanismInstallTot",
    "outMonthCharSuppliedChar20",
    "outN128InterestLnsInterestDescription",
    "outN128InterestLnsInterestIdInterest",
    "outN128InterestSupplyWorkFixedInterestPrc",
    "outSepeLoanInstallmentInfoInstallDbIntPerc",
    "outTotalsLoanInstallmentInfoInstallCapAmn",
    "outTotalsLoanInstallmentInfoInstallEfteAmn",
    "outTotalsLoanInstallmentInfoInstallInsurance",
    "outTotalsLoanInstallmentInfoInstallIntAmn",
    "outTotalsLoanInstallmentInfoInstallN128Amn",
    "outTotalsLoanInstallmentInfoInstallSpreadAmn",
    "outTotalsLoanInstallmentInfoInstallSubsidyAmn",
    "outTotalsLoanInstallmentInfoInstallmentAmn",
    "outTotalsLoanInstallmentInfoRemainingCapitalAmn",
    "outTotalsLoanInstallmentInfoTotalChargeAmn",
    "outTotalsLoanInstallmentInfoTotalInsuranceAmn",
    "outTotalsLoanInstallmentInfoTotalIntPerc",
    "outTotalsLoanInstallmentInfoTotalRoundingAmn",
    "tonyOutGracePeriodTotalLoanInstallmentInfoStartingCapitalAmn",
    "outTotalLoanIefSuppliedTotalInteger",
    "outTotalsLoanInstallmentInfoInstallComAmn"
})
public class RepaymentScheduleScenarioExport
    extends BaseExport
{

    @XmlElement(name = "OutEnoikiagoraTokoiIefSuppliedNumber152", required = true)
    protected BigDecimal outEnoikiagoraTokoiIefSuppliedNumber152;
    @XmlElement(name = "OutGrpGrace")
    protected ArrayOfOutGrpGraceItem outGrpGrace;
    @XmlElement(name = "OutGrpInstallmentSchedule")
    protected ArrayOfOutGrpInstallmentScheduleItem outGrpInstallmentSchedule;
    @XmlElement(name = "OutLoanInterDaysInst")
    protected String outLoanInterDaysInst;
    @XmlElement(name = "OutLoanM6PeriodNrmint")
    protected String outLoanM6PeriodNrmint;
    @XmlElement(name = "OutLoanMaxGracePrdFrq")
    protected short outLoanMaxGracePrdFrq;
    @XmlElement(name = "OutLoanMinGracePrdFrq")
    protected short outLoanMinGracePrdFrq;
    @XmlElement(name = "OutLoanAccountAccCd")
    protected short outLoanAccountAccCd;
    @XmlElement(name = "OutLoanAccountAccDescription")
    protected String outLoanAccountAccDescription;
    @XmlElement(name = "OutLoanAccountAccExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountAccExpDt;
    @XmlElement(name = "OutLoanAccountAccLimitAmn", required = true)
    protected BigDecimal outLoanAccountAccLimitAmn;
    @XmlElement(name = "OutLoanAccountAccMechanism")
    protected String outLoanAccountAccMechanism;
    @XmlElement(name = "OutLoanAccountAccOpenDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountAccOpenDt;
    @XmlElement(name = "OutLoanAccountAccSn")
    protected int outLoanAccountAccSn;
    @XmlElement(name = "OutLoanAccountAccSpcAgrFlg")
    protected String outLoanAccountAccSpcAgrFlg;
    @XmlElement(name = "OutLoanAccountAccStatus")
    protected String outLoanAccountAccStatus;
    @XmlElement(name = "OutLoanAccountAccTerms")
    protected String outLoanAccountAccTerms;
    @XmlElement(name = "OutLoanAccountAccType")
    protected short outLoanAccountAccType;
    @XmlElement(name = "OutLoanAccountAtmCardFlag")
    protected String outLoanAccountAtmCardFlag;
    @XmlElement(name = "OutLoanAccountCurFxIntExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountCurFxIntExpDt;
    @XmlElement(name = "OutLoanAccountCurFxIntInd")
    protected String outLoanAccountCurFxIntInd;
    @XmlElement(name = "OutLoanAccountCurFxIntScalDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountCurFxIntScalDt;
    @XmlElement(name = "OutLoanAccountCurFxIntStDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountCurFxIntStDt;
    @XmlElement(name = "OutLoanAccountCusStmLstTrnDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountCusStmLstTrnDt;
    @XmlElement(name = "OutLoanAccountCusStmNxtTrnDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountCusStmNxtTrnDt;
    @XmlElement(name = "OutLoanAccountCustId")
    protected int outLoanAccountCustId;
    @XmlElement(name = "OutLoanAccountDepAccCd")
    protected short outLoanAccountDepAccCd;
    @XmlElement(name = "OutLoanAccountDepAccSn")
    protected double outLoanAccountDepAccSn;
    @XmlElement(name = "OutLoanAccountDepAccType")
    protected short outLoanAccountDepAccType;
    @XmlElement(name = "OutLoanAccountDepAccUnit")
    protected int outLoanAccountDepAccUnit;
    @XmlElement(name = "OutLoanAccountDrawdownExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountDrawdownExpDt;
    @XmlElement(name = "OutLoanAccountDrawdownFstAmn", required = true)
    protected BigDecimal outLoanAccountDrawdownFstAmn;
    @XmlElement(name = "OutLoanAccountDrawdownFstDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountDrawdownFstDt;
    @XmlElement(name = "OutLoanAccountExcmptPnlPrdCnt")
    protected short outLoanAccountExcmptPnlPrdCnt;
    @XmlElement(name = "OutLoanAccountExcmptPnlPrdNo")
    protected short outLoanAccountExcmptPnlPrdNo;
    @XmlElement(name = "OutLoanAccountFixedIntRenewDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountFixedIntRenewDt;
    @XmlElement(name = "OutLoanAccountGuaranteePerc", required = true)
    protected BigDecimal outLoanAccountGuaranteePerc;
    @XmlElement(name = "OutLoanAccountInstallChgNum")
    protected short outLoanAccountInstallChgNum;
    @XmlElement(name = "OutLoanAccountInstallCount")
    protected short outLoanAccountInstallCount;
    @XmlElement(name = "OutLoanAccountInstallFirstDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountInstallFirstDt;
    @XmlElement(name = "OutLoanAccountInstallFreq")
    protected short outLoanAccountInstallFreq;
    @XmlElement(name = "OutLoanAccountInstallMechFlg")
    protected String outLoanAccountInstallMechFlg;
    @XmlElement(name = "OutLoanAccountInstallNextDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountInstallNextDt;
    @XmlElement(name = "OutLoanAccountInstallPrevDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountInstallPrevDt;
    @XmlElement(name = "OutLoanAccountInstallSkipCap", required = true)
    protected BigDecimal outLoanAccountInstallSkipCap;
    @XmlElement(name = "OutLoanAccountInstallSkipInt", required = true)
    protected BigDecimal outLoanAccountInstallSkipInt;
    @XmlElement(name = "OutLoanAccountIntCalcStopFlg")
    protected String outLoanAccountIntCalcStopFlg;
    @XmlElement(name = "OutLoanAccountInterCapitalizeFlg")
    protected String outLoanAccountInterCapitalizeFlg;
    @XmlElement(name = "OutLoanAccountInterRateSprd", required = true)
    protected BigDecimal outLoanAccountInterRateSprd;
    @XmlElement(name = "OutLoanAccountLastNrmTrxCnt")
    protected short outLoanAccountLastNrmTrxCnt;
    @XmlElement(name = "OutLoanAccountLoanStatus")
    protected String outLoanAccountLoanStatus;
    @XmlElement(name = "OutLoanAccountLstAccrCalcDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountLstAccrCalcDt;
    @XmlElement(name = "OutLoanAccountLstAprIntDbAmn", required = true)
    protected BigDecimal outLoanAccountLstAprIntDbAmn;
    @XmlElement(name = "OutLoanAccountLstAprYear")
    protected short outLoanAccountLstAprYear;
    @XmlElement(name = "OutLoanAccountLstAugIntDbAmn", required = true)
    protected BigDecimal outLoanAccountLstAugIntDbAmn;
    @XmlElement(name = "OutLoanAccountLstAugYear")
    protected short outLoanAccountLstAugYear;
    @XmlElement(name = "OutLoanAccountLstDecIntDbAmn", required = true)
    protected BigDecimal outLoanAccountLstDecIntDbAmn;
    @XmlElement(name = "OutLoanAccountLstDecYear")
    protected short outLoanAccountLstDecYear;
    @XmlElement(name = "OutLoanAccountLstFebIntDbAmn", required = true)
    protected BigDecimal outLoanAccountLstFebIntDbAmn;
    @XmlElement(name = "OutLoanAccountLstFebYear")
    protected short outLoanAccountLstFebYear;
    @XmlElement(name = "OutLoanAccountLstIntCalcDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountLstIntCalcDt;
    @XmlElement(name = "OutLoanAccountLstJanIntDbAmn", required = true)
    protected BigDecimal outLoanAccountLstJanIntDbAmn;
    @XmlElement(name = "OutLoanAccountLstJanYear")
    protected short outLoanAccountLstJanYear;
    @XmlElement(name = "OutLoanAccountLstJulIntDbAmn", required = true)
    protected BigDecimal outLoanAccountLstJulIntDbAmn;
    @XmlElement(name = "OutLoanAccountLstJulYear")
    protected short outLoanAccountLstJulYear;
    @XmlElement(name = "OutLoanAccountLstJunIntDbAmn", required = true)
    protected BigDecimal outLoanAccountLstJunIntDbAmn;
    @XmlElement(name = "OutLoanAccountLstJunYear")
    protected short outLoanAccountLstJunYear;
    @XmlElement(name = "OutLoanAccountLstMarIntDbAmn", required = true)
    protected BigDecimal outLoanAccountLstMarIntDbAmn;
    @XmlElement(name = "OutLoanAccountLstMarYear")
    protected short outLoanAccountLstMarYear;
    @XmlElement(name = "OutLoanAccountLstMayIntDbAmn", required = true)
    protected BigDecimal outLoanAccountLstMayIntDbAmn;
    @XmlElement(name = "OutLoanAccountLstMayYear")
    protected short outLoanAccountLstMayYear;
    @XmlElement(name = "OutLoanAccountLstNovIntDbAmn", required = true)
    protected BigDecimal outLoanAccountLstNovIntDbAmn;
    @XmlElement(name = "OutLoanAccountLstNovYear")
    protected short outLoanAccountLstNovYear;
    @XmlElement(name = "OutLoanAccountLstOctIntDbAmn", required = true)
    protected BigDecimal outLoanAccountLstOctIntDbAmn;
    @XmlElement(name = "OutLoanAccountLstOctYear")
    protected short outLoanAccountLstOctYear;
    @XmlElement(name = "OutLoanAccountLstSepIntDbAmn", required = true)
    protected BigDecimal outLoanAccountLstSepIntDbAmn;
    @XmlElement(name = "OutLoanAccountLstSepYear")
    protected short outLoanAccountLstSepYear;
    @XmlElement(name = "OutLoanAccountLstTrxDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountLstTrxDt;
    @XmlElement(name = "OutLoanAccountLumpDrawdownFlg")
    protected String outLoanAccountLumpDrawdownFlg;
    @XmlElement(name = "OutLoanAccountMainBenefCategor")
    protected int outLoanAccountMainBenefCategor;
    @XmlElement(name = "OutLoanAccountMoratorN128Rate", required = true)
    protected BigDecimal outLoanAccountMoratorN128Rate;
    @XmlElement(name = "OutLoanAccountMoratorNrmRate", required = true)
    protected BigDecimal outLoanAccountMoratorNrmRate;
    @XmlElement(name = "OutLoanAccountMoratorSprRate", required = true)
    protected BigDecimal outLoanAccountMoratorSprRate;
    @XmlElement(name = "OutLoanAccountMoratorSubsRate", required = true)
    protected BigDecimal outLoanAccountMoratorSubsRate;
    @XmlElement(name = "OutLoanAccountMpStartCapAmn", required = true)
    protected BigDecimal outLoanAccountMpStartCapAmn;
    @XmlElement(name = "OutLoanAccountNrAcrPubIntAmn", required = true)
    protected BigDecimal outLoanAccountNrAcrPubIntAmn;
    @XmlElement(name = "OutLoanAccountNrUrlPubIntAmn", required = true)
    protected BigDecimal outLoanAccountNrUrlPubIntAmn;
    @XmlElement(name = "OutLoanAccountNrmAcrIntBal", required = true)
    protected BigDecimal outLoanAccountNrmAcrIntBal;
    @XmlElement(name = "OutLoanAccountNrmCapBal", required = true)
    protected BigDecimal outLoanAccountNrmCapBal;
    @XmlElement(name = "OutLoanAccountNrmChrgCnt")
    protected short outLoanAccountNrmChrgCnt;
    @XmlElement(name = "OutLoanAccountNrmComBal", required = true)
    protected BigDecimal outLoanAccountNrmComBal;
    @XmlElement(name = "OutLoanAccountNrmExpBal", required = true)
    protected BigDecimal outLoanAccountNrmExpBal;
    @XmlElement(name = "OutLoanAccountNrmInstCnt")
    protected short outLoanAccountNrmInstCnt;
    @XmlElement(name = "OutLoanAccountNrmIntCnt")
    protected short outLoanAccountNrmIntCnt;
    @XmlElement(name = "OutLoanAccountNrmLoanCnt")
    protected short outLoanAccountNrmLoanCnt;
    @XmlElement(name = "OutLoanAccountNrmRlIntBal", required = true)
    protected BigDecimal outLoanAccountNrmRlIntBal;
    @XmlElement(name = "OutLoanAccountNrmSubsidyBal", required = true)
    protected BigDecimal outLoanAccountNrmSubsidyBal;
    @XmlElement(name = "OutLoanAccountNrmUrlIntBal", required = true)
    protected BigDecimal outLoanAccountNrmUrlIntBal;
    @XmlElement(name = "OutLoanAccountOldAccountCd")
    protected short outLoanAccountOldAccountCd;
    @XmlElement(name = "OutLoanAccountOldAccountNum")
    protected String outLoanAccountOldAccountNum;
    @XmlElement(name = "OutLoanAccountOvAcrNrmIntBal", required = true)
    protected BigDecimal outLoanAccountOvAcrNrmIntBal;
    @XmlElement(name = "OutLoanAccountOvAcrPnlIntBal", required = true)
    protected BigDecimal outLoanAccountOvAcrPnlIntBal;
    @XmlElement(name = "OutLoanAccountOvAcrPubIntAmn", required = true)
    protected BigDecimal outLoanAccountOvAcrPubIntAmn;
    @XmlElement(name = "OutLoanAccountOvCapBal", required = true)
    protected BigDecimal outLoanAccountOvCapBal;
    @XmlElement(name = "OutLoanAccountOvChrgCnt")
    protected short outLoanAccountOvChrgCnt;
    @XmlElement(name = "OutLoanAccountOvComBal", required = true)
    protected BigDecimal outLoanAccountOvComBal;
    @XmlElement(name = "OutLoanAccountOvExpBal", required = true)
    protected BigDecimal outLoanAccountOvExpBal;
    @XmlElement(name = "OutLoanAccountOvExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountOvExpDt;
    @XmlElement(name = "OutLoanAccountOvExpExtFlg")
    protected String outLoanAccountOvExpExtFlg;
    @XmlElement(name = "OutLoanAccountOvInstCnt")
    protected short outLoanAccountOvInstCnt;
    @XmlElement(name = "OutLoanAccountOvIntCnt")
    protected short outLoanAccountOvIntCnt;
    @XmlElement(name = "OutLoanAccountOvLoanCnt")
    protected short outLoanAccountOvLoanCnt;
    @XmlElement(name = "OutLoanAccountOvRlNrmIntBal", required = true)
    protected BigDecimal outLoanAccountOvRlNrmIntBal;
    @XmlElement(name = "OutLoanAccountOvRlPnlIntBal", required = true)
    protected BigDecimal outLoanAccountOvRlPnlIntBal;
    @XmlElement(name = "OutLoanAccountOvSubsidyBal", required = true)
    protected BigDecimal outLoanAccountOvSubsidyBal;
    @XmlElement(name = "OutLoanAccountOvUrlNrmIntBal", required = true)
    protected BigDecimal outLoanAccountOvUrlNrmIntBal;
    @XmlElement(name = "OutLoanAccountOvUrlPnlIntBal", required = true)
    protected BigDecimal outLoanAccountOvUrlPnlIntBal;
    @XmlElement(name = "OutLoanAccountOvUrlPubIntAmn", required = true)
    protected BigDecimal outLoanAccountOvUrlPubIntAmn;
    @XmlElement(name = "OutLoanAccountPrvFxIntExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountPrvFxIntExpDt;
    @XmlElement(name = "OutLoanAccountPrvFxIntScalDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountPrvFxIntScalDt;
    @XmlElement(name = "OutLoanAccountPrvFxIntStDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountPrvFxIntStDt;
    @XmlElement(name = "OutLoanAccountRecyclingFrequency")
    protected short outLoanAccountRecyclingFrequency;
    @XmlElement(name = "OutLoanAccountRecyclingFrq")
    protected short outLoanAccountRecyclingFrq;
    @XmlElement(name = "OutLoanAccountRecyclingLmtFlg")
    protected String outLoanAccountRecyclingLmtFlg;
    @XmlElement(name = "OutLoanAccountReqExpSn")
    protected short outLoanAccountReqExpSn;
    @XmlElement(name = "OutLoanAccountReqInstallSn")
    protected short outLoanAccountReqInstallSn;
    @XmlElement(name = "OutLoanAccountReqIntSn")
    protected short outLoanAccountReqIntSn;
    @XmlElement(name = "OutLoanAccountReqLoanSn")
    protected short outLoanAccountReqLoanSn;
    @XmlElement(name = "OutLoanAccountShortName")
    protected String outLoanAccountShortName;
    @XmlElement(name = "OutLoanAccountSpreadEndDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountSpreadEndDt;
    @XmlElement(name = "OutLoanAccountSpreadFlg")
    protected String outLoanAccountSpreadFlg;
    @XmlElement(name = "OutLoanAccountStatementFreq")
    protected String outLoanAccountStatementFreq;
    @XmlElement(name = "OutLoanAccountSubsidyDuration")
    protected short outLoanAccountSubsidyDuration;
    @XmlElement(name = "OutLoanAccountSubsidyEndFlg")
    protected String outLoanAccountSubsidyEndFlg;
    @XmlElement(name = "OutLoanAccountSubsidyExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountSubsidyExpDt;
    @XmlElement(name = "OutLoanAccountSubsidyLimitAmn", required = true)
    protected BigDecimal outLoanAccountSubsidyLimitAmn;
    @XmlElement(name = "OutLoanAccountSubsidyStartDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountSubsidyStartDt;
    @XmlElement(name = "OutLoanAccountTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountTmstamp;
    @XmlElement(name = "OutLoanAccountToleranceDays")
    protected short outLoanAccountToleranceDays;
    @XmlElement(name = "OutLoanAccountTotCapAmn", required = true)
    protected BigDecimal outLoanAccountTotCapAmn;
    @XmlElement(name = "OutLoanAccountTotComInCcAmn", required = true)
    protected BigDecimal outLoanAccountTotComInCcAmn;
    @XmlElement(name = "OutLoanAccountTotCommissionAmn", required = true)
    protected BigDecimal outLoanAccountTotCommissionAmn;
    @XmlElement(name = "OutLoanAccountTotConfirmAmn", required = true)
    protected BigDecimal outLoanAccountTotConfirmAmn;
    @XmlElement(name = "OutLoanAccountTotDrawdownAmn", required = true)
    protected BigDecimal outLoanAccountTotDrawdownAmn;
    @XmlElement(name = "OutLoanAccountTotExpInCcAmn", required = true)
    protected BigDecimal outLoanAccountTotExpInCcAmn;
    @XmlElement(name = "OutLoanAccountTotExpenseAmn", required = true)
    protected BigDecimal outLoanAccountTotExpenseAmn;
    @XmlElement(name = "OutLoanAccountTotIntSprdAmn", required = true)
    protected BigDecimal outLoanAccountTotIntSprdAmn;
    @XmlElement(name = "OutLoanAccountTotNrmIntAmn", required = true)
    protected BigDecimal outLoanAccountTotNrmIntAmn;
    @XmlElement(name = "OutLoanAccountTotPnlIntAmn", required = true)
    protected BigDecimal outLoanAccountTotPnlIntAmn;
    @XmlElement(name = "OutLoanAccountTotPubCommAmn", required = true)
    protected BigDecimal outLoanAccountTotPubCommAmn;
    @XmlElement(name = "OutLoanAccountTotSubsIntAmn", required = true)
    protected BigDecimal outLoanAccountTotSubsIntAmn;
    @XmlElement(name = "OutLoanAccountTotThrdprtAmn", required = true)
    protected BigDecimal outLoanAccountTotThrdprtAmn;
    @XmlElement(name = "OutLoanAccountUnit")
    protected int outLoanAccountUnit;
    @XmlElement(name = "OutLoanAccountUnpaidCollCnt")
    protected short outLoanAccountUnpaidCollCnt;
    @XmlElement(name = "OutLoanAccountUnrealizedFlg")
    protected String outLoanAccountUnrealizedFlg;
    @XmlElement(name = "OutLoanAccountUsr")
    protected String outLoanAccountUsr;
    @XmlElement(name = "OutLoanAccountVillageSn")
    protected int outLoanAccountVillageSn;
    @XmlElement(name = "OutLoanParametersGetLoanInterest")
    protected String outLoanParametersGetLoanInterest;
    @XmlElement(name = "OutLoanParametersM4ApproachMeth")
    protected String outLoanParametersM4ApproachMeth;
    @XmlElement(name = "OutLoanParametersServerRepAppr")
    protected String outLoanParametersServerRepAppr;
    @XmlElement(name = "OutLoanStepIntInstallmentWorkFirstInstallmentIntAnm", required = true)
    protected BigDecimal outLoanStepIntInstallmentWorkFirstInstallmentIntAnm;
    @XmlElement(name = "OutLoanStepIntInstallmentWorkStep", required = true)
    protected BigDecimal outLoanStepIntInstallmentWorkStep;
    @XmlElement(name = "OutMech4InstChgFlgLoanInstallmentMechanismInstallChgFlg")
    protected short outMech4InstChgFlgLoanInstallmentMechanismInstallChgFlg;
    @XmlElement(name = "OutMech4InstChgFlgLoanInstallmentMechanismInstallChgNum")
    protected short outMech4InstChgFlgLoanInstallmentMechanismInstallChgNum;
    @XmlElement(name = "OutMech4InstChgFlgLoanInstallmentMechanismInstallMechFlg")
    protected short outMech4InstChgFlgLoanInstallmentMechanismInstallMechFlg;
    @XmlElement(name = "OutMech4InstChgFlgLoanInstallmentMechanismInstallNum")
    protected short outMech4InstChgFlgLoanInstallmentMechanismInstallNum;
    @XmlElement(name = "OutMech4InstChgFlgLoanInstallmentMechanismInstallSkipCap", required = true)
    protected BigDecimal outMech4InstChgFlgLoanInstallmentMechanismInstallSkipCap;
    @XmlElement(name = "OutMech4InstChgFlgLoanInstallmentMechanismInstallSkipInt", required = true)
    protected BigDecimal outMech4InstChgFlgLoanInstallmentMechanismInstallSkipInt;
    @XmlElement(name = "OutMech4InstChgFlgLoanInstallmentMechanismInstallTot")
    protected short outMech4InstChgFlgLoanInstallmentMechanismInstallTot;
    @XmlElement(name = "OutMonthCharSuppliedChar20")
    protected String outMonthCharSuppliedChar20;
    @XmlElement(name = "OutN128InterestLnsInterestDescription")
    protected String outN128InterestLnsInterestDescription;
    @XmlElement(name = "OutN128InterestLnsInterestIdInterest")
    protected int outN128InterestLnsInterestIdInterest;
    @XmlElement(name = "OutN128InterestSupplyWorkFixedInterestPrc", required = true)
    protected BigDecimal outN128InterestSupplyWorkFixedInterestPrc;
    @XmlElement(name = "OutSepeLoanInstallmentInfoInstallDbIntPerc", required = true)
    protected BigDecimal outSepeLoanInstallmentInfoInstallDbIntPerc;
    @XmlElement(name = "OutTotalsLoanInstallmentInfoInstallCapAmn", required = true)
    protected BigDecimal outTotalsLoanInstallmentInfoInstallCapAmn;
    @XmlElement(name = "OutTotalsLoanInstallmentInfoInstallEfteAmn", required = true)
    protected BigDecimal outTotalsLoanInstallmentInfoInstallEfteAmn;
    @XmlElement(name = "OutTotalsLoanInstallmentInfoInstallInsurance", required = true)
    protected BigDecimal outTotalsLoanInstallmentInfoInstallInsurance;
    @XmlElement(name = "OutTotalsLoanInstallmentInfoInstallIntAmn", required = true)
    protected BigDecimal outTotalsLoanInstallmentInfoInstallIntAmn;
    @XmlElement(name = "OutTotalsLoanInstallmentInfoInstallN128Amn", required = true)
    protected BigDecimal outTotalsLoanInstallmentInfoInstallN128Amn;
    @XmlElement(name = "OutTotalsLoanInstallmentInfoInstallSpreadAmn", required = true)
    protected BigDecimal outTotalsLoanInstallmentInfoInstallSpreadAmn;
    @XmlElement(name = "OutTotalsLoanInstallmentInfoInstallSubsidyAmn", required = true)
    protected BigDecimal outTotalsLoanInstallmentInfoInstallSubsidyAmn;
    @XmlElement(name = "OutTotalsLoanInstallmentInfoInstallmentAmn", required = true)
    protected BigDecimal outTotalsLoanInstallmentInfoInstallmentAmn;
    @XmlElement(name = "OutTotalsLoanInstallmentInfoRemainingCapitalAmn", required = true)
    protected BigDecimal outTotalsLoanInstallmentInfoRemainingCapitalAmn;
    @XmlElement(name = "OutTotalsLoanInstallmentInfoTotalChargeAmn", required = true)
    protected BigDecimal outTotalsLoanInstallmentInfoTotalChargeAmn;
    @XmlElement(name = "OutTotalsLoanInstallmentInfoTotalInsuranceAmn", required = true)
    protected BigDecimal outTotalsLoanInstallmentInfoTotalInsuranceAmn;
    @XmlElement(name = "OutTotalsLoanInstallmentInfoTotalIntPerc", required = true)
    protected BigDecimal outTotalsLoanInstallmentInfoTotalIntPerc;
    @XmlElement(name = "OutTotalsLoanInstallmentInfoTotalRoundingAmn", required = true)
    protected BigDecimal outTotalsLoanInstallmentInfoTotalRoundingAmn;
    @XmlElement(name = "TonyOutGracePeriodTotalLoanInstallmentInfoStartingCapitalAmn", required = true)
    protected BigDecimal tonyOutGracePeriodTotalLoanInstallmentInfoStartingCapitalAmn;
    @XmlElement(name = "OutTotalLoanIefSuppliedTotalInteger")
    protected double outTotalLoanIefSuppliedTotalInteger;
    @XmlElement(name = "OutTotalsLoanInstallmentInfoInstallComAmn", required = true)
    protected BigDecimal outTotalsLoanInstallmentInfoInstallComAmn;

    /**
     * Gets the value of the outEnoikiagoraTokoiIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutEnoikiagoraTokoiIefSuppliedNumber152() {
        return outEnoikiagoraTokoiIefSuppliedNumber152;
    }

    /**
     * Sets the value of the outEnoikiagoraTokoiIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutEnoikiagoraTokoiIefSuppliedNumber152(BigDecimal value) {
        this.outEnoikiagoraTokoiIefSuppliedNumber152 = value;
    }

    /**
     * Gets the value of the outGrpGrace property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpGraceItem }
     *     
     */
    public ArrayOfOutGrpGraceItem getOutGrpGrace() {
        return outGrpGrace;
    }

    /**
     * Sets the value of the outGrpGrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpGraceItem }
     *     
     */
    public void setOutGrpGrace(ArrayOfOutGrpGraceItem value) {
        this.outGrpGrace = value;
    }

    /**
     * Gets the value of the outGrpInstallmentSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpInstallmentScheduleItem }
     *     
     */
    public ArrayOfOutGrpInstallmentScheduleItem getOutGrpInstallmentSchedule() {
        return outGrpInstallmentSchedule;
    }

    /**
     * Sets the value of the outGrpInstallmentSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpInstallmentScheduleItem }
     *     
     */
    public void setOutGrpInstallmentSchedule(ArrayOfOutGrpInstallmentScheduleItem value) {
        this.outGrpInstallmentSchedule = value;
    }

    /**
     * Gets the value of the outLoanInterDaysInst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanInterDaysInst() {
        return outLoanInterDaysInst;
    }

    /**
     * Sets the value of the outLoanInterDaysInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanInterDaysInst(String value) {
        this.outLoanInterDaysInst = value;
    }

    /**
     * Gets the value of the outLoanM6PeriodNrmint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanM6PeriodNrmint() {
        return outLoanM6PeriodNrmint;
    }

    /**
     * Sets the value of the outLoanM6PeriodNrmint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanM6PeriodNrmint(String value) {
        this.outLoanM6PeriodNrmint = value;
    }

    /**
     * Gets the value of the outLoanMaxGracePrdFrq property.
     * 
     */
    public short getOutLoanMaxGracePrdFrq() {
        return outLoanMaxGracePrdFrq;
    }

    /**
     * Sets the value of the outLoanMaxGracePrdFrq property.
     * 
     */
    public void setOutLoanMaxGracePrdFrq(short value) {
        this.outLoanMaxGracePrdFrq = value;
    }

    /**
     * Gets the value of the outLoanMinGracePrdFrq property.
     * 
     */
    public short getOutLoanMinGracePrdFrq() {
        return outLoanMinGracePrdFrq;
    }

    /**
     * Sets the value of the outLoanMinGracePrdFrq property.
     * 
     */
    public void setOutLoanMinGracePrdFrq(short value) {
        this.outLoanMinGracePrdFrq = value;
    }

    /**
     * Gets the value of the outLoanAccountAccCd property.
     * 
     */
    public short getOutLoanAccountAccCd() {
        return outLoanAccountAccCd;
    }

    /**
     * Sets the value of the outLoanAccountAccCd property.
     * 
     */
    public void setOutLoanAccountAccCd(short value) {
        this.outLoanAccountAccCd = value;
    }

    /**
     * Gets the value of the outLoanAccountAccDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountAccDescription() {
        return outLoanAccountAccDescription;
    }

    /**
     * Sets the value of the outLoanAccountAccDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountAccDescription(String value) {
        this.outLoanAccountAccDescription = value;
    }

    /**
     * Gets the value of the outLoanAccountAccExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountAccExpDt() {
        return outLoanAccountAccExpDt;
    }

    /**
     * Sets the value of the outLoanAccountAccExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountAccExpDt(XMLGregorianCalendar value) {
        this.outLoanAccountAccExpDt = value;
    }

    /**
     * Gets the value of the outLoanAccountAccLimitAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountAccLimitAmn() {
        return outLoanAccountAccLimitAmn;
    }

    /**
     * Sets the value of the outLoanAccountAccLimitAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountAccLimitAmn(BigDecimal value) {
        this.outLoanAccountAccLimitAmn = value;
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
     * Gets the value of the outLoanAccountAccOpenDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountAccOpenDt() {
        return outLoanAccountAccOpenDt;
    }

    /**
     * Sets the value of the outLoanAccountAccOpenDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountAccOpenDt(XMLGregorianCalendar value) {
        this.outLoanAccountAccOpenDt = value;
    }

    /**
     * Gets the value of the outLoanAccountAccSn property.
     * 
     */
    public int getOutLoanAccountAccSn() {
        return outLoanAccountAccSn;
    }

    /**
     * Sets the value of the outLoanAccountAccSn property.
     * 
     */
    public void setOutLoanAccountAccSn(int value) {
        this.outLoanAccountAccSn = value;
    }

    /**
     * Gets the value of the outLoanAccountAccSpcAgrFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountAccSpcAgrFlg() {
        return outLoanAccountAccSpcAgrFlg;
    }

    /**
     * Sets the value of the outLoanAccountAccSpcAgrFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountAccSpcAgrFlg(String value) {
        this.outLoanAccountAccSpcAgrFlg = value;
    }

    /**
     * Gets the value of the outLoanAccountAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountAccStatus() {
        return outLoanAccountAccStatus;
    }

    /**
     * Sets the value of the outLoanAccountAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountAccStatus(String value) {
        this.outLoanAccountAccStatus = value;
    }

    /**
     * Gets the value of the outLoanAccountAccTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountAccTerms() {
        return outLoanAccountAccTerms;
    }

    /**
     * Sets the value of the outLoanAccountAccTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountAccTerms(String value) {
        this.outLoanAccountAccTerms = value;
    }

    /**
     * Gets the value of the outLoanAccountAccType property.
     * 
     */
    public short getOutLoanAccountAccType() {
        return outLoanAccountAccType;
    }

    /**
     * Sets the value of the outLoanAccountAccType property.
     * 
     */
    public void setOutLoanAccountAccType(short value) {
        this.outLoanAccountAccType = value;
    }

    /**
     * Gets the value of the outLoanAccountAtmCardFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountAtmCardFlag() {
        return outLoanAccountAtmCardFlag;
    }

    /**
     * Sets the value of the outLoanAccountAtmCardFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountAtmCardFlag(String value) {
        this.outLoanAccountAtmCardFlag = value;
    }

    /**
     * Gets the value of the outLoanAccountCurFxIntExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountCurFxIntExpDt() {
        return outLoanAccountCurFxIntExpDt;
    }

    /**
     * Sets the value of the outLoanAccountCurFxIntExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountCurFxIntExpDt(XMLGregorianCalendar value) {
        this.outLoanAccountCurFxIntExpDt = value;
    }

    /**
     * Gets the value of the outLoanAccountCurFxIntInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountCurFxIntInd() {
        return outLoanAccountCurFxIntInd;
    }

    /**
     * Sets the value of the outLoanAccountCurFxIntInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountCurFxIntInd(String value) {
        this.outLoanAccountCurFxIntInd = value;
    }

    /**
     * Gets the value of the outLoanAccountCurFxIntScalDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountCurFxIntScalDt() {
        return outLoanAccountCurFxIntScalDt;
    }

    /**
     * Sets the value of the outLoanAccountCurFxIntScalDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountCurFxIntScalDt(XMLGregorianCalendar value) {
        this.outLoanAccountCurFxIntScalDt = value;
    }

    /**
     * Gets the value of the outLoanAccountCurFxIntStDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountCurFxIntStDt() {
        return outLoanAccountCurFxIntStDt;
    }

    /**
     * Sets the value of the outLoanAccountCurFxIntStDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountCurFxIntStDt(XMLGregorianCalendar value) {
        this.outLoanAccountCurFxIntStDt = value;
    }

    /**
     * Gets the value of the outLoanAccountCusStmLstTrnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountCusStmLstTrnDt() {
        return outLoanAccountCusStmLstTrnDt;
    }

    /**
     * Sets the value of the outLoanAccountCusStmLstTrnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountCusStmLstTrnDt(XMLGregorianCalendar value) {
        this.outLoanAccountCusStmLstTrnDt = value;
    }

    /**
     * Gets the value of the outLoanAccountCusStmNxtTrnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountCusStmNxtTrnDt() {
        return outLoanAccountCusStmNxtTrnDt;
    }

    /**
     * Sets the value of the outLoanAccountCusStmNxtTrnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountCusStmNxtTrnDt(XMLGregorianCalendar value) {
        this.outLoanAccountCusStmNxtTrnDt = value;
    }

    /**
     * Gets the value of the outLoanAccountCustId property.
     * 
     */
    public int getOutLoanAccountCustId() {
        return outLoanAccountCustId;
    }

    /**
     * Sets the value of the outLoanAccountCustId property.
     * 
     */
    public void setOutLoanAccountCustId(int value) {
        this.outLoanAccountCustId = value;
    }

    /**
     * Gets the value of the outLoanAccountDepAccCd property.
     * 
     */
    public short getOutLoanAccountDepAccCd() {
        return outLoanAccountDepAccCd;
    }

    /**
     * Sets the value of the outLoanAccountDepAccCd property.
     * 
     */
    public void setOutLoanAccountDepAccCd(short value) {
        this.outLoanAccountDepAccCd = value;
    }

    /**
     * Gets the value of the outLoanAccountDepAccSn property.
     * 
     */
    public double getOutLoanAccountDepAccSn() {
        return outLoanAccountDepAccSn;
    }

    /**
     * Sets the value of the outLoanAccountDepAccSn property.
     * 
     */
    public void setOutLoanAccountDepAccSn(double value) {
        this.outLoanAccountDepAccSn = value;
    }

    /**
     * Gets the value of the outLoanAccountDepAccType property.
     * 
     */
    public short getOutLoanAccountDepAccType() {
        return outLoanAccountDepAccType;
    }

    /**
     * Sets the value of the outLoanAccountDepAccType property.
     * 
     */
    public void setOutLoanAccountDepAccType(short value) {
        this.outLoanAccountDepAccType = value;
    }

    /**
     * Gets the value of the outLoanAccountDepAccUnit property.
     * 
     */
    public int getOutLoanAccountDepAccUnit() {
        return outLoanAccountDepAccUnit;
    }

    /**
     * Sets the value of the outLoanAccountDepAccUnit property.
     * 
     */
    public void setOutLoanAccountDepAccUnit(int value) {
        this.outLoanAccountDepAccUnit = value;
    }

    /**
     * Gets the value of the outLoanAccountDrawdownExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountDrawdownExpDt() {
        return outLoanAccountDrawdownExpDt;
    }

    /**
     * Sets the value of the outLoanAccountDrawdownExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountDrawdownExpDt(XMLGregorianCalendar value) {
        this.outLoanAccountDrawdownExpDt = value;
    }

    /**
     * Gets the value of the outLoanAccountDrawdownFstAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountDrawdownFstAmn() {
        return outLoanAccountDrawdownFstAmn;
    }

    /**
     * Sets the value of the outLoanAccountDrawdownFstAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountDrawdownFstAmn(BigDecimal value) {
        this.outLoanAccountDrawdownFstAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountDrawdownFstDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountDrawdownFstDt() {
        return outLoanAccountDrawdownFstDt;
    }

    /**
     * Sets the value of the outLoanAccountDrawdownFstDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountDrawdownFstDt(XMLGregorianCalendar value) {
        this.outLoanAccountDrawdownFstDt = value;
    }

    /**
     * Gets the value of the outLoanAccountExcmptPnlPrdCnt property.
     * 
     */
    public short getOutLoanAccountExcmptPnlPrdCnt() {
        return outLoanAccountExcmptPnlPrdCnt;
    }

    /**
     * Sets the value of the outLoanAccountExcmptPnlPrdCnt property.
     * 
     */
    public void setOutLoanAccountExcmptPnlPrdCnt(short value) {
        this.outLoanAccountExcmptPnlPrdCnt = value;
    }

    /**
     * Gets the value of the outLoanAccountExcmptPnlPrdNo property.
     * 
     */
    public short getOutLoanAccountExcmptPnlPrdNo() {
        return outLoanAccountExcmptPnlPrdNo;
    }

    /**
     * Sets the value of the outLoanAccountExcmptPnlPrdNo property.
     * 
     */
    public void setOutLoanAccountExcmptPnlPrdNo(short value) {
        this.outLoanAccountExcmptPnlPrdNo = value;
    }

    /**
     * Gets the value of the outLoanAccountFixedIntRenewDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountFixedIntRenewDt() {
        return outLoanAccountFixedIntRenewDt;
    }

    /**
     * Sets the value of the outLoanAccountFixedIntRenewDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountFixedIntRenewDt(XMLGregorianCalendar value) {
        this.outLoanAccountFixedIntRenewDt = value;
    }

    /**
     * Gets the value of the outLoanAccountGuaranteePerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountGuaranteePerc() {
        return outLoanAccountGuaranteePerc;
    }

    /**
     * Sets the value of the outLoanAccountGuaranteePerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountGuaranteePerc(BigDecimal value) {
        this.outLoanAccountGuaranteePerc = value;
    }

    /**
     * Gets the value of the outLoanAccountInstallChgNum property.
     * 
     */
    public short getOutLoanAccountInstallChgNum() {
        return outLoanAccountInstallChgNum;
    }

    /**
     * Sets the value of the outLoanAccountInstallChgNum property.
     * 
     */
    public void setOutLoanAccountInstallChgNum(short value) {
        this.outLoanAccountInstallChgNum = value;
    }

    /**
     * Gets the value of the outLoanAccountInstallCount property.
     * 
     */
    public short getOutLoanAccountInstallCount() {
        return outLoanAccountInstallCount;
    }

    /**
     * Sets the value of the outLoanAccountInstallCount property.
     * 
     */
    public void setOutLoanAccountInstallCount(short value) {
        this.outLoanAccountInstallCount = value;
    }

    /**
     * Gets the value of the outLoanAccountInstallFirstDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountInstallFirstDt() {
        return outLoanAccountInstallFirstDt;
    }

    /**
     * Sets the value of the outLoanAccountInstallFirstDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountInstallFirstDt(XMLGregorianCalendar value) {
        this.outLoanAccountInstallFirstDt = value;
    }

    /**
     * Gets the value of the outLoanAccountInstallFreq property.
     * 
     */
    public short getOutLoanAccountInstallFreq() {
        return outLoanAccountInstallFreq;
    }

    /**
     * Sets the value of the outLoanAccountInstallFreq property.
     * 
     */
    public void setOutLoanAccountInstallFreq(short value) {
        this.outLoanAccountInstallFreq = value;
    }

    /**
     * Gets the value of the outLoanAccountInstallMechFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountInstallMechFlg() {
        return outLoanAccountInstallMechFlg;
    }

    /**
     * Sets the value of the outLoanAccountInstallMechFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountInstallMechFlg(String value) {
        this.outLoanAccountInstallMechFlg = value;
    }

    /**
     * Gets the value of the outLoanAccountInstallNextDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountInstallNextDt() {
        return outLoanAccountInstallNextDt;
    }

    /**
     * Sets the value of the outLoanAccountInstallNextDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountInstallNextDt(XMLGregorianCalendar value) {
        this.outLoanAccountInstallNextDt = value;
    }

    /**
     * Gets the value of the outLoanAccountInstallPrevDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountInstallPrevDt() {
        return outLoanAccountInstallPrevDt;
    }

    /**
     * Sets the value of the outLoanAccountInstallPrevDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountInstallPrevDt(XMLGregorianCalendar value) {
        this.outLoanAccountInstallPrevDt = value;
    }

    /**
     * Gets the value of the outLoanAccountInstallSkipCap property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountInstallSkipCap() {
        return outLoanAccountInstallSkipCap;
    }

    /**
     * Sets the value of the outLoanAccountInstallSkipCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountInstallSkipCap(BigDecimal value) {
        this.outLoanAccountInstallSkipCap = value;
    }

    /**
     * Gets the value of the outLoanAccountInstallSkipInt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountInstallSkipInt() {
        return outLoanAccountInstallSkipInt;
    }

    /**
     * Sets the value of the outLoanAccountInstallSkipInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountInstallSkipInt(BigDecimal value) {
        this.outLoanAccountInstallSkipInt = value;
    }

    /**
     * Gets the value of the outLoanAccountIntCalcStopFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountIntCalcStopFlg() {
        return outLoanAccountIntCalcStopFlg;
    }

    /**
     * Sets the value of the outLoanAccountIntCalcStopFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountIntCalcStopFlg(String value) {
        this.outLoanAccountIntCalcStopFlg = value;
    }

    /**
     * Gets the value of the outLoanAccountInterCapitalizeFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountInterCapitalizeFlg() {
        return outLoanAccountInterCapitalizeFlg;
    }

    /**
     * Sets the value of the outLoanAccountInterCapitalizeFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountInterCapitalizeFlg(String value) {
        this.outLoanAccountInterCapitalizeFlg = value;
    }

    /**
     * Gets the value of the outLoanAccountInterRateSprd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountInterRateSprd() {
        return outLoanAccountInterRateSprd;
    }

    /**
     * Sets the value of the outLoanAccountInterRateSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountInterRateSprd(BigDecimal value) {
        this.outLoanAccountInterRateSprd = value;
    }

    /**
     * Gets the value of the outLoanAccountLastNrmTrxCnt property.
     * 
     */
    public short getOutLoanAccountLastNrmTrxCnt() {
        return outLoanAccountLastNrmTrxCnt;
    }

    /**
     * Sets the value of the outLoanAccountLastNrmTrxCnt property.
     * 
     */
    public void setOutLoanAccountLastNrmTrxCnt(short value) {
        this.outLoanAccountLastNrmTrxCnt = value;
    }

    /**
     * Gets the value of the outLoanAccountLoanStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountLoanStatus() {
        return outLoanAccountLoanStatus;
    }

    /**
     * Sets the value of the outLoanAccountLoanStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountLoanStatus(String value) {
        this.outLoanAccountLoanStatus = value;
    }

    /**
     * Gets the value of the outLoanAccountLstAccrCalcDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountLstAccrCalcDt() {
        return outLoanAccountLstAccrCalcDt;
    }

    /**
     * Sets the value of the outLoanAccountLstAccrCalcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountLstAccrCalcDt(XMLGregorianCalendar value) {
        this.outLoanAccountLstAccrCalcDt = value;
    }

    /**
     * Gets the value of the outLoanAccountLstAprIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountLstAprIntDbAmn() {
        return outLoanAccountLstAprIntDbAmn;
    }

    /**
     * Sets the value of the outLoanAccountLstAprIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountLstAprIntDbAmn(BigDecimal value) {
        this.outLoanAccountLstAprIntDbAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountLstAprYear property.
     * 
     */
    public short getOutLoanAccountLstAprYear() {
        return outLoanAccountLstAprYear;
    }

    /**
     * Sets the value of the outLoanAccountLstAprYear property.
     * 
     */
    public void setOutLoanAccountLstAprYear(short value) {
        this.outLoanAccountLstAprYear = value;
    }

    /**
     * Gets the value of the outLoanAccountLstAugIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountLstAugIntDbAmn() {
        return outLoanAccountLstAugIntDbAmn;
    }

    /**
     * Sets the value of the outLoanAccountLstAugIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountLstAugIntDbAmn(BigDecimal value) {
        this.outLoanAccountLstAugIntDbAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountLstAugYear property.
     * 
     */
    public short getOutLoanAccountLstAugYear() {
        return outLoanAccountLstAugYear;
    }

    /**
     * Sets the value of the outLoanAccountLstAugYear property.
     * 
     */
    public void setOutLoanAccountLstAugYear(short value) {
        this.outLoanAccountLstAugYear = value;
    }

    /**
     * Gets the value of the outLoanAccountLstDecIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountLstDecIntDbAmn() {
        return outLoanAccountLstDecIntDbAmn;
    }

    /**
     * Sets the value of the outLoanAccountLstDecIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountLstDecIntDbAmn(BigDecimal value) {
        this.outLoanAccountLstDecIntDbAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountLstDecYear property.
     * 
     */
    public short getOutLoanAccountLstDecYear() {
        return outLoanAccountLstDecYear;
    }

    /**
     * Sets the value of the outLoanAccountLstDecYear property.
     * 
     */
    public void setOutLoanAccountLstDecYear(short value) {
        this.outLoanAccountLstDecYear = value;
    }

    /**
     * Gets the value of the outLoanAccountLstFebIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountLstFebIntDbAmn() {
        return outLoanAccountLstFebIntDbAmn;
    }

    /**
     * Sets the value of the outLoanAccountLstFebIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountLstFebIntDbAmn(BigDecimal value) {
        this.outLoanAccountLstFebIntDbAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountLstFebYear property.
     * 
     */
    public short getOutLoanAccountLstFebYear() {
        return outLoanAccountLstFebYear;
    }

    /**
     * Sets the value of the outLoanAccountLstFebYear property.
     * 
     */
    public void setOutLoanAccountLstFebYear(short value) {
        this.outLoanAccountLstFebYear = value;
    }

    /**
     * Gets the value of the outLoanAccountLstIntCalcDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountLstIntCalcDt() {
        return outLoanAccountLstIntCalcDt;
    }

    /**
     * Sets the value of the outLoanAccountLstIntCalcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountLstIntCalcDt(XMLGregorianCalendar value) {
        this.outLoanAccountLstIntCalcDt = value;
    }

    /**
     * Gets the value of the outLoanAccountLstJanIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountLstJanIntDbAmn() {
        return outLoanAccountLstJanIntDbAmn;
    }

    /**
     * Sets the value of the outLoanAccountLstJanIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountLstJanIntDbAmn(BigDecimal value) {
        this.outLoanAccountLstJanIntDbAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountLstJanYear property.
     * 
     */
    public short getOutLoanAccountLstJanYear() {
        return outLoanAccountLstJanYear;
    }

    /**
     * Sets the value of the outLoanAccountLstJanYear property.
     * 
     */
    public void setOutLoanAccountLstJanYear(short value) {
        this.outLoanAccountLstJanYear = value;
    }

    /**
     * Gets the value of the outLoanAccountLstJulIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountLstJulIntDbAmn() {
        return outLoanAccountLstJulIntDbAmn;
    }

    /**
     * Sets the value of the outLoanAccountLstJulIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountLstJulIntDbAmn(BigDecimal value) {
        this.outLoanAccountLstJulIntDbAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountLstJulYear property.
     * 
     */
    public short getOutLoanAccountLstJulYear() {
        return outLoanAccountLstJulYear;
    }

    /**
     * Sets the value of the outLoanAccountLstJulYear property.
     * 
     */
    public void setOutLoanAccountLstJulYear(short value) {
        this.outLoanAccountLstJulYear = value;
    }

    /**
     * Gets the value of the outLoanAccountLstJunIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountLstJunIntDbAmn() {
        return outLoanAccountLstJunIntDbAmn;
    }

    /**
     * Sets the value of the outLoanAccountLstJunIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountLstJunIntDbAmn(BigDecimal value) {
        this.outLoanAccountLstJunIntDbAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountLstJunYear property.
     * 
     */
    public short getOutLoanAccountLstJunYear() {
        return outLoanAccountLstJunYear;
    }

    /**
     * Sets the value of the outLoanAccountLstJunYear property.
     * 
     */
    public void setOutLoanAccountLstJunYear(short value) {
        this.outLoanAccountLstJunYear = value;
    }

    /**
     * Gets the value of the outLoanAccountLstMarIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountLstMarIntDbAmn() {
        return outLoanAccountLstMarIntDbAmn;
    }

    /**
     * Sets the value of the outLoanAccountLstMarIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountLstMarIntDbAmn(BigDecimal value) {
        this.outLoanAccountLstMarIntDbAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountLstMarYear property.
     * 
     */
    public short getOutLoanAccountLstMarYear() {
        return outLoanAccountLstMarYear;
    }

    /**
     * Sets the value of the outLoanAccountLstMarYear property.
     * 
     */
    public void setOutLoanAccountLstMarYear(short value) {
        this.outLoanAccountLstMarYear = value;
    }

    /**
     * Gets the value of the outLoanAccountLstMayIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountLstMayIntDbAmn() {
        return outLoanAccountLstMayIntDbAmn;
    }

    /**
     * Sets the value of the outLoanAccountLstMayIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountLstMayIntDbAmn(BigDecimal value) {
        this.outLoanAccountLstMayIntDbAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountLstMayYear property.
     * 
     */
    public short getOutLoanAccountLstMayYear() {
        return outLoanAccountLstMayYear;
    }

    /**
     * Sets the value of the outLoanAccountLstMayYear property.
     * 
     */
    public void setOutLoanAccountLstMayYear(short value) {
        this.outLoanAccountLstMayYear = value;
    }

    /**
     * Gets the value of the outLoanAccountLstNovIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountLstNovIntDbAmn() {
        return outLoanAccountLstNovIntDbAmn;
    }

    /**
     * Sets the value of the outLoanAccountLstNovIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountLstNovIntDbAmn(BigDecimal value) {
        this.outLoanAccountLstNovIntDbAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountLstNovYear property.
     * 
     */
    public short getOutLoanAccountLstNovYear() {
        return outLoanAccountLstNovYear;
    }

    /**
     * Sets the value of the outLoanAccountLstNovYear property.
     * 
     */
    public void setOutLoanAccountLstNovYear(short value) {
        this.outLoanAccountLstNovYear = value;
    }

    /**
     * Gets the value of the outLoanAccountLstOctIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountLstOctIntDbAmn() {
        return outLoanAccountLstOctIntDbAmn;
    }

    /**
     * Sets the value of the outLoanAccountLstOctIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountLstOctIntDbAmn(BigDecimal value) {
        this.outLoanAccountLstOctIntDbAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountLstOctYear property.
     * 
     */
    public short getOutLoanAccountLstOctYear() {
        return outLoanAccountLstOctYear;
    }

    /**
     * Sets the value of the outLoanAccountLstOctYear property.
     * 
     */
    public void setOutLoanAccountLstOctYear(short value) {
        this.outLoanAccountLstOctYear = value;
    }

    /**
     * Gets the value of the outLoanAccountLstSepIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountLstSepIntDbAmn() {
        return outLoanAccountLstSepIntDbAmn;
    }

    /**
     * Sets the value of the outLoanAccountLstSepIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountLstSepIntDbAmn(BigDecimal value) {
        this.outLoanAccountLstSepIntDbAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountLstSepYear property.
     * 
     */
    public short getOutLoanAccountLstSepYear() {
        return outLoanAccountLstSepYear;
    }

    /**
     * Sets the value of the outLoanAccountLstSepYear property.
     * 
     */
    public void setOutLoanAccountLstSepYear(short value) {
        this.outLoanAccountLstSepYear = value;
    }

    /**
     * Gets the value of the outLoanAccountLstTrxDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountLstTrxDt() {
        return outLoanAccountLstTrxDt;
    }

    /**
     * Sets the value of the outLoanAccountLstTrxDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountLstTrxDt(XMLGregorianCalendar value) {
        this.outLoanAccountLstTrxDt = value;
    }

    /**
     * Gets the value of the outLoanAccountLumpDrawdownFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountLumpDrawdownFlg() {
        return outLoanAccountLumpDrawdownFlg;
    }

    /**
     * Sets the value of the outLoanAccountLumpDrawdownFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountLumpDrawdownFlg(String value) {
        this.outLoanAccountLumpDrawdownFlg = value;
    }

    /**
     * Gets the value of the outLoanAccountMainBenefCategor property.
     * 
     */
    public int getOutLoanAccountMainBenefCategor() {
        return outLoanAccountMainBenefCategor;
    }

    /**
     * Sets the value of the outLoanAccountMainBenefCategor property.
     * 
     */
    public void setOutLoanAccountMainBenefCategor(int value) {
        this.outLoanAccountMainBenefCategor = value;
    }

    /**
     * Gets the value of the outLoanAccountMoratorN128Rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountMoratorN128Rate() {
        return outLoanAccountMoratorN128Rate;
    }

    /**
     * Sets the value of the outLoanAccountMoratorN128Rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountMoratorN128Rate(BigDecimal value) {
        this.outLoanAccountMoratorN128Rate = value;
    }

    /**
     * Gets the value of the outLoanAccountMoratorNrmRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountMoratorNrmRate() {
        return outLoanAccountMoratorNrmRate;
    }

    /**
     * Sets the value of the outLoanAccountMoratorNrmRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountMoratorNrmRate(BigDecimal value) {
        this.outLoanAccountMoratorNrmRate = value;
    }

    /**
     * Gets the value of the outLoanAccountMoratorSprRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountMoratorSprRate() {
        return outLoanAccountMoratorSprRate;
    }

    /**
     * Sets the value of the outLoanAccountMoratorSprRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountMoratorSprRate(BigDecimal value) {
        this.outLoanAccountMoratorSprRate = value;
    }

    /**
     * Gets the value of the outLoanAccountMoratorSubsRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountMoratorSubsRate() {
        return outLoanAccountMoratorSubsRate;
    }

    /**
     * Sets the value of the outLoanAccountMoratorSubsRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountMoratorSubsRate(BigDecimal value) {
        this.outLoanAccountMoratorSubsRate = value;
    }

    /**
     * Gets the value of the outLoanAccountMpStartCapAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountMpStartCapAmn() {
        return outLoanAccountMpStartCapAmn;
    }

    /**
     * Sets the value of the outLoanAccountMpStartCapAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountMpStartCapAmn(BigDecimal value) {
        this.outLoanAccountMpStartCapAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountNrAcrPubIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountNrAcrPubIntAmn() {
        return outLoanAccountNrAcrPubIntAmn;
    }

    /**
     * Sets the value of the outLoanAccountNrAcrPubIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountNrAcrPubIntAmn(BigDecimal value) {
        this.outLoanAccountNrAcrPubIntAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountNrUrlPubIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountNrUrlPubIntAmn() {
        return outLoanAccountNrUrlPubIntAmn;
    }

    /**
     * Sets the value of the outLoanAccountNrUrlPubIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountNrUrlPubIntAmn(BigDecimal value) {
        this.outLoanAccountNrUrlPubIntAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountNrmAcrIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountNrmAcrIntBal() {
        return outLoanAccountNrmAcrIntBal;
    }

    /**
     * Sets the value of the outLoanAccountNrmAcrIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountNrmAcrIntBal(BigDecimal value) {
        this.outLoanAccountNrmAcrIntBal = value;
    }

    /**
     * Gets the value of the outLoanAccountNrmCapBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountNrmCapBal() {
        return outLoanAccountNrmCapBal;
    }

    /**
     * Sets the value of the outLoanAccountNrmCapBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountNrmCapBal(BigDecimal value) {
        this.outLoanAccountNrmCapBal = value;
    }

    /**
     * Gets the value of the outLoanAccountNrmChrgCnt property.
     * 
     */
    public short getOutLoanAccountNrmChrgCnt() {
        return outLoanAccountNrmChrgCnt;
    }

    /**
     * Sets the value of the outLoanAccountNrmChrgCnt property.
     * 
     */
    public void setOutLoanAccountNrmChrgCnt(short value) {
        this.outLoanAccountNrmChrgCnt = value;
    }

    /**
     * Gets the value of the outLoanAccountNrmComBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountNrmComBal() {
        return outLoanAccountNrmComBal;
    }

    /**
     * Sets the value of the outLoanAccountNrmComBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountNrmComBal(BigDecimal value) {
        this.outLoanAccountNrmComBal = value;
    }

    /**
     * Gets the value of the outLoanAccountNrmExpBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountNrmExpBal() {
        return outLoanAccountNrmExpBal;
    }

    /**
     * Sets the value of the outLoanAccountNrmExpBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountNrmExpBal(BigDecimal value) {
        this.outLoanAccountNrmExpBal = value;
    }

    /**
     * Gets the value of the outLoanAccountNrmInstCnt property.
     * 
     */
    public short getOutLoanAccountNrmInstCnt() {
        return outLoanAccountNrmInstCnt;
    }

    /**
     * Sets the value of the outLoanAccountNrmInstCnt property.
     * 
     */
    public void setOutLoanAccountNrmInstCnt(short value) {
        this.outLoanAccountNrmInstCnt = value;
    }

    /**
     * Gets the value of the outLoanAccountNrmIntCnt property.
     * 
     */
    public short getOutLoanAccountNrmIntCnt() {
        return outLoanAccountNrmIntCnt;
    }

    /**
     * Sets the value of the outLoanAccountNrmIntCnt property.
     * 
     */
    public void setOutLoanAccountNrmIntCnt(short value) {
        this.outLoanAccountNrmIntCnt = value;
    }

    /**
     * Gets the value of the outLoanAccountNrmLoanCnt property.
     * 
     */
    public short getOutLoanAccountNrmLoanCnt() {
        return outLoanAccountNrmLoanCnt;
    }

    /**
     * Sets the value of the outLoanAccountNrmLoanCnt property.
     * 
     */
    public void setOutLoanAccountNrmLoanCnt(short value) {
        this.outLoanAccountNrmLoanCnt = value;
    }

    /**
     * Gets the value of the outLoanAccountNrmRlIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountNrmRlIntBal() {
        return outLoanAccountNrmRlIntBal;
    }

    /**
     * Sets the value of the outLoanAccountNrmRlIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountNrmRlIntBal(BigDecimal value) {
        this.outLoanAccountNrmRlIntBal = value;
    }

    /**
     * Gets the value of the outLoanAccountNrmSubsidyBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountNrmSubsidyBal() {
        return outLoanAccountNrmSubsidyBal;
    }

    /**
     * Sets the value of the outLoanAccountNrmSubsidyBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountNrmSubsidyBal(BigDecimal value) {
        this.outLoanAccountNrmSubsidyBal = value;
    }

    /**
     * Gets the value of the outLoanAccountNrmUrlIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountNrmUrlIntBal() {
        return outLoanAccountNrmUrlIntBal;
    }

    /**
     * Sets the value of the outLoanAccountNrmUrlIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountNrmUrlIntBal(BigDecimal value) {
        this.outLoanAccountNrmUrlIntBal = value;
    }

    /**
     * Gets the value of the outLoanAccountOldAccountCd property.
     * 
     */
    public short getOutLoanAccountOldAccountCd() {
        return outLoanAccountOldAccountCd;
    }

    /**
     * Sets the value of the outLoanAccountOldAccountCd property.
     * 
     */
    public void setOutLoanAccountOldAccountCd(short value) {
        this.outLoanAccountOldAccountCd = value;
    }

    /**
     * Gets the value of the outLoanAccountOldAccountNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountOldAccountNum() {
        return outLoanAccountOldAccountNum;
    }

    /**
     * Sets the value of the outLoanAccountOldAccountNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountOldAccountNum(String value) {
        this.outLoanAccountOldAccountNum = value;
    }

    /**
     * Gets the value of the outLoanAccountOvAcrNrmIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountOvAcrNrmIntBal() {
        return outLoanAccountOvAcrNrmIntBal;
    }

    /**
     * Sets the value of the outLoanAccountOvAcrNrmIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountOvAcrNrmIntBal(BigDecimal value) {
        this.outLoanAccountOvAcrNrmIntBal = value;
    }

    /**
     * Gets the value of the outLoanAccountOvAcrPnlIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountOvAcrPnlIntBal() {
        return outLoanAccountOvAcrPnlIntBal;
    }

    /**
     * Sets the value of the outLoanAccountOvAcrPnlIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountOvAcrPnlIntBal(BigDecimal value) {
        this.outLoanAccountOvAcrPnlIntBal = value;
    }

    /**
     * Gets the value of the outLoanAccountOvAcrPubIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountOvAcrPubIntAmn() {
        return outLoanAccountOvAcrPubIntAmn;
    }

    /**
     * Sets the value of the outLoanAccountOvAcrPubIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountOvAcrPubIntAmn(BigDecimal value) {
        this.outLoanAccountOvAcrPubIntAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountOvCapBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountOvCapBal() {
        return outLoanAccountOvCapBal;
    }

    /**
     * Sets the value of the outLoanAccountOvCapBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountOvCapBal(BigDecimal value) {
        this.outLoanAccountOvCapBal = value;
    }

    /**
     * Gets the value of the outLoanAccountOvChrgCnt property.
     * 
     */
    public short getOutLoanAccountOvChrgCnt() {
        return outLoanAccountOvChrgCnt;
    }

    /**
     * Sets the value of the outLoanAccountOvChrgCnt property.
     * 
     */
    public void setOutLoanAccountOvChrgCnt(short value) {
        this.outLoanAccountOvChrgCnt = value;
    }

    /**
     * Gets the value of the outLoanAccountOvComBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountOvComBal() {
        return outLoanAccountOvComBal;
    }

    /**
     * Sets the value of the outLoanAccountOvComBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountOvComBal(BigDecimal value) {
        this.outLoanAccountOvComBal = value;
    }

    /**
     * Gets the value of the outLoanAccountOvExpBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountOvExpBal() {
        return outLoanAccountOvExpBal;
    }

    /**
     * Sets the value of the outLoanAccountOvExpBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountOvExpBal(BigDecimal value) {
        this.outLoanAccountOvExpBal = value;
    }

    /**
     * Gets the value of the outLoanAccountOvExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountOvExpDt() {
        return outLoanAccountOvExpDt;
    }

    /**
     * Sets the value of the outLoanAccountOvExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountOvExpDt(XMLGregorianCalendar value) {
        this.outLoanAccountOvExpDt = value;
    }

    /**
     * Gets the value of the outLoanAccountOvExpExtFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountOvExpExtFlg() {
        return outLoanAccountOvExpExtFlg;
    }

    /**
     * Sets the value of the outLoanAccountOvExpExtFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountOvExpExtFlg(String value) {
        this.outLoanAccountOvExpExtFlg = value;
    }

    /**
     * Gets the value of the outLoanAccountOvInstCnt property.
     * 
     */
    public short getOutLoanAccountOvInstCnt() {
        return outLoanAccountOvInstCnt;
    }

    /**
     * Sets the value of the outLoanAccountOvInstCnt property.
     * 
     */
    public void setOutLoanAccountOvInstCnt(short value) {
        this.outLoanAccountOvInstCnt = value;
    }

    /**
     * Gets the value of the outLoanAccountOvIntCnt property.
     * 
     */
    public short getOutLoanAccountOvIntCnt() {
        return outLoanAccountOvIntCnt;
    }

    /**
     * Sets the value of the outLoanAccountOvIntCnt property.
     * 
     */
    public void setOutLoanAccountOvIntCnt(short value) {
        this.outLoanAccountOvIntCnt = value;
    }

    /**
     * Gets the value of the outLoanAccountOvLoanCnt property.
     * 
     */
    public short getOutLoanAccountOvLoanCnt() {
        return outLoanAccountOvLoanCnt;
    }

    /**
     * Sets the value of the outLoanAccountOvLoanCnt property.
     * 
     */
    public void setOutLoanAccountOvLoanCnt(short value) {
        this.outLoanAccountOvLoanCnt = value;
    }

    /**
     * Gets the value of the outLoanAccountOvRlNrmIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountOvRlNrmIntBal() {
        return outLoanAccountOvRlNrmIntBal;
    }

    /**
     * Sets the value of the outLoanAccountOvRlNrmIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountOvRlNrmIntBal(BigDecimal value) {
        this.outLoanAccountOvRlNrmIntBal = value;
    }

    /**
     * Gets the value of the outLoanAccountOvRlPnlIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountOvRlPnlIntBal() {
        return outLoanAccountOvRlPnlIntBal;
    }

    /**
     * Sets the value of the outLoanAccountOvRlPnlIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountOvRlPnlIntBal(BigDecimal value) {
        this.outLoanAccountOvRlPnlIntBal = value;
    }

    /**
     * Gets the value of the outLoanAccountOvSubsidyBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountOvSubsidyBal() {
        return outLoanAccountOvSubsidyBal;
    }

    /**
     * Sets the value of the outLoanAccountOvSubsidyBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountOvSubsidyBal(BigDecimal value) {
        this.outLoanAccountOvSubsidyBal = value;
    }

    /**
     * Gets the value of the outLoanAccountOvUrlNrmIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountOvUrlNrmIntBal() {
        return outLoanAccountOvUrlNrmIntBal;
    }

    /**
     * Sets the value of the outLoanAccountOvUrlNrmIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountOvUrlNrmIntBal(BigDecimal value) {
        this.outLoanAccountOvUrlNrmIntBal = value;
    }

    /**
     * Gets the value of the outLoanAccountOvUrlPnlIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountOvUrlPnlIntBal() {
        return outLoanAccountOvUrlPnlIntBal;
    }

    /**
     * Sets the value of the outLoanAccountOvUrlPnlIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountOvUrlPnlIntBal(BigDecimal value) {
        this.outLoanAccountOvUrlPnlIntBal = value;
    }

    /**
     * Gets the value of the outLoanAccountOvUrlPubIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountOvUrlPubIntAmn() {
        return outLoanAccountOvUrlPubIntAmn;
    }

    /**
     * Sets the value of the outLoanAccountOvUrlPubIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountOvUrlPubIntAmn(BigDecimal value) {
        this.outLoanAccountOvUrlPubIntAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountPrvFxIntExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountPrvFxIntExpDt() {
        return outLoanAccountPrvFxIntExpDt;
    }

    /**
     * Sets the value of the outLoanAccountPrvFxIntExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountPrvFxIntExpDt(XMLGregorianCalendar value) {
        this.outLoanAccountPrvFxIntExpDt = value;
    }

    /**
     * Gets the value of the outLoanAccountPrvFxIntScalDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountPrvFxIntScalDt() {
        return outLoanAccountPrvFxIntScalDt;
    }

    /**
     * Sets the value of the outLoanAccountPrvFxIntScalDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountPrvFxIntScalDt(XMLGregorianCalendar value) {
        this.outLoanAccountPrvFxIntScalDt = value;
    }

    /**
     * Gets the value of the outLoanAccountPrvFxIntStDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountPrvFxIntStDt() {
        return outLoanAccountPrvFxIntStDt;
    }

    /**
     * Sets the value of the outLoanAccountPrvFxIntStDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountPrvFxIntStDt(XMLGregorianCalendar value) {
        this.outLoanAccountPrvFxIntStDt = value;
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
     * Gets the value of the outLoanAccountRecyclingFrq property.
     * 
     */
    public short getOutLoanAccountRecyclingFrq() {
        return outLoanAccountRecyclingFrq;
    }

    /**
     * Sets the value of the outLoanAccountRecyclingFrq property.
     * 
     */
    public void setOutLoanAccountRecyclingFrq(short value) {
        this.outLoanAccountRecyclingFrq = value;
    }

    /**
     * Gets the value of the outLoanAccountRecyclingLmtFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountRecyclingLmtFlg() {
        return outLoanAccountRecyclingLmtFlg;
    }

    /**
     * Sets the value of the outLoanAccountRecyclingLmtFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountRecyclingLmtFlg(String value) {
        this.outLoanAccountRecyclingLmtFlg = value;
    }

    /**
     * Gets the value of the outLoanAccountReqExpSn property.
     * 
     */
    public short getOutLoanAccountReqExpSn() {
        return outLoanAccountReqExpSn;
    }

    /**
     * Sets the value of the outLoanAccountReqExpSn property.
     * 
     */
    public void setOutLoanAccountReqExpSn(short value) {
        this.outLoanAccountReqExpSn = value;
    }

    /**
     * Gets the value of the outLoanAccountReqInstallSn property.
     * 
     */
    public short getOutLoanAccountReqInstallSn() {
        return outLoanAccountReqInstallSn;
    }

    /**
     * Sets the value of the outLoanAccountReqInstallSn property.
     * 
     */
    public void setOutLoanAccountReqInstallSn(short value) {
        this.outLoanAccountReqInstallSn = value;
    }

    /**
     * Gets the value of the outLoanAccountReqIntSn property.
     * 
     */
    public short getOutLoanAccountReqIntSn() {
        return outLoanAccountReqIntSn;
    }

    /**
     * Sets the value of the outLoanAccountReqIntSn property.
     * 
     */
    public void setOutLoanAccountReqIntSn(short value) {
        this.outLoanAccountReqIntSn = value;
    }

    /**
     * Gets the value of the outLoanAccountReqLoanSn property.
     * 
     */
    public short getOutLoanAccountReqLoanSn() {
        return outLoanAccountReqLoanSn;
    }

    /**
     * Sets the value of the outLoanAccountReqLoanSn property.
     * 
     */
    public void setOutLoanAccountReqLoanSn(short value) {
        this.outLoanAccountReqLoanSn = value;
    }

    /**
     * Gets the value of the outLoanAccountShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountShortName() {
        return outLoanAccountShortName;
    }

    /**
     * Sets the value of the outLoanAccountShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountShortName(String value) {
        this.outLoanAccountShortName = value;
    }

    /**
     * Gets the value of the outLoanAccountSpreadEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountSpreadEndDt() {
        return outLoanAccountSpreadEndDt;
    }

    /**
     * Sets the value of the outLoanAccountSpreadEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountSpreadEndDt(XMLGregorianCalendar value) {
        this.outLoanAccountSpreadEndDt = value;
    }

    /**
     * Gets the value of the outLoanAccountSpreadFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountSpreadFlg() {
        return outLoanAccountSpreadFlg;
    }

    /**
     * Sets the value of the outLoanAccountSpreadFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountSpreadFlg(String value) {
        this.outLoanAccountSpreadFlg = value;
    }

    /**
     * Gets the value of the outLoanAccountStatementFreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountStatementFreq() {
        return outLoanAccountStatementFreq;
    }

    /**
     * Sets the value of the outLoanAccountStatementFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountStatementFreq(String value) {
        this.outLoanAccountStatementFreq = value;
    }

    /**
     * Gets the value of the outLoanAccountSubsidyDuration property.
     * 
     */
    public short getOutLoanAccountSubsidyDuration() {
        return outLoanAccountSubsidyDuration;
    }

    /**
     * Sets the value of the outLoanAccountSubsidyDuration property.
     * 
     */
    public void setOutLoanAccountSubsidyDuration(short value) {
        this.outLoanAccountSubsidyDuration = value;
    }

    /**
     * Gets the value of the outLoanAccountSubsidyEndFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountSubsidyEndFlg() {
        return outLoanAccountSubsidyEndFlg;
    }

    /**
     * Sets the value of the outLoanAccountSubsidyEndFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountSubsidyEndFlg(String value) {
        this.outLoanAccountSubsidyEndFlg = value;
    }

    /**
     * Gets the value of the outLoanAccountSubsidyExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountSubsidyExpDt() {
        return outLoanAccountSubsidyExpDt;
    }

    /**
     * Sets the value of the outLoanAccountSubsidyExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountSubsidyExpDt(XMLGregorianCalendar value) {
        this.outLoanAccountSubsidyExpDt = value;
    }

    /**
     * Gets the value of the outLoanAccountSubsidyLimitAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountSubsidyLimitAmn() {
        return outLoanAccountSubsidyLimitAmn;
    }

    /**
     * Sets the value of the outLoanAccountSubsidyLimitAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountSubsidyLimitAmn(BigDecimal value) {
        this.outLoanAccountSubsidyLimitAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountSubsidyStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountSubsidyStartDt() {
        return outLoanAccountSubsidyStartDt;
    }

    /**
     * Sets the value of the outLoanAccountSubsidyStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountSubsidyStartDt(XMLGregorianCalendar value) {
        this.outLoanAccountSubsidyStartDt = value;
    }

    /**
     * Gets the value of the outLoanAccountTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountTmstamp() {
        return outLoanAccountTmstamp;
    }

    /**
     * Sets the value of the outLoanAccountTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountTmstamp(XMLGregorianCalendar value) {
        this.outLoanAccountTmstamp = value;
    }

    /**
     * Gets the value of the outLoanAccountToleranceDays property.
     * 
     */
    public short getOutLoanAccountToleranceDays() {
        return outLoanAccountToleranceDays;
    }

    /**
     * Sets the value of the outLoanAccountToleranceDays property.
     * 
     */
    public void setOutLoanAccountToleranceDays(short value) {
        this.outLoanAccountToleranceDays = value;
    }

    /**
     * Gets the value of the outLoanAccountTotCapAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountTotCapAmn() {
        return outLoanAccountTotCapAmn;
    }

    /**
     * Sets the value of the outLoanAccountTotCapAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountTotCapAmn(BigDecimal value) {
        this.outLoanAccountTotCapAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountTotComInCcAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountTotComInCcAmn() {
        return outLoanAccountTotComInCcAmn;
    }

    /**
     * Sets the value of the outLoanAccountTotComInCcAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountTotComInCcAmn(BigDecimal value) {
        this.outLoanAccountTotComInCcAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountTotCommissionAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountTotCommissionAmn() {
        return outLoanAccountTotCommissionAmn;
    }

    /**
     * Sets the value of the outLoanAccountTotCommissionAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountTotCommissionAmn(BigDecimal value) {
        this.outLoanAccountTotCommissionAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountTotConfirmAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountTotConfirmAmn() {
        return outLoanAccountTotConfirmAmn;
    }

    /**
     * Sets the value of the outLoanAccountTotConfirmAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountTotConfirmAmn(BigDecimal value) {
        this.outLoanAccountTotConfirmAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountTotDrawdownAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountTotDrawdownAmn() {
        return outLoanAccountTotDrawdownAmn;
    }

    /**
     * Sets the value of the outLoanAccountTotDrawdownAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountTotDrawdownAmn(BigDecimal value) {
        this.outLoanAccountTotDrawdownAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountTotExpInCcAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountTotExpInCcAmn() {
        return outLoanAccountTotExpInCcAmn;
    }

    /**
     * Sets the value of the outLoanAccountTotExpInCcAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountTotExpInCcAmn(BigDecimal value) {
        this.outLoanAccountTotExpInCcAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountTotExpenseAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountTotExpenseAmn() {
        return outLoanAccountTotExpenseAmn;
    }

    /**
     * Sets the value of the outLoanAccountTotExpenseAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountTotExpenseAmn(BigDecimal value) {
        this.outLoanAccountTotExpenseAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountTotIntSprdAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountTotIntSprdAmn() {
        return outLoanAccountTotIntSprdAmn;
    }

    /**
     * Sets the value of the outLoanAccountTotIntSprdAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountTotIntSprdAmn(BigDecimal value) {
        this.outLoanAccountTotIntSprdAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountTotNrmIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountTotNrmIntAmn() {
        return outLoanAccountTotNrmIntAmn;
    }

    /**
     * Sets the value of the outLoanAccountTotNrmIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountTotNrmIntAmn(BigDecimal value) {
        this.outLoanAccountTotNrmIntAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountTotPnlIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountTotPnlIntAmn() {
        return outLoanAccountTotPnlIntAmn;
    }

    /**
     * Sets the value of the outLoanAccountTotPnlIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountTotPnlIntAmn(BigDecimal value) {
        this.outLoanAccountTotPnlIntAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountTotPubCommAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountTotPubCommAmn() {
        return outLoanAccountTotPubCommAmn;
    }

    /**
     * Sets the value of the outLoanAccountTotPubCommAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountTotPubCommAmn(BigDecimal value) {
        this.outLoanAccountTotPubCommAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountTotSubsIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountTotSubsIntAmn() {
        return outLoanAccountTotSubsIntAmn;
    }

    /**
     * Sets the value of the outLoanAccountTotSubsIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountTotSubsIntAmn(BigDecimal value) {
        this.outLoanAccountTotSubsIntAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountTotThrdprtAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountTotThrdprtAmn() {
        return outLoanAccountTotThrdprtAmn;
    }

    /**
     * Sets the value of the outLoanAccountTotThrdprtAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountTotThrdprtAmn(BigDecimal value) {
        this.outLoanAccountTotThrdprtAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountUnit property.
     * 
     */
    public int getOutLoanAccountUnit() {
        return outLoanAccountUnit;
    }

    /**
     * Sets the value of the outLoanAccountUnit property.
     * 
     */
    public void setOutLoanAccountUnit(int value) {
        this.outLoanAccountUnit = value;
    }

    /**
     * Gets the value of the outLoanAccountUnpaidCollCnt property.
     * 
     */
    public short getOutLoanAccountUnpaidCollCnt() {
        return outLoanAccountUnpaidCollCnt;
    }

    /**
     * Sets the value of the outLoanAccountUnpaidCollCnt property.
     * 
     */
    public void setOutLoanAccountUnpaidCollCnt(short value) {
        this.outLoanAccountUnpaidCollCnt = value;
    }

    /**
     * Gets the value of the outLoanAccountUnrealizedFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountUnrealizedFlg() {
        return outLoanAccountUnrealizedFlg;
    }

    /**
     * Sets the value of the outLoanAccountUnrealizedFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountUnrealizedFlg(String value) {
        this.outLoanAccountUnrealizedFlg = value;
    }

    /**
     * Gets the value of the outLoanAccountUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountUsr() {
        return outLoanAccountUsr;
    }

    /**
     * Sets the value of the outLoanAccountUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountUsr(String value) {
        this.outLoanAccountUsr = value;
    }

    /**
     * Gets the value of the outLoanAccountVillageSn property.
     * 
     */
    public int getOutLoanAccountVillageSn() {
        return outLoanAccountVillageSn;
    }

    /**
     * Sets the value of the outLoanAccountVillageSn property.
     * 
     */
    public void setOutLoanAccountVillageSn(int value) {
        this.outLoanAccountVillageSn = value;
    }

    /**
     * Gets the value of the outLoanParametersGetLoanInterest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanParametersGetLoanInterest() {
        return outLoanParametersGetLoanInterest;
    }

    /**
     * Sets the value of the outLoanParametersGetLoanInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanParametersGetLoanInterest(String value) {
        this.outLoanParametersGetLoanInterest = value;
    }

    /**
     * Gets the value of the outLoanParametersM4ApproachMeth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanParametersM4ApproachMeth() {
        return outLoanParametersM4ApproachMeth;
    }

    /**
     * Sets the value of the outLoanParametersM4ApproachMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanParametersM4ApproachMeth(String value) {
        this.outLoanParametersM4ApproachMeth = value;
    }

    /**
     * Gets the value of the outLoanParametersServerRepAppr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanParametersServerRepAppr() {
        return outLoanParametersServerRepAppr;
    }

    /**
     * Sets the value of the outLoanParametersServerRepAppr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanParametersServerRepAppr(String value) {
        this.outLoanParametersServerRepAppr = value;
    }

    /**
     * Gets the value of the outLoanStepIntInstallmentWorkFirstInstallmentIntAnm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanStepIntInstallmentWorkFirstInstallmentIntAnm() {
        return outLoanStepIntInstallmentWorkFirstInstallmentIntAnm;
    }

    /**
     * Sets the value of the outLoanStepIntInstallmentWorkFirstInstallmentIntAnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanStepIntInstallmentWorkFirstInstallmentIntAnm(BigDecimal value) {
        this.outLoanStepIntInstallmentWorkFirstInstallmentIntAnm = value;
    }

    /**
     * Gets the value of the outLoanStepIntInstallmentWorkStep property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanStepIntInstallmentWorkStep() {
        return outLoanStepIntInstallmentWorkStep;
    }

    /**
     * Sets the value of the outLoanStepIntInstallmentWorkStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanStepIntInstallmentWorkStep(BigDecimal value) {
        this.outLoanStepIntInstallmentWorkStep = value;
    }

    /**
     * Gets the value of the outMech4InstChgFlgLoanInstallmentMechanismInstallChgFlg property.
     * 
     */
    public short getOutMech4InstChgFlgLoanInstallmentMechanismInstallChgFlg() {
        return outMech4InstChgFlgLoanInstallmentMechanismInstallChgFlg;
    }

    /**
     * Sets the value of the outMech4InstChgFlgLoanInstallmentMechanismInstallChgFlg property.
     * 
     */
    public void setOutMech4InstChgFlgLoanInstallmentMechanismInstallChgFlg(short value) {
        this.outMech4InstChgFlgLoanInstallmentMechanismInstallChgFlg = value;
    }

    /**
     * Gets the value of the outMech4InstChgFlgLoanInstallmentMechanismInstallChgNum property.
     * 
     */
    public short getOutMech4InstChgFlgLoanInstallmentMechanismInstallChgNum() {
        return outMech4InstChgFlgLoanInstallmentMechanismInstallChgNum;
    }

    /**
     * Sets the value of the outMech4InstChgFlgLoanInstallmentMechanismInstallChgNum property.
     * 
     */
    public void setOutMech4InstChgFlgLoanInstallmentMechanismInstallChgNum(short value) {
        this.outMech4InstChgFlgLoanInstallmentMechanismInstallChgNum = value;
    }

    /**
     * Gets the value of the outMech4InstChgFlgLoanInstallmentMechanismInstallMechFlg property.
     * 
     */
    public short getOutMech4InstChgFlgLoanInstallmentMechanismInstallMechFlg() {
        return outMech4InstChgFlgLoanInstallmentMechanismInstallMechFlg;
    }

    /**
     * Sets the value of the outMech4InstChgFlgLoanInstallmentMechanismInstallMechFlg property.
     * 
     */
    public void setOutMech4InstChgFlgLoanInstallmentMechanismInstallMechFlg(short value) {
        this.outMech4InstChgFlgLoanInstallmentMechanismInstallMechFlg = value;
    }

    /**
     * Gets the value of the outMech4InstChgFlgLoanInstallmentMechanismInstallNum property.
     * 
     */
    public short getOutMech4InstChgFlgLoanInstallmentMechanismInstallNum() {
        return outMech4InstChgFlgLoanInstallmentMechanismInstallNum;
    }

    /**
     * Sets the value of the outMech4InstChgFlgLoanInstallmentMechanismInstallNum property.
     * 
     */
    public void setOutMech4InstChgFlgLoanInstallmentMechanismInstallNum(short value) {
        this.outMech4InstChgFlgLoanInstallmentMechanismInstallNum = value;
    }

    /**
     * Gets the value of the outMech4InstChgFlgLoanInstallmentMechanismInstallSkipCap property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutMech4InstChgFlgLoanInstallmentMechanismInstallSkipCap() {
        return outMech4InstChgFlgLoanInstallmentMechanismInstallSkipCap;
    }

    /**
     * Sets the value of the outMech4InstChgFlgLoanInstallmentMechanismInstallSkipCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutMech4InstChgFlgLoanInstallmentMechanismInstallSkipCap(BigDecimal value) {
        this.outMech4InstChgFlgLoanInstallmentMechanismInstallSkipCap = value;
    }

    /**
     * Gets the value of the outMech4InstChgFlgLoanInstallmentMechanismInstallSkipInt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutMech4InstChgFlgLoanInstallmentMechanismInstallSkipInt() {
        return outMech4InstChgFlgLoanInstallmentMechanismInstallSkipInt;
    }

    /**
     * Sets the value of the outMech4InstChgFlgLoanInstallmentMechanismInstallSkipInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutMech4InstChgFlgLoanInstallmentMechanismInstallSkipInt(BigDecimal value) {
        this.outMech4InstChgFlgLoanInstallmentMechanismInstallSkipInt = value;
    }

    /**
     * Gets the value of the outMech4InstChgFlgLoanInstallmentMechanismInstallTot property.
     * 
     */
    public short getOutMech4InstChgFlgLoanInstallmentMechanismInstallTot() {
        return outMech4InstChgFlgLoanInstallmentMechanismInstallTot;
    }

    /**
     * Sets the value of the outMech4InstChgFlgLoanInstallmentMechanismInstallTot property.
     * 
     */
    public void setOutMech4InstChgFlgLoanInstallmentMechanismInstallTot(short value) {
        this.outMech4InstChgFlgLoanInstallmentMechanismInstallTot = value;
    }

    /**
     * Gets the value of the outMonthCharSuppliedChar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMonthCharSuppliedChar20() {
        return outMonthCharSuppliedChar20;
    }

    /**
     * Sets the value of the outMonthCharSuppliedChar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMonthCharSuppliedChar20(String value) {
        this.outMonthCharSuppliedChar20 = value;
    }

    /**
     * Gets the value of the outN128InterestLnsInterestDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutN128InterestLnsInterestDescription() {
        return outN128InterestLnsInterestDescription;
    }

    /**
     * Sets the value of the outN128InterestLnsInterestDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutN128InterestLnsInterestDescription(String value) {
        this.outN128InterestLnsInterestDescription = value;
    }

    /**
     * Gets the value of the outN128InterestLnsInterestIdInterest property.
     * 
     */
    public int getOutN128InterestLnsInterestIdInterest() {
        return outN128InterestLnsInterestIdInterest;
    }

    /**
     * Sets the value of the outN128InterestLnsInterestIdInterest property.
     * 
     */
    public void setOutN128InterestLnsInterestIdInterest(int value) {
        this.outN128InterestLnsInterestIdInterest = value;
    }

    /**
     * Gets the value of the outN128InterestSupplyWorkFixedInterestPrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutN128InterestSupplyWorkFixedInterestPrc() {
        return outN128InterestSupplyWorkFixedInterestPrc;
    }

    /**
     * Sets the value of the outN128InterestSupplyWorkFixedInterestPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutN128InterestSupplyWorkFixedInterestPrc(BigDecimal value) {
        this.outN128InterestSupplyWorkFixedInterestPrc = value;
    }

    /**
     * Gets the value of the outSepeLoanInstallmentInfoInstallDbIntPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSepeLoanInstallmentInfoInstallDbIntPerc() {
        return outSepeLoanInstallmentInfoInstallDbIntPerc;
    }

    /**
     * Sets the value of the outSepeLoanInstallmentInfoInstallDbIntPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSepeLoanInstallmentInfoInstallDbIntPerc(BigDecimal value) {
        this.outSepeLoanInstallmentInfoInstallDbIntPerc = value;
    }

    /**
     * Gets the value of the outTotalsLoanInstallmentInfoInstallCapAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalsLoanInstallmentInfoInstallCapAmn() {
        return outTotalsLoanInstallmentInfoInstallCapAmn;
    }

    /**
     * Sets the value of the outTotalsLoanInstallmentInfoInstallCapAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalsLoanInstallmentInfoInstallCapAmn(BigDecimal value) {
        this.outTotalsLoanInstallmentInfoInstallCapAmn = value;
    }

    /**
     * Gets the value of the outTotalsLoanInstallmentInfoInstallEfteAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalsLoanInstallmentInfoInstallEfteAmn() {
        return outTotalsLoanInstallmentInfoInstallEfteAmn;
    }

    /**
     * Sets the value of the outTotalsLoanInstallmentInfoInstallEfteAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalsLoanInstallmentInfoInstallEfteAmn(BigDecimal value) {
        this.outTotalsLoanInstallmentInfoInstallEfteAmn = value;
    }

    /**
     * Gets the value of the outTotalsLoanInstallmentInfoInstallInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalsLoanInstallmentInfoInstallInsurance() {
        return outTotalsLoanInstallmentInfoInstallInsurance;
    }

    /**
     * Sets the value of the outTotalsLoanInstallmentInfoInstallInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalsLoanInstallmentInfoInstallInsurance(BigDecimal value) {
        this.outTotalsLoanInstallmentInfoInstallInsurance = value;
    }

    /**
     * Gets the value of the outTotalsLoanInstallmentInfoInstallIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalsLoanInstallmentInfoInstallIntAmn() {
        return outTotalsLoanInstallmentInfoInstallIntAmn;
    }

    /**
     * Sets the value of the outTotalsLoanInstallmentInfoInstallIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalsLoanInstallmentInfoInstallIntAmn(BigDecimal value) {
        this.outTotalsLoanInstallmentInfoInstallIntAmn = value;
    }

    /**
     * Gets the value of the outTotalsLoanInstallmentInfoInstallN128Amn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalsLoanInstallmentInfoInstallN128Amn() {
        return outTotalsLoanInstallmentInfoInstallN128Amn;
    }

    /**
     * Sets the value of the outTotalsLoanInstallmentInfoInstallN128Amn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalsLoanInstallmentInfoInstallN128Amn(BigDecimal value) {
        this.outTotalsLoanInstallmentInfoInstallN128Amn = value;
    }

    /**
     * Gets the value of the outTotalsLoanInstallmentInfoInstallSpreadAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalsLoanInstallmentInfoInstallSpreadAmn() {
        return outTotalsLoanInstallmentInfoInstallSpreadAmn;
    }

    /**
     * Sets the value of the outTotalsLoanInstallmentInfoInstallSpreadAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalsLoanInstallmentInfoInstallSpreadAmn(BigDecimal value) {
        this.outTotalsLoanInstallmentInfoInstallSpreadAmn = value;
    }

    /**
     * Gets the value of the outTotalsLoanInstallmentInfoInstallSubsidyAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalsLoanInstallmentInfoInstallSubsidyAmn() {
        return outTotalsLoanInstallmentInfoInstallSubsidyAmn;
    }

    /**
     * Sets the value of the outTotalsLoanInstallmentInfoInstallSubsidyAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalsLoanInstallmentInfoInstallSubsidyAmn(BigDecimal value) {
        this.outTotalsLoanInstallmentInfoInstallSubsidyAmn = value;
    }

    /**
     * Gets the value of the outTotalsLoanInstallmentInfoInstallmentAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalsLoanInstallmentInfoInstallmentAmn() {
        return outTotalsLoanInstallmentInfoInstallmentAmn;
    }

    /**
     * Sets the value of the outTotalsLoanInstallmentInfoInstallmentAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalsLoanInstallmentInfoInstallmentAmn(BigDecimal value) {
        this.outTotalsLoanInstallmentInfoInstallmentAmn = value;
    }

    /**
     * Gets the value of the outTotalsLoanInstallmentInfoRemainingCapitalAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalsLoanInstallmentInfoRemainingCapitalAmn() {
        return outTotalsLoanInstallmentInfoRemainingCapitalAmn;
    }

    /**
     * Sets the value of the outTotalsLoanInstallmentInfoRemainingCapitalAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalsLoanInstallmentInfoRemainingCapitalAmn(BigDecimal value) {
        this.outTotalsLoanInstallmentInfoRemainingCapitalAmn = value;
    }

    /**
     * Gets the value of the outTotalsLoanInstallmentInfoTotalChargeAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalsLoanInstallmentInfoTotalChargeAmn() {
        return outTotalsLoanInstallmentInfoTotalChargeAmn;
    }

    /**
     * Sets the value of the outTotalsLoanInstallmentInfoTotalChargeAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalsLoanInstallmentInfoTotalChargeAmn(BigDecimal value) {
        this.outTotalsLoanInstallmentInfoTotalChargeAmn = value;
    }

    /**
     * Gets the value of the outTotalsLoanInstallmentInfoTotalInsuranceAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalsLoanInstallmentInfoTotalInsuranceAmn() {
        return outTotalsLoanInstallmentInfoTotalInsuranceAmn;
    }

    /**
     * Sets the value of the outTotalsLoanInstallmentInfoTotalInsuranceAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalsLoanInstallmentInfoTotalInsuranceAmn(BigDecimal value) {
        this.outTotalsLoanInstallmentInfoTotalInsuranceAmn = value;
    }

    /**
     * Gets the value of the outTotalsLoanInstallmentInfoTotalIntPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalsLoanInstallmentInfoTotalIntPerc() {
        return outTotalsLoanInstallmentInfoTotalIntPerc;
    }

    /**
     * Sets the value of the outTotalsLoanInstallmentInfoTotalIntPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalsLoanInstallmentInfoTotalIntPerc(BigDecimal value) {
        this.outTotalsLoanInstallmentInfoTotalIntPerc = value;
    }

    /**
     * Gets the value of the outTotalsLoanInstallmentInfoTotalRoundingAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalsLoanInstallmentInfoTotalRoundingAmn() {
        return outTotalsLoanInstallmentInfoTotalRoundingAmn;
    }

    /**
     * Sets the value of the outTotalsLoanInstallmentInfoTotalRoundingAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalsLoanInstallmentInfoTotalRoundingAmn(BigDecimal value) {
        this.outTotalsLoanInstallmentInfoTotalRoundingAmn = value;
    }

    /**
     * Gets the value of the tonyOutGracePeriodTotalLoanInstallmentInfoStartingCapitalAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTonyOutGracePeriodTotalLoanInstallmentInfoStartingCapitalAmn() {
        return tonyOutGracePeriodTotalLoanInstallmentInfoStartingCapitalAmn;
    }

    /**
     * Sets the value of the tonyOutGracePeriodTotalLoanInstallmentInfoStartingCapitalAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTonyOutGracePeriodTotalLoanInstallmentInfoStartingCapitalAmn(BigDecimal value) {
        this.tonyOutGracePeriodTotalLoanInstallmentInfoStartingCapitalAmn = value;
    }

    /**
     * Gets the value of the outTotalLoanIefSuppliedTotalInteger property.
     * 
     */
    public double getOutTotalLoanIefSuppliedTotalInteger() {
        return outTotalLoanIefSuppliedTotalInteger;
    }

    /**
     * Sets the value of the outTotalLoanIefSuppliedTotalInteger property.
     * 
     */
    public void setOutTotalLoanIefSuppliedTotalInteger(double value) {
        this.outTotalLoanIefSuppliedTotalInteger = value;
    }

    /**
     * Gets the value of the outTotalsLoanInstallmentInfoInstallComAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalsLoanInstallmentInfoInstallComAmn() {
        return outTotalsLoanInstallmentInfoInstallComAmn;
    }

    /**
     * Sets the value of the outTotalsLoanInstallmentInfoInstallComAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalsLoanInstallmentInfoInstallComAmn(BigDecimal value) {
        this.outTotalsLoanInstallmentInfoInstallComAmn = value;
    }

}
