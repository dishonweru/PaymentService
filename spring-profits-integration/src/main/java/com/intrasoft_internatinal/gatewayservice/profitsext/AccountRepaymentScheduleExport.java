
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AccountRepaymentScheduleExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountRepaymentScheduleExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutAccMechanismCharSuppliedChar20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAccMovementCurrencyDaysbase" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutAccMovementCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAccMovementCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAccountStatusCharSuppliedChar20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustNameListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepositProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEnoikiagoraRoundIntIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFirstFixedInterestSupplyWorkCurFxIntScalDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutFirstFixedInterestSupplyWorkFixedInterestPrc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFixed360365IefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFixedInterestSupplyWorkCurFxIntScalDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutFixedInterestSupplyWorkFixedInterestPrc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFlex50LoanAddInfoAccSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutFlex50LoanAddInfoAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutFlex50LoanAddInfoAccUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutFlex50LoanAddInfoAmountData" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFlex50LoanAddInfoDateData" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutFlex50LoanAddInfoNumData" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutFlex50LoanAddInfoRateData" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFlex50LoanAddInfoRowId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutFlex50LoanAddInfoRowInternalSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutFlex50LoanAddInfoShowFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFlex50LoanAddInfoTextData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFlex50LoanAddInfoTmstampData" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutFloating360365IefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFloatingInterestSupplyWorkCurFxIntScalDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutFloatingInterestSupplyWorkFixedInterestPrc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAnnualLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpInstallmentsLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLogLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInstallmentDetailsLoanInstallmentsCapitalAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutInstallmentDetailsLoanInstallmentsCostOfOptionAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutInstallmentDetailsLoanInstallmentsDateInterChanged" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutInstallmentDetailsLoanInstallmentsDbInterestAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutInstallmentDetailsLoanInstallmentsInstallAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutInstallmentDetailsLoanInstallmentsInstallInsurance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutInstallmentDetailsLoanInstallmentsInterestAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutInstallmentDetailsLoanInstallmentsN128InterestAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutInstallmentDetailsLoanInstallmentsN128InterPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutInstallmentDetailsLoanInstallmentsNormalInterPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutInstallmentDetailsLoanInstallmentsRemainCapAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutInstallmentDetailsLoanInstallmentsRequestDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutInstallmentDetailsLoanInstallmentsRequestPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInstallmentDetailsLoanInstallmentsRequestSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInstallmentDetailsLoanInstallmentsRequestType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInstallmentDetailsLoanInstallmentsRoundingAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutInstallmentDetailsLoanInstallmentsSprdInterestAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutInstallmentDetailsLoanInstallmentsSpreadInterPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutInstallmentDetailsLoanInstallmentsSubs2InterestAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutInstallmentDetailsLoanInstallmentsSubsidy2InterPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutInstallmentDetailsLoanInstallmentsSubsidyInterPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutInstallmentDetailsLoanInstallmentsSubsInterestAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutInsuranceProductIssCommitmentTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutLastMpEndAmountLoanInstallmentInfoStartingCapitalAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAsoInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAtmCardFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanCapitalTolerance" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanCollRequestLimit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanCurFxIntInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanCurrInterestPrd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanDdAccrLstDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanDepositAccFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanDiffIntAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanDurationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanDurationUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanGeneralFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanGracePrdUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanInstallMechFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanInstallTolerance" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanInstallUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanInstantCreditFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanIntCapitalFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanInterDaysInst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanInterestTolerance" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanInterestUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanIntPayableFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanIpIntCapitalFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanIpIntPayableFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanLoanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanLstPrintTransDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanLumpDrawdown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanMaxGracePrdFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanMaxInstallCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanMaxInstallFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanMaxInterestFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanMaxLoanDurat" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanMaxOverdueDurat" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanMaxRecycleDurat" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanMinGracePrdFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanMinInstallCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanMinInstallFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanMinInterestFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanMinLoanDurat" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanMinPaymentAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanMinPaymentPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanMinRecycleDurat" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanMoratIntPayFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanNoIntMoratorFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanNonIntCapitFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanNrmAccrLstDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanNrmInterestDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanNrmInterestFreq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanNrmInterestUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanNrmLstValeurDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanNrmNxtValeurDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanNxtPrintTransDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanOvAccrLstDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanOvInterestFreq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanOvInterestUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanPeriodicIntFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanPrintStatementDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanRecycleUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanRecyclingLmtFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanRenewalInterFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanRiskFactor" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanSelectIntFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanTolDays1" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanTolDays2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanTolDays3" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanTolDays5" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanToleranceDays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountAccExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountAccMechanism" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountAccOpenDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountCurFxIntExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoanAccountDrawdownExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountDrawdownFstAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountInstallChgNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountInstallCount" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountInstallFirstDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountInstallFreq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountInstallMechFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountInstallPrevDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountInstallSkipCap" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountInstallSkipInt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountInterCapitalizeFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountInterRateSprd" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountLoanStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountNrmExpBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountOvExpBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountPrvFxIntExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountReqInstallSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountSpreadEndDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountTotExpenseAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountInfoAutFixIntRenew" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountInfoFluctuationRange" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountInfoInitialInterest" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountInfoMoratIntPayFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountInfoMoratoriumIntDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountInfoMoratoriumIntFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountInfoSelectedBankRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanInstallmentInfoStartingCapitalAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanInstallmentInfoTotalCostoptAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanInstallmentInfoTotalDbInterestAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanInstallmentInfoTotalExpensesAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanInstallmentInfoTotalGraceInterAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanInstallmentInfoTotalInsuranceAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanInstallmentInfoTotalInterestAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanInstallmentInfoTotalN128Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanInstallmentInfoTotalRoundingAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanInstallmentInfoTotalSpreadAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanInstallmentInfoTotalSubsidy2Amn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanInstallmentInfoTotalSubsidyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoanStatusCharSuppliedChar20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanStepIntInstallmentWorkFirstInstallmentIntAnm" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanStepIntInstallmentWorkStep" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanWorkFlgsEqInterestFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanWorkFlgsVariableInstalmentFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoopFlagIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLssMoratInterestSupplyWorkMoratorN128Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLssMoratInterestSupplyWorkMoratorNrmRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLssMoratInterestSupplyWorkMoratorSprRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLssMoratInterestSupplyWorkMoratorSubs2Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLssMoratInterestSupplyWorkMoratorSubsRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutMaintainEqInstLoanAccountInfoMaintainEqInst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMpEndAmnLoanInstallmentInfoStartingCapitalAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutN128360365IefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutN128InterestSupplyWorkCurFxIntScalDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutN128InterestSupplyWorkFixedInterestPrc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutProduct360365LoanInterDaysInst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSaveResultsInDbIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSecondFixedInterestSupplyWorkCurFxIntScalDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSecondFixedInterestSupplyWorkFixedInterestPrc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSepeLoanInstallmentInfoInstallDbIntPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutShowLiteralIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSubsidyLoanAccountMoratorSprRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSubsidyLoanAccountMoratorSubsRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAnnual" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpAnnual" minOccurs="0"/>
 *         &lt;element name="OutGrpInstallments" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpInstallments" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountRepaymentScheduleExport", propOrder = {
    "outAccMechanismCharSuppliedChar20",
    "outAccMovementCurrencyDaysbase",
    "outAccMovementCurrencyIdCurrency",
    "outAccMovementCurrencyShortDescr",
    "outAccountStatusCharSuppliedChar20",
    "outCustNameListSetDescription",
    "outDepositProfitsAccountAccountCd",
    "outDepositProfitsAccountAccountNumber",
    "outEnoikiagoraRoundIntIefSuppliedNumber152",
    "outFirstFixedInterestSupplyWorkCurFxIntScalDt",
    "outFirstFixedInterestSupplyWorkFixedInterestPrc",
    "outFixed360365IefSuppliedFlag",
    "outFixedInterestSupplyWorkCurFxIntScalDt",
    "outFixedInterestSupplyWorkFixedInterestPrc",
    "outFlex50LoanAddInfoAccSn",
    "outFlex50LoanAddInfoAccType",
    "outFlex50LoanAddInfoAccUnit",
    "outFlex50LoanAddInfoAmountData",
    "outFlex50LoanAddInfoDateData",
    "outFlex50LoanAddInfoNumData",
    "outFlex50LoanAddInfoRateData",
    "outFlex50LoanAddInfoRowId",
    "outFlex50LoanAddInfoRowInternalSn",
    "outFlex50LoanAddInfoShowFlag",
    "outFlex50LoanAddInfoTextData",
    "outFlex50LoanAddInfoTmstampData",
    "outFloating360365IefSuppliedFlag",
    "outFloatingInterestSupplyWorkCurFxIntScalDt",
    "outFloatingInterestSupplyWorkFixedInterestPrc",
    "outGrpAnnualLength",
    "outGrpInstallmentsLength",
    "outGrpLogLength",
    "outInstallmentDetailsLoanInstallmentsCapitalAmn",
    "outInstallmentDetailsLoanInstallmentsCostOfOptionAmn",
    "outInstallmentDetailsLoanInstallmentsDateInterChanged",
    "outInstallmentDetailsLoanInstallmentsDbInterestAmn",
    "outInstallmentDetailsLoanInstallmentsInstallAmn",
    "outInstallmentDetailsLoanInstallmentsInstallInsurance",
    "outInstallmentDetailsLoanInstallmentsInterestAmn",
    "outInstallmentDetailsLoanInstallmentsN128InterestAmn",
    "outInstallmentDetailsLoanInstallmentsN128InterPerc",
    "outInstallmentDetailsLoanInstallmentsNormalInterPerc",
    "outInstallmentDetailsLoanInstallmentsRemainCapAmn",
    "outInstallmentDetailsLoanInstallmentsRequestDt",
    "outInstallmentDetailsLoanInstallmentsRequestPeriod",
    "outInstallmentDetailsLoanInstallmentsRequestSn",
    "outInstallmentDetailsLoanInstallmentsRequestType",
    "outInstallmentDetailsLoanInstallmentsRoundingAmn",
    "outInstallmentDetailsLoanInstallmentsSprdInterestAmn",
    "outInstallmentDetailsLoanInstallmentsSpreadInterPerc",
    "outInstallmentDetailsLoanInstallmentsSubs2InterestAmn",
    "outInstallmentDetailsLoanInstallmentsSubsidy2InterPerc",
    "outInstallmentDetailsLoanInstallmentsSubsidyInterPerc",
    "outInstallmentDetailsLoanInstallmentsSubsInterestAmn",
    "outInsuranceProductIssCommitmentTpSoIdentifier",
    "outLastMpEndAmountLoanInstallmentInfoStartingCapitalAmn",
    "outLoanAsoInd",
    "outLoanAtmCardFlag",
    "outLoanCapitalTolerance",
    "outLoanCollRequestLimit",
    "outLoanCurFxIntInd",
    "outLoanCurrInterestPrd",
    "outLoanDdAccrLstDt",
    "outLoanDepositAccFlg",
    "outLoanDiffIntAlgorithm",
    "outLoanDurationType",
    "outLoanDurationUnit",
    "outLoanEntryStatus",
    "outLoanGeneralFlags",
    "outLoanGracePrdUnit",
    "outLoanInstallMechFlg",
    "outLoanInstallTolerance",
    "outLoanInstallUnit",
    "outLoanInstantCreditFlg",
    "outLoanIntCapitalFlg",
    "outLoanInterDaysInst",
    "outLoanInterestTolerance",
    "outLoanInterestUnit",
    "outLoanIntPayableFlg",
    "outLoanIpIntCapitalFlg",
    "outLoanIpIntPayableFlg",
    "outLoanLoanType",
    "outLoanLstPrintTransDt",
    "outLoanLumpDrawdown",
    "outLoanMaxGracePrdFrq",
    "outLoanMaxInstallCnt",
    "outLoanMaxInstallFrq",
    "outLoanMaxInterestFrq",
    "outLoanMaxLoanDurat",
    "outLoanMaxOverdueDurat",
    "outLoanMaxRecycleDurat",
    "outLoanMinGracePrdFrq",
    "outLoanMinInstallCnt",
    "outLoanMinInstallFrq",
    "outLoanMinInterestFrq",
    "outLoanMinLoanDurat",
    "outLoanMinPaymentAmn",
    "outLoanMinPaymentPerc",
    "outLoanMinRecycleDurat",
    "outLoanMoratIntPayFlg",
    "outLoanNoIntMoratorFlg",
    "outLoanNonIntCapitFlg",
    "outLoanNrmAccrLstDt",
    "outLoanNrmInterestDt",
    "outLoanNrmInterestFreq",
    "outLoanNrmInterestUnit",
    "outLoanNrmLstValeurDt",
    "outLoanNrmNxtValeurDt",
    "outLoanNxtPrintTransDt",
    "outLoanOvAccrLstDt",
    "outLoanOvInterestFreq",
    "outLoanOvInterestUnit",
    "outLoanPeriodicIntFlg",
    "outLoanPrintStatementDt",
    "outLoanRecycleUnit",
    "outLoanRecyclingLmtFlg",
    "outLoanRenewalInterFlg",
    "outLoanRiskFactor",
    "outLoanSelectIntFlg",
    "outLoanTmstamp",
    "outLoanTolDays1",
    "outLoanTolDays2",
    "outLoanTolDays3",
    "outLoanTolDays5",
    "outLoanToleranceDays",
    "outLoanAccountAccExpDt",
    "outLoanAccountAccMechanism",
    "outLoanAccountAccOpenDt",
    "outLoanAccountAccStatus",
    "outLoanAccountCurFxIntExpDt",
    "outLoanAccountCustId",
    "outLoanAccountDrawdownExpDt",
    "outLoanAccountDrawdownFstAmn",
    "outLoanAccountInstallChgNum",
    "outLoanAccountInstallCount",
    "outLoanAccountInstallFirstDt",
    "outLoanAccountInstallFreq",
    "outLoanAccountInstallMechFlg",
    "outLoanAccountInstallPrevDt",
    "outLoanAccountInstallSkipCap",
    "outLoanAccountInstallSkipInt",
    "outLoanAccountInterCapitalizeFlg",
    "outLoanAccountInterRateSprd",
    "outLoanAccountLoanStatus",
    "outLoanAccountNrmExpBal",
    "outLoanAccountOvExpBal",
    "outLoanAccountPrvFxIntExpDt",
    "outLoanAccountReqInstallSn",
    "outLoanAccountSpreadEndDt",
    "outLoanAccountTotExpenseAmn",
    "outLoanAccountInfoAutFixIntRenew",
    "outLoanAccountInfoFluctuationRange",
    "outLoanAccountInfoInitialInterest",
    "outLoanAccountInfoMoratIntPayFlg",
    "outLoanAccountInfoMoratoriumIntDt",
    "outLoanAccountInfoMoratoriumIntFrq",
    "outLoanAccountInfoSelectedBankRate",
    "outLoanInstallmentInfoStartingCapitalAmn",
    "outLoanInstallmentInfoTotalCostoptAmn",
    "outLoanInstallmentInfoTotalDbInterestAmn",
    "outLoanInstallmentInfoTotalExpensesAmount",
    "outLoanInstallmentInfoTotalGraceInterAmn",
    "outLoanInstallmentInfoTotalInsuranceAmn",
    "outLoanInstallmentInfoTotalInterestAmn",
    "outLoanInstallmentInfoTotalN128Amount",
    "outLoanInstallmentInfoTotalRoundingAmn",
    "outLoanInstallmentInfoTotalSpreadAmount",
    "outLoanInstallmentInfoTotalSubsidy2Amn",
    "outLoanInstallmentInfoTotalSubsidyAmount",
    "outLoanProductDescription",
    "outLoanProductIdProduct",
    "outLoanStatusCharSuppliedChar20",
    "outLoanStepIntInstallmentWorkFirstInstallmentIntAnm",
    "outLoanStepIntInstallmentWorkStep",
    "outLoanWorkFlgsEqInterestFlg",
    "outLoanWorkFlgsVariableInstalmentFlg",
    "outLoopFlagIefSuppliedFlag",
    "outLssMoratInterestSupplyWorkMoratorN128Rate",
    "outLssMoratInterestSupplyWorkMoratorNrmRate",
    "outLssMoratInterestSupplyWorkMoratorSprRate",
    "outLssMoratInterestSupplyWorkMoratorSubs2Rate",
    "outLssMoratInterestSupplyWorkMoratorSubsRate",
    "outMaintainEqInstLoanAccountInfoMaintainEqInst",
    "outMpEndAmnLoanInstallmentInfoStartingCapitalAmn",
    "outN128360365IefSuppliedFlag",
    "outN128InterestSupplyWorkCurFxIntScalDt",
    "outN128InterestSupplyWorkFixedInterestPrc",
    "outProduct360365LoanInterDaysInst",
    "outSaveResultsInDbIefSuppliedFlag",
    "outSecondFixedInterestSupplyWorkCurFxIntScalDt",
    "outSecondFixedInterestSupplyWorkFixedInterestPrc",
    "outSepeLoanInstallmentInfoInstallDbIntPerc",
    "outShowLiteralIefSuppliedFlag",
    "outSubsidyLoanAccountMoratorSprRate",
    "outSubsidyLoanAccountMoratorSubsRate",
    "outGrpAnnual",
    "outGrpInstallments"
})
public class AccountRepaymentScheduleExport
    extends BaseExport
{

    @XmlElement(name = "OutAccMechanismCharSuppliedChar20")
    protected String outAccMechanismCharSuppliedChar20;
    @XmlElement(name = "OutAccMovementCurrencyDaysbase")
    protected short outAccMovementCurrencyDaysbase;
    @XmlElement(name = "OutAccMovementCurrencyIdCurrency")
    protected int outAccMovementCurrencyIdCurrency;
    @XmlElement(name = "OutAccMovementCurrencyShortDescr")
    protected String outAccMovementCurrencyShortDescr;
    @XmlElement(name = "OutAccountStatusCharSuppliedChar20")
    protected String outAccountStatusCharSuppliedChar20;
    @XmlElement(name = "OutCustNameListSetDescription")
    protected String outCustNameListSetDescription;
    @XmlElement(name = "OutDepositProfitsAccountAccountCd")
    protected short outDepositProfitsAccountAccountCd;
    @XmlElement(name = "OutDepositProfitsAccountAccountNumber")
    protected String outDepositProfitsAccountAccountNumber;
    @XmlElement(name = "OutEnoikiagoraRoundIntIefSuppliedNumber152", required = true)
    protected BigDecimal outEnoikiagoraRoundIntIefSuppliedNumber152;
    @XmlElement(name = "OutFirstFixedInterestSupplyWorkCurFxIntScalDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outFirstFixedInterestSupplyWorkCurFxIntScalDt;
    @XmlElement(name = "OutFirstFixedInterestSupplyWorkFixedInterestPrc", required = true)
    protected BigDecimal outFirstFixedInterestSupplyWorkFixedInterestPrc;
    @XmlElement(name = "OutFixed360365IefSuppliedFlag")
    protected String outFixed360365IefSuppliedFlag;
    @XmlElement(name = "OutFixedInterestSupplyWorkCurFxIntScalDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outFixedInterestSupplyWorkCurFxIntScalDt;
    @XmlElement(name = "OutFixedInterestSupplyWorkFixedInterestPrc", required = true)
    protected BigDecimal outFixedInterestSupplyWorkFixedInterestPrc;
    @XmlElement(name = "OutFlex50LoanAddInfoAccSn")
    protected double outFlex50LoanAddInfoAccSn;
    @XmlElement(name = "OutFlex50LoanAddInfoAccType")
    protected short outFlex50LoanAddInfoAccType;
    @XmlElement(name = "OutFlex50LoanAddInfoAccUnit")
    protected int outFlex50LoanAddInfoAccUnit;
    @XmlElement(name = "OutFlex50LoanAddInfoAmountData", required = true)
    protected BigDecimal outFlex50LoanAddInfoAmountData;
    @XmlElement(name = "OutFlex50LoanAddInfoDateData", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outFlex50LoanAddInfoDateData;
    @XmlElement(name = "OutFlex50LoanAddInfoNumData")
    protected double outFlex50LoanAddInfoNumData;
    @XmlElement(name = "OutFlex50LoanAddInfoRateData", required = true)
    protected BigDecimal outFlex50LoanAddInfoRateData;
    @XmlElement(name = "OutFlex50LoanAddInfoRowId")
    protected int outFlex50LoanAddInfoRowId;
    @XmlElement(name = "OutFlex50LoanAddInfoRowInternalSn")
    protected int outFlex50LoanAddInfoRowInternalSn;
    @XmlElement(name = "OutFlex50LoanAddInfoShowFlag")
    protected String outFlex50LoanAddInfoShowFlag;
    @XmlElement(name = "OutFlex50LoanAddInfoTextData")
    protected String outFlex50LoanAddInfoTextData;
    @XmlElement(name = "OutFlex50LoanAddInfoTmstampData", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outFlex50LoanAddInfoTmstampData;
    @XmlElement(name = "OutFloating360365IefSuppliedFlag")
    protected String outFloating360365IefSuppliedFlag;
    @XmlElement(name = "OutFloatingInterestSupplyWorkCurFxIntScalDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outFloatingInterestSupplyWorkCurFxIntScalDt;
    @XmlElement(name = "OutFloatingInterestSupplyWorkFixedInterestPrc", required = true)
    protected BigDecimal outFloatingInterestSupplyWorkFixedInterestPrc;
    @XmlElement(name = "OutGrpAnnualLength")
    protected int outGrpAnnualLength;
    @XmlElement(name = "OutGrpInstallmentsLength")
    protected int outGrpInstallmentsLength;
    @XmlElement(name = "OutGrpLogLength")
    protected int outGrpLogLength;
    @XmlElement(name = "OutInstallmentDetailsLoanInstallmentsCapitalAmn", required = true)
    protected BigDecimal outInstallmentDetailsLoanInstallmentsCapitalAmn;
    @XmlElement(name = "OutInstallmentDetailsLoanInstallmentsCostOfOptionAmn", required = true)
    protected BigDecimal outInstallmentDetailsLoanInstallmentsCostOfOptionAmn;
    @XmlElement(name = "OutInstallmentDetailsLoanInstallmentsDateInterChanged", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outInstallmentDetailsLoanInstallmentsDateInterChanged;
    @XmlElement(name = "OutInstallmentDetailsLoanInstallmentsDbInterestAmn", required = true)
    protected BigDecimal outInstallmentDetailsLoanInstallmentsDbInterestAmn;
    @XmlElement(name = "OutInstallmentDetailsLoanInstallmentsInstallAmn", required = true)
    protected BigDecimal outInstallmentDetailsLoanInstallmentsInstallAmn;
    @XmlElement(name = "OutInstallmentDetailsLoanInstallmentsInstallInsurance", required = true)
    protected BigDecimal outInstallmentDetailsLoanInstallmentsInstallInsurance;
    @XmlElement(name = "OutInstallmentDetailsLoanInstallmentsInterestAmn", required = true)
    protected BigDecimal outInstallmentDetailsLoanInstallmentsInterestAmn;
    @XmlElement(name = "OutInstallmentDetailsLoanInstallmentsN128InterestAmn", required = true)
    protected BigDecimal outInstallmentDetailsLoanInstallmentsN128InterestAmn;
    @XmlElement(name = "OutInstallmentDetailsLoanInstallmentsN128InterPerc", required = true)
    protected BigDecimal outInstallmentDetailsLoanInstallmentsN128InterPerc;
    @XmlElement(name = "OutInstallmentDetailsLoanInstallmentsNormalInterPerc", required = true)
    protected BigDecimal outInstallmentDetailsLoanInstallmentsNormalInterPerc;
    @XmlElement(name = "OutInstallmentDetailsLoanInstallmentsRemainCapAmn", required = true)
    protected BigDecimal outInstallmentDetailsLoanInstallmentsRemainCapAmn;
    @XmlElement(name = "OutInstallmentDetailsLoanInstallmentsRequestDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outInstallmentDetailsLoanInstallmentsRequestDt;
    @XmlElement(name = "OutInstallmentDetailsLoanInstallmentsRequestPeriod")
    protected String outInstallmentDetailsLoanInstallmentsRequestPeriod;
    @XmlElement(name = "OutInstallmentDetailsLoanInstallmentsRequestSn")
    protected int outInstallmentDetailsLoanInstallmentsRequestSn;
    @XmlElement(name = "OutInstallmentDetailsLoanInstallmentsRequestType")
    protected String outInstallmentDetailsLoanInstallmentsRequestType;
    @XmlElement(name = "OutInstallmentDetailsLoanInstallmentsRoundingAmn", required = true)
    protected BigDecimal outInstallmentDetailsLoanInstallmentsRoundingAmn;
    @XmlElement(name = "OutInstallmentDetailsLoanInstallmentsSprdInterestAmn", required = true)
    protected BigDecimal outInstallmentDetailsLoanInstallmentsSprdInterestAmn;
    @XmlElement(name = "OutInstallmentDetailsLoanInstallmentsSpreadInterPerc", required = true)
    protected BigDecimal outInstallmentDetailsLoanInstallmentsSpreadInterPerc;
    @XmlElement(name = "OutInstallmentDetailsLoanInstallmentsSubs2InterestAmn", required = true)
    protected BigDecimal outInstallmentDetailsLoanInstallmentsSubs2InterestAmn;
    @XmlElement(name = "OutInstallmentDetailsLoanInstallmentsSubsidy2InterPerc", required = true)
    protected BigDecimal outInstallmentDetailsLoanInstallmentsSubsidy2InterPerc;
    @XmlElement(name = "OutInstallmentDetailsLoanInstallmentsSubsidyInterPerc", required = true)
    protected BigDecimal outInstallmentDetailsLoanInstallmentsSubsidyInterPerc;
    @XmlElement(name = "OutInstallmentDetailsLoanInstallmentsSubsInterestAmn", required = true)
    protected BigDecimal outInstallmentDetailsLoanInstallmentsSubsInterestAmn;
    @XmlElement(name = "OutInsuranceProductIssCommitmentTpSoIdentifier")
    protected double outInsuranceProductIssCommitmentTpSoIdentifier;
    @XmlElement(name = "OutLastMpEndAmountLoanInstallmentInfoStartingCapitalAmn", required = true)
    protected BigDecimal outLastMpEndAmountLoanInstallmentInfoStartingCapitalAmn;
    @XmlElement(name = "OutLoanAsoInd")
    protected String outLoanAsoInd;
    @XmlElement(name = "OutLoanAtmCardFlag")
    protected String outLoanAtmCardFlag;
    @XmlElement(name = "OutLoanCapitalTolerance")
    protected short outLoanCapitalTolerance;
    @XmlElement(name = "OutLoanCollRequestLimit")
    protected short outLoanCollRequestLimit;
    @XmlElement(name = "OutLoanCurFxIntInd")
    protected String outLoanCurFxIntInd;
    @XmlElement(name = "OutLoanCurrInterestPrd")
    protected short outLoanCurrInterestPrd;
    @XmlElement(name = "OutLoanDdAccrLstDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanDdAccrLstDt;
    @XmlElement(name = "OutLoanDepositAccFlg")
    protected String outLoanDepositAccFlg;
    @XmlElement(name = "OutLoanDiffIntAlgorithm")
    protected String outLoanDiffIntAlgorithm;
    @XmlElement(name = "OutLoanDurationType")
    protected String outLoanDurationType;
    @XmlElement(name = "OutLoanDurationUnit")
    protected String outLoanDurationUnit;
    @XmlElement(name = "OutLoanEntryStatus")
    protected String outLoanEntryStatus;
    @XmlElement(name = "OutLoanGeneralFlags")
    protected String outLoanGeneralFlags;
    @XmlElement(name = "OutLoanGracePrdUnit")
    protected String outLoanGracePrdUnit;
    @XmlElement(name = "OutLoanInstallMechFlg")
    protected String outLoanInstallMechFlg;
    @XmlElement(name = "OutLoanInstallTolerance")
    protected short outLoanInstallTolerance;
    @XmlElement(name = "OutLoanInstallUnit")
    protected String outLoanInstallUnit;
    @XmlElement(name = "OutLoanInstantCreditFlg")
    protected String outLoanInstantCreditFlg;
    @XmlElement(name = "OutLoanIntCapitalFlg")
    protected String outLoanIntCapitalFlg;
    @XmlElement(name = "OutLoanInterDaysInst")
    protected String outLoanInterDaysInst;
    @XmlElement(name = "OutLoanInterestTolerance")
    protected short outLoanInterestTolerance;
    @XmlElement(name = "OutLoanInterestUnit")
    protected String outLoanInterestUnit;
    @XmlElement(name = "OutLoanIntPayableFlg")
    protected String outLoanIntPayableFlg;
    @XmlElement(name = "OutLoanIpIntCapitalFlg")
    protected String outLoanIpIntCapitalFlg;
    @XmlElement(name = "OutLoanIpIntPayableFlg")
    protected String outLoanIpIntPayableFlg;
    @XmlElement(name = "OutLoanLoanType")
    protected String outLoanLoanType;
    @XmlElement(name = "OutLoanLstPrintTransDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanLstPrintTransDt;
    @XmlElement(name = "OutLoanLumpDrawdown")
    protected String outLoanLumpDrawdown;
    @XmlElement(name = "OutLoanMaxGracePrdFrq")
    protected short outLoanMaxGracePrdFrq;
    @XmlElement(name = "OutLoanMaxInstallCnt")
    protected short outLoanMaxInstallCnt;
    @XmlElement(name = "OutLoanMaxInstallFrq")
    protected short outLoanMaxInstallFrq;
    @XmlElement(name = "OutLoanMaxInterestFrq")
    protected short outLoanMaxInterestFrq;
    @XmlElement(name = "OutLoanMaxLoanDurat")
    protected short outLoanMaxLoanDurat;
    @XmlElement(name = "OutLoanMaxOverdueDurat")
    protected short outLoanMaxOverdueDurat;
    @XmlElement(name = "OutLoanMaxRecycleDurat")
    protected short outLoanMaxRecycleDurat;
    @XmlElement(name = "OutLoanMinGracePrdFrq")
    protected short outLoanMinGracePrdFrq;
    @XmlElement(name = "OutLoanMinInstallCnt")
    protected short outLoanMinInstallCnt;
    @XmlElement(name = "OutLoanMinInstallFrq")
    protected short outLoanMinInstallFrq;
    @XmlElement(name = "OutLoanMinInterestFrq")
    protected short outLoanMinInterestFrq;
    @XmlElement(name = "OutLoanMinLoanDurat")
    protected short outLoanMinLoanDurat;
    @XmlElement(name = "OutLoanMinPaymentAmn", required = true)
    protected BigDecimal outLoanMinPaymentAmn;
    @XmlElement(name = "OutLoanMinPaymentPerc", required = true)
    protected BigDecimal outLoanMinPaymentPerc;
    @XmlElement(name = "OutLoanMinRecycleDurat")
    protected short outLoanMinRecycleDurat;
    @XmlElement(name = "OutLoanMoratIntPayFlg")
    protected String outLoanMoratIntPayFlg;
    @XmlElement(name = "OutLoanNoIntMoratorFlg")
    protected String outLoanNoIntMoratorFlg;
    @XmlElement(name = "OutLoanNonIntCapitFlg")
    protected String outLoanNonIntCapitFlg;
    @XmlElement(name = "OutLoanNrmAccrLstDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanNrmAccrLstDt;
    @XmlElement(name = "OutLoanNrmInterestDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanNrmInterestDt;
    @XmlElement(name = "OutLoanNrmInterestFreq")
    protected short outLoanNrmInterestFreq;
    @XmlElement(name = "OutLoanNrmInterestUnit")
    protected String outLoanNrmInterestUnit;
    @XmlElement(name = "OutLoanNrmLstValeurDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanNrmLstValeurDt;
    @XmlElement(name = "OutLoanNrmNxtValeurDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanNrmNxtValeurDt;
    @XmlElement(name = "OutLoanNxtPrintTransDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanNxtPrintTransDt;
    @XmlElement(name = "OutLoanOvAccrLstDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanOvAccrLstDt;
    @XmlElement(name = "OutLoanOvInterestFreq")
    protected short outLoanOvInterestFreq;
    @XmlElement(name = "OutLoanOvInterestUnit")
    protected String outLoanOvInterestUnit;
    @XmlElement(name = "OutLoanPeriodicIntFlg")
    protected String outLoanPeriodicIntFlg;
    @XmlElement(name = "OutLoanPrintStatementDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanPrintStatementDt;
    @XmlElement(name = "OutLoanRecycleUnit")
    protected String outLoanRecycleUnit;
    @XmlElement(name = "OutLoanRecyclingLmtFlg")
    protected String outLoanRecyclingLmtFlg;
    @XmlElement(name = "OutLoanRenewalInterFlg")
    protected String outLoanRenewalInterFlg;
    @XmlElement(name = "OutLoanRiskFactor", required = true)
    protected BigDecimal outLoanRiskFactor;
    @XmlElement(name = "OutLoanSelectIntFlg")
    protected String outLoanSelectIntFlg;
    @XmlElement(name = "OutLoanTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanTmstamp;
    @XmlElement(name = "OutLoanTolDays1")
    protected short outLoanTolDays1;
    @XmlElement(name = "OutLoanTolDays2")
    protected short outLoanTolDays2;
    @XmlElement(name = "OutLoanTolDays3")
    protected short outLoanTolDays3;
    @XmlElement(name = "OutLoanTolDays5")
    protected short outLoanTolDays5;
    @XmlElement(name = "OutLoanToleranceDays")
    protected short outLoanToleranceDays;
    @XmlElement(name = "OutLoanAccountAccExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountAccExpDt;
    @XmlElement(name = "OutLoanAccountAccMechanism")
    protected String outLoanAccountAccMechanism;
    @XmlElement(name = "OutLoanAccountAccOpenDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountAccOpenDt;
    @XmlElement(name = "OutLoanAccountAccStatus")
    protected String outLoanAccountAccStatus;
    @XmlElement(name = "OutLoanAccountCurFxIntExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountCurFxIntExpDt;
    @XmlElement(name = "OutLoanAccountCustId")
    protected int outLoanAccountCustId;
    @XmlElement(name = "OutLoanAccountDrawdownExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountDrawdownExpDt;
    @XmlElement(name = "OutLoanAccountDrawdownFstAmn", required = true)
    protected BigDecimal outLoanAccountDrawdownFstAmn;
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
    @XmlElement(name = "OutLoanAccountInstallPrevDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountInstallPrevDt;
    @XmlElement(name = "OutLoanAccountInstallSkipCap", required = true)
    protected BigDecimal outLoanAccountInstallSkipCap;
    @XmlElement(name = "OutLoanAccountInstallSkipInt", required = true)
    protected BigDecimal outLoanAccountInstallSkipInt;
    @XmlElement(name = "OutLoanAccountInterCapitalizeFlg")
    protected String outLoanAccountInterCapitalizeFlg;
    @XmlElement(name = "OutLoanAccountInterRateSprd", required = true)
    protected BigDecimal outLoanAccountInterRateSprd;
    @XmlElement(name = "OutLoanAccountLoanStatus")
    protected String outLoanAccountLoanStatus;
    @XmlElement(name = "OutLoanAccountNrmExpBal", required = true)
    protected BigDecimal outLoanAccountNrmExpBal;
    @XmlElement(name = "OutLoanAccountOvExpBal", required = true)
    protected BigDecimal outLoanAccountOvExpBal;
    @XmlElement(name = "OutLoanAccountPrvFxIntExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountPrvFxIntExpDt;
    @XmlElement(name = "OutLoanAccountReqInstallSn")
    protected short outLoanAccountReqInstallSn;
    @XmlElement(name = "OutLoanAccountSpreadEndDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountSpreadEndDt;
    @XmlElement(name = "OutLoanAccountTotExpenseAmn", required = true)
    protected BigDecimal outLoanAccountTotExpenseAmn;
    @XmlElement(name = "OutLoanAccountInfoAutFixIntRenew")
    protected String outLoanAccountInfoAutFixIntRenew;
    @XmlElement(name = "OutLoanAccountInfoFluctuationRange", required = true)
    protected BigDecimal outLoanAccountInfoFluctuationRange;
    @XmlElement(name = "OutLoanAccountInfoInitialInterest", required = true)
    protected BigDecimal outLoanAccountInfoInitialInterest;
    @XmlElement(name = "OutLoanAccountInfoMoratIntPayFlg")
    protected String outLoanAccountInfoMoratIntPayFlg;
    @XmlElement(name = "OutLoanAccountInfoMoratoriumIntDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountInfoMoratoriumIntDt;
    @XmlElement(name = "OutLoanAccountInfoMoratoriumIntFrq")
    protected short outLoanAccountInfoMoratoriumIntFrq;
    @XmlElement(name = "OutLoanAccountInfoSelectedBankRate", required = true)
    protected BigDecimal outLoanAccountInfoSelectedBankRate;
    @XmlElement(name = "OutLoanInstallmentInfoStartingCapitalAmn", required = true)
    protected BigDecimal outLoanInstallmentInfoStartingCapitalAmn;
    @XmlElement(name = "OutLoanInstallmentInfoTotalCostoptAmn", required = true)
    protected BigDecimal outLoanInstallmentInfoTotalCostoptAmn;
    @XmlElement(name = "OutLoanInstallmentInfoTotalDbInterestAmn", required = true)
    protected BigDecimal outLoanInstallmentInfoTotalDbInterestAmn;
    @XmlElement(name = "OutLoanInstallmentInfoTotalExpensesAmount", required = true)
    protected BigDecimal outLoanInstallmentInfoTotalExpensesAmount;
    @XmlElement(name = "OutLoanInstallmentInfoTotalGraceInterAmn", required = true)
    protected BigDecimal outLoanInstallmentInfoTotalGraceInterAmn;
    @XmlElement(name = "OutLoanInstallmentInfoTotalInsuranceAmn", required = true)
    protected BigDecimal outLoanInstallmentInfoTotalInsuranceAmn;
    @XmlElement(name = "OutLoanInstallmentInfoTotalInterestAmn", required = true)
    protected BigDecimal outLoanInstallmentInfoTotalInterestAmn;
    @XmlElement(name = "OutLoanInstallmentInfoTotalN128Amount", required = true)
    protected BigDecimal outLoanInstallmentInfoTotalN128Amount;
    @XmlElement(name = "OutLoanInstallmentInfoTotalRoundingAmn", required = true)
    protected BigDecimal outLoanInstallmentInfoTotalRoundingAmn;
    @XmlElement(name = "OutLoanInstallmentInfoTotalSpreadAmount", required = true)
    protected BigDecimal outLoanInstallmentInfoTotalSpreadAmount;
    @XmlElement(name = "OutLoanInstallmentInfoTotalSubsidy2Amn", required = true)
    protected BigDecimal outLoanInstallmentInfoTotalSubsidy2Amn;
    @XmlElement(name = "OutLoanInstallmentInfoTotalSubsidyAmount", required = true)
    protected BigDecimal outLoanInstallmentInfoTotalSubsidyAmount;
    @XmlElement(name = "OutLoanProductDescription")
    protected String outLoanProductDescription;
    @XmlElement(name = "OutLoanProductIdProduct")
    protected int outLoanProductIdProduct;
    @XmlElement(name = "OutLoanStatusCharSuppliedChar20")
    protected String outLoanStatusCharSuppliedChar20;
    @XmlElement(name = "OutLoanStepIntInstallmentWorkFirstInstallmentIntAnm", required = true)
    protected BigDecimal outLoanStepIntInstallmentWorkFirstInstallmentIntAnm;
    @XmlElement(name = "OutLoanStepIntInstallmentWorkStep", required = true)
    protected BigDecimal outLoanStepIntInstallmentWorkStep;
    @XmlElement(name = "OutLoanWorkFlgsEqInterestFlg")
    protected String outLoanWorkFlgsEqInterestFlg;
    @XmlElement(name = "OutLoanWorkFlgsVariableInstalmentFlg")
    protected String outLoanWorkFlgsVariableInstalmentFlg;
    @XmlElement(name = "OutLoopFlagIefSuppliedFlag")
    protected String outLoopFlagIefSuppliedFlag;
    @XmlElement(name = "OutLssMoratInterestSupplyWorkMoratorN128Rate", required = true)
    protected BigDecimal outLssMoratInterestSupplyWorkMoratorN128Rate;
    @XmlElement(name = "OutLssMoratInterestSupplyWorkMoratorNrmRate", required = true)
    protected BigDecimal outLssMoratInterestSupplyWorkMoratorNrmRate;
    @XmlElement(name = "OutLssMoratInterestSupplyWorkMoratorSprRate", required = true)
    protected BigDecimal outLssMoratInterestSupplyWorkMoratorSprRate;
    @XmlElement(name = "OutLssMoratInterestSupplyWorkMoratorSubs2Rate", required = true)
    protected BigDecimal outLssMoratInterestSupplyWorkMoratorSubs2Rate;
    @XmlElement(name = "OutLssMoratInterestSupplyWorkMoratorSubsRate", required = true)
    protected BigDecimal outLssMoratInterestSupplyWorkMoratorSubsRate;
    @XmlElement(name = "OutMaintainEqInstLoanAccountInfoMaintainEqInst")
    protected String outMaintainEqInstLoanAccountInfoMaintainEqInst;
    @XmlElement(name = "OutMpEndAmnLoanInstallmentInfoStartingCapitalAmn", required = true)
    protected BigDecimal outMpEndAmnLoanInstallmentInfoStartingCapitalAmn;
    @XmlElement(name = "OutN128360365IefSuppliedFlag")
    protected String outN128360365IefSuppliedFlag;
    @XmlElement(name = "OutN128InterestSupplyWorkCurFxIntScalDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outN128InterestSupplyWorkCurFxIntScalDt;
    @XmlElement(name = "OutN128InterestSupplyWorkFixedInterestPrc", required = true)
    protected BigDecimal outN128InterestSupplyWorkFixedInterestPrc;
    @XmlElement(name = "OutProduct360365LoanInterDaysInst")
    protected String outProduct360365LoanInterDaysInst;
    @XmlElement(name = "OutSaveResultsInDbIefSuppliedFlag")
    protected String outSaveResultsInDbIefSuppliedFlag;
    @XmlElement(name = "OutSecondFixedInterestSupplyWorkCurFxIntScalDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSecondFixedInterestSupplyWorkCurFxIntScalDt;
    @XmlElement(name = "OutSecondFixedInterestSupplyWorkFixedInterestPrc", required = true)
    protected BigDecimal outSecondFixedInterestSupplyWorkFixedInterestPrc;
    @XmlElement(name = "OutSepeLoanInstallmentInfoInstallDbIntPerc", required = true)
    protected BigDecimal outSepeLoanInstallmentInfoInstallDbIntPerc;
    @XmlElement(name = "OutShowLiteralIefSuppliedFlag")
    protected String outShowLiteralIefSuppliedFlag;
    @XmlElement(name = "OutSubsidyLoanAccountMoratorSprRate", required = true)
    protected BigDecimal outSubsidyLoanAccountMoratorSprRate;
    @XmlElement(name = "OutSubsidyLoanAccountMoratorSubsRate", required = true)
    protected BigDecimal outSubsidyLoanAccountMoratorSubsRate;
    @XmlElement(name = "OutGrpAnnual")
    protected ArrayOfOutGrpAnnual outGrpAnnual;
    @XmlElement(name = "OutGrpInstallments")
    protected ArrayOfOutGrpInstallments outGrpInstallments;

    /**
     * Gets the value of the outAccMechanismCharSuppliedChar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAccMechanismCharSuppliedChar20() {
        return outAccMechanismCharSuppliedChar20;
    }

    /**
     * Sets the value of the outAccMechanismCharSuppliedChar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAccMechanismCharSuppliedChar20(String value) {
        this.outAccMechanismCharSuppliedChar20 = value;
    }

    /**
     * Gets the value of the outAccMovementCurrencyDaysbase property.
     * 
     */
    public short getOutAccMovementCurrencyDaysbase() {
        return outAccMovementCurrencyDaysbase;
    }

    /**
     * Sets the value of the outAccMovementCurrencyDaysbase property.
     * 
     */
    public void setOutAccMovementCurrencyDaysbase(short value) {
        this.outAccMovementCurrencyDaysbase = value;
    }

    /**
     * Gets the value of the outAccMovementCurrencyIdCurrency property.
     * 
     */
    public int getOutAccMovementCurrencyIdCurrency() {
        return outAccMovementCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outAccMovementCurrencyIdCurrency property.
     * 
     */
    public void setOutAccMovementCurrencyIdCurrency(int value) {
        this.outAccMovementCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outAccMovementCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAccMovementCurrencyShortDescr() {
        return outAccMovementCurrencyShortDescr;
    }

    /**
     * Sets the value of the outAccMovementCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAccMovementCurrencyShortDescr(String value) {
        this.outAccMovementCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outAccountStatusCharSuppliedChar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAccountStatusCharSuppliedChar20() {
        return outAccountStatusCharSuppliedChar20;
    }

    /**
     * Sets the value of the outAccountStatusCharSuppliedChar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAccountStatusCharSuppliedChar20(String value) {
        this.outAccountStatusCharSuppliedChar20 = value;
    }

    /**
     * Gets the value of the outCustNameListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustNameListSetDescription() {
        return outCustNameListSetDescription;
    }

    /**
     * Sets the value of the outCustNameListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustNameListSetDescription(String value) {
        this.outCustNameListSetDescription = value;
    }

    /**
     * Gets the value of the outDepositProfitsAccountAccountCd property.
     * 
     */
    public short getOutDepositProfitsAccountAccountCd() {
        return outDepositProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outDepositProfitsAccountAccountCd property.
     * 
     */
    public void setOutDepositProfitsAccountAccountCd(short value) {
        this.outDepositProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outDepositProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositProfitsAccountAccountNumber() {
        return outDepositProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outDepositProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositProfitsAccountAccountNumber(String value) {
        this.outDepositProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outEnoikiagoraRoundIntIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutEnoikiagoraRoundIntIefSuppliedNumber152() {
        return outEnoikiagoraRoundIntIefSuppliedNumber152;
    }

    /**
     * Sets the value of the outEnoikiagoraRoundIntIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutEnoikiagoraRoundIntIefSuppliedNumber152(BigDecimal value) {
        this.outEnoikiagoraRoundIntIefSuppliedNumber152 = value;
    }

    /**
     * Gets the value of the outFirstFixedInterestSupplyWorkCurFxIntScalDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutFirstFixedInterestSupplyWorkCurFxIntScalDt() {
        return outFirstFixedInterestSupplyWorkCurFxIntScalDt;
    }

    /**
     * Sets the value of the outFirstFixedInterestSupplyWorkCurFxIntScalDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutFirstFixedInterestSupplyWorkCurFxIntScalDt(XMLGregorianCalendar value) {
        this.outFirstFixedInterestSupplyWorkCurFxIntScalDt = value;
    }

    /**
     * Gets the value of the outFirstFixedInterestSupplyWorkFixedInterestPrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutFirstFixedInterestSupplyWorkFixedInterestPrc() {
        return outFirstFixedInterestSupplyWorkFixedInterestPrc;
    }

    /**
     * Sets the value of the outFirstFixedInterestSupplyWorkFixedInterestPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutFirstFixedInterestSupplyWorkFixedInterestPrc(BigDecimal value) {
        this.outFirstFixedInterestSupplyWorkFixedInterestPrc = value;
    }

    /**
     * Gets the value of the outFixed360365IefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFixed360365IefSuppliedFlag() {
        return outFixed360365IefSuppliedFlag;
    }

    /**
     * Sets the value of the outFixed360365IefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFixed360365IefSuppliedFlag(String value) {
        this.outFixed360365IefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outFixedInterestSupplyWorkCurFxIntScalDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutFixedInterestSupplyWorkCurFxIntScalDt() {
        return outFixedInterestSupplyWorkCurFxIntScalDt;
    }

    /**
     * Sets the value of the outFixedInterestSupplyWorkCurFxIntScalDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutFixedInterestSupplyWorkCurFxIntScalDt(XMLGregorianCalendar value) {
        this.outFixedInterestSupplyWorkCurFxIntScalDt = value;
    }

    /**
     * Gets the value of the outFixedInterestSupplyWorkFixedInterestPrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutFixedInterestSupplyWorkFixedInterestPrc() {
        return outFixedInterestSupplyWorkFixedInterestPrc;
    }

    /**
     * Sets the value of the outFixedInterestSupplyWorkFixedInterestPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutFixedInterestSupplyWorkFixedInterestPrc(BigDecimal value) {
        this.outFixedInterestSupplyWorkFixedInterestPrc = value;
    }

    /**
     * Gets the value of the outFlex50LoanAddInfoAccSn property.
     * 
     */
    public double getOutFlex50LoanAddInfoAccSn() {
        return outFlex50LoanAddInfoAccSn;
    }

    /**
     * Sets the value of the outFlex50LoanAddInfoAccSn property.
     * 
     */
    public void setOutFlex50LoanAddInfoAccSn(double value) {
        this.outFlex50LoanAddInfoAccSn = value;
    }

    /**
     * Gets the value of the outFlex50LoanAddInfoAccType property.
     * 
     */
    public short getOutFlex50LoanAddInfoAccType() {
        return outFlex50LoanAddInfoAccType;
    }

    /**
     * Sets the value of the outFlex50LoanAddInfoAccType property.
     * 
     */
    public void setOutFlex50LoanAddInfoAccType(short value) {
        this.outFlex50LoanAddInfoAccType = value;
    }

    /**
     * Gets the value of the outFlex50LoanAddInfoAccUnit property.
     * 
     */
    public int getOutFlex50LoanAddInfoAccUnit() {
        return outFlex50LoanAddInfoAccUnit;
    }

    /**
     * Sets the value of the outFlex50LoanAddInfoAccUnit property.
     * 
     */
    public void setOutFlex50LoanAddInfoAccUnit(int value) {
        this.outFlex50LoanAddInfoAccUnit = value;
    }

    /**
     * Gets the value of the outFlex50LoanAddInfoAmountData property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutFlex50LoanAddInfoAmountData() {
        return outFlex50LoanAddInfoAmountData;
    }

    /**
     * Sets the value of the outFlex50LoanAddInfoAmountData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutFlex50LoanAddInfoAmountData(BigDecimal value) {
        this.outFlex50LoanAddInfoAmountData = value;
    }

    /**
     * Gets the value of the outFlex50LoanAddInfoDateData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutFlex50LoanAddInfoDateData() {
        return outFlex50LoanAddInfoDateData;
    }

    /**
     * Sets the value of the outFlex50LoanAddInfoDateData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutFlex50LoanAddInfoDateData(XMLGregorianCalendar value) {
        this.outFlex50LoanAddInfoDateData = value;
    }

    /**
     * Gets the value of the outFlex50LoanAddInfoNumData property.
     * 
     */
    public double getOutFlex50LoanAddInfoNumData() {
        return outFlex50LoanAddInfoNumData;
    }

    /**
     * Sets the value of the outFlex50LoanAddInfoNumData property.
     * 
     */
    public void setOutFlex50LoanAddInfoNumData(double value) {
        this.outFlex50LoanAddInfoNumData = value;
    }

    /**
     * Gets the value of the outFlex50LoanAddInfoRateData property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutFlex50LoanAddInfoRateData() {
        return outFlex50LoanAddInfoRateData;
    }

    /**
     * Sets the value of the outFlex50LoanAddInfoRateData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutFlex50LoanAddInfoRateData(BigDecimal value) {
        this.outFlex50LoanAddInfoRateData = value;
    }

    /**
     * Gets the value of the outFlex50LoanAddInfoRowId property.
     * 
     */
    public int getOutFlex50LoanAddInfoRowId() {
        return outFlex50LoanAddInfoRowId;
    }

    /**
     * Sets the value of the outFlex50LoanAddInfoRowId property.
     * 
     */
    public void setOutFlex50LoanAddInfoRowId(int value) {
        this.outFlex50LoanAddInfoRowId = value;
    }

    /**
     * Gets the value of the outFlex50LoanAddInfoRowInternalSn property.
     * 
     */
    public int getOutFlex50LoanAddInfoRowInternalSn() {
        return outFlex50LoanAddInfoRowInternalSn;
    }

    /**
     * Sets the value of the outFlex50LoanAddInfoRowInternalSn property.
     * 
     */
    public void setOutFlex50LoanAddInfoRowInternalSn(int value) {
        this.outFlex50LoanAddInfoRowInternalSn = value;
    }

    /**
     * Gets the value of the outFlex50LoanAddInfoShowFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFlex50LoanAddInfoShowFlag() {
        return outFlex50LoanAddInfoShowFlag;
    }

    /**
     * Sets the value of the outFlex50LoanAddInfoShowFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFlex50LoanAddInfoShowFlag(String value) {
        this.outFlex50LoanAddInfoShowFlag = value;
    }

    /**
     * Gets the value of the outFlex50LoanAddInfoTextData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFlex50LoanAddInfoTextData() {
        return outFlex50LoanAddInfoTextData;
    }

    /**
     * Sets the value of the outFlex50LoanAddInfoTextData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFlex50LoanAddInfoTextData(String value) {
        this.outFlex50LoanAddInfoTextData = value;
    }

    /**
     * Gets the value of the outFlex50LoanAddInfoTmstampData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutFlex50LoanAddInfoTmstampData() {
        return outFlex50LoanAddInfoTmstampData;
    }

    /**
     * Sets the value of the outFlex50LoanAddInfoTmstampData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutFlex50LoanAddInfoTmstampData(XMLGregorianCalendar value) {
        this.outFlex50LoanAddInfoTmstampData = value;
    }

    /**
     * Gets the value of the outFloating360365IefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFloating360365IefSuppliedFlag() {
        return outFloating360365IefSuppliedFlag;
    }

    /**
     * Sets the value of the outFloating360365IefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFloating360365IefSuppliedFlag(String value) {
        this.outFloating360365IefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outFloatingInterestSupplyWorkCurFxIntScalDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutFloatingInterestSupplyWorkCurFxIntScalDt() {
        return outFloatingInterestSupplyWorkCurFxIntScalDt;
    }

    /**
     * Sets the value of the outFloatingInterestSupplyWorkCurFxIntScalDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutFloatingInterestSupplyWorkCurFxIntScalDt(XMLGregorianCalendar value) {
        this.outFloatingInterestSupplyWorkCurFxIntScalDt = value;
    }

    /**
     * Gets the value of the outFloatingInterestSupplyWorkFixedInterestPrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutFloatingInterestSupplyWorkFixedInterestPrc() {
        return outFloatingInterestSupplyWorkFixedInterestPrc;
    }

    /**
     * Sets the value of the outFloatingInterestSupplyWorkFixedInterestPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutFloatingInterestSupplyWorkFixedInterestPrc(BigDecimal value) {
        this.outFloatingInterestSupplyWorkFixedInterestPrc = value;
    }

    /**
     * Gets the value of the outGrpAnnualLength property.
     * 
     */
    public int getOutGrpAnnualLength() {
        return outGrpAnnualLength;
    }

    /**
     * Sets the value of the outGrpAnnualLength property.
     * 
     */
    public void setOutGrpAnnualLength(int value) {
        this.outGrpAnnualLength = value;
    }

    /**
     * Gets the value of the outGrpInstallmentsLength property.
     * 
     */
    public int getOutGrpInstallmentsLength() {
        return outGrpInstallmentsLength;
    }

    /**
     * Sets the value of the outGrpInstallmentsLength property.
     * 
     */
    public void setOutGrpInstallmentsLength(int value) {
        this.outGrpInstallmentsLength = value;
    }

    /**
     * Gets the value of the outGrpLogLength property.
     * 
     */
    public int getOutGrpLogLength() {
        return outGrpLogLength;
    }

    /**
     * Sets the value of the outGrpLogLength property.
     * 
     */
    public void setOutGrpLogLength(int value) {
        this.outGrpLogLength = value;
    }

    /**
     * Gets the value of the outInstallmentDetailsLoanInstallmentsCapitalAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutInstallmentDetailsLoanInstallmentsCapitalAmn() {
        return outInstallmentDetailsLoanInstallmentsCapitalAmn;
    }

    /**
     * Sets the value of the outInstallmentDetailsLoanInstallmentsCapitalAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutInstallmentDetailsLoanInstallmentsCapitalAmn(BigDecimal value) {
        this.outInstallmentDetailsLoanInstallmentsCapitalAmn = value;
    }

    /**
     * Gets the value of the outInstallmentDetailsLoanInstallmentsCostOfOptionAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutInstallmentDetailsLoanInstallmentsCostOfOptionAmn() {
        return outInstallmentDetailsLoanInstallmentsCostOfOptionAmn;
    }

    /**
     * Sets the value of the outInstallmentDetailsLoanInstallmentsCostOfOptionAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutInstallmentDetailsLoanInstallmentsCostOfOptionAmn(BigDecimal value) {
        this.outInstallmentDetailsLoanInstallmentsCostOfOptionAmn = value;
    }

    /**
     * Gets the value of the outInstallmentDetailsLoanInstallmentsDateInterChanged property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutInstallmentDetailsLoanInstallmentsDateInterChanged() {
        return outInstallmentDetailsLoanInstallmentsDateInterChanged;
    }

    /**
     * Sets the value of the outInstallmentDetailsLoanInstallmentsDateInterChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutInstallmentDetailsLoanInstallmentsDateInterChanged(XMLGregorianCalendar value) {
        this.outInstallmentDetailsLoanInstallmentsDateInterChanged = value;
    }

    /**
     * Gets the value of the outInstallmentDetailsLoanInstallmentsDbInterestAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutInstallmentDetailsLoanInstallmentsDbInterestAmn() {
        return outInstallmentDetailsLoanInstallmentsDbInterestAmn;
    }

    /**
     * Sets the value of the outInstallmentDetailsLoanInstallmentsDbInterestAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutInstallmentDetailsLoanInstallmentsDbInterestAmn(BigDecimal value) {
        this.outInstallmentDetailsLoanInstallmentsDbInterestAmn = value;
    }

    /**
     * Gets the value of the outInstallmentDetailsLoanInstallmentsInstallAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutInstallmentDetailsLoanInstallmentsInstallAmn() {
        return outInstallmentDetailsLoanInstallmentsInstallAmn;
    }

    /**
     * Sets the value of the outInstallmentDetailsLoanInstallmentsInstallAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutInstallmentDetailsLoanInstallmentsInstallAmn(BigDecimal value) {
        this.outInstallmentDetailsLoanInstallmentsInstallAmn = value;
    }

    /**
     * Gets the value of the outInstallmentDetailsLoanInstallmentsInstallInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutInstallmentDetailsLoanInstallmentsInstallInsurance() {
        return outInstallmentDetailsLoanInstallmentsInstallInsurance;
    }

    /**
     * Sets the value of the outInstallmentDetailsLoanInstallmentsInstallInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutInstallmentDetailsLoanInstallmentsInstallInsurance(BigDecimal value) {
        this.outInstallmentDetailsLoanInstallmentsInstallInsurance = value;
    }

    /**
     * Gets the value of the outInstallmentDetailsLoanInstallmentsInterestAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutInstallmentDetailsLoanInstallmentsInterestAmn() {
        return outInstallmentDetailsLoanInstallmentsInterestAmn;
    }

    /**
     * Sets the value of the outInstallmentDetailsLoanInstallmentsInterestAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutInstallmentDetailsLoanInstallmentsInterestAmn(BigDecimal value) {
        this.outInstallmentDetailsLoanInstallmentsInterestAmn = value;
    }

    /**
     * Gets the value of the outInstallmentDetailsLoanInstallmentsN128InterestAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutInstallmentDetailsLoanInstallmentsN128InterestAmn() {
        return outInstallmentDetailsLoanInstallmentsN128InterestAmn;
    }

    /**
     * Sets the value of the outInstallmentDetailsLoanInstallmentsN128InterestAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutInstallmentDetailsLoanInstallmentsN128InterestAmn(BigDecimal value) {
        this.outInstallmentDetailsLoanInstallmentsN128InterestAmn = value;
    }

    /**
     * Gets the value of the outInstallmentDetailsLoanInstallmentsN128InterPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutInstallmentDetailsLoanInstallmentsN128InterPerc() {
        return outInstallmentDetailsLoanInstallmentsN128InterPerc;
    }

    /**
     * Sets the value of the outInstallmentDetailsLoanInstallmentsN128InterPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutInstallmentDetailsLoanInstallmentsN128InterPerc(BigDecimal value) {
        this.outInstallmentDetailsLoanInstallmentsN128InterPerc = value;
    }

    /**
     * Gets the value of the outInstallmentDetailsLoanInstallmentsNormalInterPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutInstallmentDetailsLoanInstallmentsNormalInterPerc() {
        return outInstallmentDetailsLoanInstallmentsNormalInterPerc;
    }

    /**
     * Sets the value of the outInstallmentDetailsLoanInstallmentsNormalInterPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutInstallmentDetailsLoanInstallmentsNormalInterPerc(BigDecimal value) {
        this.outInstallmentDetailsLoanInstallmentsNormalInterPerc = value;
    }

    /**
     * Gets the value of the outInstallmentDetailsLoanInstallmentsRemainCapAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutInstallmentDetailsLoanInstallmentsRemainCapAmn() {
        return outInstallmentDetailsLoanInstallmentsRemainCapAmn;
    }

    /**
     * Sets the value of the outInstallmentDetailsLoanInstallmentsRemainCapAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutInstallmentDetailsLoanInstallmentsRemainCapAmn(BigDecimal value) {
        this.outInstallmentDetailsLoanInstallmentsRemainCapAmn = value;
    }

    /**
     * Gets the value of the outInstallmentDetailsLoanInstallmentsRequestDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutInstallmentDetailsLoanInstallmentsRequestDt() {
        return outInstallmentDetailsLoanInstallmentsRequestDt;
    }

    /**
     * Sets the value of the outInstallmentDetailsLoanInstallmentsRequestDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutInstallmentDetailsLoanInstallmentsRequestDt(XMLGregorianCalendar value) {
        this.outInstallmentDetailsLoanInstallmentsRequestDt = value;
    }

    /**
     * Gets the value of the outInstallmentDetailsLoanInstallmentsRequestPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInstallmentDetailsLoanInstallmentsRequestPeriod() {
        return outInstallmentDetailsLoanInstallmentsRequestPeriod;
    }

    /**
     * Sets the value of the outInstallmentDetailsLoanInstallmentsRequestPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInstallmentDetailsLoanInstallmentsRequestPeriod(String value) {
        this.outInstallmentDetailsLoanInstallmentsRequestPeriod = value;
    }

    /**
     * Gets the value of the outInstallmentDetailsLoanInstallmentsRequestSn property.
     * 
     */
    public int getOutInstallmentDetailsLoanInstallmentsRequestSn() {
        return outInstallmentDetailsLoanInstallmentsRequestSn;
    }

    /**
     * Sets the value of the outInstallmentDetailsLoanInstallmentsRequestSn property.
     * 
     */
    public void setOutInstallmentDetailsLoanInstallmentsRequestSn(int value) {
        this.outInstallmentDetailsLoanInstallmentsRequestSn = value;
    }

    /**
     * Gets the value of the outInstallmentDetailsLoanInstallmentsRequestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInstallmentDetailsLoanInstallmentsRequestType() {
        return outInstallmentDetailsLoanInstallmentsRequestType;
    }

    /**
     * Sets the value of the outInstallmentDetailsLoanInstallmentsRequestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInstallmentDetailsLoanInstallmentsRequestType(String value) {
        this.outInstallmentDetailsLoanInstallmentsRequestType = value;
    }

    /**
     * Gets the value of the outInstallmentDetailsLoanInstallmentsRoundingAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutInstallmentDetailsLoanInstallmentsRoundingAmn() {
        return outInstallmentDetailsLoanInstallmentsRoundingAmn;
    }

    /**
     * Sets the value of the outInstallmentDetailsLoanInstallmentsRoundingAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutInstallmentDetailsLoanInstallmentsRoundingAmn(BigDecimal value) {
        this.outInstallmentDetailsLoanInstallmentsRoundingAmn = value;
    }

    /**
     * Gets the value of the outInstallmentDetailsLoanInstallmentsSprdInterestAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutInstallmentDetailsLoanInstallmentsSprdInterestAmn() {
        return outInstallmentDetailsLoanInstallmentsSprdInterestAmn;
    }

    /**
     * Sets the value of the outInstallmentDetailsLoanInstallmentsSprdInterestAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutInstallmentDetailsLoanInstallmentsSprdInterestAmn(BigDecimal value) {
        this.outInstallmentDetailsLoanInstallmentsSprdInterestAmn = value;
    }

    /**
     * Gets the value of the outInstallmentDetailsLoanInstallmentsSpreadInterPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutInstallmentDetailsLoanInstallmentsSpreadInterPerc() {
        return outInstallmentDetailsLoanInstallmentsSpreadInterPerc;
    }

    /**
     * Sets the value of the outInstallmentDetailsLoanInstallmentsSpreadInterPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutInstallmentDetailsLoanInstallmentsSpreadInterPerc(BigDecimal value) {
        this.outInstallmentDetailsLoanInstallmentsSpreadInterPerc = value;
    }

    /**
     * Gets the value of the outInstallmentDetailsLoanInstallmentsSubs2InterestAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutInstallmentDetailsLoanInstallmentsSubs2InterestAmn() {
        return outInstallmentDetailsLoanInstallmentsSubs2InterestAmn;
    }

    /**
     * Sets the value of the outInstallmentDetailsLoanInstallmentsSubs2InterestAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutInstallmentDetailsLoanInstallmentsSubs2InterestAmn(BigDecimal value) {
        this.outInstallmentDetailsLoanInstallmentsSubs2InterestAmn = value;
    }

    /**
     * Gets the value of the outInstallmentDetailsLoanInstallmentsSubsidy2InterPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutInstallmentDetailsLoanInstallmentsSubsidy2InterPerc() {
        return outInstallmentDetailsLoanInstallmentsSubsidy2InterPerc;
    }

    /**
     * Sets the value of the outInstallmentDetailsLoanInstallmentsSubsidy2InterPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutInstallmentDetailsLoanInstallmentsSubsidy2InterPerc(BigDecimal value) {
        this.outInstallmentDetailsLoanInstallmentsSubsidy2InterPerc = value;
    }

    /**
     * Gets the value of the outInstallmentDetailsLoanInstallmentsSubsidyInterPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutInstallmentDetailsLoanInstallmentsSubsidyInterPerc() {
        return outInstallmentDetailsLoanInstallmentsSubsidyInterPerc;
    }

    /**
     * Sets the value of the outInstallmentDetailsLoanInstallmentsSubsidyInterPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutInstallmentDetailsLoanInstallmentsSubsidyInterPerc(BigDecimal value) {
        this.outInstallmentDetailsLoanInstallmentsSubsidyInterPerc = value;
    }

    /**
     * Gets the value of the outInstallmentDetailsLoanInstallmentsSubsInterestAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutInstallmentDetailsLoanInstallmentsSubsInterestAmn() {
        return outInstallmentDetailsLoanInstallmentsSubsInterestAmn;
    }

    /**
     * Sets the value of the outInstallmentDetailsLoanInstallmentsSubsInterestAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutInstallmentDetailsLoanInstallmentsSubsInterestAmn(BigDecimal value) {
        this.outInstallmentDetailsLoanInstallmentsSubsInterestAmn = value;
    }

    /**
     * Gets the value of the outInsuranceProductIssCommitmentTpSoIdentifier property.
     * 
     */
    public double getOutInsuranceProductIssCommitmentTpSoIdentifier() {
        return outInsuranceProductIssCommitmentTpSoIdentifier;
    }

    /**
     * Sets the value of the outInsuranceProductIssCommitmentTpSoIdentifier property.
     * 
     */
    public void setOutInsuranceProductIssCommitmentTpSoIdentifier(double value) {
        this.outInsuranceProductIssCommitmentTpSoIdentifier = value;
    }

    /**
     * Gets the value of the outLastMpEndAmountLoanInstallmentInfoStartingCapitalAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLastMpEndAmountLoanInstallmentInfoStartingCapitalAmn() {
        return outLastMpEndAmountLoanInstallmentInfoStartingCapitalAmn;
    }

    /**
     * Sets the value of the outLastMpEndAmountLoanInstallmentInfoStartingCapitalAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLastMpEndAmountLoanInstallmentInfoStartingCapitalAmn(BigDecimal value) {
        this.outLastMpEndAmountLoanInstallmentInfoStartingCapitalAmn = value;
    }

    /**
     * Gets the value of the outLoanAsoInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAsoInd() {
        return outLoanAsoInd;
    }

    /**
     * Sets the value of the outLoanAsoInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAsoInd(String value) {
        this.outLoanAsoInd = value;
    }

    /**
     * Gets the value of the outLoanAtmCardFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAtmCardFlag() {
        return outLoanAtmCardFlag;
    }

    /**
     * Sets the value of the outLoanAtmCardFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAtmCardFlag(String value) {
        this.outLoanAtmCardFlag = value;
    }

    /**
     * Gets the value of the outLoanCapitalTolerance property.
     * 
     */
    public short getOutLoanCapitalTolerance() {
        return outLoanCapitalTolerance;
    }

    /**
     * Sets the value of the outLoanCapitalTolerance property.
     * 
     */
    public void setOutLoanCapitalTolerance(short value) {
        this.outLoanCapitalTolerance = value;
    }

    /**
     * Gets the value of the outLoanCollRequestLimit property.
     * 
     */
    public short getOutLoanCollRequestLimit() {
        return outLoanCollRequestLimit;
    }

    /**
     * Sets the value of the outLoanCollRequestLimit property.
     * 
     */
    public void setOutLoanCollRequestLimit(short value) {
        this.outLoanCollRequestLimit = value;
    }

    /**
     * Gets the value of the outLoanCurFxIntInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanCurFxIntInd() {
        return outLoanCurFxIntInd;
    }

    /**
     * Sets the value of the outLoanCurFxIntInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanCurFxIntInd(String value) {
        this.outLoanCurFxIntInd = value;
    }

    /**
     * Gets the value of the outLoanCurrInterestPrd property.
     * 
     */
    public short getOutLoanCurrInterestPrd() {
        return outLoanCurrInterestPrd;
    }

    /**
     * Sets the value of the outLoanCurrInterestPrd property.
     * 
     */
    public void setOutLoanCurrInterestPrd(short value) {
        this.outLoanCurrInterestPrd = value;
    }

    /**
     * Gets the value of the outLoanDdAccrLstDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanDdAccrLstDt() {
        return outLoanDdAccrLstDt;
    }

    /**
     * Sets the value of the outLoanDdAccrLstDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanDdAccrLstDt(XMLGregorianCalendar value) {
        this.outLoanDdAccrLstDt = value;
    }

    /**
     * Gets the value of the outLoanDepositAccFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanDepositAccFlg() {
        return outLoanDepositAccFlg;
    }

    /**
     * Sets the value of the outLoanDepositAccFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanDepositAccFlg(String value) {
        this.outLoanDepositAccFlg = value;
    }

    /**
     * Gets the value of the outLoanDiffIntAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanDiffIntAlgorithm() {
        return outLoanDiffIntAlgorithm;
    }

    /**
     * Sets the value of the outLoanDiffIntAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanDiffIntAlgorithm(String value) {
        this.outLoanDiffIntAlgorithm = value;
    }

    /**
     * Gets the value of the outLoanDurationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanDurationType() {
        return outLoanDurationType;
    }

    /**
     * Sets the value of the outLoanDurationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanDurationType(String value) {
        this.outLoanDurationType = value;
    }

    /**
     * Gets the value of the outLoanDurationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanDurationUnit() {
        return outLoanDurationUnit;
    }

    /**
     * Sets the value of the outLoanDurationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanDurationUnit(String value) {
        this.outLoanDurationUnit = value;
    }

    /**
     * Gets the value of the outLoanEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanEntryStatus() {
        return outLoanEntryStatus;
    }

    /**
     * Sets the value of the outLoanEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanEntryStatus(String value) {
        this.outLoanEntryStatus = value;
    }

    /**
     * Gets the value of the outLoanGeneralFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanGeneralFlags() {
        return outLoanGeneralFlags;
    }

    /**
     * Sets the value of the outLoanGeneralFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanGeneralFlags(String value) {
        this.outLoanGeneralFlags = value;
    }

    /**
     * Gets the value of the outLoanGracePrdUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanGracePrdUnit() {
        return outLoanGracePrdUnit;
    }

    /**
     * Sets the value of the outLoanGracePrdUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanGracePrdUnit(String value) {
        this.outLoanGracePrdUnit = value;
    }

    /**
     * Gets the value of the outLoanInstallMechFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanInstallMechFlg() {
        return outLoanInstallMechFlg;
    }

    /**
     * Sets the value of the outLoanInstallMechFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanInstallMechFlg(String value) {
        this.outLoanInstallMechFlg = value;
    }

    /**
     * Gets the value of the outLoanInstallTolerance property.
     * 
     */
    public short getOutLoanInstallTolerance() {
        return outLoanInstallTolerance;
    }

    /**
     * Sets the value of the outLoanInstallTolerance property.
     * 
     */
    public void setOutLoanInstallTolerance(short value) {
        this.outLoanInstallTolerance = value;
    }

    /**
     * Gets the value of the outLoanInstallUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanInstallUnit() {
        return outLoanInstallUnit;
    }

    /**
     * Sets the value of the outLoanInstallUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanInstallUnit(String value) {
        this.outLoanInstallUnit = value;
    }

    /**
     * Gets the value of the outLoanInstantCreditFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanInstantCreditFlg() {
        return outLoanInstantCreditFlg;
    }

    /**
     * Sets the value of the outLoanInstantCreditFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanInstantCreditFlg(String value) {
        this.outLoanInstantCreditFlg = value;
    }

    /**
     * Gets the value of the outLoanIntCapitalFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanIntCapitalFlg() {
        return outLoanIntCapitalFlg;
    }

    /**
     * Sets the value of the outLoanIntCapitalFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanIntCapitalFlg(String value) {
        this.outLoanIntCapitalFlg = value;
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
     * Gets the value of the outLoanInterestTolerance property.
     * 
     */
    public short getOutLoanInterestTolerance() {
        return outLoanInterestTolerance;
    }

    /**
     * Sets the value of the outLoanInterestTolerance property.
     * 
     */
    public void setOutLoanInterestTolerance(short value) {
        this.outLoanInterestTolerance = value;
    }

    /**
     * Gets the value of the outLoanInterestUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanInterestUnit() {
        return outLoanInterestUnit;
    }

    /**
     * Sets the value of the outLoanInterestUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanInterestUnit(String value) {
        this.outLoanInterestUnit = value;
    }

    /**
     * Gets the value of the outLoanIntPayableFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanIntPayableFlg() {
        return outLoanIntPayableFlg;
    }

    /**
     * Sets the value of the outLoanIntPayableFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanIntPayableFlg(String value) {
        this.outLoanIntPayableFlg = value;
    }

    /**
     * Gets the value of the outLoanIpIntCapitalFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanIpIntCapitalFlg() {
        return outLoanIpIntCapitalFlg;
    }

    /**
     * Sets the value of the outLoanIpIntCapitalFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanIpIntCapitalFlg(String value) {
        this.outLoanIpIntCapitalFlg = value;
    }

    /**
     * Gets the value of the outLoanIpIntPayableFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanIpIntPayableFlg() {
        return outLoanIpIntPayableFlg;
    }

    /**
     * Sets the value of the outLoanIpIntPayableFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanIpIntPayableFlg(String value) {
        this.outLoanIpIntPayableFlg = value;
    }

    /**
     * Gets the value of the outLoanLoanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanLoanType() {
        return outLoanLoanType;
    }

    /**
     * Sets the value of the outLoanLoanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanLoanType(String value) {
        this.outLoanLoanType = value;
    }

    /**
     * Gets the value of the outLoanLstPrintTransDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanLstPrintTransDt() {
        return outLoanLstPrintTransDt;
    }

    /**
     * Sets the value of the outLoanLstPrintTransDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanLstPrintTransDt(XMLGregorianCalendar value) {
        this.outLoanLstPrintTransDt = value;
    }

    /**
     * Gets the value of the outLoanLumpDrawdown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanLumpDrawdown() {
        return outLoanLumpDrawdown;
    }

    /**
     * Sets the value of the outLoanLumpDrawdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanLumpDrawdown(String value) {
        this.outLoanLumpDrawdown = value;
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
     * Gets the value of the outLoanMaxInstallCnt property.
     * 
     */
    public short getOutLoanMaxInstallCnt() {
        return outLoanMaxInstallCnt;
    }

    /**
     * Sets the value of the outLoanMaxInstallCnt property.
     * 
     */
    public void setOutLoanMaxInstallCnt(short value) {
        this.outLoanMaxInstallCnt = value;
    }

    /**
     * Gets the value of the outLoanMaxInstallFrq property.
     * 
     */
    public short getOutLoanMaxInstallFrq() {
        return outLoanMaxInstallFrq;
    }

    /**
     * Sets the value of the outLoanMaxInstallFrq property.
     * 
     */
    public void setOutLoanMaxInstallFrq(short value) {
        this.outLoanMaxInstallFrq = value;
    }

    /**
     * Gets the value of the outLoanMaxInterestFrq property.
     * 
     */
    public short getOutLoanMaxInterestFrq() {
        return outLoanMaxInterestFrq;
    }

    /**
     * Sets the value of the outLoanMaxInterestFrq property.
     * 
     */
    public void setOutLoanMaxInterestFrq(short value) {
        this.outLoanMaxInterestFrq = value;
    }

    /**
     * Gets the value of the outLoanMaxLoanDurat property.
     * 
     */
    public short getOutLoanMaxLoanDurat() {
        return outLoanMaxLoanDurat;
    }

    /**
     * Sets the value of the outLoanMaxLoanDurat property.
     * 
     */
    public void setOutLoanMaxLoanDurat(short value) {
        this.outLoanMaxLoanDurat = value;
    }

    /**
     * Gets the value of the outLoanMaxOverdueDurat property.
     * 
     */
    public short getOutLoanMaxOverdueDurat() {
        return outLoanMaxOverdueDurat;
    }

    /**
     * Sets the value of the outLoanMaxOverdueDurat property.
     * 
     */
    public void setOutLoanMaxOverdueDurat(short value) {
        this.outLoanMaxOverdueDurat = value;
    }

    /**
     * Gets the value of the outLoanMaxRecycleDurat property.
     * 
     */
    public short getOutLoanMaxRecycleDurat() {
        return outLoanMaxRecycleDurat;
    }

    /**
     * Sets the value of the outLoanMaxRecycleDurat property.
     * 
     */
    public void setOutLoanMaxRecycleDurat(short value) {
        this.outLoanMaxRecycleDurat = value;
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
     * Gets the value of the outLoanMinInstallCnt property.
     * 
     */
    public short getOutLoanMinInstallCnt() {
        return outLoanMinInstallCnt;
    }

    /**
     * Sets the value of the outLoanMinInstallCnt property.
     * 
     */
    public void setOutLoanMinInstallCnt(short value) {
        this.outLoanMinInstallCnt = value;
    }

    /**
     * Gets the value of the outLoanMinInstallFrq property.
     * 
     */
    public short getOutLoanMinInstallFrq() {
        return outLoanMinInstallFrq;
    }

    /**
     * Sets the value of the outLoanMinInstallFrq property.
     * 
     */
    public void setOutLoanMinInstallFrq(short value) {
        this.outLoanMinInstallFrq = value;
    }

    /**
     * Gets the value of the outLoanMinInterestFrq property.
     * 
     */
    public short getOutLoanMinInterestFrq() {
        return outLoanMinInterestFrq;
    }

    /**
     * Sets the value of the outLoanMinInterestFrq property.
     * 
     */
    public void setOutLoanMinInterestFrq(short value) {
        this.outLoanMinInterestFrq = value;
    }

    /**
     * Gets the value of the outLoanMinLoanDurat property.
     * 
     */
    public short getOutLoanMinLoanDurat() {
        return outLoanMinLoanDurat;
    }

    /**
     * Sets the value of the outLoanMinLoanDurat property.
     * 
     */
    public void setOutLoanMinLoanDurat(short value) {
        this.outLoanMinLoanDurat = value;
    }

    /**
     * Gets the value of the outLoanMinPaymentAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanMinPaymentAmn() {
        return outLoanMinPaymentAmn;
    }

    /**
     * Sets the value of the outLoanMinPaymentAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanMinPaymentAmn(BigDecimal value) {
        this.outLoanMinPaymentAmn = value;
    }

    /**
     * Gets the value of the outLoanMinPaymentPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanMinPaymentPerc() {
        return outLoanMinPaymentPerc;
    }

    /**
     * Sets the value of the outLoanMinPaymentPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanMinPaymentPerc(BigDecimal value) {
        this.outLoanMinPaymentPerc = value;
    }

    /**
     * Gets the value of the outLoanMinRecycleDurat property.
     * 
     */
    public short getOutLoanMinRecycleDurat() {
        return outLoanMinRecycleDurat;
    }

    /**
     * Sets the value of the outLoanMinRecycleDurat property.
     * 
     */
    public void setOutLoanMinRecycleDurat(short value) {
        this.outLoanMinRecycleDurat = value;
    }

    /**
     * Gets the value of the outLoanMoratIntPayFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanMoratIntPayFlg() {
        return outLoanMoratIntPayFlg;
    }

    /**
     * Sets the value of the outLoanMoratIntPayFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanMoratIntPayFlg(String value) {
        this.outLoanMoratIntPayFlg = value;
    }

    /**
     * Gets the value of the outLoanNoIntMoratorFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanNoIntMoratorFlg() {
        return outLoanNoIntMoratorFlg;
    }

    /**
     * Sets the value of the outLoanNoIntMoratorFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanNoIntMoratorFlg(String value) {
        this.outLoanNoIntMoratorFlg = value;
    }

    /**
     * Gets the value of the outLoanNonIntCapitFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanNonIntCapitFlg() {
        return outLoanNonIntCapitFlg;
    }

    /**
     * Sets the value of the outLoanNonIntCapitFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanNonIntCapitFlg(String value) {
        this.outLoanNonIntCapitFlg = value;
    }

    /**
     * Gets the value of the outLoanNrmAccrLstDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanNrmAccrLstDt() {
        return outLoanNrmAccrLstDt;
    }

    /**
     * Sets the value of the outLoanNrmAccrLstDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanNrmAccrLstDt(XMLGregorianCalendar value) {
        this.outLoanNrmAccrLstDt = value;
    }

    /**
     * Gets the value of the outLoanNrmInterestDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanNrmInterestDt() {
        return outLoanNrmInterestDt;
    }

    /**
     * Sets the value of the outLoanNrmInterestDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanNrmInterestDt(XMLGregorianCalendar value) {
        this.outLoanNrmInterestDt = value;
    }

    /**
     * Gets the value of the outLoanNrmInterestFreq property.
     * 
     */
    public short getOutLoanNrmInterestFreq() {
        return outLoanNrmInterestFreq;
    }

    /**
     * Sets the value of the outLoanNrmInterestFreq property.
     * 
     */
    public void setOutLoanNrmInterestFreq(short value) {
        this.outLoanNrmInterestFreq = value;
    }

    /**
     * Gets the value of the outLoanNrmInterestUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanNrmInterestUnit() {
        return outLoanNrmInterestUnit;
    }

    /**
     * Sets the value of the outLoanNrmInterestUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanNrmInterestUnit(String value) {
        this.outLoanNrmInterestUnit = value;
    }

    /**
     * Gets the value of the outLoanNrmLstValeurDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanNrmLstValeurDt() {
        return outLoanNrmLstValeurDt;
    }

    /**
     * Sets the value of the outLoanNrmLstValeurDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanNrmLstValeurDt(XMLGregorianCalendar value) {
        this.outLoanNrmLstValeurDt = value;
    }

    /**
     * Gets the value of the outLoanNrmNxtValeurDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanNrmNxtValeurDt() {
        return outLoanNrmNxtValeurDt;
    }

    /**
     * Sets the value of the outLoanNrmNxtValeurDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanNrmNxtValeurDt(XMLGregorianCalendar value) {
        this.outLoanNrmNxtValeurDt = value;
    }

    /**
     * Gets the value of the outLoanNxtPrintTransDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanNxtPrintTransDt() {
        return outLoanNxtPrintTransDt;
    }

    /**
     * Sets the value of the outLoanNxtPrintTransDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanNxtPrintTransDt(XMLGregorianCalendar value) {
        this.outLoanNxtPrintTransDt = value;
    }

    /**
     * Gets the value of the outLoanOvAccrLstDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanOvAccrLstDt() {
        return outLoanOvAccrLstDt;
    }

    /**
     * Sets the value of the outLoanOvAccrLstDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanOvAccrLstDt(XMLGregorianCalendar value) {
        this.outLoanOvAccrLstDt = value;
    }

    /**
     * Gets the value of the outLoanOvInterestFreq property.
     * 
     */
    public short getOutLoanOvInterestFreq() {
        return outLoanOvInterestFreq;
    }

    /**
     * Sets the value of the outLoanOvInterestFreq property.
     * 
     */
    public void setOutLoanOvInterestFreq(short value) {
        this.outLoanOvInterestFreq = value;
    }

    /**
     * Gets the value of the outLoanOvInterestUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanOvInterestUnit() {
        return outLoanOvInterestUnit;
    }

    /**
     * Sets the value of the outLoanOvInterestUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanOvInterestUnit(String value) {
        this.outLoanOvInterestUnit = value;
    }

    /**
     * Gets the value of the outLoanPeriodicIntFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanPeriodicIntFlg() {
        return outLoanPeriodicIntFlg;
    }

    /**
     * Sets the value of the outLoanPeriodicIntFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanPeriodicIntFlg(String value) {
        this.outLoanPeriodicIntFlg = value;
    }

    /**
     * Gets the value of the outLoanPrintStatementDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanPrintStatementDt() {
        return outLoanPrintStatementDt;
    }

    /**
     * Sets the value of the outLoanPrintStatementDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanPrintStatementDt(XMLGregorianCalendar value) {
        this.outLoanPrintStatementDt = value;
    }

    /**
     * Gets the value of the outLoanRecycleUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanRecycleUnit() {
        return outLoanRecycleUnit;
    }

    /**
     * Sets the value of the outLoanRecycleUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanRecycleUnit(String value) {
        this.outLoanRecycleUnit = value;
    }

    /**
     * Gets the value of the outLoanRecyclingLmtFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanRecyclingLmtFlg() {
        return outLoanRecyclingLmtFlg;
    }

    /**
     * Sets the value of the outLoanRecyclingLmtFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanRecyclingLmtFlg(String value) {
        this.outLoanRecyclingLmtFlg = value;
    }

    /**
     * Gets the value of the outLoanRenewalInterFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanRenewalInterFlg() {
        return outLoanRenewalInterFlg;
    }

    /**
     * Sets the value of the outLoanRenewalInterFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanRenewalInterFlg(String value) {
        this.outLoanRenewalInterFlg = value;
    }

    /**
     * Gets the value of the outLoanRiskFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanRiskFactor() {
        return outLoanRiskFactor;
    }

    /**
     * Sets the value of the outLoanRiskFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanRiskFactor(BigDecimal value) {
        this.outLoanRiskFactor = value;
    }

    /**
     * Gets the value of the outLoanSelectIntFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanSelectIntFlg() {
        return outLoanSelectIntFlg;
    }

    /**
     * Sets the value of the outLoanSelectIntFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanSelectIntFlg(String value) {
        this.outLoanSelectIntFlg = value;
    }

    /**
     * Gets the value of the outLoanTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanTmstamp() {
        return outLoanTmstamp;
    }

    /**
     * Sets the value of the outLoanTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanTmstamp(XMLGregorianCalendar value) {
        this.outLoanTmstamp = value;
    }

    /**
     * Gets the value of the outLoanTolDays1 property.
     * 
     */
    public short getOutLoanTolDays1() {
        return outLoanTolDays1;
    }

    /**
     * Sets the value of the outLoanTolDays1 property.
     * 
     */
    public void setOutLoanTolDays1(short value) {
        this.outLoanTolDays1 = value;
    }

    /**
     * Gets the value of the outLoanTolDays2 property.
     * 
     */
    public short getOutLoanTolDays2() {
        return outLoanTolDays2;
    }

    /**
     * Sets the value of the outLoanTolDays2 property.
     * 
     */
    public void setOutLoanTolDays2(short value) {
        this.outLoanTolDays2 = value;
    }

    /**
     * Gets the value of the outLoanTolDays3 property.
     * 
     */
    public short getOutLoanTolDays3() {
        return outLoanTolDays3;
    }

    /**
     * Sets the value of the outLoanTolDays3 property.
     * 
     */
    public void setOutLoanTolDays3(short value) {
        this.outLoanTolDays3 = value;
    }

    /**
     * Gets the value of the outLoanTolDays5 property.
     * 
     */
    public short getOutLoanTolDays5() {
        return outLoanTolDays5;
    }

    /**
     * Sets the value of the outLoanTolDays5 property.
     * 
     */
    public void setOutLoanTolDays5(short value) {
        this.outLoanTolDays5 = value;
    }

    /**
     * Gets the value of the outLoanToleranceDays property.
     * 
     */
    public short getOutLoanToleranceDays() {
        return outLoanToleranceDays;
    }

    /**
     * Sets the value of the outLoanToleranceDays property.
     * 
     */
    public void setOutLoanToleranceDays(short value) {
        this.outLoanToleranceDays = value;
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
     * Gets the value of the outLoanAccountInfoAutFixIntRenew property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountInfoAutFixIntRenew() {
        return outLoanAccountInfoAutFixIntRenew;
    }

    /**
     * Sets the value of the outLoanAccountInfoAutFixIntRenew property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountInfoAutFixIntRenew(String value) {
        this.outLoanAccountInfoAutFixIntRenew = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoFluctuationRange property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountInfoFluctuationRange() {
        return outLoanAccountInfoFluctuationRange;
    }

    /**
     * Sets the value of the outLoanAccountInfoFluctuationRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountInfoFluctuationRange(BigDecimal value) {
        this.outLoanAccountInfoFluctuationRange = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoInitialInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountInfoInitialInterest() {
        return outLoanAccountInfoInitialInterest;
    }

    /**
     * Sets the value of the outLoanAccountInfoInitialInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountInfoInitialInterest(BigDecimal value) {
        this.outLoanAccountInfoInitialInterest = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoMoratIntPayFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountInfoMoratIntPayFlg() {
        return outLoanAccountInfoMoratIntPayFlg;
    }

    /**
     * Sets the value of the outLoanAccountInfoMoratIntPayFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountInfoMoratIntPayFlg(String value) {
        this.outLoanAccountInfoMoratIntPayFlg = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoMoratoriumIntDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountInfoMoratoriumIntDt() {
        return outLoanAccountInfoMoratoriumIntDt;
    }

    /**
     * Sets the value of the outLoanAccountInfoMoratoriumIntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountInfoMoratoriumIntDt(XMLGregorianCalendar value) {
        this.outLoanAccountInfoMoratoriumIntDt = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoMoratoriumIntFrq property.
     * 
     */
    public short getOutLoanAccountInfoMoratoriumIntFrq() {
        return outLoanAccountInfoMoratoriumIntFrq;
    }

    /**
     * Sets the value of the outLoanAccountInfoMoratoriumIntFrq property.
     * 
     */
    public void setOutLoanAccountInfoMoratoriumIntFrq(short value) {
        this.outLoanAccountInfoMoratoriumIntFrq = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoSelectedBankRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountInfoSelectedBankRate() {
        return outLoanAccountInfoSelectedBankRate;
    }

    /**
     * Sets the value of the outLoanAccountInfoSelectedBankRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountInfoSelectedBankRate(BigDecimal value) {
        this.outLoanAccountInfoSelectedBankRate = value;
    }

    /**
     * Gets the value of the outLoanInstallmentInfoStartingCapitalAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanInstallmentInfoStartingCapitalAmn() {
        return outLoanInstallmentInfoStartingCapitalAmn;
    }

    /**
     * Sets the value of the outLoanInstallmentInfoStartingCapitalAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanInstallmentInfoStartingCapitalAmn(BigDecimal value) {
        this.outLoanInstallmentInfoStartingCapitalAmn = value;
    }

    /**
     * Gets the value of the outLoanInstallmentInfoTotalCostoptAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanInstallmentInfoTotalCostoptAmn() {
        return outLoanInstallmentInfoTotalCostoptAmn;
    }

    /**
     * Sets the value of the outLoanInstallmentInfoTotalCostoptAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanInstallmentInfoTotalCostoptAmn(BigDecimal value) {
        this.outLoanInstallmentInfoTotalCostoptAmn = value;
    }

    /**
     * Gets the value of the outLoanInstallmentInfoTotalDbInterestAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanInstallmentInfoTotalDbInterestAmn() {
        return outLoanInstallmentInfoTotalDbInterestAmn;
    }

    /**
     * Sets the value of the outLoanInstallmentInfoTotalDbInterestAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanInstallmentInfoTotalDbInterestAmn(BigDecimal value) {
        this.outLoanInstallmentInfoTotalDbInterestAmn = value;
    }

    /**
     * Gets the value of the outLoanInstallmentInfoTotalExpensesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanInstallmentInfoTotalExpensesAmount() {
        return outLoanInstallmentInfoTotalExpensesAmount;
    }

    /**
     * Sets the value of the outLoanInstallmentInfoTotalExpensesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanInstallmentInfoTotalExpensesAmount(BigDecimal value) {
        this.outLoanInstallmentInfoTotalExpensesAmount = value;
    }

    /**
     * Gets the value of the outLoanInstallmentInfoTotalGraceInterAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanInstallmentInfoTotalGraceInterAmn() {
        return outLoanInstallmentInfoTotalGraceInterAmn;
    }

    /**
     * Sets the value of the outLoanInstallmentInfoTotalGraceInterAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanInstallmentInfoTotalGraceInterAmn(BigDecimal value) {
        this.outLoanInstallmentInfoTotalGraceInterAmn = value;
    }

    /**
     * Gets the value of the outLoanInstallmentInfoTotalInsuranceAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanInstallmentInfoTotalInsuranceAmn() {
        return outLoanInstallmentInfoTotalInsuranceAmn;
    }

    /**
     * Sets the value of the outLoanInstallmentInfoTotalInsuranceAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanInstallmentInfoTotalInsuranceAmn(BigDecimal value) {
        this.outLoanInstallmentInfoTotalInsuranceAmn = value;
    }

    /**
     * Gets the value of the outLoanInstallmentInfoTotalInterestAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanInstallmentInfoTotalInterestAmn() {
        return outLoanInstallmentInfoTotalInterestAmn;
    }

    /**
     * Sets the value of the outLoanInstallmentInfoTotalInterestAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanInstallmentInfoTotalInterestAmn(BigDecimal value) {
        this.outLoanInstallmentInfoTotalInterestAmn = value;
    }

    /**
     * Gets the value of the outLoanInstallmentInfoTotalN128Amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanInstallmentInfoTotalN128Amount() {
        return outLoanInstallmentInfoTotalN128Amount;
    }

    /**
     * Sets the value of the outLoanInstallmentInfoTotalN128Amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanInstallmentInfoTotalN128Amount(BigDecimal value) {
        this.outLoanInstallmentInfoTotalN128Amount = value;
    }

    /**
     * Gets the value of the outLoanInstallmentInfoTotalRoundingAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanInstallmentInfoTotalRoundingAmn() {
        return outLoanInstallmentInfoTotalRoundingAmn;
    }

    /**
     * Sets the value of the outLoanInstallmentInfoTotalRoundingAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanInstallmentInfoTotalRoundingAmn(BigDecimal value) {
        this.outLoanInstallmentInfoTotalRoundingAmn = value;
    }

    /**
     * Gets the value of the outLoanInstallmentInfoTotalSpreadAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanInstallmentInfoTotalSpreadAmount() {
        return outLoanInstallmentInfoTotalSpreadAmount;
    }

    /**
     * Sets the value of the outLoanInstallmentInfoTotalSpreadAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanInstallmentInfoTotalSpreadAmount(BigDecimal value) {
        this.outLoanInstallmentInfoTotalSpreadAmount = value;
    }

    /**
     * Gets the value of the outLoanInstallmentInfoTotalSubsidy2Amn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanInstallmentInfoTotalSubsidy2Amn() {
        return outLoanInstallmentInfoTotalSubsidy2Amn;
    }

    /**
     * Sets the value of the outLoanInstallmentInfoTotalSubsidy2Amn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanInstallmentInfoTotalSubsidy2Amn(BigDecimal value) {
        this.outLoanInstallmentInfoTotalSubsidy2Amn = value;
    }

    /**
     * Gets the value of the outLoanInstallmentInfoTotalSubsidyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanInstallmentInfoTotalSubsidyAmount() {
        return outLoanInstallmentInfoTotalSubsidyAmount;
    }

    /**
     * Sets the value of the outLoanInstallmentInfoTotalSubsidyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanInstallmentInfoTotalSubsidyAmount(BigDecimal value) {
        this.outLoanInstallmentInfoTotalSubsidyAmount = value;
    }

    /**
     * Gets the value of the outLoanProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanProductDescription() {
        return outLoanProductDescription;
    }

    /**
     * Sets the value of the outLoanProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanProductDescription(String value) {
        this.outLoanProductDescription = value;
    }

    /**
     * Gets the value of the outLoanProductIdProduct property.
     * 
     */
    public int getOutLoanProductIdProduct() {
        return outLoanProductIdProduct;
    }

    /**
     * Sets the value of the outLoanProductIdProduct property.
     * 
     */
    public void setOutLoanProductIdProduct(int value) {
        this.outLoanProductIdProduct = value;
    }

    /**
     * Gets the value of the outLoanStatusCharSuppliedChar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanStatusCharSuppliedChar20() {
        return outLoanStatusCharSuppliedChar20;
    }

    /**
     * Sets the value of the outLoanStatusCharSuppliedChar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanStatusCharSuppliedChar20(String value) {
        this.outLoanStatusCharSuppliedChar20 = value;
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
     * Gets the value of the outLoanWorkFlgsEqInterestFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanWorkFlgsEqInterestFlg() {
        return outLoanWorkFlgsEqInterestFlg;
    }

    /**
     * Sets the value of the outLoanWorkFlgsEqInterestFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanWorkFlgsEqInterestFlg(String value) {
        this.outLoanWorkFlgsEqInterestFlg = value;
    }

    /**
     * Gets the value of the outLoanWorkFlgsVariableInstalmentFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanWorkFlgsVariableInstalmentFlg() {
        return outLoanWorkFlgsVariableInstalmentFlg;
    }

    /**
     * Sets the value of the outLoanWorkFlgsVariableInstalmentFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanWorkFlgsVariableInstalmentFlg(String value) {
        this.outLoanWorkFlgsVariableInstalmentFlg = value;
    }

    /**
     * Gets the value of the outLoopFlagIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoopFlagIefSuppliedFlag() {
        return outLoopFlagIefSuppliedFlag;
    }

    /**
     * Sets the value of the outLoopFlagIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoopFlagIefSuppliedFlag(String value) {
        this.outLoopFlagIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outLssMoratInterestSupplyWorkMoratorN128Rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLssMoratInterestSupplyWorkMoratorN128Rate() {
        return outLssMoratInterestSupplyWorkMoratorN128Rate;
    }

    /**
     * Sets the value of the outLssMoratInterestSupplyWorkMoratorN128Rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLssMoratInterestSupplyWorkMoratorN128Rate(BigDecimal value) {
        this.outLssMoratInterestSupplyWorkMoratorN128Rate = value;
    }

    /**
     * Gets the value of the outLssMoratInterestSupplyWorkMoratorNrmRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLssMoratInterestSupplyWorkMoratorNrmRate() {
        return outLssMoratInterestSupplyWorkMoratorNrmRate;
    }

    /**
     * Sets the value of the outLssMoratInterestSupplyWorkMoratorNrmRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLssMoratInterestSupplyWorkMoratorNrmRate(BigDecimal value) {
        this.outLssMoratInterestSupplyWorkMoratorNrmRate = value;
    }

    /**
     * Gets the value of the outLssMoratInterestSupplyWorkMoratorSprRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLssMoratInterestSupplyWorkMoratorSprRate() {
        return outLssMoratInterestSupplyWorkMoratorSprRate;
    }

    /**
     * Sets the value of the outLssMoratInterestSupplyWorkMoratorSprRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLssMoratInterestSupplyWorkMoratorSprRate(BigDecimal value) {
        this.outLssMoratInterestSupplyWorkMoratorSprRate = value;
    }

    /**
     * Gets the value of the outLssMoratInterestSupplyWorkMoratorSubs2Rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLssMoratInterestSupplyWorkMoratorSubs2Rate() {
        return outLssMoratInterestSupplyWorkMoratorSubs2Rate;
    }

    /**
     * Sets the value of the outLssMoratInterestSupplyWorkMoratorSubs2Rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLssMoratInterestSupplyWorkMoratorSubs2Rate(BigDecimal value) {
        this.outLssMoratInterestSupplyWorkMoratorSubs2Rate = value;
    }

    /**
     * Gets the value of the outLssMoratInterestSupplyWorkMoratorSubsRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLssMoratInterestSupplyWorkMoratorSubsRate() {
        return outLssMoratInterestSupplyWorkMoratorSubsRate;
    }

    /**
     * Sets the value of the outLssMoratInterestSupplyWorkMoratorSubsRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLssMoratInterestSupplyWorkMoratorSubsRate(BigDecimal value) {
        this.outLssMoratInterestSupplyWorkMoratorSubsRate = value;
    }

    /**
     * Gets the value of the outMaintainEqInstLoanAccountInfoMaintainEqInst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMaintainEqInstLoanAccountInfoMaintainEqInst() {
        return outMaintainEqInstLoanAccountInfoMaintainEqInst;
    }

    /**
     * Sets the value of the outMaintainEqInstLoanAccountInfoMaintainEqInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMaintainEqInstLoanAccountInfoMaintainEqInst(String value) {
        this.outMaintainEqInstLoanAccountInfoMaintainEqInst = value;
    }

    /**
     * Gets the value of the outMpEndAmnLoanInstallmentInfoStartingCapitalAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutMpEndAmnLoanInstallmentInfoStartingCapitalAmn() {
        return outMpEndAmnLoanInstallmentInfoStartingCapitalAmn;
    }

    /**
     * Sets the value of the outMpEndAmnLoanInstallmentInfoStartingCapitalAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutMpEndAmnLoanInstallmentInfoStartingCapitalAmn(BigDecimal value) {
        this.outMpEndAmnLoanInstallmentInfoStartingCapitalAmn = value;
    }

    /**
     * Gets the value of the outN128360365IefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutN128360365IefSuppliedFlag() {
        return outN128360365IefSuppliedFlag;
    }

    /**
     * Sets the value of the outN128360365IefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutN128360365IefSuppliedFlag(String value) {
        this.outN128360365IefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outN128InterestSupplyWorkCurFxIntScalDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutN128InterestSupplyWorkCurFxIntScalDt() {
        return outN128InterestSupplyWorkCurFxIntScalDt;
    }

    /**
     * Sets the value of the outN128InterestSupplyWorkCurFxIntScalDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutN128InterestSupplyWorkCurFxIntScalDt(XMLGregorianCalendar value) {
        this.outN128InterestSupplyWorkCurFxIntScalDt = value;
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
     * Gets the value of the outProduct360365LoanInterDaysInst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProduct360365LoanInterDaysInst() {
        return outProduct360365LoanInterDaysInst;
    }

    /**
     * Sets the value of the outProduct360365LoanInterDaysInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProduct360365LoanInterDaysInst(String value) {
        this.outProduct360365LoanInterDaysInst = value;
    }

    /**
     * Gets the value of the outSaveResultsInDbIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSaveResultsInDbIefSuppliedFlag() {
        return outSaveResultsInDbIefSuppliedFlag;
    }

    /**
     * Sets the value of the outSaveResultsInDbIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSaveResultsInDbIefSuppliedFlag(String value) {
        this.outSaveResultsInDbIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outSecondFixedInterestSupplyWorkCurFxIntScalDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSecondFixedInterestSupplyWorkCurFxIntScalDt() {
        return outSecondFixedInterestSupplyWorkCurFxIntScalDt;
    }

    /**
     * Sets the value of the outSecondFixedInterestSupplyWorkCurFxIntScalDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSecondFixedInterestSupplyWorkCurFxIntScalDt(XMLGregorianCalendar value) {
        this.outSecondFixedInterestSupplyWorkCurFxIntScalDt = value;
    }

    /**
     * Gets the value of the outSecondFixedInterestSupplyWorkFixedInterestPrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSecondFixedInterestSupplyWorkFixedInterestPrc() {
        return outSecondFixedInterestSupplyWorkFixedInterestPrc;
    }

    /**
     * Sets the value of the outSecondFixedInterestSupplyWorkFixedInterestPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSecondFixedInterestSupplyWorkFixedInterestPrc(BigDecimal value) {
        this.outSecondFixedInterestSupplyWorkFixedInterestPrc = value;
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
     * Gets the value of the outShowLiteralIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutShowLiteralIefSuppliedFlag() {
        return outShowLiteralIefSuppliedFlag;
    }

    /**
     * Sets the value of the outShowLiteralIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutShowLiteralIefSuppliedFlag(String value) {
        this.outShowLiteralIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outSubsidyLoanAccountMoratorSprRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSubsidyLoanAccountMoratorSprRate() {
        return outSubsidyLoanAccountMoratorSprRate;
    }

    /**
     * Sets the value of the outSubsidyLoanAccountMoratorSprRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSubsidyLoanAccountMoratorSprRate(BigDecimal value) {
        this.outSubsidyLoanAccountMoratorSprRate = value;
    }

    /**
     * Gets the value of the outSubsidyLoanAccountMoratorSubsRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSubsidyLoanAccountMoratorSubsRate() {
        return outSubsidyLoanAccountMoratorSubsRate;
    }

    /**
     * Sets the value of the outSubsidyLoanAccountMoratorSubsRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSubsidyLoanAccountMoratorSubsRate(BigDecimal value) {
        this.outSubsidyLoanAccountMoratorSubsRate = value;
    }

    /**
     * Gets the value of the outGrpAnnual property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpAnnual }
     *     
     */
    public ArrayOfOutGrpAnnual getOutGrpAnnual() {
        return outGrpAnnual;
    }

    /**
     * Sets the value of the outGrpAnnual property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpAnnual }
     *     
     */
    public void setOutGrpAnnual(ArrayOfOutGrpAnnual value) {
        this.outGrpAnnual = value;
    }

    /**
     * Gets the value of the outGrpInstallments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpInstallments }
     *     
     */
    public ArrayOfOutGrpInstallments getOutGrpInstallments() {
        return outGrpInstallments;
    }

    /**
     * Sets the value of the outGrpInstallments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpInstallments }
     *     
     */
    public void setOutGrpInstallments(ArrayOfOutGrpInstallments value) {
        this.outGrpInstallments = value;
    }

}
