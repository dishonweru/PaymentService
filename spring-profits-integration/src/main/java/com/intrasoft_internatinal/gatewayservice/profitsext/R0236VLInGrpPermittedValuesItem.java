
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for R0236VLInGrpPermittedValuesItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="R0236VLInGrpPermittedValuesItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpPermittedValuesInGrmCategoryCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpPermittedValuesInGrmGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpPermittedValuesInGrmGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpPermittedValuesInGrmTmstampHproductTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGrpPermittedValuesInGrmWorkIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpPermittedValuesInGrmWorkIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "R0236VLInGrpPermittedValuesItem", propOrder = {
    "inGrpPermittedValuesInGrmCategoryCategoryCode",
    "inGrpPermittedValuesInGrmGenericDetailDescription",
    "inGrpPermittedValuesInGrmGenericDetailSerialNum",
    "inGrpPermittedValuesInGrmTmstampHproductTmstamp",
    "inGrpPermittedValuesInGrmWorkIefSuppliedFlag",
    "inGrpPermittedValuesInGrmWorkIefSuppliedSelectChar"
})
public class R0236VLInGrpPermittedValuesItem {

    @XmlElement(name = "InGrpPermittedValuesInGrmCategoryCategoryCode")
    protected String inGrpPermittedValuesInGrmCategoryCategoryCode;
    @XmlElement(name = "InGrpPermittedValuesInGrmGenericDetailDescription")
    protected String inGrpPermittedValuesInGrmGenericDetailDescription;
    @XmlElement(name = "InGrpPermittedValuesInGrmGenericDetailSerialNum")
    protected int inGrpPermittedValuesInGrmGenericDetailSerialNum;
    @XmlElement(name = "InGrpPermittedValuesInGrmTmstampHproductTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGrpPermittedValuesInGrmTmstampHproductTmstamp;
    @XmlElement(name = "InGrpPermittedValuesInGrmWorkIefSuppliedFlag")
    protected String inGrpPermittedValuesInGrmWorkIefSuppliedFlag;
    @XmlElement(name = "InGrpPermittedValuesInGrmWorkIefSuppliedSelectChar")
    protected String inGrpPermittedValuesInGrmWorkIefSuppliedSelectChar;

    /**
     * Gets the value of the inGrpPermittedValuesInGrmCategoryCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpPermittedValuesInGrmCategoryCategoryCode() {
        return inGrpPermittedValuesInGrmCategoryCategoryCode;
    }

    /**
     * Sets the value of the inGrpPermittedValuesInGrmCategoryCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpPermittedValuesInGrmCategoryCategoryCode(String value) {
        this.inGrpPermittedValuesInGrmCategoryCategoryCode = value;
    }

    /**
     * Gets the value of the inGrpPermittedValuesInGrmGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpPermittedValuesInGrmGenericDetailDescription() {
        return inGrpPermittedValuesInGrmGenericDetailDescription;
    }

    /**
     * Sets the value of the inGrpPermittedValuesInGrmGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpPermittedValuesInGrmGenericDetailDescription(String value) {
        this.inGrpPermittedValuesInGrmGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inGrpPermittedValuesInGrmGenericDetailSerialNum property.
     * 
     */
    public int getInGrpPermittedValuesInGrmGenericDetailSerialNum() {
        return inGrpPermittedValuesInGrmGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inGrpPermittedValuesInGrmGenericDetailSerialNum property.
     * 
     */
    public void setInGrpPermittedValuesInGrmGenericDetailSerialNum(int value) {
        this.inGrpPermittedValuesInGrmGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inGrpPermittedValuesInGrmTmstampHproductTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGrpPermittedValuesInGrmTmstampHproductTmstamp() {
        return inGrpPermittedValuesInGrmTmstampHproductTmstamp;
    }

    /**
     * Sets the value of the inGrpPermittedValuesInGrmTmstampHproductTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGrpPermittedValuesInGrmTmstampHproductTmstamp(XMLGregorianCalendar value) {
        this.inGrpPermittedValuesInGrmTmstampHproductTmstamp = value;
    }

    /**
     * Gets the value of the inGrpPermittedValuesInGrmWorkIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpPermittedValuesInGrmWorkIefSuppliedFlag() {
        return inGrpPermittedValuesInGrmWorkIefSuppliedFlag;
    }

    /**
     * Sets the value of the inGrpPermittedValuesInGrmWorkIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpPermittedValuesInGrmWorkIefSuppliedFlag(String value) {
        this.inGrpPermittedValuesInGrmWorkIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inGrpPermittedValuesInGrmWorkIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpPermittedValuesInGrmWorkIefSuppliedSelectChar() {
        return inGrpPermittedValuesInGrmWorkIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the inGrpPermittedValuesInGrmWorkIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpPermittedValuesInGrmWorkIefSuppliedSelectChar(String value) {
        this.inGrpPermittedValuesInGrmWorkIefSuppliedSelectChar = value;
    }

}
