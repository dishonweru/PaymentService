
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutExtrait complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutExtrait">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutExtraitOutFstDemandExtraitChequeCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutExtraitOutFstDemandExtraitChequeNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutExtraitOutFstDemandExtraitDebitCreditFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtraitOutFstDemandExtraitEntryAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutExtraitOutFstDemandExtraitEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtraitOutFstDemandExtraitIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutExtraitOutFstDemandExtraitIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutExtraitOutFstDemandExtraitPrevAccBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutExtraitOutFstDemandExtraitReverseFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtraitOutFstDemandExtraitTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutExtraitOutFstDemandExtraitTrxSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutExtraitOutFstDemandExtraitTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutExtraitOutFstDemandExtraitTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtraitOutFstDemandExtraitValueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutExtraitOutGrpDepositAccountBookBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutExtraitOutFstDemandExtraitTransSerNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutExtraitOutFstDemandExtraitEntrySerNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutExtraitOutFstDemandExtraitTunInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutExtrait", propOrder = {
    "outExtraitOutFstDemandExtraitChequeCd",
    "outExtraitOutFstDemandExtraitChequeNumber",
    "outExtraitOutFstDemandExtraitDebitCreditFlag",
    "outExtraitOutFstDemandExtraitEntryAmount",
    "outExtraitOutFstDemandExtraitEntryComments",
    "outExtraitOutFstDemandExtraitIdJustific",
    "outExtraitOutFstDemandExtraitIdTransact",
    "outExtraitOutFstDemandExtraitPrevAccBalance",
    "outExtraitOutFstDemandExtraitReverseFlag",
    "outExtraitOutFstDemandExtraitTrxDate",
    "outExtraitOutFstDemandExtraitTrxSn",
    "outExtraitOutFstDemandExtraitTrxUnit",
    "outExtraitOutFstDemandExtraitTrxUsr",
    "outExtraitOutFstDemandExtraitValueDate",
    "outExtraitOutGrpDepositAccountBookBalance",
    "outExtraitOutFstDemandExtraitTransSerNum",
    "outExtraitOutFstDemandExtraitEntrySerNum",
    "outExtraitOutFstDemandExtraitTunInternalSn"
})
public class OutExtrait {

