
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for T2104V_StandingOrdersInquiryImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T2104V_StandingOrdersInquiryImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCriteriaHistSoCommitmentTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InCriteriaProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCriteriaProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDateFromIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDateToIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InIssCommitmStsIefSuppliedIssCommitmentSts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InJunctionFromGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InJunctionToGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMoreGrmDrAccountListDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InMoreGrmDrCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMoreGrmTpSoCommitmentActivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InMoreGrmTpSoCommitmentTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InMoreGrmUnitUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMoreIefSuppliedCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InRmUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InScreenTpSoCommitmentEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InStatusTpSoCommitmentEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InUnitFromUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InUnitToUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T2104V_StandingOrdersInquiryImport", propOrder = {
    "command",
    "inCriteriaHistSoCommitmentTpSoIdentifier",
    "inCriteriaProductDescription",
    "inCriteriaProductIdProduct",
    "inCustomerCDigit",
    "inCustomerCustId",
    "inCustomerSurname",
    "inDateFromIefSuppliedDate",
    "inDateToIefSuppliedDate",
    "inIssCommitmStsIefSuppliedIssCommitmentSts",
    "inJunctionFromGenericDetailSerialNum",
    "inJunctionToGenericDetailSerialNum",
    "inMoreGrmDrAccountListDepositAccountAccountNumber",
    "inMoreGrmDrCustomerCustId",
    "inMoreGrmTpSoCommitmentActivationDate",
    "inMoreGrmTpSoCommitmentTpSoIdentifier",
    "inMoreGrmUnitUnitCode",
    "inMoreIefSuppliedCount",
    "inRmUsrCode",
    "inScreenTpSoCommitmentEntryStatus",
    "inStatusTpSoCommitmentEntryStatus",
    "inUnitFromUnitCode",
    "inUnitToUnitCode"
})
public class T2104VStandingOrdersInquiryImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InCriteriaHistSoCommitmentTpSoIdentifier")
    protected double inCriteriaHistSoCommitmentTpSoIdentifier;
    @XmlElement(name = "InCriteriaProductDescription")
    protected String inCriteriaProductDescription;
    @XmlElement(name = "InCriteriaProductIdProduct")
    protected int inCriteriaProductIdProduct;
    @XmlElement(name = "InCustomerCDigit")
    protected short inCustomerCDigit;
    @XmlElement(name = "InCustomerCustId")
    protected int inCustomerCustId;
    @XmlElement(name = "InCustomerSurname")
    protected String inCustomerSurname;
    @XmlElement(name = "InDateFromIefSuppliedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDateFromIefSuppliedDate;
    @XmlElement(name = "InDateToIefSuppliedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDateToIefSuppliedDate;
    @XmlElement(name = "InIssCommitmStsIefSuppliedIssCommitmentSts")
    protected String inIssCommitmStsIefSuppliedIssCommitmentSts;
    @XmlElement(name = "InJunctionFromGenericDetailSerialNum")
    protected int inJunctionFromGenericDetailSerialNum;
    @XmlElement(name = "InJunctionToGenericDetailSerialNum")
    protected int inJunctionToGenericDetailSerialNum;
    @XmlElement(name = "InMoreGrmDrAccountListDepositAccountAccountNumber")
    protected double inMoreGrmDrAccountListDepositAccountAccountNumber;
    @XmlElement(name = "InMoreGrmDrCustomerCustId")
    protected int inMoreGrmDrCustomerCustId;
    @XmlElement(name = "InMoreGrmTpSoCommitmentActivationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inMoreGrmTpSoCommitmentActivationDate;
    @XmlElement(name = "InMoreGrmTpSoCommitmentTpSoIdentifier")
    protected double inMoreGrmTpSoCommitmentTpSoIdentifier;
    @XmlElement(name = "InMoreGrmUnitUnitCode")
    protected int inMoreGrmUnitUnitCode;
    @XmlElement(name = "InMoreIefSuppliedCount")
    protected int inMoreIefSuppliedCount;
    @XmlElement(name = "InRmUsrCode")
    protected String inRmUsrCode;
    @XmlElement(name = "InScreenTpSoCommitmentEntryStatus")
    protected String inScreenTpSoCommitmentEntryStatus;
    @XmlElement(name = "InStatusTpSoCommitmentEntryStatus")
    protected String inStatusTpSoCommitmentEntryStatus;
    @XmlElement(name = "InUnitFromUnitCode")
    protected int inUnitFromUnitCode;
    @XmlElement(name = "InUnitToUnitCode")
    protected int inUnitToUnitCode;

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
     * Gets the value of the inCriteriaHistSoCommitmentTpSoIdentifier property.
     * 
     */
    public double getInCriteriaHistSoCommitmentTpSoIdentifier() {
        return inCriteriaHistSoCommitmentTpSoIdentifier;
    }

    /**
     * Sets the value of the inCriteriaHistSoCommitmentTpSoIdentifier property.
     * 
     */
    public void setInCriteriaHistSoCommitmentTpSoIdentifier(double value) {
        this.inCriteriaHistSoCommitmentTpSoIdentifier = value;
    }

    /**
     * Gets the value of the inCriteriaProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCriteriaProductDescription() {
        return inCriteriaProductDescription;
    }

    /**
     * Sets the value of the inCriteriaProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCriteriaProductDescription(String value) {
        this.inCriteriaProductDescription = value;
    }

    /**
     * Gets the value of the inCriteriaProductIdProduct property.
     * 
     */
    public int getInCriteriaProductIdProduct() {
        return inCriteriaProductIdProduct;
    }

    /**
     * Sets the value of the inCriteriaProductIdProduct property.
     * 
     */
    public void setInCriteriaProductIdProduct(int value) {
        this.inCriteriaProductIdProduct = value;
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
     * Gets the value of the inCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerSurname() {
        return inCustomerSurname;
    }

    /**
     * Sets the value of the inCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerSurname(String value) {
        this.inCustomerSurname = value;
    }

    /**
     * Gets the value of the inDateFromIefSuppliedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDateFromIefSuppliedDate() {
        return inDateFromIefSuppliedDate;
    }

    /**
     * Sets the value of the inDateFromIefSuppliedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDateFromIefSuppliedDate(XMLGregorianCalendar value) {
        this.inDateFromIefSuppliedDate = value;
    }

    /**
     * Gets the value of the inDateToIefSuppliedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDateToIefSuppliedDate() {
        return inDateToIefSuppliedDate;
    }

    /**
     * Sets the value of the inDateToIefSuppliedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDateToIefSuppliedDate(XMLGregorianCalendar value) {
        this.inDateToIefSuppliedDate = value;
    }

    /**
     * Gets the value of the inIssCommitmStsIefSuppliedIssCommitmentSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIssCommitmStsIefSuppliedIssCommitmentSts() {
        return inIssCommitmStsIefSuppliedIssCommitmentSts;
    }

    /**
     * Sets the value of the inIssCommitmStsIefSuppliedIssCommitmentSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIssCommitmStsIefSuppliedIssCommitmentSts(String value) {
        this.inIssCommitmStsIefSuppliedIssCommitmentSts = value;
    }

    /**
     * Gets the value of the inJunctionFromGenericDetailSerialNum property.
     * 
     */
    public int getInJunctionFromGenericDetailSerialNum() {
        return inJunctionFromGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inJunctionFromGenericDetailSerialNum property.
     * 
     */
    public void setInJunctionFromGenericDetailSerialNum(int value) {
        this.inJunctionFromGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inJunctionToGenericDetailSerialNum property.
     * 
     */
    public int getInJunctionToGenericDetailSerialNum() {
        return inJunctionToGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inJunctionToGenericDetailSerialNum property.
     * 
     */
    public void setInJunctionToGenericDetailSerialNum(int value) {
        this.inJunctionToGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inMoreGrmDrAccountListDepositAccountAccountNumber property.
     * 
     */
    public double getInMoreGrmDrAccountListDepositAccountAccountNumber() {
        return inMoreGrmDrAccountListDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the inMoreGrmDrAccountListDepositAccountAccountNumber property.
     * 
     */
    public void setInMoreGrmDrAccountListDepositAccountAccountNumber(double value) {
        this.inMoreGrmDrAccountListDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inMoreGrmDrCustomerCustId property.
     * 
     */
    public int getInMoreGrmDrCustomerCustId() {
        return inMoreGrmDrCustomerCustId;
    }

    /**
     * Sets the value of the inMoreGrmDrCustomerCustId property.
     * 
     */
    public void setInMoreGrmDrCustomerCustId(int value) {
        this.inMoreGrmDrCustomerCustId = value;
    }

    /**
     * Gets the value of the inMoreGrmTpSoCommitmentActivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInMoreGrmTpSoCommitmentActivationDate() {
        return inMoreGrmTpSoCommitmentActivationDate;
    }

    /**
     * Sets the value of the inMoreGrmTpSoCommitmentActivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInMoreGrmTpSoCommitmentActivationDate(XMLGregorianCalendar value) {
        this.inMoreGrmTpSoCommitmentActivationDate = value;
    }

    /**
     * Gets the value of the inMoreGrmTpSoCommitmentTpSoIdentifier property.
     * 
     */
    public double getInMoreGrmTpSoCommitmentTpSoIdentifier() {
        return inMoreGrmTpSoCommitmentTpSoIdentifier;
    }

    /**
     * Sets the value of the inMoreGrmTpSoCommitmentTpSoIdentifier property.
     * 
     */
    public void setInMoreGrmTpSoCommitmentTpSoIdentifier(double value) {
        this.inMoreGrmTpSoCommitmentTpSoIdentifier = value;
    }

    /**
     * Gets the value of the inMoreGrmUnitUnitCode property.
     * 
     */
    public int getInMoreGrmUnitUnitCode() {
        return inMoreGrmUnitUnitCode;
    }

    /**
     * Sets the value of the inMoreGrmUnitUnitCode property.
     * 
     */
    public void setInMoreGrmUnitUnitCode(int value) {
        this.inMoreGrmUnitUnitCode = value;
    }

    /**
     * Gets the value of the inMoreIefSuppliedCount property.
     * 
     */
    public int getInMoreIefSuppliedCount() {
        return inMoreIefSuppliedCount;
    }

    /**
     * Sets the value of the inMoreIefSuppliedCount property.
     * 
     */
    public void setInMoreIefSuppliedCount(int value) {
        this.inMoreIefSuppliedCount = value;
    }

    /**
     * Gets the value of the inRmUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRmUsrCode() {
        return inRmUsrCode;
    }

    /**
     * Sets the value of the inRmUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRmUsrCode(String value) {
        this.inRmUsrCode = value;
    }

    /**
     * Gets the value of the inScreenTpSoCommitmentEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInScreenTpSoCommitmentEntryStatus() {
        return inScreenTpSoCommitmentEntryStatus;
    }

    /**
     * Sets the value of the inScreenTpSoCommitmentEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInScreenTpSoCommitmentEntryStatus(String value) {
        this.inScreenTpSoCommitmentEntryStatus = value;
    }

    /**
     * Gets the value of the inStatusTpSoCommitmentEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInStatusTpSoCommitmentEntryStatus() {
        return inStatusTpSoCommitmentEntryStatus;
    }

    /**
     * Sets the value of the inStatusTpSoCommitmentEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInStatusTpSoCommitmentEntryStatus(String value) {
        this.inStatusTpSoCommitmentEntryStatus = value;
    }

    /**
     * Gets the value of the inUnitFromUnitCode property.
     * 
     */
    public int getInUnitFromUnitCode() {
        return inUnitFromUnitCode;
    }

    /**
     * Sets the value of the inUnitFromUnitCode property.
     * 
     */
    public void setInUnitFromUnitCode(int value) {
        this.inUnitFromUnitCode = value;
    }

    /**
     * Gets the value of the inUnitToUnitCode property.
     * 
     */
    public int getInUnitToUnitCode() {
        return inUnitToUnitCode;
    }

    /**
     * Sets the value of the inUnitToUnitCode property.
     * 
     */
    public void setInUnitToUnitCode(int value) {
        this.inUnitToUnitCode = value;
    }

}
