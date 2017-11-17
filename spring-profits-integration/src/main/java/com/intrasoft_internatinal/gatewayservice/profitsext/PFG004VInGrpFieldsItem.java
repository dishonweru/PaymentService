
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PFG004VInGrpFieldsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PFG004VInGrpFieldsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpFieldsInGrmInputActionIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpFieldsInGrmInputCollateralFieldsCollInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InGrpFieldsInGrmInputCollateralFieldsCollRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpFieldsInGrmInputCollateralFieldsFieldLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpFieldsInGrmInputCollateralFieldsFieldValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpFieldsInGrmInputCollateralFieldsPfgSetCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpFieldsInGrmInputCollateralFieldsPfgSetSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpFieldsInGrmInputCollateralFieldsPfgTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpFieldsInGrmInputCollateralFieldsPfgTagSetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpFieldsInGrmInputCollateralFieldsShowOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpFieldsInGrmInputPfgSetupDetailNeedMandatory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpFieldsInGrmInputPfgSetupDetailShowOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpFieldsInGrmInputPfgSetupDetailShowToUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpFieldsInGrmInputSelIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PFG004VInGrpFieldsItem", propOrder = {
    "inGrpFieldsInGrmInputActionIefSuppliedFlag",
    "inGrpFieldsInGrmInputCollateralFieldsCollInternalSn",
    "inGrpFieldsInGrmInputCollateralFieldsCollRecordType",
    "inGrpFieldsInGrmInputCollateralFieldsFieldLabel",
    "inGrpFieldsInGrmInputCollateralFieldsFieldValue",
    "inGrpFieldsInGrmInputCollateralFieldsPfgSetCategory",
    "inGrpFieldsInGrmInputCollateralFieldsPfgSetSn",
    "inGrpFieldsInGrmInputCollateralFieldsPfgTag",
    "inGrpFieldsInGrmInputCollateralFieldsPfgTagSetCode",
    "inGrpFieldsInGrmInputCollateralFieldsShowOrder",
    "inGrpFieldsInGrmInputPfgSetupDetailNeedMandatory",
    "inGrpFieldsInGrmInputPfgSetupDetailShowOrder",
    "inGrpFieldsInGrmInputPfgSetupDetailShowToUser",
    "inGrpFieldsInGrmInputSelIefSuppliedSelectChar"
})
public class PFG004VInGrpFieldsItem {

    @XmlElement(name = "InGrpFieldsInGrmInputActionIefSuppliedFlag")
    protected String inGrpFieldsInGrmInputActionIefSuppliedFlag;
    @XmlElement(name = "InGrpFieldsInGrmInputCollateralFieldsCollInternalSn")
    protected double inGrpFieldsInGrmInputCollateralFieldsCollInternalSn;
    @XmlElement(name = "InGrpFieldsInGrmInputCollateralFieldsCollRecordType")
    protected String inGrpFieldsInGrmInputCollateralFieldsCollRecordType;
    @XmlElement(name = "InGrpFieldsInGrmInputCollateralFieldsFieldLabel")
    protected String inGrpFieldsInGrmInputCollateralFieldsFieldLabel;
    @XmlElement(name = "InGrpFieldsInGrmInputCollateralFieldsFieldValue")
    protected String inGrpFieldsInGrmInputCollateralFieldsFieldValue;
    @XmlElement(name = "InGrpFieldsInGrmInputCollateralFieldsPfgSetCategory")
    protected String inGrpFieldsInGrmInputCollateralFieldsPfgSetCategory;
    @XmlElement(name = "InGrpFieldsInGrmInputCollateralFieldsPfgSetSn")
    protected int inGrpFieldsInGrmInputCollateralFieldsPfgSetSn;
    @XmlElement(name = "InGrpFieldsInGrmInputCollateralFieldsPfgTag")
    protected String inGrpFieldsInGrmInputCollateralFieldsPfgTag;
    @XmlElement(name = "InGrpFieldsInGrmInputCollateralFieldsPfgTagSetCode")
    protected String inGrpFieldsInGrmInputCollateralFieldsPfgTagSetCode;
    @XmlElement(name = "InGrpFieldsInGrmInputCollateralFieldsShowOrder")
    protected int inGrpFieldsInGrmInputCollateralFieldsShowOrder;
    @XmlElement(name = "InGrpFieldsInGrmInputPfgSetupDetailNeedMandatory")
    protected String inGrpFieldsInGrmInputPfgSetupDetailNeedMandatory;
    @XmlElement(name = "InGrpFieldsInGrmInputPfgSetupDetailShowOrder")
    protected int inGrpFieldsInGrmInputPfgSetupDetailShowOrder;
    @XmlElement(name = "InGrpFieldsInGrmInputPfgSetupDetailShowToUser")
    protected String inGrpFieldsInGrmInputPfgSetupDetailShowToUser;
    @XmlElement(name = "InGrpFieldsInGrmInputSelIefSuppliedSelectChar")
    protected String inGrpFieldsInGrmInputSelIefSuppliedSelectChar;

