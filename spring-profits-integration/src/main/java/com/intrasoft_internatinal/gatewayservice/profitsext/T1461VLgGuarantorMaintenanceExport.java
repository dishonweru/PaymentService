
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for T1461VLgGuarantorMaintenanceExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T1461VLgGuarantorMaintenanceExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutBenefCategoryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLgBeneficiaryAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgBeneficiaryAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgBeneficiaryAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgBeneficiaryCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgBeneficiaryCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLgBeneficiaryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgBeneficiaryEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgBeneficiaryIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgBeneficiaryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgBeneficiaryProfession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgBeneficiaryRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgBeneficiarySurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgBeneficiaryTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgBeneficiaryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgBeneficiaryZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMntRecordingTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T1461VLgGuarantorMaintenanceExport", propOrder = {
    "outBenefCategoryGenericDetailSerialNum",
    "outLgBeneficiaryAddress",
    "outLgBeneficiaryAddress2",
    "outLgBeneficiaryAfmNo",
    "outLgBeneficiaryCity",
    "outLgBeneficiaryCode",
    "outLgBeneficiaryComments",
    "outLgBeneficiaryEntryStatus",
    "outLgBeneficiaryIdNo",
    "outLgBeneficiaryName",
    "outLgBeneficiaryProfession",
    "outLgBeneficiaryRegion",
    "outLgBeneficiarySurname",
    "outLgBeneficiaryTelephone",
    "outLgBeneficiaryType",
    "outLgBeneficiaryZipCode",
    "outMntRecordingTmstamp",
    "outTrxCountTrxCounter",
    "outTypeGenericDetailDescription",
    "outTypeGenericDetailSerialNum"
})
public class T1461VLgGuarantorMaintenanceExport
    extends BaseExport
{

    @XmlElement(name = "OutBenefCategoryGenericDetailSerialNum")
    protected int outBenefCategoryGenericDetailSerialNum;
    @XmlElement(name = "OutLgBeneficiaryAddress")
    protected String outLgBeneficiaryAddress;
    @XmlElement(name = "OutLgBeneficiaryAddress2")
    protected String outLgBeneficiaryAddress2;
    @XmlElement(name = "OutLgBeneficiaryAfmNo")
    protected String outLgBeneficiaryAfmNo;
    @XmlElement(name = "OutLgBeneficiaryCity")
    protected String outLgBeneficiaryCity;
    @XmlElement(name = "OutLgBeneficiaryCode")
    protected int outLgBeneficiaryCode;
    @XmlElement(name = "OutLgBeneficiaryComments")
    protected String outLgBeneficiaryComments;
    @XmlElement(name = "OutLgBeneficiaryEntryStatus")
    protected String outLgBeneficiaryEntryStatus;
    @XmlElement(name = "OutLgBeneficiaryIdNo")
    protected String outLgBeneficiaryIdNo;
    @XmlElement(name = "OutLgBeneficiaryName")
    protected String outLgBeneficiaryName;
    @XmlElement(name = "OutLgBeneficiaryProfession")
    protected String outLgBeneficiaryProfession;
    @XmlElement(name = "OutLgBeneficiaryRegion")
    protected String outLgBeneficiaryRegion;
    @XmlElement(name = "OutLgBeneficiarySurname")
    protected String outLgBeneficiarySurname;
    @XmlElement(name = "OutLgBeneficiaryTelephone")
    protected String outLgBeneficiaryTelephone;
    @XmlElement(name = "OutLgBeneficiaryType")
    protected String outLgBeneficiaryType;
    @XmlElement(name = "OutLgBeneficiaryZipCode")
    protected String outLgBeneficiaryZipCode;
    @XmlElement(name = "OutMntRecordingTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outMntRecordingTmstamp;
    @XmlElement(name = "OutTrxCountTrxCounter")
    protected int outTrxCountTrxCounter;
    @XmlElement(name = "OutTypeGenericDetailDescription")
    protected String outTypeGenericDetailDescription;
    @XmlElement(name = "OutTypeGenericDetailSerialNum")
    protected int outTypeGenericDetailSerialNum;

    /**
     * Gets the value of the outBenefCategoryGenericDetailSerialNum property.
     * 
     */
    public int getOutBenefCategoryGenericDetailSerialNum() {
        return outBenefCategoryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outBenefCategoryGenericDetailSerialNum property.
     * 
     */
    public void setOutBenefCategoryGenericDetailSerialNum(int value) {
        this.outBenefCategoryGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outLgBeneficiaryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgBeneficiaryAddress() {
        return outLgBeneficiaryAddress;
    }

    /**
     * Sets the value of the outLgBeneficiaryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgBeneficiaryAddress(String value) {
        this.outLgBeneficiaryAddress = value;
    }

    /**
     * Gets the value of the outLgBeneficiaryAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgBeneficiaryAddress2() {
        return outLgBeneficiaryAddress2;
    }

    /**
     * Sets the value of the outLgBeneficiaryAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgBeneficiaryAddress2(String value) {
        this.outLgBeneficiaryAddress2 = value;
    }

    /**
     * Gets the value of the outLgBeneficiaryAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgBeneficiaryAfmNo() {
        return outLgBeneficiaryAfmNo;
    }

    /**
     * Sets the value of the outLgBeneficiaryAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgBeneficiaryAfmNo(String value) {
        this.outLgBeneficiaryAfmNo = value;
    }

    /**
     * Gets the value of the outLgBeneficiaryCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgBeneficiaryCity() {
        return outLgBeneficiaryCity;
    }

    /**
     * Sets the value of the outLgBeneficiaryCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgBeneficiaryCity(String value) {
        this.outLgBeneficiaryCity = value;
    }

    /**
     * Gets the value of the outLgBeneficiaryCode property.
     * 
     */
    public int getOutLgBeneficiaryCode() {
        return outLgBeneficiaryCode;
    }

    /**
     * Sets the value of the outLgBeneficiaryCode property.
     * 
     */
    public void setOutLgBeneficiaryCode(int value) {
        this.outLgBeneficiaryCode = value;
    }

    /**
     * Gets the value of the outLgBeneficiaryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgBeneficiaryComments() {
        return outLgBeneficiaryComments;
    }

    /**
     * Sets the value of the outLgBeneficiaryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgBeneficiaryComments(String value) {
        this.outLgBeneficiaryComments = value;
    }

    /**
     * Gets the value of the outLgBeneficiaryEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgBeneficiaryEntryStatus() {
        return outLgBeneficiaryEntryStatus;
    }

    /**
     * Sets the value of the outLgBeneficiaryEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgBeneficiaryEntryStatus(String value) {
        this.outLgBeneficiaryEntryStatus = value;
    }

    /**
     * Gets the value of the outLgBeneficiaryIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgBeneficiaryIdNo() {
        return outLgBeneficiaryIdNo;
    }

    /**
     * Sets the value of the outLgBeneficiaryIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgBeneficiaryIdNo(String value) {
        this.outLgBeneficiaryIdNo = value;
    }

    /**
     * Gets the value of the outLgBeneficiaryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgBeneficiaryName() {
        return outLgBeneficiaryName;
    }

    /**
     * Sets the value of the outLgBeneficiaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgBeneficiaryName(String value) {
        this.outLgBeneficiaryName = value;
    }

    /**
     * Gets the value of the outLgBeneficiaryProfession property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgBeneficiaryProfession() {
        return outLgBeneficiaryProfession;
    }

    /**
     * Sets the value of the outLgBeneficiaryProfession property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgBeneficiaryProfession(String value) {
        this.outLgBeneficiaryProfession = value;
    }

    /**
     * Gets the value of the outLgBeneficiaryRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgBeneficiaryRegion() {
        return outLgBeneficiaryRegion;
    }

    /**
     * Sets the value of the outLgBeneficiaryRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgBeneficiaryRegion(String value) {
        this.outLgBeneficiaryRegion = value;
    }

    /**
     * Gets the value of the outLgBeneficiarySurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgBeneficiarySurname() {
        return outLgBeneficiarySurname;
    }

    /**
     * Sets the value of the outLgBeneficiarySurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgBeneficiarySurname(String value) {
        this.outLgBeneficiarySurname = value;
    }

    /**
     * Gets the value of the outLgBeneficiaryTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgBeneficiaryTelephone() {
        return outLgBeneficiaryTelephone;
    }

    /**
     * Sets the value of the outLgBeneficiaryTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgBeneficiaryTelephone(String value) {
        this.outLgBeneficiaryTelephone = value;
    }

    /**
     * Gets the value of the outLgBeneficiaryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgBeneficiaryType() {
        return outLgBeneficiaryType;
    }

    /**
     * Sets the value of the outLgBeneficiaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgBeneficiaryType(String value) {
        this.outLgBeneficiaryType = value;
    }

    /**
     * Gets the value of the outLgBeneficiaryZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgBeneficiaryZipCode() {
        return outLgBeneficiaryZipCode;
    }

    /**
     * Sets the value of the outLgBeneficiaryZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgBeneficiaryZipCode(String value) {
        this.outLgBeneficiaryZipCode = value;
    }

    /**
     * Gets the value of the outMntRecordingTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutMntRecordingTmstamp() {
        return outMntRecordingTmstamp;
    }

    /**
     * Sets the value of the outMntRecordingTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutMntRecordingTmstamp(XMLGregorianCalendar value) {
        this.outMntRecordingTmstamp = value;
    }

    /**
     * Gets the value of the outTrxCountTrxCounter property.
     * 
     */
    public int getOutTrxCountTrxCounter() {
        return outTrxCountTrxCounter;
    }

    /**
     * Sets the value of the outTrxCountTrxCounter property.
     * 
     */
    public void setOutTrxCountTrxCounter(int value) {
        this.outTrxCountTrxCounter = value;
    }

    /**
     * Gets the value of the outTypeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTypeGenericDetailDescription() {
        return outTypeGenericDetailDescription;
    }

    /**
     * Sets the value of the outTypeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTypeGenericDetailDescription(String value) {
        this.outTypeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outTypeGenericDetailSerialNum property.
     * 
     */
    public int getOutTypeGenericDetailSerialNum() {
        return outTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outTypeGenericDetailSerialNum property.
     * 
     */
    public void setOutTypeGenericDetailSerialNum(int value) {
        this.outTypeGenericDetailSerialNum = value;
    }

}