    @XmlElement(name = "OutExtraitOutFstDemandExtraitChequeCd")
    protected short outExtraitOutFstDemandExtraitChequeCd;
    @XmlElement(name = "OutExtraitOutFstDemandExtraitChequeNumber")
    protected double outExtraitOutFstDemandExtraitChequeNumber;
    @XmlElement(name = "OutExtraitOutFstDemandExtraitDebitCreditFlag")
    protected String outExtraitOutFstDemandExtraitDebitCreditFlag;
    @XmlElement(name = "OutExtraitOutFstDemandExtraitEntryAmount", required = true)
    protected BigDecimal outExtraitOutFstDemandExtraitEntryAmount;
    @XmlElement(name = "OutExtraitOutFstDemandExtraitEntryComments")
    protected String outExtraitOutFstDemandExtraitEntryComments;
    @XmlElement(name = "OutExtraitOutFstDemandExtraitIdJustific")
    protected int outExtraitOutFstDemandExtraitIdJustific;
    @XmlElement(name = "OutExtraitOutFstDemandExtraitIdTransact")
    protected int outExtraitOutFstDemandExtraitIdTransact;
    @XmlElement(name = "OutExtraitOutFstDemandExtraitPrevAccBalance", required = true)
    protected BigDecimal outExtraitOutFstDemandExtraitPrevAccBalance;
    @XmlElement(name = "OutExtraitOutFstDemandExtraitReverseFlag")
    protected String outExtraitOutFstDemandExtraitReverseFlag;
    @XmlElement(name = "OutExtraitOutFstDemandExtraitTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outExtraitOutFstDemandExtraitTrxDate;
    @XmlElement(name = "OutExtraitOutFstDemandExtraitTrxSn")
    protected int outExtraitOutFstDemandExtraitTrxSn;
    @XmlElement(name = "OutExtraitOutFstDemandExtraitTrxUnit")
    protected int outExtraitOutFstDemandExtraitTrxUnit;
    @XmlElement(name = "OutExtraitOutFstDemandExtraitTrxUsr")
    protected String outExtraitOutFstDemandExtraitTrxUsr;
    @XmlElement(name = "OutExtraitOutFstDemandExtraitValueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outExtraitOutFstDemandExtraitValueDate;
    @XmlElement(name = "OutExtraitOutGrpDepositAccountBookBalance", required = true)
    protected BigDecimal outExtraitOutGrpDepositAccountBookBalance;
    @XmlElement(name = "OutExtraitOutFstDemandExtraitTransSerNum")
    protected int outExtraitOutFstDemandExtraitTransSerNum;
    @XmlElement(name = "OutExtraitOutFstDemandExtraitEntrySerNum")
    protected short outExtraitOutFstDemandExtraitEntrySerNum;
    @XmlElement(name = "OutExtraitOutFstDemandExtraitTunInternalSn")
    protected short outExtraitOutFstDemandExtraitTunInternalSn;

    /**
     * Gets the value of the outExtraitOutFstDemandExtraitChequeCd property.
     * 
     */
    public short getOutExtraitOutFstDemandExtraitChequeCd() {
        return outExtraitOutFstDemandExtraitChequeCd;
    }

    /**
     * Sets the value of the outExtraitOutFstDemandExtraitChequeCd property.
     * 
     */
    public void setOutExtraitOutFstDemandExtraitChequeCd(short value) {
        this.outExtraitOutFstDemandExtraitChequeCd = value;
    }

    /**
     * Gets the value of the outExtraitOutFstDemandExtraitChequeNumber property.
     * 
     */
    public double getOutExtraitOutFstDemandExtraitChequeNumber() {
        return outExtraitOutFstDemandExtraitChequeNumber;
    }

    /**
     * Sets the value of the outExtraitOutFstDemandExtraitChequeNumber property.
     * 
     */
    public void setOutExtraitOutFstDemandExtraitChequeNumber(double value) {
        this.outExtraitOutFstDemandExtraitChequeNumber = value;
    }

    /**
     * Gets the value of the outExtraitOutFstDemandExtraitDebitCreditFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtraitOutFstDemandExtraitDebitCreditFlag() {
        return outExtraitOutFstDemandExtraitDebitCreditFlag;
    }

    /**
     * Sets the value of the outExtraitOutFstDemandExtraitDebitCreditFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtraitOutFstDemandExtraitDebitCreditFlag(String value) {
        this.outExtraitOutFstDemandExtraitDebitCreditFlag = value;
    }

    /**
     * Gets the value of the outExtraitOutFstDemandExtraitEntryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutExtraitOutFstDemandExtraitEntryAmount() {
        return outExtraitOutFstDemandExtraitEntryAmount;
    }

    /**
     * Sets the value of the outExtraitOutFstDemandExtraitEntryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutExtraitOutFstDemandExtraitEntryAmount(BigDecimal value) {
        this.outExtraitOutFstDemandExtraitEntryAmount = value;
    }

    /**
     * Gets the value of the outExtraitOutFstDemandExtraitEntryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtraitOutFstDemandExtraitEntryComments() {
        return outExtraitOutFstDemandExtraitEntryComments;
    }

    /**
     * Sets the value of the outExtraitOutFstDemandExtraitEntryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtraitOutFstDemandExtraitEntryComments(String value) {
        this.outExtraitOutFstDemandExtraitEntryComments = value;
    }

    /**
     * Gets the value of the outExtraitOutFstDemandExtraitIdJustific property.
     * 
     */
    public int getOutExtraitOutFstDemandExtraitIdJustific() {
        return outExtraitOutFstDemandExtraitIdJustific;
    }

    /**
     * Sets the value of the outExtraitOutFstDemandExtraitIdJustific property.
     * 
     */
    public void setOutExtraitOutFstDemandExtraitIdJustific(int value) {
        this.outExtraitOutFstDemandExtraitIdJustific = value;
    }

    /**
     * Gets the value of the outExtraitOutFstDemandExtraitIdTransact property.
     * 
     */
    public int getOutExtraitOutFstDemandExtraitIdTransact() {
        return outExtraitOutFstDemandExtraitIdTransact;
    }

    /**
     * Sets the value of the outExtraitOutFstDemandExtraitIdTransact property.
     * 
     */
    public void setOutExtraitOutFstDemandExtraitIdTransact(int value) {
        this.outExtraitOutFstDemandExtraitIdTransact = value;
    }

    /**
     * Gets the value of the outExtraitOutFstDemandExtraitPrevAccBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutExtraitOutFstDemandExtraitPrevAccBalance() {
        return outExtraitOutFstDemandExtraitPrevAccBalance;
    }

    /**
     * Sets the value of the outExtraitOutFstDemandExtraitPrevAccBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutExtraitOutFstDemandExtraitPrevAccBalance(BigDecimal value) {
        this.outExtraitOutFstDemandExtraitPrevAccBalance = value;
    }

    /**
     * Gets the value of the outExtraitOutFstDemandExtraitReverseFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtraitOutFstDemandExtraitReverseFlag() {
        return outExtraitOutFstDemandExtraitReverseFlag;
    }

    /**
     * Sets the value of the outExtraitOutFstDemandExtraitReverseFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtraitOutFstDemandExtraitReverseFlag(String value) {
        this.outExtraitOutFstDemandExtraitReverseFlag = value;
    }

    /**
     * Gets the value of the outExtraitOutFstDemandExtraitTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutExtraitOutFstDemandExtraitTrxDate() {
        return outExtraitOutFstDemandExtraitTrxDate;
    }

    /**
     * Sets the value of the outExtraitOutFstDemandExtraitTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutExtraitOutFstDemandExtraitTrxDate(XMLGregorianCalendar value) {
        this.outExtraitOutFstDemandExtraitTrxDate = value;
    }

    /**
     * Gets the value of the outExtraitOutFstDemandExtraitTrxSn property.
     * 
     */
    public int getOutExtraitOutFstDemandExtraitTrxSn() {
        return outExtraitOutFstDemandExtraitTrxSn;
    }

    /**
     * Sets the value of the outExtraitOutFstDemandExtraitTrxSn property.
     * 
     */
    public void setOutExtraitOutFstDemandExtraitTrxSn(int value) {
        this.outExtraitOutFstDemandExtraitTrxSn = value;
    }

    /**
     * Gets the value of the outExtraitOutFstDemandExtraitTrxUnit property.
     * 
     */
    public int getOutExtraitOutFstDemandExtraitTrxUnit() {
        return outExtraitOutFstDemandExtraitTrxUnit;
    }

    /**
     * Sets the value of the outExtraitOutFstDemandExtraitTrxUnit property.
     * 
     */
    public void setOutExtraitOutFstDemandExtraitTrxUnit(int value) {
        this.outExtraitOutFstDemandExtraitTrxUnit = value;
    }

    /**
     * Gets the value of the outExtraitOutFstDemandExtraitTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtraitOutFstDemandExtraitTrxUsr() {
        return outExtraitOutFstDemandExtraitTrxUsr;
    }

    /**
     * Sets the value of the outExtraitOutFstDemandExtraitTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtraitOutFstDemandExtraitTrxUsr(String value) {
        this.outExtraitOutFstDemandExtraitTrxUsr = value;
    }

    /**
     * Gets the value of the outExtraitOutFstDemandExtraitValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutExtraitOutFstDemandExtraitValueDate() {
        return outExtraitOutFstDemandExtraitValueDate;
    }

    /**
     * Sets the value of the outExtraitOutFstDemandExtraitValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutExtraitOutFstDemandExtraitValueDate(XMLGregorianCalendar value) {
        this.outExtraitOutFstDemandExtraitValueDate = value;
    }

    /**
     * Gets the value of the outExtraitOutGrpDepositAccountBookBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutExtraitOutGrpDepositAccountBookBalance() {
        return outExtraitOutGrpDepositAccountBookBalance;
    }

    /**
     * Sets the value of the outExtraitOutGrpDepositAccountBookBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutExtraitOutGrpDepositAccountBookBalance(BigDecimal value) {
        this.outExtraitOutGrpDepositAccountBookBalance = value;
    }

    /**
     * Gets the value of the outExtraitOutFstDemandExtraitTransSerNum property.
     * 
     */
    public int getOutExtraitOutFstDemandExtraitTransSerNum() {
        return outExtraitOutFstDemandExtraitTransSerNum;
    }

    /**
     * Sets the value of the outExtraitOutFstDemandExtraitTransSerNum property.
     * 
     */
    public void setOutExtraitOutFstDemandExtraitTransSerNum(int value) {
        this.outExtraitOutFstDemandExtraitTransSerNum = value;
    }

    /**
     * Gets the value of the outExtraitOutFstDemandExtraitEntrySerNum property.
     * 
     */
    public short getOutExtraitOutFstDemandExtraitEntrySerNum() {
        return outExtraitOutFstDemandExtraitEntrySerNum;
    }

    /**
     * Sets the value of the outExtraitOutFstDemandExtraitEntrySerNum property.
     * 
     */
    public void setOutExtraitOutFstDemandExtraitEntrySerNum(short value) {
        this.outExtraitOutFstDemandExtraitEntrySerNum = value;
    }

    /**
     * Gets the value of the outExtraitOutFstDemandExtraitTunInternalSn property.
     * 
     */
    public short getOutExtraitOutFstDemandExtraitTunInternalSn() {
        return outExtraitOutFstDemandExtraitTunInternalSn;
    }

    /**
     * Sets the value of the outExtraitOutFstDemandExtraitTunInternalSn property.
     * 
     */
    public void setOutExtraitOutFstDemandExtraitTunInternalSn(short value) {
        this.outExtraitOutFstDemandExtraitTunInternalSn = value;
    }

}
