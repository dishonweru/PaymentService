
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AgreementGuarantorsExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgreementGuarantorsExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutEvalResultTeamInformationEvaluationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationAuthorizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementGuarantGuarantorStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementGuarantGuaranteeAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAgreementGuarantRemovalDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutAgreementGuarantTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLimitCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLimitCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLimitCurrencyNationalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLimitCurrencyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGuarantorListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutAgreementAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAgrStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementAccKind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutListGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutAgreementGuarantorListItem" minOccurs="0"/>
 *         &lt;element name="OutGrpLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutAgreementGuarantorLogItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreementGuarantorsExport", propOrder = {
    "outProductIdProduct",
    "outEvalResultTeamInformationEvaluationResult",
    "outEvalResultTeamInformationRequiredProfile1",
    "outEvalResultTeamInformationRequiredProfile2",
    "outEvalResultTeamInformationAuthorizationType",
    "outAgreementGuarantGuarantorStatus",
    "outAgreementGuarantGuaranteeAmount",
    "outAgreementGuarantRemovalDt",
    "outAgreementGuarantTmstamp",
    "outLimitCurrencyIdCurrency",
    "outLimitCurrencyShortDescr",
    "outLimitCurrencyNationalFlag",
    "outLimitCurrencyDescription",
    "outGuarantorListSetDescription",
    "outAgreementAgrYear",
    "outAgreementAgrSn",
    "outAgreementAgrMembershipSn",
    "outAgreementAgrStatus",
    "outAgreementAccKind",
    "outAgreementTmstamp",
    "outListGrp",
    "outGrpLog"
})
public class AgreementGuarantorsExport
    extends BaseExport
{

    @XmlElement(name = "OutProductIdProduct")
    protected int outProductIdProduct;
    @XmlElement(name = "OutEvalResultTeamInformationEvaluationResult")
    protected String outEvalResultTeamInformationEvaluationResult;
    @XmlElement(name = "OutEvalResultTeamInformationRequiredProfile1")
    protected String outEvalResultTeamInformationRequiredProfile1;
    @XmlElement(name = "OutEvalResultTeamInformationRequiredProfile2")
    protected String outEvalResultTeamInformationRequiredProfile2;
    @XmlElement(name = "OutEvalResultTeamInformationAuthorizationType")
    protected String outEvalResultTeamInformationAuthorizationType;
    @XmlElement(name = "OutAgreementGuarantGuarantorStatus")
    protected String outAgreementGuarantGuarantorStatus;
    @XmlElement(name = "OutAgreementGuarantGuaranteeAmount", required = true)
    protected BigDecimal outAgreementGuarantGuaranteeAmount;
    @XmlElement(name = "OutAgreementGuarantRemovalDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outAgreementGuarantRemovalDt;
    @XmlElement(name = "OutAgreementGuarantTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outAgreementGuarantTmstamp;
    @XmlElement(name = "OutLimitCurrencyIdCurrency")
    protected int outLimitCurrencyIdCurrency;
    @XmlElement(name = "OutLimitCurrencyShortDescr")
    protected String outLimitCurrencyShortDescr;
    @XmlElement(name = "OutLimitCurrencyNationalFlag")
    protected String outLimitCurrencyNationalFlag;
    @XmlElement(name = "OutLimitCurrencyDescription")
    protected String outLimitCurrencyDescription;
    @XmlElement(name = "OutGuarantorListSetDescription")
    protected String outGuarantorListSetDescription;
    @XmlElement(name = "OutAgreementAgrYear")
    protected short outAgreementAgrYear;
    @XmlElement(name = "OutAgreementAgrSn")
    protected int outAgreementAgrSn;
    @XmlElement(name = "OutAgreementAgrMembershipSn")
    protected int outAgreementAgrMembershipSn;
    @XmlElement(name = "OutAgreementAgrStatus")
    protected String outAgreementAgrStatus;
    @XmlElement(name = "OutAgreementAccKind")
    protected String outAgreementAccKind;
    @XmlElement(name = "OutAgreementTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outAgreementTmstamp;
    @XmlElement(name = "OutListGrp")
    protected ArrayOfOutAgreementGuarantorListItem outListGrp;
    @XmlElement(name = "OutGrpLog")
    protected ArrayOfOutAgreementGuarantorLogItem outGrpLog;

    /**
     * Gets the value of the outProductIdProduct property.
     * 
     */
    public int getOutProductIdProduct() {
        return outProductIdProduct;
    }

    /**
     * Sets the value of the outProductIdProduct property.
     * 
     */
    public void setOutProductIdProduct(int value) {
        this.outProductIdProduct = value;
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
     * Gets the value of the outAgreementGuarantGuarantorStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgreementGuarantGuarantorStatus() {
        return outAgreementGuarantGuarantorStatus;
    }

    /**
     * Sets the value of the outAgreementGuarantGuarantorStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgreementGuarantGuarantorStatus(String value) {
        this.outAgreementGuarantGuarantorStatus = value;
    }

    /**
     * Gets the value of the outAgreementGuarantGuaranteeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAgreementGuarantGuaranteeAmount() {
        return outAgreementGuarantGuaranteeAmount;
    }

    /**
     * Sets the value of the outAgreementGuarantGuaranteeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAgreementGuarantGuaranteeAmount(BigDecimal value) {
        this.outAgreementGuarantGuaranteeAmount = value;
    }

    /**
     * Gets the value of the outAgreementGuarantRemovalDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutAgreementGuarantRemovalDt() {
        return outAgreementGuarantRemovalDt;
    }

    /**
     * Sets the value of the outAgreementGuarantRemovalDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutAgreementGuarantRemovalDt(XMLGregorianCalendar value) {
        this.outAgreementGuarantRemovalDt = value;
    }

    /**
     * Gets the value of the outAgreementGuarantTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutAgreementGuarantTmstamp() {
        return outAgreementGuarantTmstamp;
    }

    /**
     * Sets the value of the outAgreementGuarantTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutAgreementGuarantTmstamp(XMLGregorianCalendar value) {
        this.outAgreementGuarantTmstamp = value;
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
     * Gets the value of the outLimitCurrencyNationalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLimitCurrencyNationalFlag() {
        return outLimitCurrencyNationalFlag;
    }

    /**
     * Sets the value of the outLimitCurrencyNationalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLimitCurrencyNationalFlag(String value) {
        this.outLimitCurrencyNationalFlag = value;
    }

    /**
     * Gets the value of the outLimitCurrencyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLimitCurrencyDescription() {
        return outLimitCurrencyDescription;
    }

    /**
     * Sets the value of the outLimitCurrencyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLimitCurrencyDescription(String value) {
        this.outLimitCurrencyDescription = value;
    }

    /**
     * Gets the value of the outGuarantorListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGuarantorListSetDescription() {
        return outGuarantorListSetDescription;
    }

    /**
     * Sets the value of the outGuarantorListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGuarantorListSetDescription(String value) {
        this.outGuarantorListSetDescription = value;
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
     * Gets the value of the outListGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutAgreementGuarantorListItem }
     *     
     */
    public ArrayOfOutAgreementGuarantorListItem getOutListGrp() {
        return outListGrp;
    }

    /**
     * Sets the value of the outListGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutAgreementGuarantorListItem }
     *     
     */
    public void setOutListGrp(ArrayOfOutAgreementGuarantorListItem value) {
        this.outListGrp = value;
    }

    /**
     * Gets the value of the outGrpLog property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutAgreementGuarantorLogItem }
     *     
     */
    public ArrayOfOutAgreementGuarantorLogItem getOutGrpLog() {
        return outGrpLog;
    }

    /**
     * Sets the value of the outGrpLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutAgreementGuarantorLogItem }
     *     
     */
    public void setOutGrpLog(ArrayOfOutAgreementGuarantorLogItem value) {
        this.outGrpLog = value;
    }

}
