
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
 *         &lt;element name="SCN001V_ExternalImageManagementResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}SCN001V_ExternalImageManagementExport" minOccurs="0"/>
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
    "scn001VExternalImageManagementResult"
})
@XmlRootElement(name = "SCN001V_ExternalImageManagementResponse")
public class SCN001VExternalImageManagementResponse {

    @XmlElement(name = "SCN001V_ExternalImageManagementResult")
    protected SCN001VExternalImageManagementExport scn001VExternalImageManagementResult;

    /**
     * Gets the value of the scn001VExternalImageManagementResult property.
     * 
     * @return
     *     possible object is
     *     {@link SCN001VExternalImageManagementExport }
     *     
     */
    public SCN001VExternalImageManagementExport getSCN001VExternalImageManagementResult() {
        return scn001VExternalImageManagementResult;
    }

    /**
     * Sets the value of the scn001VExternalImageManagementResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCN001VExternalImageManagementExport }
     *     
     */
    public void setSCN001VExternalImageManagementResult(SCN001VExternalImageManagementExport value) {
        this.scn001VExternalImageManagementResult = value;
    }

}
