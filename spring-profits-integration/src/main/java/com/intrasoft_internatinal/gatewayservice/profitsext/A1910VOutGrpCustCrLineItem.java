
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for A1910VOutGrpCustCrLineItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="A1910VOutGrpCustCrLineItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpCustCrLineOutGrmCrLineCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCustCrLineOutGrmCrLineCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustCrLineOutGrmCrLineUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustCrLineOutGrmCustomerCreditLineCrlineAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpCustCrLineOutGrmCustomerCreditLineEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustCrLineOutGrmCustomerCreditLineEvaluationDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpCustCrLineOutGrmCustomerCreditLineExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpCustCrLineOutGrmCustomerCreditLineReevaluationDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpCustCrLineOutGrmCustomerCreditLineTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpCustCrLineOutGrmCustomerCreditLineUtilisedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpCustCrLineOutGrmGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustCrLineOutGrmGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCustCrLineOutGrmIefSuppliedChar10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustCrLineOutGrmIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustCrLineOutGrmcrLineUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "A1910VOutGrpCustCrLineItem", propOrder = {
    "outGrpCustCrLineOutGrmCrLineCurrencyIdCurrency",
    "outGrpCustCrLineOutGrmCrLineCurrencyShortDescr",
    "outGrpCustCrLineOutGrmCrLineUsrCode",
    "outGrpCustCrLineOutGrmCustomerCreditLineCrlineAmount",
    "outGrpCustCrLineOutGrmCustomerCreditLineEntryStatus",
    "outGrpCustCrLineOutGrmCustomerCreditLineEvaluationDt",
    "outGrpCustCrLineOutGrmCustomerCreditLineExpiryDate",
    "outGrpCustCrLineOutGrmCustomerCreditLineReevaluationDt",
    "outGrpCustCrLineOutGrmCustomerCreditLineTmstamp",
    "outGrpCustCrLineOutGrmCustomerCreditLineUtilisedAmount",
    "outGrpCustCrLineOutGrmGenericDetailDescription",
    "outGrpCustCrLineOutGrmGenericDetailSerialNum",
    "outGrpCustCrLineOutGrmIefSuppliedChar10",
    "outGrpCustCrLineOutGrmIefSuppliedSelectChar",
    "outGrpCustCrLineOutGrmcrLineUnitCode"
})
public class A1910VOutGrpCustCrLineItem {

