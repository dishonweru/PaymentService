
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for G0501VOutGrpCostDetItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="G0501VOutGrpCostDetItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpCostDetOutGrvCostDetGlgCostPartitionDifference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCostDetOutGrvCostDetGlgCostPartitionPercent" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpCostDetOutGrvCostDetGlgCostProfitCeCostId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCostDetOutGrvCostDetGlgCostProfitCeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCostDetOutGrvCostDetIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "G0501VOutGrpCostDetItem", propOrder = {
    "outGrpCostDetOutGrvCostDetGlgCostPartitionDifference",
    "outGrpCostDetOutGrvCostDetGlgCostPartitionPercent",
    "outGrpCostDetOutGrvCostDetGlgCostProfitCeCostId",
    "outGrpCostDetOutGrvCostDetGlgCostProfitCeDescription",
    "outGrpCostDetOutGrvCostDetIefSuppliedSelectChar"
})
public class G0501VOutGrpCostDetItem {

    @XmlElement(name = "OutGrpCostDetOutGrvCostDetGlgCostPartitionDifference")
    protected String outGrpCostDetOutGrvCostDetGlgCostPartitionDifference;
    @XmlElement(name = "OutGrpCostDetOutGrvCostDetGlgCostPartitionPercent", required = true)
    protected BigDecimal outGrpCostDetOutGrvCostDetGlgCostPartitionPercent;
    @XmlElement(name = "OutGrpCostDetOutGrvCostDetGlgCostProfitCeCostId")
    protected String outGrpCostDetOutGrvCostDetGlgCostProfitCeCostId;
    @XmlElement(name = "OutGrpCostDetOutGrvCostDetGlgCostProfitCeDescription")
    protected String outGrpCostDetOutGrvCostDetGlgCostProfitCeDescription;
    @XmlElement(name = "OutGrpCostDetOutGrvCostDetIefSuppliedSelectChar")
    protected String outGrpCostDetOutGrvCostDetIefSuppliedSelectChar;

    /**
     * Gets the value of the outGrpCostDetOutGrvCostDetGlgCostPartitionDifference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCostDetOutGrvCostDetGlgCostPartitionDifference() {
        return outGrpCostDetOutGrvCostDetGlgCostPartitionDifference;
    }

    /**
     * Sets the value of the outGrpCostDetOutGrvCostDetGlgCostPartitionDifference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCostDetOutGrvCostDetGlgCostPartitionDifference(String value) {
        this.outGrpCostDetOutGrvCostDetGlgCostPartitionDifference = value;
    }

    /**
     * Gets the value of the outGrpCostDetOutGrvCostDetGlgCostPartitionPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpCostDetOutGrvCostDetGlgCostPartitionPercent() {
        return outGrpCostDetOutGrvCostDetGlgCostPartitionPercent;
    }

    /**
     * Sets the value of the outGrpCostDetOutGrvCostDetGlgCostPartitionPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpCostDetOutGrvCostDetGlgCostPartitionPercent(BigDecimal value) {
        this.outGrpCostDetOutGrvCostDetGlgCostPartitionPercent = value;
    }

    /**
     * Gets the value of the outGrpCostDetOutGrvCostDetGlgCostProfitCeCostId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCostDetOutGrvCostDetGlgCostProfitCeCostId() {
        return outGrpCostDetOutGrvCostDetGlgCostProfitCeCostId;
    }

    /**
     * Sets the value of the outGrpCostDetOutGrvCostDetGlgCostProfitCeCostId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCostDetOutGrvCostDetGlgCostProfitCeCostId(String value) {
        this.outGrpCostDetOutGrvCostDetGlgCostProfitCeCostId = value;
    }

    /**
     * Gets the value of the outGrpCostDetOutGrvCostDetGlgCostProfitCeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCostDetOutGrvCostDetGlgCostProfitCeDescription() {
        return outGrpCostDetOutGrvCostDetGlgCostProfitCeDescription;
    }

    /**
     * Sets the value of the outGrpCostDetOutGrvCostDetGlgCostProfitCeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCostDetOutGrvCostDetGlgCostProfitCeDescription(String value) {
        this.outGrpCostDetOutGrvCostDetGlgCostProfitCeDescription = value;
    }

    /**
     * Gets the value of the outGrpCostDetOutGrvCostDetIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCostDetOutGrvCostDetIefSuppliedSelectChar() {
        return outGrpCostDetOutGrvCostDetIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpCostDetOutGrvCostDetIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCostDetOutGrvCostDetIefSuppliedSelectChar(String value) {
        this.outGrpCostDetOutGrvCostDetIefSuppliedSelectChar = value;
    }

}
