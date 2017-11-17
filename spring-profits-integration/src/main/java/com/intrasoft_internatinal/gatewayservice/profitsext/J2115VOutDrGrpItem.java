
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for J2115VOutDrGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="J2115VOutDrGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutDrGrpOutDrGroupFstDemandExtraitDebitCreditFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrGrpOutDrGroupFstDemandExtraitEntryAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDrGrpOutDrGroupFstDemandExtraitIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDrGrpOutDrGroupIefSuppliedCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDrGrpOutDrGroupJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "J2115VOutDrGrpItem", propOrder = {
    "outDrGrpOutDrGroupFstDemandExtraitDebitCreditFlag",
    "outDrGrpOutDrGroupFstDemandExtraitEntryAmount",
    "outDrGrpOutDrGroupFstDemandExtraitIdJustific",
    "outDrGrpOutDrGroupIefSuppliedCount",
    "outDrGrpOutDrGroupJustificDescription"
})
public class J2115VOutDrGrpItem {

    @XmlElement(name = "OutDrGrpOutDrGroupFstDemandExtraitDebitCreditFlag")
    protected String outDrGrpOutDrGroupFstDemandExtraitDebitCreditFlag;
    @XmlElement(name = "OutDrGrpOutDrGroupFstDemandExtraitEntryAmount", required = true)
    protected BigDecimal outDrGrpOutDrGroupFstDemandExtraitEntryAmount;
    @XmlElement(name = "OutDrGrpOutDrGroupFstDemandExtraitIdJustific")
    protected int outDrGrpOutDrGroupFstDemandExtraitIdJustific;
    @XmlElement(name = "OutDrGrpOutDrGroupIefSuppliedCount")
    protected int outDrGrpOutDrGroupIefSuppliedCount;
    @XmlElement(name = "OutDrGrpOutDrGroupJustificDescription")
    protected String outDrGrpOutDrGroupJustificDescription;

    /**
     * Gets the value of the outDrGrpOutDrGroupFstDemandExtraitDebitCreditFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrGrpOutDrGroupFstDemandExtraitDebitCreditFlag() {
        return outDrGrpOutDrGroupFstDemandExtraitDebitCreditFlag;
    }

    /**
     * Sets the value of the outDrGrpOutDrGroupFstDemandExtraitDebitCreditFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrGrpOutDrGroupFstDemandExtraitDebitCreditFlag(String value) {
        this.outDrGrpOutDrGroupFstDemandExtraitDebitCreditFlag = value;
    }

    /**
     * Gets the value of the outDrGrpOutDrGroupFstDemandExtraitEntryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDrGrpOutDrGroupFstDemandExtraitEntryAmount() {
        return outDrGrpOutDrGroupFstDemandExtraitEntryAmount;
    }

    /**
     * Sets the value of the outDrGrpOutDrGroupFstDemandExtraitEntryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDrGrpOutDrGroupFstDemandExtraitEntryAmount(BigDecimal value) {
        this.outDrGrpOutDrGroupFstDemandExtraitEntryAmount = value;
    }

    /**
     * Gets the value of the outDrGrpOutDrGroupFstDemandExtraitIdJustific property.
     * 
     */
    public int getOutDrGrpOutDrGroupFstDemandExtraitIdJustific() {
        return outDrGrpOutDrGroupFstDemandExtraitIdJustific;
    }

    /**
     * Sets the value of the outDrGrpOutDrGroupFstDemandExtraitIdJustific property.
     * 
     */
    public void setOutDrGrpOutDrGroupFstDemandExtraitIdJustific(int value) {
        this.outDrGrpOutDrGroupFstDemandExtraitIdJustific = value;
    }

    /**
     * Gets the value of the outDrGrpOutDrGroupIefSuppliedCount property.
     * 
     */
    public int getOutDrGrpOutDrGroupIefSuppliedCount() {
        return outDrGrpOutDrGroupIefSuppliedCount;
    }

    /**
     * Sets the value of the outDrGrpOutDrGroupIefSuppliedCount property.
     * 
     */
    public void setOutDrGrpOutDrGroupIefSuppliedCount(int value) {
        this.outDrGrpOutDrGroupIefSuppliedCount = value;
    }

    /**
     * Gets the value of the outDrGrpOutDrGroupJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrGrpOutDrGroupJustificDescription() {
        return outDrGrpOutDrGroupJustificDescription;
    }

    /**
     * Sets the value of the outDrGrpOutDrGroupJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrGrpOutDrGroupJustificDescription(String value) {
        this.outDrGrpOutDrGroupJustificDescription = value;
    }

}
