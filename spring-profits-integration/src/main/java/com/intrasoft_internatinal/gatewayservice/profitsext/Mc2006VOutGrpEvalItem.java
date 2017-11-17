
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Mc2006VOutGrpEvalItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mc2006VOutGrpEvalItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpEvalOutGrm1IefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpEvalOutGrm1RealEstateApprslCommercValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpEvalOutGrm1RealEstateApprslEstInsurAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpEvalOutGrm1RealEstateApprslEstRentalIncAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpEvalOutGrm1RealEstateApprslEvaluationDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpEvalOutGrm1RealEstateApprslEvaluator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpEvalOutGrm1RealEstateApprslInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpEvalOutGrm1RealEstateApprslInvestmentAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpEvalOutGrm1RealEstateApprslMortgageValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpEvalOutGrm1RealEstateApprslObjectiveAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpEvalOutGrm1RealEstateApprslPricePerMeter" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpEvalOutGrm1RealEstateApprslSellValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mc2006VOutGrpEvalItem", propOrder = {
    "outGrpEvalOutGrm1IefSuppliedSelectChar",
    "outGrpEvalOutGrm1RealEstateApprslCommercValue",
    "outGrpEvalOutGrm1RealEstateApprslEstInsurAmn",
    "outGrpEvalOutGrm1RealEstateApprslEstRentalIncAmn",
    "outGrpEvalOutGrm1RealEstateApprslEvaluationDt",
    "outGrpEvalOutGrm1RealEstateApprslEvaluator",
    "outGrpEvalOutGrm1RealEstateApprslInternalSn",
    "outGrpEvalOutGrm1RealEstateApprslInvestmentAmn",
    "outGrpEvalOutGrm1RealEstateApprslMortgageValue",
    "outGrpEvalOutGrm1RealEstateApprslObjectiveAmn",
    "outGrpEvalOutGrm1RealEstateApprslPricePerMeter",
    "outGrpEvalOutGrm1RealEstateApprslSellValue"
})
public class Mc2006VOutGrpEvalItem {

