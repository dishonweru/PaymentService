
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CMS3603VCustomerCardApplicationsListImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CMS3603VCustomerCardApplicationsListImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthResultTeamInformationAuthorizationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthResultTeamInformationSuper1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthResultTeamInformationSuper2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthorGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCriteriaCmsCardProductionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCriteriaCmsCardApplApplicationSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InCriteriaCmsCardApplCardReissueFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCriteriaCmsCardApplEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCriteriaCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCriteriaCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCriteriaDateFromIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCriteriaDateToIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCriteriaFromUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCriteriaFromUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCriteriaToUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCriteriaToUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLastCmsCardApplApplicationSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CMS3603VCustomerCardApplicationsListImport", propOrder = {
    "command",
    "inAuthResultTeamInformationAuthorizationResult",
    "inAuthResultTeamInformationSuper1Code",
    "inAuthResultTeamInformationSuper2Code",
    "inAuthorGrantedIefSuppliedFlag",
    "inCommandIefSuppliedCommand",
    "inCriteriaCmsCardProductionStatus",
    "inCriteriaCmsCardApplApplicationSn",
    "inCriteriaCmsCardApplCardReissueFlg",
    "inCriteriaCmsCardApplEntryStatus",
    "inCriteriaCustomerCDigit",
    "inCriteriaCustomerCustId",
    "inCriteriaDateFromIefSuppliedDate",
    "inCriteriaDateToIefSuppliedDate",
    "inCriteriaFromUnitCode",
    "inCriteriaFromUsrCode",
    "inCriteriaToUnitCode",
    "inCriteriaToUsrCode",
    "inLastCmsCardApplApplicationSn",
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
    "inSsSecurityCmcbTranCode"
})
public class CMS3603VCustomerCardApplicationsListImport
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
    @XmlElement(name = "InCriteriaCmsCardProductionStatus")
    protected String inCriteriaCmsCardProductionStatus;
    @XmlElement(name = "InCriteriaCmsCardApplApplicationSn")
    protected double inCriteriaCmsCardApplApplicationSn;
    @XmlElement(name = "InCriteriaCmsCardApplCardReissueFlg")
    protected String inCriteriaCmsCardApplCardReissueFlg;
    @XmlElement(name = "InCriteriaCmsCardApplEntryStatus")
    protected String inCriteriaCmsCardApplEntryStatus;
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
    @XmlElement(name = "InCriteriaFromUnitCode")
    protected int inCriteriaFromUnitCode;
    @XmlElement(name = "InCriteriaFromUsrCode")
    protected String inCriteriaFromUsrCode;
    @XmlElement(name = "InCriteriaToUnitCode")
    protected int inCriteriaToUnitCode;
    @XmlElement(name = "InCriteriaToUsrCode")
    protected String inCriteriaToUsrCode;
    @XmlElement(name = "InLastCmsCardApplApplicationSn")
    protected double inLastCmsCardApplApplicationSn;
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
     * Gets the value of the inCriteriaCmsCardProductionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCriteriaCmsCardProductionStatus() {
        return inCriteriaCmsCardProductionStatus;
    }

    /**
     * Sets the value of the inCriteriaCmsCardProductionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCriteriaCmsCardProductionStatus(String value) {
        this.inCriteriaCmsCardProductionStatus = value;
    }

    /**
     * Gets the value of the inCriteriaCmsCardApplApplicationSn property.
     * 
     */
    public double getInCriteriaCmsCardApplApplicationSn() {
        return inCriteriaCmsCardApplApplicationSn;
    }

    /**
     * Sets the value of the inCriteriaCmsCardApplApplicationSn property.
     * 
     */
    public void setInCriteriaCmsCardApplApplicationSn(double value) {
        this.inCriteriaCmsCardApplApplicationSn = value;
    }

    /**
     * Gets the value of the inCriteriaCmsCardApplCardReissueFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCriteriaCmsCardApplCardReissueFlg() {
        return inCriteriaCmsCardApplCardReissueFlg;
    }

    /**
     * Sets the value of the inCriteriaCmsCardApplCardReissueFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCriteriaCmsCardApplCardReissueFlg(String value) {
        this.inCriteriaCmsCardApplCardReissueFlg = value;
    }

    /**
     * Gets the value of the inCriteriaCmsCardApplEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCriteriaCmsCardApplEntryStatus() {
        return inCriteriaCmsCardApplEntryStatus;
    }

    /**
     * Sets the value of the inCriteriaCmsCardApplEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCriteriaCmsCardApplEntryStatus(String value) {
        this.inCriteriaCmsCardApplEntryStatus = value;
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
     * Gets the value of the inCriteriaFromUnitCode property.
     * 
     */
    public int getInCriteriaFromUnitCode() {
        return inCriteriaFromUnitCode;
    }

    /**
     * Sets the value of the inCriteriaFromUnitCode property.
     * 
     */
    public void setInCriteriaFromUnitCode(int value) {
        this.inCriteriaFromUnitCode = value;
    }

    /**
     * Gets the value of the inCriteriaFromUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCriteriaFromUsrCode() {
        return inCriteriaFromUsrCode;
    }

    /**
     * Sets the value of the inCriteriaFromUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCriteriaFromUsrCode(String value) {
        this.inCriteriaFromUsrCode = value;
    }

    /**
     * Gets the value of the inCriteriaToUnitCode property.
     * 
     */
    public int getInCriteriaToUnitCode() {
        return inCriteriaToUnitCode;
    }

    /**
     * Sets the value of the inCriteriaToUnitCode property.
     * 
     */
    public void setInCriteriaToUnitCode(int value) {
        this.inCriteriaToUnitCode = value;
    }

    /**
     * Gets the value of the inCriteriaToUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCriteriaToUsrCode() {
        return inCriteriaToUsrCode;
    }

    /**
     * Sets the value of the inCriteriaToUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCriteriaToUsrCode(String value) {
        this.inCriteriaToUsrCode = value;
    }

    /**
     * Gets the value of the inLastCmsCardApplApplicationSn property.
     * 
     */
    public double getInLastCmsCardApplApplicationSn() {
        return inLastCmsCardApplApplicationSn;
    }

    /**
     * Sets the value of the inLastCmsCardApplApplicationSn property.
     * 
     */
    public void setInLastCmsCardApplApplicationSn(double value) {
        this.inLastCmsCardApplApplicationSn = value;
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

}
