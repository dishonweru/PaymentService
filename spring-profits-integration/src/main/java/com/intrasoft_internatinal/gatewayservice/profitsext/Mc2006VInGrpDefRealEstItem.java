
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Mc2006VInGrpDefRealEstItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mc2006VInGrpDefRealEstItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpDefRealEstInGrmDefGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpDefRealEstInGrmDefGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpDefRealEstInGrmDefGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpDefRealEstInGrmDefIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mc2006VInGrpDefRealEstItem", propOrder = {
    "inGrpDefRealEstInGrmDefGenericDetailSerialNum",
    "inGrpDefRealEstInGrmDefGenericDetailDescription",
    "inGrpDefRealEstInGrmDefGenericDetailParameterType",
    "inGrpDefRealEstInGrmDefIefSuppliedSelectChar"
})
public class Mc2006VInGrpDefRealEstItem {

    @XmlElement(name = "InGrpDefRealEstInGrmDefGenericDetailSerialNum")
    protected int inGrpDefRealEstInGrmDefGenericDetailSerialNum;
    @XmlElement(name = "InGrpDefRealEstInGrmDefGenericDetailDescription")
    protected String inGrpDefRealEstInGrmDefGenericDetailDescription;
    @XmlElement(name = "InGrpDefRealEstInGrmDefGenericDetailParameterType")
    protected String inGrpDefRealEstInGrmDefGenericDetailParameterType;
    @XmlElement(name = "InGrpDefRealEstInGrmDefIefSuppliedSelectChar")
    protected String inGrpDefRealEstInGrmDefIefSuppliedSelectChar;

    /**
     * Gets the value of the inGrpDefRealEstInGrmDefGenericDetailSerialNum property.
     * 
     */
    public int getInGrpDefRealEstInGrmDefGenericDetailSerialNum() {
        return inGrpDefRealEstInGrmDefGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inGrpDefRealEstInGrmDefGenericDetailSerialNum property.
     * 
     */
    public void setInGrpDefRealEstInGrmDefGenericDetailSerialNum(int value) {
        this.inGrpDefRealEstInGrmDefGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inGrpDefRealEstInGrmDefGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpDefRealEstInGrmDefGenericDetailDescription() {
        return inGrpDefRealEstInGrmDefGenericDetailDescription;
    }

    /**
     * Sets the value of the inGrpDefRealEstInGrmDefGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpDefRealEstInGrmDefGenericDetailDescription(String value) {
        this.inGrpDefRealEstInGrmDefGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inGrpDefRealEstInGrmDefGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpDefRealEstInGrmDefGenericDetailParameterType() {
        return inGrpDefRealEstInGrmDefGenericDetailParameterType;
    }

    /**
     * Sets the value of the inGrpDefRealEstInGrmDefGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpDefRealEstInGrmDefGenericDetailParameterType(String value) {
        this.inGrpDefRealEstInGrmDefGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inGrpDefRealEstInGrmDefIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpDefRealEstInGrmDefIefSuppliedSelectChar() {
        return inGrpDefRealEstInGrmDefIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the inGrpDefRealEstInGrmDefIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpDefRealEstInGrmDefIefSuppliedSelectChar(String value) {
        this.inGrpDefRealEstInGrmDefIefSuppliedSelectChar = value;
    }

}
