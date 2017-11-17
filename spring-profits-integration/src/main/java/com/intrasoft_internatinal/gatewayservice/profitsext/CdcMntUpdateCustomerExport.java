
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CdcMntUpdateCustomerExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CdcMntUpdateCustomerExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExitState" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ExitStateMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrustClients" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CdcMntUpdateCustomerExport", propOrder = {
    "command",
    "exitState",
    "exitStateMessage",
    "trustClients"
})
public class CdcMntUpdateCustomerExport
    extends BaseExport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "ExitState")
    protected int exitState;
    @XmlElement(name = "ExitStateMessage")
    protected String exitStateMessage;
    @XmlElement(name = "TrustClients")
    protected boolean trustClients;

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

}
