
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CI3496V_EmailSmsNewUserImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CI3496V_EmailSmsNewUserImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessProfitsInformKeyUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessProfitsInformProfitsCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProcessProfitsInformProfitsCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InProcessProfitsInformProfitsUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessProfitsInformUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessProfitsInformUserPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessProfitsInformUserEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessProfitsInformUserMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessProfitsInformFilePassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessProfitsInformExtsysPersonType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessProfitsInformExtsysIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessProfitsInformExtsysFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessProfitsInformExtsysSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessProfitsInformExtsysComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI3496V_EmailSmsNewUserImport", propOrder = {
    "command",
    "inCommandIefSuppliedCommand",
    "inProcessProfitsInformKeyUserId",
    "inProcessProfitsInformProfitsCustId",
    "inProcessProfitsInformProfitsCDigit",
    "inProcessProfitsInformProfitsUserId",
    "inProcessProfitsInformUserName",
    "inProcessProfitsInformUserPassword",
    "inProcessProfitsInformUserEmail",
    "inProcessProfitsInformUserMobile",
    "inProcessProfitsInformFilePassword",
    "inProcessProfitsInformExtsysPersonType",
    "inProcessProfitsInformExtsysIndicator",
    "inProcessProfitsInformExtsysFirstName",
    "inProcessProfitsInformExtsysSurname",
    "inProcessProfitsInformExtsysComments"
})
public class CI3496VEmailSmsNewUserImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InProcessProfitsInformKeyUserId")
    protected String inProcessProfitsInformKeyUserId;
    @XmlElement(name = "InProcessProfitsInformProfitsCustId")
    protected int inProcessProfitsInformProfitsCustId;
    @XmlElement(name = "InProcessProfitsInformProfitsCDigit")
    protected short inProcessProfitsInformProfitsCDigit;
    @XmlElement(name = "InProcessProfitsInformProfitsUserId")
    protected String inProcessProfitsInformProfitsUserId;
    @XmlElement(name = "InProcessProfitsInformUserName")
    protected String inProcessProfitsInformUserName;
    @XmlElement(name = "InProcessProfitsInformUserPassword")
    protected String inProcessProfitsInformUserPassword;
    @XmlElement(name = "InProcessProfitsInformUserEmail")
    protected String inProcessProfitsInformUserEmail;
    @XmlElement(name = "InProcessProfitsInformUserMobile")
    protected String inProcessProfitsInformUserMobile;
    @XmlElement(name = "InProcessProfitsInformFilePassword")
    protected String inProcessProfitsInformFilePassword;
    @XmlElement(name = "InProcessProfitsInformExtsysPersonType")
    protected String inProcessProfitsInformExtsysPersonType;
    @XmlElement(name = "InProcessProfitsInformExtsysIndicator")
    protected String inProcessProfitsInformExtsysIndicator;
    @XmlElement(name = "InProcessProfitsInformExtsysFirstName")
    protected String inProcessProfitsInformExtsysFirstName;
    @XmlElement(name = "InProcessProfitsInformExtsysSurname")
    protected String inProcessProfitsInformExtsysSurname;
    @XmlElement(name = "InProcessProfitsInformExtsysComments")
    protected String inProcessProfitsInformExtsysComments;

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
     * Gets the value of the inProcessProfitsInformKeyUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessProfitsInformKeyUserId() {
        return inProcessProfitsInformKeyUserId;
    }

    /**
     * Sets the value of the inProcessProfitsInformKeyUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessProfitsInformKeyUserId(String value) {
        this.inProcessProfitsInformKeyUserId = value;
    }

    /**
     * Gets the value of the inProcessProfitsInformProfitsCustId property.
     * 
     */
    public int getInProcessProfitsInformProfitsCustId() {
        return inProcessProfitsInformProfitsCustId;
    }

    /**
     * Sets the value of the inProcessProfitsInformProfitsCustId property.
     * 
     */
    public void setInProcessProfitsInformProfitsCustId(int value) {
        this.inProcessProfitsInformProfitsCustId = value;
    }

    /**
     * Gets the value of the inProcessProfitsInformProfitsCDigit property.
     * 
     */
    public short getInProcessProfitsInformProfitsCDigit() {
        return inProcessProfitsInformProfitsCDigit;
    }

    /**
     * Sets the value of the inProcessProfitsInformProfitsCDigit property.
     * 
     */
    public void setInProcessProfitsInformProfitsCDigit(short value) {
        this.inProcessProfitsInformProfitsCDigit = value;
    }

    /**
     * Gets the value of the inProcessProfitsInformProfitsUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessProfitsInformProfitsUserId() {
        return inProcessProfitsInformProfitsUserId;
    }

    /**
     * Sets the value of the inProcessProfitsInformProfitsUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessProfitsInformProfitsUserId(String value) {
        this.inProcessProfitsInformProfitsUserId = value;
    }

    /**
     * Gets the value of the inProcessProfitsInformUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessProfitsInformUserName() {
        return inProcessProfitsInformUserName;
    }

    /**
     * Sets the value of the inProcessProfitsInformUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessProfitsInformUserName(String value) {
        this.inProcessProfitsInformUserName = value;
    }

    /**
     * Gets the value of the inProcessProfitsInformUserPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessProfitsInformUserPassword() {
        return inProcessProfitsInformUserPassword;
    }

    /**
     * Sets the value of the inProcessProfitsInformUserPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessProfitsInformUserPassword(String value) {
        this.inProcessProfitsInformUserPassword = value;
    }

    /**
     * Gets the value of the inProcessProfitsInformUserEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessProfitsInformUserEmail() {
        return inProcessProfitsInformUserEmail;
    }

    /**
     * Sets the value of the inProcessProfitsInformUserEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessProfitsInformUserEmail(String value) {
        this.inProcessProfitsInformUserEmail = value;
    }

    /**
     * Gets the value of the inProcessProfitsInformUserMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessProfitsInformUserMobile() {
        return inProcessProfitsInformUserMobile;
    }

    /**
     * Sets the value of the inProcessProfitsInformUserMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessProfitsInformUserMobile(String value) {
        this.inProcessProfitsInformUserMobile = value;
    }

    /**
     * Gets the value of the inProcessProfitsInformFilePassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessProfitsInformFilePassword() {
        return inProcessProfitsInformFilePassword;
    }

    /**
     * Sets the value of the inProcessProfitsInformFilePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessProfitsInformFilePassword(String value) {
        this.inProcessProfitsInformFilePassword = value;
    }

    /**
     * Gets the value of the inProcessProfitsInformExtsysPersonType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessProfitsInformExtsysPersonType() {
        return inProcessProfitsInformExtsysPersonType;
    }

    /**
     * Sets the value of the inProcessProfitsInformExtsysPersonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessProfitsInformExtsysPersonType(String value) {
        this.inProcessProfitsInformExtsysPersonType = value;
    }

    /**
     * Gets the value of the inProcessProfitsInformExtsysIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessProfitsInformExtsysIndicator() {
        return inProcessProfitsInformExtsysIndicator;
    }

    /**
     * Sets the value of the inProcessProfitsInformExtsysIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessProfitsInformExtsysIndicator(String value) {
        this.inProcessProfitsInformExtsysIndicator = value;
    }

    /**
     * Gets the value of the inProcessProfitsInformExtsysFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessProfitsInformExtsysFirstName() {
        return inProcessProfitsInformExtsysFirstName;
    }

    /**
     * Sets the value of the inProcessProfitsInformExtsysFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessProfitsInformExtsysFirstName(String value) {
        this.inProcessProfitsInformExtsysFirstName = value;
    }

    /**
     * Gets the value of the inProcessProfitsInformExtsysSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessProfitsInformExtsysSurname() {
        return inProcessProfitsInformExtsysSurname;
    }

    /**
     * Sets the value of the inProcessProfitsInformExtsysSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessProfitsInformExtsysSurname(String value) {
        this.inProcessProfitsInformExtsysSurname = value;
    }

    /**
     * Gets the value of the inProcessProfitsInformExtsysComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessProfitsInformExtsysComments() {
        return inProcessProfitsInformExtsysComments;
    }

    /**
     * Sets the value of the inProcessProfitsInformExtsysComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessProfitsInformExtsysComments(String value) {
        this.inProcessProfitsInformExtsysComments = value;
    }

}
