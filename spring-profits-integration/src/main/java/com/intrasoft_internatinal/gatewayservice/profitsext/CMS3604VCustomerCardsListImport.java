
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CMS3604VCustomerCardsListImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CMS3604VCustomerCardsListImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthResultTeamInformationAuthorizationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthResultTeamInformationSuper1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthResultTeamInformationSuper2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthorGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCriteriaAfmOtherAfmAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCriteriaCmsCardCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCriteriaCmsCardEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCriteriaCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCriteriaCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCriteriaDateFromIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCriteriaDateToIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCriteriaProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCriteriaProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCriteriaProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLastCmsCardCardSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InParametersInBankParametersEuroEchoDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInBankParametersIbanFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInBankParametersMaxAmntRateTbl" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InParametersInBankParametersRateUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InParametersInUnitClearingHouseFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInUnitCategoryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSsSecurityCmcbPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSsSecurityCmcbTranCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCriteriaCmsCardPrintRefCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCriteriaCmsCardCardReissueFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCrdtypGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfCMS3604VInCrdtypGrpItem" minOccurs="0"/>
 *         &lt;element name="InCmsCardApplApplicationSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CMS3604VCustomerCardsListImport", propOrder = {
    "command",
    "inAuthResultTeamInformationAuthorizationResult",
    "inAuthResultTeamInformationSuper1Code",
    "inAuthResultTeamInformationSuper2Code",
    "inAuthorGrantedIefSuppliedFlag",
    "inCommandIefSuppliedCommand",
    "inCriteriaAfmOtherAfmAfmNo",
    "inCriteriaCmsCardCardNumber",
    "inCriteriaCmsCardEntryStatus",
    "inCriteriaCustomerCDigit",
    "inCriteriaCustomerCustId",
    "inCriteriaDateFromIefSuppliedDate",
    "inCriteriaDateToIefSuppliedDate",
    "inCriteriaProfitsAccountAccountCd",
    "inCriteriaProfitsAccountAccountNumber",
    "inCriteriaProfitsAccountPrftSystem",
    "inLastCmsCardCardSn",
    "inParametersInBankParametersEuroEchoDesc",
    "inParametersInBankParametersIbanFlag",
    "inParametersInBankParametersMaxAmntRateTbl",
    "inParametersInBankParametersRateUsage",
    "inParametersInTerminalTerminalNumber",
    "inParametersInTrxCountTrxCounter",
    "inParametersInUnitClearingHouseFlag",
    "inParametersInUnitCategoryGenericDetailSerialNum",
    "inPrftTransactionDescription",
    "inPrftTransactionIdTransact",
    "inSsSecurityCmcbPrftSystem",
    "inSsSecurityCmcbTranCode",
    "inCriteriaCmsCardPrintRefCode",
    "inCriteriaCmsCardCardReissueFlg",
    "inCrdtypGrp",
    "inCmsCardApplApplicationSn"
})
public class CMS3604VCustomerCardsListImport
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
    @XmlElement(name = "InCriteriaAfmOtherAfmAfmNo")
    protected String inCriteriaAfmOtherAfmAfmNo;
    @XmlElement(name = "InCriteriaCmsCardCardNumber")
    protected String inCriteriaCmsCardCardNumber;
    @XmlElement(name = "InCriteriaCmsCardEntryStatus")
    protected String inCriteriaCmsCardEntryStatus;
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
    @XmlElement(name = "InCriteriaProfitsAccountAccountCd")
    protected short inCriteriaProfitsAccountAccountCd;
    @XmlElement(name = "InCriteriaProfitsAccountAccountNumber")
    protected String inCriteriaProfitsAccountAccountNumber;
    @XmlElement(name = "InCriteriaProfitsAccountPrftSystem")
    protected short inCriteriaProfitsAccountPrftSystem;
    @XmlElement(name = "InLastCmsCardCardSn")
    protected double inLastCmsCardCardSn;
    @XmlElement(name = "InParametersInBankParametersEuroEchoDesc")
    protected String inParametersInBankParametersEuroEchoDesc;
    @XmlElement(name = "InParametersInBankParametersIbanFlag")
    protected String inParametersInBankParametersIbanFlag;
    @XmlElement(name = "InParametersInBankParametersMaxAmntRateTbl", required = true)
    protected BigDecimal inParametersInBankParametersMaxAmntRateTbl;
    @XmlElement(name = "InParametersInBankParametersRateUsage")
    protected String inParametersInBankParametersRateUsage;
    @XmlElement(name = "InParametersInTerminalTerminalNumber")
    protected String inParametersInTerminalTerminalNumber;
    @XmlElement(name = "InParametersInTrxCountTrxCounter")
    protected int inParametersInTrxCountTrxCounter;
    @XmlElement(name = "InParametersInUnitClearingHouseFlag")
    protected String inParametersInUnitClearingHouseFlag;
    @XmlElement(name = "InParametersInUnitCategoryGenericDetailSerialNum")
    protected int inParametersInUnitCategoryGenericDetailSerialNum;
    @XmlElement(name = "InPrftTransactionDescription")
    protected String inPrftTransactionDescription;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InSsSecurityCmcbPrftSystem")
    protected short inSsSecurityCmcbPrftSystem;
    @XmlElement(name = "InSsSecurityCmcbTranCode")
    protected String inSsSecurityCmcbTranCode;
    @XmlElement(name = "InCriteriaCmsCardPrintRefCode")
    protected String inCriteriaCmsCardPrintRefCode;
    @XmlElement(name = "InCriteriaCmsCardCardReissueFlg")
    protected String inCriteriaCmsCardCardReissueFlg;
    @XmlElement(name = "InCrdtypGrp")
    protected ArrayOfCMS3604VInCrdtypGrpItem inCrdtypGrp;
    @XmlElement(name = "InCmsCardApplApplicationSn")
    protected double inCmsCardApplApplicationSn;

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
     * Gets the value of the inCriteriaAfmOtherAfmAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCriteriaAfmOtherAfmAfmNo() {
        return inCriteriaAfmOtherAfmAfmNo;
    }

    /**
     * Sets the value of the inCriteriaAfmOtherAfmAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCriteriaAfmOtherAfmAfmNo(String value) {
        this.inCriteriaAfmOtherAfmAfmNo = value;
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
     * Gets the value of the inCriteriaCmsCardEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCriteriaCmsCardEntryStatus() {
        return inCriteriaCmsCardEntryStatus;
    }

    /**
     * Sets the value of the inCriteriaCmsCardEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCriteriaCmsCardEntryStatus(String value) {
        this.inCriteriaCmsCardEntryStatus = value;
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
     * Gets the value of the inCriteriaProfitsAccountAccountCd property.
     * 
     */
    public short getInCriteriaProfitsAccountAccountCd() {
        return inCriteriaProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inCriteriaProfitsAccountAccountCd property.
     * 
     */
    public void setInCriteriaProfitsAccountAccountCd(short value) {
        this.inCriteriaProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inCriteriaProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCriteriaProfitsAccountAccountNumber() {
        return inCriteriaProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inCriteriaProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCriteriaProfitsAccountAccountNumber(String value) {
        this.inCriteriaProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inCriteriaProfitsAccountPrftSystem property.
     * 
     */
    public short getInCriteriaProfitsAccountPrftSystem() {
        return inCriteriaProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inCriteriaProfitsAccountPrftSystem property.
     * 
     */
    public void setInCriteriaProfitsAccountPrftSystem(short value) {
        this.inCriteriaProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inLastCmsCardCardSn property.
     * 
     */
    public double getInLastCmsCardCardSn() {
        return inLastCmsCardCardSn;
    }

    /**
     * Sets the value of the inLastCmsCardCardSn property.
     * 
     */
    public void setInLastCmsCardCardSn(double value) {
        this.inLastCmsCardCardSn = value;
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

    /**
     * Gets the value of the inCriteriaCmsCardPrintRefCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCriteriaCmsCardPrintRefCode() {
        return inCriteriaCmsCardPrintRefCode;
    }

    /**
     * Sets the value of the inCriteriaCmsCardPrintRefCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCriteriaCmsCardPrintRefCode(String value) {
        this.inCriteriaCmsCardPrintRefCode = value;
    }

    /**
     * Gets the value of the inCriteriaCmsCardCardReissueFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCriteriaCmsCardCardReissueFlg() {
        return inCriteriaCmsCardCardReissueFlg;
    }

    /**
     * Sets the value of the inCriteriaCmsCardCardReissueFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCriteriaCmsCardCardReissueFlg(String value) {
        this.inCriteriaCmsCardCardReissueFlg = value;
    }

    /**
     * Gets the value of the inCrdtypGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCMS3604VInCrdtypGrpItem }
     *     
     */
    public ArrayOfCMS3604VInCrdtypGrpItem getInCrdtypGrp() {
        return inCrdtypGrp;
    }

    /**
     * Sets the value of the inCrdtypGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCMS3604VInCrdtypGrpItem }
     *     
     */
    public void setInCrdtypGrp(ArrayOfCMS3604VInCrdtypGrpItem value) {
        this.inCrdtypGrp = value;
    }

    /**
     * Gets the value of the inCmsCardApplApplicationSn property.
     * 
     */
    public double getInCmsCardApplApplicationSn() {
        return inCmsCardApplApplicationSn;
    }

    /**
     * Sets the value of the inCmsCardApplApplicationSn property.
     * 
     */
    public void setInCmsCardApplApplicationSn(double value) {
        this.inCmsCardApplApplicationSn = value;
    }

}
