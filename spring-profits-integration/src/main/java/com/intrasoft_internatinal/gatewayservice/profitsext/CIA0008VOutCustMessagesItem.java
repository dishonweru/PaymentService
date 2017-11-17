
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CIA0008VOutCustMessagesItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CIA0008VOutCustMessagesItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutCustMessagesOutGrmCustMsgCreateBankemployeeFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustMessagesOutGrmCustMsgCreateBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustMessagesOutGrmCustMsgCreateUnitUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustMessagesOutGrmCustMsgIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustMessagesOutGrmCustMsgProfitsMessageActualMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustMessagesOutGrmCustMsgProfitsMessageAllProfiles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustMessagesOutGrmCustMsgProfitsMessageAutomaticCreation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustMessagesOutGrmCustMsgProfitsMessageAutomaticReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustMessagesOutGrmCustMsgProfitsMessageCreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustMessagesOutGrmCustMsgProfitsMessageCreateUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustMessagesOutGrmCustMsgProfitsMessageCreateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustMessagesOutGrmCustMsgProfitsMessageCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustMessagesOutGrmCustMsgProfitsMessageExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustMessagesOutGrmCustMsgProfitsMessageMandatoryDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustMessagesOutGrmCustMsgProfitsMessageMsgReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustMessagesOutGrmCustMsgProfitsMessageOtherChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustMessagesOutGrmCustMsgProfitsMessageSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutCustMessagesOutGrmCustMsgProfitsMessageTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustMessagesOutGrmCustMsgProfitsMessageUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustMessagesOutGrmCustMsgProfitsMessageUpdateUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustMessagesOutGrmCustMsgProfitsMessageUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustMessagesOutGrmCustMsgTypeMessageGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustMessagesOutGrmCustMsgTypeMessageGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustMessagesOutGrmCustMsgTypeMessageGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustMessagesOutGrmCustMsgTypeMessageGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustMessagesOutGrmCustMsgUpdateBankemployeeFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustMessagesOutGrmCustMsgUpdateBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustMessagesOutGrmCustMsgUpdateUnitUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CIA0008VOutCustMessagesItem", propOrder = {
    "outCustMessagesOutGrmCustMsgCreateBankemployeeFirstName",
    "outCustMessagesOutGrmCustMsgCreateBankemployeeLastName",
    "outCustMessagesOutGrmCustMsgCreateUnitUnitUnitName",
    "outCustMessagesOutGrmCustMsgIefSuppliedSelectChar",
    "outCustMessagesOutGrmCustMsgProfitsMessageActualMessage",
    "outCustMessagesOutGrmCustMsgProfitsMessageAllProfiles",
    "outCustMessagesOutGrmCustMsgProfitsMessageAutomaticCreation",
    "outCustMessagesOutGrmCustMsgProfitsMessageAutomaticReason",
    "outCustMessagesOutGrmCustMsgProfitsMessageCreateDate",
    "outCustMessagesOutGrmCustMsgProfitsMessageCreateUnit",
    "outCustMessagesOutGrmCustMsgProfitsMessageCreateUser",
    "outCustMessagesOutGrmCustMsgProfitsMessageCustId",
    "outCustMessagesOutGrmCustMsgProfitsMessageExpirationDate",
    "outCustMessagesOutGrmCustMsgProfitsMessageMandatoryDetails",
    "outCustMessagesOutGrmCustMsgProfitsMessageMsgReason",
    "outCustMessagesOutGrmCustMsgProfitsMessageOtherChannel",
    "outCustMessagesOutGrmCustMsgProfitsMessageSn",
    "outCustMessagesOutGrmCustMsgProfitsMessageTmstamp",
    "outCustMessagesOutGrmCustMsgProfitsMessageUpdateDate",
    "outCustMessagesOutGrmCustMsgProfitsMessageUpdateUnit",
    "outCustMessagesOutGrmCustMsgProfitsMessageUpdateUser",
    "outCustMessagesOutGrmCustMsgTypeMessageGenericDetailDescription",
    "outCustMessagesOutGrmCustMsgTypeMessageGenericDetailParameterType",
    "outCustMessagesOutGrmCustMsgTypeMessageGenericDetailSerialNum",
    "outCustMessagesOutGrmCustMsgTypeMessageGenericDetailShortDescription",
    "outCustMessagesOutGrmCustMsgUpdateBankemployeeFirstName",
    "outCustMessagesOutGrmCustMsgUpdateBankemployeeLastName",
    "outCustMessagesOutGrmCustMsgUpdateUnitUnitUnitName"
})
public class CIA0008VOutCustMessagesItem {

