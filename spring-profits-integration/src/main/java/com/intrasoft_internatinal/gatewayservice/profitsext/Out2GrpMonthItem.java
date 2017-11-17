
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Out2GrpMonthItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Out2GrpMonthItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Out2GrpMonthOutGrmMonthCustomerPositionPosYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Out2GrpMonthOutGrmMonthCharSuppliedChar2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Out2GrpMonthOutGrmMonthBalancesCustomerPositionPenalty00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Out2GrpMonthOutGrmMonthBalancesCustomerPositionInterestDb00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Out2GrpMonthOutGrmMonthBalancesCustomerPositionInterestCr00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Out2GrpMonthOutGrmMonthBalancesCustomerPositionExpenses00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Out2GrpMonthOutGrmMonthBalancesCustomerPositionCommission00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Out2GrpMonthItem", propOrder = {
    "out2GrpMonthOutGrmMonthCustomerPositionPosYear",
    "out2GrpMonthOutGrmMonthCharSuppliedChar2",
    "out2GrpMonthOutGrmMonthBalancesCustomerPositionPenalty00",
    "out2GrpMonthOutGrmMonthBalancesCustomerPositionInterestDb00",
    "out2GrpMonthOutGrmMonthBalancesCustomerPositionInterestCr00",
    "out2GrpMonthOutGrmMonthBalancesCustomerPositionExpenses00",
    "out2GrpMonthOutGrmMonthBalancesCustomerPositionCommission00"
})
public class Out2GrpMonthItem {

    @XmlElement(name = "Out2GrpMonthOutGrmMonthCustomerPositionPosYear")
    protected short out2GrpMonthOutGrmMonthCustomerPositionPosYear;
    @XmlElement(name = "Out2GrpMonthOutGrmMonthCharSuppliedChar2")
    protected String out2GrpMonthOutGrmMonthCharSuppliedChar2;
    @XmlElement(name = "Out2GrpMonthOutGrmMonthBalancesCustomerPositionPenalty00", required = true)
    protected BigDecimal out2GrpMonthOutGrmMonthBalancesCustomerPositionPenalty00;
    @XmlElement(name = "Out2GrpMonthOutGrmMonthBalancesCustomerPositionInterestDb00", required = true)
    protected BigDecimal out2GrpMonthOutGrmMonthBalancesCustomerPositionInterestDb00;
    @XmlElement(name = "Out2GrpMonthOutGrmMonthBalancesCustomerPositionInterestCr00", required = true)
    protected BigDecimal out2GrpMonthOutGrmMonthBalancesCustomerPositionInterestCr00;
    @XmlElement(name = "Out2GrpMonthOutGrmMonthBalancesCustomerPositionExpenses00", required = true)
    protected BigDecimal out2GrpMonthOutGrmMonthBalancesCustomerPositionExpenses00;
    @XmlElement(name = "Out2GrpMonthOutGrmMonthBalancesCustomerPositionCommission00", required = true)
    protected BigDecimal out2GrpMonthOutGrmMonthBalancesCustomerPositionCommission00;

    /**
     * Gets the value of the out2GrpMonthOutGrmMonthCustomerPositionPosYear property.
     * 
     */
    public short getOut2GrpMonthOutGrmMonthCustomerPositionPosYear() {
        return out2GrpMonthOutGrmMonthCustomerPositionPosYear;
    }

    /**
     * Sets the value of the out2GrpMonthOutGrmMonthCustomerPositionPosYear property.
     * 
     */
    public void setOut2GrpMonthOutGrmMonthCustomerPositionPosYear(short value) {
        this.out2GrpMonthOutGrmMonthCustomerPositionPosYear = value;
    }

    /**
     * Gets the value of the out2GrpMonthOutGrmMonthCharSuppliedChar2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOut2GrpMonthOutGrmMonthCharSuppliedChar2() {
        return out2GrpMonthOutGrmMonthCharSuppliedChar2;
    }

    /**
     * Sets the value of the out2GrpMonthOutGrmMonthCharSuppliedChar2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOut2GrpMonthOutGrmMonthCharSuppliedChar2(String value) {
        this.out2GrpMonthOutGrmMonthCharSuppliedChar2 = value;
    }

    /**
     * Gets the value of the out2GrpMonthOutGrmMonthBalancesCustomerPositionPenalty00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOut2GrpMonthOutGrmMonthBalancesCustomerPositionPenalty00() {
        return out2GrpMonthOutGrmMonthBalancesCustomerPositionPenalty00;
    }

    /**
     * Sets the value of the out2GrpMonthOutGrmMonthBalancesCustomerPositionPenalty00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOut2GrpMonthOutGrmMonthBalancesCustomerPositionPenalty00(BigDecimal value) {
        this.out2GrpMonthOutGrmMonthBalancesCustomerPositionPenalty00 = value;
    }

    /**
     * Gets the value of the out2GrpMonthOutGrmMonthBalancesCustomerPositionInterestDb00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOut2GrpMonthOutGrmMonthBalancesCustomerPositionInterestDb00() {
        return out2GrpMonthOutGrmMonthBalancesCustomerPositionInterestDb00;
    }

    /**
     * Sets the value of the out2GrpMonthOutGrmMonthBalancesCustomerPositionInterestDb00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOut2GrpMonthOutGrmMonthBalancesCustomerPositionInterestDb00(BigDecimal value) {
        this.out2GrpMonthOutGrmMonthBalancesCustomerPositionInterestDb00 = value;
    }

    /**
     * Gets the value of the out2GrpMonthOutGrmMonthBalancesCustomerPositionInterestCr00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOut2GrpMonthOutGrmMonthBalancesCustomerPositionInterestCr00() {
        return out2GrpMonthOutGrmMonthBalancesCustomerPositionInterestCr00;
    }

    /**
     * Sets the value of the out2GrpMonthOutGrmMonthBalancesCustomerPositionInterestCr00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOut2GrpMonthOutGrmMonthBalancesCustomerPositionInterestCr00(BigDecimal value) {
        this.out2GrpMonthOutGrmMonthBalancesCustomerPositionInterestCr00 = value;
    }

    /**
     * Gets the value of the out2GrpMonthOutGrmMonthBalancesCustomerPositionExpenses00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOut2GrpMonthOutGrmMonthBalancesCustomerPositionExpenses00() {
        return out2GrpMonthOutGrmMonthBalancesCustomerPositionExpenses00;
    }

    /**
     * Sets the value of the out2GrpMonthOutGrmMonthBalancesCustomerPositionExpenses00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOut2GrpMonthOutGrmMonthBalancesCustomerPositionExpenses00(BigDecimal value) {
        this.out2GrpMonthOutGrmMonthBalancesCustomerPositionExpenses00 = value;
    }

    /**
     * Gets the value of the out2GrpMonthOutGrmMonthBalancesCustomerPositionCommission00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOut2GrpMonthOutGrmMonthBalancesCustomerPositionCommission00() {
        return out2GrpMonthOutGrmMonthBalancesCustomerPositionCommission00;
    }

    /**
     * Sets the value of the out2GrpMonthOutGrmMonthBalancesCustomerPositionCommission00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOut2GrpMonthOutGrmMonthBalancesCustomerPositionCommission00(BigDecimal value) {
        this.out2GrpMonthOutGrmMonthBalancesCustomerPositionCommission00 = value;
    }

}
