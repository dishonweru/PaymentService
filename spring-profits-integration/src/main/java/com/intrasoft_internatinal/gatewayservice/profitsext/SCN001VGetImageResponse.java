
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
 *         &lt;element name="SCN001V_GetImageResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}GetImageExport" minOccurs="0"/>
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
    "scn001VGetImageResult"
})
@XmlRootElement(name = "SCN001V_GetImageResponse")
public class SCN001VGetImageResponse {

    @XmlElement(name = "SCN001V_GetImageResult")
    protected GetImageExport scn001VGetImageResult;

    /**
     * Gets the value of the scn001VGetImageResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetImageExport }
     *     
     */
    public GetImageExport getSCN001VGetImageResult() {
        return scn001VGetImageResult;
    }

    /**
     * Sets the value of the scn001VGetImageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetImageExport }
     *     
     */
    public void setSCN001VGetImageResult(GetImageExport value) {
        this.scn001VGetImageResult = value;
    }

}
