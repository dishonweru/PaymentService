
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for A1904VAgreementLimitManipulationImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="A1904VAgreementLimitManipulationImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InAgrAdditionalActionsComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAgreementProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAgreementProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InAgreementAgrStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAgreementAmnPendSts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAgreementHistoryCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAgreementHistoryCurrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAgreementPendFinalDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InAgreementTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InAgreementLmtHistHistoryAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InAgreementLmtHistHistoryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAgreementLmtHistHistorySn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAgreementTypeProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAuthGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLimitCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLogReversalIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPrftTransactionTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTrxSsSecurityCmcbPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
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
@XmlType(name = "A1904VAgreementLimitManipulationImport", propOrder = {
    "inAgrAdditionalActionsComments",
    "inAgreementProfitsAccountNumber",
    "inAgreementProfitsAccountCd",
    "inAgreementAgrStatus",
    "inAgreementAmnPendSts",
    "inAgreementHistoryCnt",
    "inAgreementHistoryCurrSn",
    "inAgreementPendFinalDt",
    "inAgreementTmstamp",
    "inAgreementLmtHistHistoryAmount",
    "inAgreementLmtHistHistoryComments",
    "inAgreementLmtHistHistorySn",
    "inAgreementTypeProductIdProduct",
    "inAuthGrantedIefSuppliedFlag",
    "inIefSuppliedCommand",
    "inJustificIdJustific",
    "inLimitCurrencyIdCurrency",
    "inLogReversalIefSuppliedFlag",
    "inPrftTransactionIdTransact",
    "inPrftTransactionTmstamp",
    "inTrxSsSecurityCmcbPrftSystem",
    "inTrxTeamInformationSuper1Code",
    "inTrxTeamInformationSuper2Code",
    "inTrxTerminalTerminalNumber"
})
public class A1904VAgreementLimitManipulationImport
    extends BaseImport
{

    @XmlElement(name = "InAgrAdditionalActionsComments")
    protected String inAgrAdditionalActionsComments;
    @XmlElement(name = "InAgreementProfitsAccountNumber")
    protected String inAgreementProfitsAccountNumber;
    @XmlElement(name = "InAgreementProfitsAccountCd")
    protected short inAgreementProfitsAccountCd;
    @XmlElement(name = "InAgreementAgrStatus")
    protected String inAgreementAgrStatus;
    @XmlElement(name = "InAgreementAmnPendSts")
    protected String inAgreementAmnPendSts;
    @XmlElement(name = "InAgreementHistoryCnt")
    protected int inAgreementHistoryCnt;
    @XmlElement(name = "InAgreementHistoryCurrSn")
    protected int inAgreementHistoryCurrSn;
    @XmlElement(name = "InAgreementPendFinalDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inAgreementPendFinalDt;
    @XmlElement(name = "InAgreementTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inAgreementTmstamp;
    @XmlElement(name = "InAgreementLmtHistHistoryAmount", required = true)
    protected BigDecimal inAgreementLmtHistHistoryAmount;
    @XmlElement(name = "InAgreementLmtHistHistoryComments")
    protected String inAgreementLmtHistHistoryComments;
    @XmlElement(name = "InAgreementLmtHistHistorySn")
    protected int inAgreementLmtHistHistorySn;
    @XmlElement(name = "InAgreementTypeProductIdProduct")
    protected int inAgreementTypeProductIdProduct;
    @XmlElement(name = "InAuthGrantedIefSuppliedFlag")
    protected String inAuthGrantedIefSuppliedFlag;
    @XmlElement(name = "InIefSuppliedCommand")
    protected String inIefSuppliedCommand;
    @XmlElement(name = "InJustificIdJustific")
    protected int inJustificIdJustific;
    @XmlElement(name = "InLimitCurrencyIdCurrency")
    protected int inLimitCurrencyIdCurrency;
    @XmlElement(name = "InLogReversalIefSuppliedFlag")
    protected String inLogReversalIefSuppliedFlag;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InPrftTransactionTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inPrftTransactionTmstamp;
    @XmlElement(name = "InTrxSsSecurityCmcbPrftSystem")
    protected short inTrxSsSecurityCmcbPrftSystem;
    @XmlElement(name = "InTrxTeamInformationSuper1Code")
    protected String inTrxTeamInformationSuper1Code;
    @XmlElement(name = "InTrxTeamInformationSuper2Code")
    protected String inTrxTeamInformationSuper2Code;
    @XmlElement(name = "InTrxTerminalTerminalNumber")
    protected String inTrxTerminalTerminalNumber;

    /**
     * Gets the value of the inAgrAdditionalActionsComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAgrAdditionalActionsComments() {
        return inAgrAdditionalActionsComments;
    }

    /**
     * Sets the value of the inAgrAdditionalActionsComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAgrAdditionalActionsComments(String value) {
        this.inAgrAdditionalActionsComments = value;
    }

    /**
     * Gets the value of the inAgreementProfitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAgreementProfitsAccountNumber() {
        return inAgreementProfitsAccountNumber;
    }

    /**
     * Sets the value of the inAgreementProfitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAgreementProfitsAccountNumber(String value) {
        this.inAgreementProfitsAccountNumber = value;
    }

    /**
     * Gets the value of the inAgreementProfitsAccountCd property.
     * 
     */
    public short getInAgreementProfitsAccountCd() {
        return inAgreementProfitsAccountCd;
    }

    /**
     * Sets the value of the inAgreementProfitsAccountCd property.
     * 
     */
    public void setInAgreementProfitsAccountCd(short value) {
        this.inAgreementProfitsAccountCd = value;
    }

    /**
     * Gets the value of the inAgreementAgrStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAgreementAgrStatus() {
        return inAgreementAgrStatus;
    }

    /**
     * Sets the value of the inAgreementAgrStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAgreementAgrStatus(String value) {
        this.inAgreementAgrStatus = value;
    }

    /**
     * Gets the value of the inAgreementAmnPendSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAgreementAmnPendSts() {
        return inAgreementAmnPendSts;
    }

    /**
     * Sets the value of the inAgreementAmnPendSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAgreementAmnPendSts(String value) {
        this.inAgreementAmnPendSts = value;
    }

    /**
     * Gets the value of the inAgreementHistoryCnt property.
     * 
     */
    public int getInAgreementHistoryCnt() {
        return inAgreementHistoryCnt;
    }

    /**
     * Sets the value of the inAgreementHistoryCnt property.
     * 
     */
    public void setInAgreementHistoryCnt(int value) {
        this.inAgreementHistoryCnt = value;
    }

    /**
     * Gets the value of the inAgreementHistoryCurrSn property.
     * 
     */
    public int getInAgreementHistoryCurrSn() {
        return inAgreementHistoryCurrSn;
    }

    /**
     * Sets the value of the inAgreementHistoryCurrSn property.
     * 
     */
    public void setInAgreementHistoryCurrSn(int value) {
        this.inAgreementHistoryCurrSn = value;
    }

    /**
     * Gets the value of the inAgreementPendFinalDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInAgreementPendFinalDt() {
        return inAgreementPendFinalDt;
    }

    /**
     * Sets the value of the inAgreementPendFinalDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInAgreementPendFinalDt(XMLGregorianCalendar value) {
        this.inAgreementPendFinalDt = value;
    }

    /**
     * Gets the value of the inAgreementTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInAgreementTmstamp() {
        return inAgreementTmstamp;
    }

    /**
     * Sets the value of the inAgreementTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInAgreementTmstamp(XMLGregorianCalendar value) {
        this.inAgreementTmstamp = value;
    }

    /**
     * Gets the value of the inAgreementLmtHistHistoryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInAgreementLmtHistHistoryAmount() {
        return inAgreementLmtHistHistoryAmount;
    }

    /**
     * Sets the value of the inAgreementLmtHistHistoryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInAgreementLmtHistHistoryAmount(BigDecimal value) {
        this.inAgreementLmtHistHistoryAmount = value;
    }

    /**
     * Gets the value of the inAgreementLmtHistHistoryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAgreementLmtHistHistoryComments() {
        return inAgreementLmtHistHistoryComments;
    }

    /**
     * Sets the value of the inAgreementLmtHistHistoryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAgreementLmtHistHistoryComments(String value) {
        this.inAgreementLmtHistHistoryComments = value;
    }

    /**
     * Gets the value of the inAgreementLmtHistHistorySn property.
     * 
     */
    public int getInAgreementLmtHistHistorySn() {
        return inAgreementLmtHistHistorySn;
    }

    /**
     * Sets the value of the inAgreementLmtHistHistorySn property.
     * 
     */
    public void setInAgreementLmtHistHistorySn(int value) {
        this.inAgreementLmtHistHistorySn = value;
    }

    /**
     * Gets the value of the inAgreementTypeProductIdProduct property.
     * 
     */
    public int getInAgreementTypeProductIdProduct() {
        return inAgreementTypeProductIdProduct;
    }

    /**
     * Sets the value of the inAgreementTypeProductIdProduct property.
     * 
     */
    public void setInAgreementTypeProductIdProduct(int value) {
        this.inAgreementTypeProductIdProduct = value;
    }

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
     * Gets the value of the inLimitCurrencyIdCurrency property.
     * 
     */
    public int getInLimitCurrencyIdCurrency() {
        return inLimitCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inLimitCurrencyIdCurrency property.
     * 
     */
    public void setInLimitCurrencyIdCurrency(int value) {
        this.inLimitCurrencyIdCurrency = value;
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
     * Gets the value of the inPrftTransactionTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInPrftTransactionTmstamp() {
        return inPrftTransactionTmstamp;
    }

    /**
     * Sets the value of the inPrftTransactionTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInPrftTransactionTmstamp(XMLGregorianCalendar value) {
        this.inPrftTransactionTmstamp = value;
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

}
