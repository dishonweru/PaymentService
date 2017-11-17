
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepositFirstDemandWithdrawImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepositFirstDemandWithdrawImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGroup" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfInGroup" minOccurs="0"/>
 *         &lt;element name="InParametersInBankParametersEuroEchoDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthorGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCheckCustExpDtIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepTrxRecordingICustomerIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIcomPayRefNoIefSuppliedText40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InStampCheckIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepositFirstDemandWithdrawImport", propOrder = {
    "command",
    "inGroup",
    "inParametersInBankParametersEuroEchoDesc",
    "inParametersInTerminalTerminalNumber",
    "inAuthorGrantedIefSuppliedFlag",
    "inCheckCustExpDtIefSuppliedFlag",
    "inDepTrxRecordingICustomerIdNo",
    "inIcomPayRefNoIefSuppliedText40",
    "inPrftTransactionIdTransact",
    "inStampCheckIefSuppliedFlag"
})
public class DepositFirstDemandWithdrawImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InGroup")
    protected ArrayOfInGroup inGroup;
    @XmlElement(name = "InParametersInBankParametersEuroEchoDesc")
    protected String inParametersInBankParametersEuroEchoDesc;
    @XmlElement(name = "InParametersInTerminalTerminalNumber")
    protected String inParametersInTerminalTerminalNumber;
    @XmlElement(name = "InAuthorGrantedIefSuppliedFlag")
    protected String inAuthorGrantedIefSuppliedFlag;
    @XmlElement(name = "InCheckCustExpDtIefSuppliedFlag")
    protected String inCheckCustExpDtIefSuppliedFlag;
    @XmlElement(name = "InDepTrxRecordingICustomerIdNo")
    protected String inDepTrxRecordingICustomerIdNo;
    @XmlElement(name = "InIcomPayRefNoIefSuppliedText40")
    protected String inIcomPayRefNoIefSuppliedText40;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InStampCheckIefSuppliedFlag")
    protected String inStampCheckIefSuppliedFlag;

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
     * Gets the value of the inGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInGroup }
     *     
     */
    public ArrayOfInGroup getInGroup() {
        return inGroup;
    }

    /**
     * Sets the value of the inGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInGroup }
     *     
     */
    public void setInGroup(ArrayOfInGroup value) {
        this.inGroup = value;
    }

    /**
     * Gets the value of the inParametersInBankParametersEuroEchoDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInBankParametersEuroEchoDesc() {
        return inParametersInBankParametersEuroEchoDesc;
    }

    /**
     * Sets the value of the inParametersInBankParametersEuroEchoDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInBankParametersEuroEchoDesc(String value) {
        this.inParametersInBankParametersEuroEchoDesc = value;
    }

    /**
     * Gets the value of the inParametersInTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInTerminalTerminalNumber() {
        return inParametersInTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inParametersInTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInTerminalTerminalNumber(String value) {
        this.inParametersInTerminalTerminalNumber = value;
    }

    /**
     * Gets the value of the inAuthorGrantedIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthorGrantedIefSuppliedFlag() {
        return inAuthorGrantedIefSuppliedFlag;
    }

    /**
     * Sets the value of the inAuthorGrantedIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthorGrantedIefSuppliedFlag(String value) {
        this.inAuthorGrantedIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inCheckCustExpDtIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCheckCustExpDtIefSuppliedFlag() {
        return inCheckCustExpDtIefSuppliedFlag;
    }

    /**
     * Sets the value of the inCheckCustExpDtIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCheckCustExpDtIefSuppliedFlag(String value) {
        this.inCheckCustExpDtIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inDepTrxRecordingICustomerIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepTrxRecordingICustomerIdNo() {
        return inDepTrxRecordingICustomerIdNo;
    }

    /**
     * Sets the value of the inDepTrxRecordingICustomerIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepTrxRecordingICustomerIdNo(String value) {
        this.inDepTrxRecordingICustomerIdNo = value;
    }

    /**
     * Gets the value of the inIcomPayRefNoIefSuppliedText40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIcomPayRefNoIefSuppliedText40() {
        return inIcomPayRefNoIefSuppliedText40;
    }

    /**
     * Sets the value of the inIcomPayRefNoIefSuppliedText40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIcomPayRefNoIefSuppliedText40(String value) {
        this.inIcomPayRefNoIefSuppliedText40 = value;
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
     * Gets the value of the inStampCheckIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInStampCheckIefSuppliedFlag() {
        return inStampCheckIefSuppliedFlag;
    }

    /**
     * Sets the value of the inStampCheckIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInStampCheckIefSuppliedFlag(String value) {
        this.inStampCheckIefSuppliedFlag = value;
    }

}
