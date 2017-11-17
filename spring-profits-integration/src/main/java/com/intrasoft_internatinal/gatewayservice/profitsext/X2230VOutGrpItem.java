
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for X2230VOutGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="X2230VOutGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpOutCurrencyDescrCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutCurrencyDescrCurrencyNationalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutCurrencyDescrCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSdbExtraitChrInCcAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSdbExtraitComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSdbExtraitCommissionAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSdbExtraitExpenseAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSdbExtraitGuarrantyAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSdbExtraitJustificationCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmSdbExtraitPrvRentalBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSdbExtraitRentalAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSdbExtraitTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmSdbExtraitTransactionCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmSdbExtraitTrxAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSdbExtraitTrxCurr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmSdbExtraitTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmSdbExtraitTrxInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmSdbExtraitTrxSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmSdbExtraitTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmSdbExtraitTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutTaxGrmIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X2230VOutGrpItem", propOrder = {
    "outGrpOutCurrencyDescrCurrencyIdCurrency",
    "outGrpOutCurrencyDescrCurrencyNationalFlag",
    "outGrpOutCurrencyDescrCurrencyShortDescr",
    "outGrpOutGrmIefSuppliedSelectChar",
    "outGrpOutGrmSdbExtraitChrInCcAmn",
    "outGrpOutGrmSdbExtraitComments",
    "outGrpOutGrmSdbExtraitCommissionAmn",
    "outGrpOutGrmSdbExtraitExpenseAmn",
    "outGrpOutGrmSdbExtraitGuarrantyAmn",
    "outGrpOutGrmSdbExtraitJustificationCode",
    "outGrpOutGrmSdbExtraitPrvRentalBal",
    "outGrpOutGrmSdbExtraitRentalAmn",
    "outGrpOutGrmSdbExtraitTmstamp",
    "outGrpOutGrmSdbExtraitTransactionCode",
    "outGrpOutGrmSdbExtraitTrxAmn",
    "outGrpOutGrmSdbExtraitTrxCurr",
    "outGrpOutGrmSdbExtraitTrxDate",
    "outGrpOutGrmSdbExtraitTrxInternalSn",
    "outGrpOutGrmSdbExtraitTrxSn",
    "outGrpOutGrmSdbExtraitTrxUnit",
    "outGrpOutGrmSdbExtraitTrxUsr",
    "outGrpOutTaxGrmIefSuppliedAmount"
})
public class X2230VOutGrpItem {

