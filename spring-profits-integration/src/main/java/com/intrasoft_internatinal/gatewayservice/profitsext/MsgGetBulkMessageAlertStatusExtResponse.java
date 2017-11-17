
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
 *         &lt;element name="MsgGetBulkMessageAlertStatusExtResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}GetBulkMessageAlertStatusExtExport" minOccurs="0"/>
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
    "msgGetBulkMessageAlertStatusExtResult"
})
@XmlRootElement(name = "MsgGetBulkMessageAlertStatusExtResponse")
public class MsgGetBulkMessageAlertStatusExtResponse {

    @XmlElement(name = "MsgGetBulkMessageAlertStatusExtResult")
    protected GetBulkMessageAlertStatusExtExport msgGetBulkMessageAlertStatusExtResult;

    /**
     * Gets the value of the msgGetBulkMessageAlertStatusExtResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetBulkMessageAlertStatusExtExport }
     *     
     */
    public GetBulkMessageAlertStatusExtExport getMsgGetBulkMessageAlertStatusExtResult() {
        return msgGetBulkMessageAlertStatusExtResult;
    }

    /**
     * Sets the value of the msgGetBulkMessageAlertStatusExtResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetBulkMessageAlertStatusExtExport }
     *     
     */
    public void setMsgGetBulkMessageAlertStatusExtResult(GetBulkMessageAlertStatusExtExport value) {
        this.msgGetBulkMessageAlertStatusExtResult = value;
    }

}
