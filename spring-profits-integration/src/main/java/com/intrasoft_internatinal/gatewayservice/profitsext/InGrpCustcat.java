
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InGrpCustcat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InGrpCustcat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpCustcatInGrmCustcatCategoryCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpCustcatInGrmCustcatCategoryDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpCustcatInGrmCustcatCategoryOptCorporate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpCustcatInGrmCustcatCategoryOptCorrespondent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpCustcatInGrmCustcatCategoryOptIndividual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpCustcatInGrmCustcatGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpCustcatInGrmCustcatGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpCustcatInGrmCustcatGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpCustcatInGrmCustcatGenericHeaderParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpCustcatInGrmCustcatIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpCustcatInGrmCustcatOptIefSuppliedChar13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InGrpCustcat", propOrder = {
    "inGrpCustcatInGrmCustcatCategoryCategoryCode",
    "inGrpCustcatInGrmCustcatCategoryDescription",
    "inGrpCustcatInGrmCustcatCategoryOptCorporate",
    "inGrpCustcatInGrmCustcatCategoryOptCorrespondent",
    "inGrpCustcatInGrmCustcatCategoryOptIndividual",
    "inGrpCustcatInGrmCustcatGenericDetailDescription",
    "inGrpCustcatInGrmCustcatGenericDetailParameterType",
    "inGrpCustcatInGrmCustcatGenericDetailSerialNum",
    "inGrpCustcatInGrmCustcatGenericHeaderParameterType",
    "inGrpCustcatInGrmCustcatIefSuppliedFlag",
    "inGrpCustcatInGrmCustcatOptIefSuppliedChar13"
})
public class InGrpCustcat {

    @XmlElement(name = "InGrpCustcatInGrmCustcatCategoryCategoryCode")
    protected String inGrpCustcatInGrmCustcatCategoryCategoryCode;
    @XmlElement(name = "InGrpCustcatInGrmCustcatCategoryDescription")
    protected String inGrpCustcatInGrmCustcatCategoryDescription;
    @XmlElement(name = "InGrpCustcatInGrmCustcatCategoryOptCorporate")
    protected String inGrpCustcatInGrmCustcatCategoryOptCorporate;
    @XmlElement(name = "InGrpCustcatInGrmCustcatCategoryOptCorrespondent")
    protected String inGrpCustcatInGrmCustcatCategoryOptCorrespondent;
    @XmlElement(name = "InGrpCustcatInGrmCustcatCategoryOptIndividual")
    protected String inGrpCustcatInGrmCustcatCategoryOptIndividual;
    @XmlElement(name = "InGrpCustcatInGrmCustcatGenericDetailDescription")
    protected String inGrpCustcatInGrmCustcatGenericDetailDescription;
    @XmlElement(name = "InGrpCustcatInGrmCustcatGenericDetailParameterType")
    protected String inGrpCustcatInGrmCustcatGenericDetailParameterType;
    @XmlElement(name = "InGrpCustcatInGrmCustcatGenericDetailSerialNum")
    protected int inGrpCustcatInGrmCustcatGenericDetailSerialNum;
    @XmlElement(name = "InGrpCustcatInGrmCustcatGenericHeaderParameterType")
    protected String inGrpCustcatInGrmCustcatGenericHeaderParameterType;
    @XmlElement(name = "InGrpCustcatInGrmCustcatIefSuppliedFlag")
    protected String inGrpCustcatInGrmCustcatIefSuppliedFlag;
    @XmlElement(name = "InGrpCustcatInGrmCustcatOptIefSuppliedChar13")
    protected String inGrpCustcatInGrmCustcatOptIefSuppliedChar13;

