
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PRT098VOutGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PRT098VOutGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpOutGrm04LnsAmntsLoanAccountInfoPositiveAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm04LnsAmntsLoanAccountInfoUnclearAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm04LnsAmntsLoanAccountInfoBlockedAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm04LnsAmntsLoanAccountInfoDormantAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm04LnsFixedLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm04LnsFixedLnsInterestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrm04LnsFloatLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrm04LnsFloatLnsInterestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrm04N128InterestSupplyWorkFixedInterestPrc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm04PenaltyInterestSupplyWorkFixedInterestPrc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm04SpreadInterestSupplyWorkFixedInterestPrc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm04NormalInterestInterestSupplyWorkFixedInterestPrc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm04TotRateInterestSupplyWorkFixedInterestPrc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm03DepDepositAccountDepositType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrm03DepDepositAccountAccrCrInterest" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm03DepDepositAccountAccrDbInterest" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm03DepDepositAccountAccountLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm03DepIbanCharSuppliedChar37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrm03WithdrawalAvailDepositAccountAvailableBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm03ChequebookDepositChequeBookFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmDomesticCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmDomesticCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSelectedCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSelectedCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmBalancesProfitsAccountWorkBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmBalancesProfitsAccountWorkBalanceLc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmBalancesProfitsAccountWorkBalanceRequested" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm03DepDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrm03DepDepositAccountAvailableBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm03DepDepositAccountBlockedBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm03DepDepositAccountBookBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm03DepDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrm03DepDepositAccountEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrm03DepDepositAccountForecastBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm03DepDepositAccountUnclearBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm04LnsInfoLoanAccountAccLimitAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm04LnsInfoLoanAccountAccMechanism" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrm04LnsInfoLoanAccountAccSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrm04LnsInfoLoanAccountAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrm04LnsInfoLoanAccountAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrm04LnsInfoLoanAccountLoanStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrm04LnsLoanAccountDrvWorkAccBankBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm04LnsLoanAccountDrvWorkAccountBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm04LnsLoanAccountDrvWorkLstYrIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm04LnsLoanAccountDrvWorkNrmAccountBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm04LnsLoanAccountDrvWorkOvAccountBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm04LnsLoanAccountDrvWorkTotPaymentAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm14LgLgAccountAccLimitAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm14LgLgAccountAccSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrm14LgLgAccountAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrm14LgLgAccountCommissionBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm14LgLgAccountDefaultAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm14LgLgAccountExpenseBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm14LgLgAccountExpirationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrm14LgLgAccountIssuanceJustific" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrm14LgLgAccountLgAmountBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm14LgLgAccountLgInitialAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm14LgLgAccountObligationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrm14LgLgAccountRqDefaultAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm18ScrTotCustomerPositionTotalsScrAkEvalTot" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm18ScrTotCustomerPositionTotalsScrAkShrTot" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm18ScrTotCustomerPositionTotalsScrAkddTot" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm18ScrTotCustomerPositionTotalsScrBondTot" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm18ScrTotCustomerPositionTotalsScrRepoTot" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm18ScrTraccountAccKind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrm18ScrTraccountEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrm18ScrTraccountSecuritiesType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrm19AgrAgreementAccKind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrm19AgrAgreementAgrBlockedLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm19AgrAgreementAgrLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm19AgrAgreementAgrLimitInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrm19AgrAgreementAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrm19AgrAgreementAgrSigningDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrm19AgrAgreementAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrm19AgrAgreementAgrStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrm19AgrAgreementAgrUtilisedLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrm19AgrAgreementAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmAccAgreementProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmAccAgreementProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmAccAgreementProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmColAccAvailIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmColAccUtilIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmColAccountCollateralLimitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmColAccountCollateralLimitsHistoryCnt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmColAccountCollateralLimitsIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmColAccountCollateralLimitsLiqLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmColAccountCollateralLimitsLiqUtil" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmColAccountCollateralLimitsNoLiqLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmColAccountCollateralLimitsNoLiqUtil" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmColAccountCollateralLimitsPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmColAgrBalAgreementAgrBlockedLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmColAgrBalAgreementAgrLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmColAgrBalAgreementAgrUtilisedLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmColAgreementCollateralLimitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmColAgreementCollateralLimitsHistoryCnt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmColAgreementCollateralLimitsIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmColAgreementCollateralLimitsLiqLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmColAgreementCollateralLimitsLiqUtil" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmColAgreementCollateralLimitsNoLiqLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmColAgreementCollateralLimitsNoLiqUtil" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmColAgreementCollateralLimitsPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmColCrlineCustomerCreditLineCrlineAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmColCrlineCustomerCreditLineEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmColCrlineCustomerCreditLineExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmColCrlineCustomerCreditLineHistoryCnt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmColCrlineCustomerCreditLineTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmColCrlineCustomerCreditLineUtilisedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmColCrlineGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmColCrlineGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmColMandatoryLoanWorkFlgsCollateralNecessary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmCustomerAlertMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmErrorAccountWorkErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmInfoProfitsAccountAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmInfoProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmInfoProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmInfoProfitsAccountAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmInfoProfitsAccountAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmInfoProfitsAccountAgrUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmInfoProfitsAccountAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmInfoProfitsAccountCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmInfoProfitsAccountDepAccNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmInfoProfitsAccountDepOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmInfoProfitsAccountLgAccSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmInfoProfitsAccountLgOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmInfoProfitsAccountLimitCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmInfoProfitsAccountLnsOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmInfoProfitsAccountLnsSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmInfoProfitsAccountLnsType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmInfoProfitsAccountMonotoringUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmInfoProfitsAccountMovementCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmInfoProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmInfoProfitsAccountProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmInfoProfitsAccountTrOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmInfoProfitsAccountTrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmInfoProfitsAccountTrType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmLimitCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmLimitCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmMonitoringUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmMonitoringUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmMovementCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmMovementCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmNameListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmOpeningUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmOpeningUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmProductProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmProductProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRT098VOutGrpItem", propOrder = {
    "outGrpOutGrm04LnsAmntsLoanAccountInfoPositiveAmn",
    "outGrpOutGrm04LnsAmntsLoanAccountInfoUnclearAmn",
    "outGrpOutGrm04LnsAmntsLoanAccountInfoBlockedAmn",
    "outGrpOutGrm04LnsAmntsLoanAccountInfoDormantAmn",
    "outGrpOutGrm04LnsFixedLnsInterestIdInterest",
    "outGrpOutGrm04LnsFixedLnsInterestDescription",
    "outGrpOutGrm04LnsFloatLnsInterestIdInterest",
    "outGrpOutGrm04LnsFloatLnsInterestDescription",
    "outGrpOutGrm04N128InterestSupplyWorkFixedInterestPrc",
    "outGrpOutGrm04PenaltyInterestSupplyWorkFixedInterestPrc",
    "outGrpOutGrm04SpreadInterestSupplyWorkFixedInterestPrc",
    "outGrpOutGrm04NormalInterestInterestSupplyWorkFixedInterestPrc",
    "outGrpOutGrm04TotRateInterestSupplyWorkFixedInterestPrc",
    "outGrpOutGrm03DepDepositAccountDepositType",
    "outGrpOutGrm03DepDepositAccountAccrCrInterest",
    "outGrpOutGrm03DepDepositAccountAccrDbInterest",
    "outGrpOutGrm03DepDepositAccountAccountLimit",
    "outGrpOutGrm03DepIbanCharSuppliedChar37",
    "outGrpOutGrm03WithdrawalAvailDepositAccountAvailableBalance",
    "outGrpOutGrm03ChequebookDepositChequeBookFlag",
    "outGrpOutGrmDomesticCurrencyIdCurrency",
    "outGrpOutGrmDomesticCurrencyShortDescr",
    "outGrpOutGrmSelectedCurrencyIdCurrency",
    "outGrpOutGrmSelectedCurrencyShortDescr",
    "outGrpOutGrmBalancesProfitsAccountWorkBalance",
    "outGrpOutGrmBalancesProfitsAccountWorkBalanceLc",
    "outGrpOutGrmBalancesProfitsAccountWorkBalanceRequested",
    "outGrpOutGrm03DepDepositAccountAccountNumber",
    "outGrpOutGrm03DepDepositAccountAvailableBalance",
    "outGrpOutGrm03DepDepositAccountBlockedBalance",
    "outGrpOutGrm03DepDepositAccountBookBalance",
    "outGrpOutGrm03DepDepositAccountCDigit",
    "outGrpOutGrm03DepDepositAccountEntryStatus",
    "outGrpOutGrm03DepDepositAccountForecastBalance",
    "outGrpOutGrm03DepDepositAccountUnclearBalance",
    "outGrpOutGrm04LnsInfoLoanAccountAccLimitAmn",
    "outGrpOutGrm04LnsInfoLoanAccountAccMechanism",
    "outGrpOutGrm04LnsInfoLoanAccountAccSn",
    "outGrpOutGrm04LnsInfoLoanAccountAccStatus",
    "outGrpOutGrm04LnsInfoLoanAccountAccType",
    "outGrpOutGrm04LnsInfoLoanAccountLoanStatus",
    "outGrpOutGrm04LnsLoanAccountDrvWorkAccBankBal",
    "outGrpOutGrm04LnsLoanAccountDrvWorkAccountBal",
    "outGrpOutGrm04LnsLoanAccountDrvWorkLstYrIntDbAmn",
    "outGrpOutGrm04LnsLoanAccountDrvWorkNrmAccountBal",
    "outGrpOutGrm04LnsLoanAccountDrvWorkOvAccountBal",
    "outGrpOutGrm04LnsLoanAccountDrvWorkTotPaymentAmn",
    "outGrpOutGrm14LgLgAccountAccLimitAmn",
    "outGrpOutGrm14LgLgAccountAccSn",
    "outGrpOutGrm14LgLgAccountAccStatus",
    "outGrpOutGrm14LgLgAccountCommissionBal",
    "outGrpOutGrm14LgLgAccountDefaultAmn",
    "outGrpOutGrm14LgLgAccountExpenseBal",
    "outGrpOutGrm14LgLgAccountExpirationType",
    "outGrpOutGrm14LgLgAccountIssuanceJustific",
    "outGrpOutGrm14LgLgAccountLgAmountBal",
    "outGrpOutGrm14LgLgAccountLgInitialAmn",
    "outGrpOutGrm14LgLgAccountObligationStatus",
    "outGrpOutGrm14LgLgAccountRqDefaultAmn",
    "outGrpOutGrm18ScrTotCustomerPositionTotalsScrAkEvalTot",
    "outGrpOutGrm18ScrTotCustomerPositionTotalsScrAkShrTot",
    "outGrpOutGrm18ScrTotCustomerPositionTotalsScrAkddTot",
    "outGrpOutGrm18ScrTotCustomerPositionTotalsScrBondTot",
    "outGrpOutGrm18ScrTotCustomerPositionTotalsScrRepoTot",
    "outGrpOutGrm18ScrTraccountAccKind",
    "outGrpOutGrm18ScrTraccountEntryStatus",
    "outGrpOutGrm18ScrTraccountSecuritiesType",
    "outGrpOutGrm19AgrAgreementAccKind",
    "outGrpOutGrm19AgrAgreementAgrBlockedLimit",
    "outGrpOutGrm19AgrAgreementAgrLimit",
    "outGrpOutGrm19AgrAgreementAgrLimitInd",
    "outGrpOutGrm19AgrAgreementAgrMembershipSn",
    "outGrpOutGrm19AgrAgreementAgrSigningDt",
    "outGrpOutGrm19AgrAgreementAgrSn",
    "outGrpOutGrm19AgrAgreementAgrStatus",
    "outGrpOutGrm19AgrAgreementAgrUtilisedLimit",
    "outGrpOutGrm19AgrAgreementAgrYear",
    "outGrpOutGrmAccAgreementProfitsAccountAccountCd",
    "outGrpOutGrmAccAgreementProfitsAccountAccountNumber",
    "outGrpOutGrmAccAgreementProfitsAccountPrftSystem",
    "outGrpOutGrmColAccAvailIefSuppliedAmount",
    "outGrpOutGrmColAccUtilIefSuppliedAmount",
    "outGrpOutGrmColAccountCollateralLimitsAccountNumber",
    "outGrpOutGrmColAccountCollateralLimitsHistoryCnt",
    "outGrpOutGrmColAccountCollateralLimitsIdCurrency",
    "outGrpOutGrmColAccountCollateralLimitsLiqLimit",
    "outGrpOutGrmColAccountCollateralLimitsLiqUtil",
    "outGrpOutGrmColAccountCollateralLimitsNoLiqLimit",
    "outGrpOutGrmColAccountCollateralLimitsNoLiqUtil",
    "outGrpOutGrmColAccountCollateralLimitsPrftSystem",
    "outGrpOutGrmColAgrBalAgreementAgrBlockedLimit",
    "outGrpOutGrmColAgrBalAgreementAgrLimit",
    "outGrpOutGrmColAgrBalAgreementAgrUtilisedLimit",
    "outGrpOutGrmColAgreementCollateralLimitsAccountNumber",
    "outGrpOutGrmColAgreementCollateralLimitsHistoryCnt",
    "outGrpOutGrmColAgreementCollateralLimitsIdCurrency",
    "outGrpOutGrmColAgreementCollateralLimitsLiqLimit",
    "outGrpOutGrmColAgreementCollateralLimitsLiqUtil",
    "outGrpOutGrmColAgreementCollateralLimitsNoLiqLimit",
    "outGrpOutGrmColAgreementCollateralLimitsNoLiqUtil",
    "outGrpOutGrmColAgreementCollateralLimitsPrftSystem",
    "outGrpOutGrmColCrlineCustomerCreditLineCrlineAmount",
    "outGrpOutGrmColCrlineCustomerCreditLineEntryStatus",
    "outGrpOutGrmColCrlineCustomerCreditLineExpiryDate",
    "outGrpOutGrmColCrlineCustomerCreditLineHistoryCnt",
    "outGrpOutGrmColCrlineCustomerCreditLineTmstamp",
    "outGrpOutGrmColCrlineCustomerCreditLineUtilisedAmount",
    "outGrpOutGrmColCrlineGenericDetailDescription",
    "outGrpOutGrmColCrlineGenericDetailSerialNum",
    "outGrpOutGrmColMandatoryLoanWorkFlgsCollateralNecessary",
    "outGrpOutGrmCustomerAlertMsg",
    "outGrpOutGrmCustomerCDigit",
    "outGrpOutGrmCustomerCustId",
    "outGrpOutGrmErrorAccountWorkErrorMessage",
    "outGrpOutGrmInfoProfitsAccountAccStatus",
    "outGrpOutGrmInfoProfitsAccountAccountCd",
    "outGrpOutGrmInfoProfitsAccountAccountNumber",
    "outGrpOutGrmInfoProfitsAccountAgrMembershipSn",
    "outGrpOutGrmInfoProfitsAccountAgrSn",
    "outGrpOutGrmInfoProfitsAccountAgrUnit",
    "outGrpOutGrmInfoProfitsAccountAgrYear",
    "outGrpOutGrmInfoProfitsAccountCustId",
    "outGrpOutGrmInfoProfitsAccountDepAccNumber",
    "outGrpOutGrmInfoProfitsAccountDepOpenUnit",
    "outGrpOutGrmInfoProfitsAccountLgAccSn",
    "outGrpOutGrmInfoProfitsAccountLgOpenUnit",
    "outGrpOutGrmInfoProfitsAccountLimitCurrency",
    "outGrpOutGrmInfoProfitsAccountLnsOpenUnit",
    "outGrpOutGrmInfoProfitsAccountLnsSn",
    "outGrpOutGrmInfoProfitsAccountLnsType",
    "outGrpOutGrmInfoProfitsAccountMonotoringUnit",
    "outGrpOutGrmInfoProfitsAccountMovementCurrency",
    "outGrpOutGrmInfoProfitsAccountPrftSystem",
    "outGrpOutGrmInfoProfitsAccountProductId",
    "outGrpOutGrmInfoProfitsAccountTrOpenUnit",
    "outGrpOutGrmInfoProfitsAccountTrSn",
    "outGrpOutGrmInfoProfitsAccountTrType",
    "outGrpOutGrmLimitCurrencyIdCurrency",
    "outGrpOutGrmLimitCurrencyShortDescr",
    "outGrpOutGrmMonitoringUnitCode",
    "outGrpOutGrmMonitoringUnitUnitName",
    "outGrpOutGrmMovementCurrencyIdCurrency",
    "outGrpOutGrmMovementCurrencyShortDescr",
    "outGrpOutGrmNameListSetDescription",
    "outGrpOutGrmOpeningUnitCode",
    "outGrpOutGrmOpeningUnitUnitName",
    "outGrpOutGrmProductProductDescription",
    "outGrpOutGrmProductProductIdProduct",
    "outGrpOutGrmProfitsAccountAccountCd",
    "outGrpOutGrmProfitsAccountAccountNumber",
    "outGrpOutGrmProfitsAccountPrftSystem"
})
public class PRT098VOutGrpItem {

