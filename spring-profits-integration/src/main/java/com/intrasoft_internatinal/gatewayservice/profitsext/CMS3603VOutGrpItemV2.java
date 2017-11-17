
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CMS3603VOutGrpItem_V2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CMS3603VOutGrpItem_V2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpOutGrmApplStatusCharSuppliedChar25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmCardApplCmsCardApplApplicationSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmCardApplCmsCardApplCardNameLatin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmCardApplCmsCardApplCardSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmCardApplCmsCardApplCardSurnameLatin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmCardApplCmsCardApplCreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmCardApplCmsCardApplCreationUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmCardApplCmsCardApplCreationUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmCardApplCmsCardApplExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmCardApplCmsCardApplFinalizationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmCardApplCmsCardApplTunAprvDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmCardApplCmsCardApplTunAprvUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmCardApplCmsCardApplTunAprvUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmCardApplCmsCardApplTunAprvUsrInSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmCardApplCmsCardApplTunAprvUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmCardApplCmsCardApplTunDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmCardApplCmsCardApplTunUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmCardApplCmsCardApplTunUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmCardApplCmsCardApplTunUsrIntSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmCardApplCmsCardApplTunUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmCardTypeCharSuppliedChar20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmCustCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmCustCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmDeliveryTypeCharSuppliedChar20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmPrftAccProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmPrftAccProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmPrftSystemCharSuppliedChar20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmCustCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmCustCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmCustCustomerTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmCmsOrdInventoryPan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmCmsCardRejectionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CMS3603VOutGrpItem_V2", propOrder = {
    "outGrpOutGrmApplStatusCharSuppliedChar25",
    "outGrpOutGrmCardApplCmsCardApplApplicationSn",
    "outGrpOutGrmCardApplCmsCardApplCardNameLatin",
    "outGrpOutGrmCardApplCmsCardApplCardSn",
    "outGrpOutGrmCardApplCmsCardApplCardSurnameLatin",
    "outGrpOutGrmCardApplCmsCardApplCreationDate",
    "outGrpOutGrmCardApplCmsCardApplCreationUnit",
    "outGrpOutGrmCardApplCmsCardApplCreationUser",
    "outGrpOutGrmCardApplCmsCardApplExpiryDate",
    "outGrpOutGrmCardApplCmsCardApplFinalizationDate",
    "outGrpOutGrmCardApplCmsCardApplTunAprvDate",
    "outGrpOutGrmCardApplCmsCardApplTunAprvUnit",
    "outGrpOutGrmCardApplCmsCardApplTunAprvUsr",
    "outGrpOutGrmCardApplCmsCardApplTunAprvUsrInSn",
    "outGrpOutGrmCardApplCmsCardApplTunAprvUsrSn",
    "outGrpOutGrmCardApplCmsCardApplTunDate",
    "outGrpOutGrmCardApplCmsCardApplTunUnit",
    "outGrpOutGrmCardApplCmsCardApplTunUsr",
    "outGrpOutGrmCardApplCmsCardApplTunUsrIntSn",
    "outGrpOutGrmCardApplCmsCardApplTunUsrSn",
    "outGrpOutGrmCardTypeCharSuppliedChar20",
    "outGrpOutGrmCustCustomerCDigit",
    "outGrpOutGrmCustCustomerCustId",
    "outGrpOutGrmDeliveryTypeCharSuppliedChar20",
    "outGrpOutGrmPrftAccProfitsAccountAccountCd",
    "outGrpOutGrmPrftAccProfitsAccountAccountNumber",
    "outGrpOutGrmPrftSystemCharSuppliedChar20",
    "outGrpOutGrmCustCustomerFirstName",
    "outGrpOutGrmCustCustomerSurname",
    "outGrpOutGrmCustCustomerTitle",
    "outGrpOutGrmCmsOrdInventoryPan",
    "outGrpOutGrmCmsCardRejectionReason"
})
public class CMS3603VOutGrpItemV2 {

