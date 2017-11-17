
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Adds01OutLogfileGroupItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Adds01OutLogfileGroupItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutLogfileGroupOutGroupLogChequeNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutLogfileGroupOutGroupLogCurrency1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLogfileGroupOutGroupLogJustification" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLogfileGroupOutGroupLogNonFinAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLogfileGroupOutGroupLogPrftSystem" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLogfileGroupOutGroupLogProductCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLogfileGroupOutGroupLogSourceAccCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLogfileGroupOutGroupLogSourceAccount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutLogfileGroupOutGroupLogSourceCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLogfileGroupOutGroupLogTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLogfileGroupOutGroupLogTrxSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLogfileGroupOutGroupLogTunInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLogfileGroupOutLogfileDepTrxjustTrnType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Adds01OutLogfileGroupItem", propOrder = {
    "outLogfileGroupOutGroupLogChequeNumber",
    "outLogfileGroupOutGroupLogCurrency1",
    "outLogfileGroupOutGroupLogJustification",
    "outLogfileGroupOutGroupLogNonFinAmount",
    "outLogfileGroupOutGroupLogPrftSystem",
    "outLogfileGroupOutGroupLogProductCode",
    "outLogfileGroupOutGroupLogSourceAccCDigit",
    "outLogfileGroupOutGroupLogSourceAccount",
    "outLogfileGroupOutGroupLogSourceCurrency",
    "outLogfileGroupOutGroupLogTrxCode",
    "outLogfileGroupOutGroupLogTrxSn",
    "outLogfileGroupOutGroupLogTunInternalSn",
    "outLogfileGroupOutLogfileDepTrxjustTrnType"
})
public class Adds01OutLogfileGroupItem {

    @XmlElement(name = "OutLogfileGroupOutGroupLogChequeNumber")
    protected double outLogfileGroupOutGroupLogChequeNumber;
    @XmlElement(name = "OutLogfileGroupOutGroupLogCurrency1")
    protected int outLogfileGroupOutGroupLogCurrency1;
    @XmlElement(name = "OutLogfileGroupOutGroupLogJustification")
    protected int outLogfileGroupOutGroupLogJustification;
    @XmlElement(name = "OutLogfileGroupOutGroupLogNonFinAmount", required = true)
    protected BigDecimal outLogfileGroupOutGroupLogNonFinAmount;
    @XmlElement(name = "OutLogfileGroupOutGroupLogPrftSystem")
    protected int outLogfileGroupOutGroupLogPrftSystem;
    @XmlElement(name = "OutLogfileGroupOutGroupLogProductCode")
    protected int outLogfileGroupOutGroupLogProductCode;
    @XmlElement(name = "OutLogfileGroupOutGroupLogSourceAccCDigit")
    protected short outLogfileGroupOutGroupLogSourceAccCDigit;
    @XmlElement(name = "OutLogfileGroupOutGroupLogSourceAccount")
    protected double outLogfileGroupOutGroupLogSourceAccount;
    @XmlElement(name = "OutLogfileGroupOutGroupLogSourceCurrency")
    protected int outLogfileGroupOutGroupLogSourceCurrency;
    @XmlElement(name = "OutLogfileGroupOutGroupLogTrxCode")
    protected int outLogfileGroupOutGroupLogTrxCode;
    @XmlElement(name = "OutLogfileGroupOutGroupLogTrxSn")
    protected int outLogfileGroupOutGroupLogTrxSn;
    @XmlElement(name = "OutLogfileGroupOutGroupLogTunInternalSn")
    protected short outLogfileGroupOutGroupLogTunInternalSn;
    @XmlElement(name = "OutLogfileGroupOutLogfileDepTrxjustTrnType")
    protected String outLogfileGroupOutLogfileDepTrxjustTrnType;

    /**
     * Gets the value of the outLogfileGroupOutGroupLogChequeNumber property.
     * 
     */
    public double getOutLogfileGroupOutGroupLogChequeNumber() {
        return outLogfileGroupOutGroupLogChequeNumber;
    }

    /**
     * Sets the value of the outLogfileGroupOutGroupLogChequeNumber property.
     * 
     */
    public void setOutLogfileGroupOutGroupLogChequeNumber(double value) {
        this.outLogfileGroupOutGroupLogChequeNumber = value;
    }

    /**
     * Gets the value of the outLogfileGroupOutGroupLogCurrency1 property.
     * 
     */
    public int getOutLogfileGroupOutGroupLogCurrency1() {
        return outLogfileGroupOutGroupLogCurrency1;
    }

    /**
     * Sets the value of the outLogfileGroupOutGroupLogCurrency1 property.
     * 
     */
    public void setOutLogfileGroupOutGroupLogCurrency1(int value) {
        this.outLogfileGroupOutGroupLogCurrency1 = value;
    }

    /**
     * Gets the value of the outLogfileGroupOutGroupLogJustification property.
     * 
     */
    public int getOutLogfileGroupOutGroupLogJustification() {
        return outLogfileGroupOutGroupLogJustification;
    }

    /**
     * Sets the value of the outLogfileGroupOutGroupLogJustification property.
     * 
     */
    public void setOutLogfileGroupOutGroupLogJustification(int value) {
        this.outLogfileGroupOutGroupLogJustification = value;
    }

