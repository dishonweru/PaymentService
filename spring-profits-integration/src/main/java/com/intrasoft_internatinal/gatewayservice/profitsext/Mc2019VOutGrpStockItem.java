
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Mc2019VOutGrpStockItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mc2019VOutGrpStockItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpStockOutGrmStockCollateralTableAmount2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpStockOutGrmStockCollateralTableDescr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpStockOutGrmStockCollateralTableInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpStockOutGrmStockCollateralTableRecordDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpStockOutGrmStockCollateralTableRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mc2019VOutGrpStockItem", propOrder = {
    "outGrpStockOutGrmStockCollateralTableAmount2",
    "outGrpStockOutGrmStockCollateralTableDescr1",
    "outGrpStockOutGrmStockCollateralTableInternalSn",
    "outGrpStockOutGrmStockCollateralTableRecordDescr",
    "outGrpStockOutGrmStockCollateralTableRecordType"
})
public class Mc2019VOutGrpStockItem {

    @XmlElement(name = "OutGrpStockOutGrmStockCollateralTableAmount2", required = true)
    protected BigDecimal outGrpStockOutGrmStockCollateralTableAmount2;
    @XmlElement(name = "OutGrpStockOutGrmStockCollateralTableDescr1")
    protected String outGrpStockOutGrmStockCollateralTableDescr1;
    @XmlElement(name = "OutGrpStockOutGrmStockCollateralTableInternalSn")
    protected double outGrpStockOutGrmStockCollateralTableInternalSn;
    @XmlElement(name = "OutGrpStockOutGrmStockCollateralTableRecordDescr")
    protected String outGrpStockOutGrmStockCollateralTableRecordDescr;
    @XmlElement(name = "OutGrpStockOutGrmStockCollateralTableRecordType")
    protected String outGrpStockOutGrmStockCollateralTableRecordType;

    /**
     * Gets the value of the outGrpStockOutGrmStockCollateralTableAmount2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpStockOutGrmStockCollateralTableAmount2() {
        return outGrpStockOutGrmStockCollateralTableAmount2;
    }

    /**
     * Sets the value of the outGrpStockOutGrmStockCollateralTableAmount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpStockOutGrmStockCollateralTableAmount2(BigDecimal value) {
        this.outGrpStockOutGrmStockCollateralTableAmount2 = value;
    }

    /**
     * Gets the value of the outGrpStockOutGrmStockCollateralTableDescr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpStockOutGrmStockCollateralTableDescr1() {
        return outGrpStockOutGrmStockCollateralTableDescr1;
    }

    /**
     * Sets the value of the outGrpStockOutGrmStockCollateralTableDescr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpStockOutGrmStockCollateralTableDescr1(String value) {
        this.outGrpStockOutGrmStockCollateralTableDescr1 = value;
    }

    /**
     * Gets the value of the outGrpStockOutGrmStockCollateralTableInternalSn property.
     * 
     */
    public double getOutGrpStockOutGrmStockCollateralTableInternalSn() {
        return outGrpStockOutGrmStockCollateralTableInternalSn;
    }

    /**
     * Sets the value of the outGrpStockOutGrmStockCollateralTableInternalSn property.
     * 
     */
    public void setOutGrpStockOutGrmStockCollateralTableInternalSn(double value) {
        this.outGrpStockOutGrmStockCollateralTableInternalSn = value;
    }

    /**
     * Gets the value of the outGrpStockOutGrmStockCollateralTableRecordDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpStockOutGrmStockCollateralTableRecordDescr() {
        return outGrpStockOutGrmStockCollateralTableRecordDescr;
    }

    /**
     * Sets the value of the outGrpStockOutGrmStockCollateralTableRecordDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpStockOutGrmStockCollateralTableRecordDescr(String value) {
        this.outGrpStockOutGrmStockCollateralTableRecordDescr = value;
    }

    /**
     * Gets the value of the outGrpStockOutGrmStockCollateralTableRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpStockOutGrmStockCollateralTableRecordType() {
        return outGrpStockOutGrmStockCollateralTableRecordType;
    }

    /**
     * Sets the value of the outGrpStockOutGrmStockCollateralTableRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpStockOutGrmStockCollateralTableRecordType(String value) {
        this.outGrpStockOutGrmStockCollateralTableRecordType = value;
    }

}
