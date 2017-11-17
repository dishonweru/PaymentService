
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpInGrmAccountCollateralAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGrpInGrmAccountCollateralAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpInGrmAccountCollateralAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpInGrmAccountCollateralBankCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGrpInGrmAccountCollateralCbInsuranceAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpInGrmAccountCollateralDepAccInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpInGrmAccountCollateralEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpInGrmAccountCollateralEstInsuranceAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpInGrmAccountCollateralEstValueAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpInGrmAccountCollateralExpiryDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGrpInGrmAccountCollateralFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpInGrmAccountCollateralInsertionDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGrpInGrmAccountCollateralInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGrpInGrmAccountCollateralIssuerAccount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InGrpInGrmAccountCollateralItemsCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpInGrmAccountCollateralNoteStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpInGrmAccountCollateralPrftAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpInGrmAccountCollateralProfitsSystem" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpInGrmAccountCollateralReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpInGrmAccountCollateralRevalCurrFixRat" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpInGrmAccountCollateralRevalInitFixRat" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpInGrmAccountCollateralRevalInitSv" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpInGrmAccountCollateralRevaluationCurrid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpInGrmAccountCollateralSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpInGrmAccountCollateralTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGrpInGrmAccountCollateralUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpInGrmAccountCollateralUserCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpInGrmAccountCollateralYieldLimitAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpInGrmAccountCollateralYieldPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpInGrmAccountCollateralYieldUtilisedAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpInGrmCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpInGrmPrftAccountProfitsAccountAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpInGrmRevalidCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpInGrmSelIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpInGrmStsCharSuppliedChar15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpInGrmAccountCollateralMortgageAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpInGrmAccountCollateralMortgageClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpInGrmAccountCollateralMortgageDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InGrp", propOrder = {
    "inGrpInGrmAccountCollateralAccountCd",
    "inGrpInGrmAccountCollateralAddress",
    "inGrpInGrmAccountCollateralAfmNo",
    "inGrpInGrmAccountCollateralBankCode",
    "inGrpInGrmAccountCollateralCbInsuranceAmn",
    "inGrpInGrmAccountCollateralDepAccInd",
    "inGrpInGrmAccountCollateralEntryStatus",
    "inGrpInGrmAccountCollateralEstInsuranceAmn",
    "inGrpInGrmAccountCollateralEstValueAmn",
    "inGrpInGrmAccountCollateralExpiryDt",
    "inGrpInGrmAccountCollateralFirstName",
    "inGrpInGrmAccountCollateralInsertionDt",
    "inGrpInGrmAccountCollateralInternalSn",
    "inGrpInGrmAccountCollateralIssuerAccount",
    "inGrpInGrmAccountCollateralItemsCnt",
    "inGrpInGrmAccountCollateralNoteStatus",
    "inGrpInGrmAccountCollateralPrftAccount",
    "inGrpInGrmAccountCollateralProfitsSystem",
    "inGrpInGrmAccountCollateralReferenceNumber",
    "inGrpInGrmAccountCollateralRevalCurrFixRat",
    "inGrpInGrmAccountCollateralRevalInitFixRat",
    "inGrpInGrmAccountCollateralRevalInitSv",
    "inGrpInGrmAccountCollateralRevaluationCurrid",
    "inGrpInGrmAccountCollateralSurname",
    "inGrpInGrmAccountCollateralTmstamp",
    "inGrpInGrmAccountCollateralUnitCode",
    "inGrpInGrmAccountCollateralUserCode",
    "inGrpInGrmAccountCollateralYieldLimitAmn",
    "inGrpInGrmAccountCollateralYieldPerc",
    "inGrpInGrmAccountCollateralYieldUtilisedAmn",
    "inGrpInGrmCustomerCustId",
    "inGrpInGrmPrftAccountProfitsAccountAccStatus",
    "inGrpInGrmRevalidCurrencyShortDescr",
    "inGrpInGrmSelIefSuppliedSelectChar",
    "inGrpInGrmStsCharSuppliedChar15",
    "inGrpInGrmAccountCollateralMortgageAmn",
    "inGrpInGrmAccountCollateralMortgageClass",
    "inGrpInGrmAccountCollateralMortgageDate"
})
public class InGrp {

