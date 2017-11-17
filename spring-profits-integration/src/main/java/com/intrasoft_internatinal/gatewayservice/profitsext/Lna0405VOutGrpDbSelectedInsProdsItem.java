
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Lna0405VOutGrpDbSelectedInsProdsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Lna0405VOutGrpDbSelectedInsProdsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpDbSelectedInsProdsInGrmInsuranceVlIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpDbSelectedInsProdsInGrmDbSelectedInsProdsIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodePercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lna0405VOutGrpDbSelectedInsProdsItem", propOrder = {
    "outGrpDbSelectedInsProdsInGrmInsuranceVlIefSuppliedAmount",
    "outGrpDbSelectedInsProdsInGrmDbSelectedInsProdsIefSuppliedSelectChar",
    "outGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdId",
    "outGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodePercentage",
    "outGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdDescr"
})
public class Lna0405VOutGrpDbSelectedInsProdsItem {

    @XmlElement(name = "OutGrpDbSelectedInsProdsInGrmInsuranceVlIefSuppliedAmount", required = true)
    protected BigDecimal outGrpDbSelectedInsProdsInGrmInsuranceVlIefSuppliedAmount;
    @XmlElement(name = "OutGrpDbSelectedInsProdsInGrmDbSelectedInsProdsIefSuppliedSelectChar")
    protected String outGrpDbSelectedInsProdsInGrmDbSelectedInsProdsIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdId")
    protected int outGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdId;
    @XmlElement(name = "OutGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodePercentage", required = true)
    protected BigDecimal outGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodePercentage;
    @XmlElement(name = "OutGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdDescr")
    protected String outGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdDescr;

    /**
     * Gets the value of the outGrpDbSelectedInsProdsInGrmInsuranceVlIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpDbSelectedInsProdsInGrmInsuranceVlIefSuppliedAmount() {
        return outGrpDbSelectedInsProdsInGrmInsuranceVlIefSuppliedAmount;
    }

    /**
     * Sets the value of the outGrpDbSelectedInsProdsInGrmInsuranceVlIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpDbSelectedInsProdsInGrmInsuranceVlIefSuppliedAmount(BigDecimal value) {
        this.outGrpDbSelectedInsProdsInGrmInsuranceVlIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the outGrpDbSelectedInsProdsInGrmDbSelectedInsProdsIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDbSelectedInsProdsInGrmDbSelectedInsProdsIefSuppliedSelectChar() {
        return outGrpDbSelectedInsProdsInGrmDbSelectedInsProdsIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpDbSelectedInsProdsInGrmDbSelectedInsProdsIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDbSelectedInsProdsInGrmDbSelectedInsProdsIefSuppliedSelectChar(String value) {
        this.outGrpDbSelectedInsProdsInGrmDbSelectedInsProdsIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdId property.
     * 
     */
    public int getOutGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdId() {
        return outGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdId;
    }

    /**
     * Sets the value of the outGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdId property.
     * 
     */
    public void setOutGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdId(int value) {
        this.outGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdId = value;
    }

    /**
     * Gets the value of the outGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodePercentage() {
        return outGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodePercentage;
    }

    /**
     * Sets the value of the outGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodePercentage(BigDecimal value) {
        this.outGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodePercentage = value;
    }

    /**
     * Gets the value of the outGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdDescr() {
        return outGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdDescr;
    }

    /**
     * Sets the value of the outGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdDescr(String value) {
        this.outGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdDescr = value;
    }

}
