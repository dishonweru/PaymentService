
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for T2103V_StandingOrderTransferListImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T2103V_StandingOrderTransferListImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProfitsDepAccAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProfitsDepAccCheckDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InMoreTpSoCommitmentTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InNodeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPaymdaysTpSoCommitmentTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentActivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTpSoCommitmentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTpSoCommitmentLastTransferDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTpSoCommitmentOtherSysIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentStandOrderMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T2103V_StandingOrderTransferListImport", propOrder = {
    "command",
    "inCommandIefSuppliedCommand",
    "inCustomerCDigit",
    "inCustomerCustId",
    "inProfitsDepAccAccountNumber",
    "inProfitsDepAccCheckDigit",
    "inMoreTpSoCommitmentTpSoIdentifier",
    "inNodeGenericDetailSerialNum",
    "inPaymdaysTpSoCommitmentTpSoIdentifier",
    "inPrftTransactionIdTransact",
    "inProfitsAccountAccountNumber",
    "inTpSoCommitmentActivationDate",
    "inTpSoCommitmentDescription",
    "inTpSoCommitmentEntryStatus",
    "inTpSoCommitmentIssueDate",
    "inTpSoCommitmentLastTransferDate",
    "inTpSoCommitmentOtherSysIdentifier",
    "inTpSoCommitmentStandOrderMethod",
    "inTpSoCommitmentTpSoIdentifier"
})
public class T2103VStandingOrderTransferListImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InCustomerCDigit")
    protected short inCustomerCDigit;
    @XmlElement(name = "InCustomerCustId")
    protected int inCustomerCustId;
    @XmlElement(name = "InProfitsDepAccAccountNumber")
    protected String inProfitsDepAccAccountNumber;
    @XmlElement(name = "InProfitsDepAccCheckDigit")
    protected short inProfitsDepAccCheckDigit;
    @XmlElement(name = "InMoreTpSoCommitmentTpSoIdentifier")
    protected double inMoreTpSoCommitmentTpSoIdentifier;
    @XmlElement(name = "InNodeGenericDetailSerialNum")
    protected int inNodeGenericDetailSerialNum;
    @XmlElement(name = "InPaymdaysTpSoCommitmentTpSoIdentifier")
    protected double inPaymdaysTpSoCommitmentTpSoIdentifier;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InProfitsAccountAccountNumber")
    protected String inProfitsAccountAccountNumber;
    @XmlElement(name = "InTpSoCommitmentActivationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTpSoCommitmentActivationDate;
    @XmlElement(name = "InTpSoCommitmentDescription")
    protected String inTpSoCommitmentDescription;
    @XmlElement(name = "InTpSoCommitmentEntryStatus")
    protected String inTpSoCommitmentEntryStatus;
    @XmlElement(name = "InTpSoCommitmentIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTpSoCommitmentIssueDate;
    @XmlElement(name = "InTpSoCommitmentLastTransferDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTpSoCommitmentLastTransferDate;
    @XmlElement(name = "InTpSoCommitmentOtherSysIdentifier")
    protected String inTpSoCommitmentOtherSysIdentifier;
    @XmlElement(name = "InTpSoCommitmentStandOrderMethod")
    protected String inTpSoCommitmentStandOrderMethod;
    @XmlElement(name = "InTpSoCommitmentTpSoIdentifier")
    protected double inTpSoCommitmentTpSoIdentifier;

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
     * Gets the value of the inCustomerCDigit property.
     * 
     */
    public short getInCustomerCDigit() {
        return inCustomerCDigit;
    }

    /**
     * Sets the value of the inCustomerCDigit property.
     * 
     */
    public void setInCustomerCDigit(short value) {
        this.inCustomerCDigit = value;
    }

    /**
     * Gets the value of the inCustomerCustId property.
     * 
     */
    public int getInCustomerCustId() {
        return inCustomerCustId;
    }

    /**
     * Sets the value of the inCustomerCustId property.
     * 
     */
    public void setInCustomerCustId(int value) {
        this.inCustomerCustId = value;
    }

    /**
     * Gets the value of the inProfitsDepAccAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProfitsDepAccAccountNumber() {
        return inProfitsDepAccAccountNumber;
    }

    /**
     * Sets the value of the inProfitsDepAccAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProfitsDepAccAccountNumber(String value) {
        this.inProfitsDepAccAccountNumber = value;
    }

    /**
     * Gets the value of the inProfitsDepAccCheckDigit property.
     * 
     */
    public short getInProfitsDepAccCheckDigit() {
        return inProfitsDepAccCheckDigit;
    }

    /**
     * Sets the value of the inProfitsDepAccCheckDigit property.
     * 
     */
    public void setInProfitsDepAccCheckDigit(short value) {
        this.inProfitsDepAccCheckDigit = value;
    }

    /**
     * Gets the value of the inMoreTpSoCommitmentTpSoIdentifier property.
     * 
     */
    public double getInMoreTpSoCommitmentTpSoIdentifier() {
        return inMoreTpSoCommitmentTpSoIdentifier;
    }

    /**
     * Sets the value of the inMoreTpSoCommitmentTpSoIdentifier property.
     * 
     */
    public void setInMoreTpSoCommitmentTpSoIdentifier(double value) {
        this.inMoreTpSoCommitmentTpSoIdentifier = value;
    }

    /**
     * Gets the value of the inNodeGenericDetailSerialNum property.
     * 
     */
    public int getInNodeGenericDetailSerialNum() {
        return inNodeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inNodeGenericDetailSerialNum property.
     * 
     */
    public void setInNodeGenericDetailSerialNum(int value) {
        this.inNodeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inPaymdaysTpSoCommitmentTpSoIdentifier property.
     * 
     */
    public double getInPaymdaysTpSoCommitmentTpSoIdentifier() {
        return inPaymdaysTpSoCommitmentTpSoIdentifier;
    }

    /**
     * Sets the value of the inPaymdaysTpSoCommitmentTpSoIdentifier property.
     * 
     */
    public void setInPaymdaysTpSoCommitmentTpSoIdentifier(double value) {
        this.inPaymdaysTpSoCommitmentTpSoIdentifier = value;
    }

    /**
     * Gets the value of the inPrftTransactionIdTransact property.
     * 
     */
    public int getInPrftTransactionIdTransact() {
        return inPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the inPrftTransactionIdTransact property.
     * 
     */
    public void setInPrftTransactionIdTransact(int value) {
        this.inPrftTransactionIdTransact = value;
    }

    /**
     * Gets the value of the inProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProfitsAccountAccountNumber() {
        return inProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProfitsAccountAccountNumber(String value) {
        this.inProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentActivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTpSoCommitmentActivationDate() {
        return inTpSoCommitmentActivationDate;
    }

    /**
     * Sets the value of the inTpSoCommitmentActivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTpSoCommitmentActivationDate(XMLGregorianCalendar value) {
        this.inTpSoCommitmentActivationDate = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentDescription() {
        return inTpSoCommitmentDescription;
    }

    /**
     * Sets the value of the inTpSoCommitmentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentDescription(String value) {
        this.inTpSoCommitmentDescription = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentEntryStatus() {
        return inTpSoCommitmentEntryStatus;
    }

    /**
     * Sets the value of the inTpSoCommitmentEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentEntryStatus(String value) {
        this.inTpSoCommitmentEntryStatus = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTpSoCommitmentIssueDate() {
        return inTpSoCommitmentIssueDate;
    }

    /**
     * Sets the value of the inTpSoCommitmentIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTpSoCommitmentIssueDate(XMLGregorianCalendar value) {
        this.inTpSoCommitmentIssueDate = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentLastTransferDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTpSoCommitmentLastTransferDate() {
        return inTpSoCommitmentLastTransferDate;
    }

    /**
     * Sets the value of the inTpSoCommitmentLastTransferDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTpSoCommitmentLastTransferDate(XMLGregorianCalendar value) {
        this.inTpSoCommitmentLastTransferDate = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentOtherSysIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentOtherSysIdentifier() {
        return inTpSoCommitmentOtherSysIdentifier;
    }

    /**
     * Sets the value of the inTpSoCommitmentOtherSysIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentOtherSysIdentifier(String value) {
        this.inTpSoCommitmentOtherSysIdentifier = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentStandOrderMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentStandOrderMethod() {
        return inTpSoCommitmentStandOrderMethod;
    }

    /**
     * Sets the value of the inTpSoCommitmentStandOrderMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentStandOrderMethod(String value) {
        this.inTpSoCommitmentStandOrderMethod = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentTpSoIdentifier property.
     * 
     */
    public double getInTpSoCommitmentTpSoIdentifier() {
        return inTpSoCommitmentTpSoIdentifier;
    }

    /**
     * Sets the value of the inTpSoCommitmentTpSoIdentifier property.
     * 
     */
    public void setInTpSoCommitmentTpSoIdentifier(double value) {
        this.inTpSoCommitmentTpSoIdentifier = value;
    }

}
