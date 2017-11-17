
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SL797V_UserSecurityRightExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SL797V_UserSecurityRightExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutSsSecurityCmcb" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfSL797VOutSsSecurityCmcb" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SL797V_UserSecurityRightExport", propOrder = {
    "outSsSecurityCmcb"
})
public class SL797VUserSecurityRightExport
    extends BaseExport
{

    @XmlElement(name = "OutSsSecurityCmcb")
    protected ArrayOfSL797VOutSsSecurityCmcb outSsSecurityCmcb;

    /**
     * Gets the value of the outSsSecurityCmcb property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSL797VOutSsSecurityCmcb }
     *     
     */
    public ArrayOfSL797VOutSsSecurityCmcb getOutSsSecurityCmcb() {
        return outSsSecurityCmcb;
    }

    /**
     * Sets the value of the outSsSecurityCmcb property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSL797VOutSsSecurityCmcb }
     *     
     */
    public void setOutSsSecurityCmcb(ArrayOfSL797VOutSsSecurityCmcb value) {
        this.outSsSecurityCmcb = value;
    }

}
