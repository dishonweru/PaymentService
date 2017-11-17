
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for A1910VOutGrpLogItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="A1910VOutGrpLogItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpLogOutGrmLogMntRecordingAuthorizer1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLogOutGrmLogMntRecordingAuthorizer2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLogOutGrmLogMntRecordingChannelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLogOutGrmLogMntRecordingGrpSubscript" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpLogOutGrmLogMntRecordingIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLogOutGrmLogMntRecordingIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLogOutGrmLogMntRecordingPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpLogOutGrmLogMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLogOutGrmLogMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLogOutGrmLogMntRecordingTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpLogOutGrmLogMntRecordingTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLogOutGrmLogMntRecordingTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpLogOutGrmLogMntRecordingTrxDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLogOutGrmLogMntRecordingTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLogOutGrmLogMntRecordingTrxUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLogOutGrmLogMntRecordingTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "A1910VOutGrpLogItem", propOrder = {
    "outGrpLogOutGrmLogMntRecordingAuthorizer1",
    "outGrpLogOutGrmLogMntRecordingAuthorizer2",
    "outGrpLogOutGrmLogMntRecordingChannelId",
    "outGrpLogOutGrmLogMntRecordingGrpSubscript",
    "outGrpLogOutGrmLogMntRecordingIdJustific",
    "outGrpLogOutGrmLogMntRecordingIdProduct",
    "outGrpLogOutGrmLogMntRecordingPrftSystem",
    "outGrpLogOutGrmLogMntRecordingReversalFlag",
    "outGrpLogOutGrmLogMntRecordingTerminalNumber",
    "outGrpLogOutGrmLogMntRecordingTmstamp",
    "outGrpLogOutGrmLogMntRecordingTrxCode",
    "outGrpLogOutGrmLogMntRecordingTrxDate",
    "outGrpLogOutGrmLogMntRecordingTrxDetails",
    "outGrpLogOutGrmLogMntRecordingTrxUnit",
    "outGrpLogOutGrmLogMntRecordingTrxUser",
    "outGrpLogOutGrmLogMntRecordingTrxUsrSn"
})
public class A1910VOutGrpLogItem {

