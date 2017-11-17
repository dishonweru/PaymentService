
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for L0705V_LoginUserImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0705V_LoginUserImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDecryptedUsrPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInvalidShaPasswordFlgIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPwdChngDtLoggedUserPasswordChangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InShortcutUnitIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InUsrUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InUsrUsrPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0705V_LoginUserImport", propOrder = {
    "command",
    "inCommandIefSuppliedCommand",
    "inDecryptedUsrPassword",
    "inInvalidShaPasswordFlgIefSuppliedChar1",
    "inLogUnitCode",
    "inPwdChngDtLoggedUserPasswordChangeDate",
    "inShortcutUnitIefSuppliedCommand",
    "inTerminalTerminalNumber",
    "inUsrUsrCode",
    "inUsrUsrPassword"
})
public class L0705VLoginUserImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InDecryptedUsrPassword")
    protected String inDecryptedUsrPassword;
    @XmlElement(name = "InInvalidShaPasswordFlgIefSuppliedChar1")
    protected String inInvalidShaPasswordFlgIefSuppliedChar1;
    @XmlElement(name = "InLogUnitCode")
    protected int inLogUnitCode;
    @XmlElement(name = "InPwdChngDtLoggedUserPasswordChangeDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inPwdChngDtLoggedUserPasswordChangeDate;
    @XmlElement(name = "InShortcutUnitIefSuppliedCommand")
    protected String inShortcutUnitIefSuppliedCommand;
    @XmlElement(name = "InTerminalTerminalNumber")
    protected String inTerminalTerminalNumber;
    @XmlElement(name = "InUsrUsrCode")
    protected String inUsrUsrCode;
    @XmlElement(name = "InUsrUsrPassword")
    protected String inUsrUsrPassword;

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
     * Gets the value of the inDecryptedUsrPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDecryptedUsrPassword() {
        return inDecryptedUsrPassword;
    }

    /**
     * Sets the value of the inDecryptedUsrPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDecryptedUsrPassword(String value) {
        this.inDecryptedUsrPassword = value;
    }

    /**
     * Gets the value of the inInvalidShaPasswordFlgIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInvalidShaPasswordFlgIefSuppliedChar1() {
        return inInvalidShaPasswordFlgIefSuppliedChar1;
    }

    /**
     * Sets the value of the inInvalidShaPasswordFlgIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInvalidShaPasswordFlgIefSuppliedChar1(String value) {
        this.inInvalidShaPasswordFlgIefSuppliedChar1 = value;
    }

    /**
     * Gets the value of the inLogUnitCode property.
     * 
     */
    public int getInLogUnitCode() {
        return inLogUnitCode;
    }

    /**
     * Sets the value of the inLogUnitCode property.
     * 
     */
    public void setInLogUnitCode(int value) {
        this.inLogUnitCode = value;
    }

    /**
     * Gets the value of the inPwdChngDtLoggedUserPasswordChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInPwdChngDtLoggedUserPasswordChangeDate() {
        return inPwdChngDtLoggedUserPasswordChangeDate;
    }

    /**
     * Sets the value of the inPwdChngDtLoggedUserPasswordChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInPwdChngDtLoggedUserPasswordChangeDate(XMLGregorianCalendar value) {
        this.inPwdChngDtLoggedUserPasswordChangeDate = value;
    }

    /**
     * Gets the value of the inShortcutUnitIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInShortcutUnitIefSuppliedCommand() {
        return inShortcutUnitIefSuppliedCommand;
    }

    /**
     * Sets the value of the inShortcutUnitIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInShortcutUnitIefSuppliedCommand(String value) {
        this.inShortcutUnitIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the inTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTerminalTerminalNumber() {
        return inTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTerminalTerminalNumber(String value) {
        this.inTerminalTerminalNumber = value;
    }

    /**
     * Gets the value of the inUsrUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUsrUsrCode() {
        return inUsrUsrCode;
    }

    /**
     * Sets the value of the inUsrUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUsrUsrCode(String value) {
        this.inUsrUsrCode = value;
    }

    /**
     * Gets the value of the inUsrUsrPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUsrUsrPassword() {
        return inUsrUsrPassword;
    }

    /**
     * Sets the value of the inUsrUsrPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUsrUsrPassword(String value) {
        this.inUsrUsrPassword = value;
    }

}
