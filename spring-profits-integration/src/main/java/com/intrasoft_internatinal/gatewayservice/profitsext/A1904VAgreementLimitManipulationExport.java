
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for A1904VAgreementLimitManipulationExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="A1904VAgreementLimitManipulationExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutAgrTypeProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgrTypeProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAccKind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementAgrAmnPending" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAgreementAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAgrStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutAgreementAmnPendSts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementPendFinalDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutAgreementTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutAgreementLmtHistAmountInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementLmtHistHistoryAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAgreementLmtHistHistoryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementLmtHistHistorySn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementLmtHistHistoryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementLmtHistTransactionCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustMainBenListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationAuthorizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationEvaluationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAdviceDetail" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfA1904VOutGrpAdviceDetailItem" minOccurs="0"/>
 *         &lt;element name="OutGrpAdviceTotal" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfA1904VOutGrpAdviceTotalItem" minOccurs="0"/>
 *         &lt;element name="OutGrpLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfA1904VOutGrpLogItem" minOccurs="0"/>
 *         &lt;element name="OutGrpUserTotal" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfA1904VOutGrpUserTotalItem" minOccurs="0"/>
 *         &lt;element name="OutLimitCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLimitCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMainBenCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMainBenCustomerCustStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMainBenCustomerCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMainBenCustomerShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrxCountAdvCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutVoucherLineParVoucherRunVoucherLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "A1904VAgreementLimitManipulationExport", propOrder = {
    "outAgrTypeProductDescription",
    "outAgrTypeProductIdProduct",
    "outAgreementAccKind",
    "outAgreementAgrAmnPending",
    "outAgreementAgrMembershipSn",
    "outAgreementAgrSn",
    "outAgreementAgrStatus",
    "outAgreementAgrYear",
    "outAgreementAmnPendSts",
    "outAgreementPendFinalDt",
    "outAgreementTmstamp",
    "outAgreementLmtHistAmountInd",
    "outAgreementLmtHistHistoryAmount",
    "outAgreementLmtHistHistoryComments",
    "outAgreementLmtHistHistorySn",
    "outAgreementLmtHistHistoryStatus",
    "outAgreementLmtHistTransactionCode",
    "outCustMainBenListSetDescription",
    "outEvalResultTeamInformationAuthorizationType",
    "outEvalResultTeamInformationEvaluationResult",
    "outEvalResultTeamInformationRequiredProfile1",
    "outEvalResultTeamInformationRequiredProfile2",
    "outGrpAdviceDetail",
    "outGrpAdviceTotal",
    "outGrpLog",
    "outGrpUserTotal",
    "outLimitCurrencyIdCurrency",
    "outLimitCurrencyShortDescr",
    "outMainBenCustomerCustId",
    "outMainBenCustomerCustStatus",
    "outMainBenCustomerCustType",
    "outMainBenCustomerShortName",
    "outTrxCountAdvCounter",
    "outTrxCountTrxCounter",
    "outVoucherLineParVoucherRunVoucherLine"
})
public class A1904VAgreementLimitManipulationExport
    extends BaseExport
{

    @XmlElement(name = "OutAgrTypeProductDescription")
    protected String outAgrTypeProductDescription;
    @XmlElement(name = "OutAgrTypeProductIdProduct")
    protected int outAgrTypeProductIdProduct;
    @XmlElement(name = "OutAgreementAccKind")
    protected String outAgreementAccKind;
    @XmlElement(name = "OutAgreementAgrAmnPending", required = true)
    protected BigDecimal outAgreementAgrAmnPending;
    @XmlElement(name = "OutAgreementAgrMembershipSn")
    protected int outAgreementAgrMembershipSn;
    @XmlElement(name = "OutAgreementAgrSn")
    protected int outAgreementAgrSn;
    @XmlElement(name = "OutAgreementAgrStatus")
    protected String outAgreementAgrStatus;
    @XmlElement(name = "OutAgreementAgrYear")
    protected short outAgreementAgrYear;
    @XmlElement(name = "OutAgreementAmnPendSts")
    protected String outAgreementAmnPendSts;
    @XmlElement(name = "OutAgreementPendFinalDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outAgreementPendFinalDt;
    @XmlElement(name = "OutAgreementTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outAgreementTmstamp;
    @XmlElement(name = "OutAgreementLmtHistAmountInd")
    protected String outAgreementLmtHistAmountInd;
    @XmlElement(name = "OutAgreementLmtHistHistoryAmount", required = true)
    protected BigDecimal outAgreementLmtHistHistoryAmount;
    @XmlElement(name = "OutAgreementLmtHistHistoryComments")
    protected String outAgreementLmtHistHistoryComments;
    @XmlElement(name = "OutAgreementLmtHistHistorySn")
    protected int outAgreementLmtHistHistorySn;
    @XmlElement(name = "OutAgreementLmtHistHistoryStatus")
    protected String outAgreementLmtHistHistoryStatus;
    @XmlElement(name = "OutAgreementLmtHistTransactionCode")
    protected int outAgreementLmtHistTransactionCode;
    @XmlElement(name = "OutCustMainBenListSetDescription")
    protected String outCustMainBenListSetDescription;
    @XmlElement(name = "OutEvalResultTeamInformationAuthorizationType")
    protected String outEvalResultTeamInformationAuthorizationType;
    @XmlElement(name = "OutEvalResultTeamInformationEvaluationResult")
    protected String outEvalResultTeamInformationEvaluationResult;
    @XmlElement(name = "OutEvalResultTeamInformationRequiredProfile1")
    protected String outEvalResultTeamInformationRequiredProfile1;
    @XmlElement(name = "OutEvalResultTeamInformationRequiredProfile2")
    protected String outEvalResultTeamInformationRequiredProfile2;
    @XmlElement(name = "OutGrpAdviceDetail")
    protected ArrayOfA1904VOutGrpAdviceDetailItem outGrpAdviceDetail;
    @XmlElement(name = "OutGrpAdviceTotal")
    protected ArrayOfA1904VOutGrpAdviceTotalItem outGrpAdviceTotal;
    @XmlElement(name = "OutGrpLog")
    protected ArrayOfA1904VOutGrpLogItem outGrpLog;
    @XmlElement(name = "OutGrpUserTotal")
    protected ArrayOfA1904VOutGrpUserTotalItem outGrpUserTotal;
    @XmlElement(name = "OutLimitCurrencyIdCurrency")
    protected int outLimitCurrencyIdCurrency;
    @XmlElement(name = "OutLimitCurrencyShortDescr")
    protected String outLimitCurrencyShortDescr;
    @XmlElement(name = "OutMainBenCustomerCustId")
    protected int outMainBenCustomerCustId;
    @XmlElement(name = "OutMainBenCustomerCustStatus")
    protected String outMainBenCustomerCustStatus;
    @XmlElement(name = "OutMainBenCustomerCustType")
    protected String outMainBenCustomerCustType;
    @XmlElement(name = "OutMainBenCustomerShortName")
    protected String outMainBenCustomerShortName;
    @XmlElement(name = "OutTrxCountAdvCounter")
    protected int outTrxCountAdvCounter;
    @XmlElement(name = "OutTrxCountTrxCounter")
    protected int outTrxCountTrxCounter;
    @XmlElement(name = "OutVoucherLineParVoucherRunVoucherLine")
    protected String outVoucherLineParVoucherRunVoucherLine;

    /**
     * Gets the value of the outAgrTypeProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgrTypeProductDescription() {
        return outAgrTypeProductDescription;
    }

    /**
     * Sets the value of the outAgrTypeProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgrTypeProductDescription(String value) {
        this.outAgrTypeProductDescription = value;
    }

    /**
     * Gets the value of the outAgrTypeProductIdProduct property.
     * 
     */
    public int getOutAgrTypeProductIdProduct() {
        return outAgrTypeProductIdProduct;
    }

    /**
     * Sets the value of the outAgrTypeProductIdProduct property.
     * 
     */
    public void setOutAgrTypeProductIdProduct(int value) {
        this.outAgrTypeProductIdProduct = value;
    }

    /**
     * Gets the value of the outAgreementAccKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgreementAccKind() {
        return outAgreementAccKind;
    }

    /**
     * Sets the value of the outAgreementAccKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgreementAccKind(String value) {
        this.outAgreementAccKind = value;
    }

    /**
     * Gets the value of the outAgreementAgrAmnPending property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAgreementAgrAmnPending() {
        return outAgreementAgrAmnPending;
    }

    /**
     * Sets the value of the outAgreementAgrAmnPending property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAgreementAgrAmnPending(BigDecimal value) {
        this.outAgreementAgrAmnPending = value;
    }

    /**
     * Gets the value of the outAgreementAgrMembershipSn property.
     * 
     */
    public int getOutAgreementAgrMembershipSn() {
        return outAgreementAgrMembershipSn;
    }

    /**
     * Sets the value of the outAgreementAgrMembershipSn property.
     * 
     */
    public void setOutAgreementAgrMembershipSn(int value) {
        this.outAgreementAgrMembershipSn = value;
    }

    /**
     * Gets the value of the outAgreementAgrSn property.
     * 
     */
    public int getOutAgreementAgrSn() {
        return outAgreementAgrSn;
    }

    /**
     * Sets the value of the outAgreementAgrSn property.
     * 
     */
    public void setOutAgreementAgrSn(int value) {
        this.outAgreementAgrSn = value;
    }

    /**
     * Gets the value of the outAgreementAgrStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgreementAgrStatus() {
        return outAgreementAgrStatus;
    }

    /**
     * Sets the value of the outAgreementAgrStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgreementAgrStatus(String value) {
        this.outAgreementAgrStatus = value;
    }

    /**
     * Gets the value of the outAgreementAgrYear property.
     * 
     */
    public short getOutAgreementAgrYear() {
        return outAgreementAgrYear;
    }

    /**
     * Sets the value of the outAgreementAgrYear property.
     * 
     */
    public void setOutAgreementAgrYear(short value) {
        this.outAgreementAgrYear = value;
    }

    /**
     * Gets the value of the outAgreementAmnPendSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgreementAmnPendSts() {
        return outAgreementAmnPendSts;
    }

    /**
     * Sets the value of the outAgreementAmnPendSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgreementAmnPendSts(String value) {
        this.outAgreementAmnPendSts = value;
    }

    /**
     * Gets the value of the outAgreementPendFinalDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutAgreementPendFinalDt() {
        return outAgreementPendFinalDt;
    }

    /**
     * Sets the value of the outAgreementPendFinalDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutAgreementPendFinalDt(XMLGregorianCalendar value) {
        this.outAgreementPendFinalDt = value;
    }

    /**
     * Gets the value of the outAgreementTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutAgreementTmstamp() {
        return outAgreementTmstamp;
    }

    /**
     * Sets the value of the outAgreementTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutAgreementTmstamp(XMLGregorianCalendar value) {
        this.outAgreementTmstamp = value;
    }

    /**
     * Gets the value of the outAgreementLmtHistAmountInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgreementLmtHistAmountInd() {
        return outAgreementLmtHistAmountInd;
    }

    /**
     * Sets the value of the outAgreementLmtHistAmountInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgreementLmtHistAmountInd(String value) {
        this.outAgreementLmtHistAmountInd = value;
    }

    /**
     * Gets the value of the outAgreementLmtHistHistoryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAgreementLmtHistHistoryAmount() {
        return outAgreementLmtHistHistoryAmount;
    }

    /**
     * Sets the value of the outAgreementLmtHistHistoryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAgreementLmtHistHistoryAmount(BigDecimal value) {
        this.outAgreementLmtHistHistoryAmount = value;
    }

    /**
     * Gets the value of the outAgreementLmtHistHistoryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgreementLmtHistHistoryComments() {
        return outAgreementLmtHistHistoryComments;
    }

    /**
     * Sets the value of the outAgreementLmtHistHistoryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgreementLmtHistHistoryComments(String value) {
        this.outAgreementLmtHistHistoryComments = value;
    }

    /**
     * Gets the value of the outAgreementLmtHistHistorySn property.
     * 
     */
    public int getOutAgreementLmtHistHistorySn() {
        return outAgreementLmtHistHistorySn;
    }

    /**
     * Sets the value of the outAgreementLmtHistHistorySn property.
     * 
     */
    public void setOutAgreementLmtHistHistorySn(int value) {
        this.outAgreementLmtHistHistorySn = value;
    }

    /**
     * Gets the value of the outAgreementLmtHistHistoryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgreementLmtHistHistoryStatus() {
        return outAgreementLmtHistHistoryStatus;
    }

    /**
     * Sets the value of the outAgreementLmtHistHistoryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgreementLmtHistHistoryStatus(String value) {
        this.outAgreementLmtHistHistoryStatus = value;
    }

    /**
     * Gets the value of the outAgreementLmtHistTransactionCode property.
     * 
     */
    public int getOutAgreementLmtHistTransactionCode() {
        return outAgreementLmtHistTransactionCode;
    }

    /**
     * Sets the value of the outAgreementLmtHistTransactionCode property.
     * 
     */
    public void setOutAgreementLmtHistTransactionCode(int value) {
        this.outAgreementLmtHistTransactionCode = value;
    }

    /**
     * Gets the value of the outCustMainBenListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustMainBenListSetDescription() {
        return outCustMainBenListSetDescription;
    }

    /**
     * Sets the value of the outCustMainBenListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustMainBenListSetDescription(String value) {
        this.outCustMainBenListSetDescription = value;
    }

    /**
     * Gets the value of the outEvalResultTeamInformationAuthorizationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvalResultTeamInformationAuthorizationType() {
        return outEvalResultTeamInformationAuthorizationType;
    }

    /**
     * Sets the value of the outEvalResultTeamInformationAuthorizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvalResultTeamInformationAuthorizationType(String value) {
        this.outEvalResultTeamInformationAuthorizationType = value;
    }

    /**
     * Gets the value of the outEvalResultTeamInformationEvaluationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvalResultTeamInformationEvaluationResult() {
        return outEvalResultTeamInformationEvaluationResult;
    }

    /**
     * Sets the value of the outEvalResultTeamInformationEvaluationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvalResultTeamInformationEvaluationResult(String value) {
        this.outEvalResultTeamInformationEvaluationResult = value;
    }

    /**
     * Gets the value of the outEvalResultTeamInformationRequiredProfile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvalResultTeamInformationRequiredProfile1() {
        return outEvalResultTeamInformationRequiredProfile1;
    }

    /**
     * Sets the value of the outEvalResultTeamInformationRequiredProfile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvalResultTeamInformationRequiredProfile1(String value) {
        this.outEvalResultTeamInformationRequiredProfile1 = value;
    }

    /**
     * Gets the value of the outEvalResultTeamInformationRequiredProfile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvalResultTeamInformationRequiredProfile2() {
        return outEvalResultTeamInformationRequiredProfile2;
    }

    /**
     * Sets the value of the outEvalResultTeamInformationRequiredProfile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvalResultTeamInformationRequiredProfile2(String value) {
        this.outEvalResultTeamInformationRequiredProfile2 = value;
    }

    /**
     * Gets the value of the outGrpAdviceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfA1904VOutGrpAdviceDetailItem }
     *     
     */
    public ArrayOfA1904VOutGrpAdviceDetailItem getOutGrpAdviceDetail() {
        return outGrpAdviceDetail;
    }

    /**
     * Sets the value of the outGrpAdviceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfA1904VOutGrpAdviceDetailItem }
     *     
     */
    public void setOutGrpAdviceDetail(ArrayOfA1904VOutGrpAdviceDetailItem value) {
        this.outGrpAdviceDetail = value;
    }

    /**
     * Gets the value of the outGrpAdviceTotal property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfA1904VOutGrpAdviceTotalItem }
     *     
     */
    public ArrayOfA1904VOutGrpAdviceTotalItem getOutGrpAdviceTotal() {
        return outGrpAdviceTotal;
    }

    /**
     * Sets the value of the outGrpAdviceTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfA1904VOutGrpAdviceTotalItem }
     *     
     */
    public void setOutGrpAdviceTotal(ArrayOfA1904VOutGrpAdviceTotalItem value) {
        this.outGrpAdviceTotal = value;
    }

    /**
     * Gets the value of the outGrpLog property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfA1904VOutGrpLogItem }
     *     
     */
    public ArrayOfA1904VOutGrpLogItem getOutGrpLog() {
        return outGrpLog;
    }

    /**
     * Sets the value of the outGrpLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfA1904VOutGrpLogItem }
     *     
     */
    public void setOutGrpLog(ArrayOfA1904VOutGrpLogItem value) {
        this.outGrpLog = value;
    }

    /**
     * Gets the value of the outGrpUserTotal property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfA1904VOutGrpUserTotalItem }
     *     
     */
    public ArrayOfA1904VOutGrpUserTotalItem getOutGrpUserTotal() {
        return outGrpUserTotal;
    }

    /**
     * Sets the value of the outGrpUserTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfA1904VOutGrpUserTotalItem }
     *     
     */
    public void setOutGrpUserTotal(ArrayOfA1904VOutGrpUserTotalItem value) {
        this.outGrpUserTotal = value;
    }

    /**
     * Gets the value of the outLimitCurrencyIdCurrency property.
     * 
     */
    public int getOutLimitCurrencyIdCurrency() {
        return outLimitCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outLimitCurrencyIdCurrency property.
     * 
     */
    public void setOutLimitCurrencyIdCurrency(int value) {
        this.outLimitCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outLimitCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLimitCurrencyShortDescr() {
        return outLimitCurrencyShortDescr;
    }

    /**
     * Sets the value of the outLimitCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLimitCurrencyShortDescr(String value) {
        this.outLimitCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outMainBenCustomerCustId property.
     * 
     */
    public int getOutMainBenCustomerCustId() {
        return outMainBenCustomerCustId;
    }

    /**
     * Sets the value of the outMainBenCustomerCustId property.
     * 
     */
    public void setOutMainBenCustomerCustId(int value) {
        this.outMainBenCustomerCustId = value;
    }

    /**
     * Gets the value of the outMainBenCustomerCustStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMainBenCustomerCustStatus() {
        return outMainBenCustomerCustStatus;
    }

    /**
     * Sets the value of the outMainBenCustomerCustStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMainBenCustomerCustStatus(String value) {
        this.outMainBenCustomerCustStatus = value;
    }

    /**
     * Gets the value of the outMainBenCustomerCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMainBenCustomerCustType() {
        return outMainBenCustomerCustType;
    }

    /**
     * Sets the value of the outMainBenCustomerCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMainBenCustomerCustType(String value) {
        this.outMainBenCustomerCustType = value;
    }

    /**
     * Gets the value of the outMainBenCustomerShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMainBenCustomerShortName() {
        return outMainBenCustomerShortName;
    }

    /**
     * Sets the value of the outMainBenCustomerShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMainBenCustomerShortName(String value) {
        this.outMainBenCustomerShortName = value;
    }

    /**
     * Gets the value of the outTrxCountAdvCounter property.
     * 
     */
    public int getOutTrxCountAdvCounter() {
        return outTrxCountAdvCounter;
    }

    /**
     * Sets the value of the outTrxCountAdvCounter property.
     * 
     */
    public void setOutTrxCountAdvCounter(int value) {
        this.outTrxCountAdvCounter = value;
    }

    /**
     * Gets the value of the outTrxCountTrxCounter property.
     * 
     */
    public int getOutTrxCountTrxCounter() {
        return outTrxCountTrxCounter;
    }

    /**
     * Sets the value of the outTrxCountTrxCounter property.
     * 
     */
    public void setOutTrxCountTrxCounter(int value) {
        this.outTrxCountTrxCounter = value;
    }

    /**
     * Gets the value of the outVoucherLineParVoucherRunVoucherLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutVoucherLineParVoucherRunVoucherLine() {
        return outVoucherLineParVoucherRunVoucherLine;
    }

    /**
     * Sets the value of the outVoucherLineParVoucherRunVoucherLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutVoucherLineParVoucherRunVoucherLine(String value) {
        this.outVoucherLineParVoucherRunVoucherLine = value;
    }

}
