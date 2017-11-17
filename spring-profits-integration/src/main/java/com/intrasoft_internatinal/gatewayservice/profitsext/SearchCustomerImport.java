
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SearchCustomerImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchCustomerImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InCustCriteriaCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFilterSurnameIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFilterNameIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerFatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFilterFatherNameIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustomerTelephone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFilterTelephoneIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCurExistIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustCriteriaCustCertifNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLatinIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMoreCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMoreCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAccountProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProfitsAccountFilterIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCustomerImport", propOrder = {
    "inCustCriteriaCustType",
    "inCustomerSurname",
    "inFilterSurnameIefSuppliedFlag",
    "inCustomerFirstName",
    "inFilterNameIefSuppliedFlag",
    "inCustomerFatherName",
    "inFilterFatherNameIefSuppliedFlag",
    "inCustomerDateOfBirth",
    "inCustomerTelephone1",
    "inFilterTelephoneIefSuppliedFlag",
    "inCurExistIefSuppliedFlag",
    "inCurrencyIdCurrency",
    "inCurrencyShortDescr",
    "inCountryGenericDetailShortDescription",
    "inSelGenericDetailParameterType",
    "inSelGenericDetailSerialNum",
    "inCustCriteriaCustCertifNum",
    "inLatinIefSuppliedFlag",
    "inTrxPrftTransactionIdTransact",
    "inTerminalTerminalNumber",
    "inMoreCustomerCustId",
    "inMoreCustomerSurname",
    "inAccountProfitsAccountAccountNumber",
    "inProfitsAccountFilterIefSuppliedFlag"
})
public class SearchCustomerImport
    extends BaseImport
{

    @XmlElement(name = "InCustCriteriaCustType")
    protected String inCustCriteriaCustType;
    @XmlElement(name = "InCustomerSurname")
    protected String inCustomerSurname;
    @XmlElement(name = "InFilterSurnameIefSuppliedFlag")
    protected String inFilterSurnameIefSuppliedFlag;
    @XmlElement(name = "InCustomerFirstName")
    protected String inCustomerFirstName;
    @XmlElement(name = "InFilterNameIefSuppliedFlag")
    protected String inFilterNameIefSuppliedFlag;
    @XmlElement(name = "InCustomerFatherName")
    protected String inCustomerFatherName;
    @XmlElement(name = "InFilterFatherNameIefSuppliedFlag")
    protected String inFilterFatherNameIefSuppliedFlag;
    @XmlElement(name = "InCustomerDateOfBirth", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustomerDateOfBirth;
    @XmlElement(name = "InCustomerTelephone1")
    protected String inCustomerTelephone1;
    @XmlElement(name = "InFilterTelephoneIefSuppliedFlag")
    protected String inFilterTelephoneIefSuppliedFlag;
    @XmlElement(name = "InCurExistIefSuppliedFlag")
    protected String inCurExistIefSuppliedFlag;
    @XmlElement(name = "InCurrencyIdCurrency")
    protected int inCurrencyIdCurrency;
    @XmlElement(name = "InCurrencyShortDescr")
    protected String inCurrencyShortDescr;
    @XmlElement(name = "InCountryGenericDetailShortDescription")
    protected String inCountryGenericDetailShortDescription;
    @XmlElement(name = "InSelGenericDetailParameterType")
    protected String inSelGenericDetailParameterType;
    @XmlElement(name = "InSelGenericDetailSerialNum")
    protected int inSelGenericDetailSerialNum;
    @XmlElement(name = "InCustCriteriaCustCertifNum")
    protected String inCustCriteriaCustCertifNum;
    @XmlElement(name = "InLatinIefSuppliedFlag")
    protected String inLatinIefSuppliedFlag;
    @XmlElement(name = "InTrxPrftTransactionIdTransact")
    protected int inTrxPrftTransactionIdTransact;
    @XmlElement(name = "InTerminalTerminalNumber")
    protected String inTerminalTerminalNumber;
    @XmlElement(name = "InMoreCustomerCustId", required = true, type = Integer.class, nillable = true)
    protected Integer inMoreCustomerCustId;
    @XmlElement(name = "InMoreCustomerSurname")
    protected String inMoreCustomerSurname;
    @XmlElement(name = "InAccountProfitsAccountAccountNumber")
    protected String inAccountProfitsAccountAccountNumber;
    @XmlElement(name = "InProfitsAccountFilterIefSuppliedFlag")
    protected String inProfitsAccountFilterIefSuppliedFlag;

    /**
     * Gets the value of the inCustCriteriaCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustCriteriaCustType() {
        return inCustCriteriaCustType;
    }

    /**
     * Sets the value of the inCustCriteriaCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustCriteriaCustType(String value) {
        this.inCustCriteriaCustType = value;
    }

    /**
     * Gets the value of the inCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerSurname() {
        return inCustomerSurname;
    }

    /**
     * Sets the value of the inCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerSurname(String value) {
        this.inCustomerSurname = value;
    }

    /**
     * Gets the value of the inFilterSurnameIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFilterSurnameIefSuppliedFlag() {
        return inFilterSurnameIefSuppliedFlag;
    }

    /**
     * Sets the value of the inFilterSurnameIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFilterSurnameIefSuppliedFlag(String value) {
        this.inFilterSurnameIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inCustomerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerFirstName() {
        return inCustomerFirstName;
    }

    /**
     * Sets the value of the inCustomerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerFirstName(String value) {
        this.inCustomerFirstName = value;
    }

    /**
     * Gets the value of the inFilterNameIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFilterNameIefSuppliedFlag() {
        return inFilterNameIefSuppliedFlag;
    }

    /**
     * Sets the value of the inFilterNameIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFilterNameIefSuppliedFlag(String value) {
        this.inFilterNameIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inCustomerFatherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerFatherName() {
        return inCustomerFatherName;
    }

    /**
     * Sets the value of the inCustomerFatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerFatherName(String value) {
        this.inCustomerFatherName = value;
    }

    /**
     * Gets the value of the inFilterFatherNameIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFilterFatherNameIefSuppliedFlag() {
        return inFilterFatherNameIefSuppliedFlag;
    }

    /**
     * Sets the value of the inFilterFatherNameIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFilterFatherNameIefSuppliedFlag(String value) {
        this.inFilterFatherNameIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inCustomerDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCustomerDateOfBirth() {
        return inCustomerDateOfBirth;
    }

    /**
     * Sets the value of the inCustomerDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCustomerDateOfBirth(XMLGregorianCalendar value) {
        this.inCustomerDateOfBirth = value;
    }

    /**
     * Gets the value of the inCustomerTelephone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerTelephone1() {
        return inCustomerTelephone1;
    }

    /**
     * Sets the value of the inCustomerTelephone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerTelephone1(String value) {
        this.inCustomerTelephone1 = value;
    }

    /**
     * Gets the value of the inFilterTelephoneIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFilterTelephoneIefSuppliedFlag() {
        return inFilterTelephoneIefSuppliedFlag;
    }

    /**
     * Sets the value of the inFilterTelephoneIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFilterTelephoneIefSuppliedFlag(String value) {
        this.inFilterTelephoneIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inCurExistIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCurExistIefSuppliedFlag() {
        return inCurExistIefSuppliedFlag;
    }

    /**
     * Sets the value of the inCurExistIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCurExistIefSuppliedFlag(String value) {
        this.inCurExistIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inCurrencyIdCurrency property.
     * 
     */
    public int getInCurrencyIdCurrency() {
        return inCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inCurrencyIdCurrency property.
     * 
     */
    public void setInCurrencyIdCurrency(int value) {
        this.inCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCurrencyShortDescr() {
        return inCurrencyShortDescr;
    }

    /**
     * Sets the value of the inCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCurrencyShortDescr(String value) {
        this.inCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inCountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCountryGenericDetailShortDescription() {
        return inCountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inCountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCountryGenericDetailShortDescription(String value) {
        this.inCountryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inSelGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelGenericDetailParameterType() {
        return inSelGenericDetailParameterType;
    }

    /**
     * Sets the value of the inSelGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelGenericDetailParameterType(String value) {
        this.inSelGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inSelGenericDetailSerialNum property.
     * 
     */
    public int getInSelGenericDetailSerialNum() {
        return inSelGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inSelGenericDetailSerialNum property.
     * 
     */
    public void setInSelGenericDetailSerialNum(int value) {
        this.inSelGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inCustCriteriaCustCertifNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustCriteriaCustCertifNum() {
        return inCustCriteriaCustCertifNum;
    }

    /**
     * Sets the value of the inCustCriteriaCustCertifNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustCriteriaCustCertifNum(String value) {
        this.inCustCriteriaCustCertifNum = value;
    }

    /**
     * Gets the value of the inLatinIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLatinIefSuppliedFlag() {
        return inLatinIefSuppliedFlag;
    }

    /**
     * Sets the value of the inLatinIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLatinIefSuppliedFlag(String value) {
        this.inLatinIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inTrxPrftTransactionIdTransact property.
     * 
     */
    public int getInTrxPrftTransactionIdTransact() {
        return inTrxPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the inTrxPrftTransactionIdTransact property.
     * 
     */
    public void setInTrxPrftTransactionIdTransact(int value) {
        this.inTrxPrftTransactionIdTransact = value;
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

    /**
     * Gets the value of the inMoreCustomerCustId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInMoreCustomerCustId() {
        return inMoreCustomerCustId;
    }

    /**
     * Sets the value of the inMoreCustomerCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInMoreCustomerCustId(Integer value) {
        this.inMoreCustomerCustId = value;
    }

    /**
     * Gets the value of the inMoreCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMoreCustomerSurname() {
        return inMoreCustomerSurname;
    }

    /**
     * Sets the value of the inMoreCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMoreCustomerSurname(String value) {
        this.inMoreCustomerSurname = value;
    }

    /**
     * Gets the value of the inAccountProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAccountProfitsAccountAccountNumber() {
        return inAccountProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inAccountProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAccountProfitsAccountAccountNumber(String value) {
        this.inAccountProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inProfitsAccountFilterIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProfitsAccountFilterIefSuppliedFlag() {
        return inProfitsAccountFilterIefSuppliedFlag;
    }

    /**
     * Sets the value of the inProfitsAccountFilterIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProfitsAccountFilterIefSuppliedFlag(String value) {
        this.inProfitsAccountFilterIefSuppliedFlag = value;
    }

}
