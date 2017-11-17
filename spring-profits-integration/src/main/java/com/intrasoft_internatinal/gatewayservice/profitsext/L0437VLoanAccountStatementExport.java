
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for L0437VLoanAccountStatementExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0437VLoanAccountStatementExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutAgrUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAgrSigningDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutAgreementAgrSigningDt_Str" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutAgreementProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutAgreementProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutArrearsNoCapAmntIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBankLanguageBankParametersNationalLangCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBaseRateInterestSupplyWorkFixedInterestPrc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBenCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBenCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBenefCustomerListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBenefIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutClientProfitsExitStateWorkActualMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutClientProfitsExitStateWorkId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutClientProfitsExitStateWorkLanguage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutClientProfitsExitStateWorkMessageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutClientProfitsExitStateWorkPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutClientProfitsExitStateWorkRoutineSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutClientProfitsExitStateWorkTerminationAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutClientProfitsExitStateWorkValruleId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutClientProfitsExitStateWorkValruleSnum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCurLnsRateArrearsInterestSupplyWorkFixedInterestPrc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCurLnsRateInterestSupplyWorkFixedInterestPrc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressCommunicationAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressMailBox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerLanguageGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerLanguageGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDetails1CharSuppliedChar153" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDetails2CharSuppliedChar153" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationAuthorizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationEvaluationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtraIntIefSuppliedPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutInsurerCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutInsurerCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInsurerCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIssuanceIssCommitmentExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutIssuanceIssCommitmentIssuanceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIssuanceIssCommitmentTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutLandRegRealEstateInsuranceEd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLandRegRealEstateLandRegistId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLandRegRealEstateRealEstateDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLcatgGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountAccExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountAccLimitAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountAccOpenDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountInstallCount" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountInstallNextDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountNrmAcrIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountNrmCapBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountNrmComBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountNrmExpBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountNrmRlIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountNrmSubsidyBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountNrmUrlIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountOvAcrNrmIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountOvAcrPnlIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountOvCapBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountOvComBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountOvExpBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountOvRlNrmIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountOvRlPnlIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountOvSubsidyBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountOvUrlNrmIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountOvUrlPnlIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountReqInstallSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountTotDrawdownAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountDrvWorkAccountBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountDrvWorkNrmAccountBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountDrvWorkOvAccountBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountInfoDormantAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountInfoInstallFixedAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountInfoNrmAccrualAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountInfoOvAccrualAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountInfoPositiveAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanParametersWordExtraitPrint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMainBeneficaryCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMainBeneficaryCustomerCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMoreIefSuppliedNum2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutMoreIefSuppliedTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutMovingCurrencyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMovingCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMovingCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutNrmCapAmnIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutPenaltyInterestSupplyWorkFixedInterestPrc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutPolicyNoIefSuppliedChar40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPreviousIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRmListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSepeLoanInstallmentInfoInstallDbIntPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutStatementFreqIefSuppliedChar30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTexInterestSupplyWorkFixedInterestPrc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotArrearsAmntIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotArrrearsIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotCapAmntIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotIntInArrearsIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotInterChargedIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotIssPremIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotPrincInArrearsIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotPrincIntInArrearsIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutUrlDefTotalIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutUrlTotalIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpIssuance" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfL0437VOutGrpIssuanceItem" minOccurs="0"/>
 *         &lt;element name="OutGrpLoanOnlineExtrait" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfL0437VOutGrpLoanOnlineExtraitItem" minOccurs="0"/>
 *         &lt;element name="OutGrpLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfL0437VOutGrpLogItem" minOccurs="0"/>
 *         &lt;element name="IsMore" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0437VLoanAccountStatementExport", propOrder = {
    "outAgrUnitCode",
    "outAgreementAgrMembershipSn",
    "outAgreementAgrSigningDt",
    "outAgreementAgrSigningDtStr",
    "outAgreementAgrSn",
    "outAgreementAgrYear",
    "outAgreementProfitsAccountAccountCd",
    "outAgreementProfitsAccountAccountNumber",
    "outArrearsNoCapAmntIefSuppliedNumber152",
    "outBankLanguageBankParametersNationalLangCode",
    "outBaseRateInterestSupplyWorkFixedInterestPrc",
    "outBenCustomerCDigit",
    "outBenCustomerCustId",
    "outBenefCustomerListSetDescription",
    "outBenefIefSuppliedFlag",
    "outClientProfitsExitStateWorkActualMessage",
    "outClientProfitsExitStateWorkId",
    "outClientProfitsExitStateWorkLanguage",
    "outClientProfitsExitStateWorkMessageType",
    "outClientProfitsExitStateWorkPrftSystem",
    "outClientProfitsExitStateWorkRoutineSn",
    "outClientProfitsExitStateWorkTerminationAction",
    "outClientProfitsExitStateWorkValruleId",
    "outClientProfitsExitStateWorkValruleSnum",
    "outCurLnsRateArrearsInterestSupplyWorkFixedInterestPrc",
    "outCurLnsRateInterestSupplyWorkFixedInterestPrc",
    "outCustAddressAddress1",
    "outCustAddressCity",
    "outCustAddressCommunicationAddress",
    "outCustAddressMailBox",
    "outCustAddressZipCode",
    "outCustCountryGenericDetailDescription",
    "outCustomerLanguageGenericDetailDescription",
    "outCustomerLanguageGenericDetailSerialNum",
    "outDetails1CharSuppliedChar153",
    "outDetails2CharSuppliedChar153",
    "outEvalResultTeamInformationAuthorizationType",
    "outEvalResultTeamInformationEvaluationResult",
    "outEvalResultTeamInformationRequiredProfile1",
    "outEvalResultTeamInformationRequiredProfile2",
    "outExtraIntIefSuppliedPercentage",
    "outInsurerCustomerCDigit",
    "outInsurerCustomerCustId",
    "outInsurerCustomerSurname",
    "outIssuanceIssCommitmentExpirationDate",
    "outIssuanceIssCommitmentIssuanceNumber",
    "outIssuanceIssCommitmentTpSoIdentifier",
    "outLandRegRealEstateInsuranceEd",
    "outLandRegRealEstateLandRegistId",
    "outLandRegRealEstateRealEstateDesc",
    "outLcatgGenericDetailDescription",
    "outLoanAccountAccExpDt",
    "outLoanAccountAccLimitAmn",
    "outLoanAccountAccOpenDt",
    "outLoanAccountInstallCount",
    "outLoanAccountInstallNextDt",
    "outLoanAccountNrmAcrIntBal",
    "outLoanAccountNrmCapBal",
    "outLoanAccountNrmComBal",
    "outLoanAccountNrmExpBal",
    "outLoanAccountNrmRlIntBal",
    "outLoanAccountNrmSubsidyBal",
    "outLoanAccountNrmUrlIntBal",
    "outLoanAccountOvAcrNrmIntBal",
    "outLoanAccountOvAcrPnlIntBal",
    "outLoanAccountOvCapBal",
    "outLoanAccountOvComBal",
    "outLoanAccountOvExpBal",
    "outLoanAccountOvRlNrmIntBal",
    "outLoanAccountOvRlPnlIntBal",
    "outLoanAccountOvSubsidyBal",
    "outLoanAccountOvUrlNrmIntBal",
    "outLoanAccountOvUrlPnlIntBal",
    "outLoanAccountReqInstallSn",
    "outLoanAccountTotDrawdownAmn",
    "outLoanAccountDrvWorkAccountBal",
    "outLoanAccountDrvWorkNrmAccountBal",
    "outLoanAccountDrvWorkOvAccountBal",
    "outLoanAccountInfoDormantAmn",
    "outLoanAccountInfoInstallFixedAmn",
    "outLoanAccountInfoNrmAccrualAmn",
    "outLoanAccountInfoOvAccrualAmn",
    "outLoanAccountInfoPositiveAmn",
    "outLoanParametersWordExtraitPrint",
    "outMainBeneficaryCustomerCustId",
    "outMainBeneficaryCustomerCustType",
    "outMoreIefSuppliedNum2",
    "outMoreIefSuppliedTmstamp",
    "outMovingCurrencyDescription",
    "outMovingCurrencyIdCurrency",
    "outMovingCurrencyShortDescr",
    "outNrmCapAmnIefSuppliedNumber152",
    "outPenaltyInterestSupplyWorkFixedInterestPrc",
    "outPolicyNoIefSuppliedChar40",
    "outPreviousIefSuppliedAmount",
    "outProductDescription",
    "outProductIdProduct",
    "outRmListSetDescription",
    "outSepeLoanInstallmentInfoInstallDbIntPerc",
    "outStatementFreqIefSuppliedChar30",
    "outTexInterestSupplyWorkFixedInterestPrc",
    "outTotArrearsAmntIefSuppliedNumber152",
    "outTotArrrearsIefSuppliedNumber152",
    "outTotCapAmntIefSuppliedNumber152",
    "outTotIntInArrearsIefSuppliedNumber152",
    "outTotInterChargedIefSuppliedNumber152",
    "outTotIssPremIefSuppliedNumber152",
    "outTotPrincInArrearsIefSuppliedNumber152",
    "outTotPrincIntInArrearsIefSuppliedNumber152",
    "outUrlDefTotalIefSuppliedNumber152",
    "outUrlTotalIefSuppliedNumber152",
    "outGrpIssuance",
    "outGrpLoanOnlineExtrait",
    "outGrpLog",
    "isMore"
})
public class L0437VLoanAccountStatementExport
    extends BaseExport
{

    @XmlElement(name = "OutAgrUnitCode")
    protected int outAgrUnitCode;
    @XmlElement(name = "OutAgreementAgrMembershipSn")
    protected int outAgreementAgrMembershipSn;
    @XmlElement(name = "OutAgreementAgrSigningDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outAgreementAgrSigningDt;
    @XmlElement(name = "OutAgreementAgrSigningDt_Str")
    protected String outAgreementAgrSigningDtStr;
    @XmlElement(name = "OutAgreementAgrSn")
    protected int outAgreementAgrSn;
    @XmlElement(name = "OutAgreementAgrYear")
    protected short outAgreementAgrYear;
    @XmlElement(name = "OutAgreementProfitsAccountAccountCd")
    protected short outAgreementProfitsAccountAccountCd;
    @XmlElement(name = "OutAgreementProfitsAccountAccountNumber")
    protected String outAgreementProfitsAccountAccountNumber;
    @XmlElement(name = "OutArrearsNoCapAmntIefSuppliedNumber152", required = true)
    protected BigDecimal outArrearsNoCapAmntIefSuppliedNumber152;
    @XmlElement(name = "OutBankLanguageBankParametersNationalLangCode")
    protected int outBankLanguageBankParametersNationalLangCode;
    @XmlElement(name = "OutBaseRateInterestSupplyWorkFixedInterestPrc", required = true)
    protected BigDecimal outBaseRateInterestSupplyWorkFixedInterestPrc;
    @XmlElement(name = "OutBenCustomerCDigit")
    protected short outBenCustomerCDigit;
    @XmlElement(name = "OutBenCustomerCustId")
    protected int outBenCustomerCustId;
    @XmlElement(name = "OutBenefCustomerListSetDescription")
    protected String outBenefCustomerListSetDescription;
    @XmlElement(name = "OutBenefIefSuppliedFlag")
    protected String outBenefIefSuppliedFlag;
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
    @XmlElement(name = "OutCurLnsRateArrearsInterestSupplyWorkFixedInterestPrc", required = true)
    protected BigDecimal outCurLnsRateArrearsInterestSupplyWorkFixedInterestPrc;
    @XmlElement(name = "OutCurLnsRateInterestSupplyWorkFixedInterestPrc", required = true)
    protected BigDecimal outCurLnsRateInterestSupplyWorkFixedInterestPrc;
    @XmlElement(name = "OutCustAddressAddress1")
    protected String outCustAddressAddress1;
    @XmlElement(name = "OutCustAddressCity")
    protected String outCustAddressCity;
    @XmlElement(name = "OutCustAddressCommunicationAddress")
    protected String outCustAddressCommunicationAddress;
    @XmlElement(name = "OutCustAddressMailBox")
    protected String outCustAddressMailBox;
    @XmlElement(name = "OutCustAddressZipCode")
    protected String outCustAddressZipCode;
    @XmlElement(name = "OutCustCountryGenericDetailDescription")
    protected String outCustCountryGenericDetailDescription;
    @XmlElement(name = "OutCustomerLanguageGenericDetailDescription")
    protected String outCustomerLanguageGenericDetailDescription;
    @XmlElement(name = "OutCustomerLanguageGenericDetailSerialNum")
    protected int outCustomerLanguageGenericDetailSerialNum;
    @XmlElement(name = "OutDetails1CharSuppliedChar153")
    protected String outDetails1CharSuppliedChar153;
    @XmlElement(name = "OutDetails2CharSuppliedChar153")
    protected String outDetails2CharSuppliedChar153;
    @XmlElement(name = "OutEvalResultTeamInformationAuthorizationType")
    protected String outEvalResultTeamInformationAuthorizationType;
    @XmlElement(name = "OutEvalResultTeamInformationEvaluationResult")
    protected String outEvalResultTeamInformationEvaluationResult;
    @XmlElement(name = "OutEvalResultTeamInformationRequiredProfile1")
    protected String outEvalResultTeamInformationRequiredProfile1;
    @XmlElement(name = "OutEvalResultTeamInformationRequiredProfile2")
    protected String outEvalResultTeamInformationRequiredProfile2;
    @XmlElement(name = "OutExtraIntIefSuppliedPercentage", required = true)
    protected BigDecimal outExtraIntIefSuppliedPercentage;
    @XmlElement(name = "OutInsurerCustomerCDigit")
    protected short outInsurerCustomerCDigit;
    @XmlElement(name = "OutInsurerCustomerCustId")
    protected int outInsurerCustomerCustId;
    @XmlElement(name = "OutInsurerCustomerSurname")
    protected String outInsurerCustomerSurname;
    @XmlElement(name = "OutIssuanceIssCommitmentExpirationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outIssuanceIssCommitmentExpirationDate;
    @XmlElement(name = "OutIssuanceIssCommitmentIssuanceNumber")
    protected String outIssuanceIssCommitmentIssuanceNumber;
    @XmlElement(name = "OutIssuanceIssCommitmentTpSoIdentifier")
    protected double outIssuanceIssCommitmentTpSoIdentifier;
    @XmlElement(name = "OutLandRegRealEstateInsuranceEd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLandRegRealEstateInsuranceEd;
    @XmlElement(name = "OutLandRegRealEstateLandRegistId")
    protected String outLandRegRealEstateLandRegistId;
    @XmlElement(name = "OutLandRegRealEstateRealEstateDesc")
    protected String outLandRegRealEstateRealEstateDesc;
    @XmlElement(name = "OutLcatgGenericDetailDescription")
    protected String outLcatgGenericDetailDescription;
    @XmlElement(name = "OutLoanAccountAccExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountAccExpDt;
    @XmlElement(name = "OutLoanAccountAccLimitAmn", required = true)
    protected BigDecimal outLoanAccountAccLimitAmn;
    @XmlElement(name = "OutLoanAccountAccOpenDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountAccOpenDt;
    @XmlElement(name = "OutLoanAccountInstallCount")
    protected short outLoanAccountInstallCount;
    @XmlElement(name = "OutLoanAccountInstallNextDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountInstallNextDt;
    @XmlElement(name = "OutLoanAccountNrmAcrIntBal", required = true)
    protected BigDecimal outLoanAccountNrmAcrIntBal;
    @XmlElement(name = "OutLoanAccountNrmCapBal", required = true)
    protected BigDecimal outLoanAccountNrmCapBal;
    @XmlElement(name = "OutLoanAccountNrmComBal", required = true)
    protected BigDecimal outLoanAccountNrmComBal;
    @XmlElement(name = "OutLoanAccountNrmExpBal", required = true)
    protected BigDecimal outLoanAccountNrmExpBal;
    @XmlElement(name = "OutLoanAccountNrmRlIntBal", required = true)
    protected BigDecimal outLoanAccountNrmRlIntBal;
    @XmlElement(name = "OutLoanAccountNrmSubsidyBal", required = true)
    protected BigDecimal outLoanAccountNrmSubsidyBal;
    @XmlElement(name = "OutLoanAccountNrmUrlIntBal", required = true)
    protected BigDecimal outLoanAccountNrmUrlIntBal;
    @XmlElement(name = "OutLoanAccountOvAcrNrmIntBal", required = true)
    protected BigDecimal outLoanAccountOvAcrNrmIntBal;
    @XmlElement(name = "OutLoanAccountOvAcrPnlIntBal", required = true)
    protected BigDecimal outLoanAccountOvAcrPnlIntBal;
    @XmlElement(name = "OutLoanAccountOvCapBal", required = true)
    protected BigDecimal outLoanAccountOvCapBal;
    @XmlElement(name = "OutLoanAccountOvComBal", required = true)
    protected BigDecimal outLoanAccountOvComBal;
    @XmlElement(name = "OutLoanAccountOvExpBal", required = true)
    protected BigDecimal outLoanAccountOvExpBal;
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
    @XmlElement(name = "OutLoanAccountReqInstallSn")
    protected short outLoanAccountReqInstallSn;
    @XmlElement(name = "OutLoanAccountTotDrawdownAmn", required = true)
    protected BigDecimal outLoanAccountTotDrawdownAmn;
    @XmlElement(name = "OutLoanAccountDrvWorkAccountBal", required = true)
    protected BigDecimal outLoanAccountDrvWorkAccountBal;
    @XmlElement(name = "OutLoanAccountDrvWorkNrmAccountBal", required = true)
    protected BigDecimal outLoanAccountDrvWorkNrmAccountBal;
    @XmlElement(name = "OutLoanAccountDrvWorkOvAccountBal", required = true)
    protected BigDecimal outLoanAccountDrvWorkOvAccountBal;
    @XmlElement(name = "OutLoanAccountInfoDormantAmn", required = true)
    protected BigDecimal outLoanAccountInfoDormantAmn;
    @XmlElement(name = "OutLoanAccountInfoInstallFixedAmn", required = true)
    protected BigDecimal outLoanAccountInfoInstallFixedAmn;
    @XmlElement(name = "OutLoanAccountInfoNrmAccrualAmn", required = true)
    protected BigDecimal outLoanAccountInfoNrmAccrualAmn;
    @XmlElement(name = "OutLoanAccountInfoOvAccrualAmn", required = true)
    protected BigDecimal outLoanAccountInfoOvAccrualAmn;
    @XmlElement(name = "OutLoanAccountInfoPositiveAmn", required = true)
    protected BigDecimal outLoanAccountInfoPositiveAmn;
    @XmlElement(name = "OutLoanParametersWordExtraitPrint")
    protected String outLoanParametersWordExtraitPrint;
    @XmlElement(name = "OutMainBeneficaryCustomerCustId")
    protected int outMainBeneficaryCustomerCustId;
    @XmlElement(name = "OutMainBeneficaryCustomerCustType")
    protected String outMainBeneficaryCustomerCustType;
    @XmlElement(name = "OutMoreIefSuppliedNum2")
    protected short outMoreIefSuppliedNum2;
    @XmlElement(name = "OutMoreIefSuppliedTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outMoreIefSuppliedTmstamp;
    @XmlElement(name = "OutMovingCurrencyDescription")
    protected String outMovingCurrencyDescription;
    @XmlElement(name = "OutMovingCurrencyIdCurrency")
    protected int outMovingCurrencyIdCurrency;
    @XmlElement(name = "OutMovingCurrencyShortDescr")
    protected String outMovingCurrencyShortDescr;
    @XmlElement(name = "OutNrmCapAmnIefSuppliedNumber152", required = true)
    protected BigDecimal outNrmCapAmnIefSuppliedNumber152;
    @XmlElement(name = "OutPenaltyInterestSupplyWorkFixedInterestPrc", required = true)
    protected BigDecimal outPenaltyInterestSupplyWorkFixedInterestPrc;
    @XmlElement(name = "OutPolicyNoIefSuppliedChar40")
    protected String outPolicyNoIefSuppliedChar40;
    @XmlElement(name = "OutPreviousIefSuppliedAmount", required = true)
    protected BigDecimal outPreviousIefSuppliedAmount;
    @XmlElement(name = "OutProductDescription")
    protected String outProductDescription;
    @XmlElement(name = "OutProductIdProduct")
    protected int outProductIdProduct;
    @XmlElement(name = "OutRmListSetDescription")
    protected String outRmListSetDescription;
    @XmlElement(name = "OutSepeLoanInstallmentInfoInstallDbIntPerc", required = true)
    protected BigDecimal outSepeLoanInstallmentInfoInstallDbIntPerc;
    @XmlElement(name = "OutStatementFreqIefSuppliedChar30")
    protected String outStatementFreqIefSuppliedChar30;
    @XmlElement(name = "OutTexInterestSupplyWorkFixedInterestPrc", required = true)
    protected BigDecimal outTexInterestSupplyWorkFixedInterestPrc;
    @XmlElement(name = "OutTotArrearsAmntIefSuppliedNumber152", required = true)
    protected BigDecimal outTotArrearsAmntIefSuppliedNumber152;
    @XmlElement(name = "OutTotArrrearsIefSuppliedNumber152", required = true)
    protected BigDecimal outTotArrrearsIefSuppliedNumber152;
    @XmlElement(name = "OutTotCapAmntIefSuppliedNumber152", required = true)
    protected BigDecimal outTotCapAmntIefSuppliedNumber152;
    @XmlElement(name = "OutTotIntInArrearsIefSuppliedNumber152", required = true)
    protected BigDecimal outTotIntInArrearsIefSuppliedNumber152;
    @XmlElement(name = "OutTotInterChargedIefSuppliedNumber152", required = true)
    protected BigDecimal outTotInterChargedIefSuppliedNumber152;
    @XmlElement(name = "OutTotIssPremIefSuppliedNumber152", required = true)
    protected BigDecimal outTotIssPremIefSuppliedNumber152;
    @XmlElement(name = "OutTotPrincInArrearsIefSuppliedNumber152", required = true)
    protected BigDecimal outTotPrincInArrearsIefSuppliedNumber152;
    @XmlElement(name = "OutTotPrincIntInArrearsIefSuppliedNumber152", required = true)
    protected BigDecimal outTotPrincIntInArrearsIefSuppliedNumber152;
    @XmlElement(name = "OutUrlDefTotalIefSuppliedNumber152", required = true)
    protected BigDecimal outUrlDefTotalIefSuppliedNumber152;
    @XmlElement(name = "OutUrlTotalIefSuppliedNumber152", required = true)
    protected BigDecimal outUrlTotalIefSuppliedNumber152;
    @XmlElement(name = "OutGrpIssuance")
    protected ArrayOfL0437VOutGrpIssuanceItem outGrpIssuance;
    @XmlElement(name = "OutGrpLoanOnlineExtrait")
    protected ArrayOfL0437VOutGrpLoanOnlineExtraitItem outGrpLoanOnlineExtrait;
    @XmlElement(name = "OutGrpLog")
    protected ArrayOfL0437VOutGrpLogItem outGrpLog;
    @XmlElement(name = "IsMore")
    protected boolean isMore;

    /**
     * Gets the value of the outAgrUnitCode property.
     * 
     */
    public int getOutAgrUnitCode() {
        return outAgrUnitCode;
    }

    /**
     * Sets the value of the outAgrUnitCode property.
     * 
     */
    public void setOutAgrUnitCode(int value) {
        this.outAgrUnitCode = value;
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
     * Gets the value of the outAgreementAgrSigningDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutAgreementAgrSigningDt() {
        return outAgreementAgrSigningDt;
    }

    /**
     * Sets the value of the outAgreementAgrSigningDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutAgreementAgrSigningDt(XMLGregorianCalendar value) {
        this.outAgreementAgrSigningDt = value;
    }

    /**
     * Gets the value of the outAgreementAgrSigningDtStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgreementAgrSigningDtStr() {
        return outAgreementAgrSigningDtStr;
    }

    /**
     * Sets the value of the outAgreementAgrSigningDtStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgreementAgrSigningDtStr(String value) {
        this.outAgreementAgrSigningDtStr = value;
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
     * Gets the value of the outAgreementProfitsAccountAccountCd property.
     * 
     */
    public short getOutAgreementProfitsAccountAccountCd() {
        return outAgreementProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outAgreementProfitsAccountAccountCd property.
     * 
     */
    public void setOutAgreementProfitsAccountAccountCd(short value) {
        this.outAgreementProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outAgreementProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgreementProfitsAccountAccountNumber() {
        return outAgreementProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outAgreementProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgreementProfitsAccountAccountNumber(String value) {
        this.outAgreementProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outArrearsNoCapAmntIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutArrearsNoCapAmntIefSuppliedNumber152() {
        return outArrearsNoCapAmntIefSuppliedNumber152;
    }

    /**
     * Sets the value of the outArrearsNoCapAmntIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutArrearsNoCapAmntIefSuppliedNumber152(BigDecimal value) {
        this.outArrearsNoCapAmntIefSuppliedNumber152 = value;
    }

    /**
     * Gets the value of the outBankLanguageBankParametersNationalLangCode property.
     * 
     */
    public int getOutBankLanguageBankParametersNationalLangCode() {
        return outBankLanguageBankParametersNationalLangCode;
    }

    /**
     * Sets the value of the outBankLanguageBankParametersNationalLangCode property.
     * 
     */
    public void setOutBankLanguageBankParametersNationalLangCode(int value) {
        this.outBankLanguageBankParametersNationalLangCode = value;
    }

    /**
     * Gets the value of the outBaseRateInterestSupplyWorkFixedInterestPrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBaseRateInterestSupplyWorkFixedInterestPrc() {
        return outBaseRateInterestSupplyWorkFixedInterestPrc;
    }

    /**
     * Sets the value of the outBaseRateInterestSupplyWorkFixedInterestPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBaseRateInterestSupplyWorkFixedInterestPrc(BigDecimal value) {
        this.outBaseRateInterestSupplyWorkFixedInterestPrc = value;
    }

    /**
     * Gets the value of the outBenCustomerCDigit property.
     * 
     */
    public short getOutBenCustomerCDigit() {
        return outBenCustomerCDigit;
    }

    /**
     * Sets the value of the outBenCustomerCDigit property.
     * 
     */
    public void setOutBenCustomerCDigit(short value) {
        this.outBenCustomerCDigit = value;
    }

    /**
     * Gets the value of the outBenCustomerCustId property.
     * 
     */
    public int getOutBenCustomerCustId() {
        return outBenCustomerCustId;
    }

    /**
     * Sets the value of the outBenCustomerCustId property.
     * 
     */
    public void setOutBenCustomerCustId(int value) {
        this.outBenCustomerCustId = value;
    }

    /**
     * Gets the value of the outBenefCustomerListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBenefCustomerListSetDescription() {
        return outBenefCustomerListSetDescription;
    }

    /**
     * Sets the value of the outBenefCustomerListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBenefCustomerListSetDescription(String value) {
        this.outBenefCustomerListSetDescription = value;
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
     * Gets the value of the outCurLnsRateArrearsInterestSupplyWorkFixedInterestPrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCurLnsRateArrearsInterestSupplyWorkFixedInterestPrc() {
        return outCurLnsRateArrearsInterestSupplyWorkFixedInterestPrc;
    }

    /**
     * Sets the value of the outCurLnsRateArrearsInterestSupplyWorkFixedInterestPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCurLnsRateArrearsInterestSupplyWorkFixedInterestPrc(BigDecimal value) {
        this.outCurLnsRateArrearsInterestSupplyWorkFixedInterestPrc = value;
    }

    /**
     * Gets the value of the outCurLnsRateInterestSupplyWorkFixedInterestPrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCurLnsRateInterestSupplyWorkFixedInterestPrc() {
        return outCurLnsRateInterestSupplyWorkFixedInterestPrc;
    }

    /**
     * Sets the value of the outCurLnsRateInterestSupplyWorkFixedInterestPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCurLnsRateInterestSupplyWorkFixedInterestPrc(BigDecimal value) {
        this.outCurLnsRateInterestSupplyWorkFixedInterestPrc = value;
    }

    /**
     * Gets the value of the outCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressAddress1() {
        return outCustAddressAddress1;
    }

    /**
     * Sets the value of the outCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressAddress1(String value) {
        this.outCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the outCustAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressCity() {
        return outCustAddressCity;
    }

    /**
     * Sets the value of the outCustAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressCity(String value) {
        this.outCustAddressCity = value;
    }

    /**
     * Gets the value of the outCustAddressCommunicationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressCommunicationAddress() {
        return outCustAddressCommunicationAddress;
    }

    /**
     * Sets the value of the outCustAddressCommunicationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressCommunicationAddress(String value) {
        this.outCustAddressCommunicationAddress = value;
    }

    /**
     * Gets the value of the outCustAddressMailBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressMailBox() {
        return outCustAddressMailBox;
    }

    /**
     * Sets the value of the outCustAddressMailBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressMailBox(String value) {
        this.outCustAddressMailBox = value;
    }

    /**
     * Gets the value of the outCustAddressZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressZipCode() {
        return outCustAddressZipCode;
    }

    /**
     * Sets the value of the outCustAddressZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressZipCode(String value) {
        this.outCustAddressZipCode = value;
    }

    /**
     * Gets the value of the outCustCountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustCountryGenericDetailDescription() {
        return outCustCountryGenericDetailDescription;
    }

    /**
     * Sets the value of the outCustCountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustCountryGenericDetailDescription(String value) {
        this.outCustCountryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outCustomerLanguageGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerLanguageGenericDetailDescription() {
        return outCustomerLanguageGenericDetailDescription;
    }

    /**
     * Sets the value of the outCustomerLanguageGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerLanguageGenericDetailDescription(String value) {
        this.outCustomerLanguageGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outCustomerLanguageGenericDetailSerialNum property.
     * 
     */
    public int getOutCustomerLanguageGenericDetailSerialNum() {
        return outCustomerLanguageGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outCustomerLanguageGenericDetailSerialNum property.
     * 
     */
    public void setOutCustomerLanguageGenericDetailSerialNum(int value) {
        this.outCustomerLanguageGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outDetails1CharSuppliedChar153 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDetails1CharSuppliedChar153() {
        return outDetails1CharSuppliedChar153;
    }

    /**
     * Sets the value of the outDetails1CharSuppliedChar153 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDetails1CharSuppliedChar153(String value) {
        this.outDetails1CharSuppliedChar153 = value;
    }

    /**
     * Gets the value of the outDetails2CharSuppliedChar153 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDetails2CharSuppliedChar153() {
        return outDetails2CharSuppliedChar153;
    }

    /**
     * Sets the value of the outDetails2CharSuppliedChar153 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDetails2CharSuppliedChar153(String value) {
        this.outDetails2CharSuppliedChar153 = value;
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
     * Gets the value of the outExtraIntIefSuppliedPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutExtraIntIefSuppliedPercentage() {
        return outExtraIntIefSuppliedPercentage;
    }

    /**
     * Sets the value of the outExtraIntIefSuppliedPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutExtraIntIefSuppliedPercentage(BigDecimal value) {
        this.outExtraIntIefSuppliedPercentage = value;
    }

    /**
     * Gets the value of the outInsurerCustomerCDigit property.
     * 
     */
    public short getOutInsurerCustomerCDigit() {
        return outInsurerCustomerCDigit;
    }

    /**
     * Sets the value of the outInsurerCustomerCDigit property.
     * 
     */
    public void setOutInsurerCustomerCDigit(short value) {
        this.outInsurerCustomerCDigit = value;
    }

    /**
     * Gets the value of the outInsurerCustomerCustId property.
     * 
     */
    public int getOutInsurerCustomerCustId() {
        return outInsurerCustomerCustId;
    }

    /**
     * Sets the value of the outInsurerCustomerCustId property.
     * 
     */
    public void setOutInsurerCustomerCustId(int value) {
        this.outInsurerCustomerCustId = value;
    }

    /**
     * Gets the value of the outInsurerCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInsurerCustomerSurname() {
        return outInsurerCustomerSurname;
    }

    /**
     * Sets the value of the outInsurerCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInsurerCustomerSurname(String value) {
        this.outInsurerCustomerSurname = value;
    }

    /**
     * Gets the value of the outIssuanceIssCommitmentExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutIssuanceIssCommitmentExpirationDate() {
        return outIssuanceIssCommitmentExpirationDate;
    }

    /**
     * Sets the value of the outIssuanceIssCommitmentExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutIssuanceIssCommitmentExpirationDate(XMLGregorianCalendar value) {
        this.outIssuanceIssCommitmentExpirationDate = value;
    }

    /**
     * Gets the value of the outIssuanceIssCommitmentIssuanceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIssuanceIssCommitmentIssuanceNumber() {
        return outIssuanceIssCommitmentIssuanceNumber;
    }

    /**
     * Sets the value of the outIssuanceIssCommitmentIssuanceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIssuanceIssCommitmentIssuanceNumber(String value) {
        this.outIssuanceIssCommitmentIssuanceNumber = value;
    }

    /**
     * Gets the value of the outIssuanceIssCommitmentTpSoIdentifier property.
     * 
     */
    public double getOutIssuanceIssCommitmentTpSoIdentifier() {
        return outIssuanceIssCommitmentTpSoIdentifier;
    }

    /**
     * Sets the value of the outIssuanceIssCommitmentTpSoIdentifier property.
     * 
     */
    public void setOutIssuanceIssCommitmentTpSoIdentifier(double value) {
        this.outIssuanceIssCommitmentTpSoIdentifier = value;
    }

    /**
     * Gets the value of the outLandRegRealEstateInsuranceEd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLandRegRealEstateInsuranceEd() {
        return outLandRegRealEstateInsuranceEd;
    }

    /**
     * Sets the value of the outLandRegRealEstateInsuranceEd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLandRegRealEstateInsuranceEd(XMLGregorianCalendar value) {
        this.outLandRegRealEstateInsuranceEd = value;
    }

    /**
     * Gets the value of the outLandRegRealEstateLandRegistId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLandRegRealEstateLandRegistId() {
        return outLandRegRealEstateLandRegistId;
    }

    /**
     * Sets the value of the outLandRegRealEstateLandRegistId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLandRegRealEstateLandRegistId(String value) {
        this.outLandRegRealEstateLandRegistId = value;
    }

    /**
     * Gets the value of the outLandRegRealEstateRealEstateDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLandRegRealEstateRealEstateDesc() {
        return outLandRegRealEstateRealEstateDesc;
    }

    /**
     * Sets the value of the outLandRegRealEstateRealEstateDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLandRegRealEstateRealEstateDesc(String value) {
        this.outLandRegRealEstateRealEstateDesc = value;
    }

    /**
     * Gets the value of the outLcatgGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLcatgGenericDetailDescription() {
        return outLcatgGenericDetailDescription;
    }

    /**
     * Sets the value of the outLcatgGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLcatgGenericDetailDescription(String value) {
        this.outLcatgGenericDetailDescription = value;
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
     * Gets the value of the outLoanParametersWordExtraitPrint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanParametersWordExtraitPrint() {
        return outLoanParametersWordExtraitPrint;
    }

    /**
     * Sets the value of the outLoanParametersWordExtraitPrint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanParametersWordExtraitPrint(String value) {
        this.outLoanParametersWordExtraitPrint = value;
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
     * Gets the value of the outMoreIefSuppliedNum2 property.
     * 
     */
    public short getOutMoreIefSuppliedNum2() {
        return outMoreIefSuppliedNum2;
    }

    /**
     * Sets the value of the outMoreIefSuppliedNum2 property.
     * 
     */
    public void setOutMoreIefSuppliedNum2(short value) {
        this.outMoreIefSuppliedNum2 = value;
    }

    /**
     * Gets the value of the outMoreIefSuppliedTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutMoreIefSuppliedTmstamp() {
        return outMoreIefSuppliedTmstamp;
    }

    /**
     * Sets the value of the outMoreIefSuppliedTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutMoreIefSuppliedTmstamp(XMLGregorianCalendar value) {
        this.outMoreIefSuppliedTmstamp = value;
    }

    /**
     * Gets the value of the outMovingCurrencyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMovingCurrencyDescription() {
        return outMovingCurrencyDescription;
    }

    /**
     * Sets the value of the outMovingCurrencyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMovingCurrencyDescription(String value) {
        this.outMovingCurrencyDescription = value;
    }

    /**
     * Gets the value of the outMovingCurrencyIdCurrency property.
     * 
     */
    public int getOutMovingCurrencyIdCurrency() {
        return outMovingCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outMovingCurrencyIdCurrency property.
     * 
     */
    public void setOutMovingCurrencyIdCurrency(int value) {
        this.outMovingCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outMovingCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMovingCurrencyShortDescr() {
        return outMovingCurrencyShortDescr;
    }

    /**
     * Sets the value of the outMovingCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMovingCurrencyShortDescr(String value) {
        this.outMovingCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outNrmCapAmnIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutNrmCapAmnIefSuppliedNumber152() {
        return outNrmCapAmnIefSuppliedNumber152;
    }

    /**
     * Sets the value of the outNrmCapAmnIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutNrmCapAmnIefSuppliedNumber152(BigDecimal value) {
        this.outNrmCapAmnIefSuppliedNumber152 = value;
    }

    /**
     * Gets the value of the outPenaltyInterestSupplyWorkFixedInterestPrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutPenaltyInterestSupplyWorkFixedInterestPrc() {
        return outPenaltyInterestSupplyWorkFixedInterestPrc;
    }

    /**
     * Sets the value of the outPenaltyInterestSupplyWorkFixedInterestPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutPenaltyInterestSupplyWorkFixedInterestPrc(BigDecimal value) {
        this.outPenaltyInterestSupplyWorkFixedInterestPrc = value;
    }

    /**
     * Gets the value of the outPolicyNoIefSuppliedChar40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPolicyNoIefSuppliedChar40() {
        return outPolicyNoIefSuppliedChar40;
    }

    /**
     * Sets the value of the outPolicyNoIefSuppliedChar40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPolicyNoIefSuppliedChar40(String value) {
        this.outPolicyNoIefSuppliedChar40 = value;
    }

    /**
     * Gets the value of the outPreviousIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutPreviousIefSuppliedAmount() {
        return outPreviousIefSuppliedAmount;
    }

    /**
     * Sets the value of the outPreviousIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutPreviousIefSuppliedAmount(BigDecimal value) {
        this.outPreviousIefSuppliedAmount = value;
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
     * Gets the value of the outRmListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRmListSetDescription() {
        return outRmListSetDescription;
    }

    /**
     * Sets the value of the outRmListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRmListSetDescription(String value) {
        this.outRmListSetDescription = value;
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
     * Gets the value of the outStatementFreqIefSuppliedChar30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutStatementFreqIefSuppliedChar30() {
        return outStatementFreqIefSuppliedChar30;
    }

    /**
     * Sets the value of the outStatementFreqIefSuppliedChar30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutStatementFreqIefSuppliedChar30(String value) {
        this.outStatementFreqIefSuppliedChar30 = value;
    }

    /**
     * Gets the value of the outTexInterestSupplyWorkFixedInterestPrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTexInterestSupplyWorkFixedInterestPrc() {
        return outTexInterestSupplyWorkFixedInterestPrc;
    }

    /**
     * Sets the value of the outTexInterestSupplyWorkFixedInterestPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTexInterestSupplyWorkFixedInterestPrc(BigDecimal value) {
        this.outTexInterestSupplyWorkFixedInterestPrc = value;
    }

    /**
     * Gets the value of the outTotArrearsAmntIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotArrearsAmntIefSuppliedNumber152() {
        return outTotArrearsAmntIefSuppliedNumber152;
    }

    /**
     * Sets the value of the outTotArrearsAmntIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotArrearsAmntIefSuppliedNumber152(BigDecimal value) {
        this.outTotArrearsAmntIefSuppliedNumber152 = value;
    }

    /**
     * Gets the value of the outTotArrrearsIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotArrrearsIefSuppliedNumber152() {
        return outTotArrrearsIefSuppliedNumber152;
    }

    /**
     * Sets the value of the outTotArrrearsIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotArrrearsIefSuppliedNumber152(BigDecimal value) {
        this.outTotArrrearsIefSuppliedNumber152 = value;
    }

    /**
     * Gets the value of the outTotCapAmntIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotCapAmntIefSuppliedNumber152() {
        return outTotCapAmntIefSuppliedNumber152;
    }

    /**
     * Sets the value of the outTotCapAmntIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotCapAmntIefSuppliedNumber152(BigDecimal value) {
        this.outTotCapAmntIefSuppliedNumber152 = value;
    }

    /**
     * Gets the value of the outTotIntInArrearsIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotIntInArrearsIefSuppliedNumber152() {
        return outTotIntInArrearsIefSuppliedNumber152;
    }

    /**
     * Sets the value of the outTotIntInArrearsIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotIntInArrearsIefSuppliedNumber152(BigDecimal value) {
        this.outTotIntInArrearsIefSuppliedNumber152 = value;
    }

    /**
     * Gets the value of the outTotInterChargedIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotInterChargedIefSuppliedNumber152() {
        return outTotInterChargedIefSuppliedNumber152;
    }

    /**
     * Sets the value of the outTotInterChargedIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotInterChargedIefSuppliedNumber152(BigDecimal value) {
        this.outTotInterChargedIefSuppliedNumber152 = value;
    }

    /**
     * Gets the value of the outTotIssPremIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotIssPremIefSuppliedNumber152() {
        return outTotIssPremIefSuppliedNumber152;
    }

    /**
     * Sets the value of the outTotIssPremIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotIssPremIefSuppliedNumber152(BigDecimal value) {
        this.outTotIssPremIefSuppliedNumber152 = value;
    }

    /**
     * Gets the value of the outTotPrincInArrearsIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotPrincInArrearsIefSuppliedNumber152() {
        return outTotPrincInArrearsIefSuppliedNumber152;
    }

    /**
     * Sets the value of the outTotPrincInArrearsIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotPrincInArrearsIefSuppliedNumber152(BigDecimal value) {
        this.outTotPrincInArrearsIefSuppliedNumber152 = value;
    }

    /**
     * Gets the value of the outTotPrincIntInArrearsIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotPrincIntInArrearsIefSuppliedNumber152() {
        return outTotPrincIntInArrearsIefSuppliedNumber152;
    }

    /**
     * Sets the value of the outTotPrincIntInArrearsIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotPrincIntInArrearsIefSuppliedNumber152(BigDecimal value) {
        this.outTotPrincIntInArrearsIefSuppliedNumber152 = value;
    }

    /**
     * Gets the value of the outUrlDefTotalIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutUrlDefTotalIefSuppliedNumber152() {
        return outUrlDefTotalIefSuppliedNumber152;
    }

    /**
     * Sets the value of the outUrlDefTotalIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutUrlDefTotalIefSuppliedNumber152(BigDecimal value) {
        this.outUrlDefTotalIefSuppliedNumber152 = value;
    }

    /**
     * Gets the value of the outUrlTotalIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutUrlTotalIefSuppliedNumber152() {
        return outUrlTotalIefSuppliedNumber152;
    }

    /**
     * Sets the value of the outUrlTotalIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutUrlTotalIefSuppliedNumber152(BigDecimal value) {
        this.outUrlTotalIefSuppliedNumber152 = value;
    }

    /**
     * Gets the value of the outGrpIssuance property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfL0437VOutGrpIssuanceItem }
     *     
     */
    public ArrayOfL0437VOutGrpIssuanceItem getOutGrpIssuance() {
        return outGrpIssuance;
    }

    /**
     * Sets the value of the outGrpIssuance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfL0437VOutGrpIssuanceItem }
     *     
     */
    public void setOutGrpIssuance(ArrayOfL0437VOutGrpIssuanceItem value) {
        this.outGrpIssuance = value;
    }

    /**
     * Gets the value of the outGrpLoanOnlineExtrait property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfL0437VOutGrpLoanOnlineExtraitItem }
     *     
     */
    public ArrayOfL0437VOutGrpLoanOnlineExtraitItem getOutGrpLoanOnlineExtrait() {
        return outGrpLoanOnlineExtrait;
    }

    /**
     * Sets the value of the outGrpLoanOnlineExtrait property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfL0437VOutGrpLoanOnlineExtraitItem }
     *     
     */
    public void setOutGrpLoanOnlineExtrait(ArrayOfL0437VOutGrpLoanOnlineExtraitItem value) {
        this.outGrpLoanOnlineExtrait = value;
    }

    /**
     * Gets the value of the outGrpLog property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfL0437VOutGrpLogItem }
     *     
     */
    public ArrayOfL0437VOutGrpLogItem getOutGrpLog() {
        return outGrpLog;
    }

    /**
     * Sets the value of the outGrpLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfL0437VOutGrpLogItem }
     *     
     */
    public void setOutGrpLog(ArrayOfL0437VOutGrpLogItem value) {
        this.outGrpLog = value;
    }

    /**
     * Gets the value of the isMore property.
     * 
     */
    public boolean isIsMore() {
        return isMore;
    }

    /**
     * Sets the value of the isMore property.
     * 
     */
    public void setIsMore(boolean value) {
        this.isMore = value;
    }

}
