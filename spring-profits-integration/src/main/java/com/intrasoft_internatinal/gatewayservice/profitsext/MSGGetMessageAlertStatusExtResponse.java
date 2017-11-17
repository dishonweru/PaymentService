
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
 *         &lt;element name="MSG_GetMessageAlertStatusExtResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}GetMessageAlertStatusExtExport" minOccurs="0"/>
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
    "msgGetMessageAlertStatusExtResult"
})
@XmlRootElement(name = "MSG_GetMessageAlertStatusExtResponse")
public class MSGGetMessageAlertStatusExtResponse {

    @XmlElement(name = "MSG_GetMessageAlertStatusExtResult")
    protected GetMessageAlertStatusExtExport msgGetMessageAlertStatusExtResult;

    /**
     * Gets the value of the msgGetMessageAlertStatusExtResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetMessageAlertStatusExtExport }
     *     
     */
    public GetMessageAlertStatusExtExport getMSGGetMessageAlertStatusExtResult() {
        return msgGetMessageAlertStatusExtResult;
    }

    /**
     * Sets the value of the msgGetMessageAlertStatusExtResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMessageAlertStatusExtExport }
     *     
     */
    public void setMSGGetMessageAlertStatusExtResult(GetMessageAlertStatusExtExport value) {
        this.msgGetMessageAlertStatusExtResult = value;
    }

}
