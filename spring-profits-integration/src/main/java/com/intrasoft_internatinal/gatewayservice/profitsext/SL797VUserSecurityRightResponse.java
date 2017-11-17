
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
 *         &lt;element name="SL797V_UserSecurityRightResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}SL797V_UserSecurityRightExport" minOccurs="0"/>
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
    "sl797VUserSecurityRightResult"
})
@XmlRootElement(name = "SL797V_UserSecurityRightResponse")
public class SL797VUserSecurityRightResponse {

    @XmlElement(name = "SL797V_UserSecurityRightResult")
    protected SL797VUserSecurityRightExport sl797VUserSecurityRightResult;

    /**
     * Gets the value of the sl797VUserSecurityRightResult property.
     * 
     * @return
     *     possible object is
     *     {@link SL797VUserSecurityRightExport }
     *     
     */
    public SL797VUserSecurityRightExport getSL797VUserSecurityRightResult() {
        return sl797VUserSecurityRightResult;
    }

    /**
     * Sets the value of the sl797VUserSecurityRightResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SL797VUserSecurityRightExport }
     *     
     */
    public void setSL797VUserSecurityRightResult(SL797VUserSecurityRightExport value) {
        this.sl797VUserSecurityRightResult = value;
    }

}
