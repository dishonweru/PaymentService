
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MC2029VOutGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MC2029VOutGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpOutGrmCollateralTableAccountCd2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmCollateralTableAmount1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmCollateralTableAmount2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmCollateralTableDescr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmCollateralTableEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmCollateralTableInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmCollateralTablePrftSystem2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmCollateralTableProfitsAccount2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmCollateralTableRecordDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmCollateralTableRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmCollateralTableTagSetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmPfgTagSetSetupDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MC2029VOutGrpItem", propOrder = {
    "outGrpOutGrmCollateralTableAccountCd2",
    "outGrpOutGrmCollateralTableAmount1",
    "outGrpOutGrmCollateralTableAmount2",
    "outGrpOutGrmCollateralTableDescr1",
    "outGrpOutGrmCollateralTableEntryStatus",
    "outGrpOutGrmCollateralTableInternalSn",
    "outGrpOutGrmCollateralTablePrftSystem2",
    "outGrpOutGrmCollateralTableProfitsAccount2",
    "outGrpOutGrmCollateralTableRecordDescr",
    "outGrpOutGrmCollateralTableRecordType",
    "outGrpOutGrmCollateralTableTagSetCode",
    "outGrpOutGrmPfgTagSetSetupDescription"
})
public class MC2029VOutGrpItem {

    @XmlElement(name = "OutGrpOutGrmCollateralTableAccountCd2")
    protected short outGrpOutGrmCollateralTableAccountCd2;
    @XmlElement(name = "OutGrpOutGrmCollateralTableAmount1", required = true)
    protected BigDecimal outGrpOutGrmCollateralTableAmount1;
    @XmlElement(name = "OutGrpOutGrmCollateralTableAmount2", required = true)
    protected BigDecimal outGrpOutGrmCollateralTableAmount2;
    @XmlElement(name = "OutGrpOutGrmCollateralTableDescr1")
    protected String outGrpOutGrmCollateralTableDescr1;
    @XmlElement(name = "OutGrpOutGrmCollateralTableEntryStatus")
    protected String outGrpOutGrmCollateralTableEntryStatus;
    @XmlElement(name = "OutGrpOutGrmCollateralTableInternalSn")
    protected double outGrpOutGrmCollateralTableInternalSn;
    @XmlElement(name = "OutGrpOutGrmCollateralTablePrftSystem2")
    protected short outGrpOutGrmCollateralTablePrftSystem2;
    @XmlElement(name = "OutGrpOutGrmCollateralTableProfitsAccount2")
    protected String outGrpOutGrmCollateralTableProfitsAccount2;
    @XmlElement(name = "OutGrpOutGrmCollateralTableRecordDescr")
    protected String outGrpOutGrmCollateralTableRecordDescr;
    @XmlElement(name = "OutGrpOutGrmCollateralTableRecordType")
    protected String outGrpOutGrmCollateralTableRecordType;
    @XmlElement(name = "OutGrpOutGrmCollateralTableTagSetCode")
    protected String outGrpOutGrmCollateralTableTagSetCode;
    @XmlElement(name = "OutGrpOutGrmPfgTagSetSetupDescription")
    protected String outGrpOutGrmPfgTagSetSetupDescription;

    /**
     * Gets the value of the outGrpOutGrmCollateralTableAccountCd2 property.
     * 
     */
    public short getOutGrpOutGrmCollateralTableAccountCd2() {
        return outGrpOutGrmCollateralTableAccountCd2;
    }

    /**
     * Sets the value of the outGrpOutGrmCollateralTableAccountCd2 property.
     * 
     */
    public void setOutGrpOutGrmCollateralTableAccountCd2(short value) {
        this.outGrpOutGrmCollateralTableAccountCd2 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCollateralTableAmount1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmCollateralTableAmount1() {
        return outGrpOutGrmCollateralTableAmount1;
    }

    /**
     * Sets the value of the outGrpOutGrmCollateralTableAmount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmCollateralTableAmount1(BigDecimal value) {
        this.outGrpOutGrmCollateralTableAmount1 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCollateralTableAmount2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmCollateralTableAmount2() {
        return outGrpOutGrmCollateralTableAmount2;
    }

    /**
     * Sets the value of the outGrpOutGrmCollateralTableAmount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmCollateralTableAmount2(BigDecimal value) {
        this.outGrpOutGrmCollateralTableAmount2 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCollateralTableDescr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmCollateralTableDescr1() {
        return outGrpOutGrmCollateralTableDescr1;
    }

    /**
     * Sets the value of the outGrpOutGrmCollateralTableDescr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmCollateralTableDescr1(String value) {
        this.outGrpOutGrmCollateralTableDescr1 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCollateralTableEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmCollateralTableEntryStatus() {
        return outGrpOutGrmCollateralTableEntryStatus;
    }

    /**
     * Sets the value of the outGrpOutGrmCollateralTableEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmCollateralTableEntryStatus(String value) {
        this.outGrpOutGrmCollateralTableEntryStatus = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCollateralTableInternalSn property.
     * 
     */
    public double getOutGrpOutGrmCollateralTableInternalSn() {
        return outGrpOutGrmCollateralTableInternalSn;
    }

    /**
     * Sets the value of the outGrpOutGrmCollateralTableInternalSn property.
     * 
     */
    public void setOutGrpOutGrmCollateralTableInternalSn(double value) {
        this.outGrpOutGrmCollateralTableInternalSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCollateralTablePrftSystem2 property.
     * 
     */
    public short getOutGrpOutGrmCollateralTablePrftSystem2() {
        return outGrpOutGrmCollateralTablePrftSystem2;
    }

    /**
     * Sets the value of the outGrpOutGrmCollateralTablePrftSystem2 property.
     * 
     */
    public void setOutGrpOutGrmCollateralTablePrftSystem2(short value) {
        this.outGrpOutGrmCollateralTablePrftSystem2 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCollateralTableProfitsAccount2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmCollateralTableProfitsAccount2() {
        return outGrpOutGrmCollateralTableProfitsAccount2;
    }

    /**
     * Sets the value of the outGrpOutGrmCollateralTableProfitsAccount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmCollateralTableProfitsAccount2(String value) {
        this.outGrpOutGrmCollateralTableProfitsAccount2 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCollateralTableRecordDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmCollateralTableRecordDescr() {
        return outGrpOutGrmCollateralTableRecordDescr;
    }

    /**
     * Sets the value of the outGrpOutGrmCollateralTableRecordDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmCollateralTableRecordDescr(String value) {
        this.outGrpOutGrmCollateralTableRecordDescr = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCollateralTableRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmCollateralTableRecordType() {
        return outGrpOutGrmCollateralTableRecordType;
    }

    /**
     * Sets the value of the outGrpOutGrmCollateralTableRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmCollateralTableRecordType(String value) {
        this.outGrpOutGrmCollateralTableRecordType = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCollateralTableTagSetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmCollateralTableTagSetCode() {
        return outGrpOutGrmCollateralTableTagSetCode;
    }

    /**
     * Sets the value of the outGrpOutGrmCollateralTableTagSetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmCollateralTableTagSetCode(String value) {
        this.outGrpOutGrmCollateralTableTagSetCode = value;
    }

    /**
     * Gets the value of the outGrpOutGrmPfgTagSetSetupDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmPfgTagSetSetupDescription() {
        return outGrpOutGrmPfgTagSetSetupDescription;
    }

    /**
     * Sets the value of the outGrpOutGrmPfgTagSetSetupDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmPfgTagSetSetupDescription(String value) {
        this.outGrpOutGrmPfgTagSetSetupDescription = value;
    }

}