    @XmlElement(name = "OutGrpOutCurrencyDescrCurrencyIdCurrency")
    protected int outGrpOutCurrencyDescrCurrencyIdCurrency;
    @XmlElement(name = "OutGrpOutCurrencyDescrCurrencyNationalFlag")
    protected String outGrpOutCurrencyDescrCurrencyNationalFlag;
    @XmlElement(name = "OutGrpOutCurrencyDescrCurrencyShortDescr")
    protected String outGrpOutCurrencyDescrCurrencyShortDescr;
    @XmlElement(name = "OutGrpOutGrmIefSuppliedSelectChar")
    protected String outGrpOutGrmIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpOutGrmSdbExtraitChrInCcAmn", required = true)
    protected BigDecimal outGrpOutGrmSdbExtraitChrInCcAmn;
    @XmlElement(name = "OutGrpOutGrmSdbExtraitComments")
    protected String outGrpOutGrmSdbExtraitComments;
    @XmlElement(name = "OutGrpOutGrmSdbExtraitCommissionAmn", required = true)
    protected BigDecimal outGrpOutGrmSdbExtraitCommissionAmn;
    @XmlElement(name = "OutGrpOutGrmSdbExtraitExpenseAmn", required = true)
    protected BigDecimal outGrpOutGrmSdbExtraitExpenseAmn;
    @XmlElement(name = "OutGrpOutGrmSdbExtraitGuarrantyAmn", required = true)
    protected BigDecimal outGrpOutGrmSdbExtraitGuarrantyAmn;
    @XmlElement(name = "OutGrpOutGrmSdbExtraitJustificationCode")
    protected int outGrpOutGrmSdbExtraitJustificationCode;
    @XmlElement(name = "OutGrpOutGrmSdbExtraitPrvRentalBal", required = true)
    protected BigDecimal outGrpOutGrmSdbExtraitPrvRentalBal;
    @XmlElement(name = "OutGrpOutGrmSdbExtraitRentalAmn", required = true)
    protected BigDecimal outGrpOutGrmSdbExtraitRentalAmn;
    @XmlElement(name = "OutGrpOutGrmSdbExtraitTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmSdbExtraitTmstamp;
    @XmlElement(name = "OutGrpOutGrmSdbExtraitTransactionCode")
    protected int outGrpOutGrmSdbExtraitTransactionCode;
    @XmlElement(name = "OutGrpOutGrmSdbExtraitTrxAmn", required = true)
    protected BigDecimal outGrpOutGrmSdbExtraitTrxAmn;
    @XmlElement(name = "OutGrpOutGrmSdbExtraitTrxCurr")
    protected int outGrpOutGrmSdbExtraitTrxCurr;
    @XmlElement(name = "OutGrpOutGrmSdbExtraitTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmSdbExtraitTrxDate;
    @XmlElement(name = "OutGrpOutGrmSdbExtraitTrxInternalSn")
    protected short outGrpOutGrmSdbExtraitTrxInternalSn;
    @XmlElement(name = "OutGrpOutGrmSdbExtraitTrxSn")
    protected int outGrpOutGrmSdbExtraitTrxSn;
    @XmlElement(name = "OutGrpOutGrmSdbExtraitTrxUnit")
    protected int outGrpOutGrmSdbExtraitTrxUnit;
    @XmlElement(name = "OutGrpOutGrmSdbExtraitTrxUsr")
    protected String outGrpOutGrmSdbExtraitTrxUsr;
    @XmlElement(name = "OutGrpOutTaxGrmIefSuppliedAmount", required = true)
    protected BigDecimal outGrpOutTaxGrmIefSuppliedAmount;

    /**
     * Gets the value of the outGrpOutCurrencyDescrCurrencyIdCurrency property.
     * 
     */
    public int getOutGrpOutCurrencyDescrCurrencyIdCurrency() {
        return outGrpOutCurrencyDescrCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outGrpOutCurrencyDescrCurrencyIdCurrency property.
     * 
     */
    public void setOutGrpOutCurrencyDescrCurrencyIdCurrency(int value) {
        this.outGrpOutCurrencyDescrCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outGrpOutCurrencyDescrCurrencyNationalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutCurrencyDescrCurrencyNationalFlag() {
        return outGrpOutCurrencyDescrCurrencyNationalFlag;
    }

    /**
     * Sets the value of the outGrpOutCurrencyDescrCurrencyNationalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutCurrencyDescrCurrencyNationalFlag(String value) {
        this.outGrpOutCurrencyDescrCurrencyNationalFlag = value;
    }

    /**
     * Gets the value of the outGrpOutCurrencyDescrCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutCurrencyDescrCurrencyShortDescr() {
        return outGrpOutCurrencyDescrCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpOutCurrencyDescrCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutCurrencyDescrCurrencyShortDescr(String value) {
        this.outGrpOutCurrencyDescrCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGrpOutGrmIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmIefSuppliedSelectChar() {
        return outGrpOutGrmIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpOutGrmIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmIefSuppliedSelectChar(String value) {
        this.outGrpOutGrmIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSdbExtraitChrInCcAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSdbExtraitChrInCcAmn() {
        return outGrpOutGrmSdbExtraitChrInCcAmn;
    }

    /**
     * Sets the value of the outGrpOutGrmSdbExtraitChrInCcAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSdbExtraitChrInCcAmn(BigDecimal value) {
        this.outGrpOutGrmSdbExtraitChrInCcAmn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSdbExtraitComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSdbExtraitComments() {
        return outGrpOutGrmSdbExtraitComments;
    }

    /**
     * Sets the value of the outGrpOutGrmSdbExtraitComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSdbExtraitComments(String value) {
        this.outGrpOutGrmSdbExtraitComments = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSdbExtraitCommissionAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSdbExtraitCommissionAmn() {
        return outGrpOutGrmSdbExtraitCommissionAmn;
    }

    /**
     * Sets the value of the outGrpOutGrmSdbExtraitCommissionAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSdbExtraitCommissionAmn(BigDecimal value) {
        this.outGrpOutGrmSdbExtraitCommissionAmn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSdbExtraitExpenseAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSdbExtraitExpenseAmn() {
        return outGrpOutGrmSdbExtraitExpenseAmn;
    }

    /**
     * Sets the value of the outGrpOutGrmSdbExtraitExpenseAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSdbExtraitExpenseAmn(BigDecimal value) {
        this.outGrpOutGrmSdbExtraitExpenseAmn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSdbExtraitGuarrantyAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSdbExtraitGuarrantyAmn() {
        return outGrpOutGrmSdbExtraitGuarrantyAmn;
    }

    /**
     * Sets the value of the outGrpOutGrmSdbExtraitGuarrantyAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSdbExtraitGuarrantyAmn(BigDecimal value) {
        this.outGrpOutGrmSdbExtraitGuarrantyAmn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSdbExtraitJustificationCode property.
     * 
     */
    public int getOutGrpOutGrmSdbExtraitJustificationCode() {
        return outGrpOutGrmSdbExtraitJustificationCode;
    }

    /**
     * Sets the value of the outGrpOutGrmSdbExtraitJustificationCode property.
     * 
     */
    public void setOutGrpOutGrmSdbExtraitJustificationCode(int value) {
        this.outGrpOutGrmSdbExtraitJustificationCode = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSdbExtraitPrvRentalBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSdbExtraitPrvRentalBal() {
        return outGrpOutGrmSdbExtraitPrvRentalBal;
    }

    /**
     * Sets the value of the outGrpOutGrmSdbExtraitPrvRentalBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSdbExtraitPrvRentalBal(BigDecimal value) {
        this.outGrpOutGrmSdbExtraitPrvRentalBal = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSdbExtraitRentalAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSdbExtraitRentalAmn() {
        return outGrpOutGrmSdbExtraitRentalAmn;
    }

    /**
     * Sets the value of the outGrpOutGrmSdbExtraitRentalAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSdbExtraitRentalAmn(BigDecimal value) {
        this.outGrpOutGrmSdbExtraitRentalAmn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSdbExtraitTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmSdbExtraitTmstamp() {
        return outGrpOutGrmSdbExtraitTmstamp;
    }

    /**
     * Sets the value of the outGrpOutGrmSdbExtraitTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmSdbExtraitTmstamp(XMLGregorianCalendar value) {
        this.outGrpOutGrmSdbExtraitTmstamp = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSdbExtraitTransactionCode property.
     * 
     */
    public int getOutGrpOutGrmSdbExtraitTransactionCode() {
        return outGrpOutGrmSdbExtraitTransactionCode;
    }

    /**
     * Sets the value of the outGrpOutGrmSdbExtraitTransactionCode property.
     * 
     */
    public void setOutGrpOutGrmSdbExtraitTransactionCode(int value) {
        this.outGrpOutGrmSdbExtraitTransactionCode = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSdbExtraitTrxAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSdbExtraitTrxAmn() {
        return outGrpOutGrmSdbExtraitTrxAmn;
    }

    /**
     * Sets the value of the outGrpOutGrmSdbExtraitTrxAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSdbExtraitTrxAmn(BigDecimal value) {
        this.outGrpOutGrmSdbExtraitTrxAmn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSdbExtraitTrxCurr property.
     * 
     */
    public int getOutGrpOutGrmSdbExtraitTrxCurr() {
        return outGrpOutGrmSdbExtraitTrxCurr;
    }

    /**
     * Sets the value of the outGrpOutGrmSdbExtraitTrxCurr property.
     * 
     */
    public void setOutGrpOutGrmSdbExtraitTrxCurr(int value) {
        this.outGrpOutGrmSdbExtraitTrxCurr = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSdbExtraitTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmSdbExtraitTrxDate() {
        return outGrpOutGrmSdbExtraitTrxDate;
    }

    /**
     * Sets the value of the outGrpOutGrmSdbExtraitTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmSdbExtraitTrxDate(XMLGregorianCalendar value) {
        this.outGrpOutGrmSdbExtraitTrxDate = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSdbExtraitTrxInternalSn property.
     * 
     */
    public short getOutGrpOutGrmSdbExtraitTrxInternalSn() {
        return outGrpOutGrmSdbExtraitTrxInternalSn;
    }

    /**
     * Sets the value of the outGrpOutGrmSdbExtraitTrxInternalSn property.
     * 
     */
    public void setOutGrpOutGrmSdbExtraitTrxInternalSn(short value) {
        this.outGrpOutGrmSdbExtraitTrxInternalSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSdbExtraitTrxSn property.
     * 
     */
    public int getOutGrpOutGrmSdbExtraitTrxSn() {
        return outGrpOutGrmSdbExtraitTrxSn;
    }

    /**
     * Sets the value of the outGrpOutGrmSdbExtraitTrxSn property.
     * 
     */
    public void setOutGrpOutGrmSdbExtraitTrxSn(int value) {
        this.outGrpOutGrmSdbExtraitTrxSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSdbExtraitTrxUnit property.
     * 
     */
    public int getOutGrpOutGrmSdbExtraitTrxUnit() {
        return outGrpOutGrmSdbExtraitTrxUnit;
    }

    /**
     * Sets the value of the outGrpOutGrmSdbExtraitTrxUnit property.
     * 
     */
    public void setOutGrpOutGrmSdbExtraitTrxUnit(int value) {
        this.outGrpOutGrmSdbExtraitTrxUnit = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSdbExtraitTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSdbExtraitTrxUsr() {
        return outGrpOutGrmSdbExtraitTrxUsr;
    }

    /**
     * Sets the value of the outGrpOutGrmSdbExtraitTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSdbExtraitTrxUsr(String value) {
        this.outGrpOutGrmSdbExtraitTrxUsr = value;
    }

    /**
     * Gets the value of the outGrpOutTaxGrmIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutTaxGrmIefSuppliedAmount() {
        return outGrpOutTaxGrmIefSuppliedAmount;
    }

    /**
     * Sets the value of the outGrpOutTaxGrmIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutTaxGrmIefSuppliedAmount(BigDecimal value) {
        this.outGrpOutTaxGrmIefSuppliedAmount = value;
    }

}
