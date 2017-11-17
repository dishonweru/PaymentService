
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CI3496V_GetUserInfoExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CI3496V_GetUserInfoExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutBankParametersBankCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBankParametersBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankParametersCurrTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBankemployeeFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDistrChannelChannelInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDistrChannelDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDistrChannelIdChannel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDistrChannelShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoggedUserCashTillNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoggedUserLoginStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoggedUserTerminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoggedUserUsercode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProfile1UnitCategoryPerRoleDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProfile1UnitCategoryPerRoleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProfile1UnitCategoryPerRolePtjCheckOvercome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProfile2UnitCategoryPerRoleDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProfile2UnitCategoryPerRoleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProfile2UnitCategoryPerRolePtjCheckOvercome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProfile3UnitCategoryPerRoleDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProfile3UnitCategoryPerRoleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProfile3UnitCategoryPerRolePtjCheckOvercome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUnitAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUnitAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUnitCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutUnitEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUnitFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUnitNode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUnitTelephone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUnitTelephone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUnitZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUsrActivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUsrEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUsrEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUsrMobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUsrPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUsrVirtualUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUsrWorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI3496V_GetUserInfoExport", propOrder = {
    "outBankParametersBankCode",
    "outBankParametersBankName",
    "outBankParametersCurrTrxDate",
    "outBankemployeeFirstName",
    "outBankemployeeId",
    "outBankemployeeLastName",
    "outDistrChannelChannelInd",
    "outDistrChannelDescription",
    "outDistrChannelIdChannel",
    "outDistrChannelShortDescr",
    "outLoggedUserCashTillNo",
    "outLoggedUserLoginStatus",
    "outLoggedUserTerminalId",
    "outLoggedUserUsercode",
    "outProfile1UnitCategoryPerRoleDescription",
    "outProfile1UnitCategoryPerRoleId",
    "outProfile1UnitCategoryPerRolePtjCheckOvercome",
    "outProfile2UnitCategoryPerRoleDescription",
    "outProfile2UnitCategoryPerRoleId",
    "outProfile2UnitCategoryPerRolePtjCheckOvercome",
    "outProfile3UnitCategoryPerRoleDescription",
    "outProfile3UnitCategoryPerRoleId",
    "outProfile3UnitCategoryPerRolePtjCheckOvercome",
    "outTerminalTerminalNumber",
    "outUnitAddress",
    "outUnitAddress2",
    "outUnitCity",
    "outUnitCode",
    "outUnitEmail",
    "outUnitFax",
    "outUnitNode",
    "outUnitTelephone1",
    "outUnitTelephone2",
    "outUnitUnitName",
    "outUnitZipCode",
    "outUsrActivationDate",
    "outUsrCode",
    "outUsrEmail",
    "outUsrEntryStatus",
    "outUsrMobilePhone",
    "outUsrPassword",
    "outUsrVirtualUser",
    "outUsrWorkPhone"
})
public class CI3496VGetUserInfoExport
    extends BaseExport
{

    @XmlElement(name = "OutBankParametersBankCode")
    protected short outBankParametersBankCode;
    @XmlElement(name = "OutBankParametersBankName")
    protected String outBankParametersBankName;
    @XmlElement(name = "OutBankParametersCurrTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBankParametersCurrTrxDate;
    @XmlElement(name = "OutBankemployeeFirstName")
    protected String outBankemployeeFirstName;
    @XmlElement(name = "OutBankemployeeId")
    protected String outBankemployeeId;
    @XmlElement(name = "OutBankemployeeLastName")
    protected String outBankemployeeLastName;
    @XmlElement(name = "OutDistrChannelChannelInd")
    protected String outDistrChannelChannelInd;
    @XmlElement(name = "OutDistrChannelDescription")
    protected String outDistrChannelDescription;
    @XmlElement(name = "OutDistrChannelIdChannel")
    protected int outDistrChannelIdChannel;
    @XmlElement(name = "OutDistrChannelShortDescr")
    protected String outDistrChannelShortDescr;
    @XmlElement(name = "OutLoggedUserCashTillNo")
    protected int outLoggedUserCashTillNo;
    @XmlElement(name = "OutLoggedUserLoginStatus")
    protected String outLoggedUserLoginStatus;
    @XmlElement(name = "OutLoggedUserTerminalId")
    protected String outLoggedUserTerminalId;
    @XmlElement(name = "OutLoggedUserUsercode")
    protected String outLoggedUserUsercode;
    @XmlElement(name = "OutProfile1UnitCategoryPerRoleDescription")
    protected String outProfile1UnitCategoryPerRoleDescription;
    @XmlElement(name = "OutProfile1UnitCategoryPerRoleId")
    protected String outProfile1UnitCategoryPerRoleId;
    @XmlElement(name = "OutProfile1UnitCategoryPerRolePtjCheckOvercome")
    protected String outProfile1UnitCategoryPerRolePtjCheckOvercome;
    @XmlElement(name = "OutProfile2UnitCategoryPerRoleDescription")
    protected String outProfile2UnitCategoryPerRoleDescription;
    @XmlElement(name = "OutProfile2UnitCategoryPerRoleId")
    protected String outProfile2UnitCategoryPerRoleId;
    @XmlElement(name = "OutProfile2UnitCategoryPerRolePtjCheckOvercome")
    protected String outProfile2UnitCategoryPerRolePtjCheckOvercome;
    @XmlElement(name = "OutProfile3UnitCategoryPerRoleDescription")
    protected String outProfile3UnitCategoryPerRoleDescription;
    @XmlElement(name = "OutProfile3UnitCategoryPerRoleId")
    protected String outProfile3UnitCategoryPerRoleId;
    @XmlElement(name = "OutProfile3UnitCategoryPerRolePtjCheckOvercome")
    protected String outProfile3UnitCategoryPerRolePtjCheckOvercome;
    @XmlElement(name = "OutTerminalTerminalNumber")
    protected String outTerminalTerminalNumber;
    @XmlElement(name = "OutUnitAddress")
    protected String outUnitAddress;
    @XmlElement(name = "OutUnitAddress2")
    protected String outUnitAddress2;
    @XmlElement(name = "OutUnitCity")
    protected String outUnitCity;
    @XmlElement(name = "OutUnitCode")
    protected int outUnitCode;
    @XmlElement(name = "OutUnitEmail")
    protected String outUnitEmail;
    @XmlElement(name = "OutUnitFax")
    protected String outUnitFax;
    @XmlElement(name = "OutUnitNode")
    protected String outUnitNode;
    @XmlElement(name = "OutUnitTelephone1")
    protected String outUnitTelephone1;
    @XmlElement(name = "OutUnitTelephone2")
    protected String outUnitTelephone2;
    @XmlElement(name = "OutUnitUnitName")
    protected String outUnitUnitName;
    @XmlElement(name = "OutUnitZipCode")
    protected String outUnitZipCode;
    @XmlElement(name = "OutUsrActivationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outUsrActivationDate;
    @XmlElement(name = "OutUsrCode")
    protected String outUsrCode;
    @XmlElement(name = "OutUsrEmail")
    protected String outUsrEmail;
    @XmlElement(name = "OutUsrEntryStatus")
    protected String outUsrEntryStatus;
    @XmlElement(name = "OutUsrMobilePhone")
    protected String outUsrMobilePhone;
    @XmlElement(name = "OutUsrPassword")
    protected String outUsrPassword;
    @XmlElement(name = "OutUsrVirtualUser")
    protected String outUsrVirtualUser;
    @XmlElement(name = "OutUsrWorkPhone")
    protected String outUsrWorkPhone;

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
     * Gets the value of the outBankParametersBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankParametersBankName() {
        return outBankParametersBankName;
    }

    /**
     * Sets the value of the outBankParametersBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankParametersBankName(String value) {
        this.outBankParametersBankName = value;
    }

    /**
     * Gets the value of the outBankParametersCurrTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBankParametersCurrTrxDate() {
        return outBankParametersCurrTrxDate;
    }

    /**
     * Sets the value of the outBankParametersCurrTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBankParametersCurrTrxDate(XMLGregorianCalendar value) {
        this.outBankParametersCurrTrxDate = value;
    }

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
     * Gets the value of the outDistrChannelChannelInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDistrChannelChannelInd() {
        return outDistrChannelChannelInd;
    }

    /**
     * Sets the value of the outDistrChannelChannelInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDistrChannelChannelInd(String value) {
        this.outDistrChannelChannelInd = value;
    }

    /**
     * Gets the value of the outDistrChannelDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDistrChannelDescription() {
        return outDistrChannelDescription;
    }

    /**
     * Sets the value of the outDistrChannelDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDistrChannelDescription(String value) {
        this.outDistrChannelDescription = value;
    }

    /**
     * Gets the value of the outDistrChannelIdChannel property.
     * 
     */
    public int getOutDistrChannelIdChannel() {
        return outDistrChannelIdChannel;
    }

    /**
     * Sets the value of the outDistrChannelIdChannel property.
     * 
     */
    public void setOutDistrChannelIdChannel(int value) {
        this.outDistrChannelIdChannel = value;
    }

    /**
     * Gets the value of the outDistrChannelShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDistrChannelShortDescr() {
        return outDistrChannelShortDescr;
    }

    /**
     * Sets the value of the outDistrChannelShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDistrChannelShortDescr(String value) {
        this.outDistrChannelShortDescr = value;
    }

    /**
     * Gets the value of the outLoggedUserCashTillNo property.
     * 
     */
    public int getOutLoggedUserCashTillNo() {
        return outLoggedUserCashTillNo;
    }

    /**
     * Sets the value of the outLoggedUserCashTillNo property.
     * 
     */
    public void setOutLoggedUserCashTillNo(int value) {
        this.outLoggedUserCashTillNo = value;
    }

    /**
     * Gets the value of the outLoggedUserLoginStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoggedUserLoginStatus() {
        return outLoggedUserLoginStatus;
    }

    /**
     * Sets the value of the outLoggedUserLoginStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoggedUserLoginStatus(String value) {
        this.outLoggedUserLoginStatus = value;
    }

    /**
     * Gets the value of the outLoggedUserTerminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoggedUserTerminalId() {
        return outLoggedUserTerminalId;
    }

    /**
     * Sets the value of the outLoggedUserTerminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoggedUserTerminalId(String value) {
        this.outLoggedUserTerminalId = value;
    }

    /**
     * Gets the value of the outLoggedUserUsercode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoggedUserUsercode() {
        return outLoggedUserUsercode;
    }

    /**
     * Sets the value of the outLoggedUserUsercode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoggedUserUsercode(String value) {
        this.outLoggedUserUsercode = value;
    }

    /**
     * Gets the value of the outProfile1UnitCategoryPerRoleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProfile1UnitCategoryPerRoleDescription() {
        return outProfile1UnitCategoryPerRoleDescription;
    }

    /**
     * Sets the value of the outProfile1UnitCategoryPerRoleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProfile1UnitCategoryPerRoleDescription(String value) {
        this.outProfile1UnitCategoryPerRoleDescription = value;
    }

    /**
     * Gets the value of the outProfile1UnitCategoryPerRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProfile1UnitCategoryPerRoleId() {
        return outProfile1UnitCategoryPerRoleId;
    }

    /**
     * Sets the value of the outProfile1UnitCategoryPerRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProfile1UnitCategoryPerRoleId(String value) {
        this.outProfile1UnitCategoryPerRoleId = value;
    }

    /**
     * Gets the value of the outProfile1UnitCategoryPerRolePtjCheckOvercome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProfile1UnitCategoryPerRolePtjCheckOvercome() {
        return outProfile1UnitCategoryPerRolePtjCheckOvercome;
    }

    /**
     * Sets the value of the outProfile1UnitCategoryPerRolePtjCheckOvercome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProfile1UnitCategoryPerRolePtjCheckOvercome(String value) {
        this.outProfile1UnitCategoryPerRolePtjCheckOvercome = value;
    }

    /**
     * Gets the value of the outProfile2UnitCategoryPerRoleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProfile2UnitCategoryPerRoleDescription() {
        return outProfile2UnitCategoryPerRoleDescription;
    }

    /**
     * Sets the value of the outProfile2UnitCategoryPerRoleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProfile2UnitCategoryPerRoleDescription(String value) {
        this.outProfile2UnitCategoryPerRoleDescription = value;
    }

    /**
     * Gets the value of the outProfile2UnitCategoryPerRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProfile2UnitCategoryPerRoleId() {
        return outProfile2UnitCategoryPerRoleId;
    }

    /**
     * Sets the value of the outProfile2UnitCategoryPerRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProfile2UnitCategoryPerRoleId(String value) {
        this.outProfile2UnitCategoryPerRoleId = value;
    }

    /**
     * Gets the value of the outProfile2UnitCategoryPerRolePtjCheckOvercome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProfile2UnitCategoryPerRolePtjCheckOvercome() {
        return outProfile2UnitCategoryPerRolePtjCheckOvercome;
    }

    /**
     * Sets the value of the outProfile2UnitCategoryPerRolePtjCheckOvercome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProfile2UnitCategoryPerRolePtjCheckOvercome(String value) {
        this.outProfile2UnitCategoryPerRolePtjCheckOvercome = value;
    }

    /**
     * Gets the value of the outProfile3UnitCategoryPerRoleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProfile3UnitCategoryPerRoleDescription() {
        return outProfile3UnitCategoryPerRoleDescription;
    }

    /**
     * Sets the value of the outProfile3UnitCategoryPerRoleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProfile3UnitCategoryPerRoleDescription(String value) {
        this.outProfile3UnitCategoryPerRoleDescription = value;
    }

    /**
     * Gets the value of the outProfile3UnitCategoryPerRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProfile3UnitCategoryPerRoleId() {
        return outProfile3UnitCategoryPerRoleId;
    }

    /**
     * Sets the value of the outProfile3UnitCategoryPerRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProfile3UnitCategoryPerRoleId(String value) {
        this.outProfile3UnitCategoryPerRoleId = value;
    }

    /**
     * Gets the value of the outProfile3UnitCategoryPerRolePtjCheckOvercome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProfile3UnitCategoryPerRolePtjCheckOvercome() {
        return outProfile3UnitCategoryPerRolePtjCheckOvercome;
    }

    /**
     * Sets the value of the outProfile3UnitCategoryPerRolePtjCheckOvercome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProfile3UnitCategoryPerRolePtjCheckOvercome(String value) {
        this.outProfile3UnitCategoryPerRolePtjCheckOvercome = value;
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
     * Gets the value of the outUnitAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUnitAddress() {
        return outUnitAddress;
    }

    /**
     * Sets the value of the outUnitAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUnitAddress(String value) {
        this.outUnitAddress = value;
    }

    /**
     * Gets the value of the outUnitAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUnitAddress2() {
        return outUnitAddress2;
    }

    /**
     * Sets the value of the outUnitAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUnitAddress2(String value) {
        this.outUnitAddress2 = value;
    }

    /**
     * Gets the value of the outUnitCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUnitCity() {
        return outUnitCity;
    }

    /**
     * Sets the value of the outUnitCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUnitCity(String value) {
        this.outUnitCity = value;
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
     * Gets the value of the outUnitEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUnitEmail() {
        return outUnitEmail;
    }

    /**
     * Sets the value of the outUnitEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUnitEmail(String value) {
        this.outUnitEmail = value;
    }

    /**
     * Gets the value of the outUnitFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUnitFax() {
        return outUnitFax;
    }

    /**
     * Sets the value of the outUnitFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUnitFax(String value) {
        this.outUnitFax = value;
    }

    /**
     * Gets the value of the outUnitNode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUnitNode() {
        return outUnitNode;
    }

    /**
     * Sets the value of the outUnitNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUnitNode(String value) {
        this.outUnitNode = value;
    }

    /**
     * Gets the value of the outUnitTelephone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUnitTelephone1() {
        return outUnitTelephone1;
    }

    /**
     * Sets the value of the outUnitTelephone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUnitTelephone1(String value) {
        this.outUnitTelephone1 = value;
    }

    /**
     * Gets the value of the outUnitTelephone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUnitTelephone2() {
        return outUnitTelephone2;
    }

    /**
     * Sets the value of the outUnitTelephone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUnitTelephone2(String value) {
        this.outUnitTelephone2 = value;
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
     * Gets the value of the outUnitZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUnitZipCode() {
        return outUnitZipCode;
    }

    /**
     * Sets the value of the outUnitZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUnitZipCode(String value) {
        this.outUnitZipCode = value;
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

}
