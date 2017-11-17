
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CI3496V_EmailSmsNewUserExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CI3496V_EmailSmsNewUserExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutReturnKeyProfitsInformKeyReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI3496V_EmailSmsNewUserExport", propOrder = {
    "outReturnKeyProfitsInformKeyReturn"
})
public class CI3496VEmailSmsNewUserExport
    extends BaseExport
{

    @XmlElement(name = "OutReturnKeyProfitsInformKeyReturn")
    protected String outReturnKeyProfitsInformKeyReturn;

    /**
     * Gets the value of the outReturnKeyProfitsInformKeyReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutReturnKeyProfitsInformKeyReturn() {
        return outReturnKeyProfitsInformKeyReturn;
    }

    /**
     * Sets the value of the outReturnKeyProfitsInformKeyReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutReturnKeyProfitsInformKeyReturn(String value) {
        this.outReturnKeyProfitsInformKeyReturn = value;
    }

}
