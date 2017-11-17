
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for L0449VOutGrpOtherCollExtraItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0449VOutGrpOtherCollExtraItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpOtherCollOutGrmOtherColDebtManageCollateralType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOtherCollOutGrmOtherColDebtManageOpenMarketValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOtherCollOutGrmOtherColDebtManageSecurityValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOtherCollOutGrmOtherColDebtManageCollateralId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOtherCollOutGrmOtherColDebtManageCollateralTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0449VOutGrpOtherCollExtraItem", propOrder = {
    "outGrpOtherCollOutGrmOtherColDebtManageCollateralType",
    "outGrpOtherCollOutGrmOtherColDebtManageOpenMarketValue",
    "outGrpOtherCollOutGrmOtherColDebtManageSecurityValue",
    "outGrpOtherCollOutGrmOtherColDebtManageCollateralId",
    "outGrpOtherCollOutGrmOtherColDebtManageCollateralTypeId"
})
public class L0449VOutGrpOtherCollExtraItem {

    @XmlElement(name = "OutGrpOtherCollOutGrmOtherColDebtManageCollateralType")
    protected String outGrpOtherCollOutGrmOtherColDebtManageCollateralType;
    @XmlElement(name = "OutGrpOtherCollOutGrmOtherColDebtManageOpenMarketValue", required = true)
    protected BigDecimal outGrpOtherCollOutGrmOtherColDebtManageOpenMarketValue;
    @XmlElement(name = "OutGrpOtherCollOutGrmOtherColDebtManageSecurityValue", required = true)
    protected BigDecimal outGrpOtherCollOutGrmOtherColDebtManageSecurityValue;
    @XmlElement(name = "OutGrpOtherCollOutGrmOtherColDebtManageCollateralId")
    protected double outGrpOtherCollOutGrmOtherColDebtManageCollateralId;
    @XmlElement(name = "OutGrpOtherCollOutGrmOtherColDebtManageCollateralTypeId")
    protected int outGrpOtherCollOutGrmOtherColDebtManageCollateralTypeId;

    /**
     * Gets the value of the outGrpOtherCollOutGrmOtherColDebtManageCollateralType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOtherCollOutGrmOtherColDebtManageCollateralType() {
        return outGrpOtherCollOutGrmOtherColDebtManageCollateralType;
    }

    /**
     * Sets the value of the outGrpOtherCollOutGrmOtherColDebtManageCollateralType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOtherCollOutGrmOtherColDebtManageCollateralType(String value) {
        this.outGrpOtherCollOutGrmOtherColDebtManageCollateralType = value;
    }

    /**
     * Gets the value of the outGrpOtherCollOutGrmOtherColDebtManageOpenMarketValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOtherCollOutGrmOtherColDebtManageOpenMarketValue() {
        return outGrpOtherCollOutGrmOtherColDebtManageOpenMarketValue;
    }

    /**
     * Sets the value of the outGrpOtherCollOutGrmOtherColDebtManageOpenMarketValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOtherCollOutGrmOtherColDebtManageOpenMarketValue(BigDecimal value) {
        this.outGrpOtherCollOutGrmOtherColDebtManageOpenMarketValue = value;
    }

    /**
     * Gets the value of the outGrpOtherCollOutGrmOtherColDebtManageSecurityValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOtherCollOutGrmOtherColDebtManageSecurityValue() {
        return outGrpOtherCollOutGrmOtherColDebtManageSecurityValue;
    }

    /**
     * Sets the value of the outGrpOtherCollOutGrmOtherColDebtManageSecurityValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOtherCollOutGrmOtherColDebtManageSecurityValue(BigDecimal value) {
        this.outGrpOtherCollOutGrmOtherColDebtManageSecurityValue = value;
    }

    /**
     * Gets the value of the outGrpOtherCollOutGrmOtherColDebtManageCollateralId property.
     * 
     */
    public double getOutGrpOtherCollOutGrmOtherColDebtManageCollateralId() {
        return outGrpOtherCollOutGrmOtherColDebtManageCollateralId;
    }

    /**
     * Sets the value of the outGrpOtherCollOutGrmOtherColDebtManageCollateralId property.
     * 
     */
    public void setOutGrpOtherCollOutGrmOtherColDebtManageCollateralId(double value) {
        this.outGrpOtherCollOutGrmOtherColDebtManageCollateralId = value;
    }

    /**
     * Gets the value of the outGrpOtherCollOutGrmOtherColDebtManageCollateralTypeId property.
     * 
     */
    public int getOutGrpOtherCollOutGrmOtherColDebtManageCollateralTypeId() {
        return outGrpOtherCollOutGrmOtherColDebtManageCollateralTypeId;
    }

    /**
     * Sets the value of the outGrpOtherCollOutGrmOtherColDebtManageCollateralTypeId property.
     * 
     */
    public void setOutGrpOtherCollOutGrmOtherColDebtManageCollateralTypeId(int value) {
        this.outGrpOtherCollOutGrmOtherColDebtManageCollateralTypeId = value;
    }

}
