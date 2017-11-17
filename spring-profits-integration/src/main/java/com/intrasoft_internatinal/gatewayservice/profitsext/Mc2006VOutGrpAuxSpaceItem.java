
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Mc2006VOutGrpAuxSpaceItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mc2006VOutGrpAuxSpaceItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpAuxSpaceOutGmAuxReGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAuxSpaceOutGmAuxReGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAuxSpaceOutGmAuxReGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpAuxSpaceOutGrmAuxInfIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mc2006VOutGrpAuxSpaceItem", propOrder = {
    "outGrpAuxSpaceOutGmAuxReGenericDetailDescription",
    "outGrpAuxSpaceOutGmAuxReGenericDetailParameterType",
    "outGrpAuxSpaceOutGmAuxReGenericDetailSerialNum",
    "outGrpAuxSpaceOutGrmAuxInfIefSuppliedSelectChar"
})
public class Mc2006VOutGrpAuxSpaceItem {

    @XmlElement(name = "OutGrpAuxSpaceOutGmAuxReGenericDetailDescription")
    protected String outGrpAuxSpaceOutGmAuxReGenericDetailDescription;
    @XmlElement(name = "OutGrpAuxSpaceOutGmAuxReGenericDetailParameterType")
    protected String outGrpAuxSpaceOutGmAuxReGenericDetailParameterType;
    @XmlElement(name = "OutGrpAuxSpaceOutGmAuxReGenericDetailSerialNum")
    protected int outGrpAuxSpaceOutGmAuxReGenericDetailSerialNum;
    @XmlElement(name = "OutGrpAuxSpaceOutGrmAuxInfIefSuppliedSelectChar")
    protected String outGrpAuxSpaceOutGrmAuxInfIefSuppliedSelectChar;

    /**
     * Gets the value of the outGrpAuxSpaceOutGmAuxReGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAuxSpaceOutGmAuxReGenericDetailDescription() {
        return outGrpAuxSpaceOutGmAuxReGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpAuxSpaceOutGmAuxReGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAuxSpaceOutGmAuxReGenericDetailDescription(String value) {
        this.outGrpAuxSpaceOutGmAuxReGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpAuxSpaceOutGmAuxReGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAuxSpaceOutGmAuxReGenericDetailParameterType() {
        return outGrpAuxSpaceOutGmAuxReGenericDetailParameterType;
    }

    /**
     * Sets the value of the outGrpAuxSpaceOutGmAuxReGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAuxSpaceOutGmAuxReGenericDetailParameterType(String value) {
        this.outGrpAuxSpaceOutGmAuxReGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outGrpAuxSpaceOutGmAuxReGenericDetailSerialNum property.
     * 
     */
    public int getOutGrpAuxSpaceOutGmAuxReGenericDetailSerialNum() {
        return outGrpAuxSpaceOutGmAuxReGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outGrpAuxSpaceOutGmAuxReGenericDetailSerialNum property.
     * 
     */
    public void setOutGrpAuxSpaceOutGmAuxReGenericDetailSerialNum(int value) {
        this.outGrpAuxSpaceOutGmAuxReGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outGrpAuxSpaceOutGrmAuxInfIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAuxSpaceOutGrmAuxInfIefSuppliedSelectChar() {
        return outGrpAuxSpaceOutGrmAuxInfIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpAuxSpaceOutGrmAuxInfIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAuxSpaceOutGrmAuxInfIefSuppliedSelectChar(String value) {
        this.outGrpAuxSpaceOutGrmAuxInfIefSuppliedSelectChar = value;
    }

}
