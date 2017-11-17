
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for L0497VOutGrpUserTotalItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0497VOutGrpUserTotalItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpUserTotalOutGrmCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpUserTotalOutGrmCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUserTotalOutGrmIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUserTotalOutGrmUserTotalCashCrDocNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpUserTotalOutGrmUserTotalCashCrTotAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpUserTotalOutGrmUserTotalCashDbDocNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpUserTotalOutGrmUserTotalCashDbTotAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpUserTotalOutGrmUserTotalJournalCrDocNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpUserTotalOutGrmUserTotalJournalCrTotAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpUserTotalOutGrmUserTotalJournalDbDocNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpUserTotalOutGrmUserTotalJournalDbTotAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpUserTotalOutGrmUserTotalMemoCrDocNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpUserTotalOutGrmUserTotalMemoCrTotAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpUserTotalOutGrmUserTotalMemoDbDocNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpUserTotalOutGrmUserTotalMemoDbTotAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpUserTotalOutGrmUserTotalRevcashCrDocNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpUserTotalOutGrmUserTotalRevcashCrTotAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpUserTotalOutGrmUserTotalRevcashDbDocNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpUserTotalOutGrmUserTotalRevcashDbTotAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0497VOutGrpUserTotalItem", propOrder = {
    "outGrpUserTotalOutGrmCurrencyIdCurrency",
    "outGrpUserTotalOutGrmCurrencyShortDescr",
    "outGrpUserTotalOutGrmIefSuppliedSelectChar",
    "outGrpUserTotalOutGrmUserTotalCashCrDocNum",
    "outGrpUserTotalOutGrmUserTotalCashCrTotAmnt",
    "outGrpUserTotalOutGrmUserTotalCashDbDocNum",
    "outGrpUserTotalOutGrmUserTotalCashDbTotAmnt",
    "outGrpUserTotalOutGrmUserTotalJournalCrDocNum",
    "outGrpUserTotalOutGrmUserTotalJournalCrTotAmn",
    "outGrpUserTotalOutGrmUserTotalJournalDbDocNum",
    "outGrpUserTotalOutGrmUserTotalJournalDbTotAmn",
    "outGrpUserTotalOutGrmUserTotalMemoCrDocNum",
    "outGrpUserTotalOutGrmUserTotalMemoCrTotAmnt",
    "outGrpUserTotalOutGrmUserTotalMemoDbDocNum",
    "outGrpUserTotalOutGrmUserTotalMemoDbTotAmnt",
    "outGrpUserTotalOutGrmUserTotalRevcashCrDocNum",
    "outGrpUserTotalOutGrmUserTotalRevcashCrTotAmn",
    "outGrpUserTotalOutGrmUserTotalRevcashDbDocNum",
    "outGrpUserTotalOutGrmUserTotalRevcashDbTotAmn"
})
public class L0497VOutGrpUserTotalItem {

