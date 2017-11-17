
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SWT3501_SwiftItemListsImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SWT3501_SwiftItemListsImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFilterCitySwiftAllnceBicsCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFilterCountrySwiftAllnceBicsCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SWT3501_SwiftItemListsImport", propOrder = {
    "command",
    "inCommandIefSuppliedCommand",
    "inFilterCitySwiftAllnceBicsCity",
    "inFilterCountrySwiftAllnceBicsCountry"
})
public class SWT3501SwiftItemListsImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InFilterCitySwiftAllnceBicsCity")
    protected String inFilterCitySwiftAllnceBicsCity;
    @XmlElement(name = "InFilterCountrySwiftAllnceBicsCountry")
    protected String inFilterCountrySwiftAllnceBicsCountry;

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommand(String value) {
        this.command = value;
    }

    /**
     * Gets the value of the inCommandIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCommandIefSuppliedCommand() {
        return inCommandIefSuppliedCommand;
    }

    /**
     * Sets the value of the inCommandIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCommandIefSuppliedCommand(String value) {
        this.inCommandIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the inFilterCitySwiftAllnceBicsCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFilterCitySwiftAllnceBicsCity() {
        return inFilterCitySwiftAllnceBicsCity;
    }

    /**
     * Sets the value of the inFilterCitySwiftAllnceBicsCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFilterCitySwiftAllnceBicsCity(String value) {
        this.inFilterCitySwiftAllnceBicsCity = value;
    }

    /**
     * Gets the value of the inFilterCountrySwiftAllnceBicsCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFilterCountrySwiftAllnceBicsCountry() {
        return inFilterCountrySwiftAllnceBicsCountry;
    }

    /**
     * Sets the value of the inFilterCountrySwiftAllnceBicsCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFilterCountrySwiftAllnceBicsCountry(String value) {
        this.inFilterCountrySwiftAllnceBicsCountry = value;
    }

}
