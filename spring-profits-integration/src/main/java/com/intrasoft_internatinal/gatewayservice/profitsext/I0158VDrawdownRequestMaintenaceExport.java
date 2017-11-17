
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for I0158VDrawdownRequestMaintenaceExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="I0158VDrawdownRequestMaintenaceExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutResultTeamInformationEvaluationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultTeamInformationAuthorizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutChangedCustomerApplicationCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutChangedCustomerApplicationUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutChangedCustomerApplicationApplicationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutChangedCustomerApplicationInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutChangedCustomerApplicationAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutChangedCustomerApplicationAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutChangedCustomerApplicationApplicationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutChangedCustomerApplicationApplicationSts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutChangedCustomerApplicationRequestAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutChangedCustomerApplicationRequestDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutChangedCustomerApplicationRequestForecast" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutChangedCustomerApplicationInsertUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutChangedCustomerApplicationInsertCmnts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutChangedCustomerApplicationConfirmUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutChangedCustomerApplicationConfirmDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutChangedCustomerApplicationConfirmCmnts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutChangedCustomerApplicationDrawdownDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutChangedCustomerApplicationDrawdownAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutChangedCustomerApplicationTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutContinueCustomerApplicationInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpApplication" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpApplicationI0158VListItem" minOccurs="0"/>
 *         &lt;element name="OutGrpLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOuyGrpLogI0158VListItem" minOccurs="0"/>
 *         &lt;element name="OutGrpApplicDetails" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpApplicDetailsListItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "I0158VDrawdownRequestMaintenaceExport", propOrder = {
    "outResultTeamInformationEvaluationResult",
    "outResultTeamInformationRequiredProfile1",
    "outResultTeamInformationRequiredProfile2",
    "outResultTeamInformationAuthorizationType",
    "outChangedCustomerApplicationCustId",
    "outChangedCustomerApplicationUnitCode",
    "outChangedCustomerApplicationApplicationId",
    "outChangedCustomerApplicationInternalSn",
    "outChangedCustomerApplicationAccountNumber",
    "outChangedCustomerApplicationAccountCd",
    "outChangedCustomerApplicationApplicationType",
    "outChangedCustomerApplicationApplicationSts",
    "outChangedCustomerApplicationRequestAmn",
    "outChangedCustomerApplicationRequestDt",
    "outChangedCustomerApplicationRequestForecast",
    "outChangedCustomerApplicationInsertUsr",
    "outChangedCustomerApplicationInsertCmnts",
    "outChangedCustomerApplicationConfirmUsr",
    "outChangedCustomerApplicationConfirmDt",
    "outChangedCustomerApplicationConfirmCmnts",
    "outChangedCustomerApplicationDrawdownDt",
    "outChangedCustomerApplicationDrawdownAmn",
    "outChangedCustomerApplicationTmstamp",
    "outContinueCustomerApplicationInternalSn",
    "outGrpApplication",
    "outGrpLog",
    "outGrpApplicDetails"
})
public class I0158VDrawdownRequestMaintenaceExport
    extends BaseExport
{

    @XmlElement(name = "OutResultTeamInformationEvaluationResult")
    protected String outResultTeamInformationEvaluationResult;
    @XmlElement(name = "OutResultTeamInformationRequiredProfile1")
    protected String outResultTeamInformationRequiredProfile1;
    @XmlElement(name = "OutResultTeamInformationRequiredProfile2")
    protected String outResultTeamInformationRequiredProfile2;
    @XmlElement(name = "OutResultTeamInformationAuthorizationType")
    protected String outResultTeamInformationAuthorizationType;
    @XmlElement(name = "OutChangedCustomerApplicationCustId")
    protected int outChangedCustomerApplicationCustId;
    @XmlElement(name = "OutChangedCustomerApplicationUnitCode")
    protected int outChangedCustomerApplicationUnitCode;
    @XmlElement(name = "OutChangedCustomerApplicationApplicationId")
    protected String outChangedCustomerApplicationApplicationId;
    @XmlElement(name = "OutChangedCustomerApplicationInternalSn")
    protected double outChangedCustomerApplicationInternalSn;
    @XmlElement(name = "OutChangedCustomerApplicationAccountNumber")
    protected String outChangedCustomerApplicationAccountNumber;
    @XmlElement(name = "OutChangedCustomerApplicationAccountCd")
    protected short outChangedCustomerApplicationAccountCd;
    @XmlElement(name = "OutChangedCustomerApplicationApplicationType")
    protected int outChangedCustomerApplicationApplicationType;
    @XmlElement(name = "OutChangedCustomerApplicationApplicationSts")
    protected String outChangedCustomerApplicationApplicationSts;
    @XmlElement(name = "OutChangedCustomerApplicationRequestAmn", required = true)
    protected BigDecimal outChangedCustomerApplicationRequestAmn;
    @XmlElement(name = "OutChangedCustomerApplicationRequestDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outChangedCustomerApplicationRequestDt;
    @XmlElement(name = "OutChangedCustomerApplicationRequestForecast")
    protected String outChangedCustomerApplicationRequestForecast;
    @XmlElement(name = "OutChangedCustomerApplicationInsertUsr")
    protected String outChangedCustomerApplicationInsertUsr;
    @XmlElement(name = "OutChangedCustomerApplicationInsertCmnts")
    protected String outChangedCustomerApplicationInsertCmnts;
    @XmlElement(name = "OutChangedCustomerApplicationConfirmUsr")
    protected String outChangedCustomerApplicationConfirmUsr;
    @XmlElement(name = "OutChangedCustomerApplicationConfirmDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outChangedCustomerApplicationConfirmDt;
    @XmlElement(name = "OutChangedCustomerApplicationConfirmCmnts")
    protected String outChangedCustomerApplicationConfirmCmnts;
    @XmlElement(name = "OutChangedCustomerApplicationDrawdownDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outChangedCustomerApplicationDrawdownDt;
    @XmlElement(name = "OutChangedCustomerApplicationDrawdownAmn", required = true)
    protected BigDecimal outChangedCustomerApplicationDrawdownAmn;
    @XmlElement(name = "OutChangedCustomerApplicationTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outChangedCustomerApplicationTmstamp;
    @XmlElement(name = "OutContinueCustomerApplicationInternalSn")
    protected double outContinueCustomerApplicationInternalSn;
    @XmlElement(name = "OutGrpApplication")
    protected ArrayOfOutGrpApplicationI0158VListItem outGrpApplication;
    @XmlElement(name = "OutGrpLog")
    protected ArrayOfOuyGrpLogI0158VListItem outGrpLog;
    @XmlElement(name = "OutGrpApplicDetails")
    protected ArrayOfOutGrpApplicDetailsListItem outGrpApplicDetails;

    /**
     * Gets the value of the outResultTeamInformationEvaluationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultTeamInformationEvaluationResult() {
        return outResultTeamInformationEvaluationResult;
    }

    /**
     * Sets the value of the outResultTeamInformationEvaluationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultTeamInformationEvaluationResult(String value) {
        this.outResultTeamInformationEvaluationResult = value;
    }

    /**
     * Gets the value of the outResultTeamInformationRequiredProfile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultTeamInformationRequiredProfile1() {
        return outResultTeamInformationRequiredProfile1;
    }

    /**
     * Sets the value of the outResultTeamInformationRequiredProfile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultTeamInformationRequiredProfile1(String value) {
        this.outResultTeamInformationRequiredProfile1 = value;
    }

    /**
     * Gets the value of the outResultTeamInformationRequiredProfile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultTeamInformationRequiredProfile2() {
        return outResultTeamInformationRequiredProfile2;
    }

    /**
     * Sets the value of the outResultTeamInformationRequiredProfile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultTeamInformationRequiredProfile2(String value) {
        this.outResultTeamInformationRequiredProfile2 = value;
    }

    /**
     * Gets the value of the outResultTeamInformationAuthorizationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultTeamInformationAuthorizationType() {
        return outResultTeamInformationAuthorizationType;
    }

    /**
     * Sets the value of the outResultTeamInformationAuthorizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultTeamInformationAuthorizationType(String value) {
        this.outResultTeamInformationAuthorizationType = value;
    }

    /**
     * Gets the value of the outChangedCustomerApplicationCustId property.
     * 
     */
    public int getOutChangedCustomerApplicationCustId() {
        return outChangedCustomerApplicationCustId;
    }

    /**
     * Sets the value of the outChangedCustomerApplicationCustId property.
     * 
     */
    public void setOutChangedCustomerApplicationCustId(int value) {
        this.outChangedCustomerApplicationCustId = value;
    }

    /**
     * Gets the value of the outChangedCustomerApplicationUnitCode property.
     * 
     */
    public int getOutChangedCustomerApplicationUnitCode() {
        return outChangedCustomerApplicationUnitCode;
    }

    /**
     * Sets the value of the outChangedCustomerApplicationUnitCode property.
     * 
     */
    public void setOutChangedCustomerApplicationUnitCode(int value) {
        this.outChangedCustomerApplicationUnitCode = value;
    }

    /**
     * Gets the value of the outChangedCustomerApplicationApplicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutChangedCustomerApplicationApplicationId() {
        return outChangedCustomerApplicationApplicationId;
    }

    /**
     * Sets the value of the outChangedCustomerApplicationApplicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutChangedCustomerApplicationApplicationId(String value) {
        this.outChangedCustomerApplicationApplicationId = value;
    }

    /**
     * Gets the value of the outChangedCustomerApplicationInternalSn property.
     * 
     */
    public double getOutChangedCustomerApplicationInternalSn() {
        return outChangedCustomerApplicationInternalSn;
    }

    /**
     * Sets the value of the outChangedCustomerApplicationInternalSn property.
     * 
     */
    public void setOutChangedCustomerApplicationInternalSn(double value) {
        this.outChangedCustomerApplicationInternalSn = value;
    }

    /**
     * Gets the value of the outChangedCustomerApplicationAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutChangedCustomerApplicationAccountNumber() {
        return outChangedCustomerApplicationAccountNumber;
    }

    /**
     * Sets the value of the outChangedCustomerApplicationAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutChangedCustomerApplicationAccountNumber(String value) {
        this.outChangedCustomerApplicationAccountNumber = value;
    }

    /**
     * Gets the value of the outChangedCustomerApplicationAccountCd property.
     * 
     */
    public short getOutChangedCustomerApplicationAccountCd() {
        return outChangedCustomerApplicationAccountCd;
    }

    /**
     * Sets the value of the outChangedCustomerApplicationAccountCd property.
     * 
     */
    public void setOutChangedCustomerApplicationAccountCd(short value) {
        this.outChangedCustomerApplicationAccountCd = value;
    }

    /**
     * Gets the value of the outChangedCustomerApplicationApplicationType property.
     * 
     */
    public int getOutChangedCustomerApplicationApplicationType() {
        return outChangedCustomerApplicationApplicationType;
    }

    /**
     * Sets the value of the outChangedCustomerApplicationApplicationType property.
     * 
     */
    public void setOutChangedCustomerApplicationApplicationType(int value) {
        this.outChangedCustomerApplicationApplicationType = value;
    }

    /**
     * Gets the value of the outChangedCustomerApplicationApplicationSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutChangedCustomerApplicationApplicationSts() {
        return outChangedCustomerApplicationApplicationSts;
    }

    /**
     * Sets the value of the outChangedCustomerApplicationApplicationSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutChangedCustomerApplicationApplicationSts(String value) {
        this.outChangedCustomerApplicationApplicationSts = value;
    }

    /**
     * Gets the value of the outChangedCustomerApplicationRequestAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutChangedCustomerApplicationRequestAmn() {
        return outChangedCustomerApplicationRequestAmn;
    }

    /**
     * Sets the value of the outChangedCustomerApplicationRequestAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutChangedCustomerApplicationRequestAmn(BigDecimal value) {
        this.outChangedCustomerApplicationRequestAmn = value;
    }

    /**
     * Gets the value of the outChangedCustomerApplicationRequestDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutChangedCustomerApplicationRequestDt() {
        return outChangedCustomerApplicationRequestDt;
    }

    /**
     * Sets the value of the outChangedCustomerApplicationRequestDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutChangedCustomerApplicationRequestDt(XMLGregorianCalendar value) {
        this.outChangedCustomerApplicationRequestDt = value;
    }

    /**
     * Gets the value of the outChangedCustomerApplicationRequestForecast property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutChangedCustomerApplicationRequestForecast() {
        return outChangedCustomerApplicationRequestForecast;
    }

    /**
     * Sets the value of the outChangedCustomerApplicationRequestForecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutChangedCustomerApplicationRequestForecast(String value) {
        this.outChangedCustomerApplicationRequestForecast = value;
    }

    /**
     * Gets the value of the outChangedCustomerApplicationInsertUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutChangedCustomerApplicationInsertUsr() {
        return outChangedCustomerApplicationInsertUsr;
    }

    /**
     * Sets the value of the outChangedCustomerApplicationInsertUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutChangedCustomerApplicationInsertUsr(String value) {
        this.outChangedCustomerApplicationInsertUsr = value;
    }

    /**
     * Gets the value of the outChangedCustomerApplicationInsertCmnts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutChangedCustomerApplicationInsertCmnts() {
        return outChangedCustomerApplicationInsertCmnts;
    }

    /**
     * Sets the value of the outChangedCustomerApplicationInsertCmnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutChangedCustomerApplicationInsertCmnts(String value) {
        this.outChangedCustomerApplicationInsertCmnts = value;
    }

    /**
     * Gets the value of the outChangedCustomerApplicationConfirmUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutChangedCustomerApplicationConfirmUsr() {
        return outChangedCustomerApplicationConfirmUsr;
    }

    /**
     * Sets the value of the outChangedCustomerApplicationConfirmUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutChangedCustomerApplicationConfirmUsr(String value) {
        this.outChangedCustomerApplicationConfirmUsr = value;
    }

    /**
     * Gets the value of the outChangedCustomerApplicationConfirmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutChangedCustomerApplicationConfirmDt() {
        return outChangedCustomerApplicationConfirmDt;
    }

    /**
     * Sets the value of the outChangedCustomerApplicationConfirmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutChangedCustomerApplicationConfirmDt(XMLGregorianCalendar value) {
        this.outChangedCustomerApplicationConfirmDt = value;
    }

    /**
     * Gets the value of the outChangedCustomerApplicationConfirmCmnts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutChangedCustomerApplicationConfirmCmnts() {
        return outChangedCustomerApplicationConfirmCmnts;
    }

    /**
     * Sets the value of the outChangedCustomerApplicationConfirmCmnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutChangedCustomerApplicationConfirmCmnts(String value) {
        this.outChangedCustomerApplicationConfirmCmnts = value;
    }

    /**
     * Gets the value of the outChangedCustomerApplicationDrawdownDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutChangedCustomerApplicationDrawdownDt() {
        return outChangedCustomerApplicationDrawdownDt;
    }

    /**
     * Sets the value of the outChangedCustomerApplicationDrawdownDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutChangedCustomerApplicationDrawdownDt(XMLGregorianCalendar value) {
        this.outChangedCustomerApplicationDrawdownDt = value;
    }

    /**
     * Gets the value of the outChangedCustomerApplicationDrawdownAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutChangedCustomerApplicationDrawdownAmn() {
        return outChangedCustomerApplicationDrawdownAmn;
    }

    /**
     * Sets the value of the outChangedCustomerApplicationDrawdownAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutChangedCustomerApplicationDrawdownAmn(BigDecimal value) {
        this.outChangedCustomerApplicationDrawdownAmn = value;
    }

    /**
     * Gets the value of the outChangedCustomerApplicationTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutChangedCustomerApplicationTmstamp() {
        return outChangedCustomerApplicationTmstamp;
    }

    /**
     * Sets the value of the outChangedCustomerApplicationTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutChangedCustomerApplicationTmstamp(XMLGregorianCalendar value) {
        this.outChangedCustomerApplicationTmstamp = value;
    }

    /**
     * Gets the value of the outContinueCustomerApplicationInternalSn property.
     * 
     */
    public double getOutContinueCustomerApplicationInternalSn() {
        return outContinueCustomerApplicationInternalSn;
    }

    /**
     * Sets the value of the outContinueCustomerApplicationInternalSn property.
     * 
     */
    public void setOutContinueCustomerApplicationInternalSn(double value) {
        this.outContinueCustomerApplicationInternalSn = value;
    }

    /**
     * Gets the value of the outGrpApplication property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpApplicationI0158VListItem }
     *     
     */
    public ArrayOfOutGrpApplicationI0158VListItem getOutGrpApplication() {
        return outGrpApplication;
    }

    /**
     * Sets the value of the outGrpApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpApplicationI0158VListItem }
     *     
     */
    public void setOutGrpApplication(ArrayOfOutGrpApplicationI0158VListItem value) {
        this.outGrpApplication = value;
    }

    /**
     * Gets the value of the outGrpLog property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOuyGrpLogI0158VListItem }
     *     
     */
    public ArrayOfOuyGrpLogI0158VListItem getOutGrpLog() {
        return outGrpLog;
    }

    /**
     * Sets the value of the outGrpLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOuyGrpLogI0158VListItem }
     *     
     */
    public void setOutGrpLog(ArrayOfOuyGrpLogI0158VListItem value) {
        this.outGrpLog = value;
    }

    /**
     * Gets the value of the outGrpApplicDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpApplicDetailsListItem }
     *     
     */
    public ArrayOfOutGrpApplicDetailsListItem getOutGrpApplicDetails() {
        return outGrpApplicDetails;
    }

    /**
     * Sets the value of the outGrpApplicDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpApplicDetailsListItem }
     *     
     */
    public void setOutGrpApplicDetails(ArrayOfOutGrpApplicDetailsListItem value) {
        this.outGrpApplicDetails = value;
    }

}