    @XmlElement(name = "OutGrpUserTotalOutGrmCurrencyIdCurrency")
    protected int outGrpUserTotalOutGrmCurrencyIdCurrency;
    @XmlElement(name = "OutGrpUserTotalOutGrmCurrencyShortDescr")
    protected String outGrpUserTotalOutGrmCurrencyShortDescr;
    @XmlElement(name = "OutGrpUserTotalOutGrmIefSuppliedSelectChar")
    protected String outGrpUserTotalOutGrmIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpUserTotalOutGrmUserTotalCashCrDocNum")
    protected short outGrpUserTotalOutGrmUserTotalCashCrDocNum;
    @XmlElement(name = "OutGrpUserTotalOutGrmUserTotalCashCrTotAmnt", required = true)
    protected BigDecimal outGrpUserTotalOutGrmUserTotalCashCrTotAmnt;
    @XmlElement(name = "OutGrpUserTotalOutGrmUserTotalCashDbDocNum")
    protected short outGrpUserTotalOutGrmUserTotalCashDbDocNum;
    @XmlElement(name = "OutGrpUserTotalOutGrmUserTotalCashDbTotAmnt", required = true)
    protected BigDecimal outGrpUserTotalOutGrmUserTotalCashDbTotAmnt;
    @XmlElement(name = "OutGrpUserTotalOutGrmUserTotalJournalCrDocNum")
    protected short outGrpUserTotalOutGrmUserTotalJournalCrDocNum;
    @XmlElement(name = "OutGrpUserTotalOutGrmUserTotalJournalCrTotAmn", required = true)
    protected BigDecimal outGrpUserTotalOutGrmUserTotalJournalCrTotAmn;
    @XmlElement(name = "OutGrpUserTotalOutGrmUserTotalJournalDbDocNum")
    protected short outGrpUserTotalOutGrmUserTotalJournalDbDocNum;
    @XmlElement(name = "OutGrpUserTotalOutGrmUserTotalJournalDbTotAmn", required = true)
    protected BigDecimal outGrpUserTotalOutGrmUserTotalJournalDbTotAmn;
    @XmlElement(name = "OutGrpUserTotalOutGrmUserTotalMemoCrDocNum")
    protected short outGrpUserTotalOutGrmUserTotalMemoCrDocNum;
    @XmlElement(name = "OutGrpUserTotalOutGrmUserTotalMemoCrTotAmnt", required = true)
    protected BigDecimal outGrpUserTotalOutGrmUserTotalMemoCrTotAmnt;
    @XmlElement(name = "OutGrpUserTotalOutGrmUserTotalMemoDbDocNum")
    protected short outGrpUserTotalOutGrmUserTotalMemoDbDocNum;
    @XmlElement(name = "OutGrpUserTotalOutGrmUserTotalMemoDbTotAmnt", required = true)
    protected BigDecimal outGrpUserTotalOutGrmUserTotalMemoDbTotAmnt;
    @XmlElement(name = "OutGrpUserTotalOutGrmUserTotalRevcashCrDocNum")
    protected short outGrpUserTotalOutGrmUserTotalRevcashCrDocNum;
    @XmlElement(name = "OutGrpUserTotalOutGrmUserTotalRevcashCrTotAmn", required = true)
    protected BigDecimal outGrpUserTotalOutGrmUserTotalRevcashCrTotAmn;
    @XmlElement(name = "OutGrpUserTotalOutGrmUserTotalRevcashDbDocNum")
    protected short outGrpUserTotalOutGrmUserTotalRevcashDbDocNum;
    @XmlElement(name = "OutGrpUserTotalOutGrmUserTotalRevcashDbTotAmn", required = true)
    protected BigDecimal outGrpUserTotalOutGrmUserTotalRevcashDbTotAmn;

