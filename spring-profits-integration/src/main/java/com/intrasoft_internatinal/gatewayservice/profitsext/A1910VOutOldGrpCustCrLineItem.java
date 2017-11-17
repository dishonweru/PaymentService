
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for A1910VOutOldGrpCustCrLineItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="A1910VOutOldGrpCustCrLineItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutOldGrpCustCrLineOutOldGrmCrLineCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOldGrpCustCrLineOutOldGrmCrLineCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOldGrpCustCrLineOutOldGrmCrLineUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOldGrpCustCrLineOutOldGrmCustomerCreditLineCrlineAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutOldGrpCustCrLineOutOldGrmCustomerCreditLineEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOldGrpCustCrLineOutOldGrmCustomerCreditLineEvaluationDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutOldGrpCustCrLineOutOldGrmCustomerCreditLineExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutOldGrpCustCrLineOutOldGrmCustomerCreditLineReevaluationDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutOldGrpCustCrLineOutOldGrmCustomerCreditLineTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutOldGrpCustCrLineOutOldGrmCustomerCreditLineUtilisedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutOldGrpCustCrLineOutOldGrmGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOldGrpCustCrLineOutOldGrmGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOldGrpCustCrLineOutOldGrmIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOldGrpCustCrLineOutOldGrmIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOldGrpCustCrLineOutOldGrmcrLineUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "A1910VOutOldGrpCustCrLineItem", propOrder = {
    "outOldGrpCustCrLineOutOldGrmCrLineCurrencyIdCurrency",
    "outOldGrpCustCrLineOutOldGrmCrLineCurrencyShortDescr",
    "outOldGrpCustCrLineOutOldGrmCrLineUsrCode",
    "outOldGrpCustCrLineOutOldGrmCustomerCreditLineCrlineAmount",
    "outOldGrpCustCrLineOutOldGrmCustomerCreditLineEntryStatus",
    "outOldGrpCustCrLineOutOldGrmCustomerCreditLineEvaluationDt",
    "outOldGrpCustCrLineOutOldGrmCustomerCreditLineExpiryDate",
    "outOldGrpCustCrLineOutOldGrmCustomerCreditLineReevaluationDt",
    "outOldGrpCustCrLineOutOldGrmCustomerCreditLineTmstamp",
    "outOldGrpCustCrLineOutOldGrmCustomerCreditLineUtilisedAmount",
    "outOldGrpCustCrLineOutOldGrmGenericDetailDescription",
    "outOldGrpCustCrLineOutOldGrmGenericDetailSerialNum",
    "outOldGrpCustCrLineOutOldGrmIefSuppliedChar1",
    "outOldGrpCustCrLineOutOldGrmIefSuppliedSelectChar",
    "outOldGrpCustCrLineOutOldGrmcrLineUnitCode"
})
public class A1910VOutOldGrpCustCrLineItem {

