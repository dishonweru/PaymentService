
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CMS3605VOutGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CMS3605VOutGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpOutGrmCardCmsCardCardExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmCardCmsCardCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmCardCmsCardCardSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmCustCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmCustCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmExtraitCmsCardExtraitAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmExtraitCmsCardExtraitAccountCdTo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmExtraitCmsCardExtraitAccountNumTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmExtraitCmsCardExtraitAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmExtraitCmsCardExtraitAtmDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmExtraitCmsCardExtraitAtmTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmExtraitCmsCardExtraitCardSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmExtraitCmsCardExtraitCmsExtraitSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmExtraitCmsCardExtraitCrInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmExtraitCmsCardExtraitDbInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmExtraitCmsCardExtraitIsoRefNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmExtraitCmsCardExtraitMtiCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmExtraitCmsCardExtraitPrftSysTo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmExtraitCmsCardExtraitPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmExtraitCmsCardExtraitProcessCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmExtraitCmsCardExtraitTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmExtraitCmsCardExtraitTransactionAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmExtraitCmsCardExtraitTunDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmExtraitCmsCardExtraitTunUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmExtraitCmsCardExtraitTunUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmExtraitCmsCardExtraitTunUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmMoveaccSystemCharSuppliedChar25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmTrnsfSystemCharSuppliedChar20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmProcessDescrGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmExtraitCmsCardExtraitAuditNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CMS3605VOutGrpItem", propOrder = {
    "outGrpOutGrmCardCmsCardCardExpiryDate",
    "outGrpOutGrmCardCmsCardCardNumber",
    "outGrpOutGrmCardCmsCardCardSn",
    "outGrpOutGrmCustCustomerCDigit",
    "outGrpOutGrmCustCustomerCustId",
    "outGrpOutGrmExtraitCmsCardExtraitAccountCd",
    "outGrpOutGrmExtraitCmsCardExtraitAccountCdTo",
    "outGrpOutGrmExtraitCmsCardExtraitAccountNumTo",
    "outGrpOutGrmExtraitCmsCardExtraitAccountNumber",
    "outGrpOutGrmExtraitCmsCardExtraitAtmDate",
    "outGrpOutGrmExtraitCmsCardExtraitAtmTime",
    "outGrpOutGrmExtraitCmsCardExtraitCardSn",
    "outGrpOutGrmExtraitCmsCardExtraitCmsExtraitSn",
    "outGrpOutGrmExtraitCmsCardExtraitCrInd",
    "outGrpOutGrmExtraitCmsCardExtraitDbInd",
    "outGrpOutGrmExtraitCmsCardExtraitIsoRefNum",
    "outGrpOutGrmExtraitCmsCardExtraitMtiCode",
    "outGrpOutGrmExtraitCmsCardExtraitPrftSysTo",
    "outGrpOutGrmExtraitCmsCardExtraitPrftSystem",
    "outGrpOutGrmExtraitCmsCardExtraitProcessCd",
    "outGrpOutGrmExtraitCmsCardExtraitTmstamp",
    "outGrpOutGrmExtraitCmsCardExtraitTransactionAmnt",
    "outGrpOutGrmExtraitCmsCardExtraitTunDate",
    "outGrpOutGrmExtraitCmsCardExtraitTunUnit",
    "outGrpOutGrmExtraitCmsCardExtraitTunUser",
    "outGrpOutGrmExtraitCmsCardExtraitTunUsrSn",
    "outGrpOutGrmMoveaccSystemCharSuppliedChar25",
    "outGrpOutGrmTrnsfSystemCharSuppliedChar20",
    "outGrpOutGrmProcessDescrGenericDetailDescription",
    "outGrpOutGrmExtraitCmsCardExtraitAuditNumber"
})
public class CMS3605VOutGrpItem {

