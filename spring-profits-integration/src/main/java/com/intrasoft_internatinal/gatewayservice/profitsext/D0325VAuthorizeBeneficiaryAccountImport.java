
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for D0325V_AuthorizeBeneficiaryAccountImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="D0325V_AuthorizeBeneficiaryAccountImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InDepositAccountBookBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "D0325V_AuthorizeBeneficiaryAccountImport", propOrder = {
    "command",
    "inCommandIefSuppliedCommand",
    "inDepositAccountAccountNumber",
    "inDepositAccountBookBalance",
    "inDepositAccountCDigit",
    "inDepositAccountDesignation",
    "inParametersInTerminalTerminalNumber",
    "inProfitsAccountAccountNumber"
})
public class D0325VAuthorizeBeneficiaryAccountImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InDepositAccountAccountNumber")
    protected double inDepositAccountAccountNumber;
    @XmlElement(name = "InDepositAccountBookBalance", required = true)
    protected BigDecimal inDepositAccountBookBalance;
    @XmlElement(name = "InDepositAccountCDigit")
    protected short inDepositAccountCDigit;
    @XmlElement(name = "InDepositAccountDesignation")
    protected String inDepositAccountDesignation;
    @XmlElement(name = "InParametersInTerminalTerminalNumber")
    protected String inParametersInTerminalTerminalNumber;
    @XmlElement(name = "InProfitsAccountAccountNumber")
    protected String inProfitsAccountAccountNumber;

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
     * Gets the value of the inDepositAccountAccountNumber property.
     * 
     */
    public double getInDepositAccountAccountNumber() {
        return inDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the inDepositAccountAccountNumber property.
     * 
     */
    public void setInDepositAccountAccountNumber(double value) {
        this.inDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inDepositAccountBookBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepositAccountBookBalance() {
        return inDepositAccountBookBalance;
    }

    /**
     * Sets the value of the inDepositAccountBookBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepositAccountBookBalance(BigDecimal value) {
        this.inDepositAccountBookBalance = value;
    }

    /**
     * Gets the value of the inDepositAccountCDigit property.
     * 
     */
    public short getInDepositAccountCDigit() {
        return inDepositAccountCDigit;
    }

    /**
     * Sets the value of the inDepositAccountCDigit property.
     * 
     */
    public void setInDepositAccountCDigit(short value) {
        this.inDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the inDepositAccountDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountDesignation() {
        return inDepositAccountDesignation;
    }

    /**
     * Sets the value of the inDepositAccountDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountDesignation(String value) {
        this.inDepositAccountDesignation = value;
    }

    /**
     * Gets the value of the inParametersInTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInTerminalTerminalNumber() {
        return inParametersInTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inParametersInTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInTerminalTerminalNumber(String value) {
        this.inParametersInTerminalTerminalNumber = value;
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

}
