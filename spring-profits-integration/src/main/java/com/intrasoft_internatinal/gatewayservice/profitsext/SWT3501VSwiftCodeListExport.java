
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SWT3501V_SwiftCodeListExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SWT3501V_SwiftCodeListExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="Swifts" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfSwiftCodeListItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SWT3501V_SwiftCodeListExport", propOrder = {
    "swifts"
})
public class SWT3501VSwiftCodeListExport
    extends BaseExport
{

    @XmlElement(name = "Swifts")
    protected ArrayOfSwiftCodeListItem swifts;

    /**
     * Gets the value of the swifts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSwiftCodeListItem }
     *     
     */
    public ArrayOfSwiftCodeListItem getSwifts() {
        return swifts;
    }

    /**
     * Sets the value of the swifts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSwiftCodeListItem }
     *     
     */
    public void setSwifts(ArrayOfSwiftCodeListItem value) {
        this.swifts = value;
    }

}
