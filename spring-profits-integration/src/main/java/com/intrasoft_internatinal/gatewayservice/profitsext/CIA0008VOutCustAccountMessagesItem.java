
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CIA0008VOutCustAccountMessagesItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CIA0008VOutCustAccountMessagesItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutCustAccountMessagesOutGrmCustAccMsgCreateBankemployeeFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAccountMessagesOutGrmCustAccMsgCreateBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAccountMessagesOutGrmCustAccMsgCreateUnitUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAccountMessagesOutGrmCustAccMsgIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAccountMessagesOutGrmCustAccMsgProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustAccountMessagesOutGrmCustAccMsgProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAccountMessagesOutGrmCustAccMsgProfitsMessageActualMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAccountMessagesOutGrmCustAccMsgProfitsMessageAllProfiles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAccountMessagesOutGrmCustAccMsgProfitsMessageAutomaticCreation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAccountMessagesOutGrmCustAccMsgProfitsMessageAutomaticReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAccountMessagesOutGrmCustAccMsgProfitsMessageCreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustAccountMessagesOutGrmCustAccMsgProfitsMessageCreateUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustAccountMessagesOutGrmCustAccMsgProfitsMessageCreateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAccountMessagesOutGrmCustAccMsgProfitsMessageCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustAccountMessagesOutGrmCustAccMsgProfitsMessageExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustAccountMessagesOutGrmCustAccMsgProfitsMessageMandatoryDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAccountMessagesOutGrmCustAccMsgProfitsMessageMsgReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAccountMessagesOutGrmCustAccMsgProfitsMessageOtherChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAccountMessagesOutGrmCustAccMsgProfitsMessagePrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustAccountMessagesOutGrmCustAccMsgProfitsMessageSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutCustAccountMessagesOutGrmCustAccMsgProfitsMessageTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustAccountMessagesOutGrmCustAccMsgProfitsMessageUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustAccountMessagesOutGrmCustAccMsgProfitsMessageUpdateUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustAccountMessagesOutGrmCustAccMsgProfitsMessageUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAccountMessagesOutGrmCustAccMsgSystemGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAccountMessagesOutGrmCustAccMsgUpdateBankemployeeFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAccountMessagesOutGrmCustAccMsgUpdateBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAccountMessagesOutGrmCustAccMsgUpdateUnitUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CIA0008VOutCustAccountMessagesItem", propOrder = {
    "outCustAccountMessagesOutGrmCustAccMsgCreateBankemployeeFirstName",
    "outCustAccountMessagesOutGrmCustAccMsgCreateBankemployeeLastName",
    "outCustAccountMessagesOutGrmCustAccMsgCreateUnitUnitUnitName",
    "outCustAccountMessagesOutGrmCustAccMsgIefSuppliedSelectChar",
    "outCustAccountMessagesOutGrmCustAccMsgProfitsAccountAccountCd",
    "outCustAccountMessagesOutGrmCustAccMsgProfitsAccountAccountNumber",
    "outCustAccountMessagesOutGrmCustAccMsgProfitsMessageActualMessage",
    "outCustAccountMessagesOutGrmCustAccMsgProfitsMessageAllProfiles",
    "outCustAccountMessagesOutGrmCustAccMsgProfitsMessageAutomaticCreation",
    "outCustAccountMessagesOutGrmCustAccMsgProfitsMessageAutomaticReason",
    "outCustAccountMessagesOutGrmCustAccMsgProfitsMessageCreateDate",
    "outCustAccountMessagesOutGrmCustAccMsgProfitsMessageCreateUnit",
    "outCustAccountMessagesOutGrmCustAccMsgProfitsMessageCreateUser",
    "outCustAccountMessagesOutGrmCustAccMsgProfitsMessageCustId",
    "outCustAccountMessagesOutGrmCustAccMsgProfitsMessageExpirationDate",
    "outCustAccountMessagesOutGrmCustAccMsgProfitsMessageMandatoryDetails",
    "outCustAccountMessagesOutGrmCustAccMsgProfitsMessageMsgReason",
    "outCustAccountMessagesOutGrmCustAccMsgProfitsMessageOtherChannel",
    "outCustAccountMessagesOutGrmCustAccMsgProfitsMessagePrftSystem",
    "outCustAccountMessagesOutGrmCustAccMsgProfitsMessageSn",
    "outCustAccountMessagesOutGrmCustAccMsgProfitsMessageTmstamp",
    "outCustAccountMessagesOutGrmCustAccMsgProfitsMessageUpdateDate",
    "outCustAccountMessagesOutGrmCustAccMsgProfitsMessageUpdateUnit",
    "outCustAccountMessagesOutGrmCustAccMsgProfitsMessageUpdateUser",
    "outCustAccountMessagesOutGrmCustAccMsgSystemGenericDetailDescription",
    "outCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailDescription",
    "outCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailParameterType",
    "outCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailSerialNum",
    "outCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailShortDescription",
    "outCustAccountMessagesOutGrmCustAccMsgUpdateBankemployeeFirstName",
    "outCustAccountMessagesOutGrmCustAccMsgUpdateBankemployeeLastName",
    "outCustAccountMessagesOutGrmCustAccMsgUpdateUnitUnitUnitName"
})
public class CIA0008VOutCustAccountMessagesItem {