    /**
     * Gets the value of the inGrpFieldsInGrmInputActionIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpFieldsInGrmInputActionIefSuppliedFlag() {
        return inGrpFieldsInGrmInputActionIefSuppliedFlag;
    }

    /**
     * Sets the value of the inGrpFieldsInGrmInputActionIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpFieldsInGrmInputActionIefSuppliedFlag(String value) {
        this.inGrpFieldsInGrmInputActionIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inGrpFieldsInGrmInputCollateralFieldsCollInternalSn property.
     * 
     */
    public double getInGrpFieldsInGrmInputCollateralFieldsCollInternalSn() {
        return inGrpFieldsInGrmInputCollateralFieldsCollInternalSn;
    }

    /**
     * Sets the value of the inGrpFieldsInGrmInputCollateralFieldsCollInternalSn property.
     * 
     */
    public void setInGrpFieldsInGrmInputCollateralFieldsCollInternalSn(double value) {
        this.inGrpFieldsInGrmInputCollateralFieldsCollInternalSn = value;
    }

    /**
     * Gets the value of the inGrpFieldsInGrmInputCollateralFieldsCollRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpFieldsInGrmInputCollateralFieldsCollRecordType() {
        return inGrpFieldsInGrmInputCollateralFieldsCollRecordType;
    }

    /**
     * Sets the value of the inGrpFieldsInGrmInputCollateralFieldsCollRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpFieldsInGrmInputCollateralFieldsCollRecordType(String value) {
        this.inGrpFieldsInGrmInputCollateralFieldsCollRecordType = value;
    }

    /**
     * Gets the value of the inGrpFieldsInGrmInputCollateralFieldsFieldLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpFieldsInGrmInputCollateralFieldsFieldLabel() {
        return inGrpFieldsInGrmInputCollateralFieldsFieldLabel;
    }

    /**
     * Sets the value of the inGrpFieldsInGrmInputCollateralFieldsFieldLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpFieldsInGrmInputCollateralFieldsFieldLabel(String value) {
        this.inGrpFieldsInGrmInputCollateralFieldsFieldLabel = value;
    }

    /**
     * Gets the value of the inGrpFieldsInGrmInputCollateralFieldsFieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpFieldsInGrmInputCollateralFieldsFieldValue() {
        return inGrpFieldsInGrmInputCollateralFieldsFieldValue;
    }

    /**
     * Sets the value of the inGrpFieldsInGrmInputCollateralFieldsFieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpFieldsInGrmInputCollateralFieldsFieldValue(String value) {
        this.inGrpFieldsInGrmInputCollateralFieldsFieldValue = value;
    }

    /**
     * Gets the value of the inGrpFieldsInGrmInputCollateralFieldsPfgSetCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpFieldsInGrmInputCollateralFieldsPfgSetCategory() {
        return inGrpFieldsInGrmInputCollateralFieldsPfgSetCategory;
    }

    /**
     * Sets the value of the inGrpFieldsInGrmInputCollateralFieldsPfgSetCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpFieldsInGrmInputCollateralFieldsPfgSetCategory(String value) {
        this.inGrpFieldsInGrmInputCollateralFieldsPfgSetCategory = value;
    }

    /**
     * Gets the value of the inGrpFieldsInGrmInputCollateralFieldsPfgSetSn property.
     * 
     */
    public int getInGrpFieldsInGrmInputCollateralFieldsPfgSetSn() {
        return inGrpFieldsInGrmInputCollateralFieldsPfgSetSn;
    }

