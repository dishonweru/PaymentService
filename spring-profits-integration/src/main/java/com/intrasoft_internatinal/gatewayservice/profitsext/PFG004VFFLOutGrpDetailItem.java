
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PFG004VFFLOutGrpDetailItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PFG004VFFLOutGrpDetailItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpDetailOutGrmPfgSetupValuesTagSetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailOutGrmPfgSetupValuesTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailOutGrmPfgSetupValuesSetSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpDetailOutGrmPfgSetupValuesInternalSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpDetailOutGrmPfgSetupValuesSubtagSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpDetailOutGrmPfgSetupValuesNeedsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailOutGrmPfgSetupValuesManipulateTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailOutGrmPfgSetupValuesManipulateTag2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailOutGrmPfgSetupValuesManipulateSubtag" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpDetailOutGrmPfgSetupValuesPredefinedValues" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailOutGrmPfgSetupValuesAdditionalSwift" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailOutGrmPfgSetupValuesNumericFunction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailOutGrmPfgSetupValuesNumericResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailOutGrmPfgSetupValuesCharFunction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailOutGrmPfgSetupValuesCharText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailOutGrmPfgSetupValuesAllowValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailOutGrmPfgSetupValuesGenOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailOutGrmPfgSetupValuesManipulateSubtag2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpDetailOutGrmPfgSetupValuesSetCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PFG004VFFLOutGrpDetailItem", propOrder = {
    "outGrpDetailOutGrmPfgSetupValuesTagSetCode",
    "outGrpDetailOutGrmPfgSetupValuesTag",
    "outGrpDetailOutGrmPfgSetupValuesSetSn",
    "outGrpDetailOutGrmPfgSetupValuesInternalSn",
    "outGrpDetailOutGrmPfgSetupValuesSubtagSn",
    "outGrpDetailOutGrmPfgSetupValuesNeedsType",
    "outGrpDetailOutGrmPfgSetupValuesManipulateTag",
    "outGrpDetailOutGrmPfgSetupValuesManipulateTag2",
    "outGrpDetailOutGrmPfgSetupValuesManipulateSubtag",
    "outGrpDetailOutGrmPfgSetupValuesPredefinedValues",
    "outGrpDetailOutGrmPfgSetupValuesAdditionalSwift",
    "outGrpDetailOutGrmPfgSetupValuesNumericFunction",
    "outGrpDetailOutGrmPfgSetupValuesNumericResult",
    "outGrpDetailOutGrmPfgSetupValuesCharFunction",
    "outGrpDetailOutGrmPfgSetupValuesCharText",
    "outGrpDetailOutGrmPfgSetupValuesAllowValue",
    "outGrpDetailOutGrmPfgSetupValuesGenOption",
    "outGrpDetailOutGrmPfgSetupValuesManipulateSubtag2",
    "outGrpDetailOutGrmPfgSetupValuesSetCategory"
})
public class PFG004VFFLOutGrpDetailItem {

