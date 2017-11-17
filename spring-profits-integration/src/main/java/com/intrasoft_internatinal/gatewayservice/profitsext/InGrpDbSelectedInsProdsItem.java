
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InGrpDbSelectedInsProdsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InGrpDbSelectedInsProdsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpDbSelectedInsProdsInGrmInsuranceValueIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InGrpDbSelectedInsProdsItem", propOrder = {
    "inGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdId",
    "inGrpDbSelectedInsProdsInGrmInsuranceValueIefSuppliedAmount"
})
public class InGrpDbSelectedInsProdsItem {

    @XmlElement(name = "InGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdId")
    protected int inGrpDbSelectedInsProdsInGrmDbSelectedInsProdsInsurProdCodeProdId;
    @XmlElement(name = "InGrpDbSelectedInsProdsInGrmInsuranceValueIefSuppliedAmount", required = true)
    protected BigDecimal inGrpDbSelectedInsProdsInGrmInsuranceValueIefSuppliedAmount;

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
     * Gets the value of the inGrpDbSelectedInsProdsInGrmInsuranceValueIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpDbSelectedInsProdsInGrmInsuranceValueIefSuppliedAmount() {
        return inGrpDbSelectedInsProdsInGrmInsuranceValueIefSuppliedAmount;
    }

    /**
     * Sets the value of the inGrpDbSelectedInsProdsInGrmInsuranceValueIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpDbSelectedInsProdsInGrmInsuranceValueIefSuppliedAmount(BigDecimal value) {
        this.inGrpDbSelectedInsProdsInGrmInsuranceValueIefSuppliedAmount = value;
    }

}
