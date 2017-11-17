
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CIA0008VOutGrpRequestsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CIA0008VOutGrpRequestsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpRequestsOutGrmProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpRequestsOutGrmProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRequestsOutGrmProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpRequestsOutGrmRequestsCmsgRqstDtlAccBalGreater" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpRequestsOutGrmRequestsCmsgRqstDtlAccBalLess" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpRequestsOutGrmRequestsCmsgRqstDtlAccBalSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRequestsOutGrmRequestsCmsgRqstDtlAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRequestsOutGrmRequestsCmsgRqstDtlAccountSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpRequestsOutGrmRequestsCmsgRqstDtlAccountsAll" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRequestsOutGrmRequestsCmsgRqstDtlChannelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpRequestsOutGrmRequestsCmsgRqstDtlChannelsAll" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRequestsOutGrmRequestsCmsgRqstDtlCmsgRqstDtlSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpRequestsOutGrmRequestsCmsgRqstDtlCmsgRqstDtlSts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRequestsOutGrmRequestsCmsgRqstDtlEmailSend" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRequestsOutGrmRequestsCmsgRqstDtlJustificationAll" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRequestsOutGrmRequestsCmsgRqstDtlJustificationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpRequestsOutGrmRequestsCmsgRqstDtlMessageComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRequestsOutGrmRequestsCmsgRqstDtlProductAll" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRequestsOutGrmRequestsCmsgRqstDtlProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpRequestsOutGrmRequestsCmsgRqstDtlSmsSend" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRequestsOutGrmRequestsCmsgRqstDtlTransactionAll" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRequestsOutGrmRequestsCmsgRqstDtlTransactionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpRequestsOutGrmRequestsCmsgRqstDtlTrxAmountGreater" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpRequestsOutGrmRequestsCmsgRqstDtlTrxAmountLess" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpRequestsOutGrmRequestsCmsgRqstDtlTrxAmountSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CIA0008VOutGrpRequestsItem", propOrder = {
    "outGrpRequestsOutGrmProfitsAccountAccountCd",
    "outGrpRequestsOutGrmProfitsAccountAccountNumber",
    "outGrpRequestsOutGrmProfitsAccountPrftSystem",
    "outGrpRequestsOutGrmRequestsCmsgRqstDtlAccBalGreater",
    "outGrpRequestsOutGrmRequestsCmsgRqstDtlAccBalLess",
    "outGrpRequestsOutGrmRequestsCmsgRqstDtlAccBalSet",
    "outGrpRequestsOutGrmRequestsCmsgRqstDtlAccountNumber",
    "outGrpRequestsOutGrmRequestsCmsgRqstDtlAccountSystem",
    "outGrpRequestsOutGrmRequestsCmsgRqstDtlAccountsAll",
    "outGrpRequestsOutGrmRequestsCmsgRqstDtlChannelId",
    "outGrpRequestsOutGrmRequestsCmsgRqstDtlChannelsAll",
    "outGrpRequestsOutGrmRequestsCmsgRqstDtlCmsgRqstDtlSn",
    "outGrpRequestsOutGrmRequestsCmsgRqstDtlCmsgRqstDtlSts",
    "outGrpRequestsOutGrmRequestsCmsgRqstDtlEmailSend",
    "outGrpRequestsOutGrmRequestsCmsgRqstDtlJustificationAll",
    "outGrpRequestsOutGrmRequestsCmsgRqstDtlJustificationId",
    "outGrpRequestsOutGrmRequestsCmsgRqstDtlMessageComments",
    "outGrpRequestsOutGrmRequestsCmsgRqstDtlProductAll",
    "outGrpRequestsOutGrmRequestsCmsgRqstDtlProductId",
    "outGrpRequestsOutGrmRequestsCmsgRqstDtlSmsSend",
    "outGrpRequestsOutGrmRequestsCmsgRqstDtlTransactionAll",
    "outGrpRequestsOutGrmRequestsCmsgRqstDtlTransactionId",
    "outGrpRequestsOutGrmRequestsCmsgRqstDtlTrxAmountGreater",
    "outGrpRequestsOutGrmRequestsCmsgRqstDtlTrxAmountLess",
    "outGrpRequestsOutGrmRequestsCmsgRqstDtlTrxAmountSet"
})
public class CIA0008VOutGrpRequestsItem {