    @XmlElement(name = "OutGrpDetailOutGrmPfgSetupValuesTagSetCode")
    protected String outGrpDetailOutGrmPfgSetupValuesTagSetCode;
    @XmlElement(name = "OutGrpDetailOutGrmPfgSetupValuesTag")
    protected String outGrpDetailOutGrmPfgSetupValuesTag;
    @XmlElement(name = "OutGrpDetailOutGrmPfgSetupValuesSetSn")
    protected int outGrpDetailOutGrmPfgSetupValuesSetSn;
    @XmlElement(name = "OutGrpDetailOutGrmPfgSetupValuesInternalSn")
    protected int outGrpDetailOutGrmPfgSetupValuesInternalSn;
    @XmlElement(name = "OutGrpDetailOutGrmPfgSetupValuesSubtagSn")
    protected short outGrpDetailOutGrmPfgSetupValuesSubtagSn;
    @XmlElement(name = "OutGrpDetailOutGrmPfgSetupValuesNeedsType")
    protected String outGrpDetailOutGrmPfgSetupValuesNeedsType;
    @XmlElement(name = "OutGrpDetailOutGrmPfgSetupValuesManipulateTag")
    protected String outGrpDetailOutGrmPfgSetupValuesManipulateTag;
    @XmlElement(name = "OutGrpDetailOutGrmPfgSetupValuesManipulateTag2")
    protected String outGrpDetailOutGrmPfgSetupValuesManipulateTag2;
    @XmlElement(name = "OutGrpDetailOutGrmPfgSetupValuesManipulateSubtag")
    protected short outGrpDetailOutGrmPfgSetupValuesManipulateSubtag;
    @XmlElement(name = "OutGrpDetailOutGrmPfgSetupValuesPredefinedValues")
    protected String outGrpDetailOutGrmPfgSetupValuesPredefinedValues;
    @XmlElement(name = "OutGrpDetailOutGrmPfgSetupValuesAdditionalSwift")
    protected String outGrpDetailOutGrmPfgSetupValuesAdditionalSwift;
    @XmlElement(name = "OutGrpDetailOutGrmPfgSetupValuesNumericFunction")
    protected String outGrpDetailOutGrmPfgSetupValuesNumericFunction;
    @XmlElement(name = "OutGrpDetailOutGrmPfgSetupValuesNumericResult")
    protected String outGrpDetailOutGrmPfgSetupValuesNumericResult;
    @XmlElement(name = "OutGrpDetailOutGrmPfgSetupValuesCharFunction")
    protected String outGrpDetailOutGrmPfgSetupValuesCharFunction;
    @XmlElement(name = "OutGrpDetailOutGrmPfgSetupValuesCharText")
    protected String outGrpDetailOutGrmPfgSetupValuesCharText;
    @XmlElement(name = "OutGrpDetailOutGrmPfgSetupValuesAllowValue")
    protected String outGrpDetailOutGrmPfgSetupValuesAllowValue;
    @XmlElement(name = "OutGrpDetailOutGrmPfgSetupValuesGenOption")
    protected String outGrpDetailOutGrmPfgSetupValuesGenOption;
    @XmlElement(name = "OutGrpDetailOutGrmPfgSetupValuesManipulateSubtag2")
    protected short outGrpDetailOutGrmPfgSetupValuesManipulateSubtag2;
    @XmlElement(name = "OutGrpDetailOutGrmPfgSetupValuesSetCategory")
    protected String outGrpDetailOutGrmPfgSetupValuesSetCategory;

    /**
     * Gets the value of the outGrpDetailOutGrmPfgSetupValuesTagSetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailOutGrmPfgSetupValuesTagSetCode() {
        return outGrpDetailOutGrmPfgSetupValuesTagSetCode;
    }

    /**
     * Sets the value of the outGrpDetailOutGrmPfgSetupValuesTagSetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailOutGrmPfgSetupValuesTagSetCode(String value) {
        this.outGrpDetailOutGrmPfgSetupValuesTagSetCode = value;
    }

    /**
     * Gets the value of the outGrpDetailOutGrmPfgSetupValuesTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailOutGrmPfgSetupValuesTag() {
        return outGrpDetailOutGrmPfgSetupValuesTag;
    }

    /**
     * Sets the value of the outGrpDetailOutGrmPfgSetupValuesTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailOutGrmPfgSetupValuesTag(String value) {
        this.outGrpDetailOutGrmPfgSetupValuesTag = value;
    }

    /**
     * Gets the value of the outGrpDetailOutGrmPfgSetupValuesSetSn property.
     * 
     */
    public int getOutGrpDetailOutGrmPfgSetupValuesSetSn() {
        return outGrpDetailOutGrmPfgSetupValuesSetSn;
    }

    /**
     * Sets the value of the outGrpDetailOutGrmPfgSetupValuesSetSn property.
     * 
     */
    public void setOutGrpDetailOutGrmPfgSetupValuesSetSn(int value) {
        this.outGrpDetailOutGrmPfgSetupValuesSetSn = value;
    }

    /**
     * Gets the value of the outGrpDetailOutGrmPfgSetupValuesInternalSn property.
     * 
     */
    public int getOutGrpDetailOutGrmPfgSetupValuesInternalSn() {
        return outGrpDetailOutGrmPfgSetupValuesInternalSn;
    }

