
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UDF002VOutGrpHistoryFieldsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UDF002VOutGrpHistoryFieldsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpHistoryFieldsOutGrmHistSelIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHistoryFieldsOutGrmUserDefFldHistFieldLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHistoryFieldsOutGrmUserDefFldHistHistorySn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpHistoryFieldsOutGrmUserDefFldHistOFieldValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHistoryFieldsOutGrmUserDefFldHistPFieldValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHistoryFieldsOutGrmUserDefFldHistPfgSetCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHistoryFieldsOutGrmUserDefFldHistPfgSetSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpHistoryFieldsOutGrmUserDefFldHistPfgTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHistoryFieldsOutGrmUserDefFldHistPfgTagSetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHistoryFieldsOutGrmUserDefFldHistTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpHistoryFieldsOutGrmUserDefFldHistTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpHistoryFieldsOutGrmUserDefFldHistTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpHistoryFieldsOutGrmUserDefFldHistTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpHistoryFieldsOutGrmUserDefFldHistTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHistoryFieldsOutGrmUserDefFldHistTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpHistoryFieldsOutGrmUserDefFldHistUdAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHistoryFieldsOutGrmUserDefFldHistUdCustomerCode" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpHistoryFieldsOutGrmUserDefFldHistUdPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpHistoryFieldsOutGrmUserDefFldHistUdRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHistoryFieldsOutGrmUserDefFldHistUdSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UDF002VOutGrpHistoryFieldsItem", propOrder = {
    "outGrpHistoryFieldsOutGrmHistSelIefSuppliedSelectChar",
    "outGrpHistoryFieldsOutGrmUserDefFldHistFieldLabel",
    "outGrpHistoryFieldsOutGrmUserDefFldHistHistorySn",
    "outGrpHistoryFieldsOutGrmUserDefFldHistOFieldValue",
    "outGrpHistoryFieldsOutGrmUserDefFldHistPFieldValue",
    "outGrpHistoryFieldsOutGrmUserDefFldHistPfgSetCategory",
    "outGrpHistoryFieldsOutGrmUserDefFldHistPfgSetSn",
    "outGrpHistoryFieldsOutGrmUserDefFldHistPfgTag",
    "outGrpHistoryFieldsOutGrmUserDefFldHistPfgTagSetCode",
    "outGrpHistoryFieldsOutGrmUserDefFldHistTmstamp",
    "outGrpHistoryFieldsOutGrmUserDefFldHistTrxCode",
    "outGrpHistoryFieldsOutGrmUserDefFldHistTrxDate",
    "outGrpHistoryFieldsOutGrmUserDefFldHistTrxUnit",
    "outGrpHistoryFieldsOutGrmUserDefFldHistTrxUsr",
    "outGrpHistoryFieldsOutGrmUserDefFldHistTrxUsrSn",
    "outGrpHistoryFieldsOutGrmUserDefFldHistUdAccountNumber",
    "outGrpHistoryFieldsOutGrmUserDefFldHistUdCustomerCode",
    "outGrpHistoryFieldsOutGrmUserDefFldHistUdPrftSystem",
    "outGrpHistoryFieldsOutGrmUserDefFldHistUdRecordType",
    "outGrpHistoryFieldsOutGrmUserDefFldHistUdSn"
})
public class UDF002VOutGrpHistoryFieldsItem {

