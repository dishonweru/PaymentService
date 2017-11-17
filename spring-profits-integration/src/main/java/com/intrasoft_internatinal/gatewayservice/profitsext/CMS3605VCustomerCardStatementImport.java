
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CMS3605VCustomerCardStatementImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CMS3605VCustomerCardStatementImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthResultTeamInformationAuthorizationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthResultTeamInformationSuper1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthResultTeamInformationSuper2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthorGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCriteriaCmsCardCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCriteriaCmsCardCardSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InCriteriaCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCriteriaCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCriteriaDateFromIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCriteriaDateToIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLastExtraitCmsCardExtraitTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InParametersInBankParametersAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInBankParametersBankCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InParametersInBankParametersBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInBankParametersCurrTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InParametersInBankParametersDomesticCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInBankParametersEuroEchoDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInBankParametersIbanFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInBankParametersMaxAmntRateTbl" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InParametersInBankParametersRateUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInBankParametersSwiftAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInBankParametersTaxRegNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInBankemployeeFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInDistrChannelIdChannel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InParametersInProfile1UnitCategoryPerRoleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInProfile1UnitCategoryPerRolePtjCheckOvercome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInProfile2UnitCategoryPerRoleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInProfile2UnitCategoryPerRolePtjCheckOvercome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInProfile3UnitCategoryPerRoleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInProfile3UnitCategoryPerRolePtjCheckOvercome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InParametersInUnitClearingHouseFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InParametersInUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInUnitCategoryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InParametersInUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInUsrGlLevel" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InParametersInUsrPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInWorkDatesProductionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSsSecurityCmcbPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSsSecurityCmcbTranCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CMS3605VCustomerCardStatementImport", propOrder = {
    "command",
    "inAuthResultTeamInformationAuthorizationResult",
    "inAuthResultTeamInformationSuper1Code",
    "inAuthResultTeamInformationSuper2Code",
    "inAuthorGrantedIefSuppliedFlag",
    "inCommandIefSuppliedCommand",
    "inCriteriaCmsCardCardNumber",
    "inCriteriaCmsCardCardSn",
    "inCriteriaCustomerCDigit",
    "inCriteriaCustomerCustId",
    "inCriteriaDateFromIefSuppliedDate",
    "inCriteriaDateToIefSuppliedDate",
    "inLastExtraitCmsCardExtraitTmstamp",
    "inParametersInBankParametersAddress",
    "inParametersInBankParametersBankCode",
    "inParametersInBankParametersBankName",
    "inParametersInBankParametersCurrTrxDate",
    "inParametersInBankParametersDomesticCurrency",
    "inParametersInBankParametersEuroEchoDesc",
    "inParametersInBankParametersIbanFlag",
    "inParametersInBankParametersMaxAmntRateTbl",
    "inParametersInBankParametersRateUsage",
    "inParametersInBankParametersSwiftAddress",
    "inParametersInBankParametersTaxRegNo",
    "inParametersInBankemployeeFirstName",
    "inParametersInBankemployeeLastName",
    "inParametersInDistrChannelIdChannel",
    "inParametersInProfile1UnitCategoryPerRoleId",
    "inParametersInProfile1UnitCategoryPerRolePtjCheckOvercome",
    "inParametersInProfile2UnitCategoryPerRoleId",
    "inParametersInProfile2UnitCategoryPerRolePtjCheckOvercome",
    "inParametersInProfile3UnitCategoryPerRoleId",
    "inParametersInProfile3UnitCategoryPerRolePtjCheckOvercome",
    "inParametersInTerminalTerminalNumber",
    "inParametersInTrxCountTrxCounter",
    "inParametersInUnitClearingHouseFlag",
    "inParametersInUnitCode",
    "inParametersInUnitUnitName",
    "inParametersInUnitCategoryGenericDetailSerialNum",
    "inParametersInUsrCode",
    "inParametersInUsrGlLevel",
    "inParametersInUsrPassword",
    "inParametersInWorkDatesProductionDate",
    "inPrftTransactionDescription",
    "inPrftTransactionIdTransact",
    "inSsSecurityCmcbPrftSystem",
    "inSsSecurityCmcbTranCode"
})
public class CMS3605VCustomerCardStatementImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InAuthResultTeamInformationAuthorizationResult")
    protected String inAuthResultTeamInformationAuthorizationResult;
    @XmlElement(name = "InAuthResultTeamInformationSuper1Code")
    protected String inAuthResultTeamInformationSuper1Code;
    @XmlElement(name = "InAuthResultTeamInformationSuper2Code")
    protected String inAuthResultTeamInformationSuper2Code;
    @XmlElement(name = "InAuthorGrantedIefSuppliedFlag")
    protected String inAuthorGrantedIefSuppliedFlag;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InCriteriaCmsCardCardNumber")
    protected String inCriteriaCmsCardCardNumber;
    @XmlElement(name = "InCriteriaCmsCardCardSn")
    protected double inCriteriaCmsCardCardSn;
    @XmlElement(name = "InCriteriaCustomerCDigit")
    protected short inCriteriaCustomerCDigit;
    @XmlElement(name = "InCriteriaCustomerCustId")
    protected int inCriteriaCustomerCustId;
    @XmlElement(name = "InCriteriaDateFromIefSuppliedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCriteriaDateFromIefSuppliedDate;
    @XmlElement(name = "InCriteriaDateToIefSuppliedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCriteriaDateToIefSuppliedDate;
    @XmlElement(name = "InLastExtraitCmsCardExtraitTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLastExtraitCmsCardExtraitTmstamp;
    @XmlElement(name = "InParametersInBankParametersAddress")
    protected String inParametersInBankParametersAddress;
    @XmlElement(name = "InParametersInBankParametersBankCode")
    protected short inParametersInBankParametersBankCode;
    @XmlElement(name = "InParametersInBankParametersBankName")
    protected String inParametersInBankParametersBankName;
    @XmlElement(name = "InParametersInBankParametersCurrTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inParametersInBankParametersCurrTrxDate;
    @XmlElement(name = "InParametersInBankParametersDomesticCurrency")
    protected String inParametersInBankParametersDomesticCurrency;
    @XmlElement(name = "InParametersInBankParametersEuroEchoDesc")
    protected String inParametersInBankParametersEuroEchoDesc;
    @XmlElement(name = "InParametersInBankParametersIbanFlag")
    protected String inParametersInBankParametersIbanFlag;
    @XmlElement(name = "InParametersInBankParametersMaxAmntRateTbl", required = true)
    protected BigDecimal inParametersInBankParametersMaxAmntRateTbl;
    @XmlElement(name = "InParametersInBankParametersRateUsage")
    protected String inParametersInBankParametersRateUsage;
    @XmlElement(name = "InParametersInBankParametersSwiftAddress")
    protected String inParametersInBankParametersSwiftAddress;
    @XmlElement(name = "InParametersInBankParametersTaxRegNo")
    protected String inParametersInBankParametersTaxRegNo;
    @XmlElement(name = "InParametersInBankemployeeFirstName")
    protected String inParametersInBankemployeeFirstName;
    @XmlElement(name = "InParametersInBankemployeeLastName")
    protected String inParametersInBankemployeeLastName;
    @XmlElement(name = "InParametersInDistrChannelIdChannel")
    protected int inParametersInDistrChannelIdChannel;
    @XmlElement(name = "InParametersInProfile1UnitCategoryPerRoleId")
    protected String inParametersInProfile1UnitCategoryPerRoleId;
    @XmlElement(name = "InParametersInProfile1UnitCategoryPerRolePtjCheckOvercome")
    protected String inParametersInProfile1UnitCategoryPerRolePtjCheckOvercome;
    @XmlElement(name = "InParametersInProfile2UnitCategoryPerRoleId")
    protected String inParametersInProfile2UnitCategoryPerRoleId;
    @XmlElement(name = "InParametersInProfile2UnitCategoryPerRolePtjCheckOvercome")
    protected String inParametersInProfile2UnitCategoryPerRolePtjCheckOvercome;
    @XmlElement(name = "InParametersInProfile3UnitCategoryPerRoleId")
    protected String inParametersInProfile3UnitCategoryPerRoleId;
    @XmlElement(name = "InParametersInProfile3UnitCategoryPerRolePtjCheckOvercome")
    protected String inParametersInProfile3UnitCategoryPerRolePtjCheckOvercome;
    @XmlElement(name = "InParametersInTerminalTerminalNumber")
    protected String inParametersInTerminalTerminalNumber;
    @XmlElement(name = "InParametersInTrxCountTrxCounter")
    protected int inParametersInTrxCountTrxCounter;
    @XmlElement(name = "InParametersInUnitClearingHouseFlag")
    protected String inParametersInUnitClearingHouseFlag;
    @XmlElement(name = "InParametersInUnitCode")
    protected int inParametersInUnitCode;
    @XmlElement(name = "InParametersInUnitUnitName")
    protected String inParametersInUnitUnitName;
    @XmlElement(name = "InParametersInUnitCategoryGenericDetailSerialNum")
    protected int inParametersInUnitCategoryGenericDetailSerialNum;
    @XmlElement(name = "InParametersInUsrCode")
    protected String inParametersInUsrCode;
    @XmlElement(name = "InParametersInUsrGlLevel")
    protected short inParametersInUsrGlLevel;
    @XmlElement(name = "InParametersInUsrPassword")
    protected String inParametersInUsrPassword;
    @XmlElement(name = "InParametersInWorkDatesProductionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inParametersInWorkDatesProductionDate;
    @XmlElement(name = "InPrftTransactionDescription")
    protected String inPrftTransactionDescription;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InSsSecurityCmcbPrftSystem")
    protected short inSsSecurityCmcbPrftSystem;
    @XmlElement(name = "InSsSecurityCmcbTranCode")
    protected String inSsSecurityCmcbTranCode;

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
     * Gets the value of the inAuthResultTeamInformationAuthorizationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthResultTeamInformationAuthorizationResult() {
        return inAuthResultTeamInformationAuthorizationResult;
    }

    /**
     * Sets the value of the inAuthResultTeamInformationAuthorizationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthResultTeamInformationAuthorizationResult(String value) {
        this.inAuthResultTeamInformationAuthorizationResult = value;
    }

    /**
     * Gets the value of the inAuthResultTeamInformationSuper1Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthResultTeamInformationSuper1Code() {
        return inAuthResultTeamInformationSuper1Code;
    }

    /**
     * Sets the value of the inAuthResultTeamInformationSuper1Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthResultTeamInformationSuper1Code(String value) {
        this.inAuthResultTeamInformationSuper1Code = value;
    }

    /**
     * Gets the value of the inAuthResultTeamInformationSuper2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthResultTeamInformationSuper2Code() {
        return inAuthResultTeamInformationSuper2Code;
    }

    /**
     * Sets the value of the inAuthResultTeamInformationSuper2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthResultTeamInformationSuper2Code(String value) {
        this.inAuthResultTeamInformationSuper2Code = value;
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
     * Gets the value of the inCommandIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCommandIefSuppliedCommand() {
        return inCommandIefSuppliedCommand;
    }

    /**
     * Sets the value of the inCommandIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCommandIefSuppliedCommand(String value) {
        this.inCommandIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the inCriteriaCmsCardCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCriteriaCmsCardCardNumber() {
        return inCriteriaCmsCardCardNumber;
    }

    /**
     * Sets the value of the inCriteriaCmsCardCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCriteriaCmsCardCardNumber(String value) {
        this.inCriteriaCmsCardCardNumber = value;
    }

    /**
     * Gets the value of the inCriteriaCmsCardCardSn property.
     * 
     */
    public double getInCriteriaCmsCardCardSn() {
        return inCriteriaCmsCardCardSn;
    }

    /**
     * Sets the value of the inCriteriaCmsCardCardSn property.
     * 
     */
    public void setInCriteriaCmsCardCardSn(double value) {
        this.inCriteriaCmsCardCardSn = value;
    }

    /**
     * Gets the value of the inCriteriaCustomerCDigit property.
     * 
     */
    public short getInCriteriaCustomerCDigit() {
        return inCriteriaCustomerCDigit;
    }

    /**
     * Sets the value of the inCriteriaCustomerCDigit property.
     * 
     */
    public void setInCriteriaCustomerCDigit(short value) {
        this.inCriteriaCustomerCDigit = value;
    }

    /**
     * Gets the value of the inCriteriaCustomerCustId property.
     * 
     */
    public int getInCriteriaCustomerCustId() {
        return inCriteriaCustomerCustId;
    }

    /**
     * Sets the value of the inCriteriaCustomerCustId property.
     * 
     */
    public void setInCriteriaCustomerCustId(int value) {
        this.inCriteriaCustomerCustId = value;
    }

    /**
     * Gets the value of the inCriteriaDateFromIefSuppliedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCriteriaDateFromIefSuppliedDate() {
        return inCriteriaDateFromIefSuppliedDate;
    }

    /**
     * Sets the value of the inCriteriaDateFromIefSuppliedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCriteriaDateFromIefSuppliedDate(XMLGregorianCalendar value) {
        this.inCriteriaDateFromIefSuppliedDate = value;
    }

    /**
     * Gets the value of the inCriteriaDateToIefSuppliedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCriteriaDateToIefSuppliedDate() {
        return inCriteriaDateToIefSuppliedDate;
    }

    /**
     * Sets the value of the inCriteriaDateToIefSuppliedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCriteriaDateToIefSuppliedDate(XMLGregorianCalendar value) {
        this.inCriteriaDateToIefSuppliedDate = value;
    }

    /**
     * Gets the value of the inLastExtraitCmsCardExtraitTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLastExtraitCmsCardExtraitTmstamp() {
        return inLastExtraitCmsCardExtraitTmstamp;
    }

    /**
     * Sets the value of the inLastExtraitCmsCardExtraitTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLastExtraitCmsCardExtraitTmstamp(XMLGregorianCalendar value) {
        this.inLastExtraitCmsCardExtraitTmstamp = value;
    }

    /**
     * Gets the value of the inParametersInBankParametersAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInBankParametersAddress() {
        return inParametersInBankParametersAddress;
    }

    /**
     * Sets the value of the inParametersInBankParametersAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInBankParametersAddress(String value) {
        this.inParametersInBankParametersAddress = value;
    }

    /**
     * Gets the value of the inParametersInBankParametersBankCode property.
     * 
     */
    public short getInParametersInBankParametersBankCode() {
        return inParametersInBankParametersBankCode;
    }

    /**
     * Sets the value of the inParametersInBankParametersBankCode property.
     * 
     */
    public void setInParametersInBankParametersBankCode(short value) {
        this.inParametersInBankParametersBankCode = value;
    }

    /**
     * Gets the value of the inParametersInBankParametersBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInBankParametersBankName() {
        return inParametersInBankParametersBankName;
    }

    /**
     * Sets the value of the inParametersInBankParametersBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInBankParametersBankName(String value) {
        this.inParametersInBankParametersBankName = value;
    }

    /**
     * Gets the value of the inParametersInBankParametersCurrTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInParametersInBankParametersCurrTrxDate() {
        return inParametersInBankParametersCurrTrxDate;
    }

    /**
     * Sets the value of the inParametersInBankParametersCurrTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInParametersInBankParametersCurrTrxDate(XMLGregorianCalendar value) {
        this.inParametersInBankParametersCurrTrxDate = value;
    }

    /**
     * Gets the value of the inParametersInBankParametersDomesticCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInBankParametersDomesticCurrency() {
        return inParametersInBankParametersDomesticCurrency;
    }

    /**
     * Sets the value of the inParametersInBankParametersDomesticCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInBankParametersDomesticCurrency(String value) {
        this.inParametersInBankParametersDomesticCurrency = value;
    }

    /**
     * Gets the value of the inParametersInBankParametersEuroEchoDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInBankParametersEuroEchoDesc() {
        return inParametersInBankParametersEuroEchoDesc;
    }

    /**
     * Sets the value of the inParametersInBankParametersEuroEchoDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInBankParametersEuroEchoDesc(String value) {
        this.inParametersInBankParametersEuroEchoDesc = value;
    }

    /**
     * Gets the value of the inParametersInBankParametersIbanFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInBankParametersIbanFlag() {
        return inParametersInBankParametersIbanFlag;
    }

    /**
     * Sets the value of the inParametersInBankParametersIbanFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInBankParametersIbanFlag(String value) {
        this.inParametersInBankParametersIbanFlag = value;
    }

    /**
     * Gets the value of the inParametersInBankParametersMaxAmntRateTbl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInParametersInBankParametersMaxAmntRateTbl() {
        return inParametersInBankParametersMaxAmntRateTbl;
    }

    /**
     * Sets the value of the inParametersInBankParametersMaxAmntRateTbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInParametersInBankParametersMaxAmntRateTbl(BigDecimal value) {
        this.inParametersInBankParametersMaxAmntRateTbl = value;
    }

    /**
     * Gets the value of the inParametersInBankParametersRateUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInBankParametersRateUsage() {
        return inParametersInBankParametersRateUsage;
    }

    /**
     * Sets the value of the inParametersInBankParametersRateUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInBankParametersRateUsage(String value) {
        this.inParametersInBankParametersRateUsage = value;
    }

    /**
     * Gets the value of the inParametersInBankParametersSwiftAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInBankParametersSwiftAddress() {
        return inParametersInBankParametersSwiftAddress;
    }

    /**
     * Sets the value of the inParametersInBankParametersSwiftAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInBankParametersSwiftAddress(String value) {
        this.inParametersInBankParametersSwiftAddress = value;
    }

    /**
     * Gets the value of the inParametersInBankParametersTaxRegNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInBankParametersTaxRegNo() {
        return inParametersInBankParametersTaxRegNo;
    }

    /**
     * Sets the value of the inParametersInBankParametersTaxRegNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInBankParametersTaxRegNo(String value) {
        this.inParametersInBankParametersTaxRegNo = value;
    }

    /**
     * Gets the value of the inParametersInBankemployeeFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInBankemployeeFirstName() {
        return inParametersInBankemployeeFirstName;
    }

    /**
     * Sets the value of the inParametersInBankemployeeFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInBankemployeeFirstName(String value) {
        this.inParametersInBankemployeeFirstName = value;
    }

    /**
     * Gets the value of the inParametersInBankemployeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInBankemployeeLastName() {
        return inParametersInBankemployeeLastName;
    }

    /**
     * Sets the value of the inParametersInBankemployeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInBankemployeeLastName(String value) {
        this.inParametersInBankemployeeLastName = value;
    }

    /**
     * Gets the value of the inParametersInDistrChannelIdChannel property.
     * 
     */
    public int getInParametersInDistrChannelIdChannel() {
        return inParametersInDistrChannelIdChannel;
    }

    /**
     * Sets the value of the inParametersInDistrChannelIdChannel property.
     * 
     */
    public void setInParametersInDistrChannelIdChannel(int value) {
        this.inParametersInDistrChannelIdChannel = value;
    }

    /**
     * Gets the value of the inParametersInProfile1UnitCategoryPerRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInProfile1UnitCategoryPerRoleId() {
        return inParametersInProfile1UnitCategoryPerRoleId;
    }

    /**
     * Sets the value of the inParametersInProfile1UnitCategoryPerRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInProfile1UnitCategoryPerRoleId(String value) {
        this.inParametersInProfile1UnitCategoryPerRoleId = value;
    }

    /**
     * Gets the value of the inParametersInProfile1UnitCategoryPerRolePtjCheckOvercome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInProfile1UnitCategoryPerRolePtjCheckOvercome() {
        return inParametersInProfile1UnitCategoryPerRolePtjCheckOvercome;
    }

    /**
     * Sets the value of the inParametersInProfile1UnitCategoryPerRolePtjCheckOvercome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInProfile1UnitCategoryPerRolePtjCheckOvercome(String value) {
        this.inParametersInProfile1UnitCategoryPerRolePtjCheckOvercome = value;
    }

    /**
     * Gets the value of the inParametersInProfile2UnitCategoryPerRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInProfile2UnitCategoryPerRoleId() {
        return inParametersInProfile2UnitCategoryPerRoleId;
    }

    /**
     * Sets the value of the inParametersInProfile2UnitCategoryPerRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInProfile2UnitCategoryPerRoleId(String value) {
        this.inParametersInProfile2UnitCategoryPerRoleId = value;
    }

    /**
     * Gets the value of the inParametersInProfile2UnitCategoryPerRolePtjCheckOvercome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInProfile2UnitCategoryPerRolePtjCheckOvercome() {
        return inParametersInProfile2UnitCategoryPerRolePtjCheckOvercome;
    }

    /**
     * Sets the value of the inParametersInProfile2UnitCategoryPerRolePtjCheckOvercome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInProfile2UnitCategoryPerRolePtjCheckOvercome(String value) {
        this.inParametersInProfile2UnitCategoryPerRolePtjCheckOvercome = value;
    }

    /**
     * Gets the value of the inParametersInProfile3UnitCategoryPerRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInProfile3UnitCategoryPerRoleId() {
        return inParametersInProfile3UnitCategoryPerRoleId;
    }

    /**
     * Sets the value of the inParametersInProfile3UnitCategoryPerRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInProfile3UnitCategoryPerRoleId(String value) {
        this.inParametersInProfile3UnitCategoryPerRoleId = value;
    }

    /**
     * Gets the value of the inParametersInProfile3UnitCategoryPerRolePtjCheckOvercome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInProfile3UnitCategoryPerRolePtjCheckOvercome() {
        return inParametersInProfile3UnitCategoryPerRolePtjCheckOvercome;
    }

    /**
     * Sets the value of the inParametersInProfile3UnitCategoryPerRolePtjCheckOvercome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInProfile3UnitCategoryPerRolePtjCheckOvercome(String value) {
        this.inParametersInProfile3UnitCategoryPerRolePtjCheckOvercome = value;
    }

    /**
     * Gets the value of the inParametersInTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInTerminalTerminalNumber() {
        return inParametersInTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inParametersInTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInTerminalTerminalNumber(String value) {
        this.inParametersInTerminalTerminalNumber = value;
    }

    /**
     * Gets the value of the inParametersInTrxCountTrxCounter property.
     * 
     */
    public int getInParametersInTrxCountTrxCounter() {
        return inParametersInTrxCountTrxCounter;
    }

    /**
     * Sets the value of the inParametersInTrxCountTrxCounter property.
     * 
     */
    public void setInParametersInTrxCountTrxCounter(int value) {
        this.inParametersInTrxCountTrxCounter = value;
    }

    /**
     * Gets the value of the inParametersInUnitClearingHouseFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInUnitClearingHouseFlag() {
        return inParametersInUnitClearingHouseFlag;
    }

    /**
     * Sets the value of the inParametersInUnitClearingHouseFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInUnitClearingHouseFlag(String value) {
        this.inParametersInUnitClearingHouseFlag = value;
    }

    /**
     * Gets the value of the inParametersInUnitCode property.
     * 
     */
    public int getInParametersInUnitCode() {
        return inParametersInUnitCode;
    }

    /**
     * Sets the value of the inParametersInUnitCode property.
     * 
     */
    public void setInParametersInUnitCode(int value) {
        this.inParametersInUnitCode = value;
    }

    /**
     * Gets the value of the inParametersInUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInUnitUnitName() {
        return inParametersInUnitUnitName;
    }

    /**
     * Sets the value of the inParametersInUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInUnitUnitName(String value) {
        this.inParametersInUnitUnitName = value;
    }

    /**
     * Gets the value of the inParametersInUnitCategoryGenericDetailSerialNum property.
     * 
     */
    public int getInParametersInUnitCategoryGenericDetailSerialNum() {
        return inParametersInUnitCategoryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inParametersInUnitCategoryGenericDetailSerialNum property.
     * 
     */
    public void setInParametersInUnitCategoryGenericDetailSerialNum(int value) {
        this.inParametersInUnitCategoryGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inParametersInUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInUsrCode() {
        return inParametersInUsrCode;
    }

    /**
     * Sets the value of the inParametersInUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInUsrCode(String value) {
        this.inParametersInUsrCode = value;
    }

    /**
     * Gets the value of the inParametersInUsrGlLevel property.
     * 
     */
    public short getInParametersInUsrGlLevel() {
        return inParametersInUsrGlLevel;
    }

    /**
     * Sets the value of the inParametersInUsrGlLevel property.
     * 
     */
    public void setInParametersInUsrGlLevel(short value) {
        this.inParametersInUsrGlLevel = value;
    }

    /**
     * Gets the value of the inParametersInUsrPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInUsrPassword() {
        return inParametersInUsrPassword;
    }

    /**
     * Sets the value of the inParametersInUsrPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInUsrPassword(String value) {
        this.inParametersInUsrPassword = value;
    }

    /**
     * Gets the value of the inParametersInWorkDatesProductionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInParametersInWorkDatesProductionDate() {
        return inParametersInWorkDatesProductionDate;
    }

    /**
     * Sets the value of the inParametersInWorkDatesProductionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInParametersInWorkDatesProductionDate(XMLGregorianCalendar value) {
        this.inParametersInWorkDatesProductionDate = value;
    }

    /**
     * Gets the value of the inPrftTransactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPrftTransactionDescription() {
        return inPrftTransactionDescription;
    }

    /**
     * Sets the value of the inPrftTransactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPrftTransactionDescription(String value) {
        this.inPrftTransactionDescription = value;
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
     * Gets the value of the inSsSecurityCmcbPrftSystem property.
     * 
     */
    public short getInSsSecurityCmcbPrftSystem() {
        return inSsSecurityCmcbPrftSystem;
    }

    /**
     * Sets the value of the inSsSecurityCmcbPrftSystem property.
     * 
     */
    public void setInSsSecurityCmcbPrftSystem(short value) {
        this.inSsSecurityCmcbPrftSystem = value;
    }

    /**
     * Gets the value of the inSsSecurityCmcbTranCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSsSecurityCmcbTranCode() {
        return inSsSecurityCmcbTranCode;
    }

    /**
     * Sets the value of the inSsSecurityCmcbTranCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSsSecurityCmcbTranCode(String value) {
        this.inSsSecurityCmcbTranCode = value;
    }

}
