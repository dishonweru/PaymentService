
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for P0831VOutGrpVaultLogItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="P0831VOutGrpVaultLogItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpVaultLogOutGrmVaultLogCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpVaultLogOutGrmVaultLogGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpVaultLogOutGrmVaultLogGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpVaultLogOutGrmVaultLogIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpVaultLogOutGrmVaultLogVaultItemItemDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpVaultLogOutGrmVaultLogVaultLogCashAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpVaultLogOutGrmVaultLogVaultLogCashCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpVaultLogOutGrmVaultLogVaultLogItemDaysInVault" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpVaultLogOutGrmVaultLogVaultLogItemDaysNotinVault" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpVaultLogOutGrmVaultLogVaultLogItemUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpVaultLogOutGrmVaultLogVaultLogProcessDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpVaultLogOutGrmVaultLogVaultLogProcessReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpVaultLogOutGrmVaultLogVaultLogTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpVaultLogOutGrmVaultLogVaultLogTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpVaultLogOutGrmVaultLogVaultLogTrxInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpVaultLogOutGrmVaultLogVaultLogTrxSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpVaultLogOutGrmVaultLogVaultLogTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpVaultLogOutGrmVaultLogVaultLogTrxUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpVaultLogOutGrmVaultLogVaultLogVaultAccessType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpVaultLogOutGrmVaultLogVaultLogVaultItemSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpVaultLogOutGrmVaultLogVaultLogVaultTrxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpVaultLogOutGrmVaultLogVaultLogVaultUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "P0831VOutGrpVaultLogItem", propOrder = {
    "outGrpVaultLogOutGrmVaultLogCurrencyShortDescr",
    "outGrpVaultLogOutGrmVaultLogGenericDetailDescription",
    "outGrpVaultLogOutGrmVaultLogGenericDetailSerialNum",
    "outGrpVaultLogOutGrmVaultLogIefSuppliedSelectChar",
    "outGrpVaultLogOutGrmVaultLogVaultItemItemDescription",
    "outGrpVaultLogOutGrmVaultLogVaultLogCashAmount",
    "outGrpVaultLogOutGrmVaultLogVaultLogCashCurrency",
    "outGrpVaultLogOutGrmVaultLogVaultLogItemDaysInVault",
    "outGrpVaultLogOutGrmVaultLogVaultLogItemDaysNotinVault",
    "outGrpVaultLogOutGrmVaultLogVaultLogItemUser",
    "outGrpVaultLogOutGrmVaultLogVaultLogProcessDetail",
    "outGrpVaultLogOutGrmVaultLogVaultLogProcessReason",
    "outGrpVaultLogOutGrmVaultLogVaultLogTmstamp",
    "outGrpVaultLogOutGrmVaultLogVaultLogTrxDate",
    "outGrpVaultLogOutGrmVaultLogVaultLogTrxInternalSn",
    "outGrpVaultLogOutGrmVaultLogVaultLogTrxSn",
    "outGrpVaultLogOutGrmVaultLogVaultLogTrxUnit",
    "outGrpVaultLogOutGrmVaultLogVaultLogTrxUser",
    "outGrpVaultLogOutGrmVaultLogVaultLogVaultAccessType",
    "outGrpVaultLogOutGrmVaultLogVaultLogVaultItemSn",
    "outGrpVaultLogOutGrmVaultLogVaultLogVaultTrxType",
    "outGrpVaultLogOutGrmVaultLogVaultLogVaultUnit"
})
public class P0831VOutGrpVaultLogItem {

