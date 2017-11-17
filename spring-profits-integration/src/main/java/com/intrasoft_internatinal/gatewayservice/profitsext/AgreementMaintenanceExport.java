
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AgreementMaintenanceExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgreementMaintenanceExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutAccountOffBankemployeeCardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAccountOffBankemployeeFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAccountOffBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAccountOffBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgrDisableFieldsLoanParametersAgrDisableFlgs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementAccActiveCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutAgreementAccActiveNewCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAccDomCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutAgreementAccDomNewCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAccEuroZoneCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutAgreementAccEurzonNewCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAccFcCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutAgreementAccFcNewCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAccKind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementAccOpenExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutAgreementAdditionalCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAgrAmendmentCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutAgreementAgrAnnexDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutAgreementAgrBlockedCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutAgreementAgrBlockedLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAgreementAgrComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementAgrEuroIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementAgrExpiryDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutAgreementAgrExtraComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementAgrFcIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementAgrIssueDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutAgreementAgrLcIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementAgrLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAgreementAgrLimitInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAgrSigningDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutAgreementAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAgrStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementAgrTermDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutAgreementAgrUtilisedLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAgreementAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutAgreementDelOffAsnDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutAgreementDelPrvOffAsnDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutAgreementDelPrvOfficer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementHistoryCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementHistoryCurrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementOffAsgnDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutAgreementOneAccountFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementPrvOfficAsnDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutAgreementPrvOfficer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutAgreementUserCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementTypeAccExpiry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementTypeAgrExpiry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementTypeAgrLimitInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementTypeProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementTypeProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgrMonitoringUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgrMonitoringUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankemployeeIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankParametersBankCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBankParametersWordPrint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBenefIefSuppliedSubscript" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutClientProfitsExitStateWorkActualMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutClientProfitsExitStateWorkId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutClientProfitsExitStateWorkLanguage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutClientProfitsExitStateWorkMessageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutClientProfitsExitStateWorkPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutClientProfitsExitStateWorkRoutineSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutClientProfitsExitStateWorkTerminationAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutClientProfitsExitStateWorkValruleId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutClientProfitsExitStateWorkValruleSnum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustMailRecCustAddressSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustMailRecCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustStatusCustomerCustStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDelayOffBankemployeeCardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDelayOffBankemployeeFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDelayOffBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDelayOffBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDisableAgrSigningDtIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationAuthorizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationEvaluationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAdviceDetailLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpAdviceTotalLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpBeneficiaryLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpBenefRepresLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpGuarantorLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpGuarantRepresLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLogLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpUserTotalLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGuarantIefSuppliedSubscript" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLimitCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLimitCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanParametersAgreementPrint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProfitsAccountAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProfitsAccountAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProfitsAccountAgrUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProfitsAccountAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProfitsAccountCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProfitsAccountProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTrxCountAdvCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutUnitNameUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutVillageGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutVillageGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutVoucherLineParVoucherRunVoucherLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAdviceDetail" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpAdviceDetail" minOccurs="0"/>
 *         &lt;element name="OutGrpAdviceTotal" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpAdviceTotal" minOccurs="0"/>
 *         &lt;element name="OutGrpBeneficiary" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpBeneficiary" minOccurs="0"/>
 *         &lt;element name="OutGrpBenefRepres" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpBenefRepres" minOccurs="0"/>
 *         &lt;element name="OutGrpGuarantor" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpGuarantor" minOccurs="0"/>
 *         &lt;element name="OutGrpGuarantRepres" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpGuarantRepres" minOccurs="0"/>
 *         &lt;element name="OutGrpLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpLogA" minOccurs="0"/>
 *         &lt;element name="OutGrpUserTotal" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpUserTotal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreementMaintenanceExport", propOrder = {
    "outAccountOffBankemployeeCardId",
    "outAccountOffBankemployeeFirstName",
    "outAccountOffBankemployeeId",
    "outAccountOffBankemployeeLastName",
    "outAgrDisableFieldsLoanParametersAgrDisableFlgs",
    "outAgreementAccActiveCnt",
    "outAgreementAccActiveNewCnt",
    "outAgreementAccDomCnt",
    "outAgreementAccDomNewCnt",
    "outAgreementAccEuroZoneCnt",
    "outAgreementAccEurzonNewCnt",
    "outAgreementAccFcCnt",
    "outAgreementAccFcNewCnt",
    "outAgreementAccKind",
    "outAgreementAccOpenExpDt",
    "outAgreementAdditionalCnt",
    "outAgreementAgrAmendmentCnt",
    "outAgreementAgrAnnexDt",
    "outAgreementAgrBlockedCnt",
    "outAgreementAgrBlockedLimit",
    "outAgreementAgrComments",
    "outAgreementAgrEuroIndicator",
    "outAgreementAgrExpiryDt",
    "outAgreementAgrExtraComments",
    "outAgreementAgrFcIndicator",
    "outAgreementAgrIssueDt",
    "outAgreementAgrLcIndicator",
    "outAgreementAgrLimit",
    "outAgreementAgrLimitInd",
    "outAgreementAgrMembershipSn",
    "outAgreementAgrSigningDt",
    "outAgreementAgrSn",
    "outAgreementAgrStatus",
    "outAgreementAgrTermDt",
    "outAgreementAgrUtilisedLimit",
    "outAgreementAgrYear",
    "outAgreementDelOffAsnDt",
    "outAgreementDelPrvOffAsnDt",
    "outAgreementDelPrvOfficer",
    "outAgreementHistoryCnt",
    "outAgreementHistoryCurrSn",
    "outAgreementOffAsgnDt",
    "outAgreementOneAccountFlg",
    "outAgreementPrvOfficAsnDt",
    "outAgreementPrvOfficer",
    "outAgreementTmstamp",
    "outAgreementUserCode",
    "outAgreementTypeAccExpiry",
    "outAgreementTypeAgrExpiry",
    "outAgreementTypeAgrLimitInd",
    "outAgreementTypeProductDescription",
    "outAgreementTypeProductIdProduct",
    "outAgrMonitoringUnitCode",
    "outAgrMonitoringUnitUnitName",
    "outBankemployeeIefSuppliedFlag",
    "outBankParametersBankCode",
    "outBankParametersWordPrint",
    "outBenefIefSuppliedSubscript",
    "outClientProfitsExitStateWorkActualMessage",
    "outClientProfitsExitStateWorkId",
    "outClientProfitsExitStateWorkLanguage",
    "outClientProfitsExitStateWorkMessageType",
    "outClientProfitsExitStateWorkPrftSystem",
    "outClientProfitsExitStateWorkRoutineSn",
    "outClientProfitsExitStateWorkTerminationAction",
    "outClientProfitsExitStateWorkValruleId",
    "outClientProfitsExitStateWorkValruleSnum",
    "outCustMailRecCustAddressSerialNum",
    "outCustMailRecCustomerCustId",
    "outCustStatusCustomerCustStatus",
    "outDelayOffBankemployeeCardId",
    "outDelayOffBankemployeeFirstName",
    "outDelayOffBankemployeeId",
    "outDelayOffBankemployeeLastName",
    "outDisableAgrSigningDtIefSuppliedFlag",
    "outEvalResultTeamInformationAuthorizationType",
    "outEvalResultTeamInformationEvaluationResult",
    "outEvalResultTeamInformationRequiredProfile1",
    "outEvalResultTeamInformationRequiredProfile2",
    "outGrpAdviceDetailLength",
    "outGrpAdviceTotalLength",
    "outGrpBeneficiaryLength",
    "outGrpBenefRepresLength",
    "outGrpGuarantorLength",
    "outGrpGuarantRepresLength",
    "outGrpLogLength",
    "outGrpUserTotalLength",
    "outGuarantIefSuppliedSubscript",
    "outLimitCurrencyIdCurrency",
    "outLimitCurrencyShortDescr",
    "outLoanParametersAgreementPrint",
    "outProfitsAccountAccountCd",
    "outProfitsAccountAccountNumber",
    "outProfitsAccountAgrMembershipSn",
    "outProfitsAccountAgrSn",
    "outProfitsAccountAgrUnit",
    "outProfitsAccountAgrYear",
    "outProfitsAccountCustId",
    "outProfitsAccountPrftSystem",
    "outProfitsAccountProductId",
    "outTrxCountAdvCounter",
    "outTrxCountTrxCounter",
    "outUnitNameUnitUnitName",
    "outVillageGenericDetailDescription",
    "outVillageGenericDetailSerialNum",
    "outVoucherLineParVoucherRunVoucherLine",
    "outGrpAdviceDetail",
    "outGrpAdviceTotal",
    "outGrpBeneficiary",
    "outGrpBenefRepres",
    "outGrpGuarantor",
    "outGrpGuarantRepres",
    "outGrpLog",
    "outGrpUserTotal"
})
public class AgreementMaintenanceExport
    extends BaseExport
{

    @XmlElement(name = "OutAccountOffBankemployeeCardId")
    protected String outAccountOffBankemployeeCardId;
    @XmlElement(name = "OutAccountOffBankemployeeFirstName")
    protected String outAccountOffBankemployeeFirstName;
    @XmlElement(name = "OutAccountOffBankemployeeId")
    protected String outAccountOffBankemployeeId;
    @XmlElement(name = "OutAccountOffBankemployeeLastName")
    protected String outAccountOffBankemployeeLastName;
    @XmlElement(name = "OutAgrDisableFieldsLoanParametersAgrDisableFlgs")
    protected String outAgrDisableFieldsLoanParametersAgrDisableFlgs;
    @XmlElement(name = "OutAgreementAccActiveCnt")
    protected short outAgreementAccActiveCnt;
    @XmlElement(name = "OutAgreementAccActiveNewCnt")
    protected int outAgreementAccActiveNewCnt;
    @XmlElement(name = "OutAgreementAccDomCnt")
    protected short outAgreementAccDomCnt;
    @XmlElement(name = "OutAgreementAccDomNewCnt")
    protected int outAgreementAccDomNewCnt;
    @XmlElement(name = "OutAgreementAccEuroZoneCnt")
    protected short outAgreementAccEuroZoneCnt;
    @XmlElement(name = "OutAgreementAccEurzonNewCnt")
    protected int outAgreementAccEurzonNewCnt;
    @XmlElement(name = "OutAgreementAccFcCnt")
    protected short outAgreementAccFcCnt;
    @XmlElement(name = "OutAgreementAccFcNewCnt")
    protected int outAgreementAccFcNewCnt;
    @XmlElement(name = "OutAgreementAccKind")
    protected String outAgreementAccKind;
    @XmlElement(name = "OutAgreementAccOpenExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outAgreementAccOpenExpDt;
    @XmlElement(name = "OutAgreementAdditionalCnt")
    protected int outAgreementAdditionalCnt;
    @XmlElement(name = "OutAgreementAgrAmendmentCnt")
    protected short outAgreementAgrAmendmentCnt;
    @XmlElement(name = "OutAgreementAgrAnnexDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outAgreementAgrAnnexDt;
    @XmlElement(name = "OutAgreementAgrBlockedCnt")
    protected short outAgreementAgrBlockedCnt;
    @XmlElement(name = "OutAgreementAgrBlockedLimit", required = true)
    protected BigDecimal outAgreementAgrBlockedLimit;
    @XmlElement(name = "OutAgreementAgrComments")
    protected String outAgreementAgrComments;
    @XmlElement(name = "OutAgreementAgrEuroIndicator")
    protected String outAgreementAgrEuroIndicator;
    @XmlElement(name = "OutAgreementAgrExpiryDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outAgreementAgrExpiryDt;
    @XmlElement(name = "OutAgreementAgrExtraComments")
    protected String outAgreementAgrExtraComments;
    @XmlElement(name = "OutAgreementAgrFcIndicator")
    protected String outAgreementAgrFcIndicator;
    @XmlElement(name = "OutAgreementAgrIssueDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outAgreementAgrIssueDt;
    @XmlElement(name = "OutAgreementAgrLcIndicator")
    protected String outAgreementAgrLcIndicator;
    @XmlElement(name = "OutAgreementAgrLimit", required = true)
    protected BigDecimal outAgreementAgrLimit;
    @XmlElement(name = "OutAgreementAgrLimitInd")
    protected String outAgreementAgrLimitInd;
    @XmlElement(name = "OutAgreementAgrMembershipSn")
    protected int outAgreementAgrMembershipSn;
    @XmlElement(name = "OutAgreementAgrSigningDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outAgreementAgrSigningDt;
    @XmlElement(name = "OutAgreementAgrSn")
    protected int outAgreementAgrSn;
    @XmlElement(name = "OutAgreementAgrStatus")
    protected String outAgreementAgrStatus;
    @XmlElement(name = "OutAgreementAgrTermDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outAgreementAgrTermDt;
    @XmlElement(name = "OutAgreementAgrUtilisedLimit", required = true)
    protected BigDecimal outAgreementAgrUtilisedLimit;
    @XmlElement(name = "OutAgreementAgrYear")
    protected short outAgreementAgrYear;
    @XmlElement(name = "OutAgreementDelOffAsnDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outAgreementDelOffAsnDt;
    @XmlElement(name = "OutAgreementDelPrvOffAsnDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outAgreementDelPrvOffAsnDt;
    @XmlElement(name = "OutAgreementDelPrvOfficer")
    protected String outAgreementDelPrvOfficer;
    @XmlElement(name = "OutAgreementHistoryCnt")
    protected int outAgreementHistoryCnt;
    @XmlElement(name = "OutAgreementHistoryCurrSn")
    protected int outAgreementHistoryCurrSn;
    @XmlElement(name = "OutAgreementOffAsgnDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outAgreementOffAsgnDt;
    @XmlElement(name = "OutAgreementOneAccountFlg")
    protected String outAgreementOneAccountFlg;
    @XmlElement(name = "OutAgreementPrvOfficAsnDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outAgreementPrvOfficAsnDt;
    @XmlElement(name = "OutAgreementPrvOfficer")
    protected String outAgreementPrvOfficer;
    @XmlElement(name = "OutAgreementTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outAgreementTmstamp;
    @XmlElement(name = "OutAgreementUserCode")
    protected String outAgreementUserCode;
    @XmlElement(name = "OutAgreementTypeAccExpiry")
    protected String outAgreementTypeAccExpiry;
    @XmlElement(name = "OutAgreementTypeAgrExpiry")
    protected String outAgreementTypeAgrExpiry;
    @XmlElement(name = "OutAgreementTypeAgrLimitInd")
    protected String outAgreementTypeAgrLimitInd;
    @XmlElement(name = "OutAgreementTypeProductDescription")
    protected String outAgreementTypeProductDescription;
    @XmlElement(name = "OutAgreementTypeProductIdProduct")
    protected int outAgreementTypeProductIdProduct;
    @XmlElement(name = "OutAgrMonitoringUnitCode")
    protected int outAgrMonitoringUnitCode;
    @XmlElement(name = "OutAgrMonitoringUnitUnitName")
    protected String outAgrMonitoringUnitUnitName;
    @XmlElement(name = "OutBankemployeeIefSuppliedFlag")
    protected String outBankemployeeIefSuppliedFlag;
    @XmlElement(name = "OutBankParametersBankCode")
    protected short outBankParametersBankCode;
    @XmlElement(name = "OutBankParametersWordPrint")
    protected String outBankParametersWordPrint;
    @XmlElement(name = "OutBenefIefSuppliedSubscript")
    protected int outBenefIefSuppliedSubscript;
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
    @XmlElement(name = "OutCustMailRecCustAddressSerialNum")
    protected short outCustMailRecCustAddressSerialNum;
    @XmlElement(name = "OutCustMailRecCustomerCustId")
    protected int outCustMailRecCustomerCustId;
    @XmlElement(name = "OutCustStatusCustomerCustStatus")
    protected String outCustStatusCustomerCustStatus;
    @XmlElement(name = "OutDelayOffBankemployeeCardId")
    protected String outDelayOffBankemployeeCardId;
    @XmlElement(name = "OutDelayOffBankemployeeFirstName")
    protected String outDelayOffBankemployeeFirstName;
    @XmlElement(name = "OutDelayOffBankemployeeId")
    protected String outDelayOffBankemployeeId;
    @XmlElement(name = "OutDelayOffBankemployeeLastName")
    protected String outDelayOffBankemployeeLastName;
    @XmlElement(name = "OutDisableAgrSigningDtIefSuppliedFlag")
    protected String outDisableAgrSigningDtIefSuppliedFlag;
    @XmlElement(name = "OutEvalResultTeamInformationAuthorizationType")
    protected String outEvalResultTeamInformationAuthorizationType;
    @XmlElement(name = "OutEvalResultTeamInformationEvaluationResult")
    protected String outEvalResultTeamInformationEvaluationResult;
    @XmlElement(name = "OutEvalResultTeamInformationRequiredProfile1")
    protected String outEvalResultTeamInformationRequiredProfile1;
    @XmlElement(name = "OutEvalResultTeamInformationRequiredProfile2")
    protected String outEvalResultTeamInformationRequiredProfile2;
    @XmlElement(name = "OutGrpAdviceDetailLength")
    protected int outGrpAdviceDetailLength;
    @XmlElement(name = "OutGrpAdviceTotalLength")
    protected int outGrpAdviceTotalLength;
    @XmlElement(name = "OutGrpBeneficiaryLength")
    protected int outGrpBeneficiaryLength;
    @XmlElement(name = "OutGrpBenefRepresLength")
    protected int outGrpBenefRepresLength;
    @XmlElement(name = "OutGrpGuarantorLength")
    protected int outGrpGuarantorLength;
    @XmlElement(name = "OutGrpGuarantRepresLength")
    protected int outGrpGuarantRepresLength;
    @XmlElement(name = "OutGrpLogLength")
    protected int outGrpLogLength;
    @XmlElement(name = "OutGrpUserTotalLength")
    protected int outGrpUserTotalLength;
    @XmlElement(name = "OutGuarantIefSuppliedSubscript")
    protected int outGuarantIefSuppliedSubscript;
    @XmlElement(name = "OutLimitCurrencyIdCurrency")
    protected int outLimitCurrencyIdCurrency;
    @XmlElement(name = "OutLimitCurrencyShortDescr")
    protected String outLimitCurrencyShortDescr;
    @XmlElement(name = "OutLoanParametersAgreementPrint")
    protected String outLoanParametersAgreementPrint;
    @XmlElement(name = "OutProfitsAccountAccountCd")
    protected short outProfitsAccountAccountCd;
    @XmlElement(name = "OutProfitsAccountAccountNumber")
    protected String outProfitsAccountAccountNumber;
    @XmlElement(name = "OutProfitsAccountAgrMembershipSn")
    protected int outProfitsAccountAgrMembershipSn;
    @XmlElement(name = "OutProfitsAccountAgrSn")
    protected int outProfitsAccountAgrSn;
    @XmlElement(name = "OutProfitsAccountAgrUnit")
    protected int outProfitsAccountAgrUnit;
    @XmlElement(name = "OutProfitsAccountAgrYear")
    protected short outProfitsAccountAgrYear;
    @XmlElement(name = "OutProfitsAccountCustId")
    protected int outProfitsAccountCustId;
    @XmlElement(name = "OutProfitsAccountPrftSystem")
    protected short outProfitsAccountPrftSystem;
    @XmlElement(name = "OutProfitsAccountProductId")
    protected int outProfitsAccountProductId;
    @XmlElement(name = "OutTrxCountAdvCounter")
    protected int outTrxCountAdvCounter;
    @XmlElement(name = "OutTrxCountTrxCounter")
    protected int outTrxCountTrxCounter;
    @XmlElement(name = "OutUnitNameUnitUnitName")
    protected String outUnitNameUnitUnitName;
    @XmlElement(name = "OutVillageGenericDetailDescription")
    protected String outVillageGenericDetailDescription;
    @XmlElement(name = "OutVillageGenericDetailSerialNum")
    protected int outVillageGenericDetailSerialNum;
    @XmlElement(name = "OutVoucherLineParVoucherRunVoucherLine")
    protected String outVoucherLineParVoucherRunVoucherLine;
    @XmlElement(name = "OutGrpAdviceDetail")
    protected ArrayOfOutGrpAdviceDetail outGrpAdviceDetail;
    @XmlElement(name = "OutGrpAdviceTotal")
    protected ArrayOfOutGrpAdviceTotal outGrpAdviceTotal;
    @XmlElement(name = "OutGrpBeneficiary")
    protected ArrayOfOutGrpBeneficiary outGrpBeneficiary;
    @XmlElement(name = "OutGrpBenefRepres")
    protected ArrayOfOutGrpBenefRepres outGrpBenefRepres;
    @XmlElement(name = "OutGrpGuarantor")
    protected ArrayOfOutGrpGuarantor outGrpGuarantor;
    @XmlElement(name = "OutGrpGuarantRepres")
    protected ArrayOfOutGrpGuarantRepres outGrpGuarantRepres;
    @XmlElement(name = "OutGrpLog")
    protected ArrayOfOutGrpLogA outGrpLog;
    @XmlElement(name = "OutGrpUserTotal")
    protected ArrayOfOutGrpUserTotal outGrpUserTotal;

    /**
     * Gets the value of the outAccountOffBankemployeeCardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAccountOffBankemployeeCardId() {
        return outAccountOffBankemployeeCardId;
    }

    /**
     * Sets the value of the outAccountOffBankemployeeCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAccountOffBankemployeeCardId(String value) {
        this.outAccountOffBankemployeeCardId = value;
    }

    /**
     * Gets the value of the outAccountOffBankemployeeFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAccountOffBankemployeeFirstName() {
        return outAccountOffBankemployeeFirstName;
    }

    /**
     * Sets the value of the outAccountOffBankemployeeFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAccountOffBankemployeeFirstName(String value) {
        this.outAccountOffBankemployeeFirstName = value;
    }

    /**
     * Gets the value of the outAccountOffBankemployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAccountOffBankemployeeId() {
        return outAccountOffBankemployeeId;
    }

    /**
     * Sets the value of the outAccountOffBankemployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAccountOffBankemployeeId(String value) {
        this.outAccountOffBankemployeeId = value;
    }

    /**
     * Gets the value of the outAccountOffBankemployeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAccountOffBankemployeeLastName() {
        return outAccountOffBankemployeeLastName;
    }

    /**
     * Sets the value of the outAccountOffBankemployeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAccountOffBankemployeeLastName(String value) {
        this.outAccountOffBankemployeeLastName = value;
    }

    /**
     * Gets the value of the outAgrDisableFieldsLoanParametersAgrDisableFlgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgrDisableFieldsLoanParametersAgrDisableFlgs() {
        return outAgrDisableFieldsLoanParametersAgrDisableFlgs;
    }

    /**
     * Sets the value of the outAgrDisableFieldsLoanParametersAgrDisableFlgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgrDisableFieldsLoanParametersAgrDisableFlgs(String value) {
        this.outAgrDisableFieldsLoanParametersAgrDisableFlgs = value;
    }

    /**
     * Gets the value of the outAgreementAccActiveCnt property.
     * 
     */
    public short getOutAgreementAccActiveCnt() {
        return outAgreementAccActiveCnt;
    }

    /**
     * Sets the value of the outAgreementAccActiveCnt property.
     * 
     */
    public void setOutAgreementAccActiveCnt(short value) {
        this.outAgreementAccActiveCnt = value;
    }

    /**
     * Gets the value of the outAgreementAccActiveNewCnt property.
     * 
     */
    public int getOutAgreementAccActiveNewCnt() {
        return outAgreementAccActiveNewCnt;
    }

    /**
     * Sets the value of the outAgreementAccActiveNewCnt property.
     * 
     */
    public void setOutAgreementAccActiveNewCnt(int value) {
        this.outAgreementAccActiveNewCnt = value;
    }

    /**
     * Gets the value of the outAgreementAccDomCnt property.
     * 
     */
    public short getOutAgreementAccDomCnt() {
        return outAgreementAccDomCnt;
    }

    /**
     * Sets the value of the outAgreementAccDomCnt property.
     * 
     */
    public void setOutAgreementAccDomCnt(short value) {
        this.outAgreementAccDomCnt = value;
    }

    /**
     * Gets the value of the outAgreementAccDomNewCnt property.
     * 
     */
    public int getOutAgreementAccDomNewCnt() {
        return outAgreementAccDomNewCnt;
    }

    /**
     * Sets the value of the outAgreementAccDomNewCnt property.
     * 
     */
    public void setOutAgreementAccDomNewCnt(int value) {
        this.outAgreementAccDomNewCnt = value;
    }

    /**
     * Gets the value of the outAgreementAccEuroZoneCnt property.
     * 
     */
    public short getOutAgreementAccEuroZoneCnt() {
        return outAgreementAccEuroZoneCnt;
    }

    /**
     * Sets the value of the outAgreementAccEuroZoneCnt property.
     * 
     */
    public void setOutAgreementAccEuroZoneCnt(short value) {
        this.outAgreementAccEuroZoneCnt = value;
    }

    /**
     * Gets the value of the outAgreementAccEurzonNewCnt property.
     * 
     */
    public int getOutAgreementAccEurzonNewCnt() {
        return outAgreementAccEurzonNewCnt;
    }

    /**
     * Sets the value of the outAgreementAccEurzonNewCnt property.
     * 
     */
    public void setOutAgreementAccEurzonNewCnt(int value) {
        this.outAgreementAccEurzonNewCnt = value;
    }

    /**
     * Gets the value of the outAgreementAccFcCnt property.
     * 
     */
    public short getOutAgreementAccFcCnt() {
        return outAgreementAccFcCnt;
    }

    /**
     * Sets the value of the outAgreementAccFcCnt property.
     * 
     */
    public void setOutAgreementAccFcCnt(short value) {
        this.outAgreementAccFcCnt = value;
    }

    /**
     * Gets the value of the outAgreementAccFcNewCnt property.
     * 
     */
    public int getOutAgreementAccFcNewCnt() {
        return outAgreementAccFcNewCnt;
    }

    /**
     * Sets the value of the outAgreementAccFcNewCnt property.
     * 
     */
    public void setOutAgreementAccFcNewCnt(int value) {
        this.outAgreementAccFcNewCnt = value;
    }

    /**
     * Gets the value of the outAgreementAccKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgreementAccKind() {
        return outAgreementAccKind;
    }

    /**
     * Sets the value of the outAgreementAccKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgreementAccKind(String value) {
        this.outAgreementAccKind = value;
    }

    /**
     * Gets the value of the outAgreementAccOpenExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutAgreementAccOpenExpDt() {
        return outAgreementAccOpenExpDt;
    }

    /**
     * Sets the value of the outAgreementAccOpenExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutAgreementAccOpenExpDt(XMLGregorianCalendar value) {
        this.outAgreementAccOpenExpDt = value;
    }

    /**
     * Gets the value of the outAgreementAdditionalCnt property.
     * 
     */
    public int getOutAgreementAdditionalCnt() {
        return outAgreementAdditionalCnt;
    }

    /**
     * Sets the value of the outAgreementAdditionalCnt property.
     * 
     */
    public void setOutAgreementAdditionalCnt(int value) {
        this.outAgreementAdditionalCnt = value;
    }

    /**
     * Gets the value of the outAgreementAgrAmendmentCnt property.
     * 
     */
    public short getOutAgreementAgrAmendmentCnt() {
        return outAgreementAgrAmendmentCnt;
    }

    /**
     * Sets the value of the outAgreementAgrAmendmentCnt property.
     * 
     */
    public void setOutAgreementAgrAmendmentCnt(short value) {
        this.outAgreementAgrAmendmentCnt = value;
    }

    /**
     * Gets the value of the outAgreementAgrAnnexDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutAgreementAgrAnnexDt() {
        return outAgreementAgrAnnexDt;
    }

    /**
     * Sets the value of the outAgreementAgrAnnexDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutAgreementAgrAnnexDt(XMLGregorianCalendar value) {
        this.outAgreementAgrAnnexDt = value;
    }

    /**
     * Gets the value of the outAgreementAgrBlockedCnt property.
     * 
     */
    public short getOutAgreementAgrBlockedCnt() {
        return outAgreementAgrBlockedCnt;
    }

    /**
     * Sets the value of the outAgreementAgrBlockedCnt property.
     * 
     */
    public void setOutAgreementAgrBlockedCnt(short value) {
        this.outAgreementAgrBlockedCnt = value;
    }

    /**
     * Gets the value of the outAgreementAgrBlockedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAgreementAgrBlockedLimit() {
        return outAgreementAgrBlockedLimit;
    }

    /**
     * Sets the value of the outAgreementAgrBlockedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAgreementAgrBlockedLimit(BigDecimal value) {
        this.outAgreementAgrBlockedLimit = value;
    }

    /**
     * Gets the value of the outAgreementAgrComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgreementAgrComments() {
        return outAgreementAgrComments;
    }

    /**
     * Sets the value of the outAgreementAgrComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgreementAgrComments(String value) {
        this.outAgreementAgrComments = value;
    }

    /**
     * Gets the value of the outAgreementAgrEuroIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgreementAgrEuroIndicator() {
        return outAgreementAgrEuroIndicator;
    }

    /**
     * Sets the value of the outAgreementAgrEuroIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgreementAgrEuroIndicator(String value) {
        this.outAgreementAgrEuroIndicator = value;
    }

    /**
     * Gets the value of the outAgreementAgrExpiryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutAgreementAgrExpiryDt() {
        return outAgreementAgrExpiryDt;
    }

    /**
     * Sets the value of the outAgreementAgrExpiryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutAgreementAgrExpiryDt(XMLGregorianCalendar value) {
        this.outAgreementAgrExpiryDt = value;
    }

    /**
     * Gets the value of the outAgreementAgrExtraComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgreementAgrExtraComments() {
        return outAgreementAgrExtraComments;
    }

    /**
     * Sets the value of the outAgreementAgrExtraComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgreementAgrExtraComments(String value) {
        this.outAgreementAgrExtraComments = value;
    }

    /**
     * Gets the value of the outAgreementAgrFcIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgreementAgrFcIndicator() {
        return outAgreementAgrFcIndicator;
    }

    /**
     * Sets the value of the outAgreementAgrFcIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgreementAgrFcIndicator(String value) {
        this.outAgreementAgrFcIndicator = value;
    }

    /**
     * Gets the value of the outAgreementAgrIssueDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutAgreementAgrIssueDt() {
        return outAgreementAgrIssueDt;
    }

    /**
     * Sets the value of the outAgreementAgrIssueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutAgreementAgrIssueDt(XMLGregorianCalendar value) {
        this.outAgreementAgrIssueDt = value;
    }

    /**
     * Gets the value of the outAgreementAgrLcIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgreementAgrLcIndicator() {
        return outAgreementAgrLcIndicator;
    }

    /**
     * Sets the value of the outAgreementAgrLcIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgreementAgrLcIndicator(String value) {
        this.outAgreementAgrLcIndicator = value;
    }

    /**
     * Gets the value of the outAgreementAgrLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAgreementAgrLimit() {
        return outAgreementAgrLimit;
    }

    /**
     * Sets the value of the outAgreementAgrLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAgreementAgrLimit(BigDecimal value) {
        this.outAgreementAgrLimit = value;
    }

    /**
     * Gets the value of the outAgreementAgrLimitInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgreementAgrLimitInd() {
        return outAgreementAgrLimitInd;
    }

    /**
     * Sets the value of the outAgreementAgrLimitInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgreementAgrLimitInd(String value) {
        this.outAgreementAgrLimitInd = value;
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
     * Gets the value of the outAgreementAgrStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgreementAgrStatus() {
        return outAgreementAgrStatus;
    }

    /**
     * Sets the value of the outAgreementAgrStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgreementAgrStatus(String value) {
        this.outAgreementAgrStatus = value;
    }

    /**
     * Gets the value of the outAgreementAgrTermDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutAgreementAgrTermDt() {
        return outAgreementAgrTermDt;
    }

    /**
     * Sets the value of the outAgreementAgrTermDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutAgreementAgrTermDt(XMLGregorianCalendar value) {
        this.outAgreementAgrTermDt = value;
    }

    /**
     * Gets the value of the outAgreementAgrUtilisedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAgreementAgrUtilisedLimit() {
        return outAgreementAgrUtilisedLimit;
    }

    /**
     * Sets the value of the outAgreementAgrUtilisedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAgreementAgrUtilisedLimit(BigDecimal value) {
        this.outAgreementAgrUtilisedLimit = value;
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
     * Gets the value of the outAgreementDelOffAsnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutAgreementDelOffAsnDt() {
        return outAgreementDelOffAsnDt;
    }

    /**
     * Sets the value of the outAgreementDelOffAsnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutAgreementDelOffAsnDt(XMLGregorianCalendar value) {
        this.outAgreementDelOffAsnDt = value;
    }

    /**
     * Gets the value of the outAgreementDelPrvOffAsnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutAgreementDelPrvOffAsnDt() {
        return outAgreementDelPrvOffAsnDt;
    }

    /**
     * Sets the value of the outAgreementDelPrvOffAsnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutAgreementDelPrvOffAsnDt(XMLGregorianCalendar value) {
        this.outAgreementDelPrvOffAsnDt = value;
    }

    /**
     * Gets the value of the outAgreementDelPrvOfficer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgreementDelPrvOfficer() {
        return outAgreementDelPrvOfficer;
    }

    /**
     * Sets the value of the outAgreementDelPrvOfficer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgreementDelPrvOfficer(String value) {
        this.outAgreementDelPrvOfficer = value;
    }

    /**
     * Gets the value of the outAgreementHistoryCnt property.
     * 
     */
    public int getOutAgreementHistoryCnt() {
        return outAgreementHistoryCnt;
    }

    /**
     * Sets the value of the outAgreementHistoryCnt property.
     * 
     */
    public void setOutAgreementHistoryCnt(int value) {
        this.outAgreementHistoryCnt = value;
    }

    /**
     * Gets the value of the outAgreementHistoryCurrSn property.
     * 
     */
    public int getOutAgreementHistoryCurrSn() {
        return outAgreementHistoryCurrSn;
    }

    /**
     * Sets the value of the outAgreementHistoryCurrSn property.
     * 
     */
    public void setOutAgreementHistoryCurrSn(int value) {
        this.outAgreementHistoryCurrSn = value;
    }

    /**
     * Gets the value of the outAgreementOffAsgnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutAgreementOffAsgnDt() {
        return outAgreementOffAsgnDt;
    }

    /**
     * Sets the value of the outAgreementOffAsgnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutAgreementOffAsgnDt(XMLGregorianCalendar value) {
        this.outAgreementOffAsgnDt = value;
    }

    /**
     * Gets the value of the outAgreementOneAccountFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgreementOneAccountFlg() {
        return outAgreementOneAccountFlg;
    }

    /**
     * Sets the value of the outAgreementOneAccountFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgreementOneAccountFlg(String value) {
        this.outAgreementOneAccountFlg = value;
    }

    /**
     * Gets the value of the outAgreementPrvOfficAsnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutAgreementPrvOfficAsnDt() {
        return outAgreementPrvOfficAsnDt;
    }

    /**
     * Sets the value of the outAgreementPrvOfficAsnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutAgreementPrvOfficAsnDt(XMLGregorianCalendar value) {
        this.outAgreementPrvOfficAsnDt = value;
    }

    /**
     * Gets the value of the outAgreementPrvOfficer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgreementPrvOfficer() {
        return outAgreementPrvOfficer;
    }

    /**
     * Sets the value of the outAgreementPrvOfficer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgreementPrvOfficer(String value) {
        this.outAgreementPrvOfficer = value;
    }

    /**
     * Gets the value of the outAgreementTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutAgreementTmstamp() {
        return outAgreementTmstamp;
    }

    /**
     * Sets the value of the outAgreementTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutAgreementTmstamp(XMLGregorianCalendar value) {
        this.outAgreementTmstamp = value;
    }

    /**
     * Gets the value of the outAgreementUserCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgreementUserCode() {
        return outAgreementUserCode;
    }

    /**
     * Sets the value of the outAgreementUserCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgreementUserCode(String value) {
        this.outAgreementUserCode = value;
    }

    /**
     * Gets the value of the outAgreementTypeAccExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgreementTypeAccExpiry() {
        return outAgreementTypeAccExpiry;
    }

    /**
     * Sets the value of the outAgreementTypeAccExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgreementTypeAccExpiry(String value) {
        this.outAgreementTypeAccExpiry = value;
    }

    /**
     * Gets the value of the outAgreementTypeAgrExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgreementTypeAgrExpiry() {
        return outAgreementTypeAgrExpiry;
    }

    /**
     * Sets the value of the outAgreementTypeAgrExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgreementTypeAgrExpiry(String value) {
        this.outAgreementTypeAgrExpiry = value;
    }

    /**
     * Gets the value of the outAgreementTypeAgrLimitInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgreementTypeAgrLimitInd() {
        return outAgreementTypeAgrLimitInd;
    }

    /**
     * Sets the value of the outAgreementTypeAgrLimitInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgreementTypeAgrLimitInd(String value) {
        this.outAgreementTypeAgrLimitInd = value;
    }

    /**
     * Gets the value of the outAgreementTypeProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgreementTypeProductDescription() {
        return outAgreementTypeProductDescription;
    }

    /**
     * Sets the value of the outAgreementTypeProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgreementTypeProductDescription(String value) {
        this.outAgreementTypeProductDescription = value;
    }

    /**
     * Gets the value of the outAgreementTypeProductIdProduct property.
     * 
     */
    public int getOutAgreementTypeProductIdProduct() {
        return outAgreementTypeProductIdProduct;
    }

    /**
     * Sets the value of the outAgreementTypeProductIdProduct property.
     * 
     */
    public void setOutAgreementTypeProductIdProduct(int value) {
        this.outAgreementTypeProductIdProduct = value;
    }

    /**
     * Gets the value of the outAgrMonitoringUnitCode property.
     * 
     */
    public int getOutAgrMonitoringUnitCode() {
        return outAgrMonitoringUnitCode;
    }

    /**
     * Sets the value of the outAgrMonitoringUnitCode property.
     * 
     */
    public void setOutAgrMonitoringUnitCode(int value) {
        this.outAgrMonitoringUnitCode = value;
    }

    /**
     * Gets the value of the outAgrMonitoringUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgrMonitoringUnitUnitName() {
        return outAgrMonitoringUnitUnitName;
    }

    /**
     * Sets the value of the outAgrMonitoringUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgrMonitoringUnitUnitName(String value) {
        this.outAgrMonitoringUnitUnitName = value;
    }

    /**
     * Gets the value of the outBankemployeeIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankemployeeIefSuppliedFlag() {
        return outBankemployeeIefSuppliedFlag;
    }

    /**
     * Sets the value of the outBankemployeeIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankemployeeIefSuppliedFlag(String value) {
        this.outBankemployeeIefSuppliedFlag = value;
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
     * Gets the value of the outBankParametersWordPrint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankParametersWordPrint() {
        return outBankParametersWordPrint;
    }

    /**
     * Sets the value of the outBankParametersWordPrint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankParametersWordPrint(String value) {
        this.outBankParametersWordPrint = value;
    }

    /**
     * Gets the value of the outBenefIefSuppliedSubscript property.
     * 
     */
    public int getOutBenefIefSuppliedSubscript() {
        return outBenefIefSuppliedSubscript;
    }

    /**
     * Sets the value of the outBenefIefSuppliedSubscript property.
     * 
     */
    public void setOutBenefIefSuppliedSubscript(int value) {
        this.outBenefIefSuppliedSubscript = value;
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
     * Gets the value of the outCustMailRecCustAddressSerialNum property.
     * 
     */
    public short getOutCustMailRecCustAddressSerialNum() {
        return outCustMailRecCustAddressSerialNum;
    }

    /**
     * Sets the value of the outCustMailRecCustAddressSerialNum property.
     * 
     */
    public void setOutCustMailRecCustAddressSerialNum(short value) {
        this.outCustMailRecCustAddressSerialNum = value;
    }

    /**
     * Gets the value of the outCustMailRecCustomerCustId property.
     * 
     */
    public int getOutCustMailRecCustomerCustId() {
        return outCustMailRecCustomerCustId;
    }

    /**
     * Sets the value of the outCustMailRecCustomerCustId property.
     * 
     */
    public void setOutCustMailRecCustomerCustId(int value) {
        this.outCustMailRecCustomerCustId = value;
    }

    /**
     * Gets the value of the outCustStatusCustomerCustStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustStatusCustomerCustStatus() {
        return outCustStatusCustomerCustStatus;
    }

    /**
     * Sets the value of the outCustStatusCustomerCustStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustStatusCustomerCustStatus(String value) {
        this.outCustStatusCustomerCustStatus = value;
    }

    /**
     * Gets the value of the outDelayOffBankemployeeCardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDelayOffBankemployeeCardId() {
        return outDelayOffBankemployeeCardId;
    }

    /**
     * Sets the value of the outDelayOffBankemployeeCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDelayOffBankemployeeCardId(String value) {
        this.outDelayOffBankemployeeCardId = value;
    }

    /**
     * Gets the value of the outDelayOffBankemployeeFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDelayOffBankemployeeFirstName() {
        return outDelayOffBankemployeeFirstName;
    }

    /**
     * Sets the value of the outDelayOffBankemployeeFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDelayOffBankemployeeFirstName(String value) {
        this.outDelayOffBankemployeeFirstName = value;
    }

    /**
     * Gets the value of the outDelayOffBankemployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDelayOffBankemployeeId() {
        return outDelayOffBankemployeeId;
    }

    /**
     * Sets the value of the outDelayOffBankemployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDelayOffBankemployeeId(String value) {
        this.outDelayOffBankemployeeId = value;
    }

    /**
     * Gets the value of the outDelayOffBankemployeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDelayOffBankemployeeLastName() {
        return outDelayOffBankemployeeLastName;
    }

    /**
     * Sets the value of the outDelayOffBankemployeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDelayOffBankemployeeLastName(String value) {
        this.outDelayOffBankemployeeLastName = value;
    }

    /**
     * Gets the value of the outDisableAgrSigningDtIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDisableAgrSigningDtIefSuppliedFlag() {
        return outDisableAgrSigningDtIefSuppliedFlag;
    }

    /**
     * Sets the value of the outDisableAgrSigningDtIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDisableAgrSigningDtIefSuppliedFlag(String value) {
        this.outDisableAgrSigningDtIefSuppliedFlag = value;
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
     * Gets the value of the outGrpAdviceDetailLength property.
     * 
     */
    public int getOutGrpAdviceDetailLength() {
        return outGrpAdviceDetailLength;
    }

    /**
     * Sets the value of the outGrpAdviceDetailLength property.
     * 
     */
    public void setOutGrpAdviceDetailLength(int value) {
        this.outGrpAdviceDetailLength = value;
    }

    /**
     * Gets the value of the outGrpAdviceTotalLength property.
     * 
     */
    public int getOutGrpAdviceTotalLength() {
        return outGrpAdviceTotalLength;
    }

    /**
     * Sets the value of the outGrpAdviceTotalLength property.
     * 
     */
    public void setOutGrpAdviceTotalLength(int value) {
        this.outGrpAdviceTotalLength = value;
    }

    /**
     * Gets the value of the outGrpBeneficiaryLength property.
     * 
     */
    public int getOutGrpBeneficiaryLength() {
        return outGrpBeneficiaryLength;
    }

    /**
     * Sets the value of the outGrpBeneficiaryLength property.
     * 
     */
    public void setOutGrpBeneficiaryLength(int value) {
        this.outGrpBeneficiaryLength = value;
    }

    /**
     * Gets the value of the outGrpBenefRepresLength property.
     * 
     */
    public int getOutGrpBenefRepresLength() {
        return outGrpBenefRepresLength;
    }

    /**
     * Sets the value of the outGrpBenefRepresLength property.
     * 
     */
    public void setOutGrpBenefRepresLength(int value) {
        this.outGrpBenefRepresLength = value;
    }

    /**
     * Gets the value of the outGrpGuarantorLength property.
     * 
     */
    public int getOutGrpGuarantorLength() {
        return outGrpGuarantorLength;
    }

    /**
     * Sets the value of the outGrpGuarantorLength property.
     * 
     */
    public void setOutGrpGuarantorLength(int value) {
        this.outGrpGuarantorLength = value;
    }

    /**
     * Gets the value of the outGrpGuarantRepresLength property.
     * 
     */
    public int getOutGrpGuarantRepresLength() {
        return outGrpGuarantRepresLength;
    }

    /**
     * Sets the value of the outGrpGuarantRepresLength property.
     * 
     */
    public void setOutGrpGuarantRepresLength(int value) {
        this.outGrpGuarantRepresLength = value;
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
     * Gets the value of the outGrpUserTotalLength property.
     * 
     */
    public int getOutGrpUserTotalLength() {
        return outGrpUserTotalLength;
    }

    /**
     * Sets the value of the outGrpUserTotalLength property.
     * 
     */
    public void setOutGrpUserTotalLength(int value) {
        this.outGrpUserTotalLength = value;
    }

    /**
     * Gets the value of the outGuarantIefSuppliedSubscript property.
     * 
     */
    public int getOutGuarantIefSuppliedSubscript() {
        return outGuarantIefSuppliedSubscript;
    }

    /**
     * Sets the value of the outGuarantIefSuppliedSubscript property.
     * 
     */
    public void setOutGuarantIefSuppliedSubscript(int value) {
        this.outGuarantIefSuppliedSubscript = value;
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
     * Gets the value of the outLoanParametersAgreementPrint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanParametersAgreementPrint() {
        return outLoanParametersAgreementPrint;
    }

    /**
     * Sets the value of the outLoanParametersAgreementPrint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanParametersAgreementPrint(String value) {
        this.outLoanParametersAgreementPrint = value;
    }

    /**
     * Gets the value of the outProfitsAccountAccountCd property.
     * 
     */
    public short getOutProfitsAccountAccountCd() {
        return outProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outProfitsAccountAccountCd property.
     * 
     */
    public void setOutProfitsAccountAccountCd(short value) {
        this.outProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProfitsAccountAccountNumber() {
        return outProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProfitsAccountAccountNumber(String value) {
        this.outProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outProfitsAccountAgrMembershipSn property.
     * 
     */
    public int getOutProfitsAccountAgrMembershipSn() {
        return outProfitsAccountAgrMembershipSn;
    }

    /**
     * Sets the value of the outProfitsAccountAgrMembershipSn property.
     * 
     */
    public void setOutProfitsAccountAgrMembershipSn(int value) {
        this.outProfitsAccountAgrMembershipSn = value;
    }

    /**
     * Gets the value of the outProfitsAccountAgrSn property.
     * 
     */
    public int getOutProfitsAccountAgrSn() {
        return outProfitsAccountAgrSn;
    }

    /**
     * Sets the value of the outProfitsAccountAgrSn property.
     * 
     */
    public void setOutProfitsAccountAgrSn(int value) {
        this.outProfitsAccountAgrSn = value;
    }

    /**
     * Gets the value of the outProfitsAccountAgrUnit property.
     * 
     */
    public int getOutProfitsAccountAgrUnit() {
        return outProfitsAccountAgrUnit;
    }

    /**
     * Sets the value of the outProfitsAccountAgrUnit property.
     * 
     */
    public void setOutProfitsAccountAgrUnit(int value) {
        this.outProfitsAccountAgrUnit = value;
    }

    /**
     * Gets the value of the outProfitsAccountAgrYear property.
     * 
     */
    public short getOutProfitsAccountAgrYear() {
        return outProfitsAccountAgrYear;
    }

    /**
     * Sets the value of the outProfitsAccountAgrYear property.
     * 
     */
    public void setOutProfitsAccountAgrYear(short value) {
        this.outProfitsAccountAgrYear = value;
    }

    /**
     * Gets the value of the outProfitsAccountCustId property.
     * 
     */
    public int getOutProfitsAccountCustId() {
        return outProfitsAccountCustId;
    }

    /**
     * Sets the value of the outProfitsAccountCustId property.
     * 
     */
    public void setOutProfitsAccountCustId(int value) {
        this.outProfitsAccountCustId = value;
    }

    /**
     * Gets the value of the outProfitsAccountPrftSystem property.
     * 
     */
    public short getOutProfitsAccountPrftSystem() {
        return outProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the outProfitsAccountPrftSystem property.
     * 
     */
    public void setOutProfitsAccountPrftSystem(short value) {
        this.outProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the outProfitsAccountProductId property.
     * 
     */
    public int getOutProfitsAccountProductId() {
        return outProfitsAccountProductId;
    }

    /**
     * Sets the value of the outProfitsAccountProductId property.
     * 
     */
    public void setOutProfitsAccountProductId(int value) {
        this.outProfitsAccountProductId = value;
    }

    /**
     * Gets the value of the outTrxCountAdvCounter property.
     * 
     */
    public int getOutTrxCountAdvCounter() {
        return outTrxCountAdvCounter;
    }

    /**
     * Sets the value of the outTrxCountAdvCounter property.
     * 
     */
    public void setOutTrxCountAdvCounter(int value) {
        this.outTrxCountAdvCounter = value;
    }

    /**
     * Gets the value of the outTrxCountTrxCounter property.
     * 
     */
    public int getOutTrxCountTrxCounter() {
        return outTrxCountTrxCounter;
    }

    /**
     * Sets the value of the outTrxCountTrxCounter property.
     * 
     */
    public void setOutTrxCountTrxCounter(int value) {
        this.outTrxCountTrxCounter = value;
    }

    /**
     * Gets the value of the outUnitNameUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUnitNameUnitUnitName() {
        return outUnitNameUnitUnitName;
    }

    /**
     * Sets the value of the outUnitNameUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUnitNameUnitUnitName(String value) {
        this.outUnitNameUnitUnitName = value;
    }

    /**
     * Gets the value of the outVillageGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutVillageGenericDetailDescription() {
        return outVillageGenericDetailDescription;
    }

    /**
     * Sets the value of the outVillageGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutVillageGenericDetailDescription(String value) {
        this.outVillageGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outVillageGenericDetailSerialNum property.
     * 
     */
    public int getOutVillageGenericDetailSerialNum() {
        return outVillageGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outVillageGenericDetailSerialNum property.
     * 
     */
    public void setOutVillageGenericDetailSerialNum(int value) {
        this.outVillageGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outVoucherLineParVoucherRunVoucherLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutVoucherLineParVoucherRunVoucherLine() {
        return outVoucherLineParVoucherRunVoucherLine;
    }

    /**
     * Sets the value of the outVoucherLineParVoucherRunVoucherLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutVoucherLineParVoucherRunVoucherLine(String value) {
        this.outVoucherLineParVoucherRunVoucherLine = value;
    }

    /**
     * Gets the value of the outGrpAdviceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpAdviceDetail }
     *     
     */
    public ArrayOfOutGrpAdviceDetail getOutGrpAdviceDetail() {
        return outGrpAdviceDetail;
    }

    /**
     * Sets the value of the outGrpAdviceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpAdviceDetail }
     *     
     */
    public void setOutGrpAdviceDetail(ArrayOfOutGrpAdviceDetail value) {
        this.outGrpAdviceDetail = value;
    }

    /**
     * Gets the value of the outGrpAdviceTotal property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpAdviceTotal }
     *     
     */
    public ArrayOfOutGrpAdviceTotal getOutGrpAdviceTotal() {
        return outGrpAdviceTotal;
    }

    /**
     * Sets the value of the outGrpAdviceTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpAdviceTotal }
     *     
     */
    public void setOutGrpAdviceTotal(ArrayOfOutGrpAdviceTotal value) {
        this.outGrpAdviceTotal = value;
    }

    /**
     * Gets the value of the outGrpBeneficiary property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpBeneficiary }
     *     
     */
    public ArrayOfOutGrpBeneficiary getOutGrpBeneficiary() {
        return outGrpBeneficiary;
    }

    /**
     * Sets the value of the outGrpBeneficiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpBeneficiary }
     *     
     */
    public void setOutGrpBeneficiary(ArrayOfOutGrpBeneficiary value) {
        this.outGrpBeneficiary = value;
    }

    /**
     * Gets the value of the outGrpBenefRepres property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpBenefRepres }
     *     
     */
    public ArrayOfOutGrpBenefRepres getOutGrpBenefRepres() {
        return outGrpBenefRepres;
    }

    /**
     * Sets the value of the outGrpBenefRepres property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpBenefRepres }
     *     
     */
    public void setOutGrpBenefRepres(ArrayOfOutGrpBenefRepres value) {
        this.outGrpBenefRepres = value;
    }

    /**
     * Gets the value of the outGrpGuarantor property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpGuarantor }
     *     
     */
    public ArrayOfOutGrpGuarantor getOutGrpGuarantor() {
        return outGrpGuarantor;
    }

    /**
     * Sets the value of the outGrpGuarantor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpGuarantor }
     *     
     */
    public void setOutGrpGuarantor(ArrayOfOutGrpGuarantor value) {
        this.outGrpGuarantor = value;
    }

    /**
     * Gets the value of the outGrpGuarantRepres property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpGuarantRepres }
     *     
     */
    public ArrayOfOutGrpGuarantRepres getOutGrpGuarantRepres() {
        return outGrpGuarantRepres;
    }

    /**
     * Sets the value of the outGrpGuarantRepres property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpGuarantRepres }
     *     
     */
    public void setOutGrpGuarantRepres(ArrayOfOutGrpGuarantRepres value) {
        this.outGrpGuarantRepres = value;
    }

    /**
     * Gets the value of the outGrpLog property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpLogA }
     *     
     */
    public ArrayOfOutGrpLogA getOutGrpLog() {
        return outGrpLog;
    }

    /**
     * Sets the value of the outGrpLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpLogA }
     *     
     */
    public void setOutGrpLog(ArrayOfOutGrpLogA value) {
        this.outGrpLog = value;
    }

    /**
     * Gets the value of the outGrpUserTotal property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpUserTotal }
     *     
     */
    public ArrayOfOutGrpUserTotal getOutGrpUserTotal() {
        return outGrpUserTotal;
    }

    /**
     * Sets the value of the outGrpUserTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpUserTotal }
     *     
     */
    public void setOutGrpUserTotal(ArrayOfOutGrpUserTotal value) {
        this.outGrpUserTotal = value;
    }

}
