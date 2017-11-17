
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for S0705VProfitsUserMaintenanceImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S0705VProfitsUserMaintenanceImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCodeBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCodeUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCodeUnitCategoryPerRoleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCodeUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCodeUsrEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDeptSrvGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InEncryptedUsrPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpacGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLogMntRecordingAuthorizer1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingAuthorizer2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingChannelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLogMntRecordingPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLogMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedDistrChannelIdChannel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTimestampUsrTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InUsrAccountingOrig" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InUsrActivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InUsrAkSellerCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InUsrAtmUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InUsrDeactivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InUsrEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InUsrEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InUsrEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InUsrFri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InUsrGlLevel" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InUsrLimitedAccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InUsrMobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InUsrMon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InUsrNonHouseUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InUsrOffsideUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InUsrPassDigest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InUsrPassTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InUsrPermUnits" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InUsrRmInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InUsrSat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InUsrStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InUsrSun" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InUsrThu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InUsrTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InUsrTue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InUsrVirtualUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InUsrWed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InUsrWorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S0705VProfitsUserMaintenanceImport", propOrder = {
    "command",
    "inCodeBankemployeeId",
    "inCodeUnitCode",
    "inCodeUnitCategoryPerRoleId",
    "inCodeUsrCode",
    "inCodeUsrEmail",
    "inDeptSrvGenericDetailSerialNum",
    "inEncryptedUsrPassword",
    "inGrpacGenericDetailSerialNum",
    "inJustificIdJustific",
    "inLogMntRecordingAuthorizer1",
    "inLogMntRecordingAuthorizer2",
    "inLogMntRecordingChannelId",
    "inLogMntRecordingPrftSystem",
    "inLogMntRecordingReversalFlag",
    "inLogMntRecordingTerminalNumber",
    "inLogMntRecordingTrxCode",
    "inProductIdProduct",
    "inSelectedDistrChannelIdChannel",
    "inTimestampUsrTmstamp",
    "inUsrAccountingOrig",
    "inUsrActivationDate",
    "inUsrAkSellerCode",
    "inUsrAtmUser",
    "inUsrCode",
    "inUsrDeactivationDate",
    "inUsrEmail",
    "inUsrEndTime",
    "inUsrEntryStatus",
    "inUsrFri",
    "inUsrGlLevel",
    "inUsrLimitedAccess",
    "inUsrMobilePhone",
    "inUsrMon",
    "inUsrNonHouseUnit",
    "inUsrOffsideUnit",
    "inUsrPassDigest",
    "inUsrPassTmstamp",
    "inUsrPermUnits",
    "inUsrRmInd",
    "inUsrSat",
    "inUsrStartTime",
    "inUsrSun",
    "inUsrThu",
    "inUsrTmstamp",
    "inUsrTue",
    "inUsrVirtualUser",
    "inUsrWed",
    "inUsrWorkPhone"
})
public class S0705VProfitsUserMaintenanceImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InCodeBankemployeeId")
    protected String inCodeBankemployeeId;
    @XmlElement(name = "InCodeUnitCode")
    protected int inCodeUnitCode;
    @XmlElement(name = "InCodeUnitCategoryPerRoleId")
    protected String inCodeUnitCategoryPerRoleId;
    @XmlElement(name = "InCodeUsrCode")
    protected String inCodeUsrCode;
    @XmlElement(name = "InCodeUsrEmail")
    protected String inCodeUsrEmail;
    @XmlElement(name = "InDeptSrvGenericDetailSerialNum")
    protected int inDeptSrvGenericDetailSerialNum;
    @XmlElement(name = "InEncryptedUsrPassword")
    protected String inEncryptedUsrPassword;
    @XmlElement(name = "InGrpacGenericDetailSerialNum")
    protected int inGrpacGenericDetailSerialNum;
    @XmlElement(name = "InJustificIdJustific")
    protected int inJustificIdJustific;
    @XmlElement(name = "InLogMntRecordingAuthorizer1")
    protected String inLogMntRecordingAuthorizer1;
    @XmlElement(name = "InLogMntRecordingAuthorizer2")
    protected String inLogMntRecordingAuthorizer2;
    @XmlElement(name = "InLogMntRecordingChannelId")
    protected int inLogMntRecordingChannelId;
    @XmlElement(name = "InLogMntRecordingPrftSystem")
    protected short inLogMntRecordingPrftSystem;
    @XmlElement(name = "InLogMntRecordingReversalFlag")
    protected String inLogMntRecordingReversalFlag;
    @XmlElement(name = "InLogMntRecordingTerminalNumber")
    protected String inLogMntRecordingTerminalNumber;
    @XmlElement(name = "InLogMntRecordingTrxCode")
    protected int inLogMntRecordingTrxCode;
    @XmlElement(name = "InProductIdProduct")
    protected int inProductIdProduct;
    @XmlElement(name = "InSelectedDistrChannelIdChannel")
    protected int inSelectedDistrChannelIdChannel;
    @XmlElement(name = "InTimestampUsrTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTimestampUsrTmstamp;
    @XmlElement(name = "InUsrAccountingOrig")
    protected short inUsrAccountingOrig;
    @XmlElement(name = "InUsrActivationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inUsrActivationDate;
    @XmlElement(name = "InUsrAkSellerCode")
    protected int inUsrAkSellerCode;
    @XmlElement(name = "InUsrAtmUser")
    protected String inUsrAtmUser;
    @XmlElement(name = "InUsrCode")
    protected String inUsrCode;
    @XmlElement(name = "InUsrDeactivationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inUsrDeactivationDate;
    @XmlElement(name = "InUsrEmail")
    protected String inUsrEmail;
    @XmlElement(name = "InUsrEndTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inUsrEndTime;
    @XmlElement(name = "InUsrEntryStatus")
    protected String inUsrEntryStatus;
    @XmlElement(name = "InUsrFri")
    protected String inUsrFri;
    @XmlElement(name = "InUsrGlLevel")
    protected short inUsrGlLevel;
    @XmlElement(name = "InUsrLimitedAccess")
    protected String inUsrLimitedAccess;
    @XmlElement(name = "InUsrMobilePhone")
    protected String inUsrMobilePhone;
    @XmlElement(name = "InUsrMon")
    protected String inUsrMon;
    @XmlElement(name = "InUsrNonHouseUnit")
    protected String inUsrNonHouseUnit;
    @XmlElement(name = "InUsrOffsideUnit")
    protected int inUsrOffsideUnit;
    @XmlElement(name = "InUsrPassDigest")
    protected String inUsrPassDigest;
    @XmlElement(name = "InUsrPassTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inUsrPassTmstamp;
    @XmlElement(name = "InUsrPermUnits")
    protected short inUsrPermUnits;
    @XmlElement(name = "InUsrRmInd")
    protected String inUsrRmInd;
    @XmlElement(name = "InUsrSat")
    protected String inUsrSat;
    @XmlElement(name = "InUsrStartTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inUsrStartTime;
    @XmlElement(name = "InUsrSun")
    protected String inUsrSun;
    @XmlElement(name = "InUsrThu")
    protected String inUsrThu;
    @XmlElement(name = "InUsrTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inUsrTmstamp;
    @XmlElement(name = "InUsrTue")
    protected String inUsrTue;
    @XmlElement(name = "InUsrVirtualUser")
    protected String inUsrVirtualUser;
    @XmlElement(name = "InUsrWed")
    protected String inUsrWed;
    @XmlElement(name = "InUsrWorkPhone")
    protected String inUsrWorkPhone;

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
     * Gets the value of the inCodeBankemployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCodeBankemployeeId() {
        return inCodeBankemployeeId;
    }

    /**
     * Sets the value of the inCodeBankemployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCodeBankemployeeId(String value) {
        this.inCodeBankemployeeId = value;
    }

    /**
     * Gets the value of the inCodeUnitCode property.
     * 
     */
    public int getInCodeUnitCode() {
        return inCodeUnitCode;
    }

    /**
     * Sets the value of the inCodeUnitCode property.
     * 
     */
    public void setInCodeUnitCode(int value) {
        this.inCodeUnitCode = value;
    }

    /**
     * Gets the value of the inCodeUnitCategoryPerRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCodeUnitCategoryPerRoleId() {
        return inCodeUnitCategoryPerRoleId;
    }

    /**
     * Sets the value of the inCodeUnitCategoryPerRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCodeUnitCategoryPerRoleId(String value) {
        this.inCodeUnitCategoryPerRoleId = value;
    }

    /**
     * Gets the value of the inCodeUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCodeUsrCode() {
        return inCodeUsrCode;
    }

    /**
     * Sets the value of the inCodeUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCodeUsrCode(String value) {
        this.inCodeUsrCode = value;
    }

    /**
     * Gets the value of the inCodeUsrEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCodeUsrEmail() {
        return inCodeUsrEmail;
    }

    /**
     * Sets the value of the inCodeUsrEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCodeUsrEmail(String value) {
        this.inCodeUsrEmail = value;
    }

    /**
     * Gets the value of the inDeptSrvGenericDetailSerialNum property.
     * 
     */
    public int getInDeptSrvGenericDetailSerialNum() {
        return inDeptSrvGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inDeptSrvGenericDetailSerialNum property.
     * 
     */
    public void setInDeptSrvGenericDetailSerialNum(int value) {
        this.inDeptSrvGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inEncryptedUsrPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEncryptedUsrPassword() {
        return inEncryptedUsrPassword;
    }

    /**
     * Sets the value of the inEncryptedUsrPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEncryptedUsrPassword(String value) {
        this.inEncryptedUsrPassword = value;
    }

    /**
     * Gets the value of the inGrpacGenericDetailSerialNum property.
     * 
     */
    public int getInGrpacGenericDetailSerialNum() {
        return inGrpacGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inGrpacGenericDetailSerialNum property.
     * 
     */
    public void setInGrpacGenericDetailSerialNum(int value) {
        this.inGrpacGenericDetailSerialNum = value;
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
     * Gets the value of the inLogMntRecordingChannelId property.
     * 
     */
    public int getInLogMntRecordingChannelId() {
        return inLogMntRecordingChannelId;
    }

    /**
     * Sets the value of the inLogMntRecordingChannelId property.
     * 
     */
    public void setInLogMntRecordingChannelId(int value) {
        this.inLogMntRecordingChannelId = value;
    }

    /**
     * Gets the value of the inLogMntRecordingPrftSystem property.
     * 
     */
    public short getInLogMntRecordingPrftSystem() {
        return inLogMntRecordingPrftSystem;
    }

    /**
     * Sets the value of the inLogMntRecordingPrftSystem property.
     * 
     */
    public void setInLogMntRecordingPrftSystem(short value) {
        this.inLogMntRecordingPrftSystem = value;
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
     * Gets the value of the inSelectedDistrChannelIdChannel property.
     * 
     */
    public int getInSelectedDistrChannelIdChannel() {
        return inSelectedDistrChannelIdChannel;
    }

    /**
     * Sets the value of the inSelectedDistrChannelIdChannel property.
     * 
     */
    public void setInSelectedDistrChannelIdChannel(int value) {
        this.inSelectedDistrChannelIdChannel = value;
    }

    /**
     * Gets the value of the inTimestampUsrTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTimestampUsrTmstamp() {
        return inTimestampUsrTmstamp;
    }

    /**
     * Sets the value of the inTimestampUsrTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTimestampUsrTmstamp(XMLGregorianCalendar value) {
        this.inTimestampUsrTmstamp = value;
    }

    /**
     * Gets the value of the inUsrAccountingOrig property.
     * 
     */
    public short getInUsrAccountingOrig() {
        return inUsrAccountingOrig;
    }

    /**
     * Sets the value of the inUsrAccountingOrig property.
     * 
     */
    public void setInUsrAccountingOrig(short value) {
        this.inUsrAccountingOrig = value;
    }

    /**
     * Gets the value of the inUsrActivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInUsrActivationDate() {
        return inUsrActivationDate;
    }

    /**
     * Sets the value of the inUsrActivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInUsrActivationDate(XMLGregorianCalendar value) {
        this.inUsrActivationDate = value;
    }

    /**
     * Gets the value of the inUsrAkSellerCode property.
     * 
     */
    public int getInUsrAkSellerCode() {
        return inUsrAkSellerCode;
    }

    /**
     * Sets the value of the inUsrAkSellerCode property.
     * 
     */
    public void setInUsrAkSellerCode(int value) {
        this.inUsrAkSellerCode = value;
    }

    /**
     * Gets the value of the inUsrAtmUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUsrAtmUser() {
        return inUsrAtmUser;
    }

    /**
     * Sets the value of the inUsrAtmUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUsrAtmUser(String value) {
        this.inUsrAtmUser = value;
    }

    /**
     * Gets the value of the inUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUsrCode() {
        return inUsrCode;
    }

    /**
     * Sets the value of the inUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUsrCode(String value) {
        this.inUsrCode = value;
    }

    /**
     * Gets the value of the inUsrDeactivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInUsrDeactivationDate() {
        return inUsrDeactivationDate;
    }

    /**
     * Sets the value of the inUsrDeactivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInUsrDeactivationDate(XMLGregorianCalendar value) {
        this.inUsrDeactivationDate = value;
    }

    /**
     * Gets the value of the inUsrEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUsrEmail() {
        return inUsrEmail;
    }

    /**
     * Sets the value of the inUsrEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUsrEmail(String value) {
        this.inUsrEmail = value;
    }

    /**
     * Gets the value of the inUsrEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInUsrEndTime() {
        return inUsrEndTime;
    }

    /**
     * Sets the value of the inUsrEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInUsrEndTime(XMLGregorianCalendar value) {
        this.inUsrEndTime = value;
    }

    /**
     * Gets the value of the inUsrEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUsrEntryStatus() {
        return inUsrEntryStatus;
    }

    /**
     * Sets the value of the inUsrEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUsrEntryStatus(String value) {
        this.inUsrEntryStatus = value;
    }

    /**
     * Gets the value of the inUsrFri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUsrFri() {
        return inUsrFri;
    }

    /**
     * Sets the value of the inUsrFri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUsrFri(String value) {
        this.inUsrFri = value;
    }

    /**
     * Gets the value of the inUsrGlLevel property.
     * 
     */
    public short getInUsrGlLevel() {
        return inUsrGlLevel;
    }

    /**
     * Sets the value of the inUsrGlLevel property.
     * 
     */
    public void setInUsrGlLevel(short value) {
        this.inUsrGlLevel = value;
    }

    /**
     * Gets the value of the inUsrLimitedAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUsrLimitedAccess() {
        return inUsrLimitedAccess;
    }

    /**
     * Sets the value of the inUsrLimitedAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUsrLimitedAccess(String value) {
        this.inUsrLimitedAccess = value;
    }

    /**
     * Gets the value of the inUsrMobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUsrMobilePhone() {
        return inUsrMobilePhone;
    }

    /**
     * Sets the value of the inUsrMobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUsrMobilePhone(String value) {
        this.inUsrMobilePhone = value;
    }

    /**
     * Gets the value of the inUsrMon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUsrMon() {
        return inUsrMon;
    }

    /**
     * Sets the value of the inUsrMon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUsrMon(String value) {
        this.inUsrMon = value;
    }

    /**
     * Gets the value of the inUsrNonHouseUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUsrNonHouseUnit() {
        return inUsrNonHouseUnit;
    }

    /**
     * Sets the value of the inUsrNonHouseUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUsrNonHouseUnit(String value) {
        this.inUsrNonHouseUnit = value;
    }

    /**
     * Gets the value of the inUsrOffsideUnit property.
     * 
     */
    public int getInUsrOffsideUnit() {
        return inUsrOffsideUnit;
    }

    /**
     * Sets the value of the inUsrOffsideUnit property.
     * 
     */
    public void setInUsrOffsideUnit(int value) {
        this.inUsrOffsideUnit = value;
    }

    /**
     * Gets the value of the inUsrPassDigest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUsrPassDigest() {
        return inUsrPassDigest;
    }

    /**
     * Sets the value of the inUsrPassDigest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUsrPassDigest(String value) {
        this.inUsrPassDigest = value;
    }

    /**
     * Gets the value of the inUsrPassTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInUsrPassTmstamp() {
        return inUsrPassTmstamp;
    }

    /**
     * Sets the value of the inUsrPassTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInUsrPassTmstamp(XMLGregorianCalendar value) {
        this.inUsrPassTmstamp = value;
    }

    /**
     * Gets the value of the inUsrPermUnits property.
     * 
     */
    public short getInUsrPermUnits() {
        return inUsrPermUnits;
    }

    /**
     * Sets the value of the inUsrPermUnits property.
     * 
     */
    public void setInUsrPermUnits(short value) {
        this.inUsrPermUnits = value;
    }

    /**
     * Gets the value of the inUsrRmInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUsrRmInd() {
        return inUsrRmInd;
    }

    /**
     * Sets the value of the inUsrRmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUsrRmInd(String value) {
        this.inUsrRmInd = value;
    }

    /**
     * Gets the value of the inUsrSat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUsrSat() {
        return inUsrSat;
    }

    /**
     * Sets the value of the inUsrSat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUsrSat(String value) {
        this.inUsrSat = value;
    }

    /**
     * Gets the value of the inUsrStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInUsrStartTime() {
        return inUsrStartTime;
    }

    /**
     * Sets the value of the inUsrStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInUsrStartTime(XMLGregorianCalendar value) {
        this.inUsrStartTime = value;
    }

    /**
     * Gets the value of the inUsrSun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUsrSun() {
        return inUsrSun;
    }

    /**
     * Sets the value of the inUsrSun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUsrSun(String value) {
        this.inUsrSun = value;
    }

    /**
     * Gets the value of the inUsrThu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUsrThu() {
        return inUsrThu;
    }

    /**
     * Sets the value of the inUsrThu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUsrThu(String value) {
        this.inUsrThu = value;
    }

    /**
     * Gets the value of the inUsrTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInUsrTmstamp() {
        return inUsrTmstamp;
    }

    /**
     * Sets the value of the inUsrTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInUsrTmstamp(XMLGregorianCalendar value) {
        this.inUsrTmstamp = value;
    }

    /**
     * Gets the value of the inUsrTue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUsrTue() {
        return inUsrTue;
    }

    /**
     * Sets the value of the inUsrTue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUsrTue(String value) {
        this.inUsrTue = value;
    }

    /**
     * Gets the value of the inUsrVirtualUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUsrVirtualUser() {
        return inUsrVirtualUser;
    }

    /**
     * Sets the value of the inUsrVirtualUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUsrVirtualUser(String value) {
        this.inUsrVirtualUser = value;
    }

    /**
     * Gets the value of the inUsrWed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUsrWed() {
        return inUsrWed;
    }

    /**
     * Sets the value of the inUsrWed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUsrWed(String value) {
        this.inUsrWed = value;
    }

    /**
     * Gets the value of the inUsrWorkPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUsrWorkPhone() {
        return inUsrWorkPhone;
    }

    /**
     * Sets the value of the inUsrWorkPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUsrWorkPhone(String value) {
        this.inUsrWorkPhone = value;
    }

}
