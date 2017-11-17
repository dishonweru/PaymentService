
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CI3496V_ProfitsOtpValidateImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CI3496V_ProfitsOtpValidateImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InKeyOtpUserChannelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InKeyOtpUserExtUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InKeyOtpUserExtKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InValKeyOtpKeyOtpKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InValSelectedCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InValSelectedCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InValFromAccountProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InValFromAccountProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InValFromAccountProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InValToccountProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InValToAccountProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InValToAccountProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI3496V_ProfitsOtpValidateImport", propOrder = {
    "command",
    "inKeyOtpUserChannelId",
    "inKeyOtpUserExtUser",
    "inKeyOtpUserExtKey",
    "inValKeyOtpKeyOtpKey",
    "inValSelectedCustomerCustId",
    "inValSelectedCustomerCDigit",
    "inValFromAccountProfitsAccountPrftSystem",
    "inValFromAccountProfitsAccountAccountNumber",
    "inValFromAccountProfitsAccountAccountCd",
    "inValToccountProfitsAccountPrftSystem",
    "inValToAccountProfitsAccountAccountNumber",
    "inValToAccountProfitsAccountAccountCd"
})
public class CI3496VProfitsOtpValidateImport
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
    @XmlElement(name = "InValKeyOtpKeyOtpKey")
    protected String inValKeyOtpKeyOtpKey;
    @XmlElement(name = "InValSelectedCustomerCustId")
    protected int inValSelectedCustomerCustId;
    @XmlElement(name = "InValSelectedCustomerCDigit")
    protected short inValSelectedCustomerCDigit;
    @XmlElement(name = "InValFromAccountProfitsAccountPrftSystem")
    protected short inValFromAccountProfitsAccountPrftSystem;
    @XmlElement(name = "InValFromAccountProfitsAccountAccountNumber")
    protected String inValFromAccountProfitsAccountAccountNumber;
    @XmlElement(name = "InValFromAccountProfitsAccountAccountCd")
    protected short inValFromAccountProfitsAccountAccountCd;
    @XmlElement(name = "InValToccountProfitsAccountPrftSystem")
    protected short inValToccountProfitsAccountPrftSystem;
    @XmlElement(name = "InValToAccountProfitsAccountAccountNumber")
    protected String inValToAccountProfitsAccountAccountNumber;
    @XmlElement(name = "InValToAccountProfitsAccountAccountCd")
    protected short inValToAccountProfitsAccountAccountCd;

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
     * Gets the value of the inValKeyOtpKeyOtpKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInValKeyOtpKeyOtpKey() {
        return inValKeyOtpKeyOtpKey;
    }

    /**
     * Sets the value of the inValKeyOtpKeyOtpKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInValKeyOtpKeyOtpKey(String value) {
        this.inValKeyOtpKeyOtpKey = value;
    }

    /**
     * Gets the value of the inValSelectedCustomerCustId property.
     * 
     */
    public int getInValSelectedCustomerCustId() {
        return inValSelectedCustomerCustId;
    }

    /**
     * Sets the value of the inValSelectedCustomerCustId property.
     * 
     */
    public void setInValSelectedCustomerCustId(int value) {
        this.inValSelectedCustomerCustId = value;
    }

    /**
     * Gets the value of the inValSelectedCustomerCDigit property.
     * 
     */
    public short getInValSelectedCustomerCDigit() {
        return inValSelectedCustomerCDigit;
    }

    /**
     * Sets the value of the inValSelectedCustomerCDigit property.
     * 
     */
    public void setInValSelectedCustomerCDigit(short value) {
        this.inValSelectedCustomerCDigit = value;
    }

    /**
     * Gets the value of the inValFromAccountProfitsAccountPrftSystem property.
     * 
     */
    public short getInValFromAccountProfitsAccountPrftSystem() {
        return inValFromAccountProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inValFromAccountProfitsAccountPrftSystem property.
     * 
     */
    public void setInValFromAccountProfitsAccountPrftSystem(short value) {
        this.inValFromAccountProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inValFromAccountProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInValFromAccountProfitsAccountAccountNumber() {
        return inValFromAccountProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inValFromAccountProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInValFromAccountProfitsAccountAccountNumber(String value) {
        this.inValFromAccountProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inValFromAccountProfitsAccountAccountCd property.
     * 
     */
    public short getInValFromAccountProfitsAccountAccountCd() {
        return inValFromAccountProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inValFromAccountProfitsAccountAccountCd property.
     * 
     */
    public void setInValFromAccountProfitsAccountAccountCd(short value) {
        this.inValFromAccountProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inValToccountProfitsAccountPrftSystem property.
     * 
     */
    public short getInValToccountProfitsAccountPrftSystem() {
        return inValToccountProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inValToccountProfitsAccountPrftSystem property.
     * 
     */
    public void setInValToccountProfitsAccountPrftSystem(short value) {
        this.inValToccountProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inValToAccountProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInValToAccountProfitsAccountAccountNumber() {
        return inValToAccountProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inValToAccountProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInValToAccountProfitsAccountAccountNumber(String value) {
        this.inValToAccountProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inValToAccountProfitsAccountAccountCd property.
     * 
     */
    public short getInValToAccountProfitsAccountAccountCd() {
        return inValToAccountProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inValToAccountProfitsAccountAccountCd property.
     * 
     */
    public void setInValToAccountProfitsAccountAccountCd(short value) {
        this.inValToAccountProfitsAccountAccountCd = value;
    }

}
