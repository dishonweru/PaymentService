
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for G0598VManageGlAccountImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="G0598VManageGlAccountImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InGlgAccountExternalGlaccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountOptionalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountDsubTrnFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountRealTimeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountUpdateWayInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountValeurDateFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountSubsConsFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountSubsidCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGlgAccountDbCrBalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountSecLevel" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGlgAccountTimestmp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGlgAccountModifyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGlgAccountOpenDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGlgAccountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountUnitRealTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountValeurFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountDeactivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGlgAccountMandAdditionalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountMandCustInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountUpdatedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountLastUpdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGlgAccountPositionFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountFcconvFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountBopGroupAccount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGlgAccountBopFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountReconFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountReconStartDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGlgAccountReconRunDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCategUnitGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCategUnitGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPermitUnitGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPermitUnitGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSubsGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSubsGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgHCurrGroupCurrGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "G0598VManageGlAccountImport", propOrder = {
    "inGlgAccountExternalGlaccount",
    "inGlgAccountAccountId",
    "inGlgAccountLevel",
    "inGlgAccountShortDescr",
    "inGlgAccountDescr",
    "inGlgAccountState",
    "inGlgAccountOptionalFlag",
    "inGlgAccountDsubTrnFlag",
    "inGlgAccountRealTimeFlag",
    "inGlgAccountUpdateWayInd",
    "inGlgAccountValeurDateFlag",
    "inGlgAccountSubsConsFlag",
    "inGlgAccountSubsidCount",
    "inGlgAccountDbCrBalFlag",
    "inGlgAccountSecLevel",
    "inGlgAccountTimestmp",
    "inGlgAccountModifyDate",
    "inGlgAccountOpenDate",
    "inGlgAccountStatus",
    "inGlgAccountUnitRealTime",
    "inGlgAccountValeurFlg",
    "inGlgAccountDeactivationDate",
    "inGlgAccountMandAdditionalInfo",
    "inGlgAccountMandCustInfo",
    "inGlgAccountUpdatedFlag",
    "inGlgAccountLastUpdDate",
    "inGlgAccountPositionFlag",
    "inGlgAccountFcconvFlag",
    "inGlgAccountBopGroupAccount",
    "inGlgAccountBopFlg",
    "inGlgAccountReconFlag",
    "inGlgAccountReconStartDt",
    "inGlgAccountReconRunDt",
    "inCategUnitGenericDetailSerialNum",
    "inCategUnitGenericDetailDescription",
    "inPermitUnitGenericDetailSerialNum",
    "inPermitUnitGenericDetailDescription",
    "inSubsGenericDetailSerialNum",
    "inSubsGenericDetailDescription",
    "inGlgHCurrGroupCurrGroupId",
    "inProductIdProduct",
    "inPrftTransactionIdTransact",
    "inJustificIdJustific",
    "inTerminalTerminalNumber"
})
public class G0598VManageGlAccountImport
    extends BaseImport
{

    @XmlElement(name = "InGlgAccountExternalGlaccount")
    protected String inGlgAccountExternalGlaccount;
    @XmlElement(name = "InGlgAccountAccountId")
    protected String inGlgAccountAccountId;
    @XmlElement(name = "InGlgAccountLevel")
    protected String inGlgAccountLevel;
    @XmlElement(name = "InGlgAccountShortDescr")
    protected String inGlgAccountShortDescr;
    @XmlElement(name = "InGlgAccountDescr")
    protected String inGlgAccountDescr;
    @XmlElement(name = "InGlgAccountState")
    protected String inGlgAccountState;
    @XmlElement(name = "InGlgAccountOptionalFlag")
    protected String inGlgAccountOptionalFlag;
    @XmlElement(name = "InGlgAccountDsubTrnFlag")
    protected String inGlgAccountDsubTrnFlag;
    @XmlElement(name = "InGlgAccountRealTimeFlag")
    protected String inGlgAccountRealTimeFlag;
    @XmlElement(name = "InGlgAccountUpdateWayInd")
    protected String inGlgAccountUpdateWayInd;
    @XmlElement(name = "InGlgAccountValeurDateFlag")
    protected String inGlgAccountValeurDateFlag;
    @XmlElement(name = "InGlgAccountSubsConsFlag")
    protected String inGlgAccountSubsConsFlag;
    @XmlElement(name = "InGlgAccountSubsidCount")
    protected int inGlgAccountSubsidCount;
    @XmlElement(name = "InGlgAccountDbCrBalFlag")
    protected String inGlgAccountDbCrBalFlag;
    @XmlElement(name = "InGlgAccountSecLevel")
    protected short inGlgAccountSecLevel;
    @XmlElement(name = "InGlgAccountTimestmp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGlgAccountTimestmp;
    @XmlElement(name = "InGlgAccountModifyDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGlgAccountModifyDate;
    @XmlElement(name = "InGlgAccountOpenDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGlgAccountOpenDate;
    @XmlElement(name = "InGlgAccountStatus")
    protected String inGlgAccountStatus;
    @XmlElement(name = "InGlgAccountUnitRealTime")
    protected String inGlgAccountUnitRealTime;
    @XmlElement(name = "InGlgAccountValeurFlg")
    protected String inGlgAccountValeurFlg;
    @XmlElement(name = "InGlgAccountDeactivationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGlgAccountDeactivationDate;
    @XmlElement(name = "InGlgAccountMandAdditionalInfo")
    protected String inGlgAccountMandAdditionalInfo;
    @XmlElement(name = "InGlgAccountMandCustInfo")
    protected String inGlgAccountMandCustInfo;
    @XmlElement(name = "InGlgAccountUpdatedFlag")
    protected String inGlgAccountUpdatedFlag;
    @XmlElement(name = "InGlgAccountLastUpdDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGlgAccountLastUpdDate;
    @XmlElement(name = "InGlgAccountPositionFlag")
    protected String inGlgAccountPositionFlag;
    @XmlElement(name = "InGlgAccountFcconvFlag")
    protected String inGlgAccountFcconvFlag;
    @XmlElement(name = "InGlgAccountBopGroupAccount")
    protected int inGlgAccountBopGroupAccount;
    @XmlElement(name = "InGlgAccountBopFlg")
    protected String inGlgAccountBopFlg;
    @XmlElement(name = "InGlgAccountReconFlag")
    protected String inGlgAccountReconFlag;
    @XmlElement(name = "InGlgAccountReconStartDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGlgAccountReconStartDt;
    @XmlElement(name = "InGlgAccountReconRunDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGlgAccountReconRunDt;
    @XmlElement(name = "InCategUnitGenericDetailSerialNum")
    protected int inCategUnitGenericDetailSerialNum;
    @XmlElement(name = "InCategUnitGenericDetailDescription")
    protected String inCategUnitGenericDetailDescription;
    @XmlElement(name = "InPermitUnitGenericDetailSerialNum")
    protected int inPermitUnitGenericDetailSerialNum;
    @XmlElement(name = "InPermitUnitGenericDetailDescription")
    protected String inPermitUnitGenericDetailDescription;
    @XmlElement(name = "InSubsGenericDetailSerialNum")
    protected int inSubsGenericDetailSerialNum;
    @XmlElement(name = "InSubsGenericDetailDescription")
    protected String inSubsGenericDetailDescription;
    @XmlElement(name = "InGlgHCurrGroupCurrGroupId")
    protected String inGlgHCurrGroupCurrGroupId;
    @XmlElement(name = "InProductIdProduct")
    protected int inProductIdProduct;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InJustificIdJustific")
    protected int inJustificIdJustific;
    @XmlElement(name = "InTerminalTerminalNumber")
    protected String inTerminalTerminalNumber;

    /**
     * Gets the value of the inGlgAccountExternalGlaccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGlgAccountExternalGlaccount() {
        return inGlgAccountExternalGlaccount;
    }

    /**
     * Sets the value of the inGlgAccountExternalGlaccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGlgAccountExternalGlaccount(String value) {
        this.inGlgAccountExternalGlaccount = value;
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
     * Gets the value of the inTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTerminalTerminalNumber() {
        return inTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTerminalTerminalNumber(String value) {
        this.inTerminalTerminalNumber = value;
    }

}
