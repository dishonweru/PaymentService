
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SWT3501_SwiftItemListsExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SWT3501_SwiftItemListsExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutGrmCountriesSwiftAllnceBics" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfSWT3501VOutGrmCountriesSwiftAllnceBicsItem" minOccurs="0"/>
 *         &lt;element name="OutGrmCitySwiftAllnceBics" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfSWT3501VOutGrmCitySwiftAllnceBicsItem" minOccurs="0"/>
 *         &lt;element name="OutGrmBankSwiftAllnceBics" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfSWT3501VOutGrmBankSwiftAllnceBicsItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SWT3501_SwiftItemListsExport", propOrder = {
    "outGrmCountriesSwiftAllnceBics",
    "outGrmCitySwiftAllnceBics",
    "outGrmBankSwiftAllnceBics"
})
public class SWT3501SwiftItemListsExport
    extends BaseExport
{

    @XmlElement(name = "OutGrmCountriesSwiftAllnceBics")
    protected ArrayOfSWT3501VOutGrmCountriesSwiftAllnceBicsItem outGrmCountriesSwiftAllnceBics;
    @XmlElement(name = "OutGrmCitySwiftAllnceBics")
    protected ArrayOfSWT3501VOutGrmCitySwiftAllnceBicsItem outGrmCitySwiftAllnceBics;
    @XmlElement(name = "OutGrmBankSwiftAllnceBics")
    protected ArrayOfSWT3501VOutGrmBankSwiftAllnceBicsItem outGrmBankSwiftAllnceBics;

    /**
     * Gets the value of the outGrmCountriesSwiftAllnceBics property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSWT3501VOutGrmCountriesSwiftAllnceBicsItem }
     *     
     */
    public ArrayOfSWT3501VOutGrmCountriesSwiftAllnceBicsItem getOutGrmCountriesSwiftAllnceBics() {
        return outGrmCountriesSwiftAllnceBics;
    }

    /**
     * Sets the value of the outGrmCountriesSwiftAllnceBics property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSWT3501VOutGrmCountriesSwiftAllnceBicsItem }
     *     
     */
    public void setOutGrmCountriesSwiftAllnceBics(ArrayOfSWT3501VOutGrmCountriesSwiftAllnceBicsItem value) {
        this.outGrmCountriesSwiftAllnceBics = value;
    }

    /**
     * Gets the value of the outGrmCitySwiftAllnceBics property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSWT3501VOutGrmCitySwiftAllnceBicsItem }
     *     
     */
    public ArrayOfSWT3501VOutGrmCitySwiftAllnceBicsItem getOutGrmCitySwiftAllnceBics() {
        return outGrmCitySwiftAllnceBics;
    }

    /**
     * Sets the value of the outGrmCitySwiftAllnceBics property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSWT3501VOutGrmCitySwiftAllnceBicsItem }
     *     
     */
    public void setOutGrmCitySwiftAllnceBics(ArrayOfSWT3501VOutGrmCitySwiftAllnceBicsItem value) {
        this.outGrmCitySwiftAllnceBics = value;
    }

    /**
     * Gets the value of the outGrmBankSwiftAllnceBics property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSWT3501VOutGrmBankSwiftAllnceBicsItem }
     *     
     */
    public ArrayOfSWT3501VOutGrmBankSwiftAllnceBicsItem getOutGrmBankSwiftAllnceBics() {
        return outGrmBankSwiftAllnceBics;
    }

    /**
     * Sets the value of the outGrmBankSwiftAllnceBics property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSWT3501VOutGrmBankSwiftAllnceBicsItem }
     *     
     */
    public void setOutGrmBankSwiftAllnceBics(ArrayOfSWT3501VOutGrmBankSwiftAllnceBicsItem value) {
        this.outGrmBankSwiftAllnceBics = value;
    }

}
