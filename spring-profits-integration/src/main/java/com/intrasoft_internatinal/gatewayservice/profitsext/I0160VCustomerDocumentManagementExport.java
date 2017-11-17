
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for I0160VCustomerDocumentManagementExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="I0160VCustomerDocumentManagementExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutAllowedGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAllowedGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAllowedGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCommntsProfitsDocumentsEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerDocumentsCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustomerDocumentsEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerDocumentsFkGdRqtp1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustomerDocumentsFkGdRqtp2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustomerDocumentsFkGdRqtp3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustomerDocumentsFkGhRqtp1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerDocumentsFkGhRqtp2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerDocumentsFkGhRqtp3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerDocumentsGivenFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerDocumentsInsertDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustomerDocumentsInsertUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustomerDocumentsInsertUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerDocumentsLinkedFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerDocumentsLinkedFileSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutCustomerDocumentsScannedFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerDocumentsScannedImageId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutCustomerDocumentsTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustomerDocumentsUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustomerDocumentsUpdateUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustomerDocumentsUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDocsGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDocsGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDocsGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutExistsIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTypeGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCustDocs" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfI0160VOutGrpCustDocsItem" minOccurs="0"/>
 *         &lt;element name="OutGrpDocumentsReq" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfI0160VOutGrpDocumentsReqItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "I0160VCustomerDocumentManagementExport", propOrder = {
    "outAllowedGenericDetailDescription",
    "outAllowedGenericDetailParameterType",
    "outAllowedGenericDetailSerialNum",
    "outCommntsProfitsDocumentsEntryComments",
    "outCustomerDocumentsCustId",
    "outCustomerDocumentsEntryComments",
    "outCustomerDocumentsFkGdRqtp1",
    "outCustomerDocumentsFkGdRqtp2",
    "outCustomerDocumentsFkGdRqtp3",
    "outCustomerDocumentsFkGhRqtp1",
    "outCustomerDocumentsFkGhRqtp2",
    "outCustomerDocumentsFkGhRqtp3",
    "outCustomerDocumentsGivenFlag",
    "outCustomerDocumentsInsertDate",
    "outCustomerDocumentsInsertUnit",
    "outCustomerDocumentsInsertUser",
    "outCustomerDocumentsLinkedFile",
    "outCustomerDocumentsLinkedFileSn",
    "outCustomerDocumentsScannedFile",
    "outCustomerDocumentsScannedImageId",
    "outCustomerDocumentsTmstamp",
    "outCustomerDocumentsUpdateDate",
    "outCustomerDocumentsUpdateUnit",
    "outCustomerDocumentsUpdateUser",
    "outDocsGenericDetailDescription",
    "outDocsGenericDetailParameterType",
    "outDocsGenericDetailSerialNum",
    "outExistsIefSuppliedFlag",
    "outTypeGenericDetailDescription",
    "outTypeGenericDetailParameterType",
    "outTypeGenericDetailSerialNum",
    "outGrpCustDocs",
    "outGrpDocumentsReq"
})
public class I0160VCustomerDocumentManagementExport
    extends BaseExport
{

    @XmlElement(name = "OutAllowedGenericDetailDescription")
    protected String outAllowedGenericDetailDescription;
    @XmlElement(name = "OutAllowedGenericDetailParameterType")
    protected String outAllowedGenericDetailParameterType;
    @XmlElement(name = "OutAllowedGenericDetailSerialNum")
    protected int outAllowedGenericDetailSerialNum;
    @XmlElement(name = "OutCommntsProfitsDocumentsEntryComments")
    protected String outCommntsProfitsDocumentsEntryComments;
    @XmlElement(name = "OutCustomerDocumentsCustId")
    protected int outCustomerDocumentsCustId;
    @XmlElement(name = "OutCustomerDocumentsEntryComments")
    protected String outCustomerDocumentsEntryComments;
    @XmlElement(name = "OutCustomerDocumentsFkGdRqtp1")
    protected int outCustomerDocumentsFkGdRqtp1;
    @XmlElement(name = "OutCustomerDocumentsFkGdRqtp2")
    protected int outCustomerDocumentsFkGdRqtp2;
    @XmlElement(name = "OutCustomerDocumentsFkGdRqtp3")
    protected int outCustomerDocumentsFkGdRqtp3;
    @XmlElement(name = "OutCustomerDocumentsFkGhRqtp1")
    protected String outCustomerDocumentsFkGhRqtp1;
    @XmlElement(name = "OutCustomerDocumentsFkGhRqtp2")
    protected String outCustomerDocumentsFkGhRqtp2;
    @XmlElement(name = "OutCustomerDocumentsFkGhRqtp3")
    protected String outCustomerDocumentsFkGhRqtp3;
    @XmlElement(name = "OutCustomerDocumentsGivenFlag")
    protected String outCustomerDocumentsGivenFlag;
    @XmlElement(name = "OutCustomerDocumentsInsertDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustomerDocumentsInsertDate;
    @XmlElement(name = "OutCustomerDocumentsInsertUnit")
    protected int outCustomerDocumentsInsertUnit;
    @XmlElement(name = "OutCustomerDocumentsInsertUser")
    protected String outCustomerDocumentsInsertUser;
    @XmlElement(name = "OutCustomerDocumentsLinkedFile")
    protected String outCustomerDocumentsLinkedFile;
    @XmlElement(name = "OutCustomerDocumentsLinkedFileSn")
    protected double outCustomerDocumentsLinkedFileSn;
    @XmlElement(name = "OutCustomerDocumentsScannedFile")
    protected String outCustomerDocumentsScannedFile;
    @XmlElement(name = "OutCustomerDocumentsScannedImageId")
    protected double outCustomerDocumentsScannedImageId;
    @XmlElement(name = "OutCustomerDocumentsTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustomerDocumentsTmstamp;
    @XmlElement(name = "OutCustomerDocumentsUpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustomerDocumentsUpdateDate;
    @XmlElement(name = "OutCustomerDocumentsUpdateUnit")
    protected int outCustomerDocumentsUpdateUnit;
    @XmlElement(name = "OutCustomerDocumentsUpdateUser")
    protected String outCustomerDocumentsUpdateUser;
    @XmlElement(name = "OutDocsGenericDetailDescription")
    protected String outDocsGenericDetailDescription;
    @XmlElement(name = "OutDocsGenericDetailParameterType")
    protected String outDocsGenericDetailParameterType;
    @XmlElement(name = "OutDocsGenericDetailSerialNum")
    protected int outDocsGenericDetailSerialNum;
    @XmlElement(name = "OutExistsIefSuppliedFlag")
    protected String outExistsIefSuppliedFlag;
    @XmlElement(name = "OutTypeGenericDetailDescription")
    protected String outTypeGenericDetailDescription;
    @XmlElement(name = "OutTypeGenericDetailParameterType")
    protected String outTypeGenericDetailParameterType;
    @XmlElement(name = "OutTypeGenericDetailSerialNum")
    protected int outTypeGenericDetailSerialNum;
    @XmlElement(name = "OutGrpCustDocs")
    protected ArrayOfI0160VOutGrpCustDocsItem outGrpCustDocs;
    @XmlElement(name = "OutGrpDocumentsReq")
    protected ArrayOfI0160VOutGrpDocumentsReqItem outGrpDocumentsReq;

    /**
     * Gets the value of the outAllowedGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAllowedGenericDetailDescription() {
        return outAllowedGenericDetailDescription;
    }

    /**
     * Sets the value of the outAllowedGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAllowedGenericDetailDescription(String value) {
        this.outAllowedGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outAllowedGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAllowedGenericDetailParameterType() {
        return outAllowedGenericDetailParameterType;
    }

    /**
     * Sets the value of the outAllowedGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAllowedGenericDetailParameterType(String value) {
        this.outAllowedGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outAllowedGenericDetailSerialNum property.
     * 
     */
    public int getOutAllowedGenericDetailSerialNum() {
        return outAllowedGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outAllowedGenericDetailSerialNum property.
     * 
     */
    public void setOutAllowedGenericDetailSerialNum(int value) {
        this.outAllowedGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outCommntsProfitsDocumentsEntryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCommntsProfitsDocumentsEntryComments() {
        return outCommntsProfitsDocumentsEntryComments;
    }

    /**
     * Sets the value of the outCommntsProfitsDocumentsEntryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCommntsProfitsDocumentsEntryComments(String value) {
        this.outCommntsProfitsDocumentsEntryComments = value;
    }

    /**
     * Gets the value of the outCustomerDocumentsCustId property.
     * 
     */
    public int getOutCustomerDocumentsCustId() {
        return outCustomerDocumentsCustId;
    }

    /**
     * Sets the value of the outCustomerDocumentsCustId property.
     * 
     */
    public void setOutCustomerDocumentsCustId(int value) {
        this.outCustomerDocumentsCustId = value;
    }

    /**
     * Gets the value of the outCustomerDocumentsEntryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerDocumentsEntryComments() {
        return outCustomerDocumentsEntryComments;
    }

    /**
     * Sets the value of the outCustomerDocumentsEntryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerDocumentsEntryComments(String value) {
        this.outCustomerDocumentsEntryComments = value;
    }

    /**
     * Gets the value of the outCustomerDocumentsFkGdRqtp1 property.
     * 
     */
    public int getOutCustomerDocumentsFkGdRqtp1() {
        return outCustomerDocumentsFkGdRqtp1;
    }

    /**
     * Sets the value of the outCustomerDocumentsFkGdRqtp1 property.
     * 
     */
    public void setOutCustomerDocumentsFkGdRqtp1(int value) {
        this.outCustomerDocumentsFkGdRqtp1 = value;
    }

    /**
     * Gets the value of the outCustomerDocumentsFkGdRqtp2 property.
     * 
     */
    public int getOutCustomerDocumentsFkGdRqtp2() {
        return outCustomerDocumentsFkGdRqtp2;
    }

    /**
     * Sets the value of the outCustomerDocumentsFkGdRqtp2 property.
     * 
     */
    public void setOutCustomerDocumentsFkGdRqtp2(int value) {
        this.outCustomerDocumentsFkGdRqtp2 = value;
    }

    /**
     * Gets the value of the outCustomerDocumentsFkGdRqtp3 property.
     * 
     */
    public int getOutCustomerDocumentsFkGdRqtp3() {
        return outCustomerDocumentsFkGdRqtp3;
    }

    /**
     * Sets the value of the outCustomerDocumentsFkGdRqtp3 property.
     * 
     */
    public void setOutCustomerDocumentsFkGdRqtp3(int value) {
        this.outCustomerDocumentsFkGdRqtp3 = value;
    }

    /**
     * Gets the value of the outCustomerDocumentsFkGhRqtp1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerDocumentsFkGhRqtp1() {
        return outCustomerDocumentsFkGhRqtp1;
    }

    /**
     * Sets the value of the outCustomerDocumentsFkGhRqtp1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerDocumentsFkGhRqtp1(String value) {
        this.outCustomerDocumentsFkGhRqtp1 = value;
    }

    /**
     * Gets the value of the outCustomerDocumentsFkGhRqtp2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerDocumentsFkGhRqtp2() {
        return outCustomerDocumentsFkGhRqtp2;
    }

    /**
     * Sets the value of the outCustomerDocumentsFkGhRqtp2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerDocumentsFkGhRqtp2(String value) {
        this.outCustomerDocumentsFkGhRqtp2 = value;
    }

    /**
     * Gets the value of the outCustomerDocumentsFkGhRqtp3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerDocumentsFkGhRqtp3() {
        return outCustomerDocumentsFkGhRqtp3;
    }

    /**
     * Sets the value of the outCustomerDocumentsFkGhRqtp3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerDocumentsFkGhRqtp3(String value) {
        this.outCustomerDocumentsFkGhRqtp3 = value;
    }

    /**
     * Gets the value of the outCustomerDocumentsGivenFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerDocumentsGivenFlag() {
        return outCustomerDocumentsGivenFlag;
    }

    /**
     * Sets the value of the outCustomerDocumentsGivenFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerDocumentsGivenFlag(String value) {
        this.outCustomerDocumentsGivenFlag = value;
    }

    /**
     * Gets the value of the outCustomerDocumentsInsertDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustomerDocumentsInsertDate() {
        return outCustomerDocumentsInsertDate;
    }

    /**
     * Sets the value of the outCustomerDocumentsInsertDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustomerDocumentsInsertDate(XMLGregorianCalendar value) {
        this.outCustomerDocumentsInsertDate = value;
    }

    /**
     * Gets the value of the outCustomerDocumentsInsertUnit property.
     * 
     */
    public int getOutCustomerDocumentsInsertUnit() {
        return outCustomerDocumentsInsertUnit;
    }

    /**
     * Sets the value of the outCustomerDocumentsInsertUnit property.
     * 
     */
    public void setOutCustomerDocumentsInsertUnit(int value) {
        this.outCustomerDocumentsInsertUnit = value;
    }

    /**
     * Gets the value of the outCustomerDocumentsInsertUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerDocumentsInsertUser() {
        return outCustomerDocumentsInsertUser;
    }

    /**
     * Sets the value of the outCustomerDocumentsInsertUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerDocumentsInsertUser(String value) {
        this.outCustomerDocumentsInsertUser = value;
    }

    /**
     * Gets the value of the outCustomerDocumentsLinkedFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerDocumentsLinkedFile() {
        return outCustomerDocumentsLinkedFile;
    }

    /**
     * Sets the value of the outCustomerDocumentsLinkedFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerDocumentsLinkedFile(String value) {
        this.outCustomerDocumentsLinkedFile = value;
    }

    /**
     * Gets the value of the outCustomerDocumentsLinkedFileSn property.
     * 
     */
    public double getOutCustomerDocumentsLinkedFileSn() {
        return outCustomerDocumentsLinkedFileSn;
    }

    /**
     * Sets the value of the outCustomerDocumentsLinkedFileSn property.
     * 
     */
    public void setOutCustomerDocumentsLinkedFileSn(double value) {
        this.outCustomerDocumentsLinkedFileSn = value;
    }

    /**
     * Gets the value of the outCustomerDocumentsScannedFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerDocumentsScannedFile() {
        return outCustomerDocumentsScannedFile;
    }

    /**
     * Sets the value of the outCustomerDocumentsScannedFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerDocumentsScannedFile(String value) {
        this.outCustomerDocumentsScannedFile = value;
    }

    /**
     * Gets the value of the outCustomerDocumentsScannedImageId property.
     * 
     */
    public double getOutCustomerDocumentsScannedImageId() {
        return outCustomerDocumentsScannedImageId;
    }

    /**
     * Sets the value of the outCustomerDocumentsScannedImageId property.
     * 
     */
    public void setOutCustomerDocumentsScannedImageId(double value) {
        this.outCustomerDocumentsScannedImageId = value;
    }

    /**
     * Gets the value of the outCustomerDocumentsTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustomerDocumentsTmstamp() {
        return outCustomerDocumentsTmstamp;
    }

    /**
     * Sets the value of the outCustomerDocumentsTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustomerDocumentsTmstamp(XMLGregorianCalendar value) {
        this.outCustomerDocumentsTmstamp = value;
    }

    /**
     * Gets the value of the outCustomerDocumentsUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustomerDocumentsUpdateDate() {
        return outCustomerDocumentsUpdateDate;
    }

    /**
     * Sets the value of the outCustomerDocumentsUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustomerDocumentsUpdateDate(XMLGregorianCalendar value) {
        this.outCustomerDocumentsUpdateDate = value;
    }

    /**
     * Gets the value of the outCustomerDocumentsUpdateUnit property.
     * 
     */
    public int getOutCustomerDocumentsUpdateUnit() {
        return outCustomerDocumentsUpdateUnit;
    }

    /**
     * Sets the value of the outCustomerDocumentsUpdateUnit property.
     * 
     */
    public void setOutCustomerDocumentsUpdateUnit(int value) {
        this.outCustomerDocumentsUpdateUnit = value;
    }

    /**
     * Gets the value of the outCustomerDocumentsUpdateUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerDocumentsUpdateUser() {
        return outCustomerDocumentsUpdateUser;
    }

    /**
     * Sets the value of the outCustomerDocumentsUpdateUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerDocumentsUpdateUser(String value) {
        this.outCustomerDocumentsUpdateUser = value;
    }

    /**
     * Gets the value of the outDocsGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDocsGenericDetailDescription() {
        return outDocsGenericDetailDescription;
    }

    /**
     * Sets the value of the outDocsGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDocsGenericDetailDescription(String value) {
        this.outDocsGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outDocsGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDocsGenericDetailParameterType() {
        return outDocsGenericDetailParameterType;
    }

    /**
     * Sets the value of the outDocsGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDocsGenericDetailParameterType(String value) {
        this.outDocsGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outDocsGenericDetailSerialNum property.
     * 
     */
    public int getOutDocsGenericDetailSerialNum() {
        return outDocsGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outDocsGenericDetailSerialNum property.
     * 
     */
    public void setOutDocsGenericDetailSerialNum(int value) {
        this.outDocsGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outExistsIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExistsIefSuppliedFlag() {
        return outExistsIefSuppliedFlag;
    }

    /**
     * Sets the value of the outExistsIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExistsIefSuppliedFlag(String value) {
        this.outExistsIefSuppliedFlag = value;
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
     * Gets the value of the outTypeGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTypeGenericDetailParameterType() {
        return outTypeGenericDetailParameterType;
    }

    /**
     * Sets the value of the outTypeGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTypeGenericDetailParameterType(String value) {
        this.outTypeGenericDetailParameterType = value;
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

    /**
     * Gets the value of the outGrpCustDocs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfI0160VOutGrpCustDocsItem }
     *     
     */
    public ArrayOfI0160VOutGrpCustDocsItem getOutGrpCustDocs() {
        return outGrpCustDocs;
    }

    /**
     * Sets the value of the outGrpCustDocs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfI0160VOutGrpCustDocsItem }
     *     
     */
    public void setOutGrpCustDocs(ArrayOfI0160VOutGrpCustDocsItem value) {
        this.outGrpCustDocs = value;
    }

    /**
     * Gets the value of the outGrpDocumentsReq property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfI0160VOutGrpDocumentsReqItem }
     *     
     */
    public ArrayOfI0160VOutGrpDocumentsReqItem getOutGrpDocumentsReq() {
        return outGrpDocumentsReq;
    }

    /**
     * Sets the value of the outGrpDocumentsReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfI0160VOutGrpDocumentsReqItem }
     *     
     */
    public void setOutGrpDocumentsReq(ArrayOfI0160VOutGrpDocumentsReqItem value) {
        this.outGrpDocumentsReq = value;
    }

}
