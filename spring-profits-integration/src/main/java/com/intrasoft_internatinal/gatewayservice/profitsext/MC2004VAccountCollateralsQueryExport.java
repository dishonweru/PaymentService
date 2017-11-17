
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MC2004VAccountCollateralsQueryExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MC2004VAccountCollateralsQueryExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutAccountBalanceIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAccountCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgrUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCollateralWorkEstimatedAccountLossAc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCollateralWorkEstimatedAccountLossDc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCollateralWorkEstimatedInsurValueAc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCollateralWorkEstimatedInsurValueDc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCollateralWorkEstimatedValueAc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCollateralWorkEstimatedValueDc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCustAddressCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAfmOtherAfmAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerNoAfm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoanAccUnitEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountAccSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoanAccountAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTotalBalanceCollateralWorkEstimatedAccountLossAc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotalBalanceCollateralWorkEstimatedAccountLossDc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAccountCollaterals" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfMC2004VOutGrpAccountCollateralsItem" minOccurs="0"/>
 *         &lt;element name="OutGrpSrvLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfMC2004VOutGrpSrvLogItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MC2004VAccountCollateralsQueryExport", propOrder = {
    "outAccountBalanceIefSuppliedAmount",
    "outAccountCurrencyShortDescr",
    "outAgrUnitCode",
    "outAgreementAgrMembershipSn",
    "outAgreementAgrSn",
    "outAgreementAgrYear",
    "outCollateralWorkEstimatedAccountLossAc",
    "outCollateralWorkEstimatedAccountLossDc",
    "outCollateralWorkEstimatedInsurValueAc",
    "outCollateralWorkEstimatedInsurValueDc",
    "outCollateralWorkEstimatedValueAc",
    "outCollateralWorkEstimatedValueDc",
    "outCustAddressCustAddressAddress1",
    "outCustAfmOtherAfmAfmNo",
    "outCustomerCustId",
    "outCustomerFirstName",
    "outCustomerNoAfm",
    "outCustomerSurname",
    "outLoanAccUnitCode",
    "outLoanAccUnitEntryStatus",
    "outLoanAccUnitUnitName",
    "outLoanAccountAccCd",
    "outLoanAccountAccSn",
    "outLoanAccountAccType",
    "outLoanProductDescription",
    "outLoanProductIdProduct",
    "outTotalBalanceCollateralWorkEstimatedAccountLossAc",
    "outTotalBalanceCollateralWorkEstimatedAccountLossDc",
    "outGrpAccountCollaterals",
    "outGrpSrvLog"
})
public class MC2004VAccountCollateralsQueryExport
    extends BaseExport
{

    @XmlElement(name = "OutAccountBalanceIefSuppliedAmount", required = true)
    protected BigDecimal outAccountBalanceIefSuppliedAmount;
    @XmlElement(name = "OutAccountCurrencyShortDescr")
    protected String outAccountCurrencyShortDescr;
    @XmlElement(name = "OutAgrUnitCode")
    protected int outAgrUnitCode;
    @XmlElement(name = "OutAgreementAgrMembershipSn")
    protected int outAgreementAgrMembershipSn;
    @XmlElement(name = "OutAgreementAgrSn")
    protected int outAgreementAgrSn;
    @XmlElement(name = "OutAgreementAgrYear")
    protected short outAgreementAgrYear;
    @XmlElement(name = "OutCollateralWorkEstimatedAccountLossAc", required = true)
    protected BigDecimal outCollateralWorkEstimatedAccountLossAc;
    @XmlElement(name = "OutCollateralWorkEstimatedAccountLossDc", required = true)
    protected BigDecimal outCollateralWorkEstimatedAccountLossDc;
    @XmlElement(name = "OutCollateralWorkEstimatedInsurValueAc", required = true)
    protected BigDecimal outCollateralWorkEstimatedInsurValueAc;
    @XmlElement(name = "OutCollateralWorkEstimatedInsurValueDc", required = true)
    protected BigDecimal outCollateralWorkEstimatedInsurValueDc;
    @XmlElement(name = "OutCollateralWorkEstimatedValueAc", required = true)
    protected BigDecimal outCollateralWorkEstimatedValueAc;
    @XmlElement(name = "OutCollateralWorkEstimatedValueDc", required = true)
    protected BigDecimal outCollateralWorkEstimatedValueDc;
    @XmlElement(name = "OutCustAddressCustAddressAddress1")
    protected String outCustAddressCustAddressAddress1;
    @XmlElement(name = "OutCustAfmOtherAfmAfmNo")
    protected String outCustAfmOtherAfmAfmNo;
    @XmlElement(name = "OutCustomerCustId")
    protected int outCustomerCustId;
    @XmlElement(name = "OutCustomerFirstName")
    protected String outCustomerFirstName;
    @XmlElement(name = "OutCustomerNoAfm")
    protected String outCustomerNoAfm;
    @XmlElement(name = "OutCustomerSurname")
    protected String outCustomerSurname;
    @XmlElement(name = "OutLoanAccUnitCode")
    protected int outLoanAccUnitCode;
    @XmlElement(name = "OutLoanAccUnitEntryStatus")
    protected String outLoanAccUnitEntryStatus;
    @XmlElement(name = "OutLoanAccUnitUnitName")
    protected String outLoanAccUnitUnitName;
    @XmlElement(name = "OutLoanAccountAccCd")
    protected short outLoanAccountAccCd;
    @XmlElement(name = "OutLoanAccountAccSn")
    protected int outLoanAccountAccSn;
    @XmlElement(name = "OutLoanAccountAccType")
    protected short outLoanAccountAccType;
    @XmlElement(name = "OutLoanProductDescription")
    protected String outLoanProductDescription;
    @XmlElement(name = "OutLoanProductIdProduct")
    protected int outLoanProductIdProduct;
    @XmlElement(name = "OutTotalBalanceCollateralWorkEstimatedAccountLossAc", required = true)
    protected BigDecimal outTotalBalanceCollateralWorkEstimatedAccountLossAc;
    @XmlElement(name = "OutTotalBalanceCollateralWorkEstimatedAccountLossDc", required = true)
    protected BigDecimal outTotalBalanceCollateralWorkEstimatedAccountLossDc;
    @XmlElement(name = "OutGrpAccountCollaterals")
    protected ArrayOfMC2004VOutGrpAccountCollateralsItem outGrpAccountCollaterals;
    @XmlElement(name = "OutGrpSrvLog")
    protected ArrayOfMC2004VOutGrpSrvLogItem outGrpSrvLog;

    /**
     * Gets the value of the outAccountBalanceIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAccountBalanceIefSuppliedAmount() {
        return outAccountBalanceIefSuppliedAmount;
    }

    /**
     * Sets the value of the outAccountBalanceIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAccountBalanceIefSuppliedAmount(BigDecimal value) {
        this.outAccountBalanceIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the outAccountCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAccountCurrencyShortDescr() {
        return outAccountCurrencyShortDescr;
    }

    /**
     * Sets the value of the outAccountCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAccountCurrencyShortDescr(String value) {
        this.outAccountCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outAgrUnitCode property.
     * 
     */
    public int getOutAgrUnitCode() {
        return outAgrUnitCode;
    }

    /**
     * Sets the value of the outAgrUnitCode property.
     * 
     */
    public void setOutAgrUnitCode(int value) {
        this.outAgrUnitCode = value;
    }

    /**
     * Gets the value of the outAgreementAgrMembershipSn property.
     * 
     */
    public int getOutAgreementAgrMembershipSn() {
        return outAgreementAgrMembershipSn;
    }

    /**
     * Sets the value of the outAgreementAgrMembershipSn property.
     * 
     */
    public void setOutAgreementAgrMembershipSn(int value) {
        this.outAgreementAgrMembershipSn = value;
    }

    /**
     * Gets the value of the outAgreementAgrSn property.
     * 
     */
    public int getOutAgreementAgrSn() {
        return outAgreementAgrSn;
    }

    /**
     * Sets the value of the outAgreementAgrSn property.
     * 
     */
    public void setOutAgreementAgrSn(int value) {
        this.outAgreementAgrSn = value;
    }

    /**
     * Gets the value of the outAgreementAgrYear property.
     * 
     */
    public short getOutAgreementAgrYear() {
        return outAgreementAgrYear;
    }

    /**
     * Sets the value of the outAgreementAgrYear property.
     * 
     */
    public void setOutAgreementAgrYear(short value) {
        this.outAgreementAgrYear = value;
    }

    /**
     * Gets the value of the outCollateralWorkEstimatedAccountLossAc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCollateralWorkEstimatedAccountLossAc() {
        return outCollateralWorkEstimatedAccountLossAc;
    }

    /**
     * Sets the value of the outCollateralWorkEstimatedAccountLossAc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCollateralWorkEstimatedAccountLossAc(BigDecimal value) {
        this.outCollateralWorkEstimatedAccountLossAc = value;
    }

    /**
     * Gets the value of the outCollateralWorkEstimatedAccountLossDc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCollateralWorkEstimatedAccountLossDc() {
        return outCollateralWorkEstimatedAccountLossDc;
    }

    /**
     * Sets the value of the outCollateralWorkEstimatedAccountLossDc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCollateralWorkEstimatedAccountLossDc(BigDecimal value) {
        this.outCollateralWorkEstimatedAccountLossDc = value;
    }

    /**
     * Gets the value of the outCollateralWorkEstimatedInsurValueAc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCollateralWorkEstimatedInsurValueAc() {
        return outCollateralWorkEstimatedInsurValueAc;
    }

    /**
     * Sets the value of the outCollateralWorkEstimatedInsurValueAc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCollateralWorkEstimatedInsurValueAc(BigDecimal value) {
        this.outCollateralWorkEstimatedInsurValueAc = value;
    }

    /**
     * Gets the value of the outCollateralWorkEstimatedInsurValueDc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCollateralWorkEstimatedInsurValueDc() {
        return outCollateralWorkEstimatedInsurValueDc;
    }

    /**
     * Sets the value of the outCollateralWorkEstimatedInsurValueDc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCollateralWorkEstimatedInsurValueDc(BigDecimal value) {
        this.outCollateralWorkEstimatedInsurValueDc = value;
    }

    /**
     * Gets the value of the outCollateralWorkEstimatedValueAc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCollateralWorkEstimatedValueAc() {
        return outCollateralWorkEstimatedValueAc;
    }

    /**
     * Sets the value of the outCollateralWorkEstimatedValueAc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCollateralWorkEstimatedValueAc(BigDecimal value) {
        this.outCollateralWorkEstimatedValueAc = value;
    }

    /**
     * Gets the value of the outCollateralWorkEstimatedValueDc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCollateralWorkEstimatedValueDc() {
        return outCollateralWorkEstimatedValueDc;
    }

    /**
     * Sets the value of the outCollateralWorkEstimatedValueDc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCollateralWorkEstimatedValueDc(BigDecimal value) {
        this.outCollateralWorkEstimatedValueDc = value;
    }

    /**
     * Gets the value of the outCustAddressCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressCustAddressAddress1() {
        return outCustAddressCustAddressAddress1;
    }

    /**
     * Sets the value of the outCustAddressCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressCustAddressAddress1(String value) {
        this.outCustAddressCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the outCustAfmOtherAfmAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAfmOtherAfmAfmNo() {
        return outCustAfmOtherAfmAfmNo;
    }

    /**
     * Sets the value of the outCustAfmOtherAfmAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAfmOtherAfmAfmNo(String value) {
        this.outCustAfmOtherAfmAfmNo = value;
    }

    /**
     * Gets the value of the outCustomerCustId property.
     * 
     */
    public int getOutCustomerCustId() {
        return outCustomerCustId;
    }

    /**
     * Sets the value of the outCustomerCustId property.
     * 
     */
    public void setOutCustomerCustId(int value) {
        this.outCustomerCustId = value;
    }

    /**
     * Gets the value of the outCustomerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerFirstName() {
        return outCustomerFirstName;
    }

    /**
     * Sets the value of the outCustomerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerFirstName(String value) {
        this.outCustomerFirstName = value;
    }

    /**
     * Gets the value of the outCustomerNoAfm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerNoAfm() {
        return outCustomerNoAfm;
    }

    /**
     * Sets the value of the outCustomerNoAfm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerNoAfm(String value) {
        this.outCustomerNoAfm = value;
    }

    /**
     * Gets the value of the outCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerSurname() {
        return outCustomerSurname;
    }

    /**
     * Sets the value of the outCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerSurname(String value) {
        this.outCustomerSurname = value;
    }

    /**
     * Gets the value of the outLoanAccUnitCode property.
     * 
     */
    public int getOutLoanAccUnitCode() {
        return outLoanAccUnitCode;
    }

    /**
     * Sets the value of the outLoanAccUnitCode property.
     * 
     */
    public void setOutLoanAccUnitCode(int value) {
        this.outLoanAccUnitCode = value;
    }

    /**
     * Gets the value of the outLoanAccUnitEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccUnitEntryStatus() {
        return outLoanAccUnitEntryStatus;
    }

    /**
     * Sets the value of the outLoanAccUnitEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccUnitEntryStatus(String value) {
        this.outLoanAccUnitEntryStatus = value;
    }

    /**
     * Gets the value of the outLoanAccUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccUnitUnitName() {
        return outLoanAccUnitUnitName;
    }

    /**
     * Sets the value of the outLoanAccUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccUnitUnitName(String value) {
        this.outLoanAccUnitUnitName = value;
    }

    /**
     * Gets the value of the outLoanAccountAccCd property.
     * 
     */
    public short getOutLoanAccountAccCd() {
        return outLoanAccountAccCd;
    }

    /**
     * Sets the value of the outLoanAccountAccCd property.
     * 
     */
    public void setOutLoanAccountAccCd(short value) {
        this.outLoanAccountAccCd = value;
    }

    /**
     * Gets the value of the outLoanAccountAccSn property.
     * 
     */
    public int getOutLoanAccountAccSn() {
        return outLoanAccountAccSn;
    }

    /**
     * Sets the value of the outLoanAccountAccSn property.
     * 
     */
    public void setOutLoanAccountAccSn(int value) {
        this.outLoanAccountAccSn = value;
    }

    /**
     * Gets the value of the outLoanAccountAccType property.
     * 
     */
    public short getOutLoanAccountAccType() {
        return outLoanAccountAccType;
    }

    /**
     * Sets the value of the outLoanAccountAccType property.
     * 
     */
    public void setOutLoanAccountAccType(short value) {
        this.outLoanAccountAccType = value;
    }

    /**
     * Gets the value of the outLoanProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanProductDescription() {
        return outLoanProductDescription;
    }

    /**
     * Sets the value of the outLoanProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanProductDescription(String value) {
        this.outLoanProductDescription = value;
    }

    /**
     * Gets the value of the outLoanProductIdProduct property.
     * 
     */
    public int getOutLoanProductIdProduct() {
        return outLoanProductIdProduct;
    }

    /**
     * Sets the value of the outLoanProductIdProduct property.
     * 
     */
    public void setOutLoanProductIdProduct(int value) {
        this.outLoanProductIdProduct = value;
    }

    /**
     * Gets the value of the outTotalBalanceCollateralWorkEstimatedAccountLossAc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalBalanceCollateralWorkEstimatedAccountLossAc() {
        return outTotalBalanceCollateralWorkEstimatedAccountLossAc;
    }

    /**
     * Sets the value of the outTotalBalanceCollateralWorkEstimatedAccountLossAc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalBalanceCollateralWorkEstimatedAccountLossAc(BigDecimal value) {
        this.outTotalBalanceCollateralWorkEstimatedAccountLossAc = value;
    }

    /**
     * Gets the value of the outTotalBalanceCollateralWorkEstimatedAccountLossDc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalBalanceCollateralWorkEstimatedAccountLossDc() {
        return outTotalBalanceCollateralWorkEstimatedAccountLossDc;
    }

    /**
     * Sets the value of the outTotalBalanceCollateralWorkEstimatedAccountLossDc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalBalanceCollateralWorkEstimatedAccountLossDc(BigDecimal value) {
        this.outTotalBalanceCollateralWorkEstimatedAccountLossDc = value;
    }

    /**
     * Gets the value of the outGrpAccountCollaterals property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMC2004VOutGrpAccountCollateralsItem }
     *     
     */
    public ArrayOfMC2004VOutGrpAccountCollateralsItem getOutGrpAccountCollaterals() {
        return outGrpAccountCollaterals;
    }

    /**
     * Sets the value of the outGrpAccountCollaterals property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMC2004VOutGrpAccountCollateralsItem }
     *     
     */
    public void setOutGrpAccountCollaterals(ArrayOfMC2004VOutGrpAccountCollateralsItem value) {
        this.outGrpAccountCollaterals = value;
    }

    /**
     * Gets the value of the outGrpSrvLog property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMC2004VOutGrpSrvLogItem }
     *     
     */
    public ArrayOfMC2004VOutGrpSrvLogItem getOutGrpSrvLog() {
        return outGrpSrvLog;
    }

    /**
     * Sets the value of the outGrpSrvLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMC2004VOutGrpSrvLogItem }
     *     
     */
    public void setOutGrpSrvLog(ArrayOfMC2004VOutGrpSrvLogItem value) {
        this.outGrpSrvLog = value;
    }

}
