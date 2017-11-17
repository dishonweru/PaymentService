
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BalanceInquiryMiniStatementImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceInquiryMiniStatementImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="ProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFstDemandExtraitTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLogTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InNumberOfEntriesIefSuppliedNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InQryFstDemandExtraitChequeCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InQryFstDemandExtraitChequeNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InQryFstDemandExtraitDebitCreditFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InQryFstDemandExtraitEntryAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InQryFstDemandExtraitEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InQryFstDemandExtraitIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InQryFstDemandExtraitIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InQryFstDemandExtraitPrevAccBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InQryFstDemandExtraitReverseFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InQryFstDemandExtraitTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InQryFstDemandExtraitTrxSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InQryFstDemandExtraitTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InQryFstDemandExtraitTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InQryFstDemandExtraitValueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InUsedInputCharSuppliedChar37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProfitsAccountGenericAccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProfitsAccountWfeDetail" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InProfitsAccountWfeHeader" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InProfitsAccountWfsDetail" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InProfitsAccountWfsHeader" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InDateToFstDemandExtraitTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceInquiryMiniStatementImport", propOrder = {
    "profitsAccountNumber",
    "profitsAccountCd",
    "command",
    "inDepositAccountDesignation",
    "inFstDemandExtraitTrxDate",
    "inLogTerminalTerminalNumber",
    "inNumberOfEntriesIefSuppliedNumber",
    "inQryFstDemandExtraitChequeCd",
    "inQryFstDemandExtraitChequeNumber",
    "inQryFstDemandExtraitDebitCreditFlag",
    "inQryFstDemandExtraitEntryAmount",
    "inQryFstDemandExtraitEntryComments",
    "inQryFstDemandExtraitIdJustific",
    "inQryFstDemandExtraitIdTransact",
    "inQryFstDemandExtraitPrevAccBalance",
    "inQryFstDemandExtraitReverseFlag",
    "inQryFstDemandExtraitTrxDate",
    "inQryFstDemandExtraitTrxSn",
    "inQryFstDemandExtraitTrxUnit",
    "inQryFstDemandExtraitTrxUsr",
    "inQryFstDemandExtraitValueDate",
    "inUsedInputCharSuppliedChar37",
    "inProfitsAccountGenericAccountNo",
    "inProfitsAccountWfeDetail",
    "inProfitsAccountWfeHeader",
    "inProfitsAccountWfsDetail",
    "inProfitsAccountWfsHeader",
    "inDateToFstDemandExtraitTrxDate"
})
public class BalanceInquiryMiniStatementImport
    extends BaseImport
{

    @XmlElement(name = "ProfitsAccountNumber")
    protected String profitsAccountNumber;
    @XmlElement(name = "ProfitsAccountCd")
    protected short profitsAccountCd;
    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InDepositAccountDesignation")
    protected String inDepositAccountDesignation;
    @XmlElement(name = "InFstDemandExtraitTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inFstDemandExtraitTrxDate;
    @XmlElement(name = "InLogTerminalTerminalNumber")
    protected String inLogTerminalTerminalNumber;
    @XmlElement(name = "InNumberOfEntriesIefSuppliedNumber")
    protected int inNumberOfEntriesIefSuppliedNumber;
    @XmlElement(name = "InQryFstDemandExtraitChequeCd")
    protected short inQryFstDemandExtraitChequeCd;
    @XmlElement(name = "InQryFstDemandExtraitChequeNumber")
    protected double inQryFstDemandExtraitChequeNumber;
    @XmlElement(name = "InQryFstDemandExtraitDebitCreditFlag")
    protected String inQryFstDemandExtraitDebitCreditFlag;
    @XmlElement(name = "InQryFstDemandExtraitEntryAmount", required = true)
    protected BigDecimal inQryFstDemandExtraitEntryAmount;
    @XmlElement(name = "InQryFstDemandExtraitEntryComments")
    protected String inQryFstDemandExtraitEntryComments;
    @XmlElement(name = "InQryFstDemandExtraitIdJustific")
    protected int inQryFstDemandExtraitIdJustific;
    @XmlElement(name = "InQryFstDemandExtraitIdTransact")
    protected int inQryFstDemandExtraitIdTransact;
    @XmlElement(name = "InQryFstDemandExtraitPrevAccBalance", required = true)
    protected BigDecimal inQryFstDemandExtraitPrevAccBalance;
    @XmlElement(name = "InQryFstDemandExtraitReverseFlag")
    protected String inQryFstDemandExtraitReverseFlag;
    @XmlElement(name = "InQryFstDemandExtraitTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inQryFstDemandExtraitTrxDate;
    @XmlElement(name = "InQryFstDemandExtraitTrxSn")
    protected int inQryFstDemandExtraitTrxSn;
    @XmlElement(name = "InQryFstDemandExtraitTrxUnit")
    protected int inQryFstDemandExtraitTrxUnit;
    @XmlElement(name = "InQryFstDemandExtraitTrxUsr")
    protected String inQryFstDemandExtraitTrxUsr;
    @XmlElement(name = "InQryFstDemandExtraitValueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inQryFstDemandExtraitValueDate;
    @XmlElement(name = "InUsedInputCharSuppliedChar37")
    protected String inUsedInputCharSuppliedChar37;
    @XmlElement(name = "InProfitsAccountGenericAccountNo")
    protected String inProfitsAccountGenericAccountNo;
    @XmlElement(name = "InProfitsAccountWfeDetail")
    protected double inProfitsAccountWfeDetail;
    @XmlElement(name = "InProfitsAccountWfeHeader")
    protected double inProfitsAccountWfeHeader;
    @XmlElement(name = "InProfitsAccountWfsDetail")
    protected double inProfitsAccountWfsDetail;
    @XmlElement(name = "InProfitsAccountWfsHeader")
    protected double inProfitsAccountWfsHeader;
    @XmlElement(name = "InDateToFstDemandExtraitTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDateToFstDemandExtraitTrxDate;

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
     * Gets the value of the inDepositAccountDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccountDesignation() {
        return inDepositAccountDesignation;
    }

    /**
     * Sets the value of the inDepositAccountDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccountDesignation(String value) {
        this.inDepositAccountDesignation = value;
    }

    /**
     * Gets the value of the inFstDemandExtraitTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInFstDemandExtraitTrxDate() {
        return inFstDemandExtraitTrxDate;
    }

    /**
     * Sets the value of the inFstDemandExtraitTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInFstDemandExtraitTrxDate(XMLGregorianCalendar value) {
        this.inFstDemandExtraitTrxDate = value;
    }

    /**
     * Gets the value of the inLogTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogTerminalTerminalNumber() {
        return inLogTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inLogTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogTerminalTerminalNumber(String value) {
        this.inLogTerminalTerminalNumber = value;
    }

    /**
     * Gets the value of the inNumberOfEntriesIefSuppliedNumber property.
     * 
     */
    public int getInNumberOfEntriesIefSuppliedNumber() {
        return inNumberOfEntriesIefSuppliedNumber;
    }

    /**
     * Sets the value of the inNumberOfEntriesIefSuppliedNumber property.
     * 
     */
    public void setInNumberOfEntriesIefSuppliedNumber(int value) {
        this.inNumberOfEntriesIefSuppliedNumber = value;
    }

    /**
     * Gets the value of the inQryFstDemandExtraitChequeCd property.
     * 
     */
    public short getInQryFstDemandExtraitChequeCd() {
        return inQryFstDemandExtraitChequeCd;
    }

    /**
     * Sets the value of the inQryFstDemandExtraitChequeCd property.
     * 
     */
    public void setInQryFstDemandExtraitChequeCd(short value) {
        this.inQryFstDemandExtraitChequeCd = value;
    }

    /**
     * Gets the value of the inQryFstDemandExtraitChequeNumber property.
     * 
     */
    public double getInQryFstDemandExtraitChequeNumber() {
        return inQryFstDemandExtraitChequeNumber;
    }

    /**
     * Sets the value of the inQryFstDemandExtraitChequeNumber property.
     * 
     */
    public void setInQryFstDemandExtraitChequeNumber(double value) {
        this.inQryFstDemandExtraitChequeNumber = value;
    }

    /**
     * Gets the value of the inQryFstDemandExtraitDebitCreditFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInQryFstDemandExtraitDebitCreditFlag() {
        return inQryFstDemandExtraitDebitCreditFlag;
    }

    /**
     * Sets the value of the inQryFstDemandExtraitDebitCreditFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInQryFstDemandExtraitDebitCreditFlag(String value) {
        this.inQryFstDemandExtraitDebitCreditFlag = value;
    }

    /**
     * Gets the value of the inQryFstDemandExtraitEntryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInQryFstDemandExtraitEntryAmount() {
        return inQryFstDemandExtraitEntryAmount;
    }

    /**
     * Sets the value of the inQryFstDemandExtraitEntryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInQryFstDemandExtraitEntryAmount(BigDecimal value) {
        this.inQryFstDemandExtraitEntryAmount = value;
    }

    /**
     * Gets the value of the inQryFstDemandExtraitEntryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInQryFstDemandExtraitEntryComments() {
        return inQryFstDemandExtraitEntryComments;
    }

    /**
     * Sets the value of the inQryFstDemandExtraitEntryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInQryFstDemandExtraitEntryComments(String value) {
        this.inQryFstDemandExtraitEntryComments = value;
    }

    /**
     * Gets the value of the inQryFstDemandExtraitIdJustific property.
     * 
     */
    public int getInQryFstDemandExtraitIdJustific() {
        return inQryFstDemandExtraitIdJustific;
    }

    /**
     * Sets the value of the inQryFstDemandExtraitIdJustific property.
     * 
     */
    public void setInQryFstDemandExtraitIdJustific(int value) {
        this.inQryFstDemandExtraitIdJustific = value;
    }

    /**
     * Gets the value of the inQryFstDemandExtraitIdTransact property.
     * 
     */
    public int getInQryFstDemandExtraitIdTransact() {
        return inQryFstDemandExtraitIdTransact;
    }

    /**
     * Sets the value of the inQryFstDemandExtraitIdTransact property.
     * 
     */
    public void setInQryFstDemandExtraitIdTransact(int value) {
        this.inQryFstDemandExtraitIdTransact = value;
    }

    /**
     * Gets the value of the inQryFstDemandExtraitPrevAccBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInQryFstDemandExtraitPrevAccBalance() {
        return inQryFstDemandExtraitPrevAccBalance;
    }

    /**
     * Sets the value of the inQryFstDemandExtraitPrevAccBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInQryFstDemandExtraitPrevAccBalance(BigDecimal value) {
        this.inQryFstDemandExtraitPrevAccBalance = value;
    }

    /**
     * Gets the value of the inQryFstDemandExtraitReverseFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInQryFstDemandExtraitReverseFlag() {
        return inQryFstDemandExtraitReverseFlag;
    }

    /**
     * Sets the value of the inQryFstDemandExtraitReverseFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInQryFstDemandExtraitReverseFlag(String value) {
        this.inQryFstDemandExtraitReverseFlag = value;
    }

    /**
     * Gets the value of the inQryFstDemandExtraitTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInQryFstDemandExtraitTrxDate() {
        return inQryFstDemandExtraitTrxDate;
    }

    /**
     * Sets the value of the inQryFstDemandExtraitTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInQryFstDemandExtraitTrxDate(XMLGregorianCalendar value) {
        this.inQryFstDemandExtraitTrxDate = value;
    }

    /**
     * Gets the value of the inQryFstDemandExtraitTrxSn property.
     * 
     */
    public int getInQryFstDemandExtraitTrxSn() {
        return inQryFstDemandExtraitTrxSn;
    }

    /**
     * Sets the value of the inQryFstDemandExtraitTrxSn property.
     * 
     */
    public void setInQryFstDemandExtraitTrxSn(int value) {
        this.inQryFstDemandExtraitTrxSn = value;
    }

    /**
     * Gets the value of the inQryFstDemandExtraitTrxUnit property.
     * 
     */
    public int getInQryFstDemandExtraitTrxUnit() {
        return inQryFstDemandExtraitTrxUnit;
    }

    /**
     * Sets the value of the inQryFstDemandExtraitTrxUnit property.
     * 
     */
    public void setInQryFstDemandExtraitTrxUnit(int value) {
        this.inQryFstDemandExtraitTrxUnit = value;
    }

    /**
     * Gets the value of the inQryFstDemandExtraitTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInQryFstDemandExtraitTrxUsr() {
        return inQryFstDemandExtraitTrxUsr;
    }

    /**
     * Sets the value of the inQryFstDemandExtraitTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInQryFstDemandExtraitTrxUsr(String value) {
        this.inQryFstDemandExtraitTrxUsr = value;
    }

    /**
     * Gets the value of the inQryFstDemandExtraitValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInQryFstDemandExtraitValueDate() {
        return inQryFstDemandExtraitValueDate;
    }

    /**
     * Sets the value of the inQryFstDemandExtraitValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInQryFstDemandExtraitValueDate(XMLGregorianCalendar value) {
        this.inQryFstDemandExtraitValueDate = value;
    }

    /**
     * Gets the value of the inUsedInputCharSuppliedChar37 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUsedInputCharSuppliedChar37() {
        return inUsedInputCharSuppliedChar37;
    }

    /**
     * Sets the value of the inUsedInputCharSuppliedChar37 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUsedInputCharSuppliedChar37(String value) {
        this.inUsedInputCharSuppliedChar37 = value;
    }

    /**
     * Gets the value of the inProfitsAccountGenericAccountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProfitsAccountGenericAccountNo() {
        return inProfitsAccountGenericAccountNo;
    }

    /**
     * Sets the value of the inProfitsAccountGenericAccountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProfitsAccountGenericAccountNo(String value) {
        this.inProfitsAccountGenericAccountNo = value;
    }

    /**
     * Gets the value of the inProfitsAccountWfeDetail property.
     * 
     */
    public double getInProfitsAccountWfeDetail() {
        return inProfitsAccountWfeDetail;
    }

    /**
     * Sets the value of the inProfitsAccountWfeDetail property.
     * 
     */
    public void setInProfitsAccountWfeDetail(double value) {
        this.inProfitsAccountWfeDetail = value;
    }

    /**
     * Gets the value of the inProfitsAccountWfeHeader property.
     * 
     */
    public double getInProfitsAccountWfeHeader() {
        return inProfitsAccountWfeHeader;
    }

    /**
     * Sets the value of the inProfitsAccountWfeHeader property.
     * 
     */
    public void setInProfitsAccountWfeHeader(double value) {
        this.inProfitsAccountWfeHeader = value;
    }

    /**
     * Gets the value of the inProfitsAccountWfsDetail property.
     * 
     */
    public double getInProfitsAccountWfsDetail() {
        return inProfitsAccountWfsDetail;
    }

    /**
     * Sets the value of the inProfitsAccountWfsDetail property.
     * 
     */
    public void setInProfitsAccountWfsDetail(double value) {
        this.inProfitsAccountWfsDetail = value;
    }

    /**
     * Gets the value of the inProfitsAccountWfsHeader property.
     * 
     */
    public double getInProfitsAccountWfsHeader() {
        return inProfitsAccountWfsHeader;
    }

    /**
     * Sets the value of the inProfitsAccountWfsHeader property.
     * 
     */
    public void setInProfitsAccountWfsHeader(double value) {
        this.inProfitsAccountWfsHeader = value;
    }

    /**
     * Gets the value of the inDateToFstDemandExtraitTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDateToFstDemandExtraitTrxDate() {
        return inDateToFstDemandExtraitTrxDate;
    }

    /**
     * Sets the value of the inDateToFstDemandExtraitTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDateToFstDemandExtraitTrxDate(XMLGregorianCalendar value) {
        this.inDateToFstDemandExtraitTrxDate = value;
    }

}
