
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for A1904VOutGrpAdviceDetailItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="A1904VOutGrpAdviceDetailItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpAdviceDetailOutGrmAdviceDetailAmnParametricRuleWorkAdviceSeq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpAdviceDetailOutGrmAdviceDetailAmnParametricRuleWorkAmountDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAdviceDetailOutGrmAdviceDetailAmnParametricRuleWorkResultAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAdviceDetailOutGrmAdviceDetailCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpAdviceDetailOutGrmAdviceDetailCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "A1904VOutGrpAdviceDetailItem", propOrder = {
    "outGrpAdviceDetailOutGrmAdviceDetailAmnParametricRuleWorkAdviceSeq",
    "outGrpAdviceDetailOutGrmAdviceDetailAmnParametricRuleWorkAmountDescription",
    "outGrpAdviceDetailOutGrmAdviceDetailAmnParametricRuleWorkResultAmount",
    "outGrpAdviceDetailOutGrmAdviceDetailCurrencyIdCurrency",
    "outGrpAdviceDetailOutGrmAdviceDetailCurrencyShortDescr"
})
public class A1904VOutGrpAdviceDetailItem {

    @XmlElement(name = "OutGrpAdviceDetailOutGrmAdviceDetailAmnParametricRuleWorkAdviceSeq")
    protected short outGrpAdviceDetailOutGrmAdviceDetailAmnParametricRuleWorkAdviceSeq;
    @XmlElement(name = "OutGrpAdviceDetailOutGrmAdviceDetailAmnParametricRuleWorkAmountDescription")
    protected String outGrpAdviceDetailOutGrmAdviceDetailAmnParametricRuleWorkAmountDescription;
    @XmlElement(name = "OutGrpAdviceDetailOutGrmAdviceDetailAmnParametricRuleWorkResultAmount", required = true)
    protected BigDecimal outGrpAdviceDetailOutGrmAdviceDetailAmnParametricRuleWorkResultAmount;
    @XmlElement(name = "OutGrpAdviceDetailOutGrmAdviceDetailCurrencyIdCurrency")
    protected int outGrpAdviceDetailOutGrmAdviceDetailCurrencyIdCurrency;
    @XmlElement(name = "OutGrpAdviceDetailOutGrmAdviceDetailCurrencyShortDescr")
    protected String outGrpAdviceDetailOutGrmAdviceDetailCurrencyShortDescr;

    /**
     * Gets the value of the outGrpAdviceDetailOutGrmAdviceDetailAmnParametricRuleWorkAdviceSeq property.
     * 
     */
    public short getOutGrpAdviceDetailOutGrmAdviceDetailAmnParametricRuleWorkAdviceSeq() {
        return outGrpAdviceDetailOutGrmAdviceDetailAmnParametricRuleWorkAdviceSeq;
    }

    /**
     * Sets the value of the outGrpAdviceDetailOutGrmAdviceDetailAmnParametricRuleWorkAdviceSeq property.
     * 
     */
    public void setOutGrpAdviceDetailOutGrmAdviceDetailAmnParametricRuleWorkAdviceSeq(short value) {
        this.outGrpAdviceDetailOutGrmAdviceDetailAmnParametricRuleWorkAdviceSeq = value;
    }

    /**
     * Gets the value of the outGrpAdviceDetailOutGrmAdviceDetailAmnParametricRuleWorkAmountDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAdviceDetailOutGrmAdviceDetailAmnParametricRuleWorkAmountDescription() {
        return outGrpAdviceDetailOutGrmAdviceDetailAmnParametricRuleWorkAmountDescription;
    }

    /**
     * Sets the value of the outGrpAdviceDetailOutGrmAdviceDetailAmnParametricRuleWorkAmountDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAdviceDetailOutGrmAdviceDetailAmnParametricRuleWorkAmountDescription(String value) {
        this.outGrpAdviceDetailOutGrmAdviceDetailAmnParametricRuleWorkAmountDescription = value;
    }

    /**
     * Gets the value of the outGrpAdviceDetailOutGrmAdviceDetailAmnParametricRuleWorkResultAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAdviceDetailOutGrmAdviceDetailAmnParametricRuleWorkResultAmount() {
        return outGrpAdviceDetailOutGrmAdviceDetailAmnParametricRuleWorkResultAmount;
    }

    /**
     * Sets the value of the outGrpAdviceDetailOutGrmAdviceDetailAmnParametricRuleWorkResultAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAdviceDetailOutGrmAdviceDetailAmnParametricRuleWorkResultAmount(BigDecimal value) {
        this.outGrpAdviceDetailOutGrmAdviceDetailAmnParametricRuleWorkResultAmount = value;
    }

    /**
     * Gets the value of the outGrpAdviceDetailOutGrmAdviceDetailCurrencyIdCurrency property.
     * 
     */
    public int getOutGrpAdviceDetailOutGrmAdviceDetailCurrencyIdCurrency() {
        return outGrpAdviceDetailOutGrmAdviceDetailCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outGrpAdviceDetailOutGrmAdviceDetailCurrencyIdCurrency property.
     * 
     */
    public void setOutGrpAdviceDetailOutGrmAdviceDetailCurrencyIdCurrency(int value) {
        this.outGrpAdviceDetailOutGrmAdviceDetailCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outGrpAdviceDetailOutGrmAdviceDetailCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAdviceDetailOutGrmAdviceDetailCurrencyShortDescr() {
        return outGrpAdviceDetailOutGrmAdviceDetailCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpAdviceDetailOutGrmAdviceDetailCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAdviceDetailOutGrmAdviceDetailCurrencyShortDescr(String value) {
        this.outGrpAdviceDetailOutGrmAdviceDetailCurrencyShortDescr = value;
    }

}
