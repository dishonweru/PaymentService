
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for L0494VMediatorsMaintenanceImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0494VMediatorsMaintenanceImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InClientMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InClientMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InClientMntRecordingTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InContinueLoanAddInfoAccSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InContinueLoanAddInfoAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InContinueLoanAddInfoAccUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InFilterFilterValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLnsMediatorAddInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLnsMediatorAgreementNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLnsMediatorEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLnsMediatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMediatorProfGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMediatorProfGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMediatorProfGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMediatorProfGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedDepProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSelectedDepProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InToContinueLnsMediatorAgreementNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0494VMediatorsMaintenanceImport", propOrder = {
    "command",
    "inClientMntRecordingReversalFlag",
    "inClientMntRecordingTerminalNumber",
    "inClientMntRecordingTrxCode",
    "inContinueLoanAddInfoAccSn",
    "inContinueLoanAddInfoAccType",
    "inContinueLoanAddInfoAccUnit",
    "inCustomerCDigit",
    "inCustomerCustId",
    "inFilterFilterValue",
    "inIefSuppliedCommand",
    "inLnsMediatorAddInfo",
    "inLnsMediatorAgreementNo",
    "inLnsMediatorEntryStatus",
    "inLnsMediatorName",
    "inMediatorProfGenericDetailDescription",
    "inMediatorProfGenericDetailParameterType",
    "inMediatorProfGenericDetailSerialNum",
    "inMediatorProfGenericDetailShortDescription",
    "inSelectedDepProfitsAccountAccountCd",
    "inSelectedDepProfitsAccountAccountNumber",
    "inToContinueLnsMediatorAgreementNo"
})
public class L0494VMediatorsMaintenanceImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InClientMntRecordingReversalFlag")
    protected String inClientMntRecordingReversalFlag;
    @XmlElement(name = "InClientMntRecordingTerminalNumber")
    protected String inClientMntRecordingTerminalNumber;
    @XmlElement(name = "InClientMntRecordingTrxCode")
    protected int inClientMntRecordingTrxCode;
    @XmlElement(name = "InContinueLoanAddInfoAccSn")
    protected double inContinueLoanAddInfoAccSn;
    @XmlElement(name = "InContinueLoanAddInfoAccType")
    protected short inContinueLoanAddInfoAccType;
    @XmlElement(name = "InContinueLoanAddInfoAccUnit")
    protected int inContinueLoanAddInfoAccUnit;
    @XmlElement(name = "InCustomerCDigit")
    protected short inCustomerCDigit;
    @XmlElement(name = "InCustomerCustId")
    protected int inCustomerCustId;
    @XmlElement(name = "InFilterFilterValue")
    protected String inFilterFilterValue;
    @XmlElement(name = "InIefSuppliedCommand")
    protected String inIefSuppliedCommand;
    @XmlElement(name = "InLnsMediatorAddInfo")
    protected String inLnsMediatorAddInfo;
    @XmlElement(name = "InLnsMediatorAgreementNo")
    protected int inLnsMediatorAgreementNo;
    @XmlElement(name = "InLnsMediatorEntryStatus")
    protected String inLnsMediatorEntryStatus;
    @XmlElement(name = "InLnsMediatorName")
    protected String inLnsMediatorName;
    @XmlElement(name = "InMediatorProfGenericDetailDescription")
    protected String inMediatorProfGenericDetailDescription;
    @XmlElement(name = "InMediatorProfGenericDetailParameterType")
    protected String inMediatorProfGenericDetailParameterType;
    @XmlElement(name = "InMediatorProfGenericDetailSerialNum")
    protected int inMediatorProfGenericDetailSerialNum;
    @XmlElement(name = "InMediatorProfGenericDetailShortDescription")
    protected String inMediatorProfGenericDetailShortDescription;
    @XmlElement(name = "InSelectedDepProfitsAccountAccountCd")
    protected short inSelectedDepProfitsAccountAccountCd;
    @XmlElement(name = "InSelectedDepProfitsAccountAccountNumber")
    protected String inSelectedDepProfitsAccountAccountNumber;
    @XmlElement(name = "InToContinueLnsMediatorAgreementNo")
    protected int inToContinueLnsMediatorAgreementNo;

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
     * Gets the value of the inClientMntRecordingReversalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInClientMntRecordingReversalFlag() {
        return inClientMntRecordingReversalFlag;
    }

    /**
     * Sets the value of the inClientMntRecordingReversalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInClientMntRecordingReversalFlag(String value) {
        this.inClientMntRecordingReversalFlag = value;
    }

    /**
     * Gets the value of the inClientMntRecordingTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInClientMntRecordingTerminalNumber() {
        return inClientMntRecordingTerminalNumber;
    }

    /**
     * Sets the value of the inClientMntRecordingTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInClientMntRecordingTerminalNumber(String value) {
        this.inClientMntRecordingTerminalNumber = value;
    }

    /**
     * Gets the value of the inClientMntRecordingTrxCode property.
     * 
     */
    public int getInClientMntRecordingTrxCode() {
        return inClientMntRecordingTrxCode;
    }

    /**
     * Sets the value of the inClientMntRecordingTrxCode property.
     * 
     */
    public void setInClientMntRecordingTrxCode(int value) {
        this.inClientMntRecordingTrxCode = value;
    }

    /**
     * Gets the value of the inContinueLoanAddInfoAccSn property.
     * 
     */
    public double getInContinueLoanAddInfoAccSn() {
        return inContinueLoanAddInfoAccSn;
    }

    /**
     * Sets the value of the inContinueLoanAddInfoAccSn property.
     * 
     */
    public void setInContinueLoanAddInfoAccSn(double value) {
        this.inContinueLoanAddInfoAccSn = value;
    }

    /**
     * Gets the value of the inContinueLoanAddInfoAccType property.
     * 
     */
    public short getInContinueLoanAddInfoAccType() {
        return inContinueLoanAddInfoAccType;
    }

    /**
     * Sets the value of the inContinueLoanAddInfoAccType property.
     * 
     */
    public void setInContinueLoanAddInfoAccType(short value) {
        this.inContinueLoanAddInfoAccType = value;
    }

    /**
     * Gets the value of the inContinueLoanAddInfoAccUnit property.
     * 
     */
    public int getInContinueLoanAddInfoAccUnit() {
        return inContinueLoanAddInfoAccUnit;
    }

    /**
     * Sets the value of the inContinueLoanAddInfoAccUnit property.
     * 
     */
    public void setInContinueLoanAddInfoAccUnit(int value) {
        this.inContinueLoanAddInfoAccUnit = value;
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
     * Gets the value of the inFilterFilterValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFilterFilterValue() {
        return inFilterFilterValue;
    }

    /**
     * Sets the value of the inFilterFilterValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFilterFilterValue(String value) {
        this.inFilterFilterValue = value;
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
     * Gets the value of the inLnsMediatorAddInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLnsMediatorAddInfo() {
        return inLnsMediatorAddInfo;
    }

    /**
     * Sets the value of the inLnsMediatorAddInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLnsMediatorAddInfo(String value) {
        this.inLnsMediatorAddInfo = value;
    }

    /**
     * Gets the value of the inLnsMediatorAgreementNo property.
     * 
     */
    public int getInLnsMediatorAgreementNo() {
        return inLnsMediatorAgreementNo;
    }

    /**
     * Sets the value of the inLnsMediatorAgreementNo property.
     * 
     */
    public void setInLnsMediatorAgreementNo(int value) {
        this.inLnsMediatorAgreementNo = value;
    }

    /**
     * Gets the value of the inLnsMediatorEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLnsMediatorEntryStatus() {
        return inLnsMediatorEntryStatus;
    }

    /**
     * Sets the value of the inLnsMediatorEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLnsMediatorEntryStatus(String value) {
        this.inLnsMediatorEntryStatus = value;
    }

    /**
     * Gets the value of the inLnsMediatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLnsMediatorName() {
        return inLnsMediatorName;
    }

    /**
     * Sets the value of the inLnsMediatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLnsMediatorName(String value) {
        this.inLnsMediatorName = value;
    }

    /**
     * Gets the value of the inMediatorProfGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMediatorProfGenericDetailDescription() {
        return inMediatorProfGenericDetailDescription;
    }

    /**
     * Sets the value of the inMediatorProfGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMediatorProfGenericDetailDescription(String value) {
        this.inMediatorProfGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inMediatorProfGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMediatorProfGenericDetailParameterType() {
        return inMediatorProfGenericDetailParameterType;
    }

    /**
     * Sets the value of the inMediatorProfGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMediatorProfGenericDetailParameterType(String value) {
        this.inMediatorProfGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inMediatorProfGenericDetailSerialNum property.
     * 
     */
    public int getInMediatorProfGenericDetailSerialNum() {
        return inMediatorProfGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inMediatorProfGenericDetailSerialNum property.
     * 
     */
    public void setInMediatorProfGenericDetailSerialNum(int value) {
        this.inMediatorProfGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inMediatorProfGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMediatorProfGenericDetailShortDescription() {
        return inMediatorProfGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inMediatorProfGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMediatorProfGenericDetailShortDescription(String value) {
        this.inMediatorProfGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inSelectedDepProfitsAccountAccountCd property.
     * 
     */
    public short getInSelectedDepProfitsAccountAccountCd() {
        return inSelectedDepProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inSelectedDepProfitsAccountAccountCd property.
     * 
     */
    public void setInSelectedDepProfitsAccountAccountCd(short value) {
        this.inSelectedDepProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inSelectedDepProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedDepProfitsAccountAccountNumber() {
        return inSelectedDepProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inSelectedDepProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedDepProfitsAccountAccountNumber(String value) {
        this.inSelectedDepProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inToContinueLnsMediatorAgreementNo property.
     * 
     */
    public int getInToContinueLnsMediatorAgreementNo() {
        return inToContinueLnsMediatorAgreementNo;
    }

    /**
     * Sets the value of the inToContinueLnsMediatorAgreementNo property.
     * 
     */
    public void setInToContinueLnsMediatorAgreementNo(int value) {
        this.inToContinueLnsMediatorAgreementNo = value;
    }

}
