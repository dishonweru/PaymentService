
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for T2190VInsurancePolicyStatementImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T2190VInsurancePolicyStatementImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDateFromIssStatementIssTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDateToIssStatementIssTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InIssCommitmentTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InMoreIssStatementTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T2190VInsurancePolicyStatementImport", propOrder = {
    "command",
    "inCommandIefSuppliedCommand",
    "inDateFromIssStatementIssTrxDate",
    "inDateToIssStatementIssTrxDate",
    "inIssCommitmentTpSoIdentifier",
    "inMoreIssStatementTmstamp"
})
public class T2190VInsurancePolicyStatementImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InDateFromIssStatementIssTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDateFromIssStatementIssTrxDate;
    @XmlElement(name = "InDateToIssStatementIssTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDateToIssStatementIssTrxDate;
    @XmlElement(name = "InIssCommitmentTpSoIdentifier")
    protected double inIssCommitmentTpSoIdentifier;
    @XmlElement(name = "InMoreIssStatementTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inMoreIssStatementTmstamp;

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
     * Gets the value of the inDateFromIssStatementIssTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDateFromIssStatementIssTrxDate() {
        return inDateFromIssStatementIssTrxDate;
    }

    /**
     * Sets the value of the inDateFromIssStatementIssTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDateFromIssStatementIssTrxDate(XMLGregorianCalendar value) {
        this.inDateFromIssStatementIssTrxDate = value;
    }

    /**
     * Gets the value of the inDateToIssStatementIssTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDateToIssStatementIssTrxDate() {
        return inDateToIssStatementIssTrxDate;
    }

    /**
     * Sets the value of the inDateToIssStatementIssTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDateToIssStatementIssTrxDate(XMLGregorianCalendar value) {
        this.inDateToIssStatementIssTrxDate = value;
    }

    /**
     * Gets the value of the inIssCommitmentTpSoIdentifier property.
     * 
     */
    public double getInIssCommitmentTpSoIdentifier() {
        return inIssCommitmentTpSoIdentifier;
    }

    /**
     * Sets the value of the inIssCommitmentTpSoIdentifier property.
     * 
     */
    public void setInIssCommitmentTpSoIdentifier(double value) {
        this.inIssCommitmentTpSoIdentifier = value;
    }

    /**
     * Gets the value of the inMoreIssStatementTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInMoreIssStatementTmstamp() {
        return inMoreIssStatementTmstamp;
    }

    /**
     * Sets the value of the inMoreIssStatementTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInMoreIssStatementTmstamp(XMLGregorianCalendar value) {
        this.inMoreIssStatementTmstamp = value;
    }

}
