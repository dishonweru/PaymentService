
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FEXS01OutDetailGroupItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FEXS01OutDetailGroupItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutDetailGroupChargesIefSuppliedChar40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDetailGroupChargesIefSuppliedFinalCharges" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDetailGroupChargesTaxIefSuppliedChar40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDetailGroupChargesTaxIefSuppliedGenAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDetailGroupCommissionsIefSuppliedChar40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDetailGroupCommissionsIefSuppliedFinalCommission" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDetailGroupOutComTaxIefSuppliedChar40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDetailGroupOutComTaxIefSuppliedGenAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FEXS01OutDetailGroupItem", propOrder = {
    "outDetailGroupChargesIefSuppliedChar40",
    "outDetailGroupChargesIefSuppliedFinalCharges",
    "outDetailGroupChargesTaxIefSuppliedChar40",
    "outDetailGroupChargesTaxIefSuppliedGenAmount",
    "outDetailGroupCommissionsIefSuppliedChar40",
    "outDetailGroupCommissionsIefSuppliedFinalCommission",
    "outDetailGroupOutComTaxIefSuppliedChar40",
    "outDetailGroupOutComTaxIefSuppliedGenAmount"
})
public class FEXS01OutDetailGroupItem {

    @XmlElement(name = "OutDetailGroupChargesIefSuppliedChar40")
    protected String outDetailGroupChargesIefSuppliedChar40;
    @XmlElement(name = "OutDetailGroupChargesIefSuppliedFinalCharges", required = true)
    protected BigDecimal outDetailGroupChargesIefSuppliedFinalCharges;
    @XmlElement(name = "OutDetailGroupChargesTaxIefSuppliedChar40")
    protected String outDetailGroupChargesTaxIefSuppliedChar40;
    @XmlElement(name = "OutDetailGroupChargesTaxIefSuppliedGenAmount", required = true)
    protected BigDecimal outDetailGroupChargesTaxIefSuppliedGenAmount;
    @XmlElement(name = "OutDetailGroupCommissionsIefSuppliedChar40")
    protected String outDetailGroupCommissionsIefSuppliedChar40;
    @XmlElement(name = "OutDetailGroupCommissionsIefSuppliedFinalCommission", required = true)
    protected BigDecimal outDetailGroupCommissionsIefSuppliedFinalCommission;
    @XmlElement(name = "OutDetailGroupOutComTaxIefSuppliedChar40")
    protected String outDetailGroupOutComTaxIefSuppliedChar40;
    @XmlElement(name = "OutDetailGroupOutComTaxIefSuppliedGenAmount", required = true)
    protected BigDecimal outDetailGroupOutComTaxIefSuppliedGenAmount;

    /**
     * Gets the value of the outDetailGroupChargesIefSuppliedChar40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDetailGroupChargesIefSuppliedChar40() {
        return outDetailGroupChargesIefSuppliedChar40;
    }

    /**
     * Sets the value of the outDetailGroupChargesIefSuppliedChar40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDetailGroupChargesIefSuppliedChar40(String value) {
        this.outDetailGroupChargesIefSuppliedChar40 = value;
    }

    /**
     * Gets the value of the outDetailGroupChargesIefSuppliedFinalCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDetailGroupChargesIefSuppliedFinalCharges() {
        return outDetailGroupChargesIefSuppliedFinalCharges;
    }

    /**
     * Sets the value of the outDetailGroupChargesIefSuppliedFinalCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDetailGroupChargesIefSuppliedFinalCharges(BigDecimal value) {
        this.outDetailGroupChargesIefSuppliedFinalCharges = value;
    }

    /**
     * Gets the value of the outDetailGroupChargesTaxIefSuppliedChar40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDetailGroupChargesTaxIefSuppliedChar40() {
        return outDetailGroupChargesTaxIefSuppliedChar40;
    }

    /**
     * Sets the value of the outDetailGroupChargesTaxIefSuppliedChar40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDetailGroupChargesTaxIefSuppliedChar40(String value) {
        this.outDetailGroupChargesTaxIefSuppliedChar40 = value;
    }

    /**
     * Gets the value of the outDetailGroupChargesTaxIefSuppliedGenAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDetailGroupChargesTaxIefSuppliedGenAmount() {
        return outDetailGroupChargesTaxIefSuppliedGenAmount;
    }

    /**
     * Sets the value of the outDetailGroupChargesTaxIefSuppliedGenAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDetailGroupChargesTaxIefSuppliedGenAmount(BigDecimal value) {
        this.outDetailGroupChargesTaxIefSuppliedGenAmount = value;
    }

    /**
     * Gets the value of the outDetailGroupCommissionsIefSuppliedChar40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDetailGroupCommissionsIefSuppliedChar40() {
        return outDetailGroupCommissionsIefSuppliedChar40;
    }

    /**
     * Sets the value of the outDetailGroupCommissionsIefSuppliedChar40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDetailGroupCommissionsIefSuppliedChar40(String value) {
        this.outDetailGroupCommissionsIefSuppliedChar40 = value;
    }

    /**
     * Gets the value of the outDetailGroupCommissionsIefSuppliedFinalCommission property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDetailGroupCommissionsIefSuppliedFinalCommission() {
        return outDetailGroupCommissionsIefSuppliedFinalCommission;
    }

    /**
     * Sets the value of the outDetailGroupCommissionsIefSuppliedFinalCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDetailGroupCommissionsIefSuppliedFinalCommission(BigDecimal value) {
        this.outDetailGroupCommissionsIefSuppliedFinalCommission = value;
    }

    /**
     * Gets the value of the outDetailGroupOutComTaxIefSuppliedChar40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDetailGroupOutComTaxIefSuppliedChar40() {
        return outDetailGroupOutComTaxIefSuppliedChar40;
    }

    /**
     * Sets the value of the outDetailGroupOutComTaxIefSuppliedChar40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDetailGroupOutComTaxIefSuppliedChar40(String value) {
        this.outDetailGroupOutComTaxIefSuppliedChar40 = value;
    }

    /**
     * Gets the value of the outDetailGroupOutComTaxIefSuppliedGenAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDetailGroupOutComTaxIefSuppliedGenAmount() {
        return outDetailGroupOutComTaxIefSuppliedGenAmount;
    }

    /**
     * Sets the value of the outDetailGroupOutComTaxIefSuppliedGenAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDetailGroupOutComTaxIefSuppliedGenAmount(BigDecimal value) {
        this.outDetailGroupOutComTaxIefSuppliedGenAmount = value;
    }

}