    @XmlElement(name = "OutGrpVaultLogOutGrmVaultLogCurrencyShortDescr")
    protected String outGrpVaultLogOutGrmVaultLogCurrencyShortDescr;
    @XmlElement(name = "OutGrpVaultLogOutGrmVaultLogGenericDetailDescription")
    protected String outGrpVaultLogOutGrmVaultLogGenericDetailDescription;
    @XmlElement(name = "OutGrpVaultLogOutGrmVaultLogGenericDetailSerialNum")
    protected int outGrpVaultLogOutGrmVaultLogGenericDetailSerialNum;
    @XmlElement(name = "OutGrpVaultLogOutGrmVaultLogIefSuppliedSelectChar")
    protected String outGrpVaultLogOutGrmVaultLogIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpVaultLogOutGrmVaultLogVaultItemItemDescription")
    protected String outGrpVaultLogOutGrmVaultLogVaultItemItemDescription;
    @XmlElement(name = "OutGrpVaultLogOutGrmVaultLogVaultLogCashAmount", required = true)
    protected BigDecimal outGrpVaultLogOutGrmVaultLogVaultLogCashAmount;
    @XmlElement(name = "OutGrpVaultLogOutGrmVaultLogVaultLogCashCurrency")
    protected int outGrpVaultLogOutGrmVaultLogVaultLogCashCurrency;
    @XmlElement(name = "OutGrpVaultLogOutGrmVaultLogVaultLogItemDaysInVault")
    protected double outGrpVaultLogOutGrmVaultLogVaultLogItemDaysInVault;
    @XmlElement(name = "OutGrpVaultLogOutGrmVaultLogVaultLogItemDaysNotinVault")
    protected double outGrpVaultLogOutGrmVaultLogVaultLogItemDaysNotinVault;
    @XmlElement(name = "OutGrpVaultLogOutGrmVaultLogVaultLogItemUser")
    protected String outGrpVaultLogOutGrmVaultLogVaultLogItemUser;
    @XmlElement(name = "OutGrpVaultLogOutGrmVaultLogVaultLogProcessDetail")
    protected String outGrpVaultLogOutGrmVaultLogVaultLogProcessDetail;
    @XmlElement(name = "OutGrpVaultLogOutGrmVaultLogVaultLogProcessReason")
    protected String outGrpVaultLogOutGrmVaultLogVaultLogProcessReason;
    @XmlElement(name = "OutGrpVaultLogOutGrmVaultLogVaultLogTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpVaultLogOutGrmVaultLogVaultLogTmstamp;
    @XmlElement(name = "OutGrpVaultLogOutGrmVaultLogVaultLogTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpVaultLogOutGrmVaultLogVaultLogTrxDate;
    @XmlElement(name = "OutGrpVaultLogOutGrmVaultLogVaultLogTrxInternalSn")
    protected short outGrpVaultLogOutGrmVaultLogVaultLogTrxInternalSn;
    @XmlElement(name = "OutGrpVaultLogOutGrmVaultLogVaultLogTrxSn")
    protected int outGrpVaultLogOutGrmVaultLogVaultLogTrxSn;
    @XmlElement(name = "OutGrpVaultLogOutGrmVaultLogVaultLogTrxUnit")
    protected int outGrpVaultLogOutGrmVaultLogVaultLogTrxUnit;
    @XmlElement(name = "OutGrpVaultLogOutGrmVaultLogVaultLogTrxUser")
    protected String outGrpVaultLogOutGrmVaultLogVaultLogTrxUser;
    @XmlElement(name = "OutGrpVaultLogOutGrmVaultLogVaultLogVaultAccessType")
    protected String outGrpVaultLogOutGrmVaultLogVaultLogVaultAccessType;
    @XmlElement(name = "OutGrpVaultLogOutGrmVaultLogVaultLogVaultItemSn")
    protected double outGrpVaultLogOutGrmVaultLogVaultLogVaultItemSn;
    @XmlElement(name = "OutGrpVaultLogOutGrmVaultLogVaultLogVaultTrxType")
    protected String outGrpVaultLogOutGrmVaultLogVaultLogVaultTrxType;
    @XmlElement(name = "OutGrpVaultLogOutGrmVaultLogVaultLogVaultUnit")
    protected int outGrpVaultLogOutGrmVaultLogVaultLogVaultUnit;

    /**
     * Gets the value of the outGrpVaultLogOutGrmVaultLogCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpVaultLogOutGrmVaultLogCurrencyShortDescr() {
        return outGrpVaultLogOutGrmVaultLogCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpVaultLogOutGrmVaultLogCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpVaultLogOutGrmVaultLogCurrencyShortDescr(String value) {
        this.outGrpVaultLogOutGrmVaultLogCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGrpVaultLogOutGrmVaultLogGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpVaultLogOutGrmVaultLogGenericDetailDescription() {
        return outGrpVaultLogOutGrmVaultLogGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpVaultLogOutGrmVaultLogGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpVaultLogOutGrmVaultLogGenericDetailDescription(String value) {
        this.outGrpVaultLogOutGrmVaultLogGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpVaultLogOutGrmVaultLogGenericDetailSerialNum property.
     * 
     */
    public int getOutGrpVaultLogOutGrmVaultLogGenericDetailSerialNum() {
        return outGrpVaultLogOutGrmVaultLogGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outGrpVaultLogOutGrmVaultLogGenericDetailSerialNum property.
     * 
     */
    public void setOutGrpVaultLogOutGrmVaultLogGenericDetailSerialNum(int value) {
        this.outGrpVaultLogOutGrmVaultLogGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outGrpVaultLogOutGrmVaultLogIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpVaultLogOutGrmVaultLogIefSuppliedSelectChar() {
        return outGrpVaultLogOutGrmVaultLogIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpVaultLogOutGrmVaultLogIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpVaultLogOutGrmVaultLogIefSuppliedSelectChar(String value) {
        this.outGrpVaultLogOutGrmVaultLogIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpVaultLogOutGrmVaultLogVaultItemItemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpVaultLogOutGrmVaultLogVaultItemItemDescription() {
        return outGrpVaultLogOutGrmVaultLogVaultItemItemDescription;
    }

    /**
     * Sets the value of the outGrpVaultLogOutGrmVaultLogVaultItemItemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpVaultLogOutGrmVaultLogVaultItemItemDescription(String value) {
        this.outGrpVaultLogOutGrmVaultLogVaultItemItemDescription = value;
    }

    /**
     * Gets the value of the outGrpVaultLogOutGrmVaultLogVaultLogCashAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpVaultLogOutGrmVaultLogVaultLogCashAmount() {
        return outGrpVaultLogOutGrmVaultLogVaultLogCashAmount;
    }

    /**
     * Sets the value of the outGrpVaultLogOutGrmVaultLogVaultLogCashAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpVaultLogOutGrmVaultLogVaultLogCashAmount(BigDecimal value) {
        this.outGrpVaultLogOutGrmVaultLogVaultLogCashAmount = value;
    }

    /**
     * Gets the value of the outGrpVaultLogOutGrmVaultLogVaultLogCashCurrency property.
     * 
     */
    public int getOutGrpVaultLogOutGrmVaultLogVaultLogCashCurrency() {
        return outGrpVaultLogOutGrmVaultLogVaultLogCashCurrency;
    }

    /**
     * Sets the value of the outGrpVaultLogOutGrmVaultLogVaultLogCashCurrency property.
     * 
     */
    public void setOutGrpVaultLogOutGrmVaultLogVaultLogCashCurrency(int value) {
        this.outGrpVaultLogOutGrmVaultLogVaultLogCashCurrency = value;
    }

    /**
     * Gets the value of the outGrpVaultLogOutGrmVaultLogVaultLogItemDaysInVault property.
     * 
     */
    public double getOutGrpVaultLogOutGrmVaultLogVaultLogItemDaysInVault() {
        return outGrpVaultLogOutGrmVaultLogVaultLogItemDaysInVault;
    }

    /**
     * Sets the value of the outGrpVaultLogOutGrmVaultLogVaultLogItemDaysInVault property.
     * 
     */
    public void setOutGrpVaultLogOutGrmVaultLogVaultLogItemDaysInVault(double value) {
        this.outGrpVaultLogOutGrmVaultLogVaultLogItemDaysInVault = value;
    }

    /**
     * Gets the value of the outGrpVaultLogOutGrmVaultLogVaultLogItemDaysNotinVault property.
     * 
     */
    public double getOutGrpVaultLogOutGrmVaultLogVaultLogItemDaysNotinVault() {
        return outGrpVaultLogOutGrmVaultLogVaultLogItemDaysNotinVault;
    }

    /**
     * Sets the value of the outGrpVaultLogOutGrmVaultLogVaultLogItemDaysNotinVault property.
     * 
     */
    public void setOutGrpVaultLogOutGrmVaultLogVaultLogItemDaysNotinVault(double value) {
        this.outGrpVaultLogOutGrmVaultLogVaultLogItemDaysNotinVault = value;
    }

    /**
     * Gets the value of the outGrpVaultLogOutGrmVaultLogVaultLogItemUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpVaultLogOutGrmVaultLogVaultLogItemUser() {
        return outGrpVaultLogOutGrmVaultLogVaultLogItemUser;
    }

    /**
     * Sets the value of the outGrpVaultLogOutGrmVaultLogVaultLogItemUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpVaultLogOutGrmVaultLogVaultLogItemUser(String value) {
        this.outGrpVaultLogOutGrmVaultLogVaultLogItemUser = value;
    }

    /**
     * Gets the value of the outGrpVaultLogOutGrmVaultLogVaultLogProcessDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpVaultLogOutGrmVaultLogVaultLogProcessDetail() {
        return outGrpVaultLogOutGrmVaultLogVaultLogProcessDetail;
    }

    /**
     * Sets the value of the outGrpVaultLogOutGrmVaultLogVaultLogProcessDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpVaultLogOutGrmVaultLogVaultLogProcessDetail(String value) {
        this.outGrpVaultLogOutGrmVaultLogVaultLogProcessDetail = value;
    }

    /**
     * Gets the value of the outGrpVaultLogOutGrmVaultLogVaultLogProcessReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpVaultLogOutGrmVaultLogVaultLogProcessReason() {
        return outGrpVaultLogOutGrmVaultLogVaultLogProcessReason;
    }

    /**
     * Sets the value of the outGrpVaultLogOutGrmVaultLogVaultLogProcessReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpVaultLogOutGrmVaultLogVaultLogProcessReason(String value) {
        this.outGrpVaultLogOutGrmVaultLogVaultLogProcessReason = value;
    }

    /**
     * Gets the value of the outGrpVaultLogOutGrmVaultLogVaultLogTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpVaultLogOutGrmVaultLogVaultLogTmstamp() {
        return outGrpVaultLogOutGrmVaultLogVaultLogTmstamp;
    }

    /**
     * Sets the value of the outGrpVaultLogOutGrmVaultLogVaultLogTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpVaultLogOutGrmVaultLogVaultLogTmstamp(XMLGregorianCalendar value) {
        this.outGrpVaultLogOutGrmVaultLogVaultLogTmstamp = value;
    }

    /**
     * Gets the value of the outGrpVaultLogOutGrmVaultLogVaultLogTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpVaultLogOutGrmVaultLogVaultLogTrxDate() {
        return outGrpVaultLogOutGrmVaultLogVaultLogTrxDate;
    }

    /**
     * Sets the value of the outGrpVaultLogOutGrmVaultLogVaultLogTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpVaultLogOutGrmVaultLogVaultLogTrxDate(XMLGregorianCalendar value) {
        this.outGrpVaultLogOutGrmVaultLogVaultLogTrxDate = value;
    }

    /**
     * Gets the value of the outGrpVaultLogOutGrmVaultLogVaultLogTrxInternalSn property.
     * 
     */
    public short getOutGrpVaultLogOutGrmVaultLogVaultLogTrxInternalSn() {
        return outGrpVaultLogOutGrmVaultLogVaultLogTrxInternalSn;
    }

    /**
     * Sets the value of the outGrpVaultLogOutGrmVaultLogVaultLogTrxInternalSn property.
     * 
     */
    public void setOutGrpVaultLogOutGrmVaultLogVaultLogTrxInternalSn(short value) {
        this.outGrpVaultLogOutGrmVaultLogVaultLogTrxInternalSn = value;
    }

    /**
     * Gets the value of the outGrpVaultLogOutGrmVaultLogVaultLogTrxSn property.
     * 
     */
    public int getOutGrpVaultLogOutGrmVaultLogVaultLogTrxSn() {
        return outGrpVaultLogOutGrmVaultLogVaultLogTrxSn;
    }

    /**
     * Sets the value of the outGrpVaultLogOutGrmVaultLogVaultLogTrxSn property.
     * 
     */
    public void setOutGrpVaultLogOutGrmVaultLogVaultLogTrxSn(int value) {
        this.outGrpVaultLogOutGrmVaultLogVaultLogTrxSn = value;
    }

    /**
     * Gets the value of the outGrpVaultLogOutGrmVaultLogVaultLogTrxUnit property.
     * 
     */
    public int getOutGrpVaultLogOutGrmVaultLogVaultLogTrxUnit() {
        return outGrpVaultLogOutGrmVaultLogVaultLogTrxUnit;
    }

    /**
     * Sets the value of the outGrpVaultLogOutGrmVaultLogVaultLogTrxUnit property.
     * 
     */
    public void setOutGrpVaultLogOutGrmVaultLogVaultLogTrxUnit(int value) {
        this.outGrpVaultLogOutGrmVaultLogVaultLogTrxUnit = value;
    }

    /**
     * Gets the value of the outGrpVaultLogOutGrmVaultLogVaultLogTrxUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpVaultLogOutGrmVaultLogVaultLogTrxUser() {
        return outGrpVaultLogOutGrmVaultLogVaultLogTrxUser;
    }

    /**
     * Sets the value of the outGrpVaultLogOutGrmVaultLogVaultLogTrxUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpVaultLogOutGrmVaultLogVaultLogTrxUser(String value) {
        this.outGrpVaultLogOutGrmVaultLogVaultLogTrxUser = value;
    }

    /**
     * Gets the value of the outGrpVaultLogOutGrmVaultLogVaultLogVaultAccessType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpVaultLogOutGrmVaultLogVaultLogVaultAccessType() {
        return outGrpVaultLogOutGrmVaultLogVaultLogVaultAccessType;
    }

    /**
     * Sets the value of the outGrpVaultLogOutGrmVaultLogVaultLogVaultAccessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpVaultLogOutGrmVaultLogVaultLogVaultAccessType(String value) {
        this.outGrpVaultLogOutGrmVaultLogVaultLogVaultAccessType = value;
    }

    /**
     * Gets the value of the outGrpVaultLogOutGrmVaultLogVaultLogVaultItemSn property.
     * 
     */
    public double getOutGrpVaultLogOutGrmVaultLogVaultLogVaultItemSn() {
        return outGrpVaultLogOutGrmVaultLogVaultLogVaultItemSn;
    }

    /**
     * Sets the value of the outGrpVaultLogOutGrmVaultLogVaultLogVaultItemSn property.
     * 
     */
    public void setOutGrpVaultLogOutGrmVaultLogVaultLogVaultItemSn(double value) {
        this.outGrpVaultLogOutGrmVaultLogVaultLogVaultItemSn = value;
    }

    /**
     * Gets the value of the outGrpVaultLogOutGrmVaultLogVaultLogVaultTrxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpVaultLogOutGrmVaultLogVaultLogVaultTrxType() {
        return outGrpVaultLogOutGrmVaultLogVaultLogVaultTrxType;
    }

    /**
     * Sets the value of the outGrpVaultLogOutGrmVaultLogVaultLogVaultTrxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpVaultLogOutGrmVaultLogVaultLogVaultTrxType(String value) {
        this.outGrpVaultLogOutGrmVaultLogVaultLogVaultTrxType = value;
    }

    /**
     * Gets the value of the outGrpVaultLogOutGrmVaultLogVaultLogVaultUnit property.
     * 
     */
    public int getOutGrpVaultLogOutGrmVaultLogVaultLogVaultUnit() {
        return outGrpVaultLogOutGrmVaultLogVaultLogVaultUnit;
    }

    /**
     * Sets the value of the outGrpVaultLogOutGrmVaultLogVaultLogVaultUnit property.
     * 
     */
    public void setOutGrpVaultLogOutGrmVaultLogVaultLogVaultUnit(int value) {
        this.outGrpVaultLogOutGrmVaultLogVaultLogVaultUnit = value;
    }

}
