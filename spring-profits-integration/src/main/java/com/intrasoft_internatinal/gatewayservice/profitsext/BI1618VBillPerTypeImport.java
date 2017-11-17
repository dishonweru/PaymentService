
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BI1618V_BillPerTypeImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BI1618V_BillPerTypeImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillpertypeAllTypesIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillpertypeBankCollaborationBankBankId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillpertypeBillNumberBillBillNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillpertypeBillRegisterBillRegisterBregSerialNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InBillpertypeBilltypeBillBillTypeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillpertypeCategIefSuppliedFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillpertypeClearingtypeBillBillClrtypeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillpertypeCollSnBillBillCollSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InBillpertypeCurExtenStatusIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillpertypeDatesBillMntForClearBillPurchaseDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBillpertypeDatesBillMntForClearBillPurchaseDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBillpertypeDatesBillMntForClearIssueDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBillpertypeDatesBillMntForClearIssueDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBillpertypeFinalDatesBillMntForClearIssueDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBillpertypeFinalDatesBillMntForClearIssueDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBillpertypeIssuerBillIssuerBissCdigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBillpertypeIssuerBillIssuerBissCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillpertypeNoCoverIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillpertypeOvdBillOverdueFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillpertypePurchIefSuppliedFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillpertypeReportTypeIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillpertypeSerialNumBillBillSerialNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InBillpertypeStatusBillBillStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillpertypeUnitUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillspertypeCustomerCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBillspertypeCustomerCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InChequesForCollectionCorrSendDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLastClrBillBillClrtypeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLastClrBillBillSerialNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InLastCollaborationBankBankId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLastTypeBillBillSerialNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InLastTypeBillBillTypeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxSsSecurityCmcbPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTrxTeamInformationSuper1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxTeamInformationSuper2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocRetrieveBillOpenlistIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BI1618V_BillPerTypeImport", propOrder = {
    "command",
    "inBillpertypeAllTypesIefSuppliedFlag",
    "inBillpertypeBankCollaborationBankBankId",
    "inBillpertypeBillNumberBillBillNumber",
    "inBillpertypeBillRegisterBillRegisterBregSerialNum",
    "inBillpertypeBilltypeBillBillTypeFlag",
    "inBillpertypeCategIefSuppliedFlg",
    "inBillpertypeClearingtypeBillBillClrtypeFlag",
    "inBillpertypeCollSnBillBillCollSn",
    "inBillpertypeCurExtenStatusIefSuppliedFlag",
    "inBillpertypeDatesBillMntForClearBillPurchaseDateFrom",
    "inBillpertypeDatesBillMntForClearBillPurchaseDateTo",
    "inBillpertypeDatesBillMntForClearIssueDateFrom",
    "inBillpertypeDatesBillMntForClearIssueDateTo",
    "inBillpertypeFinalDatesBillMntForClearIssueDateFrom",
    "inBillpertypeFinalDatesBillMntForClearIssueDateTo",
    "inBillpertypeIssuerBillIssuerBissCdigit",
    "inBillpertypeIssuerBillIssuerBissCode",
    "inBillpertypeNoCoverIefSuppliedFlag",
    "inBillpertypeOvdBillOverdueFlg",
    "inBillpertypePurchIefSuppliedFlg",
    "inBillpertypeReportTypeIefSuppliedFlag",
    "inBillpertypeSerialNumBillBillSerialNum",
    "inBillpertypeStatusBillBillStatusFlag",
    "inBillpertypeUnitUnitCode",
    "inBillProductIdProduct",
    "inBillspertypeCustomerCustomerCDigit",
    "inBillspertypeCustomerCustomerCustId",
    "inChequesForCollectionCorrSendDate",
    "inIefSuppliedCommand",
    "inJustificDescription",
    "inJustificIdJustific",
    "inLastClrBillBillClrtypeFlag",
    "inLastClrBillBillSerialNum",
    "inLastCollaborationBankBankId",
    "inLastTypeBillBillSerialNum",
    "inLastTypeBillBillTypeFlag",
    "inPrftTransactionIdTransact",
    "inTrxSsSecurityCmcbPrftSystem",
    "inTrxTeamInformationSuper1Code",
    "inTrxTeamInformationSuper2Code",
    "inTrxTerminalTerminalNumber",
    "locRetrieveBillOpenlistIefSuppliedFlag"
})
public class BI1618VBillPerTypeImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InBillpertypeAllTypesIefSuppliedFlag")
    protected String inBillpertypeAllTypesIefSuppliedFlag;
    @XmlElement(name = "InBillpertypeBankCollaborationBankBankId")
    protected int inBillpertypeBankCollaborationBankBankId;
    @XmlElement(name = "InBillpertypeBillNumberBillBillNumber")
    protected String inBillpertypeBillNumberBillBillNumber;
    @XmlElement(name = "InBillpertypeBillRegisterBillRegisterBregSerialNum")
    protected double inBillpertypeBillRegisterBillRegisterBregSerialNum;
    @XmlElement(name = "InBillpertypeBilltypeBillBillTypeFlag")
    protected String inBillpertypeBilltypeBillBillTypeFlag;
    @XmlElement(name = "InBillpertypeCategIefSuppliedFlg")
    protected String inBillpertypeCategIefSuppliedFlg;
    @XmlElement(name = "InBillpertypeClearingtypeBillBillClrtypeFlag")
    protected String inBillpertypeClearingtypeBillBillClrtypeFlag;
    @XmlElement(name = "InBillpertypeCollSnBillBillCollSn")
    protected double inBillpertypeCollSnBillBillCollSn;
    @XmlElement(name = "InBillpertypeCurExtenStatusIefSuppliedFlag")
    protected String inBillpertypeCurExtenStatusIefSuppliedFlag;
    @XmlElement(name = "InBillpertypeDatesBillMntForClearBillPurchaseDateFrom", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBillpertypeDatesBillMntForClearBillPurchaseDateFrom;
    @XmlElement(name = "InBillpertypeDatesBillMntForClearBillPurchaseDateTo", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBillpertypeDatesBillMntForClearBillPurchaseDateTo;
    @XmlElement(name = "InBillpertypeDatesBillMntForClearIssueDateFrom", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBillpertypeDatesBillMntForClearIssueDateFrom;
    @XmlElement(name = "InBillpertypeDatesBillMntForClearIssueDateTo", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBillpertypeDatesBillMntForClearIssueDateTo;
    @XmlElement(name = "InBillpertypeFinalDatesBillMntForClearIssueDateFrom", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBillpertypeFinalDatesBillMntForClearIssueDateFrom;
    @XmlElement(name = "InBillpertypeFinalDatesBillMntForClearIssueDateTo", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBillpertypeFinalDatesBillMntForClearIssueDateTo;
    @XmlElement(name = "InBillpertypeIssuerBillIssuerBissCdigit")
    protected short inBillpertypeIssuerBillIssuerBissCdigit;
    @XmlElement(name = "InBillpertypeIssuerBillIssuerBissCode")
    protected int inBillpertypeIssuerBillIssuerBissCode;
    @XmlElement(name = "InBillpertypeNoCoverIefSuppliedFlag")
    protected String inBillpertypeNoCoverIefSuppliedFlag;
    @XmlElement(name = "InBillpertypeOvdBillOverdueFlg")
    protected String inBillpertypeOvdBillOverdueFlg;
    @XmlElement(name = "InBillpertypePurchIefSuppliedFlg")
    protected String inBillpertypePurchIefSuppliedFlg;
    @XmlElement(name = "InBillpertypeReportTypeIefSuppliedFlag")
    protected String inBillpertypeReportTypeIefSuppliedFlag;
    @XmlElement(name = "InBillpertypeSerialNumBillBillSerialNum")
    protected double inBillpertypeSerialNumBillBillSerialNum;
    @XmlElement(name = "InBillpertypeStatusBillBillStatusFlag")
    protected String inBillpertypeStatusBillBillStatusFlag;
    @XmlElement(name = "InBillpertypeUnitUnitCode")
    protected int inBillpertypeUnitUnitCode;
    @XmlElement(name = "InBillProductIdProduct")
    protected int inBillProductIdProduct;
    @XmlElement(name = "InBillspertypeCustomerCustomerCDigit")
    protected short inBillspertypeCustomerCustomerCDigit;
    @XmlElement(name = "InBillspertypeCustomerCustomerCustId")
    protected int inBillspertypeCustomerCustomerCustId;
    @XmlElement(name = "InChequesForCollectionCorrSendDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inChequesForCollectionCorrSendDate;
    @XmlElement(name = "InIefSuppliedCommand")
    protected String inIefSuppliedCommand;
    @XmlElement(name = "InJustificDescription")
    protected String inJustificDescription;
    @XmlElement(name = "InJustificIdJustific")
    protected int inJustificIdJustific;
    @XmlElement(name = "InLastClrBillBillClrtypeFlag")
    protected String inLastClrBillBillClrtypeFlag;
    @XmlElement(name = "InLastClrBillBillSerialNum")
    protected double inLastClrBillBillSerialNum;
    @XmlElement(name = "InLastCollaborationBankBankId")
    protected int inLastCollaborationBankBankId;
    @XmlElement(name = "InLastTypeBillBillSerialNum")
    protected double inLastTypeBillBillSerialNum;
    @XmlElement(name = "InLastTypeBillBillTypeFlag")
    protected String inLastTypeBillBillTypeFlag;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InTrxSsSecurityCmcbPrftSystem")
    protected short inTrxSsSecurityCmcbPrftSystem;
    @XmlElement(name = "InTrxTeamInformationSuper1Code")
    protected String inTrxTeamInformationSuper1Code;
    @XmlElement(name = "InTrxTeamInformationSuper2Code")
    protected String inTrxTeamInformationSuper2Code;
    @XmlElement(name = "InTrxTerminalTerminalNumber")
    protected String inTrxTerminalTerminalNumber;
    @XmlElement(name = "LocRetrieveBillOpenlistIefSuppliedFlag")
    protected String locRetrieveBillOpenlistIefSuppliedFlag;

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
     * Gets the value of the inBillpertypeAllTypesIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillpertypeAllTypesIefSuppliedFlag() {
        return inBillpertypeAllTypesIefSuppliedFlag;
    }

    /**
     * Sets the value of the inBillpertypeAllTypesIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillpertypeAllTypesIefSuppliedFlag(String value) {
        this.inBillpertypeAllTypesIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inBillpertypeBankCollaborationBankBankId property.
     * 
     */
    public int getInBillpertypeBankCollaborationBankBankId() {
        return inBillpertypeBankCollaborationBankBankId;
    }

    /**
     * Sets the value of the inBillpertypeBankCollaborationBankBankId property.
     * 
     */
    public void setInBillpertypeBankCollaborationBankBankId(int value) {
        this.inBillpertypeBankCollaborationBankBankId = value;
    }

    /**
     * Gets the value of the inBillpertypeBillNumberBillBillNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillpertypeBillNumberBillBillNumber() {
        return inBillpertypeBillNumberBillBillNumber;
    }

    /**
     * Sets the value of the inBillpertypeBillNumberBillBillNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillpertypeBillNumberBillBillNumber(String value) {
        this.inBillpertypeBillNumberBillBillNumber = value;
    }

    /**
     * Gets the value of the inBillpertypeBillRegisterBillRegisterBregSerialNum property.
     * 
     */
    public double getInBillpertypeBillRegisterBillRegisterBregSerialNum() {
        return inBillpertypeBillRegisterBillRegisterBregSerialNum;
    }

    /**
     * Sets the value of the inBillpertypeBillRegisterBillRegisterBregSerialNum property.
     * 
     */
    public void setInBillpertypeBillRegisterBillRegisterBregSerialNum(double value) {
        this.inBillpertypeBillRegisterBillRegisterBregSerialNum = value;
    }

    /**
     * Gets the value of the inBillpertypeBilltypeBillBillTypeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillpertypeBilltypeBillBillTypeFlag() {
        return inBillpertypeBilltypeBillBillTypeFlag;
    }

    /**
     * Sets the value of the inBillpertypeBilltypeBillBillTypeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillpertypeBilltypeBillBillTypeFlag(String value) {
        this.inBillpertypeBilltypeBillBillTypeFlag = value;
    }

    /**
     * Gets the value of the inBillpertypeCategIefSuppliedFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillpertypeCategIefSuppliedFlg() {
        return inBillpertypeCategIefSuppliedFlg;
    }

    /**
     * Sets the value of the inBillpertypeCategIefSuppliedFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillpertypeCategIefSuppliedFlg(String value) {
        this.inBillpertypeCategIefSuppliedFlg = value;
    }

    /**
     * Gets the value of the inBillpertypeClearingtypeBillBillClrtypeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillpertypeClearingtypeBillBillClrtypeFlag() {
        return inBillpertypeClearingtypeBillBillClrtypeFlag;
    }

    /**
     * Sets the value of the inBillpertypeClearingtypeBillBillClrtypeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillpertypeClearingtypeBillBillClrtypeFlag(String value) {
        this.inBillpertypeClearingtypeBillBillClrtypeFlag = value;
    }

    /**
     * Gets the value of the inBillpertypeCollSnBillBillCollSn property.
     * 
     */
    public double getInBillpertypeCollSnBillBillCollSn() {
        return inBillpertypeCollSnBillBillCollSn;
    }

    /**
     * Sets the value of the inBillpertypeCollSnBillBillCollSn property.
     * 
     */
    public void setInBillpertypeCollSnBillBillCollSn(double value) {
        this.inBillpertypeCollSnBillBillCollSn = value;
    }

    /**
     * Gets the value of the inBillpertypeCurExtenStatusIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillpertypeCurExtenStatusIefSuppliedFlag() {
        return inBillpertypeCurExtenStatusIefSuppliedFlag;
    }

    /**
     * Sets the value of the inBillpertypeCurExtenStatusIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillpertypeCurExtenStatusIefSuppliedFlag(String value) {
        this.inBillpertypeCurExtenStatusIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inBillpertypeDatesBillMntForClearBillPurchaseDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBillpertypeDatesBillMntForClearBillPurchaseDateFrom() {
        return inBillpertypeDatesBillMntForClearBillPurchaseDateFrom;
    }

    /**
     * Sets the value of the inBillpertypeDatesBillMntForClearBillPurchaseDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBillpertypeDatesBillMntForClearBillPurchaseDateFrom(XMLGregorianCalendar value) {
        this.inBillpertypeDatesBillMntForClearBillPurchaseDateFrom = value;
    }

    /**
     * Gets the value of the inBillpertypeDatesBillMntForClearBillPurchaseDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBillpertypeDatesBillMntForClearBillPurchaseDateTo() {
        return inBillpertypeDatesBillMntForClearBillPurchaseDateTo;
    }

    /**
     * Sets the value of the inBillpertypeDatesBillMntForClearBillPurchaseDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBillpertypeDatesBillMntForClearBillPurchaseDateTo(XMLGregorianCalendar value) {
        this.inBillpertypeDatesBillMntForClearBillPurchaseDateTo = value;
    }

    /**
     * Gets the value of the inBillpertypeDatesBillMntForClearIssueDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBillpertypeDatesBillMntForClearIssueDateFrom() {
        return inBillpertypeDatesBillMntForClearIssueDateFrom;
    }

    /**
     * Sets the value of the inBillpertypeDatesBillMntForClearIssueDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBillpertypeDatesBillMntForClearIssueDateFrom(XMLGregorianCalendar value) {
        this.inBillpertypeDatesBillMntForClearIssueDateFrom = value;
    }

    /**
     * Gets the value of the inBillpertypeDatesBillMntForClearIssueDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBillpertypeDatesBillMntForClearIssueDateTo() {
        return inBillpertypeDatesBillMntForClearIssueDateTo;
    }

    /**
     * Sets the value of the inBillpertypeDatesBillMntForClearIssueDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBillpertypeDatesBillMntForClearIssueDateTo(XMLGregorianCalendar value) {
        this.inBillpertypeDatesBillMntForClearIssueDateTo = value;
    }

    /**
     * Gets the value of the inBillpertypeFinalDatesBillMntForClearIssueDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBillpertypeFinalDatesBillMntForClearIssueDateFrom() {
        return inBillpertypeFinalDatesBillMntForClearIssueDateFrom;
    }

    /**
     * Sets the value of the inBillpertypeFinalDatesBillMntForClearIssueDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBillpertypeFinalDatesBillMntForClearIssueDateFrom(XMLGregorianCalendar value) {
        this.inBillpertypeFinalDatesBillMntForClearIssueDateFrom = value;
    }

    /**
     * Gets the value of the inBillpertypeFinalDatesBillMntForClearIssueDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBillpertypeFinalDatesBillMntForClearIssueDateTo() {
        return inBillpertypeFinalDatesBillMntForClearIssueDateTo;
    }

    /**
     * Sets the value of the inBillpertypeFinalDatesBillMntForClearIssueDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBillpertypeFinalDatesBillMntForClearIssueDateTo(XMLGregorianCalendar value) {
        this.inBillpertypeFinalDatesBillMntForClearIssueDateTo = value;
    }

    /**
     * Gets the value of the inBillpertypeIssuerBillIssuerBissCdigit property.
     * 
     */
    public short getInBillpertypeIssuerBillIssuerBissCdigit() {
        return inBillpertypeIssuerBillIssuerBissCdigit;
    }

    /**
     * Sets the value of the inBillpertypeIssuerBillIssuerBissCdigit property.
     * 
     */
    public void setInBillpertypeIssuerBillIssuerBissCdigit(short value) {
        this.inBillpertypeIssuerBillIssuerBissCdigit = value;
    }

    /**
     * Gets the value of the inBillpertypeIssuerBillIssuerBissCode property.
     * 
     */
    public int getInBillpertypeIssuerBillIssuerBissCode() {
        return inBillpertypeIssuerBillIssuerBissCode;
    }

    /**
     * Sets the value of the inBillpertypeIssuerBillIssuerBissCode property.
     * 
     */
    public void setInBillpertypeIssuerBillIssuerBissCode(int value) {
        this.inBillpertypeIssuerBillIssuerBissCode = value;
    }

    /**
     * Gets the value of the inBillpertypeNoCoverIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillpertypeNoCoverIefSuppliedFlag() {
        return inBillpertypeNoCoverIefSuppliedFlag;
    }

    /**
     * Sets the value of the inBillpertypeNoCoverIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillpertypeNoCoverIefSuppliedFlag(String value) {
        this.inBillpertypeNoCoverIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inBillpertypeOvdBillOverdueFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillpertypeOvdBillOverdueFlg() {
        return inBillpertypeOvdBillOverdueFlg;
    }

    /**
     * Sets the value of the inBillpertypeOvdBillOverdueFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillpertypeOvdBillOverdueFlg(String value) {
        this.inBillpertypeOvdBillOverdueFlg = value;
    }

    /**
     * Gets the value of the inBillpertypePurchIefSuppliedFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillpertypePurchIefSuppliedFlg() {
        return inBillpertypePurchIefSuppliedFlg;
    }

    /**
     * Sets the value of the inBillpertypePurchIefSuppliedFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillpertypePurchIefSuppliedFlg(String value) {
        this.inBillpertypePurchIefSuppliedFlg = value;
    }

    /**
     * Gets the value of the inBillpertypeReportTypeIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillpertypeReportTypeIefSuppliedFlag() {
        return inBillpertypeReportTypeIefSuppliedFlag;
    }

    /**
     * Sets the value of the inBillpertypeReportTypeIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillpertypeReportTypeIefSuppliedFlag(String value) {
        this.inBillpertypeReportTypeIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inBillpertypeSerialNumBillBillSerialNum property.
     * 
     */
    public double getInBillpertypeSerialNumBillBillSerialNum() {
        return inBillpertypeSerialNumBillBillSerialNum;
    }

    /**
     * Sets the value of the inBillpertypeSerialNumBillBillSerialNum property.
     * 
     */
    public void setInBillpertypeSerialNumBillBillSerialNum(double value) {
        this.inBillpertypeSerialNumBillBillSerialNum = value;
    }

    /**
     * Gets the value of the inBillpertypeStatusBillBillStatusFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillpertypeStatusBillBillStatusFlag() {
        return inBillpertypeStatusBillBillStatusFlag;
    }

    /**
     * Sets the value of the inBillpertypeStatusBillBillStatusFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillpertypeStatusBillBillStatusFlag(String value) {
        this.inBillpertypeStatusBillBillStatusFlag = value;
    }

    /**
     * Gets the value of the inBillpertypeUnitUnitCode property.
     * 
     */
    public int getInBillpertypeUnitUnitCode() {
        return inBillpertypeUnitUnitCode;
    }

    /**
     * Sets the value of the inBillpertypeUnitUnitCode property.
     * 
     */
    public void setInBillpertypeUnitUnitCode(int value) {
        this.inBillpertypeUnitUnitCode = value;
    }

    /**
     * Gets the value of the inBillProductIdProduct property.
     * 
     */
    public int getInBillProductIdProduct() {
        return inBillProductIdProduct;
    }

    /**
     * Sets the value of the inBillProductIdProduct property.
     * 
     */
    public void setInBillProductIdProduct(int value) {
        this.inBillProductIdProduct = value;
    }

    /**
     * Gets the value of the inBillspertypeCustomerCustomerCDigit property.
     * 
     */
    public short getInBillspertypeCustomerCustomerCDigit() {
        return inBillspertypeCustomerCustomerCDigit;
    }

    /**
     * Sets the value of the inBillspertypeCustomerCustomerCDigit property.
     * 
     */
    public void setInBillspertypeCustomerCustomerCDigit(short value) {
        this.inBillspertypeCustomerCustomerCDigit = value;
    }

    /**
     * Gets the value of the inBillspertypeCustomerCustomerCustId property.
     * 
     */
    public int getInBillspertypeCustomerCustomerCustId() {
        return inBillspertypeCustomerCustomerCustId;
    }

    /**
     * Sets the value of the inBillspertypeCustomerCustomerCustId property.
     * 
     */
    public void setInBillspertypeCustomerCustomerCustId(int value) {
        this.inBillspertypeCustomerCustomerCustId = value;
    }

    /**
     * Gets the value of the inChequesForCollectionCorrSendDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInChequesForCollectionCorrSendDate() {
        return inChequesForCollectionCorrSendDate;
    }

    /**
     * Sets the value of the inChequesForCollectionCorrSendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInChequesForCollectionCorrSendDate(XMLGregorianCalendar value) {
        this.inChequesForCollectionCorrSendDate = value;
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
     * Gets the value of the inJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInJustificDescription() {
        return inJustificDescription;
    }

    /**
     * Sets the value of the inJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInJustificDescription(String value) {
        this.inJustificDescription = value;
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
     * Gets the value of the inLastClrBillBillClrtypeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLastClrBillBillClrtypeFlag() {
        return inLastClrBillBillClrtypeFlag;
    }

    /**
     * Sets the value of the inLastClrBillBillClrtypeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLastClrBillBillClrtypeFlag(String value) {
        this.inLastClrBillBillClrtypeFlag = value;
    }

    /**
     * Gets the value of the inLastClrBillBillSerialNum property.
     * 
     */
    public double getInLastClrBillBillSerialNum() {
        return inLastClrBillBillSerialNum;
    }

    /**
     * Sets the value of the inLastClrBillBillSerialNum property.
     * 
     */
    public void setInLastClrBillBillSerialNum(double value) {
        this.inLastClrBillBillSerialNum = value;
    }

    /**
     * Gets the value of the inLastCollaborationBankBankId property.
     * 
     */
    public int getInLastCollaborationBankBankId() {
        return inLastCollaborationBankBankId;
    }

    /**
     * Sets the value of the inLastCollaborationBankBankId property.
     * 
     */
    public void setInLastCollaborationBankBankId(int value) {
        this.inLastCollaborationBankBankId = value;
    }

    /**
     * Gets the value of the inLastTypeBillBillSerialNum property.
     * 
     */
    public double getInLastTypeBillBillSerialNum() {
        return inLastTypeBillBillSerialNum;
    }

    /**
     * Sets the value of the inLastTypeBillBillSerialNum property.
     * 
     */
    public void setInLastTypeBillBillSerialNum(double value) {
        this.inLastTypeBillBillSerialNum = value;
    }

    /**
     * Gets the value of the inLastTypeBillBillTypeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLastTypeBillBillTypeFlag() {
        return inLastTypeBillBillTypeFlag;
    }

    /**
     * Sets the value of the inLastTypeBillBillTypeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLastTypeBillBillTypeFlag(String value) {
        this.inLastTypeBillBillTypeFlag = value;
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
     * Gets the value of the inTrxSsSecurityCmcbPrftSystem property.
     * 
     */
    public short getInTrxSsSecurityCmcbPrftSystem() {
        return inTrxSsSecurityCmcbPrftSystem;
    }

    /**
     * Sets the value of the inTrxSsSecurityCmcbPrftSystem property.
     * 
     */
    public void setInTrxSsSecurityCmcbPrftSystem(short value) {
        this.inTrxSsSecurityCmcbPrftSystem = value;
    }

    /**
     * Gets the value of the inTrxTeamInformationSuper1Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxTeamInformationSuper1Code() {
        return inTrxTeamInformationSuper1Code;
    }

    /**
     * Sets the value of the inTrxTeamInformationSuper1Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxTeamInformationSuper1Code(String value) {
        this.inTrxTeamInformationSuper1Code = value;
    }

    /**
     * Gets the value of the inTrxTeamInformationSuper2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxTeamInformationSuper2Code() {
        return inTrxTeamInformationSuper2Code;
    }

    /**
     * Sets the value of the inTrxTeamInformationSuper2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxTeamInformationSuper2Code(String value) {
        this.inTrxTeamInformationSuper2Code = value;
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

    /**
     * Gets the value of the locRetrieveBillOpenlistIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocRetrieveBillOpenlistIefSuppliedFlag() {
        return locRetrieveBillOpenlistIefSuppliedFlag;
    }

    /**
     * Sets the value of the locRetrieveBillOpenlistIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocRetrieveBillOpenlistIefSuppliedFlag(String value) {
        this.locRetrieveBillOpenlistIefSuppliedFlag = value;
    }

}
