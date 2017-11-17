
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for I0130VOutListGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="I0130VOutListGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutListGrpOutListGrmCategoryCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutListGrmCategoryDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutListGrmCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutListGrpOutListGrmGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutListGrmGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutListGrpOutListGrmGenericHeaderParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutListGrmIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutListGrmIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "I0130VOutListGrpItem", propOrder = {
    "outListGrpOutListGrmCategoryCategoryCode",
    "outListGrpOutListGrmCategoryDescription",
    "outListGrpOutListGrmCustomerCategoryTmstamp",
    "outListGrpOutListGrmGenericDetailDescription",
    "outListGrpOutListGrmGenericDetailSerialNum",
    "outListGrpOutListGrmGenericHeaderParameterType",
    "outListGrpOutListGrmIefSuppliedFlag",
    "outListGrpOutListGrmIefSuppliedSelectChar"
})
public class I0130VOutListGrpItem {

    @XmlElement(name = "OutListGrpOutListGrmCategoryCategoryCode")
    protected String outListGrpOutListGrmCategoryCategoryCode;
    @XmlElement(name = "OutListGrpOutListGrmCategoryDescription")
    protected String outListGrpOutListGrmCategoryDescription;
    @XmlElement(name = "OutListGrpOutListGrmCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outListGrpOutListGrmCustomerCategoryTmstamp;
    @XmlElement(name = "OutListGrpOutListGrmGenericDetailDescription")
    protected String outListGrpOutListGrmGenericDetailDescription;
    @XmlElement(name = "OutListGrpOutListGrmGenericDetailSerialNum")
    protected int outListGrpOutListGrmGenericDetailSerialNum;
    @XmlElement(name = "OutListGrpOutListGrmGenericHeaderParameterType")
    protected String outListGrpOutListGrmGenericHeaderParameterType;
    @XmlElement(name = "OutListGrpOutListGrmIefSuppliedFlag")
    protected String outListGrpOutListGrmIefSuppliedFlag;
    @XmlElement(name = "OutListGrpOutListGrmIefSuppliedSelectChar")
    protected String outListGrpOutListGrmIefSuppliedSelectChar;

    /**
     * Gets the value of the outListGrpOutListGrmCategoryCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutListGrmCategoryCategoryCode() {
        return outListGrpOutListGrmCategoryCategoryCode;
    }

    /**
     * Sets the value of the outListGrpOutListGrmCategoryCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutListGrmCategoryCategoryCode(String value) {
        this.outListGrpOutListGrmCategoryCategoryCode = value;
    }

    /**
     * Gets the value of the outListGrpOutListGrmCategoryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutListGrmCategoryDescription() {
        return outListGrpOutListGrmCategoryDescription;
    }

    /**
     * Sets the value of the outListGrpOutListGrmCategoryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutListGrmCategoryDescription(String value) {
        this.outListGrpOutListGrmCategoryDescription = value;
    }

    /**
     * Gets the value of the outListGrpOutListGrmCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutListGrpOutListGrmCustomerCategoryTmstamp() {
        return outListGrpOutListGrmCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the outListGrpOutListGrmCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutListGrpOutListGrmCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.outListGrpOutListGrmCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the outListGrpOutListGrmGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutListGrmGenericDetailDescription() {
        return outListGrpOutListGrmGenericDetailDescription;
    }

    /**
     * Sets the value of the outListGrpOutListGrmGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutListGrmGenericDetailDescription(String value) {
        this.outListGrpOutListGrmGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outListGrpOutListGrmGenericDetailSerialNum property.
     * 
     */
    public int getOutListGrpOutListGrmGenericDetailSerialNum() {
        return outListGrpOutListGrmGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outListGrpOutListGrmGenericDetailSerialNum property.
     * 
     */
    public void setOutListGrpOutListGrmGenericDetailSerialNum(int value) {
        this.outListGrpOutListGrmGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outListGrpOutListGrmGenericHeaderParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutListGrmGenericHeaderParameterType() {
        return outListGrpOutListGrmGenericHeaderParameterType;
    }

    /**
     * Sets the value of the outListGrpOutListGrmGenericHeaderParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutListGrmGenericHeaderParameterType(String value) {
        this.outListGrpOutListGrmGenericHeaderParameterType = value;
    }

    /**
     * Gets the value of the outListGrpOutListGrmIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutListGrmIefSuppliedFlag() {
        return outListGrpOutListGrmIefSuppliedFlag;
    }

    /**
     * Sets the value of the outListGrpOutListGrmIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutListGrmIefSuppliedFlag(String value) {
        this.outListGrpOutListGrmIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outListGrpOutListGrmIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutListGrmIefSuppliedSelectChar() {
        return outListGrpOutListGrmIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outListGrpOutListGrmIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutListGrmIefSuppliedSelectChar(String value) {
        this.outListGrpOutListGrmIefSuppliedSelectChar = value;
    }

}
