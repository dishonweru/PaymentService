
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SL702VProfitsBankEmployeeListExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SL702VProfitsBankEmployeeListExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutListbox" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfSL702VOutListboxItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SL702VProfitsBankEmployeeListExport", propOrder = {
    "outListbox"
})
public class SL702VProfitsBankEmployeeListExport
    extends BaseExport
{

    @XmlElement(name = "OutListbox")
    protected ArrayOfSL702VOutListboxItem outListbox;

    /**
     * Gets the value of the outListbox property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSL702VOutListboxItem }
     *     
     */
    public ArrayOfSL702VOutListboxItem getOutListbox() {
        return outListbox;
    }

    /**
     * Sets the value of the outListbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSL702VOutListboxItem }
     *     
     */
    public void setOutListbox(ArrayOfSL702VOutListboxItem value) {
        this.outListbox = value;
    }

}