    /**
     * Sets the value of the inGrpFieldsInGrmInputCollateralFieldsPfgSetSn property.
     * 
     */
    public void setInGrpFieldsInGrmInputCollateralFieldsPfgSetSn(int value) {
        this.inGrpFieldsInGrmInputCollateralFieldsPfgSetSn = value;
    }

    /**
     * Gets the value of the inGrpFieldsInGrmInputCollateralFieldsPfgTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpFieldsInGrmInputCollateralFieldsPfgTag() {
        return inGrpFieldsInGrmInputCollateralFieldsPfgTag;
    }

    /**
     * Sets the value of the inGrpFieldsInGrmInputCollateralFieldsPfgTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpFieldsInGrmInputCollateralFieldsPfgTag(String value) {
        this.inGrpFieldsInGrmInputCollateralFieldsPfgTag = value;
    }

    /**
     * Gets the value of the inGrpFieldsInGrmInputCollateralFieldsPfgTagSetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpFieldsInGrmInputCollateralFieldsPfgTagSetCode() {
        return inGrpFieldsInGrmInputCollateralFieldsPfgTagSetCode;
    }

    /**
     * Sets the value of the inGrpFieldsInGrmInputCollateralFieldsPfgTagSetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpFieldsInGrmInputCollateralFieldsPfgTagSetCode(String value) {
        this.inGrpFieldsInGrmInputCollateralFieldsPfgTagSetCode = value;
    }

    /**
     * Gets the value of the inGrpFieldsInGrmInputCollateralFieldsShowOrder property.
     * 
     */
    public int getInGrpFieldsInGrmInputCollateralFieldsShowOrder() {
        return inGrpFieldsInGrmInputCollateralFieldsShowOrder;
    }

    /**
     * Sets the value of the inGrpFieldsInGrmInputCollateralFieldsShowOrder property.
     * 
     */
    public void setInGrpFieldsInGrmInputCollateralFieldsShowOrder(int value) {
        this.inGrpFieldsInGrmInputCollateralFieldsShowOrder = value;
    }

    /**
     * Gets the value of the inGrpFieldsInGrmInputPfgSetupDetailNeedMandatory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpFieldsInGrmInputPfgSetupDetailNeedMandatory() {
        return inGrpFieldsInGrmInputPfgSetupDetailNeedMandatory;
    }

    /**
     * Sets the value of the inGrpFieldsInGrmInputPfgSetupDetailNeedMandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpFieldsInGrmInputPfgSetupDetailNeedMandatory(String value) {
        this.inGrpFieldsInGrmInputPfgSetupDetailNeedMandatory = value;
    }

    /**
     * Gets the value of the inGrpFieldsInGrmInputPfgSetupDetailShowOrder property.
     * 
     */
    public int getInGrpFieldsInGrmInputPfgSetupDetailShowOrder() {
        return inGrpFieldsInGrmInputPfgSetupDetailShowOrder;
    }

    /**
     * Sets the value of the inGrpFieldsInGrmInputPfgSetupDetailShowOrder property.
     * 
     */
    public void setInGrpFieldsInGrmInputPfgSetupDetailShowOrder(int value) {
        this.inGrpFieldsInGrmInputPfgSetupDetailShowOrder = value;
    }

    /**
     * Gets the value of the inGrpFieldsInGrmInputPfgSetupDetailShowToUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpFieldsInGrmInputPfgSetupDetailShowToUser() {
        return inGrpFieldsInGrmInputPfgSetupDetailShowToUser;
    }

    /**
     * Sets the value of the inGrpFieldsInGrmInputPfgSetupDetailShowToUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpFieldsInGrmInputPfgSetupDetailShowToUser(String value) {
        this.inGrpFieldsInGrmInputPfgSetupDetailShowToUser = value;
    }

    /**
     * Gets the value of the inGrpFieldsInGrmInputSelIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpFieldsInGrmInputSelIefSuppliedSelectChar() {
        return inGrpFieldsInGrmInputSelIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the inGrpFieldsInGrmInputSelIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpFieldsInGrmInputSelIefSuppliedSelectChar(String value) {
        this.inGrpFieldsInGrmInputSelIefSuppliedSelectChar = value;
    }

}
