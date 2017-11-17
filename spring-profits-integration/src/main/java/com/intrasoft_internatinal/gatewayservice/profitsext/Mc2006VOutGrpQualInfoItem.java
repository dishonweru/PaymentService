
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Mc2006VOutGrpQualInfoItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mc2006VOutGrpQualInfoItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpQualInfoOutGrmQualInfIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpQualInfoOutGrmQualReGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpQualInfoOutGrmQualReGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpQualInfoOutGrmQualReGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mc2006VOutGrpQualInfoItem", propOrder = {
    "outGrpQualInfoOutGrmQualInfIefSuppliedSelectChar",
    "outGrpQualInfoOutGrmQualReGenericDetailDescription",
    "outGrpQualInfoOutGrmQualReGenericDetailParameterType",
    "outGrpQualInfoOutGrmQualReGenericDetailSerialNum"
})
public class Mc2006VOutGrpQualInfoItem {

    @XmlElement(name = "OutGrpQualInfoOutGrmQualInfIefSuppliedSelectChar")
    protected String outGrpQualInfoOutGrmQualInfIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpQualInfoOutGrmQualReGenericDetailDescription")
    protected String outGrpQualInfoOutGrmQualReGenericDetailDescription;
    @XmlElement(name = "OutGrpQualInfoOutGrmQualReGenericDetailParameterType")
    protected String outGrpQualInfoOutGrmQualReGenericDetailParameterType;
    @XmlElement(name = "OutGrpQualInfoOutGrmQualReGenericDetailSerialNum")
    protected int outGrpQualInfoOutGrmQualReGenericDetailSerialNum;

    /**
     * Gets the value of the outGrpQualInfoOutGrmQualInfIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpQualInfoOutGrmQualInfIefSuppliedSelectChar() {
        return outGrpQualInfoOutGrmQualInfIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpQualInfoOutGrmQualInfIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpQualInfoOutGrmQualInfIefSuppliedSelectChar(String value) {
        this.outGrpQualInfoOutGrmQualInfIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpQualInfoOutGrmQualReGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpQualInfoOutGrmQualReGenericDetailDescription() {
        return outGrpQualInfoOutGrmQualReGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpQualInfoOutGrmQualReGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpQualInfoOutGrmQualReGenericDetailDescription(String value) {
        this.outGrpQualInfoOutGrmQualReGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpQualInfoOutGrmQualReGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpQualInfoOutGrmQualReGenericDetailParameterType() {
        return outGrpQualInfoOutGrmQualReGenericDetailParameterType;
    }

    /**
     * Sets the value of the outGrpQualInfoOutGrmQualReGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpQualInfoOutGrmQualReGenericDetailParameterType(String value) {
        this.outGrpQualInfoOutGrmQualReGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outGrpQualInfoOutGrmQualReGenericDetailSerialNum property.
     * 
     */
    public int getOutGrpQualInfoOutGrmQualReGenericDetailSerialNum() {
        return outGrpQualInfoOutGrmQualReGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outGrpQualInfoOutGrmQualReGenericDetailSerialNum property.
     * 
     */
    public void setOutGrpQualInfoOutGrmQualReGenericDetailSerialNum(int value) {
        this.outGrpQualInfoOutGrmQualReGenericDetailSerialNum = value;
    }

}
