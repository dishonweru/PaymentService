
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for L0407VLoanAccountExtraitImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0407VLoanAccountExtraitImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDtFromLoanAccountExtraitTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDtToLoanAccountExtraitTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InFromQryRqLoanAccountExtraitRequestLoanSts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFromQryRqLoanAccountExtraitRequestSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InFromQryRqLoanAccountExtraitRequestType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLoanAccountInfoDormantAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountInfoNrmAccrualAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountInfoOvAccrualAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountInfoPositiveAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLogMntRecordingAuthorizer1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingAuthorizer2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLogMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMoreLoanAccountExtraitTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InMoreLoanAccountExtraitTrxInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InPrintIndicatorIefSuppliedTableInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRowLoanAccountExtraitAccSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InRowLoanAccountExtraitAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InRowLoanAccountExtraitAccUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InRowLoanAccountExtraitTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InRowLoanAccountExtraitTransactionCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InRowLoanAccountExtraitTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InRowLoanAccountExtraitTrxInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InRowLoanAccountExtraitTrxSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InRowLoanAccountExtraitTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InRowLoanAccountExtraitTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0407VLoanAccountExtraitImport", propOrder = {
    "command",
    "profitsAccountNumber",
    "profitsAccountCd",
    "inDtFromLoanAccountExtraitTrxDate",
    "inDtToLoanAccountExtraitTrxDate",
    "inFromQryRqLoanAccountExtraitRequestLoanSts",
    "inFromQryRqLoanAccountExtraitRequestSn",
    "inFromQryRqLoanAccountExtraitRequestType",
    "inIefSuppliedCommand",
    "inJustificIdJustific",
    "inLoanAccountInfoDormantAmn",
    "inLoanAccountInfoNrmAccrualAmn",
    "inLoanAccountInfoOvAccrualAmn",
    "inLoanAccountInfoPositiveAmn",
    "inLogMntRecordingAuthorizer1",
    "inLogMntRecordingAuthorizer2",
    "inLogMntRecordingPrftSystem",
    "inLogMntRecordingReversalFlag",
    "inLogMntRecordingTerminalNumber",
    "inLogMntRecordingTrxCode",
    "inMoreLoanAccountExtraitTmstamp",
    "inMoreLoanAccountExtraitTrxInternalSn",
    "inPrintIndicatorIefSuppliedTableInd",
    "inRowLoanAccountExtraitAccSn",
    "inRowLoanAccountExtraitAccType",
    "inRowLoanAccountExtraitAccUnit",
    "inRowLoanAccountExtraitTmstamp",
    "inRowLoanAccountExtraitTransactionCode",
    "inRowLoanAccountExtraitTrxDate",
    "inRowLoanAccountExtraitTrxInternalSn",
    "inRowLoanAccountExtraitTrxSn",
    "inRowLoanAccountExtraitTrxUnit",
    "inRowLoanAccountExtraitTrxUsr"
})
public class L0407VLoanAccountExtraitImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "ProfitsAccountNumber")
    protected String profitsAccountNumber;
    @XmlElement(name = "ProfitsAccountCd")
    protected short profitsAccountCd;
    @XmlElement(name = "InDtFromLoanAccountExtraitTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDtFromLoanAccountExtraitTrxDate;
    @XmlElement(name = "InDtToLoanAccountExtraitTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDtToLoanAccountExtraitTrxDate;
    @XmlElement(name = "InFromQryRqLoanAccountExtraitRequestLoanSts")
    protected String inFromQryRqLoanAccountExtraitRequestLoanSts;
    @XmlElement(name = "InFromQryRqLoanAccountExtraitRequestSn")
    protected short inFromQryRqLoanAccountExtraitRequestSn;
    @XmlElement(name = "InFromQryRqLoanAccountExtraitRequestType")
    protected String inFromQryRqLoanAccountExtraitRequestType;
    @XmlElement(name = "InIefSuppliedCommand")
    protected String inIefSuppliedCommand;
    @XmlElement(name = "InJustificIdJustific")
    protected int inJustificIdJustific;
    @XmlElement(name = "InLoanAccountInfoDormantAmn", required = true)
    protected BigDecimal inLoanAccountInfoDormantAmn;
    @XmlElement(name = "InLoanAccountInfoNrmAccrualAmn", required = true)
    protected BigDecimal inLoanAccountInfoNrmAccrualAmn;
    @XmlElement(name = "InLoanAccountInfoOvAccrualAmn", required = true)
    protected BigDecimal inLoanAccountInfoOvAccrualAmn;
    @XmlElement(name = "InLoanAccountInfoPositiveAmn", required = true)
    protected BigDecimal inLoanAccountInfoPositiveAmn;
    @XmlElement(name = "InLogMntRecordingAuthorizer1")
    protected String inLogMntRecordingAuthorizer1;
    @XmlElement(name = "InLogMntRecordingAuthorizer2")
    protected String inLogMntRecordingAuthorizer2;
    @XmlElement(name = "InLogMntRecordingPrftSystem")
    protected short inLogMntRecordingPrftSystem;
    @XmlElement(name = "InLogMntRecordingReversalFlag")
    protected String inLogMntRecordingReversalFlag;
    @XmlElement(name = "InLogMntRecordingTerminalNumber")
    protected String inLogMntRecordingTerminalNumber;
    @XmlElement(name = "InLogMntRecordingTrxCode")
    protected int inLogMntRecordingTrxCode;
    @XmlElement(name = "InMoreLoanAccountExtraitTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inMoreLoanAccountExtraitTmstamp;
    @XmlElement(name = "InMoreLoanAccountExtraitTrxInternalSn")
    protected short inMoreLoanAccountExtraitTrxInternalSn;
    @XmlElement(name = "InPrintIndicatorIefSuppliedTableInd")
    protected String inPrintIndicatorIefSuppliedTableInd;
    @XmlElement(name = "InRowLoanAccountExtraitAccSn")
    protected int inRowLoanAccountExtraitAccSn;
    @XmlElement(name = "InRowLoanAccountExtraitAccType")
    protected short inRowLoanAccountExtraitAccType;
    @XmlElement(name = "InRowLoanAccountExtraitAccUnit")
    protected int inRowLoanAccountExtraitAccUnit;
    @XmlElement(name = "InRowLoanAccountExtraitTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inRowLoanAccountExtraitTmstamp;
    @XmlElement(name = "InRowLoanAccountExtraitTransactionCode")
    protected int inRowLoanAccountExtraitTransactionCode;
    @XmlElement(name = "InRowLoanAccountExtraitTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inRowLoanAccountExtraitTrxDate;
    @XmlElement(name = "InRowLoanAccountExtraitTrxInternalSn")
    protected short inRowLoanAccountExtraitTrxInternalSn;
    @XmlElement(name = "InRowLoanAccountExtraitTrxSn")
    protected int inRowLoanAccountExtraitTrxSn;
    @XmlElement(name = "InRowLoanAccountExtraitTrxUnit")
    protected int inRowLoanAccountExtraitTrxUnit;
    @XmlElement(name = "InRowLoanAccountExtraitTrxUsr")
    protected String inRowLoanAccountExtraitTrxUsr;

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
     * Gets the value of the inDtFromLoanAccountExtraitTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDtFromLoanAccountExtraitTrxDate() {
        return inDtFromLoanAccountExtraitTrxDate;
    }

    /**
     * Sets the value of the inDtFromLoanAccountExtraitTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDtFromLoanAccountExtraitTrxDate(XMLGregorianCalendar value) {
        this.inDtFromLoanAccountExtraitTrxDate = value;
    }

    /**
     * Gets the value of the inDtToLoanAccountExtraitTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDtToLoanAccountExtraitTrxDate() {
        return inDtToLoanAccountExtraitTrxDate;
    }

    /**
     * Sets the value of the inDtToLoanAccountExtraitTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDtToLoanAccountExtraitTrxDate(XMLGregorianCalendar value) {
        this.inDtToLoanAccountExtraitTrxDate = value;
    }

    /**
     * Gets the value of the inFromQryRqLoanAccountExtraitRequestLoanSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFromQryRqLoanAccountExtraitRequestLoanSts() {
        return inFromQryRqLoanAccountExtraitRequestLoanSts;
    }

    /**
     * Sets the value of the inFromQryRqLoanAccountExtraitRequestLoanSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFromQryRqLoanAccountExtraitRequestLoanSts(String value) {
        this.inFromQryRqLoanAccountExtraitRequestLoanSts = value;
    }

    /**
     * Gets the value of the inFromQryRqLoanAccountExtraitRequestSn property.
     * 
     */
    public short getInFromQryRqLoanAccountExtraitRequestSn() {
        return inFromQryRqLoanAccountExtraitRequestSn;
    }

    /**
     * Sets the value of the inFromQryRqLoanAccountExtraitRequestSn property.
     * 
     */
    public void setInFromQryRqLoanAccountExtraitRequestSn(short value) {
        this.inFromQryRqLoanAccountExtraitRequestSn = value;
    }

    /**
     * Gets the value of the inFromQryRqLoanAccountExtraitRequestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFromQryRqLoanAccountExtraitRequestType() {
        return inFromQryRqLoanAccountExtraitRequestType;
    }

    /**
     * Sets the value of the inFromQryRqLoanAccountExtraitRequestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFromQryRqLoanAccountExtraitRequestType(String value) {
        this.inFromQryRqLoanAccountExtraitRequestType = value;
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
     * Gets the value of the inLoanAccountInfoDormantAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountInfoDormantAmn() {
        return inLoanAccountInfoDormantAmn;
    }

    /**
     * Sets the value of the inLoanAccountInfoDormantAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountInfoDormantAmn(BigDecimal value) {
        this.inLoanAccountInfoDormantAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoNrmAccrualAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountInfoNrmAccrualAmn() {
        return inLoanAccountInfoNrmAccrualAmn;
    }

    /**
     * Sets the value of the inLoanAccountInfoNrmAccrualAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountInfoNrmAccrualAmn(BigDecimal value) {
        this.inLoanAccountInfoNrmAccrualAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoOvAccrualAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountInfoOvAccrualAmn() {
        return inLoanAccountInfoOvAccrualAmn;
    }

    /**
     * Sets the value of the inLoanAccountInfoOvAccrualAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountInfoOvAccrualAmn(BigDecimal value) {
        this.inLoanAccountInfoOvAccrualAmn = value;
    }

    /**
     * Gets the value of the inLoanAccountInfoPositiveAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoanAccountInfoPositiveAmn() {
        return inLoanAccountInfoPositiveAmn;
    }

    /**
     * Sets the value of the inLoanAccountInfoPositiveAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoanAccountInfoPositiveAmn(BigDecimal value) {
        this.inLoanAccountInfoPositiveAmn = value;
    }

    /**
     * Gets the value of the inLogMntRecordingAuthorizer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogMntRecordingAuthorizer1() {
        return inLogMntRecordingAuthorizer1;
    }

    /**
     * Sets the value of the inLogMntRecordingAuthorizer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogMntRecordingAuthorizer1(String value) {
        this.inLogMntRecordingAuthorizer1 = value;
    }

    /**
     * Gets the value of the inLogMntRecordingAuthorizer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogMntRecordingAuthorizer2() {
        return inLogMntRecordingAuthorizer2;
    }

    /**
     * Sets the value of the inLogMntRecordingAuthorizer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogMntRecordingAuthorizer2(String value) {
        this.inLogMntRecordingAuthorizer2 = value;
    }

    /**
     * Gets the value of the inLogMntRecordingPrftSystem property.
     * 
     */
    public short getInLogMntRecordingPrftSystem() {
        return inLogMntRecordingPrftSystem;
    }

    /**
     * Sets the value of the inLogMntRecordingPrftSystem property.
     * 
     */
    public void setInLogMntRecordingPrftSystem(short value) {
        this.inLogMntRecordingPrftSystem = value;
    }

    /**
     * Gets the value of the inLogMntRecordingReversalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogMntRecordingReversalFlag() {
        return inLogMntRecordingReversalFlag;
    }

    /**
     * Sets the value of the inLogMntRecordingReversalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogMntRecordingReversalFlag(String value) {
        this.inLogMntRecordingReversalFlag = value;
    }

    /**
     * Gets the value of the inLogMntRecordingTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogMntRecordingTerminalNumber() {
        return inLogMntRecordingTerminalNumber;
    }

    /**
     * Sets the value of the inLogMntRecordingTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogMntRecordingTerminalNumber(String value) {
        this.inLogMntRecordingTerminalNumber = value;
    }

    /**
     * Gets the value of the inLogMntRecordingTrxCode property.
     * 
     */
    public int getInLogMntRecordingTrxCode() {
        return inLogMntRecordingTrxCode;
    }

    /**
     * Sets the value of the inLogMntRecordingTrxCode property.
     * 
     */
    public void setInLogMntRecordingTrxCode(int value) {
        this.inLogMntRecordingTrxCode = value;
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
     * Gets the value of the inPrintIndicatorIefSuppliedTableInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPrintIndicatorIefSuppliedTableInd() {
        return inPrintIndicatorIefSuppliedTableInd;
    }

    /**
     * Sets the value of the inPrintIndicatorIefSuppliedTableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPrintIndicatorIefSuppliedTableInd(String value) {
        this.inPrintIndicatorIefSuppliedTableInd = value;
    }

    /**
     * Gets the value of the inRowLoanAccountExtraitAccSn property.
     * 
     */
    public int getInRowLoanAccountExtraitAccSn() {
        return inRowLoanAccountExtraitAccSn;
    }

    /**
     * Sets the value of the inRowLoanAccountExtraitAccSn property.
     * 
     */
    public void setInRowLoanAccountExtraitAccSn(int value) {
        this.inRowLoanAccountExtraitAccSn = value;
    }

    /**
     * Gets the value of the inRowLoanAccountExtraitAccType property.
     * 
     */
    public short getInRowLoanAccountExtraitAccType() {
        return inRowLoanAccountExtraitAccType;
    }

    /**
     * Sets the value of the inRowLoanAccountExtraitAccType property.
     * 
     */
    public void setInRowLoanAccountExtraitAccType(short value) {
        this.inRowLoanAccountExtraitAccType = value;
    }

    /**
     * Gets the value of the inRowLoanAccountExtraitAccUnit property.
     * 
     */
    public int getInRowLoanAccountExtraitAccUnit() {
        return inRowLoanAccountExtraitAccUnit;
    }

    /**
     * Sets the value of the inRowLoanAccountExtraitAccUnit property.
     * 
     */
    public void setInRowLoanAccountExtraitAccUnit(int value) {
        this.inRowLoanAccountExtraitAccUnit = value;
    }

    /**
     * Gets the value of the inRowLoanAccountExtraitTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInRowLoanAccountExtraitTmstamp() {
        return inRowLoanAccountExtraitTmstamp;
    }

    /**
     * Sets the value of the inRowLoanAccountExtraitTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInRowLoanAccountExtraitTmstamp(XMLGregorianCalendar value) {
        this.inRowLoanAccountExtraitTmstamp = value;
    }

    /**
     * Gets the value of the inRowLoanAccountExtraitTransactionCode property.
     * 
     */
    public int getInRowLoanAccountExtraitTransactionCode() {
        return inRowLoanAccountExtraitTransactionCode;
    }

    /**
     * Sets the value of the inRowLoanAccountExtraitTransactionCode property.
     * 
     */
    public void setInRowLoanAccountExtraitTransactionCode(int value) {
        this.inRowLoanAccountExtraitTransactionCode = value;
    }

    /**
     * Gets the value of the inRowLoanAccountExtraitTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInRowLoanAccountExtraitTrxDate() {
        return inRowLoanAccountExtraitTrxDate;
    }

    /**
     * Sets the value of the inRowLoanAccountExtraitTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInRowLoanAccountExtraitTrxDate(XMLGregorianCalendar value) {
        this.inRowLoanAccountExtraitTrxDate = value;
    }

    /**
     * Gets the value of the inRowLoanAccountExtraitTrxInternalSn property.
     * 
     */
    public short getInRowLoanAccountExtraitTrxInternalSn() {
        return inRowLoanAccountExtraitTrxInternalSn;
    }

    /**
     * Sets the value of the inRowLoanAccountExtraitTrxInternalSn property.
     * 
     */
    public void setInRowLoanAccountExtraitTrxInternalSn(short value) {
        this.inRowLoanAccountExtraitTrxInternalSn = value;
    }

    /**
     * Gets the value of the inRowLoanAccountExtraitTrxSn property.
     * 
     */
    public int getInRowLoanAccountExtraitTrxSn() {
        return inRowLoanAccountExtraitTrxSn;
    }

    /**
     * Sets the value of the inRowLoanAccountExtraitTrxSn property.
     * 
     */
    public void setInRowLoanAccountExtraitTrxSn(int value) {
        this.inRowLoanAccountExtraitTrxSn = value;
    }

    /**
     * Gets the value of the inRowLoanAccountExtraitTrxUnit property.
     * 
     */
    public int getInRowLoanAccountExtraitTrxUnit() {
        return inRowLoanAccountExtraitTrxUnit;
    }

    /**
     * Sets the value of the inRowLoanAccountExtraitTrxUnit property.
     * 
     */
    public void setInRowLoanAccountExtraitTrxUnit(int value) {
        this.inRowLoanAccountExtraitTrxUnit = value;
    }

    /**
     * Gets the value of the inRowLoanAccountExtraitTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRowLoanAccountExtraitTrxUsr() {
        return inRowLoanAccountExtraitTrxUsr;
    }

    /**
     * Sets the value of the inRowLoanAccountExtraitTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRowLoanAccountExtraitTrxUsr(String value) {
        this.inRowLoanAccountExtraitTrxUsr = value;
    }

}
