
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Out4GrpAccountMonthItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Out4GrpAccountMonthItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Out4GrpAccountMonthOutGrmAccountMonthProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Out4GrpAccountMonthOutGrmAccountMonthProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Out4GrpAccountMonthOutGrmAccountMonthProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Out4GrpAccountMonthOutGrmAccountMonthProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Out4GrpAccountMonthOutGrmAccountMonthProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Out4GrpAccountMonthOutGrmAccountMonthCustomerPositionPosYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Out4GrpAccountMonthOutGrmAccountMonthCustomerPositionAccProdNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Out4GrpAccountMonthOutGrmAccountMonthCharSuppliedChar2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionPenalty00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionInterestDb00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionInterestCr00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionExpenses00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionCommission00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Out4GrpAccountMonthItem", propOrder = {
    "out4GrpAccountMonthOutGrmAccountMonthProfitsAccountPrftSystem",
    "out4GrpAccountMonthOutGrmAccountMonthProfitsAccountAccountNumber",
    "out4GrpAccountMonthOutGrmAccountMonthProfitsAccountAccountCd",
    "out4GrpAccountMonthOutGrmAccountMonthProductIdProduct",
    "out4GrpAccountMonthOutGrmAccountMonthProductDescription",
    "out4GrpAccountMonthOutGrmAccountMonthCustomerPositionPosYear",
    "out4GrpAccountMonthOutGrmAccountMonthCustomerPositionAccProdNumber",
    "out4GrpAccountMonthOutGrmAccountMonthCharSuppliedChar2",
    "out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionPenalty00",
    "out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionInterestDb00",
    "out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionInterestCr00",
    "out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionExpenses00",
    "out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionCommission00"
})
public class Out4GrpAccountMonthItem {

    @XmlElement(name = "Out4GrpAccountMonthOutGrmAccountMonthProfitsAccountPrftSystem")
    protected short out4GrpAccountMonthOutGrmAccountMonthProfitsAccountPrftSystem;
    @XmlElement(name = "Out4GrpAccountMonthOutGrmAccountMonthProfitsAccountAccountNumber")
    protected String out4GrpAccountMonthOutGrmAccountMonthProfitsAccountAccountNumber;
    @XmlElement(name = "Out4GrpAccountMonthOutGrmAccountMonthProfitsAccountAccountCd")
    protected short out4GrpAccountMonthOutGrmAccountMonthProfitsAccountAccountCd;
    @XmlElement(name = "Out4GrpAccountMonthOutGrmAccountMonthProductIdProduct")
    protected int out4GrpAccountMonthOutGrmAccountMonthProductIdProduct;
    @XmlElement(name = "Out4GrpAccountMonthOutGrmAccountMonthProductDescription")
    protected String out4GrpAccountMonthOutGrmAccountMonthProductDescription;
    @XmlElement(name = "Out4GrpAccountMonthOutGrmAccountMonthCustomerPositionPosYear")
    protected short out4GrpAccountMonthOutGrmAccountMonthCustomerPositionPosYear;
    @XmlElement(name = "Out4GrpAccountMonthOutGrmAccountMonthCustomerPositionAccProdNumber")
    protected double out4GrpAccountMonthOutGrmAccountMonthCustomerPositionAccProdNumber;
    @XmlElement(name = "Out4GrpAccountMonthOutGrmAccountMonthCharSuppliedChar2")
    protected String out4GrpAccountMonthOutGrmAccountMonthCharSuppliedChar2;
    @XmlElement(name = "Out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionPenalty00", required = true)
    protected BigDecimal out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionPenalty00;
    @XmlElement(name = "Out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionInterestDb00", required = true)
    protected BigDecimal out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionInterestDb00;
    @XmlElement(name = "Out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionInterestCr00", required = true)
    protected BigDecimal out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionInterestCr00;
    @XmlElement(name = "Out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionExpenses00", required = true)
    protected BigDecimal out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionExpenses00;
    @XmlElement(name = "Out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionCommission00", required = true)
    protected BigDecimal out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionCommission00;

