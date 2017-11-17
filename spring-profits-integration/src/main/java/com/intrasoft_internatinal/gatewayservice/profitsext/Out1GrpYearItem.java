
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Out1GrpYearItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Out1GrpYearItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Out1GrpYearOutGrmYearCustomerPositionPosYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Out1GrpYearOutGrmYearCustomerPositionPenalty00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Out1GrpYearOutGrmYearCustomerPositionInterestDb00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Out1GrpYearOutGrmYearCustomerPositionInterestCr00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Out1GrpYearOutGrmYearCustomerPositionExpenses00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Out1GrpYearOutGrmYearCustomerPositionCommission00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Out1GrpYearItem", propOrder = {
    "out1GrpYearOutGrmYearCustomerPositionPosYear",
    "out1GrpYearOutGrmYearCustomerPositionPenalty00",
    "out1GrpYearOutGrmYearCustomerPositionInterestDb00",
    "out1GrpYearOutGrmYearCustomerPositionInterestCr00",
    "out1GrpYearOutGrmYearCustomerPositionExpenses00",
    "out1GrpYearOutGrmYearCustomerPositionCommission00"
})
public class Out1GrpYearItem {

    @XmlElement(name = "Out1GrpYearOutGrmYearCustomerPositionPosYear")
    protected short out1GrpYearOutGrmYearCustomerPositionPosYear;
    @XmlElement(name = "Out1GrpYearOutGrmYearCustomerPositionPenalty00", required = true)
    protected BigDecimal out1GrpYearOutGrmYearCustomerPositionPenalty00;
    @XmlElement(name = "Out1GrpYearOutGrmYearCustomerPositionInterestDb00", required = true)
    protected BigDecimal out1GrpYearOutGrmYearCustomerPositionInterestDb00;
    @XmlElement(name = "Out1GrpYearOutGrmYearCustomerPositionInterestCr00", required = true)
    protected BigDecimal out1GrpYearOutGrmYearCustomerPositionInterestCr00;
    @XmlElement(name = "Out1GrpYearOutGrmYearCustomerPositionExpenses00", required = true)
    protected BigDecimal out1GrpYearOutGrmYearCustomerPositionExpenses00;
    @XmlElement(name = "Out1GrpYearOutGrmYearCustomerPositionCommission00", required = true)
    protected BigDecimal out1GrpYearOutGrmYearCustomerPositionCommission00;

    /**
     * Gets the value of the out1GrpYearOutGrmYearCustomerPositionPosYear property.
     * 
     */
    public short getOut1GrpYearOutGrmYearCustomerPositionPosYear() {
        return out1GrpYearOutGrmYearCustomerPositionPosYear;
    }

    /**
     * Sets the value of the out1GrpYearOutGrmYearCustomerPositionPosYear property.
     * 
     */
    public void setOut1GrpYearOutGrmYearCustomerPositionPosYear(short value) {
        this.out1GrpYearOutGrmYearCustomerPositionPosYear = value;
    }

    /**
     * Gets the value of the out1GrpYearOutGrmYearCustomerPositionPenalty00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOut1GrpYearOutGrmYearCustomerPositionPenalty00() {
        return out1GrpYearOutGrmYearCustomerPositionPenalty00;
    }

    /**
     * Sets the value of the out1GrpYearOutGrmYearCustomerPositionPenalty00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOut1GrpYearOutGrmYearCustomerPositionPenalty00(BigDecimal value) {
        this.out1GrpYearOutGrmYearCustomerPositionPenalty00 = value;
    }

    /**
     * Gets the value of the out1GrpYearOutGrmYearCustomerPositionInterestDb00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOut1GrpYearOutGrmYearCustomerPositionInterestDb00() {
        return out1GrpYearOutGrmYearCustomerPositionInterestDb00;
    }

    /**
     * Sets the value of the out1GrpYearOutGrmYearCustomerPositionInterestDb00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOut1GrpYearOutGrmYearCustomerPositionInterestDb00(BigDecimal value) {
        this.out1GrpYearOutGrmYearCustomerPositionInterestDb00 = value;
    }

    /**
     * Gets the value of the out1GrpYearOutGrmYearCustomerPositionInterestCr00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOut1GrpYearOutGrmYearCustomerPositionInterestCr00() {
        return out1GrpYearOutGrmYearCustomerPositionInterestCr00;
    }

    /**
     * Sets the value of the out1GrpYearOutGrmYearCustomerPositionInterestCr00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOut1GrpYearOutGrmYearCustomerPositionInterestCr00(BigDecimal value) {
        this.out1GrpYearOutGrmYearCustomerPositionInterestCr00 = value;
    }

    /**
     * Gets the value of the out1GrpYearOutGrmYearCustomerPositionExpenses00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOut1GrpYearOutGrmYearCustomerPositionExpenses00() {
        return out1GrpYearOutGrmYearCustomerPositionExpenses00;
    }

    /**
     * Sets the value of the out1GrpYearOutGrmYearCustomerPositionExpenses00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOut1GrpYearOutGrmYearCustomerPositionExpenses00(BigDecimal value) {
        this.out1GrpYearOutGrmYearCustomerPositionExpenses00 = value;
    }

    /**
     * Gets the value of the out1GrpYearOutGrmYearCustomerPositionCommission00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOut1GrpYearOutGrmYearCustomerPositionCommission00() {
        return out1GrpYearOutGrmYearCustomerPositionCommission00;
    }

    /**
     * Sets the value of the out1GrpYearOutGrmYearCustomerPositionCommission00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOut1GrpYearOutGrmYearCustomerPositionCommission00(BigDecimal value) {
        this.out1GrpYearOutGrmYearCustomerPositionCommission00 = value;
    }

}
