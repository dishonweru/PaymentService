
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
 *         &lt;element name="SCN001V_ImageManagementResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}SCN001V_ImageManagementExport" minOccurs="0"/>
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
    "scn001VImageManagementResult"
})
@XmlRootElement(name = "SCN001V_ImageManagementResponse")
public class SCN001VImageManagementResponse {

    @XmlElement(name = "SCN001V_ImageManagementResult")
    protected SCN001VImageManagementExport scn001VImageManagementResult;

    /**
     * Gets the value of the scn001VImageManagementResult property.
     * 
     * @return
     *     possible object is
     *     {@link SCN001VImageManagementExport }
     *     
     */
    public SCN001VImageManagementExport getSCN001VImageManagementResult() {
        return scn001VImageManagementResult;
    }

    /**
     * Sets the value of the scn001VImageManagementResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCN001VImageManagementExport }
     *     
     */
    public void setSCN001VImageManagementResult(SCN001VImageManagementExport value) {
        this.scn001VImageManagementResult = value;
    }

}
