
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InBillGrpSs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InBillGrpSs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InBillGrpSsInBillGrmBillBillAccountNumb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillBillAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillBillBarcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillBillBranchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillBillCheckDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillBillClrtypeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillBillCollYieldPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillBillCommDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillBillCraccAvldt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillBillCrAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillBillCraccIntdt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillBillCraccJustif" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillBillCrAccNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillBillCraccPrfsys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillBillExpaccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillBillExpaccNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillBillExpaccPrfsys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillBillExpDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillBillExpInterdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillBillIbanCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillBillIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillBillJustificId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillBillNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillBillOwnbankFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillBillProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillBillSerialNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillBillSpecialChars" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillBillTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillBillTypeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillClrAgentCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillCpAgreementNo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillCpDataField1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillCpDataField2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillCpDataField3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillCpDataField4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillGrpSsInGrmBillIssuerBissCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillGrpSsInGrmCollaborationBanksBankId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillGrpSsInBillGrmBillBillCodeline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InBillGrpSs", propOrder = {
    "inBillGrpSsInBillGrmBillBillAccountNumb",
    "inBillGrpSsInBillGrmBillBillAmount",
    "inBillGrpSsInBillGrmBillBillBarcode",
    "inBillGrpSsInBillGrmBillBillBranchCode",
    "inBillGrpSsInBillGrmBillBillCheckDigit",
    "inBillGrpSsInBillGrmBillBillClrtypeFlag",
    "inBillGrpSsInBillGrmBillBillCollYieldPerc",
    "inBillGrpSsInBillGrmBillBillCommDiscount",
    "inBillGrpSsInBillGrmBillBillCraccAvldt",
    "inBillGrpSsInBillGrmBillBillCrAccCd",
    "inBillGrpSsInBillGrmBillBillCraccIntdt",
    "inBillGrpSsInBillGrmBillBillCraccJustif",
    "inBillGrpSsInBillGrmBillBillCrAccNumber",
    "inBillGrpSsInBillGrmBillBillCraccPrfsys",
    "inBillGrpSsInBillGrmBillBillExpaccCd",
    "inBillGrpSsInBillGrmBillBillExpaccNumber",
    "inBillGrpSsInBillGrmBillBillExpaccPrfsys",
    "inBillGrpSsInBillGrmBillBillExpDiscount",
    "inBillGrpSsInBillGrmBillBillExpInterdate",
    "inBillGrpSsInBillGrmBillBillIbanCode",
    "inBillGrpSsInBillGrmBillBillIssueDate",
    "inBillGrpSsInBillGrmBillBillJustificId",
    "inBillGrpSsInBillGrmBillBillNumber",
    "inBillGrpSsInBillGrmBillBillOwnbankFlag",
    "inBillGrpSsInBillGrmBillBillProductId",
    "inBillGrpSsInBillGrmBillBillSerialNum",
    "inBillGrpSsInBillGrmBillBillSpecialChars",
    "inBillGrpSsInBillGrmBillBillTmstamp",
    "inBillGrpSsInBillGrmBillBillTypeFlag",
    "inBillGrpSsInBillGrmBillClrAgentCode",
    "inBillGrpSsInBillGrmBillComments",
    "inBillGrpSsInBillGrmBillCpAgreementNo",
    "inBillGrpSsInBillGrmBillCpDataField1",
    "inBillGrpSsInBillGrmBillCpDataField2",
    "inBillGrpSsInBillGrmBillCpDataField3",
    "inBillGrpSsInBillGrmBillCpDataField4",
    "inBillGrpSsInGrmBillIssuerBissCode",
    "inBillGrpSsInGrmCollaborationBanksBankId",
    "inBillGrpSsInBillGrmBillBillCodeline"
})
public class InBillGrpSs {

