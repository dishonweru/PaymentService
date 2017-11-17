
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PRT098V_SingleProfitsAccountValidationImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PRT098V_SingleProfitsAccountValidationImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProfitsSystemProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRT098V_SingleProfitsAccountValidationImport", propOrder = {
    "command",
    "inCommandIefSuppliedCommand",
    "inProfitsAccountAccountCd",
    "inProfitsAccountAccountNumber",
    "inProfitsSystemProfitsAccountPrftSystem"
})
public class PRT098VSingleProfitsAccountValidationImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InProfitsAccountAccountCd")
    protected short inProfitsAccountAccountCd;
    @XmlElement(name = "InProfitsAccountAccountNumber")
    protected String inProfitsAccountAccountNumber;
    @XmlElement(name = "InProfitsSystemProfitsAccountPrftSystem")
    protected short inProfitsSystemProfitsAccountPrftSystem;

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
     * Gets the value of the inProfitsAccountAccountCd property.
     * 
     */
    public short getInProfitsAccountAccountCd() {
        return inProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inProfitsAccountAccountCd property.
     * 
     */
    public void setInProfitsAccountAccountCd(short value) {
        this.inProfitsAccountAccountCd = value;
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
     * Gets the value of the inProfitsSystemProfitsAccountPrftSystem property.
     * 
     */
    public short getInProfitsSystemProfitsAccountPrftSystem() {
        return inProfitsSystemProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inProfitsSystemProfitsAccountPrftSystem property.
     * 
     */
    public void setInProfitsSystemProfitsAccountPrftSystem(short value) {
        this.inProfitsSystemProfitsAccountPrftSystem = value;
    }

}
