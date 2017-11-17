
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutGrpCustcat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpCustcat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpCustcatOutGrmCustcatCategoryCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustcatOutGrmCustcatCategoryDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustcatOutGrmCustcatCategoryOptCorporate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustcatOutGrmCustcatCategoryOptCorrespondent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustcatOutGrmCustcatCategoryOptIndividual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustcatOutGrmCustcatGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustcatOutGrmCustcatGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustcatOutGrmCustcatGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCustcatOutGrmCustcatGenericHeaderParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustcatOutGrmCustcatIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustcatOutGrmCustcatOptIefSuppliedChar13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpCustcat", propOrder = {
    "outGrpCustcatOutGrmCustcatCategoryCategoryCode",
    "outGrpCustcatOutGrmCustcatCategoryDescription",
    "outGrpCustcatOutGrmCustcatCategoryOptCorporate",
    "outGrpCustcatOutGrmCustcatCategoryOptCorrespondent",
    "outGrpCustcatOutGrmCustcatCategoryOptIndividual",
    "outGrpCustcatOutGrmCustcatGenericDetailDescription",
    "outGrpCustcatOutGrmCustcatGenericDetailParameterType",
    "outGrpCustcatOutGrmCustcatGenericDetailSerialNum",
    "outGrpCustcatOutGrmCustcatGenericHeaderParameterType",
    "outGrpCustcatOutGrmCustcatIefSuppliedFlag",
    "outGrpCustcatOutGrmCustcatOptIefSuppliedChar13"
})
public class OutGrpCustcat {

    @XmlElement(name = "OutGrpCustcatOutGrmCustcatCategoryCategoryCode")
    protected String outGrpCustcatOutGrmCustcatCategoryCategoryCode;
    @XmlElement(name = "OutGrpCustcatOutGrmCustcatCategoryDescription")
    protected String outGrpCustcatOutGrmCustcatCategoryDescription;
    @XmlElement(name = "OutGrpCustcatOutGrmCustcatCategoryOptCorporate")
    protected String outGrpCustcatOutGrmCustcatCategoryOptCorporate;
    @XmlElement(name = "OutGrpCustcatOutGrmCustcatCategoryOptCorrespondent")
    protected String outGrpCustcatOutGrmCustcatCategoryOptCorrespondent;
    @XmlElement(name = "OutGrpCustcatOutGrmCustcatCategoryOptIndividual")
    protected String outGrpCustcatOutGrmCustcatCategoryOptIndividual;
    @XmlElement(name = "OutGrpCustcatOutGrmCustcatGenericDetailDescription")
    protected String outGrpCustcatOutGrmCustcatGenericDetailDescription;
    @XmlElement(name = "OutGrpCustcatOutGrmCustcatGenericDetailParameterType")
    protected String outGrpCustcatOutGrmCustcatGenericDetailParameterType;
    @XmlElement(name = "OutGrpCustcatOutGrmCustcatGenericDetailSerialNum")
    protected int outGrpCustcatOutGrmCustcatGenericDetailSerialNum;
    @XmlElement(name = "OutGrpCustcatOutGrmCustcatGenericHeaderParameterType")
    protected String outGrpCustcatOutGrmCustcatGenericHeaderParameterType;
    @XmlElement(name = "OutGrpCustcatOutGrmCustcatIefSuppliedFlag")
    protected String outGrpCustcatOutGrmCustcatIefSuppliedFlag;
    @XmlElement(name = "OutGrpCustcatOutGrmCustcatOptIefSuppliedChar13")
    protected String outGrpCustcatOutGrmCustcatOptIefSuppliedChar13;

