
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UDF002VDynamicFieldsImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UDF002VDynamicFieldsImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAllowMultipleIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InContinueFromUserDefinedFieldsPfgSetSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InContinueHistUserDefFldHistHistorySn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InContinuePfgTagSetSetupDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InContinuePfgTagSetSetupTagSetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InForCreationIefSuppliedTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InForInsertionUserDefTableAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InForInsertionUserDefTableCDigit1" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InForInsertionUserDefTableCustId1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InForInsertionUserDefTableCustomerCode" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InForInsertionUserDefTablePrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InForInsertionUserDefTableRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InForInsertionUserDefTableTagSetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedPfgTagSetSetupTagSetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSelectedProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedProfitsAccountCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSelectedProfitsAccountProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSsSecurityCmcbPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSsSecurityCmcbTranCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpFields" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfUDF002VInGrpFieldsItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UDF002VDynamicFieldsImport", propOrder = {
    "command",
    "inAllowMultipleIefSuppliedFlag",
    "inCommandIefSuppliedCommand",
    "inContinueFromUserDefinedFieldsPfgSetSn",
    "inContinueHistUserDefFldHistHistorySn",
    "inContinuePfgTagSetSetupDescription",
    "inContinuePfgTagSetSetupTagSetCode",
    "inCustomerCustId",
    "inForCreationIefSuppliedTmstamp",
    "inForInsertionUserDefTableAccountNumber",
    "inForInsertionUserDefTableCDigit1",
    "inForInsertionUserDefTableCustId1",
    "inForInsertionUserDefTableCustomerCode",
    "inForInsertionUserDefTablePrftSystem",
    "inForInsertionUserDefTableRecordType",
    "inForInsertionUserDefTableTagSetCode",
    "inJustificIdJustific",
    "inPrftTransactionIdTransact",
    "inProductIdProduct",
    "inSelectedPfgTagSetSetupTagSetCode",
    "inSelectedProfitsAccountAccountCd",
    "inSelectedProfitsAccountAccountNumber",
    "inSelectedProfitsAccountCustId",
    "inSelectedProfitsAccountPrftSystem",
    "inSelectedProfitsAccountProductId",
    "inSsSecurityCmcbPrftSystem",
    "inSsSecurityCmcbTranCode",
    "inTerminalTerminalNumber",
    "inGrpFields"
})
public class UDF002VDynamicFieldsImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InAllowMultipleIefSuppliedFlag")
    protected String inAllowMultipleIefSuppliedFlag;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InContinueFromUserDefinedFieldsPfgSetSn")
    protected int inContinueFromUserDefinedFieldsPfgSetSn;
    @XmlElement(name = "InContinueHistUserDefFldHistHistorySn")
    protected int inContinueHistUserDefFldHistHistorySn;
    @XmlElement(name = "InContinuePfgTagSetSetupDescription")
    protected String inContinuePfgTagSetSetupDescription;
    @XmlElement(name = "InContinuePfgTagSetSetupTagSetCode")
    protected String inContinuePfgTagSetSetupTagSetCode;
    @XmlElement(name = "InCustomerCustId")
    protected int inCustomerCustId;
    @XmlElement(name = "InForCreationIefSuppliedTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inForCreationIefSuppliedTmstamp;
    @XmlElement(name = "InForInsertionUserDefTableAccountNumber")
    protected String inForInsertionUserDefTableAccountNumber;
    @XmlElement(name = "InForInsertionUserDefTableCDigit1")
    protected short inForInsertionUserDefTableCDigit1;
    @XmlElement(name = "InForInsertionUserDefTableCustId1")
    protected int inForInsertionUserDefTableCustId1;
    @XmlElement(name = "InForInsertionUserDefTableCustomerCode")
    protected double inForInsertionUserDefTableCustomerCode;
    @XmlElement(name = "InForInsertionUserDefTablePrftSystem")
    protected short inForInsertionUserDefTablePrftSystem;
    @XmlElement(name = "InForInsertionUserDefTableRecordType")
    protected String inForInsertionUserDefTableRecordType;
    @XmlElement(name = "InForInsertionUserDefTableTagSetCode")
    protected String inForInsertionUserDefTableTagSetCode;
    @XmlElement(name = "InJustificIdJustific")
    protected int inJustificIdJustific;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InProductIdProduct")
    protected int inProductIdProduct;
    @XmlElement(name = "InSelectedPfgTagSetSetupTagSetCode")
    protected String inSelectedPfgTagSetSetupTagSetCode;
    @XmlElement(name = "InSelectedProfitsAccountAccountCd")
    protected short inSelectedProfitsAccountAccountCd;
    @XmlElement(name = "InSelectedProfitsAccountAccountNumber")
    protected String inSelectedProfitsAccountAccountNumber;
    @XmlElement(name = "InSelectedProfitsAccountCustId")
    protected int inSelectedProfitsAccountCustId;
    @XmlElement(name = "InSelectedProfitsAccountPrftSystem")
    protected short inSelectedProfitsAccountPrftSystem;
    @XmlElement(name = "InSelectedProfitsAccountProductId")
    protected int inSelectedProfitsAccountProductId;
    @XmlElement(name = "InSsSecurityCmcbPrftSystem")
    protected short inSsSecurityCmcbPrftSystem;
    @XmlElement(name = "InSsSecurityCmcbTranCode")
    protected String inSsSecurityCmcbTranCode;
    @XmlElement(name = "InTerminalTerminalNumber")
    protected String inTerminalTerminalNumber;
    @XmlElement(name = "InGrpFields")
    protected ArrayOfUDF002VInGrpFieldsItem inGrpFields;

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
     * Gets the value of the inAllowMultipleIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAllowMultipleIefSuppliedFlag() {
        return inAllowMultipleIefSuppliedFlag;
    }

    /**
     * Sets the value of the inAllowMultipleIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAllowMultipleIefSuppliedFlag(String value) {
        this.inAllowMultipleIefSuppliedFlag = value;
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
     * Gets the value of the inContinueFromUserDefinedFieldsPfgSetSn property.
     * 
     */
    public int getInContinueFromUserDefinedFieldsPfgSetSn() {
        return inContinueFromUserDefinedFieldsPfgSetSn;
    }

    /**
     * Sets the value of the inContinueFromUserDefinedFieldsPfgSetSn property.
     * 
     */
    public void setInContinueFromUserDefinedFieldsPfgSetSn(int value) {
        this.inContinueFromUserDefinedFieldsPfgSetSn = value;
    }

    /**
     * Gets the value of the inContinueHistUserDefFldHistHistorySn property.
     * 
     */
    public int getInContinueHistUserDefFldHistHistorySn() {
        return inContinueHistUserDefFldHistHistorySn;
    }

    /**
     * Sets the value of the inContinueHistUserDefFldHistHistorySn property.
     * 
     */
    public void setInContinueHistUserDefFldHistHistorySn(int value) {
        this.inContinueHistUserDefFldHistHistorySn = value;
    }

    /**
     * Gets the value of the inContinuePfgTagSetSetupDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInContinuePfgTagSetSetupDescription() {
        return inContinuePfgTagSetSetupDescription;
    }

    /**
     * Sets the value of the inContinuePfgTagSetSetupDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInContinuePfgTagSetSetupDescription(String value) {
        this.inContinuePfgTagSetSetupDescription = value;
    }

    /**
     * Gets the value of the inContinuePfgTagSetSetupTagSetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInContinuePfgTagSetSetupTagSetCode() {
        return inContinuePfgTagSetSetupTagSetCode;
    }

    /**
     * Sets the value of the inContinuePfgTagSetSetupTagSetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInContinuePfgTagSetSetupTagSetCode(String value) {
        this.inContinuePfgTagSetSetupTagSetCode = value;
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
     * Gets the value of the inForCreationIefSuppliedTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInForCreationIefSuppliedTmstamp() {
        return inForCreationIefSuppliedTmstamp;
    }

    /**
     * Sets the value of the inForCreationIefSuppliedTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInForCreationIefSuppliedTmstamp(XMLGregorianCalendar value) {
        this.inForCreationIefSuppliedTmstamp = value;
    }

    /**
     * Gets the value of the inForInsertionUserDefTableAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInForInsertionUserDefTableAccountNumber() {
        return inForInsertionUserDefTableAccountNumber;
    }

    /**
     * Sets the value of the inForInsertionUserDefTableAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInForInsertionUserDefTableAccountNumber(String value) {
        this.inForInsertionUserDefTableAccountNumber = value;
    }

    /**
     * Gets the value of the inForInsertionUserDefTableCDigit1 property.
     * 
     */
    public short getInForInsertionUserDefTableCDigit1() {
        return inForInsertionUserDefTableCDigit1;
    }

    /**
     * Sets the value of the inForInsertionUserDefTableCDigit1 property.
     * 
     */
    public void setInForInsertionUserDefTableCDigit1(short value) {
        this.inForInsertionUserDefTableCDigit1 = value;
    }

    /**
     * Gets the value of the inForInsertionUserDefTableCustId1 property.
     * 
     */
    public int getInForInsertionUserDefTableCustId1() {
        return inForInsertionUserDefTableCustId1;
    }

    /**
     * Sets the value of the inForInsertionUserDefTableCustId1 property.
     * 
     */
    public void setInForInsertionUserDefTableCustId1(int value) {
        this.inForInsertionUserDefTableCustId1 = value;
    }

    /**
     * Gets the value of the inForInsertionUserDefTableCustomerCode property.
     * 
     */
    public double getInForInsertionUserDefTableCustomerCode() {
        return inForInsertionUserDefTableCustomerCode;
    }

    /**
     * Sets the value of the inForInsertionUserDefTableCustomerCode property.
     * 
     */
    public void setInForInsertionUserDefTableCustomerCode(double value) {
        this.inForInsertionUserDefTableCustomerCode = value;
    }

    /**
     * Gets the value of the inForInsertionUserDefTablePrftSystem property.
     * 
     */
    public short getInForInsertionUserDefTablePrftSystem() {
        return inForInsertionUserDefTablePrftSystem;
    }

    /**
     * Sets the value of the inForInsertionUserDefTablePrftSystem property.
     * 
     */
    public void setInForInsertionUserDefTablePrftSystem(short value) {
        this.inForInsertionUserDefTablePrftSystem = value;
    }

    /**
     * Gets the value of the inForInsertionUserDefTableRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInForInsertionUserDefTableRecordType() {
        return inForInsertionUserDefTableRecordType;
    }

    /**
     * Sets the value of the inForInsertionUserDefTableRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInForInsertionUserDefTableRecordType(String value) {
        this.inForInsertionUserDefTableRecordType = value;
    }

    /**
     * Gets the value of the inForInsertionUserDefTableTagSetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInForInsertionUserDefTableTagSetCode() {
        return inForInsertionUserDefTableTagSetCode;
    }

    /**
     * Sets the value of the inForInsertionUserDefTableTagSetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInForInsertionUserDefTableTagSetCode(String value) {
        this.inForInsertionUserDefTableTagSetCode = value;
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
     * Gets the value of the inSelectedPfgTagSetSetupTagSetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedPfgTagSetSetupTagSetCode() {
        return inSelectedPfgTagSetSetupTagSetCode;
    }

    /**
     * Sets the value of the inSelectedPfgTagSetSetupTagSetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedPfgTagSetSetupTagSetCode(String value) {
        this.inSelectedPfgTagSetSetupTagSetCode = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountAccountCd property.
     * 
     */
    public short getInSelectedProfitsAccountAccountCd() {
        return inSelectedProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountAccountCd property.
     * 
     */
    public void setInSelectedProfitsAccountAccountCd(short value) {
        this.inSelectedProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedProfitsAccountAccountNumber() {
        return inSelectedProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedProfitsAccountAccountNumber(String value) {
        this.inSelectedProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountCustId property.
     * 
     */
    public int getInSelectedProfitsAccountCustId() {
        return inSelectedProfitsAccountCustId;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountCustId property.
     * 
     */
    public void setInSelectedProfitsAccountCustId(int value) {
        this.inSelectedProfitsAccountCustId = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountPrftSystem property.
     * 
     */
    public short getInSelectedProfitsAccountPrftSystem() {
        return inSelectedProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountPrftSystem property.
     * 
     */
    public void setInSelectedProfitsAccountPrftSystem(short value) {
        this.inSelectedProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountProductId property.
     * 
     */
    public int getInSelectedProfitsAccountProductId() {
        return inSelectedProfitsAccountProductId;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountProductId property.
     * 
     */
    public void setInSelectedProfitsAccountProductId(int value) {
        this.inSelectedProfitsAccountProductId = value;
    }

    /**
     * Gets the value of the inSsSecurityCmcbPrftSystem property.
     * 
     */
    public short getInSsSecurityCmcbPrftSystem() {
        return inSsSecurityCmcbPrftSystem;
    }

    /**
     * Sets the value of the inSsSecurityCmcbPrftSystem property.
     * 
     */
    public void setInSsSecurityCmcbPrftSystem(short value) {
        this.inSsSecurityCmcbPrftSystem = value;
    }

    /**
     * Gets the value of the inSsSecurityCmcbTranCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSsSecurityCmcbTranCode() {
        return inSsSecurityCmcbTranCode;
    }

    /**
     * Sets the value of the inSsSecurityCmcbTranCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSsSecurityCmcbTranCode(String value) {
        this.inSsSecurityCmcbTranCode = value;
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
     * Gets the value of the inGrpFields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUDF002VInGrpFieldsItem }
     *     
     */
    public ArrayOfUDF002VInGrpFieldsItem getInGrpFields() {
        return inGrpFields;
    }

    /**
     * Sets the value of the inGrpFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUDF002VInGrpFieldsItem }
     *     
     */
    public void setInGrpFields(ArrayOfUDF002VInGrpFieldsItem value) {
        this.inGrpFields = value;
    }

}
