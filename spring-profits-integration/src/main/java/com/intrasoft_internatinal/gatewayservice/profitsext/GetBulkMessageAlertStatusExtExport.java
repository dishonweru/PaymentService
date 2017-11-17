
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetBulkMessageAlertStatusExtExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBulkMessageAlertStatusExtExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="MessageStatusList" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfMessageStatusItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBulkMessageAlertStatusExtExport", propOrder = {
    "messageStatusList"
})
public class GetBulkMessageAlertStatusExtExport
    extends BaseExport
{

    @XmlElement(name = "MessageStatusList")
    protected ArrayOfMessageStatusItem messageStatusList;

    /**
     * Gets the value of the messageStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMessageStatusItem }
     *     
     */
    public ArrayOfMessageStatusItem getMessageStatusList() {
        return messageStatusList;
    }

    /**
     * Sets the value of the messageStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMessageStatusItem }
     *     
     */
    public void setMessageStatusList(ArrayOfMessageStatusItem value) {
        this.messageStatusList = value;
    }

}
