
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CI3496V_ProfitsOtpUserProcessImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CI3496V_ProfitsOtpUserProcessImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InKeyOtpUserChannelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InKeyOtpUserExtUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InKeyOtpUserExtKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InKeyOtpUserRegisterEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InKeyOtpUserRegisterMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InKeyOtpUserRegisterFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InKeyOtpUserRegisterSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InKeyOtpUserRegisterDob" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI3496V_ProfitsOtpUserProcessImport", propOrder = {
    "command",
    "inKeyOtpUserChannelId",
    "inKeyOtpUserExtUser",
    "inKeyOtpUserExtKey",
    "inKeyOtpUserRegisterEmail",
    "inKeyOtpUserRegisterMobile",
    "inKeyOtpUserRegisterFirstName",
    "inKeyOtpUserRegisterSurname",
    "inKeyOtpUserRegisterDob"
})
public class CI3496VProfitsOtpUserProcessImport
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
    @XmlElement(name = "InKeyOtpUserRegisterEmail")
    protected String inKeyOtpUserRegisterEmail;
    @XmlElement(name = "InKeyOtpUserRegisterMobile")
    protected String inKeyOtpUserRegisterMobile;
    @XmlElement(name = "InKeyOtpUserRegisterFirstName")
    protected String inKeyOtpUserRegisterFirstName;
    @XmlElement(name = "InKeyOtpUserRegisterSurname")
    protected String inKeyOtpUserRegisterSurname;
    @XmlElement(name = "InKeyOtpUserRegisterDob", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inKeyOtpUserRegisterDob;

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
     * Gets the value of the inKeyOtpUserRegisterEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInKeyOtpUserRegisterEmail() {
        return inKeyOtpUserRegisterEmail;
    }

    /**
     * Sets the value of the inKeyOtpUserRegisterEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInKeyOtpUserRegisterEmail(String value) {
        this.inKeyOtpUserRegisterEmail = value;
    }

    /**
     * Gets the value of the inKeyOtpUserRegisterMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInKeyOtpUserRegisterMobile() {
        return inKeyOtpUserRegisterMobile;
    }

    /**
     * Sets the value of the inKeyOtpUserRegisterMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInKeyOtpUserRegisterMobile(String value) {
        this.inKeyOtpUserRegisterMobile = value;
    }

    /**
     * Gets the value of the inKeyOtpUserRegisterFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInKeyOtpUserRegisterFirstName() {
        return inKeyOtpUserRegisterFirstName;
    }

    /**
     * Sets the value of the inKeyOtpUserRegisterFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInKeyOtpUserRegisterFirstName(String value) {
        this.inKeyOtpUserRegisterFirstName = value;
    }

    /**
     * Gets the value of the inKeyOtpUserRegisterSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInKeyOtpUserRegisterSurname() {
        return inKeyOtpUserRegisterSurname;
    }

    /**
     * Sets the value of the inKeyOtpUserRegisterSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInKeyOtpUserRegisterSurname(String value) {
        this.inKeyOtpUserRegisterSurname = value;
    }

    /**
     * Gets the value of the inKeyOtpUserRegisterDob property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInKeyOtpUserRegisterDob() {
        return inKeyOtpUserRegisterDob;
    }

    /**
     * Sets the value of the inKeyOtpUserRegisterDob property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInKeyOtpUserRegisterDob(XMLGregorianCalendar value) {
        this.inKeyOtpUserRegisterDob = value;
    }

}