    @XmlElement(name = "OutGrpOutGrm04LnsAmntsLoanAccountInfoPositiveAmn", required = true)
    protected BigDecimal outGrpOutGrm04LnsAmntsLoanAccountInfoPositiveAmn;
    @XmlElement(name = "OutGrpOutGrm04LnsAmntsLoanAccountInfoUnclearAmn", required = true)
    protected BigDecimal outGrpOutGrm04LnsAmntsLoanAccountInfoUnclearAmn;
    @XmlElement(name = "OutGrpOutGrm04LnsAmntsLoanAccountInfoBlockedAmn", required = true)
    protected BigDecimal outGrpOutGrm04LnsAmntsLoanAccountInfoBlockedAmn;
    @XmlElement(name = "OutGrpOutGrm04LnsAmntsLoanAccountInfoDormantAmn", required = true)
    protected BigDecimal outGrpOutGrm04LnsAmntsLoanAccountInfoDormantAmn;
    @XmlElement(name = "OutGrpOutGrm04LnsFixedLnsInterestIdInterest", required = true)
    protected BigDecimal outGrpOutGrm04LnsFixedLnsInterestIdInterest;
    @XmlElement(name = "OutGrpOutGrm04LnsFixedLnsInterestDescription")
    protected String outGrpOutGrm04LnsFixedLnsInterestDescription;
    @XmlElement(name = "OutGrpOutGrm04LnsFloatLnsInterestIdInterest")
    protected int outGrpOutGrm04LnsFloatLnsInterestIdInterest;
    @XmlElement(name = "OutGrpOutGrm04LnsFloatLnsInterestDescription")
    protected String outGrpOutGrm04LnsFloatLnsInterestDescription;
    @XmlElement(name = "OutGrpOutGrm04N128InterestSupplyWorkFixedInterestPrc", required = true)
    protected BigDecimal outGrpOutGrm04N128InterestSupplyWorkFixedInterestPrc;
    @XmlElement(name = "OutGrpOutGrm04PenaltyInterestSupplyWorkFixedInterestPrc", required = true)
    protected BigDecimal outGrpOutGrm04PenaltyInterestSupplyWorkFixedInterestPrc;
    @XmlElement(name = "OutGrpOutGrm04SpreadInterestSupplyWorkFixedInterestPrc", required = true)
    protected BigDecimal outGrpOutGrm04SpreadInterestSupplyWorkFixedInterestPrc;
    @XmlElement(name = "OutGrpOutGrm04NormalInterestInterestSupplyWorkFixedInterestPrc", required = true)
    protected BigDecimal outGrpOutGrm04NormalInterestInterestSupplyWorkFixedInterestPrc;
    @XmlElement(name = "OutGrpOutGrm04TotRateInterestSupplyWorkFixedInterestPrc", required = true)
    protected BigDecimal outGrpOutGrm04TotRateInterestSupplyWorkFixedInterestPrc;
    @XmlElement(name = "OutGrpOutGrm03DepDepositAccountDepositType")
    protected String outGrpOutGrm03DepDepositAccountDepositType;
    @XmlElement(name = "OutGrpOutGrm03DepDepositAccountAccrCrInterest", required = true)
    protected BigDecimal outGrpOutGrm03DepDepositAccountAccrCrInterest;
    @XmlElement(name = "OutGrpOutGrm03DepDepositAccountAccrDbInterest", required = true)
    protected BigDecimal outGrpOutGrm03DepDepositAccountAccrDbInterest;
    @XmlElement(name = "OutGrpOutGrm03DepDepositAccountAccountLimit", required = true)
    protected BigDecimal outGrpOutGrm03DepDepositAccountAccountLimit;
    @XmlElement(name = "OutGrpOutGrm03DepIbanCharSuppliedChar37")
    protected String outGrpOutGrm03DepIbanCharSuppliedChar37;
    @XmlElement(name = "OutGrpOutGrm03WithdrawalAvailDepositAccountAvailableBalance", required = true)
    protected BigDecimal outGrpOutGrm03WithdrawalAvailDepositAccountAvailableBalance;
    @XmlElement(name = "OutGrpOutGrm03ChequebookDepositChequeBookFlag")
    protected String outGrpOutGrm03ChequebookDepositChequeBookFlag;
    @XmlElement(name = "OutGrpOutGrmDomesticCurrencyIdCurrency", required = true)
    protected BigDecimal outGrpOutGrmDomesticCurrencyIdCurrency;
    @XmlElement(name = "OutGrpOutGrmDomesticCurrencyShortDescr")
    protected String outGrpOutGrmDomesticCurrencyShortDescr;
    @XmlElement(name = "OutGrpOutGrmSelectedCurrencyIdCurrency", required = true)
    protected BigDecimal outGrpOutGrmSelectedCurrencyIdCurrency;
    @XmlElement(name = "OutGrpOutGrmSelectedCurrencyShortDescr")
    protected String outGrpOutGrmSelectedCurrencyShortDescr;
    @XmlElement(name = "OutGrpOutGrmBalancesProfitsAccountWorkBalance", required = true)
    protected BigDecimal outGrpOutGrmBalancesProfitsAccountWorkBalance;
    @XmlElement(name = "OutGrpOutGrmBalancesProfitsAccountWorkBalanceLc", required = true)
    protected BigDecimal outGrpOutGrmBalancesProfitsAccountWorkBalanceLc;
    @XmlElement(name = "OutGrpOutGrmBalancesProfitsAccountWorkBalanceRequested", required = true)
    protected BigDecimal outGrpOutGrmBalancesProfitsAccountWorkBalanceRequested;
    @XmlElement(name = "OutGrpOutGrm03DepDepositAccountAccountNumber")
    protected double outGrpOutGrm03DepDepositAccountAccountNumber;
    @XmlElement(name = "OutGrpOutGrm03DepDepositAccountAvailableBalance", required = true)
    protected BigDecimal outGrpOutGrm03DepDepositAccountAvailableBalance;
    @XmlElement(name = "OutGrpOutGrm03DepDepositAccountBlockedBalance", required = true)
    protected BigDecimal outGrpOutGrm03DepDepositAccountBlockedBalance;
    @XmlElement(name = "OutGrpOutGrm03DepDepositAccountBookBalance", required = true)
    protected BigDecimal outGrpOutGrm03DepDepositAccountBookBalance;
    @XmlElement(name = "OutGrpOutGrm03DepDepositAccountCDigit")
    protected short outGrpOutGrm03DepDepositAccountCDigit;
    @XmlElement(name = "OutGrpOutGrm03DepDepositAccountEntryStatus")
    protected String outGrpOutGrm03DepDepositAccountEntryStatus;
    @XmlElement(name = "OutGrpOutGrm03DepDepositAccountForecastBalance", required = true)
    protected BigDecimal outGrpOutGrm03DepDepositAccountForecastBalance;
    @XmlElement(name = "OutGrpOutGrm03DepDepositAccountUnclearBalance", required = true)
    protected BigDecimal outGrpOutGrm03DepDepositAccountUnclearBalance;
    @XmlElement(name = "OutGrpOutGrm04LnsInfoLoanAccountAccLimitAmn", required = true)
    protected BigDecimal outGrpOutGrm04LnsInfoLoanAccountAccLimitAmn;
    @XmlElement(name = "OutGrpOutGrm04LnsInfoLoanAccountAccMechanism")
    protected String outGrpOutGrm04LnsInfoLoanAccountAccMechanism;
    @XmlElement(name = "OutGrpOutGrm04LnsInfoLoanAccountAccSn")
    protected int outGrpOutGrm04LnsInfoLoanAccountAccSn;
    @XmlElement(name = "OutGrpOutGrm04LnsInfoLoanAccountAccStatus")
    protected String outGrpOutGrm04LnsInfoLoanAccountAccStatus;
    @XmlElement(name = "OutGrpOutGrm04LnsInfoLoanAccountAccType")
    protected short outGrpOutGrm04LnsInfoLoanAccountAccType;
    @XmlElement(name = "OutGrpOutGrm04LnsInfoLoanAccountLoanStatus")
    protected String outGrpOutGrm04LnsInfoLoanAccountLoanStatus;
    @XmlElement(name = "OutGrpOutGrm04LnsLoanAccountDrvWorkAccBankBal", required = true)
    protected BigDecimal outGrpOutGrm04LnsLoanAccountDrvWorkAccBankBal;
    @XmlElement(name = "OutGrpOutGrm04LnsLoanAccountDrvWorkAccountBal", required = true)
    protected BigDecimal outGrpOutGrm04LnsLoanAccountDrvWorkAccountBal;
    @XmlElement(name = "OutGrpOutGrm04LnsLoanAccountDrvWorkLstYrIntDbAmn", required = true)
    protected BigDecimal outGrpOutGrm04LnsLoanAccountDrvWorkLstYrIntDbAmn;
    @XmlElement(name = "OutGrpOutGrm04LnsLoanAccountDrvWorkNrmAccountBal", required = true)
    protected BigDecimal outGrpOutGrm04LnsLoanAccountDrvWorkNrmAccountBal;
    @XmlElement(name = "OutGrpOutGrm04LnsLoanAccountDrvWorkOvAccountBal", required = true)
    protected BigDecimal outGrpOutGrm04LnsLoanAccountDrvWorkOvAccountBal;
    @XmlElement(name = "OutGrpOutGrm04LnsLoanAccountDrvWorkTotPaymentAmn", required = true)
    protected BigDecimal outGrpOutGrm04LnsLoanAccountDrvWorkTotPaymentAmn;
    @XmlElement(name = "OutGrpOutGrm14LgLgAccountAccLimitAmn", required = true)
    protected BigDecimal outGrpOutGrm14LgLgAccountAccLimitAmn;
    @XmlElement(name = "OutGrpOutGrm14LgLgAccountAccSn")
    protected double outGrpOutGrm14LgLgAccountAccSn;
    @XmlElement(name = "OutGrpOutGrm14LgLgAccountAccStatus")
    protected String outGrpOutGrm14LgLgAccountAccStatus;
    @XmlElement(name = "OutGrpOutGrm14LgLgAccountCommissionBal", required = true)
    protected BigDecimal outGrpOutGrm14LgLgAccountCommissionBal;
    @XmlElement(name = "OutGrpOutGrm14LgLgAccountDefaultAmn", required = true)
    protected BigDecimal outGrpOutGrm14LgLgAccountDefaultAmn;
    @XmlElement(name = "OutGrpOutGrm14LgLgAccountExpenseBal", required = true)
    protected BigDecimal outGrpOutGrm14LgLgAccountExpenseBal;
    @XmlElement(name = "OutGrpOutGrm14LgLgAccountExpirationType")
    protected String outGrpOutGrm14LgLgAccountExpirationType;
    @XmlElement(name = "OutGrpOutGrm14LgLgAccountIssuanceJustific")
    protected String outGrpOutGrm14LgLgAccountIssuanceJustific;
    @XmlElement(name = "OutGrpOutGrm14LgLgAccountLgAmountBal", required = true)
    protected BigDecimal outGrpOutGrm14LgLgAccountLgAmountBal;
    @XmlElement(name = "OutGrpOutGrm14LgLgAccountLgInitialAmn", required = true)
    protected BigDecimal outGrpOutGrm14LgLgAccountLgInitialAmn;
    @XmlElement(name = "OutGrpOutGrm14LgLgAccountObligationStatus")
    protected String outGrpOutGrm14LgLgAccountObligationStatus;
    @XmlElement(name = "OutGrpOutGrm14LgLgAccountRqDefaultAmn", required = true)
    protected BigDecimal outGrpOutGrm14LgLgAccountRqDefaultAmn;
    @XmlElement(name = "OutGrpOutGrm18ScrTotCustomerPositionTotalsScrAkEvalTot", required = true)
    protected BigDecimal outGrpOutGrm18ScrTotCustomerPositionTotalsScrAkEvalTot;
    @XmlElement(name = "OutGrpOutGrm18ScrTotCustomerPositionTotalsScrAkShrTot", required = true)
    protected BigDecimal outGrpOutGrm18ScrTotCustomerPositionTotalsScrAkShrTot;
    @XmlElement(name = "OutGrpOutGrm18ScrTotCustomerPositionTotalsScrAkddTot", required = true)
    protected BigDecimal outGrpOutGrm18ScrTotCustomerPositionTotalsScrAkddTot;
    @XmlElement(name = "OutGrpOutGrm18ScrTotCustomerPositionTotalsScrBondTot", required = true)
    protected BigDecimal outGrpOutGrm18ScrTotCustomerPositionTotalsScrBondTot;
    @XmlElement(name = "OutGrpOutGrm18ScrTotCustomerPositionTotalsScrRepoTot", required = true)
    protected BigDecimal outGrpOutGrm18ScrTotCustomerPositionTotalsScrRepoTot;
    @XmlElement(name = "OutGrpOutGrm18ScrTraccountAccKind")
    protected String outGrpOutGrm18ScrTraccountAccKind;
    @XmlElement(name = "OutGrpOutGrm18ScrTraccountEntryStatus")
    protected String outGrpOutGrm18ScrTraccountEntryStatus;
    @XmlElement(name = "OutGrpOutGrm18ScrTraccountSecuritiesType")
    protected short outGrpOutGrm18ScrTraccountSecuritiesType;
    @XmlElement(name = "OutGrpOutGrm19AgrAgreementAccKind")
    protected String outGrpOutGrm19AgrAgreementAccKind;
    @XmlElement(name = "OutGrpOutGrm19AgrAgreementAgrBlockedLimit", required = true)
    protected BigDecimal outGrpOutGrm19AgrAgreementAgrBlockedLimit;
    @XmlElement(name = "OutGrpOutGrm19AgrAgreementAgrLimit", required = true)
    protected BigDecimal outGrpOutGrm19AgrAgreementAgrLimit;
    @XmlElement(name = "OutGrpOutGrm19AgrAgreementAgrLimitInd")
    protected String outGrpOutGrm19AgrAgreementAgrLimitInd;
    @XmlElement(name = "OutGrpOutGrm19AgrAgreementAgrMembershipSn")
    protected int outGrpOutGrm19AgrAgreementAgrMembershipSn;
    @XmlElement(name = "OutGrpOutGrm19AgrAgreementAgrSigningDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrm19AgrAgreementAgrSigningDt;
    @XmlElement(name = "OutGrpOutGrm19AgrAgreementAgrSn")
    protected int outGrpOutGrm19AgrAgreementAgrSn;
    @XmlElement(name = "OutGrpOutGrm19AgrAgreementAgrStatus")
    protected String outGrpOutGrm19AgrAgreementAgrStatus;
    @XmlElement(name = "OutGrpOutGrm19AgrAgreementAgrUtilisedLimit", required = true)
    protected BigDecimal outGrpOutGrm19AgrAgreementAgrUtilisedLimit;
    @XmlElement(name = "OutGrpOutGrm19AgrAgreementAgrYear")
    protected short outGrpOutGrm19AgrAgreementAgrYear;
    @XmlElement(name = "OutGrpOutGrmAccAgreementProfitsAccountAccountCd")
    protected short outGrpOutGrmAccAgreementProfitsAccountAccountCd;
    @XmlElement(name = "OutGrpOutGrmAccAgreementProfitsAccountAccountNumber")
    protected String outGrpOutGrmAccAgreementProfitsAccountAccountNumber;
    @XmlElement(name = "OutGrpOutGrmAccAgreementProfitsAccountPrftSystem")
    protected short outGrpOutGrmAccAgreementProfitsAccountPrftSystem;
    @XmlElement(name = "OutGrpOutGrmColAccAvailIefSuppliedAmount", required = true)
    protected BigDecimal outGrpOutGrmColAccAvailIefSuppliedAmount;
    @XmlElement(name = "OutGrpOutGrmColAccUtilIefSuppliedAmount", required = true)
    protected BigDecimal outGrpOutGrmColAccUtilIefSuppliedAmount;
    @XmlElement(name = "OutGrpOutGrmColAccountCollateralLimitsAccountNumber")
    protected String outGrpOutGrmColAccountCollateralLimitsAccountNumber;
    @XmlElement(name = "OutGrpOutGrmColAccountCollateralLimitsHistoryCnt")
    protected double outGrpOutGrmColAccountCollateralLimitsHistoryCnt;
    @XmlElement(name = "OutGrpOutGrmColAccountCollateralLimitsIdCurrency")
    protected int outGrpOutGrmColAccountCollateralLimitsIdCurrency;
    @XmlElement(name = "OutGrpOutGrmColAccountCollateralLimitsLiqLimit", required = true)
    protected BigDecimal outGrpOutGrmColAccountCollateralLimitsLiqLimit;
    @XmlElement(name = "OutGrpOutGrmColAccountCollateralLimitsLiqUtil", required = true)
    protected BigDecimal outGrpOutGrmColAccountCollateralLimitsLiqUtil;
    @XmlElement(name = "OutGrpOutGrmColAccountCollateralLimitsNoLiqLimit", required = true)
    protected BigDecimal outGrpOutGrmColAccountCollateralLimitsNoLiqLimit;
    @XmlElement(name = "OutGrpOutGrmColAccountCollateralLimitsNoLiqUtil", required = true)
    protected BigDecimal outGrpOutGrmColAccountCollateralLimitsNoLiqUtil;
    @XmlElement(name = "OutGrpOutGrmColAccountCollateralLimitsPrftSystem")
    protected short outGrpOutGrmColAccountCollateralLimitsPrftSystem;
    @XmlElement(name = "OutGrpOutGrmColAgrBalAgreementAgrBlockedLimit", required = true)
    protected BigDecimal outGrpOutGrmColAgrBalAgreementAgrBlockedLimit;
    @XmlElement(name = "OutGrpOutGrmColAgrBalAgreementAgrLimit", required = true)
    protected BigDecimal outGrpOutGrmColAgrBalAgreementAgrLimit;
    @XmlElement(name = "OutGrpOutGrmColAgrBalAgreementAgrUtilisedLimit", required = true)
    protected BigDecimal outGrpOutGrmColAgrBalAgreementAgrUtilisedLimit;
    @XmlElement(name = "OutGrpOutGrmColAgreementCollateralLimitsAccountNumber")
    protected String outGrpOutGrmColAgreementCollateralLimitsAccountNumber;
    @XmlElement(name = "OutGrpOutGrmColAgreementCollateralLimitsHistoryCnt")
    protected double outGrpOutGrmColAgreementCollateralLimitsHistoryCnt;
    @XmlElement(name = "OutGrpOutGrmColAgreementCollateralLimitsIdCurrency")
    protected int outGrpOutGrmColAgreementCollateralLimitsIdCurrency;
    @XmlElement(name = "OutGrpOutGrmColAgreementCollateralLimitsLiqLimit", required = true)
    protected BigDecimal outGrpOutGrmColAgreementCollateralLimitsLiqLimit;
    @XmlElement(name = "OutGrpOutGrmColAgreementCollateralLimitsLiqUtil", required = true)
    protected BigDecimal outGrpOutGrmColAgreementCollateralLimitsLiqUtil;
    @XmlElement(name = "OutGrpOutGrmColAgreementCollateralLimitsNoLiqLimit", required = true)
    protected BigDecimal outGrpOutGrmColAgreementCollateralLimitsNoLiqLimit;
    @XmlElement(name = "OutGrpOutGrmColAgreementCollateralLimitsNoLiqUtil", required = true)
    protected BigDecimal outGrpOutGrmColAgreementCollateralLimitsNoLiqUtil;
    @XmlElement(name = "OutGrpOutGrmColAgreementCollateralLimitsPrftSystem")
    protected short outGrpOutGrmColAgreementCollateralLimitsPrftSystem;
    @XmlElement(name = "OutGrpOutGrmColCrlineCustomerCreditLineCrlineAmount", required = true)
    protected BigDecimal outGrpOutGrmColCrlineCustomerCreditLineCrlineAmount;
    @XmlElement(name = "OutGrpOutGrmColCrlineCustomerCreditLineEntryStatus")
    protected String outGrpOutGrmColCrlineCustomerCreditLineEntryStatus;
    @XmlElement(name = "OutGrpOutGrmColCrlineCustomerCreditLineExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmColCrlineCustomerCreditLineExpiryDate;
    @XmlElement(name = "OutGrpOutGrmColCrlineCustomerCreditLineHistoryCnt")
    protected double outGrpOutGrmColCrlineCustomerCreditLineHistoryCnt;
    @XmlElement(name = "OutGrpOutGrmColCrlineCustomerCreditLineTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmColCrlineCustomerCreditLineTmstamp;
    @XmlElement(name = "OutGrpOutGrmColCrlineCustomerCreditLineUtilisedAmount", required = true)
    protected BigDecimal outGrpOutGrmColCrlineCustomerCreditLineUtilisedAmount;
    @XmlElement(name = "OutGrpOutGrmColCrlineGenericDetailDescription")
    protected String outGrpOutGrmColCrlineGenericDetailDescription;
    @XmlElement(name = "OutGrpOutGrmColCrlineGenericDetailSerialNum")
    protected int outGrpOutGrmColCrlineGenericDetailSerialNum;
    @XmlElement(name = "OutGrpOutGrmColMandatoryLoanWorkFlgsCollateralNecessary")
    protected String outGrpOutGrmColMandatoryLoanWorkFlgsCollateralNecessary;
    @XmlElement(name = "OutGrpOutGrmCustomerAlertMsg")
    protected String outGrpOutGrmCustomerAlertMsg;
    @XmlElement(name = "OutGrpOutGrmCustomerCDigit")
    protected short outGrpOutGrmCustomerCDigit;
    @XmlElement(name = "OutGrpOutGrmCustomerCustId")
    protected int outGrpOutGrmCustomerCustId;
    @XmlElement(name = "OutGrpOutGrmErrorAccountWorkErrorMessage")
    protected String outGrpOutGrmErrorAccountWorkErrorMessage;
    @XmlElement(name = "OutGrpOutGrmInfoProfitsAccountAccStatus")
    protected String outGrpOutGrmInfoProfitsAccountAccStatus;
    @XmlElement(name = "OutGrpOutGrmInfoProfitsAccountAccountCd")
    protected short outGrpOutGrmInfoProfitsAccountAccountCd;
    @XmlElement(name = "OutGrpOutGrmInfoProfitsAccountAccountNumber")
    protected String outGrpOutGrmInfoProfitsAccountAccountNumber;
    @XmlElement(name = "OutGrpOutGrmInfoProfitsAccountAgrMembershipSn")
    protected int outGrpOutGrmInfoProfitsAccountAgrMembershipSn;
    @XmlElement(name = "OutGrpOutGrmInfoProfitsAccountAgrSn")
    protected int outGrpOutGrmInfoProfitsAccountAgrSn;
    @XmlElement(name = "OutGrpOutGrmInfoProfitsAccountAgrUnit")
    protected int outGrpOutGrmInfoProfitsAccountAgrUnit;
    @XmlElement(name = "OutGrpOutGrmInfoProfitsAccountAgrYear")
    protected short outGrpOutGrmInfoProfitsAccountAgrYear;
    @XmlElement(name = "OutGrpOutGrmInfoProfitsAccountCustId")
    protected int outGrpOutGrmInfoProfitsAccountCustId;
    @XmlElement(name = "OutGrpOutGrmInfoProfitsAccountDepAccNumber")
    protected double outGrpOutGrmInfoProfitsAccountDepAccNumber;
    @XmlElement(name = "OutGrpOutGrmInfoProfitsAccountDepOpenUnit")
    protected int outGrpOutGrmInfoProfitsAccountDepOpenUnit;
    @XmlElement(name = "OutGrpOutGrmInfoProfitsAccountLgAccSn")
    protected double outGrpOutGrmInfoProfitsAccountLgAccSn;
    @XmlElement(name = "OutGrpOutGrmInfoProfitsAccountLgOpenUnit")
    protected int outGrpOutGrmInfoProfitsAccountLgOpenUnit;
    @XmlElement(name = "OutGrpOutGrmInfoProfitsAccountLimitCurrency")
    protected int outGrpOutGrmInfoProfitsAccountLimitCurrency;
    @XmlElement(name = "OutGrpOutGrmInfoProfitsAccountLnsOpenUnit")
    protected int outGrpOutGrmInfoProfitsAccountLnsOpenUnit;
    @XmlElement(name = "OutGrpOutGrmInfoProfitsAccountLnsSn")
    protected int outGrpOutGrmInfoProfitsAccountLnsSn;
    @XmlElement(name = "OutGrpOutGrmInfoProfitsAccountLnsType")
    protected short outGrpOutGrmInfoProfitsAccountLnsType;
    @XmlElement(name = "OutGrpOutGrmInfoProfitsAccountMonotoringUnit")
    protected int outGrpOutGrmInfoProfitsAccountMonotoringUnit;
    @XmlElement(name = "OutGrpOutGrmInfoProfitsAccountMovementCurrency")
    protected int outGrpOutGrmInfoProfitsAccountMovementCurrency;
    @XmlElement(name = "OutGrpOutGrmInfoProfitsAccountPrftSystem")
    protected short outGrpOutGrmInfoProfitsAccountPrftSystem;
    @XmlElement(name = "OutGrpOutGrmInfoProfitsAccountProductId")
    protected int outGrpOutGrmInfoProfitsAccountProductId;
    @XmlElement(name = "OutGrpOutGrmInfoProfitsAccountTrOpenUnit")
    protected int outGrpOutGrmInfoProfitsAccountTrOpenUnit;
    @XmlElement(name = "OutGrpOutGrmInfoProfitsAccountTrSn")
    protected int outGrpOutGrmInfoProfitsAccountTrSn;
    @XmlElement(name = "OutGrpOutGrmInfoProfitsAccountTrType")
    protected short outGrpOutGrmInfoProfitsAccountTrType;
    @XmlElement(name = "OutGrpOutGrmLimitCurrencyIdCurrency")
    protected int outGrpOutGrmLimitCurrencyIdCurrency;
    @XmlElement(name = "OutGrpOutGrmLimitCurrencyShortDescr")
    protected String outGrpOutGrmLimitCurrencyShortDescr;
    @XmlElement(name = "OutGrpOutGrmMonitoringUnitCode")
    protected int outGrpOutGrmMonitoringUnitCode;
    @XmlElement(name = "OutGrpOutGrmMonitoringUnitUnitName")
    protected String outGrpOutGrmMonitoringUnitUnitName;
    @XmlElement(name = "OutGrpOutGrmMovementCurrencyIdCurrency")
    protected int outGrpOutGrmMovementCurrencyIdCurrency;
    @XmlElement(name = "OutGrpOutGrmMovementCurrencyShortDescr")
    protected String outGrpOutGrmMovementCurrencyShortDescr;
    @XmlElement(name = "OutGrpOutGrmNameListSetDescription")
    protected String outGrpOutGrmNameListSetDescription;
    @XmlElement(name = "OutGrpOutGrmOpeningUnitCode")
    protected int outGrpOutGrmOpeningUnitCode;
    @XmlElement(name = "OutGrpOutGrmOpeningUnitUnitName")
    protected String outGrpOutGrmOpeningUnitUnitName;
    @XmlElement(name = "OutGrpOutGrmProductProductDescription")
    protected String outGrpOutGrmProductProductDescription;
    @XmlElement(name = "OutGrpOutGrmProductProductIdProduct")
    protected int outGrpOutGrmProductProductIdProduct;
    @XmlElement(name = "OutGrpOutGrmProfitsAccountAccountCd")
    protected short outGrpOutGrmProfitsAccountAccountCd;
    @XmlElement(name = "OutGrpOutGrmProfitsAccountAccountNumber")
    protected String outGrpOutGrmProfitsAccountAccountNumber;
    @XmlElement(name = "OutGrpOutGrmProfitsAccountPrftSystem")
    protected short outGrpOutGrmProfitsAccountPrftSystem;

    /**
     * Gets the value of the outGrpOutGrm04LnsAmntsLoanAccountInfoPositiveAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm04LnsAmntsLoanAccountInfoPositiveAmn() {
        return outGrpOutGrm04LnsAmntsLoanAccountInfoPositiveAmn;
    }

    /**
     * Sets the value of the outGrpOutGrm04LnsAmntsLoanAccountInfoPositiveAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm04LnsAmntsLoanAccountInfoPositiveAmn(BigDecimal value) {
        this.outGrpOutGrm04LnsAmntsLoanAccountInfoPositiveAmn = value;
    }

    /**
     * Gets the value of the outGrpOutGrm04LnsAmntsLoanAccountInfoUnclearAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm04LnsAmntsLoanAccountInfoUnclearAmn() {
        return outGrpOutGrm04LnsAmntsLoanAccountInfoUnclearAmn;
    }

    /**
     * Sets the value of the outGrpOutGrm04LnsAmntsLoanAccountInfoUnclearAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm04LnsAmntsLoanAccountInfoUnclearAmn(BigDecimal value) {
        this.outGrpOutGrm04LnsAmntsLoanAccountInfoUnclearAmn = value;
    }

    /**
     * Gets the value of the outGrpOutGrm04LnsAmntsLoanAccountInfoBlockedAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm04LnsAmntsLoanAccountInfoBlockedAmn() {
        return outGrpOutGrm04LnsAmntsLoanAccountInfoBlockedAmn;
    }

    /**
     * Sets the value of the outGrpOutGrm04LnsAmntsLoanAccountInfoBlockedAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm04LnsAmntsLoanAccountInfoBlockedAmn(BigDecimal value) {
        this.outGrpOutGrm04LnsAmntsLoanAccountInfoBlockedAmn = value;
    }

    /**
     * Gets the value of the outGrpOutGrm04LnsAmntsLoanAccountInfoDormantAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm04LnsAmntsLoanAccountInfoDormantAmn() {
        return outGrpOutGrm04LnsAmntsLoanAccountInfoDormantAmn;
    }

    /**
     * Sets the value of the outGrpOutGrm04LnsAmntsLoanAccountInfoDormantAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm04LnsAmntsLoanAccountInfoDormantAmn(BigDecimal value) {
        this.outGrpOutGrm04LnsAmntsLoanAccountInfoDormantAmn = value;
    }

    /**
     * Gets the value of the outGrpOutGrm04LnsFixedLnsInterestIdInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm04LnsFixedLnsInterestIdInterest() {
        return outGrpOutGrm04LnsFixedLnsInterestIdInterest;
    }

    /**
     * Sets the value of the outGrpOutGrm04LnsFixedLnsInterestIdInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm04LnsFixedLnsInterestIdInterest(BigDecimal value) {
        this.outGrpOutGrm04LnsFixedLnsInterestIdInterest = value;
    }

    /**
     * Gets the value of the outGrpOutGrm04LnsFixedLnsInterestDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrm04LnsFixedLnsInterestDescription() {
        return outGrpOutGrm04LnsFixedLnsInterestDescription;
    }

    /**
     * Sets the value of the outGrpOutGrm04LnsFixedLnsInterestDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrm04LnsFixedLnsInterestDescription(String value) {
        this.outGrpOutGrm04LnsFixedLnsInterestDescription = value;
    }

    /**
     * Gets the value of the outGrpOutGrm04LnsFloatLnsInterestIdInterest property.
     * 
     */
    public int getOutGrpOutGrm04LnsFloatLnsInterestIdInterest() {
        return outGrpOutGrm04LnsFloatLnsInterestIdInterest;
    }

    /**
     * Sets the value of the outGrpOutGrm04LnsFloatLnsInterestIdInterest property.
     * 
     */
    public void setOutGrpOutGrm04LnsFloatLnsInterestIdInterest(int value) {
        this.outGrpOutGrm04LnsFloatLnsInterestIdInterest = value;
    }

    /**
     * Gets the value of the outGrpOutGrm04LnsFloatLnsInterestDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrm04LnsFloatLnsInterestDescription() {
        return outGrpOutGrm04LnsFloatLnsInterestDescription;
    }

    /**
     * Sets the value of the outGrpOutGrm04LnsFloatLnsInterestDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrm04LnsFloatLnsInterestDescription(String value) {
        this.outGrpOutGrm04LnsFloatLnsInterestDescription = value;
    }

    /**
     * Gets the value of the outGrpOutGrm04N128InterestSupplyWorkFixedInterestPrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm04N128InterestSupplyWorkFixedInterestPrc() {
        return outGrpOutGrm04N128InterestSupplyWorkFixedInterestPrc;
    }

    /**
     * Sets the value of the outGrpOutGrm04N128InterestSupplyWorkFixedInterestPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm04N128InterestSupplyWorkFixedInterestPrc(BigDecimal value) {
        this.outGrpOutGrm04N128InterestSupplyWorkFixedInterestPrc = value;
    }

    /**
     * Gets the value of the outGrpOutGrm04PenaltyInterestSupplyWorkFixedInterestPrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm04PenaltyInterestSupplyWorkFixedInterestPrc() {
        return outGrpOutGrm04PenaltyInterestSupplyWorkFixedInterestPrc;
    }

    /**
     * Sets the value of the outGrpOutGrm04PenaltyInterestSupplyWorkFixedInterestPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm04PenaltyInterestSupplyWorkFixedInterestPrc(BigDecimal value) {
        this.outGrpOutGrm04PenaltyInterestSupplyWorkFixedInterestPrc = value;
    }

    /**
     * Gets the value of the outGrpOutGrm04SpreadInterestSupplyWorkFixedInterestPrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm04SpreadInterestSupplyWorkFixedInterestPrc() {
        return outGrpOutGrm04SpreadInterestSupplyWorkFixedInterestPrc;
    }

    /**
     * Sets the value of the outGrpOutGrm04SpreadInterestSupplyWorkFixedInterestPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm04SpreadInterestSupplyWorkFixedInterestPrc(BigDecimal value) {
        this.outGrpOutGrm04SpreadInterestSupplyWorkFixedInterestPrc = value;
    }

    /**
     * Gets the value of the outGrpOutGrm04NormalInterestInterestSupplyWorkFixedInterestPrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm04NormalInterestInterestSupplyWorkFixedInterestPrc() {
        return outGrpOutGrm04NormalInterestInterestSupplyWorkFixedInterestPrc;
    }

    /**
     * Sets the value of the outGrpOutGrm04NormalInterestInterestSupplyWorkFixedInterestPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm04NormalInterestInterestSupplyWorkFixedInterestPrc(BigDecimal value) {
        this.outGrpOutGrm04NormalInterestInterestSupplyWorkFixedInterestPrc = value;
    }

    /**
     * Gets the value of the outGrpOutGrm04TotRateInterestSupplyWorkFixedInterestPrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm04TotRateInterestSupplyWorkFixedInterestPrc() {
        return outGrpOutGrm04TotRateInterestSupplyWorkFixedInterestPrc;
    }

    /**
     * Sets the value of the outGrpOutGrm04TotRateInterestSupplyWorkFixedInterestPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm04TotRateInterestSupplyWorkFixedInterestPrc(BigDecimal value) {
        this.outGrpOutGrm04TotRateInterestSupplyWorkFixedInterestPrc = value;
    }

    /**
     * Gets the value of the outGrpOutGrm03DepDepositAccountDepositType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrm03DepDepositAccountDepositType() {
        return outGrpOutGrm03DepDepositAccountDepositType;
    }

    /**
     * Sets the value of the outGrpOutGrm03DepDepositAccountDepositType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrm03DepDepositAccountDepositType(String value) {
        this.outGrpOutGrm03DepDepositAccountDepositType = value;
    }

    /**
     * Gets the value of the outGrpOutGrm03DepDepositAccountAccrCrInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm03DepDepositAccountAccrCrInterest() {
        return outGrpOutGrm03DepDepositAccountAccrCrInterest;
    }

    /**
     * Sets the value of the outGrpOutGrm03DepDepositAccountAccrCrInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm03DepDepositAccountAccrCrInterest(BigDecimal value) {
        this.outGrpOutGrm03DepDepositAccountAccrCrInterest = value;
    }

    /**
     * Gets the value of the outGrpOutGrm03DepDepositAccountAccrDbInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm03DepDepositAccountAccrDbInterest() {
        return outGrpOutGrm03DepDepositAccountAccrDbInterest;
    }

    /**
     * Sets the value of the outGrpOutGrm03DepDepositAccountAccrDbInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm03DepDepositAccountAccrDbInterest(BigDecimal value) {
        this.outGrpOutGrm03DepDepositAccountAccrDbInterest = value;
    }

    /**
     * Gets the value of the outGrpOutGrm03DepDepositAccountAccountLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm03DepDepositAccountAccountLimit() {
        return outGrpOutGrm03DepDepositAccountAccountLimit;
    }

    /**
     * Sets the value of the outGrpOutGrm03DepDepositAccountAccountLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm03DepDepositAccountAccountLimit(BigDecimal value) {
        this.outGrpOutGrm03DepDepositAccountAccountLimit = value;
    }

    /**
     * Gets the value of the outGrpOutGrm03DepIbanCharSuppliedChar37 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrm03DepIbanCharSuppliedChar37() {
        return outGrpOutGrm03DepIbanCharSuppliedChar37;
    }

    /**
     * Sets the value of the outGrpOutGrm03DepIbanCharSuppliedChar37 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrm03DepIbanCharSuppliedChar37(String value) {
        this.outGrpOutGrm03DepIbanCharSuppliedChar37 = value;
    }

    /**
     * Gets the value of the outGrpOutGrm03WithdrawalAvailDepositAccountAvailableBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm03WithdrawalAvailDepositAccountAvailableBalance() {
        return outGrpOutGrm03WithdrawalAvailDepositAccountAvailableBalance;
    }

    /**
     * Sets the value of the outGrpOutGrm03WithdrawalAvailDepositAccountAvailableBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm03WithdrawalAvailDepositAccountAvailableBalance(BigDecimal value) {
        this.outGrpOutGrm03WithdrawalAvailDepositAccountAvailableBalance = value;
    }

    /**
     * Gets the value of the outGrpOutGrm03ChequebookDepositChequeBookFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrm03ChequebookDepositChequeBookFlag() {
        return outGrpOutGrm03ChequebookDepositChequeBookFlag;
    }

    /**
     * Sets the value of the outGrpOutGrm03ChequebookDepositChequeBookFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrm03ChequebookDepositChequeBookFlag(String value) {
        this.outGrpOutGrm03ChequebookDepositChequeBookFlag = value;
    }

    /**
     * Gets the value of the outGrpOutGrmDomesticCurrencyIdCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmDomesticCurrencyIdCurrency() {
        return outGrpOutGrmDomesticCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outGrpOutGrmDomesticCurrencyIdCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmDomesticCurrencyIdCurrency(BigDecimal value) {
        this.outGrpOutGrmDomesticCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outGrpOutGrmDomesticCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmDomesticCurrencyShortDescr() {
        return outGrpOutGrmDomesticCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpOutGrmDomesticCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmDomesticCurrencyShortDescr(String value) {
        this.outGrpOutGrmDomesticCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSelectedCurrencyIdCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSelectedCurrencyIdCurrency() {
        return outGrpOutGrmSelectedCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outGrpOutGrmSelectedCurrencyIdCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSelectedCurrencyIdCurrency(BigDecimal value) {
        this.outGrpOutGrmSelectedCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSelectedCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSelectedCurrencyShortDescr() {
        return outGrpOutGrmSelectedCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpOutGrmSelectedCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSelectedCurrencyShortDescr(String value) {
        this.outGrpOutGrmSelectedCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGrpOutGrmBalancesProfitsAccountWorkBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmBalancesProfitsAccountWorkBalance() {
        return outGrpOutGrmBalancesProfitsAccountWorkBalance;
    }

    /**
     * Sets the value of the outGrpOutGrmBalancesProfitsAccountWorkBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmBalancesProfitsAccountWorkBalance(BigDecimal value) {
        this.outGrpOutGrmBalancesProfitsAccountWorkBalance = value;
    }

    /**
     * Gets the value of the outGrpOutGrmBalancesProfitsAccountWorkBalanceLc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmBalancesProfitsAccountWorkBalanceLc() {
        return outGrpOutGrmBalancesProfitsAccountWorkBalanceLc;
    }

    /**
     * Sets the value of the outGrpOutGrmBalancesProfitsAccountWorkBalanceLc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmBalancesProfitsAccountWorkBalanceLc(BigDecimal value) {
        this.outGrpOutGrmBalancesProfitsAccountWorkBalanceLc = value;
    }

    /**
     * Gets the value of the outGrpOutGrmBalancesProfitsAccountWorkBalanceRequested property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmBalancesProfitsAccountWorkBalanceRequested() {
        return outGrpOutGrmBalancesProfitsAccountWorkBalanceRequested;
    }

    /**
     * Sets the value of the outGrpOutGrmBalancesProfitsAccountWorkBalanceRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmBalancesProfitsAccountWorkBalanceRequested(BigDecimal value) {
        this.outGrpOutGrmBalancesProfitsAccountWorkBalanceRequested = value;
    }

    /**
     * Gets the value of the outGrpOutGrm03DepDepositAccountAccountNumber property.
     * 
     */
    public double getOutGrpOutGrm03DepDepositAccountAccountNumber() {
        return outGrpOutGrm03DepDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the outGrpOutGrm03DepDepositAccountAccountNumber property.
     * 
     */
    public void setOutGrpOutGrm03DepDepositAccountAccountNumber(double value) {
        this.outGrpOutGrm03DepDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outGrpOutGrm03DepDepositAccountAvailableBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm03DepDepositAccountAvailableBalance() {
        return outGrpOutGrm03DepDepositAccountAvailableBalance;
    }

    /**
     * Sets the value of the outGrpOutGrm03DepDepositAccountAvailableBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm03DepDepositAccountAvailableBalance(BigDecimal value) {
        this.outGrpOutGrm03DepDepositAccountAvailableBalance = value;
    }

    /**
     * Gets the value of the outGrpOutGrm03DepDepositAccountBlockedBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm03DepDepositAccountBlockedBalance() {
        return outGrpOutGrm03DepDepositAccountBlockedBalance;
    }

    /**
     * Sets the value of the outGrpOutGrm03DepDepositAccountBlockedBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm03DepDepositAccountBlockedBalance(BigDecimal value) {
        this.outGrpOutGrm03DepDepositAccountBlockedBalance = value;
    }

    /**
     * Gets the value of the outGrpOutGrm03DepDepositAccountBookBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm03DepDepositAccountBookBalance() {
        return outGrpOutGrm03DepDepositAccountBookBalance;
    }

    /**
     * Sets the value of the outGrpOutGrm03DepDepositAccountBookBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm03DepDepositAccountBookBalance(BigDecimal value) {
        this.outGrpOutGrm03DepDepositAccountBookBalance = value;
    }

    /**
     * Gets the value of the outGrpOutGrm03DepDepositAccountCDigit property.
     * 
     */
    public short getOutGrpOutGrm03DepDepositAccountCDigit() {
        return outGrpOutGrm03DepDepositAccountCDigit;
    }

    /**
     * Sets the value of the outGrpOutGrm03DepDepositAccountCDigit property.
     * 
     */
    public void setOutGrpOutGrm03DepDepositAccountCDigit(short value) {
        this.outGrpOutGrm03DepDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the outGrpOutGrm03DepDepositAccountEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrm03DepDepositAccountEntryStatus() {
        return outGrpOutGrm03DepDepositAccountEntryStatus;
    }

    /**
     * Sets the value of the outGrpOutGrm03DepDepositAccountEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrm03DepDepositAccountEntryStatus(String value) {
        this.outGrpOutGrm03DepDepositAccountEntryStatus = value;
    }

    /**
     * Gets the value of the outGrpOutGrm03DepDepositAccountForecastBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm03DepDepositAccountForecastBalance() {
        return outGrpOutGrm03DepDepositAccountForecastBalance;
    }

    /**
     * Sets the value of the outGrpOutGrm03DepDepositAccountForecastBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm03DepDepositAccountForecastBalance(BigDecimal value) {
        this.outGrpOutGrm03DepDepositAccountForecastBalance = value;
    }

    /**
     * Gets the value of the outGrpOutGrm03DepDepositAccountUnclearBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm03DepDepositAccountUnclearBalance() {
        return outGrpOutGrm03DepDepositAccountUnclearBalance;
    }

    /**
     * Sets the value of the outGrpOutGrm03DepDepositAccountUnclearBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm03DepDepositAccountUnclearBalance(BigDecimal value) {
        this.outGrpOutGrm03DepDepositAccountUnclearBalance = value;
    }

    /**
     * Gets the value of the outGrpOutGrm04LnsInfoLoanAccountAccLimitAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm04LnsInfoLoanAccountAccLimitAmn() {
        return outGrpOutGrm04LnsInfoLoanAccountAccLimitAmn;
    }

    /**
     * Sets the value of the outGrpOutGrm04LnsInfoLoanAccountAccLimitAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm04LnsInfoLoanAccountAccLimitAmn(BigDecimal value) {
        this.outGrpOutGrm04LnsInfoLoanAccountAccLimitAmn = value;
    }

    /**
     * Gets the value of the outGrpOutGrm04LnsInfoLoanAccountAccMechanism property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrm04LnsInfoLoanAccountAccMechanism() {
        return outGrpOutGrm04LnsInfoLoanAccountAccMechanism;
    }

    /**
     * Sets the value of the outGrpOutGrm04LnsInfoLoanAccountAccMechanism property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrm04LnsInfoLoanAccountAccMechanism(String value) {
        this.outGrpOutGrm04LnsInfoLoanAccountAccMechanism = value;
    }

    /**
     * Gets the value of the outGrpOutGrm04LnsInfoLoanAccountAccSn property.
     * 
     */
    public int getOutGrpOutGrm04LnsInfoLoanAccountAccSn() {
        return outGrpOutGrm04LnsInfoLoanAccountAccSn;
    }

    /**
     * Sets the value of the outGrpOutGrm04LnsInfoLoanAccountAccSn property.
     * 
     */
    public void setOutGrpOutGrm04LnsInfoLoanAccountAccSn(int value) {
        this.outGrpOutGrm04LnsInfoLoanAccountAccSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrm04LnsInfoLoanAccountAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrm04LnsInfoLoanAccountAccStatus() {
        return outGrpOutGrm04LnsInfoLoanAccountAccStatus;
    }

    /**
     * Sets the value of the outGrpOutGrm04LnsInfoLoanAccountAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrm04LnsInfoLoanAccountAccStatus(String value) {
        this.outGrpOutGrm04LnsInfoLoanAccountAccStatus = value;
    }

    /**
     * Gets the value of the outGrpOutGrm04LnsInfoLoanAccountAccType property.
     * 
     */
    public short getOutGrpOutGrm04LnsInfoLoanAccountAccType() {
        return outGrpOutGrm04LnsInfoLoanAccountAccType;
    }

    /**
     * Sets the value of the outGrpOutGrm04LnsInfoLoanAccountAccType property.
     * 
     */
    public void setOutGrpOutGrm04LnsInfoLoanAccountAccType(short value) {
        this.outGrpOutGrm04LnsInfoLoanAccountAccType = value;
    }

    /**
     * Gets the value of the outGrpOutGrm04LnsInfoLoanAccountLoanStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrm04LnsInfoLoanAccountLoanStatus() {
        return outGrpOutGrm04LnsInfoLoanAccountLoanStatus;
    }

    /**
     * Sets the value of the outGrpOutGrm04LnsInfoLoanAccountLoanStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrm04LnsInfoLoanAccountLoanStatus(String value) {
        this.outGrpOutGrm04LnsInfoLoanAccountLoanStatus = value;
    }

    /**
     * Gets the value of the outGrpOutGrm04LnsLoanAccountDrvWorkAccBankBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm04LnsLoanAccountDrvWorkAccBankBal() {
        return outGrpOutGrm04LnsLoanAccountDrvWorkAccBankBal;
    }

    /**
     * Sets the value of the outGrpOutGrm04LnsLoanAccountDrvWorkAccBankBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm04LnsLoanAccountDrvWorkAccBankBal(BigDecimal value) {
        this.outGrpOutGrm04LnsLoanAccountDrvWorkAccBankBal = value;
    }

    /**
     * Gets the value of the outGrpOutGrm04LnsLoanAccountDrvWorkAccountBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm04LnsLoanAccountDrvWorkAccountBal() {
        return outGrpOutGrm04LnsLoanAccountDrvWorkAccountBal;
    }

    /**
     * Sets the value of the outGrpOutGrm04LnsLoanAccountDrvWorkAccountBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm04LnsLoanAccountDrvWorkAccountBal(BigDecimal value) {
        this.outGrpOutGrm04LnsLoanAccountDrvWorkAccountBal = value;
    }

    /**
     * Gets the value of the outGrpOutGrm04LnsLoanAccountDrvWorkLstYrIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm04LnsLoanAccountDrvWorkLstYrIntDbAmn() {
        return outGrpOutGrm04LnsLoanAccountDrvWorkLstYrIntDbAmn;
    }

    /**
     * Sets the value of the outGrpOutGrm04LnsLoanAccountDrvWorkLstYrIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm04LnsLoanAccountDrvWorkLstYrIntDbAmn(BigDecimal value) {
        this.outGrpOutGrm04LnsLoanAccountDrvWorkLstYrIntDbAmn = value;
    }

    /**
     * Gets the value of the outGrpOutGrm04LnsLoanAccountDrvWorkNrmAccountBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm04LnsLoanAccountDrvWorkNrmAccountBal() {
        return outGrpOutGrm04LnsLoanAccountDrvWorkNrmAccountBal;
    }

    /**
     * Sets the value of the outGrpOutGrm04LnsLoanAccountDrvWorkNrmAccountBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm04LnsLoanAccountDrvWorkNrmAccountBal(BigDecimal value) {
        this.outGrpOutGrm04LnsLoanAccountDrvWorkNrmAccountBal = value;
    }

    /**
     * Gets the value of the outGrpOutGrm04LnsLoanAccountDrvWorkOvAccountBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm04LnsLoanAccountDrvWorkOvAccountBal() {
        return outGrpOutGrm04LnsLoanAccountDrvWorkOvAccountBal;
    }

    /**
     * Sets the value of the outGrpOutGrm04LnsLoanAccountDrvWorkOvAccountBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm04LnsLoanAccountDrvWorkOvAccountBal(BigDecimal value) {
        this.outGrpOutGrm04LnsLoanAccountDrvWorkOvAccountBal = value;
    }

    /**
     * Gets the value of the outGrpOutGrm04LnsLoanAccountDrvWorkTotPaymentAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm04LnsLoanAccountDrvWorkTotPaymentAmn() {
        return outGrpOutGrm04LnsLoanAccountDrvWorkTotPaymentAmn;
    }

    /**
     * Sets the value of the outGrpOutGrm04LnsLoanAccountDrvWorkTotPaymentAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm04LnsLoanAccountDrvWorkTotPaymentAmn(BigDecimal value) {
        this.outGrpOutGrm04LnsLoanAccountDrvWorkTotPaymentAmn = value;
    }

    /**
     * Gets the value of the outGrpOutGrm14LgLgAccountAccLimitAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm14LgLgAccountAccLimitAmn() {
        return outGrpOutGrm14LgLgAccountAccLimitAmn;
    }

    /**
     * Sets the value of the outGrpOutGrm14LgLgAccountAccLimitAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm14LgLgAccountAccLimitAmn(BigDecimal value) {
        this.outGrpOutGrm14LgLgAccountAccLimitAmn = value;
    }

    /**
     * Gets the value of the outGrpOutGrm14LgLgAccountAccSn property.
     * 
     */
    public double getOutGrpOutGrm14LgLgAccountAccSn() {
        return outGrpOutGrm14LgLgAccountAccSn;
    }

    /**
     * Sets the value of the outGrpOutGrm14LgLgAccountAccSn property.
     * 
     */
    public void setOutGrpOutGrm14LgLgAccountAccSn(double value) {
        this.outGrpOutGrm14LgLgAccountAccSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrm14LgLgAccountAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrm14LgLgAccountAccStatus() {
        return outGrpOutGrm14LgLgAccountAccStatus;
    }

    /**
     * Sets the value of the outGrpOutGrm14LgLgAccountAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrm14LgLgAccountAccStatus(String value) {
        this.outGrpOutGrm14LgLgAccountAccStatus = value;
    }

    /**
     * Gets the value of the outGrpOutGrm14LgLgAccountCommissionBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm14LgLgAccountCommissionBal() {
        return outGrpOutGrm14LgLgAccountCommissionBal;
    }

    /**
     * Sets the value of the outGrpOutGrm14LgLgAccountCommissionBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm14LgLgAccountCommissionBal(BigDecimal value) {
        this.outGrpOutGrm14LgLgAccountCommissionBal = value;
    }

    /**
     * Gets the value of the outGrpOutGrm14LgLgAccountDefaultAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm14LgLgAccountDefaultAmn() {
        return outGrpOutGrm14LgLgAccountDefaultAmn;
    }

    /**
     * Sets the value of the outGrpOutGrm14LgLgAccountDefaultAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm14LgLgAccountDefaultAmn(BigDecimal value) {
        this.outGrpOutGrm14LgLgAccountDefaultAmn = value;
    }

    /**
     * Gets the value of the outGrpOutGrm14LgLgAccountExpenseBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm14LgLgAccountExpenseBal() {
        return outGrpOutGrm14LgLgAccountExpenseBal;
    }

    /**
     * Sets the value of the outGrpOutGrm14LgLgAccountExpenseBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm14LgLgAccountExpenseBal(BigDecimal value) {
        this.outGrpOutGrm14LgLgAccountExpenseBal = value;
    }

    /**
     * Gets the value of the outGrpOutGrm14LgLgAccountExpirationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrm14LgLgAccountExpirationType() {
        return outGrpOutGrm14LgLgAccountExpirationType;
    }

    /**
     * Sets the value of the outGrpOutGrm14LgLgAccountExpirationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrm14LgLgAccountExpirationType(String value) {
        this.outGrpOutGrm14LgLgAccountExpirationType = value;
    }

    /**
     * Gets the value of the outGrpOutGrm14LgLgAccountIssuanceJustific property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrm14LgLgAccountIssuanceJustific() {
        return outGrpOutGrm14LgLgAccountIssuanceJustific;
    }

    /**
     * Sets the value of the outGrpOutGrm14LgLgAccountIssuanceJustific property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrm14LgLgAccountIssuanceJustific(String value) {
        this.outGrpOutGrm14LgLgAccountIssuanceJustific = value;
    }

    /**
     * Gets the value of the outGrpOutGrm14LgLgAccountLgAmountBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm14LgLgAccountLgAmountBal() {
        return outGrpOutGrm14LgLgAccountLgAmountBal;
    }

    /**
     * Sets the value of the outGrpOutGrm14LgLgAccountLgAmountBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm14LgLgAccountLgAmountBal(BigDecimal value) {
        this.outGrpOutGrm14LgLgAccountLgAmountBal = value;
    }

    /**
     * Gets the value of the outGrpOutGrm14LgLgAccountLgInitialAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm14LgLgAccountLgInitialAmn() {
        return outGrpOutGrm14LgLgAccountLgInitialAmn;
    }

    /**
     * Sets the value of the outGrpOutGrm14LgLgAccountLgInitialAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm14LgLgAccountLgInitialAmn(BigDecimal value) {
        this.outGrpOutGrm14LgLgAccountLgInitialAmn = value;
    }

    /**
     * Gets the value of the outGrpOutGrm14LgLgAccountObligationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrm14LgLgAccountObligationStatus() {
        return outGrpOutGrm14LgLgAccountObligationStatus;
    }

    /**
     * Sets the value of the outGrpOutGrm14LgLgAccountObligationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrm14LgLgAccountObligationStatus(String value) {
        this.outGrpOutGrm14LgLgAccountObligationStatus = value;
    }

    /**
     * Gets the value of the outGrpOutGrm14LgLgAccountRqDefaultAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm14LgLgAccountRqDefaultAmn() {
        return outGrpOutGrm14LgLgAccountRqDefaultAmn;
    }

    /**
     * Sets the value of the outGrpOutGrm14LgLgAccountRqDefaultAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm14LgLgAccountRqDefaultAmn(BigDecimal value) {
        this.outGrpOutGrm14LgLgAccountRqDefaultAmn = value;
    }

    /**
     * Gets the value of the outGrpOutGrm18ScrTotCustomerPositionTotalsScrAkEvalTot property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm18ScrTotCustomerPositionTotalsScrAkEvalTot() {
        return outGrpOutGrm18ScrTotCustomerPositionTotalsScrAkEvalTot;
    }

    /**
     * Sets the value of the outGrpOutGrm18ScrTotCustomerPositionTotalsScrAkEvalTot property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm18ScrTotCustomerPositionTotalsScrAkEvalTot(BigDecimal value) {
        this.outGrpOutGrm18ScrTotCustomerPositionTotalsScrAkEvalTot = value;
    }

    /**
     * Gets the value of the outGrpOutGrm18ScrTotCustomerPositionTotalsScrAkShrTot property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm18ScrTotCustomerPositionTotalsScrAkShrTot() {
        return outGrpOutGrm18ScrTotCustomerPositionTotalsScrAkShrTot;
    }

    /**
     * Sets the value of the outGrpOutGrm18ScrTotCustomerPositionTotalsScrAkShrTot property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm18ScrTotCustomerPositionTotalsScrAkShrTot(BigDecimal value) {
        this.outGrpOutGrm18ScrTotCustomerPositionTotalsScrAkShrTot = value;
    }

    /**
     * Gets the value of the outGrpOutGrm18ScrTotCustomerPositionTotalsScrAkddTot property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm18ScrTotCustomerPositionTotalsScrAkddTot() {
        return outGrpOutGrm18ScrTotCustomerPositionTotalsScrAkddTot;
    }

    /**
     * Sets the value of the outGrpOutGrm18ScrTotCustomerPositionTotalsScrAkddTot property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm18ScrTotCustomerPositionTotalsScrAkddTot(BigDecimal value) {
        this.outGrpOutGrm18ScrTotCustomerPositionTotalsScrAkddTot = value;
    }

    /**
     * Gets the value of the outGrpOutGrm18ScrTotCustomerPositionTotalsScrBondTot property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm18ScrTotCustomerPositionTotalsScrBondTot() {
        return outGrpOutGrm18ScrTotCustomerPositionTotalsScrBondTot;
    }

    /**
     * Sets the value of the outGrpOutGrm18ScrTotCustomerPositionTotalsScrBondTot property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm18ScrTotCustomerPositionTotalsScrBondTot(BigDecimal value) {
        this.outGrpOutGrm18ScrTotCustomerPositionTotalsScrBondTot = value;
    }

    /**
     * Gets the value of the outGrpOutGrm18ScrTotCustomerPositionTotalsScrRepoTot property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm18ScrTotCustomerPositionTotalsScrRepoTot() {
        return outGrpOutGrm18ScrTotCustomerPositionTotalsScrRepoTot;
    }

    /**
     * Sets the value of the outGrpOutGrm18ScrTotCustomerPositionTotalsScrRepoTot property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm18ScrTotCustomerPositionTotalsScrRepoTot(BigDecimal value) {
        this.outGrpOutGrm18ScrTotCustomerPositionTotalsScrRepoTot = value;
    }

    /**
     * Gets the value of the outGrpOutGrm18ScrTraccountAccKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrm18ScrTraccountAccKind() {
        return outGrpOutGrm18ScrTraccountAccKind;
    }

    /**
     * Sets the value of the outGrpOutGrm18ScrTraccountAccKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrm18ScrTraccountAccKind(String value) {
        this.outGrpOutGrm18ScrTraccountAccKind = value;
    }

    /**
     * Gets the value of the outGrpOutGrm18ScrTraccountEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrm18ScrTraccountEntryStatus() {
        return outGrpOutGrm18ScrTraccountEntryStatus;
    }

    /**
     * Sets the value of the outGrpOutGrm18ScrTraccountEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrm18ScrTraccountEntryStatus(String value) {
        this.outGrpOutGrm18ScrTraccountEntryStatus = value;
    }

    /**
     * Gets the value of the outGrpOutGrm18ScrTraccountSecuritiesType property.
     * 
     */
    public short getOutGrpOutGrm18ScrTraccountSecuritiesType() {
        return outGrpOutGrm18ScrTraccountSecuritiesType;
    }

    /**
     * Sets the value of the outGrpOutGrm18ScrTraccountSecuritiesType property.
     * 
     */
    public void setOutGrpOutGrm18ScrTraccountSecuritiesType(short value) {
        this.outGrpOutGrm18ScrTraccountSecuritiesType = value;
    }

    /**
     * Gets the value of the outGrpOutGrm19AgrAgreementAccKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrm19AgrAgreementAccKind() {
        return outGrpOutGrm19AgrAgreementAccKind;
    }

    /**
     * Sets the value of the outGrpOutGrm19AgrAgreementAccKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrm19AgrAgreementAccKind(String value) {
        this.outGrpOutGrm19AgrAgreementAccKind = value;
    }

    /**
     * Gets the value of the outGrpOutGrm19AgrAgreementAgrBlockedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm19AgrAgreementAgrBlockedLimit() {
        return outGrpOutGrm19AgrAgreementAgrBlockedLimit;
    }

    /**
     * Sets the value of the outGrpOutGrm19AgrAgreementAgrBlockedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm19AgrAgreementAgrBlockedLimit(BigDecimal value) {
        this.outGrpOutGrm19AgrAgreementAgrBlockedLimit = value;
    }

    /**
     * Gets the value of the outGrpOutGrm19AgrAgreementAgrLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm19AgrAgreementAgrLimit() {
        return outGrpOutGrm19AgrAgreementAgrLimit;
    }

    /**
     * Sets the value of the outGrpOutGrm19AgrAgreementAgrLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm19AgrAgreementAgrLimit(BigDecimal value) {
        this.outGrpOutGrm19AgrAgreementAgrLimit = value;
    }

    /**
     * Gets the value of the outGrpOutGrm19AgrAgreementAgrLimitInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrm19AgrAgreementAgrLimitInd() {
        return outGrpOutGrm19AgrAgreementAgrLimitInd;
    }

    /**
     * Sets the value of the outGrpOutGrm19AgrAgreementAgrLimitInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrm19AgrAgreementAgrLimitInd(String value) {
        this.outGrpOutGrm19AgrAgreementAgrLimitInd = value;
    }

    /**
     * Gets the value of the outGrpOutGrm19AgrAgreementAgrMembershipSn property.
     * 
     */
    public int getOutGrpOutGrm19AgrAgreementAgrMembershipSn() {
        return outGrpOutGrm19AgrAgreementAgrMembershipSn;
    }

    /**
     * Sets the value of the outGrpOutGrm19AgrAgreementAgrMembershipSn property.
     * 
     */
    public void setOutGrpOutGrm19AgrAgreementAgrMembershipSn(int value) {
        this.outGrpOutGrm19AgrAgreementAgrMembershipSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrm19AgrAgreementAgrSigningDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrm19AgrAgreementAgrSigningDt() {
        return outGrpOutGrm19AgrAgreementAgrSigningDt;
    }

    /**
     * Sets the value of the outGrpOutGrm19AgrAgreementAgrSigningDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrm19AgrAgreementAgrSigningDt(XMLGregorianCalendar value) {
        this.outGrpOutGrm19AgrAgreementAgrSigningDt = value;
    }

    /**
     * Gets the value of the outGrpOutGrm19AgrAgreementAgrSn property.
     * 
     */
    public int getOutGrpOutGrm19AgrAgreementAgrSn() {
        return outGrpOutGrm19AgrAgreementAgrSn;
    }

    /**
     * Sets the value of the outGrpOutGrm19AgrAgreementAgrSn property.
     * 
     */
    public void setOutGrpOutGrm19AgrAgreementAgrSn(int value) {
        this.outGrpOutGrm19AgrAgreementAgrSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrm19AgrAgreementAgrStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrm19AgrAgreementAgrStatus() {
        return outGrpOutGrm19AgrAgreementAgrStatus;
    }

    /**
     * Sets the value of the outGrpOutGrm19AgrAgreementAgrStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrm19AgrAgreementAgrStatus(String value) {
        this.outGrpOutGrm19AgrAgreementAgrStatus = value;
    }

    /**
     * Gets the value of the outGrpOutGrm19AgrAgreementAgrUtilisedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrm19AgrAgreementAgrUtilisedLimit() {
        return outGrpOutGrm19AgrAgreementAgrUtilisedLimit;
    }

    /**
     * Sets the value of the outGrpOutGrm19AgrAgreementAgrUtilisedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrm19AgrAgreementAgrUtilisedLimit(BigDecimal value) {
        this.outGrpOutGrm19AgrAgreementAgrUtilisedLimit = value;
    }

    /**
     * Gets the value of the outGrpOutGrm19AgrAgreementAgrYear property.
     * 
     */
    public short getOutGrpOutGrm19AgrAgreementAgrYear() {
        return outGrpOutGrm19AgrAgreementAgrYear;
    }

    /**
     * Sets the value of the outGrpOutGrm19AgrAgreementAgrYear property.
     * 
     */
    public void setOutGrpOutGrm19AgrAgreementAgrYear(short value) {
        this.outGrpOutGrm19AgrAgreementAgrYear = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccAgreementProfitsAccountAccountCd property.
     * 
     */
    public short getOutGrpOutGrmAccAgreementProfitsAccountAccountCd() {
        return outGrpOutGrmAccAgreementProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outGrpOutGrmAccAgreementProfitsAccountAccountCd property.
     * 
     */
    public void setOutGrpOutGrmAccAgreementProfitsAccountAccountCd(short value) {
        this.outGrpOutGrmAccAgreementProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccAgreementProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmAccAgreementProfitsAccountAccountNumber() {
        return outGrpOutGrmAccAgreementProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outGrpOutGrmAccAgreementProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmAccAgreementProfitsAccountAccountNumber(String value) {
        this.outGrpOutGrmAccAgreementProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccAgreementProfitsAccountPrftSystem property.
     * 
     */
    public short getOutGrpOutGrmAccAgreementProfitsAccountPrftSystem() {
        return outGrpOutGrmAccAgreementProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the outGrpOutGrmAccAgreementProfitsAccountPrftSystem property.
     * 
     */
    public void setOutGrpOutGrmAccAgreementProfitsAccountPrftSystem(short value) {
        this.outGrpOutGrmAccAgreementProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the outGrpOutGrmColAccAvailIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmColAccAvailIefSuppliedAmount() {
        return outGrpOutGrmColAccAvailIefSuppliedAmount;
    }

    /**
     * Sets the value of the outGrpOutGrmColAccAvailIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmColAccAvailIefSuppliedAmount(BigDecimal value) {
        this.outGrpOutGrmColAccAvailIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the outGrpOutGrmColAccUtilIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmColAccUtilIefSuppliedAmount() {
        return outGrpOutGrmColAccUtilIefSuppliedAmount;
    }

    /**
     * Sets the value of the outGrpOutGrmColAccUtilIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmColAccUtilIefSuppliedAmount(BigDecimal value) {
        this.outGrpOutGrmColAccUtilIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the outGrpOutGrmColAccountCollateralLimitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmColAccountCollateralLimitsAccountNumber() {
        return outGrpOutGrmColAccountCollateralLimitsAccountNumber;
    }

    /**
     * Sets the value of the outGrpOutGrmColAccountCollateralLimitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmColAccountCollateralLimitsAccountNumber(String value) {
        this.outGrpOutGrmColAccountCollateralLimitsAccountNumber = value;
    }

    /**
     * Gets the value of the outGrpOutGrmColAccountCollateralLimitsHistoryCnt property.
     * 
     */
    public double getOutGrpOutGrmColAccountCollateralLimitsHistoryCnt() {
        return outGrpOutGrmColAccountCollateralLimitsHistoryCnt;
    }

    /**
     * Sets the value of the outGrpOutGrmColAccountCollateralLimitsHistoryCnt property.
     * 
     */
    public void setOutGrpOutGrmColAccountCollateralLimitsHistoryCnt(double value) {
        this.outGrpOutGrmColAccountCollateralLimitsHistoryCnt = value;
    }

    /**
     * Gets the value of the outGrpOutGrmColAccountCollateralLimitsIdCurrency property.
     * 
     */
    public int getOutGrpOutGrmColAccountCollateralLimitsIdCurrency() {
        return outGrpOutGrmColAccountCollateralLimitsIdCurrency;
    }

    /**
     * Sets the value of the outGrpOutGrmColAccountCollateralLimitsIdCurrency property.
     * 
     */
    public void setOutGrpOutGrmColAccountCollateralLimitsIdCurrency(int value) {
        this.outGrpOutGrmColAccountCollateralLimitsIdCurrency = value;
    }

    /**
     * Gets the value of the outGrpOutGrmColAccountCollateralLimitsLiqLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmColAccountCollateralLimitsLiqLimit() {
        return outGrpOutGrmColAccountCollateralLimitsLiqLimit;
    }

    /**
     * Sets the value of the outGrpOutGrmColAccountCollateralLimitsLiqLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmColAccountCollateralLimitsLiqLimit(BigDecimal value) {
        this.outGrpOutGrmColAccountCollateralLimitsLiqLimit = value;
    }

    /**
     * Gets the value of the outGrpOutGrmColAccountCollateralLimitsLiqUtil property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmColAccountCollateralLimitsLiqUtil() {
        return outGrpOutGrmColAccountCollateralLimitsLiqUtil;
    }

    /**
     * Sets the value of the outGrpOutGrmColAccountCollateralLimitsLiqUtil property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmColAccountCollateralLimitsLiqUtil(BigDecimal value) {
        this.outGrpOutGrmColAccountCollateralLimitsLiqUtil = value;
    }

    /**
     * Gets the value of the outGrpOutGrmColAccountCollateralLimitsNoLiqLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmColAccountCollateralLimitsNoLiqLimit() {
        return outGrpOutGrmColAccountCollateralLimitsNoLiqLimit;
    }

    /**
     * Sets the value of the outGrpOutGrmColAccountCollateralLimitsNoLiqLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmColAccountCollateralLimitsNoLiqLimit(BigDecimal value) {
        this.outGrpOutGrmColAccountCollateralLimitsNoLiqLimit = value;
    }

    /**
     * Gets the value of the outGrpOutGrmColAccountCollateralLimitsNoLiqUtil property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmColAccountCollateralLimitsNoLiqUtil() {
        return outGrpOutGrmColAccountCollateralLimitsNoLiqUtil;
    }

    /**
     * Sets the value of the outGrpOutGrmColAccountCollateralLimitsNoLiqUtil property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmColAccountCollateralLimitsNoLiqUtil(BigDecimal value) {
        this.outGrpOutGrmColAccountCollateralLimitsNoLiqUtil = value;
    }

    /**
     * Gets the value of the outGrpOutGrmColAccountCollateralLimitsPrftSystem property.
     * 
     */
    public short getOutGrpOutGrmColAccountCollateralLimitsPrftSystem() {
        return outGrpOutGrmColAccountCollateralLimitsPrftSystem;
    }

    /**
     * Sets the value of the outGrpOutGrmColAccountCollateralLimitsPrftSystem property.
     * 
     */
    public void setOutGrpOutGrmColAccountCollateralLimitsPrftSystem(short value) {
        this.outGrpOutGrmColAccountCollateralLimitsPrftSystem = value;
    }

    /**
     * Gets the value of the outGrpOutGrmColAgrBalAgreementAgrBlockedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmColAgrBalAgreementAgrBlockedLimit() {
        return outGrpOutGrmColAgrBalAgreementAgrBlockedLimit;
    }

    /**
     * Sets the value of the outGrpOutGrmColAgrBalAgreementAgrBlockedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmColAgrBalAgreementAgrBlockedLimit(BigDecimal value) {
        this.outGrpOutGrmColAgrBalAgreementAgrBlockedLimit = value;
    }

    /**
     * Gets the value of the outGrpOutGrmColAgrBalAgreementAgrLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmColAgrBalAgreementAgrLimit() {
        return outGrpOutGrmColAgrBalAgreementAgrLimit;
    }

    /**
     * Sets the value of the outGrpOutGrmColAgrBalAgreementAgrLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmColAgrBalAgreementAgrLimit(BigDecimal value) {
        this.outGrpOutGrmColAgrBalAgreementAgrLimit = value;
    }

    /**
     * Gets the value of the outGrpOutGrmColAgrBalAgreementAgrUtilisedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmColAgrBalAgreementAgrUtilisedLimit() {
        return outGrpOutGrmColAgrBalAgreementAgrUtilisedLimit;
    }

    /**
     * Sets the value of the outGrpOutGrmColAgrBalAgreementAgrUtilisedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmColAgrBalAgreementAgrUtilisedLimit(BigDecimal value) {
        this.outGrpOutGrmColAgrBalAgreementAgrUtilisedLimit = value;
    }

    /**
     * Gets the value of the outGrpOutGrmColAgreementCollateralLimitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmColAgreementCollateralLimitsAccountNumber() {
        return outGrpOutGrmColAgreementCollateralLimitsAccountNumber;
    }

    /**
     * Sets the value of the outGrpOutGrmColAgreementCollateralLimitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmColAgreementCollateralLimitsAccountNumber(String value) {
        this.outGrpOutGrmColAgreementCollateralLimitsAccountNumber = value;
    }

    /**
     * Gets the value of the outGrpOutGrmColAgreementCollateralLimitsHistoryCnt property.
     * 
     */
    public double getOutGrpOutGrmColAgreementCollateralLimitsHistoryCnt() {
        return outGrpOutGrmColAgreementCollateralLimitsHistoryCnt;
    }

    /**
     * Sets the value of the outGrpOutGrmColAgreementCollateralLimitsHistoryCnt property.
     * 
     */
    public void setOutGrpOutGrmColAgreementCollateralLimitsHistoryCnt(double value) {
        this.outGrpOutGrmColAgreementCollateralLimitsHistoryCnt = value;
    }

    /**
     * Gets the value of the outGrpOutGrmColAgreementCollateralLimitsIdCurrency property.
     * 
     */
    public int getOutGrpOutGrmColAgreementCollateralLimitsIdCurrency() {
        return outGrpOutGrmColAgreementCollateralLimitsIdCurrency;
    }

    /**
     * Sets the value of the outGrpOutGrmColAgreementCollateralLimitsIdCurrency property.
     * 
     */
    public void setOutGrpOutGrmColAgreementCollateralLimitsIdCurrency(int value) {
        this.outGrpOutGrmColAgreementCollateralLimitsIdCurrency = value;
    }

    /**
     * Gets the value of the outGrpOutGrmColAgreementCollateralLimitsLiqLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmColAgreementCollateralLimitsLiqLimit() {
        return outGrpOutGrmColAgreementCollateralLimitsLiqLimit;
    }

    /**
     * Sets the value of the outGrpOutGrmColAgreementCollateralLimitsLiqLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmColAgreementCollateralLimitsLiqLimit(BigDecimal value) {
        this.outGrpOutGrmColAgreementCollateralLimitsLiqLimit = value;
    }

    /**
     * Gets the value of the outGrpOutGrmColAgreementCollateralLimitsLiqUtil property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmColAgreementCollateralLimitsLiqUtil() {
        return outGrpOutGrmColAgreementCollateralLimitsLiqUtil;
    }

    /**
     * Sets the value of the outGrpOutGrmColAgreementCollateralLimitsLiqUtil property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmColAgreementCollateralLimitsLiqUtil(BigDecimal value) {
        this.outGrpOutGrmColAgreementCollateralLimitsLiqUtil = value;
    }

    /**
     * Gets the value of the outGrpOutGrmColAgreementCollateralLimitsNoLiqLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmColAgreementCollateralLimitsNoLiqLimit() {
        return outGrpOutGrmColAgreementCollateralLimitsNoLiqLimit;
    }

    /**
     * Sets the value of the outGrpOutGrmColAgreementCollateralLimitsNoLiqLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmColAgreementCollateralLimitsNoLiqLimit(BigDecimal value) {
        this.outGrpOutGrmColAgreementCollateralLimitsNoLiqLimit = value;
    }

    /**
     * Gets the value of the outGrpOutGrmColAgreementCollateralLimitsNoLiqUtil property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmColAgreementCollateralLimitsNoLiqUtil() {
        return outGrpOutGrmColAgreementCollateralLimitsNoLiqUtil;
    }

    /**
     * Sets the value of the outGrpOutGrmColAgreementCollateralLimitsNoLiqUtil property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmColAgreementCollateralLimitsNoLiqUtil(BigDecimal value) {
        this.outGrpOutGrmColAgreementCollateralLimitsNoLiqUtil = value;
    }

    /**
     * Gets the value of the outGrpOutGrmColAgreementCollateralLimitsPrftSystem property.
     * 
     */
    public short getOutGrpOutGrmColAgreementCollateralLimitsPrftSystem() {
        return outGrpOutGrmColAgreementCollateralLimitsPrftSystem;
    }

    /**
     * Sets the value of the outGrpOutGrmColAgreementCollateralLimitsPrftSystem property.
     * 
     */
    public void setOutGrpOutGrmColAgreementCollateralLimitsPrftSystem(short value) {
        this.outGrpOutGrmColAgreementCollateralLimitsPrftSystem = value;
    }

    /**
     * Gets the value of the outGrpOutGrmColCrlineCustomerCreditLineCrlineAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmColCrlineCustomerCreditLineCrlineAmount() {
        return outGrpOutGrmColCrlineCustomerCreditLineCrlineAmount;
    }

    /**
     * Sets the value of the outGrpOutGrmColCrlineCustomerCreditLineCrlineAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmColCrlineCustomerCreditLineCrlineAmount(BigDecimal value) {
        this.outGrpOutGrmColCrlineCustomerCreditLineCrlineAmount = value;
    }

    /**
     * Gets the value of the outGrpOutGrmColCrlineCustomerCreditLineEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmColCrlineCustomerCreditLineEntryStatus() {
        return outGrpOutGrmColCrlineCustomerCreditLineEntryStatus;
    }

    /**
     * Sets the value of the outGrpOutGrmColCrlineCustomerCreditLineEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmColCrlineCustomerCreditLineEntryStatus(String value) {
        this.outGrpOutGrmColCrlineCustomerCreditLineEntryStatus = value;
    }

    /**
     * Gets the value of the outGrpOutGrmColCrlineCustomerCreditLineExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmColCrlineCustomerCreditLineExpiryDate() {
        return outGrpOutGrmColCrlineCustomerCreditLineExpiryDate;
    }

    /**
     * Sets the value of the outGrpOutGrmColCrlineCustomerCreditLineExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmColCrlineCustomerCreditLineExpiryDate(XMLGregorianCalendar value) {
        this.outGrpOutGrmColCrlineCustomerCreditLineExpiryDate = value;
    }

    /**
     * Gets the value of the outGrpOutGrmColCrlineCustomerCreditLineHistoryCnt property.
     * 
     */
    public double getOutGrpOutGrmColCrlineCustomerCreditLineHistoryCnt() {
        return outGrpOutGrmColCrlineCustomerCreditLineHistoryCnt;
    }

    /**
     * Sets the value of the outGrpOutGrmColCrlineCustomerCreditLineHistoryCnt property.
     * 
     */
    public void setOutGrpOutGrmColCrlineCustomerCreditLineHistoryCnt(double value) {
        this.outGrpOutGrmColCrlineCustomerCreditLineHistoryCnt = value;
    }

    /**
     * Gets the value of the outGrpOutGrmColCrlineCustomerCreditLineTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmColCrlineCustomerCreditLineTmstamp() {
        return outGrpOutGrmColCrlineCustomerCreditLineTmstamp;
    }

    /**
     * Sets the value of the outGrpOutGrmColCrlineCustomerCreditLineTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmColCrlineCustomerCreditLineTmstamp(XMLGregorianCalendar value) {
        this.outGrpOutGrmColCrlineCustomerCreditLineTmstamp = value;
    }

    /**
     * Gets the value of the outGrpOutGrmColCrlineCustomerCreditLineUtilisedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmColCrlineCustomerCreditLineUtilisedAmount() {
        return outGrpOutGrmColCrlineCustomerCreditLineUtilisedAmount;
    }

    /**
     * Sets the value of the outGrpOutGrmColCrlineCustomerCreditLineUtilisedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmColCrlineCustomerCreditLineUtilisedAmount(BigDecimal value) {
        this.outGrpOutGrmColCrlineCustomerCreditLineUtilisedAmount = value;
    }

    /**
     * Gets the value of the outGrpOutGrmColCrlineGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmColCrlineGenericDetailDescription() {
        return outGrpOutGrmColCrlineGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpOutGrmColCrlineGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmColCrlineGenericDetailDescription(String value) {
        this.outGrpOutGrmColCrlineGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpOutGrmColCrlineGenericDetailSerialNum property.
     * 
     */
    public int getOutGrpOutGrmColCrlineGenericDetailSerialNum() {
        return outGrpOutGrmColCrlineGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outGrpOutGrmColCrlineGenericDetailSerialNum property.
     * 
     */
    public void setOutGrpOutGrmColCrlineGenericDetailSerialNum(int value) {
        this.outGrpOutGrmColCrlineGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outGrpOutGrmColMandatoryLoanWorkFlgsCollateralNecessary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmColMandatoryLoanWorkFlgsCollateralNecessary() {
        return outGrpOutGrmColMandatoryLoanWorkFlgsCollateralNecessary;
    }

    /**
     * Sets the value of the outGrpOutGrmColMandatoryLoanWorkFlgsCollateralNecessary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmColMandatoryLoanWorkFlgsCollateralNecessary(String value) {
        this.outGrpOutGrmColMandatoryLoanWorkFlgsCollateralNecessary = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCustomerAlertMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmCustomerAlertMsg() {
        return outGrpOutGrmCustomerAlertMsg;
    }

    /**
     * Sets the value of the outGrpOutGrmCustomerAlertMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmCustomerAlertMsg(String value) {
        this.outGrpOutGrmCustomerAlertMsg = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCustomerCDigit property.
     * 
     */
    public short getOutGrpOutGrmCustomerCDigit() {
        return outGrpOutGrmCustomerCDigit;
    }

    /**
     * Sets the value of the outGrpOutGrmCustomerCDigit property.
     * 
     */
    public void setOutGrpOutGrmCustomerCDigit(short value) {
        this.outGrpOutGrmCustomerCDigit = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCustomerCustId property.
     * 
     */
    public int getOutGrpOutGrmCustomerCustId() {
        return outGrpOutGrmCustomerCustId;
    }

    /**
     * Sets the value of the outGrpOutGrmCustomerCustId property.
     * 
     */
    public void setOutGrpOutGrmCustomerCustId(int value) {
        this.outGrpOutGrmCustomerCustId = value;
    }

    /**
     * Gets the value of the outGrpOutGrmErrorAccountWorkErrorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmErrorAccountWorkErrorMessage() {
        return outGrpOutGrmErrorAccountWorkErrorMessage;
    }

    /**
     * Sets the value of the outGrpOutGrmErrorAccountWorkErrorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmErrorAccountWorkErrorMessage(String value) {
        this.outGrpOutGrmErrorAccountWorkErrorMessage = value;
    }

    /**
     * Gets the value of the outGrpOutGrmInfoProfitsAccountAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmInfoProfitsAccountAccStatus() {
        return outGrpOutGrmInfoProfitsAccountAccStatus;
    }

    /**
     * Sets the value of the outGrpOutGrmInfoProfitsAccountAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmInfoProfitsAccountAccStatus(String value) {
        this.outGrpOutGrmInfoProfitsAccountAccStatus = value;
    }

    /**
     * Gets the value of the outGrpOutGrmInfoProfitsAccountAccountCd property.
     * 
     */
    public short getOutGrpOutGrmInfoProfitsAccountAccountCd() {
        return outGrpOutGrmInfoProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outGrpOutGrmInfoProfitsAccountAccountCd property.
     * 
     */
    public void setOutGrpOutGrmInfoProfitsAccountAccountCd(short value) {
        this.outGrpOutGrmInfoProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outGrpOutGrmInfoProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmInfoProfitsAccountAccountNumber() {
        return outGrpOutGrmInfoProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outGrpOutGrmInfoProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmInfoProfitsAccountAccountNumber(String value) {
        this.outGrpOutGrmInfoProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outGrpOutGrmInfoProfitsAccountAgrMembershipSn property.
     * 
     */
    public int getOutGrpOutGrmInfoProfitsAccountAgrMembershipSn() {
        return outGrpOutGrmInfoProfitsAccountAgrMembershipSn;
    }

    /**
     * Sets the value of the outGrpOutGrmInfoProfitsAccountAgrMembershipSn property.
     * 
     */
    public void setOutGrpOutGrmInfoProfitsAccountAgrMembershipSn(int value) {
        this.outGrpOutGrmInfoProfitsAccountAgrMembershipSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmInfoProfitsAccountAgrSn property.
     * 
     */
    public int getOutGrpOutGrmInfoProfitsAccountAgrSn() {
        return outGrpOutGrmInfoProfitsAccountAgrSn;
    }

    /**
     * Sets the value of the outGrpOutGrmInfoProfitsAccountAgrSn property.
     * 
     */
    public void setOutGrpOutGrmInfoProfitsAccountAgrSn(int value) {
        this.outGrpOutGrmInfoProfitsAccountAgrSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmInfoProfitsAccountAgrUnit property.
     * 
     */
    public int getOutGrpOutGrmInfoProfitsAccountAgrUnit() {
        return outGrpOutGrmInfoProfitsAccountAgrUnit;
    }

    /**
     * Sets the value of the outGrpOutGrmInfoProfitsAccountAgrUnit property.
     * 
     */
    public void setOutGrpOutGrmInfoProfitsAccountAgrUnit(int value) {
        this.outGrpOutGrmInfoProfitsAccountAgrUnit = value;
    }

    /**
     * Gets the value of the outGrpOutGrmInfoProfitsAccountAgrYear property.
     * 
     */
    public short getOutGrpOutGrmInfoProfitsAccountAgrYear() {
        return outGrpOutGrmInfoProfitsAccountAgrYear;
    }

    /**
     * Sets the value of the outGrpOutGrmInfoProfitsAccountAgrYear property.
     * 
     */
    public void setOutGrpOutGrmInfoProfitsAccountAgrYear(short value) {
        this.outGrpOutGrmInfoProfitsAccountAgrYear = value;
    }

    /**
     * Gets the value of the outGrpOutGrmInfoProfitsAccountCustId property.
     * 
     */
    public int getOutGrpOutGrmInfoProfitsAccountCustId() {
        return outGrpOutGrmInfoProfitsAccountCustId;
    }

    /**
     * Sets the value of the outGrpOutGrmInfoProfitsAccountCustId property.
     * 
     */
    public void setOutGrpOutGrmInfoProfitsAccountCustId(int value) {
        this.outGrpOutGrmInfoProfitsAccountCustId = value;
    }

    /**
     * Gets the value of the outGrpOutGrmInfoProfitsAccountDepAccNumber property.
     * 
     */
    public double getOutGrpOutGrmInfoProfitsAccountDepAccNumber() {
        return outGrpOutGrmInfoProfitsAccountDepAccNumber;
    }

    /**
     * Sets the value of the outGrpOutGrmInfoProfitsAccountDepAccNumber property.
     * 
     */
    public void setOutGrpOutGrmInfoProfitsAccountDepAccNumber(double value) {
        this.outGrpOutGrmInfoProfitsAccountDepAccNumber = value;
    }

    /**
     * Gets the value of the outGrpOutGrmInfoProfitsAccountDepOpenUnit property.
     * 
     */
    public int getOutGrpOutGrmInfoProfitsAccountDepOpenUnit() {
        return outGrpOutGrmInfoProfitsAccountDepOpenUnit;
    }

    /**
     * Sets the value of the outGrpOutGrmInfoProfitsAccountDepOpenUnit property.
     * 
     */
    public void setOutGrpOutGrmInfoProfitsAccountDepOpenUnit(int value) {
        this.outGrpOutGrmInfoProfitsAccountDepOpenUnit = value;
    }

    /**
     * Gets the value of the outGrpOutGrmInfoProfitsAccountLgAccSn property.
     * 
     */
    public double getOutGrpOutGrmInfoProfitsAccountLgAccSn() {
        return outGrpOutGrmInfoProfitsAccountLgAccSn;
    }

    /**
     * Sets the value of the outGrpOutGrmInfoProfitsAccountLgAccSn property.
     * 
     */
    public void setOutGrpOutGrmInfoProfitsAccountLgAccSn(double value) {
        this.outGrpOutGrmInfoProfitsAccountLgAccSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmInfoProfitsAccountLgOpenUnit property.
     * 
     */
    public int getOutGrpOutGrmInfoProfitsAccountLgOpenUnit() {
        return outGrpOutGrmInfoProfitsAccountLgOpenUnit;
    }

    /**
     * Sets the value of the outGrpOutGrmInfoProfitsAccountLgOpenUnit property.
     * 
     */
    public void setOutGrpOutGrmInfoProfitsAccountLgOpenUnit(int value) {
        this.outGrpOutGrmInfoProfitsAccountLgOpenUnit = value;
    }

    /**
     * Gets the value of the outGrpOutGrmInfoProfitsAccountLimitCurrency property.
     * 
     */
    public int getOutGrpOutGrmInfoProfitsAccountLimitCurrency() {
        return outGrpOutGrmInfoProfitsAccountLimitCurrency;
    }

    /**
     * Sets the value of the outGrpOutGrmInfoProfitsAccountLimitCurrency property.
     * 
     */
    public void setOutGrpOutGrmInfoProfitsAccountLimitCurrency(int value) {
        this.outGrpOutGrmInfoProfitsAccountLimitCurrency = value;
    }

    /**
     * Gets the value of the outGrpOutGrmInfoProfitsAccountLnsOpenUnit property.
     * 
     */
    public int getOutGrpOutGrmInfoProfitsAccountLnsOpenUnit() {
        return outGrpOutGrmInfoProfitsAccountLnsOpenUnit;
    }

    /**
     * Sets the value of the outGrpOutGrmInfoProfitsAccountLnsOpenUnit property.
     * 
     */
    public void setOutGrpOutGrmInfoProfitsAccountLnsOpenUnit(int value) {
        this.outGrpOutGrmInfoProfitsAccountLnsOpenUnit = value;
    }

    /**
     * Gets the value of the outGrpOutGrmInfoProfitsAccountLnsSn property.
     * 
     */
    public int getOutGrpOutGrmInfoProfitsAccountLnsSn() {
        return outGrpOutGrmInfoProfitsAccountLnsSn;
    }

    /**
     * Sets the value of the outGrpOutGrmInfoProfitsAccountLnsSn property.
     * 
     */
    public void setOutGrpOutGrmInfoProfitsAccountLnsSn(int value) {
        this.outGrpOutGrmInfoProfitsAccountLnsSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmInfoProfitsAccountLnsType property.
     * 
     */
    public short getOutGrpOutGrmInfoProfitsAccountLnsType() {
        return outGrpOutGrmInfoProfitsAccountLnsType;
    }

    /**
     * Sets the value of the outGrpOutGrmInfoProfitsAccountLnsType property.
     * 
     */
    public void setOutGrpOutGrmInfoProfitsAccountLnsType(short value) {
        this.outGrpOutGrmInfoProfitsAccountLnsType = value;
    }

    /**
     * Gets the value of the outGrpOutGrmInfoProfitsAccountMonotoringUnit property.
     * 
     */
    public int getOutGrpOutGrmInfoProfitsAccountMonotoringUnit() {
        return outGrpOutGrmInfoProfitsAccountMonotoringUnit;
    }

    /**
     * Sets the value of the outGrpOutGrmInfoProfitsAccountMonotoringUnit property.
     * 
     */
    public void setOutGrpOutGrmInfoProfitsAccountMonotoringUnit(int value) {
        this.outGrpOutGrmInfoProfitsAccountMonotoringUnit = value;
    }

    /**
     * Gets the value of the outGrpOutGrmInfoProfitsAccountMovementCurrency property.
     * 
     */
    public int getOutGrpOutGrmInfoProfitsAccountMovementCurrency() {
        return outGrpOutGrmInfoProfitsAccountMovementCurrency;
    }

    /**
     * Sets the value of the outGrpOutGrmInfoProfitsAccountMovementCurrency property.
     * 
     */
    public void setOutGrpOutGrmInfoProfitsAccountMovementCurrency(int value) {
        this.outGrpOutGrmInfoProfitsAccountMovementCurrency = value;
    }

    /**
     * Gets the value of the outGrpOutGrmInfoProfitsAccountPrftSystem property.
     * 
     */
    public short getOutGrpOutGrmInfoProfitsAccountPrftSystem() {
        return outGrpOutGrmInfoProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the outGrpOutGrmInfoProfitsAccountPrftSystem property.
     * 
     */
    public void setOutGrpOutGrmInfoProfitsAccountPrftSystem(short value) {
        this.outGrpOutGrmInfoProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the outGrpOutGrmInfoProfitsAccountProductId property.
     * 
     */
    public int getOutGrpOutGrmInfoProfitsAccountProductId() {
        return outGrpOutGrmInfoProfitsAccountProductId;
    }

    /**
     * Sets the value of the outGrpOutGrmInfoProfitsAccountProductId property.
     * 
     */
    public void setOutGrpOutGrmInfoProfitsAccountProductId(int value) {
        this.outGrpOutGrmInfoProfitsAccountProductId = value;
    }

    /**
     * Gets the value of the outGrpOutGrmInfoProfitsAccountTrOpenUnit property.
     * 
     */
    public int getOutGrpOutGrmInfoProfitsAccountTrOpenUnit() {
        return outGrpOutGrmInfoProfitsAccountTrOpenUnit;
    }

    /**
     * Sets the value of the outGrpOutGrmInfoProfitsAccountTrOpenUnit property.
     * 
     */
    public void setOutGrpOutGrmInfoProfitsAccountTrOpenUnit(int value) {
        this.outGrpOutGrmInfoProfitsAccountTrOpenUnit = value;
    }

    /**
     * Gets the value of the outGrpOutGrmInfoProfitsAccountTrSn property.
     * 
     */
    public int getOutGrpOutGrmInfoProfitsAccountTrSn() {
        return outGrpOutGrmInfoProfitsAccountTrSn;
    }

    /**
     * Sets the value of the outGrpOutGrmInfoProfitsAccountTrSn property.
     * 
     */
    public void setOutGrpOutGrmInfoProfitsAccountTrSn(int value) {
        this.outGrpOutGrmInfoProfitsAccountTrSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmInfoProfitsAccountTrType property.
     * 
     */
    public short getOutGrpOutGrmInfoProfitsAccountTrType() {
        return outGrpOutGrmInfoProfitsAccountTrType;
    }

    /**
     * Sets the value of the outGrpOutGrmInfoProfitsAccountTrType property.
     * 
     */
    public void setOutGrpOutGrmInfoProfitsAccountTrType(short value) {
        this.outGrpOutGrmInfoProfitsAccountTrType = value;
    }

    /**
     * Gets the value of the outGrpOutGrmLimitCurrencyIdCurrency property.
     * 
     */
    public int getOutGrpOutGrmLimitCurrencyIdCurrency() {
        return outGrpOutGrmLimitCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outGrpOutGrmLimitCurrencyIdCurrency property.
     * 
     */
    public void setOutGrpOutGrmLimitCurrencyIdCurrency(int value) {
        this.outGrpOutGrmLimitCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outGrpOutGrmLimitCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmLimitCurrencyShortDescr() {
        return outGrpOutGrmLimitCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpOutGrmLimitCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmLimitCurrencyShortDescr(String value) {
        this.outGrpOutGrmLimitCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGrpOutGrmMonitoringUnitCode property.
     * 
     */
    public int getOutGrpOutGrmMonitoringUnitCode() {
        return outGrpOutGrmMonitoringUnitCode;
    }

    /**
     * Sets the value of the outGrpOutGrmMonitoringUnitCode property.
     * 
     */
    public void setOutGrpOutGrmMonitoringUnitCode(int value) {
        this.outGrpOutGrmMonitoringUnitCode = value;
    }

    /**
     * Gets the value of the outGrpOutGrmMonitoringUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmMonitoringUnitUnitName() {
        return outGrpOutGrmMonitoringUnitUnitName;
    }

    /**
     * Sets the value of the outGrpOutGrmMonitoringUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmMonitoringUnitUnitName(String value) {
        this.outGrpOutGrmMonitoringUnitUnitName = value;
    }

    /**
     * Gets the value of the outGrpOutGrmMovementCurrencyIdCurrency property.
     * 
     */
    public int getOutGrpOutGrmMovementCurrencyIdCurrency() {
        return outGrpOutGrmMovementCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outGrpOutGrmMovementCurrencyIdCurrency property.
     * 
     */
    public void setOutGrpOutGrmMovementCurrencyIdCurrency(int value) {
        this.outGrpOutGrmMovementCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outGrpOutGrmMovementCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmMovementCurrencyShortDescr() {
        return outGrpOutGrmMovementCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpOutGrmMovementCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmMovementCurrencyShortDescr(String value) {
        this.outGrpOutGrmMovementCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGrpOutGrmNameListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmNameListSetDescription() {
        return outGrpOutGrmNameListSetDescription;
    }

    /**
     * Sets the value of the outGrpOutGrmNameListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmNameListSetDescription(String value) {
        this.outGrpOutGrmNameListSetDescription = value;
    }

    /**
     * Gets the value of the outGrpOutGrmOpeningUnitCode property.
     * 
     */
    public int getOutGrpOutGrmOpeningUnitCode() {
        return outGrpOutGrmOpeningUnitCode;
    }

    /**
     * Sets the value of the outGrpOutGrmOpeningUnitCode property.
     * 
     */
    public void setOutGrpOutGrmOpeningUnitCode(int value) {
        this.outGrpOutGrmOpeningUnitCode = value;
    }

    /**
     * Gets the value of the outGrpOutGrmOpeningUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmOpeningUnitUnitName() {
        return outGrpOutGrmOpeningUnitUnitName;
    }

    /**
     * Sets the value of the outGrpOutGrmOpeningUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmOpeningUnitUnitName(String value) {
        this.outGrpOutGrmOpeningUnitUnitName = value;
    }

    /**
     * Gets the value of the outGrpOutGrmProductProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmProductProductDescription() {
        return outGrpOutGrmProductProductDescription;
    }

    /**
     * Sets the value of the outGrpOutGrmProductProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmProductProductDescription(String value) {
        this.outGrpOutGrmProductProductDescription = value;
    }

    /**
     * Gets the value of the outGrpOutGrmProductProductIdProduct property.
     * 
     */
    public int getOutGrpOutGrmProductProductIdProduct() {
        return outGrpOutGrmProductProductIdProduct;
    }

    /**
     * Sets the value of the outGrpOutGrmProductProductIdProduct property.
     * 
     */
    public void setOutGrpOutGrmProductProductIdProduct(int value) {
        this.outGrpOutGrmProductProductIdProduct = value;
    }

    /**
     * Gets the value of the outGrpOutGrmProfitsAccountAccountCd property.
     * 
     */
    public short getOutGrpOutGrmProfitsAccountAccountCd() {
        return outGrpOutGrmProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outGrpOutGrmProfitsAccountAccountCd property.
     * 
     */
    public void setOutGrpOutGrmProfitsAccountAccountCd(short value) {
        this.outGrpOutGrmProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outGrpOutGrmProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmProfitsAccountAccountNumber() {
        return outGrpOutGrmProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outGrpOutGrmProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmProfitsAccountAccountNumber(String value) {
        this.outGrpOutGrmProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outGrpOutGrmProfitsAccountPrftSystem property.
     * 
     */
    public short getOutGrpOutGrmProfitsAccountPrftSystem() {
        return outGrpOutGrmProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the outGrpOutGrmProfitsAccountPrftSystem property.
     * 
     */
    public void setOutGrpOutGrmProfitsAccountPrftSystem(short value) {
        this.outGrpOutGrmProfitsAccountPrftSystem = value;
    }

}
