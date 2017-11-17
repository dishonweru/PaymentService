
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for T1423VOutGrpLgAccExtraitItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T1423VOutGrpLgAccExtraitItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmAccBankBalIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmChrCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmChrCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmJustifDescCharSuppliedChar20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmLgAccountExtraitAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmLgAccountExtraitAccCurr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmLgAccountExtraitAccSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmLgAccountExtraitAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmLgAccountExtraitAccUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmLgAccountExtraitChrCurr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmLgAccountExtraitComInCcAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmLgAccountExtraitCommissionAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmLgAccountExtraitEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmLgAccountExtraitExpInCcAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmLgAccountExtraitExpenseAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmLgAccountExtraitExtraitComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmLgAccountExtraitJustificationCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmLgAccountExtraitLgAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmLgAccountExtraitPrvAccountBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmLgAccountExtraitTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmLgAccountExtraitTransactionCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmLgAccountExtraitTrxAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmLgAccountExtraitTrxCurr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmLgAccountExtraitTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmLgAccountExtraitTrxInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmLgAccountExtraitTrxSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmLgAccountExtraitTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmLgAccountExtraitTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmLgAccountExtraitValeurDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmLgHistoryDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmLgHistoryDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmLgHistoryTrxAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmRequestLoanStsCharSuppliedChar20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmRequestTypeCharSuppliedChar20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmTrxCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLgAccExtraitOutGrmTrxCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T1423VOutGrpLgAccExtraitItem", propOrder = {
    "outGrpLgAccExtraitOutGrmAccBankBalIefSuppliedNumber152",
    "outGrpLgAccExtraitOutGrmChrCurrencyIdCurrency",
    "outGrpLgAccExtraitOutGrmChrCurrencyShortDescr",
    "outGrpLgAccExtraitOutGrmIefSuppliedSelectChar",
    "outGrpLgAccExtraitOutGrmJustifDescCharSuppliedChar20",
    "outGrpLgAccExtraitOutGrmLgAccountExtraitAccCd",
    "outGrpLgAccExtraitOutGrmLgAccountExtraitAccCurr",
    "outGrpLgAccExtraitOutGrmLgAccountExtraitAccSn",
    "outGrpLgAccExtraitOutGrmLgAccountExtraitAccType",
    "outGrpLgAccExtraitOutGrmLgAccountExtraitAccUnit",
    "outGrpLgAccExtraitOutGrmLgAccountExtraitChrCurr",
    "outGrpLgAccExtraitOutGrmLgAccountExtraitComInCcAmn",
    "outGrpLgAccExtraitOutGrmLgAccountExtraitCommissionAmn",
    "outGrpLgAccExtraitOutGrmLgAccountExtraitEntryStatus",
    "outGrpLgAccExtraitOutGrmLgAccountExtraitExpInCcAmn",
    "outGrpLgAccExtraitOutGrmLgAccountExtraitExpenseAmn",
    "outGrpLgAccExtraitOutGrmLgAccountExtraitExtraitComments",
    "outGrpLgAccExtraitOutGrmLgAccountExtraitJustificationCode",
    "outGrpLgAccExtraitOutGrmLgAccountExtraitLgAmn",
    "outGrpLgAccExtraitOutGrmLgAccountExtraitPrvAccountBal",
    "outGrpLgAccExtraitOutGrmLgAccountExtraitTmstamp",
    "outGrpLgAccExtraitOutGrmLgAccountExtraitTransactionCode",
    "outGrpLgAccExtraitOutGrmLgAccountExtraitTrxAmn",
    "outGrpLgAccExtraitOutGrmLgAccountExtraitTrxCurr",
    "outGrpLgAccExtraitOutGrmLgAccountExtraitTrxDate",
    "outGrpLgAccExtraitOutGrmLgAccountExtraitTrxInternalSn",
    "outGrpLgAccExtraitOutGrmLgAccountExtraitTrxSn",
    "outGrpLgAccExtraitOutGrmLgAccountExtraitTrxUnit",
    "outGrpLgAccExtraitOutGrmLgAccountExtraitTrxUsr",
    "outGrpLgAccExtraitOutGrmLgAccountExtraitValeurDt",
    "outGrpLgAccExtraitOutGrmLgHistoryDateFrom",
    "outGrpLgAccExtraitOutGrmLgHistoryDateTo",
    "outGrpLgAccExtraitOutGrmLgHistoryTrxAmn",
    "outGrpLgAccExtraitOutGrmRequestLoanStsCharSuppliedChar20",
    "outGrpLgAccExtraitOutGrmRequestTypeCharSuppliedChar20",
    "outGrpLgAccExtraitOutGrmTrxCurrencyIdCurrency",
    "outGrpLgAccExtraitOutGrmTrxCurrencyShortDescr"
})
public class T1423VOutGrpLgAccExtraitItem {

