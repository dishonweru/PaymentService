
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Mc2006VInGrpQualInfoItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mc2006VInGrpQualInfoItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpQualInfoInGrmQualReGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpQualInfoInGrmQualReGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpQualInfoInGrmQualReGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpQualInfoInGrmQualInfIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mc2006VInGrpQualInfoItem", propOrder = {
    "inGrpQualInfoInGrmQualReGenericDetailSerialNum",
    "inGrpQualInfoInGrmQualReGenericDetailDescription",
    "inGrpQualInfoInGrmQualReGenericDetailParameterType",
    "inGrpQualInfoInGrmQualInfIefSuppliedSelectChar"
})
public class Mc2006VInGrpQualInfoItem {

    @XmlElement(name = "InGrpQualInfoInGrmQualReGenericDetailSerialNum")
    protected int inGrpQualInfoInGrmQualReGenericDetailSerialNum;
    @XmlElement(name = "InGrpQualInfoInGrmQualReGenericDetailDescription")
    protected String inGrpQualInfoInGrmQualReGenericDetailDescription;
    @XmlElement(name = "InGrpQualInfoInGrmQualReGenericDetailParameterType")
    protected String inGrpQualInfoInGrmQualReGenericDetailParameterType;
    @XmlElement(name = "InGrpQualInfoInGrmQualInfIefSuppliedSelectChar")
    protected String inGrpQualInfoInGrmQualInfIefSuppliedSelectChar;

    /**
     * Gets the value of the inGrpQualInfoInGrmQualReGenericDetailSerialNum property.
     * 
     */
    public int getInGrpQualInfoInGrmQualReGenericDetailSerialNum() {
        return inGrpQualInfoInGrmQualReGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inGrpQualInfoInGrmQualReGenericDetailSerialNum property.
     * 
     */
    public void setInGrpQualInfoInGrmQualReGenericDetailSerialNum(int value) {
        this.inGrpQualInfoInGrmQualReGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inGrpQualInfoInGrmQualReGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpQualInfoInGrmQualReGenericDetailDescription() {
        return inGrpQualInfoInGrmQualReGenericDetailDescription;
    }

    /**
     * Sets the value of the inGrpQualInfoInGrmQualReGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpQualInfoInGrmQualReGenericDetailDescription(String value) {
        this.inGrpQualInfoInGrmQualReGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inGrpQualInfoInGrmQualReGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpQualInfoInGrmQualReGenericDetailParameterType() {
        return inGrpQualInfoInGrmQualReGenericDetailParameterType;
    }

    /**
     * Sets the value of the inGrpQualInfoInGrmQualReGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpQualInfoInGrmQualReGenericDetailParameterType(String value) {
        this.inGrpQualInfoInGrmQualReGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inGrpQualInfoInGrmQualInfIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpQualInfoInGrmQualInfIefSuppliedSelectChar() {
        return inGrpQualInfoInGrmQualInfIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the inGrpQualInfoInGrmQualInfIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpQualInfoInGrmQualInfIefSuppliedSelectChar(String value) {
        this.inGrpQualInfoInGrmQualInfIefSuppliedSelectChar = value;
    }

}
