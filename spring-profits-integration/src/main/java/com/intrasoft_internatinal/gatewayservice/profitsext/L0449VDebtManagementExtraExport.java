
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for L0449VDebtManagementExtraExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0449VDebtManagementExtraExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutDebtManageArrearsAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDebtManageArrearsInterest" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDebtManageCapitalBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDebtManageClassification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDebtManageCurrencyDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDebtManageFstDrawdownDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDebtManageGrossLoan" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDebtManageInstallmentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDebtManageInstallmentFreq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDebtManageLoanPeriod" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDebtManageLstPaymentAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDebtManageLstPaymentDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDebtManageNbrArrearsInstallm" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDebtManageNbrDaysInArrear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDebtManageNbrOfInstallments" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDebtManageNetDebt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDebtManageNormalBookBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDebtManageOutstandingCharges" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDebtManageSpecificProvision" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDebtManageSuspendInter" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDebtManageTotAmntDisbursed" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDebtManageTotPaymentAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDebtManageTotalProvision" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOtherColl" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfL0449VOutGrpOtherCollExtraItem" minOccurs="0"/>
 *         &lt;element name="OutGrpPropertyColl" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfL0449VOutGrpPropertyCollExtraItem" minOccurs="0"/>
 *         &lt;element name="OutDebtManageArrearsInterestRate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutDebtManageNormalInterestRate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutDebtManageLoanPeriodLeft" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDebtManageAccountProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDebtManageAccountUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDebtManageCustomerCategory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDebtManageGrossDept" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0449VDebtManagementExtraExport", propOrder = {
    "outDebtManageArrearsAmount",
    "outDebtManageArrearsInterest",
    "outDebtManageCapitalBalance",
    "outDebtManageClassification",
    "outDebtManageCurrencyDesc",
    "outDebtManageFstDrawdownDt",
    "outDebtManageGrossLoan",
    "outDebtManageInstallmentAmount",
    "outDebtManageInstallmentFreq",
    "outDebtManageLoanPeriod",
    "outDebtManageLstPaymentAmn",
    "outDebtManageLstPaymentDt",
    "outDebtManageNbrArrearsInstallm",
    "outDebtManageNbrDaysInArrear",
    "outDebtManageNbrOfInstallments",
    "outDebtManageNetDebt",
    "outDebtManageNormalBookBal",
    "outDebtManageOutstandingCharges",
    "outDebtManageSpecificProvision",
    "outDebtManageSuspendInter",
    "outDebtManageTotAmntDisbursed",
    "outDebtManageTotPaymentAmn",
    "outDebtManageTotalProvision",
    "outGrpOtherColl",
    "outGrpPropertyColl",
    "outDebtManageArrearsInterestRate",
    "outDebtManageNormalInterestRate",
    "outDebtManageLoanPeriodLeft",
    "outDebtManageAccountProduct",
    "outDebtManageAccountUnit",
    "outDebtManageCustomerCategory",
    "outDebtManageGrossDept"
})
public class L0449VDebtManagementExtraExport
    extends BaseExport
{

    @XmlElement(name = "OutDebtManageArrearsAmount", required = true)
    protected BigDecimal outDebtManageArrearsAmount;
    @XmlElement(name = "OutDebtManageArrearsInterest", required = true)
    protected BigDecimal outDebtManageArrearsInterest;
    @XmlElement(name = "OutDebtManageCapitalBalance", required = true)
    protected BigDecimal outDebtManageCapitalBalance;
    @XmlElement(name = "OutDebtManageClassification")
    protected String outDebtManageClassification;
    @XmlElement(name = "OutDebtManageCurrencyDesc")
    protected String outDebtManageCurrencyDesc;
    @XmlElement(name = "OutDebtManageFstDrawdownDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDebtManageFstDrawdownDt;
    @XmlElement(name = "OutDebtManageGrossLoan", required = true)
    protected BigDecimal outDebtManageGrossLoan;
    @XmlElement(name = "OutDebtManageInstallmentAmount", required = true)
    protected BigDecimal outDebtManageInstallmentAmount;
    @XmlElement(name = "OutDebtManageInstallmentFreq")
    protected short outDebtManageInstallmentFreq;
    @XmlElement(name = "OutDebtManageLoanPeriod", required = true)
    protected BigDecimal outDebtManageLoanPeriod;
    @XmlElement(name = "OutDebtManageLstPaymentAmn", required = true)
    protected BigDecimal outDebtManageLstPaymentAmn;
    @XmlElement(name = "OutDebtManageLstPaymentDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDebtManageLstPaymentDt;
    @XmlElement(name = "OutDebtManageNbrArrearsInstallm", required = true)
    protected BigDecimal outDebtManageNbrArrearsInstallm;
    @XmlElement(name = "OutDebtManageNbrDaysInArrear")
    protected short outDebtManageNbrDaysInArrear;
    @XmlElement(name = "OutDebtManageNbrOfInstallments")
    protected short outDebtManageNbrOfInstallments;
    @XmlElement(name = "OutDebtManageNetDebt", required = true)
    protected BigDecimal outDebtManageNetDebt;
    @XmlElement(name = "OutDebtManageNormalBookBal", required = true)
    protected BigDecimal outDebtManageNormalBookBal;
    @XmlElement(name = "OutDebtManageOutstandingCharges", required = true)
    protected BigDecimal outDebtManageOutstandingCharges;
    @XmlElement(name = "OutDebtManageSpecificProvision", required = true)
    protected BigDecimal outDebtManageSpecificProvision;
    @XmlElement(name = "OutDebtManageSuspendInter", required = true)
    protected BigDecimal outDebtManageSuspendInter;
    @XmlElement(name = "OutDebtManageTotAmntDisbursed", required = true)
    protected BigDecimal outDebtManageTotAmntDisbursed;
    @XmlElement(name = "OutDebtManageTotPaymentAmn", required = true)
    protected BigDecimal outDebtManageTotPaymentAmn;
    @XmlElement(name = "OutDebtManageTotalProvision", required = true)
    protected BigDecimal outDebtManageTotalProvision;
    @XmlElement(name = "OutGrpOtherColl")
    protected ArrayOfL0449VOutGrpOtherCollExtraItem outGrpOtherColl;
    @XmlElement(name = "OutGrpPropertyColl")
    protected ArrayOfL0449VOutGrpPropertyCollExtraItem outGrpPropertyColl;
    @XmlElement(name = "OutDebtManageArrearsInterestRate")
    protected double outDebtManageArrearsInterestRate;
    @XmlElement(name = "OutDebtManageNormalInterestRate")
    protected double outDebtManageNormalInterestRate;
    @XmlElement(name = "OutDebtManageLoanPeriodLeft")
    protected short outDebtManageLoanPeriodLeft;
    @XmlElement(name = "OutDebtManageAccountProduct")
    protected int outDebtManageAccountProduct;
    @XmlElement(name = "OutDebtManageAccountUnit")
    protected int outDebtManageAccountUnit;
    @XmlElement(name = "OutDebtManageCustomerCategory")
    protected int outDebtManageCustomerCategory;
    @XmlElement(name = "OutDebtManageGrossDept", required = true)
    protected BigDecimal outDebtManageGrossDept;

    /**
     * Gets the value of the outDebtManageArrearsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDebtManageArrearsAmount() {
        return outDebtManageArrearsAmount;
    }

    /**
     * Sets the value of the outDebtManageArrearsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDebtManageArrearsAmount(BigDecimal value) {
        this.outDebtManageArrearsAmount = value;
    }

    /**
     * Gets the value of the outDebtManageArrearsInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDebtManageArrearsInterest() {
        return outDebtManageArrearsInterest;
    }

    /**
     * Sets the value of the outDebtManageArrearsInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDebtManageArrearsInterest(BigDecimal value) {
        this.outDebtManageArrearsInterest = value;
    }

    /**
     * Gets the value of the outDebtManageCapitalBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDebtManageCapitalBalance() {
        return outDebtManageCapitalBalance;
    }

    /**
     * Sets the value of the outDebtManageCapitalBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDebtManageCapitalBalance(BigDecimal value) {
        this.outDebtManageCapitalBalance = value;
    }

    /**
     * Gets the value of the outDebtManageClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDebtManageClassification() {
        return outDebtManageClassification;
    }

    /**
     * Sets the value of the outDebtManageClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDebtManageClassification(String value) {
        this.outDebtManageClassification = value;
    }

    /**
     * Gets the value of the outDebtManageCurrencyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDebtManageCurrencyDesc() {
        return outDebtManageCurrencyDesc;
    }

    /**
     * Sets the value of the outDebtManageCurrencyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDebtManageCurrencyDesc(String value) {
        this.outDebtManageCurrencyDesc = value;
    }

    /**
     * Gets the value of the outDebtManageFstDrawdownDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDebtManageFstDrawdownDt() {
        return outDebtManageFstDrawdownDt;
    }

    /**
     * Sets the value of the outDebtManageFstDrawdownDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDebtManageFstDrawdownDt(XMLGregorianCalendar value) {
        this.outDebtManageFstDrawdownDt = value;
    }

    /**
     * Gets the value of the outDebtManageGrossLoan property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDebtManageGrossLoan() {
        return outDebtManageGrossLoan;
    }

    /**
     * Sets the value of the outDebtManageGrossLoan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDebtManageGrossLoan(BigDecimal value) {
        this.outDebtManageGrossLoan = value;
    }

    /**
     * Gets the value of the outDebtManageInstallmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDebtManageInstallmentAmount() {
        return outDebtManageInstallmentAmount;
    }

    /**
     * Sets the value of the outDebtManageInstallmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDebtManageInstallmentAmount(BigDecimal value) {
        this.outDebtManageInstallmentAmount = value;
    }

    /**
     * Gets the value of the outDebtManageInstallmentFreq property.
     * 
     */
    public short getOutDebtManageInstallmentFreq() {
        return outDebtManageInstallmentFreq;
    }

    /**
     * Sets the value of the outDebtManageInstallmentFreq property.
     * 
     */
    public void setOutDebtManageInstallmentFreq(short value) {
        this.outDebtManageInstallmentFreq = value;
    }

    /**
     * Gets the value of the outDebtManageLoanPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDebtManageLoanPeriod() {
        return outDebtManageLoanPeriod;
    }

    /**
     * Sets the value of the outDebtManageLoanPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDebtManageLoanPeriod(BigDecimal value) {
        this.outDebtManageLoanPeriod = value;
    }

    /**
     * Gets the value of the outDebtManageLstPaymentAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDebtManageLstPaymentAmn() {
        return outDebtManageLstPaymentAmn;
    }

    /**
     * Sets the value of the outDebtManageLstPaymentAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDebtManageLstPaymentAmn(BigDecimal value) {
        this.outDebtManageLstPaymentAmn = value;
    }

    /**
     * Gets the value of the outDebtManageLstPaymentDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDebtManageLstPaymentDt() {
        return outDebtManageLstPaymentDt;
    }

    /**
     * Sets the value of the outDebtManageLstPaymentDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDebtManageLstPaymentDt(XMLGregorianCalendar value) {
        this.outDebtManageLstPaymentDt = value;
    }

    /**
     * Gets the value of the outDebtManageNbrArrearsInstallm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDebtManageNbrArrearsInstallm() {
        return outDebtManageNbrArrearsInstallm;
    }

    /**
     * Sets the value of the outDebtManageNbrArrearsInstallm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDebtManageNbrArrearsInstallm(BigDecimal value) {
        this.outDebtManageNbrArrearsInstallm = value;
    }

    /**
     * Gets the value of the outDebtManageNbrDaysInArrear property.
     * 
     */
    public short getOutDebtManageNbrDaysInArrear() {
        return outDebtManageNbrDaysInArrear;
    }

    /**
     * Sets the value of the outDebtManageNbrDaysInArrear property.
     * 
     */
    public void setOutDebtManageNbrDaysInArrear(short value) {
        this.outDebtManageNbrDaysInArrear = value;
    }

    /**
     * Gets the value of the outDebtManageNbrOfInstallments property.
     * 
     */
    public short getOutDebtManageNbrOfInstallments() {
        return outDebtManageNbrOfInstallments;
    }

    /**
     * Sets the value of the outDebtManageNbrOfInstallments property.
     * 
     */
    public void setOutDebtManageNbrOfInstallments(short value) {
        this.outDebtManageNbrOfInstallments = value;
    }

    /**
     * Gets the value of the outDebtManageNetDebt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDebtManageNetDebt() {
        return outDebtManageNetDebt;
    }

    /**
     * Sets the value of the outDebtManageNetDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDebtManageNetDebt(BigDecimal value) {
        this.outDebtManageNetDebt = value;
    }

    /**
     * Gets the value of the outDebtManageNormalBookBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDebtManageNormalBookBal() {
        return outDebtManageNormalBookBal;
    }

    /**
     * Sets the value of the outDebtManageNormalBookBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDebtManageNormalBookBal(BigDecimal value) {
        this.outDebtManageNormalBookBal = value;
    }

    /**
     * Gets the value of the outDebtManageOutstandingCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDebtManageOutstandingCharges() {
        return outDebtManageOutstandingCharges;
    }

    /**
     * Sets the value of the outDebtManageOutstandingCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDebtManageOutstandingCharges(BigDecimal value) {
        this.outDebtManageOutstandingCharges = value;
    }

    /**
     * Gets the value of the outDebtManageSpecificProvision property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDebtManageSpecificProvision() {
        return outDebtManageSpecificProvision;
    }

    /**
     * Sets the value of the outDebtManageSpecificProvision property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDebtManageSpecificProvision(BigDecimal value) {
        this.outDebtManageSpecificProvision = value;
    }

    /**
     * Gets the value of the outDebtManageSuspendInter property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDebtManageSuspendInter() {
        return outDebtManageSuspendInter;
    }

    /**
     * Sets the value of the outDebtManageSuspendInter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDebtManageSuspendInter(BigDecimal value) {
        this.outDebtManageSuspendInter = value;
    }

    /**
     * Gets the value of the outDebtManageTotAmntDisbursed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDebtManageTotAmntDisbursed() {
        return outDebtManageTotAmntDisbursed;
    }

    /**
     * Sets the value of the outDebtManageTotAmntDisbursed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDebtManageTotAmntDisbursed(BigDecimal value) {
        this.outDebtManageTotAmntDisbursed = value;
    }

    /**
     * Gets the value of the outDebtManageTotPaymentAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDebtManageTotPaymentAmn() {
        return outDebtManageTotPaymentAmn;
    }

    /**
     * Sets the value of the outDebtManageTotPaymentAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDebtManageTotPaymentAmn(BigDecimal value) {
        this.outDebtManageTotPaymentAmn = value;
    }

    /**
     * Gets the value of the outDebtManageTotalProvision property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDebtManageTotalProvision() {
        return outDebtManageTotalProvision;
    }

    /**
     * Sets the value of the outDebtManageTotalProvision property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDebtManageTotalProvision(BigDecimal value) {
        this.outDebtManageTotalProvision = value;
    }

    /**
     * Gets the value of the outGrpOtherColl property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfL0449VOutGrpOtherCollExtraItem }
     *     
     */
    public ArrayOfL0449VOutGrpOtherCollExtraItem getOutGrpOtherColl() {
        return outGrpOtherColl;
    }

    /**
     * Sets the value of the outGrpOtherColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfL0449VOutGrpOtherCollExtraItem }
     *     
     */
    public void setOutGrpOtherColl(ArrayOfL0449VOutGrpOtherCollExtraItem value) {
        this.outGrpOtherColl = value;
    }

    /**
     * Gets the value of the outGrpPropertyColl property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfL0449VOutGrpPropertyCollExtraItem }
     *     
     */
    public ArrayOfL0449VOutGrpPropertyCollExtraItem getOutGrpPropertyColl() {
        return outGrpPropertyColl;
    }

    /**
     * Sets the value of the outGrpPropertyColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfL0449VOutGrpPropertyCollExtraItem }
     *     
     */
    public void setOutGrpPropertyColl(ArrayOfL0449VOutGrpPropertyCollExtraItem value) {
        this.outGrpPropertyColl = value;
    }

    /**
     * Gets the value of the outDebtManageArrearsInterestRate property.
     * 
     */
    public double getOutDebtManageArrearsInterestRate() {
        return outDebtManageArrearsInterestRate;
    }

    /**
     * Sets the value of the outDebtManageArrearsInterestRate property.
     * 
     */
    public void setOutDebtManageArrearsInterestRate(double value) {
        this.outDebtManageArrearsInterestRate = value;
    }

    /**
     * Gets the value of the outDebtManageNormalInterestRate property.
     * 
     */
    public double getOutDebtManageNormalInterestRate() {
        return outDebtManageNormalInterestRate;
    }

    /**
     * Sets the value of the outDebtManageNormalInterestRate property.
     * 
     */
    public void setOutDebtManageNormalInterestRate(double value) {
        this.outDebtManageNormalInterestRate = value;
    }

    /**
     * Gets the value of the outDebtManageLoanPeriodLeft property.
     * 
     */
    public short getOutDebtManageLoanPeriodLeft() {
        return outDebtManageLoanPeriodLeft;
    }

    /**
     * Sets the value of the outDebtManageLoanPeriodLeft property.
     * 
     */
    public void setOutDebtManageLoanPeriodLeft(short value) {
        this.outDebtManageLoanPeriodLeft = value;
    }

    /**
     * Gets the value of the outDebtManageAccountProduct property.
     * 
     */
    public int getOutDebtManageAccountProduct() {
        return outDebtManageAccountProduct;
    }

    /**
     * Sets the value of the outDebtManageAccountProduct property.
     * 
     */
    public void setOutDebtManageAccountProduct(int value) {
        this.outDebtManageAccountProduct = value;
    }

    /**
     * Gets the value of the outDebtManageAccountUnit property.
     * 
     */
    public int getOutDebtManageAccountUnit() {
        return outDebtManageAccountUnit;
    }

    /**
     * Sets the value of the outDebtManageAccountUnit property.
     * 
     */
    public void setOutDebtManageAccountUnit(int value) {
        this.outDebtManageAccountUnit = value;
    }

    /**
     * Gets the value of the outDebtManageCustomerCategory property.
     * 
     */
    public int getOutDebtManageCustomerCategory() {
        return outDebtManageCustomerCategory;
    }

    /**
     * Sets the value of the outDebtManageCustomerCategory property.
     * 
     */
    public void setOutDebtManageCustomerCategory(int value) {
        this.outDebtManageCustomerCategory = value;
    }

    /**
     * Gets the value of the outDebtManageGrossDept property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDebtManageGrossDept() {
        return outDebtManageGrossDept;
    }

    /**
     * Sets the value of the outDebtManageGrossDept property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDebtManageGrossDept(BigDecimal value) {
        this.outDebtManageGrossDept = value;
    }

}
