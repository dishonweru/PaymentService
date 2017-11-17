
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutGrpSharesCustPosition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpSharesCustPosition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpSharesOutGrmSharesCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpSharesOutGrmSharesTotactamnIefSuppliedNum152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpSharesOutGrmSharesTotblkamnIefSuppliedNum152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpSharesOutGrmSharesTotfrompurIefSuppliedNum152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpSharesOutGrmSharesTotglamnIefSuppliedNum152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpSharesOutGrmSharesTotnumIefSuppliedNum10" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpSharesOutGrmSharesTotownvalIefSuppliedNum152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpSharesOutGrmSharesTotpurvalIefSuppliedNum152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpSharesCustPosition", propOrder = {
    "outGrpSharesOutGrmSharesCustomerCustId",
    "outGrpSharesOutGrmSharesTotactamnIefSuppliedNum152",
    "outGrpSharesOutGrmSharesTotblkamnIefSuppliedNum152",
    "outGrpSharesOutGrmSharesTotfrompurIefSuppliedNum152",
    "outGrpSharesOutGrmSharesTotglamnIefSuppliedNum152",
    "outGrpSharesOutGrmSharesTotnumIefSuppliedNum10",
    "outGrpSharesOutGrmSharesTotownvalIefSuppliedNum152",
    "outGrpSharesOutGrmSharesTotpurvalIefSuppliedNum152"
})
public class OutGrpSharesCustPosition {

    @XmlElement(name = "OutGrpSharesOutGrmSharesCustomerCustId")
    protected int outGrpSharesOutGrmSharesCustomerCustId;
    @XmlElement(name = "OutGrpSharesOutGrmSharesTotactamnIefSuppliedNum152", required = true)
    protected BigDecimal outGrpSharesOutGrmSharesTotactamnIefSuppliedNum152;
    @XmlElement(name = "OutGrpSharesOutGrmSharesTotblkamnIefSuppliedNum152", required = true)
    protected BigDecimal outGrpSharesOutGrmSharesTotblkamnIefSuppliedNum152;
    @XmlElement(name = "OutGrpSharesOutGrmSharesTotfrompurIefSuppliedNum152", required = true)
    protected BigDecimal outGrpSharesOutGrmSharesTotfrompurIefSuppliedNum152;
    @XmlElement(name = "OutGrpSharesOutGrmSharesTotglamnIefSuppliedNum152", required = true)
    protected BigDecimal outGrpSharesOutGrmSharesTotglamnIefSuppliedNum152;
    @XmlElement(name = "OutGrpSharesOutGrmSharesTotnumIefSuppliedNum10")
    protected double outGrpSharesOutGrmSharesTotnumIefSuppliedNum10;
    @XmlElement(name = "OutGrpSharesOutGrmSharesTotownvalIefSuppliedNum152", required = true)
    protected BigDecimal outGrpSharesOutGrmSharesTotownvalIefSuppliedNum152;
    @XmlElement(name = "OutGrpSharesOutGrmSharesTotpurvalIefSuppliedNum152", required = true)
    protected BigDecimal outGrpSharesOutGrmSharesTotpurvalIefSuppliedNum152;

    /**
     * Gets the value of the outGrpSharesOutGrmSharesCustomerCustId property.
     * 
     */
    public int getOutGrpSharesOutGrmSharesCustomerCustId() {
        return outGrpSharesOutGrmSharesCustomerCustId;
    }

    /**
     * Sets the value of the outGrpSharesOutGrmSharesCustomerCustId property.
     * 
     */
    public void setOutGrpSharesOutGrmSharesCustomerCustId(int value) {
        this.outGrpSharesOutGrmSharesCustomerCustId = value;
    }

