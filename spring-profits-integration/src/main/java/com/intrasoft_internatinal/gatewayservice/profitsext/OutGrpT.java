
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutGrpT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpOutGrmAccountCollateralAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmAccountCollateralAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmAccountCollateralAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmAccountCollateralBankCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmAccountCollateralCbInsuranceAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmAccountCollateralDepAccInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmAccountCollateralEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmAccountCollateralEstInsuranceAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmAccountCollateralEstValueAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmAccountCollateralExpiryDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmAccountCollateralFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmAccountCollateralInsertionDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmAccountCollateralInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmAccountCollateralIssuerAccount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmAccountCollateralItemsCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmAccountCollateralNoteStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmAccountCollateralPrftAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmAccountCollateralProfitsSystem" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmAccountCollateralReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmAccountCollateralRevalCurrFixRat" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmAccountCollateralRevalInitFixRat" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmAccountCollateralRevalInitSv" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmAccountCollateralRevaluationCurrid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmAccountCollateralSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmAccountCollateralTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmAccountCollateralUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmAccountCollateralUserCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmAccountCollateralYieldLimitAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmAccountCollateralYieldPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmAccountCollateralYieldUtilisedAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmRevalCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSelIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmStsDescrCharSuppliedChar15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrpPrftAccountProfitsAccountAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmAccountCollateralMortgageAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmAccountCollateralMortgageClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmAccountCollateralMortgageDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpT", propOrder = {
    "outGrpOutGrmAccountCollateralAccountCd",
    "outGrpOutGrmAccountCollateralAddress",
    "outGrpOutGrmAccountCollateralAfmNo",
    "outGrpOutGrmAccountCollateralBankCode",
    "outGrpOutGrmAccountCollateralCbInsuranceAmn",
    "outGrpOutGrmAccountCollateralDepAccInd",
    "outGrpOutGrmAccountCollateralEntryStatus",
    "outGrpOutGrmAccountCollateralEstInsuranceAmn",
    "outGrpOutGrmAccountCollateralEstValueAmn",
    "outGrpOutGrmAccountCollateralExpiryDt",
    "outGrpOutGrmAccountCollateralFirstName",
    "outGrpOutGrmAccountCollateralInsertionDt",
    "outGrpOutGrmAccountCollateralInternalSn",
    "outGrpOutGrmAccountCollateralIssuerAccount",
    "outGrpOutGrmAccountCollateralItemsCnt",
    "outGrpOutGrmAccountCollateralNoteStatus",
    "outGrpOutGrmAccountCollateralPrftAccount",
    "outGrpOutGrmAccountCollateralProfitsSystem",
    "outGrpOutGrmAccountCollateralReferenceNumber",
    "outGrpOutGrmAccountCollateralRevalCurrFixRat",
    "outGrpOutGrmAccountCollateralRevalInitFixRat",
    "outGrpOutGrmAccountCollateralRevalInitSv",
    "outGrpOutGrmAccountCollateralRevaluationCurrid",
    "outGrpOutGrmAccountCollateralSurname",
    "outGrpOutGrmAccountCollateralTmstamp",
    "outGrpOutGrmAccountCollateralUnitCode",
    "outGrpOutGrmAccountCollateralUserCode",
    "outGrpOutGrmAccountCollateralYieldLimitAmn",
    "outGrpOutGrmAccountCollateralYieldPerc",
    "outGrpOutGrmAccountCollateralYieldUtilisedAmn",
    "outGrpOutGrmCustomerCustId",
    "outGrpOutGrmRevalCurrencyShortDescr",
    "outGrpOutGrmSelIefSuppliedSelectChar",
    "outGrpOutGrmStsDescrCharSuppliedChar15",
    "outGrpOutGrpPrftAccountProfitsAccountAccStatus",
    "outGrpOutGrmAccountCollateralMortgageAmn",
    "outGrpOutGrmAccountCollateralMortgageClass",
    "outGrpOutGrmAccountCollateralMortgageDate"
})
public class OutGrpT {

