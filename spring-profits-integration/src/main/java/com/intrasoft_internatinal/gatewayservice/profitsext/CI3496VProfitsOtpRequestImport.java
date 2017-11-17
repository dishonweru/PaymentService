
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CI3496V_ProfitsOtpRequestImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CI3496V_ProfitsOtpRequestImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InKeyOtpUserChannelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InKeyOtpUserExtUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InKeyOtpUserExtKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProcessCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InProcessFromProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InProcessFromProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessFromProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InProcessToProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InProcessToProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessToProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI3496V_ProfitsOtpRequestImport", propOrder = {
    "command",
    "inKeyOtpUserChannelId",
    "inKeyOtpUserExtUser",
    "inKeyOtpUserExtKey",
    "inProcessCustomerCustId",
    "inProcessCustomerCDigit",
    "inProcessFromProfitsAccountPrftSystem",
    "inProcessFromProfitsAccountAccountNumber",
    "inProcessFromProfitsAccountAccountCd",
    "inProcessToProfitsAccountPrftSystem",
    "inProcessToProfitsAccountAccountNumber",
    "inProcessToProfitsAccountAccountCd"
})
public class CI3496VProfitsOtpRequestImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InKeyOtpUserChannelId")
    protected int inKeyOtpUserChannelId;
    @XmlElement(name = "InKeyOtpUserExtUser")
    protected String inKeyOtpUserExtUser;
    @XmlElement(name = "InKeyOtpUserExtKey")
    protected String inKeyOtpUserExtKey;
    @XmlElement(name = "InProcessCustomerCustId")
    protected int inProcessCustomerCustId;
    @XmlElement(name = "InProcessCustomerCDigit")
    protected short inProcessCustomerCDigit;
    @XmlElement(name = "InProcessFromProfitsAccountPrftSystem")
    protected short inProcessFromProfitsAccountPrftSystem;
    @XmlElement(name = "InProcessFromProfitsAccountAccountNumber")
    protected String inProcessFromProfitsAccountAccountNumber;
    @XmlElement(name = "InProcessFromProfitsAccountAccountCd")
    protected short inProcessFromProfitsAccountAccountCd;
    @XmlElement(name = "InProcessToProfitsAccountPrftSystem")
    protected short inProcessToProfitsAccountPrftSystem;
    @XmlElement(name = "InProcessToProfitsAccountAccountNumber")
    protected String inProcessToProfitsAccountAccountNumber;
    @XmlElement(name = "InProcessToProfitsAccountAccountCd")
    protected short inProcessToProfitsAccountAccountCd;

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
     * Gets the value of the inKeyOtpUserChannelId property.
     * 
     */
    public int getInKeyOtpUserChannelId() {
        return inKeyOtpUserChannelId;
    }

    /**
     * Sets the value of the inKeyOtpUserChannelId property.
     * 
     */
    public void setInKeyOtpUserChannelId(int value) {
        this.inKeyOtpUserChannelId = value;
    }

    /**
     * Gets the value of the inKeyOtpUserExtUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInKeyOtpUserExtUser() {
        return inKeyOtpUserExtUser;
    }

    /**
     * Sets the value of the inKeyOtpUserExtUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInKeyOtpUserExtUser(String value) {
        this.inKeyOtpUserExtUser = value;
    }

    /**
     * Gets the value of the inKeyOtpUserExtKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInKeyOtpUserExtKey() {
        return inKeyOtpUserExtKey;
    }

    /**
     * Sets the value of the inKeyOtpUserExtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInKeyOtpUserExtKey(String value) {
        this.inKeyOtpUserExtKey = value;
    }

    /**
     * Gets the value of the inProcessCustomerCustId property.
     * 
     */
    public int getInProcessCustomerCustId() {
        return inProcessCustomerCustId;
    }

    /**
     * Sets the value of the inProcessCustomerCustId property.
     * 
     */
    public void setInProcessCustomerCustId(int value) {
        this.inProcessCustomerCustId = value;
    }

    /**
     * Gets the value of the inProcessCustomerCDigit property.
     * 
     */
    public short getInProcessCustomerCDigit() {
        return inProcessCustomerCDigit;
    }

    /**
     * Sets the value of the inProcessCustomerCDigit property.
     * 
     */
    public void setInProcessCustomerCDigit(short value) {
        this.inProcessCustomerCDigit = value;
    }

    /**
     * Gets the value of the inProcessFromProfitsAccountPrftSystem property.
     * 
     */
    public short getInProcessFromProfitsAccountPrftSystem() {
        return inProcessFromProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inProcessFromProfitsAccountPrftSystem property.
     * 
     */
    public void setInProcessFromProfitsAccountPrftSystem(short value) {
        this.inProcessFromProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inProcessFromProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessFromProfitsAccountAccountNumber() {
        return inProcessFromProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inProcessFromProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessFromProfitsAccountAccountNumber(String value) {
        this.inProcessFromProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inProcessFromProfitsAccountAccountCd property.
     * 
     */
    public short getInProcessFromProfitsAccountAccountCd() {
        return inProcessFromProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inProcessFromProfitsAccountAccountCd property.
     * 
     */
    public void setInProcessFromProfitsAccountAccountCd(short value) {
        this.inProcessFromProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inProcessToProfitsAccountPrftSystem property.
     * 
     */
    public short getInProcessToProfitsAccountPrftSystem() {
        return inProcessToProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inProcessToProfitsAccountPrftSystem property.
     * 
     */
    public void setInProcessToProfitsAccountPrftSystem(short value) {
        this.inProcessToProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inProcessToProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessToProfitsAccountAccountNumber() {
        return inProcessToProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inProcessToProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessToProfitsAccountAccountNumber(String value) {
        this.inProcessToProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inProcessToProfitsAccountAccountCd property.
     * 
     */
    public short getInProcessToProfitsAccountAccountCd() {
        return inProcessToProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inProcessToProfitsAccountAccountCd property.
     * 
     */
    public void setInProcessToProfitsAccountAccountCd(short value) {
        this.inProcessToProfitsAccountAccountCd = value;
    }

}
