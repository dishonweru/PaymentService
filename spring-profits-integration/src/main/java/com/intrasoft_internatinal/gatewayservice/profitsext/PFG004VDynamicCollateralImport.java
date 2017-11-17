
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PFG004VDynamicCollateralImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PFG004VDynamicCollateralImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCltCollateralTableCDigit1" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCltCollateralTableCustId1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCltCollateralTableInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InCltCollateralTableRecordDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCltCollateralTableRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCltPfgTagSetSetupTagSetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDescriptionCollateralTblDocDocDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDescriptionCollateralTblDocDocDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDocumentManagementFileSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InDocumentManagementReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpParametersInGrmTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPreInsertedCollateralTableInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InPreInsertedCollateralTableRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InRetreiveFromCollateralFieldsPfgSetSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedPfgSetupDetailSetCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedPfgSetupDetailSetSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedPfgSetupDetailTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedPfgSetupDetailTagSetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSingleCollateralTblDocInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InSingleCollateralTblDocPrftSys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSingleCollateralTblDocRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSingleCollateralTblDocReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSsSecurityCmcbPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSsSecurityCmcbTranCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpFields" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfPFG004VInGrpFieldsItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PFG004VDynamicCollateralImport", propOrder = {
    "command",
    "inCltCollateralTableCDigit1",
    "inCltCollateralTableCustId1",
    "inCltCollateralTableInternalSn",
    "inCltCollateralTableRecordDescr",
    "inCltCollateralTableRecordType",
    "inCltPfgTagSetSetupTagSetCode",
    "inCommandIefSuppliedCommand",
    "inDescriptionCollateralTblDocDocDescr",
    "inDescriptionCollateralTblDocDocDetails",
    "inDocumentManagementFileSn",
    "inDocumentManagementReferenceNumber",
    "inGrpParametersInGrmTerminalTerminalNumber",
    "inJustificIdJustific",
    "inPreInsertedCollateralTableInternalSn",
    "inPreInsertedCollateralTableRecordType",
    "inPrftTransactionIdTransact",
    "inProductIdProduct",
    "inRetreiveFromCollateralFieldsPfgSetSn",
    "inSelectedPfgSetupDetailSetCategory",
    "inSelectedPfgSetupDetailSetSn",
    "inSelectedPfgSetupDetailTag",
    "inSelectedPfgSetupDetailTagSetCode",
    "inSingleCollateralTblDocInternalSn",
    "inSingleCollateralTblDocPrftSys",
    "inSingleCollateralTblDocRecordType",
    "inSingleCollateralTblDocReferenceNumber",
    "inSsSecurityCmcbPrftSystem",
    "inSsSecurityCmcbTranCode",
    "inGrpFields"
})
public class PFG004VDynamicCollateralImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InCltCollateralTableCDigit1")
    protected short inCltCollateralTableCDigit1;
    @XmlElement(name = "InCltCollateralTableCustId1")
    protected int inCltCollateralTableCustId1;
    @XmlElement(name = "InCltCollateralTableInternalSn")
    protected double inCltCollateralTableInternalSn;
    @XmlElement(name = "InCltCollateralTableRecordDescr")
    protected String inCltCollateralTableRecordDescr;
    @XmlElement(name = "InCltCollateralTableRecordType")
    protected String inCltCollateralTableRecordType;
    @XmlElement(name = "InCltPfgTagSetSetupTagSetCode")
    protected String inCltPfgTagSetSetupTagSetCode;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InDescriptionCollateralTblDocDocDescr")
    protected String inDescriptionCollateralTblDocDocDescr;
    @XmlElement(name = "InDescriptionCollateralTblDocDocDetails")
    protected String inDescriptionCollateralTblDocDocDetails;
    @XmlElement(name = "InDocumentManagementFileSn")
    protected double inDocumentManagementFileSn;
    @XmlElement(name = "InDocumentManagementReferenceNumber")
    protected String inDocumentManagementReferenceNumber;
    @XmlElement(name = "InGrpParametersInGrmTerminalTerminalNumber")
    protected String inGrpParametersInGrmTerminalTerminalNumber;
    @XmlElement(name = "InJustificIdJustific")
    protected int inJustificIdJustific;
    @XmlElement(name = "InPreInsertedCollateralTableInternalSn")
    protected double inPreInsertedCollateralTableInternalSn;
    @XmlElement(name = "InPreInsertedCollateralTableRecordType")
    protected String inPreInsertedCollateralTableRecordType;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InProductIdProduct")
    protected int inProductIdProduct;
    @XmlElement(name = "InRetreiveFromCollateralFieldsPfgSetSn")
    protected int inRetreiveFromCollateralFieldsPfgSetSn;
    @XmlElement(name = "InSelectedPfgSetupDetailSetCategory")
    protected String inSelectedPfgSetupDetailSetCategory;
    @XmlElement(name = "InSelectedPfgSetupDetailSetSn")
    protected int inSelectedPfgSetupDetailSetSn;
    @XmlElement(name = "InSelectedPfgSetupDetailTag")
    protected String inSelectedPfgSetupDetailTag;
    @XmlElement(name = "InSelectedPfgSetupDetailTagSetCode")
    protected String inSelectedPfgSetupDetailTagSetCode;
    @XmlElement(name = "InSingleCollateralTblDocInternalSn")
    protected double inSingleCollateralTblDocInternalSn;
    @XmlElement(name = "InSingleCollateralTblDocPrftSys")
    protected short inSingleCollateralTblDocPrftSys;
    @XmlElement(name = "InSingleCollateralTblDocRecordType")
    protected String inSingleCollateralTblDocRecordType;
    @XmlElement(name = "InSingleCollateralTblDocReferenceNumber")
    protected String inSingleCollateralTblDocReferenceNumber;
    @XmlElement(name = "InSsSecurityCmcbPrftSystem")
    protected short inSsSecurityCmcbPrftSystem;
    @XmlElement(name = "InSsSecurityCmcbTranCode")
    protected String inSsSecurityCmcbTranCode;
    @XmlElement(name = "InGrpFields")
    protected ArrayOfPFG004VInGrpFieldsItem inGrpFields;

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
     * Gets the value of the inCltCollateralTableCDigit1 property.
     * 
     */
    public short getInCltCollateralTableCDigit1() {
        return inCltCollateralTableCDigit1;
    }

    /**
     * Sets the value of the inCltCollateralTableCDigit1 property.
     * 
     */
    public void setInCltCollateralTableCDigit1(short value) {
        this.inCltCollateralTableCDigit1 = value;
    }

    /**
     * Gets the value of the inCltCollateralTableCustId1 property.
     * 
     */
    public int getInCltCollateralTableCustId1() {
        return inCltCollateralTableCustId1;
    }

    /**
     * Sets the value of the inCltCollateralTableCustId1 property.
     * 
     */
    public void setInCltCollateralTableCustId1(int value) {
        this.inCltCollateralTableCustId1 = value;
    }

    /**
     * Gets the value of the inCltCollateralTableInternalSn property.
     * 
     */
    public double getInCltCollateralTableInternalSn() {
        return inCltCollateralTableInternalSn;
    }

    /**
     * Sets the value of the inCltCollateralTableInternalSn property.
     * 
     */
    public void setInCltCollateralTableInternalSn(double value) {
        this.inCltCollateralTableInternalSn = value;
    }

    /**
     * Gets the value of the inCltCollateralTableRecordDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCltCollateralTableRecordDescr() {
        return inCltCollateralTableRecordDescr;
    }

    /**
     * Sets the value of the inCltCollateralTableRecordDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCltCollateralTableRecordDescr(String value) {
        this.inCltCollateralTableRecordDescr = value;
    }

    /**
     * Gets the value of the inCltCollateralTableRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCltCollateralTableRecordType() {
        return inCltCollateralTableRecordType;
    }

    /**
     * Sets the value of the inCltCollateralTableRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCltCollateralTableRecordType(String value) {
        this.inCltCollateralTableRecordType = value;
    }

    /**
     * Gets the value of the inCltPfgTagSetSetupTagSetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCltPfgTagSetSetupTagSetCode() {
        return inCltPfgTagSetSetupTagSetCode;
    }

    /**
     * Sets the value of the inCltPfgTagSetSetupTagSetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCltPfgTagSetSetupTagSetCode(String value) {
        this.inCltPfgTagSetSetupTagSetCode = value;
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
     * Gets the value of the inDescriptionCollateralTblDocDocDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDescriptionCollateralTblDocDocDescr() {
        return inDescriptionCollateralTblDocDocDescr;
    }

    /**
     * Sets the value of the inDescriptionCollateralTblDocDocDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDescriptionCollateralTblDocDocDescr(String value) {
        this.inDescriptionCollateralTblDocDocDescr = value;
    }

    /**
     * Gets the value of the inDescriptionCollateralTblDocDocDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDescriptionCollateralTblDocDocDetails() {
        return inDescriptionCollateralTblDocDocDetails;
    }

    /**
     * Sets the value of the inDescriptionCollateralTblDocDocDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDescriptionCollateralTblDocDocDetails(String value) {
        this.inDescriptionCollateralTblDocDocDetails = value;
    }

    /**
     * Gets the value of the inDocumentManagementFileSn property.
     * 
     */
    public double getInDocumentManagementFileSn() {
        return inDocumentManagementFileSn;
    }

    /**
     * Sets the value of the inDocumentManagementFileSn property.
     * 
     */
    public void setInDocumentManagementFileSn(double value) {
        this.inDocumentManagementFileSn = value;
    }

    /**
     * Gets the value of the inDocumentManagementReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDocumentManagementReferenceNumber() {
        return inDocumentManagementReferenceNumber;
    }

    /**
     * Sets the value of the inDocumentManagementReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDocumentManagementReferenceNumber(String value) {
        this.inDocumentManagementReferenceNumber = value;
    }

    /**
     * Gets the value of the inGrpParametersInGrmTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpParametersInGrmTerminalTerminalNumber() {
        return inGrpParametersInGrmTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inGrpParametersInGrmTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpParametersInGrmTerminalTerminalNumber(String value) {
        this.inGrpParametersInGrmTerminalTerminalNumber = value;
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
     * Gets the value of the inPreInsertedCollateralTableInternalSn property.
     * 
     */
    public double getInPreInsertedCollateralTableInternalSn() {
        return inPreInsertedCollateralTableInternalSn;
    }

    /**
     * Sets the value of the inPreInsertedCollateralTableInternalSn property.
     * 
     */
    public void setInPreInsertedCollateralTableInternalSn(double value) {
        this.inPreInsertedCollateralTableInternalSn = value;
    }

    /**
     * Gets the value of the inPreInsertedCollateralTableRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPreInsertedCollateralTableRecordType() {
        return inPreInsertedCollateralTableRecordType;
    }

    /**
     * Sets the value of the inPreInsertedCollateralTableRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPreInsertedCollateralTableRecordType(String value) {
        this.inPreInsertedCollateralTableRecordType = value;
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
     * Gets the value of the inRetreiveFromCollateralFieldsPfgSetSn property.
     * 
     */
    public int getInRetreiveFromCollateralFieldsPfgSetSn() {
        return inRetreiveFromCollateralFieldsPfgSetSn;
    }

    /**
     * Sets the value of the inRetreiveFromCollateralFieldsPfgSetSn property.
     * 
     */
    public void setInRetreiveFromCollateralFieldsPfgSetSn(int value) {
        this.inRetreiveFromCollateralFieldsPfgSetSn = value;
    }

    /**
     * Gets the value of the inSelectedPfgSetupDetailSetCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedPfgSetupDetailSetCategory() {
        return inSelectedPfgSetupDetailSetCategory;
    }

    /**
     * Sets the value of the inSelectedPfgSetupDetailSetCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedPfgSetupDetailSetCategory(String value) {
        this.inSelectedPfgSetupDetailSetCategory = value;
    }

    /**
     * Gets the value of the inSelectedPfgSetupDetailSetSn property.
     * 
     */
    public int getInSelectedPfgSetupDetailSetSn() {
        return inSelectedPfgSetupDetailSetSn;
    }

    /**
     * Sets the value of the inSelectedPfgSetupDetailSetSn property.
     * 
     */
    public void setInSelectedPfgSetupDetailSetSn(int value) {
        this.inSelectedPfgSetupDetailSetSn = value;
    }

    /**
     * Gets the value of the inSelectedPfgSetupDetailTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedPfgSetupDetailTag() {
        return inSelectedPfgSetupDetailTag;
    }

    /**
     * Sets the value of the inSelectedPfgSetupDetailTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedPfgSetupDetailTag(String value) {
        this.inSelectedPfgSetupDetailTag = value;
    }

    /**
     * Gets the value of the inSelectedPfgSetupDetailTagSetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedPfgSetupDetailTagSetCode() {
        return inSelectedPfgSetupDetailTagSetCode;
    }

    /**
     * Sets the value of the inSelectedPfgSetupDetailTagSetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedPfgSetupDetailTagSetCode(String value) {
        this.inSelectedPfgSetupDetailTagSetCode = value;
    }

    /**
     * Gets the value of the inSingleCollateralTblDocInternalSn property.
     * 
     */
    public double getInSingleCollateralTblDocInternalSn() {
        return inSingleCollateralTblDocInternalSn;
    }

    /**
     * Sets the value of the inSingleCollateralTblDocInternalSn property.
     * 
     */
    public void setInSingleCollateralTblDocInternalSn(double value) {
        this.inSingleCollateralTblDocInternalSn = value;
    }

    /**
     * Gets the value of the inSingleCollateralTblDocPrftSys property.
     * 
     */
    public short getInSingleCollateralTblDocPrftSys() {
        return inSingleCollateralTblDocPrftSys;
    }

    /**
     * Sets the value of the inSingleCollateralTblDocPrftSys property.
     * 
     */
    public void setInSingleCollateralTblDocPrftSys(short value) {
        this.inSingleCollateralTblDocPrftSys = value;
    }

    /**
     * Gets the value of the inSingleCollateralTblDocRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSingleCollateralTblDocRecordType() {
        return inSingleCollateralTblDocRecordType;
    }

    /**
     * Sets the value of the inSingleCollateralTblDocRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSingleCollateralTblDocRecordType(String value) {
        this.inSingleCollateralTblDocRecordType = value;
    }

    /**
     * Gets the value of the inSingleCollateralTblDocReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSingleCollateralTblDocReferenceNumber() {
        return inSingleCollateralTblDocReferenceNumber;
    }

    /**
     * Sets the value of the inSingleCollateralTblDocReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSingleCollateralTblDocReferenceNumber(String value) {
        this.inSingleCollateralTblDocReferenceNumber = value;
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
     * Gets the value of the inGrpFields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPFG004VInGrpFieldsItem }
     *     
     */
    public ArrayOfPFG004VInGrpFieldsItem getInGrpFields() {
        return inGrpFields;
    }

    /**
     * Sets the value of the inGrpFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPFG004VInGrpFieldsItem }
     *     
     */
    public void setInGrpFields(ArrayOfPFG004VInGrpFieldsItem value) {
        this.inGrpFields = value;
    }

}
