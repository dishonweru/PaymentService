
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StatementRequestImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatementRequestImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="ProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDateFromDepAccStatmtReqPrintFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDateFromDepAccStatmtReqTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDateToDepAccStatmtReqTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InExternalSystemDataSoftId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementRequestImport", propOrder = {
    "profitsAccountNumber",
    "profitsAccountCd",
    "command",
    "inParametersInTerminalTerminalNumber",
    "inDateFromDepAccStatmtReqPrintFlag",
    "inDateFromDepAccStatmtReqTrxDate",
    "inDateToDepAccStatmtReqTrxDate",
    "inExternalSystemDataSoftId"
})
public class StatementRequestImport
    extends BaseImport
{

    @XmlElement(name = "ProfitsAccountNumber")
    protected String profitsAccountNumber;
    @XmlElement(name = "ProfitsAccountCd")
    protected short profitsAccountCd;
    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InParametersInTerminalTerminalNumber")
    protected String inParametersInTerminalTerminalNumber;
    @XmlElement(name = "InDateFromDepAccStatmtReqPrintFlag")
    protected String inDateFromDepAccStatmtReqPrintFlag;
    @XmlElement(name = "InDateFromDepAccStatmtReqTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDateFromDepAccStatmtReqTrxDate;
    @XmlElement(name = "InDateToDepAccStatmtReqTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDateToDepAccStatmtReqTrxDate;
    @XmlElement(name = "InExternalSystemDataSoftId")
    protected String inExternalSystemDataSoftId;

    /**
     * Gets the value of the profitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfitsAccountNumber() {
        return profitsAccountNumber;
    }

    /**
     * Sets the value of the profitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfitsAccountNumber(String value) {
        this.profitsAccountNumber = value;
    }

    /**
     * Gets the value of the profitsAccountCd property.
     * 
     */
    public short getProfitsAccountCd() {
        return profitsAccountCd;
    }

    /**
     * Sets the value of the profitsAccountCd property.
     * 
     */
    public void setProfitsAccountCd(short value) {
        this.profitsAccountCd = value;
    }

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
     * Gets the value of the inDateFromDepAccStatmtReqPrintFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDateFromDepAccStatmtReqPrintFlag() {
        return inDateFromDepAccStatmtReqPrintFlag;
    }

    /**
     * Sets the value of the inDateFromDepAccStatmtReqPrintFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDateFromDepAccStatmtReqPrintFlag(String value) {
        this.inDateFromDepAccStatmtReqPrintFlag = value;
    }

    /**
     * Gets the value of the inDateFromDepAccStatmtReqTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDateFromDepAccStatmtReqTrxDate() {
        return inDateFromDepAccStatmtReqTrxDate;
    }

    /**
     * Sets the value of the inDateFromDepAccStatmtReqTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDateFromDepAccStatmtReqTrxDate(XMLGregorianCalendar value) {
        this.inDateFromDepAccStatmtReqTrxDate = value;
    }

    /**
     * Gets the value of the inDateToDepAccStatmtReqTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDateToDepAccStatmtReqTrxDate() {
        return inDateToDepAccStatmtReqTrxDate;
    }

    /**
     * Sets the value of the inDateToDepAccStatmtReqTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDateToDepAccStatmtReqTrxDate(XMLGregorianCalendar value) {
        this.inDateToDepAccStatmtReqTrxDate = value;
    }

    /**
     * Gets the value of the inExternalSystemDataSoftId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInExternalSystemDataSoftId() {
        return inExternalSystemDataSoftId;
    }

    /**
     * Sets the value of the inExternalSystemDataSoftId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInExternalSystemDataSoftId(String value) {
        this.inExternalSystemDataSoftId = value;
    }

}
