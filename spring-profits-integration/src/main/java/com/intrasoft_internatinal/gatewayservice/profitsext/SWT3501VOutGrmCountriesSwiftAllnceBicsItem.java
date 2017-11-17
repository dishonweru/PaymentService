
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SWT3501VOutGrmCountriesSwiftAllnceBicsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SWT3501VOutGrmCountriesSwiftAllnceBicsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrmCountriesSwiftAllnceBicsCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SWT3501VOutGrmCountriesSwiftAllnceBicsItem", propOrder = {
    "outGrmCountriesSwiftAllnceBicsCountry"
})
public class SWT3501VOutGrmCountriesSwiftAllnceBicsItem {

    @XmlElement(name = "OutGrmCountriesSwiftAllnceBicsCountry")
    protected String outGrmCountriesSwiftAllnceBicsCountry;

    /**
     * Gets the value of the outGrmCountriesSwiftAllnceBicsCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrmCountriesSwiftAllnceBicsCountry() {
        return outGrmCountriesSwiftAllnceBicsCountry;
    }

    /**
     * Sets the value of the outGrmCountriesSwiftAllnceBicsCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrmCountriesSwiftAllnceBicsCountry(String value) {
        this.outGrmCountriesSwiftAllnceBicsCountry = value;
    }

}
