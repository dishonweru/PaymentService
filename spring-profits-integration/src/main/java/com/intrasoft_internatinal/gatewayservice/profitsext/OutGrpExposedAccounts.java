
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutGrpExposedAccounts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpExposedAccounts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpOutGrmChanelDescDistrChannelDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmCustAccExtrnChnAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmCustAccExtrnChnAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmCustAccExtrnChnCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmCustAccExtrnChnExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmCustAccExtrnChnPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmCustAccExtrnChnRegistrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmCustAccExtrnChnStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmRegTypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmRegTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmSelIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSsGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpExposedAccounts", propOrder = {
    "outGrpOutGrmChanelDescDistrChannelDescription",
    "outGrpOutGrmCustAccExtrnChnAccountCd",
    "outGrpOutGrmCustAccExtrnChnAccountNumber",
    "outGrpOutGrmCustAccExtrnChnCustId",
    "outGrpOutGrmCustAccExtrnChnExpirationDate",
    "outGrpOutGrmCustAccExtrnChnPrftSystem",
    "outGrpOutGrmCustAccExtrnChnRegistrationId",
    "outGrpOutGrmCustAccExtrnChnStatus",
    "outGrpOutGrmRegTypeGenericDetailDescription",
    "outGrpOutGrmRegTypeGenericDetailSerialNum",
    "outGrpOutGrmSelIefSuppliedSelectChar",
    "outGrpOutGrmSsGenericDetailDescription"
})
public class OutGrpExposedAccounts {

