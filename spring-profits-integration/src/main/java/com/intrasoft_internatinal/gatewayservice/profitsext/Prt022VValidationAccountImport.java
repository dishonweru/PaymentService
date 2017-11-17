
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Prt022VValidationAccountImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Prt022VValidationAccountImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProfitsSystemProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InExistSuspCustIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrmParUnitClearingHouseFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrmTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrmTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrmUnitCategoryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrmWorkDatesProductionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSuspectCntryAlertAgency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSuspectCntryAlertReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSuspectCntryCountryId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSuspectCntryDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InSuspectCntryDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InSuspectCntryEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSuspectCustAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSuspectCustAfm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSuspectCustAlertAgency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSuspectCustAlertReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSuspectCustAlertReason2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSuspectCustCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSuspectCustCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSuspectCustCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSuspectCustCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSuspectCustDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InSuspectCustDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InSuspectCustDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InSuspectCustEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSuspectCustFatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSuspectCustFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSuspectCustIdNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSuspectCustIdType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSuspectCustPhoneNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSuspectCustSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSuspectCustSuspectCustId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InSuspectCustZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxAmountIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Prt022VValidationAccountImport", propOrder = {
    "command",
    "inProfitsAccountAccountCd",
    "inProfitsAccountAccountNumber",
    "inProfitsSystemProfitsAccountPrftSystem",
    "inExistSuspCustIefSuppliedFlag",
    "inGrmParUnitClearingHouseFlag",
    "inGrmTerminalTerminalNumber",
    "inGrmTrxCountTrxCounter",
    "inGrmUnitCategoryGenericDetailSerialNum",
    "inGrmWorkDatesProductionDate",
    "inPrftTransactionIdTransact",
    "inSuspectCntryAlertAgency",
    "inSuspectCntryAlertReason",
    "inSuspectCntryCountryId",
    "inSuspectCntryDateFrom",
    "inSuspectCntryDateTo",
    "inSuspectCntryEntryStatus",
    "inSuspectCustAddress",
    "inSuspectCustAfm",
    "inSuspectCustAlertAgency",
    "inSuspectCustAlertReason",
    "inSuspectCustAlertReason2",
    "inSuspectCustCity",
    "inSuspectCustCountry",
    "inSuspectCustCustId",
    "inSuspectCustCustType",
    "inSuspectCustDateFrom",
    "inSuspectCustDateOfBirth",
    "inSuspectCustDateTo",
    "inSuspectCustEntryStatus",
    "inSuspectCustFatherName",
    "inSuspectCustFirstName",
    "inSuspectCustIdNum",
    "inSuspectCustIdType",
    "inSuspectCustPhoneNum",
    "inSuspectCustSurname",
    "inSuspectCustSuspectCustId",
    "inSuspectCustZipCode",
    "inTrxAmountIefSuppliedAmount"
})
public class Prt022VValidationAccountImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InProfitsAccountAccountCd")
    protected short inProfitsAccountAccountCd;
    @XmlElement(name = "InProfitsAccountAccountNumber")
    protected String inProfitsAccountAccountNumber;
    @XmlElement(name = "InProfitsSystemProfitsAccountPrftSystem")
    protected short inProfitsSystemProfitsAccountPrftSystem;
    @XmlElement(name = "InExistSuspCustIefSuppliedFlag")
    protected String inExistSuspCustIefSuppliedFlag;
    @XmlElement(name = "InGrmParUnitClearingHouseFlag")
    protected String inGrmParUnitClearingHouseFlag;
    @XmlElement(name = "InGrmTerminalTerminalNumber")
    protected String inGrmTerminalTerminalNumber;
    @XmlElement(name = "InGrmTrxCountTrxCounter")
    protected int inGrmTrxCountTrxCounter;
    @XmlElement(name = "InGrmUnitCategoryGenericDetailSerialNum")
    protected int inGrmUnitCategoryGenericDetailSerialNum;
    @XmlElement(name = "InGrmWorkDatesProductionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGrmWorkDatesProductionDate;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InSuspectCntryAlertAgency")
    protected String inSuspectCntryAlertAgency;
    @XmlElement(name = "InSuspectCntryAlertReason")
    protected String inSuspectCntryAlertReason;
    @XmlElement(name = "InSuspectCntryCountryId")
    protected int inSuspectCntryCountryId;
    @XmlElement(name = "InSuspectCntryDateFrom", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inSuspectCntryDateFrom;
    @XmlElement(name = "InSuspectCntryDateTo", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inSuspectCntryDateTo;
    @XmlElement(name = "InSuspectCntryEntryStatus")
    protected String inSuspectCntryEntryStatus;
    @XmlElement(name = "InSuspectCustAddress")
    protected String inSuspectCustAddress;
    @XmlElement(name = "InSuspectCustAfm")
    protected String inSuspectCustAfm;
    @XmlElement(name = "InSuspectCustAlertAgency")
    protected String inSuspectCustAlertAgency;
    @XmlElement(name = "InSuspectCustAlertReason")
    protected String inSuspectCustAlertReason;
    @XmlElement(name = "InSuspectCustAlertReason2")
    protected String inSuspectCustAlertReason2;
    @XmlElement(name = "InSuspectCustCity")
    protected String inSuspectCustCity;
    @XmlElement(name = "InSuspectCustCountry")
    protected String inSuspectCustCountry;
    @XmlElement(name = "InSuspectCustCustId")
    protected int inSuspectCustCustId;
    @XmlElement(name = "InSuspectCustCustType")
    protected String inSuspectCustCustType;
    @XmlElement(name = "InSuspectCustDateFrom", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inSuspectCustDateFrom;
    @XmlElement(name = "InSuspectCustDateOfBirth", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inSuspectCustDateOfBirth;
    @XmlElement(name = "InSuspectCustDateTo", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inSuspectCustDateTo;
    @XmlElement(name = "InSuspectCustEntryStatus")
    protected String inSuspectCustEntryStatus;
    @XmlElement(name = "InSuspectCustFatherName")
    protected String inSuspectCustFatherName;
    @XmlElement(name = "InSuspectCustFirstName")
    protected String inSuspectCustFirstName;
    @XmlElement(name = "InSuspectCustIdNum")
    protected String inSuspectCustIdNum;
    @XmlElement(name = "InSuspectCustIdType")
    protected int inSuspectCustIdType;
    @XmlElement(name = "InSuspectCustPhoneNum")
    protected String inSuspectCustPhoneNum;
    @XmlElement(name = "InSuspectCustSurname")
    protected String inSuspectCustSurname;
    @XmlElement(name = "InSuspectCustSuspectCustId")
    protected double inSuspectCustSuspectCustId;
    @XmlElement(name = "InSuspectCustZipCode")
    protected String inSuspectCustZipCode;
    @XmlElement(name = "InTrxAmountIefSuppliedAmount", required = true)
    protected BigDecimal inTrxAmountIefSuppliedAmount;

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
     * Gets the value of the inProfitsAccountAccountCd property.
     * 
     */
    public short getInProfitsAccountAccountCd() {
        return inProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inProfitsAccountAccountCd property.
     * 
     */
    public void setInProfitsAccountAccountCd(short value) {
        this.inProfitsAccountAccountCd = value;
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
     * Gets the value of the inProfitsSystemProfitsAccountPrftSystem property.
     * 
     */
    public short getInProfitsSystemProfitsAccountPrftSystem() {
        return inProfitsSystemProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inProfitsSystemProfitsAccountPrftSystem property.
     * 
     */
    public void setInProfitsSystemProfitsAccountPrftSystem(short value) {
        this.inProfitsSystemProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inExistSuspCustIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInExistSuspCustIefSuppliedFlag() {
        return inExistSuspCustIefSuppliedFlag;
    }

    /**
     * Sets the value of the inExistSuspCustIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInExistSuspCustIefSuppliedFlag(String value) {
        this.inExistSuspCustIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inGrmParUnitClearingHouseFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrmParUnitClearingHouseFlag() {
        return inGrmParUnitClearingHouseFlag;
    }

    /**
     * Sets the value of the inGrmParUnitClearingHouseFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrmParUnitClearingHouseFlag(String value) {
        this.inGrmParUnitClearingHouseFlag = value;
    }

    /**
     * Gets the value of the inGrmTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrmTerminalTerminalNumber() {
        return inGrmTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inGrmTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrmTerminalTerminalNumber(String value) {
        this.inGrmTerminalTerminalNumber = value;
    }

    /**
     * Gets the value of the inGrmTrxCountTrxCounter property.
     * 
     */
    public int getInGrmTrxCountTrxCounter() {
        return inGrmTrxCountTrxCounter;
    }

    /**
     * Sets the value of the inGrmTrxCountTrxCounter property.
     * 
     */
    public void setInGrmTrxCountTrxCounter(int value) {
        this.inGrmTrxCountTrxCounter = value;
    }

    /**
     * Gets the value of the inGrmUnitCategoryGenericDetailSerialNum property.
     * 
     */
    public int getInGrmUnitCategoryGenericDetailSerialNum() {
        return inGrmUnitCategoryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inGrmUnitCategoryGenericDetailSerialNum property.
     * 
     */
    public void setInGrmUnitCategoryGenericDetailSerialNum(int value) {
        this.inGrmUnitCategoryGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inGrmWorkDatesProductionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGrmWorkDatesProductionDate() {
        return inGrmWorkDatesProductionDate;
    }

    /**
     * Sets the value of the inGrmWorkDatesProductionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGrmWorkDatesProductionDate(XMLGregorianCalendar value) {
        this.inGrmWorkDatesProductionDate = value;
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
     * Gets the value of the inSuspectCntryAlertAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSuspectCntryAlertAgency() {
        return inSuspectCntryAlertAgency;
    }

    /**
     * Sets the value of the inSuspectCntryAlertAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSuspectCntryAlertAgency(String value) {
        this.inSuspectCntryAlertAgency = value;
    }

    /**
     * Gets the value of the inSuspectCntryAlertReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSuspectCntryAlertReason() {
        return inSuspectCntryAlertReason;
    }

    /**
     * Sets the value of the inSuspectCntryAlertReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSuspectCntryAlertReason(String value) {
        this.inSuspectCntryAlertReason = value;
    }

    /**
     * Gets the value of the inSuspectCntryCountryId property.
     * 
     */
    public int getInSuspectCntryCountryId() {
        return inSuspectCntryCountryId;
    }

    /**
     * Sets the value of the inSuspectCntryCountryId property.
     * 
     */
    public void setInSuspectCntryCountryId(int value) {
        this.inSuspectCntryCountryId = value;
    }

    /**
     * Gets the value of the inSuspectCntryDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInSuspectCntryDateFrom() {
        return inSuspectCntryDateFrom;
    }

    /**
     * Sets the value of the inSuspectCntryDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInSuspectCntryDateFrom(XMLGregorianCalendar value) {
        this.inSuspectCntryDateFrom = value;
    }

    /**
     * Gets the value of the inSuspectCntryDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInSuspectCntryDateTo() {
        return inSuspectCntryDateTo;
    }

    /**
     * Sets the value of the inSuspectCntryDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInSuspectCntryDateTo(XMLGregorianCalendar value) {
        this.inSuspectCntryDateTo = value;
    }

    /**
     * Gets the value of the inSuspectCntryEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSuspectCntryEntryStatus() {
        return inSuspectCntryEntryStatus;
    }

    /**
     * Sets the value of the inSuspectCntryEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSuspectCntryEntryStatus(String value) {
        this.inSuspectCntryEntryStatus = value;
    }

    /**
     * Gets the value of the inSuspectCustAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSuspectCustAddress() {
        return inSuspectCustAddress;
    }

    /**
     * Sets the value of the inSuspectCustAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSuspectCustAddress(String value) {
        this.inSuspectCustAddress = value;
    }

    /**
     * Gets the value of the inSuspectCustAfm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSuspectCustAfm() {
        return inSuspectCustAfm;
    }

    /**
     * Sets the value of the inSuspectCustAfm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSuspectCustAfm(String value) {
        this.inSuspectCustAfm = value;
    }

    /**
     * Gets the value of the inSuspectCustAlertAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSuspectCustAlertAgency() {
        return inSuspectCustAlertAgency;
    }

    /**
     * Sets the value of the inSuspectCustAlertAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSuspectCustAlertAgency(String value) {
        this.inSuspectCustAlertAgency = value;
    }

    /**
     * Gets the value of the inSuspectCustAlertReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSuspectCustAlertReason() {
        return inSuspectCustAlertReason;
    }

    /**
     * Sets the value of the inSuspectCustAlertReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSuspectCustAlertReason(String value) {
        this.inSuspectCustAlertReason = value;
    }

    /**
     * Gets the value of the inSuspectCustAlertReason2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSuspectCustAlertReason2() {
        return inSuspectCustAlertReason2;
    }

    /**
     * Sets the value of the inSuspectCustAlertReason2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSuspectCustAlertReason2(String value) {
        this.inSuspectCustAlertReason2 = value;
    }

    /**
     * Gets the value of the inSuspectCustCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSuspectCustCity() {
        return inSuspectCustCity;
    }

    /**
     * Sets the value of the inSuspectCustCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSuspectCustCity(String value) {
        this.inSuspectCustCity = value;
    }

    /**
     * Gets the value of the inSuspectCustCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSuspectCustCountry() {
        return inSuspectCustCountry;
    }

    /**
     * Sets the value of the inSuspectCustCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSuspectCustCountry(String value) {
        this.inSuspectCustCountry = value;
    }

    /**
     * Gets the value of the inSuspectCustCustId property.
     * 
     */
    public int getInSuspectCustCustId() {
        return inSuspectCustCustId;
    }

    /**
     * Sets the value of the inSuspectCustCustId property.
     * 
     */
    public void setInSuspectCustCustId(int value) {
        this.inSuspectCustCustId = value;
    }

    /**
     * Gets the value of the inSuspectCustCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSuspectCustCustType() {
        return inSuspectCustCustType;
    }

    /**
     * Sets the value of the inSuspectCustCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSuspectCustCustType(String value) {
        this.inSuspectCustCustType = value;
    }

    /**
     * Gets the value of the inSuspectCustDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInSuspectCustDateFrom() {
        return inSuspectCustDateFrom;
    }

    /**
     * Sets the value of the inSuspectCustDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInSuspectCustDateFrom(XMLGregorianCalendar value) {
        this.inSuspectCustDateFrom = value;
    }

    /**
     * Gets the value of the inSuspectCustDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInSuspectCustDateOfBirth() {
        return inSuspectCustDateOfBirth;
    }

    /**
     * Sets the value of the inSuspectCustDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInSuspectCustDateOfBirth(XMLGregorianCalendar value) {
        this.inSuspectCustDateOfBirth = value;
    }

    /**
     * Gets the value of the inSuspectCustDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInSuspectCustDateTo() {
        return inSuspectCustDateTo;
    }

    /**
     * Sets the value of the inSuspectCustDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInSuspectCustDateTo(XMLGregorianCalendar value) {
        this.inSuspectCustDateTo = value;
    }

    /**
     * Gets the value of the inSuspectCustEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSuspectCustEntryStatus() {
        return inSuspectCustEntryStatus;
    }

    /**
     * Sets the value of the inSuspectCustEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSuspectCustEntryStatus(String value) {
        this.inSuspectCustEntryStatus = value;
    }

    /**
     * Gets the value of the inSuspectCustFatherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSuspectCustFatherName() {
        return inSuspectCustFatherName;
    }

    /**
     * Sets the value of the inSuspectCustFatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSuspectCustFatherName(String value) {
        this.inSuspectCustFatherName = value;
    }

    /**
     * Gets the value of the inSuspectCustFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSuspectCustFirstName() {
        return inSuspectCustFirstName;
    }

    /**
     * Sets the value of the inSuspectCustFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSuspectCustFirstName(String value) {
        this.inSuspectCustFirstName = value;
    }

    /**
     * Gets the value of the inSuspectCustIdNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSuspectCustIdNum() {
        return inSuspectCustIdNum;
    }

    /**
     * Sets the value of the inSuspectCustIdNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSuspectCustIdNum(String value) {
        this.inSuspectCustIdNum = value;
    }

    /**
     * Gets the value of the inSuspectCustIdType property.
     * 
     */
    public int getInSuspectCustIdType() {
        return inSuspectCustIdType;
    }

    /**
     * Sets the value of the inSuspectCustIdType property.
     * 
     */
    public void setInSuspectCustIdType(int value) {
        this.inSuspectCustIdType = value;
    }

    /**
     * Gets the value of the inSuspectCustPhoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSuspectCustPhoneNum() {
        return inSuspectCustPhoneNum;
    }

    /**
     * Sets the value of the inSuspectCustPhoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSuspectCustPhoneNum(String value) {
        this.inSuspectCustPhoneNum = value;
    }

    /**
     * Gets the value of the inSuspectCustSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSuspectCustSurname() {
        return inSuspectCustSurname;
    }

    /**
     * Sets the value of the inSuspectCustSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSuspectCustSurname(String value) {
        this.inSuspectCustSurname = value;
    }

    /**
     * Gets the value of the inSuspectCustSuspectCustId property.
     * 
     */
    public double getInSuspectCustSuspectCustId() {
        return inSuspectCustSuspectCustId;
    }

    /**
     * Sets the value of the inSuspectCustSuspectCustId property.
     * 
     */
    public void setInSuspectCustSuspectCustId(double value) {
        this.inSuspectCustSuspectCustId = value;
    }

    /**
     * Gets the value of the inSuspectCustZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSuspectCustZipCode() {
        return inSuspectCustZipCode;
    }

    /**
     * Sets the value of the inSuspectCustZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSuspectCustZipCode(String value) {
        this.inSuspectCustZipCode = value;
    }

    /**
     * Gets the value of the inTrxAmountIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTrxAmountIefSuppliedAmount() {
        return inTrxAmountIefSuppliedAmount;
    }

    /**
     * Sets the value of the inTrxAmountIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTrxAmountIefSuppliedAmount(BigDecimal value) {
        this.inTrxAmountIefSuppliedAmount = value;
    }

}
