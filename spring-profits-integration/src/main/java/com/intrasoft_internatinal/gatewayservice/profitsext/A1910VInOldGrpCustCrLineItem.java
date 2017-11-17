
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for A1910VInOldGrpCustCrLineItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="A1910VInOldGrpCustCrLineItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InOldGrpCustCrLineInOldGrmCrLineCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InOldGrpCustCrLineInOldGrmCrLineCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOldGrpCustCrLineInOldGrmCrLineUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOldGrpCustCrLineInOldGrmCustomerCreditLineCrlineAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InOldGrpCustCrLineInOldGrmCustomerCreditLineEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOldGrpCustCrLineInOldGrmCustomerCreditLineEvaluationDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InOldGrpCustCrLineInOldGrmCustomerCreditLineExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InOldGrpCustCrLineInOldGrmCustomerCreditLineReevaluationDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InOldGrpCustCrLineInOldGrmCustomerCreditLineTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InOldGrpCustCrLineInOldGrmCustomerCreditLineUtilisedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InOldGrpCustCrLineInOldGrmGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOldGrpCustCrLineInOldGrmGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InOldGrpCustCrLineInOldGrmIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOldGrpCustCrLineInOldGrmIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOldGrpCustCrLineInOldGrmcrLineUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "A1910VInOldGrpCustCrLineItem", propOrder = {
    "inOldGrpCustCrLineInOldGrmCrLineCurrencyIdCurrency",
    "inOldGrpCustCrLineInOldGrmCrLineCurrencyShortDescr",
    "inOldGrpCustCrLineInOldGrmCrLineUsrCode",
    "inOldGrpCustCrLineInOldGrmCustomerCreditLineCrlineAmount",
    "inOldGrpCustCrLineInOldGrmCustomerCreditLineEntryStatus",
    "inOldGrpCustCrLineInOldGrmCustomerCreditLineEvaluationDt",
    "inOldGrpCustCrLineInOldGrmCustomerCreditLineExpiryDate",
    "inOldGrpCustCrLineInOldGrmCustomerCreditLineReevaluationDt",
    "inOldGrpCustCrLineInOldGrmCustomerCreditLineTmstamp",
    "inOldGrpCustCrLineInOldGrmCustomerCreditLineUtilisedAmount",
    "inOldGrpCustCrLineInOldGrmGenericDetailDescription",
    "inOldGrpCustCrLineInOldGrmGenericDetailSerialNum",
    "inOldGrpCustCrLineInOldGrmIefSuppliedChar1",
    "inOldGrpCustCrLineInOldGrmIefSuppliedSelectChar",
    "inOldGrpCustCrLineInOldGrmcrLineUnitCode"
})
public class A1910VInOldGrpCustCrLineItem {

