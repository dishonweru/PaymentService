
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for G0501VGlAccountValidationImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="G0501VGlAccountValidationImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAssLiabChangeIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthorGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBalTypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBalTypeGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBalTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBalshTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBistaGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBistaGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCategUnitGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCategUnitGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGlgAccountAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountBopFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountBopGroupAccount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGlgAccountCentralFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountDbCrBalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountDeactivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGlgAccountDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountDsubTrnFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountEvalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountFcconvFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountLastUpdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGlgAccountLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountMandAdditionalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountMandCustInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountModifyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGlgAccountOpenDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGlgAccountOptionalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountPositionFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountRealTimeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountReconFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountReconRunDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGlgAccountReconStartDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGlgAccountSecLevel" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGlgAccountShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountSubsConsFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountSubsidCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGlgAccountTimestmp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGlgAccountUnitAppliedFor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountUnitRealTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountUpdateWayInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountUpdatedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountValeurDateFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountValeurFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountDeleteGlgAccountAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountDeleteGlgAccountTimestmp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGlgAccountPkeyGlgAccountAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgHCurrGroupCurrGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLogMntRecordingAuthorizer1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingAuthorizer2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPermitUnitGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPermitUnitGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPrctpGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrctpGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSubsGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSubsGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTeamInformationJustificationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTeamInformationJustificationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTeamInformationProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTeamInformationProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTeamInformationTeamComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTeamInformationTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTeamInformationTransactionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTeamInformationUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTeamInformationUserTerminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "G0501VGlAccountValidationImport", propOrder = {
    "command",
    "inAssLiabChangeIefSuppliedChar1",
    "inAuthorGrantedIefSuppliedFlag",
    "inBalTypeGenericDetailDescription",
    "inBalTypeGenericDetailParameterType",
    "inBalTypeGenericDetailSerialNum",
    "inBalshTypeGenericDetailSerialNum",
    "inBistaGenericDetailDescription",
    "inBistaGenericDetailSerialNum",
    "inCategUnitGenericDetailDescription",
    "inCategUnitGenericDetailSerialNum",
    "inGlgAccountAccountId",
    "inGlgAccountBopFlg",
    "inGlgAccountBopGroupAccount",
    "inGlgAccountCentralFlag",
    "inGlgAccountDbCrBalFlag",
    "inGlgAccountDeactivationDate",
    "inGlgAccountDescr",
    "inGlgAccountDsubTrnFlag",
    "inGlgAccountEvalFlag",
    "inGlgAccountFcconvFlag",
    "inGlgAccountLastUpdDate",
    "inGlgAccountLevel",
    "inGlgAccountMandAdditionalInfo",
    "inGlgAccountMandCustInfo",
    "inGlgAccountModifyDate",
    "inGlgAccountOpenDate",
    "inGlgAccountOptionalFlag",
    "inGlgAccountPositionFlag",
    "inGlgAccountRealTimeFlag",
    "inGlgAccountReconFlag",
    "inGlgAccountReconRunDt",
    "inGlgAccountReconStartDt",
    "inGlgAccountSecLevel",
    "inGlgAccountShortDescr",
    "inGlgAccountState",
    "inGlgAccountStatus",
    "inGlgAccountSubsConsFlag",
    "inGlgAccountSubsidCount",
    "inGlgAccountTimestmp",
    "inGlgAccountUnitAppliedFor",
    "inGlgAccountUnitRealTime",
    "inGlgAccountUpdateWayInd",
    "inGlgAccountUpdatedFlag",
    "inGlgAccountValeurDateFlag",
    "inGlgAccountValeurFlg",
    "inGlgAccountDeleteGlgAccountAccountId",
    "inGlgAccountDeleteGlgAccountTimestmp",
    "inGlgAccountPkeyGlgAccountAccountId",
    "inGlgHCurrGroupCurrGroupId",
    "inJustificIdJustific",
    "inLogMntRecordingAuthorizer1",
    "inLogMntRecordingAuthorizer2",
    "inLogMntRecordingReversalFlag",
    "inLogMntRecordingTerminalNumber",
    "inLogMntRecordingTrxCode",
    "inPermitUnitGenericDetailDescription",
    "inPermitUnitGenericDetailSerialNum",
    "inPrctpGenericDetailDescription",
    "inPrctpGenericDetailSerialNum",
    "inPrftTransactionIdTransact",
    "inProductIdProduct",
    "inSubsGenericDetailDescription",
    "inSubsGenericDetailSerialNum",
    "inTeamInformationJustificationDescription",
    "inTeamInformationJustificationId",
    "inTeamInformationProductDescription",
    "inTeamInformationProductId",
    "inTeamInformationTeamComments",
    "inTeamInformationTransactionDescription",
    "inTeamInformationTransactionId",
    "inTeamInformationUnitCode",
    "inTeamInformationUserTerminalId"
})
public class G0501VGlAccountValidationImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InAssLiabChangeIefSuppliedChar1")
    protected String inAssLiabChangeIefSuppliedChar1;
    @XmlElement(name = "InAuthorGrantedIefSuppliedFlag")
    protected String inAuthorGrantedIefSuppliedFlag;
    @XmlElement(name = "InBalTypeGenericDetailDescription")
    protected String inBalTypeGenericDetailDescription;
    @XmlElement(name = "InBalTypeGenericDetailParameterType")
    protected String inBalTypeGenericDetailParameterType;
    @XmlElement(name = "InBalTypeGenericDetailSerialNum")
    protected int inBalTypeGenericDetailSerialNum;
    @XmlElement(name = "InBalshTypeGenericDetailSerialNum")
    protected int inBalshTypeGenericDetailSerialNum;
    @XmlElement(name = "InBistaGenericDetailDescription")
    protected String inBistaGenericDetailDescription;
    @XmlElement(name = "InBistaGenericDetailSerialNum")
    protected int inBistaGenericDetailSerialNum;
    @XmlElement(name = "InCategUnitGenericDetailDescription")
    protected String inCategUnitGenericDetailDescription;
    @XmlElement(name = "InCategUnitGenericDetailSerialNum")
    protected int inCategUnitGenericDetailSerialNum;
    @XmlElement(name = "InGlgAccountAccountId")
    protected String inGlgAccountAccountId;
    @XmlElement(name = "InGlgAccountBopFlg")
    protected String inGlgAccountBopFlg;
    @XmlElement(name = "InGlgAccountBopGroupAccount")
    protected int inGlgAccountBopGroupAccount;
    @XmlElement(name = "InGlgAccountCentralFlag")
    protected String inGlgAccountCentralFlag;
    @XmlElement(name = "InGlgAccountDbCrBalFlag")
    protected String inGlgAccountDbCrBalFlag;
    @XmlElement(name = "InGlgAccountDeactivationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGlgAccountDeactivationDate;
    @XmlElement(name = "InGlgAccountDescr")
    protected String inGlgAccountDescr;
    @XmlElement(name = "InGlgAccountDsubTrnFlag")
    protected String inGlgAccountDsubTrnFlag;
    @XmlElement(name = "InGlgAccountEvalFlag")
    protected String inGlgAccountEvalFlag;
    @XmlElement(name = "InGlgAccountFcconvFlag")
    protected String inGlgAccountFcconvFlag;
    @XmlElement(name = "InGlgAccountLastUpdDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGlgAccountLastUpdDate;
    @XmlElement(name = "InGlgAccountLevel")
    protected String inGlgAccountLevel;
    @XmlElement(name = "InGlgAccountMandAdditionalInfo")
    protected String inGlgAccountMandAdditionalInfo;
    @XmlElement(name = "InGlgAccountMandCustInfo")
    protected String inGlgAccountMandCustInfo;
    @XmlElement(name = "InGlgAccountModifyDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGlgAccountModifyDate;
    @XmlElement(name = "InGlgAccountOpenDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGlgAccountOpenDate;
    @XmlElement(name = "InGlgAccountOptionalFlag")
    protected String inGlgAccountOptionalFlag;
    @XmlElement(name = "InGlgAccountPositionFlag")
    protected String inGlgAccountPositionFlag;
    @XmlElement(name = "InGlgAccountRealTimeFlag")
    protected String inGlgAccountRealTimeFlag;
    @XmlElement(name = "InGlgAccountReconFlag")
    protected String inGlgAccountReconFlag;
    @XmlElement(name = "InGlgAccountReconRunDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGlgAccountReconRunDt;
    @XmlElement(name = "InGlgAccountReconStartDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGlgAccountReconStartDt;
    @XmlElement(name = "InGlgAccountSecLevel")
    protected short inGlgAccountSecLevel;
    @XmlElement(name = "InGlgAccountShortDescr")
    protected String inGlgAccountShortDescr;
    @XmlElement(name = "InGlgAccountState")
    protected String inGlgAccountState;
    @XmlElement(name = "InGlgAccountStatus")
    protected String inGlgAccountStatus;
    @XmlElement(name = "InGlgAccountSubsConsFlag")
    protected String inGlgAccountSubsConsFlag;
    @XmlElement(name = "InGlgAccountSubsidCount")
    protected int inGlgAccountSubsidCount;
    @XmlElement(name = "InGlgAccountTimestmp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGlgAccountTimestmp;
    @XmlElement(name = "InGlgAccountUnitAppliedFor")
    protected String inGlgAccountUnitAppliedFor;
    @XmlElement(name = "InGlgAccountUnitRealTime")
    protected String inGlgAccountUnitRealTime;
    @XmlElement(name = "InGlgAccountUpdateWayInd")
    protected String inGlgAccountUpdateWayInd;
    @XmlElement(name = "InGlgAccountUpdatedFlag")
    protected String inGlgAccountUpdatedFlag;
    @XmlElement(name = "InGlgAccountValeurDateFlag")
    protected String inGlgAccountValeurDateFlag;
    @XmlElement(name = "InGlgAccountValeurFlg")
    protected String inGlgAccountValeurFlg;
    @XmlElement(name = "InGlgAccountDeleteGlgAccountAccountId")
    protected String inGlgAccountDeleteGlgAccountAccountId;
    @XmlElement(name = "InGlgAccountDeleteGlgAccountTimestmp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGlgAccountDeleteGlgAccountTimestmp;
    @XmlElement(name = "InGlgAccountPkeyGlgAccountAccountId")
    protected String inGlgAccountPkeyGlgAccountAccountId;
    @XmlElement(name = "InGlgHCurrGroupCurrGroupId")
    protected String inGlgHCurrGroupCurrGroupId;
    @XmlElement(name = "InJustificIdJustific")
    protected int inJustificIdJustific;
    @XmlElement(name = "InLogMntRecordingAuthorizer1")
    protected String inLogMntRecordingAuthorizer1;
    @XmlElement(name = "InLogMntRecordingAuthorizer2")
    protected String inLogMntRecordingAuthorizer2;
    @XmlElement(name = "InLogMntRecordingReversalFlag")
    protected String inLogMntRecordingReversalFlag;
    @XmlElement(name = "InLogMntRecordingTerminalNumber")
    protected String inLogMntRecordingTerminalNumber;
    @XmlElement(name = "InLogMntRecordingTrxCode")
    protected int inLogMntRecordingTrxCode;
    @XmlElement(name = "InPermitUnitGenericDetailDescription")
    protected String inPermitUnitGenericDetailDescription;
    @XmlElement(name = "InPermitUnitGenericDetailSerialNum")
    protected int inPermitUnitGenericDetailSerialNum;
    @XmlElement(name = "InPrctpGenericDetailDescription")
    protected String inPrctpGenericDetailDescription;
    @XmlElement(name = "InPrctpGenericDetailSerialNum")
    protected int inPrctpGenericDetailSerialNum;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InProductIdProduct")
    protected int inProductIdProduct;
    @XmlElement(name = "InSubsGenericDetailDescription")
    protected String inSubsGenericDetailDescription;
    @XmlElement(name = "InSubsGenericDetailSerialNum")
    protected int inSubsGenericDetailSerialNum;
    @XmlElement(name = "InTeamInformationJustificationDescription")
    protected String inTeamInformationJustificationDescription;
    @XmlElement(name = "InTeamInformationJustificationId")
    protected int inTeamInformationJustificationId;
    @XmlElement(name = "InTeamInformationProductDescription")
    protected String inTeamInformationProductDescription;
    @XmlElement(name = "InTeamInformationProductId")
    protected int inTeamInformationProductId;
    @XmlElement(name = "InTeamInformationTeamComments")
    protected String inTeamInformationTeamComments;
    @XmlElement(name = "InTeamInformationTransactionDescription")
    protected String inTeamInformationTransactionDescription;
    @XmlElement(name = "InTeamInformationTransactionId")
    protected int inTeamInformationTransactionId;
    @XmlElement(name = "InTeamInformationUnitCode")
    protected int inTeamInformationUnitCode;
    @XmlElement(name = "InTeamInformationUserTerminalId")
    protected String inTeamInformationUserTerminalId;

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommand(String value) {
        this.command = value;
    }

    /**
     * Gets the value of the inAssLiabChangeIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAssLiabChangeIefSuppliedChar1() {
        return inAssLiabChangeIefSuppliedChar1;
    }

    /**
     * Sets the value of the inAssLiabChangeIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAssLiabChangeIefSuppliedChar1(String value) {
        this.inAssLiabChangeIefSuppliedChar1 = value;
    }

    /**
     * Gets the value of the inAuthorGrantedIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthorGrantedIefSuppliedFlag() {
        return inAuthorGrantedIefSuppliedFlag;
    }

    /**
     * Sets the value of the inAuthorGrantedIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthorGrantedIefSuppliedFlag(String value) {
        this.inAuthorGrantedIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inBalTypeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBalTypeGenericDetailDescription() {
        return inBalTypeGenericDetailDescription;
    }

    /**
     * Sets the value of the inBalTypeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBalTypeGenericDetailDescription(String value) {
        this.inBalTypeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inBalTypeGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBalTypeGenericDetailParameterType() {
        return inBalTypeGenericDetailParameterType;
    }

    /**
     * Sets the value of the inBalTypeGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBalTypeGenericDetailParameterType(String value) {
        this.inBalTypeGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inBalTypeGenericDetailSerialNum property.
     * 
     */
    public int getInBalTypeGenericDetailSerialNum() {
        return inBalTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inBalTypeGenericDetailSerialNum property.
     * 
     */
    public void setInBalTypeGenericDetailSerialNum(int value) {
        this.inBalTypeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inBalshTypeGenericDetailSerialNum property.
     * 
     */
    public int getInBalshTypeGenericDetailSerialNum() {
        return inBalshTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inBalshTypeGenericDetailSerialNum property.
     * 
     */
    public void setInBalshTypeGenericDetailSerialNum(int value) {
        this.inBalshTypeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inBistaGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBistaGenericDetailDescription() {
        return inBistaGenericDetailDescription;
    }

    /**
     * Sets the value of the inBistaGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBistaGenericDetailDescription(String value) {
        this.inBistaGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inBistaGenericDetailSerialNum property.
     * 
     */
    public int getInBistaGenericDetailSerialNum() {
        return inBistaGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inBistaGenericDetailSerialNum property.
     * 
     */
    public void setInBistaGenericDetailSerialNum(int value) {
        this.inBistaGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inCategUnitGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCategUnitGenericDetailDescription() {
        return inCategUnitGenericDetailDescription;
    }

    /**
     * Sets the value of the inCategUnitGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCategUnitGenericDetailDescription(String value) {
        this.inCategUnitGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inCategUnitGenericDetailSerialNum property.
     * 
     */
    public int getInCategUnitGenericDetailSerialNum() {
        return inCategUnitGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inCategUnitGenericDetailSerialNum property.
     * 
     */
    public void setInCategUnitGenericDetailSerialNum(int value) {
        this.inCategUnitGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inGlgAccountAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGlgAccountAccountId() {
        return inGlgAccountAccountId;
    }

    /**
     * Sets the value of the inGlgAccountAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGlgAccountAccountId(String value) {
        this.inGlgAccountAccountId = value;
    }

    /**
     * Gets the value of the inGlgAccountBopFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGlgAccountBopFlg() {
        return inGlgAccountBopFlg;
    }

    /**
     * Sets the value of the inGlgAccountBopFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGlgAccountBopFlg(String value) {
        this.inGlgAccountBopFlg = value;
    }

    /**
     * Gets the value of the inGlgAccountBopGroupAccount property.
     * 
     */
    public int getInGlgAccountBopGroupAccount() {
        return inGlgAccountBopGroupAccount;
    }

    /**
     * Sets the value of the inGlgAccountBopGroupAccount property.
     * 
     */
    public void setInGlgAccountBopGroupAccount(int value) {
        this.inGlgAccountBopGroupAccount = value;
    }

    /**
     * Gets the value of the inGlgAccountCentralFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGlgAccountCentralFlag() {
        return inGlgAccountCentralFlag;
    }

    /**
     * Sets the value of the inGlgAccountCentralFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGlgAccountCentralFlag(String value) {
        this.inGlgAccountCentralFlag = value;
    }

    /**
     * Gets the value of the inGlgAccountDbCrBalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGlgAccountDbCrBalFlag() {
        return inGlgAccountDbCrBalFlag;
    }

    /**
     * Sets the value of the inGlgAccountDbCrBalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGlgAccountDbCrBalFlag(String value) {
        this.inGlgAccountDbCrBalFlag = value;
    }

    /**
     * Gets the value of the inGlgAccountDeactivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGlgAccountDeactivationDate() {
        return inGlgAccountDeactivationDate;
    }

    /**
     * Sets the value of the inGlgAccountDeactivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGlgAccountDeactivationDate(XMLGregorianCalendar value) {
        this.inGlgAccountDeactivationDate = value;
    }

    /**
     * Gets the value of the inGlgAccountDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGlgAccountDescr() {
        return inGlgAccountDescr;
    }

    /**
     * Sets the value of the inGlgAccountDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGlgAccountDescr(String value) {
        this.inGlgAccountDescr = value;
    }

    /**
     * Gets the value of the inGlgAccountDsubTrnFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGlgAccountDsubTrnFlag() {
        return inGlgAccountDsubTrnFlag;
    }

    /**
     * Sets the value of the inGlgAccountDsubTrnFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGlgAccountDsubTrnFlag(String value) {
        this.inGlgAccountDsubTrnFlag = value;
    }

    /**
     * Gets the value of the inGlgAccountEvalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGlgAccountEvalFlag() {
        return inGlgAccountEvalFlag;
    }

    /**
     * Sets the value of the inGlgAccountEvalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGlgAccountEvalFlag(String value) {
        this.inGlgAccountEvalFlag = value;
    }

    /**
     * Gets the value of the inGlgAccountFcconvFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGlgAccountFcconvFlag() {
        return inGlgAccountFcconvFlag;
    }

    /**
     * Sets the value of the inGlgAccountFcconvFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGlgAccountFcconvFlag(String value) {
        this.inGlgAccountFcconvFlag = value;
    }

    /**
     * Gets the value of the inGlgAccountLastUpdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGlgAccountLastUpdDate() {
        return inGlgAccountLastUpdDate;
    }

    /**
     * Sets the value of the inGlgAccountLastUpdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGlgAccountLastUpdDate(XMLGregorianCalendar value) {
        this.inGlgAccountLastUpdDate = value;
    }

    /**
     * Gets the value of the inGlgAccountLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGlgAccountLevel() {
        return inGlgAccountLevel;
    }

    /**
     * Sets the value of the inGlgAccountLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGlgAccountLevel(String value) {
        this.inGlgAccountLevel = value;
    }

    /**
     * Gets the value of the inGlgAccountMandAdditionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGlgAccountMandAdditionalInfo() {
        return inGlgAccountMandAdditionalInfo;
    }

    /**
     * Sets the value of the inGlgAccountMandAdditionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGlgAccountMandAdditionalInfo(String value) {
        this.inGlgAccountMandAdditionalInfo = value;
    }

    /**
     * Gets the value of the inGlgAccountMandCustInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGlgAccountMandCustInfo() {
        return inGlgAccountMandCustInfo;
    }

    /**
     * Sets the value of the inGlgAccountMandCustInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGlgAccountMandCustInfo(String value) {
        this.inGlgAccountMandCustInfo = value;
    }

    /**
     * Gets the value of the inGlgAccountModifyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGlgAccountModifyDate() {
        return inGlgAccountModifyDate;
    }

    /**
     * Sets the value of the inGlgAccountModifyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGlgAccountModifyDate(XMLGregorianCalendar value) {
        this.inGlgAccountModifyDate = value;
    }

    /**
     * Gets the value of the inGlgAccountOpenDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGlgAccountOpenDate() {
        return inGlgAccountOpenDate;
    }

    /**
     * Sets the value of the inGlgAccountOpenDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGlgAccountOpenDate(XMLGregorianCalendar value) {
        this.inGlgAccountOpenDate = value;
    }

    /**
     * Gets the value of the inGlgAccountOptionalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGlgAccountOptionalFlag() {
        return inGlgAccountOptionalFlag;
    }

    /**
     * Sets the value of the inGlgAccountOptionalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGlgAccountOptionalFlag(String value) {
        this.inGlgAccountOptionalFlag = value;
    }

    /**
     * Gets the value of the inGlgAccountPositionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGlgAccountPositionFlag() {
        return inGlgAccountPositionFlag;
    }

    /**
     * Sets the value of the inGlgAccountPositionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGlgAccountPositionFlag(String value) {
        this.inGlgAccountPositionFlag = value;
    }

    /**
     * Gets the value of the inGlgAccountRealTimeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGlgAccountRealTimeFlag() {
        return inGlgAccountRealTimeFlag;
    }

    /**
     * Sets the value of the inGlgAccountRealTimeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGlgAccountRealTimeFlag(String value) {
        this.inGlgAccountRealTimeFlag = value;
    }

    /**
     * Gets the value of the inGlgAccountReconFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGlgAccountReconFlag() {
        return inGlgAccountReconFlag;
    }

    /**
     * Sets the value of the inGlgAccountReconFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGlgAccountReconFlag(String value) {
        this.inGlgAccountReconFlag = value;
    }

    /**
     * Gets the value of the inGlgAccountReconRunDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGlgAccountReconRunDt() {
        return inGlgAccountReconRunDt;
    }

    /**
     * Sets the value of the inGlgAccountReconRunDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGlgAccountReconRunDt(XMLGregorianCalendar value) {
        this.inGlgAccountReconRunDt = value;
    }

    /**
     * Gets the value of the inGlgAccountReconStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGlgAccountReconStartDt() {
        return inGlgAccountReconStartDt;
    }

    /**
     * Sets the value of the inGlgAccountReconStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGlgAccountReconStartDt(XMLGregorianCalendar value) {
        this.inGlgAccountReconStartDt = value;
    }

    /**
     * Gets the value of the inGlgAccountSecLevel property.
     * 
     */
    public short getInGlgAccountSecLevel() {
        return inGlgAccountSecLevel;
    }

    /**
     * Sets the value of the inGlgAccountSecLevel property.
     * 
     */
    public void setInGlgAccountSecLevel(short value) {
        this.inGlgAccountSecLevel = value;
    }

    /**
     * Gets the value of the inGlgAccountShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGlgAccountShortDescr() {
        return inGlgAccountShortDescr;
    }

    /**
     * Sets the value of the inGlgAccountShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGlgAccountShortDescr(String value) {
        this.inGlgAccountShortDescr = value;
    }

    /**
     * Gets the value of the inGlgAccountState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGlgAccountState() {
        return inGlgAccountState;
    }

    /**
     * Sets the value of the inGlgAccountState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGlgAccountState(String value) {
        this.inGlgAccountState = value;
    }

    /**
     * Gets the value of the inGlgAccountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGlgAccountStatus() {
        return inGlgAccountStatus;
    }

    /**
     * Sets the value of the inGlgAccountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGlgAccountStatus(String value) {
        this.inGlgAccountStatus = value;
    }

    /**
     * Gets the value of the inGlgAccountSubsConsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGlgAccountSubsConsFlag() {
        return inGlgAccountSubsConsFlag;
    }

    /**
     * Sets the value of the inGlgAccountSubsConsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGlgAccountSubsConsFlag(String value) {
        this.inGlgAccountSubsConsFlag = value;
    }

    /**
     * Gets the value of the inGlgAccountSubsidCount property.
     * 
     */
    public int getInGlgAccountSubsidCount() {
        return inGlgAccountSubsidCount;
    }

    /**
     * Sets the value of the inGlgAccountSubsidCount property.
     * 
     */
    public void setInGlgAccountSubsidCount(int value) {
        this.inGlgAccountSubsidCount = value;
    }

    /**
     * Gets the value of the inGlgAccountTimestmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGlgAccountTimestmp() {
        return inGlgAccountTimestmp;
    }

    /**
     * Sets the value of the inGlgAccountTimestmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGlgAccountTimestmp(XMLGregorianCalendar value) {
        this.inGlgAccountTimestmp = value;
    }

    /**
     * Gets the value of the inGlgAccountUnitAppliedFor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGlgAccountUnitAppliedFor() {
        return inGlgAccountUnitAppliedFor;
    }

    /**
     * Sets the value of the inGlgAccountUnitAppliedFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGlgAccountUnitAppliedFor(String value) {
        this.inGlgAccountUnitAppliedFor = value;
    }

    /**
     * Gets the value of the inGlgAccountUnitRealTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGlgAccountUnitRealTime() {
        return inGlgAccountUnitRealTime;
    }

    /**
     * Sets the value of the inGlgAccountUnitRealTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGlgAccountUnitRealTime(String value) {
        this.inGlgAccountUnitRealTime = value;
    }

    /**
     * Gets the value of the inGlgAccountUpdateWayInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGlgAccountUpdateWayInd() {
        return inGlgAccountUpdateWayInd;
    }

    /**
     * Sets the value of the inGlgAccountUpdateWayInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGlgAccountUpdateWayInd(String value) {
        this.inGlgAccountUpdateWayInd = value;
    }

    /**
     * Gets the value of the inGlgAccountUpdatedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGlgAccountUpdatedFlag() {
        return inGlgAccountUpdatedFlag;
    }

    /**
     * Sets the value of the inGlgAccountUpdatedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGlgAccountUpdatedFlag(String value) {
        this.inGlgAccountUpdatedFlag = value;
    }

    /**
     * Gets the value of the inGlgAccountValeurDateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGlgAccountValeurDateFlag() {
        return inGlgAccountValeurDateFlag;
    }

    /**
     * Sets the value of the inGlgAccountValeurDateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGlgAccountValeurDateFlag(String value) {
        this.inGlgAccountValeurDateFlag = value;
    }

    /**
     * Gets the value of the inGlgAccountValeurFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGlgAccountValeurFlg() {
        return inGlgAccountValeurFlg;
    }

    /**
     * Sets the value of the inGlgAccountValeurFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGlgAccountValeurFlg(String value) {
        this.inGlgAccountValeurFlg = value;
    }

    /**
     * Gets the value of the inGlgAccountDeleteGlgAccountAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGlgAccountDeleteGlgAccountAccountId() {
        return inGlgAccountDeleteGlgAccountAccountId;
    }

    /**
     * Sets the value of the inGlgAccountDeleteGlgAccountAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGlgAccountDeleteGlgAccountAccountId(String value) {
        this.inGlgAccountDeleteGlgAccountAccountId = value;
    }

    /**
     * Gets the value of the inGlgAccountDeleteGlgAccountTimestmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGlgAccountDeleteGlgAccountTimestmp() {
        return inGlgAccountDeleteGlgAccountTimestmp;
    }

    /**
     * Sets the value of the inGlgAccountDeleteGlgAccountTimestmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGlgAccountDeleteGlgAccountTimestmp(XMLGregorianCalendar value) {
        this.inGlgAccountDeleteGlgAccountTimestmp = value;
    }

    /**
     * Gets the value of the inGlgAccountPkeyGlgAccountAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGlgAccountPkeyGlgAccountAccountId() {
        return inGlgAccountPkeyGlgAccountAccountId;
    }

    /**
     * Sets the value of the inGlgAccountPkeyGlgAccountAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGlgAccountPkeyGlgAccountAccountId(String value) {
        this.inGlgAccountPkeyGlgAccountAccountId = value;
    }

    /**
     * Gets the value of the inGlgHCurrGroupCurrGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGlgHCurrGroupCurrGroupId() {
        return inGlgHCurrGroupCurrGroupId;
    }

    /**
     * Sets the value of the inGlgHCurrGroupCurrGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGlgHCurrGroupCurrGroupId(String value) {
        this.inGlgHCurrGroupCurrGroupId = value;
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
     * Gets the value of the inLogMntRecordingAuthorizer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogMntRecordingAuthorizer1() {
        return inLogMntRecordingAuthorizer1;
    }

    /**
     * Sets the value of the inLogMntRecordingAuthorizer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogMntRecordingAuthorizer1(String value) {
        this.inLogMntRecordingAuthorizer1 = value;
    }

    /**
     * Gets the value of the inLogMntRecordingAuthorizer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogMntRecordingAuthorizer2() {
        return inLogMntRecordingAuthorizer2;
    }

    /**
     * Sets the value of the inLogMntRecordingAuthorizer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogMntRecordingAuthorizer2(String value) {
        this.inLogMntRecordingAuthorizer2 = value;
    }

    /**
     * Gets the value of the inLogMntRecordingReversalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogMntRecordingReversalFlag() {
        return inLogMntRecordingReversalFlag;
    }

    /**
     * Sets the value of the inLogMntRecordingReversalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogMntRecordingReversalFlag(String value) {
        this.inLogMntRecordingReversalFlag = value;
    }

    /**
     * Gets the value of the inLogMntRecordingTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogMntRecordingTerminalNumber() {
        return inLogMntRecordingTerminalNumber;
    }

    /**
     * Sets the value of the inLogMntRecordingTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogMntRecordingTerminalNumber(String value) {
        this.inLogMntRecordingTerminalNumber = value;
    }

    /**
     * Gets the value of the inLogMntRecordingTrxCode property.
     * 
     */
    public int getInLogMntRecordingTrxCode() {
        return inLogMntRecordingTrxCode;
    }

    /**
     * Sets the value of the inLogMntRecordingTrxCode property.
     * 
     */
    public void setInLogMntRecordingTrxCode(int value) {
        this.inLogMntRecordingTrxCode = value;
    }

    /**
     * Gets the value of the inPermitUnitGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPermitUnitGenericDetailDescription() {
        return inPermitUnitGenericDetailDescription;
    }

    /**
     * Sets the value of the inPermitUnitGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPermitUnitGenericDetailDescription(String value) {
        this.inPermitUnitGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inPermitUnitGenericDetailSerialNum property.
     * 
     */
    public int getInPermitUnitGenericDetailSerialNum() {
        return inPermitUnitGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inPermitUnitGenericDetailSerialNum property.
     * 
     */
    public void setInPermitUnitGenericDetailSerialNum(int value) {
        this.inPermitUnitGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inPrctpGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPrctpGenericDetailDescription() {
        return inPrctpGenericDetailDescription;
    }

    /**
     * Sets the value of the inPrctpGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPrctpGenericDetailDescription(String value) {
        this.inPrctpGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inPrctpGenericDetailSerialNum property.
     * 
     */
    public int getInPrctpGenericDetailSerialNum() {
        return inPrctpGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inPrctpGenericDetailSerialNum property.
     * 
     */
    public void setInPrctpGenericDetailSerialNum(int value) {
        this.inPrctpGenericDetailSerialNum = value;
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
     * Gets the value of the inProductIdProduct property.
     * 
     */
    public int getInProductIdProduct() {
        return inProductIdProduct;
    }

    /**
     * Sets the value of the inProductIdProduct property.
     * 
     */
    public void setInProductIdProduct(int value) {
        this.inProductIdProduct = value;
    }

    /**
     * Gets the value of the inSubsGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSubsGenericDetailDescription() {
        return inSubsGenericDetailDescription;
    }

    /**
     * Sets the value of the inSubsGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSubsGenericDetailDescription(String value) {
        this.inSubsGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inSubsGenericDetailSerialNum property.
     * 
     */
    public int getInSubsGenericDetailSerialNum() {
        return inSubsGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inSubsGenericDetailSerialNum property.
     * 
     */
    public void setInSubsGenericDetailSerialNum(int value) {
        this.inSubsGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inTeamInformationJustificationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTeamInformationJustificationDescription() {
        return inTeamInformationJustificationDescription;
    }

    /**
     * Sets the value of the inTeamInformationJustificationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTeamInformationJustificationDescription(String value) {
        this.inTeamInformationJustificationDescription = value;
    }

    /**
     * Gets the value of the inTeamInformationJustificationId property.
     * 
     */
    public int getInTeamInformationJustificationId() {
        return inTeamInformationJustificationId;
    }

    /**
     * Sets the value of the inTeamInformationJustificationId property.
     * 
     */
    public void setInTeamInformationJustificationId(int value) {
        this.inTeamInformationJustificationId = value;
    }

    /**
     * Gets the value of the inTeamInformationProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTeamInformationProductDescription() {
        return inTeamInformationProductDescription;
    }

    /**
     * Sets the value of the inTeamInformationProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTeamInformationProductDescription(String value) {
        this.inTeamInformationProductDescription = value;
    }

    /**
     * Gets the value of the inTeamInformationProductId property.
     * 
     */
    public int getInTeamInformationProductId() {
        return inTeamInformationProductId;
    }

    /**
     * Sets the value of the inTeamInformationProductId property.
     * 
     */
    public void setInTeamInformationProductId(int value) {
        this.inTeamInformationProductId = value;
    }

    /**
     * Gets the value of the inTeamInformationTeamComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTeamInformationTeamComments() {
        return inTeamInformationTeamComments;
    }

    /**
     * Sets the value of the inTeamInformationTeamComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTeamInformationTeamComments(String value) {
        this.inTeamInformationTeamComments = value;
    }

    /**
     * Gets the value of the inTeamInformationTransactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTeamInformationTransactionDescription() {
        return inTeamInformationTransactionDescription;
    }

    /**
     * Sets the value of the inTeamInformationTransactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTeamInformationTransactionDescription(String value) {
        this.inTeamInformationTransactionDescription = value;
    }

    /**
     * Gets the value of the inTeamInformationTransactionId property.
     * 
     */
    public int getInTeamInformationTransactionId() {
        return inTeamInformationTransactionId;
    }

    /**
     * Sets the value of the inTeamInformationTransactionId property.
     * 
     */
    public void setInTeamInformationTransactionId(int value) {
        this.inTeamInformationTransactionId = value;
    }

    /**
     * Gets the value of the inTeamInformationUnitCode property.
     * 
     */
    public int getInTeamInformationUnitCode() {
        return inTeamInformationUnitCode;
    }

    /**
     * Sets the value of the inTeamInformationUnitCode property.
     * 
     */
    public void setInTeamInformationUnitCode(int value) {
        this.inTeamInformationUnitCode = value;
    }

    /**
     * Gets the value of the inTeamInformationUserTerminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTeamInformationUserTerminalId() {
        return inTeamInformationUserTerminalId;
    }

    /**
     * Sets the value of the inTeamInformationUserTerminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTeamInformationUserTerminalId(String value) {
        this.inTeamInformationUserTerminalId = value;
    }

}