    /**
     * Gets the value of the outGrpSharesOutGrmSharesTotactamnIefSuppliedNum152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpSharesOutGrmSharesTotactamnIefSuppliedNum152() {
        return outGrpSharesOutGrmSharesTotactamnIefSuppliedNum152;
    }

    /**
     * Sets the value of the outGrpSharesOutGrmSharesTotactamnIefSuppliedNum152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpSharesOutGrmSharesTotactamnIefSuppliedNum152(BigDecimal value) {
        this.outGrpSharesOutGrmSharesTotactamnIefSuppliedNum152 = value;
    }

    /**
     * Gets the value of the outGrpSharesOutGrmSharesTotblkamnIefSuppliedNum152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpSharesOutGrmSharesTotblkamnIefSuppliedNum152() {
        return outGrpSharesOutGrmSharesTotblkamnIefSuppliedNum152;
    }

    /**
     * Sets the value of the outGrpSharesOutGrmSharesTotblkamnIefSuppliedNum152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpSharesOutGrmSharesTotblkamnIefSuppliedNum152(BigDecimal value) {
        this.outGrpSharesOutGrmSharesTotblkamnIefSuppliedNum152 = value;
    }

    /**
     * Gets the value of the outGrpSharesOutGrmSharesTotfrompurIefSuppliedNum152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpSharesOutGrmSharesTotfrompurIefSuppliedNum152() {
        return outGrpSharesOutGrmSharesTotfrompurIefSuppliedNum152;
    }

    /**
     * Sets the value of the outGrpSharesOutGrmSharesTotfrompurIefSuppliedNum152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpSharesOutGrmSharesTotfrompurIefSuppliedNum152(BigDecimal value) {
        this.outGrpSharesOutGrmSharesTotfrompurIefSuppliedNum152 = value;
    }

    /**
     * Gets the value of the outGrpSharesOutGrmSharesTotglamnIefSuppliedNum152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpSharesOutGrmSharesTotglamnIefSuppliedNum152() {
        return outGrpSharesOutGrmSharesTotglamnIefSuppliedNum152;
    }

    /**
     * Sets the value of the outGrpSharesOutGrmSharesTotglamnIefSuppliedNum152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpSharesOutGrmSharesTotglamnIefSuppliedNum152(BigDecimal value) {
        this.outGrpSharesOutGrmSharesTotglamnIefSuppliedNum152 = value;
    }

    /**
     * Gets the value of the outGrpSharesOutGrmSharesTotnumIefSuppliedNum10 property.
     * 
     */
    public double getOutGrpSharesOutGrmSharesTotnumIefSuppliedNum10() {
        return outGrpSharesOutGrmSharesTotnumIefSuppliedNum10;
    }

    /**
     * Sets the value of the outGrpSharesOutGrmSharesTotnumIefSuppliedNum10 property.
     * 
     */
    public void setOutGrpSharesOutGrmSharesTotnumIefSuppliedNum10(double value) {
        this.outGrpSharesOutGrmSharesTotnumIefSuppliedNum10 = value;
    }

    /**
     * Gets the value of the outGrpSharesOutGrmSharesTotownvalIefSuppliedNum152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpSharesOutGrmSharesTotownvalIefSuppliedNum152() {
        return outGrpSharesOutGrmSharesTotownvalIefSuppliedNum152;
    }

    /**
     * Sets the value of the outGrpSharesOutGrmSharesTotownvalIefSuppliedNum152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpSharesOutGrmSharesTotownvalIefSuppliedNum152(BigDecimal value) {
        this.outGrpSharesOutGrmSharesTotownvalIefSuppliedNum152 = value;
    }

    /**
     * Gets the value of the outGrpSharesOutGrmSharesTotpurvalIefSuppliedNum152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpSharesOutGrmSharesTotpurvalIefSuppliedNum152() {
        return outGrpSharesOutGrmSharesTotpurvalIefSuppliedNum152;
    }

    /**
     * Sets the value of the outGrpSharesOutGrmSharesTotpurvalIefSuppliedNum152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpSharesOutGrmSharesTotpurvalIefSuppliedNum152(BigDecimal value) {
        this.outGrpSharesOutGrmSharesTotpurvalIefSuppliedNum152 = value;
    }

}