    /**
     * Gets the value of the outGrpUserTotalOutGrmCurrencyIdCurrency property.
     * 
     */
    public int getOutGrpUserTotalOutGrmCurrencyIdCurrency() {
        return outGrpUserTotalOutGrmCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outGrpUserTotalOutGrmCurrencyIdCurrency property.
     * 
     */
    public void setOutGrpUserTotalOutGrmCurrencyIdCurrency(int value) {
        this.outGrpUserTotalOutGrmCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outGrpUserTotalOutGrmCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUserTotalOutGrmCurrencyShortDescr() {
        return outGrpUserTotalOutGrmCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpUserTotalOutGrmCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUserTotalOutGrmCurrencyShortDescr(String value) {
        this.outGrpUserTotalOutGrmCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGrpUserTotalOutGrmIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUserTotalOutGrmIefSuppliedSelectChar() {
        return outGrpUserTotalOutGrmIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpUserTotalOutGrmIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUserTotalOutGrmIefSuppliedSelectChar(String value) {
        this.outGrpUserTotalOutGrmIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpUserTotalOutGrmUserTotalCashCrDocNum property.
     * 
     */
    public short getOutGrpUserTotalOutGrmUserTotalCashCrDocNum() {
        return outGrpUserTotalOutGrmUserTotalCashCrDocNum;
    }

    /**
     * Sets the value of the outGrpUserTotalOutGrmUserTotalCashCrDocNum property.
     * 
     */
    public void setOutGrpUserTotalOutGrmUserTotalCashCrDocNum(short value) {
        this.outGrpUserTotalOutGrmUserTotalCashCrDocNum = value;
    }

    /**
     * Gets the value of the outGrpUserTotalOutGrmUserTotalCashCrTotAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpUserTotalOutGrmUserTotalCashCrTotAmnt() {
        return outGrpUserTotalOutGrmUserTotalCashCrTotAmnt;
    }

    /**
     * Sets the value of the outGrpUserTotalOutGrmUserTotalCashCrTotAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpUserTotalOutGrmUserTotalCashCrTotAmnt(BigDecimal value) {
        this.outGrpUserTotalOutGrmUserTotalCashCrTotAmnt = value;
    }

    /**
     * Gets the value of the outGrpUserTotalOutGrmUserTotalCashDbDocNum property.
     * 
     */
    public short getOutGrpUserTotalOutGrmUserTotalCashDbDocNum() {
        return outGrpUserTotalOutGrmUserTotalCashDbDocNum;
    }

    /**
     * Sets the value of the outGrpUserTotalOutGrmUserTotalCashDbDocNum property.
     * 
     */
    public void setOutGrpUserTotalOutGrmUserTotalCashDbDocNum(short value) {
        this.outGrpUserTotalOutGrmUserTotalCashDbDocNum = value;
    }

    /**
     * Gets the value of the outGrpUserTotalOutGrmUserTotalCashDbTotAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpUserTotalOutGrmUserTotalCashDbTotAmnt() {
        return outGrpUserTotalOutGrmUserTotalCashDbTotAmnt;
    }

    /**
     * Sets the value of the outGrpUserTotalOutGrmUserTotalCashDbTotAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpUserTotalOutGrmUserTotalCashDbTotAmnt(BigDecimal value) {
        this.outGrpUserTotalOutGrmUserTotalCashDbTotAmnt = value;
    }

    /**
     * Gets the value of the outGrpUserTotalOutGrmUserTotalJournalCrDocNum property.
     * 
     */
    public short getOutGrpUserTotalOutGrmUserTotalJournalCrDocNum() {
        return outGrpUserTotalOutGrmUserTotalJournalCrDocNum;
    }

    /**
     * Sets the value of the outGrpUserTotalOutGrmUserTotalJournalCrDocNum property.
     * 
     */
    public void setOutGrpUserTotalOutGrmUserTotalJournalCrDocNum(short value) {
        this.outGrpUserTotalOutGrmUserTotalJournalCrDocNum = value;
    }

    /**
     * Gets the value of the outGrpUserTotalOutGrmUserTotalJournalCrTotAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpUserTotalOutGrmUserTotalJournalCrTotAmn() {
        return outGrpUserTotalOutGrmUserTotalJournalCrTotAmn;
    }

    /**
     * Sets the value of the outGrpUserTotalOutGrmUserTotalJournalCrTotAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpUserTotalOutGrmUserTotalJournalCrTotAmn(BigDecimal value) {
        this.outGrpUserTotalOutGrmUserTotalJournalCrTotAmn = value;
    }

    /**
     * Gets the value of the outGrpUserTotalOutGrmUserTotalJournalDbDocNum property.
     * 
     */
    public short getOutGrpUserTotalOutGrmUserTotalJournalDbDocNum() {
        return outGrpUserTotalOutGrmUserTotalJournalDbDocNum;
    }

    /**
     * Sets the value of the outGrpUserTotalOutGrmUserTotalJournalDbDocNum property.
     * 
     */
    public void setOutGrpUserTotalOutGrmUserTotalJournalDbDocNum(short value) {
        this.outGrpUserTotalOutGrmUserTotalJournalDbDocNum = value;
    }

    /**
     * Gets the value of the outGrpUserTotalOutGrmUserTotalJournalDbTotAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpUserTotalOutGrmUserTotalJournalDbTotAmn() {
        return outGrpUserTotalOutGrmUserTotalJournalDbTotAmn;
    }

    /**
     * Sets the value of the outGrpUserTotalOutGrmUserTotalJournalDbTotAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpUserTotalOutGrmUserTotalJournalDbTotAmn(BigDecimal value) {
        this.outGrpUserTotalOutGrmUserTotalJournalDbTotAmn = value;
    }

    /**
     * Gets the value of the outGrpUserTotalOutGrmUserTotalMemoCrDocNum property.
     * 
     */
    public short getOutGrpUserTotalOutGrmUserTotalMemoCrDocNum() {
        return outGrpUserTotalOutGrmUserTotalMemoCrDocNum;
    }

    /**
     * Sets the value of the outGrpUserTotalOutGrmUserTotalMemoCrDocNum property.
     * 
     */
    public void setOutGrpUserTotalOutGrmUserTotalMemoCrDocNum(short value) {
        this.outGrpUserTotalOutGrmUserTotalMemoCrDocNum = value;
    }

    /**
     * Gets the value of the outGrpUserTotalOutGrmUserTotalMemoCrTotAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpUserTotalOutGrmUserTotalMemoCrTotAmnt() {
        return outGrpUserTotalOutGrmUserTotalMemoCrTotAmnt;
    }

    /**
     * Sets the value of the outGrpUserTotalOutGrmUserTotalMemoCrTotAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpUserTotalOutGrmUserTotalMemoCrTotAmnt(BigDecimal value) {
        this.outGrpUserTotalOutGrmUserTotalMemoCrTotAmnt = value;
    }

    /**
     * Gets the value of the outGrpUserTotalOutGrmUserTotalMemoDbDocNum property.
     * 
     */
    public short getOutGrpUserTotalOutGrmUserTotalMemoDbDocNum() {
        return outGrpUserTotalOutGrmUserTotalMemoDbDocNum;
    }

    /**
     * Sets the value of the outGrpUserTotalOutGrmUserTotalMemoDbDocNum property.
     * 
     */
    public void setOutGrpUserTotalOutGrmUserTotalMemoDbDocNum(short value) {
        this.outGrpUserTotalOutGrmUserTotalMemoDbDocNum = value;
    }

    /**
     * Gets the value of the outGrpUserTotalOutGrmUserTotalMemoDbTotAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpUserTotalOutGrmUserTotalMemoDbTotAmnt() {
        return outGrpUserTotalOutGrmUserTotalMemoDbTotAmnt;
    }

    /**
     * Sets the value of the outGrpUserTotalOutGrmUserTotalMemoDbTotAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpUserTotalOutGrmUserTotalMemoDbTotAmnt(BigDecimal value) {
        this.outGrpUserTotalOutGrmUserTotalMemoDbTotAmnt = value;
    }

    /**
     * Gets the value of the outGrpUserTotalOutGrmUserTotalRevcashCrDocNum property.
     * 
     */
    public short getOutGrpUserTotalOutGrmUserTotalRevcashCrDocNum() {
        return outGrpUserTotalOutGrmUserTotalRevcashCrDocNum;
    }

    /**
     * Sets the value of the outGrpUserTotalOutGrmUserTotalRevcashCrDocNum property.
     * 
     */
    public void setOutGrpUserTotalOutGrmUserTotalRevcashCrDocNum(short value) {
        this.outGrpUserTotalOutGrmUserTotalRevcashCrDocNum = value;
    }

    /**
     * Gets the value of the outGrpUserTotalOutGrmUserTotalRevcashCrTotAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpUserTotalOutGrmUserTotalRevcashCrTotAmn() {
        return outGrpUserTotalOutGrmUserTotalRevcashCrTotAmn;
    }

    /**
     * Sets the value of the outGrpUserTotalOutGrmUserTotalRevcashCrTotAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpUserTotalOutGrmUserTotalRevcashCrTotAmn(BigDecimal value) {
        this.outGrpUserTotalOutGrmUserTotalRevcashCrTotAmn = value;
    }

    /**
     * Gets the value of the outGrpUserTotalOutGrmUserTotalRevcashDbDocNum property.
     * 
     */
    public short getOutGrpUserTotalOutGrmUserTotalRevcashDbDocNum() {
        return outGrpUserTotalOutGrmUserTotalRevcashDbDocNum;
    }

    /**
     * Sets the value of the outGrpUserTotalOutGrmUserTotalRevcashDbDocNum property.
     * 
     */
    public void setOutGrpUserTotalOutGrmUserTotalRevcashDbDocNum(short value) {
        this.outGrpUserTotalOutGrmUserTotalRevcashDbDocNum = value;
    }

    /**
     * Gets the value of the outGrpUserTotalOutGrmUserTotalRevcashDbTotAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpUserTotalOutGrmUserTotalRevcashDbTotAmn() {
        return outGrpUserTotalOutGrmUserTotalRevcashDbTotAmn;
    }

    /**
     * Sets the value of the outGrpUserTotalOutGrmUserTotalRevcashDbTotAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpUserTotalOutGrmUserTotalRevcashDbTotAmn(BigDecimal value) {
        this.outGrpUserTotalOutGrmUserTotalRevcashDbTotAmn = value;
    }

}