    @XmlElement(name = "OutGrpOutGrmChanelDescDistrChannelDescription")
    protected String outGrpOutGrmChanelDescDistrChannelDescription;
    @XmlElement(name = "OutGrpOutGrmCustAccExtrnChnAccountCd")
    protected short outGrpOutGrmCustAccExtrnChnAccountCd;
    @XmlElement(name = "OutGrpOutGrmCustAccExtrnChnAccountNumber")
    protected String outGrpOutGrmCustAccExtrnChnAccountNumber;
    @XmlElement(name = "OutGrpOutGrmCustAccExtrnChnCustId")
    protected int outGrpOutGrmCustAccExtrnChnCustId;
    @XmlElement(name = "OutGrpOutGrmCustAccExtrnChnExpirationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmCustAccExtrnChnExpirationDate;
    @XmlElement(name = "OutGrpOutGrmCustAccExtrnChnPrftSystem")
    protected short outGrpOutGrmCustAccExtrnChnPrftSystem;
    @XmlElement(name = "OutGrpOutGrmCustAccExtrnChnRegistrationId")
    protected String outGrpOutGrmCustAccExtrnChnRegistrationId;
    @XmlElement(name = "OutGrpOutGrmCustAccExtrnChnStatus")
    protected String outGrpOutGrmCustAccExtrnChnStatus;
    @XmlElement(name = "OutGrpOutGrmRegTypeGenericDetailDescription")
    protected String outGrpOutGrmRegTypeGenericDetailDescription;
    @XmlElement(name = "OutGrpOutGrmRegTypeGenericDetailSerialNum")
    protected int outGrpOutGrmRegTypeGenericDetailSerialNum;
    @XmlElement(name = "OutGrpOutGrmSelIefSuppliedSelectChar")
    protected String outGrpOutGrmSelIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpOutGrmSsGenericDetailDescription")
    protected String outGrpOutGrmSsGenericDetailDescription;

    /**
     * Gets the value of the outGrpOutGrmChanelDescDistrChannelDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmChanelDescDistrChannelDescription() {
        return outGrpOutGrmChanelDescDistrChannelDescription;
    }

    /**
     * Sets the value of the outGrpOutGrmChanelDescDistrChannelDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmChanelDescDistrChannelDescription(String value) {
        this.outGrpOutGrmChanelDescDistrChannelDescription = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCustAccExtrnChnAccountCd property.
     * 
     */
    public short getOutGrpOutGrmCustAccExtrnChnAccountCd() {
        return outGrpOutGrmCustAccExtrnChnAccountCd;
    }

    /**
     * Sets the value of the outGrpOutGrmCustAccExtrnChnAccountCd property.
     * 
     */
    public void setOutGrpOutGrmCustAccExtrnChnAccountCd(short value) {
        this.outGrpOutGrmCustAccExtrnChnAccountCd = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCustAccExtrnChnAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmCustAccExtrnChnAccountNumber() {
        return outGrpOutGrmCustAccExtrnChnAccountNumber;
    }

    /**
     * Sets the value of the outGrpOutGrmCustAccExtrnChnAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmCustAccExtrnChnAccountNumber(String value) {
        this.outGrpOutGrmCustAccExtrnChnAccountNumber = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCustAccExtrnChnCustId property.
     * 
     */
    public int getOutGrpOutGrmCustAccExtrnChnCustId() {
        return outGrpOutGrmCustAccExtrnChnCustId;
    }

    /**
     * Sets the value of the outGrpOutGrmCustAccExtrnChnCustId property.
     * 
     */
    public void setOutGrpOutGrmCustAccExtrnChnCustId(int value) {
        this.outGrpOutGrmCustAccExtrnChnCustId = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCustAccExtrnChnExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmCustAccExtrnChnExpirationDate() {
        return outGrpOutGrmCustAccExtrnChnExpirationDate;
    }

    /**
     * Sets the value of the outGrpOutGrmCustAccExtrnChnExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmCustAccExtrnChnExpirationDate(XMLGregorianCalendar value) {
        this.outGrpOutGrmCustAccExtrnChnExpirationDate = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCustAccExtrnChnPrftSystem property.
     * 
     */
    public short getOutGrpOutGrmCustAccExtrnChnPrftSystem() {
        return outGrpOutGrmCustAccExtrnChnPrftSystem;
    }

    /**
     * Sets the value of the outGrpOutGrmCustAccExtrnChnPrftSystem property.
     * 
     */
    public void setOutGrpOutGrmCustAccExtrnChnPrftSystem(short value) {
        this.outGrpOutGrmCustAccExtrnChnPrftSystem = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCustAccExtrnChnRegistrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmCustAccExtrnChnRegistrationId() {
        return outGrpOutGrmCustAccExtrnChnRegistrationId;
    }

    /**
     * Sets the value of the outGrpOutGrmCustAccExtrnChnRegistrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmCustAccExtrnChnRegistrationId(String value) {
        this.outGrpOutGrmCustAccExtrnChnRegistrationId = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCustAccExtrnChnStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmCustAccExtrnChnStatus() {
        return outGrpOutGrmCustAccExtrnChnStatus;
    }

    /**
     * Sets the value of the outGrpOutGrmCustAccExtrnChnStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmCustAccExtrnChnStatus(String value) {
        this.outGrpOutGrmCustAccExtrnChnStatus = value;
    }

    /**
     * Gets the value of the outGrpOutGrmRegTypeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmRegTypeGenericDetailDescription() {
        return outGrpOutGrmRegTypeGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpOutGrmRegTypeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmRegTypeGenericDetailDescription(String value) {
        this.outGrpOutGrmRegTypeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpOutGrmRegTypeGenericDetailSerialNum property.
     * 
     */
    public int getOutGrpOutGrmRegTypeGenericDetailSerialNum() {
        return outGrpOutGrmRegTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outGrpOutGrmRegTypeGenericDetailSerialNum property.
     * 
     */
    public void setOutGrpOutGrmRegTypeGenericDetailSerialNum(int value) {
        this.outGrpOutGrmRegTypeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSelIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSelIefSuppliedSelectChar() {
        return outGrpOutGrmSelIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpOutGrmSelIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSelIefSuppliedSelectChar(String value) {
        this.outGrpOutGrmSelIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSsGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSsGenericDetailDescription() {
        return outGrpOutGrmSsGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpOutGrmSsGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSsGenericDetailDescription(String value) {
        this.outGrpOutGrmSsGenericDetailDescription = value;
    }

}
