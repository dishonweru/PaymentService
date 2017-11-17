
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for A1910VCustomerCreditLimitManipulationImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="A1910VCustomerCreditLimitManipulationImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InAuthGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCrLineTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCreditLineChangeCustomerCreditLineCrlineAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InCreditLineChangeCustomerCreditLineEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCreditLineChangeCustomerCreditLineEvaluationDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCreditLineChangeCustomerCreditLineExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCreditLineChangeCustomerCreditLineReevaluationDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCreditLineChangeCustomerCreditLineTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCreditLineChangeCustomerCreditLineUtilisedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomerTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InEntryStatusSelectionEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLogReversalIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOldGrpCustCrLine" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfA1910VInOldGrpCustCrLineItem" minOccurs="0"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSsSecurityCmcbPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSubscriptIefSuppliedNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxTeamInformationSuper1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxTeamInformationSuper2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "A1910VCustomerCreditLimitManipulationImport", propOrder = {
    "inAuthGrantedIefSuppliedFlag",
    "inCrLineTypeGenericDetailSerialNum",
    "inCreditLineChangeCustomerCreditLineCrlineAmount",
    "inCreditLineChangeCustomerCreditLineEntryStatus",
    "inCreditLineChangeCustomerCreditLineEvaluationDt",
    "inCreditLineChangeCustomerCreditLineExpiryDate",
    "inCreditLineChangeCustomerCreditLineReevaluationDt",
    "inCreditLineChangeCustomerCreditLineTmstamp",
    "inCreditLineChangeCustomerCreditLineUtilisedAmount",
    "inCurrencyIdCurrency",
    "inCurrencyShortDescr",
    "inCustomerCDigit",
    "inCustomerCustId",
    "inCustomerTmstamp",
    "inEntryStatusSelectionEntryStatus",
    "inIefSuppliedCommand",
    "inJustificIdJustific",
    "inLogReversalIefSuppliedFlag",
    "inOldGrpCustCrLine",
    "inPrftTransactionIdTransact",
    "inProductIdProduct",
    "inSsSecurityCmcbPrftSystem",
    "inSubscriptIefSuppliedNumber",
    "inTrxTeamInformationSuper1Code",
    "inTrxTeamInformationSuper2Code",
    "inTrxTerminalTerminalNumber"
})
public class A1910VCustomerCreditLimitManipulationImport
    extends BaseImport
{

    @XmlElement(name = "InAuthGrantedIefSuppliedFlag")
    protected String inAuthGrantedIefSuppliedFlag;
    @XmlElement(name = "InCrLineTypeGenericDetailSerialNum")
    protected int inCrLineTypeGenericDetailSerialNum;
    @XmlElement(name = "InCreditLineChangeCustomerCreditLineCrlineAmount", required = true)
    protected BigDecimal inCreditLineChangeCustomerCreditLineCrlineAmount;
    @XmlElement(name = "InCreditLineChangeCustomerCreditLineEntryStatus")
    protected String inCreditLineChangeCustomerCreditLineEntryStatus;
    @XmlElement(name = "InCreditLineChangeCustomerCreditLineEvaluationDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCreditLineChangeCustomerCreditLineEvaluationDt;
    @XmlElement(name = "InCreditLineChangeCustomerCreditLineExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCreditLineChangeCustomerCreditLineExpiryDate;
    @XmlElement(name = "InCreditLineChangeCustomerCreditLineReevaluationDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCreditLineChangeCustomerCreditLineReevaluationDt;
    @XmlElement(name = "InCreditLineChangeCustomerCreditLineTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCreditLineChangeCustomerCreditLineTmstamp;
    @XmlElement(name = "InCreditLineChangeCustomerCreditLineUtilisedAmount", required = true)
    protected BigDecimal inCreditLineChangeCustomerCreditLineUtilisedAmount;
    @XmlElement(name = "InCurrencyIdCurrency")
    protected int inCurrencyIdCurrency;
    @XmlElement(name = "InCurrencyShortDescr")
    protected String inCurrencyShortDescr;
    @XmlElement(name = "InCustomerCDigit")
    protected short inCustomerCDigit;
    @XmlElement(name = "InCustomerCustId")
    protected int inCustomerCustId;
    @XmlElement(name = "InCustomerTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustomerTmstamp;
    @XmlElement(name = "InEntryStatusSelectionEntryStatus")
    protected String inEntryStatusSelectionEntryStatus;
    @XmlElement(name = "InIefSuppliedCommand")
    protected String inIefSuppliedCommand;
    @XmlElement(name = "InJustificIdJustific")
    protected int inJustificIdJustific;
    @XmlElement(name = "InLogReversalIefSuppliedFlag")
    protected String inLogReversalIefSuppliedFlag;
    @XmlElement(name = "InOldGrpCustCrLine")
    protected ArrayOfA1910VInOldGrpCustCrLineItem inOldGrpCustCrLine;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InProductIdProduct")
    protected int inProductIdProduct;
    @XmlElement(name = "InSsSecurityCmcbPrftSystem")
    protected short inSsSecurityCmcbPrftSystem;
    @XmlElement(name = "InSubscriptIefSuppliedNumber")
    protected int inSubscriptIefSuppliedNumber;
    @XmlElement(name = "InTrxTeamInformationSuper1Code")
    protected String inTrxTeamInformationSuper1Code;
    @XmlElement(name = "InTrxTeamInformationSuper2Code")
    protected String inTrxTeamInformationSuper2Code;
    @XmlElement(name = "InTrxTerminalTerminalNumber")
    protected String inTrxTerminalTerminalNumber;

    /**
     * Gets the value of the inAuthGrantedIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthGrantedIefSuppliedFlag() {
        return inAuthGrantedIefSuppliedFlag;
    }

    /**
     * Sets the value of the inAuthGrantedIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthGrantedIefSuppliedFlag(String value) {
        this.inAuthGrantedIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inCrLineTypeGenericDetailSerialNum property.
     * 
     */
    public int getInCrLineTypeGenericDetailSerialNum() {
        return inCrLineTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inCrLineTypeGenericDetailSerialNum property.
     * 
     */
    public void setInCrLineTypeGenericDetailSerialNum(int value) {
        this.inCrLineTypeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inCreditLineChangeCustomerCreditLineCrlineAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInCreditLineChangeCustomerCreditLineCrlineAmount() {
        return inCreditLineChangeCustomerCreditLineCrlineAmount;
    }

    /**
     * Sets the value of the inCreditLineChangeCustomerCreditLineCrlineAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInCreditLineChangeCustomerCreditLineCrlineAmount(BigDecimal value) {
        this.inCreditLineChangeCustomerCreditLineCrlineAmount = value;
    }

    /**
     * Gets the value of the inCreditLineChangeCustomerCreditLineEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCreditLineChangeCustomerCreditLineEntryStatus() {
        return inCreditLineChangeCustomerCreditLineEntryStatus;
    }

    /**
     * Sets the value of the inCreditLineChangeCustomerCreditLineEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCreditLineChangeCustomerCreditLineEntryStatus(String value) {
        this.inCreditLineChangeCustomerCreditLineEntryStatus = value;
    }

    /**
     * Gets the value of the inCreditLineChangeCustomerCreditLineEvaluationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCreditLineChangeCustomerCreditLineEvaluationDt() {
        return inCreditLineChangeCustomerCreditLineEvaluationDt;
    }

    /**
     * Sets the value of the inCreditLineChangeCustomerCreditLineEvaluationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCreditLineChangeCustomerCreditLineEvaluationDt(XMLGregorianCalendar value) {
        this.inCreditLineChangeCustomerCreditLineEvaluationDt = value;
    }

    /**
     * Gets the value of the inCreditLineChangeCustomerCreditLineExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCreditLineChangeCustomerCreditLineExpiryDate() {
        return inCreditLineChangeCustomerCreditLineExpiryDate;
    }

    /**
     * Sets the value of the inCreditLineChangeCustomerCreditLineExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCreditLineChangeCustomerCreditLineExpiryDate(XMLGregorianCalendar value) {
        this.inCreditLineChangeCustomerCreditLineExpiryDate = value;
    }

    /**
     * Gets the value of the inCreditLineChangeCustomerCreditLineReevaluationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCreditLineChangeCustomerCreditLineReevaluationDt() {
        return inCreditLineChangeCustomerCreditLineReevaluationDt;
    }

    /**
     * Sets the value of the inCreditLineChangeCustomerCreditLineReevaluationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCreditLineChangeCustomerCreditLineReevaluationDt(XMLGregorianCalendar value) {
        this.inCreditLineChangeCustomerCreditLineReevaluationDt = value;
    }

    /**
     * Gets the value of the inCreditLineChangeCustomerCreditLineTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCreditLineChangeCustomerCreditLineTmstamp() {
        return inCreditLineChangeCustomerCreditLineTmstamp;
    }

    /**
     * Sets the value of the inCreditLineChangeCustomerCreditLineTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCreditLineChangeCustomerCreditLineTmstamp(XMLGregorianCalendar value) {
        this.inCreditLineChangeCustomerCreditLineTmstamp = value;
    }

    /**
     * Gets the value of the inCreditLineChangeCustomerCreditLineUtilisedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInCreditLineChangeCustomerCreditLineUtilisedAmount() {
        return inCreditLineChangeCustomerCreditLineUtilisedAmount;
    }

    /**
     * Sets the value of the inCreditLineChangeCustomerCreditLineUtilisedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInCreditLineChangeCustomerCreditLineUtilisedAmount(BigDecimal value) {
        this.inCreditLineChangeCustomerCreditLineUtilisedAmount = value;
    }

    /**
     * Gets the value of the inCurrencyIdCurrency property.
     * 
     */
    public int getInCurrencyIdCurrency() {
        return inCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inCurrencyIdCurrency property.
     * 
     */
    public void setInCurrencyIdCurrency(int value) {
        this.inCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCurrencyShortDescr() {
        return inCurrencyShortDescr;
    }

    /**
     * Sets the value of the inCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCurrencyShortDescr(String value) {
        this.inCurrencyShortDescr = value;
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
     * Gets the value of the inCustomerTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCustomerTmstamp() {
        return inCustomerTmstamp;
    }

    /**
     * Sets the value of the inCustomerTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCustomerTmstamp(XMLGregorianCalendar value) {
        this.inCustomerTmstamp = value;
    }

    /**
     * Gets the value of the inEntryStatusSelectionEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEntryStatusSelectionEntryStatus() {
        return inEntryStatusSelectionEntryStatus;
    }

    /**
     * Sets the value of the inEntryStatusSelectionEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEntryStatusSelectionEntryStatus(String value) {
        this.inEntryStatusSelectionEntryStatus = value;
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
     * Gets the value of the inLogReversalIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogReversalIefSuppliedFlag() {
        return inLogReversalIefSuppliedFlag;
    }

    /**
     * Sets the value of the inLogReversalIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogReversalIefSuppliedFlag(String value) {
        this.inLogReversalIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inOldGrpCustCrLine property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfA1910VInOldGrpCustCrLineItem }
     *     
     */
    public ArrayOfA1910VInOldGrpCustCrLineItem getInOldGrpCustCrLine() {
        return inOldGrpCustCrLine;
    }

    /**
     * Sets the value of the inOldGrpCustCrLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfA1910VInOldGrpCustCrLineItem }
     *     
     */
    public void setInOldGrpCustCrLine(ArrayOfA1910VInOldGrpCustCrLineItem value) {
        this.inOldGrpCustCrLine = value;
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
     * Gets the value of the inSubscriptIefSuppliedNumber property.
     * 
     */
    public int getInSubscriptIefSuppliedNumber() {
        return inSubscriptIefSuppliedNumber;
    }

    /**
     * Sets the value of the inSubscriptIefSuppliedNumber property.
     * 
     */
    public void setInSubscriptIefSuppliedNumber(int value) {
        this.inSubscriptIefSuppliedNumber = value;
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

}
