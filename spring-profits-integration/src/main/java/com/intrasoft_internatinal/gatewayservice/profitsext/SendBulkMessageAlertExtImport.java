
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendBulkMessageAlertExtImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendBulkMessageAlertExtImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="MsgChannelCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BulkInputMessageAlertList" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfInputMessageAlertExtItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendBulkMessageAlertExtImport", propOrder = {
    "msgChannelCode",
    "bulkInputMessageAlertList"
})
public class SendBulkMessageAlertExtImport
    extends BaseImport
{

    @XmlElement(name = "MsgChannelCode")
    protected int msgChannelCode;
    @XmlElement(name = "BulkInputMessageAlertList")
    protected ArrayOfInputMessageAlertExtItem bulkInputMessageAlertList;

    /**
     * Gets the value of the msgChannelCode property.
     * 
     */
    public int getMsgChannelCode() {
        return msgChannelCode;
    }

    /**
     * Sets the value of the msgChannelCode property.
     * 
     */
    public void setMsgChannelCode(int value) {
        this.msgChannelCode = value;
    }

    /**
     * Gets the value of the bulkInputMessageAlertList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInputMessageAlertExtItem }
     *     
     */
    public ArrayOfInputMessageAlertExtItem getBulkInputMessageAlertList() {
        return bulkInputMessageAlertList;
    }

    /**
     * Sets the value of the bulkInputMessageAlertList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInputMessageAlertExtItem }
     *     
     */
    public void setBulkInputMessageAlertList(ArrayOfInputMessageAlertExtItem value) {
        this.bulkInputMessageAlertList = value;
    }

}
