
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for T2160VInsuranceApplicationListImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T2160VInsuranceApplicationListImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCancelDateFromIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCancelDateToIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIssCommitmentDrAccCustomerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIssCommitmentEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIssCommitmentFkFinalizeUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIssCommitmentFkResponsibleUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIssCommitmentIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InIssCommitmentIssueType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InIssCommitmentServiceProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIssCommitmentTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InIssueDateToIefSuppliedIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLastUpdateDateIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InMoreIssCommitmentTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRenewalDateFromIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InRenewalDateToIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InSelectedCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSelectedCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T2160VInsuranceApplicationListImport", propOrder = {
    "command",
    "inCancelDateFromIefSuppliedDate",
    "inCancelDateToIefSuppliedDate",
    "inIefSuppliedCommand",
    "inIssCommitmentDrAccCustomerId",
    "inIssCommitmentEntryStatus",
    "inIssCommitmentFkFinalizeUsr",
    "inIssCommitmentFkResponsibleUnit",
    "inIssCommitmentIssueDate",
    "inIssCommitmentIssueType",
    "inIssCommitmentServiceProduct",
    "inIssCommitmentTpSoIdentifier",
    "inIssueDateToIefSuppliedIssueDate",
    "inLastUpdateDateIefSuppliedDate",
    "inMoreIssCommitmentTpSoIdentifier",
    "inPrftTransactionIdTransact",
    "inProfitsAccountAccountNumber",
    "inRenewalDateFromIefSuppliedDate",
    "inRenewalDateToIefSuppliedDate",
    "inSelectedCustomerCDigit",
    "inSelectedCustomerCustId"
})
public class T2160VInsuranceApplicationListImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InCancelDateFromIefSuppliedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCancelDateFromIefSuppliedDate;
    @XmlElement(name = "InCancelDateToIefSuppliedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCancelDateToIefSuppliedDate;
    @XmlElement(name = "InIefSuppliedCommand")
    protected String inIefSuppliedCommand;
    @XmlElement(name = "InIssCommitmentDrAccCustomerId")
    protected int inIssCommitmentDrAccCustomerId;
    @XmlElement(name = "InIssCommitmentEntryStatus")
    protected String inIssCommitmentEntryStatus;
    @XmlElement(name = "InIssCommitmentFkFinalizeUsr")
    protected String inIssCommitmentFkFinalizeUsr;
    @XmlElement(name = "InIssCommitmentFkResponsibleUnit")
    protected int inIssCommitmentFkResponsibleUnit;
    @XmlElement(name = "InIssCommitmentIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inIssCommitmentIssueDate;
    @XmlElement(name = "InIssCommitmentIssueType")
    protected short inIssCommitmentIssueType;
    @XmlElement(name = "InIssCommitmentServiceProduct")
    protected int inIssCommitmentServiceProduct;
    @XmlElement(name = "InIssCommitmentTpSoIdentifier")
    protected double inIssCommitmentTpSoIdentifier;
    @XmlElement(name = "InIssueDateToIefSuppliedIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inIssueDateToIefSuppliedIssueDate;
    @XmlElement(name = "InLastUpdateDateIefSuppliedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLastUpdateDateIefSuppliedDate;
    @XmlElement(name = "InMoreIssCommitmentTpSoIdentifier")
    protected double inMoreIssCommitmentTpSoIdentifier;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InProfitsAccountAccountNumber")
    protected String inProfitsAccountAccountNumber;
    @XmlElement(name = "InRenewalDateFromIefSuppliedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inRenewalDateFromIefSuppliedDate;
    @XmlElement(name = "InRenewalDateToIefSuppliedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inRenewalDateToIefSuppliedDate;
    @XmlElement(name = "InSelectedCustomerCDigit")
    protected short inSelectedCustomerCDigit;
    @XmlElement(name = "InSelectedCustomerCustId")
    protected int inSelectedCustomerCustId;

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
     * Gets the value of the inCancelDateFromIefSuppliedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCancelDateFromIefSuppliedDate() {
        return inCancelDateFromIefSuppliedDate;
    }

    /**
     * Sets the value of the inCancelDateFromIefSuppliedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCancelDateFromIefSuppliedDate(XMLGregorianCalendar value) {
        this.inCancelDateFromIefSuppliedDate = value;
    }

    /**
     * Gets the value of the inCancelDateToIefSuppliedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCancelDateToIefSuppliedDate() {
        return inCancelDateToIefSuppliedDate;
    }

    /**
     * Sets the value of the inCancelDateToIefSuppliedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCancelDateToIefSuppliedDate(XMLGregorianCalendar value) {
        this.inCancelDateToIefSuppliedDate = value;
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
     * Gets the value of the inIssCommitmentDrAccCustomerId property.
     * 
     */
    public int getInIssCommitmentDrAccCustomerId() {
        return inIssCommitmentDrAccCustomerId;
    }

    /**
     * Sets the value of the inIssCommitmentDrAccCustomerId property.
     * 
     */
    public void setInIssCommitmentDrAccCustomerId(int value) {
        this.inIssCommitmentDrAccCustomerId = value;
    }

    /**
     * Gets the value of the inIssCommitmentEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIssCommitmentEntryStatus() {
        return inIssCommitmentEntryStatus;
    }

    /**
     * Sets the value of the inIssCommitmentEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIssCommitmentEntryStatus(String value) {
        this.inIssCommitmentEntryStatus = value;
    }

    /**
     * Gets the value of the inIssCommitmentFkFinalizeUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIssCommitmentFkFinalizeUsr() {
        return inIssCommitmentFkFinalizeUsr;
    }

    /**
     * Sets the value of the inIssCommitmentFkFinalizeUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIssCommitmentFkFinalizeUsr(String value) {
        this.inIssCommitmentFkFinalizeUsr = value;
    }

    /**
     * Gets the value of the inIssCommitmentFkResponsibleUnit property.
     * 
     */
    public int getInIssCommitmentFkResponsibleUnit() {
        return inIssCommitmentFkResponsibleUnit;
    }

    /**
     * Sets the value of the inIssCommitmentFkResponsibleUnit property.
     * 
     */
    public void setInIssCommitmentFkResponsibleUnit(int value) {
        this.inIssCommitmentFkResponsibleUnit = value;
    }

    /**
     * Gets the value of the inIssCommitmentIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInIssCommitmentIssueDate() {
        return inIssCommitmentIssueDate;
    }

    /**
     * Sets the value of the inIssCommitmentIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInIssCommitmentIssueDate(XMLGregorianCalendar value) {
        this.inIssCommitmentIssueDate = value;
    }

    /**
     * Gets the value of the inIssCommitmentIssueType property.
     * 
     */
    public short getInIssCommitmentIssueType() {
        return inIssCommitmentIssueType;
    }

    /**
     * Sets the value of the inIssCommitmentIssueType property.
     * 
     */
    public void setInIssCommitmentIssueType(short value) {
        this.inIssCommitmentIssueType = value;
    }

    /**
     * Gets the value of the inIssCommitmentServiceProduct property.
     * 
     */
    public int getInIssCommitmentServiceProduct() {
        return inIssCommitmentServiceProduct;
    }

    /**
     * Sets the value of the inIssCommitmentServiceProduct property.
     * 
     */
    public void setInIssCommitmentServiceProduct(int value) {
        this.inIssCommitmentServiceProduct = value;
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
     * Gets the value of the inIssueDateToIefSuppliedIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInIssueDateToIefSuppliedIssueDate() {
        return inIssueDateToIefSuppliedIssueDate;
    }

    /**
     * Sets the value of the inIssueDateToIefSuppliedIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInIssueDateToIefSuppliedIssueDate(XMLGregorianCalendar value) {
        this.inIssueDateToIefSuppliedIssueDate = value;
    }

    /**
     * Gets the value of the inLastUpdateDateIefSuppliedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLastUpdateDateIefSuppliedDate() {
        return inLastUpdateDateIefSuppliedDate;
    }

    /**
     * Sets the value of the inLastUpdateDateIefSuppliedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLastUpdateDateIefSuppliedDate(XMLGregorianCalendar value) {
        this.inLastUpdateDateIefSuppliedDate = value;
    }

    /**
     * Gets the value of the inMoreIssCommitmentTpSoIdentifier property.
     * 
     */
    public double getInMoreIssCommitmentTpSoIdentifier() {
        return inMoreIssCommitmentTpSoIdentifier;
    }

    /**
     * Sets the value of the inMoreIssCommitmentTpSoIdentifier property.
     * 
     */
    public void setInMoreIssCommitmentTpSoIdentifier(double value) {
        this.inMoreIssCommitmentTpSoIdentifier = value;
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
     * Gets the value of the inRenewalDateFromIefSuppliedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInRenewalDateFromIefSuppliedDate() {
        return inRenewalDateFromIefSuppliedDate;
    }

    /**
     * Sets the value of the inRenewalDateFromIefSuppliedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInRenewalDateFromIefSuppliedDate(XMLGregorianCalendar value) {
        this.inRenewalDateFromIefSuppliedDate = value;
    }

    /**
     * Gets the value of the inRenewalDateToIefSuppliedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInRenewalDateToIefSuppliedDate() {
        return inRenewalDateToIefSuppliedDate;
    }

    /**
     * Sets the value of the inRenewalDateToIefSuppliedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInRenewalDateToIefSuppliedDate(XMLGregorianCalendar value) {
        this.inRenewalDateToIefSuppliedDate = value;
    }

    /**
     * Gets the value of the inSelectedCustomerCDigit property.
     * 
     */
    public short getInSelectedCustomerCDigit() {
        return inSelectedCustomerCDigit;
    }

    /**
     * Sets the value of the inSelectedCustomerCDigit property.
     * 
     */
    public void setInSelectedCustomerCDigit(short value) {
        this.inSelectedCustomerCDigit = value;
    }

    /**
     * Gets the value of the inSelectedCustomerCustId property.
     * 
     */
    public int getInSelectedCustomerCustId() {
        return inSelectedCustomerCustId;
    }

    /**
     * Sets the value of the inSelectedCustomerCustId property.
     * 
     */
    public void setInSelectedCustomerCustId(int value) {
        this.inSelectedCustomerCustId = value;
    }

}
