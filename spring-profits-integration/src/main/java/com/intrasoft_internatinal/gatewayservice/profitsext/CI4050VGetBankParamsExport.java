
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CI4050V_GetBankParamsExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CI4050V_GetBankParamsExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutBankParametersAccNoGenerator" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBankParametersAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankParametersBankCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBankParametersBankCompanyRecord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankParametersBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankParametersBaseCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBankParametersConstTblCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankParametersConversJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBankParametersConversionProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBankParametersCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankParametersCurrTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBankParametersDisallowOnlinFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankParametersDomesticCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankParametersEuroEchoDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankParametersEuroLockedRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBankParametersFulpageExtrLines" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBankParametersIbanFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankParametersIncomChqJustOt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBankParametersIncomChqJustUs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBankParametersKipCustomer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBankParametersKipSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankParametersLastClosedProdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBankParametersMaxAmntRateTbl" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBankParametersMaxAmntSrs" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBankParametersMaxOrdWaitDays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBankParametersNextTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBankParametersOp24hoursFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankParametersPrevTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBankParametersPreviousDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBankParametersRateDeviation" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBankParametersRateTblCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankParametersRateUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankParametersScheduledDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBankParametersSwiftAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankParametersTaxRegNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI4050V_GetBankParamsExport", propOrder = {
    "outBankParametersAccNoGenerator",
    "outBankParametersAddress",
    "outBankParametersBankCode",
    "outBankParametersBankCompanyRecord",
    "outBankParametersBankName",
    "outBankParametersBaseCurrency",
    "outBankParametersConstTblCurrency",
    "outBankParametersConversJustific",
    "outBankParametersConversionProduct",
    "outBankParametersCountry",
    "outBankParametersCurrTrxDate",
    "outBankParametersDisallowOnlinFlg",
    "outBankParametersDomesticCurrency",
    "outBankParametersEuroEchoDesc",
    "outBankParametersEuroLockedRate",
    "outBankParametersFulpageExtrLines",
    "outBankParametersIbanFlag",
    "outBankParametersIncomChqJustOt",
    "outBankParametersIncomChqJustUs",
    "outBankParametersKipCustomer",
    "outBankParametersKipSystem",
    "outBankParametersLastClosedProdDate",
    "outBankParametersMaxAmntRateTbl",
    "outBankParametersMaxAmntSrs",
    "outBankParametersMaxOrdWaitDays",
    "outBankParametersNextTrxDate",
    "outBankParametersOp24HoursFlag",
    "outBankParametersPrevTrxDate",
    "outBankParametersPreviousDate",
    "outBankParametersRateDeviation",
    "outBankParametersRateTblCurrency",
    "outBankParametersRateUsage",
    "outBankParametersScheduledDate",
    "outBankParametersSwiftAddress",
    "outBankParametersTaxRegNo"
})
public class CI4050VGetBankParamsExport
    extends BaseExport
{

    @XmlElement(name = "OutBankParametersAccNoGenerator")
    protected short outBankParametersAccNoGenerator;
    @XmlElement(name = "OutBankParametersAddress")
    protected String outBankParametersAddress;
    @XmlElement(name = "OutBankParametersBankCode")
    protected short outBankParametersBankCode;
    @XmlElement(name = "OutBankParametersBankCompanyRecord")
    protected String outBankParametersBankCompanyRecord;
    @XmlElement(name = "OutBankParametersBankName")
    protected String outBankParametersBankName;
    @XmlElement(name = "OutBankParametersBaseCurrency")
    protected int outBankParametersBaseCurrency;
    @XmlElement(name = "OutBankParametersConstTblCurrency")
    protected String outBankParametersConstTblCurrency;
    @XmlElement(name = "OutBankParametersConversJustific")
    protected int outBankParametersConversJustific;
    @XmlElement(name = "OutBankParametersConversionProduct")
    protected int outBankParametersConversionProduct;
    @XmlElement(name = "OutBankParametersCountry")
    protected String outBankParametersCountry;
    @XmlElement(name = "OutBankParametersCurrTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBankParametersCurrTrxDate;
    @XmlElement(name = "OutBankParametersDisallowOnlinFlg")
    protected String outBankParametersDisallowOnlinFlg;
    @XmlElement(name = "OutBankParametersDomesticCurrency")
    protected String outBankParametersDomesticCurrency;
    @XmlElement(name = "OutBankParametersEuroEchoDesc")
    protected String outBankParametersEuroEchoDesc;
    @XmlElement(name = "OutBankParametersEuroLockedRate", required = true)
    protected BigDecimal outBankParametersEuroLockedRate;
    @XmlElement(name = "OutBankParametersFulpageExtrLines")
    protected short outBankParametersFulpageExtrLines;
    @XmlElement(name = "OutBankParametersIbanFlag")
    protected String outBankParametersIbanFlag;
    @XmlElement(name = "OutBankParametersIncomChqJustOt")
    protected int outBankParametersIncomChqJustOt;
    @XmlElement(name = "OutBankParametersIncomChqJustUs")
    protected int outBankParametersIncomChqJustUs;
    @XmlElement(name = "OutBankParametersKipCustomer")
    protected int outBankParametersKipCustomer;
    @XmlElement(name = "OutBankParametersKipSystem")
    protected String outBankParametersKipSystem;
    @XmlElement(name = "OutBankParametersLastClosedProdDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBankParametersLastClosedProdDate;
    @XmlElement(name = "OutBankParametersMaxAmntRateTbl", required = true)
    protected BigDecimal outBankParametersMaxAmntRateTbl;
    @XmlElement(name = "OutBankParametersMaxAmntSrs", required = true)
    protected BigDecimal outBankParametersMaxAmntSrs;
    @XmlElement(name = "OutBankParametersMaxOrdWaitDays")
    protected short outBankParametersMaxOrdWaitDays;
    @XmlElement(name = "OutBankParametersNextTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBankParametersNextTrxDate;
    @XmlElement(name = "OutBankParametersOp24hoursFlag")
    protected String outBankParametersOp24HoursFlag;
    @XmlElement(name = "OutBankParametersPrevTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBankParametersPrevTrxDate;
    @XmlElement(name = "OutBankParametersPreviousDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBankParametersPreviousDate;
    @XmlElement(name = "OutBankParametersRateDeviation")
    protected short outBankParametersRateDeviation;
    @XmlElement(name = "OutBankParametersRateTblCurrency")
    protected String outBankParametersRateTblCurrency;
    @XmlElement(name = "OutBankParametersRateUsage")
    protected String outBankParametersRateUsage;
    @XmlElement(name = "OutBankParametersScheduledDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBankParametersScheduledDate;
    @XmlElement(name = "OutBankParametersSwiftAddress")
    protected String outBankParametersSwiftAddress;
    @XmlElement(name = "OutBankParametersTaxRegNo")
    protected String outBankParametersTaxRegNo;

    /**
     * Gets the value of the outBankParametersAccNoGenerator property.
     * 
     */
    public short getOutBankParametersAccNoGenerator() {
        return outBankParametersAccNoGenerator;
    }

    /**
     * Sets the value of the outBankParametersAccNoGenerator property.
     * 
     */
    public void setOutBankParametersAccNoGenerator(short value) {
        this.outBankParametersAccNoGenerator = value;
    }

    /**
     * Gets the value of the outBankParametersAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankParametersAddress() {
        return outBankParametersAddress;
    }

    /**
     * Sets the value of the outBankParametersAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankParametersAddress(String value) {
        this.outBankParametersAddress = value;
    }

    /**
     * Gets the value of the outBankParametersBankCode property.
     * 
     */
    public short getOutBankParametersBankCode() {
        return outBankParametersBankCode;
    }

    /**
     * Sets the value of the outBankParametersBankCode property.
     * 
     */
    public void setOutBankParametersBankCode(short value) {
        this.outBankParametersBankCode = value;
    }

    /**
     * Gets the value of the outBankParametersBankCompanyRecord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankParametersBankCompanyRecord() {
        return outBankParametersBankCompanyRecord;
    }

    /**
     * Sets the value of the outBankParametersBankCompanyRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankParametersBankCompanyRecord(String value) {
        this.outBankParametersBankCompanyRecord = value;
    }

    /**
     * Gets the value of the outBankParametersBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankParametersBankName() {
        return outBankParametersBankName;
    }

    /**
     * Sets the value of the outBankParametersBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankParametersBankName(String value) {
        this.outBankParametersBankName = value;
    }

    /**
     * Gets the value of the outBankParametersBaseCurrency property.
     * 
     */
    public int getOutBankParametersBaseCurrency() {
        return outBankParametersBaseCurrency;
    }

    /**
     * Sets the value of the outBankParametersBaseCurrency property.
     * 
     */
    public void setOutBankParametersBaseCurrency(int value) {
        this.outBankParametersBaseCurrency = value;
    }

    /**
     * Gets the value of the outBankParametersConstTblCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankParametersConstTblCurrency() {
        return outBankParametersConstTblCurrency;
    }

    /**
     * Sets the value of the outBankParametersConstTblCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankParametersConstTblCurrency(String value) {
        this.outBankParametersConstTblCurrency = value;
    }

    /**
     * Gets the value of the outBankParametersConversJustific property.
     * 
     */
    public int getOutBankParametersConversJustific() {
        return outBankParametersConversJustific;
    }

    /**
     * Sets the value of the outBankParametersConversJustific property.
     * 
     */
    public void setOutBankParametersConversJustific(int value) {
        this.outBankParametersConversJustific = value;
    }

    /**
     * Gets the value of the outBankParametersConversionProduct property.
     * 
     */
    public int getOutBankParametersConversionProduct() {
        return outBankParametersConversionProduct;
    }

    /**
     * Sets the value of the outBankParametersConversionProduct property.
     * 
     */
    public void setOutBankParametersConversionProduct(int value) {
        this.outBankParametersConversionProduct = value;
    }

    /**
     * Gets the value of the outBankParametersCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankParametersCountry() {
        return outBankParametersCountry;
    }

    /**
     * Sets the value of the outBankParametersCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankParametersCountry(String value) {
        this.outBankParametersCountry = value;
    }

    /**
     * Gets the value of the outBankParametersCurrTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBankParametersCurrTrxDate() {
        return outBankParametersCurrTrxDate;
    }

    /**
     * Sets the value of the outBankParametersCurrTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBankParametersCurrTrxDate(XMLGregorianCalendar value) {
        this.outBankParametersCurrTrxDate = value;
    }

    /**
     * Gets the value of the outBankParametersDisallowOnlinFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankParametersDisallowOnlinFlg() {
        return outBankParametersDisallowOnlinFlg;
    }

    /**
     * Sets the value of the outBankParametersDisallowOnlinFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankParametersDisallowOnlinFlg(String value) {
        this.outBankParametersDisallowOnlinFlg = value;
    }

    /**
     * Gets the value of the outBankParametersDomesticCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankParametersDomesticCurrency() {
        return outBankParametersDomesticCurrency;
    }

    /**
     * Sets the value of the outBankParametersDomesticCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankParametersDomesticCurrency(String value) {
        this.outBankParametersDomesticCurrency = value;
    }

    /**
     * Gets the value of the outBankParametersEuroEchoDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankParametersEuroEchoDesc() {
        return outBankParametersEuroEchoDesc;
    }

    /**
     * Sets the value of the outBankParametersEuroEchoDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankParametersEuroEchoDesc(String value) {
        this.outBankParametersEuroEchoDesc = value;
    }

    /**
     * Gets the value of the outBankParametersEuroLockedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBankParametersEuroLockedRate() {
        return outBankParametersEuroLockedRate;
    }

    /**
     * Sets the value of the outBankParametersEuroLockedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBankParametersEuroLockedRate(BigDecimal value) {
        this.outBankParametersEuroLockedRate = value;
    }

    /**
     * Gets the value of the outBankParametersFulpageExtrLines property.
     * 
     */
    public short getOutBankParametersFulpageExtrLines() {
        return outBankParametersFulpageExtrLines;
    }

    /**
     * Sets the value of the outBankParametersFulpageExtrLines property.
     * 
     */
    public void setOutBankParametersFulpageExtrLines(short value) {
        this.outBankParametersFulpageExtrLines = value;
    }

    /**
     * Gets the value of the outBankParametersIbanFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankParametersIbanFlag() {
        return outBankParametersIbanFlag;
    }

    /**
     * Sets the value of the outBankParametersIbanFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankParametersIbanFlag(String value) {
        this.outBankParametersIbanFlag = value;
    }

    /**
     * Gets the value of the outBankParametersIncomChqJustOt property.
     * 
     */
    public int getOutBankParametersIncomChqJustOt() {
        return outBankParametersIncomChqJustOt;
    }

    /**
     * Sets the value of the outBankParametersIncomChqJustOt property.
     * 
     */
    public void setOutBankParametersIncomChqJustOt(int value) {
        this.outBankParametersIncomChqJustOt = value;
    }

    /**
     * Gets the value of the outBankParametersIncomChqJustUs property.
     * 
     */
    public int getOutBankParametersIncomChqJustUs() {
        return outBankParametersIncomChqJustUs;
    }

    /**
     * Sets the value of the outBankParametersIncomChqJustUs property.
     * 
     */
    public void setOutBankParametersIncomChqJustUs(int value) {
        this.outBankParametersIncomChqJustUs = value;
    }

    /**
     * Gets the value of the outBankParametersKipCustomer property.
     * 
     */
    public int getOutBankParametersKipCustomer() {
        return outBankParametersKipCustomer;
    }

    /**
     * Sets the value of the outBankParametersKipCustomer property.
     * 
     */
    public void setOutBankParametersKipCustomer(int value) {
        this.outBankParametersKipCustomer = value;
    }

    /**
     * Gets the value of the outBankParametersKipSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankParametersKipSystem() {
        return outBankParametersKipSystem;
    }

    /**
     * Sets the value of the outBankParametersKipSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankParametersKipSystem(String value) {
        this.outBankParametersKipSystem = value;
    }

    /**
     * Gets the value of the outBankParametersLastClosedProdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBankParametersLastClosedProdDate() {
        return outBankParametersLastClosedProdDate;
    }

    /**
     * Sets the value of the outBankParametersLastClosedProdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBankParametersLastClosedProdDate(XMLGregorianCalendar value) {
        this.outBankParametersLastClosedProdDate = value;
    }

    /**
     * Gets the value of the outBankParametersMaxAmntRateTbl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBankParametersMaxAmntRateTbl() {
        return outBankParametersMaxAmntRateTbl;
    }

    /**
     * Sets the value of the outBankParametersMaxAmntRateTbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBankParametersMaxAmntRateTbl(BigDecimal value) {
        this.outBankParametersMaxAmntRateTbl = value;
    }

    /**
     * Gets the value of the outBankParametersMaxAmntSrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBankParametersMaxAmntSrs() {
        return outBankParametersMaxAmntSrs;
    }

    /**
     * Sets the value of the outBankParametersMaxAmntSrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBankParametersMaxAmntSrs(BigDecimal value) {
        this.outBankParametersMaxAmntSrs = value;
    }

    /**
     * Gets the value of the outBankParametersMaxOrdWaitDays property.
     * 
     */
    public short getOutBankParametersMaxOrdWaitDays() {
        return outBankParametersMaxOrdWaitDays;
    }

    /**
     * Sets the value of the outBankParametersMaxOrdWaitDays property.
     * 
     */
    public void setOutBankParametersMaxOrdWaitDays(short value) {
        this.outBankParametersMaxOrdWaitDays = value;
    }

    /**
     * Gets the value of the outBankParametersNextTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBankParametersNextTrxDate() {
        return outBankParametersNextTrxDate;
    }

    /**
     * Sets the value of the outBankParametersNextTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBankParametersNextTrxDate(XMLGregorianCalendar value) {
        this.outBankParametersNextTrxDate = value;
    }

    /**
     * Gets the value of the outBankParametersOp24HoursFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankParametersOp24HoursFlag() {
        return outBankParametersOp24HoursFlag;
    }

    /**
     * Sets the value of the outBankParametersOp24HoursFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankParametersOp24HoursFlag(String value) {
        this.outBankParametersOp24HoursFlag = value;
    }

    /**
     * Gets the value of the outBankParametersPrevTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBankParametersPrevTrxDate() {
        return outBankParametersPrevTrxDate;
    }

    /**
     * Sets the value of the outBankParametersPrevTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBankParametersPrevTrxDate(XMLGregorianCalendar value) {
        this.outBankParametersPrevTrxDate = value;
    }

    /**
     * Gets the value of the outBankParametersPreviousDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBankParametersPreviousDate() {
        return outBankParametersPreviousDate;
    }

    /**
     * Sets the value of the outBankParametersPreviousDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBankParametersPreviousDate(XMLGregorianCalendar value) {
        this.outBankParametersPreviousDate = value;
    }

    /**
     * Gets the value of the outBankParametersRateDeviation property.
     * 
     */
    public short getOutBankParametersRateDeviation() {
        return outBankParametersRateDeviation;
    }

    /**
     * Sets the value of the outBankParametersRateDeviation property.
     * 
     */
    public void setOutBankParametersRateDeviation(short value) {
        this.outBankParametersRateDeviation = value;
    }

    /**
     * Gets the value of the outBankParametersRateTblCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankParametersRateTblCurrency() {
        return outBankParametersRateTblCurrency;
    }

    /**
     * Sets the value of the outBankParametersRateTblCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankParametersRateTblCurrency(String value) {
        this.outBankParametersRateTblCurrency = value;
    }

    /**
     * Gets the value of the outBankParametersRateUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankParametersRateUsage() {
        return outBankParametersRateUsage;
    }

    /**
     * Sets the value of the outBankParametersRateUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankParametersRateUsage(String value) {
        this.outBankParametersRateUsage = value;
    }

    /**
     * Gets the value of the outBankParametersScheduledDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBankParametersScheduledDate() {
        return outBankParametersScheduledDate;
    }

    /**
     * Sets the value of the outBankParametersScheduledDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBankParametersScheduledDate(XMLGregorianCalendar value) {
        this.outBankParametersScheduledDate = value;
    }

    /**
     * Gets the value of the outBankParametersSwiftAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankParametersSwiftAddress() {
        return outBankParametersSwiftAddress;
    }

    /**
     * Sets the value of the outBankParametersSwiftAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankParametersSwiftAddress(String value) {
        this.outBankParametersSwiftAddress = value;
    }

    /**
     * Gets the value of the outBankParametersTaxRegNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankParametersTaxRegNo() {
        return outBankParametersTaxRegNo;
    }

    /**
     * Sets the value of the outBankParametersTaxRegNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankParametersTaxRegNo(String value) {
        this.outBankParametersTaxRegNo = value;
    }

}