    @XmlElement(name = "OutGrpEvalOutGrm1IefSuppliedSelectChar")
    protected String outGrpEvalOutGrm1IefSuppliedSelectChar;
    @XmlElement(name = "OutGrpEvalOutGrm1RealEstateApprslCommercValue", required = true)
    protected BigDecimal outGrpEvalOutGrm1RealEstateApprslCommercValue;
    @XmlElement(name = "OutGrpEvalOutGrm1RealEstateApprslEstInsurAmn", required = true)
    protected BigDecimal outGrpEvalOutGrm1RealEstateApprslEstInsurAmn;
    @XmlElement(name = "OutGrpEvalOutGrm1RealEstateApprslEstRentalIncAmn", required = true)
    protected BigDecimal outGrpEvalOutGrm1RealEstateApprslEstRentalIncAmn;
    @XmlElement(name = "OutGrpEvalOutGrm1RealEstateApprslEvaluationDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpEvalOutGrm1RealEstateApprslEvaluationDt;
    @XmlElement(name = "OutGrpEvalOutGrm1RealEstateApprslEvaluator")
    protected String outGrpEvalOutGrm1RealEstateApprslEvaluator;
    @XmlElement(name = "OutGrpEvalOutGrm1RealEstateApprslInternalSn")
    protected double outGrpEvalOutGrm1RealEstateApprslInternalSn;
    @XmlElement(name = "OutGrpEvalOutGrm1RealEstateApprslInvestmentAmn", required = true)
    protected BigDecimal outGrpEvalOutGrm1RealEstateApprslInvestmentAmn;
    @XmlElement(name = "OutGrpEvalOutGrm1RealEstateApprslMortgageValue", required = true)
    protected BigDecimal outGrpEvalOutGrm1RealEstateApprslMortgageValue;
    @XmlElement(name = "OutGrpEvalOutGrm1RealEstateApprslObjectiveAmn", required = true)
    protected BigDecimal outGrpEvalOutGrm1RealEstateApprslObjectiveAmn;
    @XmlElement(name = "OutGrpEvalOutGrm1RealEstateApprslPricePerMeter", required = true)
    protected BigDecimal outGrpEvalOutGrm1RealEstateApprslPricePerMeter;
    @XmlElement(name = "OutGrpEvalOutGrm1RealEstateApprslSellValue", required = true)
    protected BigDecimal outGrpEvalOutGrm1RealEstateApprslSellValue;

    /**
     * Gets the value of the outGrpEvalOutGrm1IefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpEvalOutGrm1IefSuppliedSelectChar() {
        return outGrpEvalOutGrm1IefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpEvalOutGrm1IefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpEvalOutGrm1IefSuppliedSelectChar(String value) {
        this.outGrpEvalOutGrm1IefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpEvalOutGrm1RealEstateApprslCommercValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpEvalOutGrm1RealEstateApprslCommercValue() {
        return outGrpEvalOutGrm1RealEstateApprslCommercValue;
    }

    /**
     * Sets the value of the outGrpEvalOutGrm1RealEstateApprslCommercValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpEvalOutGrm1RealEstateApprslCommercValue(BigDecimal value) {
        this.outGrpEvalOutGrm1RealEstateApprslCommercValue = value;
    }

    /**
     * Gets the value of the outGrpEvalOutGrm1RealEstateApprslEstInsurAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpEvalOutGrm1RealEstateApprslEstInsurAmn() {
        return outGrpEvalOutGrm1RealEstateApprslEstInsurAmn;
    }

    /**
     * Sets the value of the outGrpEvalOutGrm1RealEstateApprslEstInsurAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpEvalOutGrm1RealEstateApprslEstInsurAmn(BigDecimal value) {
        this.outGrpEvalOutGrm1RealEstateApprslEstInsurAmn = value;
    }

    /**
     * Gets the value of the outGrpEvalOutGrm1RealEstateApprslEstRentalIncAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpEvalOutGrm1RealEstateApprslEstRentalIncAmn() {
        return outGrpEvalOutGrm1RealEstateApprslEstRentalIncAmn;
    }

    /**
     * Sets the value of the outGrpEvalOutGrm1RealEstateApprslEstRentalIncAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpEvalOutGrm1RealEstateApprslEstRentalIncAmn(BigDecimal value) {
        this.outGrpEvalOutGrm1RealEstateApprslEstRentalIncAmn = value;
    }

    /**
     * Gets the value of the outGrpEvalOutGrm1RealEstateApprslEvaluationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpEvalOutGrm1RealEstateApprslEvaluationDt() {
        return outGrpEvalOutGrm1RealEstateApprslEvaluationDt;
    }

    /**
     * Sets the value of the outGrpEvalOutGrm1RealEstateApprslEvaluationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpEvalOutGrm1RealEstateApprslEvaluationDt(XMLGregorianCalendar value) {
        this.outGrpEvalOutGrm1RealEstateApprslEvaluationDt = value;
    }

    /**
     * Gets the value of the outGrpEvalOutGrm1RealEstateApprslEvaluator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpEvalOutGrm1RealEstateApprslEvaluator() {
        return outGrpEvalOutGrm1RealEstateApprslEvaluator;
    }

    /**
     * Sets the value of the outGrpEvalOutGrm1RealEstateApprslEvaluator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpEvalOutGrm1RealEstateApprslEvaluator(String value) {
        this.outGrpEvalOutGrm1RealEstateApprslEvaluator = value;
    }

    /**
     * Gets the value of the outGrpEvalOutGrm1RealEstateApprslInternalSn property.
     * 
     */
    public double getOutGrpEvalOutGrm1RealEstateApprslInternalSn() {
        return outGrpEvalOutGrm1RealEstateApprslInternalSn;
    }

    /**
     * Sets the value of the outGrpEvalOutGrm1RealEstateApprslInternalSn property.
     * 
     */
    public void setOutGrpEvalOutGrm1RealEstateApprslInternalSn(double value) {
        this.outGrpEvalOutGrm1RealEstateApprslInternalSn = value;
    }

    /**
     * Gets the value of the outGrpEvalOutGrm1RealEstateApprslInvestmentAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpEvalOutGrm1RealEstateApprslInvestmentAmn() {
        return outGrpEvalOutGrm1RealEstateApprslInvestmentAmn;
    }

    /**
     * Sets the value of the outGrpEvalOutGrm1RealEstateApprslInvestmentAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpEvalOutGrm1RealEstateApprslInvestmentAmn(BigDecimal value) {
        this.outGrpEvalOutGrm1RealEstateApprslInvestmentAmn = value;
    }

    /**
     * Gets the value of the outGrpEvalOutGrm1RealEstateApprslMortgageValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpEvalOutGrm1RealEstateApprslMortgageValue() {
        return outGrpEvalOutGrm1RealEstateApprslMortgageValue;
    }

    /**
     * Sets the value of the outGrpEvalOutGrm1RealEstateApprslMortgageValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpEvalOutGrm1RealEstateApprslMortgageValue(BigDecimal value) {
        this.outGrpEvalOutGrm1RealEstateApprslMortgageValue = value;
    }

    /**
     * Gets the value of the outGrpEvalOutGrm1RealEstateApprslObjectiveAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpEvalOutGrm1RealEstateApprslObjectiveAmn() {
        return outGrpEvalOutGrm1RealEstateApprslObjectiveAmn;
    }

    /**
     * Sets the value of the outGrpEvalOutGrm1RealEstateApprslObjectiveAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpEvalOutGrm1RealEstateApprslObjectiveAmn(BigDecimal value) {
        this.outGrpEvalOutGrm1RealEstateApprslObjectiveAmn = value;
    }

    /**
     * Gets the value of the outGrpEvalOutGrm1RealEstateApprslPricePerMeter property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpEvalOutGrm1RealEstateApprslPricePerMeter() {
        return outGrpEvalOutGrm1RealEstateApprslPricePerMeter;
    }

    /**
     * Sets the value of the outGrpEvalOutGrm1RealEstateApprslPricePerMeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpEvalOutGrm1RealEstateApprslPricePerMeter(BigDecimal value) {
        this.outGrpEvalOutGrm1RealEstateApprslPricePerMeter = value;
    }

    /**
     * Gets the value of the outGrpEvalOutGrm1RealEstateApprslSellValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpEvalOutGrm1RealEstateApprslSellValue() {
        return outGrpEvalOutGrm1RealEstateApprslSellValue;
    }

    /**
     * Sets the value of the outGrpEvalOutGrm1RealEstateApprslSellValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpEvalOutGrm1RealEstateApprslSellValue(BigDecimal value) {
        this.outGrpEvalOutGrm1RealEstateApprslSellValue = value;
    }

}
