
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for T2160VOutGrpCommitmentItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T2160VOutGrpCommitmentItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpCommitmentOutGrmAccCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCommitmentOutGrmIefSuppliedChar40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCommitmentOutGrmIssCommitmentCrAccCustomerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCommitmentOutGrmIssCommitmentDrAccCustomerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCommitmentOutGrmIssCommitmentEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCommitmentOutGrmIssCommitmentFkCnlUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCommitmentOutGrmIssCommitmentFkFinalizeUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCommitmentOutGrmIssCommitmentFkResponsibleUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCommitmentOutGrmIssCommitmentIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpCommitmentOutGrmIssCommitmentIssueType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpCommitmentOutGrmIssCommitmentLastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpCommitmentOutGrmIssCommitmentLoanProfitsAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCommitmentOutGrmIssCommitmentLoanProfitsCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpCommitmentOutGrmIssCommitmentRenewalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpCommitmentOutGrmIssCommitmentServiceProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCommitmentOutGrmIssCommitmentTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpCommitmentOutGrmIssPremiumCalcAddInstalmAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpCommitmentOutGrmIssPremiumCalcAnnualPremium" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpCommitmentOutGrmIssPremiumCalcLoadingAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpCommitmentOutGrmIssPremiumCalcMonthlyPremium" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpCommitmentOutGrmIssPremiumCalcProrataPremium" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpCommitmentOutGrmIssPremiumCalcRemainingAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpCommitmentOutGrmIssProdDocDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCommitmentOutGrmProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCommitmentOutGrmProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCommitmentOutGrmSelectedCommitmentIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T2160VOutGrpCommitmentItem", propOrder = {
    "outGrpCommitmentOutGrmAccCurrencyShortDescr",
    "outGrpCommitmentOutGrmIefSuppliedChar40",
    "outGrpCommitmentOutGrmIssCommitmentCrAccCustomerId",
    "outGrpCommitmentOutGrmIssCommitmentDrAccCustomerId",
    "outGrpCommitmentOutGrmIssCommitmentEntryStatus",
    "outGrpCommitmentOutGrmIssCommitmentFkCnlUsr",
    "outGrpCommitmentOutGrmIssCommitmentFkFinalizeUsr",
    "outGrpCommitmentOutGrmIssCommitmentFkResponsibleUnit",
    "outGrpCommitmentOutGrmIssCommitmentIssueDate",
    "outGrpCommitmentOutGrmIssCommitmentIssueType",
    "outGrpCommitmentOutGrmIssCommitmentLastUpdateDate",
    "outGrpCommitmentOutGrmIssCommitmentLoanProfitsAcc",
    "outGrpCommitmentOutGrmIssCommitmentLoanProfitsCd",
    "outGrpCommitmentOutGrmIssCommitmentRenewalDate",
    "outGrpCommitmentOutGrmIssCommitmentServiceProduct",
    "outGrpCommitmentOutGrmIssCommitmentTpSoIdentifier",
    "outGrpCommitmentOutGrmIssPremiumCalcAddInstalmAmnt",
    "outGrpCommitmentOutGrmIssPremiumCalcAnnualPremium",
    "outGrpCommitmentOutGrmIssPremiumCalcLoadingAmnt",
    "outGrpCommitmentOutGrmIssPremiumCalcMonthlyPremium",
    "outGrpCommitmentOutGrmIssPremiumCalcProrataPremium",
    "outGrpCommitmentOutGrmIssPremiumCalcRemainingAmnt",
    "outGrpCommitmentOutGrmIssProdDocDescr",
    "outGrpCommitmentOutGrmProductDescription",
    "outGrpCommitmentOutGrmProductIdProduct",
    "outGrpCommitmentOutGrmSelectedCommitmentIefSuppliedSelectChar"
})
public class T2160VOutGrpCommitmentItem {