    @XmlElement(name = "OutGrpHistoryFieldsOutGrmHistSelIefSuppliedSelectChar")
    protected String outGrpHistoryFieldsOutGrmHistSelIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpHistoryFieldsOutGrmUserDefFldHistFieldLabel")
    protected String outGrpHistoryFieldsOutGrmUserDefFldHistFieldLabel;
    @XmlElement(name = "OutGrpHistoryFieldsOutGrmUserDefFldHistHistorySn")
    protected int outGrpHistoryFieldsOutGrmUserDefFldHistHistorySn;
    @XmlElement(name = "OutGrpHistoryFieldsOutGrmUserDefFldHistOFieldValue")
    protected String outGrpHistoryFieldsOutGrmUserDefFldHistOFieldValue;
    @XmlElement(name = "OutGrpHistoryFieldsOutGrmUserDefFldHistPFieldValue")
    protected String outGrpHistoryFieldsOutGrmUserDefFldHistPFieldValue;
    @XmlElement(name = "OutGrpHistoryFieldsOutGrmUserDefFldHistPfgSetCategory")
    protected String outGrpHistoryFieldsOutGrmUserDefFldHistPfgSetCategory;
    @XmlElement(name = "OutGrpHistoryFieldsOutGrmUserDefFldHistPfgSetSn")
    protected int outGrpHistoryFieldsOutGrmUserDefFldHistPfgSetSn;
    @XmlElement(name = "OutGrpHistoryFieldsOutGrmUserDefFldHistPfgTag")
    protected String outGrpHistoryFieldsOutGrmUserDefFldHistPfgTag;
    @XmlElement(name = "OutGrpHistoryFieldsOutGrmUserDefFldHistPfgTagSetCode")
    protected String outGrpHistoryFieldsOutGrmUserDefFldHistPfgTagSetCode;
    @XmlElement(name = "OutGrpHistoryFieldsOutGrmUserDefFldHistTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpHistoryFieldsOutGrmUserDefFldHistTmstamp;
    @XmlElement(name = "OutGrpHistoryFieldsOutGrmUserDefFldHistTrxCode")
    protected int outGrpHistoryFieldsOutGrmUserDefFldHistTrxCode;
    @XmlElement(name = "OutGrpHistoryFieldsOutGrmUserDefFldHistTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpHistoryFieldsOutGrmUserDefFldHistTrxDate;
    @XmlElement(name = "OutGrpHistoryFieldsOutGrmUserDefFldHistTrxUnit")
    protected int outGrpHistoryFieldsOutGrmUserDefFldHistTrxUnit;
    @XmlElement(name = "OutGrpHistoryFieldsOutGrmUserDefFldHistTrxUsr")
    protected String outGrpHistoryFieldsOutGrmUserDefFldHistTrxUsr;
    @XmlElement(name = "OutGrpHistoryFieldsOutGrmUserDefFldHistTrxUsrSn")
    protected int outGrpHistoryFieldsOutGrmUserDefFldHistTrxUsrSn;
    @XmlElement(name = "OutGrpHistoryFieldsOutGrmUserDefFldHistUdAccountNumber")
    protected String outGrpHistoryFieldsOutGrmUserDefFldHistUdAccountNumber;
    @XmlElement(name = "OutGrpHistoryFieldsOutGrmUserDefFldHistUdCustomerCode")
    protected double outGrpHistoryFieldsOutGrmUserDefFldHistUdCustomerCode;
    @XmlElement(name = "OutGrpHistoryFieldsOutGrmUserDefFldHistUdPrftSystem")
    protected short outGrpHistoryFieldsOutGrmUserDefFldHistUdPrftSystem;
    @XmlElement(name = "OutGrpHistoryFieldsOutGrmUserDefFldHistUdRecordType")
    protected String outGrpHistoryFieldsOutGrmUserDefFldHistUdRecordType;
    @XmlElement(name = "OutGrpHistoryFieldsOutGrmUserDefFldHistUdSn")
    protected short outGrpHistoryFieldsOutGrmUserDefFldHistUdSn;

    /**
     * Gets the value of the outGrpHistoryFieldsOutGrmHistSelIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHistoryFieldsOutGrmHistSelIefSuppliedSelectChar() {
        return outGrpHistoryFieldsOutGrmHistSelIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpHistoryFieldsOutGrmHistSelIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHistoryFieldsOutGrmHistSelIefSuppliedSelectChar(String value) {
        this.outGrpHistoryFieldsOutGrmHistSelIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistFieldLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHistoryFieldsOutGrmUserDefFldHistFieldLabel() {
        return outGrpHistoryFieldsOutGrmUserDefFldHistFieldLabel;
    }

    /**
     * Sets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistFieldLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHistoryFieldsOutGrmUserDefFldHistFieldLabel(String value) {
        this.outGrpHistoryFieldsOutGrmUserDefFldHistFieldLabel = value;
    }

    /**
     * Gets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistHistorySn property.
     * 
     */
    public int getOutGrpHistoryFieldsOutGrmUserDefFldHistHistorySn() {
        return outGrpHistoryFieldsOutGrmUserDefFldHistHistorySn;
    }

    /**
     * Sets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistHistorySn property.
     * 
     */
    public void setOutGrpHistoryFieldsOutGrmUserDefFldHistHistorySn(int value) {
        this.outGrpHistoryFieldsOutGrmUserDefFldHistHistorySn = value;
    }

    /**
     * Gets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistOFieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHistoryFieldsOutGrmUserDefFldHistOFieldValue() {
        return outGrpHistoryFieldsOutGrmUserDefFldHistOFieldValue;
    }

    /**
     * Sets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistOFieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHistoryFieldsOutGrmUserDefFldHistOFieldValue(String value) {
        this.outGrpHistoryFieldsOutGrmUserDefFldHistOFieldValue = value;
    }

    /**
     * Gets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistPFieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHistoryFieldsOutGrmUserDefFldHistPFieldValue() {
        return outGrpHistoryFieldsOutGrmUserDefFldHistPFieldValue;
    }

    /**
     * Sets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistPFieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHistoryFieldsOutGrmUserDefFldHistPFieldValue(String value) {
        this.outGrpHistoryFieldsOutGrmUserDefFldHistPFieldValue = value;
    }

    /**
     * Gets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistPfgSetCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHistoryFieldsOutGrmUserDefFldHistPfgSetCategory() {
        return outGrpHistoryFieldsOutGrmUserDefFldHistPfgSetCategory;
    }

    /**
     * Sets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistPfgSetCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHistoryFieldsOutGrmUserDefFldHistPfgSetCategory(String value) {
        this.outGrpHistoryFieldsOutGrmUserDefFldHistPfgSetCategory = value;
    }

    /**
     * Gets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistPfgSetSn property.
     * 
     */
    public int getOutGrpHistoryFieldsOutGrmUserDefFldHistPfgSetSn() {
        return outGrpHistoryFieldsOutGrmUserDefFldHistPfgSetSn;
    }

    /**
     * Sets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistPfgSetSn property.
     * 
     */
    public void setOutGrpHistoryFieldsOutGrmUserDefFldHistPfgSetSn(int value) {
        this.outGrpHistoryFieldsOutGrmUserDefFldHistPfgSetSn = value;
    }

    /**
     * Gets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistPfgTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHistoryFieldsOutGrmUserDefFldHistPfgTag() {
        return outGrpHistoryFieldsOutGrmUserDefFldHistPfgTag;
    }

    /**
     * Sets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistPfgTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHistoryFieldsOutGrmUserDefFldHistPfgTag(String value) {
        this.outGrpHistoryFieldsOutGrmUserDefFldHistPfgTag = value;
    }

    /**
     * Gets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistPfgTagSetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHistoryFieldsOutGrmUserDefFldHistPfgTagSetCode() {
        return outGrpHistoryFieldsOutGrmUserDefFldHistPfgTagSetCode;
    }

    /**
     * Sets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistPfgTagSetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHistoryFieldsOutGrmUserDefFldHistPfgTagSetCode(String value) {
        this.outGrpHistoryFieldsOutGrmUserDefFldHistPfgTagSetCode = value;
    }

    /**
     * Gets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpHistoryFieldsOutGrmUserDefFldHistTmstamp() {
        return outGrpHistoryFieldsOutGrmUserDefFldHistTmstamp;
    }

    /**
     * Sets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpHistoryFieldsOutGrmUserDefFldHistTmstamp(XMLGregorianCalendar value) {
        this.outGrpHistoryFieldsOutGrmUserDefFldHistTmstamp = value;
    }

    /**
     * Gets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistTrxCode property.
     * 
     */
    public int getOutGrpHistoryFieldsOutGrmUserDefFldHistTrxCode() {
        return outGrpHistoryFieldsOutGrmUserDefFldHistTrxCode;
    }

    /**
     * Sets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistTrxCode property.
     * 
     */
    public void setOutGrpHistoryFieldsOutGrmUserDefFldHistTrxCode(int value) {
        this.outGrpHistoryFieldsOutGrmUserDefFldHistTrxCode = value;
    }

    /**
     * Gets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpHistoryFieldsOutGrmUserDefFldHistTrxDate() {
        return outGrpHistoryFieldsOutGrmUserDefFldHistTrxDate;
    }

    /**
     * Sets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpHistoryFieldsOutGrmUserDefFldHistTrxDate(XMLGregorianCalendar value) {
        this.outGrpHistoryFieldsOutGrmUserDefFldHistTrxDate = value;
    }

    /**
     * Gets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistTrxUnit property.
     * 
     */
    public int getOutGrpHistoryFieldsOutGrmUserDefFldHistTrxUnit() {
        return outGrpHistoryFieldsOutGrmUserDefFldHistTrxUnit;
    }

    /**
     * Sets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistTrxUnit property.
     * 
     */
    public void setOutGrpHistoryFieldsOutGrmUserDefFldHistTrxUnit(int value) {
        this.outGrpHistoryFieldsOutGrmUserDefFldHistTrxUnit = value;
    }

    /**
     * Gets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHistoryFieldsOutGrmUserDefFldHistTrxUsr() {
        return outGrpHistoryFieldsOutGrmUserDefFldHistTrxUsr;
    }

    /**
     * Sets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHistoryFieldsOutGrmUserDefFldHistTrxUsr(String value) {
        this.outGrpHistoryFieldsOutGrmUserDefFldHistTrxUsr = value;
    }

    /**
     * Gets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistTrxUsrSn property.
     * 
     */
    public int getOutGrpHistoryFieldsOutGrmUserDefFldHistTrxUsrSn() {
        return outGrpHistoryFieldsOutGrmUserDefFldHistTrxUsrSn;
    }

    /**
     * Sets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistTrxUsrSn property.
     * 
     */
    public void setOutGrpHistoryFieldsOutGrmUserDefFldHistTrxUsrSn(int value) {
        this.outGrpHistoryFieldsOutGrmUserDefFldHistTrxUsrSn = value;
    }

    /**
     * Gets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistUdAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHistoryFieldsOutGrmUserDefFldHistUdAccountNumber() {
        return outGrpHistoryFieldsOutGrmUserDefFldHistUdAccountNumber;
    }

    /**
     * Sets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistUdAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHistoryFieldsOutGrmUserDefFldHistUdAccountNumber(String value) {
        this.outGrpHistoryFieldsOutGrmUserDefFldHistUdAccountNumber = value;
    }

    /**
     * Gets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistUdCustomerCode property.
     * 
     */
    public double getOutGrpHistoryFieldsOutGrmUserDefFldHistUdCustomerCode() {
        return outGrpHistoryFieldsOutGrmUserDefFldHistUdCustomerCode;
    }

    /**
     * Sets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistUdCustomerCode property.
     * 
     */
    public void setOutGrpHistoryFieldsOutGrmUserDefFldHistUdCustomerCode(double value) {
        this.outGrpHistoryFieldsOutGrmUserDefFldHistUdCustomerCode = value;
    }

    /**
     * Gets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistUdPrftSystem property.
     * 
     */
    public short getOutGrpHistoryFieldsOutGrmUserDefFldHistUdPrftSystem() {
        return outGrpHistoryFieldsOutGrmUserDefFldHistUdPrftSystem;
    }

    /**
     * Sets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistUdPrftSystem property.
     * 
     */
    public void setOutGrpHistoryFieldsOutGrmUserDefFldHistUdPrftSystem(short value) {
        this.outGrpHistoryFieldsOutGrmUserDefFldHistUdPrftSystem = value;
    }

    /**
     * Gets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistUdRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHistoryFieldsOutGrmUserDefFldHistUdRecordType() {
        return outGrpHistoryFieldsOutGrmUserDefFldHistUdRecordType;
    }

    /**
     * Sets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistUdRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHistoryFieldsOutGrmUserDefFldHistUdRecordType(String value) {
        this.outGrpHistoryFieldsOutGrmUserDefFldHistUdRecordType = value;
    }

    /**
     * Gets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistUdSn property.
     * 
     */
    public short getOutGrpHistoryFieldsOutGrmUserDefFldHistUdSn() {
        return outGrpHistoryFieldsOutGrmUserDefFldHistUdSn;
    }

    /**
     * Sets the value of the outGrpHistoryFieldsOutGrmUserDefFldHistUdSn property.
     * 
     */
    public void setOutGrpHistoryFieldsOutGrmUserDefFldHistUdSn(short value) {
        this.outGrpHistoryFieldsOutGrmUserDefFldHistUdSn = value;
    }

}