    @XmlElement(name = "OutCustAccountMessagesOutGrmCustAccMsgCreateBankemployeeFirstName")
    protected String outCustAccountMessagesOutGrmCustAccMsgCreateBankemployeeFirstName;
    @XmlElement(name = "OutCustAccountMessagesOutGrmCustAccMsgCreateBankemployeeLastName")
    protected String outCustAccountMessagesOutGrmCustAccMsgCreateBankemployeeLastName;
    @XmlElement(name = "OutCustAccountMessagesOutGrmCustAccMsgCreateUnitUnitUnitName")
    protected String outCustAccountMessagesOutGrmCustAccMsgCreateUnitUnitUnitName;
    @XmlElement(name = "OutCustAccountMessagesOutGrmCustAccMsgIefSuppliedSelectChar")
    protected String outCustAccountMessagesOutGrmCustAccMsgIefSuppliedSelectChar;
    @XmlElement(name = "OutCustAccountMessagesOutGrmCustAccMsgProfitsAccountAccountCd")
    protected short outCustAccountMessagesOutGrmCustAccMsgProfitsAccountAccountCd;
    @XmlElement(name = "OutCustAccountMessagesOutGrmCustAccMsgProfitsAccountAccountNumber")
    protected String outCustAccountMessagesOutGrmCustAccMsgProfitsAccountAccountNumber;
    @XmlElement(name = "OutCustAccountMessagesOutGrmCustAccMsgProfitsMessageActualMessage")
    protected String outCustAccountMessagesOutGrmCustAccMsgProfitsMessageActualMessage;
    @XmlElement(name = "OutCustAccountMessagesOutGrmCustAccMsgProfitsMessageAllProfiles")
    protected String outCustAccountMessagesOutGrmCustAccMsgProfitsMessageAllProfiles;
    @XmlElement(name = "OutCustAccountMessagesOutGrmCustAccMsgProfitsMessageAutomaticCreation")
    protected String outCustAccountMessagesOutGrmCustAccMsgProfitsMessageAutomaticCreation;
    @XmlElement(name = "OutCustAccountMessagesOutGrmCustAccMsgProfitsMessageAutomaticReason")
    protected String outCustAccountMessagesOutGrmCustAccMsgProfitsMessageAutomaticReason;
    @XmlElement(name = "OutCustAccountMessagesOutGrmCustAccMsgProfitsMessageCreateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustAccountMessagesOutGrmCustAccMsgProfitsMessageCreateDate;
    @XmlElement(name = "OutCustAccountMessagesOutGrmCustAccMsgProfitsMessageCreateUnit")
    protected int outCustAccountMessagesOutGrmCustAccMsgProfitsMessageCreateUnit;
    @XmlElement(name = "OutCustAccountMessagesOutGrmCustAccMsgProfitsMessageCreateUser")
    protected String outCustAccountMessagesOutGrmCustAccMsgProfitsMessageCreateUser;
    @XmlElement(name = "OutCustAccountMessagesOutGrmCustAccMsgProfitsMessageCustId")
    protected int outCustAccountMessagesOutGrmCustAccMsgProfitsMessageCustId;
    @XmlElement(name = "OutCustAccountMessagesOutGrmCustAccMsgProfitsMessageExpirationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustAccountMessagesOutGrmCustAccMsgProfitsMessageExpirationDate;
    @XmlElement(name = "OutCustAccountMessagesOutGrmCustAccMsgProfitsMessageMandatoryDetails")
    protected String outCustAccountMessagesOutGrmCustAccMsgProfitsMessageMandatoryDetails;
    @XmlElement(name = "OutCustAccountMessagesOutGrmCustAccMsgProfitsMessageMsgReason")
    protected String outCustAccountMessagesOutGrmCustAccMsgProfitsMessageMsgReason;
    @XmlElement(name = "OutCustAccountMessagesOutGrmCustAccMsgProfitsMessageOtherChannel")
    protected String outCustAccountMessagesOutGrmCustAccMsgProfitsMessageOtherChannel;
    @XmlElement(name = "OutCustAccountMessagesOutGrmCustAccMsgProfitsMessagePrftSystem")
    protected short outCustAccountMessagesOutGrmCustAccMsgProfitsMessagePrftSystem;
    @XmlElement(name = "OutCustAccountMessagesOutGrmCustAccMsgProfitsMessageSn")
    protected double outCustAccountMessagesOutGrmCustAccMsgProfitsMessageSn;
    @XmlElement(name = "OutCustAccountMessagesOutGrmCustAccMsgProfitsMessageTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustAccountMessagesOutGrmCustAccMsgProfitsMessageTmstamp;
    @XmlElement(name = "OutCustAccountMessagesOutGrmCustAccMsgProfitsMessageUpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustAccountMessagesOutGrmCustAccMsgProfitsMessageUpdateDate;
    @XmlElement(name = "OutCustAccountMessagesOutGrmCustAccMsgProfitsMessageUpdateUnit")
    protected int outCustAccountMessagesOutGrmCustAccMsgProfitsMessageUpdateUnit;
    @XmlElement(name = "OutCustAccountMessagesOutGrmCustAccMsgProfitsMessageUpdateUser")
    protected String outCustAccountMessagesOutGrmCustAccMsgProfitsMessageUpdateUser;
    @XmlElement(name = "OutCustAccountMessagesOutGrmCustAccMsgSystemGenericDetailDescription")
    protected String outCustAccountMessagesOutGrmCustAccMsgSystemGenericDetailDescription;
    @XmlElement(name = "OutCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailDescription")
    protected String outCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailDescription;
    @XmlElement(name = "OutCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailParameterType")
    protected String outCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailParameterType;
    @XmlElement(name = "OutCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailSerialNum")
    protected int outCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailSerialNum;
    @XmlElement(name = "OutCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailShortDescription")
    protected String outCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailShortDescription;
    @XmlElement(name = "OutCustAccountMessagesOutGrmCustAccMsgUpdateBankemployeeFirstName")
    protected String outCustAccountMessagesOutGrmCustAccMsgUpdateBankemployeeFirstName;
    @XmlElement(name = "OutCustAccountMessagesOutGrmCustAccMsgUpdateBankemployeeLastName")
    protected String outCustAccountMessagesOutGrmCustAccMsgUpdateBankemployeeLastName;
    @XmlElement(name = "OutCustAccountMessagesOutGrmCustAccMsgUpdateUnitUnitUnitName")
    protected String outCustAccountMessagesOutGrmCustAccMsgUpdateUnitUnitUnitName;

    /**
     * Gets the value of the outCustAccountMessagesOutGrmCustAccMsgCreateBankemployeeFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAccountMessagesOutGrmCustAccMsgCreateBankemployeeFirstName() {
        return outCustAccountMessagesOutGrmCustAccMsgCreateBankemployeeFirstName;
    }

    /**
     * Sets the value of the outCustAccountMessagesOutGrmCustAccMsgCreateBankemployeeFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAccountMessagesOutGrmCustAccMsgCreateBankemployeeFirstName(String value) {
        this.outCustAccountMessagesOutGrmCustAccMsgCreateBankemployeeFirstName = value;
    }

    /**
     * Gets the value of the outCustAccountMessagesOutGrmCustAccMsgCreateBankemployeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAccountMessagesOutGrmCustAccMsgCreateBankemployeeLastName() {
        return outCustAccountMessagesOutGrmCustAccMsgCreateBankemployeeLastName;
    }

    /**
     * Sets the value of the outCustAccountMessagesOutGrmCustAccMsgCreateBankemployeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAccountMessagesOutGrmCustAccMsgCreateBankemployeeLastName(String value) {
        this.outCustAccountMessagesOutGrmCustAccMsgCreateBankemployeeLastName = value;
    }

    /**
     * Gets the value of the outCustAccountMessagesOutGrmCustAccMsgCreateUnitUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAccountMessagesOutGrmCustAccMsgCreateUnitUnitUnitName() {
        return outCustAccountMessagesOutGrmCustAccMsgCreateUnitUnitUnitName;
    }

    /**
     * Sets the value of the outCustAccountMessagesOutGrmCustAccMsgCreateUnitUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAccountMessagesOutGrmCustAccMsgCreateUnitUnitUnitName(String value) {
        this.outCustAccountMessagesOutGrmCustAccMsgCreateUnitUnitUnitName = value;
    }

    /**
     * Gets the value of the outCustAccountMessagesOutGrmCustAccMsgIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAccountMessagesOutGrmCustAccMsgIefSuppliedSelectChar() {
        return outCustAccountMessagesOutGrmCustAccMsgIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outCustAccountMessagesOutGrmCustAccMsgIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAccountMessagesOutGrmCustAccMsgIefSuppliedSelectChar(String value) {
        this.outCustAccountMessagesOutGrmCustAccMsgIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsAccountAccountCd property.
     * 
     */
    public short getOutCustAccountMessagesOutGrmCustAccMsgProfitsAccountAccountCd() {
        return outCustAccountMessagesOutGrmCustAccMsgProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsAccountAccountCd property.
     * 
     */
    public void setOutCustAccountMessagesOutGrmCustAccMsgProfitsAccountAccountCd(short value) {
        this.outCustAccountMessagesOutGrmCustAccMsgProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAccountMessagesOutGrmCustAccMsgProfitsAccountAccountNumber() {
        return outCustAccountMessagesOutGrmCustAccMsgProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAccountMessagesOutGrmCustAccMsgProfitsAccountAccountNumber(String value) {
        this.outCustAccountMessagesOutGrmCustAccMsgProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessageActualMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAccountMessagesOutGrmCustAccMsgProfitsMessageActualMessage() {
        return outCustAccountMessagesOutGrmCustAccMsgProfitsMessageActualMessage;
    }

    /**
     * Sets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessageActualMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAccountMessagesOutGrmCustAccMsgProfitsMessageActualMessage(String value) {
        this.outCustAccountMessagesOutGrmCustAccMsgProfitsMessageActualMessage = value;
    }

    /**
     * Gets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessageAllProfiles property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAccountMessagesOutGrmCustAccMsgProfitsMessageAllProfiles() {
        return outCustAccountMessagesOutGrmCustAccMsgProfitsMessageAllProfiles;
    }

    /**
     * Sets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessageAllProfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAccountMessagesOutGrmCustAccMsgProfitsMessageAllProfiles(String value) {
        this.outCustAccountMessagesOutGrmCustAccMsgProfitsMessageAllProfiles = value;
    }

    /**
     * Gets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessageAutomaticCreation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAccountMessagesOutGrmCustAccMsgProfitsMessageAutomaticCreation() {
        return outCustAccountMessagesOutGrmCustAccMsgProfitsMessageAutomaticCreation;
    }

    /**
     * Sets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessageAutomaticCreation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAccountMessagesOutGrmCustAccMsgProfitsMessageAutomaticCreation(String value) {
        this.outCustAccountMessagesOutGrmCustAccMsgProfitsMessageAutomaticCreation = value;
    }

    /**
     * Gets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessageAutomaticReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAccountMessagesOutGrmCustAccMsgProfitsMessageAutomaticReason() {
        return outCustAccountMessagesOutGrmCustAccMsgProfitsMessageAutomaticReason;
    }

    /**
     * Sets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessageAutomaticReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAccountMessagesOutGrmCustAccMsgProfitsMessageAutomaticReason(String value) {
        this.outCustAccountMessagesOutGrmCustAccMsgProfitsMessageAutomaticReason = value;
    }

    /**
     * Gets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessageCreateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustAccountMessagesOutGrmCustAccMsgProfitsMessageCreateDate() {
        return outCustAccountMessagesOutGrmCustAccMsgProfitsMessageCreateDate;
    }

    /**
     * Sets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessageCreateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustAccountMessagesOutGrmCustAccMsgProfitsMessageCreateDate(XMLGregorianCalendar value) {
        this.outCustAccountMessagesOutGrmCustAccMsgProfitsMessageCreateDate = value;
    }

    /**
     * Gets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessageCreateUnit property.
     * 
     */
    public int getOutCustAccountMessagesOutGrmCustAccMsgProfitsMessageCreateUnit() {
        return outCustAccountMessagesOutGrmCustAccMsgProfitsMessageCreateUnit;
    }

    /**
     * Sets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessageCreateUnit property.
     * 
     */
    public void setOutCustAccountMessagesOutGrmCustAccMsgProfitsMessageCreateUnit(int value) {
        this.outCustAccountMessagesOutGrmCustAccMsgProfitsMessageCreateUnit = value;
    }

    /**
     * Gets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessageCreateUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAccountMessagesOutGrmCustAccMsgProfitsMessageCreateUser() {
        return outCustAccountMessagesOutGrmCustAccMsgProfitsMessageCreateUser;
    }

    /**
     * Sets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessageCreateUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAccountMessagesOutGrmCustAccMsgProfitsMessageCreateUser(String value) {
        this.outCustAccountMessagesOutGrmCustAccMsgProfitsMessageCreateUser = value;
    }

    /**
     * Gets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessageCustId property.
     * 
     */
    public int getOutCustAccountMessagesOutGrmCustAccMsgProfitsMessageCustId() {
        return outCustAccountMessagesOutGrmCustAccMsgProfitsMessageCustId;
    }

    /**
     * Sets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessageCustId property.
     * 
     */
    public void setOutCustAccountMessagesOutGrmCustAccMsgProfitsMessageCustId(int value) {
        this.outCustAccountMessagesOutGrmCustAccMsgProfitsMessageCustId = value;
    }

    /**
     * Gets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessageExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustAccountMessagesOutGrmCustAccMsgProfitsMessageExpirationDate() {
        return outCustAccountMessagesOutGrmCustAccMsgProfitsMessageExpirationDate;
    }

    /**
     * Sets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessageExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustAccountMessagesOutGrmCustAccMsgProfitsMessageExpirationDate(XMLGregorianCalendar value) {
        this.outCustAccountMessagesOutGrmCustAccMsgProfitsMessageExpirationDate = value;
    }

    /**
     * Gets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessageMandatoryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAccountMessagesOutGrmCustAccMsgProfitsMessageMandatoryDetails() {
        return outCustAccountMessagesOutGrmCustAccMsgProfitsMessageMandatoryDetails;
    }

    /**
     * Sets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessageMandatoryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAccountMessagesOutGrmCustAccMsgProfitsMessageMandatoryDetails(String value) {
        this.outCustAccountMessagesOutGrmCustAccMsgProfitsMessageMandatoryDetails = value;
    }

    /**
     * Gets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessageMsgReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAccountMessagesOutGrmCustAccMsgProfitsMessageMsgReason() {
        return outCustAccountMessagesOutGrmCustAccMsgProfitsMessageMsgReason;
    }

    /**
     * Sets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessageMsgReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAccountMessagesOutGrmCustAccMsgProfitsMessageMsgReason(String value) {
        this.outCustAccountMessagesOutGrmCustAccMsgProfitsMessageMsgReason = value;
    }

    /**
     * Gets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessageOtherChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAccountMessagesOutGrmCustAccMsgProfitsMessageOtherChannel() {
        return outCustAccountMessagesOutGrmCustAccMsgProfitsMessageOtherChannel;
    }

    /**
     * Sets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessageOtherChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAccountMessagesOutGrmCustAccMsgProfitsMessageOtherChannel(String value) {
        this.outCustAccountMessagesOutGrmCustAccMsgProfitsMessageOtherChannel = value;
    }

    /**
     * Gets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessagePrftSystem property.
     * 
     */
    public short getOutCustAccountMessagesOutGrmCustAccMsgProfitsMessagePrftSystem() {
        return outCustAccountMessagesOutGrmCustAccMsgProfitsMessagePrftSystem;
    }

    /**
     * Sets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessagePrftSystem property.
     * 
     */
    public void setOutCustAccountMessagesOutGrmCustAccMsgProfitsMessagePrftSystem(short value) {
        this.outCustAccountMessagesOutGrmCustAccMsgProfitsMessagePrftSystem = value;
    }

    /**
     * Gets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessageSn property.
     * 
     */
    public double getOutCustAccountMessagesOutGrmCustAccMsgProfitsMessageSn() {
        return outCustAccountMessagesOutGrmCustAccMsgProfitsMessageSn;
    }

    /**
     * Sets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessageSn property.
     * 
     */
    public void setOutCustAccountMessagesOutGrmCustAccMsgProfitsMessageSn(double value) {
        this.outCustAccountMessagesOutGrmCustAccMsgProfitsMessageSn = value;
    }

    /**
     * Gets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessageTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustAccountMessagesOutGrmCustAccMsgProfitsMessageTmstamp() {
        return outCustAccountMessagesOutGrmCustAccMsgProfitsMessageTmstamp;
    }

    /**
     * Sets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessageTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustAccountMessagesOutGrmCustAccMsgProfitsMessageTmstamp(XMLGregorianCalendar value) {
        this.outCustAccountMessagesOutGrmCustAccMsgProfitsMessageTmstamp = value;
    }

    /**
     * Gets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessageUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustAccountMessagesOutGrmCustAccMsgProfitsMessageUpdateDate() {
        return outCustAccountMessagesOutGrmCustAccMsgProfitsMessageUpdateDate;
    }

    /**
     * Sets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessageUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustAccountMessagesOutGrmCustAccMsgProfitsMessageUpdateDate(XMLGregorianCalendar value) {
        this.outCustAccountMessagesOutGrmCustAccMsgProfitsMessageUpdateDate = value;
    }

    /**
     * Gets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessageUpdateUnit property.
     * 
     */
    public int getOutCustAccountMessagesOutGrmCustAccMsgProfitsMessageUpdateUnit() {
        return outCustAccountMessagesOutGrmCustAccMsgProfitsMessageUpdateUnit;
    }

    /**
     * Sets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessageUpdateUnit property.
     * 
     */
    public void setOutCustAccountMessagesOutGrmCustAccMsgProfitsMessageUpdateUnit(int value) {
        this.outCustAccountMessagesOutGrmCustAccMsgProfitsMessageUpdateUnit = value;
    }

    /**
     * Gets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessageUpdateUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAccountMessagesOutGrmCustAccMsgProfitsMessageUpdateUser() {
        return outCustAccountMessagesOutGrmCustAccMsgProfitsMessageUpdateUser;
    }

    /**
     * Sets the value of the outCustAccountMessagesOutGrmCustAccMsgProfitsMessageUpdateUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAccountMessagesOutGrmCustAccMsgProfitsMessageUpdateUser(String value) {
        this.outCustAccountMessagesOutGrmCustAccMsgProfitsMessageUpdateUser = value;
    }

    /**
     * Gets the value of the outCustAccountMessagesOutGrmCustAccMsgSystemGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAccountMessagesOutGrmCustAccMsgSystemGenericDetailDescription() {
        return outCustAccountMessagesOutGrmCustAccMsgSystemGenericDetailDescription;
    }

    /**
     * Sets the value of the outCustAccountMessagesOutGrmCustAccMsgSystemGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAccountMessagesOutGrmCustAccMsgSystemGenericDetailDescription(String value) {
        this.outCustAccountMessagesOutGrmCustAccMsgSystemGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailDescription() {
        return outCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailDescription;
    }

    /**
     * Sets the value of the outCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailDescription(String value) {
        this.outCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailParameterType() {
        return outCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailParameterType;
    }

    /**
     * Sets the value of the outCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailParameterType(String value) {
        this.outCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailSerialNum property.
     * 
     */
    public int getOutCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailSerialNum() {
        return outCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailSerialNum property.
     * 
     */
    public void setOutCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailSerialNum(int value) {
        this.outCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailShortDescription() {
        return outCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailShortDescription(String value) {
        this.outCustAccountMessagesOutGrmCustAccMsgTypeMessagGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outCustAccountMessagesOutGrmCustAccMsgUpdateBankemployeeFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAccountMessagesOutGrmCustAccMsgUpdateBankemployeeFirstName() {
        return outCustAccountMessagesOutGrmCustAccMsgUpdateBankemployeeFirstName;
    }

    /**
     * Sets the value of the outCustAccountMessagesOutGrmCustAccMsgUpdateBankemployeeFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAccountMessagesOutGrmCustAccMsgUpdateBankemployeeFirstName(String value) {
        this.outCustAccountMessagesOutGrmCustAccMsgUpdateBankemployeeFirstName = value;
    }

    /**
     * Gets the value of the outCustAccountMessagesOutGrmCustAccMsgUpdateBankemployeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAccountMessagesOutGrmCustAccMsgUpdateBankemployeeLastName() {
        return outCustAccountMessagesOutGrmCustAccMsgUpdateBankemployeeLastName;
    }

    /**
     * Sets the value of the outCustAccountMessagesOutGrmCustAccMsgUpdateBankemployeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAccountMessagesOutGrmCustAccMsgUpdateBankemployeeLastName(String value) {
        this.outCustAccountMessagesOutGrmCustAccMsgUpdateBankemployeeLastName = value;
    }

    /**
     * Gets the value of the outCustAccountMessagesOutGrmCustAccMsgUpdateUnitUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAccountMessagesOutGrmCustAccMsgUpdateUnitUnitUnitName() {
        return outCustAccountMessagesOutGrmCustAccMsgUpdateUnitUnitUnitName;
    }

    /**
     * Sets the value of the outCustAccountMessagesOutGrmCustAccMsgUpdateUnitUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAccountMessagesOutGrmCustAccMsgUpdateUnitUnitUnitName(String value) {
        this.outCustAccountMessagesOutGrmCustAccMsgUpdateUnitUnitUnitName = value;
    }

}