    @XmlElement(name = "OutGrpRequestsOutGrmProfitsAccountAccountCd")
    protected short outGrpRequestsOutGrmProfitsAccountAccountCd;
    @XmlElement(name = "OutGrpRequestsOutGrmProfitsAccountAccountNumber")
    protected String outGrpRequestsOutGrmProfitsAccountAccountNumber;
    @XmlElement(name = "OutGrpRequestsOutGrmProfitsAccountPrftSystem")
    protected short outGrpRequestsOutGrmProfitsAccountPrftSystem;
    @XmlElement(name = "OutGrpRequestsOutGrmRequestsCmsgRqstDtlAccBalGreater")
    protected double outGrpRequestsOutGrmRequestsCmsgRqstDtlAccBalGreater;
    @XmlElement(name = "OutGrpRequestsOutGrmRequestsCmsgRqstDtlAccBalLess")
    protected double outGrpRequestsOutGrmRequestsCmsgRqstDtlAccBalLess;
    @XmlElement(name = "OutGrpRequestsOutGrmRequestsCmsgRqstDtlAccBalSet")
    protected String outGrpRequestsOutGrmRequestsCmsgRqstDtlAccBalSet;
    @XmlElement(name = "OutGrpRequestsOutGrmRequestsCmsgRqstDtlAccountNumber")
    protected String outGrpRequestsOutGrmRequestsCmsgRqstDtlAccountNumber;
    @XmlElement(name = "OutGrpRequestsOutGrmRequestsCmsgRqstDtlAccountSystem")
    protected short outGrpRequestsOutGrmRequestsCmsgRqstDtlAccountSystem;
    @XmlElement(name = "OutGrpRequestsOutGrmRequestsCmsgRqstDtlAccountsAll")
    protected String outGrpRequestsOutGrmRequestsCmsgRqstDtlAccountsAll;
    @XmlElement(name = "OutGrpRequestsOutGrmRequestsCmsgRqstDtlChannelId")
    protected int outGrpRequestsOutGrmRequestsCmsgRqstDtlChannelId;
    @XmlElement(name = "OutGrpRequestsOutGrmRequestsCmsgRqstDtlChannelsAll")
    protected String outGrpRequestsOutGrmRequestsCmsgRqstDtlChannelsAll;
    @XmlElement(name = "OutGrpRequestsOutGrmRequestsCmsgRqstDtlCmsgRqstDtlSn")
    protected int outGrpRequestsOutGrmRequestsCmsgRqstDtlCmsgRqstDtlSn;
    @XmlElement(name = "OutGrpRequestsOutGrmRequestsCmsgRqstDtlCmsgRqstDtlSts")
    protected String outGrpRequestsOutGrmRequestsCmsgRqstDtlCmsgRqstDtlSts;
    @XmlElement(name = "OutGrpRequestsOutGrmRequestsCmsgRqstDtlEmailSend")
    protected String outGrpRequestsOutGrmRequestsCmsgRqstDtlEmailSend;
    @XmlElement(name = "OutGrpRequestsOutGrmRequestsCmsgRqstDtlJustificationAll")
    protected String outGrpRequestsOutGrmRequestsCmsgRqstDtlJustificationAll;
    @XmlElement(name = "OutGrpRequestsOutGrmRequestsCmsgRqstDtlJustificationId")
    protected int outGrpRequestsOutGrmRequestsCmsgRqstDtlJustificationId;
    @XmlElement(name = "OutGrpRequestsOutGrmRequestsCmsgRqstDtlMessageComments")
    protected String outGrpRequestsOutGrmRequestsCmsgRqstDtlMessageComments;
    @XmlElement(name = "OutGrpRequestsOutGrmRequestsCmsgRqstDtlProductAll")
    protected String outGrpRequestsOutGrmRequestsCmsgRqstDtlProductAll;
    @XmlElement(name = "OutGrpRequestsOutGrmRequestsCmsgRqstDtlProductId")
    protected int outGrpRequestsOutGrmRequestsCmsgRqstDtlProductId;
    @XmlElement(name = "OutGrpRequestsOutGrmRequestsCmsgRqstDtlSmsSend")
    protected String outGrpRequestsOutGrmRequestsCmsgRqstDtlSmsSend;
    @XmlElement(name = "OutGrpRequestsOutGrmRequestsCmsgRqstDtlTransactionAll")
    protected String outGrpRequestsOutGrmRequestsCmsgRqstDtlTransactionAll;
    @XmlElement(name = "OutGrpRequestsOutGrmRequestsCmsgRqstDtlTransactionId")
    protected int outGrpRequestsOutGrmRequestsCmsgRqstDtlTransactionId;
    @XmlElement(name = "OutGrpRequestsOutGrmRequestsCmsgRqstDtlTrxAmountGreater")
    protected double outGrpRequestsOutGrmRequestsCmsgRqstDtlTrxAmountGreater;
    @XmlElement(name = "OutGrpRequestsOutGrmRequestsCmsgRqstDtlTrxAmountLess")
    protected double outGrpRequestsOutGrmRequestsCmsgRqstDtlTrxAmountLess;
    @XmlElement(name = "OutGrpRequestsOutGrmRequestsCmsgRqstDtlTrxAmountSet")
    protected String outGrpRequestsOutGrmRequestsCmsgRqstDtlTrxAmountSet;

