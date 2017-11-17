
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PRT022V_IprofitsAccCustomersImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PRT022V_IprofitsAccCustomersImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSelectedProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTrxTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxUnitClearingHouseFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRT022V_IprofitsAccCustomersImport", propOrder = {
    "command",
    "inCommandIefSuppliedCommand",
    "inSelectedProfitsAccountAccountCd",
    "inSelectedProfitsAccountAccountNumber",
    "inSelectedProfitsAccountPrftSystem",
    "inTrxTerminalTerminalNumber",
    "inTrxTrxCountTrxCounter",
    "inTrxUnitClearingHouseFlag"
})
public class PRT022VIprofitsAccCustomersImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InSelectedProfitsAccountAccountCd")
    protected short inSelectedProfitsAccountAccountCd;
    @XmlElement(name = "InSelectedProfitsAccountAccountNumber")
    protected String inSelectedProfitsAccountAccountNumber;
    @XmlElement(name = "InSelectedProfitsAccountPrftSystem")
    protected short inSelectedProfitsAccountPrftSystem;
    @XmlElement(name = "InTrxTerminalTerminalNumber")
    protected String inTrxTerminalTerminalNumber;
    @XmlElement(name = "InTrxTrxCountTrxCounter")
    protected int inTrxTrxCountTrxCounter;
    @XmlElement(name = "InTrxUnitClearingHouseFlag")
    protected String inTrxUnitClearingHouseFlag;

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
     * Gets the value of the inSelectedProfitsAccountAccountCd property.
     * 
     */
    public short getInSelectedProfitsAccountAccountCd() {
        return inSelectedProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountAccountCd property.
     * 
     */
    public void setInSelectedProfitsAccountAccountCd(short value) {
        this.inSelectedProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedProfitsAccountAccountNumber() {
        return inSelectedProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedProfitsAccountAccountNumber(String value) {
        this.inSelectedProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountPrftSystem property.
     * 
     */
    public short getInSelectedProfitsAccountPrftSystem() {
        return inSelectedProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountPrftSystem property.
     * 
     */
    public void setInSelectedProfitsAccountPrftSystem(short value) {
        this.inSelectedProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inTrxTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxTerminalTerminalNumber() {
        return inTrxTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inTrxTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxTerminalTerminalNumber(String value) {
        this.inTrxTerminalTerminalNumber = value;
    }

    /**
     * Gets the value of the inTrxTrxCountTrxCounter property.
     * 
     */
    public int getInTrxTrxCountTrxCounter() {
        return inTrxTrxCountTrxCounter;
    }

    /**
     * Sets the value of the inTrxTrxCountTrxCounter property.
     * 
     */
    public void setInTrxTrxCountTrxCounter(int value) {
        this.inTrxTrxCountTrxCounter = value;
    }

    /**
     * Gets the value of the inTrxUnitClearingHouseFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxUnitClearingHouseFlag() {
        return inTrxUnitClearingHouseFlag;
    }

    /**
     * Sets the value of the inTrxUnitClearingHouseFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxUnitClearingHouseFlag(String value) {
        this.inTrxUnitClearingHouseFlag = value;
    }

}
