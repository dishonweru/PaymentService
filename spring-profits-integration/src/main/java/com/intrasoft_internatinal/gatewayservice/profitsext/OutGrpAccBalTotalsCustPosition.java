
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutGrpAccBalTotalsCustPosition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpAccBalTotalsCustPosition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpAccBalTotalsOutGrmColRealIefSuppliedNum152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAccBalTotalsOutGrmColTotalsIefSuppliedNum152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAccBalTotalsOutGrmColUnrealIefSuppliedNum152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAccBalTotalsOutGrmDepAvailBalIefSuppliedNum152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAccBalTotalsOutGrmDepBookBalIefSuppliedNum152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAccBalTotalsOutGrmLnsAvailableIefSuppliedNum152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAccBalTotalsOutGrmLnsFundedIefSuppliedNum152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAccBalTotalsOutGrmLnsNonFundedIefSuppliedNum152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAccBalTotalsOutGrmLnsTotalIefSuppliedNum152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpAccBalTotalsCustPosition", propOrder = {
    "outGrpAccBalTotalsOutGrmColRealIefSuppliedNum152",
    "outGrpAccBalTotalsOutGrmColTotalsIefSuppliedNum152",
    "outGrpAccBalTotalsOutGrmColUnrealIefSuppliedNum152",
    "outGrpAccBalTotalsOutGrmDepAvailBalIefSuppliedNum152",
    "outGrpAccBalTotalsOutGrmDepBookBalIefSuppliedNum152",
    "outGrpAccBalTotalsOutGrmLnsAvailableIefSuppliedNum152",
    "outGrpAccBalTotalsOutGrmLnsFundedIefSuppliedNum152",
    "outGrpAccBalTotalsOutGrmLnsNonFundedIefSuppliedNum152",
    "outGrpAccBalTotalsOutGrmLnsTotalIefSuppliedNum152"
})
public class OutGrpAccBalTotalsCustPosition {

    @XmlElement(name = "OutGrpAccBalTotalsOutGrmColRealIefSuppliedNum152", required = true)
    protected BigDecimal outGrpAccBalTotalsOutGrmColRealIefSuppliedNum152;
    @XmlElement(name = "OutGrpAccBalTotalsOutGrmColTotalsIefSuppliedNum152", required = true)
    protected BigDecimal outGrpAccBalTotalsOutGrmColTotalsIefSuppliedNum152;
    @XmlElement(name = "OutGrpAccBalTotalsOutGrmColUnrealIefSuppliedNum152", required = true)
    protected BigDecimal outGrpAccBalTotalsOutGrmColUnrealIefSuppliedNum152;
    @XmlElement(name = "OutGrpAccBalTotalsOutGrmDepAvailBalIefSuppliedNum152", required = true)
    protected BigDecimal outGrpAccBalTotalsOutGrmDepAvailBalIefSuppliedNum152;
    @XmlElement(name = "OutGrpAccBalTotalsOutGrmDepBookBalIefSuppliedNum152", required = true)
    protected BigDecimal outGrpAccBalTotalsOutGrmDepBookBalIefSuppliedNum152;
    @XmlElement(name = "OutGrpAccBalTotalsOutGrmLnsAvailableIefSuppliedNum152", required = true)
    protected BigDecimal outGrpAccBalTotalsOutGrmLnsAvailableIefSuppliedNum152;
    @XmlElement(name = "OutGrpAccBalTotalsOutGrmLnsFundedIefSuppliedNum152", required = true)
    protected BigDecimal outGrpAccBalTotalsOutGrmLnsFundedIefSuppliedNum152;
    @XmlElement(name = "OutGrpAccBalTotalsOutGrmLnsNonFundedIefSuppliedNum152", required = true)
    protected BigDecimal outGrpAccBalTotalsOutGrmLnsNonFundedIefSuppliedNum152;
    @XmlElement(name = "OutGrpAccBalTotalsOutGrmLnsTotalIefSuppliedNum152", required = true)
    protected BigDecimal outGrpAccBalTotalsOutGrmLnsTotalIefSuppliedNum152;

