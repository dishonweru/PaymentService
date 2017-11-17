
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MC2028VOutGrpRecordsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MC2028VOutGrpRecordsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpRecordsOutGrmCollateralTableAmount1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpRecordsOutGrmCollateralTableDescr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRecordsOutGrmCollateralTableInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpRecordsOutGrmCollateralTableRecordDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MC2028VOutGrpRecordsItem", propOrder = {
    "outGrpRecordsOutGrmCollateralTableAmount1",
    "outGrpRecordsOutGrmCollateralTableDescr1",
    "outGrpRecordsOutGrmCollateralTableInternalSn",
    "outGrpRecordsOutGrmCollateralTableRecordDescr"
})
public class MC2028VOutGrpRecordsItem {

    @XmlElement(name = "OutGrpRecordsOutGrmCollateralTableAmount1", required = true)
    protected BigDecimal outGrpRecordsOutGrmCollateralTableAmount1;
    @XmlElement(name = "OutGrpRecordsOutGrmCollateralTableDescr1")
    protected String outGrpRecordsOutGrmCollateralTableDescr1;
    @XmlElement(name = "OutGrpRecordsOutGrmCollateralTableInternalSn")
    protected double outGrpRecordsOutGrmCollateralTableInternalSn;
    @XmlElement(name = "OutGrpRecordsOutGrmCollateralTableRecordDescr")
    protected String outGrpRecordsOutGrmCollateralTableRecordDescr;

    /**
     * Gets the value of the outGrpRecordsOutGrmCollateralTableAmount1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpRecordsOutGrmCollateralTableAmount1() {
        return outGrpRecordsOutGrmCollateralTableAmount1;
    }

    /**
     * Sets the value of the outGrpRecordsOutGrmCollateralTableAmount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpRecordsOutGrmCollateralTableAmount1(BigDecimal value) {
        this.outGrpRecordsOutGrmCollateralTableAmount1 = value;
    }

    /**
     * Gets the value of the outGrpRecordsOutGrmCollateralTableDescr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRecordsOutGrmCollateralTableDescr1() {
        return outGrpRecordsOutGrmCollateralTableDescr1;
    }

    /**
     * Sets the value of the outGrpRecordsOutGrmCollateralTableDescr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRecordsOutGrmCollateralTableDescr1(String value) {
        this.outGrpRecordsOutGrmCollateralTableDescr1 = value;
    }

    /**
     * Gets the value of the outGrpRecordsOutGrmCollateralTableInternalSn property.
     * 
     */
    public double getOutGrpRecordsOutGrmCollateralTableInternalSn() {
        return outGrpRecordsOutGrmCollateralTableInternalSn;
    }

    /**
     * Sets the value of the outGrpRecordsOutGrmCollateralTableInternalSn property.
     * 
     */
    public void setOutGrpRecordsOutGrmCollateralTableInternalSn(double value) {
        this.outGrpRecordsOutGrmCollateralTableInternalSn = value;
    }

    /**
     * Gets the value of the outGrpRecordsOutGrmCollateralTableRecordDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRecordsOutGrmCollateralTableRecordDescr() {
        return outGrpRecordsOutGrmCollateralTableRecordDescr;
    }

    /**
     * Sets the value of the outGrpRecordsOutGrmCollateralTableRecordDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRecordsOutGrmCollateralTableRecordDescr(String value) {
        this.outGrpRecordsOutGrmCollateralTableRecordDescr = value;
    }

}
