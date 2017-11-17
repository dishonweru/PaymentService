
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Prt501VExternalTaskCheckExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Prt501VExternalTaskCheckExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutResultCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutResultCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutResultCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultCustomerTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultCustomerEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultCustomerMobileTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultCustomerTelephone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultExtTaskExtTaskId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutResultExtTaskExtTaskDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultExtTaskSendEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultExtTaskSendSms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultExtTaskAskCurrentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultExtTaskAskExtMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutResultProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutResultValidStatusStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Prt501VExternalTaskCheckExport", propOrder = {
    "outResultCustomerCustId",
    "outResultCustomerCDigit",
    "outResultCustomerSurname",
    "outResultCustomerFirstName",
    "outResultCustomerTitle",
    "outResultCustomerEMail",
    "outResultCustomerMobileTel",
    "outResultCustomerTelephone1",
    "outResultExtTaskExtTaskId",
    "outResultExtTaskExtTaskDescription",
    "outResultExtTaskSendEmail",
    "outResultExtTaskSendSms",
    "outResultExtTaskAskCurrentStatus",
    "outResultExtTaskAskExtMessage",
    "outResultProductIdProduct",
    "outResultProductDescription",
    "outResultProfitsAccountAccountNumber",
    "outResultProfitsAccountAccountCd",
    "outResultValidStatusStatus"
})
public class Prt501VExternalTaskCheckExport
    extends BaseExport
{

    @XmlElement(name = "OutResultCustomerCustId")
    protected int outResultCustomerCustId;
    @XmlElement(name = "OutResultCustomerCDigit")
    protected short outResultCustomerCDigit;
    @XmlElement(name = "OutResultCustomerSurname")
    protected String outResultCustomerSurname;
    @XmlElement(name = "OutResultCustomerFirstName")
    protected String outResultCustomerFirstName;
    @XmlElement(name = "OutResultCustomerTitle")
    protected String outResultCustomerTitle;
    @XmlElement(name = "OutResultCustomerEMail")
    protected String outResultCustomerEMail;
    @XmlElement(name = "OutResultCustomerMobileTel")
    protected String outResultCustomerMobileTel;
    @XmlElement(name = "OutResultCustomerTelephone1")
    protected String outResultCustomerTelephone1;
    @XmlElement(name = "OutResultExtTaskExtTaskId")
    protected double outResultExtTaskExtTaskId;
    @XmlElement(name = "OutResultExtTaskExtTaskDescription")
    protected String outResultExtTaskExtTaskDescription;
    @XmlElement(name = "OutResultExtTaskSendEmail")
    protected String outResultExtTaskSendEmail;
    @XmlElement(name = "OutResultExtTaskSendSms")
    protected String outResultExtTaskSendSms;
    @XmlElement(name = "OutResultExtTaskAskCurrentStatus")
    protected String outResultExtTaskAskCurrentStatus;
    @XmlElement(name = "OutResultExtTaskAskExtMessage")
    protected String outResultExtTaskAskExtMessage;
    @XmlElement(name = "OutResultProductIdProduct")
    protected int outResultProductIdProduct;
    @XmlElement(name = "OutResultProductDescription")
    protected String outResultProductDescription;
    @XmlElement(name = "OutResultProfitsAccountAccountNumber")
    protected String outResultProfitsAccountAccountNumber;
    @XmlElement(name = "OutResultProfitsAccountAccountCd")
    protected short outResultProfitsAccountAccountCd;
    @XmlElement(name = "OutResultValidStatusStatus")
    protected String outResultValidStatusStatus;

    /**
     * Gets the value of the outResultCustomerCustId property.
     * 
     */
    public int getOutResultCustomerCustId() {
        return outResultCustomerCustId;
    }

    /**
     * Sets the value of the outResultCustomerCustId property.
     * 
     */
    public void setOutResultCustomerCustId(int value) {
        this.outResultCustomerCustId = value;
    }

    /**
     * Gets the value of the outResultCustomerCDigit property.
     * 
     */
    public short getOutResultCustomerCDigit() {
        return outResultCustomerCDigit;
    }

    /**
     * Sets the value of the outResultCustomerCDigit property.
     * 
     */
    public void setOutResultCustomerCDigit(short value) {
        this.outResultCustomerCDigit = value;
    }

    /**
     * Gets the value of the outResultCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultCustomerSurname() {
        return outResultCustomerSurname;
    }

    /**
     * Sets the value of the outResultCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultCustomerSurname(String value) {
        this.outResultCustomerSurname = value;
    }

    /**
     * Gets the value of the outResultCustomerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultCustomerFirstName() {
        return outResultCustomerFirstName;
    }

    /**
     * Sets the value of the outResultCustomerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultCustomerFirstName(String value) {
        this.outResultCustomerFirstName = value;
    }

    /**
     * Gets the value of the outResultCustomerTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultCustomerTitle() {
        return outResultCustomerTitle;
    }

    /**
     * Sets the value of the outResultCustomerTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultCustomerTitle(String value) {
        this.outResultCustomerTitle = value;
    }

    /**
     * Gets the value of the outResultCustomerEMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultCustomerEMail() {
        return outResultCustomerEMail;
    }

    /**
     * Sets the value of the outResultCustomerEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultCustomerEMail(String value) {
        this.outResultCustomerEMail = value;
    }

    /**
     * Gets the value of the outResultCustomerMobileTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultCustomerMobileTel() {
        return outResultCustomerMobileTel;
    }

    /**
     * Sets the value of the outResultCustomerMobileTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultCustomerMobileTel(String value) {
        this.outResultCustomerMobileTel = value;
    }

    /**
     * Gets the value of the outResultCustomerTelephone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultCustomerTelephone1() {
        return outResultCustomerTelephone1;
    }

    /**
     * Sets the value of the outResultCustomerTelephone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultCustomerTelephone1(String value) {
        this.outResultCustomerTelephone1 = value;
    }

    /**
     * Gets the value of the outResultExtTaskExtTaskId property.
     * 
     */
    public double getOutResultExtTaskExtTaskId() {
        return outResultExtTaskExtTaskId;
    }

    /**
     * Sets the value of the outResultExtTaskExtTaskId property.
     * 
     */
    public void setOutResultExtTaskExtTaskId(double value) {
        this.outResultExtTaskExtTaskId = value;
    }

    /**
     * Gets the value of the outResultExtTaskExtTaskDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultExtTaskExtTaskDescription() {
        return outResultExtTaskExtTaskDescription;
    }

    /**
     * Sets the value of the outResultExtTaskExtTaskDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultExtTaskExtTaskDescription(String value) {
        this.outResultExtTaskExtTaskDescription = value;
    }

    /**
     * Gets the value of the outResultExtTaskSendEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultExtTaskSendEmail() {
        return outResultExtTaskSendEmail;
    }

    /**
     * Sets the value of the outResultExtTaskSendEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultExtTaskSendEmail(String value) {
        this.outResultExtTaskSendEmail = value;
    }

    /**
     * Gets the value of the outResultExtTaskSendSms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultExtTaskSendSms() {
        return outResultExtTaskSendSms;
    }

    /**
     * Sets the value of the outResultExtTaskSendSms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultExtTaskSendSms(String value) {
        this.outResultExtTaskSendSms = value;
    }

    /**
     * Gets the value of the outResultExtTaskAskCurrentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultExtTaskAskCurrentStatus() {
        return outResultExtTaskAskCurrentStatus;
    }

    /**
     * Sets the value of the outResultExtTaskAskCurrentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultExtTaskAskCurrentStatus(String value) {
        this.outResultExtTaskAskCurrentStatus = value;
    }

    /**
     * Gets the value of the outResultExtTaskAskExtMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultExtTaskAskExtMessage() {
        return outResultExtTaskAskExtMessage;
    }

    /**
     * Sets the value of the outResultExtTaskAskExtMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultExtTaskAskExtMessage(String value) {
        this.outResultExtTaskAskExtMessage = value;
    }

    /**
     * Gets the value of the outResultProductIdProduct property.
     * 
     */
    public int getOutResultProductIdProduct() {
        return outResultProductIdProduct;
    }

    /**
     * Sets the value of the outResultProductIdProduct property.
     * 
     */
    public void setOutResultProductIdProduct(int value) {
        this.outResultProductIdProduct = value;
    }

    /**
     * Gets the value of the outResultProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultProductDescription() {
        return outResultProductDescription;
    }

    /**
     * Sets the value of the outResultProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultProductDescription(String value) {
        this.outResultProductDescription = value;
    }

    /**
     * Gets the value of the outResultProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultProfitsAccountAccountNumber() {
        return outResultProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outResultProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultProfitsAccountAccountNumber(String value) {
        this.outResultProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outResultProfitsAccountAccountCd property.
     * 
     */
    public short getOutResultProfitsAccountAccountCd() {
        return outResultProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outResultProfitsAccountAccountCd property.
     * 
     */
    public void setOutResultProfitsAccountAccountCd(short value) {
        this.outResultProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outResultValidStatusStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultValidStatusStatus() {
        return outResultValidStatusStatus;
    }

    /**
     * Sets the value of the outResultValidStatusStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultValidStatusStatus(String value) {
        this.outResultValidStatusStatus = value;
    }

}
