
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Mc2032VPropertyValuerManagementExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mc2032VPropertyValuerManagementExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutGrpSrvLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfMc2032VOutGrpSrvLogitem" minOccurs="0"/>
 *         &lt;element name="OutGrpValuers" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfMc2032VOutGrpValuersItem" minOccurs="0"/>
 *         &lt;element name="OutLoopFlagIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutValcnGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutValcnGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutValcnGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutValuerEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutValuerInternalFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutValuerValuerAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutValuerValuerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutValuerValuerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutValuerValuerMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutValuerValuerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutValuerValuerPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutValuerValuerTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutValuerAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutValuerContactPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutValUnderwriterGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutValUnderwriterGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutValUnderwriterGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutValamnCurrCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutValamnCurrCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAccountOfBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAccountOfBankemployeeCardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAccountOfBankemployeeFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAccountOfBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mc2032VPropertyValuerManagementExport", propOrder = {
    "outGrpSrvLog",
    "outGrpValuers",
    "outLoopFlagIefSuppliedFlag",
    "outValcnGenericDetailDescription",
    "outValcnGenericDetailParameterType",
    "outValcnGenericDetailSerialNum",
    "outValuerEntryStatus",
    "outValuerInternalFlg",
    "outValuerValuerAddress",
    "outValuerValuerEmail",
    "outValuerValuerId",
    "outValuerValuerMobile",
    "outValuerValuerName",
    "outValuerValuerPhone",
    "outValuerValuerTmstamp",
    "outValuerAmount",
    "outValuerContactPerson",
    "outValUnderwriterGenericDetailSerialNum",
    "outValUnderwriterGenericDetailParameterType",
    "outValUnderwriterGenericDetailDescription",
    "outValamnCurrCurrencyIdCurrency",
    "outValamnCurrCurrencyShortDescr",
    "outAccountOfBankemployeeId",
    "outAccountOfBankemployeeCardId",
    "outAccountOfBankemployeeFirstName",
    "outAccountOfBankemployeeLastName"
})
public class Mc2032VPropertyValuerManagementExport
    extends BaseExport
{

    @XmlElement(name = "OutGrpSrvLog")
    protected ArrayOfMc2032VOutGrpSrvLogitem outGrpSrvLog;
    @XmlElement(name = "OutGrpValuers")
    protected ArrayOfMc2032VOutGrpValuersItem outGrpValuers;
    @XmlElement(name = "OutLoopFlagIefSuppliedFlag")
    protected String outLoopFlagIefSuppliedFlag;
    @XmlElement(name = "OutValcnGenericDetailDescription")
    protected String outValcnGenericDetailDescription;
    @XmlElement(name = "OutValcnGenericDetailParameterType")
    protected String outValcnGenericDetailParameterType;
    @XmlElement(name = "OutValcnGenericDetailSerialNum")
    protected int outValcnGenericDetailSerialNum;
    @XmlElement(name = "OutValuerEntryStatus")
    protected String outValuerEntryStatus;
    @XmlElement(name = "OutValuerInternalFlg")
    protected String outValuerInternalFlg;
    @XmlElement(name = "OutValuerValuerAddress")
    protected String outValuerValuerAddress;
    @XmlElement(name = "OutValuerValuerEmail")
    protected String outValuerValuerEmail;
    @XmlElement(name = "OutValuerValuerId")
    protected int outValuerValuerId;
    @XmlElement(name = "OutValuerValuerMobile")
    protected String outValuerValuerMobile;
    @XmlElement(name = "OutValuerValuerName")
    protected String outValuerValuerName;
    @XmlElement(name = "OutValuerValuerPhone")
    protected String outValuerValuerPhone;
    @XmlElement(name = "OutValuerValuerTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outValuerValuerTmstamp;
    @XmlElement(name = "OutValuerAmount", required = true)
    protected BigDecimal outValuerAmount;
    @XmlElement(name = "OutValuerContactPerson")
    protected String outValuerContactPerson;
    @XmlElement(name = "OutValUnderwriterGenericDetailSerialNum")
    protected int outValUnderwriterGenericDetailSerialNum;
    @XmlElement(name = "OutValUnderwriterGenericDetailParameterType")
    protected String outValUnderwriterGenericDetailParameterType;
    @XmlElement(name = "OutValUnderwriterGenericDetailDescription")
    protected String outValUnderwriterGenericDetailDescription;
    @XmlElement(name = "OutValamnCurrCurrencyIdCurrency")
    protected int outValamnCurrCurrencyIdCurrency;
    @XmlElement(name = "OutValamnCurrCurrencyShortDescr")
    protected String outValamnCurrCurrencyShortDescr;
    @XmlElement(name = "OutAccountOfBankemployeeId")
    protected String outAccountOfBankemployeeId;
    @XmlElement(name = "OutAccountOfBankemployeeCardId")
    protected String outAccountOfBankemployeeCardId;
    @XmlElement(name = "OutAccountOfBankemployeeFirstName")
    protected String outAccountOfBankemployeeFirstName;
    @XmlElement(name = "OutAccountOfBankemployeeLastName")
    protected String outAccountOfBankemployeeLastName;

    /**
     * Gets the value of the outGrpSrvLog property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMc2032VOutGrpSrvLogitem }
     *     
     */
    public ArrayOfMc2032VOutGrpSrvLogitem getOutGrpSrvLog() {
        return outGrpSrvLog;
    }

    /**
     * Sets the value of the outGrpSrvLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMc2032VOutGrpSrvLogitem }
     *     
     */
    public void setOutGrpSrvLog(ArrayOfMc2032VOutGrpSrvLogitem value) {
        this.outGrpSrvLog = value;
    }

    /**
     * Gets the value of the outGrpValuers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMc2032VOutGrpValuersItem }
     *     
     */
    public ArrayOfMc2032VOutGrpValuersItem getOutGrpValuers() {
        return outGrpValuers;
    }

    /**
     * Sets the value of the outGrpValuers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMc2032VOutGrpValuersItem }
     *     
     */
    public void setOutGrpValuers(ArrayOfMc2032VOutGrpValuersItem value) {
        this.outGrpValuers = value;
    }

    /**
     * Gets the value of the outLoopFlagIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoopFlagIefSuppliedFlag() {
        return outLoopFlagIefSuppliedFlag;
    }

    /**
     * Sets the value of the outLoopFlagIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoopFlagIefSuppliedFlag(String value) {
        this.outLoopFlagIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outValcnGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutValcnGenericDetailDescription() {
        return outValcnGenericDetailDescription;
    }

    /**
     * Sets the value of the outValcnGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutValcnGenericDetailDescription(String value) {
        this.outValcnGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outValcnGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutValcnGenericDetailParameterType() {
        return outValcnGenericDetailParameterType;
    }

    /**
     * Sets the value of the outValcnGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutValcnGenericDetailParameterType(String value) {
        this.outValcnGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outValcnGenericDetailSerialNum property.
     * 
     */
    public int getOutValcnGenericDetailSerialNum() {
        return outValcnGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outValcnGenericDetailSerialNum property.
     * 
     */
    public void setOutValcnGenericDetailSerialNum(int value) {
        this.outValcnGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outValuerEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutValuerEntryStatus() {
        return outValuerEntryStatus;
    }

    /**
     * Sets the value of the outValuerEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutValuerEntryStatus(String value) {
        this.outValuerEntryStatus = value;
    }

    /**
     * Gets the value of the outValuerInternalFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutValuerInternalFlg() {
        return outValuerInternalFlg;
    }

    /**
     * Sets the value of the outValuerInternalFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutValuerInternalFlg(String value) {
        this.outValuerInternalFlg = value;
    }

    /**
     * Gets the value of the outValuerValuerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutValuerValuerAddress() {
        return outValuerValuerAddress;
    }

    /**
     * Sets the value of the outValuerValuerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutValuerValuerAddress(String value) {
        this.outValuerValuerAddress = value;
    }

    /**
     * Gets the value of the outValuerValuerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutValuerValuerEmail() {
        return outValuerValuerEmail;
    }

    /**
     * Sets the value of the outValuerValuerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutValuerValuerEmail(String value) {
        this.outValuerValuerEmail = value;
    }

    /**
     * Gets the value of the outValuerValuerId property.
     * 
     */
    public int getOutValuerValuerId() {
        return outValuerValuerId;
    }

    /**
     * Sets the value of the outValuerValuerId property.
     * 
     */
    public void setOutValuerValuerId(int value) {
        this.outValuerValuerId = value;
    }

    /**
     * Gets the value of the outValuerValuerMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutValuerValuerMobile() {
        return outValuerValuerMobile;
    }

    /**
     * Sets the value of the outValuerValuerMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutValuerValuerMobile(String value) {
        this.outValuerValuerMobile = value;
    }

    /**
     * Gets the value of the outValuerValuerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutValuerValuerName() {
        return outValuerValuerName;
    }

    /**
     * Sets the value of the outValuerValuerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutValuerValuerName(String value) {
        this.outValuerValuerName = value;
    }

    /**
     * Gets the value of the outValuerValuerPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutValuerValuerPhone() {
        return outValuerValuerPhone;
    }

    /**
     * Sets the value of the outValuerValuerPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutValuerValuerPhone(String value) {
        this.outValuerValuerPhone = value;
    }

    /**
     * Gets the value of the outValuerValuerTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutValuerValuerTmstamp() {
        return outValuerValuerTmstamp;
    }

    /**
     * Sets the value of the outValuerValuerTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutValuerValuerTmstamp(XMLGregorianCalendar value) {
        this.outValuerValuerTmstamp = value;
    }

    /**
     * Gets the value of the outValuerAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutValuerAmount() {
        return outValuerAmount;
    }

    /**
     * Sets the value of the outValuerAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutValuerAmount(BigDecimal value) {
        this.outValuerAmount = value;
    }

    /**
     * Gets the value of the outValuerContactPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutValuerContactPerson() {
        return outValuerContactPerson;
    }

    /**
     * Sets the value of the outValuerContactPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutValuerContactPerson(String value) {
        this.outValuerContactPerson = value;
    }

    /**
     * Gets the value of the outValUnderwriterGenericDetailSerialNum property.
     * 
     */
    public int getOutValUnderwriterGenericDetailSerialNum() {
        return outValUnderwriterGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outValUnderwriterGenericDetailSerialNum property.
     * 
     */
    public void setOutValUnderwriterGenericDetailSerialNum(int value) {
        this.outValUnderwriterGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outValUnderwriterGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutValUnderwriterGenericDetailParameterType() {
        return outValUnderwriterGenericDetailParameterType;
    }

    /**
     * Sets the value of the outValUnderwriterGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutValUnderwriterGenericDetailParameterType(String value) {
        this.outValUnderwriterGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outValUnderwriterGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutValUnderwriterGenericDetailDescription() {
        return outValUnderwriterGenericDetailDescription;
    }

    /**
     * Sets the value of the outValUnderwriterGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutValUnderwriterGenericDetailDescription(String value) {
        this.outValUnderwriterGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outValamnCurrCurrencyIdCurrency property.
     * 
     */
    public int getOutValamnCurrCurrencyIdCurrency() {
        return outValamnCurrCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outValamnCurrCurrencyIdCurrency property.
     * 
     */
    public void setOutValamnCurrCurrencyIdCurrency(int value) {
        this.outValamnCurrCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outValamnCurrCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutValamnCurrCurrencyShortDescr() {
        return outValamnCurrCurrencyShortDescr;
    }

    /**
     * Sets the value of the outValamnCurrCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutValamnCurrCurrencyShortDescr(String value) {
        this.outValamnCurrCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outAccountOfBankemployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAccountOfBankemployeeId() {
        return outAccountOfBankemployeeId;
    }

    /**
     * Sets the value of the outAccountOfBankemployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAccountOfBankemployeeId(String value) {
        this.outAccountOfBankemployeeId = value;
    }

    /**
     * Gets the value of the outAccountOfBankemployeeCardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAccountOfBankemployeeCardId() {
        return outAccountOfBankemployeeCardId;
    }

    /**
     * Sets the value of the outAccountOfBankemployeeCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAccountOfBankemployeeCardId(String value) {
        this.outAccountOfBankemployeeCardId = value;
    }

    /**
     * Gets the value of the outAccountOfBankemployeeFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAccountOfBankemployeeFirstName() {
        return outAccountOfBankemployeeFirstName;
    }

    /**
     * Sets the value of the outAccountOfBankemployeeFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAccountOfBankemployeeFirstName(String value) {
        this.outAccountOfBankemployeeFirstName = value;
    }

    /**
     * Gets the value of the outAccountOfBankemployeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAccountOfBankemployeeLastName() {
        return outAccountOfBankemployeeLastName;
    }

    /**
     * Sets the value of the outAccountOfBankemployeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAccountOfBankemployeeLastName(String value) {
        this.outAccountOfBankemployeeLastName = value;
    }

}
