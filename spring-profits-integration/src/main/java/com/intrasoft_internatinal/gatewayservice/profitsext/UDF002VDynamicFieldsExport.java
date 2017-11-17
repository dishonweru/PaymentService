
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UDF002VDynamicFieldsExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UDF002VDynamicFieldsExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutContinueFromUserDefinedFieldsPfgSetSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutContinueHistUserDefFldHistHistorySn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutContinuePfgTagSetSetupDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutContinuePfgTagSetSetupTagSetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgTagSetSetupDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgTagSetSetupEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgTagSetSetupSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgTagSetSetupSetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgTagSetSetupSetupFormSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedPfgTagSetSetupTagSetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpError" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfUDF002VOutGrpErrorItem" minOccurs="0"/>
 *         &lt;element name="OutGrpFields" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfUDF002VOutGrpFieldsItem" minOccurs="0"/>
 *         &lt;element name="OutGrpHistoryFields" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfUDF002VOutGrpHistoryFieldsItem" minOccurs="0"/>
 *         &lt;element name="OutGrpPermDynamForms" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfUDF002VOutGrpPermDynamFormsItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UDF002VDynamicFieldsExport", propOrder = {
    "outContinueFromUserDefinedFieldsPfgSetSn",
    "outContinueHistUserDefFldHistHistorySn",
    "outContinuePfgTagSetSetupDescription",
    "outContinuePfgTagSetSetupTagSetCode",
    "outSelectedPfgTagSetSetupDescription",
    "outSelectedPfgTagSetSetupEntryStatus",
    "outSelectedPfgTagSetSetupSetDescription",
    "outSelectedPfgTagSetSetupSetType",
    "outSelectedPfgTagSetSetupSetupFormSn",
    "outSelectedPfgTagSetSetupTagSetCode",
    "outGrpError",
    "outGrpFields",
    "outGrpHistoryFields",
    "outGrpPermDynamForms"
})
public class UDF002VDynamicFieldsExport
    extends BaseExport
{

    @XmlElement(name = "OutContinueFromUserDefinedFieldsPfgSetSn")
    protected int outContinueFromUserDefinedFieldsPfgSetSn;
    @XmlElement(name = "OutContinueHistUserDefFldHistHistorySn")
    protected int outContinueHistUserDefFldHistHistorySn;
    @XmlElement(name = "OutContinuePfgTagSetSetupDescription")
    protected String outContinuePfgTagSetSetupDescription;
    @XmlElement(name = "OutContinuePfgTagSetSetupTagSetCode")
    protected String outContinuePfgTagSetSetupTagSetCode;
    @XmlElement(name = "OutSelectedPfgTagSetSetupDescription")
    protected String outSelectedPfgTagSetSetupDescription;
    @XmlElement(name = "OutSelectedPfgTagSetSetupEntryStatus")
    protected String outSelectedPfgTagSetSetupEntryStatus;
    @XmlElement(name = "OutSelectedPfgTagSetSetupSetDescription")
    protected String outSelectedPfgTagSetSetupSetDescription;
    @XmlElement(name = "OutSelectedPfgTagSetSetupSetType")
    protected String outSelectedPfgTagSetSetupSetType;
    @XmlElement(name = "OutSelectedPfgTagSetSetupSetupFormSn")
    protected int outSelectedPfgTagSetSetupSetupFormSn;
    @XmlElement(name = "OutSelectedPfgTagSetSetupTagSetCode")
    protected String outSelectedPfgTagSetSetupTagSetCode;
    @XmlElement(name = "OutGrpError")
    protected ArrayOfUDF002VOutGrpErrorItem outGrpError;
    @XmlElement(name = "OutGrpFields")
    protected ArrayOfUDF002VOutGrpFieldsItem outGrpFields;
    @XmlElement(name = "OutGrpHistoryFields")
    protected ArrayOfUDF002VOutGrpHistoryFieldsItem outGrpHistoryFields;
    @XmlElement(name = "OutGrpPermDynamForms")
    protected ArrayOfUDF002VOutGrpPermDynamFormsItem outGrpPermDynamForms;

    /**
     * Gets the value of the outContinueFromUserDefinedFieldsPfgSetSn property.
     * 
     */
    public int getOutContinueFromUserDefinedFieldsPfgSetSn() {
        return outContinueFromUserDefinedFieldsPfgSetSn;
    }

    /**
     * Sets the value of the outContinueFromUserDefinedFieldsPfgSetSn property.
     * 
     */
    public void setOutContinueFromUserDefinedFieldsPfgSetSn(int value) {
        this.outContinueFromUserDefinedFieldsPfgSetSn = value;
    }

    /**
     * Gets the value of the outContinueHistUserDefFldHistHistorySn property.
     * 
     */
    public int getOutContinueHistUserDefFldHistHistorySn() {
        return outContinueHistUserDefFldHistHistorySn;
    }

    /**
     * Sets the value of the outContinueHistUserDefFldHistHistorySn property.
     * 
     */
    public void setOutContinueHistUserDefFldHistHistorySn(int value) {
        this.outContinueHistUserDefFldHistHistorySn = value;
    }

    /**
     * Gets the value of the outContinuePfgTagSetSetupDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutContinuePfgTagSetSetupDescription() {
        return outContinuePfgTagSetSetupDescription;
    }

    /**
     * Sets the value of the outContinuePfgTagSetSetupDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutContinuePfgTagSetSetupDescription(String value) {
        this.outContinuePfgTagSetSetupDescription = value;
    }

    /**
     * Gets the value of the outContinuePfgTagSetSetupTagSetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutContinuePfgTagSetSetupTagSetCode() {
        return outContinuePfgTagSetSetupTagSetCode;
    }

    /**
     * Sets the value of the outContinuePfgTagSetSetupTagSetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutContinuePfgTagSetSetupTagSetCode(String value) {
        this.outContinuePfgTagSetSetupTagSetCode = value;
    }

    /**
     * Gets the value of the outSelectedPfgTagSetSetupDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgTagSetSetupDescription() {
        return outSelectedPfgTagSetSetupDescription;
    }

    /**
     * Sets the value of the outSelectedPfgTagSetSetupDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgTagSetSetupDescription(String value) {
        this.outSelectedPfgTagSetSetupDescription = value;
    }

    /**
     * Gets the value of the outSelectedPfgTagSetSetupEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgTagSetSetupEntryStatus() {
        return outSelectedPfgTagSetSetupEntryStatus;
    }

    /**
     * Sets the value of the outSelectedPfgTagSetSetupEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgTagSetSetupEntryStatus(String value) {
        this.outSelectedPfgTagSetSetupEntryStatus = value;
    }

    /**
     * Gets the value of the outSelectedPfgTagSetSetupSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgTagSetSetupSetDescription() {
        return outSelectedPfgTagSetSetupSetDescription;
    }

    /**
     * Sets the value of the outSelectedPfgTagSetSetupSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgTagSetSetupSetDescription(String value) {
        this.outSelectedPfgTagSetSetupSetDescription = value;
    }

    /**
     * Gets the value of the outSelectedPfgTagSetSetupSetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgTagSetSetupSetType() {
        return outSelectedPfgTagSetSetupSetType;
    }

    /**
     * Sets the value of the outSelectedPfgTagSetSetupSetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgTagSetSetupSetType(String value) {
        this.outSelectedPfgTagSetSetupSetType = value;
    }

    /**
     * Gets the value of the outSelectedPfgTagSetSetupSetupFormSn property.
     * 
     */
    public int getOutSelectedPfgTagSetSetupSetupFormSn() {
        return outSelectedPfgTagSetSetupSetupFormSn;
    }

    /**
     * Sets the value of the outSelectedPfgTagSetSetupSetupFormSn property.
     * 
     */
    public void setOutSelectedPfgTagSetSetupSetupFormSn(int value) {
        this.outSelectedPfgTagSetSetupSetupFormSn = value;
    }

    /**
     * Gets the value of the outSelectedPfgTagSetSetupTagSetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgTagSetSetupTagSetCode() {
        return outSelectedPfgTagSetSetupTagSetCode;
    }

    /**
     * Sets the value of the outSelectedPfgTagSetSetupTagSetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgTagSetSetupTagSetCode(String value) {
        this.outSelectedPfgTagSetSetupTagSetCode = value;
    }

    /**
     * Gets the value of the outGrpError property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUDF002VOutGrpErrorItem }
     *     
     */
    public ArrayOfUDF002VOutGrpErrorItem getOutGrpError() {
        return outGrpError;
    }

    /**
     * Sets the value of the outGrpError property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUDF002VOutGrpErrorItem }
     *     
     */
    public void setOutGrpError(ArrayOfUDF002VOutGrpErrorItem value) {
        this.outGrpError = value;
    }

    /**
     * Gets the value of the outGrpFields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUDF002VOutGrpFieldsItem }
     *     
     */
    public ArrayOfUDF002VOutGrpFieldsItem getOutGrpFields() {
        return outGrpFields;
    }

    /**
     * Sets the value of the outGrpFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUDF002VOutGrpFieldsItem }
     *     
     */
    public void setOutGrpFields(ArrayOfUDF002VOutGrpFieldsItem value) {
        this.outGrpFields = value;
    }

    /**
     * Gets the value of the outGrpHistoryFields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUDF002VOutGrpHistoryFieldsItem }
     *     
     */
    public ArrayOfUDF002VOutGrpHistoryFieldsItem getOutGrpHistoryFields() {
        return outGrpHistoryFields;
    }

    /**
     * Sets the value of the outGrpHistoryFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUDF002VOutGrpHistoryFieldsItem }
     *     
     */
    public void setOutGrpHistoryFields(ArrayOfUDF002VOutGrpHistoryFieldsItem value) {
        this.outGrpHistoryFields = value;
    }

    /**
     * Gets the value of the outGrpPermDynamForms property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUDF002VOutGrpPermDynamFormsItem }
     *     
     */
    public ArrayOfUDF002VOutGrpPermDynamFormsItem getOutGrpPermDynamForms() {
        return outGrpPermDynamForms;
    }

    /**
     * Sets the value of the outGrpPermDynamForms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUDF002VOutGrpPermDynamFormsItem }
     *     
     */
    public void setOutGrpPermDynamForms(ArrayOfUDF002VOutGrpPermDynamFormsItem value) {
        this.outGrpPermDynamForms = value;
    }

}
