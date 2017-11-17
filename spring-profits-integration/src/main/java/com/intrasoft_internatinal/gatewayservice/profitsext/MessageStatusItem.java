
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageStatusItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageStatusItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UniqueMessageId" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="MessageStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageStatusItem", propOrder = {
    "uniqueMessageId",
    "messageStatus"
})
public class MessageStatusItem {

    @XmlElement(name = "UniqueMessageId", required = true)
    protected BigDecimal uniqueMessageId;
    @XmlElement(name = "MessageStatus")
    protected String messageStatus;

    /**
     * Gets the value of the uniqueMessageId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUniqueMessageId() {
        return uniqueMessageId;
    }

    /**
     * Sets the value of the uniqueMessageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUniqueMessageId(BigDecimal value) {
        this.uniqueMessageId = value;
    }

    /**
     * Gets the value of the messageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageStatus() {
        return messageStatus;
    }

    /**
     * Sets the value of the messageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageStatus(String value) {
        this.messageStatus = value;
    }

}
