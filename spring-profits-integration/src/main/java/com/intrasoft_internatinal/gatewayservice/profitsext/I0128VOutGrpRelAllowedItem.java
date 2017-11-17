
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for I0128VOutGrpRelAllowedItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="I0128VOutGrpRelAllowedItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpRelAllowedOutGrmRelGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRelAllowedOutGrmRelGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRelAllowedOutGrmRelGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpRelAllowedOutGrmRelIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRelAllowedOutGrmRelRelationshipRelAllAccounts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRelAllowedOutGrmRelRelationshipRelDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "I0128VOutGrpRelAllowedItem", propOrder = {
    "outGrpRelAllowedOutGrmRelGenericDetailDescription",
    "outGrpRelAllowedOutGrmRelGenericDetailParameterType",
    "outGrpRelAllowedOutGrmRelGenericDetailSerialNum",
    "outGrpRelAllowedOutGrmRelIefSuppliedSelectChar",
    "outGrpRelAllowedOutGrmRelRelationshipRelAllAccounts",
    "outGrpRelAllowedOutGrmRelRelationshipRelDescription"
})
public class I0128VOutGrpRelAllowedItem {

    @XmlElement(name = "OutGrpRelAllowedOutGrmRelGenericDetailDescription")
    protected String outGrpRelAllowedOutGrmRelGenericDetailDescription;
    @XmlElement(name = "OutGrpRelAllowedOutGrmRelGenericDetailParameterType")
    protected String outGrpRelAllowedOutGrmRelGenericDetailParameterType;
    @XmlElement(name = "OutGrpRelAllowedOutGrmRelGenericDetailSerialNum")
    protected int outGrpRelAllowedOutGrmRelGenericDetailSerialNum;
    @XmlElement(name = "OutGrpRelAllowedOutGrmRelIefSuppliedSelectChar")
    protected String outGrpRelAllowedOutGrmRelIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpRelAllowedOutGrmRelRelationshipRelAllAccounts")
    protected String outGrpRelAllowedOutGrmRelRelationshipRelAllAccounts;
    @XmlElement(name = "OutGrpRelAllowedOutGrmRelRelationshipRelDescription")
    protected String outGrpRelAllowedOutGrmRelRelationshipRelDescription;

    /**
     * Gets the value of the outGrpRelAllowedOutGrmRelGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRelAllowedOutGrmRelGenericDetailDescription() {
        return outGrpRelAllowedOutGrmRelGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpRelAllowedOutGrmRelGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRelAllowedOutGrmRelGenericDetailDescription(String value) {
        this.outGrpRelAllowedOutGrmRelGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpRelAllowedOutGrmRelGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRelAllowedOutGrmRelGenericDetailParameterType() {
        return outGrpRelAllowedOutGrmRelGenericDetailParameterType;
    }

    /**
     * Sets the value of the outGrpRelAllowedOutGrmRelGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRelAllowedOutGrmRelGenericDetailParameterType(String value) {
        this.outGrpRelAllowedOutGrmRelGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outGrpRelAllowedOutGrmRelGenericDetailSerialNum property.
     * 
     */
    public int getOutGrpRelAllowedOutGrmRelGenericDetailSerialNum() {
        return outGrpRelAllowedOutGrmRelGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outGrpRelAllowedOutGrmRelGenericDetailSerialNum property.
     * 
     */
    public void setOutGrpRelAllowedOutGrmRelGenericDetailSerialNum(int value) {
        this.outGrpRelAllowedOutGrmRelGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outGrpRelAllowedOutGrmRelIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRelAllowedOutGrmRelIefSuppliedSelectChar() {
        return outGrpRelAllowedOutGrmRelIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpRelAllowedOutGrmRelIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRelAllowedOutGrmRelIefSuppliedSelectChar(String value) {
        this.outGrpRelAllowedOutGrmRelIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpRelAllowedOutGrmRelRelationshipRelAllAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRelAllowedOutGrmRelRelationshipRelAllAccounts() {
        return outGrpRelAllowedOutGrmRelRelationshipRelAllAccounts;
    }

    /**
     * Sets the value of the outGrpRelAllowedOutGrmRelRelationshipRelAllAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRelAllowedOutGrmRelRelationshipRelAllAccounts(String value) {
        this.outGrpRelAllowedOutGrmRelRelationshipRelAllAccounts = value;
    }

    /**
     * Gets the value of the outGrpRelAllowedOutGrmRelRelationshipRelDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRelAllowedOutGrmRelRelationshipRelDescription() {
        return outGrpRelAllowedOutGrmRelRelationshipRelDescription;
    }

    /**
     * Sets the value of the outGrpRelAllowedOutGrmRelRelationshipRelDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRelAllowedOutGrmRelRelationshipRelDescription(String value) {
        this.outGrpRelAllowedOutGrmRelRelationshipRelDescription = value;
    }

}
