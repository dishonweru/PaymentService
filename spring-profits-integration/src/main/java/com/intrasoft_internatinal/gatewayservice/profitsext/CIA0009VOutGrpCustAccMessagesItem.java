
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CIA0009VOutGrpCustAccMessagesItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CIA0009VOutGrpCustAccMessagesItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpCustAccMessagesOutGrmCustAccMsgTypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustAccMessagesOutGrmCustAccProfitsMessageAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustAccMessagesOutGrmCustAccProfitsMessageActualMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustAccMessagesOutGrmCustAccProfitsMessageCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCustAccMessagesOutGrmCustAccProfitsMessageMandatoryDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustAccMessagesOutGrmCustAccProfitsMessagePrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpCustAccMessagesOutGrmCustAccProfitsMessageSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpCustAccMessagesOutGrmCustAccProfitsMessageTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CIA0009VOutGrpCustAccMessagesItem", propOrder = {
    "outGrpCustAccMessagesOutGrmCustAccMsgTypeGenericDetailDescription",
    "outGrpCustAccMessagesOutGrmCustAccProfitsMessageAccountNumber",
    "outGrpCustAccMessagesOutGrmCustAccProfitsMessageActualMessage",
    "outGrpCustAccMessagesOutGrmCustAccProfitsMessageCustId",
    "outGrpCustAccMessagesOutGrmCustAccProfitsMessageMandatoryDetails",
    "outGrpCustAccMessagesOutGrmCustAccProfitsMessagePrftSystem",
    "outGrpCustAccMessagesOutGrmCustAccProfitsMessageSn",
    "outGrpCustAccMessagesOutGrmCustAccProfitsMessageTmstamp"
})
public class CIA0009VOutGrpCustAccMessagesItem {

