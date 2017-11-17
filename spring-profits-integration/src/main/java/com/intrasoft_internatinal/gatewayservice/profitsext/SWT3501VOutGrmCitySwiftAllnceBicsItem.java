
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SWT3501VOutGrmCitySwiftAllnceBicsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SWT3501VOutGrmCitySwiftAllnceBicsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrmCitySwiftAllnceBicsCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SWT3501VOutGrmCitySwiftAllnceBicsItem", propOrder = {
    "outGrmCitySwiftAllnceBicsCity"
})
public class SWT3501VOutGrmCitySwiftAllnceBicsItem {

    @XmlElement(name = "OutGrmCitySwiftAllnceBicsCity")
    protected String outGrmCitySwiftAllnceBicsCity;

    /**
     * Gets the value of the outGrmCitySwiftAllnceBicsCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrmCitySwiftAllnceBicsCity() {
        return outGrmCitySwiftAllnceBicsCity;
    }

    /**
     * Sets the value of the outGrmCitySwiftAllnceBicsCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrmCitySwiftAllnceBicsCity(String value) {
        this.outGrmCitySwiftAllnceBicsCity = value;
    }

}
