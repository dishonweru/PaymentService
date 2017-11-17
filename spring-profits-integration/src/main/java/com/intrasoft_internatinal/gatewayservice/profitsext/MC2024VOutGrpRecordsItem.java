
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MC2024VOutGrpRecordsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MC2024VOutGrpRecordsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpRecordsOutGrmCollateralTableCollateralUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRecordsOutGrmCollateralTableEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRecordsOutGrmCollateralTableInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpRecordsOutGrmCollateralTableRecordDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRecordsOutGrmCollateralTableTagSetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRecordsOutGrmPrenAmnIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpRecordsOutGrmCollateralTableUsedCollatSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpRecordsOutGrmCollateralTableUsedUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpRecordsOutGrmCollateralTableUsedCollatType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MC2024VOutGrpRecordsItem", propOrder = {
    "outGrpRecordsOutGrmCollateralTableCollateralUsage",
    "outGrpRecordsOutGrmCollateralTableEntryStatus",
    "outGrpRecordsOutGrmCollateralTableInternalSn",
    "outGrpRecordsOutGrmCollateralTableRecordDescr",
    "outGrpRecordsOutGrmCollateralTableTagSetCode",
    "outGrpRecordsOutGrmPrenAmnIefSuppliedNumber152",
    "outGrpRecordsOutGrmCollateralTableUsedCollatSn",
    "outGrpRecordsOutGrmCollateralTableUsedUnit",
    "outGrpRecordsOutGrmCollateralTableUsedCollatType"
})
public class MC2024VOutGrpRecordsItem {

    @XmlElement(name = "OutGrpRecordsOutGrmCollateralTableCollateralUsage")
    protected String outGrpRecordsOutGrmCollateralTableCollateralUsage;
    @XmlElement(name = "OutGrpRecordsOutGrmCollateralTableEntryStatus")
    protected String outGrpRecordsOutGrmCollateralTableEntryStatus;
    @XmlElement(name = "OutGrpRecordsOutGrmCollateralTableInternalSn")
    protected double outGrpRecordsOutGrmCollateralTableInternalSn;
    @XmlElement(name = "OutGrpRecordsOutGrmCollateralTableRecordDescr")
    protected String outGrpRecordsOutGrmCollateralTableRecordDescr;
    @XmlElement(name = "OutGrpRecordsOutGrmCollateralTableTagSetCode")
    protected String outGrpRecordsOutGrmCollateralTableTagSetCode;
    @XmlElement(name = "OutGrpRecordsOutGrmPrenAmnIefSuppliedNumber152", required = true)
    protected BigDecimal outGrpRecordsOutGrmPrenAmnIefSuppliedNumber152;
    @XmlElement(name = "OutGrpRecordsOutGrmCollateralTableUsedCollatSn")
    protected double outGrpRecordsOutGrmCollateralTableUsedCollatSn;
    @XmlElement(name = "OutGrpRecordsOutGrmCollateralTableUsedUnit")
    protected int outGrpRecordsOutGrmCollateralTableUsedUnit;
    @XmlElement(name = "OutGrpRecordsOutGrmCollateralTableUsedCollatType")
    protected int outGrpRecordsOutGrmCollateralTableUsedCollatType;

    /**
     * Gets the value of the outGrpRecordsOutGrmCollateralTableCollateralUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRecordsOutGrmCollateralTableCollateralUsage() {
        return outGrpRecordsOutGrmCollateralTableCollateralUsage;
    }

    /**
     * Sets the value of the outGrpRecordsOutGrmCollateralTableCollateralUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRecordsOutGrmCollateralTableCollateralUsage(String value) {
        this.outGrpRecordsOutGrmCollateralTableCollateralUsage = value;
    }

    /**
     * Gets the value of the outGrpRecordsOutGrmCollateralTableEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRecordsOutGrmCollateralTableEntryStatus() {
        return outGrpRecordsOutGrmCollateralTableEntryStatus;
    }

    /**
     * Sets the value of the outGrpRecordsOutGrmCollateralTableEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRecordsOutGrmCollateralTableEntryStatus(String value) {
        this.outGrpRecordsOutGrmCollateralTableEntryStatus = value;
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

    /**
     * Gets the value of the outGrpRecordsOutGrmCollateralTableTagSetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRecordsOutGrmCollateralTableTagSetCode() {
        return outGrpRecordsOutGrmCollateralTableTagSetCode;
    }

    /**
     * Sets the value of the outGrpRecordsOutGrmCollateralTableTagSetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRecordsOutGrmCollateralTableTagSetCode(String value) {
        this.outGrpRecordsOutGrmCollateralTableTagSetCode = value;
    }

    /**
     * Gets the value of the outGrpRecordsOutGrmPrenAmnIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpRecordsOutGrmPrenAmnIefSuppliedNumber152() {
        return outGrpRecordsOutGrmPrenAmnIefSuppliedNumber152;
    }

    /**
     * Sets the value of the outGrpRecordsOutGrmPrenAmnIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpRecordsOutGrmPrenAmnIefSuppliedNumber152(BigDecimal value) {
        this.outGrpRecordsOutGrmPrenAmnIefSuppliedNumber152 = value;
    }

    /**
     * Gets the value of the outGrpRecordsOutGrmCollateralTableUsedCollatSn property.
     * 
     */
    public double getOutGrpRecordsOutGrmCollateralTableUsedCollatSn() {
        return outGrpRecordsOutGrmCollateralTableUsedCollatSn;
    }

    /**
     * Sets the value of the outGrpRecordsOutGrmCollateralTableUsedCollatSn property.
     * 
     */
    public void setOutGrpRecordsOutGrmCollateralTableUsedCollatSn(double value) {
        this.outGrpRecordsOutGrmCollateralTableUsedCollatSn = value;
    }

    /**
     * Gets the value of the outGrpRecordsOutGrmCollateralTableUsedUnit property.
     * 
     */
    public int getOutGrpRecordsOutGrmCollateralTableUsedUnit() {
        return outGrpRecordsOutGrmCollateralTableUsedUnit;
    }

    /**
     * Sets the value of the outGrpRecordsOutGrmCollateralTableUsedUnit property.
     * 
     */
    public void setOutGrpRecordsOutGrmCollateralTableUsedUnit(int value) {
        this.outGrpRecordsOutGrmCollateralTableUsedUnit = value;
    }

    /**
     * Gets the value of the outGrpRecordsOutGrmCollateralTableUsedCollatType property.
     * 
     */
    public int getOutGrpRecordsOutGrmCollateralTableUsedCollatType() {
        return outGrpRecordsOutGrmCollateralTableUsedCollatType;
    }

    /**
     * Sets the value of the outGrpRecordsOutGrmCollateralTableUsedCollatType property.
     * 
     */
    public void setOutGrpRecordsOutGrmCollateralTableUsedCollatType(int value) {
        this.outGrpRecordsOutGrmCollateralTableUsedCollatType = value;
    }

}
