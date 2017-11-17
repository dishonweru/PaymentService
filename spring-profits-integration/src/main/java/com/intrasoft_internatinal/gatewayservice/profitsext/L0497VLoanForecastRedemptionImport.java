
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for L0497VLoanForecastRedemptionImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0497VLoanForecastRedemptionImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeneficiaryCustCardInfoCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeneficiaryCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBeneficiaryCustomerShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCheckPenaltyFlagIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InForecastLoanAccountWorkForecastFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanRequestRequestLoanSts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanRequestRequestSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanRequestRequestSts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanRequestRequestType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanRequestRqExpireDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InMntMntRecordingAuthorizer1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMntMntRecordingAuthorizer2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMntMntRecordingPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InMntMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMntMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMntMntRecordingTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InMntMntRecordingTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMntMntRecordingTrxDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMntMntRecordingTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProcessCollectRedemptionAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InProcessCollectRedemptionAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessCollectRedemptionCustomerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProcessCollectRedemptionForecastAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InProcessCollectRedemptionForecastDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InProcessCollectRedemptionPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InProcessCollectRedemptionRedemptionAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InProcessCollectRedemptionRedemptionCmnts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessCollectRedemptionRedemptionDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InRepresentativeCustCardInfoCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRepresentativeCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InRepresentativeCustomerShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxAmountIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTrxBankParametersCurrTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTrxCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxLoanTrxRecordingIOtherAfm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxLoanTrxRecordingIOtherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxLoanTrxRecordingITrxComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxParametricRuleTrxImportsInTrxCapital" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTrxParametricRuleTrxImportsInTrxCom" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTrxParametricRuleTrxImportsInTrxExp" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTrxParametricRuleTrxImportsInTrxRlNrmInt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTrxParametricRuleTrxImportsInTrxRlPnlInt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTrxParametricRuleTrxImportsInTrxSubsidyInt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTrxParametricRuleTrxImportsInTrxUrlNrmInt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTrxParametricRuleTrxImportsInTrxUrlPnlInt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTrxPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxRequestCreationDateLoanRequestRqCreationDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTrxSsSecurityCmcbPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTrxTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InValueLoanAccountWorkValeurDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0497VLoanForecastRedemptionImport", propOrder = {
    "command",
    "inAuthGrantedIefSuppliedFlag",
    "inBeneficiaryCustCardInfoCardNo",
    "inBeneficiaryCustomerCustId",
    "inBeneficiaryCustomerShortName",
    "inCheckPenaltyFlagIefSuppliedFlag",
    "inForecastLoanAccountWorkForecastFlg",
    "inIefSuppliedCommand",
    "inLoanAccountProfitsAccountNumber",
    "inLoanAccountProfitsAccountCd",
    "inLoanRequestRequestLoanSts",
    "inLoanRequestRequestSn",
    "inLoanRequestRequestSts",
    "inLoanRequestRequestType",
    "inLoanRequestRqExpireDt",
    "inMntMntRecordingAuthorizer1",
    "inMntMntRecordingAuthorizer2",
    "inMntMntRecordingPrftSystem",
    "inMntMntRecordingReversalFlag",
    "inMntMntRecordingTerminalNumber",
    "inMntMntRecordingTmstamp",
    "inMntMntRecordingTrxCode",
    "inMntMntRecordingTrxDetails",
    "inMntMntRecordingTrxUsrSn",
    "inProcessCollectRedemptionAccountCd",
    "inProcessCollectRedemptionAccountNumber",
    "inProcessCollectRedemptionCustomerId",
    "inProcessCollectRedemptionForecastAmn",
    "inProcessCollectRedemptionForecastDt",
    "inProcessCollectRedemptionPrftSystem",
    "inProcessCollectRedemptionRedemptionAmn",
    "inProcessCollectRedemptionRedemptionCmnts",
    "inProcessCollectRedemptionRedemptionDt",
    "inRepresentativeCustCardInfoCardNo",
    "inRepresentativeCustomerCustId",
    "inRepresentativeCustomerShortName",
    "inTrxAmountIefSuppliedAmount",
    "inTrxBankParametersCurrTrxDate",
    "inTrxCurrencyIdCurrency",
    "inTrxCurrencyShortDescr",
    "inTrxJustificIdJustific",
    "inTrxLoanTrxRecordingIOtherAfm",
    "inTrxLoanTrxRecordingIOtherName",
    "inTrxLoanTrxRecordingITrxComments",
    "inTrxParametricRuleTrxImportsInTrxCapital",
    "inTrxParametricRuleTrxImportsInTrxCom",
    "inTrxParametricRuleTrxImportsInTrxExp",
    "inTrxParametricRuleTrxImportsInTrxRlNrmInt",
    "inTrxParametricRuleTrxImportsInTrxRlPnlInt",
    "inTrxParametricRuleTrxImportsInTrxSubsidyInt",
    "inTrxParametricRuleTrxImportsInTrxUrlNrmInt",
    "inTrxParametricRuleTrxImportsInTrxUrlPnlInt",
    "inTrxPrftTransactionIdTransact",
    "inTrxRequestCreationDateLoanRequestRqCreationDt",
    "inTrxSsSecurityCmcbPrftSystem",
    "inTrxTerminalTerminalNumber",
    "inValueLoanAccountWorkValeurDt"
})
public class L0497VLoanForecastRedemptionImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InAuthGrantedIefSuppliedFlag")
    protected String inAuthGrantedIefSuppliedFlag;
    @XmlElement(name = "InBeneficiaryCustCardInfoCardNo")
    protected String inBeneficiaryCustCardInfoCardNo;
    @XmlElement(name = "InBeneficiaryCustomerCustId")
    protected int inBeneficiaryCustomerCustId;
    @XmlElement(name = "InBeneficiaryCustomerShortName")
    protected String inBeneficiaryCustomerShortName;
    @XmlElement(name = "InCheckPenaltyFlagIefSuppliedFlag")
    protected String inCheckPenaltyFlagIefSuppliedFlag;
    @XmlElement(name = "InForecastLoanAccountWorkForecastFlg")
    protected String inForecastLoanAccountWorkForecastFlg;
    @XmlElement(name = "InIefSuppliedCommand")
    protected String inIefSuppliedCommand;
    @XmlElement(name = "InLoanAccountProfitsAccountNumber")
    protected String inLoanAccountProfitsAccountNumber;
    @XmlElement(name = "InLoanAccountProfitsAccountCd")
    protected short inLoanAccountProfitsAccountCd;
    @XmlElement(name = "InLoanRequestRequestLoanSts")
    protected String inLoanRequestRequestLoanSts;
    @XmlElement(name = "InLoanRequestRequestSn")
    protected short inLoanRequestRequestSn;
    @XmlElement(name = "InLoanRequestRequestSts")
    protected String inLoanRequestRequestSts;
    @XmlElement(name = "InLoanRequestRequestType")
    protected String inLoanRequestRequestType;
    @XmlElement(name = "InLoanRequestRqExpireDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanRequestRqExpireDt;
    @XmlElement(name = "InMntMntRecordingAuthorizer1")
    protected String inMntMntRecordingAuthorizer1;
    @XmlElement(name = "InMntMntRecordingAuthorizer2")
    protected String inMntMntRecordingAuthorizer2;
    @XmlElement(name = "InMntMntRecordingPrftSystem")
    protected short inMntMntRecordingPrftSystem;
    @XmlElement(name = "InMntMntRecordingReversalFlag")
    protected String inMntMntRecordingReversalFlag;
    @XmlElement(name = "InMntMntRecordingTerminalNumber")
    protected String inMntMntRecordingTerminalNumber;
    @XmlElement(name = "InMntMntRecordingTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inMntMntRecordingTmstamp;
    @XmlElement(name = "InMntMntRecordingTrxCode")
    protected int inMntMntRecordingTrxCode;
    @XmlElement(name = "InMntMntRecordingTrxDetails")
    protected String inMntMntRecordingTrxDetails;
    @XmlElement(name = "InMntMntRecordingTrxUsrSn")
    protected int inMntMntRecordingTrxUsrSn;
    @XmlElement(name = "InProcessCollectRedemptionAccountCd")
    protected short inProcessCollectRedemptionAccountCd;
    @XmlElement(name = "InProcessCollectRedemptionAccountNumber")
    protected String inProcessCollectRedemptionAccountNumber;
    @XmlElement(name = "InProcessCollectRedemptionCustomerId")
    protected int inProcessCollectRedemptionCustomerId;
    @XmlElement(name = "InProcessCollectRedemptionForecastAmn", required = true)
    protected BigDecimal inProcessCollectRedemptionForecastAmn;
    @XmlElement(name = "InProcessCollectRedemptionForecastDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inProcessCollectRedemptionForecastDt;
    @XmlElement(name = "InProcessCollectRedemptionPrftSystem")
    protected short inProcessCollectRedemptionPrftSystem;
    @XmlElement(name = "InProcessCollectRedemptionRedemptionAmn", required = true)
    protected BigDecimal inProcessCollectRedemptionRedemptionAmn;
    @XmlElement(name = "InProcessCollectRedemptionRedemptionCmnts")
    protected String inProcessCollectRedemptionRedemptionCmnts;
    @XmlElement(name = "InProcessCollectRedemptionRedemptionDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inProcessCollectRedemptionRedemptionDt;
    @XmlElement(name = "InRepresentativeCustCardInfoCardNo")
    protected String inRepresentativeCustCardInfoCardNo;
    @XmlElement(name = "InRepresentativeCustomerCustId")
    protected int inRepresentativeCustomerCustId;
    @XmlElement(name = "InRepresentativeCustomerShortName")
    protected String inRepresentativeCustomerShortName;
    @XmlElement(name = "InTrxAmountIefSuppliedAmount", required = true)
    protected BigDecimal inTrxAmountIefSuppliedAmount;
    @XmlElement(name = "InTrxBankParametersCurrTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTrxBankParametersCurrTrxDate;
    @XmlElement(name = "InTrxCurrencyIdCurrency")
    protected int inTrxCurrencyIdCurrency;
    @XmlElement(name = "InTrxCurrencyShortDescr")
    protected String inTrxCurrencyShortDescr;
    @XmlElement(name = "InTrxJustificIdJustific")
    protected int inTrxJustificIdJustific;
    @XmlElement(name = "InTrxLoanTrxRecordingIOtherAfm")
    protected String inTrxLoanTrxRecordingIOtherAfm;
    @XmlElement(name = "InTrxLoanTrxRecordingIOtherName")
    protected String inTrxLoanTrxRecordingIOtherName;
    @XmlElement(name = "InTrxLoanTrxRecordingITrxComments")
    protected String inTrxLoanTrxRecordingITrxComments;
    @XmlElement(name = "InTrxParametricRuleTrxImportsInTrxCapital", required = true)
    protected BigDecimal inTrxParametricRuleTrxImportsInTrxCapital;
    @XmlElement(name = "InTrxParametricRuleTrxImportsInTrxCom", required = true)
    protected BigDecimal inTrxParametricRuleTrxImportsInTrxCom;
    @XmlElement(name = "InTrxParametricRuleTrxImportsInTrxExp", required = true)
    protected BigDecimal inTrxParametricRuleTrxImportsInTrxExp;
    @XmlElement(name = "InTrxParametricRuleTrxImportsInTrxRlNrmInt", required = true)
    protected BigDecimal inTrxParametricRuleTrxImportsInTrxRlNrmInt;
    @XmlElement(name = "InTrxParametricRuleTrxImportsInTrxRlPnlInt", required = true)
    protected BigDecimal inTrxParametricRuleTrxImportsInTrxRlPnlInt;
    @XmlElement(name = "InTrxParametricRuleTrxImportsInTrxSubsidyInt", required = true)
    protected BigDecimal inTrxParametricRuleTrxImportsInTrxSubsidyInt;
    @XmlElement(name = "InTrxParametricRuleTrxImportsInTrxUrlNrmInt", required = true)
    protected BigDecimal inTrxParametricRuleTrxImportsInTrxUrlNrmInt;
    @XmlElement(name = "InTrxParametricRuleTrxImportsInTrxUrlPnlInt", required = true)
    protected BigDecimal inTrxParametricRuleTrxImportsInTrxUrlPnlInt;
    @XmlElement(name = "InTrxPrftTransactionIdTransact")
    protected int inTrxPrftTransactionIdTransact;
    @XmlElement(name = "InTrxRequestCreationDateLoanRequestRqCreationDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTrxRequestCreationDateLoanRequestRqCreationDt;
    @XmlElement(name = "InTrxSsSecurityCmcbPrftSystem")
    protected short inTrxSsSecurityCmcbPrftSystem;
    @XmlElement(name = "InTrxTerminalTerminalNumber")
    protected String inTrxTerminalTerminalNumber;
    @XmlElement(name = "InValueLoanAccountWorkValeurDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inValueLoanAccountWorkValeurDt;

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
     * Gets the value of the inBeneficiaryCustCardInfoCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeneficiaryCustCardInfoCardNo() {
        return inBeneficiaryCustCardInfoCardNo;
    }

    /**
     * Sets the value of the inBeneficiaryCustCardInfoCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeneficiaryCustCardInfoCardNo(String value) {
        this.inBeneficiaryCustCardInfoCardNo = value;
    }

    /**
     * Gets the value of the inBeneficiaryCustomerCustId property.
     * 
     */
    public int getInBeneficiaryCustomerCustId() {
        return inBeneficiaryCustomerCustId;
    }

    /**
     * Sets the value of the inBeneficiaryCustomerCustId property.
     * 
     */
    public void setInBeneficiaryCustomerCustId(int value) {
        this.inBeneficiaryCustomerCustId = value;
    }

    /**
     * Gets the value of the inBeneficiaryCustomerShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeneficiaryCustomerShortName() {
        return inBeneficiaryCustomerShortName;
    }

    /**
     * Sets the value of the inBeneficiaryCustomerShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeneficiaryCustomerShortName(String value) {
        this.inBeneficiaryCustomerShortName = value;
    }

    /**
     * Gets the value of the inCheckPenaltyFlagIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCheckPenaltyFlagIefSuppliedFlag() {
        return inCheckPenaltyFlagIefSuppliedFlag;
    }

    /**
     * Sets the value of the inCheckPenaltyFlagIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCheckPenaltyFlagIefSuppliedFlag(String value) {
        this.inCheckPenaltyFlagIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inForecastLoanAccountWorkForecastFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInForecastLoanAccountWorkForecastFlg() {
        return inForecastLoanAccountWorkForecastFlg;
    }

    /**
     * Sets the value of the inForecastLoanAccountWorkForecastFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInForecastLoanAccountWorkForecastFlg(String value) {
        this.inForecastLoanAccountWorkForecastFlg = value;
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
     * Gets the value of the inLoanAccountProfitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccountProfitsAccountNumber() {
        return inLoanAccountProfitsAccountNumber;
    }

    /**
     * Sets the value of the inLoanAccountProfitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccountProfitsAccountNumber(String value) {
        this.inLoanAccountProfitsAccountNumber = value;
    }

    /**
     * Gets the value of the inLoanAccountProfitsAccountCd property.
     * 
     */
    public short getInLoanAccountProfitsAccountCd() {
        return inLoanAccountProfitsAccountCd;
    }

    /**
     * Sets the value of the inLoanAccountProfitsAccountCd property.
     * 
     */
    public void setInLoanAccountProfitsAccountCd(short value) {
        this.inLoanAccountProfitsAccountCd = value;
    }

    /**
     * Gets the value of the inLoanRequestRequestLoanSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanRequestRequestLoanSts() {
        return inLoanRequestRequestLoanSts;
    }

    /**
     * Sets the value of the inLoanRequestRequestLoanSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanRequestRequestLoanSts(String value) {
        this.inLoanRequestRequestLoanSts = value;
    }

    /**
     * Gets the value of the inLoanRequestRequestSn property.
     * 
     */
    public short getInLoanRequestRequestSn() {
        return inLoanRequestRequestSn;
    }

    /**
     * Sets the value of the inLoanRequestRequestSn property.
     * 
     */
    public void setInLoanRequestRequestSn(short value) {
        this.inLoanRequestRequestSn = value;
    }

    /**
     * Gets the value of the inLoanRequestRequestSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanRequestRequestSts() {
        return inLoanRequestRequestSts;
    }

    /**
     * Sets the value of the inLoanRequestRequestSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanRequestRequestSts(String value) {
        this.inLoanRequestRequestSts = value;
    }

    /**
     * Gets the value of the inLoanRequestRequestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanRequestRequestType() {
        return inLoanRequestRequestType;
    }

    /**
     * Sets the value of the inLoanRequestRequestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanRequestRequestType(String value) {
        this.inLoanRequestRequestType = value;
    }

    /**
     * Gets the value of the inLoanRequestRqExpireDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanRequestRqExpireDt() {
        return inLoanRequestRqExpireDt;
    }

    /**
     * Sets the value of the inLoanRequestRqExpireDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanRequestRqExpireDt(XMLGregorianCalendar value) {
        this.inLoanRequestRqExpireDt = value;
    }

    /**
     * Gets the value of the inMntMntRecordingAuthorizer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMntMntRecordingAuthorizer1() {
        return inMntMntRecordingAuthorizer1;
    }

    /**
     * Sets the value of the inMntMntRecordingAuthorizer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMntMntRecordingAuthorizer1(String value) {
        this.inMntMntRecordingAuthorizer1 = value;
    }

    /**
     * Gets the value of the inMntMntRecordingAuthorizer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMntMntRecordingAuthorizer2() {
        return inMntMntRecordingAuthorizer2;
    }

    /**
     * Sets the value of the inMntMntRecordingAuthorizer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMntMntRecordingAuthorizer2(String value) {
        this.inMntMntRecordingAuthorizer2 = value;
    }

    /**
     * Gets the value of the inMntMntRecordingPrftSystem property.
     * 
     */
    public short getInMntMntRecordingPrftSystem() {
        return inMntMntRecordingPrftSystem;
    }

    /**
     * Sets the value of the inMntMntRecordingPrftSystem property.
     * 
     */
    public void setInMntMntRecordingPrftSystem(short value) {
        this.inMntMntRecordingPrftSystem = value;
    }

    /**
     * Gets the value of the inMntMntRecordingReversalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMntMntRecordingReversalFlag() {
        return inMntMntRecordingReversalFlag;
    }

    /**
     * Sets the value of the inMntMntRecordingReversalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMntMntRecordingReversalFlag(String value) {
        this.inMntMntRecordingReversalFlag = value;
    }

    /**
     * Gets the value of the inMntMntRecordingTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMntMntRecordingTerminalNumber() {
        return inMntMntRecordingTerminalNumber;
    }

    /**
     * Sets the value of the inMntMntRecordingTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMntMntRecordingTerminalNumber(String value) {
        this.inMntMntRecordingTerminalNumber = value;
    }

    /**
     * Gets the value of the inMntMntRecordingTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInMntMntRecordingTmstamp() {
        return inMntMntRecordingTmstamp;
    }

    /**
     * Sets the value of the inMntMntRecordingTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInMntMntRecordingTmstamp(XMLGregorianCalendar value) {
        this.inMntMntRecordingTmstamp = value;
    }

    /**
     * Gets the value of the inMntMntRecordingTrxCode property.
     * 
     */
    public int getInMntMntRecordingTrxCode() {
        return inMntMntRecordingTrxCode;
    }

    /**
     * Sets the value of the inMntMntRecordingTrxCode property.
     * 
     */
    public void setInMntMntRecordingTrxCode(int value) {
        this.inMntMntRecordingTrxCode = value;
    }

    /**
     * Gets the value of the inMntMntRecordingTrxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMntMntRecordingTrxDetails() {
        return inMntMntRecordingTrxDetails;
    }

    /**
     * Sets the value of the inMntMntRecordingTrxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMntMntRecordingTrxDetails(String value) {
        this.inMntMntRecordingTrxDetails = value;
    }

    /**
     * Gets the value of the inMntMntRecordingTrxUsrSn property.
     * 
     */
    public int getInMntMntRecordingTrxUsrSn() {
        return inMntMntRecordingTrxUsrSn;
    }

    /**
     * Sets the value of the inMntMntRecordingTrxUsrSn property.
     * 
     */
    public void setInMntMntRecordingTrxUsrSn(int value) {
        this.inMntMntRecordingTrxUsrSn = value;
    }

    /**
     * Gets the value of the inProcessCollectRedemptionAccountCd property.
     * 
     */
    public short getInProcessCollectRedemptionAccountCd() {
        return inProcessCollectRedemptionAccountCd;
    }

    /**
     * Sets the value of the inProcessCollectRedemptionAccountCd property.
     * 
     */
    public void setInProcessCollectRedemptionAccountCd(short value) {
        this.inProcessCollectRedemptionAccountCd = value;
    }

    /**
     * Gets the value of the inProcessCollectRedemptionAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessCollectRedemptionAccountNumber() {
        return inProcessCollectRedemptionAccountNumber;
    }

    /**
     * Sets the value of the inProcessCollectRedemptionAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessCollectRedemptionAccountNumber(String value) {
        this.inProcessCollectRedemptionAccountNumber = value;
    }

    /**
     * Gets the value of the inProcessCollectRedemptionCustomerId property.
     * 
     */
    public int getInProcessCollectRedemptionCustomerId() {
        return inProcessCollectRedemptionCustomerId;
    }

    /**
     * Sets the value of the inProcessCollectRedemptionCustomerId property.
     * 
     */
    public void setInProcessCollectRedemptionCustomerId(int value) {
        this.inProcessCollectRedemptionCustomerId = value;
    }

    /**
     * Gets the value of the inProcessCollectRedemptionForecastAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInProcessCollectRedemptionForecastAmn() {
        return inProcessCollectRedemptionForecastAmn;
    }

    /**
     * Sets the value of the inProcessCollectRedemptionForecastAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInProcessCollectRedemptionForecastAmn(BigDecimal value) {
        this.inProcessCollectRedemptionForecastAmn = value;
    }

    /**
     * Gets the value of the inProcessCollectRedemptionForecastDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInProcessCollectRedemptionForecastDt() {
        return inProcessCollectRedemptionForecastDt;
    }

    /**
     * Sets the value of the inProcessCollectRedemptionForecastDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInProcessCollectRedemptionForecastDt(XMLGregorianCalendar value) {
        this.inProcessCollectRedemptionForecastDt = value;
    }

    /**
     * Gets the value of the inProcessCollectRedemptionPrftSystem property.
     * 
     */
    public short getInProcessCollectRedemptionPrftSystem() {
        return inProcessCollectRedemptionPrftSystem;
    }

    /**
     * Sets the value of the inProcessCollectRedemptionPrftSystem property.
     * 
     */
    public void setInProcessCollectRedemptionPrftSystem(short value) {
        this.inProcessCollectRedemptionPrftSystem = value;
    }

    /**
     * Gets the value of the inProcessCollectRedemptionRedemptionAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInProcessCollectRedemptionRedemptionAmn() {
        return inProcessCollectRedemptionRedemptionAmn;
    }

    /**
     * Sets the value of the inProcessCollectRedemptionRedemptionAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInProcessCollectRedemptionRedemptionAmn(BigDecimal value) {
        this.inProcessCollectRedemptionRedemptionAmn = value;
    }

    /**
     * Gets the value of the inProcessCollectRedemptionRedemptionCmnts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessCollectRedemptionRedemptionCmnts() {
        return inProcessCollectRedemptionRedemptionCmnts;
    }

    /**
     * Sets the value of the inProcessCollectRedemptionRedemptionCmnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessCollectRedemptionRedemptionCmnts(String value) {
        this.inProcessCollectRedemptionRedemptionCmnts = value;
    }

    /**
     * Gets the value of the inProcessCollectRedemptionRedemptionDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInProcessCollectRedemptionRedemptionDt() {
        return inProcessCollectRedemptionRedemptionDt;
    }

    /**
     * Sets the value of the inProcessCollectRedemptionRedemptionDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInProcessCollectRedemptionRedemptionDt(XMLGregorianCalendar value) {
        this.inProcessCollectRedemptionRedemptionDt = value;
    }

    /**
     * Gets the value of the inRepresentativeCustCardInfoCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRepresentativeCustCardInfoCardNo() {
        return inRepresentativeCustCardInfoCardNo;
    }

    /**
     * Sets the value of the inRepresentativeCustCardInfoCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRepresentativeCustCardInfoCardNo(String value) {
        this.inRepresentativeCustCardInfoCardNo = value;
    }

    /**
     * Gets the value of the inRepresentativeCustomerCustId property.
     * 
     */
    public int getInRepresentativeCustomerCustId() {
        return inRepresentativeCustomerCustId;
    }

    /**
     * Sets the value of the inRepresentativeCustomerCustId property.
     * 
     */
    public void setInRepresentativeCustomerCustId(int value) {
        this.inRepresentativeCustomerCustId = value;
    }

    /**
     * Gets the value of the inRepresentativeCustomerShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRepresentativeCustomerShortName() {
        return inRepresentativeCustomerShortName;
    }

    /**
     * Sets the value of the inRepresentativeCustomerShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRepresentativeCustomerShortName(String value) {
        this.inRepresentativeCustomerShortName = value;
    }

    /**
     * Gets the value of the inTrxAmountIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTrxAmountIefSuppliedAmount() {
        return inTrxAmountIefSuppliedAmount;
    }

    /**
     * Sets the value of the inTrxAmountIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTrxAmountIefSuppliedAmount(BigDecimal value) {
        this.inTrxAmountIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the inTrxBankParametersCurrTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTrxBankParametersCurrTrxDate() {
        return inTrxBankParametersCurrTrxDate;
    }

    /**
     * Sets the value of the inTrxBankParametersCurrTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTrxBankParametersCurrTrxDate(XMLGregorianCalendar value) {
        this.inTrxBankParametersCurrTrxDate = value;
    }

    /**
     * Gets the value of the inTrxCurrencyIdCurrency property.
     * 
     */
    public int getInTrxCurrencyIdCurrency() {
        return inTrxCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inTrxCurrencyIdCurrency property.
     * 
     */
    public void setInTrxCurrencyIdCurrency(int value) {
        this.inTrxCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inTrxCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxCurrencyShortDescr() {
        return inTrxCurrencyShortDescr;
    }

    /**
     * Sets the value of the inTrxCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxCurrencyShortDescr(String value) {
        this.inTrxCurrencyShortDescr = value;
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
     * Gets the value of the inTrxLoanTrxRecordingIOtherAfm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxLoanTrxRecordingIOtherAfm() {
        return inTrxLoanTrxRecordingIOtherAfm;
    }

    /**
     * Sets the value of the inTrxLoanTrxRecordingIOtherAfm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxLoanTrxRecordingIOtherAfm(String value) {
        this.inTrxLoanTrxRecordingIOtherAfm = value;
    }

    /**
     * Gets the value of the inTrxLoanTrxRecordingIOtherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxLoanTrxRecordingIOtherName() {
        return inTrxLoanTrxRecordingIOtherName;
    }

    /**
     * Sets the value of the inTrxLoanTrxRecordingIOtherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxLoanTrxRecordingIOtherName(String value) {
        this.inTrxLoanTrxRecordingIOtherName = value;
    }

    /**
     * Gets the value of the inTrxLoanTrxRecordingITrxComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxLoanTrxRecordingITrxComments() {
        return inTrxLoanTrxRecordingITrxComments;
    }

    /**
     * Sets the value of the inTrxLoanTrxRecordingITrxComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxLoanTrxRecordingITrxComments(String value) {
        this.inTrxLoanTrxRecordingITrxComments = value;
    }

    /**
     * Gets the value of the inTrxParametricRuleTrxImportsInTrxCapital property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTrxParametricRuleTrxImportsInTrxCapital() {
        return inTrxParametricRuleTrxImportsInTrxCapital;
    }

    /**
     * Sets the value of the inTrxParametricRuleTrxImportsInTrxCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTrxParametricRuleTrxImportsInTrxCapital(BigDecimal value) {
        this.inTrxParametricRuleTrxImportsInTrxCapital = value;
    }

    /**
     * Gets the value of the inTrxParametricRuleTrxImportsInTrxCom property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTrxParametricRuleTrxImportsInTrxCom() {
        return inTrxParametricRuleTrxImportsInTrxCom;
    }

    /**
     * Sets the value of the inTrxParametricRuleTrxImportsInTrxCom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTrxParametricRuleTrxImportsInTrxCom(BigDecimal value) {
        this.inTrxParametricRuleTrxImportsInTrxCom = value;
    }

    /**
     * Gets the value of the inTrxParametricRuleTrxImportsInTrxExp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTrxParametricRuleTrxImportsInTrxExp() {
        return inTrxParametricRuleTrxImportsInTrxExp;
    }

    /**
     * Sets the value of the inTrxParametricRuleTrxImportsInTrxExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTrxParametricRuleTrxImportsInTrxExp(BigDecimal value) {
        this.inTrxParametricRuleTrxImportsInTrxExp = value;
    }

    /**
     * Gets the value of the inTrxParametricRuleTrxImportsInTrxRlNrmInt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTrxParametricRuleTrxImportsInTrxRlNrmInt() {
        return inTrxParametricRuleTrxImportsInTrxRlNrmInt;
    }

    /**
     * Sets the value of the inTrxParametricRuleTrxImportsInTrxRlNrmInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTrxParametricRuleTrxImportsInTrxRlNrmInt(BigDecimal value) {
        this.inTrxParametricRuleTrxImportsInTrxRlNrmInt = value;
    }

    /**
     * Gets the value of the inTrxParametricRuleTrxImportsInTrxRlPnlInt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTrxParametricRuleTrxImportsInTrxRlPnlInt() {
        return inTrxParametricRuleTrxImportsInTrxRlPnlInt;
    }

    /**
     * Sets the value of the inTrxParametricRuleTrxImportsInTrxRlPnlInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTrxParametricRuleTrxImportsInTrxRlPnlInt(BigDecimal value) {
        this.inTrxParametricRuleTrxImportsInTrxRlPnlInt = value;
    }

    /**
     * Gets the value of the inTrxParametricRuleTrxImportsInTrxSubsidyInt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTrxParametricRuleTrxImportsInTrxSubsidyInt() {
        return inTrxParametricRuleTrxImportsInTrxSubsidyInt;
    }

    /**
     * Sets the value of the inTrxParametricRuleTrxImportsInTrxSubsidyInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTrxParametricRuleTrxImportsInTrxSubsidyInt(BigDecimal value) {
        this.inTrxParametricRuleTrxImportsInTrxSubsidyInt = value;
    }

    /**
     * Gets the value of the inTrxParametricRuleTrxImportsInTrxUrlNrmInt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTrxParametricRuleTrxImportsInTrxUrlNrmInt() {
        return inTrxParametricRuleTrxImportsInTrxUrlNrmInt;
    }

    /**
     * Sets the value of the inTrxParametricRuleTrxImportsInTrxUrlNrmInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTrxParametricRuleTrxImportsInTrxUrlNrmInt(BigDecimal value) {
        this.inTrxParametricRuleTrxImportsInTrxUrlNrmInt = value;
    }

    /**
     * Gets the value of the inTrxParametricRuleTrxImportsInTrxUrlPnlInt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTrxParametricRuleTrxImportsInTrxUrlPnlInt() {
        return inTrxParametricRuleTrxImportsInTrxUrlPnlInt;
    }

    /**
     * Sets the value of the inTrxParametricRuleTrxImportsInTrxUrlPnlInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTrxParametricRuleTrxImportsInTrxUrlPnlInt(BigDecimal value) {
        this.inTrxParametricRuleTrxImportsInTrxUrlPnlInt = value;
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
     * Gets the value of the inTrxRequestCreationDateLoanRequestRqCreationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTrxRequestCreationDateLoanRequestRqCreationDt() {
        return inTrxRequestCreationDateLoanRequestRqCreationDt;
    }

    /**
     * Sets the value of the inTrxRequestCreationDateLoanRequestRqCreationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTrxRequestCreationDateLoanRequestRqCreationDt(XMLGregorianCalendar value) {
        this.inTrxRequestCreationDateLoanRequestRqCreationDt = value;
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
     * Gets the value of the inValueLoanAccountWorkValeurDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInValueLoanAccountWorkValeurDt() {
        return inValueLoanAccountWorkValeurDt;
    }

    /**
     * Sets the value of the inValueLoanAccountWorkValeurDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInValueLoanAccountWorkValeurDt(XMLGregorianCalendar value) {
        this.inValueLoanAccountWorkValeurDt = value;
    }

}
