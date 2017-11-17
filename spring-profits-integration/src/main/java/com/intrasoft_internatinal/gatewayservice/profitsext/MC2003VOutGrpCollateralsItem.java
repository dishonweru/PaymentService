
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MC2003VOutGrpCollateralsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MC2003VOutGrpCollateralsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpCollateralsOutGrmAccLtvIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpCollateralsOutGrmAccBalanceIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpCollateralsOutGrmAccBalanceDcIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpCollateralsOutGrmAccStatusIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCollateralsOutGrmScharIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCollateralsOutGrmColProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCollateralsOutGrmColProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCollateralsOutGrmAccCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCollateralsOutGrmAccCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCollateralsOutGrmAccProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCollateralsOutGrmAccProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCollateralsOutGrmColCollateralCollateralSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpCollateralsOutGrmColCollateralCollateralCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCollateralsOutGrmColCollateralReviseDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpCollateralsOutGrmColCollateralCollateralStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCollateralsOutGrmColCollateralEstimationDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpCollateralsOutGrmColCollateralItemsCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCollateralsOutGrmColAccountCollateralEstValueAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpCollateralsOutGrmColAccountCollateralEstInsuranceAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpCollateralsOutGrmColAccountCollateralReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCollateralsOutGrmColAccountCollateralExpiryDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpCollateralsOutGrmColAccountCollateralEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCollateralsOutGrmColAccountCollateralInsertionDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpCollateralsOutGrmColAccountCollateralFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCollateralsOutGrmColAccountCollateralSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCollateralsOutGrmColAccountCollateralAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCollateralsOutGrmColAccountCollateralAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCollateralsOutGrmColAccountCollateralPrftAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCollateralsOutGrmColAccountCollateralAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpCollateralsOutGrmColAccountCollateralDepAccInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCollateralsOutGrmColAccountCollateralUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCollateralsOutGrmColAccountCollateralNoteStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCollateralsOutGrmColAccountCollateralYieldLimitAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpCollateralsOutGrmColAccountCollateralProfitsSystem" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCollateralsOutGrmColCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCollateralsOutGrmColCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCollateralsOutGrmColTotEstimatedLossCollateralWorkEstimatedAccountLossDc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpCollateralsOutGrmColTotEstimatedLossCollateralWorkEstimatedAccountLossAc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpCollateralsOutGrmColOpenUnitUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCollateralsOutGrmColOpenUnitUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCollateralsOutGrmAccFixingRateRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpCollateralsOutGrmAccLtvTotIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpCollateralsOutGrmColYieldDcAccountCollateralYieldLimitAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpCollateralsOutGrmAccSystemCollateralWorkSystemDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MC2003VOutGrpCollateralsItem", propOrder = {
    "outGrpCollateralsOutGrmAccLtvIefSuppliedNumber152",
    "outGrpCollateralsOutGrmAccBalanceIefSuppliedNumber152",
    "outGrpCollateralsOutGrmAccBalanceDcIefSuppliedAmount",
    "outGrpCollateralsOutGrmAccStatusIefSuppliedActionEntryDesc",
    "outGrpCollateralsOutGrmScharIefSuppliedSelectChar",
    "outGrpCollateralsOutGrmColProductIdProduct",
    "outGrpCollateralsOutGrmColProductDescription",
    "outGrpCollateralsOutGrmAccCurrencyIdCurrency",
    "outGrpCollateralsOutGrmAccCurrencyShortDescr",
    "outGrpCollateralsOutGrmAccProductIdProduct",
    "outGrpCollateralsOutGrmAccProductDescription",
    "outGrpCollateralsOutGrmColCollateralCollateralSn",
    "outGrpCollateralsOutGrmColCollateralCollateralCode",
    "outGrpCollateralsOutGrmColCollateralReviseDt",
    "outGrpCollateralsOutGrmColCollateralCollateralStatus",
    "outGrpCollateralsOutGrmColCollateralEstimationDt",
    "outGrpCollateralsOutGrmColCollateralItemsCnt",
    "outGrpCollateralsOutGrmColAccountCollateralEstValueAmn",
    "outGrpCollateralsOutGrmColAccountCollateralEstInsuranceAmn",
    "outGrpCollateralsOutGrmColAccountCollateralReferenceNumber",
    "outGrpCollateralsOutGrmColAccountCollateralExpiryDt",
    "outGrpCollateralsOutGrmColAccountCollateralEntryStatus",
    "outGrpCollateralsOutGrmColAccountCollateralInsertionDt",
    "outGrpCollateralsOutGrmColAccountCollateralFirstName",
    "outGrpCollateralsOutGrmColAccountCollateralSurname",
    "outGrpCollateralsOutGrmColAccountCollateralAddress",
    "outGrpCollateralsOutGrmColAccountCollateralAfmNo",
    "outGrpCollateralsOutGrmColAccountCollateralPrftAccount",
    "outGrpCollateralsOutGrmColAccountCollateralAccountCd",
    "outGrpCollateralsOutGrmColAccountCollateralDepAccInd",
    "outGrpCollateralsOutGrmColAccountCollateralUnitCode",
    "outGrpCollateralsOutGrmColAccountCollateralNoteStatus",
    "outGrpCollateralsOutGrmColAccountCollateralYieldLimitAmn",
    "outGrpCollateralsOutGrmColAccountCollateralProfitsSystem",
    "outGrpCollateralsOutGrmColCurrencyShortDescr",
    "outGrpCollateralsOutGrmColCurrencyIdCurrency",
    "outGrpCollateralsOutGrmColTotEstimatedLossCollateralWorkEstimatedAccountLossDc",
    "outGrpCollateralsOutGrmColTotEstimatedLossCollateralWorkEstimatedAccountLossAc",
    "outGrpCollateralsOutGrmColOpenUnitUnitCode",
    "outGrpCollateralsOutGrmColOpenUnitUnitUnitName",
    "outGrpCollateralsOutGrmAccFixingRateRate",
    "outGrpCollateralsOutGrmAccLtvTotIefSuppliedNumber152",
    "outGrpCollateralsOutGrmColYieldDcAccountCollateralYieldLimitAmn",
    "outGrpCollateralsOutGrmAccSystemCollateralWorkSystemDesc"
})
public class MC2003VOutGrpCollateralsItem {

