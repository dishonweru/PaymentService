
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PFG004VDynamicCollateralExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PFG004VDynamicCollateralExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutFullInformationCollateralTblDocDocDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFullInformationCollateralTblDocDocDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFullInformationCollateralTblDocEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFullInformationCollateralTblDocInsertDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutFullInformationCollateralTblDocInsertTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutFullInformationCollateralTblDocInsertUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutFullInformationCollateralTblDocInsertUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFullInformationCollateralTblDocInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutFullInformationCollateralTblDocPrftSys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutFullInformationCollateralTblDocRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFullInformationCollateralTblDocReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFullInformationCollateralTblDocUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutFullInformationCollateralTblDocUpdateTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutFullInformationCollateralTblDocUpdateUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutFullInformationCollateralTblDocUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFullInsertUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFullInsertUserCharSuppliedChar40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFullUpdateUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFullUpdateUserCharSuppliedChar40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedToCollateralFieldsPfgSetSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedPfgSetupDetailCheckCurrDec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailCheckCurrStag" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedPfgSetupDetailCheckCurrTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailCheckEditProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailCheckEquality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailCheckExtCharSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailExceptionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailFkValidateDcdId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedPfgSetupDetailMurField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailNeedCharCheck" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailNeedDisabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailNeedMandaFunc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailNeedMandatory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailNeedMessageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailNeedSums" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailNeedValVsVal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailNeedValueDisable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailNeedValues" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailPrftRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailProtectedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailRefFldFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailRepetativeRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedPfgSetupDetailSetCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailSetSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedPfgSetupDetailShowOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedPfgSetupDetailShowToUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailSubtagSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedPfgSetupDetailSuppressIfZero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailTagDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailTagFieldFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailTagFieldType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailTagLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailTagMandatory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailTagNextLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailTagPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailTagReceiver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailTagRepeatNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedPfgSetupDetailTagRepetitive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailTagSameLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailTagSender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailTagSetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailTagStp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailTagUseList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailTagUseValidation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailTagValueAndData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailTagVerification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgTagSetSetupDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgTagSetSetupSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUsedPledgeCollateralTableCDigit1" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutUsedPledgeCollateralTableCustId1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutUsedPledgeCollateralTableInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutUsedPledgeCollateralTableRecordDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUsedPledgeCollateralTableRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUsedPledgeCollateralTableTagSetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUsedPledgeCollateralTableUsedCollatType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutUsedPledgeCollateralTableUsedUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpDocAttached" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfPFG004VOutGrpDocAttachedItem" minOccurs="0"/>
 *         &lt;element name="OutGrpError" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfPFG004VOutGrpErrorItem" minOccurs="0"/>
 *         &lt;element name="OutGrpFields" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfPFG004VOutGrpFieldsItem" minOccurs="0"/>
 *         &lt;element name="OutGrpValues" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfPFG004VOutGrpValuesItem" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgSetupDetailTagFieldLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedPfgSetupDetailExactLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PFG004VDynamicCollateralExport", propOrder = {
    "outFullInformationCollateralTblDocDocDescr",
    "outFullInformationCollateralTblDocDocDetails",
    "outFullInformationCollateralTblDocEntryStatus",
    "outFullInformationCollateralTblDocInsertDate",
    "outFullInformationCollateralTblDocInsertTmstamp",
    "outFullInformationCollateralTblDocInsertUnit",
    "outFullInformationCollateralTblDocInsertUser",
    "outFullInformationCollateralTblDocInternalSn",
    "outFullInformationCollateralTblDocPrftSys",
    "outFullInformationCollateralTblDocRecordType",
    "outFullInformationCollateralTblDocReferenceNumber",
    "outFullInformationCollateralTblDocUpdateDate",
    "outFullInformationCollateralTblDocUpdateTmstamp",
    "outFullInformationCollateralTblDocUpdateUnit",
    "outFullInformationCollateralTblDocUpdateUser",
    "outFullInsertUnitUnitName",
    "outFullInsertUserCharSuppliedChar40",
    "outFullUpdateUnitUnitName",
    "outFullUpdateUserCharSuppliedChar40",
    "outRetrievedToCollateralFieldsPfgSetSn",
    "outSelectedPfgSetupDetailCheckCurrDec",
    "outSelectedPfgSetupDetailCheckCurrStag",
    "outSelectedPfgSetupDetailCheckCurrTag",
    "outSelectedPfgSetupDetailCheckEditProfile",
    "outSelectedPfgSetupDetailCheckEquality",
    "outSelectedPfgSetupDetailCheckExtCharSet",
    "outSelectedPfgSetupDetailExceptionCode",
    "outSelectedPfgSetupDetailFkValidateDcdId",
    "outSelectedPfgSetupDetailMurField",
    "outSelectedPfgSetupDetailNeedCharCheck",
    "outSelectedPfgSetupDetailNeedDisabled",
    "outSelectedPfgSetupDetailNeedMandaFunc",
    "outSelectedPfgSetupDetailNeedMandatory",
    "outSelectedPfgSetupDetailNeedMessageType",
    "outSelectedPfgSetupDetailNeedSums",
    "outSelectedPfgSetupDetailNeedValVsVal",
    "outSelectedPfgSetupDetailNeedValueDisable",
    "outSelectedPfgSetupDetailNeedValues",
    "outSelectedPfgSetupDetailPrftRefNo",
    "outSelectedPfgSetupDetailProtectedFlag",
    "outSelectedPfgSetupDetailRefFldFlag",
    "outSelectedPfgSetupDetailRepetativeRef",
    "outSelectedPfgSetupDetailSetCategory",
    "outSelectedPfgSetupDetailSetSn",
    "outSelectedPfgSetupDetailShowOrder",
    "outSelectedPfgSetupDetailShowToUser",
    "outSelectedPfgSetupDetailSubtagSn",
    "outSelectedPfgSetupDetailSuppressIfZero",
    "outSelectedPfgSetupDetailTag",
    "outSelectedPfgSetupDetailTagDescription",
    "outSelectedPfgSetupDetailTagFieldFormat",
    "outSelectedPfgSetupDetailTagFieldType",
    "outSelectedPfgSetupDetailTagLabel",
    "outSelectedPfgSetupDetailTagMandatory",
    "outSelectedPfgSetupDetailTagNextLine",
    "outSelectedPfgSetupDetailTagPriority",
    "outSelectedPfgSetupDetailTagReceiver",
    "outSelectedPfgSetupDetailTagRepeatNumber",
    "outSelectedPfgSetupDetailTagRepetitive",
    "outSelectedPfgSetupDetailTagSameLine",
    "outSelectedPfgSetupDetailTagSender",
    "outSelectedPfgSetupDetailTagSetCode",
    "outSelectedPfgSetupDetailTagStp",
    "outSelectedPfgSetupDetailTagUseList",
    "outSelectedPfgSetupDetailTagUseValidation",
    "outSelectedPfgSetupDetailTagValueAndData",
    "outSelectedPfgSetupDetailTagVerification",
    "outSelectedPfgTagSetSetupDescription",
    "outSelectedPfgTagSetSetupSetDescription",
    "outUsedPledgeCollateralTableCDigit1",
    "outUsedPledgeCollateralTableCustId1",
    "outUsedPledgeCollateralTableInternalSn",
    "outUsedPledgeCollateralTableRecordDescr",
    "outUsedPledgeCollateralTableRecordType",
    "outUsedPledgeCollateralTableTagSetCode",
    "outUsedPledgeCollateralTableUsedCollatType",
    "outUsedPledgeCollateralTableUsedUnit",
    "outGrpDocAttached",
    "outGrpError",
    "outGrpFields",
    "outGrpValues",
    "outSelectedPfgSetupDetailTagFieldLength",
    "outSelectedPfgSetupDetailExactLength"
})
public class PFG004VDynamicCollateralExport
    extends BaseExport
{

    @XmlElement(name = "OutFullInformationCollateralTblDocDocDescr")
    protected String outFullInformationCollateralTblDocDocDescr;
    @XmlElement(name = "OutFullInformationCollateralTblDocDocDetails")
    protected String outFullInformationCollateralTblDocDocDetails;
    @XmlElement(name = "OutFullInformationCollateralTblDocEntryStatus")
    protected String outFullInformationCollateralTblDocEntryStatus;
    @XmlElement(name = "OutFullInformationCollateralTblDocInsertDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outFullInformationCollateralTblDocInsertDate;
    @XmlElement(name = "OutFullInformationCollateralTblDocInsertTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outFullInformationCollateralTblDocInsertTmstamp;
    @XmlElement(name = "OutFullInformationCollateralTblDocInsertUnit")
    protected int outFullInformationCollateralTblDocInsertUnit;
    @XmlElement(name = "OutFullInformationCollateralTblDocInsertUser")
    protected String outFullInformationCollateralTblDocInsertUser;
    @XmlElement(name = "OutFullInformationCollateralTblDocInternalSn")
    protected double outFullInformationCollateralTblDocInternalSn;
    @XmlElement(name = "OutFullInformationCollateralTblDocPrftSys")
    protected short outFullInformationCollateralTblDocPrftSys;
    @XmlElement(name = "OutFullInformationCollateralTblDocRecordType")
    protected String outFullInformationCollateralTblDocRecordType;
    @XmlElement(name = "OutFullInformationCollateralTblDocReferenceNumber")
    protected String outFullInformationCollateralTblDocReferenceNumber;
    @XmlElement(name = "OutFullInformationCollateralTblDocUpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outFullInformationCollateralTblDocUpdateDate;
    @XmlElement(name = "OutFullInformationCollateralTblDocUpdateTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outFullInformationCollateralTblDocUpdateTmstamp;
    @XmlElement(name = "OutFullInformationCollateralTblDocUpdateUnit")
    protected int outFullInformationCollateralTblDocUpdateUnit;
    @XmlElement(name = "OutFullInformationCollateralTblDocUpdateUser")
    protected String outFullInformationCollateralTblDocUpdateUser;
    @XmlElement(name = "OutFullInsertUnitUnitName")
    protected String outFullInsertUnitUnitName;
    @XmlElement(name = "OutFullInsertUserCharSuppliedChar40")
    protected String outFullInsertUserCharSuppliedChar40;
    @XmlElement(name = "OutFullUpdateUnitUnitName")
    protected String outFullUpdateUnitUnitName;
    @XmlElement(name = "OutFullUpdateUserCharSuppliedChar40")
    protected String outFullUpdateUserCharSuppliedChar40;
    @XmlElement(name = "OutRetrievedToCollateralFieldsPfgSetSn")
    protected int outRetrievedToCollateralFieldsPfgSetSn;
    @XmlElement(name = "OutSelectedPfgSetupDetailCheckCurrDec")
    protected String outSelectedPfgSetupDetailCheckCurrDec;
    @XmlElement(name = "OutSelectedPfgSetupDetailCheckCurrStag")
    protected short outSelectedPfgSetupDetailCheckCurrStag;
    @XmlElement(name = "OutSelectedPfgSetupDetailCheckCurrTag")
    protected String outSelectedPfgSetupDetailCheckCurrTag;
    @XmlElement(name = "OutSelectedPfgSetupDetailCheckEditProfile")
    protected String outSelectedPfgSetupDetailCheckEditProfile;
    @XmlElement(name = "OutSelectedPfgSetupDetailCheckEquality")
    protected String outSelectedPfgSetupDetailCheckEquality;
    @XmlElement(name = "OutSelectedPfgSetupDetailCheckExtCharSet")
    protected String outSelectedPfgSetupDetailCheckExtCharSet;
    @XmlElement(name = "OutSelectedPfgSetupDetailExceptionCode")
    protected String outSelectedPfgSetupDetailExceptionCode;
    @XmlElement(name = "OutSelectedPfgSetupDetailFkValidateDcdId")
    protected double outSelectedPfgSetupDetailFkValidateDcdId;
    @XmlElement(name = "OutSelectedPfgSetupDetailMurField")
    protected String outSelectedPfgSetupDetailMurField;
    @XmlElement(name = "OutSelectedPfgSetupDetailNeedCharCheck")
    protected String outSelectedPfgSetupDetailNeedCharCheck;
    @XmlElement(name = "OutSelectedPfgSetupDetailNeedDisabled")
    protected String outSelectedPfgSetupDetailNeedDisabled;
    @XmlElement(name = "OutSelectedPfgSetupDetailNeedMandaFunc")
    protected String outSelectedPfgSetupDetailNeedMandaFunc;
    @XmlElement(name = "OutSelectedPfgSetupDetailNeedMandatory")
    protected String outSelectedPfgSetupDetailNeedMandatory;
    @XmlElement(name = "OutSelectedPfgSetupDetailNeedMessageType")
    protected String outSelectedPfgSetupDetailNeedMessageType;
    @XmlElement(name = "OutSelectedPfgSetupDetailNeedSums")
    protected String outSelectedPfgSetupDetailNeedSums;
    @XmlElement(name = "OutSelectedPfgSetupDetailNeedValVsVal")
    protected String outSelectedPfgSetupDetailNeedValVsVal;
    @XmlElement(name = "OutSelectedPfgSetupDetailNeedValueDisable")
    protected String outSelectedPfgSetupDetailNeedValueDisable;
    @XmlElement(name = "OutSelectedPfgSetupDetailNeedValues")
    protected String outSelectedPfgSetupDetailNeedValues;
    @XmlElement(name = "OutSelectedPfgSetupDetailPrftRefNo")
    protected String outSelectedPfgSetupDetailPrftRefNo;
    @XmlElement(name = "OutSelectedPfgSetupDetailProtectedFlag")
    protected String outSelectedPfgSetupDetailProtectedFlag;
    @XmlElement(name = "OutSelectedPfgSetupDetailRefFldFlag")
    protected String outSelectedPfgSetupDetailRefFldFlag;
    @XmlElement(name = "OutSelectedPfgSetupDetailRepetativeRef")
    protected int outSelectedPfgSetupDetailRepetativeRef;
    @XmlElement(name = "OutSelectedPfgSetupDetailSetCategory")
    protected String outSelectedPfgSetupDetailSetCategory;
    @XmlElement(name = "OutSelectedPfgSetupDetailSetSn")
    protected int outSelectedPfgSetupDetailSetSn;
    @XmlElement(name = "OutSelectedPfgSetupDetailShowOrder")
    protected int outSelectedPfgSetupDetailShowOrder;
    @XmlElement(name = "OutSelectedPfgSetupDetailShowToUser")
    protected String outSelectedPfgSetupDetailShowToUser;
    @XmlElement(name = "OutSelectedPfgSetupDetailSubtagSn")
    protected short outSelectedPfgSetupDetailSubtagSn;
    @XmlElement(name = "OutSelectedPfgSetupDetailSuppressIfZero")
    protected String outSelectedPfgSetupDetailSuppressIfZero;
    @XmlElement(name = "OutSelectedPfgSetupDetailTag")
    protected String outSelectedPfgSetupDetailTag;
    @XmlElement(name = "OutSelectedPfgSetupDetailTagDescription")
    protected String outSelectedPfgSetupDetailTagDescription;
    @XmlElement(name = "OutSelectedPfgSetupDetailTagFieldFormat")
    protected String outSelectedPfgSetupDetailTagFieldFormat;
    @XmlElement(name = "OutSelectedPfgSetupDetailTagFieldType")
    protected String outSelectedPfgSetupDetailTagFieldType;
    @XmlElement(name = "OutSelectedPfgSetupDetailTagLabel")
    protected String outSelectedPfgSetupDetailTagLabel;
    @XmlElement(name = "OutSelectedPfgSetupDetailTagMandatory")
    protected String outSelectedPfgSetupDetailTagMandatory;
    @XmlElement(name = "OutSelectedPfgSetupDetailTagNextLine")
    protected String outSelectedPfgSetupDetailTagNextLine;
    @XmlElement(name = "OutSelectedPfgSetupDetailTagPriority")
    protected String outSelectedPfgSetupDetailTagPriority;
    @XmlElement(name = "OutSelectedPfgSetupDetailTagReceiver")
    protected String outSelectedPfgSetupDetailTagReceiver;
    @XmlElement(name = "OutSelectedPfgSetupDetailTagRepeatNumber")
    protected int outSelectedPfgSetupDetailTagRepeatNumber;
    @XmlElement(name = "OutSelectedPfgSetupDetailTagRepetitive")
    protected String outSelectedPfgSetupDetailTagRepetitive;
    @XmlElement(name = "OutSelectedPfgSetupDetailTagSameLine")
    protected String outSelectedPfgSetupDetailTagSameLine;
    @XmlElement(name = "OutSelectedPfgSetupDetailTagSender")
    protected String outSelectedPfgSetupDetailTagSender;
    @XmlElement(name = "OutSelectedPfgSetupDetailTagSetCode")
    protected String outSelectedPfgSetupDetailTagSetCode;
    @XmlElement(name = "OutSelectedPfgSetupDetailTagStp")
    protected String outSelectedPfgSetupDetailTagStp;
    @XmlElement(name = "OutSelectedPfgSetupDetailTagUseList")
    protected String outSelectedPfgSetupDetailTagUseList;
    @XmlElement(name = "OutSelectedPfgSetupDetailTagUseValidation")
    protected String outSelectedPfgSetupDetailTagUseValidation;
    @XmlElement(name = "OutSelectedPfgSetupDetailTagValueAndData")
    protected String outSelectedPfgSetupDetailTagValueAndData;
    @XmlElement(name = "OutSelectedPfgSetupDetailTagVerification")
    protected String outSelectedPfgSetupDetailTagVerification;
    @XmlElement(name = "OutSelectedPfgTagSetSetupDescription")
    protected String outSelectedPfgTagSetSetupDescription;
    @XmlElement(name = "OutSelectedPfgTagSetSetupSetDescription")
    protected String outSelectedPfgTagSetSetupSetDescription;
    @XmlElement(name = "OutUsedPledgeCollateralTableCDigit1")
    protected short outUsedPledgeCollateralTableCDigit1;
    @XmlElement(name = "OutUsedPledgeCollateralTableCustId1")
    protected int outUsedPledgeCollateralTableCustId1;
    @XmlElement(name = "OutUsedPledgeCollateralTableInternalSn")
    protected double outUsedPledgeCollateralTableInternalSn;
    @XmlElement(name = "OutUsedPledgeCollateralTableRecordDescr")
    protected String outUsedPledgeCollateralTableRecordDescr;
    @XmlElement(name = "OutUsedPledgeCollateralTableRecordType")
    protected String outUsedPledgeCollateralTableRecordType;
    @XmlElement(name = "OutUsedPledgeCollateralTableTagSetCode")
    protected String outUsedPledgeCollateralTableTagSetCode;
    @XmlElement(name = "OutUsedPledgeCollateralTableUsedCollatType")
    protected int outUsedPledgeCollateralTableUsedCollatType;
    @XmlElement(name = "OutUsedPledgeCollateralTableUsedUnit")
    protected int outUsedPledgeCollateralTableUsedUnit;
    @XmlElement(name = "OutGrpDocAttached")
    protected ArrayOfPFG004VOutGrpDocAttachedItem outGrpDocAttached;
    @XmlElement(name = "OutGrpError")
    protected ArrayOfPFG004VOutGrpErrorItem outGrpError;
    @XmlElement(name = "OutGrpFields")
    protected ArrayOfPFG004VOutGrpFieldsItem outGrpFields;
    @XmlElement(name = "OutGrpValues")
    protected ArrayOfPFG004VOutGrpValuesItem outGrpValues;
    @XmlElement(name = "OutSelectedPfgSetupDetailTagFieldLength")
    protected int outSelectedPfgSetupDetailTagFieldLength;
    @XmlElement(name = "OutSelectedPfgSetupDetailExactLength")
    protected String outSelectedPfgSetupDetailExactLength;

    /**
     * Gets the value of the outFullInformationCollateralTblDocDocDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFullInformationCollateralTblDocDocDescr() {
        return outFullInformationCollateralTblDocDocDescr;
    }

    /**
     * Sets the value of the outFullInformationCollateralTblDocDocDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFullInformationCollateralTblDocDocDescr(String value) {
        this.outFullInformationCollateralTblDocDocDescr = value;
    }

    /**
     * Gets the value of the outFullInformationCollateralTblDocDocDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFullInformationCollateralTblDocDocDetails() {
        return outFullInformationCollateralTblDocDocDetails;
    }

    /**
     * Sets the value of the outFullInformationCollateralTblDocDocDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFullInformationCollateralTblDocDocDetails(String value) {
        this.outFullInformationCollateralTblDocDocDetails = value;
    }

    /**
     * Gets the value of the outFullInformationCollateralTblDocEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFullInformationCollateralTblDocEntryStatus() {
        return outFullInformationCollateralTblDocEntryStatus;
    }

    /**
     * Sets the value of the outFullInformationCollateralTblDocEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFullInformationCollateralTblDocEntryStatus(String value) {
        this.outFullInformationCollateralTblDocEntryStatus = value;
    }

    /**
     * Gets the value of the outFullInformationCollateralTblDocInsertDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutFullInformationCollateralTblDocInsertDate() {
        return outFullInformationCollateralTblDocInsertDate;
    }

    /**
     * Sets the value of the outFullInformationCollateralTblDocInsertDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutFullInformationCollateralTblDocInsertDate(XMLGregorianCalendar value) {
        this.outFullInformationCollateralTblDocInsertDate = value;
    }

    /**
     * Gets the value of the outFullInformationCollateralTblDocInsertTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutFullInformationCollateralTblDocInsertTmstamp() {
        return outFullInformationCollateralTblDocInsertTmstamp;
    }

    /**
     * Sets the value of the outFullInformationCollateralTblDocInsertTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutFullInformationCollateralTblDocInsertTmstamp(XMLGregorianCalendar value) {
        this.outFullInformationCollateralTblDocInsertTmstamp = value;
    }

    /**
     * Gets the value of the outFullInformationCollateralTblDocInsertUnit property.
     * 
     */
    public int getOutFullInformationCollateralTblDocInsertUnit() {
        return outFullInformationCollateralTblDocInsertUnit;
    }

    /**
     * Sets the value of the outFullInformationCollateralTblDocInsertUnit property.
     * 
     */
    public void setOutFullInformationCollateralTblDocInsertUnit(int value) {
        this.outFullInformationCollateralTblDocInsertUnit = value;
    }

    /**
     * Gets the value of the outFullInformationCollateralTblDocInsertUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFullInformationCollateralTblDocInsertUser() {
        return outFullInformationCollateralTblDocInsertUser;
    }

    /**
     * Sets the value of the outFullInformationCollateralTblDocInsertUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFullInformationCollateralTblDocInsertUser(String value) {
        this.outFullInformationCollateralTblDocInsertUser = value;
    }

    /**
     * Gets the value of the outFullInformationCollateralTblDocInternalSn property.
     * 
     */
    public double getOutFullInformationCollateralTblDocInternalSn() {
        return outFullInformationCollateralTblDocInternalSn;
    }

    /**
     * Sets the value of the outFullInformationCollateralTblDocInternalSn property.
     * 
     */
    public void setOutFullInformationCollateralTblDocInternalSn(double value) {
        this.outFullInformationCollateralTblDocInternalSn = value;
    }

    /**
     * Gets the value of the outFullInformationCollateralTblDocPrftSys property.
     * 
     */
    public short getOutFullInformationCollateralTblDocPrftSys() {
        return outFullInformationCollateralTblDocPrftSys;
    }

    /**
     * Sets the value of the outFullInformationCollateralTblDocPrftSys property.
     * 
     */
    public void setOutFullInformationCollateralTblDocPrftSys(short value) {
        this.outFullInformationCollateralTblDocPrftSys = value;
    }

    /**
     * Gets the value of the outFullInformationCollateralTblDocRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFullInformationCollateralTblDocRecordType() {
        return outFullInformationCollateralTblDocRecordType;
    }

    /**
     * Sets the value of the outFullInformationCollateralTblDocRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFullInformationCollateralTblDocRecordType(String value) {
        this.outFullInformationCollateralTblDocRecordType = value;
    }

    /**
     * Gets the value of the outFullInformationCollateralTblDocReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFullInformationCollateralTblDocReferenceNumber() {
        return outFullInformationCollateralTblDocReferenceNumber;
    }

    /**
     * Sets the value of the outFullInformationCollateralTblDocReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFullInformationCollateralTblDocReferenceNumber(String value) {
        this.outFullInformationCollateralTblDocReferenceNumber = value;
    }

    /**
     * Gets the value of the outFullInformationCollateralTblDocUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutFullInformationCollateralTblDocUpdateDate() {
        return outFullInformationCollateralTblDocUpdateDate;
    }

    /**
     * Sets the value of the outFullInformationCollateralTblDocUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutFullInformationCollateralTblDocUpdateDate(XMLGregorianCalendar value) {
        this.outFullInformationCollateralTblDocUpdateDate = value;
    }

    /**
     * Gets the value of the outFullInformationCollateralTblDocUpdateTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutFullInformationCollateralTblDocUpdateTmstamp() {
        return outFullInformationCollateralTblDocUpdateTmstamp;
    }

    /**
     * Sets the value of the outFullInformationCollateralTblDocUpdateTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutFullInformationCollateralTblDocUpdateTmstamp(XMLGregorianCalendar value) {
        this.outFullInformationCollateralTblDocUpdateTmstamp = value;
    }

    /**
     * Gets the value of the outFullInformationCollateralTblDocUpdateUnit property.
     * 
     */
    public int getOutFullInformationCollateralTblDocUpdateUnit() {
        return outFullInformationCollateralTblDocUpdateUnit;
    }

    /**
     * Sets the value of the outFullInformationCollateralTblDocUpdateUnit property.
     * 
     */
    public void setOutFullInformationCollateralTblDocUpdateUnit(int value) {
        this.outFullInformationCollateralTblDocUpdateUnit = value;
    }

    /**
     * Gets the value of the outFullInformationCollateralTblDocUpdateUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFullInformationCollateralTblDocUpdateUser() {
        return outFullInformationCollateralTblDocUpdateUser;
    }

    /**
     * Sets the value of the outFullInformationCollateralTblDocUpdateUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFullInformationCollateralTblDocUpdateUser(String value) {
        this.outFullInformationCollateralTblDocUpdateUser = value;
    }

    /**
     * Gets the value of the outFullInsertUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFullInsertUnitUnitName() {
        return outFullInsertUnitUnitName;
    }

    /**
     * Sets the value of the outFullInsertUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFullInsertUnitUnitName(String value) {
        this.outFullInsertUnitUnitName = value;
    }

    /**
     * Gets the value of the outFullInsertUserCharSuppliedChar40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFullInsertUserCharSuppliedChar40() {
        return outFullInsertUserCharSuppliedChar40;
    }

    /**
     * Sets the value of the outFullInsertUserCharSuppliedChar40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFullInsertUserCharSuppliedChar40(String value) {
        this.outFullInsertUserCharSuppliedChar40 = value;
    }

    /**
     * Gets the value of the outFullUpdateUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFullUpdateUnitUnitName() {
        return outFullUpdateUnitUnitName;
    }

    /**
     * Sets the value of the outFullUpdateUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFullUpdateUnitUnitName(String value) {
        this.outFullUpdateUnitUnitName = value;
    }

    /**
     * Gets the value of the outFullUpdateUserCharSuppliedChar40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFullUpdateUserCharSuppliedChar40() {
        return outFullUpdateUserCharSuppliedChar40;
    }

    /**
     * Sets the value of the outFullUpdateUserCharSuppliedChar40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFullUpdateUserCharSuppliedChar40(String value) {
        this.outFullUpdateUserCharSuppliedChar40 = value;
    }

    /**
     * Gets the value of the outRetrievedToCollateralFieldsPfgSetSn property.
     * 
     */
    public int getOutRetrievedToCollateralFieldsPfgSetSn() {
        return outRetrievedToCollateralFieldsPfgSetSn;
    }

    /**
     * Sets the value of the outRetrievedToCollateralFieldsPfgSetSn property.
     * 
     */
    public void setOutRetrievedToCollateralFieldsPfgSetSn(int value) {
        this.outRetrievedToCollateralFieldsPfgSetSn = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailCheckCurrDec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailCheckCurrDec() {
        return outSelectedPfgSetupDetailCheckCurrDec;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailCheckCurrDec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailCheckCurrDec(String value) {
        this.outSelectedPfgSetupDetailCheckCurrDec = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailCheckCurrStag property.
     * 
     */
    public short getOutSelectedPfgSetupDetailCheckCurrStag() {
        return outSelectedPfgSetupDetailCheckCurrStag;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailCheckCurrStag property.
     * 
     */
    public void setOutSelectedPfgSetupDetailCheckCurrStag(short value) {
        this.outSelectedPfgSetupDetailCheckCurrStag = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailCheckCurrTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailCheckCurrTag() {
        return outSelectedPfgSetupDetailCheckCurrTag;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailCheckCurrTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailCheckCurrTag(String value) {
        this.outSelectedPfgSetupDetailCheckCurrTag = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailCheckEditProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailCheckEditProfile() {
        return outSelectedPfgSetupDetailCheckEditProfile;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailCheckEditProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailCheckEditProfile(String value) {
        this.outSelectedPfgSetupDetailCheckEditProfile = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailCheckEquality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailCheckEquality() {
        return outSelectedPfgSetupDetailCheckEquality;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailCheckEquality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailCheckEquality(String value) {
        this.outSelectedPfgSetupDetailCheckEquality = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailCheckExtCharSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailCheckExtCharSet() {
        return outSelectedPfgSetupDetailCheckExtCharSet;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailCheckExtCharSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailCheckExtCharSet(String value) {
        this.outSelectedPfgSetupDetailCheckExtCharSet = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailExceptionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailExceptionCode() {
        return outSelectedPfgSetupDetailExceptionCode;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailExceptionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailExceptionCode(String value) {
        this.outSelectedPfgSetupDetailExceptionCode = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailFkValidateDcdId property.
     * 
     */
    public double getOutSelectedPfgSetupDetailFkValidateDcdId() {
        return outSelectedPfgSetupDetailFkValidateDcdId;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailFkValidateDcdId property.
     * 
     */
    public void setOutSelectedPfgSetupDetailFkValidateDcdId(double value) {
        this.outSelectedPfgSetupDetailFkValidateDcdId = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailMurField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailMurField() {
        return outSelectedPfgSetupDetailMurField;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailMurField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailMurField(String value) {
        this.outSelectedPfgSetupDetailMurField = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailNeedCharCheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailNeedCharCheck() {
        return outSelectedPfgSetupDetailNeedCharCheck;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailNeedCharCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailNeedCharCheck(String value) {
        this.outSelectedPfgSetupDetailNeedCharCheck = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailNeedDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailNeedDisabled() {
        return outSelectedPfgSetupDetailNeedDisabled;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailNeedDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailNeedDisabled(String value) {
        this.outSelectedPfgSetupDetailNeedDisabled = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailNeedMandaFunc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailNeedMandaFunc() {
        return outSelectedPfgSetupDetailNeedMandaFunc;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailNeedMandaFunc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailNeedMandaFunc(String value) {
        this.outSelectedPfgSetupDetailNeedMandaFunc = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailNeedMandatory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailNeedMandatory() {
        return outSelectedPfgSetupDetailNeedMandatory;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailNeedMandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailNeedMandatory(String value) {
        this.outSelectedPfgSetupDetailNeedMandatory = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailNeedMessageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailNeedMessageType() {
        return outSelectedPfgSetupDetailNeedMessageType;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailNeedMessageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailNeedMessageType(String value) {
        this.outSelectedPfgSetupDetailNeedMessageType = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailNeedSums property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailNeedSums() {
        return outSelectedPfgSetupDetailNeedSums;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailNeedSums property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailNeedSums(String value) {
        this.outSelectedPfgSetupDetailNeedSums = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailNeedValVsVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailNeedValVsVal() {
        return outSelectedPfgSetupDetailNeedValVsVal;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailNeedValVsVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailNeedValVsVal(String value) {
        this.outSelectedPfgSetupDetailNeedValVsVal = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailNeedValueDisable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailNeedValueDisable() {
        return outSelectedPfgSetupDetailNeedValueDisable;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailNeedValueDisable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailNeedValueDisable(String value) {
        this.outSelectedPfgSetupDetailNeedValueDisable = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailNeedValues property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailNeedValues() {
        return outSelectedPfgSetupDetailNeedValues;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailNeedValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailNeedValues(String value) {
        this.outSelectedPfgSetupDetailNeedValues = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailPrftRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailPrftRefNo() {
        return outSelectedPfgSetupDetailPrftRefNo;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailPrftRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailPrftRefNo(String value) {
        this.outSelectedPfgSetupDetailPrftRefNo = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailProtectedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailProtectedFlag() {
        return outSelectedPfgSetupDetailProtectedFlag;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailProtectedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailProtectedFlag(String value) {
        this.outSelectedPfgSetupDetailProtectedFlag = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailRefFldFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailRefFldFlag() {
        return outSelectedPfgSetupDetailRefFldFlag;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailRefFldFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailRefFldFlag(String value) {
        this.outSelectedPfgSetupDetailRefFldFlag = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailRepetativeRef property.
     * 
     */
    public int getOutSelectedPfgSetupDetailRepetativeRef() {
        return outSelectedPfgSetupDetailRepetativeRef;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailRepetativeRef property.
     * 
     */
    public void setOutSelectedPfgSetupDetailRepetativeRef(int value) {
        this.outSelectedPfgSetupDetailRepetativeRef = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailSetCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailSetCategory() {
        return outSelectedPfgSetupDetailSetCategory;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailSetCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailSetCategory(String value) {
        this.outSelectedPfgSetupDetailSetCategory = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailSetSn property.
     * 
     */
    public int getOutSelectedPfgSetupDetailSetSn() {
        return outSelectedPfgSetupDetailSetSn;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailSetSn property.
     * 
     */
    public void setOutSelectedPfgSetupDetailSetSn(int value) {
        this.outSelectedPfgSetupDetailSetSn = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailShowOrder property.
     * 
     */
    public int getOutSelectedPfgSetupDetailShowOrder() {
        return outSelectedPfgSetupDetailShowOrder;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailShowOrder property.
     * 
     */
    public void setOutSelectedPfgSetupDetailShowOrder(int value) {
        this.outSelectedPfgSetupDetailShowOrder = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailShowToUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailShowToUser() {
        return outSelectedPfgSetupDetailShowToUser;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailShowToUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailShowToUser(String value) {
        this.outSelectedPfgSetupDetailShowToUser = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailSubtagSn property.
     * 
     */
    public short getOutSelectedPfgSetupDetailSubtagSn() {
        return outSelectedPfgSetupDetailSubtagSn;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailSubtagSn property.
     * 
     */
    public void setOutSelectedPfgSetupDetailSubtagSn(short value) {
        this.outSelectedPfgSetupDetailSubtagSn = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailSuppressIfZero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailSuppressIfZero() {
        return outSelectedPfgSetupDetailSuppressIfZero;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailSuppressIfZero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailSuppressIfZero(String value) {
        this.outSelectedPfgSetupDetailSuppressIfZero = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailTag() {
        return outSelectedPfgSetupDetailTag;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailTag(String value) {
        this.outSelectedPfgSetupDetailTag = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailTagDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailTagDescription() {
        return outSelectedPfgSetupDetailTagDescription;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailTagDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailTagDescription(String value) {
        this.outSelectedPfgSetupDetailTagDescription = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailTagFieldFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailTagFieldFormat() {
        return outSelectedPfgSetupDetailTagFieldFormat;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailTagFieldFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailTagFieldFormat(String value) {
        this.outSelectedPfgSetupDetailTagFieldFormat = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailTagFieldType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailTagFieldType() {
        return outSelectedPfgSetupDetailTagFieldType;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailTagFieldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailTagFieldType(String value) {
        this.outSelectedPfgSetupDetailTagFieldType = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailTagLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailTagLabel() {
        return outSelectedPfgSetupDetailTagLabel;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailTagLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailTagLabel(String value) {
        this.outSelectedPfgSetupDetailTagLabel = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailTagMandatory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailTagMandatory() {
        return outSelectedPfgSetupDetailTagMandatory;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailTagMandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailTagMandatory(String value) {
        this.outSelectedPfgSetupDetailTagMandatory = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailTagNextLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailTagNextLine() {
        return outSelectedPfgSetupDetailTagNextLine;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailTagNextLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailTagNextLine(String value) {
        this.outSelectedPfgSetupDetailTagNextLine = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailTagPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailTagPriority() {
        return outSelectedPfgSetupDetailTagPriority;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailTagPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailTagPriority(String value) {
        this.outSelectedPfgSetupDetailTagPriority = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailTagReceiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailTagReceiver() {
        return outSelectedPfgSetupDetailTagReceiver;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailTagReceiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailTagReceiver(String value) {
        this.outSelectedPfgSetupDetailTagReceiver = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailTagRepeatNumber property.
     * 
     */
    public int getOutSelectedPfgSetupDetailTagRepeatNumber() {
        return outSelectedPfgSetupDetailTagRepeatNumber;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailTagRepeatNumber property.
     * 
     */
    public void setOutSelectedPfgSetupDetailTagRepeatNumber(int value) {
        this.outSelectedPfgSetupDetailTagRepeatNumber = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailTagRepetitive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailTagRepetitive() {
        return outSelectedPfgSetupDetailTagRepetitive;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailTagRepetitive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailTagRepetitive(String value) {
        this.outSelectedPfgSetupDetailTagRepetitive = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailTagSameLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailTagSameLine() {
        return outSelectedPfgSetupDetailTagSameLine;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailTagSameLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailTagSameLine(String value) {
        this.outSelectedPfgSetupDetailTagSameLine = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailTagSender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailTagSender() {
        return outSelectedPfgSetupDetailTagSender;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailTagSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailTagSender(String value) {
        this.outSelectedPfgSetupDetailTagSender = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailTagSetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailTagSetCode() {
        return outSelectedPfgSetupDetailTagSetCode;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailTagSetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailTagSetCode(String value) {
        this.outSelectedPfgSetupDetailTagSetCode = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailTagStp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailTagStp() {
        return outSelectedPfgSetupDetailTagStp;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailTagStp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailTagStp(String value) {
        this.outSelectedPfgSetupDetailTagStp = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailTagUseList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailTagUseList() {
        return outSelectedPfgSetupDetailTagUseList;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailTagUseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailTagUseList(String value) {
        this.outSelectedPfgSetupDetailTagUseList = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailTagUseValidation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailTagUseValidation() {
        return outSelectedPfgSetupDetailTagUseValidation;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailTagUseValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailTagUseValidation(String value) {
        this.outSelectedPfgSetupDetailTagUseValidation = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailTagValueAndData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailTagValueAndData() {
        return outSelectedPfgSetupDetailTagValueAndData;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailTagValueAndData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailTagValueAndData(String value) {
        this.outSelectedPfgSetupDetailTagValueAndData = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailTagVerification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailTagVerification() {
        return outSelectedPfgSetupDetailTagVerification;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailTagVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailTagVerification(String value) {
        this.outSelectedPfgSetupDetailTagVerification = value;
    }

    /**
     * Gets the value of the outSelectedPfgTagSetSetupDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgTagSetSetupDescription() {
        return outSelectedPfgTagSetSetupDescription;
    }

    /**
     * Sets the value of the outSelectedPfgTagSetSetupDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgTagSetSetupDescription(String value) {
        this.outSelectedPfgTagSetSetupDescription = value;
    }

    /**
     * Gets the value of the outSelectedPfgTagSetSetupSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgTagSetSetupSetDescription() {
        return outSelectedPfgTagSetSetupSetDescription;
    }

    /**
     * Sets the value of the outSelectedPfgTagSetSetupSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgTagSetSetupSetDescription(String value) {
        this.outSelectedPfgTagSetSetupSetDescription = value;
    }

    /**
     * Gets the value of the outUsedPledgeCollateralTableCDigit1 property.
     * 
     */
    public short getOutUsedPledgeCollateralTableCDigit1() {
        return outUsedPledgeCollateralTableCDigit1;
    }

    /**
     * Sets the value of the outUsedPledgeCollateralTableCDigit1 property.
     * 
     */
    public void setOutUsedPledgeCollateralTableCDigit1(short value) {
        this.outUsedPledgeCollateralTableCDigit1 = value;
    }

    /**
     * Gets the value of the outUsedPledgeCollateralTableCustId1 property.
     * 
     */
    public int getOutUsedPledgeCollateralTableCustId1() {
        return outUsedPledgeCollateralTableCustId1;
    }

    /**
     * Sets the value of the outUsedPledgeCollateralTableCustId1 property.
     * 
     */
    public void setOutUsedPledgeCollateralTableCustId1(int value) {
        this.outUsedPledgeCollateralTableCustId1 = value;
    }

    /**
     * Gets the value of the outUsedPledgeCollateralTableInternalSn property.
     * 
     */
    public double getOutUsedPledgeCollateralTableInternalSn() {
        return outUsedPledgeCollateralTableInternalSn;
    }

    /**
     * Sets the value of the outUsedPledgeCollateralTableInternalSn property.
     * 
     */
    public void setOutUsedPledgeCollateralTableInternalSn(double value) {
        this.outUsedPledgeCollateralTableInternalSn = value;
    }

    /**
     * Gets the value of the outUsedPledgeCollateralTableRecordDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUsedPledgeCollateralTableRecordDescr() {
        return outUsedPledgeCollateralTableRecordDescr;
    }

    /**
     * Sets the value of the outUsedPledgeCollateralTableRecordDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUsedPledgeCollateralTableRecordDescr(String value) {
        this.outUsedPledgeCollateralTableRecordDescr = value;
    }

    /**
     * Gets the value of the outUsedPledgeCollateralTableRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUsedPledgeCollateralTableRecordType() {
        return outUsedPledgeCollateralTableRecordType;
    }

    /**
     * Sets the value of the outUsedPledgeCollateralTableRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUsedPledgeCollateralTableRecordType(String value) {
        this.outUsedPledgeCollateralTableRecordType = value;
    }

    /**
     * Gets the value of the outUsedPledgeCollateralTableTagSetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUsedPledgeCollateralTableTagSetCode() {
        return outUsedPledgeCollateralTableTagSetCode;
    }

    /**
     * Sets the value of the outUsedPledgeCollateralTableTagSetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUsedPledgeCollateralTableTagSetCode(String value) {
        this.outUsedPledgeCollateralTableTagSetCode = value;
    }

    /**
     * Gets the value of the outUsedPledgeCollateralTableUsedCollatType property.
     * 
     */
    public int getOutUsedPledgeCollateralTableUsedCollatType() {
        return outUsedPledgeCollateralTableUsedCollatType;
    }

    /**
     * Sets the value of the outUsedPledgeCollateralTableUsedCollatType property.
     * 
     */
    public void setOutUsedPledgeCollateralTableUsedCollatType(int value) {
        this.outUsedPledgeCollateralTableUsedCollatType = value;
    }

    /**
     * Gets the value of the outUsedPledgeCollateralTableUsedUnit property.
     * 
     */
    public int getOutUsedPledgeCollateralTableUsedUnit() {
        return outUsedPledgeCollateralTableUsedUnit;
    }

    /**
     * Sets the value of the outUsedPledgeCollateralTableUsedUnit property.
     * 
     */
    public void setOutUsedPledgeCollateralTableUsedUnit(int value) {
        this.outUsedPledgeCollateralTableUsedUnit = value;
    }

    /**
     * Gets the value of the outGrpDocAttached property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPFG004VOutGrpDocAttachedItem }
     *     
     */
    public ArrayOfPFG004VOutGrpDocAttachedItem getOutGrpDocAttached() {
        return outGrpDocAttached;
    }

    /**
     * Sets the value of the outGrpDocAttached property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPFG004VOutGrpDocAttachedItem }
     *     
     */
    public void setOutGrpDocAttached(ArrayOfPFG004VOutGrpDocAttachedItem value) {
        this.outGrpDocAttached = value;
    }

    /**
     * Gets the value of the outGrpError property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPFG004VOutGrpErrorItem }
     *     
     */
    public ArrayOfPFG004VOutGrpErrorItem getOutGrpError() {
        return outGrpError;
    }

    /**
     * Sets the value of the outGrpError property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPFG004VOutGrpErrorItem }
     *     
     */
    public void setOutGrpError(ArrayOfPFG004VOutGrpErrorItem value) {
        this.outGrpError = value;
    }

    /**
     * Gets the value of the outGrpFields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPFG004VOutGrpFieldsItem }
     *     
     */
    public ArrayOfPFG004VOutGrpFieldsItem getOutGrpFields() {
        return outGrpFields;
    }

    /**
     * Sets the value of the outGrpFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPFG004VOutGrpFieldsItem }
     *     
     */
    public void setOutGrpFields(ArrayOfPFG004VOutGrpFieldsItem value) {
        this.outGrpFields = value;
    }

    /**
     * Gets the value of the outGrpValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPFG004VOutGrpValuesItem }
     *     
     */
    public ArrayOfPFG004VOutGrpValuesItem getOutGrpValues() {
        return outGrpValues;
    }

    /**
     * Sets the value of the outGrpValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPFG004VOutGrpValuesItem }
     *     
     */
    public void setOutGrpValues(ArrayOfPFG004VOutGrpValuesItem value) {
        this.outGrpValues = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailTagFieldLength property.
     * 
     */
    public int getOutSelectedPfgSetupDetailTagFieldLength() {
        return outSelectedPfgSetupDetailTagFieldLength;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailTagFieldLength property.
     * 
     */
    public void setOutSelectedPfgSetupDetailTagFieldLength(int value) {
        this.outSelectedPfgSetupDetailTagFieldLength = value;
    }

    /**
     * Gets the value of the outSelectedPfgSetupDetailExactLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgSetupDetailExactLength() {
        return outSelectedPfgSetupDetailExactLength;
    }

    /**
     * Sets the value of the outSelectedPfgSetupDetailExactLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgSetupDetailExactLength(String value) {
        this.outSelectedPfgSetupDetailExactLength = value;
    }

}
