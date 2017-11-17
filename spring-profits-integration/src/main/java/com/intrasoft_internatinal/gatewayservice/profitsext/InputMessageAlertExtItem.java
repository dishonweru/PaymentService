
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InputMessageAlertExtItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InputMessageAlertExtItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RowUniqueId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MsgChannelType" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}MsgChannelType"/>
 *         &lt;element name="Recipient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CutomerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputMessageAlertExtItem", propOrder = {
    "rowUniqueId",
    "msgChannelType",
    "recipient",
    "shortMessage",
    "subject",
    "cutomerId"
})
public class InputMessageAlertExtItem {

    @XmlElement(name = "RowUniqueId")
    protected int rowUniqueId;
    @XmlElement(name = "MsgChannelType", required = true)
    @XmlSchemaType(name = "string")
    protected MsgChannelType msgChannelType;
    @XmlElement(name = "Recipient")
    protected String recipient;
    @XmlElement(name = "ShortMessage")
    protected String shortMessage;
    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "CutomerId", required = true, type = Integer.class, nillable = true)
    protected Integer cutomerId;

    /**
     * Gets the value of the rowUniqueId property.
     * 
     */
    public int getRowUniqueId() {
        return rowUniqueId;
    }

    /**
     * Sets the value of the rowUniqueId property.
     * 
     */
    public void setRowUniqueId(int value) {
        this.rowUniqueId = value;
    }

    /**
     * Gets the value of the msgChannelType property.
     * 
     * @return
     *     possible object is
     *     {@link MsgChannelType }
     *     
     */
    public MsgChannelType getMsgChannelType() {
        return msgChannelType;
    }

    /**
     * Sets the value of the msgChannelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgChannelType }
     *     
     */
    public void setMsgChannelType(MsgChannelType value) {
        this.msgChannelType = value;
    }

    /**
     * Gets the value of the recipient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipient() {
        return recipient;
    }

    /**
     * Sets the value of the recipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipient(String value) {
        this.recipient = value;
    }

    /**
     * Gets the value of the shortMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortMessage() {
        return shortMessage;
    }

    /**
     * Sets the value of the shortMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortMessage(String value) {
        this.shortMessage = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the cutomerId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCutomerId() {
        return cutomerId;
    }

    /**
     * Sets the value of the cutomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCutomerId(Integer value) {
        this.cutomerId = value;
    }

}