    @XmlElement(name = "OutGrpOutGrmApplStatusCharSuppliedChar25")
    protected String outGrpOutGrmApplStatusCharSuppliedChar25;
    @XmlElement(name = "OutGrpOutGrmCardApplCmsCardApplApplicationSn")
    protected double outGrpOutGrmCardApplCmsCardApplApplicationSn;
    @XmlElement(name = "OutGrpOutGrmCardApplCmsCardApplCardNameLatin")
    protected String outGrpOutGrmCardApplCmsCardApplCardNameLatin;
    @XmlElement(name = "OutGrpOutGrmCardApplCmsCardApplCardSn")
    protected double outGrpOutGrmCardApplCmsCardApplCardSn;
    @XmlElement(name = "OutGrpOutGrmCardApplCmsCardApplCardSurnameLatin")
    protected String outGrpOutGrmCardApplCmsCardApplCardSurnameLatin;
    @XmlElement(name = "OutGrpOutGrmCardApplCmsCardApplCreationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmCardApplCmsCardApplCreationDate;
    @XmlElement(name = "OutGrpOutGrmCardApplCmsCardApplCreationUnit")
    protected int outGrpOutGrmCardApplCmsCardApplCreationUnit;
    @XmlElement(name = "OutGrpOutGrmCardApplCmsCardApplCreationUser")
    protected String outGrpOutGrmCardApplCmsCardApplCreationUser;
    @XmlElement(name = "OutGrpOutGrmCardApplCmsCardApplExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmCardApplCmsCardApplExpiryDate;
    @XmlElement(name = "OutGrpOutGrmCardApplCmsCardApplFinalizationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmCardApplCmsCardApplFinalizationDate;
    @XmlElement(name = "OutGrpOutGrmCardApplCmsCardApplTunAprvDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmCardApplCmsCardApplTunAprvDate;
    @XmlElement(name = "OutGrpOutGrmCardApplCmsCardApplTunAprvUnit")
    protected int outGrpOutGrmCardApplCmsCardApplTunAprvUnit;
    @XmlElement(name = "OutGrpOutGrmCardApplCmsCardApplTunAprvUsr")
    protected String outGrpOutGrmCardApplCmsCardApplTunAprvUsr;
    @XmlElement(name = "OutGrpOutGrmCardApplCmsCardApplTunAprvUsrInSn")
    protected short outGrpOutGrmCardApplCmsCardApplTunAprvUsrInSn;
    @XmlElement(name = "OutGrpOutGrmCardApplCmsCardApplTunAprvUsrSn")
    protected int outGrpOutGrmCardApplCmsCardApplTunAprvUsrSn;
    @XmlElement(name = "OutGrpOutGrmCardApplCmsCardApplTunDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmCardApplCmsCardApplTunDate;
    @XmlElement(name = "OutGrpOutGrmCardApplCmsCardApplTunUnit")
    protected int outGrpOutGrmCardApplCmsCardApplTunUnit;
    @XmlElement(name = "OutGrpOutGrmCardApplCmsCardApplTunUsr")
    protected String outGrpOutGrmCardApplCmsCardApplTunUsr;
    @XmlElement(name = "OutGrpOutGrmCardApplCmsCardApplTunUsrIntSn")
    protected short outGrpOutGrmCardApplCmsCardApplTunUsrIntSn;
    @XmlElement(name = "OutGrpOutGrmCardApplCmsCardApplTunUsrSn")
    protected int outGrpOutGrmCardApplCmsCardApplTunUsrSn;
    @XmlElement(name = "OutGrpOutGrmCardTypeCharSuppliedChar20")
    protected String outGrpOutGrmCardTypeCharSuppliedChar20;
    @XmlElement(name = "OutGrpOutGrmCustCustomerCDigit")
    protected short outGrpOutGrmCustCustomerCDigit;
    @XmlElement(name = "OutGrpOutGrmCustCustomerCustId")
    protected int outGrpOutGrmCustCustomerCustId;
    @XmlElement(name = "OutGrpOutGrmDeliveryTypeCharSuppliedChar20")
    protected String outGrpOutGrmDeliveryTypeCharSuppliedChar20;
    @XmlElement(name = "OutGrpOutGrmPrftAccProfitsAccountAccountCd")
    protected short outGrpOutGrmPrftAccProfitsAccountAccountCd;
    @XmlElement(name = "OutGrpOutGrmPrftAccProfitsAccountAccountNumber")
    protected String outGrpOutGrmPrftAccProfitsAccountAccountNumber;
    @XmlElement(name = "OutGrpOutGrmPrftSystemCharSuppliedChar20")
    protected String outGrpOutGrmPrftSystemCharSuppliedChar20;
    @XmlElement(name = "OutGrpOutGrmCustCustomerFirstName")
    protected String outGrpOutGrmCustCustomerFirstName;
    @XmlElement(name = "OutGrpOutGrmCustCustomerSurname")
    protected String outGrpOutGrmCustCustomerSurname;
    @XmlElement(name = "OutGrpOutGrmCustCustomerTitle")
    protected String outGrpOutGrmCustCustomerTitle;
    @XmlElement(name = "OutGrpOutGrmCmsOrdInventoryPan")
    protected String outGrpOutGrmCmsOrdInventoryPan;
    @XmlElement(name = "OutGrpOutGrmCmsCardRejectionReason")
    protected String outGrpOutGrmCmsCardRejectionReason;

    /**
     * Gets the value of the outGrpOutGrmApplStatusCharSuppliedChar25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmApplStatusCharSuppliedChar25() {
        return outGrpOutGrmApplStatusCharSuppliedChar25;
    }

    /**
     * Sets the value of the outGrpOutGrmApplStatusCharSuppliedChar25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmApplStatusCharSuppliedChar25(String value) {
        this.outGrpOutGrmApplStatusCharSuppliedChar25 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCardApplCmsCardApplApplicationSn property.
     * 
     */
    public double getOutGrpOutGrmCardApplCmsCardApplApplicationSn() {
        return outGrpOutGrmCardApplCmsCardApplApplicationSn;
    }

    /**
     * Sets the value of the outGrpOutGrmCardApplCmsCardApplApplicationSn property.
     * 
     */
    public void setOutGrpOutGrmCardApplCmsCardApplApplicationSn(double value) {
        this.outGrpOutGrmCardApplCmsCardApplApplicationSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCardApplCmsCardApplCardNameLatin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmCardApplCmsCardApplCardNameLatin() {
        return outGrpOutGrmCardApplCmsCardApplCardNameLatin;
    }

    /**
     * Sets the value of the outGrpOutGrmCardApplCmsCardApplCardNameLatin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmCardApplCmsCardApplCardNameLatin(String value) {
        this.outGrpOutGrmCardApplCmsCardApplCardNameLatin = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCardApplCmsCardApplCardSn property.
     * 
     */
    public double getOutGrpOutGrmCardApplCmsCardApplCardSn() {
        return outGrpOutGrmCardApplCmsCardApplCardSn;
    }

    /**
     * Sets the value of the outGrpOutGrmCardApplCmsCardApplCardSn property.
     * 
     */
    public void setOutGrpOutGrmCardApplCmsCardApplCardSn(double value) {
        this.outGrpOutGrmCardApplCmsCardApplCardSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCardApplCmsCardApplCardSurnameLatin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmCardApplCmsCardApplCardSurnameLatin() {
        return outGrpOutGrmCardApplCmsCardApplCardSurnameLatin;
    }

    /**
     * Sets the value of the outGrpOutGrmCardApplCmsCardApplCardSurnameLatin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmCardApplCmsCardApplCardSurnameLatin(String value) {
        this.outGrpOutGrmCardApplCmsCardApplCardSurnameLatin = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCardApplCmsCardApplCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmCardApplCmsCardApplCreationDate() {
        return outGrpOutGrmCardApplCmsCardApplCreationDate;
    }

    /**
     * Sets the value of the outGrpOutGrmCardApplCmsCardApplCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmCardApplCmsCardApplCreationDate(XMLGregorianCalendar value) {
        this.outGrpOutGrmCardApplCmsCardApplCreationDate = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCardApplCmsCardApplCreationUnit property.
     * 
     */
    public int getOutGrpOutGrmCardApplCmsCardApplCreationUnit() {
        return outGrpOutGrmCardApplCmsCardApplCreationUnit;
    }

    /**
     * Sets the value of the outGrpOutGrmCardApplCmsCardApplCreationUnit property.
     * 
     */
    public void setOutGrpOutGrmCardApplCmsCardApplCreationUnit(int value) {
        this.outGrpOutGrmCardApplCmsCardApplCreationUnit = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCardApplCmsCardApplCreationUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmCardApplCmsCardApplCreationUser() {
        return outGrpOutGrmCardApplCmsCardApplCreationUser;
    }

    /**
     * Sets the value of the outGrpOutGrmCardApplCmsCardApplCreationUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmCardApplCmsCardApplCreationUser(String value) {
        this.outGrpOutGrmCardApplCmsCardApplCreationUser = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCardApplCmsCardApplExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmCardApplCmsCardApplExpiryDate() {
        return outGrpOutGrmCardApplCmsCardApplExpiryDate;
    }

    /**
     * Sets the value of the outGrpOutGrmCardApplCmsCardApplExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmCardApplCmsCardApplExpiryDate(XMLGregorianCalendar value) {
        this.outGrpOutGrmCardApplCmsCardApplExpiryDate = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCardApplCmsCardApplFinalizationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmCardApplCmsCardApplFinalizationDate() {
        return outGrpOutGrmCardApplCmsCardApplFinalizationDate;
    }

    /**
     * Sets the value of the outGrpOutGrmCardApplCmsCardApplFinalizationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmCardApplCmsCardApplFinalizationDate(XMLGregorianCalendar value) {
        this.outGrpOutGrmCardApplCmsCardApplFinalizationDate = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCardApplCmsCardApplTunAprvDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmCardApplCmsCardApplTunAprvDate() {
        return outGrpOutGrmCardApplCmsCardApplTunAprvDate;
    }

    /**
     * Sets the value of the outGrpOutGrmCardApplCmsCardApplTunAprvDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmCardApplCmsCardApplTunAprvDate(XMLGregorianCalendar value) {
        this.outGrpOutGrmCardApplCmsCardApplTunAprvDate = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCardApplCmsCardApplTunAprvUnit property.
     * 
     */
    public int getOutGrpOutGrmCardApplCmsCardApplTunAprvUnit() {
        return outGrpOutGrmCardApplCmsCardApplTunAprvUnit;
    }

    /**
     * Sets the value of the outGrpOutGrmCardApplCmsCardApplTunAprvUnit property.
     * 
     */
    public void setOutGrpOutGrmCardApplCmsCardApplTunAprvUnit(int value) {
        this.outGrpOutGrmCardApplCmsCardApplTunAprvUnit = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCardApplCmsCardApplTunAprvUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmCardApplCmsCardApplTunAprvUsr() {
        return outGrpOutGrmCardApplCmsCardApplTunAprvUsr;
    }

    /**
     * Sets the value of the outGrpOutGrmCardApplCmsCardApplTunAprvUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmCardApplCmsCardApplTunAprvUsr(String value) {
        this.outGrpOutGrmCardApplCmsCardApplTunAprvUsr = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCardApplCmsCardApplTunAprvUsrInSn property.
     * 
     */
    public short getOutGrpOutGrmCardApplCmsCardApplTunAprvUsrInSn() {
        return outGrpOutGrmCardApplCmsCardApplTunAprvUsrInSn;
    }

    /**
     * Sets the value of the outGrpOutGrmCardApplCmsCardApplTunAprvUsrInSn property.
     * 
     */
    public void setOutGrpOutGrmCardApplCmsCardApplTunAprvUsrInSn(short value) {
        this.outGrpOutGrmCardApplCmsCardApplTunAprvUsrInSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCardApplCmsCardApplTunAprvUsrSn property.
     * 
     */
    public int getOutGrpOutGrmCardApplCmsCardApplTunAprvUsrSn() {
        return outGrpOutGrmCardApplCmsCardApplTunAprvUsrSn;
    }

    /**
     * Sets the value of the outGrpOutGrmCardApplCmsCardApplTunAprvUsrSn property.
     * 
     */
    public void setOutGrpOutGrmCardApplCmsCardApplTunAprvUsrSn(int value) {
        this.outGrpOutGrmCardApplCmsCardApplTunAprvUsrSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCardApplCmsCardApplTunDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmCardApplCmsCardApplTunDate() {
        return outGrpOutGrmCardApplCmsCardApplTunDate;
    }

    /**
     * Sets the value of the outGrpOutGrmCardApplCmsCardApplTunDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmCardApplCmsCardApplTunDate(XMLGregorianCalendar value) {
        this.outGrpOutGrmCardApplCmsCardApplTunDate = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCardApplCmsCardApplTunUnit property.
     * 
     */
    public int getOutGrpOutGrmCardApplCmsCardApplTunUnit() {
        return outGrpOutGrmCardApplCmsCardApplTunUnit;
    }

    /**
     * Sets the value of the outGrpOutGrmCardApplCmsCardApplTunUnit property.
     * 
     */
    public void setOutGrpOutGrmCardApplCmsCardApplTunUnit(int value) {
        this.outGrpOutGrmCardApplCmsCardApplTunUnit = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCardApplCmsCardApplTunUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmCardApplCmsCardApplTunUsr() {
        return outGrpOutGrmCardApplCmsCardApplTunUsr;
    }

    /**
     * Sets the value of the outGrpOutGrmCardApplCmsCardApplTunUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmCardApplCmsCardApplTunUsr(String value) {
        this.outGrpOutGrmCardApplCmsCardApplTunUsr = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCardApplCmsCardApplTunUsrIntSn property.
     * 
     */
    public short getOutGrpOutGrmCardApplCmsCardApplTunUsrIntSn() {
        return outGrpOutGrmCardApplCmsCardApplTunUsrIntSn;
    }

    /**
     * Sets the value of the outGrpOutGrmCardApplCmsCardApplTunUsrIntSn property.
     * 
     */
    public void setOutGrpOutGrmCardApplCmsCardApplTunUsrIntSn(short value) {
        this.outGrpOutGrmCardApplCmsCardApplTunUsrIntSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCardApplCmsCardApplTunUsrSn property.
     * 
     */
    public int getOutGrpOutGrmCardApplCmsCardApplTunUsrSn() {
        return outGrpOutGrmCardApplCmsCardApplTunUsrSn;
    }

    /**
     * Sets the value of the outGrpOutGrmCardApplCmsCardApplTunUsrSn property.
     * 
     */
    public void setOutGrpOutGrmCardApplCmsCardApplTunUsrSn(int value) {
        this.outGrpOutGrmCardApplCmsCardApplTunUsrSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCardTypeCharSuppliedChar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmCardTypeCharSuppliedChar20() {
        return outGrpOutGrmCardTypeCharSuppliedChar20;
    }

    /**
     * Sets the value of the outGrpOutGrmCardTypeCharSuppliedChar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmCardTypeCharSuppliedChar20(String value) {
        this.outGrpOutGrmCardTypeCharSuppliedChar20 = value;
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
     * Gets the value of the outGrpOutGrmDeliveryTypeCharSuppliedChar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmDeliveryTypeCharSuppliedChar20() {
        return outGrpOutGrmDeliveryTypeCharSuppliedChar20;
    }

    /**
     * Sets the value of the outGrpOutGrmDeliveryTypeCharSuppliedChar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmDeliveryTypeCharSuppliedChar20(String value) {
        this.outGrpOutGrmDeliveryTypeCharSuppliedChar20 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmPrftAccProfitsAccountAccountCd property.
     * 
     */
    public short getOutGrpOutGrmPrftAccProfitsAccountAccountCd() {
        return outGrpOutGrmPrftAccProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outGrpOutGrmPrftAccProfitsAccountAccountCd property.
     * 
     */
    public void setOutGrpOutGrmPrftAccProfitsAccountAccountCd(short value) {
        this.outGrpOutGrmPrftAccProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outGrpOutGrmPrftAccProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmPrftAccProfitsAccountAccountNumber() {
        return outGrpOutGrmPrftAccProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outGrpOutGrmPrftAccProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmPrftAccProfitsAccountAccountNumber(String value) {
        this.outGrpOutGrmPrftAccProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outGrpOutGrmPrftSystemCharSuppliedChar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmPrftSystemCharSuppliedChar20() {
        return outGrpOutGrmPrftSystemCharSuppliedChar20;
    }

    /**
     * Sets the value of the outGrpOutGrmPrftSystemCharSuppliedChar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmPrftSystemCharSuppliedChar20(String value) {
        this.outGrpOutGrmPrftSystemCharSuppliedChar20 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCustCustomerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmCustCustomerFirstName() {
        return outGrpOutGrmCustCustomerFirstName;
    }

    /**
     * Sets the value of the outGrpOutGrmCustCustomerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmCustCustomerFirstName(String value) {
        this.outGrpOutGrmCustCustomerFirstName = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCustCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmCustCustomerSurname() {
        return outGrpOutGrmCustCustomerSurname;
    }

    /**
     * Sets the value of the outGrpOutGrmCustCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmCustCustomerSurname(String value) {
        this.outGrpOutGrmCustCustomerSurname = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCustCustomerTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmCustCustomerTitle() {
        return outGrpOutGrmCustCustomerTitle;
    }

    /**
     * Sets the value of the outGrpOutGrmCustCustomerTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmCustCustomerTitle(String value) {
        this.outGrpOutGrmCustCustomerTitle = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCmsOrdInventoryPan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmCmsOrdInventoryPan() {
        return outGrpOutGrmCmsOrdInventoryPan;
    }

    /**
     * Sets the value of the outGrpOutGrmCmsOrdInventoryPan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmCmsOrdInventoryPan(String value) {
        this.outGrpOutGrmCmsOrdInventoryPan = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCmsCardRejectionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmCmsCardRejectionReason() {
        return outGrpOutGrmCmsCardRejectionReason;
    }

    /**
     * Sets the value of the outGrpOutGrmCmsCardRejectionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmCmsCardRejectionReason(String value) {
        this.outGrpOutGrmCmsCardRejectionReason = value;
    }

}