    @XmlElement(name = "OutOldGrpCustCrLineOutOldGrmCrLineCurrencyIdCurrency")
    protected int outOldGrpCustCrLineOutOldGrmCrLineCurrencyIdCurrency;
    @XmlElement(name = "OutOldGrpCustCrLineOutOldGrmCrLineCurrencyShortDescr")
    protected String outOldGrpCustCrLineOutOldGrmCrLineCurrencyShortDescr;
    @XmlElement(name = "OutOldGrpCustCrLineOutOldGrmCrLineUsrCode")
    protected String outOldGrpCustCrLineOutOldGrmCrLineUsrCode;
    @XmlElement(name = "OutOldGrpCustCrLineOutOldGrmCustomerCreditLineCrlineAmount", required = true)
    protected BigDecimal outOldGrpCustCrLineOutOldGrmCustomerCreditLineCrlineAmount;
    @XmlElement(name = "OutOldGrpCustCrLineOutOldGrmCustomerCreditLineEntryStatus")
    protected String outOldGrpCustCrLineOutOldGrmCustomerCreditLineEntryStatus;
    @XmlElement(name = "OutOldGrpCustCrLineOutOldGrmCustomerCreditLineEvaluationDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outOldGrpCustCrLineOutOldGrmCustomerCreditLineEvaluationDt;
    @XmlElement(name = "OutOldGrpCustCrLineOutOldGrmCustomerCreditLineExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outOldGrpCustCrLineOutOldGrmCustomerCreditLineExpiryDate;
    @XmlElement(name = "OutOldGrpCustCrLineOutOldGrmCustomerCreditLineReevaluationDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outOldGrpCustCrLineOutOldGrmCustomerCreditLineReevaluationDt;
    @XmlElement(name = "OutOldGrpCustCrLineOutOldGrmCustomerCreditLineTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outOldGrpCustCrLineOutOldGrmCustomerCreditLineTmstamp;
    @XmlElement(name = "OutOldGrpCustCrLineOutOldGrmCustomerCreditLineUtilisedAmount", required = true)
    protected BigDecimal outOldGrpCustCrLineOutOldGrmCustomerCreditLineUtilisedAmount;
    @XmlElement(name = "OutOldGrpCustCrLineOutOldGrmGenericDetailDescription")
    protected String outOldGrpCustCrLineOutOldGrmGenericDetailDescription;
    @XmlElement(name = "OutOldGrpCustCrLineOutOldGrmGenericDetailSerialNum")
    protected int outOldGrpCustCrLineOutOldGrmGenericDetailSerialNum;
    @XmlElement(name = "OutOldGrpCustCrLineOutOldGrmIefSuppliedChar1")
    protected String outOldGrpCustCrLineOutOldGrmIefSuppliedChar1;
    @XmlElement(name = "OutOldGrpCustCrLineOutOldGrmIefSuppliedSelectChar")
    protected String outOldGrpCustCrLineOutOldGrmIefSuppliedSelectChar;
    @XmlElement(name = "OutOldGrpCustCrLineOutOldGrmcrLineUnitCode")
    protected int outOldGrpCustCrLineOutOldGrmcrLineUnitCode;

    /**
     * Gets the value of the outOldGrpCustCrLineOutOldGrmCrLineCurrencyIdCurrency property.
     * 
     */
    public int getOutOldGrpCustCrLineOutOldGrmCrLineCurrencyIdCurrency() {
        return outOldGrpCustCrLineOutOldGrmCrLineCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outOldGrpCustCrLineOutOldGrmCrLineCurrencyIdCurrency property.
     * 
     */
    public void setOutOldGrpCustCrLineOutOldGrmCrLineCurrencyIdCurrency(int value) {
        this.outOldGrpCustCrLineOutOldGrmCrLineCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outOldGrpCustCrLineOutOldGrmCrLineCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOldGrpCustCrLineOutOldGrmCrLineCurrencyShortDescr() {
        return outOldGrpCustCrLineOutOldGrmCrLineCurrencyShortDescr;
    }

    /**
     * Sets the value of the outOldGrpCustCrLineOutOldGrmCrLineCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOldGrpCustCrLineOutOldGrmCrLineCurrencyShortDescr(String value) {
        this.outOldGrpCustCrLineOutOldGrmCrLineCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outOldGrpCustCrLineOutOldGrmCrLineUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOldGrpCustCrLineOutOldGrmCrLineUsrCode() {
        return outOldGrpCustCrLineOutOldGrmCrLineUsrCode;
    }

    /**
     * Sets the value of the outOldGrpCustCrLineOutOldGrmCrLineUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOldGrpCustCrLineOutOldGrmCrLineUsrCode(String value) {
        this.outOldGrpCustCrLineOutOldGrmCrLineUsrCode = value;
    }

    /**
     * Gets the value of the outOldGrpCustCrLineOutOldGrmCustomerCreditLineCrlineAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutOldGrpCustCrLineOutOldGrmCustomerCreditLineCrlineAmount() {
        return outOldGrpCustCrLineOutOldGrmCustomerCreditLineCrlineAmount;
    }

    /**
     * Sets the value of the outOldGrpCustCrLineOutOldGrmCustomerCreditLineCrlineAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutOldGrpCustCrLineOutOldGrmCustomerCreditLineCrlineAmount(BigDecimal value) {
        this.outOldGrpCustCrLineOutOldGrmCustomerCreditLineCrlineAmount = value;
    }

    /**
     * Gets the value of the outOldGrpCustCrLineOutOldGrmCustomerCreditLineEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOldGrpCustCrLineOutOldGrmCustomerCreditLineEntryStatus() {
        return outOldGrpCustCrLineOutOldGrmCustomerCreditLineEntryStatus;
    }

    /**
     * Sets the value of the outOldGrpCustCrLineOutOldGrmCustomerCreditLineEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOldGrpCustCrLineOutOldGrmCustomerCreditLineEntryStatus(String value) {
        this.outOldGrpCustCrLineOutOldGrmCustomerCreditLineEntryStatus = value;
    }

    /**
     * Gets the value of the outOldGrpCustCrLineOutOldGrmCustomerCreditLineEvaluationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutOldGrpCustCrLineOutOldGrmCustomerCreditLineEvaluationDt() {
        return outOldGrpCustCrLineOutOldGrmCustomerCreditLineEvaluationDt;
    }

    /**
     * Sets the value of the outOldGrpCustCrLineOutOldGrmCustomerCreditLineEvaluationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutOldGrpCustCrLineOutOldGrmCustomerCreditLineEvaluationDt(XMLGregorianCalendar value) {
        this.outOldGrpCustCrLineOutOldGrmCustomerCreditLineEvaluationDt = value;
    }

    /**
     * Gets the value of the outOldGrpCustCrLineOutOldGrmCustomerCreditLineExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutOldGrpCustCrLineOutOldGrmCustomerCreditLineExpiryDate() {
        return outOldGrpCustCrLineOutOldGrmCustomerCreditLineExpiryDate;
    }

    /**
     * Sets the value of the outOldGrpCustCrLineOutOldGrmCustomerCreditLineExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutOldGrpCustCrLineOutOldGrmCustomerCreditLineExpiryDate(XMLGregorianCalendar value) {
        this.outOldGrpCustCrLineOutOldGrmCustomerCreditLineExpiryDate = value;
    }

    /**
     * Gets the value of the outOldGrpCustCrLineOutOldGrmCustomerCreditLineReevaluationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutOldGrpCustCrLineOutOldGrmCustomerCreditLineReevaluationDt() {
        return outOldGrpCustCrLineOutOldGrmCustomerCreditLineReevaluationDt;
    }

    /**
     * Sets the value of the outOldGrpCustCrLineOutOldGrmCustomerCreditLineReevaluationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutOldGrpCustCrLineOutOldGrmCustomerCreditLineReevaluationDt(XMLGregorianCalendar value) {
        this.outOldGrpCustCrLineOutOldGrmCustomerCreditLineReevaluationDt = value;
    }

    /**
     * Gets the value of the outOldGrpCustCrLineOutOldGrmCustomerCreditLineTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutOldGrpCustCrLineOutOldGrmCustomerCreditLineTmstamp() {
        return outOldGrpCustCrLineOutOldGrmCustomerCreditLineTmstamp;
    }

    /**
     * Sets the value of the outOldGrpCustCrLineOutOldGrmCustomerCreditLineTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutOldGrpCustCrLineOutOldGrmCustomerCreditLineTmstamp(XMLGregorianCalendar value) {
        this.outOldGrpCustCrLineOutOldGrmCustomerCreditLineTmstamp = value;
    }

    /**
     * Gets the value of the outOldGrpCustCrLineOutOldGrmCustomerCreditLineUtilisedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutOldGrpCustCrLineOutOldGrmCustomerCreditLineUtilisedAmount() {
        return outOldGrpCustCrLineOutOldGrmCustomerCreditLineUtilisedAmount;
    }

    /**
     * Sets the value of the outOldGrpCustCrLineOutOldGrmCustomerCreditLineUtilisedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutOldGrpCustCrLineOutOldGrmCustomerCreditLineUtilisedAmount(BigDecimal value) {
        this.outOldGrpCustCrLineOutOldGrmCustomerCreditLineUtilisedAmount = value;
    }

    /**
     * Gets the value of the outOldGrpCustCrLineOutOldGrmGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOldGrpCustCrLineOutOldGrmGenericDetailDescription() {
        return outOldGrpCustCrLineOutOldGrmGenericDetailDescription;
    }

    /**
     * Sets the value of the outOldGrpCustCrLineOutOldGrmGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOldGrpCustCrLineOutOldGrmGenericDetailDescription(String value) {
        this.outOldGrpCustCrLineOutOldGrmGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outOldGrpCustCrLineOutOldGrmGenericDetailSerialNum property.
     * 
     */
    public int getOutOldGrpCustCrLineOutOldGrmGenericDetailSerialNum() {
        return outOldGrpCustCrLineOutOldGrmGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outOldGrpCustCrLineOutOldGrmGenericDetailSerialNum property.
     * 
     */
    public void setOutOldGrpCustCrLineOutOldGrmGenericDetailSerialNum(int value) {
        this.outOldGrpCustCrLineOutOldGrmGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outOldGrpCustCrLineOutOldGrmIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOldGrpCustCrLineOutOldGrmIefSuppliedChar1() {
        return outOldGrpCustCrLineOutOldGrmIefSuppliedChar1;
    }

    /**
     * Sets the value of the outOldGrpCustCrLineOutOldGrmIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOldGrpCustCrLineOutOldGrmIefSuppliedChar1(String value) {
        this.outOldGrpCustCrLineOutOldGrmIefSuppliedChar1 = value;
    }

    /**
     * Gets the value of the outOldGrpCustCrLineOutOldGrmIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOldGrpCustCrLineOutOldGrmIefSuppliedSelectChar() {
        return outOldGrpCustCrLineOutOldGrmIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outOldGrpCustCrLineOutOldGrmIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOldGrpCustCrLineOutOldGrmIefSuppliedSelectChar(String value) {
        this.outOldGrpCustCrLineOutOldGrmIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outOldGrpCustCrLineOutOldGrmcrLineUnitCode property.
     * 
     */
    public int getOutOldGrpCustCrLineOutOldGrmcrLineUnitCode() {
        return outOldGrpCustCrLineOutOldGrmcrLineUnitCode;
    }

    /**
     * Sets the value of the outOldGrpCustCrLineOutOldGrmcrLineUnitCode property.
     * 
     */
    public void setOutOldGrpCustCrLineOutOldGrmcrLineUnitCode(int value) {
        this.outOldGrpCustCrLineOutOldGrmcrLineUnitCode = value;
    }

}
