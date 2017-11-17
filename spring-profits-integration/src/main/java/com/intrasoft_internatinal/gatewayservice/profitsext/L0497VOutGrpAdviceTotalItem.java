
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for L0497VOutGrpAdviceTotalItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0497VOutGrpAdviceTotalItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkAdviceSeq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkAmountDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkDcInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkResultAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAdviceTotalOutGrmAdviceTotalCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpAdviceTotalOutGrmAdviceTotalCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAdviceTotalOutGrmBaseAmnIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAdviceTotalOutGrmBaseCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpAdviceTotalOutGrmBaseCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0497VOutGrpAdviceTotalItem", propOrder = {
    "outGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkAdviceSeq",
    "outGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkAmountDescription",
    "outGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkDcInd",
    "outGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkResultAmount",
    "outGrpAdviceTotalOutGrmAdviceTotalCurrencyIdCurrency",
    "outGrpAdviceTotalOutGrmAdviceTotalCurrencyShortDescr",
    "outGrpAdviceTotalOutGrmBaseAmnIefSuppliedAmount",
    "outGrpAdviceTotalOutGrmBaseCurrencyIdCurrency",
    "outGrpAdviceTotalOutGrmBaseCurrencyShortDescr"
})
public class L0497VOutGrpAdviceTotalItem {

    @XmlElement(name = "OutGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkAdviceSeq")
    protected short outGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkAdviceSeq;
    @XmlElement(name = "OutGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkAmountDescription")
    protected String outGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkAmountDescription;
    @XmlElement(name = "OutGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkDcInd")
    protected String outGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkDcInd;
    @XmlElement(name = "OutGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkResultAmount", required = true)
    protected BigDecimal outGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkResultAmount;
    @XmlElement(name = "OutGrpAdviceTotalOutGrmAdviceTotalCurrencyIdCurrency")
    protected int outGrpAdviceTotalOutGrmAdviceTotalCurrencyIdCurrency;
    @XmlElement(name = "OutGrpAdviceTotalOutGrmAdviceTotalCurrencyShortDescr")
    protected String outGrpAdviceTotalOutGrmAdviceTotalCurrencyShortDescr;
    @XmlElement(name = "OutGrpAdviceTotalOutGrmBaseAmnIefSuppliedAmount", required = true)
    protected BigDecimal outGrpAdviceTotalOutGrmBaseAmnIefSuppliedAmount;
    @XmlElement(name = "OutGrpAdviceTotalOutGrmBaseCurrencyIdCurrency")
    protected int outGrpAdviceTotalOutGrmBaseCurrencyIdCurrency;
    @XmlElement(name = "OutGrpAdviceTotalOutGrmBaseCurrencyShortDescr")
    protected String outGrpAdviceTotalOutGrmBaseCurrencyShortDescr;

    /**
     * Gets the value of the outGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkAdviceSeq property.
     * 
     */
    public short getOutGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkAdviceSeq() {
        return outGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkAdviceSeq;
    }

    /**
     * Sets the value of the outGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkAdviceSeq property.
     * 
     */
    public void setOutGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkAdviceSeq(short value) {
        this.outGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkAdviceSeq = value;
    }

    /**
     * Gets the value of the outGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkAmountDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkAmountDescription() {
        return outGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkAmountDescription;
    }

    /**
     * Sets the value of the outGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkAmountDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkAmountDescription(String value) {
        this.outGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkAmountDescription = value;
    }

    /**
     * Gets the value of the outGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkDcInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkDcInd() {
        return outGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkDcInd;
    }

    /**
     * Sets the value of the outGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkDcInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkDcInd(String value) {
        this.outGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkDcInd = value;
    }

    /**
     * Gets the value of the outGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkResultAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkResultAmount() {
        return outGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkResultAmount;
    }

    /**
     * Sets the value of the outGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkResultAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkResultAmount(BigDecimal value) {
        this.outGrpAdviceTotalOutGrmAdviceTotalAmnParametricRuleWorkResultAmount = value;
    }

    /**
     * Gets the value of the outGrpAdviceTotalOutGrmAdviceTotalCurrencyIdCurrency property.
     * 
     */
    public int getOutGrpAdviceTotalOutGrmAdviceTotalCurrencyIdCurrency() {
        return outGrpAdviceTotalOutGrmAdviceTotalCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outGrpAdviceTotalOutGrmAdviceTotalCurrencyIdCurrency property.
     * 
     */
    public void setOutGrpAdviceTotalOutGrmAdviceTotalCurrencyIdCurrency(int value) {
        this.outGrpAdviceTotalOutGrmAdviceTotalCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outGrpAdviceTotalOutGrmAdviceTotalCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAdviceTotalOutGrmAdviceTotalCurrencyShortDescr() {
        return outGrpAdviceTotalOutGrmAdviceTotalCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpAdviceTotalOutGrmAdviceTotalCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAdviceTotalOutGrmAdviceTotalCurrencyShortDescr(String value) {
        this.outGrpAdviceTotalOutGrmAdviceTotalCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGrpAdviceTotalOutGrmBaseAmnIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAdviceTotalOutGrmBaseAmnIefSuppliedAmount() {
        return outGrpAdviceTotalOutGrmBaseAmnIefSuppliedAmount;
    }

    /**
     * Sets the value of the outGrpAdviceTotalOutGrmBaseAmnIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAdviceTotalOutGrmBaseAmnIefSuppliedAmount(BigDecimal value) {
        this.outGrpAdviceTotalOutGrmBaseAmnIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the outGrpAdviceTotalOutGrmBaseCurrencyIdCurrency property.
     * 
     */
    public int getOutGrpAdviceTotalOutGrmBaseCurrencyIdCurrency() {
        return outGrpAdviceTotalOutGrmBaseCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outGrpAdviceTotalOutGrmBaseCurrencyIdCurrency property.
     * 
     */
    public void setOutGrpAdviceTotalOutGrmBaseCurrencyIdCurrency(int value) {
        this.outGrpAdviceTotalOutGrmBaseCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outGrpAdviceTotalOutGrmBaseCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAdviceTotalOutGrmBaseCurrencyShortDescr() {
        return outGrpAdviceTotalOutGrmBaseCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpAdviceTotalOutGrmBaseCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAdviceTotalOutGrmBaseCurrencyShortDescr(String value) {
        this.outGrpAdviceTotalOutGrmBaseCurrencyShortDescr = value;
    }

}
