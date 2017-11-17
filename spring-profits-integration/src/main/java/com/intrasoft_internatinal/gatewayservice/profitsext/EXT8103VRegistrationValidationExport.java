
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EXT8103V_RegistrationValidationExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXT8103V_RegistrationValidationExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutResultExtIprofitsApplyMatchCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutResultExtIprofitsApplyMatchCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutResultExtIprofitsApplyMatchNumber" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutResultExtIprofitsApplyMatchedAccount7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultExtIprofitsApplyMatchedAddress6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultExtIprofitsApplyMatchedBirthday3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultExtIprofitsApplyMatchedEmail4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultExtIprofitsApplyMatchedId1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultExtIprofitsApplyMatchedMobile5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultExtIprofitsApplyMatchedName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultExtIprofitsApplyViewAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutResultExtIprofitsApplyViewAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultExtIprofitsApplyViewAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultExtIprofitsApplyViewAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultExtIprofitsApplyViewAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultExtIprofitsApplyViewDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutResultExtIprofitsApplyViewEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultExtIprofitsApplyViewFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultExtIprofitsApplyViewIdDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultExtIprofitsApplyViewIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultExtIprofitsApplyViewMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultExtIprofitsApplyViewMobileTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultExtIprofitsApplyViewPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutResultExtIprofitsApplyViewSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultExtIprofitsApplyViewZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultIprofitsApplVerifySuccesfulMatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXT8103V_RegistrationValidationExport", propOrder = {
    "outResultExtIprofitsApplyMatchCDigit",
    "outResultExtIprofitsApplyMatchCustId",
    "outResultExtIprofitsApplyMatchNumber",
    "outResultExtIprofitsApplyMatchedAccount7",
    "outResultExtIprofitsApplyMatchedAddress6",
    "outResultExtIprofitsApplyMatchedBirthday3",
    "outResultExtIprofitsApplyMatchedEmail4",
    "outResultExtIprofitsApplyMatchedId1",
    "outResultExtIprofitsApplyMatchedMobile5",
    "outResultExtIprofitsApplyMatchedName2",
    "outResultExtIprofitsApplyViewAccountCd",
    "outResultExtIprofitsApplyViewAccountNumber",
    "outResultExtIprofitsApplyViewAddress1",
    "outResultExtIprofitsApplyViewAddress2",
    "outResultExtIprofitsApplyViewAfmNo",
    "outResultExtIprofitsApplyViewDateOfBirth",
    "outResultExtIprofitsApplyViewEMail",
    "outResultExtIprofitsApplyViewFirstName",
    "outResultExtIprofitsApplyViewIdDescription",
    "outResultExtIprofitsApplyViewIdNo",
    "outResultExtIprofitsApplyViewMiddleName",
    "outResultExtIprofitsApplyViewMobileTel",
    "outResultExtIprofitsApplyViewPrftSystem",
    "outResultExtIprofitsApplyViewSurname",
    "outResultExtIprofitsApplyViewZipCode",
    "outResultIprofitsApplVerifySuccesfulMatch"
})
public class EXT8103VRegistrationValidationExport
    extends BaseExport
{

    @XmlElement(name = "OutResultExtIprofitsApplyMatchCDigit")
    protected short outResultExtIprofitsApplyMatchCDigit;
    @XmlElement(name = "OutResultExtIprofitsApplyMatchCustId")
    protected int outResultExtIprofitsApplyMatchCustId;
    @XmlElement(name = "OutResultExtIprofitsApplyMatchNumber")
    protected short outResultExtIprofitsApplyMatchNumber;
    @XmlElement(name = "OutResultExtIprofitsApplyMatchedAccount7")
    protected String outResultExtIprofitsApplyMatchedAccount7;
    @XmlElement(name = "OutResultExtIprofitsApplyMatchedAddress6")
    protected String outResultExtIprofitsApplyMatchedAddress6;
    @XmlElement(name = "OutResultExtIprofitsApplyMatchedBirthday3")
    protected String outResultExtIprofitsApplyMatchedBirthday3;
    @XmlElement(name = "OutResultExtIprofitsApplyMatchedEmail4")
    protected String outResultExtIprofitsApplyMatchedEmail4;
    @XmlElement(name = "OutResultExtIprofitsApplyMatchedId1")
    protected String outResultExtIprofitsApplyMatchedId1;
    @XmlElement(name = "OutResultExtIprofitsApplyMatchedMobile5")
    protected String outResultExtIprofitsApplyMatchedMobile5;
    @XmlElement(name = "OutResultExtIprofitsApplyMatchedName2")
    protected String outResultExtIprofitsApplyMatchedName2;
    @XmlElement(name = "OutResultExtIprofitsApplyViewAccountCd")
    protected short outResultExtIprofitsApplyViewAccountCd;
    @XmlElement(name = "OutResultExtIprofitsApplyViewAccountNumber")
    protected String outResultExtIprofitsApplyViewAccountNumber;
    @XmlElement(name = "OutResultExtIprofitsApplyViewAddress1")
    protected String outResultExtIprofitsApplyViewAddress1;
    @XmlElement(name = "OutResultExtIprofitsApplyViewAddress2")
    protected String outResultExtIprofitsApplyViewAddress2;
    @XmlElement(name = "OutResultExtIprofitsApplyViewAfmNo")
    protected String outResultExtIprofitsApplyViewAfmNo;
    @XmlElement(name = "OutResultExtIprofitsApplyViewDateOfBirth", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outResultExtIprofitsApplyViewDateOfBirth;
    @XmlElement(name = "OutResultExtIprofitsApplyViewEMail")
    protected String outResultExtIprofitsApplyViewEMail;
    @XmlElement(name = "OutResultExtIprofitsApplyViewFirstName")
    protected String outResultExtIprofitsApplyViewFirstName;
    @XmlElement(name = "OutResultExtIprofitsApplyViewIdDescription")
    protected String outResultExtIprofitsApplyViewIdDescription;
    @XmlElement(name = "OutResultExtIprofitsApplyViewIdNo")
    protected String outResultExtIprofitsApplyViewIdNo;
    @XmlElement(name = "OutResultExtIprofitsApplyViewMiddleName")
    protected String outResultExtIprofitsApplyViewMiddleName;
    @XmlElement(name = "OutResultExtIprofitsApplyViewMobileTel")
    protected String outResultExtIprofitsApplyViewMobileTel;
    @XmlElement(name = "OutResultExtIprofitsApplyViewPrftSystem")
    protected short outResultExtIprofitsApplyViewPrftSystem;
    @XmlElement(name = "OutResultExtIprofitsApplyViewSurname")
    protected String outResultExtIprofitsApplyViewSurname;
    @XmlElement(name = "OutResultExtIprofitsApplyViewZipCode")
    protected String outResultExtIprofitsApplyViewZipCode;
    @XmlElement(name = "OutResultIprofitsApplVerifySuccesfulMatch")
    protected String outResultIprofitsApplVerifySuccesfulMatch;

    /**
     * Gets the value of the outResultExtIprofitsApplyMatchCDigit property.
     * 
     */
    public short getOutResultExtIprofitsApplyMatchCDigit() {
        return outResultExtIprofitsApplyMatchCDigit;
    }

    /**
     * Sets the value of the outResultExtIprofitsApplyMatchCDigit property.
     * 
     */
    public void setOutResultExtIprofitsApplyMatchCDigit(short value) {
        this.outResultExtIprofitsApplyMatchCDigit = value;
    }

    /**
     * Gets the value of the outResultExtIprofitsApplyMatchCustId property.
     * 
     */
    public int getOutResultExtIprofitsApplyMatchCustId() {
        return outResultExtIprofitsApplyMatchCustId;
    }

    /**
     * Sets the value of the outResultExtIprofitsApplyMatchCustId property.
     * 
     */
    public void setOutResultExtIprofitsApplyMatchCustId(int value) {
        this.outResultExtIprofitsApplyMatchCustId = value;
    }

    /**
     * Gets the value of the outResultExtIprofitsApplyMatchNumber property.
     * 
     */
    public short getOutResultExtIprofitsApplyMatchNumber() {
        return outResultExtIprofitsApplyMatchNumber;
    }

    /**
     * Sets the value of the outResultExtIprofitsApplyMatchNumber property.
     * 
     */
    public void setOutResultExtIprofitsApplyMatchNumber(short value) {
        this.outResultExtIprofitsApplyMatchNumber = value;
    }

    /**
     * Gets the value of the outResultExtIprofitsApplyMatchedAccount7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultExtIprofitsApplyMatchedAccount7() {
        return outResultExtIprofitsApplyMatchedAccount7;
    }

    /**
     * Sets the value of the outResultExtIprofitsApplyMatchedAccount7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultExtIprofitsApplyMatchedAccount7(String value) {
        this.outResultExtIprofitsApplyMatchedAccount7 = value;
    }

    /**
     * Gets the value of the outResultExtIprofitsApplyMatchedAddress6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultExtIprofitsApplyMatchedAddress6() {
        return outResultExtIprofitsApplyMatchedAddress6;
    }

    /**
     * Sets the value of the outResultExtIprofitsApplyMatchedAddress6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultExtIprofitsApplyMatchedAddress6(String value) {
        this.outResultExtIprofitsApplyMatchedAddress6 = value;
    }

    /**
     * Gets the value of the outResultExtIprofitsApplyMatchedBirthday3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultExtIprofitsApplyMatchedBirthday3() {
        return outResultExtIprofitsApplyMatchedBirthday3;
    }

    /**
     * Sets the value of the outResultExtIprofitsApplyMatchedBirthday3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultExtIprofitsApplyMatchedBirthday3(String value) {
        this.outResultExtIprofitsApplyMatchedBirthday3 = value;
    }

    /**
     * Gets the value of the outResultExtIprofitsApplyMatchedEmail4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultExtIprofitsApplyMatchedEmail4() {
        return outResultExtIprofitsApplyMatchedEmail4;
    }

    /**
     * Sets the value of the outResultExtIprofitsApplyMatchedEmail4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultExtIprofitsApplyMatchedEmail4(String value) {
        this.outResultExtIprofitsApplyMatchedEmail4 = value;
    }

    /**
     * Gets the value of the outResultExtIprofitsApplyMatchedId1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultExtIprofitsApplyMatchedId1() {
        return outResultExtIprofitsApplyMatchedId1;
    }

    /**
     * Sets the value of the outResultExtIprofitsApplyMatchedId1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultExtIprofitsApplyMatchedId1(String value) {
        this.outResultExtIprofitsApplyMatchedId1 = value;
    }

    /**
     * Gets the value of the outResultExtIprofitsApplyMatchedMobile5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultExtIprofitsApplyMatchedMobile5() {
        return outResultExtIprofitsApplyMatchedMobile5;
    }

    /**
     * Sets the value of the outResultExtIprofitsApplyMatchedMobile5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultExtIprofitsApplyMatchedMobile5(String value) {
        this.outResultExtIprofitsApplyMatchedMobile5 = value;
    }

    /**
     * Gets the value of the outResultExtIprofitsApplyMatchedName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultExtIprofitsApplyMatchedName2() {
        return outResultExtIprofitsApplyMatchedName2;
    }

    /**
     * Sets the value of the outResultExtIprofitsApplyMatchedName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultExtIprofitsApplyMatchedName2(String value) {
        this.outResultExtIprofitsApplyMatchedName2 = value;
    }

    /**
     * Gets the value of the outResultExtIprofitsApplyViewAccountCd property.
     * 
     */
    public short getOutResultExtIprofitsApplyViewAccountCd() {
        return outResultExtIprofitsApplyViewAccountCd;
    }

    /**
     * Sets the value of the outResultExtIprofitsApplyViewAccountCd property.
     * 
     */
    public void setOutResultExtIprofitsApplyViewAccountCd(short value) {
        this.outResultExtIprofitsApplyViewAccountCd = value;
    }

    /**
     * Gets the value of the outResultExtIprofitsApplyViewAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultExtIprofitsApplyViewAccountNumber() {
        return outResultExtIprofitsApplyViewAccountNumber;
    }

    /**
     * Sets the value of the outResultExtIprofitsApplyViewAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultExtIprofitsApplyViewAccountNumber(String value) {
        this.outResultExtIprofitsApplyViewAccountNumber = value;
    }

    /**
     * Gets the value of the outResultExtIprofitsApplyViewAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultExtIprofitsApplyViewAddress1() {
        return outResultExtIprofitsApplyViewAddress1;
    }

    /**
     * Sets the value of the outResultExtIprofitsApplyViewAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultExtIprofitsApplyViewAddress1(String value) {
        this.outResultExtIprofitsApplyViewAddress1 = value;
    }

    /**
     * Gets the value of the outResultExtIprofitsApplyViewAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultExtIprofitsApplyViewAddress2() {
        return outResultExtIprofitsApplyViewAddress2;
    }

    /**
     * Sets the value of the outResultExtIprofitsApplyViewAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultExtIprofitsApplyViewAddress2(String value) {
        this.outResultExtIprofitsApplyViewAddress2 = value;
    }

    /**
     * Gets the value of the outResultExtIprofitsApplyViewAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultExtIprofitsApplyViewAfmNo() {
        return outResultExtIprofitsApplyViewAfmNo;
    }

    /**
     * Sets the value of the outResultExtIprofitsApplyViewAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultExtIprofitsApplyViewAfmNo(String value) {
        this.outResultExtIprofitsApplyViewAfmNo = value;
    }

    /**
     * Gets the value of the outResultExtIprofitsApplyViewDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutResultExtIprofitsApplyViewDateOfBirth() {
        return outResultExtIprofitsApplyViewDateOfBirth;
    }

    /**
     * Sets the value of the outResultExtIprofitsApplyViewDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutResultExtIprofitsApplyViewDateOfBirth(XMLGregorianCalendar value) {
        this.outResultExtIprofitsApplyViewDateOfBirth = value;
    }

    /**
     * Gets the value of the outResultExtIprofitsApplyViewEMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultExtIprofitsApplyViewEMail() {
        return outResultExtIprofitsApplyViewEMail;
    }

    /**
     * Sets the value of the outResultExtIprofitsApplyViewEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultExtIprofitsApplyViewEMail(String value) {
        this.outResultExtIprofitsApplyViewEMail = value;
    }

    /**
     * Gets the value of the outResultExtIprofitsApplyViewFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultExtIprofitsApplyViewFirstName() {
        return outResultExtIprofitsApplyViewFirstName;
    }

    /**
     * Sets the value of the outResultExtIprofitsApplyViewFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultExtIprofitsApplyViewFirstName(String value) {
        this.outResultExtIprofitsApplyViewFirstName = value;
    }

    /**
     * Gets the value of the outResultExtIprofitsApplyViewIdDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultExtIprofitsApplyViewIdDescription() {
        return outResultExtIprofitsApplyViewIdDescription;
    }

    /**
     * Sets the value of the outResultExtIprofitsApplyViewIdDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultExtIprofitsApplyViewIdDescription(String value) {
        this.outResultExtIprofitsApplyViewIdDescription = value;
    }

    /**
     * Gets the value of the outResultExtIprofitsApplyViewIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultExtIprofitsApplyViewIdNo() {
        return outResultExtIprofitsApplyViewIdNo;
    }

    /**
     * Sets the value of the outResultExtIprofitsApplyViewIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultExtIprofitsApplyViewIdNo(String value) {
        this.outResultExtIprofitsApplyViewIdNo = value;
    }

    /**
     * Gets the value of the outResultExtIprofitsApplyViewMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultExtIprofitsApplyViewMiddleName() {
        return outResultExtIprofitsApplyViewMiddleName;
    }

    /**
     * Sets the value of the outResultExtIprofitsApplyViewMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultExtIprofitsApplyViewMiddleName(String value) {
        this.outResultExtIprofitsApplyViewMiddleName = value;
    }

    /**
     * Gets the value of the outResultExtIprofitsApplyViewMobileTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultExtIprofitsApplyViewMobileTel() {
        return outResultExtIprofitsApplyViewMobileTel;
    }

    /**
     * Sets the value of the outResultExtIprofitsApplyViewMobileTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultExtIprofitsApplyViewMobileTel(String value) {
        this.outResultExtIprofitsApplyViewMobileTel = value;
    }

    /**
     * Gets the value of the outResultExtIprofitsApplyViewPrftSystem property.
     * 
     */
    public short getOutResultExtIprofitsApplyViewPrftSystem() {
        return outResultExtIprofitsApplyViewPrftSystem;
    }

    /**
     * Sets the value of the outResultExtIprofitsApplyViewPrftSystem property.
     * 
     */
    public void setOutResultExtIprofitsApplyViewPrftSystem(short value) {
        this.outResultExtIprofitsApplyViewPrftSystem = value;
    }

    /**
     * Gets the value of the outResultExtIprofitsApplyViewSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultExtIprofitsApplyViewSurname() {
        return outResultExtIprofitsApplyViewSurname;
    }

    /**
     * Sets the value of the outResultExtIprofitsApplyViewSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultExtIprofitsApplyViewSurname(String value) {
        this.outResultExtIprofitsApplyViewSurname = value;
    }

    /**
     * Gets the value of the outResultExtIprofitsApplyViewZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultExtIprofitsApplyViewZipCode() {
        return outResultExtIprofitsApplyViewZipCode;
    }

    /**
     * Sets the value of the outResultExtIprofitsApplyViewZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultExtIprofitsApplyViewZipCode(String value) {
        this.outResultExtIprofitsApplyViewZipCode = value;
    }

    /**
     * Gets the value of the outResultIprofitsApplVerifySuccesfulMatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultIprofitsApplVerifySuccesfulMatch() {
        return outResultIprofitsApplVerifySuccesfulMatch;
    }

    /**
     * Sets the value of the outResultIprofitsApplVerifySuccesfulMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultIprofitsApplVerifySuccesfulMatch(String value) {
        this.outResultIprofitsApplVerifySuccesfulMatch = value;
    }

}
