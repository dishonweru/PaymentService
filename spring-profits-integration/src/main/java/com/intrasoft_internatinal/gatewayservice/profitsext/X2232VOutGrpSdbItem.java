
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for X2232VOutGrpSdbItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="X2232VOutGrpSdbItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpSdbOutGrmSdbUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpSdbOutGrmSdbCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpSdbOutGrmSdbCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpSdbOutGrmSdbSdbTypeRental" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpSdbOutGrmSdbProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpSdbOutGrmSdbProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpSdbOutGrmSdbCharSuppliedChar20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpSdbOutGrmSdbSafeDepositBoxSdbStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpSdbOutGrmSdbSafeDepositBoxSdbSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpSdbOutGrmSdbIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X2232VOutGrpSdbItem", propOrder = {
    "outGrpSdbOutGrmSdbUnitCode",
    "outGrpSdbOutGrmSdbCurrencyIdCurrency",
    "outGrpSdbOutGrmSdbCurrencyShortDescr",
    "outGrpSdbOutGrmSdbSdbTypeRental",
    "outGrpSdbOutGrmSdbProductIdProduct",
    "outGrpSdbOutGrmSdbProductDescription",
    "outGrpSdbOutGrmSdbCharSuppliedChar20",
    "outGrpSdbOutGrmSdbSafeDepositBoxSdbStatus",
    "outGrpSdbOutGrmSdbSafeDepositBoxSdbSn",
    "outGrpSdbOutGrmSdbIefSuppliedSelectChar"
})
public class X2232VOutGrpSdbItem {

    @XmlElement(name = "OutGrpSdbOutGrmSdbUnitCode")
    protected int outGrpSdbOutGrmSdbUnitCode;
    @XmlElement(name = "OutGrpSdbOutGrmSdbCurrencyIdCurrency")
    protected int outGrpSdbOutGrmSdbCurrencyIdCurrency;
    @XmlElement(name = "OutGrpSdbOutGrmSdbCurrencyShortDescr")
    protected String outGrpSdbOutGrmSdbCurrencyShortDescr;
    @XmlElement(name = "OutGrpSdbOutGrmSdbSdbTypeRental", required = true)
    protected BigDecimal outGrpSdbOutGrmSdbSdbTypeRental;
    @XmlElement(name = "OutGrpSdbOutGrmSdbProductIdProduct")
    protected int outGrpSdbOutGrmSdbProductIdProduct;
    @XmlElement(name = "OutGrpSdbOutGrmSdbProductDescription")
    protected String outGrpSdbOutGrmSdbProductDescription;
    @XmlElement(name = "OutGrpSdbOutGrmSdbCharSuppliedChar20")
    protected String outGrpSdbOutGrmSdbCharSuppliedChar20;
    @XmlElement(name = "OutGrpSdbOutGrmSdbSafeDepositBoxSdbStatus")
    protected String outGrpSdbOutGrmSdbSafeDepositBoxSdbStatus;
    @XmlElement(name = "OutGrpSdbOutGrmSdbSafeDepositBoxSdbSn")
    protected int outGrpSdbOutGrmSdbSafeDepositBoxSdbSn;
    @XmlElement(name = "OutGrpSdbOutGrmSdbIefSuppliedSelectChar")
    protected String outGrpSdbOutGrmSdbIefSuppliedSelectChar;

    /**
     * Gets the value of the outGrpSdbOutGrmSdbUnitCode property.
     * 
     */
    public int getOutGrpSdbOutGrmSdbUnitCode() {
        return outGrpSdbOutGrmSdbUnitCode;
    }

    /**
     * Sets the value of the outGrpSdbOutGrmSdbUnitCode property.
     * 
     */
    public void setOutGrpSdbOutGrmSdbUnitCode(int value) {
        this.outGrpSdbOutGrmSdbUnitCode = value;
    }

