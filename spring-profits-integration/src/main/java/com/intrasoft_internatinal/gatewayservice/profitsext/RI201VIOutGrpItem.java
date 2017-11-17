
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RI201VIOutGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RI201VIOutGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpOutGrmCurrencyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmCurrencyDisplayedDecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmCurrencyNationalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RI201VIOutGrpItem", propOrder = {
    "outGrpOutGrmCurrencyDescription",
    "outGrpOutGrmCurrencyDisplayedDecimalPlaces",
    "outGrpOutGrmCurrencyIdCurrency",
    "outGrpOutGrmCurrencyNationalFlag",
    "outGrpOutGrmCurrencyShortDescr"
})
public class RI201VIOutGrpItem {

    @XmlElement(name = "OutGrpOutGrmCurrencyDescription")
    protected String outGrpOutGrmCurrencyDescription;
    @XmlElement(name = "OutGrpOutGrmCurrencyDisplayedDecimalPlaces")
    protected short outGrpOutGrmCurrencyDisplayedDecimalPlaces;
    @XmlElement(name = "OutGrpOutGrmCurrencyIdCurrency")
    protected int outGrpOutGrmCurrencyIdCurrency;
    @XmlElement(name = "OutGrpOutGrmCurrencyNationalFlag")
    protected String outGrpOutGrmCurrencyNationalFlag;
    @XmlElement(name = "OutGrpOutGrmCurrencyShortDescr")
    protected String outGrpOutGrmCurrencyShortDescr;

    /**
     * Gets the value of the outGrpOutGrmCurrencyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmCurrencyDescription() {
        return outGrpOutGrmCurrencyDescription;
    }

    /**
     * Sets the value of the outGrpOutGrmCurrencyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmCurrencyDescription(String value) {
        this.outGrpOutGrmCurrencyDescription = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCurrencyDisplayedDecimalPlaces property.
     * 
     */
    public short getOutGrpOutGrmCurrencyDisplayedDecimalPlaces() {
        return outGrpOutGrmCurrencyDisplayedDecimalPlaces;
    }

    /**
     * Sets the value of the outGrpOutGrmCurrencyDisplayedDecimalPlaces property.
     * 
     */
    public void setOutGrpOutGrmCurrencyDisplayedDecimalPlaces(short value) {
        this.outGrpOutGrmCurrencyDisplayedDecimalPlaces = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCurrencyIdCurrency property.
     * 
     */
    public int getOutGrpOutGrmCurrencyIdCurrency() {
        return outGrpOutGrmCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outGrpOutGrmCurrencyIdCurrency property.
     * 
     */
    public void setOutGrpOutGrmCurrencyIdCurrency(int value) {
        this.outGrpOutGrmCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCurrencyNationalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmCurrencyNationalFlag() {
        return outGrpOutGrmCurrencyNationalFlag;
    }

    /**
     * Sets the value of the outGrpOutGrmCurrencyNationalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmCurrencyNationalFlag(String value) {
        this.outGrpOutGrmCurrencyNationalFlag = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmCurrencyShortDescr() {
        return outGrpOutGrmCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpOutGrmCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmCurrencyShortDescr(String value) {
        this.outGrpOutGrmCurrencyShortDescr = value;
    }

}
