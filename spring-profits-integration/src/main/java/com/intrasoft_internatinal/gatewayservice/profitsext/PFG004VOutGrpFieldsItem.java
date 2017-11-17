
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PFG004VOutGrpFieldsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PFG004VOutGrpFieldsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpFieldsOutGrmActionIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpFieldsOutGrmCollateralFieldsCollInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpFieldsOutGrmCollateralFieldsCollRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpFieldsOutGrmCollateralFieldsFieldLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpFieldsOutGrmCollateralFieldsFieldValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpFieldsOutGrmCollateralFieldsPfgSetCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpFieldsOutGrmCollateralFieldsPfgSetSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpFieldsOutGrmCollateralFieldsPfgTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpFieldsOutGrmCollateralFieldsPfgTagSetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpFieldsOutGrmCollateralFieldsShowOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpFieldsOutGrmPfgSetupDetailCheckEditProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpFieldsOutGrmPfgSetupDetailNeedMandatory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpFieldsOutGrmPfgSetupDetailShowOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpFieldsOutGrmPfgSetupDetailShowToUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpFieldsOutGrmSelIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PFG004VOutGrpFieldsItem", propOrder = {
    "outGrpFieldsOutGrmActionIefSuppliedFlag",
    "outGrpFieldsOutGrmCollateralFieldsCollInternalSn",
    "outGrpFieldsOutGrmCollateralFieldsCollRecordType",
    "outGrpFieldsOutGrmCollateralFieldsFieldLabel",
    "outGrpFieldsOutGrmCollateralFieldsFieldValue",
    "outGrpFieldsOutGrmCollateralFieldsPfgSetCategory",
    "outGrpFieldsOutGrmCollateralFieldsPfgSetSn",
    "outGrpFieldsOutGrmCollateralFieldsPfgTag",
    "outGrpFieldsOutGrmCollateralFieldsPfgTagSetCode",
    "outGrpFieldsOutGrmCollateralFieldsShowOrder",
    "outGrpFieldsOutGrmPfgSetupDetailCheckEditProfile",
    "outGrpFieldsOutGrmPfgSetupDetailNeedMandatory",
    "outGrpFieldsOutGrmPfgSetupDetailShowOrder",
    "outGrpFieldsOutGrmPfgSetupDetailShowToUser",
    "outGrpFieldsOutGrmSelIefSuppliedSelectChar"
})
public class PFG004VOutGrpFieldsItem {

    @XmlElement(name = "OutGrpFieldsOutGrmActionIefSuppliedFlag")
    protected String outGrpFieldsOutGrmActionIefSuppliedFlag;
    @XmlElement(name = "OutGrpFieldsOutGrmCollateralFieldsCollInternalSn")
    protected double outGrpFieldsOutGrmCollateralFieldsCollInternalSn;
    @XmlElement(name = "OutGrpFieldsOutGrmCollateralFieldsCollRecordType")
    protected String outGrpFieldsOutGrmCollateralFieldsCollRecordType;
    @XmlElement(name = "OutGrpFieldsOutGrmCollateralFieldsFieldLabel")
    protected String outGrpFieldsOutGrmCollateralFieldsFieldLabel;
    @XmlElement(name = "OutGrpFieldsOutGrmCollateralFieldsFieldValue")
    protected String outGrpFieldsOutGrmCollateralFieldsFieldValue;
    @XmlElement(name = "OutGrpFieldsOutGrmCollateralFieldsPfgSetCategory")
    protected String outGrpFieldsOutGrmCollateralFieldsPfgSetCategory;
    @XmlElement(name = "OutGrpFieldsOutGrmCollateralFieldsPfgSetSn")
    protected int outGrpFieldsOutGrmCollateralFieldsPfgSetSn;
    @XmlElement(name = "OutGrpFieldsOutGrmCollateralFieldsPfgTag")
    protected String outGrpFieldsOutGrmCollateralFieldsPfgTag;
    @XmlElement(name = "OutGrpFieldsOutGrmCollateralFieldsPfgTagSetCode")
    protected String outGrpFieldsOutGrmCollateralFieldsPfgTagSetCode;
    @XmlElement(name = "OutGrpFieldsOutGrmCollateralFieldsShowOrder")
    protected int outGrpFieldsOutGrmCollateralFieldsShowOrder;
    @XmlElement(name = "OutGrpFieldsOutGrmPfgSetupDetailCheckEditProfile")
    protected String outGrpFieldsOutGrmPfgSetupDetailCheckEditProfile;
    @XmlElement(name = "OutGrpFieldsOutGrmPfgSetupDetailNeedMandatory")
    protected String outGrpFieldsOutGrmPfgSetupDetailNeedMandatory;
    @XmlElement(name = "OutGrpFieldsOutGrmPfgSetupDetailShowOrder")
    protected int outGrpFieldsOutGrmPfgSetupDetailShowOrder;
    @XmlElement(name = "OutGrpFieldsOutGrmPfgSetupDetailShowToUser")
    protected String outGrpFieldsOutGrmPfgSetupDetailShowToUser;
    @XmlElement(name = "OutGrpFieldsOutGrmSelIefSuppliedSelectChar")
    protected String outGrpFieldsOutGrmSelIefSuppliedSelectChar;

