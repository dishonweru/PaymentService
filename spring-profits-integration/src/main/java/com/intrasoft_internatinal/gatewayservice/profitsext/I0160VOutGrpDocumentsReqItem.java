
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for I0160VOutGrpDocumentsReqItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="I0160VOutGrpDocumentsReqItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpDocumentsReqOutGrmAllowedGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDocumentsReqOutGrmAllowedGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDocumentsReqOutGrmAllowedGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpDocumentsReqOutGrmCustDocsCustomerDocumentsGivenFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDocumentsReqOutGrmCustDocsCustomerDocumentsLinkedFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDocumentsReqOutGrmCustDocsCustomerDocumentsScannedFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDocumentsReqOutGrmDocsGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDocumentsReqOutGrmDocsGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDocumentsReqOutGrmDocsGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpDocumentsReqOutGrmDocumProfitsDocumentsOptCorporate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDocumentsReqOutGrmDocumProfitsDocumentsOptCorrespondent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDocumentsReqOutGrmDocumProfitsDocumentsOptIndividual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDocumentsReqOutGrmTypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDocumentsReqOutGrmTypeGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDocumentsReqOutGrmTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "I0160VOutGrpDocumentsReqItem", propOrder = {
    "outGrpDocumentsReqOutGrmAllowedGenericDetailDescription",
    "outGrpDocumentsReqOutGrmAllowedGenericDetailParameterType",
    "outGrpDocumentsReqOutGrmAllowedGenericDetailSerialNum",
    "outGrpDocumentsReqOutGrmCustDocsCustomerDocumentsGivenFlag",
    "outGrpDocumentsReqOutGrmCustDocsCustomerDocumentsLinkedFile",
    "outGrpDocumentsReqOutGrmCustDocsCustomerDocumentsScannedFile",
    "outGrpDocumentsReqOutGrmDocsGenericDetailDescription",
    "outGrpDocumentsReqOutGrmDocsGenericDetailParameterType",
    "outGrpDocumentsReqOutGrmDocsGenericDetailSerialNum",
    "outGrpDocumentsReqOutGrmDocumProfitsDocumentsOptCorporate",
    "outGrpDocumentsReqOutGrmDocumProfitsDocumentsOptCorrespondent",
    "outGrpDocumentsReqOutGrmDocumProfitsDocumentsOptIndividual",
    "outGrpDocumentsReqOutGrmTypeGenericDetailDescription",
    "outGrpDocumentsReqOutGrmTypeGenericDetailParameterType",
    "outGrpDocumentsReqOutGrmTypeGenericDetailSerialNum"
})
public class I0160VOutGrpDocumentsReqItem {

    @XmlElement(name = "OutGrpDocumentsReqOutGrmAllowedGenericDetailDescription")
    protected String outGrpDocumentsReqOutGrmAllowedGenericDetailDescription;
    @XmlElement(name = "OutGrpDocumentsReqOutGrmAllowedGenericDetailParameterType")
    protected String outGrpDocumentsReqOutGrmAllowedGenericDetailParameterType;
    @XmlElement(name = "OutGrpDocumentsReqOutGrmAllowedGenericDetailSerialNum")
    protected int outGrpDocumentsReqOutGrmAllowedGenericDetailSerialNum;
    @XmlElement(name = "OutGrpDocumentsReqOutGrmCustDocsCustomerDocumentsGivenFlag")
    protected String outGrpDocumentsReqOutGrmCustDocsCustomerDocumentsGivenFlag;
    @XmlElement(name = "OutGrpDocumentsReqOutGrmCustDocsCustomerDocumentsLinkedFile")
    protected String outGrpDocumentsReqOutGrmCustDocsCustomerDocumentsLinkedFile;
    @XmlElement(name = "OutGrpDocumentsReqOutGrmCustDocsCustomerDocumentsScannedFile")
    protected String outGrpDocumentsReqOutGrmCustDocsCustomerDocumentsScannedFile;
    @XmlElement(name = "OutGrpDocumentsReqOutGrmDocsGenericDetailDescription")
    protected String outGrpDocumentsReqOutGrmDocsGenericDetailDescription;
    @XmlElement(name = "OutGrpDocumentsReqOutGrmDocsGenericDetailParameterType")
    protected String outGrpDocumentsReqOutGrmDocsGenericDetailParameterType;
    @XmlElement(name = "OutGrpDocumentsReqOutGrmDocsGenericDetailSerialNum")
    protected int outGrpDocumentsReqOutGrmDocsGenericDetailSerialNum;
    @XmlElement(name = "OutGrpDocumentsReqOutGrmDocumProfitsDocumentsOptCorporate")
    protected String outGrpDocumentsReqOutGrmDocumProfitsDocumentsOptCorporate;
    @XmlElement(name = "OutGrpDocumentsReqOutGrmDocumProfitsDocumentsOptCorrespondent")
    protected String outGrpDocumentsReqOutGrmDocumProfitsDocumentsOptCorrespondent;
    @XmlElement(name = "OutGrpDocumentsReqOutGrmDocumProfitsDocumentsOptIndividual")
    protected String outGrpDocumentsReqOutGrmDocumProfitsDocumentsOptIndividual;
    @XmlElement(name = "OutGrpDocumentsReqOutGrmTypeGenericDetailDescription")
    protected String outGrpDocumentsReqOutGrmTypeGenericDetailDescription;
    @XmlElement(name = "OutGrpDocumentsReqOutGrmTypeGenericDetailParameterType")
    protected String outGrpDocumentsReqOutGrmTypeGenericDetailParameterType;
    @XmlElement(name = "OutGrpDocumentsReqOutGrmTypeGenericDetailSerialNum")
    protected int outGrpDocumentsReqOutGrmTypeGenericDetailSerialNum;

