
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Mc2006VOutGrpDefRealEstItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mc2006VOutGrpDefRealEstItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpDefRealEstOutGrmDefGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDefRealEstOutGrmDefGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDefRealEstOutGrmDefGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpDefRealEstOutGrmDefInfoIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mc2006VOutGrpDefRealEstItem", propOrder = {
    "outGrpDefRealEstOutGrmDefGenericDetailDescription",
    "outGrpDefRealEstOutGrmDefGenericDetailParameterType",
    "outGrpDefRealEstOutGrmDefGenericDetailSerialNum",
    "outGrpDefRealEstOutGrmDefInfoIefSuppliedSelectChar"
})
public class Mc2006VOutGrpDefRealEstItem {

    @XmlElement(name = "OutGrpDefRealEstOutGrmDefGenericDetailDescription")
    protected String outGrpDefRealEstOutGrmDefGenericDetailDescription;
    @XmlElement(name = "OutGrpDefRealEstOutGrmDefGenericDetailParameterType")
    protected String outGrpDefRealEstOutGrmDefGenericDetailParameterType;
    @XmlElement(name = "OutGrpDefRealEstOutGrmDefGenericDetailSerialNum")
    protected int outGrpDefRealEstOutGrmDefGenericDetailSerialNum;
    @XmlElement(name = "OutGrpDefRealEstOutGrmDefInfoIefSuppliedSelectChar")
    protected String outGrpDefRealEstOutGrmDefInfoIefSuppliedSelectChar;

    /**
     * Gets the value of the outGrpDefRealEstOutGrmDefGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDefRealEstOutGrmDefGenericDetailDescription() {
        return outGrpDefRealEstOutGrmDefGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpDefRealEstOutGrmDefGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDefRealEstOutGrmDefGenericDetailDescription(String value) {
        this.outGrpDefRealEstOutGrmDefGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpDefRealEstOutGrmDefGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDefRealEstOutGrmDefGenericDetailParameterType() {
        return outGrpDefRealEstOutGrmDefGenericDetailParameterType;
    }

    /**
     * Sets the value of the outGrpDefRealEstOutGrmDefGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDefRealEstOutGrmDefGenericDetailParameterType(String value) {
        this.outGrpDefRealEstOutGrmDefGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outGrpDefRealEstOutGrmDefGenericDetailSerialNum property.
     * 
     */
    public int getOutGrpDefRealEstOutGrmDefGenericDetailSerialNum() {
        return outGrpDefRealEstOutGrmDefGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outGrpDefRealEstOutGrmDefGenericDetailSerialNum property.
     * 
     */
    public void setOutGrpDefRealEstOutGrmDefGenericDetailSerialNum(int value) {
        this.outGrpDefRealEstOutGrmDefGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outGrpDefRealEstOutGrmDefInfoIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDefRealEstOutGrmDefInfoIefSuppliedSelectChar() {
        return outGrpDefRealEstOutGrmDefInfoIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpDefRealEstOutGrmDefInfoIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDefRealEstOutGrmDefInfoIefSuppliedSelectChar(String value) {
        this.outGrpDefRealEstOutGrmDefInfoIefSuppliedSelectChar = value;
    }

}
