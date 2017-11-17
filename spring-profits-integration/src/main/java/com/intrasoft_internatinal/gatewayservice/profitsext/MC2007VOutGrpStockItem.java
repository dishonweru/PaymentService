
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MC2007VOutGrpStockItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MC2007VOutGrpStockItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpStockOutGrmStockCollateralTableAccountCd2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpStockOutGrmStockCollateralTableAmount1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpStockOutGrmStockCollateralTableAmount2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpStockOutGrmStockCollateralTableDescr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpStockOutGrmStockCollateralTableDescr6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpStockOutGrmStockCollateralTableDescr7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpStockOutGrmStockCollateralTableEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpStockOutGrmStockCollateralTableInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpStockOutGrmStockCollateralTablePrftSystem2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpStockOutGrmStockCollateralTableProfitsAccount2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "MC2007VOutGrpStockItem", propOrder = {
    "outGrpStockOutGrmStockCollateralTableAccountCd2",
    "outGrpStockOutGrmStockCollateralTableAmount1",
    "outGrpStockOutGrmStockCollateralTableAmount2",
    "outGrpStockOutGrmStockCollateralTableDescr1",
    "outGrpStockOutGrmStockCollateralTableDescr6",
    "outGrpStockOutGrmStockCollateralTableDescr7",
    "outGrpStockOutGrmStockCollateralTableEntryStatus",
    "outGrpStockOutGrmStockCollateralTableInternalSn",
    "outGrpStockOutGrmStockCollateralTablePrftSystem2",
    "outGrpStockOutGrmStockCollateralTableProfitsAccount2",
    "outGrpStockOutGrmStockCollateralTableRecordDescr",
    "outGrpStockOutGrmStockCollateralTableRecordType"
})
public class MC2007VOutGrpStockItem {

    @XmlElement(name = "OutGrpStockOutGrmStockCollateralTableAccountCd2")
    protected short outGrpStockOutGrmStockCollateralTableAccountCd2;
    @XmlElement(name = "OutGrpStockOutGrmStockCollateralTableAmount1", required = true)
    protected BigDecimal outGrpStockOutGrmStockCollateralTableAmount1;
    @XmlElement(name = "OutGrpStockOutGrmStockCollateralTableAmount2", required = true)
    protected BigDecimal outGrpStockOutGrmStockCollateralTableAmount2;
    @XmlElement(name = "OutGrpStockOutGrmStockCollateralTableDescr1")
    protected String outGrpStockOutGrmStockCollateralTableDescr1;
    @XmlElement(name = "OutGrpStockOutGrmStockCollateralTableDescr6")
    protected String outGrpStockOutGrmStockCollateralTableDescr6;
    @XmlElement(name = "OutGrpStockOutGrmStockCollateralTableDescr7")
    protected String outGrpStockOutGrmStockCollateralTableDescr7;
    @XmlElement(name = "OutGrpStockOutGrmStockCollateralTableEntryStatus")
    protected String outGrpStockOutGrmStockCollateralTableEntryStatus;
    @XmlElement(name = "OutGrpStockOutGrmStockCollateralTableInternalSn")
    protected double outGrpStockOutGrmStockCollateralTableInternalSn;
    @XmlElement(name = "OutGrpStockOutGrmStockCollateralTablePrftSystem2")
    protected short outGrpStockOutGrmStockCollateralTablePrftSystem2;
    @XmlElement(name = "OutGrpStockOutGrmStockCollateralTableProfitsAccount2")
    protected String outGrpStockOutGrmStockCollateralTableProfitsAccount2;
    @XmlElement(name = "OutGrpStockOutGrmStockCollateralTableRecordDescr")
    protected String outGrpStockOutGrmStockCollateralTableRecordDescr;
    @XmlElement(name = "OutGrpStockOutGrmStockCollateralTableRecordType")
    protected String outGrpStockOutGrmStockCollateralTableRecordType;

    /**
     * Gets the value of the outGrpStockOutGrmStockCollateralTableAccountCd2 property.
     * 
     */
    public short getOutGrpStockOutGrmStockCollateralTableAccountCd2() {
        return outGrpStockOutGrmStockCollateralTableAccountCd2;
    }

    /**
     * Sets the value of the outGrpStockOutGrmStockCollateralTableAccountCd2 property.
     * 
     */
    public void setOutGrpStockOutGrmStockCollateralTableAccountCd2(short value) {
        this.outGrpStockOutGrmStockCollateralTableAccountCd2 = value;
    }

    /**
     * Gets the value of the outGrpStockOutGrmStockCollateralTableAmount1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpStockOutGrmStockCollateralTableAmount1() {
        return outGrpStockOutGrmStockCollateralTableAmount1;
    }

    /**
     * Sets the value of the outGrpStockOutGrmStockCollateralTableAmount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpStockOutGrmStockCollateralTableAmount1(BigDecimal value) {
        this.outGrpStockOutGrmStockCollateralTableAmount1 = value;
    }

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
     * Gets the value of the outGrpStockOutGrmStockCollateralTableDescr6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpStockOutGrmStockCollateralTableDescr6() {
        return outGrpStockOutGrmStockCollateralTableDescr6;
    }

    /**
     * Sets the value of the outGrpStockOutGrmStockCollateralTableDescr6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpStockOutGrmStockCollateralTableDescr6(String value) {
        this.outGrpStockOutGrmStockCollateralTableDescr6 = value;
    }

    /**
     * Gets the value of the outGrpStockOutGrmStockCollateralTableDescr7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpStockOutGrmStockCollateralTableDescr7() {
        return outGrpStockOutGrmStockCollateralTableDescr7;
    }

    /**
     * Sets the value of the outGrpStockOutGrmStockCollateralTableDescr7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpStockOutGrmStockCollateralTableDescr7(String value) {
        this.outGrpStockOutGrmStockCollateralTableDescr7 = value;
    }

    /**
     * Gets the value of the outGrpStockOutGrmStockCollateralTableEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpStockOutGrmStockCollateralTableEntryStatus() {
        return outGrpStockOutGrmStockCollateralTableEntryStatus;
    }

    /**
     * Sets the value of the outGrpStockOutGrmStockCollateralTableEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpStockOutGrmStockCollateralTableEntryStatus(String value) {
        this.outGrpStockOutGrmStockCollateralTableEntryStatus = value;
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
     * Gets the value of the outGrpStockOutGrmStockCollateralTablePrftSystem2 property.
     * 
     */
    public short getOutGrpStockOutGrmStockCollateralTablePrftSystem2() {
        return outGrpStockOutGrmStockCollateralTablePrftSystem2;
    }

    /**
     * Sets the value of the outGrpStockOutGrmStockCollateralTablePrftSystem2 property.
     * 
     */
    public void setOutGrpStockOutGrmStockCollateralTablePrftSystem2(short value) {
        this.outGrpStockOutGrmStockCollateralTablePrftSystem2 = value;
    }

    /**
     * Gets the value of the outGrpStockOutGrmStockCollateralTableProfitsAccount2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpStockOutGrmStockCollateralTableProfitsAccount2() {
        return outGrpStockOutGrmStockCollateralTableProfitsAccount2;
    }

    /**
     * Sets the value of the outGrpStockOutGrmStockCollateralTableProfitsAccount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpStockOutGrmStockCollateralTableProfitsAccount2(String value) {
        this.outGrpStockOutGrmStockCollateralTableProfitsAccount2 = value;
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
