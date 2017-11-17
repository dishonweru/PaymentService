
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseParameters">
 *       &lt;sequence>
 *         &lt;element name="Tun" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}TUN"/>
 *         &lt;element name="Result" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}EvaluationResult"/>
 *         &lt;element name="VoucherLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseExport", propOrder = {
    "tun",
    "result",
    "voucherLine"
})
@XmlSeeAlso({
    D0325VAuthorizeBeneficiaryAccountExport.class,
    CI3496VProfitsOtpUserProcessExport.class,
    I0160VCustomerDocumentManagementExport.class,
    T2103VStandingOrderTransferListExport.class,
    AgreementBeneficiariesExport.class,
    Prt502VSaveScenarioExport.class,
    G0501VGlAccountValidationExport.class,
    BI1634VDhsseclearingExport.class,
    SendMessageAlertExtExport.class,
    CMS3603VCustomerCardApplicationsListExport.class,
    EXT8103VRegistrationValidationExport.class,
    T1477GetTheVoucherExport.class,
    PRT098VMultiProfitsAccountValidationExport.class,
    DOC0002VInsertDocDetailsExport.class,
    CI4000VGetUnitsListExport.class,
    BillsReverseChequePurchaseExport.class,
    A1954VLimitsInformationExport.class,
    RI201VIListProductCurrencyExport.class,
    PFG004VFormFieldListExport.class,
    SWT3501VSwiftAllianceMaintenanceExport.class,
    L0719VLoginUserGetEncryptedPasswordExport.class,
    J2117VThirdPartyCollectionReversalExport.class,
    CorporateCustomerMaintenanceExport.class,
    L0437VLoanAccountStatementExport.class,
    J2115VThirdPartyPaymentsExport.class,
    Cis0001VSuspisiousCustomerExport.class,
    PFG004VDynamicCollateralExport.class,
    Mc2006VPropertyManagementExport.class,
    DepositAccountRetrieveExport.class,
    L0449VDebtManagementExtraExport.class,
    FTRS01FtrTrnInterbankOrderSrvExport.class,
    MC2029VCollateralPfgListExport.class,
    BalanceInquiryMiniStatementExport.class,
    CustomerPositionAndDrawdownExport.class,
    CI3496VProfitsOtpValidateExport.class,
    P0831VStrongRoomVaultManipulationExport.class,
    I0128VCustomerRelationshipListExport.class,
    CustomerAddressMaintenanceExport.class,
    I0158VDrawdownRequestMaintenaceExport.class,
    GetBulkMessageAlertStatusExtExport.class,
    CIA0013VThirdPartyReferenceExport.class,
    S0705VProfitsUserMaintenanceExport.class,
    SL705VProfitsUserListSearchExport.class,
    RI215VLLoanInterestExport.class,
    T1462VlgBeneficiariesExport.class,
    CI4050VGetBankParamsExport.class,
    TF3718VLcTfStatementExport.class,
    T2104VStandingOrdersInquiryExport.class,
    I0122VCustomerDetailsExport.class,
    D0333VUnBlockAmountExport.class,
    Prt501VExternalTaskCheckExport.class,
    SWT3501SwiftItemListsExport.class,
    PRT098VSingleProfitsAccountValidationExport.class,
    PAR29VSynchronizeBanksExport.class,
    X2232VSafeDepositBoxesListExport.class,
    GetMessageAlertStatusExtExport.class,
    FEXS01FundsTransferWithExchangeExport.class,
    A1904VAgreementLimitManipulationExport.class,
    A1910VCustomerCreditLimitManipulationExport.class,
    I0172VProfitabilityExport.class,
    D0303VDepositAccountUpdateExport.class,
    CollateralFinancialForAgreementAccountExport.class,
    BI1618VBillPerTypeExport.class,
    D0321VBlockAmountExport.class,
    LoanAccountMaintenanceExport.class,
    L0705VLoginUserExport.class,
    SearchCustomerExport.class,
    L0494VMediatorsMaintenanceExport.class,
    CI4100VGetBanksListExport.class,
    MC2027VShipMortgageExport.class,
    L0407VLoanAccountExtraitExport.class,
    D0336VMultilineReversalExport.class,
    Mc2019VPropertyListExport.class,
    DTF099VElectronicFundsTransferExport.class,
    RepaymentScheduleScenarioExport.class,
    TradeFinanceAccountRetrieveExport.class,
    PRT022VIprofitsAccCustomersExport.class,
    DGR0001VUserTransactionDiaryExport.class,
    MC2009VAdditionalCollateralDetailInformationExport.class,
    AgreementMaintenanceExport.class,
    I0135VCardMaintenanceExport.class,
    DepositFirstDemandWithdrawExport.class,
    LettersOfCreditRetrieveExport.class,
    CI3496VEmailSmsNewUserExport.class,
    BillsChequeUploadExport.class,
    T2152VInsuranceCommitmentForecastExport.class,
    MC2007VCollateralListExport.class,
    CMS3604VCustomerCardsListExport.class,
    MC2004VAccountCollateralsQueryExport.class,
    SWT3501VSearchSwiftCodeCriteriaExport.class,
    SecuritiesAccountRetrieveExport.class,
    GetAuthorizedExport.class,
    PRT094VIbanToProfitsAccountExport.class,
    MC2024VCollateralListPerCollateralTypeExport.class,
    StopChequeExport.class,
    Prt022VValidationAccountExport.class,
    FEXS03ExchangeRatesExport.class,
    FTRSC2InterbankOutgoingOrderValueDateImport.class,
    L0701VGetBankParametersExport.class,
    CMS3601VNewCardApplicationManagementExport.class,
    X2231VCustomerSafeDepositBoxRentalsExport.class,
    IndividualCustomerMaintenanceExport.class,
    T2160VInsuranceApplicationListExport.class,
    CdcMntUpdateCustomerExport.class,
    Lna0405VSaveRepScenarioExport.class,
    SendBulkMessageAlertExtExport.class,
    TermDepositSpecialRatesMaintenanceExport.class,
    X2230VSafeDepositExtraitExport.class,
    CMS3605VCustomerCardStatementExport.class,
    FEXS01ExchangeCalculatorExport.class,
    CI3496VProfitsOtpRequestExport.class,
    EXT8102VExternalAccountMaintenanceExport.class,
    T1423VLetterOfGuaranteeStatementExport.class,
    CMS3601VNewCardApplicationManagementV2Export.class,
    I0130VCustomerCategoriesListExport.class,
    SL797VUserSecurityRightExport.class,
    SCN001VImageManagementExport.class,
    RI200VIListProductExport.class,
    StandbyCollectionPaymentExport.class,
    BIP001VBulkloadinstructionsExport.class,
    MC2028VShipMortgageListExport.class,
    UDF002VDynamicFieldsExport.class,
    AgreementGuarantorsExport.class,
    MC2021VMortgagePrenotationForRealEstatePropertyExport.class,
    T2102VStandingOrderTransferExport.class,
    Adds01AdditionalTransactionPostingExport.class,
    L0497VLoanForecastRedemptionExport.class,
    SL702VProfitsBankEmployeeListExport.class,
    DealerSpecialRatesMaintenanceExport.class,
    T2151VInsuranceCommitmentMaintenanceExport.class,
    D0301VDepositAccountInsertExport.class,
    DTF078VDiasTransaferBanksExport.class,
    ChequeBookRequestExport.class,
    AccountRepaymentScheduleExport.class,
    GetImageExport.class,
    StatementRequestExport.class,
    CIA0009VCustomerAccountMessagesExport.class,
    CIA0008VMessageRequestExport.class,
    I0133VCustomersOtherAfmExport.class,
    CI3496VGetUserInfoExport.class,
    ReconciliationWithExternalSystemsExport.class,
    G0598VManageGlAccountExport.class,
    MC2003VCustomerCollateralsQueryExport.class,
    MC2023VMortgagePrenotationListExport.class,
    R0236VLRepaymentScheduleScenarioExport.class,
    PAR20VGenericDetailCollectionExport.class,
    T2190VInsurancePolicyStatementExport.class,
    ThirdPartyResponseExport.class,
    D0357VDepositsTermDepositStatementExport.class,
    BIP003VBulkprocessinstructionsExport.class,
    T1461VLgGuarantorMaintenanceExport.class,
    D0306VBeneficiaryDisplayExport.class,
    SWT3501VSwiftCodeListExport.class,
    FEXS01FundsTransferInHouseExport.class,
    CMS3603VCustomerCardApplicationsListV2Export.class,
    SCN001VExternalImageManagementExport.class,
    Prt099VCustomerAccountsListExport.class,
    CI3496VUsersListExport.class,
    MC2008VGenericCollateralExport.class,
    ExposeAccountMaintenanceExport.class,
    I0117VCustomersOtherIdExport.class,
    L0723VLogoutUserExport.class,
    LettersOfGuaranteeRetrieveExport.class,
    MessageAlertXmlInputExport.class,
    CIA0008VManageMessageForCustomerExport.class,
    Mc2032VPropertyValuerManagementExport.class,
    S0702VProfitsBankEmployeeManipulationExport.class
})
public class BaseExport
    extends BaseParameters
{

    @XmlElement(name = "Tun", required = true)
    protected TUN tun;
    @XmlElement(name = "Result", required = true)
    protected EvaluationResult result;
    @XmlElement(name = "VoucherLine")
    protected String voucherLine;

    /**
     * Gets the value of the tun property.
     * 
     * @return
     *     possible object is
     *     {@link TUN }
     *     
     */
    public TUN getTun() {
        return tun;
    }

    /**
     * Sets the value of the tun property.
     * 
     * @param value
     *     allowed object is
     *     {@link TUN }
     *     
     */
    public void setTun(TUN value) {
        this.tun = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link EvaluationResult }
     *     
     */
    public EvaluationResult getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link EvaluationResult }
     *     
     */
    public void setResult(EvaluationResult value) {
        this.result = value;
    }

    /**
     * Gets the value of the voucherLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucherLine() {
        return voucherLine;
    }

    /**
     * Sets the value of the voucherLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucherLine(String value) {
        this.voucherLine = value;
    }

}
