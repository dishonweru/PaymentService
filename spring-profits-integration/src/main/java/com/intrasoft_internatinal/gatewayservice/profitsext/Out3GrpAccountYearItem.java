
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Out3GrpAccountYearItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Out3GrpAccountYearItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Out3GrpAccountYearOutGrmAccountYearProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Out3GrpAccountYearOutGrmAccountYearProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Out3GrpAccountYearOutGrmAccountYearProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Out3GrpAccountYearOutGrmAccountYearProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Out3GrpAccountYearOutGrmAccountYearProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Out3GrpAccountYearOutGrmAccountYearCustomerPositionPosYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Out3GrpAccountYearOutGrmAccountYearCustomerPositionAccProdNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionPenalty00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionInterestDb00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionInterestCr00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionExpenses00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionCommission00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Out3GrpAccountYearItem", propOrder = {
    "out3GrpAccountYearOutGrmAccountYearProfitsAccountPrftSystem",
    "out3GrpAccountYearOutGrmAccountYearProfitsAccountAccountNumber",
    "out3GrpAccountYearOutGrmAccountYearProfitsAccountAccountCd",
    "out3GrpAccountYearOutGrmAccountYearProductIdProduct",
    "out3GrpAccountYearOutGrmAccountYearProductDescription",
    "out3GrpAccountYearOutGrmAccountYearCustomerPositionPosYear",
    "out3GrpAccountYearOutGrmAccountYearCustomerPositionAccProdNumber",
    "out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionPenalty00",
    "out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionInterestDb00",
    "out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionInterestCr00",
    "out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionExpenses00",
    "out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionCommission00"
})
public class Out3GrpAccountYearItem {

    @XmlElement(name = "Out3GrpAccountYearOutGrmAccountYearProfitsAccountPrftSystem")
    protected short out3GrpAccountYearOutGrmAccountYearProfitsAccountPrftSystem;
    @XmlElement(name = "Out3GrpAccountYearOutGrmAccountYearProfitsAccountAccountNumber")
    protected String out3GrpAccountYearOutGrmAccountYearProfitsAccountAccountNumber;
    @XmlElement(name = "Out3GrpAccountYearOutGrmAccountYearProfitsAccountAccountCd")
    protected short out3GrpAccountYearOutGrmAccountYearProfitsAccountAccountCd;
    @XmlElement(name = "Out3GrpAccountYearOutGrmAccountYearProductIdProduct")
    protected int out3GrpAccountYearOutGrmAccountYearProductIdProduct;
    @XmlElement(name = "Out3GrpAccountYearOutGrmAccountYearProductDescription")
    protected String out3GrpAccountYearOutGrmAccountYearProductDescription;
    @XmlElement(name = "Out3GrpAccountYearOutGrmAccountYearCustomerPositionPosYear")
    protected short out3GrpAccountYearOutGrmAccountYearCustomerPositionPosYear;
    @XmlElement(name = "Out3GrpAccountYearOutGrmAccountYearCustomerPositionAccProdNumber")
    protected double out3GrpAccountYearOutGrmAccountYearCustomerPositionAccProdNumber;
    @XmlElement(name = "Out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionPenalty00", required = true)
    protected BigDecimal out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionPenalty00;
    @XmlElement(name = "Out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionInterestDb00", required = true)
    protected BigDecimal out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionInterestDb00;
    @XmlElement(name = "Out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionInterestCr00", required = true)
    protected BigDecimal out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionInterestCr00;
    @XmlElement(name = "Out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionExpenses00", required = true)
    protected BigDecimal out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionExpenses00;
    @XmlElement(name = "Out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionCommission00", required = true)
    protected BigDecimal out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionCommission00;