    @XmlElement(name = "OutGrpLgAccExtraitOutGrmAccBankBalIefSuppliedNumber152", required = true)
    protected BigDecimal outGrpLgAccExtraitOutGrmAccBankBalIefSuppliedNumber152;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmChrCurrencyIdCurrency")
    protected int outGrpLgAccExtraitOutGrmChrCurrencyIdCurrency;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmChrCurrencyShortDescr")
    protected String outGrpLgAccExtraitOutGrmChrCurrencyShortDescr;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmIefSuppliedSelectChar")
    protected String outGrpLgAccExtraitOutGrmIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmJustifDescCharSuppliedChar20")
    protected String outGrpLgAccExtraitOutGrmJustifDescCharSuppliedChar20;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmLgAccountExtraitAccCd")
    protected short outGrpLgAccExtraitOutGrmLgAccountExtraitAccCd;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmLgAccountExtraitAccCurr")
    protected int outGrpLgAccExtraitOutGrmLgAccountExtraitAccCurr;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmLgAccountExtraitAccSn")
    protected double outGrpLgAccExtraitOutGrmLgAccountExtraitAccSn;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmLgAccountExtraitAccType")
    protected short outGrpLgAccExtraitOutGrmLgAccountExtraitAccType;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmLgAccountExtraitAccUnit")
    protected int outGrpLgAccExtraitOutGrmLgAccountExtraitAccUnit;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmLgAccountExtraitChrCurr")
    protected int outGrpLgAccExtraitOutGrmLgAccountExtraitChrCurr;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmLgAccountExtraitComInCcAmn", required = true)
    protected BigDecimal outGrpLgAccExtraitOutGrmLgAccountExtraitComInCcAmn;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmLgAccountExtraitCommissionAmn", required = true)
    protected BigDecimal outGrpLgAccExtraitOutGrmLgAccountExtraitCommissionAmn;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmLgAccountExtraitEntryStatus")
    protected String outGrpLgAccExtraitOutGrmLgAccountExtraitEntryStatus;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmLgAccountExtraitExpInCcAmn", required = true)
    protected BigDecimal outGrpLgAccExtraitOutGrmLgAccountExtraitExpInCcAmn;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmLgAccountExtraitExpenseAmn", required = true)
    protected BigDecimal outGrpLgAccExtraitOutGrmLgAccountExtraitExpenseAmn;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmLgAccountExtraitExtraitComments")
    protected String outGrpLgAccExtraitOutGrmLgAccountExtraitExtraitComments;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmLgAccountExtraitJustificationCode")
    protected int outGrpLgAccExtraitOutGrmLgAccountExtraitJustificationCode;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmLgAccountExtraitLgAmn", required = true)
    protected BigDecimal outGrpLgAccExtraitOutGrmLgAccountExtraitLgAmn;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmLgAccountExtraitPrvAccountBal", required = true)
    protected BigDecimal outGrpLgAccExtraitOutGrmLgAccountExtraitPrvAccountBal;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmLgAccountExtraitTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpLgAccExtraitOutGrmLgAccountExtraitTmstamp;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmLgAccountExtraitTransactionCode")
    protected int outGrpLgAccExtraitOutGrmLgAccountExtraitTransactionCode;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmLgAccountExtraitTrxAmn", required = true)
    protected BigDecimal outGrpLgAccExtraitOutGrmLgAccountExtraitTrxAmn;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmLgAccountExtraitTrxCurr")
    protected int outGrpLgAccExtraitOutGrmLgAccountExtraitTrxCurr;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmLgAccountExtraitTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpLgAccExtraitOutGrmLgAccountExtraitTrxDate;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmLgAccountExtraitTrxInternalSn")
    protected short outGrpLgAccExtraitOutGrmLgAccountExtraitTrxInternalSn;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmLgAccountExtraitTrxSn")
    protected int outGrpLgAccExtraitOutGrmLgAccountExtraitTrxSn;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmLgAccountExtraitTrxUnit")
    protected int outGrpLgAccExtraitOutGrmLgAccountExtraitTrxUnit;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmLgAccountExtraitTrxUsr")
    protected String outGrpLgAccExtraitOutGrmLgAccountExtraitTrxUsr;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmLgAccountExtraitValeurDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpLgAccExtraitOutGrmLgAccountExtraitValeurDt;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmLgHistoryDateFrom", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpLgAccExtraitOutGrmLgHistoryDateFrom;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmLgHistoryDateTo", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpLgAccExtraitOutGrmLgHistoryDateTo;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmLgHistoryTrxAmn", required = true)
    protected BigDecimal outGrpLgAccExtraitOutGrmLgHistoryTrxAmn;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmRequestLoanStsCharSuppliedChar20")
    protected String outGrpLgAccExtraitOutGrmRequestLoanStsCharSuppliedChar20;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmRequestTypeCharSuppliedChar20")
    protected String outGrpLgAccExtraitOutGrmRequestTypeCharSuppliedChar20;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmTrxCurrencyIdCurrency")
    protected int outGrpLgAccExtraitOutGrmTrxCurrencyIdCurrency;
    @XmlElement(name = "OutGrpLgAccExtraitOutGrmTrxCurrencyShortDescr")
    protected String outGrpLgAccExtraitOutGrmTrxCurrencyShortDescr;

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmAccBankBalIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLgAccExtraitOutGrmAccBankBalIefSuppliedNumber152() {
        return outGrpLgAccExtraitOutGrmAccBankBalIefSuppliedNumber152;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmAccBankBalIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLgAccExtraitOutGrmAccBankBalIefSuppliedNumber152(BigDecimal value) {
        this.outGrpLgAccExtraitOutGrmAccBankBalIefSuppliedNumber152 = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmChrCurrencyIdCurrency property.
     * 
     */
    public int getOutGrpLgAccExtraitOutGrmChrCurrencyIdCurrency() {
        return outGrpLgAccExtraitOutGrmChrCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmChrCurrencyIdCurrency property.
     * 
     */
    public void setOutGrpLgAccExtraitOutGrmChrCurrencyIdCurrency(int value) {
        this.outGrpLgAccExtraitOutGrmChrCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmChrCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLgAccExtraitOutGrmChrCurrencyShortDescr() {
        return outGrpLgAccExtraitOutGrmChrCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmChrCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLgAccExtraitOutGrmChrCurrencyShortDescr(String value) {
        this.outGrpLgAccExtraitOutGrmChrCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLgAccExtraitOutGrmIefSuppliedSelectChar() {
        return outGrpLgAccExtraitOutGrmIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLgAccExtraitOutGrmIefSuppliedSelectChar(String value) {
        this.outGrpLgAccExtraitOutGrmIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmJustifDescCharSuppliedChar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLgAccExtraitOutGrmJustifDescCharSuppliedChar20() {
        return outGrpLgAccExtraitOutGrmJustifDescCharSuppliedChar20;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmJustifDescCharSuppliedChar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLgAccExtraitOutGrmJustifDescCharSuppliedChar20(String value) {
        this.outGrpLgAccExtraitOutGrmJustifDescCharSuppliedChar20 = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitAccCd property.
     * 
     */
    public short getOutGrpLgAccExtraitOutGrmLgAccountExtraitAccCd() {
        return outGrpLgAccExtraitOutGrmLgAccountExtraitAccCd;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitAccCd property.
     * 
     */
    public void setOutGrpLgAccExtraitOutGrmLgAccountExtraitAccCd(short value) {
        this.outGrpLgAccExtraitOutGrmLgAccountExtraitAccCd = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitAccCurr property.
     * 
     */
    public int getOutGrpLgAccExtraitOutGrmLgAccountExtraitAccCurr() {
        return outGrpLgAccExtraitOutGrmLgAccountExtraitAccCurr;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitAccCurr property.
     * 
     */
    public void setOutGrpLgAccExtraitOutGrmLgAccountExtraitAccCurr(int value) {
        this.outGrpLgAccExtraitOutGrmLgAccountExtraitAccCurr = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitAccSn property.
     * 
     */
    public double getOutGrpLgAccExtraitOutGrmLgAccountExtraitAccSn() {
        return outGrpLgAccExtraitOutGrmLgAccountExtraitAccSn;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitAccSn property.
     * 
     */
    public void setOutGrpLgAccExtraitOutGrmLgAccountExtraitAccSn(double value) {
        this.outGrpLgAccExtraitOutGrmLgAccountExtraitAccSn = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitAccType property.
     * 
     */
    public short getOutGrpLgAccExtraitOutGrmLgAccountExtraitAccType() {
        return outGrpLgAccExtraitOutGrmLgAccountExtraitAccType;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitAccType property.
     * 
     */
    public void setOutGrpLgAccExtraitOutGrmLgAccountExtraitAccType(short value) {
        this.outGrpLgAccExtraitOutGrmLgAccountExtraitAccType = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitAccUnit property.
     * 
     */
    public int getOutGrpLgAccExtraitOutGrmLgAccountExtraitAccUnit() {
        return outGrpLgAccExtraitOutGrmLgAccountExtraitAccUnit;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitAccUnit property.
     * 
     */
    public void setOutGrpLgAccExtraitOutGrmLgAccountExtraitAccUnit(int value) {
        this.outGrpLgAccExtraitOutGrmLgAccountExtraitAccUnit = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitChrCurr property.
     * 
     */
    public int getOutGrpLgAccExtraitOutGrmLgAccountExtraitChrCurr() {
        return outGrpLgAccExtraitOutGrmLgAccountExtraitChrCurr;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitChrCurr property.
     * 
     */
    public void setOutGrpLgAccExtraitOutGrmLgAccountExtraitChrCurr(int value) {
        this.outGrpLgAccExtraitOutGrmLgAccountExtraitChrCurr = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitComInCcAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLgAccExtraitOutGrmLgAccountExtraitComInCcAmn() {
        return outGrpLgAccExtraitOutGrmLgAccountExtraitComInCcAmn;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitComInCcAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLgAccExtraitOutGrmLgAccountExtraitComInCcAmn(BigDecimal value) {
        this.outGrpLgAccExtraitOutGrmLgAccountExtraitComInCcAmn = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitCommissionAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLgAccExtraitOutGrmLgAccountExtraitCommissionAmn() {
        return outGrpLgAccExtraitOutGrmLgAccountExtraitCommissionAmn;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitCommissionAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLgAccExtraitOutGrmLgAccountExtraitCommissionAmn(BigDecimal value) {
        this.outGrpLgAccExtraitOutGrmLgAccountExtraitCommissionAmn = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLgAccExtraitOutGrmLgAccountExtraitEntryStatus() {
        return outGrpLgAccExtraitOutGrmLgAccountExtraitEntryStatus;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLgAccExtraitOutGrmLgAccountExtraitEntryStatus(String value) {
        this.outGrpLgAccExtraitOutGrmLgAccountExtraitEntryStatus = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitExpInCcAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLgAccExtraitOutGrmLgAccountExtraitExpInCcAmn() {
        return outGrpLgAccExtraitOutGrmLgAccountExtraitExpInCcAmn;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitExpInCcAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLgAccExtraitOutGrmLgAccountExtraitExpInCcAmn(BigDecimal value) {
        this.outGrpLgAccExtraitOutGrmLgAccountExtraitExpInCcAmn = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitExpenseAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLgAccExtraitOutGrmLgAccountExtraitExpenseAmn() {
        return outGrpLgAccExtraitOutGrmLgAccountExtraitExpenseAmn;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitExpenseAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLgAccExtraitOutGrmLgAccountExtraitExpenseAmn(BigDecimal value) {
        this.outGrpLgAccExtraitOutGrmLgAccountExtraitExpenseAmn = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitExtraitComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLgAccExtraitOutGrmLgAccountExtraitExtraitComments() {
        return outGrpLgAccExtraitOutGrmLgAccountExtraitExtraitComments;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitExtraitComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLgAccExtraitOutGrmLgAccountExtraitExtraitComments(String value) {
        this.outGrpLgAccExtraitOutGrmLgAccountExtraitExtraitComments = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitJustificationCode property.
     * 
     */
    public int getOutGrpLgAccExtraitOutGrmLgAccountExtraitJustificationCode() {
        return outGrpLgAccExtraitOutGrmLgAccountExtraitJustificationCode;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitJustificationCode property.
     * 
     */
    public void setOutGrpLgAccExtraitOutGrmLgAccountExtraitJustificationCode(int value) {
        this.outGrpLgAccExtraitOutGrmLgAccountExtraitJustificationCode = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitLgAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLgAccExtraitOutGrmLgAccountExtraitLgAmn() {
        return outGrpLgAccExtraitOutGrmLgAccountExtraitLgAmn;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitLgAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLgAccExtraitOutGrmLgAccountExtraitLgAmn(BigDecimal value) {
        this.outGrpLgAccExtraitOutGrmLgAccountExtraitLgAmn = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitPrvAccountBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLgAccExtraitOutGrmLgAccountExtraitPrvAccountBal() {
        return outGrpLgAccExtraitOutGrmLgAccountExtraitPrvAccountBal;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitPrvAccountBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLgAccExtraitOutGrmLgAccountExtraitPrvAccountBal(BigDecimal value) {
        this.outGrpLgAccExtraitOutGrmLgAccountExtraitPrvAccountBal = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpLgAccExtraitOutGrmLgAccountExtraitTmstamp() {
        return outGrpLgAccExtraitOutGrmLgAccountExtraitTmstamp;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpLgAccExtraitOutGrmLgAccountExtraitTmstamp(XMLGregorianCalendar value) {
        this.outGrpLgAccExtraitOutGrmLgAccountExtraitTmstamp = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitTransactionCode property.
     * 
     */
    public int getOutGrpLgAccExtraitOutGrmLgAccountExtraitTransactionCode() {
        return outGrpLgAccExtraitOutGrmLgAccountExtraitTransactionCode;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitTransactionCode property.
     * 
     */
    public void setOutGrpLgAccExtraitOutGrmLgAccountExtraitTransactionCode(int value) {
        this.outGrpLgAccExtraitOutGrmLgAccountExtraitTransactionCode = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitTrxAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLgAccExtraitOutGrmLgAccountExtraitTrxAmn() {
        return outGrpLgAccExtraitOutGrmLgAccountExtraitTrxAmn;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitTrxAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLgAccExtraitOutGrmLgAccountExtraitTrxAmn(BigDecimal value) {
        this.outGrpLgAccExtraitOutGrmLgAccountExtraitTrxAmn = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitTrxCurr property.
     * 
     */
    public int getOutGrpLgAccExtraitOutGrmLgAccountExtraitTrxCurr() {
        return outGrpLgAccExtraitOutGrmLgAccountExtraitTrxCurr;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitTrxCurr property.
     * 
     */
    public void setOutGrpLgAccExtraitOutGrmLgAccountExtraitTrxCurr(int value) {
        this.outGrpLgAccExtraitOutGrmLgAccountExtraitTrxCurr = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpLgAccExtraitOutGrmLgAccountExtraitTrxDate() {
        return outGrpLgAccExtraitOutGrmLgAccountExtraitTrxDate;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpLgAccExtraitOutGrmLgAccountExtraitTrxDate(XMLGregorianCalendar value) {
        this.outGrpLgAccExtraitOutGrmLgAccountExtraitTrxDate = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitTrxInternalSn property.
     * 
     */
    public short getOutGrpLgAccExtraitOutGrmLgAccountExtraitTrxInternalSn() {
        return outGrpLgAccExtraitOutGrmLgAccountExtraitTrxInternalSn;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitTrxInternalSn property.
     * 
     */
    public void setOutGrpLgAccExtraitOutGrmLgAccountExtraitTrxInternalSn(short value) {
        this.outGrpLgAccExtraitOutGrmLgAccountExtraitTrxInternalSn = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitTrxSn property.
     * 
     */
    public int getOutGrpLgAccExtraitOutGrmLgAccountExtraitTrxSn() {
        return outGrpLgAccExtraitOutGrmLgAccountExtraitTrxSn;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitTrxSn property.
     * 
     */
    public void setOutGrpLgAccExtraitOutGrmLgAccountExtraitTrxSn(int value) {
        this.outGrpLgAccExtraitOutGrmLgAccountExtraitTrxSn = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitTrxUnit property.
     * 
     */
    public int getOutGrpLgAccExtraitOutGrmLgAccountExtraitTrxUnit() {
        return outGrpLgAccExtraitOutGrmLgAccountExtraitTrxUnit;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitTrxUnit property.
     * 
     */
    public void setOutGrpLgAccExtraitOutGrmLgAccountExtraitTrxUnit(int value) {
        this.outGrpLgAccExtraitOutGrmLgAccountExtraitTrxUnit = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLgAccExtraitOutGrmLgAccountExtraitTrxUsr() {
        return outGrpLgAccExtraitOutGrmLgAccountExtraitTrxUsr;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLgAccExtraitOutGrmLgAccountExtraitTrxUsr(String value) {
        this.outGrpLgAccExtraitOutGrmLgAccountExtraitTrxUsr = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitValeurDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpLgAccExtraitOutGrmLgAccountExtraitValeurDt() {
        return outGrpLgAccExtraitOutGrmLgAccountExtraitValeurDt;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmLgAccountExtraitValeurDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpLgAccExtraitOutGrmLgAccountExtraitValeurDt(XMLGregorianCalendar value) {
        this.outGrpLgAccExtraitOutGrmLgAccountExtraitValeurDt = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmLgHistoryDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpLgAccExtraitOutGrmLgHistoryDateFrom() {
        return outGrpLgAccExtraitOutGrmLgHistoryDateFrom;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmLgHistoryDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpLgAccExtraitOutGrmLgHistoryDateFrom(XMLGregorianCalendar value) {
        this.outGrpLgAccExtraitOutGrmLgHistoryDateFrom = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmLgHistoryDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpLgAccExtraitOutGrmLgHistoryDateTo() {
        return outGrpLgAccExtraitOutGrmLgHistoryDateTo;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmLgHistoryDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpLgAccExtraitOutGrmLgHistoryDateTo(XMLGregorianCalendar value) {
        this.outGrpLgAccExtraitOutGrmLgHistoryDateTo = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmLgHistoryTrxAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLgAccExtraitOutGrmLgHistoryTrxAmn() {
        return outGrpLgAccExtraitOutGrmLgHistoryTrxAmn;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmLgHistoryTrxAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLgAccExtraitOutGrmLgHistoryTrxAmn(BigDecimal value) {
        this.outGrpLgAccExtraitOutGrmLgHistoryTrxAmn = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmRequestLoanStsCharSuppliedChar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLgAccExtraitOutGrmRequestLoanStsCharSuppliedChar20() {
        return outGrpLgAccExtraitOutGrmRequestLoanStsCharSuppliedChar20;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmRequestLoanStsCharSuppliedChar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLgAccExtraitOutGrmRequestLoanStsCharSuppliedChar20(String value) {
        this.outGrpLgAccExtraitOutGrmRequestLoanStsCharSuppliedChar20 = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmRequestTypeCharSuppliedChar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLgAccExtraitOutGrmRequestTypeCharSuppliedChar20() {
        return outGrpLgAccExtraitOutGrmRequestTypeCharSuppliedChar20;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmRequestTypeCharSuppliedChar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLgAccExtraitOutGrmRequestTypeCharSuppliedChar20(String value) {
        this.outGrpLgAccExtraitOutGrmRequestTypeCharSuppliedChar20 = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmTrxCurrencyIdCurrency property.
     * 
     */
    public int getOutGrpLgAccExtraitOutGrmTrxCurrencyIdCurrency() {
        return outGrpLgAccExtraitOutGrmTrxCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmTrxCurrencyIdCurrency property.
     * 
     */
    public void setOutGrpLgAccExtraitOutGrmTrxCurrencyIdCurrency(int value) {
        this.outGrpLgAccExtraitOutGrmTrxCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outGrpLgAccExtraitOutGrmTrxCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLgAccExtraitOutGrmTrxCurrencyShortDescr() {
        return outGrpLgAccExtraitOutGrmTrxCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpLgAccExtraitOutGrmTrxCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLgAccExtraitOutGrmTrxCurrencyShortDescr(String value) {
        this.outGrpLgAccExtraitOutGrmTrxCurrencyShortDescr = value;
    }

}
