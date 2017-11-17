
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Mc2032VPropertyValuerManagementImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mc2032VPropertyValuerManagementImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCritValuerTypeIefSuppliedType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDefaultJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDefaultProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPrevValuerValuerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InValcnGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InValcnGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InValcnGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InValuerEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InValuerInternalFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InValuerTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InValuerValuerAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InValuerValuerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InValuerValuerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InValuerValuerMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InValuerValuerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InValuerValuerPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCritAmountIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InValuerAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InValuerContactPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InValamnCurrCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InValamnCurrCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InValUnderwriterGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InValUnderwriterGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InValUnderwriterGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCritValuerStatusIefSuppliedEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAccountOffBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mc2032VPropertyValuerManagementImport", propOrder = {
    "command",
    "inCritValuerTypeIefSuppliedType",
    "inDefaultJustificIdJustific",
    "inDefaultProductIdProduct",
    "inIefSuppliedCommand",
    "inLogMntRecordingReversalFlag",
    "inLogMntRecordingTerminalNumber",
    "inLogMntRecordingTrxCode",
    "inPrevValuerValuerId",
    "inValcnGenericDetailDescription",
    "inValcnGenericDetailParameterType",
    "inValcnGenericDetailSerialNum",
    "inValuerEntryStatus",
    "inValuerInternalFlg",
    "inValuerTmstamp",
    "inValuerValuerAddress",
    "inValuerValuerEmail",
    "inValuerValuerId",
    "inValuerValuerMobile",
    "inValuerValuerName",
    "inValuerValuerPhone",
    "inCritAmountIefSuppliedNumber152",
    "inValuerAmount",
    "inValuerContactPerson",
    "inValamnCurrCurrencyIdCurrency",
    "inValamnCurrCurrencyShortDescr",
    "inValUnderwriterGenericDetailSerialNum",
    "inValUnderwriterGenericDetailParameterType",
    "inValUnderwriterGenericDetailDescription",
    "inCritValuerStatusIefSuppliedEntryStatus",
    "inAccountOffBankemployeeId"
})
public class Mc2032VPropertyValuerManagementImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InCritValuerTypeIefSuppliedType")
    protected String inCritValuerTypeIefSuppliedType;
    @XmlElement(name = "InDefaultJustificIdJustific")
    protected int inDefaultJustificIdJustific;
    @XmlElement(name = "InDefaultProductIdProduct")
    protected int inDefaultProductIdProduct;
    @XmlElement(name = "InIefSuppliedCommand")
    protected String inIefSuppliedCommand;
    @XmlElement(name = "InLogMntRecordingReversalFlag")
    protected String inLogMntRecordingReversalFlag;
    @XmlElement(name = "InLogMntRecordingTerminalNumber")
    protected String inLogMntRecordingTerminalNumber;
    @XmlElement(name = "InLogMntRecordingTrxCode")
    protected int inLogMntRecordingTrxCode;
    @XmlElement(name = "InPrevValuerValuerId")
    protected int inPrevValuerValuerId;
    @XmlElement(name = "InValcnGenericDetailDescription")
    protected String inValcnGenericDetailDescription;
    @XmlElement(name = "InValcnGenericDetailParameterType")
    protected String inValcnGenericDetailParameterType;
    @XmlElement(name = "InValcnGenericDetailSerialNum")
    protected int inValcnGenericDetailSerialNum;
    @XmlElement(name = "InValuerEntryStatus")
    protected String inValuerEntryStatus;
    @XmlElement(name = "InValuerInternalFlg")
    protected String inValuerInternalFlg;
    @XmlElement(name = "InValuerTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inValuerTmstamp;
    @XmlElement(name = "InValuerValuerAddress")
    protected String inValuerValuerAddress;
    @XmlElement(name = "InValuerValuerEmail")
    protected String inValuerValuerEmail;
    @XmlElement(name = "InValuerValuerId")
    protected int inValuerValuerId;
    @XmlElement(name = "InValuerValuerMobile")
    protected String inValuerValuerMobile;
    @XmlElement(name = "InValuerValuerName")
    protected String inValuerValuerName;
    @XmlElement(name = "InValuerValuerPhone")
    protected String inValuerValuerPhone;
    @XmlElement(name = "InCritAmountIefSuppliedNumber152", required = true)
    protected BigDecimal inCritAmountIefSuppliedNumber152;
    @XmlElement(name = "InValuerAmount", required = true)
    protected BigDecimal inValuerAmount;
    @XmlElement(name = "InValuerContactPerson")
    protected String inValuerContactPerson;
    @XmlElement(name = "InValamnCurrCurrencyIdCurrency")
    protected int inValamnCurrCurrencyIdCurrency;
    @XmlElement(name = "InValamnCurrCurrencyShortDescr")
    protected String inValamnCurrCurrencyShortDescr;
    @XmlElement(name = "InValUnderwriterGenericDetailSerialNum")
    protected int inValUnderwriterGenericDetailSerialNum;
    @XmlElement(name = "InValUnderwriterGenericDetailParameterType")
    protected String inValUnderwriterGenericDetailParameterType;
    @XmlElement(name = "InValUnderwriterGenericDetailDescription")
    protected String inValUnderwriterGenericDetailDescription;
    @XmlElement(name = "InCritValuerStatusIefSuppliedEntryStatus")
    protected String inCritValuerStatusIefSuppliedEntryStatus;
    @XmlElement(name = "InAccountOffBankemployeeId")
    protected String inAccountOffBankemployeeId;

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
     * Gets the value of the inCritValuerTypeIefSuppliedType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCritValuerTypeIefSuppliedType() {
        return inCritValuerTypeIefSuppliedType;
    }

    /**
     * Sets the value of the inCritValuerTypeIefSuppliedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCritValuerTypeIefSuppliedType(String value) {
        this.inCritValuerTypeIefSuppliedType = value;
    }

    /**
     * Gets the value of the inDefaultJustificIdJustific property.
     * 
     */
    public int getInDefaultJustificIdJustific() {
        return inDefaultJustificIdJustific;
    }

    /**
     * Sets the value of the inDefaultJustificIdJustific property.
     * 
     */
    public void setInDefaultJustificIdJustific(int value) {
        this.inDefaultJustificIdJustific = value;
    }

    /**
     * Gets the value of the inDefaultProductIdProduct property.
     * 
     */
    public int getInDefaultProductIdProduct() {
        return inDefaultProductIdProduct;
    }

    /**
     * Sets the value of the inDefaultProductIdProduct property.
     * 
     */
    public void setInDefaultProductIdProduct(int value) {
        this.inDefaultProductIdProduct = value;
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
     * Gets the value of the inLogMntRecordingReversalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogMntRecordingReversalFlag() {
        return inLogMntRecordingReversalFlag;
    }

    /**
     * Sets the value of the inLogMntRecordingReversalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogMntRecordingReversalFlag(String value) {
        this.inLogMntRecordingReversalFlag = value;
    }

    /**
     * Gets the value of the inLogMntRecordingTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogMntRecordingTerminalNumber() {
        return inLogMntRecordingTerminalNumber;
    }

    /**
     * Sets the value of the inLogMntRecordingTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogMntRecordingTerminalNumber(String value) {
        this.inLogMntRecordingTerminalNumber = value;
    }

    /**
     * Gets the value of the inLogMntRecordingTrxCode property.
     * 
     */
    public int getInLogMntRecordingTrxCode() {
        return inLogMntRecordingTrxCode;
    }

    /**
     * Sets the value of the inLogMntRecordingTrxCode property.
     * 
     */
    public void setInLogMntRecordingTrxCode(int value) {
        this.inLogMntRecordingTrxCode = value;
    }

    /**
     * Gets the value of the inPrevValuerValuerId property.
     * 
     */
    public int getInPrevValuerValuerId() {
        return inPrevValuerValuerId;
    }

    /**
     * Sets the value of the inPrevValuerValuerId property.
     * 
     */
    public void setInPrevValuerValuerId(int value) {
        this.inPrevValuerValuerId = value;
    }

    /**
     * Gets the value of the inValcnGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInValcnGenericDetailDescription() {
        return inValcnGenericDetailDescription;
    }

    /**
     * Sets the value of the inValcnGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInValcnGenericDetailDescription(String value) {
        this.inValcnGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inValcnGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInValcnGenericDetailParameterType() {
        return inValcnGenericDetailParameterType;
    }

    /**
     * Sets the value of the inValcnGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInValcnGenericDetailParameterType(String value) {
        this.inValcnGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inValcnGenericDetailSerialNum property.
     * 
     */
    public int getInValcnGenericDetailSerialNum() {
        return inValcnGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inValcnGenericDetailSerialNum property.
     * 
     */
    public void setInValcnGenericDetailSerialNum(int value) {
        this.inValcnGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inValuerEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInValuerEntryStatus() {
        return inValuerEntryStatus;
    }

    /**
     * Sets the value of the inValuerEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInValuerEntryStatus(String value) {
        this.inValuerEntryStatus = value;
    }

    /**
     * Gets the value of the inValuerInternalFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInValuerInternalFlg() {
        return inValuerInternalFlg;
    }

    /**
     * Sets the value of the inValuerInternalFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInValuerInternalFlg(String value) {
        this.inValuerInternalFlg = value;
    }

    /**
     * Gets the value of the inValuerTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInValuerTmstamp() {
        return inValuerTmstamp;
    }

    /**
     * Sets the value of the inValuerTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInValuerTmstamp(XMLGregorianCalendar value) {
        this.inValuerTmstamp = value;
    }

    /**
     * Gets the value of the inValuerValuerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInValuerValuerAddress() {
        return inValuerValuerAddress;
    }

    /**
     * Sets the value of the inValuerValuerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInValuerValuerAddress(String value) {
        this.inValuerValuerAddress = value;
    }

    /**
     * Gets the value of the inValuerValuerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInValuerValuerEmail() {
        return inValuerValuerEmail;
    }

    /**
     * Sets the value of the inValuerValuerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInValuerValuerEmail(String value) {
        this.inValuerValuerEmail = value;
    }

    /**
     * Gets the value of the inValuerValuerId property.
     * 
     */
    public int getInValuerValuerId() {
        return inValuerValuerId;
    }

    /**
     * Sets the value of the inValuerValuerId property.
     * 
     */
    public void setInValuerValuerId(int value) {
        this.inValuerValuerId = value;
    }

    /**
     * Gets the value of the inValuerValuerMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInValuerValuerMobile() {
        return inValuerValuerMobile;
    }

    /**
     * Sets the value of the inValuerValuerMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInValuerValuerMobile(String value) {
        this.inValuerValuerMobile = value;
    }

    /**
     * Gets the value of the inValuerValuerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInValuerValuerName() {
        return inValuerValuerName;
    }

    /**
     * Sets the value of the inValuerValuerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInValuerValuerName(String value) {
        this.inValuerValuerName = value;
    }

    /**
     * Gets the value of the inValuerValuerPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInValuerValuerPhone() {
        return inValuerValuerPhone;
    }

    /**
     * Sets the value of the inValuerValuerPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInValuerValuerPhone(String value) {
        this.inValuerValuerPhone = value;
    }

    /**
     * Gets the value of the inCritAmountIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInCritAmountIefSuppliedNumber152() {
        return inCritAmountIefSuppliedNumber152;
    }

    /**
     * Sets the value of the inCritAmountIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInCritAmountIefSuppliedNumber152(BigDecimal value) {
        this.inCritAmountIefSuppliedNumber152 = value;
    }

    /**
     * Gets the value of the inValuerAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInValuerAmount() {
        return inValuerAmount;
    }

    /**
     * Sets the value of the inValuerAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInValuerAmount(BigDecimal value) {
        this.inValuerAmount = value;
    }

    /**
     * Gets the value of the inValuerContactPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInValuerContactPerson() {
        return inValuerContactPerson;
    }

    /**
     * Sets the value of the inValuerContactPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInValuerContactPerson(String value) {
        this.inValuerContactPerson = value;
    }

    /**
     * Gets the value of the inValamnCurrCurrencyIdCurrency property.
     * 
     */
    public int getInValamnCurrCurrencyIdCurrency() {
        return inValamnCurrCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inValamnCurrCurrencyIdCurrency property.
     * 
     */
    public void setInValamnCurrCurrencyIdCurrency(int value) {
        this.inValamnCurrCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inValamnCurrCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInValamnCurrCurrencyShortDescr() {
        return inValamnCurrCurrencyShortDescr;
    }

    /**
     * Sets the value of the inValamnCurrCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInValamnCurrCurrencyShortDescr(String value) {
        this.inValamnCurrCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inValUnderwriterGenericDetailSerialNum property.
     * 
     */
    public int getInValUnderwriterGenericDetailSerialNum() {
        return inValUnderwriterGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inValUnderwriterGenericDetailSerialNum property.
     * 
     */
    public void setInValUnderwriterGenericDetailSerialNum(int value) {
        this.inValUnderwriterGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inValUnderwriterGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInValUnderwriterGenericDetailParameterType() {
        return inValUnderwriterGenericDetailParameterType;
    }

    /**
     * Sets the value of the inValUnderwriterGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInValUnderwriterGenericDetailParameterType(String value) {
        this.inValUnderwriterGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inValUnderwriterGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInValUnderwriterGenericDetailDescription() {
        return inValUnderwriterGenericDetailDescription;
    }

    /**
     * Sets the value of the inValUnderwriterGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInValUnderwriterGenericDetailDescription(String value) {
        this.inValUnderwriterGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inCritValuerStatusIefSuppliedEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCritValuerStatusIefSuppliedEntryStatus() {
        return inCritValuerStatusIefSuppliedEntryStatus;
    }

    /**
     * Sets the value of the inCritValuerStatusIefSuppliedEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCritValuerStatusIefSuppliedEntryStatus(String value) {
        this.inCritValuerStatusIefSuppliedEntryStatus = value;
    }

    /**
     * Gets the value of the inAccountOffBankemployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAccountOffBankemployeeId() {
        return inAccountOffBankemployeeId;
    }

    /**
     * Sets the value of the inAccountOffBankemployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAccountOffBankemployeeId(String value) {
        this.inAccountOffBankemployeeId = value;
    }

}
