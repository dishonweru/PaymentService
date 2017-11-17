
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="G0598VManageGlAccountResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}G0598VManageGlAccountExport" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "g0598VManageGlAccountResult"
})
@XmlRootElement(name = "G0598VManageGlAccountResponse")
public class G0598VManageGlAccountResponse {

    @XmlElement(name = "G0598VManageGlAccountResult")
    protected G0598VManageGlAccountExport g0598VManageGlAccountResult;

    /**
     * Gets the value of the g0598VManageGlAccountResult property.
     * 
     * @return
     *     possible object is
     *     {@link G0598VManageGlAccountExport }
     *     
     */
    public G0598VManageGlAccountExport getG0598VManageGlAccountResult() {
        return g0598VManageGlAccountResult;
    }

    /**
     * Sets the value of the g0598VManageGlAccountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link G0598VManageGlAccountExport }
     *     
     */
    public void setG0598VManageGlAccountResult(G0598VManageGlAccountExport value) {
        this.g0598VManageGlAccountResult = value;
    }

}
