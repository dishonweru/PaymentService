
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for G0501VGlAccountValidationExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="G0501VGlAccountValidationExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutAssLiabGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAssLiabGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBalTypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBalTypeGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBalTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBalshTypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBalshTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBistaGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBistaGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCategUnitGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCategUnitGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGlgAccountAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlgAccountBopFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlgAccountBopGroupAccount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGlgAccountCentralFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlgAccountCostAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlgAccountDbCrBalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlgAccountDeactivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGlgAccountDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlgAccountDsubTrnFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlgAccountEvalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlgAccountFcconvFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlgAccountLastUpdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGlgAccountLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlgAccountMandAdditionalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlgAccountMandCustInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlgAccountModifyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGlgAccountOpenDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGlgAccountOptionalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlgAccountPositionFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlgAccountRealTimeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlgAccountReconFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlgAccountReconRunDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGlgAccountReconStartDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGlgAccountSecLevel" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGlgAccountShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlgAccountState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlgAccountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlgAccountSubsConsFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlgAccountSubsidCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGlgAccountTimestmp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGlgAccountUnitAppliedFor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlgAccountUnitRealTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlgAccountUpdateWayInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlgAccountUpdatedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlgAccountValeurDateFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlgAccountValeurFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlgCostProfitArCostTypeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlgCostProfitArDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlgCostProfitArTrnId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlgHCurrGroupCurrGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlgHCurrGroupDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpSrvLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfG0501VOutGrpSrvLogItem" minOccurs="0"/>
 *         &lt;element name="OutGrpCostDet" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfG0501VOutGrpCostDetItem" minOccurs="0"/>
 *         &lt;element name="OutModifyUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPermitUnitGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPermitUnitGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutPrctpGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrctpGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSrvStatusIefSuppliedSrvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSubsGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSubsGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationAccountCode" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutTeamInformationAuthorizationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationAuthorizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationCustomerCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationEncroachTolerance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationEvaluationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationJustificationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationJustificationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationSuper1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationSuper2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationTeamComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationTransactionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationUserCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUserProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUserProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUserProfile3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUserSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUserTerminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "G0501VGlAccountValidationExport", propOrder = {
    "outAssLiabGenericDetailDescription",
    "outAssLiabGenericDetailSerialNum",
    "outBalTypeGenericDetailDescription",
    "outBalTypeGenericDetailParameterType",
    "outBalTypeGenericDetailSerialNum",
    "outBalshTypeGenericDetailDescription",
    "outBalshTypeGenericDetailSerialNum",
    "outBistaGenericDetailDescription",
    "outBistaGenericDetailSerialNum",
    "outCategUnitGenericDetailDescription",
    "outCategUnitGenericDetailSerialNum",
    "outGlgAccountAccountId",
    "outGlgAccountBopFlg",
    "outGlgAccountBopGroupAccount",
    "outGlgAccountCentralFlag",
    "outGlgAccountCostAccFlag",
    "outGlgAccountDbCrBalFlag",
    "outGlgAccountDeactivationDate",
    "outGlgAccountDescr",
    "outGlgAccountDsubTrnFlag",
    "outGlgAccountEvalFlag",
    "outGlgAccountFcconvFlag",
    "outGlgAccountLastUpdDate",
    "outGlgAccountLevel",
    "outGlgAccountMandAdditionalInfo",
    "outGlgAccountMandCustInfo",
    "outGlgAccountModifyDate",
    "outGlgAccountOpenDate",
    "outGlgAccountOptionalFlag",
    "outGlgAccountPositionFlag",
    "outGlgAccountRealTimeFlag",
    "outGlgAccountReconFlag",
    "outGlgAccountReconRunDt",
    "outGlgAccountReconStartDt",
    "outGlgAccountSecLevel",
    "outGlgAccountShortDescr",
    "outGlgAccountState",
    "outGlgAccountStatus",
    "outGlgAccountSubsConsFlag",
    "outGlgAccountSubsidCount",
    "outGlgAccountTimestmp",
    "outGlgAccountUnitAppliedFor",
    "outGlgAccountUnitRealTime",
    "outGlgAccountUpdateWayInd",
    "outGlgAccountUpdatedFlag",
    "outGlgAccountValeurDateFlag",
    "outGlgAccountValeurFlg",
    "outGlgCostProfitArCostTypeFlag",
    "outGlgCostProfitArDescription",
    "outGlgCostProfitArTrnId",
    "outGlgHCurrGroupCurrGroupId",
    "outGlgHCurrGroupDescr",
    "outGrpSrvLog",
    "outGrpCostDet",
    "outModifyUsrCode",
    "outPermitUnitGenericDetailDescription",
    "outPermitUnitGenericDetailSerialNum",
    "outPrctpGenericDetailDescription",
    "outPrctpGenericDetailSerialNum",
    "outSrvStatusIefSuppliedSrvStatus",
    "outSubsGenericDetailDescription",
    "outSubsGenericDetailSerialNum",
    "outTeamInformationAccountCode",
    "outTeamInformationAuthorizationResult",
    "outTeamInformationAuthorizationType",
    "outTeamInformationCustomerCode",
    "outTeamInformationCustomerSurname",
    "outTeamInformationEncroachTolerance",
    "outTeamInformationEvaluationResult",
    "outTeamInformationJustificationDescription",
    "outTeamInformationJustificationId",
    "outTeamInformationProductDescription",
    "outTeamInformationProductId",
    "outTeamInformationRequiredProfile1",
    "outTeamInformationRequiredProfile2",
    "outTeamInformationSuper1Code",
    "outTeamInformationSuper2Code",
    "outTeamInformationTeamComments",
    "outTeamInformationTransactionDescription",
    "outTeamInformationTransactionId",
    "outTeamInformationUnitCode",
    "outTeamInformationUserCode",
    "outTeamInformationUserProfile1",
    "outTeamInformationUserProfile2",
    "outTeamInformationUserProfile3",
    "outTeamInformationUserSurname",
    "outTeamInformationUserTerminalId"
})
public class G0501VGlAccountValidationExport
    extends BaseExport
{

    @XmlElement(name = "OutAssLiabGenericDetailDescription")
    protected String outAssLiabGenericDetailDescription;
    @XmlElement(name = "OutAssLiabGenericDetailSerialNum")
    protected int outAssLiabGenericDetailSerialNum;
    @XmlElement(name = "OutBalTypeGenericDetailDescription")
    protected String outBalTypeGenericDetailDescription;
    @XmlElement(name = "OutBalTypeGenericDetailParameterType")
    protected String outBalTypeGenericDetailParameterType;
    @XmlElement(name = "OutBalTypeGenericDetailSerialNum")
    protected int outBalTypeGenericDetailSerialNum;
    @XmlElement(name = "OutBalshTypeGenericDetailDescription")
    protected String outBalshTypeGenericDetailDescription;
    @XmlElement(name = "OutBalshTypeGenericDetailSerialNum")
    protected int outBalshTypeGenericDetailSerialNum;
    @XmlElement(name = "OutBistaGenericDetailDescription")
    protected String outBistaGenericDetailDescription;
    @XmlElement(name = "OutBistaGenericDetailSerialNum")
    protected int outBistaGenericDetailSerialNum;
    @XmlElement(name = "OutCategUnitGenericDetailDescription")
    protected String outCategUnitGenericDetailDescription;
    @XmlElement(name = "OutCategUnitGenericDetailSerialNum")
    protected int outCategUnitGenericDetailSerialNum;
    @XmlElement(name = "OutGlgAccountAccountId")
    protected String outGlgAccountAccountId;
    @XmlElement(name = "OutGlgAccountBopFlg")
    protected String outGlgAccountBopFlg;
    @XmlElement(name = "OutGlgAccountBopGroupAccount")
    protected int outGlgAccountBopGroupAccount;
    @XmlElement(name = "OutGlgAccountCentralFlag")
    protected String outGlgAccountCentralFlag;
    @XmlElement(name = "OutGlgAccountCostAccFlag")
    protected String outGlgAccountCostAccFlag;
    @XmlElement(name = "OutGlgAccountDbCrBalFlag")
    protected String outGlgAccountDbCrBalFlag;
    @XmlElement(name = "OutGlgAccountDeactivationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGlgAccountDeactivationDate;
    @XmlElement(name = "OutGlgAccountDescr")
    protected String outGlgAccountDescr;
    @XmlElement(name = "OutGlgAccountDsubTrnFlag")
    protected String outGlgAccountDsubTrnFlag;
    @XmlElement(name = "OutGlgAccountEvalFlag")
    protected String outGlgAccountEvalFlag;
    @XmlElement(name = "OutGlgAccountFcconvFlag")
    protected String outGlgAccountFcconvFlag;
    @XmlElement(name = "OutGlgAccountLastUpdDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGlgAccountLastUpdDate;
    @XmlElement(name = "OutGlgAccountLevel")
    protected String outGlgAccountLevel;
    @XmlElement(name = "OutGlgAccountMandAdditionalInfo")
    protected String outGlgAccountMandAdditionalInfo;
    @XmlElement(name = "OutGlgAccountMandCustInfo")
    protected String outGlgAccountMandCustInfo;
    @XmlElement(name = "OutGlgAccountModifyDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGlgAccountModifyDate;
    @XmlElement(name = "OutGlgAccountOpenDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGlgAccountOpenDate;
    @XmlElement(name = "OutGlgAccountOptionalFlag")
    protected String outGlgAccountOptionalFlag;
    @XmlElement(name = "OutGlgAccountPositionFlag")
    protected String outGlgAccountPositionFlag;
    @XmlElement(name = "OutGlgAccountRealTimeFlag")
    protected String outGlgAccountRealTimeFlag;
    @XmlElement(name = "OutGlgAccountReconFlag")
    protected String outGlgAccountReconFlag;
    @XmlElement(name = "OutGlgAccountReconRunDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGlgAccountReconRunDt;
    @XmlElement(name = "OutGlgAccountReconStartDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGlgAccountReconStartDt;
    @XmlElement(name = "OutGlgAccountSecLevel")
    protected short outGlgAccountSecLevel;
    @XmlElement(name = "OutGlgAccountShortDescr")
    protected String outGlgAccountShortDescr;
    @XmlElement(name = "OutGlgAccountState")
    protected String outGlgAccountState;
    @XmlElement(name = "OutGlgAccountStatus")
    protected String outGlgAccountStatus;
    @XmlElement(name = "OutGlgAccountSubsConsFlag")
    protected String outGlgAccountSubsConsFlag;
    @XmlElement(name = "OutGlgAccountSubsidCount")
    protected int outGlgAccountSubsidCount;
    @XmlElement(name = "OutGlgAccountTimestmp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGlgAccountTimestmp;
    @XmlElement(name = "OutGlgAccountUnitAppliedFor")
    protected String outGlgAccountUnitAppliedFor;
    @XmlElement(name = "OutGlgAccountUnitRealTime")
    protected String outGlgAccountUnitRealTime;
    @XmlElement(name = "OutGlgAccountUpdateWayInd")
    protected String outGlgAccountUpdateWayInd;
    @XmlElement(name = "OutGlgAccountUpdatedFlag")
    protected String outGlgAccountUpdatedFlag;
    @XmlElement(name = "OutGlgAccountValeurDateFlag")
    protected String outGlgAccountValeurDateFlag;
    @XmlElement(name = "OutGlgAccountValeurFlg")
    protected String outGlgAccountValeurFlg;
    @XmlElement(name = "OutGlgCostProfitArCostTypeFlag")
    protected String outGlgCostProfitArCostTypeFlag;
    @XmlElement(name = "OutGlgCostProfitArDescription")
    protected String outGlgCostProfitArDescription;
    @XmlElement(name = "OutGlgCostProfitArTrnId")
    protected String outGlgCostProfitArTrnId;
    @XmlElement(name = "OutGlgHCurrGroupCurrGroupId")
    protected String outGlgHCurrGroupCurrGroupId;
    @XmlElement(name = "OutGlgHCurrGroupDescr")
    protected String outGlgHCurrGroupDescr;
    @XmlElement(name = "OutGrpSrvLog")
    protected ArrayOfG0501VOutGrpSrvLogItem outGrpSrvLog;
    @XmlElement(name = "OutGrpCostDet")
    protected ArrayOfG0501VOutGrpCostDetItem outGrpCostDet;
    @XmlElement(name = "OutModifyUsrCode")
    protected String outModifyUsrCode;
    @XmlElement(name = "OutPermitUnitGenericDetailDescription")
    protected String outPermitUnitGenericDetailDescription;
    @XmlElement(name = "OutPermitUnitGenericDetailSerialNum")
    protected int outPermitUnitGenericDetailSerialNum;
    @XmlElement(name = "OutPrctpGenericDetailDescription")
    protected String outPrctpGenericDetailDescription;
    @XmlElement(name = "OutPrctpGenericDetailSerialNum")
    protected int outPrctpGenericDetailSerialNum;
    @XmlElement(name = "OutSrvStatusIefSuppliedSrvStatus")
    protected String outSrvStatusIefSuppliedSrvStatus;
    @XmlElement(name = "OutSubsGenericDetailDescription")
    protected String outSubsGenericDetailDescription;
    @XmlElement(name = "OutSubsGenericDetailSerialNum")
    protected int outSubsGenericDetailSerialNum;
    @XmlElement(name = "OutTeamInformationAccountCode")
    protected double outTeamInformationAccountCode;
    @XmlElement(name = "OutTeamInformationAuthorizationResult")
    protected String outTeamInformationAuthorizationResult;
    @XmlElement(name = "OutTeamInformationAuthorizationType")
    protected String outTeamInformationAuthorizationType;
    @XmlElement(name = "OutTeamInformationCustomerCode")
    protected int outTeamInformationCustomerCode;
    @XmlElement(name = "OutTeamInformationCustomerSurname")
    protected String outTeamInformationCustomerSurname;
    @XmlElement(name = "OutTeamInformationEncroachTolerance", required = true)
    protected BigDecimal outTeamInformationEncroachTolerance;
    @XmlElement(name = "OutTeamInformationEvaluationResult")
    protected String outTeamInformationEvaluationResult;
    @XmlElement(name = "OutTeamInformationJustificationDescription")
    protected String outTeamInformationJustificationDescription;
    @XmlElement(name = "OutTeamInformationJustificationId")
    protected int outTeamInformationJustificationId;
    @XmlElement(name = "OutTeamInformationProductDescription")
    protected String outTeamInformationProductDescription;
    @XmlElement(name = "OutTeamInformationProductId")
    protected int outTeamInformationProductId;
    @XmlElement(name = "OutTeamInformationRequiredProfile1")
    protected String outTeamInformationRequiredProfile1;
    @XmlElement(name = "OutTeamInformationRequiredProfile2")
    protected String outTeamInformationRequiredProfile2;
    @XmlElement(name = "OutTeamInformationSuper1Code")
    protected String outTeamInformationSuper1Code;
    @XmlElement(name = "OutTeamInformationSuper2Code")
    protected String outTeamInformationSuper2Code;
    @XmlElement(name = "OutTeamInformationTeamComments")
    protected String outTeamInformationTeamComments;
    @XmlElement(name = "OutTeamInformationTransactionDescription")
    protected String outTeamInformationTransactionDescription;
    @XmlElement(name = "OutTeamInformationTransactionId")
    protected int outTeamInformationTransactionId;
    @XmlElement(name = "OutTeamInformationUnitCode")
    protected int outTeamInformationUnitCode;
    @XmlElement(name = "OutTeamInformationUserCode")
    protected String outTeamInformationUserCode;
    @XmlElement(name = "OutTeamInformationUserProfile1")
    protected String outTeamInformationUserProfile1;
    @XmlElement(name = "OutTeamInformationUserProfile2")
    protected String outTeamInformationUserProfile2;
    @XmlElement(name = "OutTeamInformationUserProfile3")
    protected String outTeamInformationUserProfile3;
    @XmlElement(name = "OutTeamInformationUserSurname")
    protected String outTeamInformationUserSurname;
    @XmlElement(name = "OutTeamInformationUserTerminalId")
    protected String outTeamInformationUserTerminalId;

    /**
     * Gets the value of the outAssLiabGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAssLiabGenericDetailDescription() {
        return outAssLiabGenericDetailDescription;
    }

    /**
     * Sets the value of the outAssLiabGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAssLiabGenericDetailDescription(String value) {
        this.outAssLiabGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outAssLiabGenericDetailSerialNum property.
     * 
     */
    public int getOutAssLiabGenericDetailSerialNum() {
        return outAssLiabGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outAssLiabGenericDetailSerialNum property.
     * 
     */
    public void setOutAssLiabGenericDetailSerialNum(int value) {
        this.outAssLiabGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outBalTypeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBalTypeGenericDetailDescription() {
        return outBalTypeGenericDetailDescription;
    }

    /**
     * Sets the value of the outBalTypeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBalTypeGenericDetailDescription(String value) {
        this.outBalTypeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outBalTypeGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBalTypeGenericDetailParameterType() {
        return outBalTypeGenericDetailParameterType;
    }

    /**
     * Sets the value of the outBalTypeGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBalTypeGenericDetailParameterType(String value) {
        this.outBalTypeGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outBalTypeGenericDetailSerialNum property.
     * 
     */
    public int getOutBalTypeGenericDetailSerialNum() {
        return outBalTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outBalTypeGenericDetailSerialNum property.
     * 
     */
    public void setOutBalTypeGenericDetailSerialNum(int value) {
        this.outBalTypeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outBalshTypeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBalshTypeGenericDetailDescription() {
        return outBalshTypeGenericDetailDescription;
    }

    /**
     * Sets the value of the outBalshTypeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBalshTypeGenericDetailDescription(String value) {
        this.outBalshTypeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outBalshTypeGenericDetailSerialNum property.
     * 
     */
    public int getOutBalshTypeGenericDetailSerialNum() {
        return outBalshTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outBalshTypeGenericDetailSerialNum property.
     * 
     */
    public void setOutBalshTypeGenericDetailSerialNum(int value) {
        this.outBalshTypeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outBistaGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBistaGenericDetailDescription() {
        return outBistaGenericDetailDescription;
    }

    /**
     * Sets the value of the outBistaGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBistaGenericDetailDescription(String value) {
        this.outBistaGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outBistaGenericDetailSerialNum property.
     * 
     */
    public int getOutBistaGenericDetailSerialNum() {
        return outBistaGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outBistaGenericDetailSerialNum property.
     * 
     */
    public void setOutBistaGenericDetailSerialNum(int value) {
        this.outBistaGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outCategUnitGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCategUnitGenericDetailDescription() {
        return outCategUnitGenericDetailDescription;
    }

    /**
     * Sets the value of the outCategUnitGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCategUnitGenericDetailDescription(String value) {
        this.outCategUnitGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outCategUnitGenericDetailSerialNum property.
     * 
     */
    public int getOutCategUnitGenericDetailSerialNum() {
        return outCategUnitGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outCategUnitGenericDetailSerialNum property.
     * 
     */
    public void setOutCategUnitGenericDetailSerialNum(int value) {
        this.outCategUnitGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outGlgAccountAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlgAccountAccountId() {
        return outGlgAccountAccountId;
    }

    /**
     * Sets the value of the outGlgAccountAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlgAccountAccountId(String value) {
        this.outGlgAccountAccountId = value;
    }

    /**
     * Gets the value of the outGlgAccountBopFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlgAccountBopFlg() {
        return outGlgAccountBopFlg;
    }

    /**
     * Sets the value of the outGlgAccountBopFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlgAccountBopFlg(String value) {
        this.outGlgAccountBopFlg = value;
    }

    /**
     * Gets the value of the outGlgAccountBopGroupAccount property.
     * 
     */
    public int getOutGlgAccountBopGroupAccount() {
        return outGlgAccountBopGroupAccount;
    }

    /**
     * Sets the value of the outGlgAccountBopGroupAccount property.
     * 
     */
    public void setOutGlgAccountBopGroupAccount(int value) {
        this.outGlgAccountBopGroupAccount = value;
    }

    /**
     * Gets the value of the outGlgAccountCentralFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlgAccountCentralFlag() {
        return outGlgAccountCentralFlag;
    }

    /**
     * Sets the value of the outGlgAccountCentralFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlgAccountCentralFlag(String value) {
        this.outGlgAccountCentralFlag = value;
    }

    /**
     * Gets the value of the outGlgAccountCostAccFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlgAccountCostAccFlag() {
        return outGlgAccountCostAccFlag;
    }

    /**
     * Sets the value of the outGlgAccountCostAccFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlgAccountCostAccFlag(String value) {
        this.outGlgAccountCostAccFlag = value;
    }

    /**
     * Gets the value of the outGlgAccountDbCrBalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlgAccountDbCrBalFlag() {
        return outGlgAccountDbCrBalFlag;
    }

    /**
     * Sets the value of the outGlgAccountDbCrBalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlgAccountDbCrBalFlag(String value) {
        this.outGlgAccountDbCrBalFlag = value;
    }

    /**
     * Gets the value of the outGlgAccountDeactivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGlgAccountDeactivationDate() {
        return outGlgAccountDeactivationDate;
    }

    /**
     * Sets the value of the outGlgAccountDeactivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGlgAccountDeactivationDate(XMLGregorianCalendar value) {
        this.outGlgAccountDeactivationDate = value;
    }

    /**
     * Gets the value of the outGlgAccountDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlgAccountDescr() {
        return outGlgAccountDescr;
    }

    /**
     * Sets the value of the outGlgAccountDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlgAccountDescr(String value) {
        this.outGlgAccountDescr = value;
    }

    /**
     * Gets the value of the outGlgAccountDsubTrnFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlgAccountDsubTrnFlag() {
        return outGlgAccountDsubTrnFlag;
    }

    /**
     * Sets the value of the outGlgAccountDsubTrnFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlgAccountDsubTrnFlag(String value) {
        this.outGlgAccountDsubTrnFlag = value;
    }

    /**
     * Gets the value of the outGlgAccountEvalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlgAccountEvalFlag() {
        return outGlgAccountEvalFlag;
    }

    /**
     * Sets the value of the outGlgAccountEvalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlgAccountEvalFlag(String value) {
        this.outGlgAccountEvalFlag = value;
    }

    /**
     * Gets the value of the outGlgAccountFcconvFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlgAccountFcconvFlag() {
        return outGlgAccountFcconvFlag;
    }

    /**
     * Sets the value of the outGlgAccountFcconvFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlgAccountFcconvFlag(String value) {
        this.outGlgAccountFcconvFlag = value;
    }

    /**
     * Gets the value of the outGlgAccountLastUpdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGlgAccountLastUpdDate() {
        return outGlgAccountLastUpdDate;
    }

    /**
     * Sets the value of the outGlgAccountLastUpdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGlgAccountLastUpdDate(XMLGregorianCalendar value) {
        this.outGlgAccountLastUpdDate = value;
    }

    /**
     * Gets the value of the outGlgAccountLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlgAccountLevel() {
        return outGlgAccountLevel;
    }

    /**
     * Sets the value of the outGlgAccountLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlgAccountLevel(String value) {
        this.outGlgAccountLevel = value;
    }

    /**
     * Gets the value of the outGlgAccountMandAdditionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlgAccountMandAdditionalInfo() {
        return outGlgAccountMandAdditionalInfo;
    }

    /**
     * Sets the value of the outGlgAccountMandAdditionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlgAccountMandAdditionalInfo(String value) {
        this.outGlgAccountMandAdditionalInfo = value;
    }

    /**
     * Gets the value of the outGlgAccountMandCustInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlgAccountMandCustInfo() {
        return outGlgAccountMandCustInfo;
    }

    /**
     * Sets the value of the outGlgAccountMandCustInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlgAccountMandCustInfo(String value) {
        this.outGlgAccountMandCustInfo = value;
    }

    /**
     * Gets the value of the outGlgAccountModifyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGlgAccountModifyDate() {
        return outGlgAccountModifyDate;
    }

    /**
     * Sets the value of the outGlgAccountModifyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGlgAccountModifyDate(XMLGregorianCalendar value) {
        this.outGlgAccountModifyDate = value;
    }

    /**
     * Gets the value of the outGlgAccountOpenDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGlgAccountOpenDate() {
        return outGlgAccountOpenDate;
    }

    /**
     * Sets the value of the outGlgAccountOpenDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGlgAccountOpenDate(XMLGregorianCalendar value) {
        this.outGlgAccountOpenDate = value;
    }

    /**
     * Gets the value of the outGlgAccountOptionalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlgAccountOptionalFlag() {
        return outGlgAccountOptionalFlag;
    }

    /**
     * Sets the value of the outGlgAccountOptionalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlgAccountOptionalFlag(String value) {
        this.outGlgAccountOptionalFlag = value;
    }

    /**
     * Gets the value of the outGlgAccountPositionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlgAccountPositionFlag() {
        return outGlgAccountPositionFlag;
    }

    /**
     * Sets the value of the outGlgAccountPositionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlgAccountPositionFlag(String value) {
        this.outGlgAccountPositionFlag = value;
    }

    /**
     * Gets the value of the outGlgAccountRealTimeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlgAccountRealTimeFlag() {
        return outGlgAccountRealTimeFlag;
    }

    /**
     * Sets the value of the outGlgAccountRealTimeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlgAccountRealTimeFlag(String value) {
        this.outGlgAccountRealTimeFlag = value;
    }

    /**
     * Gets the value of the outGlgAccountReconFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlgAccountReconFlag() {
        return outGlgAccountReconFlag;
    }

    /**
     * Sets the value of the outGlgAccountReconFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlgAccountReconFlag(String value) {
        this.outGlgAccountReconFlag = value;
    }

    /**
     * Gets the value of the outGlgAccountReconRunDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGlgAccountReconRunDt() {
        return outGlgAccountReconRunDt;
    }

    /**
     * Sets the value of the outGlgAccountReconRunDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGlgAccountReconRunDt(XMLGregorianCalendar value) {
        this.outGlgAccountReconRunDt = value;
    }

    /**
     * Gets the value of the outGlgAccountReconStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGlgAccountReconStartDt() {
        return outGlgAccountReconStartDt;
    }

    /**
     * Sets the value of the outGlgAccountReconStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGlgAccountReconStartDt(XMLGregorianCalendar value) {
        this.outGlgAccountReconStartDt = value;
    }

    /**
     * Gets the value of the outGlgAccountSecLevel property.
     * 
     */
    public short getOutGlgAccountSecLevel() {
        return outGlgAccountSecLevel;
    }

    /**
     * Sets the value of the outGlgAccountSecLevel property.
     * 
     */
    public void setOutGlgAccountSecLevel(short value) {
        this.outGlgAccountSecLevel = value;
    }

    /**
     * Gets the value of the outGlgAccountShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlgAccountShortDescr() {
        return outGlgAccountShortDescr;
    }

    /**
     * Sets the value of the outGlgAccountShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlgAccountShortDescr(String value) {
        this.outGlgAccountShortDescr = value;
    }

    /**
     * Gets the value of the outGlgAccountState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlgAccountState() {
        return outGlgAccountState;
    }

    /**
     * Sets the value of the outGlgAccountState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlgAccountState(String value) {
        this.outGlgAccountState = value;
    }

    /**
     * Gets the value of the outGlgAccountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlgAccountStatus() {
        return outGlgAccountStatus;
    }

    /**
     * Sets the value of the outGlgAccountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlgAccountStatus(String value) {
        this.outGlgAccountStatus = value;
    }

    /**
     * Gets the value of the outGlgAccountSubsConsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlgAccountSubsConsFlag() {
        return outGlgAccountSubsConsFlag;
    }

    /**
     * Sets the value of the outGlgAccountSubsConsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlgAccountSubsConsFlag(String value) {
        this.outGlgAccountSubsConsFlag = value;
    }

    /**
     * Gets the value of the outGlgAccountSubsidCount property.
     * 
     */
    public int getOutGlgAccountSubsidCount() {
        return outGlgAccountSubsidCount;
    }

    /**
     * Sets the value of the outGlgAccountSubsidCount property.
     * 
     */
    public void setOutGlgAccountSubsidCount(int value) {
        this.outGlgAccountSubsidCount = value;
    }

    /**
     * Gets the value of the outGlgAccountTimestmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGlgAccountTimestmp() {
        return outGlgAccountTimestmp;
    }

    /**
     * Sets the value of the outGlgAccountTimestmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGlgAccountTimestmp(XMLGregorianCalendar value) {
        this.outGlgAccountTimestmp = value;
    }

    /**
     * Gets the value of the outGlgAccountUnitAppliedFor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlgAccountUnitAppliedFor() {
        return outGlgAccountUnitAppliedFor;
    }

    /**
     * Sets the value of the outGlgAccountUnitAppliedFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlgAccountUnitAppliedFor(String value) {
        this.outGlgAccountUnitAppliedFor = value;
    }

    /**
     * Gets the value of the outGlgAccountUnitRealTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlgAccountUnitRealTime() {
        return outGlgAccountUnitRealTime;
    }

    /**
     * Sets the value of the outGlgAccountUnitRealTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlgAccountUnitRealTime(String value) {
        this.outGlgAccountUnitRealTime = value;
    }

    /**
     * Gets the value of the outGlgAccountUpdateWayInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlgAccountUpdateWayInd() {
        return outGlgAccountUpdateWayInd;
    }

    /**
     * Sets the value of the outGlgAccountUpdateWayInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlgAccountUpdateWayInd(String value) {
        this.outGlgAccountUpdateWayInd = value;
    }

    /**
     * Gets the value of the outGlgAccountUpdatedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlgAccountUpdatedFlag() {
        return outGlgAccountUpdatedFlag;
    }

    /**
     * Sets the value of the outGlgAccountUpdatedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlgAccountUpdatedFlag(String value) {
        this.outGlgAccountUpdatedFlag = value;
    }

    /**
     * Gets the value of the outGlgAccountValeurDateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlgAccountValeurDateFlag() {
        return outGlgAccountValeurDateFlag;
    }

    /**
     * Sets the value of the outGlgAccountValeurDateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlgAccountValeurDateFlag(String value) {
        this.outGlgAccountValeurDateFlag = value;
    }

    /**
     * Gets the value of the outGlgAccountValeurFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlgAccountValeurFlg() {
        return outGlgAccountValeurFlg;
    }

    /**
     * Sets the value of the outGlgAccountValeurFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlgAccountValeurFlg(String value) {
        this.outGlgAccountValeurFlg = value;
    }

    /**
     * Gets the value of the outGlgCostProfitArCostTypeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlgCostProfitArCostTypeFlag() {
        return outGlgCostProfitArCostTypeFlag;
    }

    /**
     * Sets the value of the outGlgCostProfitArCostTypeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlgCostProfitArCostTypeFlag(String value) {
        this.outGlgCostProfitArCostTypeFlag = value;
    }

    /**
     * Gets the value of the outGlgCostProfitArDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlgCostProfitArDescription() {
        return outGlgCostProfitArDescription;
    }

    /**
     * Sets the value of the outGlgCostProfitArDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlgCostProfitArDescription(String value) {
        this.outGlgCostProfitArDescription = value;
    }

    /**
     * Gets the value of the outGlgCostProfitArTrnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlgCostProfitArTrnId() {
        return outGlgCostProfitArTrnId;
    }

    /**
     * Sets the value of the outGlgCostProfitArTrnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlgCostProfitArTrnId(String value) {
        this.outGlgCostProfitArTrnId = value;
    }

    /**
     * Gets the value of the outGlgHCurrGroupCurrGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlgHCurrGroupCurrGroupId() {
        return outGlgHCurrGroupCurrGroupId;
    }

    /**
     * Sets the value of the outGlgHCurrGroupCurrGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlgHCurrGroupCurrGroupId(String value) {
        this.outGlgHCurrGroupCurrGroupId = value;
    }

    /**
     * Gets the value of the outGlgHCurrGroupDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlgHCurrGroupDescr() {
        return outGlgHCurrGroupDescr;
    }

    /**
     * Sets the value of the outGlgHCurrGroupDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlgHCurrGroupDescr(String value) {
        this.outGlgHCurrGroupDescr = value;
    }

    /**
     * Gets the value of the outGrpSrvLog property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfG0501VOutGrpSrvLogItem }
     *     
     */
    public ArrayOfG0501VOutGrpSrvLogItem getOutGrpSrvLog() {
        return outGrpSrvLog;
    }

    /**
     * Sets the value of the outGrpSrvLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfG0501VOutGrpSrvLogItem }
     *     
     */
    public void setOutGrpSrvLog(ArrayOfG0501VOutGrpSrvLogItem value) {
        this.outGrpSrvLog = value;
    }

    /**
     * Gets the value of the outGrpCostDet property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfG0501VOutGrpCostDetItem }
     *     
     */
    public ArrayOfG0501VOutGrpCostDetItem getOutGrpCostDet() {
        return outGrpCostDet;
    }

    /**
     * Sets the value of the outGrpCostDet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfG0501VOutGrpCostDetItem }
     *     
     */
    public void setOutGrpCostDet(ArrayOfG0501VOutGrpCostDetItem value) {
        this.outGrpCostDet = value;
    }

    /**
     * Gets the value of the outModifyUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutModifyUsrCode() {
        return outModifyUsrCode;
    }

    /**
     * Sets the value of the outModifyUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutModifyUsrCode(String value) {
        this.outModifyUsrCode = value;
    }

    /**
     * Gets the value of the outPermitUnitGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPermitUnitGenericDetailDescription() {
        return outPermitUnitGenericDetailDescription;
    }

    /**
     * Sets the value of the outPermitUnitGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPermitUnitGenericDetailDescription(String value) {
        this.outPermitUnitGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outPermitUnitGenericDetailSerialNum property.
     * 
     */
    public int getOutPermitUnitGenericDetailSerialNum() {
        return outPermitUnitGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outPermitUnitGenericDetailSerialNum property.
     * 
     */
    public void setOutPermitUnitGenericDetailSerialNum(int value) {
        this.outPermitUnitGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outPrctpGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrctpGenericDetailDescription() {
        return outPrctpGenericDetailDescription;
    }

    /**
     * Sets the value of the outPrctpGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrctpGenericDetailDescription(String value) {
        this.outPrctpGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outPrctpGenericDetailSerialNum property.
     * 
     */
    public int getOutPrctpGenericDetailSerialNum() {
        return outPrctpGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outPrctpGenericDetailSerialNum property.
     * 
     */
    public void setOutPrctpGenericDetailSerialNum(int value) {
        this.outPrctpGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outSrvStatusIefSuppliedSrvStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSrvStatusIefSuppliedSrvStatus() {
        return outSrvStatusIefSuppliedSrvStatus;
    }

    /**
     * Sets the value of the outSrvStatusIefSuppliedSrvStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSrvStatusIefSuppliedSrvStatus(String value) {
        this.outSrvStatusIefSuppliedSrvStatus = value;
    }

    /**
     * Gets the value of the outSubsGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSubsGenericDetailDescription() {
        return outSubsGenericDetailDescription;
    }

    /**
     * Sets the value of the outSubsGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSubsGenericDetailDescription(String value) {
        this.outSubsGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outSubsGenericDetailSerialNum property.
     * 
     */
    public int getOutSubsGenericDetailSerialNum() {
        return outSubsGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outSubsGenericDetailSerialNum property.
     * 
     */
    public void setOutSubsGenericDetailSerialNum(int value) {
        this.outSubsGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outTeamInformationAccountCode property.
     * 
     */
    public double getOutTeamInformationAccountCode() {
        return outTeamInformationAccountCode;
    }

    /**
     * Sets the value of the outTeamInformationAccountCode property.
     * 
     */
    public void setOutTeamInformationAccountCode(double value) {
        this.outTeamInformationAccountCode = value;
    }

    /**
     * Gets the value of the outTeamInformationAuthorizationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationAuthorizationResult() {
        return outTeamInformationAuthorizationResult;
    }

    /**
     * Sets the value of the outTeamInformationAuthorizationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationAuthorizationResult(String value) {
        this.outTeamInformationAuthorizationResult = value;
    }

    /**
     * Gets the value of the outTeamInformationAuthorizationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationAuthorizationType() {
        return outTeamInformationAuthorizationType;
    }

    /**
     * Sets the value of the outTeamInformationAuthorizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationAuthorizationType(String value) {
        this.outTeamInformationAuthorizationType = value;
    }

    /**
     * Gets the value of the outTeamInformationCustomerCode property.
     * 
     */
    public int getOutTeamInformationCustomerCode() {
        return outTeamInformationCustomerCode;
    }

    /**
     * Sets the value of the outTeamInformationCustomerCode property.
     * 
     */
    public void setOutTeamInformationCustomerCode(int value) {
        this.outTeamInformationCustomerCode = value;
    }

    /**
     * Gets the value of the outTeamInformationCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationCustomerSurname() {
        return outTeamInformationCustomerSurname;
    }

    /**
     * Sets the value of the outTeamInformationCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationCustomerSurname(String value) {
        this.outTeamInformationCustomerSurname = value;
    }

    /**
     * Gets the value of the outTeamInformationEncroachTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationEncroachTolerance() {
        return outTeamInformationEncroachTolerance;
    }

    /**
     * Sets the value of the outTeamInformationEncroachTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationEncroachTolerance(BigDecimal value) {
        this.outTeamInformationEncroachTolerance = value;
    }

    /**
     * Gets the value of the outTeamInformationEvaluationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationEvaluationResult() {
        return outTeamInformationEvaluationResult;
    }

    /**
     * Sets the value of the outTeamInformationEvaluationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationEvaluationResult(String value) {
        this.outTeamInformationEvaluationResult = value;
    }

    /**
     * Gets the value of the outTeamInformationJustificationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationJustificationDescription() {
        return outTeamInformationJustificationDescription;
    }

    /**
     * Sets the value of the outTeamInformationJustificationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationJustificationDescription(String value) {
        this.outTeamInformationJustificationDescription = value;
    }

    /**
     * Gets the value of the outTeamInformationJustificationId property.
     * 
     */
    public int getOutTeamInformationJustificationId() {
        return outTeamInformationJustificationId;
    }

    /**
     * Sets the value of the outTeamInformationJustificationId property.
     * 
     */
    public void setOutTeamInformationJustificationId(int value) {
        this.outTeamInformationJustificationId = value;
    }

    /**
     * Gets the value of the outTeamInformationProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationProductDescription() {
        return outTeamInformationProductDescription;
    }

    /**
     * Sets the value of the outTeamInformationProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationProductDescription(String value) {
        this.outTeamInformationProductDescription = value;
    }

    /**
     * Gets the value of the outTeamInformationProductId property.
     * 
     */
    public int getOutTeamInformationProductId() {
        return outTeamInformationProductId;
    }

    /**
     * Sets the value of the outTeamInformationProductId property.
     * 
     */
    public void setOutTeamInformationProductId(int value) {
        this.outTeamInformationProductId = value;
    }

    /**
     * Gets the value of the outTeamInformationRequiredProfile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationRequiredProfile1() {
        return outTeamInformationRequiredProfile1;
    }

    /**
     * Sets the value of the outTeamInformationRequiredProfile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationRequiredProfile1(String value) {
        this.outTeamInformationRequiredProfile1 = value;
    }

    /**
     * Gets the value of the outTeamInformationRequiredProfile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationRequiredProfile2() {
        return outTeamInformationRequiredProfile2;
    }

    /**
     * Sets the value of the outTeamInformationRequiredProfile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationRequiredProfile2(String value) {
        this.outTeamInformationRequiredProfile2 = value;
    }

    /**
     * Gets the value of the outTeamInformationSuper1Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationSuper1Code() {
        return outTeamInformationSuper1Code;
    }

    /**
     * Sets the value of the outTeamInformationSuper1Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationSuper1Code(String value) {
        this.outTeamInformationSuper1Code = value;
    }

    /**
     * Gets the value of the outTeamInformationSuper2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationSuper2Code() {
        return outTeamInformationSuper2Code;
    }

    /**
     * Sets the value of the outTeamInformationSuper2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationSuper2Code(String value) {
        this.outTeamInformationSuper2Code = value;
    }

    /**
     * Gets the value of the outTeamInformationTeamComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationTeamComments() {
        return outTeamInformationTeamComments;
    }

    /**
     * Sets the value of the outTeamInformationTeamComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationTeamComments(String value) {
        this.outTeamInformationTeamComments = value;
    }

    /**
     * Gets the value of the outTeamInformationTransactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationTransactionDescription() {
        return outTeamInformationTransactionDescription;
    }

    /**
     * Sets the value of the outTeamInformationTransactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationTransactionDescription(String value) {
        this.outTeamInformationTransactionDescription = value;
    }

    /**
     * Gets the value of the outTeamInformationTransactionId property.
     * 
     */
    public int getOutTeamInformationTransactionId() {
        return outTeamInformationTransactionId;
    }

    /**
     * Sets the value of the outTeamInformationTransactionId property.
     * 
     */
    public void setOutTeamInformationTransactionId(int value) {
        this.outTeamInformationTransactionId = value;
    }

    /**
     * Gets the value of the outTeamInformationUnitCode property.
     * 
     */
    public int getOutTeamInformationUnitCode() {
        return outTeamInformationUnitCode;
    }

    /**
     * Sets the value of the outTeamInformationUnitCode property.
     * 
     */
    public void setOutTeamInformationUnitCode(int value) {
        this.outTeamInformationUnitCode = value;
    }

    /**
     * Gets the value of the outTeamInformationUserCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationUserCode() {
        return outTeamInformationUserCode;
    }

    /**
     * Sets the value of the outTeamInformationUserCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationUserCode(String value) {
        this.outTeamInformationUserCode = value;
    }

    /**
     * Gets the value of the outTeamInformationUserProfile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationUserProfile1() {
        return outTeamInformationUserProfile1;
    }

    /**
     * Sets the value of the outTeamInformationUserProfile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationUserProfile1(String value) {
        this.outTeamInformationUserProfile1 = value;
    }

    /**
     * Gets the value of the outTeamInformationUserProfile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationUserProfile2() {
        return outTeamInformationUserProfile2;
    }

    /**
     * Sets the value of the outTeamInformationUserProfile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationUserProfile2(String value) {
        this.outTeamInformationUserProfile2 = value;
    }

    /**
     * Gets the value of the outTeamInformationUserProfile3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationUserProfile3() {
        return outTeamInformationUserProfile3;
    }

    /**
     * Sets the value of the outTeamInformationUserProfile3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationUserProfile3(String value) {
        this.outTeamInformationUserProfile3 = value;
    }

    /**
     * Gets the value of the outTeamInformationUserSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationUserSurname() {
        return outTeamInformationUserSurname;
    }

    /**
     * Sets the value of the outTeamInformationUserSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationUserSurname(String value) {
        this.outTeamInformationUserSurname = value;
    }

    /**
     * Gets the value of the outTeamInformationUserTerminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationUserTerminalId() {
        return outTeamInformationUserTerminalId;
    }

    /**
     * Sets the value of the outTeamInformationUserTerminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationUserTerminalId(String value) {
        this.outTeamInformationUserTerminalId = value;
    }

}
