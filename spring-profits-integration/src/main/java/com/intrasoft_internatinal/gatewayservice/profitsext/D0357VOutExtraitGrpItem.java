
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for D0357VOutExtraitGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="D0357VOutExtraitGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutExtraitGrpOutExtraitGrmIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtraitGrpOutExtraitGrmJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtraitGrpOutExtraitGrmParticipBlnIefSuppliedYesno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtraitGrpOutExtraitGrmTimeDeposExtraitDebitCreditFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtraitGrpOutExtraitGrmTimeDeposExtraitEntryAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutExtraitGrpOutExtraitGrmTimeDeposExtraitEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtraitGrpOutExtraitGrmTimeDeposExtraitEntrySerNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutExtraitGrpOutExtraitGrmTimeDeposExtraitITrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutExtraitGrpOutExtraitGrmTimeDeposExtraitITrxSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutExtraitGrpOutExtraitGrmTimeDeposExtraitITrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutExtraitGrpOutExtraitGrmTimeDeposExtraitITrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtraitGrpOutExtraitGrmTimeDeposExtraitIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutExtraitGrpOutExtraitGrmTimeDeposExtraitIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutExtraitGrpOutExtraitGrmTimeDeposExtraitOCrInterRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutExtraitGrpOutExtraitGrmTimeDeposExtraitODrInterestRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutExtraitGrpOutExtraitGrmTimeDeposExtraitPCrInterestRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutExtraitGrpOutExtraitGrmTimeDeposExtraitParticipBalFlag" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutExtraitGrpOutExtraitGrmTimeDeposExtraitReverseFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtraitGrpOutExtraitGrmTimeDeposExtraitTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutExtraitGrpOutExtraitGrmTimeDeposExtraitTransSerNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutExtraitGrpOutExtraitGrmTimeDeposExtraitTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutExtraitGrpOutExtraitGrmTimeDeposExtraitTrxSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutExtraitGrpOutExtraitGrmTimeDeposExtraitTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutExtraitGrpOutExtraitGrmTimeDeposExtraitTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtraitGrpOutExtraitGrmTimeDeposExtraitValueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "D0357VOutExtraitGrpItem", propOrder = {
    "outExtraitGrpOutExtraitGrmIefSuppliedSelectChar",
    "outExtraitGrpOutExtraitGrmJustificDescription",
    "outExtraitGrpOutExtraitGrmParticipBlnIefSuppliedYesno",
    "outExtraitGrpOutExtraitGrmTimeDeposExtraitDebitCreditFlag",
    "outExtraitGrpOutExtraitGrmTimeDeposExtraitEntryAmount",
    "outExtraitGrpOutExtraitGrmTimeDeposExtraitEntryComments",
    "outExtraitGrpOutExtraitGrmTimeDeposExtraitEntrySerNum",
    "outExtraitGrpOutExtraitGrmTimeDeposExtraitITrxDate",
    "outExtraitGrpOutExtraitGrmTimeDeposExtraitITrxSn",
    "outExtraitGrpOutExtraitGrmTimeDeposExtraitITrxUnit",
    "outExtraitGrpOutExtraitGrmTimeDeposExtraitITrxUsr",
    "outExtraitGrpOutExtraitGrmTimeDeposExtraitIdJustific",
    "outExtraitGrpOutExtraitGrmTimeDeposExtraitIdTransact",
    "outExtraitGrpOutExtraitGrmTimeDeposExtraitOCrInterRate",
    "outExtraitGrpOutExtraitGrmTimeDeposExtraitODrInterestRate",
    "outExtraitGrpOutExtraitGrmTimeDeposExtraitPCrInterestRate",
    "outExtraitGrpOutExtraitGrmTimeDeposExtraitParticipBalFlag",
    "outExtraitGrpOutExtraitGrmTimeDeposExtraitReverseFlag",
    "outExtraitGrpOutExtraitGrmTimeDeposExtraitTimestamp",
    "outExtraitGrpOutExtraitGrmTimeDeposExtraitTransSerNum",
    "outExtraitGrpOutExtraitGrmTimeDeposExtraitTrxDate",
    "outExtraitGrpOutExtraitGrmTimeDeposExtraitTrxSn",
    "outExtraitGrpOutExtraitGrmTimeDeposExtraitTrxUnit",
    "outExtraitGrpOutExtraitGrmTimeDeposExtraitTrxUsr",
    "outExtraitGrpOutExtraitGrmTimeDeposExtraitValueDate"
})
public class D0357VOutExtraitGrpItem {