    /**
     * Gets the value of the outGrpSdbOutGrmSdbCurrencyIdCurrency property.
     * 
     */
    public int getOutGrpSdbOutGrmSdbCurrencyIdCurrency() {
        return outGrpSdbOutGrmSdbCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outGrpSdbOutGrmSdbCurrencyIdCurrency property.
     * 
     */
    public void setOutGrpSdbOutGrmSdbCurrencyIdCurrency(int value) {
        this.outGrpSdbOutGrmSdbCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outGrpSdbOutGrmSdbCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpSdbOutGrmSdbCurrencyShortDescr() {
        return outGrpSdbOutGrmSdbCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpSdbOutGrmSdbCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpSdbOutGrmSdbCurrencyShortDescr(String value) {
        this.outGrpSdbOutGrmSdbCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGrpSdbOutGrmSdbSdbTypeRental property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpSdbOutGrmSdbSdbTypeRental() {
        return outGrpSdbOutGrmSdbSdbTypeRental;
    }

    /**
     * Sets the value of the outGrpSdbOutGrmSdbSdbTypeRental property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpSdbOutGrmSdbSdbTypeRental(BigDecimal value) {
        this.outGrpSdbOutGrmSdbSdbTypeRental = value;
    }

    /**
     * Gets the value of the outGrpSdbOutGrmSdbProductIdProduct property.
     * 
     */
    public int getOutGrpSdbOutGrmSdbProductIdProduct() {
        return outGrpSdbOutGrmSdbProductIdProduct;
    }

    /**
     * Sets the value of the outGrpSdbOutGrmSdbProductIdProduct property.
     * 
     */
    public void setOutGrpSdbOutGrmSdbProductIdProduct(int value) {
        this.outGrpSdbOutGrmSdbProductIdProduct = value;
    }

    /**
     * Gets the value of the outGrpSdbOutGrmSdbProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpSdbOutGrmSdbProductDescription() {
        return outGrpSdbOutGrmSdbProductDescription;
    }

    /**
     * Sets the value of the outGrpSdbOutGrmSdbProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpSdbOutGrmSdbProductDescription(String value) {
        this.outGrpSdbOutGrmSdbProductDescription = value;
    }

    /**
     * Gets the value of the outGrpSdbOutGrmSdbCharSuppliedChar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpSdbOutGrmSdbCharSuppliedChar20() {
        return outGrpSdbOutGrmSdbCharSuppliedChar20;
    }

    /**
     * Sets the value of the outGrpSdbOutGrmSdbCharSuppliedChar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpSdbOutGrmSdbCharSuppliedChar20(String value) {
        this.outGrpSdbOutGrmSdbCharSuppliedChar20 = value;
    }

    /**
     * Gets the value of the outGrpSdbOutGrmSdbSafeDepositBoxSdbStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpSdbOutGrmSdbSafeDepositBoxSdbStatus() {
        return outGrpSdbOutGrmSdbSafeDepositBoxSdbStatus;
    }

    /**
     * Sets the value of the outGrpSdbOutGrmSdbSafeDepositBoxSdbStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpSdbOutGrmSdbSafeDepositBoxSdbStatus(String value) {
        this.outGrpSdbOutGrmSdbSafeDepositBoxSdbStatus = value;
    }

    /**
     * Gets the value of the outGrpSdbOutGrmSdbSafeDepositBoxSdbSn property.
     * 
     */
    public int getOutGrpSdbOutGrmSdbSafeDepositBoxSdbSn() {
        return outGrpSdbOutGrmSdbSafeDepositBoxSdbSn;
    }

    /**
     * Sets the value of the outGrpSdbOutGrmSdbSafeDepositBoxSdbSn property.
     * 
     */
    public void setOutGrpSdbOutGrmSdbSafeDepositBoxSdbSn(int value) {
        this.outGrpSdbOutGrmSdbSafeDepositBoxSdbSn = value;
    }

    /**
     * Gets the value of the outGrpSdbOutGrmSdbIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpSdbOutGrmSdbIefSuppliedSelectChar() {
        return outGrpSdbOutGrmSdbIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpSdbOutGrmSdbIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpSdbOutGrmSdbIefSuppliedSelectChar(String value) {
        this.outGrpSdbOutGrmSdbIefSuppliedSelectChar = value;
    }

}