    @XmlElement(name = "OutGrpOutGrmAccountCollateralAccountCd")
    protected short outGrpOutGrmAccountCollateralAccountCd;
    @XmlElement(name = "OutGrpOutGrmAccountCollateralAddress")
    protected String outGrpOutGrmAccountCollateralAddress;
    @XmlElement(name = "OutGrpOutGrmAccountCollateralAfmNo")
    protected String outGrpOutGrmAccountCollateralAfmNo;
    @XmlElement(name = "OutGrpOutGrmAccountCollateralBankCode")
    protected short outGrpOutGrmAccountCollateralBankCode;
    @XmlElement(name = "OutGrpOutGrmAccountCollateralCbInsuranceAmn", required = true)
    protected BigDecimal outGrpOutGrmAccountCollateralCbInsuranceAmn;
    @XmlElement(name = "OutGrpOutGrmAccountCollateralDepAccInd")
    protected String outGrpOutGrmAccountCollateralDepAccInd;
    @XmlElement(name = "OutGrpOutGrmAccountCollateralEntryStatus")
    protected String outGrpOutGrmAccountCollateralEntryStatus;
    @XmlElement(name = "OutGrpOutGrmAccountCollateralEstInsuranceAmn", required = true)
    protected BigDecimal outGrpOutGrmAccountCollateralEstInsuranceAmn;
    @XmlElement(name = "OutGrpOutGrmAccountCollateralEstValueAmn", required = true)
    protected BigDecimal outGrpOutGrmAccountCollateralEstValueAmn;
    @XmlElement(name = "OutGrpOutGrmAccountCollateralExpiryDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmAccountCollateralExpiryDt;
    @XmlElement(name = "OutGrpOutGrmAccountCollateralFirstName")
    protected String outGrpOutGrmAccountCollateralFirstName;
    @XmlElement(name = "OutGrpOutGrmAccountCollateralInsertionDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmAccountCollateralInsertionDt;
    @XmlElement(name = "OutGrpOutGrmAccountCollateralInternalSn")
    protected short outGrpOutGrmAccountCollateralInternalSn;
    @XmlElement(name = "OutGrpOutGrmAccountCollateralIssuerAccount")
    protected double outGrpOutGrmAccountCollateralIssuerAccount;
    @XmlElement(name = "OutGrpOutGrmAccountCollateralItemsCnt")
    protected int outGrpOutGrmAccountCollateralItemsCnt;
    @XmlElement(name = "OutGrpOutGrmAccountCollateralNoteStatus")
    protected String outGrpOutGrmAccountCollateralNoteStatus;
    @XmlElement(name = "OutGrpOutGrmAccountCollateralPrftAccount")
    protected String outGrpOutGrmAccountCollateralPrftAccount;
    @XmlElement(name = "OutGrpOutGrmAccountCollateralProfitsSystem")
    protected int outGrpOutGrmAccountCollateralProfitsSystem;
    @XmlElement(name = "OutGrpOutGrmAccountCollateralReferenceNumber")
    protected String outGrpOutGrmAccountCollateralReferenceNumber;
    @XmlElement(name = "OutGrpOutGrmAccountCollateralRevalCurrFixRat", required = true)
    protected BigDecimal outGrpOutGrmAccountCollateralRevalCurrFixRat;
    @XmlElement(name = "OutGrpOutGrmAccountCollateralRevalInitFixRat", required = true)
    protected BigDecimal outGrpOutGrmAccountCollateralRevalInitFixRat;
    @XmlElement(name = "OutGrpOutGrmAccountCollateralRevalInitSv", required = true)
    protected BigDecimal outGrpOutGrmAccountCollateralRevalInitSv;
    @XmlElement(name = "OutGrpOutGrmAccountCollateralRevaluationCurrid")
    protected int outGrpOutGrmAccountCollateralRevaluationCurrid;
    @XmlElement(name = "OutGrpOutGrmAccountCollateralSurname")
    protected String outGrpOutGrmAccountCollateralSurname;
    @XmlElement(name = "OutGrpOutGrmAccountCollateralTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmAccountCollateralTmstamp;
    @XmlElement(name = "OutGrpOutGrmAccountCollateralUnitCode")
    protected int outGrpOutGrmAccountCollateralUnitCode;
    @XmlElement(name = "OutGrpOutGrmAccountCollateralUserCode")
    protected String outGrpOutGrmAccountCollateralUserCode;
    @XmlElement(name = "OutGrpOutGrmAccountCollateralYieldLimitAmn", required = true)
    protected BigDecimal outGrpOutGrmAccountCollateralYieldLimitAmn;
    @XmlElement(name = "OutGrpOutGrmAccountCollateralYieldPerc", required = true)
    protected BigDecimal outGrpOutGrmAccountCollateralYieldPerc;
    @XmlElement(name = "OutGrpOutGrmAccountCollateralYieldUtilisedAmn", required = true)
    protected BigDecimal outGrpOutGrmAccountCollateralYieldUtilisedAmn;
    @XmlElement(name = "OutGrpOutGrmCustomerCustId")
    protected int outGrpOutGrmCustomerCustId;
    @XmlElement(name = "OutGrpOutGrmRevalCurrencyShortDescr")
    protected String outGrpOutGrmRevalCurrencyShortDescr;
    @XmlElement(name = "OutGrpOutGrmSelIefSuppliedSelectChar")
    protected String outGrpOutGrmSelIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpOutGrmStsDescrCharSuppliedChar15")
    protected String outGrpOutGrmStsDescrCharSuppliedChar15;
    @XmlElement(name = "OutGrpOutGrpPrftAccountProfitsAccountAccStatus")
    protected String outGrpOutGrpPrftAccountProfitsAccountAccStatus;
    @XmlElement(name = "OutGrpOutGrmAccountCollateralMortgageAmn", required = true)
    protected BigDecimal outGrpOutGrmAccountCollateralMortgageAmn;
    @XmlElement(name = "OutGrpOutGrmAccountCollateralMortgageClass")
    protected String outGrpOutGrmAccountCollateralMortgageClass;
    @XmlElement(name = "OutGrpOutGrmAccountCollateralMortgageDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmAccountCollateralMortgageDate;

    /**
     * Gets the value of the outGrpOutGrmAccountCollateralAccountCd property.
     * 
     */
    public short getOutGrpOutGrmAccountCollateralAccountCd() {
        return outGrpOutGrmAccountCollateralAccountCd;
    }

    /**
     * Sets the value of the outGrpOutGrmAccountCollateralAccountCd property.
     * 
     */
    public void setOutGrpOutGrmAccountCollateralAccountCd(short value) {
        this.outGrpOutGrmAccountCollateralAccountCd = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccountCollateralAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmAccountCollateralAddress() {
        return outGrpOutGrmAccountCollateralAddress;
    }

    /**
     * Sets the value of the outGrpOutGrmAccountCollateralAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmAccountCollateralAddress(String value) {
        this.outGrpOutGrmAccountCollateralAddress = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccountCollateralAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmAccountCollateralAfmNo() {
        return outGrpOutGrmAccountCollateralAfmNo;
    }

    /**
     * Sets the value of the outGrpOutGrmAccountCollateralAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmAccountCollateralAfmNo(String value) {
        this.outGrpOutGrmAccountCollateralAfmNo = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccountCollateralBankCode property.
     * 
     */
    public short getOutGrpOutGrmAccountCollateralBankCode() {
        return outGrpOutGrmAccountCollateralBankCode;
    }

    /**
     * Sets the value of the outGrpOutGrmAccountCollateralBankCode property.
     * 
     */
    public void setOutGrpOutGrmAccountCollateralBankCode(short value) {
        this.outGrpOutGrmAccountCollateralBankCode = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccountCollateralCbInsuranceAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmAccountCollateralCbInsuranceAmn() {
        return outGrpOutGrmAccountCollateralCbInsuranceAmn;
    }

    /**
     * Sets the value of the outGrpOutGrmAccountCollateralCbInsuranceAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmAccountCollateralCbInsuranceAmn(BigDecimal value) {
        this.outGrpOutGrmAccountCollateralCbInsuranceAmn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccountCollateralDepAccInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmAccountCollateralDepAccInd() {
        return outGrpOutGrmAccountCollateralDepAccInd;
    }

    /**
     * Sets the value of the outGrpOutGrmAccountCollateralDepAccInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmAccountCollateralDepAccInd(String value) {
        this.outGrpOutGrmAccountCollateralDepAccInd = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccountCollateralEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmAccountCollateralEntryStatus() {
        return outGrpOutGrmAccountCollateralEntryStatus;
    }

    /**
     * Sets the value of the outGrpOutGrmAccountCollateralEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmAccountCollateralEntryStatus(String value) {
        this.outGrpOutGrmAccountCollateralEntryStatus = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccountCollateralEstInsuranceAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmAccountCollateralEstInsuranceAmn() {
        return outGrpOutGrmAccountCollateralEstInsuranceAmn;
    }

    /**
     * Sets the value of the outGrpOutGrmAccountCollateralEstInsuranceAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmAccountCollateralEstInsuranceAmn(BigDecimal value) {
        this.outGrpOutGrmAccountCollateralEstInsuranceAmn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccountCollateralEstValueAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmAccountCollateralEstValueAmn() {
        return outGrpOutGrmAccountCollateralEstValueAmn;
    }

    /**
     * Sets the value of the outGrpOutGrmAccountCollateralEstValueAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmAccountCollateralEstValueAmn(BigDecimal value) {
        this.outGrpOutGrmAccountCollateralEstValueAmn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccountCollateralExpiryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmAccountCollateralExpiryDt() {
        return outGrpOutGrmAccountCollateralExpiryDt;
    }

    /**
     * Sets the value of the outGrpOutGrmAccountCollateralExpiryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmAccountCollateralExpiryDt(XMLGregorianCalendar value) {
        this.outGrpOutGrmAccountCollateralExpiryDt = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccountCollateralFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmAccountCollateralFirstName() {
        return outGrpOutGrmAccountCollateralFirstName;
    }

    /**
     * Sets the value of the outGrpOutGrmAccountCollateralFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmAccountCollateralFirstName(String value) {
        this.outGrpOutGrmAccountCollateralFirstName = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccountCollateralInsertionDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmAccountCollateralInsertionDt() {
        return outGrpOutGrmAccountCollateralInsertionDt;
    }

    /**
     * Sets the value of the outGrpOutGrmAccountCollateralInsertionDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmAccountCollateralInsertionDt(XMLGregorianCalendar value) {
        this.outGrpOutGrmAccountCollateralInsertionDt = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccountCollateralInternalSn property.
     * 
     */
    public short getOutGrpOutGrmAccountCollateralInternalSn() {
        return outGrpOutGrmAccountCollateralInternalSn;
    }

    /**
     * Sets the value of the outGrpOutGrmAccountCollateralInternalSn property.
     * 
     */
    public void setOutGrpOutGrmAccountCollateralInternalSn(short value) {
        this.outGrpOutGrmAccountCollateralInternalSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccountCollateralIssuerAccount property.
     * 
     */
    public double getOutGrpOutGrmAccountCollateralIssuerAccount() {
        return outGrpOutGrmAccountCollateralIssuerAccount;
    }

    /**
     * Sets the value of the outGrpOutGrmAccountCollateralIssuerAccount property.
     * 
     */
    public void setOutGrpOutGrmAccountCollateralIssuerAccount(double value) {
        this.outGrpOutGrmAccountCollateralIssuerAccount = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccountCollateralItemsCnt property.
     * 
     */
    public int getOutGrpOutGrmAccountCollateralItemsCnt() {
        return outGrpOutGrmAccountCollateralItemsCnt;
    }

    /**
     * Sets the value of the outGrpOutGrmAccountCollateralItemsCnt property.
     * 
     */
    public void setOutGrpOutGrmAccountCollateralItemsCnt(int value) {
        this.outGrpOutGrmAccountCollateralItemsCnt = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccountCollateralNoteStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmAccountCollateralNoteStatus() {
        return outGrpOutGrmAccountCollateralNoteStatus;
    }

    /**
     * Sets the value of the outGrpOutGrmAccountCollateralNoteStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmAccountCollateralNoteStatus(String value) {
        this.outGrpOutGrmAccountCollateralNoteStatus = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccountCollateralPrftAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmAccountCollateralPrftAccount() {
        return outGrpOutGrmAccountCollateralPrftAccount;
    }

    /**
     * Sets the value of the outGrpOutGrmAccountCollateralPrftAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmAccountCollateralPrftAccount(String value) {
        this.outGrpOutGrmAccountCollateralPrftAccount = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccountCollateralProfitsSystem property.
     * 
     */
    public int getOutGrpOutGrmAccountCollateralProfitsSystem() {
        return outGrpOutGrmAccountCollateralProfitsSystem;
    }

    /**
     * Sets the value of the outGrpOutGrmAccountCollateralProfitsSystem property.
     * 
     */
    public void setOutGrpOutGrmAccountCollateralProfitsSystem(int value) {
        this.outGrpOutGrmAccountCollateralProfitsSystem = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccountCollateralReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmAccountCollateralReferenceNumber() {
        return outGrpOutGrmAccountCollateralReferenceNumber;
    }

    /**
     * Sets the value of the outGrpOutGrmAccountCollateralReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmAccountCollateralReferenceNumber(String value) {
        this.outGrpOutGrmAccountCollateralReferenceNumber = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccountCollateralRevalCurrFixRat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmAccountCollateralRevalCurrFixRat() {
        return outGrpOutGrmAccountCollateralRevalCurrFixRat;
    }

    /**
     * Sets the value of the outGrpOutGrmAccountCollateralRevalCurrFixRat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmAccountCollateralRevalCurrFixRat(BigDecimal value) {
        this.outGrpOutGrmAccountCollateralRevalCurrFixRat = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccountCollateralRevalInitFixRat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmAccountCollateralRevalInitFixRat() {
        return outGrpOutGrmAccountCollateralRevalInitFixRat;
    }

    /**
     * Sets the value of the outGrpOutGrmAccountCollateralRevalInitFixRat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmAccountCollateralRevalInitFixRat(BigDecimal value) {
        this.outGrpOutGrmAccountCollateralRevalInitFixRat = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccountCollateralRevalInitSv property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmAccountCollateralRevalInitSv() {
        return outGrpOutGrmAccountCollateralRevalInitSv;
    }

    /**
     * Sets the value of the outGrpOutGrmAccountCollateralRevalInitSv property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmAccountCollateralRevalInitSv(BigDecimal value) {
        this.outGrpOutGrmAccountCollateralRevalInitSv = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccountCollateralRevaluationCurrid property.
     * 
     */
    public int getOutGrpOutGrmAccountCollateralRevaluationCurrid() {
        return outGrpOutGrmAccountCollateralRevaluationCurrid;
    }

    /**
     * Sets the value of the outGrpOutGrmAccountCollateralRevaluationCurrid property.
     * 
     */
    public void setOutGrpOutGrmAccountCollateralRevaluationCurrid(int value) {
        this.outGrpOutGrmAccountCollateralRevaluationCurrid = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccountCollateralSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmAccountCollateralSurname() {
        return outGrpOutGrmAccountCollateralSurname;
    }

    /**
     * Sets the value of the outGrpOutGrmAccountCollateralSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmAccountCollateralSurname(String value) {
        this.outGrpOutGrmAccountCollateralSurname = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccountCollateralTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmAccountCollateralTmstamp() {
        return outGrpOutGrmAccountCollateralTmstamp;
    }

    /**
     * Sets the value of the outGrpOutGrmAccountCollateralTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmAccountCollateralTmstamp(XMLGregorianCalendar value) {
        this.outGrpOutGrmAccountCollateralTmstamp = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccountCollateralUnitCode property.
     * 
     */
    public int getOutGrpOutGrmAccountCollateralUnitCode() {
        return outGrpOutGrmAccountCollateralUnitCode;
    }

    /**
     * Sets the value of the outGrpOutGrmAccountCollateralUnitCode property.
     * 
     */
    public void setOutGrpOutGrmAccountCollateralUnitCode(int value) {
        this.outGrpOutGrmAccountCollateralUnitCode = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccountCollateralUserCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmAccountCollateralUserCode() {
        return outGrpOutGrmAccountCollateralUserCode;
    }

    /**
     * Sets the value of the outGrpOutGrmAccountCollateralUserCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmAccountCollateralUserCode(String value) {
        this.outGrpOutGrmAccountCollateralUserCode = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccountCollateralYieldLimitAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmAccountCollateralYieldLimitAmn() {
        return outGrpOutGrmAccountCollateralYieldLimitAmn;
    }

    /**
     * Sets the value of the outGrpOutGrmAccountCollateralYieldLimitAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmAccountCollateralYieldLimitAmn(BigDecimal value) {
        this.outGrpOutGrmAccountCollateralYieldLimitAmn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccountCollateralYieldPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmAccountCollateralYieldPerc() {
        return outGrpOutGrmAccountCollateralYieldPerc;
    }

    /**
     * Sets the value of the outGrpOutGrmAccountCollateralYieldPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmAccountCollateralYieldPerc(BigDecimal value) {
        this.outGrpOutGrmAccountCollateralYieldPerc = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccountCollateralYieldUtilisedAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmAccountCollateralYieldUtilisedAmn() {
        return outGrpOutGrmAccountCollateralYieldUtilisedAmn;
    }

    /**
     * Sets the value of the outGrpOutGrmAccountCollateralYieldUtilisedAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmAccountCollateralYieldUtilisedAmn(BigDecimal value) {
        this.outGrpOutGrmAccountCollateralYieldUtilisedAmn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCustomerCustId property.
     * 
     */
    public int getOutGrpOutGrmCustomerCustId() {
        return outGrpOutGrmCustomerCustId;
    }

    /**
     * Sets the value of the outGrpOutGrmCustomerCustId property.
     * 
     */
    public void setOutGrpOutGrmCustomerCustId(int value) {
        this.outGrpOutGrmCustomerCustId = value;
    }

    /**
     * Gets the value of the outGrpOutGrmRevalCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmRevalCurrencyShortDescr() {
        return outGrpOutGrmRevalCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpOutGrmRevalCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmRevalCurrencyShortDescr(String value) {
        this.outGrpOutGrmRevalCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSelIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSelIefSuppliedSelectChar() {
        return outGrpOutGrmSelIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpOutGrmSelIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSelIefSuppliedSelectChar(String value) {
        this.outGrpOutGrmSelIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpOutGrmStsDescrCharSuppliedChar15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmStsDescrCharSuppliedChar15() {
        return outGrpOutGrmStsDescrCharSuppliedChar15;
    }

    /**
     * Sets the value of the outGrpOutGrmStsDescrCharSuppliedChar15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmStsDescrCharSuppliedChar15(String value) {
        this.outGrpOutGrmStsDescrCharSuppliedChar15 = value;
    }

    /**
     * Gets the value of the outGrpOutGrpPrftAccountProfitsAccountAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrpPrftAccountProfitsAccountAccStatus() {
        return outGrpOutGrpPrftAccountProfitsAccountAccStatus;
    }

    /**
     * Sets the value of the outGrpOutGrpPrftAccountProfitsAccountAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrpPrftAccountProfitsAccountAccStatus(String value) {
        this.outGrpOutGrpPrftAccountProfitsAccountAccStatus = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccountCollateralMortgageAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmAccountCollateralMortgageAmn() {
        return outGrpOutGrmAccountCollateralMortgageAmn;
    }

    /**
     * Sets the value of the outGrpOutGrmAccountCollateralMortgageAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmAccountCollateralMortgageAmn(BigDecimal value) {
        this.outGrpOutGrmAccountCollateralMortgageAmn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccountCollateralMortgageClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmAccountCollateralMortgageClass() {
        return outGrpOutGrmAccountCollateralMortgageClass;
    }

    /**
     * Sets the value of the outGrpOutGrmAccountCollateralMortgageClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmAccountCollateralMortgageClass(String value) {
        this.outGrpOutGrmAccountCollateralMortgageClass = value;
    }

    /**
     * Gets the value of the outGrpOutGrmAccountCollateralMortgageDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmAccountCollateralMortgageDate() {
        return outGrpOutGrmAccountCollateralMortgageDate;
    }

    /**
     * Sets the value of the outGrpOutGrmAccountCollateralMortgageDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmAccountCollateralMortgageDate(XMLGregorianCalendar value) {
        this.outGrpOutGrmAccountCollateralMortgageDate = value;
    }

}
