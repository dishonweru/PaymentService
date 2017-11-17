
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
 *         &lt;element name="MessageAlertXmlInputResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}MessageAlertXmlInputExport" minOccurs="0"/>
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
    "messageAlertXmlInputResult"
})
@XmlRootElement(name = "MessageAlertXmlInputResponse")
public class MessageAlertXmlInputResponse {

    @XmlElement(name = "MessageAlertXmlInputResult")
    protected MessageAlertXmlInputExport messageAlertXmlInputResult;

    /**
     * Gets the value of the messageAlertXmlInputResult property.
     * 
     * @return
     *     possible object is
     *     {@link MessageAlertXmlInputExport }
     *     
     */
    public MessageAlertXmlInputExport getMessageAlertXmlInputResult() {
        return messageAlertXmlInputResult;
    }

    /**
     * Sets the value of the messageAlertXmlInputResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageAlertXmlInputExport }
     *     
     */
    public void setMessageAlertXmlInputResult(MessageAlertXmlInputExport value) {
        this.messageAlertXmlInputResult = value;
    }

}
