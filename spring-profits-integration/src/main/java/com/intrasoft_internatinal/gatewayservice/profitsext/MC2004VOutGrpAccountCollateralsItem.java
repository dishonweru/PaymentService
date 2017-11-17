
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MC2004VOutGrpAccountCollateralsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MC2004VOutGrpAccountCollateralsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmAccountCollateralAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmAccountCollateralAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmAccountCollateralAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmAccountCollateralDepAccInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmAccountCollateralEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmAccountCollateralEstInsuranceAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmAccountCollateralEstValueAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmAccountCollateralExpiryDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmAccountCollateralExpiryDt_Str" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmAccountCollateralFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmAccountCollateralInsertionDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmAccountCollateralInsertionDt_Str" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmAccountCollateralNoteStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmAccountCollateralPrftAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmAccountCollateralProfitsSystem" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmAccountCollateralReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmAccountCollateralSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmAccountCollateralTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmAccountCollateralTmstamp_Str" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmAccountCollateralUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmAccountCollateralUserCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmCollOpenUnitUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmCollOpenUnitUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmCollatCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmCollateralCollateralCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmCollateralCollateralSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmCollateralReviseDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmCollateralReviseDt_Str" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmCollateralCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmCollateralProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmCollateralProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedInsurValueAc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedInsurValueDc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedValueAc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedValueDc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MC2004VOutGrpAccountCollateralsItem", propOrder = {
    "outGrpAccountCollateralsOutGrmAccountCollateralAccountCd",
    "outGrpAccountCollateralsOutGrmAccountCollateralAddress",
    "outGrpAccountCollateralsOutGrmAccountCollateralAfmNo",
    "outGrpAccountCollateralsOutGrmAccountCollateralDepAccInd",
    "outGrpAccountCollateralsOutGrmAccountCollateralEntryStatus",
    "outGrpAccountCollateralsOutGrmAccountCollateralEstInsuranceAmn",
    "outGrpAccountCollateralsOutGrmAccountCollateralEstValueAmn",
    "outGrpAccountCollateralsOutGrmAccountCollateralExpiryDt",
    "outGrpAccountCollateralsOutGrmAccountCollateralExpiryDtStr",
    "outGrpAccountCollateralsOutGrmAccountCollateralFirstName",
    "outGrpAccountCollateralsOutGrmAccountCollateralInsertionDt",
    "outGrpAccountCollateralsOutGrmAccountCollateralInsertionDtStr",
    "outGrpAccountCollateralsOutGrmAccountCollateralNoteStatus",
    "outGrpAccountCollateralsOutGrmAccountCollateralPrftAccount",
    "outGrpAccountCollateralsOutGrmAccountCollateralProfitsSystem",
    "outGrpAccountCollateralsOutGrmAccountCollateralReferenceNumber",
    "outGrpAccountCollateralsOutGrmAccountCollateralSurname",
    "outGrpAccountCollateralsOutGrmAccountCollateralTmstamp",
    "outGrpAccountCollateralsOutGrmAccountCollateralTmstampStr",
    "outGrpAccountCollateralsOutGrmAccountCollateralUnitCode",
    "outGrpAccountCollateralsOutGrmAccountCollateralUserCode",
    "outGrpAccountCollateralsOutGrmCollOpenUnitUnitCode",
    "outGrpAccountCollateralsOutGrmCollOpenUnitUnitUnitName",
    "outGrpAccountCollateralsOutGrmCollatCurrencyShortDescr",
    "outGrpAccountCollateralsOutGrmCollateralCollateralCode",
    "outGrpAccountCollateralsOutGrmCollateralCollateralSn",
    "outGrpAccountCollateralsOutGrmCollateralReviseDt",
    "outGrpAccountCollateralsOutGrmCollateralReviseDtStr",
    "outGrpAccountCollateralsOutGrmCollateralCustomerCustId",
    "outGrpAccountCollateralsOutGrmCollateralProductDescription",
    "outGrpAccountCollateralsOutGrmCollateralProductIdProduct",
    "outGrpAccountCollateralsOutGrmIefSuppliedSelectChar",
    "outGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedInsurValueAc",
    "outGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedInsurValueDc",
    "outGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedValueAc",
    "outGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedValueDc"
})
public class MC2004VOutGrpAccountCollateralsItem {

