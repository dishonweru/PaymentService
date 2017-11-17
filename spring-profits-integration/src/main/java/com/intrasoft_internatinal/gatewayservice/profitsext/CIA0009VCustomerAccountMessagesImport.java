
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CIA0009V_CustomerAccountMessagesImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CIA0009V_CustomerAccountMessagesImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InContinueProfitsMessageSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InContinueProfitsMessageTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDbNoMoreIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOtherChannelIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InProfitsMessageAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProfitsMessageCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProfitsMessagePrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InProfitsMessageSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InProfitsMessageTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CIA0009V_CustomerAccountMessagesImport", propOrder = {
    "command",
    "inCommandIefSuppliedCommand",
    "inContinueProfitsMessageSn",
    "inContinueProfitsMessageTmstamp",
    "inCustomerCustId",
    "inDbNoMoreIefSuppliedChar1",
    "inOtherChannelIefSuppliedChar1",
    "inPrftTransactionIdTransact",
    "inProfitsAccountAccountNumber",
    "inProfitsAccountPrftSystem",
    "inProfitsMessageAccountNumber",
    "inProfitsMessageCustId",
    "inProfitsMessagePrftSystem",
    "inProfitsMessageSn",
    "inProfitsMessageTmstamp"
})
public class CIA0009VCustomerAccountMessagesImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InContinueProfitsMessageSn")
    protected double inContinueProfitsMessageSn;
    @XmlElement(name = "InContinueProfitsMessageTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inContinueProfitsMessageTmstamp;
    @XmlElement(name = "InCustomerCustId")
    protected int inCustomerCustId;
    @XmlElement(name = "InDbNoMoreIefSuppliedChar1")
    protected String inDbNoMoreIefSuppliedChar1;
    @XmlElement(name = "InOtherChannelIefSuppliedChar1")
    protected String inOtherChannelIefSuppliedChar1;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InProfitsAccountAccountNumber")
    protected String inProfitsAccountAccountNumber;
    @XmlElement(name = "InProfitsAccountPrftSystem")
    protected short inProfitsAccountPrftSystem;
    @XmlElement(name = "InProfitsMessageAccountNumber")
    protected String inProfitsMessageAccountNumber;
    @XmlElement(name = "InProfitsMessageCustId")
    protected int inProfitsMessageCustId;
    @XmlElement(name = "InProfitsMessagePrftSystem")
    protected short inProfitsMessagePrftSystem;
    @XmlElement(name = "InProfitsMessageSn")
    protected double inProfitsMessageSn;
    @XmlElement(name = "InProfitsMessageTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inProfitsMessageTmstamp;

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommand(String value) {
        this.command = value;
    }

    /**
     * Gets the value of the inCommandIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCommandIefSuppliedCommand() {
        return inCommandIefSuppliedCommand;
    }

    /**
     * Sets the value of the inCommandIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCommandIefSuppliedCommand(String value) {
        this.inCommandIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the inContinueProfitsMessageSn property.
     * 
     */
    public double getInContinueProfitsMessageSn() {
        return inContinueProfitsMessageSn;
    }

    /**
     * Sets the value of the inContinueProfitsMessageSn property.
     * 
     */
    public void setInContinueProfitsMessageSn(double value) {
        this.inContinueProfitsMessageSn = value;
    }

    /**
     * Gets the value of the inContinueProfitsMessageTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInContinueProfitsMessageTmstamp() {
        return inContinueProfitsMessageTmstamp;
    }

    /**
     * Sets the value of the inContinueProfitsMessageTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInContinueProfitsMessageTmstamp(XMLGregorianCalendar value) {
        this.inContinueProfitsMessageTmstamp = value;
    }

    /**
     * Gets the value of the inCustomerCustId property.
     * 
     */
    public int getInCustomerCustId() {
        return inCustomerCustId;
    }

    /**
     * Sets the value of the inCustomerCustId property.
     * 
     */
    public void setInCustomerCustId(int value) {
        this.inCustomerCustId = value;
    }

    /**
     * Gets the value of the inDbNoMoreIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDbNoMoreIefSuppliedChar1() {
        return inDbNoMoreIefSuppliedChar1;
    }

    /**
     * Sets the value of the inDbNoMoreIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDbNoMoreIefSuppliedChar1(String value) {
        this.inDbNoMoreIefSuppliedChar1 = value;
    }

    /**
     * Gets the value of the inOtherChannelIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOtherChannelIefSuppliedChar1() {
        return inOtherChannelIefSuppliedChar1;
    }

    /**
     * Sets the value of the inOtherChannelIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOtherChannelIefSuppliedChar1(String value) {
        this.inOtherChannelIefSuppliedChar1 = value;
    }

    /**
     * Gets the value of the inPrftTransactionIdTransact property.
     * 
     */
    public int getInPrftTransactionIdTransact() {
        return inPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the inPrftTransactionIdTransact property.
     * 
     */
    public void setInPrftTransactionIdTransact(int value) {
        this.inPrftTransactionIdTransact = value;
    }

    /**
     * Gets the value of the inProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProfitsAccountAccountNumber() {
        return inProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProfitsAccountAccountNumber(String value) {
        this.inProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inProfitsAccountPrftSystem property.
     * 
     */
    public short getInProfitsAccountPrftSystem() {
        return inProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inProfitsAccountPrftSystem property.
     * 
     */
    public void setInProfitsAccountPrftSystem(short value) {
        this.inProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inProfitsMessageAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProfitsMessageAccountNumber() {
        return inProfitsMessageAccountNumber;
    }

    /**
     * Sets the value of the inProfitsMessageAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProfitsMessageAccountNumber(String value) {
        this.inProfitsMessageAccountNumber = value;
    }

    /**
     * Gets the value of the inProfitsMessageCustId property.
     * 
     */
    public int getInProfitsMessageCustId() {
        return inProfitsMessageCustId;
    }

    /**
     * Sets the value of the inProfitsMessageCustId property.
     * 
     */
    public void setInProfitsMessageCustId(int value) {
        this.inProfitsMessageCustId = value;
    }

    /**
     * Gets the value of the inProfitsMessagePrftSystem property.
     * 
     */
    public short getInProfitsMessagePrftSystem() {
        return inProfitsMessagePrftSystem;
    }

    /**
     * Sets the value of the inProfitsMessagePrftSystem property.
     * 
     */
    public void setInProfitsMessagePrftSystem(short value) {
        this.inProfitsMessagePrftSystem = value;
    }

    /**
     * Gets the value of the inProfitsMessageSn property.
     * 
     */
    public double getInProfitsMessageSn() {
        return inProfitsMessageSn;
    }

    /**
     * Sets the value of the inProfitsMessageSn property.
     * 
     */
    public void setInProfitsMessageSn(double value) {
        this.inProfitsMessageSn = value;
    }

    /**
     * Gets the value of the inProfitsMessageTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInProfitsMessageTmstamp() {
        return inProfitsMessageTmstamp;
    }

    /**
     * Sets the value of the inProfitsMessageTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInProfitsMessageTmstamp(XMLGregorianCalendar value) {
        this.inProfitsMessageTmstamp = value;
    }

}
