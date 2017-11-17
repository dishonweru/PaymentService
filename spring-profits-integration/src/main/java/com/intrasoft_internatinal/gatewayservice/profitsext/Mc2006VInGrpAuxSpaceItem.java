
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Mc2006VInGrpAuxSpaceItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mc2006VInGrpAuxSpaceItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpAuxSpaceInGrmAuxReGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpAuxSpaceInGrmAuxReGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpAuxSpaceInGrmAuxReGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpAuxSpaceInGrmAuxInfIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mc2006VInGrpAuxSpaceItem", propOrder = {
    "inGrpAuxSpaceInGrmAuxReGenericDetailSerialNum",
    "inGrpAuxSpaceInGrmAuxReGenericDetailDescription",
    "inGrpAuxSpaceInGrmAuxReGenericDetailParameterType",
    "inGrpAuxSpaceInGrmAuxInfIefSuppliedSelectChar"
})
public class Mc2006VInGrpAuxSpaceItem {

    @XmlElement(name = "InGrpAuxSpaceInGrmAuxReGenericDetailSerialNum")
    protected int inGrpAuxSpaceInGrmAuxReGenericDetailSerialNum;
    @XmlElement(name = "InGrpAuxSpaceInGrmAuxReGenericDetailDescription")
    protected String inGrpAuxSpaceInGrmAuxReGenericDetailDescription;
    @XmlElement(name = "InGrpAuxSpaceInGrmAuxReGenericDetailParameterType")
    protected String inGrpAuxSpaceInGrmAuxReGenericDetailParameterType;
    @XmlElement(name = "InGrpAuxSpaceInGrmAuxInfIefSuppliedSelectChar")
    protected String inGrpAuxSpaceInGrmAuxInfIefSuppliedSelectChar;

    /**
     * Gets the value of the inGrpAuxSpaceInGrmAuxReGenericDetailSerialNum property.
     * 
     */
    public int getInGrpAuxSpaceInGrmAuxReGenericDetailSerialNum() {
        return inGrpAuxSpaceInGrmAuxReGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inGrpAuxSpaceInGrmAuxReGenericDetailSerialNum property.
     * 
     */
    public void setInGrpAuxSpaceInGrmAuxReGenericDetailSerialNum(int value) {
        this.inGrpAuxSpaceInGrmAuxReGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inGrpAuxSpaceInGrmAuxReGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpAuxSpaceInGrmAuxReGenericDetailDescription() {
        return inGrpAuxSpaceInGrmAuxReGenericDetailDescription;
    }

    /**
     * Sets the value of the inGrpAuxSpaceInGrmAuxReGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpAuxSpaceInGrmAuxReGenericDetailDescription(String value) {
        this.inGrpAuxSpaceInGrmAuxReGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inGrpAuxSpaceInGrmAuxReGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpAuxSpaceInGrmAuxReGenericDetailParameterType() {
        return inGrpAuxSpaceInGrmAuxReGenericDetailParameterType;
    }

    /**
     * Sets the value of the inGrpAuxSpaceInGrmAuxReGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpAuxSpaceInGrmAuxReGenericDetailParameterType(String value) {
        this.inGrpAuxSpaceInGrmAuxReGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inGrpAuxSpaceInGrmAuxInfIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpAuxSpaceInGrmAuxInfIefSuppliedSelectChar() {
        return inGrpAuxSpaceInGrmAuxInfIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the inGrpAuxSpaceInGrmAuxInfIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpAuxSpaceInGrmAuxInfIefSuppliedSelectChar(String value) {
        this.inGrpAuxSpaceInGrmAuxInfIefSuppliedSelectChar = value;
    }

}