    @XmlElement(name = "InOldGrpCustCrLineInOldGrmCrLineCurrencyIdCurrency")
    protected int inOldGrpCustCrLineInOldGrmCrLineCurrencyIdCurrency;
    @XmlElement(name = "InOldGrpCustCrLineInOldGrmCrLineCurrencyShortDescr")
    protected String inOldGrpCustCrLineInOldGrmCrLineCurrencyShortDescr;
    @XmlElement(name = "InOldGrpCustCrLineInOldGrmCrLineUsrCode")
    protected String inOldGrpCustCrLineInOldGrmCrLineUsrCode;
    @XmlElement(name = "InOldGrpCustCrLineInOldGrmCustomerCreditLineCrlineAmount", required = true)
    protected BigDecimal inOldGrpCustCrLineInOldGrmCustomerCreditLineCrlineAmount;
    @XmlElement(name = "InOldGrpCustCrLineInOldGrmCustomerCreditLineEntryStatus")
    protected String inOldGrpCustCrLineInOldGrmCustomerCreditLineEntryStatus;
    @XmlElement(name = "InOldGrpCustCrLineInOldGrmCustomerCreditLineEvaluationDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inOldGrpCustCrLineInOldGrmCustomerCreditLineEvaluationDt;
    @XmlElement(name = "InOldGrpCustCrLineInOldGrmCustomerCreditLineExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inOldGrpCustCrLineInOldGrmCustomerCreditLineExpiryDate;
    @XmlElement(name = "InOldGrpCustCrLineInOldGrmCustomerCreditLineReevaluationDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inOldGrpCustCrLineInOldGrmCustomerCreditLineReevaluationDt;
    @XmlElement(name = "InOldGrpCustCrLineInOldGrmCustomerCreditLineTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inOldGrpCustCrLineInOldGrmCustomerCreditLineTmstamp;
    @XmlElement(name = "InOldGrpCustCrLineInOldGrmCustomerCreditLineUtilisedAmount", required = true)
    protected BigDecimal inOldGrpCustCrLineInOldGrmCustomerCreditLineUtilisedAmount;
    @XmlElement(name = "InOldGrpCustCrLineInOldGrmGenericDetailDescription")
    protected String inOldGrpCustCrLineInOldGrmGenericDetailDescription;
    @XmlElement(name = "InOldGrpCustCrLineInOldGrmGenericDetailSerialNum")
    protected int inOldGrpCustCrLineInOldGrmGenericDetailSerialNum;
    @XmlElement(name = "InOldGrpCustCrLineInOldGrmIefSuppliedChar1")
    protected String inOldGrpCustCrLineInOldGrmIefSuppliedChar1;
    @XmlElement(name = "InOldGrpCustCrLineInOldGrmIefSuppliedSelectChar")
    protected String inOldGrpCustCrLineInOldGrmIefSuppliedSelectChar;
    @XmlElement(name = "InOldGrpCustCrLineInOldGrmcrLineUnitCode")
    protected int inOldGrpCustCrLineInOldGrmcrLineUnitCode;

    /**
     * Gets the value of the inOldGrpCustCrLineInOldGrmCrLineCurrencyIdCurrency property.
     * 
     */
    public int getInOldGrpCustCrLineInOldGrmCrLineCurrencyIdCurrency() {
        return inOldGrpCustCrLineInOldGrmCrLineCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inOldGrpCustCrLineInOldGrmCrLineCurrencyIdCurrency property.
     * 
     */
    public void setInOldGrpCustCrLineInOldGrmCrLineCurrencyIdCurrency(int value) {
        this.inOldGrpCustCrLineInOldGrmCrLineCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inOldGrpCustCrLineInOldGrmCrLineCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOldGrpCustCrLineInOldGrmCrLineCurrencyShortDescr() {
        return inOldGrpCustCrLineInOldGrmCrLineCurrencyShortDescr;
    }

    /**
     * Sets the value of the inOldGrpCustCrLineInOldGrmCrLineCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOldGrpCustCrLineInOldGrmCrLineCurrencyShortDescr(String value) {
        this.inOldGrpCustCrLineInOldGrmCrLineCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inOldGrpCustCrLineInOldGrmCrLineUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOldGrpCustCrLineInOldGrmCrLineUsrCode() {
        return inOldGrpCustCrLineInOldGrmCrLineUsrCode;
    }

    /**
     * Sets the value of the inOldGrpCustCrLineInOldGrmCrLineUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOldGrpCustCrLineInOldGrmCrLineUsrCode(String value) {
        this.inOldGrpCustCrLineInOldGrmCrLineUsrCode = value;
    }

    /**
     * Gets the value of the inOldGrpCustCrLineInOldGrmCustomerCreditLineCrlineAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInOldGrpCustCrLineInOldGrmCustomerCreditLineCrlineAmount() {
        return inOldGrpCustCrLineInOldGrmCustomerCreditLineCrlineAmount;
    }

    /**
     * Sets the value of the inOldGrpCustCrLineInOldGrmCustomerCreditLineCrlineAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInOldGrpCustCrLineInOldGrmCustomerCreditLineCrlineAmount(BigDecimal value) {
        this.inOldGrpCustCrLineInOldGrmCustomerCreditLineCrlineAmount = value;
    }

    /**
     * Gets the value of the inOldGrpCustCrLineInOldGrmCustomerCreditLineEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOldGrpCustCrLineInOldGrmCustomerCreditLineEntryStatus() {
        return inOldGrpCustCrLineInOldGrmCustomerCreditLineEntryStatus;
    }

    /**
     * Sets the value of the inOldGrpCustCrLineInOldGrmCustomerCreditLineEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOldGrpCustCrLineInOldGrmCustomerCreditLineEntryStatus(String value) {
        this.inOldGrpCustCrLineInOldGrmCustomerCreditLineEntryStatus = value;
    }

    /**
     * Gets the value of the inOldGrpCustCrLineInOldGrmCustomerCreditLineEvaluationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInOldGrpCustCrLineInOldGrmCustomerCreditLineEvaluationDt() {
        return inOldGrpCustCrLineInOldGrmCustomerCreditLineEvaluationDt;
    }

    /**
     * Sets the value of the inOldGrpCustCrLineInOldGrmCustomerCreditLineEvaluationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInOldGrpCustCrLineInOldGrmCustomerCreditLineEvaluationDt(XMLGregorianCalendar value) {
        this.inOldGrpCustCrLineInOldGrmCustomerCreditLineEvaluationDt = value;
    }

    /**
     * Gets the value of the inOldGrpCustCrLineInOldGrmCustomerCreditLineExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInOldGrpCustCrLineInOldGrmCustomerCreditLineExpiryDate() {
        return inOldGrpCustCrLineInOldGrmCustomerCreditLineExpiryDate;
    }

    /**
     * Sets the value of the inOldGrpCustCrLineInOldGrmCustomerCreditLineExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInOldGrpCustCrLineInOldGrmCustomerCreditLineExpiryDate(XMLGregorianCalendar value) {
        this.inOldGrpCustCrLineInOldGrmCustomerCreditLineExpiryDate = value;
    }

    /**
     * Gets the value of the inOldGrpCustCrLineInOldGrmCustomerCreditLineReevaluationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInOldGrpCustCrLineInOldGrmCustomerCreditLineReevaluationDt() {
        return inOldGrpCustCrLineInOldGrmCustomerCreditLineReevaluationDt;
    }

    /**
     * Sets the value of the inOldGrpCustCrLineInOldGrmCustomerCreditLineReevaluationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInOldGrpCustCrLineInOldGrmCustomerCreditLineReevaluationDt(XMLGregorianCalendar value) {
        this.inOldGrpCustCrLineInOldGrmCustomerCreditLineReevaluationDt = value;
    }

    /**
     * Gets the value of the inOldGrpCustCrLineInOldGrmCustomerCreditLineTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInOldGrpCustCrLineInOldGrmCustomerCreditLineTmstamp() {
        return inOldGrpCustCrLineInOldGrmCustomerCreditLineTmstamp;
    }

    /**
     * Sets the value of the inOldGrpCustCrLineInOldGrmCustomerCreditLineTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInOldGrpCustCrLineInOldGrmCustomerCreditLineTmstamp(XMLGregorianCalendar value) {
        this.inOldGrpCustCrLineInOldGrmCustomerCreditLineTmstamp = value;
    }

    /**
     * Gets the value of the inOldGrpCustCrLineInOldGrmCustomerCreditLineUtilisedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInOldGrpCustCrLineInOldGrmCustomerCreditLineUtilisedAmount() {
        return inOldGrpCustCrLineInOldGrmCustomerCreditLineUtilisedAmount;
    }

    /**
     * Sets the value of the inOldGrpCustCrLineInOldGrmCustomerCreditLineUtilisedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInOldGrpCustCrLineInOldGrmCustomerCreditLineUtilisedAmount(BigDecimal value) {
        this.inOldGrpCustCrLineInOldGrmCustomerCreditLineUtilisedAmount = value;
    }

    /**
     * Gets the value of the inOldGrpCustCrLineInOldGrmGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOldGrpCustCrLineInOldGrmGenericDetailDescription() {
        return inOldGrpCustCrLineInOldGrmGenericDetailDescription;
    }

    /**
     * Sets the value of the inOldGrpCustCrLineInOldGrmGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOldGrpCustCrLineInOldGrmGenericDetailDescription(String value) {
        this.inOldGrpCustCrLineInOldGrmGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inOldGrpCustCrLineInOldGrmGenericDetailSerialNum property.
     * 
     */
    public int getInOldGrpCustCrLineInOldGrmGenericDetailSerialNum() {
        return inOldGrpCustCrLineInOldGrmGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inOldGrpCustCrLineInOldGrmGenericDetailSerialNum property.
     * 
     */
    public void setInOldGrpCustCrLineInOldGrmGenericDetailSerialNum(int value) {
        this.inOldGrpCustCrLineInOldGrmGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inOldGrpCustCrLineInOldGrmIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOldGrpCustCrLineInOldGrmIefSuppliedChar1() {
        return inOldGrpCustCrLineInOldGrmIefSuppliedChar1;
    }

    /**
     * Sets the value of the inOldGrpCustCrLineInOldGrmIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOldGrpCustCrLineInOldGrmIefSuppliedChar1(String value) {
        this.inOldGrpCustCrLineInOldGrmIefSuppliedChar1 = value;
    }

    /**
     * Gets the value of the inOldGrpCustCrLineInOldGrmIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOldGrpCustCrLineInOldGrmIefSuppliedSelectChar() {
        return inOldGrpCustCrLineInOldGrmIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the inOldGrpCustCrLineInOldGrmIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOldGrpCustCrLineInOldGrmIefSuppliedSelectChar(String value) {
        this.inOldGrpCustCrLineInOldGrmIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the inOldGrpCustCrLineInOldGrmcrLineUnitCode property.
     * 
     */
    public int getInOldGrpCustCrLineInOldGrmcrLineUnitCode() {
        return inOldGrpCustCrLineInOldGrmcrLineUnitCode;
    }

    /**
     * Sets the value of the inOldGrpCustCrLineInOldGrmcrLineUnitCode property.
     * 
     */
    public void setInOldGrpCustCrLineInOldGrmcrLineUnitCode(int value) {
        this.inOldGrpCustCrLineInOldGrmcrLineUnitCode = value;
    }

}