    @XmlElement(name = "OutExtraitGrpOutExtraitGrmIefSuppliedSelectChar")
    protected String outExtraitGrpOutExtraitGrmIefSuppliedSelectChar;
    @XmlElement(name = "OutExtraitGrpOutExtraitGrmJustificDescription")
    protected String outExtraitGrpOutExtraitGrmJustificDescription;
    @XmlElement(name = "OutExtraitGrpOutExtraitGrmParticipBlnIefSuppliedYesno")
    protected String outExtraitGrpOutExtraitGrmParticipBlnIefSuppliedYesno;
    @XmlElement(name = "OutExtraitGrpOutExtraitGrmTimeDeposExtraitDebitCreditFlag")
    protected String outExtraitGrpOutExtraitGrmTimeDeposExtraitDebitCreditFlag;
    @XmlElement(name = "OutExtraitGrpOutExtraitGrmTimeDeposExtraitEntryAmount", required = true)
    protected BigDecimal outExtraitGrpOutExtraitGrmTimeDeposExtraitEntryAmount;
    @XmlElement(name = "OutExtraitGrpOutExtraitGrmTimeDeposExtraitEntryComments")
    protected String outExtraitGrpOutExtraitGrmTimeDeposExtraitEntryComments;
    @XmlElement(name = "OutExtraitGrpOutExtraitGrmTimeDeposExtraitEntrySerNum")
    protected short outExtraitGrpOutExtraitGrmTimeDeposExtraitEntrySerNum;
    @XmlElement(name = "OutExtraitGrpOutExtraitGrmTimeDeposExtraitITrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outExtraitGrpOutExtraitGrmTimeDeposExtraitITrxDate;
    @XmlElement(name = "OutExtraitGrpOutExtraitGrmTimeDeposExtraitITrxSn")
    protected int outExtraitGrpOutExtraitGrmTimeDeposExtraitITrxSn;
    @XmlElement(name = "OutExtraitGrpOutExtraitGrmTimeDeposExtraitITrxUnit")
    protected int outExtraitGrpOutExtraitGrmTimeDeposExtraitITrxUnit;
    @XmlElement(name = "OutExtraitGrpOutExtraitGrmTimeDeposExtraitITrxUsr")
    protected String outExtraitGrpOutExtraitGrmTimeDeposExtraitITrxUsr;
    @XmlElement(name = "OutExtraitGrpOutExtraitGrmTimeDeposExtraitIdJustific")
    protected int outExtraitGrpOutExtraitGrmTimeDeposExtraitIdJustific;
    @XmlElement(name = "OutExtraitGrpOutExtraitGrmTimeDeposExtraitIdTransact")
    protected int outExtraitGrpOutExtraitGrmTimeDeposExtraitIdTransact;
    @XmlElement(name = "OutExtraitGrpOutExtraitGrmTimeDeposExtraitOCrInterRate", required = true)
    protected BigDecimal outExtraitGrpOutExtraitGrmTimeDeposExtraitOCrInterRate;
    @XmlElement(name = "OutExtraitGrpOutExtraitGrmTimeDeposExtraitODrInterestRate", required = true)
    protected BigDecimal outExtraitGrpOutExtraitGrmTimeDeposExtraitODrInterestRate;
    @XmlElement(name = "OutExtraitGrpOutExtraitGrmTimeDeposExtraitPCrInterestRate", required = true)
    protected BigDecimal outExtraitGrpOutExtraitGrmTimeDeposExtraitPCrInterestRate;
    @XmlElement(name = "OutExtraitGrpOutExtraitGrmTimeDeposExtraitParticipBalFlag")
    protected short outExtraitGrpOutExtraitGrmTimeDeposExtraitParticipBalFlag;
    @XmlElement(name = "OutExtraitGrpOutExtraitGrmTimeDeposExtraitReverseFlag")
    protected String outExtraitGrpOutExtraitGrmTimeDeposExtraitReverseFlag;
    @XmlElement(name = "OutExtraitGrpOutExtraitGrmTimeDeposExtraitTimestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outExtraitGrpOutExtraitGrmTimeDeposExtraitTimestamp;
    @XmlElement(name = "OutExtraitGrpOutExtraitGrmTimeDeposExtraitTransSerNum")
    protected int outExtraitGrpOutExtraitGrmTimeDeposExtraitTransSerNum;
    @XmlElement(name = "OutExtraitGrpOutExtraitGrmTimeDeposExtraitTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outExtraitGrpOutExtraitGrmTimeDeposExtraitTrxDate;
    @XmlElement(name = "OutExtraitGrpOutExtraitGrmTimeDeposExtraitTrxSn")
    protected int outExtraitGrpOutExtraitGrmTimeDeposExtraitTrxSn;
    @XmlElement(name = "OutExtraitGrpOutExtraitGrmTimeDeposExtraitTrxUnit")
    protected int outExtraitGrpOutExtraitGrmTimeDeposExtraitTrxUnit;
    @XmlElement(name = "OutExtraitGrpOutExtraitGrmTimeDeposExtraitTrxUsr")
    protected String outExtraitGrpOutExtraitGrmTimeDeposExtraitTrxUsr;
    @XmlElement(name = "OutExtraitGrpOutExtraitGrmTimeDeposExtraitValueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outExtraitGrpOutExtraitGrmTimeDeposExtraitValueDate;

    /**
     * Gets the value of the outExtraitGrpOutExtraitGrmIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtraitGrpOutExtraitGrmIefSuppliedSelectChar() {
        return outExtraitGrpOutExtraitGrmIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outExtraitGrpOutExtraitGrmIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtraitGrpOutExtraitGrmIefSuppliedSelectChar(String value) {
        this.outExtraitGrpOutExtraitGrmIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outExtraitGrpOutExtraitGrmJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtraitGrpOutExtraitGrmJustificDescription() {
        return outExtraitGrpOutExtraitGrmJustificDescription;
    }

    /**
     * Sets the value of the outExtraitGrpOutExtraitGrmJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtraitGrpOutExtraitGrmJustificDescription(String value) {
        this.outExtraitGrpOutExtraitGrmJustificDescription = value;
    }

    /**
     * Gets the value of the outExtraitGrpOutExtraitGrmParticipBlnIefSuppliedYesno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtraitGrpOutExtraitGrmParticipBlnIefSuppliedYesno() {
        return outExtraitGrpOutExtraitGrmParticipBlnIefSuppliedYesno;
    }

    /**
     * Sets the value of the outExtraitGrpOutExtraitGrmParticipBlnIefSuppliedYesno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtraitGrpOutExtraitGrmParticipBlnIefSuppliedYesno(String value) {
        this.outExtraitGrpOutExtraitGrmParticipBlnIefSuppliedYesno = value;
    }

    /**
     * Gets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitDebitCreditFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtraitGrpOutExtraitGrmTimeDeposExtraitDebitCreditFlag() {
        return outExtraitGrpOutExtraitGrmTimeDeposExtraitDebitCreditFlag;
    }

    /**
     * Sets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitDebitCreditFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtraitGrpOutExtraitGrmTimeDeposExtraitDebitCreditFlag(String value) {
        this.outExtraitGrpOutExtraitGrmTimeDeposExtraitDebitCreditFlag = value;
    }

    /**
     * Gets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitEntryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutExtraitGrpOutExtraitGrmTimeDeposExtraitEntryAmount() {
        return outExtraitGrpOutExtraitGrmTimeDeposExtraitEntryAmount;
    }

    /**
     * Sets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitEntryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutExtraitGrpOutExtraitGrmTimeDeposExtraitEntryAmount(BigDecimal value) {
        this.outExtraitGrpOutExtraitGrmTimeDeposExtraitEntryAmount = value;
    }

    /**
     * Gets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitEntryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtraitGrpOutExtraitGrmTimeDeposExtraitEntryComments() {
        return outExtraitGrpOutExtraitGrmTimeDeposExtraitEntryComments;
    }

    /**
     * Sets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitEntryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtraitGrpOutExtraitGrmTimeDeposExtraitEntryComments(String value) {
        this.outExtraitGrpOutExtraitGrmTimeDeposExtraitEntryComments = value;
    }

    /**
     * Gets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitEntrySerNum property.
     * 
     */
    public short getOutExtraitGrpOutExtraitGrmTimeDeposExtraitEntrySerNum() {
        return outExtraitGrpOutExtraitGrmTimeDeposExtraitEntrySerNum;
    }

    /**
     * Sets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitEntrySerNum property.
     * 
     */
    public void setOutExtraitGrpOutExtraitGrmTimeDeposExtraitEntrySerNum(short value) {
        this.outExtraitGrpOutExtraitGrmTimeDeposExtraitEntrySerNum = value;
    }

    /**
     * Gets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitITrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutExtraitGrpOutExtraitGrmTimeDeposExtraitITrxDate() {
        return outExtraitGrpOutExtraitGrmTimeDeposExtraitITrxDate;
    }

    /**
     * Sets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitITrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutExtraitGrpOutExtraitGrmTimeDeposExtraitITrxDate(XMLGregorianCalendar value) {
        this.outExtraitGrpOutExtraitGrmTimeDeposExtraitITrxDate = value;
    }

    /**
     * Gets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitITrxSn property.
     * 
     */
    public int getOutExtraitGrpOutExtraitGrmTimeDeposExtraitITrxSn() {
        return outExtraitGrpOutExtraitGrmTimeDeposExtraitITrxSn;
    }

    /**
     * Sets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitITrxSn property.
     * 
     */
    public void setOutExtraitGrpOutExtraitGrmTimeDeposExtraitITrxSn(int value) {
        this.outExtraitGrpOutExtraitGrmTimeDeposExtraitITrxSn = value;
    }

    /**
     * Gets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitITrxUnit property.
     * 
     */
    public int getOutExtraitGrpOutExtraitGrmTimeDeposExtraitITrxUnit() {
        return outExtraitGrpOutExtraitGrmTimeDeposExtraitITrxUnit;
    }

    /**
     * Sets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitITrxUnit property.
     * 
     */
    public void setOutExtraitGrpOutExtraitGrmTimeDeposExtraitITrxUnit(int value) {
        this.outExtraitGrpOutExtraitGrmTimeDeposExtraitITrxUnit = value;
    }

    /**
     * Gets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitITrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtraitGrpOutExtraitGrmTimeDeposExtraitITrxUsr() {
        return outExtraitGrpOutExtraitGrmTimeDeposExtraitITrxUsr;
    }

    /**
     * Sets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitITrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtraitGrpOutExtraitGrmTimeDeposExtraitITrxUsr(String value) {
        this.outExtraitGrpOutExtraitGrmTimeDeposExtraitITrxUsr = value;
    }

    /**
     * Gets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitIdJustific property.
     * 
     */
    public int getOutExtraitGrpOutExtraitGrmTimeDeposExtraitIdJustific() {
        return outExtraitGrpOutExtraitGrmTimeDeposExtraitIdJustific;
    }

    /**
     * Sets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitIdJustific property.
     * 
     */
    public void setOutExtraitGrpOutExtraitGrmTimeDeposExtraitIdJustific(int value) {
        this.outExtraitGrpOutExtraitGrmTimeDeposExtraitIdJustific = value;
    }

    /**
     * Gets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitIdTransact property.
     * 
     */
    public int getOutExtraitGrpOutExtraitGrmTimeDeposExtraitIdTransact() {
        return outExtraitGrpOutExtraitGrmTimeDeposExtraitIdTransact;
    }

    /**
     * Sets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitIdTransact property.
     * 
     */
    public void setOutExtraitGrpOutExtraitGrmTimeDeposExtraitIdTransact(int value) {
        this.outExtraitGrpOutExtraitGrmTimeDeposExtraitIdTransact = value;
    }

    /**
     * Gets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitOCrInterRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutExtraitGrpOutExtraitGrmTimeDeposExtraitOCrInterRate() {
        return outExtraitGrpOutExtraitGrmTimeDeposExtraitOCrInterRate;
    }

    /**
     * Sets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitOCrInterRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutExtraitGrpOutExtraitGrmTimeDeposExtraitOCrInterRate(BigDecimal value) {
        this.outExtraitGrpOutExtraitGrmTimeDeposExtraitOCrInterRate = value;
    }

    /**
     * Gets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitODrInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutExtraitGrpOutExtraitGrmTimeDeposExtraitODrInterestRate() {
        return outExtraitGrpOutExtraitGrmTimeDeposExtraitODrInterestRate;
    }

    /**
     * Sets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitODrInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutExtraitGrpOutExtraitGrmTimeDeposExtraitODrInterestRate(BigDecimal value) {
        this.outExtraitGrpOutExtraitGrmTimeDeposExtraitODrInterestRate = value;
    }

    /**
     * Gets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitPCrInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutExtraitGrpOutExtraitGrmTimeDeposExtraitPCrInterestRate() {
        return outExtraitGrpOutExtraitGrmTimeDeposExtraitPCrInterestRate;
    }

    /**
     * Sets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitPCrInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutExtraitGrpOutExtraitGrmTimeDeposExtraitPCrInterestRate(BigDecimal value) {
        this.outExtraitGrpOutExtraitGrmTimeDeposExtraitPCrInterestRate = value;
    }

    /**
     * Gets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitParticipBalFlag property.
     * 
     */
    public short getOutExtraitGrpOutExtraitGrmTimeDeposExtraitParticipBalFlag() {
        return outExtraitGrpOutExtraitGrmTimeDeposExtraitParticipBalFlag;
    }

    /**
     * Sets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitParticipBalFlag property.
     * 
     */
    public void setOutExtraitGrpOutExtraitGrmTimeDeposExtraitParticipBalFlag(short value) {
        this.outExtraitGrpOutExtraitGrmTimeDeposExtraitParticipBalFlag = value;
    }

    /**
     * Gets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitReverseFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtraitGrpOutExtraitGrmTimeDeposExtraitReverseFlag() {
        return outExtraitGrpOutExtraitGrmTimeDeposExtraitReverseFlag;
    }

    /**
     * Sets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitReverseFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtraitGrpOutExtraitGrmTimeDeposExtraitReverseFlag(String value) {
        this.outExtraitGrpOutExtraitGrmTimeDeposExtraitReverseFlag = value;
    }

    /**
     * Gets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutExtraitGrpOutExtraitGrmTimeDeposExtraitTimestamp() {
        return outExtraitGrpOutExtraitGrmTimeDeposExtraitTimestamp;
    }

    /**
     * Sets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutExtraitGrpOutExtraitGrmTimeDeposExtraitTimestamp(XMLGregorianCalendar value) {
        this.outExtraitGrpOutExtraitGrmTimeDeposExtraitTimestamp = value;
    }

    /**
     * Gets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitTransSerNum property.
     * 
     */
    public int getOutExtraitGrpOutExtraitGrmTimeDeposExtraitTransSerNum() {
        return outExtraitGrpOutExtraitGrmTimeDeposExtraitTransSerNum;
    }

    /**
     * Sets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitTransSerNum property.
     * 
     */
    public void setOutExtraitGrpOutExtraitGrmTimeDeposExtraitTransSerNum(int value) {
        this.outExtraitGrpOutExtraitGrmTimeDeposExtraitTransSerNum = value;
    }

    /**
     * Gets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutExtraitGrpOutExtraitGrmTimeDeposExtraitTrxDate() {
        return outExtraitGrpOutExtraitGrmTimeDeposExtraitTrxDate;
    }

    /**
     * Sets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutExtraitGrpOutExtraitGrmTimeDeposExtraitTrxDate(XMLGregorianCalendar value) {
        this.outExtraitGrpOutExtraitGrmTimeDeposExtraitTrxDate = value;
    }

    /**
     * Gets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitTrxSn property.
     * 
     */
    public int getOutExtraitGrpOutExtraitGrmTimeDeposExtraitTrxSn() {
        return outExtraitGrpOutExtraitGrmTimeDeposExtraitTrxSn;
    }

    /**
     * Sets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitTrxSn property.
     * 
     */
    public void setOutExtraitGrpOutExtraitGrmTimeDeposExtraitTrxSn(int value) {
        this.outExtraitGrpOutExtraitGrmTimeDeposExtraitTrxSn = value;
    }

    /**
     * Gets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitTrxUnit property.
     * 
     */
    public int getOutExtraitGrpOutExtraitGrmTimeDeposExtraitTrxUnit() {
        return outExtraitGrpOutExtraitGrmTimeDeposExtraitTrxUnit;
    }

    /**
     * Sets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitTrxUnit property.
     * 
     */
    public void setOutExtraitGrpOutExtraitGrmTimeDeposExtraitTrxUnit(int value) {
        this.outExtraitGrpOutExtraitGrmTimeDeposExtraitTrxUnit = value;
    }

    /**
     * Gets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtraitGrpOutExtraitGrmTimeDeposExtraitTrxUsr() {
        return outExtraitGrpOutExtraitGrmTimeDeposExtraitTrxUsr;
    }

    /**
     * Sets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtraitGrpOutExtraitGrmTimeDeposExtraitTrxUsr(String value) {
        this.outExtraitGrpOutExtraitGrmTimeDeposExtraitTrxUsr = value;
    }

    /**
     * Gets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutExtraitGrpOutExtraitGrmTimeDeposExtraitValueDate() {
        return outExtraitGrpOutExtraitGrmTimeDeposExtraitValueDate;
    }

    /**
     * Sets the value of the outExtraitGrpOutExtraitGrmTimeDeposExtraitValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutExtraitGrpOutExtraitGrmTimeDeposExtraitValueDate(XMLGregorianCalendar value) {
        this.outExtraitGrpOutExtraitGrmTimeDeposExtraitValueDate = value;
    }

}