    @XmlElement(name = "OutGrpCommitmentOutGrmAccCurrencyShortDescr")
    protected String outGrpCommitmentOutGrmAccCurrencyShortDescr;
    @XmlElement(name = "OutGrpCommitmentOutGrmIefSuppliedChar40")
    protected String outGrpCommitmentOutGrmIefSuppliedChar40;
    @XmlElement(name = "OutGrpCommitmentOutGrmIssCommitmentCrAccCustomerId")
    protected int outGrpCommitmentOutGrmIssCommitmentCrAccCustomerId;
    @XmlElement(name = "OutGrpCommitmentOutGrmIssCommitmentDrAccCustomerId")
    protected int outGrpCommitmentOutGrmIssCommitmentDrAccCustomerId;
    @XmlElement(name = "OutGrpCommitmentOutGrmIssCommitmentEntryStatus")
    protected String outGrpCommitmentOutGrmIssCommitmentEntryStatus;
    @XmlElement(name = "OutGrpCommitmentOutGrmIssCommitmentFkCnlUsr")
    protected String outGrpCommitmentOutGrmIssCommitmentFkCnlUsr;
    @XmlElement(name = "OutGrpCommitmentOutGrmIssCommitmentFkFinalizeUsr")
    protected String outGrpCommitmentOutGrmIssCommitmentFkFinalizeUsr;
    @XmlElement(name = "OutGrpCommitmentOutGrmIssCommitmentFkResponsibleUnit")
    protected int outGrpCommitmentOutGrmIssCommitmentFkResponsibleUnit;
    @XmlElement(name = "OutGrpCommitmentOutGrmIssCommitmentIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpCommitmentOutGrmIssCommitmentIssueDate;
    @XmlElement(name = "OutGrpCommitmentOutGrmIssCommitmentIssueType")
    protected short outGrpCommitmentOutGrmIssCommitmentIssueType;
    @XmlElement(name = "OutGrpCommitmentOutGrmIssCommitmentLastUpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpCommitmentOutGrmIssCommitmentLastUpdateDate;
    @XmlElement(name = "OutGrpCommitmentOutGrmIssCommitmentLoanProfitsAcc")
    protected String outGrpCommitmentOutGrmIssCommitmentLoanProfitsAcc;
    @XmlElement(name = "OutGrpCommitmentOutGrmIssCommitmentLoanProfitsCd")
    protected short outGrpCommitmentOutGrmIssCommitmentLoanProfitsCd;
    @XmlElement(name = "OutGrpCommitmentOutGrmIssCommitmentRenewalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpCommitmentOutGrmIssCommitmentRenewalDate;
    @XmlElement(name = "OutGrpCommitmentOutGrmIssCommitmentServiceProduct")
    protected int outGrpCommitmentOutGrmIssCommitmentServiceProduct;
    @XmlElement(name = "OutGrpCommitmentOutGrmIssCommitmentTpSoIdentifier")
    protected double outGrpCommitmentOutGrmIssCommitmentTpSoIdentifier;
    @XmlElement(name = "OutGrpCommitmentOutGrmIssPremiumCalcAddInstalmAmnt", required = true)
    protected BigDecimal outGrpCommitmentOutGrmIssPremiumCalcAddInstalmAmnt;
    @XmlElement(name = "OutGrpCommitmentOutGrmIssPremiumCalcAnnualPremium", required = true)
    protected BigDecimal outGrpCommitmentOutGrmIssPremiumCalcAnnualPremium;
    @XmlElement(name = "OutGrpCommitmentOutGrmIssPremiumCalcLoadingAmnt", required = true)
    protected BigDecimal outGrpCommitmentOutGrmIssPremiumCalcLoadingAmnt;
    @XmlElement(name = "OutGrpCommitmentOutGrmIssPremiumCalcMonthlyPremium", required = true)
    protected BigDecimal outGrpCommitmentOutGrmIssPremiumCalcMonthlyPremium;
    @XmlElement(name = "OutGrpCommitmentOutGrmIssPremiumCalcProrataPremium", required = true)
    protected BigDecimal outGrpCommitmentOutGrmIssPremiumCalcProrataPremium;
    @XmlElement(name = "OutGrpCommitmentOutGrmIssPremiumCalcRemainingAmnt", required = true)
    protected BigDecimal outGrpCommitmentOutGrmIssPremiumCalcRemainingAmnt;
    @XmlElement(name = "OutGrpCommitmentOutGrmIssProdDocDescr")
    protected String outGrpCommitmentOutGrmIssProdDocDescr;
    @XmlElement(name = "OutGrpCommitmentOutGrmProductDescription")
    protected String outGrpCommitmentOutGrmProductDescription;
    @XmlElement(name = "OutGrpCommitmentOutGrmProductIdProduct")
    protected int outGrpCommitmentOutGrmProductIdProduct;
    @XmlElement(name = "OutGrpCommitmentOutGrmSelectedCommitmentIefSuppliedSelectChar")
    protected String outGrpCommitmentOutGrmSelectedCommitmentIefSuppliedSelectChar;

    /**
     * Gets the value of the outGrpCommitmentOutGrmAccCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCommitmentOutGrmAccCurrencyShortDescr() {
        return outGrpCommitmentOutGrmAccCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpCommitmentOutGrmAccCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCommitmentOutGrmAccCurrencyShortDescr(String value) {
        this.outGrpCommitmentOutGrmAccCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGrpCommitmentOutGrmIefSuppliedChar40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCommitmentOutGrmIefSuppliedChar40() {
        return outGrpCommitmentOutGrmIefSuppliedChar40;
    }

    /**
     * Sets the value of the outGrpCommitmentOutGrmIefSuppliedChar40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCommitmentOutGrmIefSuppliedChar40(String value) {
        this.outGrpCommitmentOutGrmIefSuppliedChar40 = value;
    }

    /**
     * Gets the value of the outGrpCommitmentOutGrmIssCommitmentCrAccCustomerId property.
     * 
     */
    public int getOutGrpCommitmentOutGrmIssCommitmentCrAccCustomerId() {
        return outGrpCommitmentOutGrmIssCommitmentCrAccCustomerId;
    }

    /**
     * Sets the value of the outGrpCommitmentOutGrmIssCommitmentCrAccCustomerId property.
     * 
     */
    public void setOutGrpCommitmentOutGrmIssCommitmentCrAccCustomerId(int value) {
        this.outGrpCommitmentOutGrmIssCommitmentCrAccCustomerId = value;
    }

    /**
     * Gets the value of the outGrpCommitmentOutGrmIssCommitmentDrAccCustomerId property.
     * 
     */
    public int getOutGrpCommitmentOutGrmIssCommitmentDrAccCustomerId() {
        return outGrpCommitmentOutGrmIssCommitmentDrAccCustomerId;
    }

    /**
     * Sets the value of the outGrpCommitmentOutGrmIssCommitmentDrAccCustomerId property.
     * 
     */
    public void setOutGrpCommitmentOutGrmIssCommitmentDrAccCustomerId(int value) {
        this.outGrpCommitmentOutGrmIssCommitmentDrAccCustomerId = value;
    }

    /**
     * Gets the value of the outGrpCommitmentOutGrmIssCommitmentEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCommitmentOutGrmIssCommitmentEntryStatus() {
        return outGrpCommitmentOutGrmIssCommitmentEntryStatus;
    }

    /**
     * Sets the value of the outGrpCommitmentOutGrmIssCommitmentEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCommitmentOutGrmIssCommitmentEntryStatus(String value) {
        this.outGrpCommitmentOutGrmIssCommitmentEntryStatus = value;
    }

    /**
     * Gets the value of the outGrpCommitmentOutGrmIssCommitmentFkCnlUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCommitmentOutGrmIssCommitmentFkCnlUsr() {
        return outGrpCommitmentOutGrmIssCommitmentFkCnlUsr;
    }

    /**
     * Sets the value of the outGrpCommitmentOutGrmIssCommitmentFkCnlUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCommitmentOutGrmIssCommitmentFkCnlUsr(String value) {
        this.outGrpCommitmentOutGrmIssCommitmentFkCnlUsr = value;
    }

    /**
     * Gets the value of the outGrpCommitmentOutGrmIssCommitmentFkFinalizeUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCommitmentOutGrmIssCommitmentFkFinalizeUsr() {
        return outGrpCommitmentOutGrmIssCommitmentFkFinalizeUsr;
    }

    /**
     * Sets the value of the outGrpCommitmentOutGrmIssCommitmentFkFinalizeUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCommitmentOutGrmIssCommitmentFkFinalizeUsr(String value) {
        this.outGrpCommitmentOutGrmIssCommitmentFkFinalizeUsr = value;
    }

    /**
     * Gets the value of the outGrpCommitmentOutGrmIssCommitmentFkResponsibleUnit property.
     * 
     */
    public int getOutGrpCommitmentOutGrmIssCommitmentFkResponsibleUnit() {
        return outGrpCommitmentOutGrmIssCommitmentFkResponsibleUnit;
    }

    /**
     * Sets the value of the outGrpCommitmentOutGrmIssCommitmentFkResponsibleUnit property.
     * 
     */
    public void setOutGrpCommitmentOutGrmIssCommitmentFkResponsibleUnit(int value) {
        this.outGrpCommitmentOutGrmIssCommitmentFkResponsibleUnit = value;
    }

    /**
     * Gets the value of the outGrpCommitmentOutGrmIssCommitmentIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpCommitmentOutGrmIssCommitmentIssueDate() {
        return outGrpCommitmentOutGrmIssCommitmentIssueDate;
    }

    /**
     * Sets the value of the outGrpCommitmentOutGrmIssCommitmentIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpCommitmentOutGrmIssCommitmentIssueDate(XMLGregorianCalendar value) {
        this.outGrpCommitmentOutGrmIssCommitmentIssueDate = value;
    }

    /**
     * Gets the value of the outGrpCommitmentOutGrmIssCommitmentIssueType property.
     * 
     */
    public short getOutGrpCommitmentOutGrmIssCommitmentIssueType() {
        return outGrpCommitmentOutGrmIssCommitmentIssueType;
    }

    /**
     * Sets the value of the outGrpCommitmentOutGrmIssCommitmentIssueType property.
     * 
     */
    public void setOutGrpCommitmentOutGrmIssCommitmentIssueType(short value) {
        this.outGrpCommitmentOutGrmIssCommitmentIssueType = value;
    }

    /**
     * Gets the value of the outGrpCommitmentOutGrmIssCommitmentLastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpCommitmentOutGrmIssCommitmentLastUpdateDate() {
        return outGrpCommitmentOutGrmIssCommitmentLastUpdateDate;
    }

    /**
     * Sets the value of the outGrpCommitmentOutGrmIssCommitmentLastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpCommitmentOutGrmIssCommitmentLastUpdateDate(XMLGregorianCalendar value) {
        this.outGrpCommitmentOutGrmIssCommitmentLastUpdateDate = value;
    }

    /**
     * Gets the value of the outGrpCommitmentOutGrmIssCommitmentLoanProfitsAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCommitmentOutGrmIssCommitmentLoanProfitsAcc() {
        return outGrpCommitmentOutGrmIssCommitmentLoanProfitsAcc;
    }

    /**
     * Sets the value of the outGrpCommitmentOutGrmIssCommitmentLoanProfitsAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCommitmentOutGrmIssCommitmentLoanProfitsAcc(String value) {
        this.outGrpCommitmentOutGrmIssCommitmentLoanProfitsAcc = value;
    }

    /**
     * Gets the value of the outGrpCommitmentOutGrmIssCommitmentLoanProfitsCd property.
     * 
     */
    public short getOutGrpCommitmentOutGrmIssCommitmentLoanProfitsCd() {
        return outGrpCommitmentOutGrmIssCommitmentLoanProfitsCd;
    }

    /**
     * Sets the value of the outGrpCommitmentOutGrmIssCommitmentLoanProfitsCd property.
     * 
     */
    public void setOutGrpCommitmentOutGrmIssCommitmentLoanProfitsCd(short value) {
        this.outGrpCommitmentOutGrmIssCommitmentLoanProfitsCd = value;
    }

    /**
     * Gets the value of the outGrpCommitmentOutGrmIssCommitmentRenewalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpCommitmentOutGrmIssCommitmentRenewalDate() {
        return outGrpCommitmentOutGrmIssCommitmentRenewalDate;
    }

    /**
     * Sets the value of the outGrpCommitmentOutGrmIssCommitmentRenewalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpCommitmentOutGrmIssCommitmentRenewalDate(XMLGregorianCalendar value) {
        this.outGrpCommitmentOutGrmIssCommitmentRenewalDate = value;
    }

    /**
     * Gets the value of the outGrpCommitmentOutGrmIssCommitmentServiceProduct property.
     * 
     */
    public int getOutGrpCommitmentOutGrmIssCommitmentServiceProduct() {
        return outGrpCommitmentOutGrmIssCommitmentServiceProduct;
    }

    /**
     * Sets the value of the outGrpCommitmentOutGrmIssCommitmentServiceProduct property.
     * 
     */
    public void setOutGrpCommitmentOutGrmIssCommitmentServiceProduct(int value) {
        this.outGrpCommitmentOutGrmIssCommitmentServiceProduct = value;
    }

    /**
     * Gets the value of the outGrpCommitmentOutGrmIssCommitmentTpSoIdentifier property.
     * 
     */
    public double getOutGrpCommitmentOutGrmIssCommitmentTpSoIdentifier() {
        return outGrpCommitmentOutGrmIssCommitmentTpSoIdentifier;
    }

    /**
     * Sets the value of the outGrpCommitmentOutGrmIssCommitmentTpSoIdentifier property.
     * 
     */
    public void setOutGrpCommitmentOutGrmIssCommitmentTpSoIdentifier(double value) {
        this.outGrpCommitmentOutGrmIssCommitmentTpSoIdentifier = value;
    }

    /**
     * Gets the value of the outGrpCommitmentOutGrmIssPremiumCalcAddInstalmAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpCommitmentOutGrmIssPremiumCalcAddInstalmAmnt() {
        return outGrpCommitmentOutGrmIssPremiumCalcAddInstalmAmnt;
    }

    /**
     * Sets the value of the outGrpCommitmentOutGrmIssPremiumCalcAddInstalmAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpCommitmentOutGrmIssPremiumCalcAddInstalmAmnt(BigDecimal value) {
        this.outGrpCommitmentOutGrmIssPremiumCalcAddInstalmAmnt = value;
    }

    /**
     * Gets the value of the outGrpCommitmentOutGrmIssPremiumCalcAnnualPremium property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpCommitmentOutGrmIssPremiumCalcAnnualPremium() {
        return outGrpCommitmentOutGrmIssPremiumCalcAnnualPremium;
    }

    /**
     * Sets the value of the outGrpCommitmentOutGrmIssPremiumCalcAnnualPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpCommitmentOutGrmIssPremiumCalcAnnualPremium(BigDecimal value) {
        this.outGrpCommitmentOutGrmIssPremiumCalcAnnualPremium = value;
    }

    /**
     * Gets the value of the outGrpCommitmentOutGrmIssPremiumCalcLoadingAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpCommitmentOutGrmIssPremiumCalcLoadingAmnt() {
        return outGrpCommitmentOutGrmIssPremiumCalcLoadingAmnt;
    }

    /**
     * Sets the value of the outGrpCommitmentOutGrmIssPremiumCalcLoadingAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpCommitmentOutGrmIssPremiumCalcLoadingAmnt(BigDecimal value) {
        this.outGrpCommitmentOutGrmIssPremiumCalcLoadingAmnt = value;
    }

    /**
     * Gets the value of the outGrpCommitmentOutGrmIssPremiumCalcMonthlyPremium property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpCommitmentOutGrmIssPremiumCalcMonthlyPremium() {
        return outGrpCommitmentOutGrmIssPremiumCalcMonthlyPremium;
    }

    /**
     * Sets the value of the outGrpCommitmentOutGrmIssPremiumCalcMonthlyPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpCommitmentOutGrmIssPremiumCalcMonthlyPremium(BigDecimal value) {
        this.outGrpCommitmentOutGrmIssPremiumCalcMonthlyPremium = value;
    }

    /**
     * Gets the value of the outGrpCommitmentOutGrmIssPremiumCalcProrataPremium property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpCommitmentOutGrmIssPremiumCalcProrataPremium() {
        return outGrpCommitmentOutGrmIssPremiumCalcProrataPremium;
    }

    /**
     * Sets the value of the outGrpCommitmentOutGrmIssPremiumCalcProrataPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpCommitmentOutGrmIssPremiumCalcProrataPremium(BigDecimal value) {
        this.outGrpCommitmentOutGrmIssPremiumCalcProrataPremium = value;
    }

    /**
     * Gets the value of the outGrpCommitmentOutGrmIssPremiumCalcRemainingAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpCommitmentOutGrmIssPremiumCalcRemainingAmnt() {
        return outGrpCommitmentOutGrmIssPremiumCalcRemainingAmnt;
    }

    /**
     * Sets the value of the outGrpCommitmentOutGrmIssPremiumCalcRemainingAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpCommitmentOutGrmIssPremiumCalcRemainingAmnt(BigDecimal value) {
        this.outGrpCommitmentOutGrmIssPremiumCalcRemainingAmnt = value;
    }

    /**
     * Gets the value of the outGrpCommitmentOutGrmIssProdDocDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCommitmentOutGrmIssProdDocDescr() {
        return outGrpCommitmentOutGrmIssProdDocDescr;
    }

    /**
     * Sets the value of the outGrpCommitmentOutGrmIssProdDocDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCommitmentOutGrmIssProdDocDescr(String value) {
        this.outGrpCommitmentOutGrmIssProdDocDescr = value;
    }

    /**
     * Gets the value of the outGrpCommitmentOutGrmProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCommitmentOutGrmProductDescription() {
        return outGrpCommitmentOutGrmProductDescription;
    }

    /**
     * Sets the value of the outGrpCommitmentOutGrmProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCommitmentOutGrmProductDescription(String value) {
        this.outGrpCommitmentOutGrmProductDescription = value;
    }

    /**
     * Gets the value of the outGrpCommitmentOutGrmProductIdProduct property.
     * 
     */
    public int getOutGrpCommitmentOutGrmProductIdProduct() {
        return outGrpCommitmentOutGrmProductIdProduct;
    }

    /**
     * Sets the value of the outGrpCommitmentOutGrmProductIdProduct property.
     * 
     */
    public void setOutGrpCommitmentOutGrmProductIdProduct(int value) {
        this.outGrpCommitmentOutGrmProductIdProduct = value;
    }

    /**
     * Gets the value of the outGrpCommitmentOutGrmSelectedCommitmentIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCommitmentOutGrmSelectedCommitmentIefSuppliedSelectChar() {
        return outGrpCommitmentOutGrmSelectedCommitmentIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpCommitmentOutGrmSelectedCommitmentIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCommitmentOutGrmSelectedCommitmentIefSuppliedSelectChar(String value) {
        this.outGrpCommitmentOutGrmSelectedCommitmentIefSuppliedSelectChar = value;
    }

}
