
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for T2190VOutGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T2190VOutGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpOutGrmIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmIssStatementCrAccntAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmIssStatementCrInsurAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmIssStatementDbAccntAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmIssStatementDbInsurAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmIssStatementIComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmIssStatementIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmIssStatementIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmIssStatementIssTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmIssStatementIssTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmIssStatementIssTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmIssStatementIssTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmIssStatementOtherTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmIssStatementOtherTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmIssStatementOtherTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmIssStatementOtherTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmIssStatementProgressiveBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmIssStatementTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T2190VOutGrpItem", propOrder = {
    "outGrpOutGrmIefSuppliedSelectChar",
    "outGrpOutGrmIssStatementCrAccntAmnt",
    "outGrpOutGrmIssStatementCrInsurAmnt",
    "outGrpOutGrmIssStatementDbAccntAmnt",
    "outGrpOutGrmIssStatementDbInsurAmnt",
    "outGrpOutGrmIssStatementIComments",
    "outGrpOutGrmIssStatementIdJustific",
    "outGrpOutGrmIssStatementIdTransact",
    "outGrpOutGrmIssStatementIssTrxDate",
    "outGrpOutGrmIssStatementIssTrxUnit",
    "outGrpOutGrmIssStatementIssTrxUsr",
    "outGrpOutGrmIssStatementIssTrxUsrSn",
    "outGrpOutGrmIssStatementOtherTrxDate",
    "outGrpOutGrmIssStatementOtherTrxUnit",
    "outGrpOutGrmIssStatementOtherTrxUsr",
    "outGrpOutGrmIssStatementOtherTrxUsrSn",
    "outGrpOutGrmIssStatementProgressiveBalance",
    "outGrpOutGrmIssStatementTmstamp"
})
public class T2190VOutGrpItem {