    @XmlElement(name = "OutGrpCustCrLineOutGrmCrLineCurrencyIdCurrency")
    protected int outGrpCustCrLineOutGrmCrLineCurrencyIdCurrency;
    @XmlElement(name = "OutGrpCustCrLineOutGrmCrLineCurrencyShortDescr")
    protected String outGrpCustCrLineOutGrmCrLineCurrencyShortDescr;
    @XmlElement(name = "OutGrpCustCrLineOutGrmCrLineUsrCode")
    protected String outGrpCustCrLineOutGrmCrLineUsrCode;
    @XmlElement(name = "OutGrpCustCrLineOutGrmCustomerCreditLineCrlineAmount", required = true)
    protected BigDecimal outGrpCustCrLineOutGrmCustomerCreditLineCrlineAmount;
    @XmlElement(name = "OutGrpCustCrLineOutGrmCustomerCreditLineEntryStatus")
    protected String outGrpCustCrLineOutGrmCustomerCreditLineEntryStatus;
    @XmlElement(name = "OutGrpCustCrLineOutGrmCustomerCreditLineEvaluationDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpCustCrLineOutGrmCustomerCreditLineEvaluationDt;
    @XmlElement(name = "OutGrpCustCrLineOutGrmCustomerCreditLineExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpCustCrLineOutGrmCustomerCreditLineExpiryDate;
    @XmlElement(name = "OutGrpCustCrLineOutGrmCustomerCreditLineReevaluationDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpCustCrLineOutGrmCustomerCreditLineReevaluationDt;
    @XmlElement(name = "OutGrpCustCrLineOutGrmCustomerCreditLineTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpCustCrLineOutGrmCustomerCreditLineTmstamp;
    @XmlElement(name = "OutGrpCustCrLineOutGrmCustomerCreditLineUtilisedAmount", required = true)
    protected BigDecimal outGrpCustCrLineOutGrmCustomerCreditLineUtilisedAmount;
    @XmlElement(name = "OutGrpCustCrLineOutGrmGenericDetailDescription")
    protected String outGrpCustCrLineOutGrmGenericDetailDescription;
    @XmlElement(name = "OutGrpCustCrLineOutGrmGenericDetailSerialNum")
    protected int outGrpCustCrLineOutGrmGenericDetailSerialNum;
    @XmlElement(name = "OutGrpCustCrLineOutGrmIefSuppliedChar10")
    protected String outGrpCustCrLineOutGrmIefSuppliedChar10;
    @XmlElement(name = "OutGrpCustCrLineOutGrmIefSuppliedSelectChar")
    protected String outGrpCustCrLineOutGrmIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpCustCrLineOutGrmcrLineUnitCode")
    protected int outGrpCustCrLineOutGrmcrLineUnitCode;

    /**
     * Gets the value of the outGrpCustCrLineOutGrmCrLineCurrencyIdCurrency property.
     * 
     */
    public int getOutGrpCustCrLineOutGrmCrLineCurrencyIdCurrency() {
        return outGrpCustCrLineOutGrmCrLineCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outGrpCustCrLineOutGrmCrLineCurrencyIdCurrency property.
     * 
     */
    public void setOutGrpCustCrLineOutGrmCrLineCurrencyIdCurrency(int value) {
        this.outGrpCustCrLineOutGrmCrLineCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outGrpCustCrLineOutGrmCrLineCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustCrLineOutGrmCrLineCurrencyShortDescr() {
        return outGrpCustCrLineOutGrmCrLineCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpCustCrLineOutGrmCrLineCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustCrLineOutGrmCrLineCurrencyShortDescr(String value) {
        this.outGrpCustCrLineOutGrmCrLineCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGrpCustCrLineOutGrmCrLineUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustCrLineOutGrmCrLineUsrCode() {
        return outGrpCustCrLineOutGrmCrLineUsrCode;
    }

    /**
     * Sets the value of the outGrpCustCrLineOutGrmCrLineUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustCrLineOutGrmCrLineUsrCode(String value) {
        this.outGrpCustCrLineOutGrmCrLineUsrCode = value;
    }

    /**
     * Gets the value of the outGrpCustCrLineOutGrmCustomerCreditLineCrlineAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpCustCrLineOutGrmCustomerCreditLineCrlineAmount() {
        return outGrpCustCrLineOutGrmCustomerCreditLineCrlineAmount;
    }

    /**
     * Sets the value of the outGrpCustCrLineOutGrmCustomerCreditLineCrlineAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpCustCrLineOutGrmCustomerCreditLineCrlineAmount(BigDecimal value) {
        this.outGrpCustCrLineOutGrmCustomerCreditLineCrlineAmount = value;
    }

    /**
     * Gets the value of the outGrpCustCrLineOutGrmCustomerCreditLineEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustCrLineOutGrmCustomerCreditLineEntryStatus() {
        return outGrpCustCrLineOutGrmCustomerCreditLineEntryStatus;
    }

    /**
     * Sets the value of the outGrpCustCrLineOutGrmCustomerCreditLineEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustCrLineOutGrmCustomerCreditLineEntryStatus(String value) {
        this.outGrpCustCrLineOutGrmCustomerCreditLineEntryStatus = value;
    }

    /**
     * Gets the value of the outGrpCustCrLineOutGrmCustomerCreditLineEvaluationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpCustCrLineOutGrmCustomerCreditLineEvaluationDt() {
        return outGrpCustCrLineOutGrmCustomerCreditLineEvaluationDt;
    }

    /**
     * Sets the value of the outGrpCustCrLineOutGrmCustomerCreditLineEvaluationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpCustCrLineOutGrmCustomerCreditLineEvaluationDt(XMLGregorianCalendar value) {
        this.outGrpCustCrLineOutGrmCustomerCreditLineEvaluationDt = value;
    }

    /**
     * Gets the value of the outGrpCustCrLineOutGrmCustomerCreditLineExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpCustCrLineOutGrmCustomerCreditLineExpiryDate() {
        return outGrpCustCrLineOutGrmCustomerCreditLineExpiryDate;
    }

    /**
     * Sets the value of the outGrpCustCrLineOutGrmCustomerCreditLineExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpCustCrLineOutGrmCustomerCreditLineExpiryDate(XMLGregorianCalendar value) {
        this.outGrpCustCrLineOutGrmCustomerCreditLineExpiryDate = value;
    }

    /**
     * Gets the value of the outGrpCustCrLineOutGrmCustomerCreditLineReevaluationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpCustCrLineOutGrmCustomerCreditLineReevaluationDt() {
        return outGrpCustCrLineOutGrmCustomerCreditLineReevaluationDt;
    }

    /**
     * Sets the value of the outGrpCustCrLineOutGrmCustomerCreditLineReevaluationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpCustCrLineOutGrmCustomerCreditLineReevaluationDt(XMLGregorianCalendar value) {
        this.outGrpCustCrLineOutGrmCustomerCreditLineReevaluationDt = value;
    }

    /**
     * Gets the value of the outGrpCustCrLineOutGrmCustomerCreditLineTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpCustCrLineOutGrmCustomerCreditLineTmstamp() {
        return outGrpCustCrLineOutGrmCustomerCreditLineTmstamp;
    }

    /**
     * Sets the value of the outGrpCustCrLineOutGrmCustomerCreditLineTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpCustCrLineOutGrmCustomerCreditLineTmstamp(XMLGregorianCalendar value) {
        this.outGrpCustCrLineOutGrmCustomerCreditLineTmstamp = value;
    }

    /**
     * Gets the value of the outGrpCustCrLineOutGrmCustomerCreditLineUtilisedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpCustCrLineOutGrmCustomerCreditLineUtilisedAmount() {
        return outGrpCustCrLineOutGrmCustomerCreditLineUtilisedAmount;
    }

    /**
     * Sets the value of the outGrpCustCrLineOutGrmCustomerCreditLineUtilisedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpCustCrLineOutGrmCustomerCreditLineUtilisedAmount(BigDecimal value) {
        this.outGrpCustCrLineOutGrmCustomerCreditLineUtilisedAmount = value;
    }

    /**
     * Gets the value of the outGrpCustCrLineOutGrmGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustCrLineOutGrmGenericDetailDescription() {
        return outGrpCustCrLineOutGrmGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpCustCrLineOutGrmGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustCrLineOutGrmGenericDetailDescription(String value) {
        this.outGrpCustCrLineOutGrmGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpCustCrLineOutGrmGenericDetailSerialNum property.
     * 
     */
    public int getOutGrpCustCrLineOutGrmGenericDetailSerialNum() {
        return outGrpCustCrLineOutGrmGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outGrpCustCrLineOutGrmGenericDetailSerialNum property.
     * 
     */
    public void setOutGrpCustCrLineOutGrmGenericDetailSerialNum(int value) {
        this.outGrpCustCrLineOutGrmGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outGrpCustCrLineOutGrmIefSuppliedChar10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustCrLineOutGrmIefSuppliedChar10() {
        return outGrpCustCrLineOutGrmIefSuppliedChar10;
    }

    /**
     * Sets the value of the outGrpCustCrLineOutGrmIefSuppliedChar10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustCrLineOutGrmIefSuppliedChar10(String value) {
        this.outGrpCustCrLineOutGrmIefSuppliedChar10 = value;
    }

    /**
     * Gets the value of the outGrpCustCrLineOutGrmIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustCrLineOutGrmIefSuppliedSelectChar() {
        return outGrpCustCrLineOutGrmIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpCustCrLineOutGrmIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustCrLineOutGrmIefSuppliedSelectChar(String value) {
        this.outGrpCustCrLineOutGrmIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpCustCrLineOutGrmcrLineUnitCode property.
     * 
     */
    public int getOutGrpCustCrLineOutGrmcrLineUnitCode() {
        return outGrpCustCrLineOutGrmcrLineUnitCode;
    }

    /**
     * Sets the value of the outGrpCustCrLineOutGrmcrLineUnitCode property.
     * 
     */
    public void setOutGrpCustCrLineOutGrmcrLineUnitCode(int value) {
        this.outGrpCustCrLineOutGrmcrLineUnitCode = value;
    }

}