    /**
     * Gets the value of the out4GrpAccountMonthOutGrmAccountMonthProfitsAccountPrftSystem property.
     * 
     */
    public short getOut4GrpAccountMonthOutGrmAccountMonthProfitsAccountPrftSystem() {
        return out4GrpAccountMonthOutGrmAccountMonthProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the out4GrpAccountMonthOutGrmAccountMonthProfitsAccountPrftSystem property.
     * 
     */
    public void setOut4GrpAccountMonthOutGrmAccountMonthProfitsAccountPrftSystem(short value) {
        this.out4GrpAccountMonthOutGrmAccountMonthProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the out4GrpAccountMonthOutGrmAccountMonthProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOut4GrpAccountMonthOutGrmAccountMonthProfitsAccountAccountNumber() {
        return out4GrpAccountMonthOutGrmAccountMonthProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the out4GrpAccountMonthOutGrmAccountMonthProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOut4GrpAccountMonthOutGrmAccountMonthProfitsAccountAccountNumber(String value) {
        this.out4GrpAccountMonthOutGrmAccountMonthProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the out4GrpAccountMonthOutGrmAccountMonthProfitsAccountAccountCd property.
     * 
     */
    public short getOut4GrpAccountMonthOutGrmAccountMonthProfitsAccountAccountCd() {
        return out4GrpAccountMonthOutGrmAccountMonthProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the out4GrpAccountMonthOutGrmAccountMonthProfitsAccountAccountCd property.
     * 
     */
    public void setOut4GrpAccountMonthOutGrmAccountMonthProfitsAccountAccountCd(short value) {
        this.out4GrpAccountMonthOutGrmAccountMonthProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the out4GrpAccountMonthOutGrmAccountMonthProductIdProduct property.
     * 
     */
    public int getOut4GrpAccountMonthOutGrmAccountMonthProductIdProduct() {
        return out4GrpAccountMonthOutGrmAccountMonthProductIdProduct;
    }

    /**
     * Sets the value of the out4GrpAccountMonthOutGrmAccountMonthProductIdProduct property.
     * 
     */
    public void setOut4GrpAccountMonthOutGrmAccountMonthProductIdProduct(int value) {
        this.out4GrpAccountMonthOutGrmAccountMonthProductIdProduct = value;
    }

    /**
     * Gets the value of the out4GrpAccountMonthOutGrmAccountMonthProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOut4GrpAccountMonthOutGrmAccountMonthProductDescription() {
        return out4GrpAccountMonthOutGrmAccountMonthProductDescription;
    }

    /**
     * Sets the value of the out4GrpAccountMonthOutGrmAccountMonthProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOut4GrpAccountMonthOutGrmAccountMonthProductDescription(String value) {
        this.out4GrpAccountMonthOutGrmAccountMonthProductDescription = value;
    }

    /**
     * Gets the value of the out4GrpAccountMonthOutGrmAccountMonthCustomerPositionPosYear property.
     * 
     */
    public short getOut4GrpAccountMonthOutGrmAccountMonthCustomerPositionPosYear() {
        return out4GrpAccountMonthOutGrmAccountMonthCustomerPositionPosYear;
    }

    /**
     * Sets the value of the out4GrpAccountMonthOutGrmAccountMonthCustomerPositionPosYear property.
     * 
     */
    public void setOut4GrpAccountMonthOutGrmAccountMonthCustomerPositionPosYear(short value) {
        this.out4GrpAccountMonthOutGrmAccountMonthCustomerPositionPosYear = value;
    }

    /**
     * Gets the value of the out4GrpAccountMonthOutGrmAccountMonthCustomerPositionAccProdNumber property.
     * 
     */
    public double getOut4GrpAccountMonthOutGrmAccountMonthCustomerPositionAccProdNumber() {
        return out4GrpAccountMonthOutGrmAccountMonthCustomerPositionAccProdNumber;
    }

    /**
     * Sets the value of the out4GrpAccountMonthOutGrmAccountMonthCustomerPositionAccProdNumber property.
     * 
     */
    public void setOut4GrpAccountMonthOutGrmAccountMonthCustomerPositionAccProdNumber(double value) {
        this.out4GrpAccountMonthOutGrmAccountMonthCustomerPositionAccProdNumber = value;
    }

    /**
     * Gets the value of the out4GrpAccountMonthOutGrmAccountMonthCharSuppliedChar2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOut4GrpAccountMonthOutGrmAccountMonthCharSuppliedChar2() {
        return out4GrpAccountMonthOutGrmAccountMonthCharSuppliedChar2;
    }

    /**
     * Sets the value of the out4GrpAccountMonthOutGrmAccountMonthCharSuppliedChar2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOut4GrpAccountMonthOutGrmAccountMonthCharSuppliedChar2(String value) {
        this.out4GrpAccountMonthOutGrmAccountMonthCharSuppliedChar2 = value;
    }

    /**
     * Gets the value of the out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionPenalty00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOut4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionPenalty00() {
        return out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionPenalty00;
    }

    /**
     * Sets the value of the out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionPenalty00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOut4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionPenalty00(BigDecimal value) {
        this.out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionPenalty00 = value;
    }

    /**
     * Gets the value of the out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionInterestDb00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOut4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionInterestDb00() {
        return out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionInterestDb00;
    }

    /**
     * Sets the value of the out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionInterestDb00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOut4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionInterestDb00(BigDecimal value) {
        this.out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionInterestDb00 = value;
    }

    /**
     * Gets the value of the out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionInterestCr00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOut4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionInterestCr00() {
        return out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionInterestCr00;
    }

    /**
     * Sets the value of the out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionInterestCr00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOut4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionInterestCr00(BigDecimal value) {
        this.out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionInterestCr00 = value;
    }

    /**
     * Gets the value of the out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionExpenses00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOut4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionExpenses00() {
        return out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionExpenses00;
    }

    /**
     * Sets the value of the out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionExpenses00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOut4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionExpenses00(BigDecimal value) {
        this.out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionExpenses00 = value;
    }

    /**
     * Gets the value of the out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionCommission00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOut4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionCommission00() {
        return out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionCommission00;
    }

    /**
     * Sets the value of the out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionCommission00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOut4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionCommission00(BigDecimal value) {
        this.out4GrpAccountMonthOutGrmAccountMonthBalancesCustomerPositionCommission00 = value;
    }

}
