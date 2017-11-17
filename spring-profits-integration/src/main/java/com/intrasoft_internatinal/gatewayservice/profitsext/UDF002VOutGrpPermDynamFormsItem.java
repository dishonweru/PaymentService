
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UDF002VOutGrpPermDynamFormsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UDF002VOutGrpPermDynamFormsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpPermDynamFormsOutGrmAlreadyUsedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupSetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupSetupFormSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupTagSetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPermDynamFormsOutGrmUsageFlgIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UDF002VOutGrpPermDynamFormsItem", propOrder = {
    "outGrpPermDynamFormsOutGrmAlreadyUsedIefSuppliedFlag",
    "outGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupDescription",
    "outGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupEntryStatus",
    "outGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupSetType",
    "outGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupSetupFormSn",
    "outGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupTagSetCode",
    "outGrpPermDynamFormsOutGrmUsageFlgIefSuppliedFlag"
})
public class UDF002VOutGrpPermDynamFormsItem {

    @XmlElement(name = "OutGrpPermDynamFormsOutGrmAlreadyUsedIefSuppliedFlag")
    protected String outGrpPermDynamFormsOutGrmAlreadyUsedIefSuppliedFlag;
    @XmlElement(name = "OutGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupDescription")
    protected String outGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupDescription;
    @XmlElement(name = "OutGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupEntryStatus")
    protected String outGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupEntryStatus;
    @XmlElement(name = "OutGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupSetType")
    protected String outGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupSetType;
    @XmlElement(name = "OutGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupSetupFormSn")
    protected int outGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupSetupFormSn;
    @XmlElement(name = "OutGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupTagSetCode")
    protected String outGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupTagSetCode;
    @XmlElement(name = "OutGrpPermDynamFormsOutGrmUsageFlgIefSuppliedFlag")
    protected String outGrpPermDynamFormsOutGrmUsageFlgIefSuppliedFlag;

    /**
     * Gets the value of the outGrpPermDynamFormsOutGrmAlreadyUsedIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPermDynamFormsOutGrmAlreadyUsedIefSuppliedFlag() {
        return outGrpPermDynamFormsOutGrmAlreadyUsedIefSuppliedFlag;
    }

    /**
     * Sets the value of the outGrpPermDynamFormsOutGrmAlreadyUsedIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPermDynamFormsOutGrmAlreadyUsedIefSuppliedFlag(String value) {
        this.outGrpPermDynamFormsOutGrmAlreadyUsedIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupDescription() {
        return outGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupDescription;
    }

    /**
     * Sets the value of the outGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupDescription(String value) {
        this.outGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupDescription = value;
    }

    /**
     * Gets the value of the outGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupEntryStatus() {
        return outGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupEntryStatus;
    }

    /**
     * Sets the value of the outGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupEntryStatus(String value) {
        this.outGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupEntryStatus = value;
    }

    /**
     * Gets the value of the outGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupSetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupSetType() {
        return outGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupSetType;
    }

    /**
     * Sets the value of the outGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupSetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupSetType(String value) {
        this.outGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupSetType = value;
    }

    /**
     * Gets the value of the outGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupSetupFormSn property.
     * 
     */
    public int getOutGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupSetupFormSn() {
        return outGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupSetupFormSn;
    }

    /**
     * Sets the value of the outGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupSetupFormSn property.
     * 
     */
    public void setOutGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupSetupFormSn(int value) {
        this.outGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupSetupFormSn = value;
    }

    /**
     * Gets the value of the outGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupTagSetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupTagSetCode() {
        return outGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupTagSetCode;
    }

    /**
     * Sets the value of the outGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupTagSetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupTagSetCode(String value) {
        this.outGrpPermDynamFormsOutGrmPermDynFormsPfgTagSetSetupTagSetCode = value;
    }

    /**
     * Gets the value of the outGrpPermDynamFormsOutGrmUsageFlgIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPermDynamFormsOutGrmUsageFlgIefSuppliedFlag() {
        return outGrpPermDynamFormsOutGrmUsageFlgIefSuppliedFlag;
    }

    /**
     * Sets the value of the outGrpPermDynamFormsOutGrmUsageFlgIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPermDynamFormsOutGrmUsageFlgIefSuppliedFlag(String value) {
        this.outGrpPermDynamFormsOutGrmUsageFlgIefSuppliedFlag = value;
    }

}
