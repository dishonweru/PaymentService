
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for I0130VInListGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="I0130VInListGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InListGrpInListGrmCategoryCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrpInListGrmCategoryDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrpInListGrmCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InListGrpInListGrmGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrpInListGrmGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InListGrpInListGrmGenericHeaderParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrpInListGrmIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrpInListGrmIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "I0130VInListGrpItem", propOrder = {
    "inListGrpInListGrmCategoryCategoryCode",
    "inListGrpInListGrmCategoryDescription",
    "inListGrpInListGrmCustomerCategoryTmstamp",
    "inListGrpInListGrmGenericDetailDescription",
    "inListGrpInListGrmGenericDetailSerialNum",
    "inListGrpInListGrmGenericHeaderParameterType",
    "inListGrpInListGrmIefSuppliedFlag",
    "inListGrpInListGrmIefSuppliedSelectChar"
})
public class I0130VInListGrpItem {

    @XmlElement(name = "InListGrpInListGrmCategoryCategoryCode")
    protected String inListGrpInListGrmCategoryCategoryCode;
    @XmlElement(name = "InListGrpInListGrmCategoryDescription")
    protected String inListGrpInListGrmCategoryDescription;
    @XmlElement(name = "InListGrpInListGrmCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inListGrpInListGrmCustomerCategoryTmstamp;
    @XmlElement(name = "InListGrpInListGrmGenericDetailDescription")
    protected String inListGrpInListGrmGenericDetailDescription;
    @XmlElement(name = "InListGrpInListGrmGenericDetailSerialNum")
    protected int inListGrpInListGrmGenericDetailSerialNum;
    @XmlElement(name = "InListGrpInListGrmGenericHeaderParameterType")
    protected String inListGrpInListGrmGenericHeaderParameterType;
    @XmlElement(name = "InListGrpInListGrmIefSuppliedFlag")
    protected String inListGrpInListGrmIefSuppliedFlag;
    @XmlElement(name = "InListGrpInListGrmIefSuppliedSelectChar")
    protected String inListGrpInListGrmIefSuppliedSelectChar;

    /**
     * Gets the value of the inListGrpInListGrmCategoryCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrpInListGrmCategoryCategoryCode() {
        return inListGrpInListGrmCategoryCategoryCode;
    }

    /**
     * Sets the value of the inListGrpInListGrmCategoryCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrpInListGrmCategoryCategoryCode(String value) {
        this.inListGrpInListGrmCategoryCategoryCode = value;
    }

    /**
     * Gets the value of the inListGrpInListGrmCategoryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrpInListGrmCategoryDescription() {
        return inListGrpInListGrmCategoryDescription;
    }

    /**
     * Sets the value of the inListGrpInListGrmCategoryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrpInListGrmCategoryDescription(String value) {
        this.inListGrpInListGrmCategoryDescription = value;
    }

    /**
     * Gets the value of the inListGrpInListGrmCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInListGrpInListGrmCustomerCategoryTmstamp() {
        return inListGrpInListGrmCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the inListGrpInListGrmCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInListGrpInListGrmCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.inListGrpInListGrmCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the inListGrpInListGrmGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrpInListGrmGenericDetailDescription() {
        return inListGrpInListGrmGenericDetailDescription;
    }

    /**
     * Sets the value of the inListGrpInListGrmGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrpInListGrmGenericDetailDescription(String value) {
        this.inListGrpInListGrmGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inListGrpInListGrmGenericDetailSerialNum property.
     * 
     */
    public int getInListGrpInListGrmGenericDetailSerialNum() {
        return inListGrpInListGrmGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inListGrpInListGrmGenericDetailSerialNum property.
     * 
     */
    public void setInListGrpInListGrmGenericDetailSerialNum(int value) {
        this.inListGrpInListGrmGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inListGrpInListGrmGenericHeaderParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrpInListGrmGenericHeaderParameterType() {
        return inListGrpInListGrmGenericHeaderParameterType;
    }

    /**
     * Sets the value of the inListGrpInListGrmGenericHeaderParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrpInListGrmGenericHeaderParameterType(String value) {
        this.inListGrpInListGrmGenericHeaderParameterType = value;
    }

    /**
     * Gets the value of the inListGrpInListGrmIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrpInListGrmIefSuppliedFlag() {
        return inListGrpInListGrmIefSuppliedFlag;
    }

    /**
     * Sets the value of the inListGrpInListGrmIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrpInListGrmIefSuppliedFlag(String value) {
        this.inListGrpInListGrmIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inListGrpInListGrmIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrpInListGrmIefSuppliedSelectChar() {
        return inListGrpInListGrmIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the inListGrpInListGrmIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrpInListGrmIefSuppliedSelectChar(String value) {
        this.inListGrpInListGrmIefSuppliedSelectChar = value;
    }

}
