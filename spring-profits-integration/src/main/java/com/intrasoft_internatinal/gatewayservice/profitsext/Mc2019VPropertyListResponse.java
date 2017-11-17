
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
 *         &lt;element name="Mc2019V_PropertyListResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}Mc2019VPropertyListExport" minOccurs="0"/>
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
    "mc2019VPropertyListResult"
})
@XmlRootElement(name = "Mc2019V_PropertyListResponse")
public class Mc2019VPropertyListResponse {

    @XmlElement(name = "Mc2019V_PropertyListResult")
    protected Mc2019VPropertyListExport mc2019VPropertyListResult;

    /**
     * Gets the value of the mc2019VPropertyListResult property.
     * 
     * @return
     *     possible object is
     *     {@link Mc2019VPropertyListExport }
     *     
     */
    public Mc2019VPropertyListExport getMc2019VPropertyListResult() {
        return mc2019VPropertyListResult;
    }

    /**
     * Sets the value of the mc2019VPropertyListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mc2019VPropertyListExport }
     *     
     */
    public void setMc2019VPropertyListResult(Mc2019VPropertyListExport value) {
        this.mc2019VPropertyListResult = value;
    }

}