    /**
     * Sets the value of the outGrpDetailOutGrmPfgSetupValuesInternalSn property.
     * 
     */
    public void setOutGrpDetailOutGrmPfgSetupValuesInternalSn(int value) {
        this.outGrpDetailOutGrmPfgSetupValuesInternalSn = value;
    }

    /**
     * Gets the value of the outGrpDetailOutGrmPfgSetupValuesSubtagSn property.
     * 
     */
    public short getOutGrpDetailOutGrmPfgSetupValuesSubtagSn() {
        return outGrpDetailOutGrmPfgSetupValuesSubtagSn;
    }

    /**
     * Sets the value of the outGrpDetailOutGrmPfgSetupValuesSubtagSn property.
     * 
     */
    public void setOutGrpDetailOutGrmPfgSetupValuesSubtagSn(short value) {
        this.outGrpDetailOutGrmPfgSetupValuesSubtagSn = value;
    }

    /**
     * Gets the value of the outGrpDetailOutGrmPfgSetupValuesNeedsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailOutGrmPfgSetupValuesNeedsType() {
        return outGrpDetailOutGrmPfgSetupValuesNeedsType;
    }

    /**
     * Sets the value of the outGrpDetailOutGrmPfgSetupValuesNeedsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailOutGrmPfgSetupValuesNeedsType(String value) {
        this.outGrpDetailOutGrmPfgSetupValuesNeedsType = value;
    }

    /**
     * Gets the value of the outGrpDetailOutGrmPfgSetupValuesManipulateTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailOutGrmPfgSetupValuesManipulateTag() {
        return outGrpDetailOutGrmPfgSetupValuesManipulateTag;
    }

    /**
     * Sets the value of the outGrpDetailOutGrmPfgSetupValuesManipulateTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailOutGrmPfgSetupValuesManipulateTag(String value) {
        this.outGrpDetailOutGrmPfgSetupValuesManipulateTag = value;
    }

    /**
     * Gets the value of the outGrpDetailOutGrmPfgSetupValuesManipulateTag2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailOutGrmPfgSetupValuesManipulateTag2() {
        return outGrpDetailOutGrmPfgSetupValuesManipulateTag2;
    }

    /**
     * Sets the value of the outGrpDetailOutGrmPfgSetupValuesManipulateTag2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailOutGrmPfgSetupValuesManipulateTag2(String value) {
        this.outGrpDetailOutGrmPfgSetupValuesManipulateTag2 = value;
    }

    /**
     * Gets the value of the outGrpDetailOutGrmPfgSetupValuesManipulateSubtag property.
     * 
     */
    public short getOutGrpDetailOutGrmPfgSetupValuesManipulateSubtag() {
        return outGrpDetailOutGrmPfgSetupValuesManipulateSubtag;
    }

    /**
     * Sets the value of the outGrpDetailOutGrmPfgSetupValuesManipulateSubtag property.
     * 
     */
    public void setOutGrpDetailOutGrmPfgSetupValuesManipulateSubtag(short value) {
        this.outGrpDetailOutGrmPfgSetupValuesManipulateSubtag = value;
    }