    /**
     * Gets the value of the outGrpFieldsOutGrmActionIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpFieldsOutGrmActionIefSuppliedFlag() {
        return outGrpFieldsOutGrmActionIefSuppliedFlag;
    }

    /**
     * Sets the value of the outGrpFieldsOutGrmActionIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpFieldsOutGrmActionIefSuppliedFlag(String value) {
        this.outGrpFieldsOutGrmActionIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outGrpFieldsOutGrmCollateralFieldsCollInternalSn property.
     * 
     */
    public double getOutGrpFieldsOutGrmCollateralFieldsCollInternalSn() {
        return outGrpFieldsOutGrmCollateralFieldsCollInternalSn;
    }

    /**
     * Sets the value of the outGrpFieldsOutGrmCollateralFieldsCollInternalSn property.
     * 
     */
    public void setOutGrpFieldsOutGrmCollateralFieldsCollInternalSn(double value) {
        this.outGrpFieldsOutGrmCollateralFieldsCollInternalSn = value;
    }

    /**
     * Gets the value of the outGrpFieldsOutGrmCollateralFieldsCollRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpFieldsOutGrmCollateralFieldsCollRecordType() {
        return outGrpFieldsOutGrmCollateralFieldsCollRecordType;
    }

    /**
     * Sets the value of the outGrpFieldsOutGrmCollateralFieldsCollRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpFieldsOutGrmCollateralFieldsCollRecordType(String value) {
        this.outGrpFieldsOutGrmCollateralFieldsCollRecordType = value;
    }

    /**
     * Gets the value of the outGrpFieldsOutGrmCollateralFieldsFieldLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpFieldsOutGrmCollateralFieldsFieldLabel() {
        return outGrpFieldsOutGrmCollateralFieldsFieldLabel;
    }

    /**
     * Sets the value of the outGrpFieldsOutGrmCollateralFieldsFieldLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpFieldsOutGrmCollateralFieldsFieldLabel(String value) {
        this.outGrpFieldsOutGrmCollateralFieldsFieldLabel = value;
    }

    /**
     * Gets the value of the outGrpFieldsOutGrmCollateralFieldsFieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpFieldsOutGrmCollateralFieldsFieldValue() {
        return outGrpFieldsOutGrmCollateralFieldsFieldValue;
    }

    /**
     * Sets the value of the outGrpFieldsOutGrmCollateralFieldsFieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpFieldsOutGrmCollateralFieldsFieldValue(String value) {
        this.outGrpFieldsOutGrmCollateralFieldsFieldValue = value;
    }

    /**
     * Gets the value of the outGrpFieldsOutGrmCollateralFieldsPfgSetCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpFieldsOutGrmCollateralFieldsPfgSetCategory() {
        return outGrpFieldsOutGrmCollateralFieldsPfgSetCategory;
    }

    /**
     * Sets the value of the outGrpFieldsOutGrmCollateralFieldsPfgSetCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpFieldsOutGrmCollateralFieldsPfgSetCategory(String value) {
        this.outGrpFieldsOutGrmCollateralFieldsPfgSetCategory = value;
    }

    /**
     * Gets the value of the outGrpFieldsOutGrmCollateralFieldsPfgSetSn property.
     * 
     */
    public int getOutGrpFieldsOutGrmCollateralFieldsPfgSetSn() {
        return outGrpFieldsOutGrmCollateralFieldsPfgSetSn;
    }

    /**
     * Sets the value of the outGrpFieldsOutGrmCollateralFieldsPfgSetSn property.
     * 
     */
    public void setOutGrpFieldsOutGrmCollateralFieldsPfgSetSn(int value) {
        this.outGrpFieldsOutGrmCollateralFieldsPfgSetSn = value;
    }