    /**
     * Gets the value of the inGrpCustcatInGrmCustcatCategoryCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpCustcatInGrmCustcatCategoryCategoryCode() {
        return inGrpCustcatInGrmCustcatCategoryCategoryCode;
    }

    /**
     * Sets the value of the inGrpCustcatInGrmCustcatCategoryCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpCustcatInGrmCustcatCategoryCategoryCode(String value) {
        this.inGrpCustcatInGrmCustcatCategoryCategoryCode = value;
    }

    /**
     * Gets the value of the inGrpCustcatInGrmCustcatCategoryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpCustcatInGrmCustcatCategoryDescription() {
        return inGrpCustcatInGrmCustcatCategoryDescription;
    }

    /**
     * Sets the value of the inGrpCustcatInGrmCustcatCategoryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpCustcatInGrmCustcatCategoryDescription(String value) {
        this.inGrpCustcatInGrmCustcatCategoryDescription = value;
    }

    /**
     * Gets the value of the inGrpCustcatInGrmCustcatCategoryOptCorporate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpCustcatInGrmCustcatCategoryOptCorporate() {
        return inGrpCustcatInGrmCustcatCategoryOptCorporate;
    }

    /**
     * Sets the value of the inGrpCustcatInGrmCustcatCategoryOptCorporate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpCustcatInGrmCustcatCategoryOptCorporate(String value) {
        this.inGrpCustcatInGrmCustcatCategoryOptCorporate = value;
    }

    /**
     * Gets the value of the inGrpCustcatInGrmCustcatCategoryOptCorrespondent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpCustcatInGrmCustcatCategoryOptCorrespondent() {
        return inGrpCustcatInGrmCustcatCategoryOptCorrespondent;
    }

    /**
     * Sets the value of the inGrpCustcatInGrmCustcatCategoryOptCorrespondent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpCustcatInGrmCustcatCategoryOptCorrespondent(String value) {
        this.inGrpCustcatInGrmCustcatCategoryOptCorrespondent = value;
    }

    /**
     * Gets the value of the inGrpCustcatInGrmCustcatCategoryOptIndividual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpCustcatInGrmCustcatCategoryOptIndividual() {
        return inGrpCustcatInGrmCustcatCategoryOptIndividual;
    }

    /**
     * Sets the value of the inGrpCustcatInGrmCustcatCategoryOptIndividual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpCustcatInGrmCustcatCategoryOptIndividual(String value) {
        this.inGrpCustcatInGrmCustcatCategoryOptIndividual = value;
    }

    /**
     * Gets the value of the inGrpCustcatInGrmCustcatGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpCustcatInGrmCustcatGenericDetailDescription() {
        return inGrpCustcatInGrmCustcatGenericDetailDescription;
    }

    /**
     * Sets the value of the inGrpCustcatInGrmCustcatGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpCustcatInGrmCustcatGenericDetailDescription(String value) {
        this.inGrpCustcatInGrmCustcatGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inGrpCustcatInGrmCustcatGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpCustcatInGrmCustcatGenericDetailParameterType() {
        return inGrpCustcatInGrmCustcatGenericDetailParameterType;
    }

    /**
     * Sets the value of the inGrpCustcatInGrmCustcatGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpCustcatInGrmCustcatGenericDetailParameterType(String value) {
        this.inGrpCustcatInGrmCustcatGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inGrpCustcatInGrmCustcatGenericDetailSerialNum property.
     * 
     */
    public int getInGrpCustcatInGrmCustcatGenericDetailSerialNum() {
        return inGrpCustcatInGrmCustcatGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inGrpCustcatInGrmCustcatGenericDetailSerialNum property.
     * 
     */
    public void setInGrpCustcatInGrmCustcatGenericDetailSerialNum(int value) {
        this.inGrpCustcatInGrmCustcatGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inGrpCustcatInGrmCustcatGenericHeaderParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpCustcatInGrmCustcatGenericHeaderParameterType() {
        return inGrpCustcatInGrmCustcatGenericHeaderParameterType;
    }

    /**
     * Sets the value of the inGrpCustcatInGrmCustcatGenericHeaderParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpCustcatInGrmCustcatGenericHeaderParameterType(String value) {
        this.inGrpCustcatInGrmCustcatGenericHeaderParameterType = value;
    }

    /**
     * Gets the value of the inGrpCustcatInGrmCustcatIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpCustcatInGrmCustcatIefSuppliedFlag() {
        return inGrpCustcatInGrmCustcatIefSuppliedFlag;
    }

    /**
     * Sets the value of the inGrpCustcatInGrmCustcatIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpCustcatInGrmCustcatIefSuppliedFlag(String value) {
        this.inGrpCustcatInGrmCustcatIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inGrpCustcatInGrmCustcatOptIefSuppliedChar13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpCustcatInGrmCustcatOptIefSuppliedChar13() {
        return inGrpCustcatInGrmCustcatOptIefSuppliedChar13;
    }

    /**
     * Sets the value of the inGrpCustcatInGrmCustcatOptIefSuppliedChar13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpCustcatInGrmCustcatOptIefSuppliedChar13(String value) {
        this.inGrpCustcatInGrmCustcatOptIefSuppliedChar13 = value;
    }

}