    @XmlElement(name = "OutGrpCustAccMessagesOutGrmCustAccMsgTypeGenericDetailDescription")
    protected String outGrpCustAccMessagesOutGrmCustAccMsgTypeGenericDetailDescription;
    @XmlElement(name = "OutGrpCustAccMessagesOutGrmCustAccProfitsMessageAccountNumber")
    protected String outGrpCustAccMessagesOutGrmCustAccProfitsMessageAccountNumber;
    @XmlElement(name = "OutGrpCustAccMessagesOutGrmCustAccProfitsMessageActualMessage")
    protected String outGrpCustAccMessagesOutGrmCustAccProfitsMessageActualMessage;
    @XmlElement(name = "OutGrpCustAccMessagesOutGrmCustAccProfitsMessageCustId")
    protected int outGrpCustAccMessagesOutGrmCustAccProfitsMessageCustId;
    @XmlElement(name = "OutGrpCustAccMessagesOutGrmCustAccProfitsMessageMandatoryDetails")
    protected String outGrpCustAccMessagesOutGrmCustAccProfitsMessageMandatoryDetails;
    @XmlElement(name = "OutGrpCustAccMessagesOutGrmCustAccProfitsMessagePrftSystem")
    protected short outGrpCustAccMessagesOutGrmCustAccProfitsMessagePrftSystem;
    @XmlElement(name = "OutGrpCustAccMessagesOutGrmCustAccProfitsMessageSn")
    protected double outGrpCustAccMessagesOutGrmCustAccProfitsMessageSn;
    @XmlElement(name = "OutGrpCustAccMessagesOutGrmCustAccProfitsMessageTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpCustAccMessagesOutGrmCustAccProfitsMessageTmstamp;

    /**
     * Gets the value of the outGrpCustAccMessagesOutGrmCustAccMsgTypeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustAccMessagesOutGrmCustAccMsgTypeGenericDetailDescription() {
        return outGrpCustAccMessagesOutGrmCustAccMsgTypeGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpCustAccMessagesOutGrmCustAccMsgTypeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustAccMessagesOutGrmCustAccMsgTypeGenericDetailDescription(String value) {
        this.outGrpCustAccMessagesOutGrmCustAccMsgTypeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpCustAccMessagesOutGrmCustAccProfitsMessageAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustAccMessagesOutGrmCustAccProfitsMessageAccountNumber() {
        return outGrpCustAccMessagesOutGrmCustAccProfitsMessageAccountNumber;
    }

    /**
     * Sets the value of the outGrpCustAccMessagesOutGrmCustAccProfitsMessageAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustAccMessagesOutGrmCustAccProfitsMessageAccountNumber(String value) {
        this.outGrpCustAccMessagesOutGrmCustAccProfitsMessageAccountNumber = value;
    }

    /**
     * Gets the value of the outGrpCustAccMessagesOutGrmCustAccProfitsMessageActualMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustAccMessagesOutGrmCustAccProfitsMessageActualMessage() {
        return outGrpCustAccMessagesOutGrmCustAccProfitsMessageActualMessage;
    }

    /**
     * Sets the value of the outGrpCustAccMessagesOutGrmCustAccProfitsMessageActualMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustAccMessagesOutGrmCustAccProfitsMessageActualMessage(String value) {
        this.outGrpCustAccMessagesOutGrmCustAccProfitsMessageActualMessage = value;
    }

    /**
     * Gets the value of the outGrpCustAccMessagesOutGrmCustAccProfitsMessageCustId property.
     * 
     */
    public int getOutGrpCustAccMessagesOutGrmCustAccProfitsMessageCustId() {
        return outGrpCustAccMessagesOutGrmCustAccProfitsMessageCustId;
    }

    /**
     * Sets the value of the outGrpCustAccMessagesOutGrmCustAccProfitsMessageCustId property.
     * 
     */
    public void setOutGrpCustAccMessagesOutGrmCustAccProfitsMessageCustId(int value) {
        this.outGrpCustAccMessagesOutGrmCustAccProfitsMessageCustId = value;
    }

    /**
     * Gets the value of the outGrpCustAccMessagesOutGrmCustAccProfitsMessageMandatoryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustAccMessagesOutGrmCustAccProfitsMessageMandatoryDetails() {
        return outGrpCustAccMessagesOutGrmCustAccProfitsMessageMandatoryDetails;
    }

    /**
     * Sets the value of the outGrpCustAccMessagesOutGrmCustAccProfitsMessageMandatoryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustAccMessagesOutGrmCustAccProfitsMessageMandatoryDetails(String value) {
        this.outGrpCustAccMessagesOutGrmCustAccProfitsMessageMandatoryDetails = value;
    }

    /**
     * Gets the value of the outGrpCustAccMessagesOutGrmCustAccProfitsMessagePrftSystem property.
     * 
     */
    public short getOutGrpCustAccMessagesOutGrmCustAccProfitsMessagePrftSystem() {
        return outGrpCustAccMessagesOutGrmCustAccProfitsMessagePrftSystem;
    }

    /**
     * Sets the value of the outGrpCustAccMessagesOutGrmCustAccProfitsMessagePrftSystem property.
     * 
     */
    public void setOutGrpCustAccMessagesOutGrmCustAccProfitsMessagePrftSystem(short value) {
        this.outGrpCustAccMessagesOutGrmCustAccProfitsMessagePrftSystem = value;
    }

    /**
     * Gets the value of the outGrpCustAccMessagesOutGrmCustAccProfitsMessageSn property.
     * 
     */
    public double getOutGrpCustAccMessagesOutGrmCustAccProfitsMessageSn() {
        return outGrpCustAccMessagesOutGrmCustAccProfitsMessageSn;
    }

    /**
     * Sets the value of the outGrpCustAccMessagesOutGrmCustAccProfitsMessageSn property.
     * 
     */
    public void setOutGrpCustAccMessagesOutGrmCustAccProfitsMessageSn(double value) {
        this.outGrpCustAccMessagesOutGrmCustAccProfitsMessageSn = value;
    }

    /**
     * Gets the value of the outGrpCustAccMessagesOutGrmCustAccProfitsMessageTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpCustAccMessagesOutGrmCustAccProfitsMessageTmstamp() {
        return outGrpCustAccMessagesOutGrmCustAccProfitsMessageTmstamp;
    }

    /**
     * Sets the value of the outGrpCustAccMessagesOutGrmCustAccProfitsMessageTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpCustAccMessagesOutGrmCustAccProfitsMessageTmstamp(XMLGregorianCalendar value) {
        this.outGrpCustAccMessagesOutGrmCustAccProfitsMessageTmstamp = value;
    }

}
