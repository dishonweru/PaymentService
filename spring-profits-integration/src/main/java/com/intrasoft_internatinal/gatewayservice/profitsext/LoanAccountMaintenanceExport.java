
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LoanAccountMaintenanceExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanAccountMaintenanceExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="Out2LoanAccountSubsidyDuration" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Out2LoanAccountSubsidyExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Out2LoanAccountSubsidyLimitAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Out2LoanAccountSubsidyStartDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Out2MoveCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Out2MoveCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Out2SubsidyOrderDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Out2SubsidyOrderExpiryDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Out2SubsidyOrderIdSubsidy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Out2SubsidyOrderLnsEffectiveDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Out2SubsidyOrderLnsExpiryDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Out2SubsidyOrderSubsDurationPrd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutAccNoLoanAccCollectAccNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAccountTotalAmountIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAdjustGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAdjustGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutAgreementUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementWorkAgrAvailLmtAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAgrProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutAgrProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAsoCustomerListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankParametersAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankParametersBankCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBankParametersBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankParametersCurrTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBankSectorGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankSectorGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBenefIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCategoryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCategoryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCbpurpGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCbpurpGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutChargingCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutChargingCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutClassCodeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutClassCodeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutClientProfitsExitStateWorkActualMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutClientProfitsExitStateWorkId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutClientProfitsExitStateWorkLanguage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutClientProfitsExitStateWorkMessageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutClientProfitsExitStateWorkPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutClientProfitsExitStateWorkRoutineSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutClientProfitsExitStateWorkTerminationAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutClientProfitsExitStateWorkValruleId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutClientProfitsExitStateWorkValruleSnum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCloanGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCloanGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCollectionGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCooperativeCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCreatedProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCreatedProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCreditLineGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCreditLineGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCurrentSpreadInterestSupplyWorkFixedInterestPrc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCurrentSpreadIntScalePercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCurrentSpreadIntScaleValidityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDepProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepProfitsAccountMovementCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDialogSalePersonGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDialogSalePersonGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDialogSaleUnitGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDialogSaleUnitGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutEvalResultTeamInformationAuthorizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationEvaluationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFinancialSectorGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFinancialSectorGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutFixedLnsInterestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFixedLnsInterestDurationUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFixedLnsInterestFixIntDtChgFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFixedLnsInterestFixIntExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutFixedLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutFixedLnsInterestIntDuration" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutFixedN128InterestSupplyWorkFixedInterestPrc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFixedN128IntScalePercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFixedN128IntScaleValidityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutFixedRateInterestSupplyWorkFixedInterestPrc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFixedRateIntScalePercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFixedRateIntScaleValidityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutFixedTexInterestSupplyWorkFixedInterestPrc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFixedTexIntScalePercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFixedTexIntScaleValidityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutFlexFixInstallAmnLoanInstallmentInfoInstallmentAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFloatLnsInterestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFloatLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutFloatN128InterestSupplyWorkFixedInterestPrc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFloatN128IntScalePercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFloatN128IntScaleValidityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutFloatRateInterestSupplyWorkFixedInterestPrc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFloatRateIntScalePercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFloatRateIntScaleValidityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutFloatTexInterestSupplyWorkFixedInterestPrc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFloatTexIntScalePercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFloatTexIntScaleValidityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutForDisplayLoanAccountMoratorN128Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutForDisplayLoanAccountMoratorNrmRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutForDisplayLoanAccountMoratorSprRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGlDefClassGlCrIntAccrGlAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlDefClassGlCrIntGlAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlNrmClassGlCrIntAccrGlAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlNrmClassGlCrIntGlAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlOffClassGlCrIntAccrGlAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlOffClassGlCrIntGlAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlOveClassGlCrIntAccrGlAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlOveClassGlCrIntGlAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCollectionLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLnsAddInfoLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLoanAddInfoLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLoanSubsidyInfoLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLogLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpPayrollLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpPrevLnsAccsLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpReplyLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpSendCollectionLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGuaranteeOrderDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGuaranteeOrderIdGuarantee" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLimitCurrencyDisplayedDecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLimitCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLimitCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLnsMediatorAgreementNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLnsMediatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAsoInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAutFixIntRenew" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanCollRequestLimit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanCurFxIntInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanDepositAccFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanDurationUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanGeneralFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanGracePrdUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanInstallMechFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanInstallUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanInstantCreditFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanIntCapitalFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanInterestUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanIntPayableFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanLoanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanLumpDrawdown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanMaxGracePrdFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanMaxInstallCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanMaxInstallFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanMaxInterestFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanMaxLoanDurat" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanMaxRecycleDurat" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanMinGracePrdFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanMinInstallCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanMinInstallFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanMinInterestFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanMinLoanDurat" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanMinRecycleDurat" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanMoratIntPayFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanNoIntMoratorFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanNonIntCapitFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanPeriodicIntFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanRecycleUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanRecyclingLmtFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanRenewalInterFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanSelectIntFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccDtsPrevAccExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccDtsPrevAccOpenDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccDtsPrevCurFxIntExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccDtsPrevCurFxIntStDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccDtsPrevDrawdownExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccDtsPrevInstallFirstDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccDtsPrevInstallNextDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccDtsPrevInstallPrevDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccDtsPrevMoratoriumIntDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccDtsPrevSpreadEndDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccDtsPrevSpreadStDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccDtsPrevSubsidyExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccDtsPrevSubsidyStartDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
 *         &lt;element name="OutLoanAccountCurFxIntScalDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountCurFxIntStDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountCusStmLstTrnDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountCusStmNxtTrnDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
 *         &lt;element name="OutLoanAccountNrUrlPubIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
 *         &lt;element name="OutLoanAccountReqExpSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountReqInstallSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountReqIntSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountReqLoanSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
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
 *         &lt;element name="OutLoanAccountTotExpenseAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountTotExpInCcAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountTotIntSprdAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountTotNrmIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountTotPnlIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountTotPubCommAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountTotSubsIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountTotThrdprtAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoanAccountUnrealizedFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountDrvWorkAccountBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountDrvWorkLstYrIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountDrvWorkNrmAccountBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountDrvWorkOvAccBookBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountDrvWorkOvAccountBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountDrvWorkTotPaymentAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountInfoAccDrawdownSts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountInfoAccTransitionFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountInfoAdjustmentDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountInfoAgentBank" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoanAccountInfoAutFixIntRenew" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountInfoBlockedAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountInfoCollectionAgency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoanAccountInfoCollectionFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountInfoCollectionLstDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountInfoCollectionTries" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountInfoCreditIntId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoanAccountInfoCrIntSprd" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountInfoCrSprdEndDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountInfoCrSprdStDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountInfoDealDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountInfoDealerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountInfoDiffIntAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountInfoDormantAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountInfoFluctuationRange" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountInfoGuarActNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountInfoGuarComPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountInfoGuarExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountInfoInitialInterest" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountInfoInstallCalcPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoanAccountInfoInstallChangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountInfoInstallFixedAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountInfoInstallRoundAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountInfoLastRemindLetterDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountInfoLastRemindLetterType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountInfoLoanAccPayroll" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountInfoLstIntChangeSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountInfoMaintainEqInst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountInfoMoratIntPayFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountInfoMoratoriumIntDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountInfoMoratoriumIntFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountInfoNo30daysLetterFlg" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountInfoNrmAccrualAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountInfoNrmAccrualLstDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountInfoNrmRlUrlFlg" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountInfoOvAccrualAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountInfoOvAccrualLstDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountInfoOvRlUrlFlg" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountInfoPayrollAccNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountInfoPayrollAgrCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoanAccountInfoPayrollConnFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountInfoPayrollDiasCode" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutLoanAccountInfoPayrollIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountInfoPayrollLastDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountInfoPayrollLstInstal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountInfoPayrollUpdateFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountInfoPositiveAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountInfoProvisionChgFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountInfoProvisionCurrPerc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoanAccountInfoProvisionJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoanAccountInfoProvisionMaxPerc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoanAccountInfoRateApprovalNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountInfoRepaymentSchFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountInfoSelectedBankRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountInfoSelectedNormalRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountInfoSpreadStDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountInfoTolDays1" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountInfoTolDays2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountInfoTolDays3" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountInfoTolDays5" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountInfoTransactInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountInfoTransactSm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoanAccountInfoUnclearAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoanIntSpreadCrInterRateSpr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanIntSpreadDbInterRateSpr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanParametersRlUrlDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoansSts1GlgAccountAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoansSts2GlgAccountAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoansSts3GlgAccountAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoansSts4GlgAccountAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMainBeneficaryCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMainBeneficaryCustomerCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMainBeneficiaryListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMediatorProfGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMediatorProfGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMediatorProfGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMediatorProfGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMovedCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMovedCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPackageIdPackage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutPackagePackageDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPackageProdInfoProductIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPayrollDtLoanInstallChgChangeDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutPayrollGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPayrollGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutPenaltyLnsInterestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPenaltyLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutPenaltyPercInterestSupplyWorkCurFxIntScalDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutPenaltyPercInterestSupplyWorkFixedInterestPrc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutPenaltyPercIntScalePercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutPenaltyPercIntScaleValidityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutPreviousFixedLnsInterestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPreviousFixedLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProductProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductValidityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutPurposeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPurposeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSalePointGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSalePointGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSellerGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSellerGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSubsidyOrderDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSubsidyOrderExpiryDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSubsidyOrderIdSubsidy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSubsidyOrderLnsEffectiveDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSubsidyOrderLnsExpiryDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSubsidyOrderSubsDurationPrd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTotalSubsidyIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotAvailableLimitIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotUtilizedLimitIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTransitionFlgIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTransLoanAccountAccOpenDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTransLoanAccountCurFxIntExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTransLoanAccountDrawdownFstAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTransLoanAccountDrawdownFstDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTransLoanAccountInstallNextDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTransLoanAccountInstallPrevDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTransLoanAccountLstAprIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTransLoanAccountLstAprYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTransLoanAccountLstAugIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTransLoanAccountLstAugYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTransLoanAccountLstDecIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTransLoanAccountLstDecYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTransLoanAccountLstFebIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTransLoanAccountLstFebYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTransLoanAccountLstJanIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTransLoanAccountLstJanYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTransLoanAccountLstJulIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTransLoanAccountLstJulYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTransLoanAccountLstJunIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTransLoanAccountLstJunYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTransLoanAccountLstMarIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTransLoanAccountLstMarYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTransLoanAccountLstMayIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTransLoanAccountLstMayYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTransLoanAccountLstNovIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTransLoanAccountLstNovYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTransLoanAccountLstOctIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTransLoanAccountLstOctYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTransLoanAccountLstSepIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTransLoanAccountLstSepYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTransLoanAccountMoratorN128Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTransLoanAccountMoratorNrmRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTransLoanAccountMoratorSprRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTransLoanAccountMpStartCapAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTransLoanAccountOldAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTransLoanAccountOldAccountNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTransLoanAccountReqInstallSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTransLoanAccountTotCapAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTransLoanAccountTotComInCcAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTransLoanAccountTotCommissionAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTransLoanAccountTotConfirmAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTransLoanAccountTotDrawdownAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTransLoanAccountTotExpenseAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTransLoanAccountTotExpInCcAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTransLoanAccountTotNrmIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTransLoanAccountTotPnlIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTransLoanAccountTotPubCommAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTransLoanAccountTotSubsIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTransLoanAccountTotThrdprtAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutUnionCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutUnionCustomerListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutWithoutTunelInterestCalculationWorkTempInterestRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutWithTunelInterestCalculationWorkTempInterestRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutIpfFlagIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCollection" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpCollection" minOccurs="0"/>
 *         &lt;element name="OutGrpLnsAddInfo" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpLnsAddInfo" minOccurs="0"/>
 *         &lt;element name="OutGrpLoanAddInfo" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpLoanAddInfo" minOccurs="0"/>
 *         &lt;element name="OutGrpLoanSubsidyInfo" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpLoanSubsidyInfo" minOccurs="0"/>
 *         &lt;element name="OutGrpLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpLog" minOccurs="0"/>
 *         &lt;element name="OutGrpPayroll" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpPayroll" minOccurs="0"/>
 *         &lt;element name="OutGrpPrevLnsAccs" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpPrevLnsAccs" minOccurs="0"/>
 *         &lt;element name="OutGrpReply" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpReply" minOccurs="0"/>
 *         &lt;element name="OutGrpSendCollection" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpSendCollection" minOccurs="0"/>
 *         &lt;element name="OutGrpMediators" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfL0401VOutGrpMediatorsItem" minOccurs="0"/>
 *         &lt;element name="OutN128LnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutN128LnsInterestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanAccountMaintenanceExport", propOrder = {
    "out2LoanAccountSubsidyDuration",
    "out2LoanAccountSubsidyExpDt",
    "out2LoanAccountSubsidyLimitAmn",
    "out2LoanAccountSubsidyStartDt",
    "out2MoveCurrencyIdCurrency",
    "out2MoveCurrencyShortDescr",
    "out2SubsidyOrderDescription",
    "out2SubsidyOrderExpiryDt",
    "out2SubsidyOrderIdSubsidy",
    "out2SubsidyOrderLnsEffectiveDt",
    "out2SubsidyOrderLnsExpiryDt",
    "out2SubsidyOrderSubsDurationPrd",
    "outAccNoLoanAccCollectAccNo",
    "outAccountTotalAmountIefSuppliedAmount",
    "outAdjustGenericDetailDescription",
    "outAdjustGenericDetailSerialNum",
    "outAgreementAgrMembershipSn",
    "outAgreementAgrSn",
    "outAgreementAgrYear",
    "outAgreementUnitCode",
    "outAgreementWorkAgrAvailLmtAmn",
    "outAgrProfitsAccountAccountCd",
    "outAgrProfitsAccountAccountNumber",
    "outAsoCustomerListSetDescription",
    "outBankParametersAddress",
    "outBankParametersBankCode",
    "outBankParametersBankName",
    "outBankParametersCurrTrxDate",
    "outBankSectorGenericDetailDescription",
    "outBankSectorGenericDetailSerialNum",
    "outBenefIefSuppliedFlag",
    "outCategoryGenericDetailDescription",
    "outCategoryGenericDetailSerialNum",
    "outCbpurpGenericDetailDescription",
    "outCbpurpGenericDetailSerialNum",
    "outChargingCurrencyIdCurrency",
    "outChargingCurrencyShortDescr",
    "outClassCodeGenericDetailDescription",
    "outClassCodeGenericDetailSerialNum",
    "outClientProfitsExitStateWorkActualMessage",
    "outClientProfitsExitStateWorkId",
    "outClientProfitsExitStateWorkLanguage",
    "outClientProfitsExitStateWorkMessageType",
    "outClientProfitsExitStateWorkPrftSystem",
    "outClientProfitsExitStateWorkRoutineSn",
    "outClientProfitsExitStateWorkTerminationAction",
    "outClientProfitsExitStateWorkValruleId",
    "outClientProfitsExitStateWorkValruleSnum",
    "outCloanGenericDetailDescription",
    "outCloanGenericDetailSerialNum",
    "outCollectionGenericDetailDescription",
    "outCooperativeCustomerCustId",
    "outCreatedProfitsAccountAccountCd",
    "outCreatedProfitsAccountAccountNumber",
    "outCreditLineGenericDetailParameterType",
    "outCreditLineGenericDetailSerialNum",
    "outCurrentSpreadInterestSupplyWorkFixedInterestPrc",
    "outCurrentSpreadIntScalePercentage",
    "outCurrentSpreadIntScaleValidityDate",
    "outDepProfitsAccountAccountCd",
    "outDepProfitsAccountAccountNumber",
    "outDepProfitsAccountMovementCurrency",
    "outDialogSalePersonGenericDetailDescription",
    "outDialogSalePersonGenericDetailShortDescription",
    "outDialogSaleUnitGenericDetailDescription",
    "outDialogSaleUnitGenericDetailSerialNum",
    "outEvalResultTeamInformationAuthorizationType",
    "outEvalResultTeamInformationEvaluationResult",
    "outEvalResultTeamInformationRequiredProfile1",
    "outEvalResultTeamInformationRequiredProfile2",
    "outFinancialSectorGenericDetailDescription",
    "outFinancialSectorGenericDetailSerialNum",
    "outFixedLnsInterestDescription",
    "outFixedLnsInterestDurationUnit",
    "outFixedLnsInterestFixIntDtChgFlg",
    "outFixedLnsInterestFixIntExpDt",
    "outFixedLnsInterestIdInterest",
    "outFixedLnsInterestIntDuration",
    "outFixedN128InterestSupplyWorkFixedInterestPrc",
    "outFixedN128IntScalePercentage",
    "outFixedN128IntScaleValidityDate",
    "outFixedRateInterestSupplyWorkFixedInterestPrc",
    "outFixedRateIntScalePercentage",
    "outFixedRateIntScaleValidityDate",
    "outFixedTexInterestSupplyWorkFixedInterestPrc",
    "outFixedTexIntScalePercentage",
    "outFixedTexIntScaleValidityDate",
    "outFlexFixInstallAmnLoanInstallmentInfoInstallmentAmn",
    "outFloatLnsInterestDescription",
    "outFloatLnsInterestIdInterest",
    "outFloatN128InterestSupplyWorkFixedInterestPrc",
    "outFloatN128IntScalePercentage",
    "outFloatN128IntScaleValidityDate",
    "outFloatRateInterestSupplyWorkFixedInterestPrc",
    "outFloatRateIntScalePercentage",
    "outFloatRateIntScaleValidityDate",
    "outFloatTexInterestSupplyWorkFixedInterestPrc",
    "outFloatTexIntScalePercentage",
    "outFloatTexIntScaleValidityDate",
    "outForDisplayLoanAccountMoratorN128Rate",
    "outForDisplayLoanAccountMoratorNrmRate",
    "outForDisplayLoanAccountMoratorSprRate",
    "outGlDefClassGlCrIntAccrGlAcc",
    "outGlDefClassGlCrIntGlAcc",
    "outGlNrmClassGlCrIntAccrGlAcc",
    "outGlNrmClassGlCrIntGlAcc",
    "outGlOffClassGlCrIntAccrGlAcc",
    "outGlOffClassGlCrIntGlAcc",
    "outGlOveClassGlCrIntAccrGlAcc",
    "outGlOveClassGlCrIntGlAcc",
    "outGrpCollectionLength",
    "outGrpLnsAddInfoLength",
    "outGrpLoanAddInfoLength",
    "outGrpLoanSubsidyInfoLength",
    "outGrpLogLength",
    "outGrpPayrollLength",
    "outGrpPrevLnsAccsLength",
    "outGrpReplyLength",
    "outGrpSendCollectionLength",
    "outGuaranteeOrderDescription",
    "outGuaranteeOrderIdGuarantee",
    "outLimitCurrencyDisplayedDecimalPlaces",
    "outLimitCurrencyIdCurrency",
    "outLimitCurrencyShortDescr",
    "outLnsMediatorAgreementNo",
    "outLnsMediatorName",
    "outLoanAsoInd",
    "outLoanAutFixIntRenew",
    "outLoanCollRequestLimit",
    "outLoanCurFxIntInd",
    "outLoanDepositAccFlg",
    "outLoanDurationUnit",
    "outLoanGeneralFlags",
    "outLoanGracePrdUnit",
    "outLoanInstallMechFlg",
    "outLoanInstallUnit",
    "outLoanInstantCreditFlg",
    "outLoanIntCapitalFlg",
    "outLoanInterestUnit",
    "outLoanIntPayableFlg",
    "outLoanLoanType",
    "outLoanLumpDrawdown",
    "outLoanMaxGracePrdFrq",
    "outLoanMaxInstallCnt",
    "outLoanMaxInstallFrq",
    "outLoanMaxInterestFrq",
    "outLoanMaxLoanDurat",
    "outLoanMaxRecycleDurat",
    "outLoanMinGracePrdFrq",
    "outLoanMinInstallCnt",
    "outLoanMinInstallFrq",
    "outLoanMinInterestFrq",
    "outLoanMinLoanDurat",
    "outLoanMinRecycleDurat",
    "outLoanMoratIntPayFlg",
    "outLoanNoIntMoratorFlg",
    "outLoanNonIntCapitFlg",
    "outLoanPeriodicIntFlg",
    "outLoanRecycleUnit",
    "outLoanRecyclingLmtFlg",
    "outLoanRenewalInterFlg",
    "outLoanSelectIntFlg",
    "outLoanAccDtsPrevAccExpDt",
    "outLoanAccDtsPrevAccOpenDt",
    "outLoanAccDtsPrevCurFxIntExpDt",
    "outLoanAccDtsPrevCurFxIntStDt",
    "outLoanAccDtsPrevDrawdownExpDt",
    "outLoanAccDtsPrevInstallFirstDt",
    "outLoanAccDtsPrevInstallNextDt",
    "outLoanAccDtsPrevInstallPrevDt",
    "outLoanAccDtsPrevMoratoriumIntDt",
    "outLoanAccDtsPrevSpreadEndDt",
    "outLoanAccDtsPrevSpreadStDt",
    "outLoanAccDtsPrevSubsidyExpDt",
    "outLoanAccDtsPrevSubsidyStartDt",
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
    "outLoanAccountCurFxIntScalDt",
    "outLoanAccountCurFxIntStDt",
    "outLoanAccountCusStmLstTrnDt",
    "outLoanAccountCusStmNxtTrnDt",
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
    "outLoanAccountNrUrlPubIntAmn",
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
    "outLoanAccountReqExpSn",
    "outLoanAccountReqInstallSn",
    "outLoanAccountReqIntSn",
    "outLoanAccountReqLoanSn",
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
    "outLoanAccountTotExpenseAmn",
    "outLoanAccountTotExpInCcAmn",
    "outLoanAccountTotIntSprdAmn",
    "outLoanAccountTotNrmIntAmn",
    "outLoanAccountTotPnlIntAmn",
    "outLoanAccountTotPubCommAmn",
    "outLoanAccountTotSubsIntAmn",
    "outLoanAccountTotThrdprtAmn",
    "outLoanAccountUnit",
    "outLoanAccountUnrealizedFlg",
    "outLoanAccountUsr",
    "outLoanAccountDrvWorkAccountBal",
    "outLoanAccountDrvWorkLstYrIntDbAmn",
    "outLoanAccountDrvWorkNrmAccountBal",
    "outLoanAccountDrvWorkOvAccBookBal",
    "outLoanAccountDrvWorkOvAccountBal",
    "outLoanAccountDrvWorkTotPaymentAmn",
    "outLoanAccountInfoAccDrawdownSts",
    "outLoanAccountInfoAccTransitionFlg",
    "outLoanAccountInfoAdjustmentDt",
    "outLoanAccountInfoAgentBank",
    "outLoanAccountInfoAutFixIntRenew",
    "outLoanAccountInfoBlockedAmn",
    "outLoanAccountInfoCollectionAgency",
    "outLoanAccountInfoCollectionFlg",
    "outLoanAccountInfoCollectionLstDt",
    "outLoanAccountInfoCollectionTries",
    "outLoanAccountInfoCreditIntId",
    "outLoanAccountInfoCrIntSprd",
    "outLoanAccountInfoCrSprdEndDt",
    "outLoanAccountInfoCrSprdStDt",
    "outLoanAccountInfoDealDate",
    "outLoanAccountInfoDealerCode",
    "outLoanAccountInfoDiffIntAlgorithm",
    "outLoanAccountInfoDormantAmn",
    "outLoanAccountInfoFluctuationRange",
    "outLoanAccountInfoGuarActNum",
    "outLoanAccountInfoGuarComPerc",
    "outLoanAccountInfoGuarExpDt",
    "outLoanAccountInfoInitialInterest",
    "outLoanAccountInfoInstallCalcPeriod",
    "outLoanAccountInfoInstallChangeDate",
    "outLoanAccountInfoInstallFixedAmn",
    "outLoanAccountInfoInstallRoundAmn",
    "outLoanAccountInfoLastRemindLetterDate",
    "outLoanAccountInfoLastRemindLetterType",
    "outLoanAccountInfoLoanAccPayroll",
    "outLoanAccountInfoLstIntChangeSn",
    "outLoanAccountInfoMaintainEqInst",
    "outLoanAccountInfoMoratIntPayFlg",
    "outLoanAccountInfoMoratoriumIntDt",
    "outLoanAccountInfoMoratoriumIntFrq",
    "outLoanAccountInfoNo30DaysLetterFlg",
    "outLoanAccountInfoNrmAccrualAmn",
    "outLoanAccountInfoNrmAccrualLstDt",
    "outLoanAccountInfoNrmRlUrlFlg",
    "outLoanAccountInfoOvAccrualAmn",
    "outLoanAccountInfoOvAccrualLstDt",
    "outLoanAccountInfoOvRlUrlFlg",
    "outLoanAccountInfoPayrollAccNum",
    "outLoanAccountInfoPayrollAgrCode",
    "outLoanAccountInfoPayrollConnFlg",
    "outLoanAccountInfoPayrollDiasCode",
    "outLoanAccountInfoPayrollIdNo",
    "outLoanAccountInfoPayrollLastDt",
    "outLoanAccountInfoPayrollLstInstal",
    "outLoanAccountInfoPayrollUpdateFlg",
    "outLoanAccountInfoPositiveAmn",
    "outLoanAccountInfoProvisionChgFlg",
    "outLoanAccountInfoProvisionCurrPerc",
    "outLoanAccountInfoProvisionJustific",
    "outLoanAccountInfoProvisionMaxPerc",
    "outLoanAccountInfoRateApprovalNum",
    "outLoanAccountInfoRepaymentSchFlg",
    "outLoanAccountInfoSelectedBankRate",
    "outLoanAccountInfoSelectedNormalRate",
    "outLoanAccountInfoSpreadStDt",
    "outLoanAccountInfoTolDays1",
    "outLoanAccountInfoTolDays2",
    "outLoanAccountInfoTolDays3",
    "outLoanAccountInfoTolDays5",
    "outLoanAccountInfoTransactInd",
    "outLoanAccountInfoTransactSm",
    "outLoanAccountInfoUnclearAmn",
    "outLoanAccUnitCode",
    "outLoanIntSpreadCrInterRateSpr",
    "outLoanIntSpreadDbInterRateSpr",
    "outLoanParametersRlUrlDuration",
    "outLoansSts1GlgAccountAccountId",
    "outLoansSts2GlgAccountAccountId",
    "outLoansSts3GlgAccountAccountId",
    "outLoansSts4GlgAccountAccountId",
    "outMainBeneficaryCustomerCustId",
    "outMainBeneficaryCustomerCustType",
    "outMainBeneficiaryListSetDescription",
    "outMediatorProfGenericDetailDescription",
    "outMediatorProfGenericDetailParameterType",
    "outMediatorProfGenericDetailSerialNum",
    "outMediatorProfGenericDetailShortDescription",
    "outMovedCurrencyIdCurrency",
    "outMovedCurrencyShortDescr",
    "outPackageIdPackage",
    "outPackagePackageDescr",
    "outPackageProdInfoProductIndicator",
    "outPayrollDtLoanInstallChgChangeDt",
    "outPayrollGenericDetailDescription",
    "outPayrollGenericDetailSerialNum",
    "outPenaltyLnsInterestDescription",
    "outPenaltyLnsInterestIdInterest",
    "outPenaltyPercInterestSupplyWorkCurFxIntScalDt",
    "outPenaltyPercInterestSupplyWorkFixedInterestPrc",
    "outPenaltyPercIntScalePercentage",
    "outPenaltyPercIntScaleValidityDate",
    "outPreviousFixedLnsInterestDescription",
    "outPreviousFixedLnsInterestIdInterest",
    "outProductDescription",
    "outProductIdProduct",
    "outProductProductType",
    "outProductValidityDate",
    "outPurposeGenericDetailDescription",
    "outPurposeGenericDetailSerialNum",
    "outSalePointGenericDetailDescription",
    "outSalePointGenericDetailSerialNum",
    "outSellerGenericDetailDescription",
    "outSellerGenericDetailSerialNum",
    "outSubsidyOrderDescription",
    "outSubsidyOrderExpiryDt",
    "outSubsidyOrderIdSubsidy",
    "outSubsidyOrderLnsEffectiveDt",
    "outSubsidyOrderLnsExpiryDt",
    "outSubsidyOrderSubsDurationPrd",
    "outTotalSubsidyIefSuppliedAmount",
    "outTotAvailableLimitIefSuppliedAmount",
    "outTotUtilizedLimitIefSuppliedAmount",
    "outTransitionFlgIefSuppliedFlag",
    "outTransLoanAccountAccOpenDt",
    "outTransLoanAccountCurFxIntExpDt",
    "outTransLoanAccountDrawdownFstAmn",
    "outTransLoanAccountDrawdownFstDt",
    "outTransLoanAccountInstallNextDt",
    "outTransLoanAccountInstallPrevDt",
    "outTransLoanAccountLstAprIntDbAmn",
    "outTransLoanAccountLstAprYear",
    "outTransLoanAccountLstAugIntDbAmn",
    "outTransLoanAccountLstAugYear",
    "outTransLoanAccountLstDecIntDbAmn",
    "outTransLoanAccountLstDecYear",
    "outTransLoanAccountLstFebIntDbAmn",
    "outTransLoanAccountLstFebYear",
    "outTransLoanAccountLstJanIntDbAmn",
    "outTransLoanAccountLstJanYear",
    "outTransLoanAccountLstJulIntDbAmn",
    "outTransLoanAccountLstJulYear",
    "outTransLoanAccountLstJunIntDbAmn",
    "outTransLoanAccountLstJunYear",
    "outTransLoanAccountLstMarIntDbAmn",
    "outTransLoanAccountLstMarYear",
    "outTransLoanAccountLstMayIntDbAmn",
    "outTransLoanAccountLstMayYear",
    "outTransLoanAccountLstNovIntDbAmn",
    "outTransLoanAccountLstNovYear",
    "outTransLoanAccountLstOctIntDbAmn",
    "outTransLoanAccountLstOctYear",
    "outTransLoanAccountLstSepIntDbAmn",
    "outTransLoanAccountLstSepYear",
    "outTransLoanAccountMoratorN128Rate",
    "outTransLoanAccountMoratorNrmRate",
    "outTransLoanAccountMoratorSprRate",
    "outTransLoanAccountMpStartCapAmn",
    "outTransLoanAccountOldAccountCd",
    "outTransLoanAccountOldAccountNum",
    "outTransLoanAccountReqInstallSn",
    "outTransLoanAccountTotCapAmn",
    "outTransLoanAccountTotComInCcAmn",
    "outTransLoanAccountTotCommissionAmn",
    "outTransLoanAccountTotConfirmAmn",
    "outTransLoanAccountTotDrawdownAmn",
    "outTransLoanAccountTotExpenseAmn",
    "outTransLoanAccountTotExpInCcAmn",
    "outTransLoanAccountTotNrmIntAmn",
    "outTransLoanAccountTotPnlIntAmn",
    "outTransLoanAccountTotPubCommAmn",
    "outTransLoanAccountTotSubsIntAmn",
    "outTransLoanAccountTotThrdprtAmn",
    "outUnionCustomerCustId",
    "outUnionCustomerListSetDescription",
    "outWithoutTunelInterestCalculationWorkTempInterestRate",
    "outWithTunelInterestCalculationWorkTempInterestRate",
    "outIpfFlagIefSuppliedFlag",
    "outGrpCollection",
    "outGrpLnsAddInfo",
    "outGrpLoanAddInfo",
    "outGrpLoanSubsidyInfo",
    "outGrpLog",
    "outGrpPayroll",
    "outGrpPrevLnsAccs",
    "outGrpReply",
    "outGrpSendCollection",
    "outGrpMediators",
    "outN128LnsInterestIdInterest",
    "outN128LnsInterestDescription"
})
public class LoanAccountMaintenanceExport
    extends BaseExport
{

    @XmlElement(name = "Out2LoanAccountSubsidyDuration")
    protected short out2LoanAccountSubsidyDuration;
    @XmlElement(name = "Out2LoanAccountSubsidyExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar out2LoanAccountSubsidyExpDt;
    @XmlElement(name = "Out2LoanAccountSubsidyLimitAmn", required = true)
    protected BigDecimal out2LoanAccountSubsidyLimitAmn;
    @XmlElement(name = "Out2LoanAccountSubsidyStartDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar out2LoanAccountSubsidyStartDt;
    @XmlElement(name = "Out2MoveCurrencyIdCurrency")
    protected int out2MoveCurrencyIdCurrency;
    @XmlElement(name = "Out2MoveCurrencyShortDescr")
    protected String out2MoveCurrencyShortDescr;
    @XmlElement(name = "Out2SubsidyOrderDescription")
    protected String out2SubsidyOrderDescription;
    @XmlElement(name = "Out2SubsidyOrderExpiryDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar out2SubsidyOrderExpiryDt;
    @XmlElement(name = "Out2SubsidyOrderIdSubsidy")
    protected int out2SubsidyOrderIdSubsidy;
    @XmlElement(name = "Out2SubsidyOrderLnsEffectiveDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar out2SubsidyOrderLnsEffectiveDt;
    @XmlElement(name = "Out2SubsidyOrderLnsExpiryDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar out2SubsidyOrderLnsExpiryDt;
    @XmlElement(name = "Out2SubsidyOrderSubsDurationPrd")
    protected short out2SubsidyOrderSubsDurationPrd;
    @XmlElement(name = "OutAccNoLoanAccCollectAccNo")
    protected String outAccNoLoanAccCollectAccNo;
    @XmlElement(name = "OutAccountTotalAmountIefSuppliedAmount", required = true)
    protected BigDecimal outAccountTotalAmountIefSuppliedAmount;
    @XmlElement(name = "OutAdjustGenericDetailDescription")
    protected String outAdjustGenericDetailDescription;
    @XmlElement(name = "OutAdjustGenericDetailSerialNum")
    protected int outAdjustGenericDetailSerialNum;
    @XmlElement(name = "OutAgreementAgrMembershipSn")
    protected int outAgreementAgrMembershipSn;
    @XmlElement(name = "OutAgreementAgrSn")
    protected int outAgreementAgrSn;
    @XmlElement(name = "OutAgreementAgrYear")
    protected short outAgreementAgrYear;
    @XmlElement(name = "OutAgreementUnitCode")
    protected int outAgreementUnitCode;
    @XmlElement(name = "OutAgreementWorkAgrAvailLmtAmn", required = true)
    protected BigDecimal outAgreementWorkAgrAvailLmtAmn;
    @XmlElement(name = "OutAgrProfitsAccountAccountCd")
    protected short outAgrProfitsAccountAccountCd;
    @XmlElement(name = "OutAgrProfitsAccountAccountNumber")
    protected String outAgrProfitsAccountAccountNumber;
    @XmlElement(name = "OutAsoCustomerListSetDescription")
    protected String outAsoCustomerListSetDescription;
    @XmlElement(name = "OutBankParametersAddress")
    protected String outBankParametersAddress;
    @XmlElement(name = "OutBankParametersBankCode")
    protected short outBankParametersBankCode;
    @XmlElement(name = "OutBankParametersBankName")
    protected String outBankParametersBankName;
    @XmlElement(name = "OutBankParametersCurrTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBankParametersCurrTrxDate;
    @XmlElement(name = "OutBankSectorGenericDetailDescription")
    protected String outBankSectorGenericDetailDescription;
    @XmlElement(name = "OutBankSectorGenericDetailSerialNum")
    protected int outBankSectorGenericDetailSerialNum;
    @XmlElement(name = "OutBenefIefSuppliedFlag")
    protected String outBenefIefSuppliedFlag;
    @XmlElement(name = "OutCategoryGenericDetailDescription")
    protected String outCategoryGenericDetailDescription;
    @XmlElement(name = "OutCategoryGenericDetailSerialNum")
    protected int outCategoryGenericDetailSerialNum;
    @XmlElement(name = "OutCbpurpGenericDetailDescription")
    protected String outCbpurpGenericDetailDescription;
    @XmlElement(name = "OutCbpurpGenericDetailSerialNum")
    protected int outCbpurpGenericDetailSerialNum;
    @XmlElement(name = "OutChargingCurrencyIdCurrency")
    protected int outChargingCurrencyIdCurrency;
    @XmlElement(name = "OutChargingCurrencyShortDescr")
    protected String outChargingCurrencyShortDescr;
    @XmlElement(name = "OutClassCodeGenericDetailDescription")
    protected String outClassCodeGenericDetailDescription;
    @XmlElement(name = "OutClassCodeGenericDetailSerialNum")
    protected int outClassCodeGenericDetailSerialNum;
    @XmlElement(name = "OutClientProfitsExitStateWorkActualMessage")
    protected String outClientProfitsExitStateWorkActualMessage;
    @XmlElement(name = "OutClientProfitsExitStateWorkId")
    protected double outClientProfitsExitStateWorkId;
    @XmlElement(name = "OutClientProfitsExitStateWorkLanguage")
    protected int outClientProfitsExitStateWorkLanguage;
    @XmlElement(name = "OutClientProfitsExitStateWorkMessageType")
    protected String outClientProfitsExitStateWorkMessageType;
    @XmlElement(name = "OutClientProfitsExitStateWorkPrftSystem")
    protected short outClientProfitsExitStateWorkPrftSystem;
    @XmlElement(name = "OutClientProfitsExitStateWorkRoutineSn")
    protected double outClientProfitsExitStateWorkRoutineSn;
    @XmlElement(name = "OutClientProfitsExitStateWorkTerminationAction")
    protected String outClientProfitsExitStateWorkTerminationAction;
    @XmlElement(name = "OutClientProfitsExitStateWorkValruleId")
    protected double outClientProfitsExitStateWorkValruleId;
    @XmlElement(name = "OutClientProfitsExitStateWorkValruleSnum")
    protected int outClientProfitsExitStateWorkValruleSnum;
    @XmlElement(name = "OutCloanGenericDetailDescription")
    protected String outCloanGenericDetailDescription;
    @XmlElement(name = "OutCloanGenericDetailSerialNum")
    protected int outCloanGenericDetailSerialNum;
    @XmlElement(name = "OutCollectionGenericDetailDescription")
    protected String outCollectionGenericDetailDescription;
    @XmlElement(name = "OutCooperativeCustomerCustId")
    protected int outCooperativeCustomerCustId;
    @XmlElement(name = "OutCreatedProfitsAccountAccountCd")
    protected short outCreatedProfitsAccountAccountCd;
    @XmlElement(name = "OutCreatedProfitsAccountAccountNumber")
    protected String outCreatedProfitsAccountAccountNumber;
    @XmlElement(name = "OutCreditLineGenericDetailParameterType")
    protected String outCreditLineGenericDetailParameterType;
    @XmlElement(name = "OutCreditLineGenericDetailSerialNum")
    protected int outCreditLineGenericDetailSerialNum;
    @XmlElement(name = "OutCurrentSpreadInterestSupplyWorkFixedInterestPrc", required = true)
    protected BigDecimal outCurrentSpreadInterestSupplyWorkFixedInterestPrc;
    @XmlElement(name = "OutCurrentSpreadIntScalePercentage", required = true)
    protected BigDecimal outCurrentSpreadIntScalePercentage;
    @XmlElement(name = "OutCurrentSpreadIntScaleValidityDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCurrentSpreadIntScaleValidityDate;
    @XmlElement(name = "OutDepProfitsAccountAccountCd")
    protected short outDepProfitsAccountAccountCd;
    @XmlElement(name = "OutDepProfitsAccountAccountNumber")
    protected String outDepProfitsAccountAccountNumber;
    @XmlElement(name = "OutDepProfitsAccountMovementCurrency")
    protected int outDepProfitsAccountMovementCurrency;
    @XmlElement(name = "OutDialogSalePersonGenericDetailDescription")
    protected String outDialogSalePersonGenericDetailDescription;
    @XmlElement(name = "OutDialogSalePersonGenericDetailShortDescription")
    protected String outDialogSalePersonGenericDetailShortDescription;
    @XmlElement(name = "OutDialogSaleUnitGenericDetailDescription")
    protected String outDialogSaleUnitGenericDetailDescription;
    @XmlElement(name = "OutDialogSaleUnitGenericDetailSerialNum")
    protected int outDialogSaleUnitGenericDetailSerialNum;
    @XmlElement(name = "OutEvalResultTeamInformationAuthorizationType")
    protected String outEvalResultTeamInformationAuthorizationType;
    @XmlElement(name = "OutEvalResultTeamInformationEvaluationResult")
    protected String outEvalResultTeamInformationEvaluationResult;
    @XmlElement(name = "OutEvalResultTeamInformationRequiredProfile1")
    protected String outEvalResultTeamInformationRequiredProfile1;
    @XmlElement(name = "OutEvalResultTeamInformationRequiredProfile2")
    protected String outEvalResultTeamInformationRequiredProfile2;
    @XmlElement(name = "OutFinancialSectorGenericDetailDescription")
    protected String outFinancialSectorGenericDetailDescription;
    @XmlElement(name = "OutFinancialSectorGenericDetailSerialNum")
    protected int outFinancialSectorGenericDetailSerialNum;
    @XmlElement(name = "OutFixedLnsInterestDescription")
    protected String outFixedLnsInterestDescription;
    @XmlElement(name = "OutFixedLnsInterestDurationUnit")
    protected String outFixedLnsInterestDurationUnit;
    @XmlElement(name = "OutFixedLnsInterestFixIntDtChgFlg")
    protected String outFixedLnsInterestFixIntDtChgFlg;
    @XmlElement(name = "OutFixedLnsInterestFixIntExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outFixedLnsInterestFixIntExpDt;
    @XmlElement(name = "OutFixedLnsInterestIdInterest")
    protected int outFixedLnsInterestIdInterest;
    @XmlElement(name = "OutFixedLnsInterestIntDuration")
    protected short outFixedLnsInterestIntDuration;
    @XmlElement(name = "OutFixedN128InterestSupplyWorkFixedInterestPrc", required = true)
    protected BigDecimal outFixedN128InterestSupplyWorkFixedInterestPrc;
    @XmlElement(name = "OutFixedN128IntScalePercentage", required = true)
    protected BigDecimal outFixedN128IntScalePercentage;
    @XmlElement(name = "OutFixedN128IntScaleValidityDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outFixedN128IntScaleValidityDate;
    @XmlElement(name = "OutFixedRateInterestSupplyWorkFixedInterestPrc", required = true)
    protected BigDecimal outFixedRateInterestSupplyWorkFixedInterestPrc;
    @XmlElement(name = "OutFixedRateIntScalePercentage", required = true)
    protected BigDecimal outFixedRateIntScalePercentage;
    @XmlElement(name = "OutFixedRateIntScaleValidityDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outFixedRateIntScaleValidityDate;
    @XmlElement(name = "OutFixedTexInterestSupplyWorkFixedInterestPrc", required = true)
    protected BigDecimal outFixedTexInterestSupplyWorkFixedInterestPrc;
    @XmlElement(name = "OutFixedTexIntScalePercentage", required = true)
    protected BigDecimal outFixedTexIntScalePercentage;
    @XmlElement(name = "OutFixedTexIntScaleValidityDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outFixedTexIntScaleValidityDate;
    @XmlElement(name = "OutFlexFixInstallAmnLoanInstallmentInfoInstallmentAmn", required = true)
    protected BigDecimal outFlexFixInstallAmnLoanInstallmentInfoInstallmentAmn;
    @XmlElement(name = "OutFloatLnsInterestDescription")
    protected String outFloatLnsInterestDescription;
    @XmlElement(name = "OutFloatLnsInterestIdInterest")
    protected int outFloatLnsInterestIdInterest;
    @XmlElement(name = "OutFloatN128InterestSupplyWorkFixedInterestPrc", required = true)
    protected BigDecimal outFloatN128InterestSupplyWorkFixedInterestPrc;
    @XmlElement(name = "OutFloatN128IntScalePercentage", required = true)
    protected BigDecimal outFloatN128IntScalePercentage;
    @XmlElement(name = "OutFloatN128IntScaleValidityDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outFloatN128IntScaleValidityDate;
    @XmlElement(name = "OutFloatRateInterestSupplyWorkFixedInterestPrc", required = true)
    protected BigDecimal outFloatRateInterestSupplyWorkFixedInterestPrc;
    @XmlElement(name = "OutFloatRateIntScalePercentage", required = true)
    protected BigDecimal outFloatRateIntScalePercentage;
    @XmlElement(name = "OutFloatRateIntScaleValidityDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outFloatRateIntScaleValidityDate;
    @XmlElement(name = "OutFloatTexInterestSupplyWorkFixedInterestPrc", required = true)
    protected BigDecimal outFloatTexInterestSupplyWorkFixedInterestPrc;
    @XmlElement(name = "OutFloatTexIntScalePercentage", required = true)
    protected BigDecimal outFloatTexIntScalePercentage;
    @XmlElement(name = "OutFloatTexIntScaleValidityDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outFloatTexIntScaleValidityDate;
    @XmlElement(name = "OutForDisplayLoanAccountMoratorN128Rate", required = true)
    protected BigDecimal outForDisplayLoanAccountMoratorN128Rate;
    @XmlElement(name = "OutForDisplayLoanAccountMoratorNrmRate", required = true)
    protected BigDecimal outForDisplayLoanAccountMoratorNrmRate;
    @XmlElement(name = "OutForDisplayLoanAccountMoratorSprRate", required = true)
    protected BigDecimal outForDisplayLoanAccountMoratorSprRate;
    @XmlElement(name = "OutGlDefClassGlCrIntAccrGlAcc")
    protected String outGlDefClassGlCrIntAccrGlAcc;
    @XmlElement(name = "OutGlDefClassGlCrIntGlAcc")
    protected String outGlDefClassGlCrIntGlAcc;
    @XmlElement(name = "OutGlNrmClassGlCrIntAccrGlAcc")
    protected String outGlNrmClassGlCrIntAccrGlAcc;
    @XmlElement(name = "OutGlNrmClassGlCrIntGlAcc")
    protected String outGlNrmClassGlCrIntGlAcc;
    @XmlElement(name = "OutGlOffClassGlCrIntAccrGlAcc")
    protected String outGlOffClassGlCrIntAccrGlAcc;
    @XmlElement(name = "OutGlOffClassGlCrIntGlAcc")
    protected String outGlOffClassGlCrIntGlAcc;
    @XmlElement(name = "OutGlOveClassGlCrIntAccrGlAcc")
    protected String outGlOveClassGlCrIntAccrGlAcc;
    @XmlElement(name = "OutGlOveClassGlCrIntGlAcc")
    protected String outGlOveClassGlCrIntGlAcc;
    @XmlElement(name = "OutGrpCollectionLength")
    protected int outGrpCollectionLength;
    @XmlElement(name = "OutGrpLnsAddInfoLength")
    protected int outGrpLnsAddInfoLength;
    @XmlElement(name = "OutGrpLoanAddInfoLength")
    protected int outGrpLoanAddInfoLength;
    @XmlElement(name = "OutGrpLoanSubsidyInfoLength")
    protected int outGrpLoanSubsidyInfoLength;
    @XmlElement(name = "OutGrpLogLength")
    protected int outGrpLogLength;
    @XmlElement(name = "OutGrpPayrollLength")
    protected int outGrpPayrollLength;
    @XmlElement(name = "OutGrpPrevLnsAccsLength")
    protected int outGrpPrevLnsAccsLength;
    @XmlElement(name = "OutGrpReplyLength")
    protected int outGrpReplyLength;
    @XmlElement(name = "OutGrpSendCollectionLength")
    protected int outGrpSendCollectionLength;
    @XmlElement(name = "OutGuaranteeOrderDescription")
    protected String outGuaranteeOrderDescription;
    @XmlElement(name = "OutGuaranteeOrderIdGuarantee")
    protected int outGuaranteeOrderIdGuarantee;
    @XmlElement(name = "OutLimitCurrencyDisplayedDecimalPlaces")
    protected short outLimitCurrencyDisplayedDecimalPlaces;
    @XmlElement(name = "OutLimitCurrencyIdCurrency")
    protected int outLimitCurrencyIdCurrency;
    @XmlElement(name = "OutLimitCurrencyShortDescr")
    protected String outLimitCurrencyShortDescr;
    @XmlElement(name = "OutLnsMediatorAgreementNo")
    protected int outLnsMediatorAgreementNo;
    @XmlElement(name = "OutLnsMediatorName")
    protected String outLnsMediatorName;
    @XmlElement(name = "OutLoanAsoInd")
    protected String outLoanAsoInd;
    @XmlElement(name = "OutLoanAutFixIntRenew")
    protected String outLoanAutFixIntRenew;
    @XmlElement(name = "OutLoanCollRequestLimit")
    protected short outLoanCollRequestLimit;
    @XmlElement(name = "OutLoanCurFxIntInd")
    protected String outLoanCurFxIntInd;
    @XmlElement(name = "OutLoanDepositAccFlg")
    protected String outLoanDepositAccFlg;
    @XmlElement(name = "OutLoanDurationUnit")
    protected String outLoanDurationUnit;
    @XmlElement(name = "OutLoanGeneralFlags")
    protected String outLoanGeneralFlags;
    @XmlElement(name = "OutLoanGracePrdUnit")
    protected String outLoanGracePrdUnit;
    @XmlElement(name = "OutLoanInstallMechFlg")
    protected String outLoanInstallMechFlg;
    @XmlElement(name = "OutLoanInstallUnit")
    protected String outLoanInstallUnit;
    @XmlElement(name = "OutLoanInstantCreditFlg")
    protected String outLoanInstantCreditFlg;
    @XmlElement(name = "OutLoanIntCapitalFlg")
    protected String outLoanIntCapitalFlg;
    @XmlElement(name = "OutLoanInterestUnit")
    protected String outLoanInterestUnit;
    @XmlElement(name = "OutLoanIntPayableFlg")
    protected String outLoanIntPayableFlg;
    @XmlElement(name = "OutLoanLoanType")
    protected String outLoanLoanType;
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
    @XmlElement(name = "OutLoanMinRecycleDurat")
    protected short outLoanMinRecycleDurat;
    @XmlElement(name = "OutLoanMoratIntPayFlg")
    protected String outLoanMoratIntPayFlg;
    @XmlElement(name = "OutLoanNoIntMoratorFlg")
    protected String outLoanNoIntMoratorFlg;
    @XmlElement(name = "OutLoanNonIntCapitFlg")
    protected String outLoanNonIntCapitFlg;
    @XmlElement(name = "OutLoanPeriodicIntFlg")
    protected String outLoanPeriodicIntFlg;
    @XmlElement(name = "OutLoanRecycleUnit")
    protected String outLoanRecycleUnit;
    @XmlElement(name = "OutLoanRecyclingLmtFlg")
    protected String outLoanRecyclingLmtFlg;
    @XmlElement(name = "OutLoanRenewalInterFlg")
    protected String outLoanRenewalInterFlg;
    @XmlElement(name = "OutLoanSelectIntFlg")
    protected String outLoanSelectIntFlg;
    @XmlElement(name = "OutLoanAccDtsPrevAccExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccDtsPrevAccExpDt;
    @XmlElement(name = "OutLoanAccDtsPrevAccOpenDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccDtsPrevAccOpenDt;
    @XmlElement(name = "OutLoanAccDtsPrevCurFxIntExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccDtsPrevCurFxIntExpDt;
    @XmlElement(name = "OutLoanAccDtsPrevCurFxIntStDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccDtsPrevCurFxIntStDt;
    @XmlElement(name = "OutLoanAccDtsPrevDrawdownExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccDtsPrevDrawdownExpDt;
    @XmlElement(name = "OutLoanAccDtsPrevInstallFirstDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccDtsPrevInstallFirstDt;
    @XmlElement(name = "OutLoanAccDtsPrevInstallNextDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccDtsPrevInstallNextDt;
    @XmlElement(name = "OutLoanAccDtsPrevInstallPrevDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccDtsPrevInstallPrevDt;
    @XmlElement(name = "OutLoanAccDtsPrevMoratoriumIntDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccDtsPrevMoratoriumIntDt;
    @XmlElement(name = "OutLoanAccDtsPrevSpreadEndDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccDtsPrevSpreadEndDt;
    @XmlElement(name = "OutLoanAccDtsPrevSpreadStDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccDtsPrevSpreadStDt;
    @XmlElement(name = "OutLoanAccDtsPrevSubsidyExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccDtsPrevSubsidyExpDt;
    @XmlElement(name = "OutLoanAccDtsPrevSubsidyStartDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccDtsPrevSubsidyStartDt;
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
    @XmlElement(name = "OutLoanAccountNrUrlPubIntAmn", required = true)
    protected BigDecimal outLoanAccountNrUrlPubIntAmn;
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
    @XmlElement(name = "OutLoanAccountReqExpSn")
    protected short outLoanAccountReqExpSn;
    @XmlElement(name = "OutLoanAccountReqInstallSn")
    protected short outLoanAccountReqInstallSn;
    @XmlElement(name = "OutLoanAccountReqIntSn")
    protected short outLoanAccountReqIntSn;
    @XmlElement(name = "OutLoanAccountReqLoanSn")
    protected short outLoanAccountReqLoanSn;
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
    @XmlElement(name = "OutLoanAccountTotExpenseAmn", required = true)
    protected BigDecimal outLoanAccountTotExpenseAmn;
    @XmlElement(name = "OutLoanAccountTotExpInCcAmn", required = true)
    protected BigDecimal outLoanAccountTotExpInCcAmn;
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
    @XmlElement(name = "OutLoanAccountUnrealizedFlg")
    protected String outLoanAccountUnrealizedFlg;
    @XmlElement(name = "OutLoanAccountUsr")
    protected String outLoanAccountUsr;
    @XmlElement(name = "OutLoanAccountDrvWorkAccountBal", required = true)
    protected BigDecimal outLoanAccountDrvWorkAccountBal;
    @XmlElement(name = "OutLoanAccountDrvWorkLstYrIntDbAmn", required = true)
    protected BigDecimal outLoanAccountDrvWorkLstYrIntDbAmn;
    @XmlElement(name = "OutLoanAccountDrvWorkNrmAccountBal", required = true)
    protected BigDecimal outLoanAccountDrvWorkNrmAccountBal;
    @XmlElement(name = "OutLoanAccountDrvWorkOvAccBookBal", required = true)
    protected BigDecimal outLoanAccountDrvWorkOvAccBookBal;
    @XmlElement(name = "OutLoanAccountDrvWorkOvAccountBal", required = true)
    protected BigDecimal outLoanAccountDrvWorkOvAccountBal;
    @XmlElement(name = "OutLoanAccountDrvWorkTotPaymentAmn", required = true)
    protected BigDecimal outLoanAccountDrvWorkTotPaymentAmn;
    @XmlElement(name = "OutLoanAccountInfoAccDrawdownSts")
    protected String outLoanAccountInfoAccDrawdownSts;
    @XmlElement(name = "OutLoanAccountInfoAccTransitionFlg")
    protected String outLoanAccountInfoAccTransitionFlg;
    @XmlElement(name = "OutLoanAccountInfoAdjustmentDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountInfoAdjustmentDt;
    @XmlElement(name = "OutLoanAccountInfoAgentBank")
    protected int outLoanAccountInfoAgentBank;
    @XmlElement(name = "OutLoanAccountInfoAutFixIntRenew")
    protected String outLoanAccountInfoAutFixIntRenew;
    @XmlElement(name = "OutLoanAccountInfoBlockedAmn", required = true)
    protected BigDecimal outLoanAccountInfoBlockedAmn;
    @XmlElement(name = "OutLoanAccountInfoCollectionAgency")
    protected int outLoanAccountInfoCollectionAgency;
    @XmlElement(name = "OutLoanAccountInfoCollectionFlg")
    protected String outLoanAccountInfoCollectionFlg;
    @XmlElement(name = "OutLoanAccountInfoCollectionLstDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountInfoCollectionLstDt;
    @XmlElement(name = "OutLoanAccountInfoCollectionTries")
    protected short outLoanAccountInfoCollectionTries;
    @XmlElement(name = "OutLoanAccountInfoCreditIntId")
    protected int outLoanAccountInfoCreditIntId;
    @XmlElement(name = "OutLoanAccountInfoCrIntSprd", required = true)
    protected BigDecimal outLoanAccountInfoCrIntSprd;
    @XmlElement(name = "OutLoanAccountInfoCrSprdEndDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountInfoCrSprdEndDt;
    @XmlElement(name = "OutLoanAccountInfoCrSprdStDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountInfoCrSprdStDt;
    @XmlElement(name = "OutLoanAccountInfoDealDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountInfoDealDate;
    @XmlElement(name = "OutLoanAccountInfoDealerCode")
    protected String outLoanAccountInfoDealerCode;
    @XmlElement(name = "OutLoanAccountInfoDiffIntAlgorithm")
    protected String outLoanAccountInfoDiffIntAlgorithm;
    @XmlElement(name = "OutLoanAccountInfoDormantAmn", required = true)
    protected BigDecimal outLoanAccountInfoDormantAmn;
    @XmlElement(name = "OutLoanAccountInfoFluctuationRange", required = true)
    protected BigDecimal outLoanAccountInfoFluctuationRange;
    @XmlElement(name = "OutLoanAccountInfoGuarActNum")
    protected String outLoanAccountInfoGuarActNum;
    @XmlElement(name = "OutLoanAccountInfoGuarComPerc", required = true)
    protected BigDecimal outLoanAccountInfoGuarComPerc;
    @XmlElement(name = "OutLoanAccountInfoGuarExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountInfoGuarExpDt;
    @XmlElement(name = "OutLoanAccountInfoInitialInterest", required = true)
    protected BigDecimal outLoanAccountInfoInitialInterest;
    @XmlElement(name = "OutLoanAccountInfoInstallCalcPeriod")
    protected int outLoanAccountInfoInstallCalcPeriod;
    @XmlElement(name = "OutLoanAccountInfoInstallChangeDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountInfoInstallChangeDate;
    @XmlElement(name = "OutLoanAccountInfoInstallFixedAmn", required = true)
    protected BigDecimal outLoanAccountInfoInstallFixedAmn;
    @XmlElement(name = "OutLoanAccountInfoInstallRoundAmn", required = true)
    protected BigDecimal outLoanAccountInfoInstallRoundAmn;
    @XmlElement(name = "OutLoanAccountInfoLastRemindLetterDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountInfoLastRemindLetterDate;
    @XmlElement(name = "OutLoanAccountInfoLastRemindLetterType")
    protected short outLoanAccountInfoLastRemindLetterType;
    @XmlElement(name = "OutLoanAccountInfoLoanAccPayroll")
    protected String outLoanAccountInfoLoanAccPayroll;
    @XmlElement(name = "OutLoanAccountInfoLstIntChangeSn")
    protected short outLoanAccountInfoLstIntChangeSn;
    @XmlElement(name = "OutLoanAccountInfoMaintainEqInst")
    protected String outLoanAccountInfoMaintainEqInst;
    @XmlElement(name = "OutLoanAccountInfoMoratIntPayFlg")
    protected String outLoanAccountInfoMoratIntPayFlg;
    @XmlElement(name = "OutLoanAccountInfoMoratoriumIntDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountInfoMoratoriumIntDt;
    @XmlElement(name = "OutLoanAccountInfoMoratoriumIntFrq")
    protected short outLoanAccountInfoMoratoriumIntFrq;
    @XmlElement(name = "OutLoanAccountInfoNo30daysLetterFlg")
    protected short outLoanAccountInfoNo30DaysLetterFlg;
    @XmlElement(name = "OutLoanAccountInfoNrmAccrualAmn", required = true)
    protected BigDecimal outLoanAccountInfoNrmAccrualAmn;
    @XmlElement(name = "OutLoanAccountInfoNrmAccrualLstDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountInfoNrmAccrualLstDt;
    @XmlElement(name = "OutLoanAccountInfoNrmRlUrlFlg")
    protected short outLoanAccountInfoNrmRlUrlFlg;
    @XmlElement(name = "OutLoanAccountInfoOvAccrualAmn", required = true)
    protected BigDecimal outLoanAccountInfoOvAccrualAmn;
    @XmlElement(name = "OutLoanAccountInfoOvAccrualLstDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountInfoOvAccrualLstDt;
    @XmlElement(name = "OutLoanAccountInfoOvRlUrlFlg")
    protected short outLoanAccountInfoOvRlUrlFlg;
    @XmlElement(name = "OutLoanAccountInfoPayrollAccNum")
    protected String outLoanAccountInfoPayrollAccNum;
    @XmlElement(name = "OutLoanAccountInfoPayrollAgrCode")
    protected int outLoanAccountInfoPayrollAgrCode;
    @XmlElement(name = "OutLoanAccountInfoPayrollConnFlg")
    protected String outLoanAccountInfoPayrollConnFlg;
    @XmlElement(name = "OutLoanAccountInfoPayrollDiasCode")
    protected double outLoanAccountInfoPayrollDiasCode;
    @XmlElement(name = "OutLoanAccountInfoPayrollIdNo")
    protected String outLoanAccountInfoPayrollIdNo;
    @XmlElement(name = "OutLoanAccountInfoPayrollLastDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountInfoPayrollLastDt;
    @XmlElement(name = "OutLoanAccountInfoPayrollLstInstal", required = true)
    protected BigDecimal outLoanAccountInfoPayrollLstInstal;
    @XmlElement(name = "OutLoanAccountInfoPayrollUpdateFlg")
    protected String outLoanAccountInfoPayrollUpdateFlg;
    @XmlElement(name = "OutLoanAccountInfoPositiveAmn", required = true)
    protected BigDecimal outLoanAccountInfoPositiveAmn;
    @XmlElement(name = "OutLoanAccountInfoProvisionChgFlg")
    protected String outLoanAccountInfoProvisionChgFlg;
    @XmlElement(name = "OutLoanAccountInfoProvisionCurrPerc")
    protected int outLoanAccountInfoProvisionCurrPerc;
    @XmlElement(name = "OutLoanAccountInfoProvisionJustific")
    protected int outLoanAccountInfoProvisionJustific;
    @XmlElement(name = "OutLoanAccountInfoProvisionMaxPerc")
    protected int outLoanAccountInfoProvisionMaxPerc;
    @XmlElement(name = "OutLoanAccountInfoRateApprovalNum")
    protected String outLoanAccountInfoRateApprovalNum;
    @XmlElement(name = "OutLoanAccountInfoRepaymentSchFlg")
    protected String outLoanAccountInfoRepaymentSchFlg;
    @XmlElement(name = "OutLoanAccountInfoSelectedBankRate", required = true)
    protected BigDecimal outLoanAccountInfoSelectedBankRate;
    @XmlElement(name = "OutLoanAccountInfoSelectedNormalRate", required = true)
    protected BigDecimal outLoanAccountInfoSelectedNormalRate;
    @XmlElement(name = "OutLoanAccountInfoSpreadStDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountInfoSpreadStDt;
    @XmlElement(name = "OutLoanAccountInfoTolDays1")
    protected short outLoanAccountInfoTolDays1;
    @XmlElement(name = "OutLoanAccountInfoTolDays2")
    protected short outLoanAccountInfoTolDays2;
    @XmlElement(name = "OutLoanAccountInfoTolDays3")
    protected short outLoanAccountInfoTolDays3;
    @XmlElement(name = "OutLoanAccountInfoTolDays5")
    protected short outLoanAccountInfoTolDays5;
    @XmlElement(name = "OutLoanAccountInfoTransactInd")
    protected String outLoanAccountInfoTransactInd;
    @XmlElement(name = "OutLoanAccountInfoTransactSm")
    protected int outLoanAccountInfoTransactSm;
    @XmlElement(name = "OutLoanAccountInfoUnclearAmn", required = true)
    protected BigDecimal outLoanAccountInfoUnclearAmn;
    @XmlElement(name = "OutLoanAccUnitCode")
    protected int outLoanAccUnitCode;
    @XmlElement(name = "OutLoanIntSpreadCrInterRateSpr", required = true)
    protected BigDecimal outLoanIntSpreadCrInterRateSpr;
    @XmlElement(name = "OutLoanIntSpreadDbInterRateSpr", required = true)
    protected BigDecimal outLoanIntSpreadDbInterRateSpr;
    @XmlElement(name = "OutLoanParametersRlUrlDuration")
    protected String outLoanParametersRlUrlDuration;
    @XmlElement(name = "OutLoansSts1GlgAccountAccountId")
    protected String outLoansSts1GlgAccountAccountId;
    @XmlElement(name = "OutLoansSts2GlgAccountAccountId")
    protected String outLoansSts2GlgAccountAccountId;
    @XmlElement(name = "OutLoansSts3GlgAccountAccountId")
    protected String outLoansSts3GlgAccountAccountId;
    @XmlElement(name = "OutLoansSts4GlgAccountAccountId")
    protected String outLoansSts4GlgAccountAccountId;
    @XmlElement(name = "OutMainBeneficaryCustomerCustId")
    protected int outMainBeneficaryCustomerCustId;
    @XmlElement(name = "OutMainBeneficaryCustomerCustType")
    protected String outMainBeneficaryCustomerCustType;
    @XmlElement(name = "OutMainBeneficiaryListSetDescription")
    protected String outMainBeneficiaryListSetDescription;
    @XmlElement(name = "OutMediatorProfGenericDetailDescription")
    protected String outMediatorProfGenericDetailDescription;
    @XmlElement(name = "OutMediatorProfGenericDetailParameterType")
    protected String outMediatorProfGenericDetailParameterType;
    @XmlElement(name = "OutMediatorProfGenericDetailSerialNum")
    protected int outMediatorProfGenericDetailSerialNum;
    @XmlElement(name = "OutMediatorProfGenericDetailShortDescription")
    protected String outMediatorProfGenericDetailShortDescription;
    @XmlElement(name = "OutMovedCurrencyIdCurrency")
    protected int outMovedCurrencyIdCurrency;
    @XmlElement(name = "OutMovedCurrencyShortDescr")
    protected String outMovedCurrencyShortDescr;
    @XmlElement(name = "OutPackageIdPackage")
    protected int outPackageIdPackage;
    @XmlElement(name = "OutPackagePackageDescr")
    protected String outPackagePackageDescr;
    @XmlElement(name = "OutPackageProdInfoProductIndicator")
    protected String outPackageProdInfoProductIndicator;
    @XmlElement(name = "OutPayrollDtLoanInstallChgChangeDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outPayrollDtLoanInstallChgChangeDt;
    @XmlElement(name = "OutPayrollGenericDetailDescription")
    protected String outPayrollGenericDetailDescription;
    @XmlElement(name = "OutPayrollGenericDetailSerialNum")
    protected int outPayrollGenericDetailSerialNum;
    @XmlElement(name = "OutPenaltyLnsInterestDescription")
    protected String outPenaltyLnsInterestDescription;
    @XmlElement(name = "OutPenaltyLnsInterestIdInterest")
    protected int outPenaltyLnsInterestIdInterest;
    @XmlElement(name = "OutPenaltyPercInterestSupplyWorkCurFxIntScalDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outPenaltyPercInterestSupplyWorkCurFxIntScalDt;
    @XmlElement(name = "OutPenaltyPercInterestSupplyWorkFixedInterestPrc", required = true)
    protected BigDecimal outPenaltyPercInterestSupplyWorkFixedInterestPrc;
    @XmlElement(name = "OutPenaltyPercIntScalePercentage", required = true)
    protected BigDecimal outPenaltyPercIntScalePercentage;
    @XmlElement(name = "OutPenaltyPercIntScaleValidityDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outPenaltyPercIntScaleValidityDate;
    @XmlElement(name = "OutPreviousFixedLnsInterestDescription")
    protected String outPreviousFixedLnsInterestDescription;
    @XmlElement(name = "OutPreviousFixedLnsInterestIdInterest")
    protected int outPreviousFixedLnsInterestIdInterest;
    @XmlElement(name = "OutProductDescription")
    protected String outProductDescription;
    @XmlElement(name = "OutProductIdProduct")
    protected int outProductIdProduct;
    @XmlElement(name = "OutProductProductType")
    protected String outProductProductType;
    @XmlElement(name = "OutProductValidityDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outProductValidityDate;
    @XmlElement(name = "OutPurposeGenericDetailDescription")
    protected String outPurposeGenericDetailDescription;
    @XmlElement(name = "OutPurposeGenericDetailSerialNum")
    protected int outPurposeGenericDetailSerialNum;
    @XmlElement(name = "OutSalePointGenericDetailDescription")
    protected String outSalePointGenericDetailDescription;
    @XmlElement(name = "OutSalePointGenericDetailSerialNum")
    protected int outSalePointGenericDetailSerialNum;
    @XmlElement(name = "OutSellerGenericDetailDescription")
    protected String outSellerGenericDetailDescription;
    @XmlElement(name = "OutSellerGenericDetailSerialNum")
    protected int outSellerGenericDetailSerialNum;
    @XmlElement(name = "OutSubsidyOrderDescription")
    protected String outSubsidyOrderDescription;
    @XmlElement(name = "OutSubsidyOrderExpiryDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSubsidyOrderExpiryDt;
    @XmlElement(name = "OutSubsidyOrderIdSubsidy")
    protected int outSubsidyOrderIdSubsidy;
    @XmlElement(name = "OutSubsidyOrderLnsEffectiveDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSubsidyOrderLnsEffectiveDt;
    @XmlElement(name = "OutSubsidyOrderLnsExpiryDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSubsidyOrderLnsExpiryDt;
    @XmlElement(name = "OutSubsidyOrderSubsDurationPrd")
    protected short outSubsidyOrderSubsDurationPrd;
    @XmlElement(name = "OutTotalSubsidyIefSuppliedAmount", required = true)
    protected BigDecimal outTotalSubsidyIefSuppliedAmount;
    @XmlElement(name = "OutTotAvailableLimitIefSuppliedAmount", required = true)
    protected BigDecimal outTotAvailableLimitIefSuppliedAmount;
    @XmlElement(name = "OutTotUtilizedLimitIefSuppliedAmount", required = true)
    protected BigDecimal outTotUtilizedLimitIefSuppliedAmount;
    @XmlElement(name = "OutTransitionFlgIefSuppliedFlag")
    protected String outTransitionFlgIefSuppliedFlag;
    @XmlElement(name = "OutTransLoanAccountAccOpenDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTransLoanAccountAccOpenDt;
    @XmlElement(name = "OutTransLoanAccountCurFxIntExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTransLoanAccountCurFxIntExpDt;
    @XmlElement(name = "OutTransLoanAccountDrawdownFstAmn", required = true)
    protected BigDecimal outTransLoanAccountDrawdownFstAmn;
    @XmlElement(name = "OutTransLoanAccountDrawdownFstDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTransLoanAccountDrawdownFstDt;
    @XmlElement(name = "OutTransLoanAccountInstallNextDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTransLoanAccountInstallNextDt;
    @XmlElement(name = "OutTransLoanAccountInstallPrevDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTransLoanAccountInstallPrevDt;
    @XmlElement(name = "OutTransLoanAccountLstAprIntDbAmn", required = true)
    protected BigDecimal outTransLoanAccountLstAprIntDbAmn;
    @XmlElement(name = "OutTransLoanAccountLstAprYear")
    protected short outTransLoanAccountLstAprYear;
    @XmlElement(name = "OutTransLoanAccountLstAugIntDbAmn", required = true)
    protected BigDecimal outTransLoanAccountLstAugIntDbAmn;
    @XmlElement(name = "OutTransLoanAccountLstAugYear")
    protected short outTransLoanAccountLstAugYear;
    @XmlElement(name = "OutTransLoanAccountLstDecIntDbAmn", required = true)
    protected BigDecimal outTransLoanAccountLstDecIntDbAmn;
    @XmlElement(name = "OutTransLoanAccountLstDecYear")
    protected short outTransLoanAccountLstDecYear;
    @XmlElement(name = "OutTransLoanAccountLstFebIntDbAmn", required = true)
    protected BigDecimal outTransLoanAccountLstFebIntDbAmn;
    @XmlElement(name = "OutTransLoanAccountLstFebYear")
    protected short outTransLoanAccountLstFebYear;
    @XmlElement(name = "OutTransLoanAccountLstJanIntDbAmn", required = true)
    protected BigDecimal outTransLoanAccountLstJanIntDbAmn;
    @XmlElement(name = "OutTransLoanAccountLstJanYear")
    protected short outTransLoanAccountLstJanYear;
    @XmlElement(name = "OutTransLoanAccountLstJulIntDbAmn", required = true)
    protected BigDecimal outTransLoanAccountLstJulIntDbAmn;
    @XmlElement(name = "OutTransLoanAccountLstJulYear")
    protected short outTransLoanAccountLstJulYear;
    @XmlElement(name = "OutTransLoanAccountLstJunIntDbAmn", required = true)
    protected BigDecimal outTransLoanAccountLstJunIntDbAmn;
    @XmlElement(name = "OutTransLoanAccountLstJunYear")
    protected short outTransLoanAccountLstJunYear;
    @XmlElement(name = "OutTransLoanAccountLstMarIntDbAmn", required = true)
    protected BigDecimal outTransLoanAccountLstMarIntDbAmn;
    @XmlElement(name = "OutTransLoanAccountLstMarYear")
    protected short outTransLoanAccountLstMarYear;
    @XmlElement(name = "OutTransLoanAccountLstMayIntDbAmn", required = true)
    protected BigDecimal outTransLoanAccountLstMayIntDbAmn;
    @XmlElement(name = "OutTransLoanAccountLstMayYear")
    protected short outTransLoanAccountLstMayYear;
    @XmlElement(name = "OutTransLoanAccountLstNovIntDbAmn", required = true)
    protected BigDecimal outTransLoanAccountLstNovIntDbAmn;
    @XmlElement(name = "OutTransLoanAccountLstNovYear")
    protected short outTransLoanAccountLstNovYear;
    @XmlElement(name = "OutTransLoanAccountLstOctIntDbAmn", required = true)
    protected BigDecimal outTransLoanAccountLstOctIntDbAmn;
    @XmlElement(name = "OutTransLoanAccountLstOctYear")
    protected short outTransLoanAccountLstOctYear;
    @XmlElement(name = "OutTransLoanAccountLstSepIntDbAmn", required = true)
    protected BigDecimal outTransLoanAccountLstSepIntDbAmn;
    @XmlElement(name = "OutTransLoanAccountLstSepYear")
    protected short outTransLoanAccountLstSepYear;
    @XmlElement(name = "OutTransLoanAccountMoratorN128Rate", required = true)
    protected BigDecimal outTransLoanAccountMoratorN128Rate;
    @XmlElement(name = "OutTransLoanAccountMoratorNrmRate", required = true)
    protected BigDecimal outTransLoanAccountMoratorNrmRate;
    @XmlElement(name = "OutTransLoanAccountMoratorSprRate", required = true)
    protected BigDecimal outTransLoanAccountMoratorSprRate;
    @XmlElement(name = "OutTransLoanAccountMpStartCapAmn", required = true)
    protected BigDecimal outTransLoanAccountMpStartCapAmn;
    @XmlElement(name = "OutTransLoanAccountOldAccountCd")
    protected short outTransLoanAccountOldAccountCd;
    @XmlElement(name = "OutTransLoanAccountOldAccountNum")
    protected String outTransLoanAccountOldAccountNum;
    @XmlElement(name = "OutTransLoanAccountReqInstallSn")
    protected short outTransLoanAccountReqInstallSn;
    @XmlElement(name = "OutTransLoanAccountTotCapAmn", required = true)
    protected BigDecimal outTransLoanAccountTotCapAmn;
    @XmlElement(name = "OutTransLoanAccountTotComInCcAmn", required = true)
    protected BigDecimal outTransLoanAccountTotComInCcAmn;
    @XmlElement(name = "OutTransLoanAccountTotCommissionAmn", required = true)
    protected BigDecimal outTransLoanAccountTotCommissionAmn;
    @XmlElement(name = "OutTransLoanAccountTotConfirmAmn", required = true)
    protected BigDecimal outTransLoanAccountTotConfirmAmn;
    @XmlElement(name = "OutTransLoanAccountTotDrawdownAmn", required = true)
    protected BigDecimal outTransLoanAccountTotDrawdownAmn;
    @XmlElement(name = "OutTransLoanAccountTotExpenseAmn", required = true)
    protected BigDecimal outTransLoanAccountTotExpenseAmn;
    @XmlElement(name = "OutTransLoanAccountTotExpInCcAmn", required = true)
    protected BigDecimal outTransLoanAccountTotExpInCcAmn;
    @XmlElement(name = "OutTransLoanAccountTotNrmIntAmn", required = true)
    protected BigDecimal outTransLoanAccountTotNrmIntAmn;
    @XmlElement(name = "OutTransLoanAccountTotPnlIntAmn", required = true)
    protected BigDecimal outTransLoanAccountTotPnlIntAmn;
    @XmlElement(name = "OutTransLoanAccountTotPubCommAmn", required = true)
    protected BigDecimal outTransLoanAccountTotPubCommAmn;
    @XmlElement(name = "OutTransLoanAccountTotSubsIntAmn", required = true)
    protected BigDecimal outTransLoanAccountTotSubsIntAmn;
    @XmlElement(name = "OutTransLoanAccountTotThrdprtAmn", required = true)
    protected BigDecimal outTransLoanAccountTotThrdprtAmn;
    @XmlElement(name = "OutUnionCustomerCustId")
    protected int outUnionCustomerCustId;
    @XmlElement(name = "OutUnionCustomerListSetDescription")
    protected String outUnionCustomerListSetDescription;
    @XmlElement(name = "OutWithoutTunelInterestCalculationWorkTempInterestRate", required = true)
    protected BigDecimal outWithoutTunelInterestCalculationWorkTempInterestRate;
    @XmlElement(name = "OutWithTunelInterestCalculationWorkTempInterestRate", required = true)
    protected BigDecimal outWithTunelInterestCalculationWorkTempInterestRate;
    @XmlElement(name = "OutIpfFlagIefSuppliedFlag")
    protected String outIpfFlagIefSuppliedFlag;
    @XmlElement(name = "OutGrpCollection")
    protected ArrayOfOutGrpCollection outGrpCollection;
    @XmlElement(name = "OutGrpLnsAddInfo")
    protected ArrayOfOutGrpLnsAddInfo outGrpLnsAddInfo;
    @XmlElement(name = "OutGrpLoanAddInfo")
    protected ArrayOfOutGrpLoanAddInfo outGrpLoanAddInfo;
    @XmlElement(name = "OutGrpLoanSubsidyInfo")
    protected ArrayOfOutGrpLoanSubsidyInfo outGrpLoanSubsidyInfo;
    @XmlElement(name = "OutGrpLog")
    protected ArrayOfOutGrpLog outGrpLog;
    @XmlElement(name = "OutGrpPayroll")
    protected ArrayOfOutGrpPayroll outGrpPayroll;
    @XmlElement(name = "OutGrpPrevLnsAccs")
    protected ArrayOfOutGrpPrevLnsAccs outGrpPrevLnsAccs;
    @XmlElement(name = "OutGrpReply")
    protected ArrayOfOutGrpReply outGrpReply;
    @XmlElement(name = "OutGrpSendCollection")
    protected ArrayOfOutGrpSendCollection outGrpSendCollection;
    @XmlElement(name = "OutGrpMediators")
    protected ArrayOfL0401VOutGrpMediatorsItem outGrpMediators;
    @XmlElement(name = "OutN128LnsInterestIdInterest")
    protected int outN128LnsInterestIdInterest;
    @XmlElement(name = "OutN128LnsInterestDescription")
    protected String outN128LnsInterestDescription;

    /**
     * Gets the value of the out2LoanAccountSubsidyDuration property.
     * 
     */
    public short getOut2LoanAccountSubsidyDuration() {
        return out2LoanAccountSubsidyDuration;
    }

    /**
     * Sets the value of the out2LoanAccountSubsidyDuration property.
     * 
     */
    public void setOut2LoanAccountSubsidyDuration(short value) {
        this.out2LoanAccountSubsidyDuration = value;
    }

    /**
     * Gets the value of the out2LoanAccountSubsidyExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOut2LoanAccountSubsidyExpDt() {
        return out2LoanAccountSubsidyExpDt;
    }

    /**
     * Sets the value of the out2LoanAccountSubsidyExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOut2LoanAccountSubsidyExpDt(XMLGregorianCalendar value) {
        this.out2LoanAccountSubsidyExpDt = value;
    }

    /**
     * Gets the value of the out2LoanAccountSubsidyLimitAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOut2LoanAccountSubsidyLimitAmn() {
        return out2LoanAccountSubsidyLimitAmn;
    }

    /**
     * Sets the value of the out2LoanAccountSubsidyLimitAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOut2LoanAccountSubsidyLimitAmn(BigDecimal value) {
        this.out2LoanAccountSubsidyLimitAmn = value;
    }

    /**
     * Gets the value of the out2LoanAccountSubsidyStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOut2LoanAccountSubsidyStartDt() {
        return out2LoanAccountSubsidyStartDt;
    }

    /**
     * Sets the value of the out2LoanAccountSubsidyStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOut2LoanAccountSubsidyStartDt(XMLGregorianCalendar value) {
        this.out2LoanAccountSubsidyStartDt = value;
    }

    /**
     * Gets the value of the out2MoveCurrencyIdCurrency property.
     * 
     */
    public int getOut2MoveCurrencyIdCurrency() {
        return out2MoveCurrencyIdCurrency;
    }

    /**
     * Sets the value of the out2MoveCurrencyIdCurrency property.
     * 
     */
    public void setOut2MoveCurrencyIdCurrency(int value) {
        this.out2MoveCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the out2MoveCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOut2MoveCurrencyShortDescr() {
        return out2MoveCurrencyShortDescr;
    }

    /**
     * Sets the value of the out2MoveCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOut2MoveCurrencyShortDescr(String value) {
        this.out2MoveCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the out2SubsidyOrderDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOut2SubsidyOrderDescription() {
        return out2SubsidyOrderDescription;
    }

    /**
     * Sets the value of the out2SubsidyOrderDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOut2SubsidyOrderDescription(String value) {
        this.out2SubsidyOrderDescription = value;
    }

    /**
     * Gets the value of the out2SubsidyOrderExpiryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOut2SubsidyOrderExpiryDt() {
        return out2SubsidyOrderExpiryDt;
    }

    /**
     * Sets the value of the out2SubsidyOrderExpiryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOut2SubsidyOrderExpiryDt(XMLGregorianCalendar value) {
        this.out2SubsidyOrderExpiryDt = value;
    }

    /**
     * Gets the value of the out2SubsidyOrderIdSubsidy property.
     * 
     */
    public int getOut2SubsidyOrderIdSubsidy() {
        return out2SubsidyOrderIdSubsidy;
    }

    /**
     * Sets the value of the out2SubsidyOrderIdSubsidy property.
     * 
     */
    public void setOut2SubsidyOrderIdSubsidy(int value) {
        this.out2SubsidyOrderIdSubsidy = value;
    }

    /**
     * Gets the value of the out2SubsidyOrderLnsEffectiveDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOut2SubsidyOrderLnsEffectiveDt() {
        return out2SubsidyOrderLnsEffectiveDt;
    }

    /**
     * Sets the value of the out2SubsidyOrderLnsEffectiveDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOut2SubsidyOrderLnsEffectiveDt(XMLGregorianCalendar value) {
        this.out2SubsidyOrderLnsEffectiveDt = value;
    }

    /**
     * Gets the value of the out2SubsidyOrderLnsExpiryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOut2SubsidyOrderLnsExpiryDt() {
        return out2SubsidyOrderLnsExpiryDt;
    }

    /**
     * Sets the value of the out2SubsidyOrderLnsExpiryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOut2SubsidyOrderLnsExpiryDt(XMLGregorianCalendar value) {
        this.out2SubsidyOrderLnsExpiryDt = value;
    }

    /**
     * Gets the value of the out2SubsidyOrderSubsDurationPrd property.
     * 
     */
    public short getOut2SubsidyOrderSubsDurationPrd() {
        return out2SubsidyOrderSubsDurationPrd;
    }

    /**
     * Sets the value of the out2SubsidyOrderSubsDurationPrd property.
     * 
     */
    public void setOut2SubsidyOrderSubsDurationPrd(short value) {
        this.out2SubsidyOrderSubsDurationPrd = value;
    }

    /**
     * Gets the value of the outAccNoLoanAccCollectAccNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAccNoLoanAccCollectAccNo() {
        return outAccNoLoanAccCollectAccNo;
    }

    /**
     * Sets the value of the outAccNoLoanAccCollectAccNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAccNoLoanAccCollectAccNo(String value) {
        this.outAccNoLoanAccCollectAccNo = value;
    }

    /**
     * Gets the value of the outAccountTotalAmountIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAccountTotalAmountIefSuppliedAmount() {
        return outAccountTotalAmountIefSuppliedAmount;
    }

    /**
     * Sets the value of the outAccountTotalAmountIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAccountTotalAmountIefSuppliedAmount(BigDecimal value) {
        this.outAccountTotalAmountIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the outAdjustGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAdjustGenericDetailDescription() {
        return outAdjustGenericDetailDescription;
    }

    /**
     * Sets the value of the outAdjustGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAdjustGenericDetailDescription(String value) {
        this.outAdjustGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outAdjustGenericDetailSerialNum property.
     * 
     */
    public int getOutAdjustGenericDetailSerialNum() {
        return outAdjustGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outAdjustGenericDetailSerialNum property.
     * 
     */
    public void setOutAdjustGenericDetailSerialNum(int value) {
        this.outAdjustGenericDetailSerialNum = value;
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
     * Gets the value of the outAgreementUnitCode property.
     * 
     */
    public int getOutAgreementUnitCode() {
        return outAgreementUnitCode;
    }

    /**
     * Sets the value of the outAgreementUnitCode property.
     * 
     */
    public void setOutAgreementUnitCode(int value) {
        this.outAgreementUnitCode = value;
    }

    /**
     * Gets the value of the outAgreementWorkAgrAvailLmtAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAgreementWorkAgrAvailLmtAmn() {
        return outAgreementWorkAgrAvailLmtAmn;
    }

    /**
     * Sets the value of the outAgreementWorkAgrAvailLmtAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAgreementWorkAgrAvailLmtAmn(BigDecimal value) {
        this.outAgreementWorkAgrAvailLmtAmn = value;
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
     * Gets the value of the outAsoCustomerListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAsoCustomerListSetDescription() {
        return outAsoCustomerListSetDescription;
    }

    /**
     * Sets the value of the outAsoCustomerListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAsoCustomerListSetDescription(String value) {
        this.outAsoCustomerListSetDescription = value;
    }

    /**
     * Gets the value of the outBankParametersAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankParametersAddress() {
        return outBankParametersAddress;
    }

    /**
     * Sets the value of the outBankParametersAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankParametersAddress(String value) {
        this.outBankParametersAddress = value;
    }

    /**
     * Gets the value of the outBankParametersBankCode property.
     * 
     */
    public short getOutBankParametersBankCode() {
        return outBankParametersBankCode;
    }

    /**
     * Sets the value of the outBankParametersBankCode property.
     * 
     */
    public void setOutBankParametersBankCode(short value) {
        this.outBankParametersBankCode = value;
    }

    /**
     * Gets the value of the outBankParametersBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankParametersBankName() {
        return outBankParametersBankName;
    }

    /**
     * Sets the value of the outBankParametersBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankParametersBankName(String value) {
        this.outBankParametersBankName = value;
    }

    /**
     * Gets the value of the outBankParametersCurrTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBankParametersCurrTrxDate() {
        return outBankParametersCurrTrxDate;
    }

    /**
     * Sets the value of the outBankParametersCurrTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBankParametersCurrTrxDate(XMLGregorianCalendar value) {
        this.outBankParametersCurrTrxDate = value;
    }

    /**
     * Gets the value of the outBankSectorGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankSectorGenericDetailDescription() {
        return outBankSectorGenericDetailDescription;
    }

    /**
     * Sets the value of the outBankSectorGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankSectorGenericDetailDescription(String value) {
        this.outBankSectorGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outBankSectorGenericDetailSerialNum property.
     * 
     */
    public int getOutBankSectorGenericDetailSerialNum() {
        return outBankSectorGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outBankSectorGenericDetailSerialNum property.
     * 
     */
    public void setOutBankSectorGenericDetailSerialNum(int value) {
        this.outBankSectorGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outBenefIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBenefIefSuppliedFlag() {
        return outBenefIefSuppliedFlag;
    }

    /**
     * Sets the value of the outBenefIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBenefIefSuppliedFlag(String value) {
        this.outBenefIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outCategoryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCategoryGenericDetailDescription() {
        return outCategoryGenericDetailDescription;
    }

    /**
     * Sets the value of the outCategoryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCategoryGenericDetailDescription(String value) {
        this.outCategoryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outCategoryGenericDetailSerialNum property.
     * 
     */
    public int getOutCategoryGenericDetailSerialNum() {
        return outCategoryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outCategoryGenericDetailSerialNum property.
     * 
     */
    public void setOutCategoryGenericDetailSerialNum(int value) {
        this.outCategoryGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outCbpurpGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCbpurpGenericDetailDescription() {
        return outCbpurpGenericDetailDescription;
    }

    /**
     * Sets the value of the outCbpurpGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCbpurpGenericDetailDescription(String value) {
        this.outCbpurpGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outCbpurpGenericDetailSerialNum property.
     * 
     */
    public int getOutCbpurpGenericDetailSerialNum() {
        return outCbpurpGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outCbpurpGenericDetailSerialNum property.
     * 
     */
    public void setOutCbpurpGenericDetailSerialNum(int value) {
        this.outCbpurpGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outChargingCurrencyIdCurrency property.
     * 
     */
    public int getOutChargingCurrencyIdCurrency() {
        return outChargingCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outChargingCurrencyIdCurrency property.
     * 
     */
    public void setOutChargingCurrencyIdCurrency(int value) {
        this.outChargingCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outChargingCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutChargingCurrencyShortDescr() {
        return outChargingCurrencyShortDescr;
    }

    /**
     * Sets the value of the outChargingCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutChargingCurrencyShortDescr(String value) {
        this.outChargingCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outClassCodeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutClassCodeGenericDetailDescription() {
        return outClassCodeGenericDetailDescription;
    }

    /**
     * Sets the value of the outClassCodeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutClassCodeGenericDetailDescription(String value) {
        this.outClassCodeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outClassCodeGenericDetailSerialNum property.
     * 
     */
    public int getOutClassCodeGenericDetailSerialNum() {
        return outClassCodeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outClassCodeGenericDetailSerialNum property.
     * 
     */
    public void setOutClassCodeGenericDetailSerialNum(int value) {
        this.outClassCodeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outClientProfitsExitStateWorkActualMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutClientProfitsExitStateWorkActualMessage() {
        return outClientProfitsExitStateWorkActualMessage;
    }

    /**
     * Sets the value of the outClientProfitsExitStateWorkActualMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutClientProfitsExitStateWorkActualMessage(String value) {
        this.outClientProfitsExitStateWorkActualMessage = value;
    }

    /**
     * Gets the value of the outClientProfitsExitStateWorkId property.
     * 
     */
    public double getOutClientProfitsExitStateWorkId() {
        return outClientProfitsExitStateWorkId;
    }

    /**
     * Sets the value of the outClientProfitsExitStateWorkId property.
     * 
     */
    public void setOutClientProfitsExitStateWorkId(double value) {
        this.outClientProfitsExitStateWorkId = value;
    }

    /**
     * Gets the value of the outClientProfitsExitStateWorkLanguage property.
     * 
     */
    public int getOutClientProfitsExitStateWorkLanguage() {
        return outClientProfitsExitStateWorkLanguage;
    }

    /**
     * Sets the value of the outClientProfitsExitStateWorkLanguage property.
     * 
     */
    public void setOutClientProfitsExitStateWorkLanguage(int value) {
        this.outClientProfitsExitStateWorkLanguage = value;
    }

    /**
     * Gets the value of the outClientProfitsExitStateWorkMessageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutClientProfitsExitStateWorkMessageType() {
        return outClientProfitsExitStateWorkMessageType;
    }

    /**
     * Sets the value of the outClientProfitsExitStateWorkMessageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutClientProfitsExitStateWorkMessageType(String value) {
        this.outClientProfitsExitStateWorkMessageType = value;
    }

    /**
     * Gets the value of the outClientProfitsExitStateWorkPrftSystem property.
     * 
     */
    public short getOutClientProfitsExitStateWorkPrftSystem() {
        return outClientProfitsExitStateWorkPrftSystem;
    }

    /**
     * Sets the value of the outClientProfitsExitStateWorkPrftSystem property.
     * 
     */
    public void setOutClientProfitsExitStateWorkPrftSystem(short value) {
        this.outClientProfitsExitStateWorkPrftSystem = value;
    }

    /**
     * Gets the value of the outClientProfitsExitStateWorkRoutineSn property.
     * 
     */
    public double getOutClientProfitsExitStateWorkRoutineSn() {
        return outClientProfitsExitStateWorkRoutineSn;
    }

    /**
     * Sets the value of the outClientProfitsExitStateWorkRoutineSn property.
     * 
     */
    public void setOutClientProfitsExitStateWorkRoutineSn(double value) {
        this.outClientProfitsExitStateWorkRoutineSn = value;
    }

    /**
     * Gets the value of the outClientProfitsExitStateWorkTerminationAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutClientProfitsExitStateWorkTerminationAction() {
        return outClientProfitsExitStateWorkTerminationAction;
    }

    /**
     * Sets the value of the outClientProfitsExitStateWorkTerminationAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutClientProfitsExitStateWorkTerminationAction(String value) {
        this.outClientProfitsExitStateWorkTerminationAction = value;
    }

    /**
     * Gets the value of the outClientProfitsExitStateWorkValruleId property.
     * 
     */
    public double getOutClientProfitsExitStateWorkValruleId() {
        return outClientProfitsExitStateWorkValruleId;
    }

    /**
     * Sets the value of the outClientProfitsExitStateWorkValruleId property.
     * 
     */
    public void setOutClientProfitsExitStateWorkValruleId(double value) {
        this.outClientProfitsExitStateWorkValruleId = value;
    }

    /**
     * Gets the value of the outClientProfitsExitStateWorkValruleSnum property.
     * 
     */
    public int getOutClientProfitsExitStateWorkValruleSnum() {
        return outClientProfitsExitStateWorkValruleSnum;
    }

    /**
     * Sets the value of the outClientProfitsExitStateWorkValruleSnum property.
     * 
     */
    public void setOutClientProfitsExitStateWorkValruleSnum(int value) {
        this.outClientProfitsExitStateWorkValruleSnum = value;
    }

    /**
     * Gets the value of the outCloanGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCloanGenericDetailDescription() {
        return outCloanGenericDetailDescription;
    }

    /**
     * Sets the value of the outCloanGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCloanGenericDetailDescription(String value) {
        this.outCloanGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outCloanGenericDetailSerialNum property.
     * 
     */
    public int getOutCloanGenericDetailSerialNum() {
        return outCloanGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outCloanGenericDetailSerialNum property.
     * 
     */
    public void setOutCloanGenericDetailSerialNum(int value) {
        this.outCloanGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outCollectionGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollectionGenericDetailDescription() {
        return outCollectionGenericDetailDescription;
    }

    /**
     * Sets the value of the outCollectionGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollectionGenericDetailDescription(String value) {
        this.outCollectionGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outCooperativeCustomerCustId property.
     * 
     */
    public int getOutCooperativeCustomerCustId() {
        return outCooperativeCustomerCustId;
    }

    /**
     * Sets the value of the outCooperativeCustomerCustId property.
     * 
     */
    public void setOutCooperativeCustomerCustId(int value) {
        this.outCooperativeCustomerCustId = value;
    }

    /**
     * Gets the value of the outCreatedProfitsAccountAccountCd property.
     * 
     */
    public short getOutCreatedProfitsAccountAccountCd() {
        return outCreatedProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outCreatedProfitsAccountAccountCd property.
     * 
     */
    public void setOutCreatedProfitsAccountAccountCd(short value) {
        this.outCreatedProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outCreatedProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCreatedProfitsAccountAccountNumber() {
        return outCreatedProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outCreatedProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCreatedProfitsAccountAccountNumber(String value) {
        this.outCreatedProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outCreditLineGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCreditLineGenericDetailParameterType() {
        return outCreditLineGenericDetailParameterType;
    }

    /**
     * Sets the value of the outCreditLineGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCreditLineGenericDetailParameterType(String value) {
        this.outCreditLineGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outCreditLineGenericDetailSerialNum property.
     * 
     */
    public int getOutCreditLineGenericDetailSerialNum() {
        return outCreditLineGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outCreditLineGenericDetailSerialNum property.
     * 
     */
    public void setOutCreditLineGenericDetailSerialNum(int value) {
        this.outCreditLineGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outCurrentSpreadInterestSupplyWorkFixedInterestPrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCurrentSpreadInterestSupplyWorkFixedInterestPrc() {
        return outCurrentSpreadInterestSupplyWorkFixedInterestPrc;
    }

    /**
     * Sets the value of the outCurrentSpreadInterestSupplyWorkFixedInterestPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCurrentSpreadInterestSupplyWorkFixedInterestPrc(BigDecimal value) {
        this.outCurrentSpreadInterestSupplyWorkFixedInterestPrc = value;
    }

    /**
     * Gets the value of the outCurrentSpreadIntScalePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCurrentSpreadIntScalePercentage() {
        return outCurrentSpreadIntScalePercentage;
    }

    /**
     * Sets the value of the outCurrentSpreadIntScalePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCurrentSpreadIntScalePercentage(BigDecimal value) {
        this.outCurrentSpreadIntScalePercentage = value;
    }

    /**
     * Gets the value of the outCurrentSpreadIntScaleValidityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCurrentSpreadIntScaleValidityDate() {
        return outCurrentSpreadIntScaleValidityDate;
    }

    /**
     * Sets the value of the outCurrentSpreadIntScaleValidityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCurrentSpreadIntScaleValidityDate(XMLGregorianCalendar value) {
        this.outCurrentSpreadIntScaleValidityDate = value;
    }

    /**
     * Gets the value of the outDepProfitsAccountAccountCd property.
     * 
     */
    public short getOutDepProfitsAccountAccountCd() {
        return outDepProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outDepProfitsAccountAccountCd property.
     * 
     */
    public void setOutDepProfitsAccountAccountCd(short value) {
        this.outDepProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outDepProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepProfitsAccountAccountNumber() {
        return outDepProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outDepProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepProfitsAccountAccountNumber(String value) {
        this.outDepProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outDepProfitsAccountMovementCurrency property.
     * 
     */
    public int getOutDepProfitsAccountMovementCurrency() {
        return outDepProfitsAccountMovementCurrency;
    }

    /**
     * Sets the value of the outDepProfitsAccountMovementCurrency property.
     * 
     */
    public void setOutDepProfitsAccountMovementCurrency(int value) {
        this.outDepProfitsAccountMovementCurrency = value;
    }

    /**
     * Gets the value of the outDialogSalePersonGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDialogSalePersonGenericDetailDescription() {
        return outDialogSalePersonGenericDetailDescription;
    }

    /**
     * Sets the value of the outDialogSalePersonGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDialogSalePersonGenericDetailDescription(String value) {
        this.outDialogSalePersonGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outDialogSalePersonGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDialogSalePersonGenericDetailShortDescription() {
        return outDialogSalePersonGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outDialogSalePersonGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDialogSalePersonGenericDetailShortDescription(String value) {
        this.outDialogSalePersonGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outDialogSaleUnitGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDialogSaleUnitGenericDetailDescription() {
        return outDialogSaleUnitGenericDetailDescription;
    }

    /**
     * Sets the value of the outDialogSaleUnitGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDialogSaleUnitGenericDetailDescription(String value) {
        this.outDialogSaleUnitGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outDialogSaleUnitGenericDetailSerialNum property.
     * 
     */
    public int getOutDialogSaleUnitGenericDetailSerialNum() {
        return outDialogSaleUnitGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outDialogSaleUnitGenericDetailSerialNum property.
     * 
     */
    public void setOutDialogSaleUnitGenericDetailSerialNum(int value) {
        this.outDialogSaleUnitGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outEvalResultTeamInformationAuthorizationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvalResultTeamInformationAuthorizationType() {
        return outEvalResultTeamInformationAuthorizationType;
    }

    /**
     * Sets the value of the outEvalResultTeamInformationAuthorizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvalResultTeamInformationAuthorizationType(String value) {
        this.outEvalResultTeamInformationAuthorizationType = value;
    }

    /**
     * Gets the value of the outEvalResultTeamInformationEvaluationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvalResultTeamInformationEvaluationResult() {
        return outEvalResultTeamInformationEvaluationResult;
    }

    /**
     * Sets the value of the outEvalResultTeamInformationEvaluationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvalResultTeamInformationEvaluationResult(String value) {
        this.outEvalResultTeamInformationEvaluationResult = value;
    }

    /**
     * Gets the value of the outEvalResultTeamInformationRequiredProfile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvalResultTeamInformationRequiredProfile1() {
        return outEvalResultTeamInformationRequiredProfile1;
    }

    /**
     * Sets the value of the outEvalResultTeamInformationRequiredProfile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvalResultTeamInformationRequiredProfile1(String value) {
        this.outEvalResultTeamInformationRequiredProfile1 = value;
    }

    /**
     * Gets the value of the outEvalResultTeamInformationRequiredProfile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvalResultTeamInformationRequiredProfile2() {
        return outEvalResultTeamInformationRequiredProfile2;
    }

    /**
     * Sets the value of the outEvalResultTeamInformationRequiredProfile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvalResultTeamInformationRequiredProfile2(String value) {
        this.outEvalResultTeamInformationRequiredProfile2 = value;
    }

    /**
     * Gets the value of the outFinancialSectorGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFinancialSectorGenericDetailDescription() {
        return outFinancialSectorGenericDetailDescription;
    }

    /**
     * Sets the value of the outFinancialSectorGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFinancialSectorGenericDetailDescription(String value) {
        this.outFinancialSectorGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outFinancialSectorGenericDetailSerialNum property.
     * 
     */
    public int getOutFinancialSectorGenericDetailSerialNum() {
        return outFinancialSectorGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outFinancialSectorGenericDetailSerialNum property.
     * 
     */
    public void setOutFinancialSectorGenericDetailSerialNum(int value) {
        this.outFinancialSectorGenericDetailSerialNum = value;
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
     * Gets the value of the outFixedLnsInterestFixIntDtChgFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFixedLnsInterestFixIntDtChgFlg() {
        return outFixedLnsInterestFixIntDtChgFlg;
    }

    /**
     * Sets the value of the outFixedLnsInterestFixIntDtChgFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFixedLnsInterestFixIntDtChgFlg(String value) {
        this.outFixedLnsInterestFixIntDtChgFlg = value;
    }

    /**
     * Gets the value of the outFixedLnsInterestFixIntExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutFixedLnsInterestFixIntExpDt() {
        return outFixedLnsInterestFixIntExpDt;
    }

    /**
     * Sets the value of the outFixedLnsInterestFixIntExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutFixedLnsInterestFixIntExpDt(XMLGregorianCalendar value) {
        this.outFixedLnsInterestFixIntExpDt = value;
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
     * Gets the value of the outFixedN128InterestSupplyWorkFixedInterestPrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutFixedN128InterestSupplyWorkFixedInterestPrc() {
        return outFixedN128InterestSupplyWorkFixedInterestPrc;
    }

    /**
     * Sets the value of the outFixedN128InterestSupplyWorkFixedInterestPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutFixedN128InterestSupplyWorkFixedInterestPrc(BigDecimal value) {
        this.outFixedN128InterestSupplyWorkFixedInterestPrc = value;
    }

    /**
     * Gets the value of the outFixedN128IntScalePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutFixedN128IntScalePercentage() {
        return outFixedN128IntScalePercentage;
    }

    /**
     * Sets the value of the outFixedN128IntScalePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutFixedN128IntScalePercentage(BigDecimal value) {
        this.outFixedN128IntScalePercentage = value;
    }

    /**
     * Gets the value of the outFixedN128IntScaleValidityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutFixedN128IntScaleValidityDate() {
        return outFixedN128IntScaleValidityDate;
    }

    /**
     * Sets the value of the outFixedN128IntScaleValidityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutFixedN128IntScaleValidityDate(XMLGregorianCalendar value) {
        this.outFixedN128IntScaleValidityDate = value;
    }

    /**
     * Gets the value of the outFixedRateInterestSupplyWorkFixedInterestPrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutFixedRateInterestSupplyWorkFixedInterestPrc() {
        return outFixedRateInterestSupplyWorkFixedInterestPrc;
    }

    /**
     * Sets the value of the outFixedRateInterestSupplyWorkFixedInterestPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutFixedRateInterestSupplyWorkFixedInterestPrc(BigDecimal value) {
        this.outFixedRateInterestSupplyWorkFixedInterestPrc = value;
    }

    /**
     * Gets the value of the outFixedRateIntScalePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutFixedRateIntScalePercentage() {
        return outFixedRateIntScalePercentage;
    }

    /**
     * Sets the value of the outFixedRateIntScalePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutFixedRateIntScalePercentage(BigDecimal value) {
        this.outFixedRateIntScalePercentage = value;
    }

    /**
     * Gets the value of the outFixedRateIntScaleValidityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutFixedRateIntScaleValidityDate() {
        return outFixedRateIntScaleValidityDate;
    }

    /**
     * Sets the value of the outFixedRateIntScaleValidityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutFixedRateIntScaleValidityDate(XMLGregorianCalendar value) {
        this.outFixedRateIntScaleValidityDate = value;
    }

    /**
     * Gets the value of the outFixedTexInterestSupplyWorkFixedInterestPrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutFixedTexInterestSupplyWorkFixedInterestPrc() {
        return outFixedTexInterestSupplyWorkFixedInterestPrc;
    }

    /**
     * Sets the value of the outFixedTexInterestSupplyWorkFixedInterestPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutFixedTexInterestSupplyWorkFixedInterestPrc(BigDecimal value) {
        this.outFixedTexInterestSupplyWorkFixedInterestPrc = value;
    }

    /**
     * Gets the value of the outFixedTexIntScalePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutFixedTexIntScalePercentage() {
        return outFixedTexIntScalePercentage;
    }

    /**
     * Sets the value of the outFixedTexIntScalePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutFixedTexIntScalePercentage(BigDecimal value) {
        this.outFixedTexIntScalePercentage = value;
    }

    /**
     * Gets the value of the outFixedTexIntScaleValidityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutFixedTexIntScaleValidityDate() {
        return outFixedTexIntScaleValidityDate;
    }

    /**
     * Sets the value of the outFixedTexIntScaleValidityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutFixedTexIntScaleValidityDate(XMLGregorianCalendar value) {
        this.outFixedTexIntScaleValidityDate = value;
    }

    /**
     * Gets the value of the outFlexFixInstallAmnLoanInstallmentInfoInstallmentAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutFlexFixInstallAmnLoanInstallmentInfoInstallmentAmn() {
        return outFlexFixInstallAmnLoanInstallmentInfoInstallmentAmn;
    }

    /**
     * Sets the value of the outFlexFixInstallAmnLoanInstallmentInfoInstallmentAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutFlexFixInstallAmnLoanInstallmentInfoInstallmentAmn(BigDecimal value) {
        this.outFlexFixInstallAmnLoanInstallmentInfoInstallmentAmn = value;
    }

    /**
     * Gets the value of the outFloatLnsInterestDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFloatLnsInterestDescription() {
        return outFloatLnsInterestDescription;
    }

    /**
     * Sets the value of the outFloatLnsInterestDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFloatLnsInterestDescription(String value) {
        this.outFloatLnsInterestDescription = value;
    }

    /**
     * Gets the value of the outFloatLnsInterestIdInterest property.
     * 
     */
    public int getOutFloatLnsInterestIdInterest() {
        return outFloatLnsInterestIdInterest;
    }

    /**
     * Sets the value of the outFloatLnsInterestIdInterest property.
     * 
     */
    public void setOutFloatLnsInterestIdInterest(int value) {
        this.outFloatLnsInterestIdInterest = value;
    }

    /**
     * Gets the value of the outFloatN128InterestSupplyWorkFixedInterestPrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutFloatN128InterestSupplyWorkFixedInterestPrc() {
        return outFloatN128InterestSupplyWorkFixedInterestPrc;
    }

    /**
     * Sets the value of the outFloatN128InterestSupplyWorkFixedInterestPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutFloatN128InterestSupplyWorkFixedInterestPrc(BigDecimal value) {
        this.outFloatN128InterestSupplyWorkFixedInterestPrc = value;
    }

    /**
     * Gets the value of the outFloatN128IntScalePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutFloatN128IntScalePercentage() {
        return outFloatN128IntScalePercentage;
    }

    /**
     * Sets the value of the outFloatN128IntScalePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutFloatN128IntScalePercentage(BigDecimal value) {
        this.outFloatN128IntScalePercentage = value;
    }

    /**
     * Gets the value of the outFloatN128IntScaleValidityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutFloatN128IntScaleValidityDate() {
        return outFloatN128IntScaleValidityDate;
    }

    /**
     * Sets the value of the outFloatN128IntScaleValidityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutFloatN128IntScaleValidityDate(XMLGregorianCalendar value) {
        this.outFloatN128IntScaleValidityDate = value;
    }

    /**
     * Gets the value of the outFloatRateInterestSupplyWorkFixedInterestPrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutFloatRateInterestSupplyWorkFixedInterestPrc() {
        return outFloatRateInterestSupplyWorkFixedInterestPrc;
    }

    /**
     * Sets the value of the outFloatRateInterestSupplyWorkFixedInterestPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutFloatRateInterestSupplyWorkFixedInterestPrc(BigDecimal value) {
        this.outFloatRateInterestSupplyWorkFixedInterestPrc = value;
    }

    /**
     * Gets the value of the outFloatRateIntScalePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutFloatRateIntScalePercentage() {
        return outFloatRateIntScalePercentage;
    }

    /**
     * Sets the value of the outFloatRateIntScalePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutFloatRateIntScalePercentage(BigDecimal value) {
        this.outFloatRateIntScalePercentage = value;
    }

    /**
     * Gets the value of the outFloatRateIntScaleValidityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutFloatRateIntScaleValidityDate() {
        return outFloatRateIntScaleValidityDate;
    }

    /**
     * Sets the value of the outFloatRateIntScaleValidityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutFloatRateIntScaleValidityDate(XMLGregorianCalendar value) {
        this.outFloatRateIntScaleValidityDate = value;
    }

    /**
     * Gets the value of the outFloatTexInterestSupplyWorkFixedInterestPrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutFloatTexInterestSupplyWorkFixedInterestPrc() {
        return outFloatTexInterestSupplyWorkFixedInterestPrc;
    }

    /**
     * Sets the value of the outFloatTexInterestSupplyWorkFixedInterestPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutFloatTexInterestSupplyWorkFixedInterestPrc(BigDecimal value) {
        this.outFloatTexInterestSupplyWorkFixedInterestPrc = value;
    }

    /**
     * Gets the value of the outFloatTexIntScalePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutFloatTexIntScalePercentage() {
        return outFloatTexIntScalePercentage;
    }

    /**
     * Sets the value of the outFloatTexIntScalePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutFloatTexIntScalePercentage(BigDecimal value) {
        this.outFloatTexIntScalePercentage = value;
    }

    /**
     * Gets the value of the outFloatTexIntScaleValidityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutFloatTexIntScaleValidityDate() {
        return outFloatTexIntScaleValidityDate;
    }

    /**
     * Sets the value of the outFloatTexIntScaleValidityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutFloatTexIntScaleValidityDate(XMLGregorianCalendar value) {
        this.outFloatTexIntScaleValidityDate = value;
    }

    /**
     * Gets the value of the outForDisplayLoanAccountMoratorN128Rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutForDisplayLoanAccountMoratorN128Rate() {
        return outForDisplayLoanAccountMoratorN128Rate;
    }

    /**
     * Sets the value of the outForDisplayLoanAccountMoratorN128Rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutForDisplayLoanAccountMoratorN128Rate(BigDecimal value) {
        this.outForDisplayLoanAccountMoratorN128Rate = value;
    }

    /**
     * Gets the value of the outForDisplayLoanAccountMoratorNrmRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutForDisplayLoanAccountMoratorNrmRate() {
        return outForDisplayLoanAccountMoratorNrmRate;
    }

    /**
     * Sets the value of the outForDisplayLoanAccountMoratorNrmRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutForDisplayLoanAccountMoratorNrmRate(BigDecimal value) {
        this.outForDisplayLoanAccountMoratorNrmRate = value;
    }

    /**
     * Gets the value of the outForDisplayLoanAccountMoratorSprRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutForDisplayLoanAccountMoratorSprRate() {
        return outForDisplayLoanAccountMoratorSprRate;
    }

    /**
     * Sets the value of the outForDisplayLoanAccountMoratorSprRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutForDisplayLoanAccountMoratorSprRate(BigDecimal value) {
        this.outForDisplayLoanAccountMoratorSprRate = value;
    }

    /**
     * Gets the value of the outGlDefClassGlCrIntAccrGlAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlDefClassGlCrIntAccrGlAcc() {
        return outGlDefClassGlCrIntAccrGlAcc;
    }

    /**
     * Sets the value of the outGlDefClassGlCrIntAccrGlAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlDefClassGlCrIntAccrGlAcc(String value) {
        this.outGlDefClassGlCrIntAccrGlAcc = value;
    }

    /**
     * Gets the value of the outGlDefClassGlCrIntGlAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlDefClassGlCrIntGlAcc() {
        return outGlDefClassGlCrIntGlAcc;
    }

    /**
     * Sets the value of the outGlDefClassGlCrIntGlAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlDefClassGlCrIntGlAcc(String value) {
        this.outGlDefClassGlCrIntGlAcc = value;
    }

    /**
     * Gets the value of the outGlNrmClassGlCrIntAccrGlAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlNrmClassGlCrIntAccrGlAcc() {
        return outGlNrmClassGlCrIntAccrGlAcc;
    }

    /**
     * Sets the value of the outGlNrmClassGlCrIntAccrGlAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlNrmClassGlCrIntAccrGlAcc(String value) {
        this.outGlNrmClassGlCrIntAccrGlAcc = value;
    }

    /**
     * Gets the value of the outGlNrmClassGlCrIntGlAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlNrmClassGlCrIntGlAcc() {
        return outGlNrmClassGlCrIntGlAcc;
    }

    /**
     * Sets the value of the outGlNrmClassGlCrIntGlAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlNrmClassGlCrIntGlAcc(String value) {
        this.outGlNrmClassGlCrIntGlAcc = value;
    }

    /**
     * Gets the value of the outGlOffClassGlCrIntAccrGlAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlOffClassGlCrIntAccrGlAcc() {
        return outGlOffClassGlCrIntAccrGlAcc;
    }

    /**
     * Sets the value of the outGlOffClassGlCrIntAccrGlAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlOffClassGlCrIntAccrGlAcc(String value) {
        this.outGlOffClassGlCrIntAccrGlAcc = value;
    }

    /**
     * Gets the value of the outGlOffClassGlCrIntGlAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlOffClassGlCrIntGlAcc() {
        return outGlOffClassGlCrIntGlAcc;
    }

    /**
     * Sets the value of the outGlOffClassGlCrIntGlAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlOffClassGlCrIntGlAcc(String value) {
        this.outGlOffClassGlCrIntGlAcc = value;
    }

    /**
     * Gets the value of the outGlOveClassGlCrIntAccrGlAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlOveClassGlCrIntAccrGlAcc() {
        return outGlOveClassGlCrIntAccrGlAcc;
    }

    /**
     * Sets the value of the outGlOveClassGlCrIntAccrGlAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlOveClassGlCrIntAccrGlAcc(String value) {
        this.outGlOveClassGlCrIntAccrGlAcc = value;
    }

    /**
     * Gets the value of the outGlOveClassGlCrIntGlAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlOveClassGlCrIntGlAcc() {
        return outGlOveClassGlCrIntGlAcc;
    }

    /**
     * Sets the value of the outGlOveClassGlCrIntGlAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlOveClassGlCrIntGlAcc(String value) {
        this.outGlOveClassGlCrIntGlAcc = value;
    }

    /**
     * Gets the value of the outGrpCollectionLength property.
     * 
     */
    public int getOutGrpCollectionLength() {
        return outGrpCollectionLength;
    }

    /**
     * Sets the value of the outGrpCollectionLength property.
     * 
     */
    public void setOutGrpCollectionLength(int value) {
        this.outGrpCollectionLength = value;
    }

    /**
     * Gets the value of the outGrpLnsAddInfoLength property.
     * 
     */
    public int getOutGrpLnsAddInfoLength() {
        return outGrpLnsAddInfoLength;
    }

    /**
     * Sets the value of the outGrpLnsAddInfoLength property.
     * 
     */
    public void setOutGrpLnsAddInfoLength(int value) {
        this.outGrpLnsAddInfoLength = value;
    }

    /**
     * Gets the value of the outGrpLoanAddInfoLength property.
     * 
     */
    public int getOutGrpLoanAddInfoLength() {
        return outGrpLoanAddInfoLength;
    }

    /**
     * Sets the value of the outGrpLoanAddInfoLength property.
     * 
     */
    public void setOutGrpLoanAddInfoLength(int value) {
        this.outGrpLoanAddInfoLength = value;
    }

    /**
     * Gets the value of the outGrpLoanSubsidyInfoLength property.
     * 
     */
    public int getOutGrpLoanSubsidyInfoLength() {
        return outGrpLoanSubsidyInfoLength;
    }

    /**
     * Sets the value of the outGrpLoanSubsidyInfoLength property.
     * 
     */
    public void setOutGrpLoanSubsidyInfoLength(int value) {
        this.outGrpLoanSubsidyInfoLength = value;
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
     * Gets the value of the outGrpPayrollLength property.
     * 
     */
    public int getOutGrpPayrollLength() {
        return outGrpPayrollLength;
    }

    /**
     * Sets the value of the outGrpPayrollLength property.
     * 
     */
    public void setOutGrpPayrollLength(int value) {
        this.outGrpPayrollLength = value;
    }

    /**
     * Gets the value of the outGrpPrevLnsAccsLength property.
     * 
     */
    public int getOutGrpPrevLnsAccsLength() {
        return outGrpPrevLnsAccsLength;
    }

    /**
     * Sets the value of the outGrpPrevLnsAccsLength property.
     * 
     */
    public void setOutGrpPrevLnsAccsLength(int value) {
        this.outGrpPrevLnsAccsLength = value;
    }

    /**
     * Gets the value of the outGrpReplyLength property.
     * 
     */
    public int getOutGrpReplyLength() {
        return outGrpReplyLength;
    }

    /**
     * Sets the value of the outGrpReplyLength property.
     * 
     */
    public void setOutGrpReplyLength(int value) {
        this.outGrpReplyLength = value;
    }

    /**
     * Gets the value of the outGrpSendCollectionLength property.
     * 
     */
    public int getOutGrpSendCollectionLength() {
        return outGrpSendCollectionLength;
    }

    /**
     * Sets the value of the outGrpSendCollectionLength property.
     * 
     */
    public void setOutGrpSendCollectionLength(int value) {
        this.outGrpSendCollectionLength = value;
    }

    /**
     * Gets the value of the outGuaranteeOrderDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGuaranteeOrderDescription() {
        return outGuaranteeOrderDescription;
    }

    /**
     * Sets the value of the outGuaranteeOrderDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGuaranteeOrderDescription(String value) {
        this.outGuaranteeOrderDescription = value;
    }

    /**
     * Gets the value of the outGuaranteeOrderIdGuarantee property.
     * 
     */
    public int getOutGuaranteeOrderIdGuarantee() {
        return outGuaranteeOrderIdGuarantee;
    }

    /**
     * Sets the value of the outGuaranteeOrderIdGuarantee property.
     * 
     */
    public void setOutGuaranteeOrderIdGuarantee(int value) {
        this.outGuaranteeOrderIdGuarantee = value;
    }

    /**
     * Gets the value of the outLimitCurrencyDisplayedDecimalPlaces property.
     * 
     */
    public short getOutLimitCurrencyDisplayedDecimalPlaces() {
        return outLimitCurrencyDisplayedDecimalPlaces;
    }

    /**
     * Sets the value of the outLimitCurrencyDisplayedDecimalPlaces property.
     * 
     */
    public void setOutLimitCurrencyDisplayedDecimalPlaces(short value) {
        this.outLimitCurrencyDisplayedDecimalPlaces = value;
    }

    /**
     * Gets the value of the outLimitCurrencyIdCurrency property.
     * 
     */
    public int getOutLimitCurrencyIdCurrency() {
        return outLimitCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outLimitCurrencyIdCurrency property.
     * 
     */
    public void setOutLimitCurrencyIdCurrency(int value) {
        this.outLimitCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outLimitCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLimitCurrencyShortDescr() {
        return outLimitCurrencyShortDescr;
    }

    /**
     * Sets the value of the outLimitCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLimitCurrencyShortDescr(String value) {
        this.outLimitCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outLnsMediatorAgreementNo property.
     * 
     */
    public int getOutLnsMediatorAgreementNo() {
        return outLnsMediatorAgreementNo;
    }

    /**
     * Sets the value of the outLnsMediatorAgreementNo property.
     * 
     */
    public void setOutLnsMediatorAgreementNo(int value) {
        this.outLnsMediatorAgreementNo = value;
    }

    /**
     * Gets the value of the outLnsMediatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLnsMediatorName() {
        return outLnsMediatorName;
    }

    /**
     * Sets the value of the outLnsMediatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLnsMediatorName(String value) {
        this.outLnsMediatorName = value;
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
     * Gets the value of the outLoanAutFixIntRenew property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAutFixIntRenew() {
        return outLoanAutFixIntRenew;
    }

    /**
     * Sets the value of the outLoanAutFixIntRenew property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAutFixIntRenew(String value) {
        this.outLoanAutFixIntRenew = value;
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
     * Gets the value of the outLoanAccDtsPrevAccExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccDtsPrevAccExpDt() {
        return outLoanAccDtsPrevAccExpDt;
    }

    /**
     * Sets the value of the outLoanAccDtsPrevAccExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccDtsPrevAccExpDt(XMLGregorianCalendar value) {
        this.outLoanAccDtsPrevAccExpDt = value;
    }

    /**
     * Gets the value of the outLoanAccDtsPrevAccOpenDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccDtsPrevAccOpenDt() {
        return outLoanAccDtsPrevAccOpenDt;
    }

    /**
     * Sets the value of the outLoanAccDtsPrevAccOpenDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccDtsPrevAccOpenDt(XMLGregorianCalendar value) {
        this.outLoanAccDtsPrevAccOpenDt = value;
    }

    /**
     * Gets the value of the outLoanAccDtsPrevCurFxIntExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccDtsPrevCurFxIntExpDt() {
        return outLoanAccDtsPrevCurFxIntExpDt;
    }

    /**
     * Sets the value of the outLoanAccDtsPrevCurFxIntExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccDtsPrevCurFxIntExpDt(XMLGregorianCalendar value) {
        this.outLoanAccDtsPrevCurFxIntExpDt = value;
    }

    /**
     * Gets the value of the outLoanAccDtsPrevCurFxIntStDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccDtsPrevCurFxIntStDt() {
        return outLoanAccDtsPrevCurFxIntStDt;
    }

    /**
     * Sets the value of the outLoanAccDtsPrevCurFxIntStDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccDtsPrevCurFxIntStDt(XMLGregorianCalendar value) {
        this.outLoanAccDtsPrevCurFxIntStDt = value;
    }

    /**
     * Gets the value of the outLoanAccDtsPrevDrawdownExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccDtsPrevDrawdownExpDt() {
        return outLoanAccDtsPrevDrawdownExpDt;
    }

    /**
     * Sets the value of the outLoanAccDtsPrevDrawdownExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccDtsPrevDrawdownExpDt(XMLGregorianCalendar value) {
        this.outLoanAccDtsPrevDrawdownExpDt = value;
    }

    /**
     * Gets the value of the outLoanAccDtsPrevInstallFirstDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccDtsPrevInstallFirstDt() {
        return outLoanAccDtsPrevInstallFirstDt;
    }

    /**
     * Sets the value of the outLoanAccDtsPrevInstallFirstDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccDtsPrevInstallFirstDt(XMLGregorianCalendar value) {
        this.outLoanAccDtsPrevInstallFirstDt = value;
    }

    /**
     * Gets the value of the outLoanAccDtsPrevInstallNextDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccDtsPrevInstallNextDt() {
        return outLoanAccDtsPrevInstallNextDt;
    }

    /**
     * Sets the value of the outLoanAccDtsPrevInstallNextDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccDtsPrevInstallNextDt(XMLGregorianCalendar value) {
        this.outLoanAccDtsPrevInstallNextDt = value;
    }

    /**
     * Gets the value of the outLoanAccDtsPrevInstallPrevDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccDtsPrevInstallPrevDt() {
        return outLoanAccDtsPrevInstallPrevDt;
    }

    /**
     * Sets the value of the outLoanAccDtsPrevInstallPrevDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccDtsPrevInstallPrevDt(XMLGregorianCalendar value) {
        this.outLoanAccDtsPrevInstallPrevDt = value;
    }

    /**
     * Gets the value of the outLoanAccDtsPrevMoratoriumIntDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccDtsPrevMoratoriumIntDt() {
        return outLoanAccDtsPrevMoratoriumIntDt;
    }

    /**
     * Sets the value of the outLoanAccDtsPrevMoratoriumIntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccDtsPrevMoratoriumIntDt(XMLGregorianCalendar value) {
        this.outLoanAccDtsPrevMoratoriumIntDt = value;
    }

    /**
     * Gets the value of the outLoanAccDtsPrevSpreadEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccDtsPrevSpreadEndDt() {
        return outLoanAccDtsPrevSpreadEndDt;
    }

    /**
     * Sets the value of the outLoanAccDtsPrevSpreadEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccDtsPrevSpreadEndDt(XMLGregorianCalendar value) {
        this.outLoanAccDtsPrevSpreadEndDt = value;
    }

    /**
     * Gets the value of the outLoanAccDtsPrevSpreadStDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccDtsPrevSpreadStDt() {
        return outLoanAccDtsPrevSpreadStDt;
    }

    /**
     * Sets the value of the outLoanAccDtsPrevSpreadStDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccDtsPrevSpreadStDt(XMLGregorianCalendar value) {
        this.outLoanAccDtsPrevSpreadStDt = value;
    }

    /**
     * Gets the value of the outLoanAccDtsPrevSubsidyExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccDtsPrevSubsidyExpDt() {
        return outLoanAccDtsPrevSubsidyExpDt;
    }

    /**
     * Sets the value of the outLoanAccDtsPrevSubsidyExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccDtsPrevSubsidyExpDt(XMLGregorianCalendar value) {
        this.outLoanAccDtsPrevSubsidyExpDt = value;
    }

    /**
     * Gets the value of the outLoanAccDtsPrevSubsidyStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccDtsPrevSubsidyStartDt() {
        return outLoanAccDtsPrevSubsidyStartDt;
    }

    /**
     * Sets the value of the outLoanAccDtsPrevSubsidyStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccDtsPrevSubsidyStartDt(XMLGregorianCalendar value) {
        this.outLoanAccDtsPrevSubsidyStartDt = value;
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
     * Gets the value of the outLoanAccountDrvWorkAccountBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountDrvWorkAccountBal() {
        return outLoanAccountDrvWorkAccountBal;
    }

    /**
     * Sets the value of the outLoanAccountDrvWorkAccountBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountDrvWorkAccountBal(BigDecimal value) {
        this.outLoanAccountDrvWorkAccountBal = value;
    }

    /**
     * Gets the value of the outLoanAccountDrvWorkLstYrIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountDrvWorkLstYrIntDbAmn() {
        return outLoanAccountDrvWorkLstYrIntDbAmn;
    }

    /**
     * Sets the value of the outLoanAccountDrvWorkLstYrIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountDrvWorkLstYrIntDbAmn(BigDecimal value) {
        this.outLoanAccountDrvWorkLstYrIntDbAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountDrvWorkNrmAccountBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountDrvWorkNrmAccountBal() {
        return outLoanAccountDrvWorkNrmAccountBal;
    }

    /**
     * Sets the value of the outLoanAccountDrvWorkNrmAccountBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountDrvWorkNrmAccountBal(BigDecimal value) {
        this.outLoanAccountDrvWorkNrmAccountBal = value;
    }

    /**
     * Gets the value of the outLoanAccountDrvWorkOvAccBookBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountDrvWorkOvAccBookBal() {
        return outLoanAccountDrvWorkOvAccBookBal;
    }

    /**
     * Sets the value of the outLoanAccountDrvWorkOvAccBookBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountDrvWorkOvAccBookBal(BigDecimal value) {
        this.outLoanAccountDrvWorkOvAccBookBal = value;
    }

    /**
     * Gets the value of the outLoanAccountDrvWorkOvAccountBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountDrvWorkOvAccountBal() {
        return outLoanAccountDrvWorkOvAccountBal;
    }

    /**
     * Sets the value of the outLoanAccountDrvWorkOvAccountBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountDrvWorkOvAccountBal(BigDecimal value) {
        this.outLoanAccountDrvWorkOvAccountBal = value;
    }

    /**
     * Gets the value of the outLoanAccountDrvWorkTotPaymentAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountDrvWorkTotPaymentAmn() {
        return outLoanAccountDrvWorkTotPaymentAmn;
    }

    /**
     * Sets the value of the outLoanAccountDrvWorkTotPaymentAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountDrvWorkTotPaymentAmn(BigDecimal value) {
        this.outLoanAccountDrvWorkTotPaymentAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoAccDrawdownSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountInfoAccDrawdownSts() {
        return outLoanAccountInfoAccDrawdownSts;
    }

    /**
     * Sets the value of the outLoanAccountInfoAccDrawdownSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountInfoAccDrawdownSts(String value) {
        this.outLoanAccountInfoAccDrawdownSts = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoAccTransitionFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountInfoAccTransitionFlg() {
        return outLoanAccountInfoAccTransitionFlg;
    }

    /**
     * Sets the value of the outLoanAccountInfoAccTransitionFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountInfoAccTransitionFlg(String value) {
        this.outLoanAccountInfoAccTransitionFlg = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoAdjustmentDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountInfoAdjustmentDt() {
        return outLoanAccountInfoAdjustmentDt;
    }

    /**
     * Sets the value of the outLoanAccountInfoAdjustmentDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountInfoAdjustmentDt(XMLGregorianCalendar value) {
        this.outLoanAccountInfoAdjustmentDt = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoAgentBank property.
     * 
     */
    public int getOutLoanAccountInfoAgentBank() {
        return outLoanAccountInfoAgentBank;
    }

    /**
     * Sets the value of the outLoanAccountInfoAgentBank property.
     * 
     */
    public void setOutLoanAccountInfoAgentBank(int value) {
        this.outLoanAccountInfoAgentBank = value;
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
     * Gets the value of the outLoanAccountInfoBlockedAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountInfoBlockedAmn() {
        return outLoanAccountInfoBlockedAmn;
    }

    /**
     * Sets the value of the outLoanAccountInfoBlockedAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountInfoBlockedAmn(BigDecimal value) {
        this.outLoanAccountInfoBlockedAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoCollectionAgency property.
     * 
     */
    public int getOutLoanAccountInfoCollectionAgency() {
        return outLoanAccountInfoCollectionAgency;
    }

    /**
     * Sets the value of the outLoanAccountInfoCollectionAgency property.
     * 
     */
    public void setOutLoanAccountInfoCollectionAgency(int value) {
        this.outLoanAccountInfoCollectionAgency = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoCollectionFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountInfoCollectionFlg() {
        return outLoanAccountInfoCollectionFlg;
    }

    /**
     * Sets the value of the outLoanAccountInfoCollectionFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountInfoCollectionFlg(String value) {
        this.outLoanAccountInfoCollectionFlg = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoCollectionLstDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountInfoCollectionLstDt() {
        return outLoanAccountInfoCollectionLstDt;
    }

    /**
     * Sets the value of the outLoanAccountInfoCollectionLstDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountInfoCollectionLstDt(XMLGregorianCalendar value) {
        this.outLoanAccountInfoCollectionLstDt = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoCollectionTries property.
     * 
     */
    public short getOutLoanAccountInfoCollectionTries() {
        return outLoanAccountInfoCollectionTries;
    }

    /**
     * Sets the value of the outLoanAccountInfoCollectionTries property.
     * 
     */
    public void setOutLoanAccountInfoCollectionTries(short value) {
        this.outLoanAccountInfoCollectionTries = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoCreditIntId property.
     * 
     */
    public int getOutLoanAccountInfoCreditIntId() {
        return outLoanAccountInfoCreditIntId;
    }

    /**
     * Sets the value of the outLoanAccountInfoCreditIntId property.
     * 
     */
    public void setOutLoanAccountInfoCreditIntId(int value) {
        this.outLoanAccountInfoCreditIntId = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoCrIntSprd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountInfoCrIntSprd() {
        return outLoanAccountInfoCrIntSprd;
    }

    /**
     * Sets the value of the outLoanAccountInfoCrIntSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountInfoCrIntSprd(BigDecimal value) {
        this.outLoanAccountInfoCrIntSprd = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoCrSprdEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountInfoCrSprdEndDt() {
        return outLoanAccountInfoCrSprdEndDt;
    }

    /**
     * Sets the value of the outLoanAccountInfoCrSprdEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountInfoCrSprdEndDt(XMLGregorianCalendar value) {
        this.outLoanAccountInfoCrSprdEndDt = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoCrSprdStDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountInfoCrSprdStDt() {
        return outLoanAccountInfoCrSprdStDt;
    }

    /**
     * Sets the value of the outLoanAccountInfoCrSprdStDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountInfoCrSprdStDt(XMLGregorianCalendar value) {
        this.outLoanAccountInfoCrSprdStDt = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoDealDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountInfoDealDate() {
        return outLoanAccountInfoDealDate;
    }

    /**
     * Sets the value of the outLoanAccountInfoDealDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountInfoDealDate(XMLGregorianCalendar value) {
        this.outLoanAccountInfoDealDate = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoDealerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountInfoDealerCode() {
        return outLoanAccountInfoDealerCode;
    }

    /**
     * Sets the value of the outLoanAccountInfoDealerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountInfoDealerCode(String value) {
        this.outLoanAccountInfoDealerCode = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoDiffIntAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountInfoDiffIntAlgorithm() {
        return outLoanAccountInfoDiffIntAlgorithm;
    }

    /**
     * Sets the value of the outLoanAccountInfoDiffIntAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountInfoDiffIntAlgorithm(String value) {
        this.outLoanAccountInfoDiffIntAlgorithm = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoDormantAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountInfoDormantAmn() {
        return outLoanAccountInfoDormantAmn;
    }

    /**
     * Sets the value of the outLoanAccountInfoDormantAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountInfoDormantAmn(BigDecimal value) {
        this.outLoanAccountInfoDormantAmn = value;
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
     * Gets the value of the outLoanAccountInfoGuarActNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountInfoGuarActNum() {
        return outLoanAccountInfoGuarActNum;
    }

    /**
     * Sets the value of the outLoanAccountInfoGuarActNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountInfoGuarActNum(String value) {
        this.outLoanAccountInfoGuarActNum = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoGuarComPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountInfoGuarComPerc() {
        return outLoanAccountInfoGuarComPerc;
    }

    /**
     * Sets the value of the outLoanAccountInfoGuarComPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountInfoGuarComPerc(BigDecimal value) {
        this.outLoanAccountInfoGuarComPerc = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoGuarExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountInfoGuarExpDt() {
        return outLoanAccountInfoGuarExpDt;
    }

    /**
     * Sets the value of the outLoanAccountInfoGuarExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountInfoGuarExpDt(XMLGregorianCalendar value) {
        this.outLoanAccountInfoGuarExpDt = value;
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
     * Gets the value of the outLoanAccountInfoInstallCalcPeriod property.
     * 
     */
    public int getOutLoanAccountInfoInstallCalcPeriod() {
        return outLoanAccountInfoInstallCalcPeriod;
    }

    /**
     * Sets the value of the outLoanAccountInfoInstallCalcPeriod property.
     * 
     */
    public void setOutLoanAccountInfoInstallCalcPeriod(int value) {
        this.outLoanAccountInfoInstallCalcPeriod = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoInstallChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountInfoInstallChangeDate() {
        return outLoanAccountInfoInstallChangeDate;
    }

    /**
     * Sets the value of the outLoanAccountInfoInstallChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountInfoInstallChangeDate(XMLGregorianCalendar value) {
        this.outLoanAccountInfoInstallChangeDate = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoInstallFixedAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountInfoInstallFixedAmn() {
        return outLoanAccountInfoInstallFixedAmn;
    }

    /**
     * Sets the value of the outLoanAccountInfoInstallFixedAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountInfoInstallFixedAmn(BigDecimal value) {
        this.outLoanAccountInfoInstallFixedAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoInstallRoundAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountInfoInstallRoundAmn() {
        return outLoanAccountInfoInstallRoundAmn;
    }

    /**
     * Sets the value of the outLoanAccountInfoInstallRoundAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountInfoInstallRoundAmn(BigDecimal value) {
        this.outLoanAccountInfoInstallRoundAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoLastRemindLetterDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountInfoLastRemindLetterDate() {
        return outLoanAccountInfoLastRemindLetterDate;
    }

    /**
     * Sets the value of the outLoanAccountInfoLastRemindLetterDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountInfoLastRemindLetterDate(XMLGregorianCalendar value) {
        this.outLoanAccountInfoLastRemindLetterDate = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoLastRemindLetterType property.
     * 
     */
    public short getOutLoanAccountInfoLastRemindLetterType() {
        return outLoanAccountInfoLastRemindLetterType;
    }

    /**
     * Sets the value of the outLoanAccountInfoLastRemindLetterType property.
     * 
     */
    public void setOutLoanAccountInfoLastRemindLetterType(short value) {
        this.outLoanAccountInfoLastRemindLetterType = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoLoanAccPayroll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountInfoLoanAccPayroll() {
        return outLoanAccountInfoLoanAccPayroll;
    }

    /**
     * Sets the value of the outLoanAccountInfoLoanAccPayroll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountInfoLoanAccPayroll(String value) {
        this.outLoanAccountInfoLoanAccPayroll = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoLstIntChangeSn property.
     * 
     */
    public short getOutLoanAccountInfoLstIntChangeSn() {
        return outLoanAccountInfoLstIntChangeSn;
    }

    /**
     * Sets the value of the outLoanAccountInfoLstIntChangeSn property.
     * 
     */
    public void setOutLoanAccountInfoLstIntChangeSn(short value) {
        this.outLoanAccountInfoLstIntChangeSn = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoMaintainEqInst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountInfoMaintainEqInst() {
        return outLoanAccountInfoMaintainEqInst;
    }

    /**
     * Sets the value of the outLoanAccountInfoMaintainEqInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountInfoMaintainEqInst(String value) {
        this.outLoanAccountInfoMaintainEqInst = value;
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
     * Gets the value of the outLoanAccountInfoNo30DaysLetterFlg property.
     * 
     */
    public short getOutLoanAccountInfoNo30DaysLetterFlg() {
        return outLoanAccountInfoNo30DaysLetterFlg;
    }

    /**
     * Sets the value of the outLoanAccountInfoNo30DaysLetterFlg property.
     * 
     */
    public void setOutLoanAccountInfoNo30DaysLetterFlg(short value) {
        this.outLoanAccountInfoNo30DaysLetterFlg = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoNrmAccrualAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountInfoNrmAccrualAmn() {
        return outLoanAccountInfoNrmAccrualAmn;
    }

    /**
     * Sets the value of the outLoanAccountInfoNrmAccrualAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountInfoNrmAccrualAmn(BigDecimal value) {
        this.outLoanAccountInfoNrmAccrualAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoNrmAccrualLstDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountInfoNrmAccrualLstDt() {
        return outLoanAccountInfoNrmAccrualLstDt;
    }

    /**
     * Sets the value of the outLoanAccountInfoNrmAccrualLstDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountInfoNrmAccrualLstDt(XMLGregorianCalendar value) {
        this.outLoanAccountInfoNrmAccrualLstDt = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoNrmRlUrlFlg property.
     * 
     */
    public short getOutLoanAccountInfoNrmRlUrlFlg() {
        return outLoanAccountInfoNrmRlUrlFlg;
    }

    /**
     * Sets the value of the outLoanAccountInfoNrmRlUrlFlg property.
     * 
     */
    public void setOutLoanAccountInfoNrmRlUrlFlg(short value) {
        this.outLoanAccountInfoNrmRlUrlFlg = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoOvAccrualAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountInfoOvAccrualAmn() {
        return outLoanAccountInfoOvAccrualAmn;
    }

    /**
     * Sets the value of the outLoanAccountInfoOvAccrualAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountInfoOvAccrualAmn(BigDecimal value) {
        this.outLoanAccountInfoOvAccrualAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoOvAccrualLstDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountInfoOvAccrualLstDt() {
        return outLoanAccountInfoOvAccrualLstDt;
    }

    /**
     * Sets the value of the outLoanAccountInfoOvAccrualLstDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountInfoOvAccrualLstDt(XMLGregorianCalendar value) {
        this.outLoanAccountInfoOvAccrualLstDt = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoOvRlUrlFlg property.
     * 
     */
    public short getOutLoanAccountInfoOvRlUrlFlg() {
        return outLoanAccountInfoOvRlUrlFlg;
    }

    /**
     * Sets the value of the outLoanAccountInfoOvRlUrlFlg property.
     * 
     */
    public void setOutLoanAccountInfoOvRlUrlFlg(short value) {
        this.outLoanAccountInfoOvRlUrlFlg = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoPayrollAccNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountInfoPayrollAccNum() {
        return outLoanAccountInfoPayrollAccNum;
    }

    /**
     * Sets the value of the outLoanAccountInfoPayrollAccNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountInfoPayrollAccNum(String value) {
        this.outLoanAccountInfoPayrollAccNum = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoPayrollAgrCode property.
     * 
     */
    public int getOutLoanAccountInfoPayrollAgrCode() {
        return outLoanAccountInfoPayrollAgrCode;
    }

    /**
     * Sets the value of the outLoanAccountInfoPayrollAgrCode property.
     * 
     */
    public void setOutLoanAccountInfoPayrollAgrCode(int value) {
        this.outLoanAccountInfoPayrollAgrCode = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoPayrollConnFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountInfoPayrollConnFlg() {
        return outLoanAccountInfoPayrollConnFlg;
    }

    /**
     * Sets the value of the outLoanAccountInfoPayrollConnFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountInfoPayrollConnFlg(String value) {
        this.outLoanAccountInfoPayrollConnFlg = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoPayrollDiasCode property.
     * 
     */
    public double getOutLoanAccountInfoPayrollDiasCode() {
        return outLoanAccountInfoPayrollDiasCode;
    }

    /**
     * Sets the value of the outLoanAccountInfoPayrollDiasCode property.
     * 
     */
    public void setOutLoanAccountInfoPayrollDiasCode(double value) {
        this.outLoanAccountInfoPayrollDiasCode = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoPayrollIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountInfoPayrollIdNo() {
        return outLoanAccountInfoPayrollIdNo;
    }

    /**
     * Sets the value of the outLoanAccountInfoPayrollIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountInfoPayrollIdNo(String value) {
        this.outLoanAccountInfoPayrollIdNo = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoPayrollLastDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountInfoPayrollLastDt() {
        return outLoanAccountInfoPayrollLastDt;
    }

    /**
     * Sets the value of the outLoanAccountInfoPayrollLastDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountInfoPayrollLastDt(XMLGregorianCalendar value) {
        this.outLoanAccountInfoPayrollLastDt = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoPayrollLstInstal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountInfoPayrollLstInstal() {
        return outLoanAccountInfoPayrollLstInstal;
    }

    /**
     * Sets the value of the outLoanAccountInfoPayrollLstInstal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountInfoPayrollLstInstal(BigDecimal value) {
        this.outLoanAccountInfoPayrollLstInstal = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoPayrollUpdateFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountInfoPayrollUpdateFlg() {
        return outLoanAccountInfoPayrollUpdateFlg;
    }

    /**
     * Sets the value of the outLoanAccountInfoPayrollUpdateFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountInfoPayrollUpdateFlg(String value) {
        this.outLoanAccountInfoPayrollUpdateFlg = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoPositiveAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountInfoPositiveAmn() {
        return outLoanAccountInfoPositiveAmn;
    }

    /**
     * Sets the value of the outLoanAccountInfoPositiveAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountInfoPositiveAmn(BigDecimal value) {
        this.outLoanAccountInfoPositiveAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoProvisionChgFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountInfoProvisionChgFlg() {
        return outLoanAccountInfoProvisionChgFlg;
    }

    /**
     * Sets the value of the outLoanAccountInfoProvisionChgFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountInfoProvisionChgFlg(String value) {
        this.outLoanAccountInfoProvisionChgFlg = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoProvisionCurrPerc property.
     * 
     */
    public int getOutLoanAccountInfoProvisionCurrPerc() {
        return outLoanAccountInfoProvisionCurrPerc;
    }

    /**
     * Sets the value of the outLoanAccountInfoProvisionCurrPerc property.
     * 
     */
    public void setOutLoanAccountInfoProvisionCurrPerc(int value) {
        this.outLoanAccountInfoProvisionCurrPerc = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoProvisionJustific property.
     * 
     */
    public int getOutLoanAccountInfoProvisionJustific() {
        return outLoanAccountInfoProvisionJustific;
    }

    /**
     * Sets the value of the outLoanAccountInfoProvisionJustific property.
     * 
     */
    public void setOutLoanAccountInfoProvisionJustific(int value) {
        this.outLoanAccountInfoProvisionJustific = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoProvisionMaxPerc property.
     * 
     */
    public int getOutLoanAccountInfoProvisionMaxPerc() {
        return outLoanAccountInfoProvisionMaxPerc;
    }

    /**
     * Sets the value of the outLoanAccountInfoProvisionMaxPerc property.
     * 
     */
    public void setOutLoanAccountInfoProvisionMaxPerc(int value) {
        this.outLoanAccountInfoProvisionMaxPerc = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoRateApprovalNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountInfoRateApprovalNum() {
        return outLoanAccountInfoRateApprovalNum;
    }

    /**
     * Sets the value of the outLoanAccountInfoRateApprovalNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountInfoRateApprovalNum(String value) {
        this.outLoanAccountInfoRateApprovalNum = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoRepaymentSchFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountInfoRepaymentSchFlg() {
        return outLoanAccountInfoRepaymentSchFlg;
    }

    /**
     * Sets the value of the outLoanAccountInfoRepaymentSchFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountInfoRepaymentSchFlg(String value) {
        this.outLoanAccountInfoRepaymentSchFlg = value;
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
     * Gets the value of the outLoanAccountInfoSelectedNormalRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountInfoSelectedNormalRate() {
        return outLoanAccountInfoSelectedNormalRate;
    }

    /**
     * Sets the value of the outLoanAccountInfoSelectedNormalRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountInfoSelectedNormalRate(BigDecimal value) {
        this.outLoanAccountInfoSelectedNormalRate = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoSpreadStDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountInfoSpreadStDt() {
        return outLoanAccountInfoSpreadStDt;
    }

    /**
     * Sets the value of the outLoanAccountInfoSpreadStDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountInfoSpreadStDt(XMLGregorianCalendar value) {
        this.outLoanAccountInfoSpreadStDt = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoTolDays1 property.
     * 
     */
    public short getOutLoanAccountInfoTolDays1() {
        return outLoanAccountInfoTolDays1;
    }

    /**
     * Sets the value of the outLoanAccountInfoTolDays1 property.
     * 
     */
    public void setOutLoanAccountInfoTolDays1(short value) {
        this.outLoanAccountInfoTolDays1 = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoTolDays2 property.
     * 
     */
    public short getOutLoanAccountInfoTolDays2() {
        return outLoanAccountInfoTolDays2;
    }

    /**
     * Sets the value of the outLoanAccountInfoTolDays2 property.
     * 
     */
    public void setOutLoanAccountInfoTolDays2(short value) {
        this.outLoanAccountInfoTolDays2 = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoTolDays3 property.
     * 
     */
    public short getOutLoanAccountInfoTolDays3() {
        return outLoanAccountInfoTolDays3;
    }

    /**
     * Sets the value of the outLoanAccountInfoTolDays3 property.
     * 
     */
    public void setOutLoanAccountInfoTolDays3(short value) {
        this.outLoanAccountInfoTolDays3 = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoTolDays5 property.
     * 
     */
    public short getOutLoanAccountInfoTolDays5() {
        return outLoanAccountInfoTolDays5;
    }

    /**
     * Sets the value of the outLoanAccountInfoTolDays5 property.
     * 
     */
    public void setOutLoanAccountInfoTolDays5(short value) {
        this.outLoanAccountInfoTolDays5 = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoTransactInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountInfoTransactInd() {
        return outLoanAccountInfoTransactInd;
    }

    /**
     * Sets the value of the outLoanAccountInfoTransactInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountInfoTransactInd(String value) {
        this.outLoanAccountInfoTransactInd = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoTransactSm property.
     * 
     */
    public int getOutLoanAccountInfoTransactSm() {
        return outLoanAccountInfoTransactSm;
    }

    /**
     * Sets the value of the outLoanAccountInfoTransactSm property.
     * 
     */
    public void setOutLoanAccountInfoTransactSm(int value) {
        this.outLoanAccountInfoTransactSm = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoUnclearAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountInfoUnclearAmn() {
        return outLoanAccountInfoUnclearAmn;
    }

    /**
     * Sets the value of the outLoanAccountInfoUnclearAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountInfoUnclearAmn(BigDecimal value) {
        this.outLoanAccountInfoUnclearAmn = value;
    }

    /**
     * Gets the value of the outLoanAccUnitCode property.
     * 
     */
    public int getOutLoanAccUnitCode() {
        return outLoanAccUnitCode;
    }

    /**
     * Sets the value of the outLoanAccUnitCode property.
     * 
     */
    public void setOutLoanAccUnitCode(int value) {
        this.outLoanAccUnitCode = value;
    }

    /**
     * Gets the value of the outLoanIntSpreadCrInterRateSpr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanIntSpreadCrInterRateSpr() {
        return outLoanIntSpreadCrInterRateSpr;
    }

    /**
     * Sets the value of the outLoanIntSpreadCrInterRateSpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanIntSpreadCrInterRateSpr(BigDecimal value) {
        this.outLoanIntSpreadCrInterRateSpr = value;
    }

    /**
     * Gets the value of the outLoanIntSpreadDbInterRateSpr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanIntSpreadDbInterRateSpr() {
        return outLoanIntSpreadDbInterRateSpr;
    }

    /**
     * Sets the value of the outLoanIntSpreadDbInterRateSpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanIntSpreadDbInterRateSpr(BigDecimal value) {
        this.outLoanIntSpreadDbInterRateSpr = value;
    }

    /**
     * Gets the value of the outLoanParametersRlUrlDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanParametersRlUrlDuration() {
        return outLoanParametersRlUrlDuration;
    }

    /**
     * Sets the value of the outLoanParametersRlUrlDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanParametersRlUrlDuration(String value) {
        this.outLoanParametersRlUrlDuration = value;
    }

    /**
     * Gets the value of the outLoansSts1GlgAccountAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoansSts1GlgAccountAccountId() {
        return outLoansSts1GlgAccountAccountId;
    }

    /**
     * Sets the value of the outLoansSts1GlgAccountAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoansSts1GlgAccountAccountId(String value) {
        this.outLoansSts1GlgAccountAccountId = value;
    }

    /**
     * Gets the value of the outLoansSts2GlgAccountAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoansSts2GlgAccountAccountId() {
        return outLoansSts2GlgAccountAccountId;
    }

    /**
     * Sets the value of the outLoansSts2GlgAccountAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoansSts2GlgAccountAccountId(String value) {
        this.outLoansSts2GlgAccountAccountId = value;
    }

    /**
     * Gets the value of the outLoansSts3GlgAccountAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoansSts3GlgAccountAccountId() {
        return outLoansSts3GlgAccountAccountId;
    }

    /**
     * Sets the value of the outLoansSts3GlgAccountAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoansSts3GlgAccountAccountId(String value) {
        this.outLoansSts3GlgAccountAccountId = value;
    }

    /**
     * Gets the value of the outLoansSts4GlgAccountAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoansSts4GlgAccountAccountId() {
        return outLoansSts4GlgAccountAccountId;
    }

    /**
     * Sets the value of the outLoansSts4GlgAccountAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoansSts4GlgAccountAccountId(String value) {
        this.outLoansSts4GlgAccountAccountId = value;
    }

    /**
     * Gets the value of the outMainBeneficaryCustomerCustId property.
     * 
     */
    public int getOutMainBeneficaryCustomerCustId() {
        return outMainBeneficaryCustomerCustId;
    }

    /**
     * Sets the value of the outMainBeneficaryCustomerCustId property.
     * 
     */
    public void setOutMainBeneficaryCustomerCustId(int value) {
        this.outMainBeneficaryCustomerCustId = value;
    }

    /**
     * Gets the value of the outMainBeneficaryCustomerCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMainBeneficaryCustomerCustType() {
        return outMainBeneficaryCustomerCustType;
    }

    /**
     * Sets the value of the outMainBeneficaryCustomerCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMainBeneficaryCustomerCustType(String value) {
        this.outMainBeneficaryCustomerCustType = value;
    }

    /**
     * Gets the value of the outMainBeneficiaryListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMainBeneficiaryListSetDescription() {
        return outMainBeneficiaryListSetDescription;
    }

    /**
     * Sets the value of the outMainBeneficiaryListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMainBeneficiaryListSetDescription(String value) {
        this.outMainBeneficiaryListSetDescription = value;
    }

    /**
     * Gets the value of the outMediatorProfGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMediatorProfGenericDetailDescription() {
        return outMediatorProfGenericDetailDescription;
    }

    /**
     * Sets the value of the outMediatorProfGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMediatorProfGenericDetailDescription(String value) {
        this.outMediatorProfGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outMediatorProfGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMediatorProfGenericDetailParameterType() {
        return outMediatorProfGenericDetailParameterType;
    }

    /**
     * Sets the value of the outMediatorProfGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMediatorProfGenericDetailParameterType(String value) {
        this.outMediatorProfGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outMediatorProfGenericDetailSerialNum property.
     * 
     */
    public int getOutMediatorProfGenericDetailSerialNum() {
        return outMediatorProfGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outMediatorProfGenericDetailSerialNum property.
     * 
     */
    public void setOutMediatorProfGenericDetailSerialNum(int value) {
        this.outMediatorProfGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outMediatorProfGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMediatorProfGenericDetailShortDescription() {
        return outMediatorProfGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outMediatorProfGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMediatorProfGenericDetailShortDescription(String value) {
        this.outMediatorProfGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outMovedCurrencyIdCurrency property.
     * 
     */
    public int getOutMovedCurrencyIdCurrency() {
        return outMovedCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outMovedCurrencyIdCurrency property.
     * 
     */
    public void setOutMovedCurrencyIdCurrency(int value) {
        this.outMovedCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outMovedCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMovedCurrencyShortDescr() {
        return outMovedCurrencyShortDescr;
    }

    /**
     * Sets the value of the outMovedCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMovedCurrencyShortDescr(String value) {
        this.outMovedCurrencyShortDescr = value;
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
     * Gets the value of the outPackageProdInfoProductIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPackageProdInfoProductIndicator() {
        return outPackageProdInfoProductIndicator;
    }

    /**
     * Sets the value of the outPackageProdInfoProductIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPackageProdInfoProductIndicator(String value) {
        this.outPackageProdInfoProductIndicator = value;
    }

    /**
     * Gets the value of the outPayrollDtLoanInstallChgChangeDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutPayrollDtLoanInstallChgChangeDt() {
        return outPayrollDtLoanInstallChgChangeDt;
    }

    /**
     * Sets the value of the outPayrollDtLoanInstallChgChangeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutPayrollDtLoanInstallChgChangeDt(XMLGregorianCalendar value) {
        this.outPayrollDtLoanInstallChgChangeDt = value;
    }

    /**
     * Gets the value of the outPayrollGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPayrollGenericDetailDescription() {
        return outPayrollGenericDetailDescription;
    }

    /**
     * Sets the value of the outPayrollGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPayrollGenericDetailDescription(String value) {
        this.outPayrollGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outPayrollGenericDetailSerialNum property.
     * 
     */
    public int getOutPayrollGenericDetailSerialNum() {
        return outPayrollGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outPayrollGenericDetailSerialNum property.
     * 
     */
    public void setOutPayrollGenericDetailSerialNum(int value) {
        this.outPayrollGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outPenaltyLnsInterestDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPenaltyLnsInterestDescription() {
        return outPenaltyLnsInterestDescription;
    }

    /**
     * Sets the value of the outPenaltyLnsInterestDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPenaltyLnsInterestDescription(String value) {
        this.outPenaltyLnsInterestDescription = value;
    }

    /**
     * Gets the value of the outPenaltyLnsInterestIdInterest property.
     * 
     */
    public int getOutPenaltyLnsInterestIdInterest() {
        return outPenaltyLnsInterestIdInterest;
    }

    /**
     * Sets the value of the outPenaltyLnsInterestIdInterest property.
     * 
     */
    public void setOutPenaltyLnsInterestIdInterest(int value) {
        this.outPenaltyLnsInterestIdInterest = value;
    }

    /**
     * Gets the value of the outPenaltyPercInterestSupplyWorkCurFxIntScalDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutPenaltyPercInterestSupplyWorkCurFxIntScalDt() {
        return outPenaltyPercInterestSupplyWorkCurFxIntScalDt;
    }

    /**
     * Sets the value of the outPenaltyPercInterestSupplyWorkCurFxIntScalDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutPenaltyPercInterestSupplyWorkCurFxIntScalDt(XMLGregorianCalendar value) {
        this.outPenaltyPercInterestSupplyWorkCurFxIntScalDt = value;
    }

    /**
     * Gets the value of the outPenaltyPercInterestSupplyWorkFixedInterestPrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutPenaltyPercInterestSupplyWorkFixedInterestPrc() {
        return outPenaltyPercInterestSupplyWorkFixedInterestPrc;
    }

    /**
     * Sets the value of the outPenaltyPercInterestSupplyWorkFixedInterestPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutPenaltyPercInterestSupplyWorkFixedInterestPrc(BigDecimal value) {
        this.outPenaltyPercInterestSupplyWorkFixedInterestPrc = value;
    }

    /**
     * Gets the value of the outPenaltyPercIntScalePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutPenaltyPercIntScalePercentage() {
        return outPenaltyPercIntScalePercentage;
    }

    /**
     * Sets the value of the outPenaltyPercIntScalePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutPenaltyPercIntScalePercentage(BigDecimal value) {
        this.outPenaltyPercIntScalePercentage = value;
    }

    /**
     * Gets the value of the outPenaltyPercIntScaleValidityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutPenaltyPercIntScaleValidityDate() {
        return outPenaltyPercIntScaleValidityDate;
    }

    /**
     * Sets the value of the outPenaltyPercIntScaleValidityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutPenaltyPercIntScaleValidityDate(XMLGregorianCalendar value) {
        this.outPenaltyPercIntScaleValidityDate = value;
    }

    /**
     * Gets the value of the outPreviousFixedLnsInterestDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPreviousFixedLnsInterestDescription() {
        return outPreviousFixedLnsInterestDescription;
    }

    /**
     * Sets the value of the outPreviousFixedLnsInterestDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPreviousFixedLnsInterestDescription(String value) {
        this.outPreviousFixedLnsInterestDescription = value;
    }

    /**
     * Gets the value of the outPreviousFixedLnsInterestIdInterest property.
     * 
     */
    public int getOutPreviousFixedLnsInterestIdInterest() {
        return outPreviousFixedLnsInterestIdInterest;
    }

    /**
     * Sets the value of the outPreviousFixedLnsInterestIdInterest property.
     * 
     */
    public void setOutPreviousFixedLnsInterestIdInterest(int value) {
        this.outPreviousFixedLnsInterestIdInterest = value;
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
     * Gets the value of the outProductProductType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductProductType() {
        return outProductProductType;
    }

    /**
     * Sets the value of the outProductProductType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductProductType(String value) {
        this.outProductProductType = value;
    }

    /**
     * Gets the value of the outProductValidityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutProductValidityDate() {
        return outProductValidityDate;
    }

    /**
     * Sets the value of the outProductValidityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutProductValidityDate(XMLGregorianCalendar value) {
        this.outProductValidityDate = value;
    }

    /**
     * Gets the value of the outPurposeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPurposeGenericDetailDescription() {
        return outPurposeGenericDetailDescription;
    }

    /**
     * Sets the value of the outPurposeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPurposeGenericDetailDescription(String value) {
        this.outPurposeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outPurposeGenericDetailSerialNum property.
     * 
     */
    public int getOutPurposeGenericDetailSerialNum() {
        return outPurposeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outPurposeGenericDetailSerialNum property.
     * 
     */
    public void setOutPurposeGenericDetailSerialNum(int value) {
        this.outPurposeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outSalePointGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSalePointGenericDetailDescription() {
        return outSalePointGenericDetailDescription;
    }

    /**
     * Sets the value of the outSalePointGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSalePointGenericDetailDescription(String value) {
        this.outSalePointGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outSalePointGenericDetailSerialNum property.
     * 
     */
    public int getOutSalePointGenericDetailSerialNum() {
        return outSalePointGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outSalePointGenericDetailSerialNum property.
     * 
     */
    public void setOutSalePointGenericDetailSerialNum(int value) {
        this.outSalePointGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outSellerGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSellerGenericDetailDescription() {
        return outSellerGenericDetailDescription;
    }

    /**
     * Sets the value of the outSellerGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSellerGenericDetailDescription(String value) {
        this.outSellerGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outSellerGenericDetailSerialNum property.
     * 
     */
    public int getOutSellerGenericDetailSerialNum() {
        return outSellerGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outSellerGenericDetailSerialNum property.
     * 
     */
    public void setOutSellerGenericDetailSerialNum(int value) {
        this.outSellerGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outSubsidyOrderDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSubsidyOrderDescription() {
        return outSubsidyOrderDescription;
    }

    /**
     * Sets the value of the outSubsidyOrderDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSubsidyOrderDescription(String value) {
        this.outSubsidyOrderDescription = value;
    }

    /**
     * Gets the value of the outSubsidyOrderExpiryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSubsidyOrderExpiryDt() {
        return outSubsidyOrderExpiryDt;
    }

    /**
     * Sets the value of the outSubsidyOrderExpiryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSubsidyOrderExpiryDt(XMLGregorianCalendar value) {
        this.outSubsidyOrderExpiryDt = value;
    }

    /**
     * Gets the value of the outSubsidyOrderIdSubsidy property.
     * 
     */
    public int getOutSubsidyOrderIdSubsidy() {
        return outSubsidyOrderIdSubsidy;
    }

    /**
     * Sets the value of the outSubsidyOrderIdSubsidy property.
     * 
     */
    public void setOutSubsidyOrderIdSubsidy(int value) {
        this.outSubsidyOrderIdSubsidy = value;
    }

    /**
     * Gets the value of the outSubsidyOrderLnsEffectiveDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSubsidyOrderLnsEffectiveDt() {
        return outSubsidyOrderLnsEffectiveDt;
    }

    /**
     * Sets the value of the outSubsidyOrderLnsEffectiveDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSubsidyOrderLnsEffectiveDt(XMLGregorianCalendar value) {
        this.outSubsidyOrderLnsEffectiveDt = value;
    }

    /**
     * Gets the value of the outSubsidyOrderLnsExpiryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSubsidyOrderLnsExpiryDt() {
        return outSubsidyOrderLnsExpiryDt;
    }

    /**
     * Sets the value of the outSubsidyOrderLnsExpiryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSubsidyOrderLnsExpiryDt(XMLGregorianCalendar value) {
        this.outSubsidyOrderLnsExpiryDt = value;
    }

    /**
     * Gets the value of the outSubsidyOrderSubsDurationPrd property.
     * 
     */
    public short getOutSubsidyOrderSubsDurationPrd() {
        return outSubsidyOrderSubsDurationPrd;
    }

    /**
     * Sets the value of the outSubsidyOrderSubsDurationPrd property.
     * 
     */
    public void setOutSubsidyOrderSubsDurationPrd(short value) {
        this.outSubsidyOrderSubsDurationPrd = value;
    }

    /**
     * Gets the value of the outTotalSubsidyIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalSubsidyIefSuppliedAmount() {
        return outTotalSubsidyIefSuppliedAmount;
    }

    /**
     * Sets the value of the outTotalSubsidyIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalSubsidyIefSuppliedAmount(BigDecimal value) {
        this.outTotalSubsidyIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the outTotAvailableLimitIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotAvailableLimitIefSuppliedAmount() {
        return outTotAvailableLimitIefSuppliedAmount;
    }

    /**
     * Sets the value of the outTotAvailableLimitIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotAvailableLimitIefSuppliedAmount(BigDecimal value) {
        this.outTotAvailableLimitIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the outTotUtilizedLimitIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotUtilizedLimitIefSuppliedAmount() {
        return outTotUtilizedLimitIefSuppliedAmount;
    }

    /**
     * Sets the value of the outTotUtilizedLimitIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotUtilizedLimitIefSuppliedAmount(BigDecimal value) {
        this.outTotUtilizedLimitIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the outTransitionFlgIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTransitionFlgIefSuppliedFlag() {
        return outTransitionFlgIefSuppliedFlag;
    }

    /**
     * Sets the value of the outTransitionFlgIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTransitionFlgIefSuppliedFlag(String value) {
        this.outTransitionFlgIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outTransLoanAccountAccOpenDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTransLoanAccountAccOpenDt() {
        return outTransLoanAccountAccOpenDt;
    }

    /**
     * Sets the value of the outTransLoanAccountAccOpenDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTransLoanAccountAccOpenDt(XMLGregorianCalendar value) {
        this.outTransLoanAccountAccOpenDt = value;
    }

    /**
     * Gets the value of the outTransLoanAccountCurFxIntExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTransLoanAccountCurFxIntExpDt() {
        return outTransLoanAccountCurFxIntExpDt;
    }

    /**
     * Sets the value of the outTransLoanAccountCurFxIntExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTransLoanAccountCurFxIntExpDt(XMLGregorianCalendar value) {
        this.outTransLoanAccountCurFxIntExpDt = value;
    }

    /**
     * Gets the value of the outTransLoanAccountDrawdownFstAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTransLoanAccountDrawdownFstAmn() {
        return outTransLoanAccountDrawdownFstAmn;
    }

    /**
     * Sets the value of the outTransLoanAccountDrawdownFstAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTransLoanAccountDrawdownFstAmn(BigDecimal value) {
        this.outTransLoanAccountDrawdownFstAmn = value;
    }

    /**
     * Gets the value of the outTransLoanAccountDrawdownFstDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTransLoanAccountDrawdownFstDt() {
        return outTransLoanAccountDrawdownFstDt;
    }

    /**
     * Sets the value of the outTransLoanAccountDrawdownFstDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTransLoanAccountDrawdownFstDt(XMLGregorianCalendar value) {
        this.outTransLoanAccountDrawdownFstDt = value;
    }

    /**
     * Gets the value of the outTransLoanAccountInstallNextDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTransLoanAccountInstallNextDt() {
        return outTransLoanAccountInstallNextDt;
    }

    /**
     * Sets the value of the outTransLoanAccountInstallNextDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTransLoanAccountInstallNextDt(XMLGregorianCalendar value) {
        this.outTransLoanAccountInstallNextDt = value;
    }

    /**
     * Gets the value of the outTransLoanAccountInstallPrevDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTransLoanAccountInstallPrevDt() {
        return outTransLoanAccountInstallPrevDt;
    }

    /**
     * Sets the value of the outTransLoanAccountInstallPrevDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTransLoanAccountInstallPrevDt(XMLGregorianCalendar value) {
        this.outTransLoanAccountInstallPrevDt = value;
    }

    /**
     * Gets the value of the outTransLoanAccountLstAprIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTransLoanAccountLstAprIntDbAmn() {
        return outTransLoanAccountLstAprIntDbAmn;
    }

    /**
     * Sets the value of the outTransLoanAccountLstAprIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTransLoanAccountLstAprIntDbAmn(BigDecimal value) {
        this.outTransLoanAccountLstAprIntDbAmn = value;
    }

    /**
     * Gets the value of the outTransLoanAccountLstAprYear property.
     * 
     */
    public short getOutTransLoanAccountLstAprYear() {
        return outTransLoanAccountLstAprYear;
    }

    /**
     * Sets the value of the outTransLoanAccountLstAprYear property.
     * 
     */
    public void setOutTransLoanAccountLstAprYear(short value) {
        this.outTransLoanAccountLstAprYear = value;
    }

    /**
     * Gets the value of the outTransLoanAccountLstAugIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTransLoanAccountLstAugIntDbAmn() {
        return outTransLoanAccountLstAugIntDbAmn;
    }

    /**
     * Sets the value of the outTransLoanAccountLstAugIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTransLoanAccountLstAugIntDbAmn(BigDecimal value) {
        this.outTransLoanAccountLstAugIntDbAmn = value;
    }

    /**
     * Gets the value of the outTransLoanAccountLstAugYear property.
     * 
     */
    public short getOutTransLoanAccountLstAugYear() {
        return outTransLoanAccountLstAugYear;
    }

    /**
     * Sets the value of the outTransLoanAccountLstAugYear property.
     * 
     */
    public void setOutTransLoanAccountLstAugYear(short value) {
        this.outTransLoanAccountLstAugYear = value;
    }

    /**
     * Gets the value of the outTransLoanAccountLstDecIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTransLoanAccountLstDecIntDbAmn() {
        return outTransLoanAccountLstDecIntDbAmn;
    }

    /**
     * Sets the value of the outTransLoanAccountLstDecIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTransLoanAccountLstDecIntDbAmn(BigDecimal value) {
        this.outTransLoanAccountLstDecIntDbAmn = value;
    }

    /**
     * Gets the value of the outTransLoanAccountLstDecYear property.
     * 
     */
    public short getOutTransLoanAccountLstDecYear() {
        return outTransLoanAccountLstDecYear;
    }

    /**
     * Sets the value of the outTransLoanAccountLstDecYear property.
     * 
     */
    public void setOutTransLoanAccountLstDecYear(short value) {
        this.outTransLoanAccountLstDecYear = value;
    }

    /**
     * Gets the value of the outTransLoanAccountLstFebIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTransLoanAccountLstFebIntDbAmn() {
        return outTransLoanAccountLstFebIntDbAmn;
    }

    /**
     * Sets the value of the outTransLoanAccountLstFebIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTransLoanAccountLstFebIntDbAmn(BigDecimal value) {
        this.outTransLoanAccountLstFebIntDbAmn = value;
    }

    /**
     * Gets the value of the outTransLoanAccountLstFebYear property.
     * 
     */
    public short getOutTransLoanAccountLstFebYear() {
        return outTransLoanAccountLstFebYear;
    }

    /**
     * Sets the value of the outTransLoanAccountLstFebYear property.
     * 
     */
    public void setOutTransLoanAccountLstFebYear(short value) {
        this.outTransLoanAccountLstFebYear = value;
    }

    /**
     * Gets the value of the outTransLoanAccountLstJanIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTransLoanAccountLstJanIntDbAmn() {
        return outTransLoanAccountLstJanIntDbAmn;
    }

    /**
     * Sets the value of the outTransLoanAccountLstJanIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTransLoanAccountLstJanIntDbAmn(BigDecimal value) {
        this.outTransLoanAccountLstJanIntDbAmn = value;
    }

    /**
     * Gets the value of the outTransLoanAccountLstJanYear property.
     * 
     */
    public short getOutTransLoanAccountLstJanYear() {
        return outTransLoanAccountLstJanYear;
    }

    /**
     * Sets the value of the outTransLoanAccountLstJanYear property.
     * 
     */
    public void setOutTransLoanAccountLstJanYear(short value) {
        this.outTransLoanAccountLstJanYear = value;
    }

    /**
     * Gets the value of the outTransLoanAccountLstJulIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTransLoanAccountLstJulIntDbAmn() {
        return outTransLoanAccountLstJulIntDbAmn;
    }

    /**
     * Sets the value of the outTransLoanAccountLstJulIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTransLoanAccountLstJulIntDbAmn(BigDecimal value) {
        this.outTransLoanAccountLstJulIntDbAmn = value;
    }

    /**
     * Gets the value of the outTransLoanAccountLstJulYear property.
     * 
     */
    public short getOutTransLoanAccountLstJulYear() {
        return outTransLoanAccountLstJulYear;
    }

    /**
     * Sets the value of the outTransLoanAccountLstJulYear property.
     * 
     */
    public void setOutTransLoanAccountLstJulYear(short value) {
        this.outTransLoanAccountLstJulYear = value;
    }

    /**
     * Gets the value of the outTransLoanAccountLstJunIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTransLoanAccountLstJunIntDbAmn() {
        return outTransLoanAccountLstJunIntDbAmn;
    }

    /**
     * Sets the value of the outTransLoanAccountLstJunIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTransLoanAccountLstJunIntDbAmn(BigDecimal value) {
        this.outTransLoanAccountLstJunIntDbAmn = value;
    }

    /**
     * Gets the value of the outTransLoanAccountLstJunYear property.
     * 
     */
    public short getOutTransLoanAccountLstJunYear() {
        return outTransLoanAccountLstJunYear;
    }

    /**
     * Sets the value of the outTransLoanAccountLstJunYear property.
     * 
     */
    public void setOutTransLoanAccountLstJunYear(short value) {
        this.outTransLoanAccountLstJunYear = value;
    }

    /**
     * Gets the value of the outTransLoanAccountLstMarIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTransLoanAccountLstMarIntDbAmn() {
        return outTransLoanAccountLstMarIntDbAmn;
    }

    /**
     * Sets the value of the outTransLoanAccountLstMarIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTransLoanAccountLstMarIntDbAmn(BigDecimal value) {
        this.outTransLoanAccountLstMarIntDbAmn = value;
    }

    /**
     * Gets the value of the outTransLoanAccountLstMarYear property.
     * 
     */
    public short getOutTransLoanAccountLstMarYear() {
        return outTransLoanAccountLstMarYear;
    }

    /**
     * Sets the value of the outTransLoanAccountLstMarYear property.
     * 
     */
    public void setOutTransLoanAccountLstMarYear(short value) {
        this.outTransLoanAccountLstMarYear = value;
    }

    /**
     * Gets the value of the outTransLoanAccountLstMayIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTransLoanAccountLstMayIntDbAmn() {
        return outTransLoanAccountLstMayIntDbAmn;
    }

    /**
     * Sets the value of the outTransLoanAccountLstMayIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTransLoanAccountLstMayIntDbAmn(BigDecimal value) {
        this.outTransLoanAccountLstMayIntDbAmn = value;
    }

    /**
     * Gets the value of the outTransLoanAccountLstMayYear property.
     * 
     */
    public short getOutTransLoanAccountLstMayYear() {
        return outTransLoanAccountLstMayYear;
    }

    /**
     * Sets the value of the outTransLoanAccountLstMayYear property.
     * 
     */
    public void setOutTransLoanAccountLstMayYear(short value) {
        this.outTransLoanAccountLstMayYear = value;
    }

    /**
     * Gets the value of the outTransLoanAccountLstNovIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTransLoanAccountLstNovIntDbAmn() {
        return outTransLoanAccountLstNovIntDbAmn;
    }

    /**
     * Sets the value of the outTransLoanAccountLstNovIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTransLoanAccountLstNovIntDbAmn(BigDecimal value) {
        this.outTransLoanAccountLstNovIntDbAmn = value;
    }

    /**
     * Gets the value of the outTransLoanAccountLstNovYear property.
     * 
     */
    public short getOutTransLoanAccountLstNovYear() {
        return outTransLoanAccountLstNovYear;
    }

    /**
     * Sets the value of the outTransLoanAccountLstNovYear property.
     * 
     */
    public void setOutTransLoanAccountLstNovYear(short value) {
        this.outTransLoanAccountLstNovYear = value;
    }

    /**
     * Gets the value of the outTransLoanAccountLstOctIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTransLoanAccountLstOctIntDbAmn() {
        return outTransLoanAccountLstOctIntDbAmn;
    }

    /**
     * Sets the value of the outTransLoanAccountLstOctIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTransLoanAccountLstOctIntDbAmn(BigDecimal value) {
        this.outTransLoanAccountLstOctIntDbAmn = value;
    }

    /**
     * Gets the value of the outTransLoanAccountLstOctYear property.
     * 
     */
    public short getOutTransLoanAccountLstOctYear() {
        return outTransLoanAccountLstOctYear;
    }

    /**
     * Sets the value of the outTransLoanAccountLstOctYear property.
     * 
     */
    public void setOutTransLoanAccountLstOctYear(short value) {
        this.outTransLoanAccountLstOctYear = value;
    }

    /**
     * Gets the value of the outTransLoanAccountLstSepIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTransLoanAccountLstSepIntDbAmn() {
        return outTransLoanAccountLstSepIntDbAmn;
    }

    /**
     * Sets the value of the outTransLoanAccountLstSepIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTransLoanAccountLstSepIntDbAmn(BigDecimal value) {
        this.outTransLoanAccountLstSepIntDbAmn = value;
    }

    /**
     * Gets the value of the outTransLoanAccountLstSepYear property.
     * 
     */
    public short getOutTransLoanAccountLstSepYear() {
        return outTransLoanAccountLstSepYear;
    }

    /**
     * Sets the value of the outTransLoanAccountLstSepYear property.
     * 
     */
    public void setOutTransLoanAccountLstSepYear(short value) {
        this.outTransLoanAccountLstSepYear = value;
    }

    /**
     * Gets the value of the outTransLoanAccountMoratorN128Rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTransLoanAccountMoratorN128Rate() {
        return outTransLoanAccountMoratorN128Rate;
    }

    /**
     * Sets the value of the outTransLoanAccountMoratorN128Rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTransLoanAccountMoratorN128Rate(BigDecimal value) {
        this.outTransLoanAccountMoratorN128Rate = value;
    }

    /**
     * Gets the value of the outTransLoanAccountMoratorNrmRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTransLoanAccountMoratorNrmRate() {
        return outTransLoanAccountMoratorNrmRate;
    }

    /**
     * Sets the value of the outTransLoanAccountMoratorNrmRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTransLoanAccountMoratorNrmRate(BigDecimal value) {
        this.outTransLoanAccountMoratorNrmRate = value;
    }

    /**
     * Gets the value of the outTransLoanAccountMoratorSprRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTransLoanAccountMoratorSprRate() {
        return outTransLoanAccountMoratorSprRate;
    }

    /**
     * Sets the value of the outTransLoanAccountMoratorSprRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTransLoanAccountMoratorSprRate(BigDecimal value) {
        this.outTransLoanAccountMoratorSprRate = value;
    }

    /**
     * Gets the value of the outTransLoanAccountMpStartCapAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTransLoanAccountMpStartCapAmn() {
        return outTransLoanAccountMpStartCapAmn;
    }

    /**
     * Sets the value of the outTransLoanAccountMpStartCapAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTransLoanAccountMpStartCapAmn(BigDecimal value) {
        this.outTransLoanAccountMpStartCapAmn = value;
    }

    /**
     * Gets the value of the outTransLoanAccountOldAccountCd property.
     * 
     */
    public short getOutTransLoanAccountOldAccountCd() {
        return outTransLoanAccountOldAccountCd;
    }

    /**
     * Sets the value of the outTransLoanAccountOldAccountCd property.
     * 
     */
    public void setOutTransLoanAccountOldAccountCd(short value) {
        this.outTransLoanAccountOldAccountCd = value;
    }

    /**
     * Gets the value of the outTransLoanAccountOldAccountNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTransLoanAccountOldAccountNum() {
        return outTransLoanAccountOldAccountNum;
    }

    /**
     * Sets the value of the outTransLoanAccountOldAccountNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTransLoanAccountOldAccountNum(String value) {
        this.outTransLoanAccountOldAccountNum = value;
    }

    /**
     * Gets the value of the outTransLoanAccountReqInstallSn property.
     * 
     */
    public short getOutTransLoanAccountReqInstallSn() {
        return outTransLoanAccountReqInstallSn;
    }

    /**
     * Sets the value of the outTransLoanAccountReqInstallSn property.
     * 
     */
    public void setOutTransLoanAccountReqInstallSn(short value) {
        this.outTransLoanAccountReqInstallSn = value;
    }

    /**
     * Gets the value of the outTransLoanAccountTotCapAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTransLoanAccountTotCapAmn() {
        return outTransLoanAccountTotCapAmn;
    }

    /**
     * Sets the value of the outTransLoanAccountTotCapAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTransLoanAccountTotCapAmn(BigDecimal value) {
        this.outTransLoanAccountTotCapAmn = value;
    }

    /**
     * Gets the value of the outTransLoanAccountTotComInCcAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTransLoanAccountTotComInCcAmn() {
        return outTransLoanAccountTotComInCcAmn;
    }

    /**
     * Sets the value of the outTransLoanAccountTotComInCcAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTransLoanAccountTotComInCcAmn(BigDecimal value) {
        this.outTransLoanAccountTotComInCcAmn = value;
    }

    /**
     * Gets the value of the outTransLoanAccountTotCommissionAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTransLoanAccountTotCommissionAmn() {
        return outTransLoanAccountTotCommissionAmn;
    }

    /**
     * Sets the value of the outTransLoanAccountTotCommissionAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTransLoanAccountTotCommissionAmn(BigDecimal value) {
        this.outTransLoanAccountTotCommissionAmn = value;
    }

    /**
     * Gets the value of the outTransLoanAccountTotConfirmAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTransLoanAccountTotConfirmAmn() {
        return outTransLoanAccountTotConfirmAmn;
    }

    /**
     * Sets the value of the outTransLoanAccountTotConfirmAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTransLoanAccountTotConfirmAmn(BigDecimal value) {
        this.outTransLoanAccountTotConfirmAmn = value;
    }

    /**
     * Gets the value of the outTransLoanAccountTotDrawdownAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTransLoanAccountTotDrawdownAmn() {
        return outTransLoanAccountTotDrawdownAmn;
    }

    /**
     * Sets the value of the outTransLoanAccountTotDrawdownAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTransLoanAccountTotDrawdownAmn(BigDecimal value) {
        this.outTransLoanAccountTotDrawdownAmn = value;
    }

    /**
     * Gets the value of the outTransLoanAccountTotExpenseAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTransLoanAccountTotExpenseAmn() {
        return outTransLoanAccountTotExpenseAmn;
    }

    /**
     * Sets the value of the outTransLoanAccountTotExpenseAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTransLoanAccountTotExpenseAmn(BigDecimal value) {
        this.outTransLoanAccountTotExpenseAmn = value;
    }

    /**
     * Gets the value of the outTransLoanAccountTotExpInCcAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTransLoanAccountTotExpInCcAmn() {
        return outTransLoanAccountTotExpInCcAmn;
    }

    /**
     * Sets the value of the outTransLoanAccountTotExpInCcAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTransLoanAccountTotExpInCcAmn(BigDecimal value) {
        this.outTransLoanAccountTotExpInCcAmn = value;
    }

    /**
     * Gets the value of the outTransLoanAccountTotNrmIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTransLoanAccountTotNrmIntAmn() {
        return outTransLoanAccountTotNrmIntAmn;
    }

    /**
     * Sets the value of the outTransLoanAccountTotNrmIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTransLoanAccountTotNrmIntAmn(BigDecimal value) {
        this.outTransLoanAccountTotNrmIntAmn = value;
    }

    /**
     * Gets the value of the outTransLoanAccountTotPnlIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTransLoanAccountTotPnlIntAmn() {
        return outTransLoanAccountTotPnlIntAmn;
    }

    /**
     * Sets the value of the outTransLoanAccountTotPnlIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTransLoanAccountTotPnlIntAmn(BigDecimal value) {
        this.outTransLoanAccountTotPnlIntAmn = value;
    }

    /**
     * Gets the value of the outTransLoanAccountTotPubCommAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTransLoanAccountTotPubCommAmn() {
        return outTransLoanAccountTotPubCommAmn;
    }

    /**
     * Sets the value of the outTransLoanAccountTotPubCommAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTransLoanAccountTotPubCommAmn(BigDecimal value) {
        this.outTransLoanAccountTotPubCommAmn = value;
    }

    /**
     * Gets the value of the outTransLoanAccountTotSubsIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTransLoanAccountTotSubsIntAmn() {
        return outTransLoanAccountTotSubsIntAmn;
    }

    /**
     * Sets the value of the outTransLoanAccountTotSubsIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTransLoanAccountTotSubsIntAmn(BigDecimal value) {
        this.outTransLoanAccountTotSubsIntAmn = value;
    }

    /**
     * Gets the value of the outTransLoanAccountTotThrdprtAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTransLoanAccountTotThrdprtAmn() {
        return outTransLoanAccountTotThrdprtAmn;
    }

    /**
     * Sets the value of the outTransLoanAccountTotThrdprtAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTransLoanAccountTotThrdprtAmn(BigDecimal value) {
        this.outTransLoanAccountTotThrdprtAmn = value;
    }

    /**
     * Gets the value of the outUnionCustomerCustId property.
     * 
     */
    public int getOutUnionCustomerCustId() {
        return outUnionCustomerCustId;
    }

    /**
     * Sets the value of the outUnionCustomerCustId property.
     * 
     */
    public void setOutUnionCustomerCustId(int value) {
        this.outUnionCustomerCustId = value;
    }

    /**
     * Gets the value of the outUnionCustomerListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUnionCustomerListSetDescription() {
        return outUnionCustomerListSetDescription;
    }

    /**
     * Sets the value of the outUnionCustomerListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUnionCustomerListSetDescription(String value) {
        this.outUnionCustomerListSetDescription = value;
    }

    /**
     * Gets the value of the outWithoutTunelInterestCalculationWorkTempInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutWithoutTunelInterestCalculationWorkTempInterestRate() {
        return outWithoutTunelInterestCalculationWorkTempInterestRate;
    }

    /**
     * Sets the value of the outWithoutTunelInterestCalculationWorkTempInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutWithoutTunelInterestCalculationWorkTempInterestRate(BigDecimal value) {
        this.outWithoutTunelInterestCalculationWorkTempInterestRate = value;
    }

    /**
     * Gets the value of the outWithTunelInterestCalculationWorkTempInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutWithTunelInterestCalculationWorkTempInterestRate() {
        return outWithTunelInterestCalculationWorkTempInterestRate;
    }

    /**
     * Sets the value of the outWithTunelInterestCalculationWorkTempInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutWithTunelInterestCalculationWorkTempInterestRate(BigDecimal value) {
        this.outWithTunelInterestCalculationWorkTempInterestRate = value;
    }

    /**
     * Gets the value of the outIpfFlagIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIpfFlagIefSuppliedFlag() {
        return outIpfFlagIefSuppliedFlag;
    }

    /**
     * Sets the value of the outIpfFlagIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIpfFlagIefSuppliedFlag(String value) {
        this.outIpfFlagIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outGrpCollection property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpCollection }
     *     
     */
    public ArrayOfOutGrpCollection getOutGrpCollection() {
        return outGrpCollection;
    }

    /**
     * Sets the value of the outGrpCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpCollection }
     *     
     */
    public void setOutGrpCollection(ArrayOfOutGrpCollection value) {
        this.outGrpCollection = value;
    }

    /**
     * Gets the value of the outGrpLnsAddInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpLnsAddInfo }
     *     
     */
    public ArrayOfOutGrpLnsAddInfo getOutGrpLnsAddInfo() {
        return outGrpLnsAddInfo;
    }

    /**
     * Sets the value of the outGrpLnsAddInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpLnsAddInfo }
     *     
     */
    public void setOutGrpLnsAddInfo(ArrayOfOutGrpLnsAddInfo value) {
        this.outGrpLnsAddInfo = value;
    }

    /**
     * Gets the value of the outGrpLoanAddInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpLoanAddInfo }
     *     
     */
    public ArrayOfOutGrpLoanAddInfo getOutGrpLoanAddInfo() {
        return outGrpLoanAddInfo;
    }

    /**
     * Sets the value of the outGrpLoanAddInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpLoanAddInfo }
     *     
     */
    public void setOutGrpLoanAddInfo(ArrayOfOutGrpLoanAddInfo value) {
        this.outGrpLoanAddInfo = value;
    }

    /**
     * Gets the value of the outGrpLoanSubsidyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpLoanSubsidyInfo }
     *     
     */
    public ArrayOfOutGrpLoanSubsidyInfo getOutGrpLoanSubsidyInfo() {
        return outGrpLoanSubsidyInfo;
    }

    /**
     * Sets the value of the outGrpLoanSubsidyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpLoanSubsidyInfo }
     *     
     */
    public void setOutGrpLoanSubsidyInfo(ArrayOfOutGrpLoanSubsidyInfo value) {
        this.outGrpLoanSubsidyInfo = value;
    }

    /**
     * Gets the value of the outGrpLog property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpLog }
     *     
     */
    public ArrayOfOutGrpLog getOutGrpLog() {
        return outGrpLog;
    }

    /**
     * Sets the value of the outGrpLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpLog }
     *     
     */
    public void setOutGrpLog(ArrayOfOutGrpLog value) {
        this.outGrpLog = value;
    }

    /**
     * Gets the value of the outGrpPayroll property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpPayroll }
     *     
     */
    public ArrayOfOutGrpPayroll getOutGrpPayroll() {
        return outGrpPayroll;
    }

    /**
     * Sets the value of the outGrpPayroll property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpPayroll }
     *     
     */
    public void setOutGrpPayroll(ArrayOfOutGrpPayroll value) {
        this.outGrpPayroll = value;
    }

    /**
     * Gets the value of the outGrpPrevLnsAccs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpPrevLnsAccs }
     *     
     */
    public ArrayOfOutGrpPrevLnsAccs getOutGrpPrevLnsAccs() {
        return outGrpPrevLnsAccs;
    }

    /**
     * Sets the value of the outGrpPrevLnsAccs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpPrevLnsAccs }
     *     
     */
    public void setOutGrpPrevLnsAccs(ArrayOfOutGrpPrevLnsAccs value) {
        this.outGrpPrevLnsAccs = value;
    }

    /**
     * Gets the value of the outGrpReply property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpReply }
     *     
     */
    public ArrayOfOutGrpReply getOutGrpReply() {
        return outGrpReply;
    }

    /**
     * Sets the value of the outGrpReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpReply }
     *     
     */
    public void setOutGrpReply(ArrayOfOutGrpReply value) {
        this.outGrpReply = value;
    }

    /**
     * Gets the value of the outGrpSendCollection property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpSendCollection }
     *     
     */
    public ArrayOfOutGrpSendCollection getOutGrpSendCollection() {
        return outGrpSendCollection;
    }

    /**
     * Sets the value of the outGrpSendCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpSendCollection }
     *     
     */
    public void setOutGrpSendCollection(ArrayOfOutGrpSendCollection value) {
        this.outGrpSendCollection = value;
    }

    /**
     * Gets the value of the outGrpMediators property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfL0401VOutGrpMediatorsItem }
     *     
     */
    public ArrayOfL0401VOutGrpMediatorsItem getOutGrpMediators() {
        return outGrpMediators;
    }

    /**
     * Sets the value of the outGrpMediators property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfL0401VOutGrpMediatorsItem }
     *     
     */
    public void setOutGrpMediators(ArrayOfL0401VOutGrpMediatorsItem value) {
        this.outGrpMediators = value;
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

}