    /**
     * Gets the value of the outGrpDocumentsReqOutGrmAllowedGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDocumentsReqOutGrmAllowedGenericDetailDescription() {
        return outGrpDocumentsReqOutGrmAllowedGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpDocumentsReqOutGrmAllowedGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDocumentsReqOutGrmAllowedGenericDetailDescription(String value) {
        this.outGrpDocumentsReqOutGrmAllowedGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpDocumentsReqOutGrmAllowedGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDocumentsReqOutGrmAllowedGenericDetailParameterType() {
        return outGrpDocumentsReqOutGrmAllowedGenericDetailParameterType;
    }

    /**
     * Sets the value of the outGrpDocumentsReqOutGrmAllowedGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDocumentsReqOutGrmAllowedGenericDetailParameterType(String value) {
        this.outGrpDocumentsReqOutGrmAllowedGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outGrpDocumentsReqOutGrmAllowedGenericDetailSerialNum property.
     * 
     */
    public int getOutGrpDocumentsReqOutGrmAllowedGenericDetailSerialNum() {
        return outGrpDocumentsReqOutGrmAllowedGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outGrpDocumentsReqOutGrmAllowedGenericDetailSerialNum property.
     * 
     */
    public void setOutGrpDocumentsReqOutGrmAllowedGenericDetailSerialNum(int value) {
        this.outGrpDocumentsReqOutGrmAllowedGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outGrpDocumentsReqOutGrmCustDocsCustomerDocumentsGivenFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDocumentsReqOutGrmCustDocsCustomerDocumentsGivenFlag() {
        return outGrpDocumentsReqOutGrmCustDocsCustomerDocumentsGivenFlag;
    }

    /**
     * Sets the value of the outGrpDocumentsReqOutGrmCustDocsCustomerDocumentsGivenFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDocumentsReqOutGrmCustDocsCustomerDocumentsGivenFlag(String value) {
        this.outGrpDocumentsReqOutGrmCustDocsCustomerDocumentsGivenFlag = value;
    }

    /**
     * Gets the value of the outGrpDocumentsReqOutGrmCustDocsCustomerDocumentsLinkedFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDocumentsReqOutGrmCustDocsCustomerDocumentsLinkedFile() {
        return outGrpDocumentsReqOutGrmCustDocsCustomerDocumentsLinkedFile;
    }

    /**
     * Sets the value of the outGrpDocumentsReqOutGrmCustDocsCustomerDocumentsLinkedFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDocumentsReqOutGrmCustDocsCustomerDocumentsLinkedFile(String value) {
        this.outGrpDocumentsReqOutGrmCustDocsCustomerDocumentsLinkedFile = value;
    }

    /**
     * Gets the value of the outGrpDocumentsReqOutGrmCustDocsCustomerDocumentsScannedFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDocumentsReqOutGrmCustDocsCustomerDocumentsScannedFile() {
        return outGrpDocumentsReqOutGrmCustDocsCustomerDocumentsScannedFile;
    }

    /**
     * Sets the value of the outGrpDocumentsReqOutGrmCustDocsCustomerDocumentsScannedFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDocumentsReqOutGrmCustDocsCustomerDocumentsScannedFile(String value) {
        this.outGrpDocumentsReqOutGrmCustDocsCustomerDocumentsScannedFile = value;
    }

    /**
     * Gets the value of the outGrpDocumentsReqOutGrmDocsGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDocumentsReqOutGrmDocsGenericDetailDescription() {
        return outGrpDocumentsReqOutGrmDocsGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpDocumentsReqOutGrmDocsGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDocumentsReqOutGrmDocsGenericDetailDescription(String value) {
        this.outGrpDocumentsReqOutGrmDocsGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpDocumentsReqOutGrmDocsGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDocumentsReqOutGrmDocsGenericDetailParameterType() {
        return outGrpDocumentsReqOutGrmDocsGenericDetailParameterType;
    }

    /**
     * Sets the value of the outGrpDocumentsReqOutGrmDocsGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDocumentsReqOutGrmDocsGenericDetailParameterType(String value) {
        this.outGrpDocumentsReqOutGrmDocsGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outGrpDocumentsReqOutGrmDocsGenericDetailSerialNum property.
     * 
     */
    public int getOutGrpDocumentsReqOutGrmDocsGenericDetailSerialNum() {
        return outGrpDocumentsReqOutGrmDocsGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outGrpDocumentsReqOutGrmDocsGenericDetailSerialNum property.
     * 
     */
    public void setOutGrpDocumentsReqOutGrmDocsGenericDetailSerialNum(int value) {
        this.outGrpDocumentsReqOutGrmDocsGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outGrpDocumentsReqOutGrmDocumProfitsDocumentsOptCorporate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDocumentsReqOutGrmDocumProfitsDocumentsOptCorporate() {
        return outGrpDocumentsReqOutGrmDocumProfitsDocumentsOptCorporate;
    }

    /**
     * Sets the value of the outGrpDocumentsReqOutGrmDocumProfitsDocumentsOptCorporate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDocumentsReqOutGrmDocumProfitsDocumentsOptCorporate(String value) {
        this.outGrpDocumentsReqOutGrmDocumProfitsDocumentsOptCorporate = value;
    }

    /**
     * Gets the value of the outGrpDocumentsReqOutGrmDocumProfitsDocumentsOptCorrespondent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDocumentsReqOutGrmDocumProfitsDocumentsOptCorrespondent() {
        return outGrpDocumentsReqOutGrmDocumProfitsDocumentsOptCorrespondent;
    }

    /**
     * Sets the value of the outGrpDocumentsReqOutGrmDocumProfitsDocumentsOptCorrespondent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDocumentsReqOutGrmDocumProfitsDocumentsOptCorrespondent(String value) {
        this.outGrpDocumentsReqOutGrmDocumProfitsDocumentsOptCorrespondent = value;
    }

    /**
     * Gets the value of the outGrpDocumentsReqOutGrmDocumProfitsDocumentsOptIndividual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDocumentsReqOutGrmDocumProfitsDocumentsOptIndividual() {
        return outGrpDocumentsReqOutGrmDocumProfitsDocumentsOptIndividual;
    }

    /**
     * Sets the value of the outGrpDocumentsReqOutGrmDocumProfitsDocumentsOptIndividual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDocumentsReqOutGrmDocumProfitsDocumentsOptIndividual(String value) {
        this.outGrpDocumentsReqOutGrmDocumProfitsDocumentsOptIndividual = value;
    }

    /**
     * Gets the value of the outGrpDocumentsReqOutGrmTypeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDocumentsReqOutGrmTypeGenericDetailDescription() {
        return outGrpDocumentsReqOutGrmTypeGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpDocumentsReqOutGrmTypeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDocumentsReqOutGrmTypeGenericDetailDescription(String value) {
        this.outGrpDocumentsReqOutGrmTypeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpDocumentsReqOutGrmTypeGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDocumentsReqOutGrmTypeGenericDetailParameterType() {
        return outGrpDocumentsReqOutGrmTypeGenericDetailParameterType;
    }

    /**
     * Sets the value of the outGrpDocumentsReqOutGrmTypeGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDocumentsReqOutGrmTypeGenericDetailParameterType(String value) {
        this.outGrpDocumentsReqOutGrmTypeGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outGrpDocumentsReqOutGrmTypeGenericDetailSerialNum property.
     * 
     */
    public int getOutGrpDocumentsReqOutGrmTypeGenericDetailSerialNum() {
        return outGrpDocumentsReqOutGrmTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outGrpDocumentsReqOutGrmTypeGenericDetailSerialNum property.
     * 
     */
    public void setOutGrpDocumentsReqOutGrmTypeGenericDetailSerialNum(int value) {
        this.outGrpDocumentsReqOutGrmTypeGenericDetailSerialNum = value;
    }

}
