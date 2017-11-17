
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for A1954VLimitsInformationExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="A1954VLimitsInformationExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExitState" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ExitStateMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrustClients" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OutGrpLimitInformation" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfA1954VOutGrpLimitInformationItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "A1954VLimitsInformationExport", propOrder = {
    "command",
    "exitState",
    "exitStateMessage",
    "outIefSuppliedActionEntryDesc",
    "trustClients",
    "outGrpLimitInformation"
})
public class A1954VLimitsInformationExport
    extends BaseExport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "ExitState")
    protected int exitState;
    @XmlElement(name = "ExitStateMessage")
    protected String exitStateMessage;
    @XmlElement(name = "OutIefSuppliedActionEntryDesc")
    protected String outIefSuppliedActionEntryDesc;
    @XmlElement(name = "TrustClients")
    protected boolean trustClients;
    @XmlElement(name = "OutGrpLimitInformation")
    protected ArrayOfA1954VOutGrpLimitInformationItem outGrpLimitInformation;

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
     * Gets the value of the exitState property.
     * 
     */
    public int getExitState() {
        return exitState;
    }

    /**
     * Sets the value of the exitState property.
     * 
     */
    public void setExitState(int value) {
        this.exitState = value;
    }

    /**
     * Gets the value of the exitStateMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExitStateMessage() {
        return exitStateMessage;
    }

    /**
     * Sets the value of the exitStateMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExitStateMessage(String value) {
        this.exitStateMessage = value;
    }

    /**
     * Gets the value of the outIefSuppliedActionEntryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIefSuppliedActionEntryDesc() {
        return outIefSuppliedActionEntryDesc;
    }

    /**
     * Sets the value of the outIefSuppliedActionEntryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIefSuppliedActionEntryDesc(String value) {
        this.outIefSuppliedActionEntryDesc = value;
    }

    /**
     * Gets the value of the trustClients property.
     * 
     */
    public boolean isTrustClients() {
        return trustClients;
    }

    /**
     * Sets the value of the trustClients property.
     * 
     */
    public void setTrustClients(boolean value) {
        this.trustClients = value;
    }

    /**
     * Gets the value of the outGrpLimitInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfA1954VOutGrpLimitInformationItem }
     *     
     */
    public ArrayOfA1954VOutGrpLimitInformationItem getOutGrpLimitInformation() {
        return outGrpLimitInformation;
    }

    /**
     * Sets the value of the outGrpLimitInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfA1954VOutGrpLimitInformationItem }
     *     
     */
    public void setOutGrpLimitInformation(ArrayOfA1954VOutGrpLimitInformationItem value) {
        this.outGrpLimitInformation = value;
    }

}