    /**
     * Gets the value of the outGrpCustcatOutGrmCustcatCategoryCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustcatOutGrmCustcatCategoryCategoryCode() {
        return outGrpCustcatOutGrmCustcatCategoryCategoryCode;
    }

    /**
     * Sets the value of the outGrpCustcatOutGrmCustcatCategoryCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustcatOutGrmCustcatCategoryCategoryCode(String value) {
        this.outGrpCustcatOutGrmCustcatCategoryCategoryCode = value;
    }

    /**
     * Gets the value of the outGrpCustcatOutGrmCustcatCategoryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustcatOutGrmCustcatCategoryDescription() {
        return outGrpCustcatOutGrmCustcatCategoryDescription;
    }

    /**
     * Sets the value of the outGrpCustcatOutGrmCustcatCategoryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustcatOutGrmCustcatCategoryDescription(String value) {
        this.outGrpCustcatOutGrmCustcatCategoryDescription = value;
    }

    /**
     * Gets the value of the outGrpCustcatOutGrmCustcatCategoryOptCorporate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustcatOutGrmCustcatCategoryOptCorporate() {
        return outGrpCustcatOutGrmCustcatCategoryOptCorporate;
    }

    /**
     * Sets the value of the outGrpCustcatOutGrmCustcatCategoryOptCorporate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustcatOutGrmCustcatCategoryOptCorporate(String value) {
        this.outGrpCustcatOutGrmCustcatCategoryOptCorporate = value;
    }

    /**
     * Gets the value of the outGrpCustcatOutGrmCustcatCategoryOptCorrespondent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustcatOutGrmCustcatCategoryOptCorrespondent() {
        return outGrpCustcatOutGrmCustcatCategoryOptCorrespondent;
    }

    /**
     * Sets the value of the outGrpCustcatOutGrmCustcatCategoryOptCorrespondent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustcatOutGrmCustcatCategoryOptCorrespondent(String value) {
        this.outGrpCustcatOutGrmCustcatCategoryOptCorrespondent = value;
    }

    /**
     * Gets the value of the outGrpCustcatOutGrmCustcatCategoryOptIndividual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustcatOutGrmCustcatCategoryOptIndividual() {
        return outGrpCustcatOutGrmCustcatCategoryOptIndividual;
    }

    /**
     * Sets the value of the outGrpCustcatOutGrmCustcatCategoryOptIndividual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustcatOutGrmCustcatCategoryOptIndividual(String value) {
        this.outGrpCustcatOutGrmCustcatCategoryOptIndividual = value;
    }

    /**
     * Gets the value of the outGrpCustcatOutGrmCustcatGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustcatOutGrmCustcatGenericDetailDescription() {
        return outGrpCustcatOutGrmCustcatGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpCustcatOutGrmCustcatGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustcatOutGrmCustcatGenericDetailDescription(String value) {
        this.outGrpCustcatOutGrmCustcatGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpCustcatOutGrmCustcatGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustcatOutGrmCustcatGenericDetailParameterType() {
        return outGrpCustcatOutGrmCustcatGenericDetailParameterType;
    }

    /**
     * Sets the value of the outGrpCustcatOutGrmCustcatGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustcatOutGrmCustcatGenericDetailParameterType(String value) {
        this.outGrpCustcatOutGrmCustcatGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outGrpCustcatOutGrmCustcatGenericDetailSerialNum property.
     * 
     */
    public int getOutGrpCustcatOutGrmCustcatGenericDetailSerialNum() {
        return outGrpCustcatOutGrmCustcatGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outGrpCustcatOutGrmCustcatGenericDetailSerialNum property.
     * 
     */
    public void setOutGrpCustcatOutGrmCustcatGenericDetailSerialNum(int value) {
        this.outGrpCustcatOutGrmCustcatGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outGrpCustcatOutGrmCustcatGenericHeaderParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustcatOutGrmCustcatGenericHeaderParameterType() {
        return outGrpCustcatOutGrmCustcatGenericHeaderParameterType;
    }

    /**
     * Sets the value of the outGrpCustcatOutGrmCustcatGenericHeaderParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustcatOutGrmCustcatGenericHeaderParameterType(String value) {
        this.outGrpCustcatOutGrmCustcatGenericHeaderParameterType = value;
    }

    /**
     * Gets the value of the outGrpCustcatOutGrmCustcatIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustcatOutGrmCustcatIefSuppliedFlag() {
        return outGrpCustcatOutGrmCustcatIefSuppliedFlag;
    }

    /**
     * Sets the value of the outGrpCustcatOutGrmCustcatIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustcatOutGrmCustcatIefSuppliedFlag(String value) {
        this.outGrpCustcatOutGrmCustcatIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outGrpCustcatOutGrmCustcatOptIefSuppliedChar13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustcatOutGrmCustcatOptIefSuppliedChar13() {
        return outGrpCustcatOutGrmCustcatOptIefSuppliedChar13;
    }

    /**
     * Sets the value of the outGrpCustcatOutGrmCustcatOptIefSuppliedChar13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustcatOutGrmCustcatOptIefSuppliedChar13(String value) {
        this.outGrpCustcatOutGrmCustcatOptIefSuppliedChar13 = value;
    }

}