    @XmlElement(name = "OutGrpAccountCollateralsOutGrmAccountCollateralAccountCd")
    protected short outGrpAccountCollateralsOutGrmAccountCollateralAccountCd;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmAccountCollateralAddress")
    protected String outGrpAccountCollateralsOutGrmAccountCollateralAddress;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmAccountCollateralAfmNo")
    protected String outGrpAccountCollateralsOutGrmAccountCollateralAfmNo;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmAccountCollateralDepAccInd")
    protected String outGrpAccountCollateralsOutGrmAccountCollateralDepAccInd;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmAccountCollateralEntryStatus")
    protected String outGrpAccountCollateralsOutGrmAccountCollateralEntryStatus;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmAccountCollateralEstInsuranceAmn", required = true)
    protected BigDecimal outGrpAccountCollateralsOutGrmAccountCollateralEstInsuranceAmn;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmAccountCollateralEstValueAmn", required = true)
    protected BigDecimal outGrpAccountCollateralsOutGrmAccountCollateralEstValueAmn;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmAccountCollateralExpiryDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpAccountCollateralsOutGrmAccountCollateralExpiryDt;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmAccountCollateralExpiryDt_Str")
    protected String outGrpAccountCollateralsOutGrmAccountCollateralExpiryDtStr;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmAccountCollateralFirstName")
    protected String outGrpAccountCollateralsOutGrmAccountCollateralFirstName;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmAccountCollateralInsertionDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpAccountCollateralsOutGrmAccountCollateralInsertionDt;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmAccountCollateralInsertionDt_Str")
    protected String outGrpAccountCollateralsOutGrmAccountCollateralInsertionDtStr;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmAccountCollateralNoteStatus")
    protected String outGrpAccountCollateralsOutGrmAccountCollateralNoteStatus;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmAccountCollateralPrftAccount")
    protected String outGrpAccountCollateralsOutGrmAccountCollateralPrftAccount;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmAccountCollateralProfitsSystem")
    protected int outGrpAccountCollateralsOutGrmAccountCollateralProfitsSystem;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmAccountCollateralReferenceNumber")
    protected String outGrpAccountCollateralsOutGrmAccountCollateralReferenceNumber;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmAccountCollateralSurname")
    protected String outGrpAccountCollateralsOutGrmAccountCollateralSurname;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmAccountCollateralTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpAccountCollateralsOutGrmAccountCollateralTmstamp;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmAccountCollateralTmstamp_Str")
    protected String outGrpAccountCollateralsOutGrmAccountCollateralTmstampStr;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmAccountCollateralUnitCode")
    protected int outGrpAccountCollateralsOutGrmAccountCollateralUnitCode;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmAccountCollateralUserCode")
    protected String outGrpAccountCollateralsOutGrmAccountCollateralUserCode;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmCollOpenUnitUnitCode")
    protected int outGrpAccountCollateralsOutGrmCollOpenUnitUnitCode;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmCollOpenUnitUnitUnitName")
    protected String outGrpAccountCollateralsOutGrmCollOpenUnitUnitUnitName;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmCollatCurrencyShortDescr")
    protected String outGrpAccountCollateralsOutGrmCollatCurrencyShortDescr;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmCollateralCollateralCode")
    protected String outGrpAccountCollateralsOutGrmCollateralCollateralCode;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmCollateralCollateralSn")
    protected double outGrpAccountCollateralsOutGrmCollateralCollateralSn;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmCollateralReviseDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpAccountCollateralsOutGrmCollateralReviseDt;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmCollateralReviseDt_Str")
    protected String outGrpAccountCollateralsOutGrmCollateralReviseDtStr;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmCollateralCustomerCustId")
    protected int outGrpAccountCollateralsOutGrmCollateralCustomerCustId;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmCollateralProductDescription")
    protected String outGrpAccountCollateralsOutGrmCollateralProductDescription;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmCollateralProductIdProduct")
    protected int outGrpAccountCollateralsOutGrmCollateralProductIdProduct;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmIefSuppliedSelectChar")
    protected String outGrpAccountCollateralsOutGrmIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedInsurValueAc", required = true)
    protected BigDecimal outGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedInsurValueAc;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedInsurValueDc", required = true)
    protected BigDecimal outGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedInsurValueDc;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedValueAc", required = true)
    protected BigDecimal outGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedValueAc;
    @XmlElement(name = "OutGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedValueDc", required = true)
    protected BigDecimal outGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedValueDc;

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmAccountCollateralAccountCd property.
     * 
     */
    public short getOutGrpAccountCollateralsOutGrmAccountCollateralAccountCd() {
        return outGrpAccountCollateralsOutGrmAccountCollateralAccountCd;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmAccountCollateralAccountCd property.
     * 
     */
    public void setOutGrpAccountCollateralsOutGrmAccountCollateralAccountCd(short value) {
        this.outGrpAccountCollateralsOutGrmAccountCollateralAccountCd = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmAccountCollateralAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAccountCollateralsOutGrmAccountCollateralAddress() {
        return outGrpAccountCollateralsOutGrmAccountCollateralAddress;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmAccountCollateralAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAccountCollateralsOutGrmAccountCollateralAddress(String value) {
        this.outGrpAccountCollateralsOutGrmAccountCollateralAddress = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmAccountCollateralAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAccountCollateralsOutGrmAccountCollateralAfmNo() {
        return outGrpAccountCollateralsOutGrmAccountCollateralAfmNo;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmAccountCollateralAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAccountCollateralsOutGrmAccountCollateralAfmNo(String value) {
        this.outGrpAccountCollateralsOutGrmAccountCollateralAfmNo = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmAccountCollateralDepAccInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAccountCollateralsOutGrmAccountCollateralDepAccInd() {
        return outGrpAccountCollateralsOutGrmAccountCollateralDepAccInd;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmAccountCollateralDepAccInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAccountCollateralsOutGrmAccountCollateralDepAccInd(String value) {
        this.outGrpAccountCollateralsOutGrmAccountCollateralDepAccInd = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmAccountCollateralEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAccountCollateralsOutGrmAccountCollateralEntryStatus() {
        return outGrpAccountCollateralsOutGrmAccountCollateralEntryStatus;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmAccountCollateralEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAccountCollateralsOutGrmAccountCollateralEntryStatus(String value) {
        this.outGrpAccountCollateralsOutGrmAccountCollateralEntryStatus = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmAccountCollateralEstInsuranceAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAccountCollateralsOutGrmAccountCollateralEstInsuranceAmn() {
        return outGrpAccountCollateralsOutGrmAccountCollateralEstInsuranceAmn;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmAccountCollateralEstInsuranceAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAccountCollateralsOutGrmAccountCollateralEstInsuranceAmn(BigDecimal value) {
        this.outGrpAccountCollateralsOutGrmAccountCollateralEstInsuranceAmn = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmAccountCollateralEstValueAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAccountCollateralsOutGrmAccountCollateralEstValueAmn() {
        return outGrpAccountCollateralsOutGrmAccountCollateralEstValueAmn;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmAccountCollateralEstValueAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAccountCollateralsOutGrmAccountCollateralEstValueAmn(BigDecimal value) {
        this.outGrpAccountCollateralsOutGrmAccountCollateralEstValueAmn = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmAccountCollateralExpiryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpAccountCollateralsOutGrmAccountCollateralExpiryDt() {
        return outGrpAccountCollateralsOutGrmAccountCollateralExpiryDt;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmAccountCollateralExpiryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpAccountCollateralsOutGrmAccountCollateralExpiryDt(XMLGregorianCalendar value) {
        this.outGrpAccountCollateralsOutGrmAccountCollateralExpiryDt = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmAccountCollateralExpiryDtStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAccountCollateralsOutGrmAccountCollateralExpiryDtStr() {
        return outGrpAccountCollateralsOutGrmAccountCollateralExpiryDtStr;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmAccountCollateralExpiryDtStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAccountCollateralsOutGrmAccountCollateralExpiryDtStr(String value) {
        this.outGrpAccountCollateralsOutGrmAccountCollateralExpiryDtStr = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmAccountCollateralFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAccountCollateralsOutGrmAccountCollateralFirstName() {
        return outGrpAccountCollateralsOutGrmAccountCollateralFirstName;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmAccountCollateralFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAccountCollateralsOutGrmAccountCollateralFirstName(String value) {
        this.outGrpAccountCollateralsOutGrmAccountCollateralFirstName = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmAccountCollateralInsertionDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpAccountCollateralsOutGrmAccountCollateralInsertionDt() {
        return outGrpAccountCollateralsOutGrmAccountCollateralInsertionDt;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmAccountCollateralInsertionDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpAccountCollateralsOutGrmAccountCollateralInsertionDt(XMLGregorianCalendar value) {
        this.outGrpAccountCollateralsOutGrmAccountCollateralInsertionDt = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmAccountCollateralInsertionDtStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAccountCollateralsOutGrmAccountCollateralInsertionDtStr() {
        return outGrpAccountCollateralsOutGrmAccountCollateralInsertionDtStr;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmAccountCollateralInsertionDtStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAccountCollateralsOutGrmAccountCollateralInsertionDtStr(String value) {
        this.outGrpAccountCollateralsOutGrmAccountCollateralInsertionDtStr = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmAccountCollateralNoteStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAccountCollateralsOutGrmAccountCollateralNoteStatus() {
        return outGrpAccountCollateralsOutGrmAccountCollateralNoteStatus;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmAccountCollateralNoteStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAccountCollateralsOutGrmAccountCollateralNoteStatus(String value) {
        this.outGrpAccountCollateralsOutGrmAccountCollateralNoteStatus = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmAccountCollateralPrftAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAccountCollateralsOutGrmAccountCollateralPrftAccount() {
        return outGrpAccountCollateralsOutGrmAccountCollateralPrftAccount;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmAccountCollateralPrftAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAccountCollateralsOutGrmAccountCollateralPrftAccount(String value) {
        this.outGrpAccountCollateralsOutGrmAccountCollateralPrftAccount = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmAccountCollateralProfitsSystem property.
     * 
     */
    public int getOutGrpAccountCollateralsOutGrmAccountCollateralProfitsSystem() {
        return outGrpAccountCollateralsOutGrmAccountCollateralProfitsSystem;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmAccountCollateralProfitsSystem property.
     * 
     */
    public void setOutGrpAccountCollateralsOutGrmAccountCollateralProfitsSystem(int value) {
        this.outGrpAccountCollateralsOutGrmAccountCollateralProfitsSystem = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmAccountCollateralReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAccountCollateralsOutGrmAccountCollateralReferenceNumber() {
        return outGrpAccountCollateralsOutGrmAccountCollateralReferenceNumber;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmAccountCollateralReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAccountCollateralsOutGrmAccountCollateralReferenceNumber(String value) {
        this.outGrpAccountCollateralsOutGrmAccountCollateralReferenceNumber = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmAccountCollateralSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAccountCollateralsOutGrmAccountCollateralSurname() {
        return outGrpAccountCollateralsOutGrmAccountCollateralSurname;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmAccountCollateralSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAccountCollateralsOutGrmAccountCollateralSurname(String value) {
        this.outGrpAccountCollateralsOutGrmAccountCollateralSurname = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmAccountCollateralTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpAccountCollateralsOutGrmAccountCollateralTmstamp() {
        return outGrpAccountCollateralsOutGrmAccountCollateralTmstamp;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmAccountCollateralTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpAccountCollateralsOutGrmAccountCollateralTmstamp(XMLGregorianCalendar value) {
        this.outGrpAccountCollateralsOutGrmAccountCollateralTmstamp = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmAccountCollateralTmstampStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAccountCollateralsOutGrmAccountCollateralTmstampStr() {
        return outGrpAccountCollateralsOutGrmAccountCollateralTmstampStr;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmAccountCollateralTmstampStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAccountCollateralsOutGrmAccountCollateralTmstampStr(String value) {
        this.outGrpAccountCollateralsOutGrmAccountCollateralTmstampStr = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmAccountCollateralUnitCode property.
     * 
     */
    public int getOutGrpAccountCollateralsOutGrmAccountCollateralUnitCode() {
        return outGrpAccountCollateralsOutGrmAccountCollateralUnitCode;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmAccountCollateralUnitCode property.
     * 
     */
    public void setOutGrpAccountCollateralsOutGrmAccountCollateralUnitCode(int value) {
        this.outGrpAccountCollateralsOutGrmAccountCollateralUnitCode = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmAccountCollateralUserCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAccountCollateralsOutGrmAccountCollateralUserCode() {
        return outGrpAccountCollateralsOutGrmAccountCollateralUserCode;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmAccountCollateralUserCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAccountCollateralsOutGrmAccountCollateralUserCode(String value) {
        this.outGrpAccountCollateralsOutGrmAccountCollateralUserCode = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmCollOpenUnitUnitCode property.
     * 
     */
    public int getOutGrpAccountCollateralsOutGrmCollOpenUnitUnitCode() {
        return outGrpAccountCollateralsOutGrmCollOpenUnitUnitCode;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmCollOpenUnitUnitCode property.
     * 
     */
    public void setOutGrpAccountCollateralsOutGrmCollOpenUnitUnitCode(int value) {
        this.outGrpAccountCollateralsOutGrmCollOpenUnitUnitCode = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmCollOpenUnitUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAccountCollateralsOutGrmCollOpenUnitUnitUnitName() {
        return outGrpAccountCollateralsOutGrmCollOpenUnitUnitUnitName;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmCollOpenUnitUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAccountCollateralsOutGrmCollOpenUnitUnitUnitName(String value) {
        this.outGrpAccountCollateralsOutGrmCollOpenUnitUnitUnitName = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmCollatCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAccountCollateralsOutGrmCollatCurrencyShortDescr() {
        return outGrpAccountCollateralsOutGrmCollatCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmCollatCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAccountCollateralsOutGrmCollatCurrencyShortDescr(String value) {
        this.outGrpAccountCollateralsOutGrmCollatCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmCollateralCollateralCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAccountCollateralsOutGrmCollateralCollateralCode() {
        return outGrpAccountCollateralsOutGrmCollateralCollateralCode;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmCollateralCollateralCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAccountCollateralsOutGrmCollateralCollateralCode(String value) {
        this.outGrpAccountCollateralsOutGrmCollateralCollateralCode = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmCollateralCollateralSn property.
     * 
     */
    public double getOutGrpAccountCollateralsOutGrmCollateralCollateralSn() {
        return outGrpAccountCollateralsOutGrmCollateralCollateralSn;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmCollateralCollateralSn property.
     * 
     */
    public void setOutGrpAccountCollateralsOutGrmCollateralCollateralSn(double value) {
        this.outGrpAccountCollateralsOutGrmCollateralCollateralSn = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmCollateralReviseDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpAccountCollateralsOutGrmCollateralReviseDt() {
        return outGrpAccountCollateralsOutGrmCollateralReviseDt;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmCollateralReviseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpAccountCollateralsOutGrmCollateralReviseDt(XMLGregorianCalendar value) {
        this.outGrpAccountCollateralsOutGrmCollateralReviseDt = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmCollateralReviseDtStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAccountCollateralsOutGrmCollateralReviseDtStr() {
        return outGrpAccountCollateralsOutGrmCollateralReviseDtStr;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmCollateralReviseDtStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAccountCollateralsOutGrmCollateralReviseDtStr(String value) {
        this.outGrpAccountCollateralsOutGrmCollateralReviseDtStr = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmCollateralCustomerCustId property.
     * 
     */
    public int getOutGrpAccountCollateralsOutGrmCollateralCustomerCustId() {
        return outGrpAccountCollateralsOutGrmCollateralCustomerCustId;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmCollateralCustomerCustId property.
     * 
     */
    public void setOutGrpAccountCollateralsOutGrmCollateralCustomerCustId(int value) {
        this.outGrpAccountCollateralsOutGrmCollateralCustomerCustId = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmCollateralProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAccountCollateralsOutGrmCollateralProductDescription() {
        return outGrpAccountCollateralsOutGrmCollateralProductDescription;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmCollateralProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAccountCollateralsOutGrmCollateralProductDescription(String value) {
        this.outGrpAccountCollateralsOutGrmCollateralProductDescription = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmCollateralProductIdProduct property.
     * 
     */
    public int getOutGrpAccountCollateralsOutGrmCollateralProductIdProduct() {
        return outGrpAccountCollateralsOutGrmCollateralProductIdProduct;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmCollateralProductIdProduct property.
     * 
     */
    public void setOutGrpAccountCollateralsOutGrmCollateralProductIdProduct(int value) {
        this.outGrpAccountCollateralsOutGrmCollateralProductIdProduct = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAccountCollateralsOutGrmIefSuppliedSelectChar() {
        return outGrpAccountCollateralsOutGrmIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAccountCollateralsOutGrmIefSuppliedSelectChar(String value) {
        this.outGrpAccountCollateralsOutGrmIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedInsurValueAc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedInsurValueAc() {
        return outGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedInsurValueAc;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedInsurValueAc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedInsurValueAc(BigDecimal value) {
        this.outGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedInsurValueAc = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedInsurValueDc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedInsurValueDc() {
        return outGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedInsurValueDc;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedInsurValueDc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedInsurValueDc(BigDecimal value) {
        this.outGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedInsurValueDc = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedValueAc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedValueAc() {
        return outGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedValueAc;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedValueAc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedValueAc(BigDecimal value) {
        this.outGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedValueAc = value;
    }

    /**
     * Gets the value of the outGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedValueDc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedValueDc() {
        return outGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedValueDc;
    }

    /**
     * Sets the value of the outGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedValueDc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedValueDc(BigDecimal value) {
        this.outGrpAccountCollateralsOutGrmLaccDomCollateralWorkEstimatedValueDc = value;
    }

}
