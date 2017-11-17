
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for I0128VCustomerRelationshipListImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="I0128VCustomerRelationshipListImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAccntGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAccntGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAccntGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAccntGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAccntRelationshipAccntAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InAccntRelationshipAccntAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAccntRelationshipAccntPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDefaultRelationshipTypeTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDescRelationshipRelAllAccounts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDescRelationshipRelDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InKeyACustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InKeyACustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InKeyACustomerTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InKeyBCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InKeyBCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InKeyBCustomerTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InMntRecordingPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMntRecordingTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InOppositeIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InRelAllwdTypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRelAllwdTypeGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRelAllwdTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InRelationshipEffectiveFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InRelationshipExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InRelationshipRelComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRelationshipTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InRelationshipTypeTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InRelationshipTypeTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InWorkDatesProductionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "I0128VCustomerRelationshipListImport", propOrder = {
    "command",
    "inAccntGenericDetailDescription",
    "inAccntGenericDetailParameterType",
    "inAccntGenericDetailSerialNum",
    "inAccntGenericDetailShortDescription",
    "inAccntRelationshipAccntAccountCd",
    "inAccntRelationshipAccntAccountNumber",
    "inAccntRelationshipAccntPrftSystem",
    "inDefaultRelationshipTypeTypeId",
    "inDescRelationshipRelAllAccounts",
    "inDescRelationshipRelDescription",
    "inIefSuppliedCommand",
    "inJustificIdJustific",
    "inKeyACustomerCDigit",
    "inKeyACustomerCustId",
    "inKeyACustomerTmstamp",
    "inKeyBCustomerCDigit",
    "inKeyBCustomerCustId",
    "inKeyBCustomerTmstamp",
    "inMntRecordingPrftSystem",
    "inMntRecordingReversalFlag",
    "inMntRecordingTerminalNumber",
    "inMntRecordingTrxCode",
    "inOppositeIefSuppliedFlag",
    "inProductIdProduct",
    "inProfitsAccountAccountCd",
    "inProfitsAccountAccountNumber",
    "inProfitsAccountPrftSystem",
    "inRelAllwdTypeGenericDetailDescription",
    "inRelAllwdTypeGenericDetailParameterType",
    "inRelAllwdTypeGenericDetailSerialNum",
    "inRelationshipEffectiveFrom",
    "inRelationshipExpiryDate",
    "inRelationshipRelComments",
    "inRelationshipTmstamp",
    "inRelationshipTypeTmstamp",
    "inRelationshipTypeTypeId",
    "inWorkDatesProductionDate"
})
public class I0128VCustomerRelationshipListImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InAccntGenericDetailDescription")
    protected String inAccntGenericDetailDescription;
    @XmlElement(name = "InAccntGenericDetailParameterType")
    protected String inAccntGenericDetailParameterType;
    @XmlElement(name = "InAccntGenericDetailSerialNum")
    protected int inAccntGenericDetailSerialNum;
    @XmlElement(name = "InAccntGenericDetailShortDescription")
    protected String inAccntGenericDetailShortDescription;
    @XmlElement(name = "InAccntRelationshipAccntAccountCd")
    protected short inAccntRelationshipAccntAccountCd;
    @XmlElement(name = "InAccntRelationshipAccntAccountNumber")
    protected String inAccntRelationshipAccntAccountNumber;
    @XmlElement(name = "InAccntRelationshipAccntPrftSystem")
    protected short inAccntRelationshipAccntPrftSystem;
    @XmlElement(name = "InDefaultRelationshipTypeTypeId")
    protected String inDefaultRelationshipTypeTypeId;
    @XmlElement(name = "InDescRelationshipRelAllAccounts")
    protected String inDescRelationshipRelAllAccounts;
    @XmlElement(name = "InDescRelationshipRelDescription")
    protected String inDescRelationshipRelDescription;
    @XmlElement(name = "InIefSuppliedCommand")
    protected String inIefSuppliedCommand;
    @XmlElement(name = "InJustificIdJustific")
    protected int inJustificIdJustific;
    @XmlElement(name = "InKeyACustomerCDigit")
    protected short inKeyACustomerCDigit;
    @XmlElement(name = "InKeyACustomerCustId")
    protected int inKeyACustomerCustId;
    @XmlElement(name = "InKeyACustomerTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inKeyACustomerTmstamp;
    @XmlElement(name = "InKeyBCustomerCDigit")
    protected short inKeyBCustomerCDigit;
    @XmlElement(name = "InKeyBCustomerCustId")
    protected int inKeyBCustomerCustId;
    @XmlElement(name = "InKeyBCustomerTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inKeyBCustomerTmstamp;
    @XmlElement(name = "InMntRecordingPrftSystem")
    protected short inMntRecordingPrftSystem;
    @XmlElement(name = "InMntRecordingReversalFlag")
    protected String inMntRecordingReversalFlag;
    @XmlElement(name = "InMntRecordingTerminalNumber")
    protected String inMntRecordingTerminalNumber;
    @XmlElement(name = "InMntRecordingTrxCode")
    protected int inMntRecordingTrxCode;
    @XmlElement(name = "InOppositeIefSuppliedFlag")
    protected String inOppositeIefSuppliedFlag;
    @XmlElement(name = "InProductIdProduct")
    protected int inProductIdProduct;
    @XmlElement(name = "InProfitsAccountAccountCd")
    protected short inProfitsAccountAccountCd;
    @XmlElement(name = "InProfitsAccountAccountNumber")
    protected String inProfitsAccountAccountNumber;
    @XmlElement(name = "InProfitsAccountPrftSystem")
    protected short inProfitsAccountPrftSystem;
    @XmlElement(name = "InRelAllwdTypeGenericDetailDescription")
    protected String inRelAllwdTypeGenericDetailDescription;
    @XmlElement(name = "InRelAllwdTypeGenericDetailParameterType")
    protected String inRelAllwdTypeGenericDetailParameterType;
    @XmlElement(name = "InRelAllwdTypeGenericDetailSerialNum")
    protected int inRelAllwdTypeGenericDetailSerialNum;
    @XmlElement(name = "InRelationshipEffectiveFrom", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inRelationshipEffectiveFrom;
    @XmlElement(name = "InRelationshipExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inRelationshipExpiryDate;
    @XmlElement(name = "InRelationshipRelComments")
    protected String inRelationshipRelComments;
    @XmlElement(name = "InRelationshipTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inRelationshipTmstamp;
    @XmlElement(name = "InRelationshipTypeTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inRelationshipTypeTmstamp;
    @XmlElement(name = "InRelationshipTypeTypeId")
    protected String inRelationshipTypeTypeId;
    @XmlElement(name = "InWorkDatesProductionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inWorkDatesProductionDate;

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
     * Gets the value of the inAccntGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAccntGenericDetailDescription() {
        return inAccntGenericDetailDescription;
    }

    /**
     * Sets the value of the inAccntGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAccntGenericDetailDescription(String value) {
        this.inAccntGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inAccntGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAccntGenericDetailParameterType() {
        return inAccntGenericDetailParameterType;
    }

    /**
     * Sets the value of the inAccntGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAccntGenericDetailParameterType(String value) {
        this.inAccntGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inAccntGenericDetailSerialNum property.
     * 
     */
    public int getInAccntGenericDetailSerialNum() {
        return inAccntGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inAccntGenericDetailSerialNum property.
     * 
     */
    public void setInAccntGenericDetailSerialNum(int value) {
        this.inAccntGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inAccntGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAccntGenericDetailShortDescription() {
        return inAccntGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inAccntGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAccntGenericDetailShortDescription(String value) {
        this.inAccntGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inAccntRelationshipAccntAccountCd property.
     * 
     */
    public short getInAccntRelationshipAccntAccountCd() {
        return inAccntRelationshipAccntAccountCd;
    }

    /**
     * Sets the value of the inAccntRelationshipAccntAccountCd property.
     * 
     */
    public void setInAccntRelationshipAccntAccountCd(short value) {
        this.inAccntRelationshipAccntAccountCd = value;
    }

    /**
     * Gets the value of the inAccntRelationshipAccntAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAccntRelationshipAccntAccountNumber() {
        return inAccntRelationshipAccntAccountNumber;
    }

    /**
     * Sets the value of the inAccntRelationshipAccntAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAccntRelationshipAccntAccountNumber(String value) {
        this.inAccntRelationshipAccntAccountNumber = value;
    }

    /**
     * Gets the value of the inAccntRelationshipAccntPrftSystem property.
     * 
     */
    public short getInAccntRelationshipAccntPrftSystem() {
        return inAccntRelationshipAccntPrftSystem;
    }

    /**
     * Sets the value of the inAccntRelationshipAccntPrftSystem property.
     * 
     */
    public void setInAccntRelationshipAccntPrftSystem(short value) {
        this.inAccntRelationshipAccntPrftSystem = value;
    }

    /**
     * Gets the value of the inDefaultRelationshipTypeTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDefaultRelationshipTypeTypeId() {
        return inDefaultRelationshipTypeTypeId;
    }

    /**
     * Sets the value of the inDefaultRelationshipTypeTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDefaultRelationshipTypeTypeId(String value) {
        this.inDefaultRelationshipTypeTypeId = value;
    }

    /**
     * Gets the value of the inDescRelationshipRelAllAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDescRelationshipRelAllAccounts() {
        return inDescRelationshipRelAllAccounts;
    }

    /**
     * Sets the value of the inDescRelationshipRelAllAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDescRelationshipRelAllAccounts(String value) {
        this.inDescRelationshipRelAllAccounts = value;
    }

    /**
     * Gets the value of the inDescRelationshipRelDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDescRelationshipRelDescription() {
        return inDescRelationshipRelDescription;
    }

    /**
     * Sets the value of the inDescRelationshipRelDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDescRelationshipRelDescription(String value) {
        this.inDescRelationshipRelDescription = value;
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
     * Gets the value of the inJustificIdJustific property.
     * 
     */
    public int getInJustificIdJustific() {
        return inJustificIdJustific;
    }

    /**
     * Sets the value of the inJustificIdJustific property.
     * 
     */
    public void setInJustificIdJustific(int value) {
        this.inJustificIdJustific = value;
    }

    /**
     * Gets the value of the inKeyACustomerCDigit property.
     * 
     */
    public short getInKeyACustomerCDigit() {
        return inKeyACustomerCDigit;
    }

    /**
     * Sets the value of the inKeyACustomerCDigit property.
     * 
     */
    public void setInKeyACustomerCDigit(short value) {
        this.inKeyACustomerCDigit = value;
    }

    /**
     * Gets the value of the inKeyACustomerCustId property.
     * 
     */
    public int getInKeyACustomerCustId() {
        return inKeyACustomerCustId;
    }

    /**
     * Sets the value of the inKeyACustomerCustId property.
     * 
     */
    public void setInKeyACustomerCustId(int value) {
        this.inKeyACustomerCustId = value;
    }

    /**
     * Gets the value of the inKeyACustomerTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInKeyACustomerTmstamp() {
        return inKeyACustomerTmstamp;
    }

    /**
     * Sets the value of the inKeyACustomerTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInKeyACustomerTmstamp(XMLGregorianCalendar value) {
        this.inKeyACustomerTmstamp = value;
    }

    /**
     * Gets the value of the inKeyBCustomerCDigit property.
     * 
     */
    public short getInKeyBCustomerCDigit() {
        return inKeyBCustomerCDigit;
    }

    /**
     * Sets the value of the inKeyBCustomerCDigit property.
     * 
     */
    public void setInKeyBCustomerCDigit(short value) {
        this.inKeyBCustomerCDigit = value;
    }

    /**
     * Gets the value of the inKeyBCustomerCustId property.
     * 
     */
    public int getInKeyBCustomerCustId() {
        return inKeyBCustomerCustId;
    }

    /**
     * Sets the value of the inKeyBCustomerCustId property.
     * 
     */
    public void setInKeyBCustomerCustId(int value) {
        this.inKeyBCustomerCustId = value;
    }

    /**
     * Gets the value of the inKeyBCustomerTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInKeyBCustomerTmstamp() {
        return inKeyBCustomerTmstamp;
    }

    /**
     * Sets the value of the inKeyBCustomerTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInKeyBCustomerTmstamp(XMLGregorianCalendar value) {
        this.inKeyBCustomerTmstamp = value;
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
     * Gets the value of the inOppositeIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOppositeIefSuppliedFlag() {
        return inOppositeIefSuppliedFlag;
    }

    /**
     * Sets the value of the inOppositeIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOppositeIefSuppliedFlag(String value) {
        this.inOppositeIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inProductIdProduct property.
     * 
     */
    public int getInProductIdProduct() {
        return inProductIdProduct;
    }

    /**
     * Sets the value of the inProductIdProduct property.
     * 
     */
    public void setInProductIdProduct(int value) {
        this.inProductIdProduct = value;
    }

    /**
     * Gets the value of the inProfitsAccountAccountCd property.
     * 
     */
    public short getInProfitsAccountAccountCd() {
        return inProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inProfitsAccountAccountCd property.
     * 
     */
    public void setInProfitsAccountAccountCd(short value) {
        this.inProfitsAccountAccountCd = value;
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
     * Gets the value of the inProfitsAccountPrftSystem property.
     * 
     */
    public short getInProfitsAccountPrftSystem() {
        return inProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inProfitsAccountPrftSystem property.
     * 
     */
    public void setInProfitsAccountPrftSystem(short value) {
        this.inProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inRelAllwdTypeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRelAllwdTypeGenericDetailDescription() {
        return inRelAllwdTypeGenericDetailDescription;
    }

    /**
     * Sets the value of the inRelAllwdTypeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRelAllwdTypeGenericDetailDescription(String value) {
        this.inRelAllwdTypeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inRelAllwdTypeGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRelAllwdTypeGenericDetailParameterType() {
        return inRelAllwdTypeGenericDetailParameterType;
    }

    /**
     * Sets the value of the inRelAllwdTypeGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRelAllwdTypeGenericDetailParameterType(String value) {
        this.inRelAllwdTypeGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inRelAllwdTypeGenericDetailSerialNum property.
     * 
     */
    public int getInRelAllwdTypeGenericDetailSerialNum() {
        return inRelAllwdTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inRelAllwdTypeGenericDetailSerialNum property.
     * 
     */
    public void setInRelAllwdTypeGenericDetailSerialNum(int value) {
        this.inRelAllwdTypeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inRelationshipEffectiveFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInRelationshipEffectiveFrom() {
        return inRelationshipEffectiveFrom;
    }

    /**
     * Sets the value of the inRelationshipEffectiveFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInRelationshipEffectiveFrom(XMLGregorianCalendar value) {
        this.inRelationshipEffectiveFrom = value;
    }

    /**
     * Gets the value of the inRelationshipExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInRelationshipExpiryDate() {
        return inRelationshipExpiryDate;
    }

    /**
     * Sets the value of the inRelationshipExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInRelationshipExpiryDate(XMLGregorianCalendar value) {
        this.inRelationshipExpiryDate = value;
    }

    /**
     * Gets the value of the inRelationshipRelComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRelationshipRelComments() {
        return inRelationshipRelComments;
    }

    /**
     * Sets the value of the inRelationshipRelComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRelationshipRelComments(String value) {
        this.inRelationshipRelComments = value;
    }

    /**
     * Gets the value of the inRelationshipTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInRelationshipTmstamp() {
        return inRelationshipTmstamp;
    }

    /**
     * Sets the value of the inRelationshipTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInRelationshipTmstamp(XMLGregorianCalendar value) {
        this.inRelationshipTmstamp = value;
    }

    /**
     * Gets the value of the inRelationshipTypeTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInRelationshipTypeTmstamp() {
        return inRelationshipTypeTmstamp;
    }

    /**
     * Sets the value of the inRelationshipTypeTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInRelationshipTypeTmstamp(XMLGregorianCalendar value) {
        this.inRelationshipTypeTmstamp = value;
    }

    /**
     * Gets the value of the inRelationshipTypeTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRelationshipTypeTypeId() {
        return inRelationshipTypeTypeId;
    }

    /**
     * Sets the value of the inRelationshipTypeTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRelationshipTypeTypeId(String value) {
        this.inRelationshipTypeTypeId = value;
    }

    /**
     * Gets the value of the inWorkDatesProductionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInWorkDatesProductionDate() {
        return inWorkDatesProductionDate;
    }

    /**
     * Sets the value of the inWorkDatesProductionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInWorkDatesProductionDate(XMLGregorianCalendar value) {
        this.inWorkDatesProductionDate = value;
    }

}
