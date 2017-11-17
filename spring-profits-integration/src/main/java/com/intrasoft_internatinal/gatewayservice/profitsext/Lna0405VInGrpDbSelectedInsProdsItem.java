
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Lna0405VInGrpDbSelectedInsProdsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Lna0405VInGrpDbSelectedInsProdsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpDbSelectedInsProdsInGrmInsuranceVlIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpDbSelectedInsProdsInGrmDbSelectedInsProdsIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodePercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lna0405VInGrpDbSelectedInsProdsItem", propOrder = {
    "inGrpDbSelectedInsProdsInGrmInsuranceVlIefSuppliedAmount",
    "inGrpDbSelectedInsProdsInGrmDbSelectedInsProdsIefSuppliedSelectChar",
    "inGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdId",
    "inGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodePercentage",
    "inGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdDescr"
})
public class Lna0405VInGrpDbSelectedInsProdsItem {

    @XmlElement(name = "InGrpDbSelectedInsProdsInGrmInsuranceVlIefSuppliedAmount", required = true)
    protected BigDecimal inGrpDbSelectedInsProdsInGrmInsuranceVlIefSuppliedAmount;
    @XmlElement(name = "InGrpDbSelectedInsProdsInGrmDbSelectedInsProdsIefSuppliedSelectChar")
    protected String inGrpDbSelectedInsProdsInGrmDbSelectedInsProdsIefSuppliedSelectChar;
    @XmlElement(name = "InGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdId")
    protected int inGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdId;
    @XmlElement(name = "InGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodePercentage", required = true)
    protected BigDecimal inGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodePercentage;
    @XmlElement(name = "InGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdDescr")
    protected String inGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdDescr;

    /**
     * Gets the value of the inGrpDbSelectedInsProdsInGrmInsuranceVlIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpDbSelectedInsProdsInGrmInsuranceVlIefSuppliedAmount() {
        return inGrpDbSelectedInsProdsInGrmInsuranceVlIefSuppliedAmount;
    }

    /**
     * Sets the value of the inGrpDbSelectedInsProdsInGrmInsuranceVlIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpDbSelectedInsProdsInGrmInsuranceVlIefSuppliedAmount(BigDecimal value) {
        this.inGrpDbSelectedInsProdsInGrmInsuranceVlIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the inGrpDbSelectedInsProdsInGrmDbSelectedInsProdsIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpDbSelectedInsProdsInGrmDbSelectedInsProdsIefSuppliedSelectChar() {
        return inGrpDbSelectedInsProdsInGrmDbSelectedInsProdsIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the inGrpDbSelectedInsProdsInGrmDbSelectedInsProdsIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpDbSelectedInsProdsInGrmDbSelectedInsProdsIefSuppliedSelectChar(String value) {
        this.inGrpDbSelectedInsProdsInGrmDbSelectedInsProdsIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the inGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdId property.
     * 
     */
    public int getInGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdId() {
        return inGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdId;
    }

    /**
     * Sets the value of the inGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdId property.
     * 
     */
    public void setInGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdId(int value) {
        this.inGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdId = value;
    }

    /**
     * Gets the value of the inGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodePercentage() {
        return inGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodePercentage;
    }

    /**
     * Sets the value of the inGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodePercentage(BigDecimal value) {
        this.inGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodePercentage = value;
    }

    /**
     * Gets the value of the inGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdDescr() {
        return inGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdDescr;
    }

    /**
     * Sets the value of the inGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdDescr(String value) {
        this.inGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdDescr = value;
    }

}
