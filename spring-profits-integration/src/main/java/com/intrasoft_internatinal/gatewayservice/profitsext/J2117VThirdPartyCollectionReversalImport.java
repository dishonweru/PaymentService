
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for J2117V_ThirdPartyCollectionReversalImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="J2117V_ThirdPartyCollectionReversalImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCpTrxRecordingEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpTrxRecordingTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCpTrxRecordingTrxSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCpTrxRecordingTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCpTrxRecordingTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInBankParametersRateUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "J2117V_ThirdPartyCollectionReversalImport", propOrder = {
    "command",
    "inCpPrftTransactionDescription",
    "inCpPrftTransactionIdTransact",
    "inCpTrxRecordingEntryComments",
    "inCpTrxRecordingTrxDate",
    "inCpTrxRecordingTrxSn",
    "inCpTrxRecordingTrxUnit",
    "inCpTrxRecordingTrxUsr",
    "inParametersInBankParametersRateUsage",
    "inParametersInTerminalTerminalNumber",
    "inAuthGrantedIefSuppliedFlag"
})
public class J2117VThirdPartyCollectionReversalImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InCpPrftTransactionDescription")
    protected String inCpPrftTransactionDescription;
    @XmlElement(name = "InCpPrftTransactionIdTransact")
    protected int inCpPrftTransactionIdTransact;
    @XmlElement(name = "InCpTrxRecordingEntryComments")
    protected String inCpTrxRecordingEntryComments;
    @XmlElement(name = "InCpTrxRecordingTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCpTrxRecordingTrxDate;
    @XmlElement(name = "InCpTrxRecordingTrxSn")
    protected int inCpTrxRecordingTrxSn;
    @XmlElement(name = "InCpTrxRecordingTrxUnit")
    protected int inCpTrxRecordingTrxUnit;
    @XmlElement(name = "InCpTrxRecordingTrxUsr")
    protected String inCpTrxRecordingTrxUsr;
    @XmlElement(name = "InParametersInBankParametersRateUsage")
    protected String inParametersInBankParametersRateUsage;
    @XmlElement(name = "InParametersInTerminalTerminalNumber")
    protected String inParametersInTerminalTerminalNumber;
    @XmlElement(name = "InAuthGrantedIefSuppliedFlag")
    protected String inAuthGrantedIefSuppliedFlag;

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
     * Gets the value of the inCpPrftTransactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpPrftTransactionDescription() {
        return inCpPrftTransactionDescription;
    }

    /**
     * Sets the value of the inCpPrftTransactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpPrftTransactionDescription(String value) {
        this.inCpPrftTransactionDescription = value;
    }

    /**
     * Gets the value of the inCpPrftTransactionIdTransact property.
     * 
     */
    public int getInCpPrftTransactionIdTransact() {
        return inCpPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the inCpPrftTransactionIdTransact property.
     * 
     */
    public void setInCpPrftTransactionIdTransact(int value) {
        this.inCpPrftTransactionIdTransact = value;
    }

    /**
     * Gets the value of the inCpTrxRecordingEntryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpTrxRecordingEntryComments() {
        return inCpTrxRecordingEntryComments;
    }

    /**
     * Sets the value of the inCpTrxRecordingEntryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpTrxRecordingEntryComments(String value) {
        this.inCpTrxRecordingEntryComments = value;
    }

    /**
     * Gets the value of the inCpTrxRecordingTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCpTrxRecordingTrxDate() {
        return inCpTrxRecordingTrxDate;
    }

    /**
     * Sets the value of the inCpTrxRecordingTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCpTrxRecordingTrxDate(XMLGregorianCalendar value) {
        this.inCpTrxRecordingTrxDate = value;
    }

    /**
     * Gets the value of the inCpTrxRecordingTrxSn property.
     * 
     */
    public int getInCpTrxRecordingTrxSn() {
        return inCpTrxRecordingTrxSn;
    }

    /**
     * Sets the value of the inCpTrxRecordingTrxSn property.
     * 
     */
    public void setInCpTrxRecordingTrxSn(int value) {
        this.inCpTrxRecordingTrxSn = value;
    }

    /**
     * Gets the value of the inCpTrxRecordingTrxUnit property.
     * 
     */
    public int getInCpTrxRecordingTrxUnit() {
        return inCpTrxRecordingTrxUnit;
    }

    /**
     * Sets the value of the inCpTrxRecordingTrxUnit property.
     * 
     */
    public void setInCpTrxRecordingTrxUnit(int value) {
        this.inCpTrxRecordingTrxUnit = value;
    }

    /**
     * Gets the value of the inCpTrxRecordingTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpTrxRecordingTrxUsr() {
        return inCpTrxRecordingTrxUsr;
    }

    /**
     * Sets the value of the inCpTrxRecordingTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpTrxRecordingTrxUsr(String value) {
        this.inCpTrxRecordingTrxUsr = value;
    }

    /**
     * Gets the value of the inParametersInBankParametersRateUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInBankParametersRateUsage() {
        return inParametersInBankParametersRateUsage;
    }

    /**
     * Sets the value of the inParametersInBankParametersRateUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInBankParametersRateUsage(String value) {
        this.inParametersInBankParametersRateUsage = value;
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
     * Gets the value of the inAuthGrantedIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthGrantedIefSuppliedFlag() {
        return inAuthGrantedIefSuppliedFlag;
    }

    /**
     * Sets the value of the inAuthGrantedIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthGrantedIefSuppliedFlag(String value) {
        this.inAuthGrantedIefSuppliedFlag = value;
    }

}
