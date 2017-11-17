
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CIA0009VOutGrpCustMessagesItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CIA0009VOutGrpCustMessagesItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpCustMessagesOutGrmCustMessageTypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustMessagesOutGrmCustProfitsMessageAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustMessagesOutGrmCustProfitsMessageActualMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustMessagesOutGrmCustProfitsMessageCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCustMessagesOutGrmCustProfitsMessageMandatoryDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustMessagesOutGrmCustProfitsMessagePrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpCustMessagesOutGrmCustProfitsMessageSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpCustMessagesOutGrmCustProfitsMessageTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CIA0009VOutGrpCustMessagesItem", propOrder = {
    "outGrpCustMessagesOutGrmCustMessageTypeGenericDetailDescription",
    "outGrpCustMessagesOutGrmCustProfitsMessageAccountNumber",
    "outGrpCustMessagesOutGrmCustProfitsMessageActualMessage",
    "outGrpCustMessagesOutGrmCustProfitsMessageCustId",
    "outGrpCustMessagesOutGrmCustProfitsMessageMandatoryDetails",
    "outGrpCustMessagesOutGrmCustProfitsMessagePrftSystem",
    "outGrpCustMessagesOutGrmCustProfitsMessageSn",
    "outGrpCustMessagesOutGrmCustProfitsMessageTmstamp"
})
public class CIA0009VOutGrpCustMessagesItem {

    @XmlElement(name = "OutGrpCustMessagesOutGrmCustMessageTypeGenericDetailDescription")
    protected String outGrpCustMessagesOutGrmCustMessageTypeGenericDetailDescription;
    @XmlElement(name = "OutGrpCustMessagesOutGrmCustProfitsMessageAccountNumber")
    protected String outGrpCustMessagesOutGrmCustProfitsMessageAccountNumber;
    @XmlElement(name = "OutGrpCustMessagesOutGrmCustProfitsMessageActualMessage")
    protected String outGrpCustMessagesOutGrmCustProfitsMessageActualMessage;
    @XmlElement(name = "OutGrpCustMessagesOutGrmCustProfitsMessageCustId")
    protected int outGrpCustMessagesOutGrmCustProfitsMessageCustId;
    @XmlElement(name = "OutGrpCustMessagesOutGrmCustProfitsMessageMandatoryDetails")
    protected String outGrpCustMessagesOutGrmCustProfitsMessageMandatoryDetails;
    @XmlElement(name = "OutGrpCustMessagesOutGrmCustProfitsMessagePrftSystem")
    protected short outGrpCustMessagesOutGrmCustProfitsMessagePrftSystem;
    @XmlElement(name = "OutGrpCustMessagesOutGrmCustProfitsMessageSn")
    protected double outGrpCustMessagesOutGrmCustProfitsMessageSn;
    @XmlElement(name = "OutGrpCustMessagesOutGrmCustProfitsMessageTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpCustMessagesOutGrmCustProfitsMessageTmstamp;

    /**
     * Gets the value of the outGrpCustMessagesOutGrmCustMessageTypeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustMessagesOutGrmCustMessageTypeGenericDetailDescription() {
        return outGrpCustMessagesOutGrmCustMessageTypeGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpCustMessagesOutGrmCustMessageTypeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustMessagesOutGrmCustMessageTypeGenericDetailDescription(String value) {
        this.outGrpCustMessagesOutGrmCustMessageTypeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpCustMessagesOutGrmCustProfitsMessageAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustMessagesOutGrmCustProfitsMessageAccountNumber() {
        return outGrpCustMessagesOutGrmCustProfitsMessageAccountNumber;
    }

    /**
     * Sets the value of the outGrpCustMessagesOutGrmCustProfitsMessageAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustMessagesOutGrmCustProfitsMessageAccountNumber(String value) {
        this.outGrpCustMessagesOutGrmCustProfitsMessageAccountNumber = value;
    }

    /**
     * Gets the value of the outGrpCustMessagesOutGrmCustProfitsMessageActualMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustMessagesOutGrmCustProfitsMessageActualMessage() {
        return outGrpCustMessagesOutGrmCustProfitsMessageActualMessage;
    }

    /**
     * Sets the value of the outGrpCustMessagesOutGrmCustProfitsMessageActualMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustMessagesOutGrmCustProfitsMessageActualMessage(String value) {
        this.outGrpCustMessagesOutGrmCustProfitsMessageActualMessage = value;
    }

    /**
     * Gets the value of the outGrpCustMessagesOutGrmCustProfitsMessageCustId property.
     * 
     */
    public int getOutGrpCustMessagesOutGrmCustProfitsMessageCustId() {
        return outGrpCustMessagesOutGrmCustProfitsMessageCustId;
    }

    /**
     * Sets the value of the outGrpCustMessagesOutGrmCustProfitsMessageCustId property.
     * 
     */
    public void setOutGrpCustMessagesOutGrmCustProfitsMessageCustId(int value) {
        this.outGrpCustMessagesOutGrmCustProfitsMessageCustId = value;
    }

    /**
     * Gets the value of the outGrpCustMessagesOutGrmCustProfitsMessageMandatoryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustMessagesOutGrmCustProfitsMessageMandatoryDetails() {
        return outGrpCustMessagesOutGrmCustProfitsMessageMandatoryDetails;
    }

    /**
     * Sets the value of the outGrpCustMessagesOutGrmCustProfitsMessageMandatoryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustMessagesOutGrmCustProfitsMessageMandatoryDetails(String value) {
        this.outGrpCustMessagesOutGrmCustProfitsMessageMandatoryDetails = value;
    }

    /**
     * Gets the value of the outGrpCustMessagesOutGrmCustProfitsMessagePrftSystem property.
     * 
     */
    public short getOutGrpCustMessagesOutGrmCustProfitsMessagePrftSystem() {
        return outGrpCustMessagesOutGrmCustProfitsMessagePrftSystem;
    }

    /**
     * Sets the value of the outGrpCustMessagesOutGrmCustProfitsMessagePrftSystem property.
     * 
     */
    public void setOutGrpCustMessagesOutGrmCustProfitsMessagePrftSystem(short value) {
        this.outGrpCustMessagesOutGrmCustProfitsMessagePrftSystem = value;
    }

    /**
     * Gets the value of the outGrpCustMessagesOutGrmCustProfitsMessageSn property.
     * 
     */
    public double getOutGrpCustMessagesOutGrmCustProfitsMessageSn() {
        return outGrpCustMessagesOutGrmCustProfitsMessageSn;
    }

    /**
     * Sets the value of the outGrpCustMessagesOutGrmCustProfitsMessageSn property.
     * 
     */
    public void setOutGrpCustMessagesOutGrmCustProfitsMessageSn(double value) {
        this.outGrpCustMessagesOutGrmCustProfitsMessageSn = value;
    }

    /**
     * Gets the value of the outGrpCustMessagesOutGrmCustProfitsMessageTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpCustMessagesOutGrmCustProfitsMessageTmstamp() {
        return outGrpCustMessagesOutGrmCustProfitsMessageTmstamp;
    }

    /**
     * Sets the value of the outGrpCustMessagesOutGrmCustProfitsMessageTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpCustMessagesOutGrmCustProfitsMessageTmstamp(XMLGregorianCalendar value) {
        this.outGrpCustMessagesOutGrmCustProfitsMessageTmstamp = value;
    }

}
