
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
 *         &lt;element name="SL705V_ProfitsUserListSearchResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}SL705VProfitsUserListSearchExport" minOccurs="0"/>
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
    "sl705VProfitsUserListSearchResult"
})
@XmlRootElement(name = "SL705V_ProfitsUserListSearchResponse")
public class SL705VProfitsUserListSearchResponse {

    @XmlElement(name = "SL705V_ProfitsUserListSearchResult")
    protected SL705VProfitsUserListSearchExport sl705VProfitsUserListSearchResult;

    /**
     * Gets the value of the sl705VProfitsUserListSearchResult property.
     * 
     * @return
     *     possible object is
     *     {@link SL705VProfitsUserListSearchExport }
     *     
     */
    public SL705VProfitsUserListSearchExport getSL705VProfitsUserListSearchResult() {
        return sl705VProfitsUserListSearchResult;
    }

    /**
     * Sets the value of the sl705VProfitsUserListSearchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SL705VProfitsUserListSearchExport }
     *     
     */
    public void setSL705VProfitsUserListSearchResult(SL705VProfitsUserListSearchExport value) {
        this.sl705VProfitsUserListSearchResult = value;
    }

}
