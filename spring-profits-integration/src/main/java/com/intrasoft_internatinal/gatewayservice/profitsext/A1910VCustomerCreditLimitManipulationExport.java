
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for A1910VCustomerCreditLimitManipulationExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="A1910VCustomerCreditLimitManipulationExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutCustListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustomerEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustomerCreditLineCrlineAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCustomerCreditLineEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerCreditLineEvaluationDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustomerCreditLineExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustomerCreditLineReevaluationDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustomerCreditLineTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustomerCreditLineUtilisedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutEvalResultTeamInformationAuthorizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationEvaluationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustCrLine" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfA1910VOutGrpCustCrLineItem" minOccurs="0"/>
 *         &lt;element name="OutGrpLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfA1910VOutGrpLogItem" minOccurs="0"/>
 *         &lt;element name="OutMonitoringUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOldGrpCustCrLine" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfA1910VOutOldGrpCustCrLineItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "A1910VCustomerCreditLimitManipulationExport", propOrder = {
    "outCustListSetDescription",
    "outCustomerCustId",
    "outCustomerEntryStatus",
    "outCustomerShortName",
    "outCustomerSurname",
    "outCustomerTmstamp",
    "outCustomerCreditLineCrlineAmount",
    "outCustomerCreditLineEntryStatus",
    "outCustomerCreditLineEvaluationDt",
    "outCustomerCreditLineExpiryDate",
    "outCustomerCreditLineReevaluationDt",
    "outCustomerCreditLineTmstamp",
    "outCustomerCreditLineUtilisedAmount",
    "outEvalResultTeamInformationAuthorizationType",
    "outEvalResultTeamInformationEvaluationResult",
    "outEvalResultTeamInformationRequiredProfile1",
    "outEvalResultTeamInformationRequiredProfile2",
    "outGrpCustCrLine",
    "outGrpLog",
    "outMonitoringUnitCode",
    "outOldGrpCustCrLine"
})
public class A1910VCustomerCreditLimitManipulationExport
    extends BaseExport
{

    @XmlElement(name = "OutCustListSetDescription")
    protected String outCustListSetDescription;
    @XmlElement(name = "OutCustomerCustId")
    protected int outCustomerCustId;
    @XmlElement(name = "OutCustomerEntryStatus")
    protected String outCustomerEntryStatus;
    @XmlElement(name = "OutCustomerShortName")
    protected String outCustomerShortName;
    @XmlElement(name = "OutCustomerSurname")
    protected String outCustomerSurname;
    @XmlElement(name = "OutCustomerTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustomerTmstamp;
    @XmlElement(name = "OutCustomerCreditLineCrlineAmount", required = true)
    protected BigDecimal outCustomerCreditLineCrlineAmount;
    @XmlElement(name = "OutCustomerCreditLineEntryStatus")
    protected String outCustomerCreditLineEntryStatus;
    @XmlElement(name = "OutCustomerCreditLineEvaluationDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustomerCreditLineEvaluationDt;
    @XmlElement(name = "OutCustomerCreditLineExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustomerCreditLineExpiryDate;
    @XmlElement(name = "OutCustomerCreditLineReevaluationDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustomerCreditLineReevaluationDt;
    @XmlElement(name = "OutCustomerCreditLineTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustomerCreditLineTmstamp;
    @XmlElement(name = "OutCustomerCreditLineUtilisedAmount", required = true)
    protected BigDecimal outCustomerCreditLineUtilisedAmount;
    @XmlElement(name = "OutEvalResultTeamInformationAuthorizationType")
    protected String outEvalResultTeamInformationAuthorizationType;
    @XmlElement(name = "OutEvalResultTeamInformationEvaluationResult")
    protected String outEvalResultTeamInformationEvaluationResult;
    @XmlElement(name = "OutEvalResultTeamInformationRequiredProfile1")
    protected String outEvalResultTeamInformationRequiredProfile1;
    @XmlElement(name = "OutEvalResultTeamInformationRequiredProfile2")
    protected String outEvalResultTeamInformationRequiredProfile2;
    @XmlElement(name = "OutGrpCustCrLine")
    protected ArrayOfA1910VOutGrpCustCrLineItem outGrpCustCrLine;
    @XmlElement(name = "OutGrpLog")
    protected ArrayOfA1910VOutGrpLogItem outGrpLog;
    @XmlElement(name = "OutMonitoringUnitCode")
    protected int outMonitoringUnitCode;
    @XmlElement(name = "OutOldGrpCustCrLine")
    protected ArrayOfA1910VOutOldGrpCustCrLineItem outOldGrpCustCrLine;

    /**
     * Gets the value of the outCustListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustListSetDescription() {
        return outCustListSetDescription;
    }

    /**
     * Sets the value of the outCustListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustListSetDescription(String value) {
        this.outCustListSetDescription = value;
    }

    /**
     * Gets the value of the outCustomerCustId property.
     * 
     */
    public int getOutCustomerCustId() {
        return outCustomerCustId;
    }

    /**
     * Sets the value of the outCustomerCustId property.
     * 
     */
    public void setOutCustomerCustId(int value) {
        this.outCustomerCustId = value;
    }

    /**
     * Gets the value of the outCustomerEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerEntryStatus() {
        return outCustomerEntryStatus;
    }

    /**
     * Sets the value of the outCustomerEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerEntryStatus(String value) {
        this.outCustomerEntryStatus = value;
    }

    /**
     * Gets the value of the outCustomerShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerShortName() {
        return outCustomerShortName;
    }

    /**
     * Sets the value of the outCustomerShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerShortName(String value) {
        this.outCustomerShortName = value;
    }

    /**
     * Gets the value of the outCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerSurname() {
        return outCustomerSurname;
    }

    /**
     * Sets the value of the outCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerSurname(String value) {
        this.outCustomerSurname = value;
    }

    /**
     * Gets the value of the outCustomerTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustomerTmstamp() {
        return outCustomerTmstamp;
    }

    /**
     * Sets the value of the outCustomerTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustomerTmstamp(XMLGregorianCalendar value) {
        this.outCustomerTmstamp = value;
    }

    /**
     * Gets the value of the outCustomerCreditLineCrlineAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCustomerCreditLineCrlineAmount() {
        return outCustomerCreditLineCrlineAmount;
    }

    /**
     * Sets the value of the outCustomerCreditLineCrlineAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCustomerCreditLineCrlineAmount(BigDecimal value) {
        this.outCustomerCreditLineCrlineAmount = value;
    }

    /**
     * Gets the value of the outCustomerCreditLineEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerCreditLineEntryStatus() {
        return outCustomerCreditLineEntryStatus;
    }

    /**
     * Sets the value of the outCustomerCreditLineEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerCreditLineEntryStatus(String value) {
        this.outCustomerCreditLineEntryStatus = value;
    }

    /**
     * Gets the value of the outCustomerCreditLineEvaluationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustomerCreditLineEvaluationDt() {
        return outCustomerCreditLineEvaluationDt;
    }

    /**
     * Sets the value of the outCustomerCreditLineEvaluationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustomerCreditLineEvaluationDt(XMLGregorianCalendar value) {
        this.outCustomerCreditLineEvaluationDt = value;
    }

    /**
     * Gets the value of the outCustomerCreditLineExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustomerCreditLineExpiryDate() {
        return outCustomerCreditLineExpiryDate;
    }

    /**
     * Sets the value of the outCustomerCreditLineExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustomerCreditLineExpiryDate(XMLGregorianCalendar value) {
        this.outCustomerCreditLineExpiryDate = value;
    }

    /**
     * Gets the value of the outCustomerCreditLineReevaluationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustomerCreditLineReevaluationDt() {
        return outCustomerCreditLineReevaluationDt;
    }

    /**
     * Sets the value of the outCustomerCreditLineReevaluationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustomerCreditLineReevaluationDt(XMLGregorianCalendar value) {
        this.outCustomerCreditLineReevaluationDt = value;
    }

    /**
     * Gets the value of the outCustomerCreditLineTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustomerCreditLineTmstamp() {
        return outCustomerCreditLineTmstamp;
    }

    /**
     * Sets the value of the outCustomerCreditLineTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustomerCreditLineTmstamp(XMLGregorianCalendar value) {
        this.outCustomerCreditLineTmstamp = value;
    }

    /**
     * Gets the value of the outCustomerCreditLineUtilisedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCustomerCreditLineUtilisedAmount() {
        return outCustomerCreditLineUtilisedAmount;
    }

    /**
     * Sets the value of the outCustomerCreditLineUtilisedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCustomerCreditLineUtilisedAmount(BigDecimal value) {
        this.outCustomerCreditLineUtilisedAmount = value;
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
     * Gets the value of the outGrpCustCrLine property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfA1910VOutGrpCustCrLineItem }
     *     
     */
    public ArrayOfA1910VOutGrpCustCrLineItem getOutGrpCustCrLine() {
        return outGrpCustCrLine;
    }

    /**
     * Sets the value of the outGrpCustCrLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfA1910VOutGrpCustCrLineItem }
     *     
     */
    public void setOutGrpCustCrLine(ArrayOfA1910VOutGrpCustCrLineItem value) {
        this.outGrpCustCrLine = value;
    }

    /**
     * Gets the value of the outGrpLog property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfA1910VOutGrpLogItem }
     *     
     */
    public ArrayOfA1910VOutGrpLogItem getOutGrpLog() {
        return outGrpLog;
    }

    /**
     * Sets the value of the outGrpLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfA1910VOutGrpLogItem }
     *     
     */
    public void setOutGrpLog(ArrayOfA1910VOutGrpLogItem value) {
        this.outGrpLog = value;
    }

    /**
     * Gets the value of the outMonitoringUnitCode property.
     * 
     */
    public int getOutMonitoringUnitCode() {
        return outMonitoringUnitCode;
    }

    /**
     * Sets the value of the outMonitoringUnitCode property.
     * 
     */
    public void setOutMonitoringUnitCode(int value) {
        this.outMonitoringUnitCode = value;
    }

    /**
     * Gets the value of the outOldGrpCustCrLine property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfA1910VOutOldGrpCustCrLineItem }
     *     
     */
    public ArrayOfA1910VOutOldGrpCustCrLineItem getOutOldGrpCustCrLine() {
        return outOldGrpCustCrLine;
    }

    /**
     * Sets the value of the outOldGrpCustCrLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfA1910VOutOldGrpCustCrLineItem }
     *     
     */
    public void setOutOldGrpCustCrLine(ArrayOfA1910VOutOldGrpCustCrLineItem value) {
        this.outOldGrpCustCrLine = value;
    }

}
