
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for S0705VProfitsUserMaintenanceExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S0705VProfitsUserMaintenanceExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutBankemployeeFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankemployeeStaffNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCodeUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDeptSrvGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDeptSrvGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutExpirGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGradeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpacGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpacGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIefSuppliedActionEntry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedSrvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoginStatusLoggedUserLoginStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoginStatusLoggedUserPasswordChangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLogoffLoggedUserUsercode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPositionGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDistrChannelDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDistrChannelIdChannel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTempPwdMethodBankParametersTempPwdMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUnitCategoryPerRoleDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUnitCategoryPerRoleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUsrAccountingOrig" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutUsrActivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutUsrAkSellerCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutUsrAtmUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUsrDeactivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutUsrEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUsrEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutUsrEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUsrFri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUsrGlLevel" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutUsrLimitedAccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUsrMobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUsrMon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUsrNonHouseUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUsrOffsideUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutUsrPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUsrPermUnits" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutUsrRmInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUsrSat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUsrStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutUsrSun" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUsrThu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUsrTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutUsrTue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUsrVirtualUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUsrWed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUsrWorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfS0705VOutGrpLogItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S0705VProfitsUserMaintenanceExport", propOrder = {
    "outBankemployeeFirstName",
    "outBankemployeeId",
    "outBankemployeeLastName",
    "outBankemployeeStaffNo",
    "outCodeUsrCode",
    "outDeptSrvGenericDetailDescription",
    "outDeptSrvGenericDetailSerialNum",
    "outExpirGenericDetailDescription",
    "outGradeGenericDetailDescription",
    "outGrpacGenericDetailDescription",
    "outGrpacGenericDetailSerialNum",
    "outIefSuppliedActionEntry",
    "outIefSuppliedSrvStatus",
    "outLoginStatusLoggedUserLoginStatus",
    "outLoginStatusLoggedUserPasswordChangeDate",
    "outLogoffLoggedUserUsercode",
    "outPositionGenericDetailDescription",
    "outSelectedDistrChannelDescription",
    "outSelectedDistrChannelIdChannel",
    "outTempPwdMethodBankParametersTempPwdMethod",
    "outTerminalTerminalNumber",
    "outUnitCode",
    "outUnitUnitName",
    "outUnitCategoryPerRoleDescription",
    "outUnitCategoryPerRoleId",
    "outUsrAccountingOrig",
    "outUsrActivationDate",
    "outUsrAkSellerCode",
    "outUsrAtmUser",
    "outUsrCode",
    "outUsrDeactivationDate",
    "outUsrEmail",
    "outUsrEndTime",
    "outUsrEntryStatus",
    "outUsrFri",
    "outUsrGlLevel",
    "outUsrLimitedAccess",
    "outUsrMobilePhone",
    "outUsrMon",
    "outUsrNonHouseUnit",
    "outUsrOffsideUnit",
    "outUsrPassword",
    "outUsrPermUnits",
    "outUsrRmInd",
    "outUsrSat",
    "outUsrStartTime",
    "outUsrSun",
    "outUsrThu",
    "outUsrTmstamp",
    "outUsrTue",
    "outUsrVirtualUser",
    "outUsrWed",
    "outUsrWorkPhone",
    "outGrpLog"
})
public class S0705VProfitsUserMaintenanceExport
    extends BaseExport
{

    @XmlElement(name = "OutBankemployeeFirstName")
    protected String outBankemployeeFirstName;
    @XmlElement(name = "OutBankemployeeId")
    protected String outBankemployeeId;
    @XmlElement(name = "OutBankemployeeLastName")
    protected String outBankemployeeLastName;
    @XmlElement(name = "OutBankemployeeStaffNo")
    protected String outBankemployeeStaffNo;
    @XmlElement(name = "OutCodeUsrCode")
    protected String outCodeUsrCode;
    @XmlElement(name = "OutDeptSrvGenericDetailDescription")
    protected String outDeptSrvGenericDetailDescription;
    @XmlElement(name = "OutDeptSrvGenericDetailSerialNum")
    protected int outDeptSrvGenericDetailSerialNum;
    @XmlElement(name = "OutExpirGenericDetailDescription")
    protected String outExpirGenericDetailDescription;
    @XmlElement(name = "OutGradeGenericDetailDescription")
    protected String outGradeGenericDetailDescription;
    @XmlElement(name = "OutGrpacGenericDetailDescription")
    protected String outGrpacGenericDetailDescription;
    @XmlElement(name = "OutGrpacGenericDetailSerialNum")
    protected int outGrpacGenericDetailSerialNum;
    @XmlElement(name = "OutIefSuppliedActionEntry")
    protected String outIefSuppliedActionEntry;
    @XmlElement(name = "OutIefSuppliedSrvStatus")
    protected String outIefSuppliedSrvStatus;
    @XmlElement(name = "OutLoginStatusLoggedUserLoginStatus")
    protected String outLoginStatusLoggedUserLoginStatus;
    @XmlElement(name = "OutLoginStatusLoggedUserPasswordChangeDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoginStatusLoggedUserPasswordChangeDate;
    @XmlElement(name = "OutLogoffLoggedUserUsercode")
    protected String outLogoffLoggedUserUsercode;
    @XmlElement(name = "OutPositionGenericDetailDescription")
    protected String outPositionGenericDetailDescription;
    @XmlElement(name = "OutSelectedDistrChannelDescription")
    protected String outSelectedDistrChannelDescription;
    @XmlElement(name = "OutSelectedDistrChannelIdChannel")
    protected int outSelectedDistrChannelIdChannel;
    @XmlElement(name = "OutTempPwdMethodBankParametersTempPwdMethod")
    protected String outTempPwdMethodBankParametersTempPwdMethod;
    @XmlElement(name = "OutTerminalTerminalNumber")
    protected String outTerminalTerminalNumber;
    @XmlElement(name = "OutUnitCode")
    protected int outUnitCode;
    @XmlElement(name = "OutUnitUnitName")
    protected String outUnitUnitName;
    @XmlElement(name = "OutUnitCategoryPerRoleDescription")
    protected String outUnitCategoryPerRoleDescription;
    @XmlElement(name = "OutUnitCategoryPerRoleId")
    protected String outUnitCategoryPerRoleId;
    @XmlElement(name = "OutUsrAccountingOrig")
    protected short outUsrAccountingOrig;
    @XmlElement(name = "OutUsrActivationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outUsrActivationDate;
    @XmlElement(name = "OutUsrAkSellerCode")
    protected int outUsrAkSellerCode;
    @XmlElement(name = "OutUsrAtmUser")
    protected String outUsrAtmUser;
    @XmlElement(name = "OutUsrCode")
    protected String outUsrCode;
    @XmlElement(name = "OutUsrDeactivationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outUsrDeactivationDate;
    @XmlElement(name = "OutUsrEmail")
    protected String outUsrEmail;
    @XmlElement(name = "OutUsrEndTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outUsrEndTime;
    @XmlElement(name = "OutUsrEntryStatus")
    protected String outUsrEntryStatus;
    @XmlElement(name = "OutUsrFri")
    protected String outUsrFri;
    @XmlElement(name = "OutUsrGlLevel")
    protected short outUsrGlLevel;
    @XmlElement(name = "OutUsrLimitedAccess")
    protected String outUsrLimitedAccess;
    @XmlElement(name = "OutUsrMobilePhone")
    protected String outUsrMobilePhone;
    @XmlElement(name = "OutUsrMon")
    protected String outUsrMon;
    @XmlElement(name = "OutUsrNonHouseUnit")
    protected String outUsrNonHouseUnit;
    @XmlElement(name = "OutUsrOffsideUnit")
    protected int outUsrOffsideUnit;
    @XmlElement(name = "OutUsrPassword")
    protected String outUsrPassword;
    @XmlElement(name = "OutUsrPermUnits")
    protected short outUsrPermUnits;
    @XmlElement(name = "OutUsrRmInd")
    protected String outUsrRmInd;
    @XmlElement(name = "OutUsrSat")
    protected String outUsrSat;
    @XmlElement(name = "OutUsrStartTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outUsrStartTime;
    @XmlElement(name = "OutUsrSun")
    protected String outUsrSun;
    @XmlElement(name = "OutUsrThu")
    protected String outUsrThu;
    @XmlElement(name = "OutUsrTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outUsrTmstamp;
    @XmlElement(name = "OutUsrTue")
    protected String outUsrTue;
    @XmlElement(name = "OutUsrVirtualUser")
    protected String outUsrVirtualUser;
    @XmlElement(name = "OutUsrWed")
    protected String outUsrWed;
    @XmlElement(name = "OutUsrWorkPhone")
    protected String outUsrWorkPhone;
    @XmlElement(name = "OutGrpLog")
    protected ArrayOfS0705VOutGrpLogItem outGrpLog;

    /**
     * Gets the value of the outBankemployeeFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankemployeeFirstName() {
        return outBankemployeeFirstName;
    }

    /**
     * Sets the value of the outBankemployeeFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankemployeeFirstName(String value) {
        this.outBankemployeeFirstName = value;
    }

    /**
     * Gets the value of the outBankemployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankemployeeId() {
        return outBankemployeeId;
    }

    /**
     * Sets the value of the outBankemployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankemployeeId(String value) {
        this.outBankemployeeId = value;
    }

    /**
     * Gets the value of the outBankemployeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankemployeeLastName() {
        return outBankemployeeLastName;
    }

    /**
     * Sets the value of the outBankemployeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankemployeeLastName(String value) {
        this.outBankemployeeLastName = value;
    }

    /**
     * Gets the value of the outBankemployeeStaffNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankemployeeStaffNo() {
        return outBankemployeeStaffNo;
    }

    /**
     * Sets the value of the outBankemployeeStaffNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankemployeeStaffNo(String value) {
        this.outBankemployeeStaffNo = value;
    }

    /**
     * Gets the value of the outCodeUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCodeUsrCode() {
        return outCodeUsrCode;
    }

    /**
     * Sets the value of the outCodeUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCodeUsrCode(String value) {
        this.outCodeUsrCode = value;
    }

    /**
     * Gets the value of the outDeptSrvGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDeptSrvGenericDetailDescription() {
        return outDeptSrvGenericDetailDescription;
    }

    /**
     * Sets the value of the outDeptSrvGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDeptSrvGenericDetailDescription(String value) {
        this.outDeptSrvGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outDeptSrvGenericDetailSerialNum property.
     * 
     */
    public int getOutDeptSrvGenericDetailSerialNum() {
        return outDeptSrvGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outDeptSrvGenericDetailSerialNum property.
     * 
     */
    public void setOutDeptSrvGenericDetailSerialNum(int value) {
        this.outDeptSrvGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outExpirGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExpirGenericDetailDescription() {
        return outExpirGenericDetailDescription;
    }

    /**
     * Sets the value of the outExpirGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExpirGenericDetailDescription(String value) {
        this.outExpirGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGradeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGradeGenericDetailDescription() {
        return outGradeGenericDetailDescription;
    }

    /**
     * Sets the value of the outGradeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGradeGenericDetailDescription(String value) {
        this.outGradeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpacGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpacGenericDetailDescription() {
        return outGrpacGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpacGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpacGenericDetailDescription(String value) {
        this.outGrpacGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpacGenericDetailSerialNum property.
     * 
     */
    public int getOutGrpacGenericDetailSerialNum() {
        return outGrpacGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outGrpacGenericDetailSerialNum property.
     * 
     */
    public void setOutGrpacGenericDetailSerialNum(int value) {
        this.outGrpacGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outIefSuppliedActionEntry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIefSuppliedActionEntry() {
        return outIefSuppliedActionEntry;
    }

    /**
     * Sets the value of the outIefSuppliedActionEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIefSuppliedActionEntry(String value) {
        this.outIefSuppliedActionEntry = value;
    }

    /**
     * Gets the value of the outIefSuppliedSrvStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIefSuppliedSrvStatus() {
        return outIefSuppliedSrvStatus;
    }

    /**
     * Sets the value of the outIefSuppliedSrvStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIefSuppliedSrvStatus(String value) {
        this.outIefSuppliedSrvStatus = value;
    }

    /**
     * Gets the value of the outLoginStatusLoggedUserLoginStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoginStatusLoggedUserLoginStatus() {
        return outLoginStatusLoggedUserLoginStatus;
    }

    /**
     * Sets the value of the outLoginStatusLoggedUserLoginStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoginStatusLoggedUserLoginStatus(String value) {
        this.outLoginStatusLoggedUserLoginStatus = value;
    }

    /**
     * Gets the value of the outLoginStatusLoggedUserPasswordChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoginStatusLoggedUserPasswordChangeDate() {
        return outLoginStatusLoggedUserPasswordChangeDate;
    }

    /**
     * Sets the value of the outLoginStatusLoggedUserPasswordChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoginStatusLoggedUserPasswordChangeDate(XMLGregorianCalendar value) {
        this.outLoginStatusLoggedUserPasswordChangeDate = value;
    }

    /**
     * Gets the value of the outLogoffLoggedUserUsercode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLogoffLoggedUserUsercode() {
        return outLogoffLoggedUserUsercode;
    }

    /**
     * Sets the value of the outLogoffLoggedUserUsercode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLogoffLoggedUserUsercode(String value) {
        this.outLogoffLoggedUserUsercode = value;
    }

    /**
     * Gets the value of the outPositionGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPositionGenericDetailDescription() {
        return outPositionGenericDetailDescription;
    }

    /**
     * Sets the value of the outPositionGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPositionGenericDetailDescription(String value) {
        this.outPositionGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outSelectedDistrChannelDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDistrChannelDescription() {
        return outSelectedDistrChannelDescription;
    }

    /**
     * Sets the value of the outSelectedDistrChannelDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDistrChannelDescription(String value) {
        this.outSelectedDistrChannelDescription = value;
    }

    /**
     * Gets the value of the outSelectedDistrChannelIdChannel property.
     * 
     */
    public int getOutSelectedDistrChannelIdChannel() {
        return outSelectedDistrChannelIdChannel;
    }

    /**
     * Sets the value of the outSelectedDistrChannelIdChannel property.
     * 
     */
    public void setOutSelectedDistrChannelIdChannel(int value) {
        this.outSelectedDistrChannelIdChannel = value;
    }

    /**
     * Gets the value of the outTempPwdMethodBankParametersTempPwdMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTempPwdMethodBankParametersTempPwdMethod() {
        return outTempPwdMethodBankParametersTempPwdMethod;
    }

    /**
     * Sets the value of the outTempPwdMethodBankParametersTempPwdMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTempPwdMethodBankParametersTempPwdMethod(String value) {
        this.outTempPwdMethodBankParametersTempPwdMethod = value;
    }

    /**
     * Gets the value of the outTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTerminalTerminalNumber() {
        return outTerminalTerminalNumber;
    }

    /**
     * Sets the value of the outTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTerminalTerminalNumber(String value) {
        this.outTerminalTerminalNumber = value;
    }

    /**
     * Gets the value of the outUnitCode property.
     * 
     */
    public int getOutUnitCode() {
        return outUnitCode;
    }

    /**
     * Sets the value of the outUnitCode property.
     * 
     */
    public void setOutUnitCode(int value) {
        this.outUnitCode = value;
    }

    /**
     * Gets the value of the outUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUnitUnitName() {
        return outUnitUnitName;
    }

    /**
     * Sets the value of the outUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUnitUnitName(String value) {
        this.outUnitUnitName = value;
    }

    /**
     * Gets the value of the outUnitCategoryPerRoleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUnitCategoryPerRoleDescription() {
        return outUnitCategoryPerRoleDescription;
    }

    /**
     * Sets the value of the outUnitCategoryPerRoleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUnitCategoryPerRoleDescription(String value) {
        this.outUnitCategoryPerRoleDescription = value;
    }

    /**
     * Gets the value of the outUnitCategoryPerRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUnitCategoryPerRoleId() {
        return outUnitCategoryPerRoleId;
    }

    /**
     * Sets the value of the outUnitCategoryPerRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUnitCategoryPerRoleId(String value) {
        this.outUnitCategoryPerRoleId = value;
    }

    /**
     * Gets the value of the outUsrAccountingOrig property.
     * 
     */
    public short getOutUsrAccountingOrig() {
        return outUsrAccountingOrig;
    }

    /**
     * Sets the value of the outUsrAccountingOrig property.
     * 
     */
    public void setOutUsrAccountingOrig(short value) {
        this.outUsrAccountingOrig = value;
    }

    /**
     * Gets the value of the outUsrActivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutUsrActivationDate() {
        return outUsrActivationDate;
    }

    /**
     * Sets the value of the outUsrActivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutUsrActivationDate(XMLGregorianCalendar value) {
        this.outUsrActivationDate = value;
    }

    /**
     * Gets the value of the outUsrAkSellerCode property.
     * 
     */
    public int getOutUsrAkSellerCode() {
        return outUsrAkSellerCode;
    }

    /**
     * Sets the value of the outUsrAkSellerCode property.
     * 
     */
    public void setOutUsrAkSellerCode(int value) {
        this.outUsrAkSellerCode = value;
    }

    /**
     * Gets the value of the outUsrAtmUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUsrAtmUser() {
        return outUsrAtmUser;
    }

    /**
     * Sets the value of the outUsrAtmUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUsrAtmUser(String value) {
        this.outUsrAtmUser = value;
    }

    /**
     * Gets the value of the outUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUsrCode() {
        return outUsrCode;
    }

    /**
     * Sets the value of the outUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUsrCode(String value) {
        this.outUsrCode = value;
    }

    /**
     * Gets the value of the outUsrDeactivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutUsrDeactivationDate() {
        return outUsrDeactivationDate;
    }

    /**
     * Sets the value of the outUsrDeactivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutUsrDeactivationDate(XMLGregorianCalendar value) {
        this.outUsrDeactivationDate = value;
    }

    /**
     * Gets the value of the outUsrEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUsrEmail() {
        return outUsrEmail;
    }

    /**
     * Sets the value of the outUsrEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUsrEmail(String value) {
        this.outUsrEmail = value;
    }

    /**
     * Gets the value of the outUsrEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutUsrEndTime() {
        return outUsrEndTime;
    }

    /**
     * Sets the value of the outUsrEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutUsrEndTime(XMLGregorianCalendar value) {
        this.outUsrEndTime = value;
    }

    /**
     * Gets the value of the outUsrEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUsrEntryStatus() {
        return outUsrEntryStatus;
    }

    /**
     * Sets the value of the outUsrEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUsrEntryStatus(String value) {
        this.outUsrEntryStatus = value;
    }

    /**
     * Gets the value of the outUsrFri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUsrFri() {
        return outUsrFri;
    }

    /**
     * Sets the value of the outUsrFri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUsrFri(String value) {
        this.outUsrFri = value;
    }

    /**
     * Gets the value of the outUsrGlLevel property.
     * 
     */
    public short getOutUsrGlLevel() {
        return outUsrGlLevel;
    }

    /**
     * Sets the value of the outUsrGlLevel property.
     * 
     */
    public void setOutUsrGlLevel(short value) {
        this.outUsrGlLevel = value;
    }

    /**
     * Gets the value of the outUsrLimitedAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUsrLimitedAccess() {
        return outUsrLimitedAccess;
    }

    /**
     * Sets the value of the outUsrLimitedAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUsrLimitedAccess(String value) {
        this.outUsrLimitedAccess = value;
    }

    /**
     * Gets the value of the outUsrMobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUsrMobilePhone() {
        return outUsrMobilePhone;
    }

    /**
     * Sets the value of the outUsrMobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUsrMobilePhone(String value) {
        this.outUsrMobilePhone = value;
    }

    /**
     * Gets the value of the outUsrMon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUsrMon() {
        return outUsrMon;
    }

    /**
     * Sets the value of the outUsrMon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUsrMon(String value) {
        this.outUsrMon = value;
    }

    /**
     * Gets the value of the outUsrNonHouseUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUsrNonHouseUnit() {
        return outUsrNonHouseUnit;
    }

    /**
     * Sets the value of the outUsrNonHouseUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUsrNonHouseUnit(String value) {
        this.outUsrNonHouseUnit = value;
    }

    /**
     * Gets the value of the outUsrOffsideUnit property.
     * 
     */
    public int getOutUsrOffsideUnit() {
        return outUsrOffsideUnit;
    }

    /**
     * Sets the value of the outUsrOffsideUnit property.
     * 
     */
    public void setOutUsrOffsideUnit(int value) {
        this.outUsrOffsideUnit = value;
    }

    /**
     * Gets the value of the outUsrPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUsrPassword() {
        return outUsrPassword;
    }

    /**
     * Sets the value of the outUsrPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUsrPassword(String value) {
        this.outUsrPassword = value;
    }

    /**
     * Gets the value of the outUsrPermUnits property.
     * 
     */
    public short getOutUsrPermUnits() {
        return outUsrPermUnits;
    }

    /**
     * Sets the value of the outUsrPermUnits property.
     * 
     */
    public void setOutUsrPermUnits(short value) {
        this.outUsrPermUnits = value;
    }

    /**
     * Gets the value of the outUsrRmInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUsrRmInd() {
        return outUsrRmInd;
    }

    /**
     * Sets the value of the outUsrRmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUsrRmInd(String value) {
        this.outUsrRmInd = value;
    }

    /**
     * Gets the value of the outUsrSat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUsrSat() {
        return outUsrSat;
    }

    /**
     * Sets the value of the outUsrSat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUsrSat(String value) {
        this.outUsrSat = value;
    }

    /**
     * Gets the value of the outUsrStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutUsrStartTime() {
        return outUsrStartTime;
    }

    /**
     * Sets the value of the outUsrStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutUsrStartTime(XMLGregorianCalendar value) {
        this.outUsrStartTime = value;
    }

    /**
     * Gets the value of the outUsrSun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUsrSun() {
        return outUsrSun;
    }

    /**
     * Sets the value of the outUsrSun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUsrSun(String value) {
        this.outUsrSun = value;
    }

    /**
     * Gets the value of the outUsrThu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUsrThu() {
        return outUsrThu;
    }

    /**
     * Sets the value of the outUsrThu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUsrThu(String value) {
        this.outUsrThu = value;
    }

    /**
     * Gets the value of the outUsrTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutUsrTmstamp() {
        return outUsrTmstamp;
    }

    /**
     * Sets the value of the outUsrTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutUsrTmstamp(XMLGregorianCalendar value) {
        this.outUsrTmstamp = value;
    }

    /**
     * Gets the value of the outUsrTue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUsrTue() {
        return outUsrTue;
    }

    /**
     * Sets the value of the outUsrTue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUsrTue(String value) {
        this.outUsrTue = value;
    }

    /**
     * Gets the value of the outUsrVirtualUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUsrVirtualUser() {
        return outUsrVirtualUser;
    }

    /**
     * Sets the value of the outUsrVirtualUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUsrVirtualUser(String value) {
        this.outUsrVirtualUser = value;
    }

    /**
     * Gets the value of the outUsrWed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUsrWed() {
        return outUsrWed;
    }

    /**
     * Sets the value of the outUsrWed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUsrWed(String value) {
        this.outUsrWed = value;
    }

    /**
     * Gets the value of the outUsrWorkPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUsrWorkPhone() {
        return outUsrWorkPhone;
    }

    /**
     * Sets the value of the outUsrWorkPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUsrWorkPhone(String value) {
        this.outUsrWorkPhone = value;
    }

    /**
     * Gets the value of the outGrpLog property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfS0705VOutGrpLogItem }
     *     
     */
    public ArrayOfS0705VOutGrpLogItem getOutGrpLog() {
        return outGrpLog;
    }

    /**
     * Sets the value of the outGrpLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfS0705VOutGrpLogItem }
     *     
     */
    public void setOutGrpLog(ArrayOfS0705VOutGrpLogItem value) {
        this.outGrpLog = value;
    }

}
