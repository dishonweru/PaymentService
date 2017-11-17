
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AgreementMaintenanceImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgreementMaintenanceImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="ProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGrpBenef" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfInGrpBenef" minOccurs="0"/>
 *         &lt;element name="InGrpBenefRepres" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfInGrpBenefRepres" minOccurs="0"/>
 *         &lt;element name="InGrpGuarant" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfInGrpGuarant" minOccurs="0"/>
 *         &lt;element name="InGrpGuarantRepres" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfInGrpGuarantRepres" minOccurs="0"/>
 *         &lt;element name="InAccountOffBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAgreementAccActiveCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InAgreementAccActiveNewCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAgreementAccDomCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InAgreementAccDomNewCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAgreementAccEuroZoneCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InAgreementAccEurzonNewCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAgreementAccFcCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InAgreementAccFcNewCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAgreementAccKind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAgreementAccOpenExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InAgreementAgrAmendmentCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InAgreementAgrAnnexDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InAgreementAgrBlockedCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InAgreementAgrBlockedLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InAgreementAgrComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAgreementAgrEuroIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAgreementAgrExpiryDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InAgreementAgrExtraComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAgreementAgrFcIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAgreementAgrIssueDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InAgreementAgrLcIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAgreementAgrLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InAgreementAgrLimitInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAgreementAgrSigningDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InAgreementAgrStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAgreementAgrTermDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InAgreementAgrUtilisedLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InAgreementDelOffAsnDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InAgreementDelPrvOffAsnDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InAgreementDelPrvOfficer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAgreementHistoryCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAgreementHistoryCurrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAgreementOffAsgnDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InAgreementOneAccountFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAgreementPrvOfficAsnDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InAgreementPrvOfficer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAgreementTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InAgreementUserCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAgreementTypeProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAgrMonitoringUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAuthGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustMailRecCustAddressSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCustMailRecCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDelayOfficerBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InExternalSystemDataChannelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InExternalSystemDataChannelPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InExternalSystemDataProfitsUniqueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InExternalSystemDataReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InExternalSystemDataSoftId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InExternalSystemDataWsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpBenefLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpBenefRepresLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpGuarantLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpGuarantRepresLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLimitCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLogReversalIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPrftTransactionTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InProfile1UnitCategoryPerRoleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProfile1UnitCategoryPerRolePtjCheckOvercome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProfile2UnitCategoryPerRoleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProfile2UnitCategoryPerRolePtjCheckOvercome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProfile3UnitCategoryPerRoleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProfile3UnitCategoryPerRolePtjCheckOvercome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTransitionAgreementAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTransitionAgreementWorkAgreementSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTransitionProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTransitionProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxSsSecurityCmcbPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTrxTeamInformationSuper1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxTeamInformationSuper2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InVillageGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreementMaintenanceImport", propOrder = {
    "profitsAccountNumber",
    "profitsAccountCd",
    "inGrpBenef",
    "inGrpBenefRepres",
    "inGrpGuarant",
    "inGrpGuarantRepres",
    "inAccountOffBankemployeeId",
    "inAgreementAccActiveCnt",
    "inAgreementAccActiveNewCnt",
    "inAgreementAccDomCnt",
    "inAgreementAccDomNewCnt",
    "inAgreementAccEuroZoneCnt",
    "inAgreementAccEurzonNewCnt",
    "inAgreementAccFcCnt",
    "inAgreementAccFcNewCnt",
    "inAgreementAccKind",
    "inAgreementAccOpenExpDt",
    "inAgreementAgrAmendmentCnt",
    "inAgreementAgrAnnexDt",
    "inAgreementAgrBlockedCnt",
    "inAgreementAgrBlockedLimit",
    "inAgreementAgrComments",
    "inAgreementAgrEuroIndicator",
    "inAgreementAgrExpiryDt",
    "inAgreementAgrExtraComments",
    "inAgreementAgrFcIndicator",
    "inAgreementAgrIssueDt",
    "inAgreementAgrLcIndicator",
    "inAgreementAgrLimit",
    "inAgreementAgrLimitInd",
    "inAgreementAgrSigningDt",
    "inAgreementAgrStatus",
    "inAgreementAgrTermDt",
    "inAgreementAgrUtilisedLimit",
    "inAgreementDelOffAsnDt",
    "inAgreementDelPrvOffAsnDt",
    "inAgreementDelPrvOfficer",
    "inAgreementHistoryCnt",
    "inAgreementHistoryCurrSn",
    "inAgreementOffAsgnDt",
    "inAgreementOneAccountFlg",
    "inAgreementPrvOfficAsnDt",
    "inAgreementPrvOfficer",
    "inAgreementTmstamp",
    "inAgreementUserCode",
    "inAgreementTypeProductIdProduct",
    "inAgrMonitoringUnitCode",
    "inAuthGrantedIefSuppliedFlag",
    "inCustMailRecCustAddressSerialNum",
    "inCustMailRecCustomerCustId",
    "inDelayOfficerBankemployeeId",
    "inExternalSystemDataChannelId",
    "inExternalSystemDataChannelPassword",
    "inExternalSystemDataProfitsUniqueId",
    "inExternalSystemDataReferenceNumber",
    "inExternalSystemDataSoftId",
    "inExternalSystemDataWsId",
    "inGrpBenefLength",
    "inGrpBenefRepresLength",
    "inGrpGuarantLength",
    "inGrpGuarantRepresLength",
    "inIefSuppliedCommand",
    "inJustificDescription",
    "inJustificIdJustific",
    "inLimitCurrencyIdCurrency",
    "inLogReversalIefSuppliedFlag",
    "inPrftTransactionIdTransact",
    "inPrftTransactionTmstamp",
    "inProfile1UnitCategoryPerRoleId",
    "inProfile1UnitCategoryPerRolePtjCheckOvercome",
    "inProfile2UnitCategoryPerRoleId",
    "inProfile2UnitCategoryPerRolePtjCheckOvercome",
    "inProfile3UnitCategoryPerRoleId",
    "inProfile3UnitCategoryPerRolePtjCheckOvercome",
    "inTransitionAgreementAgrMembershipSn",
    "inTransitionAgreementWorkAgreementSn",
    "inTransitionProfitsAccountAccountCd",
    "inTransitionProfitsAccountAccountNumber",
    "inTrxSsSecurityCmcbPrftSystem",
    "inTrxTeamInformationSuper1Code",
    "inTrxTeamInformationSuper2Code",
    "inTrxTerminalTerminalNumber",
    "inVillageGenericDetailSerialNum"
})
public class AgreementMaintenanceImport
    extends BaseImport
{

    @XmlElement(name = "ProfitsAccountNumber")
    protected String profitsAccountNumber;
    @XmlElement(name = "ProfitsAccountCd")
    protected short profitsAccountCd;
    @XmlElement(name = "InGrpBenef")
    protected ArrayOfInGrpBenef inGrpBenef;
    @XmlElement(name = "InGrpBenefRepres")
    protected ArrayOfInGrpBenefRepres inGrpBenefRepres;
    @XmlElement(name = "InGrpGuarant")
    protected ArrayOfInGrpGuarant inGrpGuarant;
    @XmlElement(name = "InGrpGuarantRepres")
    protected ArrayOfInGrpGuarantRepres inGrpGuarantRepres;
    @XmlElement(name = "InAccountOffBankemployeeId")
    protected String inAccountOffBankemployeeId;
    @XmlElement(name = "InAgreementAccActiveCnt")
    protected short inAgreementAccActiveCnt;
    @XmlElement(name = "InAgreementAccActiveNewCnt")
    protected int inAgreementAccActiveNewCnt;
    @XmlElement(name = "InAgreementAccDomCnt")
    protected short inAgreementAccDomCnt;
    @XmlElement(name = "InAgreementAccDomNewCnt")
    protected int inAgreementAccDomNewCnt;
    @XmlElement(name = "InAgreementAccEuroZoneCnt")
    protected short inAgreementAccEuroZoneCnt;
    @XmlElement(name = "InAgreementAccEurzonNewCnt")
    protected int inAgreementAccEurzonNewCnt;
    @XmlElement(name = "InAgreementAccFcCnt")
    protected short inAgreementAccFcCnt;
    @XmlElement(name = "InAgreementAccFcNewCnt")
    protected int inAgreementAccFcNewCnt;
    @XmlElement(name = "InAgreementAccKind")
    protected String inAgreementAccKind;
    @XmlElement(name = "InAgreementAccOpenExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inAgreementAccOpenExpDt;
    @XmlElement(name = "InAgreementAgrAmendmentCnt")
    protected short inAgreementAgrAmendmentCnt;
    @XmlElement(name = "InAgreementAgrAnnexDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inAgreementAgrAnnexDt;
    @XmlElement(name = "InAgreementAgrBlockedCnt")
    protected short inAgreementAgrBlockedCnt;
    @XmlElement(name = "InAgreementAgrBlockedLimit", required = true)
    protected BigDecimal inAgreementAgrBlockedLimit;
    @XmlElement(name = "InAgreementAgrComments")
    protected String inAgreementAgrComments;
    @XmlElement(name = "InAgreementAgrEuroIndicator")
    protected String inAgreementAgrEuroIndicator;
    @XmlElement(name = "InAgreementAgrExpiryDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inAgreementAgrExpiryDt;
    @XmlElement(name = "InAgreementAgrExtraComments")
    protected String inAgreementAgrExtraComments;
    @XmlElement(name = "InAgreementAgrFcIndicator")
    protected String inAgreementAgrFcIndicator;
    @XmlElement(name = "InAgreementAgrIssueDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inAgreementAgrIssueDt;
    @XmlElement(name = "InAgreementAgrLcIndicator")
    protected String inAgreementAgrLcIndicator;
    @XmlElement(name = "InAgreementAgrLimit", required = true)
    protected BigDecimal inAgreementAgrLimit;
    @XmlElement(name = "InAgreementAgrLimitInd")
    protected String inAgreementAgrLimitInd;
    @XmlElement(name = "InAgreementAgrSigningDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inAgreementAgrSigningDt;
    @XmlElement(name = "InAgreementAgrStatus")
    protected String inAgreementAgrStatus;
    @XmlElement(name = "InAgreementAgrTermDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inAgreementAgrTermDt;
    @XmlElement(name = "InAgreementAgrUtilisedLimit", required = true)
    protected BigDecimal inAgreementAgrUtilisedLimit;
    @XmlElement(name = "InAgreementDelOffAsnDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inAgreementDelOffAsnDt;
    @XmlElement(name = "InAgreementDelPrvOffAsnDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inAgreementDelPrvOffAsnDt;
    @XmlElement(name = "InAgreementDelPrvOfficer")
    protected String inAgreementDelPrvOfficer;
    @XmlElement(name = "InAgreementHistoryCnt")
    protected int inAgreementHistoryCnt;
    @XmlElement(name = "InAgreementHistoryCurrSn")
    protected int inAgreementHistoryCurrSn;
    @XmlElement(name = "InAgreementOffAsgnDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inAgreementOffAsgnDt;
    @XmlElement(name = "InAgreementOneAccountFlg")
    protected String inAgreementOneAccountFlg;
    @XmlElement(name = "InAgreementPrvOfficAsnDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inAgreementPrvOfficAsnDt;
    @XmlElement(name = "InAgreementPrvOfficer")
    protected String inAgreementPrvOfficer;
    @XmlElement(name = "InAgreementTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inAgreementTmstamp;
    @XmlElement(name = "InAgreementUserCode")
    protected String inAgreementUserCode;
    @XmlElement(name = "InAgreementTypeProductIdProduct")
    protected int inAgreementTypeProductIdProduct;
    @XmlElement(name = "InAgrMonitoringUnitCode")
    protected int inAgrMonitoringUnitCode;
    @XmlElement(name = "InAuthGrantedIefSuppliedFlag")
    protected String inAuthGrantedIefSuppliedFlag;
    @XmlElement(name = "InCustMailRecCustAddressSerialNum")
    protected short inCustMailRecCustAddressSerialNum;
    @XmlElement(name = "InCustMailRecCustomerCustId")
    protected int inCustMailRecCustomerCustId;
    @XmlElement(name = "InDelayOfficerBankemployeeId")
    protected String inDelayOfficerBankemployeeId;
    @XmlElement(name = "InExternalSystemDataChannelId")
    protected int inExternalSystemDataChannelId;
    @XmlElement(name = "InExternalSystemDataChannelPassword")
    protected String inExternalSystemDataChannelPassword;
    @XmlElement(name = "InExternalSystemDataProfitsUniqueId")
    protected String inExternalSystemDataProfitsUniqueId;
    @XmlElement(name = "InExternalSystemDataReferenceNumber")
    protected String inExternalSystemDataReferenceNumber;
    @XmlElement(name = "InExternalSystemDataSoftId")
    protected String inExternalSystemDataSoftId;
    @XmlElement(name = "InExternalSystemDataWsId")
    protected String inExternalSystemDataWsId;
    @XmlElement(name = "InGrpBenefLength")
    protected int inGrpBenefLength;
    @XmlElement(name = "InGrpBenefRepresLength")
    protected int inGrpBenefRepresLength;
    @XmlElement(name = "InGrpGuarantLength")
    protected int inGrpGuarantLength;
    @XmlElement(name = "InGrpGuarantRepresLength")
    protected int inGrpGuarantRepresLength;
    @XmlElement(name = "InIefSuppliedCommand")
    protected String inIefSuppliedCommand;
    @XmlElement(name = "InJustificDescription")
    protected String inJustificDescription;
    @XmlElement(name = "InJustificIdJustific")
    protected int inJustificIdJustific;
    @XmlElement(name = "InLimitCurrencyIdCurrency")
    protected int inLimitCurrencyIdCurrency;
    @XmlElement(name = "InLogReversalIefSuppliedFlag")
    protected String inLogReversalIefSuppliedFlag;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InPrftTransactionTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inPrftTransactionTmstamp;
    @XmlElement(name = "InProfile1UnitCategoryPerRoleId")
    protected String inProfile1UnitCategoryPerRoleId;
    @XmlElement(name = "InProfile1UnitCategoryPerRolePtjCheckOvercome")
    protected String inProfile1UnitCategoryPerRolePtjCheckOvercome;
    @XmlElement(name = "InProfile2UnitCategoryPerRoleId")
    protected String inProfile2UnitCategoryPerRoleId;
    @XmlElement(name = "InProfile2UnitCategoryPerRolePtjCheckOvercome")
    protected String inProfile2UnitCategoryPerRolePtjCheckOvercome;
    @XmlElement(name = "InProfile3UnitCategoryPerRoleId")
    protected String inProfile3UnitCategoryPerRoleId;
    @XmlElement(name = "InProfile3UnitCategoryPerRolePtjCheckOvercome")
    protected String inProfile3UnitCategoryPerRolePtjCheckOvercome;
    @XmlElement(name = "InTransitionAgreementAgrMembershipSn")
    protected int inTransitionAgreementAgrMembershipSn;
    @XmlElement(name = "InTransitionAgreementWorkAgreementSn")
    protected int inTransitionAgreementWorkAgreementSn;
    @XmlElement(name = "InTransitionProfitsAccountAccountCd")
    protected short inTransitionProfitsAccountAccountCd;
    @XmlElement(name = "InTransitionProfitsAccountAccountNumber")
    protected String inTransitionProfitsAccountAccountNumber;
    @XmlElement(name = "InTrxSsSecurityCmcbPrftSystem")
    protected short inTrxSsSecurityCmcbPrftSystem;
    @XmlElement(name = "InTrxTeamInformationSuper1Code")
    protected String inTrxTeamInformationSuper1Code;
    @XmlElement(name = "InTrxTeamInformationSuper2Code")
    protected String inTrxTeamInformationSuper2Code;
    @XmlElement(name = "InTrxTerminalTerminalNumber")
    protected String inTrxTerminalTerminalNumber;
    @XmlElement(name = "InVillageGenericDetailSerialNum")
    protected int inVillageGenericDetailSerialNum;

    /**
     * Gets the value of the profitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfitsAccountNumber() {
        return profitsAccountNumber;
    }

    /**
     * Sets the value of the profitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfitsAccountNumber(String value) {
        this.profitsAccountNumber = value;
    }

    /**
     * Gets the value of the profitsAccountCd property.
     * 
     */
    public short getProfitsAccountCd() {
        return profitsAccountCd;
    }

    /**
     * Sets the value of the profitsAccountCd property.
     * 
     */
    public void setProfitsAccountCd(short value) {
        this.profitsAccountCd = value;
    }

    /**
     * Gets the value of the inGrpBenef property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInGrpBenef }
     *     
     */
    public ArrayOfInGrpBenef getInGrpBenef() {
        return inGrpBenef;
    }

    /**
     * Sets the value of the inGrpBenef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInGrpBenef }
     *     
     */
    public void setInGrpBenef(ArrayOfInGrpBenef value) {
        this.inGrpBenef = value;
    }

    /**
     * Gets the value of the inGrpBenefRepres property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInGrpBenefRepres }
     *     
     */
    public ArrayOfInGrpBenefRepres getInGrpBenefRepres() {
        return inGrpBenefRepres;
    }

    /**
     * Sets the value of the inGrpBenefRepres property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInGrpBenefRepres }
     *     
     */
    public void setInGrpBenefRepres(ArrayOfInGrpBenefRepres value) {
        this.inGrpBenefRepres = value;
    }

    /**
     * Gets the value of the inGrpGuarant property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInGrpGuarant }
     *     
     */
    public ArrayOfInGrpGuarant getInGrpGuarant() {
        return inGrpGuarant;
    }

    /**
     * Sets the value of the inGrpGuarant property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInGrpGuarant }
     *     
     */
    public void setInGrpGuarant(ArrayOfInGrpGuarant value) {
        this.inGrpGuarant = value;
    }

    /**
     * Gets the value of the inGrpGuarantRepres property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInGrpGuarantRepres }
     *     
     */
    public ArrayOfInGrpGuarantRepres getInGrpGuarantRepres() {
        return inGrpGuarantRepres;
    }

    /**
     * Sets the value of the inGrpGuarantRepres property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInGrpGuarantRepres }
     *     
     */
    public void setInGrpGuarantRepres(ArrayOfInGrpGuarantRepres value) {
        this.inGrpGuarantRepres = value;
    }

    /**
     * Gets the value of the inAccountOffBankemployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAccountOffBankemployeeId() {
        return inAccountOffBankemployeeId;
    }

    /**
     * Sets the value of the inAccountOffBankemployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAccountOffBankemployeeId(String value) {
        this.inAccountOffBankemployeeId = value;
    }

    /**
     * Gets the value of the inAgreementAccActiveCnt property.
     * 
     */
    public short getInAgreementAccActiveCnt() {
        return inAgreementAccActiveCnt;
    }

    /**
     * Sets the value of the inAgreementAccActiveCnt property.
     * 
     */
    public void setInAgreementAccActiveCnt(short value) {
        this.inAgreementAccActiveCnt = value;
    }

    /**
     * Gets the value of the inAgreementAccActiveNewCnt property.
     * 
     */
    public int getInAgreementAccActiveNewCnt() {
        return inAgreementAccActiveNewCnt;
    }

    /**
     * Sets the value of the inAgreementAccActiveNewCnt property.
     * 
     */
    public void setInAgreementAccActiveNewCnt(int value) {
        this.inAgreementAccActiveNewCnt = value;
    }

    /**
     * Gets the value of the inAgreementAccDomCnt property.
     * 
     */
    public short getInAgreementAccDomCnt() {
        return inAgreementAccDomCnt;
    }

    /**
     * Sets the value of the inAgreementAccDomCnt property.
     * 
     */
    public void setInAgreementAccDomCnt(short value) {
        this.inAgreementAccDomCnt = value;
    }

    /**
     * Gets the value of the inAgreementAccDomNewCnt property.
     * 
     */
    public int getInAgreementAccDomNewCnt() {
        return inAgreementAccDomNewCnt;
    }

    /**
     * Sets the value of the inAgreementAccDomNewCnt property.
     * 
     */
    public void setInAgreementAccDomNewCnt(int value) {
        this.inAgreementAccDomNewCnt = value;
    }

    /**
     * Gets the value of the inAgreementAccEuroZoneCnt property.
     * 
     */
    public short getInAgreementAccEuroZoneCnt() {
        return inAgreementAccEuroZoneCnt;
    }

    /**
     * Sets the value of the inAgreementAccEuroZoneCnt property.
     * 
     */
    public void setInAgreementAccEuroZoneCnt(short value) {
        this.inAgreementAccEuroZoneCnt = value;
    }

    /**
     * Gets the value of the inAgreementAccEurzonNewCnt property.
     * 
     */
    public int getInAgreementAccEurzonNewCnt() {
        return inAgreementAccEurzonNewCnt;
    }

    /**
     * Sets the value of the inAgreementAccEurzonNewCnt property.
     * 
     */
    public void setInAgreementAccEurzonNewCnt(int value) {
        this.inAgreementAccEurzonNewCnt = value;
    }

    /**
     * Gets the value of the inAgreementAccFcCnt property.
     * 
     */
    public short getInAgreementAccFcCnt() {
        return inAgreementAccFcCnt;
    }

    /**
     * Sets the value of the inAgreementAccFcCnt property.
     * 
     */
    public void setInAgreementAccFcCnt(short value) {
        this.inAgreementAccFcCnt = value;
    }

    /**
     * Gets the value of the inAgreementAccFcNewCnt property.
     * 
     */
    public int getInAgreementAccFcNewCnt() {
        return inAgreementAccFcNewCnt;
    }

    /**
     * Sets the value of the inAgreementAccFcNewCnt property.
     * 
     */
    public void setInAgreementAccFcNewCnt(int value) {
        this.inAgreementAccFcNewCnt = value;
    }

    /**
     * Gets the value of the inAgreementAccKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAgreementAccKind() {
        return inAgreementAccKind;
    }

    /**
     * Sets the value of the inAgreementAccKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAgreementAccKind(String value) {
        this.inAgreementAccKind = value;
    }

    /**
     * Gets the value of the inAgreementAccOpenExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInAgreementAccOpenExpDt() {
        return inAgreementAccOpenExpDt;
    }

    /**
     * Sets the value of the inAgreementAccOpenExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInAgreementAccOpenExpDt(XMLGregorianCalendar value) {
        this.inAgreementAccOpenExpDt = value;
    }

    /**
     * Gets the value of the inAgreementAgrAmendmentCnt property.
     * 
     */
    public short getInAgreementAgrAmendmentCnt() {
        return inAgreementAgrAmendmentCnt;
    }

    /**
     * Sets the value of the inAgreementAgrAmendmentCnt property.
     * 
     */
    public void setInAgreementAgrAmendmentCnt(short value) {
        this.inAgreementAgrAmendmentCnt = value;
    }

    /**
     * Gets the value of the inAgreementAgrAnnexDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInAgreementAgrAnnexDt() {
        return inAgreementAgrAnnexDt;
    }

    /**
     * Sets the value of the inAgreementAgrAnnexDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInAgreementAgrAnnexDt(XMLGregorianCalendar value) {
        this.inAgreementAgrAnnexDt = value;
    }

    /**
     * Gets the value of the inAgreementAgrBlockedCnt property.
     * 
     */
    public short getInAgreementAgrBlockedCnt() {
        return inAgreementAgrBlockedCnt;
    }

    /**
     * Sets the value of the inAgreementAgrBlockedCnt property.
     * 
     */
    public void setInAgreementAgrBlockedCnt(short value) {
        this.inAgreementAgrBlockedCnt = value;
    }

    /**
     * Gets the value of the inAgreementAgrBlockedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInAgreementAgrBlockedLimit() {
        return inAgreementAgrBlockedLimit;
    }

    /**
     * Sets the value of the inAgreementAgrBlockedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInAgreementAgrBlockedLimit(BigDecimal value) {
        this.inAgreementAgrBlockedLimit = value;
    }

    /**
     * Gets the value of the inAgreementAgrComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAgreementAgrComments() {
        return inAgreementAgrComments;
    }

    /**
     * Sets the value of the inAgreementAgrComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAgreementAgrComments(String value) {
        this.inAgreementAgrComments = value;
    }

    /**
     * Gets the value of the inAgreementAgrEuroIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAgreementAgrEuroIndicator() {
        return inAgreementAgrEuroIndicator;
    }

    /**
     * Sets the value of the inAgreementAgrEuroIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAgreementAgrEuroIndicator(String value) {
        this.inAgreementAgrEuroIndicator = value;
    }

    /**
     * Gets the value of the inAgreementAgrExpiryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInAgreementAgrExpiryDt() {
        return inAgreementAgrExpiryDt;
    }

    /**
     * Sets the value of the inAgreementAgrExpiryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInAgreementAgrExpiryDt(XMLGregorianCalendar value) {
        this.inAgreementAgrExpiryDt = value;
    }

    /**
     * Gets the value of the inAgreementAgrExtraComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAgreementAgrExtraComments() {
        return inAgreementAgrExtraComments;
    }

    /**
     * Sets the value of the inAgreementAgrExtraComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAgreementAgrExtraComments(String value) {
        this.inAgreementAgrExtraComments = value;
    }

    /**
     * Gets the value of the inAgreementAgrFcIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAgreementAgrFcIndicator() {
        return inAgreementAgrFcIndicator;
    }

    /**
     * Sets the value of the inAgreementAgrFcIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAgreementAgrFcIndicator(String value) {
        this.inAgreementAgrFcIndicator = value;
    }

    /**
     * Gets the value of the inAgreementAgrIssueDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInAgreementAgrIssueDt() {
        return inAgreementAgrIssueDt;
    }

    /**
     * Sets the value of the inAgreementAgrIssueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInAgreementAgrIssueDt(XMLGregorianCalendar value) {
        this.inAgreementAgrIssueDt = value;
    }

    /**
     * Gets the value of the inAgreementAgrLcIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAgreementAgrLcIndicator() {
        return inAgreementAgrLcIndicator;
    }

    /**
     * Sets the value of the inAgreementAgrLcIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAgreementAgrLcIndicator(String value) {
        this.inAgreementAgrLcIndicator = value;
    }

    /**
     * Gets the value of the inAgreementAgrLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInAgreementAgrLimit() {
        return inAgreementAgrLimit;
    }

    /**
     * Sets the value of the inAgreementAgrLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInAgreementAgrLimit(BigDecimal value) {
        this.inAgreementAgrLimit = value;
    }

    /**
     * Gets the value of the inAgreementAgrLimitInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAgreementAgrLimitInd() {
        return inAgreementAgrLimitInd;
    }

    /**
     * Sets the value of the inAgreementAgrLimitInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAgreementAgrLimitInd(String value) {
        this.inAgreementAgrLimitInd = value;
    }

    /**
     * Gets the value of the inAgreementAgrSigningDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInAgreementAgrSigningDt() {
        return inAgreementAgrSigningDt;
    }

    /**
     * Sets the value of the inAgreementAgrSigningDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInAgreementAgrSigningDt(XMLGregorianCalendar value) {
        this.inAgreementAgrSigningDt = value;
    }

    /**
     * Gets the value of the inAgreementAgrStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAgreementAgrStatus() {
        return inAgreementAgrStatus;
    }

    /**
     * Sets the value of the inAgreementAgrStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAgreementAgrStatus(String value) {
        this.inAgreementAgrStatus = value;
    }

    /**
     * Gets the value of the inAgreementAgrTermDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInAgreementAgrTermDt() {
        return inAgreementAgrTermDt;
    }

    /**
     * Sets the value of the inAgreementAgrTermDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInAgreementAgrTermDt(XMLGregorianCalendar value) {
        this.inAgreementAgrTermDt = value;
    }

    /**
     * Gets the value of the inAgreementAgrUtilisedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInAgreementAgrUtilisedLimit() {
        return inAgreementAgrUtilisedLimit;
    }

    /**
     * Sets the value of the inAgreementAgrUtilisedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInAgreementAgrUtilisedLimit(BigDecimal value) {
        this.inAgreementAgrUtilisedLimit = value;
    }

    /**
     * Gets the value of the inAgreementDelOffAsnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInAgreementDelOffAsnDt() {
        return inAgreementDelOffAsnDt;
    }

    /**
     * Sets the value of the inAgreementDelOffAsnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInAgreementDelOffAsnDt(XMLGregorianCalendar value) {
        this.inAgreementDelOffAsnDt = value;
    }

    /**
     * Gets the value of the inAgreementDelPrvOffAsnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInAgreementDelPrvOffAsnDt() {
        return inAgreementDelPrvOffAsnDt;
    }

    /**
     * Sets the value of the inAgreementDelPrvOffAsnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInAgreementDelPrvOffAsnDt(XMLGregorianCalendar value) {
        this.inAgreementDelPrvOffAsnDt = value;
    }

    /**
     * Gets the value of the inAgreementDelPrvOfficer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAgreementDelPrvOfficer() {
        return inAgreementDelPrvOfficer;
    }

    /**
     * Sets the value of the inAgreementDelPrvOfficer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAgreementDelPrvOfficer(String value) {
        this.inAgreementDelPrvOfficer = value;
    }

    /**
     * Gets the value of the inAgreementHistoryCnt property.
     * 
     */
    public int getInAgreementHistoryCnt() {
        return inAgreementHistoryCnt;
    }

    /**
     * Sets the value of the inAgreementHistoryCnt property.
     * 
     */
    public void setInAgreementHistoryCnt(int value) {
        this.inAgreementHistoryCnt = value;
    }

    /**
     * Gets the value of the inAgreementHistoryCurrSn property.
     * 
     */
    public int getInAgreementHistoryCurrSn() {
        return inAgreementHistoryCurrSn;
    }

    /**
     * Sets the value of the inAgreementHistoryCurrSn property.
     * 
     */
    public void setInAgreementHistoryCurrSn(int value) {
        this.inAgreementHistoryCurrSn = value;
    }

    /**
     * Gets the value of the inAgreementOffAsgnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInAgreementOffAsgnDt() {
        return inAgreementOffAsgnDt;
    }

    /**
     * Sets the value of the inAgreementOffAsgnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInAgreementOffAsgnDt(XMLGregorianCalendar value) {
        this.inAgreementOffAsgnDt = value;
    }

    /**
     * Gets the value of the inAgreementOneAccountFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAgreementOneAccountFlg() {
        return inAgreementOneAccountFlg;
    }

    /**
     * Sets the value of the inAgreementOneAccountFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAgreementOneAccountFlg(String value) {
        this.inAgreementOneAccountFlg = value;
    }

    /**
     * Gets the value of the inAgreementPrvOfficAsnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInAgreementPrvOfficAsnDt() {
        return inAgreementPrvOfficAsnDt;
    }

    /**
     * Sets the value of the inAgreementPrvOfficAsnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInAgreementPrvOfficAsnDt(XMLGregorianCalendar value) {
        this.inAgreementPrvOfficAsnDt = value;
    }

    /**
     * Gets the value of the inAgreementPrvOfficer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAgreementPrvOfficer() {
        return inAgreementPrvOfficer;
    }

    /**
     * Sets the value of the inAgreementPrvOfficer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAgreementPrvOfficer(String value) {
        this.inAgreementPrvOfficer = value;
    }

    /**
     * Gets the value of the inAgreementTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInAgreementTmstamp() {
        return inAgreementTmstamp;
    }

    /**
     * Sets the value of the inAgreementTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInAgreementTmstamp(XMLGregorianCalendar value) {
        this.inAgreementTmstamp = value;
    }

    /**
     * Gets the value of the inAgreementUserCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAgreementUserCode() {
        return inAgreementUserCode;
    }

    /**
     * Sets the value of the inAgreementUserCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAgreementUserCode(String value) {
        this.inAgreementUserCode = value;
    }

    /**
     * Gets the value of the inAgreementTypeProductIdProduct property.
     * 
     */
    public int getInAgreementTypeProductIdProduct() {
        return inAgreementTypeProductIdProduct;
    }

    /**
     * Sets the value of the inAgreementTypeProductIdProduct property.
     * 
     */
    public void setInAgreementTypeProductIdProduct(int value) {
        this.inAgreementTypeProductIdProduct = value;
    }

    /**
     * Gets the value of the inAgrMonitoringUnitCode property.
     * 
     */
    public int getInAgrMonitoringUnitCode() {
        return inAgrMonitoringUnitCode;
    }

    /**
     * Sets the value of the inAgrMonitoringUnitCode property.
     * 
     */
    public void setInAgrMonitoringUnitCode(int value) {
        this.inAgrMonitoringUnitCode = value;
    }

    /**
     * Gets the value of the inAuthGrantedIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthGrantedIefSuppliedFlag() {
        return inAuthGrantedIefSuppliedFlag;
    }

    /**
     * Sets the value of the inAuthGrantedIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthGrantedIefSuppliedFlag(String value) {
        this.inAuthGrantedIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inCustMailRecCustAddressSerialNum property.
     * 
     */
    public short getInCustMailRecCustAddressSerialNum() {
        return inCustMailRecCustAddressSerialNum;
    }

    /**
     * Sets the value of the inCustMailRecCustAddressSerialNum property.
     * 
     */
    public void setInCustMailRecCustAddressSerialNum(short value) {
        this.inCustMailRecCustAddressSerialNum = value;
    }

    /**
     * Gets the value of the inCustMailRecCustomerCustId property.
     * 
     */
    public int getInCustMailRecCustomerCustId() {
        return inCustMailRecCustomerCustId;
    }

    /**
     * Sets the value of the inCustMailRecCustomerCustId property.
     * 
     */
    public void setInCustMailRecCustomerCustId(int value) {
        this.inCustMailRecCustomerCustId = value;
    }

    /**
     * Gets the value of the inDelayOfficerBankemployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDelayOfficerBankemployeeId() {
        return inDelayOfficerBankemployeeId;
    }

    /**
     * Sets the value of the inDelayOfficerBankemployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDelayOfficerBankemployeeId(String value) {
        this.inDelayOfficerBankemployeeId = value;
    }

    /**
     * Gets the value of the inExternalSystemDataChannelId property.
     * 
     */
    public int getInExternalSystemDataChannelId() {
        return inExternalSystemDataChannelId;
    }

    /**
     * Sets the value of the inExternalSystemDataChannelId property.
     * 
     */
    public void setInExternalSystemDataChannelId(int value) {
        this.inExternalSystemDataChannelId = value;
    }

    /**
     * Gets the value of the inExternalSystemDataChannelPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInExternalSystemDataChannelPassword() {
        return inExternalSystemDataChannelPassword;
    }

    /**
     * Sets the value of the inExternalSystemDataChannelPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInExternalSystemDataChannelPassword(String value) {
        this.inExternalSystemDataChannelPassword = value;
    }

    /**
     * Gets the value of the inExternalSystemDataProfitsUniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInExternalSystemDataProfitsUniqueId() {
        return inExternalSystemDataProfitsUniqueId;
    }

    /**
     * Sets the value of the inExternalSystemDataProfitsUniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInExternalSystemDataProfitsUniqueId(String value) {
        this.inExternalSystemDataProfitsUniqueId = value;
    }

    /**
     * Gets the value of the inExternalSystemDataReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInExternalSystemDataReferenceNumber() {
        return inExternalSystemDataReferenceNumber;
    }

    /**
     * Sets the value of the inExternalSystemDataReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInExternalSystemDataReferenceNumber(String value) {
        this.inExternalSystemDataReferenceNumber = value;
    }

    /**
     * Gets the value of the inExternalSystemDataSoftId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInExternalSystemDataSoftId() {
        return inExternalSystemDataSoftId;
    }

    /**
     * Sets the value of the inExternalSystemDataSoftId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInExternalSystemDataSoftId(String value) {
        this.inExternalSystemDataSoftId = value;
    }

    /**
     * Gets the value of the inExternalSystemDataWsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInExternalSystemDataWsId() {
        return inExternalSystemDataWsId;
    }

    /**
     * Sets the value of the inExternalSystemDataWsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInExternalSystemDataWsId(String value) {
        this.inExternalSystemDataWsId = value;
    }

    /**
     * Gets the value of the inGrpBenefLength property.
     * 
     */
    public int getInGrpBenefLength() {
        return inGrpBenefLength;
    }

    /**
     * Sets the value of the inGrpBenefLength property.
     * 
     */
    public void setInGrpBenefLength(int value) {
        this.inGrpBenefLength = value;
    }

    /**
     * Gets the value of the inGrpBenefRepresLength property.
     * 
     */
    public int getInGrpBenefRepresLength() {
        return inGrpBenefRepresLength;
    }

    /**
     * Sets the value of the inGrpBenefRepresLength property.
     * 
     */
    public void setInGrpBenefRepresLength(int value) {
        this.inGrpBenefRepresLength = value;
    }

    /**
     * Gets the value of the inGrpGuarantLength property.
     * 
     */
    public int getInGrpGuarantLength() {
        return inGrpGuarantLength;
    }

    /**
     * Sets the value of the inGrpGuarantLength property.
     * 
     */
    public void setInGrpGuarantLength(int value) {
        this.inGrpGuarantLength = value;
    }

    /**
     * Gets the value of the inGrpGuarantRepresLength property.
     * 
     */
    public int getInGrpGuarantRepresLength() {
        return inGrpGuarantRepresLength;
    }

    /**
     * Sets the value of the inGrpGuarantRepresLength property.
     * 
     */
    public void setInGrpGuarantRepresLength(int value) {
        this.inGrpGuarantRepresLength = value;
    }

    /**
     * Gets the value of the inIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIefSuppliedCommand() {
        return inIefSuppliedCommand;
    }

    /**
     * Sets the value of the inIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIefSuppliedCommand(String value) {
        this.inIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the inJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInJustificDescription() {
        return inJustificDescription;
    }

    /**
     * Sets the value of the inJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInJustificDescription(String value) {
        this.inJustificDescription = value;
    }

    /**
     * Gets the value of the inJustificIdJustific property.
     * 
     */
    public int getInJustificIdJustific() {
        return inJustificIdJustific;
    }

    /**
     * Sets the value of the inJustificIdJustific property.
     * 
     */
    public void setInJustificIdJustific(int value) {
        this.inJustificIdJustific = value;
    }

    /**
     * Gets the value of the inLimitCurrencyIdCurrency property.
     * 
     */
    public int getInLimitCurrencyIdCurrency() {
        return inLimitCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inLimitCurrencyIdCurrency property.
     * 
     */
    public void setInLimitCurrencyIdCurrency(int value) {
        this.inLimitCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inLogReversalIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogReversalIefSuppliedFlag() {
        return inLogReversalIefSuppliedFlag;
    }

    /**
     * Sets the value of the inLogReversalIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogReversalIefSuppliedFlag(String value) {
        this.inLogReversalIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inPrftTransactionIdTransact property.
     * 
     */
    public int getInPrftTransactionIdTransact() {
        return inPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the inPrftTransactionIdTransact property.
     * 
     */
    public void setInPrftTransactionIdTransact(int value) {
        this.inPrftTransactionIdTransact = value;
    }

    /**
     * Gets the value of the inPrftTransactionTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInPrftTransactionTmstamp() {
        return inPrftTransactionTmstamp;
    }

    /**
     * Sets the value of the inPrftTransactionTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInPrftTransactionTmstamp(XMLGregorianCalendar value) {
        this.inPrftTransactionTmstamp = value;
    }

    /**
     * Gets the value of the inProfile1UnitCategoryPerRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProfile1UnitCategoryPerRoleId() {
        return inProfile1UnitCategoryPerRoleId;
    }

    /**
     * Sets the value of the inProfile1UnitCategoryPerRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProfile1UnitCategoryPerRoleId(String value) {
        this.inProfile1UnitCategoryPerRoleId = value;
    }

    /**
     * Gets the value of the inProfile1UnitCategoryPerRolePtjCheckOvercome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProfile1UnitCategoryPerRolePtjCheckOvercome() {
        return inProfile1UnitCategoryPerRolePtjCheckOvercome;
    }

    /**
     * Sets the value of the inProfile1UnitCategoryPerRolePtjCheckOvercome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProfile1UnitCategoryPerRolePtjCheckOvercome(String value) {
        this.inProfile1UnitCategoryPerRolePtjCheckOvercome = value;
    }

    /**
     * Gets the value of the inProfile2UnitCategoryPerRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProfile2UnitCategoryPerRoleId() {
        return inProfile2UnitCategoryPerRoleId;
    }

    /**
     * Sets the value of the inProfile2UnitCategoryPerRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProfile2UnitCategoryPerRoleId(String value) {
        this.inProfile2UnitCategoryPerRoleId = value;
    }

    /**
     * Gets the value of the inProfile2UnitCategoryPerRolePtjCheckOvercome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProfile2UnitCategoryPerRolePtjCheckOvercome() {
        return inProfile2UnitCategoryPerRolePtjCheckOvercome;
    }

    /**
     * Sets the value of the inProfile2UnitCategoryPerRolePtjCheckOvercome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProfile2UnitCategoryPerRolePtjCheckOvercome(String value) {
        this.inProfile2UnitCategoryPerRolePtjCheckOvercome = value;
    }

    /**
     * Gets the value of the inProfile3UnitCategoryPerRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProfile3UnitCategoryPerRoleId() {
        return inProfile3UnitCategoryPerRoleId;
    }

    /**
     * Sets the value of the inProfile3UnitCategoryPerRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProfile3UnitCategoryPerRoleId(String value) {
        this.inProfile3UnitCategoryPerRoleId = value;
    }

    /**
     * Gets the value of the inProfile3UnitCategoryPerRolePtjCheckOvercome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProfile3UnitCategoryPerRolePtjCheckOvercome() {
        return inProfile3UnitCategoryPerRolePtjCheckOvercome;
    }

    /**
     * Sets the value of the inProfile3UnitCategoryPerRolePtjCheckOvercome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProfile3UnitCategoryPerRolePtjCheckOvercome(String value) {
        this.inProfile3UnitCategoryPerRolePtjCheckOvercome = value;
    }

    /**
     * Gets the value of the inTransitionAgreementAgrMembershipSn property.
     * 
     */
    public int getInTransitionAgreementAgrMembershipSn() {
        return inTransitionAgreementAgrMembershipSn;
    }

    /**
     * Sets the value of the inTransitionAgreementAgrMembershipSn property.
     * 
     */
    public void setInTransitionAgreementAgrMembershipSn(int value) {
        this.inTransitionAgreementAgrMembershipSn = value;
    }

    /**
     * Gets the value of the inTransitionAgreementWorkAgreementSn property.
     * 
     */
    public int getInTransitionAgreementWorkAgreementSn() {
        return inTransitionAgreementWorkAgreementSn;
    }

    /**
     * Sets the value of the inTransitionAgreementWorkAgreementSn property.
     * 
     */
    public void setInTransitionAgreementWorkAgreementSn(int value) {
        this.inTransitionAgreementWorkAgreementSn = value;
    }

    /**
     * Gets the value of the inTransitionProfitsAccountAccountCd property.
     * 
     */
    public short getInTransitionProfitsAccountAccountCd() {
        return inTransitionProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inTransitionProfitsAccountAccountCd property.
     * 
     */
    public void setInTransitionProfitsAccountAccountCd(short value) {
        this.inTransitionProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inTransitionProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTransitionProfitsAccountAccountNumber() {
        return inTransitionProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inTransitionProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTransitionProfitsAccountAccountNumber(String value) {
        this.inTransitionProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inTrxSsSecurityCmcbPrftSystem property.
     * 
     */
    public short getInTrxSsSecurityCmcbPrftSystem() {
        return inTrxSsSecurityCmcbPrftSystem;
    }

    /**
     * Sets the value of the inTrxSsSecurityCmcbPrftSystem property.
     * 
     */
    public void setInTrxSsSecurityCmcbPrftSystem(short value) {
        this.inTrxSsSecurityCmcbPrftSystem = value;
    }

    /**
     * Gets the value of the inTrxTeamInformationSuper1Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxTeamInformationSuper1Code() {
        return inTrxTeamInformationSuper1Code;
    }

    /**
     * Sets the value of the inTrxTeamInformationSuper1Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxTeamInformationSuper1Code(String value) {
        this.inTrxTeamInformationSuper1Code = value;
    }

    /**
     * Gets the value of the inTrxTeamInformationSuper2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxTeamInformationSuper2Code() {
        return inTrxTeamInformationSuper2Code;
    }

    /**
     * Sets the value of the inTrxTeamInformationSuper2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxTeamInformationSuper2Code(String value) {
        this.inTrxTeamInformationSuper2Code = value;
    }

    /**
     * Gets the value of the inTrxTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxTerminalTerminalNumber() {
        return inTrxTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inTrxTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxTerminalTerminalNumber(String value) {
        this.inTrxTerminalTerminalNumber = value;
    }

    /**
     * Gets the value of the inVillageGenericDetailSerialNum property.
     * 
     */
    public int getInVillageGenericDetailSerialNum() {
        return inVillageGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inVillageGenericDetailSerialNum property.
     * 
     */
    public void setInVillageGenericDetailSerialNum(int value) {
        this.inVillageGenericDetailSerialNum = value;
    }

}