    /**
     * Gets the value of the outGrpDetailOutGrmPfgSetupValuesPredefinedValues property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailOutGrmPfgSetupValuesPredefinedValues() {
        return outGrpDetailOutGrmPfgSetupValuesPredefinedValues;
    }

    /**
     * Sets the value of the outGrpDetailOutGrmPfgSetupValuesPredefinedValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailOutGrmPfgSetupValuesPredefinedValues(String value) {
        this.outGrpDetailOutGrmPfgSetupValuesPredefinedValues = value;
    }

    /**
     * Gets the value of the outGrpDetailOutGrmPfgSetupValuesAdditionalSwift property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailOutGrmPfgSetupValuesAdditionalSwift() {
        return outGrpDetailOutGrmPfgSetupValuesAdditionalSwift;
    }

    /**
     * Sets the value of the outGrpDetailOutGrmPfgSetupValuesAdditionalSwift property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailOutGrmPfgSetupValuesAdditionalSwift(String value) {
        this.outGrpDetailOutGrmPfgSetupValuesAdditionalSwift = value;
    }

    /**
     * Gets the value of the outGrpDetailOutGrmPfgSetupValuesNumericFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailOutGrmPfgSetupValuesNumericFunction() {
        return outGrpDetailOutGrmPfgSetupValuesNumericFunction;
    }

    /**
     * Sets the value of the outGrpDetailOutGrmPfgSetupValuesNumericFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailOutGrmPfgSetupValuesNumericFunction(String value) {
        this.outGrpDetailOutGrmPfgSetupValuesNumericFunction = value;
    }

    /**
     * Gets the value of the outGrpDetailOutGrmPfgSetupValuesNumericResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailOutGrmPfgSetupValuesNumericResult() {
        return outGrpDetailOutGrmPfgSetupValuesNumericResult;
    }

    /**
     * Sets the value of the outGrpDetailOutGrmPfgSetupValuesNumericResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailOutGrmPfgSetupValuesNumericResult(String value) {
        this.outGrpDetailOutGrmPfgSetupValuesNumericResult = value;
    }

    /**
     * Gets the value of the outGrpDetailOutGrmPfgSetupValuesCharFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailOutGrmPfgSetupValuesCharFunction() {
        return outGrpDetailOutGrmPfgSetupValuesCharFunction;
    }

    /**
     * Sets the value of the outGrpDetailOutGrmPfgSetupValuesCharFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailOutGrmPfgSetupValuesCharFunction(String value) {
        this.outGrpDetailOutGrmPfgSetupValuesCharFunction = value;
    }

    /**
     * Gets the value of the outGrpDetailOutGrmPfgSetupValuesCharText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailOutGrmPfgSetupValuesCharText() {
        return outGrpDetailOutGrmPfgSetupValuesCharText;
    }

    /**
     * Sets the value of the outGrpDetailOutGrmPfgSetupValuesCharText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailOutGrmPfgSetupValuesCharText(String value) {
        this.outGrpDetailOutGrmPfgSetupValuesCharText = value;
    }

    /**
     * Gets the value of the outGrpDetailOutGrmPfgSetupValuesAllowValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailOutGrmPfgSetupValuesAllowValue() {
        return outGrpDetailOutGrmPfgSetupValuesAllowValue;
    }

    /**
     * Sets the value of the outGrpDetailOutGrmPfgSetupValuesAllowValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailOutGrmPfgSetupValuesAllowValue(String value) {
        this.outGrpDetailOutGrmPfgSetupValuesAllowValue = value;
    }

    /**
     * Gets the value of the outGrpDetailOutGrmPfgSetupValuesGenOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailOutGrmPfgSetupValuesGenOption() {
        return outGrpDetailOutGrmPfgSetupValuesGenOption;
    }

    /**
     * Sets the value of the outGrpDetailOutGrmPfgSetupValuesGenOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailOutGrmPfgSetupValuesGenOption(String value) {
        this.outGrpDetailOutGrmPfgSetupValuesGenOption = value;
    }

    /**
     * Gets the value of the outGrpDetailOutGrmPfgSetupValuesManipulateSubtag2 property.
     * 
     */
    public short getOutGrpDetailOutGrmPfgSetupValuesManipulateSubtag2() {
        return outGrpDetailOutGrmPfgSetupValuesManipulateSubtag2;
    }

    /**
     * Sets the value of the outGrpDetailOutGrmPfgSetupValuesManipulateSubtag2 property.
     * 
     */
    public void setOutGrpDetailOutGrmPfgSetupValuesManipulateSubtag2(short value) {
        this.outGrpDetailOutGrmPfgSetupValuesManipulateSubtag2 = value;
    }

    /**
     * Gets the value of the outGrpDetailOutGrmPfgSetupValuesSetCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailOutGrmPfgSetupValuesSetCategory() {
        return outGrpDetailOutGrmPfgSetupValuesSetCategory;
    }

    /**
     * Sets the value of the outGrpDetailOutGrmPfgSetupValuesSetCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailOutGrmPfgSetupValuesSetCategory(String value) {
        this.outGrpDetailOutGrmPfgSetupValuesSetCategory = value;
    }

}