    @XmlElement(name = "OutGrpOutGrmIefSuppliedSelectChar")
    protected String outGrpOutGrmIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpOutGrmIssStatementCrAccntAmnt", required = true)
    protected BigDecimal outGrpOutGrmIssStatementCrAccntAmnt;
    @XmlElement(name = "OutGrpOutGrmIssStatementCrInsurAmnt", required = true)
    protected BigDecimal outGrpOutGrmIssStatementCrInsurAmnt;
    @XmlElement(name = "OutGrpOutGrmIssStatementDbAccntAmnt", required = true)
    protected BigDecimal outGrpOutGrmIssStatementDbAccntAmnt;
    @XmlElement(name = "OutGrpOutGrmIssStatementDbInsurAmnt", required = true)
    protected BigDecimal outGrpOutGrmIssStatementDbInsurAmnt;
    @XmlElement(name = "OutGrpOutGrmIssStatementIComments")
    protected String outGrpOutGrmIssStatementIComments;
    @XmlElement(name = "OutGrpOutGrmIssStatementIdJustific")
    protected int outGrpOutGrmIssStatementIdJustific;
    @XmlElement(name = "OutGrpOutGrmIssStatementIdTransact")
    protected int outGrpOutGrmIssStatementIdTransact;
    @XmlElement(name = "OutGrpOutGrmIssStatementIssTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmIssStatementIssTrxDate;
    @XmlElement(name = "OutGrpOutGrmIssStatementIssTrxUnit")
    protected int outGrpOutGrmIssStatementIssTrxUnit;
    @XmlElement(name = "OutGrpOutGrmIssStatementIssTrxUsr")
    protected String outGrpOutGrmIssStatementIssTrxUsr;
    @XmlElement(name = "OutGrpOutGrmIssStatementIssTrxUsrSn")
    protected int outGrpOutGrmIssStatementIssTrxUsrSn;
    @XmlElement(name = "OutGrpOutGrmIssStatementOtherTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmIssStatementOtherTrxDate;
    @XmlElement(name = "OutGrpOutGrmIssStatementOtherTrxUnit")
    protected int outGrpOutGrmIssStatementOtherTrxUnit;
    @XmlElement(name = "OutGrpOutGrmIssStatementOtherTrxUsr")
    protected String outGrpOutGrmIssStatementOtherTrxUsr;
    @XmlElement(name = "OutGrpOutGrmIssStatementOtherTrxUsrSn")
    protected int outGrpOutGrmIssStatementOtherTrxUsrSn;
    @XmlElement(name = "OutGrpOutGrmIssStatementProgressiveBalance", required = true)
    protected BigDecimal outGrpOutGrmIssStatementProgressiveBalance;
    @XmlElement(name = "OutGrpOutGrmIssStatementTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmIssStatementTmstamp;

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
     * Gets the value of the outGrpOutGrmIssStatementCrAccntAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmIssStatementCrAccntAmnt() {
        return outGrpOutGrmIssStatementCrAccntAmnt;
    }

    /**
     * Sets the value of the outGrpOutGrmIssStatementCrAccntAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmIssStatementCrAccntAmnt(BigDecimal value) {
        this.outGrpOutGrmIssStatementCrAccntAmnt = value;
    }

    /**
     * Gets the value of the outGrpOutGrmIssStatementCrInsurAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmIssStatementCrInsurAmnt() {
        return outGrpOutGrmIssStatementCrInsurAmnt;
    }

    /**
     * Sets the value of the outGrpOutGrmIssStatementCrInsurAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmIssStatementCrInsurAmnt(BigDecimal value) {
        this.outGrpOutGrmIssStatementCrInsurAmnt = value;
    }

    /**
     * Gets the value of the outGrpOutGrmIssStatementDbAccntAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmIssStatementDbAccntAmnt() {
        return outGrpOutGrmIssStatementDbAccntAmnt;
    }

    /**
     * Sets the value of the outGrpOutGrmIssStatementDbAccntAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmIssStatementDbAccntAmnt(BigDecimal value) {
        this.outGrpOutGrmIssStatementDbAccntAmnt = value;
    }

    /**
     * Gets the value of the outGrpOutGrmIssStatementDbInsurAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmIssStatementDbInsurAmnt() {
        return outGrpOutGrmIssStatementDbInsurAmnt;
    }

    /**
     * Sets the value of the outGrpOutGrmIssStatementDbInsurAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmIssStatementDbInsurAmnt(BigDecimal value) {
        this.outGrpOutGrmIssStatementDbInsurAmnt = value;
    }

    /**
     * Gets the value of the outGrpOutGrmIssStatementIComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmIssStatementIComments() {
        return outGrpOutGrmIssStatementIComments;
    }

    /**
     * Sets the value of the outGrpOutGrmIssStatementIComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmIssStatementIComments(String value) {
        this.outGrpOutGrmIssStatementIComments = value;
    }

    /**
     * Gets the value of the outGrpOutGrmIssStatementIdJustific property.
     * 
     */
    public int getOutGrpOutGrmIssStatementIdJustific() {
        return outGrpOutGrmIssStatementIdJustific;
    }

    /**
     * Sets the value of the outGrpOutGrmIssStatementIdJustific property.
     * 
     */
    public void setOutGrpOutGrmIssStatementIdJustific(int value) {
        this.outGrpOutGrmIssStatementIdJustific = value;
    }

    /**
     * Gets the value of the outGrpOutGrmIssStatementIdTransact property.
     * 
     */
    public int getOutGrpOutGrmIssStatementIdTransact() {
        return outGrpOutGrmIssStatementIdTransact;
    }

    /**
     * Sets the value of the outGrpOutGrmIssStatementIdTransact property.
     * 
     */
    public void setOutGrpOutGrmIssStatementIdTransact(int value) {
        this.outGrpOutGrmIssStatementIdTransact = value;
    }

    /**
     * Gets the value of the outGrpOutGrmIssStatementIssTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmIssStatementIssTrxDate() {
        return outGrpOutGrmIssStatementIssTrxDate;
    }

    /**
     * Sets the value of the outGrpOutGrmIssStatementIssTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmIssStatementIssTrxDate(XMLGregorianCalendar value) {
        this.outGrpOutGrmIssStatementIssTrxDate = value;
    }

    /**
     * Gets the value of the outGrpOutGrmIssStatementIssTrxUnit property.
     * 
     */
    public int getOutGrpOutGrmIssStatementIssTrxUnit() {
        return outGrpOutGrmIssStatementIssTrxUnit;
    }

    /**
     * Sets the value of the outGrpOutGrmIssStatementIssTrxUnit property.
     * 
     */
    public void setOutGrpOutGrmIssStatementIssTrxUnit(int value) {
        this.outGrpOutGrmIssStatementIssTrxUnit = value;
    }

    /**
     * Gets the value of the outGrpOutGrmIssStatementIssTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmIssStatementIssTrxUsr() {
        return outGrpOutGrmIssStatementIssTrxUsr;
    }

    /**
     * Sets the value of the outGrpOutGrmIssStatementIssTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmIssStatementIssTrxUsr(String value) {
        this.outGrpOutGrmIssStatementIssTrxUsr = value;
    }

    /**
     * Gets the value of the outGrpOutGrmIssStatementIssTrxUsrSn property.
     * 
     */
    public int getOutGrpOutGrmIssStatementIssTrxUsrSn() {
        return outGrpOutGrmIssStatementIssTrxUsrSn;
    }

    /**
     * Sets the value of the outGrpOutGrmIssStatementIssTrxUsrSn property.
     * 
     */
    public void setOutGrpOutGrmIssStatementIssTrxUsrSn(int value) {
        this.outGrpOutGrmIssStatementIssTrxUsrSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmIssStatementOtherTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmIssStatementOtherTrxDate() {
        return outGrpOutGrmIssStatementOtherTrxDate;
    }

    /**
     * Sets the value of the outGrpOutGrmIssStatementOtherTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmIssStatementOtherTrxDate(XMLGregorianCalendar value) {
        this.outGrpOutGrmIssStatementOtherTrxDate = value;
    }

    /**
     * Gets the value of the outGrpOutGrmIssStatementOtherTrxUnit property.
     * 
     */
    public int getOutGrpOutGrmIssStatementOtherTrxUnit() {
        return outGrpOutGrmIssStatementOtherTrxUnit;
    }

    /**
     * Sets the value of the outGrpOutGrmIssStatementOtherTrxUnit property.
     * 
     */
    public void setOutGrpOutGrmIssStatementOtherTrxUnit(int value) {
        this.outGrpOutGrmIssStatementOtherTrxUnit = value;
    }

    /**
     * Gets the value of the outGrpOutGrmIssStatementOtherTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmIssStatementOtherTrxUsr() {
        return outGrpOutGrmIssStatementOtherTrxUsr;
    }

    /**
     * Sets the value of the outGrpOutGrmIssStatementOtherTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmIssStatementOtherTrxUsr(String value) {
        this.outGrpOutGrmIssStatementOtherTrxUsr = value;
    }

    /**
     * Gets the value of the outGrpOutGrmIssStatementOtherTrxUsrSn property.
     * 
     */
    public int getOutGrpOutGrmIssStatementOtherTrxUsrSn() {
        return outGrpOutGrmIssStatementOtherTrxUsrSn;
    }

    /**
     * Sets the value of the outGrpOutGrmIssStatementOtherTrxUsrSn property.
     * 
     */
    public void setOutGrpOutGrmIssStatementOtherTrxUsrSn(int value) {
        this.outGrpOutGrmIssStatementOtherTrxUsrSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmIssStatementProgressiveBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmIssStatementProgressiveBalance() {
        return outGrpOutGrmIssStatementProgressiveBalance;
    }

    /**
     * Sets the value of the outGrpOutGrmIssStatementProgressiveBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmIssStatementProgressiveBalance(BigDecimal value) {
        this.outGrpOutGrmIssStatementProgressiveBalance = value;
    }

    /**
     * Gets the value of the outGrpOutGrmIssStatementTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmIssStatementTmstamp() {
        return outGrpOutGrmIssStatementTmstamp;
    }

    /**
     * Sets the value of the outGrpOutGrmIssStatementTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmIssStatementTmstamp(XMLGregorianCalendar value) {
        this.outGrpOutGrmIssStatementTmstamp = value;
    }

}