    @XmlElement(name = "OutGrpOutGrmCardCmsCardCardExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmCardCmsCardCardExpiryDate;
    @XmlElement(name = "OutGrpOutGrmCardCmsCardCardNumber")
    protected String outGrpOutGrmCardCmsCardCardNumber;
    @XmlElement(name = "OutGrpOutGrmCardCmsCardCardSn")
    protected double outGrpOutGrmCardCmsCardCardSn;
    @XmlElement(name = "OutGrpOutGrmCustCustomerCDigit")
    protected short outGrpOutGrmCustCustomerCDigit;
    @XmlElement(name = "OutGrpOutGrmCustCustomerCustId")
    protected int outGrpOutGrmCustCustomerCustId;
    @XmlElement(name = "OutGrpOutGrmExtraitCmsCardExtraitAccountCd")
    protected short outGrpOutGrmExtraitCmsCardExtraitAccountCd;
    @XmlElement(name = "OutGrpOutGrmExtraitCmsCardExtraitAccountCdTo")
    protected short outGrpOutGrmExtraitCmsCardExtraitAccountCdTo;
    @XmlElement(name = "OutGrpOutGrmExtraitCmsCardExtraitAccountNumTo")
    protected String outGrpOutGrmExtraitCmsCardExtraitAccountNumTo;
    @XmlElement(name = "OutGrpOutGrmExtraitCmsCardExtraitAccountNumber")
    protected String outGrpOutGrmExtraitCmsCardExtraitAccountNumber;
    @XmlElement(name = "OutGrpOutGrmExtraitCmsCardExtraitAtmDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmExtraitCmsCardExtraitAtmDate;
    @XmlElement(name = "OutGrpOutGrmExtraitCmsCardExtraitAtmTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmExtraitCmsCardExtraitAtmTime;
    @XmlElement(name = "OutGrpOutGrmExtraitCmsCardExtraitCardSn")
    protected double outGrpOutGrmExtraitCmsCardExtraitCardSn;
    @XmlElement(name = "OutGrpOutGrmExtraitCmsCardExtraitCmsExtraitSn")
    protected double outGrpOutGrmExtraitCmsCardExtraitCmsExtraitSn;
    @XmlElement(name = "OutGrpOutGrmExtraitCmsCardExtraitCrInd")
    protected String outGrpOutGrmExtraitCmsCardExtraitCrInd;
    @XmlElement(name = "OutGrpOutGrmExtraitCmsCardExtraitDbInd")
    protected String outGrpOutGrmExtraitCmsCardExtraitDbInd;
    @XmlElement(name = "OutGrpOutGrmExtraitCmsCardExtraitIsoRefNum")
    protected String outGrpOutGrmExtraitCmsCardExtraitIsoRefNum;
    @XmlElement(name = "OutGrpOutGrmExtraitCmsCardExtraitMtiCode")
    protected String outGrpOutGrmExtraitCmsCardExtraitMtiCode;
    @XmlElement(name = "OutGrpOutGrmExtraitCmsCardExtraitPrftSysTo")
    protected short outGrpOutGrmExtraitCmsCardExtraitPrftSysTo;
    @XmlElement(name = "OutGrpOutGrmExtraitCmsCardExtraitPrftSystem")
    protected short outGrpOutGrmExtraitCmsCardExtraitPrftSystem;
    @XmlElement(name = "OutGrpOutGrmExtraitCmsCardExtraitProcessCd")
    protected String outGrpOutGrmExtraitCmsCardExtraitProcessCd;
    @XmlElement(name = "OutGrpOutGrmExtraitCmsCardExtraitTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmExtraitCmsCardExtraitTmstamp;
    @XmlElement(name = "OutGrpOutGrmExtraitCmsCardExtraitTransactionAmnt", required = true)
    protected BigDecimal outGrpOutGrmExtraitCmsCardExtraitTransactionAmnt;
    @XmlElement(name = "OutGrpOutGrmExtraitCmsCardExtraitTunDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmExtraitCmsCardExtraitTunDate;
    @XmlElement(name = "OutGrpOutGrmExtraitCmsCardExtraitTunUnit")
    protected int outGrpOutGrmExtraitCmsCardExtraitTunUnit;
    @XmlElement(name = "OutGrpOutGrmExtraitCmsCardExtraitTunUser")
    protected String outGrpOutGrmExtraitCmsCardExtraitTunUser;
    @XmlElement(name = "OutGrpOutGrmExtraitCmsCardExtraitTunUsrSn")
    protected int outGrpOutGrmExtraitCmsCardExtraitTunUsrSn;
    @XmlElement(name = "OutGrpOutGrmMoveaccSystemCharSuppliedChar25")
    protected String outGrpOutGrmMoveaccSystemCharSuppliedChar25;
    @XmlElement(name = "OutGrpOutGrmTrnsfSystemCharSuppliedChar20")
    protected String outGrpOutGrmTrnsfSystemCharSuppliedChar20;
    @XmlElement(name = "OutGrpOutGrmProcessDescrGenericDetailDescription")
    protected String outGrpOutGrmProcessDescrGenericDetailDescription;
    @XmlElement(name = "OutGrpOutGrmExtraitCmsCardExtraitAuditNumber")
    protected int outGrpOutGrmExtraitCmsCardExtraitAuditNumber;

    /**
     * Gets the value of the outGrpOutGrmCardCmsCardCardExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmCardCmsCardCardExpiryDate() {
        return outGrpOutGrmCardCmsCardCardExpiryDate;
    }

    /**
     * Sets the value of the outGrpOutGrmCardCmsCardCardExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmCardCmsCardCardExpiryDate(XMLGregorianCalendar value) {
        this.outGrpOutGrmCardCmsCardCardExpiryDate = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCardCmsCardCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmCardCmsCardCardNumber() {
        return outGrpOutGrmCardCmsCardCardNumber;
    }

    /**
     * Sets the value of the outGrpOutGrmCardCmsCardCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmCardCmsCardCardNumber(String value) {
        this.outGrpOutGrmCardCmsCardCardNumber = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCardCmsCardCardSn property.
     * 
     */
    public double getOutGrpOutGrmCardCmsCardCardSn() {
        return outGrpOutGrmCardCmsCardCardSn;
    }

    /**
     * Sets the value of the outGrpOutGrmCardCmsCardCardSn property.
     * 
     */
    public void setOutGrpOutGrmCardCmsCardCardSn(double value) {
        this.outGrpOutGrmCardCmsCardCardSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCustCustomerCDigit property.
     * 
     */
    public short getOutGrpOutGrmCustCustomerCDigit() {
        return outGrpOutGrmCustCustomerCDigit;
    }

    /**
     * Sets the value of the outGrpOutGrmCustCustomerCDigit property.
     * 
     */
    public void setOutGrpOutGrmCustCustomerCDigit(short value) {
        this.outGrpOutGrmCustCustomerCDigit = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCustCustomerCustId property.
     * 
     */
    public int getOutGrpOutGrmCustCustomerCustId() {
        return outGrpOutGrmCustCustomerCustId;
    }

    /**
     * Sets the value of the outGrpOutGrmCustCustomerCustId property.
     * 
     */
    public void setOutGrpOutGrmCustCustomerCustId(int value) {
        this.outGrpOutGrmCustCustomerCustId = value;
    }

    /**
     * Gets the value of the outGrpOutGrmExtraitCmsCardExtraitAccountCd property.
     * 
     */
    public short getOutGrpOutGrmExtraitCmsCardExtraitAccountCd() {
        return outGrpOutGrmExtraitCmsCardExtraitAccountCd;
    }

    /**
     * Sets the value of the outGrpOutGrmExtraitCmsCardExtraitAccountCd property.
     * 
     */
    public void setOutGrpOutGrmExtraitCmsCardExtraitAccountCd(short value) {
        this.outGrpOutGrmExtraitCmsCardExtraitAccountCd = value;
    }

    /**
     * Gets the value of the outGrpOutGrmExtraitCmsCardExtraitAccountCdTo property.
     * 
     */
    public short getOutGrpOutGrmExtraitCmsCardExtraitAccountCdTo() {
        return outGrpOutGrmExtraitCmsCardExtraitAccountCdTo;
    }

    /**
     * Sets the value of the outGrpOutGrmExtraitCmsCardExtraitAccountCdTo property.
     * 
     */
    public void setOutGrpOutGrmExtraitCmsCardExtraitAccountCdTo(short value) {
        this.outGrpOutGrmExtraitCmsCardExtraitAccountCdTo = value;
    }

    /**
     * Gets the value of the outGrpOutGrmExtraitCmsCardExtraitAccountNumTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmExtraitCmsCardExtraitAccountNumTo() {
        return outGrpOutGrmExtraitCmsCardExtraitAccountNumTo;
    }

    /**
     * Sets the value of the outGrpOutGrmExtraitCmsCardExtraitAccountNumTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmExtraitCmsCardExtraitAccountNumTo(String value) {
        this.outGrpOutGrmExtraitCmsCardExtraitAccountNumTo = value;
    }

    /**
     * Gets the value of the outGrpOutGrmExtraitCmsCardExtraitAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmExtraitCmsCardExtraitAccountNumber() {
        return outGrpOutGrmExtraitCmsCardExtraitAccountNumber;
    }

    /**
     * Sets the value of the outGrpOutGrmExtraitCmsCardExtraitAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmExtraitCmsCardExtraitAccountNumber(String value) {
        this.outGrpOutGrmExtraitCmsCardExtraitAccountNumber = value;
    }

    /**
     * Gets the value of the outGrpOutGrmExtraitCmsCardExtraitAtmDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmExtraitCmsCardExtraitAtmDate() {
        return outGrpOutGrmExtraitCmsCardExtraitAtmDate;
    }

    /**
     * Sets the value of the outGrpOutGrmExtraitCmsCardExtraitAtmDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmExtraitCmsCardExtraitAtmDate(XMLGregorianCalendar value) {
        this.outGrpOutGrmExtraitCmsCardExtraitAtmDate = value;
    }

    /**
     * Gets the value of the outGrpOutGrmExtraitCmsCardExtraitAtmTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmExtraitCmsCardExtraitAtmTime() {
        return outGrpOutGrmExtraitCmsCardExtraitAtmTime;
    }

    /**
     * Sets the value of the outGrpOutGrmExtraitCmsCardExtraitAtmTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmExtraitCmsCardExtraitAtmTime(XMLGregorianCalendar value) {
        this.outGrpOutGrmExtraitCmsCardExtraitAtmTime = value;
    }

    /**
     * Gets the value of the outGrpOutGrmExtraitCmsCardExtraitCardSn property.
     * 
     */
    public double getOutGrpOutGrmExtraitCmsCardExtraitCardSn() {
        return outGrpOutGrmExtraitCmsCardExtraitCardSn;
    }

    /**
     * Sets the value of the outGrpOutGrmExtraitCmsCardExtraitCardSn property.
     * 
     */
    public void setOutGrpOutGrmExtraitCmsCardExtraitCardSn(double value) {
        this.outGrpOutGrmExtraitCmsCardExtraitCardSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmExtraitCmsCardExtraitCmsExtraitSn property.
     * 
     */
    public double getOutGrpOutGrmExtraitCmsCardExtraitCmsExtraitSn() {
        return outGrpOutGrmExtraitCmsCardExtraitCmsExtraitSn;
    }

    /**
     * Sets the value of the outGrpOutGrmExtraitCmsCardExtraitCmsExtraitSn property.
     * 
     */
    public void setOutGrpOutGrmExtraitCmsCardExtraitCmsExtraitSn(double value) {
        this.outGrpOutGrmExtraitCmsCardExtraitCmsExtraitSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmExtraitCmsCardExtraitCrInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmExtraitCmsCardExtraitCrInd() {
        return outGrpOutGrmExtraitCmsCardExtraitCrInd;
    }

    /**
     * Sets the value of the outGrpOutGrmExtraitCmsCardExtraitCrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmExtraitCmsCardExtraitCrInd(String value) {
        this.outGrpOutGrmExtraitCmsCardExtraitCrInd = value;
    }

    /**
     * Gets the value of the outGrpOutGrmExtraitCmsCardExtraitDbInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmExtraitCmsCardExtraitDbInd() {
        return outGrpOutGrmExtraitCmsCardExtraitDbInd;
    }

    /**
     * Sets the value of the outGrpOutGrmExtraitCmsCardExtraitDbInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmExtraitCmsCardExtraitDbInd(String value) {
        this.outGrpOutGrmExtraitCmsCardExtraitDbInd = value;
    }

    /**
     * Gets the value of the outGrpOutGrmExtraitCmsCardExtraitIsoRefNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmExtraitCmsCardExtraitIsoRefNum() {
        return outGrpOutGrmExtraitCmsCardExtraitIsoRefNum;
    }

    /**
     * Sets the value of the outGrpOutGrmExtraitCmsCardExtraitIsoRefNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmExtraitCmsCardExtraitIsoRefNum(String value) {
        this.outGrpOutGrmExtraitCmsCardExtraitIsoRefNum = value;
    }

    /**
     * Gets the value of the outGrpOutGrmExtraitCmsCardExtraitMtiCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmExtraitCmsCardExtraitMtiCode() {
        return outGrpOutGrmExtraitCmsCardExtraitMtiCode;
    }

    /**
     * Sets the value of the outGrpOutGrmExtraitCmsCardExtraitMtiCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmExtraitCmsCardExtraitMtiCode(String value) {
        this.outGrpOutGrmExtraitCmsCardExtraitMtiCode = value;
    }

    /**
     * Gets the value of the outGrpOutGrmExtraitCmsCardExtraitPrftSysTo property.
     * 
     */
    public short getOutGrpOutGrmExtraitCmsCardExtraitPrftSysTo() {
        return outGrpOutGrmExtraitCmsCardExtraitPrftSysTo;
    }

    /**
     * Sets the value of the outGrpOutGrmExtraitCmsCardExtraitPrftSysTo property.
     * 
     */
    public void setOutGrpOutGrmExtraitCmsCardExtraitPrftSysTo(short value) {
        this.outGrpOutGrmExtraitCmsCardExtraitPrftSysTo = value;
    }

    /**
     * Gets the value of the outGrpOutGrmExtraitCmsCardExtraitPrftSystem property.
     * 
     */
    public short getOutGrpOutGrmExtraitCmsCardExtraitPrftSystem() {
        return outGrpOutGrmExtraitCmsCardExtraitPrftSystem;
    }

    /**
     * Sets the value of the outGrpOutGrmExtraitCmsCardExtraitPrftSystem property.
     * 
     */
    public void setOutGrpOutGrmExtraitCmsCardExtraitPrftSystem(short value) {
        this.outGrpOutGrmExtraitCmsCardExtraitPrftSystem = value;
    }

    /**
     * Gets the value of the outGrpOutGrmExtraitCmsCardExtraitProcessCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmExtraitCmsCardExtraitProcessCd() {
        return outGrpOutGrmExtraitCmsCardExtraitProcessCd;
    }

    /**
     * Sets the value of the outGrpOutGrmExtraitCmsCardExtraitProcessCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmExtraitCmsCardExtraitProcessCd(String value) {
        this.outGrpOutGrmExtraitCmsCardExtraitProcessCd = value;
    }

    /**
     * Gets the value of the outGrpOutGrmExtraitCmsCardExtraitTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmExtraitCmsCardExtraitTmstamp() {
        return outGrpOutGrmExtraitCmsCardExtraitTmstamp;
    }

    /**
     * Sets the value of the outGrpOutGrmExtraitCmsCardExtraitTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmExtraitCmsCardExtraitTmstamp(XMLGregorianCalendar value) {
        this.outGrpOutGrmExtraitCmsCardExtraitTmstamp = value;
    }

    /**
     * Gets the value of the outGrpOutGrmExtraitCmsCardExtraitTransactionAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmExtraitCmsCardExtraitTransactionAmnt() {
        return outGrpOutGrmExtraitCmsCardExtraitTransactionAmnt;
    }

    /**
     * Sets the value of the outGrpOutGrmExtraitCmsCardExtraitTransactionAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmExtraitCmsCardExtraitTransactionAmnt(BigDecimal value) {
        this.outGrpOutGrmExtraitCmsCardExtraitTransactionAmnt = value;
    }

    /**
     * Gets the value of the outGrpOutGrmExtraitCmsCardExtraitTunDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmExtraitCmsCardExtraitTunDate() {
        return outGrpOutGrmExtraitCmsCardExtraitTunDate;
    }

    /**
     * Sets the value of the outGrpOutGrmExtraitCmsCardExtraitTunDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmExtraitCmsCardExtraitTunDate(XMLGregorianCalendar value) {
        this.outGrpOutGrmExtraitCmsCardExtraitTunDate = value;
    }

    /**
     * Gets the value of the outGrpOutGrmExtraitCmsCardExtraitTunUnit property.
     * 
     */
    public int getOutGrpOutGrmExtraitCmsCardExtraitTunUnit() {
        return outGrpOutGrmExtraitCmsCardExtraitTunUnit;
    }

    /**
     * Sets the value of the outGrpOutGrmExtraitCmsCardExtraitTunUnit property.
     * 
     */
    public void setOutGrpOutGrmExtraitCmsCardExtraitTunUnit(int value) {
        this.outGrpOutGrmExtraitCmsCardExtraitTunUnit = value;
    }

    /**
     * Gets the value of the outGrpOutGrmExtraitCmsCardExtraitTunUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmExtraitCmsCardExtraitTunUser() {
        return outGrpOutGrmExtraitCmsCardExtraitTunUser;
    }

    /**
     * Sets the value of the outGrpOutGrmExtraitCmsCardExtraitTunUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmExtraitCmsCardExtraitTunUser(String value) {
        this.outGrpOutGrmExtraitCmsCardExtraitTunUser = value;
    }

    /**
     * Gets the value of the outGrpOutGrmExtraitCmsCardExtraitTunUsrSn property.
     * 
     */
    public int getOutGrpOutGrmExtraitCmsCardExtraitTunUsrSn() {
        return outGrpOutGrmExtraitCmsCardExtraitTunUsrSn;
    }

    /**
     * Sets the value of the outGrpOutGrmExtraitCmsCardExtraitTunUsrSn property.
     * 
     */
    public void setOutGrpOutGrmExtraitCmsCardExtraitTunUsrSn(int value) {
        this.outGrpOutGrmExtraitCmsCardExtraitTunUsrSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmMoveaccSystemCharSuppliedChar25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmMoveaccSystemCharSuppliedChar25() {
        return outGrpOutGrmMoveaccSystemCharSuppliedChar25;
    }

    /**
     * Sets the value of the outGrpOutGrmMoveaccSystemCharSuppliedChar25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmMoveaccSystemCharSuppliedChar25(String value) {
        this.outGrpOutGrmMoveaccSystemCharSuppliedChar25 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTrnsfSystemCharSuppliedChar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmTrnsfSystemCharSuppliedChar20() {
        return outGrpOutGrmTrnsfSystemCharSuppliedChar20;
    }

    /**
     * Sets the value of the outGrpOutGrmTrnsfSystemCharSuppliedChar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmTrnsfSystemCharSuppliedChar20(String value) {
        this.outGrpOutGrmTrnsfSystemCharSuppliedChar20 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmProcessDescrGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmProcessDescrGenericDetailDescription() {
        return outGrpOutGrmProcessDescrGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpOutGrmProcessDescrGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmProcessDescrGenericDetailDescription(String value) {
        this.outGrpOutGrmProcessDescrGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpOutGrmExtraitCmsCardExtraitAuditNumber property.
     * 
     */
    public int getOutGrpOutGrmExtraitCmsCardExtraitAuditNumber() {
        return outGrpOutGrmExtraitCmsCardExtraitAuditNumber;
    }

    /**
     * Sets the value of the outGrpOutGrmExtraitCmsCardExtraitAuditNumber property.
     * 
     */
    public void setOutGrpOutGrmExtraitCmsCardExtraitAuditNumber(int value) {
        this.outGrpOutGrmExtraitCmsCardExtraitAuditNumber = value;
    }

}