    /**
     * Gets the value of the outGrpAccBalTotalsOutGrmColRealIefSuppliedNum152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAccBalTotalsOutGrmColRealIefSuppliedNum152() {
        return outGrpAccBalTotalsOutGrmColRealIefSuppliedNum152;
    }

    /**
     * Sets the value of the outGrpAccBalTotalsOutGrmColRealIefSuppliedNum152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAccBalTotalsOutGrmColRealIefSuppliedNum152(BigDecimal value) {
        this.outGrpAccBalTotalsOutGrmColRealIefSuppliedNum152 = value;
    }

    /**
     * Gets the value of the outGrpAccBalTotalsOutGrmColTotalsIefSuppliedNum152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAccBalTotalsOutGrmColTotalsIefSuppliedNum152() {
        return outGrpAccBalTotalsOutGrmColTotalsIefSuppliedNum152;
    }

    /**
     * Sets the value of the outGrpAccBalTotalsOutGrmColTotalsIefSuppliedNum152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAccBalTotalsOutGrmColTotalsIefSuppliedNum152(BigDecimal value) {
        this.outGrpAccBalTotalsOutGrmColTotalsIefSuppliedNum152 = value;
    }

    /**
     * Gets the value of the outGrpAccBalTotalsOutGrmColUnrealIefSuppliedNum152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAccBalTotalsOutGrmColUnrealIefSuppliedNum152() {
        return outGrpAccBalTotalsOutGrmColUnrealIefSuppliedNum152;
    }

    /**
     * Sets the value of the outGrpAccBalTotalsOutGrmColUnrealIefSuppliedNum152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAccBalTotalsOutGrmColUnrealIefSuppliedNum152(BigDecimal value) {
        this.outGrpAccBalTotalsOutGrmColUnrealIefSuppliedNum152 = value;
    }

    /**
     * Gets the value of the outGrpAccBalTotalsOutGrmDepAvailBalIefSuppliedNum152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAccBalTotalsOutGrmDepAvailBalIefSuppliedNum152() {
        return outGrpAccBalTotalsOutGrmDepAvailBalIefSuppliedNum152;
    }

    /**
     * Sets the value of the outGrpAccBalTotalsOutGrmDepAvailBalIefSuppliedNum152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAccBalTotalsOutGrmDepAvailBalIefSuppliedNum152(BigDecimal value) {
        this.outGrpAccBalTotalsOutGrmDepAvailBalIefSuppliedNum152 = value;
    }

    /**
     * Gets the value of the outGrpAccBalTotalsOutGrmDepBookBalIefSuppliedNum152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAccBalTotalsOutGrmDepBookBalIefSuppliedNum152() {
        return outGrpAccBalTotalsOutGrmDepBookBalIefSuppliedNum152;
    }

    /**
     * Sets the value of the outGrpAccBalTotalsOutGrmDepBookBalIefSuppliedNum152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAccBalTotalsOutGrmDepBookBalIefSuppliedNum152(BigDecimal value) {
        this.outGrpAccBalTotalsOutGrmDepBookBalIefSuppliedNum152 = value;
    }

    /**
     * Gets the value of the outGrpAccBalTotalsOutGrmLnsAvailableIefSuppliedNum152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAccBalTotalsOutGrmLnsAvailableIefSuppliedNum152() {
        return outGrpAccBalTotalsOutGrmLnsAvailableIefSuppliedNum152;
    }

    /**
     * Sets the value of the outGrpAccBalTotalsOutGrmLnsAvailableIefSuppliedNum152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAccBalTotalsOutGrmLnsAvailableIefSuppliedNum152(BigDecimal value) {
        this.outGrpAccBalTotalsOutGrmLnsAvailableIefSuppliedNum152 = value;
    }

    /**
     * Gets the value of the outGrpAccBalTotalsOutGrmLnsFundedIefSuppliedNum152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAccBalTotalsOutGrmLnsFundedIefSuppliedNum152() {
        return outGrpAccBalTotalsOutGrmLnsFundedIefSuppliedNum152;
    }

    /**
     * Sets the value of the outGrpAccBalTotalsOutGrmLnsFundedIefSuppliedNum152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAccBalTotalsOutGrmLnsFundedIefSuppliedNum152(BigDecimal value) {
        this.outGrpAccBalTotalsOutGrmLnsFundedIefSuppliedNum152 = value;
    }

    /**
     * Gets the value of the outGrpAccBalTotalsOutGrmLnsNonFundedIefSuppliedNum152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAccBalTotalsOutGrmLnsNonFundedIefSuppliedNum152() {
        return outGrpAccBalTotalsOutGrmLnsNonFundedIefSuppliedNum152;
    }

    /**
     * Sets the value of the outGrpAccBalTotalsOutGrmLnsNonFundedIefSuppliedNum152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAccBalTotalsOutGrmLnsNonFundedIefSuppliedNum152(BigDecimal value) {
        this.outGrpAccBalTotalsOutGrmLnsNonFundedIefSuppliedNum152 = value;
    }

    /**
     * Gets the value of the outGrpAccBalTotalsOutGrmLnsTotalIefSuppliedNum152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAccBalTotalsOutGrmLnsTotalIefSuppliedNum152() {
        return outGrpAccBalTotalsOutGrmLnsTotalIefSuppliedNum152;
    }

    /**
     * Sets the value of the outGrpAccBalTotalsOutGrmLnsTotalIefSuppliedNum152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAccBalTotalsOutGrmLnsTotalIefSuppliedNum152(BigDecimal value) {
        this.outGrpAccBalTotalsOutGrmLnsTotalIefSuppliedNum152 = value;
    }

}
