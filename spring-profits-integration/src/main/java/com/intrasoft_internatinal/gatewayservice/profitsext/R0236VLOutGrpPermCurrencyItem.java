
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for R0236VLOutGrpPermCurrencyItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="R0236VLOutGrpPermCurrencyItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpPermCurrencyOutGrmCurrFlagIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPermCurrencyOutGrmCurrencyCurrencyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPermCurrencyOutGrmCurrencyCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpPermCurrencyOutGrmCurrencyCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "R0236VLOutGrpPermCurrencyItem", propOrder = {
    "outGrpPermCurrencyOutGrmCurrFlagIefSuppliedFlag",
    "outGrpPermCurrencyOutGrmCurrencyCurrencyDescription",
    "outGrpPermCurrencyOutGrmCurrencyCurrencyIdCurrency",
    "outGrpPermCurrencyOutGrmCurrencyCurrencyShortDescr"
})
public class R0236VLOutGrpPermCurrencyItem {

    @XmlElement(name = "OutGrpPermCurrencyOutGrmCurrFlagIefSuppliedFlag")
    protected String outGrpPermCurrencyOutGrmCurrFlagIefSuppliedFlag;
    @XmlElement(name = "OutGrpPermCurrencyOutGrmCurrencyCurrencyDescription")
    protected String outGrpPermCurrencyOutGrmCurrencyCurrencyDescription;
    @XmlElement(name = "OutGrpPermCurrencyOutGrmCurrencyCurrencyIdCurrency")
    protected int outGrpPermCurrencyOutGrmCurrencyCurrencyIdCurrency;
    @XmlElement(name = "OutGrpPermCurrencyOutGrmCurrencyCurrencyShortDescr")
    protected String outGrpPermCurrencyOutGrmCurrencyCurrencyShortDescr;

    /**
     * Gets the value of the outGrpPermCurrencyOutGrmCurrFlagIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPermCurrencyOutGrmCurrFlagIefSuppliedFlag() {
        return outGrpPermCurrencyOutGrmCurrFlagIefSuppliedFlag;
    }

    /**
     * Sets the value of the outGrpPermCurrencyOutGrmCurrFlagIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPermCurrencyOutGrmCurrFlagIefSuppliedFlag(String value) {
        this.outGrpPermCurrencyOutGrmCurrFlagIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outGrpPermCurrencyOutGrmCurrencyCurrencyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPermCurrencyOutGrmCurrencyCurrencyDescription() {
        return outGrpPermCurrencyOutGrmCurrencyCurrencyDescription;
    }

    /**
     * Sets the value of the outGrpPermCurrencyOutGrmCurrencyCurrencyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPermCurrencyOutGrmCurrencyCurrencyDescription(String value) {
        this.outGrpPermCurrencyOutGrmCurrencyCurrencyDescription = value;
    }

    /**
     * Gets the value of the outGrpPermCurrencyOutGrmCurrencyCurrencyIdCurrency property.
     * 
     */
    public int getOutGrpPermCurrencyOutGrmCurrencyCurrencyIdCurrency() {
        return outGrpPermCurrencyOutGrmCurrencyCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outGrpPermCurrencyOutGrmCurrencyCurrencyIdCurrency property.
     * 
     */
    public void setOutGrpPermCurrencyOutGrmCurrencyCurrencyIdCurrency(int value) {
        this.outGrpPermCurrencyOutGrmCurrencyCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outGrpPermCurrencyOutGrmCurrencyCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPermCurrencyOutGrmCurrencyCurrencyShortDescr() {
        return outGrpPermCurrencyOutGrmCurrencyCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpPermCurrencyOutGrmCurrencyCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPermCurrencyOutGrmCurrencyCurrencyShortDescr(String value) {
        this.outGrpPermCurrencyOutGrmCurrencyCurrencyShortDescr = value;
    }

}
