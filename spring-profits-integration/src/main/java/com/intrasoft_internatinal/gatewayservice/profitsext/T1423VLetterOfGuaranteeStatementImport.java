
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for T1423VLetterOfGuaranteeStatementImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T1423VLetterOfGuaranteeStatementImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="ProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDefaultLgAccountExtraitAccSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InDefaultLgAccountExtraitAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDefaultLgAccountExtraitAccUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDefaultLgAccountExtraitTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDefaultLgAccountExtraitTrxInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InFromIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMntRecordingAuthorizer1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMntRecordingAuthorizer2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMntRecordingPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMntRecordingTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMoreLoanAccountExtraitTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InMoreLoanAccountExtraitTrxInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InToIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T1423VLetterOfGuaranteeStatementImport", propOrder = {
    "profitsAccountNumber",
    "profitsAccountCd",
    "inDefaultLgAccountExtraitAccSn",
    "inDefaultLgAccountExtraitAccType",
    "inDefaultLgAccountExtraitAccUnit",
    "inDefaultLgAccountExtraitTmstamp",
    "inDefaultLgAccountExtraitTrxInternalSn",
    "inFromIefSuppliedDate",
    "inIefSuppliedCommand",
    "inMntRecordingAuthorizer1",
    "inMntRecordingAuthorizer2",
    "inMntRecordingPrftSystem",
    "inMntRecordingReversalFlag",
    "inMntRecordingTerminalNumber",
    "inMntRecordingTrxCode",
    "inMoreLoanAccountExtraitTmstamp",
    "inMoreLoanAccountExtraitTrxInternalSn",
    "inToIefSuppliedDate"
})
public class T1423VLetterOfGuaranteeStatementImport
    extends BaseImport
{

    @XmlElement(name = "ProfitsAccountNumber")
    protected String profitsAccountNumber;
    @XmlElement(name = "ProfitsAccountCd")
    protected short profitsAccountCd;
    @XmlElement(name = "InDefaultLgAccountExtraitAccSn")
    protected double inDefaultLgAccountExtraitAccSn;
    @XmlElement(name = "InDefaultLgAccountExtraitAccType")
    protected short inDefaultLgAccountExtraitAccType;
    @XmlElement(name = "InDefaultLgAccountExtraitAccUnit")
    protected int inDefaultLgAccountExtraitAccUnit;
    @XmlElement(name = "InDefaultLgAccountExtraitTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDefaultLgAccountExtraitTmstamp;
    @XmlElement(name = "InDefaultLgAccountExtraitTrxInternalSn")
    protected short inDefaultLgAccountExtraitTrxInternalSn;
    @XmlElement(name = "InFromIefSuppliedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inFromIefSuppliedDate;
    @XmlElement(name = "InIefSuppliedCommand")
    protected String inIefSuppliedCommand;
    @XmlElement(name = "InMntRecordingAuthorizer1")
    protected String inMntRecordingAuthorizer1;
    @XmlElement(name = "InMntRecordingAuthorizer2")
    protected String inMntRecordingAuthorizer2;
    @XmlElement(name = "InMntRecordingPrftSystem")
    protected short inMntRecordingPrftSystem;
    @XmlElement(name = "InMntRecordingReversalFlag")
    protected String inMntRecordingReversalFlag;
    @XmlElement(name = "InMntRecordingTerminalNumber")
    protected String inMntRecordingTerminalNumber;
    @XmlElement(name = "InMntRecordingTrxCode")
    protected int inMntRecordingTrxCode;
    @XmlElement(name = "InMoreLoanAccountExtraitTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inMoreLoanAccountExtraitTmstamp;
    @XmlElement(name = "InMoreLoanAccountExtraitTrxInternalSn")
    protected short inMoreLoanAccountExtraitTrxInternalSn;
    @XmlElement(name = "InToIefSuppliedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inToIefSuppliedDate;

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
     * Gets the value of the inDefaultLgAccountExtraitAccSn property.
     * 
     */
    public double getInDefaultLgAccountExtraitAccSn() {
        return inDefaultLgAccountExtraitAccSn;
    }

    /**
     * Sets the value of the inDefaultLgAccountExtraitAccSn property.
     * 
     */
    public void setInDefaultLgAccountExtraitAccSn(double value) {
        this.inDefaultLgAccountExtraitAccSn = value;
    }

    /**
     * Gets the value of the inDefaultLgAccountExtraitAccType property.
     * 
     */
    public short getInDefaultLgAccountExtraitAccType() {
        return inDefaultLgAccountExtraitAccType;
    }

    /**
     * Sets the value of the inDefaultLgAccountExtraitAccType property.
     * 
     */
    public void setInDefaultLgAccountExtraitAccType(short value) {
        this.inDefaultLgAccountExtraitAccType = value;
    }

    /**
     * Gets the value of the inDefaultLgAccountExtraitAccUnit property.
     * 
     */
    public int getInDefaultLgAccountExtraitAccUnit() {
        return inDefaultLgAccountExtraitAccUnit;
    }

    /**
     * Sets the value of the inDefaultLgAccountExtraitAccUnit property.
     * 
     */
    public void setInDefaultLgAccountExtraitAccUnit(int value) {
        this.inDefaultLgAccountExtraitAccUnit = value;
    }

    /**
     * Gets the value of the inDefaultLgAccountExtraitTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDefaultLgAccountExtraitTmstamp() {
        return inDefaultLgAccountExtraitTmstamp;
    }

    /**
     * Sets the value of the inDefaultLgAccountExtraitTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDefaultLgAccountExtraitTmstamp(XMLGregorianCalendar value) {
        this.inDefaultLgAccountExtraitTmstamp = value;
    }

    /**
     * Gets the value of the inDefaultLgAccountExtraitTrxInternalSn property.
     * 
     */
    public short getInDefaultLgAccountExtraitTrxInternalSn() {
        return inDefaultLgAccountExtraitTrxInternalSn;
    }

    /**
     * Sets the value of the inDefaultLgAccountExtraitTrxInternalSn property.
     * 
     */
    public void setInDefaultLgAccountExtraitTrxInternalSn(short value) {
        this.inDefaultLgAccountExtraitTrxInternalSn = value;
    }

    /**
     * Gets the value of the inFromIefSuppliedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInFromIefSuppliedDate() {
        return inFromIefSuppliedDate;
    }

    /**
     * Sets the value of the inFromIefSuppliedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInFromIefSuppliedDate(XMLGregorianCalendar value) {
        this.inFromIefSuppliedDate = value;
    }

    /**
     * Gets the value of the inIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIefSuppliedCommand() {
        return inIefSuppliedCommand;
    }

    /**
     * Sets the value of the inIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIefSuppliedCommand(String value) {
        this.inIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the inMntRecordingAuthorizer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMntRecordingAuthorizer1() {
        return inMntRecordingAuthorizer1;
    }

    /**
     * Sets the value of the inMntRecordingAuthorizer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMntRecordingAuthorizer1(String value) {
        this.inMntRecordingAuthorizer1 = value;
    }

    /**
     * Gets the value of the inMntRecordingAuthorizer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMntRecordingAuthorizer2() {
        return inMntRecordingAuthorizer2;
    }

    /**
     * Sets the value of the inMntRecordingAuthorizer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMntRecordingAuthorizer2(String value) {
        this.inMntRecordingAuthorizer2 = value;
    }

    /**
     * Gets the value of the inMntRecordingPrftSystem property.
     * 
     */
    public short getInMntRecordingPrftSystem() {
        return inMntRecordingPrftSystem;
    }

    /**
     * Sets the value of the inMntRecordingPrftSystem property.
     * 
     */
    public void setInMntRecordingPrftSystem(short value) {
        this.inMntRecordingPrftSystem = value;
    }

    /**
     * Gets the value of the inMntRecordingReversalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMntRecordingReversalFlag() {
        return inMntRecordingReversalFlag;
    }

    /**
     * Sets the value of the inMntRecordingReversalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMntRecordingReversalFlag(String value) {
        this.inMntRecordingReversalFlag = value;
    }

    /**
     * Gets the value of the inMntRecordingTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMntRecordingTerminalNumber() {
        return inMntRecordingTerminalNumber;
    }

    /**
     * Sets the value of the inMntRecordingTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMntRecordingTerminalNumber(String value) {
        this.inMntRecordingTerminalNumber = value;
    }

    /**
     * Gets the value of the inMntRecordingTrxCode property.
     * 
     */
    public int getInMntRecordingTrxCode() {
        return inMntRecordingTrxCode;
    }

    /**
     * Sets the value of the inMntRecordingTrxCode property.
     * 
     */
    public void setInMntRecordingTrxCode(int value) {
        this.inMntRecordingTrxCode = value;
    }

    /**
     * Gets the value of the inMoreLoanAccountExtraitTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInMoreLoanAccountExtraitTmstamp() {
        return inMoreLoanAccountExtraitTmstamp;
    }

    /**
     * Sets the value of the inMoreLoanAccountExtraitTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInMoreLoanAccountExtraitTmstamp(XMLGregorianCalendar value) {
        this.inMoreLoanAccountExtraitTmstamp = value;
    }

    /**
     * Gets the value of the inMoreLoanAccountExtraitTrxInternalSn property.
     * 
     */
    public short getInMoreLoanAccountExtraitTrxInternalSn() {
        return inMoreLoanAccountExtraitTrxInternalSn;
    }

    /**
     * Sets the value of the inMoreLoanAccountExtraitTrxInternalSn property.
     * 
     */
    public void setInMoreLoanAccountExtraitTrxInternalSn(short value) {
        this.inMoreLoanAccountExtraitTrxInternalSn = value;
    }

    /**
     * Gets the value of the inToIefSuppliedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInToIefSuppliedDate() {
        return inToIefSuppliedDate;
    }

    /**
     * Sets the value of the inToIefSuppliedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInToIefSuppliedDate(XMLGregorianCalendar value) {
        this.inToIefSuppliedDate = value;
    }

}
