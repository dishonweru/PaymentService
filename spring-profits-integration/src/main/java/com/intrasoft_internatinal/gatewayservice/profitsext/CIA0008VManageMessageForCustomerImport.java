
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CIA0008V_ManageMessageForCustomerImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CIA0008V_ManageMessageForCustomerImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthorGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InContinueProfitsMessageSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InContinueProfitsMessageTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InContinueProfitsMsgProfilProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InContinueProfitsMsgProfilSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InContinueProfitsMsgProfilTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDbCustMsgProfitsMessageAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDbCustMsgProfitsMessageActualMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDbCustMsgProfitsMessageAllProfiles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDbCustMsgProfitsMessageAutomaticCreation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDbCustMsgProfitsMessageAutomaticReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDbCustMsgProfitsMessageCreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDbCustMsgProfitsMessageCreateUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDbCustMsgProfitsMessageCreateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDbCustMsgProfitsMessageCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDbCustMsgProfitsMessageExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDbCustMsgProfitsMessageMandatoryDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDbCustMsgProfitsMessageMsgReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDbCustMsgProfitsMessageOtherChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDbCustMsgProfitsMessagePrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDbCustMsgProfitsMessageSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InDbCustMsgProfitsMessageTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDbCustMsgProfitsMessageUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDbCustMsgProfitsMessageUpdateUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDbCustMsgProfitsMessageUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDbCustMsgTypeOfMessageGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDbCustMsgUnitCategoryPerRoleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTeamInformationAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTeamInformationAccSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTeamInformationAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTeamInformationAccUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTeamInformationAccountCode" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InTeamInformationAuthorisationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTeamInformationAuthorizationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTeamInformationAuthorizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTeamInformationCustomerCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTeamInformationCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTeamInformationEvaluationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTeamInformationJustificationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTeamInformationJustificationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTeamInformationProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTeamInformationProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTeamInformationSuper1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTeamInformationSuper1TerminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTeamInformationSuper2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTeamInformationSuper2TerminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTeamInformationTeamComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTeamInformationTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTeamInformationTransactionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTeamInformationUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTeamInformationUserCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTeamInformationUserProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTeamInformationUserProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTeamInformationUserProfile3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTeamInformationUserSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CIA0008V_ManageMessageForCustomerImport", propOrder = {
    "command",
    "inAuthorGrantedIefSuppliedFlag",
    "inContinueProfitsMessageSn",
    "inContinueProfitsMessageTmstamp",
    "inContinueProfitsMsgProfilProfile",
    "inContinueProfitsMsgProfilSn",
    "inContinueProfitsMsgProfilTmstamp",
    "inCustomerCustId",
    "inDbCustMsgProfitsMessageAccountNumber",
    "inDbCustMsgProfitsMessageActualMessage",
    "inDbCustMsgProfitsMessageAllProfiles",
    "inDbCustMsgProfitsMessageAutomaticCreation",
    "inDbCustMsgProfitsMessageAutomaticReason",
    "inDbCustMsgProfitsMessageCreateDate",
    "inDbCustMsgProfitsMessageCreateUnit",
    "inDbCustMsgProfitsMessageCreateUser",
    "inDbCustMsgProfitsMessageCustId",
    "inDbCustMsgProfitsMessageExpirationDate",
    "inDbCustMsgProfitsMessageMandatoryDetails",
    "inDbCustMsgProfitsMessageMsgReason",
    "inDbCustMsgProfitsMessageOtherChannel",
    "inDbCustMsgProfitsMessagePrftSystem",
    "inDbCustMsgProfitsMessageSn",
    "inDbCustMsgProfitsMessageTmstamp",
    "inDbCustMsgProfitsMessageUpdateDate",
    "inDbCustMsgProfitsMessageUpdateUnit",
    "inDbCustMsgProfitsMessageUpdateUser",
    "inDbCustMsgTypeOfMessageGenericDetailSerialNum",
    "inDbCustMsgUnitCategoryPerRoleId",
    "inJustificIdJustific",
    "inPrftTransactionIdTransact",
    "inProductIdProduct",
    "inProfitsAccountAccountNumber",
    "inProfitsAccountPrftSystem",
    "inTeamInformationAccCd",
    "inTeamInformationAccSn",
    "inTeamInformationAccType",
    "inTeamInformationAccUnitCode",
    "inTeamInformationAccountCode",
    "inTeamInformationAuthorisationType",
    "inTeamInformationAuthorizationResult",
    "inTeamInformationAuthorizationType",
    "inTeamInformationCustomerCode",
    "inTeamInformationCustomerSurname",
    "inTeamInformationEvaluationResult",
    "inTeamInformationJustificationDescription",
    "inTeamInformationJustificationId",
    "inTeamInformationProductDescription",
    "inTeamInformationProductId",
    "inTeamInformationRequiredProfile1",
    "inTeamInformationRequiredProfile2",
    "inTeamInformationSuper1Code",
    "inTeamInformationSuper1TerminalId",
    "inTeamInformationSuper2Code",
    "inTeamInformationSuper2TerminalId",
    "inTeamInformationTeamComments",
    "inTeamInformationTransactionDescription",
    "inTeamInformationTransactionId",
    "inTeamInformationUnitCode",
    "inTeamInformationUserCode",
    "inTeamInformationUserProfile1",
    "inTeamInformationUserProfile2",
    "inTeamInformationUserProfile3",
    "inTeamInformationUserSurname",
    "inTeamInformationUserTerminalId"
})
public class CIA0008VManageMessageForCustomerImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InAuthorGrantedIefSuppliedFlag")
    protected String inAuthorGrantedIefSuppliedFlag;
    @XmlElement(name = "InContinueProfitsMessageSn")
    protected double inContinueProfitsMessageSn;
    @XmlElement(name = "InContinueProfitsMessageTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inContinueProfitsMessageTmstamp;
    @XmlElement(name = "InContinueProfitsMsgProfilProfile")
    protected String inContinueProfitsMsgProfilProfile;
    @XmlElement(name = "InContinueProfitsMsgProfilSn")
    protected double inContinueProfitsMsgProfilSn;
    @XmlElement(name = "InContinueProfitsMsgProfilTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inContinueProfitsMsgProfilTmstamp;
    @XmlElement(name = "InCustomerCustId")
    protected int inCustomerCustId;
    @XmlElement(name = "InDbCustMsgProfitsMessageAccountNumber")
    protected String inDbCustMsgProfitsMessageAccountNumber;
    @XmlElement(name = "InDbCustMsgProfitsMessageActualMessage")
    protected String inDbCustMsgProfitsMessageActualMessage;
    @XmlElement(name = "InDbCustMsgProfitsMessageAllProfiles")
    protected String inDbCustMsgProfitsMessageAllProfiles;
    @XmlElement(name = "InDbCustMsgProfitsMessageAutomaticCreation")
    protected String inDbCustMsgProfitsMessageAutomaticCreation;
    @XmlElement(name = "InDbCustMsgProfitsMessageAutomaticReason")
    protected String inDbCustMsgProfitsMessageAutomaticReason;
    @XmlElement(name = "InDbCustMsgProfitsMessageCreateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDbCustMsgProfitsMessageCreateDate;
    @XmlElement(name = "InDbCustMsgProfitsMessageCreateUnit")
    protected int inDbCustMsgProfitsMessageCreateUnit;
    @XmlElement(name = "InDbCustMsgProfitsMessageCreateUser")
    protected String inDbCustMsgProfitsMessageCreateUser;
    @XmlElement(name = "InDbCustMsgProfitsMessageCustId")
    protected int inDbCustMsgProfitsMessageCustId;
    @XmlElement(name = "InDbCustMsgProfitsMessageExpirationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDbCustMsgProfitsMessageExpirationDate;
    @XmlElement(name = "InDbCustMsgProfitsMessageMandatoryDetails")
    protected String inDbCustMsgProfitsMessageMandatoryDetails;
    @XmlElement(name = "InDbCustMsgProfitsMessageMsgReason")
    protected String inDbCustMsgProfitsMessageMsgReason;
    @XmlElement(name = "InDbCustMsgProfitsMessageOtherChannel")
    protected String inDbCustMsgProfitsMessageOtherChannel;
    @XmlElement(name = "InDbCustMsgProfitsMessagePrftSystem")
    protected short inDbCustMsgProfitsMessagePrftSystem;
    @XmlElement(name = "InDbCustMsgProfitsMessageSn")
    protected double inDbCustMsgProfitsMessageSn;
    @XmlElement(name = "InDbCustMsgProfitsMessageTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDbCustMsgProfitsMessageTmstamp;
    @XmlElement(name = "InDbCustMsgProfitsMessageUpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDbCustMsgProfitsMessageUpdateDate;
    @XmlElement(name = "InDbCustMsgProfitsMessageUpdateUnit")
    protected int inDbCustMsgProfitsMessageUpdateUnit;
    @XmlElement(name = "InDbCustMsgProfitsMessageUpdateUser")
    protected String inDbCustMsgProfitsMessageUpdateUser;
    @XmlElement(name = "InDbCustMsgTypeOfMessageGenericDetailSerialNum")
    protected int inDbCustMsgTypeOfMessageGenericDetailSerialNum;
    @XmlElement(name = "InDbCustMsgUnitCategoryPerRoleId")
    protected String inDbCustMsgUnitCategoryPerRoleId;
    @XmlElement(name = "InJustificIdJustific")
    protected int inJustificIdJustific;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InProductIdProduct")
    protected int inProductIdProduct;
    @XmlElement(name = "InProfitsAccountAccountNumber")
    protected String inProfitsAccountAccountNumber;
    @XmlElement(name = "InProfitsAccountPrftSystem")
    protected short inProfitsAccountPrftSystem;
    @XmlElement(name = "InTeamInformationAccCd")
    protected short inTeamInformationAccCd;
    @XmlElement(name = "InTeamInformationAccSn")
    protected int inTeamInformationAccSn;
    @XmlElement(name = "InTeamInformationAccType")
    protected short inTeamInformationAccType;
    @XmlElement(name = "InTeamInformationAccUnitCode")
    protected int inTeamInformationAccUnitCode;
    @XmlElement(name = "InTeamInformationAccountCode")
    protected double inTeamInformationAccountCode;
    @XmlElement(name = "InTeamInformationAuthorisationType")
    protected String inTeamInformationAuthorisationType;
    @XmlElement(name = "InTeamInformationAuthorizationResult")
    protected String inTeamInformationAuthorizationResult;
    @XmlElement(name = "InTeamInformationAuthorizationType")
    protected String inTeamInformationAuthorizationType;
    @XmlElement(name = "InTeamInformationCustomerCode")
    protected int inTeamInformationCustomerCode;
    @XmlElement(name = "InTeamInformationCustomerSurname")
    protected String inTeamInformationCustomerSurname;
    @XmlElement(name = "InTeamInformationEvaluationResult")
    protected String inTeamInformationEvaluationResult;
    @XmlElement(name = "InTeamInformationJustificationDescription")
    protected String inTeamInformationJustificationDescription;
    @XmlElement(name = "InTeamInformationJustificationId")
    protected int inTeamInformationJustificationId;
    @XmlElement(name = "InTeamInformationProductDescription")
    protected String inTeamInformationProductDescription;
    @XmlElement(name = "InTeamInformationProductId")
    protected int inTeamInformationProductId;
    @XmlElement(name = "InTeamInformationRequiredProfile1")
    protected String inTeamInformationRequiredProfile1;
    @XmlElement(name = "InTeamInformationRequiredProfile2")
    protected String inTeamInformationRequiredProfile2;
    @XmlElement(name = "InTeamInformationSuper1Code")
    protected String inTeamInformationSuper1Code;
    @XmlElement(name = "InTeamInformationSuper1TerminalId")
    protected String inTeamInformationSuper1TerminalId;
    @XmlElement(name = "InTeamInformationSuper2Code")
    protected String inTeamInformationSuper2Code;
    @XmlElement(name = "InTeamInformationSuper2TerminalId")
    protected String inTeamInformationSuper2TerminalId;
    @XmlElement(name = "InTeamInformationTeamComments")
    protected String inTeamInformationTeamComments;
    @XmlElement(name = "InTeamInformationTransactionDescription")
    protected String inTeamInformationTransactionDescription;
    @XmlElement(name = "InTeamInformationTransactionId")
    protected int inTeamInformationTransactionId;
    @XmlElement(name = "InTeamInformationUnitCode")
    protected int inTeamInformationUnitCode;
    @XmlElement(name = "InTeamInformationUserCode")
    protected String inTeamInformationUserCode;
    @XmlElement(name = "InTeamInformationUserProfile1")
    protected String inTeamInformationUserProfile1;
    @XmlElement(name = "InTeamInformationUserProfile2")
    protected String inTeamInformationUserProfile2;
    @XmlElement(name = "InTeamInformationUserProfile3")
    protected String inTeamInformationUserProfile3;
    @XmlElement(name = "InTeamInformationUserSurname")
    protected String inTeamInformationUserSurname;
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
     * Gets the value of the inContinueProfitsMessageSn property.
     * 
     */
    public double getInContinueProfitsMessageSn() {
        return inContinueProfitsMessageSn;
    }

    /**
     * Sets the value of the inContinueProfitsMessageSn property.
     * 
     */
    public void setInContinueProfitsMessageSn(double value) {
        this.inContinueProfitsMessageSn = value;
    }

    /**
     * Gets the value of the inContinueProfitsMessageTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInContinueProfitsMessageTmstamp() {
        return inContinueProfitsMessageTmstamp;
    }

    /**
     * Sets the value of the inContinueProfitsMessageTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInContinueProfitsMessageTmstamp(XMLGregorianCalendar value) {
        this.inContinueProfitsMessageTmstamp = value;
    }

    /**
     * Gets the value of the inContinueProfitsMsgProfilProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInContinueProfitsMsgProfilProfile() {
        return inContinueProfitsMsgProfilProfile;
    }

    /**
     * Sets the value of the inContinueProfitsMsgProfilProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInContinueProfitsMsgProfilProfile(String value) {
        this.inContinueProfitsMsgProfilProfile = value;
    }

    /**
     * Gets the value of the inContinueProfitsMsgProfilSn property.
     * 
     */
    public double getInContinueProfitsMsgProfilSn() {
        return inContinueProfitsMsgProfilSn;
    }

    /**
     * Sets the value of the inContinueProfitsMsgProfilSn property.
     * 
     */
    public void setInContinueProfitsMsgProfilSn(double value) {
        this.inContinueProfitsMsgProfilSn = value;
    }

    /**
     * Gets the value of the inContinueProfitsMsgProfilTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInContinueProfitsMsgProfilTmstamp() {
        return inContinueProfitsMsgProfilTmstamp;
    }

    /**
     * Sets the value of the inContinueProfitsMsgProfilTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInContinueProfitsMsgProfilTmstamp(XMLGregorianCalendar value) {
        this.inContinueProfitsMsgProfilTmstamp = value;
    }

    /**
     * Gets the value of the inCustomerCustId property.
     * 
     */
    public int getInCustomerCustId() {
        return inCustomerCustId;
    }

    /**
     * Sets the value of the inCustomerCustId property.
     * 
     */
    public void setInCustomerCustId(int value) {
        this.inCustomerCustId = value;
    }

    /**
     * Gets the value of the inDbCustMsgProfitsMessageAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDbCustMsgProfitsMessageAccountNumber() {
        return inDbCustMsgProfitsMessageAccountNumber;
    }

    /**
     * Sets the value of the inDbCustMsgProfitsMessageAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDbCustMsgProfitsMessageAccountNumber(String value) {
        this.inDbCustMsgProfitsMessageAccountNumber = value;
    }

    /**
     * Gets the value of the inDbCustMsgProfitsMessageActualMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDbCustMsgProfitsMessageActualMessage() {
        return inDbCustMsgProfitsMessageActualMessage;
    }

    /**
     * Sets the value of the inDbCustMsgProfitsMessageActualMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDbCustMsgProfitsMessageActualMessage(String value) {
        this.inDbCustMsgProfitsMessageActualMessage = value;
    }

    /**
     * Gets the value of the inDbCustMsgProfitsMessageAllProfiles property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDbCustMsgProfitsMessageAllProfiles() {
        return inDbCustMsgProfitsMessageAllProfiles;
    }

    /**
     * Sets the value of the inDbCustMsgProfitsMessageAllProfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDbCustMsgProfitsMessageAllProfiles(String value) {
        this.inDbCustMsgProfitsMessageAllProfiles = value;
    }

    /**
     * Gets the value of the inDbCustMsgProfitsMessageAutomaticCreation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDbCustMsgProfitsMessageAutomaticCreation() {
        return inDbCustMsgProfitsMessageAutomaticCreation;
    }

    /**
     * Sets the value of the inDbCustMsgProfitsMessageAutomaticCreation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDbCustMsgProfitsMessageAutomaticCreation(String value) {
        this.inDbCustMsgProfitsMessageAutomaticCreation = value;
    }

    /**
     * Gets the value of the inDbCustMsgProfitsMessageAutomaticReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDbCustMsgProfitsMessageAutomaticReason() {
        return inDbCustMsgProfitsMessageAutomaticReason;
    }

    /**
     * Sets the value of the inDbCustMsgProfitsMessageAutomaticReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDbCustMsgProfitsMessageAutomaticReason(String value) {
        this.inDbCustMsgProfitsMessageAutomaticReason = value;
    }

    /**
     * Gets the value of the inDbCustMsgProfitsMessageCreateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDbCustMsgProfitsMessageCreateDate() {
        return inDbCustMsgProfitsMessageCreateDate;
    }

    /**
     * Sets the value of the inDbCustMsgProfitsMessageCreateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDbCustMsgProfitsMessageCreateDate(XMLGregorianCalendar value) {
        this.inDbCustMsgProfitsMessageCreateDate = value;
    }

    /**
     * Gets the value of the inDbCustMsgProfitsMessageCreateUnit property.
     * 
     */
    public int getInDbCustMsgProfitsMessageCreateUnit() {
        return inDbCustMsgProfitsMessageCreateUnit;
    }

    /**
     * Sets the value of the inDbCustMsgProfitsMessageCreateUnit property.
     * 
     */
    public void setInDbCustMsgProfitsMessageCreateUnit(int value) {
        this.inDbCustMsgProfitsMessageCreateUnit = value;
    }

    /**
     * Gets the value of the inDbCustMsgProfitsMessageCreateUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDbCustMsgProfitsMessageCreateUser() {
        return inDbCustMsgProfitsMessageCreateUser;
    }

    /**
     * Sets the value of the inDbCustMsgProfitsMessageCreateUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDbCustMsgProfitsMessageCreateUser(String value) {
        this.inDbCustMsgProfitsMessageCreateUser = value;
    }

    /**
     * Gets the value of the inDbCustMsgProfitsMessageCustId property.
     * 
     */
    public int getInDbCustMsgProfitsMessageCustId() {
        return inDbCustMsgProfitsMessageCustId;
    }

    /**
     * Sets the value of the inDbCustMsgProfitsMessageCustId property.
     * 
     */
    public void setInDbCustMsgProfitsMessageCustId(int value) {
        this.inDbCustMsgProfitsMessageCustId = value;
    }

    /**
     * Gets the value of the inDbCustMsgProfitsMessageExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDbCustMsgProfitsMessageExpirationDate() {
        return inDbCustMsgProfitsMessageExpirationDate;
    }

    /**
     * Sets the value of the inDbCustMsgProfitsMessageExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDbCustMsgProfitsMessageExpirationDate(XMLGregorianCalendar value) {
        this.inDbCustMsgProfitsMessageExpirationDate = value;
    }

    /**
     * Gets the value of the inDbCustMsgProfitsMessageMandatoryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDbCustMsgProfitsMessageMandatoryDetails() {
        return inDbCustMsgProfitsMessageMandatoryDetails;
    }

    /**
     * Sets the value of the inDbCustMsgProfitsMessageMandatoryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDbCustMsgProfitsMessageMandatoryDetails(String value) {
        this.inDbCustMsgProfitsMessageMandatoryDetails = value;
    }

    /**
     * Gets the value of the inDbCustMsgProfitsMessageMsgReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDbCustMsgProfitsMessageMsgReason() {
        return inDbCustMsgProfitsMessageMsgReason;
    }

    /**
     * Sets the value of the inDbCustMsgProfitsMessageMsgReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDbCustMsgProfitsMessageMsgReason(String value) {
        this.inDbCustMsgProfitsMessageMsgReason = value;
    }

    /**
     * Gets the value of the inDbCustMsgProfitsMessageOtherChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDbCustMsgProfitsMessageOtherChannel() {
        return inDbCustMsgProfitsMessageOtherChannel;
    }

    /**
     * Sets the value of the inDbCustMsgProfitsMessageOtherChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDbCustMsgProfitsMessageOtherChannel(String value) {
        this.inDbCustMsgProfitsMessageOtherChannel = value;
    }

    /**
     * Gets the value of the inDbCustMsgProfitsMessagePrftSystem property.
     * 
     */
    public short getInDbCustMsgProfitsMessagePrftSystem() {
        return inDbCustMsgProfitsMessagePrftSystem;
    }

    /**
     * Sets the value of the inDbCustMsgProfitsMessagePrftSystem property.
     * 
     */
    public void setInDbCustMsgProfitsMessagePrftSystem(short value) {
        this.inDbCustMsgProfitsMessagePrftSystem = value;
    }

    /**
     * Gets the value of the inDbCustMsgProfitsMessageSn property.
     * 
     */
    public double getInDbCustMsgProfitsMessageSn() {
        return inDbCustMsgProfitsMessageSn;
    }

    /**
     * Sets the value of the inDbCustMsgProfitsMessageSn property.
     * 
     */
    public void setInDbCustMsgProfitsMessageSn(double value) {
        this.inDbCustMsgProfitsMessageSn = value;
    }

    /**
     * Gets the value of the inDbCustMsgProfitsMessageTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDbCustMsgProfitsMessageTmstamp() {
        return inDbCustMsgProfitsMessageTmstamp;
    }

    /**
     * Sets the value of the inDbCustMsgProfitsMessageTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDbCustMsgProfitsMessageTmstamp(XMLGregorianCalendar value) {
        this.inDbCustMsgProfitsMessageTmstamp = value;
    }

    /**
     * Gets the value of the inDbCustMsgProfitsMessageUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDbCustMsgProfitsMessageUpdateDate() {
        return inDbCustMsgProfitsMessageUpdateDate;
    }

    /**
     * Sets the value of the inDbCustMsgProfitsMessageUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDbCustMsgProfitsMessageUpdateDate(XMLGregorianCalendar value) {
        this.inDbCustMsgProfitsMessageUpdateDate = value;
    }

    /**
     * Gets the value of the inDbCustMsgProfitsMessageUpdateUnit property.
     * 
     */
    public int getInDbCustMsgProfitsMessageUpdateUnit() {
        return inDbCustMsgProfitsMessageUpdateUnit;
    }

    /**
     * Sets the value of the inDbCustMsgProfitsMessageUpdateUnit property.
     * 
     */
    public void setInDbCustMsgProfitsMessageUpdateUnit(int value) {
        this.inDbCustMsgProfitsMessageUpdateUnit = value;
    }

    /**
     * Gets the value of the inDbCustMsgProfitsMessageUpdateUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDbCustMsgProfitsMessageUpdateUser() {
        return inDbCustMsgProfitsMessageUpdateUser;
    }

    /**
     * Sets the value of the inDbCustMsgProfitsMessageUpdateUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDbCustMsgProfitsMessageUpdateUser(String value) {
        this.inDbCustMsgProfitsMessageUpdateUser = value;
    }

    /**
     * Gets the value of the inDbCustMsgTypeOfMessageGenericDetailSerialNum property.
     * 
     */
    public int getInDbCustMsgTypeOfMessageGenericDetailSerialNum() {
        return inDbCustMsgTypeOfMessageGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inDbCustMsgTypeOfMessageGenericDetailSerialNum property.
     * 
     */
    public void setInDbCustMsgTypeOfMessageGenericDetailSerialNum(int value) {
        this.inDbCustMsgTypeOfMessageGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inDbCustMsgUnitCategoryPerRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDbCustMsgUnitCategoryPerRoleId() {
        return inDbCustMsgUnitCategoryPerRoleId;
    }

    /**
     * Sets the value of the inDbCustMsgUnitCategoryPerRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDbCustMsgUnitCategoryPerRoleId(String value) {
        this.inDbCustMsgUnitCategoryPerRoleId = value;
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
     * Gets the value of the inProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProfitsAccountAccountNumber() {
        return inProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProfitsAccountAccountNumber(String value) {
        this.inProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inProfitsAccountPrftSystem property.
     * 
     */
    public short getInProfitsAccountPrftSystem() {
        return inProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inProfitsAccountPrftSystem property.
     * 
     */
    public void setInProfitsAccountPrftSystem(short value) {
        this.inProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inTeamInformationAccCd property.
     * 
     */
    public short getInTeamInformationAccCd() {
        return inTeamInformationAccCd;
    }

    /**
     * Sets the value of the inTeamInformationAccCd property.
     * 
     */
    public void setInTeamInformationAccCd(short value) {
        this.inTeamInformationAccCd = value;
    }

    /**
     * Gets the value of the inTeamInformationAccSn property.
     * 
     */
    public int getInTeamInformationAccSn() {
        return inTeamInformationAccSn;
    }

    /**
     * Sets the value of the inTeamInformationAccSn property.
     * 
     */
    public void setInTeamInformationAccSn(int value) {
        this.inTeamInformationAccSn = value;
    }

    /**
     * Gets the value of the inTeamInformationAccType property.
     * 
     */
    public short getInTeamInformationAccType() {
        return inTeamInformationAccType;
    }

    /**
     * Sets the value of the inTeamInformationAccType property.
     * 
     */
    public void setInTeamInformationAccType(short value) {
        this.inTeamInformationAccType = value;
    }

    /**
     * Gets the value of the inTeamInformationAccUnitCode property.
     * 
     */
    public int getInTeamInformationAccUnitCode() {
        return inTeamInformationAccUnitCode;
    }

    /**
     * Sets the value of the inTeamInformationAccUnitCode property.
     * 
     */
    public void setInTeamInformationAccUnitCode(int value) {
        this.inTeamInformationAccUnitCode = value;
    }

    /**
     * Gets the value of the inTeamInformationAccountCode property.
     * 
     */
    public double getInTeamInformationAccountCode() {
        return inTeamInformationAccountCode;
    }

    /**
     * Sets the value of the inTeamInformationAccountCode property.
     * 
     */
    public void setInTeamInformationAccountCode(double value) {
        this.inTeamInformationAccountCode = value;
    }

    /**
     * Gets the value of the inTeamInformationAuthorisationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTeamInformationAuthorisationType() {
        return inTeamInformationAuthorisationType;
    }

    /**
     * Sets the value of the inTeamInformationAuthorisationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTeamInformationAuthorisationType(String value) {
        this.inTeamInformationAuthorisationType = value;
    }

    /**
     * Gets the value of the inTeamInformationAuthorizationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTeamInformationAuthorizationResult() {
        return inTeamInformationAuthorizationResult;
    }

    /**
     * Sets the value of the inTeamInformationAuthorizationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTeamInformationAuthorizationResult(String value) {
        this.inTeamInformationAuthorizationResult = value;
    }

    /**
     * Gets the value of the inTeamInformationAuthorizationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTeamInformationAuthorizationType() {
        return inTeamInformationAuthorizationType;
    }

    /**
     * Sets the value of the inTeamInformationAuthorizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTeamInformationAuthorizationType(String value) {
        this.inTeamInformationAuthorizationType = value;
    }

    /**
     * Gets the value of the inTeamInformationCustomerCode property.
     * 
     */
    public int getInTeamInformationCustomerCode() {
        return inTeamInformationCustomerCode;
    }

    /**
     * Sets the value of the inTeamInformationCustomerCode property.
     * 
     */
    public void setInTeamInformationCustomerCode(int value) {
        this.inTeamInformationCustomerCode = value;
    }

    /**
     * Gets the value of the inTeamInformationCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTeamInformationCustomerSurname() {
        return inTeamInformationCustomerSurname;
    }

    /**
     * Sets the value of the inTeamInformationCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTeamInformationCustomerSurname(String value) {
        this.inTeamInformationCustomerSurname = value;
    }

    /**
     * Gets the value of the inTeamInformationEvaluationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTeamInformationEvaluationResult() {
        return inTeamInformationEvaluationResult;
    }

    /**
     * Sets the value of the inTeamInformationEvaluationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTeamInformationEvaluationResult(String value) {
        this.inTeamInformationEvaluationResult = value;
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
     * Gets the value of the inTeamInformationRequiredProfile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTeamInformationRequiredProfile1() {
        return inTeamInformationRequiredProfile1;
    }

    /**
     * Sets the value of the inTeamInformationRequiredProfile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTeamInformationRequiredProfile1(String value) {
        this.inTeamInformationRequiredProfile1 = value;
    }

    /**
     * Gets the value of the inTeamInformationRequiredProfile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTeamInformationRequiredProfile2() {
        return inTeamInformationRequiredProfile2;
    }

    /**
     * Sets the value of the inTeamInformationRequiredProfile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTeamInformationRequiredProfile2(String value) {
        this.inTeamInformationRequiredProfile2 = value;
    }

    /**
     * Gets the value of the inTeamInformationSuper1Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTeamInformationSuper1Code() {
        return inTeamInformationSuper1Code;
    }

    /**
     * Sets the value of the inTeamInformationSuper1Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTeamInformationSuper1Code(String value) {
        this.inTeamInformationSuper1Code = value;
    }

    /**
     * Gets the value of the inTeamInformationSuper1TerminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTeamInformationSuper1TerminalId() {
        return inTeamInformationSuper1TerminalId;
    }

    /**
     * Sets the value of the inTeamInformationSuper1TerminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTeamInformationSuper1TerminalId(String value) {
        this.inTeamInformationSuper1TerminalId = value;
    }

    /**
     * Gets the value of the inTeamInformationSuper2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTeamInformationSuper2Code() {
        return inTeamInformationSuper2Code;
    }

    /**
     * Sets the value of the inTeamInformationSuper2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTeamInformationSuper2Code(String value) {
        this.inTeamInformationSuper2Code = value;
    }

    /**
     * Gets the value of the inTeamInformationSuper2TerminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTeamInformationSuper2TerminalId() {
        return inTeamInformationSuper2TerminalId;
    }

    /**
     * Sets the value of the inTeamInformationSuper2TerminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTeamInformationSuper2TerminalId(String value) {
        this.inTeamInformationSuper2TerminalId = value;
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
     * Gets the value of the inTeamInformationUserCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTeamInformationUserCode() {
        return inTeamInformationUserCode;
    }

    /**
     * Sets the value of the inTeamInformationUserCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTeamInformationUserCode(String value) {
        this.inTeamInformationUserCode = value;
    }

    /**
     * Gets the value of the inTeamInformationUserProfile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTeamInformationUserProfile1() {
        return inTeamInformationUserProfile1;
    }

    /**
     * Sets the value of the inTeamInformationUserProfile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTeamInformationUserProfile1(String value) {
        this.inTeamInformationUserProfile1 = value;
    }

    /**
     * Gets the value of the inTeamInformationUserProfile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTeamInformationUserProfile2() {
        return inTeamInformationUserProfile2;
    }

    /**
     * Sets the value of the inTeamInformationUserProfile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTeamInformationUserProfile2(String value) {
        this.inTeamInformationUserProfile2 = value;
    }

    /**
     * Gets the value of the inTeamInformationUserProfile3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTeamInformationUserProfile3() {
        return inTeamInformationUserProfile3;
    }

    /**
     * Sets the value of the inTeamInformationUserProfile3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTeamInformationUserProfile3(String value) {
        this.inTeamInformationUserProfile3 = value;
    }

    /**
     * Gets the value of the inTeamInformationUserSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTeamInformationUserSurname() {
        return inTeamInformationUserSurname;
    }

    /**
     * Sets the value of the inTeamInformationUserSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTeamInformationUserSurname(String value) {
        this.inTeamInformationUserSurname = value;
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
