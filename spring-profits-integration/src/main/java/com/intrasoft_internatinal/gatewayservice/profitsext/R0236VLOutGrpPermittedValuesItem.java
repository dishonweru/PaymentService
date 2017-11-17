
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for R0236VLOutGrpPermittedValuesItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="R0236VLOutGrpPermittedValuesItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpPermittedValuesOutGrmCategoryCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPermittedValuesOutGrmGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPermittedValuesOutGrmGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpPermittedValuesOutGrmTmstampHproductTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpPermittedValuesOutGrmWorkIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPermittedValuesOutGrmWorkIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "R0236VLOutGrpPermittedValuesItem", propOrder = {
    "outGrpPermittedValuesOutGrmCategoryCategoryCode",
    "outGrpPermittedValuesOutGrmGenericDetailDescription",
    "outGrpPermittedValuesOutGrmGenericDetailSerialNum",
    "outGrpPermittedValuesOutGrmTmstampHproductTmstamp",
    "outGrpPermittedValuesOutGrmWorkIefSuppliedFlag",
    "outGrpPermittedValuesOutGrmWorkIefSuppliedSelectChar"
})
public class R0236VLOutGrpPermittedValuesItem {

    @XmlElement(name = "OutGrpPermittedValuesOutGrmCategoryCategoryCode")
    protected String outGrpPermittedValuesOutGrmCategoryCategoryCode;
    @XmlElement(name = "OutGrpPermittedValuesOutGrmGenericDetailDescription")
    protected String outGrpPermittedValuesOutGrmGenericDetailDescription;
    @XmlElement(name = "OutGrpPermittedValuesOutGrmGenericDetailSerialNum")
    protected int outGrpPermittedValuesOutGrmGenericDetailSerialNum;
    @XmlElement(name = "OutGrpPermittedValuesOutGrmTmstampHproductTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpPermittedValuesOutGrmTmstampHproductTmstamp;
    @XmlElement(name = "OutGrpPermittedValuesOutGrmWorkIefSuppliedFlag")
    protected String outGrpPermittedValuesOutGrmWorkIefSuppliedFlag;
    @XmlElement(name = "OutGrpPermittedValuesOutGrmWorkIefSuppliedSelectChar")
    protected String outGrpPermittedValuesOutGrmWorkIefSuppliedSelectChar;

    /**
     * Gets the value of the outGrpPermittedValuesOutGrmCategoryCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPermittedValuesOutGrmCategoryCategoryCode() {
        return outGrpPermittedValuesOutGrmCategoryCategoryCode;
    }

    /**
     * Sets the value of the outGrpPermittedValuesOutGrmCategoryCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPermittedValuesOutGrmCategoryCategoryCode(String value) {
        this.outGrpPermittedValuesOutGrmCategoryCategoryCode = value;
    }

    /**
     * Gets the value of the outGrpPermittedValuesOutGrmGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPermittedValuesOutGrmGenericDetailDescription() {
        return outGrpPermittedValuesOutGrmGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpPermittedValuesOutGrmGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPermittedValuesOutGrmGenericDetailDescription(String value) {
        this.outGrpPermittedValuesOutGrmGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpPermittedValuesOutGrmGenericDetailSerialNum property.
     * 
     */
    public int getOutGrpPermittedValuesOutGrmGenericDetailSerialNum() {
        return outGrpPermittedValuesOutGrmGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outGrpPermittedValuesOutGrmGenericDetailSerialNum property.
     * 
     */
    public void setOutGrpPermittedValuesOutGrmGenericDetailSerialNum(int value) {
        this.outGrpPermittedValuesOutGrmGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outGrpPermittedValuesOutGrmTmstampHproductTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpPermittedValuesOutGrmTmstampHproductTmstamp() {
        return outGrpPermittedValuesOutGrmTmstampHproductTmstamp;
    }

    /**
     * Sets the value of the outGrpPermittedValuesOutGrmTmstampHproductTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpPermittedValuesOutGrmTmstampHproductTmstamp(XMLGregorianCalendar value) {
        this.outGrpPermittedValuesOutGrmTmstampHproductTmstamp = value;
    }

    /**
     * Gets the value of the outGrpPermittedValuesOutGrmWorkIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPermittedValuesOutGrmWorkIefSuppliedFlag() {
        return outGrpPermittedValuesOutGrmWorkIefSuppliedFlag;
    }

    /**
     * Sets the value of the outGrpPermittedValuesOutGrmWorkIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPermittedValuesOutGrmWorkIefSuppliedFlag(String value) {
        this.outGrpPermittedValuesOutGrmWorkIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outGrpPermittedValuesOutGrmWorkIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPermittedValuesOutGrmWorkIefSuppliedSelectChar() {
        return outGrpPermittedValuesOutGrmWorkIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpPermittedValuesOutGrmWorkIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPermittedValuesOutGrmWorkIefSuppliedSelectChar(String value) {
        this.outGrpPermittedValuesOutGrmWorkIefSuppliedSelectChar = value;
    }

}