    @XmlElement(name = "OutGrpCollateralsOutGrmAccLtvIefSuppliedNumber152", required = true)
    protected BigDecimal outGrpCollateralsOutGrmAccLtvIefSuppliedNumber152;
    @XmlElement(name = "OutGrpCollateralsOutGrmAccBalanceIefSuppliedNumber152", required = true)
    protected BigDecimal outGrpCollateralsOutGrmAccBalanceIefSuppliedNumber152;
    @XmlElement(name = "OutGrpCollateralsOutGrmAccBalanceDcIefSuppliedAmount", required = true)
    protected BigDecimal outGrpCollateralsOutGrmAccBalanceDcIefSuppliedAmount;
    @XmlElement(name = "OutGrpCollateralsOutGrmAccStatusIefSuppliedActionEntryDesc")
    protected String outGrpCollateralsOutGrmAccStatusIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutGrpCollateralsOutGrmScharIefSuppliedSelectChar")
    protected String outGrpCollateralsOutGrmScharIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpCollateralsOutGrmColProductIdProduct")
    protected int outGrpCollateralsOutGrmColProductIdProduct;
    @XmlElement(name = "OutGrpCollateralsOutGrmColProductDescription")
    protected String outGrpCollateralsOutGrmColProductDescription;
    @XmlElement(name = "OutGrpCollateralsOutGrmAccCurrencyIdCurrency")
    protected int outGrpCollateralsOutGrmAccCurrencyIdCurrency;
    @XmlElement(name = "OutGrpCollateralsOutGrmAccCurrencyShortDescr")
    protected String outGrpCollateralsOutGrmAccCurrencyShortDescr;
    @XmlElement(name = "OutGrpCollateralsOutGrmAccProductIdProduct")
    protected int outGrpCollateralsOutGrmAccProductIdProduct;
    @XmlElement(name = "OutGrpCollateralsOutGrmAccProductDescription")
    protected String outGrpCollateralsOutGrmAccProductDescription;
    @XmlElement(name = "OutGrpCollateralsOutGrmColCollateralCollateralSn")
    protected double outGrpCollateralsOutGrmColCollateralCollateralSn;
    @XmlElement(name = "OutGrpCollateralsOutGrmColCollateralCollateralCode")
    protected String outGrpCollateralsOutGrmColCollateralCollateralCode;
    @XmlElement(name = "OutGrpCollateralsOutGrmColCollateralReviseDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpCollateralsOutGrmColCollateralReviseDt;
    @XmlElement(name = "OutGrpCollateralsOutGrmColCollateralCollateralStatus")
    protected String outGrpCollateralsOutGrmColCollateralCollateralStatus;
    @XmlElement(name = "OutGrpCollateralsOutGrmColCollateralEstimationDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpCollateralsOutGrmColCollateralEstimationDt;
    @XmlElement(name = "OutGrpCollateralsOutGrmColCollateralItemsCnt")
    protected int outGrpCollateralsOutGrmColCollateralItemsCnt;
    @XmlElement(name = "OutGrpCollateralsOutGrmColAccountCollateralEstValueAmn", required = true)
    protected BigDecimal outGrpCollateralsOutGrmColAccountCollateralEstValueAmn;
    @XmlElement(name = "OutGrpCollateralsOutGrmColAccountCollateralEstInsuranceAmn", required = true)
    protected BigDecimal outGrpCollateralsOutGrmColAccountCollateralEstInsuranceAmn;
    @XmlElement(name = "OutGrpCollateralsOutGrmColAccountCollateralReferenceNumber")
    protected String outGrpCollateralsOutGrmColAccountCollateralReferenceNumber;
    @XmlElement(name = "OutGrpCollateralsOutGrmColAccountCollateralExpiryDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpCollateralsOutGrmColAccountCollateralExpiryDt;
    @XmlElement(name = "OutGrpCollateralsOutGrmColAccountCollateralEntryStatus")
    protected String outGrpCollateralsOutGrmColAccountCollateralEntryStatus;
    @XmlElement(name = "OutGrpCollateralsOutGrmColAccountCollateralInsertionDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpCollateralsOutGrmColAccountCollateralInsertionDt;
    @XmlElement(name = "OutGrpCollateralsOutGrmColAccountCollateralFirstName")
    protected String outGrpCollateralsOutGrmColAccountCollateralFirstName;
    @XmlElement(name = "OutGrpCollateralsOutGrmColAccountCollateralSurname")
    protected String outGrpCollateralsOutGrmColAccountCollateralSurname;
    @XmlElement(name = "OutGrpCollateralsOutGrmColAccountCollateralAddress")
    protected String outGrpCollateralsOutGrmColAccountCollateralAddress;
    @XmlElement(name = "OutGrpCollateralsOutGrmColAccountCollateralAfmNo")
    protected String outGrpCollateralsOutGrmColAccountCollateralAfmNo;
    @XmlElement(name = "OutGrpCollateralsOutGrmColAccountCollateralPrftAccount")
    protected String outGrpCollateralsOutGrmColAccountCollateralPrftAccount;
    @XmlElement(name = "OutGrpCollateralsOutGrmColAccountCollateralAccountCd")
    protected short outGrpCollateralsOutGrmColAccountCollateralAccountCd;
    @XmlElement(name = "OutGrpCollateralsOutGrmColAccountCollateralDepAccInd")
    protected String outGrpCollateralsOutGrmColAccountCollateralDepAccInd;
    @XmlElement(name = "OutGrpCollateralsOutGrmColAccountCollateralUnitCode")
    protected int outGrpCollateralsOutGrmColAccountCollateralUnitCode;
    @XmlElement(name = "OutGrpCollateralsOutGrmColAccountCollateralNoteStatus")
    protected String outGrpCollateralsOutGrmColAccountCollateralNoteStatus;
    @XmlElement(name = "OutGrpCollateralsOutGrmColAccountCollateralYieldLimitAmn", required = true)
    protected BigDecimal outGrpCollateralsOutGrmColAccountCollateralYieldLimitAmn;
    @XmlElement(name = "OutGrpCollateralsOutGrmColAccountCollateralProfitsSystem")
    protected int outGrpCollateralsOutGrmColAccountCollateralProfitsSystem;
    @XmlElement(name = "OutGrpCollateralsOutGrmColCurrencyShortDescr")
    protected String outGrpCollateralsOutGrmColCurrencyShortDescr;
    @XmlElement(name = "OutGrpCollateralsOutGrmColCurrencyIdCurrency")
    protected int outGrpCollateralsOutGrmColCurrencyIdCurrency;
    @XmlElement(name = "OutGrpCollateralsOutGrmColTotEstimatedLossCollateralWorkEstimatedAccountLossDc", required = true)
    protected BigDecimal outGrpCollateralsOutGrmColTotEstimatedLossCollateralWorkEstimatedAccountLossDc;
    @XmlElement(name = "OutGrpCollateralsOutGrmColTotEstimatedLossCollateralWorkEstimatedAccountLossAc", required = true)
    protected BigDecimal outGrpCollateralsOutGrmColTotEstimatedLossCollateralWorkEstimatedAccountLossAc;
    @XmlElement(name = "OutGrpCollateralsOutGrmColOpenUnitUnitCode")
    protected int outGrpCollateralsOutGrmColOpenUnitUnitCode;
    @XmlElement(name = "OutGrpCollateralsOutGrmColOpenUnitUnitUnitName")
    protected String outGrpCollateralsOutGrmColOpenUnitUnitUnitName;
    @XmlElement(name = "OutGrpCollateralsOutGrmAccFixingRateRate", required = true)
    protected BigDecimal outGrpCollateralsOutGrmAccFixingRateRate;
    @XmlElement(name = "OutGrpCollateralsOutGrmAccLtvTotIefSuppliedNumber152", required = true)
    protected BigDecimal outGrpCollateralsOutGrmAccLtvTotIefSuppliedNumber152;
    @XmlElement(name = "OutGrpCollateralsOutGrmColYieldDcAccountCollateralYieldLimitAmn", required = true)
    protected BigDecimal outGrpCollateralsOutGrmColYieldDcAccountCollateralYieldLimitAmn;
    @XmlElement(name = "OutGrpCollateralsOutGrmAccSystemCollateralWorkSystemDesc")
    protected String outGrpCollateralsOutGrmAccSystemCollateralWorkSystemDesc;

    /**
     * Gets the value of the outGrpCollateralsOutGrmAccLtvIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpCollateralsOutGrmAccLtvIefSuppliedNumber152() {
        return outGrpCollateralsOutGrmAccLtvIefSuppliedNumber152;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmAccLtvIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpCollateralsOutGrmAccLtvIefSuppliedNumber152(BigDecimal value) {
        this.outGrpCollateralsOutGrmAccLtvIefSuppliedNumber152 = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmAccBalanceIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpCollateralsOutGrmAccBalanceIefSuppliedNumber152() {
        return outGrpCollateralsOutGrmAccBalanceIefSuppliedNumber152;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmAccBalanceIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpCollateralsOutGrmAccBalanceIefSuppliedNumber152(BigDecimal value) {
        this.outGrpCollateralsOutGrmAccBalanceIefSuppliedNumber152 = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmAccBalanceDcIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpCollateralsOutGrmAccBalanceDcIefSuppliedAmount() {
        return outGrpCollateralsOutGrmAccBalanceDcIefSuppliedAmount;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmAccBalanceDcIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpCollateralsOutGrmAccBalanceDcIefSuppliedAmount(BigDecimal value) {
        this.outGrpCollateralsOutGrmAccBalanceDcIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmAccStatusIefSuppliedActionEntryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCollateralsOutGrmAccStatusIefSuppliedActionEntryDesc() {
        return outGrpCollateralsOutGrmAccStatusIefSuppliedActionEntryDesc;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmAccStatusIefSuppliedActionEntryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCollateralsOutGrmAccStatusIefSuppliedActionEntryDesc(String value) {
        this.outGrpCollateralsOutGrmAccStatusIefSuppliedActionEntryDesc = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmScharIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCollateralsOutGrmScharIefSuppliedSelectChar() {
        return outGrpCollateralsOutGrmScharIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmScharIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCollateralsOutGrmScharIefSuppliedSelectChar(String value) {
        this.outGrpCollateralsOutGrmScharIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmColProductIdProduct property.
     * 
     */
    public int getOutGrpCollateralsOutGrmColProductIdProduct() {
        return outGrpCollateralsOutGrmColProductIdProduct;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmColProductIdProduct property.
     * 
     */
    public void setOutGrpCollateralsOutGrmColProductIdProduct(int value) {
        this.outGrpCollateralsOutGrmColProductIdProduct = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmColProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCollateralsOutGrmColProductDescription() {
        return outGrpCollateralsOutGrmColProductDescription;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmColProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCollateralsOutGrmColProductDescription(String value) {
        this.outGrpCollateralsOutGrmColProductDescription = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmAccCurrencyIdCurrency property.
     * 
     */
    public int getOutGrpCollateralsOutGrmAccCurrencyIdCurrency() {
        return outGrpCollateralsOutGrmAccCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmAccCurrencyIdCurrency property.
     * 
     */
    public void setOutGrpCollateralsOutGrmAccCurrencyIdCurrency(int value) {
        this.outGrpCollateralsOutGrmAccCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmAccCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCollateralsOutGrmAccCurrencyShortDescr() {
        return outGrpCollateralsOutGrmAccCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmAccCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCollateralsOutGrmAccCurrencyShortDescr(String value) {
        this.outGrpCollateralsOutGrmAccCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmAccProductIdProduct property.
     * 
     */
    public int getOutGrpCollateralsOutGrmAccProductIdProduct() {
        return outGrpCollateralsOutGrmAccProductIdProduct;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmAccProductIdProduct property.
     * 
     */
    public void setOutGrpCollateralsOutGrmAccProductIdProduct(int value) {
        this.outGrpCollateralsOutGrmAccProductIdProduct = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmAccProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCollateralsOutGrmAccProductDescription() {
        return outGrpCollateralsOutGrmAccProductDescription;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmAccProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCollateralsOutGrmAccProductDescription(String value) {
        this.outGrpCollateralsOutGrmAccProductDescription = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmColCollateralCollateralSn property.
     * 
     */
    public double getOutGrpCollateralsOutGrmColCollateralCollateralSn() {
        return outGrpCollateralsOutGrmColCollateralCollateralSn;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmColCollateralCollateralSn property.
     * 
     */
    public void setOutGrpCollateralsOutGrmColCollateralCollateralSn(double value) {
        this.outGrpCollateralsOutGrmColCollateralCollateralSn = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmColCollateralCollateralCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCollateralsOutGrmColCollateralCollateralCode() {
        return outGrpCollateralsOutGrmColCollateralCollateralCode;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmColCollateralCollateralCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCollateralsOutGrmColCollateralCollateralCode(String value) {
        this.outGrpCollateralsOutGrmColCollateralCollateralCode = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmColCollateralReviseDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpCollateralsOutGrmColCollateralReviseDt() {
        return outGrpCollateralsOutGrmColCollateralReviseDt;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmColCollateralReviseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpCollateralsOutGrmColCollateralReviseDt(XMLGregorianCalendar value) {
        this.outGrpCollateralsOutGrmColCollateralReviseDt = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmColCollateralCollateralStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCollateralsOutGrmColCollateralCollateralStatus() {
        return outGrpCollateralsOutGrmColCollateralCollateralStatus;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmColCollateralCollateralStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCollateralsOutGrmColCollateralCollateralStatus(String value) {
        this.outGrpCollateralsOutGrmColCollateralCollateralStatus = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmColCollateralEstimationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpCollateralsOutGrmColCollateralEstimationDt() {
        return outGrpCollateralsOutGrmColCollateralEstimationDt;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmColCollateralEstimationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpCollateralsOutGrmColCollateralEstimationDt(XMLGregorianCalendar value) {
        this.outGrpCollateralsOutGrmColCollateralEstimationDt = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmColCollateralItemsCnt property.
     * 
     */
    public int getOutGrpCollateralsOutGrmColCollateralItemsCnt() {
        return outGrpCollateralsOutGrmColCollateralItemsCnt;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmColCollateralItemsCnt property.
     * 
     */
    public void setOutGrpCollateralsOutGrmColCollateralItemsCnt(int value) {
        this.outGrpCollateralsOutGrmColCollateralItemsCnt = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmColAccountCollateralEstValueAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpCollateralsOutGrmColAccountCollateralEstValueAmn() {
        return outGrpCollateralsOutGrmColAccountCollateralEstValueAmn;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmColAccountCollateralEstValueAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpCollateralsOutGrmColAccountCollateralEstValueAmn(BigDecimal value) {
        this.outGrpCollateralsOutGrmColAccountCollateralEstValueAmn = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmColAccountCollateralEstInsuranceAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpCollateralsOutGrmColAccountCollateralEstInsuranceAmn() {
        return outGrpCollateralsOutGrmColAccountCollateralEstInsuranceAmn;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmColAccountCollateralEstInsuranceAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpCollateralsOutGrmColAccountCollateralEstInsuranceAmn(BigDecimal value) {
        this.outGrpCollateralsOutGrmColAccountCollateralEstInsuranceAmn = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmColAccountCollateralReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCollateralsOutGrmColAccountCollateralReferenceNumber() {
        return outGrpCollateralsOutGrmColAccountCollateralReferenceNumber;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmColAccountCollateralReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCollateralsOutGrmColAccountCollateralReferenceNumber(String value) {
        this.outGrpCollateralsOutGrmColAccountCollateralReferenceNumber = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmColAccountCollateralExpiryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpCollateralsOutGrmColAccountCollateralExpiryDt() {
        return outGrpCollateralsOutGrmColAccountCollateralExpiryDt;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmColAccountCollateralExpiryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpCollateralsOutGrmColAccountCollateralExpiryDt(XMLGregorianCalendar value) {
        this.outGrpCollateralsOutGrmColAccountCollateralExpiryDt = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmColAccountCollateralEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCollateralsOutGrmColAccountCollateralEntryStatus() {
        return outGrpCollateralsOutGrmColAccountCollateralEntryStatus;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmColAccountCollateralEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCollateralsOutGrmColAccountCollateralEntryStatus(String value) {
        this.outGrpCollateralsOutGrmColAccountCollateralEntryStatus = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmColAccountCollateralInsertionDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpCollateralsOutGrmColAccountCollateralInsertionDt() {
        return outGrpCollateralsOutGrmColAccountCollateralInsertionDt;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmColAccountCollateralInsertionDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpCollateralsOutGrmColAccountCollateralInsertionDt(XMLGregorianCalendar value) {
        this.outGrpCollateralsOutGrmColAccountCollateralInsertionDt = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmColAccountCollateralFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCollateralsOutGrmColAccountCollateralFirstName() {
        return outGrpCollateralsOutGrmColAccountCollateralFirstName;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmColAccountCollateralFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCollateralsOutGrmColAccountCollateralFirstName(String value) {
        this.outGrpCollateralsOutGrmColAccountCollateralFirstName = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmColAccountCollateralSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCollateralsOutGrmColAccountCollateralSurname() {
        return outGrpCollateralsOutGrmColAccountCollateralSurname;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmColAccountCollateralSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCollateralsOutGrmColAccountCollateralSurname(String value) {
        this.outGrpCollateralsOutGrmColAccountCollateralSurname = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmColAccountCollateralAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCollateralsOutGrmColAccountCollateralAddress() {
        return outGrpCollateralsOutGrmColAccountCollateralAddress;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmColAccountCollateralAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCollateralsOutGrmColAccountCollateralAddress(String value) {
        this.outGrpCollateralsOutGrmColAccountCollateralAddress = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmColAccountCollateralAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCollateralsOutGrmColAccountCollateralAfmNo() {
        return outGrpCollateralsOutGrmColAccountCollateralAfmNo;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmColAccountCollateralAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCollateralsOutGrmColAccountCollateralAfmNo(String value) {
        this.outGrpCollateralsOutGrmColAccountCollateralAfmNo = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmColAccountCollateralPrftAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCollateralsOutGrmColAccountCollateralPrftAccount() {
        return outGrpCollateralsOutGrmColAccountCollateralPrftAccount;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmColAccountCollateralPrftAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCollateralsOutGrmColAccountCollateralPrftAccount(String value) {
        this.outGrpCollateralsOutGrmColAccountCollateralPrftAccount = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmColAccountCollateralAccountCd property.
     * 
     */
    public short getOutGrpCollateralsOutGrmColAccountCollateralAccountCd() {
        return outGrpCollateralsOutGrmColAccountCollateralAccountCd;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmColAccountCollateralAccountCd property.
     * 
     */
    public void setOutGrpCollateralsOutGrmColAccountCollateralAccountCd(short value) {
        this.outGrpCollateralsOutGrmColAccountCollateralAccountCd = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmColAccountCollateralDepAccInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCollateralsOutGrmColAccountCollateralDepAccInd() {
        return outGrpCollateralsOutGrmColAccountCollateralDepAccInd;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmColAccountCollateralDepAccInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCollateralsOutGrmColAccountCollateralDepAccInd(String value) {
        this.outGrpCollateralsOutGrmColAccountCollateralDepAccInd = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmColAccountCollateralUnitCode property.
     * 
     */
    public int getOutGrpCollateralsOutGrmColAccountCollateralUnitCode() {
        return outGrpCollateralsOutGrmColAccountCollateralUnitCode;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmColAccountCollateralUnitCode property.
     * 
     */
    public void setOutGrpCollateralsOutGrmColAccountCollateralUnitCode(int value) {
        this.outGrpCollateralsOutGrmColAccountCollateralUnitCode = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmColAccountCollateralNoteStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCollateralsOutGrmColAccountCollateralNoteStatus() {
        return outGrpCollateralsOutGrmColAccountCollateralNoteStatus;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmColAccountCollateralNoteStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCollateralsOutGrmColAccountCollateralNoteStatus(String value) {
        this.outGrpCollateralsOutGrmColAccountCollateralNoteStatus = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmColAccountCollateralYieldLimitAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpCollateralsOutGrmColAccountCollateralYieldLimitAmn() {
        return outGrpCollateralsOutGrmColAccountCollateralYieldLimitAmn;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmColAccountCollateralYieldLimitAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpCollateralsOutGrmColAccountCollateralYieldLimitAmn(BigDecimal value) {
        this.outGrpCollateralsOutGrmColAccountCollateralYieldLimitAmn = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmColAccountCollateralProfitsSystem property.
     * 
     */
    public int getOutGrpCollateralsOutGrmColAccountCollateralProfitsSystem() {
        return outGrpCollateralsOutGrmColAccountCollateralProfitsSystem;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmColAccountCollateralProfitsSystem property.
     * 
     */
    public void setOutGrpCollateralsOutGrmColAccountCollateralProfitsSystem(int value) {
        this.outGrpCollateralsOutGrmColAccountCollateralProfitsSystem = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmColCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCollateralsOutGrmColCurrencyShortDescr() {
        return outGrpCollateralsOutGrmColCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmColCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCollateralsOutGrmColCurrencyShortDescr(String value) {
        this.outGrpCollateralsOutGrmColCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmColCurrencyIdCurrency property.
     * 
     */
    public int getOutGrpCollateralsOutGrmColCurrencyIdCurrency() {
        return outGrpCollateralsOutGrmColCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmColCurrencyIdCurrency property.
     * 
     */
    public void setOutGrpCollateralsOutGrmColCurrencyIdCurrency(int value) {
        this.outGrpCollateralsOutGrmColCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmColTotEstimatedLossCollateralWorkEstimatedAccountLossDc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpCollateralsOutGrmColTotEstimatedLossCollateralWorkEstimatedAccountLossDc() {
        return outGrpCollateralsOutGrmColTotEstimatedLossCollateralWorkEstimatedAccountLossDc;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmColTotEstimatedLossCollateralWorkEstimatedAccountLossDc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpCollateralsOutGrmColTotEstimatedLossCollateralWorkEstimatedAccountLossDc(BigDecimal value) {
        this.outGrpCollateralsOutGrmColTotEstimatedLossCollateralWorkEstimatedAccountLossDc = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmColTotEstimatedLossCollateralWorkEstimatedAccountLossAc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpCollateralsOutGrmColTotEstimatedLossCollateralWorkEstimatedAccountLossAc() {
        return outGrpCollateralsOutGrmColTotEstimatedLossCollateralWorkEstimatedAccountLossAc;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmColTotEstimatedLossCollateralWorkEstimatedAccountLossAc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpCollateralsOutGrmColTotEstimatedLossCollateralWorkEstimatedAccountLossAc(BigDecimal value) {
        this.outGrpCollateralsOutGrmColTotEstimatedLossCollateralWorkEstimatedAccountLossAc = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmColOpenUnitUnitCode property.
     * 
     */
    public int getOutGrpCollateralsOutGrmColOpenUnitUnitCode() {
        return outGrpCollateralsOutGrmColOpenUnitUnitCode;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmColOpenUnitUnitCode property.
     * 
     */
    public void setOutGrpCollateralsOutGrmColOpenUnitUnitCode(int value) {
        this.outGrpCollateralsOutGrmColOpenUnitUnitCode = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmColOpenUnitUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCollateralsOutGrmColOpenUnitUnitUnitName() {
        return outGrpCollateralsOutGrmColOpenUnitUnitUnitName;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmColOpenUnitUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCollateralsOutGrmColOpenUnitUnitUnitName(String value) {
        this.outGrpCollateralsOutGrmColOpenUnitUnitUnitName = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmAccFixingRateRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpCollateralsOutGrmAccFixingRateRate() {
        return outGrpCollateralsOutGrmAccFixingRateRate;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmAccFixingRateRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpCollateralsOutGrmAccFixingRateRate(BigDecimal value) {
        this.outGrpCollateralsOutGrmAccFixingRateRate = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmAccLtvTotIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpCollateralsOutGrmAccLtvTotIefSuppliedNumber152() {
        return outGrpCollateralsOutGrmAccLtvTotIefSuppliedNumber152;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmAccLtvTotIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpCollateralsOutGrmAccLtvTotIefSuppliedNumber152(BigDecimal value) {
        this.outGrpCollateralsOutGrmAccLtvTotIefSuppliedNumber152 = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmColYieldDcAccountCollateralYieldLimitAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpCollateralsOutGrmColYieldDcAccountCollateralYieldLimitAmn() {
        return outGrpCollateralsOutGrmColYieldDcAccountCollateralYieldLimitAmn;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmColYieldDcAccountCollateralYieldLimitAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpCollateralsOutGrmColYieldDcAccountCollateralYieldLimitAmn(BigDecimal value) {
        this.outGrpCollateralsOutGrmColYieldDcAccountCollateralYieldLimitAmn = value;
    }

    /**
     * Gets the value of the outGrpCollateralsOutGrmAccSystemCollateralWorkSystemDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCollateralsOutGrmAccSystemCollateralWorkSystemDesc() {
        return outGrpCollateralsOutGrmAccSystemCollateralWorkSystemDesc;
    }

    /**
     * Sets the value of the outGrpCollateralsOutGrmAccSystemCollateralWorkSystemDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCollateralsOutGrmAccSystemCollateralWorkSystemDesc(String value) {
        this.outGrpCollateralsOutGrmAccSystemCollateralWorkSystemDesc = value;
    }

}