    /**
     * Gets the value of the outGrpFieldsOutGrmCollateralFieldsPfgTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpFieldsOutGrmCollateralFieldsPfgTag() {
        return outGrpFieldsOutGrmCollateralFieldsPfgTag;
    }

    /**
     * Sets the value of the outGrpFieldsOutGrmCollateralFieldsPfgTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpFieldsOutGrmCollateralFieldsPfgTag(String value) {
        this.outGrpFieldsOutGrmCollateralFieldsPfgTag = value;
    }

    /**
     * Gets the value of the outGrpFieldsOutGrmCollateralFieldsPfgTagSetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpFieldsOutGrmCollateralFieldsPfgTagSetCode() {
        return outGrpFieldsOutGrmCollateralFieldsPfgTagSetCode;
    }

    /**
     * Sets the value of the outGrpFieldsOutGrmCollateralFieldsPfgTagSetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpFieldsOutGrmCollateralFieldsPfgTagSetCode(String value) {
        this.outGrpFieldsOutGrmCollateralFieldsPfgTagSetCode = value;
    }

    /**
     * Gets the value of the outGrpFieldsOutGrmCollateralFieldsShowOrder property.
     * 
     */
    public int getOutGrpFieldsOutGrmCollateralFieldsShowOrder() {
        return outGrpFieldsOutGrmCollateralFieldsShowOrder;
    }

    /**
     * Sets the value of the outGrpFieldsOutGrmCollateralFieldsShowOrder property.
     * 
     */
    public void setOutGrpFieldsOutGrmCollateralFieldsShowOrder(int value) {
        this.outGrpFieldsOutGrmCollateralFieldsShowOrder = value;
    }

    /**
     * Gets the value of the outGrpFieldsOutGrmPfgSetupDetailCheckEditProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpFieldsOutGrmPfgSetupDetailCheckEditProfile() {
        return outGrpFieldsOutGrmPfgSetupDetailCheckEditProfile;
    }

    /**
     * Sets the value of the outGrpFieldsOutGrmPfgSetupDetailCheckEditProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpFieldsOutGrmPfgSetupDetailCheckEditProfile(String value) {
        this.outGrpFieldsOutGrmPfgSetupDetailCheckEditProfile = value;
    }

    /**
     * Gets the value of the outGrpFieldsOutGrmPfgSetupDetailNeedMandatory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpFieldsOutGrmPfgSetupDetailNeedMandatory() {
        return outGrpFieldsOutGrmPfgSetupDetailNeedMandatory;
    }

    /**
     * Sets the value of the outGrpFieldsOutGrmPfgSetupDetailNeedMandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpFieldsOutGrmPfgSetupDetailNeedMandatory(String value) {
        this.outGrpFieldsOutGrmPfgSetupDetailNeedMandatory = value;
    }

    /**
     * Gets the value of the outGrpFieldsOutGrmPfgSetupDetailShowOrder property.
     * 
     */
    public int getOutGrpFieldsOutGrmPfgSetupDetailShowOrder() {
        return outGrpFieldsOutGrmPfgSetupDetailShowOrder;
    }

    /**
     * Sets the value of the outGrpFieldsOutGrmPfgSetupDetailShowOrder property.
     * 
     */
    public void setOutGrpFieldsOutGrmPfgSetupDetailShowOrder(int value) {
        this.outGrpFieldsOutGrmPfgSetupDetailShowOrder = value;
    }

    /**
     * Gets the value of the outGrpFieldsOutGrmPfgSetupDetailShowToUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpFieldsOutGrmPfgSetupDetailShowToUser() {
        return outGrpFieldsOutGrmPfgSetupDetailShowToUser;
    }

    /**
     * Sets the value of the outGrpFieldsOutGrmPfgSetupDetailShowToUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpFieldsOutGrmPfgSetupDetailShowToUser(String value) {
        this.outGrpFieldsOutGrmPfgSetupDetailShowToUser = value;
    }

    /**
     * Gets the value of the outGrpFieldsOutGrmSelIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpFieldsOutGrmSelIefSuppliedSelectChar() {
        return outGrpFieldsOutGrmSelIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpFieldsOutGrmSelIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpFieldsOutGrmSelIefSuppliedSelectChar(String value) {
        this.outGrpFieldsOutGrmSelIefSuppliedSelectChar = value;
    }

}
