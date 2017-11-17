
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ExposeAccountMaintenanceExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExposeAccountMaintenanceExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutContinueCustAccExtrnChnAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutContinueCustAccExtrnChnAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutContinueCustAccExtrnChnExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutContinueCustAccExtrnChnPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutContinueCustAccExtrnChnRegistrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InContinueCustAccExtrnChnStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InContinueCustAccExtrnChnTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDetailsCustAccExtrnChnAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDetailsCustAccExtrnChnAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDetailsCustAccExtrnChnExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDetailsCustAccExtrnChnPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDetailsCustAccExtrnChnRegistrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDetailsCustAccExtrnChnStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDetailsRegTypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDetailsRegTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpExposedAccounts" minOccurs="0"/>
 *         &lt;element name="OutKeyCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutKeyCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutKeyCustomerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NotFound" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsMore" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExposeAccountMaintenanceExport", propOrder = {
    "outContinueCustAccExtrnChnAccountCd",
    "outContinueCustAccExtrnChnAccountNumber",
    "outContinueCustAccExtrnChnExpirationDate",
    "outContinueCustAccExtrnChnPrftSystem",
    "outContinueCustAccExtrnChnRegistrationId",
    "inContinueCustAccExtrnChnStatus",
    "inContinueCustAccExtrnChnTmstamp",
    "outCustListSetDescription",
    "outDetailsCustAccExtrnChnAccountCd",
    "outDetailsCustAccExtrnChnAccountNumber",
    "outDetailsCustAccExtrnChnExpirationDate",
    "outDetailsCustAccExtrnChnPrftSystem",
    "outDetailsCustAccExtrnChnRegistrationId",
    "outDetailsCustAccExtrnChnStatus",
    "outDetailsRegTypeGenericDetailDescription",
    "outDetailsRegTypeGenericDetailSerialNum",
    "outGrp",
    "outKeyCustomerCDigit",
    "outKeyCustomerCustId",
    "outKeyCustomerDateOfBirth",
    "notFound",
    "isMore"
})
public class ExposeAccountMaintenanceExport
    extends BaseExport
{

    @XmlElement(name = "OutContinueCustAccExtrnChnAccountCd")
    protected short outContinueCustAccExtrnChnAccountCd;
    @XmlElement(name = "OutContinueCustAccExtrnChnAccountNumber")
    protected String outContinueCustAccExtrnChnAccountNumber;
    @XmlElement(name = "OutContinueCustAccExtrnChnExpirationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outContinueCustAccExtrnChnExpirationDate;
    @XmlElement(name = "OutContinueCustAccExtrnChnPrftSystem")
    protected short outContinueCustAccExtrnChnPrftSystem;
    @XmlElement(name = "OutContinueCustAccExtrnChnRegistrationId")
    protected String outContinueCustAccExtrnChnRegistrationId;
    @XmlElement(name = "InContinueCustAccExtrnChnStatus")
    protected String inContinueCustAccExtrnChnStatus;
    @XmlElement(name = "InContinueCustAccExtrnChnTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inContinueCustAccExtrnChnTmstamp;
    @XmlElement(name = "OutCustListSetDescription")
    protected String outCustListSetDescription;
    @XmlElement(name = "OutDetailsCustAccExtrnChnAccountCd")
    protected short outDetailsCustAccExtrnChnAccountCd;
    @XmlElement(name = "OutDetailsCustAccExtrnChnAccountNumber")
    protected String outDetailsCustAccExtrnChnAccountNumber;
    @XmlElement(name = "OutDetailsCustAccExtrnChnExpirationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDetailsCustAccExtrnChnExpirationDate;
    @XmlElement(name = "OutDetailsCustAccExtrnChnPrftSystem")
    protected short outDetailsCustAccExtrnChnPrftSystem;
    @XmlElement(name = "OutDetailsCustAccExtrnChnRegistrationId")
    protected String outDetailsCustAccExtrnChnRegistrationId;
    @XmlElement(name = "OutDetailsCustAccExtrnChnStatus")
    protected String outDetailsCustAccExtrnChnStatus;
    @XmlElement(name = "OutDetailsRegTypeGenericDetailDescription")
    protected String outDetailsRegTypeGenericDetailDescription;
    @XmlElement(name = "OutDetailsRegTypeGenericDetailSerialNum")
    protected int outDetailsRegTypeGenericDetailSerialNum;
    @XmlElement(name = "OutGrp")
    protected ArrayOfOutGrpExposedAccounts outGrp;
    @XmlElement(name = "OutKeyCustomerCDigit")
    protected short outKeyCustomerCDigit;
    @XmlElement(name = "OutKeyCustomerCustId")
    protected int outKeyCustomerCustId;
    @XmlElement(name = "OutKeyCustomerDateOfBirth", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outKeyCustomerDateOfBirth;
    @XmlElement(name = "NotFound")
    protected boolean notFound;
    @XmlElement(name = "IsMore")
    protected boolean isMore;

    /**
     * Gets the value of the outContinueCustAccExtrnChnAccountCd property.
     * 
     */
    public short getOutContinueCustAccExtrnChnAccountCd() {
        return outContinueCustAccExtrnChnAccountCd;
    }

    /**
     * Sets the value of the outContinueCustAccExtrnChnAccountCd property.
     * 
     */
    public void setOutContinueCustAccExtrnChnAccountCd(short value) {
        this.outContinueCustAccExtrnChnAccountCd = value;
    }

    /**
     * Gets the value of the outContinueCustAccExtrnChnAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutContinueCustAccExtrnChnAccountNumber() {
        return outContinueCustAccExtrnChnAccountNumber;
    }

    /**
     * Sets the value of the outContinueCustAccExtrnChnAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutContinueCustAccExtrnChnAccountNumber(String value) {
        this.outContinueCustAccExtrnChnAccountNumber = value;
    }

    /**
     * Gets the value of the outContinueCustAccExtrnChnExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutContinueCustAccExtrnChnExpirationDate() {
        return outContinueCustAccExtrnChnExpirationDate;
    }

    /**
     * Sets the value of the outContinueCustAccExtrnChnExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutContinueCustAccExtrnChnExpirationDate(XMLGregorianCalendar value) {
        this.outContinueCustAccExtrnChnExpirationDate = value;
    }

    /**
     * Gets the value of the outContinueCustAccExtrnChnPrftSystem property.
     * 
     */
    public short getOutContinueCustAccExtrnChnPrftSystem() {
        return outContinueCustAccExtrnChnPrftSystem;
    }

    /**
     * Sets the value of the outContinueCustAccExtrnChnPrftSystem property.
     * 
     */
    public void setOutContinueCustAccExtrnChnPrftSystem(short value) {
        this.outContinueCustAccExtrnChnPrftSystem = value;
    }

    /**
     * Gets the value of the outContinueCustAccExtrnChnRegistrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutContinueCustAccExtrnChnRegistrationId() {
        return outContinueCustAccExtrnChnRegistrationId;
    }

    /**
     * Sets the value of the outContinueCustAccExtrnChnRegistrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutContinueCustAccExtrnChnRegistrationId(String value) {
        this.outContinueCustAccExtrnChnRegistrationId = value;
    }

    /**
     * Gets the value of the inContinueCustAccExtrnChnStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInContinueCustAccExtrnChnStatus() {
        return inContinueCustAccExtrnChnStatus;
    }

    /**
     * Sets the value of the inContinueCustAccExtrnChnStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInContinueCustAccExtrnChnStatus(String value) {
        this.inContinueCustAccExtrnChnStatus = value;
    }

    /**
     * Gets the value of the inContinueCustAccExtrnChnTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInContinueCustAccExtrnChnTmstamp() {
        return inContinueCustAccExtrnChnTmstamp;
    }

    /**
     * Sets the value of the inContinueCustAccExtrnChnTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInContinueCustAccExtrnChnTmstamp(XMLGregorianCalendar value) {
        this.inContinueCustAccExtrnChnTmstamp = value;
    }

    /**
     * Gets the value of the outCustListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustListSetDescription() {
        return outCustListSetDescription;
    }

    /**
     * Sets the value of the outCustListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustListSetDescription(String value) {
        this.outCustListSetDescription = value;
    }

    /**
     * Gets the value of the outDetailsCustAccExtrnChnAccountCd property.
     * 
     */
    public short getOutDetailsCustAccExtrnChnAccountCd() {
        return outDetailsCustAccExtrnChnAccountCd;
    }

    /**
     * Sets the value of the outDetailsCustAccExtrnChnAccountCd property.
     * 
     */
    public void setOutDetailsCustAccExtrnChnAccountCd(short value) {
        this.outDetailsCustAccExtrnChnAccountCd = value;
    }

    /**
     * Gets the value of the outDetailsCustAccExtrnChnAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDetailsCustAccExtrnChnAccountNumber() {
        return outDetailsCustAccExtrnChnAccountNumber;
    }

    /**
     * Sets the value of the outDetailsCustAccExtrnChnAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDetailsCustAccExtrnChnAccountNumber(String value) {
        this.outDetailsCustAccExtrnChnAccountNumber = value;
    }

    /**
     * Gets the value of the outDetailsCustAccExtrnChnExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDetailsCustAccExtrnChnExpirationDate() {
        return outDetailsCustAccExtrnChnExpirationDate;
    }

    /**
     * Sets the value of the outDetailsCustAccExtrnChnExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDetailsCustAccExtrnChnExpirationDate(XMLGregorianCalendar value) {
        this.outDetailsCustAccExtrnChnExpirationDate = value;
    }

    /**
     * Gets the value of the outDetailsCustAccExtrnChnPrftSystem property.
     * 
     */
    public short getOutDetailsCustAccExtrnChnPrftSystem() {
        return outDetailsCustAccExtrnChnPrftSystem;
    }

    /**
     * Sets the value of the outDetailsCustAccExtrnChnPrftSystem property.
     * 
     */
    public void setOutDetailsCustAccExtrnChnPrftSystem(short value) {
        this.outDetailsCustAccExtrnChnPrftSystem = value;
    }

    /**
     * Gets the value of the outDetailsCustAccExtrnChnRegistrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDetailsCustAccExtrnChnRegistrationId() {
        return outDetailsCustAccExtrnChnRegistrationId;
    }

    /**
     * Sets the value of the outDetailsCustAccExtrnChnRegistrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDetailsCustAccExtrnChnRegistrationId(String value) {
        this.outDetailsCustAccExtrnChnRegistrationId = value;
    }

    /**
     * Gets the value of the outDetailsCustAccExtrnChnStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDetailsCustAccExtrnChnStatus() {
        return outDetailsCustAccExtrnChnStatus;
    }

    /**
     * Sets the value of the outDetailsCustAccExtrnChnStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDetailsCustAccExtrnChnStatus(String value) {
        this.outDetailsCustAccExtrnChnStatus = value;
    }

    /**
     * Gets the value of the outDetailsRegTypeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDetailsRegTypeGenericDetailDescription() {
        return outDetailsRegTypeGenericDetailDescription;
    }

    /**
     * Sets the value of the outDetailsRegTypeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDetailsRegTypeGenericDetailDescription(String value) {
        this.outDetailsRegTypeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outDetailsRegTypeGenericDetailSerialNum property.
     * 
     */
    public int getOutDetailsRegTypeGenericDetailSerialNum() {
        return outDetailsRegTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outDetailsRegTypeGenericDetailSerialNum property.
     * 
     */
    public void setOutDetailsRegTypeGenericDetailSerialNum(int value) {
        this.outDetailsRegTypeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpExposedAccounts }
     *     
     */
    public ArrayOfOutGrpExposedAccounts getOutGrp() {
        return outGrp;
    }

    /**
     * Sets the value of the outGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpExposedAccounts }
     *     
     */
    public void setOutGrp(ArrayOfOutGrpExposedAccounts value) {
        this.outGrp = value;
    }

    /**
     * Gets the value of the outKeyCustomerCDigit property.
     * 
     */
    public short getOutKeyCustomerCDigit() {
        return outKeyCustomerCDigit;
    }

    /**
     * Sets the value of the outKeyCustomerCDigit property.
     * 
     */
    public void setOutKeyCustomerCDigit(short value) {
        this.outKeyCustomerCDigit = value;
    }

    /**
     * Gets the value of the outKeyCustomerCustId property.
     * 
     */
    public int getOutKeyCustomerCustId() {
        return outKeyCustomerCustId;
    }

    /**
     * Sets the value of the outKeyCustomerCustId property.
     * 
     */
    public void setOutKeyCustomerCustId(int value) {
        this.outKeyCustomerCustId = value;
    }

    /**
     * Gets the value of the outKeyCustomerDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutKeyCustomerDateOfBirth() {
        return outKeyCustomerDateOfBirth;
    }

    /**
     * Sets the value of the outKeyCustomerDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutKeyCustomerDateOfBirth(XMLGregorianCalendar value) {
        this.outKeyCustomerDateOfBirth = value;
    }

    /**
     * Gets the value of the notFound property.
     * 
     */
    public boolean isNotFound() {
        return notFound;
    }

    /**
     * Sets the value of the notFound property.
     * 
     */
    public void setNotFound(boolean value) {
        this.notFound = value;
    }

    /**
     * Gets the value of the isMore property.
     * 
     */
    public boolean isIsMore() {
        return isMore;
    }

    /**
     * Sets the value of the isMore property.
     * 
     */
    public void setIsMore(boolean value) {
        this.isMore = value;
    }

}
