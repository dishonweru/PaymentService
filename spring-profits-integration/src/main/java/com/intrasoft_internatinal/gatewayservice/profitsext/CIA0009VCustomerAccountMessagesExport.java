
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CIA0009V_CustomerAccountMessagesExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CIA0009V_CustomerAccountMessagesExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutCanamParmsFilename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutContinueProfitsMessageSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutContinueProfitsMessageTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpCustAccMessages" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfCIA0009VOutGrpCustAccMessagesItem" minOccurs="0"/>
 *         &lt;element name="OutGrpCustMessages" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfCIA0009VOutGrpCustMessagesItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CIA0009V_CustomerAccountMessagesExport", propOrder = {
    "outCanamParmsFilename",
    "outContinueProfitsMessageSn",
    "outContinueProfitsMessageTmstamp",
    "outGrpCustAccMessages",
    "outGrpCustMessages"
})
public class CIA0009VCustomerAccountMessagesExport
    extends BaseExport
{

    @XmlElement(name = "OutCanamParmsFilename")
    protected String outCanamParmsFilename;
    @XmlElement(name = "OutContinueProfitsMessageSn")
    protected double outContinueProfitsMessageSn;
    @XmlElement(name = "OutContinueProfitsMessageTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outContinueProfitsMessageTmstamp;
    @XmlElement(name = "OutGrpCustAccMessages")
    protected ArrayOfCIA0009VOutGrpCustAccMessagesItem outGrpCustAccMessages;
    @XmlElement(name = "OutGrpCustMessages")
    protected ArrayOfCIA0009VOutGrpCustMessagesItem outGrpCustMessages;

    /**
     * Gets the value of the outCanamParmsFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCanamParmsFilename() {
        return outCanamParmsFilename;
    }

    /**
     * Sets the value of the outCanamParmsFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCanamParmsFilename(String value) {
        this.outCanamParmsFilename = value;
    }

    /**
     * Gets the value of the outContinueProfitsMessageSn property.
     * 
     */
    public double getOutContinueProfitsMessageSn() {
        return outContinueProfitsMessageSn;
    }

    /**
     * Sets the value of the outContinueProfitsMessageSn property.
     * 
     */
    public void setOutContinueProfitsMessageSn(double value) {
        this.outContinueProfitsMessageSn = value;
    }

    /**
     * Gets the value of the outContinueProfitsMessageTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutContinueProfitsMessageTmstamp() {
        return outContinueProfitsMessageTmstamp;
    }

    /**
     * Sets the value of the outContinueProfitsMessageTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutContinueProfitsMessageTmstamp(XMLGregorianCalendar value) {
        this.outContinueProfitsMessageTmstamp = value;
    }

    /**
     * Gets the value of the outGrpCustAccMessages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCIA0009VOutGrpCustAccMessagesItem }
     *     
     */
    public ArrayOfCIA0009VOutGrpCustAccMessagesItem getOutGrpCustAccMessages() {
        return outGrpCustAccMessages;
    }

    /**
     * Sets the value of the outGrpCustAccMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCIA0009VOutGrpCustAccMessagesItem }
     *     
     */
    public void setOutGrpCustAccMessages(ArrayOfCIA0009VOutGrpCustAccMessagesItem value) {
        this.outGrpCustAccMessages = value;
    }

    /**
     * Gets the value of the outGrpCustMessages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCIA0009VOutGrpCustMessagesItem }
     *     
     */
    public ArrayOfCIA0009VOutGrpCustMessagesItem getOutGrpCustMessages() {
        return outGrpCustMessages;
    }

    /**
     * Sets the value of the outGrpCustMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCIA0009VOutGrpCustMessagesItem }
     *     
     */
    public void setOutGrpCustMessages(ArrayOfCIA0009VOutGrpCustMessagesItem value) {
        this.outGrpCustMessages = value;
    }

}