    @XmlElement(name = "InBillGrpSsInBillGrmBillBillAccountNumb")
    protected String inBillGrpSsInBillGrmBillBillAccountNumb;
    @XmlElement(name = "InBillGrpSsInBillGrmBillBillAmount", required = true)
    protected BigDecimal inBillGrpSsInBillGrmBillBillAmount;
    @XmlElement(name = "InBillGrpSsInBillGrmBillBillBarcode")
    protected String inBillGrpSsInBillGrmBillBillBarcode;
    @XmlElement(name = "InBillGrpSsInBillGrmBillBillBranchCode")
    protected String inBillGrpSsInBillGrmBillBillBranchCode;
    @XmlElement(name = "InBillGrpSsInBillGrmBillBillCheckDigit")
    protected short inBillGrpSsInBillGrmBillBillCheckDigit;
    @XmlElement(name = "InBillGrpSsInBillGrmBillBillClrtypeFlag")
    protected String inBillGrpSsInBillGrmBillBillClrtypeFlag;
    @XmlElement(name = "InBillGrpSsInBillGrmBillBillCollYieldPerc", required = true)
    protected BigDecimal inBillGrpSsInBillGrmBillBillCollYieldPerc;
    @XmlElement(name = "InBillGrpSsInBillGrmBillBillCommDiscount", required = true)
    protected BigDecimal inBillGrpSsInBillGrmBillBillCommDiscount;
    @XmlElement(name = "InBillGrpSsInBillGrmBillBillCraccAvldt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBillGrpSsInBillGrmBillBillCraccAvldt;
    @XmlElement(name = "InBillGrpSsInBillGrmBillBillCrAccCd")
    protected short inBillGrpSsInBillGrmBillBillCrAccCd;
    @XmlElement(name = "InBillGrpSsInBillGrmBillBillCraccIntdt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBillGrpSsInBillGrmBillBillCraccIntdt;
    @XmlElement(name = "InBillGrpSsInBillGrmBillBillCraccJustif")
    protected int inBillGrpSsInBillGrmBillBillCraccJustif;
    @XmlElement(name = "InBillGrpSsInBillGrmBillBillCrAccNumber")
    protected String inBillGrpSsInBillGrmBillBillCrAccNumber;
    @XmlElement(name = "InBillGrpSsInBillGrmBillBillCraccPrfsys")
    protected short inBillGrpSsInBillGrmBillBillCraccPrfsys;
    @XmlElement(name = "InBillGrpSsInBillGrmBillBillExpaccCd")
    protected short inBillGrpSsInBillGrmBillBillExpaccCd;
    @XmlElement(name = "InBillGrpSsInBillGrmBillBillExpaccNumber")
    protected String inBillGrpSsInBillGrmBillBillExpaccNumber;
    @XmlElement(name = "InBillGrpSsInBillGrmBillBillExpaccPrfsys")
    protected short inBillGrpSsInBillGrmBillBillExpaccPrfsys;
    @XmlElement(name = "InBillGrpSsInBillGrmBillBillExpDiscount", required = true)
    protected BigDecimal inBillGrpSsInBillGrmBillBillExpDiscount;
    @XmlElement(name = "InBillGrpSsInBillGrmBillBillExpInterdate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBillGrpSsInBillGrmBillBillExpInterdate;
    @XmlElement(name = "InBillGrpSsInBillGrmBillBillIbanCode")
    protected String inBillGrpSsInBillGrmBillBillIbanCode;
    @XmlElement(name = "InBillGrpSsInBillGrmBillBillIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBillGrpSsInBillGrmBillBillIssueDate;
    @XmlElement(name = "InBillGrpSsInBillGrmBillBillJustificId")
    protected int inBillGrpSsInBillGrmBillBillJustificId;
    @XmlElement(name = "InBillGrpSsInBillGrmBillBillNumber")
    protected String inBillGrpSsInBillGrmBillBillNumber;
    @XmlElement(name = "InBillGrpSsInBillGrmBillBillOwnbankFlag")
    protected String inBillGrpSsInBillGrmBillBillOwnbankFlag;
    @XmlElement(name = "InBillGrpSsInBillGrmBillBillProductId")
    protected int inBillGrpSsInBillGrmBillBillProductId;
    @XmlElement(name = "InBillGrpSsInBillGrmBillBillSerialNum")
    protected double inBillGrpSsInBillGrmBillBillSerialNum;
    @XmlElement(name = "InBillGrpSsInBillGrmBillBillSpecialChars")
    protected String inBillGrpSsInBillGrmBillBillSpecialChars;
    @XmlElement(name = "InBillGrpSsInBillGrmBillBillTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBillGrpSsInBillGrmBillBillTmstamp;
    @XmlElement(name = "InBillGrpSsInBillGrmBillBillTypeFlag")
    protected String inBillGrpSsInBillGrmBillBillTypeFlag;
    @XmlElement(name = "InBillGrpSsInBillGrmBillClrAgentCode")
    protected int inBillGrpSsInBillGrmBillClrAgentCode;
    @XmlElement(name = "InBillGrpSsInBillGrmBillComments")
    protected String inBillGrpSsInBillGrmBillComments;
    @XmlElement(name = "InBillGrpSsInBillGrmBillCpAgreementNo")
    protected double inBillGrpSsInBillGrmBillCpAgreementNo;
    @XmlElement(name = "InBillGrpSsInBillGrmBillCpDataField1")
    protected String inBillGrpSsInBillGrmBillCpDataField1;
    @XmlElement(name = "InBillGrpSsInBillGrmBillCpDataField2")
    protected String inBillGrpSsInBillGrmBillCpDataField2;
    @XmlElement(name = "InBillGrpSsInBillGrmBillCpDataField3")
    protected String inBillGrpSsInBillGrmBillCpDataField3;
    @XmlElement(name = "InBillGrpSsInBillGrmBillCpDataField4")
    protected String inBillGrpSsInBillGrmBillCpDataField4;
    @XmlElement(name = "InBillGrpSsInGrmBillIssuerBissCode")
    protected int inBillGrpSsInGrmBillIssuerBissCode;
    @XmlElement(name = "InBillGrpSsInGrmCollaborationBanksBankId")
    protected int inBillGrpSsInGrmCollaborationBanksBankId;
    @XmlElement(name = "InBillGrpSsInBillGrmBillBillCodeline")
    protected String inBillGrpSsInBillGrmBillBillCodeline;

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillBillAccountNumb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillGrpSsInBillGrmBillBillAccountNumb() {
        return inBillGrpSsInBillGrmBillBillAccountNumb;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillBillAccountNumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillGrpSsInBillGrmBillBillAccountNumb(String value) {
        this.inBillGrpSsInBillGrmBillBillAccountNumb = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillBillAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInBillGrpSsInBillGrmBillBillAmount() {
        return inBillGrpSsInBillGrmBillBillAmount;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillBillAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInBillGrpSsInBillGrmBillBillAmount(BigDecimal value) {
        this.inBillGrpSsInBillGrmBillBillAmount = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillBillBarcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillGrpSsInBillGrmBillBillBarcode() {
        return inBillGrpSsInBillGrmBillBillBarcode;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillBillBarcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillGrpSsInBillGrmBillBillBarcode(String value) {
        this.inBillGrpSsInBillGrmBillBillBarcode = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillBillBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillGrpSsInBillGrmBillBillBranchCode() {
        return inBillGrpSsInBillGrmBillBillBranchCode;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillBillBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillGrpSsInBillGrmBillBillBranchCode(String value) {
        this.inBillGrpSsInBillGrmBillBillBranchCode = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillBillCheckDigit property.
     * 
     */
    public short getInBillGrpSsInBillGrmBillBillCheckDigit() {
        return inBillGrpSsInBillGrmBillBillCheckDigit;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillBillCheckDigit property.
     * 
     */
    public void setInBillGrpSsInBillGrmBillBillCheckDigit(short value) {
        this.inBillGrpSsInBillGrmBillBillCheckDigit = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillBillClrtypeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillGrpSsInBillGrmBillBillClrtypeFlag() {
        return inBillGrpSsInBillGrmBillBillClrtypeFlag;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillBillClrtypeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillGrpSsInBillGrmBillBillClrtypeFlag(String value) {
        this.inBillGrpSsInBillGrmBillBillClrtypeFlag = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillBillCollYieldPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInBillGrpSsInBillGrmBillBillCollYieldPerc() {
        return inBillGrpSsInBillGrmBillBillCollYieldPerc;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillBillCollYieldPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInBillGrpSsInBillGrmBillBillCollYieldPerc(BigDecimal value) {
        this.inBillGrpSsInBillGrmBillBillCollYieldPerc = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillBillCommDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInBillGrpSsInBillGrmBillBillCommDiscount() {
        return inBillGrpSsInBillGrmBillBillCommDiscount;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillBillCommDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInBillGrpSsInBillGrmBillBillCommDiscount(BigDecimal value) {
        this.inBillGrpSsInBillGrmBillBillCommDiscount = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillBillCraccAvldt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBillGrpSsInBillGrmBillBillCraccAvldt() {
        return inBillGrpSsInBillGrmBillBillCraccAvldt;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillBillCraccAvldt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBillGrpSsInBillGrmBillBillCraccAvldt(XMLGregorianCalendar value) {
        this.inBillGrpSsInBillGrmBillBillCraccAvldt = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillBillCrAccCd property.
     * 
     */
    public short getInBillGrpSsInBillGrmBillBillCrAccCd() {
        return inBillGrpSsInBillGrmBillBillCrAccCd;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillBillCrAccCd property.
     * 
     */
    public void setInBillGrpSsInBillGrmBillBillCrAccCd(short value) {
        this.inBillGrpSsInBillGrmBillBillCrAccCd = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillBillCraccIntdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBillGrpSsInBillGrmBillBillCraccIntdt() {
        return inBillGrpSsInBillGrmBillBillCraccIntdt;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillBillCraccIntdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBillGrpSsInBillGrmBillBillCraccIntdt(XMLGregorianCalendar value) {
        this.inBillGrpSsInBillGrmBillBillCraccIntdt = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillBillCraccJustif property.
     * 
     */
    public int getInBillGrpSsInBillGrmBillBillCraccJustif() {
        return inBillGrpSsInBillGrmBillBillCraccJustif;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillBillCraccJustif property.
     * 
     */
    public void setInBillGrpSsInBillGrmBillBillCraccJustif(int value) {
        this.inBillGrpSsInBillGrmBillBillCraccJustif = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillBillCrAccNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillGrpSsInBillGrmBillBillCrAccNumber() {
        return inBillGrpSsInBillGrmBillBillCrAccNumber;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillBillCrAccNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillGrpSsInBillGrmBillBillCrAccNumber(String value) {
        this.inBillGrpSsInBillGrmBillBillCrAccNumber = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillBillCraccPrfsys property.
     * 
     */
    public short getInBillGrpSsInBillGrmBillBillCraccPrfsys() {
        return inBillGrpSsInBillGrmBillBillCraccPrfsys;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillBillCraccPrfsys property.
     * 
     */
    public void setInBillGrpSsInBillGrmBillBillCraccPrfsys(short value) {
        this.inBillGrpSsInBillGrmBillBillCraccPrfsys = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillBillExpaccCd property.
     * 
     */
    public short getInBillGrpSsInBillGrmBillBillExpaccCd() {
        return inBillGrpSsInBillGrmBillBillExpaccCd;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillBillExpaccCd property.
     * 
     */
    public void setInBillGrpSsInBillGrmBillBillExpaccCd(short value) {
        this.inBillGrpSsInBillGrmBillBillExpaccCd = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillBillExpaccNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillGrpSsInBillGrmBillBillExpaccNumber() {
        return inBillGrpSsInBillGrmBillBillExpaccNumber;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillBillExpaccNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillGrpSsInBillGrmBillBillExpaccNumber(String value) {
        this.inBillGrpSsInBillGrmBillBillExpaccNumber = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillBillExpaccPrfsys property.
     * 
     */
    public short getInBillGrpSsInBillGrmBillBillExpaccPrfsys() {
        return inBillGrpSsInBillGrmBillBillExpaccPrfsys;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillBillExpaccPrfsys property.
     * 
     */
    public void setInBillGrpSsInBillGrmBillBillExpaccPrfsys(short value) {
        this.inBillGrpSsInBillGrmBillBillExpaccPrfsys = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillBillExpDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInBillGrpSsInBillGrmBillBillExpDiscount() {
        return inBillGrpSsInBillGrmBillBillExpDiscount;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillBillExpDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInBillGrpSsInBillGrmBillBillExpDiscount(BigDecimal value) {
        this.inBillGrpSsInBillGrmBillBillExpDiscount = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillBillExpInterdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBillGrpSsInBillGrmBillBillExpInterdate() {
        return inBillGrpSsInBillGrmBillBillExpInterdate;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillBillExpInterdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBillGrpSsInBillGrmBillBillExpInterdate(XMLGregorianCalendar value) {
        this.inBillGrpSsInBillGrmBillBillExpInterdate = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillBillIbanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillGrpSsInBillGrmBillBillIbanCode() {
        return inBillGrpSsInBillGrmBillBillIbanCode;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillBillIbanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillGrpSsInBillGrmBillBillIbanCode(String value) {
        this.inBillGrpSsInBillGrmBillBillIbanCode = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillBillIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBillGrpSsInBillGrmBillBillIssueDate() {
        return inBillGrpSsInBillGrmBillBillIssueDate;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillBillIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBillGrpSsInBillGrmBillBillIssueDate(XMLGregorianCalendar value) {
        this.inBillGrpSsInBillGrmBillBillIssueDate = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillBillJustificId property.
     * 
     */
    public int getInBillGrpSsInBillGrmBillBillJustificId() {
        return inBillGrpSsInBillGrmBillBillJustificId;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillBillJustificId property.
     * 
     */
    public void setInBillGrpSsInBillGrmBillBillJustificId(int value) {
        this.inBillGrpSsInBillGrmBillBillJustificId = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillBillNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillGrpSsInBillGrmBillBillNumber() {
        return inBillGrpSsInBillGrmBillBillNumber;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillBillNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillGrpSsInBillGrmBillBillNumber(String value) {
        this.inBillGrpSsInBillGrmBillBillNumber = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillBillOwnbankFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillGrpSsInBillGrmBillBillOwnbankFlag() {
        return inBillGrpSsInBillGrmBillBillOwnbankFlag;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillBillOwnbankFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillGrpSsInBillGrmBillBillOwnbankFlag(String value) {
        this.inBillGrpSsInBillGrmBillBillOwnbankFlag = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillBillProductId property.
     * 
     */
    public int getInBillGrpSsInBillGrmBillBillProductId() {
        return inBillGrpSsInBillGrmBillBillProductId;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillBillProductId property.
     * 
     */
    public void setInBillGrpSsInBillGrmBillBillProductId(int value) {
        this.inBillGrpSsInBillGrmBillBillProductId = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillBillSerialNum property.
     * 
     */
    public double getInBillGrpSsInBillGrmBillBillSerialNum() {
        return inBillGrpSsInBillGrmBillBillSerialNum;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillBillSerialNum property.
     * 
     */
    public void setInBillGrpSsInBillGrmBillBillSerialNum(double value) {
        this.inBillGrpSsInBillGrmBillBillSerialNum = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillBillSpecialChars property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillGrpSsInBillGrmBillBillSpecialChars() {
        return inBillGrpSsInBillGrmBillBillSpecialChars;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillBillSpecialChars property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillGrpSsInBillGrmBillBillSpecialChars(String value) {
        this.inBillGrpSsInBillGrmBillBillSpecialChars = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillBillTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBillGrpSsInBillGrmBillBillTmstamp() {
        return inBillGrpSsInBillGrmBillBillTmstamp;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillBillTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBillGrpSsInBillGrmBillBillTmstamp(XMLGregorianCalendar value) {
        this.inBillGrpSsInBillGrmBillBillTmstamp = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillBillTypeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillGrpSsInBillGrmBillBillTypeFlag() {
        return inBillGrpSsInBillGrmBillBillTypeFlag;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillBillTypeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillGrpSsInBillGrmBillBillTypeFlag(String value) {
        this.inBillGrpSsInBillGrmBillBillTypeFlag = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillClrAgentCode property.
     * 
     */
    public int getInBillGrpSsInBillGrmBillClrAgentCode() {
        return inBillGrpSsInBillGrmBillClrAgentCode;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillClrAgentCode property.
     * 
     */
    public void setInBillGrpSsInBillGrmBillClrAgentCode(int value) {
        this.inBillGrpSsInBillGrmBillClrAgentCode = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillGrpSsInBillGrmBillComments() {
        return inBillGrpSsInBillGrmBillComments;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillGrpSsInBillGrmBillComments(String value) {
        this.inBillGrpSsInBillGrmBillComments = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillCpAgreementNo property.
     * 
     */
    public double getInBillGrpSsInBillGrmBillCpAgreementNo() {
        return inBillGrpSsInBillGrmBillCpAgreementNo;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillCpAgreementNo property.
     * 
     */
    public void setInBillGrpSsInBillGrmBillCpAgreementNo(double value) {
        this.inBillGrpSsInBillGrmBillCpAgreementNo = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillCpDataField1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillGrpSsInBillGrmBillCpDataField1() {
        return inBillGrpSsInBillGrmBillCpDataField1;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillCpDataField1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillGrpSsInBillGrmBillCpDataField1(String value) {
        this.inBillGrpSsInBillGrmBillCpDataField1 = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillCpDataField2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillGrpSsInBillGrmBillCpDataField2() {
        return inBillGrpSsInBillGrmBillCpDataField2;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillCpDataField2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillGrpSsInBillGrmBillCpDataField2(String value) {
        this.inBillGrpSsInBillGrmBillCpDataField2 = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillCpDataField3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillGrpSsInBillGrmBillCpDataField3() {
        return inBillGrpSsInBillGrmBillCpDataField3;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillCpDataField3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillGrpSsInBillGrmBillCpDataField3(String value) {
        this.inBillGrpSsInBillGrmBillCpDataField3 = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillCpDataField4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillGrpSsInBillGrmBillCpDataField4() {
        return inBillGrpSsInBillGrmBillCpDataField4;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillCpDataField4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillGrpSsInBillGrmBillCpDataField4(String value) {
        this.inBillGrpSsInBillGrmBillCpDataField4 = value;
    }

    /**
     * Gets the value of the inBillGrpSsInGrmBillIssuerBissCode property.
     * 
     */
    public int getInBillGrpSsInGrmBillIssuerBissCode() {
        return inBillGrpSsInGrmBillIssuerBissCode;
    }

    /**
     * Sets the value of the inBillGrpSsInGrmBillIssuerBissCode property.
     * 
     */
    public void setInBillGrpSsInGrmBillIssuerBissCode(int value) {
        this.inBillGrpSsInGrmBillIssuerBissCode = value;
    }

    /**
     * Gets the value of the inBillGrpSsInGrmCollaborationBanksBankId property.
     * 
     */
    public int getInBillGrpSsInGrmCollaborationBanksBankId() {
        return inBillGrpSsInGrmCollaborationBanksBankId;
    }

    /**
     * Sets the value of the inBillGrpSsInGrmCollaborationBanksBankId property.
     * 
     */
    public void setInBillGrpSsInGrmCollaborationBanksBankId(int value) {
        this.inBillGrpSsInGrmCollaborationBanksBankId = value;
    }

    /**
     * Gets the value of the inBillGrpSsInBillGrmBillBillCodeline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillGrpSsInBillGrmBillBillCodeline() {
        return inBillGrpSsInBillGrmBillBillCodeline;
    }

    /**
     * Sets the value of the inBillGrpSsInBillGrmBillBillCodeline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillGrpSsInBillGrmBillBillCodeline(String value) {
        this.inBillGrpSsInBillGrmBillBillCodeline = value;
    }

}