    /**
     * Gets the value of the outGrpRequestsOutGrmProfitsAccountAccountCd property.
     * 
     */
    public short getOutGrpRequestsOutGrmProfitsAccountAccountCd() {
        return outGrpRequestsOutGrmProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outGrpRequestsOutGrmProfitsAccountAccountCd property.
     * 
     */
    public void setOutGrpRequestsOutGrmProfitsAccountAccountCd(short value) {
        this.outGrpRequestsOutGrmProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outGrpRequestsOutGrmProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRequestsOutGrmProfitsAccountAccountNumber() {
        return outGrpRequestsOutGrmProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outGrpRequestsOutGrmProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRequestsOutGrmProfitsAccountAccountNumber(String value) {
        this.outGrpRequestsOutGrmProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outGrpRequestsOutGrmProfitsAccountPrftSystem property.
     * 
     */
    public short getOutGrpRequestsOutGrmProfitsAccountPrftSystem() {
        return outGrpRequestsOutGrmProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the outGrpRequestsOutGrmProfitsAccountPrftSystem property.
     * 
     */
    public void setOutGrpRequestsOutGrmProfitsAccountPrftSystem(short value) {
        this.outGrpRequestsOutGrmProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlAccBalGreater property.
     * 
     */
    public double getOutGrpRequestsOutGrmRequestsCmsgRqstDtlAccBalGreater() {
        return outGrpRequestsOutGrmRequestsCmsgRqstDtlAccBalGreater;
    }

    /**
     * Sets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlAccBalGreater property.
     * 
     */
    public void setOutGrpRequestsOutGrmRequestsCmsgRqstDtlAccBalGreater(double value) {
        this.outGrpRequestsOutGrmRequestsCmsgRqstDtlAccBalGreater = value;
    }

    /**
     * Gets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlAccBalLess property.
     * 
     */
    public double getOutGrpRequestsOutGrmRequestsCmsgRqstDtlAccBalLess() {
        return outGrpRequestsOutGrmRequestsCmsgRqstDtlAccBalLess;
    }

    /**
     * Sets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlAccBalLess property.
     * 
     */
    public void setOutGrpRequestsOutGrmRequestsCmsgRqstDtlAccBalLess(double value) {
        this.outGrpRequestsOutGrmRequestsCmsgRqstDtlAccBalLess = value;
    }

    /**
     * Gets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlAccBalSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRequestsOutGrmRequestsCmsgRqstDtlAccBalSet() {
        return outGrpRequestsOutGrmRequestsCmsgRqstDtlAccBalSet;
    }

    /**
     * Sets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlAccBalSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRequestsOutGrmRequestsCmsgRqstDtlAccBalSet(String value) {
        this.outGrpRequestsOutGrmRequestsCmsgRqstDtlAccBalSet = value;
    }

    /**
     * Gets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRequestsOutGrmRequestsCmsgRqstDtlAccountNumber() {
        return outGrpRequestsOutGrmRequestsCmsgRqstDtlAccountNumber;
    }

    /**
     * Sets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRequestsOutGrmRequestsCmsgRqstDtlAccountNumber(String value) {
        this.outGrpRequestsOutGrmRequestsCmsgRqstDtlAccountNumber = value;
    }

    /**
     * Gets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlAccountSystem property.
     * 
     */
    public short getOutGrpRequestsOutGrmRequestsCmsgRqstDtlAccountSystem() {
        return outGrpRequestsOutGrmRequestsCmsgRqstDtlAccountSystem;
    }

    /**
     * Sets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlAccountSystem property.
     * 
     */
    public void setOutGrpRequestsOutGrmRequestsCmsgRqstDtlAccountSystem(short value) {
        this.outGrpRequestsOutGrmRequestsCmsgRqstDtlAccountSystem = value;
    }

    /**
     * Gets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlAccountsAll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRequestsOutGrmRequestsCmsgRqstDtlAccountsAll() {
        return outGrpRequestsOutGrmRequestsCmsgRqstDtlAccountsAll;
    }

    /**
     * Sets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlAccountsAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRequestsOutGrmRequestsCmsgRqstDtlAccountsAll(String value) {
        this.outGrpRequestsOutGrmRequestsCmsgRqstDtlAccountsAll = value;
    }

    /**
     * Gets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlChannelId property.
     * 
     */
    public int getOutGrpRequestsOutGrmRequestsCmsgRqstDtlChannelId() {
        return outGrpRequestsOutGrmRequestsCmsgRqstDtlChannelId;
    }

    /**
     * Sets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlChannelId property.
     * 
     */
    public void setOutGrpRequestsOutGrmRequestsCmsgRqstDtlChannelId(int value) {
        this.outGrpRequestsOutGrmRequestsCmsgRqstDtlChannelId = value;
    }

    /**
     * Gets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlChannelsAll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRequestsOutGrmRequestsCmsgRqstDtlChannelsAll() {
        return outGrpRequestsOutGrmRequestsCmsgRqstDtlChannelsAll;
    }

    /**
     * Sets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlChannelsAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRequestsOutGrmRequestsCmsgRqstDtlChannelsAll(String value) {
        this.outGrpRequestsOutGrmRequestsCmsgRqstDtlChannelsAll = value;
    }

    /**
     * Gets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlCmsgRqstDtlSn property.
     * 
     */
    public int getOutGrpRequestsOutGrmRequestsCmsgRqstDtlCmsgRqstDtlSn() {
        return outGrpRequestsOutGrmRequestsCmsgRqstDtlCmsgRqstDtlSn;
    }

    /**
     * Sets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlCmsgRqstDtlSn property.
     * 
     */
    public void setOutGrpRequestsOutGrmRequestsCmsgRqstDtlCmsgRqstDtlSn(int value) {
        this.outGrpRequestsOutGrmRequestsCmsgRqstDtlCmsgRqstDtlSn = value;
    }

    /**
     * Gets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlCmsgRqstDtlSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRequestsOutGrmRequestsCmsgRqstDtlCmsgRqstDtlSts() {
        return outGrpRequestsOutGrmRequestsCmsgRqstDtlCmsgRqstDtlSts;
    }

    /**
     * Sets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlCmsgRqstDtlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRequestsOutGrmRequestsCmsgRqstDtlCmsgRqstDtlSts(String value) {
        this.outGrpRequestsOutGrmRequestsCmsgRqstDtlCmsgRqstDtlSts = value;
    }

    /**
     * Gets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlEmailSend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRequestsOutGrmRequestsCmsgRqstDtlEmailSend() {
        return outGrpRequestsOutGrmRequestsCmsgRqstDtlEmailSend;
    }

    /**
     * Sets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlEmailSend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRequestsOutGrmRequestsCmsgRqstDtlEmailSend(String value) {
        this.outGrpRequestsOutGrmRequestsCmsgRqstDtlEmailSend = value;
    }

    /**
     * Gets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlJustificationAll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRequestsOutGrmRequestsCmsgRqstDtlJustificationAll() {
        return outGrpRequestsOutGrmRequestsCmsgRqstDtlJustificationAll;
    }

    /**
     * Sets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlJustificationAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRequestsOutGrmRequestsCmsgRqstDtlJustificationAll(String value) {
        this.outGrpRequestsOutGrmRequestsCmsgRqstDtlJustificationAll = value;
    }

    /**
     * Gets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlJustificationId property.
     * 
     */
    public int getOutGrpRequestsOutGrmRequestsCmsgRqstDtlJustificationId() {
        return outGrpRequestsOutGrmRequestsCmsgRqstDtlJustificationId;
    }

    /**
     * Sets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlJustificationId property.
     * 
     */
    public void setOutGrpRequestsOutGrmRequestsCmsgRqstDtlJustificationId(int value) {
        this.outGrpRequestsOutGrmRequestsCmsgRqstDtlJustificationId = value;
    }

    /**
     * Gets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlMessageComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRequestsOutGrmRequestsCmsgRqstDtlMessageComments() {
        return outGrpRequestsOutGrmRequestsCmsgRqstDtlMessageComments;
    }

    /**
     * Sets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlMessageComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRequestsOutGrmRequestsCmsgRqstDtlMessageComments(String value) {
        this.outGrpRequestsOutGrmRequestsCmsgRqstDtlMessageComments = value;
    }

    /**
     * Gets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlProductAll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRequestsOutGrmRequestsCmsgRqstDtlProductAll() {
        return outGrpRequestsOutGrmRequestsCmsgRqstDtlProductAll;
    }

    /**
     * Sets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlProductAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRequestsOutGrmRequestsCmsgRqstDtlProductAll(String value) {
        this.outGrpRequestsOutGrmRequestsCmsgRqstDtlProductAll = value;
    }

    /**
     * Gets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlProductId property.
     * 
     */
    public int getOutGrpRequestsOutGrmRequestsCmsgRqstDtlProductId() {
        return outGrpRequestsOutGrmRequestsCmsgRqstDtlProductId;
    }

    /**
     * Sets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlProductId property.
     * 
     */
    public void setOutGrpRequestsOutGrmRequestsCmsgRqstDtlProductId(int value) {
        this.outGrpRequestsOutGrmRequestsCmsgRqstDtlProductId = value;
    }

    /**
     * Gets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlSmsSend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRequestsOutGrmRequestsCmsgRqstDtlSmsSend() {
        return outGrpRequestsOutGrmRequestsCmsgRqstDtlSmsSend;
    }

    /**
     * Sets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlSmsSend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRequestsOutGrmRequestsCmsgRqstDtlSmsSend(String value) {
        this.outGrpRequestsOutGrmRequestsCmsgRqstDtlSmsSend = value;
    }

    /**
     * Gets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlTransactionAll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRequestsOutGrmRequestsCmsgRqstDtlTransactionAll() {
        return outGrpRequestsOutGrmRequestsCmsgRqstDtlTransactionAll;
    }

    /**
     * Sets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlTransactionAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRequestsOutGrmRequestsCmsgRqstDtlTransactionAll(String value) {
        this.outGrpRequestsOutGrmRequestsCmsgRqstDtlTransactionAll = value;
    }

    /**
     * Gets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlTransactionId property.
     * 
     */
    public int getOutGrpRequestsOutGrmRequestsCmsgRqstDtlTransactionId() {
        return outGrpRequestsOutGrmRequestsCmsgRqstDtlTransactionId;
    }

    /**
     * Sets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlTransactionId property.
     * 
     */
    public void setOutGrpRequestsOutGrmRequestsCmsgRqstDtlTransactionId(int value) {
        this.outGrpRequestsOutGrmRequestsCmsgRqstDtlTransactionId = value;
    }

    /**
     * Gets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlTrxAmountGreater property.
     * 
     */
    public double getOutGrpRequestsOutGrmRequestsCmsgRqstDtlTrxAmountGreater() {
        return outGrpRequestsOutGrmRequestsCmsgRqstDtlTrxAmountGreater;
    }

    /**
     * Sets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlTrxAmountGreater property.
     * 
     */
    public void setOutGrpRequestsOutGrmRequestsCmsgRqstDtlTrxAmountGreater(double value) {
        this.outGrpRequestsOutGrmRequestsCmsgRqstDtlTrxAmountGreater = value;
    }

    /**
     * Gets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlTrxAmountLess property.
     * 
     */
    public double getOutGrpRequestsOutGrmRequestsCmsgRqstDtlTrxAmountLess() {
        return outGrpRequestsOutGrmRequestsCmsgRqstDtlTrxAmountLess;
    }

    /**
     * Sets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlTrxAmountLess property.
     * 
     */
    public void setOutGrpRequestsOutGrmRequestsCmsgRqstDtlTrxAmountLess(double value) {
        this.outGrpRequestsOutGrmRequestsCmsgRqstDtlTrxAmountLess = value;
    }

    /**
     * Gets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlTrxAmountSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRequestsOutGrmRequestsCmsgRqstDtlTrxAmountSet() {
        return outGrpRequestsOutGrmRequestsCmsgRqstDtlTrxAmountSet;
    }

    /**
     * Sets the value of the outGrpRequestsOutGrmRequestsCmsgRqstDtlTrxAmountSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRequestsOutGrmRequestsCmsgRqstDtlTrxAmountSet(String value) {
        this.outGrpRequestsOutGrmRequestsCmsgRqstDtlTrxAmountSet = value;
    }

}
