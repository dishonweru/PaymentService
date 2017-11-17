
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutGrpAdviceTotalT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpAdviceTotalT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpAdviceTotalOutGrmAdviceTotalCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpAdviceTotalOutGrmAdviceTotalCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkAdviceSeq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkAmountDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkDcInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkResultAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
@XmlType(name = "OutGrpAdviceTotalT", propOrder = {
    "outGrpAdviceTotalOutGrmAdviceTotalCurrencyIdCurrency",
    "outGrpAdviceTotalOutGrmAdviceTotalCurrencyShortDescr",
    "outGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkAdviceSeq",
    "outGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkAmountDescription",
    "outGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkDcInd",
    "outGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkResultAmount",
    "outGrpAdviceTotalOutGrmBaseAmnIefSuppliedAmount",
    "outGrpAdviceTotalOutGrmBaseCurrencyIdCurrency",
    "outGrpAdviceTotalOutGrmBaseCurrencyShortDescr"
})
public class OutGrpAdviceTotalT {

    @XmlElement(name = "OutGrpAdviceTotalOutGrmAdviceTotalCurrencyIdCurrency")
    protected int outGrpAdviceTotalOutGrmAdviceTotalCurrencyIdCurrency;
    @XmlElement(name = "OutGrpAdviceTotalOutGrmAdviceTotalCurrencyShortDescr")
    protected String outGrpAdviceTotalOutGrmAdviceTotalCurrencyShortDescr;
    @XmlElement(name = "OutGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkAdviceSeq")
    protected short outGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkAdviceSeq;
    @XmlElement(name = "OutGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkAmountDescription")
    protected String outGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkAmountDescription;
    @XmlElement(name = "OutGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkDcInd")
    protected String outGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkDcInd;
    @XmlElement(name = "OutGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkResultAmount", required = true)
    protected BigDecimal outGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkResultAmount;
    @XmlElement(name = "OutGrpAdviceTotalOutGrmBaseAmnIefSuppliedAmount", required = true)
    protected BigDecimal outGrpAdviceTotalOutGrmBaseAmnIefSuppliedAmount;
    @XmlElement(name = "OutGrpAdviceTotalOutGrmBaseCurrencyIdCurrency")
    protected int outGrpAdviceTotalOutGrmBaseCurrencyIdCurrency;
    @XmlElement(name = "OutGrpAdviceTotalOutGrmBaseCurrencyShortDescr")
    protected String outGrpAdviceTotalOutGrmBaseCurrencyShortDescr;

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
     * Gets the value of the outGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkAdviceSeq property.
     * 
     */
    public short getOutGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkAdviceSeq() {
        return outGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkAdviceSeq;
    }

    /**
     * Sets the value of the outGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkAdviceSeq property.
     * 
     */
    public void setOutGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkAdviceSeq(short value) {
        this.outGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkAdviceSeq = value;
    }

    /**
     * Gets the value of the outGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkAmountDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkAmountDescription() {
        return outGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkAmountDescription;
    }

    /**
     * Sets the value of the outGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkAmountDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkAmountDescription(String value) {
        this.outGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkAmountDescription = value;
    }

    /**
     * Gets the value of the outGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkDcInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkDcInd() {
        return outGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkDcInd;
    }

    /**
     * Sets the value of the outGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkDcInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkDcInd(String value) {
        this.outGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkDcInd = value;
    }

    /**
     * Gets the value of the outGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkResultAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkResultAmount() {
        return outGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkResultAmount;
    }

    /**
     * Sets the value of the outGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkResultAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkResultAmount(BigDecimal value) {
        this.outGrpAdviceTotalOutGrmAdviceTotAmnParametricRuleWorkResultAmount = value;
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