    @XmlElement(name = "OutGrpLogOutGrmLogMntRecordingAuthorizer1")
    protected String outGrpLogOutGrmLogMntRecordingAuthorizer1;
    @XmlElement(name = "OutGrpLogOutGrmLogMntRecordingAuthorizer2")
    protected String outGrpLogOutGrmLogMntRecordingAuthorizer2;
    @XmlElement(name = "OutGrpLogOutGrmLogMntRecordingChannelId")
    protected int outGrpLogOutGrmLogMntRecordingChannelId;
    @XmlElement(name = "OutGrpLogOutGrmLogMntRecordingGrpSubscript")
    protected short outGrpLogOutGrmLogMntRecordingGrpSubscript;
    @XmlElement(name = "OutGrpLogOutGrmLogMntRecordingIdJustific")
    protected int outGrpLogOutGrmLogMntRecordingIdJustific;
    @XmlElement(name = "OutGrpLogOutGrmLogMntRecordingIdProduct")
    protected int outGrpLogOutGrmLogMntRecordingIdProduct;
    @XmlElement(name = "OutGrpLogOutGrmLogMntRecordingPrftSystem")
    protected short outGrpLogOutGrmLogMntRecordingPrftSystem;
    @XmlElement(name = "OutGrpLogOutGrmLogMntRecordingReversalFlag")
    protected String outGrpLogOutGrmLogMntRecordingReversalFlag;
    @XmlElement(name = "OutGrpLogOutGrmLogMntRecordingTerminalNumber")
    protected String outGrpLogOutGrmLogMntRecordingTerminalNumber;
    @XmlElement(name = "OutGrpLogOutGrmLogMntRecordingTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpLogOutGrmLogMntRecordingTmstamp;
    @XmlElement(name = "OutGrpLogOutGrmLogMntRecordingTrxCode")
    protected int outGrpLogOutGrmLogMntRecordingTrxCode;
    @XmlElement(name = "OutGrpLogOutGrmLogMntRecordingTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpLogOutGrmLogMntRecordingTrxDate;
    @XmlElement(name = "OutGrpLogOutGrmLogMntRecordingTrxDetails")
    protected String outGrpLogOutGrmLogMntRecordingTrxDetails;
    @XmlElement(name = "OutGrpLogOutGrmLogMntRecordingTrxUnit")
    protected int outGrpLogOutGrmLogMntRecordingTrxUnit;
    @XmlElement(name = "OutGrpLogOutGrmLogMntRecordingTrxUser")
    protected String outGrpLogOutGrmLogMntRecordingTrxUser;
    @XmlElement(name = "OutGrpLogOutGrmLogMntRecordingTrxUsrSn")
    protected int outGrpLogOutGrmLogMntRecordingTrxUsrSn;

    /**
     * Gets the value of the outGrpLogOutGrmLogMntRecordingAuthorizer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLogOutGrmLogMntRecordingAuthorizer1() {
        return outGrpLogOutGrmLogMntRecordingAuthorizer1;
    }

    /**
     * Sets the value of the outGrpLogOutGrmLogMntRecordingAuthorizer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLogOutGrmLogMntRecordingAuthorizer1(String value) {
        this.outGrpLogOutGrmLogMntRecordingAuthorizer1 = value;
    }

    /**
     * Gets the value of the outGrpLogOutGrmLogMntRecordingAuthorizer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLogOutGrmLogMntRecordingAuthorizer2() {
        return outGrpLogOutGrmLogMntRecordingAuthorizer2;
    }

    /**
     * Sets the value of the outGrpLogOutGrmLogMntRecordingAuthorizer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLogOutGrmLogMntRecordingAuthorizer2(String value) {
        this.outGrpLogOutGrmLogMntRecordingAuthorizer2 = value;
    }

    /**
     * Gets the value of the outGrpLogOutGrmLogMntRecordingChannelId property.
     * 
     */
    public int getOutGrpLogOutGrmLogMntRecordingChannelId() {
        return outGrpLogOutGrmLogMntRecordingChannelId;
    }

    /**
     * Sets the value of the outGrpLogOutGrmLogMntRecordingChannelId property.
     * 
     */
    public void setOutGrpLogOutGrmLogMntRecordingChannelId(int value) {
        this.outGrpLogOutGrmLogMntRecordingChannelId = value;
    }

    /**
     * Gets the value of the outGrpLogOutGrmLogMntRecordingGrpSubscript property.
     * 
     */
    public short getOutGrpLogOutGrmLogMntRecordingGrpSubscript() {
        return outGrpLogOutGrmLogMntRecordingGrpSubscript;
    }

    /**
     * Sets the value of the outGrpLogOutGrmLogMntRecordingGrpSubscript property.
     * 
     */
    public void setOutGrpLogOutGrmLogMntRecordingGrpSubscript(short value) {
        this.outGrpLogOutGrmLogMntRecordingGrpSubscript = value;
    }

    /**
     * Gets the value of the outGrpLogOutGrmLogMntRecordingIdJustific property.
     * 
     */
    public int getOutGrpLogOutGrmLogMntRecordingIdJustific() {
        return outGrpLogOutGrmLogMntRecordingIdJustific;
    }

    /**
     * Sets the value of the outGrpLogOutGrmLogMntRecordingIdJustific property.
     * 
     */
    public void setOutGrpLogOutGrmLogMntRecordingIdJustific(int value) {
        this.outGrpLogOutGrmLogMntRecordingIdJustific = value;
    }

    /**
     * Gets the value of the outGrpLogOutGrmLogMntRecordingIdProduct property.
     * 
     */
    public int getOutGrpLogOutGrmLogMntRecordingIdProduct() {
        return outGrpLogOutGrmLogMntRecordingIdProduct;
    }

    /**
     * Sets the value of the outGrpLogOutGrmLogMntRecordingIdProduct property.
     * 
     */
    public void setOutGrpLogOutGrmLogMntRecordingIdProduct(int value) {
        this.outGrpLogOutGrmLogMntRecordingIdProduct = value;
    }

    /**
     * Gets the value of the outGrpLogOutGrmLogMntRecordingPrftSystem property.
     * 
     */
    public short getOutGrpLogOutGrmLogMntRecordingPrftSystem() {
        return outGrpLogOutGrmLogMntRecordingPrftSystem;
    }

    /**
     * Sets the value of the outGrpLogOutGrmLogMntRecordingPrftSystem property.
     * 
     */
    public void setOutGrpLogOutGrmLogMntRecordingPrftSystem(short value) {
        this.outGrpLogOutGrmLogMntRecordingPrftSystem = value;
    }

    /**
     * Gets the value of the outGrpLogOutGrmLogMntRecordingReversalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLogOutGrmLogMntRecordingReversalFlag() {
        return outGrpLogOutGrmLogMntRecordingReversalFlag;
    }

    /**
     * Sets the value of the outGrpLogOutGrmLogMntRecordingReversalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLogOutGrmLogMntRecordingReversalFlag(String value) {
        this.outGrpLogOutGrmLogMntRecordingReversalFlag = value;
    }

    /**
     * Gets the value of the outGrpLogOutGrmLogMntRecordingTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLogOutGrmLogMntRecordingTerminalNumber() {
        return outGrpLogOutGrmLogMntRecordingTerminalNumber;
    }

    /**
     * Sets the value of the outGrpLogOutGrmLogMntRecordingTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLogOutGrmLogMntRecordingTerminalNumber(String value) {
        this.outGrpLogOutGrmLogMntRecordingTerminalNumber = value;
    }

    /**
     * Gets the value of the outGrpLogOutGrmLogMntRecordingTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpLogOutGrmLogMntRecordingTmstamp() {
        return outGrpLogOutGrmLogMntRecordingTmstamp;
    }

    /**
     * Sets the value of the outGrpLogOutGrmLogMntRecordingTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpLogOutGrmLogMntRecordingTmstamp(XMLGregorianCalendar value) {
        this.outGrpLogOutGrmLogMntRecordingTmstamp = value;
    }

    /**
     * Gets the value of the outGrpLogOutGrmLogMntRecordingTrxCode property.
     * 
     */
    public int getOutGrpLogOutGrmLogMntRecordingTrxCode() {
        return outGrpLogOutGrmLogMntRecordingTrxCode;
    }

    /**
     * Sets the value of the outGrpLogOutGrmLogMntRecordingTrxCode property.
     * 
     */
    public void setOutGrpLogOutGrmLogMntRecordingTrxCode(int value) {
        this.outGrpLogOutGrmLogMntRecordingTrxCode = value;
    }

    /**
     * Gets the value of the outGrpLogOutGrmLogMntRecordingTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpLogOutGrmLogMntRecordingTrxDate() {
        return outGrpLogOutGrmLogMntRecordingTrxDate;
    }

    /**
     * Sets the value of the outGrpLogOutGrmLogMntRecordingTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpLogOutGrmLogMntRecordingTrxDate(XMLGregorianCalendar value) {
        this.outGrpLogOutGrmLogMntRecordingTrxDate = value;
    }

    /**
     * Gets the value of the outGrpLogOutGrmLogMntRecordingTrxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLogOutGrmLogMntRecordingTrxDetails() {
        return outGrpLogOutGrmLogMntRecordingTrxDetails;
    }

    /**
     * Sets the value of the outGrpLogOutGrmLogMntRecordingTrxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLogOutGrmLogMntRecordingTrxDetails(String value) {
        this.outGrpLogOutGrmLogMntRecordingTrxDetails = value;
    }

    /**
     * Gets the value of the outGrpLogOutGrmLogMntRecordingTrxUnit property.
     * 
     */
    public int getOutGrpLogOutGrmLogMntRecordingTrxUnit() {
        return outGrpLogOutGrmLogMntRecordingTrxUnit;
    }

    /**
     * Sets the value of the outGrpLogOutGrmLogMntRecordingTrxUnit property.
     * 
     */
    public void setOutGrpLogOutGrmLogMntRecordingTrxUnit(int value) {
        this.outGrpLogOutGrmLogMntRecordingTrxUnit = value;
    }

    /**
     * Gets the value of the outGrpLogOutGrmLogMntRecordingTrxUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLogOutGrmLogMntRecordingTrxUser() {
        return outGrpLogOutGrmLogMntRecordingTrxUser;
    }

    /**
     * Sets the value of the outGrpLogOutGrmLogMntRecordingTrxUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLogOutGrmLogMntRecordingTrxUser(String value) {
        this.outGrpLogOutGrmLogMntRecordingTrxUser = value;
    }

    /**
     * Gets the value of the outGrpLogOutGrmLogMntRecordingTrxUsrSn property.
     * 
     */
    public int getOutGrpLogOutGrmLogMntRecordingTrxUsrSn() {
        return outGrpLogOutGrmLogMntRecordingTrxUsrSn;
    }

    /**
     * Sets the value of the outGrpLogOutGrmLogMntRecordingTrxUsrSn property.
     * 
     */
    public void setOutGrpLogOutGrmLogMntRecordingTrxUsrSn(int value) {
        this.outGrpLogOutGrmLogMntRecordingTrxUsrSn = value;
    }

}