    @XmlElement(name = "OutCustMessagesOutGrmCustMsgCreateBankemployeeFirstName")
    protected String outCustMessagesOutGrmCustMsgCreateBankemployeeFirstName;
    @XmlElement(name = "OutCustMessagesOutGrmCustMsgCreateBankemployeeLastName")
    protected String outCustMessagesOutGrmCustMsgCreateBankemployeeLastName;
    @XmlElement(name = "OutCustMessagesOutGrmCustMsgCreateUnitUnitUnitName")
    protected String outCustMessagesOutGrmCustMsgCreateUnitUnitUnitName;
    @XmlElement(name = "OutCustMessagesOutGrmCustMsgIefSuppliedSelectChar")
    protected String outCustMessagesOutGrmCustMsgIefSuppliedSelectChar;
    @XmlElement(name = "OutCustMessagesOutGrmCustMsgProfitsMessageActualMessage")
    protected String outCustMessagesOutGrmCustMsgProfitsMessageActualMessage;
    @XmlElement(name = "OutCustMessagesOutGrmCustMsgProfitsMessageAllProfiles")
    protected String outCustMessagesOutGrmCustMsgProfitsMessageAllProfiles;
    @XmlElement(name = "OutCustMessagesOutGrmCustMsgProfitsMessageAutomaticCreation")
    protected String outCustMessagesOutGrmCustMsgProfitsMessageAutomaticCreation;
    @XmlElement(name = "OutCustMessagesOutGrmCustMsgProfitsMessageAutomaticReason")
    protected String outCustMessagesOutGrmCustMsgProfitsMessageAutomaticReason;
    @XmlElement(name = "OutCustMessagesOutGrmCustMsgProfitsMessageCreateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustMessagesOutGrmCustMsgProfitsMessageCreateDate;
    @XmlElement(name = "OutCustMessagesOutGrmCustMsgProfitsMessageCreateUnit")
    protected int outCustMessagesOutGrmCustMsgProfitsMessageCreateUnit;
    @XmlElement(name = "OutCustMessagesOutGrmCustMsgProfitsMessageCreateUser")
    protected String outCustMessagesOutGrmCustMsgProfitsMessageCreateUser;
    @XmlElement(name = "OutCustMessagesOutGrmCustMsgProfitsMessageCustId")
    protected int outCustMessagesOutGrmCustMsgProfitsMessageCustId;
    @XmlElement(name = "OutCustMessagesOutGrmCustMsgProfitsMessageExpirationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustMessagesOutGrmCustMsgProfitsMessageExpirationDate;
    @XmlElement(name = "OutCustMessagesOutGrmCustMsgProfitsMessageMandatoryDetails")
    protected String outCustMessagesOutGrmCustMsgProfitsMessageMandatoryDetails;
    @XmlElement(name = "OutCustMessagesOutGrmCustMsgProfitsMessageMsgReason")
    protected String outCustMessagesOutGrmCustMsgProfitsMessageMsgReason;
    @XmlElement(name = "OutCustMessagesOutGrmCustMsgProfitsMessageOtherChannel")
    protected String outCustMessagesOutGrmCustMsgProfitsMessageOtherChannel;
    @XmlElement(name = "OutCustMessagesOutGrmCustMsgProfitsMessageSn")
    protected double outCustMessagesOutGrmCustMsgProfitsMessageSn;
    @XmlElement(name = "OutCustMessagesOutGrmCustMsgProfitsMessageTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustMessagesOutGrmCustMsgProfitsMessageTmstamp;
    @XmlElement(name = "OutCustMessagesOutGrmCustMsgProfitsMessageUpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustMessagesOutGrmCustMsgProfitsMessageUpdateDate;
    @XmlElement(name = "OutCustMessagesOutGrmCustMsgProfitsMessageUpdateUnit")
    protected int outCustMessagesOutGrmCustMsgProfitsMessageUpdateUnit;
    @XmlElement(name = "OutCustMessagesOutGrmCustMsgProfitsMessageUpdateUser")
    protected String outCustMessagesOutGrmCustMsgProfitsMessageUpdateUser;
    @XmlElement(name = "OutCustMessagesOutGrmCustMsgTypeMessageGenericDetailDescription")
    protected String outCustMessagesOutGrmCustMsgTypeMessageGenericDetailDescription;
    @XmlElement(name = "OutCustMessagesOutGrmCustMsgTypeMessageGenericDetailParameterType")
    protected String outCustMessagesOutGrmCustMsgTypeMessageGenericDetailParameterType;
    @XmlElement(name = "OutCustMessagesOutGrmCustMsgTypeMessageGenericDetailSerialNum")
    protected int outCustMessagesOutGrmCustMsgTypeMessageGenericDetailSerialNum;
    @XmlElement(name = "OutCustMessagesOutGrmCustMsgTypeMessageGenericDetailShortDescription")
    protected String outCustMessagesOutGrmCustMsgTypeMessageGenericDetailShortDescription;
    @XmlElement(name = "OutCustMessagesOutGrmCustMsgUpdateBankemployeeFirstName")
    protected String outCustMessagesOutGrmCustMsgUpdateBankemployeeFirstName;
    @XmlElement(name = "OutCustMessagesOutGrmCustMsgUpdateBankemployeeLastName")
    protected String outCustMessagesOutGrmCustMsgUpdateBankemployeeLastName;
    @XmlElement(name = "OutCustMessagesOutGrmCustMsgUpdateUnitUnitUnitName")
    protected String outCustMessagesOutGrmCustMsgUpdateUnitUnitUnitName;

    /**
     * Gets the value of the outCustMessagesOutGrmCustMsgCreateBankemployeeFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustMessagesOutGrmCustMsgCreateBankemployeeFirstName() {
        return outCustMessagesOutGrmCustMsgCreateBankemployeeFirstName;
    }

    /**
     * Sets the value of the outCustMessagesOutGrmCustMsgCreateBankemployeeFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustMessagesOutGrmCustMsgCreateBankemployeeFirstName(String value) {
        this.outCustMessagesOutGrmCustMsgCreateBankemployeeFirstName = value;
    }

    /**
     * Gets the value of the outCustMessagesOutGrmCustMsgCreateBankemployeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustMessagesOutGrmCustMsgCreateBankemployeeLastName() {
        return outCustMessagesOutGrmCustMsgCreateBankemployeeLastName;
    }

    /**
     * Sets the value of the outCustMessagesOutGrmCustMsgCreateBankemployeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustMessagesOutGrmCustMsgCreateBankemployeeLastName(String value) {
        this.outCustMessagesOutGrmCustMsgCreateBankemployeeLastName = value;
    }

    /**
     * Gets the value of the outCustMessagesOutGrmCustMsgCreateUnitUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustMessagesOutGrmCustMsgCreateUnitUnitUnitName() {
        return outCustMessagesOutGrmCustMsgCreateUnitUnitUnitName;
    }

    /**
     * Sets the value of the outCustMessagesOutGrmCustMsgCreateUnitUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustMessagesOutGrmCustMsgCreateUnitUnitUnitName(String value) {
        this.outCustMessagesOutGrmCustMsgCreateUnitUnitUnitName = value;
    }

    /**
     * Gets the value of the outCustMessagesOutGrmCustMsgIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustMessagesOutGrmCustMsgIefSuppliedSelectChar() {
        return outCustMessagesOutGrmCustMsgIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outCustMessagesOutGrmCustMsgIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustMessagesOutGrmCustMsgIefSuppliedSelectChar(String value) {
        this.outCustMessagesOutGrmCustMsgIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outCustMessagesOutGrmCustMsgProfitsMessageActualMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustMessagesOutGrmCustMsgProfitsMessageActualMessage() {
        return outCustMessagesOutGrmCustMsgProfitsMessageActualMessage;
    }

    /**
     * Sets the value of the outCustMessagesOutGrmCustMsgProfitsMessageActualMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustMessagesOutGrmCustMsgProfitsMessageActualMessage(String value) {
        this.outCustMessagesOutGrmCustMsgProfitsMessageActualMessage = value;
    }

    /**
     * Gets the value of the outCustMessagesOutGrmCustMsgProfitsMessageAllProfiles property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustMessagesOutGrmCustMsgProfitsMessageAllProfiles() {
        return outCustMessagesOutGrmCustMsgProfitsMessageAllProfiles;
    }

    /**
     * Sets the value of the outCustMessagesOutGrmCustMsgProfitsMessageAllProfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustMessagesOutGrmCustMsgProfitsMessageAllProfiles(String value) {
        this.outCustMessagesOutGrmCustMsgProfitsMessageAllProfiles = value;
    }

    /**
     * Gets the value of the outCustMessagesOutGrmCustMsgProfitsMessageAutomaticCreation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustMessagesOutGrmCustMsgProfitsMessageAutomaticCreation() {
        return outCustMessagesOutGrmCustMsgProfitsMessageAutomaticCreation;
    }

    /**
     * Sets the value of the outCustMessagesOutGrmCustMsgProfitsMessageAutomaticCreation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustMessagesOutGrmCustMsgProfitsMessageAutomaticCreation(String value) {
        this.outCustMessagesOutGrmCustMsgProfitsMessageAutomaticCreation = value;
    }

    /**
     * Gets the value of the outCustMessagesOutGrmCustMsgProfitsMessageAutomaticReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustMessagesOutGrmCustMsgProfitsMessageAutomaticReason() {
        return outCustMessagesOutGrmCustMsgProfitsMessageAutomaticReason;
    }

    /**
     * Sets the value of the outCustMessagesOutGrmCustMsgProfitsMessageAutomaticReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustMessagesOutGrmCustMsgProfitsMessageAutomaticReason(String value) {
        this.outCustMessagesOutGrmCustMsgProfitsMessageAutomaticReason = value;
    }

    /**
     * Gets the value of the outCustMessagesOutGrmCustMsgProfitsMessageCreateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustMessagesOutGrmCustMsgProfitsMessageCreateDate() {
        return outCustMessagesOutGrmCustMsgProfitsMessageCreateDate;
    }

    /**
     * Sets the value of the outCustMessagesOutGrmCustMsgProfitsMessageCreateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustMessagesOutGrmCustMsgProfitsMessageCreateDate(XMLGregorianCalendar value) {
        this.outCustMessagesOutGrmCustMsgProfitsMessageCreateDate = value;
    }

    /**
     * Gets the value of the outCustMessagesOutGrmCustMsgProfitsMessageCreateUnit property.
     * 
     */
    public int getOutCustMessagesOutGrmCustMsgProfitsMessageCreateUnit() {
        return outCustMessagesOutGrmCustMsgProfitsMessageCreateUnit;
    }

    /**
     * Sets the value of the outCustMessagesOutGrmCustMsgProfitsMessageCreateUnit property.
     * 
     */
    public void setOutCustMessagesOutGrmCustMsgProfitsMessageCreateUnit(int value) {
        this.outCustMessagesOutGrmCustMsgProfitsMessageCreateUnit = value;
    }

    /**
     * Gets the value of the outCustMessagesOutGrmCustMsgProfitsMessageCreateUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustMessagesOutGrmCustMsgProfitsMessageCreateUser() {
        return outCustMessagesOutGrmCustMsgProfitsMessageCreateUser;
    }

    /**
     * Sets the value of the outCustMessagesOutGrmCustMsgProfitsMessageCreateUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustMessagesOutGrmCustMsgProfitsMessageCreateUser(String value) {
        this.outCustMessagesOutGrmCustMsgProfitsMessageCreateUser = value;
    }

    /**
     * Gets the value of the outCustMessagesOutGrmCustMsgProfitsMessageCustId property.
     * 
     */
    public int getOutCustMessagesOutGrmCustMsgProfitsMessageCustId() {
        return outCustMessagesOutGrmCustMsgProfitsMessageCustId;
    }

    /**
     * Sets the value of the outCustMessagesOutGrmCustMsgProfitsMessageCustId property.
     * 
     */
    public void setOutCustMessagesOutGrmCustMsgProfitsMessageCustId(int value) {
        this.outCustMessagesOutGrmCustMsgProfitsMessageCustId = value;
    }

    /**
     * Gets the value of the outCustMessagesOutGrmCustMsgProfitsMessageExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustMessagesOutGrmCustMsgProfitsMessageExpirationDate() {
        return outCustMessagesOutGrmCustMsgProfitsMessageExpirationDate;
    }

    /**
     * Sets the value of the outCustMessagesOutGrmCustMsgProfitsMessageExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustMessagesOutGrmCustMsgProfitsMessageExpirationDate(XMLGregorianCalendar value) {
        this.outCustMessagesOutGrmCustMsgProfitsMessageExpirationDate = value;
    }

    /**
     * Gets the value of the outCustMessagesOutGrmCustMsgProfitsMessageMandatoryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustMessagesOutGrmCustMsgProfitsMessageMandatoryDetails() {
        return outCustMessagesOutGrmCustMsgProfitsMessageMandatoryDetails;
    }

    /**
     * Sets the value of the outCustMessagesOutGrmCustMsgProfitsMessageMandatoryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustMessagesOutGrmCustMsgProfitsMessageMandatoryDetails(String value) {
        this.outCustMessagesOutGrmCustMsgProfitsMessageMandatoryDetails = value;
    }

    /**
     * Gets the value of the outCustMessagesOutGrmCustMsgProfitsMessageMsgReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustMessagesOutGrmCustMsgProfitsMessageMsgReason() {
        return outCustMessagesOutGrmCustMsgProfitsMessageMsgReason;
    }

    /**
     * Sets the value of the outCustMessagesOutGrmCustMsgProfitsMessageMsgReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustMessagesOutGrmCustMsgProfitsMessageMsgReason(String value) {
        this.outCustMessagesOutGrmCustMsgProfitsMessageMsgReason = value;
    }

    /**
     * Gets the value of the outCustMessagesOutGrmCustMsgProfitsMessageOtherChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustMessagesOutGrmCustMsgProfitsMessageOtherChannel() {
        return outCustMessagesOutGrmCustMsgProfitsMessageOtherChannel;
    }

    /**
     * Sets the value of the outCustMessagesOutGrmCustMsgProfitsMessageOtherChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustMessagesOutGrmCustMsgProfitsMessageOtherChannel(String value) {
        this.outCustMessagesOutGrmCustMsgProfitsMessageOtherChannel = value;
    }

    /**
     * Gets the value of the outCustMessagesOutGrmCustMsgProfitsMessageSn property.
     * 
     */
    public double getOutCustMessagesOutGrmCustMsgProfitsMessageSn() {
        return outCustMessagesOutGrmCustMsgProfitsMessageSn;
    }

    /**
     * Sets the value of the outCustMessagesOutGrmCustMsgProfitsMessageSn property.
     * 
     */
    public void setOutCustMessagesOutGrmCustMsgProfitsMessageSn(double value) {
        this.outCustMessagesOutGrmCustMsgProfitsMessageSn = value;
    }

    /**
     * Gets the value of the outCustMessagesOutGrmCustMsgProfitsMessageTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustMessagesOutGrmCustMsgProfitsMessageTmstamp() {
        return outCustMessagesOutGrmCustMsgProfitsMessageTmstamp;
    }

    /**
     * Sets the value of the outCustMessagesOutGrmCustMsgProfitsMessageTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustMessagesOutGrmCustMsgProfitsMessageTmstamp(XMLGregorianCalendar value) {
        this.outCustMessagesOutGrmCustMsgProfitsMessageTmstamp = value;
    }

    /**
     * Gets the value of the outCustMessagesOutGrmCustMsgProfitsMessageUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustMessagesOutGrmCustMsgProfitsMessageUpdateDate() {
        return outCustMessagesOutGrmCustMsgProfitsMessageUpdateDate;
    }

    /**
     * Sets the value of the outCustMessagesOutGrmCustMsgProfitsMessageUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustMessagesOutGrmCustMsgProfitsMessageUpdateDate(XMLGregorianCalendar value) {
        this.outCustMessagesOutGrmCustMsgProfitsMessageUpdateDate = value;
    }

    /**
     * Gets the value of the outCustMessagesOutGrmCustMsgProfitsMessageUpdateUnit property.
     * 
     */
    public int getOutCustMessagesOutGrmCustMsgProfitsMessageUpdateUnit() {
        return outCustMessagesOutGrmCustMsgProfitsMessageUpdateUnit;
    }

    /**
     * Sets the value of the outCustMessagesOutGrmCustMsgProfitsMessageUpdateUnit property.
     * 
     */
    public void setOutCustMessagesOutGrmCustMsgProfitsMessageUpdateUnit(int value) {
        this.outCustMessagesOutGrmCustMsgProfitsMessageUpdateUnit = value;
    }

    /**
     * Gets the value of the outCustMessagesOutGrmCustMsgProfitsMessageUpdateUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustMessagesOutGrmCustMsgProfitsMessageUpdateUser() {
        return outCustMessagesOutGrmCustMsgProfitsMessageUpdateUser;
    }

    /**
     * Sets the value of the outCustMessagesOutGrmCustMsgProfitsMessageUpdateUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustMessagesOutGrmCustMsgProfitsMessageUpdateUser(String value) {
        this.outCustMessagesOutGrmCustMsgProfitsMessageUpdateUser = value;
    }

    /**
     * Gets the value of the outCustMessagesOutGrmCustMsgTypeMessageGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustMessagesOutGrmCustMsgTypeMessageGenericDetailDescription() {
        return outCustMessagesOutGrmCustMsgTypeMessageGenericDetailDescription;
    }

    /**
     * Sets the value of the outCustMessagesOutGrmCustMsgTypeMessageGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustMessagesOutGrmCustMsgTypeMessageGenericDetailDescription(String value) {
        this.outCustMessagesOutGrmCustMsgTypeMessageGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outCustMessagesOutGrmCustMsgTypeMessageGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustMessagesOutGrmCustMsgTypeMessageGenericDetailParameterType() {
        return outCustMessagesOutGrmCustMsgTypeMessageGenericDetailParameterType;
    }

    /**
     * Sets the value of the outCustMessagesOutGrmCustMsgTypeMessageGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustMessagesOutGrmCustMsgTypeMessageGenericDetailParameterType(String value) {
        this.outCustMessagesOutGrmCustMsgTypeMessageGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outCustMessagesOutGrmCustMsgTypeMessageGenericDetailSerialNum property.
     * 
     */
    public int getOutCustMessagesOutGrmCustMsgTypeMessageGenericDetailSerialNum() {
        return outCustMessagesOutGrmCustMsgTypeMessageGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outCustMessagesOutGrmCustMsgTypeMessageGenericDetailSerialNum property.
     * 
     */
    public void setOutCustMessagesOutGrmCustMsgTypeMessageGenericDetailSerialNum(int value) {
        this.outCustMessagesOutGrmCustMsgTypeMessageGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outCustMessagesOutGrmCustMsgTypeMessageGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustMessagesOutGrmCustMsgTypeMessageGenericDetailShortDescription() {
        return outCustMessagesOutGrmCustMsgTypeMessageGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outCustMessagesOutGrmCustMsgTypeMessageGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustMessagesOutGrmCustMsgTypeMessageGenericDetailShortDescription(String value) {
        this.outCustMessagesOutGrmCustMsgTypeMessageGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outCustMessagesOutGrmCustMsgUpdateBankemployeeFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustMessagesOutGrmCustMsgUpdateBankemployeeFirstName() {
        return outCustMessagesOutGrmCustMsgUpdateBankemployeeFirstName;
    }

    /**
     * Sets the value of the outCustMessagesOutGrmCustMsgUpdateBankemployeeFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustMessagesOutGrmCustMsgUpdateBankemployeeFirstName(String value) {
        this.outCustMessagesOutGrmCustMsgUpdateBankemployeeFirstName = value;
    }

    /**
     * Gets the value of the outCustMessagesOutGrmCustMsgUpdateBankemployeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustMessagesOutGrmCustMsgUpdateBankemployeeLastName() {
        return outCustMessagesOutGrmCustMsgUpdateBankemployeeLastName;
    }

    /**
     * Sets the value of the outCustMessagesOutGrmCustMsgUpdateBankemployeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustMessagesOutGrmCustMsgUpdateBankemployeeLastName(String value) {
        this.outCustMessagesOutGrmCustMsgUpdateBankemployeeLastName = value;
    }

    /**
     * Gets the value of the outCustMessagesOutGrmCustMsgUpdateUnitUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustMessagesOutGrmCustMsgUpdateUnitUnitUnitName() {
        return outCustMessagesOutGrmCustMsgUpdateUnitUnitUnitName;
    }

    /**
     * Sets the value of the outCustMessagesOutGrmCustMsgUpdateUnitUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustMessagesOutGrmCustMsgUpdateUnitUnitUnitName(String value) {
        this.outCustMessagesOutGrmCustMsgUpdateUnitUnitUnitName = value;
    }

}
