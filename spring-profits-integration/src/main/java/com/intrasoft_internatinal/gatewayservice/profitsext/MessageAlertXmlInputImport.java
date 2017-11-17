
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageAlertXmlInputImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageAlertXmlInputImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InsertMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SignificantCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageAlertRecipient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageAlertXmlInputImport", propOrder = {
    "insertMessage",
    "significantCode",
    "requestClassName",
    "messageAlertRecipient"
})
public class MessageAlertXmlInputImport
    extends BaseImport
{

    @XmlElement(name = "InsertMessage")
    protected String insertMessage;
    @XmlElement(name = "SignificantCode")
    protected String significantCode;
    @XmlElement(name = "RequestClassName")
    protected String requestClassName;
    @XmlElement(name = "MessageAlertRecipient")
    protected String messageAlertRecipient;

    /**
     * Gets the value of the insertMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertMessage() {
        return insertMessage;
    }

    /**
     * Sets the value of the insertMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertMessage(String value) {
        this.insertMessage = value;
    }

    /**
     * Gets the value of the significantCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignificantCode() {
        return significantCode;
    }

    /**
     * Sets the value of the significantCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignificantCode(String value) {
        this.significantCode = value;
    }

    /**
     * Gets the value of the requestClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestClassName() {
        return requestClassName;
    }

    /**
     * Sets the value of the requestClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestClassName(String value) {
        this.requestClassName = value;
    }

    /**
     * Gets the value of the messageAlertRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageAlertRecipient() {
        return messageAlertRecipient;
    }

    /**
     * Sets the value of the messageAlertRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageAlertRecipient(String value) {
        this.messageAlertRecipient = value;
    }

}
