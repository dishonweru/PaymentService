
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SWT3501V_SearchSwiftCodeCriteriaExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SWT3501V_SearchSwiftCodeCriteriaExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="Countries" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Cities" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Banks" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SWT3501V_SearchSwiftCodeCriteriaExport", propOrder = {
    "countries",
    "cities",
    "banks"
})
public class SWT3501VSearchSwiftCodeCriteriaExport
    extends BaseExport
{

    @XmlElement(name = "Countries")
    protected ArrayOfString countries;
    @XmlElement(name = "Cities")
    protected ArrayOfString cities;
    @XmlElement(name = "Banks")
    protected ArrayOfString banks;

    /**
     * Gets the value of the countries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getCountries() {
        return countries;
    }

    /**
     * Sets the value of the countries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setCountries(ArrayOfString value) {
        this.countries = value;
    }

    /**
     * Gets the value of the cities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getCities() {
        return cities;
    }

    /**
     * Sets the value of the cities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setCities(ArrayOfString value) {
        this.cities = value;
    }

    /**
     * Gets the value of the banks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getBanks() {
        return banks;
    }

    /**
     * Sets the value of the banks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setBanks(ArrayOfString value) {
        this.banks = value;
    }

}