    @XmlElement(name = "InGrpInGrmAccountCollateralAccountCd")
    protected short inGrpInGrmAccountCollateralAccountCd;
    @XmlElement(name = "InGrpInGrmAccountCollateralAddress")
    protected String inGrpInGrmAccountCollateralAddress;
    @XmlElement(name = "InGrpInGrmAccountCollateralAfmNo")
    protected String inGrpInGrmAccountCollateralAfmNo;
    @XmlElement(name = "InGrpInGrmAccountCollateralBankCode")
    protected short inGrpInGrmAccountCollateralBankCode;
    @XmlElement(name = "InGrpInGrmAccountCollateralCbInsuranceAmn", required = true)
    protected BigDecimal inGrpInGrmAccountCollateralCbInsuranceAmn;
    @XmlElement(name = "InGrpInGrmAccountCollateralDepAccInd")
    protected String inGrpInGrmAccountCollateralDepAccInd;
    @XmlElement(name = "InGrpInGrmAccountCollateralEntryStatus")
    protected String inGrpInGrmAccountCollateralEntryStatus;
    @XmlElement(name = "InGrpInGrmAccountCollateralEstInsuranceAmn", required = true)
    protected BigDecimal inGrpInGrmAccountCollateralEstInsuranceAmn;
    @XmlElement(name = "InGrpInGrmAccountCollateralEstValueAmn", required = true)
    protected BigDecimal inGrpInGrmAccountCollateralEstValueAmn;
    @XmlElement(name = "InGrpInGrmAccountCollateralExpiryDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGrpInGrmAccountCollateralExpiryDt;
    @XmlElement(name = "InGrpInGrmAccountCollateralFirstName")
    protected String inGrpInGrmAccountCollateralFirstName;
    @XmlElement(name = "InGrpInGrmAccountCollateralInsertionDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGrpInGrmAccountCollateralInsertionDt;
    @XmlElement(name = "InGrpInGrmAccountCollateralInternalSn")
    protected short inGrpInGrmAccountCollateralInternalSn;
    @XmlElement(name = "InGrpInGrmAccountCollateralIssuerAccount")
    protected double inGrpInGrmAccountCollateralIssuerAccount;
    @XmlElement(name = "InGrpInGrmAccountCollateralItemsCnt")
    protected int inGrpInGrmAccountCollateralItemsCnt;
    @XmlElement(name = "InGrpInGrmAccountCollateralNoteStatus")
    protected String inGrpInGrmAccountCollateralNoteStatus;
    @XmlElement(name = "InGrpInGrmAccountCollateralPrftAccount")
    protected String inGrpInGrmAccountCollateralPrftAccount;
    @XmlElement(name = "InGrpInGrmAccountCollateralProfitsSystem")
    protected int inGrpInGrmAccountCollateralProfitsSystem;
    @XmlElement(name = "InGrpInGrmAccountCollateralReferenceNumber")
    protected String inGrpInGrmAccountCollateralReferenceNumber;
    @XmlElement(name = "InGrpInGrmAccountCollateralRevalCurrFixRat", required = true)
    protected BigDecimal inGrpInGrmAccountCollateralRevalCurrFixRat;
    @XmlElement(name = "InGrpInGrmAccountCollateralRevalInitFixRat", required = true)
    protected BigDecimal inGrpInGrmAccountCollateralRevalInitFixRat;
    @XmlElement(name = "InGrpInGrmAccountCollateralRevalInitSv", required = true)
    protected BigDecimal inGrpInGrmAccountCollateralRevalInitSv;
    @XmlElement(name = "InGrpInGrmAccountCollateralRevaluationCurrid")
    protected int inGrpInGrmAccountCollateralRevaluationCurrid;
    @XmlElement(name = "InGrpInGrmAccountCollateralSurname")
    protected String inGrpInGrmAccountCollateralSurname;
    @XmlElement(name = "InGrpInGrmAccountCollateralTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGrpInGrmAccountCollateralTmstamp;
    @XmlElement(name = "InGrpInGrmAccountCollateralUnitCode")
    protected int inGrpInGrmAccountCollateralUnitCode;
    @XmlElement(name = "InGrpInGrmAccountCollateralUserCode")
    protected String inGrpInGrmAccountCollateralUserCode;
    @XmlElement(name = "InGrpInGrmAccountCollateralYieldLimitAmn", required = true)
    protected BigDecimal inGrpInGrmAccountCollateralYieldLimitAmn;
    @XmlElement(name = "InGrpInGrmAccountCollateralYieldPerc", required = true)
    protected BigDecimal inGrpInGrmAccountCollateralYieldPerc;
    @XmlElement(name = "InGrpInGrmAccountCollateralYieldUtilisedAmn", required = true)
    protected BigDecimal inGrpInGrmAccountCollateralYieldUtilisedAmn;
    @XmlElement(name = "InGrpInGrmCustomerCustId")
    protected int inGrpInGrmCustomerCustId;
    @XmlElement(name = "InGrpInGrmPrftAccountProfitsAccountAccStatus")
    protected String inGrpInGrmPrftAccountProfitsAccountAccStatus;
    @XmlElement(name = "InGrpInGrmRevalidCurrencyShortDescr")
    protected String inGrpInGrmRevalidCurrencyShortDescr;
    @XmlElement(name = "InGrpInGrmSelIefSuppliedSelectChar")
    protected String inGrpInGrmSelIefSuppliedSelectChar;
    @XmlElement(name = "InGrpInGrmStsCharSuppliedChar15")
    protected String inGrpInGrmStsCharSuppliedChar15;
    @XmlElement(name = "InGrpInGrmAccountCollateralMortgageAmn", required = true)
    protected BigDecimal inGrpInGrmAccountCollateralMortgageAmn;
    @XmlElement(name = "InGrpInGrmAccountCollateralMortgageClass")
    protected String inGrpInGrmAccountCollateralMortgageClass;
    @XmlElement(name = "InGrpInGrmAccountCollateralMortgageDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGrpInGrmAccountCollateralMortgageDate;

    /**
     * Gets the value of the inGrpInGrmAccountCollateralAccountCd property.
     * 
     */
    public short getInGrpInGrmAccountCollateralAccountCd() {
        return inGrpInGrmAccountCollateralAccountCd;
    }

    /**
     * Sets the value of the inGrpInGrmAccountCollateralAccountCd property.
     * 
     */
    public void setInGrpInGrmAccountCollateralAccountCd(short value) {
        this.inGrpInGrmAccountCollateralAccountCd = value;
    }

    /**
     * Gets the value of the inGrpInGrmAccountCollateralAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpInGrmAccountCollateralAddress() {
        return inGrpInGrmAccountCollateralAddress;
    }

    /**
     * Sets the value of the inGrpInGrmAccountCollateralAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpInGrmAccountCollateralAddress(String value) {
        this.inGrpInGrmAccountCollateralAddress = value;
    }

    /**
     * Gets the value of the inGrpInGrmAccountCollateralAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpInGrmAccountCollateralAfmNo() {
        return inGrpInGrmAccountCollateralAfmNo;
    }

    /**
     * Sets the value of the inGrpInGrmAccountCollateralAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpInGrmAccountCollateralAfmNo(String value) {
        this.inGrpInGrmAccountCollateralAfmNo = value;
    }

    /**
     * Gets the value of the inGrpInGrmAccountCollateralBankCode property.
     * 
     */
    public short getInGrpInGrmAccountCollateralBankCode() {
        return inGrpInGrmAccountCollateralBankCode;
    }

    /**
     * Sets the value of the inGrpInGrmAccountCollateralBankCode property.
     * 
     */
    public void setInGrpInGrmAccountCollateralBankCode(short value) {
        this.inGrpInGrmAccountCollateralBankCode = value;
    }

    /**
     * Gets the value of the inGrpInGrmAccountCollateralCbInsuranceAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpInGrmAccountCollateralCbInsuranceAmn() {
        return inGrpInGrmAccountCollateralCbInsuranceAmn;
    }

    /**
     * Sets the value of the inGrpInGrmAccountCollateralCbInsuranceAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpInGrmAccountCollateralCbInsuranceAmn(BigDecimal value) {
        this.inGrpInGrmAccountCollateralCbInsuranceAmn = value;
    }

    /**
     * Gets the value of the inGrpInGrmAccountCollateralDepAccInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpInGrmAccountCollateralDepAccInd() {
        return inGrpInGrmAccountCollateralDepAccInd;
    }

    /**
     * Sets the value of the inGrpInGrmAccountCollateralDepAccInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpInGrmAccountCollateralDepAccInd(String value) {
        this.inGrpInGrmAccountCollateralDepAccInd = value;
    }

    /**
     * Gets the value of the inGrpInGrmAccountCollateralEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpInGrmAccountCollateralEntryStatus() {
        return inGrpInGrmAccountCollateralEntryStatus;
    }

    /**
     * Sets the value of the inGrpInGrmAccountCollateralEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpInGrmAccountCollateralEntryStatus(String value) {
        this.inGrpInGrmAccountCollateralEntryStatus = value;
    }

    /**
     * Gets the value of the inGrpInGrmAccountCollateralEstInsuranceAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpInGrmAccountCollateralEstInsuranceAmn() {
        return inGrpInGrmAccountCollateralEstInsuranceAmn;
    }

    /**
     * Sets the value of the inGrpInGrmAccountCollateralEstInsuranceAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpInGrmAccountCollateralEstInsuranceAmn(BigDecimal value) {
        this.inGrpInGrmAccountCollateralEstInsuranceAmn = value;
    }

    /**
     * Gets the value of the inGrpInGrmAccountCollateralEstValueAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpInGrmAccountCollateralEstValueAmn() {
        return inGrpInGrmAccountCollateralEstValueAmn;
    }

    /**
     * Sets the value of the inGrpInGrmAccountCollateralEstValueAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpInGrmAccountCollateralEstValueAmn(BigDecimal value) {
        this.inGrpInGrmAccountCollateralEstValueAmn = value;
    }

    /**
     * Gets the value of the inGrpInGrmAccountCollateralExpiryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGrpInGrmAccountCollateralExpiryDt() {
        return inGrpInGrmAccountCollateralExpiryDt;
    }

    /**
     * Sets the value of the inGrpInGrmAccountCollateralExpiryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGrpInGrmAccountCollateralExpiryDt(XMLGregorianCalendar value) {
        this.inGrpInGrmAccountCollateralExpiryDt = value;
    }

    /**
     * Gets the value of the inGrpInGrmAccountCollateralFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpInGrmAccountCollateralFirstName() {
        return inGrpInGrmAccountCollateralFirstName;
    }

    /**
     * Sets the value of the inGrpInGrmAccountCollateralFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpInGrmAccountCollateralFirstName(String value) {
        this.inGrpInGrmAccountCollateralFirstName = value;
    }

    /**
     * Gets the value of the inGrpInGrmAccountCollateralInsertionDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGrpInGrmAccountCollateralInsertionDt() {
        return inGrpInGrmAccountCollateralInsertionDt;
    }

    /**
     * Sets the value of the inGrpInGrmAccountCollateralInsertionDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGrpInGrmAccountCollateralInsertionDt(XMLGregorianCalendar value) {
        this.inGrpInGrmAccountCollateralInsertionDt = value;
    }

    /**
     * Gets the value of the inGrpInGrmAccountCollateralInternalSn property.
     * 
     */
    public short getInGrpInGrmAccountCollateralInternalSn() {
        return inGrpInGrmAccountCollateralInternalSn;
    }

    /**
     * Sets the value of the inGrpInGrmAccountCollateralInternalSn property.
     * 
     */
    public void setInGrpInGrmAccountCollateralInternalSn(short value) {
        this.inGrpInGrmAccountCollateralInternalSn = value;
    }

    /**
     * Gets the value of the inGrpInGrmAccountCollateralIssuerAccount property.
     * 
     */
    public double getInGrpInGrmAccountCollateralIssuerAccount() {
        return inGrpInGrmAccountCollateralIssuerAccount;
    }

    /**
     * Sets the value of the inGrpInGrmAccountCollateralIssuerAccount property.
     * 
     */
    public void setInGrpInGrmAccountCollateralIssuerAccount(double value) {
        this.inGrpInGrmAccountCollateralIssuerAccount = value;
    }

    /**
     * Gets the value of the inGrpInGrmAccountCollateralItemsCnt property.
     * 
     */
    public int getInGrpInGrmAccountCollateralItemsCnt() {
        return inGrpInGrmAccountCollateralItemsCnt;
    }

    /**
     * Sets the value of the inGrpInGrmAccountCollateralItemsCnt property.
     * 
     */
    public void setInGrpInGrmAccountCollateralItemsCnt(int value) {
        this.inGrpInGrmAccountCollateralItemsCnt = value;
    }

    /**
     * Gets the value of the inGrpInGrmAccountCollateralNoteStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpInGrmAccountCollateralNoteStatus() {
        return inGrpInGrmAccountCollateralNoteStatus;
    }

    /**
     * Sets the value of the inGrpInGrmAccountCollateralNoteStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpInGrmAccountCollateralNoteStatus(String value) {
        this.inGrpInGrmAccountCollateralNoteStatus = value;
    }

    /**
     * Gets the value of the inGrpInGrmAccountCollateralPrftAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpInGrmAccountCollateralPrftAccount() {
        return inGrpInGrmAccountCollateralPrftAccount;
    }

    /**
     * Sets the value of the inGrpInGrmAccountCollateralPrftAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpInGrmAccountCollateralPrftAccount(String value) {
        this.inGrpInGrmAccountCollateralPrftAccount = value;
    }

    /**
     * Gets the value of the inGrpInGrmAccountCollateralProfitsSystem property.
     * 
     */
    public int getInGrpInGrmAccountCollateralProfitsSystem() {
        return inGrpInGrmAccountCollateralProfitsSystem;
    }

    /**
     * Sets the value of the inGrpInGrmAccountCollateralProfitsSystem property.
     * 
     */
    public void setInGrpInGrmAccountCollateralProfitsSystem(int value) {
        this.inGrpInGrmAccountCollateralProfitsSystem = value;
    }

    /**
     * Gets the value of the inGrpInGrmAccountCollateralReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpInGrmAccountCollateralReferenceNumber() {
        return inGrpInGrmAccountCollateralReferenceNumber;
    }

    /**
     * Sets the value of the inGrpInGrmAccountCollateralReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpInGrmAccountCollateralReferenceNumber(String value) {
        this.inGrpInGrmAccountCollateralReferenceNumber = value;
    }

    /**
     * Gets the value of the inGrpInGrmAccountCollateralRevalCurrFixRat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpInGrmAccountCollateralRevalCurrFixRat() {
        return inGrpInGrmAccountCollateralRevalCurrFixRat;
    }

    /**
     * Sets the value of the inGrpInGrmAccountCollateralRevalCurrFixRat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpInGrmAccountCollateralRevalCurrFixRat(BigDecimal value) {
        this.inGrpInGrmAccountCollateralRevalCurrFixRat = value;
    }

    /**
     * Gets the value of the inGrpInGrmAccountCollateralRevalInitFixRat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpInGrmAccountCollateralRevalInitFixRat() {
        return inGrpInGrmAccountCollateralRevalInitFixRat;
    }

    /**
     * Sets the value of the inGrpInGrmAccountCollateralRevalInitFixRat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpInGrmAccountCollateralRevalInitFixRat(BigDecimal value) {
        this.inGrpInGrmAccountCollateralRevalInitFixRat = value;
    }

    /**
     * Gets the value of the inGrpInGrmAccountCollateralRevalInitSv property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpInGrmAccountCollateralRevalInitSv() {
        return inGrpInGrmAccountCollateralRevalInitSv;
    }

    /**
     * Sets the value of the inGrpInGrmAccountCollateralRevalInitSv property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpInGrmAccountCollateralRevalInitSv(BigDecimal value) {
        this.inGrpInGrmAccountCollateralRevalInitSv = value;
    }

    /**
     * Gets the value of the inGrpInGrmAccountCollateralRevaluationCurrid property.
     * 
     */
    public int getInGrpInGrmAccountCollateralRevaluationCurrid() {
        return inGrpInGrmAccountCollateralRevaluationCurrid;
    }

    /**
     * Sets the value of the inGrpInGrmAccountCollateralRevaluationCurrid property.
     * 
     */
    public void setInGrpInGrmAccountCollateralRevaluationCurrid(int value) {
        this.inGrpInGrmAccountCollateralRevaluationCurrid = value;
    }

    /**
     * Gets the value of the inGrpInGrmAccountCollateralSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpInGrmAccountCollateralSurname() {
        return inGrpInGrmAccountCollateralSurname;
    }

    /**
     * Sets the value of the inGrpInGrmAccountCollateralSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpInGrmAccountCollateralSurname(String value) {
        this.inGrpInGrmAccountCollateralSurname = value;
    }

    /**
     * Gets the value of the inGrpInGrmAccountCollateralTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGrpInGrmAccountCollateralTmstamp() {
        return inGrpInGrmAccountCollateralTmstamp;
    }

    /**
     * Sets the value of the inGrpInGrmAccountCollateralTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGrpInGrmAccountCollateralTmstamp(XMLGregorianCalendar value) {
        this.inGrpInGrmAccountCollateralTmstamp = value;
    }

    /**
     * Gets the value of the inGrpInGrmAccountCollateralUnitCode property.
     * 
     */
    public int getInGrpInGrmAccountCollateralUnitCode() {
        return inGrpInGrmAccountCollateralUnitCode;
    }

    /**
     * Sets the value of the inGrpInGrmAccountCollateralUnitCode property.
     * 
     */
    public void setInGrpInGrmAccountCollateralUnitCode(int value) {
        this.inGrpInGrmAccountCollateralUnitCode = value;
    }

    /**
     * Gets the value of the inGrpInGrmAccountCollateralUserCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpInGrmAccountCollateralUserCode() {
        return inGrpInGrmAccountCollateralUserCode;
    }

    /**
     * Sets the value of the inGrpInGrmAccountCollateralUserCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpInGrmAccountCollateralUserCode(String value) {
        this.inGrpInGrmAccountCollateralUserCode = value;
    }

    /**
     * Gets the value of the inGrpInGrmAccountCollateralYieldLimitAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpInGrmAccountCollateralYieldLimitAmn() {
        return inGrpInGrmAccountCollateralYieldLimitAmn;
    }

    /**
     * Sets the value of the inGrpInGrmAccountCollateralYieldLimitAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpInGrmAccountCollateralYieldLimitAmn(BigDecimal value) {
        this.inGrpInGrmAccountCollateralYieldLimitAmn = value;
    }

    /**
     * Gets the value of the inGrpInGrmAccountCollateralYieldPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpInGrmAccountCollateralYieldPerc() {
        return inGrpInGrmAccountCollateralYieldPerc;
    }

    /**
     * Sets the value of the inGrpInGrmAccountCollateralYieldPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpInGrmAccountCollateralYieldPerc(BigDecimal value) {
        this.inGrpInGrmAccountCollateralYieldPerc = value;
    }

    /**
     * Gets the value of the inGrpInGrmAccountCollateralYieldUtilisedAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpInGrmAccountCollateralYieldUtilisedAmn() {
        return inGrpInGrmAccountCollateralYieldUtilisedAmn;
    }

    /**
     * Sets the value of the inGrpInGrmAccountCollateralYieldUtilisedAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpInGrmAccountCollateralYieldUtilisedAmn(BigDecimal value) {
        this.inGrpInGrmAccountCollateralYieldUtilisedAmn = value;
    }

    /**
     * Gets the value of the inGrpInGrmCustomerCustId property.
     * 
     */
    public int getInGrpInGrmCustomerCustId() {
        return inGrpInGrmCustomerCustId;
    }

    /**
     * Sets the value of the inGrpInGrmCustomerCustId property.
     * 
     */
    public void setInGrpInGrmCustomerCustId(int value) {
        this.inGrpInGrmCustomerCustId = value;
    }

    /**
     * Gets the value of the inGrpInGrmPrftAccountProfitsAccountAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpInGrmPrftAccountProfitsAccountAccStatus() {
        return inGrpInGrmPrftAccountProfitsAccountAccStatus;
    }

    /**
     * Sets the value of the inGrpInGrmPrftAccountProfitsAccountAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpInGrmPrftAccountProfitsAccountAccStatus(String value) {
        this.inGrpInGrmPrftAccountProfitsAccountAccStatus = value;
    }

    /**
     * Gets the value of the inGrpInGrmRevalidCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpInGrmRevalidCurrencyShortDescr() {
        return inGrpInGrmRevalidCurrencyShortDescr;
    }

    /**
     * Sets the value of the inGrpInGrmRevalidCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpInGrmRevalidCurrencyShortDescr(String value) {
        this.inGrpInGrmRevalidCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inGrpInGrmSelIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpInGrmSelIefSuppliedSelectChar() {
        return inGrpInGrmSelIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the inGrpInGrmSelIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpInGrmSelIefSuppliedSelectChar(String value) {
        this.inGrpInGrmSelIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the inGrpInGrmStsCharSuppliedChar15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpInGrmStsCharSuppliedChar15() {
        return inGrpInGrmStsCharSuppliedChar15;
    }

    /**
     * Sets the value of the inGrpInGrmStsCharSuppliedChar15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpInGrmStsCharSuppliedChar15(String value) {
        this.inGrpInGrmStsCharSuppliedChar15 = value;
    }

    /**
     * Gets the value of the inGrpInGrmAccountCollateralMortgageAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpInGrmAccountCollateralMortgageAmn() {
        return inGrpInGrmAccountCollateralMortgageAmn;
    }

    /**
     * Sets the value of the inGrpInGrmAccountCollateralMortgageAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpInGrmAccountCollateralMortgageAmn(BigDecimal value) {
        this.inGrpInGrmAccountCollateralMortgageAmn = value;
    }

    /**
     * Gets the value of the inGrpInGrmAccountCollateralMortgageClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpInGrmAccountCollateralMortgageClass() {
        return inGrpInGrmAccountCollateralMortgageClass;
    }

    /**
     * Sets the value of the inGrpInGrmAccountCollateralMortgageClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpInGrmAccountCollateralMortgageClass(String value) {
        this.inGrpInGrmAccountCollateralMortgageClass = value;
    }

    /**
     * Gets the value of the inGrpInGrmAccountCollateralMortgageDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGrpInGrmAccountCollateralMortgageDate() {
        return inGrpInGrmAccountCollateralMortgageDate;
    }

    /**
     * Sets the value of the inGrpInGrmAccountCollateralMortgageDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGrpInGrmAccountCollateralMortgageDate(XMLGregorianCalendar value) {
        this.inGrpInGrmAccountCollateralMortgageDate = value;
    }

}
