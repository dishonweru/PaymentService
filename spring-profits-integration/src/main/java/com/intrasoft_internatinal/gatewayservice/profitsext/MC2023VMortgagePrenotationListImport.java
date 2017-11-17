
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MC2023VMortgagePrenotationListImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MC2023VMortgagePrenotationListImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAmount1FromCollateralTableAmount1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InAmount1ToCollateralTableAmount1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InAmount2FromCollateralTableAmount2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InAmount2ToCollateralTableAmount2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InCodeFromCollateralTableInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InCodeToCollateralTableInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InCollaborationBanksAchBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCollaborationBanksBankId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCollaborationBanksBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCollaborationBanksMchBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCollaborationBanksOurBankFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCollaborationBanksSwiftAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InContinueCollateralTableInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InLanrgGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLanrgGenericDetailEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLanrgGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLanrgGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLanrgGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLanrgGenericDetailTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InRecrsGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRecrsGenericDetailEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRecrsGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRecrsGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InRecrsGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRecrsGenericDetailTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InRecrtGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRecrtGenericDetailEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRecrtGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRecrtGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InRecrtGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRecrtGenericDetailTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InSelectedTypeCollateralTableRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MC2023VMortgagePrenotationListImport", propOrder = {
    "command",
    "inAmount1FromCollateralTableAmount1",
    "inAmount1ToCollateralTableAmount1",
    "inAmount2FromCollateralTableAmount2",
    "inAmount2ToCollateralTableAmount2",
    "inCodeFromCollateralTableInternalSn",
    "inCodeToCollateralTableInternalSn",
    "inCollaborationBanksAchBankCode",
    "inCollaborationBanksBankId",
    "inCollaborationBanksBankName",
    "inCollaborationBanksMchBankCode",
    "inCollaborationBanksOurBankFlg",
    "inCollaborationBanksSwiftAddress",
    "inCommandIefSuppliedCommand",
    "inContinueCollateralTableInternalSn",
    "inLanrgGenericDetailDescription",
    "inLanrgGenericDetailEntryStatus",
    "inLanrgGenericDetailParameterType",
    "inLanrgGenericDetailSerialNum",
    "inLanrgGenericDetailShortDescription",
    "inLanrgGenericDetailTmstamp",
    "inRecrsGenericDetailDescription",
    "inRecrsGenericDetailEntryStatus",
    "inRecrsGenericDetailParameterType",
    "inRecrsGenericDetailSerialNum",
    "inRecrsGenericDetailShortDescription",
    "inRecrsGenericDetailTmstamp",
    "inRecrtGenericDetailDescription",
    "inRecrtGenericDetailEntryStatus",
    "inRecrtGenericDetailParameterType",
    "inRecrtGenericDetailSerialNum",
    "inRecrtGenericDetailShortDescription",
    "inRecrtGenericDetailTmstamp",
    "inSelectedTypeCollateralTableRecordType",
    "inTrxJustificIdJustific",
    "inTrxPrftTransactionIdTransact",
    "inTrxProductIdProduct",
    "inTrxTerminalTerminalNumber"
})
public class MC2023VMortgagePrenotationListImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InAmount1FromCollateralTableAmount1", required = true)
    protected BigDecimal inAmount1FromCollateralTableAmount1;
    @XmlElement(name = "InAmount1ToCollateralTableAmount1", required = true)
    protected BigDecimal inAmount1ToCollateralTableAmount1;
    @XmlElement(name = "InAmount2FromCollateralTableAmount2", required = true)
    protected BigDecimal inAmount2FromCollateralTableAmount2;
    @XmlElement(name = "InAmount2ToCollateralTableAmount2", required = true)
    protected BigDecimal inAmount2ToCollateralTableAmount2;
    @XmlElement(name = "InCodeFromCollateralTableInternalSn")
    protected double inCodeFromCollateralTableInternalSn;
    @XmlElement(name = "InCodeToCollateralTableInternalSn")
    protected double inCodeToCollateralTableInternalSn;
    @XmlElement(name = "InCollaborationBanksAchBankCode")
    protected String inCollaborationBanksAchBankCode;
    @XmlElement(name = "InCollaborationBanksBankId")
    protected int inCollaborationBanksBankId;
    @XmlElement(name = "InCollaborationBanksBankName")
    protected String inCollaborationBanksBankName;
    @XmlElement(name = "InCollaborationBanksMchBankCode")
    protected String inCollaborationBanksMchBankCode;
    @XmlElement(name = "InCollaborationBanksOurBankFlg")
    protected String inCollaborationBanksOurBankFlg;
    @XmlElement(name = "InCollaborationBanksSwiftAddress")
    protected String inCollaborationBanksSwiftAddress;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InContinueCollateralTableInternalSn")
    protected double inContinueCollateralTableInternalSn;
    @XmlElement(name = "InLanrgGenericDetailDescription")
    protected String inLanrgGenericDetailDescription;
    @XmlElement(name = "InLanrgGenericDetailEntryStatus")
    protected String inLanrgGenericDetailEntryStatus;
    @XmlElement(name = "InLanrgGenericDetailParameterType")
    protected String inLanrgGenericDetailParameterType;
    @XmlElement(name = "InLanrgGenericDetailSerialNum")
    protected int inLanrgGenericDetailSerialNum;
    @XmlElement(name = "InLanrgGenericDetailShortDescription")
    protected String inLanrgGenericDetailShortDescription;
    @XmlElement(name = "InLanrgGenericDetailTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLanrgGenericDetailTmstamp;
    @XmlElement(name = "InRecrsGenericDetailDescription")
    protected String inRecrsGenericDetailDescription;
    @XmlElement(name = "InRecrsGenericDetailEntryStatus")
    protected String inRecrsGenericDetailEntryStatus;
    @XmlElement(name = "InRecrsGenericDetailParameterType")
    protected String inRecrsGenericDetailParameterType;
    @XmlElement(name = "InRecrsGenericDetailSerialNum")
    protected int inRecrsGenericDetailSerialNum;
    @XmlElement(name = "InRecrsGenericDetailShortDescription")
    protected String inRecrsGenericDetailShortDescription;
    @XmlElement(name = "InRecrsGenericDetailTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inRecrsGenericDetailTmstamp;
    @XmlElement(name = "InRecrtGenericDetailDescription")
    protected String inRecrtGenericDetailDescription;
    @XmlElement(name = "InRecrtGenericDetailEntryStatus")
    protected String inRecrtGenericDetailEntryStatus;
    @XmlElement(name = "InRecrtGenericDetailParameterType")
    protected String inRecrtGenericDetailParameterType;
    @XmlElement(name = "InRecrtGenericDetailSerialNum")
    protected int inRecrtGenericDetailSerialNum;
    @XmlElement(name = "InRecrtGenericDetailShortDescription")
    protected String inRecrtGenericDetailShortDescription;
    @XmlElement(name = "InRecrtGenericDetailTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inRecrtGenericDetailTmstamp;
    @XmlElement(name = "InSelectedTypeCollateralTableRecordType")
    protected String inSelectedTypeCollateralTableRecordType;
    @XmlElement(name = "InTrxJustificIdJustific")
    protected int inTrxJustificIdJustific;
    @XmlElement(name = "InTrxPrftTransactionIdTransact")
    protected int inTrxPrftTransactionIdTransact;
    @XmlElement(name = "InTrxProductIdProduct")
    protected int inTrxProductIdProduct;
    @XmlElement(name = "InTrxTerminalTerminalNumber")
    protected String inTrxTerminalTerminalNumber;

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
     * Gets the value of the inAmount1FromCollateralTableAmount1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInAmount1FromCollateralTableAmount1() {
        return inAmount1FromCollateralTableAmount1;
    }

    /**
     * Sets the value of the inAmount1FromCollateralTableAmount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInAmount1FromCollateralTableAmount1(BigDecimal value) {
        this.inAmount1FromCollateralTableAmount1 = value;
    }

    /**
     * Gets the value of the inAmount1ToCollateralTableAmount1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInAmount1ToCollateralTableAmount1() {
        return inAmount1ToCollateralTableAmount1;
    }

    /**
     * Sets the value of the inAmount1ToCollateralTableAmount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInAmount1ToCollateralTableAmount1(BigDecimal value) {
        this.inAmount1ToCollateralTableAmount1 = value;
    }

    /**
     * Gets the value of the inAmount2FromCollateralTableAmount2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInAmount2FromCollateralTableAmount2() {
        return inAmount2FromCollateralTableAmount2;
    }

    /**
     * Sets the value of the inAmount2FromCollateralTableAmount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInAmount2FromCollateralTableAmount2(BigDecimal value) {
        this.inAmount2FromCollateralTableAmount2 = value;
    }

    /**
     * Gets the value of the inAmount2ToCollateralTableAmount2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInAmount2ToCollateralTableAmount2() {
        return inAmount2ToCollateralTableAmount2;
    }

    /**
     * Sets the value of the inAmount2ToCollateralTableAmount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInAmount2ToCollateralTableAmount2(BigDecimal value) {
        this.inAmount2ToCollateralTableAmount2 = value;
    }

    /**
     * Gets the value of the inCodeFromCollateralTableInternalSn property.
     * 
     */
    public double getInCodeFromCollateralTableInternalSn() {
        return inCodeFromCollateralTableInternalSn;
    }

    /**
     * Sets the value of the inCodeFromCollateralTableInternalSn property.
     * 
     */
    public void setInCodeFromCollateralTableInternalSn(double value) {
        this.inCodeFromCollateralTableInternalSn = value;
    }

    /**
     * Gets the value of the inCodeToCollateralTableInternalSn property.
     * 
     */
    public double getInCodeToCollateralTableInternalSn() {
        return inCodeToCollateralTableInternalSn;
    }

    /**
     * Sets the value of the inCodeToCollateralTableInternalSn property.
     * 
     */
    public void setInCodeToCollateralTableInternalSn(double value) {
        this.inCodeToCollateralTableInternalSn = value;
    }

    /**
     * Gets the value of the inCollaborationBanksAchBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCollaborationBanksAchBankCode() {
        return inCollaborationBanksAchBankCode;
    }

    /**
     * Sets the value of the inCollaborationBanksAchBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCollaborationBanksAchBankCode(String value) {
        this.inCollaborationBanksAchBankCode = value;
    }

    /**
     * Gets the value of the inCollaborationBanksBankId property.
     * 
     */
    public int getInCollaborationBanksBankId() {
        return inCollaborationBanksBankId;
    }

    /**
     * Sets the value of the inCollaborationBanksBankId property.
     * 
     */
    public void setInCollaborationBanksBankId(int value) {
        this.inCollaborationBanksBankId = value;
    }

    /**
     * Gets the value of the inCollaborationBanksBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCollaborationBanksBankName() {
        return inCollaborationBanksBankName;
    }

    /**
     * Sets the value of the inCollaborationBanksBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCollaborationBanksBankName(String value) {
        this.inCollaborationBanksBankName = value;
    }

    /**
     * Gets the value of the inCollaborationBanksMchBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCollaborationBanksMchBankCode() {
        return inCollaborationBanksMchBankCode;
    }

    /**
     * Sets the value of the inCollaborationBanksMchBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCollaborationBanksMchBankCode(String value) {
        this.inCollaborationBanksMchBankCode = value;
    }

    /**
     * Gets the value of the inCollaborationBanksOurBankFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCollaborationBanksOurBankFlg() {
        return inCollaborationBanksOurBankFlg;
    }

    /**
     * Sets the value of the inCollaborationBanksOurBankFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCollaborationBanksOurBankFlg(String value) {
        this.inCollaborationBanksOurBankFlg = value;
    }

    /**
     * Gets the value of the inCollaborationBanksSwiftAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCollaborationBanksSwiftAddress() {
        return inCollaborationBanksSwiftAddress;
    }

    /**
     * Sets the value of the inCollaborationBanksSwiftAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCollaborationBanksSwiftAddress(String value) {
        this.inCollaborationBanksSwiftAddress = value;
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
     * Gets the value of the inContinueCollateralTableInternalSn property.
     * 
     */
    public double getInContinueCollateralTableInternalSn() {
        return inContinueCollateralTableInternalSn;
    }

    /**
     * Sets the value of the inContinueCollateralTableInternalSn property.
     * 
     */
    public void setInContinueCollateralTableInternalSn(double value) {
        this.inContinueCollateralTableInternalSn = value;
    }

    /**
     * Gets the value of the inLanrgGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLanrgGenericDetailDescription() {
        return inLanrgGenericDetailDescription;
    }

    /**
     * Sets the value of the inLanrgGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLanrgGenericDetailDescription(String value) {
        this.inLanrgGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inLanrgGenericDetailEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLanrgGenericDetailEntryStatus() {
        return inLanrgGenericDetailEntryStatus;
    }

    /**
     * Sets the value of the inLanrgGenericDetailEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLanrgGenericDetailEntryStatus(String value) {
        this.inLanrgGenericDetailEntryStatus = value;
    }

    /**
     * Gets the value of the inLanrgGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLanrgGenericDetailParameterType() {
        return inLanrgGenericDetailParameterType;
    }

    /**
     * Sets the value of the inLanrgGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLanrgGenericDetailParameterType(String value) {
        this.inLanrgGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inLanrgGenericDetailSerialNum property.
     * 
     */
    public int getInLanrgGenericDetailSerialNum() {
        return inLanrgGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inLanrgGenericDetailSerialNum property.
     * 
     */
    public void setInLanrgGenericDetailSerialNum(int value) {
        this.inLanrgGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inLanrgGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLanrgGenericDetailShortDescription() {
        return inLanrgGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inLanrgGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLanrgGenericDetailShortDescription(String value) {
        this.inLanrgGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inLanrgGenericDetailTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLanrgGenericDetailTmstamp() {
        return inLanrgGenericDetailTmstamp;
    }

    /**
     * Sets the value of the inLanrgGenericDetailTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLanrgGenericDetailTmstamp(XMLGregorianCalendar value) {
        this.inLanrgGenericDetailTmstamp = value;
    }

    /**
     * Gets the value of the inRecrsGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRecrsGenericDetailDescription() {
        return inRecrsGenericDetailDescription;
    }

    /**
     * Sets the value of the inRecrsGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRecrsGenericDetailDescription(String value) {
        this.inRecrsGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inRecrsGenericDetailEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRecrsGenericDetailEntryStatus() {
        return inRecrsGenericDetailEntryStatus;
    }

    /**
     * Sets the value of the inRecrsGenericDetailEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRecrsGenericDetailEntryStatus(String value) {
        this.inRecrsGenericDetailEntryStatus = value;
    }

    /**
     * Gets the value of the inRecrsGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRecrsGenericDetailParameterType() {
        return inRecrsGenericDetailParameterType;
    }

    /**
     * Sets the value of the inRecrsGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRecrsGenericDetailParameterType(String value) {
        this.inRecrsGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inRecrsGenericDetailSerialNum property.
     * 
     */
    public int getInRecrsGenericDetailSerialNum() {
        return inRecrsGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inRecrsGenericDetailSerialNum property.
     * 
     */
    public void setInRecrsGenericDetailSerialNum(int value) {
        this.inRecrsGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inRecrsGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRecrsGenericDetailShortDescription() {
        return inRecrsGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inRecrsGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRecrsGenericDetailShortDescription(String value) {
        this.inRecrsGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inRecrsGenericDetailTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInRecrsGenericDetailTmstamp() {
        return inRecrsGenericDetailTmstamp;
    }

    /**
     * Sets the value of the inRecrsGenericDetailTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInRecrsGenericDetailTmstamp(XMLGregorianCalendar value) {
        this.inRecrsGenericDetailTmstamp = value;
    }

    /**
     * Gets the value of the inRecrtGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRecrtGenericDetailDescription() {
        return inRecrtGenericDetailDescription;
    }

    /**
     * Sets the value of the inRecrtGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRecrtGenericDetailDescription(String value) {
        this.inRecrtGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inRecrtGenericDetailEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRecrtGenericDetailEntryStatus() {
        return inRecrtGenericDetailEntryStatus;
    }

    /**
     * Sets the value of the inRecrtGenericDetailEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRecrtGenericDetailEntryStatus(String value) {
        this.inRecrtGenericDetailEntryStatus = value;
    }

    /**
     * Gets the value of the inRecrtGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRecrtGenericDetailParameterType() {
        return inRecrtGenericDetailParameterType;
    }

    /**
     * Sets the value of the inRecrtGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRecrtGenericDetailParameterType(String value) {
        this.inRecrtGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inRecrtGenericDetailSerialNum property.
     * 
     */
    public int getInRecrtGenericDetailSerialNum() {
        return inRecrtGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inRecrtGenericDetailSerialNum property.
     * 
     */
    public void setInRecrtGenericDetailSerialNum(int value) {
        this.inRecrtGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inRecrtGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRecrtGenericDetailShortDescription() {
        return inRecrtGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inRecrtGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRecrtGenericDetailShortDescription(String value) {
        this.inRecrtGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inRecrtGenericDetailTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInRecrtGenericDetailTmstamp() {
        return inRecrtGenericDetailTmstamp;
    }

    /**
     * Sets the value of the inRecrtGenericDetailTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInRecrtGenericDetailTmstamp(XMLGregorianCalendar value) {
        this.inRecrtGenericDetailTmstamp = value;
    }

    /**
     * Gets the value of the inSelectedTypeCollateralTableRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedTypeCollateralTableRecordType() {
        return inSelectedTypeCollateralTableRecordType;
    }

    /**
     * Sets the value of the inSelectedTypeCollateralTableRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedTypeCollateralTableRecordType(String value) {
        this.inSelectedTypeCollateralTableRecordType = value;
    }

    /**
     * Gets the value of the inTrxJustificIdJustific property.
     * 
     */
    public int getInTrxJustificIdJustific() {
        return inTrxJustificIdJustific;
    }

    /**
     * Sets the value of the inTrxJustificIdJustific property.
     * 
     */
    public void setInTrxJustificIdJustific(int value) {
        this.inTrxJustificIdJustific = value;
    }

    /**
     * Gets the value of the inTrxPrftTransactionIdTransact property.
     * 
     */
    public int getInTrxPrftTransactionIdTransact() {
        return inTrxPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the inTrxPrftTransactionIdTransact property.
     * 
     */
    public void setInTrxPrftTransactionIdTransact(int value) {
        this.inTrxPrftTransactionIdTransact = value;
    }

    /**
     * Gets the value of the inTrxProductIdProduct property.
     * 
     */
    public int getInTrxProductIdProduct() {
        return inTrxProductIdProduct;
    }

    /**
     * Sets the value of the inTrxProductIdProduct property.
     * 
     */
    public void setInTrxProductIdProduct(int value) {
        this.inTrxProductIdProduct = value;
    }

    /**
     * Gets the value of the inTrxTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxTerminalTerminalNumber() {
        return inTrxTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inTrxTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxTerminalTerminalNumber(String value) {
        this.inTrxTerminalTerminalNumber = value;
    }

}