    /**
     * Gets the value of the out3GrpAccountYearOutGrmAccountYearProfitsAccountPrftSystem property.
     * 
     */
    public short getOut3GrpAccountYearOutGrmAccountYearProfitsAccountPrftSystem() {
        return out3GrpAccountYearOutGrmAccountYearProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the out3GrpAccountYearOutGrmAccountYearProfitsAccountPrftSystem property.
     * 
     */
    public void setOut3GrpAccountYearOutGrmAccountYearProfitsAccountPrftSystem(short value) {
        this.out3GrpAccountYearOutGrmAccountYearProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the out3GrpAccountYearOutGrmAccountYearProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOut3GrpAccountYearOutGrmAccountYearProfitsAccountAccountNumber() {
        return out3GrpAccountYearOutGrmAccountYearProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the out3GrpAccountYearOutGrmAccountYearProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOut3GrpAccountYearOutGrmAccountYearProfitsAccountAccountNumber(String value) {
        this.out3GrpAccountYearOutGrmAccountYearProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the out3GrpAccountYearOutGrmAccountYearProfitsAccountAccountCd property.
     * 
     */
    public short getOut3GrpAccountYearOutGrmAccountYearProfitsAccountAccountCd() {
        return out3GrpAccountYearOutGrmAccountYearProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the out3GrpAccountYearOutGrmAccountYearProfitsAccountAccountCd property.
     * 
     */
    public void setOut3GrpAccountYearOutGrmAccountYearProfitsAccountAccountCd(short value) {
        this.out3GrpAccountYearOutGrmAccountYearProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the out3GrpAccountYearOutGrmAccountYearProductIdProduct property.
     * 
     */
    public int getOut3GrpAccountYearOutGrmAccountYearProductIdProduct() {
        return out3GrpAccountYearOutGrmAccountYearProductIdProduct;
    }

    /**
     * Sets the value of the out3GrpAccountYearOutGrmAccountYearProductIdProduct property.
     * 
     */
    public void setOut3GrpAccountYearOutGrmAccountYearProductIdProduct(int value) {
        this.out3GrpAccountYearOutGrmAccountYearProductIdProduct = value;
    }

    /**
     * Gets the value of the out3GrpAccountYearOutGrmAccountYearProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOut3GrpAccountYearOutGrmAccountYearProductDescription() {
        return out3GrpAccountYearOutGrmAccountYearProductDescription;
    }

    /**
     * Sets the value of the out3GrpAccountYearOutGrmAccountYearProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOut3GrpAccountYearOutGrmAccountYearProductDescription(String value) {
        this.out3GrpAccountYearOutGrmAccountYearProductDescription = value;
    }

    /**
     * Gets the value of the out3GrpAccountYearOutGrmAccountYearCustomerPositionPosYear property.
     * 
     */
    public short getOut3GrpAccountYearOutGrmAccountYearCustomerPositionPosYear() {
        return out3GrpAccountYearOutGrmAccountYearCustomerPositionPosYear;
    }

    /**
     * Sets the value of the out3GrpAccountYearOutGrmAccountYearCustomerPositionPosYear property.
     * 
     */
    public void setOut3GrpAccountYearOutGrmAccountYearCustomerPositionPosYear(short value) {
        this.out3GrpAccountYearOutGrmAccountYearCustomerPositionPosYear = value;
    }

    /**
     * Gets the value of the out3GrpAccountYearOutGrmAccountYearCustomerPositionAccProdNumber property.
     * 
     */
    public double getOut3GrpAccountYearOutGrmAccountYearCustomerPositionAccProdNumber() {
        return out3GrpAccountYearOutGrmAccountYearCustomerPositionAccProdNumber;
    }

    /**
     * Sets the value of the out3GrpAccountYearOutGrmAccountYearCustomerPositionAccProdNumber property.
     * 
     */
    public void setOut3GrpAccountYearOutGrmAccountYearCustomerPositionAccProdNumber(double value) {
        this.out3GrpAccountYearOutGrmAccountYearCustomerPositionAccProdNumber = value;
    }

    /**
     * Gets the value of the out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionPenalty00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOut3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionPenalty00() {
        return out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionPenalty00;
    }

    /**
     * Sets the value of the out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionPenalty00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOut3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionPenalty00(BigDecimal value) {
        this.out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionPenalty00 = value;
    }

    /**
     * Gets the value of the out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionInterestDb00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOut3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionInterestDb00() {
        return out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionInterestDb00;
    }

    /**
     * Sets the value of the out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionInterestDb00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOut3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionInterestDb00(BigDecimal value) {
        this.out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionInterestDb00 = value;
    }

    /**
     * Gets the value of the out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionInterestCr00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOut3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionInterestCr00() {
        return out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionInterestCr00;
    }

    /**
     * Sets the value of the out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionInterestCr00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOut3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionInterestCr00(BigDecimal value) {
        this.out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionInterestCr00 = value;
    }

    /**
     * Gets the value of the out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionExpenses00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOut3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionExpenses00() {
        return out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionExpenses00;
    }

    /**
     * Sets the value of the out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionExpenses00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOut3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionExpenses00(BigDecimal value) {
        this.out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionExpenses00 = value;
    }

    /**
     * Gets the value of the out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionCommission00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOut3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionCommission00() {
        return out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionCommission00;
    }

    /**
     * Sets the value of the out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionCommission00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOut3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionCommission00(BigDecimal value) {
        this.out3GrpAccountYearOutGrmAccountYearBalancesCustomerPositionCommission00 = value;
    }

}
