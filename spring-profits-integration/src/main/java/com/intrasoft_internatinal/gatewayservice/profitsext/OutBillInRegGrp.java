
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutBillInRegGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutBillInRegGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillBillAccountNumb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillBillAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillBillBarcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillBillBranchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillBillCheckDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillBillClrtypeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillBillCollSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillBillCommDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillBillCraccAvldt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillBillCraccIntdt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillBillExpaccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillBillExpaccNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillBillExpaccPrfsys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillBillExpDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillBillExpInterdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillBillIbanCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillBillIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillBillJustificId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillBillNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillBillOwnbankFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillBillSerialNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillBillSpecialChars" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillBillStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillBillTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillBillTypeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillClrAgentCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillCpAgreementNo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillCpDataField1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillCpDataField2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillCpDataField3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillCpDataField4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillGroupBgrpSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillIssuerBissCdigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillIssuerBissCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillIssuerBissIdInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillIssuerBissTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmCollaborationBanksBankId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmCollaborationBanksBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillInRegGrpOutSelectedbIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillAccConvRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillExpConvertedAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillExpFxftTunSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillExpConvRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBillInRegGrpOutBillInRegGrmBillAccConvertedAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutBillInRegGrp", propOrder = {
    "outBillInRegGrpOutBillInRegGrmBillBillAccountNumb",
    "outBillInRegGrpOutBillInRegGrmBillBillAmount",
    "outBillInRegGrpOutBillInRegGrmBillBillBarcode",
    "outBillInRegGrpOutBillInRegGrmBillBillBranchCode",
    "outBillInRegGrpOutBillInRegGrmBillBillCheckDigit",
    "outBillInRegGrpOutBillInRegGrmBillBillClrtypeFlag",
    "outBillInRegGrpOutBillInRegGrmBillBillCollSn",
    "outBillInRegGrpOutBillInRegGrmBillBillCommDiscount",
    "outBillInRegGrpOutBillInRegGrmBillBillCraccAvldt",
    "outBillInRegGrpOutBillInRegGrmBillBillCraccIntdt",
    "outBillInRegGrpOutBillInRegGrmBillBillExpaccCd",
    "outBillInRegGrpOutBillInRegGrmBillBillExpaccNumber",
    "outBillInRegGrpOutBillInRegGrmBillBillExpaccPrfsys",
    "outBillInRegGrpOutBillInRegGrmBillBillExpDiscount",
    "outBillInRegGrpOutBillInRegGrmBillBillExpInterdate",
    "outBillInRegGrpOutBillInRegGrmBillBillIbanCode",
    "outBillInRegGrpOutBillInRegGrmBillBillIssueDate",
    "outBillInRegGrpOutBillInRegGrmBillBillJustificId",
    "outBillInRegGrpOutBillInRegGrmBillBillNumber",
    "outBillInRegGrpOutBillInRegGrmBillBillOwnbankFlag",
    "outBillInRegGrpOutBillInRegGrmBillBillSerialNum",
    "outBillInRegGrpOutBillInRegGrmBillBillSpecialChars",
    "outBillInRegGrpOutBillInRegGrmBillBillStatusFlag",
    "outBillInRegGrpOutBillInRegGrmBillBillTmstamp",
    "outBillInRegGrpOutBillInRegGrmBillBillTypeFlag",
    "outBillInRegGrpOutBillInRegGrmBillClrAgentCode",
    "outBillInRegGrpOutBillInRegGrmBillComments",
    "outBillInRegGrpOutBillInRegGrmBillCpAgreementNo",
    "outBillInRegGrpOutBillInRegGrmBillCpDataField1",
    "outBillInRegGrpOutBillInRegGrmBillCpDataField2",
    "outBillInRegGrpOutBillInRegGrmBillCpDataField3",
    "outBillInRegGrpOutBillInRegGrmBillCpDataField4",
    "outBillInRegGrpOutBillInRegGrmBillGroupBgrpSerialNum",
    "outBillInRegGrpOutBillInRegGrmBillIssuerBissCdigit",
    "outBillInRegGrpOutBillInRegGrmBillIssuerBissCode",
    "outBillInRegGrpOutBillInRegGrmBillIssuerBissIdInfo",
    "outBillInRegGrpOutBillInRegGrmBillIssuerBissTitle",
    "outBillInRegGrpOutBillInRegGrmCollaborationBanksBankId",
    "outBillInRegGrpOutBillInRegGrmCollaborationBanksBankName",
    "outBillInRegGrpOutSelectedbIefSuppliedSelectChar",
    "outBillInRegGrpOutBillInRegGrmBillAccConvRate",
    "outBillInRegGrpOutBillInRegGrmBillExpConvertedAmnt",
    "outBillInRegGrpOutBillInRegGrmBillExpFxftTunSn",
    "outBillInRegGrpOutBillInRegGrmBillExpConvRate",
    "outBillInRegGrpOutBillInRegGrmBillAccConvertedAmnt"
})
public class OutBillInRegGrp {

    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillBillAccountNumb")
    protected String outBillInRegGrpOutBillInRegGrmBillBillAccountNumb;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillBillAmount", required = true)
    protected BigDecimal outBillInRegGrpOutBillInRegGrmBillBillAmount;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillBillBarcode")
    protected String outBillInRegGrpOutBillInRegGrmBillBillBarcode;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillBillBranchCode")
    protected String outBillInRegGrpOutBillInRegGrmBillBillBranchCode;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillBillCheckDigit")
    protected short outBillInRegGrpOutBillInRegGrmBillBillCheckDigit;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillBillClrtypeFlag")
    protected String outBillInRegGrpOutBillInRegGrmBillBillClrtypeFlag;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillBillCollSn")
    protected double outBillInRegGrpOutBillInRegGrmBillBillCollSn;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillBillCommDiscount", required = true)
    protected BigDecimal outBillInRegGrpOutBillInRegGrmBillBillCommDiscount;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillBillCraccAvldt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBillInRegGrpOutBillInRegGrmBillBillCraccAvldt;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillBillCraccIntdt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBillInRegGrpOutBillInRegGrmBillBillCraccIntdt;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillBillExpaccCd")
    protected short outBillInRegGrpOutBillInRegGrmBillBillExpaccCd;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillBillExpaccNumber")
    protected String outBillInRegGrpOutBillInRegGrmBillBillExpaccNumber;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillBillExpaccPrfsys")
    protected short outBillInRegGrpOutBillInRegGrmBillBillExpaccPrfsys;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillBillExpDiscount", required = true)
    protected BigDecimal outBillInRegGrpOutBillInRegGrmBillBillExpDiscount;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillBillExpInterdate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBillInRegGrpOutBillInRegGrmBillBillExpInterdate;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillBillIbanCode")
    protected String outBillInRegGrpOutBillInRegGrmBillBillIbanCode;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillBillIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBillInRegGrpOutBillInRegGrmBillBillIssueDate;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillBillJustificId")
    protected int outBillInRegGrpOutBillInRegGrmBillBillJustificId;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillBillNumber")
    protected String outBillInRegGrpOutBillInRegGrmBillBillNumber;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillBillOwnbankFlag")
    protected String outBillInRegGrpOutBillInRegGrmBillBillOwnbankFlag;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillBillSerialNum")
    protected double outBillInRegGrpOutBillInRegGrmBillBillSerialNum;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillBillSpecialChars")
    protected String outBillInRegGrpOutBillInRegGrmBillBillSpecialChars;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillBillStatusFlag")
    protected String outBillInRegGrpOutBillInRegGrmBillBillStatusFlag;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillBillTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBillInRegGrpOutBillInRegGrmBillBillTmstamp;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillBillTypeFlag")
    protected String outBillInRegGrpOutBillInRegGrmBillBillTypeFlag;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillClrAgentCode")
    protected int outBillInRegGrpOutBillInRegGrmBillClrAgentCode;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillComments")
    protected String outBillInRegGrpOutBillInRegGrmBillComments;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillCpAgreementNo")
    protected double outBillInRegGrpOutBillInRegGrmBillCpAgreementNo;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillCpDataField1")
    protected String outBillInRegGrpOutBillInRegGrmBillCpDataField1;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillCpDataField2")
    protected String outBillInRegGrpOutBillInRegGrmBillCpDataField2;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillCpDataField3")
    protected String outBillInRegGrpOutBillInRegGrmBillCpDataField3;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillCpDataField4")
    protected String outBillInRegGrpOutBillInRegGrmBillCpDataField4;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillGroupBgrpSerialNum")
    protected short outBillInRegGrpOutBillInRegGrmBillGroupBgrpSerialNum;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillIssuerBissCdigit")
    protected short outBillInRegGrpOutBillInRegGrmBillIssuerBissCdigit;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillIssuerBissCode")
    protected int outBillInRegGrpOutBillInRegGrmBillIssuerBissCode;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillIssuerBissIdInfo")
    protected String outBillInRegGrpOutBillInRegGrmBillIssuerBissIdInfo;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillIssuerBissTitle")
    protected String outBillInRegGrpOutBillInRegGrmBillIssuerBissTitle;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmCollaborationBanksBankId")
    protected int outBillInRegGrpOutBillInRegGrmCollaborationBanksBankId;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmCollaborationBanksBankName")
    protected String outBillInRegGrpOutBillInRegGrmCollaborationBanksBankName;
    @XmlElement(name = "OutBillInRegGrpOutSelectedbIefSuppliedSelectChar")
    protected String outBillInRegGrpOutSelectedbIefSuppliedSelectChar;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillAccConvRate", required = true)
    protected BigDecimal outBillInRegGrpOutBillInRegGrmBillAccConvRate;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillExpConvertedAmnt", required = true)
    protected BigDecimal outBillInRegGrpOutBillInRegGrmBillExpConvertedAmnt;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillExpFxftTunSn")
    protected int outBillInRegGrpOutBillInRegGrmBillExpFxftTunSn;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillExpConvRate", required = true)
    protected BigDecimal outBillInRegGrpOutBillInRegGrmBillExpConvRate;
    @XmlElement(name = "OutBillInRegGrpOutBillInRegGrmBillAccConvertedAmnt", required = true)
    protected BigDecimal outBillInRegGrpOutBillInRegGrmBillAccConvertedAmnt;

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillBillAccountNumb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillInRegGrpOutBillInRegGrmBillBillAccountNumb() {
        return outBillInRegGrpOutBillInRegGrmBillBillAccountNumb;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillBillAccountNumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillBillAccountNumb(String value) {
        this.outBillInRegGrpOutBillInRegGrmBillBillAccountNumb = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillBillAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBillInRegGrpOutBillInRegGrmBillBillAmount() {
        return outBillInRegGrpOutBillInRegGrmBillBillAmount;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillBillAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillBillAmount(BigDecimal value) {
        this.outBillInRegGrpOutBillInRegGrmBillBillAmount = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillBillBarcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillInRegGrpOutBillInRegGrmBillBillBarcode() {
        return outBillInRegGrpOutBillInRegGrmBillBillBarcode;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillBillBarcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillBillBarcode(String value) {
        this.outBillInRegGrpOutBillInRegGrmBillBillBarcode = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillBillBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillInRegGrpOutBillInRegGrmBillBillBranchCode() {
        return outBillInRegGrpOutBillInRegGrmBillBillBranchCode;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillBillBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillBillBranchCode(String value) {
        this.outBillInRegGrpOutBillInRegGrmBillBillBranchCode = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillBillCheckDigit property.
     * 
     */
    public short getOutBillInRegGrpOutBillInRegGrmBillBillCheckDigit() {
        return outBillInRegGrpOutBillInRegGrmBillBillCheckDigit;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillBillCheckDigit property.
     * 
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillBillCheckDigit(short value) {
        this.outBillInRegGrpOutBillInRegGrmBillBillCheckDigit = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillBillClrtypeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillInRegGrpOutBillInRegGrmBillBillClrtypeFlag() {
        return outBillInRegGrpOutBillInRegGrmBillBillClrtypeFlag;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillBillClrtypeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillBillClrtypeFlag(String value) {
        this.outBillInRegGrpOutBillInRegGrmBillBillClrtypeFlag = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillBillCollSn property.
     * 
     */
    public double getOutBillInRegGrpOutBillInRegGrmBillBillCollSn() {
        return outBillInRegGrpOutBillInRegGrmBillBillCollSn;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillBillCollSn property.
     * 
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillBillCollSn(double value) {
        this.outBillInRegGrpOutBillInRegGrmBillBillCollSn = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillBillCommDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBillInRegGrpOutBillInRegGrmBillBillCommDiscount() {
        return outBillInRegGrpOutBillInRegGrmBillBillCommDiscount;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillBillCommDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillBillCommDiscount(BigDecimal value) {
        this.outBillInRegGrpOutBillInRegGrmBillBillCommDiscount = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillBillCraccAvldt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBillInRegGrpOutBillInRegGrmBillBillCraccAvldt() {
        return outBillInRegGrpOutBillInRegGrmBillBillCraccAvldt;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillBillCraccAvldt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillBillCraccAvldt(XMLGregorianCalendar value) {
        this.outBillInRegGrpOutBillInRegGrmBillBillCraccAvldt = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillBillCraccIntdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBillInRegGrpOutBillInRegGrmBillBillCraccIntdt() {
        return outBillInRegGrpOutBillInRegGrmBillBillCraccIntdt;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillBillCraccIntdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillBillCraccIntdt(XMLGregorianCalendar value) {
        this.outBillInRegGrpOutBillInRegGrmBillBillCraccIntdt = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillBillExpaccCd property.
     * 
     */
    public short getOutBillInRegGrpOutBillInRegGrmBillBillExpaccCd() {
        return outBillInRegGrpOutBillInRegGrmBillBillExpaccCd;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillBillExpaccCd property.
     * 
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillBillExpaccCd(short value) {
        this.outBillInRegGrpOutBillInRegGrmBillBillExpaccCd = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillBillExpaccNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillInRegGrpOutBillInRegGrmBillBillExpaccNumber() {
        return outBillInRegGrpOutBillInRegGrmBillBillExpaccNumber;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillBillExpaccNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillBillExpaccNumber(String value) {
        this.outBillInRegGrpOutBillInRegGrmBillBillExpaccNumber = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillBillExpaccPrfsys property.
     * 
     */
    public short getOutBillInRegGrpOutBillInRegGrmBillBillExpaccPrfsys() {
        return outBillInRegGrpOutBillInRegGrmBillBillExpaccPrfsys;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillBillExpaccPrfsys property.
     * 
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillBillExpaccPrfsys(short value) {
        this.outBillInRegGrpOutBillInRegGrmBillBillExpaccPrfsys = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillBillExpDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBillInRegGrpOutBillInRegGrmBillBillExpDiscount() {
        return outBillInRegGrpOutBillInRegGrmBillBillExpDiscount;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillBillExpDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillBillExpDiscount(BigDecimal value) {
        this.outBillInRegGrpOutBillInRegGrmBillBillExpDiscount = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillBillExpInterdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBillInRegGrpOutBillInRegGrmBillBillExpInterdate() {
        return outBillInRegGrpOutBillInRegGrmBillBillExpInterdate;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillBillExpInterdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillBillExpInterdate(XMLGregorianCalendar value) {
        this.outBillInRegGrpOutBillInRegGrmBillBillExpInterdate = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillBillIbanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillInRegGrpOutBillInRegGrmBillBillIbanCode() {
        return outBillInRegGrpOutBillInRegGrmBillBillIbanCode;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillBillIbanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillBillIbanCode(String value) {
        this.outBillInRegGrpOutBillInRegGrmBillBillIbanCode = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillBillIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBillInRegGrpOutBillInRegGrmBillBillIssueDate() {
        return outBillInRegGrpOutBillInRegGrmBillBillIssueDate;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillBillIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillBillIssueDate(XMLGregorianCalendar value) {
        this.outBillInRegGrpOutBillInRegGrmBillBillIssueDate = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillBillJustificId property.
     * 
     */
    public int getOutBillInRegGrpOutBillInRegGrmBillBillJustificId() {
        return outBillInRegGrpOutBillInRegGrmBillBillJustificId;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillBillJustificId property.
     * 
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillBillJustificId(int value) {
        this.outBillInRegGrpOutBillInRegGrmBillBillJustificId = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillBillNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillInRegGrpOutBillInRegGrmBillBillNumber() {
        return outBillInRegGrpOutBillInRegGrmBillBillNumber;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillBillNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillBillNumber(String value) {
        this.outBillInRegGrpOutBillInRegGrmBillBillNumber = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillBillOwnbankFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillInRegGrpOutBillInRegGrmBillBillOwnbankFlag() {
        return outBillInRegGrpOutBillInRegGrmBillBillOwnbankFlag;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillBillOwnbankFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillBillOwnbankFlag(String value) {
        this.outBillInRegGrpOutBillInRegGrmBillBillOwnbankFlag = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillBillSerialNum property.
     * 
     */
    public double getOutBillInRegGrpOutBillInRegGrmBillBillSerialNum() {
        return outBillInRegGrpOutBillInRegGrmBillBillSerialNum;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillBillSerialNum property.
     * 
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillBillSerialNum(double value) {
        this.outBillInRegGrpOutBillInRegGrmBillBillSerialNum = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillBillSpecialChars property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillInRegGrpOutBillInRegGrmBillBillSpecialChars() {
        return outBillInRegGrpOutBillInRegGrmBillBillSpecialChars;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillBillSpecialChars property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillBillSpecialChars(String value) {
        this.outBillInRegGrpOutBillInRegGrmBillBillSpecialChars = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillBillStatusFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillInRegGrpOutBillInRegGrmBillBillStatusFlag() {
        return outBillInRegGrpOutBillInRegGrmBillBillStatusFlag;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillBillStatusFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillBillStatusFlag(String value) {
        this.outBillInRegGrpOutBillInRegGrmBillBillStatusFlag = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillBillTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBillInRegGrpOutBillInRegGrmBillBillTmstamp() {
        return outBillInRegGrpOutBillInRegGrmBillBillTmstamp;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillBillTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillBillTmstamp(XMLGregorianCalendar value) {
        this.outBillInRegGrpOutBillInRegGrmBillBillTmstamp = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillBillTypeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillInRegGrpOutBillInRegGrmBillBillTypeFlag() {
        return outBillInRegGrpOutBillInRegGrmBillBillTypeFlag;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillBillTypeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillBillTypeFlag(String value) {
        this.outBillInRegGrpOutBillInRegGrmBillBillTypeFlag = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillClrAgentCode property.
     * 
     */
    public int getOutBillInRegGrpOutBillInRegGrmBillClrAgentCode() {
        return outBillInRegGrpOutBillInRegGrmBillClrAgentCode;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillClrAgentCode property.
     * 
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillClrAgentCode(int value) {
        this.outBillInRegGrpOutBillInRegGrmBillClrAgentCode = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillInRegGrpOutBillInRegGrmBillComments() {
        return outBillInRegGrpOutBillInRegGrmBillComments;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillComments(String value) {
        this.outBillInRegGrpOutBillInRegGrmBillComments = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillCpAgreementNo property.
     * 
     */
    public double getOutBillInRegGrpOutBillInRegGrmBillCpAgreementNo() {
        return outBillInRegGrpOutBillInRegGrmBillCpAgreementNo;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillCpAgreementNo property.
     * 
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillCpAgreementNo(double value) {
        this.outBillInRegGrpOutBillInRegGrmBillCpAgreementNo = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillCpDataField1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillInRegGrpOutBillInRegGrmBillCpDataField1() {
        return outBillInRegGrpOutBillInRegGrmBillCpDataField1;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillCpDataField1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillCpDataField1(String value) {
        this.outBillInRegGrpOutBillInRegGrmBillCpDataField1 = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillCpDataField2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillInRegGrpOutBillInRegGrmBillCpDataField2() {
        return outBillInRegGrpOutBillInRegGrmBillCpDataField2;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillCpDataField2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillCpDataField2(String value) {
        this.outBillInRegGrpOutBillInRegGrmBillCpDataField2 = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillCpDataField3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillInRegGrpOutBillInRegGrmBillCpDataField3() {
        return outBillInRegGrpOutBillInRegGrmBillCpDataField3;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillCpDataField3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillCpDataField3(String value) {
        this.outBillInRegGrpOutBillInRegGrmBillCpDataField3 = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillCpDataField4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillInRegGrpOutBillInRegGrmBillCpDataField4() {
        return outBillInRegGrpOutBillInRegGrmBillCpDataField4;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillCpDataField4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillCpDataField4(String value) {
        this.outBillInRegGrpOutBillInRegGrmBillCpDataField4 = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillGroupBgrpSerialNum property.
     * 
     */
    public short getOutBillInRegGrpOutBillInRegGrmBillGroupBgrpSerialNum() {
        return outBillInRegGrpOutBillInRegGrmBillGroupBgrpSerialNum;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillGroupBgrpSerialNum property.
     * 
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillGroupBgrpSerialNum(short value) {
        this.outBillInRegGrpOutBillInRegGrmBillGroupBgrpSerialNum = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillIssuerBissCdigit property.
     * 
     */
    public short getOutBillInRegGrpOutBillInRegGrmBillIssuerBissCdigit() {
        return outBillInRegGrpOutBillInRegGrmBillIssuerBissCdigit;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillIssuerBissCdigit property.
     * 
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillIssuerBissCdigit(short value) {
        this.outBillInRegGrpOutBillInRegGrmBillIssuerBissCdigit = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillIssuerBissCode property.
     * 
     */
    public int getOutBillInRegGrpOutBillInRegGrmBillIssuerBissCode() {
        return outBillInRegGrpOutBillInRegGrmBillIssuerBissCode;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillIssuerBissCode property.
     * 
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillIssuerBissCode(int value) {
        this.outBillInRegGrpOutBillInRegGrmBillIssuerBissCode = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillIssuerBissIdInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillInRegGrpOutBillInRegGrmBillIssuerBissIdInfo() {
        return outBillInRegGrpOutBillInRegGrmBillIssuerBissIdInfo;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillIssuerBissIdInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillIssuerBissIdInfo(String value) {
        this.outBillInRegGrpOutBillInRegGrmBillIssuerBissIdInfo = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillIssuerBissTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillInRegGrpOutBillInRegGrmBillIssuerBissTitle() {
        return outBillInRegGrpOutBillInRegGrmBillIssuerBissTitle;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillIssuerBissTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillIssuerBissTitle(String value) {
        this.outBillInRegGrpOutBillInRegGrmBillIssuerBissTitle = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmCollaborationBanksBankId property.
     * 
     */
    public int getOutBillInRegGrpOutBillInRegGrmCollaborationBanksBankId() {
        return outBillInRegGrpOutBillInRegGrmCollaborationBanksBankId;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmCollaborationBanksBankId property.
     * 
     */
    public void setOutBillInRegGrpOutBillInRegGrmCollaborationBanksBankId(int value) {
        this.outBillInRegGrpOutBillInRegGrmCollaborationBanksBankId = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmCollaborationBanksBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillInRegGrpOutBillInRegGrmCollaborationBanksBankName() {
        return outBillInRegGrpOutBillInRegGrmCollaborationBanksBankName;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmCollaborationBanksBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillInRegGrpOutBillInRegGrmCollaborationBanksBankName(String value) {
        this.outBillInRegGrpOutBillInRegGrmCollaborationBanksBankName = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutSelectedbIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillInRegGrpOutSelectedbIefSuppliedSelectChar() {
        return outBillInRegGrpOutSelectedbIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outBillInRegGrpOutSelectedbIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillInRegGrpOutSelectedbIefSuppliedSelectChar(String value) {
        this.outBillInRegGrpOutSelectedbIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillAccConvRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBillInRegGrpOutBillInRegGrmBillAccConvRate() {
        return outBillInRegGrpOutBillInRegGrmBillAccConvRate;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillAccConvRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillAccConvRate(BigDecimal value) {
        this.outBillInRegGrpOutBillInRegGrmBillAccConvRate = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillExpConvertedAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBillInRegGrpOutBillInRegGrmBillExpConvertedAmnt() {
        return outBillInRegGrpOutBillInRegGrmBillExpConvertedAmnt;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillExpConvertedAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillExpConvertedAmnt(BigDecimal value) {
        this.outBillInRegGrpOutBillInRegGrmBillExpConvertedAmnt = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillExpFxftTunSn property.
     * 
     */
    public int getOutBillInRegGrpOutBillInRegGrmBillExpFxftTunSn() {
        return outBillInRegGrpOutBillInRegGrmBillExpFxftTunSn;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillExpFxftTunSn property.
     * 
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillExpFxftTunSn(int value) {
        this.outBillInRegGrpOutBillInRegGrmBillExpFxftTunSn = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillExpConvRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBillInRegGrpOutBillInRegGrmBillExpConvRate() {
        return outBillInRegGrpOutBillInRegGrmBillExpConvRate;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillExpConvRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillExpConvRate(BigDecimal value) {
        this.outBillInRegGrpOutBillInRegGrmBillExpConvRate = value;
    }

    /**
     * Gets the value of the outBillInRegGrpOutBillInRegGrmBillAccConvertedAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBillInRegGrpOutBillInRegGrmBillAccConvertedAmnt() {
        return outBillInRegGrpOutBillInRegGrmBillAccConvertedAmnt;
    }

    /**
     * Sets the value of the outBillInRegGrpOutBillInRegGrmBillAccConvertedAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBillInRegGrpOutBillInRegGrmBillAccConvertedAmnt(BigDecimal value) {
        this.outBillInRegGrpOutBillInRegGrmBillAccConvertedAmnt = value;
    }

}