    /**
     * Gets the value of the outLogfileGroupOutGroupLogNonFinAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLogfileGroupOutGroupLogNonFinAmount() {
        return outLogfileGroupOutGroupLogNonFinAmount;
    }

    /**
     * Sets the value of the outLogfileGroupOutGroupLogNonFinAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLogfileGroupOutGroupLogNonFinAmount(BigDecimal value) {
        this.outLogfileGroupOutGroupLogNonFinAmount = value;
    }

    /**
     * Gets the value of the outLogfileGroupOutGroupLogPrftSystem property.
     * 
     */
    public int getOutLogfileGroupOutGroupLogPrftSystem() {
        return outLogfileGroupOutGroupLogPrftSystem;
    }

    /**
     * Sets the value of the outLogfileGroupOutGroupLogPrftSystem property.
     * 
     */
    public void setOutLogfileGroupOutGroupLogPrftSystem(int value) {
        this.outLogfileGroupOutGroupLogPrftSystem = value;
    }

    /**
     * Gets the value of the outLogfileGroupOutGroupLogProductCode property.
     * 
     */
    public int getOutLogfileGroupOutGroupLogProductCode() {
        return outLogfileGroupOutGroupLogProductCode;
    }

    /**
     * Sets the value of the outLogfileGroupOutGroupLogProductCode property.
     * 
     */
    public void setOutLogfileGroupOutGroupLogProductCode(int value) {
        this.outLogfileGroupOutGroupLogProductCode = value;
    }

    /**
     * Gets the value of the outLogfileGroupOutGroupLogSourceAccCDigit property.
     * 
     */
    public short getOutLogfileGroupOutGroupLogSourceAccCDigit() {
        return outLogfileGroupOutGroupLogSourceAccCDigit;
    }

    /**
     * Sets the value of the outLogfileGroupOutGroupLogSourceAccCDigit property.
     * 
     */
    public void setOutLogfileGroupOutGroupLogSourceAccCDigit(short value) {
        this.outLogfileGroupOutGroupLogSourceAccCDigit = value;
    }

    /**
     * Gets the value of the outLogfileGroupOutGroupLogSourceAccount property.
     * 
     */
    public double getOutLogfileGroupOutGroupLogSourceAccount() {
        return outLogfileGroupOutGroupLogSourceAccount;
    }

    /**
     * Sets the value of the outLogfileGroupOutGroupLogSourceAccount property.
     * 
     */
    public void setOutLogfileGroupOutGroupLogSourceAccount(double value) {
        this.outLogfileGroupOutGroupLogSourceAccount = value;
    }

    /**
     * Gets the value of the outLogfileGroupOutGroupLogSourceCurrency property.
     * 
     */
    public int getOutLogfileGroupOutGroupLogSourceCurrency() {
        return outLogfileGroupOutGroupLogSourceCurrency;
    }

    /**
     * Sets the value of the outLogfileGroupOutGroupLogSourceCurrency property.
     * 
     */
    public void setOutLogfileGroupOutGroupLogSourceCurrency(int value) {
        this.outLogfileGroupOutGroupLogSourceCurrency = value;
    }

    /**
     * Gets the value of the outLogfileGroupOutGroupLogTrxCode property.
     * 
     */
    public int getOutLogfileGroupOutGroupLogTrxCode() {
        return outLogfileGroupOutGroupLogTrxCode;
    }

    /**
     * Sets the value of the outLogfileGroupOutGroupLogTrxCode property.
     * 
     */
    public void setOutLogfileGroupOutGroupLogTrxCode(int value) {
        this.outLogfileGroupOutGroupLogTrxCode = value;
    }

    /**
     * Gets the value of the outLogfileGroupOutGroupLogTrxSn property.
     * 
     */
    public int getOutLogfileGroupOutGroupLogTrxSn() {
        return outLogfileGroupOutGroupLogTrxSn;
    }

    /**
     * Sets the value of the outLogfileGroupOutGroupLogTrxSn property.
     * 
     */
    public void setOutLogfileGroupOutGroupLogTrxSn(int value) {
        this.outLogfileGroupOutGroupLogTrxSn = value;
    }

    /**
     * Gets the value of the outLogfileGroupOutGroupLogTunInternalSn property.
     * 
     */
    public short getOutLogfileGroupOutGroupLogTunInternalSn() {
        return outLogfileGroupOutGroupLogTunInternalSn;
    }

    /**
     * Sets the value of the outLogfileGroupOutGroupLogTunInternalSn property.
     * 
     */
    public void setOutLogfileGroupOutGroupLogTunInternalSn(short value) {
        this.outLogfileGroupOutGroupLogTunInternalSn = value;
    }

    /**
     * Gets the value of the outLogfileGroupOutLogfileDepTrxjustTrnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLogfileGroupOutLogfileDepTrxjustTrnType() {
        return outLogfileGroupOutLogfileDepTrxjustTrnType;
    }

    /**
     * Sets the value of the outLogfileGroupOutLogfileDepTrxjustTrnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLogfileGroupOutLogfileDepTrxjustTrnType(String value) {
        this.outLogfileGroupOutLogfileDepTrxjustTrnType = value;
    }

}
