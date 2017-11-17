
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PRT098V_SingleProfitsAccountValidationExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PRT098V_SingleProfitsAccountValidationExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutAccAvailableIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAccUtilizedIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAgreementAgreementAccKind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementAgreementAgrBlockedLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAgreementAgreementAgrLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAgreementAgreementAgrLimitInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementAgreementAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAgreementAgrSigningDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutAgreementAgreementAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAgreementAgrStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementAgreementAgrUtilisedLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAgreementAgreementAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutAvailableToWithdrawIefSuppliedPayableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBalancesAccountCollateralLimitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBalancesAccountCollateralLimitsHistoryCnt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutBalancesAccountCollateralLimitsIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBalancesAccountCollateralLimitsLiqLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBalancesAccountCollateralLimitsLiqUtil" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBalancesAccountCollateralLimitsNoLiqLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBalancesAccountCollateralLimitsNoLiqUtil" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBalancesAccountCollateralLimitsPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBalancesAgreementAgrBlockedLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBalancesAgreementAgrLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBalancesAgreementAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBalancesAgreementAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBalancesAgreementAgrUtilisedLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBalancesAgreementAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBalancesAgreementCollateralLimitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBalancesAgreementCollateralLimitsHistoryCnt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutBalancesAgreementCollateralLimitsIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBalancesAgreementCollateralLimitsLiqLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBalancesAgreementCollateralLimitsLiqUtil" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBalancesAgreementCollateralLimitsNoLiqLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBalancesAgreementCollateralLimitsNoLiqUtil" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBalancesAgreementCollateralLimitsPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBalancesCreditLineGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBalancesCreditLineGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBalancesCreditLineGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBalancesCustomerCreditLineCrlineAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBalancesCustomerCreditLineEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBalancesCustomerCreditLineExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBalancesCustomerCreditLineHistoryCnt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutBalancesCustomerCreditLineTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBalancesCustomerCreditLineUtilisedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCollateralNecesssaryLoanWorkFlgsCollateralNecessary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustNameListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerAlertMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLimitCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLimitCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLnsBalancesLoanAccountDrvWorkAccBankBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLnsBalancesLoanAccountDrvWorkAccountBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLnsBalancesLoanAccountDrvWorkLstYrIntDbAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLnsBalancesLoanAccountDrvWorkNrmAccountBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLnsBalancesLoanAccountDrvWorkOvAccountBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLnsBalancesLoanAccountDrvWorkTotPaymentAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutMonitoringUnitUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMonitoringUnitUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMovementCurrencyCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMovementCurrencyCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOpenUnitUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOpenUnitUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedDepositAccountAvailableBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedDepositAccountBlockedBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedDepositAccountBookBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedDepositAccountEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDepositAccountForecastBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedDepositAccountUnclearBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedLgLgAccountAccLimitAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedLgLgAccountAccSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedLgLgAccountAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedLgLgAccountCommissionBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedLgLgAccountDefaultAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedLgLgAccountExpenseBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedLgLgAccountExpirationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedLgLgAccountIssuanceJustific" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedLgLgAccountLgAmountBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedLgLgAccountLgInitialAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedLgLgAccountObligationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedLgLgAccountRqDefaultAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedLoanAccountAccLimitAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedLoanAccountAccMechanism" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedLoanAccountAccSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedLoanAccountAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedLoanAccountAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedLoanAccountLoanStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedProfitsAccountAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedProfitsAccountAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountAgrUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedProfitsAccountCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountDepAccNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedProfitsAccountDepOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountLgAccSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedProfitsAccountLgOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountLimitCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountLnsOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountLnsSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountLnsType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedProfitsAccountMonotoringUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountMovementCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedProfitsAccountProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountTrOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountTrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountTrType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedTraccountAccKind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedTraccountEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedTraccountSecuritiesType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutShowAgreementProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutShowAgreementProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutStatusIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTotalsScrAccountCustomerPositionTotalsScrAkEvalTot" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotalsScrAccountCustomerPositionTotalsScrAkShrTot" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotalsScrAccountCustomerPositionTotalsScrAkddTot" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotalsScrAccountCustomerPositionTotalsScrBondTot" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotalsScrAccountCustomerPositionTotalsScrRepoTot" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRT098V_SingleProfitsAccountValidationExport", propOrder = {
    "outAccAvailableIefSuppliedAmount",
    "outAccUtilizedIefSuppliedAmount",
    "outAgreementAgreementAccKind",
    "outAgreementAgreementAgrBlockedLimit",
    "outAgreementAgreementAgrLimit",
    "outAgreementAgreementAgrLimitInd",
    "outAgreementAgreementAgrMembershipSn",
    "outAgreementAgreementAgrSigningDt",
    "outAgreementAgreementAgrSn",
    "outAgreementAgreementAgrStatus",
    "outAgreementAgreementAgrUtilisedLimit",
    "outAgreementAgreementAgrYear",
    "outAvailableToWithdrawIefSuppliedPayableAmount",
    "outBalancesAccountCollateralLimitsAccountNumber",
    "outBalancesAccountCollateralLimitsHistoryCnt",
    "outBalancesAccountCollateralLimitsIdCurrency",
    "outBalancesAccountCollateralLimitsLiqLimit",
    "outBalancesAccountCollateralLimitsLiqUtil",
    "outBalancesAccountCollateralLimitsNoLiqLimit",
    "outBalancesAccountCollateralLimitsNoLiqUtil",
    "outBalancesAccountCollateralLimitsPrftSystem",
    "outBalancesAgreementAgrBlockedLimit",
    "outBalancesAgreementAgrLimit",
    "outBalancesAgreementAgrMembershipSn",
    "outBalancesAgreementAgrSn",
    "outBalancesAgreementAgrUtilisedLimit",
    "outBalancesAgreementAgrYear",
    "outBalancesAgreementCollateralLimitsAccountNumber",
    "outBalancesAgreementCollateralLimitsHistoryCnt",
    "outBalancesAgreementCollateralLimitsIdCurrency",
    "outBalancesAgreementCollateralLimitsLiqLimit",
    "outBalancesAgreementCollateralLimitsLiqUtil",
    "outBalancesAgreementCollateralLimitsNoLiqLimit",
    "outBalancesAgreementCollateralLimitsNoLiqUtil",
    "outBalancesAgreementCollateralLimitsPrftSystem",
    "outBalancesCreditLineGenericDetailDescription",
    "outBalancesCreditLineGenericDetailParameterType",
    "outBalancesCreditLineGenericDetailSerialNum",
    "outBalancesCustomerCreditLineCrlineAmount",
    "outBalancesCustomerCreditLineEntryStatus",
    "outBalancesCustomerCreditLineExpiryDate",
    "outBalancesCustomerCreditLineHistoryCnt",
    "outBalancesCustomerCreditLineTmstamp",
    "outBalancesCustomerCreditLineUtilisedAmount",
    "outCollateralNecesssaryLoanWorkFlgsCollateralNecessary",
    "outCustNameListSetDescription",
    "outCustomerAlertMsg",
    "outCustomerCDigit",
    "outCustomerCustId",
    "outLimitCurrencyIdCurrency",
    "outLimitCurrencyShortDescr",
    "outLnsBalancesLoanAccountDrvWorkAccBankBal",
    "outLnsBalancesLoanAccountDrvWorkAccountBal",
    "outLnsBalancesLoanAccountDrvWorkLstYrIntDbAmn",
    "outLnsBalancesLoanAccountDrvWorkNrmAccountBal",
    "outLnsBalancesLoanAccountDrvWorkOvAccountBal",
    "outLnsBalancesLoanAccountDrvWorkTotPaymentAmn",
    "outMonitoringUnitUnitCode",
    "outMonitoringUnitUnitUnitName",
    "outMovementCurrencyCurrencyIdCurrency",
    "outMovementCurrencyCurrencyShortDescr",
    "outOpenUnitUnitCode",
    "outOpenUnitUnitUnitName",
    "outProductDescription",
    "outProductIdProduct",
    "outSelectedDepositAccountAccountNumber",
    "outSelectedDepositAccountAvailableBalance",
    "outSelectedDepositAccountBlockedBalance",
    "outSelectedDepositAccountBookBalance",
    "outSelectedDepositAccountCDigit",
    "outSelectedDepositAccountEntryStatus",
    "outSelectedDepositAccountForecastBalance",
    "outSelectedDepositAccountUnclearBalance",
    "outSelectedLgLgAccountAccLimitAmn",
    "outSelectedLgLgAccountAccSn",
    "outSelectedLgLgAccountAccStatus",
    "outSelectedLgLgAccountCommissionBal",
    "outSelectedLgLgAccountDefaultAmn",
    "outSelectedLgLgAccountExpenseBal",
    "outSelectedLgLgAccountExpirationType",
    "outSelectedLgLgAccountIssuanceJustific",
    "outSelectedLgLgAccountLgAmountBal",
    "outSelectedLgLgAccountLgInitialAmn",
    "outSelectedLgLgAccountObligationStatus",
    "outSelectedLgLgAccountRqDefaultAmn",
    "outSelectedLoanAccountAccLimitAmn",
    "outSelectedLoanAccountAccMechanism",
    "outSelectedLoanAccountAccSn",
    "outSelectedLoanAccountAccStatus",
    "outSelectedLoanAccountAccType",
    "outSelectedLoanAccountLoanStatus",
    "outSelectedProfitsAccountAccStatus",
    "outSelectedProfitsAccountAccountCd",
    "outSelectedProfitsAccountAccountNumber",
    "outSelectedProfitsAccountAgrMembershipSn",
    "outSelectedProfitsAccountAgrSn",
    "outSelectedProfitsAccountAgrUnit",
    "outSelectedProfitsAccountAgrYear",
    "outSelectedProfitsAccountCustId",
    "outSelectedProfitsAccountDepAccNumber",
    "outSelectedProfitsAccountDepOpenUnit",
    "outSelectedProfitsAccountLgAccSn",
    "outSelectedProfitsAccountLgOpenUnit",
    "outSelectedProfitsAccountLimitCurrency",
    "outSelectedProfitsAccountLnsOpenUnit",
    "outSelectedProfitsAccountLnsSn",
    "outSelectedProfitsAccountLnsType",
    "outSelectedProfitsAccountMonotoringUnit",
    "outSelectedProfitsAccountMovementCurrency",
    "outSelectedProfitsAccountPrftSystem",
    "outSelectedProfitsAccountProductId",
    "outSelectedProfitsAccountTrOpenUnit",
    "outSelectedProfitsAccountTrSn",
    "outSelectedProfitsAccountTrType",
    "outSelectedTraccountAccKind",
    "outSelectedTraccountEntryStatus",
    "outSelectedTraccountSecuritiesType",
    "outShowAgreementProfitsAccountAccountCd",
    "outShowAgreementProfitsAccountAccountNumber",
    "outStatusIefSuppliedActionEntryDesc",
    "outTotalsScrAccountCustomerPositionTotalsScrAkEvalTot",
    "outTotalsScrAccountCustomerPositionTotalsScrAkShrTot",
    "outTotalsScrAccountCustomerPositionTotalsScrAkddTot",
    "outTotalsScrAccountCustomerPositionTotalsScrBondTot",
    "outTotalsScrAccountCustomerPositionTotalsScrRepoTot"
})
public class PRT098VSingleProfitsAccountValidationExport
    extends BaseExport
{

    @XmlElement(name = "OutAccAvailableIefSuppliedAmount", required = true)
    protected BigDecimal outAccAvailableIefSuppliedAmount;
    @XmlElement(name = "OutAccUtilizedIefSuppliedAmount", required = true)
    protected BigDecimal outAccUtilizedIefSuppliedAmount;
    @XmlElement(name = "OutAgreementAgreementAccKind")
    protected String outAgreementAgreementAccKind;
    @XmlElement(name = "OutAgreementAgreementAgrBlockedLimit", required = true)
    protected BigDecimal outAgreementAgreementAgrBlockedLimit;
    @XmlElement(name = "OutAgreementAgreementAgrLimit", required = true)
    protected BigDecimal outAgreementAgreementAgrLimit;
    @XmlElement(name = "OutAgreementAgreementAgrLimitInd")
    protected String outAgreementAgreementAgrLimitInd;
    @XmlElement(name = "OutAgreementAgreementAgrMembershipSn")
    protected int outAgreementAgreementAgrMembershipSn;
    @XmlElement(name = "OutAgreementAgreementAgrSigningDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outAgreementAgreementAgrSigningDt;
    @XmlElement(name = "OutAgreementAgreementAgrSn")
    protected int outAgreementAgreementAgrSn;
    @XmlElement(name = "OutAgreementAgreementAgrStatus")
    protected String outAgreementAgreementAgrStatus;
    @XmlElement(name = "OutAgreementAgreementAgrUtilisedLimit", required = true)
    protected BigDecimal outAgreementAgreementAgrUtilisedLimit;
    @XmlElement(name = "OutAgreementAgreementAgrYear")
    protected short outAgreementAgreementAgrYear;
    @XmlElement(name = "OutAvailableToWithdrawIefSuppliedPayableAmount", required = true)
    protected BigDecimal outAvailableToWithdrawIefSuppliedPayableAmount;
    @XmlElement(name = "OutBalancesAccountCollateralLimitsAccountNumber")
    protected String outBalancesAccountCollateralLimitsAccountNumber;
    @XmlElement(name = "OutBalancesAccountCollateralLimitsHistoryCnt")
    protected double outBalancesAccountCollateralLimitsHistoryCnt;
    @XmlElement(name = "OutBalancesAccountCollateralLimitsIdCurrency")
    protected int outBalancesAccountCollateralLimitsIdCurrency;
    @XmlElement(name = "OutBalancesAccountCollateralLimitsLiqLimit", required = true)
    protected BigDecimal outBalancesAccountCollateralLimitsLiqLimit;
    @XmlElement(name = "OutBalancesAccountCollateralLimitsLiqUtil", required = true)
    protected BigDecimal outBalancesAccountCollateralLimitsLiqUtil;
    @XmlElement(name = "OutBalancesAccountCollateralLimitsNoLiqLimit", required = true)
    protected BigDecimal outBalancesAccountCollateralLimitsNoLiqLimit;
    @XmlElement(name = "OutBalancesAccountCollateralLimitsNoLiqUtil", required = true)
    protected BigDecimal outBalancesAccountCollateralLimitsNoLiqUtil;
    @XmlElement(name = "OutBalancesAccountCollateralLimitsPrftSystem")
    protected short outBalancesAccountCollateralLimitsPrftSystem;
    @XmlElement(name = "OutBalancesAgreementAgrBlockedLimit", required = true)
    protected BigDecimal outBalancesAgreementAgrBlockedLimit;
    @XmlElement(name = "OutBalancesAgreementAgrLimit", required = true)
    protected BigDecimal outBalancesAgreementAgrLimit;
    @XmlElement(name = "OutBalancesAgreementAgrMembershipSn")
    protected int outBalancesAgreementAgrMembershipSn;
    @XmlElement(name = "OutBalancesAgreementAgrSn")
    protected int outBalancesAgreementAgrSn;
    @XmlElement(name = "OutBalancesAgreementAgrUtilisedLimit", required = true)
    protected BigDecimal outBalancesAgreementAgrUtilisedLimit;
    @XmlElement(name = "OutBalancesAgreementAgrYear")
    protected short outBalancesAgreementAgrYear;
    @XmlElement(name = "OutBalancesAgreementCollateralLimitsAccountNumber")
    protected String outBalancesAgreementCollateralLimitsAccountNumber;
    @XmlElement(name = "OutBalancesAgreementCollateralLimitsHistoryCnt")
    protected double outBalancesAgreementCollateralLimitsHistoryCnt;
    @XmlElement(name = "OutBalancesAgreementCollateralLimitsIdCurrency")
    protected int outBalancesAgreementCollateralLimitsIdCurrency;
    @XmlElement(name = "OutBalancesAgreementCollateralLimitsLiqLimit", required = true)
    protected BigDecimal outBalancesAgreementCollateralLimitsLiqLimit;
    @XmlElement(name = "OutBalancesAgreementCollateralLimitsLiqUtil", required = true)
    protected BigDecimal outBalancesAgreementCollateralLimitsLiqUtil;
    @XmlElement(name = "OutBalancesAgreementCollateralLimitsNoLiqLimit", required = true)
    protected BigDecimal outBalancesAgreementCollateralLimitsNoLiqLimit;
    @XmlElement(name = "OutBalancesAgreementCollateralLimitsNoLiqUtil", required = true)
    protected BigDecimal outBalancesAgreementCollateralLimitsNoLiqUtil;
    @XmlElement(name = "OutBalancesAgreementCollateralLimitsPrftSystem")
    protected short outBalancesAgreementCollateralLimitsPrftSystem;
    @XmlElement(name = "OutBalancesCreditLineGenericDetailDescription")
    protected String outBalancesCreditLineGenericDetailDescription;
    @XmlElement(name = "OutBalancesCreditLineGenericDetailParameterType")
    protected String outBalancesCreditLineGenericDetailParameterType;
    @XmlElement(name = "OutBalancesCreditLineGenericDetailSerialNum")
    protected int outBalancesCreditLineGenericDetailSerialNum;
    @XmlElement(name = "OutBalancesCustomerCreditLineCrlineAmount", required = true)
    protected BigDecimal outBalancesCustomerCreditLineCrlineAmount;
    @XmlElement(name = "OutBalancesCustomerCreditLineEntryStatus")
    protected String outBalancesCustomerCreditLineEntryStatus;
    @XmlElement(name = "OutBalancesCustomerCreditLineExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBalancesCustomerCreditLineExpiryDate;
    @XmlElement(name = "OutBalancesCustomerCreditLineHistoryCnt")
    protected double outBalancesCustomerCreditLineHistoryCnt;
    @XmlElement(name = "OutBalancesCustomerCreditLineTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBalancesCustomerCreditLineTmstamp;
    @XmlElement(name = "OutBalancesCustomerCreditLineUtilisedAmount", required = true)
    protected BigDecimal outBalancesCustomerCreditLineUtilisedAmount;
    @XmlElement(name = "OutCollateralNecesssaryLoanWorkFlgsCollateralNecessary")
    protected String outCollateralNecesssaryLoanWorkFlgsCollateralNecessary;
    @XmlElement(name = "OutCustNameListSetDescription")
    protected String outCustNameListSetDescription;
    @XmlElement(name = "OutCustomerAlertMsg")
    protected String outCustomerAlertMsg;
    @XmlElement(name = "OutCustomerCDigit")
    protected short outCustomerCDigit;
    @XmlElement(name = "OutCustomerCustId")
    protected int outCustomerCustId;
    @XmlElement(name = "OutLimitCurrencyIdCurrency")
    protected int outLimitCurrencyIdCurrency;
    @XmlElement(name = "OutLimitCurrencyShortDescr")
    protected String outLimitCurrencyShortDescr;
    @XmlElement(name = "OutLnsBalancesLoanAccountDrvWorkAccBankBal", required = true)
    protected BigDecimal outLnsBalancesLoanAccountDrvWorkAccBankBal;
    @XmlElement(name = "OutLnsBalancesLoanAccountDrvWorkAccountBal", required = true)
    protected BigDecimal outLnsBalancesLoanAccountDrvWorkAccountBal;
    @XmlElement(name = "OutLnsBalancesLoanAccountDrvWorkLstYrIntDbAmn", required = true)
    protected BigDecimal outLnsBalancesLoanAccountDrvWorkLstYrIntDbAmn;
    @XmlElement(name = "OutLnsBalancesLoanAccountDrvWorkNrmAccountBal", required = true)
    protected BigDecimal outLnsBalancesLoanAccountDrvWorkNrmAccountBal;
    @XmlElement(name = "OutLnsBalancesLoanAccountDrvWorkOvAccountBal", required = true)
    protected BigDecimal outLnsBalancesLoanAccountDrvWorkOvAccountBal;
    @XmlElement(name = "OutLnsBalancesLoanAccountDrvWorkTotPaymentAmn", required = true)
    protected BigDecimal outLnsBalancesLoanAccountDrvWorkTotPaymentAmn;
    @XmlElement(name = "OutMonitoringUnitUnitCode")
    protected int outMonitoringUnitUnitCode;
    @XmlElement(name = "OutMonitoringUnitUnitUnitName")
    protected String outMonitoringUnitUnitUnitName;
    @XmlElement(name = "OutMovementCurrencyCurrencyIdCurrency")
    protected int outMovementCurrencyCurrencyIdCurrency;
    @XmlElement(name = "OutMovementCurrencyCurrencyShortDescr")
    protected String outMovementCurrencyCurrencyShortDescr;
    @XmlElement(name = "OutOpenUnitUnitCode")
    protected int outOpenUnitUnitCode;
    @XmlElement(name = "OutOpenUnitUnitUnitName")
    protected String outOpenUnitUnitUnitName;
    @XmlElement(name = "OutProductDescription")
    protected String outProductDescription;
    @XmlElement(name = "OutProductIdProduct")
    protected int outProductIdProduct;
    @XmlElement(name = "OutSelectedDepositAccountAccountNumber")
    protected double outSelectedDepositAccountAccountNumber;
    @XmlElement(name = "OutSelectedDepositAccountAvailableBalance", required = true)
    protected BigDecimal outSelectedDepositAccountAvailableBalance;
    @XmlElement(name = "OutSelectedDepositAccountBlockedBalance", required = true)
    protected BigDecimal outSelectedDepositAccountBlockedBalance;
    @XmlElement(name = "OutSelectedDepositAccountBookBalance", required = true)
    protected BigDecimal outSelectedDepositAccountBookBalance;
    @XmlElement(name = "OutSelectedDepositAccountCDigit")
    protected short outSelectedDepositAccountCDigit;
    @XmlElement(name = "OutSelectedDepositAccountEntryStatus")
    protected String outSelectedDepositAccountEntryStatus;
    @XmlElement(name = "OutSelectedDepositAccountForecastBalance", required = true)
    protected BigDecimal outSelectedDepositAccountForecastBalance;
    @XmlElement(name = "OutSelectedDepositAccountUnclearBalance", required = true)
    protected BigDecimal outSelectedDepositAccountUnclearBalance;
    @XmlElement(name = "OutSelectedLgLgAccountAccLimitAmn", required = true)
    protected BigDecimal outSelectedLgLgAccountAccLimitAmn;
    @XmlElement(name = "OutSelectedLgLgAccountAccSn")
    protected double outSelectedLgLgAccountAccSn;
    @XmlElement(name = "OutSelectedLgLgAccountAccStatus")
    protected String outSelectedLgLgAccountAccStatus;
    @XmlElement(name = "OutSelectedLgLgAccountCommissionBal", required = true)
    protected BigDecimal outSelectedLgLgAccountCommissionBal;
    @XmlElement(name = "OutSelectedLgLgAccountDefaultAmn", required = true)
    protected BigDecimal outSelectedLgLgAccountDefaultAmn;
    @XmlElement(name = "OutSelectedLgLgAccountExpenseBal", required = true)
    protected BigDecimal outSelectedLgLgAccountExpenseBal;
    @XmlElement(name = "OutSelectedLgLgAccountExpirationType")
    protected String outSelectedLgLgAccountExpirationType;
    @XmlElement(name = "OutSelectedLgLgAccountIssuanceJustific")
    protected String outSelectedLgLgAccountIssuanceJustific;
    @XmlElement(name = "OutSelectedLgLgAccountLgAmountBal", required = true)
    protected BigDecimal outSelectedLgLgAccountLgAmountBal;
    @XmlElement(name = "OutSelectedLgLgAccountLgInitialAmn", required = true)
    protected BigDecimal outSelectedLgLgAccountLgInitialAmn;
    @XmlElement(name = "OutSelectedLgLgAccountObligationStatus")
    protected String outSelectedLgLgAccountObligationStatus;
    @XmlElement(name = "OutSelectedLgLgAccountRqDefaultAmn", required = true)
    protected BigDecimal outSelectedLgLgAccountRqDefaultAmn;
    @XmlElement(name = "OutSelectedLoanAccountAccLimitAmn", required = true)
    protected BigDecimal outSelectedLoanAccountAccLimitAmn;
    @XmlElement(name = "OutSelectedLoanAccountAccMechanism")
    protected String outSelectedLoanAccountAccMechanism;
    @XmlElement(name = "OutSelectedLoanAccountAccSn")
    protected int outSelectedLoanAccountAccSn;
    @XmlElement(name = "OutSelectedLoanAccountAccStatus")
    protected String outSelectedLoanAccountAccStatus;
    @XmlElement(name = "OutSelectedLoanAccountAccType")
    protected short outSelectedLoanAccountAccType;
    @XmlElement(name = "OutSelectedLoanAccountLoanStatus")
    protected String outSelectedLoanAccountLoanStatus;
    @XmlElement(name = "OutSelectedProfitsAccountAccStatus")
    protected String outSelectedProfitsAccountAccStatus;
    @XmlElement(name = "OutSelectedProfitsAccountAccountCd")
    protected short outSelectedProfitsAccountAccountCd;
    @XmlElement(name = "OutSelectedProfitsAccountAccountNumber")
    protected String outSelectedProfitsAccountAccountNumber;
    @XmlElement(name = "OutSelectedProfitsAccountAgrMembershipSn")
    protected int outSelectedProfitsAccountAgrMembershipSn;
    @XmlElement(name = "OutSelectedProfitsAccountAgrSn")
    protected int outSelectedProfitsAccountAgrSn;
    @XmlElement(name = "OutSelectedProfitsAccountAgrUnit")
    protected int outSelectedProfitsAccountAgrUnit;
    @XmlElement(name = "OutSelectedProfitsAccountAgrYear")
    protected short outSelectedProfitsAccountAgrYear;
    @XmlElement(name = "OutSelectedProfitsAccountCustId")
    protected int outSelectedProfitsAccountCustId;
    @XmlElement(name = "OutSelectedProfitsAccountDepAccNumber")
    protected double outSelectedProfitsAccountDepAccNumber;
    @XmlElement(name = "OutSelectedProfitsAccountDepOpenUnit")
    protected int outSelectedProfitsAccountDepOpenUnit;
    @XmlElement(name = "OutSelectedProfitsAccountLgAccSn")
    protected double outSelectedProfitsAccountLgAccSn;
    @XmlElement(name = "OutSelectedProfitsAccountLgOpenUnit")
    protected int outSelectedProfitsAccountLgOpenUnit;
    @XmlElement(name = "OutSelectedProfitsAccountLimitCurrency")
    protected int outSelectedProfitsAccountLimitCurrency;
    @XmlElement(name = "OutSelectedProfitsAccountLnsOpenUnit")
    protected int outSelectedProfitsAccountLnsOpenUnit;
    @XmlElement(name = "OutSelectedProfitsAccountLnsSn")
    protected int outSelectedProfitsAccountLnsSn;
    @XmlElement(name = "OutSelectedProfitsAccountLnsType")
    protected short outSelectedProfitsAccountLnsType;
    @XmlElement(name = "OutSelectedProfitsAccountMonotoringUnit")
    protected int outSelectedProfitsAccountMonotoringUnit;
    @XmlElement(name = "OutSelectedProfitsAccountMovementCurrency")
    protected int outSelectedProfitsAccountMovementCurrency;
    @XmlElement(name = "OutSelectedProfitsAccountPrftSystem")
    protected short outSelectedProfitsAccountPrftSystem;
    @XmlElement(name = "OutSelectedProfitsAccountProductId")
    protected int outSelectedProfitsAccountProductId;
    @XmlElement(name = "OutSelectedProfitsAccountTrOpenUnit")
    protected int outSelectedProfitsAccountTrOpenUnit;
    @XmlElement(name = "OutSelectedProfitsAccountTrSn")
    protected int outSelectedProfitsAccountTrSn;
    @XmlElement(name = "OutSelectedProfitsAccountTrType")
    protected short outSelectedProfitsAccountTrType;
    @XmlElement(name = "OutSelectedTraccountAccKind")
    protected String outSelectedTraccountAccKind;
    @XmlElement(name = "OutSelectedTraccountEntryStatus")
    protected String outSelectedTraccountEntryStatus;
    @XmlElement(name = "OutSelectedTraccountSecuritiesType")
    protected short outSelectedTraccountSecuritiesType;
    @XmlElement(name = "OutShowAgreementProfitsAccountAccountCd")
    protected short outShowAgreementProfitsAccountAccountCd;
    @XmlElement(name = "OutShowAgreementProfitsAccountAccountNumber")
    protected String outShowAgreementProfitsAccountAccountNumber;
    @XmlElement(name = "OutStatusIefSuppliedActionEntryDesc")
    protected String outStatusIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutTotalsScrAccountCustomerPositionTotalsScrAkEvalTot", required = true)
    protected BigDecimal outTotalsScrAccountCustomerPositionTotalsScrAkEvalTot;
    @XmlElement(name = "OutTotalsScrAccountCustomerPositionTotalsScrAkShrTot", required = true)
    protected BigDecimal outTotalsScrAccountCustomerPositionTotalsScrAkShrTot;
    @XmlElement(name = "OutTotalsScrAccountCustomerPositionTotalsScrAkddTot", required = true)
    protected BigDecimal outTotalsScrAccountCustomerPositionTotalsScrAkddTot;
    @XmlElement(name = "OutTotalsScrAccountCustomerPositionTotalsScrBondTot", required = true)
    protected BigDecimal outTotalsScrAccountCustomerPositionTotalsScrBondTot;
    @XmlElement(name = "OutTotalsScrAccountCustomerPositionTotalsScrRepoTot", required = true)
    protected BigDecimal outTotalsScrAccountCustomerPositionTotalsScrRepoTot;

    /**
     * Gets the value of the outAccAvailableIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAccAvailableIefSuppliedAmount() {
        return outAccAvailableIefSuppliedAmount;
    }

    /**
     * Sets the value of the outAccAvailableIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAccAvailableIefSuppliedAmount(BigDecimal value) {
        this.outAccAvailableIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the outAccUtilizedIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAccUtilizedIefSuppliedAmount() {
        return outAccUtilizedIefSuppliedAmount;
    }

    /**
     * Sets the value of the outAccUtilizedIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAccUtilizedIefSuppliedAmount(BigDecimal value) {
        this.outAccUtilizedIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the outAgreementAgreementAccKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgreementAgreementAccKind() {
        return outAgreementAgreementAccKind;
    }

    /**
     * Sets the value of the outAgreementAgreementAccKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgreementAgreementAccKind(String value) {
        this.outAgreementAgreementAccKind = value;
    }

    /**
     * Gets the value of the outAgreementAgreementAgrBlockedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAgreementAgreementAgrBlockedLimit() {
        return outAgreementAgreementAgrBlockedLimit;
    }

    /**
     * Sets the value of the outAgreementAgreementAgrBlockedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAgreementAgreementAgrBlockedLimit(BigDecimal value) {
        this.outAgreementAgreementAgrBlockedLimit = value;
    }

    /**
     * Gets the value of the outAgreementAgreementAgrLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAgreementAgreementAgrLimit() {
        return outAgreementAgreementAgrLimit;
    }

    /**
     * Sets the value of the outAgreementAgreementAgrLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAgreementAgreementAgrLimit(BigDecimal value) {
        this.outAgreementAgreementAgrLimit = value;
    }

    /**
     * Gets the value of the outAgreementAgreementAgrLimitInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgreementAgreementAgrLimitInd() {
        return outAgreementAgreementAgrLimitInd;
    }

    /**
     * Sets the value of the outAgreementAgreementAgrLimitInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgreementAgreementAgrLimitInd(String value) {
        this.outAgreementAgreementAgrLimitInd = value;
    }

    /**
     * Gets the value of the outAgreementAgreementAgrMembershipSn property.
     * 
     */
    public int getOutAgreementAgreementAgrMembershipSn() {
        return outAgreementAgreementAgrMembershipSn;
    }

    /**
     * Sets the value of the outAgreementAgreementAgrMembershipSn property.
     * 
     */
    public void setOutAgreementAgreementAgrMembershipSn(int value) {
        this.outAgreementAgreementAgrMembershipSn = value;
    }

    /**
     * Gets the value of the outAgreementAgreementAgrSigningDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutAgreementAgreementAgrSigningDt() {
        return outAgreementAgreementAgrSigningDt;
    }

    /**
     * Sets the value of the outAgreementAgreementAgrSigningDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutAgreementAgreementAgrSigningDt(XMLGregorianCalendar value) {
        this.outAgreementAgreementAgrSigningDt = value;
    }

    /**
     * Gets the value of the outAgreementAgreementAgrSn property.
     * 
     */
    public int getOutAgreementAgreementAgrSn() {
        return outAgreementAgreementAgrSn;
    }

    /**
     * Sets the value of the outAgreementAgreementAgrSn property.
     * 
     */
    public void setOutAgreementAgreementAgrSn(int value) {
        this.outAgreementAgreementAgrSn = value;
    }

    /**
     * Gets the value of the outAgreementAgreementAgrStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgreementAgreementAgrStatus() {
        return outAgreementAgreementAgrStatus;
    }

    /**
     * Sets the value of the outAgreementAgreementAgrStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgreementAgreementAgrStatus(String value) {
        this.outAgreementAgreementAgrStatus = value;
    }

    /**
     * Gets the value of the outAgreementAgreementAgrUtilisedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAgreementAgreementAgrUtilisedLimit() {
        return outAgreementAgreementAgrUtilisedLimit;
    }

    /**
     * Sets the value of the outAgreementAgreementAgrUtilisedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAgreementAgreementAgrUtilisedLimit(BigDecimal value) {
        this.outAgreementAgreementAgrUtilisedLimit = value;
    }

    /**
     * Gets the value of the outAgreementAgreementAgrYear property.
     * 
     */
    public short getOutAgreementAgreementAgrYear() {
        return outAgreementAgreementAgrYear;
    }

    /**
     * Sets the value of the outAgreementAgreementAgrYear property.
     * 
     */
    public void setOutAgreementAgreementAgrYear(short value) {
        this.outAgreementAgreementAgrYear = value;
    }

    /**
     * Gets the value of the outAvailableToWithdrawIefSuppliedPayableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAvailableToWithdrawIefSuppliedPayableAmount() {
        return outAvailableToWithdrawIefSuppliedPayableAmount;
    }

    /**
     * Sets the value of the outAvailableToWithdrawIefSuppliedPayableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAvailableToWithdrawIefSuppliedPayableAmount(BigDecimal value) {
        this.outAvailableToWithdrawIefSuppliedPayableAmount = value;
    }

    /**
     * Gets the value of the outBalancesAccountCollateralLimitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBalancesAccountCollateralLimitsAccountNumber() {
        return outBalancesAccountCollateralLimitsAccountNumber;
    }

    /**
     * Sets the value of the outBalancesAccountCollateralLimitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBalancesAccountCollateralLimitsAccountNumber(String value) {
        this.outBalancesAccountCollateralLimitsAccountNumber = value;
    }

    /**
     * Gets the value of the outBalancesAccountCollateralLimitsHistoryCnt property.
     * 
     */
    public double getOutBalancesAccountCollateralLimitsHistoryCnt() {
        return outBalancesAccountCollateralLimitsHistoryCnt;
    }

    /**
     * Sets the value of the outBalancesAccountCollateralLimitsHistoryCnt property.
     * 
     */
    public void setOutBalancesAccountCollateralLimitsHistoryCnt(double value) {
        this.outBalancesAccountCollateralLimitsHistoryCnt = value;
    }

    /**
     * Gets the value of the outBalancesAccountCollateralLimitsIdCurrency property.
     * 
     */
    public int getOutBalancesAccountCollateralLimitsIdCurrency() {
        return outBalancesAccountCollateralLimitsIdCurrency;
    }

    /**
     * Sets the value of the outBalancesAccountCollateralLimitsIdCurrency property.
     * 
     */
    public void setOutBalancesAccountCollateralLimitsIdCurrency(int value) {
        this.outBalancesAccountCollateralLimitsIdCurrency = value;
    }

    /**
     * Gets the value of the outBalancesAccountCollateralLimitsLiqLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBalancesAccountCollateralLimitsLiqLimit() {
        return outBalancesAccountCollateralLimitsLiqLimit;
    }

    /**
     * Sets the value of the outBalancesAccountCollateralLimitsLiqLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBalancesAccountCollateralLimitsLiqLimit(BigDecimal value) {
        this.outBalancesAccountCollateralLimitsLiqLimit = value;
    }

    /**
     * Gets the value of the outBalancesAccountCollateralLimitsLiqUtil property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBalancesAccountCollateralLimitsLiqUtil() {
        return outBalancesAccountCollateralLimitsLiqUtil;
    }

    /**
     * Sets the value of the outBalancesAccountCollateralLimitsLiqUtil property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBalancesAccountCollateralLimitsLiqUtil(BigDecimal value) {
        this.outBalancesAccountCollateralLimitsLiqUtil = value;
    }

    /**
     * Gets the value of the outBalancesAccountCollateralLimitsNoLiqLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBalancesAccountCollateralLimitsNoLiqLimit() {
        return outBalancesAccountCollateralLimitsNoLiqLimit;
    }

    /**
     * Sets the value of the outBalancesAccountCollateralLimitsNoLiqLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBalancesAccountCollateralLimitsNoLiqLimit(BigDecimal value) {
        this.outBalancesAccountCollateralLimitsNoLiqLimit = value;
    }

    /**
     * Gets the value of the outBalancesAccountCollateralLimitsNoLiqUtil property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBalancesAccountCollateralLimitsNoLiqUtil() {
        return outBalancesAccountCollateralLimitsNoLiqUtil;
    }

    /**
     * Sets the value of the outBalancesAccountCollateralLimitsNoLiqUtil property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBalancesAccountCollateralLimitsNoLiqUtil(BigDecimal value) {
        this.outBalancesAccountCollateralLimitsNoLiqUtil = value;
    }

    /**
     * Gets the value of the outBalancesAccountCollateralLimitsPrftSystem property.
     * 
     */
    public short getOutBalancesAccountCollateralLimitsPrftSystem() {
        return outBalancesAccountCollateralLimitsPrftSystem;
    }

    /**
     * Sets the value of the outBalancesAccountCollateralLimitsPrftSystem property.
     * 
     */
    public void setOutBalancesAccountCollateralLimitsPrftSystem(short value) {
        this.outBalancesAccountCollateralLimitsPrftSystem = value;
    }

    /**
     * Gets the value of the outBalancesAgreementAgrBlockedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBalancesAgreementAgrBlockedLimit() {
        return outBalancesAgreementAgrBlockedLimit;
    }

    /**
     * Sets the value of the outBalancesAgreementAgrBlockedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBalancesAgreementAgrBlockedLimit(BigDecimal value) {
        this.outBalancesAgreementAgrBlockedLimit = value;
    }

    /**
     * Gets the value of the outBalancesAgreementAgrLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBalancesAgreementAgrLimit() {
        return outBalancesAgreementAgrLimit;
    }

    /**
     * Sets the value of the outBalancesAgreementAgrLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBalancesAgreementAgrLimit(BigDecimal value) {
        this.outBalancesAgreementAgrLimit = value;
    }

    /**
     * Gets the value of the outBalancesAgreementAgrMembershipSn property.
     * 
     */
    public int getOutBalancesAgreementAgrMembershipSn() {
        return outBalancesAgreementAgrMembershipSn;
    }

    /**
     * Sets the value of the outBalancesAgreementAgrMembershipSn property.
     * 
     */
    public void setOutBalancesAgreementAgrMembershipSn(int value) {
        this.outBalancesAgreementAgrMembershipSn = value;
    }

    /**
     * Gets the value of the outBalancesAgreementAgrSn property.
     * 
     */
    public int getOutBalancesAgreementAgrSn() {
        return outBalancesAgreementAgrSn;
    }

    /**
     * Sets the value of the outBalancesAgreementAgrSn property.
     * 
     */
    public void setOutBalancesAgreementAgrSn(int value) {
        this.outBalancesAgreementAgrSn = value;
    }

    /**
     * Gets the value of the outBalancesAgreementAgrUtilisedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBalancesAgreementAgrUtilisedLimit() {
        return outBalancesAgreementAgrUtilisedLimit;
    }

    /**
     * Sets the value of the outBalancesAgreementAgrUtilisedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBalancesAgreementAgrUtilisedLimit(BigDecimal value) {
        this.outBalancesAgreementAgrUtilisedLimit = value;
    }

    /**
     * Gets the value of the outBalancesAgreementAgrYear property.
     * 
     */
    public short getOutBalancesAgreementAgrYear() {
        return outBalancesAgreementAgrYear;
    }

    /**
     * Sets the value of the outBalancesAgreementAgrYear property.
     * 
     */
    public void setOutBalancesAgreementAgrYear(short value) {
        this.outBalancesAgreementAgrYear = value;
    }

    /**
     * Gets the value of the outBalancesAgreementCollateralLimitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBalancesAgreementCollateralLimitsAccountNumber() {
        return outBalancesAgreementCollateralLimitsAccountNumber;
    }

    /**
     * Sets the value of the outBalancesAgreementCollateralLimitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBalancesAgreementCollateralLimitsAccountNumber(String value) {
        this.outBalancesAgreementCollateralLimitsAccountNumber = value;
    }

    /**
     * Gets the value of the outBalancesAgreementCollateralLimitsHistoryCnt property.
     * 
     */
    public double getOutBalancesAgreementCollateralLimitsHistoryCnt() {
        return outBalancesAgreementCollateralLimitsHistoryCnt;
    }

    /**
     * Sets the value of the outBalancesAgreementCollateralLimitsHistoryCnt property.
     * 
     */
    public void setOutBalancesAgreementCollateralLimitsHistoryCnt(double value) {
        this.outBalancesAgreementCollateralLimitsHistoryCnt = value;
    }

    /**
     * Gets the value of the outBalancesAgreementCollateralLimitsIdCurrency property.
     * 
     */
    public int getOutBalancesAgreementCollateralLimitsIdCurrency() {
        return outBalancesAgreementCollateralLimitsIdCurrency;
    }

    /**
     * Sets the value of the outBalancesAgreementCollateralLimitsIdCurrency property.
     * 
     */
    public void setOutBalancesAgreementCollateralLimitsIdCurrency(int value) {
        this.outBalancesAgreementCollateralLimitsIdCurrency = value;
    }

    /**
     * Gets the value of the outBalancesAgreementCollateralLimitsLiqLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBalancesAgreementCollateralLimitsLiqLimit() {
        return outBalancesAgreementCollateralLimitsLiqLimit;
    }

    /**
     * Sets the value of the outBalancesAgreementCollateralLimitsLiqLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBalancesAgreementCollateralLimitsLiqLimit(BigDecimal value) {
        this.outBalancesAgreementCollateralLimitsLiqLimit = value;
    }

    /**
     * Gets the value of the outBalancesAgreementCollateralLimitsLiqUtil property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBalancesAgreementCollateralLimitsLiqUtil() {
        return outBalancesAgreementCollateralLimitsLiqUtil;
    }

    /**
     * Sets the value of the outBalancesAgreementCollateralLimitsLiqUtil property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBalancesAgreementCollateralLimitsLiqUtil(BigDecimal value) {
        this.outBalancesAgreementCollateralLimitsLiqUtil = value;
    }

    /**
     * Gets the value of the outBalancesAgreementCollateralLimitsNoLiqLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBalancesAgreementCollateralLimitsNoLiqLimit() {
        return outBalancesAgreementCollateralLimitsNoLiqLimit;
    }

    /**
     * Sets the value of the outBalancesAgreementCollateralLimitsNoLiqLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBalancesAgreementCollateralLimitsNoLiqLimit(BigDecimal value) {
        this.outBalancesAgreementCollateralLimitsNoLiqLimit = value;
    }

    /**
     * Gets the value of the outBalancesAgreementCollateralLimitsNoLiqUtil property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBalancesAgreementCollateralLimitsNoLiqUtil() {
        return outBalancesAgreementCollateralLimitsNoLiqUtil;
    }

    /**
     * Sets the value of the outBalancesAgreementCollateralLimitsNoLiqUtil property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBalancesAgreementCollateralLimitsNoLiqUtil(BigDecimal value) {
        this.outBalancesAgreementCollateralLimitsNoLiqUtil = value;
    }

    /**
     * Gets the value of the outBalancesAgreementCollateralLimitsPrftSystem property.
     * 
     */
    public short getOutBalancesAgreementCollateralLimitsPrftSystem() {
        return outBalancesAgreementCollateralLimitsPrftSystem;
    }

    /**
     * Sets the value of the outBalancesAgreementCollateralLimitsPrftSystem property.
     * 
     */
    public void setOutBalancesAgreementCollateralLimitsPrftSystem(short value) {
        this.outBalancesAgreementCollateralLimitsPrftSystem = value;
    }

    /**
     * Gets the value of the outBalancesCreditLineGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBalancesCreditLineGenericDetailDescription() {
        return outBalancesCreditLineGenericDetailDescription;
    }

    /**
     * Sets the value of the outBalancesCreditLineGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBalancesCreditLineGenericDetailDescription(String value) {
        this.outBalancesCreditLineGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outBalancesCreditLineGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBalancesCreditLineGenericDetailParameterType() {
        return outBalancesCreditLineGenericDetailParameterType;
    }

    /**
     * Sets the value of the outBalancesCreditLineGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBalancesCreditLineGenericDetailParameterType(String value) {
        this.outBalancesCreditLineGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outBalancesCreditLineGenericDetailSerialNum property.
     * 
     */
    public int getOutBalancesCreditLineGenericDetailSerialNum() {
        return outBalancesCreditLineGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outBalancesCreditLineGenericDetailSerialNum property.
     * 
     */
    public void setOutBalancesCreditLineGenericDetailSerialNum(int value) {
        this.outBalancesCreditLineGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outBalancesCustomerCreditLineCrlineAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBalancesCustomerCreditLineCrlineAmount() {
        return outBalancesCustomerCreditLineCrlineAmount;
    }

    /**
     * Sets the value of the outBalancesCustomerCreditLineCrlineAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBalancesCustomerCreditLineCrlineAmount(BigDecimal value) {
        this.outBalancesCustomerCreditLineCrlineAmount = value;
    }

    /**
     * Gets the value of the outBalancesCustomerCreditLineEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBalancesCustomerCreditLineEntryStatus() {
        return outBalancesCustomerCreditLineEntryStatus;
    }

    /**
     * Sets the value of the outBalancesCustomerCreditLineEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBalancesCustomerCreditLineEntryStatus(String value) {
        this.outBalancesCustomerCreditLineEntryStatus = value;
    }

    /**
     * Gets the value of the outBalancesCustomerCreditLineExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBalancesCustomerCreditLineExpiryDate() {
        return outBalancesCustomerCreditLineExpiryDate;
    }

    /**
     * Sets the value of the outBalancesCustomerCreditLineExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBalancesCustomerCreditLineExpiryDate(XMLGregorianCalendar value) {
        this.outBalancesCustomerCreditLineExpiryDate = value;
    }

    /**
     * Gets the value of the outBalancesCustomerCreditLineHistoryCnt property.
     * 
     */
    public double getOutBalancesCustomerCreditLineHistoryCnt() {
        return outBalancesCustomerCreditLineHistoryCnt;
    }

    /**
     * Sets the value of the outBalancesCustomerCreditLineHistoryCnt property.
     * 
     */
    public void setOutBalancesCustomerCreditLineHistoryCnt(double value) {
        this.outBalancesCustomerCreditLineHistoryCnt = value;
    }

    /**
     * Gets the value of the outBalancesCustomerCreditLineTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBalancesCustomerCreditLineTmstamp() {
        return outBalancesCustomerCreditLineTmstamp;
    }

    /**
     * Sets the value of the outBalancesCustomerCreditLineTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBalancesCustomerCreditLineTmstamp(XMLGregorianCalendar value) {
        this.outBalancesCustomerCreditLineTmstamp = value;
    }

    /**
     * Gets the value of the outBalancesCustomerCreditLineUtilisedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBalancesCustomerCreditLineUtilisedAmount() {
        return outBalancesCustomerCreditLineUtilisedAmount;
    }

    /**
     * Sets the value of the outBalancesCustomerCreditLineUtilisedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBalancesCustomerCreditLineUtilisedAmount(BigDecimal value) {
        this.outBalancesCustomerCreditLineUtilisedAmount = value;
    }

    /**
     * Gets the value of the outCollateralNecesssaryLoanWorkFlgsCollateralNecessary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollateralNecesssaryLoanWorkFlgsCollateralNecessary() {
        return outCollateralNecesssaryLoanWorkFlgsCollateralNecessary;
    }

    /**
     * Sets the value of the outCollateralNecesssaryLoanWorkFlgsCollateralNecessary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollateralNecesssaryLoanWorkFlgsCollateralNecessary(String value) {
        this.outCollateralNecesssaryLoanWorkFlgsCollateralNecessary = value;
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
     * Gets the value of the outCustomerAlertMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerAlertMsg() {
        return outCustomerAlertMsg;
    }

    /**
     * Sets the value of the outCustomerAlertMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerAlertMsg(String value) {
        this.outCustomerAlertMsg = value;
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
     * Gets the value of the outLnsBalancesLoanAccountDrvWorkAccBankBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLnsBalancesLoanAccountDrvWorkAccBankBal() {
        return outLnsBalancesLoanAccountDrvWorkAccBankBal;
    }

    /**
     * Sets the value of the outLnsBalancesLoanAccountDrvWorkAccBankBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLnsBalancesLoanAccountDrvWorkAccBankBal(BigDecimal value) {
        this.outLnsBalancesLoanAccountDrvWorkAccBankBal = value;
    }

    /**
     * Gets the value of the outLnsBalancesLoanAccountDrvWorkAccountBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLnsBalancesLoanAccountDrvWorkAccountBal() {
        return outLnsBalancesLoanAccountDrvWorkAccountBal;
    }

    /**
     * Sets the value of the outLnsBalancesLoanAccountDrvWorkAccountBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLnsBalancesLoanAccountDrvWorkAccountBal(BigDecimal value) {
        this.outLnsBalancesLoanAccountDrvWorkAccountBal = value;
    }

    /**
     * Gets the value of the outLnsBalancesLoanAccountDrvWorkLstYrIntDbAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLnsBalancesLoanAccountDrvWorkLstYrIntDbAmn() {
        return outLnsBalancesLoanAccountDrvWorkLstYrIntDbAmn;
    }

    /**
     * Sets the value of the outLnsBalancesLoanAccountDrvWorkLstYrIntDbAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLnsBalancesLoanAccountDrvWorkLstYrIntDbAmn(BigDecimal value) {
        this.outLnsBalancesLoanAccountDrvWorkLstYrIntDbAmn = value;
    }

    /**
     * Gets the value of the outLnsBalancesLoanAccountDrvWorkNrmAccountBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLnsBalancesLoanAccountDrvWorkNrmAccountBal() {
        return outLnsBalancesLoanAccountDrvWorkNrmAccountBal;
    }

    /**
     * Sets the value of the outLnsBalancesLoanAccountDrvWorkNrmAccountBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLnsBalancesLoanAccountDrvWorkNrmAccountBal(BigDecimal value) {
        this.outLnsBalancesLoanAccountDrvWorkNrmAccountBal = value;
    }

    /**
     * Gets the value of the outLnsBalancesLoanAccountDrvWorkOvAccountBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLnsBalancesLoanAccountDrvWorkOvAccountBal() {
        return outLnsBalancesLoanAccountDrvWorkOvAccountBal;
    }

    /**
     * Sets the value of the outLnsBalancesLoanAccountDrvWorkOvAccountBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLnsBalancesLoanAccountDrvWorkOvAccountBal(BigDecimal value) {
        this.outLnsBalancesLoanAccountDrvWorkOvAccountBal = value;
    }

    /**
     * Gets the value of the outLnsBalancesLoanAccountDrvWorkTotPaymentAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLnsBalancesLoanAccountDrvWorkTotPaymentAmn() {
        return outLnsBalancesLoanAccountDrvWorkTotPaymentAmn;
    }

    /**
     * Sets the value of the outLnsBalancesLoanAccountDrvWorkTotPaymentAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLnsBalancesLoanAccountDrvWorkTotPaymentAmn(BigDecimal value) {
        this.outLnsBalancesLoanAccountDrvWorkTotPaymentAmn = value;
    }

    /**
     * Gets the value of the outMonitoringUnitUnitCode property.
     * 
     */
    public int getOutMonitoringUnitUnitCode() {
        return outMonitoringUnitUnitCode;
    }

    /**
     * Sets the value of the outMonitoringUnitUnitCode property.
     * 
     */
    public void setOutMonitoringUnitUnitCode(int value) {
        this.outMonitoringUnitUnitCode = value;
    }

    /**
     * Gets the value of the outMonitoringUnitUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMonitoringUnitUnitUnitName() {
        return outMonitoringUnitUnitUnitName;
    }

    /**
     * Sets the value of the outMonitoringUnitUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMonitoringUnitUnitUnitName(String value) {
        this.outMonitoringUnitUnitUnitName = value;
    }

    /**
     * Gets the value of the outMovementCurrencyCurrencyIdCurrency property.
     * 
     */
    public int getOutMovementCurrencyCurrencyIdCurrency() {
        return outMovementCurrencyCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outMovementCurrencyCurrencyIdCurrency property.
     * 
     */
    public void setOutMovementCurrencyCurrencyIdCurrency(int value) {
        this.outMovementCurrencyCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outMovementCurrencyCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMovementCurrencyCurrencyShortDescr() {
        return outMovementCurrencyCurrencyShortDescr;
    }

    /**
     * Sets the value of the outMovementCurrencyCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMovementCurrencyCurrencyShortDescr(String value) {
        this.outMovementCurrencyCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outOpenUnitUnitCode property.
     * 
     */
    public int getOutOpenUnitUnitCode() {
        return outOpenUnitUnitCode;
    }

    /**
     * Sets the value of the outOpenUnitUnitCode property.
     * 
     */
    public void setOutOpenUnitUnitCode(int value) {
        this.outOpenUnitUnitCode = value;
    }

    /**
     * Gets the value of the outOpenUnitUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOpenUnitUnitUnitName() {
        return outOpenUnitUnitUnitName;
    }

    /**
     * Sets the value of the outOpenUnitUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOpenUnitUnitUnitName(String value) {
        this.outOpenUnitUnitUnitName = value;
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
     * Gets the value of the outSelectedDepositAccountAccountNumber property.
     * 
     */
    public double getOutSelectedDepositAccountAccountNumber() {
        return outSelectedDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the outSelectedDepositAccountAccountNumber property.
     * 
     */
    public void setOutSelectedDepositAccountAccountNumber(double value) {
        this.outSelectedDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outSelectedDepositAccountAvailableBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedDepositAccountAvailableBalance() {
        return outSelectedDepositAccountAvailableBalance;
    }

    /**
     * Sets the value of the outSelectedDepositAccountAvailableBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedDepositAccountAvailableBalance(BigDecimal value) {
        this.outSelectedDepositAccountAvailableBalance = value;
    }

    /**
     * Gets the value of the outSelectedDepositAccountBlockedBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedDepositAccountBlockedBalance() {
        return outSelectedDepositAccountBlockedBalance;
    }

    /**
     * Sets the value of the outSelectedDepositAccountBlockedBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedDepositAccountBlockedBalance(BigDecimal value) {
        this.outSelectedDepositAccountBlockedBalance = value;
    }

    /**
     * Gets the value of the outSelectedDepositAccountBookBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedDepositAccountBookBalance() {
        return outSelectedDepositAccountBookBalance;
    }

    /**
     * Sets the value of the outSelectedDepositAccountBookBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedDepositAccountBookBalance(BigDecimal value) {
        this.outSelectedDepositAccountBookBalance = value;
    }

    /**
     * Gets the value of the outSelectedDepositAccountCDigit property.
     * 
     */
    public short getOutSelectedDepositAccountCDigit() {
        return outSelectedDepositAccountCDigit;
    }

    /**
     * Sets the value of the outSelectedDepositAccountCDigit property.
     * 
     */
    public void setOutSelectedDepositAccountCDigit(short value) {
        this.outSelectedDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the outSelectedDepositAccountEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDepositAccountEntryStatus() {
        return outSelectedDepositAccountEntryStatus;
    }

    /**
     * Sets the value of the outSelectedDepositAccountEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDepositAccountEntryStatus(String value) {
        this.outSelectedDepositAccountEntryStatus = value;
    }

    /**
     * Gets the value of the outSelectedDepositAccountForecastBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedDepositAccountForecastBalance() {
        return outSelectedDepositAccountForecastBalance;
    }

    /**
     * Sets the value of the outSelectedDepositAccountForecastBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedDepositAccountForecastBalance(BigDecimal value) {
        this.outSelectedDepositAccountForecastBalance = value;
    }

    /**
     * Gets the value of the outSelectedDepositAccountUnclearBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedDepositAccountUnclearBalance() {
        return outSelectedDepositAccountUnclearBalance;
    }

    /**
     * Sets the value of the outSelectedDepositAccountUnclearBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedDepositAccountUnclearBalance(BigDecimal value) {
        this.outSelectedDepositAccountUnclearBalance = value;
    }

    /**
     * Gets the value of the outSelectedLgLgAccountAccLimitAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedLgLgAccountAccLimitAmn() {
        return outSelectedLgLgAccountAccLimitAmn;
    }

    /**
     * Sets the value of the outSelectedLgLgAccountAccLimitAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedLgLgAccountAccLimitAmn(BigDecimal value) {
        this.outSelectedLgLgAccountAccLimitAmn = value;
    }

    /**
     * Gets the value of the outSelectedLgLgAccountAccSn property.
     * 
     */
    public double getOutSelectedLgLgAccountAccSn() {
        return outSelectedLgLgAccountAccSn;
    }

    /**
     * Sets the value of the outSelectedLgLgAccountAccSn property.
     * 
     */
    public void setOutSelectedLgLgAccountAccSn(double value) {
        this.outSelectedLgLgAccountAccSn = value;
    }

    /**
     * Gets the value of the outSelectedLgLgAccountAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedLgLgAccountAccStatus() {
        return outSelectedLgLgAccountAccStatus;
    }

    /**
     * Sets the value of the outSelectedLgLgAccountAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedLgLgAccountAccStatus(String value) {
        this.outSelectedLgLgAccountAccStatus = value;
    }

    /**
     * Gets the value of the outSelectedLgLgAccountCommissionBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedLgLgAccountCommissionBal() {
        return outSelectedLgLgAccountCommissionBal;
    }

    /**
     * Sets the value of the outSelectedLgLgAccountCommissionBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedLgLgAccountCommissionBal(BigDecimal value) {
        this.outSelectedLgLgAccountCommissionBal = value;
    }

    /**
     * Gets the value of the outSelectedLgLgAccountDefaultAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedLgLgAccountDefaultAmn() {
        return outSelectedLgLgAccountDefaultAmn;
    }

    /**
     * Sets the value of the outSelectedLgLgAccountDefaultAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedLgLgAccountDefaultAmn(BigDecimal value) {
        this.outSelectedLgLgAccountDefaultAmn = value;
    }

    /**
     * Gets the value of the outSelectedLgLgAccountExpenseBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedLgLgAccountExpenseBal() {
        return outSelectedLgLgAccountExpenseBal;
    }

    /**
     * Sets the value of the outSelectedLgLgAccountExpenseBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedLgLgAccountExpenseBal(BigDecimal value) {
        this.outSelectedLgLgAccountExpenseBal = value;
    }

    /**
     * Gets the value of the outSelectedLgLgAccountExpirationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedLgLgAccountExpirationType() {
        return outSelectedLgLgAccountExpirationType;
    }

    /**
     * Sets the value of the outSelectedLgLgAccountExpirationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedLgLgAccountExpirationType(String value) {
        this.outSelectedLgLgAccountExpirationType = value;
    }

    /**
     * Gets the value of the outSelectedLgLgAccountIssuanceJustific property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedLgLgAccountIssuanceJustific() {
        return outSelectedLgLgAccountIssuanceJustific;
    }

    /**
     * Sets the value of the outSelectedLgLgAccountIssuanceJustific property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedLgLgAccountIssuanceJustific(String value) {
        this.outSelectedLgLgAccountIssuanceJustific = value;
    }

    /**
     * Gets the value of the outSelectedLgLgAccountLgAmountBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedLgLgAccountLgAmountBal() {
        return outSelectedLgLgAccountLgAmountBal;
    }

    /**
     * Sets the value of the outSelectedLgLgAccountLgAmountBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedLgLgAccountLgAmountBal(BigDecimal value) {
        this.outSelectedLgLgAccountLgAmountBal = value;
    }

    /**
     * Gets the value of the outSelectedLgLgAccountLgInitialAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedLgLgAccountLgInitialAmn() {
        return outSelectedLgLgAccountLgInitialAmn;
    }

    /**
     * Sets the value of the outSelectedLgLgAccountLgInitialAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedLgLgAccountLgInitialAmn(BigDecimal value) {
        this.outSelectedLgLgAccountLgInitialAmn = value;
    }

    /**
     * Gets the value of the outSelectedLgLgAccountObligationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedLgLgAccountObligationStatus() {
        return outSelectedLgLgAccountObligationStatus;
    }

    /**
     * Sets the value of the outSelectedLgLgAccountObligationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedLgLgAccountObligationStatus(String value) {
        this.outSelectedLgLgAccountObligationStatus = value;
    }

    /**
     * Gets the value of the outSelectedLgLgAccountRqDefaultAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedLgLgAccountRqDefaultAmn() {
        return outSelectedLgLgAccountRqDefaultAmn;
    }

    /**
     * Sets the value of the outSelectedLgLgAccountRqDefaultAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedLgLgAccountRqDefaultAmn(BigDecimal value) {
        this.outSelectedLgLgAccountRqDefaultAmn = value;
    }

    /**
     * Gets the value of the outSelectedLoanAccountAccLimitAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedLoanAccountAccLimitAmn() {
        return outSelectedLoanAccountAccLimitAmn;
    }

    /**
     * Sets the value of the outSelectedLoanAccountAccLimitAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedLoanAccountAccLimitAmn(BigDecimal value) {
        this.outSelectedLoanAccountAccLimitAmn = value;
    }

    /**
     * Gets the value of the outSelectedLoanAccountAccMechanism property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedLoanAccountAccMechanism() {
        return outSelectedLoanAccountAccMechanism;
    }

    /**
     * Sets the value of the outSelectedLoanAccountAccMechanism property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedLoanAccountAccMechanism(String value) {
        this.outSelectedLoanAccountAccMechanism = value;
    }

    /**
     * Gets the value of the outSelectedLoanAccountAccSn property.
     * 
     */
    public int getOutSelectedLoanAccountAccSn() {
        return outSelectedLoanAccountAccSn;
    }

    /**
     * Sets the value of the outSelectedLoanAccountAccSn property.
     * 
     */
    public void setOutSelectedLoanAccountAccSn(int value) {
        this.outSelectedLoanAccountAccSn = value;
    }

    /**
     * Gets the value of the outSelectedLoanAccountAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedLoanAccountAccStatus() {
        return outSelectedLoanAccountAccStatus;
    }

    /**
     * Sets the value of the outSelectedLoanAccountAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedLoanAccountAccStatus(String value) {
        this.outSelectedLoanAccountAccStatus = value;
    }

    /**
     * Gets the value of the outSelectedLoanAccountAccType property.
     * 
     */
    public short getOutSelectedLoanAccountAccType() {
        return outSelectedLoanAccountAccType;
    }

    /**
     * Sets the value of the outSelectedLoanAccountAccType property.
     * 
     */
    public void setOutSelectedLoanAccountAccType(short value) {
        this.outSelectedLoanAccountAccType = value;
    }

    /**
     * Gets the value of the outSelectedLoanAccountLoanStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedLoanAccountLoanStatus() {
        return outSelectedLoanAccountLoanStatus;
    }

    /**
     * Sets the value of the outSelectedLoanAccountLoanStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedLoanAccountLoanStatus(String value) {
        this.outSelectedLoanAccountLoanStatus = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedProfitsAccountAccStatus() {
        return outSelectedProfitsAccountAccStatus;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedProfitsAccountAccStatus(String value) {
        this.outSelectedProfitsAccountAccStatus = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountAccountCd property.
     * 
     */
    public short getOutSelectedProfitsAccountAccountCd() {
        return outSelectedProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountAccountCd property.
     * 
     */
    public void setOutSelectedProfitsAccountAccountCd(short value) {
        this.outSelectedProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedProfitsAccountAccountNumber() {
        return outSelectedProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedProfitsAccountAccountNumber(String value) {
        this.outSelectedProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountAgrMembershipSn property.
     * 
     */
    public int getOutSelectedProfitsAccountAgrMembershipSn() {
        return outSelectedProfitsAccountAgrMembershipSn;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountAgrMembershipSn property.
     * 
     */
    public void setOutSelectedProfitsAccountAgrMembershipSn(int value) {
        this.outSelectedProfitsAccountAgrMembershipSn = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountAgrSn property.
     * 
     */
    public int getOutSelectedProfitsAccountAgrSn() {
        return outSelectedProfitsAccountAgrSn;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountAgrSn property.
     * 
     */
    public void setOutSelectedProfitsAccountAgrSn(int value) {
        this.outSelectedProfitsAccountAgrSn = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountAgrUnit property.
     * 
     */
    public int getOutSelectedProfitsAccountAgrUnit() {
        return outSelectedProfitsAccountAgrUnit;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountAgrUnit property.
     * 
     */
    public void setOutSelectedProfitsAccountAgrUnit(int value) {
        this.outSelectedProfitsAccountAgrUnit = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountAgrYear property.
     * 
     */
    public short getOutSelectedProfitsAccountAgrYear() {
        return outSelectedProfitsAccountAgrYear;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountAgrYear property.
     * 
     */
    public void setOutSelectedProfitsAccountAgrYear(short value) {
        this.outSelectedProfitsAccountAgrYear = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountCustId property.
     * 
     */
    public int getOutSelectedProfitsAccountCustId() {
        return outSelectedProfitsAccountCustId;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountCustId property.
     * 
     */
    public void setOutSelectedProfitsAccountCustId(int value) {
        this.outSelectedProfitsAccountCustId = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountDepAccNumber property.
     * 
     */
    public double getOutSelectedProfitsAccountDepAccNumber() {
        return outSelectedProfitsAccountDepAccNumber;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountDepAccNumber property.
     * 
     */
    public void setOutSelectedProfitsAccountDepAccNumber(double value) {
        this.outSelectedProfitsAccountDepAccNumber = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountDepOpenUnit property.
     * 
     */
    public int getOutSelectedProfitsAccountDepOpenUnit() {
        return outSelectedProfitsAccountDepOpenUnit;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountDepOpenUnit property.
     * 
     */
    public void setOutSelectedProfitsAccountDepOpenUnit(int value) {
        this.outSelectedProfitsAccountDepOpenUnit = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountLgAccSn property.
     * 
     */
    public double getOutSelectedProfitsAccountLgAccSn() {
        return outSelectedProfitsAccountLgAccSn;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountLgAccSn property.
     * 
     */
    public void setOutSelectedProfitsAccountLgAccSn(double value) {
        this.outSelectedProfitsAccountLgAccSn = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountLgOpenUnit property.
     * 
     */
    public int getOutSelectedProfitsAccountLgOpenUnit() {
        return outSelectedProfitsAccountLgOpenUnit;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountLgOpenUnit property.
     * 
     */
    public void setOutSelectedProfitsAccountLgOpenUnit(int value) {
        this.outSelectedProfitsAccountLgOpenUnit = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountLimitCurrency property.
     * 
     */
    public int getOutSelectedProfitsAccountLimitCurrency() {
        return outSelectedProfitsAccountLimitCurrency;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountLimitCurrency property.
     * 
     */
    public void setOutSelectedProfitsAccountLimitCurrency(int value) {
        this.outSelectedProfitsAccountLimitCurrency = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountLnsOpenUnit property.
     * 
     */
    public int getOutSelectedProfitsAccountLnsOpenUnit() {
        return outSelectedProfitsAccountLnsOpenUnit;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountLnsOpenUnit property.
     * 
     */
    public void setOutSelectedProfitsAccountLnsOpenUnit(int value) {
        this.outSelectedProfitsAccountLnsOpenUnit = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountLnsSn property.
     * 
     */
    public int getOutSelectedProfitsAccountLnsSn() {
        return outSelectedProfitsAccountLnsSn;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountLnsSn property.
     * 
     */
    public void setOutSelectedProfitsAccountLnsSn(int value) {
        this.outSelectedProfitsAccountLnsSn = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountLnsType property.
     * 
     */
    public short getOutSelectedProfitsAccountLnsType() {
        return outSelectedProfitsAccountLnsType;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountLnsType property.
     * 
     */
    public void setOutSelectedProfitsAccountLnsType(short value) {
        this.outSelectedProfitsAccountLnsType = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountMonotoringUnit property.
     * 
     */
    public int getOutSelectedProfitsAccountMonotoringUnit() {
        return outSelectedProfitsAccountMonotoringUnit;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountMonotoringUnit property.
     * 
     */
    public void setOutSelectedProfitsAccountMonotoringUnit(int value) {
        this.outSelectedProfitsAccountMonotoringUnit = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountMovementCurrency property.
     * 
     */
    public int getOutSelectedProfitsAccountMovementCurrency() {
        return outSelectedProfitsAccountMovementCurrency;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountMovementCurrency property.
     * 
     */
    public void setOutSelectedProfitsAccountMovementCurrency(int value) {
        this.outSelectedProfitsAccountMovementCurrency = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountPrftSystem property.
     * 
     */
    public short getOutSelectedProfitsAccountPrftSystem() {
        return outSelectedProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountPrftSystem property.
     * 
     */
    public void setOutSelectedProfitsAccountPrftSystem(short value) {
        this.outSelectedProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountProductId property.
     * 
     */
    public int getOutSelectedProfitsAccountProductId() {
        return outSelectedProfitsAccountProductId;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountProductId property.
     * 
     */
    public void setOutSelectedProfitsAccountProductId(int value) {
        this.outSelectedProfitsAccountProductId = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountTrOpenUnit property.
     * 
     */
    public int getOutSelectedProfitsAccountTrOpenUnit() {
        return outSelectedProfitsAccountTrOpenUnit;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountTrOpenUnit property.
     * 
     */
    public void setOutSelectedProfitsAccountTrOpenUnit(int value) {
        this.outSelectedProfitsAccountTrOpenUnit = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountTrSn property.
     * 
     */
    public int getOutSelectedProfitsAccountTrSn() {
        return outSelectedProfitsAccountTrSn;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountTrSn property.
     * 
     */
    public void setOutSelectedProfitsAccountTrSn(int value) {
        this.outSelectedProfitsAccountTrSn = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountTrType property.
     * 
     */
    public short getOutSelectedProfitsAccountTrType() {
        return outSelectedProfitsAccountTrType;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountTrType property.
     * 
     */
    public void setOutSelectedProfitsAccountTrType(short value) {
        this.outSelectedProfitsAccountTrType = value;
    }

    /**
     * Gets the value of the outSelectedTraccountAccKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedTraccountAccKind() {
        return outSelectedTraccountAccKind;
    }

    /**
     * Sets the value of the outSelectedTraccountAccKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedTraccountAccKind(String value) {
        this.outSelectedTraccountAccKind = value;
    }

    /**
     * Gets the value of the outSelectedTraccountEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedTraccountEntryStatus() {
        return outSelectedTraccountEntryStatus;
    }

    /**
     * Sets the value of the outSelectedTraccountEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedTraccountEntryStatus(String value) {
        this.outSelectedTraccountEntryStatus = value;
    }

    /**
     * Gets the value of the outSelectedTraccountSecuritiesType property.
     * 
     */
    public short getOutSelectedTraccountSecuritiesType() {
        return outSelectedTraccountSecuritiesType;
    }

    /**
     * Sets the value of the outSelectedTraccountSecuritiesType property.
     * 
     */
    public void setOutSelectedTraccountSecuritiesType(short value) {
        this.outSelectedTraccountSecuritiesType = value;
    }

    /**
     * Gets the value of the outShowAgreementProfitsAccountAccountCd property.
     * 
     */
    public short getOutShowAgreementProfitsAccountAccountCd() {
        return outShowAgreementProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outShowAgreementProfitsAccountAccountCd property.
     * 
     */
    public void setOutShowAgreementProfitsAccountAccountCd(short value) {
        this.outShowAgreementProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outShowAgreementProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutShowAgreementProfitsAccountAccountNumber() {
        return outShowAgreementProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outShowAgreementProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutShowAgreementProfitsAccountAccountNumber(String value) {
        this.outShowAgreementProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outStatusIefSuppliedActionEntryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutStatusIefSuppliedActionEntryDesc() {
        return outStatusIefSuppliedActionEntryDesc;
    }

    /**
     * Sets the value of the outStatusIefSuppliedActionEntryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutStatusIefSuppliedActionEntryDesc(String value) {
        this.outStatusIefSuppliedActionEntryDesc = value;
    }

    /**
     * Gets the value of the outTotalsScrAccountCustomerPositionTotalsScrAkEvalTot property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalsScrAccountCustomerPositionTotalsScrAkEvalTot() {
        return outTotalsScrAccountCustomerPositionTotalsScrAkEvalTot;
    }

    /**
     * Sets the value of the outTotalsScrAccountCustomerPositionTotalsScrAkEvalTot property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalsScrAccountCustomerPositionTotalsScrAkEvalTot(BigDecimal value) {
        this.outTotalsScrAccountCustomerPositionTotalsScrAkEvalTot = value;
    }

    /**
     * Gets the value of the outTotalsScrAccountCustomerPositionTotalsScrAkShrTot property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalsScrAccountCustomerPositionTotalsScrAkShrTot() {
        return outTotalsScrAccountCustomerPositionTotalsScrAkShrTot;
    }

    /**
     * Sets the value of the outTotalsScrAccountCustomerPositionTotalsScrAkShrTot property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalsScrAccountCustomerPositionTotalsScrAkShrTot(BigDecimal value) {
        this.outTotalsScrAccountCustomerPositionTotalsScrAkShrTot = value;
    }

    /**
     * Gets the value of the outTotalsScrAccountCustomerPositionTotalsScrAkddTot property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalsScrAccountCustomerPositionTotalsScrAkddTot() {
        return outTotalsScrAccountCustomerPositionTotalsScrAkddTot;
    }

    /**
     * Sets the value of the outTotalsScrAccountCustomerPositionTotalsScrAkddTot property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalsScrAccountCustomerPositionTotalsScrAkddTot(BigDecimal value) {
        this.outTotalsScrAccountCustomerPositionTotalsScrAkddTot = value;
    }

    /**
     * Gets the value of the outTotalsScrAccountCustomerPositionTotalsScrBondTot property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalsScrAccountCustomerPositionTotalsScrBondTot() {
        return outTotalsScrAccountCustomerPositionTotalsScrBondTot;
    }

    /**
     * Sets the value of the outTotalsScrAccountCustomerPositionTotalsScrBondTot property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalsScrAccountCustomerPositionTotalsScrBondTot(BigDecimal value) {
        this.outTotalsScrAccountCustomerPositionTotalsScrBondTot = value;
    }

    /**
     * Gets the value of the outTotalsScrAccountCustomerPositionTotalsScrRepoTot property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalsScrAccountCustomerPositionTotalsScrRepoTot() {
        return outTotalsScrAccountCustomerPositionTotalsScrRepoTot;
    }

    /**
     * Sets the value of the outTotalsScrAccountCustomerPositionTotalsScrRepoTot property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalsScrAccountCustomerPositionTotalsScrRepoTot(BigDecimal value) {
        this.outTotalsScrAccountCustomerPositionTotalsScrRepoTot = value;
    }

}
